package com.robinhood.android.retirement;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.models.retirement.api.dashboard.ApiRetirementDashboardState;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RetirementDashboardAccessManager.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/retirement/RetirementDashboardAccessState;", "Landroid/os/Parcelable;", "<init>", "()V", "UnableToLoad", "HasAccess", "Lcom/robinhood/android/retirement/RetirementDashboardAccessState$HasAccess;", "Lcom/robinhood/android/retirement/RetirementDashboardAccessState$UnableToLoad;", "feature-retirement-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.retirement.RetirementDashboardAccessState, reason: use source file name */
/* loaded from: classes5.dex */
public abstract class RetirementDashboardAccessManager2 implements Parcelable {
    public static final int $stable = 0;

    public /* synthetic */ RetirementDashboardAccessManager2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private RetirementDashboardAccessManager2() {
    }

    /* compiled from: RetirementDashboardAccessManager.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/retirement/RetirementDashboardAccessState$UnableToLoad;", "Lcom/robinhood/android/retirement/RetirementDashboardAccessState;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-retirement-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.retirement.RetirementDashboardAccessState$UnableToLoad */
    public static final class UnableToLoad extends RetirementDashboardAccessManager2 {
        public static final int $stable = 0;
        public static final UnableToLoad INSTANCE = new UnableToLoad();
        public static final Parcelable.Creator<UnableToLoad> CREATOR = new Creator();

        /* compiled from: RetirementDashboardAccessManager.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.retirement.RetirementDashboardAccessState$UnableToLoad$Creator */
        public static final class Creator implements Parcelable.Creator<UnableToLoad> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UnableToLoad createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return UnableToLoad.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UnableToLoad[] newArray(int i) {
                return new UnableToLoad[i];
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

        private UnableToLoad() {
            super(null);
        }
    }

    /* compiled from: RetirementDashboardAccessManager.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/retirement/RetirementDashboardAccessState$HasAccess;", "Lcom/robinhood/android/retirement/RetirementDashboardAccessState;", "state", "Lcom/robinhood/android/models/retirement/api/dashboard/ApiRetirementDashboardState$State;", "<init>", "(Lcom/robinhood/android/models/retirement/api/dashboard/ApiRetirementDashboardState$State;)V", "getState", "()Lcom/robinhood/android/models/retirement/api/dashboard/ApiRetirementDashboardState$State;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-retirement-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.retirement.RetirementDashboardAccessState$HasAccess, reason: from toString */
    public static final /* data */ class HasAccess extends RetirementDashboardAccessManager2 {
        public static final int $stable = 0;
        public static final Parcelable.Creator<HasAccess> CREATOR = new Creator();
        private final ApiRetirementDashboardState.State state;

        /* compiled from: RetirementDashboardAccessManager.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.retirement.RetirementDashboardAccessState$HasAccess$Creator */
        public static final class Creator implements Parcelable.Creator<HasAccess> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HasAccess createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new HasAccess(ApiRetirementDashboardState.State.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HasAccess[] newArray(int i) {
                return new HasAccess[i];
            }
        }

        public static /* synthetic */ HasAccess copy$default(HasAccess hasAccess, ApiRetirementDashboardState.State state, int i, Object obj) {
            if ((i & 1) != 0) {
                state = hasAccess.state;
            }
            return hasAccess.copy(state);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiRetirementDashboardState.State getState() {
            return this.state;
        }

        public final HasAccess copy(ApiRetirementDashboardState.State state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return new HasAccess(state);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof HasAccess) && this.state == ((HasAccess) other).state;
        }

        public int hashCode() {
            return this.state.hashCode();
        }

        public String toString() {
            return "HasAccess(state=" + this.state + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.state.name());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HasAccess(ApiRetirementDashboardState.State state) {
            super(null);
            Intrinsics.checkNotNullParameter(state, "state");
            this.state = state;
        }

        public final ApiRetirementDashboardState.State getState() {
            return this.state;
        }
    }
}
