package com.robinhood.android.futures.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesNavigationKeys.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/futures/contracts/FuturesEventExplainerFragmentKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "contentfulId", "", "<init>", "(Ljava/lang/String;)V", "getContentfulId", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Callbacks", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class FuturesEventExplainerFragmentKey implements FragmentKey {
    public static final Parcelable.Creator<FuturesEventExplainerFragmentKey> CREATOR = new Creator();
    private final String contentfulId;

    /* compiled from: FuturesNavigationKeys.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/futures/contracts/FuturesEventExplainerFragmentKey$Callbacks;", "", "onDismissExplainer", "", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes3.dex */
    public interface Callbacks {
        void onDismissExplainer();
    }

    /* compiled from: FuturesNavigationKeys.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes3.dex */
    public static final class Creator implements Parcelable.Creator<FuturesEventExplainerFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FuturesEventExplainerFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FuturesEventExplainerFragmentKey(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FuturesEventExplainerFragmentKey[] newArray(int i) {
            return new FuturesEventExplainerFragmentKey[i];
        }
    }

    public static /* synthetic */ FuturesEventExplainerFragmentKey copy$default(FuturesEventExplainerFragmentKey futuresEventExplainerFragmentKey, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = futuresEventExplainerFragmentKey.contentfulId;
        }
        return futuresEventExplainerFragmentKey.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getContentfulId() {
        return this.contentfulId;
    }

    public final FuturesEventExplainerFragmentKey copy(String contentfulId) {
        Intrinsics.checkNotNullParameter(contentfulId, "contentfulId");
        return new FuturesEventExplainerFragmentKey(contentfulId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FuturesEventExplainerFragmentKey) && Intrinsics.areEqual(this.contentfulId, ((FuturesEventExplainerFragmentKey) other).contentfulId);
    }

    public int hashCode() {
        return this.contentfulId.hashCode();
    }

    public String toString() {
        return "FuturesEventExplainerFragmentKey(contentfulId=" + this.contentfulId + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.contentfulId);
    }

    public FuturesEventExplainerFragmentKey(String contentfulId) {
        Intrinsics.checkNotNullParameter(contentfulId, "contentfulId");
        this.contentfulId = contentfulId;
    }

    public final String getContentfulId() {
        return this.contentfulId;
    }
}
