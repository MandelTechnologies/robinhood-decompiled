package com.robinhood.android.investFlow.recurring;

import com.robinhood.android.investFlow.recurring.InvestFlowRecurringViewState;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import com.robinhood.utils.p409ui.view.recyclerview.GenericViewHolder;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestFlowRecurringAdapter.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\tJ\u001e\u0010\n\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\r\u001a\u00020\u0003H\u0014¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/investFlow/recurring/InvestFlowRecurringAdapter;", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/investFlow/recurring/InvestFlowRecurringRowView;", "Lcom/robinhood/android/investFlow/recurring/InvestFlowRecurringViewState$Row;", "<init>", "()V", "setRows", "", "rows", "", "onBindViewHolder", "holder", "Lcom/robinhood/utils/ui/view/recyclerview/GenericViewHolder;", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class InvestFlowRecurringAdapter extends GenericListAdapter<InvestFlowRecurringRowView, InvestFlowRecurringViewState.Row> {
    public static final int $stable = GenericListAdapter.$stable;

    @Override // com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(GenericViewHolder genericViewHolder, InvestFlowRecurringViewState.Row row) {
        onBindViewHolder2((GenericViewHolder<InvestFlowRecurringRowView>) genericViewHolder, row);
    }

    public InvestFlowRecurringAdapter() {
        super(InvestFlowRecurringRowView.INSTANCE, DiffCallbacks.INSTANCE.byEquality(new Function1() { // from class: com.robinhood.android.investFlow.recurring.InvestFlowRecurringAdapter$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowRecurringAdapter._init_$lambda$0((InvestFlowRecurringViewState.Row) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object _init_$lambda$0(InvestFlowRecurringViewState.Row byEquality) {
        Intrinsics.checkNotNullParameter(byEquality, "$this$byEquality");
        return byEquality.getSymbol();
    }

    public final void setRows(List<InvestFlowRecurringViewState.Row> rows) {
        Intrinsics.checkNotNullParameter(rows, "rows");
        submitList(rows);
    }

    /* renamed from: onBindViewHolder, reason: avoid collision after fix types in other method */
    protected void onBindViewHolder2(GenericViewHolder<InvestFlowRecurringRowView> holder, InvestFlowRecurringViewState.Row item) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        ((InvestFlowRecurringRowView) holder.getView()).bind(item);
    }
}
