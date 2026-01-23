package com.robinhood.android.advisory.projection.frequency;

import com.robinhood.android.advisory.contracts.SimulateDepositFrequency;
import com.robinhood.android.advisory.projection.C9264R;
import com.robinhood.models.advisory.p304db.projection.ProjectionFrequency;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SimulateDepositFrequency.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0001*\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004\"\u0015\u0010\u0007\u001a\u00020\b*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\t\"\u0015\u0010\n\u001a\u00020\u000b*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u0015\u0010\u000e\u001a\u00020\u0002*\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\"\u0015\u0010\u0012\u001a\u00020\u000f*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m3636d2 = {"titleResId", "", "Lcom/robinhood/android/advisory/contracts/SimulateDepositFrequency;", "getTitleResId", "(Lcom/robinhood/android/advisory/contracts/SimulateDepositFrequency;)I", "actionTextResId", "getActionTextResId", "isRecurring", "", "(Lcom/robinhood/android/advisory/contracts/SimulateDepositFrequency;)Z", "eventIdentifier", "", "getEventIdentifier", "(Lcom/robinhood/android/advisory/contracts/SimulateDepositFrequency;)Ljava/lang/String;", "simulateDepositFrequency", "Lcom/robinhood/models/advisory/db/projection/ProjectionFrequency;", "getSimulateDepositFrequency", "(Lcom/robinhood/models/advisory/db/projection/ProjectionFrequency;)Lcom/robinhood/android/advisory/contracts/SimulateDepositFrequency;", "projectionFrequency", "getProjectionFrequency", "(Lcom/robinhood/android/advisory/contracts/SimulateDepositFrequency;)Lcom/robinhood/models/advisory/db/projection/ProjectionFrequency;", "feature-projected-returns_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisory.projection.frequency.SimulateDepositFrequencyKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class SimulateDepositFrequency2 {

    /* compiled from: SimulateDepositFrequency.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.advisory.projection.frequency.SimulateDepositFrequencyKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[SimulateDepositFrequency.values().length];
            try {
                iArr[SimulateDepositFrequency.ONE_TIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SimulateDepositFrequency.MONTHLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SimulateDepositFrequency.QUARTERLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ProjectionFrequency.values().length];
            try {
                iArr2[ProjectionFrequency.MONTHLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ProjectionFrequency.QUARTERLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ProjectionFrequency.UNSPECIFIED.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final int getTitleResId(SimulateDepositFrequency simulateDepositFrequency) {
        Intrinsics.checkNotNullParameter(simulateDepositFrequency, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[simulateDepositFrequency.ordinal()];
        if (i == 1) {
            return C9264R.string.frequency_one_time;
        }
        if (i == 2) {
            return C9264R.string.frequency_monthly;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return C9264R.string.frequency_quarterly;
    }

    public static final int getActionTextResId(SimulateDepositFrequency simulateDepositFrequency) {
        Intrinsics.checkNotNullParameter(simulateDepositFrequency, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[simulateDepositFrequency.ordinal()];
        if (i == 1) {
            return C9264R.string.action_text_one_time;
        }
        if (i == 2) {
            return C9264R.string.action_text_monthly;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return C9264R.string.action_text_quarterly;
    }

    public static final boolean isRecurring(SimulateDepositFrequency simulateDepositFrequency) {
        Intrinsics.checkNotNullParameter(simulateDepositFrequency, "<this>");
        return CollectionsKt.listOf((Object[]) new SimulateDepositFrequency[]{SimulateDepositFrequency.QUARTERLY, SimulateDepositFrequency.MONTHLY}).contains(simulateDepositFrequency);
    }

    public static final String getEventIdentifier(SimulateDepositFrequency simulateDepositFrequency) {
        Intrinsics.checkNotNullParameter(simulateDepositFrequency, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[simulateDepositFrequency.ordinal()];
        if (i == 1) {
            return "onetime";
        }
        if (i == 2) {
            return "monthly";
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return "quarterly";
    }

    public static final SimulateDepositFrequency getSimulateDepositFrequency(ProjectionFrequency projectionFrequency) {
        Intrinsics.checkNotNullParameter(projectionFrequency, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$1[projectionFrequency.ordinal()];
        if (i == 1) {
            return SimulateDepositFrequency.MONTHLY;
        }
        if (i == 2) {
            return SimulateDepositFrequency.QUARTERLY;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return SimulateDepositFrequency.ONE_TIME;
    }

    public static final ProjectionFrequency getProjectionFrequency(SimulateDepositFrequency simulateDepositFrequency) {
        Intrinsics.checkNotNullParameter(simulateDepositFrequency, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[simulateDepositFrequency.ordinal()];
        if (i == 1) {
            return ProjectionFrequency.UNSPECIFIED;
        }
        if (i == 2) {
            return ProjectionFrequency.MONTHLY;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return ProjectionFrequency.QUARTERLY;
    }
}
