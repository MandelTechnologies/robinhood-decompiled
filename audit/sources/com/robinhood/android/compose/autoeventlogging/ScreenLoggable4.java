package com.robinhood.android.compose.autoeventlogging;

import androidx.compose.runtime.SnapshotState;
import com.robinhood.android.performancelogger.PerformanceLogger;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ScreenLoggable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.compose.autoeventlogging.ScreenLoggableKt$ScreenLoggable$8$1", m3645f = "ScreenLoggable.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.compose.autoeventlogging.ScreenLoggableKt$ScreenLoggable$8$1, reason: use source file name */
/* loaded from: classes2.dex */
final class ScreenLoggable4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ UUID $contextualId;
    final /* synthetic */ SnapshotState<Boolean> $hasLoggedOnce$delegate;
    final /* synthetic */ boolean $logOnce;
    final /* synthetic */ SnapshotState<ScreenLoggable> $loggedState$delegate;
    final /* synthetic */ Function0<Unit> $onLoadCompleted;
    final /* synthetic */ PerformanceLogger $performanceLogger;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScreenLoggable4(SnapshotState<ScreenLoggable> snapshotState, PerformanceLogger performanceLogger, UUID uuid, Function0<Unit> function0, SnapshotState<Boolean> snapshotState2, boolean z, Continuation<? super ScreenLoggable4> continuation) {
        super(2, continuation);
        this.$loggedState$delegate = snapshotState;
        this.$performanceLogger = performanceLogger;
        this.$contextualId = uuid;
        this.$onLoadCompleted = function0;
        this.$hasLoggedOnce$delegate = snapshotState2;
        this.$logOnce = z;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ScreenLoggable4(this.$loggedState$delegate, this.$performanceLogger, this.$contextualId, this.$onLoadCompleted, this.$hasLoggedOnce$delegate, this.$logOnce, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ScreenLoggable4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            ScreenLoggable screenLoggableScreenLoggable$lambda$13 = ScreenLoggable2.ScreenLoggable$lambda$13(this.$loggedState$delegate);
            boolean z = this.$logOnce;
            final SnapshotState<Boolean> snapshotState = this.$hasLoggedOnce$delegate;
            SnapshotState<ScreenLoggable> snapshotState2 = this.$loggedState$delegate;
            ScreenLoggable screenLoggable = ScreenLoggable.STARTED;
            ScreenLoggable screenLoggable2 = ScreenLoggable.COMPLETED;
            final PerformanceLogger performanceLogger = this.$performanceLogger;
            final UUID uuid = this.$contextualId;
            final Function0<Unit> function0 = this.$onLoadCompleted;
            ScreenLoggable2.ScreenLoggable$compareAndSet(screenLoggableScreenLoggable$lambda$13, z, snapshotState, snapshotState2, screenLoggable, screenLoggable2, new Function0() { // from class: com.robinhood.android.compose.autoeventlogging.ScreenLoggableKt$ScreenLoggable$8$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ScreenLoggable4.invokeSuspend$lambda$0(performanceLogger, uuid, function0, snapshotState);
                }
            });
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(PerformanceLogger performanceLogger, UUID uuid, Function0 function0, SnapshotState snapshotState) {
        ScreenLoggable2.ScreenLoggable$lambda$18(snapshotState, true);
        performanceLogger.completeMetric(PerformanceMetricEventData.Name.SCREEN_LOAD, uuid);
        function0.invoke();
        return Unit.INSTANCE;
    }
}
