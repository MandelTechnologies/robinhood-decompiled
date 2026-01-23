package com.robinhood.compose.bento.theme;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.compose.theme.style.LoadingPlaceholderStyle;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.jvm.JvmName;

/* compiled from: BentoLoadingPlaceholderDefaults.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/compose/bento/theme/BentoLoadingPlaceholderDefaults;", "", "<init>", "()V", ResourceTypes.STYLE, "Lcom/robinhood/compose/theme/style/LoadingPlaceholderStyle;", "getStyle", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/LoadingPlaceholderStyle;", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class BentoLoadingPlaceholderDefaults {
    public static final int $stable = 0;
    public static final BentoLoadingPlaceholderDefaults INSTANCE = new BentoLoadingPlaceholderDefaults();

    private BentoLoadingPlaceholderDefaults() {
    }

    @JvmName
    public final LoadingPlaceholderStyle getStyle(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1610235883, i, -1, "com.robinhood.compose.bento.theme.BentoLoadingPlaceholderDefaults.<get-style> (BentoLoadingPlaceholderDefaults.kt:10)");
        }
        LoadingPlaceholderStyle loadingPlaceholderStyle = new LoadingPlaceholderStyle(BentoTheme.INSTANCE.getTypography(composer, 6).getDisplayNibLarge());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return loadingPlaceholderStyle;
    }
}
