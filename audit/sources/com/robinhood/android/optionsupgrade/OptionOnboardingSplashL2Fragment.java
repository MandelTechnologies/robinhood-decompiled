package com.robinhood.android.optionsupgrade;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.android.account.AccountDisplayNameStore;
import com.robinhood.android.account.strings.DisplayName;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.navigation.Navigator;
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
import com.robinhood.compose.bento.component.BentoButtonBarState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.common.contracts.PdfRendererIntentKey;
import com.robinhood.shared.remote.assets.LottieUrl;
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
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: OptionOnboardingSplashL2Fragment.kt */
@Metadata(m3635d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 A2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002@AB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u001f\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00172\u0006\u0010%\u001a\u00020&H\u0016J\u001a\u00103\u001a\u00020#2\u0006\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u000107H\u0016J\r\u00108\u001a\u00020#H\u0017¢\u0006\u0002\u00109J\t\u0010:\u001a\u00020\u0017H\u0096\u0001R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001b\u0010\f\u001a\u00020\r8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u0017X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u0017X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R+\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u00178B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010 R#\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010)0(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b*\u0010+R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u0002000/8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0018\u0010;\u001a\b\u0012\u0004\u0012\u00020=0<X\u0096\u0005¢\u0006\u0006\u001a\u0004\b>\u0010?¨\u0006B²\u0006\f\u0010C\u001a\u0004\u0018\u00010)X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/OptionOnboardingSplashL2Fragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingScreen;", "<init>", "()V", "accountDisplayNameStore", "Lcom/robinhood/android/account/AccountDisplayNameStore;", "getAccountDisplayNameStore", "()Lcom/robinhood/android/account/AccountDisplayNameStore;", "setAccountDisplayNameStore", "(Lcom/robinhood/android/account/AccountDisplayNameStore;)V", "callbacks", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingScreenCallback;", "getCallbacks", "()Lcom/robinhood/android/optionsupgrade/OptionOnboardingScreenCallback;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "screenArgs", "Lcom/robinhood/android/optionsupgrade/ScreenArgs;", "getScreenArgs", "()Lcom/robinhood/android/optionsupgrade/ScreenArgs;", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "toolbarVisible", "getToolbarVisible", "<set-?>", "loading", "getLoading", "setLoading", "(Z)V", "loading$delegate", "Landroidx/compose/runtime/MutableState;", "", "isLoading", "currentScreenRequest", "Lcom/robinhood/android/optionsupgrade/ScreenRequest;", "accountDisplayNameStateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/robinhood/android/account/strings/DisplayName;", "getAccountDisplayNameStateFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "accountDisplayNameStateFlow$delegate", "Lkotlin/Lazy;", "apacPages", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/optionsupgrade/SplashPage;", "getApacPages", "()Lkotlinx/collections/immutable/ImmutableList;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Args", "Companion", "feature-options-upgrade_externalDebug", "accountDisplayName"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionOnboardingSplashL2Fragment extends GenericComposeFragment implements RegionGated, OptionOnboardingScreens {
    public AccountDisplayNameStore accountDisplayNameStore;
    private final boolean toolbarVisible;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(OptionOnboardingSplashL2Fragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/optionsupgrade/OptionOnboardingScreenCallback;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(OptionsRegionGate.INSTANCE);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(OptionOnboardingScreens2.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingSplashL2Fragment$special$$inlined$hostActivityCallbacks$1
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
    private final Lazy accountDisplayNameStateFlow = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingSplashL2Fragment$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return OptionOnboardingSplashL2Fragment.accountDisplayNameStateFlow_delegate$lambda$0(this.f$0);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$20(OptionOnboardingSplashL2Fragment optionOnboardingSplashL2Fragment, int i, Composer composer, int i2) throws Resources.NotFoundException {
        optionOnboardingSplashL2Fragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    @Override // com.robinhood.android.optionsupgrade.OptionOnboardingScreens
    public void setLoading(boolean isLoading, ScreenRequest currentScreenRequest) {
        Intrinsics.checkNotNullParameter(currentScreenRequest, "currentScreenRequest");
        setLoading(isLoading);
    }

    private final StateFlow<DisplayName> getAccountDisplayNameStateFlow() {
        return (StateFlow) this.accountDisplayNameStateFlow.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StateFlow accountDisplayNameStateFlow_delegate$lambda$0(OptionOnboardingSplashL2Fragment optionOnboardingSplashL2Fragment) {
        return optionOnboardingSplashL2Fragment.getAccountDisplayNameStore().displayNameStateFlow(((Args) INSTANCE.getArgs((Fragment) optionOnboardingSplashL2Fragment)).getScreenArgs().getAccountNumber(), optionOnboardingSplashL2Fragment.getLifecycleScope());
    }

    private final ImmutableList<SplashPage> getApacPages() {
        int i = C25121R.drawable.svg_ic_upgrade_splash_1;
        String string2 = getString(C25121R.string.options_upgrade_splash_title_1);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String string3 = getString(C25121R.string.options_upgrade_splash_description_1);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        SplashPage splashPage = new SplashPage(i, string2, string3, null, 8, null);
        int i2 = C25121R.drawable.svg_ic_upgrade_splash_2;
        String string4 = getString(C25121R.string.options_upgrade_splash_title_2);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        String string5 = getString(C25121R.string.options_upgrade_splash_description_2);
        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
        SplashPage splashPage2 = new SplashPage(i2, string4, string5, null, 8, null);
        int i3 = C25121R.drawable.svg_ic_upgrade_splash_4;
        String string6 = getString(C25121R.string.options_upgrade_splash_title_4);
        Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
        String string7 = getString(C25121R.string.options_upgrade_splash_description_4);
        Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
        return extensions2.persistentListOf(splashPage, splashPage2, new SplashPage(i3, string6, string7, null, 8, null));
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        for (OptionOnboardingEducationSpreadFragment4 optionOnboardingEducationSpreadFragment4 : OptionOnboardingEducationSpreadFragment4.getEntries()) {
            LottieUrl dayLottieUrl = optionOnboardingEducationSpreadFragment4.getDayLottieUrl();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            dayLottieUrl.prefetch(contextRequireContext);
            LottieUrl nightLottieUrl = optionOnboardingEducationSpreadFragment4.getNightLottieUrl();
            Context contextRequireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
            nightLottieUrl.prefetch(contextRequireContext2);
        }
        for (StrategyDetailResource strategyDetailResource : StrategyDetailResource.getEntries()) {
            LottieUrl dayLottieUrl2 = strategyDetailResource.getDayLottieUrl();
            Context contextRequireContext3 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "requireContext(...)");
            dayLottieUrl2.prefetch(contextRequireContext3);
            LottieUrl nightLottieUrl2 = strategyDetailResource.getNightLottieUrl();
            Context contextRequireContext4 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext4, "requireContext(...)");
            nightLottieUrl2.prefetch(contextRequireContext4);
        }
    }

    private static final DisplayName ComposeContent$lambda$3(SnapshotState4<DisplayName> snapshotState4) {
        return snapshotState4.getValue();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) throws Resources.NotFoundException {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1859662205);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1859662205, i2, -1, "com.robinhood.android.optionsupgrade.OptionOnboardingSplashL2Fragment.ComposeContent (OptionOnboardingSplashL2Fragment.kt:97)");
            }
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getAccountDisplayNameStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            Companion companion = INSTANCE;
            OptionOnboardingExperimentState.SplashL2 experimentState = ((Args) companion.getArgs((Fragment) this)).getExperimentState();
            if (experimentState instanceof OptionOnboardingExperimentState.SplashL2.Redesign) {
                composerStartRestartGroup.startReplaceGroup(413894196);
                SplashPageImprovement.Creative splashL2Creative = OptionOnboardingSplashL2Fragment2.getSplashL2Creative(((OptionOnboardingExperimentState.SplashL2.Redesign) experimentState).getType(), BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getIsDay());
                Resources resources = getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                String splashL2Title = OptionOnboardingSplashL2Fragment2.getSplashL2Title(resources, ComposeContent$lambda$3(snapshotState4CollectAsStateWithLifecycle), ((Args) companion.getArgs((Fragment) this)).getScreenArgs().getAccountTypeInCopy());
                String string2 = getString(C25121R.string.options_upgrade_splash_description_1);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                SplashPageImprovement splashPageImprovement = new SplashPageImprovement(splashL2Creative, splashL2Title, string2);
                String strStringResource = StringResources_androidKt.stringResource(C25121R.string.gated_options_improvement_splash_disclaimer_markdown, composerStartRestartGroup, 0);
                boolean loading = getLoading();
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingSplashL2Fragment$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return OptionOnboardingSplashL2Fragment.ComposeContent$lambda$5$lambda$4(this.f$0);
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
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingSplashL2Fragment$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return OptionOnboardingSplashL2Fragment.ComposeContent$lambda$7$lambda$6(this.f$0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                OptionOnboardingImprovementSplashComposable3.OptionOnboardingImprovementSplashComposable(splashPageImprovement, strStringResource, loading, function0, (Function0) objRememberedValue2, null, composerStartRestartGroup, 0, 32);
                composer2 = composerStartRestartGroup;
                composer2.endReplaceGroup();
            } else {
                if (!(experimentState instanceof OptionOnboardingExperimentState.SplashL2.Swipie)) {
                    composerStartRestartGroup.startReplaceGroup(428995047);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(415330023);
                if (((Args) companion.getArgs((Fragment) this)).isFromPostTradeUpsell()) {
                    composerStartRestartGroup.startReplaceGroup(415305099);
                    SplashPageImprovement splashPageImprovement2 = new SplashPageImprovement(new SplashPageImprovement.Creative.RemoteLottie(BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getIsDay() ? LottieUrl.OPTIONS_ONBOARDING_L2_DAY : LottieUrl.OPTIONS_ONBOARDING_L2_NIGHT), StringResources_androidKt.stringResource(C25121R.string.options_level3_entry_point_post_trade_upsell_splash_title, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(C25121R.string.options_level3_entry_point_post_trade_upsell_splash_subtitle, composerStartRestartGroup, 0));
                    BentoButtonBarState bentoButtonBarState = new BentoButtonBarState(StringResources_androidKt.stringResource(C25121R.string.f4827x6bb93cc1, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(C11048R.string.general_action_learn_more, composerStartRestartGroup, 0), false, null, StringResources_androidKt.stringResource(C25121R.string.f4828x67b38c4e, composerStartRestartGroup, 0), getLoading(), null, false, StringResources_androidKt.stringResource(C25121R.string.f4829x84628fdc, composerStartRestartGroup, 0), false, null, false, 3788, null);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(this);
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new Function0() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingSplashL2Fragment$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return OptionOnboardingSplashL2Fragment.ComposeContent$lambda$9$lambda$8(this.f$0);
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
                        objRememberedValue4 = new Function0() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingSplashL2Fragment$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return OptionOnboardingSplashL2Fragment.ComposeContent$lambda$11$lambda$10(this.f$0);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    Function0 function03 = (Function0) objRememberedValue4;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    boolean zChangedInstance5 = composerStartRestartGroup.changedInstance(this);
                    Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue5 = new Function0() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingSplashL2Fragment$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return OptionOnboardingSplashL2Fragment.ComposeContent$lambda$13$lambda$12(this.f$0);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    OptionOnboardingUpsellSplashComposable.OptionOnboardingUpsellSplashComposable(splashPageImprovement2, bentoButtonBarState, function02, function03, (Function0) objRememberedValue5, null, composerStartRestartGroup, BentoButtonBarState.$stable << 3, 32);
                    composer2 = composerStartRestartGroup;
                    composer2.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(417837799);
                    int i3 = C25121R.drawable.svg_ic_upgrade_splash_1;
                    Resources resources2 = getResources();
                    Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
                    String splashL2Title2 = OptionOnboardingSplashL2Fragment2.getSplashL2Title(resources2, ComposeContent$lambda$3(snapshotState4CollectAsStateWithLifecycle), ((Args) companion.getArgs((Fragment) this)).getScreenArgs().getAccountTypeInCopy());
                    String string3 = getString(C25121R.string.options_upgrade_splash_description_1);
                    Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                    SplashPage splashPage = new SplashPage(i3, splashL2Title2, string3, null, 8, null);
                    int i4 = C25121R.drawable.svg_ic_upgrade_splash_2;
                    String string4 = getString(C25121R.string.options_upgrade_splash_title_2);
                    Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                    String string5 = getString(C25121R.string.options_upgrade_splash_description_2);
                    Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                    SplashPage splashPage2 = new SplashPage(i4, string4, string5, null, 8, null);
                    int i5 = C25121R.drawable.svg_ic_upgrade_splash_3;
                    String string6 = getString(C25121R.string.options_upgrade_splash_title_3);
                    Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
                    String string7 = getString(C25121R.string.options_upgrade_splash_description_3);
                    Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
                    SplashPage splashPage3 = new SplashPage(i5, string6, string7, null, 8, null);
                    int i6 = C25121R.drawable.svg_ic_upgrade_splash_4;
                    String string8 = getString(C25121R.string.options_upgrade_splash_title_4);
                    Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
                    String string9 = getString(C25121R.string.options_upgrade_splash_description_4);
                    Intrinsics.checkNotNullExpressionValue(string9, "getString(...)");
                    ImmutableList<SplashPage> immutableListPersistentListOf = extensions2.persistentListOf(splashPage, splashPage2, splashPage3, new SplashPage(i6, string8, string9, null, 8, null));
                    if (((Args) companion.getArgs((Fragment) this)).getLocality().isRhsg()) {
                        immutableListPersistentListOf = getApacPages();
                    }
                    ImmutableList<SplashPage> immutableList = immutableListPersistentListOf;
                    boolean loading2 = getLoading();
                    String strStringResource2 = StringResources_androidKt.stringResource(C25121R.string.gated_options_improvement_splash_disclaimer_markdown, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    Composer.Companion companion2 = Composer.INSTANCE;
                    if (objRememberedValue6 == companion2.getEmpty()) {
                        objRememberedValue6 = new Function1() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingSplashL2Fragment$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return OptionOnboardingSplashL2Fragment.ComposeContent$lambda$15$lambda$14((OptionPage) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    Function1 function1 = (Function1) objRememberedValue6;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    boolean zChangedInstance6 = composerStartRestartGroup.changedInstance(this);
                    Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance6 || objRememberedValue7 == companion2.getEmpty()) {
                        objRememberedValue7 = new Function0() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingSplashL2Fragment$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return OptionOnboardingSplashL2Fragment.ComposeContent$lambda$17$lambda$16(this.f$0);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                    }
                    Function0 function04 = (Function0) objRememberedValue7;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    boolean zChangedInstance7 = composerStartRestartGroup.changedInstance(this);
                    Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance7 || objRememberedValue8 == companion2.getEmpty()) {
                        objRememberedValue8 = new Function0() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingSplashL2Fragment$$ExternalSyntheticLambda8
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return OptionOnboardingSplashL2Fragment.ComposeContent$lambda$19$lambda$18(this.f$0);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    OptionOnboardingSplashComposable.OptionOnboardingSplashComposable(immutableList, strStringResource2, loading2, function1, function04, (Function0) objRememberedValue8, null, composerStartRestartGroup, 3072, 64);
                    composer2 = composerStartRestartGroup;
                    composer2.endReplaceGroup();
                }
                composer2.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingSplashL2Fragment$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionOnboardingSplashL2Fragment.ComposeContent$lambda$20(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$5$lambda$4(OptionOnboardingSplashL2Fragment optionOnboardingSplashL2Fragment) {
        OptionOnboardingScreens2 callbacks = optionOnboardingSplashL2Fragment.getCallbacks();
        Companion companion = INSTANCE;
        callbacks.goToNextScreen(new ScreenRequest.SplashL2(((Args) companion.getArgs((Fragment) optionOnboardingSplashL2Fragment)).getScreenArgs().getScreenId()), ((Args) companion.getArgs((Fragment) optionOnboardingSplashL2Fragment)).getScreenArgs());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$7$lambda$6(OptionOnboardingSplashL2Fragment optionOnboardingSplashL2Fragment) {
        optionOnboardingSplashL2Fragment.requireActivity().onBackPressed();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$9$lambda$8(OptionOnboardingSplashL2Fragment optionOnboardingSplashL2Fragment) {
        Navigator navigator = optionOnboardingSplashL2Fragment.getNavigator();
        Context contextRequireContext = optionOnboardingSplashL2Fragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new PdfRendererIntentKey(OptionOnboardingSplashL2Fragment2.OPTIONS_LEVEL_3_LEARN_MORE_URL, ""), null, false, null, null, 60, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$11$lambda$10(OptionOnboardingSplashL2Fragment optionOnboardingSplashL2Fragment) {
        OptionOnboardingScreens2 callbacks = optionOnboardingSplashL2Fragment.getCallbacks();
        Companion companion = INSTANCE;
        callbacks.goToNextScreen(new ScreenRequest.SplashL2(((Args) companion.getArgs((Fragment) optionOnboardingSplashL2Fragment)).getScreenArgs().getScreenId()), ((Args) companion.getArgs((Fragment) optionOnboardingSplashL2Fragment)).getScreenArgs());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$13$lambda$12(OptionOnboardingSplashL2Fragment optionOnboardingSplashL2Fragment) {
        optionOnboardingSplashL2Fragment.requireActivity().onBackPressed();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$15$lambda$14(OptionPage it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$17$lambda$16(OptionOnboardingSplashL2Fragment optionOnboardingSplashL2Fragment) {
        optionOnboardingSplashL2Fragment.requireActivity().onBackPressed();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$19$lambda$18(OptionOnboardingSplashL2Fragment optionOnboardingSplashL2Fragment) {
        OptionOnboardingScreens2 callbacks = optionOnboardingSplashL2Fragment.getCallbacks();
        Companion companion = INSTANCE;
        callbacks.goToNextScreen(new ScreenRequest.SplashL2(((Args) companion.getArgs((Fragment) optionOnboardingSplashL2Fragment)).getScreenArgs().getScreenId()), ((Args) companion.getArgs((Fragment) optionOnboardingSplashL2Fragment)).getScreenArgs());
        return Unit.INSTANCE;
    }

    /* compiled from: OptionOnboardingSplashL2Fragment.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0006\u0010\u0018\u001a\u00020\u0019J\u0013\u0010\u001a\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/OptionOnboardingSplashL2Fragment$Args;", "Landroid/os/Parcelable;", "isFromPostTradeUpsell", "", "experimentState", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingExperimentState$SplashL2;", "locality", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "screenArgs", "Lcom/robinhood/android/optionsupgrade/ScreenArgs$SplashL2;", "<init>", "(ZLcom/robinhood/android/optionsupgrade/OptionOnboardingExperimentState$SplashL2;Lcom/robinhood/iso/countrycode/CountryCode$Supported;Lcom/robinhood/android/optionsupgrade/ScreenArgs$SplashL2;)V", "()Z", "getExperimentState", "()Lcom/robinhood/android/optionsupgrade/OptionOnboardingExperimentState$SplashL2;", "getLocality", "()Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "getScreenArgs", "()Lcom/robinhood/android/optionsupgrade/ScreenArgs$SplashL2;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final OptionOnboardingExperimentState.SplashL2 experimentState;
        private final boolean isFromPostTradeUpsell;
        private final CountryCode.Supported locality;
        private final ScreenArgs.SplashL2 screenArgs;

        /* compiled from: OptionOnboardingSplashL2Fragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readInt() != 0, (OptionOnboardingExperimentState.SplashL2) parcel.readParcelable(Args.class.getClassLoader()), (CountryCode.Supported) parcel.readSerializable(), ScreenArgs.SplashL2.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, boolean z, OptionOnboardingExperimentState.SplashL2 splashL2, CountryCode.Supported supported, ScreenArgs.SplashL2 splashL22, int i, Object obj) {
            if ((i & 1) != 0) {
                z = args.isFromPostTradeUpsell;
            }
            if ((i & 2) != 0) {
                splashL2 = args.experimentState;
            }
            if ((i & 4) != 0) {
                supported = args.locality;
            }
            if ((i & 8) != 0) {
                splashL22 = args.screenArgs;
            }
            return args.copy(z, splashL2, supported, splashL22);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsFromPostTradeUpsell() {
            return this.isFromPostTradeUpsell;
        }

        /* renamed from: component2, reason: from getter */
        public final OptionOnboardingExperimentState.SplashL2 getExperimentState() {
            return this.experimentState;
        }

        /* renamed from: component3, reason: from getter */
        public final CountryCode.Supported getLocality() {
            return this.locality;
        }

        /* renamed from: component4, reason: from getter */
        public final ScreenArgs.SplashL2 getScreenArgs() {
            return this.screenArgs;
        }

        public final Args copy(boolean isFromPostTradeUpsell, OptionOnboardingExperimentState.SplashL2 experimentState, CountryCode.Supported locality, ScreenArgs.SplashL2 screenArgs) {
            Intrinsics.checkNotNullParameter(experimentState, "experimentState");
            Intrinsics.checkNotNullParameter(locality, "locality");
            Intrinsics.checkNotNullParameter(screenArgs, "screenArgs");
            return new Args(isFromPostTradeUpsell, experimentState, locality, screenArgs);
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
            return this.isFromPostTradeUpsell == args.isFromPostTradeUpsell && Intrinsics.areEqual(this.experimentState, args.experimentState) && Intrinsics.areEqual(this.locality, args.locality) && Intrinsics.areEqual(this.screenArgs, args.screenArgs);
        }

        public int hashCode() {
            return (((((Boolean.hashCode(this.isFromPostTradeUpsell) * 31) + this.experimentState.hashCode()) * 31) + this.locality.hashCode()) * 31) + this.screenArgs.hashCode();
        }

        public String toString() {
            return "Args(isFromPostTradeUpsell=" + this.isFromPostTradeUpsell + ", experimentState=" + this.experimentState + ", locality=" + this.locality + ", screenArgs=" + this.screenArgs + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.isFromPostTradeUpsell ? 1 : 0);
            dest.writeParcelable(this.experimentState, flags);
            dest.writeSerializable(this.locality);
            this.screenArgs.writeToParcel(dest, flags);
        }

        public Args(boolean z, OptionOnboardingExperimentState.SplashL2 experimentState, CountryCode.Supported locality, ScreenArgs.SplashL2 screenArgs) {
            Intrinsics.checkNotNullParameter(experimentState, "experimentState");
            Intrinsics.checkNotNullParameter(locality, "locality");
            Intrinsics.checkNotNullParameter(screenArgs, "screenArgs");
            this.isFromPostTradeUpsell = z;
            this.experimentState = experimentState;
            this.locality = locality;
            this.screenArgs = screenArgs;
        }

        public final boolean isFromPostTradeUpsell() {
            return this.isFromPostTradeUpsell;
        }

        public final OptionOnboardingExperimentState.SplashL2 getExperimentState() {
            return this.experimentState;
        }

        public final CountryCode.Supported getLocality() {
            return this.locality;
        }

        public final ScreenArgs.SplashL2 getScreenArgs() {
            return this.screenArgs;
        }
    }

    /* compiled from: OptionOnboardingSplashL2Fragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/OptionOnboardingSplashL2Fragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingSplashL2Fragment;", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingSplashL2Fragment$Args;", "<init>", "()V", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<OptionOnboardingSplashL2Fragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(OptionOnboardingSplashL2Fragment optionOnboardingSplashL2Fragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, optionOnboardingSplashL2Fragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public OptionOnboardingSplashL2Fragment newInstance(Args args) {
            return (OptionOnboardingSplashL2Fragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(OptionOnboardingSplashL2Fragment optionOnboardingSplashL2Fragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, optionOnboardingSplashL2Fragment, args);
        }
    }
}
