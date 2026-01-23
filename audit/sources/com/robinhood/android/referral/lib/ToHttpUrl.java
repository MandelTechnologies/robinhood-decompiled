package com.robinhood.android.referral.lib;

import android.content.Context;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.serverdriven.p347db.ThemedImageSource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.HttpUrl;

/* compiled from: ToHttpUrl.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"toHttpUrl", "Lokhttp3/HttpUrl;", "Lcom/robinhood/models/serverdriven/db/ThemedImageSource;", "(Lcom/robinhood/models/serverdriven/db/ThemedImageSource;Landroidx/compose/runtime/Composer;I)Lokhttp3/HttpUrl;", "feature-lib-referral_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.referral.lib.ToHttpUrlKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class ToHttpUrl {
    public static final HttpUrl toHttpUrl(ThemedImageSource themedImageSource, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(themedImageSource, "<this>");
        composer.startReplaceGroup(-1723438550);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1723438550, i, -1, "com.robinhood.android.referral.lib.toHttpUrl (ToHttpUrl.kt:9)");
        }
        HttpUrl imageUrl = (BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).getIsDay() ? themedImageSource.getLight() : themedImageSource.getDark()).toImageUrl((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return imageUrl;
    }
}
