package com.robinhood.utils.p409ui.view.recyclerview;

import android.view.View;
import android.view.ViewGroup;
import androidx.paging.PagedListAdapter;
import androidx.recyclerview.widget.AsyncDifferConfig;
import androidx.recyclerview.widget.DiffUtil;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GenericPagedListAdapter.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0017\u0018\u0000 \u001f*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u0014\u0012\u0004\u0012\u0002H\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00060\u0005:\u0001\u001fB'\b\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u000e\u0010\t\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00010\n¢\u0006\u0004\b\u000b\u0010\fB'\b\u0014\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u000e\u0010\r\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u000fJ\u0017\u0010\u0012\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0013\u001a\u00020\u0014H\u0016¢\u0006\u0002\u0010\u0015J\u001e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0014H\u0016J\u001e\u0010\u001a\u001a\u00020\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J%\u0010\u001a\u001a\u00020\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\b\u0010\u001d\u001a\u0004\u0018\u00018\u0001H\u0014¢\u0006\u0002\u0010\u001eR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006 "}, m3636d2 = {"Lcom/robinhood/utils/ui/view/recyclerview/GenericPagedListAdapter;", "ViewT", "Landroid/view/View;", "ItemT", "", "Landroidx/paging/PagedListAdapter;", "Lcom/robinhood/utils/ui/view/recyclerview/GenericViewHolder;", "inflater", "Lcom/robinhood/utils/ui/view/Inflater;", "config", "Landroidx/recyclerview/widget/AsyncDifferConfig;", "<init>", "(Lcom/robinhood/utils/ui/view/Inflater;Landroidx/recyclerview/widget/AsyncDifferConfig;)V", "diffCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "(Lcom/robinhood/utils/ui/view/Inflater;Landroidx/recyclerview/widget/DiffUtil$ItemCallback;)V", "getInflater", "()Lcom/robinhood/utils/ui/view/Inflater;", "getItem", "position", "", "(I)Ljava/lang/Object;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", "", "holder", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "(Lcom/robinhood/utils/ui/view/recyclerview/GenericViewHolder;Ljava/lang/Object;)V", "Companion", "lib-utils-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public class GenericPagedListAdapter<ViewT extends View, ItemT> extends PagedListAdapter<ItemT, GenericViewHolder<? extends ViewT>> {
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
    protected GenericPagedListAdapter(Inflater<? extends ViewT> inflater, AsyncDifferConfig<? super ItemT> config) {
        super(config);
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Intrinsics.checkNotNullParameter(config, "config");
        this.inflater = inflater;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    protected GenericPagedListAdapter(Inflater<? extends ViewT> inflater, DiffUtil.ItemCallback<? super ItemT> diffCallback) {
        this(inflater, DiffCallbacks2.toAsyncDifferConfig(diffCallback));
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
    }

    @Override // androidx.paging.PagedListAdapter
    public ItemT getItem(int position) {
        return (ItemT) super.getItem(position);
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

    /* compiled from: GenericPagedListAdapter.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jc\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u00070\u0005\"\b\b\u0002\u0010\u0006*\u00020\b\"\b\b\u0003\u0010\u0007*\u00020\u00012\b\b\u0001\u0010\t\u001a\u00020\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0006\b\u0000\u0012\u0002H\u00070\f2\u001f\u0010\r\u001a\u001b\u0012\u0004\u0012\u0002H\u0006\u0012\u0006\u0012\u0004\u0018\u0001H\u0007\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0002\b\u0010Jg\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u00070\u0005\"\b\b\u0002\u0010\u0006*\u00020\b\"\b\b\u0003\u0010\u0007*\u00020\u00012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00122\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0006\b\u0000\u0012\u0002H\u00070\f2\u001f\u0010\r\u001a\u001b\u0012\u0004\u0012\u0002H\u0006\u0012\u0006\u0012\u0004\u0018\u0001H\u0007\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0002\b\u0010JR\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u00070\u0005\"\u0014\b\u0002\u0010\u0006*\u00020\b*\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00070\u0013\"\b\b\u0003\u0010\u0007*\u00020\u00012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00122\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0006\b\u0000\u0012\u0002H\u00070\f¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/utils/ui/view/recyclerview/GenericPagedListAdapter$Companion;", "", "<init>", "()V", "of", "Lcom/robinhood/utils/ui/view/recyclerview/GenericPagedListAdapter;", "ViewT", "ItemT", "Landroid/view/View;", "layoutResId", "", "diffCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "bind", "Lkotlin/Function2;", "", "Lkotlin/ExtensionFunctionType;", "inflater", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/utils/ui/view/Bindable;", "lib-utils-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ GenericPagedListAdapter of$default(Companion companion, int i, DiffUtil.ItemCallback itemCallback, Function2 function2, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                itemCallback = DiffCallbacks.Equality.INSTANCE;
            }
            return companion.m2988of(i, itemCallback, function2);
        }

        /* renamed from: of */
        public final <ViewT extends View, ItemT> GenericPagedListAdapter<ViewT, ItemT> m2988of(int layoutResId, DiffUtil.ItemCallback<? super ItemT> diffCallback, Function2<? super ViewT, ? super ItemT, Unit> bind) {
            Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
            Intrinsics.checkNotNullParameter(bind, "bind");
            return m2990of(Inflater.INSTANCE.include(layoutResId), diffCallback, bind);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ GenericPagedListAdapter of$default(Companion companion, Inflater inflater, DiffUtil.ItemCallback itemCallback, Function2 function2, int i, Object obj) {
            if ((i & 2) != 0) {
                itemCallback = DiffCallbacks.Equality.INSTANCE;
            }
            return companion.m2990of(inflater, itemCallback, function2);
        }

        /* renamed from: of */
        public final <ViewT extends View, ItemT> GenericPagedListAdapter<ViewT, ItemT> m2990of(final Inflater<? extends ViewT> inflater, final DiffUtil.ItemCallback<? super ItemT> diffCallback, final Function2<? super ViewT, ? super ItemT, Unit> bind) {
            Intrinsics.checkNotNullParameter(inflater, "inflater");
            Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
            Intrinsics.checkNotNullParameter(bind, "bind");
            return (GenericPagedListAdapter<ViewT, ItemT>) new GenericPagedListAdapter<ViewT, ItemT>(inflater, diffCallback) { // from class: com.robinhood.utils.ui.view.recyclerview.GenericPagedListAdapter$Companion$of$1
                @Override // com.robinhood.utils.p409ui.view.recyclerview.GenericPagedListAdapter
                protected void onBindViewHolder(GenericViewHolder<? extends ViewT> holder, ItemT item) {
                    Intrinsics.checkNotNullParameter(holder, "holder");
                    bind.invoke(holder.getView(), item);
                }
            };
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ GenericPagedListAdapter of$default(Companion companion, Inflater inflater, DiffUtil.ItemCallback itemCallback, int i, Object obj) {
            if ((i & 2) != 0) {
                itemCallback = DiffCallbacks.Equality.INSTANCE;
            }
            return companion.m2989of(inflater, itemCallback);
        }

        /* renamed from: of */
        public final <ViewT extends View & Bindable<? super ItemT>, ItemT> GenericPagedListAdapter<ViewT, ItemT> m2989of(final Inflater<? extends ViewT> inflater, final DiffUtil.ItemCallback<? super ItemT> diffCallback) {
            Intrinsics.checkNotNullParameter(inflater, "inflater");
            Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
            return (GenericPagedListAdapter<ViewT, ItemT>) new GenericPagedListAdapter<ViewT, ItemT>(inflater, diffCallback) { // from class: com.robinhood.utils.ui.view.recyclerview.GenericPagedListAdapter$Companion$of$2
                @Override // com.robinhood.utils.p409ui.view.recyclerview.GenericPagedListAdapter
                protected void onBindViewHolder(GenericViewHolder<? extends ViewT> holder, ItemT item) {
                    Intrinsics.checkNotNullParameter(holder, "holder");
                    ((Bindable) holder.getView()).bind(item);
                }
            };
        }
    }
}
