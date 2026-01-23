package com.robinhood.android.feature.margin.call.p138v2.marketorder;

import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.feature.margin.call.p138v2.marketorder.MarginCallMarketOrderFragment;
import com.robinhood.android.home.contracts.WatchListIntentKey;
import com.robinhood.android.home.contracts.WatchListIntentKey2;
import com.robinhood.android.margin.contracts.MarginCallMarketOrderFragmentKey;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.p409ui.edge2edge.EdgeToEdgeHost;
import com.robinhood.utils.p409ui.edge2edge.LocalEdgeToEdgeHost;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: MarginCallMarketOrderFragment.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\r\u0010\u0012\u001a\u00020\u000fH\u0017¢\u0006\u0002\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015²\u0006\n\u0010\u0016\u001a\u00020\u0017X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/feature/margin/call/v2/marketorder/MarginCallMarketOrderFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "duxo", "Lcom/robinhood/android/feature/margin/call/v2/marketorder/MarginCallMarketOrderDuxo;", "getDuxo", "()Lcom/robinhood/android/feature/margin/call/v2/marketorder/MarginCallMarketOrderDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "Companion", "feature-margin-call-v2_externalDebug", "viewState", "Lcom/robinhood/android/feature/margin/call/v2/marketorder/MarginCallMarketOrderViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class MarginCallMarketOrderFragment extends GenericComposeFragment {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final boolean useDesignSystemToolbar = true;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, MarginCallMarketOrderDuxo.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(MarginCallMarketOrderFragment marginCallMarketOrderFragment, int i, Composer composer, int i2) {
        marginCallMarketOrderFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MarginCallMarketOrderDuxo getDuxo() {
        return (MarginCallMarketOrderDuxo) this.duxo.getValue();
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
        Composer composerStartRestartGroup = composer.startRestartGroup(-341936477);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-341936477, i2, -1, "com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderFragment.ComposeContent (MarginCallMarketOrderFragment.kt:32)");
            }
            EdgeToEdgeHost edgeToEdgeHost = (EdgeToEdgeHost) composerStartRestartGroup.consume(LocalEdgeToEdgeHost.getLocalEdgeToEdgeHost());
            if (edgeToEdgeHost != null) {
                edgeToEdgeHost.overrideNavigationBarStyle(false);
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1589604398, true, new C168081(SnapshotStateKt.collectAsState(getDuxo().getStateFlow(), null, composerStartRestartGroup, 0, 1)), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MarginCallMarketOrderFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: MarginCallMarketOrderFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderFragment$ComposeContent$1 */
    static final class C168081 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState4<MarginCallMarketOrderViewState> $viewState$delegate;

        C168081(SnapshotState4<MarginCallMarketOrderViewState> snapshotState4) {
            this.$viewState$delegate = snapshotState4;
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
                ComposerKt.traceEventStart(1589604398, i, -1, "com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderFragment.ComposeContent.<anonymous> (MarginCallMarketOrderFragment.kt:38)");
            }
            MarginCallMarketOrderViewState marginCallMarketOrderViewStateComposeContent$lambda$0 = MarginCallMarketOrderFragment.ComposeContent$lambda$0(this.$viewState$delegate);
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(MarginCallMarketOrderFragment.this);
            final MarginCallMarketOrderFragment marginCallMarketOrderFragment = MarginCallMarketOrderFragment.this;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderFragment$ComposeContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MarginCallMarketOrderFragment.C168081.invoke$lambda$1$lambda$0(marginCallMarketOrderFragment);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(MarginCallMarketOrderFragment.this);
            final MarginCallMarketOrderFragment marginCallMarketOrderFragment2 = MarginCallMarketOrderFragment.this;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderFragment$ComposeContent$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MarginCallMarketOrderFragment.C168081.invoke$lambda$3$lambda$2(marginCallMarketOrderFragment2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function0 function02 = (Function0) objRememberedValue2;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance3 = composer.changedInstance(MarginCallMarketOrderFragment.this);
            final MarginCallMarketOrderFragment marginCallMarketOrderFragment3 = MarginCallMarketOrderFragment.this;
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderFragment$ComposeContent$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MarginCallMarketOrderFragment.C168081.invoke$lambda$5$lambda$4(marginCallMarketOrderFragment3);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            Function0 function03 = (Function0) objRememberedValue3;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance4 = composer.changedInstance(MarginCallMarketOrderFragment.this);
            final MarginCallMarketOrderFragment marginCallMarketOrderFragment4 = MarginCallMarketOrderFragment.this;
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new Function0() { // from class: com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderFragment$ComposeContent$1$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MarginCallMarketOrderFragment.C168081.invoke$lambda$7$lambda$6(marginCallMarketOrderFragment4);
                    }
                };
                composer.updateRememberedValue(objRememberedValue4);
            }
            Function0 function04 = (Function0) objRememberedValue4;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance5 = composer.changedInstance(MarginCallMarketOrderFragment.this);
            final MarginCallMarketOrderFragment marginCallMarketOrderFragment5 = MarginCallMarketOrderFragment.this;
            Object objRememberedValue5 = composer.rememberedValue();
            if (zChangedInstance5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue5 = new Function0() { // from class: com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderFragment$ComposeContent$1$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MarginCallMarketOrderFragment.C168081.invoke$lambda$9$lambda$8(marginCallMarketOrderFragment5);
                    }
                };
                composer.updateRememberedValue(objRememberedValue5);
            }
            composer.endReplaceGroup();
            MarginCallMarketOrderFormComposableKt.MarginCallMarketOrderFormScreen(marginCallMarketOrderViewStateComposeContent$lambda$0, function0, function02, function03, function04, (Function0) objRememberedValue5, ModifiersKt.logScreenTransitions(Modifier.INSTANCE, new UserInteractionEventDescriptor(null, new Screen(Screen.Name.MARGIN_CALL_V2_MARKET_ORDER, null, null, null, 14, null), null, null, null, null, 61, null)), composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(MarginCallMarketOrderFragment marginCallMarketOrderFragment) {
            marginCallMarketOrderFragment.requireActivity().getOnBackPressedDispatcher().onBackPressed();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(MarginCallMarketOrderFragment marginCallMarketOrderFragment) {
            marginCallMarketOrderFragment.getDuxo().refreshNbboSummary();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$4(MarginCallMarketOrderFragment marginCallMarketOrderFragment) {
            marginCallMarketOrderFragment.getDuxo().submitMarketOrders();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$7$lambda$6(MarginCallMarketOrderFragment marginCallMarketOrderFragment) {
            marginCallMarketOrderFragment.requireActivity().finish();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$9$lambda$8(MarginCallMarketOrderFragment marginCallMarketOrderFragment) {
            Navigator navigator = marginCallMarketOrderFragment.getNavigator();
            FragmentActivity fragmentActivityRequireActivity = marginCallMarketOrderFragment.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            Navigator.DefaultImpls.startActivity$default(navigator, fragmentActivityRequireActivity, new WatchListIntentKey(WatchListIntentKey2.ORDERS), null, false, null, null, 60, null);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: MarginCallMarketOrderFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/feature/margin/call/v2/marketorder/MarginCallMarketOrderFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/feature/margin/call/v2/marketorder/MarginCallMarketOrderFragment;", "Lcom/robinhood/android/margin/contracts/MarginCallMarketOrderFragmentKey;", "<init>", "()V", "feature-margin-call-v2_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<MarginCallMarketOrderFragment, MarginCallMarketOrderFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(MarginCallMarketOrderFragmentKey marginCallMarketOrderFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, marginCallMarketOrderFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public MarginCallMarketOrderFragmentKey getArgs(MarginCallMarketOrderFragment marginCallMarketOrderFragment) {
            return (MarginCallMarketOrderFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, marginCallMarketOrderFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public MarginCallMarketOrderFragment newInstance(MarginCallMarketOrderFragmentKey marginCallMarketOrderFragmentKey) {
            return (MarginCallMarketOrderFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, marginCallMarketOrderFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(MarginCallMarketOrderFragment marginCallMarketOrderFragment, MarginCallMarketOrderFragmentKey marginCallMarketOrderFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, marginCallMarketOrderFragment, marginCallMarketOrderFragmentKey);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MarginCallMarketOrderViewState ComposeContent$lambda$0(SnapshotState4<MarginCallMarketOrderViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
