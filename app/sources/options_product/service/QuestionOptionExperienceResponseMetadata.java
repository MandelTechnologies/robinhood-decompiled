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
import options_product.service.QuestionOptionExperienceResponseMetadata;

/* compiled from: QuestionOptionExperienceResponseMetadata.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0015\u0016B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, m3636d2 = {"Loptions_product/service/QuestionOptionExperienceResponseMetadata;", "Lcom/squareup/wire/Message;", "", "graphic_type", "Loptions_product/service/QuestionOptionExperienceResponseMetadata$GraphicType;", "unknownFields", "Lokio/ByteString;", "<init>", "(Loptions_product/service/QuestionOptionExperienceResponseMetadata$GraphicType;Lokio/ByteString;)V", "getGraphic_type", "()Loptions_product/service/QuestionOptionExperienceResponseMetadata$GraphicType;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "GraphicType", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class QuestionOptionExperienceResponseMetadata extends Message {

    @JvmField
    public static final ProtoAdapter<QuestionOptionExperienceResponseMetadata> ADAPTER;

    @WireField(adapter = "options_product.service.QuestionOptionExperienceResponseMetadata$GraphicType#ADAPTER", jsonName = "graphicType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final GraphicType graphic_type;

    /* JADX WARN: Multi-variable type inference failed */
    public QuestionOptionExperienceResponseMetadata() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29537newBuilder();
    }

    public final GraphicType getGraphic_type() {
        return this.graphic_type;
    }

    public /* synthetic */ QuestionOptionExperienceResponseMetadata(GraphicType graphicType, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? GraphicType.GRAPHIC_TYPE_UNSPECIFIED : graphicType, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuestionOptionExperienceResponseMetadata(GraphicType graphic_type, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(graphic_type, "graphic_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.graphic_type = graphic_type;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29537newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof QuestionOptionExperienceResponseMetadata)) {
            return false;
        }
        QuestionOptionExperienceResponseMetadata questionOptionExperienceResponseMetadata = (QuestionOptionExperienceResponseMetadata) other;
        return Intrinsics.areEqual(unknownFields(), questionOptionExperienceResponseMetadata.unknownFields()) && this.graphic_type == questionOptionExperienceResponseMetadata.graphic_type;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.graphic_type.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("graphic_type=" + this.graphic_type);
        return CollectionsKt.joinToString$default(arrayList, ", ", "QuestionOptionExperienceResponseMetadata{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ QuestionOptionExperienceResponseMetadata copy$default(QuestionOptionExperienceResponseMetadata questionOptionExperienceResponseMetadata, GraphicType graphicType, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            graphicType = questionOptionExperienceResponseMetadata.graphic_type;
        }
        if ((i & 2) != 0) {
            byteString = questionOptionExperienceResponseMetadata.unknownFields();
        }
        return questionOptionExperienceResponseMetadata.copy(graphicType, byteString);
    }

    public final QuestionOptionExperienceResponseMetadata copy(GraphicType graphic_type, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(graphic_type, "graphic_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new QuestionOptionExperienceResponseMetadata(graphic_type, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(QuestionOptionExperienceResponseMetadata.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<QuestionOptionExperienceResponseMetadata>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: options_product.service.QuestionOptionExperienceResponseMetadata$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(QuestionOptionExperienceResponseMetadata value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                return value.getGraphic_type() != QuestionOptionExperienceResponseMetadata.GraphicType.GRAPHIC_TYPE_UNSPECIFIED ? size + QuestionOptionExperienceResponseMetadata.GraphicType.ADAPTER.encodedSizeWithTag(1, value.getGraphic_type()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, QuestionOptionExperienceResponseMetadata value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getGraphic_type() != QuestionOptionExperienceResponseMetadata.GraphicType.GRAPHIC_TYPE_UNSPECIFIED) {
                    QuestionOptionExperienceResponseMetadata.GraphicType.ADAPTER.encodeWithTag(writer, 1, (int) value.getGraphic_type());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, QuestionOptionExperienceResponseMetadata value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getGraphic_type() != QuestionOptionExperienceResponseMetadata.GraphicType.GRAPHIC_TYPE_UNSPECIFIED) {
                    QuestionOptionExperienceResponseMetadata.GraphicType.ADAPTER.encodeWithTag(writer, 1, (int) value.getGraphic_type());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public QuestionOptionExperienceResponseMetadata decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                QuestionOptionExperienceResponseMetadata.GraphicType graphicTypeDecode = QuestionOptionExperienceResponseMetadata.GraphicType.GRAPHIC_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new QuestionOptionExperienceResponseMetadata(graphicTypeDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            graphicTypeDecode = QuestionOptionExperienceResponseMetadata.GraphicType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public QuestionOptionExperienceResponseMetadata redact(QuestionOptionExperienceResponseMetadata value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return QuestionOptionExperienceResponseMetadata.copy$default(value, null, ByteString.EMPTY, 1, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: QuestionOptionExperienceResponseMetadata.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Loptions_product/service/QuestionOptionExperienceResponseMetadata$GraphicType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "GRAPHIC_TYPE_UNSPECIFIED", "GRAPHIC_TYPE_INDIVIDUAL", "GRAPHIC_TYPE_RETIREMENT", "Companion", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
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
            ADAPTER = new EnumAdapter<GraphicType>(orCreateKotlinClass, syntax, graphicType) { // from class: options_product.service.QuestionOptionExperienceResponseMetadata$GraphicType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public QuestionOptionExperienceResponseMetadata.GraphicType fromValue(int value) {
                    return QuestionOptionExperienceResponseMetadata.GraphicType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: QuestionOptionExperienceResponseMetadata.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Loptions_product/service/QuestionOptionExperienceResponseMetadata$GraphicType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Loptions_product/service/QuestionOptionExperienceResponseMetadata$GraphicType;", "fromValue", "value", "", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
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
