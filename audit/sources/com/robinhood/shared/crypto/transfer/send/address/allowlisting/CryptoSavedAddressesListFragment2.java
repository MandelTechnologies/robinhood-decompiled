package com.robinhood.shared.crypto.transfer.send.address.allowlisting;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoSavedAddressesListFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.transfer.send.address.allowlisting.ComposableSingletons$CryptoSavedAddressesListFragmentKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoSavedAddressesListFragment2 {
    public static final CryptoSavedAddressesListFragment2 INSTANCE = new CryptoSavedAddressesListFragment2();

    /* renamed from: lambda$-1910133034, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9429lambda$1910133034 = ComposableLambda3.composableLambdaInstance(-1910133034, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.send.address.allowlisting.ComposableSingletons$CryptoSavedAddressesListFragmentKt$lambda$-1910133034$1
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
                ComposerKt.traceEventStart(-1910133034, i, -1, "com.robinhood.shared.crypto.transfer.send.address.allowlisting.ComposableSingletons$CryptoSavedAddressesListFragmentKt.lambda$-1910133034.<anonymous> (CryptoSavedAddressesListFragment.kt:15)");
            }
            CryptoSavedAddressesListComposable4.CryptoSavedAddressesListComposable(null, null, null, null, null, composer, 438, 24);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1910133034$feature_crypto_transfer_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m25048getLambda$1910133034$feature_crypto_transfer_externalDebug() {
        return f9429lambda$1910133034;
    }
}
