package com.robinhood.compose.bento.component.text;

import android.text.Spanned;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BentoMarkdownSpannedText.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001au\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0003\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"BentoMarkdownSpannedText", "", "rawMarkdownText", "", "modifier", "Landroidx/compose/ui/Modifier;", ResourceTypes.COLOR, "Landroidx/compose/ui/graphics/Color;", "linkColor", "textAppearance", "", "gravity", "maxLines", "autoSizeTextType", "onClick", "Lkotlin/Function0;", "BentoMarkdownSpannedText-THkziT8", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/graphics/Color;ILjava/lang/Integer;IILkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "lib-compose-bento_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.bento.component.text.BentoMarkdownSpannedTextKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class BentoMarkdownSpannedText2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoMarkdownSpannedText_THkziT8$lambda$0(String str, Modifier modifier, Color color, Color color2, int i, Integer num, int i2, int i3, Function0 function0, int i4, int i5, Composer composer, int i6) {
        m21101BentoMarkdownSpannedTextTHkziT8(str, modifier, color, color2, i, num, i2, i3, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i4 | 1), i5);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:160:? A[RETURN, SYNTHETIC] */
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
    /* renamed from: BentoMarkdownSpannedText-THkziT8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m21101BentoMarkdownSpannedTextTHkziT8(final String rawMarkdownText, Modifier modifier, Color color, Color color2, int i, Integer num, int i2, int i3, Function0<Unit> function0, Composer composer, final int i4, final int i5) {
        int i6;
        Modifier modifier2;
        int i7;
        Color color3;
        Color color4;
        int i8;
        int i9;
        Integer num2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Color colorM21807getLinkColorQN2ZGVo;
        int i16;
        Function0<Unit> function02;
        Color color5;
        int i17;
        int i18;
        int i19;
        Integer num3;
        Composer composer2;
        final Color color6;
        final Modifier modifier3;
        final Color color7;
        final int i20;
        final Integer num4;
        final int i21;
        final int i22;
        final Function0<Unit> function03;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(rawMarkdownText, "rawMarkdownText");
        Composer composerStartRestartGroup = composer.startRestartGroup(1868843047);
        if ((i5 & 1) != 0) {
            i6 = i4 | 6;
        } else if ((i4 & 6) == 0) {
            i6 = (composerStartRestartGroup.changed(rawMarkdownText) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        int i23 = i5 & 2;
        if (i23 != 0) {
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
                        color4 = color2;
                        int i24 = composerStartRestartGroup.changed(color4) ? 2048 : 1024;
                        i6 |= i24;
                    } else {
                        color4 = color2;
                    }
                    i6 |= i24;
                } else {
                    color4 = color2;
                }
                if ((i4 & 24576) == 0) {
                    if ((i5 & 16) == 0) {
                        i8 = i;
                        int i25 = composerStartRestartGroup.changed(i8) ? 16384 : 8192;
                        i6 |= i25;
                    } else {
                        i8 = i;
                    }
                    i6 |= i25;
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
                                        if (i23 != 0) {
                                            modifier2 = Modifier.INSTANCE;
                                        }
                                        if (i7 != 0) {
                                            color3 = null;
                                        }
                                        if ((i5 & 8) == 0) {
                                            colorM21807getLinkColorQN2ZGVo = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getMarkdownSpannedText(composerStartRestartGroup, 0).m21807getLinkColorQN2ZGVo();
                                            i6 &= -7169;
                                        } else {
                                            colorM21807getLinkColorQN2ZGVo = color4;
                                        }
                                        if ((i5 & 16) == 0) {
                                            i16 = C20690R.attr.textAppearanceRegularMedium;
                                            i6 &= -57345;
                                        } else {
                                            i16 = i8;
                                        }
                                        if (i9 != 0) {
                                            num2 = null;
                                        }
                                        int i26 = i10 == 0 ? Integer.MAX_VALUE : i11;
                                        int i27 = i13 == 0 ? 0 : i3;
                                        function02 = i15 == 0 ? null : function0;
                                        color5 = color3;
                                        i17 = i16;
                                        i18 = i26;
                                        i19 = i27;
                                        num3 = num2;
                                    } else {
                                        composerStartRestartGroup.skipToGroupEnd();
                                        if ((i5 & 8) != 0) {
                                            i6 &= -7169;
                                        }
                                        if ((i5 & 16) != 0) {
                                            i6 &= -57345;
                                        }
                                        i19 = i3;
                                        function02 = function0;
                                        color5 = color3;
                                        colorM21807getLinkColorQN2ZGVo = color4;
                                        i17 = i8;
                                        num3 = num2;
                                        i18 = i11;
                                    }
                                    Modifier modifier4 = modifier2;
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1868843047, i6, -1, "com.robinhood.compose.bento.component.text.BentoMarkdownSpannedText (BentoMarkdownSpannedText.kt:29)");
                                    }
                                    Spanned spannedRememberMarkdown = Markdown3.rememberMarkdown(rawMarkdownText, composerStartRestartGroup, i6 & 14);
                                    composerStartRestartGroup.startReplaceGroup(661858277);
                                    Color colorM21807getLinkColorQN2ZGVo2 = colorM21807getLinkColorQN2ZGVo != null ? ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getMarkdownSpannedText(composerStartRestartGroup, 0).m21807getLinkColorQN2ZGVo() : colorM21807getLinkColorQN2ZGVo;
                                    composerStartRestartGroup.endReplaceGroup();
                                    composer2 = composerStartRestartGroup;
                                    BentoSpannedText.m21106BentoSpannedTextTHkziT8(spannedRememberMarkdown, modifier4, color5, colorM21807getLinkColorQN2ZGVo2, i17, num3, i18, i19, function02, composer2, i6 & 268428272, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    color6 = colorM21807getLinkColorQN2ZGVo;
                                    modifier3 = modifier4;
                                    color7 = color5;
                                    i20 = i17;
                                    num4 = num3;
                                    i21 = i18;
                                    i22 = i19;
                                    function03 = function02;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    composer2 = composerStartRestartGroup;
                                    modifier3 = modifier2;
                                    color7 = color3;
                                    color6 = color4;
                                    i20 = i8;
                                    num4 = num2;
                                    i21 = i11;
                                    i22 = i3;
                                    function03 = function0;
                                }
                                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.text.BentoMarkdownSpannedTextKt$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return BentoMarkdownSpannedText2.BentoMarkdownSpannedText_THkziT8$lambda$0(rawMarkdownText, modifier3, color7, color6, i20, num4, i21, i22, function03, i4, i5, (Composer) obj, ((Integer) obj2).intValue());
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
                                    if (i23 != 0) {
                                    }
                                    if (i7 != 0) {
                                    }
                                    if ((i5 & 8) == 0) {
                                    }
                                    if ((i5 & 16) == 0) {
                                    }
                                    if (i9 != 0) {
                                    }
                                    if (i10 == 0) {
                                    }
                                    if (i13 == 0) {
                                    }
                                    if (i15 == 0) {
                                    }
                                    color5 = color3;
                                    i17 = i16;
                                    i18 = i26;
                                    i19 = i27;
                                    num3 = num2;
                                    Modifier modifier42 = modifier2;
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    Spanned spannedRememberMarkdown2 = Markdown3.rememberMarkdown(rawMarkdownText, composerStartRestartGroup, i6 & 14);
                                    composerStartRestartGroup.startReplaceGroup(661858277);
                                    if (colorM21807getLinkColorQN2ZGVo != null) {
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    composer2 = composerStartRestartGroup;
                                    BentoSpannedText.m21106BentoSpannedTextTHkziT8(spannedRememberMarkdown2, modifier42, color5, colorM21807getLinkColorQN2ZGVo2, i17, num3, i18, i19, function02, composer2, i6 & 268428272, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    color6 = colorM21807getLinkColorQN2ZGVo;
                                    modifier3 = modifier42;
                                    color7 = color5;
                                    i20 = i17;
                                    num4 = num3;
                                    i21 = i18;
                                    i22 = i19;
                                    function03 = function02;
                                }
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
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
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
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
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
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
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
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
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
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
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }
}
