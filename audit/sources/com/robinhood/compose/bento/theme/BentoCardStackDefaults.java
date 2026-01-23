package com.robinhood.compose.bento.theme;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.compose.theme.style.CardStackStyle;
import com.robinhood.compose.theme.style.NotificationCardStyle;
import com.robinhood.compose.theme.style.NotificationEndCardStyle;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.jvm.JvmName;

/* compiled from: BentoCardStackDefaults.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/compose/bento/theme/BentoCardStackDefaults;", "", "<init>", "()V", ResourceTypes.STYLE, "Lcom/robinhood/compose/theme/style/CardStackStyle;", "getStyle", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/CardStackStyle;", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class BentoCardStackDefaults {
    public static final int $stable = 0;
    public static final BentoCardStackDefaults INSTANCE = new BentoCardStackDefaults();

    private BentoCardStackDefaults() {
    }

    @JvmName
    public final CardStackStyle getStyle(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(873688256, i, -1, "com.robinhood.compose.bento.theme.BentoCardStackDefaults.<get-style> (BentoCardStackDefaults.kt:14)");
        }
        CardStackStyle cardStackStyle = new CardStackStyle() { // from class: com.robinhood.compose.bento.theme.BentoCardStackDefaults$style$1
            @Override // com.robinhood.compose.theme.style.CardStackStyle
            @JvmName
            public NotificationCardStyle getNotificationCardStyle(Composer composer2, int i2) {
                composer2.startReplaceGroup(-1885124992);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1885124992, i2, -1, "com.robinhood.compose.bento.theme.BentoCardStackDefaults.<get-style>.<no name provided>.<get-notificationCardStyle> (BentoCardStackDefaults.kt:18)");
                }
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                NotificationCardStyle notificationCardStyle = new NotificationCardStyle(new NotificationCardStyle.Typography(bentoTheme.getTypography(composer2, 6).getTextS(), bentoTheme.getTypography(composer2, 6).getTextS(), bentoTheme.getTypography(composer2, 6).getTextL(), bentoTheme.getTypography(composer2, 6).getTextM(), bentoTheme.getTypography(composer2, 6).getTextS()), new NotificationCardStyle.Colors(bentoTheme.getColors(composer2, 6).m21426getFg20d7_KjU(), bentoTheme.getColors(composer2, 6).m21373getBg30d7_KjU(), bentoTheme.getColors(composer2, 6).m21373getBg30d7_KjU(), bentoTheme.getColors(composer2, 6).m21425getFg0d7_KjU(), bentoTheme.getColors(composer2, 6).m21368getAccent0d7_KjU(), null), new NotificationCardStyle.Spacing(bentoTheme.getSpacing(composer2, 6).m21593getSmallD9Ej5fM(), bentoTheme.getSpacing(composer2, 6).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composer2, 6).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, 6).m21595getXsmallD9Ej5fM(), bentoTheme.getSpacing(composer2, 6).m21593getSmallD9Ej5fM(), bentoTheme.getSpacing(composer2, 6).m21593getSmallD9Ej5fM(), bentoTheme.getSpacing(composer2, 6).m21593getSmallD9Ej5fM(), bentoTheme.getSpacing(composer2, 6).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composer2, 6).m21593getSmallD9Ej5fM(), bentoTheme.getSpacing(composer2, 6).m21595getXsmallD9Ej5fM(), null));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer2.endReplaceGroup();
                return notificationCardStyle;
            }

            @Override // com.robinhood.compose.theme.style.CardStackStyle
            @JvmName
            public NotificationEndCardStyle getNotificationEndCardStyle(Composer composer2, int i2) {
                long nova;
                composer2.startReplaceGroup(1799493999);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1799493999, i2, -1, "com.robinhood.compose.bento.theme.BentoCardStackDefaults.<get-style>.<no name provided>.<get-notificationEndCardStyle> (BentoCardStackDefaults.kt:49)");
                }
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                NotificationEndCardStyle.Padding padding = new NotificationEndCardStyle.Padding(bentoTheme.getSpacing(composer2, 6).m21591getLargeD9Ej5fM(), bentoTheme.getSpacing(composer2, 6).m21593getSmallD9Ej5fM(), null);
                long jM21368getAccent0d7_KjU = bentoTheme.getColors(composer2, 6).m21368getAccent0d7_KjU();
                long jM6732compositeOverOWjLjI = Color2.m6732compositeOverOWjLjI(Color.m6705copywmQWz5c$default(bentoTheme.getColors(composer2, 6).m21368getAccent0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), bentoTheme.getColors(composer2, 6).m21371getBg0d7_KjU());
                long jM21373getBg30d7_KjU = bentoTheme.getColors(composer2, 6).m21373getBg30d7_KjU();
                if (Color2.m6734luminance8_81llA(bentoTheme.getColors(composer2, 6).m21368getAccent0d7_KjU()) > 0.5f) {
                    composer2.startReplaceGroup(-1055169274);
                    nova = bentoTheme.getColors(composer2, 6).getJet();
                    composer2.endReplaceGroup();
                } else {
                    composer2.startReplaceGroup(-1055086907);
                    nova = bentoTheme.getColors(composer2, 6).getNova();
                    composer2.endReplaceGroup();
                }
                NotificationEndCardStyle notificationEndCardStyle = new NotificationEndCardStyle(padding, new NotificationEndCardStyle.Colors(jM21368getAccent0d7_KjU, jM6732compositeOverOWjLjI, jM21373getBg30d7_KjU, nova, null), bentoTheme.getTypography(composer2, 6).getTextM());
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer2.endReplaceGroup();
                return notificationEndCardStyle;
            }
        };
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return cardStackStyle;
    }
}
