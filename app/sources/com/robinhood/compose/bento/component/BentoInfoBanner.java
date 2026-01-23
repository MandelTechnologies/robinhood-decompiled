package com.robinhood.compose.bento.component;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.theme.style.InfoBannerStyle;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BentoInfoBanner.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\t\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\n\u0010\u0007R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0011\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\u0013\u001a\u00020\u00148G¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/BentoInfoBannerDefaults;", "", "<init>", "()V", "CornerRadius", "Landroidx/compose/ui/unit/Dp;", "getCornerRadius-D9Ej5fM", "()F", "F", "DismissWidth", "getDismissWidth-D9Ej5fM", "DismissButtonShape", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "getDismissButtonShape", "()Landroidx/compose/foundation/shape/RoundedCornerShape;", "MainContentShapeWithDismiss", "getMainContentShapeWithDismiss", "MainContentShapeWithoutDismiss", "getMainContentShapeWithoutDismiss", ResourceTypes.STYLE, "Lcom/robinhood/compose/theme/style/InfoBannerStyle;", "getStyle", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/InfoBannerStyle;", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.bento.component.BentoInfoBannerDefaults, reason: use source file name */
/* loaded from: classes15.dex */
public final class BentoInfoBanner {
    public static final int $stable = 0;
    private static final float CornerRadius;
    private static final RoundedCornerShape DismissButtonShape;
    private static final float DismissWidth;
    public static final BentoInfoBanner INSTANCE = new BentoInfoBanner();
    private static final RoundedCornerShape MainContentShapeWithDismiss;
    private static final RoundedCornerShape MainContentShapeWithoutDismiss;

    static {
        float fM7995constructorimpl = C2002Dp.m7995constructorimpl(8);
        CornerRadius = fM7995constructorimpl;
        DismissWidth = C2002Dp.m7995constructorimpl(48);
        float f = 0;
        DismissButtonShape = RoundedCornerShape2.m5328RoundedCornerShapea9UjIt4(C2002Dp.m7995constructorimpl(f), fM7995constructorimpl, fM7995constructorimpl, C2002Dp.m7995constructorimpl(f));
        MainContentShapeWithDismiss = RoundedCornerShape2.m5329RoundedCornerShapea9UjIt4$default(fM7995constructorimpl, 0.0f, 0.0f, fM7995constructorimpl, 6, null);
        MainContentShapeWithoutDismiss = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(fM7995constructorimpl);
    }

    private BentoInfoBanner() {
    }

    /* renamed from: getCornerRadius-D9Ej5fM, reason: not valid java name */
    public final float m20647getCornerRadiusD9Ej5fM() {
        return CornerRadius;
    }

    /* renamed from: getDismissWidth-D9Ej5fM, reason: not valid java name */
    public final float m20648getDismissWidthD9Ej5fM() {
        return DismissWidth;
    }

    public final RoundedCornerShape getDismissButtonShape() {
        return DismissButtonShape;
    }

    public final RoundedCornerShape getMainContentShapeWithDismiss() {
        return MainContentShapeWithDismiss;
    }

    public final RoundedCornerShape getMainContentShapeWithoutDismiss() {
        return MainContentShapeWithoutDismiss;
    }

    @JvmName
    public final InfoBannerStyle getStyle(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(27273838, i, -1, "com.robinhood.compose.bento.component.BentoInfoBannerDefaults.<get-style> (BentoInfoBanner.kt:359)");
        }
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        InfoBannerStyle.Spacing spacing = new InfoBannerStyle.Spacing(PaddingKt.m5135PaddingValues0680j_4(bentoTheme.getSpacing(composer, 6).m21590getDefaultD9Ej5fM()), bentoTheme.getSpacing(composer, 6).m21590getDefaultD9Ej5fM(), null);
        InfoBannerStyle.Typography typography = new InfoBannerStyle.Typography(bentoTheme.getTypography(composer, 6).getTextS());
        long jM21372getBg20d7_KjU = bentoTheme.getColors(composer, 6).m21372getBg20d7_KjU();
        InfoBannerStyle infoBannerStyle = new InfoBannerStyle(spacing, typography, new InfoBannerStyle.Colors(bentoTheme.getColors(composer, 6).m21425getFg0d7_KjU(), jM21372getBg20d7_KjU, bentoTheme.getColors(composer, 6).getJet(), bentoTheme.getColors(composer, 6).getLumen(), null));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return infoBannerStyle;
    }
}
