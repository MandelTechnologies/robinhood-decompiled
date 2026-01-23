package com.robinhood.android.internalassettransfers.customselection.equity;

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

/* compiled from: InternalAssetTransferEquityEdit.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.internalassettransfers.customselection.equity.ComposableSingletons$InternalAssetTransferEquityEditKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class InternalAssetTransferEquityEdit {
    public static final InternalAssetTransferEquityEdit INSTANCE = new InternalAssetTransferEquityEdit();
    private static Function2<Composer, Integer, Unit> lambda$1967047886 = ComposableLambda3.composableLambdaInstance(1967047886, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.customselection.equity.ComposableSingletons$InternalAssetTransferEquityEditKt$lambda$1967047886$1
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
                ComposerKt.traceEventStart(1967047886, i, -1, "com.robinhood.android.internalassettransfers.customselection.equity.ComposableSingletons$InternalAssetTransferEquityEditKt.lambda$1967047886.<anonymous> (InternalAssetTransferEquityEdit.kt:61)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$613835331 = ComposableLambda3.composableLambdaInstance(613835331, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.customselection.equity.ComposableSingletons$InternalAssetTransferEquityEditKt$lambda$613835331$1
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
                ComposerKt.traceEventStart(613835331, i, -1, "com.robinhood.android.internalassettransfers.customselection.equity.ComposableSingletons$InternalAssetTransferEquityEditKt.lambda$613835331.<anonymous> (InternalAssetTransferEquityEdit.kt:192)");
            }
            String strStringResource = StringResources_androidKt.stringResource(C18977R.string.internal_asset_transfer_custom_selection_number_of_shares, composer, 0);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            BentoText2.m20747BentoText38GnDrw(strStringResource, null, Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextM(), composer, 0, 0, 8186);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$1967047886$feature_internal_asset_transfers_externalDebug */
    public final Function2<Composer, Integer, Unit> m2088xceb148fa() {
        return lambda$1967047886;
    }

    /* renamed from: getLambda$613835331$feature_internal_asset_transfers_externalDebug */
    public final Function2<Composer, Integer, Unit> m2089xf3d17dc5() {
        return lambda$613835331;
    }
}
