package androidx.compose.material3;

import androidx.compose.foundation.interaction.FocusInteraction3;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.selection.TextSelectionColors2;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.material3.tokens.TypeScaleTokens;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.DrawModifierKt;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.graphics.ClipOp;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.Shape;
import androidx.compose.p011ui.graphics.SolidColor;
import androidx.compose.p011ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p011ui.graphics.drawscope.DrawContext;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.layout.LayoutId2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.text.PlatformTextStyle;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.input.TextFieldValue;
import androidx.compose.p011ui.text.input.VisualTransformation;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.LineHeightStyle;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
import androidx.compose.p011ui.text.style.TextIndent;
import androidx.compose.p011ui.text.style.TextMotion;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.Dp2;
import androidx.compose.p011ui.unit.IntOffset;
import androidx.compose.p011ui.unit.LayoutDirection;
import androidx.compose.p011ui.unit.TextUnit;
import androidx.compose.p011ui.unit.TextUnit2;
import androidx.compose.p011ui.util.MathHelpers;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: OutlinedTextField.kt */
@Metadata(m3635d1 = {"\u0000ª\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a·\u0002\u0010%\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\b\b\u0002\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u001c2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010\"\u001a\u00020!2\b\b\u0002\u0010$\u001a\u00020#H\u0007¢\u0006\u0004\b%\u0010&\u001a·\u0002\u0010%\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020'2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\b\b\u0002\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u001c2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010\"\u001a\u00020!2\b\b\u0002\u0010$\u001a\u00020#H\u0007¢\u0006\u0004\b%\u0010(\u001aÕ\u0001\u00104\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\u000e\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010-\u001a\u00020,2\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u00030\u00022\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u000e\u00101\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\u0006\u00103\u001a\u000202H\u0001¢\u0006\u0004\b4\u00105\u001a\u001b\u00107\u001a\u00020\u001c*\u00020\u001c2\u0006\u00106\u001a\u00020\u001cH\u0002¢\u0006\u0004\b7\u00108\u001aj\u0010E\u001a\u00020\u001c2\u0006\u00109\u001a\u00020\u001c2\u0006\u0010:\u001a\u00020\u001c2\u0006\u0010;\u001a\u00020\u001c2\u0006\u0010<\u001a\u00020\u001c2\u0006\u0010=\u001a\u00020\u001c2\u0006\u0010>\u001a\u00020\u001c2\u0006\u0010?\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020,2\u0006\u0010A\u001a\u00020@2\u0006\u0010B\u001a\u00020,2\u0006\u00103\u001a\u000202H\u0002ø\u0001\u0000¢\u0006\u0004\bC\u0010D\u001ar\u0010P\u001a\u00020\u001c2\u0006\u0010F\u001a\u00020\u001c2\u0006\u0010G\u001a\u00020\u001c2\u0006\u0010H\u001a\u00020\u001c2\u0006\u0010I\u001a\u00020\u001c2\u0006\u0010J\u001a\u00020\u001c2\u0006\u0010K\u001a\u00020\u001c2\u0006\u0010L\u001a\u00020\u001c2\u0006\u0010M\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020,2\u0006\u0010A\u001a\u00020@2\u0006\u0010B\u001a\u00020,2\u0006\u00103\u001a\u000202H\u0002ø\u0001\u0000¢\u0006\u0004\bN\u0010O\u001a¡\u0001\u0010`\u001a\u00020\u0003*\u00020Q2\u0006\u0010R\u001a\u00020\u001c2\u0006\u0010S\u001a\u00020\u001c2\b\u0010U\u001a\u0004\u0018\u00010T2\b\u0010V\u001a\u0004\u0018\u00010T2\b\u0010W\u001a\u0004\u0018\u00010T2\b\u0010X\u001a\u0004\u0018\u00010T2\u0006\u0010Y\u001a\u00020T2\b\u0010Z\u001a\u0004\u0018\u00010T2\b\u0010[\u001a\u0004\u0018\u00010T2\u0006\u0010\\\u001a\u00020T2\b\u0010]\u001a\u0004\u0018\u00010T2\u0006\u0010-\u001a\u00020,2\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010B\u001a\u00020,2\u0006\u0010_\u001a\u00020^2\u0006\u00103\u001a\u000202H\u0002¢\u0006\u0004\b`\u0010a\u001a)\u0010c\u001a\u00020\u0005*\u00020\u00052\f\u0010b\u001a\b\u0012\u0004\u0012\u00020.0\f2\u0006\u00103\u001a\u000202H\u0000¢\u0006\u0004\bc\u0010d\"\u0014\u0010f\u001a\u00020e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010g\"\u001a\u0010i\u001a\u00020h8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006m"}, m3636d2 = {"", "value", "Lkotlin/Function1;", "", "onValueChange", "Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "readOnly", "Landroidx/compose/ui/text/TextStyle;", "textStyle", "Lkotlin/Function0;", AnnotatedPrivateKey.LABEL, "placeholder", "leadingIcon", "trailingIcon", "prefix", "suffix", "supportingText", "isError", "Landroidx/compose/ui/text/input/VisualTransformation;", "visualTransformation", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardActions;", "keyboardActions", "singleLine", "", "maxLines", "minLines", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/material3/TextFieldColors;", "colors", "OutlinedTextField", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;IIII)V", "Landroidx/compose/ui/text/input/TextFieldValue;", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;IIII)V", "textField", "leading", "trailing", "", "animationProgress", "Landroidx/compose/ui/geometry/Size;", "onLabelMeasured", "container", "supporting", "Landroidx/compose/foundation/layout/PaddingValues;", "paddingValues", "OutlinedTextFieldLayout", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZFLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;II)V", "from", "substractConstraintSafely", "(II)I", "leadingPlaceableWidth", "trailingPlaceableWidth", "prefixPlaceableWidth", "suffixPlaceableWidth", "textFieldPlaceableWidth", "labelPlaceableWidth", "placeholderPlaceableWidth", "Landroidx/compose/ui/unit/Constraints;", "constraints", "density", "calculateWidth-DHJA7U0", "(IIIIIIIFJFLandroidx/compose/foundation/layout/PaddingValues;)I", "calculateWidth", "leadingHeight", "trailingHeight", "prefixHeight", "suffixHeight", "textFieldHeight", "labelHeight", "placeholderHeight", "supportingHeight", "calculateHeight-mKXJcVc", "(IIIIIIIIFJFLandroidx/compose/foundation/layout/PaddingValues;)I", "calculateHeight", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "totalHeight", "width", "Landroidx/compose/ui/layout/Placeable;", "leadingPlaceable", "trailingPlaceable", "prefixPlaceable", "suffixPlaceable", "textFieldPlaceable", "labelPlaceable", "placeholderPlaceable", "containerPlaceable", "supportingPlaceable", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "place", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;IILandroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;FZFLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/foundation/layout/PaddingValues;)V", "labelSize", "outlineCutout", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/layout/PaddingValues;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/Dp;", "OutlinedTextFieldInnerPadding", "F", "Landroidx/compose/ui/unit/TextUnit;", "OutlinedTextFieldTopPadding", "J", "getOutlinedTextFieldTopPadding", "()J", "material3_release"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.material3.OutlinedTextFieldKt, reason: use source file name */
/* loaded from: classes4.dex */
public final class OutlinedTextField {
    private static final float OutlinedTextFieldInnerPadding = C2002Dp.m7995constructorimpl(4);
    private static final long OutlinedTextFieldTopPadding;

