package com.robinhood.android.equities.taxlots.alert;

import equity_trading_tax_lots.proto.p460v1.SelectionStrategySummary;
import kotlin.Metadata;

/* compiled from: TaxLotsMaximumSelectedLotsAlertFragmentCallbacks.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/equities/taxlots/alert/TaxLotsMaximumSelectedLotsAlertFragmentCallbacks;", "", "onSelectionStrategyProceed", "", "selectionStrategySummary", "Lequity_trading_tax_lots/proto/v1/SelectionStrategySummary;", "onSelectionStrategyDismiss", "lib-tax-lots_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public interface TaxLotsMaximumSelectedLotsAlertFragmentCallbacks {
    void onSelectionStrategyDismiss();

    void onSelectionStrategyProceed(SelectionStrategySummary selectionStrategySummary);
}
