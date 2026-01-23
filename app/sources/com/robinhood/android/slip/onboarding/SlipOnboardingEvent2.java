package com.robinhood.android.slip.onboarding;

import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.android.slip.onboarding.SlipOnboardingEvent;
import com.robinhood.models.p320db.SlipOnboarding;
import com.robinhood.rosetta.eventlogging.SLIPContext;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SlipOnboardingEvent.kt */
@Metadata(m3635d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a\n\u0010\u0000\u001a\u00020\u0007*\u00020\b\u001a\n\u0010\u0000\u001a\u00020\t*\u00020\n\u001a\f\u0010\u0000\u001a\u00020\u000b*\u00020\fH\u0000¨\u0006\r"}, m3636d2 = {"toEvent", "Lcom/robinhood/android/slip/onboarding/SlipOnboardingEvent$ShowSplash;", "Lcom/robinhood/models/db/SlipOnboarding$SplashView;", "showRecommendedFlow", "", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/rosetta/eventlogging/SLIPContext;", "Lcom/robinhood/android/slip/onboarding/SlipOnboardingEvent$ShowValueProps;", "Lcom/robinhood/models/db/SlipOnboarding$ValuePropsView;", "Lcom/robinhood/android/slip/onboarding/SlipOnboardingEvent$ShowSuccess;", "Lcom/robinhood/models/db/SlipOnboarding$SuccessView;", "Lcom/robinhood/android/slip/onboarding/SlipOnboardingEvent$ShowError;", "", "feature-slip_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.slip.onboarding.SlipOnboardingEventKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class SlipOnboardingEvent2 {
    public static final SlipOnboardingEvent.ShowSplash toEvent(SlipOnboarding.SplashView splashView, boolean z, SLIPContext loggingContext) {
        Intrinsics.checkNotNullParameter(splashView, "<this>");
        Intrinsics.checkNotNullParameter(loggingContext, "loggingContext");
        return new SlipOnboardingEvent.ShowSplash(splashView, z, loggingContext);
    }

    public static final SlipOnboardingEvent.ShowValueProps toEvent(SlipOnboarding.ValuePropsView valuePropsView) {
        Intrinsics.checkNotNullParameter(valuePropsView, "<this>");
        return new SlipOnboardingEvent.ShowValueProps(valuePropsView);
    }

    public static final SlipOnboardingEvent.ShowSuccess toEvent(SlipOnboarding.SuccessView successView) {
        Intrinsics.checkNotNullParameter(successView, "<this>");
        return new SlipOnboardingEvent.ShowSuccess(successView);
    }

    public static final SlipOnboardingEvent.ShowError toEvent(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        return new SlipOnboardingEvent.ShowError(th);
    }
}
