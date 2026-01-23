package com.robinhood.shared.taxLots;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.DrawModifierKt;
import androidx.compose.p011ui.focus.FocusChangedModifier2;
import androidx.compose.p011ui.focus.FocusState;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.generic.table.DisplayDetails;
import com.robinhood.android.generic.table.GenericTableData;
import com.robinhood.android.generic.table.GenericTableKt;
import com.robinhood.android.generic.table.StickyColumn;
import com.robinhood.compose.bento.component.BentoProgressIndicator2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.shared.taxLots.TaxLotCell;
import com.robinhood.shared.taxLots.TaxLotTableState;
import com.robinhood.shared.taxLots.TaxLotsTableKt;
import com.robinhood.shared.taxLots.views.TaxLotLoadingTable4;
import com.robinhood.shared.taxLots.views.TaxLotTableDisplayCell2;
import com.robinhood.shared.taxLots.views.TaxLotTableHeaderCell;
import com.robinhood.shared.taxLots.views.TaxLotTableInputCell3;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TaxLotsTable.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001aÕ\u0001\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062!\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00010\b26\u0010\r\u001a2\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00010\u000e2!\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00010\b2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0007¢\u0006\u0002\u0010\u0018\u001a9\u0010\u0019\u001a\u00020\u0015*\u00020\u00152\b\b\u0002\u0010\u001a\u001a\u00020\u00102\b\b\u0002\u0010\u001b\u001a\u00020\u00102\b\b\u0002\u0010\u001c\u001a\u00020\u00102\b\b\u0002\u0010\u001d\u001a\u00020\u0010H\u0003¢\u0006\u0002\u0010\u001e\u001a\f\u0010\u001f\u001a\u00020\u0010*\u00020\u0017H\u0002¨\u0006 ²\u0006\n\u0010\u001f\u001a\u00020\u0010X\u008a\u0084\u0002"}, m3636d2 = {"TaxLotTable", "", "T", "state", "Lcom/robinhood/shared/taxLots/TaxLotTableState;", "requestNextPage", "Lkotlin/Function0;", "onHeaderClicked", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "sortId", "onCheckBoxClicked", "Lkotlin/Function2;", "id", "", "isSelected", "onInputFieldFocused", "onTapAction", "modifier", "Landroidx/compose/ui/Modifier;", "scrollState", "Landroidx/compose/foundation/lazy/LazyListState;", "(Lcom/robinhood/shared/taxLots/TaxLotTableState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/runtime/Composer;II)V", "applyBorder", "start", "end", "top", "bottom", "(Landroidx/compose/ui/Modifier;ZZZZLandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;", "reachedBottom", "lib-lot-table-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class TaxLotsTableKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TaxLotTable$lambda$4(TaxLotTableState taxLotTableState, Function0 function0, Function1 function1, Function2 function2, Function1 function12, Function1 function13, Modifier modifier, LazyListState lazyListState, int i, int i2, Composer composer, int i3) {
        TaxLotTable(taxLotTableState, function0, function1, function2, function12, function13, modifier, lazyListState, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit applyBorder$lambda$7$lambda$6(boolean z, float f, long j, boolean z2, boolean z3, boolean z4, DrawScope drawBehind) {
        float f2;
        int i;
        Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
        if (z) {
            float f3 = f / 2;
            long jM6535constructorimpl = Offset.m6535constructorimpl((Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L));
            float fIntBitsToFloat = Float.intBitsToFloat((int) (drawBehind.mo6963getSizeNHjbRc() & 4294967295L));
            f2 = 0.0f;
            i = 2;
            DrawScope.m6951drawLineNGM6Ib0$default(drawBehind, j, jM6535constructorimpl, Offset.m6535constructorimpl((Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L)), f, 0, null, 0.0f, null, 0, 496, null);
        } else {
            f2 = 0.0f;
            i = 2;
        }
        if (z2) {
            long jM6535constructorimpl2 = Offset.m6535constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind.mo6963getSizeNHjbRc() >> 32)) - r2) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawBehind.mo6963getSizeNHjbRc() >> 32)) - (f / i);
            float fIntBitsToFloat3 = Float.intBitsToFloat((int) (drawBehind.mo6963getSizeNHjbRc() & 4294967295L));
            DrawScope.m6951drawLineNGM6Ib0$default(drawBehind, j, jM6535constructorimpl2, Offset.m6535constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat3) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat2) << 32)), f, 0, null, 0.0f, null, 0, 496, null);
        }
        if (z3) {
            float f4 = f / i;
            DrawScope.m6951drawLineNGM6Ib0$default(drawBehind, j, Offset.m6535constructorimpl((Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L)), Offset.m6535constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind.mo6963getSizeNHjbRc() >> 32))) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L)), f, 0, null, 0.0f, null, 0, 496, null);
        }
        if (z4) {
            float f5 = f / i;
            float fIntBitsToFloat4 = Float.intBitsToFloat((int) (drawBehind.mo6963getSizeNHjbRc() & 4294967295L)) - f5;
            long jM6535constructorimpl3 = Offset.m6535constructorimpl((Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat4) & 4294967295L));
            float fIntBitsToFloat5 = Float.intBitsToFloat((int) (drawBehind.mo6963getSizeNHjbRc() >> 32));
            float fIntBitsToFloat6 = Float.intBitsToFloat((int) (drawBehind.mo6963getSizeNHjbRc() & 4294967295L)) - f5;
            DrawScope.m6951drawLineNGM6Ib0$default(drawBehind, j, jM6535constructorimpl3, Offset.m6535constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat5) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat6) & 4294967295L)), f, 0, null, 0.0f, null, 0, 496, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> void TaxLotTable(final TaxLotTableState<T> state, final Function0<Unit> requestNextPage, final Function1<? super String, Unit> onHeaderClicked, final Function2<? super String, ? super Boolean, Unit> onCheckBoxClicked, final Function1<? super String, Unit> onInputFieldFocused, final Function1<? super T, Unit> onTapAction, Modifier modifier, LazyListState lazyListState, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final LazyListState lazyListStateRememberLazyListState;
        int i4;
        Modifier modifier3;
        Object objRememberedValue;
        Composer.Companion companion;
        boolean z;
        int i5;
        int i6;
        int i7;
        LazyListState lazyListState2;
        SnapshotState4 snapshotState4;
        boolean z2;
        Continuation continuation;
        int i8;
        Composer composer2;
        boolean z3;
        Object objRememberedValue2;
        final Modifier modifier4;
        final LazyListState lazyListState3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(requestNextPage, "requestNextPage");
        Intrinsics.checkNotNullParameter(onHeaderClicked, "onHeaderClicked");
        Intrinsics.checkNotNullParameter(onCheckBoxClicked, "onCheckBoxClicked");
        Intrinsics.checkNotNullParameter(onInputFieldFocused, "onInputFieldFocused");
        Intrinsics.checkNotNullParameter(onTapAction, "onTapAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2060408678);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(requestNextPage) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onHeaderClicked) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onCheckBoxClicked) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onInputFieldFocused) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onTapAction) ? 131072 : 65536;
        }
        int i9 = i2 & 64;
        if (i9 == 0) {
            if ((1572864 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 1048576 : 524288;
            }
            if ((12582912 & i) != 0) {
                if ((i2 & 128) == 0) {
                    lazyListStateRememberLazyListState = lazyListState;
                    int i10 = composerStartRestartGroup.changed(lazyListStateRememberLazyListState) ? 8388608 : 4194304;
                    i3 |= i10;
                } else {
                    lazyListStateRememberLazyListState = lazyListState;
                }
                i3 |= i10;
            } else {
                lazyListStateRememberLazyListState = lazyListState;
            }
            if ((i3 & 4793491) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    Modifier modifier5 = i9 == 0 ? Modifier.INSTANCE : modifier;
                    if ((i2 & 128) == 0) {
                        Modifier modifier6 = modifier5;
                        i4 = i3 & (-29360129);
                        modifier3 = modifier6;
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    } else {
                        Modifier modifier7 = modifier5;
                        i4 = i3;
                        modifier3 = modifier7;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 128) != 0) {
                        i3 &= -29360129;
                    }
                    i4 = i3;
                    modifier3 = modifier;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2060408678, i4, -1, "com.robinhood.shared.taxLots.TaxLotTable (TaxLotsTable.kt:53)");
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.shared.taxLots.TaxLotsTableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Boolean.valueOf(TaxLotsTableKt.reachedBottom(lazyListStateRememberLazyListState));
                        }
                    });
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                SnapshotState4 snapshotState42 = (SnapshotState4) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                if (!(state instanceof TaxLotTableState.Loading)) {
                    composerStartRestartGroup.startReplaceGroup(-72798611);
                    TaxLotLoadingTable4.TaxLotLoadingTable((TaxLotTableState.Loading) state, SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), composerStartRestartGroup, i4 & 14, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    z = false;
                    i7 = i4;
                    snapshotState4 = snapshotState42;
                    lazyListState2 = lazyListStateRememberLazyListState;
                    continuation = null;
                    i5 = 32;
                    i6 = 3;
                    z2 = true;
                    composer2 = composerStartRestartGroup;
                    i8 = 4;
                } else {
                    if (!(state instanceof TaxLotTableState.Loaded)) {
                        composerStartRestartGroup.startReplaceGroup(-72796160);
                        composerStartRestartGroup.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composerStartRestartGroup.startReplaceGroup(2038512948);
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
                    float fM7995constructorimpl = C2002Dp.m7995constructorimpl(36);
                    TaxLotTableState.Loaded loaded = (TaxLotTableState.Loaded) state;
                    int i11 = i4;
                    GenericTableData<TaxLotCell<T>> tableData = loaded.getTableData();
                    StickyColumn stickyColumnDetails = loaded.getStickyColumnDetails();
                    z = false;
                    i5 = 32;
                    i6 = 3;
                    i7 = i11;
                    lazyListState2 = lazyListStateRememberLazyListState;
                    snapshotState4 = snapshotState42;
                    z2 = true;
                    continuation = null;
                    i8 = 4;
                    GenericTableKt.m14971GenericTable9SxZPhU(tableData, ComposableLambda3.rememberComposableLambda(-85557246, true, new C400681(state, onTapAction, onHeaderClicked, onInputFieldFocused, onCheckBoxClicked), composerStartRestartGroup, 54), modifierFillMaxSize$default, false, C2002Dp.m7993boximpl(fM7995constructorimpl), null, lazyListState2, null, null, stickyColumnDetails, ComposableLambda3.rememberComposableLambda(1312995694, true, new Function3<Column5, Composer, Integer, Unit>() { // from class: com.robinhood.shared.taxLots.TaxLotsTableKt.TaxLotTable.2
                        public final void invoke(Column5 GenericTable, Composer composer3, int i12) {
                            Intrinsics.checkNotNullParameter(GenericTable, "$this$GenericTable");
                            if ((i12 & 17) == 16 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1312995694, i12, -1, "com.robinhood.shared.taxLots.TaxLotTable.<anonymous> (TaxLotsTable.kt:136)");
                            }
                            if (((TaxLotTableState.Loaded) state).getHasNextPage()) {
                                Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 1, null);
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierM5144paddingVpY3zN4$default);
                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                if (composer3.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                BentoProgressIndicator2.m20700BentoCircularProgressIndicatorFNF3uiM(null, null, 0L, composer3, 0, 7);
                                composer3.endNode();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer3, Integer num) {
                            invoke(column5, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }
                    }, composerStartRestartGroup, 54), null, composerStartRestartGroup, GenericTableData.$stable | 24624 | ((i11 >> 3) & 3670016), 6, 2472);
                    composer2 = composerStartRestartGroup;
                    composer2.endReplaceGroup();
                }
                Boolean boolValueOf = Boolean.valueOf(TaxLotTable$lambda$2(snapshotState4));
                composer2.startReplaceGroup(-1746271574);
                boolean z4 = (i7 & 14) != i8 ? z2 : z;
                if ((i7 & 112) == i5) {
                    z = z2;
                }
                z3 = z4 | z;
                objRememberedValue2 = composer2.rememberedValue();
                if (!z3 || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new TaxLotsTableKt$TaxLotTable$3$1(state, requestNextPage, snapshotState4, continuation);
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceGroup();
                EffectsKt.LaunchedEffect(boolValueOf, state, (Function2) objRememberedValue2, composer2, (i7 << i6) & 112);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                lazyListState3 = lazyListState2;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier4 = modifier2;
                lazyListState3 = lazyListStateRememberLazyListState;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.taxLots.TaxLotsTableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return TaxLotsTableKt.TaxLotTable$lambda$4(state, requestNextPage, onHeaderClicked, onCheckBoxClicked, onInputFieldFocused, onTapAction, modifier4, lazyListState3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 1572864;
        modifier2 = modifier;
        if ((12582912 & i) != 0) {
        }
        if ((i3 & 4793491) == 4793490) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i9 == 0) {
                }
                if ((i2 & 128) == 0) {
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                SnapshotState4 snapshotState422 = (SnapshotState4) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                if (!(state instanceof TaxLotTableState.Loading)) {
                }
                Boolean boolValueOf2 = Boolean.valueOf(TaxLotTable$lambda$2(snapshotState4));
                composer2.startReplaceGroup(-1746271574);
                if ((i7 & 14) != i8) {
                }
                if ((i7 & 112) == i5) {
                }
                z3 = z4 | z;
                objRememberedValue2 = composer2.rememberedValue();
                if (!z3) {
                    objRememberedValue2 = new TaxLotsTableKt$TaxLotTable$3$1(state, requestNextPage, snapshotState4, continuation);
                    composer2.updateRememberedValue(objRememberedValue2);
                    composer2.endReplaceGroup();
                    EffectsKt.LaunchedEffect(boolValueOf2, state, (Function2) objRememberedValue2, composer2, (i7 << i6) & 112);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier4 = modifier3;
                    lazyListState3 = lazyListState2;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: TaxLotsTable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.taxLots.TaxLotsTableKt$TaxLotTable$1 */
    static final class C400681<T> implements Function6<TaxLotCell<T>, C2002Dp, C2002Dp, DisplayDetails, Composer, Integer, Unit> {
        final /* synthetic */ Function2<String, Boolean, Unit> $onCheckBoxClicked;
        final /* synthetic */ Function1<String, Unit> $onHeaderClicked;
        final /* synthetic */ Function1<String, Unit> $onInputFieldFocused;
        final /* synthetic */ Function1<T, Unit> $onTapAction;
        final /* synthetic */ TaxLotTableState<T> $state;

        /* JADX WARN: Multi-variable type inference failed */
        C400681(TaxLotTableState<T> taxLotTableState, Function1<? super T, Unit> function1, Function1<? super String, Unit> function12, Function1<? super String, Unit> function13, Function2<? super String, ? super Boolean, Unit> function2) {
            this.$state = taxLotTableState;
            this.$onTapAction = function1;
            this.$onHeaderClicked = function12;
            this.$onInputFieldFocused = function13;
            this.$onCheckBoxClicked = function2;
        }

        @Override // kotlin.jvm.functions.Function6
        public /* bridge */ /* synthetic */ Unit invoke(Object obj, C2002Dp c2002Dp, C2002Dp c2002Dp2, DisplayDetails displayDetails, Composer composer, Integer num) {
            m25776invokeC8IHX40((TaxLotCell) obj, c2002Dp, c2002Dp2, displayDetails, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-C8IHX40, reason: not valid java name */
        public final void m25776invokeC8IHX40(final TaxLotCell<T> cell, C2002Dp c2002Dp, C2002Dp c2002Dp2, DisplayDetails destruct$, Composer composer, int i) {
            int i2;
            Modifier modifierM5156height3ABfNKs;
            Modifier modifierM5174width3ABfNKs;
            Modifier modifierM5156height3ABfNKs2;
            Modifier modifierM5174width3ABfNKs2;
            Modifier modifierM5156height3ABfNKs3;
            Modifier modifierM5174width3ABfNKs3;
            Intrinsics.checkNotNullParameter(cell, "cell");
            Intrinsics.checkNotNullParameter(destruct$, "$destruct$");
            if ((i & 6) == 0) {
                i2 = (composer.changed(cell) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= composer.changed(c2002Dp) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i2 |= composer.changed(c2002Dp2) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                i2 |= (i & 4096) == 0 ? composer.changed(destruct$) : composer.changedInstance(destruct$) ? 2048 : 1024;
            }
            if ((i2 & 9363) == 9362 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-85557246, i2, -1, "com.robinhood.shared.taxLots.TaxLotTable.<anonymous> (TaxLotsTable.kt:70)");
            }
            int columnIndex = destruct$.getColumnIndex();
            if (cell instanceof TaxLotCell.DisplayCell) {
                composer.startReplaceGroup(-1920123428);
                Modifier modifierWrapContentSize$default = SizeKt.wrapContentSize$default(Modifier.INSTANCE, null, false, 3, null);
                if (c2002Dp2 != null && (modifierM5174width3ABfNKs3 = SizeKt.m5174width3ABfNKs(modifierWrapContentSize$default, c2002Dp2.getValue())) != null) {
                    modifierWrapContentSize$default = modifierM5174width3ABfNKs3;
                }
                Modifier modifier = (c2002Dp == null || (modifierM5156height3ABfNKs3 = SizeKt.m5156height3ABfNKs(modifierWrapContentSize$default, c2002Dp.getValue())) == null) ? modifierWrapContentSize$default : modifierM5156height3ABfNKs3;
                StickyColumn stickyColumnDetails = ((TaxLotTableState.Loaded) this.$state).getStickyColumnDetails();
                boolean z = (stickyColumnDetails instanceof StickyColumn.StickAtEndUntilOnScreen) && ((StickyColumn.StickAtEndUntilOnScreen) stickyColumnDetails).getColumnIndex() == columnIndex;
                StickyColumn stickyColumnDetails2 = ((TaxLotTableState.Loaded) this.$state).getStickyColumnDetails();
                TaxLotTableDisplayCell2.TaxLotTableDisplayCell(((TaxLotCell.DisplayCell) cell).getState(), this.$onTapAction, TaxLotsTableKt.applyBorder(modifier, z, (stickyColumnDetails2 instanceof StickyColumn.StickAtStartAfterOnScreen) && ((StickyColumn.StickAtStartAfterOnScreen) stickyColumnDetails2).getColumnIndex() == columnIndex, false, true, composer, 24576, 4), composer, 0, 0);
                composer.endReplaceGroup();
            } else if (cell instanceof TaxLotCell.HeaderCell) {
                composer.startReplaceGroup(-1918890744);
                Modifier modifierWrapContentSize$default2 = SizeKt.wrapContentSize$default(Modifier.INSTANCE, null, false, 3, null);
                if (c2002Dp2 != null && (modifierM5174width3ABfNKs2 = SizeKt.m5174width3ABfNKs(modifierWrapContentSize$default2, c2002Dp2.getValue())) != null) {
                    modifierWrapContentSize$default2 = modifierM5174width3ABfNKs2;
                }
                TaxLotTableHeaderCell.TaxLotTableHeaderCell(((TaxLotCell.HeaderCell) cell).getState(), this.$onHeaderClicked, TaxLotsTableKt.applyBorder((c2002Dp == null || (modifierM5156height3ABfNKs2 = SizeKt.m5156height3ABfNKs(modifierWrapContentSize$default2, c2002Dp.getValue())) == null) ? modifierWrapContentSize$default2 : modifierM5156height3ABfNKs2, columnIndex != 0, false, true, true, composer, 27648, 2), composer, 0, 0);
                composer.endReplaceGroup();
            } else {
                if (!(cell instanceof TaxLotCell.InputCell)) {
                    composer.startReplaceGroup(-616129137);
                    composer.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composer.startReplaceGroup(-1918135863);
                Modifier.Companion companion = Modifier.INSTANCE;
                composer.startReplaceGroup(-1633490746);
                boolean zChanged = ((i2 & 14) == 4) | composer.changed(this.$onInputFieldFocused);
                final Function1<String, Unit> function1 = this.$onInputFieldFocused;
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.shared.taxLots.TaxLotsTableKt$TaxLotTable$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return TaxLotsTableKt.C400681.invoke_C8IHX40$lambda$5$lambda$4(function1, cell, (FocusState) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                Modifier modifierWrapContentSize$default3 = SizeKt.wrapContentSize$default(FocusChangedModifier2.onFocusChanged(companion, (Function1) objRememberedValue), null, false, 3, null);
                if (c2002Dp2 != null && (modifierM5174width3ABfNKs = SizeKt.m5174width3ABfNKs(modifierWrapContentSize$default3, c2002Dp2.getValue())) != null) {
                    modifierWrapContentSize$default3 = modifierM5174width3ABfNKs;
                }
                Modifier modifier2 = (c2002Dp == null || (modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(modifierWrapContentSize$default3, c2002Dp.getValue())) == null) ? modifierWrapContentSize$default3 : modifierM5156height3ABfNKs;
                StickyColumn stickyColumnDetails3 = ((TaxLotTableState.Loaded) this.$state).getStickyColumnDetails();
                boolean z2 = (stickyColumnDetails3 instanceof StickyColumn.StickAtEndUntilOnScreen) && ((StickyColumn.StickAtEndUntilOnScreen) stickyColumnDetails3).getColumnIndex() == columnIndex;
                StickyColumn stickyColumnDetails4 = ((TaxLotTableState.Loaded) this.$state).getStickyColumnDetails();
                TaxLotTableInputCell3.TaxLotTableInputCell(((TaxLotCell.InputCell) cell).getState(), this.$onTapAction, this.$onCheckBoxClicked, TaxLotsTableKt.applyBorder(modifier2, z2, (stickyColumnDetails4 instanceof StickyColumn.StickAtStartAfterOnScreen) && ((StickyColumn.StickAtStartAfterOnScreen) stickyColumnDetails4).getColumnIndex() == columnIndex, false, true, composer, 24576, 4), composer, 0, 0);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke_C8IHX40$lambda$5$lambda$4(Function1 function1, TaxLotCell taxLotCell, FocusState it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.isFocused()) {
                function1.invoke(((TaxLotCell.InputCell) taxLotCell).getState().getId());
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean TaxLotTable$lambda$2(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier applyBorder(Modifier modifier, boolean z, boolean z2, boolean z3, boolean z4, Composer composer, int i, int i2) {
        composer.startReplaceGroup(1698361542);
        final boolean z5 = (i2 & 1) != 0 ? false : z;
        final boolean z6 = (i2 & 2) != 0 ? false : z2;
        final boolean z7 = (i2 & 4) != 0 ? false : z3;
        final boolean z8 = (i2 & 8) != 0 ? false : z4;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1698361542, i, -1, "com.robinhood.shared.taxLots.applyBorder (TaxLotsTable.kt:167)");
        }
        final long jM21373getBg30d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21373getBg30d7_KjU();
        final float fMo5016toPx0680j_4 = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(1));
        composer.startReplaceGroup(-1224400529);
        boolean zChanged = ((((i & 112) ^ 48) > 32 && composer.changed(z5)) || (i & 48) == 32) | composer.changed(fMo5016toPx0680j_4) | composer.changed(jM21373getBg30d7_KjU) | ((((i & 896) ^ 384) > 256 && composer.changed(z6)) || (i & 384) == 256) | ((((i & 7168) ^ 3072) > 2048 && composer.changed(z7)) || (i & 3072) == 2048) | ((((57344 & i) ^ 24576) > 16384 && composer.changed(z8)) || (i & 24576) == 16384);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            Function1 function1 = new Function1() { // from class: com.robinhood.shared.taxLots.TaxLotsTableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TaxLotsTableKt.applyBorder$lambda$7$lambda$6(z5, fMo5016toPx0680j_4, jM21373getBg30d7_KjU, z6, z7, z8, (DrawScope) obj);
                }
            };
            composer.updateRememberedValue(function1);
            objRememberedValue = function1;
        }
        composer.endReplaceGroup();
        Modifier modifierDrawBehind = DrawModifierKt.drawBehind(modifier, (Function1) objRememberedValue);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return modifierDrawBehind;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean reachedBottom(LazyListState lazyListState) {
        LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) CollectionsKt.lastOrNull((List) lazyListState.getLayoutInfo().getVisibleItemsInfo());
        return (lazyListItemInfo == null || lazyListItemInfo.getIndex() != 0) && lazyListItemInfo != null && lazyListItemInfo.getIndex() == lazyListState.getLayoutInfo().getTotalItemsCount() - 1;
    }
}
