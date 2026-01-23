package com.withpersona.sdk2.inquiry.sandbox;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SandboxFlags.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0002\u0013\u0014B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0011\u001a\u00020\u0012R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u00020\u00058FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0006\"\u0004\b\u0010\u0010\b¨\u0006\u0015"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/sandbox/SandboxFlags;", "", "<init>", "()V", "isSandboxModeEnabled", "", "()Z", "setSandboxModeEnabled", "(Z)V", "value", "Lcom/withpersona/sdk2/inquiry/sandbox/SandboxFlags$ForcedStatus;", "debugForcedStatus", "getDebugForcedStatus", "()Lcom/withpersona/sdk2/inquiry/sandbox/SandboxFlags$ForcedStatus;", "simulateGovIdNfc", "getSimulateGovIdNfc", "setSimulateGovIdNfc", AnalyticsStrings.BUTTON_FRIDAY_TRADING_SETTING_TOGGLE, "", "ForcedStatus", "Companion", "sandbox_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class SandboxFlags {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private boolean isSandboxModeEnabled;
    private ForcedStatus debugForcedStatus = ForcedStatus.Passed;
    private boolean simulateGovIdNfc = true;

    /* compiled from: SandboxFlags.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ForcedStatus.values().length];
            try {
                iArr[ForcedStatus.Failed.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ForcedStatus.Passed.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: isSandboxModeEnabled, reason: from getter */
    public final boolean getIsSandboxModeEnabled() {
        return this.isSandboxModeEnabled;
    }

    public final void setSandboxModeEnabled(boolean z) {
        this.isSandboxModeEnabled = z;
    }

    public final ForcedStatus getDebugForcedStatus() {
        return this.debugForcedStatus;
    }

    public final void setSimulateGovIdNfc(boolean z) {
        this.simulateGovIdNfc = z;
    }

    public final boolean getSimulateGovIdNfc() {
        return this.isSandboxModeEnabled && this.simulateGovIdNfc;
    }

    public final void toggle() {
        ForcedStatus forcedStatus;
        int i = WhenMappings.$EnumSwitchMapping$0[this.debugForcedStatus.ordinal()];
        if (i == 1) {
            forcedStatus = ForcedStatus.Passed;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            forcedStatus = ForcedStatus.Failed;
        }
        this.debugForcedStatus = forcedStatus;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SandboxFlags.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/sandbox/SandboxFlags$ForcedStatus;", "", "<init>", "(Ljava/lang/String;I)V", "Failed", "Passed", "sandbox_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class ForcedStatus {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ForcedStatus[] $VALUES;
        public static final ForcedStatus Failed = new ForcedStatus("Failed", 0);
        public static final ForcedStatus Passed = new ForcedStatus("Passed", 1);

        private static final /* synthetic */ ForcedStatus[] $values() {
            return new ForcedStatus[]{Failed, Passed};
        }

        public static EnumEntries<ForcedStatus> getEntries() {
            return $ENTRIES;
        }

        private ForcedStatus(String str, int i) {
        }

        static {
            ForcedStatus[] forcedStatusArr$values = $values();
            $VALUES = forcedStatusArr$values;
            $ENTRIES = EnumEntries2.enumEntries(forcedStatusArr$values);
        }

        public static ForcedStatus valueOf(String str) {
            return (ForcedStatus) Enum.valueOf(ForcedStatus.class, str);
        }

        public static ForcedStatus[] values() {
            return (ForcedStatus[]) $VALUES.clone();
        }
    }

    /* compiled from: SandboxFlags.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\n\u0010\u0004\u001a\u00020\u0005*\u00020\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/sandbox/SandboxFlags$Companion;", "", "<init>", "()V", "toKey", "", "Lcom/withpersona/sdk2/inquiry/sandbox/SandboxFlags$ForcedStatus;", "sandbox_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Companion {

        /* compiled from: SandboxFlags.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ForcedStatus.values().length];
                try {
                    iArr[ForcedStatus.Failed.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ForcedStatus.Passed.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String toKey(ForcedStatus forcedStatus) {
            Intrinsics.checkNotNullParameter(forcedStatus, "<this>");
            int i = WhenMappings.$EnumSwitchMapping$0[forcedStatus.ordinal()];
            if (i == 1) {
                return "failed";
            }
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return "passed";
        }
    }
}
