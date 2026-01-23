package com.robinhood.android.recommendations.retirement.p223ui;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.navigation.IntentResolver;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.questionnaire.p219db.QuestionnaireContexts;
import com.robinhood.android.recommendations.contracts.RecommendationsIntentKeys2;
import com.robinhood.android.recommendations.contracts.RecommendationsIntentKeys3;
import com.robinhood.android.recommendations.contracts.RecommendationsRecurringHook;
import com.robinhood.android.recommendations.retirement.C26015R;
import com.robinhood.android.recommendations.retirement.lib.p222ui.RecsRetirementEligibilityLoadingFragment;
import com.robinhood.android.recommendations.retirement.lib.p222ui.RecsRetirementUnavailableFragment;
import com.robinhood.android.recommendations.retirement.p223ui.congrats.RecsRetirementCongratsFragment;
import com.robinhood.android.recommendations.retirement.p223ui.intro.RecsRetirementIntroFragment;
import com.robinhood.android.recommendations.retirement.p223ui.portfolio.RecsRetirementPortfolioFragment;
import com.robinhood.android.recommendations.retirement.p223ui.prospectus.RecsRetirementProspectusFragment;
import com.robinhood.android.recommendations.retirement.p223ui.results.RecsRetirementQuestionnaireResultsParentFragment;
import com.robinhood.android.recurring.contracts.investflow.AllocationStrategy;
import com.robinhood.android.recurring.contracts.investflow.InvestFlowFrequency;
import com.robinhood.android.recurring.contracts.investflow.InvestFlowIntentKey;
import com.robinhood.android.recurring.contracts.investflow.InvestFlowLoggingParams;
import com.robinhood.android.recurring.contracts.investflow.InvestFlowStep;
import com.robinhood.android.regiongate.RecommendationsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.RetirementRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.retirement.contracts.RetirementLastKnownEntryPointManager;
import com.robinhood.android.retirement.lib.onboarding.RetirementPostSignupFlowLauncher;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.investorprofile.questionnaire.QuestionnaireLoggingParams;
import com.robinhood.models.p320db.Account;
import com.robinhood.recommendations.retirement.models.api.ApiRecsRetirementPortfolio;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import com.robinhood.shared.questionnaire.contracts.Questionnaire;
import com.robinhood.shared.remote.assets.LottieUrl;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.extensions.Activity;
import com.robinhood.utils.extensions.StringsKt;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.ExceptionsH;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Interfaces;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;

