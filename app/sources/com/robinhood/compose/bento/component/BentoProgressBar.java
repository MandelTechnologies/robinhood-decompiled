package com.robinhood.compose.bento.component;

import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.theme.style.ProgressBarStyle;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BentoProgressBar.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0010\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0010\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0011\u0010\b\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/BentoProgressBarDefaults;", "", "<init>", "()V", "Height", "Landroidx/compose/ui/unit/Dp;", "F", "SegmentSpacing", ResourceTypes.STYLE, "Lcom/robinhood/compose/theme/style/ProgressBarStyle;", "getStyle", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/ProgressBarStyle;", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.bento.component.BentoProgressBarDefaults, reason: use source file name */
/* loaded from: classes15.dex */
public final class BentoProgressBar {
    public static final int $stable = 0;
    public static final BentoProgressBar INSTANCE = new BentoProgressBar();
    private static final float Height = C2002Dp.m7995constructorimpl(3);
    private static final float SegmentSpacing = C2002Dp.m7995constructorimpl(8);

    private BentoProgressBar() {
    }

    @JvmName
    public final ProgressBarStyle getStyle(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-422856492, i, -1, "com.robinhood.compose.bento.component.BentoProgressBarDefaults.<get-style> (BentoProgressBar.kt:155)");
        }
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        ProgressBarStyle progressBarStyle = new ProgressBarStyle(new ProgressBarStyle.Colors(bentoTheme.getColors(composer, 6).m21368getAccent0d7_KjU(), bentoTheme.getColors(composer, 6).m21427getFg30d7_KjU(), null), new ProgressBarStyle.Spacing(Height, SegmentSpacing, null));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return progressBarStyle;
    }
}
