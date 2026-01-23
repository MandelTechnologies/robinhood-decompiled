package com.robinhood.android.cash.disputes.p070ui.question.decimal;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.cash.disputes.p070ui.question.DisputeQuestionResponse;
import com.robinhood.android.cash.disputes.p070ui.question.ResponseValidationResult;
import com.robinhood.android.cash.disputes.p070ui.question.decimal.DecimalAmountQuestionDuxo;
import com.robinhood.android.cash.disputes.p070ui.question.decimal.DecimalAmountQuestionFragment;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.api.retrofit.Minerva;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.CardTransactionStore;
import com.robinhood.models.api.minerva.ApiDisputeValidationRequest;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.Throwables;
import io.reactivex.Completable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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

/* compiled from: DecimalAmountQuestionDuxo.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0014B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/question/decimal/DecimalAmountQuestionDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/cash/disputes/ui/question/decimal/DecimalAmountQuestionViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "cardTransactionStore", "Lcom/robinhood/librobinhood/data/store/CardTransactionStore;", "minerva", "Lcom/robinhood/api/retrofit/Minerva;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/CardTransactionStore;Lcom/robinhood/api/retrofit/Minerva;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "updatePreFillAmount", "response", "Lcom/robinhood/android/cash/disputes/ui/question/DisputeQuestionResponse$Decimal;", "validateResponse", "Companion", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class DecimalAmountQuestionDuxo extends OldBaseDuxo<DecimalAmountQuestionViewState> implements HasSavedState {
    private final CardTransactionStore cardTransactionStore;
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
    public DecimalAmountQuestionDuxo(CardTransactionStore cardTransactionStore, Minerva minerva, SavedStateHandle savedStateHandle) {
        super(new DecimalAmountQuestionViewState(((DecimalAmountQuestionFragment.Args) INSTANCE.getArgs(savedStateHandle)).getQuestion(), null, false, null, null, 30, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(cardTransactionStore, "cardTransactionStore");
        Intrinsics.checkNotNullParameter(minerva, "minerva");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.cardTransactionStore = cardTransactionStore;
        this.minerva = minerva;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        LifecycleHost.DefaultImpls.bind$default(this, this.cardTransactionStore.streamSettledTransactionSet(CollectionsKt.toSet(((DecimalAmountQuestionFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getTransactionIds())), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.disputes.ui.question.decimal.DecimalAmountQuestionDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DecimalAmountQuestionDuxo.onCreate$lambda$1(this.f$0, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(DecimalAmountQuestionDuxo decimalAmountQuestionDuxo, final List transactions) {
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        decimalAmountQuestionDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.disputes.ui.question.decimal.DecimalAmountQuestionDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DecimalAmountQuestionDuxo.onCreate$lambda$1$lambda$0(transactions, (DecimalAmountQuestionViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DecimalAmountQuestionViewState onCreate$lambda$1$lambda$0(List list, DecimalAmountQuestionViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return DecimalAmountQuestionViewState.copy$default(applyMutation, null, list, false, null, null, 29, null);
    }

    public final void updatePreFillAmount(final DisputeQuestionResponse.Decimal response) {
        Intrinsics.checkNotNullParameter(response, "response");
        applyMutation(new Function1() { // from class: com.robinhood.android.cash.disputes.ui.question.decimal.DecimalAmountQuestionDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DecimalAmountQuestionDuxo.updatePreFillAmount$lambda$2(response, (DecimalAmountQuestionViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DecimalAmountQuestionViewState updatePreFillAmount$lambda$2(DisputeQuestionResponse.Decimal decimal, DecimalAmountQuestionViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return DecimalAmountQuestionViewState.copy$default(applyMutation, null, null, false, new UiEvent(decimal.getMoneyAmount()), null, 23, null);
    }

    /* compiled from: DecimalAmountQuestionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.cash.disputes.ui.question.decimal.DecimalAmountQuestionDuxo$validateResponse$1", m3645f = "DecimalAmountQuestionDuxo.kt", m3646l = {48}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.cash.disputes.ui.question.decimal.DecimalAmountQuestionDuxo$validateResponse$1 */
    static final class C100151 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ DisputeQuestionResponse.Decimal $response;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C100151(DisputeQuestionResponse.Decimal decimal, Continuation<? super C100151> continuation) {
            super(2, continuation);
            this.$response = decimal;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DecimalAmountQuestionDuxo.this.new C100151(this.$response, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C100151) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Minerva minerva = DecimalAmountQuestionDuxo.this.minerva;
                List<UUID> transactionIds = ((DecimalAmountQuestionFragment.Args) DecimalAmountQuestionDuxo.INSTANCE.getArgs((HasSavedState) DecimalAmountQuestionDuxo.this)).getTransactionIds();
                UUID id = this.$response.getQuestion().getId();
                String plainString = this.$response.getMoneyAmount().getDecimalValue().toPlainString();
                Intrinsics.checkNotNullExpressionValue(plainString, "toPlainString(...)");
                ApiDisputeValidationRequest apiDisputeValidationRequest = new ApiDisputeValidationRequest(transactionIds, new ApiDisputeValidationRequest.Answer(id, plainString, null, null, 12, null));
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

    public final void validateResponse(final DisputeQuestionResponse.Decimal response) {
        Intrinsics.checkNotNullParameter(response, "response");
        Completable completableDoOnSubscribe = RxFactory.DefaultImpls.rxCompletable$default(this, null, new C100151(response, null), 1, null).doOnSubscribe(new C100162());
        Intrinsics.checkNotNullExpressionValue(completableDoOnSubscribe, "doOnSubscribe(...)");
        LifecycleHost.DefaultImpls.bind$default(this, completableDoOnSubscribe, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.cash.disputes.ui.question.decimal.DecimalAmountQuestionDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DecimalAmountQuestionDuxo.validateResponse$lambda$4(this.f$0, response);
            }
        }, new Function1() { // from class: com.robinhood.android.cash.disputes.ui.question.decimal.DecimalAmountQuestionDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DecimalAmountQuestionDuxo.validateResponse$lambda$6(this.f$0, (Throwable) obj);
            }
        });
    }

    /* compiled from: DecimalAmountQuestionDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cash.disputes.ui.question.decimal.DecimalAmountQuestionDuxo$validateResponse$2 */
    static final class C100162<T> implements Consumer {
        C100162() {
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(Disposable disposable) {
            DecimalAmountQuestionDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.cash.disputes.ui.question.decimal.DecimalAmountQuestionDuxo$validateResponse$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DecimalAmountQuestionDuxo.C100162.accept$lambda$0((DecimalAmountQuestionViewState) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final DecimalAmountQuestionViewState accept$lambda$0(DecimalAmountQuestionViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return DecimalAmountQuestionViewState.copy$default(applyMutation, null, null, true, null, null, 27, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit validateResponse$lambda$4(DecimalAmountQuestionDuxo decimalAmountQuestionDuxo, final DisputeQuestionResponse.Decimal decimal) {
        decimalAmountQuestionDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.disputes.ui.question.decimal.DecimalAmountQuestionDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DecimalAmountQuestionDuxo.validateResponse$lambda$4$lambda$3(decimal, (DecimalAmountQuestionViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DecimalAmountQuestionViewState validateResponse$lambda$4$lambda$3(DisputeQuestionResponse.Decimal decimal, DecimalAmountQuestionViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return DecimalAmountQuestionViewState.copy$default(applyMutation, null, null, false, null, new UiEvent(new ResponseValidationResult.Success(decimal)), 11, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit validateResponse$lambda$6(DecimalAmountQuestionDuxo decimalAmountQuestionDuxo, final Throwable throwable) throws Throwable {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (Throwables.isNetworkRelated(throwable)) {
            decimalAmountQuestionDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.disputes.ui.question.decimal.DecimalAmountQuestionDuxo$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DecimalAmountQuestionDuxo.validateResponse$lambda$6$lambda$5(throwable, (DecimalAmountQuestionViewState) obj);
                }
            });
            return Unit.INSTANCE;
        }
        throw throwable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DecimalAmountQuestionViewState validateResponse$lambda$6$lambda$5(Throwable th, DecimalAmountQuestionViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return DecimalAmountQuestionViewState.copy$default(applyMutation, null, null, false, null, new UiEvent(new ResponseValidationResult.Error(th)), 11, null);
    }

    /* compiled from: DecimalAmountQuestionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/question/decimal/DecimalAmountQuestionDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/cash/disputes/ui/question/decimal/DecimalAmountQuestionDuxo;", "Lcom/robinhood/android/cash/disputes/ui/question/decimal/DecimalAmountQuestionFragment$Args;", "<init>", "()V", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<DecimalAmountQuestionDuxo, DecimalAmountQuestionFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public DecimalAmountQuestionFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (DecimalAmountQuestionFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public DecimalAmountQuestionFragment.Args getArgs(DecimalAmountQuestionDuxo decimalAmountQuestionDuxo) {
            return (DecimalAmountQuestionFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, decimalAmountQuestionDuxo);
        }
    }
}
