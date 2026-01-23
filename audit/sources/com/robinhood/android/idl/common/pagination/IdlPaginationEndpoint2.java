package com.robinhood.android.idl.common.pagination;

import com.plaid.internal.EnumC7081g;
import com.robinhood.idl.Dto3;
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

/* compiled from: IdlPaginationEndpoint.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a³\u0001\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000f0\u000e\"\u0004\b\u0000\u0010\u0000\"\f\b\u0001\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\u0003\u001a\u00028\u00002<\u0010\t\u001a8\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\b2\u001e\u0010\f\u001a\u001a\u0012\u0004\u0012\u00028\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00050\nj\b\u0012\u0004\u0012\u00028\u0001`\u000b2\u001e\u0010\r\u001a\u001a\u0012\u0004\u0012\u00028\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00050\nj\b\u0012\u0004\u0012\u00028\u0001`\u000b¢\u0006\u0004\b\u0010\u0010\u0011\u001a7\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f0\u000e\"\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u0001*\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00028\u00000\u0012¢\u0006\u0004\b\u0014\u0010\u0015\u001a7\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f0\u000e\"\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u0001*\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00028\u00000\u0012¢\u0006\u0004\b\u0016\u0010\u0015\u001aA\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f0\u000e\"\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u0001*\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00028\u00000\u00122\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001a\u001a5\u0010\u001e\u001a\u00020\u001d\"\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u0001*\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00028\u00000\u00122\b\b\u0002\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001e\u0010\u001f*d\b\u0000\u0010 \u001a\u0004\b\u0000\u0010\u0000\u001a\u0004\b\u0001\u0010\u0002\"(\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00042(\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004*,\u0010!\u001a\u0004\b\u0000\u0010\u0002\"\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00050\n2\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00050\n¨\u0006\""}, m3636d2 = {"P", "Lcom/robinhood/idl/MessageDto;", "T", "firstPageParams", "Lkotlin/Function3;", "Lcom/robinhood/android/idl/common/pagination/IdlPaginationCursor;", "Lkotlin/coroutines/Continuation;", "", "Lcom/robinhood/android/idl/common/pagination/NetworkCall;", "networkCall", "Lkotlin/Function1;", "Lcom/robinhood/android/idl/common/pagination/CursorMapping;", "previousMapping", "nextMapping", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/android/idl/common/pagination/IdlPaginatedResult;", "paginate", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/android/idl/common/pagination/IdlPaginatedEndpoint;", "", "fetchAllPages", "(Lcom/robinhood/android/idl/common/pagination/IdlPaginatedEndpoint;)Lkotlinx/coroutines/flow/Flow;", "forceFetchAllPages", "j$/time/Duration", "duration", "pollAllPages", "(Lcom/robinhood/android/idl/common/pagination/IdlPaginatedEndpoint;Lj$/time/Duration;)Lkotlinx/coroutines/flow/Flow;", "", "force", "Lkotlinx/coroutines/Job;", "refreshAllPages", "(Lcom/robinhood/android/idl/common/pagination/IdlPaginatedEndpoint;Z)Lkotlinx/coroutines/Job;", "NetworkCall", "CursorMapping", "lib-api_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.idl.common.pagination.IdlPaginationEndpointKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class IdlPaginationEndpoint2 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: IdlPaginationEndpoint.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004H\n"}, m3636d2 = {"<anonymous>", "", "T", "Lcom/robinhood/idl/MessageDto;", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/android/idl/common/pagination/IdlPaginatedResult;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.idl.common.pagination.IdlPaginationEndpointKt$paginate$1", m3645f = "IdlPaginationEndpoint.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE, EnumC7081g.f2780x600b66fe}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.idl.common.pagination.IdlPaginationEndpointKt$paginate$1 */
    static final class C185581<T> extends ContinuationImpl7 implements Function2<FlowCollector<? super IdlPaginatedResult<? extends T>>, Continuation<? super Unit>, Object> {
        final /* synthetic */ P $firstPageParams;
        final /* synthetic */ Function3<P, IdlPaginationCursor, Continuation<? super T>, Object> $networkCall;
        final /* synthetic */ Function1<T, IdlPaginationCursor> $nextMapping;
        final /* synthetic */ Function1<T, IdlPaginationCursor> $previousMapping;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C185581(Function3<? super P, ? super IdlPaginationCursor, ? super Continuation<? super T>, ? extends Object> function3, P p, Function1<? super T, IdlPaginationCursor> function1, Function1<? super T, IdlPaginationCursor> function12, Continuation<? super C185581> continuation) {
            super(2, continuation);
            this.$networkCall = function3;
            this.$firstPageParams = p;
            this.$previousMapping = function1;
            this.$nextMapping = function12;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C185581 c185581 = new C185581(this.$networkCall, this.$firstPageParams, this.$previousMapping, this.$nextMapping, continuation);
            c185581.L$0 = obj;
            return c185581;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super IdlPaginatedResult<? extends T>> flowCollector, Continuation<? super Unit> continuation) {
            return ((C185581) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
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
            Dto3 dto3;
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
                dto3 = (Dto3) obj;
                if (dto3 != null) {
                }
                flowCollector = flowCollector2;
                if (dto3 != null) {
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
            dto3 = (Dto3) this.L$1;
            flowCollector2 = (FlowCollector) this.L$0;
            ResultKt.throwOnFailure(obj);
            flowCollector = flowCollector2;
            idlPaginationCursorInvoke = dto3 != null ? this.$nextMapping.invoke(dto3) : null;
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
                dto3 = (Dto3) obj;
                if (dto3 != null) {
                    IdlPaginatedResult idlPaginatedResult = new IdlPaginatedResult(dto3, this.$previousMapping.invoke(dto3), this.$nextMapping.invoke(dto3));
                    this.L$0 = flowCollector2;
                    this.L$1 = dto3;
                    this.label = 2;
                }
                flowCollector = flowCollector2;
                if (dto3 != null) {
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

    public static final <P, T extends Dto3<?>> Flow<IdlPaginatedResult<T>> paginate(P p, Function3<? super P, ? super IdlPaginationCursor, ? super Continuation<? super T>, ? extends Object> networkCall, Function1<? super T, IdlPaginationCursor> previousMapping, Function1<? super T, IdlPaginationCursor> nextMapping) {
        Intrinsics.checkNotNullParameter(networkCall, "networkCall");
        Intrinsics.checkNotNullParameter(previousMapping, "previousMapping");
        Intrinsics.checkNotNullParameter(nextMapping, "nextMapping");
        return FlowKt.flow(new C185581(networkCall, p, previousMapping, nextMapping, null));
    }

    public static final <T extends Dto3<?>> Flow<IdlPaginatedResult<T>> fetchAllPages(IdlPaginationEndpoint<Unit, T> idlPaginationEndpoint) {
        Intrinsics.checkNotNullParameter(idlPaginationEndpoint, "<this>");
        return idlPaginationEndpoint.fetchAllPages(Unit.INSTANCE);
    }

    public static final <T extends Dto3<?>> Flow<IdlPaginatedResult<T>> forceFetchAllPages(IdlPaginationEndpoint<Unit, T> idlPaginationEndpoint) {
        Intrinsics.checkNotNullParameter(idlPaginationEndpoint, "<this>");
        return idlPaginationEndpoint.forceFetchAllPages(Unit.INSTANCE);
    }

    public static /* synthetic */ Flow pollAllPages$default(IdlPaginationEndpoint idlPaginationEndpoint, Duration duration, int i, Object obj) {
        if ((i & 1) != 0) {
            duration = Duration.ofSeconds(5L);
        }
        return pollAllPages(idlPaginationEndpoint, duration);
    }

    public static final <T extends Dto3<?>> Flow<IdlPaginatedResult<T>> pollAllPages(IdlPaginationEndpoint<Unit, T> idlPaginationEndpoint, Duration duration) {
        Intrinsics.checkNotNullParameter(idlPaginationEndpoint, "<this>");
        Intrinsics.checkNotNullParameter(duration, "duration");
        return idlPaginationEndpoint.pollAllPages(Unit.INSTANCE, duration);
    }

    public static /* synthetic */ Job refreshAllPages$default(IdlPaginationEndpoint idlPaginationEndpoint, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return refreshAllPages(idlPaginationEndpoint, z);
    }

    public static final <T extends Dto3<?>> Job refreshAllPages(IdlPaginationEndpoint<Unit, T> idlPaginationEndpoint, boolean z) {
        Intrinsics.checkNotNullParameter(idlPaginationEndpoint, "<this>");
        return idlPaginationEndpoint.refreshAllPages(Unit.INSTANCE, z);
    }
}
