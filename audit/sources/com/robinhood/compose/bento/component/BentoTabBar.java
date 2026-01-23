package com.robinhood.compose.bento.component;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.theme.style.NavigationBarStyle;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.jvm.JvmName;

/* compiled from: BentoTabBar.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/BentoTabBarDefaults;", "", "<init>", "()V", ResourceTypes.STYLE, "Lcom/robinhood/compose/theme/style/NavigationBarStyle;", "getStyle", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/NavigationBarStyle;", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.compose.bento.component.BentoTabBarDefaults, reason: use source file name */
/* loaded from: classes15.dex */
public final class BentoTabBar {
    public static final int $stable = 0;
    public static final BentoTabBar INSTANCE = new BentoTabBar();

    private BentoTabBar() {
    }

    @JvmName
    public final NavigationBarStyle getStyle(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-9189109, i, -1, "com.robinhood.compose.bento.component.BentoTabBarDefaults.<get-style> (BentoTabBar.kt:301)");
        }
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        NavigationBarStyle navigationBarStyle = new NavigationBarStyle(new NavigationBarStyle.Colors(bentoTheme.getColors(composer, 6).m21425getFg0d7_KjU(), bentoTheme.getColors(composer, 6).m21371getBg0d7_KjU(), bentoTheme.getColors(composer, 6).m21426getFg20d7_KjU(), bentoTheme.getColors(composer, 6).m21427getFg30d7_KjU(), null));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return navigationBarStyle;
    }
}
