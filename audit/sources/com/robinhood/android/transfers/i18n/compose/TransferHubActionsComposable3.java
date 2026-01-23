package com.robinhood.android.transfers.i18n.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.transfers.transferhub.C30556R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TransferHubActionsComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.i18n.compose.ComposableSingletons$TransferHubActionsComposableKt$lambda$1675751930$1, reason: use source file name */
/* loaded from: classes9.dex */
final class TransferHubActionsComposable3 implements Function2<Composer, Integer, Unit> {
    public static final TransferHubActionsComposable3 INSTANCE = new TransferHubActionsComposable3();

    TransferHubActionsComposable3() {
    }

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
            ComposerKt.traceEventStart(1675751930, i, -1, "com.robinhood.android.transfers.i18n.compose.ComposableSingletons$TransferHubActionsComposableKt.lambda$1675751930.<anonymous> (TransferHubActionsComposable.kt:186)");
        }
        int i2 = C30556R.string.move_money_deposit;
        ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.DEPOSIT_24;
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.transfers.i18n.compose.ComposableSingletons$TransferHubActionsComposableKt$lambda$1675751930$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        TransferHubActionsComposable4.TransferHubActionButton(i2, serverToBentoAssetMapper2, (Function0) objRememberedValue, null, composer, 432, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
