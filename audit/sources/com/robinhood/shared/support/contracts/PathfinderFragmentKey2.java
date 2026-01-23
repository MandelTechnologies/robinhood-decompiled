package com.robinhood.shared.support.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.compose.bento.component.alerts.BentoAlertSheet6;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PathfinderFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/support/contracts/PathfinderSetResultMode;", "Landroid/os/Parcelable;", "<init>", "()V", "None", BentoAlertSheet6.button2Title, "Sassy", "Lcom/robinhood/shared/support/contracts/PathfinderSetResultMode$Dismiss;", "Lcom/robinhood/shared/support/contracts/PathfinderSetResultMode$None;", "Lcom/robinhood/shared/support/contracts/PathfinderSetResultMode$Sassy;", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.support.contracts.PathfinderSetResultMode, reason: use source file name */
/* loaded from: classes6.dex */
public abstract class PathfinderFragmentKey2 implements Parcelable {
    public /* synthetic */ PathfinderFragmentKey2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private PathfinderFragmentKey2() {
    }

    /* compiled from: PathfinderFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/shared/support/contracts/PathfinderSetResultMode$None;", "Lcom/robinhood/shared/support/contracts/PathfinderSetResultMode;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.support.contracts.PathfinderSetResultMode$None */
    public static final class None extends PathfinderFragmentKey2 {
        public static final None INSTANCE = new None();
        public static final Parcelable.Creator<None> CREATOR = new Creator();

        /* compiled from: PathfinderFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.shared.support.contracts.PathfinderSetResultMode$None$Creator */
        public static final class Creator implements Parcelable.Creator<None> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final None createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return None.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final None[] newArray(int i) {
                return new None[i];
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

        private None() {
            super(null);
        }
    }

    /* compiled from: PathfinderFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/shared/support/contracts/PathfinderSetResultMode$Dismiss;", "Lcom/robinhood/shared/support/contracts/PathfinderSetResultMode;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.support.contracts.PathfinderSetResultMode$Dismiss */
    public static final class Dismiss extends PathfinderFragmentKey2 {
        public static final Dismiss INSTANCE = new Dismiss();
        public static final Parcelable.Creator<Dismiss> CREATOR = new Creator();

        /* compiled from: PathfinderFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.shared.support.contracts.PathfinderSetResultMode$Dismiss$Creator */
        public static final class Creator implements Parcelable.Creator<Dismiss> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Dismiss createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Dismiss.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Dismiss[] newArray(int i) {
                return new Dismiss[i];
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

        private Dismiss() {
            super(null);
        }
    }

    /* compiled from: PathfinderFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000bR\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/support/contracts/PathfinderSetResultMode$Sassy;", "Lcom/robinhood/shared/support/contracts/PathfinderSetResultMode;", "flowId", "", "<init>", "(Ljava/lang/String;)V", "supportsExitAppLink", "", "getSupportsExitAppLink", "()Z", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.support.contracts.PathfinderSetResultMode$Sassy */
    public static final class Sassy extends PathfinderFragmentKey2 {
        private static final String FLOW_ID_SUV = "suv";
        private final String flowId;
        public static final Parcelable.Creator<Sassy> CREATOR = new Creator();

        /* compiled from: PathfinderFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.shared.support.contracts.PathfinderSetResultMode$Sassy$Creator */
        public static final class Creator implements Parcelable.Creator<Sassy> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Sassy createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Sassy(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Sassy[] newArray(int i) {
                return new Sassy[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.flowId);
        }

        public Sassy(String str) {
            super(null);
            this.flowId = str;
        }

        public final boolean getSupportsExitAppLink() {
            return !Intrinsics.areEqual(this.flowId, "suv");
        }
    }
}
