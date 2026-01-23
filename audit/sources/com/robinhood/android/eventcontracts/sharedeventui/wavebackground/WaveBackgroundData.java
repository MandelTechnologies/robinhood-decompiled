package com.robinhood.android.eventcontracts.sharedeventui.wavebackground;

import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Path;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WaveBackgroundData.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\u0010\u0010\u0018\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0013J8\u0010\u001a\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/sharedeventui/wavebackground/WaveBackgroundData;", "Lcom/robinhood/android/eventcontracts/sharedeventui/wavebackground/EventContractBackgroundData;", "patternResId", "", "gradientPath", "Landroidx/compose/ui/graphics/Path;", "gradientBrush", "Landroidx/compose/ui/graphics/Brush;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "<init>", "(ILandroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Brush;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getPatternResId", "()I", "getGradientPath", "()Landroidx/compose/ui/graphics/Path;", "getGradientBrush", "()Landroidx/compose/ui/graphics/Brush;", "getBackgroundColor-0d7_KjU", "()J", "J", "component1", "component2", "component3", "component4", "component4-0d7_KjU", "copy", "copy-g2O1Hgs", "(ILandroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Brush;J)Lcom/robinhood/android/eventcontracts/sharedeventui/wavebackground/WaveBackgroundData;", "equals", "", "other", "", "hashCode", "toString", "", "lib-shared-event-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class WaveBackgroundData implements WaveBackgroundData2 {
    public static final int $stable = 0;
    private final long backgroundColor;
    private final Brush gradientBrush;
    private final Path gradientPath;
    private final int patternResId;

    public /* synthetic */ WaveBackgroundData(int i, Path path, Brush brush, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, path, brush, j);
    }

    /* renamed from: copy-g2O1Hgs$default, reason: not valid java name */
    public static /* synthetic */ WaveBackgroundData m14430copyg2O1Hgs$default(WaveBackgroundData waveBackgroundData, int i, Path path, Brush brush, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = waveBackgroundData.patternResId;
        }
        if ((i2 & 2) != 0) {
            path = waveBackgroundData.gradientPath;
        }
        if ((i2 & 4) != 0) {
            brush = waveBackgroundData.gradientBrush;
        }
        if ((i2 & 8) != 0) {
            j = waveBackgroundData.backgroundColor;
        }
        Brush brush2 = brush;
        return waveBackgroundData.m14432copyg2O1Hgs(i, path, brush2, j);
    }

    /* renamed from: component1, reason: from getter */
    public final int getPatternResId() {
        return this.patternResId;
    }

    /* renamed from: component2, reason: from getter */
    public final Path getGradientPath() {
        return this.gradientPath;
    }

    /* renamed from: component3, reason: from getter */
    public final Brush getGradientBrush() {
        return this.gradientBrush;
    }

    /* renamed from: component4-0d7_KjU, reason: not valid java name and from getter */
    public final long getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: copy-g2O1Hgs, reason: not valid java name */
    public final WaveBackgroundData m14432copyg2O1Hgs(int patternResId, Path gradientPath, Brush gradientBrush, long backgroundColor) {
        Intrinsics.checkNotNullParameter(gradientPath, "gradientPath");
        Intrinsics.checkNotNullParameter(gradientBrush, "gradientBrush");
        return new WaveBackgroundData(patternResId, gradientPath, gradientBrush, backgroundColor, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WaveBackgroundData)) {
            return false;
        }
        WaveBackgroundData waveBackgroundData = (WaveBackgroundData) other;
        return this.patternResId == waveBackgroundData.patternResId && Intrinsics.areEqual(this.gradientPath, waveBackgroundData.gradientPath) && Intrinsics.areEqual(this.gradientBrush, waveBackgroundData.gradientBrush) && Color.m6707equalsimpl0(this.backgroundColor, waveBackgroundData.backgroundColor);
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.patternResId) * 31) + this.gradientPath.hashCode()) * 31) + this.gradientBrush.hashCode()) * 31) + Color.m6713hashCodeimpl(this.backgroundColor);
    }

    public String toString() {
        return "WaveBackgroundData(patternResId=" + this.patternResId + ", gradientPath=" + this.gradientPath + ", gradientBrush=" + this.gradientBrush + ", backgroundColor=" + Color.m6714toStringimpl(this.backgroundColor) + ")";
    }

    private WaveBackgroundData(int i, Path gradientPath, Brush gradientBrush, long j) {
        Intrinsics.checkNotNullParameter(gradientPath, "gradientPath");
        Intrinsics.checkNotNullParameter(gradientBrush, "gradientBrush");
        this.patternResId = i;
        this.gradientPath = gradientPath;
        this.gradientBrush = gradientBrush;
        this.backgroundColor = j;
    }

    public final int getPatternResId() {
        return this.patternResId;
    }

    public final Path getGradientPath() {
        return this.gradientPath;
    }

    public final Brush getGradientBrush() {
        return this.gradientBrush;
    }

    @Override // com.robinhood.android.eventcontracts.sharedeventui.wavebackground.WaveBackgroundData2
    /* renamed from: getBackgroundColor-0d7_KjU */
    public long mo14426getBackgroundColor0d7_KjU() {
        return this.backgroundColor;
    }
}
