package com.robinhood.android.optionchain.chainsettings.logging;

import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.options.extensions.Events2;
import com.robinhood.android.optionchain.chainsettings.OptionChainCustomizationErrorEvent;
import com.robinhood.android.optionchain.chainsettings.OptionChainEntryPointType;
import com.robinhood.models.p320db.OptionChainAvailableMetrics;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.OptionsChainCustomizationContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import rosetta.option.StrategyName;

/* compiled from: OptionChainCustomizationLogging.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a$\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0010\b\u0002\u0010\n\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f\u001a\n\u0010\r\u001a\u00020\u0001*\u00020\u000e\u001a^\u0010\u000f\u001a\u00060\u000bj\u0002`\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0015\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m3636d2 = {"CHAIN_CUSTOMIZATION_EDUCATION_IDENTIFIER", "", "UNAVAILABLE_TOAST_IDENTIFIER", "REMOVED_TOAST_IDENTIFIER", "UNSUPPORTED_TOAST_IDENTIFIER", "logCustomizationTap", "", "Lcom/robinhood/analytics/EventLogger;", "component", "Lcom/robinhood/rosetta/eventlogging/Component;", "context", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "getToastComponentIdentifier", "Lcom/robinhood/android/optionchain/chainsettings/OptionChainCustomizationErrorEvent;", "getCustomizationEventContext", "entryPointId", "entryPointType", "Lcom/robinhood/android/optionchain/chainsettings/OptionChainEntryPointType;", "selectedCategory", "previousMetricOne", "Lcom/robinhood/models/db/OptionChainAvailableMetrics$MetricType;", "previousMetricTwo", "metricOne", "metricTwo", "feature-lib-option-chain_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionchain.chainsettings.logging.OptionChainCustomizationLoggingKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class OptionChainCustomizationLogging {
    public static final String CHAIN_CUSTOMIZATION_EDUCATION_IDENTIFIER = "chain_customization_education";
    public static final String REMOVED_TOAST_IDENTIFIER = "removed";
    public static final String UNAVAILABLE_TOAST_IDENTIFIER = "unavailable";
    public static final String UNSUPPORTED_TOAST_IDENTIFIER = "unsupported";

    public static /* synthetic */ void logCustomizationTap$default(EventLogger eventLogger, Component component, Context context, int i, Object obj) {
        if ((i & 2) != 0) {
            context = null;
        }
        logCustomizationTap(eventLogger, component, context);
    }

    public static final void logCustomizationTap(EventLogger eventLogger, Component component, Context context) {
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        Intrinsics.checkNotNullParameter(component, "component");
        EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.SELECT, new Screen(Screen.Name.OPTION_CHAIN_CUSTOMIZATION_SETTINGS, null, null, null, 14, null), component, null, context, false, 40, null);
    }

    public static final String getToastComponentIdentifier(OptionChainCustomizationErrorEvent optionChainCustomizationErrorEvent) {
        Intrinsics.checkNotNullParameter(optionChainCustomizationErrorEvent, "<this>");
        if (optionChainCustomizationErrorEvent instanceof OptionChainCustomizationErrorEvent.OptionServiceDown) {
            return UNAVAILABLE_TOAST_IDENTIFIER;
        }
        if (optionChainCustomizationErrorEvent instanceof OptionChainCustomizationErrorEvent.RemovedMetricType) {
            return REMOVED_TOAST_IDENTIFIER;
        }
        if (optionChainCustomizationErrorEvent instanceof OptionChainCustomizationErrorEvent.UnsupportedMetricType) {
            return UNSUPPORTED_TOAST_IDENTIFIER;
        }
        if (optionChainCustomizationErrorEvent instanceof OptionChainCustomizationErrorEvent.GenericError) {
            return "";
        }
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ Context getCustomizationEventContext$default(String str, OptionChainEntryPointType optionChainEntryPointType, String str2, OptionChainAvailableMetrics.MetricType metricType, OptionChainAvailableMetrics.MetricType metricType2, OptionChainAvailableMetrics.MetricType metricType3, OptionChainAvailableMetrics.MetricType metricType4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            optionChainEntryPointType = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            metricType = null;
        }
        if ((i & 16) != 0) {
            metricType2 = null;
        }
        if ((i & 32) != 0) {
            metricType3 = null;
        }
        if ((i & 64) != 0) {
            metricType4 = null;
        }
        return getCustomizationEventContext(str, optionChainEntryPointType, str2, metricType, metricType2, metricType3, metricType4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Context getCustomizationEventContext(String str, OptionChainEntryPointType optionChainEntryPointType, String str2, OptionChainAvailableMetrics.MetricType metricType, OptionChainAvailableMetrics.MetricType metricType2, OptionChainAvailableMetrics.MetricType metricType3, OptionChainAvailableMetrics.MetricType metricType4) {
        String str3;
        StrategyName strategyName;
        String str4 = "";
        if (optionChainEntryPointType != OptionChainEntryPointType.CHAIN || str == null) {
            str3 = "";
        } else {
            str3 = "";
            str4 = str;
        }
        if (optionChainEntryPointType == OptionChainEntryPointType.STRATEGY_BUILDER) {
            strategyName = Events2.getStrategyName(str == null ? str3 : str);
        } else {
            strategyName = StrategyName.STRATEGY_NAME_UNSPECIFIED;
        }
        StrategyName strategyName2 = strategyName;
        String str5 = str2 == null ? str3 : str2;
        String serverValue = metricType != null ? metricType.getServerValue() : null;
        if (serverValue == null) {
            serverValue = str3;
        }
        String serverValue2 = metricType2 != null ? metricType2.getServerValue() : null;
        if (serverValue2 == null) {
            serverValue2 = str3;
        }
        String serverValue3 = metricType3 != null ? metricType3.getServerValue() : null;
        if (serverValue3 == null) {
            serverValue3 = str3;
        }
        String serverValue4 = metricType4 != null ? metricType4.getServerValue() : null;
        return new Context(0, 0, 0, null, null, null, null, null, 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new OptionsChainCustomizationContext(str4, strategyName2, str5, serverValue, serverValue2, serverValue3, serverValue4 == null ? str3 : serverValue4, null, null, 384, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1025, -1, 16383, null);
    }
}
