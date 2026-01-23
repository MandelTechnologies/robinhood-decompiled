package com.robinhood.android.common.history.p082ui;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.ListAdapter;
import com.robinhood.android.common.history.C11183R;
import com.robinhood.android.designsystem.chip.RdsChip;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericViewHolder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: HistoryFilterAdapter.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0001\u001dB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u001e\u0010\u0019\u001a\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u001c\u001a\u00020\u0018H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0002@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u000f@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/common/history/ui/HistoryFilterAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/robinhood/android/common/history/ui/HistoryFilter;", "Lcom/robinhood/utils/ui/view/recyclerview/GenericViewHolder;", "Lcom/robinhood/android/designsystem/chip/RdsChip;", "callbacks", "Lcom/robinhood/android/common/history/ui/HistoryFilterAdapter$Callbacks;", "<init>", "(Lcom/robinhood/android/common/history/ui/HistoryFilterAdapter$Callbacks;)V", "value", "selection", "getSelection", "()Lcom/robinhood/android/common/history/ui/HistoryFilter;", "setSelection", "(Lcom/robinhood/android/common/history/ui/HistoryFilter;)V", "", "isInEtfRegionGate", "()Z", "setInEtfRegionGate", "(Z)V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "", "holder", "position", "Callbacks", "lib-history-row_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class HistoryFilterAdapter extends ListAdapter<HistoryFilter, GenericViewHolder<? extends RdsChip>> {
    public static final int $stable = 8;
    private final Callbacks callbacks;
    private boolean isInEtfRegionGate;
    private HistoryFilter selection;

    /* compiled from: HistoryFilterAdapter.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/common/history/ui/HistoryFilterAdapter$Callbacks;", "", "onSelectionChanged", "", "selection", "Lcom/robinhood/android/common/history/ui/HistoryFilter;", "lib-history-row_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onSelectionChanged(HistoryFilter selection);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HistoryFilterAdapter(Callbacks callbacks) {
        super(DiffCallbacks.Equality.INSTANCE);
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        DiffCallbacks diffCallbacks = DiffCallbacks.INSTANCE;
        this.callbacks = callbacks;
    }

    public final HistoryFilter getSelection() {
        return this.selection;
    }

    public final void setSelection(HistoryFilter historyFilter) {
        this.selection = historyFilter;
        notifyDataSetChanged();
    }

    /* renamed from: isInEtfRegionGate, reason: from getter */
    public final boolean getIsInEtfRegionGate() {
        return this.isInEtfRegionGate;
    }

    public final void setInEtfRegionGate(boolean z) {
        this.isInEtfRegionGate = z;
        int iIndexOf = getCurrentList().indexOf(HistoryFilter.EQUITIES);
        if (iIndexOf != -1) {
            notifyItemChanged(iIndexOf);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public GenericViewHolder<RdsChip> onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate$default = ViewGroups.inflate$default(parent, C11183R.layout.include_history_filter_chip, false, 2, null);
        Intrinsics.checkNotNull(viewInflate$default, "null cannot be cast to non-null type com.robinhood.android.designsystem.chip.RdsChip");
        return new GenericViewHolder<>((RdsChip) viewInflate$default);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(GenericViewHolder<RdsChip> holder, int position) {
        int labelResId;
        Intrinsics.checkNotNullParameter(holder, "holder");
        final HistoryFilter item = getItem(position);
        RdsChip rdsChip = (RdsChip) holder.getView();
        if (item == HistoryFilter.EQUITIES && !this.isInEtfRegionGate) {
            labelResId = C11183R.string.history_menu_filter_stocks;
        } else {
            labelResId = item.getLabelResId();
        }
        rdsChip.setText(ViewsKt.getString(rdsChip, labelResId));
        rdsChip.setSelected(item == this.selection);
        OnClickListeners.onClick(rdsChip, new Function0() { // from class: com.robinhood.android.common.history.ui.HistoryFilterAdapter$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HistoryFilterAdapter.onBindViewHolder$lambda$1$lambda$0(this.f$0, item);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$1$lambda$0(HistoryFilterAdapter historyFilterAdapter, HistoryFilter historyFilter) {
        historyFilterAdapter.setSelection(historyFilter);
        Callbacks callbacks = historyFilterAdapter.callbacks;
        Intrinsics.checkNotNull(historyFilter);
        callbacks.onSelectionChanged(historyFilter);
        return Unit.INSTANCE;
    }
}
