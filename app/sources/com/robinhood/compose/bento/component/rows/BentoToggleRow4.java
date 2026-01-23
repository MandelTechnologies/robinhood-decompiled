package com.robinhood.compose.bento.component.rows;

import androidx.compose.p011ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: BentoToggleRow.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.compose.bento.component.rows.BentoToggleRowKt$BentoToggleRow$5$1$1, reason: use source file name */
/* loaded from: classes15.dex */
/* synthetic */ class BentoToggleRow4 extends FunctionReferenceImpl implements Function1<Color, Color> {
    BentoToggleRow4(Object obj) {
        super(1, obj, BentoToggleRow.class, "resolveOrFg", "resolveOrFg-afOx6l0(Landroidx/compose/ui/graphics/Color;)J", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Color invoke(Color color) {
        return Color.m6701boximpl(m21015invokeafOx6l0(color));
    }

    /* renamed from: invoke-afOx6l0, reason: not valid java name */
    public final long m21015invokeafOx6l0(Color color) {
        return ((BentoToggleRow) this.receiver).m21009resolveOrFgafOx6l0(color);
    }
}
