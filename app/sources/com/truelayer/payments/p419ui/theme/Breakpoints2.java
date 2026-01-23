package com.truelayer.payments.p419ui.theme;

import androidx.compose.p011ui.Modifier;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Breakpoints.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a&\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\b"}, m3636d2 = {"breakpoint", "Landroidx/compose/ui/Modifier;", "minWidth", "Landroidx/compose/ui/unit/Dp;", "breakpoints", "Lcom/truelayer/payments/ui/theme/Breakpoints;", "breakpoint-lG28NQ4", "(Landroidx/compose/ui/Modifier;FLcom/truelayer/payments/ui/theme/Breakpoints;)Landroidx/compose/ui/Modifier;", "payments-ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.truelayer.payments.ui.theme.BreakpointsKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class Breakpoints2 {

    /* compiled from: Breakpoints.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: com.truelayer.payments.ui.theme.BreakpointsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Breakpoints3.values().length];
            try {
                iArr[Breakpoints3.Small.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Breakpoints3.Medium.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Breakpoints3.Large.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: breakpoint-lG28NQ4, reason: not valid java name */
    public static final Modifier m27158breakpointlG28NQ4(Modifier breakpoint, float f, Breakpoints breakpoints) {
        Modifier small;
        Intrinsics.checkNotNullParameter(breakpoint, "$this$breakpoint");
        Intrinsics.checkNotNullParameter(breakpoints, "breakpoints");
        int i = WhenMappings.$EnumSwitchMapping$0[Breakpoints3.INSTANCE.m27163fromDp0680j_4(f).ordinal()];
        if (i == 1) {
            small = breakpoints.getSmall();
        } else if (i == 2) {
            small = breakpoints.getMedium();
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            small = breakpoints.getLarge();
        }
        return breakpoint.then(small);
    }
}
