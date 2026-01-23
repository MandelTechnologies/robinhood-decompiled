package com.robinhood.utils.p409ui.view.recyclerview;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AsyncDifferConfig;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.test.idler.ListAdapterIdleTracker;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.Inflater;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GenericListAdapter.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0017\u0018\u0000 #*\b\b\u0000\u0010\u0001*\u00020\u0002*\u0004\b\u0001\u0010\u00032\u0014\u0012\u0004\u0012\u0002H\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00050\u0004:\u0001#B'\b\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00010\t¢\u0006\u0004\b\n\u0010\u000bB'\b\u0014\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u000e\u0010\f\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00010\r¢\u0006\u0004\b\n\u0010\u000eJ\u0018\u0010\u0013\u001a\u00020\u00142\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0016H\u0016J\u001e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u001e\u0010\u001c\u001a\u00020\u00142\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u001e\u001a\u00020\u001bH\u0016J#\u0010\u001c\u001a\u00020\u00142\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u001f\u001a\u00028\u0001H\u0014¢\u0006\u0002\u0010 J\u0015\u0010!\u001a\u00028\u00012\u0006\u0010\u001e\u001a\u00020\u001bH\u0016¢\u0006\u0002\u0010\"R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, m3636d2 = {"Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "ViewT", "Landroid/view/View;", "ItemT", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/robinhood/utils/ui/view/recyclerview/GenericViewHolder;", "inflater", "Lcom/robinhood/utils/ui/view/Inflater;", "config", "Landroidx/recyclerview/widget/AsyncDifferConfig;", "<init>", "(Lcom/robinhood/utils/ui/view/Inflater;Landroidx/recyclerview/widget/AsyncDifferConfig;)V", "diffCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "(Lcom/robinhood/utils/ui/view/Inflater;Landroidx/recyclerview/widget/DiffUtil$ItemCallback;)V", "getInflater", "()Lcom/robinhood/utils/ui/view/Inflater;", "idleTracker", "Lcom/robinhood/test/idler/ListAdapterIdleTracker;", "submitList", "", "list", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "holder", "position", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "(Lcom/robinhood/utils/ui/view/recyclerview/GenericViewHolder;Ljava/lang/Object;)V", "getItem", "(I)Ljava/lang/Object;", "Companion", "lib-utils-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public class GenericListAdapter<ViewT extends View, ItemT> extends ListAdapter<ItemT, GenericViewHolder<? extends ViewT>> {
    private final ListAdapterIdleTracker idleTracker;
    private final Inflater<ViewT> inflater;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    protected void onBindViewHolder(GenericViewHolder<? extends ViewT> holder, ItemT item) {
        Intrinsics.checkNotNullParameter(holder, "holder");
    }

    public final Inflater<ViewT> getInflater() {
        return this.inflater;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    protected GenericListAdapter(Inflater<? extends ViewT> inflater, AsyncDifferConfig<? super ItemT> config) {
        super(config);
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Intrinsics.checkNotNullParameter(config, "config");
        this.inflater = inflater;
        this.idleTracker = new ListAdapterIdleTracker();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    protected GenericListAdapter(Inflater<? extends ViewT> inflater, DiffUtil.ItemCallback<? super ItemT> diffCallback) {
        this(inflater, DiffCallbacks2.toAsyncDifferConfig(diffCallback));
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.ListAdapter
    public void submitList(List<? extends ItemT> list) {
        this.idleTracker.onSubmit();
        super.submitList(list, new Runnable(this) { // from class: com.robinhood.utils.ui.view.recyclerview.GenericListAdapter.submitList.1
            final /* synthetic */ GenericListAdapter<ViewT, ItemT> this$0;

            {
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ((GenericListAdapter) this.this$0).idleTracker.onCommit();
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public GenericViewHolder<ViewT> onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new GenericViewHolder<>(this.inflater.inflate(parent));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(GenericViewHolder<? extends ViewT> holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        onBindViewHolder(holder, (GenericViewHolder<? extends ViewT>) getItem(position));
    }

    @Override // androidx.recyclerview.widget.ListAdapter
    public ItemT getItem(int position) {
        return (ItemT) super.getItem(position);
    }

    /* compiled from: GenericListAdapter.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J_\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u00070\u0005\"\b\b\u0002\u0010\u0006*\u00020\b\"\b\b\u0003\u0010\u0007*\u00020\u00012\b\b\u0001\u0010\t\u001a\u00020\n2\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0000\u0012\u0002H\u00070\f2\u001d\u0010\r\u001a\u0019\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0002\b\u0010Jc\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u00070\u0005\"\b\b\u0002\u0010\u0006*\u00020\b\"\b\b\u0003\u0010\u0007*\u00020\u00012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00122\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0000\u0012\u0002H\u00070\f2\u001d\u0010\r\u001a\u0019\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0002\b\u0010JN\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u00070\u0005\"\u0012\b\u0002\u0010\u0006*\u00020\b*\b\u0012\u0004\u0012\u0002H\u00070\u0013\"\b\b\u0003\u0010\u0007*\u00020\u00012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00122\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0000\u0012\u0002H\u00070\f¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter$Companion;", "", "<init>", "()V", "of", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "ViewT", "ItemT", "Landroid/view/View;", "layoutResId", "", "diffCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "bind", "Lkotlin/Function2;", "", "Lkotlin/ExtensionFunctionType;", "inflater", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/utils/ui/view/Bindable;", "lib-utils-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* renamed from: of */
        public final <ViewT extends View, ItemT> GenericListAdapter<ViewT, ItemT> m2985of(int layoutResId, DiffUtil.ItemCallback<? super ItemT> diffCallback, Function2<? super ViewT, ? super ItemT, Unit> bind) {
            Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
            Intrinsics.checkNotNullParameter(bind, "bind");
            return m2987of(Inflater.INSTANCE.include(layoutResId), diffCallback, bind);
        }

        /* renamed from: of */
        public final <ViewT extends View, ItemT> GenericListAdapter<ViewT, ItemT> m2987of(final Inflater<? extends ViewT> inflater, final DiffUtil.ItemCallback<? super ItemT> diffCallback, final Function2<? super ViewT, ? super ItemT, Unit> bind) {
            Intrinsics.checkNotNullParameter(inflater, "inflater");
            Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
            Intrinsics.checkNotNullParameter(bind, "bind");
            return (GenericListAdapter<ViewT, ItemT>) new GenericListAdapter<ViewT, ItemT>(inflater, diffCallback) { // from class: com.robinhood.utils.ui.view.recyclerview.GenericListAdapter$Companion$of$1
                @Override // com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter
                protected void onBindViewHolder(GenericViewHolder<? extends ViewT> holder, ItemT item) {
                    Intrinsics.checkNotNullParameter(holder, "holder");
                    Intrinsics.checkNotNullParameter(item, "item");
                    bind.invoke(holder.getView(), item);
                }
            };
        }

        /* renamed from: of */
        public final <ViewT extends View & Bindable<? super ItemT>, ItemT> GenericListAdapter<ViewT, ItemT> m2986of(final Inflater<? extends ViewT> inflater, final DiffUtil.ItemCallback<? super ItemT> diffCallback) {
            Intrinsics.checkNotNullParameter(inflater, "inflater");
            Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
            return (GenericListAdapter<ViewT, ItemT>) new GenericListAdapter<ViewT, ItemT>(inflater, diffCallback) { // from class: com.robinhood.utils.ui.view.recyclerview.GenericListAdapter$Companion$of$2
                @Override // com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter
                protected void onBindViewHolder(GenericViewHolder<? extends ViewT> holder, ItemT item) {
                    Intrinsics.checkNotNullParameter(holder, "holder");
                    Intrinsics.checkNotNullParameter(item, "item");
                    ((Bindable) holder.getView()).bind(item);
                }
            };
        }
    }
}
