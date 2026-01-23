package com.robinhood.utils.compose;

import android.content.Context;
import androidx.compose.p011ui.hapticfeedback.HapticFeedback;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.Clipboard;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ClipboardUtil.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m3636d2 = {"clipboardUtil", "Lcom/robinhood/utils/compose/ClipboardUtil;", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/utils/compose/ClipboardUtil;", "lib-utils-compose_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.utils.compose.ClipboardUtilKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class ClipboardUtil2 {
    public static final ClipboardUtil clipboardUtil(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2060702302, i, -1, "com.robinhood.utils.compose.clipboardUtil (ClipboardUtil.kt:20)");
        }
        ClipboardUtil clipboardUtil = new ClipboardUtil((Clipboard) composer.consume(CompositionLocalsKt.getLocalClipboard()), (HapticFeedback) composer.consume(CompositionLocalsKt.getLocalHapticFeedback()), (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return clipboardUtil;
    }
}
