package com.truelayer.payments.p419ui.components;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.Easing3;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransition4;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.BoxWithConstraints;
import androidx.compose.foundation.layout.BoxWithConstraints4;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.OffsetKt;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Shape;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.truelayer.payments.p419ui.theme.Color8;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Shimmer.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a1\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0001¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"Shimmer", "", "modifier", "Landroidx/compose/ui/Modifier;", "colors", "", "Landroidx/compose/ui/graphics/Color;", "shape", "Landroidx/compose/ui/graphics/Shape;", "(Landroidx/compose/ui/Modifier;Ljava/util/List;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/runtime/Composer;II)V", "payments-ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.truelayer.payments.ui.components.ShimmerKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class Shimmer2 {
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Shimmer(Modifier modifier, List<Color> list, Shape shape, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Shape shape2;
        final List<Color> listListOf;
        final Modifier modifier3;
        int i4;
        final Shape small;
        final Modifier modifier4;
        Composer composerStartRestartGroup = composer.startRestartGroup(1984243765);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 16;
        }
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0) {
                shape2 = shape;
                int i7 = composerStartRestartGroup.changed(shape2) ? 256 : 128;
                i3 |= i7;
            } else {
                shape2 = shape;
            }
            i3 |= i7;
        } else {
            shape2 = shape;
        }
        if (i6 != 2 || (i3 & 731) != 146 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                Modifier modifier5 = i5 != 0 ? Modifier.INSTANCE : modifier2;
                if (i6 != 0) {
                    Color8 color8 = Color8.INSTANCE;
                    listListOf = CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color.m6705copywmQWz5c$default(color8.m27172getShimmer0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m6701boximpl(Color.m6705copywmQWz5c$default(color8.m27172getShimmer0d7_KjU(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m6701boximpl(Color.m6705copywmQWz5c$default(color8.m27172getShimmer0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null))});
                } else {
                    listListOf = list;
                }
                if ((i2 & 4) != 0) {
                    small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable).getSmall();
                    int i8 = i3 & (-897);
                    modifier3 = modifier5;
                    i4 = i8;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1984243765, i4, -1, "com.truelayer.payments.ui.components.Shimmer (Shimmer.kt:33)");
                    }
                    BoxWithConstraints.BoxWithConstraints(modifier3, null, false, ComposableLambda3.composableLambda(composerStartRestartGroup, 77323403, true, new Function3<BoxWithConstraints4, Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.ShimmerKt.Shimmer.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraints4 boxWithConstraints4, Composer composer2, Integer num) {
                            invoke(boxWithConstraints4, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BoxWithConstraints4 BoxWithConstraints, Composer composer2, int i9) {
                            int i10;
                            Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                            if ((i9 & 14) == 0) {
                                i10 = i9 | (composer2.changed(BoxWithConstraints) ? 4 : 2);
                            } else {
                                i10 = i9;
                            }
                            if ((i10 & 91) != 18 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(77323403, i10, -1, "com.truelayer.payments.ui.components.Shimmer.<anonymous> (Shimmer.kt:34)");
                                }
                                float fMo5103getMaxWidthD9Ej5fM = BoxWithConstraints.mo5103getMaxWidthD9Ej5fM();
                                float fMax = Math.max(BoxWithConstraints.mo5103getMaxWidthD9Ej5fM(), BoxWithConstraints.mo5102getMaxHeightD9Ej5fM());
                                SnapshotState4<Float> snapshotState4AnimateFloat = InfiniteTransition4.animateFloat(InfiniteTransition4.rememberInfiniteTransition(null, composer2, 0, 1), -fMax, (2 * fMax) + fMo5103getMaxWidthD9Ej5fM, AnimationSpecKt.m4815infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween(1000, 300, Easing3.getLinearEasing()), null, 0L, 6, null), null, composer2, (InfiniteRepeatableSpec.$stable << 9) | InfiniteTransition.$stable, 8);
                                final Brush brushM6678linearGradientmHitzGk$default = Brush.Companion.m6678linearGradientmHitzGk$default(Brush.INSTANCE, listListOf, OffsetKt.Offset(snapshotState4AnimateFloat.getValue().floatValue(), snapshotState4AnimateFloat.getValue().floatValue()), OffsetKt.Offset(snapshotState4AnimateFloat.getValue().floatValue() + fMax, snapshotState4AnimateFloat.getValue().floatValue() + fMax), 0, 8, (Object) null);
                                SurfaceKt.m5967SurfaceT9BRK9s(modifier3, small, 0L, 0L, 0.0f, 0.0f, null, ComposableLambda3.composableLambda(composer2, 1795536806, true, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.ShimmerKt.Shimmer.1.1
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i11) {
                                        if ((i11 & 11) == 2 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1795536806, i11, -1, "com.truelayer.payments.ui.components.Shimmer.<anonymous>.<anonymous> (Shimmer.kt:52)");
                                        }
                                        Spacer2.Spacer(Background3.background$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), brushM6678linearGradientmHitzGk$default, null, 0.0f, 6, null), composer3, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }), composer2, 12582912, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }), composerStartRestartGroup, (i4 & 14) | 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                } else {
                    int i9 = i3;
                    modifier3 = modifier5;
                    i4 = i9;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                listListOf = list;
                i4 = i3;
                modifier3 = modifier2;
            }
            small = shape2;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            BoxWithConstraints.BoxWithConstraints(modifier3, null, false, ComposableLambda3.composableLambda(composerStartRestartGroup, 77323403, true, new Function3<BoxWithConstraints4, Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.ShimmerKt.Shimmer.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraints4 boxWithConstraints4, Composer composer2, Integer num) {
                    invoke(boxWithConstraints4, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BoxWithConstraints4 BoxWithConstraints, Composer composer2, int i92) {
                    int i10;
                    Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                    if ((i92 & 14) == 0) {
                        i10 = i92 | (composer2.changed(BoxWithConstraints) ? 4 : 2);
                    } else {
                        i10 = i92;
                    }
                    if ((i10 & 91) != 18 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(77323403, i10, -1, "com.truelayer.payments.ui.components.Shimmer.<anonymous> (Shimmer.kt:34)");
                        }
                        float fMo5103getMaxWidthD9Ej5fM = BoxWithConstraints.mo5103getMaxWidthD9Ej5fM();
                        float fMax = Math.max(BoxWithConstraints.mo5103getMaxWidthD9Ej5fM(), BoxWithConstraints.mo5102getMaxHeightD9Ej5fM());
                        SnapshotState4<Float> snapshotState4AnimateFloat = InfiniteTransition4.animateFloat(InfiniteTransition4.rememberInfiniteTransition(null, composer2, 0, 1), -fMax, (2 * fMax) + fMo5103getMaxWidthD9Ej5fM, AnimationSpecKt.m4815infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween(1000, 300, Easing3.getLinearEasing()), null, 0L, 6, null), null, composer2, (InfiniteRepeatableSpec.$stable << 9) | InfiniteTransition.$stable, 8);
                        final Brush brushM6678linearGradientmHitzGk$default = Brush.Companion.m6678linearGradientmHitzGk$default(Brush.INSTANCE, listListOf, OffsetKt.Offset(snapshotState4AnimateFloat.getValue().floatValue(), snapshotState4AnimateFloat.getValue().floatValue()), OffsetKt.Offset(snapshotState4AnimateFloat.getValue().floatValue() + fMax, snapshotState4AnimateFloat.getValue().floatValue() + fMax), 0, 8, (Object) null);
                        SurfaceKt.m5967SurfaceT9BRK9s(modifier3, small, 0L, 0L, 0.0f, 0.0f, null, ComposableLambda3.composableLambda(composer2, 1795536806, true, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.ShimmerKt.Shimmer.1.1
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i11) {
                                if ((i11 & 11) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1795536806, i11, -1, "com.truelayer.payments.ui.components.Shimmer.<anonymous>.<anonymous> (Shimmer.kt:52)");
                                }
                                Spacer2.Spacer(Background3.background$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), brushM6678linearGradientmHitzGk$default, null, 0.0f, 6, null), composer3, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composer2, 12582912, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }), composerStartRestartGroup, (i4 & 14) | 3072, 6);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier4 = modifier3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            listListOf = list;
            modifier4 = modifier2;
            small = shape2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.ShimmerKt.Shimmer.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i10) {
                    Shimmer2.Shimmer(modifier4, listListOf, small, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }
}
