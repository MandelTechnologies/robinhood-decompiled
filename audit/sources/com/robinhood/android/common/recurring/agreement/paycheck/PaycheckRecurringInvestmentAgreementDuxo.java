package com.robinhood.android.common.recurring.agreement.paycheck;

import android.text.Spanned;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.recurring.agreement.paycheck.PaycheckRecurringInvestmentAgreementFragment;
import com.robinhood.android.common.recurring.agreement.paycheck.PaycheckRecurringInvestmentAgreementViewState;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.contentful.StaticContentStore;
import com.robinhood.contentful.model.EntryResource;
import com.robinhood.contentful.repository.ContentRepository;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.PaycheckInvestmentScheduleStore;
import com.robinhood.staticcontent.model.disclosure.Disclosure;
import io.noties.markwon.Markwon;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PaycheckRecurringInvestmentAgreementDuxo.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u001cB)\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0006\u0010\u0018\u001a\u00020\u0017J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/agreement/paycheck/PaycheckRecurringInvestmentAgreementDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/common/recurring/agreement/paycheck/PaycheckRecurringInvestmentAgreementViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "markwon", "Lio/noties/markwon/Markwon;", "staticContentStore", "Lcom/robinhood/contentful/StaticContentStore;", "paycheckInvestmentScheduleStore", "Lcom/robinhood/librobinhood/data/store/PaycheckInvestmentScheduleStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lio/noties/markwon/Markwon;Lcom/robinhood/contentful/StaticContentStore;Lcom/robinhood/librobinhood/data/store/PaycheckInvestmentScheduleStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "hasUserAlreadyAcceptedAgreement", "", "getHasUserAlreadyAcceptedAgreement", "()Z", "setHasUserAlreadyAcceptedAgreement", "(Z)V", "onStart", "", "acceptAgreement", "getAgreement", "Lio/reactivex/Single;", "Lcom/robinhood/android/common/recurring/agreement/paycheck/PaycheckRecurringInvestmentAgreementViewState$Loaded;", "Companion", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class PaycheckRecurringInvestmentAgreementDuxo extends OldBaseDuxo<PaycheckRecurringInvestmentAgreementViewState> implements HasSavedState {
    public static final String CRYPTO_AGREEMENT_ID = "20SLISFFDorGaBTf4k06TW";
    public static final String INSTRUMENT_AGREEMENT_ID = "7i609eX5J2q3x4H2W78VuO";
    private boolean hasUserAlreadyAcceptedAgreement;
    private final Markwon markwon;
    private final PaycheckInvestmentScheduleStore paycheckInvestmentScheduleStore;
    private final SavedStateHandle savedStateHandle;
    private final StaticContentStore staticContentStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PaycheckRecurringInvestmentAgreementDuxo(Markwon markwon, StaticContentStore staticContentStore, PaycheckInvestmentScheduleStore paycheckInvestmentScheduleStore, SavedStateHandle savedStateHandle) {
        super(PaycheckRecurringInvestmentAgreementViewState.Loading.INSTANCE, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(markwon, "markwon");
        Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
        Intrinsics.checkNotNullParameter(paycheckInvestmentScheduleStore, "paycheckInvestmentScheduleStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.markwon = markwon;
        this.staticContentStore = staticContentStore;
        this.paycheckInvestmentScheduleStore = paycheckInvestmentScheduleStore;
        this.savedStateHandle = savedStateHandle;
    }

    public final boolean getHasUserAlreadyAcceptedAgreement() {
        return this.hasUserAlreadyAcceptedAgreement;
    }

    public final void setHasUserAlreadyAcceptedAgreement(boolean z) {
        this.hasUserAlreadyAcceptedAgreement = z;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        if (this.hasUserAlreadyAcceptedAgreement) {
            return;
        }
        Single<R> singleFlatMap = this.paycheckInvestmentScheduleStore.hasPaycheckInvestmentSchedules().first(Boolean.FALSE).flatMap(new Function() { // from class: com.robinhood.android.common.recurring.agreement.paycheck.PaycheckRecurringInvestmentAgreementDuxo.onStart.1
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends PaycheckRecurringInvestmentAgreementViewState> apply(Boolean hasPaycheckInvestmentSchedules) {
                Intrinsics.checkNotNullParameter(hasPaycheckInvestmentSchedules, "hasPaycheckInvestmentSchedules");
                if (!hasPaycheckInvestmentSchedules.booleanValue()) {
                    return PaycheckRecurringInvestmentAgreementDuxo.this.getAgreement();
                }
                Single singleJust = Single.just(PaycheckRecurringInvestmentAgreementViewState.AcceptedAgreement.INSTANCE);
                Intrinsics.checkNotNull(singleJust);
                return singleJust;
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleFlatMap, "flatMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, singleFlatMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.recurring.agreement.paycheck.PaycheckRecurringInvestmentAgreementDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaycheckRecurringInvestmentAgreementDuxo.onStart$lambda$1(this.f$0, (PaycheckRecurringInvestmentAgreementViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(PaycheckRecurringInvestmentAgreementDuxo paycheckRecurringInvestmentAgreementDuxo, final PaycheckRecurringInvestmentAgreementViewState paycheckRecurringInvestmentAgreementViewState) {
        paycheckRecurringInvestmentAgreementDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.agreement.paycheck.PaycheckRecurringInvestmentAgreementDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaycheckRecurringInvestmentAgreementDuxo.onStart$lambda$1$lambda$0(paycheckRecurringInvestmentAgreementViewState, (PaycheckRecurringInvestmentAgreementViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PaycheckRecurringInvestmentAgreementViewState onStart$lambda$1$lambda$0(PaycheckRecurringInvestmentAgreementViewState paycheckRecurringInvestmentAgreementViewState, PaycheckRecurringInvestmentAgreementViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Intrinsics.checkNotNull(paycheckRecurringInvestmentAgreementViewState);
        return paycheckRecurringInvestmentAgreementViewState;
    }

    public final void acceptAgreement() {
        applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.agreement.paycheck.PaycheckRecurringInvestmentAgreementDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaycheckRecurringInvestmentAgreementDuxo.acceptAgreement$lambda$2((PaycheckRecurringInvestmentAgreementViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PaycheckRecurringInvestmentAgreementViewState acceptAgreement$lambda$2(PaycheckRecurringInvestmentAgreementViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        if (applyMutation instanceof PaycheckRecurringInvestmentAgreementViewState.Loaded) {
            return PaycheckRecurringInvestmentAgreementViewState.AcceptedAgreement.INSTANCE;
        }
        throw new IllegalStateException("User is only able to accept the agreement in the loaded state. ");
    }

    /* compiled from: PaycheckRecurringInvestmentAgreementDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/common/recurring/agreement/paycheck/PaycheckRecurringInvestmentAgreementViewState$Loaded;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.recurring.agreement.paycheck.PaycheckRecurringInvestmentAgreementDuxo$getAgreement$1", m3645f = "PaycheckRecurringInvestmentAgreementDuxo.kt", m3646l = {67}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.common.recurring.agreement.paycheck.PaycheckRecurringInvestmentAgreementDuxo$getAgreement$1 */
    static final class C116001 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super PaycheckRecurringInvestmentAgreementViewState.Loaded>, Object> {
        int label;

        C116001(Continuation<? super C116001> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PaycheckRecurringInvestmentAgreementDuxo.this.new C116001(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super PaycheckRecurringInvestmentAgreementViewState.Loaded> continuation) {
            return ((C116001) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            String str;
            C116001 c116001;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StaticContentStore staticContentStore = PaycheckRecurringInvestmentAgreementDuxo.this.staticContentStore;
                if (((PaycheckRecurringInvestmentAgreementFragment.Args) PaycheckRecurringInvestmentAgreementDuxo.INSTANCE.getArgs((HasSavedState) PaycheckRecurringInvestmentAgreementDuxo.this)).getIsCrypto()) {
                    str = PaycheckRecurringInvestmentAgreementDuxo.CRYPTO_AGREEMENT_ID;
                } else {
                    str = PaycheckRecurringInvestmentAgreementDuxo.INSTRUMENT_AGREEMENT_ID;
                }
                String str2 = str;
                this.label = 1;
                c116001 = this;
                obj = ContentRepository.DefaultImpls.loadEntry$default(staticContentStore, str2, null, c116001, 2, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                c116001 = this;
            }
            Disclosure disclosure = (Disclosure) ((EntryResource) obj).getValue();
            String title = disclosure.getTitle();
            Spanned markdown = PaycheckRecurringInvestmentAgreementDuxo.this.markwon.toMarkdown(disclosure.getContent().getRaw());
            Intrinsics.checkNotNullExpressionValue(markdown, "toMarkdown(...)");
            return new PaycheckRecurringInvestmentAgreementViewState.Loaded(title, markdown);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Single<PaycheckRecurringInvestmentAgreementViewState.Loaded> getAgreement() {
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C116001(null), 1, null);
    }

    /* compiled from: PaycheckRecurringInvestmentAgreementDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/agreement/paycheck/PaycheckRecurringInvestmentAgreementDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/common/recurring/agreement/paycheck/PaycheckRecurringInvestmentAgreementDuxo;", "Lcom/robinhood/android/common/recurring/agreement/paycheck/PaycheckRecurringInvestmentAgreementFragment$Args;", "<init>", "()V", "CRYPTO_AGREEMENT_ID", "", "INSTRUMENT_AGREEMENT_ID", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<PaycheckRecurringInvestmentAgreementDuxo, PaycheckRecurringInvestmentAgreementFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public PaycheckRecurringInvestmentAgreementFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (PaycheckRecurringInvestmentAgreementFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public PaycheckRecurringInvestmentAgreementFragment.Args getArgs(PaycheckRecurringInvestmentAgreementDuxo paycheckRecurringInvestmentAgreementDuxo) {
            return (PaycheckRecurringInvestmentAgreementFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, paycheckRecurringInvestmentAgreementDuxo);
        }
    }
}
