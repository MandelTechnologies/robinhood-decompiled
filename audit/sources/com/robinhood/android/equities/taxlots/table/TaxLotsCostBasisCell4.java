package com.robinhood.android.equities.taxlots.table;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.equities.taxlots.C14807R;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TaxLotsCostBasisCell.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a5\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0001¢\u0006\u0004\b\t\u0010\n\u001a\r\u0010\u000b\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\f¨\u0006\r"}, m3636d2 = {"TaxLotsCostBasisCellComposable", "", "taxLotsTextCell", "Lcom/robinhood/android/equities/taxlots/table/TaxLotsCostBasisCell;", "width", "Landroidx/compose/ui/unit/Dp;", "height", "modifier", "Landroidx/compose/ui/Modifier;", "TaxLotsCostBasisCellComposable-UmHF5L4", "(Lcom/robinhood/android/equities/taxlots/table/TaxLotsCostBasisCell;Landroidx/compose/ui/unit/Dp;Landroidx/compose/ui/unit/Dp;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "TaxLotsCostBasisCellComposablePreview", "(Landroidx/compose/runtime/Composer;I)V", "lib-tax-lots_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equities.taxlots.table.TaxLotsCostBasisCellKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class TaxLotsCostBasisCell4 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TaxLotsCostBasisCellComposablePreview$lambda$1(int i, Composer composer, int i2) {
        TaxLotsCostBasisCellComposablePreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TaxLotsCostBasisCellComposable_UmHF5L4$lambda$0(TaxLotsCostBasisCell taxLotsCostBasisCell, C2002Dp c2002Dp, C2002Dp c2002Dp2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m13642TaxLotsCostBasisCellComposableUmHF5L4(taxLotsCostBasisCell, c2002Dp, c2002Dp2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* renamed from: TaxLotsCostBasisCellComposable-UmHF5L4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m13642TaxLotsCostBasisCellComposableUmHF5L4(final TaxLotsCostBasisCell taxLotsTextCell, final C2002Dp c2002Dp, final C2002Dp c2002Dp2, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        C2002Dp c2002Dp3;
        C2002Dp c2002Dp4;
        int i4;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(taxLotsTextCell, "taxLotsTextCell");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1680383648);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(taxLotsTextCell) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                c2002Dp3 = c2002Dp;
                i3 |= composerStartRestartGroup.changed(c2002Dp3) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    c2002Dp4 = c2002Dp2;
                    i3 |= composerStartRestartGroup.changed(c2002Dp4) ? 256 : 128;
                }
                i4 = i2 & 8;
                if (i4 == 0) {
                    if ((i & 3072) == 0) {
                        modifier2 = modifier;
                        i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
                    }
                    if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                        modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1680383648, i3, -1, "com.robinhood.android.equities.taxlots.table.TaxLotsCostBasisCellComposable (TaxLotsCostBasisCell.kt:30)");
                        }
                        int i5 = i3 >> 3;
                        TaxLotsTableHelpers5.m13659TaxLotsBaseCell4xCAqhw(c2002Dp3, c2002Dp4, null, null, null, ComposableLambda3.rememberComposableLambda(-1448778343, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.taxlots.table.TaxLotsCostBasisCellKt$TaxLotsCostBasisCellComposable$1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer2, Integer num) {
                                invoke(boxScope, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BoxScope TaxLotsBaseCell, Composer composer2, int i6) {
                                int i7;
                                Intrinsics.checkNotNullParameter(TaxLotsBaseCell, "$this$TaxLotsBaseCell");
                                if ((i6 & 6) == 0) {
                                    i7 = i6 | (composer2.changed(TaxLotsBaseCell) ? 4 : 2);
                                } else {
                                    i7 = i6;
                                }
                                if ((i7 & 19) == 18 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1448778343, i7, -1, "com.robinhood.android.equities.taxlots.table.TaxLotsCostBasisCellComposable.<anonymous> (TaxLotsCostBasisCell.kt:35)");
                                }
                                Modifier modifierAlign = TaxLotsBaseCell.align(modifier3, Alignment.INSTANCE.getCenterEnd());
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i8 = BentoTheme.$stable;
                                Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(modifierAlign, bentoTheme.getSpacing(composer2, i8).m21593getSmallD9Ej5fM(), 0.0f, 2, null);
                                composer2.startReplaceGroup(-706577753);
                                String text = taxLotsTextCell.isSelectable() ? taxLotsTextCell.getText() : StringResources_androidKt.stringResource(C14807R.string.tax_lots_table_empty_text, composer2, 0);
                                composer2.endReplaceGroup();
                                BentoText2.m20747BentoText38GnDrw(text, modifierM5144paddingVpY3zN4$default, Color.m6701boximpl(bentoTheme.getColors(composer2, i8).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 1, 0, null, 0, bentoTheme.getTypography(composer2, i8).getTextS(), composer2, 805306368, 0, 7672);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), composerStartRestartGroup, (i5 & 14) | 196608 | (i5 & 112), 28);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.taxlots.table.TaxLotsCostBasisCellKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return TaxLotsCostBasisCell4.TaxLotsCostBasisCellComposable_UmHF5L4$lambda$0(taxLotsTextCell, c2002Dp, c2002Dp2, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 3072;
                modifier2 = modifier;
                if ((i3 & 1171) == 1170) {
                    if (i4 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i52 = i3 >> 3;
                    TaxLotsTableHelpers5.m13659TaxLotsBaseCell4xCAqhw(c2002Dp3, c2002Dp4, null, null, null, ComposableLambda3.rememberComposableLambda(-1448778343, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.taxlots.table.TaxLotsCostBasisCellKt$TaxLotsCostBasisCellComposable$1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer2, Integer num) {
                            invoke(boxScope, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BoxScope TaxLotsBaseCell, Composer composer2, int i6) {
                            int i7;
                            Intrinsics.checkNotNullParameter(TaxLotsBaseCell, "$this$TaxLotsBaseCell");
                            if ((i6 & 6) == 0) {
                                i7 = i6 | (composer2.changed(TaxLotsBaseCell) ? 4 : 2);
                            } else {
                                i7 = i6;
                            }
                            if ((i7 & 19) == 18 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1448778343, i7, -1, "com.robinhood.android.equities.taxlots.table.TaxLotsCostBasisCellComposable.<anonymous> (TaxLotsCostBasisCell.kt:35)");
                            }
                            Modifier modifierAlign = TaxLotsBaseCell.align(modifier3, Alignment.INSTANCE.getCenterEnd());
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i8 = BentoTheme.$stable;
                            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(modifierAlign, bentoTheme.getSpacing(composer2, i8).m21593getSmallD9Ej5fM(), 0.0f, 2, null);
                            composer2.startReplaceGroup(-706577753);
                            String text = taxLotsTextCell.isSelectable() ? taxLotsTextCell.getText() : StringResources_androidKt.stringResource(C14807R.string.tax_lots_table_empty_text, composer2, 0);
                            composer2.endReplaceGroup();
                            BentoText2.m20747BentoText38GnDrw(text, modifierM5144paddingVpY3zN4$default, Color.m6701boximpl(bentoTheme.getColors(composer2, i8).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 1, 0, null, 0, bentoTheme.getTypography(composer2, i8).getTextS(), composer2, 805306368, 0, 7672);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, (i52 & 14) | 196608 | (i52 & 112), 28);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            c2002Dp4 = c2002Dp2;
            i4 = i2 & 8;
            if (i4 == 0) {
            }
            modifier2 = modifier;
            if ((i3 & 1171) == 1170) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        c2002Dp3 = c2002Dp;
        if ((i2 & 4) == 0) {
        }
        c2002Dp4 = c2002Dp2;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static final void TaxLotsCostBasisCellComposablePreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-2114190923);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2114190923, i, -1, "com.robinhood.android.equities.taxlots.table.TaxLotsCostBasisCellComposablePreview (TaxLotsCostBasisCell.kt:53)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, TaxLotsCostBasisCell2.INSTANCE.m13623getLambda$2061946515$lib_tax_lots_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.taxlots.table.TaxLotsCostBasisCellKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TaxLotsCostBasisCell4.TaxLotsCostBasisCellComposablePreview$lambda$1(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
