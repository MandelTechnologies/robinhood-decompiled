package com.robinhood.android.futures.eventbrackets.p141ui;

import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.Dp2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

/* compiled from: BracketHeightCalculationUtils.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001d\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0007\u001a\u0015\u0010\b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0007\u001a\u001d\u0010\b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006\u001a\u0015\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0007\u001a\u001d\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006\u001a\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0003H\u0001\"\u0010\u0010\u000e\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000f\"\u0010\u0010\u0010\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000f¨\u0006\u0011"}, m3636d2 = {"groupGapsSpacerHeight", "Landroidx/compose/ui/unit/Dp;", "visibleIndex", "", "offset", "", "(IF)F", "(I)F", "midOutChannelSpacerHeight", "topSpacerCardHeight", "cardsTotalHeightPx", "density", "Landroidx/compose/ui/unit/Density;", "numberOfCards", "TopRoundSpacer", "F", "MidGroupSpacer", "feature-event-brackets_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.futures.eventbrackets.ui.BracketHeightCalculationUtilsKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class BracketHeightCalculationUtils {
    private static final float TopRoundSpacer = C2002Dp.m7995constructorimpl(67);
    private static final float MidGroupSpacer = C2002Dp.m7995constructorimpl(73);

    public static final float groupGapsSpacerHeight(int i, float f) {
        if (i == 0 || f == 0.0f) {
            return groupGapsSpacerHeight(i);
        }
        float fGroupGapsSpacerHeight = groupGapsSpacerHeight(i);
        return C2002Dp.m7995constructorimpl(fGroupGapsSpacerHeight - C2002Dp.m7995constructorimpl(C2002Dp.m7995constructorimpl(fGroupGapsSpacerHeight - groupGapsSpacerHeight(i - 1)) * f));
    }

    private static final float groupGapsSpacerHeight(int i) {
        return C2002Dp.m7995constructorimpl(MidGroupSpacer + C2002Dp.m7995constructorimpl(BracketMatchOverviewCardWithChannels.getBracketCardHeight() * (i - 1)));
    }

    private static final float midOutChannelSpacerHeight(int i) {
        return C2002Dp.m7995constructorimpl(BracketMatchOverviewCardWithChannels.getBracketCardHeight() * ((1 << i) - 1));
    }

    public static final float midOutChannelSpacerHeight(int i, float f) {
        if (i == 0 || f == 0.0f) {
            return midOutChannelSpacerHeight(i);
        }
        return Dp2.m8007lerpMdfbLM(midOutChannelSpacerHeight(i), midOutChannelSpacerHeight(i - 1), f);
    }

    public static final float topSpacerCardHeight(int i, float f) {
        if (i == 0 || f == 0.0f) {
            return topSpacerCardHeight(i);
        }
        return Dp2.m8007lerpMdfbLM(topSpacerCardHeight(i), topSpacerCardHeight(i - 1), f);
    }

    public static final int cardsTotalHeightPx(Density density, int i) {
        Intrinsics.checkNotNullParameter(density, "density");
        return MathKt.roundToInt(density.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(BracketMatchOverviewCardWithChannels.getBracketCardHeight() * i)));
    }

    private static final float topSpacerCardHeight(int i) {
        if (i != 0) {
            return C2002Dp.m7995constructorimpl(TopRoundSpacer + C2002Dp.m7995constructorimpl(BracketMatchOverviewCardWithChannels.getBracketCardHeight() * (i != 1 ? (1 << (i - 1)) - 1 : 0)));
        }
        return C2002Dp.m7995constructorimpl(0);
    }
}
