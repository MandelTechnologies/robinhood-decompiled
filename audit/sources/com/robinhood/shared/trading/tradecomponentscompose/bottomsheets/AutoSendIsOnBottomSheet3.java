package com.robinhood.shared.trading.tradecomponentscompose.bottomsheets;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AutoSendIsOnBottomSheet.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.trading.tradecomponentscompose.bottomsheets.ComposableSingletons$AutoSendIsOnBottomSheetKt$lambda$594117634$1, reason: use source file name */
/* loaded from: classes12.dex */
final class AutoSendIsOnBottomSheet3 implements Function2<Composer, Integer, Unit> {
    public static final AutoSendIsOnBottomSheet3 INSTANCE = new AutoSendIsOnBottomSheet3();

    AutoSendIsOnBottomSheet3() {
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
            ComposerKt.traceEventStart(594117634, i, -1, "com.robinhood.shared.trading.tradecomponentscompose.bottomsheets.ComposableSingletons$AutoSendIsOnBottomSheetKt.lambda$594117634.<anonymous> (AutoSendIsOnBottomSheet.kt:101)");
        }
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.shared.trading.tradecomponentscompose.bottomsheets.ComposableSingletons$AutoSendIsOnBottomSheetKt$lambda$594117634$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function0 function0 = (Function0) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.trading.tradecomponentscompose.bottomsheets.ComposableSingletons$AutoSendIsOnBottomSheetKt$lambda$594117634$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        AutoSendIsOnBottomSheet.AutoSendIsOnBottomSheet(function0, (Function0) objRememberedValue2, null, composer, 54, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
