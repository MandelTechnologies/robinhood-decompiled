package com.robinhood.android.car.result;

import androidx.compose.foundation.ImageKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import coil.compose.AsyncImagePainter4;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.mediaservice.ImageDensityUrl;
import com.robinhood.compose.bento.util.CoilUtils2;
import com.robinhood.utils.extensions.ContextsUiExtensions2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: CarResultFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.car.result.ComposableSingletons$CarResultFragmentKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class CarResultFragment3 {
    public static final CarResultFragment3 INSTANCE = new CarResultFragment3();

    /* renamed from: lambda$-1426493730, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8674lambda$1426493730 = ComposableLambda3.composableLambdaInstance(-1426493730, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.car.result.ComposableSingletons$CarResultFragmentKt$lambda$-1426493730$1
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
                ComposerKt.traceEventStart(-1426493730, i, -1, "com.robinhood.android.car.result.ComposableSingletons$CarResultFragmentKt.lambda$-1426493730.<anonymous> (CarResultFragment.kt:88)");
            }
            ImageKt.Image(AsyncImagePainter4.m9105rememberAsyncImagePainter0YpotYA(new ImageDensityUrl("customer_account_review/stoplight", null, 2, null).getImageDensityUrl(ContextsUiExtensions2.XXHDPI).getUrl(), CoilUtils2.rememberImageLoader(0.0d, null, composer, 0, 3), null, null, null, 0, null, composer, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 48, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1426493730$feature_car_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11476getLambda$1426493730$feature_car_externalDebug() {
        return f8674lambda$1426493730;
    }
}
