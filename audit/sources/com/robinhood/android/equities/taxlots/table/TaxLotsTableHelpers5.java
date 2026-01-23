package com.robinhood.android.equities.taxlots.table;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p011ui.semantics.SemanticsProperties_androidKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.numpad.BentoNumpadScopeV2;
import com.robinhood.compose.bento.theme.BentoTheme;
import equity_trading_tax_lots.proto.p460v1.TaxLotSort;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TaxLotsTableHelpers.kt */
@Metadata(m3635d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\u001a£\u0001\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\n0\t2\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0018\u001a\u00020\u0014¢\u0006\u0004\b\u001b\u0010\u001c\u001ak\u0010*\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010#\u001a\u00020\"2\u0019\b\u0002\u0010&\u001a\u0013\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b%2\u0017\u0010'\u001a\u0013\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b%H\u0001¢\u0006\u0004\b(\u0010)\u001ao\u00104\u001a\u00020\n2\u0006\u0010+\u001a\u00020\u00142\u0006\u0010,\u001a\u00020\u001a2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001d2\b\u0010.\u001a\u0004\u0018\u00010-2\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\t2\u0014\u00100\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\n0\t2\u0006\u00101\u001a\u00020\u0004H\u0001¢\u0006\u0004\b2\u00103\"&\u00105\u001a\b\u0012\u0004\u0012\u00020\u00000\u00068\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b5\u00106\u0012\u0004\b9\u0010:\u001a\u0004\b7\u00108\"\u001e\u0010;\u001a\u00020\u0004*\u00020\u00008@X\u0081\u0004¢\u0006\f\u0012\u0004\b=\u0010>\u001a\u0004\b;\u0010<¨\u0006?"}, m3636d2 = {"Lequity_trading_tax_lots/proto/v1/TaxLotSort;", AnalyticsStrings.BUTTON_LIST_SORT, "Lequity_trading_tax_lots/proto/v1/TaxLotSortDirection;", "direction", "", "readOnly", "", "Lcom/robinhood/android/equities/taxlots/table/SelectableTaxLot;", "selectableTaxLots", "Lkotlin/Function1;", "", "onHeaderSelected", "Lkotlin/Function2;", "Ljava/math/BigDecimal;", "onTaxLotNumberSharesChange", "Ljava/util/UUID;", "orderId", "", "accountNumber", "instrumentId", "", "numberOfSelectedLots", "maxGainAndLoss", "maxCostPerShare", "maxNumberOfLots", "Lcom/robinhood/android/generic/table/GenericTableData;", "Lcom/robinhood/android/equities/taxlots/table/TaxLotsTableCell;", "tableDataV2FromTaxLots", "(Lequity_trading_tax_lots/proto/v1/TaxLotSort;Lequity_trading_tax_lots/proto/v1/TaxLotSortDirection;ZLjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Ljava/util/UUID;Ljava/lang/String;Ljava/util/UUID;ILjava/lang/String;Ljava/lang/String;I)Lcom/robinhood/android/generic/table/GenericTableData;", "Landroidx/compose/ui/unit/Dp;", "width", "height", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/Alignment;", "contentAlignment", "Landroidx/compose/foundation/layout/BoxScope;", "Lkotlin/ExtensionFunctionType;", "bottomDivider", "content", "TaxLotsBaseCell-4xCAqhw", "(Landroidx/compose/ui/unit/Dp;Landroidx/compose/ui/unit/Dp;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "TaxLotsBaseCell", "rowIndex", "component", "Lcom/robinhood/compose/bento/component/numpad/BentoNumpadScopeV2;", "bentoNumpadScopeV2", "setKeyboardVisible", "invalidNumberOfSharesCallback", "stickyColumn", "TaxLotsComponentMapper-NWQEAi4", "(ILcom/robinhood/android/equities/taxlots/table/TaxLotsTableCell;Landroidx/compose/ui/unit/Dp;Landroidx/compose/ui/unit/Dp;Lcom/robinhood/compose/bento/component/numpad/BentoNumpadScopeV2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;I)V", "TaxLotsComponentMapper", "TAX_LOTS_BASE_HEADERS", "Ljava/util/List;", "getTAX_LOTS_BASE_HEADERS", "()Ljava/util/List;", "getTAX_LOTS_BASE_HEADERS$annotations", "()V", "isSortable", "(Lequity_trading_tax_lots/proto/v1/TaxLotSort;)Z", "isSortable$annotations", "(Lequity_trading_tax_lots/proto/v1/TaxLotSort;)V", "lib-tax-lots_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equities.taxlots.table.TaxLotsTableHelpersKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class TaxLotsTableHelpers5 {
    private static final List<TaxLotSort> TAX_LOTS_BASE_HEADERS = CollectionsKt.listOf((Object[]) new TaxLotSort[]{TaxLotSort.DATE, TaxLotSort.COST_BASIS, TaxLotSort.GAIN_LOSS, TaxLotSort.SHARES});

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TaxLotsBaseCell_4xCAqhw$lambda$7(C2002Dp c2002Dp, C2002Dp c2002Dp2, Modifier modifier, Alignment alignment, Function3 function3, Function3 function32, int i, int i2, Composer composer, int i3) {
        m13659TaxLotsBaseCell4xCAqhw(c2002Dp, c2002Dp2, modifier, alignment, function3, function32, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TaxLotsComponentMapper_NWQEAi4$lambda$13(int i, TaxLotsTableHelpers4 taxLotsTableHelpers4, C2002Dp c2002Dp, C2002Dp c2002Dp2, BentoNumpadScopeV2 bentoNumpadScopeV2, Function1 function1, Function1 function12, boolean z, int i2, Composer composer, int i3) {
        m13660TaxLotsComponentMapperNWQEAi4(i, taxLotsTableHelpers4, c2002Dp, c2002Dp2, bentoNumpadScopeV2, function1, function12, z, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getTAX_LOTS_BASE_HEADERS$annotations() {
    }

    public static /* synthetic */ void isSortable$annotations(TaxLotSort taxLotSort) {
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public static final com.robinhood.android.generic.table.GenericTableData<com.robinhood.android.equities.taxlots.table.TaxLotsTableHelpers4> tableDataV2FromTaxLots(equity_trading_tax_lots.proto.p460v1.TaxLotSort r25, equity_trading_tax_lots.proto.p460v1.TaxLotSortDirection r26, boolean r27, java.util.List<com.robinhood.android.equities.taxlots.table.SelectableTaxLot> r28, kotlin.jvm.functions.Function1<? super equity_trading_tax_lots.proto.p460v1.TaxLotSort, kotlin.Unit> r29, kotlin.jvm.functions.Function2<? super com.robinhood.android.equities.taxlots.table.SelectableTaxLot, ? super java.math.BigDecimal, kotlin.Unit> r30, java.util.UUID r31, java.lang.String r32, java.util.UUID r33, int r34, java.lang.String r35, java.lang.String r36, int r37) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.equities.taxlots.table.TaxLotsTableHelpers5.tableDataV2FromTaxLots(equity_trading_tax_lots.proto.v1.TaxLotSort, equity_trading_tax_lots.proto.v1.TaxLotSortDirection, boolean, java.util.List, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, java.util.UUID, java.lang.String, java.util.UUID, int, java.lang.String, java.lang.String, int):com.robinhood.android.generic.table.GenericTableData");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit tableDataV2FromTaxLots$lambda$3$lambda$2(Function2 function2, SelectableTaxLot selectableTaxLot, BigDecimal it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function2.invoke(selectableTaxLot, it);
        return Unit.INSTANCE;
    }

    public static final List<TaxLotSort> getTAX_LOTS_BASE_HEADERS() {
        return TAX_LOTS_BASE_HEADERS;
    }

    public static final boolean isSortable(TaxLotSort taxLotSort) {
        Intrinsics.checkNotNullParameter(taxLotSort, "<this>");
        return !CollectionsKt.listOf((Object[]) new TaxLotSort[]{TaxLotSort.TAX_LOT_SORT_UNSPECIFIED, TaxLotSort.SHARES}).contains(taxLotSort);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012f  */
    /* renamed from: TaxLotsBaseCell-4xCAqhw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m13659TaxLotsBaseCell4xCAqhw(final C2002Dp c2002Dp, final C2002Dp c2002Dp2, Modifier modifier, Alignment alignment, Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function3, final Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Alignment center;
        int i5;
        Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function3M13630getLambda$1325230823$lib_tax_lots_externalDebug;
        Modifier modifierM5174width3ABfNKs;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        BoxScopeInstance boxScopeInstance;
        Modifier modifierM5156height3ABfNKs;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1730041714);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(c2002Dp) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(c2002Dp2) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    center = alignment;
                    i3 |= composerStartRestartGroup.changed(center) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 == 0) {
                    if ((i & 24576) == 0) {
                        function3M13630getLambda$1325230823$lib_tax_lots_externalDebug = function3;
                        i3 |= composerStartRestartGroup.changedInstance(function3M13630getLambda$1325230823$lib_tax_lots_externalDebug) ? 16384 : 8192;
                    }
                    if ((i2 & 32) == 0) {
                        i3 |= 196608;
                    } else if ((i & 196608) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(content) ? 131072 : 65536;
                    }
                    if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                        if (i6 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            center = Alignment.INSTANCE.getCenter();
                        }
                        if (i5 != 0) {
                            function3M13630getLambda$1325230823$lib_tax_lots_externalDebug = TaxLotsTableHelpers.INSTANCE.m13630getLambda$1325230823$lib_tax_lots_externalDebug();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1730041714, i3, -1, "com.robinhood.android.equities.taxlots.table.TaxLotsBaseCell (TaxLotsTableHelpers.kt:150)");
                        }
                        if (c2002Dp != null || (modifierM5174width3ABfNKs = SizeKt.m5174width3ABfNKs(modifier2, c2002Dp.getValue())) == null) {
                            modifierM5174width3ABfNKs = modifier2;
                        }
                        if (c2002Dp2 != null && (modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(modifierM5174width3ABfNKs, c2002Dp2.getValue())) != null) {
                            modifierM5174width3ABfNKs = modifierM5156height3ABfNKs;
                        }
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5174width3ABfNKs);
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (!composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                        boxScopeInstance = BoxScopeInstance.INSTANCE;
                        content.invoke(boxScopeInstance, composerStartRestartGroup, Integer.valueOf(((i3 >> 12) & 112) | 6));
                        composerStartRestartGroup.startReplaceGroup(2067434744);
                        if (c2002Dp != null && c2002Dp2 != null) {
                            function3M13630getLambda$1325230823$lib_tax_lots_externalDebug.invoke(boxScopeInstance, composerStartRestartGroup, Integer.valueOf(((i3 >> 9) & 112) | 6));
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                    }
                    final Alignment alignment2 = center;
                    final Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function32 = function3M13630getLambda$1325230823$lib_tax_lots_externalDebug;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        final Modifier modifier3 = modifier2;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.taxlots.table.TaxLotsTableHelpersKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return TaxLotsTableHelpers5.TaxLotsBaseCell_4xCAqhw$lambda$7(c2002Dp, c2002Dp2, modifier3, alignment2, function32, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 24576;
                function3M13630getLambda$1325230823$lib_tax_lots_externalDebug = function3;
                if ((i2 & 32) == 0) {
                }
                if ((74899 & i3) == 74898) {
                    if (i6 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    if (c2002Dp != null) {
                        modifierM5174width3ABfNKs = modifier2;
                        if (c2002Dp2 != null) {
                            modifierM5174width3ABfNKs = modifierM5156height3ABfNKs;
                        }
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5174width3ABfNKs);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (!composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting()) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                            boxScopeInstance = BoxScopeInstance.INSTANCE;
                            content.invoke(boxScopeInstance, composerStartRestartGroup, Integer.valueOf(((i3 >> 12) & 112) | 6));
                            composerStartRestartGroup.startReplaceGroup(2067434744);
                            if (c2002Dp != null) {
                                function3M13630getLambda$1325230823$lib_tax_lots_externalDebug.invoke(boxScopeInstance, composerStartRestartGroup, Integer.valueOf(((i3 >> 9) & 112) | 6));
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                        }
                    }
                }
                final Alignment alignment22 = center;
                final Function3 function322 = function3M13630getLambda$1325230823$lib_tax_lots_externalDebug;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            center = alignment;
            i5 = i2 & 16;
            if (i5 == 0) {
            }
            function3M13630getLambda$1325230823$lib_tax_lots_externalDebug = function3;
            if ((i2 & 32) == 0) {
            }
            if ((74899 & i3) == 74898) {
            }
            final Alignment alignment222 = center;
            final Function3 function3222 = function3M13630getLambda$1325230823$lib_tax_lots_externalDebug;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        center = alignment;
        i5 = i2 & 16;
        if (i5 == 0) {
        }
        function3M13630getLambda$1325230823$lib_tax_lots_externalDebug = function3;
        if ((i2 & 32) == 0) {
        }
        if ((74899 & i3) == 74898) {
        }
        final Alignment alignment2222 = center;
        final Function3 function32222 = function3M13630getLambda$1325230823$lib_tax_lots_externalDebug;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* renamed from: TaxLotsComponentMapper-NWQEAi4, reason: not valid java name */
    public static final void m13660TaxLotsComponentMapperNWQEAi4(int i, final TaxLotsTableHelpers4 component, final C2002Dp c2002Dp, final C2002Dp c2002Dp2, final BentoNumpadScopeV2 bentoNumpadScopeV2, final Function1<? super Boolean, Unit> setKeyboardVisible, final Function1<? super BigDecimal, Unit> invalidNumberOfSharesCallback, final boolean z, Composer composer, final int i2) {
        int i3;
        C2002Dp c2002Dp3;
        final int i4;
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(setKeyboardVisible, "setKeyboardVisible");
        Intrinsics.checkNotNullParameter(invalidNumberOfSharesCallback, "invalidNumberOfSharesCallback");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1076399740);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(component) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(c2002Dp) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            c2002Dp3 = c2002Dp2;
            i3 |= composerStartRestartGroup.changed(c2002Dp3) ? 2048 : 1024;
        } else {
            c2002Dp3 = c2002Dp2;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(bentoNumpadScopeV2) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(setKeyboardVisible) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(invalidNumberOfSharesCallback) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 8388608 : 4194304;
        }
        if ((4793491 & i3) != 4793490 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1076399740, i3, -1, "com.robinhood.android.equities.taxlots.table.TaxLotsComponentMapper (TaxLotsTableHelpers.kt:179)");
            }
            if (component instanceof TaxLotsHeaderCell) {
                composerStartRestartGroup.startReplaceGroup(-798414163);
                TaxLotsHeaderCell5.m13651TaxLotsHeaderCellComposableUmHF5L4((TaxLotsHeaderCell) component, c2002Dp, c2002Dp3, null, composerStartRestartGroup, (i3 >> 3) & 1008, 8);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
                i4 = i;
            } else if (component instanceof TaxLotsDateAndTermCell) {
                composerStartRestartGroup.startReplaceGroup(-798198651);
                TaxLotsDateAndTermCell4.m13644TaxLotsDateCellComposableSBeoGcE(i, (TaxLotsDateAndTermCell) component, c2002Dp, c2002Dp2, null, composerStartRestartGroup, i3 & 8078, 16);
                i4 = i;
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            } else {
                i4 = i;
                if (component instanceof TaxLotsCostBasisCell) {
                    composerStartRestartGroup.startReplaceGroup(-797942250);
                    Modifier.Companion companion = Modifier.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    boolean z2 = (i3 & 14) == 4;
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: com.robinhood.android.equities.taxlots.table.TaxLotsTableHelpersKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return TaxLotsTableHelpers5.TaxLotsComponentMapper_NWQEAi4$lambda$9$lambda$8(i4, (SemanticsPropertyReceiver) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    TaxLotsCostBasisCell4.m13642TaxLotsCostBasisCellComposableUmHF5L4((TaxLotsCostBasisCell) component, c2002Dp, c2002Dp2, SemanticsModifier6.semantics$default(companion, false, (Function1) objRememberedValue, 1, null), composerStartRestartGroup, (i3 >> 3) & 1008, 0);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    int i5 = i3;
                    if (component instanceof TaxLotsShareAndCheckBoxCell) {
                        composerStartRestartGroup.startReplaceGroup(-797534631);
                        if (bentoNumpadScopeV2 == null) {
                            throw new IllegalStateException("Cannot have a share and check box cell without a numpad scope");
                        }
                        int i6 = i5 << 3;
                        TaxLotShareAndCheckBoxCell3.m13636TaxLotsShareAndCheckBoxComposablePA9ru4M(i4, z, (TaxLotsShareAndCheckBoxCell) component, c2002Dp, c2002Dp2, bentoNumpadScopeV2, setKeyboardVisible, null, invalidNumberOfSharesCallback, composerStartRestartGroup, (i5 & 14) | ((i5 >> 18) & 112) | (i6 & 7168) | (57344 & i6) | (458752 & i6) | (i6 & 3670016) | (234881024 & (i5 << 6)), 128);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceGroup();
                    } else if (component instanceof TaxLotsGainLossCell) {
                        composerStartRestartGroup.startReplaceGroup(-796929356);
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        boolean z3 = (i5 & 14) == 4;
                        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (z3 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.equities.taxlots.table.TaxLotsTableHelpersKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return TaxLotsTableHelpers5.TaxLotsComponentMapper_NWQEAi4$lambda$12$lambda$11(i4, (SemanticsPropertyReceiver) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        TaxLotsGainLossCell5.m13647TaxLotsGainLossCellComposablewYrrvMY((TaxLotsGainLossCell) component, c2002Dp, c2002Dp2, SemanticsModifier6.semantics$default(companion2, false, (Function1) objRememberedValue2, 1, null), null, null, composerStartRestartGroup, (i5 >> 3) & 1008, 48);
                        composerStartRestartGroup.endReplaceGroup();
                    } else if (component instanceof TaxLotsTableHelpers3) {
                        composerStartRestartGroup.startReplaceGroup(-796536896);
                        int i7 = i5 >> 6;
                        m13659TaxLotsBaseCell4xCAqhw(c2002Dp, c2002Dp2, null, null, null, ComposableLambda3.rememberComposableLambda(1802602350, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.taxlots.table.TaxLotsTableHelpersKt$TaxLotsComponentMapper$4
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer2, Integer num) {
                                invoke(boxScope, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BoxScope TaxLotsBaseCell, Composer composer2, int i8) {
                                Intrinsics.checkNotNullParameter(TaxLotsBaseCell, "$this$TaxLotsBaseCell");
                                if ((i8 & 6) == 0) {
                                    i8 |= composer2.changed(TaxLotsBaseCell) ? 4 : 2;
                                }
                                if ((i8 & 19) == 18 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1802602350, i8, -1, "com.robinhood.android.equities.taxlots.table.TaxLotsComponentMapper.<anonymous> (TaxLotsTableHelpers.kt:241)");
                                }
                                if (c2002Dp != null) {
                                    BentoDivider.m20635BentoHorizontalDivideraMcp0Q(TaxLotsBaseCell.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopCenter()), BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21373getBg30d7_KjU(), 0.0f, composer2, 0, 4);
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), composerStartRestartGroup, (i7 & 14) | 196608 | (i7 & 112), 28);
                        composerStartRestartGroup.endReplaceGroup();
                    } else if (component instanceof TaxLotsShareReadOnlyCell) {
                        composerStartRestartGroup.startReplaceGroup(-796123201);
                        TaxLotsShareReadOnlyCell4.m13656TaxLotsShareReadOnlyCellComposableUmHF5L4((TaxLotsShareReadOnlyCell) component, c2002Dp, c2002Dp2, null, composerStartRestartGroup, (i5 >> 3) & 1008, 8);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-795933698);
                        composerStartRestartGroup.endReplaceGroup();
                    }
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            i4 = i;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final int i8 = i4;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.taxlots.table.TaxLotsTableHelpersKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TaxLotsTableHelpers5.TaxLotsComponentMapper_NWQEAi4$lambda$13(i8, component, c2002Dp, c2002Dp2, bentoNumpadScopeV2, setKeyboardVisible, invalidNumberOfSharesCallback, z, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TaxLotsComponentMapper_NWQEAi4$lambda$9$lambda$8(int i, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsProperties_androidKt.setTestTagsAsResourceId(semantics, true);
        SemanticsPropertiesKt.setTestTag(semantics, "tax_lot_cost_basis_" + (i + 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TaxLotsComponentMapper_NWQEAi4$lambda$12$lambda$11(int i, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsProperties_androidKt.setTestTagsAsResourceId(semantics, true);
        SemanticsPropertiesKt.setTestTag(semantics, "tax_lot_gain_loss_" + (i + 1));
        return Unit.INSTANCE;
    }
}
