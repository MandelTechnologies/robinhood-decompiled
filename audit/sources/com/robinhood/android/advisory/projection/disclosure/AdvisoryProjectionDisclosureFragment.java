package com.robinhood.android.advisory.projection.disclosure;

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
import com.robinhood.android.advisory.contracts.AdvisoryProjectionDisclosureFragmentKey;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;

/* compiled from: AdvisoryProjectionDisclosureFragment.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0010\u001a\u00020\u0011H\u0017¢\u0006\u0002\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u0014²\u0006\n\u0010\u0015\u001a\u00020\u0016X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/advisory/projection/disclosure/AdvisoryProjectionDisclosureFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "toolbarVisible", "getToolbarVisible", "duxo", "Lcom/robinhood/android/advisory/projection/disclosure/AdvisoryProjectionDisclosureDuxo;", "getDuxo", "()Lcom/robinhood/android/advisory/projection/disclosure/AdvisoryProjectionDisclosureDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "Companion", "feature-projected-returns_externalDebug", "viewState", "Lcom/robinhood/android/advisory/projection/disclosure/ProjectionDisclosureViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class AdvisoryProjectionDisclosureFragment extends GenericComposeFragment {

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, AdvisoryProjectionDisclosureDuxo.class);

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(AdvisoryProjectionDisclosureFragment advisoryProjectionDisclosureFragment, int i, Composer composer, int i2) {
        advisoryProjectionDisclosureFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return false;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return true;
    }

    private final AdvisoryProjectionDisclosureDuxo getDuxo() {
        return (AdvisoryProjectionDisclosureDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1478007524);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1478007524, i2, -1, "com.robinhood.android.advisory.projection.disclosure.AdvisoryProjectionDisclosureFragment.ComposeContent (AdvisoryProjectionDisclosureFragment.kt:43)");
            }
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1388092753, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.projection.disclosure.AdvisoryProjectionDisclosureFragment.ComposeContent.1
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
                        ComposerKt.traceEventStart(-1388092753, i3, -1, "com.robinhood.android.advisory.projection.disclosure.AdvisoryProjectionDisclosureFragment.ComposeContent.<anonymous> (AdvisoryProjectionDisclosureFragment.kt:48)");
                    }
                    ProjectionDisclosureViewState projectionDisclosureViewStateComposeContent$lambda$0 = AdvisoryProjectionDisclosureFragment.ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                    BaseActivity baseActivityRequireBaseActivity = AdvisoryProjectionDisclosureFragment.this.requireBaseActivity();
                    composer2.startReplaceGroup(5004770);
                    boolean zChangedInstance = composer2.changedInstance(baseActivityRequireBaseActivity);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new AdvisoryProjectionDisclosureFragment2(baseActivityRequireBaseActivity);
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    composer2.endReplaceGroup();
                    AdvisoryProjectionDisclosureFragment3.ProjectionDisclosureScreen(projectionDisclosureViewStateComposeContent$lambda$0, (Function0) ((KFunction) objRememberedValue), null, composer2, 0, 4);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.projection.disclosure.AdvisoryProjectionDisclosureFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AdvisoryProjectionDisclosureFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: AdvisoryProjectionDisclosureFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/advisory/projection/disclosure/AdvisoryProjectionDisclosureFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/advisory/projection/disclosure/AdvisoryProjectionDisclosureFragment;", "Lcom/robinhood/android/advisory/contracts/AdvisoryProjectionDisclosureFragmentKey;", "<init>", "()V", "feature-projected-returns_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<AdvisoryProjectionDisclosureFragment, AdvisoryProjectionDisclosureFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(AdvisoryProjectionDisclosureFragmentKey advisoryProjectionDisclosureFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, advisoryProjectionDisclosureFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public AdvisoryProjectionDisclosureFragmentKey getArgs(AdvisoryProjectionDisclosureFragment advisoryProjectionDisclosureFragment) {
            return (AdvisoryProjectionDisclosureFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, advisoryProjectionDisclosureFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public AdvisoryProjectionDisclosureFragment newInstance(AdvisoryProjectionDisclosureFragmentKey advisoryProjectionDisclosureFragmentKey) {
            return (AdvisoryProjectionDisclosureFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, advisoryProjectionDisclosureFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(AdvisoryProjectionDisclosureFragment advisoryProjectionDisclosureFragment, AdvisoryProjectionDisclosureFragmentKey advisoryProjectionDisclosureFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, advisoryProjectionDisclosureFragment, advisoryProjectionDisclosureFragmentKey);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProjectionDisclosureViewState ComposeContent$lambda$0(SnapshotState4<ProjectionDisclosureViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
