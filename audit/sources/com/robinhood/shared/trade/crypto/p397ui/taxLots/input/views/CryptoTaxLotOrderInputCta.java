package com.robinhood.shared.trade.crypto.p397ui.taxLots.input.views;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.shared.trade.crypto.C40095R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoTaxLotOrderInputCta.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a-\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b¨\u0006\t"}, m3636d2 = {"CryptoTaxLotOrderInputCta", "", "onClick", "Lkotlin/Function0;", "isEnabled", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Lkotlin/jvm/functions/Function0;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-trade-crypto_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.input.views.CryptoTaxLotOrderInputCtaKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class CryptoTaxLotOrderInputCta {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoTaxLotOrderInputCta$lambda$0(Function0 function0, boolean z, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CryptoTaxLotOrderInputCta(function0, z, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoTaxLotOrderInputCta(final Function0<Unit> onClick, final boolean z, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        boolean z2;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(236598021);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            z2 = z;
        } else {
            z2 = z;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
            }
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
                    ComposerKt.traceEventStart(236598021, i3, -1, "com.robinhood.shared.trade.crypto.ui.taxLots.input.views.CryptoTaxLotOrderInputCta (CryptoTaxLotOrderInputCta.kt:16)");
                }
                Modifier modifier5 = modifier4;
                BentoButtonKt.m20586BentoButtonEikTQX8(onClick, StringResources_androidKt.stringResource(C40095R.string.crypto_tax_lot_order_input_cta, composerStartRestartGroup, 0), PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), 0.0f, composerStartRestartGroup, 0, 1), null, BentoButtons.Type.Primary, z2, false, null, null, null, null, false, null, composerStartRestartGroup, (i3 & 14) | 24576 | ((i3 << 12) & 458752), 0, 8136);
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.input.views.CryptoTaxLotOrderInputCtaKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoTaxLotOrderInputCta.CryptoTaxLotOrderInputCta$lambda$0(onClick, z, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            Modifier modifier52 = modifier4;
            BentoButtonKt.m20586BentoButtonEikTQX8(onClick, StringResources_androidKt.stringResource(C40095R.string.crypto_tax_lot_order_input_cta, composerStartRestartGroup, 0), PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), 0.0f, composerStartRestartGroup, 0, 1), null, BentoButtons.Type.Primary, z2, false, null, null, null, null, false, null, composerStartRestartGroup, (i3 & 14) | 24576 | ((i3 << 12) & 458752), 0, 8136);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
