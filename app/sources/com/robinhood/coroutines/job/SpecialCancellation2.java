package com.robinhood.coroutines.job;

import com.robinhood.coroutines.job.SpecialCancellation2;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.Job4;

/* compiled from: SpecialCancellation.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aA\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022'\u0010\u0003\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004¢\u0006\u0002\b\bH\u0086@¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"withCancellation", "R", "Lkotlinx/coroutines/Job;", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/Job;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-coroutines"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.coroutines.job.SpecialCancellationKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class SpecialCancellation2 {

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: SpecialCancellation.kt */
    @Metadata(m3635d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "R", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.coroutines.job.SpecialCancellationKt$withCancellation$2", m3645f = "SpecialCancellation.kt", m3646l = {25}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.coroutines.job.SpecialCancellationKt$withCancellation$2 */
    static final class C329882<R> extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super R>, Object> {
        final /* synthetic */ Function2<CoroutineScope, Continuation<? super R>, Object> $block;
        final /* synthetic */ Job $this_withCancellation;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C329882(Function2<? super CoroutineScope, ? super Continuation<? super R>, ? extends Object> function2, Job job, Continuation<? super C329882> continuation) {
            super(2, continuation);
            this.$block = function2;
            this.$this_withCancellation = job;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C329882 c329882 = new C329882(this.$block, this.$this_withCancellation, continuation);
            c329882.L$0 = obj;
            return c329882;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super R> continuation) {
            return ((C329882) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.DisposableHandle] */
        /* JADX WARN: Type inference failed for: r1v4, types: [kotlinx.coroutines.DisposableHandle] */
        /* JADX WARN: Type inference failed for: r1v7 */
        /* JADX WARN: Type inference failed for: r1v8 */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ?? r1 = this.label;
            try {
                if (r1 == 0) {
                    ResultKt.throwOnFailure(obj);
                    final Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default((CoroutineScope) this.L$0, null, null, this.$block, 3, null);
                    final Job job = this.$this_withCancellation;
                    Job4 job4InvokeOnCompletion = job.invokeOnCompletion(new Function1() { // from class: com.robinhood.coroutines.job.SpecialCancellationKt$withCancellation$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return SpecialCancellation2.C329882.invokeSuspend$lambda$0(deferredAsync$default, job, (Throwable) obj2);
                        }
                    });
                    this.L$0 = job4InvokeOnCompletion;
                    this.label = 1;
                    obj = deferredAsync$default.await(this);
                    r1 = job4InvokeOnCompletion;
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (r1 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Job4 job4 = (Job4) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    r1 = job4;
                }
                r1.dispose();
                return obj;
            } catch (Throwable th) {
                r1.dispose();
                throw th;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(Deferred deferred, Job job, Throwable th) {
            if (th != null) {
                deferred.cancel((CancellationException) new SpecialCancellation("Exception in " + job, th));
            }
            return Unit.INSTANCE;
        }
    }

    public static final <R> Object withCancellation(Job job, Function2<? super CoroutineScope, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super R> continuation) {
        return CoroutineScope2.coroutineScope(new C329882(function2, job, null), continuation);
    }
}
