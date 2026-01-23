package com.robinhood.android.options.p208ui.detail;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import com.robinhood.android.options.p208ui.detail.OptionsDetailPageDataCell2;
import com.robinhood.android.portfolio.pnl.C25673R;
import com.robinhood.android.portfolio.pnl.Tooltips;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OptionsDetailPageDataGrid.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a]\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a8\u0010\u0012\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\n2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u0016H\u0002¨\u0006\u0018²\u0006\n\u0010\u0014\u001a\u00020\nX\u008a\u008e\u0002"}, m3636d2 = {"OptionsDetailPageDataGrid", "", "modifier", "Landroidx/compose/ui/Modifier;", "columnCount", "", WebsocketGatewayConstants.DATA_KEY, "", "Lcom/robinhood/android/options/ui/detail/CellState;", "showDataCellTooltip", "", "recordSeenTooltip", "Lkotlin/Function1;", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageCellTooltip;", "spacing", "Landroidx/compose/ui/unit/Dp;", "OptionsDetailPageDataGrid-rg9RtIk", "(Landroidx/compose/ui/Modifier;ILjava/util/List;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/unit/Dp;Landroidx/compose/runtime/Composer;II)V", "getTooltipModifier", "tooltip", "showTooltip", "onClick", "Lkotlin/Function0;", "onAppear", "feature-options-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDataGridKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionsDetailPageDataGrid {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionsDetailPageDataGrid_rg9RtIk$lambda$13(Modifier modifier, int i, List list, boolean z, Function1 function1, C2002Dp c2002Dp, int i2, int i3, Composer composer, int i4) {
        m17035OptionsDetailPageDataGridrg9RtIk(modifier, i, list, z, function1, c2002Dp, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:172:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0103 A[LOOP:0: B:88:0x0101->B:89:0x0103, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x017e  */
    /* JADX WARN: Type inference failed for: r19v2, types: [androidx.compose.ui.Modifier] */
    /* renamed from: OptionsDetailPageDataGrid-rg9RtIk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m17035OptionsDetailPageDataGridrg9RtIk(Modifier modifier, final int i, final List<CellState> data, boolean z, Function1<? super OptionsDetailPageDataCell2, Unit> function1, C2002Dp c2002Dp, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        boolean z2;
        int i5;
        final Function1<? super OptionsDetailPageDataCell2, Unit> function12;
        int i6;
        C2002Dp c2002Dp2;
        int i7;
        int i8;
        int size;
        Object objRememberedValue;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Modifier modifier3;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int i9;
        Arrangement.Horizontal start;
        Modifier.Companion tooltipModifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i10 = i;
        Intrinsics.checkNotNullParameter(data, "data");
        Composer composerStartRestartGroup = composer.startRestartGroup(1441796520);
        int i11 = i3 & 1;
        if (i11 != 0) {
            i4 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i4 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(i10) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(data) ? 256 : 128;
        }
        int i12 = i3 & 8;
        if (i12 != 0) {
            i4 |= 3072;
        } else {
            if ((i2 & 3072) == 0) {
                z2 = z;
                i4 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
            }
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else {
                if ((i2 & 24576) == 0) {
                    function12 = function1;
                    i4 |= composerStartRestartGroup.changedInstance(function12) ? 16384 : 8192;
                }
                i6 = i3 & 32;
                if (i6 == 0) {
                    if ((196608 & i2) == 0) {
                        c2002Dp2 = c2002Dp;
                        i4 |= composerStartRestartGroup.changed(c2002Dp2) ? 131072 : 65536;
                    }
                    if ((i4 & 74899) == 74898 || !composerStartRestartGroup.getSkipping()) {
                        Modifier modifier4 = i11 == 0 ? Modifier.INSTANCE : modifier2;
                        if (i12 != 0) {
                            z2 = false;
                        }
                        if (i5 != 0) {
                            function12 = null;
                        }
                        if (i6 != 0) {
                            c2002Dp2 = null;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1441796520, i4, -1, "com.robinhood.android.options.ui.detail.OptionsDetailPageDataGrid (OptionsDetailPageDataGrid.kt:28)");
                        }
                        int size2 = data.size() % i10;
                        i7 = size2 + ((((size2 ^ i10) & ((-size2) | size2)) >> 31) & i10);
                        List<CellState> list = data;
                        ArrayList arrayList = new ArrayList(i7);
                        for (i8 = 0; i8 < i7; i8++) {
                            arrayList.add(new CellState("", "", null, 4, null));
                        }
                        List listPlus = CollectionsKt.plus((Collection) list, (Iterable) arrayList);
                        size = listPlus.size() / i10;
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.valueOf(z2), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                        modifier3 = modifier4;
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        composerStartRestartGroup.startReplaceGroup(1184442356);
                        i9 = 0;
                        while (i9 < size) {
                            if (c2002Dp2 != null) {
                                start = Arrangement.INSTANCE.m5089spacedBy0680j_4(c2002Dp2.getValue());
                                if (start == null) {
                                    start = Arrangement.INSTANCE.getStart();
                                }
                            }
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(start, Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion2);
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor2);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                            Row6 row6 = Row6.INSTANCE;
                            composerStartRestartGroup.startReplaceGroup(-600135926);
                            int i13 = 0;
                            while (i13 < i10) {
                                CellState cellState = (CellState) listPlus.get((i9 * i10) + i13);
                                Modifier.Companion companion4 = Modifier.INSTANCE;
                                Modifier modifierWeight$default = Row5.weight$default(row6, companion4, 1.0f, false, 2, null);
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default);
                                ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                List list2 = listPlus;
                                Function0<ComposeUiNode> constructor3 = companion5.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                    composerStartRestartGroup.createNode(constructor3);
                                } else {
                                    composerStartRestartGroup.useNode();
                                }
                                Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, companion5.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion5.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion5.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion5.getSetModifier());
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                composerStartRestartGroup.startReplaceGroup(-1346868665);
                                final OptionsDetailPageDataCell2 tooltip = cellState.getTooltip();
                                if (tooltip == null) {
                                    tooltipModifier = companion4;
                                } else {
                                    boolean zOptionsDetailPageDataGrid_rg9RtIk$lambda$2 = OptionsDetailPageDataGrid_rg9RtIk$lambda$2(snapshotState);
                                    composerStartRestartGroup.startReplaceGroup(5004770);
                                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                    Composer.Companion companion6 = Composer.INSTANCE;
                                    if (objRememberedValue2 == companion6.getEmpty()) {
                                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDataGridKt$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return OptionsDetailPageDataGrid.m2288xfe48c0dd(snapshotState);
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                    }
                                    Function0 function0 = (Function0) objRememberedValue2;
                                    composerStartRestartGroup.endReplaceGroup();
                                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                                    boolean zChanged = ((57344 & i4) == 16384) | composerStartRestartGroup.changed(tooltip);
                                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                    if (zChanged || objRememberedValue3 == companion6.getEmpty()) {
                                        objRememberedValue3 = new Function0() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDataGridKt$$ExternalSyntheticLambda1
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return OptionsDetailPageDataGrid.m2289xe6dba31d(function12, tooltip);
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    tooltipModifier = getTooltipModifier(companion4, tooltip, zOptionsDetailPageDataGrid_rg9RtIk$lambda$2, function0, (Function0) objRememberedValue3);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                OptionsDetailPageDataCell3.OptionsDetailPageDataCell(tooltipModifier, cellState, composerStartRestartGroup, 0, 0);
                                composerStartRestartGroup.endNode();
                                composerStartRestartGroup.startReplaceGroup(-600101782);
                                if (i9 != i - 1) {
                                    Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion4, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21595getXsmallD9Ej5fM()), composerStartRestartGroup, 0);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                i13++;
                                i10 = i;
                                listPlus = list2;
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.endNode();
                            i9++;
                            i10 = i;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                    }
                    final boolean z3 = z2;
                    final Function1<? super OptionsDetailPageDataCell2, Unit> function13 = function12;
                    final C2002Dp c2002Dp3 = c2002Dp2;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        final Modifier modifier5 = modifier3;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDataGridKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return OptionsDetailPageDataGrid.OptionsDetailPageDataGrid_rg9RtIk$lambda$13(modifier5, i, data, z3, function13, c2002Dp3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i4 |= 196608;
                c2002Dp2 = c2002Dp;
                if ((i4 & 74899) == 74898) {
                    if (i11 == 0) {
                    }
                    if (i12 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int size22 = data.size() % i10;
                    i7 = size22 + ((((size22 ^ i10) & ((-size22) | size22)) >> 31) & i10);
                    List<CellState> list3 = data;
                    ArrayList arrayList2 = new ArrayList(i7);
                    while (i8 < i7) {
                    }
                    List listPlus2 = CollectionsKt.plus((Collection) list3, (Iterable) arrayList2);
                    size = listPlus2.size() / i10;
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    }
                    final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                    ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor4 = companion7.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    modifier3 = modifier4;
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion7.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap4, companion7.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion7.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting()) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier4, companion7.getSetModifier());
                        Column6 column62 = Column6.INSTANCE;
                        composerStartRestartGroup.startReplaceGroup(1184442356);
                        i9 = 0;
                        while (i9 < size) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                    }
                }
                final boolean z32 = z2;
                final Function1 function132 = function12;
                final C2002Dp c2002Dp32 = c2002Dp2;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            function12 = function1;
            i6 = i3 & 32;
            if (i6 == 0) {
            }
            c2002Dp2 = c2002Dp;
            if ((i4 & 74899) == 74898) {
            }
            final boolean z322 = z2;
            final Function1 function1322 = function12;
            final C2002Dp c2002Dp322 = c2002Dp2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        z2 = z;
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        function12 = function1;
        i6 = i3 & 32;
        if (i6 == 0) {
        }
        c2002Dp2 = c2002Dp;
        if ((i4 & 74899) == 74898) {
        }
        final boolean z3222 = z2;
        final Function1 function13222 = function12;
        final C2002Dp c2002Dp3222 = c2002Dp2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void OptionsDetailPageDataGrid_rg9RtIk$lambda$3(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OptionsDetailPageDataGrid_rg9RtIk$lambda$12$lambda$11$lambda$10$lambda$9$lambda$6$lambda$5 */
    public static final Unit m2288xfe48c0dd(SnapshotState snapshotState) {
        OptionsDetailPageDataGrid_rg9RtIk$lambda$3(snapshotState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OptionsDetailPageDataGrid_rg9RtIk$lambda$12$lambda$11$lambda$10$lambda$9$lambda$8$lambda$7 */
    public static final Unit m2289xe6dba31d(Function1 function1, OptionsDetailPageDataCell2 optionsDetailPageDataCell2) {
        if (function1 != null) {
            function1.invoke(optionsDetailPageDataCell2);
        }
        return Unit.INSTANCE;
    }

    private static final Modifier getTooltipModifier(Modifier modifier, OptionsDetailPageDataCell2 optionsDetailPageDataCell2, boolean z, Function0<Unit> function0, Function0<Unit> function02) {
        if (!(optionsDetailPageDataCell2 instanceof OptionsDetailPageDataCell2.AverageCostTooltip)) {
            throw new NoWhenBranchMatchedException();
        }
        return Tooltips.profitAndLossAverageCostTooltip$default(modifier, Boolean.valueOf(z), function0, function02, new Screen(Screen.Name.OPTION_STRATEGY_DETAIL, null, ((OptionsDetailPageDataCell2.AverageCostTooltip) optionsDetailPageDataCell2).getStrategyCodeForLogging(), null, 10, null), C25673R.string.pnl_average_cost_tooltip_odp, null, 32, null);
    }

    private static final boolean OptionsDetailPageDataGrid_rg9RtIk$lambda$2(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }
}
