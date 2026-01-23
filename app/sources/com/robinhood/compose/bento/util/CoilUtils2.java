package com.robinhood.compose.bento.util;

import android.content.Context;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import coil.ComponentRegistry;
import coil.ImageLoader;
import coil.decode.SvgDecoder;
import coil.memory.MemoryCache;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.OkHttpClient;

/* compiled from: CoilUtils.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"rememberImageLoader", "Lcoil/ImageLoader;", "availableMemoryPercentage", "", "okHttpClient", "Lokhttp3/OkHttpClient;", "(DLokhttp3/OkHttpClient;Landroidx/compose/runtime/Composer;II)Lcoil/ImageLoader;", "lib-compose-bento_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.bento.util.CoilUtilsKt, reason: use source file name */
/* loaded from: classes20.dex */
public final class CoilUtils2 {
    public static final ImageLoader rememberImageLoader(final double d, OkHttpClient okHttpClient, Composer composer, int i, int i2) {
        composer.startReplaceGroup(-1237430360);
        if ((i2 & 1) != 0) {
            d = 0.1d;
        }
        if ((i2 & 2) != 0) {
            okHttpClient = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1237430360, i, -1, "com.robinhood.compose.bento.util.rememberImageLoader (CoilUtils.kt:19)");
        }
        final Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            ImageLoader.Builder builder = new ImageLoader.Builder(context);
            ComponentRegistry.Builder builder2 = new ComponentRegistry.Builder();
            builder2.add(new SvgDecoder.Factory(false, 1, null));
            ImageLoader.Builder builderMemoryCache = builder.components(builder2.build()).memoryCache(new Function0() { // from class: com.robinhood.compose.bento.util.CoilUtilsKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CoilUtils2.rememberImageLoader$lambda$3$lambda$1(context, d);
                }
            });
            if (okHttpClient != null) {
                builderMemoryCache = builderMemoryCache.okHttpClient(okHttpClient);
            }
            objRememberedValue = builderMemoryCache.build();
            composer.updateRememberedValue(objRememberedValue);
        }
        ImageLoader imageLoader = (ImageLoader) objRememberedValue;
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return imageLoader;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MemoryCache rememberImageLoader$lambda$3$lambda$1(Context context, double d) {
        return new MemoryCache.Builder(context).maxSizePercent(d).build();
    }
}
