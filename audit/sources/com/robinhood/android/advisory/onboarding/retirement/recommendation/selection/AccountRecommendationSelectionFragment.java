package com.robinhood.android.advisory.onboarding.retirement.recommendation.selection;

import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.android.advisory.onboarding.retirement.recommendation.AccountRecommendationCallbacks;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlerKt;
import com.robinhood.android.models.retirement.api.onboarding.RetirementOnboardingIntro;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.AdvisoryRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.RetirementRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.models.advisory.api.onboarding.recommendation.ApiAccountTypeRecommendationIntroViewModel;
import com.robinhood.store.AsyncResult;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCompanion;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: AccountRecommendationSelectionFragment.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0007\u0018\u0000 #2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001#B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0012\u001a\u00020\u0013H\u0017¢\u0006\u0002\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0013H\u0016J\t\u0010\u001c\u001a\u00020\u001dH\u0096\u0001R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fX\u0096\u0005¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006$²\u0006\u0010\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/selection/AccountRecommendationSelectionFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/selection/AccountRecommendationSelectionCallbacks;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/AccountRecommendationCallbacks;", "getCallbacks", "()Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/AccountRecommendationCallbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/selection/AccountRecommendationSelectionDuxo;", "getDuxo", "()Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/selection/AccountRecommendationSelectionDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "onGetAccountRecommendationClicked", "viewModel", "Lcom/robinhood/models/advisory/api/onboarding/recommendation/ApiAccountTypeRecommendationIntroViewModel$IntroViewModel;", "onAccountRecommendationDeclined", "intro", "Lcom/robinhood/android/models/retirement/api/onboarding/RetirementOnboardingIntro$AccountSelection;", "onRetryClicked", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-advisory-onboarding_externalDebug", "viewState", "Lcom/robinhood/store/AsyncResult;", "Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/selection/AccountRecommendationSelectionViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class AccountRecommendationSelectionFragment extends GenericComposeFragment implements RegionGated, AccountRecommendationSelectionScreen {
    public static final int $stable = 0;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(RetirementRegionGate.INSTANCE, AdvisoryRegionGate.INSTANCE);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(AccountRecommendationCallbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.advisory.onboarding.retirement.recommendation.selection.AccountRecommendationSelectionFragment$special$$inlined$parentFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment;
        }
    });

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, AccountRecommendationSelectionDuxo.class);
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AccountRecommendationSelectionFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/AccountRecommendationCallbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(AccountRecommendationSelectionFragment accountRecommendationSelectionFragment, int i, Composer composer, int i2) {
        accountRecommendationSelectionFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    private final AccountRecommendationCallbacks getCallbacks() {
        return (AccountRecommendationCallbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final AccountRecommendationSelectionDuxo getDuxo() {
        return (AccountRecommendationSelectionDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1924086219);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1924086219, i2, -1, "com.robinhood.android.advisory.onboarding.retirement.recommendation.selection.AccountRecommendationSelectionFragment.ComposeContent (AccountRecommendationSelectionFragment.kt:29)");
            }
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1119581770, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.retirement.recommendation.selection.AccountRecommendationSelectionFragment.ComposeContent.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1119581770, i3, -1, "com.robinhood.android.advisory.onboarding.retirement.recommendation.selection.AccountRecommendationSelectionFragment.ComposeContent.<anonymous> (AccountRecommendationSelectionFragment.kt:33)");
                    }
                    Navigator navigator = AccountRecommendationSelectionFragment.this.getNavigator();
                    final AccountRecommendationSelectionFragment accountRecommendationSelectionFragment = AccountRecommendationSelectionFragment.this;
                    final SnapshotState4<AsyncResult<AccountRecommendationSelectionViewState>> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                    GenericActionHandlerKt.GenericActionHandler(null, false, null, navigator, ComposableLambda3.rememberComposableLambda(1500020828, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.retirement.recommendation.selection.AccountRecommendationSelectionFragment.ComposeContent.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i4) {
                            if ((i4 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1500020828, i4, -1, "com.robinhood.android.advisory.onboarding.retirement.recommendation.selection.AccountRecommendationSelectionFragment.ComposeContent.<anonymous>.<anonymous> (AccountRecommendationSelectionFragment.kt:34)");
                            }
                            AccountRecommendationSelectionScreen2.AccountRecommendationSelectionScreen(AccountRecommendationSelectionFragment.ComposeContent$lambda$0(snapshotState4), accountRecommendationSelectionFragment, null, composer3, 0, 4);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 24576, 7);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.onboarding.retirement.recommendation.selection.AccountRecommendationSelectionFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AccountRecommendationSelectionFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.android.advisory.onboarding.retirement.recommendation.selection.AccountRecommendationSelectionScreen
    public void onGetAccountRecommendationClicked(ApiAccountTypeRecommendationIntroViewModel.IntroViewModel viewModel) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        getCallbacks().onGetAccountRecommendationClicked(viewModel);
    }

    @Override // com.robinhood.android.advisory.onboarding.retirement.recommendation.selection.AccountRecommendationSelectionScreen
    public void onAccountRecommendationDeclined(RetirementOnboardingIntro.AccountSelection intro) {
        Intrinsics.checkNotNullParameter(intro, "intro");
        getCallbacks().onAccountRecommendationDeclined(intro);
    }

    @Override // com.robinhood.android.advisory.onboarding.retirement.recommendation.selection.AccountRecommendationSelectionScreen
    public void onRetryClicked() {
        getDuxo().fetchViewModel();
    }

    /* compiled from: AccountRecommendationSelectionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/selection/AccountRecommendationSelectionFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithoutArgsCompanion;", "Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/selection/AccountRecommendationSelectionFragment;", "<init>", "()V", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithoutArgsCompanion<AccountRecommendationSelectionFragment> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public /* bridge */ /* synthetic */ Parcelable getArgs(Fragment fragment) {
            return (Parcelable) getArgs((AccountRecommendationSelectionFragment) fragment);
        }

        public Void getArgs(AccountRecommendationSelectionFragment accountRecommendationSelectionFragment) {
            return FragmentWithoutArgsCompanion.DefaultImpls.getArgs(this, accountRecommendationSelectionFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCreator
        public AccountRecommendationSelectionFragment newInstance() {
            return (AccountRecommendationSelectionFragment) FragmentWithoutArgsCompanion.DefaultImpls.newInstance(this);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCreator
        public AccountRecommendationSelectionFragment newInstance(Void r1) {
            return (AccountRecommendationSelectionFragment) FragmentWithoutArgsCompanion.DefaultImpls.newInstance(this, r1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AsyncResult<AccountRecommendationSelectionViewState> ComposeContent$lambda$0(SnapshotState4<? extends AsyncResult<AccountRecommendationSelectionViewState>> snapshotState4) {
        return snapshotState4.getValue();
    }
}
