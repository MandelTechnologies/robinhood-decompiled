package com.robinhood.android.settings.p254ui.recurring.detail;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.LocalDate;

/* compiled from: InvestmentScheduleSettingsRows.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/recurring/detail/DateRowState;", "", "Date", "Paused", "Lcom/robinhood/android/settings/ui/recurring/detail/DateRowState$Date;", "Lcom/robinhood/android/settings/ui/recurring/detail/DateRowState$Paused;", "feature-recurring-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public interface DateRowState {

    /* compiled from: InvestmentScheduleSettingsRows.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u0005\u0010\u000b¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/recurring/detail/DateRowState$Date;", "Lcom/robinhood/android/settings/ui/recurring/detail/DateRowState;", "j$/time/LocalDate", "nextInvestmentDate", "", "isCrypto", "<init>", "(Lj$/time/LocalDate;Z)V", "component1", "()Lj$/time/LocalDate;", "component2", "()Z", "copy", "(Lj$/time/LocalDate;Z)Lcom/robinhood/android/settings/ui/recurring/detail/DateRowState$Date;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lj$/time/LocalDate;", "getNextInvestmentDate", "Z", "feature-recurring-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Date implements DateRowState {
        public static final int $stable = 8;
        private final boolean isCrypto;
        private final LocalDate nextInvestmentDate;

        public static /* synthetic */ Date copy$default(Date date, LocalDate localDate, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                localDate = date.nextInvestmentDate;
            }
            if ((i & 2) != 0) {
                z = date.isCrypto;
            }
            return date.copy(localDate, z);
        }

        /* renamed from: component1, reason: from getter */
        public final LocalDate getNextInvestmentDate() {
            return this.nextInvestmentDate;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsCrypto() {
            return this.isCrypto;
        }

        public final Date copy(LocalDate nextInvestmentDate, boolean isCrypto) {
            Intrinsics.checkNotNullParameter(nextInvestmentDate, "nextInvestmentDate");
            return new Date(nextInvestmentDate, isCrypto);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Date)) {
                return false;
            }
            Date date = (Date) other;
            return Intrinsics.areEqual(this.nextInvestmentDate, date.nextInvestmentDate) && this.isCrypto == date.isCrypto;
        }

        public int hashCode() {
            return (this.nextInvestmentDate.hashCode() * 31) + Boolean.hashCode(this.isCrypto);
        }

        public String toString() {
            return "Date(nextInvestmentDate=" + this.nextInvestmentDate + ", isCrypto=" + this.isCrypto + ")";
        }

        public Date(LocalDate nextInvestmentDate, boolean z) {
            Intrinsics.checkNotNullParameter(nextInvestmentDate, "nextInvestmentDate");
            this.nextInvestmentDate = nextInvestmentDate;
            this.isCrypto = z;
        }

        public final LocalDate getNextInvestmentDate() {
            return this.nextInvestmentDate;
        }

        public final boolean isCrypto() {
            return this.isCrypto;
        }
    }

    /* compiled from: InvestmentScheduleSettingsRows.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/recurring/detail/DateRowState$Paused;", "Lcom/robinhood/android/settings/ui/recurring/detail/DateRowState;", "<init>", "()V", "feature-recurring-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Paused implements DateRowState {
        public static final int $stable = 0;
        public static final Paused INSTANCE = new Paused();

        private Paused() {
        }
    }
}
