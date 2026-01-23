package rosetta.order;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: InitiatorType.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b'\b\u0086\u0081\u0002\u0018\u0000 *2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001*B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)¨\u0006+"}, m3636d2 = {"Lrosetta/order/InitiatorType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "INITIATOR_TYPE_UNSPECIFIED", "INITIATOR_TYPE_RECURRING", "INITIATOR_TYPE_PLUTO", "INITIATOR_TYPE_CHECKOUT_FLOW", "INITIATOR_TYPE_DEBIT_CARD_FUNDING", "INITIATOR_TYPE_PAYMENT_HUB", "INITIATOR_TYPE_INSTANT_BANK_TRANSFER", "INITIATOR_TYPE_CRYPTO_TRANSFERS", "INITIATOR_TYPE_CATPAY", "INITIATOR_TYPE_CHECK_TRANSFER", "INITIATOR_TYPE_INCOMING_WIRE_TRANSFER", "INITIATOR_TYPE_UK_BANK_TRANSFER", "INITIATOR_TYPE_TRADING_VIEW", "INITIATOR_TYPE_API_TRADING", "INITIATOR_TYPE_OUTGOING_WIRE_TRANSFER", "INITIATOR_TYPE_ADVISORY", "INITIATOR_TYPE_CRYPTO_TRADE_BONUS", "INITIATOR_TYPE_ASSET_TRANSFER", "INITIATOR_TYPE_CRYPTO_TOKENIZATION", "INITIATOR_TYPE_SG_BANK_TRANSFER", "INITIATOR_TYPE_ROLLOVER_ACH", "INITIATOR_TYPE_ACAT_FRACTIONAL_LIQUIDATION", "INITIATOR_TYPE_CRYPTO_TRANSFERS_FEE_REFUND", "INITIATOR_TYPE_FX_TRANSFER", "INITIATOR_TYPE_ACH", "INITIATOR_TYPE_FRAUD_DEACTIVATION", "INITIATOR_TYPE_CRYPTO_LADDER", "INITIATOR_TYPE_CRYPTO_MAC", "INITIATOR_TYPE_CRYPTO_FLATTEN", "INITIATOR_TYPE_PAYCHECK", "INITIATOR_TYPE_UK_OPEN_BANKING_TRANSFER", "INITIATOR_TYPE_OUTGOING_CHECK", "INITIATOR_TYPE_CC_CRYPTO_REDEMPTION", "Companion", "rosetta.order_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class InitiatorType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ InitiatorType[] $VALUES;

    @JvmField
    public static final ProtoAdapter<InitiatorType> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final InitiatorType INITIATOR_TYPE_ACAT_FRACTIONAL_LIQUIDATION;
    public static final InitiatorType INITIATOR_TYPE_ACH;
    public static final InitiatorType INITIATOR_TYPE_ADVISORY;
    public static final InitiatorType INITIATOR_TYPE_API_TRADING;
    public static final InitiatorType INITIATOR_TYPE_ASSET_TRANSFER;
    public static final InitiatorType INITIATOR_TYPE_CATPAY;
    public static final InitiatorType INITIATOR_TYPE_CC_CRYPTO_REDEMPTION;
    public static final InitiatorType INITIATOR_TYPE_CHECKOUT_FLOW;
    public static final InitiatorType INITIATOR_TYPE_CHECK_TRANSFER;
    public static final InitiatorType INITIATOR_TYPE_CRYPTO_FLATTEN;
    public static final InitiatorType INITIATOR_TYPE_CRYPTO_LADDER;
    public static final InitiatorType INITIATOR_TYPE_CRYPTO_MAC;
    public static final InitiatorType INITIATOR_TYPE_CRYPTO_TOKENIZATION;
    public static final InitiatorType INITIATOR_TYPE_CRYPTO_TRADE_BONUS;
    public static final InitiatorType INITIATOR_TYPE_CRYPTO_TRANSFERS;
    public static final InitiatorType INITIATOR_TYPE_CRYPTO_TRANSFERS_FEE_REFUND;
    public static final InitiatorType INITIATOR_TYPE_DEBIT_CARD_FUNDING;
    public static final InitiatorType INITIATOR_TYPE_FRAUD_DEACTIVATION;
    public static final InitiatorType INITIATOR_TYPE_FX_TRANSFER;
    public static final InitiatorType INITIATOR_TYPE_INCOMING_WIRE_TRANSFER;
    public static final InitiatorType INITIATOR_TYPE_INSTANT_BANK_TRANSFER;
    public static final InitiatorType INITIATOR_TYPE_OUTGOING_CHECK;
    public static final InitiatorType INITIATOR_TYPE_OUTGOING_WIRE_TRANSFER;
    public static final InitiatorType INITIATOR_TYPE_PAYCHECK;
    public static final InitiatorType INITIATOR_TYPE_PAYMENT_HUB;
    public static final InitiatorType INITIATOR_TYPE_PLUTO;
    public static final InitiatorType INITIATOR_TYPE_RECURRING;
    public static final InitiatorType INITIATOR_TYPE_ROLLOVER_ACH;
    public static final InitiatorType INITIATOR_TYPE_SG_BANK_TRANSFER;
    public static final InitiatorType INITIATOR_TYPE_TRADING_VIEW;
    public static final InitiatorType INITIATOR_TYPE_UK_BANK_TRANSFER;
    public static final InitiatorType INITIATOR_TYPE_UK_OPEN_BANKING_TRANSFER;
    public static final InitiatorType INITIATOR_TYPE_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ InitiatorType[] $values() {
        return new InitiatorType[]{INITIATOR_TYPE_UNSPECIFIED, INITIATOR_TYPE_RECURRING, INITIATOR_TYPE_PLUTO, INITIATOR_TYPE_CHECKOUT_FLOW, INITIATOR_TYPE_DEBIT_CARD_FUNDING, INITIATOR_TYPE_PAYMENT_HUB, INITIATOR_TYPE_INSTANT_BANK_TRANSFER, INITIATOR_TYPE_CRYPTO_TRANSFERS, INITIATOR_TYPE_CATPAY, INITIATOR_TYPE_CHECK_TRANSFER, INITIATOR_TYPE_INCOMING_WIRE_TRANSFER, INITIATOR_TYPE_UK_BANK_TRANSFER, INITIATOR_TYPE_TRADING_VIEW, INITIATOR_TYPE_API_TRADING, INITIATOR_TYPE_OUTGOING_WIRE_TRANSFER, INITIATOR_TYPE_ADVISORY, INITIATOR_TYPE_CRYPTO_TRADE_BONUS, INITIATOR_TYPE_ASSET_TRANSFER, INITIATOR_TYPE_CRYPTO_TOKENIZATION, INITIATOR_TYPE_SG_BANK_TRANSFER, INITIATOR_TYPE_ROLLOVER_ACH, INITIATOR_TYPE_ACAT_FRACTIONAL_LIQUIDATION, INITIATOR_TYPE_CRYPTO_TRANSFERS_FEE_REFUND, INITIATOR_TYPE_FX_TRANSFER, INITIATOR_TYPE_ACH, INITIATOR_TYPE_FRAUD_DEACTIVATION, INITIATOR_TYPE_CRYPTO_LADDER, INITIATOR_TYPE_CRYPTO_MAC, INITIATOR_TYPE_CRYPTO_FLATTEN, INITIATOR_TYPE_PAYCHECK, INITIATOR_TYPE_UK_OPEN_BANKING_TRANSFER, INITIATOR_TYPE_OUTGOING_CHECK, INITIATOR_TYPE_CC_CRYPTO_REDEMPTION};
    }

    @JvmStatic
    public static final InitiatorType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<InitiatorType> getEntries() {
        return $ENTRIES;
    }

    private InitiatorType(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final InitiatorType initiatorType = new InitiatorType("INITIATOR_TYPE_UNSPECIFIED", 0, 0);
        INITIATOR_TYPE_UNSPECIFIED = initiatorType;
        INITIATOR_TYPE_RECURRING = new InitiatorType("INITIATOR_TYPE_RECURRING", 1, 1);
        INITIATOR_TYPE_PLUTO = new InitiatorType("INITIATOR_TYPE_PLUTO", 2, 2);
        INITIATOR_TYPE_CHECKOUT_FLOW = new InitiatorType("INITIATOR_TYPE_CHECKOUT_FLOW", 3, 3);
        INITIATOR_TYPE_DEBIT_CARD_FUNDING = new InitiatorType("INITIATOR_TYPE_DEBIT_CARD_FUNDING", 4, 4);
        INITIATOR_TYPE_PAYMENT_HUB = new InitiatorType("INITIATOR_TYPE_PAYMENT_HUB", 5, 5);
        INITIATOR_TYPE_INSTANT_BANK_TRANSFER = new InitiatorType("INITIATOR_TYPE_INSTANT_BANK_TRANSFER", 6, 6);
        INITIATOR_TYPE_CRYPTO_TRANSFERS = new InitiatorType("INITIATOR_TYPE_CRYPTO_TRANSFERS", 7, 7);
        INITIATOR_TYPE_CATPAY = new InitiatorType("INITIATOR_TYPE_CATPAY", 8, 8);
        INITIATOR_TYPE_CHECK_TRANSFER = new InitiatorType("INITIATOR_TYPE_CHECK_TRANSFER", 9, 9);
        INITIATOR_TYPE_INCOMING_WIRE_TRANSFER = new InitiatorType("INITIATOR_TYPE_INCOMING_WIRE_TRANSFER", 10, 10);
        INITIATOR_TYPE_UK_BANK_TRANSFER = new InitiatorType("INITIATOR_TYPE_UK_BANK_TRANSFER", 11, 11);
        INITIATOR_TYPE_TRADING_VIEW = new InitiatorType("INITIATOR_TYPE_TRADING_VIEW", 12, 12);
        INITIATOR_TYPE_API_TRADING = new InitiatorType("INITIATOR_TYPE_API_TRADING", 13, 13);
        INITIATOR_TYPE_OUTGOING_WIRE_TRANSFER = new InitiatorType("INITIATOR_TYPE_OUTGOING_WIRE_TRANSFER", 14, 14);
        INITIATOR_TYPE_ADVISORY = new InitiatorType("INITIATOR_TYPE_ADVISORY", 15, 15);
        INITIATOR_TYPE_CRYPTO_TRADE_BONUS = new InitiatorType("INITIATOR_TYPE_CRYPTO_TRADE_BONUS", 16, 16);
        INITIATOR_TYPE_ASSET_TRANSFER = new InitiatorType("INITIATOR_TYPE_ASSET_TRANSFER", 17, 17);
        INITIATOR_TYPE_CRYPTO_TOKENIZATION = new InitiatorType("INITIATOR_TYPE_CRYPTO_TOKENIZATION", 18, 18);
        INITIATOR_TYPE_SG_BANK_TRANSFER = new InitiatorType("INITIATOR_TYPE_SG_BANK_TRANSFER", 19, 19);
        INITIATOR_TYPE_ROLLOVER_ACH = new InitiatorType("INITIATOR_TYPE_ROLLOVER_ACH", 20, 20);
        INITIATOR_TYPE_ACAT_FRACTIONAL_LIQUIDATION = new InitiatorType("INITIATOR_TYPE_ACAT_FRACTIONAL_LIQUIDATION", 21, 21);
        INITIATOR_TYPE_CRYPTO_TRANSFERS_FEE_REFUND = new InitiatorType("INITIATOR_TYPE_CRYPTO_TRANSFERS_FEE_REFUND", 22, 22);
        INITIATOR_TYPE_FX_TRANSFER = new InitiatorType("INITIATOR_TYPE_FX_TRANSFER", 23, 23);
        INITIATOR_TYPE_ACH = new InitiatorType("INITIATOR_TYPE_ACH", 24, 24);
        INITIATOR_TYPE_FRAUD_DEACTIVATION = new InitiatorType("INITIATOR_TYPE_FRAUD_DEACTIVATION", 25, 25);
        INITIATOR_TYPE_CRYPTO_LADDER = new InitiatorType("INITIATOR_TYPE_CRYPTO_LADDER", 26, 26);
        INITIATOR_TYPE_CRYPTO_MAC = new InitiatorType("INITIATOR_TYPE_CRYPTO_MAC", 27, 27);
        INITIATOR_TYPE_CRYPTO_FLATTEN = new InitiatorType("INITIATOR_TYPE_CRYPTO_FLATTEN", 28, 28);
        INITIATOR_TYPE_PAYCHECK = new InitiatorType("INITIATOR_TYPE_PAYCHECK", 29, 29);
        INITIATOR_TYPE_UK_OPEN_BANKING_TRANSFER = new InitiatorType("INITIATOR_TYPE_UK_OPEN_BANKING_TRANSFER", 30, 30);
        INITIATOR_TYPE_OUTGOING_CHECK = new InitiatorType("INITIATOR_TYPE_OUTGOING_CHECK", 31, 31);
        INITIATOR_TYPE_CC_CRYPTO_REDEMPTION = new InitiatorType("INITIATOR_TYPE_CC_CRYPTO_REDEMPTION", 32, 32);
        InitiatorType[] initiatorTypeArr$values = $values();
        $VALUES = initiatorTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(initiatorTypeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(InitiatorType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<InitiatorType>(orCreateKotlinClass, syntax, initiatorType) { // from class: rosetta.order.InitiatorType$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public InitiatorType fromValue(int value) {
                return InitiatorType.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: InitiatorType.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lrosetta/order/InitiatorType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lrosetta/order/InitiatorType;", "fromValue", "value", "", "rosetta.order_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final InitiatorType fromValue(int value) {
            switch (value) {
                case 0:
                    return InitiatorType.INITIATOR_TYPE_UNSPECIFIED;
                case 1:
                    return InitiatorType.INITIATOR_TYPE_RECURRING;
                case 2:
                    return InitiatorType.INITIATOR_TYPE_PLUTO;
                case 3:
                    return InitiatorType.INITIATOR_TYPE_CHECKOUT_FLOW;
                case 4:
                    return InitiatorType.INITIATOR_TYPE_DEBIT_CARD_FUNDING;
                case 5:
                    return InitiatorType.INITIATOR_TYPE_PAYMENT_HUB;
                case 6:
                    return InitiatorType.INITIATOR_TYPE_INSTANT_BANK_TRANSFER;
                case 7:
                    return InitiatorType.INITIATOR_TYPE_CRYPTO_TRANSFERS;
                case 8:
                    return InitiatorType.INITIATOR_TYPE_CATPAY;
                case 9:
                    return InitiatorType.INITIATOR_TYPE_CHECK_TRANSFER;
                case 10:
                    return InitiatorType.INITIATOR_TYPE_INCOMING_WIRE_TRANSFER;
                case 11:
                    return InitiatorType.INITIATOR_TYPE_UK_BANK_TRANSFER;
                case 12:
                    return InitiatorType.INITIATOR_TYPE_TRADING_VIEW;
                case 13:
                    return InitiatorType.INITIATOR_TYPE_API_TRADING;
                case 14:
                    return InitiatorType.INITIATOR_TYPE_OUTGOING_WIRE_TRANSFER;
                case 15:
                    return InitiatorType.INITIATOR_TYPE_ADVISORY;
                case 16:
                    return InitiatorType.INITIATOR_TYPE_CRYPTO_TRADE_BONUS;
                case 17:
                    return InitiatorType.INITIATOR_TYPE_ASSET_TRANSFER;
                case 18:
                    return InitiatorType.INITIATOR_TYPE_CRYPTO_TOKENIZATION;
                case 19:
                    return InitiatorType.INITIATOR_TYPE_SG_BANK_TRANSFER;
                case 20:
                    return InitiatorType.INITIATOR_TYPE_ROLLOVER_ACH;
                case 21:
                    return InitiatorType.INITIATOR_TYPE_ACAT_FRACTIONAL_LIQUIDATION;
                case 22:
                    return InitiatorType.INITIATOR_TYPE_CRYPTO_TRANSFERS_FEE_REFUND;
                case 23:
                    return InitiatorType.INITIATOR_TYPE_FX_TRANSFER;
                case 24:
                    return InitiatorType.INITIATOR_TYPE_ACH;
                case 25:
                    return InitiatorType.INITIATOR_TYPE_FRAUD_DEACTIVATION;
                case 26:
                    return InitiatorType.INITIATOR_TYPE_CRYPTO_LADDER;
                case 27:
                    return InitiatorType.INITIATOR_TYPE_CRYPTO_MAC;
                case 28:
                    return InitiatorType.INITIATOR_TYPE_CRYPTO_FLATTEN;
                case 29:
                    return InitiatorType.INITIATOR_TYPE_PAYCHECK;
                case 30:
                    return InitiatorType.INITIATOR_TYPE_UK_OPEN_BANKING_TRANSFER;
                case 31:
                    return InitiatorType.INITIATOR_TYPE_OUTGOING_CHECK;
                case 32:
                    return InitiatorType.INITIATOR_TYPE_CC_CRYPTO_REDEMPTION;
                default:
                    return null;
            }
        }
    }

    public static InitiatorType valueOf(String str) {
        return (InitiatorType) Enum.valueOf(InitiatorType.class, str);
    }

    public static InitiatorType[] values() {
        return (InitiatorType[]) $VALUES.clone();
    }
}
