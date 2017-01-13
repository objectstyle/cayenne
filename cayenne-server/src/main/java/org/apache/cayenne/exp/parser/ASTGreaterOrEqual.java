/*****************************************************************
 *   Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 ****************************************************************/

package org.apache.cayenne.exp.parser;

import org.apache.cayenne.exp.Expression;

/**
 * "Greater Than Or Equal To" expression.
 * 
 * @since 1.1
 */
public class ASTGreaterOrEqual extends ConditionNode {

	private static final long serialVersionUID = -2926530926896058935L;

	/**
	 * Constructor used by expression parser. Do not invoke directly.
	 */
	ASTGreaterOrEqual(int id) {
		super(id);
	}

	public ASTGreaterOrEqual() {
		super(ExpressionParserTreeConstants.JJTGREATEROREQUAL);
	}

	public ASTGreaterOrEqual(SimpleNode path, Object value) {
		super(ExpressionParserTreeConstants.JJTGREATEROREQUAL);
		jjtAddChild(path, 0);
		jjtAddChild(new ASTScalar(value), 1);
		connectChildren();
	}

	@Override
	protected Object evaluateNode(Object o) throws Exception {
		int len = jjtGetNumChildren();
		if (len != 2) {
			return Boolean.FALSE;
		}

		Object o1 = evaluateChild(0, o);
		Object o2 = evaluateChild(1, o);
		Integer c = Evaluator.evaluator(o1).compare(o1, o2);

		return c != null && c >= 0 ? Boolean.TRUE : Boolean.FALSE;
	}

	/**
	 * Creates a copy of this expression node, without copying children.
	 */
	@Override
	public Expression shallowCopy() {
		return new ASTGreaterOrEqual(id);
	}

	@Override
	protected String getExpressionOperator(int index) {
		return ">=";
	}

	@Override
	public int getType() {
		return Expression.GREATER_THAN_EQUAL_TO;
	}
}
