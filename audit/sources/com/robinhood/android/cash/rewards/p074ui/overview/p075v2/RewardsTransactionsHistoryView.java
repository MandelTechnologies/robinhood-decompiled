package com.robinhood.android.cash.rewards.p074ui.overview.p075v2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.recyclerview.widget.DiffUtil;
import com.robinhood.android.cash.rewards.C10176R;
import com.robinhood.android.common.history.p082ui.HistoryEventDiffCallbacks;
import com.robinhood.android.common.history.p082ui.HistoryRowView;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.shared.history.contracts.account.AccountsHistoryContract;
import com.robinhood.shared.history.contracts.account.AccountsHistoryTransactionTypeFilter;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.StatefulHistoryEvent;
import com.robinhood.utils.p409ui.view.Inflater;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RewardsTransactionsHistoryView.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 #2\u0018\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0001#B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u0012\u001a\u00020\u00132\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0015J\u0018\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J&\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u00052\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\u0004\u0018\u0001`\u0004H\u0016J\b\u0010\u001e\u001a\u00020\u0013H\u0016R\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u001f\u001a\u000e\u0012\n\b\u0000\u0012\u0006\u0012\u0002\b\u00030\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/cash/rewards/ui/overview/v2/RewardsTransactionsHistoryView;", "Lcom/robinhood/android/common/ui/view/ListWithMoreView;", "Lcom/robinhood/shared/models/history/shared/StatefulHistoryEvent;", "Lcom/robinhood/shared/models/history/shared/HistoryEvent;", "Lcom/robinhood/shared/models/history/shared/GenericStatefulHistoryEvent;", "Lcom/robinhood/android/common/history/ui/HistoryRowView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "getNavigator", "()Lcom/robinhood/android/navigation/Navigator;", "setNavigator", "(Lcom/robinhood/android/navigation/Navigator;)V", "setData", "", "items", "", "createView", "parent", "Landroid/view/ViewGroup;", "viewType", "", "bindView", "view", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "onMoreClicked", "diffCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "getDiffCallback", "()Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Companion", "feature-cash-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class RewardsTransactionsHistoryView extends Hammer_RewardsTransactionsHistoryView<StatefulHistoryEvent<? extends HistoryEvent>, HistoryRowView> {
    private static final int MAX_ITEMS_SHOWN = 5;
    public Navigator navigator;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardsTransactionsHistoryView(Context context, AttributeSet attrs) {
        super(context, attrs, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        setMaxNumItemsShown(5);
    }

    public final Navigator getNavigator() {
        Navigator navigator = this.navigator;
        if (navigator != null) {
            return navigator;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
    }

    public final void setNavigator(Navigator navigator) {
        Intrinsics.checkNotNullParameter(navigator, "<set-?>");
        this.navigator = navigator;
    }

    public final void setData(List<? extends HistoryEvent> items) {
        Collection collectionEmptyList;
        if (items != null) {
            List<? extends HistoryEvent> list = items;
            collectionEmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                collectionEmptyList.add(StatefulHistoryEvent.INSTANCE.m2830of((HistoryEvent) it.next()));
            }
        } else {
            collectionEmptyList = CollectionsKt.emptyList();
        }
        setData(collectionEmptyList, items != null ? items.size() : 0);
    }

    @Override // com.robinhood.android.common.p088ui.view.ListWithMoreView
    public HistoryRowView createView(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return HistoryRowView.Companion.HistoryRowInflater.INSTANCE.inflate(parent);
    }

    @Override // com.robinhood.android.common.p088ui.view.ListWithMoreView
    public void bindView(HistoryRowView view, StatefulHistoryEvent<? extends HistoryEvent> item) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.bind(item);
    }

    @Override // com.robinhood.android.common.p088ui.view.ListWithMoreView
    public void onMoreClicked() {
        Navigator navigator = getNavigator();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Navigator.DefaultImpls.showFragment$default(navigator, context, new AccountsHistoryContract.Key(null, AccountsHistoryTransactionTypeFilter.DEBIT_CARD, null, null, true, null, 45, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
    }

    @Override // com.robinhood.android.common.p088ui.view.ListWithMoreView
    public DiffUtil.ItemCallback<? super StatefulHistoryEvent<?>> getDiffCallback() {
        return HistoryEventDiffCallbacks.getDiffCallback(StatefulHistoryEvent.INSTANCE);
    }

    /* compiled from: RewardsTransactionsHistoryView.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0096\u0001R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/cash/rewards/ui/overview/v2/RewardsTransactionsHistoryView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/cash/rewards/ui/overview/v2/RewardsTransactionsHistoryView;", "<init>", "()V", "MAX_ITEMS_SHOWN", "", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-cash-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<RewardsTransactionsHistoryView> {
        private final /* synthetic */ Inflater<RewardsTransactionsHistoryView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public RewardsTransactionsHistoryView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (RewardsTransactionsHistoryView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C10176R.layout.include_rewards_transactions_history_view);
        }
    }
}
