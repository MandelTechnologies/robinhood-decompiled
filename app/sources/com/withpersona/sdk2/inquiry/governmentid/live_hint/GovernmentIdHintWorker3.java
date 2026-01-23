package com.withpersona.sdk2.inquiry.governmentid.live_hint;

import com.withpersona.sdk2.camera.GovernmentIdFeed;
import com.withpersona.sdk2.camera.GovernmentIdFeed5;
import com.withpersona.sdk2.inquiry.governmentid.live_hint.GovernmentIdHintWorker;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: GovernmentIdHintWorker.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/GovernmentIdHintWorker$HintEvent;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.governmentid.live_hint.GovernmentIdHintWorker$run$hintFlow$1", m3645f = "GovernmentIdHintWorker.kt", m3646l = {76}, m3647m = "invokeSuspend")
/* renamed from: com.withpersona.sdk2.inquiry.governmentid.live_hint.GovernmentIdHintWorker$run$hintFlow$1, reason: use source file name */
/* loaded from: classes18.dex */
final class GovernmentIdHintWorker3 extends ContinuationImpl7 implements Function2<FlowCollector<? super GovernmentIdHintWorker.HintEvent>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ GovernmentIdHintWorker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GovernmentIdHintWorker3(GovernmentIdHintWorker governmentIdHintWorker, Continuation<? super GovernmentIdHintWorker3> continuation) {
        super(2, continuation);
        this.this$0 = governmentIdHintWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GovernmentIdHintWorker3 governmentIdHintWorker3 = new GovernmentIdHintWorker3(this.this$0, continuation);
        governmentIdHintWorker3.L$0 = obj;
        return governmentIdHintWorker3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super GovernmentIdHintWorker.HintEvent> flowCollector, Continuation<? super Unit> continuation) {
        return ((GovernmentIdHintWorker3) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final FlowCollector flowCollector = (FlowCollector) this.L$0;
            GovernmentIdFeed governmentIdFeed = this.this$0.governmentIdFeed;
            final GovernmentIdHintWorker governmentIdHintWorker = this.this$0;
            FlowCollector<? super Result<? extends GovernmentIdFeed5>> flowCollector2 = new FlowCollector() { // from class: com.withpersona.sdk2.inquiry.governmentid.live_hint.GovernmentIdHintWorker$run$hintFlow$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation<? super Unit> continuation) {
                    Object value = ((Result) obj2).getValue();
                    FlowCollector<GovernmentIdHintWorker.HintEvent> flowCollector3 = flowCollector;
                    GovernmentIdHintWorker governmentIdHintWorker2 = governmentIdHintWorker;
                    if (Result.m28553exceptionOrNullimpl(value) == null) {
                        Object objEmit = flowCollector3.emit(governmentIdHintWorker2.getHintEventFor((GovernmentIdFeed5) value), continuation);
                        if (objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            return objEmit;
                        }
                    } else {
                        Object objEmit2 = flowCollector3.emit(null, continuation);
                        if (objEmit2 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            return objEmit2;
                        }
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (governmentIdFeed.collect(flowCollector2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new ExceptionsH();
    }
}
