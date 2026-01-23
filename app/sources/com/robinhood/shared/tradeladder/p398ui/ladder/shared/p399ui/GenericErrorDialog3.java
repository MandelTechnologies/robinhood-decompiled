package com.robinhood.shared.tradeladder.p398ui.ladder.shared.p399ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.common.C11048R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: GenericErrorDialog.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.tradeladder.ui.ladder.shared.ui.ComposableSingletons$GenericErrorDialogKt$lambda$1748065604$1, reason: use source file name */
/* loaded from: classes12.dex */
final class GenericErrorDialog3 implements Function2<Composer, Integer, Unit> {
    public static final GenericErrorDialog3 INSTANCE = new GenericErrorDialog3();

    GenericErrorDialog3() {
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
            ComposerKt.traceEventStart(1748065604, i, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.ui.ComposableSingletons$GenericErrorDialogKt.lambda$1748065604.<anonymous> (GenericErrorDialog.kt:33)");
        }
        int i2 = C11048R.string.general_error_title;
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.ui.ComposableSingletons$GenericErrorDialogKt$lambda$1748065604$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        GenericErrorDialog4.GenericErrorDialog(i2, (Function0) objRememberedValue, composer, 48);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
