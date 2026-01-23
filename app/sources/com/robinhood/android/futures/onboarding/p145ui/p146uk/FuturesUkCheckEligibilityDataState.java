package com.robinhood.android.futures.onboarding.p145ui.p146uk;

import com.robinhood.android.models.futures.p192ui.SuitabilityResult;
import com.robinhood.ceres.p284v1.SuitabilityCheckpointDto;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesUkCheckEligibilityDuxo.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/futures/onboarding/ui/uk/FuturesUkCheckEligibilityDataState;", "", "checkpoint", "Lcom/robinhood/ceres/v1/SuitabilityCheckpointDto;", "currentCheckpointSuitability", "Lcom/robinhood/android/models/futures/ui/SuitabilityResult;", "nextCheckpointSuitability", "<init>", "(Lcom/robinhood/ceres/v1/SuitabilityCheckpointDto;Lcom/robinhood/android/models/futures/ui/SuitabilityResult;Lcom/robinhood/android/models/futures/ui/SuitabilityResult;)V", "getCheckpoint", "()Lcom/robinhood/ceres/v1/SuitabilityCheckpointDto;", "getCurrentCheckpointSuitability", "()Lcom/robinhood/android/models/futures/ui/SuitabilityResult;", "getNextCheckpointSuitability", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-futures-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FuturesUkCheckEligibilityDataState {
    public static final int $stable = 8;
    private final SuitabilityCheckpointDto checkpoint;
    private final SuitabilityResult currentCheckpointSuitability;
    private final SuitabilityResult nextCheckpointSuitability;

    public static /* synthetic */ FuturesUkCheckEligibilityDataState copy$default(FuturesUkCheckEligibilityDataState futuresUkCheckEligibilityDataState, SuitabilityCheckpointDto suitabilityCheckpointDto, SuitabilityResult suitabilityResult, SuitabilityResult suitabilityResult2, int i, Object obj) {
        if ((i & 1) != 0) {
            suitabilityCheckpointDto = futuresUkCheckEligibilityDataState.checkpoint;
        }
        if ((i & 2) != 0) {
            suitabilityResult = futuresUkCheckEligibilityDataState.currentCheckpointSuitability;
        }
        if ((i & 4) != 0) {
            suitabilityResult2 = futuresUkCheckEligibilityDataState.nextCheckpointSuitability;
        }
        return futuresUkCheckEligibilityDataState.copy(suitabilityCheckpointDto, suitabilityResult, suitabilityResult2);
    }

    /* renamed from: component1, reason: from getter */
    public final SuitabilityCheckpointDto getCheckpoint() {
        return this.checkpoint;
    }

    /* renamed from: component2, reason: from getter */
    public final SuitabilityResult getCurrentCheckpointSuitability() {
        return this.currentCheckpointSuitability;
    }

    /* renamed from: component3, reason: from getter */
    public final SuitabilityResult getNextCheckpointSuitability() {
        return this.nextCheckpointSuitability;
    }

    public final FuturesUkCheckEligibilityDataState copy(SuitabilityCheckpointDto checkpoint, SuitabilityResult currentCheckpointSuitability, SuitabilityResult nextCheckpointSuitability) {
        return new FuturesUkCheckEligibilityDataState(checkpoint, currentCheckpointSuitability, nextCheckpointSuitability);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FuturesUkCheckEligibilityDataState)) {
            return false;
        }
        FuturesUkCheckEligibilityDataState futuresUkCheckEligibilityDataState = (FuturesUkCheckEligibilityDataState) other;
        return this.checkpoint == futuresUkCheckEligibilityDataState.checkpoint && Intrinsics.areEqual(this.currentCheckpointSuitability, futuresUkCheckEligibilityDataState.currentCheckpointSuitability) && Intrinsics.areEqual(this.nextCheckpointSuitability, futuresUkCheckEligibilityDataState.nextCheckpointSuitability);
    }

    public int hashCode() {
        SuitabilityCheckpointDto suitabilityCheckpointDto = this.checkpoint;
        int iHashCode = (suitabilityCheckpointDto == null ? 0 : suitabilityCheckpointDto.hashCode()) * 31;
        SuitabilityResult suitabilityResult = this.currentCheckpointSuitability;
        int iHashCode2 = (iHashCode + (suitabilityResult == null ? 0 : suitabilityResult.hashCode())) * 31;
        SuitabilityResult suitabilityResult2 = this.nextCheckpointSuitability;
        return iHashCode2 + (suitabilityResult2 != null ? suitabilityResult2.hashCode() : 0);
    }

    public String toString() {
        return "FuturesUkCheckEligibilityDataState(checkpoint=" + this.checkpoint + ", currentCheckpointSuitability=" + this.currentCheckpointSuitability + ", nextCheckpointSuitability=" + this.nextCheckpointSuitability + ")";
    }

    public FuturesUkCheckEligibilityDataState(SuitabilityCheckpointDto suitabilityCheckpointDto, SuitabilityResult suitabilityResult, SuitabilityResult suitabilityResult2) {
        this.checkpoint = suitabilityCheckpointDto;
        this.currentCheckpointSuitability = suitabilityResult;
        this.nextCheckpointSuitability = suitabilityResult2;
    }

    public /* synthetic */ FuturesUkCheckEligibilityDataState(SuitabilityCheckpointDto suitabilityCheckpointDto, SuitabilityResult suitabilityResult, SuitabilityResult suitabilityResult2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(suitabilityCheckpointDto, (i & 2) != 0 ? null : suitabilityResult, (i & 4) != 0 ? null : suitabilityResult2);
    }

    public final SuitabilityCheckpointDto getCheckpoint() {
        return this.checkpoint;
    }

    public final SuitabilityResult getCurrentCheckpointSuitability() {
        return this.currentCheckpointSuitability;
    }

    public final SuitabilityResult getNextCheckpointSuitability() {
        return this.nextCheckpointSuitability;
    }
}
