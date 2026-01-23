package com.robinhood.android.retirementhistory;

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
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlingFragment;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.RetirementRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.retirement.contracts.RetirementHistoryItemDetails;
import com.robinhood.android.retirementhistory.RetirementHistoryItemDetailFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RetirementHistoryItemDetailFragment.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0001\u001bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\r\u0010\u0013\u001a\u00020\u0010H\u0017¢\u0006\u0002\u0010\u0014J\t\u0010\u0015\u001a\u00020\fH\u0096\u0001R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\fX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c²\u0006\n\u0010\u001d\u001a\u00020\u001eX\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/retirementhistory/RetirementHistoryItemDetailFragment;", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/action/GenericActionHandlingFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "duxo", "Lcom/robinhood/android/retirementhistory/RetirementHistoryItemDetailDuxo;", "getDuxo", "()Lcom/robinhood/android/retirementhistory/RetirementHistoryItemDetailDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "shouldClearTop", "", "getShouldClearTop", "()Ljava/lang/Boolean;", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-retirement-history_externalDebug", "state", "Lcom/robinhood/android/retirementhistory/RetirementHistoryItemViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class RetirementHistoryItemDetailFragment extends GenericActionHandlingFragment implements RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(RetirementRegionGate.INSTANCE);

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, RetirementHistoryItemDetailDuxo.class);
    private final boolean shouldClearTop;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(RetirementHistoryItemDetailFragment retirementHistoryItemDetailFragment, int i, Composer composer, int i2) {
        retirementHistoryItemDetailFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    private final RetirementHistoryItemDetailDuxo getDuxo() {
        return (RetirementHistoryItemDetailDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlingFragment
    public Boolean getShouldClearTop() {
        return Boolean.valueOf(this.shouldClearTop);
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
        Composer composerStartRestartGroup = composer.startRestartGroup(686370726);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(686370726, i2, -1, "com.robinhood.android.retirementhistory.RetirementHistoryItemDetailFragment.ComposeContent (RetirementHistoryItemDetailFragment.kt:29)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-477156549, true, new C273051(FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7)), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirementhistory.RetirementHistoryItemDetailFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RetirementHistoryItemDetailFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: RetirementHistoryItemDetailFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.retirementhistory.RetirementHistoryItemDetailFragment$ComposeContent$1 */
    static final class C273051 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState4<RetirementHistoryItemViewState> $state$delegate;

        /* JADX WARN: Multi-variable type inference failed */
        C273051(SnapshotState4<? extends RetirementHistoryItemViewState> snapshotState4) {
            this.$state$delegate = snapshotState4;
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
                ComposerKt.traceEventStart(-477156549, i, -1, "com.robinhood.android.retirementhistory.RetirementHistoryItemDetailFragment.ComposeContent.<anonymous> (RetirementHistoryItemDetailFragment.kt:32)");
            }
            RetirementHistoryItemViewState retirementHistoryItemViewStateComposeContent$lambda$0 = RetirementHistoryItemDetailFragment.ComposeContent$lambda$0(this.$state$delegate);
            RetirementHistoryItemDetailFragment retirementHistoryItemDetailFragment = RetirementHistoryItemDetailFragment.this;
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(RetirementHistoryItemDetailFragment.this);
            final RetirementHistoryItemDetailFragment retirementHistoryItemDetailFragment2 = RetirementHistoryItemDetailFragment.this;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.retirementhistory.RetirementHistoryItemDetailFragment$ComposeContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RetirementHistoryItemDetailFragment.C273051.invoke$lambda$1$lambda$0(retirementHistoryItemDetailFragment2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            RetirementHistoryItemDetailScreen5.RetirementHistoryItemDetailScreen(retirementHistoryItemViewStateComposeContent$lambda$0, retirementHistoryItemDetailFragment, (Function0) objRememberedValue, null, composer, 0, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(RetirementHistoryItemDetailFragment retirementHistoryItemDetailFragment) {
            retirementHistoryItemDetailFragment.requireBaseActivity().onBackPressed();
            return Unit.INSTANCE;
        }
    }

    /* compiled from: RetirementHistoryItemDetailFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/retirementhistory/RetirementHistoryItemDetailFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/retirementhistory/RetirementHistoryItemDetailFragment;", "Lcom/robinhood/android/retirement/contracts/RetirementHistoryItemDetails;", "<init>", "()V", "feature-retirement-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<RetirementHistoryItemDetailFragment, RetirementHistoryItemDetails> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(RetirementHistoryItemDetails retirementHistoryItemDetails) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, retirementHistoryItemDetails);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public RetirementHistoryItemDetails getArgs(RetirementHistoryItemDetailFragment retirementHistoryItemDetailFragment) {
            return (RetirementHistoryItemDetails) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, retirementHistoryItemDetailFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public RetirementHistoryItemDetailFragment newInstance(RetirementHistoryItemDetails retirementHistoryItemDetails) {
            return (RetirementHistoryItemDetailFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, retirementHistoryItemDetails);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(RetirementHistoryItemDetailFragment retirementHistoryItemDetailFragment, RetirementHistoryItemDetails retirementHistoryItemDetails) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, retirementHistoryItemDetailFragment, retirementHistoryItemDetails);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RetirementHistoryItemViewState ComposeContent$lambda$0(SnapshotState4<? extends RetirementHistoryItemViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
