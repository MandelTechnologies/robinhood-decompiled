package com.robinhood.transfers.api;

import com.robinhood.enums.RhEnum;
import com.robinhood.models.api.ApiOptionLevelChange;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AchTransferRhsState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0086\u0081\u0002\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0019B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/transfers/api/AchTransferRhsState;", "Lcom/robinhood/enums/RhEnum;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "REQUESTED", "NEEDS_APPROVAL", "APPROVED", "REJECTED", "CANCELLED", "FAILED", "SUBMITTED", "REVERSED", "COMPLETED", "NEW", "PENDING_CANCEL", "REQUESTING", "ASKING_APPROVAL", "REVIEWING_BALANCE", "PENDING_CONFIRMATION", "ABORTED", "Companion", "lib-models-transfer-api_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class AchTransferRhsState implements RhEnum<AchTransferRhsState> {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AchTransferRhsState[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String serverValue;
    public static final AchTransferRhsState REQUESTED = new AchTransferRhsState("REQUESTED", 0, "requested");
    public static final AchTransferRhsState NEEDS_APPROVAL = new AchTransferRhsState("NEEDS_APPROVAL", 1, "needs_approval");
    public static final AchTransferRhsState APPROVED = new AchTransferRhsState("APPROVED", 2, "approved");
    public static final AchTransferRhsState REJECTED = new AchTransferRhsState("REJECTED", 3, "rejected");
    public static final AchTransferRhsState CANCELLED = new AchTransferRhsState("CANCELLED", 4, "cancelled");
    public static final AchTransferRhsState FAILED = new AchTransferRhsState("FAILED", 5, "failed");
    public static final AchTransferRhsState SUBMITTED = new AchTransferRhsState("SUBMITTED", 6, ApiOptionLevelChange.STATE_SUBMITTED);
    public static final AchTransferRhsState REVERSED = new AchTransferRhsState("REVERSED", 7, "reversed");
    public static final AchTransferRhsState COMPLETED = new AchTransferRhsState("COMPLETED", 8, "completed");
    public static final AchTransferRhsState NEW = new AchTransferRhsState("NEW", 9, "new");
    public static final AchTransferRhsState PENDING_CANCEL = new AchTransferRhsState("PENDING_CANCEL", 10, "pending_cancel");
    public static final AchTransferRhsState REQUESTING = new AchTransferRhsState("REQUESTING", 11, "requesting");
    public static final AchTransferRhsState ASKING_APPROVAL = new AchTransferRhsState("ASKING_APPROVAL", 12, "asking_approval");
    public static final AchTransferRhsState REVIEWING_BALANCE = new AchTransferRhsState("REVIEWING_BALANCE", 13, "reviewing_balance");
    public static final AchTransferRhsState PENDING_CONFIRMATION = new AchTransferRhsState("PENDING_CONFIRMATION", 14, "pending_confirmation");
    public static final AchTransferRhsState ABORTED = new AchTransferRhsState("ABORTED", 15, "aborted");

    private static final /* synthetic */ AchTransferRhsState[] $values() {
        return new AchTransferRhsState[]{REQUESTED, NEEDS_APPROVAL, APPROVED, REJECTED, CANCELLED, FAILED, SUBMITTED, REVERSED, COMPLETED, NEW, PENDING_CANCEL, REQUESTING, ASKING_APPROVAL, REVIEWING_BALANCE, PENDING_CONFIRMATION, ABORTED};
    }

    @JvmStatic
    public static AchTransferRhsState fromServerValue(String str) {
        return INSTANCE.fromServerValue(str);
    }

    public static EnumEntries<AchTransferRhsState> getEntries() {
        return $ENTRIES;
    }

    @JvmStatic
    public static String toServerValue(AchTransferRhsState achTransferRhsState) {
        return INSTANCE.toServerValue(achTransferRhsState);
    }

    private AchTransferRhsState(String str, int i, String str2) {
        this.serverValue = str2;
    }

    @Override // com.robinhood.enums.RhEnum
    public String getServerValue() {
        return this.serverValue;
    }

    static {
        AchTransferRhsState[] achTransferRhsStateArr$values = $values();
        $VALUES = achTransferRhsStateArr$values;
        $ENTRIES = EnumEntries2.enumEntries(achTransferRhsStateArr$values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: AchTransferRhsState.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0017J\u0014\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0017¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/transfers/api/AchTransferRhsState$Companion;", "Lcom/robinhood/enums/RhEnum$Converter$Optional;", "Lcom/robinhood/transfers/api/AchTransferRhsState;", "<init>", "()V", "toServerValue", "", "enumValue", "fromServerValue", "serverValue", "lib-models-transfer-api_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion extends RhEnum.Converter.Optional<AchTransferRhsState> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
            super(AchTransferRhsState.values(), false, 2, null);
        }

        @Override // com.robinhood.enums.RhEnum.Converter
        @JvmStatic
        public String toServerValue(AchTransferRhsState enumValue) {
            return super.toServerValue((Enum) enumValue);
        }

        @Override // com.robinhood.enums.RhEnum.Converter.Optional, com.robinhood.enums.RhEnum.Converter
        @JvmStatic
        public AchTransferRhsState fromServerValue(String serverValue) {
            return (AchTransferRhsState) super.fromServerValue(serverValue);
        }
    }

    public static AchTransferRhsState valueOf(String str) {
        return (AchTransferRhsState) Enum.valueOf(AchTransferRhsState.class, str);
    }

    public static AchTransferRhsState[] values() {
        return (AchTransferRhsState[]) $VALUES.clone();
    }
}
