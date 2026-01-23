package com.robinhood.android.cash.disputes.p070ui.question.date;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.cash.disputes.extensions.LocalDates2;
import com.robinhood.android.cash.disputes.p070ui.question.DisputeQuestionResponse;
import com.robinhood.android.cash.disputes.p070ui.question.ResponseValidationResult;
import com.robinhood.android.cash.disputes.p070ui.question.date.DateQuestionDuxo;
import com.robinhood.android.cash.disputes.p070ui.question.date.DateQuestionFragment;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.api.retrofit.Minerva;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.MinervaAccountStore;
import com.robinhood.models.api.minerva.ApiDisputeValidationRequest;
import com.robinhood.models.p320db.mcduckling.MinervaAccount;
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

/* compiled from: DateQuestionDuxo.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0014B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/question/date/DateQuestionDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/cash/disputes/ui/question/date/DateQuestionViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "minerva", "Lcom/robinhood/api/retrofit/Minerva;", "minervaAccountStore", "Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/api/retrofit/Minerva;Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "updatePreFillValues", "response", "Lcom/robinhood/android/cash/disputes/ui/question/DisputeQuestionResponse$Date;", "validateResponse", "Companion", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class DateQuestionDuxo extends OldBaseDuxo<DateQuestionViewState> implements HasSavedState {
    private final Minerva minerva;
    private final MinervaAccountStore minervaAccountStore;
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
    public DateQuestionDuxo(Minerva minerva, MinervaAccountStore minervaAccountStore, SavedStateHandle savedStateHandle) {
        super(new DateQuestionViewState(((DateQuestionFragment.Args) INSTANCE.getArgs(savedStateHandle)).getQuestion(), null, false, null, null, null, 62, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(minerva, "minerva");
        Intrinsics.checkNotNullParameter(minervaAccountStore, "minervaAccountStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.minerva = minerva;
        this.minervaAccountStore = minervaAccountStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        MinervaAccountStore.refresh$default(this.minervaAccountStore, false, 1, null);
        LifecycleHost.DefaultImpls.bind$default(this, MinervaAccountStore.streamAccount$default(this.minervaAccountStore, null, 1, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.disputes.ui.question.date.DateQuestionDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DateQuestionDuxo.onCreate$lambda$1(this.f$0, (MinervaAccount) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(DateQuestionDuxo dateQuestionDuxo, final MinervaAccount minervaAccount) {
        Intrinsics.checkNotNullParameter(minervaAccount, "minervaAccount");
        dateQuestionDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.disputes.ui.question.date.DateQuestionDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DateQuestionDuxo.onCreate$lambda$1$lambda$0(minervaAccount, (DateQuestionViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DateQuestionViewState onCreate$lambda$1$lambda$0(MinervaAccount minervaAccount, DateQuestionViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return DateQuestionViewState.copy$default(applyMutation, null, minervaAccount, false, null, null, null, 61, null);
    }

    public final void updatePreFillValues(final DisputeQuestionResponse.Date response) {
        Intrinsics.checkNotNullParameter(response, "response");
        applyMutation(new Function1() { // from class: com.robinhood.android.cash.disputes.ui.question.date.DateQuestionDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DateQuestionDuxo.updatePreFillValues$lambda$2(response, (DateQuestionViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DateQuestionViewState updatePreFillValues$lambda$2(DisputeQuestionResponse.Date date, DateQuestionViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return DateQuestionViewState.copy$default(applyMutation, null, null, false, new UiEvent(date.getAnswerDate()), new UiEvent(date.getAnswerText()), null, 39, null);
    }

    /* compiled from: DateQuestionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.cash.disputes.ui.question.date.DateQuestionDuxo$validateResponse$1", m3645f = "DateQuestionDuxo.kt", m3646l = {53}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.cash.disputes.ui.question.date.DateQuestionDuxo$validateResponse$1 */
    static final class C100111 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ DisputeQuestionResponse.Date $response;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C100111(DisputeQuestionResponse.Date date, Continuation<? super C100111> continuation) {
            super(2, continuation);
            this.$response = date;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DateQuestionDuxo.this.new C100111(this.$response, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C100111) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Minerva minerva = DateQuestionDuxo.this.minerva;
                ApiDisputeValidationRequest apiDisputeValidationRequest = new ApiDisputeValidationRequest(((DateQuestionFragment.Args) DateQuestionDuxo.INSTANCE.getArgs((HasSavedState) DateQuestionDuxo.this)).getTransactionIds(), new ApiDisputeValidationRequest.Answer(this.$response.getQuestion().getId(), this.$response.getAnswerText(), LocalDates2.toDisputeResponseFormat(this.$response.getAnswerDate()), null, 8, null));
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

    public final void validateResponse(final DisputeQuestionResponse.Date response) {
        Intrinsics.checkNotNullParameter(response, "response");
        Completable completableDoOnSubscribe = RxFactory.DefaultImpls.rxCompletable$default(this, null, new C100111(response, null), 1, null).doOnSubscribe(new C100122());
        Intrinsics.checkNotNullExpressionValue(completableDoOnSubscribe, "doOnSubscribe(...)");
        LifecycleHost.DefaultImpls.bind$default(this, completableDoOnSubscribe, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.cash.disputes.ui.question.date.DateQuestionDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DateQuestionDuxo.validateResponse$lambda$4(this.f$0, response);
            }
        }, new Function1() { // from class: com.robinhood.android.cash.disputes.ui.question.date.DateQuestionDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DateQuestionDuxo.validateResponse$lambda$6(this.f$0, (Throwable) obj);
            }
        });
    }

    /* compiled from: DateQuestionDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cash.disputes.ui.question.date.DateQuestionDuxo$validateResponse$2 */
    static final class C100122<T> implements Consumer {
        C100122() {
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(Disposable disposable) {
            DateQuestionDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.cash.disputes.ui.question.date.DateQuestionDuxo$validateResponse$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DateQuestionDuxo.C100122.accept$lambda$0((DateQuestionViewState) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final DateQuestionViewState accept$lambda$0(DateQuestionViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return DateQuestionViewState.copy$default(applyMutation, null, null, true, null, null, null, 59, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit validateResponse$lambda$4(DateQuestionDuxo dateQuestionDuxo, final DisputeQuestionResponse.Date date) {
        dateQuestionDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.disputes.ui.question.date.DateQuestionDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DateQuestionDuxo.validateResponse$lambda$4$lambda$3(date, (DateQuestionViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DateQuestionViewState validateResponse$lambda$4$lambda$3(DisputeQuestionResponse.Date date, DateQuestionViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return DateQuestionViewState.copy$default(applyMutation, null, null, false, null, null, new UiEvent(new ResponseValidationResult.Success(date)), 27, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit validateResponse$lambda$6(DateQuestionDuxo dateQuestionDuxo, final Throwable throwable) throws Throwable {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (Throwables.isNetworkRelated(throwable)) {
            dateQuestionDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.disputes.ui.question.date.DateQuestionDuxo$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DateQuestionDuxo.validateResponse$lambda$6$lambda$5(throwable, (DateQuestionViewState) obj);
                }
            });
            return Unit.INSTANCE;
        }
        throw throwable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DateQuestionViewState validateResponse$lambda$6$lambda$5(Throwable th, DateQuestionViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return DateQuestionViewState.copy$default(applyMutation, null, null, false, null, null, new UiEvent(new ResponseValidationResult.Error(th)), 27, null);
    }

    /* compiled from: DateQuestionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/question/date/DateQuestionDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/cash/disputes/ui/question/date/DateQuestionDuxo;", "Lcom/robinhood/android/cash/disputes/ui/question/date/DateQuestionFragment$Args;", "<init>", "()V", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<DateQuestionDuxo, DateQuestionFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public DateQuestionFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (DateQuestionFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public DateQuestionFragment.Args getArgs(DateQuestionDuxo dateQuestionDuxo) {
            return (DateQuestionFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, dateQuestionDuxo);
        }
    }
}
