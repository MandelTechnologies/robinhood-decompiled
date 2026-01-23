package rosetta.order;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: InitiatorTypeDto.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b&\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 32\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u000234B\u0013\b\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0016J\b\u00102\u001a\u000201H\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+¨\u00065"}, m3636d2 = {"Lrosetta/order/InitiatorTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lrosetta/order/InitiatorType;", "Landroid/os/Parcelable;", "", "json_value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getJson_value", "()Ljava/lang/String;", "INITIATOR_TYPE_UNSPECIFIED", "INITIATOR_TYPE_RECURRING", "INITIATOR_TYPE_PLUTO", "INITIATOR_TYPE_CHECKOUT_FLOW", "INITIATOR_TYPE_DEBIT_CARD_FUNDING", "INITIATOR_TYPE_PAYMENT_HUB", "INITIATOR_TYPE_INSTANT_BANK_TRANSFER", "INITIATOR_TYPE_CRYPTO_TRANSFERS", "INITIATOR_TYPE_CATPAY", "INITIATOR_TYPE_CHECK_TRANSFER", "INITIATOR_TYPE_INCOMING_WIRE_TRANSFER", "INITIATOR_TYPE_UK_BANK_TRANSFER", "INITIATOR_TYPE_TRADING_VIEW", "INITIATOR_TYPE_API_TRADING", "INITIATOR_TYPE_OUTGOING_WIRE_TRANSFER", "INITIATOR_TYPE_ADVISORY", "INITIATOR_TYPE_CRYPTO_TRADE_BONUS", "INITIATOR_TYPE_ASSET_TRANSFER", "INITIATOR_TYPE_CRYPTO_TOKENIZATION", "INITIATOR_TYPE_SG_BANK_TRANSFER", "INITIATOR_TYPE_ROLLOVER_ACH", "INITIATOR_TYPE_ACAT_FRACTIONAL_LIQUIDATION", "INITIATOR_TYPE_CRYPTO_TRANSFERS_FEE_REFUND", "INITIATOR_TYPE_FX_TRANSFER", "INITIATOR_TYPE_ACH", "INITIATOR_TYPE_FRAUD_DEACTIVATION", "INITIATOR_TYPE_CRYPTO_LADDER", "INITIATOR_TYPE_CRYPTO_MAC", "INITIATOR_TYPE_CRYPTO_FLATTEN", "INITIATOR_TYPE_PAYCHECK", "INITIATOR_TYPE_UK_OPEN_BANKING_TRANSFER", "INITIATOR_TYPE_OUTGOING_CHECK", "INITIATOR_TYPE_CC_CRYPTO_REDEMPTION", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "rosetta.order_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public abstract class InitiatorTypeDto implements Dto2<InitiatorType>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ InitiatorTypeDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<InitiatorTypeDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<InitiatorTypeDto, InitiatorType>> binaryBase64Serializer$delegate;
    private final String json_value;
    public static final InitiatorTypeDto INITIATOR_TYPE_UNSPECIFIED = new InitiatorTypeDto("INITIATOR_TYPE_UNSPECIFIED", 0) { // from class: rosetta.order.InitiatorTypeDto.INITIATOR_TYPE_UNSPECIFIED
        {
            String str = "";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public InitiatorType toProto() {
            return InitiatorType.INITIATOR_TYPE_UNSPECIFIED;
        }
    };
    public static final InitiatorTypeDto INITIATOR_TYPE_RECURRING = new InitiatorTypeDto("INITIATOR_TYPE_RECURRING", 1) { // from class: rosetta.order.InitiatorTypeDto.INITIATOR_TYPE_RECURRING
        {
            String str = "recurring";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public InitiatorType toProto() {
            return InitiatorType.INITIATOR_TYPE_RECURRING;
        }
    };
    public static final InitiatorTypeDto INITIATOR_TYPE_PLUTO = new InitiatorTypeDto("INITIATOR_TYPE_PLUTO", 2) { // from class: rosetta.order.InitiatorTypeDto.INITIATOR_TYPE_PLUTO
        {
            String str = "pluto";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public InitiatorType toProto() {
            return InitiatorType.INITIATOR_TYPE_PLUTO;
        }
    };
    public static final InitiatorTypeDto INITIATOR_TYPE_CHECKOUT_FLOW = new InitiatorTypeDto("INITIATOR_TYPE_CHECKOUT_FLOW", 3) { // from class: rosetta.order.InitiatorTypeDto.INITIATOR_TYPE_CHECKOUT_FLOW
        {
            String str = "checkout_flow";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public InitiatorType toProto() {
            return InitiatorType.INITIATOR_TYPE_CHECKOUT_FLOW;
        }
    };
    public static final InitiatorTypeDto INITIATOR_TYPE_DEBIT_CARD_FUNDING = new InitiatorTypeDto("INITIATOR_TYPE_DEBIT_CARD_FUNDING", 4) { // from class: rosetta.order.InitiatorTypeDto.INITIATOR_TYPE_DEBIT_CARD_FUNDING
        {
            String str = "debit_card_funding";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public InitiatorType toProto() {
            return InitiatorType.INITIATOR_TYPE_DEBIT_CARD_FUNDING;
        }
    };
    public static final InitiatorTypeDto INITIATOR_TYPE_PAYMENT_HUB = new InitiatorTypeDto("INITIATOR_TYPE_PAYMENT_HUB", 5) { // from class: rosetta.order.InitiatorTypeDto.INITIATOR_TYPE_PAYMENT_HUB
        {
            String str = "payment_hub";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public InitiatorType toProto() {
            return InitiatorType.INITIATOR_TYPE_PAYMENT_HUB;
        }
    };
    public static final InitiatorTypeDto INITIATOR_TYPE_INSTANT_BANK_TRANSFER = new InitiatorTypeDto("INITIATOR_TYPE_INSTANT_BANK_TRANSFER", 6) { // from class: rosetta.order.InitiatorTypeDto.INITIATOR_TYPE_INSTANT_BANK_TRANSFER
        {
            String str = "instant_bank_transfer";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public InitiatorType toProto() {
            return InitiatorType.INITIATOR_TYPE_INSTANT_BANK_TRANSFER;
        }
    };
    public static final InitiatorTypeDto INITIATOR_TYPE_CRYPTO_TRANSFERS = new InitiatorTypeDto("INITIATOR_TYPE_CRYPTO_TRANSFERS", 7) { // from class: rosetta.order.InitiatorTypeDto.INITIATOR_TYPE_CRYPTO_TRANSFERS
        {
            String str = "crypto_transfers";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public InitiatorType toProto() {
            return InitiatorType.INITIATOR_TYPE_CRYPTO_TRANSFERS;
        }
    };
    public static final InitiatorTypeDto INITIATOR_TYPE_CATPAY = new InitiatorTypeDto("INITIATOR_TYPE_CATPAY", 8) { // from class: rosetta.order.InitiatorTypeDto.INITIATOR_TYPE_CATPAY
        {
            String str = "catpay";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public InitiatorType toProto() {
            return InitiatorType.INITIATOR_TYPE_CATPAY;
        }
    };
    public static final InitiatorTypeDto INITIATOR_TYPE_CHECK_TRANSFER = new InitiatorTypeDto("INITIATOR_TYPE_CHECK_TRANSFER", 9) { // from class: rosetta.order.InitiatorTypeDto.INITIATOR_TYPE_CHECK_TRANSFER
        {
            String str = "check_transfer";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public InitiatorType toProto() {
            return InitiatorType.INITIATOR_TYPE_CHECK_TRANSFER;
        }
    };
    public static final InitiatorTypeDto INITIATOR_TYPE_INCOMING_WIRE_TRANSFER = new InitiatorTypeDto("INITIATOR_TYPE_INCOMING_WIRE_TRANSFER", 10) { // from class: rosetta.order.InitiatorTypeDto.INITIATOR_TYPE_INCOMING_WIRE_TRANSFER
        {
            String str = "incoming_wire_transfer";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public InitiatorType toProto() {
            return InitiatorType.INITIATOR_TYPE_INCOMING_WIRE_TRANSFER;
        }
    };
    public static final InitiatorTypeDto INITIATOR_TYPE_UK_BANK_TRANSFER = new InitiatorTypeDto("INITIATOR_TYPE_UK_BANK_TRANSFER", 11) { // from class: rosetta.order.InitiatorTypeDto.INITIATOR_TYPE_UK_BANK_TRANSFER
        {
            String str = "uk_bank_transfer";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public InitiatorType toProto() {
            return InitiatorType.INITIATOR_TYPE_UK_BANK_TRANSFER;
        }
    };
    public static final InitiatorTypeDto INITIATOR_TYPE_TRADING_VIEW = new InitiatorTypeDto("INITIATOR_TYPE_TRADING_VIEW", 12) { // from class: rosetta.order.InitiatorTypeDto.INITIATOR_TYPE_TRADING_VIEW
        {
            String str = "trading_view";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public InitiatorType toProto() {
            return InitiatorType.INITIATOR_TYPE_TRADING_VIEW;
        }
    };
    public static final InitiatorTypeDto INITIATOR_TYPE_API_TRADING = new InitiatorTypeDto("INITIATOR_TYPE_API_TRADING", 13) { // from class: rosetta.order.InitiatorTypeDto.INITIATOR_TYPE_API_TRADING
        {
            String str = "api_trading";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public InitiatorType toProto() {
            return InitiatorType.INITIATOR_TYPE_API_TRADING;
        }
    };
    public static final InitiatorTypeDto INITIATOR_TYPE_OUTGOING_WIRE_TRANSFER = new InitiatorTypeDto("INITIATOR_TYPE_OUTGOING_WIRE_TRANSFER", 14) { // from class: rosetta.order.InitiatorTypeDto.INITIATOR_TYPE_OUTGOING_WIRE_TRANSFER
        {
            String str = "outgoing_wire_transfer";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public InitiatorType toProto() {
            return InitiatorType.INITIATOR_TYPE_OUTGOING_WIRE_TRANSFER;
        }
    };
    public static final InitiatorTypeDto INITIATOR_TYPE_ADVISORY = new InitiatorTypeDto("INITIATOR_TYPE_ADVISORY", 15) { // from class: rosetta.order.InitiatorTypeDto.INITIATOR_TYPE_ADVISORY
        {
            String str = "advisory";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public InitiatorType toProto() {
            return InitiatorType.INITIATOR_TYPE_ADVISORY;
        }
    };
    public static final InitiatorTypeDto INITIATOR_TYPE_CRYPTO_TRADE_BONUS = new InitiatorTypeDto("INITIATOR_TYPE_CRYPTO_TRADE_BONUS", 16) { // from class: rosetta.order.InitiatorTypeDto.INITIATOR_TYPE_CRYPTO_TRADE_BONUS
        {
            String str = "crypto_trade_bonus";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public InitiatorType toProto() {
            return InitiatorType.INITIATOR_TYPE_CRYPTO_TRADE_BONUS;
        }
    };
    public static final InitiatorTypeDto INITIATOR_TYPE_ASSET_TRANSFER = new InitiatorTypeDto("INITIATOR_TYPE_ASSET_TRANSFER", 17) { // from class: rosetta.order.InitiatorTypeDto.INITIATOR_TYPE_ASSET_TRANSFER
        {
            String str = "asset_transfer";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public InitiatorType toProto() {
            return InitiatorType.INITIATOR_TYPE_ASSET_TRANSFER;
        }
    };
    public static final InitiatorTypeDto INITIATOR_TYPE_CRYPTO_TOKENIZATION = new InitiatorTypeDto("INITIATOR_TYPE_CRYPTO_TOKENIZATION", 18) { // from class: rosetta.order.InitiatorTypeDto.INITIATOR_TYPE_CRYPTO_TOKENIZATION
        {
            String str = "crypto_tokenization";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public InitiatorType toProto() {
            return InitiatorType.INITIATOR_TYPE_CRYPTO_TOKENIZATION;
        }
    };
    public static final InitiatorTypeDto INITIATOR_TYPE_SG_BANK_TRANSFER = new InitiatorTypeDto("INITIATOR_TYPE_SG_BANK_TRANSFER", 19) { // from class: rosetta.order.InitiatorTypeDto.INITIATOR_TYPE_SG_BANK_TRANSFER
        {
            String str = "sg_bank_transfer";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public InitiatorType toProto() {
            return InitiatorType.INITIATOR_TYPE_SG_BANK_TRANSFER;
        }
    };
    public static final InitiatorTypeDto INITIATOR_TYPE_ROLLOVER_ACH = new InitiatorTypeDto("INITIATOR_TYPE_ROLLOVER_ACH", 20) { // from class: rosetta.order.InitiatorTypeDto.INITIATOR_TYPE_ROLLOVER_ACH
        {
            String str = "rollover_ach";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public InitiatorType toProto() {
            return InitiatorType.INITIATOR_TYPE_ROLLOVER_ACH;
        }
    };
    public static final InitiatorTypeDto INITIATOR_TYPE_ACAT_FRACTIONAL_LIQUIDATION = new InitiatorTypeDto("INITIATOR_TYPE_ACAT_FRACTIONAL_LIQUIDATION", 21) { // from class: rosetta.order.InitiatorTypeDto.INITIATOR_TYPE_ACAT_FRACTIONAL_LIQUIDATION
        {
            String str = "acat_fractional_liquidation";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public InitiatorType toProto() {
            return InitiatorType.INITIATOR_TYPE_ACAT_FRACTIONAL_LIQUIDATION;
        }
    };
    public static final InitiatorTypeDto INITIATOR_TYPE_CRYPTO_TRANSFERS_FEE_REFUND = new InitiatorTypeDto("INITIATOR_TYPE_CRYPTO_TRANSFERS_FEE_REFUND", 22) { // from class: rosetta.order.InitiatorTypeDto.INITIATOR_TYPE_CRYPTO_TRANSFERS_FEE_REFUND
        {
            String str = "crypto_transfers_fee_refund";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public InitiatorType toProto() {
            return InitiatorType.INITIATOR_TYPE_CRYPTO_TRANSFERS_FEE_REFUND;
        }
    };
    public static final InitiatorTypeDto INITIATOR_TYPE_FX_TRANSFER = new InitiatorTypeDto("INITIATOR_TYPE_FX_TRANSFER", 23) { // from class: rosetta.order.InitiatorTypeDto.INITIATOR_TYPE_FX_TRANSFER
        {
            String str = "fx_transfer";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public InitiatorType toProto() {
            return InitiatorType.INITIATOR_TYPE_FX_TRANSFER;
        }
    };
    public static final InitiatorTypeDto INITIATOR_TYPE_ACH = new InitiatorTypeDto("INITIATOR_TYPE_ACH", 24) { // from class: rosetta.order.InitiatorTypeDto.INITIATOR_TYPE_ACH
        {
            String str = "ach";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public InitiatorType toProto() {
            return InitiatorType.INITIATOR_TYPE_ACH;
        }
    };
    public static final InitiatorTypeDto INITIATOR_TYPE_FRAUD_DEACTIVATION = new InitiatorTypeDto("INITIATOR_TYPE_FRAUD_DEACTIVATION", 25) { // from class: rosetta.order.InitiatorTypeDto.INITIATOR_TYPE_FRAUD_DEACTIVATION
        {
            String str = "fraud_deactivation";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public InitiatorType toProto() {
            return InitiatorType.INITIATOR_TYPE_FRAUD_DEACTIVATION;
        }
    };
    public static final InitiatorTypeDto INITIATOR_TYPE_CRYPTO_LADDER = new InitiatorTypeDto("INITIATOR_TYPE_CRYPTO_LADDER", 26) { // from class: rosetta.order.InitiatorTypeDto.INITIATOR_TYPE_CRYPTO_LADDER
        {
            String str = "crypto_ladder";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public InitiatorType toProto() {
            return InitiatorType.INITIATOR_TYPE_CRYPTO_LADDER;
        }
    };
    public static final InitiatorTypeDto INITIATOR_TYPE_CRYPTO_MAC = new InitiatorTypeDto("INITIATOR_TYPE_CRYPTO_MAC", 27) { // from class: rosetta.order.InitiatorTypeDto.INITIATOR_TYPE_CRYPTO_MAC
        {
            String str = "crypto_mac";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public InitiatorType toProto() {
            return InitiatorType.INITIATOR_TYPE_CRYPTO_MAC;
        }
    };
    public static final InitiatorTypeDto INITIATOR_TYPE_CRYPTO_FLATTEN = new InitiatorTypeDto("INITIATOR_TYPE_CRYPTO_FLATTEN", 28) { // from class: rosetta.order.InitiatorTypeDto.INITIATOR_TYPE_CRYPTO_FLATTEN
        {
            String str = "crypto_flatten";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public InitiatorType toProto() {
            return InitiatorType.INITIATOR_TYPE_CRYPTO_FLATTEN;
        }
    };
    public static final InitiatorTypeDto INITIATOR_TYPE_PAYCHECK = new InitiatorTypeDto("INITIATOR_TYPE_PAYCHECK", 29) { // from class: rosetta.order.InitiatorTypeDto.INITIATOR_TYPE_PAYCHECK
        {
            String str = "paycheck";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public InitiatorType toProto() {
            return InitiatorType.INITIATOR_TYPE_PAYCHECK;
        }
    };
    public static final InitiatorTypeDto INITIATOR_TYPE_UK_OPEN_BANKING_TRANSFER = new InitiatorTypeDto("INITIATOR_TYPE_UK_OPEN_BANKING_TRANSFER", 30) { // from class: rosetta.order.InitiatorTypeDto.INITIATOR_TYPE_UK_OPEN_BANKING_TRANSFER
        {
            String str = "uk_open_banking_transfer";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public InitiatorType toProto() {
            return InitiatorType.INITIATOR_TYPE_UK_OPEN_BANKING_TRANSFER;
        }
    };
    public static final InitiatorTypeDto INITIATOR_TYPE_OUTGOING_CHECK = new InitiatorTypeDto("INITIATOR_TYPE_OUTGOING_CHECK", 31) { // from class: rosetta.order.InitiatorTypeDto.INITIATOR_TYPE_OUTGOING_CHECK
        {
            String str = "outgoing_check";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public InitiatorType toProto() {
            return InitiatorType.INITIATOR_TYPE_OUTGOING_CHECK;
        }
    };
    public static final InitiatorTypeDto INITIATOR_TYPE_CC_CRYPTO_REDEMPTION = new InitiatorTypeDto("INITIATOR_TYPE_CC_CRYPTO_REDEMPTION", 32) { // from class: rosetta.order.InitiatorTypeDto.INITIATOR_TYPE_CC_CRYPTO_REDEMPTION
        {
            String str = "cc_crypto_redemption";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public InitiatorType toProto() {
            return InitiatorType.INITIATOR_TYPE_CC_CRYPTO_REDEMPTION;
        }
    };

    private static final /* synthetic */ InitiatorTypeDto[] $values() {
        return new InitiatorTypeDto[]{INITIATOR_TYPE_UNSPECIFIED, INITIATOR_TYPE_RECURRING, INITIATOR_TYPE_PLUTO, INITIATOR_TYPE_CHECKOUT_FLOW, INITIATOR_TYPE_DEBIT_CARD_FUNDING, INITIATOR_TYPE_PAYMENT_HUB, INITIATOR_TYPE_INSTANT_BANK_TRANSFER, INITIATOR_TYPE_CRYPTO_TRANSFERS, INITIATOR_TYPE_CATPAY, INITIATOR_TYPE_CHECK_TRANSFER, INITIATOR_TYPE_INCOMING_WIRE_TRANSFER, INITIATOR_TYPE_UK_BANK_TRANSFER, INITIATOR_TYPE_TRADING_VIEW, INITIATOR_TYPE_API_TRADING, INITIATOR_TYPE_OUTGOING_WIRE_TRANSFER, INITIATOR_TYPE_ADVISORY, INITIATOR_TYPE_CRYPTO_TRADE_BONUS, INITIATOR_TYPE_ASSET_TRANSFER, INITIATOR_TYPE_CRYPTO_TOKENIZATION, INITIATOR_TYPE_SG_BANK_TRANSFER, INITIATOR_TYPE_ROLLOVER_ACH, INITIATOR_TYPE_ACAT_FRACTIONAL_LIQUIDATION, INITIATOR_TYPE_CRYPTO_TRANSFERS_FEE_REFUND, INITIATOR_TYPE_FX_TRANSFER, INITIATOR_TYPE_ACH, INITIATOR_TYPE_FRAUD_DEACTIVATION, INITIATOR_TYPE_CRYPTO_LADDER, INITIATOR_TYPE_CRYPTO_MAC, INITIATOR_TYPE_CRYPTO_FLATTEN, INITIATOR_TYPE_PAYCHECK, INITIATOR_TYPE_UK_OPEN_BANKING_TRANSFER, INITIATOR_TYPE_OUTGOING_CHECK, INITIATOR_TYPE_CC_CRYPTO_REDEMPTION};
    }

    public /* synthetic */ InitiatorTypeDto(String str, int i, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2);
    }

    public static EnumEntries<InitiatorTypeDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private InitiatorTypeDto(String str, int i, String str2) {
        this.json_value = str2;
    }

    public final String getJson_value() {
        return this.json_value;
    }

    static {
        InitiatorTypeDto[] initiatorTypeDtoArr$values = $values();
        $VALUES = initiatorTypeDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(initiatorTypeDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rosetta.order.InitiatorTypeDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InitiatorTypeDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: InitiatorTypeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrosetta/order/InitiatorTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lrosetta/order/InitiatorTypeDto;", "Lrosetta/order/InitiatorType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrosetta/order/InitiatorTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.order_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<InitiatorTypeDto, InitiatorType> {

        /* compiled from: InitiatorTypeDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[InitiatorType.values().length];
                try {
                    iArr[InitiatorType.INITIATOR_TYPE_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[InitiatorType.INITIATOR_TYPE_RECURRING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[InitiatorType.INITIATOR_TYPE_PLUTO.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[InitiatorType.INITIATOR_TYPE_CHECKOUT_FLOW.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[InitiatorType.INITIATOR_TYPE_DEBIT_CARD_FUNDING.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[InitiatorType.INITIATOR_TYPE_PAYMENT_HUB.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[InitiatorType.INITIATOR_TYPE_INSTANT_BANK_TRANSFER.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[InitiatorType.INITIATOR_TYPE_CRYPTO_TRANSFERS.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[InitiatorType.INITIATOR_TYPE_CATPAY.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[InitiatorType.INITIATOR_TYPE_CHECK_TRANSFER.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[InitiatorType.INITIATOR_TYPE_INCOMING_WIRE_TRANSFER.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[InitiatorType.INITIATOR_TYPE_UK_BANK_TRANSFER.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[InitiatorType.INITIATOR_TYPE_TRADING_VIEW.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[InitiatorType.INITIATOR_TYPE_API_TRADING.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[InitiatorType.INITIATOR_TYPE_OUTGOING_WIRE_TRANSFER.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[InitiatorType.INITIATOR_TYPE_ADVISORY.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[InitiatorType.INITIATOR_TYPE_CRYPTO_TRADE_BONUS.ordinal()] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr[InitiatorType.INITIATOR_TYPE_ASSET_TRANSFER.ordinal()] = 18;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr[InitiatorType.INITIATOR_TYPE_CRYPTO_TOKENIZATION.ordinal()] = 19;
                } catch (NoSuchFieldError unused19) {
                }
                try {
                    iArr[InitiatorType.INITIATOR_TYPE_SG_BANK_TRANSFER.ordinal()] = 20;
                } catch (NoSuchFieldError unused20) {
                }
                try {
                    iArr[InitiatorType.INITIATOR_TYPE_ROLLOVER_ACH.ordinal()] = 21;
                } catch (NoSuchFieldError unused21) {
                }
                try {
                    iArr[InitiatorType.INITIATOR_TYPE_ACAT_FRACTIONAL_LIQUIDATION.ordinal()] = 22;
                } catch (NoSuchFieldError unused22) {
                }
                try {
                    iArr[InitiatorType.INITIATOR_TYPE_CRYPTO_TRANSFERS_FEE_REFUND.ordinal()] = 23;
                } catch (NoSuchFieldError unused23) {
                }
                try {
                    iArr[InitiatorType.INITIATOR_TYPE_FX_TRANSFER.ordinal()] = 24;
                } catch (NoSuchFieldError unused24) {
                }
                try {
                    iArr[InitiatorType.INITIATOR_TYPE_ACH.ordinal()] = 25;
                } catch (NoSuchFieldError unused25) {
                }
                try {
                    iArr[InitiatorType.INITIATOR_TYPE_FRAUD_DEACTIVATION.ordinal()] = 26;
                } catch (NoSuchFieldError unused26) {
                }
                try {
                    iArr[InitiatorType.INITIATOR_TYPE_CRYPTO_LADDER.ordinal()] = 27;
                } catch (NoSuchFieldError unused27) {
                }
                try {
                    iArr[InitiatorType.INITIATOR_TYPE_CRYPTO_MAC.ordinal()] = 28;
                } catch (NoSuchFieldError unused28) {
                }
                try {
                    iArr[InitiatorType.INITIATOR_TYPE_CRYPTO_FLATTEN.ordinal()] = 29;
                } catch (NoSuchFieldError unused29) {
                }
                try {
                    iArr[InitiatorType.INITIATOR_TYPE_PAYCHECK.ordinal()] = 30;
                } catch (NoSuchFieldError unused30) {
                }
                try {
                    iArr[InitiatorType.INITIATOR_TYPE_UK_OPEN_BANKING_TRANSFER.ordinal()] = 31;
                } catch (NoSuchFieldError unused31) {
                }
                try {
                    iArr[InitiatorType.INITIATOR_TYPE_OUTGOING_CHECK.ordinal()] = 32;
                } catch (NoSuchFieldError unused32) {
                }
                try {
                    iArr[InitiatorType.INITIATOR_TYPE_CC_CRYPTO_REDEMPTION.ordinal()] = 33;
                } catch (NoSuchFieldError unused33) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<InitiatorTypeDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<InitiatorTypeDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<InitiatorTypeDto> getBinaryBase64Serializer() {
            return (KSerializer) InitiatorTypeDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<InitiatorType> getProtoAdapter() {
            return InitiatorType.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public InitiatorTypeDto getZeroValue() {
            return InitiatorTypeDto.INITIATOR_TYPE_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public InitiatorTypeDto fromProto(InitiatorType proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return InitiatorTypeDto.INITIATOR_TYPE_UNSPECIFIED;
                case 2:
                    return InitiatorTypeDto.INITIATOR_TYPE_RECURRING;
                case 3:
                    return InitiatorTypeDto.INITIATOR_TYPE_PLUTO;
                case 4:
                    return InitiatorTypeDto.INITIATOR_TYPE_CHECKOUT_FLOW;
                case 5:
                    return InitiatorTypeDto.INITIATOR_TYPE_DEBIT_CARD_FUNDING;
                case 6:
                    return InitiatorTypeDto.INITIATOR_TYPE_PAYMENT_HUB;
                case 7:
                    return InitiatorTypeDto.INITIATOR_TYPE_INSTANT_BANK_TRANSFER;
                case 8:
                    return InitiatorTypeDto.INITIATOR_TYPE_CRYPTO_TRANSFERS;
                case 9:
                    return InitiatorTypeDto.INITIATOR_TYPE_CATPAY;
                case 10:
                    return InitiatorTypeDto.INITIATOR_TYPE_CHECK_TRANSFER;
                case 11:
                    return InitiatorTypeDto.INITIATOR_TYPE_INCOMING_WIRE_TRANSFER;
                case 12:
                    return InitiatorTypeDto.INITIATOR_TYPE_UK_BANK_TRANSFER;
                case 13:
                    return InitiatorTypeDto.INITIATOR_TYPE_TRADING_VIEW;
                case 14:
                    return InitiatorTypeDto.INITIATOR_TYPE_API_TRADING;
                case 15:
                    return InitiatorTypeDto.INITIATOR_TYPE_OUTGOING_WIRE_TRANSFER;
                case 16:
                    return InitiatorTypeDto.INITIATOR_TYPE_ADVISORY;
                case 17:
                    return InitiatorTypeDto.INITIATOR_TYPE_CRYPTO_TRADE_BONUS;
                case 18:
                    return InitiatorTypeDto.INITIATOR_TYPE_ASSET_TRANSFER;
                case 19:
                    return InitiatorTypeDto.INITIATOR_TYPE_CRYPTO_TOKENIZATION;
                case 20:
                    return InitiatorTypeDto.INITIATOR_TYPE_SG_BANK_TRANSFER;
                case 21:
                    return InitiatorTypeDto.INITIATOR_TYPE_ROLLOVER_ACH;
                case 22:
                    return InitiatorTypeDto.INITIATOR_TYPE_ACAT_FRACTIONAL_LIQUIDATION;
                case 23:
                    return InitiatorTypeDto.INITIATOR_TYPE_CRYPTO_TRANSFERS_FEE_REFUND;
                case 24:
                    return InitiatorTypeDto.INITIATOR_TYPE_FX_TRANSFER;
                case 25:
                    return InitiatorTypeDto.INITIATOR_TYPE_ACH;
                case 26:
                    return InitiatorTypeDto.INITIATOR_TYPE_FRAUD_DEACTIVATION;
                case 27:
                    return InitiatorTypeDto.INITIATOR_TYPE_CRYPTO_LADDER;
                case 28:
                    return InitiatorTypeDto.INITIATOR_TYPE_CRYPTO_MAC;
                case 29:
                    return InitiatorTypeDto.INITIATOR_TYPE_CRYPTO_FLATTEN;
                case 30:
                    return InitiatorTypeDto.INITIATOR_TYPE_PAYCHECK;
                case 31:
                    return InitiatorTypeDto.INITIATOR_TYPE_UK_OPEN_BANKING_TRANSFER;
                case 32:
                    return InitiatorTypeDto.INITIATOR_TYPE_OUTGOING_CHECK;
                case 33:
                    return InitiatorTypeDto.INITIATOR_TYPE_CC_CRYPTO_REDEMPTION;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: InitiatorTypeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lrosetta/order/InitiatorTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrosetta/order/InitiatorTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "rosetta.order_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes25.dex */
    public static final class Serializer implements KSerializer<InitiatorTypeDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<InitiatorTypeDto, InitiatorType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.order.InitiatorType", InitiatorTypeDto.getEntries(), InitiatorTypeDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public InitiatorTypeDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (InitiatorTypeDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, InitiatorTypeDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static InitiatorTypeDto valueOf(String str) {
        return (InitiatorTypeDto) Enum.valueOf(InitiatorTypeDto.class, str);
    }

    public static InitiatorTypeDto[] values() {
        return (InitiatorTypeDto[]) $VALUES.clone();
    }
}
