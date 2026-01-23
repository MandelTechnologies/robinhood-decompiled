package com.robinhood.android.retirement.lib;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.Toggleable2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.semantics.Role;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.compose.bento.component.BentoCheckbox2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowLayout;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RetirementSelectionRow.kt */
@Metadata(m3635d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001ay\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"RetirementSelectionRow", "", "primaryText", "", "checked", "", "onCheckedChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "primaryTextStyle", "Landroidx/compose/ui/text/TextStyle;", "primaryFontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "secondaryText", "removeHorizontalPadding", "removeVerticalPadding", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontWeight;Ljava/lang/String;ZZLandroidx/compose/runtime/Composer;II)V", "lib-retirement_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.retirement.lib.RetirementSelectionRowKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class RetirementSelectionRow {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RetirementSelectionRow$lambda$0(String str, boolean z, Function1 function1, Modifier modifier, boolean z2, TextStyle textStyle, FontWeight fontWeight, String str2, boolean z3, boolean z4, int i, int i2, Composer composer, int i3) {
        RetirementSelectionRow(str, z, function1, modifier, z2, textStyle, fontWeight, str2, z3, z4, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:159:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RetirementSelectionRow(final String primaryText, final boolean z, final Function1<? super Boolean, Unit> onCheckedChange, Modifier modifier, boolean z2, TextStyle textStyle, FontWeight fontWeight, String str, boolean z3, boolean z4, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        final boolean z5;
        TextStyle textS;
        int i5;
        FontWeight bold;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        final String str2;
        boolean z6;
        boolean z7;
        long jM21427getFg30d7_KjU;
        Composer composer2;
        final String str3;
        final Modifier modifier3;
        final boolean z8;
        final boolean z9;
        final FontWeight fontWeight2;
        final TextStyle textStyle2;
        final boolean z10;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(primaryText, "primaryText");
        Intrinsics.checkNotNullParameter(onCheckedChange, "onCheckedChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1487656421);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(primaryText) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onCheckedChange) ? 256 : 128;
        }
        int i11 = i2 & 8;
        if (i11 != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else {
                if ((i & 24576) == 0) {
                    z5 = z2;
                    i3 |= composerStartRestartGroup.changed(z5) ? 16384 : 8192;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        textS = textStyle;
                        int i12 = composerStartRestartGroup.changed(textS) ? 131072 : 65536;
                        i3 |= i12;
                    } else {
                        textS = textStyle;
                    }
                    i3 |= i12;
                } else {
                    textS = textStyle;
                }
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else {
                    if ((1572864 & i) == 0) {
                        bold = fontWeight;
                        i3 |= composerStartRestartGroup.changed(bold) ? 1048576 : 524288;
                    }
                    i6 = i2 & 128;
                    if (i6 == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i3 |= composerStartRestartGroup.changed(str) ? 8388608 : 4194304;
                    }
                    i7 = i2 & 256;
                    if (i7 == 0) {
                        i3 |= 100663296;
                    } else {
                        if ((i & 100663296) == 0) {
                            i8 = i7;
                            i3 |= composerStartRestartGroup.changed(z3) ? 67108864 : 33554432;
                        }
                        i9 = i2 & 512;
                        if (i9 == 0) {
                            if ((i & 805306368) == 0) {
                                i10 = i9;
                                i3 |= composerStartRestartGroup.changed(z4) ? 536870912 : 268435456;
                            }
                            if ((i3 & 306783379) == 306783378 || !composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.startDefaults();
                                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                    if (i11 != 0) {
                                        modifier2 = Modifier.INSTANCE;
                                    }
                                    if (i4 != 0) {
                                        z5 = true;
                                    }
                                    if ((i2 & 32) != 0) {
                                        i3 &= -458753;
                                        textS = BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getTextS();
                                    }
                                    if (i5 != 0) {
                                        bold = FontWeight.INSTANCE.getBold();
                                    }
                                    str2 = i6 == 0 ? null : str;
                                    boolean z11 = i8 == 0 ? false : z3;
                                    z6 = i10 == 0 ? false : z4;
                                    z7 = z11;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    if ((i2 & 32) != 0) {
                                        i3 &= -458753;
                                    }
                                    str2 = str;
                                    z7 = z3;
                                    z6 = z4;
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1487656421, i3, -1, "com.robinhood.android.retirement.lib.RetirementSelectionRow (RetirementSelectionRow.kt:29)");
                                }
                                if (z5) {
                                    composerStartRestartGroup.startReplaceGroup(586305406);
                                    jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21427getFg30d7_KjU();
                                } else {
                                    composerStartRestartGroup.startReplaceGroup(586304573);
                                    jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU();
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                final TextStyle textStyle3 = textS;
                                final FontWeight fontWeight3 = bold;
                                final long j = jM21427getFg30d7_KjU;
                                int i13 = i3;
                                composer2 = composerStartRestartGroup;
                                BentoBaseRowLayout.BentoBaseRowLayout(Toggleable2.m5319toggleableXHw0xAI(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), z, z5, Role.m7472boximpl(Role.INSTANCE.m7481getCheckboxo7Vup1c()), onCheckedChange), null, null, ComposableLambda3.rememberComposableLambda(-1054682088, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.lib.RetirementSelectionRowKt.RetirementSelectionRow.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i14) {
                                        if ((i14 & 3) == 2 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1054682088, i14, -1, "com.robinhood.android.retirement.lib.RetirementSelectionRow.<anonymous> (RetirementSelectionRow.kt:41)");
                                        }
                                        BentoText2.m20747BentoText38GnDrw(primaryText, null, Color.m6701boximpl(j), null, fontWeight3, null, null, 0, false, 0, 0, null, 0, textStyle3, composer3, 0, 0, 8170);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(1091884377, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.lib.RetirementSelectionRowKt.RetirementSelectionRow.2
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i14) {
                                        if ((i14 & 3) == 2 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1091884377, i14, -1, "com.robinhood.android.retirement.lib.RetirementSelectionRow.<anonymous> (RetirementSelectionRow.kt:49)");
                                        }
                                        String str4 = str2;
                                        if (str4 != null) {
                                            BentoMarkdownText2.BentoMarkdownText(str4, (Modifier) null, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(BentoTheme.INSTANCE.getTypography(composer3, BentoTheme.$stable).getTextS(), 0, j, 0L, false, composer3, BentoMarkdownText.$stable << 15, 26), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer3, MarkdownStyle.$stable << 6, 26);
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composerStartRestartGroup, 54), null, ComposableLambda3.rememberComposableLambda(1090050011, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.lib.RetirementSelectionRowKt.RetirementSelectionRow.3
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i14) {
                                        if ((i14 & 3) == 2 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1090050011, i14, -1, "com.robinhood.android.retirement.lib.RetirementSelectionRow.<anonymous> (RetirementSelectionRow.kt:60)");
                                        }
                                        BentoCheckbox2.m20599BentoCheckboxSj8uqqQ(PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), z, z5, null, null, composer3, 24576, 8);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composerStartRestartGroup, 54), false, z6, z7, null, composer2, ((i13 >> 3) & 234881024) | 14183424 | (1879048192 & (i13 << 3)), 0, 1062);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                str3 = str2;
                                modifier3 = modifier2;
                                z8 = z5;
                                z9 = z7;
                                fontWeight2 = fontWeight3;
                                textStyle2 = textS;
                                z10 = z6;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                str3 = str;
                                composer2 = composerStartRestartGroup;
                                modifier3 = modifier2;
                                z8 = z5;
                                textStyle2 = textS;
                                fontWeight2 = bold;
                                z9 = z3;
                                z10 = z4;
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.lib.RetirementSelectionRowKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return RetirementSelectionRow.RetirementSelectionRow$lambda$0(primaryText, z, onCheckedChange, modifier3, z8, textStyle2, fontWeight2, str3, z9, z10, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i3 |= 805306368;
                        i10 = i9;
                        if ((i3 & 306783379) == 306783378) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i11 != 0) {
                                }
                                if (i4 != 0) {
                                }
                                if ((i2 & 32) != 0) {
                                }
                                if (i5 != 0) {
                                }
                                if (i6 == 0) {
                                }
                                if (i8 == 0) {
                                }
                                if (i10 == 0) {
                                }
                                z7 = z11;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                if (z5) {
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                final TextStyle textStyle32 = textS;
                                final FontWeight fontWeight32 = bold;
                                final long j2 = jM21427getFg30d7_KjU;
                                int i132 = i3;
                                composer2 = composerStartRestartGroup;
                                BentoBaseRowLayout.BentoBaseRowLayout(Toggleable2.m5319toggleableXHw0xAI(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), z, z5, Role.m7472boximpl(Role.INSTANCE.m7481getCheckboxo7Vup1c()), onCheckedChange), null, null, ComposableLambda3.rememberComposableLambda(-1054682088, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.lib.RetirementSelectionRowKt.RetirementSelectionRow.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i14) {
                                        if ((i14 & 3) == 2 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1054682088, i14, -1, "com.robinhood.android.retirement.lib.RetirementSelectionRow.<anonymous> (RetirementSelectionRow.kt:41)");
                                        }
                                        BentoText2.m20747BentoText38GnDrw(primaryText, null, Color.m6701boximpl(j2), null, fontWeight32, null, null, 0, false, 0, 0, null, 0, textStyle32, composer3, 0, 0, 8170);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(1091884377, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.lib.RetirementSelectionRowKt.RetirementSelectionRow.2
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i14) {
                                        if ((i14 & 3) == 2 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1091884377, i14, -1, "com.robinhood.android.retirement.lib.RetirementSelectionRow.<anonymous> (RetirementSelectionRow.kt:49)");
                                        }
                                        String str4 = str2;
                                        if (str4 != null) {
                                            BentoMarkdownText2.BentoMarkdownText(str4, (Modifier) null, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(BentoTheme.INSTANCE.getTypography(composer3, BentoTheme.$stable).getTextS(), 0, j2, 0L, false, composer3, BentoMarkdownText.$stable << 15, 26), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer3, MarkdownStyle.$stable << 6, 26);
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composerStartRestartGroup, 54), null, ComposableLambda3.rememberComposableLambda(1090050011, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.lib.RetirementSelectionRowKt.RetirementSelectionRow.3
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i14) {
                                        if ((i14 & 3) == 2 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1090050011, i14, -1, "com.robinhood.android.retirement.lib.RetirementSelectionRow.<anonymous> (RetirementSelectionRow.kt:60)");
                                        }
                                        BentoCheckbox2.m20599BentoCheckboxSj8uqqQ(PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), z, z5, null, null, composer3, 24576, 8);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composerStartRestartGroup, 54), false, z6, z7, null, composer2, ((i132 >> 3) & 234881024) | 14183424 | (1879048192 & (i132 << 3)), 0, 1062);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                str3 = str2;
                                modifier3 = modifier2;
                                z8 = z5;
                                z9 = z7;
                                fontWeight2 = fontWeight32;
                                textStyle2 = textS;
                                z10 = z6;
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    i8 = i7;
                    i9 = i2 & 512;
                    if (i9 == 0) {
                    }
                    i10 = i9;
                    if ((i3 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                bold = fontWeight;
                i6 = i2 & 128;
                if (i6 == 0) {
                }
                i7 = i2 & 256;
                if (i7 == 0) {
                }
                i8 = i7;
                i9 = i2 & 512;
                if (i9 == 0) {
                }
                i10 = i9;
                if ((i3 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z5 = z2;
            if ((196608 & i) == 0) {
            }
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            bold = fontWeight;
            i6 = i2 & 128;
            if (i6 == 0) {
            }
            i7 = i2 & 256;
            if (i7 == 0) {
            }
            i8 = i7;
            i9 = i2 & 512;
            if (i9 == 0) {
            }
            i10 = i9;
            if ((i3 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        z5 = z2;
        if ((196608 & i) == 0) {
        }
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        bold = fontWeight;
        i6 = i2 & 128;
        if (i6 == 0) {
        }
        i7 = i2 & 256;
        if (i7 == 0) {
        }
        i8 = i7;
        i9 = i2 & 512;
        if (i9 == 0) {
        }
        i10 = i9;
        if ((i3 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
