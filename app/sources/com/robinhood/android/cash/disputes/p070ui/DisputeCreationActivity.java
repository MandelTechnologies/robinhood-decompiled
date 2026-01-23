package com.robinhood.android.cash.disputes.p070ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.robinhood.android.cash.disputes.C10007R;
import com.robinhood.android.cash.disputes.extensions.DisputeQuestionnaires;
import com.robinhood.android.cash.disputes.p070ui.DisputeCreationIntroFragment;
import com.robinhood.android.cash.disputes.p070ui.question.DisputeQuestionCallbacks;
import com.robinhood.android.cash.disputes.p070ui.question.DisputeQuestionResponse;
import com.robinhood.android.cash.disputes.p070ui.question.date.DateQuestionFragment;
import com.robinhood.android.cash.disputes.p070ui.question.decimal.DecimalAmountQuestionFragment;
import com.robinhood.android.cash.disputes.p070ui.question.duplicate.DuplicateAuthorizedTransactionFragment;
import com.robinhood.android.cash.disputes.p070ui.question.freeresponse.FreeResponseQuestionFragment;
import com.robinhood.android.cash.disputes.p070ui.question.image.ImageQuestionFragment;
import com.robinhood.android.cash.disputes.p070ui.question.multiplechoice.MultipleChoiceQuestionFragment;
import com.robinhood.android.cash.disputes.p070ui.reason.DisputeReasonSelectionFragment;
import com.robinhood.android.cash.disputes.p070ui.review.DisputeReviewFragment;
import com.robinhood.android.cash.disputes.p070ui.submitted.DisputeSubmittedFragment;
import com.robinhood.android.cash.disputes.p070ui.transaction.TransactionSelectionFragment;
import com.robinhood.android.cash.disputes.util.DisputeFileSelectionUtil;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.navigation.IntentResolver;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.bonfire.RhyAccountStore;
import com.robinhood.models.api.minerva.ApiDispute;
import com.robinhood.models.p320db.bonfire.RhyAccount;
import com.robinhood.models.p320db.mcduckling.SettledCardTransaction;
import com.robinhood.models.p355ui.DisputeQuestionnaire;
import com.robinhood.shared.remote.assets.LottieUrl;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.extensions.Activity;
import io.reactivex.Single;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;

