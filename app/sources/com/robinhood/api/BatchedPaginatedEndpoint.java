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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: PaginatedEndpoint.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0004\u0012\u0004\u0012\u0002H\u00020\u0003BE\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012,\u0010\t\u001a(\u0012\u0018\u0012\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r0\n¢\u0006\u0004\b\u000e\u0010\u000fJ\"\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r0\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016J\"\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r0\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016J\u001e\u0010\u0016\u001a\u00020\u00172\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R:\u0010\t\u001a(\u0012\u0018\u0012\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r0\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/api/BatchedPaginatedEndpoint;", "P", "T", "Lcom/robinhood/api/RealPaginatedEndpoint;", "", "batchSize", "", "logoutKillswitch", "Lcom/robinhood/utils/LogoutKillswitch;", "endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lkotlin/Pair;", "Lcom/robinhood/models/PaginationCursor;", "Lcom/robinhood/models/PaginatedResult;", "<init>", "(ILcom/robinhood/utils/LogoutKillswitch;Lcom/robinhood/android/moria/network/Endpoint;)V", "getEndpoint", "()Lcom/robinhood/android/moria/network/Endpoint;", "fetchAllPages", "Lkotlinx/coroutines/flow/Flow;", "params", "forceFetchAllPages", "refreshAllPages", "Lkotlinx/coroutines/Job;", "force", "", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
final class BatchedPaginatedEndpoint<P, T> extends RealPaginatedEndpoint<Iterable<? extends P>, T> {
    private final int batchSize;
    private final Endpoint<Tuples2<Iterable<P>, PaginationCursor>, PaginatedResult<T>> endpoint;
    private final LogoutKillswitch logoutKillswitch;

    @Override // com.robinhood.api.RealPaginatedEndpoint, com.robinhood.api.PaginatedEndpoint
    public Endpoint<Tuples2<Iterable<P>, PaginationCursor>, PaginatedResult<T>> getEndpoint() {
        return this.endpoint;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BatchedPaginatedEndpoint(int i, LogoutKillswitch logoutKillswitch, Endpoint<Tuples2<Iterable<P>, PaginationCursor>, PaginatedResult<T>> endpoint) {
        super(logoutKillswitch, endpoint);
        Intrinsics.checkNotNullParameter(logoutKillswitch, "logoutKillswitch");
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        this.batchSize = i;
        this.logoutKillswitch = logoutKillswitch;
        this.endpoint = endpoint;
    }

    @Override // com.robinhood.api.RealPaginatedEndpoint, com.robinhood.api.PaginatedEndpoint
    public Flow<PaginatedResult<T>> fetchAllPages(Iterable<? extends P> params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return FlowKt.flatMapConcat(Operators.chunked(FlowKt.asFlow(params), this.batchSize), new C315761(this, null));
    }

    /* compiled from: PaginatedEndpoint.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0006H\n"}, m3636d2 = {"<anonymous>", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/models/PaginatedResult;", "T", "P", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.api.BatchedPaginatedEndpoint$fetchAllPages$1", m3645f = "PaginatedEndpoint.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.api.BatchedPaginatedEndpoint$fetchAllPages$1 */
    static final class C315761 extends ContinuationImpl7 implements Function2<List<? extends P>, Continuation<? super Flow<? extends PaginatedResult<? extends T>>>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ BatchedPaginatedEndpoint<P, T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C315761(BatchedPaginatedEndpoint<P, T> batchedPaginatedEndpoint, Continuation<? super C315761> continuation) {
            super(2, continuation);
            this.this$0 = batchedPaginatedEndpoint;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C315761 c315761 = new C315761(this.this$0, continuation);
            c315761.L$0 = obj;
            return c315761;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(List<? extends P> list, Continuation<? super Flow<? extends PaginatedResult<? extends T>>> continuation) {
            return ((C315761) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return BatchedPaginatedEndpoint.super.fetchAllPages((BatchedPaginatedEndpoint<P, T>) this.L$0);
        }
    }

    @Override // com.robinhood.api.RealPaginatedEndpoint, com.robinhood.api.PaginatedEndpoint
    public Flow<PaginatedResult<T>> forceFetchAllPages(Iterable<? extends P> params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return FlowKt.flatMapConcat(Operators.chunked(FlowKt.asFlow(params), this.batchSize), new C315771(this, null));
    }

    /* compiled from: PaginatedEndpoint.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0006H\n"}, m3636d2 = {"<anonymous>", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/models/PaginatedResult;", "T", "P", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.api.BatchedPaginatedEndpoint$forceFetchAllPages$1", m3645f = "PaginatedEndpoint.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.api.BatchedPaginatedEndpoint$forceFetchAllPages$1 */
    static final class C315771 extends ContinuationImpl7 implements Function2<List<? extends P>, Continuation<? super Flow<? extends PaginatedResult<? extends T>>>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ BatchedPaginatedEndpoint<P, T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C315771(BatchedPaginatedEndpoint<P, T> batchedPaginatedEndpoint, Continuation<? super C315771> continuation) {
            super(2, continuation);
            this.this$0 = batchedPaginatedEndpoint;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C315771 c315771 = new C315771(this.this$0, continuation);
            c315771.L$0 = obj;
            return c315771;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(List<? extends P> list, Continuation<? super Flow<? extends PaginatedResult<? extends T>>> continuation) {
            return ((C315771) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return BatchedPaginatedEndpoint.super.forceFetchAllPages((BatchedPaginatedEndpoint<P, T>) this.L$0);
        }
    }

    @Override // com.robinhood.api.RealPaginatedEndpoint, com.robinhood.api.PaginatedEndpoint
    public Job refreshAllPages(Iterable<? extends P> params, boolean force) {
        Intrinsics.checkNotNullParameter(params, "params");
        return FlowKt.launchIn(FlowKt.flatMapConcat(Operators.chunked(FlowKt.asFlow(params), this.batchSize), new C315781(force, this, null)), this.logoutKillswitch.getLoggedInScope());
    }

    /* compiled from: PaginatedEndpoint.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0006H\n"}, m3636d2 = {"<anonymous>", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/models/PaginatedResult;", "T", "P", "batch", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.api.BatchedPaginatedEndpoint$refreshAllPages$1", m3645f = "PaginatedEndpoint.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.api.BatchedPaginatedEndpoint$refreshAllPages$1 */
    static final class C315781 extends ContinuationImpl7 implements Function2<List<? extends P>, Continuation<? super Flow<? extends PaginatedResult<? extends T>>>, Object> {
        final /* synthetic */ boolean $force;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ BatchedPaginatedEndpoint<P, T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C315781(boolean z, BatchedPaginatedEndpoint<P, T> batchedPaginatedEndpoint, Continuation<? super C315781> continuation) {
            super(2, continuation);
            this.$force = z;
            this.this$0 = batchedPaginatedEndpoint;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C315781 c315781 = new C315781(this.$force, this.this$0, continuation);
            c315781.L$0 = obj;
            return c315781;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(List<? extends P> list, Continuation<? super Flow<? extends PaginatedResult<? extends T>>> continuation) {
            return ((C315781) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return PaginatedEndpointKt.paginate((List) this.L$0, new BatchedPaginatedEndpoint$refreshAllPages$1$networkCall$1(this.$force, this.this$0, null));
        }
    }
}
