package com.robinhood.shared.crypto.transfer.send.address.saved;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.apitestdata.models.ApiCreateUserRequest;
import com.robinhood.models.api.transfer.ApiSavedAddresses2;
import com.robinhood.shared.crypto.transfer.send.address.UiSavedAddress;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;

/* compiled from: CryptoTransferAddressRowComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.transfer.send.address.saved.ComposableSingletons$CryptoTransferAddressRowComposableKt$lambda$2081670333$1, reason: use source file name */
/* loaded from: classes6.dex */
final class CryptoTransferAddressRowComposable2 implements Function2<Composer, Integer, Unit> {
    public static final CryptoTransferAddressRowComposable2 INSTANCE = new CryptoTransferAddressRowComposable2();

    CryptoTransferAddressRowComposable2() {
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
            ComposerKt.traceEventStart(2081670333, i, -1, "com.robinhood.shared.crypto.transfer.send.address.saved.ComposableSingletons$CryptoTransferAddressRowComposableKt.lambda$2081670333.<anonymous> (CryptoTransferAddressRowComposable.kt:295)");
        }
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
        UiSavedAddress uiSavedAddress = new UiSavedAddress(uuidRandomUUID, "n4VQ5YdHf7hLQ2gWQYYrcxoE5B7nWuDFNF", ApiCreateUserRequest.SYMBOL_FOR_CRYPTO, Instant.MIN, "Robinhood Wallet", "Available on Aug 8", ApiSavedAddresses2.MATURED);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.address.saved.ComposableSingletons$CryptoTransferAddressRowComposableKt$lambda$2081670333$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CryptoTransferAddressRowComposable2.invoke$lambda$1$lambda$0((String) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function1 function1 = (Function1) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new Function2() { // from class: com.robinhood.shared.crypto.transfer.send.address.saved.ComposableSingletons$CryptoTransferAddressRowComposableKt$lambda$2081670333$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoTransferAddressRowComposable2.invoke$lambda$3$lambda$2((UUID) obj, (String) obj2);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        CryptoTransferAddressRowComposable4.CryptoTransferAddressRowComposable(ApiCreateUserRequest.SYMBOL_FOR_CRYPTO, uiSavedAddress, false, function1, (Function2) objRememberedValue2, null, composer, 28038, 32);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(UUID uuid, String str) {
        Intrinsics.checkNotNullParameter(uuid, "<unused var>");
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
