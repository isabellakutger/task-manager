/*
 * Copyright 2012 Bangkok Project Team, GRIDSOLUT GmbH + Co.KG, and
 * University of Stuttgart (Institute of Architecture of Application Systems)
 * All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.htm.exceptions;

import com.htm.query.IQuery;

public class InvalidQueryResultException extends HumanTaskManagerException {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public InvalidQueryResultException(String message) {
        super(message);
    }

    public InvalidQueryResultException(IQuery failedQuery, Class<?> expected) {
        super("The following query returned an invalid result set.\n "
                + "Query: "
                + failedQuery.getQuery()
                + "\n Query language: "
                + failedQuery.getQueryLanguage()
                + "\n Expected result type: "
                + expected.getName());

    }


}
