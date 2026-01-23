package com.robinhood.android.compose.autoeventlogging;

import com.robinhood.android.autoeventlogging.LoggableViewState2;
import com.robinhood.android.autoeventlogging.PerformanceIndicator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Modifiers.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.compose.autoeventlogging.ModifiersKt$performanceIndicator$2$1$1", m3645f = "Modifiers.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ModifiersKt$performanceIndicator$2$1$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $identifier;
    final /* synthetic */ LoggableViewState2 $loadedState;
    final /* synthetic */ PerformanceIndicatorDispatcher $performanceIndicatorDispatcher;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ModifiersKt$performanceIndicator$2$1$1(PerformanceIndicatorDispatcher performanceIndicatorDispatcher, String str, LoggableViewState2 loggableViewState2, Continuation<? super ModifiersKt$performanceIndicator$2$1$1> continuation) {
        super(2, continuation);
        this.$performanceIndicatorDispatcher = performanceIndicatorDispatcher;
        this.$identifier = str;
        this.$loadedState = loggableViewState2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ModifiersKt$performanceIndicator$2$1$1(this.$performanceIndicatorDispatcher, this.$identifier, this.$loadedState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ModifiersKt$performanceIndicator$2$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        String str;
        PerformanceIndicator.State state;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        PerformanceIndicatorDispatcher performanceIndicatorDispatcher = this.$performanceIndicatorDispatcher;
        if (performanceIndicatorDispatcher != null && (str = this.$identifier) != null) {
            LoggableViewState2 loggableViewState2 = this.$loadedState;
            if (loggableViewState2 instanceof LoggableViewState2.Loading) {
                state = PerformanceIndicator.State.LOADING;
            } else if (loggableViewState2 instanceof LoggableViewState2.Failed) {
                state = PerformanceIndicator.State.FAILED;
            } else {
                if (!(loggableViewState2 instanceof LoggableViewState2.Completed)) {
                    throw new NoWhenBranchMatchedException();
                }
                state = PerformanceIndicator.State.COMPLETED;
            }
            performanceIndicatorDispatcher.m1856xa9ae39e(new PerformanceIndicator(str, state));
        }
        return Unit.INSTANCE;
    }
}
