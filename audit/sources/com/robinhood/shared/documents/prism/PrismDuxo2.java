package com.robinhood.shared.documents.prism;

import com.robinhood.models.api.identi.ApiVideoSelfieThresholds;
import com.robinhood.shared.documents.prism.PrismEvent;
import com.robinhood.shared.documents.prism.timeseries.PrismTimeSeriesEntry;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: PrismDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/documents/prism/PrismDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.documents.prism.PrismDuxo$updateState$1", m3645f = "PrismDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.documents.prism.PrismDuxo$updateState$1, reason: use source file name */
/* loaded from: classes6.dex */
final class PrismDuxo2 extends ContinuationImpl7 implements Function2<PrismDataState, Continuation<? super PrismDataState>, Object> {
    final /* synthetic */ PrismState $newState;
    final /* synthetic */ long $stateChangeDelay;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PrismDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PrismDuxo2(PrismDuxo prismDuxo, PrismState prismState, long j, Continuation<? super PrismDuxo2> continuation) {
        super(2, continuation);
        this.this$0 = prismDuxo;
        this.$newState = prismState;
        this.$stateChangeDelay = j;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PrismDuxo2 prismDuxo2 = new PrismDuxo2(this.this$0, this.$newState, this.$stateChangeDelay, continuation);
        prismDuxo2.L$0 = obj;
        return prismDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PrismDataState prismDataState, Continuation<? super PrismDataState> continuation) {
        return ((PrismDuxo2) create(prismDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            PrismDataState prismDataState = (PrismDataState) this.L$0;
            if (this.this$0.pauseStateChanges || prismDataState.getState() == this.$newState) {
                return prismDataState;
            }
            this.this$0.pauseStateChanges = true;
            BuildersKt__Builders_commonKt.launch$default(this.this$0.getLifecycleScope(), null, null, new C387711(this.this$0, this.$newState, this.$stateChangeDelay, null), 3, null);
            PrismState state = prismDataState.getState();
            PrismState prismState = PrismState.INSUFFICIENT_MOTION;
            if (state != prismState && this.$newState == PrismState.FACE_SCANNING) {
                PrismDuxo prismDuxo = this.this$0;
                ApiVideoSelfieThresholds apiVideoSelfieThresholds = this.this$0.thresholds;
                if (apiVideoSelfieThresholds == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("thresholds");
                    apiVideoSelfieThresholds = null;
                }
                prismDuxo.submit(new PrismEvent.StartCapture(apiVideoSelfieThresholds.getVideoBitRate()));
            } else if (this.$newState == prismState) {
                PrismDuxo prismDuxo2 = this.this$0;
                ApiVideoSelfieThresholds apiVideoSelfieThresholds2 = this.this$0.thresholds;
                if (apiVideoSelfieThresholds2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("thresholds");
                    apiVideoSelfieThresholds2 = null;
                }
                prismDuxo2.submit(new PrismEvent.StartCapture(apiVideoSelfieThresholds2.getVideoBitRate()));
                this.this$0.waitForMotion = true;
            }
            return PrismDataState.copy$default(prismDataState, false, this.$newState, 1, null);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* compiled from: PrismDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.documents.prism.PrismDuxo$updateState$1$1", m3645f = "PrismDuxo.kt", m3646l = {441}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.documents.prism.PrismDuxo$updateState$1$1 */
    static final class C387711 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ PrismState $newState;
        final /* synthetic */ long $stateChangeDelay;
        int label;
        final /* synthetic */ PrismDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C387711(PrismDuxo prismDuxo, PrismState prismState, long j, Continuation<? super C387711> continuation) {
            super(2, continuation);
            this.this$0 = prismDuxo;
            this.$newState = prismState;
            this.$stateChangeDelay = j;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C387711(this.this$0, this.$newState, this.$stateChangeDelay, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C387711) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.this$0.timeSeriesEntries.add(new PrismTimeSeriesEntry(0L, this.$newState.name(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777213, null));
                this.this$0.logStateChange(this.$newState);
                long j = this.$stateChangeDelay;
                this.label = 1;
                if (DelayKt.delay(j, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.this$0.pauseStateChanges = false;
            return Unit.INSTANCE;
        }
    }
}
