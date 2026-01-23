package com.robinhood.android.equities.taxlots.table;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.theme.BentoTheme2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TaxLotsDateAndTermCell.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a=\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a\r\u0010\u000f\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u0010\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"DATE_PREVIEW_PLACEHOLDER", "", "TaxLotsDateCellComposable", "", "rowIndex", "", "taxLotsDateAndTermCell", "Lcom/robinhood/android/equities/taxlots/table/TaxLotsDateAndTermCell;", "width", "Landroidx/compose/ui/unit/Dp;", "height", "modifier", "Landroidx/compose/ui/Modifier;", "TaxLotsDateCellComposable-SBeoGcE", "(ILcom/robinhood/android/equities/taxlots/table/TaxLotsDateAndTermCell;Landroidx/compose/ui/unit/Dp;Landroidx/compose/ui/unit/Dp;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "TaxLotsDateCellComposablePreview", "(Landroidx/compose/runtime/Composer;I)V", "lib-tax-lots_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equities.taxlots.table.TaxLotsDateAndTermCellKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class TaxLotsDateAndTermCell4 {
    private static final String DATE_PREVIEW_PLACEHOLDER = "99/99/99";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TaxLotsDateCellComposablePreview$lambda$1(int i, Composer composer, int i2) {
        TaxLotsDateCellComposablePreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TaxLotsDateCellComposable_SBeoGcE$lambda$0(int i, TaxLotsDateAndTermCell taxLotsDateAndTermCell, C2002Dp c2002Dp, C2002Dp c2002Dp2, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        m13644TaxLotsDateCellComposableSBeoGcE(i, taxLotsDateAndTermCell, c2002Dp, c2002Dp2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* renamed from: TaxLotsDateCellComposable-SBeoGcE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m13644TaxLotsDateCellComposableSBeoGcE(final int i, final TaxLotsDateAndTermCell taxLotsDateAndTermCell, final C2002Dp c2002Dp, final C2002Dp c2002Dp2, Modifier modifier, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(taxLotsDateAndTermCell, "taxLotsDateAndTermCell");
        Composer composerStartRestartGroup = composer.startRestartGroup(966803554);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(taxLotsDateAndTermCell) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(c2002Dp) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changed(c2002Dp2) ? 2048 : 1024;
        }
        int i5 = i3 & 16;
        if (i5 == 0) {
            if ((i2 & 24576) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((i4 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                if (i5 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(966803554, i4, -1, "com.robinhood.android.equities.taxlots.table.TaxLotsDateCellComposable (TaxLotsDateAndTermCell.kt:49)");
                }
                int i6 = i4 >> 6;
                int i7 = (i6 & 14) | 196608 | (i6 & 112) | (i6 & 896);
                modifier3 = modifier2;
                TaxLotsTableHelpers5.m13659TaxLotsBaseCell4xCAqhw(c2002Dp, c2002Dp2, modifier3, null, null, ComposableLambda3.rememberComposableLambda(-1291999863, true, new TaxLotsDateAndTermCell5(c2002Dp, i, taxLotsDateAndTermCell), composerStartRestartGroup, 54), composerStartRestartGroup, i7, 24);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.taxlots.table.TaxLotsDateAndTermCellKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return TaxLotsDateAndTermCell4.TaxLotsDateCellComposable_SBeoGcE$lambda$0(i, taxLotsDateAndTermCell, c2002Dp, c2002Dp2, modifier3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i4 |= 24576;
        modifier2 = modifier;
        if ((i4 & 9363) == 9362) {
            if (i5 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            int i62 = i4 >> 6;
            int i72 = (i62 & 14) | 196608 | (i62 & 112) | (i62 & 896);
            modifier3 = modifier2;
            TaxLotsTableHelpers5.m13659TaxLotsBaseCell4xCAqhw(c2002Dp, c2002Dp2, modifier3, null, null, ComposableLambda3.rememberComposableLambda(-1291999863, true, new TaxLotsDateAndTermCell5(c2002Dp, i, taxLotsDateAndTermCell), composerStartRestartGroup, 54), composerStartRestartGroup, i72, 24);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static final void TaxLotsDateCellComposablePreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(658946006);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(658946006, i, -1, "com.robinhood.android.equities.taxlots.table.TaxLotsDateCellComposablePreview (TaxLotsDateAndTermCell.kt:120)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, TaxLotsDateAndTermCell2.INSTANCE.getLambda$1638294302$lib_tax_lots_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.taxlots.table.TaxLotsDateAndTermCellKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TaxLotsDateAndTermCell4.TaxLotsDateCellComposablePreview$lambda$1(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
