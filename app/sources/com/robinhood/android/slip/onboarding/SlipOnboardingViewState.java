package com.robinhood.android.slip.onboarding;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.android.slip.onboarding.utils.SLIPContextUtils;
import com.robinhood.models.p320db.SlipOnboarding;
import com.robinhood.rosetta.eventlogging.SLIPContext;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SlipOnboardingViewState.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/SlipOnboardingViewState;", "", "showRecommendedFlow", "", "slipOnboarding", "Lcom/robinhood/models/db/SlipOnboarding;", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/rosetta/eventlogging/SLIPContext;", "<init>", "(ZLcom/robinhood/models/db/SlipOnboarding;Lcom/robinhood/rosetta/eventlogging/SLIPContext;)V", "getShowRecommendedFlow", "()Z", "getSlipOnboarding", "()Lcom/robinhood/models/db/SlipOnboarding;", "getLoggingContext", "()Lcom/robinhood/rosetta/eventlogging/SLIPContext;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SlipOnboardingViewState {
    public static final int $stable = 8;
    private final SLIPContext loggingContext;
    private final boolean showRecommendedFlow;
    private final SlipOnboarding slipOnboarding;

    public SlipOnboardingViewState() {
        this(false, null, null, 7, null);
    }

    public static /* synthetic */ SlipOnboardingViewState copy$default(SlipOnboardingViewState slipOnboardingViewState, boolean z, SlipOnboarding slipOnboarding, SLIPContext sLIPContext, int i, Object obj) {
        if ((i & 1) != 0) {
            z = slipOnboardingViewState.showRecommendedFlow;
        }
        if ((i & 2) != 0) {
            slipOnboarding = slipOnboardingViewState.slipOnboarding;
        }
        if ((i & 4) != 0) {
            sLIPContext = slipOnboardingViewState.loggingContext;
        }
        return slipOnboardingViewState.copy(z, slipOnboarding, sLIPContext);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getShowRecommendedFlow() {
        return this.showRecommendedFlow;
    }

    /* renamed from: component2, reason: from getter */
    public final SlipOnboarding getSlipOnboarding() {
        return this.slipOnboarding;
    }

    /* renamed from: component3, reason: from getter */
    public final SLIPContext getLoggingContext() {
        return this.loggingContext;
    }

    public final SlipOnboardingViewState copy(boolean showRecommendedFlow, SlipOnboarding slipOnboarding, SLIPContext loggingContext) {
        Intrinsics.checkNotNullParameter(loggingContext, "loggingContext");
        return new SlipOnboardingViewState(showRecommendedFlow, slipOnboarding, loggingContext);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SlipOnboardingViewState)) {
            return false;
        }
        SlipOnboardingViewState slipOnboardingViewState = (SlipOnboardingViewState) other;
        return this.showRecommendedFlow == slipOnboardingViewState.showRecommendedFlow && Intrinsics.areEqual(this.slipOnboarding, slipOnboardingViewState.slipOnboarding) && Intrinsics.areEqual(this.loggingContext, slipOnboardingViewState.loggingContext);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.showRecommendedFlow) * 31;
        SlipOnboarding slipOnboarding = this.slipOnboarding;
        return ((iHashCode + (slipOnboarding == null ? 0 : slipOnboarding.hashCode())) * 31) + this.loggingContext.hashCode();
    }

    public String toString() {
        return "SlipOnboardingViewState(showRecommendedFlow=" + this.showRecommendedFlow + ", slipOnboarding=" + this.slipOnboarding + ", loggingContext=" + this.loggingContext + ")";
    }

    public SlipOnboardingViewState(boolean z, SlipOnboarding slipOnboarding, SLIPContext loggingContext) {
        Intrinsics.checkNotNullParameter(loggingContext, "loggingContext");
        this.showRecommendedFlow = z;
        this.slipOnboarding = slipOnboarding;
        this.loggingContext = loggingContext;
    }

    public final boolean getShowRecommendedFlow() {
        return this.showRecommendedFlow;
    }

    public final SlipOnboarding getSlipOnboarding() {
        return this.slipOnboarding;
    }

    public /* synthetic */ SlipOnboardingViewState(boolean z, SlipOnboarding slipOnboarding, SLIPContext sLIPContext, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : slipOnboarding, (i & 4) != 0 ? SLIPContextUtils.createSlipContext$default(null, null, null, null, null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null) : sLIPContext);
    }

    public final SLIPContext getLoggingContext() {
        return this.loggingContext;
    }
}
