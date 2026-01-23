package com.robinhood.shared.crypto.transfer.send.address.saved;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.shared.crypto.transfer.C37934R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoTransferSendSavedAddressComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class ComposableSingletons$CryptoTransferSendSavedAddressComposableKt {
    public static final ComposableSingletons$CryptoTransferSendSavedAddressComposableKt INSTANCE = new ComposableSingletons$CryptoTransferSendSavedAddressComposableKt();

    /* renamed from: lambda$-1829128638, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f9432lambda$1829128638 = ComposableLambda3.composableLambdaInstance(-1829128638, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.send.address.saved.ComposableSingletons$CryptoTransferSendSavedAddressComposableKt$lambda$-1829128638$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1829128638, i, -1, "com.robinhood.shared.crypto.transfer.send.address.saved.ComposableSingletons$CryptoTransferSendSavedAddressComposableKt.lambda$-1829128638.<anonymous> (CryptoTransferSendSavedAddressComposable.kt:327)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C37934R.string.crypto_saved_addresses_section_heading, composer, 0), modifierM5144paddingVpY3zN4$default, null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextM(), composer, 24576, 0, 8172);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$1221192377 = ComposableLambda3.composableLambdaInstance(1221192377, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.send.address.saved.ComposableSingletons$CryptoTransferSendSavedAddressComposableKt$lambda$1221192377$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1221192377, i, -1, "com.robinhood.shared.crypto.transfer.send.address.saved.ComposableSingletons$CryptoTransferSendSavedAddressComposableKt.lambda$1221192377.<anonymous> (CryptoTransferSendSavedAddressComposable.kt:352)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C37934R.string.crypto_recent_addresses_section_heading, composer, 0), modifierM5144paddingVpY3zN4$default, null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextM(), composer, 24576, 0, 8172);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1599440489 = ComposableLambda3.composableLambdaInstance(1599440489, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.send.address.saved.ComposableSingletons$CryptoTransferSendSavedAddressComposableKt$lambda$1599440489$1
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
                ComposerKt.traceEventStart(1599440489, i, -1, "com.robinhood.shared.crypto.transfer.send.address.saved.ComposableSingletons$CryptoTransferSendSavedAddressComposableKt.lambda$1599440489.<anonymous> (CryptoTransferSendSavedAddressComposable.kt:430)");
            }
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C37934R.string.crypto_saved_addresses_scan_tooltip, composer, 0), null, Color.m6701boximpl(Color.INSTANCE.m6727getWhite0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getTextM(), composer, 384, 0, 8186);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1829128638$feature_crypto_transfer_externalDebug, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m25075getLambda$1829128638$feature_crypto_transfer_externalDebug() {
        return f9432lambda$1829128638;
    }

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$1221192377$feature_crypto_transfer_externalDebug() {
        return lambda$1221192377;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1599440489$feature_crypto_transfer_externalDebug() {
        return lambda$1599440489;
    }
}
