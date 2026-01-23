package com.robinhood.android.acatsin.intro;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.acatsin.util.AcatsInScreenContext;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.models.api.bonfire.ApiAcatsBonusPromoInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsInIntroContract.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/acatsin/intro/AcatsInIntroContract;", "", "<init>", "()V", "Key", "Callbacks", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class AcatsInIntroContract {
    public static final int $stable = 0;
    public static final AcatsInIntroContract INSTANCE = new AcatsInIntroContract();

    /* compiled from: AcatsInIntroContract.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H&¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/acatsin/intro/AcatsInIntroContract$Callbacks;", "", "onBackFromIntro", "", "onForwardFromIntro", "success", "", "bonusShown", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onBackFromIntro();

        void onForwardFromIntro(boolean success, boolean bonusShown);
    }

    private AcatsInIntroContract() {
    }

    /* compiled from: AcatsInIntroContract.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J)\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/acatsin/intro/AcatsInIntroContract$Key;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "Landroid/os/Parcelable;", "screenContext", "Lcom/robinhood/android/acatsin/util/AcatsInScreenContext;", "bonusOnly", "", "promoInfo", "Lcom/robinhood/models/api/bonfire/ApiAcatsBonusPromoInfo;", "<init>", "(Lcom/robinhood/android/acatsin/util/AcatsInScreenContext;ZLcom/robinhood/models/api/bonfire/ApiAcatsBonusPromoInfo;)V", "getScreenContext", "()Lcom/robinhood/android/acatsin/util/AcatsInScreenContext;", "getBonusOnly", "()Z", "getPromoInfo", "()Lcom/robinhood/models/api/bonfire/ApiAcatsBonusPromoInfo;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes17.dex */
    public static final /* data */ class Key implements FragmentKey, Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Key> CREATOR = new Creator();
        private final boolean bonusOnly;
        private final ApiAcatsBonusPromoInfo promoInfo;
        private final AcatsInScreenContext screenContext;

        /* compiled from: AcatsInIntroContract.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes24.dex */
        public static final class Creator implements Parcelable.Creator<Key> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Key createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Key((AcatsInScreenContext) parcel.readParcelable(Key.class.getClassLoader()), parcel.readInt() != 0, (ApiAcatsBonusPromoInfo) parcel.readParcelable(Key.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Key[] newArray(int i) {
                return new Key[i];
            }
        }

        public static /* synthetic */ Key copy$default(Key key, AcatsInScreenContext acatsInScreenContext, boolean z, ApiAcatsBonusPromoInfo apiAcatsBonusPromoInfo, int i, Object obj) {
            if ((i & 1) != 0) {
                acatsInScreenContext = key.screenContext;
            }
            if ((i & 2) != 0) {
                z = key.bonusOnly;
            }
            if ((i & 4) != 0) {
                apiAcatsBonusPromoInfo = key.promoInfo;
            }
            return key.copy(acatsInScreenContext, z, apiAcatsBonusPromoInfo);
        }

        /* renamed from: component1, reason: from getter */
        public final AcatsInScreenContext getScreenContext() {
            return this.screenContext;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getBonusOnly() {
            return this.bonusOnly;
        }

        /* renamed from: component3, reason: from getter */
        public final ApiAcatsBonusPromoInfo getPromoInfo() {
            return this.promoInfo;
        }

        public final Key copy(AcatsInScreenContext screenContext, boolean bonusOnly, ApiAcatsBonusPromoInfo promoInfo) {
            Intrinsics.checkNotNullParameter(screenContext, "screenContext");
            return new Key(screenContext, bonusOnly, promoInfo);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Key)) {
                return false;
            }
            Key key = (Key) other;
            return Intrinsics.areEqual(this.screenContext, key.screenContext) && this.bonusOnly == key.bonusOnly && Intrinsics.areEqual(this.promoInfo, key.promoInfo);
        }

        public int hashCode() {
            int iHashCode = ((this.screenContext.hashCode() * 31) + Boolean.hashCode(this.bonusOnly)) * 31;
            ApiAcatsBonusPromoInfo apiAcatsBonusPromoInfo = this.promoInfo;
            return iHashCode + (apiAcatsBonusPromoInfo == null ? 0 : apiAcatsBonusPromoInfo.hashCode());
        }

        public String toString() {
            return "Key(screenContext=" + this.screenContext + ", bonusOnly=" + this.bonusOnly + ", promoInfo=" + this.promoInfo + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.screenContext, flags);
            dest.writeInt(this.bonusOnly ? 1 : 0);
            dest.writeParcelable(this.promoInfo, flags);
        }

        public Key(AcatsInScreenContext screenContext, boolean z, ApiAcatsBonusPromoInfo apiAcatsBonusPromoInfo) {
            Intrinsics.checkNotNullParameter(screenContext, "screenContext");
            this.screenContext = screenContext;
            this.bonusOnly = z;
            this.promoInfo = apiAcatsBonusPromoInfo;
        }

        public final AcatsInScreenContext getScreenContext() {
            return this.screenContext;
        }

        public final boolean getBonusOnly() {
            return this.bonusOnly;
        }

        public final ApiAcatsBonusPromoInfo getPromoInfo() {
            return this.promoInfo;
        }
    }
}
