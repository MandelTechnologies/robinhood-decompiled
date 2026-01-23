package com.robinhood.android.responsive;

import android.content.res.Configuration;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Font.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\"\u0011\u0010\u0000\u001a\u00020\u00018G¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0002¨\u0006\u0003"}, m3636d2 = {"isFontEnlarged", "", "(Landroidx/compose/runtime/Composer;I)Z", "lib-responsive_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.responsive.FontKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class Font5 {
    @JvmName
    public static final boolean isFontEnlarged(Composer composer, int i) {
        composer.startReplaceGroup(1828246194);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1828246194, i, -1, "com.robinhood.android.responsive.<get-isFontEnlarged> (Font.kt:10)");
        }
        boolean z = ((Configuration) composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).fontScale > 1.0f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return z;
    }
}
