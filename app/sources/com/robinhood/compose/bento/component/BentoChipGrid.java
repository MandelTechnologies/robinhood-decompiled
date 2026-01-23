package com.robinhood.compose.bento.component;

import androidx.compose.p011ui.unit.C2002Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BentoChipGrid.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\t\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\n\u0010\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/BentoChipGridDefaults;", "", "<init>", "()V", "horizontalSpacing", "Landroidx/compose/ui/unit/Dp;", "getHorizontalSpacing-D9Ej5fM", "()F", "F", "verticalSpacing", "getVerticalSpacing-D9Ej5fM", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.bento.component.BentoChipGridDefaults, reason: use source file name */
/* loaded from: classes15.dex */
final class BentoChipGrid {
    public static final BentoChipGrid INSTANCE = new BentoChipGrid();
    private static final float horizontalSpacing;
    private static final float verticalSpacing;

    private BentoChipGrid() {
    }

    /* renamed from: getHorizontalSpacing-D9Ej5fM, reason: not valid java name */
    public final float m20600getHorizontalSpacingD9Ej5fM() {
        return horizontalSpacing;
    }

    /* renamed from: getVerticalSpacing-D9Ej5fM, reason: not valid java name */
    public final float m20601getVerticalSpacingD9Ej5fM() {
        return verticalSpacing;
    }

    static {
        float f = 8;
        horizontalSpacing = C2002Dp.m7995constructorimpl(f);
        verticalSpacing = C2002Dp.m7995constructorimpl(f);
    }
}
