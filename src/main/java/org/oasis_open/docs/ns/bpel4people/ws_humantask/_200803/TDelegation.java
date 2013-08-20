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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tDelegation complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="tDelegation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/200803}tExtensibleElements">
 *       &lt;sequence>
 *         &lt;element name="from" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/200803}tFrom" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="potentialDelegatees" use="required" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/200803}tPotentialDelegatees" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tDelegation", propOrder = {
        "from"
})
public class TDelegation
        extends TExtensibleElements {

    protected TFrom from;
    @XmlAttribute(name = "potentialDelegatees", required = true)
    protected TPotentialDelegatees potentialDelegatees;

    /**
     * Gets the value of the from property.
     *
     * @return possible object is
     *         {@link TFrom }
     */
    public TFrom getFrom() {
        return from;
    }

    /**
     * Sets the value of the from property.
     *
     * @param value allowed object is
     *              {@link TFrom }
     */
    public void setFrom(TFrom value) {
        this.from = value;
    }

    /**
     * Gets the value of the potentialDelegatees property.
     *
     * @return possible object is
     *         {@link TPotentialDelegatees }
     */
    public TPotentialDelegatees getPotentialDelegatees() {
        return potentialDelegatees;
    }

    /**
     * Sets the value of the potentialDelegatees property.
     *
     * @param value allowed object is
     *              {@link TPotentialDelegatees }
     */
    public void setPotentialDelegatees(TPotentialDelegatees value) {
        this.potentialDelegatees = value;
    }

}
