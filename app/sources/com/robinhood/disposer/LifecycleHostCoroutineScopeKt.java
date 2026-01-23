package com.robinhood.disposer;

import android.annotation.SuppressLint;
import com.plaid.internal.EnumC7081g;
import dispatch.core.DispatcherProvider;
import dispatch.core.Suspend;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiConsumer;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbes;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.Mutex3;

/* compiled from: LifecycleHostCoroutineScope.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a.\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f\u001aC\u0010\r\u001a\u00020\u000e*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00102'\u0010\u0011\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0012¢\u0006\u0002\b\u0016H\u0082@¢\u0006\u0002\u0010\u0017\u001aI\u0010\u0018\u001a\u0002H\u0019\"\u0004\b\u0000\u0010\u0019*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00102'\u0010\u0011\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00190\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0012¢\u0006\u0002\b\u0016H\u0083@¢\u0006\u0002\u0010\u0017¨\u0006\u001b"}, m3636d2 = {"createDuxoLifecycleScope", "Lcom/robinhood/disposer/ClosableLifecycleHostCoroutineScope;", "Lcom/robinhood/disposer/LifecycleHost;", "dispatcherProvider", "Ldispatch/core/DispatcherProvider;", "exceptionHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "createLifecycleScope", "defaultExceptionHandler", "uiExceptionHandler", "Lcom/robinhood/disposer/UiUncaughtExceptionHandler;", "closeOnDestroy", "", "repeatOnLifecycle", "", "state", "Lcom/robinhood/disposer/LifecycleState;", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lcom/robinhood/disposer/LifecycleHost;Lcom/robinhood/disposer/LifecycleState;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "whenStateAtLeast", "T", "minState", "lib-utils-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class LifecycleHostCoroutineScopeKt {
    public static final ClosableLifecycleHostCoroutineScope createDuxoLifecycleScope(LifecycleHost lifecycleHost, DispatcherProvider dispatcherProvider, CoroutineExceptionHandler exceptionHandler) {
        Intrinsics.checkNotNullParameter(lifecycleHost, "<this>");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(exceptionHandler, "exceptionHandler");
        String simpleName = lifecycleHost.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        return new ClosableLifecycleHostCoroutineScope(lifecycleHost, dispatcherProvider, exceptionHandler, false, simpleName);
    }

    public static /* synthetic */ ClosableLifecycleHostCoroutineScope createLifecycleScope$default(LifecycleHost lifecycleHost, DispatcherProvider dispatcherProvider, CoroutineExceptionHandler coroutineExceptionHandler, UiUncaughtExceptionHandler uiUncaughtExceptionHandler, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = true;
        }
        return createLifecycleScope(lifecycleHost, dispatcherProvider, coroutineExceptionHandler, uiUncaughtExceptionHandler, z);
    }

    public static final ClosableLifecycleHostCoroutineScope createLifecycleScope(LifecycleHost lifecycleHost, DispatcherProvider dispatcherProvider, CoroutineExceptionHandler defaultExceptionHandler, UiUncaughtExceptionHandler uiUncaughtExceptionHandler, boolean z) {
        Intrinsics.checkNotNullParameter(lifecycleHost, "<this>");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(defaultExceptionHandler, "defaultExceptionHandler");
        LifecycleCoroutineExceptionHandler lifecycleCoroutineExceptionHandler = new LifecycleCoroutineExceptionHandler(defaultExceptionHandler, uiUncaughtExceptionHandler);
        String simpleName = lifecycleHost.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        return new ClosableLifecycleHostCoroutineScope(lifecycleHost, dispatcherProvider, lifecycleCoroutineExceptionHandler, z, simpleName);
    }

    /* compiled from: LifecycleHostCoroutineScope.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.disposer.LifecycleHostCoroutineScopeKt$repeatOnLifecycle$2", m3645f = "LifecycleHostCoroutineScope.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_TEXT_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.disposer.LifecycleHostCoroutineScopeKt$repeatOnLifecycle$2 */
    /* loaded from: classes15.dex */
    static final class C330792 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<CoroutineScope, Continuation<? super Unit>, Object> $block;
        final /* synthetic */ LifecycleState $state;
        final /* synthetic */ LifecycleHost $this_repeatOnLifecycle;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C330792(LifecycleState lifecycleState, LifecycleHost lifecycleHost, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super C330792> continuation) {
            super(2, continuation);
            this.$state = lifecycleState;
            this.$this_repeatOnLifecycle = lifecycleHost;
            this.$block = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C330792 c330792 = new C330792(this.$state, this.$this_repeatOnLifecycle, this.$block, continuation);
            c330792.L$0 = obj;
            return c330792;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C330792) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: LifecycleHostCoroutineScope.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.disposer.LifecycleHostCoroutineScopeKt$repeatOnLifecycle$2$1", m3645f = "LifecycleHostCoroutineScope.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.disposer.LifecycleHostCoroutineScopeKt$repeatOnLifecycle$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ CoroutineScope $$this$coroutineScope;
            final /* synthetic */ Function2<CoroutineScope, Continuation<? super Unit>, Object> $block;
            final /* synthetic */ LifecycleState $state;
            final /* synthetic */ LifecycleHost $this_repeatOnLifecycle;
            Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            Object L$4;
            Object L$5;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(LifecycleHost lifecycleHost, LifecycleState lifecycleState, CoroutineScope coroutineScope, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$this_repeatOnLifecycle = lifecycleHost;
                this.$state = lifecycleState;
                this.$$this$coroutineScope = coroutineScope;
                this.$block = function2;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$this_repeatOnLifecycle, this.$state, this.$$this$coroutineScope, this.$block, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:24:0x00ac  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x00b5  */
            /* JADX WARN: Removed duplicated region for block: B:32:0x00c1  */
            /* JADX WARN: Removed duplicated region for block: B:35:0x00ca  */
            /* JADX WARN: Removed duplicated region for block: B:41:? A[SYNTHETIC] */
            /* JADX WARN: Type inference failed for: r13v4, types: [T, io.reactivex.disposables.Disposable] */
            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) throws Throwable {
                Ref.ObjectRef objectRef;
                Throwable th;
                Ref.ObjectRef objectRef2;
                Job job;
                Disposable disposable;
                Job job2;
                Disposable disposable2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    objectRef = (Ref.ObjectRef) this.L$1;
                    objectRef2 = (Ref.ObjectRef) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        job2 = (Job) objectRef2.element;
                        if (job2 != null) {
                            Job.DefaultImpls.cancel$default(job2, null, 1, null);
                        }
                        disposable2 = (Disposable) objectRef.element;
                        if (disposable2 != null) {
                            disposable2.dispose();
                        }
                        return Unit.INSTANCE;
                    } catch (Throwable th2) {
                        th = th2;
                        job = (Job) objectRef2.element;
                        if (job != null) {
                            Job.DefaultImpls.cancel$default(job, null, 1, null);
                        }
                        disposable = (Disposable) objectRef.element;
                        if (disposable != null) {
                            throw th;
                        }
                        disposable.dispose();
                        throw th;
                    }
                }
                ResultKt.throwOnFailure(obj);
                final Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
                objectRef = new Ref.ObjectRef();
                try {
                    LifecycleHost lifecycleHost = this.$this_repeatOnLifecycle;
                    final LifecycleState lifecycleState = this.$state;
                    final CoroutineScope coroutineScope = this.$$this$coroutineScope;
                    final Function2<CoroutineScope, Continuation<? super Unit>, Object> function2 = this.$block;
                    this.L$0 = objectRef3;
                    this.L$1 = objectRef;
                    this.L$2 = lifecycleHost;
                    this.L$3 = lifecycleState;
                    this.L$4 = coroutineScope;
                    this.L$5 = function2;
                    this.label = 1;
                    final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
                    cancellableContinuationImpl.initCancellability();
                    final Mutex mutexMutex$default = Mutex3.Mutex$default(false, 1, null);
                    Disposable disposableSubscribe = lifecycleHost.getLifecycleState().subscribe(new Consumer() { // from class: com.robinhood.disposer.LifecycleHostCoroutineScopeKt$repeatOnLifecycle$2$1$1$1

                        /* compiled from: LifecycleHostCoroutineScope.kt */
                        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.disposer.LifecycleHostCoroutineScopeKt$repeatOnLifecycle$2$1$1$1$1", m3645f = "LifecycleHostCoroutineScope.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_FINAL_ENROLLMENT_SUCCESS_VALUE, 201}, m3647m = "invokeSuspend")
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.disposer.LifecycleHostCoroutineScopeKt$repeatOnLifecycle$2$1$1$1$1 */
                        static final class C330801 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                            final /* synthetic */ Function2<CoroutineScope, Continuation<? super Unit>, Object> $block;
                            final /* synthetic */ Mutex $mutex;
                            Object L$0;
                            Object L$1;
                            int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            C330801(Mutex mutex, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super C330801> continuation) {
                                super(2, continuation);
                                this.$mutex = mutex;
                                this.$block = function2;
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                return new C330801(this.$mutex, this.$block, continuation);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                return ((C330801) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) throws Throwable {
                                Mutex mutex;
                                Function2<CoroutineScope, Continuation<? super Unit>, Object> function2;
                                Mutex mutex2;
                                Throwable th;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i = this.label;
                                try {
                                    if (i == 0) {
                                        ResultKt.throwOnFailure(obj);
                                        mutex = this.$mutex;
                                        function2 = this.$block;
                                        this.L$0 = mutex;
                                        this.L$1 = function2;
                                        this.label = 1;
                                        if (mutex.lock(null, this) != coroutine_suspended) {
                                        }
                                        return coroutine_suspended;
                                    }
                                    if (i != 1) {
                                        if (i != 2) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        mutex2 = (Mutex) this.L$0;
                                        try {
                                            ResultKt.throwOnFailure(obj);
                                            Unit unit = Unit.INSTANCE;
                                            mutex2.unlock(null);
                                            return Unit.INSTANCE;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            mutex2.unlock(null);
                                            throw th;
                                        }
                                    }
                                    function2 = (Function2) this.L$1;
                                    Mutex mutex3 = (Mutex) this.L$0;
                                    ResultKt.throwOnFailure(obj);
                                    mutex = mutex3;
                                    LifecycleHostCoroutineScopeKt$repeatOnLifecycle$2$1$1$1$1$1$1 lifecycleHostCoroutineScopeKt$repeatOnLifecycle$2$1$1$1$1$1$1 = new LifecycleHostCoroutineScopeKt$repeatOnLifecycle$2$1$1$1$1$1$1(function2, null);
                                    this.L$0 = mutex;
                                    this.L$1 = null;
                                    this.label = 2;
                                    if (CoroutineScope2.coroutineScope(lifecycleHostCoroutineScopeKt$repeatOnLifecycle$2$1$1$1$1$1$1, this) != coroutine_suspended) {
                                        mutex2 = mutex;
                                        Unit unit2 = Unit.INSTANCE;
                                        mutex2.unlock(null);
                                        return Unit.INSTANCE;
                                    }
                                    return coroutine_suspended;
                                } catch (Throwable th3) {
                                    mutex2 = mutex;
                                    th = th3;
                                    mutex2.unlock(null);
                                    throw th;
                                }
                            }
                        }

                        @Override // io.reactivex.functions.Consumer
                        public final void accept(LifecycleState lifecycleState2) {
                            if (objectRef3.element == null && lifecycleState2.compareTo(lifecycleState) >= 0) {
                                objectRef3.element = (T) BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C330801(mutexMutex$default, function2, null), 3, null);
                            } else if (lifecycleState2.compareTo(lifecycleState) < 0) {
                                Job job3 = objectRef3.element;
                                if (job3 != null) {
                                    job3.cancel(new CancellationException("Moved out of target state"));
                                }
                                objectRef3.element = null;
                            }
                        }
                    }, new Consumer() { // from class: com.robinhood.disposer.LifecycleHostCoroutineScopeKt$repeatOnLifecycle$2$1$1$2
                        @Override // io.reactivex.functions.Consumer
                        public final void accept(Throwable th3) throws Throwable {
                            throw th3;
                        }
                    }, new Action() { // from class: com.robinhood.disposer.LifecycleHostCoroutineScopeKt$repeatOnLifecycle$2$1$1$3
                        @Override // io.reactivex.functions.Action
                        public final void run() {
                            CancellableContinuation<Unit> cancellableContinuation = cancellableContinuationImpl;
                            Result.Companion companion = Result.INSTANCE;
                            cancellableContinuation.resumeWith(Result.m28550constructorimpl(Unit.INSTANCE));
                        }
                    });
                    Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
                    objectRef.element = DisposerKt.disposeWhen(disposableSubscribe, lifecycleHost.getLifecycleEvents(), LifecycleEvent.ON_DESTROY);
                    Object result = cancellableContinuationImpl.getResult();
                    if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbes.probeCoroutineSuspended(this);
                    }
                    if (result == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    objectRef2 = objectRef3;
                    job2 = (Job) objectRef2.element;
                    if (job2 != null) {
                    }
                    disposable2 = (Disposable) objectRef.element;
                    if (disposable2 != null) {
                    }
                    return Unit.INSTANCE;
                } catch (Throwable th3) {
                    th = th3;
                    objectRef2 = objectRef3;
                    job = (Job) objectRef2.element;
                    if (job != null) {
                    }
                    disposable = (Disposable) objectRef.element;
                    if (disposable != null) {
                    }
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                CoroutineName coroutineName = new CoroutineName("repeatOnLifecycle " + this.$state);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_repeatOnLifecycle, this.$state, coroutineScope, this.$block, null);
                this.label = 1;
                if (Suspend.withMainImmediate(coroutineName, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object repeatOnLifecycle(LifecycleHost lifecycleHost, LifecycleState lifecycleState, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        Object objCoroutineScope = CoroutineScope2.coroutineScope(new C330792(lifecycleState, lifecycleHost, function2, null), continuation);
        return objCoroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: LifecycleHostCoroutineScope.kt */
    @Metadata(m3635d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.disposer.LifecycleHostCoroutineScopeKt$whenStateAtLeast$2", m3645f = "LifecycleHostCoroutineScope.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.disposer.LifecycleHostCoroutineScopeKt$whenStateAtLeast$2 */
    /* loaded from: classes15.dex */
    static final class C330812<T> extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super T>, Object> {
        final /* synthetic */ Function2<CoroutineScope, Continuation<? super T>, Object> $block;
        final /* synthetic */ LifecycleState $minState;
        final /* synthetic */ LifecycleHost $this_whenStateAtLeast;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C330812(Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2, LifecycleHost lifecycleHost, LifecycleState lifecycleState, Continuation<? super C330812> continuation) {
            super(2, continuation);
            this.$block = function2;
            this.$this_whenStateAtLeast = lifecycleHost;
            this.$minState = lifecycleState;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C330812 c330812 = new C330812(this.$block, this.$this_whenStateAtLeast, this.$minState, continuation);
            c330812.L$0 = obj;
            return c330812;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super T> continuation) {
            return ((C330812) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlin.jvm.internal.Ref$ObjectRef] */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            final Ref.ObjectRef objectRef;
            CoroutineScope coroutineScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ?? r1 = this.label;
            try {
                if (r1 == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                    objectRef = new Ref.ObjectRef();
                    LifecycleHost lifecycleHost = this.$this_whenStateAtLeast;
                    final LifecycleState lifecycleState = this.$minState;
                    this.L$0 = coroutineScope2;
                    this.L$1 = objectRef;
                    this.L$2 = lifecycleHost;
                    this.L$3 = lifecycleState;
                    this.label = 1;
                    final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
                    cancellableContinuationImpl.initCancellability();
                    Disposable disposableSubscribe = lifecycleHost.getLifecycleState().filter(new Predicate() { // from class: com.robinhood.disposer.LifecycleHostCoroutineScopeKt$whenStateAtLeast$2$1$1
                        @Override // io.reactivex.functions.Predicate
                        public final boolean test(LifecycleState it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            return it.compareTo(lifecycleState) >= 0;
                        }
                    }).firstOrError().subscribe(new BiConsumer() { // from class: com.robinhood.disposer.LifecycleHostCoroutineScopeKt$whenStateAtLeast$2$1$2
                        @Override // io.reactivex.functions.BiConsumer
                        public final void accept(LifecycleState lifecycleState2, Throwable th) {
                            CancellableContinuation<Unit> cancellableContinuation = cancellableContinuationImpl;
                            Result.Companion companion = Result.INSTANCE;
                            cancellableContinuation.resumeWith(Result.m28550constructorimpl(Unit.INSTANCE));
                        }
                    });
                    Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
                    objectRef.element = (T) DisposerKt.disposeWhen$default(disposableSubscribe, lifecycleHost.getLifecycleEvents(), null, 2, null);
                    cancellableContinuationImpl.invokeOnCancellation(new Function1<Throwable, Unit>() { // from class: com.robinhood.disposer.LifecycleHostCoroutineScopeKt$whenStateAtLeast$2$1$3
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                            invoke2(th);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(Throwable th) {
                            Disposable disposable = objectRef.element;
                            if (disposable != null) {
                                disposable.dispose();
                            }
                        }
                    });
                    Object result = cancellableContinuationImpl.getResult();
                    if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbes.probeCoroutineSuspended(this);
                    }
                    if (result != coroutine_suspended) {
                        coroutineScope = coroutineScope2;
                    }
                }
                if (r1 != 1) {
                    if (r1 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                objectRef = (Ref.ObjectRef) this.L$1;
                coroutineScope = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                Disposable disposable = (Disposable) objectRef.element;
                if (disposable != null) {
                    disposable.dispose();
                }
                Function2<CoroutineScope, Continuation<? super T>, Object> function2 = this.$block;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 2;
                Object objInvoke = function2.invoke(coroutineScope, this);
                return objInvoke == coroutine_suspended ? coroutine_suspended : objInvoke;
            } catch (Throwable th) {
                Disposable disposable2 = (Disposable) r1.element;
                if (disposable2 != null) {
                    disposable2.dispose();
                }
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"CheckResult"})
    public static final <T> Object whenStateAtLeast(LifecycleHost lifecycleHost, LifecycleState lifecycleState, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        return Suspend.withMainImmediate(new CoroutineName("whenStateAtLeast: " + lifecycleState), new C330812(function2, lifecycleHost, lifecycleState, null), continuation);
    }
}
