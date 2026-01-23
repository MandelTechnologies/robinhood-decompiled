package com.robinhood.android.optionsupgrade.knowledgecheckneeded;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import p479j$.time.Instant;

/* compiled from: OptionOnboardingKnowledgeCheckNeededDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m3636d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "j$/time/Instant", "kotlin.jvm.PlatformType", "", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;)V"}, m3637k = 3, m3638mv = {2, 1, 0})
@DebugMetadata(m3644c = "com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededDuxo$currentInstantFlow$1", m3645f = "OptionOnboardingKnowledgeCheckNeededDuxo.kt", m3646l = {49, 50}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededDuxo$currentInstantFlow$1, reason: use source file name */
/* loaded from: classes11.dex */
final class OptionOnboardingKnowledgeCheckNeededDuxo2 extends ContinuationImpl7 implements Function2<FlowCollector<? super Instant>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OptionOnboardingKnowledgeCheckNeededDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OptionOnboardingKnowledgeCheckNeededDuxo2(OptionOnboardingKnowledgeCheckNeededDuxo optionOnboardingKnowledgeCheckNeededDuxo, Continuation<? super OptionOnboardingKnowledgeCheckNeededDuxo2> continuation) {
        super(2, continuation);
        this.this$0 = optionOnboardingKnowledgeCheckNeededDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OptionOnboardingKnowledgeCheckNeededDuxo2 optionOnboardingKnowledgeCheckNeededDuxo2 = new OptionOnboardingKnowledgeCheckNeededDuxo2(this.this$0, continuation);
        optionOnboardingKnowledgeCheckNeededDuxo2.L$0 = obj;
        return optionOnboardingKnowledgeCheckNeededDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super Instant> flowCollector, Continuation<? super Unit> continuation) {
        return ((OptionOnboardingKnowledgeCheckNeededDuxo2) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(5000, r6) != r0) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004e -> B:7:0x0015). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        FlowCollector flowCollector2;
        Instant instant;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            flowCollector = (FlowCollector) this.L$0;
            instant = this.this$0.clock.instant();
            this.L$0 = flowCollector;
            this.label = 1;
            if (flowCollector.emit(instant, this) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            flowCollector2 = (FlowCollector) this.L$0;
            ResultKt.throwOnFailure(obj);
            flowCollector = flowCollector2;
            instant = this.this$0.clock.instant();
            this.L$0 = flowCollector;
            this.label = 1;
            if (flowCollector.emit(instant, this) != coroutine_suspended) {
                flowCollector2 = flowCollector;
                this.L$0 = flowCollector2;
                this.label = 2;
            }
            return coroutine_suspended;
        }
        flowCollector2 = (FlowCollector) this.L$0;
        ResultKt.throwOnFailure(obj);
        this.L$0 = flowCollector2;
        this.label = 2;
    }
}
