package com.robinhood.android.settings.p254ui.recurring.detail;

import com.robinhood.models.p355ui.recurring.UiInvestmentSchedule;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestmentScheduleSettingsRows.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\bHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/settings/ui/recurring/detail/EndInvestmentState;", "", "schedule", "Lcom/robinhood/models/ui/recurring/UiInvestmentSchedule;", "title", "Lcom/robinhood/utils/resource/StringResource;", "message", "positiveButtonRes", "", "negativeButtonRes", "<init>", "(Lcom/robinhood/models/ui/recurring/UiInvestmentSchedule;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;II)V", "getSchedule", "()Lcom/robinhood/models/ui/recurring/UiInvestmentSchedule;", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getMessage", "getPositiveButtonRes", "()I", "getNegativeButtonRes", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "feature-recurring-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class EndInvestmentState {
    public static final int $stable = 8;
    private final StringResource message;
    private final int negativeButtonRes;
    private final int positiveButtonRes;
    private final UiInvestmentSchedule schedule;
    private final StringResource title;

    public static /* synthetic */ EndInvestmentState copy$default(EndInvestmentState endInvestmentState, UiInvestmentSchedule uiInvestmentSchedule, StringResource stringResource, StringResource stringResource2, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            uiInvestmentSchedule = endInvestmentState.schedule;
        }
        if ((i3 & 2) != 0) {
            stringResource = endInvestmentState.title;
        }
        if ((i3 & 4) != 0) {
            stringResource2 = endInvestmentState.message;
        }
        if ((i3 & 8) != 0) {
            i = endInvestmentState.positiveButtonRes;
        }
        if ((i3 & 16) != 0) {
            i2 = endInvestmentState.negativeButtonRes;
        }
        int i4 = i2;
        StringResource stringResource3 = stringResource2;
        return endInvestmentState.copy(uiInvestmentSchedule, stringResource, stringResource3, i, i4);
    }

    /* renamed from: component1, reason: from getter */
    public final UiInvestmentSchedule getSchedule() {
        return this.schedule;
    }

    /* renamed from: component2, reason: from getter */
    public final StringResource getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final StringResource getMessage() {
        return this.message;
    }

    /* renamed from: component4, reason: from getter */
    public final int getPositiveButtonRes() {
        return this.positiveButtonRes;
    }

    /* renamed from: component5, reason: from getter */
    public final int getNegativeButtonRes() {
        return this.negativeButtonRes;
    }

    public final EndInvestmentState copy(UiInvestmentSchedule schedule, StringResource title, StringResource message, int positiveButtonRes, int negativeButtonRes) {
        Intrinsics.checkNotNullParameter(schedule, "schedule");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        return new EndInvestmentState(schedule, title, message, positiveButtonRes, negativeButtonRes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EndInvestmentState)) {
            return false;
        }
        EndInvestmentState endInvestmentState = (EndInvestmentState) other;
        return Intrinsics.areEqual(this.schedule, endInvestmentState.schedule) && Intrinsics.areEqual(this.title, endInvestmentState.title) && Intrinsics.areEqual(this.message, endInvestmentState.message) && this.positiveButtonRes == endInvestmentState.positiveButtonRes && this.negativeButtonRes == endInvestmentState.negativeButtonRes;
    }

    public int hashCode() {
        return (((((((this.schedule.hashCode() * 31) + this.title.hashCode()) * 31) + this.message.hashCode()) * 31) + Integer.hashCode(this.positiveButtonRes)) * 31) + Integer.hashCode(this.negativeButtonRes);
    }

    public String toString() {
        return "EndInvestmentState(schedule=" + this.schedule + ", title=" + this.title + ", message=" + this.message + ", positiveButtonRes=" + this.positiveButtonRes + ", negativeButtonRes=" + this.negativeButtonRes + ")";
    }

    public EndInvestmentState(UiInvestmentSchedule schedule, StringResource title, StringResource message, int i, int i2) {
        Intrinsics.checkNotNullParameter(schedule, "schedule");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        this.schedule = schedule;
        this.title = title;
        this.message = message;
        this.positiveButtonRes = i;
        this.negativeButtonRes = i2;
    }

    public final UiInvestmentSchedule getSchedule() {
        return this.schedule;
    }

    public final StringResource getTitle() {
        return this.title;
    }

    public final StringResource getMessage() {
        return this.message;
    }

    public final int getPositiveButtonRes() {
        return this.positiveButtonRes;
    }

    public final int getNegativeButtonRes() {
        return this.negativeButtonRes;
    }
}
