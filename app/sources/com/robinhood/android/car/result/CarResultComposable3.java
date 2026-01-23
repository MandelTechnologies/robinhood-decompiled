package com.robinhood.android.car.result;

import androidx.compose.foundation.ImageKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: CarResultComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.car.result.ComposableSingletons$CarResultComposableKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class CarResultComposable3 {
    public static final CarResultComposable3 INSTANCE = new CarResultComposable3();

    /* renamed from: lambda$-453331188, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8673lambda$453331188 = ComposableLambda3.composableLambdaInstance(-453331188, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.car.result.ComposableSingletons$CarResultComposableKt$lambda$-453331188$1
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
                ComposerKt.traceEventStart(-453331188, i, -1, "com.robinhood.android.car.result.ComposableSingletons$CarResultComposableKt.lambda$-453331188.<anonymous> (CarResultComposable.kt:99)");
            }
            ImageKt.Image(PainterResources_androidKt.painterResource(C11048R.drawable.svg_app_delay_hourglass, composer, 0), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 48, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$161444543 = ComposableLambda3.composableLambdaInstance(161444543, false, CarResultComposable6.INSTANCE);
    private static Function2<Composer, Integer, Unit> lambda$443531814 = ComposableLambda3.composableLambdaInstance(443531814, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.car.result.ComposableSingletons$CarResultComposableKt$lambda$443531814$1
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
                ComposerKt.traceEventStart(443531814, i, -1, "com.robinhood.android.car.result.ComposableSingletons$CarResultComposableKt.lambda$443531814.<anonymous> (CarResultComposable.kt:118)");
            }
            ImageKt.Image(PainterResources_androidKt.painterResource(C11048R.drawable.svg_app_delay_hourglass, composer, 0), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 48, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1058307545 = ComposableLambda3.composableLambdaInstance(1058307545, false, CarResultComposable5.INSTANCE);

    /* renamed from: getLambda$-453331188$feature_car_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11473getLambda$453331188$feature_car_externalDebug() {
        return f8673lambda$453331188;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1058307545$feature_car_externalDebug() {
        return lambda$1058307545;
    }

    public final Function2<Composer, Integer, Unit> getLambda$161444543$feature_car_externalDebug() {
        return lambda$161444543;
    }

    public final Function2<Composer, Integer, Unit> getLambda$443531814$feature_car_externalDebug() {
        return lambda$443531814;
    }
}
