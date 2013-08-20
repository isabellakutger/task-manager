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

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.09.16 at 09:35:20 PM CEST 
//


package org.oasis_open.docs.ns.bpel4people.ws_humantask._200803;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tLeanTask complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="tLeanTask">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/200803}tTaskBase">
 *       &lt;sequence>
 *         &lt;element name="documentation" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/200803}tDocumentation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="interface" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/200803}tTaskInterface" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="messageSchema" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/200803}tMessageSchema"/>
 *         &lt;element name="priority" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/200803}tPriority-expr" minOccurs="0"/>
 *         &lt;element name="peopleAssignments" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/200803}tPeopleAssignments" minOccurs="0"/>
 *         &lt;element name="delegation" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/200803}tDelegation" minOccurs="0"/>
 *         &lt;element name="presentationElements" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/200803}tPresentationElements" minOccurs="0"/>
 *         &lt;element name="outcome" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/200803}tQuery" minOccurs="0"/>
 *         &lt;element name="searchBy" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/200803}tExpression" minOccurs="0"/>
 *         &lt;element name="renderings" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/200803}tRenderings" minOccurs="0"/>
 *         &lt;element name="deadlines" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/200803}tDeadlines" minOccurs="0"/>
 *         &lt;element name="composition" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/200803}tComposition" maxOccurs="0" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="actualOwnerRequired" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/200803}tBoolean" default="yes" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tLeanTask")
public class TLeanTask
        extends TTaskBase {


}
