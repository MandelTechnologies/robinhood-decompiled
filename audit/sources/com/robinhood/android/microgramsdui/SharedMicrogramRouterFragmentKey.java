package com.robinhood.android.microgramsdui;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.shared.serverui.utils.UiObject;
import com.robinhood.microgram.sdui.InitialScreenData;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import microgram.android.MicrogramLaunchId;
import microgram.p507ui.p508v1.InitialScreenDataDto;

/* compiled from: SharedMicrogramRouterFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\b\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u0019\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\bHÆ\u0003J\u0015\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003JC\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\b2\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001J\u0006\u0010\u0018\u001a\u00020\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001f\u001a\u00020\u000bHÖ\u0001J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR!\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/microgramsdui/SharedMicrogramRouterFragmentKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "id", "Lmicrogram/android/MicrogramLaunchId;", "initialScreenData", "Lcom/robinhood/android/shared/serverui/utils/UiObject;", "Lcom/robinhood/microgram/sdui/InitialScreenData;", "Lmicrogram/ui/v1/InitialScreenDataDto;", "Lcom/robinhood/microgram/sdui/AnyInitialScreenData;", "metadata", "", "", "<init>", "(Lmicrogram/android/MicrogramLaunchId;Lcom/robinhood/android/shared/serverui/utils/UiObject;Ljava/util/Map;)V", "getId", "()Lmicrogram/android/MicrogramLaunchId;", "getInitialScreenData", "()Lcom/robinhood/android/shared/serverui/utils/UiObject;", "getMetadata", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-microgram-sdui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class SharedMicrogramRouterFragmentKey implements FragmentKey {
    public static final int $stable = 8;
    public static final Parcelable.Creator<SharedMicrogramRouterFragmentKey> CREATOR = new Creator();
    private final MicrogramLaunchId id;
    private final UiObject<InitialScreenData, InitialScreenDataDto> initialScreenData;
    private final Map<String, String> metadata;

    /* compiled from: SharedMicrogramRouterFragmentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes8.dex */
    public static final class Creator implements Parcelable.Creator<SharedMicrogramRouterFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SharedMicrogramRouterFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            MicrogramLaunchId microgramLaunchId = (MicrogramLaunchId) parcel.readParcelable(SharedMicrogramRouterFragmentKey.class.getClassLoader());
            UiObject uiObject = (UiObject) parcel.readParcelable(SharedMicrogramRouterFragmentKey.class.getClassLoader());
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
            }
            return new SharedMicrogramRouterFragmentKey(microgramLaunchId, uiObject, linkedHashMap);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SharedMicrogramRouterFragmentKey[] newArray(int i) {
            return new SharedMicrogramRouterFragmentKey[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SharedMicrogramRouterFragmentKey copy$default(SharedMicrogramRouterFragmentKey sharedMicrogramRouterFragmentKey, MicrogramLaunchId microgramLaunchId, UiObject uiObject, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            microgramLaunchId = sharedMicrogramRouterFragmentKey.id;
        }
        if ((i & 2) != 0) {
            uiObject = sharedMicrogramRouterFragmentKey.initialScreenData;
        }
        if ((i & 4) != 0) {
            map = sharedMicrogramRouterFragmentKey.metadata;
        }
        return sharedMicrogramRouterFragmentKey.copy(microgramLaunchId, uiObject, map);
    }

    /* renamed from: component1, reason: from getter */
    public final MicrogramLaunchId getId() {
        return this.id;
    }

    public final UiObject<InitialScreenData, InitialScreenDataDto> component2() {
        return this.initialScreenData;
    }

    public final Map<String, String> component3() {
        return this.metadata;
    }

    public final SharedMicrogramRouterFragmentKey copy(MicrogramLaunchId id, UiObject<InitialScreenData, InitialScreenDataDto> initialScreenData, Map<String, String> metadata) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(initialScreenData, "initialScreenData");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        return new SharedMicrogramRouterFragmentKey(id, initialScreenData, metadata);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SharedMicrogramRouterFragmentKey)) {
            return false;
        }
        SharedMicrogramRouterFragmentKey sharedMicrogramRouterFragmentKey = (SharedMicrogramRouterFragmentKey) other;
        return Intrinsics.areEqual(this.id, sharedMicrogramRouterFragmentKey.id) && Intrinsics.areEqual(this.initialScreenData, sharedMicrogramRouterFragmentKey.initialScreenData) && Intrinsics.areEqual(this.metadata, sharedMicrogramRouterFragmentKey.metadata);
    }

    public int hashCode() {
        return (((this.id.hashCode() * 31) + this.initialScreenData.hashCode()) * 31) + this.metadata.hashCode();
    }

    public String toString() {
        return "SharedMicrogramRouterFragmentKey(id=" + this.id + ", initialScreenData=" + this.initialScreenData + ", metadata=" + this.metadata + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.id, flags);
        dest.writeParcelable(this.initialScreenData, flags);
        Map<String, String> map = this.metadata;
        dest.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            dest.writeString(entry.getKey());
            dest.writeString(entry.getValue());
        }
    }

    public SharedMicrogramRouterFragmentKey(MicrogramLaunchId id, UiObject<InitialScreenData, InitialScreenDataDto> initialScreenData, Map<String, String> metadata) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(initialScreenData, "initialScreenData");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        this.id = id;
        this.initialScreenData = initialScreenData;
        this.metadata = metadata;
    }

    public final MicrogramLaunchId getId() {
        return this.id;
    }

    public final UiObject<InitialScreenData, InitialScreenDataDto> getInitialScreenData() {
        return this.initialScreenData;
    }

    public /* synthetic */ SharedMicrogramRouterFragmentKey(MicrogramLaunchId microgramLaunchId, UiObject uiObject, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(microgramLaunchId, uiObject, (i & 4) != 0 ? MapsKt.emptyMap() : map);
    }

    public final Map<String, String> getMetadata() {
        return this.metadata;
    }
}
