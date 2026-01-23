package com.robinhood.android.support.appointments;

import com.robinhood.models.p355ui.appointments.AppointmentSlot;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import p479j$.time.ZoneId;

/* compiled from: AppointmentsSchedulerDataState.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b6\b\u0087\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0016\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJ\u0010\u0010 \u001a\u00020\tHÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b)\u0010(J\u0012\u0010*\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b*\u0010(J\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010\u001aJ\u0010\u0010,\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b,\u0010!J°\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0016\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b/\u0010\u001aJ\u0010\u00100\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b0\u00101J\u001a\u00103\u001a\u00020\t2\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b3\u00104R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00107\u001a\u0004\b8\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00105\u001a\u0004\b9\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b:\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u00105\u001a\u0004\b;\u0010\u001aR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010<\u001a\u0004\b\n\u0010!R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010<\u001a\u0004\b\u000b\u0010!R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010=\u001a\u0004\b>\u0010$R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010?\u001a\u0004\b@\u0010&R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010A\u001a\u0004\bB\u0010(R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010A\u001a\u0004\bC\u0010(R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0014\u0010A\u001a\u0004\bD\u0010(R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u00105\u001a\u0004\bE\u0010\u001aR\u0017\u0010\u0016\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0016\u0010<\u001a\u0004\bF\u0010!¨\u0006G"}, m3636d2 = {"Lcom/robinhood/android/support/appointments/AppointmentsSchedulerDataState;", "", "", "campaignId", "j$/time/ZoneId", "userZoneId", "userNumber", "userEmail", "agentName", "", "isLoading", "isCreatingAppointment", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/ui/appointments/AppointmentSlot;", "timeSlots", "Lcom/robinhood/android/support/appointments/SubScreen;", "currentScreen", "", "selectedWeekIndex", "selectedDayOfWeekIndex", "selectedTimeOfDayIndex", "notes", "useCloseNavButton", "<init>", "(Ljava/lang/String;Lj$/time/ZoneId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/android/support/appointments/SubScreen;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "()Lj$/time/ZoneId;", "component3", "component4", "component5", "component6", "()Z", "component7", "component8", "()Lkotlinx/collections/immutable/ImmutableList;", "component9", "()Lcom/robinhood/android/support/appointments/SubScreen;", "component10", "()Ljava/lang/Integer;", "component11", "component12", "component13", "component14", "copy", "(Ljava/lang/String;Lj$/time/ZoneId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/android/support/appointments/SubScreen;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Z)Lcom/robinhood/android/support/appointments/AppointmentsSchedulerDataState;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCampaignId", "Lj$/time/ZoneId;", "getUserZoneId", "getUserNumber", "getUserEmail", "getAgentName", "Z", "Lkotlinx/collections/immutable/ImmutableList;", "getTimeSlots", "Lcom/robinhood/android/support/appointments/SubScreen;", "getCurrentScreen", "Ljava/lang/Integer;", "getSelectedWeekIndex", "getSelectedDayOfWeekIndex", "getSelectedTimeOfDayIndex", "getNotes", "getUseCloseNavButton", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class AppointmentsSchedulerDataState {
    public static final int $stable = 8;
    private final String agentName;
    private final String campaignId;
    private final AppointmentsSchedulerViewState6 currentScreen;
    private final boolean isCreatingAppointment;
    private final boolean isLoading;
    private final String notes;
    private final Integer selectedDayOfWeekIndex;
    private final Integer selectedTimeOfDayIndex;
    private final Integer selectedWeekIndex;
    private final ImmutableList<AppointmentSlot> timeSlots;
    private final boolean useCloseNavButton;
    private final String userEmail;
    private final String userNumber;
    private final ZoneId userZoneId;

    /* renamed from: component1, reason: from getter */
    public final String getCampaignId() {
        return this.campaignId;
    }

    /* renamed from: component10, reason: from getter */
    public final Integer getSelectedWeekIndex() {
        return this.selectedWeekIndex;
    }

    /* renamed from: component11, reason: from getter */
    public final Integer getSelectedDayOfWeekIndex() {
        return this.selectedDayOfWeekIndex;
    }

    /* renamed from: component12, reason: from getter */
    public final Integer getSelectedTimeOfDayIndex() {
        return this.selectedTimeOfDayIndex;
    }

    /* renamed from: component13, reason: from getter */
    public final String getNotes() {
        return this.notes;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getUseCloseNavButton() {
        return this.useCloseNavButton;
    }

    /* renamed from: component2, reason: from getter */
    public final ZoneId getUserZoneId() {
        return this.userZoneId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getUserNumber() {
        return this.userNumber;
    }

    /* renamed from: component4, reason: from getter */
    public final String getUserEmail() {
        return this.userEmail;
    }

    /* renamed from: component5, reason: from getter */
    public final String getAgentName() {
        return this.agentName;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsCreatingAppointment() {
        return this.isCreatingAppointment;
    }

    public final ImmutableList<AppointmentSlot> component8() {
        return this.timeSlots;
    }

    /* renamed from: component9, reason: from getter */
    public final AppointmentsSchedulerViewState6 getCurrentScreen() {
        return this.currentScreen;
    }

    public final AppointmentsSchedulerDataState copy(String campaignId, ZoneId userZoneId, String userNumber, String userEmail, String agentName, boolean isLoading, boolean isCreatingAppointment, ImmutableList<AppointmentSlot> timeSlots, AppointmentsSchedulerViewState6 currentScreen, Integer selectedWeekIndex, Integer selectedDayOfWeekIndex, Integer selectedTimeOfDayIndex, String notes, boolean useCloseNavButton) {
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        Intrinsics.checkNotNullParameter(userZoneId, "userZoneId");
        Intrinsics.checkNotNullParameter(timeSlots, "timeSlots");
        Intrinsics.checkNotNullParameter(currentScreen, "currentScreen");
        return new AppointmentsSchedulerDataState(campaignId, userZoneId, userNumber, userEmail, agentName, isLoading, isCreatingAppointment, timeSlots, currentScreen, selectedWeekIndex, selectedDayOfWeekIndex, selectedTimeOfDayIndex, notes, useCloseNavButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppointmentsSchedulerDataState)) {
            return false;
        }
        AppointmentsSchedulerDataState appointmentsSchedulerDataState = (AppointmentsSchedulerDataState) other;
        return Intrinsics.areEqual(this.campaignId, appointmentsSchedulerDataState.campaignId) && Intrinsics.areEqual(this.userZoneId, appointmentsSchedulerDataState.userZoneId) && Intrinsics.areEqual(this.userNumber, appointmentsSchedulerDataState.userNumber) && Intrinsics.areEqual(this.userEmail, appointmentsSchedulerDataState.userEmail) && Intrinsics.areEqual(this.agentName, appointmentsSchedulerDataState.agentName) && this.isLoading == appointmentsSchedulerDataState.isLoading && this.isCreatingAppointment == appointmentsSchedulerDataState.isCreatingAppointment && Intrinsics.areEqual(this.timeSlots, appointmentsSchedulerDataState.timeSlots) && this.currentScreen == appointmentsSchedulerDataState.currentScreen && Intrinsics.areEqual(this.selectedWeekIndex, appointmentsSchedulerDataState.selectedWeekIndex) && Intrinsics.areEqual(this.selectedDayOfWeekIndex, appointmentsSchedulerDataState.selectedDayOfWeekIndex) && Intrinsics.areEqual(this.selectedTimeOfDayIndex, appointmentsSchedulerDataState.selectedTimeOfDayIndex) && Intrinsics.areEqual(this.notes, appointmentsSchedulerDataState.notes) && this.useCloseNavButton == appointmentsSchedulerDataState.useCloseNavButton;
    }

    public int hashCode() {
        int iHashCode = ((this.campaignId.hashCode() * 31) + this.userZoneId.hashCode()) * 31;
        String str = this.userNumber;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.userEmail;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.agentName;
        int iHashCode4 = (((((((((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + Boolean.hashCode(this.isLoading)) * 31) + Boolean.hashCode(this.isCreatingAppointment)) * 31) + this.timeSlots.hashCode()) * 31) + this.currentScreen.hashCode()) * 31;
        Integer num = this.selectedWeekIndex;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.selectedDayOfWeekIndex;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.selectedTimeOfDayIndex;
        int iHashCode7 = (iHashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str4 = this.notes;
        return ((iHashCode7 + (str4 != null ? str4.hashCode() : 0)) * 31) + Boolean.hashCode(this.useCloseNavButton);
    }

    public String toString() {
        return "AppointmentsSchedulerDataState(campaignId=" + this.campaignId + ", userZoneId=" + this.userZoneId + ", userNumber=" + this.userNumber + ", userEmail=" + this.userEmail + ", agentName=" + this.agentName + ", isLoading=" + this.isLoading + ", isCreatingAppointment=" + this.isCreatingAppointment + ", timeSlots=" + this.timeSlots + ", currentScreen=" + this.currentScreen + ", selectedWeekIndex=" + this.selectedWeekIndex + ", selectedDayOfWeekIndex=" + this.selectedDayOfWeekIndex + ", selectedTimeOfDayIndex=" + this.selectedTimeOfDayIndex + ", notes=" + this.notes + ", useCloseNavButton=" + this.useCloseNavButton + ")";
    }

    public AppointmentsSchedulerDataState(String campaignId, ZoneId userZoneId, String str, String str2, String str3, boolean z, boolean z2, ImmutableList<AppointmentSlot> timeSlots, AppointmentsSchedulerViewState6 currentScreen, Integer num, Integer num2, Integer num3, String str4, boolean z3) {
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        Intrinsics.checkNotNullParameter(userZoneId, "userZoneId");
        Intrinsics.checkNotNullParameter(timeSlots, "timeSlots");
        Intrinsics.checkNotNullParameter(currentScreen, "currentScreen");
        this.campaignId = campaignId;
        this.userZoneId = userZoneId;
        this.userNumber = str;
        this.userEmail = str2;
        this.agentName = str3;
        this.isLoading = z;
        this.isCreatingAppointment = z2;
        this.timeSlots = timeSlots;
        this.currentScreen = currentScreen;
        this.selectedWeekIndex = num;
        this.selectedDayOfWeekIndex = num2;
        this.selectedTimeOfDayIndex = num3;
        this.notes = str4;
        this.useCloseNavButton = z3;
    }

    public final String getCampaignId() {
        return this.campaignId;
    }

    public final ZoneId getUserZoneId() {
        return this.userZoneId;
    }

    public final String getUserNumber() {
        return this.userNumber;
    }

    public final String getUserEmail() {
        return this.userEmail;
    }

    public final String getAgentName() {
        return this.agentName;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final boolean isCreatingAppointment() {
        return this.isCreatingAppointment;
    }

    public /* synthetic */ AppointmentsSchedulerDataState(String str, ZoneId zoneId, String str2, String str3, String str4, boolean z, boolean z2, ImmutableList immutableList, AppointmentsSchedulerViewState6 appointmentsSchedulerViewState6, Integer num, Integer num2, Integer num3, String str5, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, zoneId, str2, str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? true : z, (i & 64) != 0 ? false : z2, (i & 128) != 0 ? extensions2.persistentListOf() : immutableList, (i & 256) != 0 ? AppointmentsSchedulerViewState6.DatetimePicker : appointmentsSchedulerViewState6, (i & 512) != 0 ? null : num, (i & 1024) != 0 ? null : num2, (i & 2048) != 0 ? null : num3, (i & 4096) != 0 ? null : str5, z3);
    }

    public final ImmutableList<AppointmentSlot> getTimeSlots() {
        return this.timeSlots;
    }

    public final AppointmentsSchedulerViewState6 getCurrentScreen() {
        return this.currentScreen;
    }

    public final Integer getSelectedWeekIndex() {
        return this.selectedWeekIndex;
    }

    public final Integer getSelectedDayOfWeekIndex() {
        return this.selectedDayOfWeekIndex;
    }

    public final Integer getSelectedTimeOfDayIndex() {
        return this.selectedTimeOfDayIndex;
    }

    public final String getNotes() {
        return this.notes;
    }

    public final boolean getUseCloseNavButton() {
        return this.useCloseNavButton;
    }
}
