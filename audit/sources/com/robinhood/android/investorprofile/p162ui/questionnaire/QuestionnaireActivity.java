package com.robinhood.android.investorprofile.p162ui.questionnaire;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;
import androidx.fragment.app.FragmentManager;
import androidx.view.result.ActivityResult;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.contract.ActivityResultContracts$StartActivityForResult;
import com.robinhood.android.account.strings.AccountDisplayNames;
import com.robinhood.android.account.strings.DisplayName;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.investorprofile.C19641R;
import com.robinhood.android.investorprofile.p162ui.questionnaire.BaseQuestionnaireParentFragment;
import com.robinhood.android.investorprofile.p162ui.questionnaire.QuestionnaireParentFragment;
import com.robinhood.android.investorprofile.p162ui.questionnaire.graph.QuestionnaireGraphArgs;
import com.robinhood.android.investorprofile.p162ui.questionnaire.graph.QuestionnaireGraphParentFragment;
import com.robinhood.android.investorprofile.p162ui.questionnaire.load.LoadQuestionnaireArgs;
import com.robinhood.android.investorprofile.p162ui.questionnaire.load.QuestionnaireLoadConfigurationFragment;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract3;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.questionnaire.api.ApiQuestionnaireSubmitResponse;
import com.robinhood.android.questionnaire.api.ReviewPageType;
import com.robinhood.android.questionnaire.api.ReviewQueryParams;
import com.robinhood.android.questionnaire.p219db.QuestionnaireContexts;
import com.robinhood.android.questionnaire.p220ui.QuestionnaireAnswer;
import com.robinhood.android.questionnaire.p220ui.UiQuestionnaireQuestion;
import com.robinhood.android.util.play.GooglePlay;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.investorprofile.questionnaire.QuestionnaireLoggingParams;
import com.robinhood.models.p320db.Account;
import com.robinhood.shared.questionnaire.contracts.InvestmentProfileSettings;
import com.robinhood.shared.questionnaire.contracts.Questionnaire;
import com.robinhood.shared.questionnaire.contracts.QuestionnaireContract2;
import com.robinhood.shared.questionnaire.contracts.QuestionnaireProgressBarData;
import com.robinhood.shared.questionnaire.contracts.QuestionnaireQuestion;
import com.robinhood.shared.questionnaire.contracts.QuestionnaireReview;
import com.robinhood.store.questionnaire.QuestionnaireQuestionsResult;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import com.robinhood.utils.extensions.ContextsUiExtensions;
import com.robinhood.utils.extensions.StringsKt;
import com.robinhood.utils.resource.StringResource;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;

