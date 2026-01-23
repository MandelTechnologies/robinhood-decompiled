package androidx.compose.foundation.text;

import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.text.input.TextFieldDecorator;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.SolidColor;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextRange;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.input.ImeOptions;
import androidx.compose.p011ui.text.input.TextFieldValue;
import androidx.compose.p011ui.text.input.VisualTransformation;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Dp2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BasicTextField.kt */
@Metadata(m3635d1 = {"\u0000|\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u001aæ\u0001\u0010!\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2)\b\u0002\u0010 \u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00030\u001c¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b!\u0010\"\u001aæ\u0001\u0010!\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020#2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2)\b\u0002\u0010 \u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00030\u001c¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b!\u0010$\"\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'\"\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u00061²\u0006\f\u0010,\u001a\u00020+8\nX\u008a\u0084\u0002²\u0006\f\u0010-\u001a\u00020+8\nX\u008a\u0084\u0002²\u0006\f\u0010.\u001a\u00020+8\nX\u008a\u0084\u0002²\u0006\u000e\u0010/\u001a\u00020#8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00100\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, m3636d2 = {"", "value", "Lkotlin/Function1;", "", "onValueChange", "Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "readOnly", "Landroidx/compose/ui/text/TextStyle;", "textStyle", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardActions;", "keyboardActions", "singleLine", "", "maxLines", "minLines", "Landroidx/compose/ui/text/input/VisualTransformation;", "visualTransformation", "Landroidx/compose/ui/text/TextLayoutResult;", "onTextLayout", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/ui/graphics/Brush;", "cursorBrush", "Lkotlin/Function0;", "Lkotlin/ParameterName;", "name", "innerTextField", "decorationBox", "BasicTextField", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/ui/text/input/TextFieldValue;", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/foundation/text/input/TextFieldDecorator;", "DefaultTextFieldDecorator", "Landroidx/compose/foundation/text/input/TextFieldDecorator;", "Landroidx/compose/ui/unit/DpSize;", "MinTouchTargetSizeForHandles", "J", "", "cursorHandleState", "startHandleState", "endHandleState", "textFieldValueState", "lastTextValue", "foundation_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class BasicTextFieldKt {
    private static final TextFieldDecorator DefaultTextFieldDecorator = new TextFieldDecorator() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$DefaultTextFieldDecorator$1
    };
    private static final long MinTouchTargetSizeForHandles;

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldValue BasicTextField$lambda$24(SnapshotState<TextFieldValue> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String BasicTextField$lambda$28(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    static {
        float f = 40;
        MinTouchTargetSizeForHandles = Dp2.m8006DpSizeYgX7TsA(C2002Dp.m7995constructorimpl(f), C2002Dp.m7995constructorimpl(f));
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:279:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BasicTextField(final String str, final Function1<? super String, Unit> function1, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z3, int i, int i2, VisualTransformation visualTransformation, Function1<? super TextLayoutResult, Unit> function12, InteractionSource3 interactionSource3, Brush brush, Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i3, final int i4, final int i5) {
        int i6;
        Modifier modifier2;
        int i7;
        boolean z4;
        int i8;
        boolean z5;
        int i9;
        TextStyle textStyle2;
        int i10;
        KeyboardOptions keyboardOptions2;
        int i11;
        KeyboardActions keyboardActions2;
        int i12;
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
        int i25;
        Composer composer2;
        final int i26;
        Brush brush2;
        final Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function32;
        final KeyboardActions keyboardActions3;
        final boolean z6;
        final KeyboardOptions keyboardOptions3;
        final boolean z7;
        final TextStyle textStyle3;
        final boolean z8;
        final int i27;
        final VisualTransformation visualTransformation2;
        final Function1<? super TextLayoutResult, Unit> function13;
        final InteractionSource3 interactionSource32;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i28;
        int i29;
        boolean z9;
        Brush solidColor;
        Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function3M5341getLambda1$foundation_release;
        int i30;
        int i31;
        boolean z10;
        boolean z11;
        TextStyle textStyle4;
        Modifier modifier3;
        VisualTransformation visualTransformation3;
        Function1<? super TextLayoutResult, Unit> function14;
        KeyboardActions keyboardActions4;
        Brush brush3;
        KeyboardOptions keyboardOptions4;
        InteractionSource3 interactionSource33;
        boolean z12;
        int i32;
        Composer composerStartRestartGroup = composer.startRestartGroup(945255183);
        if ((i5 & 1) != 0) {
            i6 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i6 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        if ((i5 & 2) != 0) {
            i6 |= 48;
        } else if ((i3 & 48) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i33 = i5 & 4;
        if (i33 != 0) {
            i6 |= 384;
        } else {
            if ((i3 & 384) == 0) {
                modifier2 = modifier;
                i6 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i7 = i5 & 8;
            if (i7 == 0) {
                i6 |= 3072;
            } else {
                if ((i3 & 3072) == 0) {
                    z4 = z;
                    i6 |= composerStartRestartGroup.changed(z4) ? 2048 : 1024;
                }
                i8 = i5 & 16;
                if (i8 != 0) {
                    i6 |= 24576;
                } else {
                    if ((i3 & 24576) == 0) {
                        z5 = z2;
                        i6 |= composerStartRestartGroup.changed(z5) ? 16384 : 8192;
                    }
                    i9 = i5 & 32;
                    if (i9 == 0) {
                        i6 |= 196608;
                        textStyle2 = textStyle;
                    } else {
                        textStyle2 = textStyle;
                        if ((i3 & 196608) == 0) {
                            i6 |= composerStartRestartGroup.changed(textStyle2) ? 131072 : 65536;
                        }
                    }
                    i10 = i5 & 64;
                    if (i10 == 0) {
                        i6 |= 1572864;
                        keyboardOptions2 = keyboardOptions;
                    } else {
                        keyboardOptions2 = keyboardOptions;
                        if ((i3 & 1572864) == 0) {
                            i6 |= composerStartRestartGroup.changed(keyboardOptions2) ? 1048576 : 524288;
                        }
                    }
                    i11 = i5 & 128;
                    if (i11 == 0) {
                        i6 |= 12582912;
                        keyboardActions2 = keyboardActions;
                    } else {
                        keyboardActions2 = keyboardActions;
                        if ((i3 & 12582912) == 0) {
                            i6 |= composerStartRestartGroup.changed(keyboardActions2) ? 8388608 : 4194304;
                        }
                    }
                    i12 = i5 & 256;
                    if (i12 == 0) {
                        i6 |= 100663296;
                    } else if ((i3 & 100663296) == 0) {
                        i6 |= composerStartRestartGroup.changed(z3) ? 67108864 : 33554432;
                    }
                    if ((i3 & 805306368) == 0) {
                        i6 |= ((i5 & 512) == 0 && composerStartRestartGroup.changed(i)) ? 536870912 : 268435456;
                    }
                    i13 = i5 & 1024;
                    if (i13 == 0) {
                        i15 = i4 | 6;
                        i14 = i13;
                    } else if ((i4 & 6) == 0) {
                        i14 = i13;
                        i15 = i4 | (composerStartRestartGroup.changed(i2) ? 4 : 2);
                    } else {
                        i14 = i13;
                        i15 = i4;
                    }
                    i16 = i5 & 2048;
                    if (i16 == 0) {
                        i15 |= 48;
                        i17 = i16;
                    } else if ((i4 & 48) == 0) {
                        i17 = i16;
                        i15 |= composerStartRestartGroup.changed(visualTransformation) ? 32 : 16;
                    } else {
                        i17 = i16;
                    }
                    int i34 = i15;
                    i18 = i5 & 4096;
                    if (i18 == 0) {
                        i19 = i34 | 384;
                    } else if ((i4 & 384) == 0) {
                        i19 = i34 | (composerStartRestartGroup.changedInstance(function12) ? 256 : 128);
                    } else {
                        i19 = i34;
                    }
                    i20 = i5 & 8192;
                    if (i20 == 0) {
                        i21 = i19 | 3072;
                    } else {
                        int i35 = i19;
                        if ((i4 & 3072) == 0) {
                            i21 = i35 | (composerStartRestartGroup.changed(interactionSource3) ? 2048 : 1024);
                        } else {
                            i21 = i35;
                        }
                    }
                    i22 = i5 & 16384;
                    if (i22 != 0) {
                        i23 = i21;
                        if ((i4 & 24576) == 0) {
                            i23 |= composerStartRestartGroup.changed(brush) ? 16384 : 8192;
                        }
                        i24 = i5 & 32768;
                        if (i24 != 0) {
                            i23 |= 196608;
                        } else if ((i4 & 196608) == 0) {
                            i23 |= composerStartRestartGroup.changedInstance(function3) ? 131072 : 65536;
                        }
                        i25 = i23;
                        if (composerStartRestartGroup.shouldExecute(((i6 & 306783379) == 306783378 && (74899 & i25) == 74898) ? false : true, i6 & 1)) {
                            composerStartRestartGroup.startDefaults();
                            if ((i3 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                if (i33 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if (i7 != 0) {
                                    z4 = true;
                                }
                                if (i8 != 0) {
                                    z5 = false;
                                }
                                if (i9 != 0) {
                                    textStyle2 = TextStyle.INSTANCE.getDefault();
                                }
                                if (i10 != 0) {
                                    keyboardOptions2 = KeyboardOptions.INSTANCE.getDefault();
                                }
                                KeyboardActions keyboardActions5 = i11 != 0 ? KeyboardActions.INSTANCE.getDefault() : keyboardActions2;
                                boolean z13 = i12 != 0 ? false : z3;
                                if ((i5 & 512) != 0) {
                                    i28 = z13 ? 1 : Integer.MAX_VALUE;
                                    i6 &= -1879048193;
                                } else {
                                    i28 = i;
                                }
                                int i36 = i14 != 0 ? 1 : i2;
                                VisualTransformation none = i17 != 0 ? VisualTransformation.INSTANCE.getNone() : visualTransformation;
                                Function1<? super TextLayoutResult, Unit> function15 = i18 != 0 ? new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.6
                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(TextLayoutResult textLayoutResult) {
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                        invoke2(textLayoutResult);
                                        return Unit.INSTANCE;
                                    }
                                } : function12;
                                InteractionSource3 interactionSource34 = i20 != 0 ? null : interactionSource3;
                                if (i22 != 0) {
                                    i29 = i6;
                                    z9 = z13;
                                    solidColor = new SolidColor(Color.INSTANCE.m6716getBlack0d7_KjU(), null);
                                } else {
                                    i29 = i6;
                                    z9 = z13;
                                    solidColor = brush;
                                }
                                if (i24 != 0) {
                                    function3M5341getLambda1$foundation_release = ComposableSingletons$BasicTextFieldKt.INSTANCE.m5341getLambda1$foundation_release();
                                    i30 = i28;
                                    i31 = i36;
                                    z10 = z4;
                                    z11 = z5;
                                    textStyle4 = textStyle2;
                                    modifier3 = modifier2;
                                    visualTransformation3 = none;
                                    function14 = function15;
                                    i6 = i29;
                                } else {
                                    i6 = i29;
                                    function3M5341getLambda1$foundation_release = function3;
                                    i30 = i28;
                                    i31 = i36;
                                    z10 = z4;
                                    z11 = z5;
                                    textStyle4 = textStyle2;
                                    modifier3 = modifier2;
                                    visualTransformation3 = none;
                                    function14 = function15;
                                }
                                keyboardActions4 = keyboardActions5;
                                brush3 = solidColor;
                                keyboardOptions4 = keyboardOptions2;
                                interactionSource33 = interactionSource34;
                                z12 = z9;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i5 & 512) != 0) {
                                    i6 &= -1879048193;
                                }
                                z12 = z3;
                                i30 = i;
                                i31 = i2;
                                visualTransformation3 = visualTransformation;
                                function3M5341getLambda1$foundation_release = function3;
                                keyboardActions4 = keyboardActions2;
                                z10 = z4;
                                keyboardOptions4 = keyboardOptions2;
                                z11 = z5;
                                textStyle4 = textStyle2;
                                modifier3 = modifier2;
                                function14 = function12;
                                interactionSource33 = interactionSource3;
                                brush3 = brush;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(945255183, i6, i25, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:709)");
                            }
                            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                            Composer.Companion companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                                i32 = i25;
                                SnapshotState snapshotStateMutableStateOf$default = SnapshotState3.mutableStateOf$default(new TextFieldValue(str, 0L, (TextRange) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(snapshotStateMutableStateOf$default);
                                objRememberedValue = snapshotStateMutableStateOf$default;
                            } else {
                                i32 = i25;
                            }
                            final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
                            final TextFieldValue textFieldValueM7789copy3r_uNRQ$default = TextFieldValue.m7789copy3r_uNRQ$default(BasicTextField$lambda$24(snapshotState), str, 0L, (TextRange) null, 6, (Object) null);
                            boolean zChanged = composerStartRestartGroup.changed(textFieldValueM7789copy3r_uNRQ$default);
                            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            Modifier modifier4 = modifier3;
                            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = new Function0<Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$7$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        if (TextRange.m7639equalsimpl0(textFieldValueM7789copy3r_uNRQ$default.getSelection(), BasicTextFieldKt.BasicTextField$lambda$24(snapshotState).getSelection()) && Intrinsics.areEqual(textFieldValueM7789copy3r_uNRQ$default.getComposition(), BasicTextFieldKt.BasicTextField$lambda$24(snapshotState).getComposition())) {
                                            return;
                                        }
                                        snapshotState.setValue(textFieldValueM7789copy3r_uNRQ$default);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            EffectsKt.SideEffect((Function0) objRememberedValue2, composerStartRestartGroup, 0);
                            boolean z14 = (i6 & 14) == 4;
                            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (z14 || objRememberedValue3 == companion.getEmpty()) {
                                objRememberedValue3 = SnapshotState3.mutableStateOf$default(str, null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue3;
                            int i37 = i32;
                            ImeOptions imeOptions$foundation_release = keyboardOptions4.toImeOptions$foundation_release(z12);
                            boolean z15 = !z12;
                            int i38 = z12 ? 1 : i31;
                            int i39 = z12 ? 1 : i30;
                            KeyboardOptions keyboardOptions5 = keyboardOptions4;
                            boolean zChanged2 = composerStartRestartGroup.changed(snapshotState2) | ((i6 & 112) == 32);
                            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (zChanged2 || objRememberedValue4 == companion.getEmpty()) {
                                objRememberedValue4 = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$8$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
                                        invoke2(textFieldValue);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(TextFieldValue textFieldValue) {
                                        snapshotState.setValue(textFieldValue);
                                        boolean zAreEqual = Intrinsics.areEqual(BasicTextFieldKt.BasicTextField$lambda$28(snapshotState2), textFieldValue.getText());
                                        snapshotState2.setValue(textFieldValue.getText());
                                        if (zAreEqual) {
                                            return;
                                        }
                                        function1.invoke(textFieldValue.getText());
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            }
                            int i40 = i37 << 9;
                            composer2 = composerStartRestartGroup;
                            CoreTextFieldKt.CoreTextField(textFieldValueM7789copy3r_uNRQ$default, (Function1) objRememberedValue4, modifier4, textStyle4, visualTransformation3, function14, interactionSource33, brush3, z15, i39, i38, imeOptions$foundation_release, keyboardActions4, z10, z11, function3M5341getLambda1$foundation_release, null, composer2, (i6 & 896) | ((i6 >> 6) & 7168) | (57344 & i40) | (458752 & i40) | (3670016 & i40) | (i40 & 29360128), ((i6 >> 15) & 896) | (i6 & 7168) | (i6 & 57344) | (i37 & 458752), 65536);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier2 = modifier4;
                            textStyle3 = textStyle4;
                            interactionSource32 = interactionSource33;
                            brush2 = brush3;
                            keyboardActions3 = keyboardActions4;
                            z6 = z10;
                            function32 = function3M5341getLambda1$foundation_release;
                            keyboardOptions3 = keyboardOptions5;
                            z8 = z12;
                            visualTransformation2 = visualTransformation3;
                            function13 = function14;
                            z7 = z11;
                            i26 = i30;
                            i27 = i31;
                        } else {
                            composer2 = composerStartRestartGroup;
                            composer2.skipToGroupEnd();
                            i26 = i;
                            brush2 = brush;
                            function32 = function3;
                            keyboardActions3 = keyboardActions2;
                            z6 = z4;
                            keyboardOptions3 = keyboardOptions2;
                            z7 = z5;
                            textStyle3 = textStyle2;
                            z8 = z3;
                            i27 = i2;
                            visualTransformation2 = visualTransformation;
                            function13 = function12;
                            interactionSource32 = interactionSource3;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            final Modifier modifier5 = modifier2;
                            final Brush brush4 = brush2;
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.9
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

                                public final void invoke(Composer composer3, int i41) {
                                    BasicTextFieldKt.BasicTextField(str, function1, modifier5, z6, z7, textStyle3, keyboardOptions3, keyboardActions3, z8, i26, i27, visualTransformation2, function13, interactionSource32, brush4, function32, composer3, RecomposeScopeImpl4.updateChangedFlags(i3 | 1), RecomposeScopeImpl4.updateChangedFlags(i4), i5);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i23 = i21 | 24576;
                    i24 = i5 & 32768;
                    if (i24 != 0) {
                    }
                    i25 = i23;
                    if (composerStartRestartGroup.shouldExecute(((i6 & 306783379) == 306783378 && (74899 & i25) == 74898) ? false : true, i6 & 1)) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                z5 = z2;
                i9 = i5 & 32;
                if (i9 == 0) {
                }
                i10 = i5 & 64;
                if (i10 == 0) {
                }
                i11 = i5 & 128;
                if (i11 == 0) {
                }
                i12 = i5 & 256;
                if (i12 == 0) {
                }
                if ((i3 & 805306368) == 0) {
                }
                i13 = i5 & 1024;
                if (i13 == 0) {
                }
                i16 = i5 & 2048;
                if (i16 == 0) {
                }
                int i342 = i15;
                i18 = i5 & 4096;
                if (i18 == 0) {
                }
                i20 = i5 & 8192;
                if (i20 == 0) {
                }
                i22 = i5 & 16384;
                if (i22 != 0) {
                }
                i24 = i5 & 32768;
                if (i24 != 0) {
                }
                i25 = i23;
                if (composerStartRestartGroup.shouldExecute(((i6 & 306783379) == 306783378 && (74899 & i25) == 74898) ? false : true, i6 & 1)) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            z4 = z;
            i8 = i5 & 16;
            if (i8 != 0) {
            }
            z5 = z2;
            i9 = i5 & 32;
            if (i9 == 0) {
            }
            i10 = i5 & 64;
            if (i10 == 0) {
            }
            i11 = i5 & 128;
            if (i11 == 0) {
            }
            i12 = i5 & 256;
            if (i12 == 0) {
            }
            if ((i3 & 805306368) == 0) {
            }
            i13 = i5 & 1024;
            if (i13 == 0) {
            }
            i16 = i5 & 2048;
            if (i16 == 0) {
            }
            int i3422 = i15;
            i18 = i5 & 4096;
            if (i18 == 0) {
            }
            i20 = i5 & 8192;
            if (i20 == 0) {
            }
            i22 = i5 & 16384;
            if (i22 != 0) {
            }
            i24 = i5 & 32768;
            if (i24 != 0) {
            }
            i25 = i23;
            if (composerStartRestartGroup.shouldExecute(((i6 & 306783379) == 306783378 && (74899 & i25) == 74898) ? false : true, i6 & 1)) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i7 = i5 & 8;
        if (i7 == 0) {
        }
        z4 = z;
        i8 = i5 & 16;
        if (i8 != 0) {
        }
        z5 = z2;
        i9 = i5 & 32;
        if (i9 == 0) {
        }
        i10 = i5 & 64;
        if (i10 == 0) {
        }
        i11 = i5 & 128;
        if (i11 == 0) {
        }
        i12 = i5 & 256;
        if (i12 == 0) {
        }
        if ((i3 & 805306368) == 0) {
        }
        i13 = i5 & 1024;
        if (i13 == 0) {
        }
        i16 = i5 & 2048;
        if (i16 == 0) {
        }
        int i34222 = i15;
        i18 = i5 & 4096;
        if (i18 == 0) {
        }
        i20 = i5 & 8192;
        if (i20 == 0) {
        }
        i22 = i5 & 16384;
        if (i22 != 0) {
        }
        i24 = i5 & 32768;
        if (i24 != 0) {
        }
        i25 = i23;
        if (composerStartRestartGroup.shouldExecute(((i6 & 306783379) == 306783378 && (74899 & i25) == 74898) ? false : true, i6 & 1)) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:265:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BasicTextField(final TextFieldValue textFieldValue, final Function1<? super TextFieldValue, Unit> function1, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z3, int i, int i2, VisualTransformation visualTransformation, Function1<? super TextLayoutResult, Unit> function12, InteractionSource3 interactionSource3, Brush brush, Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i3, final int i4, final int i5) {
        int i6;
        Modifier modifier2;
        int i7;
        boolean z4;
        int i8;
        boolean z5;
        int i9;
        TextStyle textStyle2;
        int i10;
        KeyboardOptions keyboardOptions2;
        int i11;
        KeyboardActions keyboardActions2;
        int i12;
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
        int i25;
        Composer composer2;
        final int i26;
        final VisualTransformation visualTransformation2;
        final Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function32;
        final boolean z6;
        final KeyboardActions keyboardActions3;
        final boolean z7;
        final TextStyle textStyle3;
        final KeyboardOptions keyboardOptions3;
        final Modifier modifier3;
        final boolean z8;
        final int i27;
        final Function1<? super TextLayoutResult, Unit> function13;
        final InteractionSource3 interactionSource32;
        final Brush brush2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i28;
        Function1<? super TextLayoutResult, Unit> function14;
        InteractionSource3 interactionSource33;
        boolean z9;
        int i29;
        Brush solidColor;
        Brush brush3;
        TextStyle textStyle4;
        boolean z10;
        boolean z11;
        int i30;
        int i31;
        VisualTransformation visualTransformation3;
        KeyboardOptions keyboardOptions4;
        KeyboardActions keyboardActions4;
        int i32;
        Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function3M5342getLambda2$foundation_release;
        boolean z12;
        TextStyle textStyle5;
        Composer composerStartRestartGroup = composer.startRestartGroup(1804514146);
        if ((i5 & 1) != 0) {
            i6 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i6 = (composerStartRestartGroup.changed(textFieldValue) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        if ((i5 & 2) != 0) {
            i6 |= 48;
        } else if ((i3 & 48) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i33 = i5 & 4;
        if (i33 != 0) {
            i6 |= 384;
        } else {
            if ((i3 & 384) == 0) {
                modifier2 = modifier;
                i6 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i7 = i5 & 8;
            if (i7 == 0) {
                i6 |= 3072;
            } else {
                if ((i3 & 3072) == 0) {
                    z4 = z;
                    i6 |= composerStartRestartGroup.changed(z4) ? 2048 : 1024;
                }
                i8 = i5 & 16;
                if (i8 != 0) {
                    i6 |= 24576;
                } else {
                    if ((i3 & 24576) == 0) {
                        z5 = z2;
                        i6 |= composerStartRestartGroup.changed(z5) ? 16384 : 8192;
                    }
                    i9 = i5 & 32;
                    if (i9 == 0) {
                        i6 |= 196608;
                        textStyle2 = textStyle;
                    } else {
                        textStyle2 = textStyle;
                        if ((i3 & 196608) == 0) {
                            i6 |= composerStartRestartGroup.changed(textStyle2) ? 131072 : 65536;
                        }
                    }
                    i10 = i5 & 64;
                    if (i10 == 0) {
                        i6 |= 1572864;
                        keyboardOptions2 = keyboardOptions;
                    } else {
                        keyboardOptions2 = keyboardOptions;
                        if ((i3 & 1572864) == 0) {
                            i6 |= composerStartRestartGroup.changed(keyboardOptions2) ? 1048576 : 524288;
                        }
                    }
                    i11 = i5 & 128;
                    if (i11 == 0) {
                        i6 |= 12582912;
                        keyboardActions2 = keyboardActions;
                    } else {
                        keyboardActions2 = keyboardActions;
                        if ((i3 & 12582912) == 0) {
                            i6 |= composerStartRestartGroup.changed(keyboardActions2) ? 8388608 : 4194304;
                        }
                    }
                    i12 = i5 & 256;
                    if (i12 == 0) {
                        i6 |= 100663296;
                    } else if ((i3 & 100663296) == 0) {
                        i6 |= composerStartRestartGroup.changed(z3) ? 67108864 : 33554432;
                    }
                    if ((i3 & 805306368) == 0) {
                        i6 |= ((i5 & 512) == 0 && composerStartRestartGroup.changed(i)) ? 536870912 : 268435456;
                    }
                    i13 = i5 & 1024;
                    if (i13 == 0) {
                        i15 = i4 | 6;
                        i14 = i13;
                    } else if ((i4 & 6) == 0) {
                        i14 = i13;
                        i15 = i4 | (composerStartRestartGroup.changed(i2) ? 4 : 2);
                    } else {
                        i14 = i13;
                        i15 = i4;
                    }
                    i16 = i5 & 2048;
                    if (i16 == 0) {
                        i15 |= 48;
                        i17 = i16;
                    } else if ((i4 & 48) == 0) {
                        i17 = i16;
                        i15 |= composerStartRestartGroup.changed(visualTransformation) ? 32 : 16;
                    } else {
                        i17 = i16;
                    }
                    int i34 = i15;
                    i18 = i5 & 4096;
                    if (i18 == 0) {
                        i19 = i34 | 384;
                    } else if ((i4 & 384) == 0) {
                        i19 = i34 | (composerStartRestartGroup.changedInstance(function12) ? 256 : 128);
                    } else {
                        i19 = i34;
                    }
                    i20 = i5 & 8192;
                    if (i20 == 0) {
                        i21 = i19 | 3072;
                    } else {
                        int i35 = i19;
                        if ((i4 & 3072) == 0) {
                            i21 = i35 | (composerStartRestartGroup.changed(interactionSource3) ? 2048 : 1024);
                        } else {
                            i21 = i35;
                        }
                    }
                    i22 = i5 & 16384;
                    if (i22 != 0) {
                        i23 = i21;
                        if ((i4 & 24576) == 0) {
                            i23 |= composerStartRestartGroup.changed(brush) ? 16384 : 8192;
                        }
                        i24 = i5 & 32768;
                        if (i24 != 0) {
                            i23 |= 196608;
                        } else if ((i4 & 196608) == 0) {
                            i23 |= composerStartRestartGroup.changedInstance(function3) ? 131072 : 65536;
                        }
                        i25 = i23;
                        if (composerStartRestartGroup.shouldExecute(((i6 & 306783379) == 306783378 && (74899 & i25) == 74898) ? false : true, i6 & 1)) {
                            composerStartRestartGroup.startDefaults();
                            if ((i3 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                if (i33 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if (i7 != 0) {
                                    z4 = true;
                                }
                                if (i8 != 0) {
                                    z5 = false;
                                }
                                if (i9 != 0) {
                                    textStyle2 = TextStyle.INSTANCE.getDefault();
                                }
                                if (i10 != 0) {
                                    keyboardOptions2 = KeyboardOptions.INSTANCE.getDefault();
                                }
                                KeyboardActions keyboardActions5 = i11 != 0 ? KeyboardActions.INSTANCE.getDefault() : keyboardActions2;
                                boolean z13 = i12 != 0 ? false : z3;
                                if ((i5 & 512) != 0) {
                                    i28 = z13 ? 1 : Integer.MAX_VALUE;
                                    i6 &= -1879048193;
                                } else {
                                    i28 = i;
                                }
                                int i36 = i14 != 0 ? 1 : i2;
                                VisualTransformation none = i17 != 0 ? VisualTransformation.INSTANCE.getNone() : visualTransformation;
                                function14 = i18 != 0 ? new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.10
                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(TextLayoutResult textLayoutResult) {
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                        invoke2(textLayoutResult);
                                        return Unit.INSTANCE;
                                    }
                                } : function12;
                                interactionSource33 = i20 != 0 ? null : interactionSource3;
                                KeyboardActions keyboardActions6 = keyboardActions5;
                                if (i22 != 0) {
                                    z9 = z13;
                                    i29 = i6;
                                    solidColor = new SolidColor(Color.INSTANCE.m6716getBlack0d7_KjU(), null);
                                } else {
                                    z9 = z13;
                                    i29 = i6;
                                    solidColor = brush;
                                }
                                if (i24 != 0) {
                                    boolean z14 = z4;
                                    brush3 = solidColor;
                                    textStyle4 = textStyle2;
                                    z10 = z14;
                                    z11 = z9;
                                    i30 = i28;
                                    i31 = i36;
                                    visualTransformation3 = none;
                                    keyboardActions4 = keyboardActions6;
                                    i32 = i29;
                                    function3M5342getLambda2$foundation_release = ComposableSingletons$BasicTextFieldKt.INSTANCE.m5342getLambda2$foundation_release();
                                    keyboardOptions4 = keyboardOptions2;
                                } else {
                                    boolean z15 = z4;
                                    brush3 = solidColor;
                                    textStyle4 = textStyle2;
                                    z10 = z15;
                                    z11 = z9;
                                    i30 = i28;
                                    i31 = i36;
                                    visualTransformation3 = none;
                                    keyboardOptions4 = keyboardOptions2;
                                    keyboardActions4 = keyboardActions6;
                                    i32 = i29;
                                    function3M5342getLambda2$foundation_release = function3;
                                }
                                z12 = z5;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i5 & 512) != 0) {
                                    i6 &= -1879048193;
                                }
                                z11 = z3;
                                i30 = i;
                                i31 = i2;
                                function14 = function12;
                                interactionSource33 = interactionSource3;
                                i32 = i6;
                                keyboardActions4 = keyboardActions2;
                                textStyle4 = textStyle2;
                                keyboardOptions4 = keyboardOptions2;
                                visualTransformation3 = visualTransformation;
                                function3M5342getLambda2$foundation_release = function3;
                                z10 = z4;
                                z12 = z5;
                                brush3 = brush;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                textStyle5 = textStyle4;
                                ComposerKt.traceEventStart(1804514146, i32, i25, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:866)");
                            } else {
                                textStyle5 = textStyle4;
                            }
                            ImeOptions imeOptions$foundation_release = keyboardOptions4.toImeOptions$foundation_release(z11);
                            KeyboardOptions keyboardOptions5 = keyboardOptions4;
                            VisualTransformation visualTransformation4 = visualTransformation3;
                            Brush brush4 = brush3;
                            boolean z16 = !z11;
                            int i37 = z11 ? 1 : i31;
                            Modifier modifier4 = modifier2;
                            Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function33 = function3M5342getLambda2$foundation_release;
                            int i38 = z11 ? 1 : i30;
                            boolean z17 = ((i32 & 14) == 4) | ((i32 & 112) == 32);
                            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (z17 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$11$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue2) {
                                        invoke2(textFieldValue2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(TextFieldValue textFieldValue2) {
                                        if (Intrinsics.areEqual(textFieldValue, textFieldValue2)) {
                                            return;
                                        }
                                        function1.invoke(textFieldValue2);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            int i39 = i25 << 9;
                            boolean z18 = z11;
                            Function1<? super TextLayoutResult, Unit> function15 = function14;
                            InteractionSource3 interactionSource34 = interactionSource33;
                            composer2 = composerStartRestartGroup;
                            TextStyle textStyle6 = textStyle5;
                            CoreTextFieldKt.CoreTextField(textFieldValue, (Function1) objRememberedValue, modifier4, textStyle6, visualTransformation4, function15, interactionSource34, brush4, z16, i38, i37, imeOptions$foundation_release, keyboardActions4, z10, z12, function33, null, composer2, ((i32 >> 6) & 7168) | (i32 & 910) | (i39 & 57344) | (i39 & 458752) | (i39 & 3670016) | (i39 & 29360128), (i32 & 7168) | ((i32 >> 15) & 896) | (57344 & i32) | (i25 & 458752), 65536);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            keyboardActions3 = keyboardActions4;
                            function32 = function33;
                            i26 = i30;
                            i27 = i31;
                            z8 = z18;
                            visualTransformation2 = visualTransformation4;
                            brush2 = brush4;
                            z6 = z10;
                            keyboardOptions3 = keyboardOptions5;
                            function13 = function15;
                            z7 = z12;
                            interactionSource32 = interactionSource34;
                            textStyle3 = textStyle6;
                            modifier3 = modifier4;
                        } else {
                            composer2 = composerStartRestartGroup;
                            composer2.skipToGroupEnd();
                            i26 = i;
                            visualTransformation2 = visualTransformation;
                            function32 = function3;
                            z6 = z4;
                            keyboardActions3 = keyboardActions2;
                            z7 = z5;
                            textStyle3 = textStyle2;
                            keyboardOptions3 = keyboardOptions2;
                            modifier3 = modifier2;
                            z8 = z3;
                            i27 = i2;
                            function13 = function12;
                            interactionSource32 = interactionSource3;
                            brush2 = brush;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.12
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
                                    BasicTextFieldKt.BasicTextField(textFieldValue, function1, modifier3, z6, z7, textStyle3, keyboardOptions3, keyboardActions3, z8, i26, i27, visualTransformation2, function13, interactionSource32, brush2, function32, composer3, RecomposeScopeImpl4.updateChangedFlags(i3 | 1), RecomposeScopeImpl4.updateChangedFlags(i4), i5);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i23 = i21 | 24576;
                    i24 = i5 & 32768;
                    if (i24 != 0) {
                    }
                    i25 = i23;
                    if (composerStartRestartGroup.shouldExecute(((i6 & 306783379) == 306783378 && (74899 & i25) == 74898) ? false : true, i6 & 1)) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                z5 = z2;
                i9 = i5 & 32;
                if (i9 == 0) {
                }
                i10 = i5 & 64;
                if (i10 == 0) {
                }
                i11 = i5 & 128;
                if (i11 == 0) {
                }
                i12 = i5 & 256;
                if (i12 == 0) {
                }
                if ((i3 & 805306368) == 0) {
                }
                i13 = i5 & 1024;
                if (i13 == 0) {
                }
                i16 = i5 & 2048;
                if (i16 == 0) {
                }
                int i342 = i15;
                i18 = i5 & 4096;
                if (i18 == 0) {
                }
                i20 = i5 & 8192;
                if (i20 == 0) {
                }
                i22 = i5 & 16384;
                if (i22 != 0) {
                }
                i24 = i5 & 32768;
                if (i24 != 0) {
                }
                i25 = i23;
                if (composerStartRestartGroup.shouldExecute(((i6 & 306783379) == 306783378 && (74899 & i25) == 74898) ? false : true, i6 & 1)) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            z4 = z;
            i8 = i5 & 16;
            if (i8 != 0) {
            }
            z5 = z2;
            i9 = i5 & 32;
            if (i9 == 0) {
            }
            i10 = i5 & 64;
            if (i10 == 0) {
            }
            i11 = i5 & 128;
            if (i11 == 0) {
            }
            i12 = i5 & 256;
            if (i12 == 0) {
            }
            if ((i3 & 805306368) == 0) {
            }
            i13 = i5 & 1024;
            if (i13 == 0) {
            }
            i16 = i5 & 2048;
            if (i16 == 0) {
            }
            int i3422 = i15;
            i18 = i5 & 4096;
            if (i18 == 0) {
            }
            i20 = i5 & 8192;
            if (i20 == 0) {
            }
            i22 = i5 & 16384;
            if (i22 != 0) {
            }
            i24 = i5 & 32768;
            if (i24 != 0) {
            }
            i25 = i23;
            if (composerStartRestartGroup.shouldExecute(((i6 & 306783379) == 306783378 && (74899 & i25) == 74898) ? false : true, i6 & 1)) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i7 = i5 & 8;
        if (i7 == 0) {
        }
        z4 = z;
        i8 = i5 & 16;
        if (i8 != 0) {
        }
        z5 = z2;
        i9 = i5 & 32;
        if (i9 == 0) {
        }
        i10 = i5 & 64;
        if (i10 == 0) {
        }
        i11 = i5 & 128;
        if (i11 == 0) {
        }
        i12 = i5 & 256;
        if (i12 == 0) {
        }
        if ((i3 & 805306368) == 0) {
        }
        i13 = i5 & 1024;
        if (i13 == 0) {
        }
        i16 = i5 & 2048;
        if (i16 == 0) {
        }
        int i34222 = i15;
        i18 = i5 & 4096;
        if (i18 == 0) {
        }
        i20 = i5 & 8192;
        if (i20 == 0) {
        }
        i22 = i5 & 16384;
        if (i22 != 0) {
        }
        i24 = i5 & 32768;
        if (i24 != 0) {
        }
        i25 = i23;
        if (composerStartRestartGroup.shouldExecute(((i6 & 306783379) == 306783378 && (74899 & i25) == 74898) ? false : true, i6 & 1)) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }
}
