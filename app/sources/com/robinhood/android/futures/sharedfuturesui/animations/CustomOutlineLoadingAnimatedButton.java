package com.robinhood.android.futures.sharedfuturesui.animations;

import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.semantics.Role;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import com.robinhood.compose.theme.style.ButtonStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CustomOutlineLoadingAnimatedButton.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u001a\u0097\u0001\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00012\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001dH\u0007¢\u0006\u0004\b\u001e\u0010\u001f\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0010\u0010 \u001a\u00020\u0017X\u0082\u0004¢\u0006\u0004\n\u0002\u0010!¨\u0006\""}, m3636d2 = {"DefaultButtonShape", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "getDefaultButtonShape", "()Landroidx/compose/foundation/shape/RoundedCornerShape;", "CustomOutlineLoadingAnimatedButton", "", "text", "", "textColor", "Landroidx/compose/ui/graphics/Color;", "isLoading", "", "enabled", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "buttonStyle", "Lcom/robinhood/compose/theme/style/ButtonStyle$Style;", "shape", "brush", "Landroidx/compose/ui/graphics/Brush;", "pillBorderWidth", "Landroidx/compose/ui/unit/Dp;", "defaultBorderWidth", "nonLoadingBorderColor", "drawPill", "Lcom/robinhood/android/futures/sharedfuturesui/animations/PillLoadingPlaceholderDrawPill;", "loadingAnimationDurationMills", "", "CustomOutlineLoadingAnimatedButton-bQD1wOU", "(Ljava/lang/String;JZZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/robinhood/compose/theme/style/ButtonStyle$Style;Landroidx/compose/foundation/shape/RoundedCornerShape;Landroidx/compose/ui/graphics/Brush;FFJLcom/robinhood/android/futures/sharedfuturesui/animations/PillLoadingPlaceholderDrawPill;ILandroidx/compose/runtime/Composer;III)V", "DefaultBorderWidth", "F", "lib-shared-futures-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.futures.sharedfuturesui.animations.CustomOutlineLoadingAnimatedButtonKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class CustomOutlineLoadingAnimatedButton {
    private static final RoundedCornerShape DefaultButtonShape = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(24));
    private static final float DefaultBorderWidth = C2002Dp.m7995constructorimpl((float) 0.5d);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CustomOutlineLoadingAnimatedButton_bQD1wOU$lambda$2(String str, long j, boolean z, boolean z2, Function0 function0, Modifier modifier, ButtonStyle.Style style, RoundedCornerShape roundedCornerShape, Brush brush, float f, float f2, long j2, PillLoadingPlaceholderDrawPill pillLoadingPlaceholderDrawPill, int i, int i2, int i3, int i4, Composer composer, int i5) {
        m14739CustomOutlineLoadingAnimatedButtonbQD1wOU(str, j, z, z2, function0, modifier, style, roundedCornerShape, brush, f, f2, j2, pillLoadingPlaceholderDrawPill, i, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), RecomposeScopeImpl4.updateChangedFlags(i3), i4);
        return Unit.INSTANCE;
    }

    public static final RoundedCornerShape getDefaultButtonShape() {
        return DefaultButtonShape;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:229:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0124  */
    /* renamed from: CustomOutlineLoadingAnimatedButton-bQD1wOU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m14739CustomOutlineLoadingAnimatedButtonbQD1wOU(final String text, final long j, final boolean z, final boolean z2, final Function0<Unit> onClick, Modifier modifier, ButtonStyle.Style style, RoundedCornerShape roundedCornerShape, Brush brush, float f, float f2, long j2, PillLoadingPlaceholderDrawPill pillLoadingPlaceholderDrawPill, int i, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        int i7;
        Modifier modifier2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        ButtonStyle.Style secondary;
        RoundedCornerShape roundedCornerShape2;
        Brush brushDefaultPillOutlineLinearGradiant;
        float f3;
        ButtonStyle.Style style2;
        long jM21427getFg30d7_KjU;
        PillLoadingPlaceholderDrawPill pillLoadingPlaceholderDrawPill2;
        ButtonStyle.Style style3;
        int i16;
        int i17;
        float f4;
        Modifier modifier3;
        int i18;
        long j3;
        RoundedCornerShape roundedCornerShape3;
        Object objRememberedValue;
        final ButtonStyle.Style style4;
        final Modifier modifier4;
        final RoundedCornerShape roundedCornerShape4;
        final float f5;
        final Brush brush2;
        final float f6;
        final PillLoadingPlaceholderDrawPill pillLoadingPlaceholderDrawPill3;
        final int i19;
        Composer composer2;
        final long j4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i20;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1278664340);
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerStartRestartGroup.changed(text) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                i6 = i5 | (composerStartRestartGroup.changed(j) ? 32 : 16);
            }
            int i21 = 128;
            if ((i4 & 4) == 0) {
                i6 |= 384;
            } else if ((i2 & 384) == 0) {
                i6 |= composerStartRestartGroup.changed(z) ? 256 : 128;
            }
            if ((i4 & 8) == 0) {
                i6 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    i6 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
                }
                if ((i4 & 16) != 0) {
                    i6 |= 24576;
                } else if ((i2 & 24576) == 0) {
                    i6 |= composerStartRestartGroup.changedInstance(onClick) ? 16384 : 8192;
                }
                i7 = i4 & 32;
                if (i7 != 0) {
                    i6 |= 196608;
                    modifier2 = modifier;
                } else {
                    modifier2 = modifier;
                    if ((i2 & 196608) == 0) {
                        i6 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
                    }
                }
                if ((i2 & 1572864) == 0) {
                    if ((i4 & 64) != 0) {
                        i20 = 524288;
                        i6 |= i20;
                    } else {
                        if ((i2 & 2097152) == 0 ? composerStartRestartGroup.changed(style) : composerStartRestartGroup.changedInstance(style)) {
                            i20 = 1048576;
                        }
                        i6 |= i20;
                    }
                }
                i8 = i4 & 128;
                if (i8 != 0) {
                    i6 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    i6 |= composerStartRestartGroup.changed(roundedCornerShape) ? 8388608 : 4194304;
                }
                if ((i2 & 100663296) == 0) {
                    i6 |= ((i4 & 256) == 0 && composerStartRestartGroup.changed(brush)) ? 67108864 : 33554432;
                }
                i9 = i4 & 512;
                if (i9 == 0) {
                    if ((i2 & 805306368) == 0) {
                        i10 = i9;
                        i6 |= composerStartRestartGroup.changed(f) ? 536870912 : 268435456;
                    }
                    i11 = i4 & 1024;
                    if (i11 == 0) {
                        i13 = i3 | 6;
                        i12 = i11;
                    } else if ((i3 & 6) == 0) {
                        i12 = i11;
                        i13 = i3 | (composerStartRestartGroup.changed(f2) ? 4 : 2);
                    } else {
                        i12 = i11;
                        i13 = i3;
                    }
                    if ((i3 & 48) == 0) {
                        i13 |= ((i4 & 2048) == 0 && composerStartRestartGroup.changed(j2)) ? 32 : 16;
                    }
                    if ((i3 & 384) == 0) {
                        if ((i4 & 4096) == 0) {
                            if ((i3 & 512) == 0 ? composerStartRestartGroup.changed(pillLoadingPlaceholderDrawPill) : composerStartRestartGroup.changedInstance(pillLoadingPlaceholderDrawPill)) {
                                i21 = 256;
                            }
                        }
                        i13 |= i21;
                    }
                    int i22 = i13;
                    i14 = i4 & 8192;
                    if (i14 == 0) {
                        i15 = i22 | 3072;
                    } else {
                        int i23 = i22;
                        if ((i3 & 3072) == 0) {
                            i23 |= composerStartRestartGroup.changed(i) ? 2048 : 1024;
                        }
                        i15 = i23;
                    }
                    if ((i6 & 306783379) == 306783378 || (i15 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i7 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if ((i4 & 64) == 0) {
                                secondary = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getButton(composerStartRestartGroup, 0).getSecondary();
                                i6 &= -3670017;
                            } else {
                                secondary = style;
                            }
                            roundedCornerShape2 = i8 == 0 ? DefaultButtonShape : roundedCornerShape;
                            if ((i4 & 256) == 0) {
                                brushDefaultPillOutlineLinearGradiant = PillLoadingPlaceholderModifierKt.defaultPillOutlineLinearGradiant(BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable));
                                i6 &= -234881025;
                            } else {
                                brushDefaultPillOutlineLinearGradiant = brush;
                            }
                            float defaultPillBorderWidth = i10 == 0 ? PillLoadingPlaceholderModifierKt.getDefaultPillBorderWidth() : f;
                            f3 = i12 == 0 ? DefaultBorderWidth : f2;
                            int i24 = i15;
                            if ((i4 & 2048) == 0) {
                                style2 = secondary;
                                i24 &= -113;
                                jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21427getFg30d7_KjU();
                            } else {
                                style2 = secondary;
                                jM21427getFg30d7_KjU = j2;
                            }
                            int i25 = i24;
                            if ((i4 & 4096) == 0) {
                                pillLoadingPlaceholderDrawPill2 = PillLoadingPlaceholderDrawPill.INSTANCE.getDefault();
                                i25 &= -897;
                            } else {
                                pillLoadingPlaceholderDrawPill2 = pillLoadingPlaceholderDrawPill;
                            }
                            if (i14 == 0) {
                                i17 = i25;
                                f4 = defaultPillBorderWidth;
                                modifier3 = modifier2;
                                i16 = 500;
                                style3 = style2;
                            } else {
                                style3 = style2;
                                i16 = i;
                                i17 = i25;
                                f4 = defaultPillBorderWidth;
                                modifier3 = modifier2;
                            }
                            i18 = i6;
                            j3 = jM21427getFg30d7_KjU;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i4 & 64) != 0) {
                                i6 &= -3670017;
                            }
                            if ((i4 & 256) != 0) {
                                i6 &= -234881025;
                            }
                            if ((i4 & 2048) != 0) {
                                i15 &= -113;
                            }
                            if ((i4 & 4096) != 0) {
                                i15 &= -897;
                            }
                            style3 = style;
                            roundedCornerShape2 = roundedCornerShape;
                            brushDefaultPillOutlineLinearGradiant = brush;
                            f4 = f;
                            f3 = f2;
                            pillLoadingPlaceholderDrawPill2 = pillLoadingPlaceholderDrawPill;
                            i16 = i;
                            i17 = i15;
                            modifier3 = modifier2;
                            i18 = i6;
                            j3 = j2;
                        }
                        composerStartRestartGroup.endDefaults();
                        PillLoadingPlaceholderDrawPill pillLoadingPlaceholderDrawPill4 = pillLoadingPlaceholderDrawPill2;
                        if (ComposerKt.isTraceInProgress()) {
                            roundedCornerShape3 = roundedCornerShape2;
                        } else {
                            roundedCornerShape3 = roundedCornerShape2;
                            ComposerKt.traceEventStart(1278664340, i18, i17, "com.robinhood.android.futures.sharedfuturesui.animations.CustomOutlineLoadingAnimatedButton (CustomOutlineLoadingAnimatedButton.kt:47)");
                        }
                        TextStyle textStyle = style3.getTextStyle();
                        int iM7919getCentere0LSkKk = TextAlign.INSTANCE.m7919getCentere0LSkKk();
                        int iM7959getEllipsisgIe3tQ8 = TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8();
                        long j5 = j3;
                        int i26 = i18;
                        float f7 = f3;
                        Modifier modifier5 = modifier3;
                        RoundedCornerShape roundedCornerShape5 = roundedCornerShape3;
                        Modifier modifierM14745pillLoadingPlaceholderIdJWcmQ = PillLoadingPlaceholderModifierKt.m14745pillLoadingPlaceholderIdJWcmQ(SizeKt.m5155defaultMinSizeVpY3zN4$default(modifier3, 0.0f, style3.m21717getMinHeightD9Ej5fM(), 1, null), roundedCornerShape5, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU(), brushDefaultPillOutlineLinearGradiant, z, (16 & 16) != 0 ? 1.0f : 0.0f, (16 & 32) != 0 ? PillLoadingPlaceholderModifierKt.DefaultPillBorderWidth : f4, (16 & 64) != 0 ? 500 : i16, (16 & 128) != 0 ? PillLoadingPlaceholderDrawPill.INSTANCE.getDefault() : pillLoadingPlaceholderDrawPill4);
                        Brush brush3 = brushDefaultPillOutlineLinearGradiant;
                        float f8 = f4;
                        int i27 = i16;
                        if (!z) {
                            modifierM14745pillLoadingPlaceholderIdJWcmQ = BorderKt.m4876borderxT4_qwU(modifierM14745pillLoadingPlaceholderIdJWcmQ, f7, j5, roundedCornerShape5);
                        }
                        int iM7479getButtono7Vup1c = Role.INSTANCE.m7479getButtono7Vup1c();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSource2.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        BentoText2.m20747BentoText38GnDrw(text, SizeKt.wrapContentHeight$default(ClickableKt.m4891clickableO2vRcR0$default(modifierM14745pillLoadingPlaceholderIdJWcmQ, (InteractionSource3) objRememberedValue, null, z2, null, Role.m7472boximpl(iM7479getButtono7Vup1c), onClick, 8, null), Alignment.INSTANCE.getCenterVertically(), false, 2, null), Color.m6701boximpl(j), null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk), iM7959getEllipsisgIe3tQ8, false, 1, 0, null, 0, textStyle, composerStartRestartGroup, (i26 & 14) | 817889280 | ((i26 << 3) & 896), 0, 7480);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        style4 = style3;
                        modifier4 = modifier5;
                        roundedCornerShape4 = roundedCornerShape5;
                        f5 = f7;
                        brush2 = brush3;
                        f6 = f8;
                        pillLoadingPlaceholderDrawPill3 = pillLoadingPlaceholderDrawPill4;
                        i19 = i27;
                        composer2 = composerStartRestartGroup;
                        j4 = j5;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        style4 = style;
                        roundedCornerShape4 = roundedCornerShape;
                        brush2 = brush;
                        f6 = f;
                        j4 = j2;
                        pillLoadingPlaceholderDrawPill3 = pillLoadingPlaceholderDrawPill;
                        i19 = i;
                        composer2 = composerStartRestartGroup;
                        modifier4 = modifier2;
                        f5 = f2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.sharedfuturesui.animations.CustomOutlineLoadingAnimatedButtonKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return CustomOutlineLoadingAnimatedButton.CustomOutlineLoadingAnimatedButton_bQD1wOU$lambda$2(text, j, z, z2, onClick, modifier4, style4, roundedCornerShape4, brush2, f6, f5, j4, pillLoadingPlaceholderDrawPill3, i19, i2, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i6 |= 805306368;
                i10 = i9;
                i11 = i4 & 1024;
                if (i11 == 0) {
                }
                if ((i3 & 48) == 0) {
                }
                if ((i3 & 384) == 0) {
                }
                int i222 = i13;
                i14 = i4 & 8192;
                if (i14 == 0) {
                }
                if ((i6 & 306783379) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i7 != 0) {
                        }
                        if ((i4 & 64) == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if ((i4 & 256) == 0) {
                        }
                        if (i10 == 0) {
                        }
                        if (i12 == 0) {
                        }
                        int i242 = i15;
                        if ((i4 & 2048) == 0) {
                        }
                        int i252 = i242;
                        if ((i4 & 4096) == 0) {
                        }
                        if (i14 == 0) {
                        }
                        i18 = i6;
                        j3 = jM21427getFg30d7_KjU;
                        composerStartRestartGroup.endDefaults();
                        PillLoadingPlaceholderDrawPill pillLoadingPlaceholderDrawPill42 = pillLoadingPlaceholderDrawPill2;
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        TextStyle textStyle2 = style3.getTextStyle();
                        int iM7919getCentere0LSkKk2 = TextAlign.INSTANCE.m7919getCentere0LSkKk();
                        int iM7959getEllipsisgIe3tQ82 = TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8();
                        long j52 = j3;
                        int i262 = i18;
                        float f72 = f3;
                        Modifier modifier52 = modifier3;
                        RoundedCornerShape roundedCornerShape52 = roundedCornerShape3;
                        Modifier modifierM14745pillLoadingPlaceholderIdJWcmQ2 = PillLoadingPlaceholderModifierKt.m14745pillLoadingPlaceholderIdJWcmQ(SizeKt.m5155defaultMinSizeVpY3zN4$default(modifier3, 0.0f, style3.m21717getMinHeightD9Ej5fM(), 1, null), roundedCornerShape52, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU(), brushDefaultPillOutlineLinearGradiant, z, (16 & 16) != 0 ? 1.0f : 0.0f, (16 & 32) != 0 ? PillLoadingPlaceholderModifierKt.DefaultPillBorderWidth : f4, (16 & 64) != 0 ? 500 : i16, (16 & 128) != 0 ? PillLoadingPlaceholderDrawPill.INSTANCE.getDefault() : pillLoadingPlaceholderDrawPill42);
                        Brush brush32 = brushDefaultPillOutlineLinearGradiant;
                        float f82 = f4;
                        int i272 = i16;
                        if (!z) {
                        }
                        int iM7479getButtono7Vup1c2 = Role.INSTANCE.m7479getButtono7Vup1c();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        BentoText2.m20747BentoText38GnDrw(text, SizeKt.wrapContentHeight$default(ClickableKt.m4891clickableO2vRcR0$default(modifierM14745pillLoadingPlaceholderIdJWcmQ2, (InteractionSource3) objRememberedValue, null, z2, null, Role.m7472boximpl(iM7479getButtono7Vup1c2), onClick, 8, null), Alignment.INSTANCE.getCenterVertically(), false, 2, null), Color.m6701boximpl(j), null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk2), iM7959getEllipsisgIe3tQ82, false, 1, 0, null, 0, textStyle2, composerStartRestartGroup, (i262 & 14) | 817889280 | ((i262 << 3) & 896), 0, 7480);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        style4 = style3;
                        modifier4 = modifier52;
                        roundedCornerShape4 = roundedCornerShape52;
                        f5 = f72;
                        brush2 = brush32;
                        f6 = f82;
                        pillLoadingPlaceholderDrawPill3 = pillLoadingPlaceholderDrawPill42;
                        i19 = i272;
                        composer2 = composerStartRestartGroup;
                        j4 = j52;
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            if ((i4 & 16) != 0) {
            }
            i7 = i4 & 32;
            if (i7 != 0) {
            }
            if ((i2 & 1572864) == 0) {
            }
            i8 = i4 & 128;
            if (i8 != 0) {
            }
            if ((i2 & 100663296) == 0) {
            }
            i9 = i4 & 512;
            if (i9 == 0) {
            }
            i10 = i9;
            i11 = i4 & 1024;
            if (i11 == 0) {
            }
            if ((i3 & 48) == 0) {
            }
            if ((i3 & 384) == 0) {
            }
            int i2222 = i13;
            i14 = i4 & 8192;
            if (i14 == 0) {
            }
            if ((i6 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        i6 = i5;
        int i212 = 128;
        if ((i4 & 4) == 0) {
        }
        if ((i4 & 8) == 0) {
        }
        if ((i4 & 16) != 0) {
        }
        i7 = i4 & 32;
        if (i7 != 0) {
        }
        if ((i2 & 1572864) == 0) {
        }
        i8 = i4 & 128;
        if (i8 != 0) {
        }
        if ((i2 & 100663296) == 0) {
        }
        i9 = i4 & 512;
        if (i9 == 0) {
        }
        i10 = i9;
        i11 = i4 & 1024;
        if (i11 == 0) {
        }
        if ((i3 & 48) == 0) {
        }
        if ((i3 & 384) == 0) {
        }
        int i22222 = i13;
        i14 = i4 & 8192;
        if (i14 == 0) {
        }
        if ((i6 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
