package com.robinhood.android.optionschain;

import com.robinhood.analytics.EventLogger;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionEditLegRatioFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m3636d2 = {"logErrorAlertAppear", "", "Lcom/robinhood/analytics/EventLogger;", "identifier", "", "feature-options-chain_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionschain.OptionEditLegRatioFragmentKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionEditLegRatioFragment5 {
    public static final void logErrorAlertAppear(EventLogger eventLogger, String identifier) {
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        EventLogger.DefaultImpls.logAppear$default(eventLogger, null, new Screen(Screen.Name.OPTION_EDIT_LEG_RATIO, null, null, null, 14, null), new Component(Component.ComponentType.ERROR_ALERT, identifier, null, 4, null), null, null, 25, null);
    }
}
