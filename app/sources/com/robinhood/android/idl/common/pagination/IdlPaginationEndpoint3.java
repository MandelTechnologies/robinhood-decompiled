package com.robinhood.android.idl.common.pagination;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.coroutines.flow.ErrorHandling3;
import com.robinhood.coroutines.flow.Polling2;
import com.robinhood.idl.Dto3;
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

/* compiled from: IdlPaginationEndpoint.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u0001*\f\b\u0001\u0010\u0003*\u0006\u0012\u0002\b\u00030\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004Bq\u0012\u001e\u0010\b\u001a\u001a\u0012\u0004\u0012\u00028\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005j\b\u0012\u0004\u0012\u00028\u0001`\u0007\u0012\u001e\u0010\t\u001a\u001a\u0012\u0004\u0012\u00028\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005j\b\u0012\u0004\u0012\u00028\u0001`\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012 \u0010\u000e\u001a\u001c\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00060\r\u0012\u0004\u0012\u00028\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00130\u00122\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00130\u00122\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J+\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00130\u00122\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR,\u0010\b\u001a\u001a\u0012\u0004\u0012\u00028\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005j\b\u0012\u0004\u0012\u00028\u0001`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010 R,\u0010\t\u001a\u001a\u0012\u0004\u0012\u00028\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005j\b\u0012\u0004\u0012\u00028\u0001`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010 R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010!R4\u0010\u000e\u001a\u001c\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00060\r\u0012\u0004\u0012\u00028\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/idl/common/pagination/RealIdlPaginatedEndpoint;", "P", "Lcom/robinhood/idl/MessageDto;", "T", "Lcom/robinhood/android/idl/common/pagination/IdlPaginatedEndpoint;", "Lkotlin/Function1;", "Lcom/robinhood/android/idl/common/pagination/IdlPaginationCursor;", "Lcom/robinhood/android/idl/common/pagination/CursorMapping;", "previousMapping", "nextMapping", "Lcom/robinhood/utils/LogoutKillswitch;", "logoutKillswitch", "Lcom/robinhood/android/moria/network/Endpoint;", "Lkotlin/Pair;", "endpoint", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/robinhood/utils/LogoutKillswitch;Lcom/robinhood/android/moria/network/Endpoint;)V", "params", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/android/idl/common/pagination/IdlPaginatedResult;", "fetchAllPages", "(Ljava/lang/Object;)Lkotlinx/coroutines/flow/Flow;", "forceFetchAllPages", "j$/time/Duration", "duration", "pollAllPages", "(Ljava/lang/Object;Lj$/time/Duration;)Lkotlinx/coroutines/flow/Flow;", "", "force", "Lkotlinx/coroutines/Job;", "refreshAllPages", "(Ljava/lang/Object;Z)Lkotlinx/coroutines/Job;", "Lkotlin/jvm/functions/Function1;", "Lcom/robinhood/utils/LogoutKillswitch;", "Lcom/robinhood/android/moria/network/Endpoint;", "getEndpoint", "()Lcom/robinhood/android/moria/network/Endpoint;", "lib-api_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.idl.common.pagination.RealIdlPaginatedEndpoint, reason: use source file name */
/* loaded from: classes10.dex */
class IdlPaginationEndpoint3<P, T extends Dto3<?>> implements IdlPaginationEndpoint<P, T> {
    private final Endpoint<Tuples2<P, IdlPaginationCursor>, T> endpoint;
    private final LogoutKillswitch logoutKillswitch;
    private final Function1<T, IdlPaginationCursor> nextMapping;
    private final Function1<T, IdlPaginationCursor> previousMapping;

    /* JADX WARN: Multi-variable type inference failed */
    public IdlPaginationEndpoint3(Function1<? super T, IdlPaginationCursor> previousMapping, Function1<? super T, IdlPaginationCursor> nextMapping, LogoutKillswitch logoutKillswitch, Endpoint<Tuples2<P, IdlPaginationCursor>, T> endpoint) {
        Intrinsics.checkNotNullParameter(previousMapping, "previousMapping");
        Intrinsics.checkNotNullParameter(nextMapping, "nextMapping");
        Intrinsics.checkNotNullParameter(logoutKillswitch, "logoutKillswitch");
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        this.previousMapping = previousMapping;
        this.nextMapping = nextMapping;
        this.logoutKillswitch = logoutKillswitch;
        this.endpoint = endpoint;
    }

    @Override // com.robinhood.android.idl.common.pagination.IdlPaginationEndpoint
    public Endpoint<Tuples2<P, IdlPaginationCursor>, T> getEndpoint() {
        return this.endpoint;
    }

    @Override // com.robinhood.android.idl.common.pagination.IdlPaginationEndpoint
    public Flow<IdlPaginatedResult<T>> fetchAllPages(P params) {
        return IdlPaginationEndpoint2.paginate(params, new IdlPaginationEndpoint4(this, null), this.previousMapping, this.nextMapping);
    }

    @Override // com.robinhood.android.idl.common.pagination.IdlPaginationEndpoint
    public Flow<IdlPaginatedResult<T>> forceFetchAllPages(P params) {
        return IdlPaginationEndpoint2.paginate(params, new IdlPaginationEndpoint5(this, null), this.previousMapping, this.nextMapping);
    }

    /* compiled from: IdlPaginationEndpoint.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001\"\f\b\u0000\u0010\u0003*\u0006\u0012\u0002\b\u00030\u0004H\n"}, m3636d2 = {"<anonymous>", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/android/idl/common/pagination/IdlPaginatedResult;", "T", "Lcom/robinhood/idl/MessageDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.idl.common.pagination.RealIdlPaginatedEndpoint$pollAllPages$1", m3645f = "IdlPaginationEndpoint.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.idl.common.pagination.RealIdlPaginatedEndpoint$pollAllPages$1 */
    static final class C185591 extends ContinuationImpl7 implements Function1<Continuation<? super Flow<? extends IdlPaginatedResult<? extends T>>>, Object> {
        final /* synthetic */ P $params;
        int label;
        final /* synthetic */ IdlPaginationEndpoint3<P, T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C185591(IdlPaginationEndpoint3<P, T> idlPaginationEndpoint3, P p, Continuation<? super C185591> continuation) {
            super(1, continuation);
            this.this$0 = idlPaginationEndpoint3;
            this.$params = p;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C185591(this.this$0, this.$params, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Flow<? extends IdlPaginatedResult<? extends T>>> continuation) {
            return ((C185591) create(continuation)).invokeSuspend(Unit.INSTANCE);
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

    @Override // com.robinhood.android.idl.common.pagination.IdlPaginationEndpoint
    public Flow<IdlPaginatedResult<T>> pollAllPages(P params, Duration duration) {
        Intrinsics.checkNotNullParameter(duration, "duration");
        return ErrorHandling3.ignoreNetworkExceptions(FlowKt.flattenConcat(Polling2.networkPoll(duration, new C185591(this, params, null))), duration);
    }

    @Override // com.robinhood.android.idl.common.pagination.IdlPaginationEndpoint
    public Job refreshAllPages(P params, boolean force) {
        return FlowKt.launchIn(IdlPaginationEndpoint2.paginate(params, new IdlPaginationEndpoint6(force, this, null), this.previousMapping, this.nextMapping), this.logoutKillswitch.getLoggedInScope());
    }
}
