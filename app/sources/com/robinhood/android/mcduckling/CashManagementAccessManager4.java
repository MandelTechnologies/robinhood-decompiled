package com.robinhood.android.mcduckling;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.models.p320db.rhy.RhyTabState;
import com.robinhood.shared.discovery.sdui.SduiFeatureDiscovery3;
import com.robinhood.staticcontent.model.productmarketing.ProductMarketingContent;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CashManagementAccessManager.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/mcduckling/CashTabAccessState;", "Landroid/os/Parcelable;", "<init>", "()V", "RhyOverview", "RhyWaitlist", "RhyFullScreenInfo", "RhyPendingScreenInfo", "RhyOnboarding", "CreditCardWaitlist", "Lcom/robinhood/android/mcduckling/CashTabAccessState$CreditCardWaitlist;", "Lcom/robinhood/android/mcduckling/CashTabAccessState$RhyFullScreenInfo;", "Lcom/robinhood/android/mcduckling/CashTabAccessState$RhyOnboarding;", "Lcom/robinhood/android/mcduckling/CashTabAccessState$RhyOverview;", "Lcom/robinhood/android/mcduckling/CashTabAccessState$RhyPendingScreenInfo;", "Lcom/robinhood/android/mcduckling/CashTabAccessState$RhyWaitlist;", "lib-tab-spending_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.mcduckling.CashTabAccessState, reason: use source file name */
/* loaded from: classes8.dex */
public abstract class CashManagementAccessManager4 implements Parcelable {
    public /* synthetic */ CashManagementAccessManager4(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CashManagementAccessManager4() {
    }

    /* compiled from: CashManagementAccessManager.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/mcduckling/CashTabAccessState$RhyOverview;", "Lcom/robinhood/android/mcduckling/CashTabAccessState;", "fragmentKey", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "<init>", "(Lcom/robinhood/android/navigation/keys/FragmentKey;)V", "getFragmentKey", "()Lcom/robinhood/android/navigation/keys/FragmentKey;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-tab-spending_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.mcduckling.CashTabAccessState$RhyOverview, reason: from toString */
    public static final /* data */ class RhyOverview extends CashManagementAccessManager4 {
        public static final Parcelable.Creator<RhyOverview> CREATOR = new Creator();
        private final FragmentKey fragmentKey;

        /* compiled from: CashManagementAccessManager.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.mcduckling.CashTabAccessState$RhyOverview$Creator */
        public static final class Creator implements Parcelable.Creator<RhyOverview> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RhyOverview createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RhyOverview((FragmentKey) parcel.readParcelable(RhyOverview.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RhyOverview[] newArray(int i) {
                return new RhyOverview[i];
            }
        }

        public static /* synthetic */ RhyOverview copy$default(RhyOverview rhyOverview, FragmentKey fragmentKey, int i, Object obj) {
            if ((i & 1) != 0) {
                fragmentKey = rhyOverview.fragmentKey;
            }
            return rhyOverview.copy(fragmentKey);
        }

        /* renamed from: component1, reason: from getter */
        public final FragmentKey getFragmentKey() {
            return this.fragmentKey;
        }

        public final RhyOverview copy(FragmentKey fragmentKey) {
            Intrinsics.checkNotNullParameter(fragmentKey, "fragmentKey");
            return new RhyOverview(fragmentKey);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RhyOverview) && Intrinsics.areEqual(this.fragmentKey, ((RhyOverview) other).fragmentKey);
        }

        public int hashCode() {
            return this.fragmentKey.hashCode();
        }

        public String toString() {
            return "RhyOverview(fragmentKey=" + this.fragmentKey + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.fragmentKey, flags);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RhyOverview(FragmentKey fragmentKey) {
            super(null);
            Intrinsics.checkNotNullParameter(fragmentKey, "fragmentKey");
            this.fragmentKey = fragmentKey;
        }

        public final FragmentKey getFragmentKey() {
            return this.fragmentKey;
        }
    }

    /* compiled from: CashManagementAccessManager.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/mcduckling/CashTabAccessState$RhyWaitlist;", "Lcom/robinhood/android/mcduckling/CashTabAccessState;", "fragmentKey", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "<init>", "(Lcom/robinhood/android/navigation/keys/FragmentKey;)V", "getFragmentKey", "()Lcom/robinhood/android/navigation/keys/FragmentKey;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-tab-spending_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.mcduckling.CashTabAccessState$RhyWaitlist, reason: from toString */
    public static final /* data */ class RhyWaitlist extends CashManagementAccessManager4 {
        public static final Parcelable.Creator<RhyWaitlist> CREATOR = new Creator();
        private final FragmentKey fragmentKey;

        /* compiled from: CashManagementAccessManager.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.mcduckling.CashTabAccessState$RhyWaitlist$Creator */
        public static final class Creator implements Parcelable.Creator<RhyWaitlist> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RhyWaitlist createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RhyWaitlist((FragmentKey) parcel.readParcelable(RhyWaitlist.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RhyWaitlist[] newArray(int i) {
                return new RhyWaitlist[i];
            }
        }

        public static /* synthetic */ RhyWaitlist copy$default(RhyWaitlist rhyWaitlist, FragmentKey fragmentKey, int i, Object obj) {
            if ((i & 1) != 0) {
                fragmentKey = rhyWaitlist.fragmentKey;
            }
            return rhyWaitlist.copy(fragmentKey);
        }

        /* renamed from: component1, reason: from getter */
        public final FragmentKey getFragmentKey() {
            return this.fragmentKey;
        }

        public final RhyWaitlist copy(FragmentKey fragmentKey) {
            Intrinsics.checkNotNullParameter(fragmentKey, "fragmentKey");
            return new RhyWaitlist(fragmentKey);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RhyWaitlist) && Intrinsics.areEqual(this.fragmentKey, ((RhyWaitlist) other).fragmentKey);
        }

        public int hashCode() {
            return this.fragmentKey.hashCode();
        }

        public String toString() {
            return "RhyWaitlist(fragmentKey=" + this.fragmentKey + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.fragmentKey, flags);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RhyWaitlist(FragmentKey fragmentKey) {
            super(null);
            Intrinsics.checkNotNullParameter(fragmentKey, "fragmentKey");
            this.fragmentKey = fragmentKey;
        }

        public final FragmentKey getFragmentKey() {
            return this.fragmentKey;
        }
    }

    /* compiled from: CashManagementAccessManager.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/mcduckling/CashTabAccessState$RhyFullScreenInfo;", "Lcom/robinhood/android/mcduckling/CashTabAccessState;", SduiFeatureDiscovery3.INFO_TAG, "Lcom/robinhood/models/db/rhy/RhyTabState$Info;", "<init>", "(Lcom/robinhood/models/db/rhy/RhyTabState$Info;)V", "getInfo", "()Lcom/robinhood/models/db/rhy/RhyTabState$Info;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-tab-spending_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.mcduckling.CashTabAccessState$RhyFullScreenInfo, reason: from toString */
    public static final /* data */ class RhyFullScreenInfo extends CashManagementAccessManager4 {
        public static final Parcelable.Creator<RhyFullScreenInfo> CREATOR = new Creator();
        private final RhyTabState.Info info;

        /* compiled from: CashManagementAccessManager.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.mcduckling.CashTabAccessState$RhyFullScreenInfo$Creator */
        public static final class Creator implements Parcelable.Creator<RhyFullScreenInfo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RhyFullScreenInfo createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RhyFullScreenInfo((RhyTabState.Info) parcel.readParcelable(RhyFullScreenInfo.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RhyFullScreenInfo[] newArray(int i) {
                return new RhyFullScreenInfo[i];
            }
        }

        public static /* synthetic */ RhyFullScreenInfo copy$default(RhyFullScreenInfo rhyFullScreenInfo, RhyTabState.Info info, int i, Object obj) {
            if ((i & 1) != 0) {
                info = rhyFullScreenInfo.info;
            }
            return rhyFullScreenInfo.copy(info);
        }

        /* renamed from: component1, reason: from getter */
        public final RhyTabState.Info getInfo() {
            return this.info;
        }

        public final RhyFullScreenInfo copy(RhyTabState.Info info) {
            Intrinsics.checkNotNullParameter(info, "info");
            return new RhyFullScreenInfo(info);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RhyFullScreenInfo) && Intrinsics.areEqual(this.info, ((RhyFullScreenInfo) other).info);
        }

        public int hashCode() {
            return this.info.hashCode();
        }

        public String toString() {
            return "RhyFullScreenInfo(info=" + this.info + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.info, flags);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RhyFullScreenInfo(RhyTabState.Info info) {
            super(null);
            Intrinsics.checkNotNullParameter(info, "info");
            this.info = info;
        }

        public final RhyTabState.Info getInfo() {
            return this.info;
        }
    }

    /* compiled from: CashManagementAccessManager.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/mcduckling/CashTabAccessState$RhyPendingScreenInfo;", "Lcom/robinhood/android/mcduckling/CashTabAccessState;", SduiFeatureDiscovery3.INFO_TAG, "Lcom/robinhood/models/db/rhy/RhyTabState$Info;", "<init>", "(Lcom/robinhood/models/db/rhy/RhyTabState$Info;)V", "getInfo", "()Lcom/robinhood/models/db/rhy/RhyTabState$Info;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-tab-spending_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.mcduckling.CashTabAccessState$RhyPendingScreenInfo, reason: from toString */
    public static final /* data */ class RhyPendingScreenInfo extends CashManagementAccessManager4 {
        public static final Parcelable.Creator<RhyPendingScreenInfo> CREATOR = new Creator();
        private final RhyTabState.Info info;

        /* compiled from: CashManagementAccessManager.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.mcduckling.CashTabAccessState$RhyPendingScreenInfo$Creator */
        public static final class Creator implements Parcelable.Creator<RhyPendingScreenInfo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RhyPendingScreenInfo createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RhyPendingScreenInfo((RhyTabState.Info) parcel.readParcelable(RhyPendingScreenInfo.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RhyPendingScreenInfo[] newArray(int i) {
                return new RhyPendingScreenInfo[i];
            }
        }

        public static /* synthetic */ RhyPendingScreenInfo copy$default(RhyPendingScreenInfo rhyPendingScreenInfo, RhyTabState.Info info, int i, Object obj) {
            if ((i & 1) != 0) {
                info = rhyPendingScreenInfo.info;
            }
            return rhyPendingScreenInfo.copy(info);
        }

        /* renamed from: component1, reason: from getter */
        public final RhyTabState.Info getInfo() {
            return this.info;
        }

        public final RhyPendingScreenInfo copy(RhyTabState.Info info) {
            Intrinsics.checkNotNullParameter(info, "info");
            return new RhyPendingScreenInfo(info);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RhyPendingScreenInfo) && Intrinsics.areEqual(this.info, ((RhyPendingScreenInfo) other).info);
        }

        public int hashCode() {
            return this.info.hashCode();
        }

        public String toString() {
            return "RhyPendingScreenInfo(info=" + this.info + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.info, flags);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RhyPendingScreenInfo(RhyTabState.Info info) {
            super(null);
            Intrinsics.checkNotNullParameter(info, "info");
            this.info = info;
        }

        public final RhyTabState.Info getInfo() {
            return this.info;
        }
    }

    /* compiled from: CashManagementAccessManager.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001cB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/mcduckling/CashTabAccessState$RhyOnboarding;", "Lcom/robinhood/android/mcduckling/CashTabAccessState;", "content", "Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketingContent;", "hasClosedCashManagementBanner", "", "<init>", "(Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketingContent;Z)V", "getContent", "()Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketingContent;", "getHasClosedCashManagementBanner", "()Z", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "IntroContext", "lib-tab-spending_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.mcduckling.CashTabAccessState$RhyOnboarding, reason: from toString */
    public static final /* data */ class RhyOnboarding extends CashManagementAccessManager4 {
        public static final Parcelable.Creator<RhyOnboarding> CREATOR = new Creator();
        private final ProductMarketingContent content;
        private final boolean hasClosedCashManagementBanner;

        /* compiled from: CashManagementAccessManager.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.mcduckling.CashTabAccessState$RhyOnboarding$Creator */
        public static final class Creator implements Parcelable.Creator<RhyOnboarding> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RhyOnboarding createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RhyOnboarding((ProductMarketingContent) parcel.readParcelable(RhyOnboarding.class.getClassLoader()), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RhyOnboarding[] newArray(int i) {
                return new RhyOnboarding[i];
            }
        }

        public static /* synthetic */ RhyOnboarding copy$default(RhyOnboarding rhyOnboarding, ProductMarketingContent productMarketingContent, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                productMarketingContent = rhyOnboarding.content;
            }
            if ((i & 2) != 0) {
                z = rhyOnboarding.hasClosedCashManagementBanner;
            }
            return rhyOnboarding.copy(productMarketingContent, z);
        }

        /* renamed from: component1, reason: from getter */
        public final ProductMarketingContent getContent() {
            return this.content;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getHasClosedCashManagementBanner() {
            return this.hasClosedCashManagementBanner;
        }

        public final RhyOnboarding copy(ProductMarketingContent content, boolean hasClosedCashManagementBanner) {
            Intrinsics.checkNotNullParameter(content, "content");
            return new RhyOnboarding(content, hasClosedCashManagementBanner);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RhyOnboarding)) {
                return false;
            }
            RhyOnboarding rhyOnboarding = (RhyOnboarding) other;
            return Intrinsics.areEqual(this.content, rhyOnboarding.content) && this.hasClosedCashManagementBanner == rhyOnboarding.hasClosedCashManagementBanner;
        }

