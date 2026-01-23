package com.robinhood.compose.common;

import android.view.View;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Haptics.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a!\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"hapticClick", "Lkotlin/Function0;", "", "onClick", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function0;", "lib-compose-common_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.common.HapticsKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class Haptics {
    public static final Function0<Unit> hapticClick(final Function0<Unit> onClick, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        composer.startReplaceGroup(2032398535);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2032398535, i, -1, "com.robinhood.compose.common.hapticClick (Haptics.kt:10)");
        }
        final View view = (View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
        composer.startReplaceGroup(-1633490746);
        boolean zChangedInstance = ((((i & 14) ^ 6) > 4 && composer.changed(onClick)) || (i & 6) == 4) | composer.changedInstance(view);
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.compose.common.HapticsKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Haptics.hapticClick$lambda$1$lambda$0(view, onClick);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function0<Unit> function0 = (Function0) objRememberedValue;
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return function0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit hapticClick$lambda$1$lambda$0(View view, Function0 function0) {
        view.performHapticFeedback(6);
        function0.invoke();
        return Unit.INSTANCE;
    }
}
