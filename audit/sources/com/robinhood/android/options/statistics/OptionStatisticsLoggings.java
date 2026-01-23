package com.robinhood.android.options.statistics;

import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.OptionsContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.extensions.Uuids;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionStatisticsLoggings.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, m3636d2 = {"getSegmentedControlEventDescriptor", "Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "optionChainId", "Ljava/util/UUID;", "feature-lib-options-statistics_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.statistics.OptionStatisticsLoggingsKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionStatisticsLoggings {
    public static final UserInteractionEventDescriptor getSegmentedControlEventDescriptor(UUID optionChainId) {
        Intrinsics.checkNotNullParameter(optionChainId, "optionChainId");
        return new UserInteractionEventDescriptor(null, new Screen(Screen.Name.OPTION_STATISTICS_BOTTOM_SHEET, null, null, null, 14, null), null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new OptionsContext(Uuids.safeToString(optionChainId), null, null, null, null, null, null, null, null, null, null, null, null, null, 16382, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -4194305, -1, -1, -1, -1, 16383, null), new Component(Component.ComponentType.SEGMENT, "Simulated Returns", null, 4, null), null, 37, null);
    }
}
