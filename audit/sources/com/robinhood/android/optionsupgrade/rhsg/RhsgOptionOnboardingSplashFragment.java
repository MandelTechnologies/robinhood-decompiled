package com.robinhood.android.optionsupgrade.rhsg;

import android.content.Context;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.navigation.app.keys.data.OptionPage;
import com.robinhood.android.optionsupgrade.C25121R;
import com.robinhood.android.optionsupgrade.OptionOnboardingScreens;
import com.robinhood.android.optionsupgrade.OptionOnboardingScreens2;
import com.robinhood.android.optionsupgrade.ScreenArgs;
import com.robinhood.android.optionsupgrade.ScreenRequest;
import com.robinhood.android.optionsupgrade.SplashPage;
import com.robinhood.android.optionsupgrade.rhsg.RhsgOptionOnboardingSplashFragment;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
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

/* compiled from: RhsgOptionOnboardingSplashFragment.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 '2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001'B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0015\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\r\u0010\u001f\u001a\u00020\u0019H\u0017¢\u0006\u0002\u0010 J\t\u0010!\u001a\u00020\u0011H\u0096\u0001R\u001b\u0010\u0006\u001a\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00118B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001d\u001a\u00020\u0011X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0018\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#X\u0096\u0005¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/rhsg/RhsgOptionOnboardingSplashFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingScreen;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingScreenCallback;", "getCallbacks", "()Lcom/robinhood/android/optionsupgrade/OptionOnboardingScreenCallback;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "screenArgs", "Lcom/robinhood/android/optionsupgrade/ScreenArgs;", "getScreenArgs", "()Lcom/robinhood/android/optionsupgrade/ScreenArgs;", "<set-?>", "", "loading", "getLoading", "()Z", "setLoading", "(Z)V", "loading$delegate", "Landroidx/compose/runtime/MutableState;", "", "isLoading", "currentScreenRequest", "Lcom/robinhood/android/optionsupgrade/ScreenRequest;", "toolbarVisible", "getToolbarVisible", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class RhsgOptionOnboardingSplashFragment extends GenericComposeFragment implements RegionGated, OptionOnboardingScreens {
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(OptionsRegionGate.INSTANCE);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(OptionOnboardingScreens2.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.optionsupgrade.rhsg.RhsgOptionOnboardingSplashFragment$special$$inlined$hostActivityCallbacks$1
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

    /* renamed from: loading$delegate, reason: from kotlin metadata */
    private final SnapshotState loading = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    private final boolean toolbarVisible;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RhsgOptionOnboardingSplashFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/optionsupgrade/OptionOnboardingScreenCallback;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(RhsgOptionOnboardingSplashFragment rhsgOptionOnboardingSplashFragment, int i, Composer composer, int i2) {
        rhsgOptionOnboardingSplashFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    @Override // com.robinhood.android.optionsupgrade.OptionOnboardingScreens
    public OptionOnboardingScreens2 getCallbacks() {
        return (OptionOnboardingScreens2) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.optionsupgrade.OptionOnboardingScreens
    public ScreenArgs getScreenArgs() {
        return (ScreenArgs) INSTANCE.getArgs((Fragment) this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getLoading() {
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

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1856660211);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1856660211, i2, -1, "com.robinhood.android.optionsupgrade.rhsg.RhsgOptionOnboardingSplashFragment.ComposeContent (RhsgOptionOnboardingSplashFragment.kt:43)");
            }
            int i3 = C25121R.drawable.svg_ic_upgrade_splash_1;
            String string2 = getString(C25121R.string.option_upgrade_splash_page_one_title_sg);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            String string3 = getString(C25121R.string.gated_etf_option_upgrade_splash_page_one_detail_sg);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            SplashPage splashPage = new SplashPage(i3, string2, string3, OptionPage.FREE_OPTIONS_TRADING);
            int i4 = C25121R.drawable.svg_ic_options_chess;
            String string4 = getString(C25121R.string.option_upgrade_splash_page_two_title);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            String string5 = getString(C25121R.string.option_upgrade_splash_page_two_detail);
            Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
            SplashPage splashPage2 = new SplashPage(i4, string4, string5, OptionPage.CHOOSE_YOUR_STRATEGY);
            int i5 = C25121R.drawable.svg_ic_upgrade_splash_3;
            String string6 = getString(C25121R.string.options_upgrade_splash_title_3);
            Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
            String string7 = getString(C25121R.string.options_upgrade_splash_description_3_sg);
            Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(693132936, true, new C251821(extensions2.persistentListOf(splashPage, splashPage2, new SplashPage(i5, string6, string7, null, 8, null))), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionsupgrade.rhsg.RhsgOptionOnboardingSplashFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RhsgOptionOnboardingSplashFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: RhsgOptionOnboardingSplashFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.optionsupgrade.rhsg.RhsgOptionOnboardingSplashFragment$ComposeContent$1 */
    static final class C251821 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ ImmutableList<SplashPage> $pages;

        C251821(ImmutableList<SplashPage> immutableList) {
            this.$pages = immutableList;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            String strStringResource;
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(693132936, i, -1, "com.robinhood.android.optionsupgrade.rhsg.RhsgOptionOnboardingSplashFragment.ComposeContent.<anonymous> (RhsgOptionOnboardingSplashFragment.kt:65)");
            }
            boolean loading = RhsgOptionOnboardingSplashFragment.this.getLoading();
            if (((ScreenArgs.RhsgSplash) RhsgOptionOnboardingSplashFragment.INSTANCE.getArgs((Fragment) RhsgOptionOnboardingSplashFragment.this)).getShowGstDisclosure()) {
                composer.startReplaceGroup(-1079277782);
                strStringResource = StringResources_androidKt.stringResource(C25121R.string.f4821x8886da7b, composer, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1079097176);
                strStringResource = StringResources_androidKt.stringResource(C25121R.string.f4820x823226f8, composer, 0);
                composer.endReplaceGroup();
            }
            String str = strStringResource;
            ImmutableList<SplashPage> immutableList = this.$pages;
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(RhsgOptionOnboardingSplashFragment.this);
            final RhsgOptionOnboardingSplashFragment rhsgOptionOnboardingSplashFragment = RhsgOptionOnboardingSplashFragment.this;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.optionsupgrade.rhsg.RhsgOptionOnboardingSplashFragment$ComposeContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return RhsgOptionOnboardingSplashFragment.C251821.invoke$lambda$1$lambda$0(rhsgOptionOnboardingSplashFragment, (OptionPage) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function1 function1 = (Function1) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(RhsgOptionOnboardingSplashFragment.this);
            final RhsgOptionOnboardingSplashFragment rhsgOptionOnboardingSplashFragment2 = RhsgOptionOnboardingSplashFragment.this;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.optionsupgrade.rhsg.RhsgOptionOnboardingSplashFragment$ComposeContent$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RhsgOptionOnboardingSplashFragment.C251821.invoke$lambda$3$lambda$2(rhsgOptionOnboardingSplashFragment2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function0 function0 = (Function0) objRememberedValue2;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance3 = composer.changedInstance(RhsgOptionOnboardingSplashFragment.this);
            final RhsgOptionOnboardingSplashFragment rhsgOptionOnboardingSplashFragment3 = RhsgOptionOnboardingSplashFragment.this;
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.optionsupgrade.rhsg.RhsgOptionOnboardingSplashFragment$ComposeContent$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RhsgOptionOnboardingSplashFragment.C251821.invoke$lambda$5$lambda$4(rhsgOptionOnboardingSplashFragment3);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            RhsgOptionOnboardingSplashComposable3.ApacOptionOnboardingSplashComposable(immutableList, str, loading, function1, function0, (Function0) objRememberedValue3, null, composer, 0, 64);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(RhsgOptionOnboardingSplashFragment rhsgOptionOnboardingSplashFragment, OptionPage optionPage) {
            Intrinsics.checkNotNullParameter(optionPage, "optionPage");
            Navigator navigator = rhsgOptionOnboardingSplashFragment.getNavigator();
            Context contextRequireContext = rhsgOptionOnboardingSplashFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new LegacyIntentKey.ReferenceManual.Options(optionPage), null, false, null, null, 60, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(RhsgOptionOnboardingSplashFragment rhsgOptionOnboardingSplashFragment) {
            OptionOnboardingScreens2 callbacks = rhsgOptionOnboardingSplashFragment.getCallbacks();
            Companion companion = RhsgOptionOnboardingSplashFragment.INSTANCE;
            callbacks.goToNextScreen(new ScreenRequest.RhsgSplashL0(((ScreenArgs.RhsgSplash) companion.getArgs((Fragment) rhsgOptionOnboardingSplashFragment)).getScreenId()), (ScreenArgs) companion.getArgs((Fragment) rhsgOptionOnboardingSplashFragment));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$4(RhsgOptionOnboardingSplashFragment rhsgOptionOnboardingSplashFragment) {
            rhsgOptionOnboardingSplashFragment.requireBaseActivity().finish();
            return Unit.INSTANCE;
        }
    }

    /* compiled from: RhsgOptionOnboardingSplashFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/rhsg/RhsgOptionOnboardingSplashFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/optionsupgrade/rhsg/RhsgOptionOnboardingSplashFragment;", "Lcom/robinhood/android/optionsupgrade/ScreenArgs$RhsgSplash;", "<init>", "()V", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<RhsgOptionOnboardingSplashFragment, ScreenArgs.RhsgSplash> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public ScreenArgs.RhsgSplash getArgs(RhsgOptionOnboardingSplashFragment rhsgOptionOnboardingSplashFragment) {
            return (ScreenArgs.RhsgSplash) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, rhsgOptionOnboardingSplashFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public RhsgOptionOnboardingSplashFragment newInstance(ScreenArgs.RhsgSplash rhsgSplash) {
            return (RhsgOptionOnboardingSplashFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, rhsgSplash);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(RhsgOptionOnboardingSplashFragment rhsgOptionOnboardingSplashFragment, ScreenArgs.RhsgSplash rhsgSplash) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, rhsgOptionOnboardingSplashFragment, rhsgSplash);
        }
    }
}
