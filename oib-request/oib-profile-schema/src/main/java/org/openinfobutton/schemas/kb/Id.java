//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.01 at 10:57:27 AM MST 
//


package org.openinfobutton.schemas.kb;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.kscs.util.jaxb.Buildable;
import com.kscs.util.jaxb.PropertyTree;
import com.kscs.util.jaxb.PropertyTreeUse;


/**
 * <p>Java class for Id complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Id"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="namespace" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Id")
@XmlSeeAlso({
    org.openinfobutton.schemas.kb.ProfileDefinition.AuthorizedOrganizations.AuthorizedOrganization.class
})
public class Id {

    @XmlAttribute(name = "id", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String id;
    @XmlAttribute(name = "name")
    @XmlSchemaType(name = "anySimpleType")
    protected String name;
    @XmlAttribute(name = "namespace")
    @XmlSchemaType(name = "anySimpleType")
    protected String namespace;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the namespace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamespace() {
        return namespace;
    }

    /**
     * Sets the value of the namespace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamespace(String value) {
        this.namespace = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final Id.Builder<_B> _other) {
        _other.id = this.id;
        _other.name = this.name;
        _other.namespace = this.namespace;
    }

    public<_B >Id.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new Id.Builder<_B>(_parentBuilder, this, true);
    }

    public Id.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static Id.Builder<Void> builder() {
        return new Id.Builder<Void>(null, null, false);
    }

    public static<_B >Id.Builder<_B> copyOf(final Id _other) {
        final Id.Builder<_B> _newBuilder = new Id.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final Id.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree idPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("id"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(idPropertyTree!= null):((idPropertyTree == null)||(!idPropertyTree.isLeaf())))) {
            _other.id = this.id;
        }
        final PropertyTree namePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("name"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(namePropertyTree!= null):((namePropertyTree == null)||(!namePropertyTree.isLeaf())))) {
            _other.name = this.name;
        }
        final PropertyTree namespacePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("namespace"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(namespacePropertyTree!= null):((namespacePropertyTree == null)||(!namespacePropertyTree.isLeaf())))) {
            _other.namespace = this.namespace;
        }
    }

    public<_B >Id.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new Id.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public Id.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >Id.Builder<_B> copyOf(final Id _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final Id.Builder<_B> _newBuilder = new Id.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static Id.Builder<Void> copyExcept(final Id _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static Id.Builder<Void> copyOnly(final Id _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final Id _storedValue;
        private String id;
        private String name;
        private String namespace;

        public Builder(final _B _parentBuilder, final Id _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.id = _other.id;
                    this.name = _other.name;
                    this.namespace = _other.namespace;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final Id _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree idPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("id"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(idPropertyTree!= null):((idPropertyTree == null)||(!idPropertyTree.isLeaf())))) {
                        this.id = _other.id;
                    }
                    final PropertyTree namePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("name"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(namePropertyTree!= null):((namePropertyTree == null)||(!namePropertyTree.isLeaf())))) {
                        this.name = _other.name;
                    }
                    final PropertyTree namespacePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("namespace"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(namespacePropertyTree!= null):((namespacePropertyTree == null)||(!namespacePropertyTree.isLeaf())))) {
                        this.namespace = _other.namespace;
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public _B end() {
            return this._parentBuilder;
        }

        protected<_P extends Id >_P init(final _P _product) {
            _product.id = this.id;
            _product.name = this.name;
            _product.namespace = this.namespace;
            return _product;
        }

        /**
         * Sets the new value of "id" (any previous value will be replaced)
         * 
         * @param id
         *     New value of the "id" property.
         */
        public Id.Builder<_B> withId(final String id) {
            this.id = id;
            return this;
        }

        /**
         * Sets the new value of "name" (any previous value will be replaced)
         * 
         * @param name
         *     New value of the "name" property.
         */
        public Id.Builder<_B> withName(final String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the new value of "namespace" (any previous value will be replaced)
         * 
         * @param namespace
         *     New value of the "namespace" property.
         */
        public Id.Builder<_B> withNamespace(final String namespace) {
            this.namespace = namespace;
            return this;
        }

        @Override
        public Id build() {
            if (_storedValue == null) {
                return this.init(new Id());
            } else {
                return ((Id) _storedValue);
            }
        }

    }

    public static class Select
        extends Id.Selector<Id.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static Id.Select _root() {
            return new Id.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, Id.Selector<TRoot, TParent>> id = null;
        private com.kscs.util.jaxb.Selector<TRoot, Id.Selector<TRoot, TParent>> name = null;
        private com.kscs.util.jaxb.Selector<TRoot, Id.Selector<TRoot, TParent>> namespace = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.id!= null) {
                products.put("id", this.id.init());
            }
            if (this.name!= null) {
                products.put("name", this.name.init());
            }
            if (this.namespace!= null) {
                products.put("namespace", this.namespace.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, Id.Selector<TRoot, TParent>> id() {
            return ((this.id == null)?this.id = new com.kscs.util.jaxb.Selector<TRoot, Id.Selector<TRoot, TParent>>(this._root, this, "id"):this.id);
        }

        public com.kscs.util.jaxb.Selector<TRoot, Id.Selector<TRoot, TParent>> name() {
            return ((this.name == null)?this.name = new com.kscs.util.jaxb.Selector<TRoot, Id.Selector<TRoot, TParent>>(this._root, this, "name"):this.name);
        }

        public com.kscs.util.jaxb.Selector<TRoot, Id.Selector<TRoot, TParent>> namespace() {
            return ((this.namespace == null)?this.namespace = new com.kscs.util.jaxb.Selector<TRoot, Id.Selector<TRoot, TParent>>(this._root, this, "namespace"):this.namespace);
        }

    }

}
