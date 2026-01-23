package com.robinhood.compose.bento.component;

import androidx.compose.foundation.text.InlineTextContent;
import androidx.compose.material3.TextKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.PlatformTextStyle;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.LineHeightStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableMap;
import kotlinx.collections.immutable.extensions2;

/* compiled from: BentoText.kt */
@Metadata(m3635d1 = {"\u0000p\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a¯\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00152\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00010\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001dH\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001a»\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020 2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00152\u0014\b\u0002\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020#0\"2\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00010\u00182\b\b\u0002\u0010\u001c\u001a\u00020\u001dH\u0007¢\u0006\u0004\b$\u0010%¨\u0006&"}, m3636d2 = {"BentoText", "", "text", "", "modifier", "Landroidx/compose/ui/Modifier;", ResourceTypes.COLOR, "Landroidx/compose/ui/graphics/Color;", "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "textDecoration", "Landroidx/compose/ui/text/style/TextDecoration;", "textAlign", "Landroidx/compose/ui/text/style/TextAlign;", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "softWrap", "", "maxLines", "", "minLines", "onTextLayout", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", "trim", "Landroidx/compose/ui/text/style/LineHeightStyle$Trim;", ResourceTypes.STYLE, "Landroidx/compose/ui/text/TextStyle;", "BentoText-38GnDrw", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;IZIILkotlin/jvm/functions/Function1;ILandroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/ui/text/AnnotatedString;", "inlineContent", "Lkotlinx/collections/immutable/ImmutableMap;", "Landroidx/compose/foundation/text/InlineTextContent;", "BentoText-Qnj7Zds", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;IZIILkotlinx/collections/immutable/ImmutableMap;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "lib-compose-bento_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.bento.component.BentoTextKt, reason: use source file name */
/* loaded from: classes20.dex */
public final class BentoText2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoText_38GnDrw$lambda$2(String str, Modifier modifier, Color color, FontStyle fontStyle, FontWeight fontWeight, TextDecoration textDecoration, TextAlign textAlign, int i, boolean z, int i2, int i3, Function1 function1, int i4, TextStyle textStyle, int i5, int i6, int i7, Composer composer, int i8) {
        m20747BentoText38GnDrw(str, modifier, color, fontStyle, fontWeight, textDecoration, textAlign, i, z, i2, i3, function1, i4, textStyle, composer, RecomposeScopeImpl4.updateChangedFlags(i5 | 1), RecomposeScopeImpl4.updateChangedFlags(i6), i7);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoText_Qnj7Zds$lambda$5(AnnotatedString annotatedString, Modifier modifier, Color color, FontStyle fontStyle, FontWeight fontWeight, TextDecoration textDecoration, TextAlign textAlign, int i, boolean z, int i2, int i3, ImmutableMap immutableMap, Function1 function1, TextStyle textStyle, int i4, int i5, int i6, Composer composer, int i7) {
        m20748BentoTextQnj7Zds(annotatedString, modifier, color, fontStyle, fontWeight, textDecoration, textAlign, i, z, i2, i3, immutableMap, function1, textStyle, composer, RecomposeScopeImpl4.updateChangedFlags(i4 | 1), RecomposeScopeImpl4.updateChangedFlags(i5), i6);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoText_38GnDrw$lambda$1$lambda$0(TextLayoutResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:228:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0107  */
    /* renamed from: BentoText-38GnDrw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m20747BentoText38GnDrw(final String text, Modifier modifier, Color color, FontStyle fontStyle, FontWeight fontWeight, TextDecoration textDecoration, TextAlign textAlign, int i, boolean z, int i2, int i3, Function1<? super TextLayoutResult, Unit> function1, int i4, TextStyle textStyle, Composer composer, final int i5, final int i6, final int i7) {
        int i8;
        Modifier modifier2;
        int i9;
        Color color2;
        int i10;
        FontStyle fontStyle2;
        int i11;
        FontWeight fontWeight2;
        int i12;
        TextDecoration textDecoration2;
        int i13;
        TextAlign textAlign2;
        int i14;
        int iM7958getClipgIe3tQ8;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        Function1<? super TextLayoutResult, Unit> function12;
        int iM7911getNoneEVpEnUU;
        Function1<? super TextLayoutResult, Unit> function13;
        TextStyle style;
        int i25;
        Color color3;
        int i26;
        FontWeight fontWeight3;
        boolean z2;
        TextAlign textAlign3;
        int i27;
        Modifier modifier3;
        int i28;
        Composer composer2;
        final FontStyle fontStyle3;
        final FontWeight fontWeight4;
        final TextDecoration textDecoration3;
        final TextAlign textAlign4;
        final int i29;
        final boolean z3;
        final int i30;
        final int i31;
        final Function1<? super TextLayoutResult, Unit> function14;
        final Color color4;
        final Modifier modifier4;
        final int i32;
        final TextStyle textStyle2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer composerStartRestartGroup = composer.startRestartGroup(830178797);
        if ((i7 & 1) != 0) {
            i8 = i5 | 6;
        } else if ((i5 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(text) ? 4 : 2) | i5;
        } else {
            i8 = i5;
        }
        int i33 = i7 & 2;
        if (i33 != 0) {
            i8 |= 48;
        } else {
            if ((i5 & 48) == 0) {
                modifier2 = modifier;
                i8 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i9 = i7 & 4;
            if (i9 == 0) {
                i8 |= 384;
            } else {
                if ((i5 & 384) == 0) {
                    color2 = color;
                    i8 |= composerStartRestartGroup.changed(color2) ? 256 : 128;
                }
                i10 = i7 & 8;
                int i34 = 1024;
                if (i10 != 0) {
                    i8 |= 3072;
                } else {
                    if ((i5 & 3072) == 0) {
                        fontStyle2 = fontStyle;
                        i8 |= composerStartRestartGroup.changed(fontStyle2) ? 2048 : 1024;
                    }
                    i11 = i7 & 16;
                    if (i11 == 0) {
                        i8 |= 24576;
                    } else {
                        if ((i5 & 24576) == 0) {
                            fontWeight2 = fontWeight;
                            i8 |= composerStartRestartGroup.changed(fontWeight2) ? 16384 : 8192;
                        }
                        i12 = i7 & 32;
                        if (i12 != 0) {
                            i8 |= 196608;
                            textDecoration2 = textDecoration;
                        } else {
                            textDecoration2 = textDecoration;
                            if ((i5 & 196608) == 0) {
                                i8 |= composerStartRestartGroup.changed(textDecoration2) ? 131072 : 65536;
                            }
                        }
                        i13 = i7 & 64;
                        if (i13 != 0) {
                            i8 |= 1572864;
                            textAlign2 = textAlign;
                        } else {
                            textAlign2 = textAlign;
                            if ((i5 & 1572864) == 0) {
                                i8 |= composerStartRestartGroup.changed(textAlign2) ? 1048576 : 524288;
                            }
                        }
                        i14 = i7 & 128;
                        if (i14 != 0) {
                            i8 |= 12582912;
                            iM7958getClipgIe3tQ8 = i;
                        } else {
                            iM7958getClipgIe3tQ8 = i;
                            if ((i5 & 12582912) == 0) {
                                i8 |= composerStartRestartGroup.changed(iM7958getClipgIe3tQ8) ? 8388608 : 4194304;
                            }
                        }
                        i15 = i7 & 256;
                        if (i15 != 0) {
                            i8 |= 100663296;
                        } else {
                            if ((i5 & 100663296) == 0) {
                                i16 = i15;
                                i8 |= composerStartRestartGroup.changed(z) ? 67108864 : 33554432;
                            }
                            i17 = i7 & 512;
                            if (i17 == 0) {
                                i8 |= 805306368;
                            } else {
                                if ((i5 & 805306368) == 0) {
                                    i18 = i17;
                                    i8 |= composerStartRestartGroup.changed(i2) ? 536870912 : 268435456;
                                }
                                i19 = i7 & 1024;
                                if (i19 != 0) {
                                    i21 = i6 | 6;
                                    i20 = i19;
                                } else if ((i6 & 6) == 0) {
                                    i20 = i19;
                                    i21 = i6 | (composerStartRestartGroup.changed(i3) ? 4 : 2);
                                } else {
                                    i20 = i19;
                                    i21 = i6;
                                }
                                i22 = i7 & 2048;
                                if (i22 == 0) {
                                    if ((i6 & 48) == 0) {
                                        i23 = i22;
                                        i21 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
                                    }
                                    if ((i6 & 384) == 0) {
                                        i21 |= ((i7 & 4096) == 0 && composerStartRestartGroup.changed(i4)) ? 256 : 128;
                                    }
                                    if ((i6 & 3072) == 0) {
                                        if ((i7 & 8192) == 0 && composerStartRestartGroup.changed(textStyle)) {
                                            i34 = 2048;
                                        }
                                        i21 |= i34;
                                    }
                                    int i35 = i21;
                                    if ((i8 & 306783379) == 306783378 || (i35 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
                                        composerStartRestartGroup.startDefaults();
                                        if ((i5 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                            Modifier modifier5 = i33 == 0 ? Modifier.INSTANCE : modifier2;
                                            if (i9 != 0) {
                                                color2 = null;
                                            }
                                            if (i10 != 0) {
                                                fontStyle2 = null;
                                            }
                                            if (i11 != 0) {
                                                fontWeight2 = null;
                                            }
                                            if (i12 != 0) {
                                                textDecoration2 = null;
                                            }
                                            if (i13 != 0) {
                                                textAlign2 = null;
                                            }
                                            if (i14 != 0) {
                                                iM7958getClipgIe3tQ8 = TextOverflow.INSTANCE.m7958getClipgIe3tQ8();
                                            }
                                            boolean z4 = i16 == 0 ? true : z;
                                            i24 = i18 == 0 ? Integer.MAX_VALUE : i2;
                                            int i36 = i20 == 0 ? i3 : 1;
                                            if (i23 == 0) {
                                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue = new Function1() { // from class: com.robinhood.compose.bento.component.BentoTextKt$$ExternalSyntheticLambda0
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj) {
                                                            return BentoText2.BentoText_38GnDrw$lambda$1$lambda$0((TextLayoutResult) obj);
                                                        }
                                                    };
                                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                                }
                                                function12 = (Function1) objRememberedValue;
                                                composerStartRestartGroup.endReplaceGroup();
                                            } else {
                                                function12 = function1;
                                            }
                                            if ((i7 & 4096) == 0) {
                                                iM7911getNoneEVpEnUU = LineHeightStyle.Trim.INSTANCE.m7911getNoneEVpEnUU();
                                                i35 &= -897;
                                            } else {
                                                iM7911getNoneEVpEnUU = i4;
                                            }
                                            Modifier modifier6 = modifier5;
                                            if ((i7 & 8192) == 0) {
                                                function13 = function12;
                                                i25 = i35 & (-7169);
                                                style = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getText(composerStartRestartGroup, 0).getStyle();
                                            } else {
                                                function13 = function12;
                                                style = textStyle;
                                                i25 = i35;
                                            }
                                            color3 = color2;
                                            i26 = i36;
                                            fontWeight3 = fontWeight2;
                                            z2 = z4;
                                            textAlign3 = textAlign2;
                                            i27 = iM7911getNoneEVpEnUU;
                                            modifier3 = modifier6;
                                            i28 = iM7958getClipgIe3tQ8;
                                        } else {
                                            composerStartRestartGroup.skipToGroupEnd();
                                            if ((i7 & 4096) != 0) {
                                                i35 &= -897;
                                            }
                                            if ((i7 & 8192) != 0) {
                                                i35 &= -7169;
                                            }
                                            z2 = z;
                                            i24 = i2;
                                            i26 = i3;
                                            function13 = function1;
                                            i27 = i4;
                                            style = textStyle;
                                            i25 = i35;
                                            i28 = iM7958getClipgIe3tQ8;
                                            color3 = color2;
                                            fontWeight3 = fontWeight2;
                                            modifier3 = modifier2;
                                            textAlign3 = textAlign2;
                                        }
                                        composerStartRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(830178797, i8, i25, "com.robinhood.compose.bento.component.BentoText (BentoText.kt:43)");
                                        }
                                        Modifier modifierWithBentoPlaceholder$default = LocalShowPlaceholder.withBentoPlaceholder$default(modifier3, false, null, 3, null);
                                        composerStartRestartGroup.startReplaceGroup(-1062072012);
                                        long jM22031getColor0d7_KjU = color3 != null ? ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getText(composerStartRestartGroup, 0).m22031getColor0d7_KjU() : color3.getValue();
                                        composerStartRestartGroup.endReplaceGroup();
                                        Modifier modifier7 = modifier3;
                                        int i37 = i8 << 3;
                                        int i38 = (i8 & 14) | (57344 & i37) | (i37 & 458752);
                                        int i39 = i8 << 9;
                                        int i40 = i25 << 12;
                                        int i41 = ((i8 >> 18) & 8176) | (57344 & i40) | (i40 & 458752);
                                        int i42 = i27;
                                        long j = jM22031getColor0d7_KjU;
                                        composer2 = composerStartRestartGroup;
                                        FontStyle fontStyle4 = fontStyle2;
                                        int i43 = i24;
                                        TextKt.m6028Text4IGK_g(text, modifierWithBentoPlaceholder$default, j, 0L, fontStyle4, fontWeight3, null, 0L, textDecoration2, textAlign3, 0L, i28, z2, i43, i26, function13, TextStyle.m7655copyp1EtxEg$default(style, 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, new PlatformTextStyle(false), new LineHeightStyle(LineHeightStyle.Alignment.INSTANCE.m7890getProportionalPIaL0Z0(), i27, (DefaultConstructorMarker) null), 0, 0, null, 15204351, null), composer2, i38 | (234881024 & i39) | (i39 & 1879048192), i41, 1224);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        fontStyle3 = fontStyle4;
                                        fontWeight4 = fontWeight3;
                                        textDecoration3 = textDecoration2;
                                        textAlign4 = textAlign3;
                                        i29 = i28;
                                        z3 = z2;
                                        i30 = i43;
                                        i31 = i26;
                                        function14 = function13;
                                        color4 = color3;
                                        modifier4 = modifier7;
                                        i32 = i42;
                                        textStyle2 = style;
                                    } else {
                                        composerStartRestartGroup.skipToGroupEnd();
                                        FontStyle fontStyle5 = fontStyle2;
                                        i29 = iM7958getClipgIe3tQ8;
                                        fontStyle3 = fontStyle5;
                                        z3 = z;
                                        i32 = i4;
                                        composer2 = composerStartRestartGroup;
                                        color4 = color2;
                                        fontWeight4 = fontWeight2;
                                        textDecoration3 = textDecoration2;
                                        modifier4 = modifier2;
                                        textAlign4 = textAlign2;
                                        i30 = i2;
                                        i31 = i3;
                                        function14 = function1;
                                        textStyle2 = textStyle;
                                    }
                                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                    if (scopeUpdateScopeEndRestartGroup == null) {
                                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoTextKt$$ExternalSyntheticLambda1
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj, Object obj2) {
                                                return BentoText2.BentoText_38GnDrw$lambda$2(text, modifier4, color4, fontStyle3, fontWeight4, textDecoration3, textAlign4, i29, z3, i30, i31, function14, i32, textStyle2, i5, i6, i7, (Composer) obj, ((Integer) obj2).intValue());
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                i21 |= 48;
                                i23 = i22;
                                if ((i6 & 384) == 0) {
                                }
                                if ((i6 & 3072) == 0) {
                                }
                                int i352 = i21;
                                if ((i8 & 306783379) == 306783378) {
                                    composerStartRestartGroup.startDefaults();
                                    if ((i5 & 1) != 0) {
                                        if (i33 == 0) {
                                        }
                                        if (i9 != 0) {
                                        }
                                        if (i10 != 0) {
                                        }
                                        if (i11 != 0) {
                                        }
                                        if (i12 != 0) {
                                        }
                                        if (i13 != 0) {
                                        }
                                        if (i14 != 0) {
                                        }
                                        if (i16 == 0) {
                                        }
                                        if (i18 == 0) {
                                        }
                                        if (i20 == 0) {
                                        }
                                        if (i23 == 0) {
                                        }
                                        if ((i7 & 4096) == 0) {
                                        }
                                        Modifier modifier62 = modifier5;
                                        if ((i7 & 8192) == 0) {
                                        }
                                        color3 = color2;
                                        i26 = i36;
                                        fontWeight3 = fontWeight2;
                                        z2 = z4;
                                        textAlign3 = textAlign2;
                                        i27 = iM7911getNoneEVpEnUU;
                                        modifier3 = modifier62;
                                        i28 = iM7958getClipgIe3tQ8;
                                        composerStartRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        Modifier modifierWithBentoPlaceholder$default2 = LocalShowPlaceholder.withBentoPlaceholder$default(modifier3, false, null, 3, null);
                                        composerStartRestartGroup.startReplaceGroup(-1062072012);
                                        if (color3 != null) {
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                        Modifier modifier72 = modifier3;
                                        int i372 = i8 << 3;
                                        int i382 = (i8 & 14) | (57344 & i372) | (i372 & 458752);
                                        int i392 = i8 << 9;
                                        int i402 = i25 << 12;
                                        int i412 = ((i8 >> 18) & 8176) | (57344 & i402) | (i402 & 458752);
                                        int i422 = i27;
                                        long j2 = jM22031getColor0d7_KjU;
                                        composer2 = composerStartRestartGroup;
                                        FontStyle fontStyle42 = fontStyle2;
                                        int i432 = i24;
                                        TextKt.m6028Text4IGK_g(text, modifierWithBentoPlaceholder$default2, j2, 0L, fontStyle42, fontWeight3, null, 0L, textDecoration2, textAlign3, 0L, i28, z2, i432, i26, function13, TextStyle.m7655copyp1EtxEg$default(style, 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, new PlatformTextStyle(false), new LineHeightStyle(LineHeightStyle.Alignment.INSTANCE.m7890getProportionalPIaL0Z0(), i27, (DefaultConstructorMarker) null), 0, 0, null, 15204351, null), composer2, i382 | (234881024 & i392) | (i392 & 1879048192), i412, 1224);
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        fontStyle3 = fontStyle42;
                                        fontWeight4 = fontWeight3;
                                        textDecoration3 = textDecoration2;
                                        textAlign4 = textAlign3;
                                        i29 = i28;
                                        z3 = z2;
                                        i30 = i432;
                                        i31 = i26;
                                        function14 = function13;
                                        color4 = color3;
                                        modifier4 = modifier72;
                                        i32 = i422;
                                        textStyle2 = style;
                                    }
                                }
                                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup == null) {
                                }
                            }
                            i18 = i17;
                            i19 = i7 & 1024;
                            if (i19 != 0) {
                            }
                            i22 = i7 & 2048;
                            if (i22 == 0) {
                            }
                            i23 = i22;
                            if ((i6 & 384) == 0) {
                            }
                            if ((i6 & 3072) == 0) {
                            }
                            int i3522 = i21;
                            if ((i8 & 306783379) == 306783378) {
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                            }
                        }
                        i16 = i15;
                        i17 = i7 & 512;
                        if (i17 == 0) {
                        }
                        i18 = i17;
                        i19 = i7 & 1024;
                        if (i19 != 0) {
                        }
                        i22 = i7 & 2048;
                        if (i22 == 0) {
                        }
                        i23 = i22;
                        if ((i6 & 384) == 0) {
                        }
                        if ((i6 & 3072) == 0) {
                        }
                        int i35222 = i21;
                        if ((i8 & 306783379) == 306783378) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    fontWeight2 = fontWeight;
                    i12 = i7 & 32;
                    if (i12 != 0) {
                    }
                    i13 = i7 & 64;
                    if (i13 != 0) {
                    }
                    i14 = i7 & 128;
                    if (i14 != 0) {
                    }
                    i15 = i7 & 256;
                    if (i15 != 0) {
                    }
                    i16 = i15;
                    i17 = i7 & 512;
                    if (i17 == 0) {
                    }
                    i18 = i17;
                    i19 = i7 & 1024;
                    if (i19 != 0) {
                    }
                    i22 = i7 & 2048;
                    if (i22 == 0) {
                    }
                    i23 = i22;
                    if ((i6 & 384) == 0) {
                    }
                    if ((i6 & 3072) == 0) {
                    }
                    int i352222 = i21;
                    if ((i8 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                fontStyle2 = fontStyle;
                i11 = i7 & 16;
                if (i11 == 0) {
                }
                fontWeight2 = fontWeight;
                i12 = i7 & 32;
                if (i12 != 0) {
                }
                i13 = i7 & 64;
                if (i13 != 0) {
                }
                i14 = i7 & 128;
                if (i14 != 0) {
                }
                i15 = i7 & 256;
                if (i15 != 0) {
                }
                i16 = i15;
                i17 = i7 & 512;
                if (i17 == 0) {
                }
                i18 = i17;
                i19 = i7 & 1024;
                if (i19 != 0) {
                }
                i22 = i7 & 2048;
                if (i22 == 0) {
                }
                i23 = i22;
                if ((i6 & 384) == 0) {
                }
                if ((i6 & 3072) == 0) {
                }
                int i3522222 = i21;
                if ((i8 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            color2 = color;
            i10 = i7 & 8;
            int i342 = 1024;
            if (i10 != 0) {
            }
            fontStyle2 = fontStyle;
            i11 = i7 & 16;
            if (i11 == 0) {
            }
            fontWeight2 = fontWeight;
            i12 = i7 & 32;
            if (i12 != 0) {
            }
            i13 = i7 & 64;
            if (i13 != 0) {
            }
            i14 = i7 & 128;
            if (i14 != 0) {
            }
            i15 = i7 & 256;
            if (i15 != 0) {
            }
            i16 = i15;
            i17 = i7 & 512;
            if (i17 == 0) {
            }
            i18 = i17;
            i19 = i7 & 1024;
            if (i19 != 0) {
            }
            i22 = i7 & 2048;
            if (i22 == 0) {
            }
            i23 = i22;
            if ((i6 & 384) == 0) {
            }
            if ((i6 & 3072) == 0) {
            }
            int i35222222 = i21;
            if ((i8 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i9 = i7 & 4;
        if (i9 == 0) {
        }
        color2 = color;
        i10 = i7 & 8;
        int i3422 = 1024;
        if (i10 != 0) {
        }
        fontStyle2 = fontStyle;
        i11 = i7 & 16;
        if (i11 == 0) {
        }
        fontWeight2 = fontWeight;
        i12 = i7 & 32;
        if (i12 != 0) {
        }
        i13 = i7 & 64;
        if (i13 != 0) {
        }
        i14 = i7 & 128;
        if (i14 != 0) {
        }
        i15 = i7 & 256;
        if (i15 != 0) {
        }
        i16 = i15;
        i17 = i7 & 512;
        if (i17 == 0) {
        }
        i18 = i17;
        i19 = i7 & 1024;
        if (i19 != 0) {
        }
        i22 = i7 & 2048;
        if (i22 == 0) {
        }
        i23 = i22;
        if ((i6 & 384) == 0) {
        }
        if ((i6 & 3072) == 0) {
        }
        int i352222222 = i21;
        if ((i8 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoText_Qnj7Zds$lambda$4$lambda$3(TextLayoutResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:225:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0107  */
    /* renamed from: BentoText-Qnj7Zds, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m20748BentoTextQnj7Zds(final AnnotatedString text, Modifier modifier, Color color, FontStyle fontStyle, FontWeight fontWeight, TextDecoration textDecoration, TextAlign textAlign, int i, boolean z, int i2, int i3, ImmutableMap<String, InlineTextContent> immutableMap, Function1<? super TextLayoutResult, Unit> function1, TextStyle textStyle, Composer composer, final int i4, final int i5, final int i6) {
        int i7;
        Modifier modifier2;
        int i8;
        Color color2;
        int i9;
        FontStyle fontStyle2;
        int i10;
        FontWeight fontWeight2;
        int i11;
        TextDecoration textDecoration2;
        int i12;
        TextAlign textAlign2;
        int i13;
        int iM7958getClipgIe3tQ8;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        Modifier modifier3;
        Function1<? super TextLayoutResult, Unit> function12;
        Function1<? super TextLayoutResult, Unit> function13;
        TextStyle style;
        int i25;
        Color color3;
        int i26;
        FontWeight fontWeight3;
        boolean z2;
        int i27;
        TextAlign textAlign3;
        ImmutableMap<String, InlineTextContent> immutableMap2;
        Modifier modifier4;
        int i28;
        Composer composer2;
        final FontStyle fontStyle3;
        final FontWeight fontWeight4;
        final TextDecoration textDecoration3;
        final TextAlign textAlign4;
        final int i29;
        final boolean z3;
        final int i30;
        final int i31;
        final ImmutableMap<String, InlineTextContent> immutableMap3;
        final Function1<? super TextLayoutResult, Unit> function14;
        final Color color4;
        final Modifier modifier5;
        final TextStyle textStyle2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1211995411);
        if ((i6 & 1) != 0) {
            i7 = i4 | 6;
        } else if ((i4 & 6) == 0) {
            i7 = (composerStartRestartGroup.changed(text) ? 4 : 2) | i4;
        } else {
            i7 = i4;
        }
        int i32 = i6 & 2;
        if (i32 != 0) {
            i7 |= 48;
        } else {
            if ((i4 & 48) == 0) {
                modifier2 = modifier;
                i7 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i8 = i6 & 4;
            if (i8 == 0) {
                i7 |= 384;
            } else {
                if ((i4 & 384) == 0) {
                    color2 = color;
                    i7 |= composerStartRestartGroup.changed(color2) ? 256 : 128;
                }
                i9 = i6 & 8;
                int i33 = 1024;
                if (i9 != 0) {
                    i7 |= 3072;
                } else {
                    if ((i4 & 3072) == 0) {
                        fontStyle2 = fontStyle;
                        i7 |= composerStartRestartGroup.changed(fontStyle2) ? 2048 : 1024;
                    }
                    i10 = i6 & 16;
                    if (i10 == 0) {
                        i7 |= 24576;
                    } else {
                        if ((i4 & 24576) == 0) {
                            fontWeight2 = fontWeight;
                            i7 |= composerStartRestartGroup.changed(fontWeight2) ? 16384 : 8192;
                        }
                        i11 = i6 & 32;
                        if (i11 != 0) {
                            i7 |= 196608;
                            textDecoration2 = textDecoration;
                        } else {
                            textDecoration2 = textDecoration;
                            if ((i4 & 196608) == 0) {
                                i7 |= composerStartRestartGroup.changed(textDecoration2) ? 131072 : 65536;
                            }
                        }
                        i12 = i6 & 64;
                        if (i12 != 0) {
                            i7 |= 1572864;
                            textAlign2 = textAlign;
                        } else {
                            textAlign2 = textAlign;
                            if ((i4 & 1572864) == 0) {
                                i7 |= composerStartRestartGroup.changed(textAlign2) ? 1048576 : 524288;
                            }
                        }
                        i13 = i6 & 128;
                        if (i13 != 0) {
                            i7 |= 12582912;
                            iM7958getClipgIe3tQ8 = i;
                        } else {
                            iM7958getClipgIe3tQ8 = i;
                            if ((i4 & 12582912) == 0) {
                                i7 |= composerStartRestartGroup.changed(iM7958getClipgIe3tQ8) ? 8388608 : 4194304;
                            }
                        }
                        i14 = i6 & 256;
                        if (i14 != 0) {
                            i7 |= 100663296;
                        } else {
                            if ((i4 & 100663296) == 0) {
                                i15 = i14;
                                i7 |= composerStartRestartGroup.changed(z) ? 67108864 : 33554432;
                            }
                            i16 = i6 & 512;
                            if (i16 == 0) {
                                i7 |= 805306368;
                            } else {
                                if ((i4 & 805306368) == 0) {
                                    i17 = i16;
                                    i7 |= composerStartRestartGroup.changed(i2) ? 536870912 : 268435456;
                                }
                                i18 = i6 & 1024;
                                if (i18 != 0) {
                                    i20 = i5 | 6;
                                    i19 = i18;
                                } else if ((i5 & 6) == 0) {
                                    i19 = i18;
                                    i20 = i5 | (composerStartRestartGroup.changed(i3) ? 4 : 2);
                                } else {
                                    i19 = i18;
                                    i20 = i5;
                                }
                                i21 = i6 & 2048;
                                if (i21 != 0) {
                                    i20 |= 48;
                                    i22 = i21;
                                } else if ((i5 & 48) == 0) {
                                    i22 = i21;
                                    i20 |= composerStartRestartGroup.changed(immutableMap) ? 32 : 16;
                                } else {
                                    i22 = i21;
                                }
                                int i34 = i20;
                                i23 = i6 & 4096;
                                if (i23 == 0) {
                                    i24 = i34;
                                    if ((i5 & 384) == 0) {
                                        i24 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
                                    }
                                    if ((i5 & 3072) == 0) {
                                        if ((i6 & 8192) == 0 && composerStartRestartGroup.changed(textStyle)) {
                                            i33 = 2048;
                                        }
                                        i24 |= i33;
                                    }
                                    int i35 = i24;
                                    if ((i7 & 306783379) == 306783378 || (i35 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
                                        composerStartRestartGroup.startDefaults();
                                        if ((i4 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                            Modifier modifier6 = i32 == 0 ? Modifier.INSTANCE : modifier2;
                                            if (i8 != 0) {
                                                color2 = null;
                                            }
                                            if (i9 != 0) {
                                                fontStyle2 = null;
                                            }
                                            if (i10 != 0) {
                                                fontWeight2 = null;
                                            }
                                            if (i11 != 0) {
                                                textDecoration2 = null;
                                            }
                                            if (i12 != 0) {
                                                textAlign2 = null;
                                            }
                                            if (i13 != 0) {
                                                iM7958getClipgIe3tQ8 = TextOverflow.INSTANCE.m7958getClipgIe3tQ8();
                                            }
                                            boolean z4 = i15 == 0 ? true : z;
                                            int i36 = i17 == 0 ? Integer.MAX_VALUE : i2;
                                            int i37 = i19 == 0 ? i3 : 1;
                                            ImmutableMap<String, InlineTextContent> immutableMapPersistentMapOf = i22 == 0 ? extensions2.persistentMapOf() : immutableMap;
                                            if (i23 == 0) {
                                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                                modifier3 = modifier6;
                                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue = new Function1() { // from class: com.robinhood.compose.bento.component.BentoTextKt$$ExternalSyntheticLambda2
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj) {
                                                            return BentoText2.BentoText_Qnj7Zds$lambda$4$lambda$3((TextLayoutResult) obj);
                                                        }
                                                    };
                                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                                }
                                                function12 = (Function1) objRememberedValue;
                                                composerStartRestartGroup.endReplaceGroup();
                                            } else {
                                                modifier3 = modifier6;
                                                function12 = function1;
                                            }
                                            if ((i6 & 8192) == 0) {
                                                function13 = function12;
                                                i25 = i35 & (-7169);
                                                style = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getText(composerStartRestartGroup, 0).getStyle();
                                            } else {
                                                function13 = function12;
                                                style = textStyle;
                                                i25 = i35;
                                            }
                                            color3 = color2;
                                            i26 = i37;
                                            fontWeight3 = fontWeight2;
                                            z2 = z4;
                                            i27 = i36;
                                            textAlign3 = textAlign2;
                                            immutableMap2 = immutableMapPersistentMapOf;
                                            modifier4 = modifier3;
                                            i28 = iM7958getClipgIe3tQ8;
                                        } else {
                                            composerStartRestartGroup.skipToGroupEnd();
                                            if ((i6 & 8192) != 0) {
                                                i35 &= -7169;
                                            }
                                            z2 = z;
                                            i27 = i2;
                                            i26 = i3;
                                            immutableMap2 = immutableMap;
                                            function13 = function1;
                                            style = textStyle;
                                            i25 = i35;
                                            i28 = iM7958getClipgIe3tQ8;
                                            color3 = color2;
                                            fontWeight3 = fontWeight2;
                                            modifier4 = modifier2;
                                            textAlign3 = textAlign2;
                                        }
                                        composerStartRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1211995411, i7, i25, "com.robinhood.compose.bento.component.BentoText (BentoText.kt:95)");
                                        }
                                        Modifier modifierWithBentoPlaceholder$default = LocalShowPlaceholder.withBentoPlaceholder$default(modifier4, false, null, 3, null);
                                        composerStartRestartGroup.startReplaceGroup(-791430700);
                                        long jM22031getColor0d7_KjU = color3 != null ? ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getText(composerStartRestartGroup, 0).m22031getColor0d7_KjU() : color3.getValue();
                                        composerStartRestartGroup.endReplaceGroup();
                                        Modifier modifier7 = modifier4;
                                        boolean z5 = z2;
                                        int i38 = i25;
                                        int i39 = i7 << 3;
                                        int i40 = (i7 & 14) | (57344 & i39) | (i39 & 458752);
                                        int i41 = i7 << 9;
                                        int i42 = i40 | (234881024 & i41) | (i41 & 1879048192);
                                        int i43 = i38 << 12;
                                        int i44 = ((i7 >> 18) & 8176) | (57344 & i43) | (458752 & i43) | (i43 & 3670016);
                                        composer2 = composerStartRestartGroup;
                                        FontStyle fontStyle4 = fontStyle2;
                                        TextKt.m6029TextIbK3jfQ(text, modifierWithBentoPlaceholder$default, jM22031getColor0d7_KjU, 0L, fontStyle4, fontWeight3, null, 0L, textDecoration2, textAlign3, 0L, i28, z5, i27, i26, immutableMap2, function13, TextStyle.m7655copyp1EtxEg$default(style, 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, new PlatformTextStyle(false), new LineHeightStyle(LineHeightStyle.Alignment.INSTANCE.m7890getProportionalPIaL0Z0(), LineHeightStyle.Trim.INSTANCE.m7911getNoneEVpEnUU(), (DefaultConstructorMarker) null), 0, 0, null, 15204351, null), composer2, i42, i44, 1224);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        fontStyle3 = fontStyle4;
                                        fontWeight4 = fontWeight3;
                                        textDecoration3 = textDecoration2;
                                        textAlign4 = textAlign3;
                                        i29 = i28;
                                        z3 = z5;
                                        i30 = i27;
                                        i31 = i26;
                                        immutableMap3 = immutableMap2;
                                        function14 = function13;
                                        color4 = color3;
                                        modifier5 = modifier7;
                                        textStyle2 = style;
                                    } else {
                                        composerStartRestartGroup.skipToGroupEnd();
                                        FontStyle fontStyle5 = fontStyle2;
                                        i29 = iM7958getClipgIe3tQ8;
                                        fontStyle3 = fontStyle5;
                                        z3 = z;
                                        function14 = function1;
                                        composer2 = composerStartRestartGroup;
                                        color4 = color2;
                                        fontWeight4 = fontWeight2;
                                        textDecoration3 = textDecoration2;
                                        modifier5 = modifier2;
                                        textAlign4 = textAlign2;
                                        i30 = i2;
                                        i31 = i3;
                                        immutableMap3 = immutableMap;
                                        textStyle2 = textStyle;
                                    }
                                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                    if (scopeUpdateScopeEndRestartGroup == null) {
                                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoTextKt$$ExternalSyntheticLambda3
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj, Object obj2) {
                                                return BentoText2.BentoText_Qnj7Zds$lambda$5(text, modifier5, color4, fontStyle3, fontWeight4, textDecoration3, textAlign4, i29, z3, i30, i31, immutableMap3, function14, textStyle2, i4, i5, i6, (Composer) obj, ((Integer) obj2).intValue());
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                i24 = i34 | 384;
                                if ((i5 & 3072) == 0) {
                                }
                                int i352 = i24;
                                if ((i7 & 306783379) == 306783378) {
                                    composerStartRestartGroup.startDefaults();
                                    if ((i4 & 1) != 0) {
                                        if (i32 == 0) {
                                        }
                                        if (i8 != 0) {
                                        }
                                        if (i9 != 0) {
                                        }
                                        if (i10 != 0) {
                                        }
                                        if (i11 != 0) {
                                        }
                                        if (i12 != 0) {
                                        }
                                        if (i13 != 0) {
                                        }
                                        if (i15 == 0) {
                                        }
                                        if (i17 == 0) {
                                        }
                                        if (i19 == 0) {
                                        }
                                        if (i22 == 0) {
                                        }
                                        if (i23 == 0) {
                                        }
                                        if ((i6 & 8192) == 0) {
                                        }
                                        color3 = color2;
                                        i26 = i37;
                                        fontWeight3 = fontWeight2;
                                        z2 = z4;
                                        i27 = i36;
                                        textAlign3 = textAlign2;
                                        immutableMap2 = immutableMapPersistentMapOf;
                                        modifier4 = modifier3;
                                        i28 = iM7958getClipgIe3tQ8;
                                        composerStartRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        Modifier modifierWithBentoPlaceholder$default2 = LocalShowPlaceholder.withBentoPlaceholder$default(modifier4, false, null, 3, null);
                                        composerStartRestartGroup.startReplaceGroup(-791430700);
                                        if (color3 != null) {
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                        Modifier modifier72 = modifier4;
                                        boolean z52 = z2;
                                        int i382 = i25;
                                        int i392 = i7 << 3;
                                        int i402 = (i7 & 14) | (57344 & i392) | (i392 & 458752);
                                        int i412 = i7 << 9;
                                        int i422 = i402 | (234881024 & i412) | (i412 & 1879048192);
                                        int i432 = i382 << 12;
                                        int i442 = ((i7 >> 18) & 8176) | (57344 & i432) | (458752 & i432) | (i432 & 3670016);
                                        composer2 = composerStartRestartGroup;
                                        FontStyle fontStyle42 = fontStyle2;
                                        TextKt.m6029TextIbK3jfQ(text, modifierWithBentoPlaceholder$default2, jM22031getColor0d7_KjU, 0L, fontStyle42, fontWeight3, null, 0L, textDecoration2, textAlign3, 0L, i28, z52, i27, i26, immutableMap2, function13, TextStyle.m7655copyp1EtxEg$default(style, 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, new PlatformTextStyle(false), new LineHeightStyle(LineHeightStyle.Alignment.INSTANCE.m7890getProportionalPIaL0Z0(), LineHeightStyle.Trim.INSTANCE.m7911getNoneEVpEnUU(), (DefaultConstructorMarker) null), 0, 0, null, 15204351, null), composer2, i422, i442, 1224);
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        fontStyle3 = fontStyle42;
                                        fontWeight4 = fontWeight3;
                                        textDecoration3 = textDecoration2;
                                        textAlign4 = textAlign3;
                                        i29 = i28;
                                        z3 = z52;
                                        i30 = i27;
                                        i31 = i26;
                                        immutableMap3 = immutableMap2;
                                        function14 = function13;
                                        color4 = color3;
                                        modifier5 = modifier72;
                                        textStyle2 = style;
                                    }
                                }
                                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup == null) {
                                }
                            }
                            i17 = i16;
                            i18 = i6 & 1024;
                            if (i18 != 0) {
                            }
                            i21 = i6 & 2048;
                            if (i21 != 0) {
                            }
                            int i342 = i20;
                            i23 = i6 & 4096;
                            if (i23 == 0) {
                            }
                            if ((i5 & 3072) == 0) {
                            }
                            int i3522 = i24;
                            if ((i7 & 306783379) == 306783378) {
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                            }
                        }
                        i15 = i14;
                        i16 = i6 & 512;
                        if (i16 == 0) {
                        }
                        i17 = i16;
                        i18 = i6 & 1024;
                        if (i18 != 0) {
                        }
                        i21 = i6 & 2048;
                        if (i21 != 0) {
                        }
                        int i3422 = i20;
                        i23 = i6 & 4096;
                        if (i23 == 0) {
                        }
                        if ((i5 & 3072) == 0) {
                        }
                        int i35222 = i24;
                        if ((i7 & 306783379) == 306783378) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    fontWeight2 = fontWeight;
                    i11 = i6 & 32;
                    if (i11 != 0) {
                    }
                    i12 = i6 & 64;
                    if (i12 != 0) {
                    }
                    i13 = i6 & 128;
                    if (i13 != 0) {
                    }
                    i14 = i6 & 256;
                    if (i14 != 0) {
                    }
                    i15 = i14;
                    i16 = i6 & 512;
                    if (i16 == 0) {
                    }
                    i17 = i16;
                    i18 = i6 & 1024;
                    if (i18 != 0) {
                    }
                    i21 = i6 & 2048;
                    if (i21 != 0) {
                    }
                    int i34222 = i20;
                    i23 = i6 & 4096;
                    if (i23 == 0) {
                    }
                    if ((i5 & 3072) == 0) {
                    }
                    int i352222 = i24;
                    if ((i7 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                fontStyle2 = fontStyle;
                i10 = i6 & 16;
                if (i10 == 0) {
                }
                fontWeight2 = fontWeight;
                i11 = i6 & 32;
                if (i11 != 0) {
                }
                i12 = i6 & 64;
                if (i12 != 0) {
                }
                i13 = i6 & 128;
                if (i13 != 0) {
                }
                i14 = i6 & 256;
                if (i14 != 0) {
                }
                i15 = i14;
                i16 = i6 & 512;
                if (i16 == 0) {
                }
                i17 = i16;
                i18 = i6 & 1024;
                if (i18 != 0) {
                }
                i21 = i6 & 2048;
                if (i21 != 0) {
                }
                int i342222 = i20;
                i23 = i6 & 4096;
                if (i23 == 0) {
                }
                if ((i5 & 3072) == 0) {
                }
                int i3522222 = i24;
                if ((i7 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            color2 = color;
            i9 = i6 & 8;
            int i332 = 1024;
            if (i9 != 0) {
            }
            fontStyle2 = fontStyle;
            i10 = i6 & 16;
            if (i10 == 0) {
            }
            fontWeight2 = fontWeight;
            i11 = i6 & 32;
            if (i11 != 0) {
            }
            i12 = i6 & 64;
            if (i12 != 0) {
            }
            i13 = i6 & 128;
            if (i13 != 0) {
            }
            i14 = i6 & 256;
            if (i14 != 0) {
            }
            i15 = i14;
            i16 = i6 & 512;
            if (i16 == 0) {
            }
            i17 = i16;
            i18 = i6 & 1024;
            if (i18 != 0) {
            }
            i21 = i6 & 2048;
            if (i21 != 0) {
            }
            int i3422222 = i20;
            i23 = i6 & 4096;
            if (i23 == 0) {
            }
            if ((i5 & 3072) == 0) {
            }
            int i35222222 = i24;
            if ((i7 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i8 = i6 & 4;
        if (i8 == 0) {
        }
        color2 = color;
        i9 = i6 & 8;
        int i3322 = 1024;
        if (i9 != 0) {
        }
        fontStyle2 = fontStyle;
        i10 = i6 & 16;
        if (i10 == 0) {
        }
        fontWeight2 = fontWeight;
        i11 = i6 & 32;
        if (i11 != 0) {
        }
        i12 = i6 & 64;
        if (i12 != 0) {
        }
        i13 = i6 & 128;
        if (i13 != 0) {
        }
        i14 = i6 & 256;
        if (i14 != 0) {
        }
        i15 = i14;
        i16 = i6 & 512;
        if (i16 == 0) {
        }
        i17 = i16;
        i18 = i6 & 1024;
        if (i18 != 0) {
        }
        i21 = i6 & 2048;
        if (i21 != 0) {
        }
        int i34222222 = i20;
        i23 = i6 & 4096;
        if (i23 == 0) {
        }
        if ((i5 & 3072) == 0) {
        }
        int i352222222 = i24;
        if ((i7 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
