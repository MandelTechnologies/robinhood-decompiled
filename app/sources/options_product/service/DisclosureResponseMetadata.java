package options_product.service;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import options_product.service.DisclosureResponseMetadata;

/* compiled from: DisclosureResponseMetadata.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001c\u001dB9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016J8\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, m3636d2 = {"Loptions_product/service/DisclosureResponseMetadata;", "Lcom/squareup/wire/Message;", "", "title", "", "type", "agreement_context", "graphic_type", "Loptions_product/service/DisclosureResponseMetadata$GraphicType;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Loptions_product/service/DisclosureResponseMetadata$GraphicType;Lokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "getType", "getAgreement_context", "getGraphic_type", "()Loptions_product/service/DisclosureResponseMetadata$GraphicType;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "GraphicType", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class DisclosureResponseMetadata extends Message {

    @JvmField
    public static final ProtoAdapter<DisclosureResponseMetadata> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "agreementContext", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String agreement_context;

    @WireField(adapter = "options_product.service.DisclosureResponseMetadata$GraphicType#ADAPTER", jsonName = "graphicType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final GraphicType graphic_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String title;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String type;

    public DisclosureResponseMetadata() {
        this(null, null, null, null, null, 31, null);
    }

    public /* synthetic */ DisclosureResponseMetadata(String str, String str2, String str3, GraphicType graphicType, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? GraphicType.GRAPHIC_TYPE_UNSPECIFIED : graphicType, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29468newBuilder();
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    public final String getAgreement_context() {
        return this.agreement_context;
    }

    public final GraphicType getGraphic_type() {
        return this.graphic_type;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisclosureResponseMetadata(String title, String type2, String agreement_context, GraphicType graphic_type, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(agreement_context, "agreement_context");
        Intrinsics.checkNotNullParameter(graphic_type, "graphic_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = title;
        this.type = type2;
        this.agreement_context = agreement_context;
        this.graphic_type = graphic_type;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29468newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof DisclosureResponseMetadata)) {
            return false;
        }
        DisclosureResponseMetadata disclosureResponseMetadata = (DisclosureResponseMetadata) other;
        return Intrinsics.areEqual(unknownFields(), disclosureResponseMetadata.unknownFields()) && Intrinsics.areEqual(this.title, disclosureResponseMetadata.title) && Intrinsics.areEqual(this.type, disclosureResponseMetadata.type) && Intrinsics.areEqual(this.agreement_context, disclosureResponseMetadata.agreement_context) && this.graphic_type == disclosureResponseMetadata.graphic_type;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.title.hashCode()) * 37) + this.type.hashCode()) * 37) + this.agreement_context.hashCode()) * 37) + this.graphic_type.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("title=" + Internal.sanitize(this.title));
        arrayList.add("type=" + Internal.sanitize(this.type));
        arrayList.add("agreement_context=" + Internal.sanitize(this.agreement_context));
        arrayList.add("graphic_type=" + this.graphic_type);
        return CollectionsKt.joinToString$default(arrayList, ", ", "DisclosureResponseMetadata{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ DisclosureResponseMetadata copy$default(DisclosureResponseMetadata disclosureResponseMetadata, String str, String str2, String str3, GraphicType graphicType, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = disclosureResponseMetadata.title;
        }
        if ((i & 2) != 0) {
            str2 = disclosureResponseMetadata.type;
        }
        if ((i & 4) != 0) {
            str3 = disclosureResponseMetadata.agreement_context;
        }
        if ((i & 8) != 0) {
            graphicType = disclosureResponseMetadata.graphic_type;
        }
        if ((i & 16) != 0) {
            byteString = disclosureResponseMetadata.unknownFields();
        }
        ByteString byteString2 = byteString;
        String str4 = str3;
        return disclosureResponseMetadata.copy(str, str2, str4, graphicType, byteString2);
    }

    public final DisclosureResponseMetadata copy(String title, String type2, String agreement_context, GraphicType graphic_type, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(agreement_context, "agreement_context");
        Intrinsics.checkNotNullParameter(graphic_type, "graphic_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new DisclosureResponseMetadata(title, type2, agreement_context, graphic_type, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(DisclosureResponseMetadata.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<DisclosureResponseMetadata>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: options_product.service.DisclosureResponseMetadata$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(DisclosureResponseMetadata value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getType(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getType());
                }
                if (!Intrinsics.areEqual(value.getAgreement_context(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getAgreement_context());
                }
                return value.getGraphic_type() != DisclosureResponseMetadata.GraphicType.GRAPHIC_TYPE_UNSPECIFIED ? size + DisclosureResponseMetadata.GraphicType.ADAPTER.encodedSizeWithTag(4, value.getGraphic_type()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, DisclosureResponseMetadata value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getType(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getType());
                }
                if (!Intrinsics.areEqual(value.getAgreement_context(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getAgreement_context());
                }
                if (value.getGraphic_type() != DisclosureResponseMetadata.GraphicType.GRAPHIC_TYPE_UNSPECIFIED) {
                    DisclosureResponseMetadata.GraphicType.ADAPTER.encodeWithTag(writer, 4, (int) value.getGraphic_type());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, DisclosureResponseMetadata value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getGraphic_type() != DisclosureResponseMetadata.GraphicType.GRAPHIC_TYPE_UNSPECIFIED) {
                    DisclosureResponseMetadata.GraphicType.ADAPTER.encodeWithTag(writer, 4, (int) value.getGraphic_type());
                }
                if (!Intrinsics.areEqual(value.getAgreement_context(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getAgreement_context());
                }
                if (!Intrinsics.areEqual(value.getType(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getType());
                }
                if (Intrinsics.areEqual(value.getTitle(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public DisclosureResponseMetadata decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                DisclosureResponseMetadata.GraphicType graphicTypeDecode = DisclosureResponseMetadata.GraphicType.GRAPHIC_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                while (true) {
                    DisclosureResponseMetadata.GraphicType graphicType = graphicTypeDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new DisclosureResponseMetadata(strDecode, strDecode2, strDecode3, graphicType, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 2) {
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 3) {
                            strDecode3 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 4) {
                            try {
                                graphicTypeDecode = DisclosureResponseMetadata.GraphicType.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public DisclosureResponseMetadata redact(DisclosureResponseMetadata value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return DisclosureResponseMetadata.copy$default(value, null, null, null, null, ByteString.EMPTY, 15, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DisclosureResponseMetadata.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Loptions_product/service/DisclosureResponseMetadata$GraphicType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "GRAPHIC_TYPE_UNSPECIFIED", "GRAPHIC_TYPE_INDIVIDUAL", "GRAPHIC_TYPE_RETIREMENT", "Companion", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes25.dex */
    public static final class GraphicType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ GraphicType[] $VALUES;

        @JvmField
        public static final ProtoAdapter<GraphicType> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final GraphicType GRAPHIC_TYPE_INDIVIDUAL;
        public static final GraphicType GRAPHIC_TYPE_RETIREMENT;
        public static final GraphicType GRAPHIC_TYPE_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ GraphicType[] $values() {
            return new GraphicType[]{GRAPHIC_TYPE_UNSPECIFIED, GRAPHIC_TYPE_INDIVIDUAL, GRAPHIC_TYPE_RETIREMENT};
        }

        @JvmStatic
        public static final GraphicType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<GraphicType> getEntries() {
            return $ENTRIES;
        }

        private GraphicType(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final GraphicType graphicType = new GraphicType("GRAPHIC_TYPE_UNSPECIFIED", 0, 0);
            GRAPHIC_TYPE_UNSPECIFIED = graphicType;
            GRAPHIC_TYPE_INDIVIDUAL = new GraphicType("GRAPHIC_TYPE_INDIVIDUAL", 1, 1);
            GRAPHIC_TYPE_RETIREMENT = new GraphicType("GRAPHIC_TYPE_RETIREMENT", 2, 2);
            GraphicType[] graphicTypeArr$values = $values();
            $VALUES = graphicTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(graphicTypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GraphicType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<GraphicType>(orCreateKotlinClass, syntax, graphicType) { // from class: options_product.service.DisclosureResponseMetadata$GraphicType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public DisclosureResponseMetadata.GraphicType fromValue(int value) {
                    return DisclosureResponseMetadata.GraphicType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: DisclosureResponseMetadata.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Loptions_product/service/DisclosureResponseMetadata$GraphicType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Loptions_product/service/DisclosureResponseMetadata$GraphicType;", "fromValue", "value", "", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final GraphicType fromValue(int value) {
                if (value == 0) {
                    return GraphicType.GRAPHIC_TYPE_UNSPECIFIED;
                }
                if (value == 1) {
                    return GraphicType.GRAPHIC_TYPE_INDIVIDUAL;
                }
                if (value != 2) {
                    return null;
                }
                return GraphicType.GRAPHIC_TYPE_RETIREMENT;
            }
        }

        public static GraphicType valueOf(String str) {
            return (GraphicType) Enum.valueOf(GraphicType.class, str);
        }

        public static GraphicType[] values() {
            return (GraphicType[]) $VALUES.clone();
        }
    }
}
