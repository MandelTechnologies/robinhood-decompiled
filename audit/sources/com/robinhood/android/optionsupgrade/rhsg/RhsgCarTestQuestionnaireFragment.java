package com.robinhood.android.optionsupgrade.rhsg;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.core.view.WindowCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract3;
import com.robinhood.android.optionsupgrade.C25121R;
import com.robinhood.android.optionsupgrade.I18nOptionsOnboardingSplashComposable3;
import com.robinhood.android.optionsupgrade.OptionOnboardingScreens;
import com.robinhood.android.optionsupgrade.OptionOnboardingScreens2;
import com.robinhood.android.optionsupgrade.ScreenArgs;
import com.robinhood.android.optionsupgrade.ScreenRequest;
import com.robinhood.android.optionsupgrade.rhsg.RhsgCarTestQuestionnaireFragment;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.questionnaire.contracts.Questionnaire;
import com.robinhood.shared.questionnaire.contracts.QuestionnaireContract;
import com.robinhood.shared.questionnaire.contracts.QuestionnaireContract2;
import com.robinhood.shared.questionnaire.contracts.QuestionnaireProgressBarData;
import com.robinhood.utils.extensions.ViewsKt;
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

/* compiled from: RhsgCarTestQuestionnaireFragment.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 02\u00020\u00012\u00020\u00022\u00020\u0003:\u0002/0B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0017\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010$\u001a\u00020\u001bH\u0016J\b\u0010%\u001a\u00020\u001bH\u0016J\r\u0010&\u001a\u00020\u001bH\u0017¢\u0006\u0002\u0010'J\b\u0010(\u001a\u00020\u001bH\u0002J\t\u0010)\u001a\u00020\u0007H\u0096\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R+\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00078B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0016\u0010\t\"\u0004\b\u0017\u0010\u0018R(\u0010\u001f\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\" #*\n\u0012\u0004\u0012\u00020\"\u0018\u00010!0!0 X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+X\u0096\u0005¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00061"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/rhsg/RhsgCarTestQuestionnaireFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingScreen;", "<init>", "()V", "toolbarVisible", "", "getToolbarVisible", "()Z", "callbacks", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingScreenCallback;", "getCallbacks", "()Lcom/robinhood/android/optionsupgrade/OptionOnboardingScreenCallback;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "screenArgs", "Lcom/robinhood/android/optionsupgrade/ScreenArgs;", "getScreenArgs", "()Lcom/robinhood/android/optionsupgrade/ScreenArgs;", "<set-?>", "loading", "getLoading", "setLoading", "(Z)V", "loading$delegate", "Landroidx/compose/runtime/MutableState;", "", "isLoading", "currentScreenRequest", "Lcom/robinhood/android/optionsupgrade/ScreenRequest;", "questionnaireLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/robinhood/android/navigation/contracts/NavigationActivityResultContract$NavigationParams;", "Lcom/robinhood/shared/questionnaire/contracts/Questionnaire;", "kotlin.jvm.PlatformType", "onStart", "onStop", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "launchCarQuestionnaire", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Args", "Companion", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class RhsgCarTestQuestionnaireFragment extends GenericComposeFragment implements RegionGated, OptionOnboardingScreens {
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(OptionsRegionGate.INSTANCE);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(OptionOnboardingScreens2.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.optionsupgrade.rhsg.RhsgCarTestQuestionnaireFragment$special$$inlined$hostActivityCallbacks$1
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
    private final ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<Questionnaire>> questionnaireLauncher;
    private final boolean toolbarVisible;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RhsgCarTestQuestionnaireFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/optionsupgrade/OptionOnboardingScreenCallback;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(RhsgCarTestQuestionnaireFragment rhsgCarTestQuestionnaireFragment, int i, Composer composer, int i2) {
        rhsgCarTestQuestionnaireFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    public RhsgCarTestQuestionnaireFragment() {
        ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<Questionnaire>> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new QuestionnaireContract(new Function0() { // from class: com.robinhood.android.optionsupgrade.rhsg.RhsgCarTestQuestionnaireFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.getNavigator();
            }
        }), new ActivityResultCallback() { // from class: com.robinhood.android.optionsupgrade.rhsg.RhsgCarTestQuestionnaireFragment$questionnaireLauncher$2
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(QuestionnaireContract2 questionnaireContract2) {
                if (questionnaireContract2 instanceof QuestionnaireContract2.Completed) {
                    OptionOnboardingScreens2 callbacks = this.this$0.getCallbacks();
                    RhsgCarTestQuestionnaireFragment.Companion companion = RhsgCarTestQuestionnaireFragment.INSTANCE;
                    callbacks.goToNextScreen(new ScreenRequest.RhsgCustomerAccountReviewQuestionnaire(((RhsgCarTestQuestionnaireFragment.Args) companion.getArgs((Fragment) this.this$0)).getScreenArgs().getScreenId()), ((RhsgCarTestQuestionnaireFragment.Args) companion.getArgs((Fragment) this.this$0)).getScreenArgs());
                } else if ((questionnaireContract2 instanceof QuestionnaireContract2.Canceled) && ((RhsgCarTestQuestionnaireFragment.Args) RhsgCarTestQuestionnaireFragment.INSTANCE.getArgs((Fragment) this.this$0)).getSkipSplashScreen()) {
                    this.this$0.requireBaseActivity().onBackPressed();
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.questionnaireLauncher = activityResultLauncherRegisterForActivityResult;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    @Override // com.robinhood.android.optionsupgrade.OptionOnboardingScreens
    public OptionOnboardingScreens2 getCallbacks() {
        return (OptionOnboardingScreens2) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.optionsupgrade.OptionOnboardingScreens
    public ScreenArgs getScreenArgs() {
        return ((Args) INSTANCE.getArgs((Fragment) this)).getScreenArgs();
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

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        WindowCompat.setDecorFitsSystemWindows(requireActivity().getWindow(), false);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        RhToolbar rhToolbar = getRhToolbar();
        if (rhToolbar != null) {
            ViewsKt.setMarginTop(rhToolbar, 0);
        }
        WindowCompat.setDecorFitsSystemWindows(requireActivity().getWindow(), true);
    }

    /* compiled from: RhsgCarTestQuestionnaireFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.optionsupgrade.rhsg.RhsgCarTestQuestionnaireFragment$ComposeContent$1 */
    static final class C251651 implements Function2<Composer, Integer, Unit> {
        C251651() {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1777208132, i, -1, "com.robinhood.android.optionsupgrade.rhsg.RhsgCarTestQuestionnaireFragment.ComposeContent.<anonymous> (RhsgCarTestQuestionnaireFragment.kt:84)");
            }
            composer.startReplaceGroup(1499970065);
            if (RhsgCarTestQuestionnaireFragment.this.getLoading()) {
                Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(Modifier.INSTANCE);
                long jM21371getBg0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU();
                RhsgCarTestQuestionnaireFragment2 rhsgCarTestQuestionnaireFragment2 = RhsgCarTestQuestionnaireFragment2.INSTANCE;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifierNavigationBarsPadding, rhsgCarTestQuestionnaireFragment2.getLambda$1828448125$feature_options_upgrade_externalDebug(), null, null, null, 0, jM21371getBg0d7_KjU, 0L, null, rhsgCarTestQuestionnaireFragment2.getLambda$960654418$feature_options_upgrade_externalDebug(), composer, 805306416, 444);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return;
            }
            composer.endReplaceGroup();
            if (((Args) RhsgCarTestQuestionnaireFragment.INSTANCE.getArgs((Fragment) RhsgCarTestQuestionnaireFragment.this)).getSkipSplashScreen()) {
                RhsgCarTestQuestionnaireFragment.this.launchCarQuestionnaire();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            int i2 = C25121R.drawable.svg_ic_options_knowledge_test_splash;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            long hydroDark = bentoTheme.getColors(composer, i3).getHydroDark();
            boolean loading = RhsgCarTestQuestionnaireFragment.this.getLoading();
            long jet = bentoTheme.getColors(composer, i3).getJet();
            String strStringResource = StringResources_androidKt.stringResource(C25121R.string.splash_title_car, composer, 0);
            String strStringResource2 = StringResources_androidKt.stringResource(C25121R.string.splash_body_car, composer, 0);
            String strStringResource3 = StringResources_androidKt.stringResource(C25121R.string.splash_disclosure_car, composer, 0);
            int iM7919getCentere0LSkKk = TextAlign.INSTANCE.m7919getCentere0LSkKk();
            long jM21426getFg20d7_KjU = bentoTheme.getColors(composer, i3).m21426getFg20d7_KjU();
            long jM21426getFg20d7_KjU2 = bentoTheme.getColors(composer, i3).m21426getFg20d7_KjU();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(RhsgCarTestQuestionnaireFragment.this);
            final RhsgCarTestQuestionnaireFragment rhsgCarTestQuestionnaireFragment = RhsgCarTestQuestionnaireFragment.this;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.optionsupgrade.rhsg.RhsgCarTestQuestionnaireFragment$ComposeContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RhsgCarTestQuestionnaireFragment.C251651.invoke$lambda$1$lambda$0(rhsgCarTestQuestionnaireFragment);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(RhsgCarTestQuestionnaireFragment.this);
            final RhsgCarTestQuestionnaireFragment rhsgCarTestQuestionnaireFragment3 = RhsgCarTestQuestionnaireFragment.this;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.optionsupgrade.rhsg.RhsgCarTestQuestionnaireFragment$ComposeContent$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RhsgCarTestQuestionnaireFragment.C251651.invoke$lambda$3$lambda$2(rhsgCarTestQuestionnaireFragment3);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            I18nOptionsOnboardingSplashComposable3.m17392I18nOptionsOnboardingSplashComposableYeHINzE(i2, hydroDark, loading, strStringResource, strStringResource2, function0, (Function0) objRememberedValue2, null, null, iM7919getCentere0LSkKk, jM21426getFg20d7_KjU, jM21426getFg20d7_KjU2, Color.m6701boximpl(jet), strStringResource3, composer, 0, 0, 384);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(RhsgCarTestQuestionnaireFragment rhsgCarTestQuestionnaireFragment) {
            rhsgCarTestQuestionnaireFragment.requireBaseActivity().finish();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(RhsgCarTestQuestionnaireFragment rhsgCarTestQuestionnaireFragment) {
            rhsgCarTestQuestionnaireFragment.launchCarQuestionnaire();
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1063052967);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1063052967, i2, -1, "com.robinhood.android.optionsupgrade.rhsg.RhsgCarTestQuestionnaireFragment.ComposeContent (RhsgCarTestQuestionnaireFragment.kt:82)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1777208132, true, new C251651(), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionsupgrade.rhsg.RhsgCarTestQuestionnaireFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RhsgCarTestQuestionnaireFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void launchCarQuestionnaire() {
        ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<Questionnaire>> activityResultLauncher = this.questionnaireLauncher;
        Companion companion = INSTANCE;
        NavigationActivityResultContract3.launch$default(activityResultLauncher, new Questionnaire(false, ((Args) companion.getArgs((Fragment) this)).getScreenArgs().getProductContext(), ((Args) companion.getArgs((Fragment) this)).getAccountNumber(), null, null, null, false, true, true, false, false, null, null, true, true, false, false, false, new QuestionnaireProgressBarData(C25121R.string.questionnaire_toolbar_title, 0, 0), null, 761464, null), null, false, 6, null);
    }

    /* compiled from: RhsgCarTestQuestionnaireFragment.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/rhsg/RhsgCarTestQuestionnaireFragment$Args;", "Landroid/os/Parcelable;", "accountNumber", "", "skipSplashScreen", "", "screenArgs", "Lcom/robinhood/android/optionsupgrade/ScreenArgs$RhsgCustomerAccountReviewQuestionnaire;", "<init>", "(Ljava/lang/String;ZLcom/robinhood/android/optionsupgrade/ScreenArgs$RhsgCustomerAccountReviewQuestionnaire;)V", "getAccountNumber", "()Ljava/lang/String;", "getSkipSplashScreen", "()Z", "getScreenArgs", "()Lcom/robinhood/android/optionsupgrade/ScreenArgs$RhsgCustomerAccountReviewQuestionnaire;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String accountNumber;
        private final ScreenArgs.RhsgCustomerAccountReviewQuestionnaire screenArgs;
        private final boolean skipSplashScreen;

        /* compiled from: RhsgCarTestQuestionnaireFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readString(), parcel.readInt() != 0, ScreenArgs.RhsgCustomerAccountReviewQuestionnaire.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, String str, boolean z, ScreenArgs.RhsgCustomerAccountReviewQuestionnaire rhsgCustomerAccountReviewQuestionnaire, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.accountNumber;
            }
            if ((i & 2) != 0) {
                z = args.skipSplashScreen;
            }
            if ((i & 4) != 0) {
                rhsgCustomerAccountReviewQuestionnaire = args.screenArgs;
            }
            return args.copy(str, z, rhsgCustomerAccountReviewQuestionnaire);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getSkipSplashScreen() {
            return this.skipSplashScreen;
        }

        /* renamed from: component3, reason: from getter */
        public final ScreenArgs.RhsgCustomerAccountReviewQuestionnaire getScreenArgs() {
            return this.screenArgs;
        }

        public final Args copy(String accountNumber, boolean skipSplashScreen, ScreenArgs.RhsgCustomerAccountReviewQuestionnaire screenArgs) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(screenArgs, "screenArgs");
            return new Args(accountNumber, skipSplashScreen, screenArgs);
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
            return Intrinsics.areEqual(this.accountNumber, args.accountNumber) && this.skipSplashScreen == args.skipSplashScreen && Intrinsics.areEqual(this.screenArgs, args.screenArgs);
        }

        public int hashCode() {
            return (((this.accountNumber.hashCode() * 31) + Boolean.hashCode(this.skipSplashScreen)) * 31) + this.screenArgs.hashCode();
        }

        public String toString() {
            return "Args(accountNumber=" + this.accountNumber + ", skipSplashScreen=" + this.skipSplashScreen + ", screenArgs=" + this.screenArgs + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.accountNumber);
            dest.writeInt(this.skipSplashScreen ? 1 : 0);
            this.screenArgs.writeToParcel(dest, flags);
        }

        public Args(String accountNumber, boolean z, ScreenArgs.RhsgCustomerAccountReviewQuestionnaire screenArgs) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(screenArgs, "screenArgs");
            this.accountNumber = accountNumber;
            this.skipSplashScreen = z;
            this.screenArgs = screenArgs;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final boolean getSkipSplashScreen() {
            return this.skipSplashScreen;
        }

        public final ScreenArgs.RhsgCustomerAccountReviewQuestionnaire getScreenArgs() {
            return this.screenArgs;
        }
    }

    /* compiled from: RhsgCarTestQuestionnaireFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/rhsg/RhsgCarTestQuestionnaireFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/optionsupgrade/rhsg/RhsgCarTestQuestionnaireFragment;", "Lcom/robinhood/android/optionsupgrade/rhsg/RhsgCarTestQuestionnaireFragment$Args;", "<init>", "()V", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<RhsgCarTestQuestionnaireFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(RhsgCarTestQuestionnaireFragment rhsgCarTestQuestionnaireFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, rhsgCarTestQuestionnaireFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public RhsgCarTestQuestionnaireFragment newInstance(Args args) {
            return (RhsgCarTestQuestionnaireFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(RhsgCarTestQuestionnaireFragment rhsgCarTestQuestionnaireFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, rhsgCarTestQuestionnaireFragment, args);
        }
    }
}
