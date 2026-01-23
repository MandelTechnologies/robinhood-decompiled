package com.robinhood.android.directdeposit.p101ui.prefilled.submit;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.directdeposit.p101ui.prefilled.partial.EditDepositAmountActivity;
import com.robinhood.android.directdeposit.p101ui.prefilled.submit.PreFilledFormSubmitFragment;
import com.robinhood.android.signature.SignatureHelper;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.api.rhy.RhyBonfireApi;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.AccountRoutingDetailsStore;
import com.robinhood.librobinhood.data.store.MinervaAccountStore;
import com.robinhood.models.api.bonfire.directdeposits.DirectDepositFormRequestBody;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.models.p355ui.DirectDepositAmount;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.udf.UiEvent;
import io.reactivex.Completable;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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

/* compiled from: PreFilledFormSubmitDuxo.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u001dB1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0016H\u0002J\u0018\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u0016H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/prefilled/submit/PreFilledFormSubmitDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/directdeposit/ui/prefilled/submit/PreFilledFormSubmitViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "minervaAccountStore", "Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;", "bonfireApi", "Lcom/robinhood/api/rhy/RhyBonfireApi;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "accountRoutingDetailsStore", "Lcom/robinhood/librobinhood/data/store/AccountRoutingDetailsStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;Lcom/robinhood/api/rhy/RhyBonfireApi;Lcom/robinhood/shared/store/user/UserStore;Lcom/robinhood/librobinhood/data/store/AccountRoutingDetailsStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "submitForm", "editedDepositAmount", "Lcom/robinhood/models/ui/DirectDepositAmount;", "submitRhsForm", "Lio/reactivex/Completable;", EditDepositAmountActivity.EXTRA_DEPOSIT_AMOUNT, "submitRhyForm", "accountId", "Ljava/util/UUID;", "Companion", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes27.dex */
public final class PreFilledFormSubmitDuxo extends OldBaseDuxo<PreFilledFormSubmitViewState> implements HasSavedState {
    private final AccountRoutingDetailsStore accountRoutingDetailsStore;
    private final RhyBonfireApi bonfireApi;
    private final MinervaAccountStore minervaAccountStore;
    private final SavedStateHandle savedStateHandle;
    private final UserStore userStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PreFilledFormSubmitDuxo(MinervaAccountStore minervaAccountStore, RhyBonfireApi bonfireApi, UserStore userStore, AccountRoutingDetailsStore accountRoutingDetailsStore, SavedStateHandle savedStateHandle) {
        super(new PreFilledFormSubmitViewState(null, null, null, false, null, null, 63, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(minervaAccountStore, "minervaAccountStore");
        Intrinsics.checkNotNullParameter(bonfireApi, "bonfireApi");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(accountRoutingDetailsStore, "accountRoutingDetailsStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.minervaAccountStore = minervaAccountStore;
        this.bonfireApi = bonfireApi;
        this.userStore = userStore;
        this.accountRoutingDetailsStore = accountRoutingDetailsStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, this.accountRoutingDetailsStore.fetchSpendingOrCashManagementRoutingDetails(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.directdeposit.ui.prefilled.submit.PreFilledFormSubmitDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PreFilledFormSubmitDuxo.onStart$lambda$1(this.f$0, (AccountRoutingDetailsStore.RoutingDetails) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.directdeposit.ui.prefilled.submit.PreFilledFormSubmitDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PreFilledFormSubmitDuxo.onStart$lambda$3(this.f$0, (Throwable) obj);
            }
        });
        UserStore.refresh$default(this.userStore, false, 1, null);
        LifecycleHost.DefaultImpls.bind$default(this, this.userStore.getUser(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.directdeposit.ui.prefilled.submit.PreFilledFormSubmitDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PreFilledFormSubmitDuxo.onStart$lambda$5(this.f$0, (User) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(PreFilledFormSubmitDuxo preFilledFormSubmitDuxo, final AccountRoutingDetailsStore.RoutingDetails routingDetails) {
        Intrinsics.checkNotNullParameter(routingDetails, "routingDetails");
        preFilledFormSubmitDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.directdeposit.ui.prefilled.submit.PreFilledFormSubmitDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PreFilledFormSubmitDuxo.onStart$lambda$1$lambda$0(routingDetails, (PreFilledFormSubmitViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PreFilledFormSubmitViewState onStart$lambda$1$lambda$0(AccountRoutingDetailsStore.RoutingDetails routingDetails, PreFilledFormSubmitViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return PreFilledFormSubmitViewState.copy$default(applyMutation, routingDetails, null, null, false, null, null, 62, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$3(PreFilledFormSubmitDuxo preFilledFormSubmitDuxo, final Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        preFilledFormSubmitDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.directdeposit.ui.prefilled.submit.PreFilledFormSubmitDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PreFilledFormSubmitDuxo.onStart$lambda$3$lambda$2(throwable, (PreFilledFormSubmitViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PreFilledFormSubmitViewState onStart$lambda$3$lambda$2(Throwable th, PreFilledFormSubmitViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return PreFilledFormSubmitViewState.copy$default(applyMutation, null, null, new UiEvent(th), false, null, null, 59, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$5(PreFilledFormSubmitDuxo preFilledFormSubmitDuxo, final User user) {
        Intrinsics.checkNotNullParameter(user, "user");
        preFilledFormSubmitDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.directdeposit.ui.prefilled.submit.PreFilledFormSubmitDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PreFilledFormSubmitDuxo.onStart$lambda$5$lambda$4(user, (PreFilledFormSubmitViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PreFilledFormSubmitViewState onStart$lambda$5$lambda$4(User user, PreFilledFormSubmitViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return PreFilledFormSubmitViewState.copy$default(applyMutation, null, user.getFullName(), null, false, null, null, 61, null);
    }

    public final void submitForm(final DirectDepositAmount editedDepositAmount) {
        applyMutation(new Function1() { // from class: com.robinhood.android.directdeposit.ui.prefilled.submit.PreFilledFormSubmitDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PreFilledFormSubmitDuxo.submitForm$lambda$10(this.f$0, editedDepositAmount, (PreFilledFormSubmitViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PreFilledFormSubmitViewState submitForm$lambda$10(final PreFilledFormSubmitDuxo preFilledFormSubmitDuxo, DirectDepositAmount directDepositAmount, PreFilledFormSubmitViewState applyMutation) {
        Completable completableSubmitRhyForm;
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        AccountRoutingDetailsStore.RoutingDetails routingDetails = applyMutation.getRoutingDetails();
        if (routingDetails instanceof AccountRoutingDetailsStore.RoutingDetails.CashManagement) {
            if (directDepositAmount == null) {
                directDepositAmount = ((PreFilledFormSubmitFragment.Args) INSTANCE.getArgs((HasSavedState) preFilledFormSubmitDuxo)).getDepositAmount();
            }
            completableSubmitRhyForm = preFilledFormSubmitDuxo.submitRhsForm(directDepositAmount);
        } else {
            if (!(routingDetails instanceof AccountRoutingDetailsStore.RoutingDetails.RhySpending)) {
                if (routingDetails == null) {
                    return applyMutation;
                }
                throw new NoWhenBranchMatchedException();
            }
            UUID id = ((AccountRoutingDetailsStore.RoutingDetails.RhySpending) applyMutation.getRoutingDetails()).getRhyAccount().getId();
            if (directDepositAmount == null) {
                directDepositAmount = ((PreFilledFormSubmitFragment.Args) INSTANCE.getArgs((HasSavedState) preFilledFormSubmitDuxo)).getDepositAmount();
            }
            completableSubmitRhyForm = preFilledFormSubmitDuxo.submitRhyForm(id, directDepositAmount);
        }
        LifecycleHost.DefaultImpls.bind$default(preFilledFormSubmitDuxo, completableSubmitRhyForm, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.directdeposit.ui.prefilled.submit.PreFilledFormSubmitDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PreFilledFormSubmitDuxo.submitForm$lambda$10$lambda$7(this.f$0);
            }
        }, new Function1() { // from class: com.robinhood.android.directdeposit.ui.prefilled.submit.PreFilledFormSubmitDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PreFilledFormSubmitDuxo.submitForm$lambda$10$lambda$9(this.f$0, (Throwable) obj);
            }
        });
        return PreFilledFormSubmitViewState.copy$default(applyMutation, null, null, null, true, null, null, 55, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit submitForm$lambda$10$lambda$7(PreFilledFormSubmitDuxo preFilledFormSubmitDuxo) {
        preFilledFormSubmitDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.directdeposit.ui.prefilled.submit.PreFilledFormSubmitDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PreFilledFormSubmitDuxo.submitForm$lambda$10$lambda$7$lambda$6((PreFilledFormSubmitViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PreFilledFormSubmitViewState submitForm$lambda$10$lambda$7$lambda$6(PreFilledFormSubmitViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return PreFilledFormSubmitViewState.copy$default(applyMutation, null, null, null, false, new UiEvent(Unit.INSTANCE), null, 39, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit submitForm$lambda$10$lambda$9(PreFilledFormSubmitDuxo preFilledFormSubmitDuxo, final Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        preFilledFormSubmitDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.directdeposit.ui.prefilled.submit.PreFilledFormSubmitDuxo$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PreFilledFormSubmitDuxo.submitForm$lambda$10$lambda$9$lambda$8(it, (PreFilledFormSubmitViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PreFilledFormSubmitViewState submitForm$lambda$10$lambda$9$lambda$8(Throwable th, PreFilledFormSubmitViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return PreFilledFormSubmitViewState.copy$default(applyMutation, null, null, null, false, null, new UiEvent(th), 23, null);
    }

    /* compiled from: PreFilledFormSubmitDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.directdeposit.ui.prefilled.submit.PreFilledFormSubmitDuxo$submitRhsForm$1", m3645f = "PreFilledFormSubmitDuxo.kt", m3646l = {93}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.directdeposit.ui.prefilled.submit.PreFilledFormSubmitDuxo$submitRhsForm$1 */
    static final class C141091 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ DirectDepositAmount $depositAmount;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C141091(DirectDepositAmount directDepositAmount, Continuation<? super C141091> continuation) {
            super(2, continuation);
            this.$depositAmount = directDepositAmount;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PreFilledFormSubmitDuxo.this.new C141091(this.$depositAmount, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C141091) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MinervaAccountStore minervaAccountStore = PreFilledFormSubmitDuxo.this.minervaAccountStore;
                Companion companion = PreFilledFormSubmitDuxo.INSTANCE;
                String employer = ((PreFilledFormSubmitFragment.Args) companion.getArgs((HasSavedState) PreFilledFormSubmitDuxo.this)).getEmployer();
                String strEncodeSvg = SignatureHelper.INSTANCE.encodeSvg(((PreFilledFormSubmitFragment.Args) companion.getArgs((HasSavedState) PreFilledFormSubmitDuxo.this)).getSignature(), 200, 75);
                DirectDepositAmount directDepositAmount = this.$depositAmount;
                this.label = 1;
                if (minervaAccountStore.submitFilledForm(employer, strEncodeSvg, directDepositAmount, this) == coroutine_suspended) {
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

    private final Completable submitRhsForm(DirectDepositAmount depositAmount) {
        return RxFactory.DefaultImpls.rxCompletable$default(this, null, new C141091(depositAmount, null), 1, null);
    }

    private final Completable submitRhyForm(UUID accountId, DirectDepositAmount depositAmount) {
        String string2 = accountId.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        Companion companion = INSTANCE;
        return RxFactory.DefaultImpls.rxCompletable$default(this, null, new C141101(depositAmount, new DirectDepositFormRequestBody(SignatureHelper.INSTANCE.createSvg(((PreFilledFormSubmitFragment.Args) companion.getArgs((HasSavedState) this)).getSignature(), 200, 75), string2, ((PreFilledFormSubmitFragment.Args) companion.getArgs((HasSavedState) this)).getEmployer(), false, null, null, 48, null), null), 1, null);
    }

    /* compiled from: PreFilledFormSubmitDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.directdeposit.ui.prefilled.submit.PreFilledFormSubmitDuxo$submitRhyForm$1", m3645f = "PreFilledFormSubmitDuxo.kt", m3646l = {113}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.directdeposit.ui.prefilled.submit.PreFilledFormSubmitDuxo$submitRhyForm$1 */
    static final class C141101 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ DirectDepositAmount $depositAmount;
        final /* synthetic */ DirectDepositFormRequestBody $request;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C141101(DirectDepositAmount directDepositAmount, DirectDepositFormRequestBody directDepositFormRequestBody, Continuation<? super C141101> continuation) {
            super(2, continuation);
            this.$depositAmount = directDepositAmount;
            this.$request = directDepositFormRequestBody;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PreFilledFormSubmitDuxo.this.new C141101(this.$depositAmount, this.$request, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C141101) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            DirectDepositFormRequestBody directDepositFormRequestBodyCopy$default;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                RhyBonfireApi rhyBonfireApi = PreFilledFormSubmitDuxo.this.bonfireApi;
                DirectDepositAmount directDepositAmount = this.$depositAmount;
                if (directDepositAmount instanceof DirectDepositAmount.PartialPaycheck.Dollars) {
                    directDepositFormRequestBodyCopy$default = DirectDepositFormRequestBody.copy$default(this.$request, null, null, null, false, ((DirectDepositAmount.PartialPaycheck.Dollars) directDepositAmount).getAmount().toString(), null, 47, null);
                } else if (directDepositAmount instanceof DirectDepositAmount.PartialPaycheck.Percent) {
                    directDepositFormRequestBodyCopy$default = DirectDepositFormRequestBody.copy$default(this.$request, null, null, null, false, null, String.valueOf(((DirectDepositAmount.PartialPaycheck.Percent) directDepositAmount).getPercent()), 31, null);
                } else {
                    if (!Intrinsics.areEqual(directDepositAmount, DirectDepositAmount.EntirePaycheck.INSTANCE) && !Intrinsics.areEqual(directDepositAmount, DirectDepositAmount.Unsupported.INSTANCE)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    directDepositFormRequestBodyCopy$default = this.$request;
                }
                this.label = 1;
                if (rhyBonfireApi.submitDirectDepositForm(directDepositFormRequestBodyCopy$default, this) == coroutine_suspended) {
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

    /* compiled from: PreFilledFormSubmitDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/prefilled/submit/PreFilledFormSubmitDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/directdeposit/ui/prefilled/submit/PreFilledFormSubmitDuxo;", "Lcom/robinhood/android/directdeposit/ui/prefilled/submit/PreFilledFormSubmitFragment$Args;", "<init>", "()V", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<PreFilledFormSubmitDuxo, PreFilledFormSubmitFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public PreFilledFormSubmitFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (PreFilledFormSubmitFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public PreFilledFormSubmitFragment.Args getArgs(PreFilledFormSubmitDuxo preFilledFormSubmitDuxo) {
            return (PreFilledFormSubmitFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, preFilledFormSubmitDuxo);
        }
    }
}
