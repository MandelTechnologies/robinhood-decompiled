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
import options_product.service.FailureResponseMetadata;

/* compiled from: FailureResponseMetadata.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003 !\"BI\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0006H\u0016JH\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, m3636d2 = {"Loptions_product/service/FailureResponseMetadata;", "Lcom/squareup/wire/Message;", "", "failure_type", "Loptions_product/service/FailureResponseMetadata$FailureType;", "message_override", "", "primary_cta_deeplink_action", "primary_cta_message_override", "graphic_type", "Loptions_product/service/FailureResponseMetadata$GraphicType;", "unknownFields", "Lokio/ByteString;", "<init>", "(Loptions_product/service/FailureResponseMetadata$FailureType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Loptions_product/service/FailureResponseMetadata$GraphicType;Lokio/ByteString;)V", "getFailure_type", "()Loptions_product/service/FailureResponseMetadata$FailureType;", "getMessage_override", "()Ljava/lang/String;", "getPrimary_cta_deeplink_action", "getPrimary_cta_message_override", "getGraphic_type", "()Loptions_product/service/FailureResponseMetadata$GraphicType;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "FailureType", "GraphicType", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class FailureResponseMetadata extends Message {

    @JvmField
    public static final ProtoAdapter<FailureResponseMetadata> ADAPTER;

    @WireField(adapter = "options_product.service.FailureResponseMetadata$FailureType#ADAPTER", jsonName = "failureType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final FailureType failure_type;

    @WireField(adapter = "options_product.service.FailureResponseMetadata$GraphicType#ADAPTER", jsonName = "graphicType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final GraphicType graphic_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "messageOverride", schemaIndex = 1, tag = 2)
    private final String message_override;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "primaryCtaDeeplinkAction", schemaIndex = 2, tag = 3)
    private final String primary_cta_deeplink_action;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "primaryCtaMessageOverride", schemaIndex = 3, tag = 4)
    private final String primary_cta_message_override;

    public FailureResponseMetadata() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29485newBuilder();
    }

    public final FailureType getFailure_type() {
        return this.failure_type;
    }

    public /* synthetic */ FailureResponseMetadata(FailureType failureType, String str, String str2, String str3, GraphicType graphicType, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? FailureType.FAILURE_UNSPECIFIED : failureType, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? GraphicType.GRAPHIC_TYPE_UNSPECIFIED : graphicType, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getMessage_override() {
        return this.message_override;
    }

    public final String getPrimary_cta_deeplink_action() {
        return this.primary_cta_deeplink_action;
    }

    public final String getPrimary_cta_message_override() {
        return this.primary_cta_message_override;
    }

    public final GraphicType getGraphic_type() {
        return this.graphic_type;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FailureResponseMetadata(FailureType failure_type, String str, String str2, String str3, GraphicType graphic_type, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(failure_type, "failure_type");
        Intrinsics.checkNotNullParameter(graphic_type, "graphic_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.failure_type = failure_type;
        this.message_override = str;
        this.primary_cta_deeplink_action = str2;
        this.primary_cta_message_override = str3;
        this.graphic_type = graphic_type;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29485newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof FailureResponseMetadata)) {
            return false;
        }
        FailureResponseMetadata failureResponseMetadata = (FailureResponseMetadata) other;
        return Intrinsics.areEqual(unknownFields(), failureResponseMetadata.unknownFields()) && this.failure_type == failureResponseMetadata.failure_type && Intrinsics.areEqual(this.message_override, failureResponseMetadata.message_override) && Intrinsics.areEqual(this.primary_cta_deeplink_action, failureResponseMetadata.primary_cta_deeplink_action) && Intrinsics.areEqual(this.primary_cta_message_override, failureResponseMetadata.primary_cta_message_override) && this.graphic_type == failureResponseMetadata.graphic_type;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.failure_type.hashCode()) * 37;
        String str = this.message_override;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.primary_cta_deeplink_action;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.primary_cta_message_override;
        int iHashCode4 = ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37) + this.graphic_type.hashCode();
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("failure_type=" + this.failure_type);
        String str = this.message_override;
        if (str != null) {
            arrayList.add("message_override=" + Internal.sanitize(str));
        }
        String str2 = this.primary_cta_deeplink_action;
        if (str2 != null) {
            arrayList.add("primary_cta_deeplink_action=" + Internal.sanitize(str2));
        }
        String str3 = this.primary_cta_message_override;
        if (str3 != null) {
            arrayList.add("primary_cta_message_override=" + Internal.sanitize(str3));
        }
        arrayList.add("graphic_type=" + this.graphic_type);
        return CollectionsKt.joinToString$default(arrayList, ", ", "FailureResponseMetadata{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ FailureResponseMetadata copy$default(FailureResponseMetadata failureResponseMetadata, FailureType failureType, String str, String str2, String str3, GraphicType graphicType, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            failureType = failureResponseMetadata.failure_type;
        }
        if ((i & 2) != 0) {
            str = failureResponseMetadata.message_override;
        }
        if ((i & 4) != 0) {
            str2 = failureResponseMetadata.primary_cta_deeplink_action;
        }
        if ((i & 8) != 0) {
            str3 = failureResponseMetadata.primary_cta_message_override;
        }
        if ((i & 16) != 0) {
            graphicType = failureResponseMetadata.graphic_type;
        }
        if ((i & 32) != 0) {
            byteString = failureResponseMetadata.unknownFields();
        }
        GraphicType graphicType2 = graphicType;
        ByteString byteString2 = byteString;
        return failureResponseMetadata.copy(failureType, str, str2, str3, graphicType2, byteString2);
    }

    public final FailureResponseMetadata copy(FailureType failure_type, String message_override, String primary_cta_deeplink_action, String primary_cta_message_override, GraphicType graphic_type, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(failure_type, "failure_type");
        Intrinsics.checkNotNullParameter(graphic_type, "graphic_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new FailureResponseMetadata(failure_type, message_override, primary_cta_deeplink_action, primary_cta_message_override, graphic_type, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FailureResponseMetadata.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<FailureResponseMetadata>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: options_product.service.FailureResponseMetadata$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(FailureResponseMetadata value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getFailure_type() != FailureResponseMetadata.FailureType.FAILURE_UNSPECIFIED) {
                    size += FailureResponseMetadata.FailureType.ADAPTER.encodedSizeWithTag(1, value.getFailure_type());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(2, value.getMessage_override()) + protoAdapter.encodedSizeWithTag(3, value.getPrimary_cta_deeplink_action()) + protoAdapter.encodedSizeWithTag(4, value.getPrimary_cta_message_override());
                return value.getGraphic_type() != FailureResponseMetadata.GraphicType.GRAPHIC_TYPE_UNSPECIFIED ? iEncodedSizeWithTag + FailureResponseMetadata.GraphicType.ADAPTER.encodedSizeWithTag(5, value.getGraphic_type()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, FailureResponseMetadata value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getFailure_type() != FailureResponseMetadata.FailureType.FAILURE_UNSPECIFIED) {
                    FailureResponseMetadata.FailureType.ADAPTER.encodeWithTag(writer, 1, (int) value.getFailure_type());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 2, (int) value.getMessage_override());
                protoAdapter.encodeWithTag(writer, 3, (int) value.getPrimary_cta_deeplink_action());
                protoAdapter.encodeWithTag(writer, 4, (int) value.getPrimary_cta_message_override());
                if (value.getGraphic_type() != FailureResponseMetadata.GraphicType.GRAPHIC_TYPE_UNSPECIFIED) {
                    FailureResponseMetadata.GraphicType.ADAPTER.encodeWithTag(writer, 5, (int) value.getGraphic_type());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, FailureResponseMetadata value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getGraphic_type() != FailureResponseMetadata.GraphicType.GRAPHIC_TYPE_UNSPECIFIED) {
                    FailureResponseMetadata.GraphicType.ADAPTER.encodeWithTag(writer, 5, (int) value.getGraphic_type());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 4, (int) value.getPrimary_cta_message_override());
                protoAdapter.encodeWithTag(writer, 3, (int) value.getPrimary_cta_deeplink_action());
                protoAdapter.encodeWithTag(writer, 2, (int) value.getMessage_override());
                if (value.getFailure_type() != FailureResponseMetadata.FailureType.FAILURE_UNSPECIFIED) {
                    FailureResponseMetadata.FailureType.ADAPTER.encodeWithTag(writer, 1, (int) value.getFailure_type());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public FailureResponseMetadata decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                FailureResponseMetadata.FailureType failureTypeDecode = FailureResponseMetadata.FailureType.FAILURE_UNSPECIFIED;
                FailureResponseMetadata.GraphicType graphicType = FailureResponseMetadata.GraphicType.GRAPHIC_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = null;
                String strDecode2 = null;
                String strDecode3 = null;
                FailureResponseMetadata.GraphicType graphicTypeDecode = graphicType;
                while (true) {
                    FailureResponseMetadata.FailureType failureType = failureTypeDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new FailureResponseMetadata(failureType, strDecode, strDecode2, strDecode3, graphicTypeDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            try {
                                failureTypeDecode = FailureResponseMetadata.FailureType.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 2) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 3) {
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 4) {
                            strDecode3 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 5) {
                            try {
                                graphicTypeDecode = FailureResponseMetadata.GraphicType.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            }
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public FailureResponseMetadata redact(FailureResponseMetadata value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return FailureResponseMetadata.copy$default(value, null, null, null, null, null, ByteString.EMPTY, 31, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FailureResponseMetadata.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u001a\b\u0086\u0081\u0002\u0018\u0000 \u001d2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u001dB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001c¨\u0006\u001e"}, m3636d2 = {"Loptions_product/service/FailureResponseMetadata$FailureType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "FAILURE_UNSPECIFIED", "HARD_REJECT", "MANUAL_REVIEW_L2", "MANUAL_REVIEW_L3", "NOT_SUITABLE", "PENDING", "PROFESSIONAL_TRADER", "L2_TO_L3_FAILURE", "NOT_SUITABLE_RETRY_AVAILABLE", "NOT_SUITABLE_IP", "NOT_SUITABLE_V2", "RHSG_CAR_FAILURE_RETRY_AVAILABLE", "JA_NOT_ELIGIBLE", "JA_L2_NOT_ELIGIBLE", "JA_MANUAL_REVIEW", "JA_L2_MANUAL_REVIEW", "JA_COOWNER_MANUAL_REVIEW", "JA_BOTH_MANUAL_REVIEW", "JA_BOTH_L2_MANUAL_REVIEW", "IN_REVIEW_NO_ACTION", "Companion", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes25.dex */
    public static final class FailureType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ FailureType[] $VALUES;

        @JvmField
        public static final ProtoAdapter<FailureType> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final FailureType FAILURE_UNSPECIFIED;
        public static final FailureType HARD_REJECT;
        public static final FailureType IN_REVIEW_NO_ACTION;
        public static final FailureType JA_BOTH_L2_MANUAL_REVIEW;
        public static final FailureType JA_BOTH_MANUAL_REVIEW;
        public static final FailureType JA_COOWNER_MANUAL_REVIEW;
        public static final FailureType JA_L2_MANUAL_REVIEW;
        public static final FailureType JA_L2_NOT_ELIGIBLE;
        public static final FailureType JA_MANUAL_REVIEW;
        public static final FailureType JA_NOT_ELIGIBLE;
        public static final FailureType L2_TO_L3_FAILURE;
        public static final FailureType MANUAL_REVIEW_L2;
        public static final FailureType MANUAL_REVIEW_L3;
        public static final FailureType NOT_SUITABLE;
        public static final FailureType NOT_SUITABLE_IP;
        public static final FailureType NOT_SUITABLE_RETRY_AVAILABLE;
        public static final FailureType NOT_SUITABLE_V2;
        public static final FailureType PENDING;
        public static final FailureType PROFESSIONAL_TRADER;
        public static final FailureType RHSG_CAR_FAILURE_RETRY_AVAILABLE;
        private final int value;

        private static final /* synthetic */ FailureType[] $values() {
            return new FailureType[]{FAILURE_UNSPECIFIED, HARD_REJECT, MANUAL_REVIEW_L2, MANUAL_REVIEW_L3, NOT_SUITABLE, PENDING, PROFESSIONAL_TRADER, L2_TO_L3_FAILURE, NOT_SUITABLE_RETRY_AVAILABLE, NOT_SUITABLE_IP, NOT_SUITABLE_V2, RHSG_CAR_FAILURE_RETRY_AVAILABLE, JA_NOT_ELIGIBLE, JA_L2_NOT_ELIGIBLE, JA_MANUAL_REVIEW, JA_L2_MANUAL_REVIEW, JA_COOWNER_MANUAL_REVIEW, JA_BOTH_MANUAL_REVIEW, JA_BOTH_L2_MANUAL_REVIEW, IN_REVIEW_NO_ACTION};
        }

        @JvmStatic
        public static final FailureType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<FailureType> getEntries() {
            return $ENTRIES;
        }

        private FailureType(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final FailureType failureType = new FailureType("FAILURE_UNSPECIFIED", 0, 0);
            FAILURE_UNSPECIFIED = failureType;
            HARD_REJECT = new FailureType("HARD_REJECT", 1, 1);
            MANUAL_REVIEW_L2 = new FailureType("MANUAL_REVIEW_L2", 2, 2);
            MANUAL_REVIEW_L3 = new FailureType("MANUAL_REVIEW_L3", 3, 3);
            NOT_SUITABLE = new FailureType("NOT_SUITABLE", 4, 4);
            PENDING = new FailureType("PENDING", 5, 5);
            PROFESSIONAL_TRADER = new FailureType("PROFESSIONAL_TRADER", 6, 6);
            L2_TO_L3_FAILURE = new FailureType("L2_TO_L3_FAILURE", 7, 7);
            NOT_SUITABLE_RETRY_AVAILABLE = new FailureType("NOT_SUITABLE_RETRY_AVAILABLE", 8, 8);
            NOT_SUITABLE_IP = new FailureType("NOT_SUITABLE_IP", 9, 9);
            NOT_SUITABLE_V2 = new FailureType("NOT_SUITABLE_V2", 10, 10);
            RHSG_CAR_FAILURE_RETRY_AVAILABLE = new FailureType("RHSG_CAR_FAILURE_RETRY_AVAILABLE", 11, 11);
            JA_NOT_ELIGIBLE = new FailureType("JA_NOT_ELIGIBLE", 12, 12);
            JA_L2_NOT_ELIGIBLE = new FailureType("JA_L2_NOT_ELIGIBLE", 13, 13);
            JA_MANUAL_REVIEW = new FailureType("JA_MANUAL_REVIEW", 14, 14);
            JA_L2_MANUAL_REVIEW = new FailureType("JA_L2_MANUAL_REVIEW", 15, 17);
            JA_COOWNER_MANUAL_REVIEW = new FailureType("JA_COOWNER_MANUAL_REVIEW", 16, 15);
            JA_BOTH_MANUAL_REVIEW = new FailureType("JA_BOTH_MANUAL_REVIEW", 17, 16);
            JA_BOTH_L2_MANUAL_REVIEW = new FailureType("JA_BOTH_L2_MANUAL_REVIEW", 18, 18);
            IN_REVIEW_NO_ACTION = new FailureType("IN_REVIEW_NO_ACTION", 19, 19);
            FailureType[] failureTypeArr$values = $values();
            $VALUES = failureTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(failureTypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FailureType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<FailureType>(orCreateKotlinClass, syntax, failureType) { // from class: options_product.service.FailureResponseMetadata$FailureType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public FailureResponseMetadata.FailureType fromValue(int value) {
                    return FailureResponseMetadata.FailureType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: FailureResponseMetadata.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Loptions_product/service/FailureResponseMetadata$FailureType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Loptions_product/service/FailureResponseMetadata$FailureType;", "fromValue", "value", "", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final FailureType fromValue(int value) {
                switch (value) {
                    case 0:
                        return FailureType.FAILURE_UNSPECIFIED;
                    case 1:
                        return FailureType.HARD_REJECT;
                    case 2:
                        return FailureType.MANUAL_REVIEW_L2;
                    case 3:
                        return FailureType.MANUAL_REVIEW_L3;
                    case 4:
                        return FailureType.NOT_SUITABLE;
                    case 5:
                        return FailureType.PENDING;
                    case 6:
                        return FailureType.PROFESSIONAL_TRADER;
                    case 7:
                        return FailureType.L2_TO_L3_FAILURE;
                    case 8:
                        return FailureType.NOT_SUITABLE_RETRY_AVAILABLE;
                    case 9:
                        return FailureType.NOT_SUITABLE_IP;
                    case 10:
                        return FailureType.NOT_SUITABLE_V2;
                    case 11:
                        return FailureType.RHSG_CAR_FAILURE_RETRY_AVAILABLE;
                    case 12:
                        return FailureType.JA_NOT_ELIGIBLE;
                    case 13:
                        return FailureType.JA_L2_NOT_ELIGIBLE;
                    case 14:
                        return FailureType.JA_MANUAL_REVIEW;
                    case 15:
                        return FailureType.JA_COOWNER_MANUAL_REVIEW;
                    case 16:
                        return FailureType.JA_BOTH_MANUAL_REVIEW;
                    case 17:
                        return FailureType.JA_L2_MANUAL_REVIEW;
                    case 18:
                        return FailureType.JA_BOTH_L2_MANUAL_REVIEW;
                    case 19:
                        return FailureType.IN_REVIEW_NO_ACTION;
                    default:
                        return null;
                }
            }
        }

        public static FailureType valueOf(String str) {
            return (FailureType) Enum.valueOf(FailureType.class, str);
        }

        public static FailureType[] values() {
            return (FailureType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FailureResponseMetadata.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Loptions_product/service/FailureResponseMetadata$GraphicType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "GRAPHIC_TYPE_UNSPECIFIED", "GRAPHIC_TYPE_INDIVIDUAL", "GRAPHIC_TYPE_RETIREMENT", "GRAPHIC_TYPE_JOINT_ACCOUNT", "Companion", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes25.dex */
    public static final class GraphicType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ GraphicType[] $VALUES;

        @JvmField
        public static final ProtoAdapter<GraphicType> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final GraphicType GRAPHIC_TYPE_INDIVIDUAL;
        public static final GraphicType GRAPHIC_TYPE_JOINT_ACCOUNT;
        public static final GraphicType GRAPHIC_TYPE_RETIREMENT;
        public static final GraphicType GRAPHIC_TYPE_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ GraphicType[] $values() {
            return new GraphicType[]{GRAPHIC_TYPE_UNSPECIFIED, GRAPHIC_TYPE_INDIVIDUAL, GRAPHIC_TYPE_RETIREMENT, GRAPHIC_TYPE_JOINT_ACCOUNT};
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
            GRAPHIC_TYPE_JOINT_ACCOUNT = new GraphicType("GRAPHIC_TYPE_JOINT_ACCOUNT", 3, 3);
            GraphicType[] graphicTypeArr$values = $values();
            $VALUES = graphicTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(graphicTypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GraphicType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<GraphicType>(orCreateKotlinClass, syntax, graphicType) { // from class: options_product.service.FailureResponseMetadata$GraphicType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public FailureResponseMetadata.GraphicType fromValue(int value) {
                    return FailureResponseMetadata.GraphicType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: FailureResponseMetadata.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Loptions_product/service/FailureResponseMetadata$GraphicType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Loptions_product/service/FailureResponseMetadata$GraphicType;", "fromValue", "value", "", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
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
                if (value == 2) {
                    return GraphicType.GRAPHIC_TYPE_RETIREMENT;
                }
                if (value != 3) {
                    return null;
                }
                return GraphicType.GRAPHIC_TYPE_JOINT_ACCOUNT;
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
