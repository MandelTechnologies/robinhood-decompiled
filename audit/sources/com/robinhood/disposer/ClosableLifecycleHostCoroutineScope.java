package com.robinhood.disposer;

import android.annotation.SuppressLint;
import com.plaid.internal.EnumC7081g;
import com.robinhood.utils.p408rx.ScopedSubscriptionKt;
import dispatch.core.DispatcherProvider;
import java.io.Closeable;
import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.Supervisor3;

/* compiled from: LifecycleHostCoroutineScope.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B1\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ>\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182'\u0010\u0019\u001a#\b\u0001\u0012\u0004\u0012\u00020\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001a¢\u0006\u0002\b\u001fH\u0016¢\u0006\u0002\u0010 J6\u0010!\u001a\u00020\u00162'\u0010\u0019\u001a#\b\u0001\u0012\u0004\u0012\u00020\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001a¢\u0006\u0002\b\u001fH\u0017¢\u0006\u0002\u0010\"J6\u0010#\u001a\u00020\u00162'\u0010\u0019\u001a#\b\u0001\u0012\u0004\u0012\u00020\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001a¢\u0006\u0002\b\u001fH\u0017¢\u0006\u0002\u0010\"J6\u0010$\u001a\u00020\u00162'\u0010\u0019\u001a#\b\u0001\u0012\u0004\u0012\u00020\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001a¢\u0006\u0002\b\u001fH\u0017¢\u0006\u0002\u0010\"J\b\u0010%\u001a\u00020\u001dH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006&"}, m3636d2 = {"Lcom/robinhood/disposer/ClosableLifecycleHostCoroutineScope;", "Lcom/robinhood/disposer/LifecycleHostCoroutineScope;", "Ljava/io/Closeable;", "lifecycleHost", "Lcom/robinhood/disposer/LifecycleHost;", "dispatcherProvider", "Ldispatch/core/DispatcherProvider;", "exceptionHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "closeOnDestroy", "", "name", "", "<init>", "(Lcom/robinhood/disposer/LifecycleHost;Ldispatch/core/DispatcherProvider;Lkotlinx/coroutines/CoroutineExceptionHandler;ZLjava/lang/String;)V", "supervisorJob", "Lkotlinx/coroutines/CompletableJob;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "repeatOnLifecycle", "Lkotlinx/coroutines/Job;", "state", "Lcom/robinhood/disposer/LifecycleState;", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "(Lcom/robinhood/disposer/LifecycleState;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", "launchWhenCreated", "(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", "launchWhenStarted", "launchWhenResumed", "close", "lib-utils-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SuppressLint({"CheckResult"})
/* loaded from: classes20.dex */
public final class ClosableLifecycleHostCoroutineScope implements LifecycleHostCoroutineScope, Closeable {
    public static final int $stable = 8;
    private final CoroutineContext coroutineContext;
    private final LifecycleHost lifecycleHost;
    private final CompletableJob supervisorJob;

    public ClosableLifecycleHostCoroutineScope(LifecycleHost lifecycleHost, DispatcherProvider dispatcherProvider, CoroutineExceptionHandler exceptionHandler, boolean z, String name) {
        Intrinsics.checkNotNullParameter(lifecycleHost, "lifecycleHost");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(exceptionHandler, "exceptionHandler");
        Intrinsics.checkNotNullParameter(name, "name");
        this.lifecycleHost = lifecycleHost;
        CompletableJob completableJobSupervisorJob$default = Supervisor3.SupervisorJob$default(null, 1, null);
        this.supervisorJob = completableJobSupervisorJob$default;
        this.coroutineContext = completableJobSupervisorJob$default.plus(new CoroutineName(name)).plus(dispatcherProvider.getMain()).plus(dispatcherProvider).plus(exceptionHandler);
        if (z) {
            DisposerKt.disposeWhen$default(ScopedSubscriptionKt.asDisposable(completableJobSupervisorJob$default, "LifecycleHost terminated"), lifecycleHost.getLifecycleEvents(), null, 2, null);
        }
    }

