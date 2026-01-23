package com.robinhood.android.designsystem.inlinedefinition;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.tooltips.popup.PopupTooltipKt;
import com.robinhood.utils.compose.extendedspans.DottedUnderlineSpanPainter;
import com.robinhood.utils.compose.extendedspans.ExtendedSpans;
import com.robinhood.utils.compose.extendedspans.ExtendedSpans2;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BentoInlineDefinition.kt */
@Metadata(m3635d1 = {"\u00004\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u001aw\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a\r\u0010\u0016\u001a\u00020\u0004H\u0003¢\u0006\u0002\u0010\u0017\u001a\r\u0010\u0018\u001a\u00020\u0004H\u0003¢\u0006\u0002\u0010\u0017\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0019²\u0006\n\u0010\u001a\u001a\u00020\fX\u008a\u008e\u0002"}, m3636d2 = {"TEST_TAG_INLINE_DEFINITION_TEXT", "", "TEST_TAG_INLINE_DEFINITION_TOOLTIP_TEXT", "BentoInlineDefinition", "", "text", "tooltipText", "modifier", "Landroidx/compose/ui/Modifier;", ResourceTypes.COLOR, "Landroidx/compose/ui/graphics/Color;", "ignoreLinkStringCase", "", "linkString", "linkTextColor", "linkUnderlineColor", ResourceTypes.STYLE, "Landroidx/compose/ui/text/TextStyle;", "resetTooltipKey", "", "BentoInlineDefinition-lfSFqjE", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Color;ZLjava/lang/String;Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/text/TextStyle;ILandroidx/compose/runtime/Composer;II)V", "BentoInlineDefinitionPreview", "(Landroidx/compose/runtime/Composer;I)V", "BentoInlineDefinitionLinkStringPreview", "lib-design-system-inline-definition_externalRelease", "showTooltip"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.designsystem.inlinedefinition.BentoInlineDefinitionKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class BentoInlineDefinition {
    public static final String TEST_TAG_INLINE_DEFINITION_TEXT = "inline_definition_text";
    public static final String TEST_TAG_INLINE_DEFINITION_TOOLTIP_TEXT = "inline_definition_tooltip_text";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoInlineDefinitionLinkStringPreview$lambda$15(int i, Composer composer, int i2) {
        BentoInlineDefinitionLinkStringPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoInlineDefinitionPreview$lambda$14(int i, Composer composer, int i2) {
        BentoInlineDefinitionPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoInlineDefinition_lfSFqjE$lambda$13(String str, String str2, Modifier modifier, Color color, boolean z, String str3, Color color2, Color color3, TextStyle textStyle, int i, int i2, int i3, Composer composer, int i4) {
        m13274BentoInlineDefinitionlfSFqjE(str, str2, modifier, color, z, str3, color2, color3, textStyle, i, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:196:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x010e  */
    /* renamed from: BentoInlineDefinition-lfSFqjE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m13274BentoInlineDefinitionlfSFqjE(final String text, final String tooltipText, Modifier modifier, Color color, boolean z, String str, Color color2, Color color3, TextStyle textStyle, int i, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        Color color4;
        int i6;
        boolean z2;
        int i7;
        String str2;
        int i8;
        Color color5;
        int i9;
        int i10;
        Color colorM6701boximpl;
        TextStyle style;
        int i11;
        TextStyle textStyle2;
        int i12;
        Color color6;
        String str3;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        String str4;
        Color color7;
        Object objRememberedValue3;
        Object objRememberedValue4;
        Object objRememberedValue5;
        Object objRememberedValue6;
        String str5;
        boolean z3;
        Object objRememberedValue7;
        Composer composer2;
        final Color color8;
        final Modifier modifier3;
        final Color color9;
        final Color color10;
        final boolean z4;
        final int i13;
        final String str6;
        final TextStyle textStyle3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(tooltipText, "tooltipText");
        Composer composerStartRestartGroup = composer.startRestartGroup(-327715291);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(text) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(tooltipText) ? 32 : 16;
        }
        int i14 = i3 & 4;
        if (i14 != 0) {
            i4 |= 384;
        } else {
            if ((i2 & 384) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    color4 = color;
                    i4 |= composerStartRestartGroup.changed(color4) ? 2048 : 1024;
                }
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else {
                    if ((i2 & 24576) == 0) {
                        z2 = z;
                        i4 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
                    }
                    i7 = i3 & 32;
                    if (i7 == 0) {
                        i4 |= 196608;
                    } else {
                        if ((196608 & i2) == 0) {
                            str2 = str;
                            i4 |= composerStartRestartGroup.changed(str2) ? 131072 : 65536;
                        }
                        i8 = i3 & 64;
                        if (i8 != 0) {
                            i4 |= 1572864;
                            color5 = color2;
                        } else {
                            color5 = color2;
                            if ((i2 & 1572864) == 0) {
                                i4 |= composerStartRestartGroup.changed(color5) ? 1048576 : 524288;
                            }
                        }
                        if ((i2 & 12582912) == 0) {
                            i4 |= ((i3 & 128) == 0 && composerStartRestartGroup.changed(color3)) ? 8388608 : 4194304;
                        }
                        if ((i2 & 100663296) == 0) {
                            i4 |= ((i3 & 256) == 0 && composerStartRestartGroup.changed(textStyle)) ? 67108864 : 33554432;
                        }
                        i9 = i3 & 512;
                        if (i9 == 0) {
                            if ((i2 & 805306368) == 0) {
                                i10 = i9;
                                i4 |= composerStartRestartGroup.changed(i) ? 536870912 : 268435456;
                            }
                            if ((i4 & 306783379) == 306783378 || !composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.startDefaults();
                                if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                    if (i14 != 0) {
                                        modifier2 = Modifier.INSTANCE;
                                    }
                                    if (i5 != 0) {
                                        color4 = null;
                                    }
                                    if (i6 != 0) {
                                        z2 = true;
                                    }
                                    if (i7 != 0) {
                                        str2 = null;
                                    }
                                    if (i8 != 0) {
                                        color5 = null;
                                    }
                                    if ((i3 & 128) == 0) {
                                        colorM6701boximpl = Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21426getFg20d7_KjU());
                                        i4 &= -29360129;
                                    } else {
                                        colorM6701boximpl = color3;
                                    }
                                    if ((i3 & 256) == 0) {
                                        style = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getText(composerStartRestartGroup, 0).getStyle();
                                        i4 &= -234881025;
                                    } else {
                                        style = textStyle;
                                    }
                                    i11 = i4;
                                    textStyle2 = style;
                                    i12 = i10 == 0 ? 0 : i;
                                    color6 = colorM6701boximpl;
                                    str3 = str2;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    if ((i3 & 128) != 0) {
                                        i4 &= -29360129;
                                    }
                                    if ((i3 & 256) != 0) {
                                        i4 &= -234881025;
                                    }
                                    textStyle2 = textStyle;
                                    i12 = i;
                                    i11 = i4;
                                    str3 = str2;
                                    color6 = color3;
                                }
                                Color color11 = color4;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-327715291, i11, -1, "com.robinhood.android.designsystem.inlinedefinition.BentoInlineDefinition (BentoInlineDefinition.kt:56)");
                                }
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                companion = Composer.INSTANCE;
                                if (objRememberedValue == companion.getEmpty()) {
                                    objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue2 != companion.getEmpty()) {
                                    str4 = str3;
                                    color7 = color6;
                                    objRememberedValue2 = new ExtendedSpans(new DottedUnderlineSpanPainter(color6, null));
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                } else {
                                    str4 = str3;
                                    color7 = color6;
                                }
                                final ExtendedSpans extendedSpans = (ExtendedSpans) objRememberedValue2;
                                composerStartRestartGroup.endReplaceGroup();
                                Integer numValueOf = Integer.valueOf(i12);
                                composerStartRestartGroup.startReplaceGroup(5004770);
                                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue3 == companion.getEmpty()) {
                                    objRememberedValue3 = new BentoInlineDefinition2(snapshotState, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                EffectsKt.LaunchedEffect(numValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, (i11 >> 27) & 14);
                                Modifier modifierTestTag = TestTag3.testTag(modifier2, TEST_TAG_INLINE_DEFINITION_TEXT);
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue4 == companion.getEmpty()) {
                                    objRememberedValue4 = InteractionSource2.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                }
                                InteractionSource3 interactionSource3 = (InteractionSource3) objRememberedValue4;
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.startReplaceGroup(5004770);
                                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue5 == companion.getEmpty()) {
                                    objRememberedValue5 = new Function0() { // from class: com.robinhood.android.designsystem.inlinedefinition.BentoInlineDefinitionKt$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return BentoInlineDefinition.BentoInlineDefinition_lfSFqjE$lambda$7$lambda$6(snapshotState);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                Modifier modifierDrawBehind = ExtendedSpans2.drawBehind(ModifiersKt.autoLogEvents$default(ClickableKt.m4891clickableO2vRcR0$default(modifierTestTag, interactionSource3, null, false, null, null, (Function0) objRememberedValue5, 28, null), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.INLINE_DEFINITION, text, null, 4, null), null, 47, null), false, false, false, true, false, null, 110, null), extendedSpans);
                                boolean zBentoInlineDefinition_lfSFqjE$lambda$1 = BentoInlineDefinition_lfSFqjE$lambda$1(snapshotState);
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i15 = BentoTheme.$stable;
                                float fM21595getXsmallD9Ej5fM = bentoTheme.getSpacing(composerStartRestartGroup, i15).m21595getXsmallD9Ej5fM();
                                float fM21592getMediumD9Ej5fM = bentoTheme.getSpacing(composerStartRestartGroup, i15).m21592getMediumD9Ej5fM();
                                Boolean boolValueOf = Boolean.valueOf(zBentoInlineDefinition_lfSFqjE$lambda$1);
                                composerStartRestartGroup.startReplaceGroup(5004770);
                                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue6 == companion.getEmpty()) {
                                    objRememberedValue6 = new Function0() { // from class: com.robinhood.android.designsystem.inlinedefinition.BentoInlineDefinitionKt$$ExternalSyntheticLambda2
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return BentoInlineDefinition.BentoInlineDefinition_lfSFqjE$lambda$9$lambda$8(snapshotState);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                Modifier modifierM26519popupTooltipBgaGok8 = PopupTooltipKt.m26519popupTooltipBgaGok8(modifierDrawBehind, (16232 & 1) != 0 ? Boolean.TRUE : boolValueOf, (16232 & 2) != 0 ? 
                                /*  JADX ERROR: Method code generation error
                                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x036a: INVOKE (r2v2 'modifierM26519popupTooltipBgaGok8' androidx.compose.ui.Modifier) = 
                                      (r27v3 'modifierDrawBehind' androidx.compose.ui.Modifier)
                                      (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (16232 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0008: SGET  A[WRAPPED] (LINE:63) java.lang.Boolean.TRUE java.lang.Boolean) : (r28v3 'boolValueOf' java.lang.Boolean))
                                      (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x000c: ARITH (16232 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0015: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:67) call: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda5.<init>():void type: CONSTRUCTOR) : (wrap:kotlin.jvm.functions.Function0:0x033a: CHECK_CAST (kotlin.jvm.functions.Function0) (r9v16 'objRememberedValue6' java.lang.Object)))
                                      (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0019: ARITH (16232 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0022: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:71) call: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda6.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function0))
                                      (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0026: ARITH (16232 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x002f: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:75) call: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda7.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function0))
                                      (wrap:com.robinhood.tooltips.popup.PopupPositioning:?: TERNARY null = ((wrap:int:0x0033: ARITH (16232 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0039: SGET  A[WRAPPED] (LINE:83) com.robinhood.tooltips.popup.PopupPositioning.FREE com.robinhood.tooltips.popup.PopupPositioning) : (null com.robinhood.tooltips.popup.PopupPositioning))
                                      (wrap:kotlin.time.Duration:?: TERNARY null = ((wrap:int:0x003d: ARITH (16232 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null kotlin.time.Duration) : (null kotlin.time.Duration))
                                      (wrap:kotlin.time.Duration:?: TERNARY null = ((wrap:int:0x0046: ARITH (16232 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null kotlin.time.Duration) : (null kotlin.time.Duration))
                                      (wrap:float:?: TERNARY null = ((wrap:int:0x004e: ARITH (16232 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0054: INVOKE (0 int) STATIC call: androidx.compose.ui.unit.Dp.constructor-impl(float):float A[MD:(float):float (m), WRAPPED] (LINE:113)) : (r35v1 'fM21595getXsmallD9Ej5fM' float))
                                      (wrap:boolean:?: TERNARY null = ((wrap:int:0x005b: ARITH (16232 int) & (256 int) A[WRAPPED]) != (0 int)) ? true : false)
                                      (wrap:float:?: TERNARY null = ((wrap:int:0x0063: ARITH (16232 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0068: INVOKE (0 int) STATIC call: androidx.compose.ui.unit.Dp.constructor-impl(float):float A[MD:(float):float (m), WRAPPED] (LINE:113)) : (0.0f float))
                                      (wrap:float:?: TERNARY null = ((wrap:int:0x006f: ARITH (16232 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0078: INVOKE (0 int) STATIC call: androidx.compose.ui.unit.Dp.constructor-impl(float):float A[MD:(float):float (m), WRAPPED] (LINE:113)) : (0.0f float))
                                      (wrap:androidx.compose.ui.unit.Dp:?: TERNARY null = ((wrap:int:0x007c: ARITH (16232 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null androidx.compose.ui.unit.Dp) : (wrap:androidx.compose.ui.unit.Dp:0x033f: INVOKE (r4v42 'fM21592getMediumD9Ej5fM' float) STATIC call: androidx.compose.ui.unit.Dp.box-impl(float):androidx.compose.ui.unit.Dp A[MD:(float):androidx.compose.ui.unit.Dp (m), WRAPPED] (LINE:86)))
                                      (wrap:androidx.compose.animation.EnterTransition:?: TERNARY null = ((wrap:int:0x0084: ARITH (16232 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x008e: INVOKE 
                                      (wrap:androidx.compose.animation.EnterTransition$Companion:0x0088: SGET  A[WRAPPED] (LINE:110) androidx.compose.animation.EnterTransition.Companion androidx.compose.animation.EnterTransition$Companion)
                                     VIRTUAL call: androidx.compose.animation.EnterTransition.Companion.getNone():androidx.compose.animation.EnterTransition A[MD:():androidx.compose.animation.EnterTransition (m), WRAPPED] (LINE:110)) : (null androidx.compose.animation.EnterTransition))
                                      (wrap:androidx.compose.animation.ExitTransition:?: TERNARY null = ((wrap:int:0x0092: ARITH (16232 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x009c: INVOKE 
                                      (wrap:androidx.compose.animation.ExitTransition$Companion:0x0096: SGET  A[WRAPPED] (LINE:114) androidx.compose.animation.ExitTransition.Companion androidx.compose.animation.ExitTransition$Companion)
                                     VIRTUAL call: androidx.compose.animation.ExitTransition.Companion.getNone():androidx.compose.animation.ExitTransition A[MD:():androidx.compose.animation.ExitTransition (m), WRAPPED] (LINE:114)) : (null androidx.compose.animation.ExitTransition))
                                      (wrap:androidx.compose.runtime.internal.ComposableLambda:0x034e: INVOKE 
                                      (496853611 int)
                                      true
                                      (wrap:kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>:0x0345: CONSTRUCTOR (r51v0 'tooltipText' java.lang.String A[DONT_INLINE]) A[MD:(java.lang.String):void (m), WRAPPED] (LINE:87) call: com.robinhood.android.designsystem.inlinedefinition.BentoInlineDefinitionKt$BentoInlineDefinition$5.<init>(java.lang.String):void type: CONSTRUCTOR)
                                      (r3v1 'composerStartRestartGroup' androidx.compose.runtime.Composer)
                                      (54 int)
                                     STATIC call: androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(int, boolean, java.lang.Object, androidx.compose.runtime.Composer, int):androidx.compose.runtime.internal.ComposableLambda A[MD:(int, boolean, java.lang.Object, androidx.compose.runtime.Composer, int):androidx.compose.runtime.internal.ComposableLambda (m), WRAPPED] (LINE:87))
                                     STATIC call: com.robinhood.tooltips.popup.PopupTooltipKt.popupTooltip-BgaGok8(androidx.compose.ui.Modifier, java.lang.Boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, com.robinhood.tooltips.popup.PopupPositioning, kotlin.time.Duration, kotlin.time.Duration, float, boolean, float, float, androidx.compose.ui.unit.Dp, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, kotlin.jvm.functions.Function2):androidx.compose.ui.Modifier A[DECLARE_VAR, MD:(androidx.compose.ui.Modifier, java.lang.Boolean, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, com.robinhood.tooltips.popup.PopupPositioning, kotlin.time.Duration, kotlin.time.Duration, float, boolean, float, float, androidx.compose.ui.unit.Dp, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>):androidx.compose.ui.Modifier (m)] (LINE:59) in method: com.robinhood.android.designsystem.inlinedefinition.BentoInlineDefinitionKt.BentoInlineDefinition-lfSFqjE(java.lang.String, java.lang.String, androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Color, boolean, java.lang.String, androidx.compose.ui.graphics.Color, androidx.compose.ui.graphics.Color, androidx.compose.ui.text.TextStyle, int, androidx.compose.runtime.Composer, int, int):void, file: classes2.dex
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda5, state: NOT_LOADED
                                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                    	at jadx.core.codegen.InsnGen.makeTernary(InsnGen.java:1187)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:536)
                                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                    	... 53 more
                                    */
                                /*
                                    Method dump skipped, instructions count: 1119
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.designsystem.inlinedefinition.BentoInlineDefinition.m13274BentoInlineDefinitionlfSFqjE(java.lang.String, java.lang.String, androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Color, boolean, java.lang.String, androidx.compose.ui.graphics.Color, androidx.compose.ui.graphics.Color, androidx.compose.ui.text.TextStyle, int, androidx.compose.runtime.Composer, int, int):void");
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final void BentoInlineDefinition_lfSFqjE$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
                                snapshotState.setValue(Boolean.valueOf(z));
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit BentoInlineDefinition_lfSFqjE$lambda$7$lambda$6(SnapshotState snapshotState) {
                                BentoInlineDefinition_lfSFqjE$lambda$2(snapshotState, !BentoInlineDefinition_lfSFqjE$lambda$1(snapshotState));
                                return Unit.INSTANCE;
                            }

                            private static final boolean BentoInlineDefinition_lfSFqjE$lambda$1(SnapshotState<Boolean> snapshotState) {
                                return snapshotState.getValue().booleanValue();
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit BentoInlineDefinition_lfSFqjE$lambda$9$lambda$8(SnapshotState snapshotState) {
                                BentoInlineDefinition_lfSFqjE$lambda$2(snapshotState, false);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit BentoInlineDefinition_lfSFqjE$lambda$12$lambda$11(ExtendedSpans extendedSpans, TextLayoutResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                extendedSpans.onTextLayout(it);
                                return Unit.INSTANCE;
                            }

                            private static final void BentoInlineDefinitionPreview(Composer composer, final int i) {
                                Composer composerStartRestartGroup = composer.startRestartGroup(-1255731623);
                                if (i != 0 || !composerStartRestartGroup.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1255731623, i, -1, "com.robinhood.android.designsystem.inlinedefinition.BentoInlineDefinitionPreview (BentoInlineDefinition.kt:125)");
                                    }
                                    CompositionLocal3.CompositionLocalProvider(AutoLoggingCompositionLocals.getLocalEventLogger().provides(EventLogger.Noop.INSTANCE), BentoInlineDefinition4.INSTANCE.m1931xbfe43c91(), composerStartRestartGroup, ProvidedValue.$stable | 48);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                }
                                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.designsystem.inlinedefinition.BentoInlineDefinitionKt$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return BentoInlineDefinition.BentoInlineDefinitionPreview$lambda$14(i, (Composer) obj, ((Integer) obj2).intValue());
                                        }
                                    });
                                }
                            }

                            private static final void BentoInlineDefinitionLinkStringPreview(Composer composer, final int i) {
                                Composer composerStartRestartGroup = composer.startRestartGroup(-2063791442);
                                if (i != 0 || !composerStartRestartGroup.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-2063791442, i, -1, "com.robinhood.android.designsystem.inlinedefinition.BentoInlineDefinitionLinkStringPreview (BentoInlineDefinition.kt:138)");
                                    }
                                    CompositionLocal3.CompositionLocalProvider(AutoLoggingCompositionLocals.getLocalEventLogger().provides(EventLogger.Noop.INSTANCE), BentoInlineDefinition4.INSTANCE.m1934xec8aa7fa(), composerStartRestartGroup, ProvidedValue.$stable | 48);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                }
                                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.designsystem.inlinedefinition.BentoInlineDefinitionKt$$ExternalSyntheticLambda5
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return BentoInlineDefinition.BentoInlineDefinitionLinkStringPreview$lambda$15(i, (Composer) obj, ((Integer) obj2).intValue());
                                        }
                                    });
                                }
                            }
                        }
