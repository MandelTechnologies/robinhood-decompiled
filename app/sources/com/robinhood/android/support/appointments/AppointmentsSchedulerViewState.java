package com.robinhood.android.support.appointments;

import com.robinhood.models.p355ui.appointments.AppointmentSlot;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* compiled from: AppointmentsSchedulerViewState.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b6\b\u0087\b\u0018\u00002\u00020\u0001:\u0001IB¿\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\b\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u00103\u001a\u00020\u0003HÆ\u0003J\u000f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u00106\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010#J\u0010\u00107\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010#J\u0010\u00108\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010#J\u000b\u00109\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u0010:\u001a\u00020\u0010HÆ\u0003J\t\u0010;\u001a\u00020\u0010HÆ\u0003J\t\u0010<\u001a\u00020\u0010HÆ\u0003J\t\u0010=\u001a\u00020\u0014HÆ\u0003J\t\u0010>\u001a\u00020\bHÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\bHÆ\u0003JÆ\u0001\u0010C\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010DJ\u0013\u0010E\u001a\u00020\u00102\b\u0010F\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010G\u001a\u00020\nHÖ\u0001J\t\u0010H\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010$\u001a\u0004\b%\u0010#R\u0015\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010$\u001a\u0004\b&\u0010#R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010)R\u0011\u0010\u0011\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b*\u0010)R\u0011\u0010\u0012\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b+\u0010)R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\u0015\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b.\u0010!R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b/\u0010!R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b0\u0010!R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b1\u0010!R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b2\u0010!¨\u0006J"}, m3636d2 = {"Lcom/robinhood/android/support/appointments/AppointmentsSchedulerViewState;", "", "loadingState", "Lcom/robinhood/android/support/appointments/AppointmentsSchedulerViewState$LoadingState;", "appointmentSlots", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/support/appointments/AppointmentWeek;", "appointmentDisplayText", "", "selectedWeekIndex", "", "selectedDayOfWeekIndex", "selectedTimeOfDayIndex", "selectedAppointment", "Lcom/robinhood/models/ui/appointments/AppointmentSlot;", "isCreatingAppointment", "", "canContinue", "useCloseNavButton", "progress", "", "campaignId", "notes", "agentName", "userNumber", "userEmail", "<init>", "(Lcom/robinhood/android/support/appointments/AppointmentsSchedulerViewState$LoadingState;Lkotlinx/collections/immutable/ImmutableList;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/robinhood/models/ui/appointments/AppointmentSlot;ZZZFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getLoadingState", "()Lcom/robinhood/android/support/appointments/AppointmentsSchedulerViewState$LoadingState;", "getAppointmentSlots", "()Lkotlinx/collections/immutable/ImmutableList;", "getAppointmentDisplayText", "()Ljava/lang/String;", "getSelectedWeekIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSelectedDayOfWeekIndex", "getSelectedTimeOfDayIndex", "getSelectedAppointment", "()Lcom/robinhood/models/ui/appointments/AppointmentSlot;", "()Z", "getCanContinue", "getUseCloseNavButton", "getProgress", "()F", "getCampaignId", "getNotes", "getAgentName", "getUserNumber", "getUserEmail", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "(Lcom/robinhood/android/support/appointments/AppointmentsSchedulerViewState$LoadingState;Lkotlinx/collections/immutable/ImmutableList;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/robinhood/models/ui/appointments/AppointmentSlot;ZZZFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/robinhood/android/support/appointments/AppointmentsSchedulerViewState;", "equals", "other", "hashCode", "toString", "LoadingState", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class AppointmentsSchedulerViewState {
    public static final int $stable = 8;
    private final String agentName;
    private final String appointmentDisplayText;
    private final ImmutableList<AppointmentWeek> appointmentSlots;
    private final String campaignId;
    private final boolean canContinue;
    private final boolean isCreatingAppointment;
    private final LoadingState loadingState;
    private final String notes;
    private final float progress;
    private final AppointmentSlot selectedAppointment;
    private final Integer selectedDayOfWeekIndex;
    private final Integer selectedTimeOfDayIndex;
    private final Integer selectedWeekIndex;
    private final boolean useCloseNavButton;
    private final String userEmail;
    private final String userNumber;

    public AppointmentsSchedulerViewState() {
        this(null, null, null, null, null, null, null, false, false, false, 0.0f, null, null, null, null, null, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH, null);
    }

    /* renamed from: component1, reason: from getter */
    public final LoadingState getLoadingState() {
        return this.loadingState;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getUseCloseNavButton() {
        return this.useCloseNavButton;
    }

    /* renamed from: component11, reason: from getter */
    public final float getProgress() {
        return this.progress;
    }

    /* renamed from: component12, reason: from getter */
    public final String getCampaignId() {
        return this.campaignId;
    }

    /* renamed from: component13, reason: from getter */
    public final String getNotes() {
        return this.notes;
    }

    /* renamed from: component14, reason: from getter */
    public final String getAgentName() {
        return this.agentName;
    }

    /* renamed from: component15, reason: from getter */
    public final String getUserNumber() {
        return this.userNumber;
    }

    /* renamed from: component16, reason: from getter */
    public final String getUserEmail() {
        return this.userEmail;
    }

    public final ImmutableList<AppointmentWeek> component2() {
        return this.appointmentSlots;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAppointmentDisplayText() {
        return this.appointmentDisplayText;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getSelectedWeekIndex() {
        return this.selectedWeekIndex;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getSelectedDayOfWeekIndex() {
        return this.selectedDayOfWeekIndex;
    }

    /* renamed from: component6, reason: from getter */
    public final Integer getSelectedTimeOfDayIndex() {
        return this.selectedTimeOfDayIndex;
    }

    /* renamed from: component7, reason: from getter */
    public final AppointmentSlot getSelectedAppointment() {
        return this.selectedAppointment;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsCreatingAppointment() {
        return this.isCreatingAppointment;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getCanContinue() {
        return this.canContinue;
    }

    public final AppointmentsSchedulerViewState copy(LoadingState loadingState, ImmutableList<AppointmentWeek> appointmentSlots, String appointmentDisplayText, Integer selectedWeekIndex, Integer selectedDayOfWeekIndex, Integer selectedTimeOfDayIndex, AppointmentSlot selectedAppointment, boolean isCreatingAppointment, boolean canContinue, boolean useCloseNavButton, float progress, String campaignId, String notes, String agentName, String userNumber, String userEmail) {
        Intrinsics.checkNotNullParameter(loadingState, "loadingState");
        Intrinsics.checkNotNullParameter(appointmentSlots, "appointmentSlots");
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        return new AppointmentsSchedulerViewState(loadingState, appointmentSlots, appointmentDisplayText, selectedWeekIndex, selectedDayOfWeekIndex, selectedTimeOfDayIndex, selectedAppointment, isCreatingAppointment, canContinue, useCloseNavButton, progress, campaignId, notes, agentName, userNumber, userEmail);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppointmentsSchedulerViewState)) {
            return false;
        }
        AppointmentsSchedulerViewState appointmentsSchedulerViewState = (AppointmentsSchedulerViewState) other;
        return Intrinsics.areEqual(this.loadingState, appointmentsSchedulerViewState.loadingState) && Intrinsics.areEqual(this.appointmentSlots, appointmentsSchedulerViewState.appointmentSlots) && Intrinsics.areEqual(this.appointmentDisplayText, appointmentsSchedulerViewState.appointmentDisplayText) && Intrinsics.areEqual(this.selectedWeekIndex, appointmentsSchedulerViewState.selectedWeekIndex) && Intrinsics.areEqual(this.selectedDayOfWeekIndex, appointmentsSchedulerViewState.selectedDayOfWeekIndex) && Intrinsics.areEqual(this.selectedTimeOfDayIndex, appointmentsSchedulerViewState.selectedTimeOfDayIndex) && Intrinsics.areEqual(this.selectedAppointment, appointmentsSchedulerViewState.selectedAppointment) && this.isCreatingAppointment == appointmentsSchedulerViewState.isCreatingAppointment && this.canContinue == appointmentsSchedulerViewState.canContinue && this.useCloseNavButton == appointmentsSchedulerViewState.useCloseNavButton && Float.compare(this.progress, appointmentsSchedulerViewState.progress) == 0 && Intrinsics.areEqual(this.campaignId, appointmentsSchedulerViewState.campaignId) && Intrinsics.areEqual(this.notes, appointmentsSchedulerViewState.notes) && Intrinsics.areEqual(this.agentName, appointmentsSchedulerViewState.agentName) && Intrinsics.areEqual(this.userNumber, appointmentsSchedulerViewState.userNumber) && Intrinsics.areEqual(this.userEmail, appointmentsSchedulerViewState.userEmail);
    }

    public int hashCode() {
        int iHashCode = ((this.loadingState.hashCode() * 31) + this.appointmentSlots.hashCode()) * 31;
        String str = this.appointmentDisplayText;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.selectedWeekIndex;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.selectedDayOfWeekIndex;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.selectedTimeOfDayIndex;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        AppointmentSlot appointmentSlot = this.selectedAppointment;
        int iHashCode6 = (((((((((((iHashCode5 + (appointmentSlot == null ? 0 : appointmentSlot.hashCode())) * 31) + Boolean.hashCode(this.isCreatingAppointment)) * 31) + Boolean.hashCode(this.canContinue)) * 31) + Boolean.hashCode(this.useCloseNavButton)) * 31) + Float.hashCode(this.progress)) * 31) + this.campaignId.hashCode()) * 31;
        String str2 = this.notes;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.agentName;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.userNumber;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.userEmail;
        return iHashCode9 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        return "AppointmentsSchedulerViewState(loadingState=" + this.loadingState + ", appointmentSlots=" + this.appointmentSlots + ", appointmentDisplayText=" + this.appointmentDisplayText + ", selectedWeekIndex=" + this.selectedWeekIndex + ", selectedDayOfWeekIndex=" + this.selectedDayOfWeekIndex + ", selectedTimeOfDayIndex=" + this.selectedTimeOfDayIndex + ", selectedAppointment=" + this.selectedAppointment + ", isCreatingAppointment=" + this.isCreatingAppointment + ", canContinue=" + this.canContinue + ", useCloseNavButton=" + this.useCloseNavButton + ", progress=" + this.progress + ", campaignId=" + this.campaignId + ", notes=" + this.notes + ", agentName=" + this.agentName + ", userNumber=" + this.userNumber + ", userEmail=" + this.userEmail + ")";
    }

    public AppointmentsSchedulerViewState(LoadingState loadingState, ImmutableList<AppointmentWeek> appointmentSlots, String str, Integer num, Integer num2, Integer num3, AppointmentSlot appointmentSlot, boolean z, boolean z2, boolean z3, float f, String campaignId, String str2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(loadingState, "loadingState");
        Intrinsics.checkNotNullParameter(appointmentSlots, "appointmentSlots");
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        this.loadingState = loadingState;
        this.appointmentSlots = appointmentSlots;
        this.appointmentDisplayText = str;
        this.selectedWeekIndex = num;
        this.selectedDayOfWeekIndex = num2;
        this.selectedTimeOfDayIndex = num3;
        this.selectedAppointment = appointmentSlot;
        this.isCreatingAppointment = z;
        this.canContinue = z2;
        this.useCloseNavButton = z3;
        this.progress = f;
        this.campaignId = campaignId;
        this.notes = str2;
        this.agentName = str3;
        this.userNumber = str4;
        this.userEmail = str5;
    }

    public /* synthetic */ AppointmentsSchedulerViewState(LoadingState loadingState, ImmutableList immutableList, String str, Integer num, Integer num2, Integer num3, AppointmentSlot appointmentSlot, boolean z, boolean z2, boolean z3, float f, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? LoadingState.Uninitialized.INSTANCE : loadingState, (i & 2) != 0 ? extensions2.persistentListOf() : immutableList, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : num3, (i & 64) != 0 ? null : appointmentSlot, (i & 128) != 0 ? false : z, (i & 256) != 0 ? true : z2, (i & 512) == 0 ? z3 : true, (i & 1024) != 0 ? 0.0f : f, (i & 2048) != 0 ? "" : str2, (i & 4096) != 0 ? null : str3, (i & 8192) != 0 ? null : str4, (i & 16384) != 0 ? null : str5, (i & 32768) != 0 ? null : str6);
    }

    public final LoadingState getLoadingState() {
        return this.loadingState;
    }

    public final ImmutableList<AppointmentWeek> getAppointmentSlots() {
        return this.appointmentSlots;
    }

    public final String getAppointmentDisplayText() {
        return this.appointmentDisplayText;
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

    public final AppointmentSlot getSelectedAppointment() {
        return this.selectedAppointment;
    }

    public final boolean isCreatingAppointment() {
        return this.isCreatingAppointment;
    }

    public final boolean getCanContinue() {
        return this.canContinue;
    }

    public final boolean getUseCloseNavButton() {
        return this.useCloseNavButton;
    }

    public final float getProgress() {
        return this.progress;
    }

    public final String getCampaignId() {
        return this.campaignId;
    }

    public final String getNotes() {
        return this.notes;
    }

    public final String getAgentName() {
        return this.agentName;
    }

    public final String getUserNumber() {
        return this.userNumber;
    }

    public final String getUserEmail() {
        return this.userEmail;
    }

    /* compiled from: AppointmentsSchedulerViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/support/appointments/AppointmentsSchedulerViewState$LoadingState;", "", "Uninitialized", "Loading", "Loaded", "Error", "Lcom/robinhood/android/support/appointments/AppointmentsSchedulerViewState$LoadingState$Error;", "Lcom/robinhood/android/support/appointments/AppointmentsSchedulerViewState$LoadingState$Loaded;", "Lcom/robinhood/android/support/appointments/AppointmentsSchedulerViewState$LoadingState$Loading;", "Lcom/robinhood/android/support/appointments/AppointmentsSchedulerViewState$LoadingState$Uninitialized;", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface LoadingState {

        /* compiled from: AppointmentsSchedulerViewState.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/support/appointments/AppointmentsSchedulerViewState$LoadingState$Uninitialized;", "Lcom/robinhood/android/support/appointments/AppointmentsSchedulerViewState$LoadingState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Uninitialized implements LoadingState {
            public static final int $stable = 0;
            public static final Uninitialized INSTANCE = new Uninitialized();

            public boolean equals(Object other) {
                return this == other || (other instanceof Uninitialized);
            }

            public int hashCode() {
                return -1307348508;
            }

            public String toString() {
                return "Uninitialized";
            }

            private Uninitialized() {
            }
        }

        /* compiled from: AppointmentsSchedulerViewState.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/support/appointments/AppointmentsSchedulerViewState$LoadingState$Loading;", "Lcom/robinhood/android/support/appointments/AppointmentsSchedulerViewState$LoadingState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Loading implements LoadingState {
            public static final int $stable = 0;
            public static final Loading INSTANCE = new Loading();

            public boolean equals(Object other) {
                return this == other || (other instanceof Loading);
            }

            public int hashCode() {
                return -1302196411;
            }

            public String toString() {
                return "Loading";
            }

            private Loading() {
            }
        }

        /* compiled from: AppointmentsSchedulerViewState.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/support/appointments/AppointmentsSchedulerViewState$LoadingState$Loaded;", "Lcom/robinhood/android/support/appointments/AppointmentsSchedulerViewState$LoadingState;", "subScreen", "Lcom/robinhood/android/support/appointments/SubScreen;", "<init>", "(Lcom/robinhood/android/support/appointments/SubScreen;)V", "getSubScreen", "()Lcom/robinhood/android/support/appointments/SubScreen;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Loaded implements LoadingState {
            public static final int $stable = 0;
            private final AppointmentsSchedulerViewState6 subScreen;

            public static /* synthetic */ Loaded copy$default(Loaded loaded, AppointmentsSchedulerViewState6 appointmentsSchedulerViewState6, int i, Object obj) {
                if ((i & 1) != 0) {
                    appointmentsSchedulerViewState6 = loaded.subScreen;
                }
                return loaded.copy(appointmentsSchedulerViewState6);
            }

            /* renamed from: component1, reason: from getter */
            public final AppointmentsSchedulerViewState6 getSubScreen() {
                return this.subScreen;
            }

            public final Loaded copy(AppointmentsSchedulerViewState6 subScreen) {
                Intrinsics.checkNotNullParameter(subScreen, "subScreen");
                return new Loaded(subScreen);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Loaded) && this.subScreen == ((Loaded) other).subScreen;
            }

            public int hashCode() {
                return this.subScreen.hashCode();
            }

            public String toString() {
                return "Loaded(subScreen=" + this.subScreen + ")";
            }

            public Loaded(AppointmentsSchedulerViewState6 subScreen) {
                Intrinsics.checkNotNullParameter(subScreen, "subScreen");
                this.subScreen = subScreen;
            }

            public final AppointmentsSchedulerViewState6 getSubScreen() {
                return this.subScreen;
            }
        }

        /* compiled from: AppointmentsSchedulerViewState.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/support/appointments/AppointmentsSchedulerViewState$LoadingState$Error;", "Lcom/robinhood/android/support/appointments/AppointmentsSchedulerViewState$LoadingState;", "cause", "", "<init>", "(Ljava/lang/Throwable;)V", "getCause", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Error implements LoadingState {
            public static final int $stable = 8;
            private final Throwable cause;

            public static /* synthetic */ Error copy$default(Error error, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = error.cause;
                }
                return error.copy(th);
            }

            /* renamed from: component1, reason: from getter */
            public final Throwable getCause() {
                return this.cause;
            }

            public final Error copy(Throwable cause) {
                Intrinsics.checkNotNullParameter(cause, "cause");
                return new Error(cause);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && Intrinsics.areEqual(this.cause, ((Error) other).cause);
            }

            public int hashCode() {
                return this.cause.hashCode();
            }

            public String toString() {
                return "Error(cause=" + this.cause + ")";
            }

            public Error(Throwable cause) {
                Intrinsics.checkNotNullParameter(cause, "cause");
                this.cause = cause;
            }

            public final Throwable getCause() {
                return this.cause;
            }
        }
    }
}
