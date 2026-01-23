package com.robinhood.android.rollover401k.steps;

import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlingFragment;
import com.robinhood.android.models.retirement.p194db.Retirement401kRolloverViewModel;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.RetirementRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.rollover401k.Rollover401kHeaderImageScreen2;
import com.robinhood.android.rollover401k.Rollover401kHeaderImageScreen3;
import com.robinhood.android.rollover401k.Rollover401kHeaderImageScreenContent;
import com.robinhood.librobinhood.data.store.bonfire.retirement.Retirement401kRolloverStore;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCompanion;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;

/* compiled from: Rollover401kCapitalizeFragment.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u001f2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u001fB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0015\u001a\u00020\u0016H\u0017¢\u0006\u0002\u0010\u0017J\b\u0010\u0018\u001a\u00020\u0016H\u0016J\t\u0010\u0019\u001a\u00020\u000eH\u0096\u0001R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000eX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 ²\u0006\f\u0010!\u001a\u0004\u0018\u00010\"X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/rollover401k/steps/Rollover401kCapitalizeFragment;", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/action/GenericActionHandlingFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/rollover401k/Rollover401kHeaderImageScreenInteractions;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "retirement401kRolloverStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/Retirement401kRolloverStore;", "getRetirement401kRolloverStore", "()Lcom/robinhood/librobinhood/data/store/bonfire/retirement/Retirement401kRolloverStore;", "setRetirement401kRolloverStore", "(Lcom/robinhood/librobinhood/data/store/bonfire/retirement/Retirement401kRolloverStore;)V", "toolbarVisible", "", "getToolbarVisible", "()Z", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "onBackButtonClick", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-rollover-401k_externalDebug", "viewState", "Lcom/robinhood/android/models/retirement/db/Retirement401kRolloverViewModel;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class Rollover401kCapitalizeFragment extends GenericActionHandlingFragment implements RegionGated, Rollover401kHeaderImageScreen2, AutoLoggableFragment {
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(RetirementRegionGate.INSTANCE);
    private final Screen eventScreen = new Screen(Screen.Name.RETIREMENT_401K_ROLLOVER_CAPITALIZE, null, null, null, 14, null);
    public Retirement401kRolloverStore retirement401kRolloverStore;
    private final boolean toolbarVisible;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(Rollover401kCapitalizeFragment rollover401kCapitalizeFragment, int i, Composer composer, int i2) {
        rollover401kCapitalizeFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenAppearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenAppearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenDisappearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenDisappearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenSourceEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenSourceEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Component getScreenEventComponent() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventComponent(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    public final Retirement401kRolloverStore getRetirement401kRolloverStore() {
        Retirement401kRolloverStore retirement401kRolloverStore = this.retirement401kRolloverStore;
        if (retirement401kRolloverStore != null) {
            return retirement401kRolloverStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retirement401kRolloverStore");
        return null;
    }

    public final void setRetirement401kRolloverStore(Retirement401kRolloverStore retirement401kRolloverStore) {
        Intrinsics.checkNotNullParameter(retirement401kRolloverStore, "<set-?>");
        this.retirement401kRolloverStore = retirement401kRolloverStore;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return this.eventScreen;
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-861954725);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-861954725, i2, -1, "com.robinhood.android.rollover401k.steps.Rollover401kCapitalizeFragment.ComposeContent (Rollover401kCapitalizeFragment.kt:34)");
            }
            Flow flowRetirement401kRolloverQuery$default = Retirement401kRolloverStore.retirement401kRolloverQuery$default(getRetirement401kRolloverStore(), false, 1, null);
            Lifecycle lifecycle = getLifecycle();
            Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle((Flow<? extends Object>) flowRetirement401kRolloverQuery$default, (Object) null, lifecycle, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 48, 12);
            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, getEventScreen(), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(535637766, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.rollover401k.steps.Rollover401kCapitalizeFragment.ComposeContent.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    Retirement401kRolloverViewModel.RolloverViewModels rolloverViewModels;
                    Retirement401kRolloverViewModel.RolloverStepsViewModel guidedViewModel;
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(535637766, i3, -1, "com.robinhood.android.rollover401k.steps.Rollover401kCapitalizeFragment.ComposeContent.<anonymous> (Rollover401kCapitalizeFragment.kt:44)");
                    }
                    Retirement401kRolloverViewModel retirement401kRolloverViewModelComposeContent$lambda$0 = Rollover401kCapitalizeFragment.ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                    Rollover401kHeaderImageScreen3.Rollover401kHeaderImageScreen((retirement401kRolloverViewModelComposeContent$lambda$0 == null || (rolloverViewModels = retirement401kRolloverViewModelComposeContent$lambda$0.getRolloverViewModels()) == null || (guidedViewModel = rolloverViewModels.getGuidedViewModel()) == null) ? null : new Rollover401kHeaderImageScreenContent(guidedViewModel.getHeaderImage(), guidedViewModel.getContent(), guidedViewModel.getFooter()), Rollover401kCapitalizeFragment.this, composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rollover401k.steps.Rollover401kCapitalizeFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Rollover401kCapitalizeFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.android.rollover401k.Rollover401kHeaderImageScreen2
    public void onBackButtonClick() {
        requireActivity().getOnBackPressedDispatcher().onBackPressed();
    }

    /* compiled from: Rollover401kCapitalizeFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/rollover401k/steps/Rollover401kCapitalizeFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithoutArgsCompanion;", "Lcom/robinhood/android/rollover401k/steps/Rollover401kCapitalizeFragment;", "<init>", "()V", "feature-rollover-401k_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithoutArgsCompanion<Rollover401kCapitalizeFragment> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public /* bridge */ /* synthetic */ Parcelable getArgs(Fragment fragment) {
            return (Parcelable) getArgs((Rollover401kCapitalizeFragment) fragment);
        }

        public Void getArgs(Rollover401kCapitalizeFragment rollover401kCapitalizeFragment) {
            return FragmentWithoutArgsCompanion.DefaultImpls.getArgs(this, rollover401kCapitalizeFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCreator
        public Rollover401kCapitalizeFragment newInstance() {
            return (Rollover401kCapitalizeFragment) FragmentWithoutArgsCompanion.DefaultImpls.newInstance(this);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCreator
        public Rollover401kCapitalizeFragment newInstance(Void r1) {
            return (Rollover401kCapitalizeFragment) FragmentWithoutArgsCompanion.DefaultImpls.newInstance(this, r1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Retirement401kRolloverViewModel ComposeContent$lambda$0(SnapshotState4<Retirement401kRolloverViewModel> snapshotState4) {
        return snapshotState4.getValue();
    }
}
