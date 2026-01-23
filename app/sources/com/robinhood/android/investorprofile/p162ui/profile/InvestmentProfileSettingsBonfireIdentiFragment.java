package com.robinhood.android.investorprofile.p162ui.profile;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.employment.lib.ChooseEmploymentResultContract;
import com.robinhood.android.investorprofile.C19641R;
import com.robinhood.android.investorprofile.p162ui.profile.InvestmentProfileSettingsBonfireIdentiFragment;
import com.robinhood.android.investorprofile.p162ui.profile.InvestmentProfileSettingsBonfireIdentiViewState;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract;
import com.robinhood.android.navigation.keys.DeepLinkIntentKey;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.questionnaire.p220ui.QuestionnaireAnswer;
import com.robinhood.android.questionnaire.p220ui.UiQuestionContent;
import com.robinhood.android.questionnaire.p220ui.UiQuestionnaireQuestion;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.bonfire.investmentprofilesettings.QuestionType;
import com.robinhood.models.p355ui.identi.UiEmploymentInfo;
import com.robinhood.models.p355ui.investmentprofilesettings.UiInvestmentProfileAnswers2;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherBottomSheetFragmentKey;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherData;
import com.robinhood.shared.account.contracts.switcher.LocalAccountSwitcherCallbacks;
import com.robinhood.shared.onboarding.contracts.ChooseEmploymentIntentKey;
import com.robinhood.shared.questionnaire.contracts.Questionnaire;
import com.robinhood.shared.questionnaire.contracts.QuestionnaireContract;
import com.robinhood.shared.questionnaire.contracts.QuestionnaireContract2;
import com.robinhood.shared.questionnaire.contracts.QuestionnaireQuestion;
import com.robinhood.shared.questionnaire.libquestionnaire.ReviewInvestorProfileCallbacks;
import com.robinhood.shared.settings.contracts.SettingsFragmentKey;
import com.robinhood.shared.settings.contracts.SettingsFragmentKey3;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.ExceptionsH;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: InvestmentProfileSettingsBonfireIdentiFragment.kt */
@Metadata(m3635d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 O2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002NOB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0002Jd\u0010'\u001a\u00020$2\u0006\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010)2\b\u0010+\u001a\u0004\u0018\u00010)2\b\u0010,\u001a\u0004\u0018\u00010)2\b\u0010-\u001a\u0004\u0018\u00010)2\b\u0010.\u001a\u0004\u0018\u00010)2\u0016\b\u0002\u0010/\u001a\u0010\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u000201\u0018\u0001002\b\b\u0002\u00102\u001a\u000203H\u0002J$\u00104\u001a\u00020$2\b\u0010,\u001a\u0004\u0018\u00010)2\b\u0010-\u001a\u0004\u0018\u00010)2\u0006\u00105\u001a\u00020)H\u0002J\u0010\u00106\u001a\u00020$2\u0006\u00107\u001a\u000208H\u0016J\u0010\u00109\u001a\u00020$2\u0006\u0010+\u001a\u00020:H\u0016J\u001a\u0010;\u001a\u00020$2\u0006\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010?H\u0016J\u0010\u0010@\u001a\u00020$2\u0006\u0010A\u001a\u00020BH\u0002J\b\u0010C\u001a\u00020$H\u0002J\b\u0010D\u001a\u00020$H\u0002J\b\u0010E\u001a\u00020$H\u0002J\u0010\u0010F\u001a\u00020$2\u0006\u0010G\u001a\u00020HH\u0002J\u0018\u0010I\u001a\u00020$2\u0006\u0010,\u001a\u00020)2\u0006\u0010J\u001a\u00020KH\u0016J\r\u0010L\u001a\u00020$H\u0017¢\u0006\u0002\u0010MR\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0010\u0012\f\u0012\n \u0019*\u0004\u0018\u00010\u00180\u00180\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\u001a\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u001c \u0019*\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b0\u001b0\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010\u001f\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u001c \u0019*\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b0\u001b0\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010!\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u001c \u0019*\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b0\u001b0\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\"\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u001c \u0019*\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b0\u001b0\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006P²\u0006\n\u0010A\u001a\u00020BX\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/investorprofile/ui/profile/InvestmentProfileSettingsBonfireIdentiFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/shared/account/contracts/switcher/LocalAccountSwitcherCallbacks;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "duxo", "Lcom/robinhood/android/investorprofile/ui/profile/InvestmentProfileSettingsBonfireIdentiDuxo;", "getDuxo", "()Lcom/robinhood/android/investorprofile/ui/profile/InvestmentProfileSettingsBonfireIdentiDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "chooseEmploymentLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "riskToleranceLauncher", "Lcom/robinhood/android/navigation/contracts/NavigationActivityResultContract$NavigationParams;", "Lcom/robinhood/shared/questionnaire/contracts/Questionnaire;", "annualIncomeQuestionnaireResult", "Lcom/robinhood/shared/questionnaire/contracts/QuestionnaireResult$Completed;", "annualIncomeLauncher", "annualIncomeReasonQuestionnaireResult", "annualIncomeReasonLauncher", "annualIncomeFreeFormLauncher", "handleQuestionItemSelected", "", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Lcom/robinhood/android/investorprofile/ui/profile/InvestmentProfileSettingsBonfireIdentiViewState$InvestmentProfileItem$QuestionSummaryItem;", "onInvestmentProfileItemSelected", "questionKey", "", "questionId", "context", "accountNumber", "applicationId", "existingAnswer", "questionGraph", "", "Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$Supported;", "showInfoGatherFlow", "", "launchInvestorProfileQuestionnaire", "questionnaireContext", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onAttach", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setState", "state", "Lcom/robinhood/android/investorprofile/ui/profile/InvestmentProfileSettingsBonfireIdentiViewState;", "onConfirmInvestmentProfile", "onEditInvestmentProfile", "onInvestmentProfileReviewed", "onAccountSelectionDropdownClicked", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData;", "onAccountSelected", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "Args", "Companion", "feature-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class InvestmentProfileSettingsBonfireIdentiFragment extends GenericComposeFragment implements LocalAccountSwitcherCallbacks, AutoLoggableFragment {
    public static final String ANNUAL_INCOME_KEY = "annual_income";
    public static final String ANNUAL_INCOME_LESS_THAN_TWENTY_FIVE_THOUSAND = "annual_income_less_than_25000";
    public static final String CHOICE_KEY_INCOME_CHANGE_REASON_OTHER = "income_change_reason_other";
    public static final String IP_CONTEXT_INCOME_CHANGE = "income_change_reason_context";
    public static final String QUESTION_KEY_INCOME_CHANGE_REASON = "income_change_reason";
    public static final String QUESTION_KEY_INCOME_CHANGE_REASON_OTHER = "income_change_reason_other_question";
    public static final String RISK_TOLERANCE_KEY = "risk_tolerance";
    private final ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<Questionnaire>> annualIncomeFreeFormLauncher;
    private final ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<Questionnaire>> annualIncomeLauncher;
    private QuestionnaireContract2.Completed annualIncomeQuestionnaireResult;
    private final ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<Questionnaire>> annualIncomeReasonLauncher;
    private QuestionnaireContract2.Completed annualIncomeReasonQuestionnaireResult;
    private final ActivityResultLauncher<Intent> chooseEmploymentLauncher;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, InvestmentProfileSettingsBonfireIdentiDuxo.class);
    public EventLogger eventLogger;
    private final ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<Questionnaire>> riskToleranceLauncher;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: InvestmentProfileSettingsBonfireIdentiFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[QuestionType.values().length];
            try {
                iArr[QuestionType.MULTIPLE_CHOICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[QuestionType.STRING_QUESTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[QuestionType.INTEGER_QUESTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[QuestionType.OPTIONAL_INTEGER_QUESTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[QuestionType.EMPLOYMENT_QUESTION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[QuestionType.OPTIONS_EXPERIENCE_QUESTION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[QuestionType.PROFESSIONAL_TRADER_QUESTION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$8(InvestmentProfileSettingsBonfireIdentiFragment investmentProfileSettingsBonfireIdentiFragment, int i, Composer composer, int i2) {
        investmentProfileSettingsBonfireIdentiFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenAppearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenAppearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenDisappearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenDisappearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenSourceEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenSourceEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Component getScreenEventComponent() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventComponent(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    @Override // com.robinhood.shared.account.contracts.switcher.AccountSwitcherCallbacks
    public void onAllAccountsSelected() {
        LocalAccountSwitcherCallbacks.DefaultImpls.onAllAccountsSelected(this);
    }

    @Override // com.robinhood.shared.account.contracts.switcher.AccountSwitcherCallbacks
    public void onPendingApplicationClicked(String str, BrokerageAccountType brokerageAccountType) {
        LocalAccountSwitcherCallbacks.DefaultImpls.onPendingApplicationClicked(this, str, brokerageAccountType);
    }

    @Override // com.robinhood.shared.account.contracts.switcher.LocalAccountSwitcherCallbacks, com.robinhood.shared.account.contracts.switcher.AccountSwitcherCallbacks
    public void onRefreshAccountsClicked() {
        LocalAccountSwitcherCallbacks.DefaultImpls.onRefreshAccountsClicked(this);
    }

    public InvestmentProfileSettingsBonfireIdentiFragment() {
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ChooseEmploymentResultContract(), new ActivityResultCallback() { // from class: com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiFragment$chooseEmploymentLauncher$1
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(UiEmploymentInfo uiEmploymentInfo) {
                if (uiEmploymentInfo != null) {
                    this.this$0.getDuxo().onUserEmploymentUpdated(uiEmploymentInfo);
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.chooseEmploymentLauncher = activityResultLauncherRegisterForActivityResult;
        ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<Questionnaire>> activityResultLauncherRegisterForActivityResult2 = registerForActivityResult(new QuestionnaireContract(new Function0() { // from class: com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.getNavigator();
            }
        }), new ActivityResultCallback() { // from class: com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiFragment$riskToleranceLauncher$2
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(QuestionnaireContract2 questionnaireContract2) {
                if (questionnaireContract2 instanceof QuestionnaireContract2.Completed) {
                    InvestmentProfileSettingsBonfireIdentiDuxo duxo = this.this$0.getDuxo();
                    InvestmentProfileSettingsBonfireIdentiFragment.Companion companion = InvestmentProfileSettingsBonfireIdentiFragment.INSTANCE;
                    duxo.onRiskToleranceUpdated(((InvestmentProfileSettingsBonfireIdentiFragment.Args) companion.getArgs((Fragment) this.this$0)).getAccountNumber(), ((InvestmentProfileSettingsBonfireIdentiFragment.Args) companion.getArgs((Fragment) this.this$0)).getApplicationId(), (QuestionnaireContract2.Completed) questionnaireContract2);
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult2, "registerForActivityResult(...)");
        this.riskToleranceLauncher = activityResultLauncherRegisterForActivityResult2;
        ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<Questionnaire>> activityResultLauncherRegisterForActivityResult3 = registerForActivityResult(new QuestionnaireContract(new Function0() { // from class: com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.getNavigator();
            }
        }), new ActivityResultCallback() { // from class: com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiFragment$annualIncomeLauncher$2
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(QuestionnaireContract2 questionnaireContract2) {
                if (questionnaireContract2 instanceof QuestionnaireContract2.Completed) {
                    QuestionnaireContract2.Completed completed = (QuestionnaireContract2.Completed) questionnaireContract2;
                    this.this$0.annualIncomeQuestionnaireResult = completed;
                    Questionnaire questionnaire = new Questionnaire(false, InvestmentProfileSettingsBonfireIdentiFragment.IP_CONTEXT_INCOME_CHANGE, "", null, null, new QuestionnaireQuestion(InvestmentProfileSettingsBonfireIdentiFragment.QUESTION_KEY_INCOME_CHANGE_REASON, null, null, 4, null), ((InvestmentProfileSettingsBonfireIdentiFragment.Args) InvestmentProfileSettingsBonfireIdentiFragment.INSTANCE.getArgs((Fragment) this.this$0)).getFromGoldUpgrade(), false, false, true, false, null, null, false, false, false, false, true, null, null, 916880, null);
                    QuestionnaireAnswer questionnaireAnswer = (QuestionnaireAnswer) CollectionsKt.firstOrNull((List) completed.getQuestionAnswers());
                    if (questionnaireAnswer == null || !questionnaireAnswer.getShouldSubmitEarly()) {
                        this.this$0.annualIncomeReasonLauncher.launch(new NavigationActivityResultContract.NavigationParams(questionnaire, null, false, 6, null));
                    } else {
                        this.this$0.getDuxo().onAnnualIncomeUpdated();
                    }
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult3, "registerForActivityResult(...)");
        this.annualIncomeLauncher = activityResultLauncherRegisterForActivityResult3;
        ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<Questionnaire>> activityResultLauncherRegisterForActivityResult4 = registerForActivityResult(new QuestionnaireContract(new Function0() { // from class: com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.getNavigator();
            }
        }), new ActivityResultCallback() { // from class: com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiFragment$annualIncomeReasonLauncher$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(QuestionnaireContract2 questionnaireContract2) {
                UiQuestionnaireQuestion.MultipleChoiceQuestion question;
                UiQuestionContent.MultipleChoiceContent content;
                List<UiQuestionContent.MultipleChoiceContent.Answer> answerChoices;
                if (questionnaireContract2 instanceof QuestionnaireContract2.Completed) {
                    QuestionnaireContract2.Completed completed = (QuestionnaireContract2.Completed) questionnaireContract2;
                    this.this$0.annualIncomeReasonQuestionnaireResult = completed;
                    Questionnaire questionnaire = new Questionnaire(false, InvestmentProfileSettingsBonfireIdentiFragment.IP_CONTEXT_INCOME_CHANGE, "", null, null, new QuestionnaireQuestion(InvestmentProfileSettingsBonfireIdentiFragment.QUESTION_KEY_INCOME_CHANGE_REASON_OTHER, null, null, 4, null), ((InvestmentProfileSettingsBonfireIdentiFragment.Args) InvestmentProfileSettingsBonfireIdentiFragment.INSTANCE.getArgs((Fragment) this.this$0)).getFromGoldUpgrade(), false, false, true, false, null, null, false, false, false, false, true, null, null, 916880, null);
                    Object objFirstOrNull = CollectionsKt.firstOrNull((List<? extends Object>) completed.getQuestionAnswers());
                    UiQuestionContent.MultipleChoiceContent.Answer answer = null;
                    QuestionnaireAnswer.MultipleChoiceAnswer multipleChoiceAnswer = objFirstOrNull instanceof QuestionnaireAnswer.MultipleChoiceAnswer ? (QuestionnaireAnswer.MultipleChoiceAnswer) objFirstOrNull : null;
                    if (multipleChoiceAnswer != null && (question = multipleChoiceAnswer.getQuestion()) != null && (content = question.getContent()) != null && (answerChoices = content.getAnswerChoices()) != null) {
                        Iterator<T> it = answerChoices.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Object next = it.next();
                            if (Intrinsics.areEqual(((UiQuestionContent.MultipleChoiceContent.Answer) next).getKey(), InvestmentProfileSettingsBonfireIdentiFragment.CHOICE_KEY_INCOME_CHANGE_REASON_OTHER)) {
                                answer = next;
                                break;
                            }
                        }
                        answer = answer;
                    }
                    if (answer == null || !Intrinsics.areEqual(multipleChoiceAnswer.getAnswer(), answer.getId())) {
                        InvestmentProfileSettingsBonfireIdentiDuxo duxo = this.this$0.getDuxo();
                        InvestmentProfileSettingsBonfireIdentiFragment.Companion companion = InvestmentProfileSettingsBonfireIdentiFragment.INSTANCE;
                        duxo.onAnnualIncomeUpdated(((InvestmentProfileSettingsBonfireIdentiFragment.Args) companion.getArgs((Fragment) this.this$0)).getAccountNumber(), ((InvestmentProfileSettingsBonfireIdentiFragment.Args) companion.getArgs((Fragment) this.this$0)).getApplicationId(), CollectionsKt.listOf((Object[]) new QuestionnaireContract2.Completed[]{this.this$0.annualIncomeQuestionnaireResult, this.this$0.annualIncomeReasonQuestionnaireResult}));
                        return;
                    }
                    this.this$0.annualIncomeFreeFormLauncher.launch(new NavigationActivityResultContract.NavigationParams(questionnaire, null, false, 6, null));
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult4, "registerForActivityResult(...)");
        this.annualIncomeReasonLauncher = activityResultLauncherRegisterForActivityResult4;
        ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<Questionnaire>> activityResultLauncherRegisterForActivityResult5 = registerForActivityResult(new QuestionnaireContract(new Function0() { // from class: com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.getNavigator();
            }
        }), new ActivityResultCallback() { // from class: com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiFragment$annualIncomeFreeFormLauncher$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(QuestionnaireContract2 questionnaireContract2) {
                if (questionnaireContract2 instanceof QuestionnaireContract2.Completed) {
                    InvestmentProfileSettingsBonfireIdentiDuxo duxo = this.this$0.getDuxo();
                    InvestmentProfileSettingsBonfireIdentiFragment.Companion companion = InvestmentProfileSettingsBonfireIdentiFragment.INSTANCE;
                    duxo.onAnnualIncomeUpdated(((InvestmentProfileSettingsBonfireIdentiFragment.Args) companion.getArgs((Fragment) this.this$0)).getAccountNumber(), ((InvestmentProfileSettingsBonfireIdentiFragment.Args) companion.getArgs((Fragment) this.this$0)).getApplicationId(), CollectionsKt.listOf((Object[]) new QuestionnaireContract2.Completed[]{this.this$0.annualIncomeQuestionnaireResult, this.this$0.annualIncomeReasonQuestionnaireResult, questionnaireContract2}));
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult5, "registerForActivityResult(...)");
        this.annualIncomeFreeFormLauncher = activityResultLauncherRegisterForActivityResult5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InvestmentProfileSettingsBonfireIdentiDuxo getDuxo() {
        return (InvestmentProfileSettingsBonfireIdentiDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        Screen.Name name;
        if (((Args) INSTANCE.getArgs((Fragment) this)).getFromMarginUpgrade()) {
            name = Screen.Name.MARGIN_UPGRADE_REVIEW_INVESTMENT_PROFILE;
        } else {
            name = Screen.Name.NAME_UNSPECIFIED;
        }
        return new Screen(name, null, null, null, 14, null);
    }

    public final EventLogger getEventLogger() {
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            return eventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void setEventLogger(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "<set-?>");
        this.eventLogger = eventLogger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InvestmentProfileSettingsBonfireIdentiViewState ComposeContent$lambda$7(SnapshotState4<InvestmentProfileSettingsBonfireIdentiViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleQuestionItemSelected(InvestmentProfileSettingsBonfireIdentiViewState.InvestmentProfileItem.QuestionSummaryItem item) {
        EventLogger.DefaultImpls.logTap$default(getEventLogger(), null, getEventScreen(), new Component(Component.ComponentType.ROW, UiInvestmentProfileSettingsQuestionSummarys.title(item.getQuestion()), null, 4, null), null, null, false, 57, null);
        UiInvestmentProfileAnswers2 question = item.getQuestion();
        if (question instanceof UiInvestmentProfileAnswers2.SupportedType) {
            switch (WhenMappings.$EnumSwitchMapping$0[((UiInvestmentProfileAnswers2.SupportedType) item.getQuestion()).getType().ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    String key = ((UiInvestmentProfileAnswers2.SupportedType) item.getQuestion()).getKey();
                    String id = ((UiInvestmentProfileAnswers2.SupportedType) item.getQuestion()).getId();
                    String context = ((UiInvestmentProfileAnswers2.SupportedType) item.getQuestion()).getContext();
                    String accountNumber = ((UiInvestmentProfileAnswers2.SupportedType) item.getQuestion()).getAccountNumber();
                    UiInvestmentProfileAnswers2.SupportedType.Answer answer = ((UiInvestmentProfileAnswers2.SupportedType) item.getQuestion()).getAnswer();
                    onInvestmentProfileItemSelected(key, id, context, accountNumber, null, answer != null ? answer.getValue() : null, item.getQuestionGraph(), item.getShowInfoGatherFlow());
                    return;
                case 5:
                    ActivityResultLauncher<Intent> activityResultLauncher = this.chooseEmploymentLauncher;
                    Navigator navigator = getNavigator();
                    android.content.Context contextRequireContext = requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                    activityResultLauncher.launch(Navigator.DefaultImpls.createIntent$default(navigator, contextRequireContext, new ChooseEmploymentIntentKey(null, false, 3, null), null, false, 12, null));
                    return;
                case 6:
                    Navigator navigator2 = getNavigator();
                    android.content.Context contextRequireContext2 = requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                    Navigator.DefaultImpls.startActivity$default(navigator2, contextRequireContext2, LegacyIntentKey.OptionsExperience.INSTANCE, null, false, null, null, 60, null);
                    return;
                case 7:
                    Navigator navigator3 = getNavigator();
                    android.content.Context contextRequireContext3 = requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "requireContext(...)");
                    Navigator.DefaultImpls.startActivity$default(navigator3, contextRequireContext3, new LegacyIntentKey.OptionsProfessionalTrader("settings"), null, false, null, null, 60, null);
                    return;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        if (!(question instanceof UiInvestmentProfileAnswers2.UnsupportedType)) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("Impossible code-path");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onInvestmentProfileItemSelected(String questionKey, String questionId, String context, String accountNumber, String applicationId, String existingAnswer, Map<String, ? extends UiQuestionnaireQuestion.Supported> questionGraph, boolean showInfoGatherFlow) {
        if (context != null) {
            if (showInfoGatherFlow && Intrinsics.areEqual(questionKey, "risk_tolerance")) {
                this.riskToleranceLauncher.launch(new NavigationActivityResultContract.NavigationParams<>(new Questionnaire(false, context, accountNumber, applicationId, null, new QuestionnaireQuestion(questionKey, existingAnswer, null, 4, null), ((Args) INSTANCE.getArgs((Fragment) this)).getFromGoldUpgrade(), false, false, true, false, null, null, false, false, true, false, true, null, null, 884112, null), null, false, 6, null));
                return;
            }
            if (showInfoGatherFlow && Intrinsics.areEqual(questionKey, "annual_income")) {
                this.annualIncomeLauncher.launch(new NavigationActivityResultContract.NavigationParams<>(new Questionnaire(false, context, accountNumber, applicationId, null, new QuestionnaireQuestion(questionKey, existingAnswer, null, 4, null), ((Args) INSTANCE.getArgs((Fragment) this)).getFromGoldUpgrade(), false, false, true, false, null, null, false, false, true, false, true, null, null, 884112, null), null, false, 6, null));
                return;
            }
            Navigator navigator = getNavigator();
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new Questionnaire(false, context, accountNumber, applicationId, null, new QuestionnaireQuestion(questionKey, existingAnswer, questionId), ((Args) INSTANCE.getArgs((Fragment) this)).getFromGoldUpgrade(), false, false, false, false, null, null, true, false, true, false, false, null, questionGraph, 483216, null), null, false, null, null, 60, null);
        }
    }

    private final void launchInvestorProfileQuestionnaire(String accountNumber, String applicationId, String questionnaireContext) {
        Companion companion = INSTANCE;
        if (((Args) companion.getArgs((Fragment) this)).getFromGoldUpgrade()) {
            requireActivity().getOnBackPressedDispatcher().onBackPressed();
        }
        Navigator navigator = getNavigator();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new Questionnaire(false, questionnaireContext, accountNumber, applicationId, null, null, ((Args) companion.getArgs((Fragment) this)).getFromGoldUpgrade(), false, false, false, false, null, null, false, false, false, false, false, null, null, 1048496, null), null, false, null, null, 60, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setElevation(0.0f);
        if (((Args) INSTANCE.getArgs((Fragment) this)).getConfigureToolbar()) {
            toolbar.setTitle(C19641R.string.settings_investment_profile_v4_label);
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        if (((Args) INSTANCE.getArgs((Fragment) this)).getUseGoldTheme()) {
            putGoldOverlay(scarletContextWrapper);
        } else {
            putAchromaticOverlay(scarletContextWrapper);
        }
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C197041(null), 1, null);
    }

    /* compiled from: InvestmentProfileSettingsBonfireIdentiFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiFragment$onViewCreated$1", m3645f = "InvestmentProfileSettingsBonfireIdentiFragment.kt", m3646l = {338}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiFragment$onViewCreated$1 */
    static final class C197041 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C197041(Continuation<? super C197041> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InvestmentProfileSettingsBonfireIdentiFragment.this.new C197041(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C197041) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: InvestmentProfileSettingsBonfireIdentiFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiFragment$onViewCreated$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ InvestmentProfileSettingsBonfireIdentiFragment $tmp0;

            AnonymousClass1(InvestmentProfileSettingsBonfireIdentiFragment investmentProfileSettingsBonfireIdentiFragment) {
                this.$tmp0 = investmentProfileSettingsBonfireIdentiFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, InvestmentProfileSettingsBonfireIdentiFragment.class, "setState", "setState(Lcom/robinhood/android/investorprofile/ui/profile/InvestmentProfileSettingsBonfireIdentiViewState;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(InvestmentProfileSettingsBonfireIdentiViewState investmentProfileSettingsBonfireIdentiViewState, Continuation<? super Unit> continuation) throws Throwable {
                Object objInvokeSuspend$setState = C197041.invokeSuspend$setState(this.$tmp0, investmentProfileSettingsBonfireIdentiViewState, continuation);
                return objInvokeSuspend$setState == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$setState : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((InvestmentProfileSettingsBonfireIdentiViewState) obj, (Continuation<? super Unit>) continuation);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<InvestmentProfileSettingsBonfireIdentiViewState> stateFlow = InvestmentProfileSettingsBonfireIdentiFragment.this.getDuxo().getStateFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(InvestmentProfileSettingsBonfireIdentiFragment.this);
                this.label = 1;
                if (stateFlow.collect(anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new ExceptionsH();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$setState(InvestmentProfileSettingsBonfireIdentiFragment investmentProfileSettingsBonfireIdentiFragment, InvestmentProfileSettingsBonfireIdentiViewState investmentProfileSettingsBonfireIdentiViewState, Continuation continuation) throws Throwable {
            investmentProfileSettingsBonfireIdentiFragment.setState(investmentProfileSettingsBonfireIdentiViewState);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setState(InvestmentProfileSettingsBonfireIdentiViewState state) throws Throwable {
        String strConsume;
        Throwable thConsume;
        UiEvent<Throwable> error = state.getError();
        if (error != null && (thConsume = error.consume()) != null && !AbsErrorHandler.handleError$default(getActivityErrorHandler(), thConsume, false, 2, null)) {
            throw thConsume;
        }
        UiEvent<String> questionnaireNotCompletedEvent = state.getQuestionnaireNotCompletedEvent();
        if (questionnaireNotCompletedEvent != null && (strConsume = questionnaireNotCompletedEvent.consume()) != null) {
            Companion companion = INSTANCE;
            launchInvestorProfileQuestionnaire(((Args) companion.getArgs((Fragment) this)).getAccountNumber(), ((Args) companion.getArgs((Fragment) this)).getApplicationId(), strConsume);
        }
        UiEvent<Unit> updateAppEvent = state.getUpdateAppEvent();
        if ((updateAppEvent != null ? updateAppEvent.consume() : null) != null) {
            Navigator navigator = getNavigator();
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new DeepLinkIntentKey.UnrecognizedDeepLink(false, false, null, 6, null), null, false, null, null, 60, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onConfirmInvestmentProfile() {
        requireActivity().setResult(-1);
        requireActivity().finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onEditInvestmentProfile() {
        Navigator navigator = getNavigator();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        Companion companion = INSTANCE;
        boolean showAccountSwitcher = ((Args) companion.getArgs((Fragment) this)).getShowAccountSwitcher();
        Navigator.DefaultImpls.showFragment$default(navigator, fragmentActivityRequireActivity, new SettingsFragmentKey(SettingsFragmentKey3.LAUNCH_INVESTMENT_PROFILE, false, false, false, null, null, ((Args) companion.getArgs((Fragment) this)).getAccountNumber(), null, showAccountSwitcher, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE, null), false, false, false, null, false, null, false, false, null, null, 4084, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onInvestmentProfileReviewed() {
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        Intrinsics.checkNotNull(componentRequireActivity, "null cannot be cast to non-null type com.robinhood.shared.questionnaire.libquestionnaire.ReviewInvestorProfileCallbacks");
        ((ReviewInvestorProfileCallbacks) componentRequireActivity).onInvestorProfileReviewed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAccountSelectionDropdownClicked(AccountSwitcherData data) {
        Navigator.DefaultImpls.createDialogFragment$default(getNavigator(), new AccountSwitcherBottomSheetFragmentKey(data), null, 2, null).show(getChildFragmentManager(), "account-switcher");
    }

    @Override // com.robinhood.shared.account.contracts.switcher.AccountSwitcherCallbacks
    public void onAccountSelected(String accountNumber, BrokerageAccountType brokerageAccountType) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        getDuxo().onAccountSelected(accountNumber);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-124335441);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-124335441, i2, -1, "com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiFragment.ComposeContent (InvestmentProfileSettingsBonfireIdentiFragment.kt:399)");
            }
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, getEventScreen(), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(-499378854, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiFragment.ComposeContent.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-499378854, i3, -1, "com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiFragment.ComposeContent.<anonymous> (InvestmentProfileSettingsBonfireIdentiFragment.kt:407)");
                    }
                    InvestmentProfileSettingsBonfireIdentiViewState investmentProfileSettingsBonfireIdentiViewStateComposeContent$lambda$7 = InvestmentProfileSettingsBonfireIdentiFragment.ComposeContent$lambda$7(snapshotState4CollectAsStateWithLifecycle);
                    InvestmentProfileSettingsBonfireIdentiFragment investmentProfileSettingsBonfireIdentiFragment = InvestmentProfileSettingsBonfireIdentiFragment.this;
                    composer2.startReplaceGroup(5004770);
                    boolean zChangedInstance = composer2.changedInstance(investmentProfileSettingsBonfireIdentiFragment);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new C19695x9fed188b(investmentProfileSettingsBonfireIdentiFragment);
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    composer2.endReplaceGroup();
                    Function1 function1 = (Function1) ((KFunction) objRememberedValue);
                    Companion companion = InvestmentProfileSettingsBonfireIdentiFragment.INSTANCE;
                    boolean showButtonBar = ((Args) companion.getArgs((Fragment) InvestmentProfileSettingsBonfireIdentiFragment.this)).getShowButtonBar();
                    boolean rowsClickable = ((Args) companion.getArgs((Fragment) InvestmentProfileSettingsBonfireIdentiFragment.this)).getRowsClickable();
                    boolean fromMarginUpgrade = ((Args) companion.getArgs((Fragment) InvestmentProfileSettingsBonfireIdentiFragment.this)).getFromMarginUpgrade();
                    InvestmentProfileSettingsBonfireIdentiFragment investmentProfileSettingsBonfireIdentiFragment2 = InvestmentProfileSettingsBonfireIdentiFragment.this;
                    composer2.startReplaceGroup(5004770);
                    boolean zChangedInstance2 = composer2.changedInstance(investmentProfileSettingsBonfireIdentiFragment2);
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new C19696x9fed1c4c(investmentProfileSettingsBonfireIdentiFragment2);
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceGroup();
                    Function0 function0 = (Function0) ((KFunction) objRememberedValue2);
                    InvestmentProfileSettingsBonfireIdentiFragment investmentProfileSettingsBonfireIdentiFragment3 = InvestmentProfileSettingsBonfireIdentiFragment.this;
                    composer2.startReplaceGroup(5004770);
                    boolean zChangedInstance3 = composer2.changedInstance(investmentProfileSettingsBonfireIdentiFragment3);
                    Object objRememberedValue3 = composer2.rememberedValue();
                    if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new C19697x9fed200d(investmentProfileSettingsBonfireIdentiFragment3);
                        composer2.updateRememberedValue(objRememberedValue3);
                    }
                    composer2.endReplaceGroup();
                    Function0 function02 = (Function0) ((KFunction) objRememberedValue3);
                    InvestmentProfileSettingsBonfireIdentiFragment investmentProfileSettingsBonfireIdentiFragment4 = InvestmentProfileSettingsBonfireIdentiFragment.this;
                    composer2.startReplaceGroup(5004770);
                    boolean zChangedInstance4 = composer2.changedInstance(investmentProfileSettingsBonfireIdentiFragment4);
                    Object objRememberedValue4 = composer2.rememberedValue();
                    if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new C19698x9fed23ce(investmentProfileSettingsBonfireIdentiFragment4);
                        composer2.updateRememberedValue(objRememberedValue4);
                    }
                    composer2.endReplaceGroup();
                    Function0 function03 = (Function0) ((KFunction) objRememberedValue4);
                    InvestmentProfileSettingsBonfireIdentiFragment investmentProfileSettingsBonfireIdentiFragment5 = InvestmentProfileSettingsBonfireIdentiFragment.this;
                    composer2.startReplaceGroup(5004770);
                    boolean zChangedInstance5 = composer2.changedInstance(investmentProfileSettingsBonfireIdentiFragment5);
                    Object objRememberedValue5 = composer2.rememberedValue();
                    if (zChangedInstance5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue5 = new C19699x9fed278f(investmentProfileSettingsBonfireIdentiFragment5);
                        composer2.updateRememberedValue(objRememberedValue5);
                    }
                    composer2.endReplaceGroup();
                    InvestmentProfileSettingsBonfireIdentiScreen3.InvestmentProfileSettingsBonfireIdentiScreen(investmentProfileSettingsBonfireIdentiViewStateComposeContent$lambda$7, function1, showButtonBar, rowsClickable, fromMarginUpgrade, function0, function02, function03, (Function1) ((KFunction) objRememberedValue5), composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InvestmentProfileSettingsBonfireIdentiFragment.ComposeContent$lambda$8(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: InvestmentProfileSettingsBonfireIdentiFragment.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b&\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001By\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\t\u0010'\u001a\u00020\u0007HÆ\u0003J\t\u0010(\u001a\u00020\u0007HÆ\u0003J\t\u0010)\u001a\u00020\u0007HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u008b\u0001\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010-\u001a\u00020.J\u0013\u0010/\u001a\u00020\u00072\b\u00100\u001a\u0004\u0018\u000101HÖ\u0003J\t\u00102\u001a\u00020.HÖ\u0001J\t\u00103\u001a\u00020\u0003HÖ\u0001J\u0016\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u00020.R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0011\u0010\r\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013¨\u00069"}, m3636d2 = {"Lcom/robinhood/android/investorprofile/ui/profile/InvestmentProfileSettingsBonfireIdentiFragment$Args;", "Landroid/os/Parcelable;", "productContext", "", "accountNumber", "applicationId", "configureToolbar", "", "rowsClickable", "showButtonBar", "showAccountSwitcher", "useGoldTheme", "fromMarginUpgrade", "fromGoldUpgrade", "title", "subtitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZLjava/lang/String;Ljava/lang/String;)V", "getProductContext", "()Ljava/lang/String;", "getAccountNumber", "getApplicationId", "getConfigureToolbar", "()Z", "getRowsClickable", "getShowButtonBar", "getShowAccountSwitcher", "getUseGoldTheme", "getFromMarginUpgrade", "getFromGoldUpgrade", "getTitle", "getSubtitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String accountNumber;
        private final String applicationId;
        private final boolean configureToolbar;
        private final boolean fromGoldUpgrade;
        private final boolean fromMarginUpgrade;
        private final String productContext;
        private final boolean rowsClickable;
        private final boolean showAccountSwitcher;
        private final boolean showButtonBar;
        private final String subtitle;
        private final String title;
        private final boolean useGoldTheme;

        /* compiled from: InvestmentProfileSettingsBonfireIdentiFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                boolean z3;
                boolean z4;
                boolean z5;
                boolean z6;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                boolean z7 = false;
                boolean z8 = true;
                if (parcel.readInt() != 0) {
                    z = false;
                    z7 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = true;
                    z8 = z;
                }
                if (parcel.readInt() != 0) {
                    z3 = z2;
                } else {
                    z3 = z2;
                    z2 = z;
                }
                if (parcel.readInt() != 0) {
                    z4 = z3;
                } else {
                    z4 = z3;
                    z3 = z;
                }
                if (parcel.readInt() != 0) {
                    z5 = z4;
                } else {
                    z5 = z4;
                    z4 = z;
                }
                if (parcel.readInt() != 0) {
                    z6 = z5;
                } else {
                    z6 = z5;
                    z5 = z;
                }
                if (parcel.readInt() == 0) {
                    z6 = z;
                }
                return new Args(string2, string3, string4, z7, z8, z2, z3, z4, z5, z6, parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str4, String str5, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.productContext;
            }
            if ((i & 2) != 0) {
                str2 = args.accountNumber;
            }
            if ((i & 4) != 0) {
                str3 = args.applicationId;
            }
            if ((i & 8) != 0) {
                z = args.configureToolbar;
            }
            if ((i & 16) != 0) {
                z2 = args.rowsClickable;
            }
            if ((i & 32) != 0) {
                z3 = args.showButtonBar;
            }
            if ((i & 64) != 0) {
                z4 = args.showAccountSwitcher;
            }
            if ((i & 128) != 0) {
                z5 = args.useGoldTheme;
            }
            if ((i & 256) != 0) {
                z6 = args.fromMarginUpgrade;
            }
            if ((i & 512) != 0) {
                z7 = args.fromGoldUpgrade;
            }
            if ((i & 1024) != 0) {
                str4 = args.title;
            }
            if ((i & 2048) != 0) {
                str5 = args.subtitle;
            }
            String str6 = str4;
            String str7 = str5;
            boolean z8 = z6;
            boolean z9 = z7;
            boolean z10 = z4;
            boolean z11 = z5;
            boolean z12 = z2;
            boolean z13 = z3;
            return args.copy(str, str2, str3, z, z12, z13, z10, z11, z8, z9, str6, str7);
        }

        /* renamed from: component1, reason: from getter */
        public final String getProductContext() {
            return this.productContext;
        }

        /* renamed from: component10, reason: from getter */
        public final boolean getFromGoldUpgrade() {
            return this.fromGoldUpgrade;
        }

        /* renamed from: component11, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component12, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component3, reason: from getter */
        public final String getApplicationId() {
            return this.applicationId;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getConfigureToolbar() {
            return this.configureToolbar;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getRowsClickable() {
            return this.rowsClickable;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getShowButtonBar() {
            return this.showButtonBar;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getShowAccountSwitcher() {
            return this.showAccountSwitcher;
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getUseGoldTheme() {
            return this.useGoldTheme;
        }

        /* renamed from: component9, reason: from getter */
        public final boolean getFromMarginUpgrade() {
            return this.fromMarginUpgrade;
        }

        public final Args copy(String productContext, String accountNumber, String applicationId, boolean configureToolbar, boolean rowsClickable, boolean showButtonBar, boolean showAccountSwitcher, boolean useGoldTheme, boolean fromMarginUpgrade, boolean fromGoldUpgrade, String title, String subtitle) {
            return new Args(productContext, accountNumber, applicationId, configureToolbar, rowsClickable, showButtonBar, showAccountSwitcher, useGoldTheme, fromMarginUpgrade, fromGoldUpgrade, title, subtitle);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return Intrinsics.areEqual(this.productContext, args.productContext) && Intrinsics.areEqual(this.accountNumber, args.accountNumber) && Intrinsics.areEqual(this.applicationId, args.applicationId) && this.configureToolbar == args.configureToolbar && this.rowsClickable == args.rowsClickable && this.showButtonBar == args.showButtonBar && this.showAccountSwitcher == args.showAccountSwitcher && this.useGoldTheme == args.useGoldTheme && this.fromMarginUpgrade == args.fromMarginUpgrade && this.fromGoldUpgrade == args.fromGoldUpgrade && Intrinsics.areEqual(this.title, args.title) && Intrinsics.areEqual(this.subtitle, args.subtitle);
        }

        public int hashCode() {
            String str = this.productContext;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.accountNumber;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.applicationId;
            int iHashCode3 = (((((((((((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + Boolean.hashCode(this.configureToolbar)) * 31) + Boolean.hashCode(this.rowsClickable)) * 31) + Boolean.hashCode(this.showButtonBar)) * 31) + Boolean.hashCode(this.showAccountSwitcher)) * 31) + Boolean.hashCode(this.useGoldTheme)) * 31) + Boolean.hashCode(this.fromMarginUpgrade)) * 31) + Boolean.hashCode(this.fromGoldUpgrade)) * 31;
            String str4 = this.title;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.subtitle;
            return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
        }

        public String toString() {
            return "Args(productContext=" + this.productContext + ", accountNumber=" + this.accountNumber + ", applicationId=" + this.applicationId + ", configureToolbar=" + this.configureToolbar + ", rowsClickable=" + this.rowsClickable + ", showButtonBar=" + this.showButtonBar + ", showAccountSwitcher=" + this.showAccountSwitcher + ", useGoldTheme=" + this.useGoldTheme + ", fromMarginUpgrade=" + this.fromMarginUpgrade + ", fromGoldUpgrade=" + this.fromGoldUpgrade + ", title=" + this.title + ", subtitle=" + this.subtitle + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.productContext);
            dest.writeString(this.accountNumber);
            dest.writeString(this.applicationId);
            dest.writeInt(this.configureToolbar ? 1 : 0);
            dest.writeInt(this.rowsClickable ? 1 : 0);
            dest.writeInt(this.showButtonBar ? 1 : 0);
            dest.writeInt(this.showAccountSwitcher ? 1 : 0);
            dest.writeInt(this.useGoldTheme ? 1 : 0);
            dest.writeInt(this.fromMarginUpgrade ? 1 : 0);
            dest.writeInt(this.fromGoldUpgrade ? 1 : 0);
            dest.writeString(this.title);
            dest.writeString(this.subtitle);
        }

        public Args(String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str4, String str5) {
            this.productContext = str;
            this.accountNumber = str2;
            this.applicationId = str3;
            this.configureToolbar = z;
            this.rowsClickable = z2;
            this.showButtonBar = z3;
            this.showAccountSwitcher = z4;
            this.useGoldTheme = z5;
            this.fromMarginUpgrade = z6;
            this.fromGoldUpgrade = z7;
            this.title = str4;
            this.subtitle = str5;
        }

        public /* synthetic */ Args(String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, z, z2, z3, z4, (i & 128) != 0 ? false : z5, (i & 256) != 0 ? false : z6, z7, (i & 1024) != 0 ? null : str4, (i & 2048) != 0 ? null : str5);
        }

        public final String getProductContext() {
            return this.productContext;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final String getApplicationId() {
            return this.applicationId;
        }

        public final boolean getConfigureToolbar() {
            return this.configureToolbar;
        }

        public final boolean getRowsClickable() {
            return this.rowsClickable;
        }

        public final boolean getShowButtonBar() {
            return this.showButtonBar;
        }

        public final boolean getShowAccountSwitcher() {
            return this.showAccountSwitcher;
        }

        public final boolean getUseGoldTheme() {
            return this.useGoldTheme;
        }

        public final boolean getFromMarginUpgrade() {
            return this.fromMarginUpgrade;
        }

        public final boolean getFromGoldUpgrade() {
            return this.fromGoldUpgrade;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }
    }

    /* compiled from: InvestmentProfileSettingsBonfireIdentiFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/investorprofile/ui/profile/InvestmentProfileSettingsBonfireIdentiFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/investorprofile/ui/profile/InvestmentProfileSettingsBonfireIdentiFragment;", "Lcom/robinhood/android/investorprofile/ui/profile/InvestmentProfileSettingsBonfireIdentiFragment$Args;", "<init>", "()V", "RISK_TOLERANCE_KEY", "", "ANNUAL_INCOME_KEY", "IP_CONTEXT_INCOME_CHANGE", "QUESTION_KEY_INCOME_CHANGE_REASON", "CHOICE_KEY_INCOME_CHANGE_REASON_OTHER", "QUESTION_KEY_INCOME_CHANGE_REASON_OTHER", "ANNUAL_INCOME_LESS_THAN_TWENTY_FIVE_THOUSAND", "feature-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<InvestmentProfileSettingsBonfireIdentiFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(InvestmentProfileSettingsBonfireIdentiFragment investmentProfileSettingsBonfireIdentiFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, investmentProfileSettingsBonfireIdentiFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public InvestmentProfileSettingsBonfireIdentiFragment newInstance(Args args) {
            return (InvestmentProfileSettingsBonfireIdentiFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(InvestmentProfileSettingsBonfireIdentiFragment investmentProfileSettingsBonfireIdentiFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, investmentProfileSettingsBonfireIdentiFragment, args);
        }
    }
}
