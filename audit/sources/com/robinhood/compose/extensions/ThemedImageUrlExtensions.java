package com.robinhood.compose.extensions;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.serverdriven.p347db.ImageSource;
import com.robinhood.models.serverdriven.p347db.ThemedImageSource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.HttpUrl;

/* compiled from: ThemedImageUrlExtensions.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0011\u0010\u0005\u001a\u00020\u0006*\u00020\u0002H\u0007¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m3636d2 = {"getDensitySet", "Lcom/robinhood/models/serverdriven/db/ImageSource;", "Lcom/robinhood/models/serverdriven/db/ThemedImageSource;", "isDay", "", "getResolvedUrl", "Lokhttp3/HttpUrl;", "(Lcom/robinhood/models/serverdriven/db/ThemedImageSource;Landroidx/compose/runtime/Composer;I)Lokhttp3/HttpUrl;", "lib-compose-common_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.extensions.ThemedImageUrlExtensionsKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class ThemedImageUrlExtensions {
    public static final ImageSource getDensitySet(ThemedImageSource themedImageSource, boolean z) {
        Intrinsics.checkNotNullParameter(themedImageSource, "<this>");
        return z ? themedImageSource.getLight() : themedImageSource.getDark();
    }

    @SuppressLint({"ComposableNaming"})
    public static final HttpUrl getResolvedUrl(ThemedImageSource themedImageSource, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(themedImageSource, "<this>");
        composer.startReplaceGroup(-2094914815);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2094914815, i, -1, "com.robinhood.compose.extensions.getResolvedUrl (ThemedImageUrlExtensions.kt:16)");
        }
        HttpUrl imageUrl = getDensitySet(themedImageSource, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).getIsDay()).toImageUrl((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return imageUrl;
    }
}
