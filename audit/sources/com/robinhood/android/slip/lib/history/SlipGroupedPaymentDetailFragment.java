package com.robinhood.android.slip.lib.history;

import android.content.res.Resources;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SlipRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.slip.contracts.SlipGroupedPaymentDetailFragmentKey;
import com.robinhood.android.slip.lib.history.SlipGroupedPaymentDetailFragment;
import com.robinhood.android.slip.lib.history.SlipGroupedPaymentDetailState3;
import com.robinhood.compose.app.ErrorScreenComposable;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.compose.common.ShimmerLoaderType;
import com.robinhood.shared.history.compose.BaseDetailComposable;
import com.robinhood.shared.history.compose.BaseDetailState;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SlipGroupedPaymentDetailFragment.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0001\u001aB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0011\u001a\u00020\u0012H\u0017¢\u0006\u0002\u0010\u0013J\t\u0010\u0014\u001a\u00020\u0006H\u0096\u0001R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/slip/lib/history/SlipGroupedPaymentDetailFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "toolbarVisible", "getToolbarVisible", "duxo", "Lcom/robinhood/android/slip/lib/history/SlipGroupedPaymentDetailDuxo;", "getDuxo", "()Lcom/robinhood/android/slip/lib/history/SlipGroupedPaymentDetailDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-lib-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class SlipGroupedPaymentDetailFragment extends GenericComposeFragment implements RegionGated {
    private final boolean toolbarVisible;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(SlipRegionGate.INSTANCE);
    private final boolean useDesignSystemToolbar = true;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, SlipGroupedPaymentDetailDuxo.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(SlipGroupedPaymentDetailFragment slipGroupedPaymentDetailFragment, int i, Composer composer, int i2) {
        slipGroupedPaymentDetailFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    public final SlipGroupedPaymentDetailDuxo getDuxo() {
        return (SlipGroupedPaymentDetailDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(138544990);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(138544990, i2, -1, "com.robinhood.android.slip.lib.history.SlipGroupedPaymentDetailFragment.ComposeContent (SlipGroupedPaymentDetailFragment.kt:41)");
            }
            SlipGroupedPaymentDetailState3 slipGroupedPaymentDetailState3 = (SlipGroupedPaymentDetailState3) SnapshotStateKt.collectAsState(getDuxo().getStateFlow(), null, composerStartRestartGroup, 0, 1).getValue();
            BentoTheme2.BentoTheme(null, null, null, null, null, Boolean.TRUE, null, null, ComposableLambda3.rememberComposableLambda(-1771561706, true, new C285481(slipGroupedPaymentDetailState3 instanceof SlipGroupedPaymentDetailState3.Loaded ? (SlipGroupedPaymentDetailState3.Loaded) slipGroupedPaymentDetailState3 : null, this, slipGroupedPaymentDetailState3), composerStartRestartGroup, 54), composerStartRestartGroup, 100859904, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.slip.lib.history.SlipGroupedPaymentDetailFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SlipGroupedPaymentDetailFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: SlipGroupedPaymentDetailFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.slip.lib.history.SlipGroupedPaymentDetailFragment$ComposeContent$1 */
    static final class C285481 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ SlipGroupedPaymentDetailState3.Loaded $loadedState;
        final /* synthetic */ SlipGroupedPaymentDetailState3 $viewState;
        final /* synthetic */ SlipGroupedPaymentDetailFragment this$0;

        C285481(SlipGroupedPaymentDetailState3.Loaded loaded, SlipGroupedPaymentDetailFragment slipGroupedPaymentDetailFragment, SlipGroupedPaymentDetailState3 slipGroupedPaymentDetailState3) {
            this.$loadedState = loaded;
            this.this$0 = slipGroupedPaymentDetailFragment;
            this.$viewState = slipGroupedPaymentDetailState3;
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
                ComposerKt.traceEventStart(-1771561706, i, -1, "com.robinhood.android.slip.lib.history.SlipGroupedPaymentDetailFragment.ComposeContent.<anonymous> (SlipGroupedPaymentDetailFragment.kt:45)");
            }
            SlipGroupedPaymentDetailState3.Loaded loaded = this.$loadedState;
            StringResource title = loaded != null ? loaded.getTitle() : null;
            composer.startReplaceGroup(-1663746233);
            String textAsString = title == null ? null : StringResources6.getTextAsString(title, composer, StringResource.$stable);
            composer.endReplaceGroup();
            SlipGroupedPaymentDetailState3.Loaded loaded2 = this.$loadedState;
            StringResource subtitle = loaded2 != null ? loaded2.getSubtitle() : null;
            composer.startReplaceGroup(-1663743897);
            String textAsString2 = subtitle != null ? StringResources6.getTextAsString(subtitle, composer, StringResource.$stable) : null;
            composer.endReplaceGroup();
            BaseDetailState baseDetailState = new BaseDetailState(null, textAsString, textAsString2, null, 9, null);
            Navigator navigator = this.this$0.getNavigator();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(this.this$0);
            final SlipGroupedPaymentDetailFragment slipGroupedPaymentDetailFragment = this.this$0;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.slip.lib.history.SlipGroupedPaymentDetailFragment$ComposeContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SlipGroupedPaymentDetailFragment.C285481.invoke$lambda$1$lambda$0(slipGroupedPaymentDetailFragment);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BaseDetailComposable.BaseDetailComposable(baseDetailState, navigator, (Function0) objRememberedValue, null, ComposableLambda3.rememberComposableLambda(412145366, true, new AnonymousClass2(this.$viewState, this.this$0), composer, 54), composer, BaseDetailState.$stable | 24576, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* compiled from: SlipGroupedPaymentDetailFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.slip.lib.history.SlipGroupedPaymentDetailFragment$ComposeContent$1$2, reason: invalid class name */
        static final class AnonymousClass2 implements Function2<Composer, Integer, Unit> {
            final /* synthetic */ SlipGroupedPaymentDetailState3 $viewState;
            final /* synthetic */ SlipGroupedPaymentDetailFragment this$0;

            AnonymousClass2(SlipGroupedPaymentDetailState3 slipGroupedPaymentDetailState3, SlipGroupedPaymentDetailFragment slipGroupedPaymentDetailFragment) {
                this.$viewState = slipGroupedPaymentDetailState3;
                this.this$0 = slipGroupedPaymentDetailFragment;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) throws Resources.NotFoundException {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) throws Resources.NotFoundException {
                if ((i & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(412145366, i, -1, "com.robinhood.android.slip.lib.history.SlipGroupedPaymentDetailFragment.ComposeContent.<anonymous>.<anonymous> (SlipGroupedPaymentDetailFragment.kt:53)");
                }
                SlipGroupedPaymentDetailState3 slipGroupedPaymentDetailState3 = this.$viewState;
                if (slipGroupedPaymentDetailState3 instanceof SlipGroupedPaymentDetailState3.Loaded) {
                    composer.startReplaceGroup(-1088791047);
                    SlipGroupedPaymentDetailState3.Loaded loaded = (SlipGroupedPaymentDetailState3.Loaded) this.$viewState;
                    Resources resources = this.this$0.getResources();
                    Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                    SlipGroupedPaymentDetailFragment2.SlipGroupedPaymentDetailComposable(loaded, resources, null, composer, 0, 4);
                    composer.endReplaceGroup();
                } else if (slipGroupedPaymentDetailState3 instanceof SlipGroupedPaymentDetailState3.Loading) {
                    composer.startReplaceGroup(-1088513380);
                    LoadingScreenComposablesKt.ShimmerLoadingComposable(new ShimmerLoaderType.List(false, false, 3, 3, null), null, composer, ShimmerLoaderType.List.$stable, 2);
                    composer.endReplaceGroup();
                } else {
                    if (!(slipGroupedPaymentDetailState3 instanceof SlipGroupedPaymentDetailState3.Error)) {
                        composer.startReplaceGroup(934706859);
                        composer.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composer.startReplaceGroup(-1088271828);
                    composer.startReplaceGroup(5004770);
                    boolean zChangedInstance = composer.changedInstance(this.this$0);
                    final SlipGroupedPaymentDetailFragment slipGroupedPaymentDetailFragment = this.this$0;
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.slip.lib.history.SlipGroupedPaymentDetailFragment$ComposeContent$1$2$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return SlipGroupedPaymentDetailFragment.C285481.AnonymousClass2.invoke$lambda$1$lambda$0(slipGroupedPaymentDetailFragment);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    composer.endReplaceGroup();
                    ErrorScreenComposable.ErrorScreenComposable(null, (Function0) objRememberedValue, 0, null, null, null, null, false, composer, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE);
                    composer.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$1$lambda$0(SlipGroupedPaymentDetailFragment slipGroupedPaymentDetailFragment) {
                slipGroupedPaymentDetailFragment.getDuxo().fetch();
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(SlipGroupedPaymentDetailFragment slipGroupedPaymentDetailFragment) {
            slipGroupedPaymentDetailFragment.requireActivity().getOnBackPressedDispatcher().onBackPressed();
            return Unit.INSTANCE;
        }
    }

    /* compiled from: SlipGroupedPaymentDetailFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/slip/lib/history/SlipGroupedPaymentDetailFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/slip/lib/history/SlipGroupedPaymentDetailFragment;", "Lcom/robinhood/android/slip/contracts/SlipGroupedPaymentDetailFragmentKey;", "<init>", "()V", "feature-lib-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<SlipGroupedPaymentDetailFragment, SlipGroupedPaymentDetailFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(SlipGroupedPaymentDetailFragmentKey slipGroupedPaymentDetailFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, slipGroupedPaymentDetailFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public SlipGroupedPaymentDetailFragmentKey getArgs(SlipGroupedPaymentDetailFragment slipGroupedPaymentDetailFragment) {
            return (SlipGroupedPaymentDetailFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, slipGroupedPaymentDetailFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public SlipGroupedPaymentDetailFragment newInstance(SlipGroupedPaymentDetailFragmentKey slipGroupedPaymentDetailFragmentKey) {
            return (SlipGroupedPaymentDetailFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, slipGroupedPaymentDetailFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(SlipGroupedPaymentDetailFragment slipGroupedPaymentDetailFragment, SlipGroupedPaymentDetailFragmentKey slipGroupedPaymentDetailFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, slipGroupedPaymentDetailFragment, slipGroupedPaymentDetailFragmentKey);
        }
    }
}
