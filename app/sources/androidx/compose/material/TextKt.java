package androidx.compose.material;

import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.InlineTextContent;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Color3;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.Hyphens;
import androidx.compose.p011ui.text.style.LineBreak;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextDirection;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.TextUnit;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocal6;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.utils.extensions.ResourceTypes;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Text.kt */
@Metadata(m3635d1 = {"\u0000\u0084\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aÒ\u0001\u0010#\u001a\u00020\u001d2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\u0016\b\u0002\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001b2\b\b\u0002\u0010 \u001a\u00020\u001fH\u0007ø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001aÆ\u0001\u0010#\u001a\u00020\u001d2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001b2\b\b\u0002\u0010 \u001a\u00020\u001fH\u0007ø\u0001\u0000¢\u0006\u0004\b$\u0010%\u001aæ\u0001\u0010#\u001a\u00020\u001d2\u0006\u0010\u0001\u001a\u00020&2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\u0014\b\u0002\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020(0'2\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001b2\b\b\u0002\u0010 \u001a\u00020\u001fH\u0007ø\u0001\u0000¢\u0006\u0004\b*\u0010+\u001a%\u0010/\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020\u001f2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u001d0-H\u0007¢\u0006\u0004\b/\u00100\"\u001d\u00102\u001a\b\u0012\u0004\u0012\u00020\u001f018\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00066"}, m3636d2 = {"", "text", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Color;", ResourceTypes.COLOR, "Landroidx/compose/ui/unit/TextUnit;", "fontSize", "Landroidx/compose/ui/text/font/FontStyle;", "fontStyle", "Landroidx/compose/ui/text/font/FontWeight;", "fontWeight", "Landroidx/compose/ui/text/font/FontFamily;", "fontFamily", "letterSpacing", "Landroidx/compose/ui/text/style/TextDecoration;", "textDecoration", "Landroidx/compose/ui/text/style/TextAlign;", "textAlign", "lineHeight", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "", "softWrap", "", "maxLines", "minLines", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", "", "onTextLayout", "Landroidx/compose/ui/text/TextStyle;", ResourceTypes.STYLE, "Text--4IGK_g", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "Text", "Text-fLXpl1I", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/ui/text/AnnotatedString;", "", "Landroidx/compose/foundation/text/InlineTextContent;", "inlineContent", "Text-IbK3jfQ", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILjava/util/Map;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "value", "Lkotlin/Function0;", "content", "ProvideTextStyle", "(Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalTextStyle", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalTextStyle", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "material_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class TextKt {
    private static final CompositionLocal6<TextStyle> LocalTextStyle = CompositionLocal3.compositionLocalOf(SnapshotStateKt.structuralEqualityPolicy(), new Function0<TextStyle>() { // from class: androidx.compose.material.TextKt$LocalTextStyle$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final TextStyle invoke() {
            return Typography2.getDefaultTextStyle();
        }
    });

    /* JADX WARN: Removed duplicated region for block: B:100:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:275:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0118  */
    /* renamed from: Text--4IGK_g, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m5665Text4IGK_g(final String str, Modifier modifier, long j, long j2, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j3, TextDecoration textDecoration, TextAlign textAlign, long j4, int i, boolean z, int i2, int i3, Function1<? super TextLayoutResult, Unit> function1, TextStyle textStyle, Composer composer, final int i4, final int i5, final int i6) {
        int i7;
        int i8;
        long jM6726getUnspecified0d7_KjU;
        int i9;
        int i10;
        long jM8080getUnspecifiedXSAIIZE;
        int i11;
        FontStyle fontStyle2;
        int i12;
        FontWeight fontWeight2;
        int i13;
        FontFamily fontFamily2;
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
        int i25;
        boolean z2;
        int i26;
        int i27;
        int i28;
        int i29;
        Composer composer2;
        final Modifier modifier2;
        final TextAlign textAlign2;
        final int iM7958getClipgIe3tQ8;
        final int i30;
        final int i31;
        final Function1<? super TextLayoutResult, Unit> function12;
        final TextStyle textStyle2;
        final boolean z3;
        final long j5;
        final FontStyle fontStyle3;
        final long j6;
        final FontWeight fontWeight3;
        final FontFamily fontFamily3;
        final long j7;
        final TextDecoration textDecoration2;
        final long j8;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Modifier modifier3;
        int i32;
        int i33;
        Function1<? super TextLayoutResult, Unit> function13;
        TextStyle textStyle3;
        TextDecoration textDecoration3;
        FontStyle fontStyle4;
        long j9;
        FontWeight fontWeight4;
        FontFamily fontFamily4;
        long j10;
        long j11;
        Composer composerStartRestartGroup = composer.startRestartGroup(1028090691);
        if ((i6 & 1) != 0) {
            i7 = i4 | 6;
        } else if ((i4 & 6) == 0) {
            i7 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i4;
        } else {
            i7 = i4;
        }
        int i34 = i6 & 2;
        if (i34 != 0) {
            i7 |= 48;
        } else {
            if ((i4 & 48) == 0) {
                i7 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            i8 = i6 & 4;
            if (i8 == 0) {
                i9 = i7 | 384;
                jM6726getUnspecified0d7_KjU = j;
            } else {
                int i35 = i7;
                jM6726getUnspecified0d7_KjU = j;
                if ((i4 & 384) == 0) {
                    i35 |= composerStartRestartGroup.changed(jM6726getUnspecified0d7_KjU) ? 256 : 128;
                }
                i9 = i35;
            }
            i10 = i6 & 8;
            if (i10 == 0) {
                i9 |= 3072;
                jM8080getUnspecifiedXSAIIZE = j2;
            } else {
                jM8080getUnspecifiedXSAIIZE = j2;
                if ((i4 & 3072) == 0) {
                    i9 |= composerStartRestartGroup.changed(jM8080getUnspecifiedXSAIIZE) ? 2048 : 1024;
                }
            }
            i11 = i6 & 16;
            if (i11 == 0) {
                i9 |= 24576;
            } else {
                if ((i4 & 24576) == 0) {
                    fontStyle2 = fontStyle;
                    i9 |= composerStartRestartGroup.changed(fontStyle2) ? 16384 : 8192;
                }
                i12 = i6 & 32;
                if (i12 != 0) {
                    i9 |= 196608;
                    fontWeight2 = fontWeight;
                } else {
                    fontWeight2 = fontWeight;
                    if ((i4 & 196608) == 0) {
                        i9 |= composerStartRestartGroup.changed(fontWeight2) ? 131072 : 65536;
                    }
                }
                i13 = i6 & 64;
                if (i13 != 0) {
                    i9 |= 1572864;
                    fontFamily2 = fontFamily;
                } else {
                    fontFamily2 = fontFamily;
                    if ((i4 & 1572864) == 0) {
                        i9 |= composerStartRestartGroup.changed(fontFamily2) ? 1048576 : 524288;
                    }
                }
                i14 = i6 & 128;
                if (i14 != 0) {
                    i9 |= 12582912;
                } else {
                    if ((i4 & 12582912) == 0) {
                        i15 = i9 | (composerStartRestartGroup.changed(j3) ? 8388608 : 4194304);
                    }
                    i16 = i6 & 256;
                    if (i16 == 0) {
                        i15 |= 100663296;
                    } else {
                        if ((i4 & 100663296) == 0) {
                            i17 = i16;
                            i15 |= composerStartRestartGroup.changed(textDecoration) ? 67108864 : 33554432;
                        }
                        i18 = i6 & 512;
                        if (i18 != 0) {
                            i15 |= 805306368;
                            i19 = i18;
                        } else if ((i4 & 805306368) == 0) {
                            i19 = i18;
                            i15 |= composerStartRestartGroup.changed(textAlign) ? 536870912 : 268435456;
                        } else {
                            i19 = i18;
                        }
                        i20 = i15;
                        i21 = i6 & 1024;
                        if (i21 != 0) {
                            i22 = i5 | 6;
                        } else if ((i5 & 6) == 0) {
                            i22 = i5 | (composerStartRestartGroup.changed(j4) ? 4 : 2);
                        } else {
                            i22 = i5;
                        }
                        i23 = i6 & 2048;
                        if (i23 != 0) {
                            i22 |= 48;
                            i24 = i23;
                        } else if ((i5 & 48) == 0) {
                            i24 = i23;
                            i22 |= composerStartRestartGroup.changed(i) ? 32 : 16;
                        } else {
                            i24 = i23;
                        }
                        int i36 = i22;
                        i25 = i6 & 4096;
                        if (i25 != 0) {
                            i36 |= 384;
                        } else {
                            if ((i5 & 384) == 0) {
                                z2 = z;
                                i36 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
                            }
                            i26 = i6 & 8192;
                            if (i26 == 0) {
                                i27 = i36 | 3072;
                            } else {
                                int i37 = i36;
                                if ((i5 & 3072) == 0) {
                                    i27 = i37 | (composerStartRestartGroup.changed(i2) ? 2048 : 1024);
                                } else {
                                    i27 = i37;
                                }
                            }
                            i28 = i6 & 16384;
                            if (i28 != 0) {
                                if ((i5 & 24576) == 0) {
                                    i27 |= composerStartRestartGroup.changed(i3) ? 16384 : 8192;
                                }
                                i29 = i6 & 32768;
                                if (i29 != 0) {
                                    i27 |= 196608;
                                } else if ((i5 & 196608) == 0) {
                                    i27 |= composerStartRestartGroup.changedInstance(function1) ? 131072 : 65536;
                                }
                                if ((i5 & 1572864) == 0) {
                                    i27 |= ((i6 & 65536) == 0 && composerStartRestartGroup.changed(textStyle)) ? 1048576 : 524288;
                                }
                                if (composerStartRestartGroup.shouldExecute(((i20 & 306783379) == 306783378 && (599187 & i27) == 599186) ? false : true, i20 & 1)) {
                                    composerStartRestartGroup.startDefaults();
                                    if ((i4 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                        modifier3 = i34 != 0 ? Modifier.INSTANCE : modifier;
                                        if (i8 != 0) {
                                            jM6726getUnspecified0d7_KjU = Color.INSTANCE.m6726getUnspecified0d7_KjU();
                                        }
                                        if (i10 != 0) {
                                            jM8080getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m8080getUnspecifiedXSAIIZE();
                                        }
                                        if (i11 != 0) {
                                            fontStyle2 = null;
                                        }
                                        if (i12 != 0) {
                                            fontWeight2 = null;
                                        }
                                        if (i13 != 0) {
                                            fontFamily2 = null;
                                        }
                                        long jM8080getUnspecifiedXSAIIZE2 = i14 != 0 ? TextUnit.INSTANCE.m8080getUnspecifiedXSAIIZE() : j3;
                                        TextDecoration textDecoration4 = i17 != 0 ? null : textDecoration;
                                        textAlign2 = i19 != 0 ? null : textAlign;
                                        long jM8080getUnspecifiedXSAIIZE3 = i21 != 0 ? TextUnit.INSTANCE.m8080getUnspecifiedXSAIIZE() : j4;
                                        iM7958getClipgIe3tQ8 = i24 != 0 ? TextOverflow.INSTANCE.m7958getClipgIe3tQ8() : i;
                                        if (i25 != 0) {
                                            z2 = true;
                                        }
                                        i32 = i26 != 0 ? Integer.MAX_VALUE : i2;
                                        i33 = i28 == 0 ? i3 : 1;
                                        function13 = i29 == 0 ? function1 : null;
                                        if ((i6 & 65536) != 0) {
                                            i27 &= -3670017;
                                            textStyle3 = (TextStyle) composerStartRestartGroup.consume(LocalTextStyle);
                                        } else {
                                            textStyle3 = textStyle;
                                        }
                                        textDecoration3 = textDecoration4;
                                        fontStyle4 = fontStyle2;
                                        j9 = jM8080getUnspecifiedXSAIIZE;
                                        fontWeight4 = fontWeight2;
                                        fontFamily4 = fontFamily2;
                                        j10 = jM8080getUnspecifiedXSAIIZE2;
                                        j11 = jM8080getUnspecifiedXSAIIZE3;
                                    } else {
                                        composerStartRestartGroup.skipToGroupEnd();
                                        if ((i6 & 65536) != 0) {
                                            i27 &= -3670017;
                                        }
                                        modifier3 = modifier;
                                        j10 = j3;
                                        textDecoration3 = textDecoration;
                                        textAlign2 = textAlign;
                                        j11 = j4;
                                        iM7958getClipgIe3tQ8 = i;
                                        i32 = i2;
                                        i33 = i3;
                                        function13 = function1;
                                        textStyle3 = textStyle;
                                        fontStyle4 = fontStyle2;
                                        j9 = jM8080getUnspecifiedXSAIIZE;
                                        fontWeight4 = fontWeight2;
                                        fontFamily4 = fontFamily2;
                                    }
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1028090691, i20, i27, "androidx.compose.material.Text (Text.kt:110)");
                                    }
                                    final long jM7661getColor0d7_KjU = jM6726getUnspecified0d7_KjU != 16 ? jM6726getUnspecified0d7_KjU : textStyle3.m7661getColor0d7_KjU() != 16 ? textStyle3.m7661getColor0d7_KjU() : Color.m6705copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColor.getLocalContentColor())).getValue(), ((Number) composerStartRestartGroup.consume(ContentAlpha2.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                                    TextStyle textStyleM7671mergedA7vx0o = textStyle3.m7671mergedA7vx0o((16609105 & 1) != 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : 0L, (16609105 & 2) != 0 ? TextUnit.INSTANCE.m8080getUnspecifiedXSAIIZE() : j9, (16609105 & 4) != 0 ? null : fontWeight4, (16609105 & 8) != 0 ? null : fontStyle4, (16609105 & 16) != 0 ? null : null, (16609105 & 32) != 0 ? null : fontFamily4, (16609105 & 64) != 0 ? null : null, (16609105 & 128) != 0 ? TextUnit.INSTANCE.m8080getUnspecifiedXSAIIZE() : j10, (16609105 & 256) != 0 ? null : null, (16609105 & 512) != 0 ? null : null, (16609105 & 1024) != 0 ? null : null, (16609105 & 2048) != 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : 0L, (16609105 & 4096) != 0 ? null : textDecoration3, (16609105 & 8192) != 0 ? null : null, (16609105 & 16384) != 0 ? null : null, (16609105 & 32768) != 0 ? TextAlign.INSTANCE.m7925getUnspecifiede0LSkKk() : textAlign2 != null ? textAlign2.getValue() : TextAlign.INSTANCE.m7925getUnspecifiede0LSkKk(), (16609105 & 65536) != 0 ? TextDirection.INSTANCE.m7938getUnspecifieds_7Xco() : 0, (16609105 & 131072) != 0 ? TextUnit.INSTANCE.m8080getUnspecifiedXSAIIZE() : j11, (16609105 & 262144) != 0 ? null : null, (16609105 & 524288) != 0 ? null : null, (16609105 & 1048576) != 0 ? LineBreak.INSTANCE.m7860getUnspecifiedrAG3T2k() : 0, (16609105 & 2097152) != 0 ? Hyphens.INSTANCE.m7847getUnspecifiedvmbZdU8() : 0, (16609105 & 4194304) != 0 ? null : null, (16609105 & 8388608) != 0 ? null : null);
                                    boolean zChanged = composerStartRestartGroup.changed(jM7661getColor0d7_KjU);
                                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Color3() { // from class: androidx.compose.material.TextKt$Text$1$1
                                            @Override // androidx.compose.p011ui.graphics.Color3
                                            /* renamed from: invoke-0d7_KjU */
                                            public final long mo5580invoke0d7_KjU() {
                                                return jM7661getColor0d7_KjU;
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    int i38 = (i20 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) | ((i27 >> 6) & 7168);
                                    int i39 = i27 << 9;
                                    BasicTextKt.m5335BasicTextVhcvRP8(str, modifier3, textStyleM7671mergedA7vx0o, function13, iM7958getClipgIe3tQ8, z2, i32, i33, (Color3) objRememberedValue, composerStartRestartGroup, i38 | (57344 & i39) | (458752 & i39) | (3670016 & i39) | (i39 & 29360128), 0);
                                    composer2 = composerStartRestartGroup;
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    j5 = jM6726getUnspecified0d7_KjU;
                                    i30 = i32;
                                    i31 = i33;
                                    textStyle2 = textStyle3;
                                    fontWeight3 = fontWeight4;
                                    fontStyle3 = fontStyle4;
                                    fontFamily3 = fontFamily4;
                                    j7 = j10;
                                    textDecoration2 = textDecoration3;
                                    j8 = j11;
                                    function12 = function13;
                                    z3 = z2;
                                    j6 = j9;
                                    modifier2 = modifier3;
                                } else {
                                    composer2 = composerStartRestartGroup;
                                    composer2.skipToGroupEnd();
                                    modifier2 = modifier;
                                    textAlign2 = textAlign;
                                    iM7958getClipgIe3tQ8 = i;
                                    i30 = i2;
                                    i31 = i3;
                                    function12 = function1;
                                    textStyle2 = textStyle;
                                    z3 = z2;
                                    j5 = jM6726getUnspecified0d7_KjU;
                                    fontStyle3 = fontStyle2;
                                    j6 = jM8080getUnspecifiedXSAIIZE;
                                    fontWeight3 = fontWeight2;
                                    fontFamily3 = fontFamily2;
                                    j7 = j3;
                                    textDecoration2 = textDecoration;
                                    j8 = j4;
                                }
                                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextKt$Text$2
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            invoke(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer3, int i40) {
                                            TextKt.m5665Text4IGK_g(str, modifier2, j5, j6, fontStyle3, fontWeight3, fontFamily3, j7, textDecoration2, textAlign2, j8, iM7958getClipgIe3tQ8, z3, i30, i31, function12, textStyle2, composer3, RecomposeScopeImpl4.updateChangedFlags(i4 | 1), RecomposeScopeImpl4.updateChangedFlags(i5), i6);
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i27 |= 24576;
                            i29 = i6 & 32768;
                            if (i29 != 0) {
                            }
                            if ((i5 & 1572864) == 0) {
                            }
                            if (composerStartRestartGroup.shouldExecute(((i20 & 306783379) == 306783378 && (599187 & i27) == 599186) ? false : true, i20 & 1)) {
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                            }
                        }
                        z2 = z;
                        i26 = i6 & 8192;
                        if (i26 == 0) {
                        }
                        i28 = i6 & 16384;
                        if (i28 != 0) {
                        }
                        i29 = i6 & 32768;
                        if (i29 != 0) {
                        }
                        if ((i5 & 1572864) == 0) {
                        }
                        if (composerStartRestartGroup.shouldExecute(((i20 & 306783379) == 306783378 && (599187 & i27) == 599186) ? false : true, i20 & 1)) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    i17 = i16;
                    i18 = i6 & 512;
                    if (i18 != 0) {
                    }
                    i20 = i15;
                    i21 = i6 & 1024;
                    if (i21 != 0) {
                    }
                    i23 = i6 & 2048;
                    if (i23 != 0) {
                    }
                    int i362 = i22;
                    i25 = i6 & 4096;
                    if (i25 != 0) {
                    }
                    z2 = z;
                    i26 = i6 & 8192;
                    if (i26 == 0) {
                    }
                    i28 = i6 & 16384;
                    if (i28 != 0) {
                    }
                    i29 = i6 & 32768;
                    if (i29 != 0) {
                    }
                    if ((i5 & 1572864) == 0) {
                    }
                    if (composerStartRestartGroup.shouldExecute(((i20 & 306783379) == 306783378 && (599187 & i27) == 599186) ? false : true, i20 & 1)) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i15 = i9;
                i16 = i6 & 256;
                if (i16 == 0) {
                }
                i17 = i16;
                i18 = i6 & 512;
                if (i18 != 0) {
                }
                i20 = i15;
                i21 = i6 & 1024;
                if (i21 != 0) {
                }
                i23 = i6 & 2048;
                if (i23 != 0) {
                }
                int i3622 = i22;
                i25 = i6 & 4096;
                if (i25 != 0) {
                }
                z2 = z;
                i26 = i6 & 8192;
                if (i26 == 0) {
                }
                i28 = i6 & 16384;
                if (i28 != 0) {
                }
                i29 = i6 & 32768;
                if (i29 != 0) {
                }
                if ((i5 & 1572864) == 0) {
                }
                if (composerStartRestartGroup.shouldExecute(((i20 & 306783379) == 306783378 && (599187 & i27) == 599186) ? false : true, i20 & 1)) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            fontStyle2 = fontStyle;
            i12 = i6 & 32;
            if (i12 != 0) {
            }
            i13 = i6 & 64;
            if (i13 != 0) {
            }
            i14 = i6 & 128;
            if (i14 != 0) {
            }
            i15 = i9;
            i16 = i6 & 256;
            if (i16 == 0) {
            }
            i17 = i16;
            i18 = i6 & 512;
            if (i18 != 0) {
            }
            i20 = i15;
            i21 = i6 & 1024;
            if (i21 != 0) {
            }
            i23 = i6 & 2048;
            if (i23 != 0) {
            }
            int i36222 = i22;
            i25 = i6 & 4096;
            if (i25 != 0) {
            }
            z2 = z;
            i26 = i6 & 8192;
            if (i26 == 0) {
            }
            i28 = i6 & 16384;
            if (i28 != 0) {
            }
            i29 = i6 & 32768;
            if (i29 != 0) {
            }
            if ((i5 & 1572864) == 0) {
            }
            if (composerStartRestartGroup.shouldExecute(((i20 & 306783379) == 306783378 && (599187 & i27) == 599186) ? false : true, i20 & 1)) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i8 = i6 & 4;
        if (i8 == 0) {
        }
        i10 = i6 & 8;
        if (i10 == 0) {
        }
        i11 = i6 & 16;
        if (i11 == 0) {
        }
        fontStyle2 = fontStyle;
        i12 = i6 & 32;
        if (i12 != 0) {
        }
        i13 = i6 & 64;
        if (i13 != 0) {
        }
        i14 = i6 & 128;
        if (i14 != 0) {
        }
        i15 = i9;
        i16 = i6 & 256;
        if (i16 == 0) {
        }
        i17 = i16;
        i18 = i6 & 512;
        if (i18 != 0) {
        }
        i20 = i15;
        i21 = i6 & 1024;
        if (i21 != 0) {
        }
        i23 = i6 & 2048;
        if (i23 != 0) {
        }
        int i362222 = i22;
        i25 = i6 & 4096;
        if (i25 != 0) {
        }
        z2 = z;
        i26 = i6 & 8192;
        if (i26 == 0) {
        }
        i28 = i6 & 16384;
        if (i28 != 0) {
        }
        i29 = i6 & 32768;
        if (i29 != 0) {
        }
        if ((i5 & 1572864) == 0) {
        }
        if (composerStartRestartGroup.shouldExecute(((i20 & 306783379) == 306783378 && (599187 & i27) == 599186) ? false : true, i20 & 1)) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:246:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0118  */
    @Deprecated
    /* renamed from: Text-fLXpl1I, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m5667TextfLXpl1I(final String str, Modifier modifier, long j, long j2, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j3, TextDecoration textDecoration, TextAlign textAlign, long j4, int i, boolean z, int i2, Function1 function1, TextStyle textStyle, Composer composer, final int i3, final int i4, final int i5) {
        int i6;
        int i7;
        long jM6726getUnspecified0d7_KjU;
        int i8;
        int i9;
        long jM8080getUnspecifiedXSAIIZE;
        int i10;
        FontStyle fontStyle2;
        int i11;
        FontWeight fontWeight2;
        int i12;
        FontFamily fontFamily2;
        int i13;
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
        boolean z2;
        int i25;
        int i26;
        int i27;
        Composer composer2;
        final Modifier modifier2;
        final TextAlign textAlign2;
        final int i28;
        final int i29;
        final Function1 function12;
        final TextStyle textStyle2;
        final boolean z3;
        final long j5;
        final FontStyle fontStyle3;
        final long j6;
        final FontWeight fontWeight3;
        final FontFamily fontFamily3;
        final long j7;
        final TextDecoration textDecoration2;
        final long j8;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        TextAlign textAlign3;
        boolean z4;
        long j9;
        TextStyle textStyle3;
        Function1 function13;
        int i30;
        Modifier modifier3;
        int i31;
        long j10;
        TextDecoration textDecoration3;
        long j11;
        FontWeight fontWeight4;
        FontFamily fontFamily4;
        long j12;
        Composer composerStartRestartGroup = composer.startRestartGroup(-366126944);
        if ((i5 & 1) != 0) {
            i6 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i6 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        int i32 = i5 & 2;
        if (i32 != 0) {
            i6 |= 48;
        } else {
            if ((i3 & 48) == 0) {
                i6 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            i7 = i5 & 4;
            if (i7 == 0) {
                i8 = i6 | 384;
                jM6726getUnspecified0d7_KjU = j;
            } else {
                int i33 = i6;
                jM6726getUnspecified0d7_KjU = j;
                if ((i3 & 384) == 0) {
                    i33 |= composerStartRestartGroup.changed(jM6726getUnspecified0d7_KjU) ? 256 : 128;
                }
                i8 = i33;
            }
            i9 = i5 & 8;
            if (i9 == 0) {
                i8 |= 3072;
                jM8080getUnspecifiedXSAIIZE = j2;
            } else {
                jM8080getUnspecifiedXSAIIZE = j2;
                if ((i3 & 3072) == 0) {
                    i8 |= composerStartRestartGroup.changed(jM8080getUnspecifiedXSAIIZE) ? 2048 : 1024;
                }
            }
            i10 = i5 & 16;
            if (i10 == 0) {
                i8 |= 24576;
            } else {
                if ((i3 & 24576) == 0) {
                    fontStyle2 = fontStyle;
                    i8 |= composerStartRestartGroup.changed(fontStyle2) ? 16384 : 8192;
                }
                i11 = i5 & 32;
                int i34 = 65536;
                if (i11 != 0) {
                    i8 |= 196608;
                    fontWeight2 = fontWeight;
                } else {
                    fontWeight2 = fontWeight;
                    if ((i3 & 196608) == 0) {
                        i8 |= composerStartRestartGroup.changed(fontWeight2) ? 131072 : 65536;
                    }
                }
                i12 = i5 & 64;
                if (i12 != 0) {
                    i8 |= 1572864;
                    fontFamily2 = fontFamily;
                } else {
                    fontFamily2 = fontFamily;
                    if ((i3 & 1572864) == 0) {
                        i8 |= composerStartRestartGroup.changed(fontFamily2) ? 1048576 : 524288;
                    }
                }
                i13 = i5 & 128;
                if (i13 != 0) {
                    i8 |= 12582912;
                } else {
                    if ((i3 & 12582912) == 0) {
                        i14 = i8 | (composerStartRestartGroup.changed(j3) ? 8388608 : 4194304);
                    }
                    i15 = i5 & 256;
                    if (i15 == 0) {
                        i14 |= 100663296;
                    } else {
                        if ((i3 & 100663296) == 0) {
                            i16 = i15;
                            i14 |= composerStartRestartGroup.changed(textDecoration) ? 67108864 : 33554432;
                        }
                        i17 = i5 & 512;
                        if (i17 != 0) {
                            i14 |= 805306368;
                            i18 = i17;
                        } else if ((i3 & 805306368) == 0) {
                            i18 = i17;
                            i14 |= composerStartRestartGroup.changed(textAlign) ? 536870912 : 268435456;
                        } else {
                            i18 = i17;
                        }
                        i19 = i14;
                        i20 = i5 & 1024;
                        if (i20 != 0) {
                            i21 = i4 | 6;
                        } else if ((i4 & 6) == 0) {
                            i21 = i4 | (composerStartRestartGroup.changed(j4) ? 4 : 2);
                        } else {
                            i21 = i4;
                        }
                        i22 = i5 & 2048;
                        if (i22 != 0) {
                            i21 |= 48;
                            i23 = i22;
                        } else if ((i4 & 48) == 0) {
                            i23 = i22;
                            i21 |= composerStartRestartGroup.changed(i) ? 32 : 16;
                        } else {
                            i23 = i22;
                        }
                        int i35 = i21;
                        i24 = i5 & 4096;
                        if (i24 != 0) {
                            i35 |= 384;
                        } else {
                            if ((i4 & 384) == 0) {
                                z2 = z;
                                i35 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
                            }
                            i25 = i5 & 8192;
                            if (i25 == 0) {
                                i26 = i35 | 3072;
                            } else {
                                int i36 = i35;
                                if ((i4 & 3072) == 0) {
                                    i26 = i36 | (composerStartRestartGroup.changed(i2) ? 2048 : 1024);
                                } else {
                                    i26 = i36;
                                }
                            }
                            i27 = i5 & 16384;
                            if (i27 != 0) {
                                if ((i4 & 24576) == 0) {
                                    i26 |= composerStartRestartGroup.changedInstance(function1) ? 16384 : 8192;
                                }
                                if ((i4 & 196608) == 0) {
                                    if ((i5 & 32768) == 0 && composerStartRestartGroup.changed(textStyle)) {
                                        i34 = 131072;
                                    }
                                    i26 |= i34;
                                }
                                if (composerStartRestartGroup.shouldExecute(((i19 & 306783379) == 306783378 && (74899 & i26) == 74898) ? false : true, i19 & 1)) {
                                    composerStartRestartGroup.startDefaults();
                                    if ((i3 & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                                        composerStartRestartGroup.skipToGroupEnd();
                                        if ((i5 & 32768) != 0) {
                                            i26 &= -458753;
                                        }
                                        modifier3 = modifier;
                                        textAlign3 = textAlign;
                                        j9 = j4;
                                        i30 = i;
                                        i31 = i2;
                                        function13 = function1;
                                        textStyle3 = textStyle;
                                        z4 = z2;
                                        j10 = jM6726getUnspecified0d7_KjU;
                                        j11 = jM8080getUnspecifiedXSAIIZE;
                                        fontWeight4 = fontWeight2;
                                        fontFamily4 = fontFamily2;
                                        j12 = j3;
                                        textDecoration3 = textDecoration;
                                    } else {
                                        Modifier modifier4 = i32 != 0 ? Modifier.INSTANCE : modifier;
                                        if (i7 != 0) {
                                            jM6726getUnspecified0d7_KjU = Color.INSTANCE.m6726getUnspecified0d7_KjU();
                                        }
                                        if (i9 != 0) {
                                            jM8080getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m8080getUnspecifiedXSAIIZE();
                                        }
                                        if (i10 != 0) {
                                            fontStyle2 = null;
                                        }
                                        if (i11 != 0) {
                                            fontWeight2 = null;
                                        }
                                        if (i12 != 0) {
                                            fontFamily2 = null;
                                        }
                                        long jM8080getUnspecifiedXSAIIZE2 = i13 != 0 ? TextUnit.INSTANCE.m8080getUnspecifiedXSAIIZE() : j3;
                                        TextDecoration textDecoration4 = i16 != 0 ? null : textDecoration;
                                        TextAlign textAlign4 = i18 == 0 ? textAlign : null;
                                        long jM8080getUnspecifiedXSAIIZE3 = i20 != 0 ? TextUnit.INSTANCE.m8080getUnspecifiedXSAIIZE() : j4;
                                        int iM7958getClipgIe3tQ8 = i23 != 0 ? TextOverflow.INSTANCE.m7958getClipgIe3tQ8() : i;
                                        boolean z5 = i24 == 0 ? z2 : true;
                                        int i37 = i25 != 0 ? Integer.MAX_VALUE : i2;
                                        Function1 function14 = i27 != 0 ? new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material.TextKt$Text$3
                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(TextLayoutResult textLayoutResult) {
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                                invoke2(textLayoutResult);
                                                return Unit.INSTANCE;
                                            }
                                        } : function1;
                                        Modifier modifier5 = modifier4;
                                        if ((i5 & 32768) != 0) {
                                            i26 &= -458753;
                                            textAlign3 = textAlign4;
                                            z4 = z5;
                                            j9 = jM8080getUnspecifiedXSAIIZE3;
                                            textStyle3 = (TextStyle) composerStartRestartGroup.consume(LocalTextStyle);
                                        } else {
                                            textAlign3 = textAlign4;
                                            z4 = z5;
                                            j9 = jM8080getUnspecifiedXSAIIZE3;
                                            textStyle3 = textStyle;
                                        }
                                        function13 = function14;
                                        i30 = iM7958getClipgIe3tQ8;
                                        modifier3 = modifier5;
                                        long j13 = jM8080getUnspecifiedXSAIIZE2;
                                        i31 = i37;
                                        j10 = jM6726getUnspecified0d7_KjU;
                                        FontFamily fontFamily5 = fontFamily2;
                                        textDecoration3 = textDecoration4;
                                        j11 = jM8080getUnspecifiedXSAIIZE;
                                        fontWeight4 = fontWeight2;
                                        fontFamily4 = fontFamily5;
                                        j12 = j13;
                                    }
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-366126944, i19, i26, "androidx.compose.material.Text (Text.kt:184)");
                                    }
                                    int i38 = i26 << 3;
                                    composer2 = composerStartRestartGroup;
                                    m5665Text4IGK_g(str, modifier3, j10, j11, fontStyle2, fontWeight4, fontFamily4, j12, textDecoration3, textAlign3, j9, i30, z4, i31, 1, function13, textStyle3, composer2, i19 & 2147483646, (i26 & 14) | 24576 | (i26 & 112) | (i26 & 896) | (i26 & 7168) | (458752 & i38) | (i38 & 3670016), 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    modifier2 = modifier3;
                                    j5 = j10;
                                    j6 = j11;
                                    fontStyle3 = fontStyle2;
                                    fontWeight3 = fontWeight4;
                                    fontFamily3 = fontFamily4;
                                    j7 = j12;
                                    textDecoration2 = textDecoration3;
                                    textAlign2 = textAlign3;
                                    j8 = j9;
                                    i28 = i30;
                                    z3 = z4;
                                    i29 = i31;
                                    function12 = function13;
                                    textStyle2 = textStyle3;
                                } else {
                                    composer2 = composerStartRestartGroup;
                                    composer2.skipToGroupEnd();
                                    modifier2 = modifier;
                                    textAlign2 = textAlign;
                                    i28 = i;
                                    i29 = i2;
                                    function12 = function1;
                                    textStyle2 = textStyle;
                                    z3 = z2;
                                    j5 = jM6726getUnspecified0d7_KjU;
                                    fontStyle3 = fontStyle2;
                                    j6 = jM8080getUnspecifiedXSAIIZE;
                                    fontWeight3 = fontWeight2;
                                    fontFamily3 = fontFamily2;
                                    j7 = j3;
                                    textDecoration2 = textDecoration;
                                    j8 = j4;
                                }
                                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextKt$Text$4
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            invoke(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer3, int i39) {
                                            TextKt.m5667TextfLXpl1I(str, modifier2, j5, j6, fontStyle3, fontWeight3, fontFamily3, j7, textDecoration2, textAlign2, j8, i28, z3, i29, function12, textStyle2, composer3, RecomposeScopeImpl4.updateChangedFlags(i3 | 1), RecomposeScopeImpl4.updateChangedFlags(i4), i5);
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i26 |= 24576;
                            if ((i4 & 196608) == 0) {
                            }
                            if (composerStartRestartGroup.shouldExecute(((i19 & 306783379) == 306783378 && (74899 & i26) == 74898) ? false : true, i19 & 1)) {
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                            }
                        }
                        z2 = z;
                        i25 = i5 & 8192;
                        if (i25 == 0) {
                        }
                        i27 = i5 & 16384;
                        if (i27 != 0) {
                        }
                        if ((i4 & 196608) == 0) {
                        }
                        if (composerStartRestartGroup.shouldExecute(((i19 & 306783379) == 306783378 && (74899 & i26) == 74898) ? false : true, i19 & 1)) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    i16 = i15;
                    i17 = i5 & 512;
                    if (i17 != 0) {
                    }
                    i19 = i14;
                    i20 = i5 & 1024;
                    if (i20 != 0) {
                    }
                    i22 = i5 & 2048;
                    if (i22 != 0) {
                    }
                    int i352 = i21;
                    i24 = i5 & 4096;
                    if (i24 != 0) {
                    }
                    z2 = z;
                    i25 = i5 & 8192;
                    if (i25 == 0) {
                    }
                    i27 = i5 & 16384;
                    if (i27 != 0) {
                    }
                    if ((i4 & 196608) == 0) {
                    }
                    if (composerStartRestartGroup.shouldExecute(((i19 & 306783379) == 306783378 && (74899 & i26) == 74898) ? false : true, i19 & 1)) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i14 = i8;
                i15 = i5 & 256;
                if (i15 == 0) {
                }
                i16 = i15;
                i17 = i5 & 512;
                if (i17 != 0) {
                }
                i19 = i14;
                i20 = i5 & 1024;
                if (i20 != 0) {
                }
                i22 = i5 & 2048;
                if (i22 != 0) {
                }
                int i3522 = i21;
                i24 = i5 & 4096;
                if (i24 != 0) {
                }
                z2 = z;
                i25 = i5 & 8192;
                if (i25 == 0) {
                }
                i27 = i5 & 16384;
                if (i27 != 0) {
                }
                if ((i4 & 196608) == 0) {
                }
                if (composerStartRestartGroup.shouldExecute(((i19 & 306783379) == 306783378 && (74899 & i26) == 74898) ? false : true, i19 & 1)) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            fontStyle2 = fontStyle;
            i11 = i5 & 32;
            int i342 = 65536;
            if (i11 != 0) {
            }
            i12 = i5 & 64;
            if (i12 != 0) {
            }
            i13 = i5 & 128;
            if (i13 != 0) {
            }
            i14 = i8;
            i15 = i5 & 256;
            if (i15 == 0) {
            }
            i16 = i15;
            i17 = i5 & 512;
            if (i17 != 0) {
            }
            i19 = i14;
            i20 = i5 & 1024;
            if (i20 != 0) {
            }
            i22 = i5 & 2048;
            if (i22 != 0) {
            }
            int i35222 = i21;
            i24 = i5 & 4096;
            if (i24 != 0) {
            }
            z2 = z;
            i25 = i5 & 8192;
            if (i25 == 0) {
            }
            i27 = i5 & 16384;
            if (i27 != 0) {
            }
            if ((i4 & 196608) == 0) {
            }
            if (composerStartRestartGroup.shouldExecute(((i19 & 306783379) == 306783378 && (74899 & i26) == 74898) ? false : true, i19 & 1)) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i7 = i5 & 4;
        if (i7 == 0) {
        }
        i9 = i5 & 8;
        if (i9 == 0) {
        }
        i10 = i5 & 16;
        if (i10 == 0) {
        }
        fontStyle2 = fontStyle;
        i11 = i5 & 32;
        int i3422 = 65536;
        if (i11 != 0) {
        }
        i12 = i5 & 64;
        if (i12 != 0) {
        }
        i13 = i5 & 128;
        if (i13 != 0) {
        }
        i14 = i8;
        i15 = i5 & 256;
        if (i15 == 0) {
        }
        i16 = i15;
        i17 = i5 & 512;
        if (i17 != 0) {
        }
        i19 = i14;
        i20 = i5 & 1024;
        if (i20 != 0) {
        }
        i22 = i5 & 2048;
        if (i22 != 0) {
        }
        int i352222 = i21;
        i24 = i5 & 4096;
        if (i24 != 0) {
        }
        z2 = z;
        i25 = i5 & 8192;
        if (i25 == 0) {
        }
        i27 = i5 & 16384;
        if (i27 != 0) {
        }
        if ((i4 & 196608) == 0) {
        }
        if (composerStartRestartGroup.shouldExecute(((i19 & 306783379) == 306783378 && (74899 & i26) == 74898) ? false : true, i19 & 1)) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:284:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x012c  */
    /* renamed from: Text-IbK3jfQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m5666TextIbK3jfQ(final AnnotatedString annotatedString, Modifier modifier, long j, long j2, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j3, TextDecoration textDecoration, TextAlign textAlign, long j4, int i, boolean z, int i2, int i3, Map<String, InlineTextContent> map, Function1<? super TextLayoutResult, Unit> function1, TextStyle textStyle, Composer composer, final int i4, final int i5, final int i6) {
        int i7;
        int i8;
        int i9;
        long jM8080getUnspecifiedXSAIIZE;
        int i10;
        FontStyle fontStyle2;
        int i11;
        FontWeight fontWeight2;
        int i12;
        FontFamily fontFamily2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z2;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        Composer composer2;
        Modifier modifier2;
        long jM6726getUnspecified0d7_KjU;
        final TextDecoration textDecoration2;
        final int i28;
        final int i29;
        final int i30;
        final Map<String, InlineTextContent> map2;
        final Function1<? super TextLayoutResult, Unit> function12;
        final TextStyle textStyle2;
        final boolean z3;
        final FontStyle fontStyle3;
        final long j5;
        final FontWeight fontWeight3;
        final FontFamily fontFamily3;
        final long j6;
        final TextAlign textAlign2;
        final long j7;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Modifier modifier3;
        TextAlign textAlign3;
        int iM7958getClipgIe3tQ8;
        int i31;
        int i32;
        Map<String, InlineTextContent> mapEmptyMap;
        Function1<? super TextLayoutResult, Unit> function13;
        TextStyle textStyle3;
        TextDecoration textDecoration3;
        FontStyle fontStyle4;
        long j8;
        FontWeight fontWeight4;
        FontFamily fontFamily4;
        long j9;
        int i33;
        long j10;
        Composer composerStartRestartGroup = composer.startRestartGroup(744129681);
        if ((i6 & 1) != 0) {
            i7 = i4 | 6;
        } else if ((i4 & 6) == 0) {
            i7 = (composerStartRestartGroup.changed(annotatedString) ? 4 : 2) | i4;
        } else {
            i7 = i4;
        }
        int i34 = i6 & 2;
        if (i34 != 0) {
            i7 |= 48;
        } else {
            if ((i4 & 48) == 0) {
                i7 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            i8 = i6 & 4;
            if (i8 == 0) {
                i7 |= 384;
            } else if ((i4 & 384) == 0) {
                i7 |= composerStartRestartGroup.changed(j) ? 256 : 128;
            }
            i9 = i6 & 8;
            if (i9 == 0) {
                i7 |= 3072;
                jM8080getUnspecifiedXSAIIZE = j2;
            } else {
                jM8080getUnspecifiedXSAIIZE = j2;
                if ((i4 & 3072) == 0) {
                    i7 |= composerStartRestartGroup.changed(jM8080getUnspecifiedXSAIIZE) ? 2048 : 1024;
                }
            }
            i10 = i6 & 16;
            if (i10 == 0) {
                i7 |= 24576;
            } else {
                if ((i4 & 24576) == 0) {
                    fontStyle2 = fontStyle;
                    i7 |= composerStartRestartGroup.changed(fontStyle2) ? 16384 : 8192;
                }
                i11 = i6 & 32;
                if (i11 != 0) {
                    i7 |= 196608;
                    fontWeight2 = fontWeight;
                } else {
                    fontWeight2 = fontWeight;
                    if ((i4 & 196608) == 0) {
                        i7 |= composerStartRestartGroup.changed(fontWeight2) ? 131072 : 65536;
                    }
                }
                i12 = i6 & 64;
                if (i12 != 0) {
                    i7 |= 1572864;
                    fontFamily2 = fontFamily;
                } else {
                    fontFamily2 = fontFamily;
                    if ((i4 & 1572864) == 0) {
                        i7 |= composerStartRestartGroup.changed(fontFamily2) ? 1048576 : 524288;
                    }
                }
                i13 = i6 & 128;
                if (i13 != 0) {
                    i7 |= 12582912;
                } else if ((i4 & 12582912) == 0) {
                    i7 |= composerStartRestartGroup.changed(j3) ? 8388608 : 4194304;
                }
                i14 = i6 & 256;
                if (i14 != 0) {
                    i7 |= 100663296;
                } else if ((i4 & 100663296) == 0) {
                    i7 |= composerStartRestartGroup.changed(textDecoration) ? 67108864 : 33554432;
                }
                i15 = i6 & 512;
                if (i15 != 0) {
                    i7 |= 805306368;
                } else {
                    if ((i4 & 805306368) == 0) {
                        i16 = i15;
                        i7 |= composerStartRestartGroup.changed(textAlign) ? 536870912 : 268435456;
                    }
                    i17 = i6 & 1024;
                    if (i17 == 0) {
                        i18 = i5 | 6;
                    } else if ((i5 & 6) == 0) {
                        i18 = i5 | (composerStartRestartGroup.changed(j4) ? 4 : 2);
                    } else {
                        i18 = i5;
                    }
                    i19 = i6 & 2048;
                    if (i19 == 0) {
                        i18 |= 48;
                        i20 = i19;
                    } else if ((i5 & 48) == 0) {
                        i20 = i19;
                        i18 |= composerStartRestartGroup.changed(i) ? 32 : 16;
                    } else {
                        i20 = i19;
                    }
                    int i35 = i18;
                    i21 = i6 & 4096;
                    if (i21 == 0) {
                        i35 |= 384;
                    } else {
                        if ((i5 & 384) == 0) {
                            z2 = z;
                            i35 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
                        }
                        i22 = i6 & 8192;
                        if (i22 != 0) {
                            i23 = i35 | 3072;
                        } else {
                            int i36 = i35;
                            if ((i5 & 3072) == 0) {
                                i23 = i36 | (composerStartRestartGroup.changed(i2) ? 2048 : 1024);
                            } else {
                                i23 = i36;
                            }
                        }
                        i24 = i6 & 16384;
                        if (i24 == 0) {
                            i25 = i23;
                            if ((i5 & 24576) == 0) {
                                i25 |= composerStartRestartGroup.changed(i3) ? 16384 : 8192;
                            }
                            i26 = i6 & 32768;
                            if (i26 == 0) {
                                i25 |= 196608;
                            } else if ((i5 & 196608) == 0) {
                                i25 |= composerStartRestartGroup.changedInstance(map) ? 131072 : 65536;
                            }
                            i27 = i6 & 65536;
                            if (i27 == 0) {
                                i25 |= 1572864;
                            } else if ((i5 & 1572864) == 0) {
                                i25 |= composerStartRestartGroup.changedInstance(function1) ? 1048576 : 524288;
                            }
                            if ((i5 & 12582912) == 0) {
                                i25 |= ((i6 & 131072) == 0 && composerStartRestartGroup.changed(textStyle)) ? 8388608 : 4194304;
                            }
                            if (composerStartRestartGroup.shouldExecute((i7 & 306783379) == 306783378 || (i25 & 4793491) != 4793490, i7 & 1)) {
                                composer2 = composerStartRestartGroup;
                                composer2.skipToGroupEnd();
                                modifier2 = modifier;
                                jM6726getUnspecified0d7_KjU = j;
                                textDecoration2 = textDecoration;
                                i28 = i;
                                i29 = i2;
                                i30 = i3;
                                map2 = map;
                                function12 = function1;
                                textStyle2 = textStyle;
                                z3 = z2;
                                fontStyle3 = fontStyle2;
                                j5 = jM8080getUnspecifiedXSAIIZE;
                                fontWeight3 = fontWeight2;
                                fontFamily3 = fontFamily2;
                                j6 = j3;
                                textAlign2 = textAlign;
                                j7 = j4;
                            } else {
                                composerStartRestartGroup.startDefaults();
                                if ((i4 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                    modifier3 = i34 != 0 ? Modifier.INSTANCE : modifier;
                                    jM6726getUnspecified0d7_KjU = i8 != 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : j;
                                    if (i9 != 0) {
                                        jM8080getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m8080getUnspecifiedXSAIIZE();
                                    }
                                    if (i10 != 0) {
                                        fontStyle2 = null;
                                    }
                                    if (i11 != 0) {
                                        fontWeight2 = null;
                                    }
                                    if (i12 != 0) {
                                        fontFamily2 = null;
                                    }
                                    long jM8080getUnspecifiedXSAIIZE2 = i13 != 0 ? TextUnit.INSTANCE.m8080getUnspecifiedXSAIIZE() : j3;
                                    TextDecoration textDecoration4 = i14 != 0 ? null : textDecoration;
                                    textAlign3 = i16 == 0 ? textAlign : null;
                                    long jM8080getUnspecifiedXSAIIZE3 = i17 != 0 ? TextUnit.INSTANCE.m8080getUnspecifiedXSAIIZE() : j4;
                                    iM7958getClipgIe3tQ8 = i20 != 0 ? TextOverflow.INSTANCE.m7958getClipgIe3tQ8() : i;
                                    if (i21 != 0) {
                                        z2 = true;
                                    }
                                    i31 = i22 != 0 ? Integer.MAX_VALUE : i2;
                                    i32 = i24 == 0 ? i3 : 1;
                                    mapEmptyMap = i26 != 0 ? MapsKt.emptyMap() : map;
                                    function13 = i27 != 0 ? new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material.TextKt$Text$5
                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(TextLayoutResult textLayoutResult) {
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                            invoke2(textLayoutResult);
                                            return Unit.INSTANCE;
                                        }
                                    } : function1;
                                    Modifier modifier4 = modifier3;
                                    if ((i6 & 131072) != 0) {
                                        textStyle3 = (TextStyle) composerStartRestartGroup.consume(LocalTextStyle);
                                        textDecoration3 = textDecoration4;
                                        fontStyle4 = fontStyle2;
                                        j8 = jM8080getUnspecifiedXSAIIZE;
                                        fontWeight4 = fontWeight2;
                                        fontFamily4 = fontFamily2;
                                        j9 = jM8080getUnspecifiedXSAIIZE2;
                                        i33 = i25 & (-29360129);
                                        j10 = jM8080getUnspecifiedXSAIIZE3;
                                        modifier3 = modifier4;
                                    } else {
                                        textStyle3 = textStyle;
                                        textDecoration3 = textDecoration4;
                                        fontStyle4 = fontStyle2;
                                        j8 = jM8080getUnspecifiedXSAIIZE;
                                        fontWeight4 = fontWeight2;
                                        fontFamily4 = fontFamily2;
                                        j9 = jM8080getUnspecifiedXSAIIZE2;
                                        i33 = i25;
                                        j10 = jM8080getUnspecifiedXSAIIZE3;
                                    }
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    if ((i6 & 131072) != 0) {
                                        i25 &= -29360129;
                                    }
                                    modifier3 = modifier;
                                    jM6726getUnspecified0d7_KjU = j;
                                    j9 = j3;
                                    textDecoration3 = textDecoration;
                                    textAlign3 = textAlign;
                                    j10 = j4;
                                    iM7958getClipgIe3tQ8 = i;
                                    i31 = i2;
                                    i32 = i3;
                                    mapEmptyMap = map;
                                    function13 = function1;
                                    textStyle3 = textStyle;
                                    fontStyle4 = fontStyle2;
                                    j8 = jM8080getUnspecifiedXSAIIZE;
                                    fontWeight4 = fontWeight2;
                                    fontFamily4 = fontFamily2;
                                    i33 = i25;
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(744129681, i7, i33, "androidx.compose.material.Text (Text.kt:283)");
                                }
                                final long jM7661getColor0d7_KjU = jM6726getUnspecified0d7_KjU != 16 ? jM6726getUnspecified0d7_KjU : textStyle3.m7661getColor0d7_KjU() != 16 ? textStyle3.m7661getColor0d7_KjU() : Color.m6705copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColor.getLocalContentColor())).getValue(), ((Number) composerStartRestartGroup.consume(ContentAlpha2.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                                TextStyle textStyleM7671mergedA7vx0o = textStyle3.m7671mergedA7vx0o((16609105 & 1) != 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : 0L, (16609105 & 2) != 0 ? TextUnit.INSTANCE.m8080getUnspecifiedXSAIIZE() : j8, (16609105 & 4) != 0 ? null : fontWeight4, (16609105 & 8) != 0 ? null : fontStyle4, (16609105 & 16) != 0 ? null : null, (16609105 & 32) != 0 ? null : fontFamily4, (16609105 & 64) != 0 ? null : null, (16609105 & 128) != 0 ? TextUnit.INSTANCE.m8080getUnspecifiedXSAIIZE() : j9, (16609105 & 256) != 0 ? null : null, (16609105 & 512) != 0 ? null : null, (16609105 & 1024) != 0 ? null : null, (16609105 & 2048) != 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : 0L, (16609105 & 4096) != 0 ? null : textDecoration3, (16609105 & 8192) != 0 ? null : null, (16609105 & 16384) != 0 ? null : null, (16609105 & 32768) != 0 ? TextAlign.INSTANCE.m7925getUnspecifiede0LSkKk() : textAlign3 != null ? textAlign3.getValue() : TextAlign.INSTANCE.m7925getUnspecifiede0LSkKk(), (16609105 & 65536) != 0 ? TextDirection.INSTANCE.m7938getUnspecifieds_7Xco() : 0, (16609105 & 131072) != 0 ? TextUnit.INSTANCE.m8080getUnspecifiedXSAIIZE() : j10, (16609105 & 262144) != 0 ? null : null, (16609105 & 524288) != 0 ? null : null, (16609105 & 1048576) != 0 ? LineBreak.INSTANCE.m7860getUnspecifiedrAG3T2k() : 0, (16609105 & 2097152) != 0 ? Hyphens.INSTANCE.m7847getUnspecifiedvmbZdU8() : 0, (16609105 & 4194304) != 0 ? null : null, (16609105 & 8388608) != 0 ? null : null);
                                boolean zChanged = composerStartRestartGroup.changed(jM7661getColor0d7_KjU);
                                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Color3() { // from class: androidx.compose.material.TextKt$Text$6$1
                                        @Override // androidx.compose.p011ui.graphics.Color3
                                        /* renamed from: invoke-0d7_KjU */
                                        public final long mo5580invoke0d7_KjU() {
                                            return jM7661getColor0d7_KjU;
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                int i37 = (i7 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) | ((i33 >> 9) & 7168);
                                int i38 = i33 << 9;
                                Modifier modifier5 = modifier3;
                                BasicTextKt.m5333BasicTextRWo7tUw(annotatedString, modifier5, textStyleM7671mergedA7vx0o, function13, iM7958getClipgIe3tQ8, z2, i31, i32, mapEmptyMap, (Color3) objRememberedValue, composerStartRestartGroup, (i38 & 234881024) | i37 | (57344 & i38) | (458752 & i38) | (3670016 & i38) | (29360128 & i38), 0);
                                modifier2 = modifier5;
                                composer2 = composerStartRestartGroup;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                textAlign2 = textAlign3;
                                map2 = mapEmptyMap;
                                i28 = iM7958getClipgIe3tQ8;
                                i29 = i31;
                                function12 = function13;
                                i30 = i32;
                                textStyle2 = textStyle3;
                                fontWeight3 = fontWeight4;
                                fontStyle3 = fontStyle4;
                                fontFamily3 = fontFamily4;
                                j6 = j9;
                                textDecoration2 = textDecoration3;
                                j7 = j10;
                                z3 = z2;
                                j5 = j8;
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                final long j11 = jM6726getUnspecified0d7_KjU;
                                final Modifier modifier6 = modifier2;
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextKt$Text$7
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i39) {
                                        TextKt.m5666TextIbK3jfQ(annotatedString, modifier6, j11, j5, fontStyle3, fontWeight3, fontFamily3, j6, textDecoration2, textAlign2, j7, i28, z3, i29, i30, map2, function12, textStyle2, composer3, RecomposeScopeImpl4.updateChangedFlags(i4 | 1), RecomposeScopeImpl4.updateChangedFlags(i5), i6);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i25 = i23 | 24576;
                        i26 = i6 & 32768;
                        if (i26 == 0) {
                        }
                        i27 = i6 & 65536;
                        if (i27 == 0) {
                        }
                        if ((i5 & 12582912) == 0) {
                        }
                        if (composerStartRestartGroup.shouldExecute((i7 & 306783379) == 306783378 || (i25 & 4793491) != 4793490, i7 & 1)) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    z2 = z;
                    i22 = i6 & 8192;
                    if (i22 != 0) {
                    }
                    i24 = i6 & 16384;
                    if (i24 == 0) {
                    }
                    i26 = i6 & 32768;
                    if (i26 == 0) {
                    }
                    i27 = i6 & 65536;
                    if (i27 == 0) {
                    }
                    if ((i5 & 12582912) == 0) {
                    }
                    if (composerStartRestartGroup.shouldExecute((i7 & 306783379) == 306783378 || (i25 & 4793491) != 4793490, i7 & 1)) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                i16 = i15;
                i17 = i6 & 1024;
                if (i17 == 0) {
                }
                i19 = i6 & 2048;
                if (i19 == 0) {
                }
                int i352 = i18;
                i21 = i6 & 4096;
                if (i21 == 0) {
                }
                z2 = z;
                i22 = i6 & 8192;
                if (i22 != 0) {
                }
                i24 = i6 & 16384;
                if (i24 == 0) {
                }
                i26 = i6 & 32768;
                if (i26 == 0) {
                }
                i27 = i6 & 65536;
                if (i27 == 0) {
                }
                if ((i5 & 12582912) == 0) {
                }
                if (composerStartRestartGroup.shouldExecute((i7 & 306783379) == 306783378 || (i25 & 4793491) != 4793490, i7 & 1)) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            fontStyle2 = fontStyle;
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
            i15 = i6 & 512;
            if (i15 != 0) {
            }
            i16 = i15;
            i17 = i6 & 1024;
            if (i17 == 0) {
            }
            i19 = i6 & 2048;
            if (i19 == 0) {
            }
            int i3522 = i18;
            i21 = i6 & 4096;
            if (i21 == 0) {
            }
            z2 = z;
            i22 = i6 & 8192;
            if (i22 != 0) {
            }
            i24 = i6 & 16384;
            if (i24 == 0) {
            }
            i26 = i6 & 32768;
            if (i26 == 0) {
            }
            i27 = i6 & 65536;
            if (i27 == 0) {
            }
            if ((i5 & 12582912) == 0) {
            }
            if (composerStartRestartGroup.shouldExecute((i7 & 306783379) == 306783378 || (i25 & 4793491) != 4793490, i7 & 1)) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        i8 = i6 & 4;
        if (i8 == 0) {
        }
        i9 = i6 & 8;
        if (i9 == 0) {
        }
        i10 = i6 & 16;
        if (i10 == 0) {
        }
        fontStyle2 = fontStyle;
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
        i15 = i6 & 512;
        if (i15 != 0) {
        }
        i16 = i15;
        i17 = i6 & 1024;
        if (i17 == 0) {
        }
        i19 = i6 & 2048;
        if (i19 == 0) {
        }
        int i35222 = i18;
        i21 = i6 & 4096;
        if (i21 == 0) {
        }
        z2 = z;
        i22 = i6 & 8192;
        if (i22 != 0) {
        }
        i24 = i6 & 16384;
        if (i24 == 0) {
        }
        i26 = i6 & 32768;
        if (i26 == 0) {
        }
        i27 = i6 & 65536;
        if (i27 == 0) {
        }
        if ((i5 & 12582912) == 0) {
        }
        if (composerStartRestartGroup.shouldExecute((i7 & 306783379) == 306783378 || (i25 & 4793491) != 4793490, i7 & 1)) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static final void ProvideTextStyle(final TextStyle textStyle, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1772272796);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(textStyle) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1772272796, i2, -1, "androidx.compose.material.ProvideTextStyle (Text.kt:400)");
            }
            CompositionLocal6<TextStyle> compositionLocal6 = LocalTextStyle;
            CompositionLocal3.CompositionLocalProvider(compositionLocal6.provides(((TextStyle) composerStartRestartGroup.consume(compositionLocal6)).merge(textStyle)), function2, composerStartRestartGroup, (i2 & 112) | ProvidedValue.$stable);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextKt.ProvideTextStyle.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    TextKt.ProvideTextStyle(textStyle, function2, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
