package com.robinhood.android.equities.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.DialogFragmentKey;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InstrumentChartIntervalsKey.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0006\u0010\u0018\u001a\u00020\u0019J\u0013\u0010\u001a\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0006HÖ\u0001J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0019R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/equities/contracts/InstrumentChartIntervalsKey;", "Landroid/os/Parcelable;", "Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "screen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "instrumentId", "", "spanId", "candlesticks", "", "<init>", "(Lcom/robinhood/rosetta/eventlogging/Screen;Ljava/lang/String;Ljava/lang/String;Z)V", "getScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "getInstrumentId", "()Ljava/lang/String;", "getSpanId", "getCandlesticks", "()Z", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class InstrumentChartIntervalsKey implements Parcelable, DialogFragmentKey {
    public static final Parcelable.Creator<InstrumentChartIntervalsKey> CREATOR = new Creator();
    private final boolean candlesticks;
    private final String instrumentId;
    private final Screen screen;
    private final String spanId;

    /* compiled from: InstrumentChartIntervalsKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes3.dex */
    public static final class Creator implements Parcelable.Creator<InstrumentChartIntervalsKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InstrumentChartIntervalsKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InstrumentChartIntervalsKey((Screen) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InstrumentChartIntervalsKey[] newArray(int i) {
            return new InstrumentChartIntervalsKey[i];
        }
    }

    public static /* synthetic */ InstrumentChartIntervalsKey copy$default(InstrumentChartIntervalsKey instrumentChartIntervalsKey, Screen screen, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            screen = instrumentChartIntervalsKey.screen;
        }
        if ((i & 2) != 0) {
            str = instrumentChartIntervalsKey.instrumentId;
        }
        if ((i & 4) != 0) {
            str2 = instrumentChartIntervalsKey.spanId;
        }
        if ((i & 8) != 0) {
            z = instrumentChartIntervalsKey.candlesticks;
        }
        return instrumentChartIntervalsKey.copy(screen, str, str2, z);
    }

    /* renamed from: component1, reason: from getter */
    public final Screen getScreen() {
        return this.screen;
    }

    /* renamed from: component2, reason: from getter */
    public final String getInstrumentId() {
        return this.instrumentId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSpanId() {
        return this.spanId;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getCandlesticks() {
        return this.candlesticks;
    }

    public final InstrumentChartIntervalsKey copy(Screen screen, String instrumentId, String spanId, boolean candlesticks) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(spanId, "spanId");
        return new InstrumentChartIntervalsKey(screen, instrumentId, spanId, candlesticks);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InstrumentChartIntervalsKey)) {
            return false;
        }
        InstrumentChartIntervalsKey instrumentChartIntervalsKey = (InstrumentChartIntervalsKey) other;
        return Intrinsics.areEqual(this.screen, instrumentChartIntervalsKey.screen) && Intrinsics.areEqual(this.instrumentId, instrumentChartIntervalsKey.instrumentId) && Intrinsics.areEqual(this.spanId, instrumentChartIntervalsKey.spanId) && this.candlesticks == instrumentChartIntervalsKey.candlesticks;
    }

    public int hashCode() {
        return (((((this.screen.hashCode() * 31) + this.instrumentId.hashCode()) * 31) + this.spanId.hashCode()) * 31) + Boolean.hashCode(this.candlesticks);
    }

    public String toString() {
        return "InstrumentChartIntervalsKey(screen=" + this.screen + ", instrumentId=" + this.instrumentId + ", spanId=" + this.spanId + ", candlesticks=" + this.candlesticks + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.screen);
        dest.writeString(this.instrumentId);
        dest.writeString(this.spanId);
        dest.writeInt(this.candlesticks ? 1 : 0);
    }

    public InstrumentChartIntervalsKey(Screen screen, String instrumentId, String spanId, boolean z) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(spanId, "spanId");
        this.screen = screen;
        this.instrumentId = instrumentId;
        this.spanId = spanId;
        this.candlesticks = z;
    }

    public final Screen getScreen() {
        return this.screen;
    }

    public final String getInstrumentId() {
        return this.instrumentId;
    }

    public final String getSpanId() {
        return this.spanId;
    }

    public final boolean getCandlesticks() {
        return this.candlesticks;
    }
}
