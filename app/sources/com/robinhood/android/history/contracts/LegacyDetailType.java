package com.robinhood.android.history.contracts;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LegacyDetailType.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u001c\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001c¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/history/contracts/LegacyDetailType;", "", "<init>", "(Ljava/lang/String;I)V", "ACATS_TRANSFER", "ACH_TRANSFER", "CHECK_PAYMENT", "CHECK_TRANSFER", "DEBIT_CARD_TRANSFER", "DIVIDEND", "INSTANT_BANK_TRANSFER", "INSTRUMENT_SPLIT_PAYMENT", "INTEREST", "INTERNAL", "LEGACY_ACATS_TRANSFER", "MARGIN_INTEREST_CHARGE", "MARGIN_SUBSCRIPTION_FEE", "MARGIN_SUBSCRIPTION_FEE_REFUND", "MERCHANT_REWARD", "NON_ORIGINATED_ACH_TRANSFER", "OPTION_CORPORATE_ACTION", "ORDER", "PAYMENT_HUB", "RHY_ACH_TRANSFER", "ROUNDUP_REWARD", "SWEEP_PAYMENT", "WIRE_TRANSFER", "OUTGOING_WIRE_TRANSFER", "UK_OPEN_BANKING_TRANSFER", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class LegacyDetailType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LegacyDetailType[] $VALUES;
    public static final LegacyDetailType ACATS_TRANSFER = new LegacyDetailType("ACATS_TRANSFER", 0);
    public static final LegacyDetailType ACH_TRANSFER = new LegacyDetailType("ACH_TRANSFER", 1);
    public static final LegacyDetailType CHECK_PAYMENT = new LegacyDetailType("CHECK_PAYMENT", 2);
    public static final LegacyDetailType CHECK_TRANSFER = new LegacyDetailType("CHECK_TRANSFER", 3);
    public static final LegacyDetailType DEBIT_CARD_TRANSFER = new LegacyDetailType("DEBIT_CARD_TRANSFER", 4);
    public static final LegacyDetailType DIVIDEND = new LegacyDetailType("DIVIDEND", 5);
    public static final LegacyDetailType INSTANT_BANK_TRANSFER = new LegacyDetailType("INSTANT_BANK_TRANSFER", 6);
    public static final LegacyDetailType INSTRUMENT_SPLIT_PAYMENT = new LegacyDetailType("INSTRUMENT_SPLIT_PAYMENT", 7);
    public static final LegacyDetailType INTEREST = new LegacyDetailType("INTEREST", 8);
    public static final LegacyDetailType INTERNAL = new LegacyDetailType("INTERNAL", 9);
    public static final LegacyDetailType LEGACY_ACATS_TRANSFER = new LegacyDetailType("LEGACY_ACATS_TRANSFER", 10);
    public static final LegacyDetailType MARGIN_INTEREST_CHARGE = new LegacyDetailType("MARGIN_INTEREST_CHARGE", 11);
    public static final LegacyDetailType MARGIN_SUBSCRIPTION_FEE = new LegacyDetailType("MARGIN_SUBSCRIPTION_FEE", 12);
    public static final LegacyDetailType MARGIN_SUBSCRIPTION_FEE_REFUND = new LegacyDetailType("MARGIN_SUBSCRIPTION_FEE_REFUND", 13);
    public static final LegacyDetailType MERCHANT_REWARD = new LegacyDetailType("MERCHANT_REWARD", 14);
    public static final LegacyDetailType NON_ORIGINATED_ACH_TRANSFER = new LegacyDetailType("NON_ORIGINATED_ACH_TRANSFER", 15);
    public static final LegacyDetailType OPTION_CORPORATE_ACTION = new LegacyDetailType("OPTION_CORPORATE_ACTION", 16);
    public static final LegacyDetailType ORDER = new LegacyDetailType("ORDER", 17);
    public static final LegacyDetailType PAYMENT_HUB = new LegacyDetailType("PAYMENT_HUB", 18);
    public static final LegacyDetailType RHY_ACH_TRANSFER = new LegacyDetailType("RHY_ACH_TRANSFER", 19);
    public static final LegacyDetailType ROUNDUP_REWARD = new LegacyDetailType("ROUNDUP_REWARD", 20);
    public static final LegacyDetailType SWEEP_PAYMENT = new LegacyDetailType("SWEEP_PAYMENT", 21);
    public static final LegacyDetailType WIRE_TRANSFER = new LegacyDetailType("WIRE_TRANSFER", 22);
    public static final LegacyDetailType OUTGOING_WIRE_TRANSFER = new LegacyDetailType("OUTGOING_WIRE_TRANSFER", 23);
    public static final LegacyDetailType UK_OPEN_BANKING_TRANSFER = new LegacyDetailType("UK_OPEN_BANKING_TRANSFER", 24);

    private static final /* synthetic */ LegacyDetailType[] $values() {
        return new LegacyDetailType[]{ACATS_TRANSFER, ACH_TRANSFER, CHECK_PAYMENT, CHECK_TRANSFER, DEBIT_CARD_TRANSFER, DIVIDEND, INSTANT_BANK_TRANSFER, INSTRUMENT_SPLIT_PAYMENT, INTEREST, INTERNAL, LEGACY_ACATS_TRANSFER, MARGIN_INTEREST_CHARGE, MARGIN_SUBSCRIPTION_FEE, MARGIN_SUBSCRIPTION_FEE_REFUND, MERCHANT_REWARD, NON_ORIGINATED_ACH_TRANSFER, OPTION_CORPORATE_ACTION, ORDER, PAYMENT_HUB, RHY_ACH_TRANSFER, ROUNDUP_REWARD, SWEEP_PAYMENT, WIRE_TRANSFER, OUTGOING_WIRE_TRANSFER, UK_OPEN_BANKING_TRANSFER};
    }

    public static EnumEntries<LegacyDetailType> getEntries() {
        return $ENTRIES;
    }

    private LegacyDetailType(String str, int i) {
    }

    static {
        LegacyDetailType[] legacyDetailTypeArr$values = $values();
        $VALUES = legacyDetailTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(legacyDetailTypeArr$values);
    }

    public static LegacyDetailType valueOf(String str) {
        return (LegacyDetailType) Enum.valueOf(LegacyDetailType.class, str);
    }

    public static LegacyDetailType[] values() {
        return (LegacyDetailType[]) $VALUES.clone();
    }
}
