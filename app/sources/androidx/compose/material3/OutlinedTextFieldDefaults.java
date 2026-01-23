package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimation;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.FocusInteraction3;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.text.selection.SelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColors2;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.material3.internal.TextFieldType;
import androidx.compose.material3.tokens.OutlinedTextFieldTokens;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Shape;
import androidx.compose.p011ui.text.input.VisualTransformation;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: TextFieldDefaults.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\\\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014Jñ\u0001\u0010'\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00120\u00182\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00182\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00182\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00182\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00182\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00182\u0010\b\u0002\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00182\u0010\b\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00182\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010%\u001a\u00020$2\u000e\b\u0002\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00120\u0018H\u0007¢\u0006\u0004\b'\u0010(J8\u0010%\u001a\u00020$2\b\b\u0002\u0010)\u001a\u00020\u000f2\b\b\u0002\u0010*\u001a\u00020\u000f2\b\b\u0002\u0010+\u001a\u00020\u000f2\b\b\u0002\u0010,\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b-\u0010.J\u000f\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010/R\u001d\u00100\u001a\u00020\u000f8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001d\u00104\u001a\u00020\u000f8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b4\u00101\u001a\u0004\b5\u00103R\u001d\u00106\u001a\u00020\u000f8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b6\u00101\u001a\u0004\b7\u00103R\u001d\u00108\u001a\u00020\u000f8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b8\u00101\u001a\u0004\b9\u00103R\u0011\u0010\u000e\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0018\u0010?\u001a\u00020\u000b*\u00020<8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006@"}, m3636d2 = {"Landroidx/compose/material3/OutlinedTextFieldDefaults;", "", "<init>", "()V", "", "enabled", "isError", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/material3/TextFieldColors;", "colors", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/unit/Dp;", "focusedBorderThickness", "unfocusedBorderThickness", "", "Container-4EFweAY", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/ui/graphics/Shape;FFLandroidx/compose/runtime/Composer;II)V", "Container", "", "value", "Lkotlin/Function0;", "innerTextField", "singleLine", "Landroidx/compose/ui/text/input/VisualTransformation;", "visualTransformation", AnnotatedPrivateKey.LABEL, "placeholder", "leadingIcon", "trailingIcon", "prefix", "suffix", "supportingText", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "container", "DecorationBox", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "start", "top", "end", "bottom", "contentPadding-a9UjIt4", "(FFFF)Landroidx/compose/foundation/layout/PaddingValues;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/TextFieldColors;", "MinHeight", "F", "getMinHeight-D9Ej5fM", "()F", "MinWidth", "getMinWidth-D9Ej5fM", "UnfocusedBorderThickness", "getUnfocusedBorderThickness-D9Ej5fM", "FocusedBorderThickness", "getFocusedBorderThickness-D9Ej5fM", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "Landroidx/compose/material3/ColorScheme;", "getDefaultOutlinedTextFieldColors", "(Landroidx/compose/material3/ColorScheme;Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/TextFieldColors;", "defaultOutlinedTextFieldColors", "material3_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class OutlinedTextFieldDefaults {
    public static final OutlinedTextFieldDefaults INSTANCE = new OutlinedTextFieldDefaults();
    private static final float MinHeight = C2002Dp.m7995constructorimpl(56);
    private static final float MinWidth = C2002Dp.m7995constructorimpl(280);
    private static final float UnfocusedBorderThickness = C2002Dp.m7995constructorimpl(1);
    private static final float FocusedBorderThickness = C2002Dp.m7995constructorimpl(2);

    private OutlinedTextFieldDefaults() {
    }

    @JvmName
    public final Shape getShape(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1066756961, i, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.<get-shape> (TextFieldDefaults.kt:729)");
        }
        Shape value = Shapes5.getValue(OutlinedTextFieldTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m5909getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m5910getMinWidthD9Ej5fM() {
        return MinWidth;
    }

    /* renamed from: getUnfocusedBorderThickness-D9Ej5fM, reason: not valid java name */
    public final float m5911getUnfocusedBorderThicknessD9Ej5fM() {
        return UnfocusedBorderThickness;
    }

    /* renamed from: getFocusedBorderThickness-D9Ej5fM, reason: not valid java name */
    public final float m5908getFocusedBorderThicknessD9Ej5fM() {
        return FocusedBorderThickness;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:153:? A[RETURN, SYNTHETIC] */
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
    public final void m5906Container4EFweAY(final boolean z, final boolean z2, final InteractionSource interactionSource, Modifier modifier, TextFieldColors textFieldColors, Shape shape, float f, float f2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        TextFieldColors textFieldColors2;
        Shape shape2;
        float f3;
        float f4;
        TextFieldColors textFieldColorsColors;
        Shape shape3;
        float f5;
        Modifier modifier3;
        int i4;
        TextFieldColors textFieldColors3;
        Shape shape4;
        float f6;
        float f7;
        Composer composer2;
        final float f8;
        final float f9;
        final Shape shape5;
        final TextFieldColors textFieldColors4;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1035477640);
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
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    Modifier modifier5 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 16) == 0) {
                        textFieldColorsColors = colors(composerStartRestartGroup, (i3 >> 24) & 14);
                        i3 &= -57345;
                    } else {
                        textFieldColorsColors = textFieldColors2;
                    }
                    if ((i2 & 32) == 0) {
                        shape3 = INSTANCE.getShape(composerStartRestartGroup, 6);
                        i3 &= -458753;
                    } else {
                        shape3 = shape2;
                    }
                    if ((i2 & 64) == 0) {
                        f5 = FocusedBorderThickness;
                        i3 &= -3670017;
                    } else {
                        f5 = f3;
                    }
                    if ((i2 & 128) == 0) {
                        shape4 = shape3;
                        f7 = UnfocusedBorderThickness;
                        modifier3 = modifier5;
                        i4 = i3 & (-29360129);
                        textFieldColors3 = textFieldColorsColors;
                        f6 = f5;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1035477640, i4, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.Container (TextFieldDefaults.kt:776)");
                        }
                        int i10 = i4 >> 6;
                        boolean zBooleanValue = FocusInteraction3.collectIsFocusedAsState(interactionSource, composerStartRestartGroup, i10 & 14).getValue().booleanValue();
                        SnapshotState4<BorderStroke> snapshotState4M6100animateBorderStrokeAsStateNuRrP5Q = TextFieldImplKt.m6100animateBorderStrokeAsStateNuRrP5Q(z, z2, zBooleanValue, textFieldColors3, f6, f7, composerStartRestartGroup, (i10 & 458752) | ((i4 >> 3) & 7168) | (i4 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) | (57344 & i10));
                        Modifier modifier6 = modifier3;
                        Shape shape6 = shape4;
                        final SnapshotState4<Color> snapshotState4M4805animateColorAsStateeuL9pac = SingleValueAnimation.m4805animateColorAsStateeuL9pac(textFieldColors3.m5999containerColorXeAY9LY$material3_release(z, z2, zBooleanValue), AnimationSpecKt.tween$default(150, 0, null, 6, null), null, null, composerStartRestartGroup, 48, 12);
                        composer2 = composerStartRestartGroup;
                        BoxKt.Box(TextFieldImplKt.textFieldBackground(BorderKt.border(modifier6, snapshotState4M6100animateBorderStrokeAsStateNuRrP5Q.getValue(), shape6), new C1698x758e63df(new PropertyReference0Impl(snapshotState4M4805animateColorAsStateeuL9pac) { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$Container$1
                            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty6
                            public Object get() {
                                return ((SnapshotState4) this.receiver).getValue();
                            }
                        }), shape6), composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        f8 = f6;
                        f9 = f7;
                        shape5 = shape6;
                        textFieldColors4 = textFieldColors3;
                        modifier4 = modifier6;
                    } else {
                        modifier3 = modifier5;
                        i4 = i3;
                        textFieldColors3 = textFieldColorsColors;
                        shape4 = shape3;
                        f6 = f5;
                    }
                } else {
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
                    i4 = i3;
                    textFieldColors3 = textFieldColors2;
                    f6 = f3;
                    shape4 = shape2;
                    modifier3 = modifier2;
                }
                f7 = f4;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i102 = i4 >> 6;
                boolean zBooleanValue2 = FocusInteraction3.collectIsFocusedAsState(interactionSource, composerStartRestartGroup, i102 & 14).getValue().booleanValue();
                SnapshotState4<BorderStroke> snapshotState4M6100animateBorderStrokeAsStateNuRrP5Q2 = TextFieldImplKt.m6100animateBorderStrokeAsStateNuRrP5Q(z, z2, zBooleanValue2, textFieldColors3, f6, f7, composerStartRestartGroup, (i102 & 458752) | ((i4 >> 3) & 7168) | (i4 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) | (57344 & i102));
                Modifier modifier62 = modifier3;
                Shape shape62 = shape4;
                final Object snapshotState4M4805animateColorAsStateeuL9pac2 = SingleValueAnimation.m4805animateColorAsStateeuL9pac(textFieldColors3.m5999containerColorXeAY9LY$material3_release(z, z2, zBooleanValue2), AnimationSpecKt.tween$default(150, 0, null, 6, null), null, null, composerStartRestartGroup, 48, 12);
                composer2 = composerStartRestartGroup;
                BoxKt.Box(TextFieldImplKt.textFieldBackground(BorderKt.border(modifier62, snapshotState4M6100animateBorderStrokeAsStateNuRrP5Q2.getValue(), shape62), new C1698x758e63df(new PropertyReference0Impl(snapshotState4M4805animateColorAsStateeuL9pac2) { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$Container$1
                    @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty6
                    public Object get() {
                        return ((SnapshotState4) this.receiver).getValue();
                    }
                }), shape62), composer2, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                f8 = f6;
                f9 = f7;
                shape5 = shape62;
                textFieldColors4 = textFieldColors3;
                modifier4 = modifier62;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                float f10 = f3;
                composer2 = composerStartRestartGroup;
                f8 = f10;
                modifier4 = modifier2;
                textFieldColors4 = textFieldColors2;
                shape5 = shape2;
                f9 = f4;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$Container$2
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
                        this.$tmp0_rcvr.m5906Container4EFweAY(z, z2, interactionSource, modifier4, textFieldColors4, shape5, f8, f9, composer3, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
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
            if ((i & 1) != 0) {
                if (i5 == 0) {
                }
                if ((i2 & 16) == 0) {
                }
                if ((i2 & 32) == 0) {
                }
                if ((i2 & 64) == 0) {
                }
                if ((i2 & 128) == 0) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:258:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void DecorationBox(final String str, final Function2<? super Composer, ? super Integer, Unit> function2, final boolean z, final boolean z2, final VisualTransformation visualTransformation, final InteractionSource interactionSource, boolean z3, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, Function2<? super Composer, ? super Integer, Unit> function26, Function2<? super Composer, ? super Integer, Unit> function27, Function2<? super Composer, ? super Integer, Unit> function28, TextFieldColors textFieldColors, PaddingValues paddingValues, Function2<? super Composer, ? super Integer, Unit> function29, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        boolean z4;
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
        Function2<? super Composer, ? super Integer, Unit> function211;
        final TextFieldColors textFieldColorsColors;
        PaddingValues paddingValuesM5905contentPaddinga9UjIt4$default;
        boolean z5;
        PaddingValues paddingValues2;
        Function2<? super Composer, ? super Integer, Unit> function212;
        Function2<? super Composer, ? super Integer, Unit> function2RememberComposableLambda;
        Composer composer2;
        Function2<? super Composer, ? super Integer, Unit> function213;
        Function2<? super Composer, ? super Integer, Unit> function214;
        Function2<? super Composer, ? super Integer, Unit> function215;
        int i20;
        Function2<? super Composer, ? super Integer, Unit> function216;
        final TextFieldColors textFieldColors2;
        Function2<? super Composer, ? super Integer, Unit> function217;
        Function2<? super Composer, ? super Integer, Unit> function218;
        PaddingValues paddingValues3;
        Composer composer3;
        final Function2<? super Composer, ? super Integer, Unit> function219;
        final boolean z6;
        final Function2<? super Composer, ? super Integer, Unit> function220;
        final Function2<? super Composer, ? super Integer, Unit> function221;
        final Function2<? super Composer, ? super Integer, Unit> function222;
        final Function2<? super Composer, ? super Integer, Unit> function223;
        final Function2<? super Composer, ? super Integer, Unit> function224;
        final PaddingValues paddingValues4;
        final Function2<? super Composer, ? super Integer, Unit> function225;
        final Function2<? super Composer, ? super Integer, Unit> function226;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-350442135);
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
            } else if ((i & 384) == 0) {
                i4 |= composerStartRestartGroup.changed(z) ? 256 : 128;
            }
            if ((i3 & 8) == 0) {
                i4 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    i4 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
                }
                int i21 = 8192;
                if ((i3 & 16) != 0) {
                    i4 |= 24576;
                } else {
                    if ((i & 24576) == 0) {
                        i4 |= composerStartRestartGroup.changed(visualTransformation) ? 16384 : 8192;
                    }
                    if ((i3 & 32) == 0) {
                        i4 |= 196608;
                    } else if ((i & 196608) == 0) {
                        i4 |= composerStartRestartGroup.changed(interactionSource) ? 131072 : 65536;
                    }
                    i5 = i3 & 64;
                    if (i5 == 0) {
                        i4 |= 1572864;
                        z4 = z3;
                    } else {
                        z4 = z3;
                        if ((i & 1572864) == 0) {
                            i4 |= composerStartRestartGroup.changed(z4) ? 1048576 : 524288;
                        }
                    }
                    i6 = i3 & 128;
                    if (i6 == 0) {
                        i4 |= 12582912;
                        function210 = function22;
                    } else {
                        function210 = function22;
                        if ((i & 12582912) == 0) {
                            i4 |= composerStartRestartGroup.changedInstance(function210) ? 8388608 : 4194304;
                        }
                    }
                    i7 = i3 & 256;
                    if (i7 == 0) {
                        i4 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i4 |= composerStartRestartGroup.changedInstance(function23) ? 67108864 : 33554432;
                    }
                    i8 = i3 & 512;
                    if (i8 == 0) {
                        i4 |= 805306368;
                    } else {
                        if ((i & 805306368) == 0) {
                            i9 = i8;
                            i4 |= composerStartRestartGroup.changedInstance(function24) ? 536870912 : 268435456;
                        }
                        i10 = i3 & 1024;
                        if (i10 != 0) {
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
                        if (i13 != 0) {
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
                        if (i15 != 0) {
                            i16 = i22 | 384;
                        } else if ((i2 & 384) == 0) {
                            i16 = i22 | (composerStartRestartGroup.changedInstance(function27) ? 256 : 128);
                        } else {
                            i16 = i22;
                        }
                        i17 = i3 & 8192;
                        if (i17 == 0) {
                            i18 = i16;
                            if ((i2 & 3072) == 0) {
                                i18 |= composerStartRestartGroup.changedInstance(function28) ? 2048 : 1024;
                            }
                            if ((i2 & 24576) == 0) {
                                if ((i3 & 16384) == 0 && composerStartRestartGroup.changed(textFieldColors)) {
                                    i21 = 16384;
                                }
                                i18 |= i21;
                            }
                            if ((i2 & 196608) == 0) {
                                i18 |= ((i3 & 32768) == 0 && composerStartRestartGroup.changed(paddingValues)) ? 131072 : 65536;
                            }
                            i19 = i3 & 65536;
                            if (i19 == 0) {
                                i18 |= 1572864;
                            } else if ((i2 & 1572864) == 0) {
                                i18 |= composerStartRestartGroup.changedInstance(function29) ? 1048576 : 524288;
                            }
                            if ((i3 & 131072) == 0) {
                                i18 |= 12582912;
                            } else if ((i2 & 12582912) == 0) {
                                i18 |= composerStartRestartGroup.changed(this) ? 8388608 : 4194304;
                            }
                            if ((i4 & 306783379) == 306783378 || (i18 & 4793491) != 4793490 || !composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.startDefaults();
                                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                    final boolean z7 = i5 == 0 ? false : z4;
                                    if (i6 != 0) {
                                        function210 = null;
                                    }
                                    Function2<? super Composer, ? super Integer, Unit> function227 = i7 == 0 ? null : function23;
                                    Function2<? super Composer, ? super Integer, Unit> function228 = i9 == 0 ? null : function24;
                                    Function2<? super Composer, ? super Integer, Unit> function229 = i11 == 0 ? null : function25;
                                    function211 = i14 == 0 ? null : function26;
                                    Function2<? super Composer, ? super Integer, Unit> function230 = i15 == 0 ? null : function27;
                                    Function2<? super Composer, ? super Integer, Unit> function231 = i17 == 0 ? function28 : null;
                                    if ((i3 & 16384) == 0) {
                                        textFieldColorsColors = colors(composerStartRestartGroup, (i18 >> 21) & 14);
                                        i18 &= -57345;
                                    } else {
                                        textFieldColorsColors = textFieldColors;
                                    }
                                    if ((i3 & 32768) == 0) {
                                        paddingValuesM5905contentPaddinga9UjIt4$default = m5905contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                        i18 &= -458753;
                                    } else {
                                        paddingValuesM5905contentPaddinga9UjIt4$default = paddingValues;
                                    }
                                    if (i19 == 0) {
                                        paddingValues2 = paddingValuesM5905contentPaddinga9UjIt4$default;
                                        z5 = z7;
                                        function212 = function231;
                                        function2RememberComposableLambda = ComposableLambda3.rememberComposableLambda(-1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                invoke(composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer4, int i23) {
                                                if ((i23 & 3) != 2 || !composer4.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-1448570018, i23, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:873)");
                                                    }
                                                    OutlinedTextFieldDefaults outlinedTextFieldDefaults = OutlinedTextFieldDefaults.INSTANCE;
                                                    outlinedTextFieldDefaults.m5906Container4EFweAY(z, z7, interactionSource, Modifier.INSTANCE, textFieldColorsColors, outlinedTextFieldDefaults.getShape(composer4, 6), outlinedTextFieldDefaults.m5908getFocusedBorderThicknessD9Ej5fM(), outlinedTextFieldDefaults.m5911getUnfocusedBorderThicknessD9Ej5fM(), composer4, 114822144, 0);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer4.skipToGroupEnd();
                                            }
                                        }, composerStartRestartGroup, 54);
                                    } else {
                                        z5 = z7;
                                        paddingValues2 = paddingValuesM5905contentPaddinga9UjIt4$default;
                                        function212 = function231;
                                        function2RememberComposableLambda = function29;
                                    }
                                    composer2 = composerStartRestartGroup;
                                    function213 = function228;
                                    function214 = function210;
                                    function215 = function230;
                                    i20 = i18;
                                    function216 = function212;
                                    textFieldColors2 = textFieldColorsColors;
                                    function217 = function227;
                                    function218 = function229;
                                    paddingValues3 = paddingValues2;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    if ((i3 & 16384) != 0) {
                                        i18 &= -57345;
                                    }
                                    if ((32768 & i3) != 0) {
                                        i18 &= -458753;
                                    }
                                    function217 = function23;
                                    function213 = function24;
                                    function211 = function26;
                                    function215 = function27;
                                    function216 = function28;
                                    textFieldColors2 = textFieldColors;
                                    paddingValues3 = paddingValues;
                                    function2RememberComposableLambda = function29;
                                    composer2 = composerStartRestartGroup;
                                    z5 = z4;
                                    function214 = function210;
                                    i20 = i18;
                                    function218 = function25;
                                }
                                composer2.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-350442135, i4, i20, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:884)");
                                }
                                boolean z8 = z5;
                                Function2<? super Composer, ? super Integer, Unit> function232 = function2RememberComposableLambda;
                                int i23 = i4 << 3;
                                int i24 = i4 >> 3;
                                int i25 = (i24 & 7168) | (i23 & 896) | (i23 & 112) | 6;
                                int i26 = i4 >> 9;
                                int i27 = i20 << 21;
                                int i28 = ((i20 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i26 & 7168) | (57344 & i24) | (458752 & i20) | ((i20 << 6) & 3670016) | ((i20 << 3) & 29360128);
                                Function2<? super Composer, ? super Integer, Unit> function233 = function211;
                                Composer composer4 = composer2;
                                TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, str, function2, visualTransformation, function214, function217, function213, function218, function233, function215, function216, z2, z, z8, interactionSource, paddingValues3, textFieldColors2, function232, composer4, i25 | (i26 & 57344) | (i26 & 458752) | (i26 & 3670016) | (i27 & 29360128) | (i27 & 234881024) | (i27 & 1879048192), i28, 0);
                                composer3 = composer4;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                function219 = function233;
                                z6 = z8;
                                function220 = function213;
                                function221 = function218;
                                function222 = function215;
                                function223 = function232;
                                function224 = function214;
                                paddingValues4 = paddingValues3;
                                function225 = function216;
                                function226 = function217;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                function226 = function23;
                                function221 = function25;
                                function219 = function26;
                                function222 = function27;
                                function225 = function28;
                                textFieldColors2 = textFieldColors;
                                paddingValues4 = paddingValues;
                                function223 = function29;
                                composer3 = composerStartRestartGroup;
                                z6 = z4;
                                function224 = function210;
                                function220 = function24;
                            }
                            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                        invoke(composer5, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer5, int i29) {
                                        OutlinedTextFieldDefaults.this.DecorationBox(str, function2, z, z2, visualTransformation, interactionSource, z6, function224, function226, function220, function221, function219, function222, function225, textFieldColors2, paddingValues4, function223, composer5, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i18 = i16 | 3072;
                        if ((i2 & 24576) == 0) {
                        }
                        if ((i2 & 196608) == 0) {
                        }
                        i19 = i3 & 65536;
                        if (i19 == 0) {
                        }
                        if ((i3 & 131072) == 0) {
                        }
                        if ((i4 & 306783379) == 306783378) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i5 == 0) {
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
                                if (i19 == 0) {
                                }
                                composer2 = composerStartRestartGroup;
                                function213 = function228;
                                function214 = function210;
                                function215 = function230;
                                i20 = i18;
                                function216 = function212;
                                textFieldColors2 = textFieldColorsColors;
                                function217 = function227;
                                function218 = function229;
                                paddingValues3 = paddingValues2;
                                composer2.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                boolean z82 = z5;
                                Function2<? super Composer, ? super Integer, Unit> function2322 = function2RememberComposableLambda;
                                int i232 = i4 << 3;
                                int i242 = i4 >> 3;
                                int i252 = (i242 & 7168) | (i232 & 896) | (i232 & 112) | 6;
                                int i262 = i4 >> 9;
                                int i272 = i20 << 21;
                                int i282 = ((i20 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i262 & 7168) | (57344 & i242) | (458752 & i20) | ((i20 << 6) & 3670016) | ((i20 << 3) & 29360128);
                                Function2<? super Composer, ? super Integer, Unit> function2332 = function211;
                                Composer composer42 = composer2;
                                TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, str, function2, visualTransformation, function214, function217, function213, function218, function2332, function215, function216, z2, z, z82, interactionSource, paddingValues3, textFieldColors2, function2322, composer42, i252 | (i262 & 57344) | (i262 & 458752) | (i262 & 3670016) | (i272 & 29360128) | (i272 & 234881024) | (i272 & 1879048192), i282, 0);
                                composer3 = composer42;
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                function219 = function2332;
                                z6 = z82;
                                function220 = function213;
                                function221 = function218;
                                function222 = function215;
                                function223 = function2322;
                                function224 = function214;
                                paddingValues4 = paddingValues3;
                                function225 = function216;
                                function226 = function217;
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    i9 = i8;
                    i10 = i3 & 1024;
                    if (i10 != 0) {
                    }
                    i13 = i3 & 2048;
                    if (i13 != 0) {
                    }
                    int i222 = i12;
                    i15 = i3 & 4096;
                    if (i15 != 0) {
                    }
                    i17 = i3 & 8192;
                    if (i17 == 0) {
                    }
                    if ((i2 & 24576) == 0) {
                    }
                    if ((i2 & 196608) == 0) {
                    }
                    i19 = i3 & 65536;
                    if (i19 == 0) {
                    }
                    if ((i3 & 131072) == 0) {
                    }
                    if ((i4 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                if ((i3 & 32) == 0) {
                }
                i5 = i3 & 64;
                if (i5 == 0) {
                }
                i6 = i3 & 128;
                if (i6 == 0) {
                }
                i7 = i3 & 256;
                if (i7 == 0) {
                }
                i8 = i3 & 512;
                if (i8 == 0) {
                }
                i9 = i8;
                i10 = i3 & 1024;
                if (i10 != 0) {
                }
                i13 = i3 & 2048;
                if (i13 != 0) {
                }
                int i2222 = i12;
                i15 = i3 & 4096;
                if (i15 != 0) {
                }
                i17 = i3 & 8192;
                if (i17 == 0) {
                }
                if ((i2 & 24576) == 0) {
                }
                if ((i2 & 196608) == 0) {
                }
                i19 = i3 & 65536;
                if (i19 == 0) {
                }
                if ((i3 & 131072) == 0) {
                }
                if ((i4 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            int i212 = 8192;
            if ((i3 & 16) != 0) {
            }
            if ((i3 & 32) == 0) {
            }
            i5 = i3 & 64;
            if (i5 == 0) {
            }
            i6 = i3 & 128;
            if (i6 == 0) {
            }
            i7 = i3 & 256;
            if (i7 == 0) {
            }
            i8 = i3 & 512;
            if (i8 == 0) {
            }
            i9 = i8;
            i10 = i3 & 1024;
            if (i10 != 0) {
            }
            i13 = i3 & 2048;
            if (i13 != 0) {
            }
            int i22222 = i12;
            i15 = i3 & 4096;
            if (i15 != 0) {
            }
            i17 = i3 & 8192;
            if (i17 == 0) {
            }
            if ((i2 & 24576) == 0) {
            }
            if ((i2 & 196608) == 0) {
            }
            i19 = i3 & 65536;
            if (i19 == 0) {
            }
            if ((i3 & 131072) == 0) {
            }
            if ((i4 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        if ((i3 & 4) == 0) {
        }
        if ((i3 & 8) == 0) {
        }
        int i2122 = 8192;
        if ((i3 & 16) != 0) {
        }
        if ((i3 & 32) == 0) {
        }
        i5 = i3 & 64;
        if (i5 == 0) {
        }
        i6 = i3 & 128;
        if (i6 == 0) {
        }
        i7 = i3 & 256;
        if (i7 == 0) {
        }
        i8 = i3 & 512;
        if (i8 == 0) {
        }
        i9 = i8;
        i10 = i3 & 1024;
        if (i10 != 0) {
        }
        i13 = i3 & 2048;
        if (i13 != 0) {
        }
        int i222222 = i12;
        i15 = i3 & 4096;
        if (i15 != 0) {
        }
        i17 = i3 & 8192;
        if (i17 == 0) {
        }
        if ((i2 & 24576) == 0) {
        }
        if ((i2 & 196608) == 0) {
        }
        i19 = i3 & 65536;
        if (i19 == 0) {
        }
        if ((i3 & 131072) == 0) {
        }
        if ((i4 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* renamed from: contentPadding-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m5905contentPaddinga9UjIt4$default(OutlinedTextFieldDefaults outlinedTextFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
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
        return outlinedTextFieldDefaults.m5907contentPaddinga9UjIt4(f, f2, f3, f4);
    }

    /* renamed from: contentPadding-a9UjIt4, reason: not valid java name */
    public final PaddingValues m5907contentPaddinga9UjIt4(float start, float top, float end, float bottom) {
        return PaddingKt.m5138PaddingValuesa9UjIt4(start, top, end, bottom);
    }

    public final TextFieldColors colors(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-471651810, i, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.colors (TextFieldDefaults.kt:921)");
        }
        TextFieldColors defaultOutlinedTextFieldColors = getDefaultOutlinedTextFieldColors(MaterialTheme.INSTANCE.getColorScheme(composer, 6), composer, (i << 3) & 112);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultOutlinedTextFieldColors;
    }

    @JvmName
    public final TextFieldColors getDefaultOutlinedTextFieldColors(ColorScheme colorScheme, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-292363577, i, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.<get-defaultOutlinedTextFieldColors> (TextFieldDefaults.kt:1071)");
        }
        TextFieldColors defaultOutlinedTextFieldColorsCached = colorScheme.getDefaultOutlinedTextFieldColorsCached();
        composer.startReplaceGroup(1540400102);
        if (defaultOutlinedTextFieldColorsCached == null) {
            OutlinedTextFieldTokens outlinedTextFieldTokens = OutlinedTextFieldTokens.INSTANCE;
            long jFromToken = ColorScheme2.fromToken(colorScheme, outlinedTextFieldTokens.getFocusInputColor());
            long jFromToken2 = ColorScheme2.fromToken(colorScheme, outlinedTextFieldTokens.getInputColor());
            long jM6705copywmQWz5c$default = Color.m6705copywmQWz5c$default(ColorScheme2.fromToken(colorScheme, outlinedTextFieldTokens.getDisabledInputColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
            long jFromToken3 = ColorScheme2.fromToken(colorScheme, outlinedTextFieldTokens.getErrorInputColor());
            Color.Companion companion = Color.INSTANCE;
            TextFieldColors textFieldColors = new TextFieldColors(jFromToken, jFromToken2, jM6705copywmQWz5c$default, jFromToken3, companion.m6725getTransparent0d7_KjU(), companion.m6725getTransparent0d7_KjU(), companion.m6725getTransparent0d7_KjU(), companion.m6725getTransparent0d7_KjU(), ColorScheme2.fromToken(colorScheme, outlinedTextFieldTokens.getCaretColor()), ColorScheme2.fromToken(colorScheme, outlinedTextFieldTokens.getErrorFocusCaretColor()), (SelectionColors) composer.consume(TextSelectionColors2.getLocalTextSelectionColors()), ColorScheme2.fromToken(colorScheme, outlinedTextFieldTokens.getFocusOutlineColor()), ColorScheme2.fromToken(colorScheme, outlinedTextFieldTokens.getOutlineColor()), Color.m6705copywmQWz5c$default(ColorScheme2.fromToken(colorScheme, outlinedTextFieldTokens.getDisabledOutlineColor()), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), ColorScheme2.fromToken(colorScheme, outlinedTextFieldTokens.getErrorOutlineColor()), ColorScheme2.fromToken(colorScheme, outlinedTextFieldTokens.getFocusLeadingIconColor()), ColorScheme2.fromToken(colorScheme, outlinedTextFieldTokens.getLeadingIconColor()), Color.m6705copywmQWz5c$default(ColorScheme2.fromToken(colorScheme, outlinedTextFieldTokens.getDisabledLeadingIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorScheme2.fromToken(colorScheme, outlinedTextFieldTokens.getErrorLeadingIconColor()), ColorScheme2.fromToken(colorScheme, outlinedTextFieldTokens.getFocusTrailingIconColor()), ColorScheme2.fromToken(colorScheme, outlinedTextFieldTokens.getTrailingIconColor()), Color.m6705copywmQWz5c$default(ColorScheme2.fromToken(colorScheme, outlinedTextFieldTokens.getDisabledTrailingIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorScheme2.fromToken(colorScheme, outlinedTextFieldTokens.getErrorTrailingIconColor()), ColorScheme2.fromToken(colorScheme, outlinedTextFieldTokens.getFocusLabelColor()), ColorScheme2.fromToken(colorScheme, outlinedTextFieldTokens.getLabelColor()), Color.m6705copywmQWz5c$default(ColorScheme2.fromToken(colorScheme, outlinedTextFieldTokens.getDisabledLabelColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorScheme2.fromToken(colorScheme, outlinedTextFieldTokens.getErrorLabelColor()), ColorScheme2.fromToken(colorScheme, outlinedTextFieldTokens.getInputPlaceholderColor()), ColorScheme2.fromToken(colorScheme, outlinedTextFieldTokens.getInputPlaceholderColor()), Color.m6705copywmQWz5c$default(ColorScheme2.fromToken(colorScheme, outlinedTextFieldTokens.getDisabledInputColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorScheme2.fromToken(colorScheme, outlinedTextFieldTokens.getInputPlaceholderColor()), ColorScheme2.fromToken(colorScheme, outlinedTextFieldTokens.getFocusSupportingColor()), ColorScheme2.fromToken(colorScheme, outlinedTextFieldTokens.getSupportingColor()), Color.m6705copywmQWz5c$default(ColorScheme2.fromToken(colorScheme, outlinedTextFieldTokens.getDisabledSupportingColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorScheme2.fromToken(colorScheme, outlinedTextFieldTokens.getErrorSupportingColor()), ColorScheme2.fromToken(colorScheme, outlinedTextFieldTokens.getInputPrefixColor()), ColorScheme2.fromToken(colorScheme, outlinedTextFieldTokens.getInputPrefixColor()), Color.m6705copywmQWz5c$default(ColorScheme2.fromToken(colorScheme, outlinedTextFieldTokens.getInputPrefixColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorScheme2.fromToken(colorScheme, outlinedTextFieldTokens.getInputPrefixColor()), ColorScheme2.fromToken(colorScheme, outlinedTextFieldTokens.getInputSuffixColor()), ColorScheme2.fromToken(colorScheme, outlinedTextFieldTokens.getInputSuffixColor()), Color.m6705copywmQWz5c$default(ColorScheme2.fromToken(colorScheme, outlinedTextFieldTokens.getInputSuffixColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorScheme2.fromToken(colorScheme, outlinedTextFieldTokens.getInputSuffixColor()), null);
            colorScheme.setDefaultOutlinedTextFieldColorsCached$material3_release(textFieldColors);
            defaultOutlinedTextFieldColorsCached = textFieldColors;
        }
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultOutlinedTextFieldColorsCached;
    }
}
