package com.robinhood.android.internalassettransfers.cashselection;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.internalassettransfers.C18977R;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: InternalAssetTransferCashSelection.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.internalassettransfers.cashselection.ComposableSingletons$InternalAssetTransferCashSelectionKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class InternalAssetTransferCashSelection {
    public static final InternalAssetTransferCashSelection INSTANCE = new InternalAssetTransferCashSelection();
    private static Function2<Composer, Integer, Unit> lambda$647249534 = ComposableLambda3.composableLambdaInstance(647249534, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.cashselection.ComposableSingletons$InternalAssetTransferCashSelectionKt$lambda$647249534$1
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
                ComposerKt.traceEventStart(647249534, i, -1, "com.robinhood.android.internalassettransfers.cashselection.ComposableSingletons$InternalAssetTransferCashSelectionKt.lambda$647249534.<anonymous> (InternalAssetTransferCashSelection.kt:111)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1566878440 = ComposableLambda3.composableLambdaInstance(1566878440, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.cashselection.ComposableSingletons$InternalAssetTransferCashSelectionKt$lambda$1566878440$1
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
                ComposerKt.traceEventStart(1566878440, i, -1, "com.robinhood.android.internalassettransfers.cashselection.ComposableSingletons$InternalAssetTransferCashSelectionKt.lambda$1566878440.<anonymous> (InternalAssetTransferCashSelection.kt:295)");
            }
            String strStringResource = StringResources_androidKt.stringResource(C18977R.string.internal_asset_transfer_cash_selection_cash_amount_title, composer, 0);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            BentoText2.m20747BentoText38GnDrw(strStringResource, null, Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextM(), composer, 0, 0, 8186);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$1566878440$feature_internal_asset_transfers_externalDebug */
    public final Function2<Composer, Integer, Unit> m2070xc71a2c0b() {
        return lambda$1566878440;
    }

    /* renamed from: getLambda$647249534$feature_internal_asset_transfers_externalDebug */
    public final Function2<Composer, Integer, Unit> m2071x5594923c() {
        return lambda$647249534;
    }
}
