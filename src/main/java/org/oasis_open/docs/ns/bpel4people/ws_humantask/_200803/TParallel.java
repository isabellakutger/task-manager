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

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tParallel complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="tParallel">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/200803}tExtensibleElements">
 *       &lt;sequence>
 *         &lt;element name="completionBehavior" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/200803}tCompletionBehavior" minOccurs="0"/>
 *         &lt;element name="from" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/200803}tFrom" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="parallel" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/200803}tParallel"/>
 *           &lt;element name="sequence" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/200803}tSequence"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="type" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/200803}tRoutingPatternType" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tParallel", propOrder = {
        "completionBehavior",
        "from",
        "parallelOrSequence"
})
public class TParallel
        extends TExtensibleElements {

    protected TCompletionBehavior completionBehavior;
    protected List<TFrom> from;
    @XmlElements({
            @XmlElement(name = "parallel", type = TParallel.class),
            @XmlElement(name = "sequence", type = TSequence.class)
    })
    protected List<TExtensibleElements> parallelOrSequence;
    @XmlAttribute(name = "type")
    protected TRoutingPatternType type;

    /**
     * Gets the value of the completionBehavior property.
     *
     * @return possible object is
     *         {@link TCompletionBehavior }
     */
    public TCompletionBehavior getCompletionBehavior() {
        return completionBehavior;
    }

    /**
     * Sets the value of the completionBehavior property.
     *
     * @param value allowed object is
     *              {@link TCompletionBehavior }
     */
    public void setCompletionBehavior(TCompletionBehavior value) {
        this.completionBehavior = value;
    }

    /**
     * Gets the value of the from property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the from property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFrom().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link TFrom }
     */
    public List<TFrom> getFrom() {
        if (from == null) {
            from = new ArrayList<TFrom>();
        }
        return this.from;
    }

    /**
     * Gets the value of the parallelOrSequence property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parallelOrSequence property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParallelOrSequence().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link TParallel }
     * {@link TSequence }
     */
    public List<TExtensibleElements> getParallelOrSequence() {
        if (parallelOrSequence == null) {
            parallelOrSequence = new ArrayList<TExtensibleElements>();
        }
        return this.parallelOrSequence;
    }

    /**
     * Gets the value of the type property.
     *
     * @return possible object is
     *         {@link TRoutingPatternType }
     */
    public TRoutingPatternType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     *
     * @param value allowed object is
     *              {@link TRoutingPatternType }
     */
    public void setType(TRoutingPatternType value) {
        this.type = value;
    }

}
