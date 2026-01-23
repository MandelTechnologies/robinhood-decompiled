package com.robinhood.android.markdown.compose;

import android.content.Context;
import androidx.compose.foundation.ImageKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import coil.Coil;
import coil.compose.AsyncImagePainter4;
import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MarkdownText.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.markdown.compose.ComposableSingletons$MarkdownTextKt, reason: use source file name */
/* loaded from: classes17.dex */
public final class MarkdownText2 {
    public static final MarkdownText2 INSTANCE = new MarkdownText2();
    private static Function3<String, Composer, Integer, Unit> lambda$246295360 = ComposableLambda3.composableLambdaInstance(246295360, false, new Function3<String, Composer, Integer, Unit>() { // from class: com.robinhood.android.markdown.compose.ComposableSingletons$MarkdownTextKt$lambda$246295360$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(String str, Composer composer, Integer num) {
            invoke(str, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(String it, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(it, "it");
            if ((i & 6) == 0) {
                i2 = (composer.changed(it) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(246295360, i2, -1, "com.robinhood.android.markdown.compose.ComposableSingletons$MarkdownTextKt.lambda$246295360.<anonymous> (MarkdownText.kt:179)");
            }
            ImageKt.Image(AsyncImagePainter4.m9105rememberAsyncImagePainter0YpotYA(it, Coil.imageLoader((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())), null, null, null, 0, null, composer, i2 & 14, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE), (String) null, (Modifier) null, Alignment.INSTANCE.getCenter(), (ContentScale) null, 0.0f, (ColorFilter) null, composer, 3120, 116);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function3<String, Composer, Integer, Unit> getLambda$246295360$lib_markdown_compose_externalDebug() {
        return lambda$246295360;
    }
}
