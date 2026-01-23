package com.robinhood.android.optionsupgrade;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.home.contracts.HomeDashboardType;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.extensions.Navigators3;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.options.contracts.OptionOnboarding;
import com.robinhood.android.optionsupgrade.OptionOnboardingScreens;
import com.robinhood.android.optionsupgrade.ScreenArgs;
import com.robinhood.android.optionsupgrade.ScreenRequest;
import com.robinhood.android.optionsupgrade.databinding.FragmentOptionUpgradeDeniedBinding;
import com.robinhood.android.questionnaire.p219db.QuestionnaireContexts;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.home.contracts.TabLinkIntentKey;
import com.robinhood.shared.questionnaire.contracts.InvestmentProfileSettings;
import com.robinhood.utils.extensions.StringsKt;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import options_product.service.FailureRequestMetadataDto;
import options_product.service.FailureResponseMetadataDto;

/* compiled from: OptionOnboardingFailureFragment.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 22\u00020\u00012\u00020\u00022\u00020\u0003:\u000212B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0010\u0010!\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020#H\u0016J\u001a\u0010$\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J\b\u0010)\u001a\u00020\u001cH\u0002J\b\u0010*\u001a\u00020\u001cH\u0002J\t\u0010+\u001a\u00020\u001eH\u0096\u0001R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001b\u0010\f\u001a\u00020\r8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0011\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010,\u001a\b\u0012\u0004\u0012\u00020.0-X\u0096\u0005¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00063"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/OptionOnboardingFailureFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingScreen;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "callbacks", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingScreenCallback;", "getCallbacks", "()Lcom/robinhood/android/optionsupgrade/OptionOnboardingScreenCallback;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "screenArgs", "Lcom/robinhood/android/optionsupgrade/ScreenArgs;", "getScreenArgs", "()Lcom/robinhood/android/optionsupgrade/ScreenArgs;", "binding", "Lcom/robinhood/android/optionsupgrade/databinding/FragmentOptionUpgradeDeniedBinding;", "getBinding", "()Lcom/robinhood/android/optionsupgrade/databinding/FragmentOptionUpgradeDeniedBinding;", "binding$delegate", "setLoading", "", "isLoading", "", "currentScreenRequest", "Lcom/robinhood/android/optionsupgrade/ScreenRequest;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "showEditInvestmentProfile", "exitToJointAccountDashboard", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Args", "Companion", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionOnboardingFailureFragment extends BaseFragment implements RegionGated, OptionOnboardingScreens {
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    public EventLogger eventLogger;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(OptionOnboardingFailureFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/optionsupgrade/OptionOnboardingScreenCallback;", 0)), Reflection.property1(new PropertyReference1Impl(OptionOnboardingFailureFragment.class, "binding", "getBinding()Lcom/robinhood/android/optionsupgrade/databinding/FragmentOptionUpgradeDeniedBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: OptionOnboardingFailureFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FailureResponseMetadataDto.FailureTypeDto.values().length];
            try {
                iArr[FailureResponseMetadataDto.FailureTypeDto.FAILURE_UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FailureResponseMetadataDto.FailureTypeDto.PENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FailureResponseMetadataDto.FailureTypeDto.PROFESSIONAL_TRADER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FailureResponseMetadataDto.FailureTypeDto.HARD_REJECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[FailureResponseMetadataDto.FailureTypeDto.NOT_SUITABLE_V2.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[FailureResponseMetadataDto.FailureTypeDto.JA_NOT_ELIGIBLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[FailureResponseMetadataDto.FailureTypeDto.JA_L2_NOT_ELIGIBLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[FailureResponseMetadataDto.FailureTypeDto.JA_COOWNER_MANUAL_REVIEW.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[FailureResponseMetadataDto.FailureTypeDto.IN_REVIEW_NO_ACTION.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[FailureResponseMetadataDto.FailureTypeDto.NOT_SUITABLE_RETRY_AVAILABLE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[FailureResponseMetadataDto.FailureTypeDto.MANUAL_REVIEW_L2.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[FailureResponseMetadataDto.FailureTypeDto.MANUAL_REVIEW_L3.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[FailureResponseMetadataDto.FailureTypeDto.JA_MANUAL_REVIEW.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[FailureResponseMetadataDto.FailureTypeDto.JA_L2_MANUAL_REVIEW.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[FailureResponseMetadataDto.FailureTypeDto.JA_BOTH_MANUAL_REVIEW.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[FailureResponseMetadataDto.FailureTypeDto.JA_BOTH_L2_MANUAL_REVIEW.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[FailureResponseMetadataDto.FailureTypeDto.NOT_SUITABLE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[FailureResponseMetadataDto.FailureTypeDto.L2_TO_L3_FAILURE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[FailureResponseMetadataDto.FailureTypeDto.NOT_SUITABLE_IP.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[FailureResponseMetadataDto.FailureTypeDto.RHSG_CAR_FAILURE_RETRY_AVAILABLE.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
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

    @Override // com.robinhood.android.optionsupgrade.OptionOnboardingScreens, com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return OptionOnboardingScreens.DefaultImpls.getEventScreen(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenAppearEventLogging() {
        return OptionOnboardingScreens.DefaultImpls.getExcludeFromAutoScreenAppearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenDisappearEventLogging() {
        return OptionOnboardingScreens.DefaultImpls.getExcludeFromAutoScreenDisappearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenEventLogging() {
        return OptionOnboardingScreens.DefaultImpls.getExcludeFromAutoScreenEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenSourceEventLogging() {
        return OptionOnboardingScreens.DefaultImpls.getExcludeFromAutoScreenSourceEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Component getScreenEventComponent() {
        return OptionOnboardingScreens.DefaultImpls.getScreenEventComponent(this);
    }

    @Override // com.robinhood.android.optionsupgrade.OptionOnboardingScreens, com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Context getScreenEventContext() {
        return OptionOnboardingScreens.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return OptionOnboardingScreens.DefaultImpls.getScreenEventData(this);
    }

    public OptionOnboardingFailureFragment() {
        super(C25121R.layout.fragment_option_upgrade_denied);
        this.$$delegate_0 = new RegionGated2(OptionsRegionGate.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(OptionOnboardingScreens2.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingFailureFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (android.content.Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof OptionOnboardingScreens2) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        this.binding = ViewBinding5.viewBinding(this, OptionOnboardingFailureFragment2.INSTANCE);
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

    @Override // com.robinhood.android.optionsupgrade.OptionOnboardingScreens
    public OptionOnboardingScreens2 getCallbacks() {
        return (OptionOnboardingScreens2) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.optionsupgrade.OptionOnboardingScreens
    public ScreenArgs getScreenArgs() {
        return ((Args) INSTANCE.getArgs((Fragment) this)).getScreenArgs();
    }

    private final FragmentOptionUpgradeDeniedBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[1]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentOptionUpgradeDeniedBinding) value;
    }

    @Override // com.robinhood.android.optionsupgrade.OptionOnboardingScreens
    public void setLoading(boolean isLoading, ScreenRequest currentScreenRequest) {
        Intrinsics.checkNotNullParameter(currentScreenRequest, "currentScreenRequest");
        if (OptionOnboardingFailureFragment3.showLoadingSpinnerOnNegativeButton(((Args) INSTANCE.getArgs((Fragment) this)).getScreenArgs().getFailureType())) {
            getBinding().negativeBtn.setLoading(isLoading);
        } else {
            getBinding().positiveBtn.setLoading(isLoading);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setTitle((CharSequence) null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (!isInTabFragment()) {
            ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        }
        getBinding().optionUpgradeStatusImg.setImageResource(C25121R.drawable.svg_options_upgrade_failure);
        RhTextView rhTextView = getBinding().optionUpgradeStatusTitleTxt;
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        Companion companion = INSTANCE;
        rhTextView.setText(OptionOnboardingFailureFragment3.getFailureTitle(resources, ((Args) companion.getArgs((Fragment) this)).getScreenArgs().getFailureType()));
        RhTextView rhTextView2 = getBinding().optionUpgradeStatusDetailTxt;
        Resources resources2 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        rhTextView2.setText(OptionOnboardingFailureFragment3.getFailureMessage(resources2, ((Args) companion.getArgs((Fragment) this)).getScreenArgs().getFailureType(), ((Args) companion.getArgs((Fragment) this)).getScreenArgs().getMessageOverride(), ((Args) companion.getArgs((Fragment) this)).getLocality()));
        getBinding().optionUpgradeStatusDetailTxt.onLinkClick(new Function1() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingFailureFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(OptionOnboardingFailureFragment.onViewCreated$lambda$0(this.f$0, (String) obj));
            }
        });
        RdsButton rdsButton = getBinding().positiveBtn;
        Resources resources3 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
        rdsButton.setText(OptionOnboardingFailureFragment3.getFailurePositiveButtonText(resources3, ((Args) companion.getArgs((Fragment) this)).getScreenArgs().getFailureType(), ((Args) companion.getArgs((Fragment) this)).getScreenArgs().getPrimaryCtaMessageOverride(), ((Args) companion.getArgs((Fragment) this)).getLocality(), ((Args) companion.getArgs((Fragment) this)).getSource()));
        RdsButton negativeBtn = getBinding().negativeBtn;
        Intrinsics.checkNotNullExpressionValue(negativeBtn, "negativeBtn");
        Resources resources4 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources4, "getResources(...)");
        TextViewsKt.setVisibilityText(negativeBtn, OptionOnboardingFailureFragment3.getFailureNegativeButtonText(resources4, ((Args) companion.getArgs((Fragment) this)).getScreenArgs().getFailureType(), ((Args) companion.getArgs((Fragment) this)).getLocality(), ((Args) companion.getArgs((Fragment) this)).getSource()));
        RdsButton positiveBtn = getBinding().positiveBtn;
        Intrinsics.checkNotNullExpressionValue(positiveBtn, "positiveBtn");
        OnClickListeners.onClick(positiveBtn, new Function0() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingFailureFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionOnboardingFailureFragment.onViewCreated$lambda$1(this.f$0);
            }
        });
        RdsButton negativeBtn2 = getBinding().negativeBtn;
        Intrinsics.checkNotNullExpressionValue(negativeBtn2, "negativeBtn");
        OnClickListeners.onClick(negativeBtn2, new Function0() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingFailureFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionOnboardingFailureFragment.onViewCreated$lambda$2(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onViewCreated$lambda$0(OptionOnboardingFailureFragment optionOnboardingFailureFragment, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (StringsKt.isLearnUrl(url) || StringsKt.isHelpCenterUrl(url)) {
            Navigator navigator = optionOnboardingFailureFragment.getNavigator();
            android.content.Context contextRequireContext = optionOnboardingFailureFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigators3.showHelpCenterWebViewFragment(navigator, contextRequireContext, url);
            return true;
        }
        WebUtils.viewUrl$default(optionOnboardingFailureFragment.requireContext(), url, 0, 4, (Object) null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(OptionOnboardingFailureFragment optionOnboardingFailureFragment) {
        Companion companion = INSTANCE;
        switch (WhenMappings.$EnumSwitchMapping$0[((Args) companion.getArgs((Fragment) optionOnboardingFailureFragment)).getScreenArgs().getFailureType().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                optionOnboardingFailureFragment.getCallbacks().goToNextScreen(new ScreenRequest.Failure(FailureRequestMetadataDto.FailureContextDto.FAILURE_CONTEXT_UNSPECIFIED, ((Args) companion.getArgs((Fragment) optionOnboardingFailureFragment)).getScreenArgs().getScreenId()), ((Args) companion.getArgs((Fragment) optionOnboardingFailureFragment)).getScreenArgs());
                break;
            case 10:
                optionOnboardingFailureFragment.getCallbacks().goToNextScreen(new ScreenRequest.Failure(FailureRequestMetadataDto.FailureContextDto.FAILURE_CONTEXT_UK_KNOWLEDGE_TEST_RETRY, ((Args) companion.getArgs((Fragment) optionOnboardingFailureFragment)).getScreenArgs().getScreenId()), ((Args) companion.getArgs((Fragment) optionOnboardingFailureFragment)).getScreenArgs());
                break;
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                OptionOnboardingLoggings.logOptionOnboardingActionTap(optionOnboardingFailureFragment.getEventLogger(), UserInteractionEventData.Action.REQUEST_CX_CALL, ((Args) companion.getArgs((Fragment) optionOnboardingFailureFragment)).getScreenArgs(), optionOnboardingFailureFragment.getCallbacks().getOptionOnboardingScreenContext());
                String primaryCtaDeeplinkAction = ((Args) companion.getArgs((Fragment) optionOnboardingFailureFragment)).getScreenArgs().getPrimaryCtaDeeplinkAction();
                if (primaryCtaDeeplinkAction == null) {
                    if (Intrinsics.areEqual(((Args) companion.getArgs((Fragment) optionOnboardingFailureFragment)).getLocality(), CountryCode.Supported.UnitedKingdom.INSTANCE) || ((Args) companion.getArgs((Fragment) optionOnboardingFailureFragment)).getLocality().isRhsg()) {
                        primaryCtaDeeplinkAction = "1923";
                    } else {
                        primaryCtaDeeplinkAction = "2039";
                    }
                }
                String str = primaryCtaDeeplinkAction;
                Navigator navigator = optionOnboardingFailureFragment.getNavigator();
                android.content.Context contextRequireContext = optionOnboardingFailureFragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                Navigators3.showContactSupportTriageFragment$default(navigator, contextRequireContext, str, false, 4, null);
                break;
            case 17:
                String string2 = optionOnboardingFailureFragment.getString(C25121R.string.options_upgrade_options_knowledge_center_url);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                Navigator navigator2 = optionOnboardingFailureFragment.getNavigator();
                android.content.Context contextRequireContext2 = optionOnboardingFailureFragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                Navigators3.showHelpCenterWebViewFragment(navigator2, contextRequireContext2, string2);
                break;
            case 18:
                optionOnboardingFailureFragment.showEditInvestmentProfile();
                break;
            case 19:
                if (Intrinsics.areEqual(((Args) companion.getArgs((Fragment) optionOnboardingFailureFragment)).getLocality(), CountryCode.Supported.UnitedKingdom.INSTANCE)) {
                    optionOnboardingFailureFragment.getCallbacks().goToNextScreen(new ScreenRequest.Failure(FailureRequestMetadataDto.FailureContextDto.FAILURE_CONTEXT_NOT_SUITABLE_IP, ((Args) companion.getArgs((Fragment) optionOnboardingFailureFragment)).getScreenArgs().getScreenId()), ((Args) companion.getArgs((Fragment) optionOnboardingFailureFragment)).getScreenArgs());
                    break;
                } else {
                    optionOnboardingFailureFragment.showEditInvestmentProfile();
                    break;
                }
            case 20:
                optionOnboardingFailureFragment.getCallbacks().goToNextScreen(new ScreenRequest.Failure(FailureRequestMetadataDto.FailureContextDto.FAILURE_CONTEXT_RHSG_CAR_RETRY, ((Args) companion.getArgs((Fragment) optionOnboardingFailureFragment)).getScreenArgs().getScreenId()), ((Args) companion.getArgs((Fragment) optionOnboardingFailureFragment)).getScreenArgs());
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2(OptionOnboardingFailureFragment optionOnboardingFailureFragment) {
        Companion companion = INSTANCE;
        switch (WhenMappings.$EnumSwitchMapping$0[((Args) companion.getArgs((Fragment) optionOnboardingFailureFragment)).getScreenArgs().getFailureType().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 9:
                break;
            case 6:
            case 7:
            case 8:
                if (((Args) companion.getArgs((Fragment) optionOnboardingFailureFragment)).getSource().isFromAcatsJointAccount()) {
                    optionOnboardingFailureFragment.exitToJointAccountDashboard();
                    break;
                }
                break;
            case 10:
            case 19:
            case 20:
                optionOnboardingFailureFragment.requireActivity().finish();
                break;
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                optionOnboardingFailureFragment.getCallbacks().goToNextScreen(new ScreenRequest.Failure(FailureRequestMetadataDto.FailureContextDto.FAILURE_CONTEXT_UNSPECIFIED, ((Args) companion.getArgs((Fragment) optionOnboardingFailureFragment)).getScreenArgs().getScreenId()), ((Args) companion.getArgs((Fragment) optionOnboardingFailureFragment)).getScreenArgs());
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }

    private final void showEditInvestmentProfile() {
        OptionOnboardingLoggings.logOptionOnboardingActionTap(getEventLogger(), UserInteractionEventData.Action.EDIT_INVESTMENT_PROFILE, ((Args) INSTANCE.getArgs((Fragment) this)).getScreenArgs(), getCallbacks().getOptionOnboardingScreenContext());
        Navigator navigator = getNavigator();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, contextRequireContext, new InvestmentProfileSettings(QuestionnaireContexts.SUITABILITY, null, null, false, false, false, null, false, false, false, false, null, null, 8166, null), false, false, false, false, null, false, null, null, 1012, null);
    }

    private final void exitToJointAccountDashboard() {
        IntentKey dashboard;
        Navigator navigator = getNavigator();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        String accountNumber = ((Args) INSTANCE.getArgs((Fragment) this)).getAccountNumber();
        if (accountNumber != null) {
            dashboard = new TabLinkIntentKey.Home.Dashboard(new HomeDashboardType.Account(accountNumber));
        } else {
            dashboard = TabLinkIntentKey.Home.Legacy.INSTANCE;
        }
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, dashboard, null, true, null, null, 52, null);
    }

    /* compiled from: OptionOnboardingFailureFragment.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B)\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0003J3\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u001bHÖ\u0001J\t\u0010!\u001a\u00020\nHÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/OptionOnboardingFailureFragment$Args;", "Landroid/os/Parcelable;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "locality", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "screenArgs", "Lcom/robinhood/android/optionsupgrade/ScreenArgs$Failure;", "source", "Lcom/robinhood/android/options/contracts/OptionOnboarding$OptionOnboardingSource;", "accountNumber", "", "<init>", "(Lcom/robinhood/iso/countrycode/CountryCode$Supported;Lcom/robinhood/android/optionsupgrade/ScreenArgs$Failure;Lcom/robinhood/android/options/contracts/OptionOnboarding$OptionOnboardingSource;Ljava/lang/String;)V", "getLocality", "()Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "getScreenArgs", "()Lcom/robinhood/android/optionsupgrade/ScreenArgs$Failure;", "getSource", "()Lcom/robinhood/android/options/contracts/OptionOnboarding$OptionOnboardingSource;", "getAccountNumber", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable, FragmentKey {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String accountNumber;
        private final CountryCode.Supported locality;
        private final ScreenArgs.Failure screenArgs;
        private final OptionOnboarding.OptionOnboardingSource source;

        /* compiled from: OptionOnboardingFailureFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((CountryCode.Supported) parcel.readSerializable(), ScreenArgs.Failure.CREATOR.createFromParcel(parcel), (OptionOnboarding.OptionOnboardingSource) parcel.readParcelable(Args.class.getClassLoader()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, CountryCode.Supported supported, ScreenArgs.Failure failure, OptionOnboarding.OptionOnboardingSource optionOnboardingSource, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                supported = args.locality;
            }
            if ((i & 2) != 0) {
                failure = args.screenArgs;
            }
            if ((i & 4) != 0) {
                optionOnboardingSource = args.source;
            }
            if ((i & 8) != 0) {
                str = args.accountNumber;
            }
            return args.copy(supported, failure, optionOnboardingSource, str);
        }

        /* renamed from: component1, reason: from getter */
        public final CountryCode.Supported getLocality() {
            return this.locality;
        }

        /* renamed from: component2, reason: from getter */
        public final ScreenArgs.Failure getScreenArgs() {
            return this.screenArgs;
        }

        /* renamed from: component3, reason: from getter */
        public final OptionOnboarding.OptionOnboardingSource getSource() {
            return this.source;
        }

        /* renamed from: component4, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final Args copy(CountryCode.Supported locality, ScreenArgs.Failure screenArgs, OptionOnboarding.OptionOnboardingSource source, String accountNumber) {
            Intrinsics.checkNotNullParameter(locality, "locality");
            Intrinsics.checkNotNullParameter(screenArgs, "screenArgs");
            Intrinsics.checkNotNullParameter(source, "source");
            return new Args(locality, screenArgs, source, accountNumber);
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
            return Intrinsics.areEqual(this.locality, args.locality) && Intrinsics.areEqual(this.screenArgs, args.screenArgs) && Intrinsics.areEqual(this.source, args.source) && Intrinsics.areEqual(this.accountNumber, args.accountNumber);
        }

        public int hashCode() {
            int iHashCode = ((((this.locality.hashCode() * 31) + this.screenArgs.hashCode()) * 31) + this.source.hashCode()) * 31;
            String str = this.accountNumber;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Args(locality=" + this.locality + ", screenArgs=" + this.screenArgs + ", source=" + this.source + ", accountNumber=" + this.accountNumber + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.locality);
            this.screenArgs.writeToParcel(dest, flags);
            dest.writeParcelable(this.source, flags);
            dest.writeString(this.accountNumber);
        }

        public Args(CountryCode.Supported locality, ScreenArgs.Failure screenArgs, OptionOnboarding.OptionOnboardingSource source, String str) {
            Intrinsics.checkNotNullParameter(locality, "locality");
            Intrinsics.checkNotNullParameter(screenArgs, "screenArgs");
            Intrinsics.checkNotNullParameter(source, "source");
            this.locality = locality;
            this.screenArgs = screenArgs;
            this.source = source;
            this.accountNumber = str;
        }

        public final CountryCode.Supported getLocality() {
            return this.locality;
        }

        public final ScreenArgs.Failure getScreenArgs() {
            return this.screenArgs;
        }

        public final OptionOnboarding.OptionOnboardingSource getSource() {
            return this.source;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }
    }

    /* compiled from: OptionOnboardingFailureFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/OptionOnboardingFailureFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingFailureFragment;", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingFailureFragment$Args;", "<init>", "()V", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<OptionOnboardingFailureFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(Args args) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(OptionOnboardingFailureFragment optionOnboardingFailureFragment) {
            return (Args) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, optionOnboardingFailureFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public OptionOnboardingFailureFragment newInstance(Args args) {
            return (OptionOnboardingFailureFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(OptionOnboardingFailureFragment optionOnboardingFailureFragment, Args args) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, optionOnboardingFailureFragment, args);
        }
    }
}
