package com.truelayer.payments.p419ui.components;

import androidx.compose.foundation.layout.BoxWithConstraints;
import androidx.compose.foundation.layout.BoxWithConstraints4;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.truelayer.payments.p419ui.theme.Breakpoints;
import com.truelayer.payments.p419ui.theme.Breakpoints2;
import com.truelayer.payments.p419ui.theme.Spacing;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ResponsiveContainer.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u001aN\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0001\u0012\u0004\u0012\u00020\t0\u0006H\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a%\u0010\u000f\u001a\u00020\u0000*\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0013\u0010\u0012\u001a\u0019\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0014\u0010\u0012\u001a\u0019\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0015\u0010\u0012¨\u0006\u0016"}, m3636d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/Alignment;", "contentAlignment", "Lcom/truelayer/payments/ui/theme/Breakpoints;", "breakpoints", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "", "content", "ResponsiveContainer", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Lcom/truelayer/payments/ui/theme/Breakpoints;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/layout/BoxWithConstraintsScope;", "boxWithConstraintsScope", "widthBreakpoints", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/BoxWithConstraintsScope;Lcom/truelayer/payments/ui/theme/Breakpoints;)Landroidx/compose/ui/Modifier;", "legalsTextBreakpoints", "(Landroidx/compose/ui/Modifier;)Lcom/truelayer/payments/ui/theme/Breakpoints;", "confirmationBodyBreakpoints", "formBreakpoints", "radioBreakpoints", "payments-ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.truelayer.payments.ui.components.ResponsiveContainerKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class ResponsiveContainer {
    public static final void ResponsiveContainer(Modifier modifier, Alignment alignment, final Breakpoints breakpoints, final Function3<? super Modifier, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        final Alignment alignment2;
        Intrinsics.checkNotNullParameter(breakpoints, "breakpoints");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-577619344);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(alignment) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= composerStartRestartGroup.changed(breakpoints) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(content) ? 2048 : 1024;
        }
        if ((i3 & 5851) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (i5 != 0) {
                alignment = Alignment.INSTANCE.getCenter();
            }
            Alignment alignment3 = alignment;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-577619344, i3, -1, "com.truelayer.payments.ui.components.ResponsiveContainer (ResponsiveContainer.kt:31)");
            }
            BoxWithConstraints.BoxWithConstraints(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), alignment3, false, ComposableLambda3.composableLambda(composerStartRestartGroup, 12163546, true, new Function3<BoxWithConstraints4, Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.ResponsiveContainerKt.ResponsiveContainer.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraints4 boxWithConstraints4, Composer composer2, Integer num) {
                    invoke(boxWithConstraints4, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BoxWithConstraints4 BoxWithConstraints, Composer composer2, int i6) {
                    Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                    if ((i6 & 14) == 0) {
                        i6 |= composer2.changed(BoxWithConstraints) ? 4 : 2;
                    }
                    if ((i6 & 91) == 18 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(12163546, i6, -1, "com.truelayer.payments.ui.components.ResponsiveContainer.<anonymous> (ResponsiveContainer.kt:35)");
                    }
                    content.invoke(Breakpoints2.m27158breakpointlG28NQ4(Modifier.INSTANCE, BoxWithConstraints.mo5104getMinWidthD9Ej5fM(), breakpoints), composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), composerStartRestartGroup, (i3 & 112) | 3072, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            alignment2 = alignment3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            alignment2 = alignment;
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.ResponsiveContainerKt.ResponsiveContainer.2
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

                public final void invoke(Composer composer2, int i6) {
                    ResponsiveContainer.ResponsiveContainer(modifier2, alignment2, breakpoints, content, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    public static final Modifier widthBreakpoints(Modifier modifier, BoxWithConstraints4 boxWithConstraints4, Breakpoints breakpoints) {
        Modifier modifierM27158breakpointlG28NQ4;
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(breakpoints, "breakpoints");
        return (boxWithConstraints4 == null || (modifierM27158breakpointlG28NQ4 = Breakpoints2.m27158breakpointlG28NQ4(modifier, boxWithConstraints4.mo5104getMinWidthD9Ej5fM(), breakpoints)) == null) ? modifier : modifierM27158breakpointlG28NQ4;
    }

    public static final Breakpoints legalsTextBreakpoints(Modifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        float f = 560;
        return new Breakpoints(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), SizeKt.m5174width3ABfNKs(modifier, C2002Dp.m7995constructorimpl(f)), SizeKt.m5174width3ABfNKs(modifier, C2002Dp.m7995constructorimpl(f)));
    }

    public static final Breakpoints confirmationBodyBreakpoints(Modifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        float f = 560;
        return new Breakpoints(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), SizeKt.m5174width3ABfNKs(modifier, C2002Dp.m7995constructorimpl(f)), SizeKt.m5174width3ABfNKs(modifier, C2002Dp.m7995constructorimpl(f)));
    }

    public static final Breakpoints formBreakpoints(Modifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        float f = 560;
        return new Breakpoints(PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), Spacing.INSTANCE.m27177getREGULARD9Ej5fM(), 0.0f, 2, null), SizeKt.m5174width3ABfNKs(modifier, C2002Dp.m7995constructorimpl(f)), SizeKt.m5174width3ABfNKs(modifier, C2002Dp.m7995constructorimpl(f)));
    }

    public static /* synthetic */ Breakpoints formBreakpoints$default(Modifier modifier, int i, Object obj) {
        if ((i & 1) != 0) {
            modifier = Modifier.INSTANCE;
        }
        return formBreakpoints(modifier);
    }

    public static final Breakpoints radioBreakpoints(Modifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        float f = 560;
        return new Breakpoints(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), SizeKt.m5174width3ABfNKs(modifier, C2002Dp.m7995constructorimpl(f)), SizeKt.m5174width3ABfNKs(modifier, C2002Dp.m7995constructorimpl(f)));
    }

    public static /* synthetic */ Breakpoints radioBreakpoints$default(Modifier modifier, int i, Object obj) {
        if ((i & 1) != 0) {
            modifier = Modifier.INSTANCE;
        }
        return radioBreakpoints(modifier);
    }
}
