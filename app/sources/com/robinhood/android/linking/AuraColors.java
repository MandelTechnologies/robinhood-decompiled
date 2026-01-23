package com.robinhood.android.linking;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Color2;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* compiled from: AuraColors.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\bR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/linking/AuraColors;", "", "<init>", "()V", "marketHourStandard", "", "Landroidx/compose/ui/graphics/Color;", "getMarketHourStandard", "()Ljava/util/List;", "marketHourOvernight", "getMarketHourOvernight", "marketHourClosed", "getMarketHourClosed", "marketHourExtendedEvening", "getMarketHourExtendedEvening", "marketHourExtendedMorning", "getMarketHourExtendedMorning", "up", "getUp", "down", "getDown", "lib-mobile-linking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class AuraColors {
    public static final int $stable;
    public static final AuraColors INSTANCE = new AuraColors();
    private static final List<Color> down;
    private static final List<Color> marketHourClosed;
    private static final List<Color> marketHourExtendedEvening;
    private static final List<Color> marketHourExtendedMorning;
    private static final List<Color> marketHourOvernight;
    private static final List<Color> marketHourStandard;
    private static final List<Color> up;

    private AuraColors() {
    }

    public final List<Color> getMarketHourStandard() {
        return marketHourStandard;
    }

    static {
        Color colorM6701boximpl = Color.m6701boximpl(Color.m6705copywmQWz5c$default(Color2.Color(4284337134L), 0.8f, 0.0f, 0.0f, 0.0f, 14, null));
        Color colorM6701boximpl2 = Color.m6701boximpl(Color.m6705copywmQWz5c$default(Color2.Color(4278335053L), 0.3f, 0.0f, 0.0f, 0.0f, 14, null));
        Color colorM6701boximpl3 = Color.m6701boximpl(Color.m6705copywmQWz5c$default(Color2.Color(4279971907L), 0.2f, 0.0f, 0.0f, 0.0f, 14, null));
        Color.Companion companion = Color.INSTANCE;
        marketHourStandard = CollectionsKt.listOf((Object[]) new Color[]{colorM6701boximpl, colorM6701boximpl2, colorM6701boximpl3, Color.m6701boximpl(Color.m6705copywmQWz5c$default(companion.m6716getBlack0d7_KjU(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null))});
        marketHourOvernight = CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color.m6705copywmQWz5c$default(Color2.Color(4282935954L), 0.6f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m6701boximpl(Color.m6705copywmQWz5c$default(Color2.Color(4281223018L), 0.6f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m6701boximpl(Color.m6705copywmQWz5c$default(Color2.Color(4279964725L), 0.36f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m6701boximpl(Color.m6705copywmQWz5c$default(companion.m6716getBlack0d7_KjU(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null))});
        marketHourClosed = CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color.m6705copywmQWz5c$default(Color2.Color(4287993508L), 0.6f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m6701boximpl(Color.m6705copywmQWz5c$default(Color2.Color(4282730064L), 0.6f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m6701boximpl(Color.m6705copywmQWz5c$default(Color2.Color(4280953388L), 0.24f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m6701boximpl(Color.m6705copywmQWz5c$default(companion.m6716getBlack0d7_KjU(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null))});
        marketHourExtendedEvening = CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color.m6705copywmQWz5c$default(Color2.Color(4292970839L), 0.6f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m6701boximpl(Color.m6705copywmQWz5c$default(Color2.Color(4289872706L), 0.6f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m6701boximpl(Color.m6705copywmQWz5c$default(Color2.Color(4282856779L), 0.6f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m6701boximpl(Color.m6705copywmQWz5c$default(Color2.Color(4279572805L), 0.36f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m6701boximpl(Color.m6705copywmQWz5c$default(Color2.Color(4279046186L), 0.12f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m6701boximpl(Color.m6705copywmQWz5c$default(companion.m6716getBlack0d7_KjU(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null))});
        marketHourExtendedMorning = CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color.m6705copywmQWz5c$default(Color2.Color(4294957500L), 0.5f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m6701boximpl(Color.m6705copywmQWz5c$default(Color2.Color(4293698730L), 0.5f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m6701boximpl(Color.m6705copywmQWz5c$default(Color2.Color(4286870646L), 0.5f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m6701boximpl(Color.m6705copywmQWz5c$default(Color2.Color(4278457408L), 0.3f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m6701boximpl(Color.m6705copywmQWz5c$default(Color2.Color(4278323224L), 0.1f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m6701boximpl(Color.m6705copywmQWz5c$default(companion.m6716getBlack0d7_KjU(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null))});
        up = CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color.m6705copywmQWz5c$default(Color2.Color(4294964150L), 0.4f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m6701boximpl(Color.m6705copywmQWz5c$default(Color2.Color(4289656332L), 0.3f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m6701boximpl(Color.m6705copywmQWz5c$default(Color2.Color(4279600450L), 0.2f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m6701boximpl(Color.m6705copywmQWz5c$default(Color2.Color(4278393356L), 0.1f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m6701boximpl(Color.m6705copywmQWz5c$default(companion.m6716getBlack0d7_KjU(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null))});
        down = CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color.m6705copywmQWz5c$default(Color2.Color(4294940310L), 0.4f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m6701boximpl(Color.m6705copywmQWz5c$default(Color2.Color(4294921292L), 0.25f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m6701boximpl(Color.m6705copywmQWz5c$default(Color2.Color(4294921356L), 0.15f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m6701boximpl(Color.m6705copywmQWz5c$default(Color2.Color(4278716952L), 0.1f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m6701boximpl(Color.m6705copywmQWz5c$default(companion.m6716getBlack0d7_KjU(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null))});
        $stable = 8;
    }

    public final List<Color> getMarketHourOvernight() {
        return marketHourOvernight;
    }

    public final List<Color> getMarketHourClosed() {
        return marketHourClosed;
    }

    public final List<Color> getMarketHourExtendedEvening() {
        return marketHourExtendedEvening;
    }

    public final List<Color> getMarketHourExtendedMorning() {
        return marketHourExtendedMorning;
    }

    public final List<Color> getUp() {
        return up;
    }

    public final List<Color> getDown() {
        return down;
    }
}
