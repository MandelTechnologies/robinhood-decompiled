package com.robinhood.android.advisory.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentTab;
import com.robinhood.android.navigation.keys.TabFragmentKey;
import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import com.robinhood.models.api.BrokerageAccountType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvisoryFragmentKeys.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001%B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0006\u0010\u0018\u001a\u00020\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0007HÖ\u0001J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/advisory/contracts/AdvisoryOnboardingKey;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "entryPoint", "Lcom/robinhood/android/advisory/contracts/AdvisoryOnboardingKey$EntryPoint;", "source", "", "<init>", "(Lcom/robinhood/models/api/BrokerageAccountType;Lcom/robinhood/android/advisory/contracts/AdvisoryOnboardingKey$EntryPoint;Ljava/lang/String;)V", "getBrokerageAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "getEntryPoint", "()Lcom/robinhood/android/advisory/contracts/AdvisoryOnboardingKey$EntryPoint;", "getSource", "()Ljava/lang/String;", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "EntryPoint", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AdvisoryOnboardingKey implements TabFragmentKey {
    public static final Parcelable.Creator<AdvisoryOnboardingKey> CREATOR = new Creator();
    private final BrokerageAccountType brokerageAccountType;
    private final EntryPoint entryPoint;
    private final String source;

    /* compiled from: AdvisoryFragmentKeys.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<AdvisoryOnboardingKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AdvisoryOnboardingKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AdvisoryOnboardingKey(BrokerageAccountType.valueOf(parcel.readString()), (EntryPoint) parcel.readParcelable(AdvisoryOnboardingKey.class.getClassLoader()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AdvisoryOnboardingKey[] newArray(int i) {
            return new AdvisoryOnboardingKey[i];
        }
    }

    public static /* synthetic */ AdvisoryOnboardingKey copy$default(AdvisoryOnboardingKey advisoryOnboardingKey, BrokerageAccountType brokerageAccountType, EntryPoint entryPoint, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            brokerageAccountType = advisoryOnboardingKey.brokerageAccountType;
        }
        if ((i & 2) != 0) {
            entryPoint = advisoryOnboardingKey.entryPoint;
        }
        if ((i & 4) != 0) {
            str = advisoryOnboardingKey.source;
        }
        return advisoryOnboardingKey.copy(brokerageAccountType, entryPoint, str);
    }

    /* renamed from: component1, reason: from getter */
    public final BrokerageAccountType getBrokerageAccountType() {
        return this.brokerageAccountType;
    }

    /* renamed from: component2, reason: from getter */
    public final EntryPoint getEntryPoint() {
        return this.entryPoint;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    public final AdvisoryOnboardingKey copy(BrokerageAccountType brokerageAccountType, EntryPoint entryPoint, String source) {
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        return new AdvisoryOnboardingKey(brokerageAccountType, entryPoint, source);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvisoryOnboardingKey)) {
            return false;
        }
        AdvisoryOnboardingKey advisoryOnboardingKey = (AdvisoryOnboardingKey) other;
        return this.brokerageAccountType == advisoryOnboardingKey.brokerageAccountType && Intrinsics.areEqual(this.entryPoint, advisoryOnboardingKey.entryPoint) && Intrinsics.areEqual(this.source, advisoryOnboardingKey.source);
    }

    public int hashCode() {
        int iHashCode = ((this.brokerageAccountType.hashCode() * 31) + this.entryPoint.hashCode()) * 31;
        String str = this.source;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "AdvisoryOnboardingKey(brokerageAccountType=" + this.brokerageAccountType + ", entryPoint=" + this.entryPoint + ", source=" + this.source + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.brokerageAccountType.name());
        dest.writeParcelable(this.entryPoint, flags);
        dest.writeString(this.source);
    }

    public AdvisoryOnboardingKey(BrokerageAccountType brokerageAccountType, EntryPoint entryPoint, String str) {
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        this.brokerageAccountType = brokerageAccountType;
        this.entryPoint = entryPoint;
        this.source = str;
    }

    public final BrokerageAccountType getBrokerageAccountType() {
        return this.brokerageAccountType;
    }

    public /* synthetic */ AdvisoryOnboardingKey(BrokerageAccountType brokerageAccountType, EntryPoint entryPoint, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(brokerageAccountType, (i & 2) != 0 ? EntryPoint.ManuallySelectedAdvisory.INSTANCE : entryPoint, (i & 4) != 0 ? null : str);
    }

    public final EntryPoint getEntryPoint() {
        return this.entryPoint;
    }

    public final String getSource() {
        return this.source;
    }

    /* compiled from: AdvisoryFragmentKeys.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/advisory/contracts/AdvisoryOnboardingKey$EntryPoint;", "Landroid/os/Parcelable;", "ManuallySelectedAdvisory", "PreselectedAdvisory", "RxRSunset", "Lcom/robinhood/android/advisory/contracts/AdvisoryOnboardingKey$EntryPoint$ManuallySelectedAdvisory;", "Lcom/robinhood/android/advisory/contracts/AdvisoryOnboardingKey$EntryPoint$PreselectedAdvisory;", "Lcom/robinhood/android/advisory/contracts/AdvisoryOnboardingKey$EntryPoint$RxRSunset;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes7.dex */
    public interface EntryPoint extends Parcelable {

        /* compiled from: AdvisoryFragmentKeys.kt */
        @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/advisory/contracts/AdvisoryOnboardingKey$EntryPoint$ManuallySelectedAdvisory;", "Lcom/robinhood/android/advisory/contracts/AdvisoryOnboardingKey$EntryPoint;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ManuallySelectedAdvisory implements EntryPoint {
            public static final ManuallySelectedAdvisory INSTANCE = new ManuallySelectedAdvisory();
            public static final Parcelable.Creator<ManuallySelectedAdvisory> CREATOR = new Creator();

            /* compiled from: AdvisoryFragmentKeys.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<ManuallySelectedAdvisory> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ManuallySelectedAdvisory createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return ManuallySelectedAdvisory.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ManuallySelectedAdvisory[] newArray(int i) {
                    return new ManuallySelectedAdvisory[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof ManuallySelectedAdvisory);
            }

            public int hashCode() {
                return -478531290;
            }

            public String toString() {
                return "ManuallySelectedAdvisory";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }

            private ManuallySelectedAdvisory() {
            }
        }

        /* compiled from: AdvisoryFragmentKeys.kt */
        @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/advisory/contracts/AdvisoryOnboardingKey$EntryPoint$PreselectedAdvisory;", "Lcom/robinhood/android/advisory/contracts/AdvisoryOnboardingKey$EntryPoint;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class PreselectedAdvisory implements EntryPoint {
            public static final PreselectedAdvisory INSTANCE = new PreselectedAdvisory();
            public static final Parcelable.Creator<PreselectedAdvisory> CREATOR = new Creator();

            /* compiled from: AdvisoryFragmentKeys.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<PreselectedAdvisory> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PreselectedAdvisory createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return PreselectedAdvisory.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PreselectedAdvisory[] newArray(int i) {
                    return new PreselectedAdvisory[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof PreselectedAdvisory);
            }

            public int hashCode() {
                return -1933999368;
            }

            public String toString() {
                return "PreselectedAdvisory";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }

            private PreselectedAdvisory() {
            }
        }

        /* compiled from: AdvisoryFragmentKeys.kt */
        @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/advisory/contracts/AdvisoryOnboardingKey$EntryPoint$RxRSunset;", "Lcom/robinhood/android/advisory/contracts/AdvisoryOnboardingKey$EntryPoint;", "selfDirectedAccountNumber", "", "title", "subtitle", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSelfDirectedAccountNumber", "()Ljava/lang/String;", "getTitle", "getSubtitle", "getDisclosure", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class RxRSunset implements EntryPoint {
            public static final Parcelable.Creator<RxRSunset> CREATOR = new Creator();
            private final String disclosure;
            private final String selfDirectedAccountNumber;
            private final String subtitle;
            private final String title;

            /* compiled from: AdvisoryFragmentKeys.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<RxRSunset> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final RxRSunset createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new RxRSunset(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final RxRSunset[] newArray(int i) {
                    return new RxRSunset[i];
                }
            }

            public static /* synthetic */ RxRSunset copy$default(RxRSunset rxRSunset, String str, String str2, String str3, String str4, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = rxRSunset.selfDirectedAccountNumber;
                }
                if ((i & 2) != 0) {
                    str2 = rxRSunset.title;
                }
                if ((i & 4) != 0) {
                    str3 = rxRSunset.subtitle;
                }
                if ((i & 8) != 0) {
                    str4 = rxRSunset.disclosure;
                }
                return rxRSunset.copy(str, str2, str3, str4);
            }

            /* renamed from: component1, reason: from getter */
            public final String getSelfDirectedAccountNumber() {
                return this.selfDirectedAccountNumber;
            }

            /* renamed from: component2, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            /* renamed from: component3, reason: from getter */
            public final String getSubtitle() {
                return this.subtitle;
            }

            /* renamed from: component4, reason: from getter */
            public final String getDisclosure() {
                return this.disclosure;
            }

            public final RxRSunset copy(String selfDirectedAccountNumber, String title, String subtitle, String disclosure) {
                Intrinsics.checkNotNullParameter(selfDirectedAccountNumber, "selfDirectedAccountNumber");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                return new RxRSunset(selfDirectedAccountNumber, title, subtitle, disclosure);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof RxRSunset)) {
                    return false;
                }
                RxRSunset rxRSunset = (RxRSunset) other;
                return Intrinsics.areEqual(this.selfDirectedAccountNumber, rxRSunset.selfDirectedAccountNumber) && Intrinsics.areEqual(this.title, rxRSunset.title) && Intrinsics.areEqual(this.subtitle, rxRSunset.subtitle) && Intrinsics.areEqual(this.disclosure, rxRSunset.disclosure);
            }

            public int hashCode() {
                int iHashCode = ((((this.selfDirectedAccountNumber.hashCode() * 31) + this.title.hashCode()) * 31) + this.subtitle.hashCode()) * 31;
                String str = this.disclosure;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "RxRSunset(selfDirectedAccountNumber=" + this.selfDirectedAccountNumber + ", title=" + this.title + ", subtitle=" + this.subtitle + ", disclosure=" + this.disclosure + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.selfDirectedAccountNumber);
                dest.writeString(this.title);
                dest.writeString(this.subtitle);
                dest.writeString(this.disclosure);
            }

            public RxRSunset(String selfDirectedAccountNumber, String title, String subtitle, String str) {
                Intrinsics.checkNotNullParameter(selfDirectedAccountNumber, "selfDirectedAccountNumber");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                this.selfDirectedAccountNumber = selfDirectedAccountNumber;
                this.title = title;
                this.subtitle = subtitle;
                this.disclosure = str;
            }

            public final String getSelfDirectedAccountNumber() {
                return this.selfDirectedAccountNumber;
            }

            public final String getTitle() {
                return this.title;
            }

            public final String getSubtitle() {
                return this.subtitle;
            }

            public final String getDisclosure() {
                return this.disclosure;
            }
        }
    }

    @Override // com.robinhood.android.navigation.keys.TabFragmentKey
    public FragmentTab getDefaultTab() {
        return FragmentTab.SHOULD_NOT_BE_IN_TAB;
    }
}
