package com.robinhood.android.optionsupgrade;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.view.result.ActivityResult;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.contract.ActivityResultContracts$StartActivityForResult;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.optionsupgrade.OptionOnboardingScreens;
import com.robinhood.android.optionsupgrade.OptionOnboardingSuitabilityShimFragment;
import com.robinhood.android.optionsupgrade.ScreenArgs;
import com.robinhood.android.optionsupgrade.ScreenRequest;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.identi.InvestmentProfileStore;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.questionnaire.contracts.Questionnaire;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import io.reactivex.Observable;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: OptionOnboardingSuitabilityShimFragment.kt */
@Metadata(m3635d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 ;2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001;B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0016J\r\u00100\u001a\u00020&H\u0017¢\u0006\u0002\u00101J\u0012\u00102\u001a\u00020&2\b\u00103\u001a\u0004\u0018\u000104H\u0016J\t\u00105\u001a\u00020(H\u0096\u0001R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0012\u001a\u00020\u00138VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR+\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001d8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010+\u001a\u0010\u0012\f\u0012\n .*\u0004\u0018\u00010-0-0,X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b/\u0010\u0005R\u0018\u00106\u001a\b\u0012\u0004\u0012\u00020807X\u0096\u0005¢\u0006\u0006\u001a\u0004\b9\u0010:¨\u0006<"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/OptionOnboardingSuitabilityShimFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingScreen;", "<init>", "()V", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "getExperimentsStore", "()Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "setExperimentsStore", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;)V", "investmentProfileStore", "Lcom/robinhood/librobinhood/data/store/identi/InvestmentProfileStore;", "getInvestmentProfileStore", "()Lcom/robinhood/librobinhood/data/store/identi/InvestmentProfileStore;", "setInvestmentProfileStore", "(Lcom/robinhood/librobinhood/data/store/identi/InvestmentProfileStore;)V", "callbacks", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingScreenCallback;", "getCallbacks", "()Lcom/robinhood/android/optionsupgrade/OptionOnboardingScreenCallback;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "screenArgs", "Lcom/robinhood/android/optionsupgrade/ScreenArgs;", "getScreenArgs", "()Lcom/robinhood/android/optionsupgrade/ScreenArgs;", "<set-?>", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingSuitabilityShimViewState;", "viewState", "getViewState", "()Lcom/robinhood/android/optionsupgrade/OptionOnboardingSuitabilityShimViewState;", "setViewState", "(Lcom/robinhood/android/optionsupgrade/OptionOnboardingSuitabilityShimViewState;)V", "viewState$delegate", "Landroidx/compose/runtime/MutableState;", "setLoading", "", "isLoading", "", "currentScreenRequest", "Lcom/robinhood/android/optionsupgrade/ScreenRequest;", "suitabilityLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "getSuitabilityLauncher$annotations", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionOnboardingSuitabilityShimFragment extends GenericComposeFragment implements RegionGated, OptionOnboardingScreens {
    public ExperimentsStore experimentsStore;
    public InvestmentProfileStore investmentProfileStore;
    private final ActivityResultLauncher<Intent> suitabilityLauncher;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(OptionOnboardingSuitabilityShimFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/optionsupgrade/OptionOnboardingScreenCallback;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(OptionsRegionGate.INSTANCE);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(OptionOnboardingScreens2.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingSuitabilityShimFragment$special$$inlined$hostActivityCallbacks$1
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

    /* renamed from: viewState$delegate, reason: from kotlin metadata */
    private final SnapshotState viewState = SnapshotState3.mutableStateOf$default(new OptionOnboardingSuitabilityShimViewState(false), null, 2, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(OptionOnboardingSuitabilityShimFragment optionOnboardingSuitabilityShimFragment, int i, Composer composer, int i2) {
        optionOnboardingSuitabilityShimFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    private static /* synthetic */ void getSuitabilityLauncher$annotations() {
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

    public OptionOnboardingSuitabilityShimFragment() {
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new ActivityResultCallback() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingSuitabilityShimFragment$suitabilityLauncher$1
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(ActivityResult result) {
                Intrinsics.checkNotNullParameter(result, "result");
                if (result.getResultCode() == -1) {
                    OptionOnboardingScreens2 callbacks = this.this$0.getCallbacks();
                    OptionOnboardingSuitabilityShimFragment.Companion companion = OptionOnboardingSuitabilityShimFragment.INSTANCE;
                    callbacks.goToNextScreen(new ScreenRequest.Suitability(((ScreenArgs.Suitability) companion.getArgs((Fragment) this.this$0)).getScreenId()), (ScreenArgs) companion.getArgs((Fragment) this.this$0));
                    return;
                }
                this.this$0.requireActivity().onBackPressed();
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.suitabilityLauncher = activityResultLauncherRegisterForActivityResult;
    }

    public final ExperimentsStore getExperimentsStore() {
        ExperimentsStore experimentsStore = this.experimentsStore;
        if (experimentsStore != null) {
            return experimentsStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("experimentsStore");
        return null;
    }

    public final void setExperimentsStore(ExperimentsStore experimentsStore) {
        Intrinsics.checkNotNullParameter(experimentsStore, "<set-?>");
        this.experimentsStore = experimentsStore;
    }

    public final InvestmentProfileStore getInvestmentProfileStore() {
        InvestmentProfileStore investmentProfileStore = this.investmentProfileStore;
        if (investmentProfileStore != null) {
            return investmentProfileStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("investmentProfileStore");
        return null;
    }

    public final void setInvestmentProfileStore(InvestmentProfileStore investmentProfileStore) {
        Intrinsics.checkNotNullParameter(investmentProfileStore, "<set-?>");
        this.investmentProfileStore = investmentProfileStore;
    }

    @Override // com.robinhood.android.optionsupgrade.OptionOnboardingScreens
    public OptionOnboardingScreens2 getCallbacks() {
        return (OptionOnboardingScreens2) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.optionsupgrade.OptionOnboardingScreens
    public ScreenArgs getScreenArgs() {
        return (ScreenArgs) INSTANCE.getArgs((Fragment) this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final OptionOnboardingSuitabilityShimViewState getViewState() {
        return (OptionOnboardingSuitabilityShimViewState) this.viewState.getValue();
    }

    private final void setViewState(OptionOnboardingSuitabilityShimViewState optionOnboardingSuitabilityShimViewState) {
        this.viewState.setValue(optionOnboardingSuitabilityShimViewState);
    }

    @Override // com.robinhood.android.optionsupgrade.OptionOnboardingScreens
    public void setLoading(boolean isLoading, ScreenRequest currentScreenRequest) {
        Intrinsics.checkNotNullParameter(currentScreenRequest, "currentScreenRequest");
        setViewState(getViewState().copy(isLoading));
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1300355001);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1300355001, i2, -1, "com.robinhood.android.optionsupgrade.OptionOnboardingSuitabilityShimFragment.ComposeContent (OptionOnboardingSuitabilityShimFragment.kt:52)");
            }
            if (getViewState().isLoading()) {
                LoadingScreenComposablesKt.ListLoadingScreenComposable(null, true, false, 3, composerStartRestartGroup, 3120, 5);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingSuitabilityShimFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionOnboardingSuitabilityShimFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            InvestmentProfileStore investmentProfileStore = getInvestmentProfileStore();
            Companion companion = INSTANCE;
            Observable observableTake = investmentProfileStore.fetchQuestionnaireCompleted(((ScreenArgs.Suitability) companion.getArgs((Fragment) this)).getContext(), ((ScreenArgs.Suitability) companion.getArgs((Fragment) this)).getAccountNumber(), true).andThen(getInvestmentProfileStore().getQuestionnaireCompleted(((ScreenArgs.Suitability) companion.getArgs((Fragment) this)).getContext(), ((ScreenArgs.Suitability) companion.getArgs((Fragment) this)).getAccountNumber())).take(1L);
            Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
            LifecycleHost.DefaultImpls.bind$default(this, observableTake, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingSuitabilityShimFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OptionOnboardingSuitabilityShimFragment.onCreate$lambda$1(this.f$0, (Boolean) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(OptionOnboardingSuitabilityShimFragment optionOnboardingSuitabilityShimFragment, Boolean bool) {
        if (bool.booleanValue()) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalStateException("BE sent suitability but questionnaire is already completed"), false, null, 4, null);
            OptionOnboardingScreens2 callbacks = optionOnboardingSuitabilityShimFragment.getCallbacks();
            Companion companion = INSTANCE;
            callbacks.goToNextScreen(new ScreenRequest.Suitability(((ScreenArgs.Suitability) companion.getArgs((Fragment) optionOnboardingSuitabilityShimFragment)).getScreenId()), (ScreenArgs) companion.getArgs((Fragment) optionOnboardingSuitabilityShimFragment));
        } else {
            ActivityResultLauncher<Intent> activityResultLauncher = optionOnboardingSuitabilityShimFragment.suitabilityLauncher;
            Navigator navigator = optionOnboardingSuitabilityShimFragment.getNavigator();
            Context contextRequireContext = optionOnboardingSuitabilityShimFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Companion companion2 = INSTANCE;
            activityResultLauncher.launch(Navigator.DefaultImpls.createIntent$default(navigator, contextRequireContext, new Questionnaire(true, ((ScreenArgs.Suitability) companion2.getArgs((Fragment) optionOnboardingSuitabilityShimFragment)).getContext(), ((ScreenArgs.Suitability) companion2.getArgs((Fragment) optionOnboardingSuitabilityShimFragment)).getAccountNumber(), null, null, null, false, true, false, false, false, null, null, false, false, false, false, false, null, null, 1048184, null), null, false, 12, null));
        }
        return Unit.INSTANCE;
    }

    /* compiled from: OptionOnboardingSuitabilityShimFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/OptionOnboardingSuitabilityShimFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingSuitabilityShimFragment;", "Lcom/robinhood/android/optionsupgrade/ScreenArgs$Suitability;", "<init>", "()V", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<OptionOnboardingSuitabilityShimFragment, ScreenArgs.Suitability> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public ScreenArgs.Suitability getArgs(OptionOnboardingSuitabilityShimFragment optionOnboardingSuitabilityShimFragment) {
            return (ScreenArgs.Suitability) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, optionOnboardingSuitabilityShimFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public OptionOnboardingSuitabilityShimFragment newInstance(ScreenArgs.Suitability suitability) {
            return (OptionOnboardingSuitabilityShimFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, suitability);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(OptionOnboardingSuitabilityShimFragment optionOnboardingSuitabilityShimFragment, ScreenArgs.Suitability suitability) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, optionOnboardingSuitabilityShimFragment, suitability);
        }
    }
}
