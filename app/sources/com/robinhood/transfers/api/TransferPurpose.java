package com.robinhood.transfers.api;

import com.robinhood.enums.RhEnum;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TransferPurpose.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0086\u0081\u0002\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u001bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/transfers/api/TransferPurpose;", "Lcom/robinhood/enums/RhEnum;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "UNKNOWN", "ADMIN_INITIATED", "ADMIN_FORCED", "ADMIN_REVERSAL", "CASH_CUSHION", "CASHBACK_REDEMPTION_CC", "CM_MIGRATION_BILLPAY", "CM_MIGRATION_DISPUTES_ARBITRATION", "CM_MIGRATION_DISPUTES_CHARGEBACK", "CM_MIGRATION_DISPUTES_SECOND_PRESENTMENT", "CM_MIGRATION_SETTLE_PENDING_AUTH", "CUSTOMER_INITIATED", "DEPOSIT_SCHEDULES", "NOA_REDIRECT", "RECURRING_INVESTMENT", "REWARDS_MATCHING", "REWARDS_ROUNDUP", "SPLIT_YOUR_PAYCHECK", "Companion", "lib-models-transfer-api_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class TransferPurpose implements RhEnum<TransferPurpose> {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TransferPurpose[] $VALUES;
    private final String serverValue;
    public static final TransferPurpose UNKNOWN = new TransferPurpose("UNKNOWN", 0, "unknown");
    public static final TransferPurpose ADMIN_INITIATED = new TransferPurpose("ADMIN_INITIATED", 1, "admin_initiated");
    public static final TransferPurpose ADMIN_FORCED = new TransferPurpose("ADMIN_FORCED", 2, "admin_forced");
    public static final TransferPurpose ADMIN_REVERSAL = new TransferPurpose("ADMIN_REVERSAL", 3, "admin_reversal");
    public static final TransferPurpose CASH_CUSHION = new TransferPurpose("CASH_CUSHION", 4, "cash_cushion");
    public static final TransferPurpose CASHBACK_REDEMPTION_CC = new TransferPurpose("CASHBACK_REDEMPTION_CC", 5, "cashback_redemption_cc");
    public static final TransferPurpose CM_MIGRATION_BILLPAY = new TransferPurpose("CM_MIGRATION_BILLPAY", 6, "cm_migration_billpay");
    public static final TransferPurpose CM_MIGRATION_DISPUTES_ARBITRATION = new TransferPurpose("CM_MIGRATION_DISPUTES_ARBITRATION", 7, "cm_migration_disputes_arbitration");
    public static final TransferPurpose CM_MIGRATION_DISPUTES_CHARGEBACK = new TransferPurpose("CM_MIGRATION_DISPUTES_CHARGEBACK", 8, "cm_migration_disputes_chargeback");
    public static final TransferPurpose CM_MIGRATION_DISPUTES_SECOND_PRESENTMENT = new TransferPurpose("CM_MIGRATION_DISPUTES_SECOND_PRESENTMENT", 9, "cm_migration_disputes_second_presentment");
    public static final TransferPurpose CM_MIGRATION_SETTLE_PENDING_AUTH = new TransferPurpose("CM_MIGRATION_SETTLE_PENDING_AUTH", 10, "cm_migration_settle_pending_auth");
    public static final TransferPurpose CUSTOMER_INITIATED = new TransferPurpose("CUSTOMER_INITIATED", 11, "customer_initiated");
    public static final TransferPurpose DEPOSIT_SCHEDULES = new TransferPurpose("DEPOSIT_SCHEDULES", 12, "deposit_schedules");
    public static final TransferPurpose NOA_REDIRECT = new TransferPurpose("NOA_REDIRECT", 13, "noa_redirect");
    public static final TransferPurpose RECURRING_INVESTMENT = new TransferPurpose("RECURRING_INVESTMENT", 14, "recurring_investment");
    public static final TransferPurpose REWARDS_MATCHING = new TransferPurpose("REWARDS_MATCHING", 15, "rewards_matching");
    public static final TransferPurpose REWARDS_ROUNDUP = new TransferPurpose("REWARDS_ROUNDUP", 16, "rewards_roundup");
    public static final TransferPurpose SPLIT_YOUR_PAYCHECK = new TransferPurpose("SPLIT_YOUR_PAYCHECK", 17, "split_your_paycheck");

    private static final /* synthetic */ TransferPurpose[] $values() {
        return new TransferPurpose[]{UNKNOWN, ADMIN_INITIATED, ADMIN_FORCED, ADMIN_REVERSAL, CASH_CUSHION, CASHBACK_REDEMPTION_CC, CM_MIGRATION_BILLPAY, CM_MIGRATION_DISPUTES_ARBITRATION, CM_MIGRATION_DISPUTES_CHARGEBACK, CM_MIGRATION_DISPUTES_SECOND_PRESENTMENT, CM_MIGRATION_SETTLE_PENDING_AUTH, CUSTOMER_INITIATED, DEPOSIT_SCHEDULES, NOA_REDIRECT, RECURRING_INVESTMENT, REWARDS_MATCHING, REWARDS_ROUNDUP, SPLIT_YOUR_PAYCHECK};
    }

    public static EnumEntries<TransferPurpose> getEntries() {
        return $ENTRIES;
    }

    private TransferPurpose(String str, int i, String str2) {
        this.serverValue = str2;
    }

    @Override // com.robinhood.enums.RhEnum
    public String getServerValue() {
        return this.serverValue;
    }

    static {
        TransferPurpose[] transferPurposeArr$values = $values();
        $VALUES = transferPurposeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(transferPurposeArr$values);
        INSTANCE = new Companion(null);
    }

    public static TransferPurpose valueOf(String str) {
        return (TransferPurpose) Enum.valueOf(TransferPurpose.class, str);
    }

    public static TransferPurpose[] values() {
        return (TransferPurpose[]) $VALUES.clone();
    }
}
