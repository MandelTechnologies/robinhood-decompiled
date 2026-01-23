package com.robinhood.android.common.recurring.date;

import com.robinhood.android.common.recurring.RecurringDatePickerActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.LocalDate;

/* compiled from: RecurringDatePickerArgs.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u0005\u0010\u000b¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/date/RecurringDatePickerArgs;", "", "j$/time/LocalDate", RecurringDatePickerActivity.ARG_SELECTED_DATE, "", "isCrypto", "<init>", "(Lj$/time/LocalDate;Z)V", "component1", "()Lj$/time/LocalDate;", "component2", "()Z", "copy", "(Lj$/time/LocalDate;Z)Lcom/robinhood/android/common/recurring/date/RecurringDatePickerArgs;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lj$/time/LocalDate;", "getSelectedDate", "Z", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class RecurringDatePickerArgs {
    public static final int $stable = 8;
    private final boolean isCrypto;
    private final LocalDate selectedDate;

    public static /* synthetic */ RecurringDatePickerArgs copy$default(RecurringDatePickerArgs recurringDatePickerArgs, LocalDate localDate, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            localDate = recurringDatePickerArgs.selectedDate;
        }
        if ((i & 2) != 0) {
            z = recurringDatePickerArgs.isCrypto;
        }
        return recurringDatePickerArgs.copy(localDate, z);
    }

    /* renamed from: component1, reason: from getter */
    public final LocalDate getSelectedDate() {
        return this.selectedDate;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsCrypto() {
        return this.isCrypto;
    }

    public final RecurringDatePickerArgs copy(LocalDate selectedDate, boolean isCrypto) {
        Intrinsics.checkNotNullParameter(selectedDate, "selectedDate");
        return new RecurringDatePickerArgs(selectedDate, isCrypto);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecurringDatePickerArgs)) {
            return false;
        }
        RecurringDatePickerArgs recurringDatePickerArgs = (RecurringDatePickerArgs) other;
        return Intrinsics.areEqual(this.selectedDate, recurringDatePickerArgs.selectedDate) && this.isCrypto == recurringDatePickerArgs.isCrypto;
    }

    public int hashCode() {
        return (this.selectedDate.hashCode() * 31) + Boolean.hashCode(this.isCrypto);
    }

    public String toString() {
        return "RecurringDatePickerArgs(selectedDate=" + this.selectedDate + ", isCrypto=" + this.isCrypto + ")";
    }

    public RecurringDatePickerArgs(LocalDate selectedDate, boolean z) {
        Intrinsics.checkNotNullParameter(selectedDate, "selectedDate");
        this.selectedDate = selectedDate;
        this.isCrypto = z;
    }

    public final LocalDate getSelectedDate() {
        return this.selectedDate;
    }

    public final boolean isCrypto() {
        return this.isCrypto;
    }
}
