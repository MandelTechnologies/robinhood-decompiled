package androidx.paging;

import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.paging.DataSource;
import androidx.paging.PagedList;
import androidx.paging.RxPagedListBuilder;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Scheduler;
import io.reactivex.functions.Cancellable;
import java.util.concurrent.Executor;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope3;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.rx2.RxScheduler4;

/* compiled from: RxPagedListBuilder.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u0001*B%\b\u0017\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB%\b\u0017\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\fJ)\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00160\u0015¢\u0006\u0004\b\u0017\u0010\u0018R(\u0010\u001b\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001a\u0018\u00010\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\"\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u0012\u0004\b\u001f\u0010 R\u0018\u0010!\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010&\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010(\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010%R\u0018\u0010)\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010'¨\u0006+"}, m3636d2 = {"Landroidx/paging/RxPagedListBuilder;", "", "Key", "Value", "Landroidx/paging/DataSource$Factory;", "dataSourceFactory", "Landroidx/paging/PagedList$Config;", "config", "<init>", "(Landroidx/paging/DataSource$Factory;Landroidx/paging/PagedList$Config;)V", "", "pageSize", "(Landroidx/paging/DataSource$Factory;I)V", "Landroidx/paging/PagedList$BoundaryCallback;", "boundaryCallback", "setBoundaryCallback", "(Landroidx/paging/PagedList$BoundaryCallback;)Landroidx/paging/RxPagedListBuilder;", "Lio/reactivex/Scheduler;", "scheduler", "setFetchScheduler", "(Lio/reactivex/Scheduler;)Landroidx/paging/RxPagedListBuilder;", "Lio/reactivex/Observable;", "Landroidx/paging/PagedList;", "buildObservable", "()Lio/reactivex/Observable;", "Lkotlin/Function0;", "Landroidx/paging/PagingSource;", "pagingSourceFactory", "Lkotlin/jvm/functions/Function0;", "Landroidx/paging/DataSource$Factory;", "Landroidx/paging/PagedList$Config;", "getConfig$annotations", "()V", "initialLoadKey", "Ljava/lang/Object;", "Lkotlinx/coroutines/CoroutineDispatcher;", "notifyDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "notifyScheduler", "Lio/reactivex/Scheduler;", "fetchDispatcher", "fetchScheduler", "PagingObservableOnSubscribe", "paging-rxjava2_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
@Deprecated
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class RxPagedListBuilder<Key, Value> {
    private final PagedList.Config config;
    private final DataSource.Factory<Key, Value> dataSourceFactory;
    private CoroutineDispatcher fetchDispatcher;
    private Scheduler fetchScheduler;
    private Key initialLoadKey;
    private CoroutineDispatcher notifyDispatcher;
    private Scheduler notifyScheduler;
    private final Function0<PagingSource<Key, Value>> pagingSourceFactory;

    public final RxPagedListBuilder<Key, Value> setBoundaryCallback(PagedList.BoundaryCallback<Value> boundaryCallback) {
        return this;
    }

    @Deprecated
    public RxPagedListBuilder(DataSource.Factory<Key, Value> dataSourceFactory, PagedList.Config config) {
        Intrinsics.checkNotNullParameter(dataSourceFactory, "dataSourceFactory");
        Intrinsics.checkNotNullParameter(config, "config");
        this.pagingSourceFactory = null;
        this.dataSourceFactory = dataSourceFactory;
        this.config = config;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public RxPagedListBuilder(DataSource.Factory<Key, Value> dataSourceFactory, int i) {
        this(dataSourceFactory, new PagedList.Config.Builder().setPageSize(i).build());
        Intrinsics.checkNotNullParameter(dataSourceFactory, "dataSourceFactory");
    }

    public final RxPagedListBuilder<Key, Value> setFetchScheduler(Scheduler scheduler) {
        Intrinsics.checkNotNullParameter(scheduler, "scheduler");
        this.fetchScheduler = scheduler;
        this.fetchDispatcher = RxScheduler4.asCoroutineDispatcher(scheduler);
        return this;
    }

    public final Observable<PagedList<Value>> buildObservable() {
        Scheduler scheduledExecutor = this.notifyScheduler;
        if (scheduledExecutor == null) {
            Executor mainThreadExecutor = ArchTaskExecutor.getMainThreadExecutor();
            Intrinsics.checkNotNullExpressionValue(mainThreadExecutor, "getMainThreadExecutor()");
            scheduledExecutor = new ScheduledExecutor(mainThreadExecutor);
        }
        CoroutineDispatcher coroutineDispatcherAsCoroutineDispatcher = this.notifyDispatcher;
        if (coroutineDispatcherAsCoroutineDispatcher == null) {
            coroutineDispatcherAsCoroutineDispatcher = RxScheduler4.asCoroutineDispatcher(scheduledExecutor);
        }
        CoroutineDispatcher coroutineDispatcher = coroutineDispatcherAsCoroutineDispatcher;
        Scheduler scheduledExecutor2 = this.fetchScheduler;
        if (scheduledExecutor2 == null) {
            Executor iOThreadExecutor = ArchTaskExecutor.getIOThreadExecutor();
            Intrinsics.checkNotNullExpressionValue(iOThreadExecutor, "getIOThreadExecutor()");
            scheduledExecutor2 = new ScheduledExecutor(iOThreadExecutor);
        }
        CoroutineDispatcher coroutineDispatcherAsCoroutineDispatcher2 = this.fetchDispatcher;
        if (coroutineDispatcherAsCoroutineDispatcher2 == null) {
            coroutineDispatcherAsCoroutineDispatcher2 = RxScheduler4.asCoroutineDispatcher(scheduledExecutor2);
        }
        CoroutineDispatcher coroutineDispatcher2 = coroutineDispatcherAsCoroutineDispatcher2;
        Function0<PagingSource<Key, Value>> function0AsPagingSourceFactory = this.pagingSourceFactory;
        if (function0AsPagingSourceFactory == null) {
            DataSource.Factory<Key, Value> factory = this.dataSourceFactory;
            function0AsPagingSourceFactory = factory != null ? factory.asPagingSourceFactory(coroutineDispatcher2) : null;
        }
        Function0<PagingSource<Key, Value>> function0 = function0AsPagingSourceFactory;
        if (function0 == null) {
            throw new IllegalStateException("RxPagedList cannot be built without a PagingSourceFactory or DataSource.Factory");
        }
        Observable<PagedList<Value>> observableSubscribeOn = Observable.create(new PagingObservableOnSubscribe(this.initialLoadKey, this.config, null, function0, coroutineDispatcher, coroutineDispatcher2)).observeOn(scheduledExecutor).subscribeOn(scheduledExecutor2);
        Intrinsics.checkNotNullExpressionValue(observableSubscribeOn, "create(\n                …bscribeOn(fetchScheduler)");
        return observableSubscribeOn;
    }

    /* compiled from: RxPagedListBuilder.kt */
    @Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u0001*\b\b\u0003\u0010\u0003*\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\u00050\u00042\u00020\u0006BS\u0012\b\u0010\u0007\u001a\u0004\u0018\u00018\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0003\u0018\u00010\n\u0012\u0018\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\r0\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J+\u0010\u001b\u001a\u00020\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00030\u00052\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00030\u0005H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001f\u001a\u00020\u00162\u0012\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\u00050\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0016H\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010#R&\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010$R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010%R\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010%R\u0016\u0010&\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u001c\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00030\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\"\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\u00050\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010-R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00160\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010$R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00062"}, m3636d2 = {"Landroidx/paging/RxPagedListBuilder$PagingObservableOnSubscribe;", "", "Key", "Value", "Lio/reactivex/ObservableOnSubscribe;", "Landroidx/paging/PagedList;", "Lio/reactivex/functions/Cancellable;", "initialLoadKey", "Landroidx/paging/PagedList$Config;", "config", "Landroidx/paging/PagedList$BoundaryCallback;", "boundaryCallback", "Lkotlin/Function0;", "Landroidx/paging/PagingSource;", "pagingSourceFactory", "Lkotlinx/coroutines/CoroutineDispatcher;", "notifyDispatcher", "fetchDispatcher", "<init>", "(Ljava/lang/Object;Landroidx/paging/PagedList$Config;Landroidx/paging/PagedList$BoundaryCallback;Lkotlin/jvm/functions/Function0;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;)V", "", "force", "", "invalidate", "(Z)V", "previous", "next", "onItemUpdate", "(Landroidx/paging/PagedList;Landroidx/paging/PagedList;)V", "Lio/reactivex/ObservableEmitter;", "emitter", "subscribe", "(Lio/reactivex/ObservableEmitter;)V", "cancel", "()V", "Landroidx/paging/PagedList$Config;", "Lkotlin/jvm/functions/Function0;", "Lkotlinx/coroutines/CoroutineDispatcher;", "firstSubscribe", "Z", "currentData", "Landroidx/paging/PagedList;", "Lkotlinx/coroutines/Job;", "currentJob", "Lkotlinx/coroutines/Job;", "Lio/reactivex/ObservableEmitter;", "callback", "Ljava/lang/Runnable;", "refreshRetryCallback", "Ljava/lang/Runnable;", "paging-rxjava2_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    public static final class PagingObservableOnSubscribe<Key, Value> implements ObservableOnSubscribe<PagedList<Value>>, Cancellable {
        private final Function0<Unit> callback;
        private final PagedList.Config config;
        private PagedList<Value> currentData;
        private Job currentJob;
        private ObservableEmitter<PagedList<Value>> emitter;
        private final CoroutineDispatcher fetchDispatcher;
        private boolean firstSubscribe;
        private final CoroutineDispatcher notifyDispatcher;
        private final Function0<PagingSource<Key, Value>> pagingSourceFactory;
        private final Runnable refreshRetryCallback;

        /* JADX WARN: Multi-variable type inference failed */
        public PagingObservableOnSubscribe(Key key, PagedList.Config config, PagedList.BoundaryCallback<Value> boundaryCallback, Function0<? extends PagingSource<Key, Value>> pagingSourceFactory, CoroutineDispatcher notifyDispatcher, CoroutineDispatcher fetchDispatcher) {
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
            Intrinsics.checkNotNullParameter(notifyDispatcher, "notifyDispatcher");
            Intrinsics.checkNotNullParameter(fetchDispatcher, "fetchDispatcher");
            this.config = config;
            this.pagingSourceFactory = pagingSourceFactory;
            this.notifyDispatcher = notifyDispatcher;
            this.fetchDispatcher = fetchDispatcher;
            this.firstSubscribe = true;
            this.callback = new Function0<Unit>(this) { // from class: androidx.paging.RxPagedListBuilder$PagingObservableOnSubscribe$callback$1
                final /* synthetic */ RxPagedListBuilder.PagingObservableOnSubscribe<Key, Value> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                    this.this$0 = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.this$0.invalidate(true);
                }
            };
            Runnable runnable = new Runnable() { // from class: androidx.paging.RxPagedListBuilder$PagingObservableOnSubscribe$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    RxPagedListBuilder.PagingObservableOnSubscribe.refreshRetryCallback$lambda$0(this.f$0);
                }
            };
            this.refreshRetryCallback = runnable;
            InitialPagedList initialPagedList = new InitialPagedList(CoroutineScope3.INSTANCE, notifyDispatcher, fetchDispatcher, config, key);
            this.currentData = initialPagedList;
            initialPagedList.setRetryCallback(runnable);
        }

        public static final /* synthetic */ PagedList.BoundaryCallback access$getBoundaryCallback$p(PagingObservableOnSubscribe pagingObservableOnSubscribe) {
            pagingObservableOnSubscribe.getClass();
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void refreshRetryCallback$lambda$0(PagingObservableOnSubscribe this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.invalidate(true);
        }

        @Override // io.reactivex.ObservableOnSubscribe
        public void subscribe(ObservableEmitter<PagedList<Value>> emitter) {
            Intrinsics.checkNotNullParameter(emitter, "emitter");
            this.emitter = emitter;
            emitter.setCancellable(this);
            if (this.firstSubscribe) {
                emitter.onNext(this.currentData);
                this.firstSubscribe = false;
            }
            invalidate(false);
        }

        @Override // io.reactivex.functions.Cancellable
        public void cancel() {
            this.currentData.getPagingSource().unregisterInvalidatedCallback(this.callback);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void invalidate(boolean force) {
            Job job = this.currentJob;
            if (job == null || force) {
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, null, 1, null);
                }
                this.currentJob = BuildersKt__Builders_commonKt.launch$default(CoroutineScope3.INSTANCE, this.fetchDispatcher, null, new RxPagedListBuilder3(this, null), 2, null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void onItemUpdate(PagedList<Value> previous, PagedList<Value> next) {
            previous.setRetryCallback(null);
            next.setRetryCallback(this.refreshRetryCallback);
        }
    }
}
