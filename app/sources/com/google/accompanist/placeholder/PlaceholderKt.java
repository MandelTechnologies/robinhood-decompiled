package com.google.accompanist.placeholder;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Outline;
import androidx.compose.p011ui.graphics.Outline2;
import androidx.compose.p011ui.graphics.RectangleShape2;
import androidx.compose.p011ui.graphics.Shape;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.platform.InspectableValueKt;
import androidx.compose.p011ui.platform.InspectorInfo;
import androidx.compose.p011ui.unit.LayoutDirection;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Placeholder.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u008a\u0001\u0010\u0012\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072%\b\u0002\u0010\u000e\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\t¢\u0006\u0002\b\r2%\b\u0002\u0010\u000f\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\t¢\u0006\u0002\b\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001aX\u0010\u001d\u001a\u0004\u0018\u00010\u0015*\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0014\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006!²\u0006\u000e\u0010\u001e\u001a\u00020\f8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u001f\u001a\u00020\f8\nX\u008a\u0084\u0002²\u0006\f\u0010 \u001a\u00020\f8\nX\u008a\u0084\u0002"}, m3636d2 = {"Landroidx/compose/ui/Modifier;", "", "visible", "Landroidx/compose/ui/graphics/Color;", ResourceTypes.COLOR, "Landroidx/compose/ui/graphics/Shape;", "shape", "Lcom/google/accompanist/placeholder/PlaceholderHighlight;", "highlight", "Lkotlin/Function1;", "Landroidx/compose/animation/core/Transition$Segment;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "", "Lkotlin/ExtensionFunctionType;", "placeholderFadeTransitionSpec", "contentFadeTransitionSpec", "placeholder-cf5BqRc", "(Landroidx/compose/ui/Modifier;ZJLandroidx/compose/ui/graphics/Shape;Lcom/google/accompanist/placeholder/PlaceholderHighlight;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;", "placeholder", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "progress", "Landroidx/compose/ui/graphics/Outline;", "lastOutline", "Landroidx/compose/ui/unit/LayoutDirection;", "lastLayoutDirection", "Landroidx/compose/ui/geometry/Size;", "lastSize", "drawPlaceholder-hpmOzss", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Shape;JLcom/google/accompanist/placeholder/PlaceholderHighlight;FLandroidx/compose/ui/graphics/Outline;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/geometry/Size;)Landroidx/compose/ui/graphics/Outline;", "drawPlaceholder", "highlightProgress", "placeholderAlpha", "contentAlpha", "placeholder_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes16.dex */
public final class PlaceholderKt {
    /* renamed from: placeholder-cf5BqRc$default, reason: not valid java name */
    public static /* synthetic */ Modifier m9210placeholdercf5BqRc$default(Modifier modifier, boolean z, long j, Shape shape, PlaceholderHighlight placeholderHighlight, Function3 function3, Function3 function32, int i, Object obj) {
        if ((i & 4) != 0) {
            shape = RectangleShape2.getRectangleShape();
        }
        Shape shape2 = shape;
        if ((i & 8) != 0) {
            placeholderHighlight = null;
        }
        PlaceholderHighlight placeholderHighlight2 = placeholderHighlight;
        if ((i & 16) != 0) {
            function3 = new Function3<Transition.Segment<Boolean>, Composer, Integer, SpringSpec<Float>>() { // from class: com.google.accompanist.placeholder.PlaceholderKt$placeholder$1
                public final SpringSpec<Float> invoke(Transition.Segment<Boolean> segment, Composer composer, int i2) {
                    Intrinsics.checkNotNullParameter(segment, "$this$null");
                    composer.startReplaceableGroup(87515116);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(87515116, i2, -1, "com.google.accompanist.placeholder.placeholder.<anonymous> (Placeholder.kt:124)");
                    }
                    SpringSpec<Float> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer.endReplaceableGroup();
                    return springSpecSpring$default;
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ SpringSpec<Float> invoke(Transition.Segment<Boolean> segment, Composer composer, Integer num) {
                    return invoke(segment, composer, num.intValue());
                }
            };
        }
        return m9209placeholdercf5BqRc(modifier, z, j, shape2, placeholderHighlight2, function3, (i & 32) != 0 ? new Function3<Transition.Segment<Boolean>, Composer, Integer, SpringSpec<Float>>() { // from class: com.google.accompanist.placeholder.PlaceholderKt$placeholder$2
            public final SpringSpec<Float> invoke(Transition.Segment<Boolean> segment, Composer composer, int i2) {
                Intrinsics.checkNotNullParameter(segment, "$this$null");
                composer.startReplaceableGroup(-439090190);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-439090190, i2, -1, "com.google.accompanist.placeholder.placeholder.<anonymous> (Placeholder.kt:125)");
                }
                SpringSpec<Float> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return springSpecSpring$default;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ SpringSpec<Float> invoke(Transition.Segment<Boolean> segment, Composer composer, Integer num) {
                return invoke(segment, composer, num.intValue());
            }
        } : function32);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawPlaceholder-hpmOzss, reason: not valid java name */
    public static final Outline m9208drawPlaceholderhpmOzss(DrawScope drawScope, Shape shape, long j, PlaceholderHighlight placeholderHighlight, float f, Outline outline, LayoutDirection layoutDirection, Size size) {
        DrawScope drawScope2;
        Outline outlineMo4911createOutlinePq9zytI = null;
        if (shape == RectangleShape2.getRectangleShape()) {
            DrawScope.m6958drawRectnJ9OG0$default(drawScope, j, 0L, 0L, 0.0f, null, null, 0, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
            if (placeholderHighlight != null) {
                DrawScope.m6957drawRectAsUm42w$default(drawScope, placeholderHighlight.mo9204brushd16Qtg0(f, drawScope.mo6963getSizeNHjbRc()), 0L, 0L, placeholderHighlight.alpha(f), null, null, 0, 118, null);
            }
            return null;
        }
        if (Size.m6578equalsimpl(drawScope.mo6963getSizeNHjbRc(), size) && drawScope.getLayoutDirection() == layoutDirection) {
            outlineMo4911createOutlinePq9zytI = outline;
        }
        if (outlineMo4911createOutlinePq9zytI == null) {
            drawScope2 = drawScope;
            outlineMo4911createOutlinePq9zytI = shape.mo4911createOutlinePq9zytI(drawScope.mo6963getSizeNHjbRc(), drawScope.getLayoutDirection(), drawScope2);
        } else {
            drawScope2 = drawScope;
        }
        Outline outline2 = outlineMo4911createOutlinePq9zytI;
        Outline2.m6799drawOutlinewDX37Ww$default(drawScope2, outline2, j, 0.0f, null, null, 0, 60, null);
        if (placeholderHighlight != null) {
            Outline2.m6797drawOutlinehn5TExg$default(drawScope, outline2, placeholderHighlight.mo9204brushd16Qtg0(f, drawScope.mo6963getSizeNHjbRc()), placeholderHighlight.alpha(f), null, null, 0, 56, null);
        }
        return outline2;
    }

    @Deprecated
    /* renamed from: placeholder-cf5BqRc, reason: not valid java name */
    public static final Modifier m9209placeholdercf5BqRc(Modifier placeholder, final boolean z, final long j, final Shape shape, final PlaceholderHighlight placeholderHighlight, Function3<? super Transition.Segment<Boolean>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Float>> placeholderFadeTransitionSpec, Function3<? super Transition.Segment<Boolean>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Float>> contentFadeTransitionSpec) {
        Intrinsics.checkNotNullParameter(placeholder, "$this$placeholder");
        Intrinsics.checkNotNullParameter(shape, "shape");
        Intrinsics.checkNotNullParameter(placeholderFadeTransitionSpec, "placeholderFadeTransitionSpec");
        Intrinsics.checkNotNullParameter(contentFadeTransitionSpec, "contentFadeTransitionSpec");
        return ComposedModifier2.composed(placeholder, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: com.google.accompanist.placeholder.PlaceholderKt$placeholder-cf5BqRc$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("placeholder");
                inspectorInfo.setValue(Boolean.valueOf(z));
                inspectorInfo.getProperties().set("visible", Boolean.valueOf(z));
                inspectorInfo.getProperties().set(ResourceTypes.COLOR, Color.m6701boximpl(j));
                inspectorInfo.getProperties().set("highlight", placeholderHighlight);
                inspectorInfo.getProperties().set("shape", shape);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new PlaceholderKt$placeholder$4(placeholderFadeTransitionSpec, contentFadeTransitionSpec, placeholderHighlight, z, j, shape));
    }
}
