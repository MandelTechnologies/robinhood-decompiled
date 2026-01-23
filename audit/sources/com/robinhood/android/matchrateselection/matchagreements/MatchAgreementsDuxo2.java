package com.robinhood.android.matchrateselection.matchagreements;

import com.robinhood.android.matchrateselection.matchagreements.MatchAgreementsEvent;
import com.robinhood.android.models.retirement.api.contributions.ApiMatchRateSelectionSubmitRequest;
import com.robinhood.android.retirement.match.MatchAgreementState;
import com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementTransfersMatchRateSelectionStore;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MatchAgreementsDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.matchrateselection.matchagreements.MatchAgreementsDuxo$onAgreementsAccepted$2$1", m3645f = "MatchAgreementsDuxo.kt", m3646l = {80}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.matchrateselection.matchagreements.MatchAgreementsDuxo$onAgreementsAccepted$2$1, reason: use source file name */
/* loaded from: classes8.dex */
final class MatchAgreementsDuxo2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ApiMatchRateSelectionSubmitRequest $request;
    int label;
    final /* synthetic */ MatchAgreementsDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MatchAgreementsDuxo2(MatchAgreementsDuxo matchAgreementsDuxo, ApiMatchRateSelectionSubmitRequest apiMatchRateSelectionSubmitRequest, Continuation<? super MatchAgreementsDuxo2> continuation) {
        super(2, continuation);
        this.this$0 = matchAgreementsDuxo;
        this.$request = apiMatchRateSelectionSubmitRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MatchAgreementsDuxo2(this.this$0, this.$request, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MatchAgreementsDuxo2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                RetirementTransfersMatchRateSelectionStore retirementTransfersMatchRateSelectionStore = this.this$0.matchRateSelectionStore;
                ApiMatchRateSelectionSubmitRequest apiMatchRateSelectionSubmitRequest = this.$request;
                this.label = 1;
                if (retirementTransfersMatchRateSelectionStore.submitRetirementMatchRateSelectionInTransfers(apiMatchRateSelectionSubmitRequest, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.this$0.submit(MatchAgreementsEvent.AgreementsSigned.INSTANCE);
            return Unit.INSTANCE;
        } catch (Exception e) {
            this.this$0.submit(new MatchAgreementsEvent.Error(e, false));
            this.this$0.applyMutation(new C216021(null));
            return Unit.INSTANCE;
        }
    }

    /* compiled from: MatchAgreementsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/retirement/match/MatchAgreementState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.matchrateselection.matchagreements.MatchAgreementsDuxo$onAgreementsAccepted$2$1$1", m3645f = "MatchAgreementsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.matchrateselection.matchagreements.MatchAgreementsDuxo$onAgreementsAccepted$2$1$1 */
    static final class C216021 extends ContinuationImpl7 implements Function2<MatchAgreementState, Continuation<? super MatchAgreementState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C216021(Continuation<? super C216021> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C216021 c216021 = new C216021(continuation);
            c216021.L$0 = obj;
            return c216021;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MatchAgreementState matchAgreementState, Continuation<? super MatchAgreementState> continuation) {
            return ((C216021) create(matchAgreementState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return MatchAgreementState.copy$default((MatchAgreementState) this.L$0, null, false, false, 3, null);
        }
    }
}
