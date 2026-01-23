package com.robinhood.android.cash.rewards.p074ui.onboarding;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowInsets;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.view.result.ActivityResult;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.contract.ActivityResultContracts$StartActivityForResult;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.cash.rewards.C10176R;
import com.robinhood.android.cash.rewards.logging.RoundupRewardsLoggingUtil;
import com.robinhood.android.cash.rewards.p074ui.onboarding.RewardsOnboardingAssetSelectionParentFragment;
import com.robinhood.android.cash.rewards.p074ui.onboarding.RewardsOnboardingCryptoConfirmationFragment;
import com.robinhood.android.cash.rewards.p074ui.onboarding.RewardsOnboardingSuitabilityConfirmationFragment;
import com.robinhood.android.cash.rewards.p074ui.onboarding.content.RewardsOnboardingContent;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.android.common.search.p087ui.SearchRecurringOrderFragment;
import com.robinhood.android.common.search.p087ui.models.SearchRecurringTopContent;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.questionnaire.p219db.QuestionnaireContexts;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.recurring.models.p365db.InvestmentTarget;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.crypto.contracts.account.CryptoUpgradeIntentKey;
import com.robinhood.shared.questionnaire.contracts.Questionnaire;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: RewardsOnboardingAssetSelectionParentFragment.kt */
@Metadata(m3635d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 Q2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0003OPQB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J\u001a\u0010)\u001a\u00020&2\u0006\u0010*\u001a\u00020+2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J\b\u0010,\u001a\u00020&H\u0016J\b\u0010-\u001a\u00020&H\u0016J\u0010\u0010.\u001a\u00020&2\u0006\u0010/\u001a\u000200H\u0016J\b\u00101\u001a\u00020&H\u0016J\b\u00102\u001a\u00020&H\u0016J\u001a\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u00010(H\u0016J\u001a\u00108\u001a\u0002042\u0006\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u00010(H\u0016J8\u00109\u001a\u00020&2\n\b\u0002\u0010:\u001a\u0004\u0018\u00010;2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010;2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010>2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010@H\u0002J\u0010\u0010A\u001a\u00020&2\u0006\u0010B\u001a\u00020CH\u0002J\u0010\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u000200H\u0002J\u0010\u0010G\u001a\u00020H2\u0006\u0010F\u001a\u000200H\u0002J\t\u0010I\u001a\u000204H\u0096\u0001R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0015\u001a\u0010\u0012\f\u0012\n \u0018*\u0004\u0018\u00010\u00170\u00170\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0019\u001a\u0010\u0012\f\u0012\n \u0018*\u0004\u0018\u00010\u00170\u00170\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u001a\u001a\u00060\u001bj\u0002`\u001cX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u001f\u001a\u00020 8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0018\u0010J\u001a\b\u0012\u0004\u0012\u00020L0KX\u0096\u0005¢\u0006\u0006\u001a\u0004\bM\u0010N¨\u0006R"}, m3636d2 = {"Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingAssetSelectionParentFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/common/search/ui/SearchRecurringOrderFragment$Callbacks;", "Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingSuitabilityConfirmationFragment$Callbacks;", "Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingCryptoConfirmationFragment$Callbacks;", "Lcom/robinhood/android/common/ui/RhDialogFragment$OnClickListener;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingAssetSelectionParentFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingAssetSelectionParentFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingAssetSelectionDuxo;", "getDuxo", "()Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingAssetSelectionDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "cryptoAgreementLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "verifySuitabilityLauncher", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "loggingScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "onStart", "onStop", "onItemSelected", "selectedInvestmentTarget", "Lcom/robinhood/recurring/models/db/InvestmentTarget;", "onSuitabilityContinue", "onCryptoAgreementContinue", "onPositiveButtonClicked", "", "id", "", "passthroughArgs", "onNegativeButtonClicked", "launchSearchFragment", "titleText", "", "titleSubtext", "topContent", "Lcom/robinhood/android/common/search/ui/models/SearchRecurringTopContent;", "learnMoreContent", "Lcom/robinhood/android/common/search/ui/SearchRecurringOrderFragment$Args$LearnMoreContent;", "bind", "state", "Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingAssetSelectionViewState;", "createCryptoConfirmationFragment", "Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingCryptoConfirmationFragment;", "investmentTarget", "createSuitabilityConfirmationFragment", "Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingSuitabilityConfirmationFragment;", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Args", "Companion", "feature-cash-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class RewardsOnboardingAssetSelectionParentFragment extends BaseFragment implements RegionGated, SearchRecurringOrderFragment.Callbacks, RewardsOnboardingSuitabilityConfirmationFragment.Callbacks, RewardsOnboardingCryptoConfirmationFragment.Callbacks, RhDialogFragment.OnClickListener {
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    private final ActivityResultLauncher<Intent> cryptoAgreementLauncher;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public EventLogger eventLogger;
    private Context loggingContext;
    private final Screen loggingScreen;
    private final ActivityResultLauncher<Intent> verifySuitabilityLauncher;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RewardsOnboardingAssetSelectionParentFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingAssetSelectionParentFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: RewardsOnboardingAssetSelectionParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingAssetSelectionParentFragment$Callbacks;", "", "onAssetSelected", "", "selectedInvestmentTarget", "Lcom/robinhood/recurring/models/db/InvestmentTarget;", "feature-cash-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onAssetSelected(InvestmentTarget selectedInvestmentTarget);
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public RewardsOnboardingAssetSelectionParentFragment() {
        super(C10176R.layout.fragment_rewards_onboarding_stock_selection_parent);
        this.$$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingAssetSelectionParentFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (android.content.Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof RewardsOnboardingAssetSelectionParentFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        this.duxo = OldDuxos.oldDuxo(this, RewardsOnboardingAssetSelectionDuxo.class);
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new ActivityResultCallback() { // from class: com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingAssetSelectionParentFragment$cryptoAgreementLauncher$1
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(ActivityResult it) {
                Intrinsics.checkNotNullParameter(it, "it");
                this.this$0.getDuxo().onReviewCryptoAgreement();
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.cryptoAgreementLauncher = activityResultLauncherRegisterForActivityResult;
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult2 = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new ActivityResultCallback() { // from class: com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingAssetSelectionParentFragment$verifySuitabilityLauncher$1
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(ActivityResult it) {
                Intrinsics.checkNotNullParameter(it, "it");
                this.this$0.getDuxo().onVerifySuitability();
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult2, "registerForActivityResult(...)");
        this.verifySuitabilityLauncher = activityResultLauncherRegisterForActivityResult2;
        this.loggingScreen = new Screen(Screen.Name.ROUNDUP_ASSET_SELECTION, null, null, null, 14, null);
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RewardsOnboardingAssetSelectionDuxo getDuxo() {
        return (RewardsOnboardingAssetSelectionDuxo) this.duxo.getValue();
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

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.loggingContext = RoundupRewardsLoggingUtil.INSTANCE.getOnboardingContext(((Args) INSTANCE.getArgs((Fragment) this)).getAction());
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingAssetSelectionParentFragment.onViewCreated.1
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View v, WindowInsets insets) {
                Intrinsics.checkNotNullParameter(v, "v");
                Intrinsics.checkNotNullParameter(insets, "insets");
                v.setPadding(v.getPaddingLeft(), insets.getSystemWindowInsetTop(), v.getPaddingRight(), v.getPaddingBottom());
                return insets;
            }
        });
        Companion companion = INSTANCE;
        RewardsOnboardingContent brokerageOptionTitle = ((Args) companion.getArgs((Fragment) this)).getBrokerageOptionTitle();
        String strValueOf = String.valueOf(brokerageOptionTitle != null ? brokerageOptionTitle.getTitle() : null);
        RewardsOnboardingContent brokerageOptionTitle2 = ((Args) companion.getArgs((Fragment) this)).getBrokerageOptionTitle();
        String strValueOf2 = String.valueOf(brokerageOptionTitle2 != null ? brokerageOptionTitle2.getContent() : null);
        String string2 = getString(C10176R.string.rewards_asset_selection_header);
        RewardsOnboardingContent brokerageOptionContent = ((Args) companion.getArgs((Fragment) this)).getBrokerageOptionContent();
        String title = brokerageOptionContent != null ? brokerageOptionContent.getTitle() : null;
        RewardsOnboardingContent brokerageOptionContent2 = ((Args) companion.getArgs((Fragment) this)).getBrokerageOptionContent();
        SearchRecurringTopContent.RoundupBrokerageOption roundupBrokerageOption = new SearchRecurringTopContent.RoundupBrokerageOption(string2, title, String.valueOf(brokerageOptionContent2 != null ? brokerageOptionContent2.getContent() : null));
        RewardsOnboardingContent content = ((Args) companion.getArgs((Fragment) this)).getContent();
        Intrinsics.checkNotNull(content);
        RewardsOnboardingContent.Disclosure disclosure = content.getDisclosure();
        Intrinsics.checkNotNull(disclosure);
        CharSequence content2 = disclosure.getContent();
        RewardsOnboardingContent content3 = ((Args) companion.getArgs((Fragment) this)).getContent();
        Intrinsics.checkNotNull(content3);
        RewardsOnboardingContent.Disclosure disclosure2 = content3.getDisclosure();
        Intrinsics.checkNotNull(disclosure2);
        String buttonText = disclosure2.getButtonText();
        Intrinsics.checkNotNull(buttonText);
        RewardsOnboardingContent content4 = ((Args) companion.getArgs((Fragment) this)).getContent();
        Intrinsics.checkNotNull(content4);
        RewardsOnboardingContent.Disclosure disclosure3 = content4.getDisclosure();
        Intrinsics.checkNotNull(disclosure3);
        CharSequence content5 = disclosure3.getContent();
        RewardsOnboardingContent content6 = ((Args) companion.getArgs((Fragment) this)).getContent();
        Intrinsics.checkNotNull(content6);
        RewardsOnboardingContent.Disclosure disclosure4 = content6.getDisclosure();
        Intrinsics.checkNotNull(disclosure4);
        launchSearchFragment(strValueOf, strValueOf2, roundupBrokerageOption, new SearchRecurringOrderFragment.Args.LearnMoreContent(content2, buttonText, content5, disclosure4.getAdditionalData()));
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Context context;
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C102101(this));
        EventLogger eventLogger = getEventLogger();
        Screen screen = this.loggingScreen;
        Context context2 = this.loggingContext;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT);
            context = null;
        } else {
            context = context2;
        }
        EventLogger.DefaultImpls.logScreenAppear$default(eventLogger, null, screen, null, null, context, 13, null);
    }

    /* compiled from: RewardsOnboardingAssetSelectionParentFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingAssetSelectionParentFragment$onStart$1 */
    /* synthetic */ class C102101 extends FunctionReferenceImpl implements Function1<RewardsOnboardingAssetSelectionViewState, Unit> {
        C102101(Object obj) {
            super(1, obj, RewardsOnboardingAssetSelectionParentFragment.class, "bind", "bind(Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingAssetSelectionViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RewardsOnboardingAssetSelectionViewState rewardsOnboardingAssetSelectionViewState) {
            invoke2(rewardsOnboardingAssetSelectionViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(RewardsOnboardingAssetSelectionViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((RewardsOnboardingAssetSelectionParentFragment) this.receiver).bind(p0);
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        EventLogger eventLogger = getEventLogger();
        Screen screen = this.loggingScreen;
        Context context = this.loggingContext;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException(RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT);
            context = null;
        }
        EventLogger.DefaultImpls.logScreenDisappear$default(eventLogger, null, screen, null, null, context, 13, null);
    }

    @Override // com.robinhood.android.common.search.ui.SearchRecurringOrderFragment.Callbacks
    public void onItemSelected(InvestmentTarget selectedInvestmentTarget) {
        Intrinsics.checkNotNullParameter(selectedInvestmentTarget, "selectedInvestmentTarget");
        getDuxo().onAssetSelected(selectedInvestmentTarget);
    }

    @Override // com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingSuitabilityConfirmationFragment.Callbacks
    public void onSuitabilityContinue() {
        getDuxo().onContinueSuitabilitySuccess();
    }

    @Override // com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingCryptoConfirmationFragment.Callbacks
    public void onCryptoAgreementContinue() {
        getDuxo().onContinueCryptoAgreementSuccess();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        Context context;
        Context context2;
        if (id == C10176R.id.dialog_id_rewards_onboarding_crypto_agreement) {
            ActivityResultLauncher<Intent> activityResultLauncher = this.cryptoAgreementLauncher;
            Navigator navigator = getNavigator();
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            activityResultLauncher.launch(Navigator.DefaultImpls.createIntent$default(navigator, contextRequireContext, new CryptoUpgradeIntentKey(false, null, 2, null), null, false, 12, null));
            EventLogger eventLogger = getEventLogger();
            UserInteractionEventData.Action action = UserInteractionEventData.Action.VIEW_CRYPTO_SIGNUP_NOTICE;
            Screen screen = this.loggingScreen;
            Context context3 = this.loggingContext;
            if (context3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT);
                context2 = null;
            } else {
                context2 = context3;
            }
            EventLogger.DefaultImpls.logTap$default(eventLogger, action, screen, null, null, context2, false, 44, null);
            return true;
        }
        if (id == C10176R.id.dialog_id_rewards_onboarding_verify_suitability) {
            ActivityResultLauncher<Intent> activityResultLauncher2 = this.verifySuitabilityLauncher;
            Navigator navigator2 = getNavigator();
            android.content.Context contextRequireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
            activityResultLauncher2.launch(Navigator.DefaultImpls.createIntent$default(navigator2, contextRequireContext2, new Questionnaire(true, QuestionnaireContexts.SUITABILITY, null, null, null, null, false, false, false, false, false, null, null, false, false, false, false, false, null, null, 1048568, null), null, false, 12, null));
            EventLogger eventLogger2 = getEventLogger();
            UserInteractionEventData.Action action2 = UserInteractionEventData.Action.VIEW_SUITABILITY_NOTICE;
            Screen screen2 = this.loggingScreen;
            Context context4 = this.loggingContext;
            if (context4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT);
                context = null;
            } else {
                context = context4;
            }
            EventLogger.DefaultImpls.logTap$default(eventLogger2, action2, screen2, null, null, context, false, 44, null);
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onNegativeButtonClicked(int id, Bundle passthroughArgs) {
        Context context;
        Context context2;
        if (id == C10176R.id.dialog_id_rewards_onboarding_crypto_agreement) {
            EventLogger eventLogger = getEventLogger();
            UserInteractionEventData.Action action = UserInteractionEventData.Action.VIEW_CRYPTO_SIGNUP_NOTICE;
            Screen screen = this.loggingScreen;
            Context context3 = this.loggingContext;
            if (context3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT);
                context2 = null;
            } else {
                context2 = context3;
            }
            EventLogger.DefaultImpls.logDisappear$default(eventLogger, action, screen, null, null, context2, 12, null);
        } else if (id == C10176R.id.dialog_id_rewards_onboarding_verify_suitability) {
            EventLogger eventLogger2 = getEventLogger();
            UserInteractionEventData.Action action2 = UserInteractionEventData.Action.VIEW_SUITABILITY_NOTICE;
            Screen screen2 = this.loggingScreen;
            Context context4 = this.loggingContext;
            if (context4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT);
                context = null;
            } else {
                context = context4;
            }
            EventLogger.DefaultImpls.logDisappear$default(eventLogger2, action2, screen2, null, null, context, 12, null);
        }
        return super.onNegativeButtonClicked(id, passthroughArgs);
    }

    static /* synthetic */ void launchSearchFragment$default(RewardsOnboardingAssetSelectionParentFragment rewardsOnboardingAssetSelectionParentFragment, String str, String str2, SearchRecurringTopContent searchRecurringTopContent, SearchRecurringOrderFragment.Args.LearnMoreContent learnMoreContent, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            searchRecurringTopContent = null;
        }
        if ((i & 8) != 0) {
            learnMoreContent = null;
        }
        rewardsOnboardingAssetSelectionParentFragment.launchSearchFragment(str, str2, searchRecurringTopContent, learnMoreContent);
    }

    private final void launchSearchFragment(String titleText, String titleSubtext, SearchRecurringTopContent topContent, SearchRecurringOrderFragment.Args.LearnMoreContent learnMoreContent) {
        replaceFragmentWithoutBackStack(SearchRecurringOrderFragment.INSTANCE.newInstance((Parcelable) new SearchRecurringOrderFragment.Args(false, false, false, C10176R.string.rewards_onboarding_asset_selection, learnMoreContent, false, titleText, titleSubtext, topContent, 33, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(RewardsOnboardingAssetSelectionViewState state) {
        Context context;
        Context context2;
        UiEvent<InvestmentTarget> showSuitabilitySuccessEvent = state.getShowSuitabilitySuccessEvent();
        if (showSuitabilitySuccessEvent != null) {
            showSuitabilitySuccessEvent.consumeWith(new Function1() { // from class: com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingAssetSelectionParentFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RewardsOnboardingAssetSelectionParentFragment.bind$lambda$0(this.f$0, (InvestmentTarget) obj);
                }
            });
        }
        UiEvent<InvestmentTarget> showCryptoSuccessEvent = state.getShowCryptoSuccessEvent();
        if (showCryptoSuccessEvent != null) {
            showCryptoSuccessEvent.consumeWith(new Function1() { // from class: com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingAssetSelectionParentFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RewardsOnboardingAssetSelectionParentFragment.bind$lambda$1(this.f$0, (InvestmentTarget) obj);
                }
            });
        }
        UiEvent<InvestmentTarget> proceedToConfirmationEvent = state.getProceedToConfirmationEvent();
        if (proceedToConfirmationEvent != null) {
            proceedToConfirmationEvent.consumeWith(new Function1() { // from class: com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingAssetSelectionParentFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RewardsOnboardingAssetSelectionParentFragment.bind$lambda$2(this.f$0, (InvestmentTarget) obj);
                }
            });
        }
        UiEvent<Unit> shouldShowCryptoAgreementEvent = state.getShouldShowCryptoAgreementEvent();
        if ((shouldShowCryptoAgreementEvent != null ? shouldShowCryptoAgreementEvent.consume() : null) != null) {
            RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            RhDialogFragment.Builder negativeButton = companion.create(contextRequireContext).setTheme(C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Monochrome).setId(C10176R.id.dialog_id_rewards_onboarding_crypto_agreement).setTitle(C10176R.string.rewards_onboarding_crypto_agreement_dialog_title, new Object[0]).setMessage(C10176R.string.rewards_onboarding_crypto_agreement_dialog_message, new Object[0]).setPositiveButton(C10176R.string.rewards_onboarding_review_agreement, new Object[0]).setNegativeButton(C11048R.string.general_label_dismiss, new Object[0]);
            FragmentManager parentFragmentManager = getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
            RhDialogFragment.Builder.show$default(negativeButton, parentFragmentManager, "showCryptoAgreement", false, 4, null);
            EventLogger eventLogger = getEventLogger();
            UserInteractionEventData.Action action = UserInteractionEventData.Action.VIEW_CRYPTO_SIGNUP_NOTICE;
            Screen screen = this.loggingScreen;
            Context context3 = this.loggingContext;
            if (context3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT);
                context2 = null;
            } else {
                context2 = context3;
            }
            EventLogger.DefaultImpls.logAppear$default(eventLogger, action, screen, null, null, context2, 12, null);
        }
        UiEvent<Unit> shouldVerifySuitabilityEvent = state.getShouldVerifySuitabilityEvent();
        if ((shouldVerifySuitabilityEvent != null ? shouldVerifySuitabilityEvent.consume() : null) != null) {
            RhDialogFragment.Companion companion2 = RhDialogFragment.INSTANCE;
            android.content.Context contextRequireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
            RhDialogFragment.Builder negativeButton2 = companion2.create(contextRequireContext2).setTheme(C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Monochrome).setId(C10176R.id.dialog_id_rewards_onboarding_verify_suitability).setTitle(C10176R.string.rewards_onboarding_suitability_dialog_title, new Object[0]).setMessage(C10176R.string.rewards_onboarding_suitability_dialog_message, new Object[0]).setPositiveButton(C11048R.string.general_label_continue, new Object[0]).setNegativeButton(C11048R.string.general_label_dismiss, new Object[0]);
            FragmentManager parentFragmentManager2 = getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager2, "getParentFragmentManager(...)");
            RhDialogFragment.Builder.show$default(negativeButton2, parentFragmentManager2, "verifySuitability", false, 4, null);
            EventLogger eventLogger2 = getEventLogger();
            UserInteractionEventData.Action action2 = UserInteractionEventData.Action.VIEW_SUITABILITY_NOTICE;
            Screen screen2 = this.loggingScreen;
            Context context4 = this.loggingContext;
            if (context4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT);
                context = null;
            } else {
                context = context4;
            }
            EventLogger.DefaultImpls.logAppear$default(eventLogger2, action2, screen2, null, null, context, 12, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$0(RewardsOnboardingAssetSelectionParentFragment rewardsOnboardingAssetSelectionParentFragment, InvestmentTarget investmentTarget) {
        Intrinsics.checkNotNullParameter(investmentTarget, "investmentTarget");
        rewardsOnboardingAssetSelectionParentFragment.replaceFragment(rewardsOnboardingAssetSelectionParentFragment.createSuitabilityConfirmationFragment(investmentTarget));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$1(RewardsOnboardingAssetSelectionParentFragment rewardsOnboardingAssetSelectionParentFragment, InvestmentTarget investmentTarget) {
        Intrinsics.checkNotNullParameter(investmentTarget, "investmentTarget");
        rewardsOnboardingAssetSelectionParentFragment.replaceFragment(rewardsOnboardingAssetSelectionParentFragment.createCryptoConfirmationFragment(investmentTarget));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$2(RewardsOnboardingAssetSelectionParentFragment rewardsOnboardingAssetSelectionParentFragment, InvestmentTarget investmentTarget) {
        Intrinsics.checkNotNullParameter(investmentTarget, "investmentTarget");
        rewardsOnboardingAssetSelectionParentFragment.getCallbacks().onAssetSelected(investmentTarget);
        return Unit.INSTANCE;
    }

    private final RewardsOnboardingCryptoConfirmationFragment createCryptoConfirmationFragment(InvestmentTarget investmentTarget) {
        investmentTarget.isCrypto();
        return (RewardsOnboardingCryptoConfirmationFragment) RewardsOnboardingCryptoConfirmationFragment.INSTANCE.newInstance((Parcelable) new RewardsOnboardingCryptoConfirmationFragment.Args(investmentTarget.getInstrumentSymbol()));
    }

    private final RewardsOnboardingSuitabilityConfirmationFragment createSuitabilityConfirmationFragment(InvestmentTarget investmentTarget) {
        investmentTarget.isCrypto();
        return (RewardsOnboardingSuitabilityConfirmationFragment) RewardsOnboardingSuitabilityConfirmationFragment.INSTANCE.newInstance((Parcelable) new RewardsOnboardingSuitabilityConfirmationFragment.Args(investmentTarget.getInstrumentSymbol()));
    }

    /* compiled from: RewardsOnboardingAssetSelectionParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003JC\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u001bHÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001J\u0016\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingAssetSelectionParentFragment$Args;", "Landroid/os/Parcelable;", "action", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$RewardsOnboarding$Action;", "content", "Lcom/robinhood/android/cash/rewards/ui/onboarding/content/RewardsOnboardingContent;", "brokerageOptionTitle", "brokerageOptionContent", "apy", "", "<init>", "(Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$RewardsOnboarding$Action;Lcom/robinhood/android/cash/rewards/ui/onboarding/content/RewardsOnboardingContent;Lcom/robinhood/android/cash/rewards/ui/onboarding/content/RewardsOnboardingContent;Lcom/robinhood/android/cash/rewards/ui/onboarding/content/RewardsOnboardingContent;Ljava/lang/CharSequence;)V", "getAction", "()Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$RewardsOnboarding$Action;", "getContent", "()Lcom/robinhood/android/cash/rewards/ui/onboarding/content/RewardsOnboardingContent;", "getBrokerageOptionTitle", "getBrokerageOptionContent", "getApy", "()Ljava/lang/CharSequence;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-cash-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final LegacyIntentKey.RewardsOnboarding.Action action;
        private final CharSequence apy;
        private final RewardsOnboardingContent brokerageOptionContent;
        private final RewardsOnboardingContent brokerageOptionTitle;
        private final RewardsOnboardingContent content;

        /* compiled from: RewardsOnboardingAssetSelectionParentFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(LegacyIntentKey.RewardsOnboarding.Action.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : RewardsOnboardingContent.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : RewardsOnboardingContent.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? RewardsOnboardingContent.CREATOR.createFromParcel(parcel) : null, (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, LegacyIntentKey.RewardsOnboarding.Action action, RewardsOnboardingContent rewardsOnboardingContent, RewardsOnboardingContent rewardsOnboardingContent2, RewardsOnboardingContent rewardsOnboardingContent3, CharSequence charSequence, int i, Object obj) {
            if ((i & 1) != 0) {
                action = args.action;
            }
            if ((i & 2) != 0) {
                rewardsOnboardingContent = args.content;
            }
            if ((i & 4) != 0) {
                rewardsOnboardingContent2 = args.brokerageOptionTitle;
            }
            if ((i & 8) != 0) {
                rewardsOnboardingContent3 = args.brokerageOptionContent;
            }
            if ((i & 16) != 0) {
                charSequence = args.apy;
            }
            CharSequence charSequence2 = charSequence;
            RewardsOnboardingContent rewardsOnboardingContent4 = rewardsOnboardingContent2;
            return args.copy(action, rewardsOnboardingContent, rewardsOnboardingContent4, rewardsOnboardingContent3, charSequence2);
        }

        /* renamed from: component1, reason: from getter */
        public final LegacyIntentKey.RewardsOnboarding.Action getAction() {
            return this.action;
        }

        /* renamed from: component2, reason: from getter */
        public final RewardsOnboardingContent getContent() {
            return this.content;
        }

        /* renamed from: component3, reason: from getter */
        public final RewardsOnboardingContent getBrokerageOptionTitle() {
            return this.brokerageOptionTitle;
        }

        /* renamed from: component4, reason: from getter */
        public final RewardsOnboardingContent getBrokerageOptionContent() {
            return this.brokerageOptionContent;
        }

        /* renamed from: component5, reason: from getter */
        public final CharSequence getApy() {
            return this.apy;
        }

        public final Args copy(LegacyIntentKey.RewardsOnboarding.Action action, RewardsOnboardingContent content, RewardsOnboardingContent brokerageOptionTitle, RewardsOnboardingContent brokerageOptionContent, CharSequence apy) {
            Intrinsics.checkNotNullParameter(action, "action");
            return new Args(action, content, brokerageOptionTitle, brokerageOptionContent, apy);
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
            return this.action == args.action && Intrinsics.areEqual(this.content, args.content) && Intrinsics.areEqual(this.brokerageOptionTitle, args.brokerageOptionTitle) && Intrinsics.areEqual(this.brokerageOptionContent, args.brokerageOptionContent) && Intrinsics.areEqual(this.apy, args.apy);
        }

        public int hashCode() {
            int iHashCode = this.action.hashCode() * 31;
            RewardsOnboardingContent rewardsOnboardingContent = this.content;
            int iHashCode2 = (iHashCode + (rewardsOnboardingContent == null ? 0 : rewardsOnboardingContent.hashCode())) * 31;
            RewardsOnboardingContent rewardsOnboardingContent2 = this.brokerageOptionTitle;
            int iHashCode3 = (iHashCode2 + (rewardsOnboardingContent2 == null ? 0 : rewardsOnboardingContent2.hashCode())) * 31;
            RewardsOnboardingContent rewardsOnboardingContent3 = this.brokerageOptionContent;
            int iHashCode4 = (iHashCode3 + (rewardsOnboardingContent3 == null ? 0 : rewardsOnboardingContent3.hashCode())) * 31;
            CharSequence charSequence = this.apy;
            return iHashCode4 + (charSequence != null ? charSequence.hashCode() : 0);
        }

        public String toString() {
            return "Args(action=" + this.action + ", content=" + this.content + ", brokerageOptionTitle=" + this.brokerageOptionTitle + ", brokerageOptionContent=" + this.brokerageOptionContent + ", apy=" + ((Object) this.apy) + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.action.name());
            RewardsOnboardingContent rewardsOnboardingContent = this.content;
            if (rewardsOnboardingContent == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                rewardsOnboardingContent.writeToParcel(dest, flags);
            }
            RewardsOnboardingContent rewardsOnboardingContent2 = this.brokerageOptionTitle;
            if (rewardsOnboardingContent2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                rewardsOnboardingContent2.writeToParcel(dest, flags);
            }
            RewardsOnboardingContent rewardsOnboardingContent3 = this.brokerageOptionContent;
            if (rewardsOnboardingContent3 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                rewardsOnboardingContent3.writeToParcel(dest, flags);
            }
            TextUtils.writeToParcel(this.apy, dest, flags);
        }

        public Args(LegacyIntentKey.RewardsOnboarding.Action action, RewardsOnboardingContent rewardsOnboardingContent, RewardsOnboardingContent rewardsOnboardingContent2, RewardsOnboardingContent rewardsOnboardingContent3, CharSequence charSequence) {
            Intrinsics.checkNotNullParameter(action, "action");
            this.action = action;
            this.content = rewardsOnboardingContent;
            this.brokerageOptionTitle = rewardsOnboardingContent2;
            this.brokerageOptionContent = rewardsOnboardingContent3;
            this.apy = charSequence;
        }

        public /* synthetic */ Args(LegacyIntentKey.RewardsOnboarding.Action action, RewardsOnboardingContent rewardsOnboardingContent, RewardsOnboardingContent rewardsOnboardingContent2, RewardsOnboardingContent rewardsOnboardingContent3, CharSequence charSequence, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(action, rewardsOnboardingContent, (i & 4) != 0 ? null : rewardsOnboardingContent2, (i & 8) != 0 ? null : rewardsOnboardingContent3, (i & 16) != 0 ? null : charSequence);
        }

        public final LegacyIntentKey.RewardsOnboarding.Action getAction() {
            return this.action;
        }

        public final RewardsOnboardingContent getContent() {
            return this.content;
        }

        public final RewardsOnboardingContent getBrokerageOptionTitle() {
            return this.brokerageOptionTitle;
        }

        public final RewardsOnboardingContent getBrokerageOptionContent() {
            return this.brokerageOptionContent;
        }

        public final CharSequence getApy() {
            return this.apy;
        }
    }

    /* compiled from: RewardsOnboardingAssetSelectionParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingAssetSelectionParentFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingAssetSelectionParentFragment;", "Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingAssetSelectionParentFragment$Args;", "<init>", "()V", "feature-cash-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<RewardsOnboardingAssetSelectionParentFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(RewardsOnboardingAssetSelectionParentFragment rewardsOnboardingAssetSelectionParentFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, rewardsOnboardingAssetSelectionParentFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public RewardsOnboardingAssetSelectionParentFragment newInstance(Args args) {
            return (RewardsOnboardingAssetSelectionParentFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(RewardsOnboardingAssetSelectionParentFragment rewardsOnboardingAssetSelectionParentFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, rewardsOnboardingAssetSelectionParentFragment, args);
        }
    }
}
