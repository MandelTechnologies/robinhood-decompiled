package com.robinhood.transfers.api;

import com.robinhood.enums.RhEnum;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RejectionReason.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001a\b\u0086\u0081\u0002\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u001dB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001c¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/transfers/api/RejectionReason;", "Lcom/robinhood/enums/RhEnum;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "ACCOUNT_CLOSED", "ACCOUNT_FROZEN", "ACCOUNT_LIMIT_EXCEEDED", "AUTHORIZATION_REVOKED_BY_CUSTOMER", "BLACKLISTED", "CUSTOMER_ADVISES_NOT_AUTHORIZED", "FILE_RECORD_EDIT_CRITERIA", "INCAPACITATED", "INSUFFICIENT_FUNDS", "NAME_MISMATCH", "NO_ACCOUNT", "NO_BANK_ACCOUNT", "NUM_OF_TRANSFERS_LIMIT_EXCEEDED", "ODFI_REVERSED", "OFAC", "PAYMENT_STOPPED", "RDFI_NON_SETTLEMENT", "UNCOLLECTED_FUNDS", "WITHDRAWALS_LOCKED", "UNKNOWN", "Companion", "lib-models-transfer-api_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class RejectionReason implements RhEnum<RejectionReason> {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RejectionReason[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String serverValue;
    public static final RejectionReason ACCOUNT_CLOSED = new RejectionReason("ACCOUNT_CLOSED", 0, "account_closed");
    public static final RejectionReason ACCOUNT_FROZEN = new RejectionReason("ACCOUNT_FROZEN", 1, "account_frozen");
    public static final RejectionReason ACCOUNT_LIMIT_EXCEEDED = new RejectionReason("ACCOUNT_LIMIT_EXCEEDED", 2, "account_limit_exceeded");
    public static final RejectionReason AUTHORIZATION_REVOKED_BY_CUSTOMER = new RejectionReason("AUTHORIZATION_REVOKED_BY_CUSTOMER", 3, "authorization_revoked_by_customer");
    public static final RejectionReason BLACKLISTED = new RejectionReason("BLACKLISTED", 4, "blacklisted");
    public static final RejectionReason CUSTOMER_ADVISES_NOT_AUTHORIZED = new RejectionReason("CUSTOMER_ADVISES_NOT_AUTHORIZED", 5, "customer_advises_not_authorized");
    public static final RejectionReason FILE_RECORD_EDIT_CRITERIA = new RejectionReason("FILE_RECORD_EDIT_CRITERIA", 6, "file_record_edit_criteria");
    public static final RejectionReason INCAPACITATED = new RejectionReason("INCAPACITATED", 7, "incapacitated");
    public static final RejectionReason INSUFFICIENT_FUNDS = new RejectionReason("INSUFFICIENT_FUNDS", 8, "insufficient_funds");
    public static final RejectionReason NAME_MISMATCH = new RejectionReason("NAME_MISMATCH", 9, "name_mismatch");
    public static final RejectionReason NO_ACCOUNT = new RejectionReason("NO_ACCOUNT", 10, "no_account");
    public static final RejectionReason NO_BANK_ACCOUNT = new RejectionReason("NO_BANK_ACCOUNT", 11, "no_bank_account");
    public static final RejectionReason NUM_OF_TRANSFERS_LIMIT_EXCEEDED = new RejectionReason("NUM_OF_TRANSFERS_LIMIT_EXCEEDED", 12, "num_of_transfers_limit_exceeded");
    public static final RejectionReason ODFI_REVERSED = new RejectionReason("ODFI_REVERSED", 13, "odfi_reversed");
    public static final RejectionReason OFAC = new RejectionReason("OFAC", 14, "ofac");
    public static final RejectionReason PAYMENT_STOPPED = new RejectionReason("PAYMENT_STOPPED", 15, "payment_stopped");
    public static final RejectionReason RDFI_NON_SETTLEMENT = new RejectionReason("RDFI_NON_SETTLEMENT", 16, "rdfi_non_settlement");
    public static final RejectionReason UNCOLLECTED_FUNDS = new RejectionReason("UNCOLLECTED_FUNDS", 17, "uncollected_funds");
    public static final RejectionReason WITHDRAWALS_LOCKED = new RejectionReason("WITHDRAWALS_LOCKED", 18, "withdrawals_locked");
    public static final RejectionReason UNKNOWN = new RejectionReason("UNKNOWN", 19, "unknown");

    private static final /* synthetic */ RejectionReason[] $values() {
        return new RejectionReason[]{ACCOUNT_CLOSED, ACCOUNT_FROZEN, ACCOUNT_LIMIT_EXCEEDED, AUTHORIZATION_REVOKED_BY_CUSTOMER, BLACKLISTED, CUSTOMER_ADVISES_NOT_AUTHORIZED, FILE_RECORD_EDIT_CRITERIA, INCAPACITATED, INSUFFICIENT_FUNDS, NAME_MISMATCH, NO_ACCOUNT, NO_BANK_ACCOUNT, NUM_OF_TRANSFERS_LIMIT_EXCEEDED, ODFI_REVERSED, OFAC, PAYMENT_STOPPED, RDFI_NON_SETTLEMENT, UNCOLLECTED_FUNDS, WITHDRAWALS_LOCKED, UNKNOWN};
    }

    @JvmStatic
    public static RejectionReason fromServerValue(String str) {
        return INSTANCE.fromServerValue(str);
    }

    public static EnumEntries<RejectionReason> getEntries() {
        return $ENTRIES;
    }

    @JvmStatic
    public static String toServerValue(RejectionReason rejectionReason) {
        return INSTANCE.toServerValue(rejectionReason);
    }

    private RejectionReason(String str, int i, String str2) {
        this.serverValue = str2;
    }

    @Override // com.robinhood.enums.RhEnum
    public String getServerValue() {
        return this.serverValue;
    }

    static {
        RejectionReason[] rejectionReasonArr$values = $values();
        $VALUES = rejectionReasonArr$values;
        $ENTRIES = EnumEntries2.enumEntries(rejectionReasonArr$values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: RejectionReason.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0017J\u0014\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0017¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/transfers/api/RejectionReason$Companion;", "Lcom/robinhood/enums/RhEnum$Converter$Defaulted;", "Lcom/robinhood/transfers/api/RejectionReason;", "<init>", "()V", "toServerValue", "", "enumValue", "fromServerValue", "serverValue", "lib-models-transfer-api_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion extends RhEnum.Converter.Defaulted<RejectionReason> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
            super(RejectionReason.values(), RejectionReason.UNKNOWN, false, 4, null);
        }

        @Override // com.robinhood.enums.RhEnum.Converter
        @JvmStatic
        public String toServerValue(RejectionReason enumValue) {
            return super.toServerValue((Enum) enumValue);
        }

        @Override // com.robinhood.enums.RhEnum.Converter.Defaulted, com.robinhood.enums.RhEnum.Converter
        @JvmStatic
        public RejectionReason fromServerValue(String serverValue) {
            return (RejectionReason) super.fromServerValue(serverValue);
        }
    }

    public static RejectionReason valueOf(String str) {
        return (RejectionReason) Enum.valueOf(RejectionReason.class, str);
    }

    public static RejectionReason[] values() {
        return (RejectionReason[]) $VALUES.clone();
    }
}
