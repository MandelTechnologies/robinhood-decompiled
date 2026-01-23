package com.robinhood.android.portfolio.positionsSortOptions;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.models.portfolio.api.PositionInstrumentType;
import com.robinhood.android.portfolio.positionsSortOptions.PositionsSortOptionsViewState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PositionsSortOptionsComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.portfolio.positionsSortOptions.PositionsSortOptionsComposableKt$PositionsSortOptionsComposable$1$1$1, reason: use source file name */
/* loaded from: classes11.dex */
final class PositionsSortOptionsComposable2 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ PositionInstrumentType $positionInstrumentType;

    PositionsSortOptionsComposable2(PositionInstrumentType positionInstrumentType) {
        this.$positionInstrumentType = positionInstrumentType;
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
            ComposerKt.traceEventStart(1453889194, i, -1, "com.robinhood.android.portfolio.positionsSortOptions.PositionsSortOptionsComposable.<anonymous>.<anonymous>.<anonymous> (PositionsSortOptionsComposable.kt:69)");
        }
        PositionInstrumentType positionInstrumentType = this.$positionInstrumentType;
        PositionsSortOptionsViewState.Ready loadingMock = PositionsSortOptionsViewState.INSTANCE.getLoadingMock();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.portfolio.positionsSortOptions.PositionsSortOptionsComposableKt$PositionsSortOptionsComposable$1$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PositionsSortOptionsComposable2.invoke$lambda$1$lambda$0((String) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        PositionsSortOptionsComposable.PositionsSortOptionsReadyComposable(positionInstrumentType, loadingMock, (Function1) objRememberedValue, null, composer, 384, 8);
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
