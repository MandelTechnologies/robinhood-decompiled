package com.robinhood.android.support.appointments;

import com.robinhood.models.p355ui.appointments.Appointment;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppointmentsViewerViewState.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u001d\u001eB+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/support/appointments/AppointmentsViewerViewState;", "", "loadingState", "Lcom/robinhood/android/support/appointments/AppointmentsViewerViewState$LoadingState;", "appointmentId", "", "userPhoneNumber", "dialogData", "Lcom/robinhood/android/support/appointments/AppointmentsViewerViewState$DialogData;", "<init>", "(Lcom/robinhood/android/support/appointments/AppointmentsViewerViewState$LoadingState;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/support/appointments/AppointmentsViewerViewState$DialogData;)V", "getLoadingState", "()Lcom/robinhood/android/support/appointments/AppointmentsViewerViewState$LoadingState;", "getAppointmentId", "()Ljava/lang/String;", "getUserPhoneNumber", "getDialogData", "()Lcom/robinhood/android/support/appointments/AppointmentsViewerViewState$DialogData;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "LoadingState", "DialogData", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class AppointmentsViewerViewState {
    public static final int $stable = 0;
    private final String appointmentId;
    private final DialogData dialogData;
    private final LoadingState loadingState;
    private final String userPhoneNumber;

    public static /* synthetic */ AppointmentsViewerViewState copy$default(AppointmentsViewerViewState appointmentsViewerViewState, LoadingState loadingState, String str, String str2, DialogData dialogData, int i, Object obj) {
        if ((i & 1) != 0) {
            loadingState = appointmentsViewerViewState.loadingState;
        }
        if ((i & 2) != 0) {
            str = appointmentsViewerViewState.appointmentId;
        }
        if ((i & 4) != 0) {
            str2 = appointmentsViewerViewState.userPhoneNumber;
        }
        if ((i & 8) != 0) {
            dialogData = appointmentsViewerViewState.dialogData;
        }
        return appointmentsViewerViewState.copy(loadingState, str, str2, dialogData);
    }

    /* renamed from: component1, reason: from getter */
    public final LoadingState getLoadingState() {
        return this.loadingState;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAppointmentId() {
        return this.appointmentId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getUserPhoneNumber() {
        return this.userPhoneNumber;
    }

    /* renamed from: component4, reason: from getter */
    public final DialogData getDialogData() {
        return this.dialogData;
    }

    public final AppointmentsViewerViewState copy(LoadingState loadingState, String appointmentId, String userPhoneNumber, DialogData dialogData) {
        Intrinsics.checkNotNullParameter(loadingState, "loadingState");
        Intrinsics.checkNotNullParameter(appointmentId, "appointmentId");
        Intrinsics.checkNotNullParameter(userPhoneNumber, "userPhoneNumber");
        Intrinsics.checkNotNullParameter(dialogData, "dialogData");
        return new AppointmentsViewerViewState(loadingState, appointmentId, userPhoneNumber, dialogData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppointmentsViewerViewState)) {
            return false;
        }
        AppointmentsViewerViewState appointmentsViewerViewState = (AppointmentsViewerViewState) other;
        return Intrinsics.areEqual(this.loadingState, appointmentsViewerViewState.loadingState) && Intrinsics.areEqual(this.appointmentId, appointmentsViewerViewState.appointmentId) && Intrinsics.areEqual(this.userPhoneNumber, appointmentsViewerViewState.userPhoneNumber) && Intrinsics.areEqual(this.dialogData, appointmentsViewerViewState.dialogData);
    }

    public int hashCode() {
        return (((((this.loadingState.hashCode() * 31) + this.appointmentId.hashCode()) * 31) + this.userPhoneNumber.hashCode()) * 31) + this.dialogData.hashCode();
    }

    public String toString() {
        return "AppointmentsViewerViewState(loadingState=" + this.loadingState + ", appointmentId=" + this.appointmentId + ", userPhoneNumber=" + this.userPhoneNumber + ", dialogData=" + this.dialogData + ")";
    }

    public AppointmentsViewerViewState(LoadingState loadingState, String appointmentId, String userPhoneNumber, DialogData dialogData) {
        Intrinsics.checkNotNullParameter(loadingState, "loadingState");
        Intrinsics.checkNotNullParameter(appointmentId, "appointmentId");
        Intrinsics.checkNotNullParameter(userPhoneNumber, "userPhoneNumber");
        Intrinsics.checkNotNullParameter(dialogData, "dialogData");
        this.loadingState = loadingState;
        this.appointmentId = appointmentId;
        this.userPhoneNumber = userPhoneNumber;
        this.dialogData = dialogData;
    }

    public final LoadingState getLoadingState() {
        return this.loadingState;
    }

    public final String getAppointmentId() {
        return this.appointmentId;
    }

    public /* synthetic */ AppointmentsViewerViewState(LoadingState loadingState, String str, String str2, DialogData dialogData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(loadingState, str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? DialogData.None.INSTANCE : dialogData);
    }

    public final String getUserPhoneNumber() {
        return this.userPhoneNumber;
    }

    public final DialogData getDialogData() {
        return this.dialogData;
    }

    /* compiled from: AppointmentsViewerViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/support/appointments/AppointmentsViewerViewState$LoadingState;", "", "Loading", "Loaded", "Lcom/robinhood/android/support/appointments/AppointmentsViewerViewState$LoadingState$Loaded;", "Lcom/robinhood/android/support/appointments/AppointmentsViewerViewState$LoadingState$Loading;", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface LoadingState {

        /* compiled from: AppointmentsViewerViewState.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/support/appointments/AppointmentsViewerViewState$LoadingState$Loading;", "Lcom/robinhood/android/support/appointments/AppointmentsViewerViewState$LoadingState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Loading implements LoadingState {
            public static final int $stable = 0;
            public static final Loading INSTANCE = new Loading();

            public boolean equals(Object other) {
                return this == other || (other instanceof Loading);
            }

            public int hashCode() {
                return -2102211918;
            }

            public String toString() {
                return "Loading";
            }

            private Loading() {
            }
        }

        /* compiled from: AppointmentsViewerViewState.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/support/appointments/AppointmentsViewerViewState$LoadingState$Loaded;", "Lcom/robinhood/android/support/appointments/AppointmentsViewerViewState$LoadingState;", "appointment", "Lcom/robinhood/models/ui/appointments/Appointment;", "bottomControlState", "Lcom/robinhood/android/support/appointments/AppointmentsViewerViewState$LoadingState$Loaded$BottomControlState;", "<init>", "(Lcom/robinhood/models/ui/appointments/Appointment;Lcom/robinhood/android/support/appointments/AppointmentsViewerViewState$LoadingState$Loaded$BottomControlState;)V", "getAppointment", "()Lcom/robinhood/models/ui/appointments/Appointment;", "getBottomControlState", "()Lcom/robinhood/android/support/appointments/AppointmentsViewerViewState$LoadingState$Loaded$BottomControlState;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "BottomControlState", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Loaded implements LoadingState {
            public static final int $stable = 8;
            private final Appointment appointment;
            private final BottomControlState bottomControlState;

            public static /* synthetic */ Loaded copy$default(Loaded loaded, Appointment appointment, BottomControlState bottomControlState, int i, Object obj) {
                if ((i & 1) != 0) {
                    appointment = loaded.appointment;
                }
                if ((i & 2) != 0) {
                    bottomControlState = loaded.bottomControlState;
                }
                return loaded.copy(appointment, bottomControlState);
            }

            /* renamed from: component1, reason: from getter */
            public final Appointment getAppointment() {
                return this.appointment;
            }

            /* renamed from: component2, reason: from getter */
            public final BottomControlState getBottomControlState() {
                return this.bottomControlState;
            }

            public final Loaded copy(Appointment appointment, BottomControlState bottomControlState) {
                Intrinsics.checkNotNullParameter(appointment, "appointment");
                Intrinsics.checkNotNullParameter(bottomControlState, "bottomControlState");
                return new Loaded(appointment, bottomControlState);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Loaded)) {
                    return false;
                }
                Loaded loaded = (Loaded) other;
                return Intrinsics.areEqual(this.appointment, loaded.appointment) && this.bottomControlState == loaded.bottomControlState;
            }

            public int hashCode() {
                return (this.appointment.hashCode() * 31) + this.bottomControlState.hashCode();
            }

            public String toString() {
                return "Loaded(appointment=" + this.appointment + ", bottomControlState=" + this.bottomControlState + ")";
            }

            public Loaded(Appointment appointment, BottomControlState bottomControlState) {
                Intrinsics.checkNotNullParameter(appointment, "appointment");
                Intrinsics.checkNotNullParameter(bottomControlState, "bottomControlState");
                this.appointment = appointment;
                this.bottomControlState = bottomControlState;
            }

            public final Appointment getAppointment() {
                return this.appointment;
            }

            public final BottomControlState getBottomControlState() {
                return this.bottomControlState;
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: AppointmentsViewerViewState.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/support/appointments/AppointmentsViewerViewState$LoadingState$Loaded$BottomControlState;", "", "<init>", "(Ljava/lang/String;I)V", "ENABLED", "DISABLED", "HIDDEN", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class BottomControlState {
                private static final /* synthetic */ EnumEntries $ENTRIES;
                private static final /* synthetic */ BottomControlState[] $VALUES;
                public static final BottomControlState ENABLED = new BottomControlState("ENABLED", 0);
                public static final BottomControlState DISABLED = new BottomControlState("DISABLED", 1);
                public static final BottomControlState HIDDEN = new BottomControlState("HIDDEN", 2);

                private static final /* synthetic */ BottomControlState[] $values() {
                    return new BottomControlState[]{ENABLED, DISABLED, HIDDEN};
                }

                public static EnumEntries<BottomControlState> getEntries() {
                    return $ENTRIES;
                }

                private BottomControlState(String str, int i) {
                }

                static {
                    BottomControlState[] bottomControlStateArr$values = $values();
                    $VALUES = bottomControlStateArr$values;
                    $ENTRIES = EnumEntries2.enumEntries(bottomControlStateArr$values);
                }

                public static BottomControlState valueOf(String str) {
                    return (BottomControlState) Enum.valueOf(BottomControlState.class, str);
                }

                public static BottomControlState[] values() {
                    return (BottomControlState[]) $VALUES.clone();
                }
            }
        }
    }

    /* compiled from: AppointmentsViewerViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/support/appointments/AppointmentsViewerViewState$DialogData;", "", "None", "Error", "CancelAppointment", "Lcom/robinhood/android/support/appointments/AppointmentsViewerViewState$DialogData$CancelAppointment;", "Lcom/robinhood/android/support/appointments/AppointmentsViewerViewState$DialogData$Error;", "Lcom/robinhood/android/support/appointments/AppointmentsViewerViewState$DialogData$None;", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface DialogData {

        /* compiled from: AppointmentsViewerViewState.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/support/appointments/AppointmentsViewerViewState$DialogData$None;", "Lcom/robinhood/android/support/appointments/AppointmentsViewerViewState$DialogData;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class None implements DialogData {
            public static final int $stable = 0;
            public static final None INSTANCE = new None();

            public boolean equals(Object other) {
                return this == other || (other instanceof None);
            }

            public int hashCode() {
                return -812767355;
            }

            public String toString() {
                return "None";
            }

            private None() {
            }
        }

        /* compiled from: AppointmentsViewerViewState.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/support/appointments/AppointmentsViewerViewState$DialogData$Error;", "Lcom/robinhood/android/support/appointments/AppointmentsViewerViewState$DialogData;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Error implements DialogData {
            public static final int $stable = 0;
            public static final Error INSTANCE = new Error();

            public boolean equals(Object other) {
                return this == other || (other instanceof Error);
            }

            public int hashCode() {
                return 565797723;
            }

            public String toString() {
                return "Error";
            }

            private Error() {
            }
        }

        /* compiled from: AppointmentsViewerViewState.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/support/appointments/AppointmentsViewerViewState$DialogData$CancelAppointment;", "Lcom/robinhood/android/support/appointments/AppointmentsViewerViewState$DialogData;", "appointment", "Lcom/robinhood/models/ui/appointments/Appointment;", "processing", "", "<init>", "(Lcom/robinhood/models/ui/appointments/Appointment;Z)V", "getAppointment", "()Lcom/robinhood/models/ui/appointments/Appointment;", "getProcessing", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class CancelAppointment implements DialogData {
            public static final int $stable = 8;
            private final Appointment appointment;
            private final boolean processing;

            public static /* synthetic */ CancelAppointment copy$default(CancelAppointment cancelAppointment, Appointment appointment, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    appointment = cancelAppointment.appointment;
                }
                if ((i & 2) != 0) {
                    z = cancelAppointment.processing;
                }
                return cancelAppointment.copy(appointment, z);
            }

            /* renamed from: component1, reason: from getter */
            public final Appointment getAppointment() {
                return this.appointment;
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getProcessing() {
                return this.processing;
            }

            public final CancelAppointment copy(Appointment appointment, boolean processing) {
                Intrinsics.checkNotNullParameter(appointment, "appointment");
                return new CancelAppointment(appointment, processing);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CancelAppointment)) {
                    return false;
                }
                CancelAppointment cancelAppointment = (CancelAppointment) other;
                return Intrinsics.areEqual(this.appointment, cancelAppointment.appointment) && this.processing == cancelAppointment.processing;
            }

            public int hashCode() {
                return (this.appointment.hashCode() * 31) + Boolean.hashCode(this.processing);
            }

            public String toString() {
                return "CancelAppointment(appointment=" + this.appointment + ", processing=" + this.processing + ")";
            }

            public CancelAppointment(Appointment appointment, boolean z) {
                Intrinsics.checkNotNullParameter(appointment, "appointment");
                this.appointment = appointment;
                this.processing = z;
            }

            public final Appointment getAppointment() {
                return this.appointment;
            }

            public final boolean getProcessing() {
                return this.processing;
            }
        }
    }
}
