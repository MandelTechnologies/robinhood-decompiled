package com.robinhood.compose.bento.util;

import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Alpha;
import androidx.compose.p011ui.graphics.Shape;
import androidx.compose.p011ui.layout.LayoutModifier4;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.platform.InspectableValueKt;
import androidx.compose.p011ui.platform.InspectorInfo;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.Constraints2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.google.accompanist.placeholder.PlaceholderHighlight;
import com.google.accompanist.placeholder.PlaceholderHighlight2;
import com.google.accompanist.placeholder.PlaceholderKt;
import com.robinhood.android.plt.PltModifiers;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Modifiers.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a9\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a\u001c\u0010\t\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r\u001a\u0012\u0010\u000e\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b\u001a\u0012\u0010\u000f\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b\u001a\u0012\u0010\u0010\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u000b¨\u0006\u0012"}, m3636d2 = {"paddingIfContentSizeNonZero", "Landroidx/compose/ui/Modifier;", "start", "Landroidx/compose/ui/unit/Dp;", "end", "top", "bottom", "paddingIfContentSizeNonZero-qDBjuR0", "(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;", "bentoPlaceholder", "visible", "", "shape", "Landroidx/compose/ui/graphics/Shape;", "bentoCirclePlaceholder", "bentoPillPlaceholder", "isInvisible", "invisible", "lib-compose-bento_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes15.dex */
public final class ModifiersKt {
    /* renamed from: paddingIfContentSizeNonZero-qDBjuR0, reason: not valid java name */
    public static final Modifier m21616paddingIfContentSizeNonZeroqDBjuR0(Modifier paddingIfContentSizeNonZero, final float f, final float f2, final float f3, final float f4) {
        Intrinsics.checkNotNullParameter(paddingIfContentSizeNonZero, "$this$paddingIfContentSizeNonZero");
        return LayoutModifier4.layout(paddingIfContentSizeNonZero, new Function3() { // from class: com.robinhood.compose.bento.util.ModifiersKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return ModifiersKt.paddingIfContentSizeNonZero_qDBjuR0$lambda$2(f, f2, f3, f4, (MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit paddingIfContentSizeNonZero_qDBjuR0$lambda$2$lambda$0(Placeable placeable, MeasureScope measureScope, float f, float f2, Placeable.PlacementScope layout) {
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        Placeable.PlacementScope.place$default(layout, placeable, measureScope.mo5010roundToPx0680j_4(f), measureScope.mo5010roundToPx0680j_4(f2), 0.0f, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult paddingIfContentSizeNonZero_qDBjuR0$lambda$2(final float f, float f2, final float f3, float f4, final MeasureScope layout, Measurable measurable, Constraints constraints) {
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        int iMo5010roundToPx0680j_4 = layout.mo5010roundToPx0680j_4(C2002Dp.m7995constructorimpl(f2 + f));
        int iMo5010roundToPx0680j_42 = layout.mo5010roundToPx0680j_4(C2002Dp.m7995constructorimpl(f4 + f3));
        final Placeable placeableMo7239measureBRTryo0 = measurable.mo7239measureBRTryo0(Constraints2.m7991offsetNN6EwU(constraints.getValue(), iMo5010roundToPx0680j_4, -iMo5010roundToPx0680j_42));
        if (placeableMo7239measureBRTryo0.getWidth() > 0 && placeableMo7239measureBRTryo0.getHeight() > 0) {
            return MeasureScope.layout$default(layout, placeableMo7239measureBRTryo0.getWidth() + iMo5010roundToPx0680j_4, placeableMo7239measureBRTryo0.getHeight() + iMo5010roundToPx0680j_42, null, new Function1() { // from class: com.robinhood.compose.bento.util.ModifiersKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ModifiersKt.paddingIfContentSizeNonZero_qDBjuR0$lambda$2$lambda$0(placeableMo7239measureBRTryo0, layout, f, f3, (Placeable.PlacementScope) obj);
                }
            }, 4, null);
        }
        return MeasureScope.layout$default(layout, 0, 0, null, new Function1() { // from class: com.robinhood.compose.bento.util.ModifiersKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ModifiersKt.paddingIfContentSizeNonZero_qDBjuR0$lambda$2$lambda$1((Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit paddingIfContentSizeNonZero_qDBjuR0$lambda$2$lambda$1(Placeable.PlacementScope layout) {
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        return Unit.INSTANCE;
    }

    public static final Modifier bentoCirclePlaceholder(Modifier modifier, boolean z) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return bentoPlaceholder(modifier, z, RoundedCornerShape2.getCircleShape());
    }

    public static final Modifier bentoPillPlaceholder(Modifier modifier, boolean z) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return bentoPlaceholder(modifier, z, RoundedCornerShape2.RoundedCornerShape(50));
    }

    public static final Modifier isInvisible(Modifier modifier, boolean z) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return Alpha.alpha(modifier, z ? 0.0f : 1.0f);
    }

    public static final Modifier bentoPlaceholder(Modifier modifier, final boolean z, final Shape shape) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(shape, "shape");
        return ComposedModifier2.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: com.robinhood.compose.bento.util.ModifiersKt$bentoPlaceholder$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("bentoPlaceholder");
                inspectorInfo.setValue(Boolean.valueOf(z));
                inspectorInfo.getProperties().set("visible", Boolean.valueOf(z));
                inspectorInfo.getProperties().set("shape", shape);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: com.robinhood.compose.bento.util.ModifiersKt.bentoPlaceholder.2
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            public final Modifier invoke(Modifier composed, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceGroup(142300235);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(142300235, i, -1, "com.robinhood.compose.bento.util.bentoPlaceholder.<anonymous> (Modifiers.kt:66)");
                }
                Modifier modifierM9210placeholdercf5BqRc$default = PlaceholderKt.m9210placeholdercf5BqRc$default(PltModifiers.recordLoadingState$default(composed, z, null, 2, null), z, ((Styles) composer.consume(Styles2.getLocalStyles())).getPlaceholder(composer, 0).m21880getColor0d7_KjU(), shape, PlaceholderHighlight2.m9206shimmerRPmYEkk$default(PlaceholderHighlight.INSTANCE, ((Styles) composer.consume(Styles2.getLocalStyles())).getPlaceholder(composer, 0).m21881getHighlightColor0d7_KjU(), null, 0.0f, 6, null), null, null, 48, null);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return modifierM9210placeholdercf5BqRc$default;
            }
        });
    }

    public static /* synthetic */ Modifier bentoPlaceholder$default(Modifier modifier, boolean z, Shape shape, int i, Object obj) {
        if ((i & 2) != 0) {
            shape = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(8));
        }
        return bentoPlaceholder(modifier, z, shape);
    }

    /* renamed from: paddingIfContentSizeNonZero-qDBjuR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m21617paddingIfContentSizeNonZeroqDBjuR0$default(Modifier modifier, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = C2002Dp.m7995constructorimpl(0);
        }
        if ((i & 2) != 0) {
            f2 = C2002Dp.m7995constructorimpl(0);
        }
        if ((i & 4) != 0) {
            f3 = C2002Dp.m7995constructorimpl(0);
        }
        if ((i & 8) != 0) {
            f4 = C2002Dp.m7995constructorimpl(0);
        }
        return m21616paddingIfContentSizeNonZeroqDBjuR0(modifier, f, f2, f3, f4);
    }
}
