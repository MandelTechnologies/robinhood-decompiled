package com.robinhood.android.rhyonboarding.contracts;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyUpgradeKey.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0015\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J+\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0006\u0010\u0011\u001a\u00020\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/rhyonboarding/contracts/RhyUpgradeKey;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "exitDeeplinkOverride", "Landroid/net/Uri;", "queryParameters", "", "", "<init>", "(Landroid/net/Uri;Ljava/util/Map;)V", "getExitDeeplinkOverride", "()Landroid/net/Uri;", "getQueryParameters", "()Ljava/util/Map;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class RhyUpgradeKey implements IntentKey, Parcelable {
    public static final Parcelable.Creator<RhyUpgradeKey> CREATOR = new Creator();
    private final Uri exitDeeplinkOverride;
    private final Map<String, String> queryParameters;

    /* compiled from: RhyUpgradeKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes5.dex */
    public static final class Creator implements Parcelable.Creator<RhyUpgradeKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RhyUpgradeKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Uri uri = (Uri) parcel.readParcelable(RhyUpgradeKey.class.getClassLoader());
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
            }
            return new RhyUpgradeKey(uri, linkedHashMap);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RhyUpgradeKey[] newArray(int i) {
            return new RhyUpgradeKey[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RhyUpgradeKey() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RhyUpgradeKey copy$default(RhyUpgradeKey rhyUpgradeKey, Uri uri, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            uri = rhyUpgradeKey.exitDeeplinkOverride;
        }
        if ((i & 2) != 0) {
            map = rhyUpgradeKey.queryParameters;
        }
        return rhyUpgradeKey.copy(uri, map);
    }

    /* renamed from: component1, reason: from getter */
    public final Uri getExitDeeplinkOverride() {
        return this.exitDeeplinkOverride;
    }

    public final Map<String, String> component2() {
        return this.queryParameters;
    }

    public final RhyUpgradeKey copy(Uri exitDeeplinkOverride, Map<String, String> queryParameters) {
        Intrinsics.checkNotNullParameter(queryParameters, "queryParameters");
        return new RhyUpgradeKey(exitDeeplinkOverride, queryParameters);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RhyUpgradeKey)) {
            return false;
        }
        RhyUpgradeKey rhyUpgradeKey = (RhyUpgradeKey) other;
        return Intrinsics.areEqual(this.exitDeeplinkOverride, rhyUpgradeKey.exitDeeplinkOverride) && Intrinsics.areEqual(this.queryParameters, rhyUpgradeKey.queryParameters);
    }

    public int hashCode() {
        Uri uri = this.exitDeeplinkOverride;
        return ((uri == null ? 0 : uri.hashCode()) * 31) + this.queryParameters.hashCode();
    }

    public String toString() {
        return "RhyUpgradeKey(exitDeeplinkOverride=" + this.exitDeeplinkOverride + ", queryParameters=" + this.queryParameters + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.exitDeeplinkOverride, flags);
        Map<String, String> map = this.queryParameters;
        dest.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            dest.writeString(entry.getKey());
            dest.writeString(entry.getValue());
        }
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public RhyUpgradeKey(Uri uri, Map<String, String> queryParameters) {
        Intrinsics.checkNotNullParameter(queryParameters, "queryParameters");
        this.exitDeeplinkOverride = uri;
        this.queryParameters = queryParameters;
    }

    public final Uri getExitDeeplinkOverride() {
        return this.exitDeeplinkOverride;
    }

    public /* synthetic */ RhyUpgradeKey(Uri uri, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uri, (i & 2) != 0 ? MapsKt.emptyMap() : map);
    }

    public final Map<String, String> getQueryParameters() {
        return this.queryParameters;
    }
}
