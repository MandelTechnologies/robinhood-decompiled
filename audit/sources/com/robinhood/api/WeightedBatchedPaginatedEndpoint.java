package com.robinhood.api;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.coroutines.flow.Operators;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.PaginationCursor;
import com.robinhood.utils.LogoutKillswitch;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: PaginatedEndpoint.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0004\u0012\u0004\u0012\u0002H\u00020\u0003BY\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012,\u0010\u000b\u001a(\u0012\u0018\u0012\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000f0\f¢\u0006\u0004\b\u0010\u0010\u0011J\"\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000f0\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016J\"\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000f0\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016J\u001e\u0010\u0018\u001a\u00020\u00192\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u001a\u001a\u00020\u001bH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R:\u0010\u000b\u001a(\u0012\u0018\u0012\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000f0\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/api/WeightedBatchedPaginatedEndpoint;", "P", "T", "Lcom/robinhood/api/RealPaginatedEndpoint;", "", "maxWeightPerBatch", "", "weight", "Lkotlin/Function1;", "logoutKillswitch", "Lcom/robinhood/utils/LogoutKillswitch;", "endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lkotlin/Pair;", "Lcom/robinhood/models/PaginationCursor;", "Lcom/robinhood/models/PaginatedResult;", "<init>", "(ILkotlin/jvm/functions/Function1;Lcom/robinhood/utils/LogoutKillswitch;Lcom/robinhood/android/moria/network/Endpoint;)V", "getEndpoint", "()Lcom/robinhood/android/moria/network/Endpoint;", "fetchAllPages", "Lkotlinx/coroutines/flow/Flow;", "params", "forceFetchAllPages", "refreshAllPages", "Lkotlinx/coroutines/Job;", "force", "", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
final class WeightedBatchedPaginatedEndpoint<P, T> extends RealPaginatedEndpoint<Iterable<? extends P>, T> {
    private final Endpoint<Tuples2<Iterable<P>, PaginationCursor>, PaginatedResult<T>> endpoint;
    private final LogoutKillswitch logoutKillswitch;
    private final int maxWeightPerBatch;
    private final Function1<P, Integer> weight;

    @Override // com.robinhood.api.RealPaginatedEndpoint, com.robinhood.api.PaginatedEndpoint
    public Endpoint<Tuples2<Iterable<P>, PaginationCursor>, PaginatedResult<T>> getEndpoint() {
        return this.endpoint;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WeightedBatchedPaginatedEndpoint(int i, Function1<? super P, Integer> weight, LogoutKillswitch logoutKillswitch, Endpoint<Tuples2<Iterable<P>, PaginationCursor>, PaginatedResult<T>> endpoint) {
        super(logoutKillswitch, endpoint);
        Intrinsics.checkNotNullParameter(weight, "weight");
        Intrinsics.checkNotNullParameter(logoutKillswitch, "logoutKillswitch");
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        this.maxWeightPerBatch = i;
        this.weight = weight;
        this.logoutKillswitch = logoutKillswitch;
        this.endpoint = endpoint;
    }

    @Override // com.robinhood.api.RealPaginatedEndpoint, com.robinhood.api.PaginatedEndpoint
    public Flow<PaginatedResult<T>> fetchAllPages(Iterable<? extends P> params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return FlowKt.flatMapConcat(Operators.chunked(FlowKt.asFlow(params), this.maxWeightPerBatch, this.weight), new C315831(this, null));
    }

    /* compiled from: PaginatedEndpoint.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0006H\n"}, m3636d2 = {"<anonymous>", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/models/PaginatedResult;", "T", "P", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.api.WeightedBatchedPaginatedEndpoint$fetchAllPages$1", m3645f = "PaginatedEndpoint.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.api.WeightedBatchedPaginatedEndpoint$fetchAllPages$1 */
    static final class C315831 extends ContinuationImpl7 implements Function2<List<? extends P>, Continuation<? super Flow<? extends PaginatedResult<? extends T>>>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ WeightedBatchedPaginatedEndpoint<P, T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C315831(WeightedBatchedPaginatedEndpoint<P, T> weightedBatchedPaginatedEndpoint, Continuation<? super C315831> continuation) {
            super(2, continuation);
            this.this$0 = weightedBatchedPaginatedEndpoint;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C315831 c315831 = new C315831(this.this$0, continuation);
            c315831.L$0 = obj;
            return c315831;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(List<? extends P> list, Continuation<? super Flow<? extends PaginatedResult<? extends T>>> continuation) {
            return ((C315831) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return WeightedBatchedPaginatedEndpoint.super.fetchAllPages((WeightedBatchedPaginatedEndpoint<P, T>) this.L$0);
        }
    }

    @Override // com.robinhood.api.RealPaginatedEndpoint, com.robinhood.api.PaginatedEndpoint
    public Flow<PaginatedResult<T>> forceFetchAllPages(Iterable<? extends P> params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return FlowKt.flatMapConcat(Operators.chunked(FlowKt.asFlow(params), this.maxWeightPerBatch, this.weight), new C315841(this, null));
    }

    /* compiled from: PaginatedEndpoint.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0006H\n"}, m3636d2 = {"<anonymous>", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/models/PaginatedResult;", "T", "P", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.api.WeightedBatchedPaginatedEndpoint$forceFetchAllPages$1", m3645f = "PaginatedEndpoint.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.api.WeightedBatchedPaginatedEndpoint$forceFetchAllPages$1 */
    static final class C315841 extends ContinuationImpl7 implements Function2<List<? extends P>, Continuation<? super Flow<? extends PaginatedResult<? extends T>>>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ WeightedBatchedPaginatedEndpoint<P, T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C315841(WeightedBatchedPaginatedEndpoint<P, T> weightedBatchedPaginatedEndpoint, Continuation<? super C315841> continuation) {
            super(2, continuation);
            this.this$0 = weightedBatchedPaginatedEndpoint;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C315841 c315841 = new C315841(this.this$0, continuation);
            c315841.L$0 = obj;
            return c315841;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(List<? extends P> list, Continuation<? super Flow<? extends PaginatedResult<? extends T>>> continuation) {
            return ((C315841) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return WeightedBatchedPaginatedEndpoint.super.forceFetchAllPages((WeightedBatchedPaginatedEndpoint<P, T>) this.L$0);
        }
    }

    @Override // com.robinhood.api.RealPaginatedEndpoint, com.robinhood.api.PaginatedEndpoint
    public Job refreshAllPages(Iterable<? extends P> params, boolean force) {
        Intrinsics.checkNotNullParameter(params, "params");
        return FlowKt.launchIn(FlowKt.flatMapConcat(Operators.chunked(FlowKt.asFlow(params), this.maxWeightPerBatch, this.weight), new C315851(force, this, null)), this.logoutKillswitch.getLoggedInScope());
    }

    /* compiled from: PaginatedEndpoint.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0006H\n"}, m3636d2 = {"<anonymous>", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/models/PaginatedResult;", "T", "P", "batch", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.api.WeightedBatchedPaginatedEndpoint$refreshAllPages$1", m3645f = "PaginatedEndpoint.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.api.WeightedBatchedPaginatedEndpoint$refreshAllPages$1 */
    static final class C315851 extends ContinuationImpl7 implements Function2<List<? extends P>, Continuation<? super Flow<? extends PaginatedResult<? extends T>>>, Object> {
        final /* synthetic */ boolean $force;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ WeightedBatchedPaginatedEndpoint<P, T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C315851(boolean z, WeightedBatchedPaginatedEndpoint<P, T> weightedBatchedPaginatedEndpoint, Continuation<? super C315851> continuation) {
            super(2, continuation);
            this.$force = z;
            this.this$0 = weightedBatchedPaginatedEndpoint;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C315851 c315851 = new C315851(this.$force, this.this$0, continuation);
            c315851.L$0 = obj;
            return c315851;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(List<? extends P> list, Continuation<? super Flow<? extends PaginatedResult<? extends T>>> continuation) {
            return ((C315851) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return PaginatedEndpointKt.paginate((List) this.L$0, new WeightedBatchedPaginatedEndpoint$refreshAllPages$1$networkCall$1(this.$force, this.this$0, null));
        }
    }
}
