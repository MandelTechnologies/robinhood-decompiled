package com.robinhood.android.taxcenter.timelineinfo;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.p011ui.Modifier;
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
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.taxcenter.BaseTaxComposeFragment;
import com.robinhood.android.taxcenter.timelineinfo.TaxTimelineInfoViewState;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.common.HeaderButtonBarScreenLayout6;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import java.util.List;
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
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: TaxTimelineInfoFragment.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0017¢\u0006\u0002\u0010\u0010R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012²\u0006\n\u0010\u0013\u001a\u00020\u0014X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/taxcenter/timelineinfo/TaxTimelineInfoFragment;", "Lcom/robinhood/android/taxcenter/BaseTaxComposeFragment;", "<init>", "()V", "duxo", "Lcom/robinhood/android/taxcenter/timelineinfo/TaxTimelineInfoDuxo;", "getDuxo", "()Lcom/robinhood/android/taxcenter/timelineinfo/TaxTimelineInfoDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "TaxCenterContent", "", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "listState", "Landroidx/compose/foundation/lazy/LazyListState;", "(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/runtime/Composer;I)V", "Companion", "feature-tax-center_externalDebug", "viewState", "Lcom/robinhood/android/taxcenter/timelineinfo/TaxTimelineInfoViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class TaxTimelineInfoFragment extends BaseTaxComposeFragment {

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, TaxTimelineInfoDuxo.class);

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TaxCenterContent$lambda$1(TaxTimelineInfoFragment taxTimelineInfoFragment, PaddingValues paddingValues, LazyListState lazyListState, int i, Composer composer, int i2) {
        taxTimelineInfoFragment.TaxCenterContent(paddingValues, lazyListState, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    private final TaxTimelineInfoDuxo getDuxo() {
        return (TaxTimelineInfoDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.taxcenter.BaseTaxComposeFragment
    public void TaxCenterContent(final PaddingValues paddingValues, final LazyListState listState, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        Intrinsics.checkNotNullParameter(listState, "listState");
        Composer composerStartRestartGroup = composer.startRestartGroup(1634989058);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(paddingValues) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(listState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(this) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1634989058, i2, -1, "com.robinhood.android.taxcenter.timelineinfo.TaxTimelineInfoFragment.TaxCenterContent (TaxTimelineInfoFragment.kt:25)");
            }
            final TaxTimelineInfoViewState taxTimelineInfoViewStateTaxCenterContent$lambda$0 = TaxCenterContent$lambda$0(FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7));
            if (taxTimelineInfoViewStateTaxCenterContent$lambda$0 instanceof TaxTimelineInfoViewState.Loading) {
                composerStartRestartGroup.startReplaceGroup(-733536544);
                LoadingScreenComposablesKt.GenericTextLoadingScreenComposable(null, false, true, composerStartRestartGroup, 384, 3);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!(taxTimelineInfoViewStateTaxCenterContent$lambda$0 instanceof TaxTimelineInfoViewState.Ready)) {
                    composerStartRestartGroup.startReplaceGroup(-733538524);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(-733531497);
                HeaderButtonBarScreenLayout6.HeaderButtonBarScreenLayout(null, TaxTimelineInfoFragment2.INSTANCE.m19222getLambda$1138310269$feature_tax_center_externalDebug(), ComposableLambda3.rememberComposableLambda(937266863, true, new Function3<BentoButtonBar3, Composer, Integer, Unit>() { // from class: com.robinhood.android.taxcenter.timelineinfo.TaxTimelineInfoFragment.TaxCenterContent.1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer2, Integer num) {
                        invoke(bentoButtonBar3, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(BentoButtonBar3 HeaderButtonBarScreenLayout, Composer composer2, int i3) {
                        Intrinsics.checkNotNullParameter(HeaderButtonBarScreenLayout, "$this$HeaderButtonBarScreenLayout");
                        if ((i3 & 17) == 16 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(937266863, i3, -1, "com.robinhood.android.taxcenter.timelineinfo.TaxTimelineInfoFragment.TaxCenterContent.<anonymous> (TaxTimelineInfoFragment.kt:36)");
                        }
                        if (((TaxTimelineInfoViewState.Ready) taxTimelineInfoViewStateTaxCenterContent$lambda$0).getCtaContent() != null) {
                            List<UIComponent<GenericAction>> ctaContent = ((TaxTimelineInfoViewState.Ready) taxTimelineInfoViewStateTaxCenterContent$lambda$0).getCtaContent();
                            Modifier.Companion companion = Modifier.INSTANCE;
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i4 = BentoTheme.$stable;
                            Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(companion, bentoTheme.getSpacing(composer2, i4).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i4).m21590getDefaultD9Ej5fM());
                            composer2.startReplaceGroup(1076610452);
                            LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composer2, 0, 3);
                            HorizontalPadding horizontalPadding = HorizontalPadding.Default;
                            ImmutableList3 persistentList = extensions2.toPersistentList(ctaContent);
                            composer2.startReplaceGroup(767440808);
                            SduiColumns.SduiLazyColumn(persistentList, GenericAction.class, modifierM5143paddingVpY3zN4, lazyListStateRememberLazyListState, null, null, horizontalPadding, true, composer2, 12582912, 0);
                            composer2.endReplaceGroup();
                            composer2.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-892502395, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.taxcenter.timelineinfo.TaxTimelineInfoFragment.TaxCenterContent.2
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
                            ComposerKt.traceEventStart(-892502395, i3, -1, "com.robinhood.android.taxcenter.timelineinfo.TaxTimelineInfoFragment.TaxCenterContent.<anonymous> (TaxTimelineInfoFragment.kt:48)");
                        }
                        List<UIComponent<GenericAction>> content = ((TaxTimelineInfoViewState.Ready) taxTimelineInfoViewStateTaxCenterContent$lambda$0).getContent();
                        Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, paddingValues);
                        LazyListState lazyListState = listState;
                        composer2.startReplaceGroup(1076610452);
                        HorizontalPadding horizontalPadding = HorizontalPadding.Default;
                        ImmutableList3 persistentList = extensions2.toPersistentList(content);
                        composer2.startReplaceGroup(767440808);
                        SduiColumns.SduiLazyColumn(persistentList, GenericAction.class, modifierPadding, lazyListState, null, null, horizontalPadding, false, composer2, 12582912, 0);
                        composer2.endReplaceGroup();
                        composer2.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 3504, 1);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.taxcenter.timelineinfo.TaxTimelineInfoFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TaxTimelineInfoFragment.TaxCenterContent$lambda$1(this.f$0, paddingValues, listState, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: TaxTimelineInfoFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/taxcenter/timelineinfo/TaxTimelineInfoFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/taxcenter/timelineinfo/TaxTimelineInfoFragment;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$TaxTimelineInfo;", "<init>", "()V", "feature-tax-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<TaxTimelineInfoFragment, LegacyFragmentKey.TaxTimelineInfo> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LegacyFragmentKey.TaxTimelineInfo taxTimelineInfo) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, taxTimelineInfo);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LegacyFragmentKey.TaxTimelineInfo getArgs(TaxTimelineInfoFragment taxTimelineInfoFragment) {
            return (LegacyFragmentKey.TaxTimelineInfo) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, taxTimelineInfoFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public TaxTimelineInfoFragment newInstance(LegacyFragmentKey.TaxTimelineInfo taxTimelineInfo) {
            return (TaxTimelineInfoFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, taxTimelineInfo);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(TaxTimelineInfoFragment taxTimelineInfoFragment, LegacyFragmentKey.TaxTimelineInfo taxTimelineInfo) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, taxTimelineInfoFragment, taxTimelineInfo);
        }
    }

    private static final TaxTimelineInfoViewState TaxCenterContent$lambda$0(SnapshotState4<? extends TaxTimelineInfoViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
