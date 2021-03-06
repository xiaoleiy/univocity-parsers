/*******************************************************************************
 * Copyright 2014 uniVocity Software Pty Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package com.univocity.parsers.common.fields;

import static org.testng.Assert.*;

import org.testng.annotations.*;

public class ExcludeIndexSelectorTest {

	@Test
	public void getFieldsToExtract() {
		ExcludeFieldIndexSelector selector = new ExcludeFieldIndexSelector();
		selector.add(3, 0);

		int[] indexes = selector.getFieldIndexes(new String[] { null, null, null, null, null, null });

		int[] expected = new int[] { 1, 2, 4, 5 };

		assertEquals(indexes, expected);
	}
}
