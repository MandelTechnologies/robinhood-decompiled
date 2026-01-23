package com.robinhood.compose.bento.component.text;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.DrawModifierKt;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.TextUnit;
import androidx.compose.p011ui.unit.TextUnit2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import com.robinhood.utils.extensions.ResourceTypes;
import com.singular.sdk.internal.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AutoSizeText.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\u001a\u0099\u0001\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00040\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0099\u0001\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u001f2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00040\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u001d\u0010 \u001a\u009b\u0001\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00040\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010!\u001a\u00020\u00012\b\b\u0002\u0010\u001c\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\"\u0010#\u001a\u009b\u0001\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u001f2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00040\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010!\u001a\u00020\u00012\b\b\u0002\u0010\u001c\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\"\u0010$\u001a\u001f\u0010%\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020\u001bH\u0002¢\u0006\u0004\b(\u0010)\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006*²\u0006\n\u0010+\u001a\u00020\u0019X\u008a\u008e\u0002²\u0006\n\u0010,\u001a\u00020-X\u008a\u008e\u0002²\u0006\n\u0010.\u001a\u00020\bX\u008a\u008e\u0002²\u0006\n\u0010+\u001a\u00020\u0019X\u008a\u008e\u0002²\u0006\n\u0010,\u001a\u00020-X\u008a\u008e\u0002²\u0006\n\u0010.\u001a\u00020\u001fX\u008a\u008e\u0002"}, m3636d2 = {"defaultMinFontSizePercent", "", "defaultStepDownRate", "AutoSizeText", "", "modifier", "Landroidx/compose/ui/Modifier;", "text", "", ResourceTypes.COLOR, "Landroidx/compose/ui/graphics/Color;", "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "textDecoration", "Landroidx/compose/ui/text/style/TextDecoration;", "textAlign", "Landroidx/compose/ui/text/style/TextAlign;", "maxLines", "", "onTextLayout", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", ResourceTypes.STYLE, "Landroidx/compose/ui/text/TextStyle;", "minFontSize", "Landroidx/compose/ui/unit/TextUnit;", "stepDownRate", "AutoSizeText-6BoG94g", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;ILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;JFLandroidx/compose/runtime/Composer;III)V", "Landroidx/compose/ui/text/AnnotatedString;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;ILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;JFLandroidx/compose/runtime/Composer;III)V", "minFontSizePercent", "AutoSizeText-G_RxxvU", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;ILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;FFLandroidx/compose/runtime/Composer;III)V", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;ILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;FFLandroidx/compose/runtime/Composer;III)V", AnalyticsStrings.MAX_WELCOME_TAG, Constants.RequestParamsKeys.DEVELOPER_API_KEY, "b", "max-NB67dxo", "(JJ)J", "lib-compose-bento_externalRelease", "textStyle", "textSizeFinalized", "", "rememberedText"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.bento.component.text.AutoSizeTextKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class AutoSizeText {
    private static final float defaultMinFontSizePercent = 0.85f;
    private static final float defaultStepDownRate = 0.5f;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AutoSizeText_6BoG94g$lambda$15(Modifier modifier, String str, Color color, FontStyle fontStyle, FontWeight fontWeight, TextDecoration textDecoration, TextAlign textAlign, int i, Function1 function1, TextStyle textStyle, long j, float f, int i2, int i3, int i4, Composer composer, int i5) {
        m21096AutoSizeText6BoG94g(modifier, str, color, fontStyle, fontWeight, textDecoration, textAlign, i, (Function1<? super TextLayoutResult, Unit>) function1, textStyle, j, f, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), RecomposeScopeImpl4.updateChangedFlags(i3), i4);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AutoSizeText_6BoG94g$lambda$31(Modifier modifier, AnnotatedString annotatedString, Color color, FontStyle fontStyle, FontWeight fontWeight, TextDecoration textDecoration, TextAlign textAlign, int i, Function1 function1, TextStyle textStyle, long j, float f, int i2, int i3, int i4, Composer composer, int i5) {
        m21095AutoSizeText6BoG94g(modifier, annotatedString, color, fontStyle, fontWeight, textDecoration, textAlign, i, (Function1<? super TextLayoutResult, Unit>) function1, textStyle, j, f, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), RecomposeScopeImpl4.updateChangedFlags(i3), i4);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AutoSizeText_G_RxxvU$lambda$34(Modifier modifier, String str, Color color, FontStyle fontStyle, FontWeight fontWeight, TextDecoration textDecoration, TextAlign textAlign, int i, Function1 function1, TextStyle textStyle, float f, float f2, int i2, int i3, int i4, Composer composer, int i5) {
        m21098AutoSizeTextG_RxxvU(modifier, str, color, fontStyle, fontWeight, textDecoration, textAlign, i, (Function1<? super TextLayoutResult, Unit>) function1, textStyle, f, f2, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), RecomposeScopeImpl4.updateChangedFlags(i3), i4);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AutoSizeText_G_RxxvU$lambda$37(Modifier modifier, AnnotatedString annotatedString, Color color, FontStyle fontStyle, FontWeight fontWeight, TextDecoration textDecoration, TextAlign textAlign, int i, Function1 function1, TextStyle textStyle, float f, float f2, int i2, int i3, int i4, Composer composer, int i5) {
        m21097AutoSizeTextG_RxxvU(modifier, annotatedString, color, fontStyle, fontWeight, textDecoration, textAlign, i, (Function1<? super TextLayoutResult, Unit>) function1, textStyle, f, f2, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), RecomposeScopeImpl4.updateChangedFlags(i3), i4);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AutoSizeText_6BoG94g$lambda$1$lambda$0(TextLayoutResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:226:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011e  */
    /* renamed from: AutoSizeText-6BoG94g, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m21096AutoSizeText6BoG94g(Modifier modifier, final String text, Color color, FontStyle fontStyle, FontWeight fontWeight, TextDecoration textDecoration, TextAlign textAlign, int i, Function1<? super TextLayoutResult, Unit> function1, TextStyle textStyle, final long j, float f, Composer composer, final int i2, final int i3, final int i4) {
        Modifier modifier2;
        int i5;
        Color color2;
        int i6;
        FontStyle fontStyle2;
        int i7;
        FontWeight fontWeight2;
        int i8;
        TextDecoration textDecoration2;
        int i9;
        TextAlign textAlign2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        Modifier modifier3;
        Function1<? super TextLayoutResult, Unit> function12;
        TextStyle style;
        TextAlign textAlign3;
        TextDecoration textDecoration3;
        int i18;
        TextStyle textStyle2;
        int i19;
        float f2;
        Color color3;
        Object objRememberedValue;
        Composer.Companion companion;
        int i20;
        final SnapshotState snapshotState;
        Object objRememberedValue2;
        Color color4;
        int i21;
        final SnapshotState snapshotState2;
        Object objRememberedValue3;
        SnapshotState snapshotState3;
        Object objRememberedValue4;
        final float f3;
        boolean z;
        Object objRememberedValue5;
        Function1<? super TextLayoutResult, Unit> function13;
        final TextAlign textAlign4;
        final int i22;
        final Function1<? super TextLayoutResult, Unit> function14;
        final float f4;
        final TextStyle textStyle3;
        final Modifier modifier4;
        final TextDecoration textDecoration4;
        final FontWeight fontWeight3;
        final FontStyle fontStyle3;
        final Color color5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer composerStartRestartGroup = composer.startRestartGroup(-199600015);
        int i23 = i4 & 1;
        if (i23 != 0) {
            i5 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i5 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerStartRestartGroup.changed(text) ? 32 : 16;
        }
        int i24 = i4 & 4;
        if (i24 != 0) {
            i5 |= 384;
        } else {
            if ((i2 & 384) == 0) {
                color2 = color;
                i5 |= composerStartRestartGroup.changed(color2) ? 256 : 128;
            }
            i6 = i4 & 8;
            if (i6 == 0) {
                i5 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    fontStyle2 = fontStyle;
                    i5 |= composerStartRestartGroup.changed(fontStyle2) ? 2048 : 1024;
                }
                i7 = i4 & 16;
                if (i7 != 0) {
                    i5 |= 24576;
                } else {
                    if ((i2 & 24576) == 0) {
                        fontWeight2 = fontWeight;
                        i5 |= composerStartRestartGroup.changed(fontWeight2) ? 16384 : 8192;
                    }
                    i8 = i4 & 32;
                    if (i8 == 0) {
                        i5 |= 196608;
                        textDecoration2 = textDecoration;
                    } else {
                        textDecoration2 = textDecoration;
                        if ((i2 & 196608) == 0) {
                            i5 |= composerStartRestartGroup.changed(textDecoration2) ? 131072 : 65536;
                        }
                    }
                    i9 = i4 & 64;
                    if (i9 == 0) {
                        i5 |= 1572864;
                        textAlign2 = textAlign;
                    } else {
                        textAlign2 = textAlign;
                        if ((i2 & 1572864) == 0) {
                            i5 |= composerStartRestartGroup.changed(textAlign2) ? 1048576 : 524288;
                        }
                    }
                    i10 = i4 & 128;
                    if (i10 == 0) {
                        i5 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        i5 |= composerStartRestartGroup.changed(i) ? 8388608 : 4194304;
                    }
                    i11 = i4 & 256;
                    if (i11 != 0) {
                        if ((i2 & 100663296) == 0) {
                            i12 = i11;
                            i5 |= composerStartRestartGroup.changedInstance(function1) ? 67108864 : 33554432;
                        }
                        if ((i2 & 805306368) == 0) {
                            i5 |= ((i4 & 512) == 0 && composerStartRestartGroup.changed(textStyle)) ? 536870912 : 268435456;
                        }
                        if ((i4 & 1024) != 0) {
                            i14 = i3 | 6;
                            i13 = i23;
                        } else if ((i3 & 6) == 0) {
                            i13 = i23;
                            i14 = i3 | (composerStartRestartGroup.changed(j) ? 4 : 2);
                        } else {
                            i13 = i23;
                            i14 = i3;
                        }
                        i15 = i13;
                        i16 = i4 & 2048;
                        if (i16 != 0) {
                            i14 |= 48;
                            i17 = i16;
                        } else if ((i3 & 48) == 0) {
                            i17 = i16;
                            i14 |= composerStartRestartGroup.changed(f) ? 32 : 16;
                        } else {
                            i17 = i16;
                        }
                        int i25 = i14;
                        if ((i5 & 306783379) == 306783378 && (i25 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            i22 = i;
                            function14 = function1;
                            f4 = f;
                            modifier4 = modifier2;
                            textDecoration4 = textDecoration2;
                            color5 = color2;
                            fontStyle3 = fontStyle2;
                            textAlign4 = textAlign2;
                            fontWeight3 = fontWeight2;
                            textStyle3 = textStyle;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                modifier3 = i15 == 0 ? Modifier.INSTANCE : modifier2;
                                if (i24 != 0) {
                                    color2 = null;
                                }
                                if (i6 != 0) {
                                    fontStyle2 = null;
                                }
                                if (i7 != 0) {
                                    fontWeight2 = null;
                                }
                                if (i8 != 0) {
                                    textDecoration2 = null;
                                }
                                if (i9 != 0) {
                                    textAlign2 = null;
                                }
                                int i26 = i10 == 0 ? 1 : i;
                                if (i12 == 0) {
                                    composerStartRestartGroup.startReplaceGroup(1849434622);
                                    Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue6 = new Function1() { // from class: com.robinhood.compose.bento.component.text.AutoSizeTextKt$$ExternalSyntheticLambda2
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return AutoSizeText.AutoSizeText_6BoG94g$lambda$1$lambda$0((TextLayoutResult) obj);
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                                    }
                                    function12 = (Function1) objRememberedValue6;
                                    composerStartRestartGroup.endReplaceGroup();
                                } else {
                                    function12 = function1;
                                }
                                if ((i4 & 512) == 0) {
                                    style = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getText(composerStartRestartGroup, 0).getStyle();
                                    i5 &= -1879048193;
                                } else {
                                    style = textStyle;
                                }
                                if (i17 == 0) {
                                    f2 = 0.5f;
                                    int i27 = i26;
                                    textAlign3 = textAlign2;
                                    textDecoration3 = textDecoration2;
                                    i18 = i5;
                                    textStyle2 = style;
                                    i19 = i27;
                                } else {
                                    int i28 = i26;
                                    textAlign3 = textAlign2;
                                    textDecoration3 = textDecoration2;
                                    i18 = i5;
                                    textStyle2 = style;
                                    i19 = i28;
                                    f2 = f;
                                }
                                color3 = color2;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i4 & 512) != 0) {
                                    i5 &= -1879048193;
                                }
                                i19 = i;
                                f2 = f;
                                textAlign3 = textAlign2;
                                modifier3 = modifier2;
                                textDecoration3 = textDecoration2;
                                color3 = color2;
                                function12 = function1;
                                i18 = i5;
                                textStyle2 = textStyle;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-199600015, i18, i25, "com.robinhood.compose.bento.component.text.AutoSizeText (AutoSizeText.kt:39)");
                            }
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue != companion.getEmpty()) {
                                i20 = i25;
                                objRememberedValue = SnapshotState3.mutableStateOf$default(textStyle2, null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                i20 = i25;
                            }
                            snapshotState = (SnapshotState) objRememberedValue;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 != companion.getEmpty()) {
                                color4 = color3;
                                i21 = 2;
                                objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                color4 = color3;
                                i21 = 2;
                            }
                            snapshotState2 = (SnapshotState) objRememberedValue2;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            TextDecoration textDecoration5 = textDecoration3;
                            if (objRememberedValue3 == companion.getEmpty()) {
                                objRememberedValue3 = SnapshotState3.mutableStateOf$default(text, null, i21, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            snapshotState3 = (SnapshotState) objRememberedValue3;
                            composerStartRestartGroup.endReplaceGroup();
                            if (Intrinsics.areEqual(AutoSizeText_6BoG94g$lambda$9(snapshotState3), text)) {
                                snapshotState3.setValue(text);
                                AutoSizeText_6BoG94g$lambda$7(snapshotState2, false);
                                snapshotState.setValue(textStyle2);
                            }
                            composerStartRestartGroup.startReplaceGroup(5004770);
                            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue4 == companion.getEmpty()) {
                                objRememberedValue4 = new Function1() { // from class: com.robinhood.compose.bento.component.text.AutoSizeTextKt$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return AutoSizeText.AutoSizeText_6BoG94g$lambda$12$lambda$11(snapshotState2, (ContentDrawScope) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier modifierDrawWithContent = DrawModifierKt.drawWithContent(modifier3, (Function1) objRememberedValue4);
                            int iM7959getEllipsisgIe3tQ8 = TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8();
                            f3 = f2;
                            TextStyle textStyleAutoSizeText_6BoG94g$lambda$3 = AutoSizeText_6BoG94g$lambda$3(snapshotState);
                            composerStartRestartGroup.startReplaceGroup(-1224400529);
                            z = ((i20 & 14) != 4) | ((i20 & 112) != 32) | ((234881024 & i18) != 67108864);
                            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                            if (!z || objRememberedValue5 == companion.getEmpty()) {
                                final Function1<? super TextLayoutResult, Unit> function15 = function12;
                                objRememberedValue5 = new Function1() { // from class: com.robinhood.compose.bento.component.text.AutoSizeTextKt$$ExternalSyntheticLambda4
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return AutoSizeText.AutoSizeText_6BoG94g$lambda$14$lambda$13(j, f3, function15, snapshotState2, snapshotState, (TextLayoutResult) obj);
                                    }
                                };
                                function13 = function15;
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                            } else {
                                function13 = function12;
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            TextStyle textStyle4 = textStyle2;
                            FontWeight fontWeight4 = fontWeight2;
                            Modifier modifier5 = modifier3;
                            FontStyle fontStyle4 = fontStyle2;
                            Color color6 = color4;
                            BentoText2.m20747BentoText38GnDrw(text, modifierDrawWithContent, color6, fontStyle4, fontWeight4, textDecoration5, textAlign3, iM7959getEllipsisgIe3tQ8, false, i19, 0, (Function1) objRememberedValue5, 0, textStyleAutoSizeText_6BoG94g$lambda$3, composerStartRestartGroup, ((i18 >> 3) & 14) | 12582912 | (i18 & 896) | (i18 & 7168) | (57344 & i18) | (458752 & i18) | (3670016 & i18) | (1879048192 & (i18 << 6)), 0, 5376);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            textAlign4 = textAlign3;
                            i22 = i19;
                            function14 = function13;
                            f4 = f3;
                            textStyle3 = textStyle4;
                            modifier4 = modifier5;
                            textDecoration4 = textDecoration5;
                            fontWeight3 = fontWeight4;
                            fontStyle3 = fontStyle4;
                            color5 = color6;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.text.AutoSizeTextKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return AutoSizeText.AutoSizeText_6BoG94g$lambda$15(modifier4, text, color5, fontStyle3, fontWeight3, textDecoration4, textAlign4, i22, function14, textStyle3, j, f4, i2, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i5 |= 100663296;
                    i12 = i11;
                    if ((i2 & 805306368) == 0) {
                    }
                    if ((i4 & 1024) != 0) {
                    }
                    i15 = i13;
                    i16 = i4 & 2048;
                    if (i16 != 0) {
                    }
                    int i252 = i14;
                    if ((i5 & 306783379) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i2 & 1) != 0) {
                            if (i15 == 0) {
                            }
                            if (i24 != 0) {
                            }
                            if (i6 != 0) {
                            }
                            if (i7 != 0) {
                            }
                            if (i8 != 0) {
                            }
                            if (i9 != 0) {
                            }
                            if (i10 == 0) {
                            }
                            if (i12 == 0) {
                            }
                            if ((i4 & 512) == 0) {
                            }
                            if (i17 == 0) {
                            }
                            color3 = color2;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue != companion.getEmpty()) {
                            }
                            snapshotState = (SnapshotState) objRememberedValue;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 != companion.getEmpty()) {
                            }
                            snapshotState2 = (SnapshotState) objRememberedValue2;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            TextDecoration textDecoration52 = textDecoration3;
                            if (objRememberedValue3 == companion.getEmpty()) {
                            }
                            snapshotState3 = (SnapshotState) objRememberedValue3;
                            composerStartRestartGroup.endReplaceGroup();
                            if (Intrinsics.areEqual(AutoSizeText_6BoG94g$lambda$9(snapshotState3), text)) {
                            }
                            composerStartRestartGroup.startReplaceGroup(5004770);
                            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue4 == companion.getEmpty()) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier modifierDrawWithContent2 = DrawModifierKt.drawWithContent(modifier3, (Function1) objRememberedValue4);
                            int iM7959getEllipsisgIe3tQ82 = TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8();
                            f3 = f2;
                            TextStyle textStyleAutoSizeText_6BoG94g$lambda$32 = AutoSizeText_6BoG94g$lambda$3(snapshotState);
                            composerStartRestartGroup.startReplaceGroup(-1224400529);
                            z = ((i20 & 14) != 4) | ((i20 & 112) != 32) | ((234881024 & i18) != 67108864);
                            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                            if (z) {
                                final Function1 function152 = function12;
                                objRememberedValue5 = new Function1() { // from class: com.robinhood.compose.bento.component.text.AutoSizeTextKt$$ExternalSyntheticLambda4
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return AutoSizeText.AutoSizeText_6BoG94g$lambda$14$lambda$13(j, f3, function152, snapshotState2, snapshotState, (TextLayoutResult) obj);
                                    }
                                };
                                function13 = function152;
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                composerStartRestartGroup.endReplaceGroup();
                                TextStyle textStyle42 = textStyle2;
                                FontWeight fontWeight42 = fontWeight2;
                                Modifier modifier52 = modifier3;
                                FontStyle fontStyle42 = fontStyle2;
                                Color color62 = color4;
                                BentoText2.m20747BentoText38GnDrw(text, modifierDrawWithContent2, color62, fontStyle42, fontWeight42, textDecoration52, textAlign3, iM7959getEllipsisgIe3tQ82, false, i19, 0, (Function1) objRememberedValue5, 0, textStyleAutoSizeText_6BoG94g$lambda$32, composerStartRestartGroup, ((i18 >> 3) & 14) | 12582912 | (i18 & 896) | (i18 & 7168) | (57344 & i18) | (458752 & i18) | (3670016 & i18) | (1879048192 & (i18 << 6)), 0, 5376);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                textAlign4 = textAlign3;
                                i22 = i19;
                                function14 = function13;
                                f4 = f3;
                                textStyle3 = textStyle42;
                                modifier4 = modifier52;
                                textDecoration4 = textDecoration52;
                                fontWeight3 = fontWeight42;
                                fontStyle3 = fontStyle42;
                                color5 = color62;
                            }
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                fontWeight2 = fontWeight;
                i8 = i4 & 32;
                if (i8 == 0) {
                }
                i9 = i4 & 64;
                if (i9 == 0) {
                }
                i10 = i4 & 128;
                if (i10 == 0) {
                }
                i11 = i4 & 256;
                if (i11 != 0) {
                }
                i12 = i11;
                if ((i2 & 805306368) == 0) {
                }
                if ((i4 & 1024) != 0) {
                }
                i15 = i13;
                i16 = i4 & 2048;
                if (i16 != 0) {
                }
                int i2522 = i14;
                if ((i5 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            fontStyle2 = fontStyle;
            i7 = i4 & 16;
            if (i7 != 0) {
            }
            fontWeight2 = fontWeight;
            i8 = i4 & 32;
            if (i8 == 0) {
            }
            i9 = i4 & 64;
            if (i9 == 0) {
            }
            i10 = i4 & 128;
            if (i10 == 0) {
            }
            i11 = i4 & 256;
            if (i11 != 0) {
            }
            i12 = i11;
            if ((i2 & 805306368) == 0) {
            }
            if ((i4 & 1024) != 0) {
            }
            i15 = i13;
            i16 = i4 & 2048;
            if (i16 != 0) {
            }
            int i25222 = i14;
            if ((i5 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        color2 = color;
        i6 = i4 & 8;
        if (i6 == 0) {
        }
        fontStyle2 = fontStyle;
        i7 = i4 & 16;
        if (i7 != 0) {
        }
        fontWeight2 = fontWeight;
        i8 = i4 & 32;
        if (i8 == 0) {
        }
        i9 = i4 & 64;
        if (i9 == 0) {
        }
        i10 = i4 & 128;
        if (i10 == 0) {
        }
        i11 = i4 & 256;
        if (i11 != 0) {
        }
        i12 = i11;
        if ((i2 & 805306368) == 0) {
        }
        if ((i4 & 1024) != 0) {
        }
        i15 = i13;
        i16 = i4 & 2048;
        if (i16 != 0) {
        }
        int i252222 = i14;
        if ((i5 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    private static final void AutoSizeText_6BoG94g$lambda$7(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AutoSizeText_6BoG94g$lambda$12$lambda$11(SnapshotState snapshotState, ContentDrawScope drawWithContent) {
        Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
        if (AutoSizeText_6BoG94g$lambda$6(snapshotState)) {
            drawWithContent.drawContent();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit AutoSizeText_6BoG94g$lambda$14$lambda$13(long j, float f, Function1 function1, SnapshotState snapshotState, SnapshotState snapshotState2, TextLayoutResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (!AutoSizeText_6BoG94g$lambda$6(snapshotState) && result.getHasVisualOverflow()) {
            long jM7662getFontSizeXSAIIZE = AutoSizeText_6BoG94g$lambda$3(snapshotState2).m7662getFontSizeXSAIIZE();
            TextUnit2.m8083checkArithmeticNB67dxo(jM7662getFontSizeXSAIIZE, j);
            if (Float.compare(TextUnit.m8074getValueimpl(jM7662getFontSizeXSAIIZE), TextUnit.m8074getValueimpl(j)) > 0) {
                long jM7662getFontSizeXSAIIZE2 = AutoSizeText_6BoG94g$lambda$3(snapshotState2).m7662getFontSizeXSAIIZE();
                TextUnit2.m8082checkArithmeticR2X_6o(jM7662getFontSizeXSAIIZE2);
                snapshotState2.setValue(TextStyle.m7655copyp1EtxEg$default(AutoSizeText_6BoG94g$lambda$3(snapshotState2), 0L, m21099maxNB67dxo(TextUnit2.pack(TextUnit.m8072getRawTypeimpl(jM7662getFontSizeXSAIIZE2), TextUnit.m8074getValueimpl(jM7662getFontSizeXSAIIZE2) * (1 - f)), j), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777213, null));
            }
        } else {
            AutoSizeText_6BoG94g$lambda$7(snapshotState, true);
        }
        function1.invoke(result);
        return Unit.INSTANCE;
    }

    private static final TextStyle AutoSizeText_6BoG94g$lambda$19(SnapshotState<TextStyle> snapshotState) {
        return snapshotState.getValue();
    }

    private static final boolean AutoSizeText_6BoG94g$lambda$22(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final AnnotatedString AutoSizeText_6BoG94g$lambda$25(SnapshotState<AnnotatedString> snapshotState) {
        return snapshotState.getValue();
    }

    private static final TextStyle AutoSizeText_6BoG94g$lambda$3(SnapshotState<TextStyle> snapshotState) {
        return snapshotState.getValue();
    }

    private static final boolean AutoSizeText_6BoG94g$lambda$6(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final String AutoSizeText_6BoG94g$lambda$9(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AutoSizeText_6BoG94g$lambda$17$lambda$16(TextLayoutResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:226:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011e  */
    /* renamed from: AutoSizeText-6BoG94g, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m21095AutoSizeText6BoG94g(Modifier modifier, final AnnotatedString text, Color color, FontStyle fontStyle, FontWeight fontWeight, TextDecoration textDecoration, TextAlign textAlign, int i, Function1<? super TextLayoutResult, Unit> function1, TextStyle textStyle, final long j, float f, Composer composer, final int i2, final int i3, final int i4) {
        Modifier modifier2;
        int i5;
        Color color2;
        int i6;
        FontStyle fontStyle2;
        int i7;
        FontWeight fontWeight2;
        int i8;
        TextDecoration textDecoration2;
        int i9;
        TextAlign textAlign2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        Modifier modifier3;
        Function1<? super TextLayoutResult, Unit> function12;
        TextStyle style;
        TextAlign textAlign3;
        TextDecoration textDecoration3;
        int i18;
        TextStyle textStyle2;
        int i19;
        float f2;
        Color color3;
        Object objRememberedValue;
        Composer.Companion companion;
        int i20;
        final SnapshotState snapshotState;
        Object objRememberedValue2;
        Color color4;
        int i21;
        final SnapshotState snapshotState2;
        Object objRememberedValue3;
        SnapshotState snapshotState3;
        Object objRememberedValue4;
        final float f3;
        boolean z;
        Object objRememberedValue5;
        Function1<? super TextLayoutResult, Unit> function13;
        final TextAlign textAlign4;
        final int i22;
        final Function1<? super TextLayoutResult, Unit> function14;
        final float f4;
        final TextStyle textStyle3;
        final Modifier modifier4;
        final TextDecoration textDecoration4;
        final FontWeight fontWeight3;
        final FontStyle fontStyle3;
        final Color color5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer composerStartRestartGroup = composer.startRestartGroup(-393200391);
        int i23 = i4 & 1;
        if (i23 != 0) {
            i5 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i5 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerStartRestartGroup.changed(text) ? 32 : 16;
        }
        int i24 = i4 & 4;
        if (i24 != 0) {
            i5 |= 384;
        } else {
            if ((i2 & 384) == 0) {
                color2 = color;
                i5 |= composerStartRestartGroup.changed(color2) ? 256 : 128;
            }
            i6 = i4 & 8;
            if (i6 == 0) {
                i5 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    fontStyle2 = fontStyle;
                    i5 |= composerStartRestartGroup.changed(fontStyle2) ? 2048 : 1024;
                }
                i7 = i4 & 16;
                if (i7 != 0) {
                    i5 |= 24576;
                } else {
                    if ((i2 & 24576) == 0) {
                        fontWeight2 = fontWeight;
                        i5 |= composerStartRestartGroup.changed(fontWeight2) ? 16384 : 8192;
                    }
                    i8 = i4 & 32;
                    if (i8 == 0) {
                        i5 |= 196608;
                        textDecoration2 = textDecoration;
                    } else {
                        textDecoration2 = textDecoration;
                        if ((i2 & 196608) == 0) {
                            i5 |= composerStartRestartGroup.changed(textDecoration2) ? 131072 : 65536;
                        }
                    }
                    i9 = i4 & 64;
                    if (i9 == 0) {
                        i5 |= 1572864;
                        textAlign2 = textAlign;
                    } else {
                        textAlign2 = textAlign;
                        if ((i2 & 1572864) == 0) {
                            i5 |= composerStartRestartGroup.changed(textAlign2) ? 1048576 : 524288;
                        }
                    }
                    i10 = i4 & 128;
                    if (i10 == 0) {
                        i5 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        i5 |= composerStartRestartGroup.changed(i) ? 8388608 : 4194304;
                    }
                    i11 = i4 & 256;
                    if (i11 != 0) {
                        if ((i2 & 100663296) == 0) {
                            i12 = i11;
                            i5 |= composerStartRestartGroup.changedInstance(function1) ? 67108864 : 33554432;
                        }
                        if ((i2 & 805306368) == 0) {
                            i5 |= ((i4 & 512) == 0 && composerStartRestartGroup.changed(textStyle)) ? 536870912 : 268435456;
                        }
                        if ((i4 & 1024) != 0) {
                            i14 = i3 | 6;
                            i13 = i23;
                        } else if ((i3 & 6) == 0) {
                            i13 = i23;
                            i14 = i3 | (composerStartRestartGroup.changed(j) ? 4 : 2);
                        } else {
                            i13 = i23;
                            i14 = i3;
                        }
                        i15 = i13;
                        i16 = i4 & 2048;
                        if (i16 != 0) {
                            i14 |= 48;
                            i17 = i16;
                        } else if ((i3 & 48) == 0) {
                            i17 = i16;
                            i14 |= composerStartRestartGroup.changed(f) ? 32 : 16;
                        } else {
                            i17 = i16;
                        }
                        int i25 = i14;
                        if ((i5 & 306783379) == 306783378 && (i25 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            i22 = i;
                            function14 = function1;
                            f4 = f;
                            modifier4 = modifier2;
                            textDecoration4 = textDecoration2;
                            color5 = color2;
                            fontStyle3 = fontStyle2;
                            textAlign4 = textAlign2;
                            fontWeight3 = fontWeight2;
                            textStyle3 = textStyle;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                modifier3 = i15 == 0 ? Modifier.INSTANCE : modifier2;
                                if (i24 != 0) {
                                    color2 = null;
                                }
                                if (i6 != 0) {
                                    fontStyle2 = null;
                                }
                                if (i7 != 0) {
                                    fontWeight2 = null;
                                }
                                if (i8 != 0) {
                                    textDecoration2 = null;
                                }
                                if (i9 != 0) {
                                    textAlign2 = null;
                                }
                                int i26 = i10 == 0 ? 1 : i;
                                if (i12 == 0) {
                                    composerStartRestartGroup.startReplaceGroup(1849434622);
                                    Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue6 = new Function1() { // from class: com.robinhood.compose.bento.component.text.AutoSizeTextKt$$ExternalSyntheticLambda6
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return AutoSizeText.AutoSizeText_6BoG94g$lambda$17$lambda$16((TextLayoutResult) obj);
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                                    }
                                    function12 = (Function1) objRememberedValue6;
                                    composerStartRestartGroup.endReplaceGroup();
                                } else {
                                    function12 = function1;
                                }
                                if ((i4 & 512) == 0) {
                                    style = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getText(composerStartRestartGroup, 0).getStyle();
                                    i5 &= -1879048193;
                                } else {
                                    style = textStyle;
                                }
                                if (i17 == 0) {
                                    f2 = 0.5f;
                                    int i27 = i26;
                                    textAlign3 = textAlign2;
                                    textDecoration3 = textDecoration2;
                                    i18 = i5;
                                    textStyle2 = style;
                                    i19 = i27;
                                } else {
                                    int i28 = i26;
                                    textAlign3 = textAlign2;
                                    textDecoration3 = textDecoration2;
                                    i18 = i5;
                                    textStyle2 = style;
                                    i19 = i28;
                                    f2 = f;
                                }
                                color3 = color2;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i4 & 512) != 0) {
                                    i5 &= -1879048193;
                                }
                                i19 = i;
                                f2 = f;
                                textAlign3 = textAlign2;
                                modifier3 = modifier2;
                                textDecoration3 = textDecoration2;
                                color3 = color2;
                                function12 = function1;
                                i18 = i5;
                                textStyle2 = textStyle;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-393200391, i18, i25, "com.robinhood.compose.bento.component.text.AutoSizeText (AutoSizeText.kt:94)");
                            }
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue != companion.getEmpty()) {
                                i20 = i25;
                                objRememberedValue = SnapshotState3.mutableStateOf$default(textStyle2, null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                i20 = i25;
                            }
                            snapshotState = (SnapshotState) objRememberedValue;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 != companion.getEmpty()) {
                                color4 = color3;
                                i21 = 2;
                                objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                color4 = color3;
                                i21 = 2;
                            }
                            snapshotState2 = (SnapshotState) objRememberedValue2;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            TextDecoration textDecoration5 = textDecoration3;
                            if (objRememberedValue3 == companion.getEmpty()) {
                                objRememberedValue3 = SnapshotState3.mutableStateOf$default(text, null, i21, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            snapshotState3 = (SnapshotState) objRememberedValue3;
                            composerStartRestartGroup.endReplaceGroup();
                            if (Intrinsics.areEqual(AutoSizeText_6BoG94g$lambda$25(snapshotState3), text)) {
                                snapshotState3.setValue(text);
                                AutoSizeText_6BoG94g$lambda$23(snapshotState2, false);
                                snapshotState.setValue(textStyle2);
                            }
                            composerStartRestartGroup.startReplaceGroup(5004770);
                            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue4 == companion.getEmpty()) {
                                objRememberedValue4 = new Function1() { // from class: com.robinhood.compose.bento.component.text.AutoSizeTextKt$$ExternalSyntheticLambda7
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return AutoSizeText.AutoSizeText_6BoG94g$lambda$28$lambda$27(snapshotState2, (ContentDrawScope) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier modifierDrawWithContent = DrawModifierKt.drawWithContent(modifier3, (Function1) objRememberedValue4);
                            int iM7959getEllipsisgIe3tQ8 = TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8();
                            f3 = f2;
                            TextStyle textStyleAutoSizeText_6BoG94g$lambda$19 = AutoSizeText_6BoG94g$lambda$19(snapshotState);
                            composerStartRestartGroup.startReplaceGroup(-1224400529);
                            z = ((i20 & 14) != 4) | ((i20 & 112) != 32) | ((234881024 & i18) != 67108864);
                            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                            if (!z || objRememberedValue5 == companion.getEmpty()) {
                                final Function1<? super TextLayoutResult, Unit> function15 = function12;
                                objRememberedValue5 = new Function1() { // from class: com.robinhood.compose.bento.component.text.AutoSizeTextKt$$ExternalSyntheticLambda8
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return AutoSizeText.AutoSizeText_6BoG94g$lambda$30$lambda$29(j, f3, function15, snapshotState2, snapshotState, (TextLayoutResult) obj);
                                    }
                                };
                                function13 = function15;
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                            } else {
                                function13 = function12;
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            TextStyle textStyle4 = textStyle2;
                            FontWeight fontWeight4 = fontWeight2;
                            Modifier modifier5 = modifier3;
                            FontStyle fontStyle4 = fontStyle2;
                            Color color6 = color4;
                            BentoText2.m20748BentoTextQnj7Zds(text, modifierDrawWithContent, color6, fontStyle4, fontWeight4, textDecoration5, textAlign3, iM7959getEllipsisgIe3tQ8, false, i19, 0, null, (Function1) objRememberedValue5, textStyleAutoSizeText_6BoG94g$lambda$19, composerStartRestartGroup, ((i18 >> 3) & 14) | 12582912 | (i18 & 896) | (i18 & 7168) | (57344 & i18) | (458752 & i18) | (3670016 & i18) | (1879048192 & (i18 << 6)), 0, 3328);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            textAlign4 = textAlign3;
                            i22 = i19;
                            function14 = function13;
                            f4 = f3;
                            textStyle3 = textStyle4;
                            modifier4 = modifier5;
                            textDecoration4 = textDecoration5;
                            fontWeight3 = fontWeight4;
                            fontStyle3 = fontStyle4;
                            color5 = color6;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.text.AutoSizeTextKt$$ExternalSyntheticLambda9
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return AutoSizeText.AutoSizeText_6BoG94g$lambda$31(modifier4, text, color5, fontStyle3, fontWeight3, textDecoration4, textAlign4, i22, function14, textStyle3, j, f4, i2, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i5 |= 100663296;
                    i12 = i11;
                    if ((i2 & 805306368) == 0) {
                    }
                    if ((i4 & 1024) != 0) {
                    }
                    i15 = i13;
                    i16 = i4 & 2048;
                    if (i16 != 0) {
                    }
                    int i252 = i14;
                    if ((i5 & 306783379) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i2 & 1) != 0) {
                            if (i15 == 0) {
                            }
                            if (i24 != 0) {
                            }
                            if (i6 != 0) {
                            }
                            if (i7 != 0) {
                            }
                            if (i8 != 0) {
                            }
                            if (i9 != 0) {
                            }
                            if (i10 == 0) {
                            }
                            if (i12 == 0) {
                            }
                            if ((i4 & 512) == 0) {
                            }
                            if (i17 == 0) {
                            }
                            color3 = color2;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue != companion.getEmpty()) {
                            }
                            snapshotState = (SnapshotState) objRememberedValue;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 != companion.getEmpty()) {
                            }
                            snapshotState2 = (SnapshotState) objRememberedValue2;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            TextDecoration textDecoration52 = textDecoration3;
                            if (objRememberedValue3 == companion.getEmpty()) {
                            }
                            snapshotState3 = (SnapshotState) objRememberedValue3;
                            composerStartRestartGroup.endReplaceGroup();
                            if (Intrinsics.areEqual(AutoSizeText_6BoG94g$lambda$25(snapshotState3), text)) {
                            }
                            composerStartRestartGroup.startReplaceGroup(5004770);
                            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue4 == companion.getEmpty()) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier modifierDrawWithContent2 = DrawModifierKt.drawWithContent(modifier3, (Function1) objRememberedValue4);
                            int iM7959getEllipsisgIe3tQ82 = TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8();
                            f3 = f2;
                            TextStyle textStyleAutoSizeText_6BoG94g$lambda$192 = AutoSizeText_6BoG94g$lambda$19(snapshotState);
                            composerStartRestartGroup.startReplaceGroup(-1224400529);
                            z = ((i20 & 14) != 4) | ((i20 & 112) != 32) | ((234881024 & i18) != 67108864);
                            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                            if (z) {
                                final Function1 function152 = function12;
                                objRememberedValue5 = new Function1() { // from class: com.robinhood.compose.bento.component.text.AutoSizeTextKt$$ExternalSyntheticLambda8
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return AutoSizeText.AutoSizeText_6BoG94g$lambda$30$lambda$29(j, f3, function152, snapshotState2, snapshotState, (TextLayoutResult) obj);
                                    }
                                };
                                function13 = function152;
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                composerStartRestartGroup.endReplaceGroup();
                                TextStyle textStyle42 = textStyle2;
                                FontWeight fontWeight42 = fontWeight2;
                                Modifier modifier52 = modifier3;
                                FontStyle fontStyle42 = fontStyle2;
                                Color color62 = color4;
                                BentoText2.m20748BentoTextQnj7Zds(text, modifierDrawWithContent2, color62, fontStyle42, fontWeight42, textDecoration52, textAlign3, iM7959getEllipsisgIe3tQ82, false, i19, 0, null, (Function1) objRememberedValue5, textStyleAutoSizeText_6BoG94g$lambda$192, composerStartRestartGroup, ((i18 >> 3) & 14) | 12582912 | (i18 & 896) | (i18 & 7168) | (57344 & i18) | (458752 & i18) | (3670016 & i18) | (1879048192 & (i18 << 6)), 0, 3328);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                textAlign4 = textAlign3;
                                i22 = i19;
                                function14 = function13;
                                f4 = f3;
                                textStyle3 = textStyle42;
                                modifier4 = modifier52;
                                textDecoration4 = textDecoration52;
                                fontWeight3 = fontWeight42;
                                fontStyle3 = fontStyle42;
                                color5 = color62;
                            }
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                fontWeight2 = fontWeight;
                i8 = i4 & 32;
                if (i8 == 0) {
                }
                i9 = i4 & 64;
                if (i9 == 0) {
                }
                i10 = i4 & 128;
                if (i10 == 0) {
                }
                i11 = i4 & 256;
                if (i11 != 0) {
                }
                i12 = i11;
                if ((i2 & 805306368) == 0) {
                }
                if ((i4 & 1024) != 0) {
                }
                i15 = i13;
                i16 = i4 & 2048;
                if (i16 != 0) {
                }
                int i2522 = i14;
                if ((i5 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            fontStyle2 = fontStyle;
            i7 = i4 & 16;
            if (i7 != 0) {
            }
            fontWeight2 = fontWeight;
            i8 = i4 & 32;
            if (i8 == 0) {
            }
            i9 = i4 & 64;
            if (i9 == 0) {
            }
            i10 = i4 & 128;
            if (i10 == 0) {
            }
            i11 = i4 & 256;
            if (i11 != 0) {
            }
            i12 = i11;
            if ((i2 & 805306368) == 0) {
            }
            if ((i4 & 1024) != 0) {
            }
            i15 = i13;
            i16 = i4 & 2048;
            if (i16 != 0) {
            }
            int i25222 = i14;
            if ((i5 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        color2 = color;
        i6 = i4 & 8;
        if (i6 == 0) {
        }
        fontStyle2 = fontStyle;
        i7 = i4 & 16;
        if (i7 != 0) {
        }
        fontWeight2 = fontWeight;
        i8 = i4 & 32;
        if (i8 == 0) {
        }
        i9 = i4 & 64;
        if (i9 == 0) {
        }
        i10 = i4 & 128;
        if (i10 == 0) {
        }
        i11 = i4 & 256;
        if (i11 != 0) {
        }
        i12 = i11;
        if ((i2 & 805306368) == 0) {
        }
        if ((i4 & 1024) != 0) {
        }
        i15 = i13;
        i16 = i4 & 2048;
        if (i16 != 0) {
        }
        int i252222 = i14;
        if ((i5 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    private static final void AutoSizeText_6BoG94g$lambda$23(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AutoSizeText_6BoG94g$lambda$28$lambda$27(SnapshotState snapshotState, ContentDrawScope drawWithContent) {
        Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
        if (AutoSizeText_6BoG94g$lambda$22(snapshotState)) {
            drawWithContent.drawContent();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit AutoSizeText_6BoG94g$lambda$30$lambda$29(long j, float f, Function1 function1, SnapshotState snapshotState, SnapshotState snapshotState2, TextLayoutResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (!AutoSizeText_6BoG94g$lambda$22(snapshotState) && result.getHasVisualOverflow()) {
            long jM7662getFontSizeXSAIIZE = AutoSizeText_6BoG94g$lambda$19(snapshotState2).m7662getFontSizeXSAIIZE();
            TextUnit2.m8083checkArithmeticNB67dxo(jM7662getFontSizeXSAIIZE, j);
            if (Float.compare(TextUnit.m8074getValueimpl(jM7662getFontSizeXSAIIZE), TextUnit.m8074getValueimpl(j)) > 0) {
                long jM7662getFontSizeXSAIIZE2 = AutoSizeText_6BoG94g$lambda$19(snapshotState2).m7662getFontSizeXSAIIZE();
                TextUnit2.m8082checkArithmeticR2X_6o(jM7662getFontSizeXSAIIZE2);
                snapshotState2.setValue(TextStyle.m7655copyp1EtxEg$default(AutoSizeText_6BoG94g$lambda$19(snapshotState2), 0L, m21099maxNB67dxo(TextUnit2.pack(TextUnit.m8072getRawTypeimpl(jM7662getFontSizeXSAIIZE2), TextUnit.m8074getValueimpl(jM7662getFontSizeXSAIIZE2) * (1 - f)), j), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777213, null));
            }
        } else {
            AutoSizeText_6BoG94g$lambda$23(snapshotState, true);
        }
        function1.invoke(result);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AutoSizeText_G_RxxvU$lambda$33$lambda$32(TextLayoutResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:193:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011e  */
    /* renamed from: AutoSizeText-G_RxxvU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m21098AutoSizeTextG_RxxvU(Modifier modifier, final String text, Color color, FontStyle fontStyle, FontWeight fontWeight, TextDecoration textDecoration, TextAlign textAlign, int i, Function1<? super TextLayoutResult, Unit> function1, TextStyle textStyle, float f, float f2, Composer composer, final int i2, final int i3, final int i4) {
        Modifier modifier2;
        int i5;
        Color color2;
        int i6;
        FontStyle fontStyle2;
        int i7;
        final FontWeight fontWeight2;
        int i8;
        final TextDecoration textDecoration2;
        int i9;
        TextAlign textAlign2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        Modifier modifier3;
        int i19;
        Function1<? super TextLayoutResult, Unit> function12;
        TextStyle style;
        TextAlign textAlign3;
        FontWeight fontWeight3;
        TextDecoration textDecoration3;
        int i20;
        Function1<? super TextLayoutResult, Unit> function13;
        TextStyle textStyle2;
        float f3;
        Color color3;
        FontStyle fontStyle3;
        final float f4;
        final Modifier modifier4;
        final TextStyle textStyle3;
        final float f5;
        final Function1<? super TextLayoutResult, Unit> function14;
        final int i21;
        final TextAlign textAlign4;
        final FontStyle fontStyle4;
        final Color color4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer composerStartRestartGroup = composer.startRestartGroup(-199798626);
        int i22 = i4 & 1;
        if (i22 != 0) {
            i5 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i5 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerStartRestartGroup.changed(text) ? 32 : 16;
        }
        int i23 = i4 & 4;
        if (i23 != 0) {
            i5 |= 384;
        } else {
            if ((i2 & 384) == 0) {
                color2 = color;
                i5 |= composerStartRestartGroup.changed(color2) ? 256 : 128;
            }
            i6 = i4 & 8;
            if (i6 == 0) {
                i5 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    fontStyle2 = fontStyle;
                    i5 |= composerStartRestartGroup.changed(fontStyle2) ? 2048 : 1024;
                }
                i7 = i4 & 16;
                if (i7 != 0) {
                    i5 |= 24576;
                } else {
                    if ((i2 & 24576) == 0) {
                        fontWeight2 = fontWeight;
                        i5 |= composerStartRestartGroup.changed(fontWeight2) ? 16384 : 8192;
                    }
                    i8 = i4 & 32;
                    if (i8 == 0) {
                        i5 |= 196608;
                        textDecoration2 = textDecoration;
                    } else {
                        textDecoration2 = textDecoration;
                        if ((i2 & 196608) == 0) {
                            i5 |= composerStartRestartGroup.changed(textDecoration2) ? 131072 : 65536;
                        }
                    }
                    i9 = i4 & 64;
                    if (i9 == 0) {
                        i5 |= 1572864;
                        textAlign2 = textAlign;
                    } else {
                        textAlign2 = textAlign;
                        if ((i2 & 1572864) == 0) {
                            i5 |= composerStartRestartGroup.changed(textAlign2) ? 1048576 : 524288;
                        }
                    }
                    i10 = i4 & 128;
                    if (i10 == 0) {
                        i5 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        i5 |= composerStartRestartGroup.changed(i) ? 8388608 : 4194304;
                    }
                    i11 = i4 & 256;
                    if (i11 != 0) {
                        if ((i2 & 100663296) == 0) {
                            i12 = i11;
                            i5 |= composerStartRestartGroup.changedInstance(function1) ? 67108864 : 33554432;
                        }
                        if ((i2 & 805306368) == 0) {
                            i5 |= ((i4 & 512) == 0 && composerStartRestartGroup.changed(textStyle)) ? 536870912 : 268435456;
                        }
                        i13 = i4 & 1024;
                        if (i13 != 0) {
                            i15 = i3 | 6;
                            i14 = i13;
                        } else if ((i3 & 6) == 0) {
                            i14 = i13;
                            i15 = i3 | (composerStartRestartGroup.changed(f) ? 4 : 2);
                        } else {
                            i14 = i13;
                            i15 = i3;
                        }
                        i16 = i4 & 2048;
                        if (i16 != 0) {
                            i15 |= 48;
                            i17 = i16;
                        } else if ((i3 & 48) == 0) {
                            i17 = i16;
                            i15 |= composerStartRestartGroup.changed(f2) ? 32 : 16;
                        } else {
                            i17 = i16;
                        }
                        i18 = i15;
                        if ((i5 & 306783379) != 306783378 || (i18 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                modifier3 = i22 == 0 ? Modifier.INSTANCE : modifier2;
                                if (i23 != 0) {
                                    color2 = null;
                                }
                                if (i6 != 0) {
                                    fontStyle2 = null;
                                }
                                if (i7 != 0) {
                                    fontWeight2 = null;
                                }
                                if (i8 != 0) {
                                    textDecoration2 = null;
                                }
                                TextAlign textAlign5 = i9 == 0 ? textAlign2 : null;
                                i19 = i10 == 0 ? 1 : i;
                                if (i12 == 0) {
                                    composerStartRestartGroup.startReplaceGroup(1849434622);
                                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Function1() { // from class: com.robinhood.compose.bento.component.text.AutoSizeTextKt$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return AutoSizeText.AutoSizeText_G_RxxvU$lambda$33$lambda$32((TextLayoutResult) obj);
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    function12 = (Function1) objRememberedValue;
                                    composerStartRestartGroup.endReplaceGroup();
                                } else {
                                    function12 = function1;
                                }
                                if ((i4 & 512) == 0) {
                                    style = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getText(composerStartRestartGroup, 0).getStyle();
                                    i5 &= -1879048193;
                                } else {
                                    style = textStyle;
                                }
                                float f6 = i14 == 0 ? 0.85f : f;
                                if (i17 == 0) {
                                    TextDecoration textDecoration4 = textDecoration2;
                                    textAlign3 = textAlign5;
                                    fontWeight3 = fontWeight2;
                                    textDecoration3 = textDecoration4;
                                    TextStyle textStyle4 = style;
                                    i20 = i5;
                                    function13 = function12;
                                    textStyle2 = textStyle4;
                                    f3 = f6;
                                    color3 = color2;
                                    fontStyle3 = fontStyle2;
                                    f4 = 0.5f;
                                } else {
                                    TextDecoration textDecoration5 = textDecoration2;
                                    textAlign3 = textAlign5;
                                    fontWeight3 = fontWeight2;
                                    textDecoration3 = textDecoration5;
                                    TextStyle textStyle5 = style;
                                    i20 = i5;
                                    function13 = function12;
                                    textStyle2 = textStyle5;
                                    f3 = f6;
                                    color3 = color2;
                                    fontStyle3 = fontStyle2;
                                    f4 = f2;
                                }
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i4 & 512) != 0) {
                                    i5 &= -1879048193;
                                }
                                textStyle2 = textStyle;
                                f3 = f;
                                fontWeight3 = fontWeight2;
                                textDecoration3 = textDecoration2;
                                modifier3 = modifier2;
                                textAlign3 = textAlign2;
                                color3 = color2;
                                fontStyle3 = fontStyle2;
                                i19 = i;
                                f4 = f2;
                                i20 = i5;
                                function13 = function1;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-199798626, i20, i18, "com.robinhood.compose.bento.component.text.AutoSizeText (AutoSizeText.kt:149)");
                            }
                            long jM7662getFontSizeXSAIIZE = textStyle2.m7662getFontSizeXSAIIZE();
                            TextUnit2.m8082checkArithmeticR2X_6o(jM7662getFontSizeXSAIIZE);
                            Modifier modifier5 = modifier3;
                            m21096AutoSizeText6BoG94g(modifier5, text, color3, fontStyle3, fontWeight3, textDecoration3, textAlign3, i19, function13, textStyle2, TextUnit2.pack(TextUnit.m8072getRawTypeimpl(jM7662getFontSizeXSAIIZE), TextUnit.m8074getValueimpl(jM7662getFontSizeXSAIIZE) * f3), f4, composerStartRestartGroup, i20 & 2147483646, i18 & 112, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier4 = modifier5;
                            textStyle3 = textStyle2;
                            f5 = f3;
                            function14 = function13;
                            i21 = i19;
                            textAlign4 = textAlign3;
                            textDecoration2 = textDecoration3;
                            fontWeight2 = fontWeight3;
                            fontStyle4 = fontStyle3;
                            color4 = color3;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            i21 = i;
                            function14 = function1;
                            f5 = f;
                            modifier4 = modifier2;
                            textAlign4 = textAlign2;
                            color4 = color2;
                            fontStyle4 = fontStyle2;
                            textStyle3 = textStyle;
                            f4 = f2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.text.AutoSizeTextKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return AutoSizeText.AutoSizeText_G_RxxvU$lambda$34(modifier4, text, color4, fontStyle4, fontWeight2, textDecoration2, textAlign4, i21, function14, textStyle3, f5, f4, i2, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i5 |= 100663296;
                    i12 = i11;
                    if ((i2 & 805306368) == 0) {
                    }
                    i13 = i4 & 1024;
                    if (i13 != 0) {
                    }
                    i16 = i4 & 2048;
                    if (i16 != 0) {
                    }
                    i18 = i15;
                    if ((i5 & 306783379) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i2 & 1) != 0) {
                            if (i22 == 0) {
                            }
                            if (i23 != 0) {
                            }
                            if (i6 != 0) {
                            }
                            if (i7 != 0) {
                            }
                            if (i8 != 0) {
                            }
                            if (i9 == 0) {
                            }
                            if (i10 == 0) {
                            }
                            if (i12 == 0) {
                            }
                            if ((i4 & 512) == 0) {
                            }
                            if (i14 == 0) {
                            }
                            if (i17 == 0) {
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            long jM7662getFontSizeXSAIIZE2 = textStyle2.m7662getFontSizeXSAIIZE();
                            TextUnit2.m8082checkArithmeticR2X_6o(jM7662getFontSizeXSAIIZE2);
                            Modifier modifier52 = modifier3;
                            m21096AutoSizeText6BoG94g(modifier52, text, color3, fontStyle3, fontWeight3, textDecoration3, textAlign3, i19, function13, textStyle2, TextUnit2.pack(TextUnit.m8072getRawTypeimpl(jM7662getFontSizeXSAIIZE2), TextUnit.m8074getValueimpl(jM7662getFontSizeXSAIIZE2) * f3), f4, composerStartRestartGroup, i20 & 2147483646, i18 & 112, 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier4 = modifier52;
                            textStyle3 = textStyle2;
                            f5 = f3;
                            function14 = function13;
                            i21 = i19;
                            textAlign4 = textAlign3;
                            textDecoration2 = textDecoration3;
                            fontWeight2 = fontWeight3;
                            fontStyle4 = fontStyle3;
                            color4 = color3;
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                fontWeight2 = fontWeight;
                i8 = i4 & 32;
                if (i8 == 0) {
                }
                i9 = i4 & 64;
                if (i9 == 0) {
                }
                i10 = i4 & 128;
                if (i10 == 0) {
                }
                i11 = i4 & 256;
                if (i11 != 0) {
                }
                i12 = i11;
                if ((i2 & 805306368) == 0) {
                }
                i13 = i4 & 1024;
                if (i13 != 0) {
                }
                i16 = i4 & 2048;
                if (i16 != 0) {
                }
                i18 = i15;
                if ((i5 & 306783379) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            fontStyle2 = fontStyle;
            i7 = i4 & 16;
            if (i7 != 0) {
            }
            fontWeight2 = fontWeight;
            i8 = i4 & 32;
            if (i8 == 0) {
            }
            i9 = i4 & 64;
            if (i9 == 0) {
            }
            i10 = i4 & 128;
            if (i10 == 0) {
            }
            i11 = i4 & 256;
            if (i11 != 0) {
            }
            i12 = i11;
            if ((i2 & 805306368) == 0) {
            }
            i13 = i4 & 1024;
            if (i13 != 0) {
            }
            i16 = i4 & 2048;
            if (i16 != 0) {
            }
            i18 = i15;
            if ((i5 & 306783379) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        color2 = color;
        i6 = i4 & 8;
        if (i6 == 0) {
        }
        fontStyle2 = fontStyle;
        i7 = i4 & 16;
        if (i7 != 0) {
        }
        fontWeight2 = fontWeight;
        i8 = i4 & 32;
        if (i8 == 0) {
        }
        i9 = i4 & 64;
        if (i9 == 0) {
        }
        i10 = i4 & 128;
        if (i10 == 0) {
        }
        i11 = i4 & 256;
        if (i11 != 0) {
        }
        i12 = i11;
        if ((i2 & 805306368) == 0) {
        }
        i13 = i4 & 1024;
        if (i13 != 0) {
        }
        i16 = i4 & 2048;
        if (i16 != 0) {
        }
        i18 = i15;
        if ((i5 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AutoSizeText_G_RxxvU$lambda$36$lambda$35(TextLayoutResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:193:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011e  */
    /* renamed from: AutoSizeText-G_RxxvU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m21097AutoSizeTextG_RxxvU(Modifier modifier, final AnnotatedString text, Color color, FontStyle fontStyle, FontWeight fontWeight, TextDecoration textDecoration, TextAlign textAlign, int i, Function1<? super TextLayoutResult, Unit> function1, TextStyle textStyle, float f, float f2, Composer composer, final int i2, final int i3, final int i4) {
        Modifier modifier2;
        int i5;
        Color color2;
        int i6;
        FontStyle fontStyle2;
        int i7;
        final FontWeight fontWeight2;
        int i8;
        final TextDecoration textDecoration2;
        int i9;
        TextAlign textAlign2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        Modifier modifier3;
        int i19;
        Function1<? super TextLayoutResult, Unit> function12;
        TextStyle style;
        TextAlign textAlign3;
        FontWeight fontWeight3;
        TextDecoration textDecoration3;
        int i20;
        Function1<? super TextLayoutResult, Unit> function13;
        TextStyle textStyle2;
        float f3;
        Color color3;
        FontStyle fontStyle3;
        final float f4;
        final Modifier modifier4;
        final TextStyle textStyle3;
        final float f5;
        final Function1<? super TextLayoutResult, Unit> function14;
        final int i21;
        final TextAlign textAlign4;
        final FontStyle fontStyle4;
        final Color color4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer composerStartRestartGroup = composer.startRestartGroup(1071053078);
        int i22 = i4 & 1;
        if (i22 != 0) {
            i5 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i5 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerStartRestartGroup.changed(text) ? 32 : 16;
        }
        int i23 = i4 & 4;
        if (i23 != 0) {
            i5 |= 384;
        } else {
            if ((i2 & 384) == 0) {
                color2 = color;
                i5 |= composerStartRestartGroup.changed(color2) ? 256 : 128;
            }
            i6 = i4 & 8;
            if (i6 == 0) {
                i5 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    fontStyle2 = fontStyle;
                    i5 |= composerStartRestartGroup.changed(fontStyle2) ? 2048 : 1024;
                }
                i7 = i4 & 16;
                if (i7 != 0) {
                    i5 |= 24576;
                } else {
                    if ((i2 & 24576) == 0) {
                        fontWeight2 = fontWeight;
                        i5 |= composerStartRestartGroup.changed(fontWeight2) ? 16384 : 8192;
                    }
                    i8 = i4 & 32;
                    if (i8 == 0) {
                        i5 |= 196608;
                        textDecoration2 = textDecoration;
                    } else {
                        textDecoration2 = textDecoration;
                        if ((i2 & 196608) == 0) {
                            i5 |= composerStartRestartGroup.changed(textDecoration2) ? 131072 : 65536;
                        }
                    }
                    i9 = i4 & 64;
                    if (i9 == 0) {
                        i5 |= 1572864;
                        textAlign2 = textAlign;
                    } else {
                        textAlign2 = textAlign;
                        if ((i2 & 1572864) == 0) {
                            i5 |= composerStartRestartGroup.changed(textAlign2) ? 1048576 : 524288;
                        }
                    }
                    i10 = i4 & 128;
                    if (i10 == 0) {
                        i5 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        i5 |= composerStartRestartGroup.changed(i) ? 8388608 : 4194304;
                    }
                    i11 = i4 & 256;
                    if (i11 != 0) {
                        if ((i2 & 100663296) == 0) {
                            i12 = i11;
                            i5 |= composerStartRestartGroup.changedInstance(function1) ? 67108864 : 33554432;
                        }
                        if ((i2 & 805306368) == 0) {
                            i5 |= ((i4 & 512) == 0 && composerStartRestartGroup.changed(textStyle)) ? 536870912 : 268435456;
                        }
                        i13 = i4 & 1024;
                        if (i13 != 0) {
                            i15 = i3 | 6;
                            i14 = i13;
                        } else if ((i3 & 6) == 0) {
                            i14 = i13;
                            i15 = i3 | (composerStartRestartGroup.changed(f) ? 4 : 2);
                        } else {
                            i14 = i13;
                            i15 = i3;
                        }
                        i16 = i4 & 2048;
                        if (i16 != 0) {
                            i15 |= 48;
                            i17 = i16;
                        } else if ((i3 & 48) == 0) {
                            i17 = i16;
                            i15 |= composerStartRestartGroup.changed(f2) ? 32 : 16;
                        } else {
                            i17 = i16;
                        }
                        i18 = i15;
                        if ((i5 & 306783379) != 306783378 || (i18 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                modifier3 = i22 == 0 ? Modifier.INSTANCE : modifier2;
                                if (i23 != 0) {
                                    color2 = null;
                                }
                                if (i6 != 0) {
                                    fontStyle2 = null;
                                }
                                if (i7 != 0) {
                                    fontWeight2 = null;
                                }
                                if (i8 != 0) {
                                    textDecoration2 = null;
                                }
                                TextAlign textAlign5 = i9 == 0 ? textAlign2 : null;
                                i19 = i10 == 0 ? 1 : i;
                                if (i12 == 0) {
                                    composerStartRestartGroup.startReplaceGroup(1849434622);
                                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Function1() { // from class: com.robinhood.compose.bento.component.text.AutoSizeTextKt$$ExternalSyntheticLambda10
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return AutoSizeText.AutoSizeText_G_RxxvU$lambda$36$lambda$35((TextLayoutResult) obj);
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    function12 = (Function1) objRememberedValue;
                                    composerStartRestartGroup.endReplaceGroup();
                                } else {
                                    function12 = function1;
                                }
                                if ((i4 & 512) == 0) {
                                    style = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getText(composerStartRestartGroup, 0).getStyle();
                                    i5 &= -1879048193;
                                } else {
                                    style = textStyle;
                                }
                                float f6 = i14 == 0 ? 0.85f : f;
                                if (i17 == 0) {
                                    TextDecoration textDecoration4 = textDecoration2;
                                    textAlign3 = textAlign5;
                                    fontWeight3 = fontWeight2;
                                    textDecoration3 = textDecoration4;
                                    TextStyle textStyle4 = style;
                                    i20 = i5;
                                    function13 = function12;
                                    textStyle2 = textStyle4;
                                    f3 = f6;
                                    color3 = color2;
                                    fontStyle3 = fontStyle2;
                                    f4 = 0.5f;
                                } else {
                                    TextDecoration textDecoration5 = textDecoration2;
                                    textAlign3 = textAlign5;
                                    fontWeight3 = fontWeight2;
                                    textDecoration3 = textDecoration5;
                                    TextStyle textStyle5 = style;
                                    i20 = i5;
                                    function13 = function12;
                                    textStyle2 = textStyle5;
                                    f3 = f6;
                                    color3 = color2;
                                    fontStyle3 = fontStyle2;
                                    f4 = f2;
                                }
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i4 & 512) != 0) {
                                    i5 &= -1879048193;
                                }
                                textStyle2 = textStyle;
                                f3 = f;
                                fontWeight3 = fontWeight2;
                                textDecoration3 = textDecoration2;
                                modifier3 = modifier2;
                                textAlign3 = textAlign2;
                                color3 = color2;
                                fontStyle3 = fontStyle2;
                                i19 = i;
                                f4 = f2;
                                i20 = i5;
                                function13 = function1;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1071053078, i20, i18, "com.robinhood.compose.bento.component.text.AutoSizeText (AutoSizeText.kt:181)");
                            }
                            long jM7662getFontSizeXSAIIZE = textStyle2.m7662getFontSizeXSAIIZE();
                            TextUnit2.m8082checkArithmeticR2X_6o(jM7662getFontSizeXSAIIZE);
                            Modifier modifier5 = modifier3;
                            m21095AutoSizeText6BoG94g(modifier5, text, color3, fontStyle3, fontWeight3, textDecoration3, textAlign3, i19, function13, textStyle2, TextUnit2.pack(TextUnit.m8072getRawTypeimpl(jM7662getFontSizeXSAIIZE), TextUnit.m8074getValueimpl(jM7662getFontSizeXSAIIZE) * f3), f4, composerStartRestartGroup, i20 & 2147483646, i18 & 112, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier4 = modifier5;
                            textStyle3 = textStyle2;
                            f5 = f3;
                            function14 = function13;
                            i21 = i19;
                            textAlign4 = textAlign3;
                            textDecoration2 = textDecoration3;
                            fontWeight2 = fontWeight3;
                            fontStyle4 = fontStyle3;
                            color4 = color3;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            i21 = i;
                            function14 = function1;
                            f5 = f;
                            modifier4 = modifier2;
                            textAlign4 = textAlign2;
                            color4 = color2;
                            fontStyle4 = fontStyle2;
                            textStyle3 = textStyle;
                            f4 = f2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.text.AutoSizeTextKt$$ExternalSyntheticLambda11
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return AutoSizeText.AutoSizeText_G_RxxvU$lambda$37(modifier4, text, color4, fontStyle4, fontWeight2, textDecoration2, textAlign4, i21, function14, textStyle3, f5, f4, i2, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i5 |= 100663296;
                    i12 = i11;
                    if ((i2 & 805306368) == 0) {
                    }
                    i13 = i4 & 1024;
                    if (i13 != 0) {
                    }
                    i16 = i4 & 2048;
                    if (i16 != 0) {
                    }
                    i18 = i15;
                    if ((i5 & 306783379) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i2 & 1) != 0) {
                            if (i22 == 0) {
                            }
                            if (i23 != 0) {
                            }
                            if (i6 != 0) {
                            }
                            if (i7 != 0) {
                            }
                            if (i8 != 0) {
                            }
                            if (i9 == 0) {
                            }
                            if (i10 == 0) {
                            }
                            if (i12 == 0) {
                            }
                            if ((i4 & 512) == 0) {
                            }
                            if (i14 == 0) {
                            }
                            if (i17 == 0) {
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            long jM7662getFontSizeXSAIIZE2 = textStyle2.m7662getFontSizeXSAIIZE();
                            TextUnit2.m8082checkArithmeticR2X_6o(jM7662getFontSizeXSAIIZE2);
                            Modifier modifier52 = modifier3;
                            m21095AutoSizeText6BoG94g(modifier52, text, color3, fontStyle3, fontWeight3, textDecoration3, textAlign3, i19, function13, textStyle2, TextUnit2.pack(TextUnit.m8072getRawTypeimpl(jM7662getFontSizeXSAIIZE2), TextUnit.m8074getValueimpl(jM7662getFontSizeXSAIIZE2) * f3), f4, composerStartRestartGroup, i20 & 2147483646, i18 & 112, 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier4 = modifier52;
                            textStyle3 = textStyle2;
                            f5 = f3;
                            function14 = function13;
                            i21 = i19;
                            textAlign4 = textAlign3;
                            textDecoration2 = textDecoration3;
                            fontWeight2 = fontWeight3;
                            fontStyle4 = fontStyle3;
                            color4 = color3;
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                fontWeight2 = fontWeight;
                i8 = i4 & 32;
                if (i8 == 0) {
                }
                i9 = i4 & 64;
                if (i9 == 0) {
                }
                i10 = i4 & 128;
                if (i10 == 0) {
                }
                i11 = i4 & 256;
                if (i11 != 0) {
                }
                i12 = i11;
                if ((i2 & 805306368) == 0) {
                }
                i13 = i4 & 1024;
                if (i13 != 0) {
                }
                i16 = i4 & 2048;
                if (i16 != 0) {
                }
                i18 = i15;
                if ((i5 & 306783379) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            fontStyle2 = fontStyle;
            i7 = i4 & 16;
            if (i7 != 0) {
            }
            fontWeight2 = fontWeight;
            i8 = i4 & 32;
            if (i8 == 0) {
            }
            i9 = i4 & 64;
            if (i9 == 0) {
            }
            i10 = i4 & 128;
            if (i10 == 0) {
            }
            i11 = i4 & 256;
            if (i11 != 0) {
            }
            i12 = i11;
            if ((i2 & 805306368) == 0) {
            }
            i13 = i4 & 1024;
            if (i13 != 0) {
            }
            i16 = i4 & 2048;
            if (i16 != 0) {
            }
            i18 = i15;
            if ((i5 & 306783379) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        color2 = color;
        i6 = i4 & 8;
        if (i6 == 0) {
        }
        fontStyle2 = fontStyle;
        i7 = i4 & 16;
        if (i7 != 0) {
        }
        fontWeight2 = fontWeight;
        i8 = i4 & 32;
        if (i8 == 0) {
        }
        i9 = i4 & 64;
        if (i9 == 0) {
        }
        i10 = i4 & 128;
        if (i10 == 0) {
        }
        i11 = i4 & 256;
        if (i11 != 0) {
        }
        i12 = i11;
        if ((i2 & 805306368) == 0) {
        }
        i13 = i4 & 1024;
        if (i13 != 0) {
        }
        i16 = i4 & 2048;
        if (i16 != 0) {
        }
        i18 = i15;
        if ((i5 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* renamed from: max-NB67dxo, reason: not valid java name */
    private static final long m21099maxNB67dxo(long j, long j2) {
        TextUnit2.m8083checkArithmeticNB67dxo(j, j2);
        return Float.compare(TextUnit.m8074getValueimpl(j), TextUnit.m8074getValueimpl(j2)) >= 0 ? j : j2;
    }
}
