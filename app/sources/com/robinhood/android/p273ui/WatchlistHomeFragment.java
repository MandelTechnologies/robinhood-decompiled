package com.robinhood.android.p273ui;

import android.os.Parcelable;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.unit.C2002Dp;
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
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.p273ui.WatchlistHomeStates3;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.WatchlistTabRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCompanion;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: WatchlistHomeFragment.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u001c2\u00020\u00012\u00020\u0002:\u0001\u001cB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0013\u001a\u00020\u0014H\u0017¢\u0006\u0002\u0010\u0015J\t\u0010\u0016\u001a\u00020\fH\u0096\u0001R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\fX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\fX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0018\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d²\u0006\n\u0010\u001e\u001a\u00020\u001fX\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/ui/WatchlistHomeFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "duxo", "Lcom/robinhood/android/ui/WatchlistHomeDuxo;", "getDuxo", "()Lcom/robinhood/android/ui/WatchlistHomeDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "toolbarVisible", "", "getToolbarVisible", "()Z", "hasBottomBar", "getHasBottomBar", "useDesignSystemToolbar", "getUseDesignSystemToolbar", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-watchlist-tab_externalDebug", "viewState", "Lcom/robinhood/android/ui/WatchlistHomeViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class WatchlistHomeFragment extends GenericComposeFragment implements RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(WatchlistTabRegionGate.INSTANCE);

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, WatchlistHomeDuxo.class);
    private final boolean hasBottomBar = true;
    private final boolean useDesignSystemToolbar = true;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(WatchlistHomeFragment watchlistHomeFragment, int i, Composer composer, int i2) {
        watchlistHomeFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return false;
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    private final WatchlistHomeDuxo getDuxo() {
        return (WatchlistHomeDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getHasBottomBar() {
        return this.hasBottomBar;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1469961667);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1469961667, i2, -1, "com.robinhood.android.ui.WatchlistHomeFragment.ComposeContent (WatchlistHomeFragment.kt:39)");
            }
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            ScaffoldKt.m5939ScaffoldTvnljyQ(ModifiersKt.logScreenTransitions(WindowInsetsPadding_androidKt.systemBarsPadding(Modifier.INSTANCE), new UserInteractionEventDescriptor(null, new Screen(Screen.Name.WATCHLIST_REDESIGN, null, null, null, 14, null), null, null, null, null, 61, null)), WatchlistHomeFragment2.INSTANCE.m20013getLambda$517303417$feature_watchlist_tab_externalDebug(), null, null, null, 0, 0L, 0L, WindowInsetsKt.WindowInsets$default(0, 0, 0, 0, 14, null), ComposableLambda3.rememberComposableLambda(203366162, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.ui.WatchlistHomeFragment.ComposeContent.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer2, Integer num) {
                    invoke(paddingValues, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(PaddingValues paddingValues, Composer composer2, int i3) {
                    Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                    if ((i3 & 6) == 0) {
                        i3 |= composer2.changed(paddingValues) ? 4 : 2;
                    }
                    if ((i3 & 19) == 18 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(203366162, i3, -1, "com.robinhood.android.ui.WatchlistHomeFragment.ComposeContent.<anonymous> (WatchlistHomeFragment.kt:51)");
                    }
                    WatchlistHomeStates3 watchlistHomeStates3ComposeContent$lambda$0 = WatchlistHomeFragment.ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                    if (watchlistHomeStates3ComposeContent$lambda$0 instanceof WatchlistHomeStates3.Loading) {
                        composer2.startReplaceGroup(-1717396466);
                        BoxKt.Box(com.robinhood.compose.bento.util.ModifiersKt.bentoPlaceholder(SizeKt.m5156height3ABfNKs(PaddingKt.padding(Modifier.INSTANCE, paddingValues), C2002Dp.m7995constructorimpl(30)), true, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(3))), composer2, 0);
                        composer2.endReplaceGroup();
                    } else {
                        if (!(watchlistHomeStates3ComposeContent$lambda$0 instanceof WatchlistHomeStates3.Loaded)) {
                            composer2.startReplaceGroup(-2133612130);
                            composer2.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composer2.startReplaceGroup(-1716963458);
                        WatchlistHomeStates3.Loaded loaded = (WatchlistHomeStates3.Loaded) watchlistHomeStates3ComposeContent$lambda$0;
                        WatchlistScreen4.WatchlistScreen(loaded.getAccountNumber(), PaddingKt.padding(Modifier.INSTANCE, paddingValues), loaded.getEnableSwipeToBuy(), null, composer2, 0, 8);
                        composer2.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 805306416, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.ui.WatchlistHomeFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return WatchlistHomeFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: WatchlistHomeFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/ui/WatchlistHomeFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithoutArgsCompanion;", "Lcom/robinhood/android/ui/WatchlistHomeFragment;", "<init>", "()V", "feature-watchlist-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithoutArgsCompanion<WatchlistHomeFragment> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public /* bridge */ /* synthetic */ Parcelable getArgs(Fragment fragment) {
            return (Parcelable) getArgs((WatchlistHomeFragment) fragment);
        }

        public Void getArgs(WatchlistHomeFragment watchlistHomeFragment) {
            return FragmentWithoutArgsCompanion.DefaultImpls.getArgs(this, watchlistHomeFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCreator
        public WatchlistHomeFragment newInstance() {
            return (WatchlistHomeFragment) FragmentWithoutArgsCompanion.DefaultImpls.newInstance(this);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCreator
        public WatchlistHomeFragment newInstance(Void r1) {
            return (WatchlistHomeFragment) FragmentWithoutArgsCompanion.DefaultImpls.newInstance(this, r1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WatchlistHomeStates3 ComposeContent$lambda$0(SnapshotState4<? extends WatchlistHomeStates3> snapshotState4) {
        return snapshotState4.getValue();
    }
}
