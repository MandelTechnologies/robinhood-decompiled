package com.robinhood.compose.bento.component;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.theme.style.AppBarStyle;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.jvm.JvmName;

/* compiled from: BentoAppBar.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\t8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/BentoAppBarDefaults;", "", "<init>", "()V", "NavIconTestTag", "", "FadeAnimationSpeed", "", ResourceTypes.STYLE, "Lcom/robinhood/compose/theme/style/AppBarStyle;", "getStyle", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/AppBarStyle;", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class BentoAppBarDefaults {
    public static final int $stable = 0;
    public static final int FadeAnimationSpeed = 300;
    public static final BentoAppBarDefaults INSTANCE = new BentoAppBarDefaults();
    public static final String NavIconTestTag = "bentoAppNavIcon";

    private BentoAppBarDefaults() {
    }

    @JvmName
    public final AppBarStyle getStyle(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(270284854, i, -1, "com.robinhood.compose.bento.component.BentoAppBarDefaults.<get-style> (BentoAppBar.kt:277)");
        }
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        AppBarStyle appBarStyle = new AppBarStyle(new AppBarStyle.Colors(bentoTheme.getColors(composer, 6).m21371getBg0d7_KjU(), bentoTheme.getColors(composer, 6).m21425getFg0d7_KjU(), null));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return appBarStyle;
    }
}
