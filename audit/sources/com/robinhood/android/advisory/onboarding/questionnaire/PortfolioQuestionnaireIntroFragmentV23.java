package com.robinhood.android.advisory.onboarding.questionnaire;

import androidx.compose.runtime.SnapshotState4;
import com.robinhood.android.advisory.onboarding.questionnaire.PortfolioQuestionnaireIntroEvent;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PortfolioQuestionnaireIntroFragmentV2.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.questionnaire.PortfolioQuestionnaireIntroFragmentV2$ComposeContent$3$1", m3645f = "PortfolioQuestionnaireIntroFragmentV2.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.onboarding.questionnaire.PortfolioQuestionnaireIntroFragmentV2$ComposeContent$3$1, reason: use source file name */
/* loaded from: classes7.dex */
final class PortfolioQuestionnaireIntroFragmentV23 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState4<Event<PortfolioQuestionnaireIntroEvent>> $event$delegate;
    int label;
    final /* synthetic */ PortfolioQuestionnaireIntroFragmentV2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PortfolioQuestionnaireIntroFragmentV23(SnapshotState4<Event<PortfolioQuestionnaireIntroEvent>> snapshotState4, PortfolioQuestionnaireIntroFragmentV2 portfolioQuestionnaireIntroFragmentV2, Continuation<? super PortfolioQuestionnaireIntroFragmentV23> continuation) {
        super(2, continuation);
        this.$event$delegate = snapshotState4;
        this.this$0 = portfolioQuestionnaireIntroFragmentV2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PortfolioQuestionnaireIntroFragmentV23(this.$event$delegate, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PortfolioQuestionnaireIntroFragmentV23) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        EventConsumer eventConsumer;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            final Event eventComposeContent$lambda$1 = PortfolioQuestionnaireIntroFragmentV2.ComposeContent$lambda$1(this.$event$delegate);
            if (eventComposeContent$lambda$1 != null) {
                final PortfolioQuestionnaireIntroFragmentV2 portfolioQuestionnaireIntroFragmentV2 = this.this$0;
                if ((eventComposeContent$lambda$1.getData() instanceof PortfolioQuestionnaireIntroEvent.ApplicationCreationFailed) && (eventConsumer = (EventConsumer) eventComposeContent$lambda$1.getGetEventConsumer().invoke()) != null) {
                    eventConsumer.consume(eventComposeContent$lambda$1, new Function1() { // from class: com.robinhood.android.advisory.onboarding.questionnaire.PortfolioQuestionnaireIntroFragmentV2$ComposeContent$3$1$invokeSuspend$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                            m11116invoke(obj2);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m11116invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            AbsErrorHandler.handleError$default(portfolioQuestionnaireIntroFragmentV2.getActivityErrorHandler(), ((PortfolioQuestionnaireIntroEvent.ApplicationCreationFailed) eventComposeContent$lambda$1.getData()).getError(), false, 2, null);
                        }
                    });
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
