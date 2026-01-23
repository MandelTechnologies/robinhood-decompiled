package com.robinhood.android.car;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: CarSplashFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.car.ComposableSingletons$CarSplashFragmentKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class CarSplashFragment3 {
    public static final CarSplashFragment3 INSTANCE = new CarSplashFragment3();
    private static Function2<Composer, Integer, Unit> lambda$965412043 = ComposableLambda3.composableLambdaInstance(965412043, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.car.ComposableSingletons$CarSplashFragmentKt$lambda$965412043$1
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
                ComposerKt.traceEventStart(965412043, i, -1, "com.robinhood.android.car.ComposableSingletons$CarSplashFragmentKt.lambda$965412043.<anonymous> (CarSplashFragment.kt:69)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$965412043$feature_car_externalDebug() {
        return lambda$965412043;
    }
}
