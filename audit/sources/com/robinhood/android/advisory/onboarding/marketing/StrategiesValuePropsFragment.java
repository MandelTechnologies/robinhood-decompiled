package com.robinhood.android.advisory.onboarding.marketing;

import android.content.Context;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier;
import androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier7;
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
import com.robinhood.android.account.contracts.onboarding.GeneralAccountOnboardingFragmentKey;
import com.robinhood.android.advisory.contracts.StrategiesValuePropsKey;
import com.robinhood.android.advisory.onboarding.marketing.StrategiesValuePropsFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.redesign.accounttab.AccountSelectorTabArgs;
import com.robinhood.android.redesigninvesting.interactions.scrolling.AccountTabEmbeddedListStateProvider;
import com.robinhood.android.regiongate.AdvisoryRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.models.api.ManagementType;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;

/* compiled from: StrategiesValuePropsFragment.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0001\u001aB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0011\u001a\u00020\u0012H\u0017¢\u0006\u0002\u0010\u0013J\t\u0010\u0014\u001a\u00020\u0006H\u0096\u0001R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b²\u0006\n\u0010\u001c\u001a\u00020\u001dX\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/marketing/StrategiesValuePropsFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "toolbarVisible", "getToolbarVisible", "duxo", "Lcom/robinhood/android/advisory/onboarding/marketing/StrategiesValuePropsDuxo;", "getDuxo", "()Lcom/robinhood/android/advisory/onboarding/marketing/StrategiesValuePropsDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-advisory-onboarding_externalDebug", "viewState", "Lcom/robinhood/android/advisory/onboarding/marketing/StrategiesValuePropsScreenViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class StrategiesValuePropsFragment extends GenericComposeFragment implements RegionGated {
    private final boolean toolbarVisible;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(AdvisoryRegionGate.INSTANCE);
    private final boolean useDesignSystemToolbar = true;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, StrategiesValuePropsDuxo.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(StrategiesValuePropsFragment strategiesValuePropsFragment, int i, Composer composer, int i2) {
        strategiesValuePropsFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StrategiesValuePropsDuxo getDuxo() {
        return (StrategiesValuePropsDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1281570393);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1281570393, i2, -1, "com.robinhood.android.advisory.onboarding.marketing.StrategiesValuePropsFragment.ComposeContent (StrategiesValuePropsFragment.kt:31)");
            }
            AccountTabEmbeddedListStateProvider.AccountTabEmbeddedListStateProvider(this, ((StrategiesValuePropsKey) INSTANCE.getArgs((Fragment) this)).getAccountSelectorTabArgs(), (ScrollState) null, ComposableLambda3.rememberComposableLambda(-222484935, true, new C88901(FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7)), composerStartRestartGroup, 54), composerStartRestartGroup, (i2 & 14) | 3072, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.onboarding.marketing.StrategiesValuePropsFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return StrategiesValuePropsFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: StrategiesValuePropsFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.advisory.onboarding.marketing.StrategiesValuePropsFragment$ComposeContent$1 */
    static final class C88901 implements Function4<ScrollState, NestedScrollModifier, Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState4<StrategiesValuePropsScreenViewState> $viewState$delegate;

        /* JADX WARN: Multi-variable type inference failed */
        C88901(SnapshotState4<? extends StrategiesValuePropsScreenViewState> snapshotState4) {
            this.$viewState$delegate = snapshotState4;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(ScrollState scrollState, NestedScrollModifier nestedScrollModifier, Composer composer, Integer num) {
            invoke(scrollState, nestedScrollModifier, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(ScrollState scrollState, NestedScrollModifier nestedScrollModifier, Composer composer, int i) {
            Modifier modifierNestedScroll$default;
            Intrinsics.checkNotNullParameter(scrollState, "scrollState");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-222484935, i, -1, "com.robinhood.android.advisory.onboarding.marketing.StrategiesValuePropsFragment.ComposeContent.<anonymous> (StrategiesValuePropsFragment.kt:38)");
            }
            AccountSelectorTabArgs accountSelectorTabArgs = ((StrategiesValuePropsKey) StrategiesValuePropsFragment.INSTANCE.getArgs((Fragment) StrategiesValuePropsFragment.this)).getAccountSelectorTabArgs();
            StrategiesValuePropsScreenViewState strategiesValuePropsScreenViewStateComposeContent$lambda$0 = StrategiesValuePropsFragment.ComposeContent$lambda$0(this.$viewState$delegate);
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(StrategiesValuePropsFragment.this);
            final StrategiesValuePropsFragment strategiesValuePropsFragment = StrategiesValuePropsFragment.this;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.onboarding.marketing.StrategiesValuePropsFragment$ComposeContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return StrategiesValuePropsFragment.C88901.invoke$lambda$1$lambda$0(strategiesValuePropsFragment);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(StrategiesValuePropsFragment.this);
            final StrategiesValuePropsFragment strategiesValuePropsFragment2 = StrategiesValuePropsFragment.this;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.advisory.onboarding.marketing.StrategiesValuePropsFragment$ComposeContent$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return StrategiesValuePropsFragment.C88901.invoke$lambda$3$lambda$2(strategiesValuePropsFragment2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function0 function02 = (Function0) objRememberedValue2;
            composer.endReplaceGroup();
            StrategiesValuePropsDuxo duxo = StrategiesValuePropsFragment.this.getDuxo();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance3 = composer.changedInstance(duxo);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new StrategiesValuePropsFragment2(duxo);
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            Function0 function03 = (Function0) ((KFunction) objRememberedValue3);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            StrategiesValuePropsScreen7.StrategiesValuePropsScreen(accountSelectorTabArgs, strategiesValuePropsScreenViewStateComposeContent$lambda$0, scrollState, function0, function02, function03, (nestedScrollModifier == null || (modifierNestedScroll$default = NestedScrollModifier7.nestedScroll$default(modifierFillMaxSize$default, nestedScrollModifier, null, 2, null)) == null) ? modifierFillMaxSize$default : modifierNestedScroll$default, composer, (i << 6) & 896, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(StrategiesValuePropsFragment strategiesValuePropsFragment) {
            strategiesValuePropsFragment.requireBaseActivity().onBackPressed();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(StrategiesValuePropsFragment strategiesValuePropsFragment) {
            strategiesValuePropsFragment.getDuxo().trackTapCtaEvent();
            Navigator navigator = strategiesValuePropsFragment.getNavigator();
            Context contextRequireContext = strategiesValuePropsFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new GeneralAccountOnboardingFragmentKey(ManagementType.MANAGED, ((StrategiesValuePropsKey) StrategiesValuePropsFragment.INSTANCE.getArgs((Fragment) strategiesValuePropsFragment)).getSource()), false, false, false, null, false, null, false, false, null, null, 4092, null);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: StrategiesValuePropsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/marketing/StrategiesValuePropsFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/advisory/onboarding/marketing/StrategiesValuePropsFragment;", "Lcom/robinhood/android/advisory/contracts/StrategiesValuePropsKey;", "<init>", "()V", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<StrategiesValuePropsFragment, StrategiesValuePropsKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(StrategiesValuePropsKey strategiesValuePropsKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, strategiesValuePropsKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public StrategiesValuePropsKey getArgs(StrategiesValuePropsFragment strategiesValuePropsFragment) {
            return (StrategiesValuePropsKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, strategiesValuePropsFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public StrategiesValuePropsFragment newInstance(StrategiesValuePropsKey strategiesValuePropsKey) {
            return (StrategiesValuePropsFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, strategiesValuePropsKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(StrategiesValuePropsFragment strategiesValuePropsFragment, StrategiesValuePropsKey strategiesValuePropsKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, strategiesValuePropsFragment, strategiesValuePropsKey);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StrategiesValuePropsScreenViewState ComposeContent$lambda$0(SnapshotState4<? extends StrategiesValuePropsScreenViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
