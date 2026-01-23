package com.robinhood.android.trade.equity.p261ui.configuration.selection;

import com.robinhood.android.trade.configuration.OrderConfigurationRow;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* compiled from: OrderConfigurationSelectionDataState.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0000\u001a,\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004H\u0002\u001a&\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¨\u0006\u0005"}, m3636d2 = {"addIfNotEmpty", "", "Lcom/robinhood/android/trade/configuration/OrderConfigurationRow;", "other", "", "feature-trade-equity_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.trade.equity.ui.configuration.selection.OrderConfigurationSelectionDataStateKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class OrderConfigurationSelectionDataState4 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final List<OrderConfigurationRow> addIfNotEmpty(List<? extends OrderConfigurationRow> list, Iterable<? extends OrderConfigurationRow> iterable) {
        return list.isEmpty() ? CollectionsKt.emptyList() : CollectionsKt.plus((Collection) list, (Iterable) iterable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<OrderConfigurationRow> addIfNotEmpty(List<? extends OrderConfigurationRow> list, OrderConfigurationRow orderConfigurationRow) {
        return list.isEmpty() ? CollectionsKt.emptyList() : CollectionsKt.plus((Collection<? extends OrderConfigurationRow>) list, orderConfigurationRow);
    }
}
