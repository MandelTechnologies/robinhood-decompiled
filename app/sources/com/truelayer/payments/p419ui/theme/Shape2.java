package com.truelayer.payments.p419ui.theme;

import androidx.compose.foundation.shape.GenericShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material3.Shapes;
import androidx.compose.p011ui.geometry.OffsetKt;
import androidx.compose.p011ui.geometry.Rect2;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.graphics.Path;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Shape.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"SemiCircle", "Landroidx/compose/foundation/shape/GenericShape;", "getSemiCircle", "()Landroidx/compose/foundation/shape/GenericShape;", "ShapeDefaults", "Landroidx/compose/material3/Shapes;", "getShapeDefaults", "()Landroidx/compose/material3/Shapes;", "payments-ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.truelayer.payments.ui.theme.ShapeKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class Shape2 {
    private static final GenericShape SemiCircle;
    private static final Shapes ShapeDefaults;

    static {
        Spacing spacing = Spacing.INSTANCE;
        ShapeDefaults = new Shapes(null, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(spacing.m27178getSMALLD9Ej5fM()), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(spacing.m27175getMEDIUMD9Ej5fM()), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(0)), null, 17, null);
        SemiCircle = new GenericShape(new Function3<Path, Size, LayoutDirection, Unit>() { // from class: com.truelayer.payments.ui.theme.ShapeKt$SemiCircle$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Path path, Size size, LayoutDirection layoutDirection) {
                m27173invoke12SF9DM(path, size.getPackedValue(), layoutDirection);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke-12SF9DM, reason: not valid java name */
            public final void m27173invoke12SF9DM(Path $receiver, long j, LayoutDirection layoutDirection) {
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                Intrinsics.checkNotNullParameter(layoutDirection, "<anonymous parameter 1>");
                $receiver.addArc(Rect2.m6565Recttz77jQw(OffsetKt.Offset(0.0f, Size.m6580getHeightimpl(j) / 2), j), 180.0f, 180.0f);
                $receiver.close();
            }
        });
    }

    public static final Shapes getShapeDefaults() {
        return ShapeDefaults;
    }

    public static final GenericShape getSemiCircle() {
        return SemiCircle;
    }
}
