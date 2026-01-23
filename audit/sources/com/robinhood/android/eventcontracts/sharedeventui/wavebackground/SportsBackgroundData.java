package com.robinhood.android.eventcontracts.sharedeventui.wavebackground;

import androidx.compose.p011ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: WaveBackgroundData.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/sharedeventui/wavebackground/SportsBackgroundData;", "Lcom/robinhood/android/eventcontracts/sharedeventui/wavebackground/EventContractBackgroundData;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "<init>", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBackgroundColor-0d7_KjU", "()J", "J", "component1", "component1-0d7_KjU", "copy", "copy-8_81llA", "(J)Lcom/robinhood/android/eventcontracts/sharedeventui/wavebackground/SportsBackgroundData;", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-shared-event-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SportsBackgroundData implements WaveBackgroundData2 {
    public static final int $stable = 0;
    private final long backgroundColor;

    public /* synthetic */ SportsBackgroundData(long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(j);
    }

    /* renamed from: copy-8_81llA$default, reason: not valid java name */
    public static /* synthetic */ SportsBackgroundData m14427copy8_81llA$default(SportsBackgroundData sportsBackgroundData, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = sportsBackgroundData.backgroundColor;
        }
        return sportsBackgroundData.m14429copy8_81llA(j);
    }

    /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
    public final long getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: copy-8_81llA, reason: not valid java name */
    public final SportsBackgroundData m14429copy8_81llA(long backgroundColor) {
        return new SportsBackgroundData(backgroundColor, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SportsBackgroundData) && Color.m6707equalsimpl0(this.backgroundColor, ((SportsBackgroundData) other).backgroundColor);
    }

    public int hashCode() {
        return Color.m6713hashCodeimpl(this.backgroundColor);
    }

    public String toString() {
        return "SportsBackgroundData(backgroundColor=" + Color.m6714toStringimpl(this.backgroundColor) + ")";
    }

    private SportsBackgroundData(long j) {
        this.backgroundColor = j;
    }

    @Override // com.robinhood.android.eventcontracts.sharedeventui.wavebackground.WaveBackgroundData2
    /* renamed from: getBackgroundColor-0d7_KjU */
    public long mo14426getBackgroundColor0d7_KjU() {
        return this.backgroundColor;
    }
}
