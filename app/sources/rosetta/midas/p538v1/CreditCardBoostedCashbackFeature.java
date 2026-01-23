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
import rosetta.midas.p538v1.CreditCardBoostedCashbackFeature;

/* compiled from: CreditCardBoostedCashbackFeature.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004!\"#$B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016J:\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006%"}, m3636d2 = {"Lrosetta/midas/v1/CreditCardBoostedCashbackFeature;", "Lcom/squareup/wire/Message;", "", "clawback_penalty_type", "Lrosetta/midas/v1/CreditCardBoostedCashbackFeature$ClawbackPenaltyType;", "cashback_promotion_type", "Lrosetta/midas/v1/CreditCardBoostedCashbackFeature$CashbackPromotionType;", "cashback_promotion_status", "Lrosetta/midas/v1/CreditCardBoostedCashbackFeature$CashbackPromotionStatus;", "promotion_details", "Lrosetta/midas/v1/PromotionDetails;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrosetta/midas/v1/CreditCardBoostedCashbackFeature$ClawbackPenaltyType;Lrosetta/midas/v1/CreditCardBoostedCashbackFeature$CashbackPromotionType;Lrosetta/midas/v1/CreditCardBoostedCashbackFeature$CashbackPromotionStatus;Lrosetta/midas/v1/PromotionDetails;Lokio/ByteString;)V", "getClawback_penalty_type", "()Lrosetta/midas/v1/CreditCardBoostedCashbackFeature$ClawbackPenaltyType;", "getCashback_promotion_type", "()Lrosetta/midas/v1/CreditCardBoostedCashbackFeature$CashbackPromotionType;", "getCashback_promotion_status", "()Lrosetta/midas/v1/CreditCardBoostedCashbackFeature$CashbackPromotionStatus;", "getPromotion_details", "()Lrosetta/midas/v1/PromotionDetails;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "CashbackPromotionType", "CashbackPromotionStatus", "ClawbackPenaltyType", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class CreditCardBoostedCashbackFeature extends Message {

    @JvmField
    public static final ProtoAdapter<CreditCardBoostedCashbackFeature> ADAPTER;

    @WireField(adapter = "rosetta.midas.v1.CreditCardBoostedCashbackFeature$CashbackPromotionStatus#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final CashbackPromotionStatus cashback_promotion_status;

    @WireField(adapter = "rosetta.midas.v1.CreditCardBoostedCashbackFeature$CashbackPromotionType#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final CashbackPromotionType cashback_promotion_type;

    @WireField(adapter = "rosetta.midas.v1.CreditCardBoostedCashbackFeature$ClawbackPenaltyType#ADAPTER", jsonName = "cashback_penalty_type", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final ClawbackPenaltyType clawback_penalty_type;

    @WireField(adapter = "rosetta.midas.v1.PromotionDetails#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final PromotionDetails promotion_details;

    public CreditCardBoostedCashbackFeature() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29892newBuilder();
    }

    public final ClawbackPenaltyType getClawback_penalty_type() {
        return this.clawback_penalty_type;
    }

    public /* synthetic */ CreditCardBoostedCashbackFeature(ClawbackPenaltyType clawbackPenaltyType, CashbackPromotionType cashbackPromotionType, CashbackPromotionStatus cashbackPromotionStatus, PromotionDetails promotionDetails, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ClawbackPenaltyType.CLAWBACK_PENALTY_TYPE_UNSPECIFIED : clawbackPenaltyType, (i & 2) != 0 ? CashbackPromotionType.CASHBACK_PROMOTION_TYPE_UNSPECIFIED : cashbackPromotionType, (i & 4) != 0 ? CashbackPromotionStatus.STATUS_UNSPECIFIED : cashbackPromotionStatus, (i & 8) != 0 ? null : promotionDetails, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    public final CashbackPromotionType getCashback_promotion_type() {
        return this.cashback_promotion_type;
    }

    public final CashbackPromotionStatus getCashback_promotion_status() {
        return this.cashback_promotion_status;
    }

    public final PromotionDetails getPromotion_details() {
        return this.promotion_details;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreditCardBoostedCashbackFeature(ClawbackPenaltyType clawback_penalty_type, CashbackPromotionType cashback_promotion_type, CashbackPromotionStatus cashback_promotion_status, PromotionDetails promotionDetails, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(clawback_penalty_type, "clawback_penalty_type");
        Intrinsics.checkNotNullParameter(cashback_promotion_type, "cashback_promotion_type");
        Intrinsics.checkNotNullParameter(cashback_promotion_status, "cashback_promotion_status");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.clawback_penalty_type = clawback_penalty_type;
        this.cashback_promotion_type = cashback_promotion_type;
        this.cashback_promotion_status = cashback_promotion_status;
        this.promotion_details = promotionDetails;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29892newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CreditCardBoostedCashbackFeature)) {
            return false;
        }
        CreditCardBoostedCashbackFeature creditCardBoostedCashbackFeature = (CreditCardBoostedCashbackFeature) other;
        return Intrinsics.areEqual(unknownFields(), creditCardBoostedCashbackFeature.unknownFields()) && this.clawback_penalty_type == creditCardBoostedCashbackFeature.clawback_penalty_type && this.cashback_promotion_type == creditCardBoostedCashbackFeature.cashback_promotion_type && this.cashback_promotion_status == creditCardBoostedCashbackFeature.cashback_promotion_status && Intrinsics.areEqual(this.promotion_details, creditCardBoostedCashbackFeature.promotion_details);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.clawback_penalty_type.hashCode()) * 37) + this.cashback_promotion_type.hashCode()) * 37) + this.cashback_promotion_status.hashCode()) * 37;
        PromotionDetails promotionDetails = this.promotion_details;
        int iHashCode2 = iHashCode + (promotionDetails != null ? promotionDetails.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("clawback_penalty_type=" + this.clawback_penalty_type);
        arrayList.add("cashback_promotion_type=" + this.cashback_promotion_type);
        arrayList.add("cashback_promotion_status=" + this.cashback_promotion_status);
        PromotionDetails promotionDetails = this.promotion_details;
        if (promotionDetails != null) {
            arrayList.add("promotion_details=" + promotionDetails);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CreditCardBoostedCashbackFeature{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ CreditCardBoostedCashbackFeature copy$default(CreditCardBoostedCashbackFeature creditCardBoostedCashbackFeature, ClawbackPenaltyType clawbackPenaltyType, CashbackPromotionType cashbackPromotionType, CashbackPromotionStatus cashbackPromotionStatus, PromotionDetails promotionDetails, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            clawbackPenaltyType = creditCardBoostedCashbackFeature.clawback_penalty_type;
        }
        if ((i & 2) != 0) {
            cashbackPromotionType = creditCardBoostedCashbackFeature.cashback_promotion_type;
        }
        if ((i & 4) != 0) {
            cashbackPromotionStatus = creditCardBoostedCashbackFeature.cashback_promotion_status;
        }
        if ((i & 8) != 0) {
            promotionDetails = creditCardBoostedCashbackFeature.promotion_details;
        }
        if ((i & 16) != 0) {
            byteString = creditCardBoostedCashbackFeature.unknownFields();
        }
        ByteString byteString2 = byteString;
        CashbackPromotionStatus cashbackPromotionStatus2 = cashbackPromotionStatus;
        return creditCardBoostedCashbackFeature.copy(clawbackPenaltyType, cashbackPromotionType, cashbackPromotionStatus2, promotionDetails, byteString2);
    }

    public final CreditCardBoostedCashbackFeature copy(ClawbackPenaltyType clawback_penalty_type, CashbackPromotionType cashback_promotion_type, CashbackPromotionStatus cashback_promotion_status, PromotionDetails promotion_details, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(clawback_penalty_type, "clawback_penalty_type");
        Intrinsics.checkNotNullParameter(cashback_promotion_type, "cashback_promotion_type");
        Intrinsics.checkNotNullParameter(cashback_promotion_status, "cashback_promotion_status");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CreditCardBoostedCashbackFeature(clawback_penalty_type, cashback_promotion_type, cashback_promotion_status, promotion_details, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CreditCardBoostedCashbackFeature.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CreditCardBoostedCashbackFeature>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rosetta.midas.v1.CreditCardBoostedCashbackFeature$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CreditCardBoostedCashbackFeature value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getClawback_penalty_type() != CreditCardBoostedCashbackFeature.ClawbackPenaltyType.CLAWBACK_PENALTY_TYPE_UNSPECIFIED) {
                    size += CreditCardBoostedCashbackFeature.ClawbackPenaltyType.ADAPTER.encodedSizeWithTag(1, value.getClawback_penalty_type());
                }
                if (value.getCashback_promotion_type() != CreditCardBoostedCashbackFeature.CashbackPromotionType.CASHBACK_PROMOTION_TYPE_UNSPECIFIED) {
                    size += CreditCardBoostedCashbackFeature.CashbackPromotionType.ADAPTER.encodedSizeWithTag(2, value.getCashback_promotion_type());
                }
                if (value.getCashback_promotion_status() != CreditCardBoostedCashbackFeature.CashbackPromotionStatus.STATUS_UNSPECIFIED) {
                    size += CreditCardBoostedCashbackFeature.CashbackPromotionStatus.ADAPTER.encodedSizeWithTag(3, value.getCashback_promotion_status());
                }
                return value.getPromotion_details() != null ? size + PromotionDetails.ADAPTER.encodedSizeWithTag(4, value.getPromotion_details()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CreditCardBoostedCashbackFeature value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getClawback_penalty_type() != CreditCardBoostedCashbackFeature.ClawbackPenaltyType.CLAWBACK_PENALTY_TYPE_UNSPECIFIED) {
                    CreditCardBoostedCashbackFeature.ClawbackPenaltyType.ADAPTER.encodeWithTag(writer, 1, (int) value.getClawback_penalty_type());
                }
                if (value.getCashback_promotion_type() != CreditCardBoostedCashbackFeature.CashbackPromotionType.CASHBACK_PROMOTION_TYPE_UNSPECIFIED) {
                    CreditCardBoostedCashbackFeature.CashbackPromotionType.ADAPTER.encodeWithTag(writer, 2, (int) value.getCashback_promotion_type());
                }
                if (value.getCashback_promotion_status() != CreditCardBoostedCashbackFeature.CashbackPromotionStatus.STATUS_UNSPECIFIED) {
                    CreditCardBoostedCashbackFeature.CashbackPromotionStatus.ADAPTER.encodeWithTag(writer, 3, (int) value.getCashback_promotion_status());
                }
                if (value.getPromotion_details() != null) {
                    PromotionDetails.ADAPTER.encodeWithTag(writer, 4, (int) value.getPromotion_details());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CreditCardBoostedCashbackFeature value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getPromotion_details() != null) {
                    PromotionDetails.ADAPTER.encodeWithTag(writer, 4, (int) value.getPromotion_details());
                }
                if (value.getCashback_promotion_status() != CreditCardBoostedCashbackFeature.CashbackPromotionStatus.STATUS_UNSPECIFIED) {
                    CreditCardBoostedCashbackFeature.CashbackPromotionStatus.ADAPTER.encodeWithTag(writer, 3, (int) value.getCashback_promotion_status());
                }
                if (value.getCashback_promotion_type() != CreditCardBoostedCashbackFeature.CashbackPromotionType.CASHBACK_PROMOTION_TYPE_UNSPECIFIED) {
                    CreditCardBoostedCashbackFeature.CashbackPromotionType.ADAPTER.encodeWithTag(writer, 2, (int) value.getCashback_promotion_type());
                }
                if (value.getClawback_penalty_type() != CreditCardBoostedCashbackFeature.ClawbackPenaltyType.CLAWBACK_PENALTY_TYPE_UNSPECIFIED) {
                    CreditCardBoostedCashbackFeature.ClawbackPenaltyType.ADAPTER.encodeWithTag(writer, 1, (int) value.getClawback_penalty_type());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CreditCardBoostedCashbackFeature decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                CreditCardBoostedCashbackFeature.ClawbackPenaltyType clawbackPenaltyTypeDecode = CreditCardBoostedCashbackFeature.ClawbackPenaltyType.CLAWBACK_PENALTY_TYPE_UNSPECIFIED;
                CreditCardBoostedCashbackFeature.CashbackPromotionType cashbackPromotionType = CreditCardBoostedCashbackFeature.CashbackPromotionType.CASHBACK_PROMOTION_TYPE_UNSPECIFIED;
                CreditCardBoostedCashbackFeature.CashbackPromotionStatus cashbackPromotionStatus = CreditCardBoostedCashbackFeature.CashbackPromotionStatus.STATUS_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                PromotionDetails promotionDetailsDecode = null;
                CreditCardBoostedCashbackFeature.CashbackPromotionStatus cashbackPromotionStatusDecode = cashbackPromotionStatus;
                CreditCardBoostedCashbackFeature.CashbackPromotionType cashbackPromotionTypeDecode = cashbackPromotionType;
                while (true) {
                    CreditCardBoostedCashbackFeature.ClawbackPenaltyType clawbackPenaltyType = clawbackPenaltyTypeDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new CreditCardBoostedCashbackFeature(clawbackPenaltyType, cashbackPromotionTypeDecode, cashbackPromotionStatusDecode, promotionDetailsDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            try {
                                clawbackPenaltyTypeDecode = CreditCardBoostedCashbackFeature.ClawbackPenaltyType.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 2) {
                            try {
                                cashbackPromotionTypeDecode = CreditCardBoostedCashbackFeature.CashbackPromotionType.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            }
                        } else if (iNextTag == 3) {
                            try {
                                cashbackPromotionStatusDecode = CreditCardBoostedCashbackFeature.CashbackPromotionStatus.ADAPTER.decode(reader);
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
            public CreditCardBoostedCashbackFeature redact(CreditCardBoostedCashbackFeature value) {
                Intrinsics.checkNotNullParameter(value, "value");
                PromotionDetails promotion_details = value.getPromotion_details();
                return CreditCardBoostedCashbackFeature.copy$default(value, null, null, null, promotion_details != null ? PromotionDetails.ADAPTER.redact(promotion_details) : null, ByteString.EMPTY, 7, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CreditCardBoostedCashbackFeature.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lrosetta/midas/v1/CreditCardBoostedCashbackFeature$CashbackPromotionType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "CASHBACK_PROMOTION_TYPE_UNSPECIFIED", "FOUR_PERCENT", "FIVE_PERCENT", "Companion", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes25.dex */
    public static final class CashbackPromotionType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CashbackPromotionType[] $VALUES;

        @JvmField
        public static final ProtoAdapter<CashbackPromotionType> ADAPTER;
        public static final CashbackPromotionType CASHBACK_PROMOTION_TYPE_UNSPECIFIED;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final CashbackPromotionType FIVE_PERCENT;
        public static final CashbackPromotionType FOUR_PERCENT;
        private final int value;

        private static final /* synthetic */ CashbackPromotionType[] $values() {
            return new CashbackPromotionType[]{CASHBACK_PROMOTION_TYPE_UNSPECIFIED, FOUR_PERCENT, FIVE_PERCENT};
        }

        @JvmStatic
        public static final CashbackPromotionType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<CashbackPromotionType> getEntries() {
            return $ENTRIES;
        }

        private CashbackPromotionType(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final CashbackPromotionType cashbackPromotionType = new CashbackPromotionType("CASHBACK_PROMOTION_TYPE_UNSPECIFIED", 0, 0);
            CASHBACK_PROMOTION_TYPE_UNSPECIFIED = cashbackPromotionType;
            FOUR_PERCENT = new CashbackPromotionType("FOUR_PERCENT", 1, 1);
            FIVE_PERCENT = new CashbackPromotionType("FIVE_PERCENT", 2, 2);
            CashbackPromotionType[] cashbackPromotionTypeArr$values = $values();
            $VALUES = cashbackPromotionTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(cashbackPromotionTypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CashbackPromotionType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<CashbackPromotionType>(orCreateKotlinClass, syntax, cashbackPromotionType) { // from class: rosetta.midas.v1.CreditCardBoostedCashbackFeature$CashbackPromotionType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public CreditCardBoostedCashbackFeature.CashbackPromotionType fromValue(int value) {
                    return CreditCardBoostedCashbackFeature.CashbackPromotionType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: CreditCardBoostedCashbackFeature.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lrosetta/midas/v1/CreditCardBoostedCashbackFeature$CashbackPromotionType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lrosetta/midas/v1/CreditCardBoostedCashbackFeature$CashbackPromotionType;", "fromValue", "value", "", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final CashbackPromotionType fromValue(int value) {
                if (value == 0) {
                    return CashbackPromotionType.CASHBACK_PROMOTION_TYPE_UNSPECIFIED;
                }
                if (value == 1) {
                    return CashbackPromotionType.FOUR_PERCENT;
                }
                if (value != 2) {
                    return null;
                }
                return CashbackPromotionType.FIVE_PERCENT;
            }
        }

        public static CashbackPromotionType valueOf(String str) {
            return (CashbackPromotionType) Enum.valueOf(CashbackPromotionType.class, str);
        }

        public static CashbackPromotionType[] values() {
            return (CashbackPromotionType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CreditCardBoostedCashbackFeature.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u00102\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, m3636d2 = {"Lrosetta/midas/v1/CreditCardBoostedCashbackFeature$CashbackPromotionStatus;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "STATUS_UNSPECIFIED", "DISABLED", "ELIGIBLE", "ACTIVATED", "REVOKED", "EXPIRED", "PENDING_ACTIVATION", "Companion", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes25.dex */
    public static final class CashbackPromotionStatus implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CashbackPromotionStatus[] $VALUES;
        public static final CashbackPromotionStatus ACTIVATED;

        @JvmField
        public static final ProtoAdapter<CashbackPromotionStatus> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final CashbackPromotionStatus DISABLED;
        public static final CashbackPromotionStatus ELIGIBLE;
        public static final CashbackPromotionStatus EXPIRED;
        public static final CashbackPromotionStatus PENDING_ACTIVATION;
        public static final CashbackPromotionStatus REVOKED;
        public static final CashbackPromotionStatus STATUS_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ CashbackPromotionStatus[] $values() {
            return new CashbackPromotionStatus[]{STATUS_UNSPECIFIED, DISABLED, ELIGIBLE, ACTIVATED, REVOKED, EXPIRED, PENDING_ACTIVATION};
        }

        @JvmStatic
        public static final CashbackPromotionStatus fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<CashbackPromotionStatus> getEntries() {
            return $ENTRIES;
        }

        private CashbackPromotionStatus(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final CashbackPromotionStatus cashbackPromotionStatus = new CashbackPromotionStatus("STATUS_UNSPECIFIED", 0, 0);
            STATUS_UNSPECIFIED = cashbackPromotionStatus;
            DISABLED = new CashbackPromotionStatus("DISABLED", 1, 1);
            ELIGIBLE = new CashbackPromotionStatus("ELIGIBLE", 2, 2);
            ACTIVATED = new CashbackPromotionStatus("ACTIVATED", 3, 3);
            REVOKED = new CashbackPromotionStatus("REVOKED", 4, 4);
            EXPIRED = new CashbackPromotionStatus("EXPIRED", 5, 5);
            PENDING_ACTIVATION = new CashbackPromotionStatus("PENDING_ACTIVATION", 6, 6);
            CashbackPromotionStatus[] cashbackPromotionStatusArr$values = $values();
            $VALUES = cashbackPromotionStatusArr$values;
            $ENTRIES = EnumEntries2.enumEntries(cashbackPromotionStatusArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CashbackPromotionStatus.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<CashbackPromotionStatus>(orCreateKotlinClass, syntax, cashbackPromotionStatus) { // from class: rosetta.midas.v1.CreditCardBoostedCashbackFeature$CashbackPromotionStatus$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public CreditCardBoostedCashbackFeature.CashbackPromotionStatus fromValue(int value) {
                    return CreditCardBoostedCashbackFeature.CashbackPromotionStatus.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: CreditCardBoostedCashbackFeature.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lrosetta/midas/v1/CreditCardBoostedCashbackFeature$CashbackPromotionStatus$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lrosetta/midas/v1/CreditCardBoostedCashbackFeature$CashbackPromotionStatus;", "fromValue", "value", "", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final CashbackPromotionStatus fromValue(int value) {
                switch (value) {
                    case 0:
                        return CashbackPromotionStatus.STATUS_UNSPECIFIED;
                    case 1:
                        return CashbackPromotionStatus.DISABLED;
                    case 2:
                        return CashbackPromotionStatus.ELIGIBLE;
                    case 3:
                        return CashbackPromotionStatus.ACTIVATED;
                    case 4:
                        return CashbackPromotionStatus.REVOKED;
                    case 5:
                        return CashbackPromotionStatus.EXPIRED;
                    case 6:
                        return CashbackPromotionStatus.PENDING_ACTIVATION;
                    default:
                        return null;
                }
            }
        }

        public static CashbackPromotionStatus valueOf(String str) {
            return (CashbackPromotionStatus) Enum.valueOf(CashbackPromotionStatus.class, str);
        }

        public static CashbackPromotionStatus[] values() {
            return (CashbackPromotionStatus[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CreditCardBoostedCashbackFeature.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, m3636d2 = {"Lrosetta/midas/v1/CreditCardBoostedCashbackFeature$ClawbackPenaltyType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "CLAWBACK_PENALTY_TYPE_UNSPECIFIED", "POINTS_CLAWBACK", "Companion", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes25.dex */
    public static final class ClawbackPenaltyType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ClawbackPenaltyType[] $VALUES;

        @JvmField
        public static final ProtoAdapter<ClawbackPenaltyType> ADAPTER;
        public static final ClawbackPenaltyType CLAWBACK_PENALTY_TYPE_UNSPECIFIED;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final ClawbackPenaltyType POINTS_CLAWBACK;
        private final int value;

        private static final /* synthetic */ ClawbackPenaltyType[] $values() {
            return new ClawbackPenaltyType[]{CLAWBACK_PENALTY_TYPE_UNSPECIFIED, POINTS_CLAWBACK};
        }

        @JvmStatic
        public static final ClawbackPenaltyType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<ClawbackPenaltyType> getEntries() {
            return $ENTRIES;
        }

        private ClawbackPenaltyType(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final ClawbackPenaltyType clawbackPenaltyType = new ClawbackPenaltyType("CLAWBACK_PENALTY_TYPE_UNSPECIFIED", 0, 0);
            CLAWBACK_PENALTY_TYPE_UNSPECIFIED = clawbackPenaltyType;
            POINTS_CLAWBACK = new ClawbackPenaltyType("POINTS_CLAWBACK", 1, 1);
            ClawbackPenaltyType[] clawbackPenaltyTypeArr$values = $values();
            $VALUES = clawbackPenaltyTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(clawbackPenaltyTypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ClawbackPenaltyType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<ClawbackPenaltyType>(orCreateKotlinClass, syntax, clawbackPenaltyType) { // from class: rosetta.midas.v1.CreditCardBoostedCashbackFeature$ClawbackPenaltyType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public CreditCardBoostedCashbackFeature.ClawbackPenaltyType fromValue(int value) {
                    return CreditCardBoostedCashbackFeature.ClawbackPenaltyType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: CreditCardBoostedCashbackFeature.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lrosetta/midas/v1/CreditCardBoostedCashbackFeature$ClawbackPenaltyType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lrosetta/midas/v1/CreditCardBoostedCashbackFeature$ClawbackPenaltyType;", "fromValue", "value", "", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final ClawbackPenaltyType fromValue(int value) {
                if (value == 0) {
                    return ClawbackPenaltyType.CLAWBACK_PENALTY_TYPE_UNSPECIFIED;
                }
                if (value != 1) {
                    return null;
                }
                return ClawbackPenaltyType.POINTS_CLAWBACK;
            }
        }

        public static ClawbackPenaltyType valueOf(String str) {
            return (ClawbackPenaltyType) Enum.valueOf(ClawbackPenaltyType.class, str);
        }

        public static ClawbackPenaltyType[] values() {
            return (ClawbackPenaltyType[]) $VALUES.clone();
        }
    }
}
