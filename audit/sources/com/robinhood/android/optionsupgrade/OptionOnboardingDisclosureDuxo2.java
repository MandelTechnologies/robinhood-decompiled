package com.robinhood.android.optionsupgrade;

import com.robinhood.android.agreements.AgreementsStore;
import com.robinhood.android.agreements.models.UiAgreementWithContent;
import com.robinhood.android.optionsupgrade.OptionOnboardingDisclosureStates2;
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
@DebugMetadata(m3644c = "com.robinhood.android.optionsupgrade.OptionOnboardingDisclosureDuxo$loadAgreement$1$1", m3645f = "OptionOnboardingDisclosureDuxo.kt", m3646l = {57}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingDisclosureDuxo$loadAgreement$1$1, reason: use source file name */
/* loaded from: classes11.dex */
final class OptionOnboardingDisclosureDuxo2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OptionOnboardingDisclosureDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OptionOnboardingDisclosureDuxo2(OptionOnboardingDisclosureDuxo optionOnboardingDisclosureDuxo, Continuation<? super OptionOnboardingDisclosureDuxo2> continuation) {
        super(2, continuation);
        this.this$0 = optionOnboardingDisclosureDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OptionOnboardingDisclosureDuxo2 optionOnboardingDisclosureDuxo2 = new OptionOnboardingDisclosureDuxo2(this.this$0, continuation);
        optionOnboardingDisclosureDuxo2.L$0 = obj;
        return optionOnboardingDisclosureDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OptionOnboardingDisclosureDuxo2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: OptionOnboardingDisclosureDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingDisclosureDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionsupgrade.OptionOnboardingDisclosureDuxo$loadAgreement$1$1$1", m3645f = "OptionOnboardingDisclosureDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingDisclosureDuxo$loadAgreement$1$1$1 */
    static final class C249281 extends ContinuationImpl7 implements Function2<OptionOnboardingDisclosureDataState, Continuation<? super OptionOnboardingDisclosureDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C249281(Continuation<? super C249281> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C249281 c249281 = new C249281(continuation);
            c249281.L$0 = obj;
            return c249281;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OptionOnboardingDisclosureDataState optionOnboardingDisclosureDataState, Continuation<? super OptionOnboardingDisclosureDataState> continuation) {
            return ((C249281) create(optionOnboardingDisclosureDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return OptionOnboardingDisclosureDataState.copy$default((OptionOnboardingDisclosureDataState) this.L$0, new OptionOnboardingDisclosureStates2.Loading(null, 1, null), null, false, 6, null);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM28550constructorimpl;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.this$0.applyMutation(new C249281(null));
                OptionOnboardingDisclosureDuxo optionOnboardingDisclosureDuxo = this.this$0;
                Result.Companion companion = Result.INSTANCE;
                AgreementsStore agreementsStore = optionOnboardingDisclosureDuxo.agreementsStore;
                String type2 = ((ScreenArgs.Disclosure) OptionOnboardingDisclosureDuxo.INSTANCE.getArgs((HasSavedState) optionOnboardingDisclosureDuxo)).getType();
                this.label = 1;
                obj = agreementsStore.getAgreementWithContent(type2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            objM28550constructorimpl = Result.m28550constructorimpl((UiAgreementWithContent) obj);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
        if (thM28553exceptionOrNullimpl != null) {
            Throwables.rethrowIfNotNetworkRelated(thM28553exceptionOrNullimpl);
        }
        this.this$0.applyMutation(new C249292(objM28550constructorimpl, null));
        return Unit.INSTANCE;
    }

    /* compiled from: OptionOnboardingDisclosureDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingDisclosureDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionsupgrade.OptionOnboardingDisclosureDuxo$loadAgreement$1$1$2", m3645f = "OptionOnboardingDisclosureDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingDisclosureDuxo$loadAgreement$1$1$2 */
    static final class C249292 extends ContinuationImpl7 implements Function2<OptionOnboardingDisclosureDataState, Continuation<? super OptionOnboardingDisclosureDataState>, Object> {
        final /* synthetic */ Object $agreement;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C249292(Object obj, Continuation<? super C249292> continuation) {
            super(2, continuation);
            this.$agreement = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C249292 c249292 = new C249292(this.$agreement, continuation);
            c249292.L$0 = obj;
            return c249292;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OptionOnboardingDisclosureDataState optionOnboardingDisclosureDataState, Continuation<? super OptionOnboardingDisclosureDataState> continuation) {
            return ((C249292) create(optionOnboardingDisclosureDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return OptionOnboardingDisclosureDataState.copy$default((OptionOnboardingDisclosureDataState) this.L$0, OptionOnboardingDisclosureStates5.toLoadingState(this.$agreement), null, false, 6, null);
        }
    }
}
