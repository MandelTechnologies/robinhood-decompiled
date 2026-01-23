package androidx.paging;

import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.paging.LoadState;
import androidx.paging.PagedList;
import androidx.recyclerview.widget.AdapterListUpdateCallback;
import androidx.recyclerview.widget.AsyncDifferConfig;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListUpdateCallback;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KFunction;

/* compiled from: AsyncPagedListDiffer.kt */
@Metadata(m3635d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0017\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0002noB#\b\u0017\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bB\u001f\b\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b\u0007\u0010\rJ9\u0010\u0014\u001a\u00020\u00132\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\u00132\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ)\u0010\u001b\u001a\u00020\u00132\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u001b\u0010\u001dJM\u0010'\u001a\u00020\u00132\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u00162\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0000¢\u0006\u0004\b%\u0010&J7\u0010*\u001a\u00020\u00132(\u0010)\u001a$\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u00130(¢\u0006\u0004\b*\u0010+J)\u0010/\u001a\u00020\u00132\u0018\u0010.\u001a\u0014\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u00130(H\u0016¢\u0006\u0004\b/\u0010+J)\u00100\u001a\u00020\u00132\u0018\u0010.\u001a\u0014\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u00130(H\u0016¢\u0006\u0004\b0\u0010+R\"\u00101\u001a\u00020\t8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R&\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b8\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b\f\u00107\u0012\u0004\b:\u0010;\u001a\u0004\b8\u00109R\"\u0010=\u001a\u00020<8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR,\u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000D0C8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bE\u0010F\u0012\u0004\bI\u0010;\u001a\u0004\bG\u0010HR$\u0010\u001a\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\u001a\u0010J\u0012\u0004\bK\u0010;R$\u0010L\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\bL\u0010J\u0012\u0004\bM\u0010;R(\u0010N\u001a\u00020\u00168\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0004\bN\u0010O\u0012\u0004\bT\u0010;\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u001a\u0010V\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\f\n\u0004\bV\u0010W\u0012\u0004\bX\u0010;RD\u0010^\u001a2\u0012\u0013\u0012\u00110,¢\u0006\f\bZ\u0012\b\b[\u0012\u0004\b\b(\\\u0012\u0013\u0012\u00110-¢\u0006\f\bZ\u0012\b\b[\u0012\u0004\b\b(]\u0012\u0004\u0012\u00020\u00130Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R2\u0010a\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u00130(0`8\u0000X\u0080\u0004¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010dR\u001a\u0010f\u001a\u00020e8\u0002X\u0082\u0004¢\u0006\f\n\u0004\bf\u0010g\u0012\u0004\bh\u0010;R\u0014\u0010j\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bi\u0010QR\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e8VX\u0096\u0004¢\u0006\f\u0012\u0004\bm\u0010;\u001a\u0004\bk\u0010l¨\u0006p"}, m3636d2 = {"Landroidx/paging/AsyncPagedListDiffer;", "", "T", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "adapter", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "diffCallback", "<init>", "(Landroidx/recyclerview/widget/RecyclerView$Adapter;Landroidx/recyclerview/widget/DiffUtil$ItemCallback;)V", "Landroidx/recyclerview/widget/ListUpdateCallback;", "listUpdateCallback", "Landroidx/recyclerview/widget/AsyncDifferConfig;", "config", "(Landroidx/recyclerview/widget/ListUpdateCallback;Landroidx/recyclerview/widget/AsyncDifferConfig;)V", "Landroidx/paging/PagedList;", "previousList", "currentList", "Ljava/lang/Runnable;", "commitCallback", "", "onCurrentListChanged", "(Landroidx/paging/PagedList;Landroidx/paging/PagedList;Ljava/lang/Runnable;)V", "", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "getItem", "(I)Ljava/lang/Object;", "pagedList", "submitList", "(Landroidx/paging/PagedList;)V", "(Landroidx/paging/PagedList;Ljava/lang/Runnable;)V", "newList", "diffSnapshot", "Landroidx/paging/PlaceholderPaddedDiffResult;", "diffResult", "Landroidx/paging/RecordingCallback;", "recordingCallback", "lastAccessIndex", "latchPagedList$paging_runtime_release", "(Landroidx/paging/PagedList;Landroidx/paging/PagedList;Landroidx/paging/PlaceholderPaddedDiffResult;Landroidx/paging/RecordingCallback;ILjava/lang/Runnable;)V", "latchPagedList", "Lkotlin/Function2;", "callback", "addPagedListListener", "(Lkotlin/jvm/functions/Function2;)V", "Landroidx/paging/LoadType;", "Landroidx/paging/LoadState;", "listener", "addLoadStateListener", "removeLoadStateListener", "updateCallback", "Landroidx/recyclerview/widget/ListUpdateCallback;", "getUpdateCallback$paging_runtime_release", "()Landroidx/recyclerview/widget/ListUpdateCallback;", "setUpdateCallback$paging_runtime_release", "(Landroidx/recyclerview/widget/ListUpdateCallback;)V", "Landroidx/recyclerview/widget/AsyncDifferConfig;", "getConfig$paging_runtime_release", "()Landroidx/recyclerview/widget/AsyncDifferConfig;", "getConfig$paging_runtime_release$annotations", "()V", "Ljava/util/concurrent/Executor;", "mainThreadExecutor", "Ljava/util/concurrent/Executor;", "getMainThreadExecutor$paging_runtime_release", "()Ljava/util/concurrent/Executor;", "setMainThreadExecutor$paging_runtime_release", "(Ljava/util/concurrent/Executor;)V", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Landroidx/paging/AsyncPagedListDiffer$PagedListListener;", "listeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "getListeners$paging_runtime_release", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "getListeners$paging_runtime_release$annotations", "Landroidx/paging/PagedList;", "getPagedList$annotations", "snapshot", "getSnapshot$annotations", "maxScheduledGeneration", "I", "getMaxScheduledGeneration$paging_runtime_release", "()I", "setMaxScheduledGeneration$paging_runtime_release", "(I)V", "getMaxScheduledGeneration$paging_runtime_release$annotations", "Landroidx/paging/PagedList$LoadStateManager;", "loadStateManager", "Landroidx/paging/PagedList$LoadStateManager;", "getLoadStateManager$annotations", "Lkotlin/reflect/KFunction2;", "Lkotlin/ParameterName;", "name", "type", "state", "loadStateListener", "Lkotlin/reflect/KFunction;", "", "loadStateListeners", "Ljava/util/List;", "getLoadStateListeners$paging_runtime_release", "()Ljava/util/List;", "Landroidx/paging/PagedList$Callback;", "pagedListCallback", "Landroidx/paging/PagedList$Callback;", "getPagedListCallback$annotations", "getItemCount", "itemCount", "getCurrentList", "()Landroidx/paging/PagedList;", "getCurrentList$annotations", "OnCurrentListChangedWrapper", "PagedListListener", "paging-runtime_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
@Deprecated
@SourceDebugExtension
/* loaded from: classes4.dex */
public class AsyncPagedListDiffer<T> {
    private final AsyncDifferConfig<T> config;
    private final CopyOnWriteArrayList<PagedListListener<T>> listeners;
    private final KFunction<Unit> loadStateListener;
    private final List<Function2<LoadType, LoadState, Unit>> loadStateListeners;
    private final PagedList.LoadStateManager loadStateManager;
    private Executor mainThreadExecutor;
    private int maxScheduledGeneration;
    private PagedList<T> pagedList;
    private final PagedList.Callback pagedListCallback;
    private PagedList<T> snapshot;
    public ListUpdateCallback updateCallback;

    /* compiled from: AsyncPagedListDiffer.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000*\b\b\u0001\u0010\u0001*\u00020\u00022\u00020\u0002J(\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00062\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0006H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, m3636d2 = {"Landroidx/paging/AsyncPagedListDiffer$PagedListListener;", "T", "", "onCurrentListChanged", "", "previousList", "Landroidx/paging/PagedList;", "currentList", "paging-runtime_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    @Deprecated
    public interface PagedListListener<T> {
        void onCurrentListChanged(PagedList<T> previousList, PagedList<T> currentList);
    }

    public final ListUpdateCallback getUpdateCallback$paging_runtime_release() {
        ListUpdateCallback listUpdateCallback = this.updateCallback;
        if (listUpdateCallback != null) {
            return listUpdateCallback;
        }
        Intrinsics.throwUninitializedPropertyAccessException("updateCallback");
        return null;
    }

    public final void setUpdateCallback$paging_runtime_release(ListUpdateCallback listUpdateCallback) {
        Intrinsics.checkNotNullParameter(listUpdateCallback, "<set-?>");
        this.updateCallback = listUpdateCallback;
    }

    public final List<Function2<LoadType, LoadState, Unit>> getLoadStateListeners$paging_runtime_release() {
        return this.loadStateListeners;
    }

    public int getItemCount() {
        PagedList<T> currentList = getCurrentList();
        if (currentList != null) {
            return currentList.size();
        }
        return 0;
    }

    public PagedList<T> getCurrentList() {
        PagedList<T> pagedList = this.snapshot;
        return pagedList == null ? this.pagedList : pagedList;
    }

    /* compiled from: AsyncPagedListDiffer.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0002\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B1\u0012(\u0010\u0007\u001a$\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0005\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ/\u0010\f\u001a\u00020\u00062\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00052\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\f\u0010\rR9\u0010\u0007\u001a$\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0005\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Landroidx/paging/AsyncPagedListDiffer$OnCurrentListChangedWrapper;", "", "T", "Landroidx/paging/AsyncPagedListDiffer$PagedListListener;", "Lkotlin/Function2;", "Landroidx/paging/PagedList;", "", "callback", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "previousList", "currentList", "onCurrentListChanged", "(Landroidx/paging/PagedList;Landroidx/paging/PagedList;)V", "Lkotlin/jvm/functions/Function2;", "getCallback", "()Lkotlin/jvm/functions/Function2;", "paging-runtime_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    private static final class OnCurrentListChangedWrapper<T> implements PagedListListener<T> {
        private final Function2<PagedList<T>, PagedList<T>, Unit> callback;

        /* JADX WARN: Multi-variable type inference failed */
        public OnCurrentListChangedWrapper(Function2<? super PagedList<T>, ? super PagedList<T>, Unit> callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.callback = callback;
        }

        @Override // androidx.paging.AsyncPagedListDiffer.PagedListListener
        public void onCurrentListChanged(PagedList<T> previousList, PagedList<T> currentList) {
            this.callback.invoke(previousList, currentList);
        }
    }

    @Deprecated
    public AsyncPagedListDiffer(RecyclerView.Adapter<?> adapter, DiffUtil.ItemCallback<T> diffCallback) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
        Executor mainThreadExecutor = ArchTaskExecutor.getMainThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(mainThreadExecutor, "getMainThreadExecutor()");
        this.mainThreadExecutor = mainThreadExecutor;
        this.listeners = new CopyOnWriteArrayList<>();
        PagedList.LoadStateManager loadStateManager = new PagedList.LoadStateManager(this) { // from class: androidx.paging.AsyncPagedListDiffer$loadStateManager$1
            final /* synthetic */ AsyncPagedListDiffer<T> this$0;

            {
                this.this$0 = this;
            }

            @Override // androidx.paging.PagedList.LoadStateManager
            public void onStateChanged(LoadType type2, LoadState state) {
                Intrinsics.checkNotNullParameter(type2, "type");
                Intrinsics.checkNotNullParameter(state, "state");
                Iterator<T> it = this.this$0.getLoadStateListeners$paging_runtime_release().iterator();
                while (it.hasNext()) {
                    ((Function2) it.next()).invoke(type2, state);
                }
            }
        };
        this.loadStateManager = loadStateManager;
        this.loadStateListener = new AsyncPagedListDiffer2(loadStateManager);
        this.loadStateListeners = new CopyOnWriteArrayList();
        this.pagedListCallback = new PagedList.Callback(this) { // from class: androidx.paging.AsyncPagedListDiffer$pagedListCallback$1
            final /* synthetic */ AsyncPagedListDiffer<T> this$0;

            {
                this.this$0 = this;
            }

            @Override // androidx.paging.PagedList.Callback
            public void onInserted(int position, int count) {
                this.this$0.getUpdateCallback$paging_runtime_release().onInserted(position, count);
            }

            @Override // androidx.paging.PagedList.Callback
            public void onRemoved(int position, int count) {
                this.this$0.getUpdateCallback$paging_runtime_release().onRemoved(position, count);
            }

            @Override // androidx.paging.PagedList.Callback
            public void onChanged(int position, int count) {
                this.this$0.getUpdateCallback$paging_runtime_release().onChanged(position, count, null);
            }
        };
        setUpdateCallback$paging_runtime_release(new AdapterListUpdateCallback(adapter));
        AsyncDifferConfig<T> asyncDifferConfigBuild = new AsyncDifferConfig.Builder(diffCallback).build();
        Intrinsics.checkNotNullExpressionValue(asyncDifferConfigBuild, "Builder(diffCallback).build()");
        this.config = asyncDifferConfigBuild;
    }

    @Deprecated
    public AsyncPagedListDiffer(ListUpdateCallback listUpdateCallback, AsyncDifferConfig<T> config) {
        Intrinsics.checkNotNullParameter(listUpdateCallback, "listUpdateCallback");
        Intrinsics.checkNotNullParameter(config, "config");
        Executor mainThreadExecutor = ArchTaskExecutor.getMainThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(mainThreadExecutor, "getMainThreadExecutor()");
        this.mainThreadExecutor = mainThreadExecutor;
        this.listeners = new CopyOnWriteArrayList<>();
        PagedList.LoadStateManager loadStateManager = new PagedList.LoadStateManager(this) { // from class: androidx.paging.AsyncPagedListDiffer$loadStateManager$1
            final /* synthetic */ AsyncPagedListDiffer<T> this$0;

            {
                this.this$0 = this;
            }

            @Override // androidx.paging.PagedList.LoadStateManager
            public void onStateChanged(LoadType type2, LoadState state) {
                Intrinsics.checkNotNullParameter(type2, "type");
                Intrinsics.checkNotNullParameter(state, "state");
                Iterator<T> it = this.this$0.getLoadStateListeners$paging_runtime_release().iterator();
                while (it.hasNext()) {
                    ((Function2) it.next()).invoke(type2, state);
                }
            }
        };
        this.loadStateManager = loadStateManager;
        this.loadStateListener = new AsyncPagedListDiffer2(loadStateManager);
        this.loadStateListeners = new CopyOnWriteArrayList();
        this.pagedListCallback = new PagedList.Callback(this) { // from class: androidx.paging.AsyncPagedListDiffer$pagedListCallback$1
            final /* synthetic */ AsyncPagedListDiffer<T> this$0;

            {
                this.this$0 = this;
            }

            @Override // androidx.paging.PagedList.Callback
            public void onInserted(int position, int count) {
                this.this$0.getUpdateCallback$paging_runtime_release().onInserted(position, count);
            }

            @Override // androidx.paging.PagedList.Callback
            public void onRemoved(int position, int count) {
                this.this$0.getUpdateCallback$paging_runtime_release().onRemoved(position, count);
            }

            @Override // androidx.paging.PagedList.Callback
            public void onChanged(int position, int count) {
                this.this$0.getUpdateCallback$paging_runtime_release().onChanged(position, count, null);
            }
        };
        setUpdateCallback$paging_runtime_release(listUpdateCallback);
        this.config = config;
    }

    public T getItem(int index) {
        PagedList<T> pagedList = this.snapshot;
        PagedList<T> pagedList2 = this.pagedList;
        if (pagedList != null) {
            return pagedList.get(index);
        }
        if (pagedList2 != null) {
            pagedList2.loadAround(index);
            return pagedList2.get(index);
        }
        throw new IndexOutOfBoundsException("Item count is zero, getItem() call is invalid");
    }

    public void submitList(PagedList<T> pagedList) {
        submitList(pagedList, null);
    }

    public void submitList(final PagedList<T> pagedList, final Runnable commitCallback) {
        final int i = this.maxScheduledGeneration + 1;
        this.maxScheduledGeneration = i;
        PagedList<T> pagedList2 = this.pagedList;
        if (pagedList == pagedList2) {
            if (commitCallback != null) {
                commitCallback.run();
                return;
            }
            return;
        }
        if (pagedList2 != null && (pagedList instanceof InitialPagedList)) {
            pagedList2.removeWeakCallback(this.pagedListCallback);
            pagedList2.removeWeakLoadStateListener((Function2) this.loadStateListener);
            this.loadStateManager.setState(LoadType.REFRESH, LoadState.Loading.INSTANCE);
            this.loadStateManager.setState(LoadType.PREPEND, new LoadState.NotLoading(false));
            this.loadStateManager.setState(LoadType.APPEND, new LoadState.NotLoading(false));
            if (commitCallback != null) {
                commitCallback.run();
                return;
            }
            return;
        }
        PagedList<T> currentList = getCurrentList();
        if (pagedList == null) {
            int itemCount = getItemCount();
            if (pagedList2 != null) {
                pagedList2.removeWeakCallback(this.pagedListCallback);
                pagedList2.removeWeakLoadStateListener((Function2) this.loadStateListener);
                this.pagedList = null;
            } else if (this.snapshot != null) {
                this.snapshot = null;
            }
            getUpdateCallback$paging_runtime_release().onRemoved(0, itemCount);
            onCurrentListChanged(currentList, null, commitCallback);
            return;
        }
        if (getCurrentList() == null) {
            this.pagedList = pagedList;
            pagedList.addWeakLoadStateListener((Function2) this.loadStateListener);
            pagedList.addWeakCallback(this.pagedListCallback);
            getUpdateCallback$paging_runtime_release().onInserted(0, pagedList.size());
            onCurrentListChanged(null, pagedList, commitCallback);
            return;
        }
        PagedList<T> pagedList3 = this.pagedList;
        if (pagedList3 != null) {
            pagedList3.removeWeakCallback(this.pagedListCallback);
            pagedList3.removeWeakLoadStateListener((Function2) this.loadStateListener);
            List<T> listSnapshot = pagedList3.snapshot();
            Intrinsics.checkNotNull(listSnapshot, "null cannot be cast to non-null type androidx.paging.PagedList<T of androidx.paging.AsyncPagedListDiffer.submitList$lambda$0>");
            this.snapshot = (PagedList) listSnapshot;
            this.pagedList = null;
        }
        final PagedList<T> pagedList4 = this.snapshot;
        if (pagedList4 == null || this.pagedList != null) {
            throw new IllegalStateException("must be in snapshot state to diff");
        }
        List<T> listSnapshot2 = pagedList.snapshot();
        Intrinsics.checkNotNull(listSnapshot2, "null cannot be cast to non-null type androidx.paging.PagedList<T of androidx.paging.AsyncPagedListDiffer>");
        final PagedList pagedList5 = (PagedList) listSnapshot2;
        final RecordingCallback recordingCallback = new RecordingCallback();
        pagedList.addWeakCallback(recordingCallback);
        this.config.getBackgroundThreadExecutor().execute(new Runnable() { // from class: androidx.paging.AsyncPagedListDiffer$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                AsyncPagedListDiffer.submitList$lambda$2(pagedList4, pagedList5, this, i, pagedList, recordingCallback, commitCallback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void submitList$lambda$2(final PagedList pagedList, final PagedList newSnapshot, final AsyncPagedListDiffer this$0, final int i, final PagedList pagedList2, final RecordingCallback recordingCallback, final Runnable runnable) {
        Intrinsics.checkNotNullParameter(newSnapshot, "$newSnapshot");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(recordingCallback, "$recordingCallback");
        PlaceholderPaddedList<T> placeholderPaddedList = pagedList.getPlaceholderPaddedList();
        PlaceholderPaddedList<T> placeholderPaddedList2 = newSnapshot.getPlaceholderPaddedList();
        DiffUtil.ItemCallback<T> diffCallback = this$0.config.getDiffCallback();
        Intrinsics.checkNotNullExpressionValue(diffCallback, "config.diffCallback");
        final PlaceholderPaddedListDiffHelper3 placeholderPaddedListDiffHelper3ComputeDiff = PlaceholderPaddedListDiffHelper4.computeDiff(placeholderPaddedList, placeholderPaddedList2, diffCallback);
        this$0.mainThreadExecutor.execute(new Runnable() { // from class: androidx.paging.AsyncPagedListDiffer$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                AsyncPagedListDiffer.submitList$lambda$2$lambda$1(this.f$0, i, pagedList2, newSnapshot, placeholderPaddedListDiffHelper3ComputeDiff, recordingCallback, pagedList, runnable);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void submitList$lambda$2$lambda$1(AsyncPagedListDiffer this$0, int i, PagedList pagedList, PagedList newSnapshot, PlaceholderPaddedListDiffHelper3 result, RecordingCallback recordingCallback, PagedList pagedList2, Runnable runnable) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(newSnapshot, "$newSnapshot");
        Intrinsics.checkNotNullParameter(result, "$result");
        Intrinsics.checkNotNullParameter(recordingCallback, "$recordingCallback");
        if (this$0.maxScheduledGeneration == i) {
            this$0.latchPagedList$paging_runtime_release(pagedList, newSnapshot, result, recordingCallback, pagedList2.lastLoad(), runnable);
        }
    }

    public final void latchPagedList$paging_runtime_release(PagedList<T> newList, PagedList<T> diffSnapshot, PlaceholderPaddedListDiffHelper3 diffResult, RecordingCallback recordingCallback, int lastAccessIndex, Runnable commitCallback) {
        Intrinsics.checkNotNullParameter(newList, "newList");
        Intrinsics.checkNotNullParameter(diffSnapshot, "diffSnapshot");
        Intrinsics.checkNotNullParameter(diffResult, "diffResult");
        Intrinsics.checkNotNullParameter(recordingCallback, "recordingCallback");
        PagedList<T> pagedList = this.snapshot;
        if (pagedList == null || this.pagedList != null) {
            throw new IllegalStateException("must be in snapshot state to apply diff");
        }
        this.pagedList = newList;
        newList.addWeakLoadStateListener((Function2) this.loadStateListener);
        this.snapshot = null;
        PlaceholderPaddedListDiffHelper4.dispatchDiff(pagedList.getPlaceholderPaddedList(), getUpdateCallback$paging_runtime_release(), diffSnapshot.getPlaceholderPaddedList(), diffResult);
        recordingCallback.dispatchRecordingTo(this.pagedListCallback);
        newList.addWeakCallback(this.pagedListCallback);
        if (!newList.isEmpty()) {
            newList.loadAround(RangesKt.coerceIn(PlaceholderPaddedListDiffHelper4.transformAnchorIndex(pagedList.getPlaceholderPaddedList(), diffResult, diffSnapshot.getPlaceholderPaddedList(), lastAccessIndex), 0, newList.size() - 1));
        }
        onCurrentListChanged(pagedList, this.pagedList, commitCallback);
    }

    private final void onCurrentListChanged(PagedList<T> previousList, PagedList<T> currentList, Runnable commitCallback) {
        Iterator<T> it = this.listeners.iterator();
        while (it.hasNext()) {
            ((PagedListListener) it.next()).onCurrentListChanged(previousList, currentList);
        }
        if (commitCallback != null) {
            commitCallback.run();
        }
    }

    public final void addPagedListListener(Function2<? super PagedList<T>, ? super PagedList<T>, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.listeners.add(new OnCurrentListChangedWrapper(callback));
    }

    public void addLoadStateListener(Function2<? super LoadType, ? super LoadState, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        PagedList<T> pagedList = this.pagedList;
        if (pagedList != null) {
            pagedList.addWeakLoadStateListener(listener);
        } else {
            this.loadStateManager.dispatchCurrentLoadState(listener);
        }
        this.loadStateListeners.add(listener);
    }

    public void removeLoadStateListener(Function2<? super LoadType, ? super LoadState, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.loadStateListeners.remove(listener);
        PagedList<T> pagedList = this.pagedList;
        if (pagedList != null) {
            pagedList.removeWeakLoadStateListener(listener);
        }
    }
}
