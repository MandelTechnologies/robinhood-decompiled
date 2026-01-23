package androidx.room.coroutines;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferred3;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope3;
import kotlinx.coroutines.CoroutineStart;

/* compiled from: RunBlockingUninterruptible.android.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a<\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012'\u0010\u0002\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0002\b\u0007H\u0000¢\u0006\u0002\u0010\b¨\u0006\t"}, m3636d2 = {"runBlockingUninterruptible", "T", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "room-runtime_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes4.dex */
public final class RunBlockingUninterruptible_androidKt {
    public static final <T> T runBlockingUninterruptible(Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Thread.interrupted();
        return (T) BuildersKt__BuildersKt.runBlocking$default(null, new C29101(block, null), 1, null);
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: RunBlockingUninterruptible.android.kt */
    @Metadata(m3635d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1", m3645f = "RunBlockingUninterruptible.android.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1 */
    static final class C29101<T> extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super T>, Object> {
        final /* synthetic */ Function2<CoroutineScope, Continuation<? super T>, Object> $block;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C29101(Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super C29101> continuation) {
            super(2, continuation);
            this.$block = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C29101 c29101 = new C29101(this.$block, continuation);
            c29101.L$0 = obj;
            return c29101;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super T> continuation) {
            return ((C29101) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineContext.Element element = ((CoroutineScope) this.L$0).getCoroutineContext().get(ContinuationInterceptor.INSTANCE);
            Intrinsics.checkNotNull(element);
            ContinuationInterceptor continuationInterceptor = (ContinuationInterceptor) element;
            CompletableDeferred completableDeferredCompletableDeferred$default = CompletableDeferred3.CompletableDeferred$default(null, 1, null);
            BuildersKt.launch(CoroutineScope3.INSTANCE, continuationInterceptor, CoroutineStart.UNDISPATCHED, new AnonymousClass1(completableDeferredCompletableDeferred$default, this.$block, null));
            while (!completableDeferredCompletableDeferred$default.isCompleted()) {
                try {
                    return BuildersKt.runBlocking(continuationInterceptor, new AnonymousClass2(completableDeferredCompletableDeferred$default, null));
                } catch (InterruptedException unused) {
                }
            }
            return completableDeferredCompletableDeferred$default.getCompleted();
        }

        /* compiled from: RunBlockingUninterruptible.android.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1$1", m3645f = "RunBlockingUninterruptible.android.kt", m3646l = {52}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function2<CoroutineScope, Continuation<? super T>, Object> $block;
            final /* synthetic */ CompletableDeferred<T> $deferred;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(CompletableDeferred<T> completableDeferred, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$deferred = completableDeferred;
                this.$block = function2;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$deferred, this.$block, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                CompletableDeferred<T> completableDeferred;
                Object objM28550constructorimpl;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                    CompletableDeferred<T> completableDeferred2 = this.$deferred;
                    Function2<CoroutineScope, Continuation<? super T>, Object> function2 = this.$block;
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        this.L$0 = completableDeferred2;
                        this.label = 1;
                        obj = function2.invoke(coroutineScope, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        completableDeferred = completableDeferred2;
                    } catch (Throwable th) {
                        th = th;
                        completableDeferred = completableDeferred2;
                        Result.Companion companion2 = Result.INSTANCE;
                        objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                        CompletableDeferred3.completeWith(completableDeferred, objM28550constructorimpl);
                        return Unit.INSTANCE;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    completableDeferred = (CompletableDeferred) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        Result.Companion companion22 = Result.INSTANCE;
                        objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                        CompletableDeferred3.completeWith(completableDeferred, objM28550constructorimpl);
                        return Unit.INSTANCE;
                    }
                }
                objM28550constructorimpl = Result.m28550constructorimpl(obj);
                CompletableDeferred3.completeWith(completableDeferred, objM28550constructorimpl);
                return Unit.INSTANCE;
            }
        }

        /* compiled from: RunBlockingUninterruptible.android.kt */
        @Metadata(m3635d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1$2", m3645f = "RunBlockingUninterruptible.android.kt", m3646l = {58}, m3647m = "invokeSuspend")
        /* renamed from: androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super T>, Object> {
            final /* synthetic */ CompletableDeferred<T> $deferred;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(CompletableDeferred<T> completableDeferred, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$deferred = completableDeferred;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.$deferred, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super T> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                CompletableDeferred<T> completableDeferred = this.$deferred;
                this.label = 1;
                Object objAwait = completableDeferred.await(this);
                return objAwait == coroutine_suspended ? coroutine_suspended : objAwait;
            }
        }
    }
}
