package androidx.room.paging;

import androidx.paging.PagingSource;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomDatabaseKt;
import androidx.room.RoomRawQuery;
import androidx.room.Transactor;
import androidx.room.Transactor3;
import androidx.room.paging.util.RoomPagingUtil;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: LimitOffsetPagingSource.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 (*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002:\u0001(BU\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012.\u0010\b\u001a*\b\u0001\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ(\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u00000 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000b0\"H\u0086@¢\u0006\u0002\u0010#J(\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u00000 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000b0\"H\u0082@¢\u0006\u0002\u0010#J0\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u00000 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000b0\"2\u0006\u0010&\u001a\u00020\u000bH\u0082@¢\u0006\u0002\u0010'R\u0018\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0010R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R8\u0010\b\u001a*\b\u0001\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u00020\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0015\u001a\u00060\u0016j\u0002`\u0017X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0012\u0010\u001a\u001a\u00060\u001bj\u0002`\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, m3636d2 = {"Landroidx/room/paging/CommonLimitOffsetImpl;", "Value", "", "tables", "", "", "pagingSource", "Landroidx/room/paging/LimitOffsetPagingSource;", "convertRows", "Lkotlin/Function3;", "Landroidx/room/RoomRawQuery;", "", "Lkotlin/coroutines/Continuation;", "", "<init>", "([Ljava/lang/String;Landroidx/room/paging/LimitOffsetPagingSource;Lkotlin/jvm/functions/Function3;)V", "[Ljava/lang/String;", "Lkotlin/jvm/functions/Function3;", "db", "Landroidx/room/RoomDatabase;", "sourceQuery", "itemCount", "Ljava/util/concurrent/atomic/AtomicInteger;", "Landroidx/room/concurrent/AtomicInt;", "getItemCount$room_paging_release", "()Ljava/util/concurrent/atomic/AtomicInteger;", "invalidationFlowStarted", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Landroidx/room/concurrent/AtomicBoolean;", "invalidationFlowJob", "Lkotlinx/coroutines/Job;", AnalyticsStrings.NOTIF_STACK_EVENT_LOAD, "Landroidx/paging/PagingSource$LoadResult;", "params", "Landroidx/paging/PagingSource$LoadParams;", "(Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initialLoad", "nonInitialLoad", "tempCount", "(Landroidx/paging/PagingSource$LoadParams;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "room-paging_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: androidx.room.paging.CommonLimitOffsetImpl, reason: use source file name */
/* loaded from: classes4.dex */
public final class LimitOffsetPagingSource2<Value> {
    private static final PagingSource.LoadResult.Invalid<Object, Object> INVALID = new PagingSource.LoadResult.Invalid<>();
    private final Function3<RoomRawQuery, Integer, Continuation<? super List<? extends Value>>, Object> convertRows;
    private final RoomDatabase db;
    private Job invalidationFlowJob;
    private final AtomicBoolean invalidationFlowStarted;
    private final AtomicInteger itemCount;
    private final LimitOffsetPagingSource<Value> pagingSource;
    private final RoomRawQuery sourceQuery;
    private final String[] tables;

    /* compiled from: LimitOffsetPagingSource.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.room.paging.CommonLimitOffsetImpl", m3645f = "LimitOffsetPagingSource.kt", m3646l = {100, 102}, m3647m = AnalyticsStrings.NOTIF_STACK_EVENT_LOAD)
    /* renamed from: androidx.room.paging.CommonLimitOffsetImpl$load$1 */
    static final class C29141 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ LimitOffsetPagingSource2<Value> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C29141(LimitOffsetPagingSource2<Value> limitOffsetPagingSource2, Continuation<? super C29141> continuation) {
            super(continuation);
            this.this$0 = limitOffsetPagingSource2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.load(null, this);
        }
    }

    /* compiled from: LimitOffsetPagingSource.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.room.paging.CommonLimitOffsetImpl", m3645f = "LimitOffsetPagingSource.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE, 147}, m3647m = "nonInitialLoad")
    /* renamed from: androidx.room.paging.CommonLimitOffsetImpl$nonInitialLoad$1 */
    static final class C29161 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ LimitOffsetPagingSource2<Value> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C29161(LimitOffsetPagingSource2<Value> limitOffsetPagingSource2, Continuation<? super C29161> continuation) {
            super(continuation);
            this.this$0 = limitOffsetPagingSource2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.nonInitialLoad(null, 0, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LimitOffsetPagingSource2(String[] tables, LimitOffsetPagingSource<Value> pagingSource, Function3<? super RoomRawQuery, ? super Integer, ? super Continuation<? super List<? extends Value>>, ? extends Object> convertRows) {
        Intrinsics.checkNotNullParameter(tables, "tables");
        Intrinsics.checkNotNullParameter(pagingSource, "pagingSource");
        Intrinsics.checkNotNullParameter(convertRows, "convertRows");
        this.tables = tables;
        this.pagingSource = pagingSource;
        this.convertRows = convertRows;
        this.db = pagingSource.getDb();
        this.sourceQuery = pagingSource.getSourceQuery();
        this.itemCount = new AtomicInteger(-1);
        this.invalidationFlowStarted = new AtomicBoolean(false);
        pagingSource.registerInvalidatedCallback(new Function0() { // from class: androidx.room.paging.CommonLimitOffsetImpl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LimitOffsetPagingSource2._init_$lambda$0(this.f$0);
            }
        });
    }

    /* renamed from: getItemCount$room_paging_release, reason: from getter */
    public final AtomicInteger getItemCount() {
        return this.itemCount;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(LimitOffsetPagingSource2 limitOffsetPagingSource2) {
        Job job = limitOffsetPagingSource2.invalidationFlowJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0078, code lost:
    
        if (r13 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object load(PagingSource.LoadParams<Integer> loadParams, Continuation<? super PagingSource.LoadResult<Integer, Value>> continuation) {
        C29141 c29141;
        if (continuation instanceof C29141) {
            c29141 = (C29141) continuation;
            int i = c29141.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c29141.label = i - Integer.MIN_VALUE;
            } else {
                c29141 = new C29141(this, continuation);
            }
        }
        Object objNonInitialLoad = c29141.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c29141.label;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(objNonInitialLoad);
                    return (PagingSource.LoadResult) objNonInitialLoad;
                }
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objNonInitialLoad);
                return (PagingSource.LoadResult) objNonInitialLoad;
            }
            ResultKt.throwOnFailure(objNonInitialLoad);
            if (this.invalidationFlowStarted.compareAndSet(false, true)) {
                this.invalidationFlowJob = BuildersKt__Builders_commonKt.launch$default(this.db.getCoroutineScope(), null, null, new C29152(this, null), 3, null);
            }
            int i3 = this.itemCount.get();
            if (i3 == -1) {
                c29141.label = 1;
                objNonInitialLoad = initialLoad(loadParams, c29141);
                if (objNonInitialLoad == coroutine_suspended) {
                }
                return (PagingSource.LoadResult) objNonInitialLoad;
            }
            c29141.label = 2;
            objNonInitialLoad = nonInitialLoad(loadParams, i3, c29141);
            return coroutine_suspended;
        } catch (Exception e) {
            return new PagingSource.LoadResult.Error(e);
        }
    }

    /* compiled from: LimitOffsetPagingSource.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.room.paging.CommonLimitOffsetImpl$load$2", m3645f = "LimitOffsetPagingSource.kt", m3646l = {87}, m3647m = "invokeSuspend")
    /* renamed from: androidx.room.paging.CommonLimitOffsetImpl$load$2 */
    static final class C29152 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ LimitOffsetPagingSource2<Value> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C29152(LimitOffsetPagingSource2<Value> limitOffsetPagingSource2, Continuation<? super C29152> continuation) {
            super(2, continuation);
            this.this$0 = limitOffsetPagingSource2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C29152(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C29152) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                InvalidationTracker invalidationTracker = ((LimitOffsetPagingSource2) this.this$0).db.getInvalidationTracker();
                String[] strArr = ((LimitOffsetPagingSource2) this.this$0).tables;
                Flow<Set<String>> flowCreateFlow = invalidationTracker.createFlow((String[]) Arrays.copyOf(strArr, strArr.length), false);
                final LimitOffsetPagingSource2<Value> limitOffsetPagingSource2 = this.this$0;
                FlowCollector<? super Set<String>> flowCollector = new FlowCollector() { // from class: androidx.room.paging.CommonLimitOffsetImpl.load.2.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Set<String>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(Set<String> set, Continuation<? super Unit> continuation) {
                        if (!((LimitOffsetPagingSource2) limitOffsetPagingSource2).pagingSource.getInvalid()) {
                            ((LimitOffsetPagingSource2) limitOffsetPagingSource2).pagingSource.invalidate();
                            return Unit.INSTANCE;
                        }
                        throw new CancellationException("PagingSource is invalid");
                    }
                };
                this.label = 1;
                if (flowCreateFlow.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: LimitOffsetPagingSource.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n"}, m3636d2 = {"<anonymous>", "Landroidx/paging/PagingSource$LoadResult;", "", "Value", "", "connection", "Landroidx/room/Transactor;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.room.paging.CommonLimitOffsetImpl$initialLoad$2", m3645f = "LimitOffsetPagingSource.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: androidx.room.paging.CommonLimitOffsetImpl$initialLoad$2 */
    static final class C29132 extends ContinuationImpl7 implements Function2<Transactor, Continuation<? super PagingSource.LoadResult<Integer, Value>>, Object> {
        final /* synthetic */ PagingSource.LoadParams<Integer> $params;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ LimitOffsetPagingSource2<Value> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C29132(LimitOffsetPagingSource2<Value> limitOffsetPagingSource2, PagingSource.LoadParams<Integer> loadParams, Continuation<? super C29132> continuation) {
            super(2, continuation);
            this.this$0 = limitOffsetPagingSource2;
            this.$params = loadParams;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C29132 c29132 = new C29132(this.this$0, this.$params, continuation);
            c29132.L$0 = obj;
            return c29132;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Transactor transactor, Continuation<? super PagingSource.LoadResult<Integer, Value>> continuation) {
            return ((C29132) create(transactor, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: LimitOffsetPagingSource.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00030\u00010\u0005H\n"}, m3636d2 = {"<anonymous>", "Landroidx/paging/PagingSource$LoadResult;", "", "Value", "", "Landroidx/room/TransactionScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "androidx.room.paging.CommonLimitOffsetImpl$initialLoad$2$1", m3645f = "LimitOffsetPagingSource.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: androidx.room.paging.CommonLimitOffsetImpl$initialLoad$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Transactor3<PagingSource.LoadResult<Integer, Value>>, Continuation<? super PagingSource.LoadResult<Integer, Value>>, Object> {
            final /* synthetic */ PagingSource.LoadParams<Integer> $params;
            int label;
            final /* synthetic */ LimitOffsetPagingSource2<Value> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(LimitOffsetPagingSource2<Value> limitOffsetPagingSource2, PagingSource.LoadParams<Integer> loadParams, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = limitOffsetPagingSource2;
                this.$params = loadParams;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$params, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Transactor3<PagingSource.LoadResult<Integer, Value>> transactor3, Continuation<? super PagingSource.LoadResult<Integer, Value>> continuation) {
                return ((AnonymousClass1) create(transactor3, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    RoomRawQuery roomRawQuery = ((LimitOffsetPagingSource2) this.this$0).sourceQuery;
                    RoomDatabase roomDatabase = ((LimitOffsetPagingSource2) this.this$0).db;
                    this.label = 1;
                    obj = RoomPagingUtil.queryItemCount(roomRawQuery, roomDatabase, this);
                    if (obj != coroutine_suspended) {
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                ResultKt.throwOnFailure(obj);
                int iIntValue = ((Number) obj).intValue();
                this.this$0.getItemCount().set(iIntValue);
                PagingSource.LoadParams<Integer> loadParams = this.$params;
                RoomRawQuery roomRawQuery2 = ((LimitOffsetPagingSource2) this.this$0).sourceQuery;
                Function3 function3 = ((LimitOffsetPagingSource2) this.this$0).convertRows;
                this.label = 2;
                Object objQueryDatabase = RoomPagingUtil.queryDatabase(loadParams, roomRawQuery2, iIntValue, function3, this);
                return objQueryDatabase == coroutine_suspended ? coroutine_suspended : objQueryDatabase;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            Transactor transactor = (Transactor) this.L$0;
            Transactor.SQLiteTransactionType sQLiteTransactionType = Transactor.SQLiteTransactionType.DEFERRED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$params, null);
            this.label = 1;
            Object objWithTransaction = transactor.withTransaction(sQLiteTransactionType, anonymousClass1, this);
            return objWithTransaction == coroutine_suspended ? coroutine_suspended : objWithTransaction;
        }
    }

    private final Object initialLoad(PagingSource.LoadParams<Integer> loadParams, Continuation<? super PagingSource.LoadResult<Integer, Value>> continuation) {
        return RoomDatabaseKt.useReaderConnection(this.db, new C29132(this, loadParams, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0075, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(r8, r2, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object nonInitialLoad(PagingSource.LoadParams<Integer> loadParams, int i, Continuation<? super PagingSource.LoadResult<Integer, Value>> continuation) {
        C29161 c29161;
        LimitOffsetPagingSource2<Value> limitOffsetPagingSource2;
        PagingSource.LoadResult loadResult;
        if (continuation instanceof C29161) {
            c29161 = (C29161) continuation;
            int i2 = c29161.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c29161.label = i2 - Integer.MIN_VALUE;
            } else {
                c29161 = new C29161(this, continuation);
            }
        }
        Object objQueryDatabase = c29161.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c29161.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objQueryDatabase);
            RoomRawQuery roomRawQuery = this.sourceQuery;
            Function3<RoomRawQuery, Integer, Continuation<? super List<? extends Value>>, Object> function3 = this.convertRows;
            c29161.L$0 = this;
            c29161.label = 1;
            objQueryDatabase = RoomPagingUtil.queryDatabase(loadParams, roomRawQuery, i, function3, c29161);
            if (objQueryDatabase != coroutine_suspended) {
                limitOffsetPagingSource2 = this;
            }
            return coroutine_suspended;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            loadResult = (PagingSource.LoadResult) c29161.L$1;
            limitOffsetPagingSource2 = (LimitOffsetPagingSource2) c29161.L$0;
            ResultKt.throwOnFailure(objQueryDatabase);
            if (!limitOffsetPagingSource2.pagingSource.getInvalid()) {
                return loadResult;
            }
            PagingSource.LoadResult.Invalid<Object, Object> invalid = INVALID;
            Intrinsics.checkNotNull(invalid, "null cannot be cast to non-null type androidx.paging.PagingSource.LoadResult.Invalid<kotlin.Int, Value of androidx.room.paging.CommonLimitOffsetImpl>");
            return invalid;
        }
        LimitOffsetPagingSource2<Value> limitOffsetPagingSource22 = (LimitOffsetPagingSource2) c29161.L$0;
        ResultKt.throwOnFailure(objQueryDatabase);
        limitOffsetPagingSource2 = limitOffsetPagingSource22;
        loadResult = (PagingSource.LoadResult) objQueryDatabase;
        CoroutineContext coroutineContext = limitOffsetPagingSource2.db.getCoroutineScope().getCoroutineContext();
        C29172 c29172 = new C29172(limitOffsetPagingSource2, null);
        c29161.L$0 = limitOffsetPagingSource2;
        c29161.L$1 = loadResult;
        c29161.label = 2;
    }

    /* compiled from: LimitOffsetPagingSource.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.room.paging.CommonLimitOffsetImpl$nonInitialLoad$2", m3645f = "LimitOffsetPagingSource.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: androidx.room.paging.CommonLimitOffsetImpl$nonInitialLoad$2 */
    static final class C29172 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ LimitOffsetPagingSource2<Value> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C29172(LimitOffsetPagingSource2<Value> limitOffsetPagingSource2, Continuation<? super C29172> continuation) {
            super(2, continuation);
            this.this$0 = limitOffsetPagingSource2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C29172(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C29172) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                InvalidationTracker invalidationTracker = ((LimitOffsetPagingSource2) this.this$0).db.getInvalidationTracker();
                String[] strArr = ((LimitOffsetPagingSource2) this.this$0).tables;
                String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
                this.label = 1;
                obj = invalidationTracker.refresh(strArr2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                ((LimitOffsetPagingSource2) this.this$0).pagingSource.invalidate();
            }
            return Unit.INSTANCE;
        }
    }
}
