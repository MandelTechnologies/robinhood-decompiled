package com.robinhood.android.cash.disputes.p070ui.question.freeresponse;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.cash.disputes.p070ui.question.DisputeQuestionResponse;
import com.robinhood.android.cash.disputes.p070ui.question.ResponseValidationResult;
import com.robinhood.android.cash.disputes.p070ui.question.freeresponse.FreeResponseQuestionDuxo;
import com.robinhood.android.cash.disputes.p070ui.question.freeresponse.FreeResponseQuestionFragment;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.api.retrofit.Minerva;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.minerva.ApiDisputeValidationRequest;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.Throwables;
import io.reactivex.Completable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: FreeResponseQuestionDuxo.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0011B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/question/freeresponse/FreeResponseQuestionDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/cash/disputes/ui/question/freeresponse/FreeResponseQuestionViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "minerva", "Lcom/robinhood/api/retrofit/Minerva;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/api/retrofit/Minerva;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "updatePreFillText", "", "response", "Lcom/robinhood/android/cash/disputes/ui/question/DisputeQuestionResponse$Text;", "validateResponse", "Companion", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class FreeResponseQuestionDuxo extends OldBaseDuxo<FreeResponseQuestionViewState> implements HasSavedState {
    private final Minerva minerva;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FreeResponseQuestionDuxo(Minerva minerva, SavedStateHandle savedStateHandle) {
        super(new FreeResponseQuestionViewState(((FreeResponseQuestionFragment.Args) INSTANCE.getArgs(savedStateHandle)).getQuestion(), false, null, null, 14, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(minerva, "minerva");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.minerva = minerva;
        this.savedStateHandle = savedStateHandle;
    }

    public final void updatePreFillText(final DisputeQuestionResponse.Text response) {
        Intrinsics.checkNotNullParameter(response, "response");
        applyMutation(new Function1() { // from class: com.robinhood.android.cash.disputes.ui.question.freeresponse.FreeResponseQuestionDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FreeResponseQuestionDuxo.updatePreFillText$lambda$0(response, (FreeResponseQuestionViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FreeResponseQuestionViewState updatePreFillText$lambda$0(DisputeQuestionResponse.Text text, FreeResponseQuestionViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return FreeResponseQuestionViewState.copy$default(applyMutation, null, false, new UiEvent(text.getAnswerText()), null, 11, null);
    }

    /* compiled from: FreeResponseQuestionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.cash.disputes.ui.question.freeresponse.FreeResponseQuestionDuxo$validateResponse$1", m3645f = "FreeResponseQuestionDuxo.kt", m3646l = {34}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.cash.disputes.ui.question.freeresponse.FreeResponseQuestionDuxo$validateResponse$1 */
    static final class C100281 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ DisputeQuestionResponse.Text $response;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C100281(DisputeQuestionResponse.Text text, Continuation<? super C100281> continuation) {
            super(2, continuation);
            this.$response = text;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FreeResponseQuestionDuxo.this.new C100281(this.$response, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C100281) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Minerva minerva = FreeResponseQuestionDuxo.this.minerva;
                ApiDisputeValidationRequest apiDisputeValidationRequest = new ApiDisputeValidationRequest(((FreeResponseQuestionFragment.Args) FreeResponseQuestionDuxo.INSTANCE.getArgs((HasSavedState) FreeResponseQuestionDuxo.this)).getTransactionIds(), new ApiDisputeValidationRequest.Answer(this.$response.getQuestion().getId(), this.$response.getAnswerText(), null, null, 12, null));
                this.label = 1;
                if (minerva.validateDisputeQuestionResponse(apiDisputeValidationRequest, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final void validateResponse(final DisputeQuestionResponse.Text response) {
        Intrinsics.checkNotNullParameter(response, "response");
        Completable completableDoOnSubscribe = RxFactory.DefaultImpls.rxCompletable$default(this, null, new C100281(response, null), 1, null).doOnSubscribe(new C100292());
        Intrinsics.checkNotNullExpressionValue(completableDoOnSubscribe, "doOnSubscribe(...)");
        LifecycleHost.DefaultImpls.bind$default(this, completableDoOnSubscribe, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.cash.disputes.ui.question.freeresponse.FreeResponseQuestionDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FreeResponseQuestionDuxo.validateResponse$lambda$2(this.f$0, response);
            }
        }, new Function1() { // from class: com.robinhood.android.cash.disputes.ui.question.freeresponse.FreeResponseQuestionDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FreeResponseQuestionDuxo.validateResponse$lambda$4(this.f$0, (Throwable) obj);
            }
        });
    }

    /* compiled from: FreeResponseQuestionDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cash.disputes.ui.question.freeresponse.FreeResponseQuestionDuxo$validateResponse$2 */
    static final class C100292<T> implements Consumer {
        C100292() {
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(Disposable disposable) {
            FreeResponseQuestionDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.cash.disputes.ui.question.freeresponse.FreeResponseQuestionDuxo$validateResponse$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FreeResponseQuestionDuxo.C100292.accept$lambda$0((FreeResponseQuestionViewState) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final FreeResponseQuestionViewState accept$lambda$0(FreeResponseQuestionViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return FreeResponseQuestionViewState.copy$default(applyMutation, null, true, null, null, 13, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit validateResponse$lambda$2(FreeResponseQuestionDuxo freeResponseQuestionDuxo, final DisputeQuestionResponse.Text text) {
        freeResponseQuestionDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.disputes.ui.question.freeresponse.FreeResponseQuestionDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FreeResponseQuestionDuxo.validateResponse$lambda$2$lambda$1(text, (FreeResponseQuestionViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FreeResponseQuestionViewState validateResponse$lambda$2$lambda$1(DisputeQuestionResponse.Text text, FreeResponseQuestionViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return FreeResponseQuestionViewState.copy$default(applyMutation, null, false, null, new UiEvent(new ResponseValidationResult.Success(text)), 5, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit validateResponse$lambda$4(FreeResponseQuestionDuxo freeResponseQuestionDuxo, final Throwable throwable) throws Throwable {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (Throwables.isNetworkRelated(throwable)) {
            freeResponseQuestionDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.disputes.ui.question.freeresponse.FreeResponseQuestionDuxo$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FreeResponseQuestionDuxo.validateResponse$lambda$4$lambda$3(throwable, (FreeResponseQuestionViewState) obj);
                }
            });
            return Unit.INSTANCE;
        }
        throw throwable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FreeResponseQuestionViewState validateResponse$lambda$4$lambda$3(Throwable th, FreeResponseQuestionViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return FreeResponseQuestionViewState.copy$default(applyMutation, null, false, null, new UiEvent(new ResponseValidationResult.Error(th)), 5, null);
    }

    /* compiled from: FreeResponseQuestionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/question/freeresponse/FreeResponseQuestionDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/cash/disputes/ui/question/freeresponse/FreeResponseQuestionDuxo;", "Lcom/robinhood/android/cash/disputes/ui/question/freeresponse/FreeResponseQuestionFragment$Args;", "<init>", "()V", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<FreeResponseQuestionDuxo, FreeResponseQuestionFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public FreeResponseQuestionFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (FreeResponseQuestionFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public FreeResponseQuestionFragment.Args getArgs(FreeResponseQuestionDuxo freeResponseQuestionDuxo) {
            return (FreeResponseQuestionFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, freeResponseQuestionDuxo);
        }
    }
}
