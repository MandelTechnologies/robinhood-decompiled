package com.robinhood.compose.bento.component;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.theme.style.IconButtonStyle;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BentoIconButton.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u0013\u0010\u000e\u001a\u00020\u000f¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0013\u001a\u00020\u00148G¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/BentoIconButtonDefaults;", "", "<init>", "()V", "Shape", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "getShape$lib_compose_bento_externalRelease", "()Landroidx/compose/foundation/shape/RoundedCornerShape;", "ContentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "getContentPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "OutlinedBorderOpacity", "", "OutlinedBorderSize", "Landroidx/compose/ui/unit/Dp;", "getOutlinedBorderSize-D9Ej5fM", "()F", "F", ResourceTypes.STYLE, "Lcom/robinhood/compose/theme/style/IconButtonStyle;", "getStyle", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/IconButtonStyle;", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.bento.component.BentoIconButtonDefaults, reason: use source file name */
/* loaded from: classes15.dex */
public final class BentoIconButton {
    public static final int $stable = 0;
    public static final float OutlinedBorderOpacity = 0.5f;
    public static final BentoIconButton INSTANCE = new BentoIconButton();
    private static final RoundedCornerShape Shape = RoundedCornerShape2.getCircleShape();
    private static final PaddingValues ContentPadding = PaddingKt.m5135PaddingValues0680j_4(C2002Dp.m7995constructorimpl(0));
    private static final float OutlinedBorderSize = C2002Dp.m7995constructorimpl(1);

    private BentoIconButton() {
    }

    public final RoundedCornerShape getShape$lib_compose_bento_externalRelease() {
        return Shape;
    }

    public final PaddingValues getContentPadding() {
        return ContentPadding;
    }

    /* renamed from: getOutlinedBorderSize-D9Ej5fM, reason: not valid java name */
    public final float m20640getOutlinedBorderSizeD9Ej5fM() {
        return OutlinedBorderSize;
    }

    @JvmName
    public final IconButtonStyle getStyle(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1233516451, i, -1, "com.robinhood.compose.bento.component.BentoIconButtonDefaults.<get-style> (BentoIconButton.kt:136)");
        }
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        IconButtonStyle.Style style = new IconButtonStyle.Style(new IconButtonStyle.Colors(new IconButtonStyle.StateColor(bentoTheme.getColors(composer, 6).m21368getAccent0d7_KjU(), bentoTheme.getColors(composer, 6).m21373getBg30d7_KjU(), null), new IconButtonStyle.StateColor(bentoTheme.getColors(composer, 6).m21371getBg0d7_KjU(), bentoTheme.getColors(composer, 6).m21371getBg0d7_KjU(), null), null));
        Color.Companion companion = Color.INSTANCE;
        IconButtonStyle iconButtonStyle = new IconButtonStyle(style, new IconButtonStyle.Style(new IconButtonStyle.Colors(new IconButtonStyle.StateColor(companion.m6725getTransparent0d7_KjU(), companion.m6725getTransparent0d7_KjU(), null), new IconButtonStyle.StateColor(bentoTheme.getColors(composer, 6).m21368getAccent0d7_KjU(), bentoTheme.getColors(composer, 6).m21427getFg30d7_KjU(), null), new IconButtonStyle.StateColor(bentoTheme.getColors(composer, 6).m21368getAccent0d7_KjU(), bentoTheme.getColors(composer, 6).m21427getFg30d7_KjU(), null))));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return iconButtonStyle;
    }
}
