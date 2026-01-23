package com.robinhood.android.optionsupgrade.p210uk;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.p011ui.graphics.Color;
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
import com.robinhood.android.optionsupgrade.p210uk.UkKnowledgeTestQuestionnaireFragment;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
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

/* compiled from: UkKnowledgeTestQuestionnaireFragment.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 /2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002./B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0017\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010$\u001a\u00020\u001bH\u0016J\b\u0010%\u001a\u00020\u001bH\u0016J\r\u0010&\u001a\u00020\u001bH\u0017¢\u0006\u0002\u0010'J\t\u0010(\u001a\u00020\u0007H\u0096\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R+\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00078B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0016\u0010\t\"\u0004\b\u0017\u0010\u0018R(\u0010\u001f\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\" #*\n\u0012\u0004\u0012\u00020\"\u0018\u00010!0!0 X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*X\u0096\u0005¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u00060"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/uk/UkKnowledgeTestQuestionnaireFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingScreen;", "<init>", "()V", "toolbarVisible", "", "getToolbarVisible", "()Z", "callbacks", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingScreenCallback;", "getCallbacks", "()Lcom/robinhood/android/optionsupgrade/OptionOnboardingScreenCallback;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "screenArgs", "Lcom/robinhood/android/optionsupgrade/ScreenArgs;", "getScreenArgs", "()Lcom/robinhood/android/optionsupgrade/ScreenArgs;", "<set-?>", "loading", "getLoading", "setLoading", "(Z)V", "loading$delegate", "Landroidx/compose/runtime/MutableState;", "", "isLoading", "currentScreenRequest", "Lcom/robinhood/android/optionsupgrade/ScreenRequest;", "questionnaireLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/robinhood/android/navigation/contracts/NavigationActivityResultContract$NavigationParams;", "Lcom/robinhood/shared/questionnaire/contracts/Questionnaire;", "kotlin.jvm.PlatformType", "onStart", "onStop", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Args", "Companion", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class UkKnowledgeTestQuestionnaireFragment extends GenericComposeFragment implements RegionGated, OptionOnboardingScreens {
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(OptionsRegionGate.INSTANCE);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(OptionOnboardingScreens2.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.optionsupgrade.uk.UkKnowledgeTestQuestionnaireFragment$special$$inlined$hostActivityCallbacks$1
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
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(UkKnowledgeTestQuestionnaireFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/optionsupgrade/OptionOnboardingScreenCallback;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(UkKnowledgeTestQuestionnaireFragment ukKnowledgeTestQuestionnaireFragment, int i, Composer composer, int i2) {
        ukKnowledgeTestQuestionnaireFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    public UkKnowledgeTestQuestionnaireFragment() {
        ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<Questionnaire>> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new QuestionnaireContract(new Function0() { // from class: com.robinhood.android.optionsupgrade.uk.UkKnowledgeTestQuestionnaireFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.getNavigator();
            }
        }), new ActivityResultCallback() { // from class: com.robinhood.android.optionsupgrade.uk.UkKnowledgeTestQuestionnaireFragment$questionnaireLauncher$2
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(QuestionnaireContract2 questionnaireContract2) {
                if (questionnaireContract2 instanceof QuestionnaireContract2.Completed) {
                    OptionOnboardingScreens2 callbacks = this.this$0.getCallbacks();
                    UkKnowledgeTestQuestionnaireFragment.Companion companion = UkKnowledgeTestQuestionnaireFragment.INSTANCE;
                    callbacks.goToNextScreen(new ScreenRequest.UkKnowledgeTestQuestionnaire(((UkKnowledgeTestQuestionnaireFragment.Args) companion.getArgs((Fragment) this.this$0)).getScreenArgs().getScreenId()), ((UkKnowledgeTestQuestionnaireFragment.Args) companion.getArgs((Fragment) this.this$0)).getScreenArgs());
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

    /* compiled from: UkKnowledgeTestQuestionnaireFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.optionsupgrade.uk.UkKnowledgeTestQuestionnaireFragment$ComposeContent$1 */
    static final class C252171 implements Function2<Composer, Integer, Unit> {
        C252171() {
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
                ComposerKt.traceEventStart(1903599340, i, -1, "com.robinhood.android.optionsupgrade.uk.UkKnowledgeTestQuestionnaireFragment.ComposeContent.<anonymous> (UkKnowledgeTestQuestionnaireFragment.kt:73)");
            }
            composer.startReplaceGroup(-297101780);
            if (UkKnowledgeTestQuestionnaireFragment.this.getLoading()) {
                LoadingScreenComposablesKt.GenericBoxesLoadingScreenComposable(null, composer, 0, 1);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return;
            }
            composer.endReplaceGroup();
            int i2 = C25121R.drawable.svg_ic_options_knowledge_test_splash;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            long solLight = bentoTheme.getColors(composer, i3).getSolLight();
            boolean loading = UkKnowledgeTestQuestionnaireFragment.this.getLoading();
            long jet = bentoTheme.getColors(composer, i3).getJet();
            Companion companion = UkKnowledgeTestQuestionnaireFragment.INSTANCE;
            String title = ((Args) companion.getArgs((Fragment) UkKnowledgeTestQuestionnaireFragment.this)).getTitle();
            String description = ((Args) companion.getArgs((Fragment) UkKnowledgeTestQuestionnaireFragment.this)).getDescription();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(UkKnowledgeTestQuestionnaireFragment.this);
            final UkKnowledgeTestQuestionnaireFragment ukKnowledgeTestQuestionnaireFragment = UkKnowledgeTestQuestionnaireFragment.this;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.optionsupgrade.uk.UkKnowledgeTestQuestionnaireFragment$ComposeContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UkKnowledgeTestQuestionnaireFragment.C252171.invoke$lambda$1$lambda$0(ukKnowledgeTestQuestionnaireFragment);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(UkKnowledgeTestQuestionnaireFragment.this);
            final UkKnowledgeTestQuestionnaireFragment ukKnowledgeTestQuestionnaireFragment2 = UkKnowledgeTestQuestionnaireFragment.this;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.optionsupgrade.uk.UkKnowledgeTestQuestionnaireFragment$ComposeContent$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UkKnowledgeTestQuestionnaireFragment.C252171.invoke$lambda$3$lambda$2(ukKnowledgeTestQuestionnaireFragment2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            I18nOptionsOnboardingSplashComposable3.m17392I18nOptionsOnboardingSplashComposableYeHINzE(i2, solLight, loading, title, description, function0, (Function0) objRememberedValue2, null, null, 0, 0L, 0L, Color.m6701boximpl(jet), null, composer, 0, 3072, 3968);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(UkKnowledgeTestQuestionnaireFragment ukKnowledgeTestQuestionnaireFragment) {
            ukKnowledgeTestQuestionnaireFragment.requireBaseActivity().finish();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(UkKnowledgeTestQuestionnaireFragment ukKnowledgeTestQuestionnaireFragment) {
            ActivityResultLauncher activityResultLauncher = ukKnowledgeTestQuestionnaireFragment.questionnaireLauncher;
            Companion companion = UkKnowledgeTestQuestionnaireFragment.INSTANCE;
            NavigationActivityResultContract3.launch$default(activityResultLauncher, new Questionnaire(false, ((Args) companion.getArgs((Fragment) ukKnowledgeTestQuestionnaireFragment)).getScreenArgs().getProductContext(), ((Args) companion.getArgs((Fragment) ukKnowledgeTestQuestionnaireFragment)).getAccountNumber(), null, null, null, false, true, true, false, false, null, null, true, true, false, false, false, new QuestionnaireProgressBarData(C25121R.string.option_upgrade_toolbar_title, 3, 4), null, 761464, null), null, false, 6, null);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-933153641);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-933153641, i2, -1, "com.robinhood.android.optionsupgrade.uk.UkKnowledgeTestQuestionnaireFragment.ComposeContent (UkKnowledgeTestQuestionnaireFragment.kt:71)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1903599340, true, new C252171(), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionsupgrade.uk.UkKnowledgeTestQuestionnaireFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UkKnowledgeTestQuestionnaireFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: UkKnowledgeTestQuestionnaireFragment.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/uk/UkKnowledgeTestQuestionnaireFragment$Args;", "Landroid/os/Parcelable;", "accountNumber", "", "title", "description", "screenArgs", "Lcom/robinhood/android/optionsupgrade/ScreenArgs$UkKnowledgeTestQuestionnaire;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/optionsupgrade/ScreenArgs$UkKnowledgeTestQuestionnaire;)V", "getAccountNumber", "()Ljava/lang/String;", "getTitle", "getDescription", "getScreenArgs", "()Lcom/robinhood/android/optionsupgrade/ScreenArgs$UkKnowledgeTestQuestionnaire;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String accountNumber;
        private final String description;
        private final ScreenArgs.UkKnowledgeTestQuestionnaire screenArgs;
        private final String title;

        /* compiled from: UkKnowledgeTestQuestionnaireFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readString(), parcel.readString(), parcel.readString(), ScreenArgs.UkKnowledgeTestQuestionnaire.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, String str, String str2, String str3, ScreenArgs.UkKnowledgeTestQuestionnaire ukKnowledgeTestQuestionnaire, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.accountNumber;
            }
            if ((i & 2) != 0) {
                str2 = args.title;
            }
            if ((i & 4) != 0) {
                str3 = args.description;
            }
            if ((i & 8) != 0) {
                ukKnowledgeTestQuestionnaire = args.screenArgs;
            }
            return args.copy(str, str2, str3, ukKnowledgeTestQuestionnaire);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* renamed from: component4, reason: from getter */
        public final ScreenArgs.UkKnowledgeTestQuestionnaire getScreenArgs() {
            return this.screenArgs;
        }

        public final Args copy(String accountNumber, String title, String description, ScreenArgs.UkKnowledgeTestQuestionnaire screenArgs) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(screenArgs, "screenArgs");
            return new Args(accountNumber, title, description, screenArgs);
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
            return Intrinsics.areEqual(this.accountNumber, args.accountNumber) && Intrinsics.areEqual(this.title, args.title) && Intrinsics.areEqual(this.description, args.description) && Intrinsics.areEqual(this.screenArgs, args.screenArgs);
        }

        public int hashCode() {
            return (((((this.accountNumber.hashCode() * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + this.screenArgs.hashCode();
        }

        public String toString() {
            return "Args(accountNumber=" + this.accountNumber + ", title=" + this.title + ", description=" + this.description + ", screenArgs=" + this.screenArgs + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.accountNumber);
            dest.writeString(this.title);
            dest.writeString(this.description);
            this.screenArgs.writeToParcel(dest, flags);
        }

        public Args(String accountNumber, String title, String description, ScreenArgs.UkKnowledgeTestQuestionnaire screenArgs) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(screenArgs, "screenArgs");
            this.accountNumber = accountNumber;
            this.title = title;
            this.description = description;
            this.screenArgs = screenArgs;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getDescription() {
            return this.description;
        }

        public final ScreenArgs.UkKnowledgeTestQuestionnaire getScreenArgs() {
            return this.screenArgs;
        }
    }

    /* compiled from: UkKnowledgeTestQuestionnaireFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/uk/UkKnowledgeTestQuestionnaireFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/optionsupgrade/uk/UkKnowledgeTestQuestionnaireFragment;", "Lcom/robinhood/android/optionsupgrade/uk/UkKnowledgeTestQuestionnaireFragment$Args;", "<init>", "()V", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<UkKnowledgeTestQuestionnaireFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(UkKnowledgeTestQuestionnaireFragment ukKnowledgeTestQuestionnaireFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, ukKnowledgeTestQuestionnaireFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public UkKnowledgeTestQuestionnaireFragment newInstance(Args args) {
            return (UkKnowledgeTestQuestionnaireFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(UkKnowledgeTestQuestionnaireFragment ukKnowledgeTestQuestionnaireFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, ukKnowledgeTestQuestionnaireFragment, args);
        }
    }
}
