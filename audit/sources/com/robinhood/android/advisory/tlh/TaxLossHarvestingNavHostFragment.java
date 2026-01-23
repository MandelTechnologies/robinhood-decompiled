package com.robinhood.android.advisory.tlh;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigator;
import androidx.navigation.compose.NavHostController2;
import androidx.view.OnBackPressedDispatcher;
import androidx.view.OnBackPressedDispatcherOwner;
import androidx.view.compose.BackHandler5;
import com.robinhood.android.advisory.contracts.TaxLossHarvestingKey;
import com.robinhood.android.advisory.contracts.TaxLossHarvestingKey2;
import com.robinhood.android.advisory.tlh.TaxLossHarvestingNavHostFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.compose.destination.BaseComposableDestination;
import com.robinhood.android.navigation.compose.destination.ComposableDestination;
import com.robinhood.android.regiongate.AdvisoryRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.compose.app.composeNavigation.BaseComposeNavHostFragment;
import com.robinhood.compose.app.composeNavigation.BaseComposeNavHostFragment2;
import com.robinhood.compose.app.composeNavigation.GenericNavHost;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.rosetta.eventlogging.Context;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlinx.collections.immutable.ImmutableSet;
import kotlinx.collections.immutable.extensions2;

/* compiled from: TaxLossHarvestingNavHostFragment.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0001\u001bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004JO\u0010\u0005\u001a\u00020\u00062@\u0010\u0007\u001a<\u00128\u00126\u0012\u0004\u0012\u00020\n\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00060\tj\u0007`\u0011¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u00100\bH\u0017¢\u0006\u0002\u0010\u0012J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\t\u0010\u0015\u001a\u00020\u0014H\u0096\u0001R\u0018\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/advisory/tlh/TaxLossHarvestingNavHostFragment;", "Lcom/robinhood/compose/app/composeNavigation/BaseComposeNavHostFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "NavHostComposeContent", "", "navGraphsBuilders", "Lkotlinx/collections/immutable/ImmutableSet;", "Lkotlin/Function2;", "Landroidx/navigation/NavGraphBuilder;", "Landroidx/navigation/NavHostController;", "Lkotlin/ParameterName;", "name", "navController", "Lkotlin/jvm/JvmSuppressWildcards;", "Lkotlin/ExtensionFunctionType;", "Lcom/robinhood/android/navigation/compose/NavGraphBuilderFn;", "(Lkotlinx/collections/immutable/ImmutableSet;Landroidx/compose/runtime/Composer;I)V", "onBackPressed", "", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-tax-loss-harvesting_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class TaxLossHarvestingNavHostFragment extends BaseComposeNavHostFragment implements RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(AdvisoryRegionGate.INSTANCE);

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NavHostComposeContent$lambda$0(TaxLossHarvestingNavHostFragment taxLossHarvestingNavHostFragment, ImmutableSet immutableSet, int i, Composer composer, int i2) {
        taxLossHarvestingNavHostFragment.NavHostComposeContent(immutableSet, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    @Override // com.robinhood.compose.app.composeNavigation.BaseComposeNavHostFragment
    public void NavHostComposeContent(final ImmutableSet<Function2<NavGraphBuilder, NavHostController, Unit>> navGraphsBuilders, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(navGraphsBuilders, "navGraphsBuilders");
        Composer composerStartRestartGroup = composer.startRestartGroup(-57260847);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(navGraphsBuilders) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(this) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-57260847, i2, -1, "com.robinhood.android.advisory.tlh.TaxLossHarvestingNavHostFragment.NavHostComposeContent (TaxLossHarvestingNavHostFragment.kt:31)");
            }
            final NavHostController navHostControllerRememberNavController = NavHostController2.rememberNavController(new Navigator[0], composerStartRestartGroup, 0);
            OnBackPressedDispatcherOwner current = BackHandler5.INSTANCE.getCurrent(composerStartRestartGroup, BackHandler5.$stable);
            final OnBackPressedDispatcher onBackPressedDispatcher = current != null ? current.getOnBackPressedDispatcher() : null;
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1494885530, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.tlh.TaxLossHarvestingNavHostFragment.NavHostComposeContent.1
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
                        ComposerKt.traceEventStart(-1494885530, i3, -1, "com.robinhood.android.advisory.tlh.TaxLossHarvestingNavHostFragment.NavHostComposeContent.<anonymous> (TaxLossHarvestingNavHostFragment.kt:35)");
                    }
                    AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, null, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, ((TaxLossHarvestingKey) TaxLossHarvestingNavHostFragment.INSTANCE.getArgs((Fragment) TaxLossHarvestingNavHostFragment.this)).getSource(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -1, -1, -1, 16383, null), null, null, 55, null), ComposableLambda3.rememberComposableLambda(1221186075, true, new AnonymousClass1(TaxLossHarvestingNavHostFragment.this, navGraphsBuilders, navHostControllerRememberNavController, onBackPressedDispatcher), composer2, 54), composer2, 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: TaxLossHarvestingNavHostFragment.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.advisory.tlh.TaxLossHarvestingNavHostFragment$NavHostComposeContent$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ OnBackPressedDispatcher $backPressedDispatcher;
                    final /* synthetic */ NavHostController $navController;
                    final /* synthetic */ ImmutableSet<Function2<NavGraphBuilder, NavHostController, Unit>> $navGraphsBuilders;
                    final /* synthetic */ TaxLossHarvestingNavHostFragment this$0;

                    /* compiled from: TaxLossHarvestingNavHostFragment.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    /* renamed from: com.robinhood.android.advisory.tlh.TaxLossHarvestingNavHostFragment$NavHostComposeContent$1$1$WhenMappings */
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[TaxLossHarvestingKey2.values().length];
                            try {
                                iArr[TaxLossHarvestingKey2.DASHBOARD.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[TaxLossHarvestingKey2.FLOW.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            try {
                                iArr[TaxLossHarvestingKey2.GAINS_AND_LOSSES.ordinal()] = 3;
                            } catch (NoSuchFieldError unused3) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    AnonymousClass1(TaxLossHarvestingNavHostFragment taxLossHarvestingNavHostFragment, ImmutableSet<Function2<NavGraphBuilder, NavHostController, Unit>> immutableSet, NavHostController navHostController, OnBackPressedDispatcher onBackPressedDispatcher) {
                        this.this$0 = taxLossHarvestingNavHostFragment;
                        this.$navGraphsBuilders = immutableSet;
                        this.$navController = navHostController;
                        this.$backPressedDispatcher = onBackPressedDispatcher;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer, int i) {
                        BaseComposableDestination baseComposableDestination;
                        if ((i & 3) == 2 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1221186075, i, -1, "com.robinhood.android.advisory.tlh.TaxLossHarvestingNavHostFragment.NavHostComposeContent.<anonymous>.<anonymous> (TaxLossHarvestingNavHostFragment.kt:42)");
                        }
                        long jM21371getBg0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU();
                        int i2 = WhenMappings.$EnumSwitchMapping$0[((TaxLossHarvestingKey) TaxLossHarvestingNavHostFragment.INSTANCE.getArgs((Fragment) this.this$0)).getStartDestination().ordinal()];
                        if (i2 == 1) {
                            baseComposableDestination = TaxLossHarvestingEntryDestination.INSTANCE;
                        } else if (i2 == 2) {
                            baseComposableDestination = TaxLossHarvestFlowDestination.INSTANCE;
                        } else {
                            if (i2 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            baseComposableDestination = GainsAndLossesDestination.INSTANCE;
                        }
                        BaseComposableDestination baseComposableDestination2 = baseComposableDestination;
                        SpreadBuilder spreadBuilder = new SpreadBuilder(2);
                        spreadBuilder.addSpread(this.$navGraphsBuilders.toArray(new Function2[0]));
                        composer.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composer.changedInstance(this.$navController) | composer.changedInstance(this.$backPressedDispatcher);
                        final NavHostController navHostController = this.$navController;
                        final OnBackPressedDispatcher onBackPressedDispatcher = this.$backPressedDispatcher;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function2() { // from class: com.robinhood.android.advisory.tlh.TaxLossHarvestingNavHostFragment$NavHostComposeContent$1$1$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return TaxLossHarvestingNavHostFragment.C93871.AnonymousClass1.invoke$lambda$2$lambda$1(navHostController, onBackPressedDispatcher, (NavGraphBuilder) obj, (NavHostController) obj2);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        spreadBuilder.add((Function2) objRememberedValue);
                        GenericNavHost.m20570GenericNavHostuDo3WH8(this.$navController, extensions2.persistentSetOf(spreadBuilder.toArray(new Function2[spreadBuilder.size()])), baseComposableDestination2, jM21371getBg0d7_KjU, null, composer, ComposableDestination.$stable << 6, 16);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$2$lambda$1(NavHostController navHostController, final OnBackPressedDispatcher onBackPressedDispatcher, NavGraphBuilder persistentSetOf, NavHostController it) {
                        Intrinsics.checkNotNullParameter(persistentSetOf, "$this$persistentSetOf");
                        Intrinsics.checkNotNullParameter(it, "it");
                        TaxLossHarvestingNavGraph.taxLossHarvestingNavGraph(persistentSetOf, navHostController, new Function0() { // from class: com.robinhood.android.advisory.tlh.TaxLossHarvestingNavHostFragment$NavHostComposeContent$1$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return TaxLossHarvestingNavHostFragment.C93871.AnonymousClass1.invoke$lambda$2$lambda$1$lambda$0(onBackPressedDispatcher);
                            }
                        });
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$2$lambda$1$lambda$0(OnBackPressedDispatcher onBackPressedDispatcher) {
                        if (onBackPressedDispatcher != null) {
                            onBackPressedDispatcher.onBackPressed();
                        }
                        return Unit.INSTANCE;
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.tlh.TaxLossHarvestingNavHostFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TaxLossHarvestingNavHostFragment.NavHostComposeContent$lambda$0(this.f$0, navGraphsBuilders, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.compose.app.composeNavigation.BaseComposeNavHostFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        return BaseComposeNavHostFragment2.handleBackPressForComposeNavHostFragment(this);
    }

    /* compiled from: TaxLossHarvestingNavHostFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/advisory/tlh/TaxLossHarvestingNavHostFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/advisory/tlh/TaxLossHarvestingNavHostFragment;", "Lcom/robinhood/android/advisory/contracts/TaxLossHarvestingKey;", "<init>", "()V", "feature-tax-loss-harvesting_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<TaxLossHarvestingNavHostFragment, TaxLossHarvestingKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(TaxLossHarvestingKey taxLossHarvestingKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, taxLossHarvestingKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public TaxLossHarvestingKey getArgs(TaxLossHarvestingNavHostFragment taxLossHarvestingNavHostFragment) {
            return (TaxLossHarvestingKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, taxLossHarvestingNavHostFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public TaxLossHarvestingNavHostFragment newInstance(TaxLossHarvestingKey taxLossHarvestingKey) {
            return (TaxLossHarvestingNavHostFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, taxLossHarvestingKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(TaxLossHarvestingNavHostFragment taxLossHarvestingNavHostFragment, TaxLossHarvestingKey taxLossHarvestingKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, taxLossHarvestingNavHostFragment, taxLossHarvestingKey);
        }
    }
}
