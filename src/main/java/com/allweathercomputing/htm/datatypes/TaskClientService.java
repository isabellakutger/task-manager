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

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.5-b04
 * Generated source version: 2.2
 */
@WebServiceClient(name = "TaskClientService", targetNamespace = "http://htm.allweathercomputing.com/datatypes", wsdlLocation = "file:/C:/odeschool/workspaces/taskmanager_test/TaskManagerTest/wsdl/TaskClient.wsdl")
public class TaskClientService
        extends Service {

    private final static URL TASKCLIENTSERVICE_WSDL_LOCATION;
    private final static WebServiceException TASKCLIENTSERVICE_EXCEPTION;
    private final static QName TASKCLIENTSERVICE_QNAME = new QName("http://htm.allweathercomputing.com/datatypes", "TaskClientService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/odeschool/workspaces/taskmanager_test/TaskManagerTest/wsdl/TaskClient.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        TASKCLIENTSERVICE_WSDL_LOCATION = url;
        TASKCLIENTSERVICE_EXCEPTION = e;
    }

    public TaskClientService() {
        super(__getWsdlLocation(), TASKCLIENTSERVICE_QNAME);
    }

    public TaskClientService(WebServiceFeature... features) {
        super(__getWsdlLocation(), TASKCLIENTSERVICE_QNAME, features);
    }

    public TaskClientService(URL wsdlLocation) {
        super(wsdlLocation, TASKCLIENTSERVICE_QNAME);
    }

    public TaskClientService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, TASKCLIENTSERVICE_QNAME, features);
    }

    public TaskClientService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TaskClientService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * @return returns TaskClient
     */
    @WebEndpoint(name = "TaskClientPort")
    public TaskClient getTaskClientPort() {
        return super.getPort(new QName("http://htm.allweathercomputing.com/datatypes", "TaskClientPort"), TaskClient.class);
    }

    /**
     * @param features A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return returns TaskClient
     */
    @WebEndpoint(name = "TaskClientPort")
    public TaskClient getTaskClientPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://htm.allweathercomputing.com/datatypes", "TaskClientPort"), TaskClient.class, features);
    }

    private static URL __getWsdlLocation() {
        if (TASKCLIENTSERVICE_EXCEPTION != null) {
            throw TASKCLIENTSERVICE_EXCEPTION;
        }
        return TASKCLIENTSERVICE_WSDL_LOCATION;
    }

}
