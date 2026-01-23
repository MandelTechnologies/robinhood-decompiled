package com.robinhood.shared.crypto.transfer.send.amount;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: WarningSheetContent.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.transfer.send.amount.ComposableSingletons$WarningSheetContentKt$lambda$-990412292$1, reason: use source file name */
/* loaded from: classes6.dex */
final class WarningSheetContent4 implements Function2<Composer, Integer, Unit> {
    public static final WarningSheetContent4 INSTANCE = new WarningSheetContent4();

    WarningSheetContent4() {
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
            ComposerKt.traceEventStart(-990412292, i, -1, "com.robinhood.shared.crypto.transfer.send.amount.ComposableSingletons$WarningSheetContentKt.lambda$-990412292.<anonymous> (WarningSheetContent.kt:270)");
        }
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.amount.ComposableSingletons$WarningSheetContentKt$lambda$-990412292$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI((Function0) objRememberedValue, null, false, null, null, 0L, WarningSheetContent2.INSTANCE.m25094getLambda$1890570045$feature_crypto_transfer_externalDebug(), composer, 1572870, 62);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
