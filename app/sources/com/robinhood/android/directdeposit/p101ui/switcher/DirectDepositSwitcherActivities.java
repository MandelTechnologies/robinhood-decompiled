package com.robinhood.android.directdeposit.p101ui.switcher;

import com.robinhood.analytics.EventLogger;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DirectDepositSwitcherActivities.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, m3636d2 = {"logDdSwitcherCompletion", "", "Lcom/robinhood/android/directdeposit/ui/switcher/DirectDepositSwitcherActivity;", "feature-direct-deposit_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.directdeposit.ui.switcher.DirectDepositSwitcherActivitiesKt, reason: use source file name */
/* loaded from: classes27.dex */
public final class DirectDepositSwitcherActivities {
    public static final void logDdSwitcherCompletion(DirectDepositSwitcherActivity directDepositSwitcherActivity) {
        Intrinsics.checkNotNullParameter(directDepositSwitcherActivity, "<this>");
        EventLogger.DefaultImpls.logTap$default(directDepositSwitcherActivity.getEventLogger(), UserInteractionEventData.Action.COMPLETE_DD_SWITCHER, new Screen(Screen.Name.DD_SWITCHER_CONFIRMATION, null, null, null, 14, null), new Component(Component.ComponentType.DONE_BUTTON, null, null, 6, null), null, null, false, 56, null);
    }
}
