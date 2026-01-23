package com.robinhood.shared.crypto.p375ui.trade.view;

import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoOrderInputRow.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderInputRowStyleDefaults;", "", "<init>", "()V", ResourceTypes.STYLE, "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderInputRowStyle;", "getStyle", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderInputRowStyle;", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.ui.trade.view.CryptoOrderInputRowStyleDefaults, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoOrderInputRow8 {
    public static final int $stable = 0;
    public static final CryptoOrderInputRow8 INSTANCE = new CryptoOrderInputRow8();

    private CryptoOrderInputRow8() {
    }

    @JvmName
    public final CryptoOrderInputRowStyle getStyle(Composer composer, int i) {
        composer.startReplaceGroup(-2029600812);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2029600812, i, -1, "com.robinhood.shared.crypto.ui.trade.view.CryptoOrderInputRowStyleDefaults.<get-style> (CryptoOrderInputRow.kt:204)");
        }
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        CryptoOrderInputRowStyle cryptoOrderInputRowStyle = new CryptoOrderInputRowStyle(bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU(), bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU(), bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU(), bentoTheme.getColors(composer, i2).m21427getFg30d7_KjU(), C2002Dp.m7995constructorimpl(12), null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return cryptoOrderInputRowStyle;
    }
}
