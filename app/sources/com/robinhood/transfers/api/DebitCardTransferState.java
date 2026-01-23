package com.robinhood.transfers.api;

import com.robinhood.enums.RhEnum;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DebitCardTransferState.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\u0081\u0002\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u001bB#\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0007\u0010\u000fj\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/transfers/api/DebitCardTransferState;", "Lcom/robinhood/enums/RhEnum;", "", "serverValue", "", "historyState", "Lcom/robinhood/shared/models/history/shared/HistoryEvent$State;", "isSuccessful", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Lcom/robinhood/shared/models/history/shared/HistoryEvent$State;Ljava/lang/Boolean;)V", "getServerValue", "()Ljava/lang/String;", "getHistoryState", "()Lcom/robinhood/shared/models/history/shared/HistoryEvent$State;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "NEW", "READY", "PAUSED", "COMPLETED", "REVERSED", "FAILED", "DISPUTED", "REINSTATED", "REFUNDED", "UNKNOWN", "Companion", "lib-models-transfer-api_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class DebitCardTransferState implements RhEnum<DebitCardTransferState> {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DebitCardTransferState[] $VALUES;
    public static final DebitCardTransferState COMPLETED;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final DebitCardTransferState DISPUTED;
    public static final DebitCardTransferState FAILED;
    public static final DebitCardTransferState NEW;
    public static final DebitCardTransferState PAUSED;
    public static final DebitCardTransferState READY;
    public static final DebitCardTransferState REFUNDED;
    public static final DebitCardTransferState REINSTATED;
    public static final DebitCardTransferState REVERSED;
    public static final DebitCardTransferState UNKNOWN;
    private final HistoryEvent.State historyState;
    private final Boolean isSuccessful;
    private final String serverValue;

    private static final /* synthetic */ DebitCardTransferState[] $values() {
        return new DebitCardTransferState[]{NEW, READY, PAUSED, COMPLETED, REVERSED, FAILED, DISPUTED, REINSTATED, REFUNDED, UNKNOWN};
    }

    @JvmStatic
    public static DebitCardTransferState fromServerValue(String str) {
        return INSTANCE.fromServerValue(str);
    }

    public static EnumEntries<DebitCardTransferState> getEntries() {
        return $ENTRIES;
    }

    @JvmStatic
    public static String toServerValue(DebitCardTransferState debitCardTransferState) {
        return INSTANCE.toServerValue(debitCardTransferState);
    }

    private DebitCardTransferState(String str, int i, String str2, HistoryEvent.State state, Boolean bool) {
        this.serverValue = str2;
        this.historyState = state;
        this.isSuccessful = bool;
    }

    @Override // com.robinhood.enums.RhEnum
    public String getServerValue() {
        return this.serverValue;
    }

    public final HistoryEvent.State getHistoryState() {
        return this.historyState;
    }

    /* renamed from: isSuccessful, reason: from getter */
    public final Boolean getIsSuccessful() {
        return this.isSuccessful;
    }

    static {
        HistoryEvent.State state = HistoryEvent.State.PENDING;
        Boolean bool = Boolean.FALSE;
        NEW = new DebitCardTransferState("NEW", 0, "new", state, bool);
        READY = new DebitCardTransferState("READY", 1, "ready", state, null);
        PAUSED = new DebitCardTransferState("PAUSED", 2, "paused", state, null);
        HistoryEvent.State state2 = HistoryEvent.State.SETTLED;
        COMPLETED = new DebitCardTransferState("COMPLETED", 3, "completed", state2, Boolean.TRUE);
        REVERSED = new DebitCardTransferState("REVERSED", 4, "reversed", state2, bool);
        FAILED = new DebitCardTransferState("FAILED", 5, "failed", state2, bool);
        DISPUTED = new DebitCardTransferState("DISPUTED", 6, "disputed", state2, null);
        REINSTATED = new DebitCardTransferState("REINSTATED", 7, "reinstated", state2, null);
        REFUNDED = new DebitCardTransferState("REFUNDED", 8, "refunded", state2, null);
        UNKNOWN = new DebitCardTransferState("UNKNOWN", 9, "unknown", state2, bool);
        DebitCardTransferState[] debitCardTransferStateArr$values = $values();
        $VALUES = debitCardTransferStateArr$values;
        $ENTRIES = EnumEntries2.enumEntries(debitCardTransferStateArr$values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: DebitCardTransferState.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0017J\u0014\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0017¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/transfers/api/DebitCardTransferState$Companion;", "Lcom/robinhood/enums/RhEnum$Converter$Defaulted;", "Lcom/robinhood/transfers/api/DebitCardTransferState;", "<init>", "()V", "toServerValue", "", "enumValue", "fromServerValue", "serverValue", "lib-models-transfer-api_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion extends RhEnum.Converter.Defaulted<DebitCardTransferState> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
            super(DebitCardTransferState.values(), DebitCardTransferState.UNKNOWN, false, 4, null);
        }

        @Override // com.robinhood.enums.RhEnum.Converter
        @JvmStatic
        public String toServerValue(DebitCardTransferState enumValue) {
            return super.toServerValue((Enum) enumValue);
        }

        @Override // com.robinhood.enums.RhEnum.Converter.Defaulted, com.robinhood.enums.RhEnum.Converter
        @JvmStatic
        public DebitCardTransferState fromServerValue(String serverValue) {
            return (DebitCardTransferState) super.fromServerValue(serverValue);
        }
    }

    public static DebitCardTransferState valueOf(String str) {
        return (DebitCardTransferState) Enum.valueOf(DebitCardTransferState.class, str);
    }

    public static DebitCardTransferState[] values() {
        return (DebitCardTransferState[]) $VALUES.clone();
    }
}