/* compiled from: QuestionnaireActivity.kt */
@Metadata(m3635d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 <2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001<B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014J\u0010\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020 H\u0014J\u0010\u0010!\u001a\u00020\b2\u0006\u0010\"\u001a\u00020#H\u0016J\u001a\u0010$\u001a\u00020\b2\u0006\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u001aH\u0016J\u0010\u0010(\u001a\u00020\u00182\u0006\u0010%\u001a\u00020&H\u0016J\u0010\u0010)\u001a\u00020\u00182\u0006\u0010*\u001a\u00020+H\u0016J\u0010\u0010,\u001a\u00020\u00182\u0006\u0010-\u001a\u00020.H\u0016J\b\u0010/\u001a\u00020\u0018H\u0016J \u00100\u001a\u00020\u00182\b\u00101\u001a\u0004\u0018\u0001022\f\u00103\u001a\b\u0012\u0004\u0012\u00020504H\u0016J\b\u00106\u001a\u00020\u0018H\u0016J\u0012\u00107\u001a\u00020\u00182\b\u00108\u001a\u0004\u0018\u000109H\u0002J\b\u0010:\u001a\u00020\u0018H\u0002J\b\u0010;\u001a\u00020\u0018H\u0002R+\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006="}, m3636d2 = {"Lcom/robinhood/android/investorprofile/ui/questionnaire/QuestionnaireActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/common/ui/RhDialogFragment$OnDismissListener;", "Lcom/robinhood/android/investorprofile/ui/questionnaire/load/QuestionnaireLoadConfigurationFragment$Callbacks;", "Lcom/robinhood/android/investorprofile/ui/questionnaire/BaseQuestionnaireParentFragment$Callbacks;", "<init>", "()V", "<set-?>", "", "hasShownReviewScreen", "getHasShownReviewScreen", "()Z", "setHasShownReviewScreen", "(Z)V", "hasShownReviewScreen$delegate", "Lkotlin/properties/ReadWriteProperty;", "loggingInfo", "Lcom/robinhood/android/investorprofile/ui/questionnaire/QuestionnaireLoggingInfo;", "getLoggingInfo", "()Lcom/robinhood/android/investorprofile/ui/questionnaire/QuestionnaireLoggingInfo;", "questionnaireReviewResultContract", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "createOptionsMenu", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Landroid/view/MenuItem;", "onPositiveButtonClicked", "id", "", "passthroughArgs", "onDialogDismissed", "onLoadQuestionnaireConfigurationSuccess", "result", "Lcom/robinhood/store/questionnaire/QuestionnaireQuestionsResult;", "onLoadQuestionnaireConfigurationFailed", "throwable", "", "onAccountNotCreated", "onQuestionnaireFlowCompleted", "response", "Lcom/robinhood/android/questionnaire/api/ApiQuestionnaireSubmitResponse;", "questionAnswers", "", "Lcom/robinhood/android/questionnaire/ui/QuestionnaireAnswer;", "onQuestionnaireFlowAborted", "showReviewScreen", "reviewPageType", "Lcom/robinhood/android/questionnaire/api/ReviewPageType;", "showAlreadyCompletedDialog", "showUpdateAppDialog", "Companion", "feature-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class QuestionnaireActivity extends BaseActivity implements RhDialogFragment.OnDismissListener, QuestionnaireLoadConfigurationFragment.Callbacks, BaseQuestionnaireParentFragment.Callbacks {
    private static final String DIALOG_QUESTIONNAIRE_ALREADY_COMPLETED = "questionnaireAlreadyCompleted";
    private static final String DIALOG_SUITABILITY_ALREADY_COMPLETED = "suitabilityAlreadyCompleted";
    private static final String DIALOG_UPDATE_APP = "updateApp";

    /* renamed from: hasShownReviewScreen$delegate, reason: from kotlin metadata */
    private final Interfaces3 hasShownReviewScreen;
    private final ActivityResultLauncher<Intent> questionnaireReviewResultContract;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(QuestionnaireActivity.class, "hasShownReviewScreen", "getHasShownReviewScreen()Z", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public QuestionnaireActivity() {
        super(C11048R.layout.activity_fragment_container);
        this.hasShownReviewScreen = BindSavedState2.savedBoolean(this, false).provideDelegate(this, $$delegatedProperties[0]);
        this.questionnaireReviewResultContract = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new ActivityResultCallback() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.QuestionnaireActivity$questionnaireReviewResultContract$1
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(ActivityResult it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (it.getResultCode() == -1) {
                    this.this$0.setResult(-1);
                }
                this.this$0.finish();
            }
        });
    }

    private final boolean getHasShownReviewScreen() {
        return ((Boolean) this.hasShownReviewScreen.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    private final void setHasShownReviewScreen(boolean z) {
        this.hasShownReviewScreen.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z));
    }

    private final QuestionnaireLoggingInfo getLoggingInfo() {
        Companion companion = INSTANCE;
        return new QuestionnaireLoggingInfo(((Questionnaire) companion.getExtras((Activity) this)).getContext(), ((Questionnaire) companion.getExtras((Activity) this)).getLoggingParams());
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            IdlingResourceCounters2.setBusy(IdlingResourceType.QUESTIONNAIRE_QUESTIONS_LOADING, true);
            int i = C19641R.id.fragment_container;
            QuestionnaireLoadConfigurationFragment.Companion companion = QuestionnaireLoadConfigurationFragment.INSTANCE;
            Companion companion2 = INSTANCE;
            QuestionnaireQuestion investorProfileQuestion = ((Questionnaire) companion2.getExtras((Activity) this)).getInvestorProfileQuestion();
            String questionKey = investorProfileQuestion != null ? investorProfileQuestion.getQuestionKey() : null;
            String context = ((Questionnaire) companion2.getExtras((Activity) this)).getContext();
            String accountNumber = ((Questionnaire) companion2.getExtras((Activity) this)).getAccountNumber();
            boolean includeQuestionsAlreadyAnswered = ((Questionnaire) companion2.getExtras((Activity) this)).getIncludeQuestionsAlreadyAnswered();
            QuestionnaireQuestion investorProfileQuestion2 = ((Questionnaire) companion2.getExtras((Activity) this)).getInvestorProfileQuestion();
            setFragment(i, companion.newInstance((Parcelable) new LoadQuestionnaireArgs(context, accountNumber, includeQuestionsAlreadyAnswered, questionKey, investorProfileQuestion2 != null ? investorProfileQuestion2.getQuestionId() : null, ((Questionnaire) companion2.getExtras((Activity) this)).getQuestionGraph())));
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setUseDesignSystemTheme(true);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    protected boolean createOptionsMenu(Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Companion companion = INSTANCE;
        if (!((Questionnaire) companion.getExtras((Activity) this)).isBlocking() && Intrinsics.areEqual(((Questionnaire) companion.getExtras((Activity) this)).getContext(), QuestionnaireContexts.CRYPTO_SCAM)) {
            getMenuInflater().inflate(C19641R.menu.menu_close, menu);
            return true;
        }
        return super.createOptionsMenu(menu);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == C19641R.id.action_close) {
            onQuestionnaireFlowAborted();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) throws Resources.NotFoundException {
        if (id == C19641R.id.dialog_id_suitability_update_required) {
            if (!GooglePlay.INSTANCE.launchStore(this)) {
                String string2 = getResources().getString(C11048R.string.force_update_error_no_play_store, "Robinhood");
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                ContextsUiExtensions.showLongToast(this, string2);
            }
            return true;
        }
        if (id == C19641R.id.dialog_id_suitability_already_completed) {
            finish();
            Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(getNavigator(), this, new InvestmentProfileSettings(null, null, null, false, false, false, null, false, false, false, false, null, null, 8166, null), false, false, false, false, null, false, null, null, 1012, null);
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        if (id == C19641R.id.dialog_id_questionnaire_already_completed) {
            setResult(-1);
            finish();
        } else if (id == C19641R.id.dialog_id_suitability_already_completed || id == C19641R.id.dialog_id_suitability_update_required || id == C11048R.id.dialog_id_generic_error) {
            finish();
        }
    }

    @Override // com.robinhood.android.investorprofile.ui.questionnaire.load.QuestionnaireLoadConfigurationFragment.Callbacks
    public void onLoadQuestionnaireConfigurationSuccess(QuestionnaireQuestionsResult result) {
        String rootQuestion;
        DisplayName displayName;
        DisplayName.Variants variants;
        Intrinsics.checkNotNullParameter(result, "result");
        Companion companion = INSTANCE;
        boolean fromGold = ((Questionnaire) companion.getExtras((Activity) this)).getFromGold();
        boolean skipSplashScreens = ((Questionnaire) companion.getExtras((Activity) this)).getSkipSplashScreens();
        boolean z = fromGold || ((Questionnaire) companion.getExtras((Activity) this)).getInvestorProfileQuestion() != null;
        if (Intrinsics.areEqual(result, QuestionnaireQuestionsResult.HasUnknownQuestionType.INSTANCE)) {
            showUpdateAppDialog();
        } else if (Intrinsics.areEqual(result, QuestionnaireQuestionsResult.HasNoQuestions.INSTANCE)) {
            if (((Questionnaire) companion.getExtras((Activity) this)).getShowReviewScreen()) {
                showReviewScreen(ReviewPageType.NO_SUBMISSION);
            } else {
                showAlreadyCompletedDialog();
            }
        } else if (result instanceof QuestionnaireQuestionsResult.QuestionList) {
            QuestionnaireParentFragment.Companion companion2 = QuestionnaireParentFragment.INSTANCE;
            boolean zIsBlocking = ((Questionnaire) companion.getExtras((Activity) this)).isBlocking();
            boolean z2 = skipSplashScreens || z;
            boolean z3 = ((Questionnaire) companion.getExtras((Activity) this)).getShowReviewScreen() || z || ((Questionnaire) companion.getExtras((Activity) this)).getSkipCompletedScreen();
            boolean skipSubmitData = ((Questionnaire) companion.getExtras((Activity) this)).getSkipSubmitData();
            QuestionnaireQuestionsResult.QuestionList questionList = (QuestionnaireQuestionsResult.QuestionList) result;
            List<UiQuestionnaireQuestion.Supported> questions = questionList.getQuestions();
            QuestionnaireQuestion investorProfileQuestion = ((Questionnaire) companion.getExtras((Activity) this)).getInvestorProfileQuestion();
            String context = ((Questionnaire) companion.getExtras((Activity) this)).getContext();
            String accountNumber = ((Questionnaire) companion.getExtras((Activity) this)).getAccountNumber();
            String applicationId = ((Questionnaire) companion.getExtras((Activity) this)).getApplicationId();
            String referenceKey = ((Questionnaire) companion.getExtras((Activity) this)).getReferenceKey();
            QuestionnaireLoggingInfo loggingInfo = getLoggingInfo();
            ReviewQueryParams reviewQueryParams = ((Questionnaire) companion.getExtras((Activity) this)).getReviewQueryParams();
            boolean showProgressBar = ((Questionnaire) companion.getExtras((Activity) this)).getShowProgressBar();
            boolean showExistingAnswer = ((Questionnaire) companion.getExtras((Activity) this)).getShowExistingAnswer();
            QuestionnaireProgressBarData progressBarData = ((Questionnaire) companion.getExtras((Activity) this)).getProgressBarData();
            Account account = questionList.getAccount();
            StringResource title = null;
            BrokerageAccountType brokerageAccountType = account != null ? account.getBrokerageAccountType() : null;
            boolean useInfoGatherFlow = ((Questionnaire) companion.getExtras((Activity) this)).getUseInfoGatherFlow();
            Account account2 = questionList.getAccount();
            if (account2 != null && (displayName = AccountDisplayNames.getDisplayName(account2)) != null && (variants = displayName.getShort()) != null) {
                title = variants.getTitle();
            }
            replaceFragment(companion2.newInstance(zIsBlocking, z2, z3, skipSubmitData, questions, investorProfileQuestion, context, accountNumber, applicationId, referenceKey, loggingInfo, reviewQueryParams, showProgressBar, showExistingAnswer, progressBarData, brokerageAccountType, useInfoGatherFlow, title));
        } else {
            if (!(result instanceof QuestionnaireQuestionsResult.QuestionGraph)) {
                throw new NoWhenBranchMatchedException();
            }
            QuestionnaireQuestion investorProfileQuestion2 = ((Questionnaire) companion.getExtras((Activity) this)).getInvestorProfileQuestion();
            if (investorProfileQuestion2 == null || (rootQuestion = investorProfileQuestion2.getQuestionId()) == null) {
                rootQuestion = ((QuestionnaireQuestionsResult.QuestionGraph) result).getRootQuestion();
            }
            String str = rootQuestion;
            QuestionnaireQuestionsResult.QuestionGraph questionGraph = (QuestionnaireQuestionsResult.QuestionGraph) result;
            if (!questionGraph.getGraph().containsKey(str)) {
                showUpdateAppDialog();
            } else {
                replaceFragment(QuestionnaireGraphParentFragment.INSTANCE.newInstance((Parcelable) new QuestionnaireGraphArgs(((Questionnaire) companion.getExtras((Activity) this)).getContext(), ((Questionnaire) companion.getExtras((Activity) this)).getAccountNumber(), null, ((Questionnaire) companion.getExtras((Activity) this)).getApplicationId(), ((Questionnaire) companion.getExtras((Activity) this)).getReferenceKey(), questionGraph.getGraph(), str, getLoggingInfo(), ((Questionnaire) companion.getExtras((Activity) this)).getInvestorProfileQuestion(), skipSplashScreens || z, ((Questionnaire) companion.getExtras((Activity) this)).getShowReviewScreen() || z || ((Questionnaire) companion.getExtras((Activity) this)).getSkipCompletedScreen(), ((Questionnaire) companion.getExtras((Activity) this)).isBlocking(), ((Questionnaire) companion.getExtras((Activity) this)).getShowProgressBar() || Intrinsics.areEqual(((Questionnaire) companion.getExtras((Activity) this)).getContext(), QuestionnaireContexts.CRYPTO_SCAM), ((Questionnaire) companion.getExtras((Activity) this)).getProgressBarData())));
            }
        }
        IdlingResourceCounters2.setBusy(IdlingResourceType.INVESTMENT_PROFILE_SETTINGS_LOADING, false);
        IdlingResourceCounters2.setBusy(IdlingResourceType.QUESTIONNAIRE_QUESTIONS_LOADING, false);
    }

    @Override // com.robinhood.android.investorprofile.ui.questionnaire.load.QuestionnaireLoadConfigurationFragment.Callbacks
    public void onLoadQuestionnaireConfigurationFailed(Throwable throwable) throws Throwable {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        ActivityErrorHandler.Companion.handle$default(ActivityErrorHandler.INSTANCE, this, throwable, true, false, 0, null, 56, null);
        NavigationActivityResultContract3.setResult(this, new QuestionnaireContract2.Error(throwable));
    }

    @Override // com.robinhood.android.investorprofile.ui.questionnaire.BaseQuestionnaireParentFragment.Callbacks
    public void onAccountNotCreated() throws Resources.NotFoundException {
        ContextsUiExtensions.showLongToast(this, C19641R.string.questionnaire_error_no_account);
        NavigationActivityResultContract3.setResult(this, new QuestionnaireContract2.Error(new Exception("questionnaire_error_no_account")));
        finish();
    }

    @Override // com.robinhood.android.investorprofile.ui.questionnaire.BaseQuestionnaireParentFragment.Callbacks
    public void onQuestionnaireFlowCompleted(ApiQuestionnaireSubmitResponse response, List<? extends QuestionnaireAnswer> questionAnswers) {
        Intrinsics.checkNotNullParameter(questionAnswers, "questionAnswers");
        Companion companion = INSTANCE;
        if (((Questionnaire) companion.getExtras((Activity) this)).getShowReviewScreen()) {
            showReviewScreen(response != null ? response.getReview_page_type() : null);
            return;
        }
        setResult(-1);
        NavigationActivityResultContract3.setResult(this, new QuestionnaireContract2.Completed(((Questionnaire) companion.getExtras((Activity) this)).getContext(), questionAnswers));
        finish();
    }

    @Override // com.robinhood.android.investorprofile.ui.questionnaire.BaseQuestionnaireParentFragment.Callbacks
    public void onQuestionnaireFlowAborted() {
        NavigationActivityResultContract3.setResult(this, new QuestionnaireContract2.Canceled(((Questionnaire) INSTANCE.getExtras((Activity) this)).getContext()));
        finish();
    }

    private final void showReviewScreen(ReviewPageType reviewPageType) {
        if (getHasShownReviewScreen()) {
            return;
        }
        setHasShownReviewScreen(true);
        Navigator navigator = getNavigator();
        Companion companion = INSTANCE;
        String context = ((Questionnaire) companion.getExtras((Activity) this)).getContext();
        String accountNumber = ((Questionnaire) companion.getExtras((Activity) this)).getAccountNumber();
        QuestionnaireLoggingParams loggingParams = ((Questionnaire) companion.getExtras((Activity) this)).getLoggingParams();
        String applicationId = ((Questionnaire) companion.getExtras((Activity) this)).getApplicationId();
        this.questionnaireReviewResultContract.launch(Navigator.DefaultImpls.createIntentForFragment$default(navigator, this, new QuestionnaireReview(context, accountNumber, reviewPageType, loggingParams, applicationId != null ? StringsKt.toUuid(applicationId) : null), false, false, false, null, false, true, ((Questionnaire) companion.getExtras((Activity) this)).getUseCloseButtonForReview(), false, false, null, false, 7796, null));
    }

    private final void showAlreadyCompletedDialog() {
        if (Intrinsics.areEqual(((Questionnaire) INSTANCE.getExtras((Activity) this)).getContext(), QuestionnaireContexts.SUITABILITY)) {
            RhDialogFragment.Builder negativeButton = RhDialogFragment.INSTANCE.create(this).setId(C19641R.id.dialog_id_suitability_already_completed).setTitle(C19641R.string.questionnaire_already_completed_title, new Object[0]).setMessage(C19641R.string.questionnaire_already_completed_message, new Object[0]).setPositiveButton(C19641R.string.questionnaire_already_completed_primary_cta, new Object[0]).setNegativeButton(C11048R.string.general_label_dismiss, new Object[0]);
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            RhDialogFragment.Builder.show$default(negativeButton, supportFragmentManager, DIALOG_SUITABILITY_ALREADY_COMPLETED, false, 4, null);
            return;
        }
        RhDialogFragment.Builder positiveButton = RhDialogFragment.INSTANCE.create(this).setId(C19641R.id.dialog_id_questionnaire_already_completed).setTitle(C19641R.string.questionnaire_already_completed_title, new Object[0]).setPositiveButton(C11048R.string.general_label_dismiss, new Object[0]);
        FragmentManager supportFragmentManager2 = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "getSupportFragmentManager(...)");
        RhDialogFragment.Builder.show$default(positiveButton, supportFragmentManager2, DIALOG_QUESTIONNAIRE_ALREADY_COMPLETED, false, 4, null);
    }

    private final void showUpdateAppDialog() {
        RhDialogFragment.Builder negativeButton = RhDialogFragment.INSTANCE.create(this).setId(C19641R.id.dialog_id_suitability_update_required).setTitle(C19641R.string.questionnaire_update_required_title, new Object[0]).setMessage(C19641R.string.questionnaire_update_required_message, new Object[0]).setPositiveButton(C19641R.string.questionnaire_update_required_action, new Object[0]).setNegativeButton(C11048R.string.general_label_dismiss, new Object[0]);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        RhDialogFragment.Builder.show$default(negativeButton, supportFragmentManager, DIALOG_UPDATE_APP, false, 4, null);
    }

    /* compiled from: QuestionnaireActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/investorprofile/ui/questionnaire/QuestionnaireActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/investorprofile/ui/questionnaire/QuestionnaireActivity;", "Lcom/robinhood/shared/questionnaire/contracts/Questionnaire;", "<init>", "()V", "DIALOG_UPDATE_APP", "", "DIALOG_SUITABILITY_ALREADY_COMPLETED", "DIALOG_QUESTIONNAIRE_ALREADY_COMPLETED", "feature-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<QuestionnaireActivity, Questionnaire> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public Questionnaire getExtras(QuestionnaireActivity questionnaireActivity) {
            return (Questionnaire) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, questionnaireActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, Questionnaire questionnaire) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, questionnaire);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, Questionnaire questionnaire) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, questionnaire);
        }
    }
}
