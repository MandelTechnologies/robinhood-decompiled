package com.robinhood.android.advisory.onboarding;

import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.unit.TextUnit2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.responsive.Density4;
import com.robinhood.android.responsive.Font5;
import com.robinhood.compose.bento.theme.BentoTypography;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvisoryOnboardingSharedComponents.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0015\u0010\u0003\u001a\u00020\u0004*\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u0015\u0010\b\u001a\u00020\u0004*\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\t\u0010\n\"\u0011\u0010\u000b\u001a\u00020\f8G¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"FancyTitleTextSize", "Landroidx/compose/ui/unit/TextUnit;", "J", "advisoryOnboardingFancyTitle", "Landroidx/compose/ui/text/TextStyle;", "Lcom/robinhood/compose/bento/theme/BentoTypography;", "getAdvisoryOnboardingFancyTitle", "(Lcom/robinhood/compose/bento/theme/BentoTypography;)Landroidx/compose/ui/text/TextStyle;", "bookCoverMartinaSmallCompensatingForSmallDevices", "getBookCoverMartinaSmallCompensatingForSmallDevices", "(Lcom/robinhood/compose/bento/theme/BentoTypography;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/TextStyle;", "HeroAssetContainerWeight", "", "getHeroAssetContainerWeight", "(Landroidx/compose/runtime/Composer;I)F", "feature-advisory-onboarding_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisory.onboarding.AdvisoryOnboardingSharedComponentsKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class AdvisoryOnboardingSharedComponents {
    private static final long FancyTitleTextSize = TextUnit2.getSp(32);

    public static final TextStyle getAdvisoryOnboardingFancyTitle(BentoTypography bentoTypography) {
        Intrinsics.checkNotNullParameter(bentoTypography, "<this>");
        return TextStyle.m7655copyp1EtxEg$default(bentoTypography.getBookCoverMartinaSmall(), 0L, FancyTitleTextSize, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777213, null);
    }

    @JvmName
    public static final TextStyle getBookCoverMartinaSmallCompensatingForSmallDevices(BentoTypography bentoTypography, Composer composer, int i) {
        TextStyle bookCoverMartinaSmall;
        Intrinsics.checkNotNullParameter(bentoTypography, "<this>");
        composer.startReplaceGroup(2131429657);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2131429657, i, -1, "com.robinhood.android.advisory.onboarding.<get-bookCoverMartinaSmallCompensatingForSmallDevices> (AdvisoryOnboardingSharedComponents.kt:19)");
        }
        composer.startReplaceGroup(-395498883);
        boolean z = Density4.isLowDensityScreen(composer, 0) || Font5.isFontEnlarged(composer, 0);
        composer.endReplaceGroup();
        if (z) {
            bookCoverMartinaSmall = getAdvisoryOnboardingFancyTitle(bentoTypography);
        } else {
            bookCoverMartinaSmall = bentoTypography.getBookCoverMartinaSmall();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return bookCoverMartinaSmall;
    }

    @JvmName
    public static final float getHeroAssetContainerWeight(Composer composer, int i) {
        composer.startReplaceGroup(1123157898);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1123157898, i, -1, "com.robinhood.android.advisory.onboarding.<get-HeroAssetContainerWeight> (AdvisoryOnboardingSharedComponents.kt:29)");
        }
        float f = Density4.isLowDensityScreen(composer, 0) ? 0.85f : 1.0f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return f;
    }
}
