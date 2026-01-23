package com.robinhood.android.charts.span;

import androidx.compose.p011ui.unit.C2002Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SpanSelector.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u0013\u0010\n\u001a\u00020\u000b¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/charts/span/SpanConstants;", "", "<init>", "()V", "minimumSpansForScroll", "", "spanButtonShapeCornerRadiusDp", "spanWeight", "", "blinkingSpanWeight", "betweenSpanSpace", "Landroidx/compose/ui/unit/Dp;", "getBetweenSpanSpace-D9Ej5fM", "()F", "F", "lib-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.charts.span.SpanConstants, reason: use source file name */
/* loaded from: classes7.dex */
public final class SpanSelector2 {
    public static final int $stable = 0;
    public static final SpanSelector2 INSTANCE = new SpanSelector2();
    private static final float betweenSpanSpace = C2002Dp.m7995constructorimpl(4);
    public static final float blinkingSpanWeight = 1.2f;
    public static final int minimumSpansForScroll = 8;
    public static final int spanButtonShapeCornerRadiusDp = 8;
    public static final float spanWeight = 1.0f;

    private SpanSelector2() {
    }

    /* renamed from: getBetweenSpanSpace-D9Ej5fM, reason: not valid java name */
    public final float m12141getBetweenSpanSpaceD9Ej5fM() {
        return betweenSpanSpace;
    }
}
