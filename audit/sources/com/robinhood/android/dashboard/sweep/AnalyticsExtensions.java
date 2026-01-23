package com.robinhood.android.dashboard.sweep;

import com.robinhood.analytics.EventLogger;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AnalyticsExtensions.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a/\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"logSweepSectionCtaTap", "", "Lcom/robinhood/analytics/EventLogger;", "screen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "loggingIdentifier", "", "loggingActionIdentifier", "", "(Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/rosetta/eventlogging/Screen;Ljava/lang/String;Ljava/lang/Integer;)V", "lib-dashboard-sweep_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.dashboard.sweep.AnalyticsExtensionsKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class AnalyticsExtensions {
    public static /* synthetic */ void logSweepSectionCtaTap$default(EventLogger eventLogger, Screen screen, String str, Integer num, int i, Object obj) {
        if ((i & 4) != 0) {
            num = null;
        }
        logSweepSectionCtaTap(eventLogger, screen, str, num);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void logSweepSectionCtaTap(EventLogger eventLogger, Screen screen, String str, Integer num) {
        UserInteractionEventData.Action actionFromValue;
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        Component.ComponentType componentType = Component.ComponentType.LINK_BUTTON;
        if (str == null) {
            str = "sweep_section_v2_cta";
        }
        Component component = new Component(componentType, str, null, 4, null);
        if (num != null) {
            actionFromValue = UserInteractionEventData.Action.INSTANCE.fromValue(num.intValue());
            if (actionFromValue == null) {
                actionFromValue = UserInteractionEventData.Action.ACTION_UNSPECIFIED;
            }
        }
        EventLogger.DefaultImpls.logTap$default(eventLogger, actionFromValue, screen, component, null, null, false, 56, null);
    }
}
