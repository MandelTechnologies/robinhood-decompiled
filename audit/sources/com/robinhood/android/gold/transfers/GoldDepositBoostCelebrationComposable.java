package com.robinhood.android.gold.transfers;

import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.text.PlatformTextStyle;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.LineHeightStyle;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: GoldDepositBoostCelebrationComposable.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/gold/transfers/Constants;", "", "<init>", "()V", "defaultAmountTextStyle", "Landroidx/compose/ui/text/TextStyle;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/TextStyle;", "PREFIX_SYMBOL_FONT_SIZE_MULTIPLIER", "", "PREFIX_SYMBOL_LINE_HEIGHT_MULTIPLIER", "GOLD_DEPOSIT_BOOST_LOTTIE_TEST_TAG", "", "GOLD_DEPOSIT_BOOST_BG_IMAGE_TEST_TAG", "lib-gold-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.gold.transfers.Constants, reason: use source file name */
/* loaded from: classes10.dex */
public final class GoldDepositBoostCelebrationComposable {
    public static final int $stable = 0;
    public static final String GOLD_DEPOSIT_BOOST_BG_IMAGE_TEST_TAG = "GoldDepositBoostBgImage";
    public static final String GOLD_DEPOSIT_BOOST_LOTTIE_TEST_TAG = "GoldDepositBoostLottie";
    public static final GoldDepositBoostCelebrationComposable INSTANCE = new GoldDepositBoostCelebrationComposable();
    public static final float PREFIX_SYMBOL_FONT_SIZE_MULTIPLIER = 0.33333334f;
    public static final float PREFIX_SYMBOL_LINE_HEIGHT_MULTIPLIER = 0.61f;

    private GoldDepositBoostCelebrationComposable() {
    }

    public final TextStyle defaultAmountTextStyle(Composer composer, int i) {
        composer.startReplaceGroup(567196208);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(567196208, i, -1, "com.robinhood.android.gold.transfers.Constants.defaultAmountTextStyle (GoldDepositBoostCelebrationComposable.kt:524)");
        }
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        TextStyle textStyleM7655copyp1EtxEg$default = TextStyle.m7655copyp1EtxEg$default(bentoTheme.getTypography(composer, i2).getBookCoverCapsuleLarge(), bentoTheme.getColors(composer, i2).getJet(), ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo5020toSpkPz2Gy4(300), FontWeight.INSTANCE.getMedium(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, new PlatformTextStyle(false), new LineHeightStyle(LineHeightStyle.Alignment.INSTANCE.m7889getCenterPIaL0Z0(), LineHeightStyle.Trim.INSTANCE.m7911getNoneEVpEnUU(), (DefaultConstructorMarker) null), 0, 0, null, 15204344, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return textStyleM7655copyp1EtxEg$default;
    }
}