        public int hashCode() {
            return (this.content.hashCode() * 31) + Boolean.hashCode(this.hasClosedCashManagementBanner);
        }

        public String toString() {
            return "RhyOnboarding(content=" + this.content + ", hasClosedCashManagementBanner=" + this.hasClosedCashManagementBanner + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.content, flags);
            dest.writeInt(this.hasClosedCashManagementBanner ? 1 : 0);
        }

        public final ProductMarketingContent getContent() {
            return this.content;
        }

        public final boolean getHasClosedCashManagementBanner() {
            return this.hasClosedCashManagementBanner;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RhyOnboarding(ProductMarketingContent content, boolean z) {
            super(null);
            Intrinsics.checkNotNullParameter(content, "content");
            this.content = content;
            this.hasClosedCashManagementBanner = z;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: CashManagementAccessManager.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/mcduckling/CashTabAccessState$RhyOnboarding$IntroContext;", "", "contentfulId", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getContentfulId", "()Ljava/lang/String;", "HAS_INVESTED", "NOT_INVESTED", "Companion", "lib-tab-spending_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.mcduckling.CashTabAccessState$RhyOnboarding$IntroContext */
        public static final class IntroContext {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ IntroContext[] $VALUES;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            public static final IntroContext HAS_INVESTED = new IntroContext("HAS_INVESTED", 0, "2CMTz70qU1MHw7KZJb3gRj");
            public static final IntroContext NOT_INVESTED = new IntroContext("NOT_INVESTED", 1, "DgscPmVng5VjghtEDOLjk");
            private final String contentfulId;

            private static final /* synthetic */ IntroContext[] $values() {
                return new IntroContext[]{HAS_INVESTED, NOT_INVESTED};
            }

            public static EnumEntries<IntroContext> getEntries() {
                return $ENTRIES;
            }

            private IntroContext(String str, int i, String str2) {
                this.contentfulId = str2;
            }

            public final String getContentfulId() {
                return this.contentfulId;
            }

            static {
                IntroContext[] introContextArr$values = $values();
                $VALUES = introContextArr$values;
                $ENTRIES = EnumEntries2.enumEntries(introContextArr$values);
                INSTANCE = new Companion(null);
            }

            /* compiled from: CashManagementAccessManager.kt */
            @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/mcduckling/CashTabAccessState$RhyOnboarding$IntroContext$Companion;", "", "<init>", "()V", "getIntroContext", "Lcom/robinhood/android/mcduckling/CashTabAccessState$RhyOnboarding$IntroContext;", "isInvested", "", "lib-tab-spending_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.mcduckling.CashTabAccessState$RhyOnboarding$IntroContext$Companion, reason: from kotlin metadata */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final IntroContext getIntroContext(boolean isInvested) {
                    if (isInvested) {
                        return IntroContext.HAS_INVESTED;
                    }
                    return IntroContext.NOT_INVESTED;
                }
            }

            public static IntroContext valueOf(String str) {
                return (IntroContext) Enum.valueOf(IntroContext.class, str);
            }

            public static IntroContext[] values() {
                return (IntroContext[]) $VALUES.clone();
            }
        }
    }

    /* compiled from: CashManagementAccessManager.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/mcduckling/CashTabAccessState$CreditCardWaitlist;", "Lcom/robinhood/android/mcduckling/CashTabAccessState;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-tab-spending_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.mcduckling.CashTabAccessState$CreditCardWaitlist */
    public static final class CreditCardWaitlist extends CashManagementAccessManager4 {
        public static final Parcelable.Creator<CreditCardWaitlist> CREATOR = new Creator();

        /* compiled from: CashManagementAccessManager.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.mcduckling.CashTabAccessState$CreditCardWaitlist$Creator */
        public static final class Creator implements Parcelable.Creator<CreditCardWaitlist> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CreditCardWaitlist createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return new CreditCardWaitlist();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CreditCardWaitlist[] newArray(int i) {
                return new CreditCardWaitlist[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        public CreditCardWaitlist() {
            super(null);
        }
    }
}
