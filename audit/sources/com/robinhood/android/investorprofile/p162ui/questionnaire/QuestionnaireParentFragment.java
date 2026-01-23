package com.robinhood.android.investorprofile.p162ui.questionnaire;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.view.BackEventCompat;
import androidx.view.result.ActivityResult;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultCaller;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.contract.ActivityResultContracts$StartActivityForResult;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.android.investorprofile.p162ui.questionnaire.ContextualQuestionInfo;
import com.robinhood.android.investorprofile.p162ui.questionnaire.completed.QuestionnaireCompletedFragment;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.questionnaire.api.ReviewQueryParams;
import com.robinhood.android.questionnaire.p219db.QuestionnaireContexts;
import com.robinhood.android.questionnaire.p220ui.QuestionnaireAnswer;
import com.robinhood.android.questionnaire.p220ui.UiQuestionnaireQuestion;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.shared.questionnaire.contracts.InvestmentProfileSettings;
import com.robinhood.shared.questionnaire.contracts.QuestionnaireProgressBarData;
import com.robinhood.shared.questionnaire.contracts.QuestionnaireQuestion;
import com.robinhood.utils.extensions.Bundles;
import com.robinhood.utils.resource.StringResource;
import io.reactivex.Single;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;

/* compiled from: QuestionnaireParentFragment.kt */
@Metadata(m3635d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004:\u0001rB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010b\u001a\u00020c2\b\u0010d\u001a\u0004\u0018\u00010eH\u0016J\b\u0010f\u001a\u00020cH\u0016J\b\u0010g\u001a\u00020cH\u0016J\u0010\u0010h\u001a\u00020c2\u0006\u0010i\u001a\u00020CH\u0002J\b\u0010j\u001a\u00020kH\u0016J\b\u0010l\u001a\u00020cH\u0016J\u0018\u0010m\u001a\u00020c2\u0006\u0010n\u001a\u00020\u00032\u0006\u0010o\u001a\u00020DH\u0016J\u000e\u0010p\u001a\b\u0012\u0004\u0012\u00020c0qH\u0016R!\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u000e\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0018\u001a\u0004\u0018\u00010\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\r\u001a\u0004\b\u0019\u0010\u0016R\u001d\u0010\u001b\u001a\u0004\u0018\u00010\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\r\u001a\u0004\b\u001c\u0010\u0016R\u001d\u0010\u001e\u001a\u0004\u0018\u00010\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\r\u001a\u0004\b\u001f\u0010\u0016R\u001d\u0010!\u001a\u0004\u0018\u00010\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\r\u001a\u0004\b#\u0010$R\u001d\u0010&\u001a\u0004\u0018\u00010'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\r\u001a\u0004\b(\u0010)R\u001d\u0010+\u001a\u0004\u0018\u00010'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\r\u001a\u0004\b,\u0010)R\u001b\u0010.\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010\r\u001a\u0004\b0\u00101R\u001d\u00103\u001a\u0004\u0018\u0001048VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b7\u0010\r\u001a\u0004\b5\u00106R\u001b\u00108\u001a\u0002098VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b<\u0010\r\u001a\u0004\b:\u0010;R\u001d\u0010=\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010\r\u001a\u0004\b>\u0010?R7\u0010A\u001a\u001e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020D0Bj\u000e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020D`E8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bF\u0010GR\u001c\u0010J\u001a\u0010\u0012\f\u0012\n M*\u0004\u0018\u00010L0L0KX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010N\u001a\u00020'8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bP\u0010\r\u001a\u0004\bN\u0010OR\u001b\u0010Q\u001a\u00020'8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bS\u0010\r\u001a\u0004\bR\u0010OR\u001b\u0010T\u001a\u00020'8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bV\u0010\r\u001a\u0004\bU\u0010OR\u001b\u0010W\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bY\u0010\r\u001a\u0004\bX\u0010OR\u001b\u0010Z\u001a\u00020'8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\\\u0010\r\u001a\u0004\b[\u0010OR\u001d\u0010]\u001a\u0004\u0018\u00010^8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\ba\u0010\r\u001a\u0004\b_\u0010`¨\u0006s"}, m3636d2 = {"Lcom/robinhood/android/investorprofile/ui/questionnaire/QuestionnaireParentFragment;", "Lcom/robinhood/android/investorprofile/ui/questionnaire/BaseQuestionnaireParentFragment;", "Lcom/robinhood/android/investorprofile/ui/questionnaire/QuestionFragmentCallbacks;", "Lcom/robinhood/android/investorprofile/ui/questionnaire/ContextualQuestionInfo$Index;", "Landroidx/fragment/app/FragmentManager$OnBackStackChangedListener;", "<init>", "()V", QuestionnaireParentFragment.ARG_QUESTIONNAIRE_QUESTIONS, "", "Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$Supported;", "getQuestionnaireQuestions", "()Ljava/util/List;", "questionnaireQuestions$delegate", "Lkotlin/Lazy;", QuestionnaireParentFragment.ARG_SELECTED_QUESTION, "Lcom/robinhood/shared/questionnaire/contracts/QuestionnaireQuestion;", "getSelectedQuestion", "()Lcom/robinhood/shared/questionnaire/contracts/QuestionnaireQuestion;", "selectedQuestion$delegate", QuestionnaireParentFragment.ARG_QUESTIONNAIRE_CONTEXT, "", "getQuestionnaireContext", "()Ljava/lang/String;", "questionnaireContext$delegate", "accountNumber", "getAccountNumber", "accountNumber$delegate", QuestionnaireParentFragment.ARG_APPLICATION_ID, "getApplicationId", "applicationId$delegate", QuestionnaireParentFragment.ARG_REFERENCE_KEY, "getReferenceKey", "referenceKey$delegate", QuestionnaireParentFragment.ARG_REVIEW_QUERY_PARAMS, "Lcom/robinhood/android/questionnaire/api/ReviewQueryParams;", "getReviewQueryParams", "()Lcom/robinhood/android/questionnaire/api/ReviewQueryParams;", "reviewQueryParams$delegate", QuestionnaireParentFragment.ARG_SHOW_EXISTING_ANSWER, "", "getShowExistingAnswer", "()Ljava/lang/Boolean;", "showExistingAnswer$delegate", QuestionnaireParentFragment.ARG_USE_INFO_GATHER_FLOW, "getUseInfoGatherFlow", "useInfoGatherFlow$delegate", QuestionnaireParentFragment.ARG_ACCOUNT_DISPLAY_NAME, "Lcom/robinhood/utils/resource/StringResource;", "getAccountDisplayName", "()Lcom/robinhood/utils/resource/StringResource;", "accountDisplayName$delegate", QuestionnaireParentFragment.ARG_BROKERAGE_ACCOUNT_TYPE, "Lcom/robinhood/models/api/BrokerageAccountType;", "getBrokerageAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "brokerageAccountType$delegate", QuestionnaireParentFragment.ARG_LOGGING_INFO, "Lcom/robinhood/android/investorprofile/ui/questionnaire/QuestionnaireLoggingInfo;", "getLoggingInfo", "()Lcom/robinhood/android/investorprofile/ui/questionnaire/QuestionnaireLoggingInfo;", "loggingInfo$delegate", "selectedQuestionnaireQuestion", "getSelectedQuestionnaireQuestion", "()Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$Supported;", "selectedQuestionnaireQuestion$delegate", "answerData", "Ljava/util/HashMap;", "Ljava/util/UUID;", "Lcom/robinhood/android/questionnaire/ui/QuestionnaireAnswer;", "Lkotlin/collections/HashMap;", "getAnswerData", "()Ljava/util/HashMap;", "answerData$delegate", "Lkotlin/properties/ReadWriteProperty;", "investorProfileSettingsLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", QuestionnaireParentFragment.ARG_IS_BLOCKING, "()Z", "isBlocking$delegate", "skipSplashScreen", "getSkipSplashScreen", "skipSplashScreen$delegate", QuestionnaireParentFragment.ARG_SKIP_COMPLETED_SCREEN, "getSkipCompletedScreen", "skipCompletedScreen$delegate", QuestionnaireParentFragment.ARG_SKIP_SUBMIT_DATA, "getSkipSubmitData", "skipSubmitData$delegate", QuestionnaireParentFragment.ARG_SHOW_PROGRESS_BAR, "getShowProgressBar", "showProgressBar$delegate", QuestionnaireParentFragment.ARG_PROGRESS_BAR_DATA, "Lcom/robinhood/shared/questionnaire/contracts/QuestionnaireProgressBarData;", "getProgressBarData", "()Lcom/robinhood/shared/questionnaire/contracts/QuestionnaireProgressBarData;", "progressBarData$delegate", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onBackStackChanged", "updateProgressBar", "questionId", "createInitialQuestionFragment", "Landroidx/fragment/app/Fragment;", "showCompletedFragment", "onQuestionAnswered", "contextualInfo", "answer", "doAfterSubmit", "Lio/reactivex/Single;", "Companion", "feature-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class QuestionnaireParentFragment extends BaseQuestionnaireParentFragment implements QuestionFragmentCallbacks<ContextualQuestionInfo.Index>, FragmentManager.OnBackStackChangedListener {
    private static final String ARG_ACCOUNT_DISPLAY_NAME = "accountDisplayName";
    private static final String ARG_ACCOUNT_NUMBER = "accountNumber";
    private static final String ARG_APPLICATION_ID = "applicationId";
    private static final String ARG_BROKERAGE_ACCOUNT_TYPE = "brokerageAccountType";
    private static final String ARG_IS_BLOCKING = "isBlocking";
    private static final String ARG_LOGGING_INFO = "loggingInfo";
    private static final String ARG_PROGRESS_BAR_DATA = "progressBarData";
    private static final String ARG_QUESTIONNAIRE_CONTEXT = "questionnaireContext";
    private static final String ARG_QUESTIONNAIRE_QUESTIONS = "questionnaireQuestions";
    private static final String ARG_REFERENCE_KEY = "referenceKey";
    private static final String ARG_REVIEW_QUERY_PARAMS = "reviewQueryParams";
    private static final String ARG_SELECTED_QUESTION = "selectedQuestion";
    private static final String ARG_SHOW_EXISTING_ANSWER = "showExistingAnswer";
    private static final String ARG_SHOW_PROGRESS_BAR = "showProgressBar";
    private static final String ARG_SKIP_COMPLETED_SCREEN = "skipCompletedScreen";
    private static final String ARG_SKIP_SPLASH_SCREENS = "skipSplashScreens";
    private static final String ARG_SKIP_SUBMIT_DATA = "skipSubmitData";
    private static final String ARG_USE_INFO_GATHER_FLOW = "useInfoGatherFlow";
    private final ActivityResultLauncher<Intent> investorProfileSettingsLauncher;

    /* renamed from: isBlocking$delegate, reason: from kotlin metadata */
    private final Lazy isBlocking;

    /* renamed from: progressBarData$delegate, reason: from kotlin metadata */
    private final Lazy progressBarData;

    /* renamed from: showProgressBar$delegate, reason: from kotlin metadata */
    private final Lazy showProgressBar;

    /* renamed from: skipCompletedScreen$delegate, reason: from kotlin metadata */
    private final Lazy skipCompletedScreen;

    /* renamed from: skipSplashScreen$delegate, reason: from kotlin metadata */
    private final Lazy skipSplashScreen;

    /* renamed from: skipSubmitData$delegate, reason: from kotlin metadata */
    private final Lazy skipSubmitData;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(QuestionnaireParentFragment.class, "answerData", "getAnswerData()Ljava/util/HashMap;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: questionnaireQuestions$delegate, reason: from kotlin metadata */
    private final Lazy questionnaireQuestions = Fragments2.argument(this, ARG_QUESTIONNAIRE_QUESTIONS);

    /* renamed from: selectedQuestion$delegate, reason: from kotlin metadata */
    private final Lazy selectedQuestion = Fragments2.argument(this, ARG_SELECTED_QUESTION);

    /* renamed from: questionnaireContext$delegate, reason: from kotlin metadata */
    private final Lazy questionnaireContext = Fragments2.argument(this, ARG_QUESTIONNAIRE_CONTEXT);

    /* renamed from: accountNumber$delegate, reason: from kotlin metadata */
    private final Lazy accountNumber = Fragments2.argument(this, "accountNumber");

    /* renamed from: applicationId$delegate, reason: from kotlin metadata */
    private final Lazy applicationId = Fragments2.argument(this, ARG_APPLICATION_ID);

    /* renamed from: referenceKey$delegate, reason: from kotlin metadata */
    private final Lazy referenceKey = Fragments2.argument(this, ARG_REFERENCE_KEY);

    /* renamed from: reviewQueryParams$delegate, reason: from kotlin metadata */
    private final Lazy reviewQueryParams = Fragments2.argument(this, ARG_REVIEW_QUERY_PARAMS);

    /* renamed from: showExistingAnswer$delegate, reason: from kotlin metadata */
    private final Lazy showExistingAnswer = Fragments2.argument(this, ARG_SHOW_EXISTING_ANSWER);

    /* renamed from: useInfoGatherFlow$delegate, reason: from kotlin metadata */
    private final Lazy useInfoGatherFlow = Fragments2.argument(this, ARG_USE_INFO_GATHER_FLOW);

    /* renamed from: accountDisplayName$delegate, reason: from kotlin metadata */
    private final Lazy accountDisplayName = Fragments2.argument(this, ARG_ACCOUNT_DISPLAY_NAME);

    /* renamed from: brokerageAccountType$delegate, reason: from kotlin metadata */
    private final Lazy brokerageAccountType = Fragments2.argument(this, ARG_BROKERAGE_ACCOUNT_TYPE);

    /* renamed from: loggingInfo$delegate, reason: from kotlin metadata */
    private final Lazy loggingInfo = Fragments2.argument(this, ARG_LOGGING_INFO);

    /* renamed from: selectedQuestionnaireQuestion$delegate, reason: from kotlin metadata */
    private final Lazy selectedQuestionnaireQuestion = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new Function0() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.QuestionnaireParentFragment$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return QuestionnaireParentFragment.selectedQuestionnaireQuestion_delegate$lambda$1(this.f$0);
        }
    });

    /* renamed from: answerData$delegate, reason: from kotlin metadata */
    private final Interfaces3 answerData = (Interfaces3) BindSavedState2.savedSerializable(this, new HashMap()).provideDelegate(this, $$delegatedProperties[0]);

    @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
    public /* bridge */ /* synthetic */ void onBackStackChangeCancelled() {
        super.onBackStackChangeCancelled();
    }

    @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
    public /* bridge */ /* synthetic */ void onBackStackChangeCommitted(Fragment fragment, boolean z) {
        super.onBackStackChangeCommitted(fragment, z);
    }

    @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
    public /* bridge */ /* synthetic */ void onBackStackChangeProgressed(BackEventCompat backEventCompat) {
        super.onBackStackChangeProgressed(backEventCompat);
    }

    @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
    public /* bridge */ /* synthetic */ void onBackStackChangeStarted(Fragment fragment, boolean z) {
        super.onBackStackChangeStarted(fragment, z);
    }

    public QuestionnaireParentFragment() {
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new ActivityResultCallback() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.QuestionnaireParentFragment$investorProfileSettingsLauncher$1
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(ActivityResult it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (it.getResultCode() == -1) {
                    QuestionnaireParentFragment questionnaireParentFragment = this.this$0;
                    questionnaireParentFragment.replaceFragment(QuestionnaireCompletedFragment.INSTANCE.newInstance((Parcelable) questionnaireParentFragment.getLoggingInfo()));
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.investorProfileSettingsLauncher = activityResultLauncherRegisterForActivityResult;
        this.isBlocking = Fragments2.argument(this, ARG_IS_BLOCKING);
        this.skipSplashScreen = Fragments2.argument(this, ARG_SKIP_SPLASH_SCREENS);
        Boolean bool = Boolean.FALSE;
        this.skipCompletedScreen = Fragments2.argument(this, ARG_SKIP_COMPLETED_SCREEN, bool);
        this.skipSubmitData = Fragments2.argument(this, ARG_SKIP_SUBMIT_DATA, bool);
        this.showProgressBar = Fragments2.argument(this, ARG_SHOW_PROGRESS_BAR);
        this.progressBarData = Fragments2.argument(this, ARG_PROGRESS_BAR_DATA);
    }

    private final List<UiQuestionnaireQuestion.Supported> getQuestionnaireQuestions() {
        return (List) this.questionnaireQuestions.getValue();
    }

    private final QuestionnaireQuestion getSelectedQuestion() {
        return (QuestionnaireQuestion) this.selectedQuestion.getValue();
    }

    private final String getQuestionnaireContext() {
        return (String) this.questionnaireContext.getValue();
    }

    private final String getAccountNumber() {
        return (String) this.accountNumber.getValue();
    }

    private final String getApplicationId() {
        return (String) this.applicationId.getValue();
    }

    private final String getReferenceKey() {
        return (String) this.referenceKey.getValue();
    }

    private final ReviewQueryParams getReviewQueryParams() {
        return (ReviewQueryParams) this.reviewQueryParams.getValue();
    }

    private final Boolean getShowExistingAnswer() {
        return (Boolean) this.showExistingAnswer.getValue();
    }

    private final Boolean getUseInfoGatherFlow() {
        return (Boolean) this.useInfoGatherFlow.getValue();
    }

    private final StringResource getAccountDisplayName() {
        return (StringResource) this.accountDisplayName.getValue();
    }

    @Override // com.robinhood.android.investorprofile.p162ui.questionnaire.BaseQuestionnaireParentFragment
    public BrokerageAccountType getBrokerageAccountType() {
        return (BrokerageAccountType) this.brokerageAccountType.getValue();
    }

    @Override // com.robinhood.android.investorprofile.p162ui.questionnaire.BaseQuestionnaireParentFragment
    public QuestionnaireLoggingInfo getLoggingInfo() {
        return (QuestionnaireLoggingInfo) this.loggingInfo.getValue();
    }

    private final UiQuestionnaireQuestion.Supported getSelectedQuestionnaireQuestion() {
        return (UiQuestionnaireQuestion.Supported) this.selectedQuestionnaireQuestion.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UiQuestionnaireQuestion.Supported selectedQuestionnaireQuestion_delegate$lambda$1(QuestionnaireParentFragment questionnaireParentFragment) {
        Object obj;
        Iterator<T> it = questionnaireParentFragment.getQuestionnaireQuestions().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            String key = ((UiQuestionnaireQuestion.Supported) next).getKey();
            QuestionnaireQuestion selectedQuestion = questionnaireParentFragment.getSelectedQuestion();
            if (Intrinsics.areEqual(key, selectedQuestion != null ? selectedQuestion.getQuestionKey() : null)) {
                obj = next;
                break;
            }
        }
        return (UiQuestionnaireQuestion.Supported) obj;
    }

    private final HashMap<UUID, QuestionnaireAnswer> getAnswerData() {
        return (HashMap) this.answerData.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.investorprofile.p162ui.questionnaire.BaseQuestionnaireParentFragment
    public boolean isBlocking() {
        return ((Boolean) this.isBlocking.getValue()).booleanValue();
    }

    @Override // com.robinhood.android.investorprofile.p162ui.questionnaire.BaseQuestionnaireParentFragment
    public boolean getSkipSplashScreen() {
        return ((Boolean) this.skipSplashScreen.getValue()).booleanValue();
    }

    @Override // com.robinhood.android.investorprofile.p162ui.questionnaire.BaseQuestionnaireParentFragment
    public boolean getSkipCompletedScreen() {
        return ((Boolean) this.skipCompletedScreen.getValue()).booleanValue();
    }

    private final boolean getSkipSubmitData() {
        return ((Boolean) this.skipSubmitData.getValue()).booleanValue();
    }

    @Override // com.robinhood.android.investorprofile.p162ui.questionnaire.BaseQuestionnaireParentFragment
    public boolean getShowProgressBar() {
        return ((Boolean) this.showProgressBar.getValue()).booleanValue();
    }

    @Override // com.robinhood.android.investorprofile.p162ui.questionnaire.BaseQuestionnaireParentFragment
    public QuestionnaireProgressBarData getProgressBarData() {
        return (QuestionnaireProgressBarData) this.progressBarData.getValue();
    }

    @Override // com.robinhood.android.investorprofile.p162ui.questionnaire.BaseQuestionnaireParentFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getChildFragmentManager().addOnBackStackChangedListener(this);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        getChildFragmentManager().removeOnBackStackChangedListener(this);
    }

    @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
    public void onBackStackChanged() {
        UiQuestionnaireQuestion.Supported question;
        UUID id;
        ActivityResultCaller currentFragment = getCurrentFragment();
        QuestionableFragment questionableFragment = currentFragment instanceof QuestionableFragment ? (QuestionableFragment) currentFragment : null;
        if (questionableFragment == null || (question = questionableFragment.getQuestion()) == null || (id = question.getId()) == null) {
            return;
        }
        updateProgressBar(id);
    }

    private final void updateProgressBar(UUID questionId) {
        Iterator<UiQuestionnaireQuestion.Supported> it = getQuestionnaireQuestions().iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (Intrinsics.areEqual(it.next().getId(), questionId)) {
                break;
            } else {
                i++;
            }
        }
        updateProgressBar((i + 1) / getQuestionnaireQuestions().size());
    }

    @Override // com.robinhood.android.investorprofile.p162ui.questionnaire.BaseQuestionnaireParentFragment
    public Fragment createInitialQuestionFragment() {
        updateProgressBar(1.0f / getQuestionnaireQuestions().size());
        UiQuestionnaireQuestion.Supported selectedQuestionnaireQuestion = getSelectedQuestionnaireQuestion();
        int iIndexOf = selectedQuestionnaireQuestion != null ? getQuestionnaireQuestions().indexOf(selectedQuestionnaireQuestion) : 0;
        UiQuestionnaireQuestion.Supported selectedQuestionnaireQuestion2 = getSelectedQuestionnaireQuestion();
        if (selectedQuestionnaireQuestion2 == null) {
            selectedQuestionnaireQuestion2 = getQuestionnaireQuestions().get(0);
        }
        UiQuestionnaireQuestion.Supported supported = selectedQuestionnaireQuestion2;
        ContextualQuestionInfo.Index index = new ContextualQuestionInfo.Index(iIndexOf);
        String accountNumber = getAccountNumber();
        String questionnaireContext = getQuestionnaireContext();
        QuestionnaireLoggingInfo loggingInfo = getLoggingInfo();
        QuestionnaireQuestion selectedQuestion = getSelectedQuestion();
        Boolean showExistingAnswer = getShowExistingAnswer();
        boolean zBooleanValue = showExistingAnswer != null ? showExistingAnswer.booleanValue() : false;
        Boolean useInfoGatherFlow = getUseInfoGatherFlow();
        return UtilKt.createFragmentForQuestion(accountNumber, getAccountDisplayName(), questionnaireContext, index, supported, loggingInfo, selectedQuestion, zBooleanValue, useInfoGatherFlow != null ? useInfoGatherFlow.booleanValue() : false);
    }

    @Override // com.robinhood.android.investorprofile.p162ui.questionnaire.BaseQuestionnaireParentFragment
    public void showCompletedFragment() {
        if (Intrinsics.areEqual(getQuestionnaireContext(), QuestionnaireContexts.AML_REFRESH)) {
            ActivityResultLauncher<Intent> activityResultLauncher = this.investorProfileSettingsLauncher;
            Navigator navigator = getNavigator();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            activityResultLauncher.launch(Navigator.DefaultImpls.createIntentForFragment$default(navigator, contextRequireContext, new InvestmentProfileSettings(getQuestionnaireContext(), null, null, false, false, false, null, false, false, false, false, null, null, 8182, null), false, false, false, null, false, true, false, false, false, null, false, 7804, null));
            return;
        }
        replaceFragment(QuestionnaireCompletedFragment.INSTANCE.newInstance((Parcelable) getLoggingInfo()));
    }

    @Override // com.robinhood.android.investorprofile.p162ui.questionnaire.QuestionFragmentCallbacks
    public void onQuestionAnswered(ContextualQuestionInfo.Index contextualInfo, QuestionnaireAnswer answer) {
        Intrinsics.checkNotNullParameter(contextualInfo, "contextualInfo");
        Intrinsics.checkNotNullParameter(answer, "answer");
        getAnswerData().put(answer.getQuestion().getId(), answer);
        boolean z = getSelectedQuestionnaireQuestion() != null;
        int value = contextualInfo.getValue() + 1;
        boolean z2 = getQuestionnaireQuestions().size() == value;
        if (z || z2) {
            if (!getSkipSubmitData() || answer.getShouldSubmitEarly()) {
                String questionnaireContext = getQuestionnaireContext();
                String accountNumber = getAccountNumber();
                String applicationId = getApplicationId();
                String referenceKey = getReferenceKey();
                Collection<QuestionnaireAnswer> collectionValues = getAnswerData().values();
                Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
                submitData(questionnaireContext, accountNumber, applicationId, referenceKey, CollectionsKt.toList(collectionValues));
                return;
            }
            Collection<QuestionnaireAnswer> collectionValues2 = getAnswerData().values();
            Intrinsics.checkNotNullExpressionValue(collectionValues2, "<get-values>(...)");
            onCompleteFlow(null, CollectionsKt.toList(collectionValues2));
            return;
        }
        replaceFragment(UtilKt.createFragmentForQuestion$default(getAccountNumber(), getAccountDisplayName(), getQuestionnaireContext(), new ContextualQuestionInfo.Index(value), getQuestionnaireQuestions().get(value), getLoggingInfo(), getSelectedQuestion(), false, false, 384, null));
    }

    @Override // com.robinhood.android.investorprofile.p162ui.questionnaire.BaseQuestionnaireParentFragment
    public Single<Unit> doAfterSubmit() {
        ReviewQueryParams reviewQueryParams = getReviewQueryParams();
        if (reviewQueryParams != null) {
            return getQuestionnaireStore().fetchQuestionnaireReview(reviewQueryParams);
        }
        Single<Unit> singleJust = Single.just(Unit.INSTANCE);
        Intrinsics.checkNotNull(singleJust);
        return singleJust;
    }

    /* compiled from: QuestionnaireParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J°\u0001\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001a2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010\u00052\b\u0010$\u001a\u0004\u0018\u00010\u00052\b\u0010%\u001a\u0004\u0018\u00010\u00052\b\u0010&\u001a\u0004\u0018\u00010\u00052\u0006\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020\u001a2\b\u0010-\u001a\u0004\u0018\u00010.2\b\u0010/\u001a\u0004\u0018\u0001002\u0006\u00101\u001a\u00020\u001a2\n\b\u0002\u00102\u001a\u0004\u0018\u000103R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u00064"}, m3636d2 = {"Lcom/robinhood/android/investorprofile/ui/questionnaire/QuestionnaireParentFragment$Companion;", "", "<init>", "()V", "ARG_IS_BLOCKING", "", "ARG_SKIP_SPLASH_SCREENS", "ARG_SKIP_COMPLETED_SCREEN", "ARG_SKIP_SUBMIT_DATA", "ARG_QUESTIONNAIRE_QUESTIONS", "ARG_SELECTED_QUESTION", "ARG_QUESTIONNAIRE_CONTEXT", "ARG_ACCOUNT_NUMBER", "ARG_APPLICATION_ID", "ARG_REFERENCE_KEY", "ARG_LOGGING_INFO", "ARG_REVIEW_QUERY_PARAMS", "ARG_SHOW_PROGRESS_BAR", "ARG_SHOW_EXISTING_ANSWER", "ARG_PROGRESS_BAR_DATA", "ARG_BROKERAGE_ACCOUNT_TYPE", "ARG_USE_INFO_GATHER_FLOW", "ARG_ACCOUNT_DISPLAY_NAME", "newInstance", "Lcom/robinhood/android/investorprofile/ui/questionnaire/QuestionnaireParentFragment;", QuestionnaireParentFragment.ARG_IS_BLOCKING, "", QuestionnaireParentFragment.ARG_SKIP_SPLASH_SCREENS, QuestionnaireParentFragment.ARG_SKIP_COMPLETED_SCREEN, QuestionnaireParentFragment.ARG_SKIP_SUBMIT_DATA, QuestionnaireParentFragment.ARG_QUESTIONNAIRE_QUESTIONS, "", "Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$Supported;", QuestionnaireParentFragment.ARG_SELECTED_QUESTION, "Lcom/robinhood/shared/questionnaire/contracts/QuestionnaireQuestion;", QuestionnaireParentFragment.ARG_QUESTIONNAIRE_CONTEXT, "accountNumber", QuestionnaireParentFragment.ARG_APPLICATION_ID, QuestionnaireParentFragment.ARG_REFERENCE_KEY, QuestionnaireParentFragment.ARG_LOGGING_INFO, "Lcom/robinhood/android/investorprofile/ui/questionnaire/QuestionnaireLoggingInfo;", QuestionnaireParentFragment.ARG_REVIEW_QUERY_PARAMS, "Lcom/robinhood/android/questionnaire/api/ReviewQueryParams;", QuestionnaireParentFragment.ARG_SHOW_PROGRESS_BAR, QuestionnaireParentFragment.ARG_SHOW_EXISTING_ANSWER, QuestionnaireParentFragment.ARG_PROGRESS_BAR_DATA, "Lcom/robinhood/shared/questionnaire/contracts/QuestionnaireProgressBarData;", QuestionnaireParentFragment.ARG_BROKERAGE_ACCOUNT_TYPE, "Lcom/robinhood/models/api/BrokerageAccountType;", QuestionnaireParentFragment.ARG_USE_INFO_GATHER_FLOW, QuestionnaireParentFragment.ARG_ACCOUNT_DISPLAY_NAME, "Lcom/robinhood/utils/resource/StringResource;", "feature-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final QuestionnaireParentFragment newInstance(boolean isBlocking, boolean skipSplashScreens, boolean skipCompletedScreen, boolean skipSubmitData, List<? extends UiQuestionnaireQuestion.Supported> questionnaireQuestions, QuestionnaireQuestion selectedQuestion, String questionnaireContext, String accountNumber, String applicationId, String referenceKey, QuestionnaireLoggingInfo loggingInfo, ReviewQueryParams reviewQueryParams, boolean showProgressBar, boolean showExistingAnswer, QuestionnaireProgressBarData progressBarData, BrokerageAccountType brokerageAccountType, boolean useInfoGatherFlow, StringResource accountDisplayName) {
            Intrinsics.checkNotNullParameter(questionnaireQuestions, "questionnaireQuestions");
            Intrinsics.checkNotNullParameter(loggingInfo, "loggingInfo");
            QuestionnaireParentFragment questionnaireParentFragment = new QuestionnaireParentFragment();
            Bundle bundle = new Bundle();
            bundle.putBoolean(QuestionnaireParentFragment.ARG_IS_BLOCKING, isBlocking);
            bundle.putBoolean(QuestionnaireParentFragment.ARG_SKIP_SPLASH_SCREENS, skipSplashScreens);
            bundle.putBoolean(QuestionnaireParentFragment.ARG_SKIP_COMPLETED_SCREEN, skipCompletedScreen);
            bundle.putBoolean(QuestionnaireParentFragment.ARG_SKIP_SUBMIT_DATA, skipSubmitData);
            Bundles.putParcelableList(bundle, QuestionnaireParentFragment.ARG_QUESTIONNAIRE_QUESTIONS, questionnaireQuestions);
            bundle.putParcelable(QuestionnaireParentFragment.ARG_SELECTED_QUESTION, selectedQuestion);
            bundle.putSerializable(QuestionnaireParentFragment.ARG_QUESTIONNAIRE_CONTEXT, questionnaireContext);
            bundle.putSerializable("accountNumber", accountNumber);
            bundle.putSerializable(QuestionnaireParentFragment.ARG_APPLICATION_ID, applicationId);
            bundle.putSerializable(QuestionnaireParentFragment.ARG_REFERENCE_KEY, referenceKey);
            bundle.putParcelable(QuestionnaireParentFragment.ARG_LOGGING_INFO, loggingInfo);
            bundle.putParcelable(QuestionnaireParentFragment.ARG_REVIEW_QUERY_PARAMS, reviewQueryParams);
            bundle.putBoolean(QuestionnaireParentFragment.ARG_SHOW_PROGRESS_BAR, showProgressBar);
            bundle.putBoolean(QuestionnaireParentFragment.ARG_SHOW_EXISTING_ANSWER, showExistingAnswer);
            bundle.putParcelable(QuestionnaireParentFragment.ARG_PROGRESS_BAR_DATA, progressBarData);
            bundle.putSerializable(QuestionnaireParentFragment.ARG_BROKERAGE_ACCOUNT_TYPE, brokerageAccountType);
            bundle.putBoolean(QuestionnaireParentFragment.ARG_USE_INFO_GATHER_FLOW, useInfoGatherFlow);
            bundle.putParcelable(QuestionnaireParentFragment.ARG_ACCOUNT_DISPLAY_NAME, accountDisplayName);
            questionnaireParentFragment.setArguments(bundle);
            return questionnaireParentFragment;
        }
    }
}
