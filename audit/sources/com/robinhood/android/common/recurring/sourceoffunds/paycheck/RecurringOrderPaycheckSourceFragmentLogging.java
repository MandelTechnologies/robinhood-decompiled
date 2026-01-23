package com.robinhood.android.common.recurring.sourceoffunds.paycheck;

import com.robinhood.analytics.EventLogger;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.RecurringContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecurringOrderPaycheckSourceFragmentLogging.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, m3636d2 = {"logDirectDepositSelection", "", "Lcom/robinhood/android/common/recurring/sourceoffunds/paycheck/RecurringOrderPaycheckSourceFragment;", "recurringContext", "Lcom/robinhood/rosetta/eventlogging/RecurringContext;", "feature-lib-recurring_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.recurring.sourceoffunds.paycheck.RecurringOrderPaycheckSourceFragmentLoggingKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class RecurringOrderPaycheckSourceFragmentLogging {
    public static final void logDirectDepositSelection(RecurringOrderPaycheckSourceFragment recurringOrderPaycheckSourceFragment, RecurringContext recurringContext) {
        Intrinsics.checkNotNullParameter(recurringOrderPaycheckSourceFragment, "<this>");
        Intrinsics.checkNotNullParameter(recurringContext, "recurringContext");
        Screen screen = new Screen(Screen.Name.RECURRING_DIRECT_DEPOSIT_SOURCE, null, null, null, 14, null);
        Component component = new Component(Component.ComponentType.CONTINUE_BUTTON, null, null, 6, null);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        String str = null;
        EventLogger.DefaultImpls.logTap$default(recurringOrderPaycheckSourceFragment.getEventLogger(), UserInteractionEventData.Action.SELECT_PAYMENT_METHOD, screen, component, null, new Context(i, i2, i3, null, null, str, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, recurringContext, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8388609, -1, -1, -1, -1, -1, 16383, null), false, 40, null);
    }
}
