package com.robinhood.android.crypto.tab.p093ui.lists;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoHomeWatchlistAdditionRow.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.crypto.tab.ui.lists.ComposableSingletons$CryptoHomeWatchlistAdditionRowKt$lambda$1078066736$1, reason: use source file name */
/* loaded from: classes2.dex */
final class CryptoHomeWatchlistAdditionRow2 implements Function2<Composer, Integer, Unit> {
    public static final CryptoHomeWatchlistAdditionRow2 INSTANCE = new CryptoHomeWatchlistAdditionRow2();

    CryptoHomeWatchlistAdditionRow2() {
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
            ComposerKt.traceEventStart(1078066736, i, -1, "com.robinhood.android.crypto.tab.ui.lists.ComposableSingletons$CryptoHomeWatchlistAdditionRowKt.lambda$1078066736.<anonymous> (CryptoHomeWatchlistAdditionRow.kt:46)");
        }
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.tab.ui.lists.ComposableSingletons$CryptoHomeWatchlistAdditionRowKt$lambda$1078066736$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        CryptoHomeWatchlistAdditionRow3.CryptoHomeWatchlistAdditionRow(null, (Function0) objRememberedValue, composer, 48, 1);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
