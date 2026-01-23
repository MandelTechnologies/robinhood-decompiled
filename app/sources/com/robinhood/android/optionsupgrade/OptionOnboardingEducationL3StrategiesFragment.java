package com.robinhood.android.optionsupgrade;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.optionsupgrade.OptionOnboardingEducationStrategyDetailFragment;
import com.robinhood.android.optionsupgrade.OptionOnboardingScreens;
import com.robinhood.android.optionsupgrade.ScreenArgs;
import com.robinhood.android.optionsupgrade.ScreenRequest;
import com.robinhood.android.optionsupgrade.databinding.FragmentOptionsUpgradeStrategiesBinding;
import com.robinhood.android.optionsupgrade.level3.presenter.OptionOnboardingEducationL3StrategiesDuxo;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
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

/* compiled from: OptionOnboardingEducationL3StrategiesFragment.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 ,2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001,B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u001a\u0010!\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\t\u0010&\u001a\u00020\u001eH\u0096\u0001R\u001b\u0010\u0006\u001a\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(X\u0096\u0005¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006-"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/OptionOnboardingEducationL3StrategiesFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingScreen;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingScreenCallback;", "getCallbacks", "()Lcom/robinhood/android/optionsupgrade/OptionOnboardingScreenCallback;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "screenArgs", "Lcom/robinhood/android/optionsupgrade/ScreenArgs;", "getScreenArgs", "()Lcom/robinhood/android/optionsupgrade/ScreenArgs;", "binding", "Lcom/robinhood/android/optionsupgrade/databinding/FragmentOptionsUpgradeStrategiesBinding;", "getBinding", "()Lcom/robinhood/android/optionsupgrade/databinding/FragmentOptionsUpgradeStrategiesBinding;", "binding$delegate", "duxo", "Lcom/robinhood/android/optionsupgrade/level3/presenter/OptionOnboardingEducationL3StrategiesDuxo;", "getDuxo", "()Lcom/robinhood/android/optionsupgrade/level3/presenter/OptionOnboardingEducationL3StrategiesDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "setLoading", "", "isLoading", "", "currentScreenRequest", "Lcom/robinhood/android/optionsupgrade/ScreenRequest;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionOnboardingEducationL3StrategiesFragment extends BaseFragment implements RegionGated, OptionOnboardingScreens {
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(OptionOnboardingEducationL3StrategiesFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/optionsupgrade/OptionOnboardingScreenCallback;", 0)), Reflection.property1(new PropertyReference1Impl(OptionOnboardingEducationL3StrategiesFragment.class, "binding", "getBinding()Lcom/robinhood/android/optionsupgrade/databinding/FragmentOptionsUpgradeStrategiesBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

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

    public OptionOnboardingEducationL3StrategiesFragment() {
        super(C25121R.layout.fragment_options_upgrade_strategies);
        this.$$delegate_0 = new RegionGated2(OptionsRegionGate.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(OptionOnboardingScreens2.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingEducationL3StrategiesFragment$special$$inlined$hostActivityCallbacks$1
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
        this.binding = ViewBinding5.viewBinding(this, OptionOnboardingEducationL3StrategiesFragment2.INSTANCE);
        this.duxo = DuxosKt.duxo(this, OptionOnboardingEducationL3StrategiesDuxo.class);
    }

    @Override // com.robinhood.android.optionsupgrade.OptionOnboardingScreens
    public OptionOnboardingScreens2 getCallbacks() {
        return (OptionOnboardingScreens2) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.optionsupgrade.OptionOnboardingScreens
    public ScreenArgs getScreenArgs() {
        return (ScreenArgs) INSTANCE.getArgs((Fragment) this);
    }

    private final FragmentOptionsUpgradeStrategiesBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[1]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentOptionsUpgradeStrategiesBinding) value;
    }

    private final OptionOnboardingEducationL3StrategiesDuxo getDuxo() {
        return (OptionOnboardingEducationL3StrategiesDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.optionsupgrade.OptionOnboardingScreens
    public void setLoading(boolean isLoading, ScreenRequest currentScreenRequest) {
        Intrinsics.checkNotNullParameter(currentScreenRequest, "currentScreenRequest");
        getBinding().optionsUpgradeStrategiesContinueBtn.setLoading(isLoading);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (!isInTabFragment()) {
            ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        }
        RdsButton optionsUpgradeStrategiesContinueBtn = getBinding().optionsUpgradeStrategiesContinueBtn;
        Intrinsics.checkNotNullExpressionValue(optionsUpgradeStrategiesContinueBtn, "optionsUpgradeStrategiesContinueBtn");
        OnClickListeners.onClick(optionsUpgradeStrategiesContinueBtn, new Function0() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingEducationL3StrategiesFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionOnboardingEducationL3StrategiesFragment.onViewCreated$lambda$0(this.f$0);
            }
        });
        RdsRowView optionsUpgradeStrategiesBullishRow = getBinding().optionsUpgradeStrategiesBullishRow;
        Intrinsics.checkNotNullExpressionValue(optionsUpgradeStrategiesBullishRow, "optionsUpgradeStrategiesBullishRow");
        OnClickListeners.onClick(optionsUpgradeStrategiesBullishRow, new Function0() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingEducationL3StrategiesFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionOnboardingEducationL3StrategiesFragment.onViewCreated$lambda$1(this.f$0);
            }
        });
        RdsRowView optionsUpgradeStrategiesBearishRow = getBinding().optionsUpgradeStrategiesBearishRow;
        Intrinsics.checkNotNullExpressionValue(optionsUpgradeStrategiesBearishRow, "optionsUpgradeStrategiesBearishRow");
        OnClickListeners.onClick(optionsUpgradeStrategiesBearishRow, new Function0() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingEducationL3StrategiesFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionOnboardingEducationL3StrategiesFragment.onViewCreated$lambda$2(this.f$0);
            }
        });
        RdsRowView optionsUpgradeStrategiesLowVolatilityRow = getBinding().optionsUpgradeStrategiesLowVolatilityRow;
        Intrinsics.checkNotNullExpressionValue(optionsUpgradeStrategiesLowVolatilityRow, "optionsUpgradeStrategiesLowVolatilityRow");
        OnClickListeners.onClick(optionsUpgradeStrategiesLowVolatilityRow, new Function0() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingEducationL3StrategiesFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionOnboardingEducationL3StrategiesFragment.onViewCreated$lambda$3(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(OptionOnboardingEducationL3StrategiesFragment optionOnboardingEducationL3StrategiesFragment) {
        OptionOnboardingScreens2 callbacks = optionOnboardingEducationL3StrategiesFragment.getCallbacks();
        Companion companion = INSTANCE;
        callbacks.goToNextScreen(new ScreenRequest.EducationL3Strategies(((ScreenArgs.EducationL3Strategies) companion.getArgs((Fragment) optionOnboardingEducationL3StrategiesFragment)).getScreenId()), (ScreenArgs) companion.getArgs((Fragment) optionOnboardingEducationL3StrategiesFragment));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(OptionOnboardingEducationL3StrategiesFragment optionOnboardingEducationL3StrategiesFragment) {
        optionOnboardingEducationL3StrategiesFragment.getCallbacks().goToNonOptionOnboardingScreenFragment(OptionOnboardingEducationStrategyDetailFragment.INSTANCE.newInstance((Parcelable) new OptionOnboardingEducationStrategyDetailFragment.Args(OptionOnboardingEducationStrategyDetailFragment.Mode.L3_BULLISH, optionOnboardingEducationL3StrategiesFragment.getDuxo().getStateFlow().getValue().getLocality())));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2(OptionOnboardingEducationL3StrategiesFragment optionOnboardingEducationL3StrategiesFragment) {
        optionOnboardingEducationL3StrategiesFragment.getCallbacks().goToNonOptionOnboardingScreenFragment(OptionOnboardingEducationStrategyDetailFragment.INSTANCE.newInstance((Parcelable) new OptionOnboardingEducationStrategyDetailFragment.Args(OptionOnboardingEducationStrategyDetailFragment.Mode.L3_BEARISH, optionOnboardingEducationL3StrategiesFragment.getDuxo().getStateFlow().getValue().getLocality())));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3(OptionOnboardingEducationL3StrategiesFragment optionOnboardingEducationL3StrategiesFragment) {
        optionOnboardingEducationL3StrategiesFragment.getCallbacks().goToNonOptionOnboardingScreenFragment(OptionOnboardingEducationStrategyDetailFragment.INSTANCE.newInstance((Parcelable) new OptionOnboardingEducationStrategyDetailFragment.Args(OptionOnboardingEducationStrategyDetailFragment.Mode.L3_LOW_VOLATILITY, optionOnboardingEducationL3StrategiesFragment.getDuxo().getStateFlow().getValue().getLocality())));
        return Unit.INSTANCE;
    }

    /* compiled from: OptionOnboardingEducationL3StrategiesFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/OptionOnboardingEducationL3StrategiesFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingEducationL3StrategiesFragment;", "Lcom/robinhood/android/optionsupgrade/ScreenArgs$EducationL3Strategies;", "<init>", "()V", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<OptionOnboardingEducationL3StrategiesFragment, ScreenArgs.EducationL3Strategies> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public ScreenArgs.EducationL3Strategies getArgs(OptionOnboardingEducationL3StrategiesFragment optionOnboardingEducationL3StrategiesFragment) {
            return (ScreenArgs.EducationL3Strategies) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, optionOnboardingEducationL3StrategiesFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public OptionOnboardingEducationL3StrategiesFragment newInstance(ScreenArgs.EducationL3Strategies educationL3Strategies) {
            return (OptionOnboardingEducationL3StrategiesFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, educationL3Strategies);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(OptionOnboardingEducationL3StrategiesFragment optionOnboardingEducationL3StrategiesFragment, ScreenArgs.EducationL3Strategies educationL3Strategies) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, optionOnboardingEducationL3StrategiesFragment, educationL3Strategies);
        }
    }
}
