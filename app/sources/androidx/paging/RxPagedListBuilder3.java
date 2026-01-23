package androidx.paging;

import androidx.paging.LoadState;
import androidx.paging.PagingSource;
import androidx.paging.RxPagedListBuilder;
import io.reactivex.ObservableEmitter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope3;

/* compiled from: RxPagedListBuilder.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003\"\b\b\u0002\u0010\u0002*\u00020\u0003\"\b\b\u0003\u0010\u0004*\u00020\u0003*\u00020\u0005H\u008a@"}, m3636d2 = {"<anonymous>", "", "Key", "", "Value", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "androidx.paging.RxPagedListBuilder$PagingObservableOnSubscribe$invalidate$1", m3645f = "RxPagedListBuilder.kt", m3646l = {395, 402}, m3647m = "invokeSuspend")
/* renamed from: androidx.paging.RxPagedListBuilder$PagingObservableOnSubscribe$invalidate$1, reason: use source file name */
/* loaded from: classes4.dex */
final class RxPagedListBuilder3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ RxPagedListBuilder.PagingObservableOnSubscribe<Key, Value> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RxPagedListBuilder3(RxPagedListBuilder.PagingObservableOnSubscribe<Key, Value> pagingObservableOnSubscribe, Continuation<? super RxPagedListBuilder3> continuation) {
        super(2, continuation);
        this.this$0 = pagingObservableOnSubscribe;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RxPagedListBuilder3(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RxPagedListBuilder3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c2  */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        PagingSource pagingSource;
        Object obj2;
        PagingSource.LoadResult loadResult;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        ObservableEmitter observableEmitter = null;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ((RxPagedListBuilder.PagingObservableOnSubscribe) this.this$0).currentData.getPagingSource().unregisterInvalidatedCallback(((RxPagedListBuilder.PagingObservableOnSubscribe) this.this$0).callback);
            PagingSource pagingSource2 = (PagingSource) ((RxPagedListBuilder.PagingObservableOnSubscribe) this.this$0).pagingSourceFactory.invoke();
            pagingSource2.registerInvalidatedCallback(((RxPagedListBuilder.PagingObservableOnSubscribe) this.this$0).callback);
            if (pagingSource2 instanceof LegacyPagingSource) {
                ((LegacyPagingSource) pagingSource2).setPageSize(((RxPagedListBuilder.PagingObservableOnSubscribe) this.this$0).config.pageSize);
            }
            CoroutineDispatcher coroutineDispatcher = ((RxPagedListBuilder.PagingObservableOnSubscribe) this.this$0).notifyDispatcher;
            C27851 c27851 = new C27851(this.this$0, null);
            this.L$0 = pagingSource2;
            this.label = 1;
            if (BuildersKt.withContext(coroutineDispatcher, c27851, this) != coroutine_suspended) {
                pagingSource = pagingSource2;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object obj3 = this.L$1;
            pagingSource = (PagingSource) this.L$0;
            ResultKt.throwOnFailure(obj);
            obj2 = obj3;
            PagingSource pagingSource3 = pagingSource;
            loadResult = (PagingSource.LoadResult) obj;
            if (!(loadResult instanceof PagingSource.LoadResult.Invalid)) {
                ((RxPagedListBuilder.PagingObservableOnSubscribe) this.this$0).currentData.setInitialLoadState(LoadType.REFRESH, new LoadState.NotLoading(false));
                pagingSource3.invalidate();
            } else if (loadResult instanceof PagingSource.LoadResult.Error) {
                ((RxPagedListBuilder.PagingObservableOnSubscribe) this.this$0).currentData.setInitialLoadState(LoadType.REFRESH, new LoadState.Error(((PagingSource.LoadResult.Error) loadResult).getThrowable()));
            } else if (loadResult instanceof PagingSource.LoadResult.Page) {
                CoroutineScope3 coroutineScope3 = CoroutineScope3.INSTANCE;
                CoroutineDispatcher coroutineDispatcher2 = ((RxPagedListBuilder.PagingObservableOnSubscribe) this.this$0).notifyDispatcher;
                CoroutineDispatcher coroutineDispatcher3 = ((RxPagedListBuilder.PagingObservableOnSubscribe) this.this$0).fetchDispatcher;
                RxPagedListBuilder.PagingObservableOnSubscribe.access$getBoundaryCallback$p(this.this$0);
                PagedList pagedListCreate = PagedList.INSTANCE.create(pagingSource3, (PagingSource.LoadResult.Page) loadResult, coroutineScope3, coroutineDispatcher2, coroutineDispatcher3, null, ((RxPagedListBuilder.PagingObservableOnSubscribe) this.this$0).config, obj2);
                RxPagedListBuilder.PagingObservableOnSubscribe<Key, Value> pagingObservableOnSubscribe = this.this$0;
                pagingObservableOnSubscribe.onItemUpdate(((RxPagedListBuilder.PagingObservableOnSubscribe) pagingObservableOnSubscribe).currentData, pagedListCreate);
                ((RxPagedListBuilder.PagingObservableOnSubscribe) this.this$0).currentData = pagedListCreate;
                ObservableEmitter observableEmitter2 = ((RxPagedListBuilder.PagingObservableOnSubscribe) this.this$0).emitter;
                if (observableEmitter2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("emitter");
                } else {
                    observableEmitter = observableEmitter2;
                }
                observableEmitter.onNext(pagedListCreate);
            }
            return Unit.INSTANCE;
        }
        pagingSource = (PagingSource) this.L$0;
        ResultKt.throwOnFailure(obj);
        Object lastKey = ((RxPagedListBuilder.PagingObservableOnSubscribe) this.this$0).currentData.getLastKey();
        PagingSource.LoadParams refreshLoadParams = PagedList4.toRefreshLoadParams(((RxPagedListBuilder.PagingObservableOnSubscribe) this.this$0).config, lastKey);
        this.L$0 = pagingSource;
        this.L$1 = lastKey;
        this.label = 2;
        Object objLoad = pagingSource.load(refreshLoadParams, this);
        if (objLoad != coroutine_suspended) {
            obj2 = lastKey;
            obj = objLoad;
            PagingSource pagingSource32 = pagingSource;
            loadResult = (PagingSource.LoadResult) obj;
            if (!(loadResult instanceof PagingSource.LoadResult.Invalid)) {
            }
            return Unit.INSTANCE;
        }
        return coroutine_suspended;
    }

    /* compiled from: RxPagedListBuilder.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003\"\b\b\u0002\u0010\u0002*\u00020\u0003\"\b\b\u0003\u0010\u0004*\u00020\u0003*\u00020\u0005H\u008a@"}, m3636d2 = {"<anonymous>", "", "Key", "", "Value", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.paging.RxPagedListBuilder$PagingObservableOnSubscribe$invalidate$1$1", m3645f = "RxPagedListBuilder.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: androidx.paging.RxPagedListBuilder$PagingObservableOnSubscribe$invalidate$1$1 */
    static final class C27851 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ RxPagedListBuilder.PagingObservableOnSubscribe<Key, Value> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C27851(RxPagedListBuilder.PagingObservableOnSubscribe<Key, Value> pagingObservableOnSubscribe, Continuation<? super C27851> continuation) {
            super(2, continuation);
            this.this$0 = pagingObservableOnSubscribe;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C27851(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C27851) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                ((RxPagedListBuilder.PagingObservableOnSubscribe) this.this$0).currentData.setInitialLoadState(LoadType.REFRESH, LoadState.Loading.INSTANCE);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
