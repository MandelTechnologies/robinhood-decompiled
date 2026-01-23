package com.robinhood.android.earlypay.enrollment.p110ui;

import com.robinhood.analytics.EventLogger;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EarlyPayEnrollmentFragmentLogging.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, m3636d2 = {"logCtaTap", "", "Lcom/robinhood/android/earlypay/enrollment/ui/EarlyPayEnrollmentFragment;", "action", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "feature-early-pay_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.earlypay.enrollment.ui.EarlyPayEnrollmentFragmentLoggingKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class EarlyPayEnrollmentFragmentLogging {
    public static final void logCtaTap(EarlyPayEnrollmentFragment earlyPayEnrollmentFragment, UserInteractionEventData.Action action) {
        Intrinsics.checkNotNullParameter(earlyPayEnrollmentFragment, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        EventLogger.DefaultImpls.logTap$default(earlyPayEnrollmentFragment.getEventLogger(), action, new Screen(Screen.Name.EARLY_PAY_LEARN_MORE, null, null, null, 14, null), new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, null, false, 56, null);
    }
}
