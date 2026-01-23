package com.robinhood.transfers.api;

import com.robinhood.enums.RhEnum;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TransferState.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0086\u0081\u0002\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u001dB#\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0007\u0010\u000fj\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001c¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/transfers/api/TransferState;", "Lcom/robinhood/enums/RhEnum;", "", "serverValue", "", "historyState", "Lcom/robinhood/shared/models/history/shared/HistoryEvent$State;", "isSuccessful", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Lcom/robinhood/shared/models/history/shared/HistoryEvent$State;Ljava/lang/Boolean;)V", "getServerValue", "()Ljava/lang/String;", "getHistoryState", "()Lcom/robinhood/shared/models/history/shared/HistoryEvent$State;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "UNKNOWN", "CANCELLED", "COMPLETED", "FAILED", "NEW", "PAUSED", "PENDING", "PENDING_CANCEL", "READY", "REJECTED", "REVERSED", "PREPROCESSING", "Companion", "lib-models-transfer-api_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class TransferState implements RhEnum<TransferState> {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TransferState[] $VALUES;
    public static final TransferState CANCELLED;
    public static final TransferState COMPLETED;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final TransferState FAILED;
    public static final TransferState NEW;
    public static final TransferState PAUSED;
    public static final TransferState PENDING;
    public static final TransferState PENDING_CANCEL;
    public static final TransferState PREPROCESSING;
    public static final TransferState READY;
    public static final TransferState REJECTED;
    public static final TransferState REVERSED;
    public static final TransferState UNKNOWN;
    private static final Set<TransferState> historyStates;
    private static final Set<TransferState> pendingStates;
    private static final Set<TransferState> settledStates;
    private final HistoryEvent.State historyState;
    private final Boolean isSuccessful;
    private final String serverValue;

    private static final /* synthetic */ TransferState[] $values() {
        return new TransferState[]{UNKNOWN, CANCELLED, COMPLETED, FAILED, NEW, PAUSED, PENDING, PENDING_CANCEL, READY, REJECTED, REVERSED, PREPROCESSING};
    }

    @JvmStatic
    public static TransferState fromServerValue(String str) {
        return INSTANCE.fromServerValue(str);
    }

    public static EnumEntries<TransferState> getEntries() {
        return $ENTRIES;
    }

    @JvmStatic
    public static String toServerValue(TransferState transferState) {
        return INSTANCE.toServerValue(transferState);
    }

    private TransferState(String str, int i, String str2, HistoryEvent.State state, Boolean bool) {
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
        HistoryEvent.State state = HistoryEvent.State.SETTLED;
        Boolean bool = Boolean.FALSE;
        UNKNOWN = new TransferState("UNKNOWN", 0, "unknown", state, bool);
        CANCELLED = new TransferState("CANCELLED", 1, "cancelled", state, bool);
        Boolean bool2 = Boolean.TRUE;
        COMPLETED = new TransferState("COMPLETED", 2, "completed", state, bool2);
        FAILED = new TransferState("FAILED", 3, "failed", state, bool);
        HistoryEvent.State state2 = HistoryEvent.State.PENDING;
        NEW = new TransferState("NEW", 4, "new", state2, null);
        PAUSED = new TransferState("PAUSED", 5, "paused", state2, null);
        PENDING = new TransferState("PENDING", 6, "pending", state2, null);
        PENDING_CANCEL = new TransferState("PENDING_CANCEL", 7, "pending_cancel", state, bool2);
        READY = new TransferState("READY", 8, "ready", state2, null);
        REJECTED = new TransferState("REJECTED", 9, "rejected", state, bool);
        REVERSED = new TransferState("REVERSED", 10, "reversed", state, bool);
        PREPROCESSING = new TransferState("PREPROCESSING", 11, "preprocessing", state2, null);
        TransferState[] transferStateArr$values = $values();
        $VALUES = transferStateArr$values;
        $ENTRIES = EnumEntries2.enumEntries(transferStateArr$values);
        INSTANCE = new Companion(null);
        EnumSet enumSetAllOf = EnumSet.allOf(TransferState.class);
        Intrinsics.checkNotNullExpressionValue(enumSetAllOf, "allOf(...)");
        historyStates = enumSetAllOf;
        TransferState[] transferStateArrValues = values();
        ArrayList arrayList = new ArrayList();
        for (TransferState transferState : transferStateArrValues) {
            if (transferState.historyState == HistoryEvent.State.PENDING) {
                arrayList.add(transferState);
            }
        }
        EnumSet enumSetCopyOf = EnumSet.copyOf((Collection) arrayList);
        Intrinsics.checkNotNullExpressionValue(enumSetCopyOf, "copyOf(...)");
        Set<TransferState> setUnmodifiableSet = Collections.unmodifiableSet(enumSetCopyOf);
        Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet, "unmodifiableSet(...)");
        pendingStates = setUnmodifiableSet;
        TransferState[] transferStateArrValues2 = values();
        ArrayList arrayList2 = new ArrayList();
        for (TransferState transferState2 : transferStateArrValues2) {
            if (transferState2.historyState == HistoryEvent.State.SETTLED) {
                arrayList2.add(transferState2);
            }
        }
        EnumSet enumSetCopyOf2 = EnumSet.copyOf((Collection) arrayList2);
        Intrinsics.checkNotNullExpressionValue(enumSetCopyOf2, "copyOf(...)");
        Set<TransferState> setUnmodifiableSet2 = Collections.unmodifiableSet(enumSetCopyOf2);
        Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet2, "unmodifiableSet(...)");
        settledStates = setUnmodifiableSet2;
    }

    /* compiled from: TransferState.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0017J\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u000eH\u0017R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\b¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/transfers/api/TransferState$Companion;", "Lcom/robinhood/enums/RhEnum$Converter$Defaulted;", "Lcom/robinhood/transfers/api/TransferState;", "<init>", "()V", "historyStates", "", "getHistoryStates", "()Ljava/util/Set;", "pendingStates", "getPendingStates", "settledStates", "getSettledStates", "toServerValue", "", "enumValue", "fromServerValue", "serverValue", "lib-models-transfer-api_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion extends RhEnum.Converter.Defaulted<TransferState> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
            super(TransferState.values(), TransferState.UNKNOWN, false, 4, null);
        }

        public final Set<TransferState> getHistoryStates() {
            return TransferState.historyStates;
        }

        public final Set<TransferState> getPendingStates() {
            return TransferState.pendingStates;
        }

        public final Set<TransferState> getSettledStates() {
            return TransferState.settledStates;
        }

        @Override // com.robinhood.enums.RhEnum.Converter
        @JvmStatic
        public String toServerValue(TransferState enumValue) {
            return super.toServerValue((Enum) enumValue);
        }

        @Override // com.robinhood.enums.RhEnum.Converter.Defaulted, com.robinhood.enums.RhEnum.Converter
        @JvmStatic
        public TransferState fromServerValue(String serverValue) {
            return (TransferState) super.fromServerValue(serverValue);
        }
    }

    public static TransferState valueOf(String str) {
        return (TransferState) Enum.valueOf(TransferState.class, str);
    }

    public static TransferState[] values() {
        return (TransferState[]) $VALUES.clone();
    }
}