/* compiled from: DisputeCreationActivity.kt */
@Metadata(m3635d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 R2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b:\u0001RB\u0007¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0014J\b\u0010!\u001a\u00020\u001eH\u0014J\b\u0010\"\u001a\u00020\u001eH\u0016J\u0010\u0010#\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020%H\u0016J\u0016\u0010&\u001a\u00020\u001e2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(H\u0016J\u0010\u0010*\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020,H\u0016J\u0012\u0010-\u001a\u0004\u0018\u00010,2\u0006\u0010.\u001a\u00020\u0012H\u0016J\u0010\u0010/\u001a\u00020\u001e2\u0006\u00100\u001a\u00020,H\u0016J\u0010\u00101\u001a\u00020\u001e2\u0006\u00102\u001a\u000203H\u0016J\u0010\u00104\u001a\u00020\u001e2\u0006\u00105\u001a\u00020\u0012H\u0016J\b\u00106\u001a\u00020\u001eH\u0016J\u0012\u00107\u001a\u00020\u001e2\b\u00108\u001a\u0004\u0018\u00010\u0012H\u0002J\u0010\u00109\u001a\u00020\u001e2\u0006\u0010:\u001a\u00020;H\u0002J\u0010\u0010<\u001a\u00020=2\u0006\u0010:\u001a\u00020>H\u0002J\u0010\u0010?\u001a\u00020@2\u0006\u0010:\u001a\u00020>H\u0002J\u0010\u0010A\u001a\u00020B2\u0006\u0010:\u001a\u00020>H\u0002J\u0010\u0010C\u001a\u00020D2\u0006\u0010:\u001a\u00020>H\u0002J\u0010\u0010E\u001a\u00020F2\u0006\u0010:\u001a\u00020GH\u0002J\u0010\u0010H\u001a\u00020I2\u0006\u0010:\u001a\u00020JH\u0002J\t\u0010K\u001a\u00020LH\u0096\u0001R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0011\u001a\u0004\u0018\u00010\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0018\u0010M\u001a\b\u0012\u0004\u0012\u00020O0NX\u0096\u0005¢\u0006\u0006\u001a\u0004\bP\u0010Q¨\u0006S"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/DisputeCreationActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/cash/disputes/ui/DisputeCreationIntroFragment$Callbacks;", "Lcom/robinhood/android/cash/disputes/ui/transaction/TransactionSelectionFragment$Callbacks;", "Lcom/robinhood/android/cash/disputes/ui/reason/DisputeReasonSelectionFragment$Callbacks;", "Lcom/robinhood/android/cash/disputes/ui/question/DisputeQuestionCallbacks;", "Lcom/robinhood/android/cash/disputes/ui/review/DisputeReviewFragment$Callbacks;", "Lcom/robinhood/android/cash/disputes/ui/submitted/DisputeSubmittedFragment$Callbacks;", "<init>", "()V", "state", "Lcom/robinhood/android/cash/disputes/ui/DisputeCreationState;", "getState", "()Lcom/robinhood/android/cash/disputes/ui/DisputeCreationState;", "state$delegate", "Lkotlin/properties/ReadWriteProperty;", "preselectedTransactionIdExtra", "Ljava/util/UUID;", "getPreselectedTransactionIdExtra", "()Ljava/util/UUID;", "preselectedTransactionIdExtra$delegate", "Lkotlin/Lazy;", "rhyAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "getRhyAccountStore", "()Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "setRhyAccountStore", "(Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onIntroContinue", "onDisputeReasonSelected", "selectedQuestionnaire", "Lcom/robinhood/models/ui/DisputeQuestionnaire;", "onTransactionsSelected", "transactions", "", "Lcom/robinhood/models/db/mcduckling/SettledCardTransaction;", "onQuestionAnswered", "response", "Lcom/robinhood/android/cash/disputes/ui/question/DisputeQuestionResponse;", "getPreviousQuestionResponse", "questionId", "onEditQuestionResponse", "disputeQuestionResponse", "onDisputeSubmitted", "disputeReason", "Lcom/robinhood/models/api/minerva/ApiDispute$Reason;", "startNewCardFlow", "cardId", "completeDisputeFlow", "showNextQuestionOrEnd", "nextQuestionId", "showQuestionFragment", "question", "Lcom/robinhood/models/ui/DisputeQuestionnaire$Question;", "createDateFragment", "Lcom/robinhood/android/cash/disputes/ui/question/date/DateQuestionFragment;", "Lcom/robinhood/models/ui/DisputeQuestionnaire$Question$UserInput;", "createDecimalFragment", "Lcom/robinhood/android/cash/disputes/ui/question/decimal/DecimalAmountQuestionFragment;", "createFreeResponseFragment", "Lcom/robinhood/android/cash/disputes/ui/question/freeresponse/FreeResponseQuestionFragment;", "createImageQuestionFragment", "Lcom/robinhood/android/cash/disputes/ui/question/image/ImageQuestionFragment;", "createMultipleChoiceFragment", "Lcom/robinhood/android/cash/disputes/ui/question/multiplechoice/MultipleChoiceQuestionFragment;", "Lcom/robinhood/models/ui/DisputeQuestionnaire$Question$MultipleChoiceInput;", "createDuplicateAuthorizedTransactionFragment", "Lcom/robinhood/android/cash/disputes/ui/question/duplicate/DuplicateAuthorizedTransactionFragment;", "Lcom/robinhood/models/ui/DisputeQuestionnaire$Question$DuplicateAuthorizedTransactionInput;", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class DisputeCreationActivity extends BaseActivity implements RegionGated, DisputeCreationIntroFragment.Callbacks, TransactionSelectionFragment.Callbacks, DisputeReasonSelectionFragment.Callbacks, DisputeQuestionCallbacks, DisputeReviewFragment.Callbacks, DisputeSubmittedFragment.Callbacks {
    private static final String EXTRA_SETTLED_CARD_TRANSACTION = "settledCardTransactionId";
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: preselectedTransactionIdExtra$delegate, reason: from kotlin metadata */
    private final Lazy preselectedTransactionIdExtra;
    public RhyAccountStore rhyAccountStore;

    /* renamed from: state$delegate, reason: from kotlin metadata */
    private final Interfaces3 state;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(DisputeCreationActivity.class, "state", "getState()Lcom/robinhood/android/cash/disputes/ui/DisputeCreationState;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: DisputeCreationActivity.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DisputeQuestionnaire.Question.UserInput.Type.values().length];
            try {
                iArr[DisputeQuestionnaire.Question.UserInput.Type.DATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DisputeQuestionnaire.Question.UserInput.Type.DECIMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DisputeQuestionnaire.Question.UserInput.Type.FREE_RESPONSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DisputeQuestionnaire.Question.UserInput.Type.FREE_RESPONSE_IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DisputeQuestionnaire.Question.UserInput.Type.IMAGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public DisputeCreationActivity() {
        super(C10007R.layout.activity_dispute_creation);
        this.$$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);
        this.state = (Interfaces3) BindSavedState2.savedParcelable(this, new DisputeCreationState(null, null, null, null, 15, null)).provideDelegate(this, $$delegatedProperties[0]);
        this.preselectedTransactionIdExtra = Activity.intentExtra(this, EXTRA_SETTLED_CARD_TRANSACTION);
    }

    private final DisputeCreationState getState() {
        return (DisputeCreationState) this.state.getValue(this, $$delegatedProperties[0]);
    }

    private final UUID getPreselectedTransactionIdExtra() {
        return (UUID) this.preselectedTransactionIdExtra.getValue();
    }

    public final RhyAccountStore getRhyAccountStore() {
        RhyAccountStore rhyAccountStore = this.rhyAccountStore;
        if (rhyAccountStore != null) {
            return rhyAccountStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rhyAccountStore");
        return null;
    }

    public final void setRhyAccountStore(RhyAccountStore rhyAccountStore) {
        Intrinsics.checkNotNullParameter(rhyAccountStore, "<set-?>");
        this.rhyAccountStore = rhyAccountStore;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LottieUrl.CM_DISPUTES_INTRO.prefetch(this);
        if (savedInstanceState == null) {
            Single<Optional<RhyAccount>> singleFirst = getRhyAccountStore().streamSpendingAccount().first(Optional2.INSTANCE);
            Intrinsics.checkNotNullExpressionValue(singleFirst, "first(...)");
            LifecycleHost.DefaultImpls.bind$default(this, singleFirst, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.disputes.ui.DisputeCreationActivity$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DisputeCreationActivity.onCreate$lambda$0(this.f$0, (Optional) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(DisputeCreationActivity disputeCreationActivity, Optional optional) {
        disputeCreationActivity.setFragment(C10007R.id.fragment_container, DisputeCreationIntroFragment.INSTANCE.newInstance((Parcelable) new DisputeCreationIntroFragment.Args(optional.getOrNull() != null)));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        DisputeFileSelectionUtil.INSTANCE.clearCameraImageDirectory(this);
    }

    @Override // com.robinhood.android.cash.disputes.ui.DisputeCreationIntroFragment.Callbacks
    public void onIntroContinue() {
        replaceFragment(DisputeReasonSelectionFragment.INSTANCE.newInstance());
    }

    @Override // com.robinhood.android.cash.disputes.ui.reason.DisputeReasonSelectionFragment.Callbacks
    public void onDisputeReasonSelected(DisputeQuestionnaire selectedQuestionnaire) {
        Intrinsics.checkNotNullParameter(selectedQuestionnaire, "selectedQuestionnaire");
        getState().setSelectedQuestionnaire(selectedQuestionnaire);
        getState().resetQuestionResponses();
        getState().resetSelectedTransactions(getPreselectedTransactionIdExtra());
        if (getState().shouldSkipTransactionSelection(getPreselectedTransactionIdExtra(), selectedQuestionnaire.getTransactionSelectionSettings().getCanSelectMultiple())) {
            DisputeQuestionnaire selectedQuestionnaire2 = getState().getSelectedQuestionnaire();
            Intrinsics.checkNotNull(selectedQuestionnaire2);
            showQuestionFragment(DisputeQuestionnaires.getFirstQuestion(selectedQuestionnaire2));
            return;
        }
        replaceFragment(TransactionSelectionFragment.INSTANCE.newInstance((Parcelable) new TransactionSelectionFragment.Args(selectedQuestionnaire.getTransactionSelectionSettings(), selectedQuestionnaire.getDisputeReasonEnum(), getPreselectedTransactionIdExtra())));
    }

    @Override // com.robinhood.android.cash.disputes.ui.transaction.TransactionSelectionFragment.Callbacks
    public void onTransactionsSelected(List<SettledCardTransaction> transactions) {
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        DisputeCreationState state = getState();
        List<SettledCardTransaction> list = transactions;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((SettledCardTransaction) it.next()).getId());
        }
        state.setSelectedTransactionIds(arrayList);
        DisputeQuestionnaire selectedQuestionnaire = getState().getSelectedQuestionnaire();
        Intrinsics.checkNotNull(selectedQuestionnaire);
        showQuestionFragment(DisputeQuestionnaires.getFirstQuestion(selectedQuestionnaire));
    }

    @Override // com.robinhood.android.cash.disputes.p070ui.question.DisputeQuestionCallbacks
    public void onQuestionAnswered(DisputeQuestionResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        getState().saveQuestionResponse(response);
        showNextQuestionOrEnd(response.getNextQuestionId());
    }

    @Override // com.robinhood.android.cash.disputes.p070ui.question.DisputeQuestionCallbacks
    public DisputeQuestionResponse getPreviousQuestionResponse(UUID questionId) {
        Intrinsics.checkNotNullParameter(questionId, "questionId");
        return getState().getPreviousQuestionResponse(questionId);
    }

    @Override // com.robinhood.android.cash.disputes.ui.review.DisputeReviewFragment.Callbacks
    public void onEditQuestionResponse(DisputeQuestionResponse disputeQuestionResponse) {
        Intrinsics.checkNotNullParameter(disputeQuestionResponse, "disputeQuestionResponse");
        getState().enterEditMode();
        showQuestionFragment(disputeQuestionResponse.getQuestion());
    }

    @Override // com.robinhood.android.cash.disputes.ui.review.DisputeReviewFragment.Callbacks
    public void onDisputeSubmitted(ApiDispute.Reason disputeReason) {
        Intrinsics.checkNotNullParameter(disputeReason, "disputeReason");
        popEntireFragmentBackstack();
        replaceFragmentWithoutBackStack(DisputeSubmittedFragment.INSTANCE.newInstance((Parcelable) new DisputeSubmittedFragment.Args(disputeReason, getState().getSelectedTransactionIds())));
    }

    @Override // com.robinhood.android.cash.disputes.ui.submitted.DisputeSubmittedFragment.Callbacks
    public void startNewCardFlow(UUID cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Navigator.DefaultImpls.startActivity$default(getNavigator(), this, new LegacyIntentKey.CardHelp(cardId, LegacyIntentKey.CardHelp.LaunchMode.UNAUTHORIZED_TRANSACTION, null, 4, null), null, false, null, null, 60, null);
        finish();
    }

    @Override // com.robinhood.android.cash.disputes.ui.submitted.DisputeSubmittedFragment.Callbacks
    public void completeDisputeFlow() {
        finish();
    }

    private final void showNextQuestionOrEnd(UUID nextQuestionId) {
        DisputeQuestionnaire.Question nextQuestion = getState().getNextQuestion(nextQuestionId);
        if (nextQuestion == null) {
            Integer numExitEditMode = getState().exitEditMode();
            if (numExitEditMode != null) {
                popFragments(numExitEditMode.intValue() + 1);
            }
            DisputeReviewFragment.Companion companion = DisputeReviewFragment.INSTANCE;
            DisputeQuestionnaire selectedQuestionnaire = getState().getSelectedQuestionnaire();
            Intrinsics.checkNotNull(selectedQuestionnaire);
            replaceFragment(companion.newInstance((Parcelable) new DisputeReviewFragment.Args(selectedQuestionnaire, getState().getSelectedTransactionIds(), getState().getCurrentQuestionResponses())));
            return;
        }
        showQuestionFragment(nextQuestion);
    }

    private final void showQuestionFragment(DisputeQuestionnaire.Question question) {
        Fragment fragmentCreateDuplicateAuthorizedTransactionFragment;
        if (question instanceof DisputeQuestionnaire.Question.UserInput) {
            DisputeQuestionnaire.Question.UserInput userInput = (DisputeQuestionnaire.Question.UserInput) question;
            int i = WhenMappings.$EnumSwitchMapping$0[userInput.getType().ordinal()];
            if (i == 1) {
                fragmentCreateDuplicateAuthorizedTransactionFragment = createDateFragment(userInput);
            } else if (i == 2) {
                fragmentCreateDuplicateAuthorizedTransactionFragment = createDecimalFragment(userInput);
            } else if (i == 3) {
                fragmentCreateDuplicateAuthorizedTransactionFragment = createFreeResponseFragment(userInput);
            } else {
                if (i != 4 && i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                fragmentCreateDuplicateAuthorizedTransactionFragment = createImageQuestionFragment(userInput);
            }
        } else if (question instanceof DisputeQuestionnaire.Question.MultipleChoiceInput) {
            fragmentCreateDuplicateAuthorizedTransactionFragment = createMultipleChoiceFragment((DisputeQuestionnaire.Question.MultipleChoiceInput) question);
        } else {
            if (!(question instanceof DisputeQuestionnaire.Question.DuplicateAuthorizedTransactionInput)) {
                throw new NoWhenBranchMatchedException();
            }
            fragmentCreateDuplicateAuthorizedTransactionFragment = createDuplicateAuthorizedTransactionFragment((DisputeQuestionnaire.Question.DuplicateAuthorizedTransactionInput) question);
        }
        replaceFragment(fragmentCreateDuplicateAuthorizedTransactionFragment);
    }

    private final DateQuestionFragment createDateFragment(DisputeQuestionnaire.Question.UserInput question) {
        DateQuestionFragment.Companion companion = DateQuestionFragment.INSTANCE;
        List<UUID> selectedTransactionIds = getState().getSelectedTransactionIds();
        DisputeQuestionnaire selectedQuestionnaire = getState().getSelectedQuestionnaire();
        Intrinsics.checkNotNull(selectedQuestionnaire);
        return (DateQuestionFragment) companion.newInstance((Parcelable) new DateQuestionFragment.Args(question, selectedTransactionIds, selectedQuestionnaire.getDisputeReasonEnum()));
    }

    private final DecimalAmountQuestionFragment createDecimalFragment(DisputeQuestionnaire.Question.UserInput question) {
        DecimalAmountQuestionFragment.Companion companion = DecimalAmountQuestionFragment.INSTANCE;
        List<UUID> selectedTransactionIds = getState().getSelectedTransactionIds();
        DisputeQuestionnaire selectedQuestionnaire = getState().getSelectedQuestionnaire();
        Intrinsics.checkNotNull(selectedQuestionnaire);
        return (DecimalAmountQuestionFragment) companion.newInstance((Parcelable) new DecimalAmountQuestionFragment.Args(question, selectedTransactionIds, selectedQuestionnaire.getDisputeReasonEnum()));
    }

    private final FreeResponseQuestionFragment createFreeResponseFragment(DisputeQuestionnaire.Question.UserInput question) {
        FreeResponseQuestionFragment.Companion companion = FreeResponseQuestionFragment.INSTANCE;
        List<UUID> selectedTransactionIds = getState().getSelectedTransactionIds();
        DisputeQuestionnaire selectedQuestionnaire = getState().getSelectedQuestionnaire();
        Intrinsics.checkNotNull(selectedQuestionnaire);
        return (FreeResponseQuestionFragment) companion.newInstance((Parcelable) new FreeResponseQuestionFragment.Args(question, selectedTransactionIds, selectedQuestionnaire.getDisputeReasonEnum()));
    }

    private final ImageQuestionFragment createImageQuestionFragment(DisputeQuestionnaire.Question.UserInput question) {
        ImageQuestionFragment.Companion companion = ImageQuestionFragment.INSTANCE;
        List<UUID> selectedTransactionIds = getState().getSelectedTransactionIds();
        DisputeQuestionnaire selectedQuestionnaire = getState().getSelectedQuestionnaire();
        Intrinsics.checkNotNull(selectedQuestionnaire);
        return (ImageQuestionFragment) companion.newInstance((Parcelable) new ImageQuestionFragment.Args(question, selectedTransactionIds, selectedQuestionnaire.getDisputeReasonEnum()));
    }

    private final MultipleChoiceQuestionFragment createMultipleChoiceFragment(DisputeQuestionnaire.Question.MultipleChoiceInput question) {
        MultipleChoiceQuestionFragment.Companion companion = MultipleChoiceQuestionFragment.INSTANCE;
        DisputeQuestionnaire selectedQuestionnaire = getState().getSelectedQuestionnaire();
        Intrinsics.checkNotNull(selectedQuestionnaire);
        return (MultipleChoiceQuestionFragment) companion.newInstance((Parcelable) new MultipleChoiceQuestionFragment.Args(question, selectedQuestionnaire.getDisputeReasonEnum()));
    }

    private final DuplicateAuthorizedTransactionFragment createDuplicateAuthorizedTransactionFragment(DisputeQuestionnaire.Question.DuplicateAuthorizedTransactionInput question) {
        return (DuplicateAuthorizedTransactionFragment) DuplicateAuthorizedTransactionFragment.INSTANCE.newInstance((Parcelable) new DuplicateAuthorizedTransactionFragment.Args(question, (UUID) CollectionsKt.first((List) getState().getSelectedTransactionIds())));
    }

    /* compiled from: DisputeCreationActivity.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/DisputeCreationActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolver;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$DisputeCreation;", "<init>", "()V", "EXTRA_SETTLED_CARD_TRANSACTION", "", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "key", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolver<LegacyIntentKey.DisputeCreation> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, LegacyIntentKey.DisputeCreation key) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(key, "key");
            Intent intentPutExtra = new Intent(context, (Class<?>) DisputeCreationActivity.class).putExtra(DisputeCreationActivity.EXTRA_SETTLED_CARD_TRANSACTION, key.getSettledCardTransactionId());
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
            return intentPutExtra;
        }
    }
}
