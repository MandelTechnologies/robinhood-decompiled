package com.robinhood.compose.bento.component.rows;

import androidx.compose.p011ui.unit.C2002Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BentoDataRow.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0013\u0010\t\u001a\u00020\n¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u000e\u001a\u00020\n¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0010\u001a\u00020\n¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0011\u0010\fR\u0013\u0010\u0012\u001a\u00020\n¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0013\u0010\f¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/BentoDataRowDefaults;", "", "<init>", "()V", "standardLabelMaxLines", "", "standardValueMaxLines", "condensedLabelMaxLines", "condensedValueMaxLines", "standardMinHeight", "Landroidx/compose/ui/unit/Dp;", "getStandardMinHeight-D9Ej5fM", "()F", "F", "condensedMinHeight", "getCondensedMinHeight-D9Ej5fM", "standardVerticalPadding", "getStandardVerticalPadding-D9Ej5fM", "condensedVerticalPadding", "getCondensedVerticalPadding-D9Ej5fM", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes15.dex */
public final class BentoDataRowDefaults {
    public static final int $stable = 0;
    public static final int condensedLabelMaxLines = 2;
    public static final int condensedValueMaxLines = 1;
    public static final int standardLabelMaxLines = 2;
    public static final int standardValueMaxLines = 3;
    public static final BentoDataRowDefaults INSTANCE = new BentoDataRowDefaults();
    private static final float standardMinHeight = C2002Dp.m7995constructorimpl(64);
    private static final float condensedMinHeight = C2002Dp.m7995constructorimpl(48);
    private static final float standardVerticalPadding = C2002Dp.m7995constructorimpl(8);
    private static final float condensedVerticalPadding = C2002Dp.m7995constructorimpl(12);

    private BentoDataRowDefaults() {
    }

    /* renamed from: getStandardMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m20964getStandardMinHeightD9Ej5fM() {
        return standardMinHeight;
    }

    /* renamed from: getCondensedMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m20962getCondensedMinHeightD9Ej5fM() {
        return condensedMinHeight;
    }

    /* renamed from: getStandardVerticalPadding-D9Ej5fM, reason: not valid java name */
    public final float m20965getStandardVerticalPaddingD9Ej5fM() {
        return standardVerticalPadding;
    }

    /* renamed from: getCondensedVerticalPadding-D9Ej5fM, reason: not valid java name */
    public final float m20963getCondensedVerticalPaddingD9Ej5fM() {
        return condensedVerticalPadding;
    }
}
