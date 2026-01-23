package com.robinhood.librobinhood.data.store;

import com.robinhood.models.p320db.OptionChainSettingsTableMetric;
import com.robinhood.models.p320db.OptionSideBySideChainMetric;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* compiled from: OptionSideBySideChainStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0003"}, m3636d2 = {"fallbackDefaultTableMetrics", "", "Lcom/robinhood/models/db/OptionChainSettingsTableMetric;", "lib-store-options_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class OptionSideBySideChainStoreKt {
    private static final List<OptionChainSettingsTableMetric> fallbackDefaultTableMetrics = CollectionsKt.listOf((Object[]) new OptionChainSettingsTableMetric[]{new OptionChainSettingsTableMetric(OptionSideBySideChainMetric.LAST_TRADE, true), new OptionChainSettingsTableMetric(OptionSideBySideChainMetric.VOLUME, true), new OptionChainSettingsTableMetric(OptionSideBySideChainMetric.OPEN_INTEREST, true), new OptionChainSettingsTableMetric(OptionSideBySideChainMetric.DELTA, true), new OptionChainSettingsTableMetric(OptionSideBySideChainMetric.IMPLIED_VOLATILITY, true), new OptionChainSettingsTableMetric(OptionSideBySideChainMetric.CHANCE_OF_PROFIT_LONG, true), new OptionChainSettingsTableMetric(OptionSideBySideChainMetric.MARK, false), new OptionChainSettingsTableMetric(OptionSideBySideChainMetric.PREVIOUS_CLOSE, false), new OptionChainSettingsTableMetric(OptionSideBySideChainMetric.HIGH, false), new OptionChainSettingsTableMetric(OptionSideBySideChainMetric.LOW, false), new OptionChainSettingsTableMetric(OptionSideBySideChainMetric.NET_CHANGE, false), new OptionChainSettingsTableMetric(OptionSideBySideChainMetric.PERCENT_CHANGE, false), new OptionChainSettingsTableMetric(OptionSideBySideChainMetric.BID_SIZE, false), new OptionChainSettingsTableMetric(OptionSideBySideChainMetric.ASK_SIZE, false), new OptionChainSettingsTableMetric(OptionSideBySideChainMetric.GAMMA, false), new OptionChainSettingsTableMetric(OptionSideBySideChainMetric.THETA, false), new OptionChainSettingsTableMetric(OptionSideBySideChainMetric.VEGA, false), new OptionChainSettingsTableMetric(OptionSideBySideChainMetric.RHO, false), new OptionChainSettingsTableMetric(OptionSideBySideChainMetric.BREAKEVEN, false), new OptionChainSettingsTableMetric(OptionSideBySideChainMetric.TO_BREAKEVEN, false), new OptionChainSettingsTableMetric(OptionSideBySideChainMetric.CHANCE_OF_PROFIT_SHORT, false)});
}
