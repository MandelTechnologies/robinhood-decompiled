package com.robinhood.android.transfers.ach.p265ui;

import android.R;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.transfers.ach.C30082R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: RhRecyclerViewFragment.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J\u001a\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\b2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\b\u0010+\u001a\u00020'H\u0016J\f\u00100\u001a\u0006\u0012\u0002\b\u000301H$J\b\u00102\u001a\u00020'H\u0002R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0012\u001a\u00020\u00138DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001e\u0010!\u001a\u00020 2\u0006\u0010\u0019\u001a\u00020 @BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\"\u0010#R\u000e\u0010$\u001a\u00020%X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010,\u001a\u00020 X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u0010#¨\u00063"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/RhRecyclerViewFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "layoutRes", "", "<init>", "(I)V", "()V", "progressContainer", "Landroid/view/View;", "getProgressContainer", "()Landroid/view/View;", "progressContainer$delegate", "Lkotlin/properties/ReadOnlyProperty;", "listContainer", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "getListContainer", "()Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "listContainer$delegate", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerView$delegate", "emptyTxt", "Landroid/widget/TextView;", "value", "", "emptyText", "getEmptyText", "()Ljava/lang/CharSequence;", "setEmptyText", "(Ljava/lang/CharSequence;)V", "", "loading", "setLoading", "(Z)V", "observer", "Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;", "onViewCreated", "", "view", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "hasFixedSize", "getHasFixedSize", "()Z", "setHasFixedSize", "createAdapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "updateViewStates", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public abstract class RhRecyclerViewFragment extends BaseFragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RhRecyclerViewFragment.class, "progressContainer", "getProgressContainer()Landroid/view/View;", 0)), Reflection.property1(new PropertyReference1Impl(RhRecyclerViewFragment.class, "listContainer", "getListContainer()Landroidx/coordinatorlayout/widget/CoordinatorLayout;", 0)), Reflection.property1(new PropertyReference1Impl(RhRecyclerViewFragment.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0))};
    public static final int $stable = 8;
    private CharSequence emptyText;
    private TextView emptyTxt;
    private boolean hasFixedSize;

    /* renamed from: listContainer$delegate, reason: from kotlin metadata */
    private final Interfaces2 listContainer;
    private boolean loading;
    private final RecyclerView.AdapterDataObserver observer;

    /* renamed from: progressContainer$delegate, reason: from kotlin metadata */
    private final Interfaces2 progressContainer;

    /* renamed from: recyclerView$delegate, reason: from kotlin metadata */
    private final Interfaces2 recyclerView;

    protected abstract RecyclerView.Adapter<?> createAdapter();

    public RhRecyclerViewFragment(int i) {
        super(i);
        this.progressContainer = bindView(C30082R.id.progress_container);
        this.listContainer = bindView(C30082R.id.list_container);
        this.recyclerView = bindView(R.id.list);
        this.observer = new RecyclerView.AdapterDataObserver() { // from class: com.robinhood.android.transfers.ach.ui.RhRecyclerViewFragment$observer$1
            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onChanged() {
                this.this$0.updateViewStates();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onItemRangeInserted(int positionStart, int itemCount) {
                this.this$0.updateViewStates();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onItemRangeRemoved(int positionStart, int itemCount) {
                this.this$0.updateViewStates();
            }
        };
        this.hasFixedSize = true;
    }

    public RhRecyclerViewFragment() {
        this(C30082R.layout.fragment_recycler_view);
    }

    private final View getProgressContainer() {
        return (View) this.progressContainer.getValue(this, $$delegatedProperties[0]);
    }

    private final CoordinatorLayout getListContainer() {
        return (CoordinatorLayout) this.listContainer.getValue(this, $$delegatedProperties[1]);
    }

    protected final RecyclerView getRecyclerView() {
        return (RecyclerView) this.recyclerView.getValue(this, $$delegatedProperties[2]);
    }

    public final CharSequence getEmptyText() {
        return this.emptyText;
    }

    public final void setEmptyText(CharSequence charSequence) {
        this.emptyText = charSequence;
        TextView textView = this.emptyTxt;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    private final void setLoading(boolean z) {
        this.loading = z;
        updateViewStates();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        TextView textView = (TextView) view.findViewById(R.id.empty);
        this.emptyTxt = textView;
        Intrinsics.checkNotNull(textView);
        textView.setText(this.emptyText);
        RecyclerView.Adapter<?> adapterCreateAdapter = createAdapter();
        adapterCreateAdapter.registerAdapterDataObserver(this.observer);
        RecyclerView recyclerView = getRecyclerView();
        recyclerView.setHasFixedSize(recyclerView.hasFixedSize());
        bindAdapter(recyclerView, adapterCreateAdapter);
        updateViewStates();
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        RecyclerView.Adapter adapter = getRecyclerView().getAdapter();
        if (adapter != null) {
            adapter.unregisterAdapterDataObserver(this.observer);
        }
        getRecyclerView().setAdapter(null);
        super.onDestroyView();
    }

    protected final boolean getHasFixedSize() {
        return this.hasFixedSize;
    }

    protected final void setHasFixedSize(boolean z) {
        this.hasFixedSize = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateViewStates() {
        RecyclerView.Adapter adapter = getRecyclerView().getAdapter();
        if ((adapter != null ? adapter.getSize() : 0) > 0) {
            getRecyclerView().setVisibility(0);
            TextView textView = this.emptyTxt;
            Intrinsics.checkNotNull(textView);
            textView.setVisibility(8);
            getProgressContainer().setVisibility(8);
            getListContainer().setVisibility(0);
            return;
        }
        if (this.loading) {
            getProgressContainer().setVisibility(0);
            getListContainer().setVisibility(8);
            return;
        }
        getRecyclerView().setVisibility(8);
        TextView textView2 = this.emptyTxt;
        Intrinsics.checkNotNull(textView2);
        textView2.setVisibility(0);
        getProgressContainer().setVisibility(8);
        getListContainer().setVisibility(0);
    }
}
