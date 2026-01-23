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
/* compiled from: NonOriginatedAchTransferState.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0016B#\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0005\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/transfers/api/NonOriginatedAchTransferState;", "Lcom/robinhood/enums/RhEnum;", "", "serverValue", "", "isSuccessful", "", "historyState", "Lcom/robinhood/shared/models/history/shared/HistoryEvent$State;", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Boolean;Lcom/robinhood/shared/models/history/shared/HistoryEvent$State;)V", "getServerValue", "()Ljava/lang/String;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getHistoryState", "()Lcom/robinhood/shared/models/history/shared/HistoryEvent$State;", "PENDING", "COMPLETED", "REJECTED", "REVERSED", "UNKNOWN", "Companion", "lib-models-transfer-api_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class NonOriginatedAchTransferState implements RhEnum<NonOriginatedAchTransferState> {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ NonOriginatedAchTransferState[] $VALUES;
    public static final NonOriginatedAchTransferState COMPLETED;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final NonOriginatedAchTransferState PENDING;
    public static final NonOriginatedAchTransferState REJECTED;
    public static final NonOriginatedAchTransferState REVERSED;
    public static final NonOriginatedAchTransferState UNKNOWN;
    private static final Set<NonOriginatedAchTransferState> historyStates;
    private static final Set<NonOriginatedAchTransferState> pendingStates;
    private static final Set<NonOriginatedAchTransferState> settledStates;
    private final HistoryEvent.State historyState;
    private final Boolean isSuccessful;
    private final String serverValue;

    private static final /* synthetic */ NonOriginatedAchTransferState[] $values() {
        return new NonOriginatedAchTransferState[]{PENDING, COMPLETED, REJECTED, REVERSED, UNKNOWN};
    }

    @JvmStatic
    public static NonOriginatedAchTransferState fromServerValue(String str) {
        return INSTANCE.fromServerValue(str);
    }

    public static EnumEntries<NonOriginatedAchTransferState> getEntries() {
        return $ENTRIES;
    }

    @JvmStatic
    public static String toServerValue(NonOriginatedAchTransferState nonOriginatedAchTransferState) {
        return INSTANCE.toServerValue(nonOriginatedAchTransferState);
    }

    private NonOriginatedAchTransferState(String str, int i, String str2, Boolean bool, HistoryEvent.State state) {
        this.serverValue = str2;
        this.isSuccessful = bool;
        this.historyState = state;
    }

    @Override // com.robinhood.enums.RhEnum
    public String getServerValue() {
        return this.serverValue;
    }

    /* renamed from: isSuccessful, reason: from getter */
    public final Boolean getIsSuccessful() {
        return this.isSuccessful;
    }

    public final HistoryEvent.State getHistoryState() {
        return this.historyState;
    }

    static {
        HistoryEvent.State state = HistoryEvent.State.PENDING;
        PENDING = new NonOriginatedAchTransferState("PENDING", 0, "pending", null, state);
        Boolean bool = Boolean.TRUE;
        HistoryEvent.State state2 = HistoryEvent.State.SETTLED;
        COMPLETED = new NonOriginatedAchTransferState("COMPLETED", 1, "completed", bool, state2);
        Boolean bool2 = Boolean.FALSE;
        REJECTED = new NonOriginatedAchTransferState("REJECTED", 2, "rejected", bool2, state2);
        REVERSED = new NonOriginatedAchTransferState("REVERSED", 3, "reversed", bool2, state2);
        UNKNOWN = new NonOriginatedAchTransferState("UNKNOWN", 4, "unknown", null, state);
        NonOriginatedAchTransferState[] nonOriginatedAchTransferStateArr$values = $values();
        $VALUES = nonOriginatedAchTransferStateArr$values;
        $ENTRIES = EnumEntries2.enumEntries(nonOriginatedAchTransferStateArr$values);
        INSTANCE = new Companion(null);
        EnumSet enumSetAllOf = EnumSet.allOf(NonOriginatedAchTransferState.class);
        Intrinsics.checkNotNullExpressionValue(enumSetAllOf, "allOf(...)");
        historyStates = enumSetAllOf;
        NonOriginatedAchTransferState[] nonOriginatedAchTransferStateArrValues = values();
        ArrayList arrayList = new ArrayList();
        for (NonOriginatedAchTransferState nonOriginatedAchTransferState : nonOriginatedAchTransferStateArrValues) {
            if (nonOriginatedAchTransferState.historyState == HistoryEvent.State.PENDING) {
                arrayList.add(nonOriginatedAchTransferState);
            }
        }
        EnumSet enumSetCopyOf = EnumSet.copyOf((Collection) arrayList);
        Intrinsics.checkNotNullExpressionValue(enumSetCopyOf, "copyOf(...)");
        Set<NonOriginatedAchTransferState> setUnmodifiableSet = Collections.unmodifiableSet(enumSetCopyOf);
        Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet, "unmodifiableSet(...)");
        pendingStates = setUnmodifiableSet;
        NonOriginatedAchTransferState[] nonOriginatedAchTransferStateArrValues2 = values();
        ArrayList arrayList2 = new ArrayList();
        for (NonOriginatedAchTransferState nonOriginatedAchTransferState2 : nonOriginatedAchTransferStateArrValues2) {
            if (nonOriginatedAchTransferState2.historyState == HistoryEvent.State.SETTLED) {
                arrayList2.add(nonOriginatedAchTransferState2);
            }
        }
        EnumSet enumSetCopyOf2 = EnumSet.copyOf((Collection) arrayList2);
        Intrinsics.checkNotNullExpressionValue(enumSetCopyOf2, "copyOf(...)");
        Set<NonOriginatedAchTransferState> setUnmodifiableSet2 = Collections.unmodifiableSet(enumSetCopyOf2);
        Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet2, "unmodifiableSet(...)");
        settledStates = setUnmodifiableSet2;
    }

    /* compiled from: NonOriginatedAchTransferState.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0017J\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u000eH\u0017R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\b¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/transfers/api/NonOriginatedAchTransferState$Companion;", "Lcom/robinhood/enums/RhEnum$Converter$Defaulted;", "Lcom/robinhood/transfers/api/NonOriginatedAchTransferState;", "<init>", "()V", "historyStates", "", "getHistoryStates", "()Ljava/util/Set;", "pendingStates", "getPendingStates", "settledStates", "getSettledStates", "toServerValue", "", "enumValue", "fromServerValue", "serverValue", "lib-models-transfer-api_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion extends RhEnum.Converter.Defaulted<NonOriginatedAchTransferState> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
            super(NonOriginatedAchTransferState.values(), NonOriginatedAchTransferState.UNKNOWN, false, 4, null);
        }

        public final Set<NonOriginatedAchTransferState> getHistoryStates() {
            return NonOriginatedAchTransferState.historyStates;
        }

        public final Set<NonOriginatedAchTransferState> getPendingStates() {
            return NonOriginatedAchTransferState.pendingStates;
        }

        public final Set<NonOriginatedAchTransferState> getSettledStates() {
            return NonOriginatedAchTransferState.settledStates;
        }

        @Override // com.robinhood.enums.RhEnum.Converter
        @JvmStatic
        public String toServerValue(NonOriginatedAchTransferState enumValue) {
            return super.toServerValue((Enum) enumValue);
        }

        @Override // com.robinhood.enums.RhEnum.Converter.Defaulted, com.robinhood.enums.RhEnum.Converter
        @JvmStatic
        public NonOriginatedAchTransferState fromServerValue(String serverValue) {
            return (NonOriginatedAchTransferState) super.fromServerValue(serverValue);
        }
    }

    public static NonOriginatedAchTransferState valueOf(String str) {
        return (NonOriginatedAchTransferState) Enum.valueOf(NonOriginatedAchTransferState.class, str);
    }

    public static NonOriginatedAchTransferState[] values() {
        return (NonOriginatedAchTransferState[]) $VALUES.clone();
    }
}
