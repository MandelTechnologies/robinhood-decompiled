package com.robinhood.android.eventcontracts.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EventContractsNavigationKeys.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J)\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001c\u001a\u00020\bHÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/contracts/EventTradeActivityKey;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "eventOrderContext", "Lcom/robinhood/android/eventcontracts/contracts/EventTradeOrderContext;", "sourceScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "entryPoint", "", "<init>", "(Lcom/robinhood/android/eventcontracts/contracts/EventTradeOrderContext;Lcom/robinhood/rosetta/eventlogging/Screen;Ljava/lang/String;)V", "getEventOrderContext", "()Lcom/robinhood/android/eventcontracts/contracts/EventTradeOrderContext;", "getSourceScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "getEntryPoint", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EventTradeActivityKey implements IntentKey, Parcelable {
    public static final Parcelable.Creator<EventTradeActivityKey> CREATOR = new Creator();
    private final String entryPoint;
    private final EventTradeOrderContext eventOrderContext;
    private final Screen sourceScreen;

    /* compiled from: EventContractsNavigationKeys.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<EventTradeActivityKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EventTradeActivityKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EventTradeActivityKey(EventTradeOrderContext.CREATOR.createFromParcel(parcel), (Screen) parcel.readSerializable(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EventTradeActivityKey[] newArray(int i) {
            return new EventTradeActivityKey[i];
        }
    }

    public static /* synthetic */ EventTradeActivityKey copy$default(EventTradeActivityKey eventTradeActivityKey, EventTradeOrderContext eventTradeOrderContext, Screen screen, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            eventTradeOrderContext = eventTradeActivityKey.eventOrderContext;
        }
        if ((i & 2) != 0) {
            screen = eventTradeActivityKey.sourceScreen;
        }
        if ((i & 4) != 0) {
            str = eventTradeActivityKey.entryPoint;
        }
        return eventTradeActivityKey.copy(eventTradeOrderContext, screen, str);
    }

    /* renamed from: component1, reason: from getter */
    public final EventTradeOrderContext getEventOrderContext() {
        return this.eventOrderContext;
    }

    /* renamed from: component2, reason: from getter */
    public final Screen getSourceScreen() {
        return this.sourceScreen;
    }

    /* renamed from: component3, reason: from getter */
    public final String getEntryPoint() {
        return this.entryPoint;
    }

    public final EventTradeActivityKey copy(EventTradeOrderContext eventOrderContext, Screen sourceScreen, String entryPoint) {
        Intrinsics.checkNotNullParameter(eventOrderContext, "eventOrderContext");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        return new EventTradeActivityKey(eventOrderContext, sourceScreen, entryPoint);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventTradeActivityKey)) {
            return false;
        }
        EventTradeActivityKey eventTradeActivityKey = (EventTradeActivityKey) other;
        return Intrinsics.areEqual(this.eventOrderContext, eventTradeActivityKey.eventOrderContext) && Intrinsics.areEqual(this.sourceScreen, eventTradeActivityKey.sourceScreen) && Intrinsics.areEqual(this.entryPoint, eventTradeActivityKey.entryPoint);
    }

    public int hashCode() {
        int iHashCode = this.eventOrderContext.hashCode() * 31;
        Screen screen = this.sourceScreen;
        return ((iHashCode + (screen == null ? 0 : screen.hashCode())) * 31) + this.entryPoint.hashCode();
    }

    public String toString() {
        return "EventTradeActivityKey(eventOrderContext=" + this.eventOrderContext + ", sourceScreen=" + this.sourceScreen + ", entryPoint=" + this.entryPoint + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.eventOrderContext.writeToParcel(dest, flags);
        dest.writeSerializable(this.sourceScreen);
        dest.writeString(this.entryPoint);
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public EventTradeActivityKey(EventTradeOrderContext eventOrderContext, Screen screen, String entryPoint) {
        Intrinsics.checkNotNullParameter(eventOrderContext, "eventOrderContext");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        this.eventOrderContext = eventOrderContext;
        this.sourceScreen = screen;
        this.entryPoint = entryPoint;
    }

    public final EventTradeOrderContext getEventOrderContext() {
        return this.eventOrderContext;
    }

    public final Screen getSourceScreen() {
        return this.sourceScreen;
    }

    public final String getEntryPoint() {
        return this.entryPoint;
    }
}
