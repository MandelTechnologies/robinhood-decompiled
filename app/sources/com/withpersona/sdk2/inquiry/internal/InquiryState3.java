package com.withpersona.sdk2.inquiry.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.internal.TransitionWorker;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InquiryState.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "Landroid/os/Parcelable;", "<init>", "()V", "Transitioning", "UpdateInquirySession", "CheckingForNextState", "TransitioningBack", "Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus$CheckingForNextState;", "Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus$Transitioning;", "Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus$TransitioningBack;", "Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus$UpdateInquirySession;", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.internal.TransitionStatus, reason: use source file name */
/* loaded from: classes18.dex */
public abstract class InquiryState3 implements Parcelable {
    public /* synthetic */ InquiryState3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private InquiryState3() {
    }

    /* compiled from: InquiryState.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000eJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus$Transitioning;", "Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$TransitionData;", "transitionData", "<init>", "(Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$TransitionData;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$TransitionData;", "getTransitionData", "()Lcom/withpersona/sdk2/inquiry/internal/TransitionWorker$TransitionData;", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.internal.TransitionStatus$Transitioning, reason: from toString */
    public static final /* data */ class Transitioning extends InquiryState3 {
        public static final Parcelable.Creator<Transitioning> CREATOR = new Creator();
        private final TransitionWorker.TransitionData transitionData;

        /* compiled from: InquiryState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.internal.TransitionStatus$Transitioning$Creator */
        public static final class Creator implements Parcelable.Creator<Transitioning> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Transitioning createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Transitioning(TransitionWorker.TransitionData.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Transitioning[] newArray(int i) {
                return new Transitioning[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Transitioning) && Intrinsics.areEqual(this.transitionData, ((Transitioning) other).transitionData);
        }

        public int hashCode() {
            return this.transitionData.hashCode();
        }

        public String toString() {
            return "Transitioning(transitionData=" + this.transitionData + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.transitionData.writeToParcel(dest, flags);
        }

        public final TransitionWorker.TransitionData getTransitionData() {
            return this.transitionData;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Transitioning(TransitionWorker.TransitionData transitionData) {
            super(null);
            Intrinsics.checkNotNullParameter(transitionData, "transitionData");
            this.transitionData = transitionData;
        }
    }

    /* compiled from: InquiryState.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000eJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus$UpdateInquirySession;", "Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "nextStep", "<init>", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryState;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "getNextStep", "()Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.internal.TransitionStatus$UpdateInquirySession, reason: from toString */
    public static final /* data */ class UpdateInquirySession extends InquiryState3 {
        public static final Parcelable.Creator<UpdateInquirySession> CREATOR = new Creator();
        private final InquiryState nextStep;

        /* compiled from: InquiryState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.internal.TransitionStatus$UpdateInquirySession$Creator */
        public static final class Creator implements Parcelable.Creator<UpdateInquirySession> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UpdateInquirySession createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UpdateInquirySession((InquiryState) parcel.readParcelable(UpdateInquirySession.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UpdateInquirySession[] newArray(int i) {
                return new UpdateInquirySession[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UpdateInquirySession) && Intrinsics.areEqual(this.nextStep, ((UpdateInquirySession) other).nextStep);
        }

        public int hashCode() {
            InquiryState inquiryState = this.nextStep;
            if (inquiryState == null) {
                return 0;
            }
            return inquiryState.hashCode();
        }

        public String toString() {
            return "UpdateInquirySession(nextStep=" + this.nextStep + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.nextStep, flags);
        }

        public final InquiryState getNextStep() {
            return this.nextStep;
        }

        public UpdateInquirySession(InquiryState inquiryState) {
            super(null);
            this.nextStep = inquiryState;
        }
    }

    /* compiled from: InquiryState.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000eJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus$CheckingForNextState;", "Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "Lcom/withpersona/sdk2/inquiry/internal/PollingMode;", "pollingMode", "<init>", "(Lcom/withpersona/sdk2/inquiry/internal/PollingMode;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/withpersona/sdk2/inquiry/internal/PollingMode;", "getPollingMode", "()Lcom/withpersona/sdk2/inquiry/internal/PollingMode;", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.internal.TransitionStatus$CheckingForNextState, reason: from toString */
    public static final /* data */ class CheckingForNextState extends InquiryState3 {
        public static final Parcelable.Creator<CheckingForNextState> CREATOR = new Creator();
        private final PollingMode pollingMode;

        /* compiled from: InquiryState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.internal.TransitionStatus$CheckingForNextState$Creator */
        public static final class Creator implements Parcelable.Creator<CheckingForNextState> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CheckingForNextState createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CheckingForNextState(PollingMode.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CheckingForNextState[] newArray(int i) {
                return new CheckingForNextState[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public CheckingForNextState() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CheckingForNextState) && this.pollingMode == ((CheckingForNextState) other).pollingMode;
        }

        public int hashCode() {
            return this.pollingMode.hashCode();
        }

        public String toString() {
            return "CheckingForNextState(pollingMode=" + this.pollingMode + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.pollingMode.name());
        }

        public /* synthetic */ CheckingForNextState(PollingMode pollingMode, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? PollingMode.Blocking : pollingMode);
        }

        public final PollingMode getPollingMode() {
            return this.pollingMode;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CheckingForNextState(PollingMode pollingMode) {
            super(null);
            Intrinsics.checkNotNullParameter(pollingMode, "pollingMode");
            this.pollingMode = pollingMode;
        }
    }

    /* compiled from: InquiryState.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus$TransitioningBack;", "Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.internal.TransitionStatus$TransitioningBack */
    public static final /* data */ class TransitioningBack extends InquiryState3 {
        public static final TransitioningBack INSTANCE = new TransitioningBack();
        public static final Parcelable.Creator<TransitioningBack> CREATOR = new Creator();

        /* compiled from: InquiryState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.internal.TransitionStatus$TransitioningBack$Creator */
        public static final class Creator implements Parcelable.Creator<TransitioningBack> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TransitioningBack createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return TransitioningBack.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TransitioningBack[] newArray(int i) {
                return new TransitioningBack[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof TransitioningBack);
        }

        public int hashCode() {
            return -593165066;
        }

        public String toString() {
            return "TransitioningBack";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private TransitioningBack() {
            super(null);
        }
    }
}
