package rosetta.midas.p538v1;

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
import rosetta.midas.p538v1.CreditCardCLIFeature;

/* compiled from: CreditCardCLIFeature.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004!\"#$B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016J:\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006%"}, m3636d2 = {"Lrosetta/midas/v1/CreditCardCLIFeature;", "Lcom/squareup/wire/Message;", "", "cli_penalty_type", "Lrosetta/midas/v1/CreditCardCLIFeature$CLIPenaltyType;", "cli_promotion_type", "Lrosetta/midas/v1/CreditCardCLIFeature$CLIPromotionType;", "cli_promotion_status", "Lrosetta/midas/v1/CreditCardCLIFeature$CLIPromotionStatus;", "promotion_details", "Lrosetta/midas/v1/PromotionDetails;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrosetta/midas/v1/CreditCardCLIFeature$CLIPenaltyType;Lrosetta/midas/v1/CreditCardCLIFeature$CLIPromotionType;Lrosetta/midas/v1/CreditCardCLIFeature$CLIPromotionStatus;Lrosetta/midas/v1/PromotionDetails;Lokio/ByteString;)V", "getCli_penalty_type", "()Lrosetta/midas/v1/CreditCardCLIFeature$CLIPenaltyType;", "getCli_promotion_type", "()Lrosetta/midas/v1/CreditCardCLIFeature$CLIPromotionType;", "getCli_promotion_status", "()Lrosetta/midas/v1/CreditCardCLIFeature$CLIPromotionStatus;", "getPromotion_details", "()Lrosetta/midas/v1/PromotionDetails;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "CLIPromotionType", "CLIPromotionStatus", "CLIPenaltyType", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class CreditCardCLIFeature extends Message {

    @JvmField
    public static final ProtoAdapter<CreditCardCLIFeature> ADAPTER;

    @WireField(adapter = "rosetta.midas.v1.CreditCardCLIFeature$CLIPenaltyType#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final CLIPenaltyType cli_penalty_type;

    @WireField(adapter = "rosetta.midas.v1.CreditCardCLIFeature$CLIPromotionStatus#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final CLIPromotionStatus cli_promotion_status;

    @WireField(adapter = "rosetta.midas.v1.CreditCardCLIFeature$CLIPromotionType#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final CLIPromotionType cli_promotion_type;

    @WireField(adapter = "rosetta.midas.v1.PromotionDetails#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final PromotionDetails promotion_details;

    public CreditCardCLIFeature() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29894newBuilder();
    }

    public final CLIPenaltyType getCli_penalty_type() {
        return this.cli_penalty_type;
    }

    public /* synthetic */ CreditCardCLIFeature(CLIPenaltyType cLIPenaltyType, CLIPromotionType cLIPromotionType, CLIPromotionStatus cLIPromotionStatus, PromotionDetails promotionDetails, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CLIPenaltyType.CLAWBACK_PENALTY_TYPE_UNSPECIFIED : cLIPenaltyType, (i & 2) != 0 ? CLIPromotionType.CLI_PROMOTION_TYPE_UNSPECIFIED : cLIPromotionType, (i & 4) != 0 ? CLIPromotionStatus.STATUS_UNSPECIFIED : cLIPromotionStatus, (i & 8) != 0 ? null : promotionDetails, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    public final CLIPromotionType getCli_promotion_type() {
        return this.cli_promotion_type;
    }

    public final CLIPromotionStatus getCli_promotion_status() {
        return this.cli_promotion_status;
    }

    public final PromotionDetails getPromotion_details() {
        return this.promotion_details;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreditCardCLIFeature(CLIPenaltyType cli_penalty_type, CLIPromotionType cli_promotion_type, CLIPromotionStatus cli_promotion_status, PromotionDetails promotionDetails, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(cli_penalty_type, "cli_penalty_type");
        Intrinsics.checkNotNullParameter(cli_promotion_type, "cli_promotion_type");
        Intrinsics.checkNotNullParameter(cli_promotion_status, "cli_promotion_status");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.cli_penalty_type = cli_penalty_type;
        this.cli_promotion_type = cli_promotion_type;
        this.cli_promotion_status = cli_promotion_status;
        this.promotion_details = promotionDetails;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29894newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CreditCardCLIFeature)) {
            return false;
        }
        CreditCardCLIFeature creditCardCLIFeature = (CreditCardCLIFeature) other;
        return Intrinsics.areEqual(unknownFields(), creditCardCLIFeature.unknownFields()) && this.cli_penalty_type == creditCardCLIFeature.cli_penalty_type && this.cli_promotion_type == creditCardCLIFeature.cli_promotion_type && this.cli_promotion_status == creditCardCLIFeature.cli_promotion_status && Intrinsics.areEqual(this.promotion_details, creditCardCLIFeature.promotion_details);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.cli_penalty_type.hashCode()) * 37) + this.cli_promotion_type.hashCode()) * 37) + this.cli_promotion_status.hashCode()) * 37;
        PromotionDetails promotionDetails = this.promotion_details;
        int iHashCode2 = iHashCode + (promotionDetails != null ? promotionDetails.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("cli_penalty_type=" + this.cli_penalty_type);
        arrayList.add("cli_promotion_type=" + this.cli_promotion_type);
        arrayList.add("cli_promotion_status=" + this.cli_promotion_status);
        PromotionDetails promotionDetails = this.promotion_details;
        if (promotionDetails != null) {
            arrayList.add("promotion_details=" + promotionDetails);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CreditCardCLIFeature{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ CreditCardCLIFeature copy$default(CreditCardCLIFeature creditCardCLIFeature, CLIPenaltyType cLIPenaltyType, CLIPromotionType cLIPromotionType, CLIPromotionStatus cLIPromotionStatus, PromotionDetails promotionDetails, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            cLIPenaltyType = creditCardCLIFeature.cli_penalty_type;
        }
        if ((i & 2) != 0) {
            cLIPromotionType = creditCardCLIFeature.cli_promotion_type;
        }
        if ((i & 4) != 0) {
            cLIPromotionStatus = creditCardCLIFeature.cli_promotion_status;
        }
        if ((i & 8) != 0) {
            promotionDetails = creditCardCLIFeature.promotion_details;
        }
        if ((i & 16) != 0) {
            byteString = creditCardCLIFeature.unknownFields();
        }
        ByteString byteString2 = byteString;
        CLIPromotionStatus cLIPromotionStatus2 = cLIPromotionStatus;
        return creditCardCLIFeature.copy(cLIPenaltyType, cLIPromotionType, cLIPromotionStatus2, promotionDetails, byteString2);
    }

    public final CreditCardCLIFeature copy(CLIPenaltyType cli_penalty_type, CLIPromotionType cli_promotion_type, CLIPromotionStatus cli_promotion_status, PromotionDetails promotion_details, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(cli_penalty_type, "cli_penalty_type");
        Intrinsics.checkNotNullParameter(cli_promotion_type, "cli_promotion_type");
        Intrinsics.checkNotNullParameter(cli_promotion_status, "cli_promotion_status");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CreditCardCLIFeature(cli_penalty_type, cli_promotion_type, cli_promotion_status, promotion_details, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CreditCardCLIFeature.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CreditCardCLIFeature>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rosetta.midas.v1.CreditCardCLIFeature$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CreditCardCLIFeature value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getCli_penalty_type() != CreditCardCLIFeature.CLIPenaltyType.CLAWBACK_PENALTY_TYPE_UNSPECIFIED) {
                    size += CreditCardCLIFeature.CLIPenaltyType.ADAPTER.encodedSizeWithTag(1, value.getCli_penalty_type());
                }
                if (value.getCli_promotion_type() != CreditCardCLIFeature.CLIPromotionType.CLI_PROMOTION_TYPE_UNSPECIFIED) {
                    size += CreditCardCLIFeature.CLIPromotionType.ADAPTER.encodedSizeWithTag(2, value.getCli_promotion_type());
                }
                if (value.getCli_promotion_status() != CreditCardCLIFeature.CLIPromotionStatus.STATUS_UNSPECIFIED) {
                    size += CreditCardCLIFeature.CLIPromotionStatus.ADAPTER.encodedSizeWithTag(3, value.getCli_promotion_status());
                }
                return value.getPromotion_details() != null ? size + PromotionDetails.ADAPTER.encodedSizeWithTag(4, value.getPromotion_details()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CreditCardCLIFeature value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getCli_penalty_type() != CreditCardCLIFeature.CLIPenaltyType.CLAWBACK_PENALTY_TYPE_UNSPECIFIED) {
                    CreditCardCLIFeature.CLIPenaltyType.ADAPTER.encodeWithTag(writer, 1, (int) value.getCli_penalty_type());
                }
                if (value.getCli_promotion_type() != CreditCardCLIFeature.CLIPromotionType.CLI_PROMOTION_TYPE_UNSPECIFIED) {
                    CreditCardCLIFeature.CLIPromotionType.ADAPTER.encodeWithTag(writer, 2, (int) value.getCli_promotion_type());
                }
                if (value.getCli_promotion_status() != CreditCardCLIFeature.CLIPromotionStatus.STATUS_UNSPECIFIED) {
                    CreditCardCLIFeature.CLIPromotionStatus.ADAPTER.encodeWithTag(writer, 3, (int) value.getCli_promotion_status());
                }
                if (value.getPromotion_details() != null) {
                    PromotionDetails.ADAPTER.encodeWithTag(writer, 4, (int) value.getPromotion_details());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CreditCardCLIFeature value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getPromotion_details() != null) {
                    PromotionDetails.ADAPTER.encodeWithTag(writer, 4, (int) value.getPromotion_details());
                }
                if (value.getCli_promotion_status() != CreditCardCLIFeature.CLIPromotionStatus.STATUS_UNSPECIFIED) {
                    CreditCardCLIFeature.CLIPromotionStatus.ADAPTER.encodeWithTag(writer, 3, (int) value.getCli_promotion_status());
                }
                if (value.getCli_promotion_type() != CreditCardCLIFeature.CLIPromotionType.CLI_PROMOTION_TYPE_UNSPECIFIED) {
                    CreditCardCLIFeature.CLIPromotionType.ADAPTER.encodeWithTag(writer, 2, (int) value.getCli_promotion_type());
                }
                if (value.getCli_penalty_type() != CreditCardCLIFeature.CLIPenaltyType.CLAWBACK_PENALTY_TYPE_UNSPECIFIED) {
                    CreditCardCLIFeature.CLIPenaltyType.ADAPTER.encodeWithTag(writer, 1, (int) value.getCli_penalty_type());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CreditCardCLIFeature decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                CreditCardCLIFeature.CLIPenaltyType cLIPenaltyTypeDecode = CreditCardCLIFeature.CLIPenaltyType.CLAWBACK_PENALTY_TYPE_UNSPECIFIED;
                CreditCardCLIFeature.CLIPromotionType cLIPromotionType = CreditCardCLIFeature.CLIPromotionType.CLI_PROMOTION_TYPE_UNSPECIFIED;
                CreditCardCLIFeature.CLIPromotionStatus cLIPromotionStatus = CreditCardCLIFeature.CLIPromotionStatus.STATUS_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                PromotionDetails promotionDetailsDecode = null;
                CreditCardCLIFeature.CLIPromotionStatus cLIPromotionStatusDecode = cLIPromotionStatus;
                CreditCardCLIFeature.CLIPromotionType cLIPromotionTypeDecode = cLIPromotionType;
                while (true) {
                    CreditCardCLIFeature.CLIPenaltyType cLIPenaltyType = cLIPenaltyTypeDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new CreditCardCLIFeature(cLIPenaltyType, cLIPromotionTypeDecode, cLIPromotionStatusDecode, promotionDetailsDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            try {
                                cLIPenaltyTypeDecode = CreditCardCLIFeature.CLIPenaltyType.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 2) {
                            try {
                                cLIPromotionTypeDecode = CreditCardCLIFeature.CLIPromotionType.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            }
                        } else if (iNextTag == 3) {
                            try {
                                cLIPromotionStatusDecode = CreditCardCLIFeature.CLIPromotionStatus.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                            }
                        } else if (iNextTag == 4) {
                            promotionDetailsDecode = PromotionDetails.ADAPTER.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CreditCardCLIFeature redact(CreditCardCLIFeature value) {
                Intrinsics.checkNotNullParameter(value, "value");
                PromotionDetails promotion_details = value.getPromotion_details();
                return CreditCardCLIFeature.copy$default(value, null, null, null, promotion_details != null ? PromotionDetails.ADAPTER.redact(promotion_details) : null, ByteString.EMPTY, 7, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CreditCardCLIFeature.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, m3636d2 = {"Lrosetta/midas/v1/CreditCardCLIFeature$CLIPromotionType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "CLI_PROMOTION_TYPE_UNSPECIFIED", "CLI_300", "CLI_1000", "CLI_2500", "CLI_5000", "CLI_FLEXIBLE", "Companion", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes25.dex */
    public static final class CLIPromotionType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CLIPromotionType[] $VALUES;

        @JvmField
        public static final ProtoAdapter<CLIPromotionType> ADAPTER;
        public static final CLIPromotionType CLI_1000;
        public static final CLIPromotionType CLI_2500;
        public static final CLIPromotionType CLI_300;
        public static final CLIPromotionType CLI_5000;
        public static final CLIPromotionType CLI_FLEXIBLE;
        public static final CLIPromotionType CLI_PROMOTION_TYPE_UNSPECIFIED;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final int value;

        private static final /* synthetic */ CLIPromotionType[] $values() {
            return new CLIPromotionType[]{CLI_PROMOTION_TYPE_UNSPECIFIED, CLI_300, CLI_1000, CLI_2500, CLI_5000, CLI_FLEXIBLE};
        }

        @JvmStatic
        public static final CLIPromotionType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<CLIPromotionType> getEntries() {
            return $ENTRIES;
        }

        private CLIPromotionType(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final CLIPromotionType cLIPromotionType = new CLIPromotionType("CLI_PROMOTION_TYPE_UNSPECIFIED", 0, 0);
            CLI_PROMOTION_TYPE_UNSPECIFIED = cLIPromotionType;
            CLI_300 = new CLIPromotionType("CLI_300", 1, 1);
            CLI_1000 = new CLIPromotionType("CLI_1000", 2, 2);
            CLI_2500 = new CLIPromotionType("CLI_2500", 3, 3);
            CLI_5000 = new CLIPromotionType("CLI_5000", 4, 4);
            CLI_FLEXIBLE = new CLIPromotionType("CLI_FLEXIBLE", 5, 5);
            CLIPromotionType[] cLIPromotionTypeArr$values = $values();
            $VALUES = cLIPromotionTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(cLIPromotionTypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CLIPromotionType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<CLIPromotionType>(orCreateKotlinClass, syntax, cLIPromotionType) { // from class: rosetta.midas.v1.CreditCardCLIFeature$CLIPromotionType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public CreditCardCLIFeature.CLIPromotionType fromValue(int value) {
                    return CreditCardCLIFeature.CLIPromotionType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: CreditCardCLIFeature.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lrosetta/midas/v1/CreditCardCLIFeature$CLIPromotionType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lrosetta/midas/v1/CreditCardCLIFeature$CLIPromotionType;", "fromValue", "value", "", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final CLIPromotionType fromValue(int value) {
                if (value == 0) {
                    return CLIPromotionType.CLI_PROMOTION_TYPE_UNSPECIFIED;
                }
                if (value == 1) {
                    return CLIPromotionType.CLI_300;
                }
                if (value == 2) {
                    return CLIPromotionType.CLI_1000;
                }
                if (value == 3) {
                    return CLIPromotionType.CLI_2500;
                }
                if (value == 4) {
                    return CLIPromotionType.CLI_5000;
                }
                if (value != 5) {
                    return null;
                }
                return CLIPromotionType.CLI_FLEXIBLE;
            }
        }

        public static CLIPromotionType valueOf(String str) {
            return (CLIPromotionType) Enum.valueOf(CLIPromotionType.class, str);
        }

        public static CLIPromotionType[] values() {
            return (CLIPromotionType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CreditCardCLIFeature.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u00102\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, m3636d2 = {"Lrosetta/midas/v1/CreditCardCLIFeature$CLIPromotionStatus;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "STATUS_UNSPECIFIED", "DISABLED", "ELIGIBLE", "ACTIVATED", "REVOKED", "EXPIRED", "PENDING_ACTIVATION", "Companion", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes25.dex */
    public static final class CLIPromotionStatus implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CLIPromotionStatus[] $VALUES;
        public static final CLIPromotionStatus ACTIVATED;

        @JvmField
        public static final ProtoAdapter<CLIPromotionStatus> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final CLIPromotionStatus DISABLED;
        public static final CLIPromotionStatus ELIGIBLE;
        public static final CLIPromotionStatus EXPIRED;
        public static final CLIPromotionStatus PENDING_ACTIVATION;
        public static final CLIPromotionStatus REVOKED;
        public static final CLIPromotionStatus STATUS_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ CLIPromotionStatus[] $values() {
            return new CLIPromotionStatus[]{STATUS_UNSPECIFIED, DISABLED, ELIGIBLE, ACTIVATED, REVOKED, EXPIRED, PENDING_ACTIVATION};
        }

        @JvmStatic
        public static final CLIPromotionStatus fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<CLIPromotionStatus> getEntries() {
            return $ENTRIES;
        }

        private CLIPromotionStatus(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final CLIPromotionStatus cLIPromotionStatus = new CLIPromotionStatus("STATUS_UNSPECIFIED", 0, 0);
            STATUS_UNSPECIFIED = cLIPromotionStatus;
            DISABLED = new CLIPromotionStatus("DISABLED", 1, 1);
            ELIGIBLE = new CLIPromotionStatus("ELIGIBLE", 2, 2);
            ACTIVATED = new CLIPromotionStatus("ACTIVATED", 3, 3);
            REVOKED = new CLIPromotionStatus("REVOKED", 4, 4);
            EXPIRED = new CLIPromotionStatus("EXPIRED", 5, 5);
            PENDING_ACTIVATION = new CLIPromotionStatus("PENDING_ACTIVATION", 6, 6);
            CLIPromotionStatus[] cLIPromotionStatusArr$values = $values();
            $VALUES = cLIPromotionStatusArr$values;
            $ENTRIES = EnumEntries2.enumEntries(cLIPromotionStatusArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CLIPromotionStatus.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<CLIPromotionStatus>(orCreateKotlinClass, syntax, cLIPromotionStatus) { // from class: rosetta.midas.v1.CreditCardCLIFeature$CLIPromotionStatus$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public CreditCardCLIFeature.CLIPromotionStatus fromValue(int value) {
                    return CreditCardCLIFeature.CLIPromotionStatus.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: CreditCardCLIFeature.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lrosetta/midas/v1/CreditCardCLIFeature$CLIPromotionStatus$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lrosetta/midas/v1/CreditCardCLIFeature$CLIPromotionStatus;", "fromValue", "value", "", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final CLIPromotionStatus fromValue(int value) {
                switch (value) {
                    case 0:
                        return CLIPromotionStatus.STATUS_UNSPECIFIED;
                    case 1:
                        return CLIPromotionStatus.DISABLED;
                    case 2:
                        return CLIPromotionStatus.ELIGIBLE;
                    case 3:
                        return CLIPromotionStatus.ACTIVATED;
                    case 4:
                        return CLIPromotionStatus.REVOKED;
                    case 5:
                        return CLIPromotionStatus.EXPIRED;
                    case 6:
                        return CLIPromotionStatus.PENDING_ACTIVATION;
                    default:
                        return null;
                }
            }
        }

        public static CLIPromotionStatus valueOf(String str) {
            return (CLIPromotionStatus) Enum.valueOf(CLIPromotionStatus.class, str);
        }

        public static CLIPromotionStatus[] values() {
            return (CLIPromotionStatus[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CreditCardCLIFeature.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, m3636d2 = {"Lrosetta/midas/v1/CreditCardCLIFeature$CLIPenaltyType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "CLAWBACK_PENALTY_TYPE_UNSPECIFIED", "CLI_CLAWBACK", "Companion", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes25.dex */
    public static final class CLIPenaltyType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CLIPenaltyType[] $VALUES;

        @JvmField
        public static final ProtoAdapter<CLIPenaltyType> ADAPTER;
        public static final CLIPenaltyType CLAWBACK_PENALTY_TYPE_UNSPECIFIED;
        public static final CLIPenaltyType CLI_CLAWBACK;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final int value;

        private static final /* synthetic */ CLIPenaltyType[] $values() {
            return new CLIPenaltyType[]{CLAWBACK_PENALTY_TYPE_UNSPECIFIED, CLI_CLAWBACK};
        }

        @JvmStatic
        public static final CLIPenaltyType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<CLIPenaltyType> getEntries() {
            return $ENTRIES;
        }

        private CLIPenaltyType(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final CLIPenaltyType cLIPenaltyType = new CLIPenaltyType("CLAWBACK_PENALTY_TYPE_UNSPECIFIED", 0, 0);
            CLAWBACK_PENALTY_TYPE_UNSPECIFIED = cLIPenaltyType;
            CLI_CLAWBACK = new CLIPenaltyType("CLI_CLAWBACK", 1, 1);
            CLIPenaltyType[] cLIPenaltyTypeArr$values = $values();
            $VALUES = cLIPenaltyTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(cLIPenaltyTypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CLIPenaltyType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<CLIPenaltyType>(orCreateKotlinClass, syntax, cLIPenaltyType) { // from class: rosetta.midas.v1.CreditCardCLIFeature$CLIPenaltyType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public CreditCardCLIFeature.CLIPenaltyType fromValue(int value) {
                    return CreditCardCLIFeature.CLIPenaltyType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: CreditCardCLIFeature.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lrosetta/midas/v1/CreditCardCLIFeature$CLIPenaltyType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lrosetta/midas/v1/CreditCardCLIFeature$CLIPenaltyType;", "fromValue", "value", "", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final CLIPenaltyType fromValue(int value) {
                if (value == 0) {
                    return CLIPenaltyType.CLAWBACK_PENALTY_TYPE_UNSPECIFIED;
                }
                if (value != 1) {
                    return null;
                }
                return CLIPenaltyType.CLI_CLAWBACK;
            }
        }

        public static CLIPenaltyType valueOf(String str) {
            return (CLIPenaltyType) Enum.valueOf(CLIPenaltyType.class, str);
        }

        public static CLIPenaltyType[] values() {
            return (CLIPenaltyType[]) $VALUES.clone();
        }
    }
}
