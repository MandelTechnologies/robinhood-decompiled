package com.robinhood.android.optionsupgrade;

import com.robinhood.android.agreements.AgreementsStore;
import com.robinhood.android.agreements.models.UiAgreementWithContent;
import com.robinhood.android.optionsupgrade.OptionOnboardingDisclosureStates2;
import com.robinhood.android.optionsupgrade.OptionOnboardingDisclosureStates4;
import com.robinhood.android.optionsupgrade.ScreenArgs;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.utils.extensions.Throwables;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OptionOnboardingDisclosureDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.optionsupgrade.OptionOnboardingDisclosureDuxo$signAgreement$1$1", m3645f = "OptionOnboardingDisclosureDuxo.kt", m3646l = {97}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingDisclosureDuxo$signAgreement$1$1, reason: use source file name */
/* loaded from: classes11.dex */
final class OptionOnboardingDisclosureDuxo3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ OptionOnboardingDisclosureDataState $ds;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OptionOnboardingDisclosureDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OptionOnboardingDisclosureDuxo3(OptionOnboardingDisclosureDuxo optionOnboardingDisclosureDuxo, OptionOnboardingDisclosureDataState optionOnboardingDisclosureDataState, Continuation<? super OptionOnboardingDisclosureDuxo3> continuation) {
        super(2, continuation);
        this.this$0 = optionOnboardingDisclosureDuxo;
        this.$ds = optionOnboardingDisclosureDataState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OptionOnboardingDisclosureDuxo3 optionOnboardingDisclosureDuxo3 = new OptionOnboardingDisclosureDuxo3(this.this$0, this.$ds, continuation);
        optionOnboardingDisclosureDuxo3.L$0 = obj;
        return optionOnboardingDisclosureDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OptionOnboardingDisclosureDuxo3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: OptionOnboardingDisclosureDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingDisclosureDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionsupgrade.OptionOnboardingDisclosureDuxo$signAgreement$1$1$1", m3645f = "OptionOnboardingDisclosureDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingDisclosureDuxo$signAgreement$1$1$1 */
    static final class C249331 extends ContinuationImpl7 implements Function2<OptionOnboardingDisclosureDataState, Continuation<? super OptionOnboardingDisclosureDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C249331(Continuation<? super C249331> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C249331 c249331 = new C249331(continuation);
            c249331.L$0 = obj;
            return c249331;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OptionOnboardingDisclosureDataState optionOnboardingDisclosureDataState, Continuation<? super OptionOnboardingDisclosureDataState> continuation) {
            return ((C249331) create(optionOnboardingDisclosureDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return OptionOnboardingDisclosureDataState.copy$default((OptionOnboardingDisclosureDataState) this.L$0, null, new OptionOnboardingDisclosureStates2.Loading(null, 1, null), false, 5, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008e  */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        OptionOnboardingDisclosureDuxo3 optionOnboardingDisclosureDuxo3;
        Throwable th;
        Object objM28550constructorimpl;
        Throwable thM28553exceptionOrNullimpl;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.applyMutation(new C249331(null));
            OptionOnboardingDisclosureDuxo optionOnboardingDisclosureDuxo = this.this$0;
            OptionOnboardingDisclosureDataState optionOnboardingDisclosureDataState = this.$ds;
            try {
                Result.Companion companion = Result.INSTANCE;
                AgreementsStore agreementsStore = optionOnboardingDisclosureDuxo.agreementsStore;
                UiAgreementWithContent uiAgreementWithContent = (UiAgreementWithContent) ((OptionOnboardingDisclosureStates2.Success) optionOnboardingDisclosureDataState.getAgreementLoadingState()).getResult();
                String agreementContext = ((ScreenArgs.Disclosure) OptionOnboardingDisclosureDuxo.INSTANCE.getArgs((HasSavedState) optionOnboardingDisclosureDuxo)).getAgreementContext();
                this.label = 1;
                optionOnboardingDisclosureDuxo3 = this;
                try {
                    if (AgreementsStore.signAgreement$default(agreementsStore, uiAgreementWithContent, agreementContext, null, optionOnboardingDisclosureDuxo3, 4, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    th = th;
                    Result.Companion companion2 = Result.INSTANCE;
                    objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                    thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
                    if (thM28553exceptionOrNullimpl != null) {
                    }
                    optionOnboardingDisclosureDuxo3.this$0.applyMutation(new C249342(objM28550constructorimpl, null));
                    if (Result.m28556isSuccessimpl(objM28550constructorimpl)) {
                    }
                    return Unit.INSTANCE;
                }
            } catch (Throwable th3) {
                th = th3;
                optionOnboardingDisclosureDuxo3 = this;
                th = th;
                Result.Companion companion22 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
                if (thM28553exceptionOrNullimpl != null) {
                }
                optionOnboardingDisclosureDuxo3.this$0.applyMutation(new C249342(objM28550constructorimpl, null));
                if (Result.m28556isSuccessimpl(objM28550constructorimpl)) {
                }
                return Unit.INSTANCE;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            try {
                ResultKt.throwOnFailure(obj);
                optionOnboardingDisclosureDuxo3 = this;
            } catch (Throwable th4) {
                th = th4;
                optionOnboardingDisclosureDuxo3 = this;
                Result.Companion companion222 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
                if (thM28553exceptionOrNullimpl != null) {
                }
                optionOnboardingDisclosureDuxo3.this$0.applyMutation(new C249342(objM28550constructorimpl, null));
                if (Result.m28556isSuccessimpl(objM28550constructorimpl)) {
                }
                return Unit.INSTANCE;
            }
        }
        objM28550constructorimpl = Result.m28550constructorimpl(Unit.INSTANCE);
        thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
        if (thM28553exceptionOrNullimpl != null) {
            Throwables.rethrowIfNotNetworkRelated(thM28553exceptionOrNullimpl);
        }
        optionOnboardingDisclosureDuxo3.this$0.applyMutation(new C249342(objM28550constructorimpl, null));
        if (Result.m28556isSuccessimpl(objM28550constructorimpl)) {
            optionOnboardingDisclosureDuxo3.this$0.submit(OptionOnboardingDisclosureStates4.GoToNextScreen.INSTANCE);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: OptionOnboardingDisclosureDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingDisclosureDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionsupgrade.OptionOnboardingDisclosureDuxo$signAgreement$1$1$2", m3645f = "OptionOnboardingDisclosureDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingDisclosureDuxo$signAgreement$1$1$2 */
    static final class C249342 extends ContinuationImpl7 implements Function2<OptionOnboardingDisclosureDataState, Continuation<? super OptionOnboardingDisclosureDataState>, Object> {
        final /* synthetic */ Object $result;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C249342(Object obj, Continuation<? super C249342> continuation) {
            super(2, continuation);
            this.$result = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C249342 c249342 = new C249342(this.$result, continuation);
            c249342.L$0 = obj;
            return c249342;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OptionOnboardingDisclosureDataState optionOnboardingDisclosureDataState, Continuation<? super OptionOnboardingDisclosureDataState> continuation) {
            return ((C249342) create(optionOnboardingDisclosureDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return OptionOnboardingDisclosureDataState.copy$default((OptionOnboardingDisclosureDataState) this.L$0, null, OptionOnboardingDisclosureStates5.toLoadingState(this.$result), false, 5, null);
        }
    }
}
