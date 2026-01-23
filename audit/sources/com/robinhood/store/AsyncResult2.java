package com.robinhood.store;

import com.robinhood.store.AsyncResult;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: AsyncResult.kt */
@Metadata(m3635d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a`\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001\"\u0004\b\u0000\u0010\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u000126\u0010\u0004\u001a2\u0012\u0013\u0012\u0011H\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u0011H\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0005\u001a;\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001\"\u0004\b\u0000\u0010\u00032\u001c\u0010\f\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\r¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"distinctUntilValueChanged", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/store/AsyncResult;", "T", "areEquivalent", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "old", "new", "", "flowCatching", "request", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/Flow;", "lib-store_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.store.AsyncResultKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class AsyncResult2 {
    public static final <T> Flow<AsyncResult<T>> distinctUntilValueChanged(Flow<? extends AsyncResult<? extends T>> flow, final Function2<? super T, ? super T, Boolean> areEquivalent) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(areEquivalent, "areEquivalent");
        return FlowKt.distinctUntilChanged(flow, new Function2() { // from class: com.robinhood.store.AsyncResultKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(AsyncResult2.distinctUntilValueChanged$lambda$0(areEquivalent, (AsyncResult) obj, (AsyncResult) obj2));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean distinctUntilValueChanged$lambda$0(Function2 function2, AsyncResult old, AsyncResult asyncResult) {
        Intrinsics.checkNotNullParameter(old, "old");
        Intrinsics.checkNotNullParameter(asyncResult, "new");
        if (old instanceof AsyncResult.Success) {
            if (asyncResult instanceof AsyncResult.Success) {
                return ((Boolean) function2.invoke(((AsyncResult.Success) old).getValue(), ((AsyncResult.Success) asyncResult).getValue())).booleanValue();
            }
            return false;
        }
        if (old instanceof AsyncResult.Failure) {
            return Intrinsics.areEqual(asyncResult.getErrorValue(), ((AsyncResult.Failure) old).getException());
        }
        if (Intrinsics.areEqual(old, AsyncResult.Loading.INSTANCE)) {
            return asyncResult instanceof AsyncResult.Loading;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: AsyncResult.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/store/AsyncResult;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.AsyncResultKt$flowCatching$1", m3645f = "AsyncResult.kt", m3646l = {54, 56, 57, 59}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.store.AsyncResultKt$flowCatching$1 */
    static final class C412781<T> extends ContinuationImpl7 implements Function2<FlowCollector<? super AsyncResult<? extends T>>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<Continuation<? super T>, Object> $request;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C412781(Function1<? super Continuation<? super T>, ? extends Object> function1, Continuation<? super C412781> continuation) {
            super(2, continuation);
            this.$request = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C412781 c412781 = new C412781(this.$request, continuation);
            c412781.L$0 = obj;
            return c412781;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super AsyncResult<? extends T>> flowCollector, Continuation<? super Unit> continuation) {
            return ((C412781) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x0069, code lost:
        
            if (r1.emit(r4, r6) != r0) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x007a, code lost:
        
            if (r1.emit(r3, r6) != r0) goto L33;
         */
        /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlinx.coroutines.flow.FlowCollector] */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            FlowCollector flowCollector;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ?? r1 = this.label;
            try {
            } catch (Throwable th) {
                AsyncResult.Failure failure = new AsyncResult.Failure(th);
                this.L$0 = null;
                this.label = 4;
            }
            if (r1 == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector2 = (FlowCollector) this.L$0;
                AsyncResult.Loading loading = AsyncResult.Loading.INSTANCE;
                this.L$0 = flowCollector2;
                this.label = 1;
                if (flowCollector2.emit(loading, this) != coroutine_suspended) {
                    flowCollector = flowCollector2;
                }
                return coroutine_suspended;
            }
            if (r1 == 1) {
                flowCollector = (FlowCollector) this.L$0;
                ResultKt.throwOnFailure(obj);
            } else if (r1 == 2) {
                flowCollector = (FlowCollector) this.L$0;
                ResultKt.throwOnFailure(obj);
                AsyncResult.Success success = new AsyncResult.Success(obj);
                this.L$0 = flowCollector;
                this.label = 3;
            } else {
                if (r1 == 3) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (r1 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            Function1<Continuation<? super T>, Object> function1 = this.$request;
            this.L$0 = flowCollector;
            this.label = 2;
            obj = function1.invoke(this);
            if (obj != coroutine_suspended) {
                AsyncResult.Success success2 = new AsyncResult.Success(obj);
                this.L$0 = flowCollector;
                this.label = 3;
            }
            return coroutine_suspended;
        }
    }

    public static final <T> Flow<AsyncResult<T>> flowCatching(Function1<? super Continuation<? super T>, ? extends Object> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return FlowKt.flow(new C412781(request, null));
    }
}
