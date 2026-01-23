package androidx.paging;

import androidx.paging.LoadState;
import androidx.paging.PagingSource;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import java.lang.ref.WeakReference;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PagedList.kt */
@Metadata(m3635d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\t\b'\u0018\u0000 d*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0005efdghBA\b\u0000\u0012\u0010\u0010\u0005\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u001b\u001a\u00020\u00192\u0018\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0016H'¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u0013H'¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\"\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\u0018H\u0017¢\u0006\u0004\b\"\u0010#J\u0019\u0010&\u001a\u00020\u00192\b\u0010%\u001a\u0004\u0018\u00010$H\u0007¢\u0006\u0004\b&\u0010'J\u001f\u0010+\u001a\u00020\u00192\u0006\u0010(\u001a\u00020\u00172\u0006\u0010)\u001a\u00020\u0018H\u0000¢\u0006\u0004\b*\u0010#J\u001a\u0010,\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u001d\u001a\u00020\u0013H\u0096\u0002¢\u0006\u0004\b,\u0010-J\u0015\u0010.\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u0013¢\u0006\u0004\b.\u0010\u001fJ\u0013\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000/¢\u0006\u0004\b0\u00101J'\u00103\u001a\u00020\u00192\u0018\u00102\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0016¢\u0006\u0004\b3\u0010\u001cJ'\u00104\u001a\u00020\u00192\u0018\u00102\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0016¢\u0006\u0004\b4\u0010\u001cJ\u0015\u00106\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u000205¢\u0006\u0004\b6\u00107J\u0015\u00108\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u000205¢\u0006\u0004\b8\u00107J\u001f\u0010=\u001a\u00020\u00192\u0006\u00109\u001a\u00020\u00132\u0006\u0010:\u001a\u00020\u0013H\u0000¢\u0006\u0004\b;\u0010<J\u001f\u0010>\u001a\u00020\u00192\u0006\u00109\u001a\u00020\u00132\u0006\u0010:\u001a\u00020\u0013H\u0007¢\u0006\u0004\b>\u0010<J\u001f\u0010?\u001a\u00020\u00192\u0006\u00109\u001a\u00020\u00132\u0006\u0010:\u001a\u00020\u0013H\u0007¢\u0006\u0004\b?\u0010<R$\u0010\u0005\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\u00048\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010@\u001a\u0004\bA\u0010BR\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010C\u001a\u0004\bD\u0010ER\u001a\u0010\t\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010F\u001a\u0004\bG\u0010HR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010I\u001a\u0004\bJ\u0010KR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010L\u001a\u0004\bM\u0010NR$\u0010%\u001a\u0004\u0018\u00010$8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b%\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010'R\u001a\u0010S\u001a\u00020\u00138\u0000X\u0080\u0004¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010\u0015R \u0010X\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002050W0V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR2\u0010Z\u001a \u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00160W0V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010YR\u0014\u0010\\\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\u0015R\u0016\u0010_\u001a\u0004\u0018\u00010\u00018&X¦\u0004¢\u0006\u0006\u001a\u0004\b]\u0010^R\u0014\u0010a\u001a\u00020`8&X¦\u0004¢\u0006\u0006\u001a\u0004\ba\u0010bR\u0014\u0010c\u001a\u00020`8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bc\u0010b¨\u0006i"}, m3636d2 = {"Landroidx/paging/PagedList;", "", "T", "Ljava/util/AbstractList;", "Landroidx/paging/PagingSource;", "pagingSource", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lkotlinx/coroutines/CoroutineDispatcher;", "notifyDispatcher", "Landroidx/paging/PagedStorage;", PlaceTypes.STORAGE, "Landroidx/paging/PagedList$Config;", "config", "<init>", "(Landroidx/paging/PagingSource;Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/CoroutineDispatcher;Landroidx/paging/PagedStorage;Landroidx/paging/PagedList$Config;)V", "Landroidx/paging/PlaceholderPaddedList;", "getPlaceholderPaddedList", "()Landroidx/paging/PlaceholderPaddedList;", "", "lastLoad", "()I", "Lkotlin/Function2;", "Landroidx/paging/LoadType;", "Landroidx/paging/LoadState;", "", "callback", "dispatchCurrentLoadState", "(Lkotlin/jvm/functions/Function2;)V", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "loadAroundInternal", "(I)V", "loadType", "loadState", "setInitialLoadState", "(Landroidx/paging/LoadType;Landroidx/paging/LoadState;)V", "Ljava/lang/Runnable;", "refreshRetryCallback", "setRetryCallback", "(Ljava/lang/Runnable;)V", "type", "state", "dispatchStateChangeAsync$paging_common_release", "dispatchStateChangeAsync", "get", "(I)Ljava/lang/Object;", "loadAround", "", "snapshot", "()Ljava/util/List;", "listener", "addWeakLoadStateListener", "removeWeakLoadStateListener", "Landroidx/paging/PagedList$Callback;", "addWeakCallback", "(Landroidx/paging/PagedList$Callback;)V", "removeWeakCallback", "position", "count", "notifyInserted$paging_common_release", "(II)V", "notifyInserted", "notifyChanged", "notifyRemoved", "Landroidx/paging/PagingSource;", "getPagingSource", "()Landroidx/paging/PagingSource;", "Lkotlinx/coroutines/CoroutineScope;", "getCoroutineScope$paging_common_release", "()Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/CoroutineDispatcher;", "getNotifyDispatcher$paging_common_release", "()Lkotlinx/coroutines/CoroutineDispatcher;", "Landroidx/paging/PagedStorage;", "getStorage$paging_common_release", "()Landroidx/paging/PagedStorage;", "Landroidx/paging/PagedList$Config;", "getConfig", "()Landroidx/paging/PagedList$Config;", "Ljava/lang/Runnable;", "getRefreshRetryCallback$paging_common_release", "()Ljava/lang/Runnable;", "setRefreshRetryCallback$paging_common_release", "requiredRemainder", "I", "getRequiredRemainder$paging_common_release", "", "Ljava/lang/ref/WeakReference;", "callbacks", "Ljava/util/List;", "loadStateListeners", "getSize", "size", "getLastKey", "()Ljava/lang/Object;", "lastKey", "", "isDetached", "()Z", "isImmutable", "Companion", "BoundaryCallback", "Callback", "Config", "LoadStateManager", "paging-common_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
@Deprecated
@SourceDebugExtension
/* loaded from: classes4.dex */
public abstract class PagedList<T> extends AbstractList<T> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final List<WeakReference<Callback>> callbacks;
    private final Config config;
    private final CoroutineScope coroutineScope;
    private final List<WeakReference<Function2<LoadType, LoadState, Unit>>> loadStateListeners;
    private final CoroutineDispatcher notifyDispatcher;
    private final PagingSource<?, T> pagingSource;
    private Runnable refreshRetryCallback;
    private final int requiredRemainder;
    private final PagedStorage<T> storage;

    /* compiled from: PagedList.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b'\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\u00020\u0001¨\u0006\u0003"}, m3636d2 = {"Landroidx/paging/PagedList$BoundaryCallback;", "", "T", "paging-common_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    public static abstract class BoundaryCallback<T> {
    }

    /* compiled from: PagedList.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H&¨\u0006\n"}, m3636d2 = {"Landroidx/paging/PagedList$Callback;", "", "()V", "onChanged", "", "position", "", "count", "onInserted", "onRemoved", "paging-common_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    public static abstract class Callback {
        public abstract void onChanged(int position, int count);

        public abstract void onInserted(int position, int count);

        public abstract void onRemoved(int position, int count);
    }

    public abstract void dispatchCurrentLoadState(Function2<? super LoadType, ? super LoadState, Unit> callback);

    public abstract Object getLastKey();

    /* renamed from: isDetached */
    public abstract boolean getIsDetached();

    public abstract void loadAroundInternal(int index);

    public void setInitialLoadState(LoadType loadType, LoadState loadState) {
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        Intrinsics.checkNotNullParameter(loadState, "loadState");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ T remove(int i) {
        return (T) removeAt(i);
    }

    public /* bridge */ Object removeAt(int i) {
        return super.remove(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    public PagingSource<?, T> getPagingSource() {
        return this.pagingSource;
    }

    /* renamed from: getCoroutineScope$paging_common_release, reason: from getter */
    public final CoroutineScope getCoroutineScope() {
        return this.coroutineScope;
    }

    /* renamed from: getNotifyDispatcher$paging_common_release, reason: from getter */
    public final CoroutineDispatcher getNotifyDispatcher() {
        return this.notifyDispatcher;
    }

    public final PagedStorage<T> getStorage$paging_common_release() {
        return this.storage;
    }

    public final Config getConfig() {
        return this.config;
    }

    /* compiled from: PagedList.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u008d\u0001\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00020\u0014\"\b\b\u0001\u0010\u0004*\u00020\u0001\"\b\b\u0002\u0010\u0005*\u00020\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00062\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00018\u0001H\u0007¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m3636d2 = {"Landroidx/paging/PagedList$Companion;", "", "<init>", "()V", "K", "T", "Landroidx/paging/PagingSource;", "pagingSource", "Landroidx/paging/PagingSource$LoadResult$Page;", "initialPage", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lkotlinx/coroutines/CoroutineDispatcher;", "notifyDispatcher", "fetchDispatcher", "Landroidx/paging/PagedList$BoundaryCallback;", "boundaryCallback", "Landroidx/paging/PagedList$Config;", "config", "key", "Landroidx/paging/PagedList;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Landroidx/paging/PagingSource;Landroidx/paging/PagingSource$LoadResult$Page;Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Landroidx/paging/PagedList$BoundaryCallback;Landroidx/paging/PagedList$Config;Ljava/lang/Object;)Landroidx/paging/PagedList;", "paging-common_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final <K, T> PagedList<T> create(PagingSource<K, T> pagingSource, PagingSource.LoadResult.Page<K, T> initialPage, CoroutineScope coroutineScope, CoroutineDispatcher notifyDispatcher, CoroutineDispatcher fetchDispatcher, BoundaryCallback<T> boundaryCallback, Config config, K key) {
            K k;
            Intrinsics.checkNotNullParameter(pagingSource, "pagingSource");
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            Intrinsics.checkNotNullParameter(notifyDispatcher, "notifyDispatcher");
            Intrinsics.checkNotNullParameter(fetchDispatcher, "fetchDispatcher");
            Intrinsics.checkNotNullParameter(config, "config");
            if (initialPage == null) {
                k = key;
                initialPage = (PagingSource.LoadResult.Page) BuildersKt__BuildersKt.runBlocking$default(null, new PagedList2(pagingSource, new PagingSource.LoadParams.Refresh(k, config.initialLoadSizeHint, config.enablePlaceholders), null), 1, null);
            } else {
                k = key;
            }
            return new ContiguousPagedList(pagingSource, coroutineScope, notifyDispatcher, fetchDispatcher, boundaryCallback, config, initialPage, k);
        }
    }

    public PagedList(PagingSource<?, T> pagingSource, CoroutineScope coroutineScope, CoroutineDispatcher notifyDispatcher, PagedStorage<T> storage, Config config) {
        Intrinsics.checkNotNullParameter(pagingSource, "pagingSource");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(notifyDispatcher, "notifyDispatcher");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(config, "config");
        this.pagingSource = pagingSource;
        this.coroutineScope = coroutineScope;
        this.notifyDispatcher = notifyDispatcher;
        this.storage = storage;
        this.config = config;
        this.requiredRemainder = (config.prefetchDistance * 2) + config.pageSize;
        this.callbacks = new ArrayList();
        this.loadStateListeners = new ArrayList();
    }

    /* compiled from: PagedList.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \u000b2\u00020\u0001:\u0002\n\u000bB/\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tR\u0010\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Landroidx/paging/PagedList$Config;", "", "pageSize", "", "prefetchDistance", "enablePlaceholders", "", "initialLoadSizeHint", "maxSize", "(IIZII)V", "Builder", "Companion", "paging-common_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    public static final class Config {

        @JvmField
        public final boolean enablePlaceholders;

        @JvmField
        public final int initialLoadSizeHint;

        @JvmField
        public final int maxSize;

        @JvmField
        public final int pageSize;

        @JvmField
        public final int prefetchDistance;

        public Config(int i, int i2, boolean z, int i3, int i4) {
            this.pageSize = i;
            this.prefetchDistance = i2;
            this.enablePlaceholders = z;
            this.initialLoadSizeHint = i3;
            this.maxSize = i4;
        }

        /* compiled from: PagedList.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00002\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u000bR\u0016\u0010\f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0016\u0010\r\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u000b¨\u0006\u0013"}, m3636d2 = {"Landroidx/paging/PagedList$Config$Builder;", "", "<init>", "()V", "", "pageSize", "setPageSize", "(I)Landroidx/paging/PagedList$Config$Builder;", "Landroidx/paging/PagedList$Config;", "build", "()Landroidx/paging/PagedList$Config;", "I", "prefetchDistance", "initialLoadSizeHint", "", "enablePlaceholders", "Z", "maxSize", "Companion", "paging-common_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
        public static final class Builder {
            private int pageSize = -1;
            private int prefetchDistance = -1;
            private int initialLoadSizeHint = -1;
            private boolean enablePlaceholders = true;
            private int maxSize = Integer.MAX_VALUE;

            public final Builder setPageSize(int pageSize) {
                if (pageSize < 1) {
                    throw new IllegalArgumentException("Page size must be a positive number");
                }
                this.pageSize = pageSize;
                return this;
            }

            public final Config build() {
                if (this.prefetchDistance < 0) {
                    this.prefetchDistance = this.pageSize;
                }
                if (this.initialLoadSizeHint < 0) {
                    this.initialLoadSizeHint = this.pageSize * 3;
                }
                if (!this.enablePlaceholders && this.prefetchDistance == 0) {
                    throw new IllegalArgumentException("Placeholders and prefetch are the only ways to trigger loading of more data in the PagedList, so either placeholders must be enabled, or prefetch distance must be > 0.");
                }
                int i = this.maxSize;
                if (i == Integer.MAX_VALUE || i >= this.pageSize + (this.prefetchDistance * 2)) {
                    return new Config(this.pageSize, this.prefetchDistance, this.enablePlaceholders, this.initialLoadSizeHint, this.maxSize);
                }
                throw new IllegalArgumentException("Maximum size must be at least pageSize + 2*prefetchDist, pageSize=" + this.pageSize + ", prefetchDist=" + this.prefetchDistance + ", maxSize=" + this.maxSize);
            }
        }
    }

    /* compiled from: PagedList.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H'¢\u0006\u0004\b\u000b\u0010\nJ'\u0010\u000e\u001a\u00020\b2\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\f¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0016\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\"\u0010\u0019\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015¨\u0006\u001c"}, m3636d2 = {"Landroidx/paging/PagedList$LoadStateManager;", "", "<init>", "()V", "Landroidx/paging/LoadType;", "type", "Landroidx/paging/LoadState;", "state", "", "setState", "(Landroidx/paging/LoadType;Landroidx/paging/LoadState;)V", "onStateChanged", "Lkotlin/Function2;", "callback", "dispatchCurrentLoadState", "(Lkotlin/jvm/functions/Function2;)V", "refreshState", "Landroidx/paging/LoadState;", "getRefreshState", "()Landroidx/paging/LoadState;", "setRefreshState", "(Landroidx/paging/LoadState;)V", "startState", "getStartState", "setStartState", "endState", "getEndState", "setEndState", "paging-common_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    public static abstract class LoadStateManager {
        private LoadState endState;
        private LoadState refreshState;
        private LoadState startState;

        /* compiled from: PagedList.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[LoadType.values().length];
                try {
                    iArr[LoadType.REFRESH.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[LoadType.PREPEND.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[LoadType.APPEND.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public abstract void onStateChanged(LoadType type2, LoadState state);

        public LoadStateManager() {
            LoadState.NotLoading.Companion companion = LoadState.NotLoading.INSTANCE;
            this.refreshState = companion.getIncomplete$paging_common_release();
            this.startState = companion.getIncomplete$paging_common_release();
            this.endState = companion.getIncomplete$paging_common_release();
        }

        public final LoadState getStartState() {
            return this.startState;
        }

        public final LoadState getEndState() {
            return this.endState;
        }

        public final void setState(LoadType type2, LoadState state) {
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(state, "state");
            int i = WhenMappings.$EnumSwitchMapping$0[type2.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        if (Intrinsics.areEqual(this.endState, state)) {
                            return;
                        } else {
                            this.endState = state;
                        }
                    }
                } else if (Intrinsics.areEqual(this.startState, state)) {
                    return;
                } else {
                    this.startState = state;
                }
            } else if (Intrinsics.areEqual(this.refreshState, state)) {
                return;
            } else {
                this.refreshState = state;
            }
            onStateChanged(type2, state);
        }

        public final void dispatchCurrentLoadState(Function2<? super LoadType, ? super LoadState, Unit> callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            callback.invoke(LoadType.REFRESH, this.refreshState);
            callback.invoke(LoadType.PREPEND, this.startState);
            callback.invoke(LoadType.APPEND, this.endState);
        }
    }

    public final PlaceholderPaddedList<T> getPlaceholderPaddedList() {
        return this.storage;
    }

    public final int lastLoad() {
        return this.storage.getLastLoadAroundIndex();
    }

    /* renamed from: getRequiredRemainder$paging_common_release, reason: from getter */
    public final int getRequiredRemainder() {
        return this.requiredRemainder;
    }

    public int getSize() {
        return this.storage.size();
    }

    /* renamed from: isImmutable */
    public boolean getIsImmutable() {
        return getIsDetached();
    }

    public final void setRetryCallback(Runnable refreshRetryCallback) {
        this.refreshRetryCallback = refreshRetryCallback;
    }

    public final void dispatchStateChangeAsync$paging_common_release(LoadType type2, LoadState state) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(state, "state");
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, this.notifyDispatcher, null, new PagedList3(this, type2, state, null), 2, null);
    }

    @Override // java.util.AbstractList, java.util.List
    public T get(int index) {
        return this.storage.get(index);
    }

    public final void loadAround(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size());
        }
        this.storage.setLastLoadAroundIndex(index);
        loadAroundInternal(index);
    }

    public final List<T> snapshot() {
        return getIsImmutable() ? this : new SnapshotPagedList(this);
    }

    public final void addWeakLoadStateListener(Function2<? super LoadType, ? super LoadState, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        CollectionsKt.removeAll((List) this.loadStateListeners, (Function1) new Function1<WeakReference<Function2<? super LoadType, ? super LoadState, ? extends Unit>>, Boolean>() { // from class: androidx.paging.PagedList.addWeakLoadStateListener.1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Boolean invoke2(WeakReference<Function2<LoadType, LoadState, Unit>> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.get() == null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(WeakReference<Function2<? super LoadType, ? super LoadState, ? extends Unit>> weakReference) {
                return invoke2((WeakReference<Function2<LoadType, LoadState, Unit>>) weakReference);
            }
        });
        this.loadStateListeners.add(new WeakReference<>(listener));
        dispatchCurrentLoadState(listener);
    }

    public final void removeWeakLoadStateListener(final Function2<? super LoadType, ? super LoadState, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        CollectionsKt.removeAll((List) this.loadStateListeners, (Function1) new Function1<WeakReference<Function2<? super LoadType, ? super LoadState, ? extends Unit>>, Boolean>() { // from class: androidx.paging.PagedList.removeWeakLoadStateListener.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Boolean invoke2(WeakReference<Function2<LoadType, LoadState, Unit>> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.get() == null || it.get() == listener);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(WeakReference<Function2<? super LoadType, ? super LoadState, ? extends Unit>> weakReference) {
                return invoke2((WeakReference<Function2<LoadType, LoadState, Unit>>) weakReference);
            }
        });
    }

    public final void addWeakCallback(Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        CollectionsKt.removeAll((List) this.callbacks, (Function1) new Function1<WeakReference<Callback>, Boolean>() { // from class: androidx.paging.PagedList.addWeakCallback.1
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(WeakReference<Callback> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.get() == null);
            }
        });
        this.callbacks.add(new WeakReference<>(callback));
    }

    public final void removeWeakCallback(final Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        CollectionsKt.removeAll((List) this.callbacks, (Function1) new Function1<WeakReference<Callback>, Boolean>() { // from class: androidx.paging.PagedList.removeWeakCallback.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(WeakReference<Callback> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.get() == null || it.get() == callback);
            }
        });
    }

    public final void notifyInserted$paging_common_release(int position, int count) {
        if (count == 0) {
            return;
        }
        Iterator<T> it = CollectionsKt.reversed(this.callbacks).iterator();
        while (it.hasNext()) {
            Callback callback = (Callback) ((WeakReference) it.next()).get();
            if (callback != null) {
                callback.onInserted(position, count);
            }
        }
    }

    public final void notifyChanged(int position, int count) {
        if (count == 0) {
            return;
        }
        Iterator<T> it = CollectionsKt.reversed(this.callbacks).iterator();
        while (it.hasNext()) {
            Callback callback = (Callback) ((WeakReference) it.next()).get();
            if (callback != null) {
                callback.onChanged(position, count);
            }
        }
    }

    public final void notifyRemoved(int position, int count) {
        if (count == 0) {
            return;
        }
        Iterator<T> it = CollectionsKt.reversed(this.callbacks).iterator();
        while (it.hasNext()) {
            Callback callback = (Callback) ((WeakReference) it.next()).get();
            if (callback != null) {
                callback.onRemoved(position, count);
            }
        }
    }
}
