package com.robinhood.android.earlypay.toggle.p113ui;

import com.robinhood.analytics.EventLogger;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EventLoggers.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m3636d2 = {"logEarlyPayEnrollmentChange", "", "Lcom/robinhood/analytics/EventLogger;", "enrolled", "", "feature-early-pay_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.earlypay.toggle.ui.EventLoggersKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class EventLoggers2 {
    public static final void logEarlyPayEnrollmentChange(EventLogger eventLogger, boolean z) {
        UserInteractionEventData.Action action;
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        if (z) {
            action = UserInteractionEventData.Action.ENABLE_EARLY_PAY;
        } else {
            action = UserInteractionEventData.Action.DISABLE_EARLY_PAY;
        }
        EventLogger.DefaultImpls.logTap$default(eventLogger, action, null, new Component(Component.ComponentType.EARLY_PAY_TOGGLE, null, null, 6, null), null, null, false, 58, null);
    }
}
