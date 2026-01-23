package com.robinhood.shared.common.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.DialogFragmentKey;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import microgram.android.MicrogramLaunchId;

/* compiled from: MicrogramBottomSheetFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BK\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\b\u0012\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001a\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\u0015\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\bHÆ\u0003J\u0011\u0010\u001d\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000bHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\rHÆ\u0003JQ\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\b2\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0006\u0010 \u001a\u00020!J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020!HÖ\u0001J\t\u0010'\u001a\u00020\u0006HÖ\u0001J\u0016\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020!R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\t\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006-"}, m3636d2 = {"Lcom/robinhood/shared/common/contracts/MicrogramBottomSheetFragmentKey;", "Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "Landroid/os/Parcelable;", "id", "Lmicrogram/android/MicrogramLaunchId;", "identifier", "", "metadata", "", "loggingEventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "loggingScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "<init>", "(Lmicrogram/android/MicrogramLaunchId;Ljava/lang/String;Ljava/util/Map;Lcom/robinhood/rosetta/eventlogging/Context;Lcom/robinhood/rosetta/eventlogging/Screen;)V", "getId", "()Lmicrogram/android/MicrogramLaunchId;", "getIdentifier", "()Ljava/lang/String;", "getMetadata", "()Ljava/util/Map;", "getLoggingEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "getLoggingScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final /* data */ class MicrogramBottomSheetFragmentKey implements DialogFragmentKey, Parcelable {
    public static final Parcelable.Creator<MicrogramBottomSheetFragmentKey> CREATOR = new Creator();
    private final MicrogramLaunchId id;
    private final String identifier;
    private final Context loggingEventContext;
    private final Screen loggingScreen;
    private final Map<String, String> metadata;

    /* compiled from: MicrogramBottomSheetFragmentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Creator implements Parcelable.Creator<MicrogramBottomSheetFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MicrogramBottomSheetFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            MicrogramLaunchId microgramLaunchId = (MicrogramLaunchId) parcel.readParcelable(MicrogramBottomSheetFragmentKey.class.getClassLoader());
            String string2 = parcel.readString();
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
            }
            return new MicrogramBottomSheetFragmentKey(microgramLaunchId, string2, linkedHashMap, (Context) parcel.readSerializable(), (Screen) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MicrogramBottomSheetFragmentKey[] newArray(int i) {
            return new MicrogramBottomSheetFragmentKey[i];
        }
    }

    public static /* synthetic */ MicrogramBottomSheetFragmentKey copy$default(MicrogramBottomSheetFragmentKey microgramBottomSheetFragmentKey, MicrogramLaunchId microgramLaunchId, String str, Map map, Context context, Screen screen, int i, Object obj) {
        if ((i & 1) != 0) {
            microgramLaunchId = microgramBottomSheetFragmentKey.id;
        }
        if ((i & 2) != 0) {
            str = microgramBottomSheetFragmentKey.identifier;
        }
        if ((i & 4) != 0) {
            map = microgramBottomSheetFragmentKey.metadata;
        }
        if ((i & 8) != 0) {
            context = microgramBottomSheetFragmentKey.loggingEventContext;
        }
        if ((i & 16) != 0) {
            screen = microgramBottomSheetFragmentKey.loggingScreen;
        }
        Screen screen2 = screen;
        Map map2 = map;
        return microgramBottomSheetFragmentKey.copy(microgramLaunchId, str, map2, context, screen2);
    }

    /* renamed from: component1, reason: from getter */
    public final MicrogramLaunchId getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getIdentifier() {
        return this.identifier;
    }

    public final Map<String, String> component3() {
        return this.metadata;
    }

    /* renamed from: component4, reason: from getter */
    public final Context getLoggingEventContext() {
        return this.loggingEventContext;
    }

    /* renamed from: component5, reason: from getter */
    public final Screen getLoggingScreen() {
        return this.loggingScreen;
    }

    public final MicrogramBottomSheetFragmentKey copy(MicrogramLaunchId id, String identifier, Map<String, String> metadata, Context loggingEventContext, Screen loggingScreen) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        return new MicrogramBottomSheetFragmentKey(id, identifier, metadata, loggingEventContext, loggingScreen);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MicrogramBottomSheetFragmentKey)) {
            return false;
        }
        MicrogramBottomSheetFragmentKey microgramBottomSheetFragmentKey = (MicrogramBottomSheetFragmentKey) other;
        return Intrinsics.areEqual(this.id, microgramBottomSheetFragmentKey.id) && Intrinsics.areEqual(this.identifier, microgramBottomSheetFragmentKey.identifier) && Intrinsics.areEqual(this.metadata, microgramBottomSheetFragmentKey.metadata) && Intrinsics.areEqual(this.loggingEventContext, microgramBottomSheetFragmentKey.loggingEventContext) && Intrinsics.areEqual(this.loggingScreen, microgramBottomSheetFragmentKey.loggingScreen);
    }

    public int hashCode() {
        int iHashCode = ((((this.id.hashCode() * 31) + this.identifier.hashCode()) * 31) + this.metadata.hashCode()) * 31;
        Context context = this.loggingEventContext;
        int iHashCode2 = (iHashCode + (context == null ? 0 : context.hashCode())) * 31;
        Screen screen = this.loggingScreen;
        return iHashCode2 + (screen != null ? screen.hashCode() : 0);
    }

    public String toString() {
        return "MicrogramBottomSheetFragmentKey(id=" + this.id + ", identifier=" + this.identifier + ", metadata=" + this.metadata + ", loggingEventContext=" + this.loggingEventContext + ", loggingScreen=" + this.loggingScreen + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.id, flags);
        dest.writeString(this.identifier);
        Map<String, String> map = this.metadata;
        dest.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            dest.writeString(entry.getKey());
            dest.writeString(entry.getValue());
        }
        dest.writeSerializable(this.loggingEventContext);
        dest.writeSerializable(this.loggingScreen);
    }

    public MicrogramBottomSheetFragmentKey(MicrogramLaunchId id, String identifier, Map<String, String> metadata, Context context, Screen screen) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        this.id = id;
        this.identifier = identifier;
        this.metadata = metadata;
        this.loggingEventContext = context;
        this.loggingScreen = screen;
    }

    public final MicrogramLaunchId getId() {
        return this.id;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public /* synthetic */ MicrogramBottomSheetFragmentKey(MicrogramLaunchId microgramLaunchId, String str, Map map, Context context, Screen screen, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(microgramLaunchId, str, (i & 4) != 0 ? MapsKt.emptyMap() : map, (i & 8) != 0 ? null : context, (i & 16) != 0 ? null : screen);
    }

    public final Map<String, String> getMetadata() {
        return this.metadata;
    }

    public final Context getLoggingEventContext() {
        return this.loggingEventContext;
    }

    public final Screen getLoggingScreen() {
        return this.loggingScreen;
    }
}
