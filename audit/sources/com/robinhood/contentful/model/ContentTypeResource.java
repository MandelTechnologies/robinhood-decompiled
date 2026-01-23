package com.robinhood.contentful.model;

import android.annotation.SuppressLint;
import com.robinhood.contentful.model.ContentResource;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.LocalDateTime;

/* compiled from: ContentResource.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001$BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\b\u0012\f\u0010\n\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u0019\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\bHÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000bHÆ\u0003JQ\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0018\b\u0002\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R!\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\n\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006%"}, m3636d2 = {"Lcom/robinhood/contentful/model/ContentTypeResource;", "Lcom/robinhood/contentful/model/EntityResource;", "sys", "Lcom/robinhood/contentful/model/ContentTypeMetadata;", "name", "", "displayField", "fields", "", "Lcom/robinhood/contentful/model/ContentTypeResource$Field;", "valueType", "Ljava/lang/Class;", "<init>", "(Lcom/robinhood/contentful/model/ContentTypeMetadata;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Class;)V", "getSys", "()Lcom/robinhood/contentful/model/ContentTypeMetadata;", "getName", "()Ljava/lang/String;", "getDisplayField", "getFields", "()Ljava/util/Map;", "getValueType", "()Ljava/lang/Class;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Field", "lib-contentful-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SuppressLint({"MissingMoshiCodegenAnnotation"})
/* loaded from: classes15.dex */
public final /* data */ class ContentTypeResource extends ContentResource4 {
    private final String displayField;
    private final Map<String, Field<?>> fields;
    private final String name;
    private final ContentTypeMetadata sys;
    private final Class<?> valueType;

    public static /* synthetic */ ContentTypeResource copy$default(ContentTypeResource contentTypeResource, ContentTypeMetadata resourceMetadata4, String str, String str2, Map map, Class cls, int i, Object obj) {
        if ((i & 1) != 0) {
            resourceMetadata4 = contentTypeResource.sys;
        }
        if ((i & 2) != 0) {
            str = contentTypeResource.name;
        }
        if ((i & 4) != 0) {
            str2 = contentTypeResource.displayField;
        }
        if ((i & 8) != 0) {
            map = contentTypeResource.fields;
        }
        if ((i & 16) != 0) {
            cls = contentTypeResource.valueType;
        }
        Class cls2 = cls;
        String str3 = str2;
        return contentTypeResource.copy(resourceMetadata4, str, str3, map, cls2);
    }

    /* renamed from: component1, reason: from getter */
    public final ContentTypeMetadata getSys() {
        return this.sys;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDisplayField() {
        return this.displayField;
    }

    public final Map<String, Field<?>> component4() {
        return this.fields;
    }

    public final Class<?> component5() {
        return this.valueType;
    }

    public final ContentTypeResource copy(ContentTypeMetadata sys, String name, String displayField, Map<String, ? extends Field<?>> fields, Class<?> valueType) {
        Intrinsics.checkNotNullParameter(sys, "sys");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(displayField, "displayField");
        Intrinsics.checkNotNullParameter(fields, "fields");
        return new ContentTypeResource(sys, name, displayField, fields, valueType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContentTypeResource)) {
            return false;
        }
        ContentTypeResource contentTypeResource = (ContentTypeResource) other;
        return Intrinsics.areEqual(this.sys, contentTypeResource.sys) && Intrinsics.areEqual(this.name, contentTypeResource.name) && Intrinsics.areEqual(this.displayField, contentTypeResource.displayField) && Intrinsics.areEqual(this.fields, contentTypeResource.fields) && Intrinsics.areEqual(this.valueType, contentTypeResource.valueType);
    }

    public int hashCode() {
        int iHashCode = ((((((this.sys.hashCode() * 31) + this.name.hashCode()) * 31) + this.displayField.hashCode()) * 31) + this.fields.hashCode()) * 31;
        Class<?> cls = this.valueType;
        return iHashCode + (cls == null ? 0 : cls.hashCode());
    }

    public String toString() {
        return "ContentTypeResource(sys=" + this.sys + ", name=" + this.name + ", displayField=" + this.displayField + ", fields=" + this.fields + ", valueType=" + this.valueType + ")";
    }

    @Override // com.robinhood.contentful.model.ContentResource
    public ContentTypeMetadata getSys() {
        return this.sys;
    }

    public final String getName() {
        return this.name;
    }

    public final String getDisplayField() {
        return this.displayField;
    }

    public final Map<String, Field<?>> getFields() {
        return this.fields;
    }

    public final Class<?> getValueType() {
        return this.valueType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ContentTypeResource(ContentTypeMetadata sys, String name, String displayField, Map<String, ? extends Field<?>> fields, Class<?> cls) {
        Intrinsics.checkNotNullParameter(sys, "sys");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(displayField, "displayField");
        Intrinsics.checkNotNullParameter(fields, "fields");
        this.sys = sys;
        this.name = name;
        this.displayField = displayField;
        this.fields = fields;
        this.valueType = cls;
    }

    /* compiled from: ContentResource.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002:\u0001\"BE\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0015\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0004HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J[\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0004HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0014R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0014R\u0011\u0010\f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0014¨\u0006#"}, m3636d2 = {"Lcom/robinhood/contentful/model/ContentTypeResource$Field;", "T", "", "id", "", "name", "type", "Lcom/robinhood/contentful/model/ContentTypeResource$Field$Type;", "isLocalized", "", "isRequired", "isDisabled", "isOmitted", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/contentful/model/ContentTypeResource$Field$Type;ZZZZ)V", "getId", "()Ljava/lang/String;", "getName", "getType", "()Lcom/robinhood/contentful/model/ContentTypeResource$Field$Type;", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "Type", "lib-contentful-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SuppressLint({"MissingMoshiCodegenAnnotation"})
    /* loaded from: classes20.dex */
    public static final /* data */ class Field<T> {
        private final String id;
        private final boolean isDisabled;
        private final boolean isLocalized;
        private final boolean isOmitted;
        private final boolean isRequired;
        private final String name;
        private final Type<T> type;

        public static /* synthetic */ Field copy$default(Field field, String str, String str2, Type type2, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = field.id;
            }
            if ((i & 2) != 0) {
                str2 = field.name;
            }
            if ((i & 4) != 0) {
                type2 = field.type;
            }
            if ((i & 8) != 0) {
                z = field.isLocalized;
            }
            if ((i & 16) != 0) {
                z2 = field.isRequired;
            }
            if ((i & 32) != 0) {
                z3 = field.isDisabled;
            }
            if ((i & 64) != 0) {
                z4 = field.isOmitted;
            }
            boolean z5 = z3;
            boolean z6 = z4;
            boolean z7 = z2;
            Type type3 = type2;
            return field.copy(str, str2, type3, z, z7, z5, z6);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public final Type<T> component3() {
            return this.type;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsLocalized() {
            return this.isLocalized;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsRequired() {
            return this.isRequired;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getIsDisabled() {
            return this.isDisabled;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getIsOmitted() {
            return this.isOmitted;
        }

        public final Field<T> copy(String id, String name, Type<T> type2, boolean isLocalized, boolean isRequired, boolean isDisabled, boolean isOmitted) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(type2, "type");
            return new Field<>(id, name, type2, isLocalized, isRequired, isDisabled, isOmitted);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Field)) {
                return false;
            }
            Field field = (Field) other;
            return Intrinsics.areEqual(this.id, field.id) && Intrinsics.areEqual(this.name, field.name) && Intrinsics.areEqual(this.type, field.type) && this.isLocalized == field.isLocalized && this.isRequired == field.isRequired && this.isDisabled == field.isDisabled && this.isOmitted == field.isOmitted;
        }

        public int hashCode() {
            return (((((((((((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + this.type.hashCode()) * 31) + Boolean.hashCode(this.isLocalized)) * 31) + Boolean.hashCode(this.isRequired)) * 31) + Boolean.hashCode(this.isDisabled)) * 31) + Boolean.hashCode(this.isOmitted);
        }

        public String toString() {
            return "Field(id=" + this.id + ", name=" + this.name + ", type=" + this.type + ", isLocalized=" + this.isLocalized + ", isRequired=" + this.isRequired + ", isDisabled=" + this.isDisabled + ", isOmitted=" + this.isOmitted + ")";
        }

        public Field(String id, String name, Type<T> type2, boolean z, boolean z2, boolean z3, boolean z4) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(type2, "type");
            this.id = id;
            this.name = name;
            this.type = type2;
            this.isLocalized = z;
            this.isRequired = z2;
            this.isDisabled = z3;
            this.isOmitted = z4;
        }

        public final String getId() {
            return this.id;
        }

        public final String getName() {
            return this.name;
        }

        public final Type<T> getType() {
            return this.type;
        }

        public final boolean isLocalized() {
            return this.isLocalized;
        }

        public final boolean isRequired() {
            return this.isRequired;
        }

        public final boolean isDisabled() {
            return this.isDisabled;
        }

        public final boolean isOmitted() {
            return this.isOmitted;
        }

        /* compiled from: ContentResource.kt */
        @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\b\b\u0001\u0010\u0001*\u00020\u00022\u00020\u0002:\n\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017B\u001f\b\u0004\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\r\u001a\u00020\u0006H\u0016R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u0082\u0001\n\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !¨\u0006\""}, m3636d2 = {"Lcom/robinhood/contentful/model/ContentTypeResource$Field$Type;", "T", "", "classType", "Ljava/lang/Class;", "identifier", "", "<init>", "(Ljava/lang/Class;Ljava/lang/String;)V", "getClassType", "()Ljava/lang/Class;", "getIdentifier", "()Ljava/lang/String;", "toString", "Boolean", "Date", "Integer", "Number", "Object", "RichText", "Symbol", "Text", Array.identifier, "Link", "Lcom/robinhood/contentful/model/ContentTypeResource$Field$Type$Array;", "Lcom/robinhood/contentful/model/ContentTypeResource$Field$Type$Boolean;", "Lcom/robinhood/contentful/model/ContentTypeResource$Field$Type$Date;", "Lcom/robinhood/contentful/model/ContentTypeResource$Field$Type$Integer;", "Lcom/robinhood/contentful/model/ContentTypeResource$Field$Type$Link;", "Lcom/robinhood/contentful/model/ContentTypeResource$Field$Type$Number;", "Lcom/robinhood/contentful/model/ContentTypeResource$Field$Type$Object;", "Lcom/robinhood/contentful/model/ContentTypeResource$Field$Type$RichText;", "Lcom/robinhood/contentful/model/ContentTypeResource$Field$Type$Symbol;", "Lcom/robinhood/contentful/model/ContentTypeResource$Field$Type$Text;", "lib-contentful-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes15.dex */
        public static abstract class Type<T> {
            private final Class<T> classType;
            private final String identifier;

            public /* synthetic */ Type(Class cls, String str, DefaultConstructorMarker defaultConstructorMarker) {
                this(cls, str);
            }

            private Type(Class<T> cls, String str) {
                this.classType = cls;
                this.identifier = str;
            }

            public final Class<T> getClassType() {
                return this.classType;
            }

            public final String getIdentifier() {
                return this.identifier;
            }

            public String toString() {
                return this.identifier;
            }

            /* compiled from: ContentResource.kt */
            @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/contentful/model/ContentTypeResource$Field$Type$Boolean;", "Lcom/robinhood/contentful/model/ContentTypeResource$Field$Type;", "", "<init>", "()V", "lib-contentful-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Boolean extends Type<java.lang.Boolean> {
                public static final Boolean INSTANCE = new Boolean();

                private Boolean() {
                    super(java.lang.Boolean.TYPE, "Boolean", null);
                }
            }

            /* compiled from: ContentResource.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/contentful/model/ContentTypeResource$Field$Type$Date;", "Lcom/robinhood/contentful/model/ContentTypeResource$Field$Type;", "j$/time/LocalDateTime", "<init>", "()V", "lib-contentful-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Date extends Type<LocalDateTime> {
                public static final Date INSTANCE = new Date();

                private Date() {
                    super(LocalDateTime.class, "Date", null);
                }
            }

            /* compiled from: ContentResource.kt */
            @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/contentful/model/ContentTypeResource$Field$Type$Integer;", "Lcom/robinhood/contentful/model/ContentTypeResource$Field$Type;", "", "<init>", "()V", "lib-contentful-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Integer extends Type<java.lang.Integer> {
                public static final Integer INSTANCE = new Integer();

                private Integer() {
                    super(java.lang.Integer.TYPE, "Integer", null);
                }
            }

            /* compiled from: ContentResource.kt */
            @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/contentful/model/ContentTypeResource$Field$Type$Number;", "Lcom/robinhood/contentful/model/ContentTypeResource$Field$Type;", "Ljava/math/BigDecimal;", "<init>", "()V", "lib-contentful-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Number extends Type<BigDecimal> {
                public static final Number INSTANCE = new Number();

                private Number() {
                    super(BigDecimal.class, "Number", null);
                }
            }

            /* compiled from: ContentResource.kt */
            @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/contentful/model/ContentTypeResource$Field$Type$Object;", "Lcom/robinhood/contentful/model/ContentTypeResource$Field$Type;", "", "", "", "<init>", "()V", "lib-contentful-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Object extends Type<Map<String, ? extends java.lang.Object>> {
                public static final Object INSTANCE = new Object();

                private Object() {
                    super(Map.class, "Object", null);
                }
            }

            /* compiled from: ContentResource.kt */
            @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/contentful/model/ContentTypeResource$Field$Type$RichText;", "Lcom/robinhood/contentful/model/ContentTypeResource$Field$Type;", "Lcom/robinhood/contentful/model/RichNode;", "<init>", "()V", "lib-contentful-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class RichText extends Type<RichNode> {
                public static final RichText INSTANCE = new RichText();

                private RichText() {
                    super(RichNode.class, "RichText", null);
                }
            }

            /* compiled from: ContentResource.kt */
            @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/contentful/model/ContentTypeResource$Field$Type$Symbol;", "Lcom/robinhood/contentful/model/ContentTypeResource$Field$Type;", "", "<init>", "()V", "lib-contentful-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Symbol extends Type<String> {
                public static final Symbol INSTANCE = new Symbol();

                private Symbol() {
                    super(String.class, "Symbol", null);
                }
            }

            /* compiled from: ContentResource.kt */
            @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/contentful/model/ContentTypeResource$Field$Type$Text;", "Lcom/robinhood/contentful/model/ContentTypeResource$Field$Type;", "", "<init>", "()V", "lib-contentful-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Text extends Type<String> {
                public static final Text INSTANCE = new Text();

                private Text() {
                    super(String.class, "Text", null);
                }
            }

            /* compiled from: ContentResource.kt */
            @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u0013*\b\b\u0002\u0010\u0001*\u00020\u00022\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00040\u0003:\u0001\u0013B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003HÆ\u0003J\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/contentful/model/ContentTypeResource$Field$Type$Array;", "E", "", "Lcom/robinhood/contentful/model/ContentTypeResource$Field$Type;", "", "elementType", "<init>", "(Lcom/robinhood/contentful/model/ContentTypeResource$Field$Type;)V", "getElementType", "()Lcom/robinhood/contentful/model/ContentTypeResource$Field$Type;", "toString", "", "component1", "copy", "equals", "", "other", "hashCode", "", "Companion", "lib-contentful-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SuppressLint({"MissingMoshiCodegenAnnotation"})
            public static final /* data */ class Array<E> extends Type<List<? extends E>> {
                public static final String identifier = "Array";
                private final Type<E> elementType;

                /* JADX WARN: Multi-variable type inference failed */
                public static /* synthetic */ Array copy$default(Array array2, Type type2, int i, java.lang.Object obj) {
                    if ((i & 1) != 0) {
                        type2 = array2.elementType;
                    }
                    return array2.copy(type2);
                }

                public final Type<E> component1() {
                    return this.elementType;
                }

                public final Array<E> copy(Type<E> elementType) {
                    Intrinsics.checkNotNullParameter(elementType, "elementType");
                    return new Array<>(elementType);
                }

                public boolean equals(java.lang.Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Array) && Intrinsics.areEqual(this.elementType, ((Array) other).elementType);
                }

                public int hashCode() {
                    return this.elementType.hashCode();
                }

                public final Type<E> getElementType() {
                    return this.elementType;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Array(Type<E> elementType) {
                    super(List.class, identifier, null);
                    Intrinsics.checkNotNullParameter(elementType, "elementType");
                    this.elementType = elementType;
                }

                @Override // com.robinhood.contentful.model.ContentTypeResource.Field.Type
                public String toString() {
                    return getIdentifier() + "<" + this.elementType + ">";
                }
            }

            /* compiled from: ContentResource.kt */
            @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u0015*\b\b\u0002\u0010\u0001*\u00020\u00022\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00040\u0003:\u0001\u0015B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00020\u0006HÆ\u0003J\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/contentful/model/ContentTypeResource$Field$Type$Link;", "T", "Lcom/robinhood/contentful/model/IdentifiableResource;", "Lcom/robinhood/contentful/model/ContentTypeResource$Field$Type;", "Lcom/robinhood/contentful/model/ResourceLink;", "referentType", "Lcom/robinhood/contentful/model/ContentResource$Type;", "<init>", "(Lcom/robinhood/contentful/model/ContentResource$Type;)V", "getReferentType", "()Lcom/robinhood/contentful/model/ContentResource$Type;", "toString", "", "component1", "copy", "equals", "", "other", "", "hashCode", "", "Companion", "lib-contentful-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SuppressLint({"MissingMoshiCodegenAnnotation"})
            public static final /* data */ class Link<T extends ContentResource6> extends Type<ResourceLink<T>> {
                public static final String identifier = "Link";
                private final ContentResource.Type<T> referentType;

                /* JADX WARN: Multi-variable type inference failed */
                public static /* synthetic */ Link copy$default(Link link, ContentResource.Type type2, int i, java.lang.Object obj) {
                    if ((i & 1) != 0) {
                        type2 = link.referentType;
                    }
                    return link.copy(type2);
                }

                public final ContentResource.Type<T> component1() {
                    return this.referentType;
                }

                public final Link<T> copy(ContentResource.Type<T> referentType) {
                    Intrinsics.checkNotNullParameter(referentType, "referentType");
                    return new Link<>(referentType);
                }

                public boolean equals(java.lang.Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Link) && Intrinsics.areEqual(this.referentType, ((Link) other).referentType);
                }

                public int hashCode() {
                    return this.referentType.hashCode();
                }

                public final ContentResource.Type<T> getReferentType() {
                    return this.referentType;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Link(ContentResource.Type<T> referentType) {
                    super(ResourceLink.class, "Link", null);
                    Intrinsics.checkNotNullParameter(referentType, "referentType");
                    this.referentType = referentType;
                }

                @Override // com.robinhood.contentful.model.ContentTypeResource.Field.Type
                public String toString() {
                    return getIdentifier() + "<" + this.referentType + ">";
                }
            }
        }
    }
}