    /* JADX INFO: Access modifiers changed from: private */
    public static final int substractConstraintSafely(int i, int i2) {
        return i == Integer.MAX_VALUE ? i : i - i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:358:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OutlinedTextField(final String str, final Function1<? super String, Unit> function1, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, Function2<? super Composer, ? super Integer, Unit> function26, Function2<? super Composer, ? super Integer, Unit> function27, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i, int i2, InteractionSource3 interactionSource3, Shape shape, TextFieldColors textFieldColors, Composer composer, final int i3, final int i4, final int i5, final int i6) {
        final String str2;
        int i7;
        final Function1<? super String, Unit> function12;
        Modifier modifier2;
        int i8;
        boolean z5;
        int i9;
        boolean z6;
        TextStyle textStyle2;
        int i10;
        final Function2<? super Composer, ? super Integer, Unit> function28;
        int i11;
        Function2<? super Composer, ? super Integer, Unit> function29;
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
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        final Shape shape2;
        TextStyle textStyle3;
        final Function2<? super Composer, ? super Integer, Unit> function210;
        final Modifier modifier3;
        final Function2<? super Composer, ? super Integer, Unit> function211;
        int i36;
        final Function2<? super Composer, ? super Integer, Unit> function212;
        final KeyboardOptions keyboardOptions2;
        final KeyboardActions keyboardActions2;
        final Function2<? super Composer, ? super Integer, Unit> function213;
        final Function2<? super Composer, ? super Integer, Unit> function214;
        final boolean z7;
        final int i37;
        final int i38;
        InteractionSource3 interactionSource32;
        final TextFieldColors textFieldColorsColors;
        final VisualTransformation visualTransformation2;
        int i39;
        final Function2<? super Composer, ? super Integer, Unit> function215;
        final boolean z8;
        final boolean z9;
        int i40;
        InteractionSource3 interactionSource33;
        long jM7661getColor0d7_KjU;
        final TextStyle textStyle4;
        Composer composer2;
        final Function2<? super Composer, ? super Integer, Unit> function216;
        final boolean z10;
        final boolean z11;
        final boolean z12;
        final KeyboardOptions keyboardOptions3;
        final KeyboardActions keyboardActions3;
        final boolean z13;
        final int i41;
        final int i42;
        final VisualTransformation visualTransformation3;
        final Function2<? super Composer, ? super Integer, Unit> function217;
        final Function2<? super Composer, ? super Integer, Unit> function218;
        final Function2<? super Composer, ? super Integer, Unit> function219;
        final Function2<? super Composer, ? super Integer, Unit> function220;
        final Shape shape3;
        final InteractionSource3 interactionSource34;
        final TextFieldColors textFieldColors2;
        final Function2<? super Composer, ? super Integer, Unit> function221;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1922450045);
        if ((i6 & 1) != 0) {
            i7 = i3 | 6;
            str2 = str;
        } else {
            str2 = str;
            if ((i3 & 6) == 0) {
                i7 = (composerStartRestartGroup.changed(str2) ? 4 : 2) | i3;
            } else {
                i7 = i3;
            }
        }
        if ((i6 & 2) != 0) {
            i7 |= 48;
            function12 = function1;
        } else {
            function12 = function1;
            if ((i3 & 48) == 0) {
                i7 |= composerStartRestartGroup.changedInstance(function12) ? 32 : 16;
            }
        }
        int i43 = i6 & 4;
        if (i43 != 0) {
            i7 |= 384;
        } else {
            if ((i3 & 384) == 0) {
                modifier2 = modifier;
                i7 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i8 = i6 & 8;
            if (i8 == 0) {
                i7 |= 3072;
            } else {
                if ((i3 & 3072) == 0) {
                    z5 = z;
                    i7 |= composerStartRestartGroup.changed(z5) ? 2048 : 1024;
                }
                i9 = i6 & 16;
                if (i9 != 0) {
                    i7 |= 24576;
                } else {
                    if ((i3 & 24576) == 0) {
                        z6 = z2;
                        i7 |= composerStartRestartGroup.changed(z6) ? 16384 : 8192;
                    }
                    if ((i3 & 196608) != 0) {
                        textStyle2 = textStyle;
                        i7 |= ((i6 & 32) == 0 && composerStartRestartGroup.changed(textStyle2)) ? 131072 : 65536;
                    } else {
                        textStyle2 = textStyle;
                    }
                    i10 = i6 & 64;
                    if (i10 == 0) {
                        i7 |= 1572864;
                        function28 = function2;
                    } else {
                        function28 = function2;
                        if ((i3 & 1572864) == 0) {
                            i7 |= composerStartRestartGroup.changedInstance(function28) ? 1048576 : 524288;
                        }
                    }
                    i11 = i6 & 128;
                    if (i11 == 0) {
                        i7 |= 12582912;
                        function29 = function22;
                    } else {
                        function29 = function22;
                        if ((i3 & 12582912) == 0) {
                            i7 |= composerStartRestartGroup.changedInstance(function29) ? 8388608 : 4194304;
                        }
                    }
                    i12 = i6 & 256;
                    if (i12 == 0) {
                        i7 |= 100663296;
                    } else {
                        if ((i3 & 100663296) == 0) {
                            i13 = i12;
                            i7 |= composerStartRestartGroup.changedInstance(function23) ? 67108864 : 33554432;
                        }
                        i14 = i6 & 512;
                        if (i14 != 0) {
                            i7 |= 805306368;
                        } else {
                            if ((i3 & 805306368) == 0) {
                                i15 = i14;
                                i7 |= composerStartRestartGroup.changedInstance(function24) ? 536870912 : 268435456;
                            }
                            i16 = i6 & 1024;
                            if (i16 == 0) {
                                i18 = i4 | 6;
                                i17 = i16;
                            } else if ((i4 & 6) == 0) {
                                i17 = i16;
                                i18 = i4 | (composerStartRestartGroup.changedInstance(function25) ? 4 : 2);
                            } else {
                                i17 = i16;
                                i18 = i4;
                            }
                            i19 = i6 & 2048;
                            if (i19 == 0) {
                                i18 |= 48;
                                i20 = i19;
                            } else if ((i4 & 48) == 0) {
                                i20 = i19;
                                i18 |= composerStartRestartGroup.changedInstance(function26) ? 32 : 16;
                            } else {
                                i20 = i19;
                            }
                            int i44 = i18;
                            i21 = i7;
                            i22 = i6 & 4096;
                            if (i22 == 0) {
                                i23 = i44 | 384;
                            } else {
                                int i45 = i44;
                                if ((i4 & 384) == 0) {
                                    i45 |= composerStartRestartGroup.changedInstance(function27) ? 256 : 128;
                                }
                                i23 = i45;
                            }
                            i24 = i6 & 8192;
                            if (i24 == 0) {
                                i25 = i23 | 3072;
                            } else {
                                int i46 = i23;
                                if ((i4 & 3072) == 0) {
                                    i25 = i46 | (composerStartRestartGroup.changed(z3) ? 2048 : 1024);
                                } else {
                                    i25 = i46;
                                }
                            }
                            i26 = i6 & 16384;
                            if (i26 != 0) {
                                i27 = i25;
                                if ((i4 & 24576) == 0) {
                                    i27 |= composerStartRestartGroup.changed(visualTransformation) ? 16384 : 8192;
                                }
                                i28 = i6 & 32768;
                                if (i28 != 0) {
                                    i27 |= 196608;
                                } else if ((i4 & 196608) == 0) {
                                    i27 |= composerStartRestartGroup.changed(keyboardOptions) ? 131072 : 65536;
                                }
                                i29 = i6 & 65536;
                                if (i29 != 0) {
                                    i27 |= 1572864;
                                } else if ((i4 & 1572864) == 0) {
                                    i27 |= composerStartRestartGroup.changed(keyboardActions) ? 1048576 : 524288;
                                }
                                i30 = i6 & 131072;
                                if (i30 != 0) {
                                    i27 |= 12582912;
                                } else if ((i4 & 12582912) == 0) {
                                    i27 |= composerStartRestartGroup.changed(z4) ? 8388608 : 4194304;
                                }
                                if ((i4 & 100663296) == 0) {
                                    i27 |= ((i6 & 262144) == 0 && composerStartRestartGroup.changed(i)) ? 67108864 : 33554432;
                                }
                                i31 = i6 & 524288;
                                if (i31 != 0) {
                                    i27 |= 805306368;
                                } else if ((i4 & 805306368) == 0) {
                                    i27 |= composerStartRestartGroup.changed(i2) ? 536870912 : 268435456;
                                }
                                i32 = i6 & 1048576;
                                if (i32 != 0) {
                                    i33 = i5 | 6;
                                } else if ((i5 & 6) == 0) {
                                    i33 = i5 | (composerStartRestartGroup.changed(interactionSource3) ? 4 : 2);
                                } else {
                                    i33 = i5;
                                }
                                if ((i5 & 48) == 0) {
                                    i33 |= ((i6 & 2097152) == 0 && composerStartRestartGroup.changed(shape)) ? 32 : 16;
                                }
                                if ((i5 & 384) == 0) {
                                    i33 |= ((i6 & 4194304) == 0 && composerStartRestartGroup.changed(textFieldColors)) ? 256 : 128;
                                }
                                int i47 = i33;
                                if ((i21 & 306783379) != 306783378 || (i27 & 306783379) != 306783378 || (i47 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
                                    composerStartRestartGroup.startDefaults();
                                    if ((i3 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                        if (i43 != 0) {
                                            modifier2 = Modifier.INSTANCE;
                                        }
                                        if (i8 != 0) {
                                            z5 = true;
                                        }
                                        if (i9 != 0) {
                                            z6 = false;
                                        }
                                        if ((i6 & 32) == 0) {
                                            i34 = i21 & (-458753);
                                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                        } else {
                                            i34 = i21;
                                        }
                                        if (i10 != 0) {
                                            function28 = null;
                                        }
                                        if (i11 != 0) {
                                            function29 = null;
                                        }
                                        Function2<? super Composer, ? super Integer, Unit> function222 = i13 == 0 ? null : function23;
                                        Function2<? super Composer, ? super Integer, Unit> function223 = i15 == 0 ? null : function24;
                                        Function2<? super Composer, ? super Integer, Unit> function224 = i17 == 0 ? null : function25;
                                        Function2<? super Composer, ? super Integer, Unit> function225 = i20 == 0 ? null : function26;
                                        Function2<? super Composer, ? super Integer, Unit> function226 = i22 == 0 ? null : function27;
                                        boolean z14 = i24 == 0 ? false : z3;
                                        VisualTransformation none = i26 == 0 ? VisualTransformation.INSTANCE.getNone() : visualTransformation;
                                        KeyboardOptions keyboardOptions4 = i28 == 0 ? KeyboardOptions.INSTANCE.getDefault() : keyboardOptions;
                                        KeyboardActions keyboardActions4 = i29 == 0 ? KeyboardActions.INSTANCE.getDefault() : keyboardActions;
                                        boolean z15 = i30 == 0 ? false : z4;
                                        if ((i6 & 262144) == 0) {
                                            i35 = z15 ? 1 : Integer.MAX_VALUE;
                                            i27 &= -234881025;
                                        } else {
                                            i35 = i;
                                        }
                                        int i48 = i31 == 0 ? 1 : i2;
                                        InteractionSource3 interactionSource35 = i32 == 0 ? interactionSource3 : null;
                                        Shape shape4 = (i6 & 2097152) == 0 ? OutlinedTextFieldDefaults.INSTANCE.getShape(composerStartRestartGroup, 6) : shape;
                                        InteractionSource3 interactionSource36 = interactionSource35;
                                        if ((i6 & 4194304) == 0) {
                                            Modifier modifier4 = modifier2;
                                            textFieldColorsColors = OutlinedTextFieldDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                                            textStyle3 = textStyle2;
                                            modifier3 = modifier4;
                                            shape2 = shape4;
                                            function210 = function222;
                                            function211 = function223;
                                            i36 = i27;
                                            function212 = function224;
                                            keyboardOptions2 = keyboardOptions4;
                                            keyboardActions2 = keyboardActions4;
                                            function213 = function225;
                                            function214 = function226;
                                            z7 = z15;
                                            i37 = i35;
                                            i38 = i48;
                                            interactionSource32 = interactionSource36;
                                        } else {
                                            shape2 = shape4;
                                            textStyle3 = textStyle2;
                                            function210 = function222;
                                            modifier3 = modifier2;
                                            function211 = function223;
                                            i36 = i27;
                                            function212 = function224;
                                            keyboardOptions2 = keyboardOptions4;
                                            keyboardActions2 = keyboardActions4;
                                            function213 = function225;
                                            function214 = function226;
                                            z7 = z15;
                                            i37 = i35;
                                            i38 = i48;
                                            interactionSource32 = interactionSource36;
                                            textFieldColorsColors = textFieldColors;
                                        }
                                        visualTransformation2 = none;
                                        i39 = i34;
                                        function215 = function29;
                                        z8 = z14;
                                        z9 = z6;
                                        i40 = 0;
                                    } else {
                                        composerStartRestartGroup.skipToGroupEnd();
                                        i39 = (i6 & 32) != 0 ? i21 & (-458753) : i21;
                                        if ((262144 & i6) != 0) {
                                            i27 &= -234881025;
                                        }
                                        function210 = function23;
                                        function211 = function24;
                                        function212 = function25;
                                        function213 = function26;
                                        function214 = function27;
                                        visualTransformation2 = visualTransformation;
                                        keyboardOptions2 = keyboardOptions;
                                        keyboardActions2 = keyboardActions;
                                        z7 = z4;
                                        i37 = i;
                                        i38 = i2;
                                        interactionSource32 = interactionSource3;
                                        shape2 = shape;
                                        z9 = z6;
                                        textStyle3 = textStyle2;
                                        function215 = function29;
                                        modifier3 = modifier2;
                                        i36 = i27;
                                        i40 = 0;
                                        z8 = z3;
                                        textFieldColorsColors = textFieldColors;
                                    }
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1922450045, i39, i36, "androidx.compose.material3.OutlinedTextField (OutlinedTextField.kt:193)");
                                    }
                                    composerStartRestartGroup.startReplaceGroup(30062948);
                                    if (interactionSource32 != null) {
                                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = InteractionSource2.MutableInteractionSource();
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                        }
                                        interactionSource33 = (InteractionSource3) objRememberedValue;
                                    } else {
                                        interactionSource33 = interactionSource32;
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    composerStartRestartGroup.startReplaceGroup(30069058);
                                    jM7661getColor0d7_KjU = textStyle3.m7661getColor0d7_KjU();
                                    if (jM7661getColor0d7_KjU == 16) {
                                        jM7661getColor0d7_KjU = textFieldColorsColors.m6009textColorXeAY9LY$material3_release(z5, z8, FocusInteraction3.collectIsFocusedAsState(interactionSource33, composerStartRestartGroup, i40).getValue().booleanValue());
                                    }
                                    long j = jM7661getColor0d7_KjU;
                                    composerStartRestartGroup.endReplaceGroup();
                                    final TextStyle textStyleMerge = textStyle3.merge(new TextStyle(j, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawScope2) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                                    final Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                                    final InteractionSource3 interactionSource37 = interactionSource33;
                                    final boolean z16 = z5;
                                    CompositionLocal3.CompositionLocalProvider(TextSelectionColors2.getLocalTextSelectionColors().provides(textFieldColorsColors.getTextSelectionColors()), ComposableLambda3.rememberComposableLambda(-1886965181, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.1
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

                                        public final void invoke(Composer composer3, int i49) {
                                            Modifier modifierM5146paddingqDBjuR0$default;
                                            if ((i49 & 3) != 2 || !composer3.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1886965181, i49, -1, "androidx.compose.material3.OutlinedTextField.<anonymous> (OutlinedTextField.kt:207)");
                                                }
                                                Modifier modifier5 = modifier3;
                                                if (function28 != null) {
                                                    modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(SemanticsModifier6.semantics(Modifier.INSTANCE, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.1.1
                                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                        }

                                                        @Override // kotlin.jvm.functions.Function1
                                                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                            invoke2(semanticsPropertyReceiver);
                                                            return Unit.INSTANCE;
                                                        }
                                                    }), 0.0f, density.mo5011toDpGaN1DYA(OutlinedTextField.getOutlinedTextFieldTopPadding()), 0.0f, 0.0f, 13, null);
                                                } else {
                                                    modifierM5146paddingqDBjuR0$default = Modifier.INSTANCE;
                                                }
                                                Modifier modifierThen = modifier5.then(modifierM5146paddingqDBjuR0$default);
                                                boolean z17 = z8;
                                                Strings.Companion companion = Strings.INSTANCE;
                                                Modifier modifierDefaultErrorSemantics = TextFieldImplKt.defaultErrorSemantics(modifierThen, z17, Strings_androidKt.m6095getString2EP1pXo(Strings.m6094constructorimpl(androidx.compose.p011ui.R$string.default_error_message), composer3, 0));
                                                OutlinedTextFieldDefaults outlinedTextFieldDefaults = OutlinedTextFieldDefaults.INSTANCE;
                                                Modifier modifierM5154defaultMinSizeVpY3zN4 = SizeKt.m5154defaultMinSizeVpY3zN4(modifierDefaultErrorSemantics, outlinedTextFieldDefaults.m5910getMinWidthD9Ej5fM(), outlinedTextFieldDefaults.m5909getMinHeightD9Ej5fM());
                                                SolidColor solidColor = new SolidColor(textFieldColorsColors.m6001cursorColorvNxB06k$material3_release(z8), null);
                                                final String str3 = str2;
                                                Function1<String, Unit> function13 = function12;
                                                final boolean z18 = z16;
                                                boolean z19 = z9;
                                                TextStyle textStyle5 = textStyleMerge;
                                                KeyboardOptions keyboardOptions5 = keyboardOptions2;
                                                KeyboardActions keyboardActions5 = keyboardActions2;
                                                final boolean z20 = z7;
                                                int i50 = i37;
                                                int i51 = i38;
                                                final VisualTransformation visualTransformation4 = visualTransformation2;
                                                final InteractionSource3 interactionSource38 = interactionSource37;
                                                final boolean z21 = z8;
                                                final Function2<Composer, Integer, Unit> function227 = function28;
                                                final Function2<Composer, Integer, Unit> function228 = function215;
                                                final Function2<Composer, Integer, Unit> function229 = function210;
                                                final Function2<Composer, Integer, Unit> function230 = function211;
                                                final Function2<Composer, Integer, Unit> function231 = function212;
                                                final Function2<Composer, Integer, Unit> function232 = function213;
                                                final Function2<Composer, Integer, Unit> function233 = function214;
                                                final TextFieldColors textFieldColors3 = textFieldColorsColors;
                                                final Shape shape5 = shape2;
                                                BasicTextFieldKt.BasicTextField(str3, function13, modifierM5154defaultMinSizeVpY3zN4, z18, z19, textStyle5, keyboardOptions5, keyboardActions5, z20, i50, i51, visualTransformation4, (Function1<? super TextLayoutResult, Unit>) null, interactionSource38, solidColor, ComposableLambda3.rememberComposableLambda(1474611661, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.1.3
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    {
                                                        super(3);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function3
                                                    public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function234, Composer composer4, Integer num) {
                                                        invoke((Function2<? super Composer, ? super Integer, Unit>) function234, composer4, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void invoke(Function2<? super Composer, ? super Integer, Unit> function234, Composer composer4, int i52) {
                                                        int i53;
                                                        if ((i52 & 6) == 0) {
                                                            i53 = i52 | (composer4.changedInstance(function234) ? 4 : 2);
                                                        } else {
                                                            i53 = i52;
                                                        }
                                                        if ((i53 & 19) != 18 || !composer4.getSkipping()) {
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(1474611661, i53, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:241)");
                                                            }
                                                            OutlinedTextFieldDefaults outlinedTextFieldDefaults2 = OutlinedTextFieldDefaults.INSTANCE;
                                                            int i54 = i53;
                                                            String str4 = str3;
                                                            final boolean z22 = z18;
                                                            boolean z23 = z20;
                                                            VisualTransformation visualTransformation5 = visualTransformation4;
                                                            final InteractionSource3 interactionSource39 = interactionSource38;
                                                            final boolean z24 = z21;
                                                            Function2<Composer, Integer, Unit> function235 = function227;
                                                            Function2<Composer, Integer, Unit> function236 = function228;
                                                            Function2<Composer, Integer, Unit> function237 = function229;
                                                            Function2<Composer, Integer, Unit> function238 = function230;
                                                            Function2<Composer, Integer, Unit> function239 = function231;
                                                            Function2<Composer, Integer, Unit> function240 = function232;
                                                            Function2<Composer, Integer, Unit> function241 = function233;
                                                            final TextFieldColors textFieldColors4 = textFieldColors3;
                                                            final Shape shape6 = shape5;
                                                            outlinedTextFieldDefaults2.DecorationBox(str4, function234, z22, z23, visualTransformation5, interactionSource39, z24, function235, function236, function237, function238, function239, function240, function241, textFieldColors4, null, ComposableLambda3.rememberComposableLambda(2108828640, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.1.3.1
                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                {
                                                                    super(2);
                                                                }

                                                                @Override // kotlin.jvm.functions.Function2
                                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                                    invoke(composer5, num.intValue());
                                                                    return Unit.INSTANCE;
                                                                }

                                                                public final void invoke(Composer composer5, int i55) {
                                                                    if ((i55 & 3) != 2 || !composer5.getSkipping()) {
                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                            ComposerKt.traceEventStart(2108828640, i55, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous>.<anonymous> (OutlinedTextField.kt:258)");
                                                                        }
                                                                        OutlinedTextFieldDefaults.INSTANCE.m5906Container4EFweAY(z22, z24, interactionSource39, null, textFieldColors4, shape6, 0.0f, 0.0f, composer5, 100663296, 200);
                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                            ComposerKt.traceEventEnd();
                                                                            return;
                                                                        }
                                                                        return;
                                                                    }
                                                                    composer5.skipToGroupEnd();
                                                                }
                                                            }, composer4, 54), composer4, (i54 << 3) & 112, 14155776, 32768);
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        composer4.skipToGroupEnd();
                                                    }
                                                }, composer3, 54), composer3, 0, 196608, 4096);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer3.skipToGroupEnd();
                                        }
                                    }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    textStyle4 = textStyle3;
                                    composer2 = composerStartRestartGroup;
                                    function216 = function28;
                                    z10 = z8;
                                    z11 = z16;
                                    z12 = z9;
                                    keyboardOptions3 = keyboardOptions2;
                                    keyboardActions3 = keyboardActions2;
                                    z13 = z7;
                                    i41 = i37;
                                    i42 = i38;
                                    visualTransformation3 = visualTransformation2;
                                    function217 = function215;
                                    function218 = function211;
                                    function219 = function212;
                                    function220 = function213;
                                    shape3 = shape2;
                                    interactionSource34 = interactionSource32;
                                    textFieldColors2 = textFieldColorsColors;
                                    function221 = function214;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    function210 = function23;
                                    function219 = function25;
                                    z10 = z3;
                                    visualTransformation3 = visualTransformation;
                                    keyboardOptions3 = keyboardOptions;
                                    keyboardActions3 = keyboardActions;
                                    z13 = z4;
                                    i41 = i;
                                    i42 = i2;
                                    interactionSource34 = interactionSource3;
                                    shape3 = shape;
                                    textFieldColors2 = textFieldColors;
                                    composer2 = composerStartRestartGroup;
                                    z11 = z5;
                                    z12 = z6;
                                    textStyle4 = textStyle2;
                                    function216 = function28;
                                    function217 = function29;
                                    modifier3 = modifier2;
                                    function218 = function24;
                                    function220 = function26;
                                    function221 = function27;
                                }
                                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                    final Function2<? super Composer, ? super Integer, Unit> function227 = function210;
                                    final Modifier modifier5 = modifier3;
                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.2
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

                                        public final void invoke(Composer composer3, int i49) {
                                            OutlinedTextField.OutlinedTextField(str, function1, modifier5, z11, z12, textStyle4, function216, function217, function227, function218, function219, function220, function221, z10, visualTransformation3, keyboardOptions3, keyboardActions3, z13, i41, i42, interactionSource34, shape3, textFieldColors2, composer3, RecomposeScopeImpl4.updateChangedFlags(i3 | 1), RecomposeScopeImpl4.updateChangedFlags(i4), RecomposeScopeImpl4.updateChangedFlags(i5), i6);
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i27 = i25 | 24576;
                            i28 = i6 & 32768;
                            if (i28 != 0) {
                            }
                            i29 = i6 & 65536;
                            if (i29 != 0) {
                            }
                            i30 = i6 & 131072;
                            if (i30 != 0) {
                            }
                            if ((i4 & 100663296) == 0) {
                            }
                            i31 = i6 & 524288;
                            if (i31 != 0) {
                            }
                            i32 = i6 & 1048576;
                            if (i32 != 0) {
                            }
                            if ((i5 & 48) == 0) {
                            }
                            if ((i5 & 384) == 0) {
                            }
                            int i472 = i33;
                            if ((i21 & 306783379) != 306783378) {
                                composerStartRestartGroup.startDefaults();
                                if ((i3 & 1) != 0) {
                                    if (i43 != 0) {
                                    }
                                    if (i8 != 0) {
                                    }
                                    if (i9 != 0) {
                                    }
                                    if ((i6 & 32) == 0) {
                                    }
                                    if (i10 != 0) {
                                    }
                                    if (i11 != 0) {
                                    }
                                    if (i13 == 0) {
                                    }
                                    if (i15 == 0) {
                                    }
                                    if (i17 == 0) {
                                    }
                                    if (i20 == 0) {
                                    }
                                    if (i22 == 0) {
                                    }
                                    if (i24 == 0) {
                                    }
                                    if (i26 == 0) {
                                    }
                                    if (i28 == 0) {
                                    }
                                    if (i29 == 0) {
                                    }
                                    if (i30 == 0) {
                                    }
                                    if ((i6 & 262144) == 0) {
                                    }
                                    if (i31 == 0) {
                                    }
                                    if (i32 == 0) {
                                    }
                                    if ((i6 & 2097152) == 0) {
                                    }
                                    InteractionSource3 interactionSource362 = interactionSource35;
                                    if ((i6 & 4194304) == 0) {
                                    }
                                    visualTransformation2 = none;
                                    i39 = i34;
                                    function215 = function29;
                                    z8 = z14;
                                    z9 = z6;
                                    i40 = 0;
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    composerStartRestartGroup.startReplaceGroup(30062948);
                                    if (interactionSource32 != null) {
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    composerStartRestartGroup.startReplaceGroup(30069058);
                                    jM7661getColor0d7_KjU = textStyle3.m7661getColor0d7_KjU();
                                    if (jM7661getColor0d7_KjU == 16) {
                                    }
                                    long j2 = jM7661getColor0d7_KjU;
                                    composerStartRestartGroup.endReplaceGroup();
                                    final TextStyle textStyleMerge2 = textStyle3.merge(new TextStyle(j2, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawScope2) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                                    final Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                                    final InteractionSource3 interactionSource372 = interactionSource33;
                                    final boolean z162 = z5;
                                    CompositionLocal3.CompositionLocalProvider(TextSelectionColors2.getLocalTextSelectionColors().provides(textFieldColorsColors.getTextSelectionColors()), ComposableLambda3.rememberComposableLambda(-1886965181, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.1
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

                                        public final void invoke(Composer composer3, int i49) {
                                            Modifier modifierM5146paddingqDBjuR0$default;
                                            if ((i49 & 3) != 2 || !composer3.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1886965181, i49, -1, "androidx.compose.material3.OutlinedTextField.<anonymous> (OutlinedTextField.kt:207)");
                                                }
                                                Modifier modifier52 = modifier3;
                                                if (function28 != null) {
                                                    modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(SemanticsModifier6.semantics(Modifier.INSTANCE, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.1.1
                                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                        }

                                                        @Override // kotlin.jvm.functions.Function1
                                                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                            invoke2(semanticsPropertyReceiver);
                                                            return Unit.INSTANCE;
                                                        }
                                                    }), 0.0f, density2.mo5011toDpGaN1DYA(OutlinedTextField.getOutlinedTextFieldTopPadding()), 0.0f, 0.0f, 13, null);
                                                } else {
                                                    modifierM5146paddingqDBjuR0$default = Modifier.INSTANCE;
                                                }
                                                Modifier modifierThen = modifier52.then(modifierM5146paddingqDBjuR0$default);
                                                boolean z17 = z8;
                                                Strings.Companion companion = Strings.INSTANCE;
                                                Modifier modifierDefaultErrorSemantics = TextFieldImplKt.defaultErrorSemantics(modifierThen, z17, Strings_androidKt.m6095getString2EP1pXo(Strings.m6094constructorimpl(androidx.compose.p011ui.R$string.default_error_message), composer3, 0));
                                                OutlinedTextFieldDefaults outlinedTextFieldDefaults = OutlinedTextFieldDefaults.INSTANCE;
                                                Modifier modifierM5154defaultMinSizeVpY3zN4 = SizeKt.m5154defaultMinSizeVpY3zN4(modifierDefaultErrorSemantics, outlinedTextFieldDefaults.m5910getMinWidthD9Ej5fM(), outlinedTextFieldDefaults.m5909getMinHeightD9Ej5fM());
                                                SolidColor solidColor = new SolidColor(textFieldColorsColors.m6001cursorColorvNxB06k$material3_release(z8), null);
                                                final String str3 = str2;
                                                Function1<String, Unit> function13 = function12;
                                                final boolean z18 = z162;
                                                boolean z19 = z9;
                                                TextStyle textStyle5 = textStyleMerge2;
                                                KeyboardOptions keyboardOptions5 = keyboardOptions2;
                                                KeyboardActions keyboardActions5 = keyboardActions2;
                                                final boolean z20 = z7;
                                                int i50 = i37;
                                                int i51 = i38;
                                                final VisualTransformation visualTransformation4 = visualTransformation2;
                                                final InteractionSource3 interactionSource38 = interactionSource372;
                                                final boolean z21 = z8;
                                                final Function2<? super Composer, ? super Integer, Unit> function2272 = function28;
                                                final Function2<? super Composer, ? super Integer, Unit> function228 = function215;
                                                final Function2<? super Composer, ? super Integer, Unit> function229 = function210;
                                                final Function2<? super Composer, ? super Integer, Unit> function230 = function211;
                                                final Function2<? super Composer, ? super Integer, Unit> function231 = function212;
                                                final Function2<? super Composer, ? super Integer, Unit> function232 = function213;
                                                final Function2<? super Composer, ? super Integer, Unit> function233 = function214;
                                                final TextFieldColors textFieldColors3 = textFieldColorsColors;
                                                final Shape shape5 = shape2;
                                                BasicTextFieldKt.BasicTextField(str3, function13, modifierM5154defaultMinSizeVpY3zN4, z18, z19, textStyle5, keyboardOptions5, keyboardActions5, z20, i50, i51, visualTransformation4, (Function1<? super TextLayoutResult, Unit>) null, interactionSource38, solidColor, ComposableLambda3.rememberComposableLambda(1474611661, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.1.3
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    {
                                                        super(3);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function3
                                                    public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function234, Composer composer4, Integer num) {
                                                        invoke((Function2<? super Composer, ? super Integer, Unit>) function234, composer4, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void invoke(Function2<? super Composer, ? super Integer, Unit> function234, Composer composer4, int i52) {
                                                        int i53;
                                                        if ((i52 & 6) == 0) {
                                                            i53 = i52 | (composer4.changedInstance(function234) ? 4 : 2);
                                                        } else {
                                                            i53 = i52;
                                                        }
                                                        if ((i53 & 19) != 18 || !composer4.getSkipping()) {
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(1474611661, i53, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:241)");
                                                            }
                                                            OutlinedTextFieldDefaults outlinedTextFieldDefaults2 = OutlinedTextFieldDefaults.INSTANCE;
                                                            int i54 = i53;
                                                            String str4 = str3;
                                                            final boolean z22 = z18;
                                                            boolean z23 = z20;
                                                            VisualTransformation visualTransformation5 = visualTransformation4;
                                                            final InteractionSource3 interactionSource39 = interactionSource38;
                                                            final boolean z24 = z21;
                                                            Function2<Composer, Integer, Unit> function235 = function2272;
                                                            Function2<Composer, Integer, Unit> function236 = function228;
                                                            Function2<Composer, Integer, Unit> function237 = function229;
                                                            Function2<Composer, Integer, Unit> function238 = function230;
                                                            Function2<Composer, Integer, Unit> function239 = function231;
                                                            Function2<Composer, Integer, Unit> function240 = function232;
                                                            Function2<Composer, Integer, Unit> function241 = function233;
                                                            final TextFieldColors textFieldColors4 = textFieldColors3;
                                                            final Shape shape6 = shape5;
                                                            outlinedTextFieldDefaults2.DecorationBox(str4, function234, z22, z23, visualTransformation5, interactionSource39, z24, function235, function236, function237, function238, function239, function240, function241, textFieldColors4, null, ComposableLambda3.rememberComposableLambda(2108828640, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.1.3.1
                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                {
                                                                    super(2);
                                                                }

                                                                @Override // kotlin.jvm.functions.Function2
                                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                                    invoke(composer5, num.intValue());
                                                                    return Unit.INSTANCE;
                                                                }

                                                                public final void invoke(Composer composer5, int i55) {
                                                                    if ((i55 & 3) != 2 || !composer5.getSkipping()) {
                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                            ComposerKt.traceEventStart(2108828640, i55, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous>.<anonymous> (OutlinedTextField.kt:258)");
                                                                        }
                                                                        OutlinedTextFieldDefaults.INSTANCE.m5906Container4EFweAY(z22, z24, interactionSource39, null, textFieldColors4, shape6, 0.0f, 0.0f, composer5, 100663296, 200);
                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                            ComposerKt.traceEventEnd();
                                                                            return;
                                                                        }
                                                                        return;
                                                                    }
                                                                    composer5.skipToGroupEnd();
                                                                }
                                                            }, composer4, 54), composer4, (i54 << 3) & 112, 14155776, 32768);
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        composer4.skipToGroupEnd();
                                                    }
                                                }, composer3, 54), composer3, 0, 196608, 4096);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer3.skipToGroupEnd();
                                        }
                                    }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    textStyle4 = textStyle3;
                                    composer2 = composerStartRestartGroup;
                                    function216 = function28;
                                    z10 = z8;
                                    z11 = z162;
                                    z12 = z9;
                                    keyboardOptions3 = keyboardOptions2;
                                    keyboardActions3 = keyboardActions2;
                                    z13 = z7;
                                    i41 = i37;
                                    i42 = i38;
                                    visualTransformation3 = visualTransformation2;
                                    function217 = function215;
                                    function218 = function211;
                                    function219 = function212;
                                    function220 = function213;
                                    shape3 = shape2;
                                    interactionSource34 = interactionSource32;
                                    textFieldColors2 = textFieldColorsColors;
                                    function221 = function214;
                                }
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                            }
                        }
                        i15 = i14;
                        i16 = i6 & 1024;
                        if (i16 == 0) {
                        }
                        i19 = i6 & 2048;
                        if (i19 == 0) {
                        }
                        int i442 = i18;
                        i21 = i7;
                        i22 = i6 & 4096;
                        if (i22 == 0) {
                        }
                        i24 = i6 & 8192;
                        if (i24 == 0) {
                        }
                        i26 = i6 & 16384;
                        if (i26 != 0) {
                        }
                        i28 = i6 & 32768;
                        if (i28 != 0) {
                        }
                        i29 = i6 & 65536;
                        if (i29 != 0) {
                        }
                        i30 = i6 & 131072;
                        if (i30 != 0) {
                        }
                        if ((i4 & 100663296) == 0) {
                        }
                        i31 = i6 & 524288;
                        if (i31 != 0) {
                        }
                        i32 = i6 & 1048576;
                        if (i32 != 0) {
                        }
                        if ((i5 & 48) == 0) {
                        }
                        if ((i5 & 384) == 0) {
                        }
                        int i4722 = i33;
                        if ((i21 & 306783379) != 306783378) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    i13 = i12;
                    i14 = i6 & 512;
                    if (i14 != 0) {
                    }
                    i15 = i14;
                    i16 = i6 & 1024;
                    if (i16 == 0) {
                    }
                    i19 = i6 & 2048;
                    if (i19 == 0) {
                    }
                    int i4422 = i18;
                    i21 = i7;
                    i22 = i6 & 4096;
                    if (i22 == 0) {
                    }
                    i24 = i6 & 8192;
                    if (i24 == 0) {
                    }
                    i26 = i6 & 16384;
                    if (i26 != 0) {
                    }
                    i28 = i6 & 32768;
                    if (i28 != 0) {
                    }
                    i29 = i6 & 65536;
                    if (i29 != 0) {
                    }
                    i30 = i6 & 131072;
                    if (i30 != 0) {
                    }
                    if ((i4 & 100663296) == 0) {
                    }
                    i31 = i6 & 524288;
                    if (i31 != 0) {
                    }
                    i32 = i6 & 1048576;
                    if (i32 != 0) {
                    }
                    if ((i5 & 48) == 0) {
                    }
                    if ((i5 & 384) == 0) {
                    }
                    int i47222 = i33;
                    if ((i21 & 306783379) != 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                z6 = z2;
                if ((i3 & 196608) != 0) {
                }
                i10 = i6 & 64;
                if (i10 == 0) {
                }
                i11 = i6 & 128;
                if (i11 == 0) {
                }
                i12 = i6 & 256;
                if (i12 == 0) {
                }
                i13 = i12;
                i14 = i6 & 512;
                if (i14 != 0) {
                }
                i15 = i14;
                i16 = i6 & 1024;
                if (i16 == 0) {
                }
                i19 = i6 & 2048;
                if (i19 == 0) {
                }
                int i44222 = i18;
                i21 = i7;
                i22 = i6 & 4096;
                if (i22 == 0) {
                }
                i24 = i6 & 8192;
                if (i24 == 0) {
                }
                i26 = i6 & 16384;
                if (i26 != 0) {
                }
                i28 = i6 & 32768;
                if (i28 != 0) {
                }
                i29 = i6 & 65536;
                if (i29 != 0) {
                }
                i30 = i6 & 131072;
                if (i30 != 0) {
                }
                if ((i4 & 100663296) == 0) {
                }
                i31 = i6 & 524288;
                if (i31 != 0) {
                }
                i32 = i6 & 1048576;
                if (i32 != 0) {
                }
                if ((i5 & 48) == 0) {
                }
                if ((i5 & 384) == 0) {
                }
                int i472222 = i33;
                if ((i21 & 306783379) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            z5 = z;
            i9 = i6 & 16;
            if (i9 != 0) {
            }
            z6 = z2;
            if ((i3 & 196608) != 0) {
            }
            i10 = i6 & 64;
            if (i10 == 0) {
            }
            i11 = i6 & 128;
            if (i11 == 0) {
            }
            i12 = i6 & 256;
            if (i12 == 0) {
            }
            i13 = i12;
            i14 = i6 & 512;
            if (i14 != 0) {
            }
            i15 = i14;
            i16 = i6 & 1024;
            if (i16 == 0) {
            }
            i19 = i6 & 2048;
            if (i19 == 0) {
            }
            int i442222 = i18;
            i21 = i7;
            i22 = i6 & 4096;
            if (i22 == 0) {
            }
            i24 = i6 & 8192;
            if (i24 == 0) {
            }
            i26 = i6 & 16384;
            if (i26 != 0) {
            }
            i28 = i6 & 32768;
            if (i28 != 0) {
            }
            i29 = i6 & 65536;
            if (i29 != 0) {
            }
            i30 = i6 & 131072;
            if (i30 != 0) {
            }
            if ((i4 & 100663296) == 0) {
            }
            i31 = i6 & 524288;
            if (i31 != 0) {
            }
            i32 = i6 & 1048576;
            if (i32 != 0) {
            }
            if ((i5 & 48) == 0) {
            }
            if ((i5 & 384) == 0) {
            }
            int i4722222 = i33;
            if ((i21 & 306783379) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i8 = i6 & 8;
        if (i8 == 0) {
        }
        z5 = z;
        i9 = i6 & 16;
        if (i9 != 0) {
        }
        z6 = z2;
        if ((i3 & 196608) != 0) {
        }
        i10 = i6 & 64;
        if (i10 == 0) {
        }
        i11 = i6 & 128;
        if (i11 == 0) {
        }
        i12 = i6 & 256;
        if (i12 == 0) {
        }
        i13 = i12;
        i14 = i6 & 512;
        if (i14 != 0) {
        }
        i15 = i14;
        i16 = i6 & 1024;
        if (i16 == 0) {
        }
        i19 = i6 & 2048;
        if (i19 == 0) {
        }
        int i4422222 = i18;
        i21 = i7;
        i22 = i6 & 4096;
        if (i22 == 0) {
        }
        i24 = i6 & 8192;
        if (i24 == 0) {
        }
        i26 = i6 & 16384;
        if (i26 != 0) {
        }
        i28 = i6 & 32768;
        if (i28 != 0) {
        }
        i29 = i6 & 65536;
        if (i29 != 0) {
        }
        i30 = i6 & 131072;
        if (i30 != 0) {
        }
        if ((i4 & 100663296) == 0) {
        }
        i31 = i6 & 524288;
        if (i31 != 0) {
        }
        i32 = i6 & 1048576;
        if (i32 != 0) {
        }
        if ((i5 & 48) == 0) {
        }
        if ((i5 & 384) == 0) {
        }
        int i47222222 = i33;
        if ((i21 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:358:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OutlinedTextField(final TextFieldValue textFieldValue, final Function1<? super TextFieldValue, Unit> function1, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, Function2<? super Composer, ? super Integer, Unit> function26, Function2<? super Composer, ? super Integer, Unit> function27, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i, int i2, InteractionSource3 interactionSource3, Shape shape, TextFieldColors textFieldColors, Composer composer, final int i3, final int i4, final int i5, final int i6) {
        final TextFieldValue textFieldValue2;
        int i7;
        final Function1<? super TextFieldValue, Unit> function12;
        Modifier modifier2;
        int i8;
        boolean z5;
        int i9;
        boolean z6;
        TextStyle textStyle2;
        int i10;
        final Function2<? super Composer, ? super Integer, Unit> function28;
        int i11;
        Function2<? super Composer, ? super Integer, Unit> function29;
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
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        final Shape shape2;
        TextStyle textStyle3;
        final Function2<? super Composer, ? super Integer, Unit> function210;
        final Modifier modifier3;
        final Function2<? super Composer, ? super Integer, Unit> function211;
        int i36;
        final Function2<? super Composer, ? super Integer, Unit> function212;
        final KeyboardOptions keyboardOptions2;
        final KeyboardActions keyboardActions2;
        final Function2<? super Composer, ? super Integer, Unit> function213;
        final Function2<? super Composer, ? super Integer, Unit> function214;
        final boolean z7;
        final int i37;
        final int i38;
        InteractionSource3 interactionSource32;
        final TextFieldColors textFieldColorsColors;
        final VisualTransformation visualTransformation2;
        int i39;
        final Function2<? super Composer, ? super Integer, Unit> function215;
        final boolean z8;
        final boolean z9;
        int i40;
        InteractionSource3 interactionSource33;
        long jM7661getColor0d7_KjU;
        final TextStyle textStyle4;
        Composer composer2;
        final Function2<? super Composer, ? super Integer, Unit> function216;
        final boolean z10;
        final boolean z11;
        final boolean z12;
        final KeyboardOptions keyboardOptions3;
        final KeyboardActions keyboardActions3;
        final boolean z13;
        final int i41;
        final int i42;
        final VisualTransformation visualTransformation3;
        final Function2<? super Composer, ? super Integer, Unit> function217;
        final Function2<? super Composer, ? super Integer, Unit> function218;
        final Function2<? super Composer, ? super Integer, Unit> function219;
        final Function2<? super Composer, ? super Integer, Unit> function220;
        final Shape shape3;
        final InteractionSource3 interactionSource34;
        final TextFieldColors textFieldColors2;
        final Function2<? super Composer, ? super Integer, Unit> function221;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1570442800);
        if ((i6 & 1) != 0) {
            i7 = i3 | 6;
            textFieldValue2 = textFieldValue;
        } else {
            textFieldValue2 = textFieldValue;
            if ((i3 & 6) == 0) {
                i7 = (composerStartRestartGroup.changed(textFieldValue2) ? 4 : 2) | i3;
            } else {
                i7 = i3;
            }
        }
        if ((i6 & 2) != 0) {
            i7 |= 48;
            function12 = function1;
        } else {
            function12 = function1;
            if ((i3 & 48) == 0) {
                i7 |= composerStartRestartGroup.changedInstance(function12) ? 32 : 16;
            }
        }
        int i43 = i6 & 4;
        if (i43 != 0) {
            i7 |= 384;
        } else {
            if ((i3 & 384) == 0) {
                modifier2 = modifier;
                i7 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i8 = i6 & 8;
            if (i8 == 0) {
                i7 |= 3072;
            } else {
                if ((i3 & 3072) == 0) {
                    z5 = z;
                    i7 |= composerStartRestartGroup.changed(z5) ? 2048 : 1024;
                }
                i9 = i6 & 16;
                if (i9 != 0) {
                    i7 |= 24576;
                } else {
                    if ((i3 & 24576) == 0) {
                        z6 = z2;
                        i7 |= composerStartRestartGroup.changed(z6) ? 16384 : 8192;
                    }
                    if ((i3 & 196608) != 0) {
                        textStyle2 = textStyle;
                        i7 |= ((i6 & 32) == 0 && composerStartRestartGroup.changed(textStyle2)) ? 131072 : 65536;
                    } else {
                        textStyle2 = textStyle;
                    }
                    i10 = i6 & 64;
                    if (i10 == 0) {
                        i7 |= 1572864;
                        function28 = function2;
                    } else {
                        function28 = function2;
                        if ((i3 & 1572864) == 0) {
                            i7 |= composerStartRestartGroup.changedInstance(function28) ? 1048576 : 524288;
                        }
                    }
                    i11 = i6 & 128;
                    if (i11 == 0) {
                        i7 |= 12582912;
                        function29 = function22;
                    } else {
                        function29 = function22;
                        if ((i3 & 12582912) == 0) {
                            i7 |= composerStartRestartGroup.changedInstance(function29) ? 8388608 : 4194304;
                        }
                    }
                    i12 = i6 & 256;
                    if (i12 == 0) {
                        i7 |= 100663296;
                    } else {
                        if ((i3 & 100663296) == 0) {
                            i13 = i12;
                            i7 |= composerStartRestartGroup.changedInstance(function23) ? 67108864 : 33554432;
                        }
                        i14 = i6 & 512;
                        if (i14 != 0) {
                            i7 |= 805306368;
                        } else {
                            if ((i3 & 805306368) == 0) {
                                i15 = i14;
                                i7 |= composerStartRestartGroup.changedInstance(function24) ? 536870912 : 268435456;
                            }
                            i16 = i6 & 1024;
                            if (i16 == 0) {
                                i18 = i4 | 6;
                                i17 = i16;
                            } else if ((i4 & 6) == 0) {
                                i17 = i16;
                                i18 = i4 | (composerStartRestartGroup.changedInstance(function25) ? 4 : 2);
                            } else {
                                i17 = i16;
                                i18 = i4;
                            }
                            i19 = i6 & 2048;
                            if (i19 == 0) {
                                i18 |= 48;
                                i20 = i19;
                            } else if ((i4 & 48) == 0) {
                                i20 = i19;
                                i18 |= composerStartRestartGroup.changedInstance(function26) ? 32 : 16;
                            } else {
                                i20 = i19;
                            }
                            int i44 = i18;
                            i21 = i7;
                            i22 = i6 & 4096;
                            if (i22 == 0) {
                                i23 = i44 | 384;
                            } else {
                                int i45 = i44;
                                if ((i4 & 384) == 0) {
                                    i45 |= composerStartRestartGroup.changedInstance(function27) ? 256 : 128;
                                }
                                i23 = i45;
                            }
                            i24 = i6 & 8192;
                            if (i24 == 0) {
                                i25 = i23 | 3072;
                            } else {
                                int i46 = i23;
                                if ((i4 & 3072) == 0) {
                                    i25 = i46 | (composerStartRestartGroup.changed(z3) ? 2048 : 1024);
                                } else {
                                    i25 = i46;
                                }
                            }
                            i26 = i6 & 16384;
                            if (i26 != 0) {
                                i27 = i25;
                                if ((i4 & 24576) == 0) {
                                    i27 |= composerStartRestartGroup.changed(visualTransformation) ? 16384 : 8192;
                                }
                                i28 = i6 & 32768;
                                if (i28 != 0) {
                                    i27 |= 196608;
                                } else if ((i4 & 196608) == 0) {
                                    i27 |= composerStartRestartGroup.changed(keyboardOptions) ? 131072 : 65536;
                                }
                                i29 = i6 & 65536;
                                if (i29 != 0) {
                                    i27 |= 1572864;
                                } else if ((i4 & 1572864) == 0) {
                                    i27 |= composerStartRestartGroup.changed(keyboardActions) ? 1048576 : 524288;
                                }
                                i30 = i6 & 131072;
                                if (i30 != 0) {
                                    i27 |= 12582912;
                                } else if ((i4 & 12582912) == 0) {
                                    i27 |= composerStartRestartGroup.changed(z4) ? 8388608 : 4194304;
                                }
                                if ((i4 & 100663296) == 0) {
                                    i27 |= ((i6 & 262144) == 0 && composerStartRestartGroup.changed(i)) ? 67108864 : 33554432;
                                }
                                i31 = i6 & 524288;
                                if (i31 != 0) {
                                    i27 |= 805306368;
                                } else if ((i4 & 805306368) == 0) {
                                    i27 |= composerStartRestartGroup.changed(i2) ? 536870912 : 268435456;
                                }
                                i32 = i6 & 1048576;
                                if (i32 != 0) {
                                    i33 = i5 | 6;
                                } else if ((i5 & 6) == 0) {
                                    i33 = i5 | (composerStartRestartGroup.changed(interactionSource3) ? 4 : 2);
                                } else {
                                    i33 = i5;
                                }
                                if ((i5 & 48) == 0) {
                                    i33 |= ((i6 & 2097152) == 0 && composerStartRestartGroup.changed(shape)) ? 32 : 16;
                                }
                                if ((i5 & 384) == 0) {
                                    i33 |= ((i6 & 4194304) == 0 && composerStartRestartGroup.changed(textFieldColors)) ? 256 : 128;
                                }
                                int i47 = i33;
                                if ((i21 & 306783379) != 306783378 || (i27 & 306783379) != 306783378 || (i47 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
                                    composerStartRestartGroup.startDefaults();
                                    if ((i3 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                        if (i43 != 0) {
                                            modifier2 = Modifier.INSTANCE;
                                        }
                                        if (i8 != 0) {
                                            z5 = true;
                                        }
                                        if (i9 != 0) {
                                            z6 = false;
                                        }
                                        if ((i6 & 32) == 0) {
                                            i34 = i21 & (-458753);
                                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                        } else {
                                            i34 = i21;
                                        }
                                        if (i10 != 0) {
                                            function28 = null;
                                        }
                                        if (i11 != 0) {
                                            function29 = null;
                                        }
                                        Function2<? super Composer, ? super Integer, Unit> function222 = i13 == 0 ? null : function23;
                                        Function2<? super Composer, ? super Integer, Unit> function223 = i15 == 0 ? null : function24;
                                        Function2<? super Composer, ? super Integer, Unit> function224 = i17 == 0 ? null : function25;
                                        Function2<? super Composer, ? super Integer, Unit> function225 = i20 == 0 ? null : function26;
                                        Function2<? super Composer, ? super Integer, Unit> function226 = i22 == 0 ? null : function27;
                                        boolean z14 = i24 == 0 ? false : z3;
                                        VisualTransformation none = i26 == 0 ? VisualTransformation.INSTANCE.getNone() : visualTransformation;
                                        KeyboardOptions keyboardOptions4 = i28 == 0 ? KeyboardOptions.INSTANCE.getDefault() : keyboardOptions;
                                        KeyboardActions keyboardActions4 = i29 == 0 ? KeyboardActions.INSTANCE.getDefault() : keyboardActions;
                                        boolean z15 = i30 == 0 ? false : z4;
                                        if ((i6 & 262144) == 0) {
                                            i35 = z15 ? 1 : Integer.MAX_VALUE;
                                            i27 &= -234881025;
                                        } else {
                                            i35 = i;
                                        }
                                        int i48 = i31 == 0 ? 1 : i2;
                                        InteractionSource3 interactionSource35 = i32 == 0 ? interactionSource3 : null;
                                        Shape shape4 = (i6 & 2097152) == 0 ? OutlinedTextFieldDefaults.INSTANCE.getShape(composerStartRestartGroup, 6) : shape;
                                        InteractionSource3 interactionSource36 = interactionSource35;
                                        if ((i6 & 4194304) == 0) {
                                            Modifier modifier4 = modifier2;
                                            textFieldColorsColors = OutlinedTextFieldDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                                            textStyle3 = textStyle2;
                                            modifier3 = modifier4;
                                            shape2 = shape4;
                                            function210 = function222;
                                            function211 = function223;
                                            i36 = i27;
                                            function212 = function224;
                                            keyboardOptions2 = keyboardOptions4;
                                            keyboardActions2 = keyboardActions4;
                                            function213 = function225;
                                            function214 = function226;
                                            z7 = z15;
                                            i37 = i35;
                                            i38 = i48;
                                            interactionSource32 = interactionSource36;
                                        } else {
                                            shape2 = shape4;
                                            textStyle3 = textStyle2;
                                            function210 = function222;
                                            modifier3 = modifier2;
                                            function211 = function223;
                                            i36 = i27;
                                            function212 = function224;
                                            keyboardOptions2 = keyboardOptions4;
                                            keyboardActions2 = keyboardActions4;
                                            function213 = function225;
                                            function214 = function226;
                                            z7 = z15;
                                            i37 = i35;
                                            i38 = i48;
                                            interactionSource32 = interactionSource36;
                                            textFieldColorsColors = textFieldColors;
                                        }
                                        visualTransformation2 = none;
                                        i39 = i34;
                                        function215 = function29;
                                        z8 = z14;
                                        z9 = z6;
                                        i40 = 0;
                                    } else {
                                        composerStartRestartGroup.skipToGroupEnd();
                                        i39 = (i6 & 32) != 0 ? i21 & (-458753) : i21;
                                        if ((262144 & i6) != 0) {
                                            i27 &= -234881025;
                                        }
                                        function210 = function23;
                                        function211 = function24;
                                        function212 = function25;
                                        function213 = function26;
                                        function214 = function27;
                                        visualTransformation2 = visualTransformation;
                                        keyboardOptions2 = keyboardOptions;
                                        keyboardActions2 = keyboardActions;
                                        z7 = z4;
                                        i37 = i;
                                        i38 = i2;
                                        interactionSource32 = interactionSource3;
                                        shape2 = shape;
                                        z9 = z6;
                                        textStyle3 = textStyle2;
                                        function215 = function29;
                                        modifier3 = modifier2;
                                        i36 = i27;
                                        i40 = 0;
                                        z8 = z3;
                                        textFieldColorsColors = textFieldColors;
                                    }
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1570442800, i39, i36, "androidx.compose.material3.OutlinedTextField (OutlinedTextField.kt:368)");
                                    }
                                    composerStartRestartGroup.startReplaceGroup(30368324);
                                    if (interactionSource32 != null) {
                                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = InteractionSource2.MutableInteractionSource();
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                        }
                                        interactionSource33 = (InteractionSource3) objRememberedValue;
                                    } else {
                                        interactionSource33 = interactionSource32;
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    composerStartRestartGroup.startReplaceGroup(30374434);
                                    jM7661getColor0d7_KjU = textStyle3.m7661getColor0d7_KjU();
                                    if (jM7661getColor0d7_KjU == 16) {
                                        jM7661getColor0d7_KjU = textFieldColorsColors.m6009textColorXeAY9LY$material3_release(z5, z8, FocusInteraction3.collectIsFocusedAsState(interactionSource33, composerStartRestartGroup, i40).getValue().booleanValue());
                                    }
                                    long j = jM7661getColor0d7_KjU;
                                    composerStartRestartGroup.endReplaceGroup();
                                    final TextStyle textStyleMerge = textStyle3.merge(new TextStyle(j, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawScope2) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                                    final Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                                    final InteractionSource3 interactionSource37 = interactionSource33;
                                    final boolean z16 = z5;
                                    CompositionLocal3.CompositionLocalProvider(TextSelectionColors2.getLocalTextSelectionColors().provides(textFieldColorsColors.getTextSelectionColors()), ComposableLambda3.rememberComposableLambda(1830921872, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.3
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

                                        public final void invoke(Composer composer3, int i49) {
                                            Modifier modifierM5146paddingqDBjuR0$default;
                                            if ((i49 & 3) != 2 || !composer3.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(1830921872, i49, -1, "androidx.compose.material3.OutlinedTextField.<anonymous> (OutlinedTextField.kt:382)");
                                                }
                                                Modifier modifier5 = modifier3;
                                                if (function28 != null) {
                                                    modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(SemanticsModifier6.semantics(Modifier.INSTANCE, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.3.1
                                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                        }

                                                        @Override // kotlin.jvm.functions.Function1
                                                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                            invoke2(semanticsPropertyReceiver);
                                                            return Unit.INSTANCE;
                                                        }
                                                    }), 0.0f, density.mo5011toDpGaN1DYA(OutlinedTextField.getOutlinedTextFieldTopPadding()), 0.0f, 0.0f, 13, null);
                                                } else {
                                                    modifierM5146paddingqDBjuR0$default = Modifier.INSTANCE;
                                                }
                                                Modifier modifierThen = modifier5.then(modifierM5146paddingqDBjuR0$default);
                                                boolean z17 = z8;
                                                Strings.Companion companion = Strings.INSTANCE;
                                                Modifier modifierDefaultErrorSemantics = TextFieldImplKt.defaultErrorSemantics(modifierThen, z17, Strings_androidKt.m6095getString2EP1pXo(Strings.m6094constructorimpl(androidx.compose.p011ui.R$string.default_error_message), composer3, 0));
                                                OutlinedTextFieldDefaults outlinedTextFieldDefaults = OutlinedTextFieldDefaults.INSTANCE;
                                                Modifier modifierM5154defaultMinSizeVpY3zN4 = SizeKt.m5154defaultMinSizeVpY3zN4(modifierDefaultErrorSemantics, outlinedTextFieldDefaults.m5910getMinWidthD9Ej5fM(), outlinedTextFieldDefaults.m5909getMinHeightD9Ej5fM());
                                                SolidColor solidColor = new SolidColor(textFieldColorsColors.m6001cursorColorvNxB06k$material3_release(z8), null);
                                                final TextFieldValue textFieldValue3 = textFieldValue2;
                                                Function1<TextFieldValue, Unit> function13 = function12;
                                                final boolean z18 = z16;
                                                boolean z19 = z9;
                                                TextStyle textStyle5 = textStyleMerge;
                                                KeyboardOptions keyboardOptions5 = keyboardOptions2;
                                                KeyboardActions keyboardActions5 = keyboardActions2;
                                                final boolean z20 = z7;
                                                int i50 = i37;
                                                int i51 = i38;
                                                final VisualTransformation visualTransformation4 = visualTransformation2;
                                                final InteractionSource3 interactionSource38 = interactionSource37;
                                                final boolean z21 = z8;
                                                final Function2<Composer, Integer, Unit> function227 = function28;
                                                final Function2<Composer, Integer, Unit> function228 = function215;
                                                final Function2<Composer, Integer, Unit> function229 = function210;
                                                final Function2<Composer, Integer, Unit> function230 = function211;
                                                final Function2<Composer, Integer, Unit> function231 = function212;
                                                final Function2<Composer, Integer, Unit> function232 = function213;
                                                final Function2<Composer, Integer, Unit> function233 = function214;
                                                final TextFieldColors textFieldColors3 = textFieldColorsColors;
                                                final Shape shape5 = shape2;
                                                BasicTextFieldKt.BasicTextField(textFieldValue3, function13, modifierM5154defaultMinSizeVpY3zN4, z18, z19, textStyle5, keyboardOptions5, keyboardActions5, z20, i50, i51, visualTransformation4, (Function1<? super TextLayoutResult, Unit>) null, interactionSource38, solidColor, ComposableLambda3.rememberComposableLambda(-757328870, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.3.3
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    {
                                                        super(3);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function3
                                                    public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function234, Composer composer4, Integer num) {
                                                        invoke((Function2<? super Composer, ? super Integer, Unit>) function234, composer4, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void invoke(Function2<? super Composer, ? super Integer, Unit> function234, Composer composer4, int i52) {
                                                        int i53;
                                                        if ((i52 & 6) == 0) {
                                                            i53 = i52 | (composer4.changedInstance(function234) ? 4 : 2);
                                                        } else {
                                                            i53 = i52;
                                                        }
                                                        if ((i53 & 19) != 18 || !composer4.getSkipping()) {
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(-757328870, i53, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:416)");
                                                            }
                                                            OutlinedTextFieldDefaults outlinedTextFieldDefaults2 = OutlinedTextFieldDefaults.INSTANCE;
                                                            String text = textFieldValue3.getText();
                                                            final boolean z22 = z18;
                                                            boolean z23 = z20;
                                                            VisualTransformation visualTransformation5 = visualTransformation4;
                                                            final InteractionSource3 interactionSource39 = interactionSource38;
                                                            final boolean z24 = z21;
                                                            Function2<Composer, Integer, Unit> function235 = function227;
                                                            Function2<Composer, Integer, Unit> function236 = function228;
                                                            Function2<Composer, Integer, Unit> function237 = function229;
                                                            Function2<Composer, Integer, Unit> function238 = function230;
                                                            Function2<Composer, Integer, Unit> function239 = function231;
                                                            Function2<Composer, Integer, Unit> function240 = function232;
                                                            Function2<Composer, Integer, Unit> function241 = function233;
                                                            final TextFieldColors textFieldColors4 = textFieldColors3;
                                                            final Shape shape6 = shape5;
                                                            outlinedTextFieldDefaults2.DecorationBox(text, function234, z22, z23, visualTransformation5, interactionSource39, z24, function235, function236, function237, function238, function239, function240, function241, textFieldColors4, null, ComposableLambda3.rememberComposableLambda(255570733, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.3.3.1
                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                {
                                                                    super(2);
                                                                }

                                                                @Override // kotlin.jvm.functions.Function2
                                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                                    invoke(composer5, num.intValue());
                                                                    return Unit.INSTANCE;
                                                                }

                                                                public final void invoke(Composer composer5, int i54) {
                                                                    if ((i54 & 3) != 2 || !composer5.getSkipping()) {
                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                            ComposerKt.traceEventStart(255570733, i54, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous>.<anonymous> (OutlinedTextField.kt:433)");
                                                                        }
                                                                        OutlinedTextFieldDefaults.INSTANCE.m5906Container4EFweAY(z22, z24, interactionSource39, null, textFieldColors4, shape6, 0.0f, 0.0f, composer5, 100663296, 200);
                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                            ComposerKt.traceEventEnd();
                                                                            return;
                                                                        }
                                                                        return;
                                                                    }
                                                                    composer5.skipToGroupEnd();
                                                                }
                                                            }, composer4, 54), composer4, (i53 << 3) & 112, 14155776, 32768);
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        composer4.skipToGroupEnd();
                                                    }
                                                }, composer3, 54), composer3, 0, 196608, 4096);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer3.skipToGroupEnd();
                                        }
                                    }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    textStyle4 = textStyle3;
                                    composer2 = composerStartRestartGroup;
                                    function216 = function28;
                                    z10 = z8;
                                    z11 = z16;
                                    z12 = z9;
                                    keyboardOptions3 = keyboardOptions2;
                                    keyboardActions3 = keyboardActions2;
                                    z13 = z7;
                                    i41 = i37;
                                    i42 = i38;
                                    visualTransformation3 = visualTransformation2;
                                    function217 = function215;
                                    function218 = function211;
                                    function219 = function212;
                                    function220 = function213;
                                    shape3 = shape2;
                                    interactionSource34 = interactionSource32;
                                    textFieldColors2 = textFieldColorsColors;
                                    function221 = function214;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    function210 = function23;
                                    function219 = function25;
                                    z10 = z3;
                                    visualTransformation3 = visualTransformation;
                                    keyboardOptions3 = keyboardOptions;
                                    keyboardActions3 = keyboardActions;
                                    z13 = z4;
                                    i41 = i;
                                    i42 = i2;
                                    interactionSource34 = interactionSource3;
                                    shape3 = shape;
                                    textFieldColors2 = textFieldColors;
                                    composer2 = composerStartRestartGroup;
                                    z11 = z5;
                                    z12 = z6;
                                    textStyle4 = textStyle2;
                                    function216 = function28;
                                    function217 = function29;
                                    modifier3 = modifier2;
                                    function218 = function24;
                                    function220 = function26;
                                    function221 = function27;
                                }
                                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                    final Function2<? super Composer, ? super Integer, Unit> function227 = function210;
                                    final Modifier modifier5 = modifier3;
                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.4
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

                                        public final void invoke(Composer composer3, int i49) {
                                            OutlinedTextField.OutlinedTextField(textFieldValue, function1, modifier5, z11, z12, textStyle4, function216, function217, function227, function218, function219, function220, function221, z10, visualTransformation3, keyboardOptions3, keyboardActions3, z13, i41, i42, interactionSource34, shape3, textFieldColors2, composer3, RecomposeScopeImpl4.updateChangedFlags(i3 | 1), RecomposeScopeImpl4.updateChangedFlags(i4), RecomposeScopeImpl4.updateChangedFlags(i5), i6);
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i27 = i25 | 24576;
                            i28 = i6 & 32768;
                            if (i28 != 0) {
                            }
                            i29 = i6 & 65536;
                            if (i29 != 0) {
                            }
                            i30 = i6 & 131072;
                            if (i30 != 0) {
                            }
                            if ((i4 & 100663296) == 0) {
                            }
                            i31 = i6 & 524288;
                            if (i31 != 0) {
                            }
                            i32 = i6 & 1048576;
                            if (i32 != 0) {
                            }
                            if ((i5 & 48) == 0) {
                            }
                            if ((i5 & 384) == 0) {
                            }
                            int i472 = i33;
                            if ((i21 & 306783379) != 306783378) {
                                composerStartRestartGroup.startDefaults();
                                if ((i3 & 1) != 0) {
                                    if (i43 != 0) {
                                    }
                                    if (i8 != 0) {
                                    }
                                    if (i9 != 0) {
                                    }
                                    if ((i6 & 32) == 0) {
                                    }
                                    if (i10 != 0) {
                                    }
                                    if (i11 != 0) {
                                    }
                                    if (i13 == 0) {
                                    }
                                    if (i15 == 0) {
                                    }
                                    if (i17 == 0) {
                                    }
                                    if (i20 == 0) {
                                    }
                                    if (i22 == 0) {
                                    }
                                    if (i24 == 0) {
                                    }
                                    if (i26 == 0) {
                                    }
                                    if (i28 == 0) {
                                    }
                                    if (i29 == 0) {
                                    }
                                    if (i30 == 0) {
                                    }
                                    if ((i6 & 262144) == 0) {
                                    }
                                    if (i31 == 0) {
                                    }
                                    if (i32 == 0) {
                                    }
                                    if ((i6 & 2097152) == 0) {
                                    }
                                    InteractionSource3 interactionSource362 = interactionSource35;
                                    if ((i6 & 4194304) == 0) {
                                    }
                                    visualTransformation2 = none;
                                    i39 = i34;
                                    function215 = function29;
                                    z8 = z14;
                                    z9 = z6;
                                    i40 = 0;
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    composerStartRestartGroup.startReplaceGroup(30368324);
                                    if (interactionSource32 != null) {
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    composerStartRestartGroup.startReplaceGroup(30374434);
                                    jM7661getColor0d7_KjU = textStyle3.m7661getColor0d7_KjU();
                                    if (jM7661getColor0d7_KjU == 16) {
                                    }
                                    long j2 = jM7661getColor0d7_KjU;
                                    composerStartRestartGroup.endReplaceGroup();
                                    final TextStyle textStyleMerge2 = textStyle3.merge(new TextStyle(j2, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawScope2) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                                    final Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                                    final InteractionSource3 interactionSource372 = interactionSource33;
                                    final boolean z162 = z5;
                                    CompositionLocal3.CompositionLocalProvider(TextSelectionColors2.getLocalTextSelectionColors().provides(textFieldColorsColors.getTextSelectionColors()), ComposableLambda3.rememberComposableLambda(1830921872, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.3
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

                                        public final void invoke(Composer composer3, int i49) {
                                            Modifier modifierM5146paddingqDBjuR0$default;
                                            if ((i49 & 3) != 2 || !composer3.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(1830921872, i49, -1, "androidx.compose.material3.OutlinedTextField.<anonymous> (OutlinedTextField.kt:382)");
                                                }
                                                Modifier modifier52 = modifier3;
                                                if (function28 != null) {
                                                    modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(SemanticsModifier6.semantics(Modifier.INSTANCE, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.3.1
                                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                        }

                                                        @Override // kotlin.jvm.functions.Function1
                                                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                            invoke2(semanticsPropertyReceiver);
                                                            return Unit.INSTANCE;
                                                        }
                                                    }), 0.0f, density2.mo5011toDpGaN1DYA(OutlinedTextField.getOutlinedTextFieldTopPadding()), 0.0f, 0.0f, 13, null);
                                                } else {
                                                    modifierM5146paddingqDBjuR0$default = Modifier.INSTANCE;
                                                }
                                                Modifier modifierThen = modifier52.then(modifierM5146paddingqDBjuR0$default);
                                                boolean z17 = z8;
                                                Strings.Companion companion = Strings.INSTANCE;
                                                Modifier modifierDefaultErrorSemantics = TextFieldImplKt.defaultErrorSemantics(modifierThen, z17, Strings_androidKt.m6095getString2EP1pXo(Strings.m6094constructorimpl(androidx.compose.p011ui.R$string.default_error_message), composer3, 0));
                                                OutlinedTextFieldDefaults outlinedTextFieldDefaults = OutlinedTextFieldDefaults.INSTANCE;
                                                Modifier modifierM5154defaultMinSizeVpY3zN4 = SizeKt.m5154defaultMinSizeVpY3zN4(modifierDefaultErrorSemantics, outlinedTextFieldDefaults.m5910getMinWidthD9Ej5fM(), outlinedTextFieldDefaults.m5909getMinHeightD9Ej5fM());
                                                SolidColor solidColor = new SolidColor(textFieldColorsColors.m6001cursorColorvNxB06k$material3_release(z8), null);
                                                final TextFieldValue textFieldValue3 = textFieldValue2;
                                                Function1<TextFieldValue, Unit> function13 = function12;
                                                final boolean z18 = z162;
                                                boolean z19 = z9;
                                                TextStyle textStyle5 = textStyleMerge2;
                                                KeyboardOptions keyboardOptions5 = keyboardOptions2;
                                                KeyboardActions keyboardActions5 = keyboardActions2;
                                                final boolean z20 = z7;
                                                int i50 = i37;
                                                int i51 = i38;
                                                final VisualTransformation visualTransformation4 = visualTransformation2;
                                                final InteractionSource3 interactionSource38 = interactionSource372;
                                                final boolean z21 = z8;
                                                final Function2<? super Composer, ? super Integer, Unit> function2272 = function28;
                                                final Function2<? super Composer, ? super Integer, Unit> function228 = function215;
                                                final Function2<? super Composer, ? super Integer, Unit> function229 = function210;
                                                final Function2<? super Composer, ? super Integer, Unit> function230 = function211;
                                                final Function2<? super Composer, ? super Integer, Unit> function231 = function212;
                                                final Function2<? super Composer, ? super Integer, Unit> function232 = function213;
                                                final Function2<? super Composer, ? super Integer, Unit> function233 = function214;
                                                final TextFieldColors textFieldColors3 = textFieldColorsColors;
                                                final Shape shape5 = shape2;
                                                BasicTextFieldKt.BasicTextField(textFieldValue3, function13, modifierM5154defaultMinSizeVpY3zN4, z18, z19, textStyle5, keyboardOptions5, keyboardActions5, z20, i50, i51, visualTransformation4, (Function1<? super TextLayoutResult, Unit>) null, interactionSource38, solidColor, ComposableLambda3.rememberComposableLambda(-757328870, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.3.3
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    {
                                                        super(3);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function3
                                                    public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function234, Composer composer4, Integer num) {
                                                        invoke((Function2<? super Composer, ? super Integer, Unit>) function234, composer4, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void invoke(Function2<? super Composer, ? super Integer, Unit> function234, Composer composer4, int i52) {
                                                        int i53;
                                                        if ((i52 & 6) == 0) {
                                                            i53 = i52 | (composer4.changedInstance(function234) ? 4 : 2);
                                                        } else {
                                                            i53 = i52;
                                                        }
                                                        if ((i53 & 19) != 18 || !composer4.getSkipping()) {
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(-757328870, i53, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:416)");
                                                            }
                                                            OutlinedTextFieldDefaults outlinedTextFieldDefaults2 = OutlinedTextFieldDefaults.INSTANCE;
                                                            String text = textFieldValue3.getText();
                                                            final boolean z22 = z18;
                                                            boolean z23 = z20;
                                                            VisualTransformation visualTransformation5 = visualTransformation4;
                                                            final InteractionSource3 interactionSource39 = interactionSource38;
                                                            final boolean z24 = z21;
                                                            Function2<Composer, Integer, Unit> function235 = function2272;
                                                            Function2<Composer, Integer, Unit> function236 = function228;
                                                            Function2<Composer, Integer, Unit> function237 = function229;
                                                            Function2<Composer, Integer, Unit> function238 = function230;
                                                            Function2<Composer, Integer, Unit> function239 = function231;
                                                            Function2<Composer, Integer, Unit> function240 = function232;
                                                            Function2<Composer, Integer, Unit> function241 = function233;
                                                            final TextFieldColors textFieldColors4 = textFieldColors3;
                                                            final Shape shape6 = shape5;
                                                            outlinedTextFieldDefaults2.DecorationBox(text, function234, z22, z23, visualTransformation5, interactionSource39, z24, function235, function236, function237, function238, function239, function240, function241, textFieldColors4, null, ComposableLambda3.rememberComposableLambda(255570733, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.3.3.1
                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                {
                                                                    super(2);
                                                                }

                                                                @Override // kotlin.jvm.functions.Function2
                                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                                    invoke(composer5, num.intValue());
                                                                    return Unit.INSTANCE;
                                                                }

                                                                public final void invoke(Composer composer5, int i54) {
                                                                    if ((i54 & 3) != 2 || !composer5.getSkipping()) {
                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                            ComposerKt.traceEventStart(255570733, i54, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous>.<anonymous> (OutlinedTextField.kt:433)");
                                                                        }
                                                                        OutlinedTextFieldDefaults.INSTANCE.m5906Container4EFweAY(z22, z24, interactionSource39, null, textFieldColors4, shape6, 0.0f, 0.0f, composer5, 100663296, 200);
                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                            ComposerKt.traceEventEnd();
                                                                            return;
                                                                        }
                                                                        return;
                                                                    }
                                                                    composer5.skipToGroupEnd();
                                                                }
                                                            }, composer4, 54), composer4, (i53 << 3) & 112, 14155776, 32768);
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        composer4.skipToGroupEnd();
                                                    }
                                                }, composer3, 54), composer3, 0, 196608, 4096);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer3.skipToGroupEnd();
                                        }
                                    }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    textStyle4 = textStyle3;
                                    composer2 = composerStartRestartGroup;
                                    function216 = function28;
                                    z10 = z8;
                                    z11 = z162;
                                    z12 = z9;
                                    keyboardOptions3 = keyboardOptions2;
                                    keyboardActions3 = keyboardActions2;
                                    z13 = z7;
                                    i41 = i37;
                                    i42 = i38;
                                    visualTransformation3 = visualTransformation2;
                                    function217 = function215;
                                    function218 = function211;
                                    function219 = function212;
                                    function220 = function213;
                                    shape3 = shape2;
                                    interactionSource34 = interactionSource32;
                                    textFieldColors2 = textFieldColorsColors;
                                    function221 = function214;
                                }
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                            }
                        }
                        i15 = i14;
                        i16 = i6 & 1024;
                        if (i16 == 0) {
                        }
                        i19 = i6 & 2048;
                        if (i19 == 0) {
                        }
                        int i442 = i18;
                        i21 = i7;
                        i22 = i6 & 4096;
                        if (i22 == 0) {
                        }
                        i24 = i6 & 8192;
                        if (i24 == 0) {
                        }
                        i26 = i6 & 16384;
                        if (i26 != 0) {
                        }
                        i28 = i6 & 32768;
                        if (i28 != 0) {
                        }
                        i29 = i6 & 65536;
                        if (i29 != 0) {
                        }
                        i30 = i6 & 131072;
                        if (i30 != 0) {
                        }
                        if ((i4 & 100663296) == 0) {
                        }
                        i31 = i6 & 524288;
                        if (i31 != 0) {
                        }
                        i32 = i6 & 1048576;
                        if (i32 != 0) {
                        }
                        if ((i5 & 48) == 0) {
                        }
                        if ((i5 & 384) == 0) {
                        }
                        int i4722 = i33;
                        if ((i21 & 306783379) != 306783378) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    i13 = i12;
                    i14 = i6 & 512;
                    if (i14 != 0) {
                    }
                    i15 = i14;
                    i16 = i6 & 1024;
                    if (i16 == 0) {
                    }
                    i19 = i6 & 2048;
                    if (i19 == 0) {
                    }
                    int i4422 = i18;
                    i21 = i7;
                    i22 = i6 & 4096;
                    if (i22 == 0) {
                    }
                    i24 = i6 & 8192;
                    if (i24 == 0) {
                    }
                    i26 = i6 & 16384;
                    if (i26 != 0) {
                    }
                    i28 = i6 & 32768;
                    if (i28 != 0) {
                    }
                    i29 = i6 & 65536;
                    if (i29 != 0) {
                    }
                    i30 = i6 & 131072;
                    if (i30 != 0) {
                    }
                    if ((i4 & 100663296) == 0) {
                    }
                    i31 = i6 & 524288;
                    if (i31 != 0) {
                    }
                    i32 = i6 & 1048576;
                    if (i32 != 0) {
                    }
                    if ((i5 & 48) == 0) {
                    }
                    if ((i5 & 384) == 0) {
                    }
                    int i47222 = i33;
                    if ((i21 & 306783379) != 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                z6 = z2;
                if ((i3 & 196608) != 0) {
                }
                i10 = i6 & 64;
                if (i10 == 0) {
                }
                i11 = i6 & 128;
                if (i11 == 0) {
                }
                i12 = i6 & 256;
                if (i12 == 0) {
                }
                i13 = i12;
                i14 = i6 & 512;
                if (i14 != 0) {
                }
                i15 = i14;
                i16 = i6 & 1024;
                if (i16 == 0) {
                }
                i19 = i6 & 2048;
                if (i19 == 0) {
                }
                int i44222 = i18;
                i21 = i7;
                i22 = i6 & 4096;
                if (i22 == 0) {
                }
                i24 = i6 & 8192;
                if (i24 == 0) {
                }
                i26 = i6 & 16384;
                if (i26 != 0) {
                }
                i28 = i6 & 32768;
                if (i28 != 0) {
                }
                i29 = i6 & 65536;
                if (i29 != 0) {
                }
                i30 = i6 & 131072;
                if (i30 != 0) {
                }
                if ((i4 & 100663296) == 0) {
                }
                i31 = i6 & 524288;
                if (i31 != 0) {
                }
                i32 = i6 & 1048576;
                if (i32 != 0) {
                }
                if ((i5 & 48) == 0) {
                }
                if ((i5 & 384) == 0) {
                }
                int i472222 = i33;
                if ((i21 & 306783379) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            z5 = z;
            i9 = i6 & 16;
            if (i9 != 0) {
            }
            z6 = z2;
            if ((i3 & 196608) != 0) {
            }
            i10 = i6 & 64;
            if (i10 == 0) {
            }
            i11 = i6 & 128;
            if (i11 == 0) {
            }
            i12 = i6 & 256;
            if (i12 == 0) {
            }
            i13 = i12;
            i14 = i6 & 512;
            if (i14 != 0) {
            }
            i15 = i14;
            i16 = i6 & 1024;
            if (i16 == 0) {
            }
            i19 = i6 & 2048;
            if (i19 == 0) {
            }
            int i442222 = i18;
            i21 = i7;
            i22 = i6 & 4096;
            if (i22 == 0) {
            }
            i24 = i6 & 8192;
            if (i24 == 0) {
            }
            i26 = i6 & 16384;
            if (i26 != 0) {
            }
            i28 = i6 & 32768;
            if (i28 != 0) {
            }
            i29 = i6 & 65536;
            if (i29 != 0) {
            }
            i30 = i6 & 131072;
            if (i30 != 0) {
            }
            if ((i4 & 100663296) == 0) {
            }
            i31 = i6 & 524288;
            if (i31 != 0) {
            }
            i32 = i6 & 1048576;
            if (i32 != 0) {
            }
            if ((i5 & 48) == 0) {
            }
            if ((i5 & 384) == 0) {
            }
            int i4722222 = i33;
            if ((i21 & 306783379) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i8 = i6 & 8;
        if (i8 == 0) {
        }
        z5 = z;
        i9 = i6 & 16;
        if (i9 != 0) {
        }
        z6 = z2;
        if ((i3 & 196608) != 0) {
        }
        i10 = i6 & 64;
        if (i10 == 0) {
        }
        i11 = i6 & 128;
        if (i11 == 0) {
        }
        i12 = i6 & 256;
        if (i12 == 0) {
        }
        i13 = i12;
        i14 = i6 & 512;
        if (i14 != 0) {
        }
        i15 = i14;
        i16 = i6 & 1024;
        if (i16 == 0) {
        }
        i19 = i6 & 2048;
        if (i19 == 0) {
        }
        int i4422222 = i18;
        i21 = i7;
        i22 = i6 & 4096;
        if (i22 == 0) {
        }
        i24 = i6 & 8192;
        if (i24 == 0) {
        }
        i26 = i6 & 16384;
        if (i26 != 0) {
        }
        i28 = i6 & 32768;
        if (i28 != 0) {
        }
        i29 = i6 & 65536;
        if (i29 != 0) {
        }
        i30 = i6 & 131072;
        if (i30 != 0) {
        }
        if ((i4 & 100663296) == 0) {
        }
        i31 = i6 & 524288;
        if (i31 != 0) {
        }
        i32 = i6 & 1048576;
        if (i32 != 0) {
        }
        if ((i5 & 48) == 0) {
        }
        if ((i5 & 384) == 0) {
        }
        int i47222222 = i33;
        if ((i21 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    public static final void OutlinedTextFieldLayout(final Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> function2, final Function3<? super Modifier, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final Function2<? super Composer, ? super Integer, Unit> function24, final Function2<? super Composer, ? super Integer, Unit> function25, final Function2<? super Composer, ? super Integer, Unit> function26, final boolean z, final float f, final Function1<? super Size, Unit> function1, final Function2<? super Composer, ? super Integer, Unit> function27, Function2<? super Composer, ? super Integer, Unit> function28, PaddingValues paddingValues, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        PaddingValues paddingValues2;
        int i5;
        float f2;
        final Function2<? super Composer, ? super Integer, Unit> function29;
        Function2<? super Composer, ? super Integer, Unit> function210;
        Composer composerStartRestartGroup = composer.startRestartGroup(1408290209);
        if ((i & 6) == 0) {
            i3 = i | (composerStartRestartGroup.changed(modifier) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function22) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function23) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function24) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function25) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function26) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= composerStartRestartGroup.changed(f) ? 536870912 : 268435456;
        }
        int i6 = i3;
        if ((i2 & 6) == 0) {
            i4 = i2 | (composerStartRestartGroup.changedInstance(function1) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function27) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function28) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            paddingValues2 = paddingValues;
            i4 |= composerStartRestartGroup.changed(paddingValues2) ? 2048 : 1024;
        } else {
            paddingValues2 = paddingValues;
        }
        int i7 = i4;
        if ((i6 & 306783379) == 306783378 && (i7 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            function29 = function22;
            function210 = function28;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1408290209, i6, i7, "androidx.compose.material3.OutlinedTextFieldLayout (OutlinedTextField.kt:468)");
            }
            boolean z2 = ((i7 & 7168) == 2048) | ((i7 & 14) == 4) | ((234881024 & i6) == 67108864) | ((1879048192 & i6) == 536870912);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new OutlinedTextField2(function1, z, f, paddingValues2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            OutlinedTextField2 outlinedTextField2 = (OutlinedTextField2) objRememberedValue;
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, outlinedTextField2, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            function27.invoke(composerStartRestartGroup, Integer.valueOf((i7 >> 3) & 14));
            composerStartRestartGroup.startReplaceGroup(250370369);
            if (function23 != null) {
                Modifier modifierThen = LayoutId2.layoutId(Modifier.INSTANCE, "Leading").then(TextFieldImplKt.getIconDefaultSizeModifier());
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierThen);
                Function0<ComposeUiNode> constructor2 = companion.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion.getSetCompositeKeyHash();
                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                function23.invoke(composerStartRestartGroup, Integer.valueOf((i6 >> 12) & 14));
                composerStartRestartGroup.endNode();
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(250379492);
            if (function24 != null) {
                Modifier modifierThen2 = LayoutId2.layoutId(Modifier.INSTANCE, "Trailing").then(TextFieldImplKt.getIconDefaultSizeModifier());
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierThen2);
                Function0<ComposeUiNode> constructor3 = companion.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor3);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion.getSetCompositeKeyHash();
                if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                function24.invoke(composerStartRestartGroup, Integer.valueOf((i6 >> 15) & 14));
                composerStartRestartGroup.endNode();
            }
            composerStartRestartGroup.endReplaceGroup();
            float fCalculateStartPadding = PaddingKt.calculateStartPadding(paddingValues2, layoutDirection);
            float fCalculateEndPadding = PaddingKt.calculateEndPadding(paddingValues2, layoutDirection);
            if (function23 != null) {
                i5 = 0;
                fCalculateStartPadding = C2002Dp.m7995constructorimpl(RangesKt.coerceAtLeast(C2002Dp.m7995constructorimpl(fCalculateStartPadding - TextFieldImplKt.getHorizontalIconPadding()), C2002Dp.m7995constructorimpl(0)));
            } else {
                i5 = 0;
            }
            float fM7995constructorimpl = fCalculateStartPadding;
            if (function24 != null) {
                fCalculateEndPadding = C2002Dp.m7995constructorimpl(RangesKt.coerceAtLeast(C2002Dp.m7995constructorimpl(fCalculateEndPadding - TextFieldImplKt.getHorizontalIconPadding()), C2002Dp.m7995constructorimpl(i5)));
            }
            composerStartRestartGroup.startReplaceGroup(250410106);
            if (function25 != null) {
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(SizeKt.wrapContentHeight$default(SizeKt.m5158heightInVpY3zN4$default(LayoutId2.layoutId(Modifier.INSTANCE, "Prefix"), TextFieldImplKt.getMinTextLineHeight(), 0.0f, 2, null), null, false, 3, null), fM7995constructorimpl, 0.0f, TextFieldImplKt.getPrefixSuffixTextPadding(), 0.0f, 10, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
                Function0<ComposeUiNode> constructor4 = companion.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor4);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM6388constructorimpl4 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy3, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion.getSetCompositeKeyHash();
                if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                    composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                }
                Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                function25.invoke(composerStartRestartGroup, Integer.valueOf((i6 >> 18) & 14));
                composerStartRestartGroup.endNode();
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(250422072);
            if (function26 != null) {
                f2 = fCalculateEndPadding;
                Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(SizeKt.wrapContentHeight$default(SizeKt.m5158heightInVpY3zN4$default(LayoutId2.layoutId(Modifier.INSTANCE, "Suffix"), TextFieldImplKt.getMinTextLineHeight(), 0.0f, 2, null), null, false, 3, null), TextFieldImplKt.getPrefixSuffixTextPadding(), 0.0f, f2, 0.0f, 10, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                int currentCompositeKeyHash5 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier5 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default2);
                Function0<ComposeUiNode> constructor5 = companion.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor5);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM6388constructorimpl5 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy4, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl5, currentCompositionLocalMap5, companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion.getSetCompositeKeyHash();
                if (composerM6388constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                    composerM6388constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                    composerM6388constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                }
                Updater.m6390setimpl(composerM6388constructorimpl5, modifierMaterializeModifier5, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                function26.invoke(composerStartRestartGroup, Integer.valueOf((i6 >> 21) & 14));
                composerStartRestartGroup.endNode();
            } else {
                f2 = fCalculateEndPadding;
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierWrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.m5158heightInVpY3zN4$default(companion2, TextFieldImplKt.getMinTextLineHeight(), 0.0f, 2, null), null, false, 3, null);
            if (function25 != null) {
                fM7995constructorimpl = C2002Dp.m7995constructorimpl(0);
            }
            Modifier modifierM5146paddingqDBjuR0$default3 = PaddingKt.m5146paddingqDBjuR0$default(modifierWrapContentHeight$default, fM7995constructorimpl, 0.0f, function26 == null ? f2 : C2002Dp.m7995constructorimpl(0), 0.0f, 10, null);
            composerStartRestartGroup.startReplaceGroup(250444361);
            if (function3 != null) {
                function3.invoke(LayoutId2.layoutId(companion2, "Hint").then(modifierM5146paddingqDBjuR0$default3), composerStartRestartGroup, Integer.valueOf((i6 >> 3) & 112));
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierThen3 = LayoutId2.layoutId(companion2, "TextField").then(modifierM5146paddingqDBjuR0$default3);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy5 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), true);
            int currentCompositeKeyHash6 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier6 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierThen3);
            Function0<ComposeUiNode> constructor6 = companion.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor6);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl6 = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl6, measurePolicyMaybeCachedBoxMeasurePolicy5, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl6, currentCompositionLocalMap6, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                composerM6388constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                composerM6388constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
            }
            Updater.m6390setimpl(composerM6388constructorimpl6, modifierMaterializeModifier6, companion.getSetModifier());
            BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.INSTANCE;
            function2.invoke(composerStartRestartGroup, Integer.valueOf((i6 >> 3) & 14));
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.startReplaceGroup(250455481);
            if (function22 != null) {
                Modifier modifierLayoutId = LayoutId2.layoutId(SizeKt.wrapContentHeight$default(SizeKt.m5158heightInVpY3zN4$default(companion2, Dp2.m8007lerpMdfbLM(TextFieldImplKt.getMinTextLineHeight(), TextFieldImplKt.getMinFocusedLabelLineHeight(), f), 0.0f, 2, null), null, false, 3, null), "Label");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy6 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                int currentCompositeKeyHash7 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier7 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierLayoutId);
                Function0<ComposeUiNode> constructor7 = companion.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor7);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM6388constructorimpl7 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl7, measurePolicyMaybeCachedBoxMeasurePolicy6, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl7, currentCompositionLocalMap7, companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash7 = companion.getSetCompositeKeyHash();
                if (composerM6388constructorimpl7.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                    composerM6388constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
                    composerM6388constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash7);
                }
                Updater.m6390setimpl(composerM6388constructorimpl7, modifierMaterializeModifier7, companion.getSetModifier());
                function29 = function22;
                function29.invoke(composerStartRestartGroup, Integer.valueOf((i6 >> 9) & 14));
                composerStartRestartGroup.endNode();
            } else {
                function29 = function22;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(250473414);
            if (function28 != null) {
                Modifier modifierPadding = PaddingKt.padding(SizeKt.wrapContentHeight$default(SizeKt.m5158heightInVpY3zN4$default(LayoutId2.layoutId(companion2, "Supporting"), TextFieldImplKt.getMinSupportingTextLineHeight(), 0.0f, 2, null), null, false, 3, null), TextFieldDefaults.m6013supportingTextPaddinga9UjIt4$material3_release$default(TextFieldDefaults.INSTANCE, 0.0f, 0.0f, 0.0f, 0.0f, 15, null));
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy7 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                int currentCompositeKeyHash8 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap8 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier8 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierPadding);
                Function0<ComposeUiNode> constructor8 = companion.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor8);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM6388constructorimpl8 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl8, measurePolicyMaybeCachedBoxMeasurePolicy7, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl8, currentCompositionLocalMap8, companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash8 = companion.getSetCompositeKeyHash();
                if (composerM6388constructorimpl8.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                    composerM6388constructorimpl8.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash8));
                    composerM6388constructorimpl8.apply(Integer.valueOf(currentCompositeKeyHash8), setCompositeKeyHash8);
                }
                Updater.m6390setimpl(composerM6388constructorimpl8, modifierMaterializeModifier8, companion.getSetModifier());
                function210 = function28;
                function210.invoke(composerStartRestartGroup, Integer.valueOf((i7 >> 6) & 14));
                composerStartRestartGroup.endNode();
            } else {
                function210 = function28;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Function2<? super Composer, ? super Integer, Unit> function211 = function210;
            final PaddingValues paddingValues3 = paddingValues2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextFieldLayout.2
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

                public final void invoke(Composer composer2, int i8) {
                    OutlinedTextField.OutlinedTextFieldLayout(modifier, function2, function3, function29, function23, function24, function25, function26, z, f, function1, function27, function211, paddingValues3, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateWidth-DHJA7U0, reason: not valid java name */
    public static final int m5915calculateWidthDHJA7U0(int i, int i2, int i3, int i4, int i5, int i6, int i7, float f, long j, float f2, PaddingValues paddingValues) {
        int i8 = i3 + i4;
        int iMax = i + Math.max(i5 + i8, Math.max(i7 + i8, MathHelpers.lerp(i6, 0, f))) + i2;
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        return Math.max(iMax, Math.max(MathKt.roundToInt((i6 + (C2002Dp.m7995constructorimpl(paddingValues.mo5118calculateLeftPaddingu2uoSUM(layoutDirection) + paddingValues.mo5119calculateRightPaddingu2uoSUM(layoutDirection)) * f2)) * f), Constraints.m7977getMinWidthimpl(j)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateHeight-mKXJcVc, reason: not valid java name */
    public static final int m5914calculateHeightmKXJcVc(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, float f, long j, float f2, PaddingValues paddingValues) {
        int iMaxOf = ComparisonsKt.maxOf(i5, i7, i3, i4, MathHelpers.lerp(i6, 0, f));
        float top = paddingValues.getTop() * f2;
        return Math.max(Constraints.m7976getMinHeightimpl(j), Math.max(i, Math.max(i2, MathKt.roundToInt(MathHelpers.lerp(top, Math.max(top, i6 / 2.0f), f) + iMaxOf + (paddingValues.getBottom() * f2)))) + i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void place(Placeable.PlacementScope placementScope, int i, int i2, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, Placeable placeable7, Placeable placeable8, Placeable placeable9, float f, boolean z, float f2, LayoutDirection layoutDirection, PaddingValues paddingValues) {
        Placeable placeable10;
        boolean z2;
        int i3;
        int i4;
        Placeable.PlacementScope.m7264place70tqf50$default(placementScope, placeable8, IntOffset.INSTANCE.m8047getZeronOccac(), 0.0f, 2, null);
        int iHeightOrZero = i - TextFieldImplKt.heightOrZero(placeable9);
        int iRoundToInt = MathKt.roundToInt(paddingValues.getTop() * f2);
        int iRoundToInt2 = MathKt.roundToInt(PaddingKt.calculateStartPadding(paddingValues, layoutDirection) * f2);
        float horizontalIconPadding = TextFieldImplKt.getHorizontalIconPadding() * f2;
        if (placeable != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, Alignment.INSTANCE.getCenterVertically().align(placeable.getHeight(), iHeightOrZero), 0.0f, 4, null);
        }
        if (placeable6 != null) {
            placeable10 = placeable6;
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable10, MathKt.roundToInt(placeable == null ? 0.0f : (TextFieldImplKt.widthOrZero(placeable) - horizontalIconPadding) * (1 - f)) + iRoundToInt2, MathHelpers.lerp(z ? Alignment.INSTANCE.getCenterVertically().align(placeable6.getHeight(), iHeightOrZero) : iRoundToInt, -(placeable6.getHeight() / 2), f), 0.0f, 4, null);
        } else {
            placeable10 = placeable6;
        }
        if (placeable3 != null) {
            i4 = iRoundToInt;
            i3 = iHeightOrZero;
            z2 = z;
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, TextFieldImplKt.widthOrZero(placeable), place$calculateVerticalPosition(z, iHeightOrZero, iRoundToInt, placeable10, placeable3), 0.0f, 4, null);
        } else {
            z2 = z;
            i3 = iHeightOrZero;
            i4 = iRoundToInt;
        }
        int iWidthOrZero = TextFieldImplKt.widthOrZero(placeable) + TextFieldImplKt.widthOrZero(placeable3);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, iWidthOrZero, place$calculateVerticalPosition(z2, i3, i4, placeable10, placeable5), 0.0f, 4, null);
        if (placeable7 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable7, iWidthOrZero, place$calculateVerticalPosition(z2, i3, i4, placeable10, placeable7), 0.0f, 4, null);
        }
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, (i2 - TextFieldImplKt.widthOrZero(placeable2)) - placeable4.getWidth(), place$calculateVerticalPosition(z2, i3, i4, placeable10, placeable4), 0.0f, 4, null);
        }
        if (placeable2 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, i2 - placeable2.getWidth(), Alignment.INSTANCE.getCenterVertically().align(placeable2.getHeight(), i3), 0.0f, 4, null);
        }
        if (placeable9 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable9, 0, i3, 0.0f, 4, null);
        }
    }

    private static final int place$calculateVerticalPosition(boolean z, int i, int i2, Placeable placeable, Placeable placeable2) {
        if (z) {
            i2 = Alignment.INSTANCE.getCenterVertically().align(placeable2.getHeight(), i);
        }
        return Math.max(i2, TextFieldImplKt.heightOrZero(placeable) / 2);
    }

    public static final Modifier outlineCutout(Modifier modifier, final Function0<Size> function0, final PaddingValues paddingValues) {
        return DrawModifierKt.drawWithContent(modifier, new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.outlineCutout.1

            /* compiled from: OutlinedTextField.kt */
            @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
            /* renamed from: androidx.compose.material3.OutlinedTextFieldKt$outlineCutout$1$WhenMappings */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[LayoutDirection.values().length];
                    try {
                        iArr[LayoutDirection.Rtl.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                invoke2(contentDrawScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ContentDrawScope contentDrawScope) {
                float fCoerceAtLeast;
                long packedValue = function0.invoke().getPackedValue();
                float fM6583getWidthimpl = Size.m6583getWidthimpl(packedValue);
                if (fM6583getWidthimpl > 0.0f) {
                    float fMo5016toPx0680j_4 = contentDrawScope.mo5016toPx0680j_4(OutlinedTextField.OutlinedTextFieldInnerPadding);
                    float fMo5016toPx0680j_42 = contentDrawScope.mo5016toPx0680j_4(paddingValues.mo5118calculateLeftPaddingu2uoSUM(contentDrawScope.getLayoutDirection())) - fMo5016toPx0680j_4;
                    float f = 2;
                    float fM6583getWidthimpl2 = fM6583getWidthimpl + fMo5016toPx0680j_42 + (fMo5016toPx0680j_4 * f);
                    LayoutDirection layoutDirection = contentDrawScope.getLayoutDirection();
                    int[] iArr = WhenMappings.$EnumSwitchMapping$0;
                    if (iArr[layoutDirection.ordinal()] == 1) {
                        fCoerceAtLeast = Size.m6583getWidthimpl(contentDrawScope.mo6963getSizeNHjbRc()) - fM6583getWidthimpl2;
                    } else {
                        fCoerceAtLeast = RangesKt.coerceAtLeast(fMo5016toPx0680j_42, 0.0f);
                    }
                    float f2 = fCoerceAtLeast;
                    if (iArr[contentDrawScope.getLayoutDirection().ordinal()] == 1) {
                        fM6583getWidthimpl2 = Size.m6583getWidthimpl(contentDrawScope.mo6963getSizeNHjbRc()) - RangesKt.coerceAtLeast(fMo5016toPx0680j_42, 0.0f);
                    }
                    float f3 = fM6583getWidthimpl2;
                    float fM6580getHeightimpl = Size.m6580getHeightimpl(packedValue);
                    float f4 = (-fM6580getHeightimpl) / f;
                    float f5 = fM6580getHeightimpl / f;
                    int iM6699getDifferencertfAjoo = ClipOp.INSTANCE.m6699getDifferencertfAjoo();
                    DrawContext drawContext = contentDrawScope.getDrawContext();
                    long jMo6936getSizeNHjbRc = drawContext.mo6936getSizeNHjbRc();
                    drawContext.getCanvas().save();
                    try {
                        drawContext.getTransform().mo6939clipRectN_I0leg(f2, f4, f3, f5, iM6699getDifferencertfAjoo);
                        contentDrawScope.drawContent();
                        return;
                    } finally {
                        drawContext.getCanvas().restore();
                        drawContext.mo6937setSizeuvyYCjk(jMo6936getSizeNHjbRc);
                    }
                }
                contentDrawScope.drawContent();
            }
        });
    }

    public static final long getOutlinedTextFieldTopPadding() {
        return OutlinedTextFieldTopPadding;
    }

    static {
        long jM6311getBodySmallLineHeightXSAIIZE = TypeScaleTokens.INSTANCE.m6311getBodySmallLineHeightXSAIIZE();
        TextUnit2.m8082checkArithmeticR2X_6o(jM6311getBodySmallLineHeightXSAIIZE);
        OutlinedTextFieldTopPadding = TextUnit2.pack(TextUnit.m8072getRawTypeimpl(jM6311getBodySmallLineHeightXSAIIZE), TextUnit.m8074getValueimpl(jM6311getBodySmallLineHeightXSAIIZE) / 2);
    }
}
