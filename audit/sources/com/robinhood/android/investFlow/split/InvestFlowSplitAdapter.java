package com.robinhood.android.investFlow.split;

import android.view.ViewGroup;
import com.robinhood.android.investFlow.split.InvestFlowSplitRowView;
import com.robinhood.android.investFlow.split.InvestFlowSplitViewState;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.models.util.Money;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import com.robinhood.utils.p409ui.view.recyclerview.GenericViewHolder;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestFlowSplitAdapter.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001&B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0014\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0018J\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u001e\u0010\u001f\u001a\u00020\u00162\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u001a2\u0006\u0010!\u001a\u00020\u0003H\u0014J\u001a\u0010\"\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\u000f2\b\u0010$\u001a\u0004\u0018\u00010\u0010H\u0016J\u0010\u0010%\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\u000fH\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR&\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/investFlow/split/InvestFlowSplitAdapter;", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/investFlow/split/InvestFlowSplitRowView;", "Lcom/robinhood/android/investFlow/split/InvestFlowSplitViewState$Row;", "Lcom/robinhood/android/investFlow/split/InvestFlowSplitRowView$Callbacks;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/investFlow/split/InvestFlowSplitAdapter$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/investFlow/split/InvestFlowSplitAdapter$Callbacks;", "setCallbacks", "(Lcom/robinhood/android/investFlow/split/InvestFlowSplitAdapter$Callbacks;)V", "customAllocation", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/UUID;", "Lcom/robinhood/models/util/Money;", "getCustomAllocation", "()Ljava/util/concurrent/ConcurrentHashMap;", "setCustomAllocation", "(Ljava/util/concurrent/ConcurrentHashMap;)V", "setDefaultRows", "", "defaultRows", "", "onCreateViewHolder", "Lcom/robinhood/utils/ui/view/recyclerview/GenericViewHolder;", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "holder", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "onAmountChanged", "assetId", "amount", "onUntradableInstrumentClicked", "Callbacks", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class InvestFlowSplitAdapter extends GenericListAdapter<InvestFlowSplitRowView, InvestFlowSplitViewState.Row> implements InvestFlowSplitRowView.Callbacks {
    public static final int $stable = 8;
    private Callbacks callbacks;
    private ConcurrentHashMap<UUID, Money> customAllocation;

    /* compiled from: InvestFlowSplitAdapter.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/investFlow/split/InvestFlowSplitAdapter$Callbacks;", "", "enableReset", "", "onAllocationChanged", "onUntradableInstrumentClicked", "assetId", "Ljava/util/UUID;", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void enableReset();

        void onAllocationChanged();

        void onUntradableInstrumentClicked(UUID assetId);
    }

    @Override // com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(GenericViewHolder genericViewHolder, InvestFlowSplitViewState.Row row) {
        onBindViewHolder2((GenericViewHolder<InvestFlowSplitRowView>) genericViewHolder, row);
    }

    public InvestFlowSplitAdapter() {
        super(InvestFlowSplitRowView.INSTANCE, DiffCallbacks.INSTANCE.byEquality(new Function1() { // from class: com.robinhood.android.investFlow.split.InvestFlowSplitAdapter$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowSplitAdapter._init_$lambda$0((InvestFlowSplitViewState.Row) obj);
            }
        }));
        this.customAllocation = new ConcurrentHashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object _init_$lambda$0(InvestFlowSplitViewState.Row byEquality) {
        Intrinsics.checkNotNullParameter(byEquality, "$this$byEquality");
        return byEquality.getAssetId();
    }

    public final Callbacks getCallbacks() {
        return this.callbacks;
    }

    public final void setCallbacks(Callbacks callbacks) {
        this.callbacks = callbacks;
    }

    public final ConcurrentHashMap<UUID, Money> getCustomAllocation() {
        return this.customAllocation;
    }

    public final void setCustomAllocation(ConcurrentHashMap<UUID, Money> concurrentHashMap) {
        Intrinsics.checkNotNullParameter(concurrentHashMap, "<set-?>");
        this.customAllocation = concurrentHashMap;
    }

    public final void setDefaultRows(List<InvestFlowSplitViewState.Row> defaultRows) {
        Intrinsics.checkNotNullParameter(defaultRows, "defaultRows");
        submitList(defaultRows);
    }

    @Override // com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public GenericViewHolder<InvestFlowSplitRowView> onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        InvestFlowSplitRowView investFlowSplitRowViewInflate = InvestFlowSplitRowView.INSTANCE.inflate(parent);
        investFlowSplitRowViewInflate.setCallbacks(this);
        return new GenericViewHolder<>(investFlowSplitRowViewInflate);
    }

    /* renamed from: onBindViewHolder, reason: avoid collision after fix types in other method */
    protected void onBindViewHolder2(GenericViewHolder<InvestFlowSplitRowView> holder, InvestFlowSplitViewState.Row item) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        ((InvestFlowSplitRowView) holder.getView()).bind(item, this.customAllocation.get(item.getAssetId()));
    }

    @Override // com.robinhood.android.investFlow.split.InvestFlowSplitRowView.Callbacks
    public void onAmountChanged(UUID assetId, Money amount) {
        Intrinsics.checkNotNullParameter(assetId, "assetId");
        if (amount != null) {
            this.customAllocation.put(assetId, amount);
            Callbacks callbacks = this.callbacks;
            if (callbacks != null) {
                callbacks.enableReset();
            }
        } else {
            this.customAllocation.remove(assetId);
        }
        Callbacks callbacks2 = this.callbacks;
        if (callbacks2 != null) {
            callbacks2.onAllocationChanged();
        }
    }

    @Override // com.robinhood.android.investFlow.split.InvestFlowSplitRowView.Callbacks
    public void onUntradableInstrumentClicked(UUID assetId) {
        Intrinsics.checkNotNullParameter(assetId, "assetId");
        Callbacks callbacks = this.callbacks;
        if (callbacks != null) {
            callbacks.onUntradableInstrumentClicked(assetId);
        }
    }
}
