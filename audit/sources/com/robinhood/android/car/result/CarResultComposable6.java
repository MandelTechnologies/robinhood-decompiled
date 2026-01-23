package com.robinhood.android.car.result;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CarResultComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.car.result.ComposableSingletons$CarResultComposableKt$lambda$161444543$1, reason: use source file name */
/* loaded from: classes7.dex */
final class CarResultComposable6 implements Function2<Composer, Integer, Unit> {
    public static final CarResultComposable6 INSTANCE = new CarResultComposable6();

    CarResultComposable6() {
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
            ComposerKt.traceEventStart(161444543, i, -1, "com.robinhood.android.car.result.ComposableSingletons$CarResultComposableKt.lambda$161444543.<anonymous> (CarResultComposable.kt:97)");
        }
        Function2<Composer, Integer, Unit> function2M11473getLambda$453331188$feature_car_externalDebug = CarResultComposable3.INSTANCE.m11473getLambda$453331188$feature_car_externalDebug();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.car.result.ComposableSingletons$CarResultComposableKt$lambda$161444543$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        Tuples2 tuples2M3642to = Tuples4.m3642to("I agree", (Function0) objRememberedValue);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.car.result.ComposableSingletons$CarResultComposableKt$lambda$161444543$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        CarResultComposable.CarResultComposable(function2M11473getLambda$453331188$feature_car_externalDebug, "How can the coins fit?", "The funnel of this hourglass is way too small to fit those coins though. Not realistic enough.", tuples2M3642to, Tuples4.m3642to("I disagree", (Function0) objRememberedValue2), null, composer, 28086, 32);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
