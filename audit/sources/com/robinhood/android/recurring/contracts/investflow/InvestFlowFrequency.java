package com.robinhood.android.recurring.contracts.investflow;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.recurring.models.api.ApiInvestmentSchedule;
import com.robinhood.utils.datetime.ZoneIds;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;
import p479j$.time.Instant;
import p479j$.time.LocalDate;
import p479j$.time.ZonedDateTime;
import p479j$.time.temporal.ChronoUnit;

/* compiled from: InvestFlowFrequency.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00042\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowFrequency;", "Landroid/os/Parcelable;", "Once", "Recurring", "Companion", "Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowFrequency$Once;", "Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowFrequency$Recurring;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public interface InvestFlowFrequency extends Parcelable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: InvestFlowFrequency.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowFrequency$Once;", "Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowFrequency;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Once implements InvestFlowFrequency {
        public static final Once INSTANCE = new Once();
        public static final Parcelable.Creator<Once> CREATOR = new Creator();

        /* compiled from: InvestFlowFrequency.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Once> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Once createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Once.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Once[] newArray(int i) {
                return new Once[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Once);
        }

        public int hashCode() {
            return 1276100783;
        }

        public String toString() {
            return "Once";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private Once() {
        }
    }

    /* compiled from: InvestFlowFrequency.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0010J\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0014¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowFrequency$Recurring;", "Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowFrequency;", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "frequency", "j$/time/LocalDate", "startDate", "<init>", "(Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;Lj$/time/LocalDate;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "component2", "()Lj$/time/LocalDate;", "copy", "(Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;Lj$/time/LocalDate;)Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowFrequency$Recurring;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "getFrequency", "Lj$/time/LocalDate;", "getStartDate", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Recurring implements InvestFlowFrequency {
        public static final Parcelable.Creator<Recurring> CREATOR = new Creator();
        private final ApiInvestmentSchedule.Frequency frequency;
        private final LocalDate startDate;

        /* compiled from: InvestFlowFrequency.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Recurring> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Recurring createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Recurring(ApiInvestmentSchedule.Frequency.valueOf(parcel.readString()), (LocalDate) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Recurring[] newArray(int i) {
                return new Recurring[i];
            }
        }

        public static /* synthetic */ Recurring copy$default(Recurring recurring, ApiInvestmentSchedule.Frequency frequency, LocalDate localDate, int i, Object obj) {
            if ((i & 1) != 0) {
                frequency = recurring.frequency;
            }
            if ((i & 2) != 0) {
                localDate = recurring.startDate;
            }
            return recurring.copy(frequency, localDate);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiInvestmentSchedule.Frequency getFrequency() {
            return this.frequency;
        }

        /* renamed from: component2, reason: from getter */
        public final LocalDate getStartDate() {
            return this.startDate;
        }

        public final Recurring copy(ApiInvestmentSchedule.Frequency frequency, LocalDate startDate) {
            Intrinsics.checkNotNullParameter(frequency, "frequency");
            Intrinsics.checkNotNullParameter(startDate, "startDate");
            return new Recurring(frequency, startDate);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Recurring)) {
                return false;
            }
            Recurring recurring = (Recurring) other;
            return this.frequency == recurring.frequency && Intrinsics.areEqual(this.startDate, recurring.startDate);
        }

        public int hashCode() {
            return (this.frequency.hashCode() * 31) + this.startDate.hashCode();
        }

        public String toString() {
            return "Recurring(frequency=" + this.frequency + ", startDate=" + this.startDate + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.frequency.name());
            dest.writeSerializable(this.startDate);
        }

        public Recurring(ApiInvestmentSchedule.Frequency frequency, LocalDate startDate) {
            Intrinsics.checkNotNullParameter(frequency, "frequency");
            Intrinsics.checkNotNullParameter(startDate, "startDate");
            this.frequency = frequency;
            this.startDate = startDate;
        }

        public final ApiInvestmentSchedule.Frequency getFrequency() {
            return this.frequency;
        }

        public /* synthetic */ Recurring(ApiInvestmentSchedule.Frequency frequency, LocalDate localDate, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(frequency, (i & 2) != 0 ? Companion.defaultInvestmentStartDate$default(InvestFlowFrequency.INSTANCE, null, 1, null) : localDate);
        }

        public final LocalDate getStartDate() {
            return this.startDate;
        }
    }

    /* compiled from: InvestFlowFrequency.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowFrequency$Companion;", "", "<init>", "()V", "j$/time/Clock", Card.Icon.CLOCK, "j$/time/LocalDate", "defaultInvestmentStartDate", "(Lj$/time/Clock;)Lj$/time/LocalDate;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public static /* synthetic */ LocalDate defaultInvestmentStartDate$default(Companion companion, Clock clock, int i, Object obj) {
            if ((i & 1) != 0) {
                clock = Clock.system(ZoneIds.INSTANCE.getNEW_YORK());
            }
            return companion.defaultInvestmentStartDate(clock);
        }

        public final LocalDate defaultInvestmentStartDate(Clock clock) {
            Intrinsics.checkNotNullParameter(clock, "clock");
            Instant instant = clock.instant();
            ZoneIds zoneIds = ZoneIds.INSTANCE;
            ZonedDateTime zonedDateTimeAtZone = instant.atZone(zoneIds.getNEW_YORK());
            if (!zonedDateTimeAtZone.isBefore(clock.instant().atZone(zoneIds.getNEW_YORK()).withHour(12).truncatedTo(ChronoUnit.HOURS))) {
                zonedDateTimeAtZone = zonedDateTimeAtZone.plusDays(1L);
            }
            LocalDate localDateMo3459a = zonedDateTimeAtZone.mo3459a();
            Intrinsics.checkNotNullExpressionValue(localDateMo3459a, "toLocalDate(...)");
            return localDateMo3459a;
        }
    }
}
