package com.robinhood.android.portfolio.positions.display;

import android.content.res.Resources;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.portfolio.positions.display.PositionsDisplayOptionsViewState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PositionsDisplayOptionsComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.portfolio.positions.display.ComposableSingletons$PositionsDisplayOptionsComposableKt$lambda$210413746$1, reason: use source file name */
/* loaded from: classes11.dex */
final class PositionsDisplayOptionsComposable2 implements Function2<Composer, Integer, Unit> {
    public static final PositionsDisplayOptionsComposable2 INSTANCE = new PositionsDisplayOptionsComposable2();

    PositionsDisplayOptionsComposable2() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) throws Resources.NotFoundException {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) throws Resources.NotFoundException {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(210413746, i, -1, "com.robinhood.android.portfolio.positions.display.ComposableSingletons$PositionsDisplayOptionsComposableKt.lambda$210413746.<anonymous> (PositionsDisplayOptionsComposable.kt:39)");
        }
        PositionsDisplayOptionsViewState.Ready loadingMock = PositionsDisplayOptionsViewState.INSTANCE.getLoadingMock();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.portfolio.positions.display.ComposableSingletons$PositionsDisplayOptionsComposableKt$lambda$210413746$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PositionsDisplayOptionsComposable2.invoke$lambda$1$lambda$0((String) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        PositionsDisplayOptionsComposable3.PositionsDisplayOptionsReadyComposable(loadingMock, (Function1) objRememberedValue, null, composer, 48, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
