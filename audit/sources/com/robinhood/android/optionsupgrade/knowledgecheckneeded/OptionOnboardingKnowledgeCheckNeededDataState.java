package com.robinhood.android.optionsupgrade.knowledgecheckneeded;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Instant;

/* compiled from: OptionOnboardingKnowledgeCheckNeededDataState.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0014J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0014J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0014J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0014J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0014J\u0090\u0001\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b$\u0010\u001fJ\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010)\u001a\u00020\u00022\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b.\u0010\u0014R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b0\u0010\u0018R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b1\u0010\u0018R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b2\u0010\u0018R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b\n\u0010\u0014R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b\u000b\u0010\u0014R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010+\u001a\u0004\b\f\u0010\u0014R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00103\u001a\u0004\b4\u0010\u001fR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010+\u001a\u0004\b5\u0010\u0014R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010+\u001a\u0004\b6\u0010\u0014¨\u00067"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/knowledgecheckneeded/OptionOnboardingKnowledgeCheckNeededDataState;", "", "", "appointmentEnabled", "chatEnabled", "chatHidden", "j$/time/Instant", "now", "chatStartTime", "chatEndTime", "isHalfDay", "isWeekend", "isHoliday", "", "disclosureMarkdown", "chatNowCardIsLoading", "scheduleCallCardIsLoading", "<init>", "(ZZZLj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;ZZZLjava/lang/String;ZZ)V", "component1", "()Z", "component2", "component3", "component4", "()Lj$/time/Instant;", "component5", "component6", "component7", "component8", "component9", "component10", "()Ljava/lang/String;", "component11", "component12", "copy", "(ZZZLj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;ZZZLjava/lang/String;ZZ)Lcom/robinhood/android/optionsupgrade/knowledgecheckneeded/OptionOnboardingKnowledgeCheckNeededDataState;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getAppointmentEnabled", "getChatEnabled", "getChatHidden", "Lj$/time/Instant;", "getNow", "getChatStartTime", "getChatEndTime", "Ljava/lang/String;", "getDisclosureMarkdown", "getChatNowCardIsLoading", "getScheduleCallCardIsLoading", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OptionOnboardingKnowledgeCheckNeededDataState {
    public static final int $stable = 8;
    private final boolean appointmentEnabled;
    private final boolean chatEnabled;
    private final Instant chatEndTime;
    private final boolean chatHidden;
    private final boolean chatNowCardIsLoading;
    private final Instant chatStartTime;
    private final String disclosureMarkdown;
    private final boolean isHalfDay;
    private final boolean isHoliday;
    private final boolean isWeekend;
    private final Instant now;
    private final boolean scheduleCallCardIsLoading;

    public static /* synthetic */ OptionOnboardingKnowledgeCheckNeededDataState copy$default(OptionOnboardingKnowledgeCheckNeededDataState optionOnboardingKnowledgeCheckNeededDataState, boolean z, boolean z2, boolean z3, Instant instant, Instant instant2, Instant instant3, boolean z4, boolean z5, boolean z6, String str, boolean z7, boolean z8, int i, Object obj) {
        if ((i & 1) != 0) {
            z = optionOnboardingKnowledgeCheckNeededDataState.appointmentEnabled;
        }
        if ((i & 2) != 0) {
            z2 = optionOnboardingKnowledgeCheckNeededDataState.chatEnabled;
        }
        if ((i & 4) != 0) {
            z3 = optionOnboardingKnowledgeCheckNeededDataState.chatHidden;
        }
        if ((i & 8) != 0) {
            instant = optionOnboardingKnowledgeCheckNeededDataState.now;
        }
        if ((i & 16) != 0) {
            instant2 = optionOnboardingKnowledgeCheckNeededDataState.chatStartTime;
        }
        if ((i & 32) != 0) {
            instant3 = optionOnboardingKnowledgeCheckNeededDataState.chatEndTime;
        }
        if ((i & 64) != 0) {
            z4 = optionOnboardingKnowledgeCheckNeededDataState.isHalfDay;
        }
        if ((i & 128) != 0) {
            z5 = optionOnboardingKnowledgeCheckNeededDataState.isWeekend;
        }
        if ((i & 256) != 0) {
            z6 = optionOnboardingKnowledgeCheckNeededDataState.isHoliday;
        }
        if ((i & 512) != 0) {
            str = optionOnboardingKnowledgeCheckNeededDataState.disclosureMarkdown;
        }
        if ((i & 1024) != 0) {
            z7 = optionOnboardingKnowledgeCheckNeededDataState.chatNowCardIsLoading;
        }
        if ((i & 2048) != 0) {
            z8 = optionOnboardingKnowledgeCheckNeededDataState.scheduleCallCardIsLoading;
        }
        boolean z9 = z7;
        boolean z10 = z8;
        boolean z11 = z6;
        String str2 = str;
        boolean z12 = z4;
        boolean z13 = z5;
        Instant instant4 = instant2;
        Instant instant5 = instant3;
        return optionOnboardingKnowledgeCheckNeededDataState.copy(z, z2, z3, instant, instant4, instant5, z12, z13, z11, str2, z9, z10);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getAppointmentEnabled() {
        return this.appointmentEnabled;
    }

    /* renamed from: component10, reason: from getter */
    public final String getDisclosureMarkdown() {
        return this.disclosureMarkdown;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getChatNowCardIsLoading() {
        return this.chatNowCardIsLoading;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getScheduleCallCardIsLoading() {
        return this.scheduleCallCardIsLoading;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getChatEnabled() {
        return this.chatEnabled;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getChatHidden() {
        return this.chatHidden;
    }

    /* renamed from: component4, reason: from getter */
    public final Instant getNow() {
        return this.now;
    }

    /* renamed from: component5, reason: from getter */
    public final Instant getChatStartTime() {
        return this.chatStartTime;
    }

    /* renamed from: component6, reason: from getter */
    public final Instant getChatEndTime() {
        return this.chatEndTime;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsHalfDay() {
        return this.isHalfDay;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsWeekend() {
        return this.isWeekend;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsHoliday() {
        return this.isHoliday;
    }

    public final OptionOnboardingKnowledgeCheckNeededDataState copy(boolean appointmentEnabled, boolean chatEnabled, boolean chatHidden, Instant now, Instant chatStartTime, Instant chatEndTime, boolean isHalfDay, boolean isWeekend, boolean isHoliday, String disclosureMarkdown, boolean chatNowCardIsLoading, boolean scheduleCallCardIsLoading) {
        return new OptionOnboardingKnowledgeCheckNeededDataState(appointmentEnabled, chatEnabled, chatHidden, now, chatStartTime, chatEndTime, isHalfDay, isWeekend, isHoliday, disclosureMarkdown, chatNowCardIsLoading, scheduleCallCardIsLoading);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionOnboardingKnowledgeCheckNeededDataState)) {
            return false;
        }
        OptionOnboardingKnowledgeCheckNeededDataState optionOnboardingKnowledgeCheckNeededDataState = (OptionOnboardingKnowledgeCheckNeededDataState) other;
        return this.appointmentEnabled == optionOnboardingKnowledgeCheckNeededDataState.appointmentEnabled && this.chatEnabled == optionOnboardingKnowledgeCheckNeededDataState.chatEnabled && this.chatHidden == optionOnboardingKnowledgeCheckNeededDataState.chatHidden && Intrinsics.areEqual(this.now, optionOnboardingKnowledgeCheckNeededDataState.now) && Intrinsics.areEqual(this.chatStartTime, optionOnboardingKnowledgeCheckNeededDataState.chatStartTime) && Intrinsics.areEqual(this.chatEndTime, optionOnboardingKnowledgeCheckNeededDataState.chatEndTime) && this.isHalfDay == optionOnboardingKnowledgeCheckNeededDataState.isHalfDay && this.isWeekend == optionOnboardingKnowledgeCheckNeededDataState.isWeekend && this.isHoliday == optionOnboardingKnowledgeCheckNeededDataState.isHoliday && Intrinsics.areEqual(this.disclosureMarkdown, optionOnboardingKnowledgeCheckNeededDataState.disclosureMarkdown) && this.chatNowCardIsLoading == optionOnboardingKnowledgeCheckNeededDataState.chatNowCardIsLoading && this.scheduleCallCardIsLoading == optionOnboardingKnowledgeCheckNeededDataState.scheduleCallCardIsLoading;
    }

    public int hashCode() {
        int iHashCode = ((((Boolean.hashCode(this.appointmentEnabled) * 31) + Boolean.hashCode(this.chatEnabled)) * 31) + Boolean.hashCode(this.chatHidden)) * 31;
        Instant instant = this.now;
        int iHashCode2 = (iHashCode + (instant == null ? 0 : instant.hashCode())) * 31;
        Instant instant2 = this.chatStartTime;
        int iHashCode3 = (iHashCode2 + (instant2 == null ? 0 : instant2.hashCode())) * 31;
        Instant instant3 = this.chatEndTime;
        int iHashCode4 = (((((((iHashCode3 + (instant3 == null ? 0 : instant3.hashCode())) * 31) + Boolean.hashCode(this.isHalfDay)) * 31) + Boolean.hashCode(this.isWeekend)) * 31) + Boolean.hashCode(this.isHoliday)) * 31;
        String str = this.disclosureMarkdown;
        return ((((iHashCode4 + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.chatNowCardIsLoading)) * 31) + Boolean.hashCode(this.scheduleCallCardIsLoading);
    }

    public String toString() {
        return "OptionOnboardingKnowledgeCheckNeededDataState(appointmentEnabled=" + this.appointmentEnabled + ", chatEnabled=" + this.chatEnabled + ", chatHidden=" + this.chatHidden + ", now=" + this.now + ", chatStartTime=" + this.chatStartTime + ", chatEndTime=" + this.chatEndTime + ", isHalfDay=" + this.isHalfDay + ", isWeekend=" + this.isWeekend + ", isHoliday=" + this.isHoliday + ", disclosureMarkdown=" + this.disclosureMarkdown + ", chatNowCardIsLoading=" + this.chatNowCardIsLoading + ", scheduleCallCardIsLoading=" + this.scheduleCallCardIsLoading + ")";
    }

    public OptionOnboardingKnowledgeCheckNeededDataState(boolean z, boolean z2, boolean z3, Instant instant, Instant instant2, Instant instant3, boolean z4, boolean z5, boolean z6, String str, boolean z7, boolean z8) {
        this.appointmentEnabled = z;
        this.chatEnabled = z2;
        this.chatHidden = z3;
        this.now = instant;
        this.chatStartTime = instant2;
        this.chatEndTime = instant3;
        this.isHalfDay = z4;
        this.isWeekend = z5;
        this.isHoliday = z6;
        this.disclosureMarkdown = str;
        this.chatNowCardIsLoading = z7;
        this.scheduleCallCardIsLoading = z8;
    }

    public /* synthetic */ OptionOnboardingKnowledgeCheckNeededDataState(boolean z, boolean z2, boolean z3, Instant instant, Instant instant2, Instant instant3, boolean z4, boolean z5, boolean z6, String str, boolean z7, boolean z8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, z3, (i & 8) != 0 ? null : instant, instant2, instant3, z4, z5, z6, (i & 512) != 0 ? null : str, (i & 1024) != 0 ? false : z7, (i & 2048) != 0 ? false : z8);
    }

    public final boolean getAppointmentEnabled() {
        return this.appointmentEnabled;
    }

    public final boolean getChatEnabled() {
        return this.chatEnabled;
    }

    public final boolean getChatHidden() {
        return this.chatHidden;
    }

    public final Instant getNow() {
        return this.now;
    }

    public final Instant getChatStartTime() {
        return this.chatStartTime;
    }

    public final Instant getChatEndTime() {
        return this.chatEndTime;
    }

    public final boolean isHalfDay() {
        return this.isHalfDay;
    }

    public final boolean isWeekend() {
        return this.isWeekend;
    }

    public final boolean isHoliday() {
        return this.isHoliday;
    }

    public final String getDisclosureMarkdown() {
        return this.disclosureMarkdown;
    }

    public final boolean getChatNowCardIsLoading() {
        return this.chatNowCardIsLoading;
    }

    public final boolean getScheduleCallCardIsLoading() {
        return this.scheduleCallCardIsLoading;
    }
}
