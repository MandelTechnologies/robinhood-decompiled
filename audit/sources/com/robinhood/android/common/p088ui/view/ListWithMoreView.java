package com.robinhood.android.common.p088ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.util.SimpleViewHolder;
import com.robinhood.android.common.util.UiCallbacks;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ListWithMoreView.kt */
@Metadata(m3635d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u00032\u00020\u00042\u00020\u0005:\u0001LB\u0019\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\fJ\u0015\u00103\u001a\u00020\u000e2\u0006\u00104\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00105J\u001d\u00106\u001a\u00028\u00012\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020\u000eH&¢\u0006\u0002\u0010:J\u001f\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00028\u00012\b\u00104\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0002\u0010>J\b\u0010?\u001a\u00020<H\u0016J\b\u0010@\u001a\u00020<H&J\u001e\u0010A\u001a\u00020<2\f\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00000C2\b\b\u0002\u0010D\u001a\u00020\u000eJ\b\u0010E\u001a\u00020<H\u0016J\u000e\u0010F\u001a\u00020<2\u0006\u0010G\u001a\u00020HJ\u0015\u0010I\u001a\u00020\u000e2\b\u00104\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u00105J\u0010\u0010J\u001a\u00020<2\u0006\u0010K\u001a\u00020\u000eH\u0002R\u001a\u0010\r\u001a\u00020\u000eX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R(\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR&\u0010 \u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000e8\u0004@DX\u0085\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0010\"\u0004\b\"\u0010\u0012R\u0014\u0010#\u001a\u00020$X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u000e\u0010'\u001a\u00020(X\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010)\u001a\u00120*R\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b+\u0010,R\u001a\u0010/\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u000000X¦\u0004¢\u0006\u0006\u001a\u0004\b1\u00102¨\u0006M"}, m3636d2 = {"Lcom/robinhood/android/common/ui/view/ListWithMoreView;", "DataT", "ViewT", "Landroid/view/View;", "Landroid/widget/LinearLayout;", "Lcom/robinhood/android/common/util/UiCallbacks$Clearable;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "maxNumItemsShown", "", "getMaxNumItemsShown", "()I", "setMaxNumItemsShown", "(I)V", "alwaysShowMore", "", "getAlwaysShowMore", "()Z", "setAlwaysShowMore", "(Z)V", "value", "Landroidx/recyclerview/widget/RecyclerView$ItemAnimator;", "itemAnimator", "getItemAnimator", "()Landroidx/recyclerview/widget/RecyclerView$ItemAnimator;", "setItemAnimator", "(Landroidx/recyclerview/widget/RecyclerView$ItemAnimator;)V", "moreTextRes", "getMoreTextRes", "setMoreTextRes", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "moreBtn", "Lcom/robinhood/android/designsystem/button/RdsTextButton;", "adapter", "Lcom/robinhood/android/common/ui/view/ListWithMoreView$Adapter;", "getAdapter", "()Lcom/robinhood/android/common/ui/view/ListWithMoreView$Adapter;", "adapter$delegate", "Lkotlin/Lazy;", "diffCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "getDiffCallback", "()Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "getViewType", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "(Ljava/lang/Object;)I", "createView", "parent", "Landroid/view/ViewGroup;", "viewType", "(Landroid/view/ViewGroup;I)Landroid/view/View;", "bindView", "", "view", "(Landroid/view/View;Ljava/lang/Object;)V", "onMoreAppeared", "onMoreClicked", "setData", "incomingList", "", "dataSize", "clear", "setRecycledViewPool", "pool", "Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;", "getItemPosition", "refreshMoreButton", "size", "Adapter", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public abstract class ListWithMoreView<DataT, ViewT extends View> extends LinearLayout implements UiCallbacks.Clearable {
    public static final int $stable = 8;

    /* renamed from: adapter$delegate, reason: from kotlin metadata */
    private final Lazy adapter;
    private boolean alwaysShowMore;
    private int maxNumItemsShown;
    private final RdsTextButton moreBtn;
    private int moreTextRes;
    private final RecyclerView recyclerView;

    public abstract void bindView(ViewT view, DataT item);

    public abstract ViewT createView(ViewGroup parent, int viewType);

    public abstract DiffUtil.ItemCallback<? super DataT> getDiffCallback();

    public int getViewType(DataT item) {
        return 0;
    }

    public void onMoreAppeared() {
    }

    public abstract void onMoreClicked();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListWithMoreView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.maxNumItemsShown = Integer.MAX_VALUE;
        this.moreTextRes = C11048R.string.general_label_more;
        setOrientation(1);
        ViewGroups.inflate(this, C11048R.layout.merge_list_with_more_view, true);
        View viewFindViewById = findViewById(C11048R.id.content_recycler_view);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.recyclerView = recyclerView;
        View viewFindViewById2 = findViewById(C11048R.id.more_btn);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        RdsTextButton rdsTextButton = (RdsTextButton) viewFindViewById2;
        this.moreBtn = rdsTextButton;
        this.adapter = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.common.ui.view.ListWithMoreView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ListWithMoreView.adapter_delegate$lambda$0(this.f$0);
            }
        });
        recyclerView.setLayoutManager(new LinearLayoutManager(context) { // from class: com.robinhood.android.common.ui.view.ListWithMoreView.1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean supportsPredictiveItemAnimations() {
                return false;
            }
        });
        recyclerView.setNestedScrollingEnabled(false);
        OnClickListeners.onClick(rdsTextButton, new Function0() { // from class: com.robinhood.android.common.ui.view.ListWithMoreView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ListWithMoreView._init_$lambda$1(this.f$0);
            }
        });
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ListWithMoreView(Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    protected final int getMaxNumItemsShown() {
        return this.maxNumItemsShown;
    }

    protected final void setMaxNumItemsShown(int i) {
        this.maxNumItemsShown = i;
    }

    public final boolean getAlwaysShowMore() {
        return this.alwaysShowMore;
    }

    public final void setAlwaysShowMore(boolean z) {
        this.alwaysShowMore = z;
    }

    public final RecyclerView.ItemAnimator getItemAnimator() {
        return this.recyclerView.getItemAnimator();
    }

    public final void setItemAnimator(RecyclerView.ItemAnimator itemAnimator) {
        this.recyclerView.setItemAnimator(itemAnimator);
    }

    protected final int getMoreTextRes() {
        return this.moreTextRes;
    }

    protected final void setMoreTextRes(int i) {
        this.moreTextRes = i;
        this.moreBtn.setText(i);
    }

    protected final RecyclerView getRecyclerView() {
        return this.recyclerView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Adapter adapter_delegate$lambda$0(ListWithMoreView listWithMoreView) {
        return new Adapter();
    }

    private final ListWithMoreView<DataT, ViewT>.Adapter getAdapter() {
        return (Adapter) this.adapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$1(ListWithMoreView listWithMoreView) {
        listWithMoreView.onMoreClicked();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void setData$default(ListWithMoreView listWithMoreView, List list, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setData");
        }
        if ((i2 & 2) != 0) {
            i = list.size();
        }
        listWithMoreView.setData(list, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setData(List<? extends DataT> incomingList, int dataSize) {
        Intrinsics.checkNotNullParameter(incomingList, "incomingList");
        if (this.recyclerView.getAdapter() == null) {
            this.recyclerView.setAdapter(getAdapter());
        }
        getAdapter().submitList(incomingList);
        refreshMoreButton(dataSize);
    }

    @Override // com.robinhood.android.common.util.UiCallbacks.Clearable
    public void clear() {
        getAdapter().submitList(null);
        this.moreBtn.setVisibility(8);
    }

    public final void setRecycledViewPool(RecyclerView.RecycledViewPool pool) {
        Intrinsics.checkNotNullParameter(pool, "pool");
        this.recyclerView.setRecycledViewPool(pool);
    }

    public final int getItemPosition(DataT item) {
        return getAdapter().getCurrentList().indexOf(item);
    }

    private final void refreshMoreButton(int size) {
        if (size > this.maxNumItemsShown || this.alwaysShowMore) {
            if (this.moreBtn.getVisibility() != 0) {
                onMoreAppeared();
            }
            this.moreBtn.setVisibility(0);
            return;
        }
        this.moreBtn.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ListWithMoreView.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\tH\u0016J\b\u0010\u000e\u001a\u00020\tH\u0016J\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH\u0016¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/common/ui/view/ListWithMoreView$Adapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/robinhood/android/common/util/SimpleViewHolder;", "<init>", "(Lcom/robinhood/android/common/ui/view/ListWithMoreView;)V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "", "holder", "position", "getItemCount", "getItemViewType", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    final class Adapter extends ListAdapter<DataT, SimpleViewHolder> {
        /* JADX WARN: Illegal instructions before constructor call */
        public Adapter() {
            DiffUtil.ItemCallback<? super DataT> diffCallback = ListWithMoreView.this.getDiffCallback();
            Intrinsics.checkNotNull(diffCallback, "null cannot be cast to non-null type androidx.recyclerview.widget.DiffUtil.ItemCallback<DataT of com.robinhood.android.common.ui.view.ListWithMoreView>");
            super(diffCallback);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public SimpleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return new SimpleViewHolder(ListWithMoreView.this.createView(parent, viewType));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(SimpleViewHolder holder, int position) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            ListWithMoreView<DataT, ViewT> listWithMoreView = ListWithMoreView.this;
            View view = holder.itemView;
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type ViewT of com.robinhood.android.common.ui.view.ListWithMoreView");
            listWithMoreView.bindView(view, getItem(position));
        }

        @Override // androidx.recyclerview.widget.ListAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: getItemCount */
        public int getSize() {
            return Math.min(ListWithMoreView.this.getMaxNumItemsShown(), super.getSize());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int position) {
            return ListWithMoreView.this.getViewType(getItem(position));
        }
    }
}
