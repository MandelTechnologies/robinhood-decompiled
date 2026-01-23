package androidx.paging;

import androidx.recyclerview.widget.AdapterListUpdateCallback;
import androidx.recyclerview.widget.AsyncDifferConfig;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.Footer;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PagedListAdapter.kt */
@Deprecated
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\b\u0012\u0004\u0012\u0002H\u00030\u0005B\u0015\b\u0014\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0002\u0010\bB\u0015\b\u0014\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0002\u0010\u000bJ\"\u0010\u001b\u001a\u00020\u00192\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00190\u0018H\u0016J\u0017\u0010\u001e\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u001f\u001a\u00020 H\u0014¢\u0006\u0002\u0010!J\b\u0010\"\u001a\u00020 H\u0016J\u0018\u0010#\u001a\u00020\u00192\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\rH\u0017J(\u0010#\u001a\u00020\u00192\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\r2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\rH\u0016J\"\u0010%\u001a\u00020\u00192\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00190\u0018H\u0016J\u0018\u0010&\u001a\u00020\u00192\u000e\u0010'\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\rH\u0016J\"\u0010&\u001a\u00020\u00192\u000e\u0010'\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\r2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\u0012\u0010*\u001a\u00020+2\n\u0010,\u001a\u0006\u0012\u0002\b\u00030-J\u0012\u0010.\u001a\u00020+2\n\u0010/\u001a\u0006\u0012\u0002\b\u00030-J\u001e\u00100\u001a\u00020+2\n\u0010/\u001a\u0006\u0012\u0002\b\u00030-2\n\u0010,\u001a\u0006\u0012\u0002\b\u00030-R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\r8VX\u0096\u0004¢\u0006\f\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013X\u0080\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0016R6\u0010\u0017\u001a$\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\r\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\r\u0012\u0004\u0012\u00020\u00190\u0018X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u001a\u0010\u000f¨\u00061"}, m3636d2 = {"Landroidx/paging/PagedListAdapter;", "T", "", "VH", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "diffCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;)V", "config", "Landroidx/recyclerview/widget/AsyncDifferConfig;", "(Landroidx/recyclerview/widget/AsyncDifferConfig;)V", "currentList", "Landroidx/paging/PagedList;", "getCurrentList$annotations", "()V", "getCurrentList", "()Landroidx/paging/PagedList;", "differ", "Landroidx/paging/AsyncPagedListDiffer;", "getDiffer$paging_runtime_release$annotations", "getDiffer$paging_runtime_release", "()Landroidx/paging/AsyncPagedListDiffer;", "listener", "Lkotlin/Function2;", "", "getListener$annotations", "addLoadStateListener", "Landroidx/paging/LoadType;", "Landroidx/paging/LoadState;", "getItem", "position", "", "(I)Ljava/lang/Object;", "getItemCount", "onCurrentListChanged", "previousList", "removeLoadStateListener", "submitList", "pagedList", "commitCallback", "Ljava/lang/Runnable;", "withLoadStateFooter", "Landroidx/recyclerview/widget/ConcatAdapter;", Footer.f10637type, "Landroidx/paging/LoadStateAdapter;", "withLoadStateHeader", "header", "withLoadStateHeaderAndFooter", "paging-runtime_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes4.dex */
public abstract class PagedListAdapter<T, VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH> {
    private final AsyncPagedListDiffer<T> differ;
    private final Function2<PagedList<T>, PagedList<T>, Unit> listener;

    public static /* synthetic */ void getCurrentList$annotations() {
    }

    public static /* synthetic */ void getDiffer$paging_runtime_release$annotations() {
    }

    private static /* synthetic */ void getListener$annotations() {
    }

    @Deprecated
    public void onCurrentListChanged(PagedList<T> currentList) {
    }

    public void onCurrentListChanged(PagedList<T> previousList, PagedList<T> currentList) {
    }

    public final AsyncPagedListDiffer<T> getDiffer$paging_runtime_release() {
        return this.differ;
    }

    public PagedList<T> getCurrentList() {
        return this.differ.getCurrentList();
    }

    protected PagedListAdapter(DiffUtil.ItemCallback<T> diffCallback) {
        Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
        Function2<PagedList<T>, PagedList<T>, Unit> function2 = new Function2<PagedList<T>, PagedList<T>, Unit>(this) { // from class: androidx.paging.PagedListAdapter$listener$1
            final /* synthetic */ PagedListAdapter<T, VH> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Object obj, Object obj2) {
                invoke((PagedList) obj, (PagedList) obj2);
                return Unit.INSTANCE;
            }

            public final void invoke(PagedList<T> pagedList, PagedList<T> pagedList2) {
                this.this$0.onCurrentListChanged(pagedList2);
                this.this$0.onCurrentListChanged(pagedList, pagedList2);
            }
        };
        this.listener = function2;
        AsyncPagedListDiffer<T> asyncPagedListDiffer = new AsyncPagedListDiffer<>(this, diffCallback);
        this.differ = asyncPagedListDiffer;
        asyncPagedListDiffer.addPagedListListener(function2);
    }

    protected PagedListAdapter(AsyncDifferConfig<T> config) {
        Intrinsics.checkNotNullParameter(config, "config");
        Function2<PagedList<T>, PagedList<T>, Unit> function2 = new Function2<PagedList<T>, PagedList<T>, Unit>(this) { // from class: androidx.paging.PagedListAdapter$listener$1
            final /* synthetic */ PagedListAdapter<T, VH> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Object obj, Object obj2) {
                invoke((PagedList) obj, (PagedList) obj2);
                return Unit.INSTANCE;
            }

            public final void invoke(PagedList<T> pagedList, PagedList<T> pagedList2) {
                this.this$0.onCurrentListChanged(pagedList2);
                this.this$0.onCurrentListChanged(pagedList, pagedList2);
            }
        };
        this.listener = function2;
        AsyncPagedListDiffer<T> asyncPagedListDiffer = new AsyncPagedListDiffer<>(new AdapterListUpdateCallback(this), config);
        this.differ = asyncPagedListDiffer;
        asyncPagedListDiffer.addPagedListListener(function2);
    }

    public void submitList(PagedList<T> pagedList) {
        this.differ.submitList(pagedList);
    }

    public void submitList(PagedList<T> pagedList, Runnable commitCallback) {
        this.differ.submitList(pagedList, commitCallback);
    }

    protected T getItem(int position) {
        return this.differ.getItem(position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: getItemCount */
    public int getSize() {
        return this.differ.getItemCount();
    }

    public void addLoadStateListener(Function2<? super LoadType, ? super LoadState, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.differ.addLoadStateListener(listener);
    }

    public void removeLoadStateListener(Function2<? super LoadType, ? super LoadState, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.differ.removeLoadStateListener(listener);
    }

    public final ConcatAdapter withLoadStateHeader(LoadStateAdapter<?> header) {
        Intrinsics.checkNotNullParameter(header, "header");
        addLoadStateListener(new Function2<LoadType, LoadState, Unit>(header) { // from class: androidx.paging.PagedListAdapter.withLoadStateHeader.1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(LoadType loadType, LoadState loadState) {
                invoke2(loadType, loadState);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(LoadType loadType, LoadState loadState) {
                Intrinsics.checkNotNullParameter(loadType, "loadType");
                Intrinsics.checkNotNullParameter(loadState, "loadState");
                if (loadType == LoadType.PREPEND) {
                    throw null;
                }
            }
        });
        return new ConcatAdapter(header, this);
    }

    public final ConcatAdapter withLoadStateFooter(LoadStateAdapter<?> footer) {
        Intrinsics.checkNotNullParameter(footer, "footer");
        addLoadStateListener(new Function2<LoadType, LoadState, Unit>(footer) { // from class: androidx.paging.PagedListAdapter.withLoadStateFooter.1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(LoadType loadType, LoadState loadState) {
                invoke2(loadType, loadState);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(LoadType loadType, LoadState loadState) {
                Intrinsics.checkNotNullParameter(loadType, "loadType");
                Intrinsics.checkNotNullParameter(loadState, "loadState");
                if (loadType == LoadType.APPEND) {
                    throw null;
                }
            }
        });
        return new ConcatAdapter(this, footer);
    }

    public final ConcatAdapter withLoadStateHeaderAndFooter(LoadStateAdapter<?> header, LoadStateAdapter<?> footer) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(footer, "footer");
        addLoadStateListener(new Function2<LoadType, LoadState, Unit>(header, footer) { // from class: androidx.paging.PagedListAdapter.withLoadStateHeaderAndFooter.1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(LoadType loadType, LoadState loadState) {
                invoke2(loadType, loadState);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(LoadType loadType, LoadState loadState) {
                Intrinsics.checkNotNullParameter(loadType, "loadType");
                Intrinsics.checkNotNullParameter(loadState, "loadState");
                if (loadType == LoadType.PREPEND || loadType == LoadType.APPEND) {
                    throw null;
                }
            }
        });
        return new ConcatAdapter(header, this, footer);
    }
}
