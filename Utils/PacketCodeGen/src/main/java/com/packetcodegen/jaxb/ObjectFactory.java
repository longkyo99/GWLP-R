//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.04.13 at 01:53:40 PM CEST 
//


package com.packetcodegen.jaxb;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.packetcodegen.jaxb package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.packetcodegen.jaxb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Packets }
     * 
     */
    public Packets createPackets() {
        return new Packets();
    }

    /**
     * Create an instance of {@link CommunicationDirection }
     * 
     */
    public CommunicationDirection createCommunicationDirection() {
        return new CommunicationDirection();
    }

    /**
     * Create an instance of {@link MetaInfo }
     * 
     */
    public MetaInfo createMetaInfo() {
        return new MetaInfo();
    }

    /**
     * Create an instance of {@link ArrayInfo }
     * 
     */
    public ArrayInfo createArrayInfo() {
        return new ArrayInfo();
    }

    /**
     * Create an instance of {@link PacketNestedType }
     * 
     */
    public PacketNestedType createPacketNestedType() {
        return new PacketNestedType();
    }

    /**
     * Create an instance of {@link PacketFieldType }
     * 
     */
    public PacketFieldType createPacketFieldType() {
        return new PacketFieldType();
    }

    /**
     * Create an instance of {@link PacketType }
     * 
     */
    public PacketType createPacketType() {
        return new PacketType();
    }

}
