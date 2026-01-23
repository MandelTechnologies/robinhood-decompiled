package com.robinhood.compose.bento.component.text;

import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.TextUnit;
import androidx.compose.p011ui.unit.TextUnit2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BentoMarkdownText.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JA\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/text/BentoMarkdownDefaults;", "", "<init>", "()V", ResourceTypes.STYLE, "Lcom/robinhood/android/markdown/compose/MarkdownStyle;", "getStyle", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/android/markdown/compose/MarkdownStyle;", "withTextStyles", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "textAlign", "Landroidx/compose/ui/text/style/TextAlign;", "textColor", "Landroidx/compose/ui/graphics/Color;", "linkColor", "appendHeaderNewLine", "", "withTextStyles-Yhh7B2I", "(Landroidx/compose/ui/text/TextStyle;IJJZLandroidx/compose/runtime/Composer;II)Lcom/robinhood/android/markdown/compose/MarkdownStyle;", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.bento.component.text.BentoMarkdownDefaults, reason: use source file name */
/* loaded from: classes20.dex */
public final class BentoMarkdownText {
    public static final int $stable = 0;
    public static final BentoMarkdownText INSTANCE = new BentoMarkdownText();

    private BentoMarkdownText() {
    }

    @JvmName
    public final MarkdownStyle getStyle(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(494469405, i, -1, "com.robinhood.compose.bento.component.text.BentoMarkdownDefaults.<get-style> (BentoMarkdownText.kt:118)");
        }
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        MarkdownStyle.BlockQuote blockQuote = new MarkdownStyle.BlockQuote(bentoTheme.getColors(composer, 6).m21373getBg30d7_KjU(), null);
        MarkdownStyle.List list = new MarkdownStyle.List(C2002Dp.m7995constructorimpl(0), C2002Dp.m7995constructorimpl(24), null);
        MarkdownStyle.BulletList bulletList = new MarkdownStyle.BulletList((char) 8226, (char) 9702, (char) 9642, null, 8, null);
        MarkdownStyle.Code code = new MarkdownStyle.Code(bentoTheme.getColors(composer, 6).m21372getBg20d7_KjU(), TextStyle.m7655copyp1EtxEg$default(bentoTheme.getTypography(composer, 6).getTextM(), 0L, 0L, null, null, null, FontFamily.INSTANCE.getMonospace(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777183, null), null);
        TextStyle textM = bentoTheme.getTypography(composer, 6).getTextM();
        MarkdownStyle.Heading heading = new MarkdownStyle.Heading(bentoTheme.getTypography(composer, 6).getDisplayCapsuleLarge(), bentoTheme.getTypography(composer, 6).getDisplayCapsuleMedium(), bentoTheme.getTypography(composer, 6).getDisplayCapsuleSmall(), TextStyle.m7655copyp1EtxEg$default(bentoTheme.getTypography(composer, 6).getTextM(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), bentoTheme.getTypography(composer, 6).getTextM(), bentoTheme.getTypography(composer, 6).getTextM(), true);
        MarkdownStyle.Link link = new MarkdownStyle.Link(bentoTheme.getColors(composer, 6).m21368getAccent0d7_KjU(), false, false, 2, null);
        long jM21425getFg0d7_KjU = bentoTheme.getColors(composer, 6).m21425getFg0d7_KjU();
        long jM21373getBg30d7_KjU = bentoTheme.getColors(composer, 6).m21373getBg30d7_KjU();
        float fM7995constructorimpl = C2002Dp.m7995constructorimpl(4);
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        TextStyle textM2 = bentoTheme.getTypography(composer, 6).getTextM();
        MarkdownStyle markdownStyle = new MarkdownStyle(blockQuote, list, bulletList, code, textM, heading, link, jM21425getFg0d7_KjU, new MarkdownStyle.ThematicBreak(jM21373getBg30d7_KjU, fM7995constructorimpl, density.mo5011toDpGaN1DYA(TextUnit2.getSp(TextUnit.m8074getValueimpl(textM2.m7662getFontSizeXSAIIZE()) * TextUnit.m8074getValueimpl(textM2.m7668getLineHeightXSAIIZE()))), null), TextAlign.INSTANCE.m7924getStarte0LSkKk(), null, 1024, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return markdownStyle;
    }

    /* renamed from: withTextStyles-Yhh7B2I, reason: not valid java name */
    public final MarkdownStyle m21100withTextStylesYhh7B2I(TextStyle textStyle, int i, long j, long j2, boolean z, Composer composer, int i2, int i3) {
        composer.startReplaceGroup(-94391347);
        TextStyle defaultTextStyle = (i3 & 1) != 0 ? getStyle(composer, (i2 >> 15) & 14).getDefaultTextStyle() : textStyle;
        int iM16264getTextAligne0LSkKk = (i3 & 2) != 0 ? getStyle(composer, (i2 >> 15) & 14).m16264getTextAligne0LSkKk() : i;
        long jM16265getTextColor0d7_KjU = (i3 & 4) != 0 ? getStyle(composer, (i2 >> 15) & 14).m16265getTextColor0d7_KjU() : j;
        long jM16277getColor0d7_KjU = (i3 & 8) != 0 ? getStyle(composer, (i2 >> 15) & 14).getLink().m16277getColor0d7_KjU() : j2;
        boolean appendNewLine = (i3 & 16) != 0 ? getStyle(composer, (i2 >> 15) & 14).getHeading().getAppendNewLine() : z;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-94391347, i2, -1, "com.robinhood.compose.bento.component.text.BentoMarkdownDefaults.withTextStyles (BentoMarkdownText.kt:169)");
        }
        int i4 = (i2 >> 15) & 14;
        MarkdownStyle markdownStyleM16260copyR0sFphs$default = MarkdownStyle.m16260copyR0sFphs$default(getStyle(composer, i4), null, null, null, MarkdownStyle.Code.m16270copyDxMtmZc$default(getStyle(composer, i4).getCode(), 0L, TextStyle.m7655copyp1EtxEg$default(defaultTextStyle, 0L, 0L, null, null, null, FontFamily.INSTANCE.getMonospace(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777183, null), 1, null), defaultTextStyle, MarkdownStyle.Heading.copy$default(getStyle(composer, i4).getHeading(), null, null, null, null, null, null, appendNewLine, 63, null), MarkdownStyle.Link.m16274copyek8zF_U$default(getStyle(composer, i4).getLink(), jM16277getColor0d7_KjU, false, false, 6, null), jM16265getTextColor0d7_KjU, null, iM16264getTextAligne0LSkKk, null, 1287, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return markdownStyleM16260copyR0sFphs$default;
    }
}
