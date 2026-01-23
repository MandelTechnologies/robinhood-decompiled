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
import options_product.service.InvestmentProfileResponseMetadata;

/* compiled from: InvestmentProfileResponseMetadata.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001a\u001bB/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016J.\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001c"}, m3636d2 = {"Loptions_product/service/InvestmentProfileResponseMetadata;", "Lcom/squareup/wire/Message;", "", "context", "", "graphic_type", "Loptions_product/service/InvestmentProfileResponseMetadata$GraphicType;", "account_number", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Loptions_product/service/InvestmentProfileResponseMetadata$GraphicType;Ljava/lang/String;Lokio/ByteString;)V", "getContext", "()Ljava/lang/String;", "getGraphic_type", "()Loptions_product/service/InvestmentProfileResponseMetadata$GraphicType;", "getAccount_number", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "GraphicType", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class InvestmentProfileResponseMetadata extends Message {

    @JvmField
    public static final ProtoAdapter<InvestmentProfileResponseMetadata> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String account_number;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String context;

    @WireField(adapter = "options_product.service.InvestmentProfileResponseMetadata$GraphicType#ADAPTER", jsonName = "graphicType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final GraphicType graphic_type;

    public InvestmentProfileResponseMetadata() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ InvestmentProfileResponseMetadata(String str, GraphicType graphicType, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? GraphicType.GRAPHIC_TYPE_UNSPECIFIED : graphicType, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29500newBuilder();
    }

    public final String getContext() {
        return this.context;
    }

    public final GraphicType getGraphic_type() {
        return this.graphic_type;
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestmentProfileResponseMetadata(String context, GraphicType graphic_type, String account_number, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(graphic_type, "graphic_type");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.context = context;
        this.graphic_type = graphic_type;
        this.account_number = account_number;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29500newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof InvestmentProfileResponseMetadata)) {
            return false;
        }
        InvestmentProfileResponseMetadata investmentProfileResponseMetadata = (InvestmentProfileResponseMetadata) other;
        return Intrinsics.areEqual(unknownFields(), investmentProfileResponseMetadata.unknownFields()) && Intrinsics.areEqual(this.context, investmentProfileResponseMetadata.context) && this.graphic_type == investmentProfileResponseMetadata.graphic_type && Intrinsics.areEqual(this.account_number, investmentProfileResponseMetadata.account_number);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.context.hashCode()) * 37) + this.graphic_type.hashCode()) * 37) + this.account_number.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("context=" + Internal.sanitize(this.context));
        arrayList.add("graphic_type=" + this.graphic_type);
        arrayList.add("account_number=" + Internal.sanitize(this.account_number));
        return CollectionsKt.joinToString$default(arrayList, ", ", "InvestmentProfileResponseMetadata{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ InvestmentProfileResponseMetadata copy$default(InvestmentProfileResponseMetadata investmentProfileResponseMetadata, String str, GraphicType graphicType, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = investmentProfileResponseMetadata.context;
        }
        if ((i & 2) != 0) {
            graphicType = investmentProfileResponseMetadata.graphic_type;
        }
        if ((i & 4) != 0) {
            str2 = investmentProfileResponseMetadata.account_number;
        }
        if ((i & 8) != 0) {
            byteString = investmentProfileResponseMetadata.unknownFields();
        }
        return investmentProfileResponseMetadata.copy(str, graphicType, str2, byteString);
    }

    public final InvestmentProfileResponseMetadata copy(String context, GraphicType graphic_type, String account_number, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(graphic_type, "graphic_type");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new InvestmentProfileResponseMetadata(context, graphic_type, account_number, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(InvestmentProfileResponseMetadata.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<InvestmentProfileResponseMetadata>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: options_product.service.InvestmentProfileResponseMetadata$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(InvestmentProfileResponseMetadata value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getContext(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getContext());
                }
                if (value.getGraphic_type() != InvestmentProfileResponseMetadata.GraphicType.GRAPHIC_TYPE_UNSPECIFIED) {
                    size += InvestmentProfileResponseMetadata.GraphicType.ADAPTER.encodedSizeWithTag(2, value.getGraphic_type());
                }
                return !Intrinsics.areEqual(value.getAccount_number(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getAccount_number()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, InvestmentProfileResponseMetadata value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getContext(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getContext());
                }
                if (value.getGraphic_type() != InvestmentProfileResponseMetadata.GraphicType.GRAPHIC_TYPE_UNSPECIFIED) {
                    InvestmentProfileResponseMetadata.GraphicType.ADAPTER.encodeWithTag(writer, 2, (int) value.getGraphic_type());
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getAccount_number());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, InvestmentProfileResponseMetadata value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getAccount_number());
                }
                if (value.getGraphic_type() != InvestmentProfileResponseMetadata.GraphicType.GRAPHIC_TYPE_UNSPECIFIED) {
                    InvestmentProfileResponseMetadata.GraphicType.ADAPTER.encodeWithTag(writer, 2, (int) value.getGraphic_type());
                }
                if (Intrinsics.areEqual(value.getContext(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getContext());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public InvestmentProfileResponseMetadata decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                InvestmentProfileResponseMetadata.GraphicType graphicTypeDecode = InvestmentProfileResponseMetadata.GraphicType.GRAPHIC_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new InvestmentProfileResponseMetadata(strDecode, graphicTypeDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        try {
                            graphicTypeDecode = InvestmentProfileResponseMetadata.GraphicType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 3) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public InvestmentProfileResponseMetadata redact(InvestmentProfileResponseMetadata value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return InvestmentProfileResponseMetadata.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: InvestmentProfileResponseMetadata.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Loptions_product/service/InvestmentProfileResponseMetadata$GraphicType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "GRAPHIC_TYPE_UNSPECIFIED", "GRAPHIC_TYPE_INDIVIDUAL", "GRAPHIC_TYPE_RETIREMENT", "Companion", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
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
            ADAPTER = new EnumAdapter<GraphicType>(orCreateKotlinClass, syntax, graphicType) { // from class: options_product.service.InvestmentProfileResponseMetadata$GraphicType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public InvestmentProfileResponseMetadata.GraphicType fromValue(int value) {
                    return InvestmentProfileResponseMetadata.GraphicType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: InvestmentProfileResponseMetadata.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Loptions_product/service/InvestmentProfileResponseMetadata$GraphicType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Loptions_product/service/InvestmentProfileResponseMetadata$GraphicType;", "fromValue", "value", "", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
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
