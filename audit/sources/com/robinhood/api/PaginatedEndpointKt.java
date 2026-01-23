package com.robinhood.api;

import com.plaid.internal.EnumC7081g;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.PaginationCursor;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Duration;

/* compiled from: PaginatedEndpoint.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aq\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00060\n\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u00002B\u0010\t\u001a>\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\b¢\u0006\u0004\b\u000b\u0010\f\u001a/\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\n\"\u0004\b\u0000\u0010\u0001*\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00028\u00000\r¢\u0006\u0004\b\u000f\u0010\u0010\u001a/\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\n\"\u0004\b\u0000\u0010\u0001*\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00028\u00000\r¢\u0006\u0004\b\u0011\u0010\u0010\u001a9\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\n\"\u0004\b\u0000\u0010\u0001*\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00028\u00000\r2\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015\u001a-\u0010\u0019\u001a\u00020\u0018\"\u0004\b\u0000\u0010\u0001*\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00028\u00000\r2\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001a*p\b\u0002\u0010\u001b\u001a\u0004\b\u0000\u0010\u0000\u001a\u0004\b\u0001\u0010\u0001\".\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00032.\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003¨\u0006\u001c"}, m3636d2 = {"P", "T", "firstPageParams", "Lkotlin/Function3;", "Lcom/robinhood/models/PaginationCursor;", "Lkotlin/coroutines/Continuation;", "Lcom/robinhood/models/PaginatedResult;", "", "Lcom/robinhood/api/NetworkCall;", "networkCall", "Lkotlinx/coroutines/flow/Flow;", "paginate", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/api/PaginatedEndpoint;", "", "fetchAllPages", "(Lcom/robinhood/api/PaginatedEndpoint;)Lkotlinx/coroutines/flow/Flow;", "forceFetchAllPages", "j$/time/Duration", "duration", "pollAllPages", "(Lcom/robinhood/api/PaginatedEndpoint;Lj$/time/Duration;)Lkotlinx/coroutines/flow/Flow;", "", "force", "Lkotlinx/coroutines/Job;", "refreshAllPages", "(Lcom/robinhood/api/PaginatedEndpoint;Z)Lkotlinx/coroutines/Job;", "NetworkCall", "lib-api_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class PaginatedEndpointKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: PaginatedEndpoint.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/models/PaginatedResult;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.api.PaginatedEndpointKt$paginate$1", m3645f = "PaginatedEndpoint.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_VALUE, EnumC7081g.f2777x89a9e432}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.api.PaginatedEndpointKt$paginate$1 */
    static final class C315791<T> extends ContinuationImpl7 implements Function2<FlowCollector<? super PaginatedResult<? extends T>>, Continuation<? super Unit>, Object> {
        final /* synthetic */ P $firstPageParams;
        final /* synthetic */ Function3<P, PaginationCursor, Continuation<? super PaginatedResult<? extends T>>, Object> $networkCall;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C315791(Function3<? super P, ? super PaginationCursor, ? super Continuation<? super PaginatedResult<? extends T>>, ? extends Object> function3, P p, Continuation<? super C315791> continuation) {
            super(2, continuation);
            this.$networkCall = function3;
            this.$firstPageParams = p;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C315791 c315791 = new C315791(this.$networkCall, this.$firstPageParams, continuation);
            c315791.L$0 = obj;
            return c315791;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super PaginatedResult<? extends T>> flowCollector, Continuation<? super Unit> continuation) {
            return ((C315791) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
        
            if (r5.emit(r1, r7) == r0) goto L19;
         */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0045  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0064  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004a -> B:20:0x0059). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0056 -> B:20:0x0059). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            FlowCollector flowCollector;
            PaginationCursor next;
            FlowCollector flowCollector2;
            PaginatedResult paginatedResult;
            Object objInvoke;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                flowCollector = (FlowCollector) this.L$0;
                next = null;
                Function3<P, PaginationCursor, Continuation<? super PaginatedResult<? extends T>>, Object> function3 = this.$networkCall;
                P p = this.$firstPageParams;
                this.L$0 = flowCollector;
                this.L$1 = null;
                this.label = 1;
                objInvoke = function3.invoke(p, next, this);
                if (objInvoke != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i == 1) {
                FlowCollector flowCollector3 = (FlowCollector) this.L$0;
                ResultKt.throwOnFailure(obj);
                flowCollector2 = flowCollector3;
                paginatedResult = (PaginatedResult) obj;
                if (paginatedResult != null) {
                }
                flowCollector = flowCollector2;
                if (paginatedResult != null) {
                }
                if (next == null) {
                }
                Function3<P, PaginationCursor, Continuation<? super PaginatedResult<? extends T>>, Object> function32 = this.$networkCall;
                P p2 = this.$firstPageParams;
                this.L$0 = flowCollector;
                this.L$1 = null;
                this.label = 1;
                objInvoke = function32.invoke(p2, next, this);
                if (objInvoke != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            paginatedResult = (PaginatedResult) this.L$1;
            flowCollector2 = (FlowCollector) this.L$0;
            ResultKt.throwOnFailure(obj);
            flowCollector = flowCollector2;
            next = paginatedResult != null ? paginatedResult.getNext() : null;
            if (next == null) {
                return Unit.INSTANCE;
            }
            Function3<P, PaginationCursor, Continuation<? super PaginatedResult<? extends T>>, Object> function322 = this.$networkCall;
            P p22 = this.$firstPageParams;
            this.L$0 = flowCollector;
            this.L$1 = null;
            this.label = 1;
            objInvoke = function322.invoke(p22, next, this);
            if (objInvoke != coroutine_suspended) {
                flowCollector2 = flowCollector;
                obj = objInvoke;
                paginatedResult = (PaginatedResult) obj;
                if (paginatedResult != null) {
                    this.L$0 = flowCollector2;
                    this.L$1 = paginatedResult;
                    this.label = 2;
                }
                flowCollector = flowCollector2;
                if (paginatedResult != null) {
                }
                if (next == null) {
                }
                Function3<P, PaginationCursor, Continuation<? super PaginatedResult<? extends T>>, Object> function3222 = this.$networkCall;
                P p222 = this.$firstPageParams;
                this.L$0 = flowCollector;
                this.L$1 = null;
                this.label = 1;
                objInvoke = function3222.invoke(p222, next, this);
                if (objInvoke != coroutine_suspended) {
                }
            }
            return coroutine_suspended;
        }
    }

    public static final <P, T> Flow<PaginatedResult<T>> paginate(P p, Function3<? super P, ? super PaginationCursor, ? super Continuation<? super PaginatedResult<? extends T>>, ? extends Object> networkCall) {
        Intrinsics.checkNotNullParameter(networkCall, "networkCall");
        return FlowKt.flow(new C315791(networkCall, p, null));
    }

    public static final <T> Flow<PaginatedResult<T>> fetchAllPages(PaginatedEndpoint<Unit, T> paginatedEndpoint) {
        Intrinsics.checkNotNullParameter(paginatedEndpoint, "<this>");
        return paginatedEndpoint.fetchAllPages(Unit.INSTANCE);
    }

    public static final <T> Flow<PaginatedResult<T>> forceFetchAllPages(PaginatedEndpoint<Unit, T> paginatedEndpoint) {
        Intrinsics.checkNotNullParameter(paginatedEndpoint, "<this>");
        return paginatedEndpoint.forceFetchAllPages(Unit.INSTANCE);
    }

    public static /* synthetic */ Flow pollAllPages$default(PaginatedEndpoint paginatedEndpoint, Duration duration, int i, Object obj) {
        if ((i & 1) != 0) {
            duration = Duration.ofSeconds(5L);
        }
        return pollAllPages(paginatedEndpoint, duration);
    }

    public static final <T> Flow<PaginatedResult<T>> pollAllPages(PaginatedEndpoint<Unit, T> paginatedEndpoint, Duration duration) {
        Intrinsics.checkNotNullParameter(paginatedEndpoint, "<this>");
        Intrinsics.checkNotNullParameter(duration, "duration");
        return paginatedEndpoint.pollAllPages(Unit.INSTANCE, duration);
    }

    public static /* synthetic */ Job refreshAllPages$default(PaginatedEndpoint paginatedEndpoint, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return refreshAllPages(paginatedEndpoint, z);
    }

    public static final <T> Job refreshAllPages(PaginatedEndpoint<Unit, T> paginatedEndpoint, boolean z) {
        Intrinsics.checkNotNullParameter(paginatedEndpoint, "<this>");
        return paginatedEndpoint.refreshAllPages(Unit.INSTANCE, z);
    }
}
