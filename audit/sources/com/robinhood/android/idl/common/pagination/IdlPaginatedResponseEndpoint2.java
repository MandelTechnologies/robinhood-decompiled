package com.robinhood.android.idl.common.pagination;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.idl.common.polling.IdlBackendPolling;
import com.robinhood.coroutines.flow.ErrorHandling3;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.Response;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Duration;

/* compiled from: IdlPaginatedResponseEndpoint.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\u001a¹\u0001\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00100\u000f\"\u0004\b\u0000\u0010\u0000\"\u0012\b\u0001\u0010\u0003*\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00012\u0006\u0010\u0004\u001a\u00028\u00002<\u0010\n\u001a8\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\t2\u001e\u0010\r\u001a\u001a\u0012\u0004\u0012\u00028\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u000bj\b\u0012\u0004\u0012\u00028\u0001`\f2\u001e\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00028\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u000bj\b\u0012\u0004\u0012\u00028\u0001`\f¢\u0006\u0004\b\u0011\u0010\u0012\u001a=\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00100\u000f\"\u0012\b\u0000\u0010\u0003*\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00028\u00000\u0013¢\u0006\u0004\b\u0015\u0010\u0016\u001a=\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00100\u000f\"\u0012\b\u0000\u0010\u0003*\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00028\u00000\u0013¢\u0006\u0004\b\u0017\u0010\u0016\u001aG\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00100\u000f\"\u0012\b\u0000\u0010\u0003*\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00028\u00000\u00132\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001b\u001a;\u0010\u001f\u001a\u00020\u001e\"\u0012\b\u0000\u0010\u0003*\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00028\u00000\u00132\b\b\u0002\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001f\u0010 \u001a[\u0010#\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00100\"0\u000f\"\u0004\b\u0000\u0010\u0000\"\u0012\b\u0001\u0010\u0003*\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00132\u0006\u0010!\u001a\u00028\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b#\u0010$¨\u0006%"}, m3636d2 = {"P", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/idl/MessageDto;", "T", "firstPageParams", "Lkotlin/Function3;", "Lcom/robinhood/android/idl/common/pagination/IdlPaginationCursor;", "Lkotlin/coroutines/Continuation;", "", "Lcom/robinhood/android/idl/common/pagination/NetworkCall;", "networkCall", "Lkotlin/Function1;", "Lcom/robinhood/android/idl/common/pagination/CursorMapping;", "previousMapping", "nextMapping", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/android/idl/common/pagination/IdlPaginatedResult;", "paginate", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/android/idl/common/pagination/IdlPaginatedResponseEndpoint;", "", "fetchAllPages", "(Lcom/robinhood/android/idl/common/pagination/IdlPaginatedResponseEndpoint;)Lkotlinx/coroutines/flow/Flow;", "forceFetchAllPages", "j$/time/Duration", "duration", "pollAllPages", "(Lcom/robinhood/android/idl/common/pagination/IdlPaginatedResponseEndpoint;Lj$/time/Duration;)Lkotlinx/coroutines/flow/Flow;", "", "force", "Lkotlinx/coroutines/Job;", "refreshAllPages", "(Lcom/robinhood/android/idl/common/pagination/IdlPaginatedResponseEndpoint;Z)Lkotlinx/coroutines/Job;", "params", "", "backendPollAllPages", "(Lcom/robinhood/android/idl/common/pagination/IdlPaginatedResponseEndpoint;Ljava/lang/Object;Lj$/time/Duration;)Lkotlinx/coroutines/flow/Flow;", "lib-api_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.idl.common.pagination.IdlPaginatedResponseEndpointKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class IdlPaginatedResponseEndpoint2 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: IdlPaginatedResponseEndpoint.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0012\b\u0000\u0010\u0002*\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00060\u0005H\n"}, m3636d2 = {"<anonymous>", "", "T", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/idl/MessageDto;", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/android/idl/common/pagination/IdlPaginatedResult;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.idl.common.pagination.IdlPaginatedResponseEndpointKt$paginate$1", m3645f = "IdlPaginatedResponseEndpoint.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S2_VALUE, EnumC7081g.SDK_ASSET_ICON_CLIPBOARD_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.idl.common.pagination.IdlPaginatedResponseEndpointKt$paginate$1 */
    static final class C185571<T> extends ContinuationImpl7 implements Function2<FlowCollector<? super IdlPaginatedResult<? extends T>>, Continuation<? super Unit>, Object> {
        final /* synthetic */ P $firstPageParams;
        final /* synthetic */ Function3<P, IdlPaginationCursor, Continuation<? super T>, Object> $networkCall;
        final /* synthetic */ Function1<T, IdlPaginationCursor> $nextMapping;
        final /* synthetic */ Function1<T, IdlPaginationCursor> $previousMapping;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C185571(Function3<? super P, ? super IdlPaginationCursor, ? super Continuation<? super T>, ? extends Object> function3, P p, Function1<? super T, IdlPaginationCursor> function1, Function1<? super T, IdlPaginationCursor> function12, Continuation<? super C185571> continuation) {
            super(2, continuation);
            this.$networkCall = function3;
            this.$firstPageParams = p;
            this.$previousMapping = function1;
            this.$nextMapping = function12;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C185571 c185571 = new C185571(this.$networkCall, this.$firstPageParams, this.$previousMapping, this.$nextMapping, continuation);
            c185571.L$0 = obj;
            return c185571;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super IdlPaginatedResult<? extends T>> flowCollector, Continuation<? super Unit> continuation) {
            return ((C185571) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x006b, code lost:
        
            if (r5.emit(r7, r8) == r0) goto L19;
         */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0045  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004a -> B:20:0x006e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x006b -> B:20:0x006e). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            FlowCollector flowCollector;
            IdlPaginationCursor idlPaginationCursorInvoke;
            FlowCollector flowCollector2;
            Response response;
            Object objInvoke;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                flowCollector = (FlowCollector) this.L$0;
                idlPaginationCursorInvoke = null;
                Function3<P, IdlPaginationCursor, Continuation<? super T>, Object> function3 = this.$networkCall;
                P p = this.$firstPageParams;
                this.L$0 = flowCollector;
                this.L$1 = null;
                this.label = 1;
                objInvoke = function3.invoke(p, idlPaginationCursorInvoke, this);
                if (objInvoke != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i == 1) {
                FlowCollector flowCollector3 = (FlowCollector) this.L$0;
                ResultKt.throwOnFailure(obj);
                flowCollector2 = flowCollector3;
                response = (Response) obj;
                if (response != null) {
                }
                flowCollector = flowCollector2;
                if (response != null) {
                }
                if (idlPaginationCursorInvoke == null) {
                }
                Function3<P, IdlPaginationCursor, Continuation<? super T>, Object> function32 = this.$networkCall;
                P p2 = this.$firstPageParams;
                this.L$0 = flowCollector;
                this.L$1 = null;
                this.label = 1;
                objInvoke = function32.invoke(p2, idlPaginationCursorInvoke, this);
                if (objInvoke != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            response = (Response) this.L$1;
            flowCollector2 = (FlowCollector) this.L$0;
            ResultKt.throwOnFailure(obj);
            flowCollector = flowCollector2;
            idlPaginationCursorInvoke = response != null ? this.$nextMapping.invoke(response) : null;
            if (idlPaginationCursorInvoke == null) {
                return Unit.INSTANCE;
            }
            Function3<P, IdlPaginationCursor, Continuation<? super T>, Object> function322 = this.$networkCall;
            P p22 = this.$firstPageParams;
            this.L$0 = flowCollector;
            this.L$1 = null;
            this.label = 1;
            objInvoke = function322.invoke(p22, idlPaginationCursorInvoke, this);
            if (objInvoke != coroutine_suspended) {
                flowCollector2 = flowCollector;
                obj = objInvoke;
                response = (Response) obj;
                if (response != null) {
                    IdlPaginatedResult idlPaginatedResult = new IdlPaginatedResult(response, this.$previousMapping.invoke(response), this.$nextMapping.invoke(response));
                    this.L$0 = flowCollector2;
                    this.L$1 = response;
                    this.label = 2;
                }
                flowCollector = flowCollector2;
                if (response != null) {
                }
                if (idlPaginationCursorInvoke == null) {
                }
                Function3<P, IdlPaginationCursor, Continuation<? super T>, Object> function3222 = this.$networkCall;
                P p222 = this.$firstPageParams;
                this.L$0 = flowCollector;
                this.L$1 = null;
                this.label = 1;
                objInvoke = function3222.invoke(p222, idlPaginationCursorInvoke, this);
                if (objInvoke != coroutine_suspended) {
                }
            }
            return coroutine_suspended;
        }
    }

    public static final <P, T extends Response<? extends Dto3<?>>> Flow<IdlPaginatedResult<T>> paginate(P p, Function3<? super P, ? super IdlPaginationCursor, ? super Continuation<? super T>, ? extends Object> networkCall, Function1<? super T, IdlPaginationCursor> previousMapping, Function1<? super T, IdlPaginationCursor> nextMapping) {
        Intrinsics.checkNotNullParameter(networkCall, "networkCall");
        Intrinsics.checkNotNullParameter(previousMapping, "previousMapping");
        Intrinsics.checkNotNullParameter(nextMapping, "nextMapping");
        return FlowKt.flow(new C185571(networkCall, p, previousMapping, nextMapping, null));
    }

    public static final <T extends Response<? extends Dto3<?>>> Flow<IdlPaginatedResult<T>> fetchAllPages(IdlPaginatedResponseEndpoint<Unit, T> idlPaginatedResponseEndpoint) {
        Intrinsics.checkNotNullParameter(idlPaginatedResponseEndpoint, "<this>");
        return idlPaginatedResponseEndpoint.fetchAllPages(Unit.INSTANCE);
    }

    public static final <T extends Response<? extends Dto3<?>>> Flow<IdlPaginatedResult<T>> forceFetchAllPages(IdlPaginatedResponseEndpoint<Unit, T> idlPaginatedResponseEndpoint) {
        Intrinsics.checkNotNullParameter(idlPaginatedResponseEndpoint, "<this>");
        return idlPaginatedResponseEndpoint.forceFetchAllPages(Unit.INSTANCE);
    }

    public static /* synthetic */ Flow pollAllPages$default(IdlPaginatedResponseEndpoint idlPaginatedResponseEndpoint, Duration duration, int i, Object obj) {
        if ((i & 1) != 0) {
            duration = Duration.ofSeconds(5L);
        }
        return pollAllPages(idlPaginatedResponseEndpoint, duration);
    }

    public static final <T extends Response<? extends Dto3<?>>> Flow<IdlPaginatedResult<T>> pollAllPages(IdlPaginatedResponseEndpoint<Unit, T> idlPaginatedResponseEndpoint, Duration duration) {
        Intrinsics.checkNotNullParameter(idlPaginatedResponseEndpoint, "<this>");
        Intrinsics.checkNotNullParameter(duration, "duration");
        return idlPaginatedResponseEndpoint.pollAllPages(Unit.INSTANCE, duration);
    }

    public static /* synthetic */ Job refreshAllPages$default(IdlPaginatedResponseEndpoint idlPaginatedResponseEndpoint, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return refreshAllPages(idlPaginatedResponseEndpoint, z);
    }

    public static final <T extends Response<? extends Dto3<?>>> Job refreshAllPages(IdlPaginatedResponseEndpoint<Unit, T> idlPaginatedResponseEndpoint, boolean z) {
        Intrinsics.checkNotNullParameter(idlPaginatedResponseEndpoint, "<this>");
        return idlPaginatedResponseEndpoint.refreshAllPages(Unit.INSTANCE, z);
    }

    public static /* synthetic */ Flow backendPollAllPages$default(IdlPaginatedResponseEndpoint idlPaginatedResponseEndpoint, Object obj, Duration duration, int i, Object obj2) {
        if ((i & 2) != 0) {
            duration = Duration.ofSeconds(5L);
        }
        return backendPollAllPages(idlPaginatedResponseEndpoint, obj, duration);
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: IdlPaginatedResponseEndpoint.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001\"\u0012\b\u0000\u0010\u0003*\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\n"}, m3636d2 = {"<anonymous>", "", "Lcom/robinhood/android/idl/common/pagination/IdlPaginatedResult;", "T", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/idl/MessageDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.idl.common.pagination.IdlPaginatedResponseEndpointKt$backendPollAllPages$1", m3645f = "IdlPaginatedResponseEndpoint.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.idl.common.pagination.IdlPaginatedResponseEndpointKt$backendPollAllPages$1 */
    static final class C185561<T> extends ContinuationImpl7 implements Function1<Continuation<? super List<? extends IdlPaginatedResult<? extends T>>>, Object> {
        final /* synthetic */ Duration $duration;
        final /* synthetic */ P $params;
        final /* synthetic */ IdlPaginatedResponseEndpoint<P, T> $this_backendPollAllPages;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C185561(IdlPaginatedResponseEndpoint<P, T> idlPaginatedResponseEndpoint, P p, Duration duration, Continuation<? super C185561> continuation) {
            super(1, continuation);
            this.$this_backendPollAllPages = idlPaginatedResponseEndpoint;
            this.$params = p;
            this.$duration = duration;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C185561(this.$this_backendPollAllPages, this.$params, this.$duration, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super List<? extends IdlPaginatedResult<? extends T>>> continuation) {
            return ((C185561) create(continuation)).invokeSuspend(Unit.INSTANCE);
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
            Flow flowFilterNotNull = FlowKt.filterNotNull(ErrorHandling3.ignoreNetworkExceptions(this.$this_backendPollAllPages.forceFetchAllPages(this.$params), this.$duration));
            ArrayList arrayList = new ArrayList();
            this.label = 1;
            Object list = FlowKt.toList(flowFilterNotNull, arrayList, this);
            return list == coroutine_suspended ? coroutine_suspended : list;
        }
    }

    public static final <P, T extends Response<? extends Dto3<?>>> Flow<List<IdlPaginatedResult<T>>> backendPollAllPages(IdlPaginatedResponseEndpoint<P, T> idlPaginatedResponseEndpoint, P p, Duration duration) {
        Intrinsics.checkNotNullParameter(idlPaginatedResponseEndpoint, "<this>");
        Intrinsics.checkNotNullParameter(duration, "duration");
        return IdlBackendPolling.networkPollAllPagesWithBackendInterval$default(duration, false, new C185561(idlPaginatedResponseEndpoint, p, duration, null), 2, null);
    }
}
