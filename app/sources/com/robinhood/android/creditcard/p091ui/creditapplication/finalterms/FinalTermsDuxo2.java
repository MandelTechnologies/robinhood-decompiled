package com.robinhood.android.creditcard.p091ui.creditapplication.finalterms;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.agreements.AgreementsStore;
import com.robinhood.android.agreements.models.UiAgreementWithContent;
import com.robinhood.android.creditcard.p091ui.creditapplication.finalterms.FinalTermsDuxo6;
import com.robinhood.android.models.creditcard.api.IdentityActionType;
import com.robinhood.utils.logging.CrashReporter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: FinalTermsDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsDuxo$onContinue$1$1", m3645f = "FinalTermsDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE, 147}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsDuxo$onContinue$1$1, reason: use source file name */
/* loaded from: classes2.dex */
final class FinalTermsDuxo2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FinalTermsViewState $dataState;
    int label;
    final /* synthetic */ FinalTermsDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FinalTermsDuxo2(FinalTermsDuxo finalTermsDuxo, FinalTermsViewState finalTermsViewState, Continuation<? super FinalTermsDuxo2> continuation) {
        super(2, continuation);
        this.this$0 = finalTermsDuxo;
        this.$dataState = finalTermsViewState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FinalTermsDuxo2(this.this$0, this.$dataState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FinalTermsDuxo2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: FinalTermsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/creditcard/ui/creditapplication/finalterms/FinalTermsViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsDuxo$onContinue$1$1$1", m3645f = "FinalTermsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsDuxo$onContinue$1$1$1 */
    static final class C123401 extends ContinuationImpl7 implements Function2<FinalTermsViewState, Continuation<? super FinalTermsViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C123401(Continuation<? super C123401> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C123401 c123401 = new C123401(continuation);
            c123401.L$0 = obj;
            return c123401;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FinalTermsViewState finalTermsViewState, Continuation<? super FinalTermsViewState> continuation) {
            return ((C123401) create(finalTermsViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return FinalTermsViewState.copy$default((FinalTermsViewState) this.L$0, false, false, null, null, null, null, false, null, false, 509, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0071, code lost:
    
        if (com.robinhood.android.agreements.AgreementsStore.signAgreement$default(r2, r0, null, null, r15, 6, null) != r7) goto L25;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        UiAgreementWithContent goldAgreementContent;
        Object agreementWithContent;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
        } catch (Throwable th) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 6, null);
            this.this$0.applyMutation(new C123412(null));
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.applyMutation(new C123401(null));
            if (this.$dataState.getGoldAgreementContent() == null) {
                AgreementsStore agreementsStore = this.this$0.agreementsStore;
                this.label = 1;
                agreementWithContent = agreementsStore.getAgreementWithContent(FinalTermsDuxo.GOLD_AGREEMENT_NAME, this);
                if (agreementWithContent == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                goldAgreementContent = this.$dataState.getGoldAgreementContent();
                AgreementsStore agreementsStore2 = this.this$0.agreementsStore;
                this.label = 2;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.creditCardStore.log(IdentityActionType.RH_ACCOUNT_TERMS_AND_CONDITIONS_ACCEPTED);
                this.this$0.submit(FinalTermsDuxo6.Continue.INSTANCE);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            agreementWithContent = obj;
        }
        goldAgreementContent = (UiAgreementWithContent) agreementWithContent;
        this.this$0.applyMutation(new FinalTermsDuxo3(goldAgreementContent, null));
        AgreementsStore agreementsStore22 = this.this$0.agreementsStore;
        this.label = 2;
    }

    /* compiled from: FinalTermsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/creditcard/ui/creditapplication/finalterms/FinalTermsViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsDuxo$onContinue$1$1$2", m3645f = "FinalTermsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsDuxo$onContinue$1$1$2 */
    static final class C123412 extends ContinuationImpl7 implements Function2<FinalTermsViewState, Continuation<? super FinalTermsViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C123412(Continuation<? super C123412> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C123412 c123412 = new C123412(continuation);
            c123412.L$0 = obj;
            return c123412;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FinalTermsViewState finalTermsViewState, Continuation<? super FinalTermsViewState> continuation) {
            return ((C123412) create(finalTermsViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return FinalTermsViewState.copy$default((FinalTermsViewState) this.L$0, false, true, null, null, null, null, false, null, false, 509, null);
        }
    }
}
