package com.robinhood.android.futures.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.models.futures.api.order.FuturesOrderSide;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesNavigationKeys.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001 B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0010\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0015R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/futures/contracts/FuturesOnboardingActivityKey;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "entryPoint", "", "isEventsContracts", "", "postOnboardingNavigation", "Lcom/robinhood/android/futures/contracts/FuturesOnboardingActivityKey$PostOnboardingNavigation;", "<init>", "(Ljava/lang/String;ZLcom/robinhood/android/futures/contracts/FuturesOnboardingActivityKey$PostOnboardingNavigation;)V", "getEntryPoint", "()Ljava/lang/String;", "()Z", "getPostOnboardingNavigation", "()Lcom/robinhood/android/futures/contracts/FuturesOnboardingActivityKey$PostOnboardingNavigation;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "PostOnboardingNavigation", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class FuturesOnboardingActivityKey implements IntentKey, Parcelable {
    public static final Parcelable.Creator<FuturesOnboardingActivityKey> CREATOR = new Creator();
    private final String entryPoint;
    private final boolean isEventsContracts;
    private final PostOnboardingNavigation postOnboardingNavigation;

    /* compiled from: FuturesNavigationKeys.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes3.dex */
    public static final class Creator implements Parcelable.Creator<FuturesOnboardingActivityKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FuturesOnboardingActivityKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FuturesOnboardingActivityKey(parcel.readString(), parcel.readInt() != 0, (PostOnboardingNavigation) parcel.readParcelable(FuturesOnboardingActivityKey.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FuturesOnboardingActivityKey[] newArray(int i) {
            return new FuturesOnboardingActivityKey[i];
        }
    }

    public static /* synthetic */ FuturesOnboardingActivityKey copy$default(FuturesOnboardingActivityKey futuresOnboardingActivityKey, String str, boolean z, PostOnboardingNavigation postOnboardingNavigation, int i, Object obj) {
        if ((i & 1) != 0) {
            str = futuresOnboardingActivityKey.entryPoint;
        }
        if ((i & 2) != 0) {
            z = futuresOnboardingActivityKey.isEventsContracts;
        }
        if ((i & 4) != 0) {
            postOnboardingNavigation = futuresOnboardingActivityKey.postOnboardingNavigation;
        }
        return futuresOnboardingActivityKey.copy(str, z, postOnboardingNavigation);
    }

    /* renamed from: component1, reason: from getter */
    public final String getEntryPoint() {
        return this.entryPoint;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsEventsContracts() {
        return this.isEventsContracts;
    }

    /* renamed from: component3, reason: from getter */
    public final PostOnboardingNavigation getPostOnboardingNavigation() {
        return this.postOnboardingNavigation;
    }

    public final FuturesOnboardingActivityKey copy(String entryPoint, boolean isEventsContracts, PostOnboardingNavigation postOnboardingNavigation) {
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        return new FuturesOnboardingActivityKey(entryPoint, isEventsContracts, postOnboardingNavigation);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FuturesOnboardingActivityKey)) {
            return false;
        }
        FuturesOnboardingActivityKey futuresOnboardingActivityKey = (FuturesOnboardingActivityKey) other;
        return Intrinsics.areEqual(this.entryPoint, futuresOnboardingActivityKey.entryPoint) && this.isEventsContracts == futuresOnboardingActivityKey.isEventsContracts && Intrinsics.areEqual(this.postOnboardingNavigation, futuresOnboardingActivityKey.postOnboardingNavigation);
    }

    public int hashCode() {
        int iHashCode = ((this.entryPoint.hashCode() * 31) + Boolean.hashCode(this.isEventsContracts)) * 31;
        PostOnboardingNavigation postOnboardingNavigation = this.postOnboardingNavigation;
        return iHashCode + (postOnboardingNavigation == null ? 0 : postOnboardingNavigation.hashCode());
    }

    public String toString() {
        return "FuturesOnboardingActivityKey(entryPoint=" + this.entryPoint + ", isEventsContracts=" + this.isEventsContracts + ", postOnboardingNavigation=" + this.postOnboardingNavigation + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.entryPoint);
        dest.writeInt(this.isEventsContracts ? 1 : 0);
        dest.writeParcelable(this.postOnboardingNavigation, flags);
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public FuturesOnboardingActivityKey(String entryPoint, boolean z, PostOnboardingNavigation postOnboardingNavigation) {
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        this.entryPoint = entryPoint;
        this.isEventsContracts = z;
        this.postOnboardingNavigation = postOnboardingNavigation;
    }

    public /* synthetic */ FuturesOnboardingActivityKey(String str, boolean z, PostOnboardingNavigation postOnboardingNavigation, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : postOnboardingNavigation);
    }

    public final String getEntryPoint() {
        return this.entryPoint;
    }

    public final boolean isEventsContracts() {
        return this.isEventsContracts;
    }

    public final PostOnboardingNavigation getPostOnboardingNavigation() {
        return this.postOnboardingNavigation;
    }

    /* compiled from: FuturesNavigationKeys.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/futures/contracts/FuturesOnboardingActivityKey$PostOnboardingNavigation;", "Landroid/os/Parcelable;", "RouteToEdpByEventId", "RouteToEdpByContractId", "RouteToBracket", "RouteToEcOrderForm", "RouteToEcHub", "RouteToRhFuturesList", "RouteToFuturesOrderForm", "Lcom/robinhood/android/futures/contracts/FuturesOnboardingActivityKey$PostOnboardingNavigation$RouteToBracket;", "Lcom/robinhood/android/futures/contracts/FuturesOnboardingActivityKey$PostOnboardingNavigation$RouteToEcHub;", "Lcom/robinhood/android/futures/contracts/FuturesOnboardingActivityKey$PostOnboardingNavigation$RouteToEcOrderForm;", "Lcom/robinhood/android/futures/contracts/FuturesOnboardingActivityKey$PostOnboardingNavigation$RouteToEdpByContractId;", "Lcom/robinhood/android/futures/contracts/FuturesOnboardingActivityKey$PostOnboardingNavigation$RouteToEdpByEventId;", "Lcom/robinhood/android/futures/contracts/FuturesOnboardingActivityKey$PostOnboardingNavigation$RouteToFuturesOrderForm;", "Lcom/robinhood/android/futures/contracts/FuturesOnboardingActivityKey$PostOnboardingNavigation$RouteToRhFuturesList;", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes3.dex */
    public interface PostOnboardingNavigation extends Parcelable {

        /* compiled from: FuturesNavigationKeys.kt */
        @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/futures/contracts/FuturesOnboardingActivityKey$PostOnboardingNavigation$RouteToEdpByEventId;", "Lcom/robinhood/android/futures/contracts/FuturesOnboardingActivityKey$PostOnboardingNavigation;", "eventId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getEventId", "()Ljava/util/UUID;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class RouteToEdpByEventId implements PostOnboardingNavigation {
            public static final Parcelable.Creator<RouteToEdpByEventId> CREATOR = new Creator();
            private final UUID eventId;

            /* compiled from: FuturesNavigationKeys.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<RouteToEdpByEventId> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final RouteToEdpByEventId createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new RouteToEdpByEventId((UUID) parcel.readSerializable());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final RouteToEdpByEventId[] newArray(int i) {
                    return new RouteToEdpByEventId[i];
                }
            }

            public static /* synthetic */ RouteToEdpByEventId copy$default(RouteToEdpByEventId routeToEdpByEventId, UUID uuid, int i, Object obj) {
                if ((i & 1) != 0) {
                    uuid = routeToEdpByEventId.eventId;
                }
                return routeToEdpByEventId.copy(uuid);
            }

            /* renamed from: component1, reason: from getter */
            public final UUID getEventId() {
                return this.eventId;
            }

            public final RouteToEdpByEventId copy(UUID eventId) {
                Intrinsics.checkNotNullParameter(eventId, "eventId");
                return new RouteToEdpByEventId(eventId);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof RouteToEdpByEventId) && Intrinsics.areEqual(this.eventId, ((RouteToEdpByEventId) other).eventId);
            }

            public int hashCode() {
                return this.eventId.hashCode();
            }

            public String toString() {
                return "RouteToEdpByEventId(eventId=" + this.eventId + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.eventId);
            }

            public RouteToEdpByEventId(UUID eventId) {
                Intrinsics.checkNotNullParameter(eventId, "eventId");
                this.eventId = eventId;
            }

            public final UUID getEventId() {
                return this.eventId;
            }
        }

        /* compiled from: FuturesNavigationKeys.kt */
        @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/futures/contracts/FuturesOnboardingActivityKey$PostOnboardingNavigation$RouteToEdpByContractId;", "Lcom/robinhood/android/futures/contracts/FuturesOnboardingActivityKey$PostOnboardingNavigation;", "contractId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getContractId", "()Ljava/util/UUID;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class RouteToEdpByContractId implements PostOnboardingNavigation {
            public static final Parcelable.Creator<RouteToEdpByContractId> CREATOR = new Creator();
            private final UUID contractId;

            /* compiled from: FuturesNavigationKeys.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<RouteToEdpByContractId> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final RouteToEdpByContractId createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new RouteToEdpByContractId((UUID) parcel.readSerializable());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final RouteToEdpByContractId[] newArray(int i) {
                    return new RouteToEdpByContractId[i];
                }
            }

            public static /* synthetic */ RouteToEdpByContractId copy$default(RouteToEdpByContractId routeToEdpByContractId, UUID uuid, int i, Object obj) {
                if ((i & 1) != 0) {
                    uuid = routeToEdpByContractId.contractId;
                }
                return routeToEdpByContractId.copy(uuid);
            }

            /* renamed from: component1, reason: from getter */
            public final UUID getContractId() {
                return this.contractId;
            }

            public final RouteToEdpByContractId copy(UUID contractId) {
                Intrinsics.checkNotNullParameter(contractId, "contractId");
                return new RouteToEdpByContractId(contractId);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof RouteToEdpByContractId) && Intrinsics.areEqual(this.contractId, ((RouteToEdpByContractId) other).contractId);
            }

            public int hashCode() {
                return this.contractId.hashCode();
            }

            public String toString() {
                return "RouteToEdpByContractId(contractId=" + this.contractId + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.contractId);
            }

            public RouteToEdpByContractId(UUID contractId) {
                Intrinsics.checkNotNullParameter(contractId, "contractId");
                this.contractId = contractId;
            }

            public final UUID getContractId() {
                return this.contractId;
            }
        }

        /* compiled from: FuturesNavigationKeys.kt */
        @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/futures/contracts/FuturesOnboardingActivityKey$PostOnboardingNavigation$RouteToBracket;", "Lcom/robinhood/android/futures/contracts/FuturesOnboardingActivityKey$PostOnboardingNavigation;", "bracketId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getBracketId", "()Ljava/util/UUID;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class RouteToBracket implements PostOnboardingNavigation {
            public static final Parcelable.Creator<RouteToBracket> CREATOR = new Creator();
            private final UUID bracketId;

            /* compiled from: FuturesNavigationKeys.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<RouteToBracket> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final RouteToBracket createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new RouteToBracket((UUID) parcel.readSerializable());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final RouteToBracket[] newArray(int i) {
                    return new RouteToBracket[i];
                }
            }

            public static /* synthetic */ RouteToBracket copy$default(RouteToBracket routeToBracket, UUID uuid, int i, Object obj) {
                if ((i & 1) != 0) {
                    uuid = routeToBracket.bracketId;
                }
                return routeToBracket.copy(uuid);
            }

            /* renamed from: component1, reason: from getter */
            public final UUID getBracketId() {
                return this.bracketId;
            }

            public final RouteToBracket copy(UUID bracketId) {
                Intrinsics.checkNotNullParameter(bracketId, "bracketId");
                return new RouteToBracket(bracketId);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof RouteToBracket) && Intrinsics.areEqual(this.bracketId, ((RouteToBracket) other).bracketId);
            }

            public int hashCode() {
                return this.bracketId.hashCode();
            }

            public String toString() {
                return "RouteToBracket(bracketId=" + this.bracketId + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.bracketId);
            }

            public RouteToBracket(UUID bracketId) {
                Intrinsics.checkNotNullParameter(bracketId, "bracketId");
                this.bracketId = bracketId;
            }

            public final UUID getBracketId() {
                return this.bracketId;
            }
        }

        /* compiled from: FuturesNavigationKeys.kt */
        @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/futures/contracts/FuturesOnboardingActivityKey$PostOnboardingNavigation$RouteToEcOrderForm;", "Lcom/robinhood/android/futures/contracts/FuturesOnboardingActivityKey$PostOnboardingNavigation;", "contractId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getContractId", "()Ljava/util/UUID;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class RouteToEcOrderForm implements PostOnboardingNavigation {
            public static final Parcelable.Creator<RouteToEcOrderForm> CREATOR = new Creator();
            private final UUID contractId;

            /* compiled from: FuturesNavigationKeys.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<RouteToEcOrderForm> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final RouteToEcOrderForm createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new RouteToEcOrderForm((UUID) parcel.readSerializable());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final RouteToEcOrderForm[] newArray(int i) {
                    return new RouteToEcOrderForm[i];
                }
            }

            public static /* synthetic */ RouteToEcOrderForm copy$default(RouteToEcOrderForm routeToEcOrderForm, UUID uuid, int i, Object obj) {
                if ((i & 1) != 0) {
                    uuid = routeToEcOrderForm.contractId;
                }
                return routeToEcOrderForm.copy(uuid);
            }

            /* renamed from: component1, reason: from getter */
            public final UUID getContractId() {
                return this.contractId;
            }

            public final RouteToEcOrderForm copy(UUID contractId) {
                Intrinsics.checkNotNullParameter(contractId, "contractId");
                return new RouteToEcOrderForm(contractId);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof RouteToEcOrderForm) && Intrinsics.areEqual(this.contractId, ((RouteToEcOrderForm) other).contractId);
            }

            public int hashCode() {
                return this.contractId.hashCode();
            }

            public String toString() {
                return "RouteToEcOrderForm(contractId=" + this.contractId + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.contractId);
            }

            public RouteToEcOrderForm(UUID contractId) {
                Intrinsics.checkNotNullParameter(contractId, "contractId");
                this.contractId = contractId;
            }

            public final UUID getContractId() {
                return this.contractId;
            }
        }

        /* compiled from: FuturesNavigationKeys.kt */
        @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/futures/contracts/FuturesOnboardingActivityKey$PostOnboardingNavigation$RouteToEcHub;", "Lcom/robinhood/android/futures/contracts/FuturesOnboardingActivityKey$PostOnboardingNavigation;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class RouteToEcHub implements PostOnboardingNavigation {
            public static final RouteToEcHub INSTANCE = new RouteToEcHub();
            public static final Parcelable.Creator<RouteToEcHub> CREATOR = new Creator();

            /* compiled from: FuturesNavigationKeys.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<RouteToEcHub> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final RouteToEcHub createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return RouteToEcHub.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final RouteToEcHub[] newArray(int i) {
                    return new RouteToEcHub[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof RouteToEcHub);
            }

            public int hashCode() {
                return -474871096;
            }

            public String toString() {
                return "RouteToEcHub";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }

            private RouteToEcHub() {
            }
        }

        /* compiled from: FuturesNavigationKeys.kt */
        @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/futures/contracts/FuturesOnboardingActivityKey$PostOnboardingNavigation$RouteToRhFuturesList;", "Lcom/robinhood/android/futures/contracts/FuturesOnboardingActivityKey$PostOnboardingNavigation;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class RouteToRhFuturesList implements PostOnboardingNavigation {
            public static final RouteToRhFuturesList INSTANCE = new RouteToRhFuturesList();
            public static final Parcelable.Creator<RouteToRhFuturesList> CREATOR = new Creator();

            /* compiled from: FuturesNavigationKeys.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<RouteToRhFuturesList> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final RouteToRhFuturesList createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return RouteToRhFuturesList.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final RouteToRhFuturesList[] newArray(int i) {
                    return new RouteToRhFuturesList[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof RouteToRhFuturesList);
            }

            public int hashCode() {
                return -723072503;
            }

            public String toString() {
                return "RouteToRhFuturesList";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }

            private RouteToRhFuturesList() {
            }
        }

        /* compiled from: FuturesNavigationKeys.kt */
        @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0011J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J8\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0006\u0010\u001b\u001a\u00020\u0007J\u0013\u0010\u001c\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/futures/contracts/FuturesOnboardingActivityKey$PostOnboardingNavigation$RouteToFuturesOrderForm;", "Lcom/robinhood/android/futures/contracts/FuturesOnboardingActivityKey$PostOnboardingNavigation;", "contractId", "Ljava/util/UUID;", "side", "Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;", "defaultQuantity", "", "retainAdvancedChart", "", "<init>", "(Ljava/util/UUID;Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;Ljava/lang/Integer;Z)V", "getContractId", "()Ljava/util/UUID;", "getSide", "()Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;", "getDefaultQuantity", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRetainAdvancedChart", "()Z", "component1", "component2", "component3", "component4", "copy", "(Ljava/util/UUID;Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;Ljava/lang/Integer;Z)Lcom/robinhood/android/futures/contracts/FuturesOnboardingActivityKey$PostOnboardingNavigation$RouteToFuturesOrderForm;", "describeContents", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class RouteToFuturesOrderForm implements PostOnboardingNavigation {
            public static final Parcelable.Creator<RouteToFuturesOrderForm> CREATOR = new Creator();
            private final UUID contractId;
            private final Integer defaultQuantity;
            private final boolean retainAdvancedChart;
            private final FuturesOrderSide side;

            /* compiled from: FuturesNavigationKeys.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<RouteToFuturesOrderForm> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final RouteToFuturesOrderForm createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new RouteToFuturesOrderForm((UUID) parcel.readSerializable(), FuturesOrderSide.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final RouteToFuturesOrderForm[] newArray(int i) {
                    return new RouteToFuturesOrderForm[i];
                }
            }

            public static /* synthetic */ RouteToFuturesOrderForm copy$default(RouteToFuturesOrderForm routeToFuturesOrderForm, UUID uuid, FuturesOrderSide futuresOrderSide, Integer num, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    uuid = routeToFuturesOrderForm.contractId;
                }
                if ((i & 2) != 0) {
                    futuresOrderSide = routeToFuturesOrderForm.side;
                }
                if ((i & 4) != 0) {
                    num = routeToFuturesOrderForm.defaultQuantity;
                }
                if ((i & 8) != 0) {
                    z = routeToFuturesOrderForm.retainAdvancedChart;
                }
                return routeToFuturesOrderForm.copy(uuid, futuresOrderSide, num, z);
            }

            /* renamed from: component1, reason: from getter */
            public final UUID getContractId() {
                return this.contractId;
            }

            /* renamed from: component2, reason: from getter */
            public final FuturesOrderSide getSide() {
                return this.side;
            }

            /* renamed from: component3, reason: from getter */
            public final Integer getDefaultQuantity() {
                return this.defaultQuantity;
            }

            /* renamed from: component4, reason: from getter */
            public final boolean getRetainAdvancedChart() {
                return this.retainAdvancedChart;
            }

            public final RouteToFuturesOrderForm copy(UUID contractId, FuturesOrderSide side, Integer defaultQuantity, boolean retainAdvancedChart) {
                Intrinsics.checkNotNullParameter(contractId, "contractId");
                Intrinsics.checkNotNullParameter(side, "side");
                return new RouteToFuturesOrderForm(contractId, side, defaultQuantity, retainAdvancedChart);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof RouteToFuturesOrderForm)) {
                    return false;
                }
                RouteToFuturesOrderForm routeToFuturesOrderForm = (RouteToFuturesOrderForm) other;
                return Intrinsics.areEqual(this.contractId, routeToFuturesOrderForm.contractId) && this.side == routeToFuturesOrderForm.side && Intrinsics.areEqual(this.defaultQuantity, routeToFuturesOrderForm.defaultQuantity) && this.retainAdvancedChart == routeToFuturesOrderForm.retainAdvancedChart;
            }

            public int hashCode() {
                int iHashCode = ((this.contractId.hashCode() * 31) + this.side.hashCode()) * 31;
                Integer num = this.defaultQuantity;
                return ((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + Boolean.hashCode(this.retainAdvancedChart);
            }

            public String toString() {
                return "RouteToFuturesOrderForm(contractId=" + this.contractId + ", side=" + this.side + ", defaultQuantity=" + this.defaultQuantity + ", retainAdvancedChart=" + this.retainAdvancedChart + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                int iIntValue;
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.contractId);
                dest.writeString(this.side.name());
                Integer num = this.defaultQuantity;
                if (num == null) {
                    iIntValue = 0;
                } else {
                    dest.writeInt(1);
                    iIntValue = num.intValue();
                }
                dest.writeInt(iIntValue);
                dest.writeInt(this.retainAdvancedChart ? 1 : 0);
            }

            public RouteToFuturesOrderForm(UUID contractId, FuturesOrderSide side, Integer num, boolean z) {
                Intrinsics.checkNotNullParameter(contractId, "contractId");
                Intrinsics.checkNotNullParameter(side, "side");
                this.contractId = contractId;
                this.side = side;
                this.defaultQuantity = num;
                this.retainAdvancedChart = z;
            }

            public /* synthetic */ RouteToFuturesOrderForm(UUID uuid, FuturesOrderSide futuresOrderSide, Integer num, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(uuid, futuresOrderSide, (i & 4) != 0 ? null : num, (i & 8) != 0 ? false : z);
            }

            public final UUID getContractId() {
                return this.contractId;
            }

            public final FuturesOrderSide getSide() {
                return this.side;
            }

            public final Integer getDefaultQuantity() {
                return this.defaultQuantity;
            }

            public final boolean getRetainAdvancedChart() {
                return this.retainAdvancedChart;
            }
        }
    }
}
