package com.robinhood.android.advisory.returns.benchmark;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import com.robinhood.android.advisory.contracts.ReturnsHubBenchmarkInfoFragmentKey;
import com.robinhood.android.advisory.returns.benchmark.ReturnsHubBenchMarkInfoFragment;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ReturnsHubBenchMarkInfoFragment.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\n\u001a\u00020\u000bH\u0017¢\u0006\u0002\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/advisory/returns/benchmark/ReturnsHubBenchMarkInfoFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "toolbarVisible", "getToolbarVisible", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "Companion", "feature-returns-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class ReturnsHubBenchMarkInfoFragment extends GenericComposeFragment {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = GenericComposeFragment.$stable;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(ReturnsHubBenchMarkInfoFragment returnsHubBenchMarkInfoFragment, int i, Composer composer, int i2) {
        returnsHubBenchMarkInfoFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    /* compiled from: ReturnsHubBenchMarkInfoFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.advisory.returns.benchmark.ReturnsHubBenchMarkInfoFragment$ComposeContent$1 */
    static final class C93591 implements Function2<Composer, Integer, Unit> {
        C93591() {
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
                ComposerKt.traceEventStart(2035715069, i, -1, "com.robinhood.android.advisory.returns.benchmark.ReturnsHubBenchMarkInfoFragment.ComposeContent.<anonymous> (ReturnsHubBenchMarkInfoFragment.kt:47)");
            }
            Companion companion = ReturnsHubBenchMarkInfoFragment.INSTANCE;
            String content = ((ReturnsHubBenchmarkInfoFragmentKey) companion.getArgs((Fragment) ReturnsHubBenchMarkInfoFragment.this)).getContent();
            String disclosure = ((ReturnsHubBenchmarkInfoFragmentKey) companion.getArgs((Fragment) ReturnsHubBenchMarkInfoFragment.this)).getDisclosure();
            String loggingIdentifier = ((ReturnsHubBenchmarkInfoFragmentKey) companion.getArgs((Fragment) ReturnsHubBenchMarkInfoFragment.this)).getLoggingIdentifier();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(ReturnsHubBenchMarkInfoFragment.this);
            final ReturnsHubBenchMarkInfoFragment returnsHubBenchMarkInfoFragment = ReturnsHubBenchMarkInfoFragment.this;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.returns.benchmark.ReturnsHubBenchMarkInfoFragment$ComposeContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ReturnsHubBenchMarkInfoFragment.C93591.invoke$lambda$1$lambda$0(returnsHubBenchMarkInfoFragment);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            ReturnsHubBenchMarkInfoFragment4.ReturnsHubBenchmarkInfoScreen(content, disclosure, loggingIdentifier, (Function0) objRememberedValue, null, composer, 0, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(ReturnsHubBenchMarkInfoFragment returnsHubBenchMarkInfoFragment) {
            returnsHubBenchMarkInfoFragment.requireBaseActivity().onBackPressed();
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-549645070);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(this) : composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-549645070, i2, -1, "com.robinhood.android.advisory.returns.benchmark.ReturnsHubBenchMarkInfoFragment.ComposeContent (ReturnsHubBenchMarkInfoFragment.kt:45)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(2035715069, true, new C93591(), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.returns.benchmark.ReturnsHubBenchMarkInfoFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ReturnsHubBenchMarkInfoFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: ReturnsHubBenchMarkInfoFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/advisory/returns/benchmark/ReturnsHubBenchMarkInfoFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/advisory/returns/benchmark/ReturnsHubBenchMarkInfoFragment;", "Lcom/robinhood/android/advisory/contracts/ReturnsHubBenchmarkInfoFragmentKey;", "<init>", "()V", "feature-returns-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<ReturnsHubBenchMarkInfoFragment, ReturnsHubBenchmarkInfoFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(ReturnsHubBenchmarkInfoFragmentKey returnsHubBenchmarkInfoFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, returnsHubBenchmarkInfoFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public ReturnsHubBenchmarkInfoFragmentKey getArgs(ReturnsHubBenchMarkInfoFragment returnsHubBenchMarkInfoFragment) {
            return (ReturnsHubBenchmarkInfoFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, returnsHubBenchMarkInfoFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public ReturnsHubBenchMarkInfoFragment newInstance(ReturnsHubBenchmarkInfoFragmentKey returnsHubBenchmarkInfoFragmentKey) {
            return (ReturnsHubBenchMarkInfoFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, returnsHubBenchmarkInfoFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(ReturnsHubBenchMarkInfoFragment returnsHubBenchMarkInfoFragment, ReturnsHubBenchmarkInfoFragmentKey returnsHubBenchmarkInfoFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, returnsHubBenchMarkInfoFragment, returnsHubBenchmarkInfoFragmentKey);
        }
    }
}
