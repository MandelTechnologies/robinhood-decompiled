package com.robinhood.compose.bento.component.numpad;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.theme.style.NumpadStyle;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BentoNumpad.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\t\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/numpad/BentoNumpadDefaults;", "", "<init>", "()V", "NumpadButtonHeight", "Landroidx/compose/ui/unit/Dp;", "getNumpadButtonHeight-D9Ej5fM", "()F", "F", ResourceTypes.STYLE, "Lcom/robinhood/compose/theme/style/NumpadStyle;", "getStyle", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/NumpadStyle;", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.bento.component.numpad.BentoNumpadDefaults, reason: use source file name */
/* loaded from: classes15.dex */
public final class BentoNumpad2 {
    public static final int $stable = 0;
    public static final BentoNumpad2 INSTANCE = new BentoNumpad2();
    private static final float NumpadButtonHeight = C2002Dp.m7995constructorimpl(60);

    private BentoNumpad2() {
    }

    /* renamed from: getNumpadButtonHeight-D9Ej5fM, reason: not valid java name */
    public final float m20891getNumpadButtonHeightD9Ej5fM() {
        return NumpadButtonHeight;
    }

    @JvmName
    public final NumpadStyle getStyle(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1821441484, i, -1, "com.robinhood.compose.bento.component.numpad.BentoNumpadDefaults.<get-style> (BentoNumpad.kt:351)");
        }
        long jM6725getTransparent0d7_KjU = Color.INSTANCE.m6725getTransparent0d7_KjU();
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        NumpadStyle numpadStyle = new NumpadStyle(new NumpadStyle.Colors(jM6725getTransparent0d7_KjU, bentoTheme.getColors(composer, 6).m21425getFg0d7_KjU(), bentoTheme.getColors(composer, 6).m21427getFg30d7_KjU(), null), new NumpadStyle.Spacing(PaddingKt.m5136PaddingValuesYgX7TsA(bentoTheme.getSpacing(composer, 6).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, 6).m21593getSmallD9Ej5fM())), new NumpadStyle.Typography(bentoTheme.getTypography(composer, 6).getDisplayCapsuleLarge(), bentoTheme.getTypography(composer, 6).getDisplayCapsuleSmall()));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return numpadStyle;
    }
}