    @Override // com.robinhood.disposer.LifecycleHostCoroutineScope, kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    /* compiled from: LifecycleHostCoroutineScope.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.disposer.ClosableLifecycleHostCoroutineScope$repeatOnLifecycle$1", m3645f = "LifecycleHostCoroutineScope.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.disposer.ClosableLifecycleHostCoroutineScope$repeatOnLifecycle$1 */
    /* loaded from: classes15.dex */
    static final class C330761 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<CoroutineScope, Continuation<? super Unit>, Object> $block;
        final /* synthetic */ LifecycleState $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C330761(LifecycleState lifecycleState, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super C330761> continuation) {
            super(2, continuation);
            this.$state = lifecycleState;
            this.$block = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ClosableLifecycleHostCoroutineScope.this.new C330761(this.$state, this.$block, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C330761) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                LifecycleHost lifecycleHost = ClosableLifecycleHostCoroutineScope.this.lifecycleHost;
                LifecycleState lifecycleState = this.$state;
                Function2<CoroutineScope, Continuation<? super Unit>, Object> function2 = this.$block;
                this.label = 1;
                if (LifecycleHostCoroutineScopeKt.repeatOnLifecycle(lifecycleHost, lifecycleState, function2, this) == coroutine_suspended) {
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

    @Override // com.robinhood.disposer.LifecycleHostCoroutineScope
    public Job repeatOnLifecycle(LifecycleState state, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(block, "block");
        return BuildersKt__Builders_commonKt.launch$default(this, new CoroutineName("repeatOnLifecycle " + state), null, new C330761(state, block, null), 2, null);
    }

    /* compiled from: LifecycleHostCoroutineScope.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.disposer.ClosableLifecycleHostCoroutineScope$launchWhenCreated$1", m3645f = "LifecycleHostCoroutineScope.kt", m3646l = {EnumC7081g.SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.disposer.ClosableLifecycleHostCoroutineScope$launchWhenCreated$1 */
    /* loaded from: classes15.dex */
    static final class C330731 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<CoroutineScope, Continuation<? super Unit>, Object> $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C330731(Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super C330731> continuation) {
            super(2, continuation);
            this.$block = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ClosableLifecycleHostCoroutineScope.this.new C330731(this.$block, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C330731) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                LifecycleHost lifecycleHost = ClosableLifecycleHostCoroutineScope.this.lifecycleHost;
                LifecycleState lifecycleState = LifecycleState.CREATED;
                Function2<CoroutineScope, Continuation<? super Unit>, Object> function2 = this.$block;
                this.label = 1;
                if (LifecycleHostCoroutineScopeKt.whenStateAtLeast(lifecycleHost, lifecycleState, function2, this) == coroutine_suspended) {
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

    @Override // com.robinhood.disposer.LifecycleHostCoroutineScope
    @Deprecated
    public Job launchWhenCreated(Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return BuildersKt__Builders_commonKt.launch$default(this, new CoroutineName("launchWhenCreated"), null, new C330731(block, null), 2, null);
    }

    /* compiled from: LifecycleHostCoroutineScope.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.disposer.ClosableLifecycleHostCoroutineScope$launchWhenStarted$1", m3645f = "LifecycleHostCoroutineScope.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.disposer.ClosableLifecycleHostCoroutineScope$launchWhenStarted$1 */
    /* loaded from: classes15.dex */
    static final class C330751 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<CoroutineScope, Continuation<? super Unit>, Object> $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C330751(Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super C330751> continuation) {
            super(2, continuation);
            this.$block = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ClosableLifecycleHostCoroutineScope.this.new C330751(this.$block, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C330751) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                LifecycleHost lifecycleHost = ClosableLifecycleHostCoroutineScope.this.lifecycleHost;
                LifecycleState lifecycleState = LifecycleState.STARTED;
                Function2<CoroutineScope, Continuation<? super Unit>, Object> function2 = this.$block;
                this.label = 1;
                if (LifecycleHostCoroutineScopeKt.whenStateAtLeast(lifecycleHost, lifecycleState, function2, this) == coroutine_suspended) {
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

    @Override // com.robinhood.disposer.LifecycleHostCoroutineScope
    @Deprecated
    public Job launchWhenStarted(Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return BuildersKt__Builders_commonKt.launch$default(this, new CoroutineName("launchWhenStarted"), null, new C330751(block, null), 2, null);
    }

    /* compiled from: LifecycleHostCoroutineScope.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.disposer.ClosableLifecycleHostCoroutineScope$launchWhenResumed$1", m3645f = "LifecycleHostCoroutineScope.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.disposer.ClosableLifecycleHostCoroutineScope$launchWhenResumed$1 */
    /* loaded from: classes15.dex */
    static final class C330741 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<CoroutineScope, Continuation<? super Unit>, Object> $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C330741(Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super C330741> continuation) {
            super(2, continuation);
            this.$block = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ClosableLifecycleHostCoroutineScope.this.new C330741(this.$block, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C330741) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                LifecycleHost lifecycleHost = ClosableLifecycleHostCoroutineScope.this.lifecycleHost;
                LifecycleState lifecycleState = LifecycleState.RESUMED;
                Function2<CoroutineScope, Continuation<? super Unit>, Object> function2 = this.$block;
                this.label = 1;
                if (LifecycleHostCoroutineScopeKt.whenStateAtLeast(lifecycleHost, lifecycleState, function2, this) == coroutine_suspended) {
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

    @Override // com.robinhood.disposer.LifecycleHostCoroutineScope
    @Deprecated
    public Job launchWhenResumed(Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return BuildersKt__Builders_commonKt.launch$default(this, new CoroutineName("launchWhenResumed"), null, new C330741(block, null), 2, null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        JobKt.cancel(getCoroutineContext(), new CancellationException("Closed"));
    }
}
