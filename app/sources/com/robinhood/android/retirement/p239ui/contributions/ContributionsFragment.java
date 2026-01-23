package com.robinhood.android.retirement.p239ui.contributions;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.retirement.contracts.RetirementContributionHubFragmentKey;
import com.robinhood.android.retirement.p239ui.GenericRetirementTabFragment;
import com.robinhood.android.retirement.p239ui.GenericRetirementTabFragment2;
import com.robinhood.models.serverdriven.experimental.api.AlertAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ContributionsFragment.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\b\u0007\u0018\u0000 '2\u00020\u00012\u00020\u0002:\u0001'B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\r\u0010\u001f\u001a\u00020\u001cH\u0017¢\u0006\u0002\u0010 J\u0016\u0010!\u001a\u00020\u001c2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#H\u0016J\b\u0010%\u001a\u00020\u001cH\u0016J\b\u0010&\u001a\u00020\u001cH\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R+\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00068B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0016\u0010\b\"\u0004\b\u0017\u0010\u0018¨\u0006(²\u0006\n\u0010)\u001a\u00020*X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/retirement/ui/contributions/ContributionsFragment;", "Lcom/robinhood/android/retirement/ui/GenericRetirementTabFragment;", "Lcom/robinhood/android/retirement/ui/contributions/ContributionsCallbacks;", "<init>", "()V", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "hasBottomBar", "getHasBottomBar", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "duxo", "Lcom/robinhood/android/retirement/ui/contributions/ContributionsDuxo;", "getDuxo", "()Lcom/robinhood/android/retirement/ui/contributions/ContributionsDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "<set-?>", "isFirstAppearance", "setFirstAppearance", "(Z)V", "isFirstAppearance$delegate", "Landroidx/compose/runtime/MutableState;", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onUntilMaxClicked", "action", "Lcom/robinhood/models/serverdriven/experimental/api/AlertAction;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "onRingAnimationSet", "onBackClicked", "Companion", "feature-retirement-tab_externalDebug", "viewState", "Lcom/robinhood/android/retirement/ui/contributions/ContributionsViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class ContributionsFragment extends GenericRetirementTabFragment implements Contributions2 {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean useDesignSystemToolbar = true;
    private final boolean hasBottomBar = true;
    private final Screen eventScreen = new Screen(Screen.Name.RETIREMENT_CONTRIBUTION_HUB, null, null, null, 14, null);

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, ContributionsDuxo.class);

    /* renamed from: isFirstAppearance$delegate, reason: from kotlin metadata */
    private final SnapshotState isFirstAppearance = SnapshotState3.mutableStateOf$default(Boolean.TRUE, null, 2, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(ContributionsFragment contributionsFragment, int i, Composer composer, int i2) {
        contributionsFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getHasBottomBar() {
        return this.hasBottomBar;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return this.eventScreen;
    }

    private final ContributionsDuxo getDuxo() {
        return (ContributionsDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isFirstAppearance() {
        return ((Boolean) this.isFirstAppearance.getValue()).booleanValue();
    }

    private final void setFirstAppearance(boolean z) {
        this.isFirstAppearance.setValue(Boolean.valueOf(z));
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        requireBaseActivity().hideToolbar();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-828026615);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-828026615, i2, -1, "com.robinhood.android.retirement.ui.contributions.ContributionsFragment.ComposeContent (ContributionsFragment.kt:35)");
            }
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            GenericRetirementTabFragment2.RetirementTheme(this, null, ComposableLambda3.rememberComposableLambda(1772667077, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.ui.contributions.ContributionsFragment.ComposeContent.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i3) {
                    if ((i3 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1772667077, i3, -1, "com.robinhood.android.retirement.ui.contributions.ContributionsFragment.ComposeContent.<anonymous> (ContributionsFragment.kt:38)");
                    }
                    ContributionsViewState contributionsViewStateComposeContent$lambda$0 = ContributionsFragment.ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                    ContributionsFragment contributionsFragment = ContributionsFragment.this;
                    Contributions3.Contributions(contributionsViewStateComposeContent$lambda$0, contributionsFragment, contributionsFragment.isFirstAppearance(), null, composer3, 0, 8);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i2 & 14) | 384, 1);
            composer2 = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.ui.contributions.ContributionsFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ContributionsFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.android.retirement.p239ui.contributions.ContributionsHeaderText
    public void onUntilMaxClicked(AlertAction<? extends GenericAction> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        mo15941handle((GenericAction) new GenericAction.InfoAlert(action));
    }

    @Override // com.robinhood.android.retirement.p239ui.contributions.CombinedContributionHeader5
    public void onRingAnimationSet() {
        setFirstAppearance(false);
    }

    @Override // com.robinhood.android.retirement.p239ui.contributions.Contributions2
    public void onBackClicked() {
        requireActivity().onBackPressed();
    }

    /* compiled from: ContributionsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/retirement/ui/contributions/ContributionsFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/retirement/ui/contributions/ContributionsFragment;", "Lcom/robinhood/android/retirement/contracts/RetirementContributionHubFragmentKey;", "<init>", "()V", "feature-retirement-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<ContributionsFragment, RetirementContributionHubFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(RetirementContributionHubFragmentKey retirementContributionHubFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, retirementContributionHubFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public RetirementContributionHubFragmentKey getArgs(ContributionsFragment contributionsFragment) {
            return (RetirementContributionHubFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, contributionsFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public ContributionsFragment newInstance(RetirementContributionHubFragmentKey retirementContributionHubFragmentKey) {
            return (ContributionsFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, retirementContributionHubFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(ContributionsFragment contributionsFragment, RetirementContributionHubFragmentKey retirementContributionHubFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, contributionsFragment, retirementContributionHubFragmentKey);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ContributionsViewState ComposeContent$lambda$0(SnapshotState4<ContributionsViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
