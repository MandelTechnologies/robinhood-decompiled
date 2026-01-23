package com.robinhood.android.equities.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.DialogFragmentKey;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdtInstrumentInfoKey.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\u0010\u0007\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\r\u0010\u0014\u001a\u00060\bj\u0002`\tHÆ\u0003J+\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\f\b\u0002\u0010\u0007\u001a\u00060\bj\u0002`\tHÆ\u0001J\u0006\u0010\u0016\u001a\u00020\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0017R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0007\u001a\u00060\bj\u0002`\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/equities/contracts/AdtInstrumentInfoKey;", "Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "Landroid/os/Parcelable;", "instrumentId", "Ljava/util/UUID;", "screen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "context", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/rosetta/eventlogging/Context;)V", "getInstrumentId", "()Ljava/util/UUID;", "getScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "getContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AdtInstrumentInfoKey implements DialogFragmentKey, Parcelable {
    public static final Parcelable.Creator<AdtInstrumentInfoKey> CREATOR = new Creator();
    private final Context context;
    private final UUID instrumentId;
    private final Screen screen;

    /* compiled from: AdtInstrumentInfoKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes3.dex */
    public static final class Creator implements Parcelable.Creator<AdtInstrumentInfoKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AdtInstrumentInfoKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AdtInstrumentInfoKey((UUID) parcel.readSerializable(), (Screen) parcel.readSerializable(), (Context) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AdtInstrumentInfoKey[] newArray(int i) {
            return new AdtInstrumentInfoKey[i];
        }
    }

    public static /* synthetic */ AdtInstrumentInfoKey copy$default(AdtInstrumentInfoKey adtInstrumentInfoKey, UUID uuid, Screen screen, Context context, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = adtInstrumentInfoKey.instrumentId;
        }
        if ((i & 2) != 0) {
            screen = adtInstrumentInfoKey.screen;
        }
        if ((i & 4) != 0) {
            context = adtInstrumentInfoKey.context;
        }
        return adtInstrumentInfoKey.copy(uuid, screen, context);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getInstrumentId() {
        return this.instrumentId;
    }

    /* renamed from: component2, reason: from getter */
    public final Screen getScreen() {
        return this.screen;
    }

    /* renamed from: component3, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    public final AdtInstrumentInfoKey copy(UUID instrumentId, Screen screen, Context context) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(context, "context");
        return new AdtInstrumentInfoKey(instrumentId, screen, context);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdtInstrumentInfoKey)) {
            return false;
        }
        AdtInstrumentInfoKey adtInstrumentInfoKey = (AdtInstrumentInfoKey) other;
        return Intrinsics.areEqual(this.instrumentId, adtInstrumentInfoKey.instrumentId) && Intrinsics.areEqual(this.screen, adtInstrumentInfoKey.screen) && Intrinsics.areEqual(this.context, adtInstrumentInfoKey.context);
    }

    public int hashCode() {
        return (((this.instrumentId.hashCode() * 31) + this.screen.hashCode()) * 31) + this.context.hashCode();
    }

    public String toString() {
        return "AdtInstrumentInfoKey(instrumentId=" + this.instrumentId + ", screen=" + this.screen + ", context=" + this.context + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.instrumentId);
        dest.writeSerializable(this.screen);
        dest.writeSerializable(this.context);
    }

    public AdtInstrumentInfoKey(UUID instrumentId, Screen screen, Context context) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(context, "context");
        this.instrumentId = instrumentId;
        this.screen = screen;
        this.context = context;
    }

    public final UUID getInstrumentId() {
        return this.instrumentId;
    }

    public final Screen getScreen() {
        return this.screen;
    }

    public final Context getContext() {
        return this.context;
    }
}
