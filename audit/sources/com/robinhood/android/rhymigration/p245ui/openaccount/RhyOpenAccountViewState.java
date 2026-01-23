package com.robinhood.android.rhymigration.p245ui.openaccount;

import com.robinhood.android.rhymigration.p245ui.openaccount.RhyOpenAccountViewState2;
import com.robinhood.models.api.ApiIacAlertSheet;
import com.robinhood.models.api.bonfire.ApiRhyApplicationStatus;
import com.robinhood.models.p320db.IacAlertSheetLocation;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyOpenAccountViewState.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\f\u0010\u0011\u001a\u00020\u0012*\u00020\u0003H\u0002J\f\u0010\u0011\u001a\u00020\u0012*\u00020\u0013H\u0002J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÂ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÂ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J3\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\nR\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/openaccount/RhyOpenAccountViewState;", "", "applicationStatus", "Lcom/robinhood/models/api/bonfire/ApiRhyApplicationStatus;", "shouldTimeout", "", "successTransitionAnimationCompleted", "isInCmSunset", "<init>", "(Lcom/robinhood/models/api/bonfire/ApiRhyApplicationStatus;ZZZ)V", "()Z", "shouldPollApplicationStatus", "getShouldPollApplicationStatus", "currentStateAction", "Lcom/robinhood/android/rhymigration/ui/openaccount/CurrentStateAction;", "getCurrentStateAction", "()Lcom/robinhood/android/rhymigration/ui/openaccount/CurrentStateAction;", "toBottomSheetAction", "Lcom/robinhood/android/rhymigration/ui/openaccount/CurrentStateAction$ShowIacAlertSheet;", "Lcom/robinhood/models/api/ApiIacAlertSheet;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class RhyOpenAccountViewState {
    public static final int $stable = 8;
    private final ApiRhyApplicationStatus applicationStatus;
    private final boolean isInCmSunset;
    private final boolean shouldPollApplicationStatus;
    private final boolean shouldTimeout;
    private final boolean successTransitionAnimationCompleted;

    public RhyOpenAccountViewState() {
        this(null, false, false, false, 15, null);
    }

    /* renamed from: component1, reason: from getter */
    private final ApiRhyApplicationStatus getApplicationStatus() {
        return this.applicationStatus;
    }

    /* renamed from: component2, reason: from getter */
    private final boolean getShouldTimeout() {
        return this.shouldTimeout;
    }

    /* renamed from: component3, reason: from getter */
    private final boolean getSuccessTransitionAnimationCompleted() {
        return this.successTransitionAnimationCompleted;
    }

    public static /* synthetic */ RhyOpenAccountViewState copy$default(RhyOpenAccountViewState rhyOpenAccountViewState, ApiRhyApplicationStatus apiRhyApplicationStatus, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            apiRhyApplicationStatus = rhyOpenAccountViewState.applicationStatus;
        }
        if ((i & 2) != 0) {
            z = rhyOpenAccountViewState.shouldTimeout;
        }
        if ((i & 4) != 0) {
            z2 = rhyOpenAccountViewState.successTransitionAnimationCompleted;
        }
        if ((i & 8) != 0) {
            z3 = rhyOpenAccountViewState.isInCmSunset;
        }
        return rhyOpenAccountViewState.copy(apiRhyApplicationStatus, z, z2, z3);
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsInCmSunset() {
        return this.isInCmSunset;
    }

    public final RhyOpenAccountViewState copy(ApiRhyApplicationStatus applicationStatus, boolean shouldTimeout, boolean successTransitionAnimationCompleted, boolean isInCmSunset) {
        return new RhyOpenAccountViewState(applicationStatus, shouldTimeout, successTransitionAnimationCompleted, isInCmSunset);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RhyOpenAccountViewState)) {
            return false;
        }
        RhyOpenAccountViewState rhyOpenAccountViewState = (RhyOpenAccountViewState) other;
        return Intrinsics.areEqual(this.applicationStatus, rhyOpenAccountViewState.applicationStatus) && this.shouldTimeout == rhyOpenAccountViewState.shouldTimeout && this.successTransitionAnimationCompleted == rhyOpenAccountViewState.successTransitionAnimationCompleted && this.isInCmSunset == rhyOpenAccountViewState.isInCmSunset;
    }

    public int hashCode() {
        ApiRhyApplicationStatus apiRhyApplicationStatus = this.applicationStatus;
        return ((((((apiRhyApplicationStatus == null ? 0 : apiRhyApplicationStatus.hashCode()) * 31) + Boolean.hashCode(this.shouldTimeout)) * 31) + Boolean.hashCode(this.successTransitionAnimationCompleted)) * 31) + Boolean.hashCode(this.isInCmSunset);
    }

    public String toString() {
        return "RhyOpenAccountViewState(applicationStatus=" + this.applicationStatus + ", shouldTimeout=" + this.shouldTimeout + ", successTransitionAnimationCompleted=" + this.successTransitionAnimationCompleted + ", isInCmSunset=" + this.isInCmSunset + ")";
    }

    public RhyOpenAccountViewState(ApiRhyApplicationStatus apiRhyApplicationStatus, boolean z, boolean z2, boolean z3) {
        this.applicationStatus = apiRhyApplicationStatus;
        this.shouldTimeout = z;
        this.successTransitionAnimationCompleted = z2;
        this.isInCmSunset = z3;
        this.shouldPollApplicationStatus = getCurrentStateAction() instanceof RhyOpenAccountViewState2.Waiting;
    }

    public /* synthetic */ RhyOpenAccountViewState(ApiRhyApplicationStatus apiRhyApplicationStatus, boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : apiRhyApplicationStatus, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3);
    }

    public final boolean isInCmSunset() {
        return this.isInCmSunset;
    }

    public final boolean getShouldPollApplicationStatus() {
        return this.shouldPollApplicationStatus;
    }

    public final RhyOpenAccountViewState2 getCurrentStateAction() {
        ApiIacAlertSheet component;
        RhyOpenAccountViewState2.ShowIacAlertSheet bottomSheetAction;
        ApiRhyApplicationStatus apiRhyApplicationStatus = this.applicationStatus;
        if ((apiRhyApplicationStatus != null ? apiRhyApplicationStatus.getStatus() : null) == ApiRhyApplicationStatus.Status.APPROVED) {
            if (this.successTransitionAnimationCompleted) {
                return RhyOpenAccountViewState2.LoopAtApproved.INSTANCE;
            }
            return RhyOpenAccountViewState2.TransitToApproved.INSTANCE;
        }
        ApiRhyApplicationStatus apiRhyApplicationStatus2 = this.applicationStatus;
        if ((apiRhyApplicationStatus2 != null ? apiRhyApplicationStatus2.getStatus() : null) == ApiRhyApplicationStatus.Status.OTHER) {
            return toBottomSheetAction(this.applicationStatus);
        }
        if (this.shouldTimeout) {
            ApiRhyApplicationStatus apiRhyApplicationStatus3 = this.applicationStatus;
            return (apiRhyApplicationStatus3 == null || (component = apiRhyApplicationStatus3.getComponent()) == null || (bottomSheetAction = toBottomSheetAction(component)) == null) ? RhyOpenAccountViewState2.ShowTimeoutBottomSheet.INSTANCE : bottomSheetAction;
        }
        return RhyOpenAccountViewState2.Waiting.INSTANCE;
    }

    private final RhyOpenAccountViewState2.ShowIacAlertSheet toBottomSheetAction(ApiRhyApplicationStatus apiRhyApplicationStatus) {
        ApiIacAlertSheet component = apiRhyApplicationStatus.getComponent();
        if (component == null) {
            throw new IllegalArgumentException(("Status " + apiRhyApplicationStatus.getStatus() + " requires component object").toString());
        }
        return toBottomSheetAction(component);
    }

    private final RhyOpenAccountViewState2.ShowIacAlertSheet toBottomSheetAction(ApiIacAlertSheet apiIacAlertSheet) {
        return new RhyOpenAccountViewState2.ShowIacAlertSheet(apiIacAlertSheet.toUiModel(IacAlertSheetLocation.RHY_MIGRATION_OPEN_ACCOUNT));
    }
}
