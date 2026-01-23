package androidx.compose.material3.internal;

import androidx.compose.animation.ColorVectorConverter;
import androidx.compose.animation.SingleValueAnimation;
import androidx.compose.animation.core.AnimateAsState;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVectors2;
import androidx.compose.animation.core.Easing3;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStroke2;
import androidx.compose.foundation.interaction.FocusInteraction3;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ContentColor3;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.OutlinedTextField;
import androidx.compose.material3.TextField2;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.Typography;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.CacheDrawScope;
import androidx.compose.p011ui.draw.DrawModifierKt;
import androidx.compose.p011ui.draw.DrawResult;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Color3;
import androidx.compose.p011ui.graphics.GraphicsLayerModifier6;
import androidx.compose.p011ui.graphics.GraphicsLayerScope;
import androidx.compose.p011ui.graphics.Outline;
import androidx.compose.p011ui.graphics.Outline2;
import androidx.compose.p011ui.graphics.Shape;
import androidx.compose.p011ui.graphics.colorspace.ColorSpace;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.layout.IntrinsicMeasurable;
import androidx.compose.p011ui.layout.LayoutId2;
import androidx.compose.p011ui.layout.LayoutId4;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.TextStyle2;
import androidx.compose.p011ui.text.input.TransformedText;
import androidx.compose.p011ui.text.input.VisualTransformation;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Constraints2;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: TextFieldImpl.kt */
@Metadata(m3635d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u001aõ\u0001\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a0\u0010$\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0003ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001a(\u0010$\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001d2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0003ø\u0001\u0000¢\u0006\u0004\b%\u0010&\u001a#\u0010)\u001a\u00020'*\u00020'2\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010(\u001a\u00020\u0002H\u0000¢\u0006\u0004\b)\u0010*\u001a#\u0010/\u001a\u00020'*\u00020'2\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-H\u0000¢\u0006\u0004\b/\u00100\u001a\u0019\u00104\u001a\u0002032\b\u00102\u001a\u0004\u0018\u000101H\u0000¢\u0006\u0004\b4\u00105\u001a\u0019\u00106\u001a\u0002032\b\u00102\u001a\u0004\u0018\u000101H\u0000¢\u0006\u0004\b6\u00105\u001aH\u0010?\u001a\b\u0012\u0004\u0012\u00020<0;2\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u00107\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u00109\u001a\u0002082\u0006\u0010:\u001a\u000208H\u0001ø\u0001\u0000¢\u0006\u0004\b=\u0010>\"\u001a\u0010A\u001a\u00020@8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u001a\u0010E\u001a\u0002088\u0000X\u0080\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u001a\u0010I\u001a\u0002088\u0000X\u0080\u0004¢\u0006\f\n\u0004\bI\u0010F\u001a\u0004\bJ\u0010H\"\u001a\u0010K\u001a\u0002088\u0000X\u0080\u0004¢\u0006\f\n\u0004\bK\u0010F\u001a\u0004\bL\u0010H\"\u001a\u0010M\u001a\u0002088\u0000X\u0080\u0004¢\u0006\f\n\u0004\bM\u0010F\u001a\u0004\bN\u0010H\"\u001a\u0010O\u001a\u0002088\u0000X\u0080\u0004¢\u0006\f\n\u0004\bO\u0010F\u001a\u0004\bP\u0010H\"\u001a\u0010Q\u001a\u0002088\u0000X\u0080\u0004¢\u0006\f\n\u0004\bQ\u0010F\u001a\u0004\bR\u0010H\"\u001a\u0010S\u001a\u0002088\u0000X\u0080\u0004¢\u0006\f\n\u0004\bS\u0010F\u001a\u0004\bT\u0010H\"\u001a\u0010U\u001a\u00020'8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u001a\u0010]\u001a\u0004\u0018\u00010Z*\u00020Y8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\\\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006`²\u0006\f\u0010^\u001a\u00020\u00108\nX\u008a\u0084\u0002²\u0006\f\u0010_\u001a\u00020\u00108\nX\u008a\u0084\u0002"}, m3636d2 = {"Landroidx/compose/material3/internal/TextFieldType;", "type", "", "value", "Lkotlin/Function0;", "", "innerTextField", "Landroidx/compose/ui/text/input/VisualTransformation;", "visualTransformation", AnnotatedPrivateKey.LABEL, "placeholder", "leadingIcon", "trailingIcon", "prefix", "suffix", "supportingText", "", "singleLine", "enabled", "isError", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "Landroidx/compose/material3/TextFieldColors;", "colors", "container", "CommonDecorationBox", "(Landroidx/compose/material3/internal/TextFieldType;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/material3/TextFieldColors;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/ui/graphics/Color;", "contentColor", "Landroidx/compose/ui/text/TextStyle;", "textStyle", "content", "Decoration-3J-VO9M", "(JLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Decoration", "Decoration-Iv8Zu3U", "(JLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/Modifier;", "defaultErrorMessage", "defaultErrorSemantics", "(Landroidx/compose/ui/Modifier;ZLjava/lang/String;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/graphics/ColorProducer;", ResourceTypes.COLOR, "Landroidx/compose/ui/graphics/Shape;", "shape", "textFieldBackground", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/layout/Placeable;", "placeable", "", "widthOrZero", "(Landroidx/compose/ui/layout/Placeable;)I", "heightOrZero", "focused", "Landroidx/compose/ui/unit/Dp;", "focusedBorderThickness", "unfocusedBorderThickness", "Landroidx/compose/runtime/State;", "Landroidx/compose/foundation/BorderStroke;", "animateBorderStrokeAsState-NuRrP5Q", "(ZZZLandroidx/compose/material3/TextFieldColors;FFLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "animateBorderStrokeAsState", "Landroidx/compose/ui/unit/Constraints;", "ZeroConstraints", "J", "getZeroConstraints", "()J", "TextFieldPadding", "F", "getTextFieldPadding", "()F", "HorizontalIconPadding", "getHorizontalIconPadding", "SupportingTopPadding", "getSupportingTopPadding", "PrefixSuffixTextPadding", "getPrefixSuffixTextPadding", "MinTextLineHeight", "getMinTextLineHeight", "MinFocusedLabelLineHeight", "getMinFocusedLabelLineHeight", "MinSupportingTextLineHeight", "getMinSupportingTextLineHeight", "IconDefaultSizeModifier", "Landroidx/compose/ui/Modifier;", "getIconDefaultSizeModifier", "()Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "getLayoutId", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;", "layoutId", "showPlaceholder", "showPrefixSuffix", "material3_release"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class TextFieldImplKt {
    private static final Modifier IconDefaultSizeModifier;
    private static final float MinFocusedLabelLineHeight;
    private static final float MinSupportingTextLineHeight;
    private static final float TextFieldPadding;
    private static final long ZeroConstraints = Constraints2.Constraints(0, 0, 0, 0);
    private static final float HorizontalIconPadding = C2002Dp.m7995constructorimpl(12);
    private static final float SupportingTopPadding = C2002Dp.m7995constructorimpl(4);
    private static final float PrefixSuffixTextPadding = C2002Dp.m7995constructorimpl(2);
    private static final float MinTextLineHeight = C2002Dp.m7995constructorimpl(24);

    /* compiled from: TextFieldImpl.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[TextFieldType.values().length];
            try {
                iArr[TextFieldType.Filled.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextFieldType.Outlined.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[InputPhase.values().length];
            try {
                iArr2[InputPhase.Focused.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[InputPhase.UnfocusedEmpty.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[InputPhase.UnfocusedNotEmpty.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Decoration-3J-VO9M, reason: not valid java name */
    public static final void m6096Decoration3JVO9M(long j, TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        final long j2;
        final TextStyle textStyle2;
        final Function2<? super Composer, ? super Integer, Unit> function22;
        Composer composerStartRestartGroup = composer.startRestartGroup(1208685580);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(textStyle) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            function22 = function2;
            textStyle2 = textStyle;
            j2 = j;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1208685580, i2, -1, "androidx.compose.material3.internal.Decoration (TextFieldImpl.kt:298)");
            }
            ProvideContentColorTextStyle.m6093ProvideContentColorTextStyle3JVO9M(j, textStyle, function2, composerStartRestartGroup, i2 & 1022);
            j2 = j;
            textStyle2 = textStyle;
            function22 = function2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$Decoration$1
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
                    TextFieldImplKt.m6096Decoration3JVO9M(j2, textStyle2, function22, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Decoration-Iv8Zu3U, reason: not valid java name */
    public static final void m6097DecorationIv8Zu3U(final long j, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(660142980);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(660142980, i2, -1, "androidx.compose.material3.internal.Decoration (TextFieldImpl.kt:303)");
            }
            CompositionLocal3.CompositionLocalProvider(ContentColor3.getLocalContentColor().provides(Color.m6701boximpl(j)), function2, composerStartRestartGroup, (i2 & 112) | ProvidedValue.$stable);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$Decoration$2
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
                    TextFieldImplKt.m6097DecorationIv8Zu3U(j, function2, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final Modifier defaultErrorSemantics(Modifier modifier, boolean z, final String str) {
        return z ? SemanticsModifier6.semantics$default(modifier, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt.defaultErrorSemantics.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                SemanticsPropertiesKt.error(semanticsPropertyReceiver, str);
            }
        }, 1, null) : modifier;
    }

    public static final Modifier textFieldBackground(Modifier modifier, final Color3 color3, final Shape shape) {
        return DrawModifierKt.drawWithCache(modifier, new Function1<CacheDrawScope, DrawResult>() { // from class: androidx.compose.material3.internal.TextFieldImplKt.textFieldBackground.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final DrawResult invoke(CacheDrawScope cacheDrawScope) {
                final Outline outlineMo4911createOutlinePq9zytI = shape.mo4911createOutlinePq9zytI(cacheDrawScope.m6459getSizeNHjbRc(), cacheDrawScope.getLayoutDirection(), cacheDrawScope);
                final Color3 color32 = color3;
                return cacheDrawScope.onDrawBehind(new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt.textFieldBackground.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                        invoke2(drawScope);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(DrawScope drawScope) {
                        Outline2.m6799drawOutlinewDX37Ww$default(drawScope, outlineMo4911createOutlinePq9zytI, color32.mo5580invoke0d7_KjU(), 0.0f, null, null, 0, 60, null);
                    }
                });
            }
        });
    }

    public static final int widthOrZero(Placeable placeable) {
        if (placeable != null) {
            return placeable.getWidth();
        }
        return 0;
    }

    public static final int heightOrZero(Placeable placeable) {
        if (placeable != null) {
            return placeable.getHeight();
        }
        return 0;
    }

    /* renamed from: animateBorderStrokeAsState-NuRrP5Q, reason: not valid java name */
    public static final SnapshotState4<BorderStroke> m6100animateBorderStrokeAsStateNuRrP5Q(boolean z, boolean z2, boolean z3, TextFieldColors textFieldColors, float f, float f2, Composer composer, int i) {
        SnapshotState4<Color> snapshotState4RememberUpdatedState;
        SnapshotState4<C2002Dp> snapshotState4RememberUpdatedState2;
        Composer composer2 = composer;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2047013045, i, -1, "androidx.compose.material3.internal.animateBorderStrokeAsState (TextFieldImpl.kt:441)");
        }
        long jM6002indicatorColorXeAY9LY$material3_release = textFieldColors.m6002indicatorColorXeAY9LY$material3_release(z, z2, z3);
        if (z) {
            composer2.startReplaceGroup(1023053998);
            snapshotState4RememberUpdatedState = SingleValueAnimation.m4805animateColorAsStateeuL9pac(jM6002indicatorColorXeAY9LY$material3_release, AnimationSpecKt.tween$default(150, 0, null, 6, null), null, null, composer, 48, 12);
            composer2 = composer;
            composer2.endReplaceGroup();
        } else {
            composer2.startReplaceGroup(1023165505);
            snapshotState4RememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m6701boximpl(jM6002indicatorColorXeAY9LY$material3_release), composer2, 0);
            composer2.endReplaceGroup();
        }
        SnapshotState4<Color> snapshotState4 = snapshotState4RememberUpdatedState;
        if (z) {
            composer2.startReplaceGroup(1023269417);
            snapshotState4RememberUpdatedState2 = AnimateAsState.m4812animateDpAsStateAjpBEmI(z3 ? f : f2, AnimationSpecKt.tween$default(150, 0, null, 6, null), null, null, composer2, 48, 12);
            composer2.endReplaceGroup();
        } else {
            composer2.startReplaceGroup(1023478388);
            snapshotState4RememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(C2002Dp.m7993boximpl(f2), composer2, (i >> 15) & 14);
            composer2.endReplaceGroup();
        }
        SnapshotState4<BorderStroke> snapshotState4RememberUpdatedState3 = SnapshotStateKt.rememberUpdatedState(BorderStroke2.m4886BorderStrokecXLIe8U(snapshotState4RememberUpdatedState2.getValue().getValue(), snapshotState4.getValue().getValue()), composer2, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return snapshotState4RememberUpdatedState3;
    }

    public static final Object getLayoutId(IntrinsicMeasurable intrinsicMeasurable) {
        Object parentData = intrinsicMeasurable.getParentData();
        LayoutId4 layoutId4 = parentData instanceof LayoutId4 ? (LayoutId4) parentData : null;
        if (layoutId4 != null) {
            return layoutId4.getLayoutId();
        }
        return null;
    }

    static {
        float f = 16;
        TextFieldPadding = C2002Dp.m7995constructorimpl(f);
        MinFocusedLabelLineHeight = C2002Dp.m7995constructorimpl(f);
        MinSupportingTextLineHeight = C2002Dp.m7995constructorimpl(f);
        float f2 = 48;
        IconDefaultSizeModifier = SizeKt.m5154defaultMinSizeVpY3zN4(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(f2), C2002Dp.m7995constructorimpl(f2));
    }

    public static final long getZeroConstraints() {
        return ZeroConstraints;
    }

    public static final float getTextFieldPadding() {
        return TextFieldPadding;
    }

    public static final float getHorizontalIconPadding() {
        return HorizontalIconPadding;
    }

    public static final float getSupportingTopPadding() {
        return SupportingTopPadding;
    }

    public static final float getPrefixSuffixTextPadding() {
        return PrefixSuffixTextPadding;
    }

    public static final float getMinTextLineHeight() {
        return MinTextLineHeight;
    }

    public static final float getMinFocusedLabelLineHeight() {
        return MinFocusedLabelLineHeight;
    }

    public static final float getMinSupportingTextLineHeight() {
        return MinSupportingTextLineHeight;
    }

    public static final Modifier getIconDefaultSizeModifier() {
        return IconDefaultSizeModifier;
    }

    private static final boolean CommonDecorationBox$lambda$15$lambda$7(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue().booleanValue();
    }

    private static final boolean CommonDecorationBox$lambda$15$lambda$9(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue().booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0572  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x058b  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0591  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x05c8  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x05ec  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0636  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0644  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x064f  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0663  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x066b  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0690  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x069e  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x06a1  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x06a9  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x06c9  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x06d7  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x06df  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0725  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x072f  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0739  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x0755  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x0779  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x0784  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x07a2  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x07ad  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x07eb  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x07f3  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x082d  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x0875  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x088d  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x08d5  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x0912  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x0927  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x092c  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x094a  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x0952  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x0976  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x0979  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x0994  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x0a31  */
    /* JADX WARN: Removed duplicated region for block: B:498:0x0a82  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x0a98  */
    /* JADX WARN: Removed duplicated region for block: B:504:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CommonDecorationBox(final TextFieldType textFieldType, final String str, final Function2<? super Composer, ? super Integer, Unit> function2, final VisualTransformation visualTransformation, final Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, Function2<? super Composer, ? super Integer, Unit> function26, Function2<? super Composer, ? super Integer, Unit> function27, Function2<? super Composer, ? super Integer, Unit> function28, boolean z, boolean z2, boolean z3, final InteractionSource interactionSource, final PaddingValues paddingValues, final TextFieldColors textFieldColors, final Function2<? super Composer, ? super Integer, Unit> function29, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
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
        int i20;
        int i21;
        boolean z4;
        Object objRememberedValue;
        long jM6003labelColorXeAY9LY$material3_release;
        boolean z5;
        long jM7661getColor0d7_KjU;
        long jM7661getColor0d7_KjU2;
        boolean z6;
        int i22;
        int i23;
        float f;
        int[] iArr;
        Float f2;
        InputPhase inputPhase;
        int i24;
        float f3;
        SnapshotState4 snapshotState4;
        Transition transition;
        TwoWayConverter<Float, AnimationVectors2> twoWayConverter;
        int i25;
        float f4;
        Float f5;
        InputPhase inputPhase2;
        int i26;
        float f6;
        TwoWayConverter<Float, AnimationVectors2> twoWayConverter2;
        InputPhase inputPhase3;
        int i27;
        float f7;
        Float f8;
        InputPhase inputPhase4;
        int i28;
        final SnapshotState4 snapshotState4CreateTransitionAnimation;
        ColorSpace colorSpaceM6710getColorSpaceimpl;
        boolean zChanged;
        Object objRememberedValue2;
        InputPhase inputPhase5;
        Composer composer2;
        SnapshotState4 snapshotState42;
        Transition transition2;
        ColorSpace colorSpaceM6710getColorSpaceimpl2;
        boolean zChanged2;
        Object objRememberedValue3;
        final TextStyle textStyle;
        final TextStyle textStyle2;
        final float f9;
        ComposableLambda composableLambdaRememberComposableLambda;
        Object objRememberedValue4;
        Composer.Companion companion;
        TextStyle textStyle3;
        Function2<? super Composer, ? super Integer, Unit> function210;
        ComposableLambda composableLambdaRememberComposableLambda2;
        Object objRememberedValue5;
        SnapshotState4 snapshotState43;
        SnapshotState4 snapshotState44;
        SnapshotState4 snapshotState45;
        Function2<? super Composer, ? super Integer, Unit> function211;
        ComposableLambda composableLambdaRememberComposableLambda3;
        ComposableLambda composableLambda;
        Function2<? super Composer, ? super Integer, Unit> function212;
        ComposableLambda composableLambdaRememberComposableLambda4;
        ComposableLambda composableLambda2;
        boolean z7;
        int i29;
        ComposableLambda composableLambdaRememberComposableLambda5;
        int i30;
        boolean z8;
        final Function2<? super Composer, ? super Integer, Unit> function213;
        final Function2<? super Composer, ? super Integer, Unit> function214;
        final boolean z9;
        final Function2<? super Composer, ? super Integer, Unit> function215;
        final boolean z10;
        final boolean z11;
        final Function2<? super Composer, ? super Integer, Unit> function216;
        final Function2<? super Composer, ? super Integer, Unit> function217;
        final Function2<? super Composer, ? super Integer, Unit> function218;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1514469103);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = i | (composerStartRestartGroup.changed(textFieldType) ? 4 : 2);
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        int i31 = i4;
        if ((i3 & 4) != 0) {
            i31 |= 384;
        } else {
            if ((i & 384) == 0) {
                i31 |= composerStartRestartGroup.changedInstance(function2) ? 256 : 128;
            }
            if ((i3 & 8) == 0) {
                i31 |= 3072;
            } else if ((i & 3072) == 0) {
                i31 |= composerStartRestartGroup.changed(visualTransformation) ? 2048 : 1024;
            }
            if ((i3 & 16) == 0) {
                i31 |= 24576;
            } else if ((i & 24576) == 0) {
                i31 |= composerStartRestartGroup.changedInstance(function22) ? 16384 : 8192;
            }
            i5 = i3 & 32;
            if (i5 == 0) {
                i31 |= 196608;
            } else if ((i & 196608) == 0) {
                i31 |= composerStartRestartGroup.changedInstance(function23) ? 131072 : 65536;
            }
            i6 = i3 & 64;
            if (i6 == 0) {
                i31 |= 1572864;
            } else if ((i & 1572864) == 0) {
                i31 |= composerStartRestartGroup.changedInstance(function24) ? 1048576 : 524288;
            }
            i7 = i3 & 128;
            if (i7 == 0) {
                i31 |= 12582912;
            } else {
                if ((i & 12582912) == 0) {
                    i8 = i7;
                    i31 |= composerStartRestartGroup.changedInstance(function25) ? 8388608 : 4194304;
                }
                i9 = i3 & 256;
                if (i9 != 0) {
                    i31 |= 100663296;
                } else {
                    if ((i & 100663296) == 0) {
                        i10 = i9;
                        i31 |= composerStartRestartGroup.changedInstance(function26) ? 67108864 : 33554432;
                    }
                    i11 = i3 & 512;
                    if (i11 != 0) {
                        if ((i & 805306368) == 0) {
                            i12 = i11;
                            i31 |= composerStartRestartGroup.changedInstance(function27) ? 536870912 : 268435456;
                        }
                        i13 = i3 & 1024;
                        if (i13 != 0) {
                            i15 = i2 | 6;
                            i14 = i13;
                        } else if ((i2 & 6) == 0) {
                            i14 = i13;
                            i15 = i2 | (composerStartRestartGroup.changedInstance(function28) ? 4 : 2);
                        } else {
                            i14 = i13;
                            i15 = i2;
                        }
                        i16 = i3 & 2048;
                        if (i16 != 0) {
                            i15 |= 48;
                            i17 = i16;
                        } else if ((i2 & 48) == 0) {
                            i17 = i16;
                            i15 |= composerStartRestartGroup.changed(z) ? 32 : 16;
                        } else {
                            i17 = i16;
                        }
                        int i32 = i15;
                        i18 = i3 & 4096;
                        if (i18 != 0) {
                            i19 = i32 | 384;
                        } else {
                            int i33 = i32;
                            if ((i2 & 384) == 0) {
                                i33 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
                            }
                            i19 = i33;
                        }
                        i20 = i3 & 8192;
                        if (i20 != 0) {
                            i21 = i19 | 3072;
                        } else {
                            int i34 = i19;
                            if ((i2 & 3072) == 0) {
                                i34 |= composerStartRestartGroup.changed(z3) ? 2048 : 1024;
                            }
                            i21 = i34;
                        }
                        if ((i3 & 16384) != 0) {
                            i21 |= 24576;
                        } else if ((i2 & 24576) == 0) {
                            i21 |= composerStartRestartGroup.changed(interactionSource) ? 16384 : 8192;
                        }
                        if ((32768 & i3) != 0) {
                            i21 |= 196608;
                        } else if ((i2 & 196608) == 0) {
                            i21 |= composerStartRestartGroup.changed(paddingValues) ? 131072 : 65536;
                        }
                        if ((i3 & 65536) != 0) {
                            i21 |= 1572864;
                        } else if ((i2 & 1572864) == 0) {
                            i21 |= composerStartRestartGroup.changed(textFieldColors) ? 1048576 : 524288;
                        }
                        if ((i3 & 131072) != 0) {
                            i21 |= 12582912;
                        } else if ((i2 & 12582912) == 0) {
                            i21 |= composerStartRestartGroup.changedInstance(function29) ? 8388608 : 4194304;
                        }
                        if ((306783379 & i31) == 306783378 && (4793491 & i21) == 4793490 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            function217 = function23;
                            function215 = function24;
                            function216 = function25;
                            function213 = function26;
                            function218 = function27;
                            z11 = z;
                            z9 = z2;
                            z10 = z3;
                            composer2 = composerStartRestartGroup;
                            function214 = function28;
                        } else {
                            Function2<? super Composer, ? super Integer, Unit> function219 = i5 == 0 ? null : function23;
                            final Function2<? super Composer, ? super Integer, Unit> function220 = i6 == 0 ? null : function24;
                            Function2<? super Composer, ? super Integer, Unit> function221 = i8 == 0 ? null : function25;
                            Function2<? super Composer, ? super Integer, Unit> function222 = i10 == 0 ? null : function26;
                            Function2<? super Composer, ? super Integer, Unit> function223 = i12 == 0 ? null : function27;
                            final Function2<? super Composer, ? super Integer, Unit> function224 = function219;
                            final Function2<? super Composer, ? super Integer, Unit> function225 = i14 == 0 ? null : function28;
                            boolean z12 = i17 == 0 ? false : z;
                            boolean z13 = i18 == 0 ? true : z2;
                            boolean z14 = i20 == 0 ? false : z3;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1514469103, i31, i21, "androidx.compose.material3.internal.CommonDecorationBox (TextFieldImpl.kt:96)");
                            }
                            int i35 = i21;
                            z4 = ((i31 & 7168) != 2048) | ((i31 & 112) != 32);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!z4 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = visualTransformation.filter(new AnnotatedString(str, null, null, 6, null));
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            String text = ((TransformedText) objRememberedValue).getText().getText();
                            boolean zBooleanValue = FocusInteraction3.collectIsFocusedAsState(interactionSource, composerStartRestartGroup, (i35 >> 12) & 14).getValue().booleanValue();
                            InputPhase inputPhase6 = !zBooleanValue ? InputPhase.Focused : text.length() == 0 ? InputPhase.UnfocusedEmpty : InputPhase.UnfocusedNotEmpty;
                            jM6003labelColorXeAY9LY$material3_release = textFieldColors.m6003labelColorXeAY9LY$material3_release(z13, z14, zBooleanValue);
                            Typography typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                            TextStyle bodyLarge = typography.getBodyLarge();
                            final TextStyle bodySmall = typography.getBodySmall();
                            final Function2<? super Composer, ? super Integer, Unit> function226 = function221;
                            long jM7661getColor0d7_KjU3 = bodyLarge.m7661getColor0d7_KjU();
                            Color.Companion companion2 = Color.INSTANCE;
                            z5 = (Color.m6707equalsimpl0(jM7661getColor0d7_KjU3, companion2.m6726getUnspecified0d7_KjU()) && !Color.m6707equalsimpl0(bodySmall.m7661getColor0d7_KjU(), companion2.m6726getUnspecified0d7_KjU())) || (!Color.m6707equalsimpl0(bodyLarge.m7661getColor0d7_KjU(), companion2.m6726getUnspecified0d7_KjU()) && Color.m6707equalsimpl0(bodySmall.m7661getColor0d7_KjU(), companion2.m6726getUnspecified0d7_KjU()));
                            jM7661getColor0d7_KjU = bodySmall.m7661getColor0d7_KjU();
                            if (z5 && jM7661getColor0d7_KjU == 16) {
                                jM7661getColor0d7_KjU = jM6003labelColorXeAY9LY$material3_release;
                            }
                            jM7661getColor0d7_KjU2 = bodyLarge.m7661getColor0d7_KjU();
                            if (z5 && jM7661getColor0d7_KjU2 == 16) {
                                jM7661getColor0d7_KjU2 = jM6003labelColorXeAY9LY$material3_release;
                            }
                            boolean z15 = function22 != null;
                            final boolean z16 = z5;
                            long j = jM7661getColor0d7_KjU;
                            Transition transitionUpdateTransition = TransitionKt.updateTransition(inputPhase6, "TextFieldInputState", composerStartRestartGroup, 48, 0);
                            TextFieldImplKt$TextFieldTransitionScope$labelProgress$1 textFieldImplKt$TextFieldTransitionScope$labelProgress$1 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$TextFieldTransitionScope$labelProgress$1
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer3, Integer num) {
                                    return invoke(segment, composer3, num.intValue());
                                }

                                public final FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer3, int i36) {
                                    composer3.startReplaceGroup(1276209157);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1276209157, i36, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:354)");
                                    }
                                    TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(150, 0, null, 6, null);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    composer3.endReplaceGroup();
                                    return tweenSpecTween$default;
                                }
                            };
                            FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
                            TwoWayConverter<Float, AnimationVectors2> vectorConverter = VectorConvertersKt.getVectorConverter(floatCompanionObject);
                            InputPhase inputPhase7 = (InputPhase) transitionUpdateTransition.getCurrentState();
                            composerStartRestartGroup.startReplaceGroup(-2036730335);
                            if (ComposerKt.isTraceInProgress()) {
                                z6 = z15;
                                i22 = i31;
                                ComposerKt.traceEventStart(-2036730335, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)");
                            } else {
                                z6 = z15;
                                i22 = i31;
                            }
                            int[] iArr2 = WhenMappings.$EnumSwitchMapping$1;
                            i23 = iArr2[inputPhase7.ordinal()];
                            float f10 = 1.0f;
                            if (i23 == 1) {
                                f = 1.0f;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                Float fValueOf = Float.valueOf(f);
                                InputPhase inputPhase8 = (InputPhase) transitionUpdateTransition.getTargetState();
                                composerStartRestartGroup.startReplaceGroup(-2036730335);
                                if (ComposerKt.isTraceInProgress()) {
                                    iArr = iArr2;
                                    f2 = fValueOf;
                                    inputPhase = inputPhase8;
                                    ComposerKt.traceEventStart(-2036730335, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)");
                                } else {
                                    iArr = iArr2;
                                    f2 = fValueOf;
                                    inputPhase = inputPhase8;
                                }
                                i24 = iArr[inputPhase.ordinal()];
                                if (i24 == 1) {
                                    f3 = 1.0f;
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    SnapshotState4 snapshotState4CreateTransitionAnimation2 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, f2, Float.valueOf(f3), textFieldImplKt$TextFieldTransitionScope$labelProgress$1.invoke((TextFieldImplKt$TextFieldTransitionScope$labelProgress$1) transitionUpdateTransition.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), vectorConverter, "LabelProgress", composerStartRestartGroup, 196608);
                                    TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1 textFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer3, Integer num) {
                                            return invoke(segment, composer3, num.intValue());
                                        }

                                        public final FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer3, int i36) {
                                            FiniteAnimationSpec<Float> finiteAnimationSpecTween;
                                            composer3.startReplaceGroup(-1154662212);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1154662212, i36, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:367)");
                                            }
                                            InputPhase inputPhase9 = InputPhase.Focused;
                                            InputPhase inputPhase10 = InputPhase.UnfocusedEmpty;
                                            if (segment.isTransitioningTo(inputPhase9, inputPhase10)) {
                                                finiteAnimationSpecTween = AnimationSpecKt.tween$default(67, 0, Easing3.getLinearEasing(), 2, null);
                                            } else if (segment.isTransitioningTo(inputPhase10, inputPhase9) || segment.isTransitioningTo(InputPhase.UnfocusedNotEmpty, inputPhase10)) {
                                                finiteAnimationSpecTween = AnimationSpecKt.tween(83, 67, Easing3.getLinearEasing());
                                            } else {
                                                finiteAnimationSpecTween = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                            composer3.endReplaceGroup();
                                            return finiteAnimationSpecTween;
                                        }
                                    };
                                    TwoWayConverter<Float, AnimationVectors2> vectorConverter2 = VectorConvertersKt.getVectorConverter(floatCompanionObject);
                                    InputPhase inputPhase9 = (InputPhase) transitionUpdateTransition.getCurrentState();
                                    composerStartRestartGroup.startReplaceGroup(1435837472);
                                    if (ComposerKt.isTraceInProgress()) {
                                        snapshotState4 = snapshotState4CreateTransitionAnimation2;
                                        transition = transitionUpdateTransition;
                                        twoWayConverter = vectorConverter2;
                                        ComposerKt.traceEventStart(1435837472, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)");
                                    } else {
                                        snapshotState4 = snapshotState4CreateTransitionAnimation2;
                                        transition = transitionUpdateTransition;
                                        twoWayConverter = vectorConverter2;
                                    }
                                    i25 = iArr[inputPhase9.ordinal()];
                                    if (i25 == 1) {
                                        f4 = 1.0f;
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                        Float fValueOf2 = Float.valueOf(f4);
                                        InputPhase inputPhase10 = (InputPhase) transition.getTargetState();
                                        composerStartRestartGroup.startReplaceGroup(1435837472);
                                        if (ComposerKt.isTraceInProgress()) {
                                            f5 = fValueOf2;
                                            inputPhase2 = inputPhase10;
                                            ComposerKt.traceEventStart(1435837472, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)");
                                        } else {
                                            f5 = fValueOf2;
                                            inputPhase2 = inputPhase10;
                                        }
                                        i26 = iArr[inputPhase2.ordinal()];
                                        if (i26 == 1) {
                                            f6 = 1.0f;
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                            composerStartRestartGroup.endReplaceGroup();
                                            Transition transition3 = transition;
                                            final SnapshotState4 snapshotState4CreateTransitionAnimation3 = TransitionKt.createTransitionAnimation(transition3, f5, Float.valueOf(f6), textFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1.invoke((TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1) transition.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), twoWayConverter, "PlaceholderOpacity", composerStartRestartGroup, 196608);
                                            TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1 textFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1
                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer3, Integer num) {
                                                    return invoke(segment, composer3, num.intValue());
                                                }

                                                public final FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer3, int i36) {
                                                    composer3.startReplaceGroup(-1868044898);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-1868044898, i36, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:396)");
                                                    }
                                                    TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(150, 0, null, 6, null);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                    composer3.endReplaceGroup();
                                                    return tweenSpecTween$default;
                                                }
                                            };
                                            TwoWayConverter<Float, AnimationVectors2> vectorConverter3 = VectorConvertersKt.getVectorConverter(floatCompanionObject);
                                            InputPhase inputPhase11 = (InputPhase) transition3.getCurrentState();
                                            composerStartRestartGroup.startReplaceGroup(1128033978);
                                            if (ComposerKt.isTraceInProgress()) {
                                                twoWayConverter2 = vectorConverter3;
                                                inputPhase3 = inputPhase11;
                                                ComposerKt.traceEventStart(1128033978, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)");
                                            } else {
                                                twoWayConverter2 = vectorConverter3;
                                                inputPhase3 = inputPhase11;
                                            }
                                            i27 = iArr[inputPhase3.ordinal()];
                                            if (i27 == 1) {
                                                f7 = 1.0f;
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                                composerStartRestartGroup.endReplaceGroup();
                                                Float fValueOf3 = Float.valueOf(f7);
                                                InputPhase inputPhase12 = (InputPhase) transition3.getTargetState();
                                                composerStartRestartGroup.startReplaceGroup(1128033978);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    f8 = fValueOf3;
                                                    inputPhase4 = inputPhase12;
                                                    ComposerKt.traceEventStart(1128033978, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)");
                                                } else {
                                                    f8 = fValueOf3;
                                                    inputPhase4 = inputPhase12;
                                                }
                                                i28 = iArr[inputPhase4.ordinal()];
                                                if (i28 != 1) {
                                                    if (i28 != 2) {
                                                        if (i28 != 3) {
                                                            throw new NoWhenBranchMatchedException();
                                                        }
                                                    } else if (z6) {
                                                        f10 = 0.0f;
                                                    }
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                                composerStartRestartGroup.endReplaceGroup();
                                                snapshotState4CreateTransitionAnimation = TransitionKt.createTransitionAnimation(transition3, f8, Float.valueOf(f10), textFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1.invoke((TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1) transition3.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), twoWayConverter2, "PrefixSuffixOpacity", composerStartRestartGroup, 196608);
                                                TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1 textFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Color>>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1
                                                    @Override // kotlin.jvm.functions.Function3
                                                    public /* bridge */ /* synthetic */ FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer3, Integer num) {
                                                        return invoke(segment, composer3, num.intValue());
                                                    }

                                                    public final FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer3, int i36) {
                                                        composer3.startReplaceGroup(1528582156);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(1528582156, i36, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:407)");
                                                        }
                                                        TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(150, 0, null, 6, null);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                        composer3.endReplaceGroup();
                                                        return tweenSpecTween$default;
                                                    }
                                                };
                                                InputPhase inputPhase13 = (InputPhase) transition3.getTargetState();
                                                composerStartRestartGroup.startReplaceGroup(-107432127);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                                                }
                                                long j2 = iArr[inputPhase13.ordinal()] == 1 ? j : jM7661getColor0d7_KjU2;
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                                composerStartRestartGroup.endReplaceGroup();
                                                colorSpaceM6710getColorSpaceimpl = Color.m6710getColorSpaceimpl(j2);
                                                zChanged = composerStartRestartGroup.changed(colorSpaceM6710getColorSpaceimpl);
                                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                                if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue2 = (TwoWayConverter) ColorVectorConverter.getVectorConverter(companion2).invoke(colorSpaceM6710getColorSpaceimpl);
                                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                                }
                                                TwoWayConverter twoWayConverter3 = (TwoWayConverter) objRememberedValue2;
                                                InputPhase inputPhase14 = (InputPhase) transition3.getCurrentState();
                                                composerStartRestartGroup.startReplaceGroup(-107432127);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                                                }
                                                long j3 = iArr[inputPhase14.ordinal()] != 1 ? j : jM7661getColor0d7_KjU2;
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                                composerStartRestartGroup.endReplaceGroup();
                                                Color colorM6701boximpl = Color.m6701boximpl(j3);
                                                inputPhase5 = (InputPhase) transition3.getTargetState();
                                                composerStartRestartGroup.startReplaceGroup(-107432127);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                                                }
                                                if (iArr[inputPhase5.ordinal()] == 1) {
                                                    jM7661getColor0d7_KjU2 = j;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                                composerStartRestartGroup.endReplaceGroup();
                                                SnapshotState4 snapshotState4CreateTransitionAnimation4 = TransitionKt.createTransitionAnimation(transition3, colorM6701boximpl, Color.m6701boximpl(jM7661getColor0d7_KjU2), textFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1.invoke((TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1) transition3.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), twoWayConverter3, "LabelTextStyleColor", composerStartRestartGroup, 196608);
                                                composer2 = composerStartRestartGroup;
                                                TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1 textFieldImplKt$TextFieldTransitionScope$labelContentColor$1 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Color>>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1
                                                    @Override // kotlin.jvm.functions.Function3
                                                    public /* bridge */ /* synthetic */ FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer3, Integer num) {
                                                        return invoke(segment, composer3, num.intValue());
                                                    }

                                                    public final FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer3, int i36) {
                                                        composer3.startReplaceGroup(-543659263);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-543659263, i36, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:419)");
                                                        }
                                                        TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(150, 0, null, 6, null);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                        composer3.endReplaceGroup();
                                                        return tweenSpecTween$default;
                                                    }
                                                };
                                                composer2.startReplaceGroup(1023351670);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    snapshotState42 = snapshotState4CreateTransitionAnimation4;
                                                    transition2 = transition3;
                                                } else {
                                                    snapshotState42 = snapshotState4CreateTransitionAnimation4;
                                                    transition2 = transition3;
                                                    ComposerKt.traceEventStart(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                                composer2.endReplaceGroup();
                                                colorSpaceM6710getColorSpaceimpl2 = Color.m6710getColorSpaceimpl(jM6003labelColorXeAY9LY$material3_release);
                                                zChanged2 = composer2.changed(colorSpaceM6710getColorSpaceimpl2);
                                                objRememberedValue3 = composer2.rememberedValue();
                                                if (!zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue3 = (TwoWayConverter) ColorVectorConverter.getVectorConverter(companion2).invoke(colorSpaceM6710getColorSpaceimpl2);
                                                    composer2.updateRememberedValue(objRememberedValue3);
                                                }
                                                TwoWayConverter twoWayConverter4 = (TwoWayConverter) objRememberedValue3;
                                                composer2.startReplaceGroup(1023351670);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                                composer2.endReplaceGroup();
                                                Color colorM6701boximpl2 = Color.m6701boximpl(jM6003labelColorXeAY9LY$material3_release);
                                                composer2.startReplaceGroup(1023351670);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                                composer2.endReplaceGroup();
                                                final SnapshotState4 snapshotState4CreateTransitionAnimation5 = TransitionKt.createTransitionAnimation(transition2, colorM6701boximpl2, Color.m6701boximpl(jM6003labelColorXeAY9LY$material3_release), textFieldImplKt$TextFieldTransitionScope$labelContentColor$1.invoke((TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1) transition2.getSegment(), (Transition.Segment) composer2, (Composer) 0), twoWayConverter4, "LabelContentColor", composer2, 196608);
                                                final float fFloatValue = ((Number) snapshotState4.getValue()).floatValue();
                                                composer2.startReplaceGroup(-156998101);
                                                if (function22 != null) {
                                                    f9 = fFloatValue;
                                                    textStyle = bodyLarge;
                                                    textStyle2 = bodySmall;
                                                    composableLambdaRememberComposableLambda = null;
                                                } else {
                                                    textStyle = bodyLarge;
                                                    final SnapshotState4 snapshotState46 = snapshotState42;
                                                    Function2<Composer, Integer, Unit> function227 = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedLabel$1$1
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

                                                        public final void invoke(Composer composer3, int i36) {
                                                            if ((i36 & 3) != 2 || !composer3.getSkipping()) {
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(-1236585568, i36, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:139)");
                                                                }
                                                                TextStyle textStyleLerp = TextStyle2.lerp(textStyle, bodySmall, fFloatValue);
                                                                boolean z17 = z16;
                                                                SnapshotState4<Color> snapshotState47 = snapshotState46;
                                                                if (z17) {
                                                                    textStyleLerp = TextStyle.m7655copyp1EtxEg$default(textStyleLerp, snapshotState47.getValue().getValue(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
                                                                }
                                                                TextFieldImplKt.m6096Decoration3JVO9M(snapshotState4CreateTransitionAnimation5.getValue().getValue(), textStyleLerp, function22, composer3, 0);
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventEnd();
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            composer3.skipToGroupEnd();
                                                        }
                                                    };
                                                    textStyle2 = bodySmall;
                                                    f9 = fFloatValue;
                                                    composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-1236585568, true, function227, composer2, 54);
                                                }
                                                composer2.endReplaceGroup();
                                                final long jM6005placeholderColorXeAY9LY$material3_release = textFieldColors.m6005placeholderColorXeAY9LY$material3_release(z13, z14, zBooleanValue);
                                                objRememberedValue4 = composer2.rememberedValue();
                                                companion = Composer.INSTANCE;
                                                if (objRememberedValue4 == companion.getEmpty()) {
                                                    objRememberedValue4 = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new Function0<Boolean>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$showPlaceholder$2$1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(0);
                                                        }

                                                        /* JADX WARN: Can't rename method to resolve collision */
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Boolean invoke() {
                                                            return Boolean.valueOf(snapshotState4CreateTransitionAnimation3.getValue().floatValue() > 0.0f);
                                                        }
                                                    });
                                                    composer2.updateRememberedValue(objRememberedValue4);
                                                }
                                                SnapshotState4 snapshotState47 = (SnapshotState4) objRememberedValue4;
                                                composer2.startReplaceGroup(-156965270);
                                                if (function224 == null && text.length() == 0 && CommonDecorationBox$lambda$15$lambda$7(snapshotState47)) {
                                                    final TextStyle textStyle4 = textStyle;
                                                    textStyle3 = textStyle4;
                                                    function210 = function224;
                                                    composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(-660524084, true, new Function3<Modifier, Composer, Integer, Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedPlaceholder$1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        /* JADX WARN: Multi-variable type inference failed */
                                                        {
                                                            super(3);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function3
                                                        public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier, Composer composer3, Integer num) {
                                                            invoke(modifier, composer3, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        public final void invoke(Modifier modifier, Composer composer3, int i36) {
                                                            if ((i36 & 6) == 0) {
                                                                i36 |= composer3.changed(modifier) ? 4 : 2;
                                                            }
                                                            if ((i36 & 19) == 18 && composer3.getSkipping()) {
                                                                composer3.skipToGroupEnd();
                                                                return;
                                                            }
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(-660524084, i36, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:161)");
                                                            }
                                                            boolean zChanged3 = composer3.changed(snapshotState4CreateTransitionAnimation3);
                                                            final SnapshotState4<Float> snapshotState48 = snapshotState4CreateTransitionAnimation3;
                                                            Object objRememberedValue6 = composer3.rememberedValue();
                                                            if (zChanged3 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                                                objRememberedValue6 = new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedPlaceholder$1$1$1
                                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                    {
                                                                        super(1);
                                                                    }

                                                                    @Override // kotlin.jvm.functions.Function1
                                                                    public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                                                                        invoke2(graphicsLayerScope);
                                                                        return Unit.INSTANCE;
                                                                    }

                                                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                    public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
                                                                        graphicsLayerScope.setAlpha(snapshotState48.getValue().floatValue());
                                                                    }
                                                                };
                                                                composer3.updateRememberedValue(objRememberedValue6);
                                                            }
                                                            Modifier modifierGraphicsLayer = GraphicsLayerModifier6.graphicsLayer(modifier, (Function1) objRememberedValue6);
                                                            long j4 = jM6005placeholderColorXeAY9LY$material3_release;
                                                            TextStyle textStyle5 = textStyle4;
                                                            Function2<Composer, Integer, Unit> function228 = function224;
                                                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierGraphicsLayer);
                                                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                                            if (composer3.getApplier() == null) {
                                                                Composables.invalidApplier();
                                                            }
                                                            composer3.startReusableNode();
                                                            if (composer3.getInserting()) {
                                                                composer3.createNode(constructor);
                                                            } else {
                                                                composer3.useNode();
                                                            }
                                                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                                                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                            }
                                                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                            TextFieldImplKt.m6096Decoration3JVO9M(j4, textStyle5, function228, composer3, 0);
                                                            composer3.endNode();
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                            }
                                                        }
                                                    }, composer2, 54);
                                                } else {
                                                    textStyle3 = textStyle;
                                                    function210 = function224;
                                                    composableLambdaRememberComposableLambda2 = null;
                                                }
                                                composer2.endReplaceGroup();
                                                final long jM6006prefixColorXeAY9LY$material3_release = textFieldColors.m6006prefixColorXeAY9LY$material3_release(z13, z14, zBooleanValue);
                                                objRememberedValue5 = composer2.rememberedValue();
                                                final TextStyle textStyle5 = textStyle3;
                                                if (objRememberedValue5 == companion.getEmpty()) {
                                                    objRememberedValue5 = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new Function0<Boolean>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$showPrefixSuffix$2$1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(0);
                                                        }

                                                        /* JADX WARN: Can't rename method to resolve collision */
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Boolean invoke() {
                                                            return Boolean.valueOf(snapshotState4CreateTransitionAnimation.getValue().floatValue() > 0.0f);
                                                        }
                                                    });
                                                    composer2.updateRememberedValue(objRememberedValue5);
                                                }
                                                snapshotState43 = (SnapshotState4) objRememberedValue5;
                                                composer2.startReplaceGroup(-156940524);
                                                if (function222 == null && CommonDecorationBox$lambda$15$lambda$9(snapshotState43)) {
                                                    final Function2<? super Composer, ? super Integer, Unit> function228 = function222;
                                                    Function2<Composer, Integer, Unit> function229 = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedPrefix$1
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

                                                        public final void invoke(Composer composer3, int i36) {
                                                            if ((i36 & 3) == 2 && composer3.getSkipping()) {
                                                                composer3.skipToGroupEnd();
                                                                return;
                                                            }
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(274398694, i36, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:178)");
                                                            }
                                                            Modifier.Companion companion3 = Modifier.INSTANCE;
                                                            boolean zChanged3 = composer3.changed(snapshotState4CreateTransitionAnimation);
                                                            final SnapshotState4<Float> snapshotState48 = snapshotState4CreateTransitionAnimation;
                                                            Object objRememberedValue6 = composer3.rememberedValue();
                                                            if (zChanged3 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                                                objRememberedValue6 = new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedPrefix$1$1$1
                                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                    {
                                                                        super(1);
                                                                    }

                                                                    @Override // kotlin.jvm.functions.Function1
                                                                    public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                                                                        invoke2(graphicsLayerScope);
                                                                        return Unit.INSTANCE;
                                                                    }

                                                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                    public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
                                                                        graphicsLayerScope.setAlpha(snapshotState48.getValue().floatValue());
                                                                    }
                                                                };
                                                                composer3.updateRememberedValue(objRememberedValue6);
                                                            }
                                                            Modifier modifierGraphicsLayer = GraphicsLayerModifier6.graphicsLayer(companion3, (Function1) objRememberedValue6);
                                                            long j4 = jM6006prefixColorXeAY9LY$material3_release;
                                                            TextStyle textStyle6 = textStyle5;
                                                            Function2<Composer, Integer, Unit> function230 = function228;
                                                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierGraphicsLayer);
                                                            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                                            Function0<ComposeUiNode> constructor = companion4.getConstructor();
                                                            if (composer3.getApplier() == null) {
                                                                Composables.invalidApplier();
                                                            }
                                                            composer3.startReusableNode();
                                                            if (composer3.getInserting()) {
                                                                composer3.createNode(constructor);
                                                            } else {
                                                                composer3.useNode();
                                                            }
                                                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                                                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
                                                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                                                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                            }
                                                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                            TextFieldImplKt.m6096Decoration3JVO9M(j4, textStyle6, function230, composer3, 0);
                                                            composer3.endNode();
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                            }
                                                        }
                                                    };
                                                    snapshotState45 = snapshotState4CreateTransitionAnimation;
                                                    snapshotState44 = snapshotState43;
                                                    function211 = function228;
                                                    textStyle5 = textStyle5;
                                                    composableLambdaRememberComposableLambda3 = ComposableLambda3.rememberComposableLambda(274398694, true, function229, composer2, 54);
                                                } else {
                                                    snapshotState44 = snapshotState43;
                                                    snapshotState45 = snapshotState4CreateTransitionAnimation;
                                                    function211 = function222;
                                                    composableLambdaRememberComposableLambda3 = null;
                                                }
                                                composer2.endReplaceGroup();
                                                final long jM6007suffixColorXeAY9LY$material3_release = textFieldColors.m6007suffixColorXeAY9LY$material3_release(z13, z14, zBooleanValue);
                                                composer2.startReplaceGroup(-156921964);
                                                if (function223 == null && CommonDecorationBox$lambda$15$lambda$9(snapshotState44)) {
                                                    final TextStyle textStyle6 = textStyle5;
                                                    final SnapshotState4 snapshotState48 = snapshotState45;
                                                    final Function2<? super Composer, ? super Integer, Unit> function230 = function223;
                                                    Function2<Composer, Integer, Unit> function231 = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedSuffix$1
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

                                                        public final void invoke(Composer composer3, int i36) {
                                                            if ((i36 & 3) == 2 && composer3.getSkipping()) {
                                                                composer3.skipToGroupEnd();
                                                                return;
                                                            }
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(-1526229403, i36, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:192)");
                                                            }
                                                            Modifier.Companion companion3 = Modifier.INSTANCE;
                                                            boolean zChanged3 = composer3.changed(snapshotState48);
                                                            final SnapshotState4<Float> snapshotState49 = snapshotState48;
                                                            Object objRememberedValue6 = composer3.rememberedValue();
                                                            if (zChanged3 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                                                objRememberedValue6 = new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedSuffix$1$1$1
                                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                    {
                                                                        super(1);
                                                                    }

                                                                    @Override // kotlin.jvm.functions.Function1
                                                                    public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                                                                        invoke2(graphicsLayerScope);
                                                                        return Unit.INSTANCE;
                                                                    }

                                                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                    public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
                                                                        graphicsLayerScope.setAlpha(snapshotState49.getValue().floatValue());
                                                                    }
                                                                };
                                                                composer3.updateRememberedValue(objRememberedValue6);
                                                            }
                                                            Modifier modifierGraphicsLayer = GraphicsLayerModifier6.graphicsLayer(companion3, (Function1) objRememberedValue6);
                                                            long j4 = jM6007suffixColorXeAY9LY$material3_release;
                                                            TextStyle textStyle7 = textStyle6;
                                                            Function2<Composer, Integer, Unit> function232 = function230;
                                                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierGraphicsLayer);
                                                            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                                            Function0<ComposeUiNode> constructor = companion4.getConstructor();
                                                            if (composer3.getApplier() == null) {
                                                                Composables.invalidApplier();
                                                            }
                                                            composer3.startReusableNode();
                                                            if (composer3.getInserting()) {
                                                                composer3.createNode(constructor);
                                                            } else {
                                                                composer3.useNode();
                                                            }
                                                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                                                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
                                                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                                                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                            }
                                                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                            TextFieldImplKt.m6096Decoration3JVO9M(j4, textStyle7, function232, composer3, 0);
                                                            composer3.endNode();
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                            }
                                                        }
                                                    };
                                                    function212 = function230;
                                                    composableLambda = composableLambdaRememberComposableLambda3;
                                                    composableLambdaRememberComposableLambda4 = ComposableLambda3.rememberComposableLambda(-1526229403, true, function231, composer2, 54);
                                                } else {
                                                    composableLambda = composableLambdaRememberComposableLambda3;
                                                    function212 = function223;
                                                    composableLambdaRememberComposableLambda4 = null;
                                                }
                                                composer2.endReplaceGroup();
                                                final long jM6004leadingIconColorXeAY9LY$material3_release = textFieldColors.m6004leadingIconColorXeAY9LY$material3_release(z13, z14, zBooleanValue);
                                                composer2.startReplaceGroup(-156902962);
                                                ComposableLambda composableLambdaRememberComposableLambda6 = function220 != null ? null : ComposableLambda3.rememberComposableLambda(-130107406, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedLeading$1$1
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

                                                    public final void invoke(Composer composer3, int i36) {
                                                        if ((i36 & 3) == 2 && composer3.getSkipping()) {
                                                            composer3.skipToGroupEnd();
                                                            return;
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-130107406, i36, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:205)");
                                                        }
                                                        TextFieldImplKt.m6097DecorationIv8Zu3U(jM6004leadingIconColorXeAY9LY$material3_release, function220, composer3, 0);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    }
                                                }, composer2, 54);
                                                composer2.endReplaceGroup();
                                                final long jM6010trailingIconColorXeAY9LY$material3_release = textFieldColors.m6010trailingIconColorXeAY9LY$material3_release(z13, z14, zBooleanValue);
                                                composer2.startReplaceGroup(-156893937);
                                                if (function226 != null) {
                                                    composableLambda2 = composableLambdaRememberComposableLambda6;
                                                    z7 = true;
                                                    i29 = 54;
                                                    composableLambdaRememberComposableLambda5 = null;
                                                } else {
                                                    composableLambda2 = composableLambdaRememberComposableLambda6;
                                                    z7 = true;
                                                    i29 = 54;
                                                    composableLambdaRememberComposableLambda5 = ComposableLambda3.rememberComposableLambda(2079816678, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedTrailing$1$1
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

                                                        public final void invoke(Composer composer3, int i36) {
                                                            if ((i36 & 3) == 2 && composer3.getSkipping()) {
                                                                composer3.skipToGroupEnd();
                                                                return;
                                                            }
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(2079816678, i36, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:211)");
                                                            }
                                                            TextFieldImplKt.m6097DecorationIv8Zu3U(jM6010trailingIconColorXeAY9LY$material3_release, function226, composer3, 0);
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                            }
                                                        }
                                                    }, composer2, 54);
                                                }
                                                composer2.endReplaceGroup();
                                                final long jM6008supportingTextColorXeAY9LY$material3_release = textFieldColors.m6008supportingTextColorXeAY9LY$material3_release(z13, z14, zBooleanValue);
                                                composer2.startReplaceGroup(-156884470);
                                                ComposableLambda composableLambdaRememberComposableLambda7 = function225 != null ? null : ComposableLambda3.rememberComposableLambda(1263707005, z7, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedSupporting$1$1
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

                                                    public final void invoke(Composer composer3, int i36) {
                                                        if ((i36 & 3) != 2 || !composer3.getSkipping()) {
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(1263707005, i36, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:218)");
                                                            }
                                                            TextFieldImplKt.m6096Decoration3JVO9M(jM6008supportingTextColorXeAY9LY$material3_release, textStyle2, function225, composer3, 0);
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        composer3.skipToGroupEnd();
                                                    }
                                                }, composer2, i29);
                                                composer2.endReplaceGroup();
                                                i30 = WhenMappings.$EnumSwitchMapping$0[textFieldType.ordinal()];
                                                if (i30 != z7) {
                                                    z8 = z12;
                                                    composer2.startReplaceGroup(-568105095);
                                                    TextField2.TextFieldLayout(Modifier.INSTANCE, function2, composableLambdaRememberComposableLambda, composableLambdaRememberComposableLambda2, composableLambda2, composableLambdaRememberComposableLambda5, composableLambda, composableLambdaRememberComposableLambda4, z8, f9, ComposableLambda3.rememberComposableLambda(1750327932, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$containerWithId$1
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

                                                        public final void invoke(Composer composer3, int i36) {
                                                            if ((i36 & 3) != 2 || !composer3.getSkipping()) {
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(1750327932, i36, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:229)");
                                                                }
                                                                Modifier modifierLayoutId = LayoutId2.layoutId(Modifier.INSTANCE, "Container");
                                                                Function2<Composer, Integer, Unit> function232 = function29;
                                                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
                                                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                                                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierLayoutId);
                                                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                                                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                                                if (composer3.getApplier() == null) {
                                                                    Composables.invalidApplier();
                                                                }
                                                                composer3.startReusableNode();
                                                                if (composer3.getInserting()) {
                                                                    composer3.createNode(constructor);
                                                                } else {
                                                                    composer3.useNode();
                                                                }
                                                                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                                                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                                }
                                                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                                function232.invoke(composer3, 0);
                                                                composer3.endNode();
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventEnd();
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            composer3.skipToGroupEnd();
                                                        }
                                                    }, composer2, 54), composableLambdaRememberComposableLambda7, paddingValues, composer2, ((i22 >> 3) & 112) | 6 | ((i35 << 21) & 234881024), ((i35 >> 9) & 896) | 6);
                                                    composer2.endReplaceGroup();
                                                    Unit unit = Unit.INSTANCE;
                                                } else if (i30 != 2) {
                                                    composer2.startReplaceGroup(-565271199);
                                                    composer2.endReplaceGroup();
                                                    Unit unit2 = Unit.INSTANCE;
                                                    z8 = z12;
                                                } else {
                                                    composer2.startReplaceGroup(-567018607);
                                                    Object objRememberedValue6 = composer2.rememberedValue();
                                                    if (objRememberedValue6 == companion.getEmpty()) {
                                                        objRememberedValue6 = SnapshotState3.mutableStateOf$default(Size.m6574boximpl(Size.INSTANCE.m6589getZeroNHjbRc()), null, 2, null);
                                                        composer2.updateRememberedValue(objRememberedValue6);
                                                    }
                                                    final SnapshotState snapshotState = (SnapshotState) objRememberedValue6;
                                                    ComposableLambda composableLambdaRememberComposableLambda8 = ComposableLambda3.rememberComposableLambda(157291737, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$borderContainerWithId$1
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

                                                        public final void invoke(Composer composer3, int i36) {
                                                            if ((i36 & 3) != 2 || !composer3.getSkipping()) {
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(157291737, i36, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:255)");
                                                                }
                                                                Modifier modifierOutlineCutout = OutlinedTextField.outlineCutout(LayoutId2.layoutId(Modifier.INSTANCE, "Container"), new MutablePropertyReference0Impl(snapshotState) { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$borderContainerWithId$1.1
                                                                    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty6
                                                                    public Object get() {
                                                                        return ((SnapshotState) this.receiver).getValue();
                                                                    }

                                                                    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty3
                                                                    public void set(Object obj) {
                                                                        ((SnapshotState) this.receiver).setValue(obj);
                                                                    }
                                                                }, paddingValues);
                                                                Function2<Composer, Integer, Unit> function232 = function29;
                                                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
                                                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                                                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierOutlineCutout);
                                                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                                                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                                                if (composer3.getApplier() == null) {
                                                                    Composables.invalidApplier();
                                                                }
                                                                composer3.startReusableNode();
                                                                if (composer3.getInserting()) {
                                                                    composer3.createNode(constructor);
                                                                } else {
                                                                    composer3.useNode();
                                                                }
                                                                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                                                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                                }
                                                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                                function232.invoke(composer3, 0);
                                                                composer3.endNode();
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventEnd();
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            composer3.skipToGroupEnd();
                                                        }
                                                    }, composer2, 54);
                                                    Modifier.Companion companion3 = Modifier.INSTANCE;
                                                    boolean zChanged3 = composer2.changed(f9);
                                                    Object objRememberedValue7 = composer2.rememberedValue();
                                                    if (zChanged3 || objRememberedValue7 == companion.getEmpty()) {
                                                        objRememberedValue7 = new Function1<Size, Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$1$1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(1);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function1
                                                            public /* bridge */ /* synthetic */ Unit invoke(Size size) {
                                                                m6101invokeuvyYCjk(size.getPackedValue());
                                                                return Unit.INSTANCE;
                                                            }

                                                            /* renamed from: invoke-uvyYCjk, reason: not valid java name */
                                                            public final void m6101invokeuvyYCjk(long j4) {
                                                                float fM6583getWidthimpl = Size.m6583getWidthimpl(j4) * f9;
                                                                float fM6580getHeightimpl = Size.m6580getHeightimpl(j4) * f9;
                                                                if (Size.m6583getWidthimpl(snapshotState.getValue().getPackedValue()) == fM6583getWidthimpl && Size.m6580getHeightimpl(snapshotState.getValue().getPackedValue()) == fM6580getHeightimpl) {
                                                                    return;
                                                                }
                                                                snapshotState.setValue(Size.m6574boximpl(androidx.compose.p011ui.geometry.SizeKt.Size(fM6583getWidthimpl, fM6580getHeightimpl)));
                                                            }
                                                        };
                                                        composer2.updateRememberedValue(objRememberedValue7);
                                                    }
                                                    z8 = z12;
                                                    OutlinedTextField.OutlinedTextFieldLayout(companion3, function2, composableLambdaRememberComposableLambda2, composableLambdaRememberComposableLambda, composableLambda2, composableLambdaRememberComposableLambda5, composableLambda, composableLambdaRememberComposableLambda4, z8, f9, (Function1) objRememberedValue7, composableLambdaRememberComposableLambda8, composableLambdaRememberComposableLambda7, paddingValues, composer2, ((i22 >> 3) & 112) | 6 | ((i35 << 21) & 234881024), ((i35 >> 6) & 7168) | 48);
                                                    composer2.endReplaceGroup();
                                                    Unit unit3 = Unit.INSTANCE;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                                function213 = function211;
                                                function214 = function225;
                                                z9 = z13;
                                                function215 = function220;
                                                z10 = z14;
                                                z11 = z8;
                                                function216 = function226;
                                                function217 = function210;
                                                function218 = function212;
                                            } else {
                                                if (i27 == 2) {
                                                    if (z6) {
                                                        f7 = 0.0f;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                    }
                                                    composerStartRestartGroup.endReplaceGroup();
                                                    Float fValueOf32 = Float.valueOf(f7);
                                                    InputPhase inputPhase122 = (InputPhase) transition3.getTargetState();
                                                    composerStartRestartGroup.startReplaceGroup(1128033978);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                    }
                                                    i28 = iArr[inputPhase4.ordinal()];
                                                    if (i28 != 1) {
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                    }
                                                    composerStartRestartGroup.endReplaceGroup();
                                                    snapshotState4CreateTransitionAnimation = TransitionKt.createTransitionAnimation(transition3, f8, Float.valueOf(f10), textFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1.invoke((TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1) transition3.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), twoWayConverter2, "PrefixSuffixOpacity", composerStartRestartGroup, 196608);
                                                    TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1 textFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$12 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Color>>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1
                                                        @Override // kotlin.jvm.functions.Function3
                                                        public /* bridge */ /* synthetic */ FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer3, Integer num) {
                                                            return invoke(segment, composer3, num.intValue());
                                                        }

                                                        public final FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer3, int i36) {
                                                            composer3.startReplaceGroup(1528582156);
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(1528582156, i36, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:407)");
                                                            }
                                                            TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(150, 0, null, 6, null);
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                            }
                                                            composer3.endReplaceGroup();
                                                            return tweenSpecTween$default;
                                                        }
                                                    };
                                                    InputPhase inputPhase132 = (InputPhase) transition3.getTargetState();
                                                    composerStartRestartGroup.startReplaceGroup(-107432127);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                    }
                                                    if (iArr[inputPhase132.ordinal()] == 1) {
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                    }
                                                    composerStartRestartGroup.endReplaceGroup();
                                                    colorSpaceM6710getColorSpaceimpl = Color.m6710getColorSpaceimpl(j2);
                                                    zChanged = composerStartRestartGroup.changed(colorSpaceM6710getColorSpaceimpl);
                                                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                                    if (zChanged) {
                                                        objRememberedValue2 = (TwoWayConverter) ColorVectorConverter.getVectorConverter(companion2).invoke(colorSpaceM6710getColorSpaceimpl);
                                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                                        TwoWayConverter twoWayConverter32 = (TwoWayConverter) objRememberedValue2;
                                                        InputPhase inputPhase142 = (InputPhase) transition3.getCurrentState();
                                                        composerStartRestartGroup.startReplaceGroup(-107432127);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                        }
                                                        if (iArr[inputPhase142.ordinal()] != 1) {
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                        }
                                                        composerStartRestartGroup.endReplaceGroup();
                                                        Color colorM6701boximpl3 = Color.m6701boximpl(j3);
                                                        inputPhase5 = (InputPhase) transition3.getTargetState();
                                                        composerStartRestartGroup.startReplaceGroup(-107432127);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                        }
                                                        if (iArr[inputPhase5.ordinal()] == 1) {
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                        }
                                                        composerStartRestartGroup.endReplaceGroup();
                                                        SnapshotState4 snapshotState4CreateTransitionAnimation42 = TransitionKt.createTransitionAnimation(transition3, colorM6701boximpl3, Color.m6701boximpl(jM7661getColor0d7_KjU2), textFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$12.invoke((TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1) transition3.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), twoWayConverter32, "LabelTextStyleColor", composerStartRestartGroup, 196608);
                                                        composer2 = composerStartRestartGroup;
                                                        TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1 textFieldImplKt$TextFieldTransitionScope$labelContentColor$12 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Color>>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1
                                                            @Override // kotlin.jvm.functions.Function3
                                                            public /* bridge */ /* synthetic */ FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer3, Integer num) {
                                                                return invoke(segment, composer3, num.intValue());
                                                            }

                                                            public final FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer3, int i36) {
                                                                composer3.startReplaceGroup(-543659263);
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(-543659263, i36, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:419)");
                                                                }
                                                                TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(150, 0, null, 6, null);
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventEnd();
                                                                }
                                                                composer3.endReplaceGroup();
                                                                return tweenSpecTween$default;
                                                            }
                                                        };
                                                        composer2.startReplaceGroup(1023351670);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                        }
                                                        composer2.endReplaceGroup();
                                                        colorSpaceM6710getColorSpaceimpl2 = Color.m6710getColorSpaceimpl(jM6003labelColorXeAY9LY$material3_release);
                                                        zChanged2 = composer2.changed(colorSpaceM6710getColorSpaceimpl2);
                                                        objRememberedValue3 = composer2.rememberedValue();
                                                        if (!zChanged2) {
                                                            objRememberedValue3 = (TwoWayConverter) ColorVectorConverter.getVectorConverter(companion2).invoke(colorSpaceM6710getColorSpaceimpl2);
                                                            composer2.updateRememberedValue(objRememberedValue3);
                                                            TwoWayConverter twoWayConverter42 = (TwoWayConverter) objRememberedValue3;
                                                            composer2.startReplaceGroup(1023351670);
                                                            if (ComposerKt.isTraceInProgress()) {
                                                            }
                                                            if (ComposerKt.isTraceInProgress()) {
                                                            }
                                                            composer2.endReplaceGroup();
                                                            Color colorM6701boximpl22 = Color.m6701boximpl(jM6003labelColorXeAY9LY$material3_release);
                                                            composer2.startReplaceGroup(1023351670);
                                                            if (ComposerKt.isTraceInProgress()) {
                                                            }
                                                            if (ComposerKt.isTraceInProgress()) {
                                                            }
                                                            composer2.endReplaceGroup();
                                                            final SnapshotState4<Color> snapshotState4CreateTransitionAnimation52 = TransitionKt.createTransitionAnimation(transition2, colorM6701boximpl22, Color.m6701boximpl(jM6003labelColorXeAY9LY$material3_release), textFieldImplKt$TextFieldTransitionScope$labelContentColor$12.invoke((TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1) transition2.getSegment(), (Transition.Segment) composer2, (Composer) 0), twoWayConverter42, "LabelContentColor", composer2, 196608);
                                                            final float fFloatValue2 = ((Number) snapshotState4.getValue()).floatValue();
                                                            composer2.startReplaceGroup(-156998101);
                                                            if (function22 != null) {
                                                            }
                                                            composer2.endReplaceGroup();
                                                            final long jM6005placeholderColorXeAY9LY$material3_release2 = textFieldColors.m6005placeholderColorXeAY9LY$material3_release(z13, z14, zBooleanValue);
                                                            objRememberedValue4 = composer2.rememberedValue();
                                                            companion = Composer.INSTANCE;
                                                            if (objRememberedValue4 == companion.getEmpty()) {
                                                            }
                                                            SnapshotState4 snapshotState472 = (SnapshotState4) objRememberedValue4;
                                                            composer2.startReplaceGroup(-156965270);
                                                            if (function224 == null) {
                                                                textStyle3 = textStyle;
                                                                function210 = function224;
                                                                composableLambdaRememberComposableLambda2 = null;
                                                                composer2.endReplaceGroup();
                                                                final long jM6006prefixColorXeAY9LY$material3_release2 = textFieldColors.m6006prefixColorXeAY9LY$material3_release(z13, z14, zBooleanValue);
                                                                objRememberedValue5 = composer2.rememberedValue();
                                                                final TextStyle textStyle52 = textStyle3;
                                                                if (objRememberedValue5 == companion.getEmpty()) {
                                                                }
                                                                snapshotState43 = (SnapshotState4) objRememberedValue5;
                                                                composer2.startReplaceGroup(-156940524);
                                                                if (function222 == null) {
                                                                    snapshotState44 = snapshotState43;
                                                                    snapshotState45 = snapshotState4CreateTransitionAnimation;
                                                                    function211 = function222;
                                                                    composableLambdaRememberComposableLambda3 = null;
                                                                    composer2.endReplaceGroup();
                                                                    final long jM6007suffixColorXeAY9LY$material3_release2 = textFieldColors.m6007suffixColorXeAY9LY$material3_release(z13, z14, zBooleanValue);
                                                                    composer2.startReplaceGroup(-156921964);
                                                                    if (function223 == null) {
                                                                        composableLambda = composableLambdaRememberComposableLambda3;
                                                                        function212 = function223;
                                                                        composableLambdaRememberComposableLambda4 = null;
                                                                        composer2.endReplaceGroup();
                                                                        final long jM6004leadingIconColorXeAY9LY$material3_release2 = textFieldColors.m6004leadingIconColorXeAY9LY$material3_release(z13, z14, zBooleanValue);
                                                                        composer2.startReplaceGroup(-156902962);
                                                                        if (function220 != null) {
                                                                        }
                                                                        composer2.endReplaceGroup();
                                                                        final long jM6010trailingIconColorXeAY9LY$material3_release2 = textFieldColors.m6010trailingIconColorXeAY9LY$material3_release(z13, z14, zBooleanValue);
                                                                        composer2.startReplaceGroup(-156893937);
                                                                        if (function226 != null) {
                                                                        }
                                                                        composer2.endReplaceGroup();
                                                                        final long jM6008supportingTextColorXeAY9LY$material3_release2 = textFieldColors.m6008supportingTextColorXeAY9LY$material3_release(z13, z14, zBooleanValue);
                                                                        composer2.startReplaceGroup(-156884470);
                                                                        if (function225 != null) {
                                                                        }
                                                                        composer2.endReplaceGroup();
                                                                        i30 = WhenMappings.$EnumSwitchMapping$0[textFieldType.ordinal()];
                                                                        if (i30 != z7) {
                                                                        }
                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                        }
                                                                        function213 = function211;
                                                                        function214 = function225;
                                                                        z9 = z13;
                                                                        function215 = function220;
                                                                        z10 = z14;
                                                                        z11 = z8;
                                                                        function216 = function226;
                                                                        function217 = function210;
                                                                        function218 = function212;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else if (i27 != 3) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                f7 = 1.0f;
                                                if (ComposerKt.isTraceInProgress()) {
                                                }
                                                composerStartRestartGroup.endReplaceGroup();
                                                Float fValueOf322 = Float.valueOf(f7);
                                                InputPhase inputPhase1222 = (InputPhase) transition3.getTargetState();
                                                composerStartRestartGroup.startReplaceGroup(1128033978);
                                                if (ComposerKt.isTraceInProgress()) {
                                                }
                                                i28 = iArr[inputPhase4.ordinal()];
                                                if (i28 != 1) {
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                }
                                                composerStartRestartGroup.endReplaceGroup();
                                                snapshotState4CreateTransitionAnimation = TransitionKt.createTransitionAnimation(transition3, f8, Float.valueOf(f10), textFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1.invoke((TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1) transition3.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), twoWayConverter2, "PrefixSuffixOpacity", composerStartRestartGroup, 196608);
                                                TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1 textFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$122 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Color>>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1
                                                    @Override // kotlin.jvm.functions.Function3
                                                    public /* bridge */ /* synthetic */ FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer3, Integer num) {
                                                        return invoke(segment, composer3, num.intValue());
                                                    }

                                                    public final FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer3, int i36) {
                                                        composer3.startReplaceGroup(1528582156);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(1528582156, i36, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:407)");
                                                        }
                                                        TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(150, 0, null, 6, null);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                        composer3.endReplaceGroup();
                                                        return tweenSpecTween$default;
                                                    }
                                                };
                                                InputPhase inputPhase1322 = (InputPhase) transition3.getTargetState();
                                                composerStartRestartGroup.startReplaceGroup(-107432127);
                                                if (ComposerKt.isTraceInProgress()) {
                                                }
                                                if (iArr[inputPhase1322.ordinal()] == 1) {
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                }
                                                composerStartRestartGroup.endReplaceGroup();
                                                colorSpaceM6710getColorSpaceimpl = Color.m6710getColorSpaceimpl(j2);
                                                zChanged = composerStartRestartGroup.changed(colorSpaceM6710getColorSpaceimpl);
                                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                                if (zChanged) {
                                                }
                                            }
                                        } else {
                                            if (i26 == 2) {
                                                if (z6) {
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                }
                                                composerStartRestartGroup.endReplaceGroup();
                                                Transition transition32 = transition;
                                                final SnapshotState4<Float> snapshotState4CreateTransitionAnimation32 = TransitionKt.createTransitionAnimation(transition32, f5, Float.valueOf(f6), textFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1.invoke((TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1) transition.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), twoWayConverter, "PlaceholderOpacity", composerStartRestartGroup, 196608);
                                                TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1 textFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$12 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1
                                                    @Override // kotlin.jvm.functions.Function3
                                                    public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer3, Integer num) {
                                                        return invoke(segment, composer3, num.intValue());
                                                    }

                                                    public final FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer3, int i36) {
                                                        composer3.startReplaceGroup(-1868044898);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-1868044898, i36, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:396)");
                                                        }
                                                        TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(150, 0, null, 6, null);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                        composer3.endReplaceGroup();
                                                        return tweenSpecTween$default;
                                                    }
                                                };
                                                TwoWayConverter<Float, AnimationVectors2> vectorConverter32 = VectorConvertersKt.getVectorConverter(floatCompanionObject);
                                                InputPhase inputPhase112 = (InputPhase) transition32.getCurrentState();
                                                composerStartRestartGroup.startReplaceGroup(1128033978);
                                                if (ComposerKt.isTraceInProgress()) {
                                                }
                                                i27 = iArr[inputPhase3.ordinal()];
                                                if (i27 == 1) {
                                                }
                                            } else if (i26 != 3) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            f6 = 0.0f;
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                            composerStartRestartGroup.endReplaceGroup();
                                            Transition transition322 = transition;
                                            final SnapshotState4<Float> snapshotState4CreateTransitionAnimation322 = TransitionKt.createTransitionAnimation(transition322, f5, Float.valueOf(f6), textFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1.invoke((TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1) transition.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), twoWayConverter, "PlaceholderOpacity", composerStartRestartGroup, 196608);
                                            TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1 textFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$122 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1
                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer3, Integer num) {
                                                    return invoke(segment, composer3, num.intValue());
                                                }

                                                public final FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer3, int i36) {
                                                    composer3.startReplaceGroup(-1868044898);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-1868044898, i36, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:396)");
                                                    }
                                                    TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(150, 0, null, 6, null);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                    composer3.endReplaceGroup();
                                                    return tweenSpecTween$default;
                                                }
                                            };
                                            TwoWayConverter<Float, AnimationVectors2> vectorConverter322 = VectorConvertersKt.getVectorConverter(floatCompanionObject);
                                            InputPhase inputPhase1122 = (InputPhase) transition322.getCurrentState();
                                            composerStartRestartGroup.startReplaceGroup(1128033978);
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                            i27 = iArr[inputPhase3.ordinal()];
                                            if (i27 == 1) {
                                            }
                                        }
                                    } else {
                                        if (i25 == 2) {
                                            if (z6) {
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                            composerStartRestartGroup.endReplaceGroup();
                                            Float fValueOf22 = Float.valueOf(f4);
                                            InputPhase inputPhase102 = (InputPhase) transition.getTargetState();
                                            composerStartRestartGroup.startReplaceGroup(1435837472);
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                            i26 = iArr[inputPhase2.ordinal()];
                                            if (i26 == 1) {
                                            }
                                        } else if (i25 != 3) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        f4 = 0.0f;
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                        Float fValueOf222 = Float.valueOf(f4);
                                        InputPhase inputPhase1022 = (InputPhase) transition.getTargetState();
                                        composerStartRestartGroup.startReplaceGroup(1435837472);
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        i26 = iArr[inputPhase2.ordinal()];
                                        if (i26 == 1) {
                                        }
                                    }
                                } else if (i24 != 2) {
                                    if (i24 != 3) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    f3 = 1.0f;
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    SnapshotState4 snapshotState4CreateTransitionAnimation22 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, f2, Float.valueOf(f3), textFieldImplKt$TextFieldTransitionScope$labelProgress$1.invoke((TextFieldImplKt$TextFieldTransitionScope$labelProgress$1) transitionUpdateTransition.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), vectorConverter, "LabelProgress", composerStartRestartGroup, 196608);
                                    TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1 textFieldImplKt$TextFieldTransitionScope$placeholderOpacity$12 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer3, Integer num) {
                                            return invoke(segment, composer3, num.intValue());
                                        }

                                        public final FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer3, int i36) {
                                            FiniteAnimationSpec<Float> finiteAnimationSpecTween;
                                            composer3.startReplaceGroup(-1154662212);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1154662212, i36, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:367)");
                                            }
                                            InputPhase inputPhase92 = InputPhase.Focused;
                                            InputPhase inputPhase103 = InputPhase.UnfocusedEmpty;
                                            if (segment.isTransitioningTo(inputPhase92, inputPhase103)) {
                                                finiteAnimationSpecTween = AnimationSpecKt.tween$default(67, 0, Easing3.getLinearEasing(), 2, null);
                                            } else if (segment.isTransitioningTo(inputPhase103, inputPhase92) || segment.isTransitioningTo(InputPhase.UnfocusedNotEmpty, inputPhase103)) {
                                                finiteAnimationSpecTween = AnimationSpecKt.tween(83, 67, Easing3.getLinearEasing());
                                            } else {
                                                finiteAnimationSpecTween = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                            composer3.endReplaceGroup();
                                            return finiteAnimationSpecTween;
                                        }
                                    };
                                    TwoWayConverter<Float, AnimationVectors2> vectorConverter22 = VectorConvertersKt.getVectorConverter(floatCompanionObject);
                                    InputPhase inputPhase92 = (InputPhase) transitionUpdateTransition.getCurrentState();
                                    composerStartRestartGroup.startReplaceGroup(1435837472);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    i25 = iArr[inputPhase92.ordinal()];
                                    if (i25 == 1) {
                                    }
                                } else {
                                    f3 = 0.0f;
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    SnapshotState4 snapshotState4CreateTransitionAnimation222 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, f2, Float.valueOf(f3), textFieldImplKt$TextFieldTransitionScope$labelProgress$1.invoke((TextFieldImplKt$TextFieldTransitionScope$labelProgress$1) transitionUpdateTransition.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), vectorConverter, "LabelProgress", composerStartRestartGroup, 196608);
                                    TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1 textFieldImplKt$TextFieldTransitionScope$placeholderOpacity$122 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer3, Integer num) {
                                            return invoke(segment, composer3, num.intValue());
                                        }

                                        public final FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer3, int i36) {
                                            FiniteAnimationSpec<Float> finiteAnimationSpecTween;
                                            composer3.startReplaceGroup(-1154662212);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1154662212, i36, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:367)");
                                            }
                                            InputPhase inputPhase922 = InputPhase.Focused;
                                            InputPhase inputPhase103 = InputPhase.UnfocusedEmpty;
                                            if (segment.isTransitioningTo(inputPhase922, inputPhase103)) {
                                                finiteAnimationSpecTween = AnimationSpecKt.tween$default(67, 0, Easing3.getLinearEasing(), 2, null);
                                            } else if (segment.isTransitioningTo(inputPhase103, inputPhase922) || segment.isTransitioningTo(InputPhase.UnfocusedNotEmpty, inputPhase103)) {
                                                finiteAnimationSpecTween = AnimationSpecKt.tween(83, 67, Easing3.getLinearEasing());
                                            } else {
                                                finiteAnimationSpecTween = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                            composer3.endReplaceGroup();
                                            return finiteAnimationSpecTween;
                                        }
                                    };
                                    TwoWayConverter<Float, AnimationVectors2> vectorConverter222 = VectorConvertersKt.getVectorConverter(floatCompanionObject);
                                    InputPhase inputPhase922 = (InputPhase) transitionUpdateTransition.getCurrentState();
                                    composerStartRestartGroup.startReplaceGroup(1435837472);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    i25 = iArr[inputPhase922.ordinal()];
                                    if (i25 == 1) {
                                    }
                                }
                            } else if (i23 != 2) {
                                if (i23 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                f = 1.0f;
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                Float fValueOf4 = Float.valueOf(f);
                                InputPhase inputPhase82 = (InputPhase) transitionUpdateTransition.getTargetState();
                                composerStartRestartGroup.startReplaceGroup(-2036730335);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                i24 = iArr[inputPhase.ordinal()];
                                if (i24 == 1) {
                                }
                            } else {
                                f = 0.0f;
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                Float fValueOf42 = Float.valueOf(f);
                                InputPhase inputPhase822 = (InputPhase) transitionUpdateTransition.getTargetState();
                                composerStartRestartGroup.startReplaceGroup(-2036730335);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                i24 = iArr[inputPhase.ordinal()];
                                if (i24 == 1) {
                                }
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt.CommonDecorationBox.4
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

                                public final void invoke(Composer composer3, int i36) {
                                    TextFieldImplKt.CommonDecorationBox(textFieldType, str, function2, visualTransformation, function22, function217, function215, function216, function213, function218, function214, z11, z9, z10, interactionSource, paddingValues, textFieldColors, function29, composer3, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i31 |= 805306368;
                    i12 = i11;
                    i13 = i3 & 1024;
                    if (i13 != 0) {
                    }
                    i16 = i3 & 2048;
                    if (i16 != 0) {
                    }
                    int i322 = i15;
                    i18 = i3 & 4096;
                    if (i18 != 0) {
                    }
                    i20 = i3 & 8192;
                    if (i20 != 0) {
                    }
                    if ((i3 & 16384) != 0) {
                    }
                    if ((32768 & i3) != 0) {
                    }
                    if ((i3 & 65536) != 0) {
                    }
                    if ((i3 & 131072) != 0) {
                    }
                    if ((306783379 & i31) == 306783378) {
                        if (i5 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (i10 == 0) {
                        }
                        if (i12 == 0) {
                        }
                        final Function2<? super Composer, ? super Integer, Unit> function2242 = function219;
                        if (i14 == 0) {
                        }
                        if (i17 == 0) {
                        }
                        if (i18 == 0) {
                        }
                        if (i20 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i352 = i21;
                        z4 = ((i31 & 7168) != 2048) | ((i31 & 112) != 32);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!z4) {
                            objRememberedValue = visualTransformation.filter(new AnnotatedString(str, null, null, 6, null));
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            String text2 = ((TransformedText) objRememberedValue).getText().getText();
                            boolean zBooleanValue2 = FocusInteraction3.collectIsFocusedAsState(interactionSource, composerStartRestartGroup, (i352 >> 12) & 14).getValue().booleanValue();
                            if (!zBooleanValue2) {
                            }
                            jM6003labelColorXeAY9LY$material3_release = textFieldColors.m6003labelColorXeAY9LY$material3_release(z13, z14, zBooleanValue2);
                            Typography typography2 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                            TextStyle bodyLarge2 = typography2.getBodyLarge();
                            final TextStyle bodySmall2 = typography2.getBodySmall();
                            final Function2<? super Composer, ? super Integer, Unit> function2262 = function221;
                            long jM7661getColor0d7_KjU32 = bodyLarge2.m7661getColor0d7_KjU();
                            Color.Companion companion22 = Color.INSTANCE;
                            if (Color.m6707equalsimpl0(jM7661getColor0d7_KjU32, companion22.m6726getUnspecified0d7_KjU())) {
                                jM7661getColor0d7_KjU = bodySmall2.m7661getColor0d7_KjU();
                                if (z5) {
                                }
                                jM7661getColor0d7_KjU2 = bodyLarge2.m7661getColor0d7_KjU();
                                if (z5) {
                                }
                                if (function22 != null) {
                                }
                                final boolean z162 = z5;
                                long j4 = jM7661getColor0d7_KjU;
                                Transition transitionUpdateTransition2 = TransitionKt.updateTransition(inputPhase6, "TextFieldInputState", composerStartRestartGroup, 48, 0);
                                TextFieldImplKt$TextFieldTransitionScope$labelProgress$1 textFieldImplKt$TextFieldTransitionScope$labelProgress$12 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$TextFieldTransitionScope$labelProgress$1
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer3, Integer num) {
                                        return invoke(segment, composer3, num.intValue());
                                    }

                                    public final FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer3, int i36) {
                                        composer3.startReplaceGroup(1276209157);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1276209157, i36, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:354)");
                                        }
                                        TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(150, 0, null, 6, null);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        composer3.endReplaceGroup();
                                        return tweenSpecTween$default;
                                    }
                                };
                                FloatCompanionObject floatCompanionObject2 = FloatCompanionObject.INSTANCE;
                                TwoWayConverter<Float, AnimationVectors2> vectorConverter4 = VectorConvertersKt.getVectorConverter(floatCompanionObject2);
                                InputPhase inputPhase72 = (InputPhase) transitionUpdateTransition2.getCurrentState();
                                composerStartRestartGroup.startReplaceGroup(-2036730335);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                int[] iArr22 = WhenMappings.$EnumSwitchMapping$1;
                                i23 = iArr22[inputPhase72.ordinal()];
                                float f102 = 1.0f;
                                if (i23 == 1) {
                                }
                            } else {
                                jM7661getColor0d7_KjU = bodySmall2.m7661getColor0d7_KjU();
                                if (z5) {
                                    jM7661getColor0d7_KjU = jM6003labelColorXeAY9LY$material3_release;
                                }
                                jM7661getColor0d7_KjU2 = bodyLarge2.m7661getColor0d7_KjU();
                                if (z5) {
                                    jM7661getColor0d7_KjU2 = jM6003labelColorXeAY9LY$material3_release;
                                }
                                if (function22 != null) {
                                }
                                final boolean z1622 = z5;
                                long j42 = jM7661getColor0d7_KjU;
                                Transition transitionUpdateTransition22 = TransitionKt.updateTransition(inputPhase6, "TextFieldInputState", composerStartRestartGroup, 48, 0);
                                TextFieldImplKt$TextFieldTransitionScope$labelProgress$1 textFieldImplKt$TextFieldTransitionScope$labelProgress$122 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$TextFieldTransitionScope$labelProgress$1
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer3, Integer num) {
                                        return invoke(segment, composer3, num.intValue());
                                    }

                                    public final FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer3, int i36) {
                                        composer3.startReplaceGroup(1276209157);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1276209157, i36, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:354)");
                                        }
                                        TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(150, 0, null, 6, null);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        composer3.endReplaceGroup();
                                        return tweenSpecTween$default;
                                    }
                                };
                                FloatCompanionObject floatCompanionObject22 = FloatCompanionObject.INSTANCE;
                                TwoWayConverter<Float, AnimationVectors2> vectorConverter42 = VectorConvertersKt.getVectorConverter(floatCompanionObject22);
                                InputPhase inputPhase722 = (InputPhase) transitionUpdateTransition22.getCurrentState();
                                composerStartRestartGroup.startReplaceGroup(-2036730335);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                int[] iArr222 = WhenMappings.$EnumSwitchMapping$1;
                                i23 = iArr222[inputPhase722.ordinal()];
                                float f1022 = 1.0f;
                                if (i23 == 1) {
                                }
                            }
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i10 = i9;
                i11 = i3 & 512;
                if (i11 != 0) {
                }
                i12 = i11;
                i13 = i3 & 1024;
                if (i13 != 0) {
                }
                i16 = i3 & 2048;
                if (i16 != 0) {
                }
                int i3222 = i15;
                i18 = i3 & 4096;
                if (i18 != 0) {
                }
                i20 = i3 & 8192;
                if (i20 != 0) {
                }
                if ((i3 & 16384) != 0) {
                }
                if ((32768 & i3) != 0) {
                }
                if ((i3 & 65536) != 0) {
                }
                if ((i3 & 131072) != 0) {
                }
                if ((306783379 & i31) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            i8 = i7;
            i9 = i3 & 256;
            if (i9 != 0) {
            }
            i10 = i9;
            i11 = i3 & 512;
            if (i11 != 0) {
            }
            i12 = i11;
            i13 = i3 & 1024;
            if (i13 != 0) {
            }
            i16 = i3 & 2048;
            if (i16 != 0) {
            }
            int i32222 = i15;
            i18 = i3 & 4096;
            if (i18 != 0) {
            }
            i20 = i3 & 8192;
            if (i20 != 0) {
            }
            if ((i3 & 16384) != 0) {
            }
            if ((32768 & i3) != 0) {
            }
            if ((i3 & 65536) != 0) {
            }
            if ((i3 & 131072) != 0) {
            }
            if ((306783379 & i31) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i3 & 8) == 0) {
        }
        if ((i3 & 16) == 0) {
        }
        i5 = i3 & 32;
        if (i5 == 0) {
        }
        i6 = i3 & 64;
        if (i6 == 0) {
        }
        i7 = i3 & 128;
        if (i7 == 0) {
        }
        i8 = i7;
        i9 = i3 & 256;
        if (i9 != 0) {
        }
        i10 = i9;
        i11 = i3 & 512;
        if (i11 != 0) {
        }
        i12 = i11;
        i13 = i3 & 1024;
        if (i13 != 0) {
        }
        i16 = i3 & 2048;
        if (i16 != 0) {
        }
        int i322222 = i15;
        i18 = i3 & 4096;
        if (i18 != 0) {
        }
        i20 = i3 & 8192;
        if (i20 != 0) {
        }
        if ((i3 & 16384) != 0) {
        }
        if ((32768 & i3) != 0) {
        }
        if ((i3 & 65536) != 0) {
        }
        if ((i3 & 131072) != 0) {
        }
        if ((306783379 & i31) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }
}
