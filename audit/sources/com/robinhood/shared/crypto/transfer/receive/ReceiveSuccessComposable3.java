package com.robinhood.shared.crypto.transfer.receive;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.shared.crypto.transfer.receive.CryptoTransferReceiveViewState;
import com.robinhood.shared.crypto.transfer.unified.sheet.TipsSheetContent2;
import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.extensions2;

/* compiled from: ReceiveSuccessComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.transfer.receive.ComposableSingletons$ReceiveSuccessComposableKt$lambda$209107158$1, reason: use source file name */
/* loaded from: classes6.dex */
final class ReceiveSuccessComposable3 implements Function2<Composer, Integer, Unit> {
    public static final ReceiveSuccessComposable3 INSTANCE = new ReceiveSuccessComposable3();

    ReceiveSuccessComposable3() {
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
            ComposerKt.traceEventStart(209107158, i, -1, "com.robinhood.shared.crypto.transfer.receive.ComposableSingletons$ReceiveSuccessComposableKt.lambda$209107158.<anonymous> (ReceiveSuccessComposable.kt:402)");
        }
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
        StringResource.Companion companion = StringResource.INSTANCE;
        CryptoTransferReceiveViewState.Success success = new CryptoTransferReceiveViewState.Success("ETH", uuidRandomUUID, companion.invoke("Receive Crypto"), "0x1234567890abcdef1234567890abcdef123456780x1234567890", "123456", companion.invoke("Disclaimer"), new CryptoTransferReceiveViewState.Success.NetworkChip("Ethereum", "eth-logo-light.png", "eth-logo-dark.png"), extensions2.persistentListOf(), null, TipsSheetContent2.Stub.INSTANCE);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion2 = Composer.INSTANCE;
        if (objRememberedValue == companion2.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.shared.crypto.transfer.receive.ComposableSingletons$ReceiveSuccessComposableKt$lambda$209107158$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ReceiveSuccessComposable3.invoke$lambda$1$lambda$0(((Integer) obj).intValue());
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function1 function1 = (Function1) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion2.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.receive.ComposableSingletons$ReceiveSuccessComposableKt$lambda$209107158$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        ReceiveSuccessComposable4.ReceiveSuccessComposable(success, function1, (Function0) objRememberedValue2, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), composer, 3504, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(int i) {
        return Unit.INSTANCE;
    }
}
