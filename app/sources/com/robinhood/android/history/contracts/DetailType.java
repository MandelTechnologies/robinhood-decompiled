package com.robinhood.android.history.contracts;

import com.robinhood.utils.Either;
import com.robinhood.utils.Either2;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DetailType.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b&\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001*B\u001d\b\u0002\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\bB\u0011\b\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\tR\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/history/contracts/DetailType;", "", "subType", "Lcom/robinhood/utils/Either;", "Lcom/robinhood/android/history/contracts/LegacyDetailType;", "Lcom/robinhood/android/history/contracts/DetailType$New;", "<init>", "(Ljava/lang/String;ILcom/robinhood/utils/Either;)V", "(Ljava/lang/String;ILcom/robinhood/android/history/contracts/LegacyDetailType;)V", "(Ljava/lang/String;ILcom/robinhood/android/history/contracts/DetailType$New;)V", "getSubType", "()Lcom/robinhood/utils/Either;", "ACATS_TRANSFER", "ACH_TRANSFER", "CHECK_PAYMENT", "CHECK_TRANSFER", "CRYPTO_ORDER", "DEBIT_CARD_TRANSFER", "DIVIDEND", "INSTANT_BANK_TRANSFER", "INSTRUMENT_SPLIT_PAYMENT", "INTEREST", "INTERNAL", "LEGACY_ACATS_TRANSFER", "MARGIN_INTEREST_CHARGE", "MARGIN_SUBSCRIPTION_FEE", "MARGIN_SUBSCRIPTION_FEE_REFUND", "MERCHANT_REWARD", "NON_ORIGINATED_ACH_TRANSFER", "OPTION_CORPORATE_ACTION", "OPTION_ORDER", "ORDER", "PAYMENT_HUB", "PAYMENT_INTENT", "RHY_ACH_TRANSFER", "ROUNDUP_REWARD", "SLIP_GROUPED_PAYMENT", "SWEEP_PAYMENT", "UK_BANK_TRANSFER", "UK_OPEN_BANKING_TRANSFER", "WIRE_TRANSFER", "OUTGOING_WIRE_TRANSFER", "New", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class DetailType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DetailType[] $VALUES;
    private final Either<LegacyDetailType, New> subType;
    public static final DetailType ACATS_TRANSFER = new DetailType("ACATS_TRANSFER", 0, LegacyDetailType.ACATS_TRANSFER);
    public static final DetailType ACH_TRANSFER = new DetailType("ACH_TRANSFER", 1, LegacyDetailType.ACH_TRANSFER);
    public static final DetailType CHECK_PAYMENT = new DetailType("CHECK_PAYMENT", 2, LegacyDetailType.CHECK_PAYMENT);
    public static final DetailType CHECK_TRANSFER = new DetailType("CHECK_TRANSFER", 3, LegacyDetailType.CHECK_TRANSFER);
    public static final DetailType CRYPTO_ORDER = new DetailType("CRYPTO_ORDER", 4, New.CRYPTO_ORDER);
    public static final DetailType DEBIT_CARD_TRANSFER = new DetailType("DEBIT_CARD_TRANSFER", 5, LegacyDetailType.DEBIT_CARD_TRANSFER);
    public static final DetailType DIVIDEND = new DetailType("DIVIDEND", 6, LegacyDetailType.DIVIDEND);
    public static final DetailType INSTANT_BANK_TRANSFER = new DetailType("INSTANT_BANK_TRANSFER", 7, LegacyDetailType.INSTANT_BANK_TRANSFER);
    public static final DetailType INSTRUMENT_SPLIT_PAYMENT = new DetailType("INSTRUMENT_SPLIT_PAYMENT", 8, LegacyDetailType.INSTRUMENT_SPLIT_PAYMENT);
    public static final DetailType INTEREST = new DetailType("INTEREST", 9, LegacyDetailType.INTEREST);
    public static final DetailType INTERNAL = new DetailType("INTERNAL", 10, LegacyDetailType.INTERNAL);
    public static final DetailType LEGACY_ACATS_TRANSFER = new DetailType("LEGACY_ACATS_TRANSFER", 11, LegacyDetailType.LEGACY_ACATS_TRANSFER);
    public static final DetailType MARGIN_INTEREST_CHARGE = new DetailType("MARGIN_INTEREST_CHARGE", 12, LegacyDetailType.MARGIN_INTEREST_CHARGE);
    public static final DetailType MARGIN_SUBSCRIPTION_FEE = new DetailType("MARGIN_SUBSCRIPTION_FEE", 13, LegacyDetailType.MARGIN_SUBSCRIPTION_FEE);
    public static final DetailType MARGIN_SUBSCRIPTION_FEE_REFUND = new DetailType("MARGIN_SUBSCRIPTION_FEE_REFUND", 14, LegacyDetailType.MARGIN_SUBSCRIPTION_FEE_REFUND);
    public static final DetailType MERCHANT_REWARD = new DetailType("MERCHANT_REWARD", 15, LegacyDetailType.MERCHANT_REWARD);
    public static final DetailType NON_ORIGINATED_ACH_TRANSFER = new DetailType("NON_ORIGINATED_ACH_TRANSFER", 16, LegacyDetailType.NON_ORIGINATED_ACH_TRANSFER);
    public static final DetailType OPTION_CORPORATE_ACTION = new DetailType("OPTION_CORPORATE_ACTION", 17, LegacyDetailType.OPTION_CORPORATE_ACTION);
    public static final DetailType OPTION_ORDER = new DetailType("OPTION_ORDER", 18, New.OPTION_ORDER);
    public static final DetailType ORDER = new DetailType("ORDER", 19, LegacyDetailType.ORDER);
    public static final DetailType PAYMENT_HUB = new DetailType("PAYMENT_HUB", 20, LegacyDetailType.PAYMENT_HUB);
    public static final DetailType PAYMENT_INTENT = new DetailType("PAYMENT_INTENT", 21, New.PAYMENT_INTENT);
    public static final DetailType RHY_ACH_TRANSFER = new DetailType("RHY_ACH_TRANSFER", 22, LegacyDetailType.RHY_ACH_TRANSFER);
    public static final DetailType ROUNDUP_REWARD = new DetailType("ROUNDUP_REWARD", 23, LegacyDetailType.ROUNDUP_REWARD);
    public static final DetailType SLIP_GROUPED_PAYMENT = new DetailType("SLIP_GROUPED_PAYMENT", 24, New.SLIP_GROUPED_PAYMENT);
    public static final DetailType SWEEP_PAYMENT = new DetailType("SWEEP_PAYMENT", 25, LegacyDetailType.SWEEP_PAYMENT);
    public static final DetailType UK_BANK_TRANSFER = new DetailType("UK_BANK_TRANSFER", 26, New.UK_BANK_TRANSFER);
    public static final DetailType UK_OPEN_BANKING_TRANSFER = new DetailType("UK_OPEN_BANKING_TRANSFER", 27, LegacyDetailType.UK_OPEN_BANKING_TRANSFER);
    public static final DetailType WIRE_TRANSFER = new DetailType("WIRE_TRANSFER", 28, LegacyDetailType.WIRE_TRANSFER);
    public static final DetailType OUTGOING_WIRE_TRANSFER = new DetailType("OUTGOING_WIRE_TRANSFER", 29, LegacyDetailType.OUTGOING_WIRE_TRANSFER);

    private static final /* synthetic */ DetailType[] $values() {
        return new DetailType[]{ACATS_TRANSFER, ACH_TRANSFER, CHECK_PAYMENT, CHECK_TRANSFER, CRYPTO_ORDER, DEBIT_CARD_TRANSFER, DIVIDEND, INSTANT_BANK_TRANSFER, INSTRUMENT_SPLIT_PAYMENT, INTEREST, INTERNAL, LEGACY_ACATS_TRANSFER, MARGIN_INTEREST_CHARGE, MARGIN_SUBSCRIPTION_FEE, MARGIN_SUBSCRIPTION_FEE_REFUND, MERCHANT_REWARD, NON_ORIGINATED_ACH_TRANSFER, OPTION_CORPORATE_ACTION, OPTION_ORDER, ORDER, PAYMENT_HUB, PAYMENT_INTENT, RHY_ACH_TRANSFER, ROUNDUP_REWARD, SLIP_GROUPED_PAYMENT, SWEEP_PAYMENT, UK_BANK_TRANSFER, UK_OPEN_BANKING_TRANSFER, WIRE_TRANSFER, OUTGOING_WIRE_TRANSFER};
    }

    public static EnumEntries<DetailType> getEntries() {
        return $ENTRIES;
    }

    private DetailType(String str, int i, Either either) {
        this.subType = either;
    }

    public final Either<LegacyDetailType, New> getSubType() {
        return this.subType;
    }

    static {
        DetailType[] detailTypeArr$values = $values();
        $VALUES = detailTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(detailTypeArr$values);
    }

    private DetailType(String str, int i, LegacyDetailType legacyDetailType) {
        this(str, i, Either2.asLeft(legacyDetailType));
    }

    private DetailType(String str, int i, New r3) {
        this(str, i, Either2.asRight(r3));
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DetailType.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/history/contracts/DetailType$New;", "", "<init>", "(Ljava/lang/String;I)V", "CRYPTO_ORDER", "OPTION_ORDER", "UK_BANK_TRANSFER", "PAYMENT_INTENT", "SLIP_GROUPED_PAYMENT", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class New {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ New[] $VALUES;
        public static final New CRYPTO_ORDER = new New("CRYPTO_ORDER", 0);
        public static final New OPTION_ORDER = new New("OPTION_ORDER", 1);
        public static final New UK_BANK_TRANSFER = new New("UK_BANK_TRANSFER", 2);
        public static final New PAYMENT_INTENT = new New("PAYMENT_INTENT", 3);
        public static final New SLIP_GROUPED_PAYMENT = new New("SLIP_GROUPED_PAYMENT", 4);

        private static final /* synthetic */ New[] $values() {
            return new New[]{CRYPTO_ORDER, OPTION_ORDER, UK_BANK_TRANSFER, PAYMENT_INTENT, SLIP_GROUPED_PAYMENT};
        }

        public static EnumEntries<New> getEntries() {
            return $ENTRIES;
        }

        private New(String str, int i) {
        }

        static {
            New[] newArr$values = $values();
            $VALUES = newArr$values;
            $ENTRIES = EnumEntries2.enumEntries(newArr$values);
        }

        public static New valueOf(String str) {
            return (New) Enum.valueOf(New.class, str);
        }

        public static New[] values() {
            return (New[]) $VALUES.clone();
        }
    }

    public static DetailType valueOf(String str) {
        return (DetailType) Enum.valueOf(DetailType.class, str);
    }

    public static DetailType[] values() {
        return (DetailType[]) $VALUES.clone();
    }
}
