package com.robinhood.android.equitydetail.p123ui.chartsettings;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ChartSettingsBottomSheetComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equitydetail.ui.chartsettings.ComposableSingletons$ChartSettingsBottomSheetComposableKt$lambda$1142347747$1, reason: use source file name */
/* loaded from: classes3.dex */
final class ChartSettingsBottomSheetComposable4 implements Function2<Composer, Integer, Unit> {
    public static final ChartSettingsBottomSheetComposable4 INSTANCE = new ChartSettingsBottomSheetComposable4();

    ChartSettingsBottomSheetComposable4() {
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
            ComposerKt.traceEventStart(1142347747, i, -1, "com.robinhood.android.equitydetail.ui.chartsettings.ComposableSingletons$ChartSettingsBottomSheetComposableKt.lambda$1142347747.<anonymous> (ChartSettingsBottomSheetComposable.kt:134)");
        }
        ChartSettingsBottomSheetComposable2 chartSettingsBottomSheetComposable2 = ChartSettingsBottomSheetComposable2.LINE;
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.equitydetail.ui.chartsettings.ComposableSingletons$ChartSettingsBottomSheetComposableKt$lambda$1142347747$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ChartSettingsBottomSheetComposable4.invoke$lambda$1$lambda$0((ChartSettingsBottomSheetComposable2) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function1 function1 = (Function1) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.equitydetail.ui.chartsettings.ComposableSingletons$ChartSettingsBottomSheetComposableKt$lambda$1142347747$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ChartSettingsBottomSheetComposable4.invoke$lambda$3$lambda$2(((Boolean) obj).booleanValue());
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        Function1 function12 = (Function1) objRememberedValue2;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new Function1() { // from class: com.robinhood.android.equitydetail.ui.chartsettings.ComposableSingletons$ChartSettingsBottomSheetComposableKt$lambda$1142347747$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ChartSettingsBottomSheetComposable4.invoke$lambda$5$lambda$4((String) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceGroup();
        ChartSettingsBottomSheetComposable.ChartSettingsBottomSheetComposable(chartSettingsBottomSheetComposable2, true, function1, function12, (Function1) objRememberedValue3, null, composer, 28086, 32);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(ChartSettingsBottomSheetComposable2 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(boolean z) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5$lambda$4(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
