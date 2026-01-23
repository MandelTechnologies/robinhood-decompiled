package com.robinhood.api;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.coroutines.flow.ErrorHandling3;
import com.robinhood.coroutines.flow.Polling2;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.PaginationCursor;
import com.robinhood.utils.LogoutKillswitch;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Duration;

/* compiled from: PaginatedEndpoint.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012&\u0010\n\u001a\"\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\t0\u0006¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\t0\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\t0\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0010J+\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\t0\u000e2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR:\u0010\n\u001a\"\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\t0\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/api/RealPaginatedEndpoint;", "P", "T", "Lcom/robinhood/api/PaginatedEndpoint;", "Lcom/robinhood/utils/LogoutKillswitch;", "logoutKillswitch", "Lcom/robinhood/android/moria/network/Endpoint;", "Lkotlin/Pair;", "Lcom/robinhood/models/PaginationCursor;", "Lcom/robinhood/models/PaginatedResult;", "endpoint", "<init>", "(Lcom/robinhood/utils/LogoutKillswitch;Lcom/robinhood/android/moria/network/Endpoint;)V", "params", "Lkotlinx/coroutines/flow/Flow;", "fetchAllPages", "(Ljava/lang/Object;)Lkotlinx/coroutines/flow/Flow;", "forceFetchAllPages", "j$/time/Duration", "duration", "pollAllPages", "(Ljava/lang/Object;Lj$/time/Duration;)Lkotlinx/coroutines/flow/Flow;", "", "force", "Lkotlinx/coroutines/Job;", "refreshAllPages", "(Ljava/lang/Object;Z)Lkotlinx/coroutines/Job;", "Lcom/robinhood/utils/LogoutKillswitch;", "Lcom/robinhood/android/moria/network/Endpoint;", "getEndpoint", "()Lcom/robinhood/android/moria/network/Endpoint;", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
class RealPaginatedEndpoint<P, T> implements PaginatedEndpoint<P, T> {
    private final Endpoint<Tuples2<P, PaginationCursor>, PaginatedResult<T>> endpoint;
    private final LogoutKillswitch logoutKillswitch;

    public RealPaginatedEndpoint(LogoutKillswitch logoutKillswitch, Endpoint<Tuples2<P, PaginationCursor>, PaginatedResult<T>> endpoint) {
        Intrinsics.checkNotNullParameter(logoutKillswitch, "logoutKillswitch");
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        this.logoutKillswitch = logoutKillswitch;
        this.endpoint = endpoint;
    }

    @Override // com.robinhood.api.PaginatedEndpoint
    public Endpoint<Tuples2<P, PaginationCursor>, PaginatedResult<T>> getEndpoint() {
        return this.endpoint;
    }

    @Override // com.robinhood.api.PaginatedEndpoint
    public Flow<PaginatedResult<T>> fetchAllPages(P params) {
        return PaginatedEndpointKt.paginate(params, new RealPaginatedEndpoint$fetchAllPages$networkCall$1(this, null));
    }

    @Override // com.robinhood.api.PaginatedEndpoint
    public Flow<PaginatedResult<T>> forceFetchAllPages(P params) {
        return PaginatedEndpointKt.paginate(params, new RealPaginatedEndpoint$forceFetchAllPages$networkCall$1(this, null));
    }

    /* compiled from: PaginatedEndpoint.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001\"\u0004\b\u0000\u0010\u0003H\n"}, m3636d2 = {"<anonymous>", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/models/PaginatedResult;", "T"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.api.RealPaginatedEndpoint$pollAllPages$1", m3645f = "PaginatedEndpoint.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.api.RealPaginatedEndpoint$pollAllPages$1 */
    /* loaded from: classes16.dex */
    static final class C315811 extends ContinuationImpl7 implements Function1<Continuation<? super Flow<? extends PaginatedResult<? extends T>>>, Object> {
        final /* synthetic */ P $params;
        int label;
        final /* synthetic */ RealPaginatedEndpoint<P, T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C315811(RealPaginatedEndpoint<P, T> realPaginatedEndpoint, P p, Continuation<? super C315811> continuation) {
            super(1, continuation);
            this.this$0 = realPaginatedEndpoint;
            this.$params = p;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C315811(this.this$0, this.$params, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Flow<? extends PaginatedResult<? extends T>>> continuation) {
            return ((C315811) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return this.this$0.forceFetchAllPages(this.$params);
        }
    }

    @Override // com.robinhood.api.PaginatedEndpoint
    public Flow<PaginatedResult<T>> pollAllPages(P params, Duration duration) {
        Intrinsics.checkNotNullParameter(duration, "duration");
        return ErrorHandling3.ignoreNetworkExceptions(FlowKt.flattenConcat(Polling2.networkPoll(duration, new C315811(this, params, null))), duration);
    }

    @Override // com.robinhood.api.PaginatedEndpoint
    public Job refreshAllPages(P params, boolean force) {
        return FlowKt.launchIn(PaginatedEndpointKt.paginate(params, new RealPaginatedEndpoint$refreshAllPages$networkCall$1(force, this, null)), this.logoutKillswitch.getLoggedInScope());
    }
}
