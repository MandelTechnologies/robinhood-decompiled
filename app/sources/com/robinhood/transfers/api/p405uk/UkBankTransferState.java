package com.robinhood.transfers.api.p405uk;

import com.robinhood.enums.RhEnum;
import com.robinhood.models.api.MarginCall;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UkBankTransferState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0015B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/transfers/api/uk/UkBankTransferState;", "Lcom/robinhood/enums/RhEnum;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "NEW", "READY", "PAYMENT_PENDING", "PAYMENT_COMPLETED", "CONVERSION_PENDING", "CONVERSION_CONFIRMED", "CONVERSION_SETTLED", "PENDING_FAIL", "FAILED", "EXPIRED", "PAUSED", "UNKNOWN", "Companion", "lib-models-transfer-api_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class UkBankTransferState implements RhEnum<UkBankTransferState> {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ UkBankTransferState[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String serverValue;
    public static final UkBankTransferState NEW = new UkBankTransferState("NEW", 0, "new");
    public static final UkBankTransferState READY = new UkBankTransferState("READY", 1, "ready");
    public static final UkBankTransferState PAYMENT_PENDING = new UkBankTransferState("PAYMENT_PENDING", 2, "payment_pending");
    public static final UkBankTransferState PAYMENT_COMPLETED = new UkBankTransferState("PAYMENT_COMPLETED", 3, "payment_completed");
    public static final UkBankTransferState CONVERSION_PENDING = new UkBankTransferState("CONVERSION_PENDING", 4, "conversion_pending");
    public static final UkBankTransferState CONVERSION_CONFIRMED = new UkBankTransferState("CONVERSION_CONFIRMED", 5, "conversion_confirmed");
    public static final UkBankTransferState CONVERSION_SETTLED = new UkBankTransferState("CONVERSION_SETTLED", 6, "conversion_settled");
    public static final UkBankTransferState PENDING_FAIL = new UkBankTransferState("PENDING_FAIL", 7, "pending_fail");
    public static final UkBankTransferState FAILED = new UkBankTransferState("FAILED", 8, "failed");
    public static final UkBankTransferState EXPIRED = new UkBankTransferState("EXPIRED", 9, MarginCall.STATE_EXPIRED);
    public static final UkBankTransferState PAUSED = new UkBankTransferState("PAUSED", 10, "paused");
    public static final UkBankTransferState UNKNOWN = new UkBankTransferState("UNKNOWN", 11, "unknown");

    private static final /* synthetic */ UkBankTransferState[] $values() {
        return new UkBankTransferState[]{NEW, READY, PAYMENT_PENDING, PAYMENT_COMPLETED, CONVERSION_PENDING, CONVERSION_CONFIRMED, CONVERSION_SETTLED, PENDING_FAIL, FAILED, EXPIRED, PAUSED, UNKNOWN};
    }

    @JvmStatic
    public static UkBankTransferState fromServerValue(String str) {
        return INSTANCE.fromServerValue(str);
    }

    public static EnumEntries<UkBankTransferState> getEntries() {
        return $ENTRIES;
    }

    @JvmStatic
    public static String toServerValue(UkBankTransferState ukBankTransferState) {
        return INSTANCE.toServerValue(ukBankTransferState);
    }

    private UkBankTransferState(String str, int i, String str2) {
        this.serverValue = str2;
    }

    @Override // com.robinhood.enums.RhEnum
    public String getServerValue() {
        return this.serverValue;
    }

    static {
        UkBankTransferState[] ukBankTransferStateArr$values = $values();
        $VALUES = ukBankTransferStateArr$values;
        $ENTRIES = EnumEntries2.enumEntries(ukBankTransferStateArr$values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: UkBankTransferState.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0017J\u0014\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0017¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/transfers/api/uk/UkBankTransferState$Companion;", "Lcom/robinhood/enums/RhEnum$Converter$Defaulted;", "Lcom/robinhood/transfers/api/uk/UkBankTransferState;", "<init>", "()V", "toServerValue", "", "enumValue", "fromServerValue", "serverValue", "lib-models-transfer-api_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion extends RhEnum.Converter.Defaulted<UkBankTransferState> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
            super(UkBankTransferState.values(), UkBankTransferState.UNKNOWN, false, 4, null);
        }

        @Override // com.robinhood.enums.RhEnum.Converter
        @JvmStatic
        public String toServerValue(UkBankTransferState enumValue) {
            return super.toServerValue((Enum) enumValue);
        }

        @Override // com.robinhood.enums.RhEnum.Converter.Defaulted, com.robinhood.enums.RhEnum.Converter
        @JvmStatic
        public UkBankTransferState fromServerValue(String serverValue) {
            return (UkBankTransferState) super.fromServerValue(serverValue);
        }
    }

    public static UkBankTransferState valueOf(String str) {
        return (UkBankTransferState) Enum.valueOf(UkBankTransferState.class, str);
    }

    public static UkBankTransferState[] values() {
        return (UkBankTransferState[]) $VALUES.clone();
    }
}
