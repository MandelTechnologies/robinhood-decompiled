package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimation;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.interaction.FocusInteraction3;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.text.selection.SelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColors2;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.material3.internal.TextFieldType;
import androidx.compose.material3.tokens.FilledTextFieldTokens;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Shape;
import androidx.compose.p011ui.platform.InspectableValueKt;
import androidx.compose.p011ui.platform.InspectorInfo;
import androidx.compose.p011ui.text.input.VisualTransformation;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: TextFieldDefaults.kt */
@Metadata(m3635d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b5\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\\\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014JJ\u0010\u0018\u001a\u00020\t*\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017Jû\u0001\u0010*\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00192\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00120\u001b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001b2\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001b2\u0010\b\u0002\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001b2\u0010\b\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001b2\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001b2\u0010\b\u0002\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001b2\u0010\b\u0002\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010(\u001a\u00020'2\u000e\b\u0002\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00120\u001bH\u0007¢\u0006\u0004\b*\u0010+J8\u00102\u001a\u00020'2\b\b\u0002\u0010,\u001a\u00020\u000f2\b\b\u0002\u0010-\u001a\u00020\u000f2\b\b\u0002\u0010.\u001a\u00020\u000f2\b\b\u0002\u0010/\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b0\u00101J8\u00104\u001a\u00020'2\b\b\u0002\u0010,\u001a\u00020\u000f2\b\b\u0002\u0010.\u001a\u00020\u000f2\b\b\u0002\u0010-\u001a\u00020\u000f2\b\b\u0002\u0010/\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b3\u00101J:\u00106\u001a\u00020'2\b\b\u0002\u0010,\u001a\u00020\u000f2\b\b\u0002\u0010.\u001a\u00020\u000f2\b\b\u0002\u0010-\u001a\u00020\u000f2\b\b\u0002\u0010/\u001a\u00020\u000fH\u0000ø\u0001\u0000¢\u0006\u0004\b5\u00101J\u000f\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u00107JÂ\u0003\u0010\f\u001a\u00020\u000b2\b\b\u0002\u00109\u001a\u0002082\b\b\u0002\u0010:\u001a\u0002082\b\b\u0002\u0010;\u001a\u0002082\b\b\u0002\u0010<\u001a\u0002082\b\b\u0002\u0010=\u001a\u0002082\b\b\u0002\u0010>\u001a\u0002082\b\b\u0002\u0010?\u001a\u0002082\b\b\u0002\u0010@\u001a\u0002082\b\b\u0002\u0010A\u001a\u0002082\b\b\u0002\u0010B\u001a\u0002082\n\b\u0002\u0010D\u001a\u0004\u0018\u00010C2\b\b\u0002\u0010E\u001a\u0002082\b\b\u0002\u0010F\u001a\u0002082\b\b\u0002\u0010G\u001a\u0002082\b\b\u0002\u0010H\u001a\u0002082\b\b\u0002\u0010I\u001a\u0002082\b\b\u0002\u0010J\u001a\u0002082\b\b\u0002\u0010K\u001a\u0002082\b\b\u0002\u0010L\u001a\u0002082\b\b\u0002\u0010M\u001a\u0002082\b\b\u0002\u0010N\u001a\u0002082\b\b\u0002\u0010O\u001a\u0002082\b\b\u0002\u0010P\u001a\u0002082\b\b\u0002\u0010Q\u001a\u0002082\b\b\u0002\u0010R\u001a\u0002082\b\b\u0002\u0010S\u001a\u0002082\b\b\u0002\u0010T\u001a\u0002082\b\b\u0002\u0010U\u001a\u0002082\b\b\u0002\u0010V\u001a\u0002082\b\b\u0002\u0010W\u001a\u0002082\b\b\u0002\u0010X\u001a\u0002082\b\b\u0002\u0010Y\u001a\u0002082\b\b\u0002\u0010Z\u001a\u0002082\b\b\u0002\u0010[\u001a\u0002082\b\b\u0002\u0010\\\u001a\u0002082\b\b\u0002\u0010]\u001a\u0002082\b\b\u0002\u0010^\u001a\u0002082\b\b\u0002\u0010_\u001a\u0002082\b\b\u0002\u0010`\u001a\u0002082\b\b\u0002\u0010a\u001a\u0002082\b\b\u0002\u0010b\u001a\u0002082\b\b\u0002\u0010c\u001a\u0002082\b\b\u0002\u0010d\u001a\u000208H\u0007ø\u0001\u0000¢\u0006\u0004\be\u0010fR\u001d\u0010g\u001a\u00020\u000f8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010jR\u001d\u0010k\u001a\u00020\u000f8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bk\u0010h\u001a\u0004\bl\u0010jR\u001d\u0010m\u001a\u00020\u000f8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bm\u0010h\u001a\u0004\bn\u0010jR\u001d\u0010o\u001a\u00020\u000f8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bo\u0010h\u001a\u0004\bp\u0010jR&\u0010q\u001a\u00020\u000f8\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bq\u0010h\u0012\u0004\bs\u0010\u0003\u001a\u0004\br\u0010jR&\u0010t\u001a\u00020\u000f8\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bt\u0010h\u0012\u0004\bv\u0010\u0003\u001a\u0004\bu\u0010jR\u0011\u0010\u000e\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\bw\u0010xR\u0018\u0010|\u001a\u00020\u000b*\u00020y8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bz\u0010{\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006}"}, m3636d2 = {"Landroidx/compose/material3/TextFieldDefaults;", "", "<init>", "()V", "", "enabled", "isError", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/material3/TextFieldColors;", "colors", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/unit/Dp;", "focusedIndicatorLineThickness", "unfocusedIndicatorLineThickness", "", "Container-4EFweAY", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/ui/graphics/Shape;FFLandroidx/compose/runtime/Composer;II)V", "Container", "indicatorLine-gv0btCI", "(Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material3/TextFieldColors;FF)Landroidx/compose/ui/Modifier;", "indicatorLine", "", "value", "Lkotlin/Function0;", "innerTextField", "singleLine", "Landroidx/compose/ui/text/input/VisualTransformation;", "visualTransformation", AnnotatedPrivateKey.LABEL, "placeholder", "leadingIcon", "trailingIcon", "prefix", "suffix", "supportingText", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "container", "DecorationBox", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "start", "end", "top", "bottom", "contentPaddingWithLabel-a9UjIt4", "(FFFF)Landroidx/compose/foundation/layout/PaddingValues;", "contentPaddingWithLabel", "contentPaddingWithoutLabel-a9UjIt4", "contentPaddingWithoutLabel", "supportingTextPadding-a9UjIt4$material3_release", "supportingTextPadding", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/TextFieldColors;", "Landroidx/compose/ui/graphics/Color;", "focusedTextColor", "unfocusedTextColor", "disabledTextColor", "errorTextColor", "focusedContainerColor", "unfocusedContainerColor", "disabledContainerColor", "errorContainerColor", "cursorColor", "errorCursorColor", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "selectionColors", "focusedIndicatorColor", "unfocusedIndicatorColor", "disabledIndicatorColor", "errorIndicatorColor", "focusedLeadingIconColor", "unfocusedLeadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "focusedTrailingIconColor", "unfocusedTrailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "focusedPlaceholderColor", "unfocusedPlaceholderColor", "disabledPlaceholderColor", "errorPlaceholderColor", "focusedSupportingTextColor", "unfocusedSupportingTextColor", "disabledSupportingTextColor", "errorSupportingTextColor", "focusedPrefixColor", "unfocusedPrefixColor", "disabledPrefixColor", "errorPrefixColor", "focusedSuffixColor", "unfocusedSuffixColor", "disabledSuffixColor", "errorSuffixColor", "colors-0hiis_0", "(JJJJJJJJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIIIIII)Landroidx/compose/material3/TextFieldColors;", "MinHeight", "F", "getMinHeight-D9Ej5fM", "()F", "MinWidth", "getMinWidth-D9Ej5fM", "UnfocusedIndicatorThickness", "getUnfocusedIndicatorThickness-D9Ej5fM", "FocusedIndicatorThickness", "getFocusedIndicatorThickness-D9Ej5fM", "UnfocusedBorderThickness", "getUnfocusedBorderThickness-D9Ej5fM", "getUnfocusedBorderThickness-D9Ej5fM$annotations", "FocusedBorderThickness", "getFocusedBorderThickness-D9Ej5fM", "getFocusedBorderThickness-D9Ej5fM$annotations", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "Landroidx/compose/material3/ColorScheme;", "getDefaultTextFieldColors", "(Landroidx/compose/material3/ColorScheme;Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/TextFieldColors;", "defaultTextFieldColors", "material3_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class TextFieldDefaults {
    private static final float FocusedBorderThickness;
    private static final float FocusedIndicatorThickness;
    public static final TextFieldDefaults INSTANCE = new TextFieldDefaults();
    private static final float MinHeight = C2002Dp.m7995constructorimpl(56);
    private static final float MinWidth = C2002Dp.m7995constructorimpl(280);
    private static final float UnfocusedBorderThickness;
    private static final float UnfocusedIndicatorThickness;

    private TextFieldDefaults() {
    }

    @JvmName
    public final Shape getShape(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1941327459, i, -1, "androidx.compose.material3.TextFieldDefaults.<get-shape> (TextFieldDefaults.kt:60)");
        }
        Shape value = Shapes5.getValue(FilledTextFieldTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m6019getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m6020getMinWidthD9Ej5fM() {
        return MinWidth;
    }

    /* renamed from: getUnfocusedIndicatorThickness-D9Ej5fM, reason: not valid java name */
    public final float m6021getUnfocusedIndicatorThicknessD9Ej5fM() {
        return UnfocusedIndicatorThickness;
    }

    /* renamed from: getFocusedIndicatorThickness-D9Ej5fM, reason: not valid java name */
    public final float m6018getFocusedIndicatorThicknessD9Ej5fM() {
        return FocusedIndicatorThickness;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00ed  */
    /* renamed from: Container-4EFweAY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m6014Container4EFweAY(final boolean z, final boolean z2, final InteractionSource interactionSource, Modifier modifier, TextFieldColors textFieldColors, Shape shape, float f, float f2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        TextFieldColors textFieldColors2;
        Shape shape2;
        float f3;
        float f4;
        float f5;
        Shape shape3;
        int i4;
        Composer composer2;
        final TextFieldColors textFieldColors3;
        final Modifier modifier3;
        final float f6;
        final float f7;
        final Shape shape4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-818661242);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(interactionSource) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    textFieldColors2 = textFieldColors;
                    int i6 = composerStartRestartGroup.changed(textFieldColors2) ? 16384 : 8192;
                    i3 |= i6;
                } else {
                    textFieldColors2 = textFieldColors;
                }
                i3 |= i6;
            } else {
                textFieldColors2 = textFieldColors;
            }
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    shape2 = shape;
                    int i7 = composerStartRestartGroup.changed(shape2) ? 131072 : 65536;
                    i3 |= i7;
                } else {
                    shape2 = shape;
                }
                i3 |= i7;
            } else {
                shape2 = shape;
            }
            if ((1572864 & i) != 0) {
                if ((i2 & 64) == 0) {
                    f3 = f;
                    int i8 = composerStartRestartGroup.changed(f3) ? 1048576 : 524288;
                    i3 |= i8;
                } else {
                    f3 = f;
                }
                i3 |= i8;
            } else {
                f3 = f;
            }
            if ((12582912 & i) != 0) {
                if ((i2 & 128) == 0) {
                    f4 = f2;
                    int i9 = composerStartRestartGroup.changed(f4) ? 8388608 : 4194304;
                    i3 |= i9;
                } else {
                    f4 = f2;
                }
                i3 |= i9;
            } else {
                f4 = f2;
            }
            if ((i2 & 256) == 0) {
                i3 |= 100663296;
            } else if ((i & 100663296) == 0) {
                i3 |= composerStartRestartGroup.changed(this) ? 67108864 : 33554432;
            }
            if ((38347923 & i3) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) == 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                    }
                    if ((i2 & 128) != 0) {
                        i3 &= -29360129;
                    }
                } else {
                    if (i5 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i2 & 16) != 0) {
                        TextFieldColors textFieldColorsColors = colors(composerStartRestartGroup, (i3 >> 24) & 14);
                        i3 &= -57345;
                        textFieldColors2 = textFieldColorsColors;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        shape2 = INSTANCE.getShape(composerStartRestartGroup, 6);
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        f3 = FocusedIndicatorThickness;
                    }
                    if ((i2 & 128) == 0) {
                        i3 &= -29360129;
                        f5 = UnfocusedIndicatorThickness;
                        shape3 = shape2;
                    }
                    int i10 = i3;
                    float f8 = f3;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        i4 = 6;
                        ComposerKt.traceEventStart(-818661242, i10, -1, "androidx.compose.material3.TextFieldDefaults.Container (TextFieldDefaults.kt:109)");
                    } else {
                        i4 = 6;
                    }
                    final SnapshotState4<Color> snapshotState4M4805animateColorAsStateeuL9pac = SingleValueAnimation.m4805animateColorAsStateeuL9pac(textFieldColors2.m5999containerColorXeAY9LY$material3_release(z, z2, FocusInteraction3.collectIsFocusedAsState(interactionSource, composerStartRestartGroup, (i10 >> 6) & 14).getValue().booleanValue()), AnimationSpecKt.tween$default(150, 0, null, i4, null), null, null, composerStartRestartGroup, 48, 12);
                    composer2 = composerStartRestartGroup;
                    TextFieldColors textFieldColors4 = textFieldColors2;
                    Shape shape5 = shape3;
                    BoxKt.Box(m6022indicatorLinegv0btCI(TextFieldImplKt.textFieldBackground(modifier2, new C1698x758e63df(new PropertyReference0Impl(snapshotState4M4805animateColorAsStateeuL9pac) { // from class: androidx.compose.material3.TextFieldDefaults$Container$1
                        @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty6
                        public Object get() {
                            return ((SnapshotState4) this.receiver).getValue();
                        }
                    }), shape3), z, z2, interactionSource, textFieldColors4, f8, f5), composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    textFieldColors3 = textFieldColors4;
                    modifier3 = modifier2;
                    f6 = f8;
                    f7 = f5;
                    shape4 = shape5;
                }
                shape3 = shape2;
                f5 = f4;
                int i102 = i3;
                float f82 = f3;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final Object snapshotState4M4805animateColorAsStateeuL9pac2 = SingleValueAnimation.m4805animateColorAsStateeuL9pac(textFieldColors2.m5999containerColorXeAY9LY$material3_release(z, z2, FocusInteraction3.collectIsFocusedAsState(interactionSource, composerStartRestartGroup, (i102 >> 6) & 14).getValue().booleanValue()), AnimationSpecKt.tween$default(150, 0, null, i4, null), null, null, composerStartRestartGroup, 48, 12);
                composer2 = composerStartRestartGroup;
                TextFieldColors textFieldColors42 = textFieldColors2;
                Shape shape52 = shape3;
                BoxKt.Box(m6022indicatorLinegv0btCI(TextFieldImplKt.textFieldBackground(modifier2, new C1698x758e63df(new PropertyReference0Impl(snapshotState4M4805animateColorAsStateeuL9pac2) { // from class: androidx.compose.material3.TextFieldDefaults$Container$1
                    @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty6
                    public Object get() {
                        return ((SnapshotState4) this.receiver).getValue();
                    }
                }), shape3), z, z2, interactionSource, textFieldColors42, f82, f5), composer2, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                textFieldColors3 = textFieldColors42;
                modifier3 = modifier2;
                f6 = f82;
                f7 = f5;
                shape4 = shape52;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                textFieldColors3 = textFieldColors2;
                shape4 = shape2;
                f7 = f4;
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
                f6 = f3;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldDefaults$Container$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i11) {
                        this.$tmp0_rcvr.m6014Container4EFweAY(z, z2, interactionSource, modifier3, textFieldColors3, shape4, f6, f7, composer3, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i & 24576) != 0) {
        }
        if ((196608 & i) != 0) {
        }
        if ((1572864 & i) != 0) {
        }
        if ((12582912 & i) != 0) {
        }
        if ((i2 & 256) == 0) {
        }
        if ((38347923 & i3) == 38347922) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0) {
                if (i5 != 0) {
                }
                if ((i2 & 16) != 0) {
                }
                if ((i2 & 32) != 0) {
                }
                if ((i2 & 64) != 0) {
                }
                if ((i2 & 128) == 0) {
                    shape3 = shape2;
                    f5 = f4;
                }
                int i1022 = i3;
                float f822 = f3;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final Object snapshotState4M4805animateColorAsStateeuL9pac22 = SingleValueAnimation.m4805animateColorAsStateeuL9pac(textFieldColors2.m5999containerColorXeAY9LY$material3_release(z, z2, FocusInteraction3.collectIsFocusedAsState(interactionSource, composerStartRestartGroup, (i1022 >> 6) & 14).getValue().booleanValue()), AnimationSpecKt.tween$default(150, 0, null, i4, null), null, null, composerStartRestartGroup, 48, 12);
                composer2 = composerStartRestartGroup;
                TextFieldColors textFieldColors422 = textFieldColors2;
                Shape shape522 = shape3;
                BoxKt.Box(m6022indicatorLinegv0btCI(TextFieldImplKt.textFieldBackground(modifier2, new C1698x758e63df(new PropertyReference0Impl(snapshotState4M4805animateColorAsStateeuL9pac22) { // from class: androidx.compose.material3.TextFieldDefaults$Container$1
                    @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty6
                    public Object get() {
                        return ((SnapshotState4) this.receiver).getValue();
                    }
                }), shape3), z, z2, interactionSource, textFieldColors422, f822, f5), composer2, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                textFieldColors3 = textFieldColors422;
                modifier3 = modifier2;
                f6 = f822;
                f7 = f5;
                shape4 = shape522;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:279:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void DecorationBox(final String str, final Function2<? super Composer, ? super Integer, Unit> function2, final boolean z, final boolean z2, final VisualTransformation visualTransformation, final InteractionSource interactionSource, boolean z3, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, Function2<? super Composer, ? super Integer, Unit> function26, Function2<? super Composer, ? super Integer, Unit> function27, Function2<? super Composer, ? super Integer, Unit> function28, Shape shape, TextFieldColors textFieldColors, PaddingValues paddingValues, Function2<? super Composer, ? super Integer, Unit> function29, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        boolean z4;
        VisualTransformation visualTransformation2;
        InteractionSource interactionSource2;
        int i5;
        boolean z5;
        int i6;
        Function2<? super Composer, ? super Integer, Unit> function210;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        Shape shape2;
        TextFieldColors textFieldColorsColors;
        PaddingValues paddingValuesM6011contentPaddingWithLabela9UjIt4$default;
        PaddingValues paddingValues2;
        boolean z6;
        final Function2<? super Composer, ? super Integer, Unit> function211;
        final Function2<? super Composer, ? super Integer, Unit> function212;
        final Function2<? super Composer, ? super Integer, Unit> function213;
        final Function2<? super Composer, ? super Integer, Unit> function214;
        Function2<? super Composer, ? super Integer, Unit> function2RememberComposableLambda;
        TextFieldColors textFieldColors2;
        Shape shape3;
        final Function2<? super Composer, ? super Integer, Unit> function215;
        int i20;
        final Function2<? super Composer, ? super Integer, Unit> function216;
        final Function2<? super Composer, ? super Integer, Unit> function217;
        PaddingValues paddingValues3;
        Composer composer2;
        final Shape shape4;
        final boolean z7;
        final PaddingValues paddingValues4;
        final TextFieldColors textFieldColors3;
        final Function2<? super Composer, ? super Integer, Unit> function218;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(289640444);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else {
            if ((i & 48) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
            }
            if ((i3 & 4) == 0) {
                i4 |= 384;
            } else {
                if ((i & 384) == 0) {
                    z4 = z;
                    i4 |= composerStartRestartGroup.changed(z4) ? 256 : 128;
                }
                if ((i3 & 8) != 0) {
                    i4 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        i4 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
                    }
                    int i21 = 8192;
                    if ((i3 & 16) == 0) {
                        i4 |= 24576;
                    } else {
                        if ((i & 24576) == 0) {
                            visualTransformation2 = visualTransformation;
                            i4 |= composerStartRestartGroup.changed(visualTransformation2) ? 16384 : 8192;
                        }
                        if ((i3 & 32) != 0) {
                            i4 |= 196608;
                            interactionSource2 = interactionSource;
                        } else {
                            interactionSource2 = interactionSource;
                            if ((i & 196608) == 0) {
                                i4 |= composerStartRestartGroup.changed(interactionSource2) ? 131072 : 65536;
                            }
                        }
                        i5 = i3 & 64;
                        if (i5 != 0) {
                            i4 |= 1572864;
                            z5 = z3;
                        } else {
                            z5 = z3;
                            if ((i & 1572864) == 0) {
                                i4 |= composerStartRestartGroup.changed(z5) ? 1048576 : 524288;
                            }
                        }
                        i6 = i3 & 128;
                        if (i6 != 0) {
                            i4 |= 12582912;
                            function210 = function22;
                        } else {
                            function210 = function22;
                            if ((i & 12582912) == 0) {
                                i4 |= composerStartRestartGroup.changedInstance(function210) ? 8388608 : 4194304;
                            }
                        }
                        i7 = i3 & 256;
                        if (i7 != 0) {
                            i4 |= 100663296;
                        } else if ((i & 100663296) == 0) {
                            i4 |= composerStartRestartGroup.changedInstance(function23) ? 67108864 : 33554432;
                        }
                        i8 = i3 & 512;
                        if (i8 == 0) {
                            if ((i & 805306368) == 0) {
                                i9 = i8;
                                i4 |= composerStartRestartGroup.changedInstance(function24) ? 536870912 : 268435456;
                            }
                            i10 = i3 & 1024;
                            if (i10 == 0) {
                                i12 = i2 | 6;
                                i11 = i10;
                            } else if ((i2 & 6) == 0) {
                                i11 = i10;
                                i12 = i2 | (composerStartRestartGroup.changedInstance(function25) ? 4 : 2);
                            } else {
                                i11 = i10;
                                i12 = i2;
                            }
                            i13 = i3 & 2048;
                            if (i13 == 0) {
                                i12 |= 48;
                                i14 = i13;
                            } else if ((i2 & 48) == 0) {
                                i14 = i13;
                                i12 |= composerStartRestartGroup.changedInstance(function26) ? 32 : 16;
                            } else {
                                i14 = i13;
                            }
                            int i22 = i12;
                            i15 = i3 & 4096;
                            if (i15 == 0) {
                                i16 = i22 | 384;
                            } else {
                                int i23 = i22;
                                if ((i2 & 384) == 0) {
                                    i23 |= composerStartRestartGroup.changedInstance(function27) ? 256 : 128;
                                }
                                i16 = i23;
                            }
                            i17 = i3 & 8192;
                            if (i17 == 0) {
                                i18 = i16 | 3072;
                            } else {
                                int i24 = i16;
                                if ((i2 & 3072) == 0) {
                                    i18 = i24 | (composerStartRestartGroup.changedInstance(function28) ? 2048 : 1024);
                                } else {
                                    i18 = i24;
                                }
                            }
                            if ((i2 & 24576) == 0) {
                                if ((i3 & 16384) == 0 && composerStartRestartGroup.changed(shape)) {
                                    i21 = 16384;
                                }
                                i18 |= i21;
                            }
                            if ((i2 & 196608) == 0) {
                                i18 |= ((i3 & 32768) == 0 && composerStartRestartGroup.changed(textFieldColors)) ? 131072 : 65536;
                            }
                            if ((i2 & 1572864) == 0) {
                                i18 |= ((i3 & 65536) == 0 && composerStartRestartGroup.changed(paddingValues)) ? 1048576 : 524288;
                            }
                            i19 = i3 & 131072;
                            if (i19 == 0) {
                                i18 |= 12582912;
                            } else if ((i2 & 12582912) == 0) {
                                i18 |= composerStartRestartGroup.changedInstance(function29) ? 8388608 : 4194304;
                            }
                            if ((i3 & 262144) == 0) {
                                i18 |= 100663296;
                            } else if ((i2 & 100663296) == 0) {
                                i18 |= composerStartRestartGroup.changed(this) ? 67108864 : 33554432;
                            }
                            if ((i4 & 306783379) == 306783378 || (i18 & 38347923) != 38347922 || !composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.startDefaults();
                                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                    if (i5 != 0) {
                                        z5 = false;
                                    }
                                    if (i6 != 0) {
                                        function210 = null;
                                    }
                                    Function2<? super Composer, ? super Integer, Unit> function219 = i7 == 0 ? null : function23;
                                    Function2<? super Composer, ? super Integer, Unit> function220 = i9 == 0 ? null : function24;
                                    Function2<? super Composer, ? super Integer, Unit> function221 = i11 == 0 ? null : function25;
                                    Function2<? super Composer, ? super Integer, Unit> function222 = i14 == 0 ? null : function26;
                                    Function2<? super Composer, ? super Integer, Unit> function223 = i15 == 0 ? null : function27;
                                    Function2<? super Composer, ? super Integer, Unit> function224 = i17 == 0 ? function28 : null;
                                    if ((i3 & 16384) == 0) {
                                        shape2 = INSTANCE.getShape(composerStartRestartGroup, 6);
                                        i18 &= -57345;
                                    } else {
                                        shape2 = shape;
                                    }
                                    if ((i3 & 32768) == 0) {
                                        textFieldColorsColors = colors(composerStartRestartGroup, (i18 >> 24) & 14);
                                        i18 &= -458753;
                                    } else {
                                        textFieldColorsColors = textFieldColors;
                                    }
                                    if ((i3 & 65536) == 0) {
                                        if (function210 == null) {
                                            paddingValuesM6011contentPaddingWithLabela9UjIt4$default = m6012contentPaddingWithoutLabela9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                        } else {
                                            paddingValuesM6011contentPaddingWithLabela9UjIt4$default = m6011contentPaddingWithLabela9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                        }
                                        i18 &= -3670017;
                                    } else {
                                        paddingValuesM6011contentPaddingWithLabela9UjIt4$default = paddingValues;
                                    }
                                    if (i19 == 0) {
                                        final TextFieldColors textFieldColors4 = textFieldColorsColors;
                                        final Shape shape5 = shape2;
                                        final InteractionSource interactionSource3 = interactionSource2;
                                        final boolean z8 = z5;
                                        final boolean z9 = z4;
                                        Function2<Composer, Integer, Unit> function225 = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldDefaults.DecorationBox.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                invoke(composer3, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer3, int i25) {
                                                if ((i25 & 3) != 2 || !composer3.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-435523791, i25, -1, "androidx.compose.material3.TextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:265)");
                                                    }
                                                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                                                    textFieldDefaults.m6014Container4EFweAY(z9, z8, interactionSource3, Modifier.INSTANCE, textFieldColors4, shape5, textFieldDefaults.m6018getFocusedIndicatorThicknessD9Ej5fM(), textFieldDefaults.m6021getUnfocusedIndicatorThicknessD9Ej5fM(), composer3, 114822144, 0);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer3.skipToGroupEnd();
                                            }
                                        };
                                        paddingValues2 = paddingValuesM6011contentPaddingWithLabela9UjIt4$default;
                                        Function2<? super Composer, ? super Integer, Unit> function226 = function223;
                                        z6 = z5;
                                        function211 = function219;
                                        function212 = function220;
                                        function213 = function226;
                                        function214 = function224;
                                        function2RememberComposableLambda = ComposableLambda3.rememberComposableLambda(-435523791, true, function225, composerStartRestartGroup, 54);
                                    } else {
                                        Function2<? super Composer, ? super Integer, Unit> function227 = function224;
                                        paddingValues2 = paddingValuesM6011contentPaddingWithLabela9UjIt4$default;
                                        Function2<? super Composer, ? super Integer, Unit> function228 = function223;
                                        z6 = z5;
                                        function211 = function219;
                                        function212 = function220;
                                        function213 = function228;
                                        function214 = function227;
                                        function2RememberComposableLambda = function29;
                                    }
                                    textFieldColors2 = textFieldColorsColors;
                                    shape3 = shape2;
                                    function215 = function210;
                                    i20 = i18;
                                    function216 = function221;
                                    function217 = function222;
                                    paddingValues3 = paddingValues2;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    if ((i3 & 16384) != 0) {
                                        i18 &= -57345;
                                    }
                                    if ((32768 & i3) != 0) {
                                        i18 &= -458753;
                                    }
                                    if ((i3 & 65536) != 0) {
                                        i18 &= -3670017;
                                    }
                                    function212 = function24;
                                    function216 = function25;
                                    function213 = function27;
                                    function214 = function28;
                                    shape3 = shape;
                                    textFieldColors2 = textFieldColors;
                                    paddingValues3 = paddingValues;
                                    function2RememberComposableLambda = function29;
                                    z6 = z5;
                                    function215 = function210;
                                    i20 = i18;
                                    function211 = function23;
                                    function217 = function26;
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(289640444, i4, i20, "androidx.compose.material3.TextFieldDefaults.DecorationBox (TextFieldDefaults.kt:276)");
                                }
                                int i25 = i4 << 3;
                                int i26 = i4 >> 3;
                                Shape shape6 = shape3;
                                int i27 = (i26 & 7168) | (i25 & 896) | (i25 & 112) | 6;
                                int i28 = i4 >> 9;
                                int i29 = i20 << 21;
                                composer2 = composerStartRestartGroup;
                                TextFieldImplKt.CommonDecorationBox(TextFieldType.Filled, str, function2, visualTransformation2, function215, function211, function212, function216, function217, function213, function214, z2, z, z6, interactionSource, paddingValues3, textFieldColors2, function2RememberComposableLambda, composer2, i27 | (i28 & 57344) | (i28 & 458752) | (i28 & 3670016) | (i29 & 29360128) | (i29 & 234881024) | (i29 & 1879048192), ((i20 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i28 & 7168) | (57344 & i26) | ((i20 >> 3) & 458752) | (3670016 & (i20 << 3)) | (i20 & 29360128), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                shape4 = shape6;
                                z7 = z6;
                                paddingValues4 = paddingValues3;
                                textFieldColors3 = textFieldColors2;
                                function218 = function2RememberComposableLambda;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                function212 = function24;
                                function216 = function25;
                                function213 = function27;
                                function214 = function28;
                                shape4 = shape;
                                textFieldColors3 = textFieldColors;
                                paddingValues4 = paddingValues;
                                function218 = function29;
                                composer2 = composerStartRestartGroup;
                                z7 = z5;
                                function215 = function210;
                                function211 = function23;
                                function217 = function26;
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldDefaults.DecorationBox.2
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

                                    public final void invoke(Composer composer3, int i30) {
                                        TextFieldDefaults.this.DecorationBox(str, function2, z, z2, visualTransformation, interactionSource, z7, function215, function211, function212, function216, function217, function213, function214, shape4, textFieldColors3, paddingValues4, function218, composer3, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i4 |= 805306368;
                        i9 = i8;
                        i10 = i3 & 1024;
                        if (i10 == 0) {
                        }
                        i13 = i3 & 2048;
                        if (i13 == 0) {
                        }
                        int i222 = i12;
                        i15 = i3 & 4096;
                        if (i15 == 0) {
                        }
                        i17 = i3 & 8192;
                        if (i17 == 0) {
                        }
                        if ((i2 & 24576) == 0) {
                        }
                        if ((i2 & 196608) == 0) {
                        }
                        if ((i2 & 1572864) == 0) {
                        }
                        i19 = i3 & 131072;
                        if (i19 == 0) {
                        }
                        if ((i3 & 262144) == 0) {
                        }
                        if ((i4 & 306783379) == 306783378) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i5 != 0) {
                                }
                                if (i6 != 0) {
                                }
                                if (i7 == 0) {
                                }
                                if (i9 == 0) {
                                }
                                if (i11 == 0) {
                                }
                                if (i14 == 0) {
                                }
                                if (i15 == 0) {
                                }
                                if (i17 == 0) {
                                }
                                if ((i3 & 16384) == 0) {
                                }
                                if ((i3 & 32768) == 0) {
                                }
                                if ((i3 & 65536) == 0) {
                                }
                                if (i19 == 0) {
                                }
                                textFieldColors2 = textFieldColorsColors;
                                shape3 = shape2;
                                function215 = function210;
                                i20 = i18;
                                function216 = function221;
                                function217 = function222;
                                paddingValues3 = paddingValues2;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                int i252 = i4 << 3;
                                int i262 = i4 >> 3;
                                Shape shape62 = shape3;
                                int i272 = (i262 & 7168) | (i252 & 896) | (i252 & 112) | 6;
                                int i282 = i4 >> 9;
                                int i292 = i20 << 21;
                                composer2 = composerStartRestartGroup;
                                TextFieldImplKt.CommonDecorationBox(TextFieldType.Filled, str, function2, visualTransformation2, function215, function211, function212, function216, function217, function213, function214, z2, z, z6, interactionSource, paddingValues3, textFieldColors2, function2RememberComposableLambda, composer2, i272 | (i282 & 57344) | (i282 & 458752) | (i282 & 3670016) | (i292 & 29360128) | (i292 & 234881024) | (i292 & 1879048192), ((i20 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i282 & 7168) | (57344 & i262) | ((i20 >> 3) & 458752) | (3670016 & (i20 << 3)) | (i20 & 29360128), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                shape4 = shape62;
                                z7 = z6;
                                paddingValues4 = paddingValues3;
                                textFieldColors3 = textFieldColors2;
                                function218 = function2RememberComposableLambda;
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    visualTransformation2 = visualTransformation;
                    if ((i3 & 32) != 0) {
                    }
                    i5 = i3 & 64;
                    if (i5 != 0) {
                    }
                    i6 = i3 & 128;
                    if (i6 != 0) {
                    }
                    i7 = i3 & 256;
                    if (i7 != 0) {
                    }
                    i8 = i3 & 512;
                    if (i8 == 0) {
                    }
                    i9 = i8;
                    i10 = i3 & 1024;
                    if (i10 == 0) {
                    }
                    i13 = i3 & 2048;
                    if (i13 == 0) {
                    }
                    int i2222 = i12;
                    i15 = i3 & 4096;
                    if (i15 == 0) {
                    }
                    i17 = i3 & 8192;
                    if (i17 == 0) {
                    }
                    if ((i2 & 24576) == 0) {
                    }
                    if ((i2 & 196608) == 0) {
                    }
                    if ((i2 & 1572864) == 0) {
                    }
                    i19 = i3 & 131072;
                    if (i19 == 0) {
                    }
                    if ((i3 & 262144) == 0) {
                    }
                    if ((i4 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                int i212 = 8192;
                if ((i3 & 16) == 0) {
                }
                visualTransformation2 = visualTransformation;
                if ((i3 & 32) != 0) {
                }
                i5 = i3 & 64;
                if (i5 != 0) {
                }
                i6 = i3 & 128;
                if (i6 != 0) {
                }
                i7 = i3 & 256;
                if (i7 != 0) {
                }
                i8 = i3 & 512;
                if (i8 == 0) {
                }
                i9 = i8;
                i10 = i3 & 1024;
                if (i10 == 0) {
                }
                i13 = i3 & 2048;
                if (i13 == 0) {
                }
                int i22222 = i12;
                i15 = i3 & 4096;
                if (i15 == 0) {
                }
                i17 = i3 & 8192;
                if (i17 == 0) {
                }
                if ((i2 & 24576) == 0) {
                }
                if ((i2 & 196608) == 0) {
                }
                if ((i2 & 1572864) == 0) {
                }
                i19 = i3 & 131072;
                if (i19 == 0) {
                }
                if ((i3 & 262144) == 0) {
                }
                if ((i4 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z4 = z;
            if ((i3 & 8) != 0) {
            }
            int i2122 = 8192;
            if ((i3 & 16) == 0) {
            }
            visualTransformation2 = visualTransformation;
            if ((i3 & 32) != 0) {
            }
            i5 = i3 & 64;
            if (i5 != 0) {
            }
            i6 = i3 & 128;
            if (i6 != 0) {
            }
            i7 = i3 & 256;
            if (i7 != 0) {
            }
            i8 = i3 & 512;
            if (i8 == 0) {
            }
            i9 = i8;
            i10 = i3 & 1024;
            if (i10 == 0) {
            }
            i13 = i3 & 2048;
            if (i13 == 0) {
            }
            int i222222 = i12;
            i15 = i3 & 4096;
            if (i15 == 0) {
            }
            i17 = i3 & 8192;
            if (i17 == 0) {
            }
            if ((i2 & 24576) == 0) {
            }
            if ((i2 & 196608) == 0) {
            }
            if ((i2 & 1572864) == 0) {
            }
            i19 = i3 & 131072;
            if (i19 == 0) {
            }
            if ((i3 & 262144) == 0) {
            }
            if ((i4 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        if ((i3 & 4) == 0) {
        }
        z4 = z;
        if ((i3 & 8) != 0) {
        }
        int i21222 = 8192;
        if ((i3 & 16) == 0) {
        }
        visualTransformation2 = visualTransformation;
        if ((i3 & 32) != 0) {
        }
        i5 = i3 & 64;
        if (i5 != 0) {
        }
        i6 = i3 & 128;
        if (i6 != 0) {
        }
        i7 = i3 & 256;
        if (i7 != 0) {
        }
        i8 = i3 & 512;
        if (i8 == 0) {
        }
        i9 = i8;
        i10 = i3 & 1024;
        if (i10 == 0) {
        }
        i13 = i3 & 2048;
        if (i13 == 0) {
        }
        int i2222222 = i12;
        i15 = i3 & 4096;
        if (i15 == 0) {
        }
        i17 = i3 & 8192;
        if (i17 == 0) {
        }
        if ((i2 & 24576) == 0) {
        }
        if ((i2 & 196608) == 0) {
        }
        if ((i2 & 1572864) == 0) {
        }
        i19 = i3 & 131072;
        if (i19 == 0) {
        }
        if ((i3 & 262144) == 0) {
        }
        if ((i4 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* renamed from: contentPaddingWithLabel-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m6011contentPaddingWithLabela9UjIt4$default(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 4) != 0) {
            f3 = TextField2.getTextFieldWithLabelVerticalPadding();
        }
        if ((i & 8) != 0) {
            f4 = TextField2.getTextFieldWithLabelVerticalPadding();
        }
        return textFieldDefaults.m6016contentPaddingWithLabela9UjIt4(f, f2, f3, f4);
    }

    /* renamed from: contentPaddingWithLabel-a9UjIt4, reason: not valid java name */
    public final PaddingValues m6016contentPaddingWithLabela9UjIt4(float start, float end, float top, float bottom) {
        return PaddingKt.m5138PaddingValuesa9UjIt4(start, top, end, bottom);
    }

    /* renamed from: contentPaddingWithoutLabel-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m6012contentPaddingWithoutLabela9UjIt4$default(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 8) != 0) {
            f4 = TextFieldImplKt.getTextFieldPadding();
        }
        return textFieldDefaults.m6017contentPaddingWithoutLabela9UjIt4(f, f2, f3, f4);
    }

    /* renamed from: contentPaddingWithoutLabel-a9UjIt4, reason: not valid java name */
    public final PaddingValues m6017contentPaddingWithoutLabela9UjIt4(float start, float top, float end, float bottom) {
        return PaddingKt.m5138PaddingValuesa9UjIt4(start, top, end, bottom);
    }

    /* renamed from: supportingTextPadding-a9UjIt4$material3_release$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m6013supportingTextPaddinga9UjIt4$material3_release$default(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.getSupportingTopPadding();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 8) != 0) {
            f4 = C2002Dp.m7995constructorimpl(0);
        }
        return textFieldDefaults.m6023supportingTextPaddinga9UjIt4$material3_release(f, f2, f3, f4);
    }

    /* renamed from: supportingTextPadding-a9UjIt4$material3_release, reason: not valid java name */
    public final PaddingValues m6023supportingTextPaddinga9UjIt4$material3_release(float start, float top, float end, float bottom) {
        return PaddingKt.m5138PaddingValuesa9UjIt4(start, top, end, bottom);
    }

    public final TextFieldColors colors(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(831731228, i, -1, "androidx.compose.material3.TextFieldDefaults.colors (TextFieldDefaults.kt:336)");
        }
        TextFieldColors defaultTextFieldColors = getDefaultTextFieldColors(MaterialTheme.INSTANCE.getColorScheme(composer, 6), composer, (i << 3) & 112);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultTextFieldColors;
    }

    /* renamed from: colors-0hiis_0, reason: not valid java name */
    public final TextFieldColors m6015colors0hiis_0(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, SelectionColors selectionColors, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, Composer composer, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        long j43;
        SelectionColors selectionColors2;
        long jM6726getUnspecified0d7_KjU = (i6 & 1) != 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : j;
        long jM6726getUnspecified0d7_KjU2 = (i6 & 2) != 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : j2;
        long jM6726getUnspecified0d7_KjU3 = (i6 & 4) != 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : j3;
        long jM6726getUnspecified0d7_KjU4 = (i6 & 8) != 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : j4;
        long jM6726getUnspecified0d7_KjU5 = (i6 & 16) != 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : j5;
        long jM6726getUnspecified0d7_KjU6 = (i6 & 32) != 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : j6;
        long jM6726getUnspecified0d7_KjU7 = (i6 & 64) != 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : j7;
        long j44 = jM6726getUnspecified0d7_KjU;
        long jM6726getUnspecified0d7_KjU8 = (i6 & 128) != 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : j8;
        long jM6726getUnspecified0d7_KjU9 = (i6 & 256) != 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : j9;
        long jM6726getUnspecified0d7_KjU10 = (i6 & 512) != 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : j10;
        SelectionColors selectionColors3 = (i6 & 1024) != 0 ? null : selectionColors;
        long jM6726getUnspecified0d7_KjU11 = (i6 & 2048) != 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : j11;
        long jM6726getUnspecified0d7_KjU12 = (i6 & 4096) != 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : j12;
        long jM6726getUnspecified0d7_KjU13 = (i6 & 8192) != 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : j13;
        long jM6726getUnspecified0d7_KjU14 = (i6 & 16384) != 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : j14;
        long jM6726getUnspecified0d7_KjU15 = (32768 & i6) != 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : j15;
        long jM6726getUnspecified0d7_KjU16 = (65536 & i6) != 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : j16;
        long jM6726getUnspecified0d7_KjU17 = (131072 & i6) != 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : j17;
        long jM6726getUnspecified0d7_KjU18 = (262144 & i6) != 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : j18;
        long jM6726getUnspecified0d7_KjU19 = (524288 & i6) != 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : j19;
        long jM6726getUnspecified0d7_KjU20 = (1048576 & i6) != 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : j20;
        long jM6726getUnspecified0d7_KjU21 = (2097152 & i6) != 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : j21;
        long jM6726getUnspecified0d7_KjU22 = (4194304 & i6) != 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : j22;
        long jM6726getUnspecified0d7_KjU23 = (8388608 & i6) != 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : j23;
        long jM6726getUnspecified0d7_KjU24 = (16777216 & i6) != 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : j24;
        long jM6726getUnspecified0d7_KjU25 = (33554432 & i6) != 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : j25;
        long jM6726getUnspecified0d7_KjU26 = (67108864 & i6) != 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : j26;
        long jM6726getUnspecified0d7_KjU27 = (134217728 & i6) != 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : j27;
        long jM6726getUnspecified0d7_KjU28 = (268435456 & i6) != 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : j28;
        long jM6726getUnspecified0d7_KjU29 = (536870912 & i6) != 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : j29;
        long jM6726getUnspecified0d7_KjU30 = (i6 & 1073741824) != 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : j30;
        long jM6726getUnspecified0d7_KjU31 = (i7 & 1) != 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : j31;
        long jM6726getUnspecified0d7_KjU32 = (i7 & 2) != 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : j32;
        long jM6726getUnspecified0d7_KjU33 = (i7 & 4) != 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : j33;
        long jM6726getUnspecified0d7_KjU34 = (i7 & 8) != 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : j34;
        long jM6726getUnspecified0d7_KjU35 = (i7 & 16) != 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : j35;
        long jM6726getUnspecified0d7_KjU36 = (i7 & 32) != 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : j36;
        long jM6726getUnspecified0d7_KjU37 = (i7 & 64) != 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : j37;
        long jM6726getUnspecified0d7_KjU38 = (i7 & 128) != 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : j38;
        long jM6726getUnspecified0d7_KjU39 = (i7 & 256) != 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : j39;
        long jM6726getUnspecified0d7_KjU40 = (i7 & 512) != 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : j40;
        long jM6726getUnspecified0d7_KjU41 = (i7 & 1024) != 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : j41;
        long jM6726getUnspecified0d7_KjU42 = (i7 & 2048) != 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : j42;
        if (ComposerKt.isTraceInProgress()) {
            j43 = jM6726getUnspecified0d7_KjU42;
            selectionColors2 = selectionColors3;
            ComposerKt.traceEventStart(1513344955, i, i2, "androidx.compose.material3.TextFieldDefaults.colors (TextFieldDefaults.kt:438)");
        } else {
            j43 = jM6726getUnspecified0d7_KjU42;
            selectionColors2 = selectionColors3;
        }
        TextFieldColors textFieldColorsM6000copyejIjP34 = getDefaultTextFieldColors(MaterialTheme.INSTANCE.getColorScheme(composer, 6), composer, (i5 >> 6) & 112).m6000copyejIjP34(j44, jM6726getUnspecified0d7_KjU2, jM6726getUnspecified0d7_KjU3, jM6726getUnspecified0d7_KjU4, jM6726getUnspecified0d7_KjU5, jM6726getUnspecified0d7_KjU6, jM6726getUnspecified0d7_KjU7, jM6726getUnspecified0d7_KjU8, jM6726getUnspecified0d7_KjU9, jM6726getUnspecified0d7_KjU10, selectionColors2, jM6726getUnspecified0d7_KjU11, jM6726getUnspecified0d7_KjU12, jM6726getUnspecified0d7_KjU13, jM6726getUnspecified0d7_KjU14, jM6726getUnspecified0d7_KjU15, jM6726getUnspecified0d7_KjU16, jM6726getUnspecified0d7_KjU17, jM6726getUnspecified0d7_KjU18, jM6726getUnspecified0d7_KjU19, jM6726getUnspecified0d7_KjU20, jM6726getUnspecified0d7_KjU21, jM6726getUnspecified0d7_KjU22, jM6726getUnspecified0d7_KjU23, jM6726getUnspecified0d7_KjU24, jM6726getUnspecified0d7_KjU25, jM6726getUnspecified0d7_KjU26, jM6726getUnspecified0d7_KjU27, jM6726getUnspecified0d7_KjU28, jM6726getUnspecified0d7_KjU29, jM6726getUnspecified0d7_KjU30, jM6726getUnspecified0d7_KjU31, jM6726getUnspecified0d7_KjU32, jM6726getUnspecified0d7_KjU33, jM6726getUnspecified0d7_KjU34, jM6726getUnspecified0d7_KjU35, jM6726getUnspecified0d7_KjU36, jM6726getUnspecified0d7_KjU37, jM6726getUnspecified0d7_KjU38, jM6726getUnspecified0d7_KjU39, jM6726getUnspecified0d7_KjU40, jM6726getUnspecified0d7_KjU41, j43);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return textFieldColorsM6000copyejIjP34;
    }

    @JvmName
    public final TextFieldColors getDefaultTextFieldColors(ColorScheme colorScheme, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1341970309, i, -1, "androidx.compose.material3.TextFieldDefaults.<get-defaultTextFieldColors> (TextFieldDefaults.kt:486)");
        }
        TextFieldColors defaultTextFieldColorsCached = colorScheme.getDefaultTextFieldColorsCached();
        composer.startReplaceGroup(27085453);
        if (defaultTextFieldColorsCached == null) {
            FilledTextFieldTokens filledTextFieldTokens = FilledTextFieldTokens.INSTANCE;
            TextFieldColors textFieldColors = new TextFieldColors(ColorScheme2.fromToken(colorScheme, filledTextFieldTokens.getFocusInputColor()), ColorScheme2.fromToken(colorScheme, filledTextFieldTokens.getInputColor()), Color.m6705copywmQWz5c$default(ColorScheme2.fromToken(colorScheme, filledTextFieldTokens.getDisabledInputColor()), filledTextFieldTokens.getDisabledInputOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorScheme2.fromToken(colorScheme, filledTextFieldTokens.getErrorInputColor()), ColorScheme2.fromToken(colorScheme, filledTextFieldTokens.getContainerColor()), ColorScheme2.fromToken(colorScheme, filledTextFieldTokens.getContainerColor()), ColorScheme2.fromToken(colorScheme, filledTextFieldTokens.getContainerColor()), ColorScheme2.fromToken(colorScheme, filledTextFieldTokens.getContainerColor()), ColorScheme2.fromToken(colorScheme, filledTextFieldTokens.getCaretColor()), ColorScheme2.fromToken(colorScheme, filledTextFieldTokens.getErrorFocusCaretColor()), (SelectionColors) composer.consume(TextSelectionColors2.getLocalTextSelectionColors()), ColorScheme2.fromToken(colorScheme, filledTextFieldTokens.getFocusActiveIndicatorColor()), ColorScheme2.fromToken(colorScheme, filledTextFieldTokens.getActiveIndicatorColor()), Color.m6705copywmQWz5c$default(ColorScheme2.fromToken(colorScheme, filledTextFieldTokens.getDisabledActiveIndicatorColor()), filledTextFieldTokens.getDisabledActiveIndicatorOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorScheme2.fromToken(colorScheme, filledTextFieldTokens.getErrorActiveIndicatorColor()), ColorScheme2.fromToken(colorScheme, filledTextFieldTokens.getFocusLeadingIconColor()), ColorScheme2.fromToken(colorScheme, filledTextFieldTokens.getLeadingIconColor()), Color.m6705copywmQWz5c$default(ColorScheme2.fromToken(colorScheme, filledTextFieldTokens.getDisabledLeadingIconColor()), filledTextFieldTokens.getDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorScheme2.fromToken(colorScheme, filledTextFieldTokens.getErrorLeadingIconColor()), ColorScheme2.fromToken(colorScheme, filledTextFieldTokens.getFocusTrailingIconColor()), ColorScheme2.fromToken(colorScheme, filledTextFieldTokens.getTrailingIconColor()), Color.m6705copywmQWz5c$default(ColorScheme2.fromToken(colorScheme, filledTextFieldTokens.getDisabledTrailingIconColor()), filledTextFieldTokens.getDisabledTrailingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorScheme2.fromToken(colorScheme, filledTextFieldTokens.getErrorTrailingIconColor()), ColorScheme2.fromToken(colorScheme, filledTextFieldTokens.getFocusLabelColor()), ColorScheme2.fromToken(colorScheme, filledTextFieldTokens.getLabelColor()), Color.m6705copywmQWz5c$default(ColorScheme2.fromToken(colorScheme, filledTextFieldTokens.getDisabledLabelColor()), filledTextFieldTokens.getDisabledLabelOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorScheme2.fromToken(colorScheme, filledTextFieldTokens.getErrorLabelColor()), ColorScheme2.fromToken(colorScheme, filledTextFieldTokens.getInputPlaceholderColor()), ColorScheme2.fromToken(colorScheme, filledTextFieldTokens.getInputPlaceholderColor()), Color.m6705copywmQWz5c$default(ColorScheme2.fromToken(colorScheme, filledTextFieldTokens.getDisabledInputColor()), filledTextFieldTokens.getDisabledInputOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorScheme2.fromToken(colorScheme, filledTextFieldTokens.getInputPlaceholderColor()), ColorScheme2.fromToken(colorScheme, filledTextFieldTokens.getFocusSupportingColor()), ColorScheme2.fromToken(colorScheme, filledTextFieldTokens.getSupportingColor()), Color.m6705copywmQWz5c$default(ColorScheme2.fromToken(colorScheme, filledTextFieldTokens.getDisabledSupportingColor()), filledTextFieldTokens.getDisabledSupportingOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorScheme2.fromToken(colorScheme, filledTextFieldTokens.getErrorSupportingColor()), ColorScheme2.fromToken(colorScheme, filledTextFieldTokens.getInputPrefixColor()), ColorScheme2.fromToken(colorScheme, filledTextFieldTokens.getInputPrefixColor()), Color.m6705copywmQWz5c$default(ColorScheme2.fromToken(colorScheme, filledTextFieldTokens.getInputPrefixColor()), filledTextFieldTokens.getDisabledInputOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorScheme2.fromToken(colorScheme, filledTextFieldTokens.getInputPrefixColor()), ColorScheme2.fromToken(colorScheme, filledTextFieldTokens.getInputSuffixColor()), ColorScheme2.fromToken(colorScheme, filledTextFieldTokens.getInputSuffixColor()), Color.m6705copywmQWz5c$default(ColorScheme2.fromToken(colorScheme, filledTextFieldTokens.getInputSuffixColor()), filledTextFieldTokens.getDisabledInputOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorScheme2.fromToken(colorScheme, filledTextFieldTokens.getInputSuffixColor()), null);
            colorScheme.setDefaultTextFieldColorsCached$material3_release(textFieldColors);
            defaultTextFieldColorsCached = textFieldColors;
        }
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultTextFieldColorsCached;
    }

    /* renamed from: indicatorLine-gv0btCI, reason: not valid java name */
    public final Modifier m6022indicatorLinegv0btCI(Modifier modifier, final boolean z, final boolean z2, final InteractionSource interactionSource, final TextFieldColors textFieldColors, final float f, final float f2) {
        return ComposedModifier2.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.material3.TextFieldDefaults$indicatorLine-gv0btCI$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("indicatorLine");
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z));
                inspectorInfo.getProperties().set("isError", Boolean.valueOf(z2));
                inspectorInfo.getProperties().set("interactionSource", interactionSource);
                inspectorInfo.getProperties().set("colors", textFieldColors);
                inspectorInfo.getProperties().set("focusedIndicatorLineThickness", C2002Dp.m7993boximpl(f));
                inspectorInfo.getProperties().set("unfocusedIndicatorLineThickness", C2002Dp.m7993boximpl(f2));
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.material3.TextFieldDefaults$indicatorLine$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            public final Modifier invoke(Modifier modifier2, Composer composer, int i) {
                composer.startReplaceGroup(-891038934);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-891038934, i, -1, "androidx.compose.material3.TextFieldDefaults.indicatorLine.<anonymous> (TextFieldDefaults.kt:169)");
                }
                Modifier modifierDrawIndicatorLine = TextField2.drawIndicatorLine(Modifier.INSTANCE, TextFieldImplKt.m6100animateBorderStrokeAsStateNuRrP5Q(z, z2, FocusInteraction3.collectIsFocusedAsState(interactionSource, composer, 0).getValue().booleanValue(), textFieldColors, f, f2, composer, 0));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return modifierDrawIndicatorLine;
            }
        });
    }

    static {
        float fM7995constructorimpl = C2002Dp.m7995constructorimpl(1);
        UnfocusedIndicatorThickness = fM7995constructorimpl;
        float fM7995constructorimpl2 = C2002Dp.m7995constructorimpl(2);
        FocusedIndicatorThickness = fM7995constructorimpl2;
        UnfocusedBorderThickness = fM7995constructorimpl;
        FocusedBorderThickness = fM7995constructorimpl2;
    }
}
