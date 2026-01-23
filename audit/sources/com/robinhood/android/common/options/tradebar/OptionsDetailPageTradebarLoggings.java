package com.robinhood.android.common.options.tradebar;

import com.robinhood.analytics.EventLogger;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.rosetta.converters.brokerage.BrokerageAccountTypes3;
import com.robinhood.rosetta.eventlogging.Asset;
import com.robinhood.rosetta.eventlogging.BrokerageAccountContext;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.List;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsDetailPageTradebarLoggings.kt */
@Metadata(m3635d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a\"\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0006\u001a2\u0010\n\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000f\u001a\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¨\u0006\u0012"}, m3636d2 = {"logOptionsDetailPageOptionChainMissing", "", "Lcom/robinhood/analytics/EventLogger;", "source", "Lcom/robinhood/android/common/options/tradebar/OptionsTradeBarSource;", "strategyCode", "", "logOptionsDetailPageTradebarErrorMessageAppear", "componentType", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "logOptionsDetailPageTradebarButtonTap", "buttonIdentifier", "timeSpent", "", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "getAnalyticsScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "feature-lib-options-trade-bar_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarLoggingsKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class OptionsDetailPageTradebarLoggings {
    public static final void logOptionsDetailPageOptionChainMissing(EventLogger eventLogger, OptionsTradeBarSource source, String strategyCode) {
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(strategyCode, "strategyCode");
        EventLogger.DefaultImpls.logAppear$default(eventLogger, null, getAnalyticsScreen(strategyCode, source), new Component(Component.ComponentType.BUTTON, "missing_option_chain", null, 4, null), null, null, 25, null);
    }

    public static final void logOptionsDetailPageTradebarErrorMessageAppear(EventLogger eventLogger, OptionsTradeBarSource source, Component.ComponentType componentType, String strategyCode) {
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(componentType, "componentType");
        Intrinsics.checkNotNullParameter(strategyCode, "strategyCode");
        EventLogger.DefaultImpls.logAppear$default(eventLogger, null, getAnalyticsScreen(strategyCode, source), new Component(componentType, strategyCode, null, 4, null), null, null, 25, null);
    }

    public static final void logOptionsDetailPageTradebarButtonTap(EventLogger eventLogger, OptionsTradeBarSource source, String buttonIdentifier, long j, String strategyCode, BrokerageAccountType brokerageAccountType) {
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(buttonIdentifier, "buttonIdentifier");
        Intrinsics.checkNotNullParameter(strategyCode, "strategyCode");
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Context.ProductTag productTag = null;
        String str5 = null;
        String str6 = null;
        Asset asset = null;
        List list = null;
        EventLogger.DefaultImpls.logTap$default(eventLogger, null, getAnalyticsScreen(strategyCode, source), new Component(Component.ComponentType.BUTTON, buttonIdentifier, null, 4, null), null, new Context(i, i2, i3, str, str2, str3, str4, productTag, (int) j, str5, str6, null, null, null, asset, list, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new BrokerageAccountContext(BrokerageAccountTypes3.toProtobuf(brokerageAccountType), null, null, null, false, false, null, null, null, null, 1022, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -257, -1, -1, -257, -1, -1, 16383, null), false, 41, null);
    }

    private static final Screen getAnalyticsScreen(String str, OptionsTradeBarSource optionsTradeBarSource) {
        return new Screen(optionsTradeBarSource.toAnalyticsScreenName(), null, str, null, 10, null);
    }
}
