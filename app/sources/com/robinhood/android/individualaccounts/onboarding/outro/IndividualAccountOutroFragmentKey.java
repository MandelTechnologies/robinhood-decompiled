package com.robinhood.android.individualaccounts.onboarding.outro;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IndividualAccountOutroFragmentKey.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/individualaccounts/onboarding/outro/IndividualAccountOutroFragmentKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "applicationId", "", "source", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getApplicationId", "()Ljava/lang/String;", "getSource", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-individual-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class IndividualAccountOutroFragmentKey implements FragmentKey {
    public static final int $stable = 0;
    public static final Parcelable.Creator<IndividualAccountOutroFragmentKey> CREATOR = new Creator();
    private final String applicationId;
    private final String source;

    /* compiled from: IndividualAccountOutroFragmentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<IndividualAccountOutroFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IndividualAccountOutroFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new IndividualAccountOutroFragmentKey(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IndividualAccountOutroFragmentKey[] newArray(int i) {
            return new IndividualAccountOutroFragmentKey[i];
        }
    }

    public static /* synthetic */ IndividualAccountOutroFragmentKey copy$default(IndividualAccountOutroFragmentKey individualAccountOutroFragmentKey, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = individualAccountOutroFragmentKey.applicationId;
        }
        if ((i & 2) != 0) {
            str2 = individualAccountOutroFragmentKey.source;
        }
        return individualAccountOutroFragmentKey.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getApplicationId() {
        return this.applicationId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    public final IndividualAccountOutroFragmentKey copy(String applicationId, String source) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        return new IndividualAccountOutroFragmentKey(applicationId, source);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IndividualAccountOutroFragmentKey)) {
            return false;
        }
        IndividualAccountOutroFragmentKey individualAccountOutroFragmentKey = (IndividualAccountOutroFragmentKey) other;
        return Intrinsics.areEqual(this.applicationId, individualAccountOutroFragmentKey.applicationId) && Intrinsics.areEqual(this.source, individualAccountOutroFragmentKey.source);
    }

    public int hashCode() {
        int iHashCode = this.applicationId.hashCode() * 31;
        String str = this.source;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "IndividualAccountOutroFragmentKey(applicationId=" + this.applicationId + ", source=" + this.source + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.applicationId);
        dest.writeString(this.source);
    }

    public IndividualAccountOutroFragmentKey(String applicationId, String str) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        this.applicationId = applicationId;
        this.source = str;
    }

    public /* synthetic */ IndividualAccountOutroFragmentKey(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2);
    }

    public final String getApplicationId() {
        return this.applicationId;
    }

    public final String getSource() {
        return this.source;
    }
}
