package com.robinhood.android.common.p088ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.robinhood.android.common.lists.C11222R;
import com.robinhood.android.common.p088ui.CuratedListChipRowAdapter;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CuratedListChipRecyclerView.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \"2\u00020\u00012\u00020\u0002:\u0002!\"B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u000e\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015J\u0014\u0010\u0016\u001a\u00020\u00102\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u0018J\u000e\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0015J\u0006\u0010\u001b\u001a\u00020\u0015J\u000e\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0012J\u000e\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020 R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/common/ui/CuratedListChipRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "Lcom/robinhood/android/common/ui/CuratedListChipRowAdapter$Callbacks;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "callbacks", "Lcom/robinhood/android/common/ui/CuratedListChipRecyclerView$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/common/ui/CuratedListChipRecyclerView$Callbacks;", "setCallbacks", "(Lcom/robinhood/android/common/ui/CuratedListChipRecyclerView$Callbacks;)V", "onChipClick", "", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/common/ui/CuratedListChipItem;", "setRowCount", "count", "", "bind", "curatedLists", "", "getItem", "position", "getItemCount", "getPosition", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "registerAdapterDataObserver", "adapterDataObserver", "Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;", "Callbacks", "Companion", "feature-lib-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class CuratedListChipRecyclerView extends RecyclerView implements CuratedListChipRowAdapter.Callbacks {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int DEFAULT_NUM_ROWS = 1;
    private Callbacks callbacks;

    /* compiled from: CuratedListChipRecyclerView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/common/ui/CuratedListChipRecyclerView$Callbacks;", "", "onChipClick", "", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/common/ui/CuratedListChipItem;", "feature-lib-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {

        /* compiled from: CuratedListChipRecyclerView.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class DefaultImpls {
            public static void onChipClick(Callbacks callbacks, CuratedListChipItem data) {
                Intrinsics.checkNotNullParameter(data, "data");
            }
        }

        void onChipClick(CuratedListChipItem data);
    }

    public /* synthetic */ CuratedListChipRecyclerView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CuratedListChipRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        int[] CuratedListChipRecyclerView = C11222R.styleable.CuratedListChipRecyclerView;
        Intrinsics.checkNotNullExpressionValue(CuratedListChipRecyclerView, "CuratedListChipRecyclerView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, CuratedListChipRecyclerView, 0, 0);
        final int i = typedArrayObtainStyledAttributes.getInt(C11222R.styleable.CuratedListChipRecyclerView_numRows, 1);
        setLayoutManager(new StaggeredGridLayoutManager(i) { // from class: com.robinhood.android.common.ui.CuratedListChipRecyclerView$1$1
            @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean supportsPredictiveItemAnimations() {
                return false;
            }
        });
        addItemDecoration(new CuratedListChipRowAdapter.ChipItemDecoration(context));
        typedArrayObtainStyledAttributes.recycle();
        CuratedListChipRowAdapter curatedListChipRowAdapter = new CuratedListChipRowAdapter();
        curatedListChipRowAdapter.setCallbacks(this);
        setAdapter(curatedListChipRowAdapter);
    }

    public final Callbacks getCallbacks() {
        return this.callbacks;
    }

    public final void setCallbacks(Callbacks callbacks) {
        this.callbacks = callbacks;
    }

    @Override // com.robinhood.android.common.ui.CuratedListChipRowAdapter.Callbacks
    public void onChipClick(CuratedListChipItem data) {
        Intrinsics.checkNotNullParameter(data, "data");
        Callbacks callbacks = this.callbacks;
        if (callbacks != null) {
            callbacks.onChipClick(data);
        }
    }

    public final void setRowCount(int count) {
        if (count <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.StaggeredGridLayoutManager");
        ((StaggeredGridLayoutManager) layoutManager).setSpanCount(count);
    }

    public final void bind(List<CuratedListChipItem> curatedLists) {
        Intrinsics.checkNotNullParameter(curatedLists, "curatedLists");
        RecyclerView.Adapter adapter = getAdapter();
        Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.robinhood.android.common.ui.CuratedListChipRowAdapter");
        ((CuratedListChipRowAdapter) adapter).bind(curatedLists);
    }

    public final CuratedListChipItem getItem(int position) {
        RecyclerView.Adapter adapter = getAdapter();
        Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.robinhood.android.common.ui.CuratedListChipRowAdapter");
        return ((CuratedListChipRowAdapter) adapter).getItem(position);
    }

    public final int getItemCount() {
        RecyclerView.Adapter adapter = getAdapter();
        Intrinsics.checkNotNull(adapter);
        return adapter.getItemCount();
    }

    public final int getPosition(CuratedListChipItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        RecyclerView.Adapter adapter = getAdapter();
        Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.robinhood.android.common.ui.CuratedListChipRowAdapter");
        return ((CuratedListChipRowAdapter) adapter).getPosition(item);
    }

    public final void registerAdapterDataObserver(RecyclerView.AdapterDataObserver adapterDataObserver) {
        Intrinsics.checkNotNullParameter(adapterDataObserver, "adapterDataObserver");
        RecyclerView.Adapter adapter = getAdapter();
        Intrinsics.checkNotNull(adapter);
        adapter.registerAdapterDataObserver(adapterDataObserver);
    }

    /* compiled from: CuratedListChipRecyclerView.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0096\u0001R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/common/ui/CuratedListChipRecyclerView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/common/ui/CuratedListChipRecyclerView;", "<init>", "()V", "DEFAULT_NUM_ROWS", "", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-lib-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<CuratedListChipRecyclerView> {
        private final /* synthetic */ Inflater<CuratedListChipRecyclerView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public CuratedListChipRecyclerView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (CuratedListChipRecyclerView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C11222R.layout.include_curated_list_chip_recycler_view);
        }
    }
}