/* compiled from: RecsRetirementActivity.kt */
@Metadata(m3635d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 `2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t:\u0001`B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\b\u00100\u001a\u00020\u001cH\u0016J\u0012\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u000104H\u0014J\b\u00105\u001a\u000202H\u0016J\u0010\u00106\u001a\u0002022\u0006\u00107\u001a\u000208H\u0016J\u0010\u00109\u001a\u0002022\u0006\u0010:\u001a\u00020;H\u0016J\b\u0010<\u001a\u000202H\u0016J\b\u0010=\u001a\u000202H\u0016J\u0010\u0010>\u001a\u0002022\u0006\u0010%\u001a\u00020 H\u0016J\u0010\u0010?\u001a\u0002022\u0006\u0010%\u001a\u00020 H\u0016J2\u0010@\u001a\u0002022\u0006\u0010%\u001a\u00020 2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020 0B2\u0012\u0010C\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020E0DH\u0016J\u0010\u0010F\u001a\u0002022\u0006\u0010G\u001a\u00020HH\u0016J\b\u0010I\u001a\u000202H\u0016J\b\u0010J\u001a\u000202H\u0016J\"\u0010K\u001a\u0002022\u0006\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020M2\b\u0010O\u001a\u0004\u0018\u00010PH\u0014J\u001a\u0010Q\u001a\u00020\u001c2\u0006\u0010R\u001a\u00020M2\b\u0010S\u001a\u0004\u0018\u000104H\u0016J\b\u0010T\u001a\u000202H\u0002J\b\u0010U\u001a\u000202H\u0002J\b\u0010V\u001a\u000202H\u0002J\u0010\u0010W\u001a\u00020X2\u0006\u0010%\u001a\u00020 H\u0002J\b\u0010Y\u001a\u000202H\u0016J\t\u0010Z\u001a\u00020\u001cH\u0096\u0001R\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u0019\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001b\u0010\u001dR\u001d\u0010\u001f\u001a\u0004\u0018\u00010 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u0017\u001a\u0004\b!\u0010\"R/\u0010%\u001a\u0004\u0018\u00010 2\b\u0010$\u001a\u0004\u0018\u00010 8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b&\u0010\"\"\u0004\b'\u0010(R+\u0010+\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\u00138B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b/\u0010*\u001a\u0004\b,\u0010\u0015\"\u0004\b-\u0010.R\u0018\u0010[\u001a\b\u0012\u0004\u0012\u00020]0\\X\u0096\u0005¢\u0006\u0006\u001a\u0004\b^\u0010_¨\u0006a"}, m3636d2 = {"Lcom/robinhood/android/recommendations/retirement/ui/RecsRetirementActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/recommendations/retirement/lib/ui/RecsRetirementEligibilityLoadingFragment$Callbacks;", "Lcom/robinhood/android/recommendations/retirement/ui/intro/RecsRetirementIntroFragment$Callbacks;", "Lcom/robinhood/android/recommendations/retirement/ui/results/RecsRetirementQuestionnaireResultsParentFragment$Callbacks;", "Lcom/robinhood/android/recommendations/retirement/ui/portfolio/RecsRetirementPortfolioFragment$Callbacks;", "Lcom/robinhood/android/recommendations/retirement/ui/prospectus/RecsRetirementProspectusFragment$Callbacks;", "Lcom/robinhood/android/recommendations/retirement/ui/congrats/RecsRetirementCongratsFragment$Callbacks;", "Lcom/robinhood/android/common/ui/RhDialogFragment$OnClickListener;", "<init>", "()V", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "getAccountProvider", "()Lcom/robinhood/android/lib/account/AccountProvider;", "setAccountProvider", "(Lcom/robinhood/android/lib/account/AccountProvider;)V", "accountNumber", "", "getAccountNumber", "()Ljava/lang/String;", "accountNumber$delegate", "Lkotlin/Lazy;", "source", "getSource", "source$delegate", "isReorder", "", "()Z", "isReorder$delegate", "passedRecommendationId", "Ljava/util/UUID;", "getPassedRecommendationId", "()Ljava/util/UUID;", "passedRecommendationId$delegate", "<set-?>", "recommendationId", "getRecommendationId", "setRecommendationId", "(Ljava/util/UUID;)V", "recommendationId$delegate", "Lkotlin/properties/ReadWriteProperty;", "accountType", "getAccountType", "setAccountType", "(Ljava/lang/String;)V", "accountType$delegate", "shouldPromptForLockscreen", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "finish", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onEligibilityConfirmed", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "onEligibilityDenied", "onCtaClicked", "onQuestionnaireResultsFinished", "onContinueFromPortfolio", "onContinueToInvestFlowCheckout", "instrumentIds", "", "allocationMap", "", "", "onViewProspectus", "prospectus", "Lcom/robinhood/recommendations/retirement/models/api/ApiRecsRetirementPortfolio$Prospectus;", "exitProspectus", "startRecurringHook", "onActivityResult", "requestCode", "", "resultCode", WebsocketGatewayConstants.DATA_KEY, "Landroid/content/Intent;", "onPositiveButtonClicked", "id", "passthroughArgs", "showQuestionnaireResults", "showCongrats", "prefetchLotties", "getPortfolioFragment", "Lcom/robinhood/android/recommendations/retirement/ui/portfolio/RecsRetirementPortfolioFragment;", "onBackPressed", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-recommendations-for-retirement_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class RecsRetirementActivity extends BaseActivity implements RegionGated, RecsRetirementEligibilityLoadingFragment.Callbacks, RecsRetirementIntroFragment.Callbacks, RecsRetirementQuestionnaireResultsParentFragment.Callbacks, RecsRetirementPortfolioFragment.Callbacks, RecsRetirementProspectusFragment.Callbacks, RecsRetirementCongratsFragment.Callbacks, RhDialogFragment.OnClickListener {
    private static final String EXTRA_ACCOUNT_NUMBER = "extra_account_number";
    private static final String EXTRA_IS_REORDER = "extra_is_reorder";
    private static final String EXTRA_RECOMMENDATION_ID = "extra_recommendation_id";
    private static final String EXTRA_SOURCE = "extra_source";
    private static final int MINIMUM_DOLLARS_FOR_RECS_INVESTMENT = 20;
    private static final int ORDER_FLOW_REQUEST_CODE = 124;
    private static final int QUESTIONNAIRE_REQUEST_CODE = 123;
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: accountNumber$delegate, reason: from kotlin metadata */
    private final Lazy accountNumber;
    public AccountProvider accountProvider;

    /* renamed from: accountType$delegate, reason: from kotlin metadata */
    private final Interfaces3 accountType;

    /* renamed from: isReorder$delegate, reason: from kotlin metadata */
    private final Lazy isReorder;

    /* renamed from: passedRecommendationId$delegate, reason: from kotlin metadata */
    private final Lazy passedRecommendationId;

    /* renamed from: recommendationId$delegate, reason: from kotlin metadata */
    private final Interfaces3 recommendationId;

    /* renamed from: source$delegate, reason: from kotlin metadata */
    private final Lazy source;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(RecsRetirementActivity.class, "recommendationId", "getRecommendationId()Ljava/util/UUID;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(RecsRetirementActivity.class, "accountType", "getAccountType()Ljava/lang/String;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: RecsRetirementActivity.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BrokerageAccountType.values().length];
            try {
                iArr[BrokerageAccountType.IRA_ROTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BrokerageAccountType.IRA_TRADITIONAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
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

    public RecsRetirementActivity() {
        super(C11048R.layout.activity_fragment_container);
        this.$$delegate_0 = new RegionGated2(RecommendationsRegionGate.INSTANCE, RetirementRegionGate.INSTANCE);
        this.accountNumber = Activity.intentExtra(this, EXTRA_ACCOUNT_NUMBER);
        this.source = Activity.intentExtra(this, EXTRA_SOURCE, "");
        this.isReorder = Activity.intentExtra(this, EXTRA_IS_REORDER);
        this.passedRecommendationId = Activity.intentExtra(this, EXTRA_RECOMMENDATION_ID);
        Interfaces interfacesSavedSerializable = BindSavedState2.savedSerializable(this);
        KProperty<?>[] kPropertyArr = $$delegatedProperties;
        this.recommendationId = (Interfaces3) interfacesSavedSerializable.provideDelegate(this, kPropertyArr[0]);
        this.accountType = BindSavedState2.savedString(this, "").provideDelegate(this, kPropertyArr[1]);
    }

    public final AccountProvider getAccountProvider() {
        AccountProvider accountProvider = this.accountProvider;
        if (accountProvider != null) {
            return accountProvider;
        }
        Intrinsics.throwUninitializedPropertyAccessException("accountProvider");
        return null;
    }

    public final void setAccountProvider(AccountProvider accountProvider) {
        Intrinsics.checkNotNullParameter(accountProvider, "<set-?>");
        this.accountProvider = accountProvider;
    }

    private final String getAccountNumber() {
        return (String) this.accountNumber.getValue();
    }

    private final String getSource() {
        return (String) this.source.getValue();
    }

    private final boolean isReorder() {
        return ((Boolean) this.isReorder.getValue()).booleanValue();
    }

    private final UUID getPassedRecommendationId() {
        return (UUID) this.passedRecommendationId.getValue();
    }

    private final UUID getRecommendationId() {
        return (UUID) this.recommendationId.getValue(this, $$delegatedProperties[0]);
    }

    private final void setRecommendationId(UUID uuid) {
        this.recommendationId.setValue(this, $$delegatedProperties[0], uuid);
    }

    private final String getAccountType() {
        return (String) this.accountType.getValue(this, $$delegatedProperties[1]);
    }

    private final void setAccountType(String str) {
        this.accountType.setValue(this, $$delegatedProperties[1], str);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public boolean shouldPromptForLockscreen() {
        return RetirementLastKnownEntryPointManager.INSTANCE.isAuthenticationRequired();
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        Fragment fragmentNewInstance;
        super.onCreate(savedInstanceState);
        prefetchLotties();
        if (savedInstanceState == null) {
            UUID passedRecommendationId = getPassedRecommendationId();
            int i = C11048R.id.fragment_container;
            if (passedRecommendationId != null) {
                setRecommendationId(passedRecommendationId);
                fragmentNewInstance = getPortfolioFragment(passedRecommendationId);
            } else {
                fragmentNewInstance = RecsRetirementEligibilityLoadingFragment.INSTANCE.newInstance((Parcelable) new RecsRetirementEligibilityLoadingFragment.Args(getAccountNumber()));
            }
            setFragment(i, fragmentNewInstance);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, android.app.Activity
    public void finish() {
        super.finish();
        RetirementPostSignupFlowLauncher.launchPostSignUpIfFromOnboardingUpsell(getNavigator(), this);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setUseDesignSystemTheme(true);
        ScarletManager2.overrideAttribute(toolbar, R.attr.backgroundTint, new ThemedResourceReference(ResourceType.COLOR.INSTANCE, C20690R.attr.colorTransparent));
    }

    @Override // com.robinhood.android.recommendations.retirement.lib.ui.RecsRetirementEligibilityLoadingFragment.Callbacks
    public void onEligibilityConfirmed(BrokerageAccountType brokerageAccountType) {
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        setAccountType(brokerageAccountType.toString());
        replaceFragmentWithoutAnimationAndBackStack(RecsRetirementIntroFragment.INSTANCE.newInstance((Parcelable) new RecsRetirementIntroFragment.Args(getSource(), getAccountNumber(), getAccountType())));
    }

    @Override // com.robinhood.android.recommendations.retirement.lib.ui.RecsRetirementEligibilityLoadingFragment.Callbacks
    public void onEligibilityDenied() {
        replaceFragmentWithoutAnimationAndBackStack(RecsRetirementUnavailableFragment.INSTANCE.newInstance());
    }

    @Override // com.robinhood.android.recommendations.retirement.ui.intro.RecsRetirementIntroFragment.Callbacks
    public void onCtaClicked() {
        LifecycleHost.DefaultImpls.bind$default(this, getAccountProvider().streamAccount(getAccountNumber()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.recommendations.retirement.ui.RecsRetirementActivity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecsRetirementActivity.onCtaClicked$lambda$1(this.f$0, (Account) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCtaClicked$lambda$1(RecsRetirementActivity recsRetirementActivity, Account account) {
        String str;
        Intrinsics.checkNotNullParameter(account, "account");
        int i = WhenMappings.$EnumSwitchMapping$0[account.getBrokerageAccountType().ordinal()];
        if (i == 1) {
            str = QuestionnaireContexts.RETIREMENT_RECS_ROTH_IRA;
        } else if (i == 2) {
            str = QuestionnaireContexts.RETIREMENT_RECS_TRADITIONAL_IRA;
        } else {
            Preconditions.INSTANCE.failUnexpectedItemKotlin(account.getBrokerageAccountType());
            throw new ExceptionsH();
        }
        Navigator.DefaultImpls.startActivityForResult$default(recsRetirementActivity.getNavigator(), (android.app.Activity) recsRetirementActivity, (IntentKey) new Questionnaire(true, str, recsRetirementActivity.getAccountNumber(), null, null, null, false, true, false, false, true, new QuestionnaireLoggingParams(recsRetirementActivity.getSource(), recsRetirementActivity.getAccountType()), null, false, false, false, false, false, null, null, 1045368, null), 123, (PerformanceMetricEventData.Source) null, false, (Function1) null, (NavigationType) null, 120, (Object) null);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.recommendations.retirement.ui.results.RecsRetirementQuestionnaireResultsParentFragment.Callbacks
    public void onQuestionnaireResultsFinished(UUID recommendationId) {
        Intrinsics.checkNotNullParameter(recommendationId, "recommendationId");
        replaceFragment(getPortfolioFragment(recommendationId));
    }

    @Override // com.robinhood.android.recommendations.retirement.ui.portfolio.RecsRetirementPortfolioFragment.Callbacks
    public void onContinueFromPortfolio(UUID recommendationId) {
        Intrinsics.checkNotNullParameter(recommendationId, "recommendationId");
        setRecommendationId(recommendationId);
        Navigator.DefaultImpls.startActivityForResult$default(getNavigator(), (android.app.Activity) this, (IntentKey) new RecommendationsIntentKeys2(getSource(), recommendationId, getAccountNumber()), 124, (PerformanceMetricEventData.Source) null, false, (Function1) null, (NavigationType) null, 120, (Object) null);
    }

    @Override // com.robinhood.android.recommendations.retirement.ui.portfolio.RecsRetirementPortfolioFragment.Callbacks
    public void onContinueToInvestFlowCheckout(UUID recommendationId, List<UUID> instrumentIds, Map<UUID, Float> allocationMap) {
        Intrinsics.checkNotNullParameter(recommendationId, "recommendationId");
        Intrinsics.checkNotNullParameter(instrumentIds, "instrumentIds");
        Intrinsics.checkNotNullParameter(allocationMap, "allocationMap");
        finish();
        Navigator.DefaultImpls.startActivity$default(getNavigator(), this, new InvestFlowIntentKey((InvestFlowStep) InvestFlowStep.Frequency.INSTANCE, false, false, true, (List) instrumentIds, getAccountNumber(), new BigDecimal(20), (InvestFlowFrequency) null, false, (AllocationStrategy) new AllocationStrategy.PercentSplit(allocationMap), new InvestFlowLoggingParams(null, recommendationId, 1, null), 390, (DefaultConstructorMarker) null), null, false, null, null, 60, null);
    }

    @Override // com.robinhood.android.recommendations.retirement.ui.portfolio.RecsRetirementPortfolioFragment.Callbacks
    public void onViewProspectus(ApiRecsRetirementPortfolio.Prospectus prospectus) {
        Intrinsics.checkNotNullParameter(prospectus, "prospectus");
        replaceFragment(RecsRetirementProspectusFragment.INSTANCE.newInstance((Parcelable) new RecsRetirementProspectusFragment.Args(prospectus.getTitle(), prospectus.getLinks(), prospectus.getClose_button_title(), getSource(), getAccountType())));
    }

    @Override // com.robinhood.android.recommendations.retirement.ui.prospectus.RecsRetirementProspectusFragment.Callbacks
    public void exitProspectus() {
        popLastFragment();
    }

    @Override // com.robinhood.android.recommendations.retirement.ui.congrats.RecsRetirementCongratsFragment.Callbacks
    public void startRecurringHook() {
        UUID recommendationId = getRecommendationId();
        if (recommendationId != null) {
            replaceFragment(Navigator.DefaultImpls.createFragment$default(getNavigator(), new RecommendationsRecurringHook(getSource(), getAccountNumber(), getAccountType(), recommendationId), null, 2, null));
        } else {
            finish();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == -1) {
            if (requestCode == 123) {
                showQuestionnaireResults();
            } else {
                if (requestCode != 124) {
                    return;
                }
                showCongrats();
            }
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C26015R.id.dialog_id_recs_retirement_ineligibility) {
            finish();
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    private final void showQuestionnaireResults() {
        replaceFragment(RecsRetirementQuestionnaireResultsParentFragment.INSTANCE.newInstance((Parcelable) new RecsRetirementQuestionnaireResultsParentFragment.Args(getSource(), getAccountNumber(), getAccountType())));
    }

    private final void showCongrats() {
        popEntireFragmentBackstack();
        replaceFragment(RecsRetirementCongratsFragment.INSTANCE.newInstance((Parcelable) new RecsRetirementCongratsFragment.Args(getSource(), getAccountType())));
    }

    private final void prefetchLotties() {
        LottieUrl.RECS_RET_INTRO.prefetch(this);
        LottieUrl.RECS_RET_CALCULATION.prefetch(this);
        LottieUrl.RECS_RET_CELEBRATION.prefetch(this);
        LottieUrl.RECS_RET_RECURRING_HOOK.prefetch(this);
    }

    private final RecsRetirementPortfolioFragment getPortfolioFragment(UUID recommendationId) {
        return (RecsRetirementPortfolioFragment) RecsRetirementPortfolioFragment.INSTANCE.newInstance((Parcelable) new RecsRetirementPortfolioFragment.Args(getSource(), getAccountNumber(), getAccountType(), recommendationId, isReorder()));
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (getOnBackPressedDispatcher().getHasEnabledCallbacks()) {
            getOnBackPressedDispatcher().onBackPressed();
        } else {
            super.onBackPressed();
        }
    }

    /* compiled from: RecsRetirementActivity.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/recommendations/retirement/ui/RecsRetirementActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolver;", "Lcom/robinhood/android/recommendations/contracts/RecsRetirement;", "<init>", "()V", "QUESTIONNAIRE_REQUEST_CODE", "", "ORDER_FLOW_REQUEST_CODE", "EXTRA_SOURCE", "", "EXTRA_ACCOUNT_NUMBER", "EXTRA_IS_REORDER", "EXTRA_RECOMMENDATION_ID", "MINIMUM_DOLLARS_FOR_RECS_INVESTMENT", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "key", "feature-recommendations-for-retirement_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolver<RecommendationsIntentKeys3> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, RecommendationsIntentKeys3 key) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(key, "key");
            Intent intent = new Intent(context, (Class<?>) RecsRetirementActivity.class);
            intent.putExtra(RecsRetirementActivity.EXTRA_SOURCE, key.getSource());
            intent.putExtra(RecsRetirementActivity.EXTRA_ACCOUNT_NUMBER, key.getAccountNumber());
            intent.putExtra(RecsRetirementActivity.EXTRA_IS_REORDER, key.getIsReorder());
            String recommendationId = key.getRecommendationId();
            intent.putExtra(RecsRetirementActivity.EXTRA_RECOMMENDATION_ID, recommendationId != null ? StringsKt.toUuid(recommendationId) : null);
            return intent;
        }
    }
}
