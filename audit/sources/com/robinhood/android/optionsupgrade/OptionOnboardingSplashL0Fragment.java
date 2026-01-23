package com.robinhood.android.optionsupgrade;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.rxjava2.RxJava2Adapter;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.account.AccountDisplayNameStore;
import com.robinhood.android.account.strings.DisplayName;
import com.robinhood.android.common.p088ui.daynight.DayNightChanges;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.navigation.app.keys.data.OptionPage;
import com.robinhood.android.optionsupgrade.OptionOnboardingExperimentState;
import com.robinhood.android.optionsupgrade.OptionOnboardingScreens;
import com.robinhood.android.optionsupgrade.ScreenArgs;
import com.robinhood.android.optionsupgrade.ScreenRequest;
import com.robinhood.android.optionsupgrade.SplashPageImprovement;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: OptionOnboardingSplashL0Fragment.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 72\u00020\u00012\u00020\u00022\u00020\u0003:\u000267B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u001f\u001a\u00020*2\u0006\u0010+\u001a\u00020\u00172\u0006\u0010,\u001a\u00020-H\u0016J\r\u0010.\u001a\u00020*H\u0017¢\u0006\u0002\u0010/J\t\u00100\u001a\u00020\u0017H\u0096\u0001R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001b\u0010\f\u001a\u00020\r8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u0017X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u0017X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R+\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u00178B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010 R#\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b&\u0010'R\u0018\u00101\u001a\b\u0012\u0004\u0012\u00020302X\u0096\u0005¢\u0006\u0006\u001a\u0004\b4\u00105¨\u00068²\u0006\f\u00109\u001a\u0004\u0018\u00010%X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/OptionOnboardingSplashL0Fragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingScreen;", "<init>", "()V", "accountDisplayNameStore", "Lcom/robinhood/android/account/AccountDisplayNameStore;", "getAccountDisplayNameStore", "()Lcom/robinhood/android/account/AccountDisplayNameStore;", "setAccountDisplayNameStore", "(Lcom/robinhood/android/account/AccountDisplayNameStore;)V", "callbacks", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingScreenCallback;", "getCallbacks", "()Lcom/robinhood/android/optionsupgrade/OptionOnboardingScreenCallback;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "screenArgs", "Lcom/robinhood/android/optionsupgrade/ScreenArgs;", "getScreenArgs", "()Lcom/robinhood/android/optionsupgrade/ScreenArgs;", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "toolbarVisible", "getToolbarVisible", "<set-?>", "loading", "getLoading", "setLoading", "(Z)V", "loading$delegate", "Landroidx/compose/runtime/MutableState;", "accountDisplayNameStateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/robinhood/android/account/strings/DisplayName;", "getAccountDisplayNameStateFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "accountDisplayNameStateFlow$delegate", "Lkotlin/Lazy;", "", "isLoading", "currentScreenRequest", "Lcom/robinhood/android/optionsupgrade/ScreenRequest;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Args", "Companion", "feature-options-upgrade_externalDebug", "accountDisplayName"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionOnboardingSplashL0Fragment extends GenericComposeFragment implements RegionGated, OptionOnboardingScreens {
    public AccountDisplayNameStore accountDisplayNameStore;
    private final boolean toolbarVisible;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(OptionOnboardingSplashL0Fragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/optionsupgrade/OptionOnboardingScreenCallback;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(OptionsRegionGate.INSTANCE);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(OptionOnboardingScreens2.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingSplashL0Fragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof OptionOnboardingScreens2) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });
    private final boolean useDesignSystemToolbar = true;

    /* renamed from: loading$delegate, reason: from kotlin metadata */
    private final SnapshotState loading = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    /* renamed from: accountDisplayNameStateFlow$delegate, reason: from kotlin metadata */
    private final Lazy accountDisplayNameStateFlow = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingSplashL0Fragment$$ExternalSyntheticLambda8
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return OptionOnboardingSplashL0Fragment.accountDisplayNameStateFlow_delegate$lambda$0(this.f$0);
        }
    });

    /* compiled from: OptionOnboardingSplashL0Fragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OptionOnboardingExperimentState.SplashL0.Redesign.RedesignL0AssetType.values().length];
            try {
                iArr[OptionOnboardingExperimentState.SplashL0.Redesign.RedesignL0AssetType.IMAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionOnboardingExperimentState.SplashL0.Redesign.RedesignL0AssetType.LOTTIE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OptionOnboardingExperimentState.SplashL0.Redesign.RedesignL0AssetType.VIDEO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$16(OptionOnboardingSplashL0Fragment optionOnboardingSplashL0Fragment, int i, Composer composer, int i2) throws Resources.NotFoundException {
        optionOnboardingSplashL0Fragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
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
    public com.robinhood.rosetta.eventlogging.Context getScreenEventContext() {
        return OptionOnboardingScreens.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return OptionOnboardingScreens.DefaultImpls.getScreenEventData(this);
    }

    public final AccountDisplayNameStore getAccountDisplayNameStore() {
        AccountDisplayNameStore accountDisplayNameStore = this.accountDisplayNameStore;
        if (accountDisplayNameStore != null) {
            return accountDisplayNameStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("accountDisplayNameStore");
        return null;
    }

    public final void setAccountDisplayNameStore(AccountDisplayNameStore accountDisplayNameStore) {
        Intrinsics.checkNotNullParameter(accountDisplayNameStore, "<set-?>");
        this.accountDisplayNameStore = accountDisplayNameStore;
    }

    @Override // com.robinhood.android.optionsupgrade.OptionOnboardingScreens
    public OptionOnboardingScreens2 getCallbacks() {
        return (OptionOnboardingScreens2) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.optionsupgrade.OptionOnboardingScreens
    public ScreenArgs getScreenArgs() {
        return ((Args) INSTANCE.getArgs((Fragment) this)).getScreenArgs();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean getLoading() {
        return ((Boolean) this.loading.getValue()).booleanValue();
    }

    private final void setLoading(boolean z) {
        this.loading.setValue(Boolean.valueOf(z));
    }

    private final StateFlow<DisplayName> getAccountDisplayNameStateFlow() {
        return (StateFlow) this.accountDisplayNameStateFlow.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StateFlow accountDisplayNameStateFlow_delegate$lambda$0(OptionOnboardingSplashL0Fragment optionOnboardingSplashL0Fragment) {
        return optionOnboardingSplashL0Fragment.getAccountDisplayNameStore().displayNameStateFlow(((Args) INSTANCE.getArgs((Fragment) optionOnboardingSplashL0Fragment)).getScreenArgs().getAccountNumber(), optionOnboardingSplashL0Fragment.getLifecycleScope());
    }

    @Override // com.robinhood.android.optionsupgrade.OptionOnboardingScreens
    public void setLoading(boolean isLoading, ScreenRequest currentScreenRequest) {
        Intrinsics.checkNotNullParameter(currentScreenRequest, "currentScreenRequest");
        setLoading(isLoading);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) throws Resources.NotFoundException {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-752888515);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-752888515, i2, -1, "com.robinhood.android.optionsupgrade.OptionOnboardingSplashL0Fragment.ComposeContent (OptionOnboardingSplashL0Fragment.kt:61)");
            }
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getAccountDisplayNameStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            SnapshotState4 snapshotState4SubscribeAsState = RxJava2Adapter.subscribeAsState(requireBaseActivity().getDayNightStyleChanges(), DayNightChanges.isDay(getScarletManager()) ? DayNightOverlay.DAY : DayNightOverlay.NIGHT, composerStartRestartGroup, 0);
            Companion companion = INSTANCE;
            OptionOnboardingExperimentState.SplashL0 experimentState = ((Args) companion.getArgs((Fragment) this)).getExperimentState();
            if (experimentState instanceof OptionOnboardingExperimentState.SplashL0.Redesign) {
                composerStartRestartGroup.startReplaceGroup(-981982726);
                OptionOnboardingExperimentState.SplashL0.Redesign redesign = (OptionOnboardingExperimentState.SplashL0.Redesign) experimentState;
                int i3 = WhenMappings.$EnumSwitchMapping$0[redesign.getType().ordinal()];
                if (i3 == 1 || i3 == 2) {
                    composerStartRestartGroup.startReplaceGroup(-981770128);
                    SplashPageImprovement.Creative splashL0Creative = OptionOnboardingSplashL0Fragment2.getSplashL0Creative(redesign.getType() == OptionOnboardingExperimentState.SplashL0.Redesign.RedesignL0AssetType.LOTTIE, (DayNightOverlay) snapshotState4SubscribeAsState.getValue());
                    Resources resources = getResources();
                    Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                    String splashL0Title = OptionOnboardingSplashL0Fragment2.getSplashL0Title(resources, ComposeContent$lambda$1(snapshotState4CollectAsStateWithLifecycle), ((Args) companion.getArgs((Fragment) this)).getScreenArgs().getAccountTypeInCopy());
                    String string2 = getString(C25121R.string.gated_etf_option_upgrade_splash_page_one_detail);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    SplashPageImprovement splashPageImprovement = new SplashPageImprovement(splashL0Creative, splashL0Title, string2);
                    String strStringResource = StringResources_androidKt.stringResource(C25121R.string.gated_options_upgrade_splash_disclaimer_with_fee_link_markdown, composerStartRestartGroup, 0);
                    boolean loading = getLoading();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingSplashL0Fragment$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return OptionOnboardingSplashL0Fragment.ComposeContent$lambda$3$lambda$2(this.f$0);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    Function0 function0 = (Function0) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(this);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingSplashL0Fragment$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return OptionOnboardingSplashL0Fragment.ComposeContent$lambda$5$lambda$4(this.f$0);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    OptionOnboardingImprovementSplashComposable3.OptionOnboardingImprovementSplashComposable(splashPageImprovement, strStringResource, loading, function0, (Function0) objRememberedValue2, null, composerStartRestartGroup, 0, 32);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    if (i3 != 3) {
                        composerStartRestartGroup.startReplaceGroup(-1971338968);
                        composerStartRestartGroup.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composerStartRestartGroup.startReplaceGroup(-980110729);
                    Resources resources2 = getResources();
                    Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
                    String splashL0Title2 = OptionOnboardingSplashL0Fragment2.getSplashL0Title(resources2, ComposeContent$lambda$1(snapshotState4CollectAsStateWithLifecycle), ((Args) companion.getArgs((Fragment) this)).getScreenArgs().getAccountTypeInCopy());
                    String string3 = getString(C25121R.string.gated_etf_option_upgrade_splash_page_one_detail);
                    Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                    String strStringResource2 = StringResources_androidKt.stringResource(C25121R.string.gated_options_upgrade_splash_disclaimer_with_fee_link_markdown, composerStartRestartGroup, 0);
                    boolean loading2 = getLoading();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(this);
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new Function0() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingSplashL0Fragment$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return OptionOnboardingSplashL0Fragment.ComposeContent$lambda$7$lambda$6(this.f$0);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    Function0 function02 = (Function0) objRememberedValue3;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(this);
                    Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new Function0() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingSplashL0Fragment$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return OptionOnboardingSplashL0Fragment.ComposeContent$lambda$9$lambda$8(this.f$0);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    OptionOnboardingVideoSplashComposable2.OptionOnboardingVideoSplashComposable(function02, (Function0) objRememberedValue4, null, splashL0Title2, string3, strStringResource2, loading2, false, composerStartRestartGroup, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!(experimentState instanceof OptionOnboardingExperimentState.SplashL0.Swipie)) {
                    composerStartRestartGroup.startReplaceGroup(-1971340538);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(-978912734);
                int i4 = C25121R.drawable.svg_ic_options_chess;
                Resources resources3 = getResources();
                Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
                String splashL0Title3 = OptionOnboardingSplashL0Fragment2.getSplashL0Title(resources3, ComposeContent$lambda$1(snapshotState4CollectAsStateWithLifecycle), ((Args) companion.getArgs((Fragment) this)).getScreenArgs().getAccountTypeInCopy());
                String string4 = getString(C25121R.string.gated_etf_option_upgrade_splash_page_one_detail);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                SplashPage splashPage = new SplashPage(i4, splashL0Title3, string4, OptionPage.FREE_OPTIONS_TRADING);
                int i5 = C25121R.drawable.svg_ic_options_strategyhand;
                String string5 = getString(C25121R.string.option_upgrade_splash_page_two_title);
                Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                String string6 = getString(C25121R.string.option_upgrade_splash_page_two_detail);
                Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
                SplashPage splashPage2 = new SplashPage(i5, string5, string6, OptionPage.CHOOSE_YOUR_STRATEGY);
                int i6 = C25121R.drawable.svg_ic_options_unlock;
                String string7 = getString(C25121R.string.option_upgrade_splash_page_three_title);
                Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
                String string8 = getString(C25121R.string.option_upgrade_splash_page_three_detail);
                Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
                ImmutableList3 immutableList3PersistentListOf = extensions2.persistentListOf(splashPage, splashPage2, new SplashPage(i6, string7, string8, OptionPage.UNLOCK_YOUR_POTENTIAL));
                boolean loading3 = getLoading();
                String strStringResource3 = StringResources_androidKt.stringResource(C25121R.string.gated_options_upgrade_splash_disclaimer_with_fee_link_markdown, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChangedInstance5 = composerStartRestartGroup.changedInstance(this);
                Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue5 = new Function1() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingSplashL0Fragment$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return OptionOnboardingSplashL0Fragment.ComposeContent$lambda$11$lambda$10(this.f$0, (OptionPage) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                Function1 function1 = (Function1) objRememberedValue5;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChangedInstance6 = composerStartRestartGroup.changedInstance(this);
                Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance6 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue6 = new Function0() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingSplashL0Fragment$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return OptionOnboardingSplashL0Fragment.ComposeContent$lambda$13$lambda$12(this.f$0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                Function0 function03 = (Function0) objRememberedValue6;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChangedInstance7 = composerStartRestartGroup.changedInstance(this);
                Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance7 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue7 = new Function0() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingSplashL0Fragment$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return OptionOnboardingSplashL0Fragment.ComposeContent$lambda$15$lambda$14(this.f$0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                composerStartRestartGroup.endReplaceGroup();
                OptionOnboardingSplashComposable.OptionOnboardingSplashComposable(immutableList3PersistentListOf, strStringResource3, loading3, function1, function03, (Function0) objRememberedValue7, null, composerStartRestartGroup, 0, 64);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingSplashL0Fragment$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionOnboardingSplashL0Fragment.ComposeContent$lambda$16(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final DisplayName ComposeContent$lambda$1(SnapshotState4<DisplayName> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$3$lambda$2(OptionOnboardingSplashL0Fragment optionOnboardingSplashL0Fragment) {
        OptionOnboardingScreens2 callbacks = optionOnboardingSplashL0Fragment.getCallbacks();
        Companion companion = INSTANCE;
        callbacks.goToNextScreen(new ScreenRequest.SplashL0(((Args) companion.getArgs((Fragment) optionOnboardingSplashL0Fragment)).getScreenArgs().getScreenId()), ((Args) companion.getArgs((Fragment) optionOnboardingSplashL0Fragment)).getScreenArgs());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$5$lambda$4(OptionOnboardingSplashL0Fragment optionOnboardingSplashL0Fragment) {
        optionOnboardingSplashL0Fragment.requireActivity().onBackPressed();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$7$lambda$6(OptionOnboardingSplashL0Fragment optionOnboardingSplashL0Fragment) {
        OptionOnboardingScreens2 callbacks = optionOnboardingSplashL0Fragment.getCallbacks();
        Companion companion = INSTANCE;
        callbacks.goToNextScreen(new ScreenRequest.SplashL0(((Args) companion.getArgs((Fragment) optionOnboardingSplashL0Fragment)).getScreenArgs().getScreenId()), ((Args) companion.getArgs((Fragment) optionOnboardingSplashL0Fragment)).getScreenArgs());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$9$lambda$8(OptionOnboardingSplashL0Fragment optionOnboardingSplashL0Fragment) {
        optionOnboardingSplashL0Fragment.requireActivity().onBackPressed();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$11$lambda$10(OptionOnboardingSplashL0Fragment optionOnboardingSplashL0Fragment, OptionPage optionPage) {
        Intrinsics.checkNotNullParameter(optionPage, "optionPage");
        Navigator navigator = optionOnboardingSplashL0Fragment.getNavigator();
        Context contextRequireContext = optionOnboardingSplashL0Fragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new LegacyIntentKey.ReferenceManual.Options(optionPage), null, false, null, null, 60, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$13$lambda$12(OptionOnboardingSplashL0Fragment optionOnboardingSplashL0Fragment) {
        optionOnboardingSplashL0Fragment.requireActivity().onBackPressed();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$15$lambda$14(OptionOnboardingSplashL0Fragment optionOnboardingSplashL0Fragment) {
        OptionOnboardingScreens2 callbacks = optionOnboardingSplashL0Fragment.getCallbacks();
        Companion companion = INSTANCE;
        callbacks.goToNextScreen(new ScreenRequest.SplashL0(((Args) companion.getArgs((Fragment) optionOnboardingSplashL0Fragment)).getScreenArgs().getScreenId()), ((Args) companion.getArgs((Fragment) optionOnboardingSplashL0Fragment)).getScreenArgs());
        return Unit.INSTANCE;
    }

    /* compiled from: OptionOnboardingSplashL0Fragment.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/OptionOnboardingSplashL0Fragment$Args;", "Landroid/os/Parcelable;", "experimentState", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingExperimentState$SplashL0;", "screenArgs", "Lcom/robinhood/android/optionsupgrade/ScreenArgs$SplashL0;", "<init>", "(Lcom/robinhood/android/optionsupgrade/OptionOnboardingExperimentState$SplashL0;Lcom/robinhood/android/optionsupgrade/ScreenArgs$SplashL0;)V", "getExperimentState", "()Lcom/robinhood/android/optionsupgrade/OptionOnboardingExperimentState$SplashL0;", "getScreenArgs", "()Lcom/robinhood/android/optionsupgrade/ScreenArgs$SplashL0;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final OptionOnboardingExperimentState.SplashL0 experimentState;
        private final ScreenArgs.SplashL0 screenArgs;

        /* compiled from: OptionOnboardingSplashL0Fragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((OptionOnboardingExperimentState.SplashL0) parcel.readParcelable(Args.class.getClassLoader()), ScreenArgs.SplashL0.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, OptionOnboardingExperimentState.SplashL0 splashL0, ScreenArgs.SplashL0 splashL02, int i, Object obj) {
            if ((i & 1) != 0) {
                splashL0 = args.experimentState;
            }
            if ((i & 2) != 0) {
                splashL02 = args.screenArgs;
            }
            return args.copy(splashL0, splashL02);
        }

        /* renamed from: component1, reason: from getter */
        public final OptionOnboardingExperimentState.SplashL0 getExperimentState() {
            return this.experimentState;
        }

        /* renamed from: component2, reason: from getter */
        public final ScreenArgs.SplashL0 getScreenArgs() {
            return this.screenArgs;
        }

        public final Args copy(OptionOnboardingExperimentState.SplashL0 experimentState, ScreenArgs.SplashL0 screenArgs) {
            Intrinsics.checkNotNullParameter(experimentState, "experimentState");
            Intrinsics.checkNotNullParameter(screenArgs, "screenArgs");
            return new Args(experimentState, screenArgs);
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
            return Intrinsics.areEqual(this.experimentState, args.experimentState) && Intrinsics.areEqual(this.screenArgs, args.screenArgs);
        }

        public int hashCode() {
            return (this.experimentState.hashCode() * 31) + this.screenArgs.hashCode();
        }

        public String toString() {
            return "Args(experimentState=" + this.experimentState + ", screenArgs=" + this.screenArgs + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.experimentState, flags);
            this.screenArgs.writeToParcel(dest, flags);
        }

        public Args(OptionOnboardingExperimentState.SplashL0 experimentState, ScreenArgs.SplashL0 screenArgs) {
            Intrinsics.checkNotNullParameter(experimentState, "experimentState");
            Intrinsics.checkNotNullParameter(screenArgs, "screenArgs");
            this.experimentState = experimentState;
            this.screenArgs = screenArgs;
        }

        public final OptionOnboardingExperimentState.SplashL0 getExperimentState() {
            return this.experimentState;
        }

        public final ScreenArgs.SplashL0 getScreenArgs() {
            return this.screenArgs;
        }
    }

    /* compiled from: OptionOnboardingSplashL0Fragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/OptionOnboardingSplashL0Fragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingSplashL0Fragment;", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingSplashL0Fragment$Args;", "<init>", "()V", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<OptionOnboardingSplashL0Fragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(OptionOnboardingSplashL0Fragment optionOnboardingSplashL0Fragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, optionOnboardingSplashL0Fragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public OptionOnboardingSplashL0Fragment newInstance(Args args) {
            return (OptionOnboardingSplashL0Fragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(OptionOnboardingSplashL0Fragment optionOnboardingSplashL0Fragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, optionOnboardingSplashL0Fragment, args);
        }
    }
}
