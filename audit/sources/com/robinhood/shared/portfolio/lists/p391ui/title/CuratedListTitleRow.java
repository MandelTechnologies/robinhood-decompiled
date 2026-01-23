package com.robinhood.shared.portfolio.lists.p391ui.title;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet3;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.android.common.portfolio.instrument.InstrumentDisplayTypeComposable;
import com.robinhood.android.common.portfolio.unified.DisplayType;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.shared.portfolio.lists.p391ui.C39419R;
import com.robinhood.shared.portfolio.lists.p391ui.title.CuratedListTitleRow;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.ImmutableMap;

/* compiled from: CuratedListTitleRow.kt */
@Metadata(m3635d1 = {"\u00000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u001aG\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u001a\u0010\b\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\r²\u0006\n\u0010\u000e\u001a\u00020\u000fX\u008a\u008e\u0002²\u0006\n\u0010\u0010\u001a\u00020\u0007X\u008a\u0084\u0002"}, m3636d2 = {"WATCHLIST_VIEW_MODE", "", "CuratedListTitleRow", "", "curatedListViewModes", "Lkotlinx/collections/immutable/ImmutableMap;", "Ljava/util/UUID;", "Lcom/robinhood/android/common/portfolio/unified/DisplayType;", "updateWatchlistViewMode", "Lkotlin/Function2;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lkotlinx/collections/immutable/ImmutableMap;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lib-lists-ui_externalDebug", "showBottomSheet", "", "watchlistViewMode"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.portfolio.lists.ui.title.CuratedListTitleRowKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CuratedListTitleRow {
    public static final String WATCHLIST_VIEW_MODE = "watchlist_view_mode";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CuratedListTitleRow$lambda$11(ImmutableMap immutableMap, Function2 function2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CuratedListTitleRow(immutableMap, function2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CuratedListTitleRow(final ImmutableMap<UUID, ? extends DisplayType> curatedListViewModes, Function2<? super UUID, ? super DisplayType, Unit> function2, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        boolean zChanged;
        Object objRememberedValue2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Object objRememberedValue3;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        final Function2<? super UUID, ? super DisplayType, Unit> updateWatchlistViewMode = function2;
        Intrinsics.checkNotNullParameter(curatedListViewModes, "curatedListViewModes");
        Intrinsics.checkNotNullParameter(updateWatchlistViewMode, "updateWatchlistViewMode");
        Composer composerStartRestartGroup = composer.startRestartGroup(-917334242);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(curatedListViewModes) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(updateWatchlistViewMode) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-917334242, i3, -1, "com.robinhood.shared.portfolio.lists.ui.title.CuratedListTitleRow (CuratedListTitleRow.kt:35)");
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged = composerStartRestartGroup.changed(curatedListViewModes);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.shared.portfolio.lists.ui.title.CuratedListTitleRowKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CuratedListTitleRow.CuratedListTitleRow$lambda$4$lambda$3(curatedListViewModes);
                        }
                    });
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                SnapshotState4 snapshotState4 = (SnapshotState4) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(modifier4, 0.0f, composerStartRestartGroup, (i3 >> 6) & 14, 1);
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21623defaultHorizontalPaddingrAjV9yQ);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor);
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                Modifier.Companion companion3 = Modifier.INSTANCE;
                Modifier modifierWeight$default = Row5.weight$default(row6, companion3, 1.0f, false, 2, null);
                String strStringResource = StringResources_androidKt.stringResource(C39419R.string.watchlist_curated_lists, composerStartRestartGroup, 0);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Modifier modifier5 = modifier4;
                BentoText2.m20747BentoText38GnDrw(strStringResource, modifierWeight$default, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8188);
                composerStartRestartGroup = composerStartRestartGroup;
                Modifier modifierTestTag = TestTag3.testTag(companion3, WATCHLIST_VIEW_MODE);
                BentoIcon4.Size24 size24 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.DOTS_ANDROID_24);
                long jM21426getFg20d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU();
                composerStartRestartGroup.startReplaceGroup(5004770);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.shared.portfolio.lists.ui.title.CuratedListTitleRowKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CuratedListTitleRow.CuratedListTitleRow$lambda$8$lambda$7$lambda$6(snapshotState);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoIcon2.m20644BentoIconFU0evQE(size24, null, jM21426getFg20d7_KjU, modifierTestTag, (Function0) objRememberedValue3, false, composerStartRestartGroup, BentoIcon4.Size24.$stable | 27696, 32);
                composerStartRestartGroup.endNode();
                if (CuratedListTitleRow$lambda$1(snapshotState)) {
                    updateWatchlistViewMode = function2;
                } else {
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = new Function0() { // from class: com.robinhood.shared.portfolio.lists.ui.title.CuratedListTitleRowKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CuratedListTitleRow.CuratedListTitleRow$lambda$10$lambda$9(snapshotState);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    updateWatchlistViewMode = function2;
                    RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI((Function0) objRememberedValue4, null, false, null, null, 0L, ComposableLambda3.rememberComposableLambda(-1240962454, true, new C394693(updateWatchlistViewMode, snapshotState4), composerStartRestartGroup, 54), composerStartRestartGroup, 1572870, 62);
                    composerStartRestartGroup = composerStartRestartGroup;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.portfolio.lists.ui.title.CuratedListTitleRowKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CuratedListTitleRow.CuratedListTitleRow$lambda$11(curatedListViewModes, updateWatchlistViewMode, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(5004770);
            zChanged = composerStartRestartGroup.changed(curatedListViewModes);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                objRememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.shared.portfolio.lists.ui.title.CuratedListTitleRowKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CuratedListTitleRow.CuratedListTitleRow$lambda$4$lambda$3(curatedListViewModes);
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                SnapshotState4 snapshotState42 = (SnapshotState4) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ2 = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(modifier4, 0.0f, composerStartRestartGroup, (i3 >> 6) & 14, 1);
                MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21623defaultHorizontalPaddingrAjV9yQ2);
                ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                    Row6 row62 = Row6.INSTANCE;
                    Modifier.Companion companion32 = Modifier.INSTANCE;
                    Modifier modifierWeight$default2 = Row5.weight$default(row62, companion32, 1.0f, false, 2, null);
                    String strStringResource2 = StringResources_androidKt.stringResource(C39419R.string.watchlist_curated_lists, composerStartRestartGroup, 0);
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i52 = BentoTheme.$stable;
                    Modifier modifier52 = modifier4;
                    BentoText2.m20747BentoText38GnDrw(strStringResource2, modifierWeight$default2, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i52).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8188);
                    composerStartRestartGroup = composerStartRestartGroup;
                    Modifier modifierTestTag2 = TestTag3.testTag(companion32, WATCHLIST_VIEW_MODE);
                    BentoIcon4.Size24 size242 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.DOTS_ANDROID_24);
                    long jM21426getFg20d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i52).m21426getFg20d7_KjU();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BentoIcon2.m20644BentoIconFU0evQE(size242, null, jM21426getFg20d7_KjU2, modifierTestTag2, (Function0) objRememberedValue3, false, composerStartRestartGroup, BentoIcon4.Size24.$stable | 27696, 32);
                    composerStartRestartGroup.endNode();
                    if (CuratedListTitleRow$lambda$1(snapshotState)) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier52;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void CuratedListTitleRow$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisplayType CuratedListTitleRow$lambda$4$lambda$3(ImmutableMap immutableMap) {
        Set set = CollectionsKt.toSet(immutableMap.values());
        if (set.size() == 1) {
            return (DisplayType) CollectionsKt.first(set);
        }
        return DisplayType.UNKNOWN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CuratedListTitleRow$lambda$8$lambda$7$lambda$6(SnapshotState snapshotState) {
        CuratedListTitleRow$lambda$2(snapshotState, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CuratedListTitleRow$lambda$10$lambda$9(SnapshotState snapshotState) {
        CuratedListTitleRow$lambda$2(snapshotState, false);
        return Unit.INSTANCE;
    }

    /* compiled from: CuratedListTitleRow.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.portfolio.lists.ui.title.CuratedListTitleRowKt$CuratedListTitleRow$3 */
    static final class C394693 implements Function3<RhModalBottomSheet5, Composer, Integer, Unit> {
        final /* synthetic */ Function2<UUID, DisplayType, Unit> $updateWatchlistViewMode;
        final /* synthetic */ SnapshotState4<DisplayType> $watchlistViewMode$delegate;

        /* JADX WARN: Multi-variable type inference failed */
        C394693(Function2<? super UUID, ? super DisplayType, Unit> function2, SnapshotState4<? extends DisplayType> snapshotState4) {
            this.$updateWatchlistViewMode = function2;
            this.$watchlistViewMode$delegate = snapshotState4;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer, Integer num) {
            invoke(rhModalBottomSheet5, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(final RhModalBottomSheet5 RhModalBottomSheet, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
            if ((i & 6) == 0) {
                i |= (i & 8) == 0 ? composer.changed(RhModalBottomSheet) : composer.changedInstance(RhModalBottomSheet) ? 4 : 2;
            }
            if ((i & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1240962454, i, -1, "com.robinhood.shared.portfolio.lists.ui.title.CuratedListTitleRow.<anonymous> (CuratedListTitleRow.kt:77)");
            }
            boolean z = false;
            String strStringResource = StringResources_androidKt.stringResource(C39419R.string.lists_display_data, composer, 0);
            DisplayType displayTypeCuratedListTitleRow$lambda$5 = CuratedListTitleRow.CuratedListTitleRow$lambda$5(this.$watchlistViewMode$delegate);
            ImmutableList3<DisplayType> defaultTypes = DisplayType.INSTANCE.getDefaultTypes();
            composer.startReplaceGroup(-1633490746);
            if ((i & 14) == 4 || ((i & 8) != 0 && composer.changedInstance(RhModalBottomSheet))) {
                z = true;
            }
            boolean zChanged = composer.changed(this.$updateWatchlistViewMode) | z;
            final Function2<UUID, DisplayType, Unit> function2 = this.$updateWatchlistViewMode;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.shared.portfolio.lists.ui.title.CuratedListTitleRowKt$CuratedListTitleRow$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CuratedListTitleRow.C394693.invoke$lambda$1$lambda$0(RhModalBottomSheet, function2, (DisplayType) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            InstrumentDisplayTypeComposable.InstrumentDisplayTypeComposable(displayTypeCuratedListTitleRow$lambda$5, defaultTypes, null, strStringResource, (Function1) objRememberedValue, composer, 0, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(RhModalBottomSheet5 rhModalBottomSheet5, Function2 function2, DisplayType displayType) {
            Intrinsics.checkNotNullParameter(displayType, "displayType");
            RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet5, null, 1, null);
            function2.invoke(null, displayType);
            return Unit.INSTANCE;
        }
    }

    private static final boolean CuratedListTitleRow$lambda$1(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisplayType CuratedListTitleRow$lambda$5(SnapshotState4<? extends DisplayType> snapshotState4) {
        return snapshotState4.getValue();
    }
}
