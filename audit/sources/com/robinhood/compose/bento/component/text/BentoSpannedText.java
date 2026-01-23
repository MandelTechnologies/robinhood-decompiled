package com.robinhood.compose.bento.component.text;

import android.text.Spanned;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocal6;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BentoSpannedText.kt */
@Metadata(m3635d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001au\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0003\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\"\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m3636d2 = {"BentoSpannedText", "", "text", "Landroid/text/Spanned;", "modifier", "Landroidx/compose/ui/Modifier;", ResourceTypes.COLOR, "Landroidx/compose/ui/graphics/Color;", "linkColor", "textAppearance", "", "gravity", "maxLines", "autoSizeTextType", "onClick", "Lkotlin/Function0;", "BentoSpannedText-THkziT8", "(Landroid/text/Spanned;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/graphics/Color;ILjava/lang/Integer;IILkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "LocalSpannedTextProvider", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Lcom/robinhood/compose/bento/component/text/SpannedTextProvider;", "getLocalSpannedTextProvider", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "lib-compose-bento_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.bento.component.text.BentoSpannedTextKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class BentoSpannedText {
    private static final CompositionLocal6<BentoSpannedText4> LocalSpannedTextProvider = CompositionLocal3.staticCompositionLocalOf(new Function0() { // from class: com.robinhood.compose.bento.component.text.BentoSpannedTextKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BentoSpannedText2.INSTANCE;
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoSpannedText_THkziT8$lambda$0(Spanned spanned, Modifier modifier, Color color, Color color2, int i, Integer num, int i2, int i3, Function0 function0, int i4, int i5, Composer composer, int i6) {
        m21106BentoSpannedTextTHkziT8(spanned, modifier, color, color2, i, num, i2, i3, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i4 | 1), i5);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00fd  */
    /* renamed from: BentoSpannedText-THkziT8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m21106BentoSpannedTextTHkziT8(final Spanned text, Modifier modifier, Color color, Color color2, int i, Integer num, int i2, int i3, Function0<Unit> function0, Composer composer, final int i4, final int i5) {
        int i6;
        Modifier modifier2;
        int i7;
        Color color3;
        Color colorM6701boximpl;
        int i8;
        int i9;
        Integer num2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        final Function0<Unit> function02;
        int i16;
        final Modifier modifier3;
        final Color color4;
        final Color color5;
        final int i17;
        final Integer num3;
        final int i18;
        final int i19;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer composerStartRestartGroup = composer.startRestartGroup(1932159643);
        if ((i5 & 1) != 0) {
            i6 = i4 | 6;
        } else if ((i4 & 6) == 0) {
            i6 = (composerStartRestartGroup.changedInstance(text) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        int i20 = i5 & 2;
        if (i20 != 0) {
            i6 |= 48;
        } else {
            if ((i4 & 48) == 0) {
                modifier2 = modifier;
                i6 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i7 = i5 & 4;
            if (i7 == 0) {
                i6 |= 384;
            } else {
                if ((i4 & 384) == 0) {
                    color3 = color;
                    i6 |= composerStartRestartGroup.changed(color3) ? 256 : 128;
                }
                if ((i4 & 3072) == 0) {
                    if ((i5 & 8) == 0) {
                        colorM6701boximpl = color2;
                        int i21 = composerStartRestartGroup.changed(colorM6701boximpl) ? 2048 : 1024;
                        i6 |= i21;
                    } else {
                        colorM6701boximpl = color2;
                    }
                    i6 |= i21;
                } else {
                    colorM6701boximpl = color2;
                }
                if ((i4 & 24576) == 0) {
                    if ((i5 & 16) == 0) {
                        i8 = i;
                        int i22 = composerStartRestartGroup.changed(i8) ? 16384 : 8192;
                        i6 |= i22;
                    } else {
                        i8 = i;
                    }
                    i6 |= i22;
                } else {
                    i8 = i;
                }
                i9 = i5 & 32;
                if (i9 != 0) {
                    i6 |= 196608;
                } else {
                    if ((196608 & i4) == 0) {
                        num2 = num;
                        i6 |= composerStartRestartGroup.changed(num2) ? 131072 : 65536;
                    }
                    i10 = i5 & 64;
                    if (i10 == 0) {
                        i6 |= 1572864;
                    } else {
                        if ((1572864 & i4) == 0) {
                            i11 = i2;
                            i6 |= composerStartRestartGroup.changed(i11) ? 1048576 : 524288;
                        }
                        i12 = i5 & 128;
                        if (i12 != 0) {
                            i6 |= 12582912;
                        } else {
                            if ((i4 & 12582912) == 0) {
                                i13 = i12;
                                i6 |= composerStartRestartGroup.changed(i3) ? 8388608 : 4194304;
                            }
                            i14 = i5 & 256;
                            if (i14 != 0) {
                                if ((i4 & 100663296) == 0) {
                                    i15 = i14;
                                    i6 |= composerStartRestartGroup.changedInstance(function0) ? 67108864 : 33554432;
                                }
                                if ((i6 & 38347923) != 38347922 || !composerStartRestartGroup.getSkipping()) {
                                    composerStartRestartGroup.startDefaults();
                                    if ((i4 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                        if (i20 != 0) {
                                            modifier2 = Modifier.INSTANCE;
                                        }
                                        if (i7 != 0) {
                                            color3 = null;
                                        }
                                        if ((i5 & 8) != 0) {
                                            i6 &= -7169;
                                            colorM6701boximpl = Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m21368getAccent0d7_KjU());
                                        }
                                        if ((i5 & 16) != 0) {
                                            i6 = (-57345) & i6;
                                            i8 = C20690R.attr.textAppearanceRegularMedium;
                                        }
                                        if (i9 != 0) {
                                            num2 = null;
                                        }
                                        if (i10 != 0) {
                                            i11 = Integer.MAX_VALUE;
                                        }
                                        int i23 = i13 == 0 ? 0 : i3;
                                        function02 = i15 == 0 ? null : function0;
                                        i16 = i6;
                                        modifier3 = modifier2;
                                        color4 = color3;
                                        color5 = colorM6701boximpl;
                                        i17 = i8;
                                        num3 = num2;
                                        i18 = i11;
                                        i19 = i23;
                                    } else {
                                        composerStartRestartGroup.skipToGroupEnd();
                                        if ((i5 & 8) != 0) {
                                            i6 &= -7169;
                                        }
                                        if ((i5 & 16) != 0) {
                                            i6 &= -57345;
                                        }
                                        function02 = function0;
                                        i16 = i6;
                                        modifier3 = modifier2;
                                        color4 = color3;
                                        color5 = colorM6701boximpl;
                                        i17 = i8;
                                        num3 = num2;
                                        i18 = i11;
                                        i19 = i3;
                                    }
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1932159643, i16, -1, "com.robinhood.compose.bento.component.text.BentoSpannedText (BentoSpannedText.kt:52)");
                                    }
                                    ((BentoSpannedText4) composerStartRestartGroup.consume(LocalSpannedTextProvider)).mo13684SpannedTextgPmlwdY(text, modifier3, color4, color5, i17, num3, i18, i19, function02, composerStartRestartGroup, 268435454 & i16);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    function02 = function0;
                                    modifier3 = modifier2;
                                    color4 = color3;
                                    color5 = colorM6701boximpl;
                                    i17 = i8;
                                    num3 = num2;
                                    i18 = i11;
                                    i19 = i3;
                                }
                                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.text.BentoSpannedTextKt$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return BentoSpannedText.BentoSpannedText_THkziT8$lambda$0(text, modifier3, color4, color5, i17, num3, i18, i19, function02, i4, i5, (Composer) obj, ((Integer) obj2).intValue());
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i6 |= 100663296;
                            i15 = i14;
                            if ((i6 & 38347923) != 38347922) {
                                composerStartRestartGroup.startDefaults();
                                if ((i4 & 1) != 0) {
                                    if (i20 != 0) {
                                    }
                                    if (i7 != 0) {
                                    }
                                    if ((i5 & 8) != 0) {
                                    }
                                    if ((i5 & 16) != 0) {
                                    }
                                    if (i9 != 0) {
                                    }
                                    if (i10 != 0) {
                                    }
                                    if (i13 == 0) {
                                    }
                                    if (i15 == 0) {
                                    }
                                    i16 = i6;
                                    modifier3 = modifier2;
                                    color4 = color3;
                                    color5 = colorM6701boximpl;
                                    i17 = i8;
                                    num3 = num2;
                                    i18 = i11;
                                    i19 = i23;
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    ((BentoSpannedText4) composerStartRestartGroup.consume(LocalSpannedTextProvider)).mo13684SpannedTextgPmlwdY(text, modifier3, color4, color5, i17, num3, i18, i19, function02, composerStartRestartGroup, 268435454 & i16);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                }
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                            }
                        }
                        i13 = i12;
                        i14 = i5 & 256;
                        if (i14 != 0) {
                        }
                        i15 = i14;
                        if ((i6 & 38347923) != 38347922) {
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    i11 = i2;
                    i12 = i5 & 128;
                    if (i12 != 0) {
                    }
                    i13 = i12;
                    i14 = i5 & 256;
                    if (i14 != 0) {
                    }
                    i15 = i14;
                    if ((i6 & 38347923) != 38347922) {
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                num2 = num;
                i10 = i5 & 64;
                if (i10 == 0) {
                }
                i11 = i2;
                i12 = i5 & 128;
                if (i12 != 0) {
                }
                i13 = i12;
                i14 = i5 & 256;
                if (i14 != 0) {
                }
                i15 = i14;
                if ((i6 & 38347923) != 38347922) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            color3 = color;
            if ((i4 & 3072) == 0) {
            }
            if ((i4 & 24576) == 0) {
            }
            i9 = i5 & 32;
            if (i9 != 0) {
            }
            num2 = num;
            i10 = i5 & 64;
            if (i10 == 0) {
            }
            i11 = i2;
            i12 = i5 & 128;
            if (i12 != 0) {
            }
            i13 = i12;
            i14 = i5 & 256;
            if (i14 != 0) {
            }
            i15 = i14;
            if ((i6 & 38347923) != 38347922) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i7 = i5 & 4;
        if (i7 == 0) {
        }
        color3 = color;
        if ((i4 & 3072) == 0) {
        }
        if ((i4 & 24576) == 0) {
        }
        i9 = i5 & 32;
        if (i9 != 0) {
        }
        num2 = num;
        i10 = i5 & 64;
        if (i10 == 0) {
        }
        i11 = i2;
        i12 = i5 & 128;
        if (i12 != 0) {
        }
        i13 = i12;
        i14 = i5 & 256;
        if (i14 != 0) {
        }
        i15 = i14;
        if ((i6 & 38347923) != 38347922) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    public static final CompositionLocal6<BentoSpannedText4> getLocalSpannedTextProvider() {
        return LocalSpannedTextProvider;
    }
}
