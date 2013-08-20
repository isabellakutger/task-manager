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

package com.allweathercomputing.htm.datatypes;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.5-b04
 * Generated source version: 2.2
 */
@WebService(name = "TaskClient", targetNamespace = "http://htm.allweathercomputing.com/datatypes")
@XmlSeeAlso({
        ObjectFactory.class
})
public interface TaskClient {


    /**
     * @param modelName
     * @param instanceName
     * @param inputData
     * @return returns java.lang.String
     * @throws Exception
     */
    @WebMethod(action = "http://htm.allweathercomputing.com/datatypes/createTaskInstance")
    @WebResult(name = "tiid", targetNamespace = "")
    @RequestWrapper(localName = "createTaskInstance", targetNamespace = "http://htm.allweathercomputing.com/datatypes", className = "com.allweathercomputing.htm.datatypes.CreateTaskInstance")
    @ResponseWrapper(localName = "createTaskInstanceResponse", targetNamespace = "http://htm.allweathercomputing.com/datatypes", className = "com.allweathercomputing.htm.datatypes.CreateTaskInstanceResponse")
    public String createTaskInstance(
            @WebParam(name = "modelName", targetNamespace = "")
            String modelName,
            @WebParam(name = "instanceName", targetNamespace = "")
            String instanceName,
            @WebParam(name = "inputData", targetNamespace = "")
            Object inputData) throws Exception;

    @WebMethod(action = "http://htm.allweathercomputing.com/datatypes/deployTaskModel")
    @WebResult(name = "taskModelName")
    public String deployTaskModel(@WebParam(name = "taskModel") Object taskModel) throws Exception;

}
