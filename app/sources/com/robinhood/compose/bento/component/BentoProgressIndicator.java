package com.robinhood.compose.bento.component;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.theme.style.CircularProgressIndicatorStyle;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.jvm.JvmName;

/* compiled from: BentoProgressIndicator.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/BentoCircularProgressIndicatorDefaults;", "", "<init>", "()V", ResourceTypes.STYLE, "Lcom/robinhood/compose/theme/style/CircularProgressIndicatorStyle;", "getStyle", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/CircularProgressIndicatorStyle;", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.compose.bento.component.BentoCircularProgressIndicatorDefaults, reason: use source file name */
/* loaded from: classes15.dex */
public final class BentoProgressIndicator {
    public static final int $stable = 0;
    public static final BentoProgressIndicator INSTANCE = new BentoProgressIndicator();

    private BentoProgressIndicator() {
    }

    @JvmName
    public final CircularProgressIndicatorStyle getStyle(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(383319262, i, -1, "com.robinhood.compose.bento.component.BentoCircularProgressIndicatorDefaults.<get-style> (BentoProgressIndicator.kt:48)");
        }
        CircularProgressIndicatorStyle circularProgressIndicatorStyle = new CircularProgressIndicatorStyle(BentoTheme.INSTANCE.getColors(composer, 6).m21425getFg0d7_KjU(), null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return circularProgressIndicatorStyle;
    }
}
