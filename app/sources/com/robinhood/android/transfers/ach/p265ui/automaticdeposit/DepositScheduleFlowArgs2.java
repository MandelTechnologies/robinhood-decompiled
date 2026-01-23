package com.robinhood.android.transfers.ach.p265ui.automaticdeposit;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.models.api.ApiDepositSchedule;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.LocalDate;

/* compiled from: DepositScheduleFlowArgs.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u000e\u000fB\u001f\b\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r\u0082\u0001\u0002\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/FrequencySelectionArgs;", "Landroid/os/Parcelable;", "Lcom/robinhood/models/api/ApiDepositSchedule$Frequency;", "frequency", "j$/time/LocalDate", "startDate", "<init>", "(Lcom/robinhood/models/api/ApiDepositSchedule$Frequency;Lj$/time/LocalDate;)V", "Lcom/robinhood/models/api/ApiDepositSchedule$Frequency;", "getFrequency", "()Lcom/robinhood/models/api/ApiDepositSchedule$Frequency;", "Lj$/time/LocalDate;", "getStartDate", "()Lj$/time/LocalDate;", "Create", "Edit", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/FrequencySelectionArgs$Create;", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/FrequencySelectionArgs$Edit;", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.ach.ui.automaticdeposit.FrequencySelectionArgs, reason: use source file name */
/* loaded from: classes9.dex */
public abstract class DepositScheduleFlowArgs2 implements Parcelable {
    public static final int $stable = 8;
    private final ApiDepositSchedule.Frequency frequency;
    private final LocalDate startDate;

    public /* synthetic */ DepositScheduleFlowArgs2(ApiDepositSchedule.Frequency frequency, LocalDate localDate, DefaultConstructorMarker defaultConstructorMarker) {
        this(frequency, localDate);
    }

    private DepositScheduleFlowArgs2(ApiDepositSchedule.Frequency frequency, LocalDate localDate) {
        this.frequency = frequency;
        this.startDate = localDate;
    }

    public /* synthetic */ DepositScheduleFlowArgs2(ApiDepositSchedule.Frequency frequency, LocalDate localDate, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(frequency, (i & 2) != 0 ? null : localDate, null);
    }

    public ApiDepositSchedule.Frequency getFrequency() {
        return this.frequency;
    }

    public LocalDate getStartDate() {
        return this.startDate;
    }

    /* compiled from: DepositScheduleFlowArgs.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/FrequencySelectionArgs$Create;", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/FrequencySelectionArgs;", "frequency", "Lcom/robinhood/models/api/ApiDepositSchedule$Frequency;", "<init>", "(Lcom/robinhood/models/api/ApiDepositSchedule$Frequency;)V", "getFrequency", "()Lcom/robinhood/models/api/ApiDepositSchedule$Frequency;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.ach.ui.automaticdeposit.FrequencySelectionArgs$Create */
    public static final class Create extends DepositScheduleFlowArgs2 {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Create> CREATOR = new Creator();
        private final ApiDepositSchedule.Frequency frequency;

        /* compiled from: DepositScheduleFlowArgs.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.transfers.ach.ui.automaticdeposit.FrequencySelectionArgs$Create$Creator */
        public static final class Creator implements Parcelable.Creator<Create> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Create createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Create(parcel.readInt() == 0 ? null : ApiDepositSchedule.Frequency.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Create[] newArray(int i) {
                return new Create[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            ApiDepositSchedule.Frequency frequency = this.frequency;
            if (frequency == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(frequency.name());
            }
        }

        @Override // com.robinhood.android.transfers.ach.p265ui.automaticdeposit.DepositScheduleFlowArgs2
        public ApiDepositSchedule.Frequency getFrequency() {
            return this.frequency;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Create(ApiDepositSchedule.Frequency frequency) {
            super(frequency, null, 2, 0 == true ? 1 : 0);
            this.frequency = frequency;
        }
    }

    /* compiled from: DepositScheduleFlowArgs.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/FrequencySelectionArgs$Edit;", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/FrequencySelectionArgs;", "Lcom/robinhood/models/api/ApiDepositSchedule$Frequency;", "frequency", "j$/time/LocalDate", "startDate", "Ljava/math/BigDecimal;", "amount", "Ljava/util/UUID;", "achRelationshipId", "", "depositScheduleId", "<init>", "(Lcom/robinhood/models/api/ApiDepositSchedule$Frequency;Lj$/time/LocalDate;Ljava/math/BigDecimal;Ljava/util/UUID;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lcom/robinhood/models/api/ApiDepositSchedule$Frequency;", "getFrequency", "()Lcom/robinhood/models/api/ApiDepositSchedule$Frequency;", "Lj$/time/LocalDate;", "getStartDate", "()Lj$/time/LocalDate;", "Ljava/math/BigDecimal;", "getAmount", "()Ljava/math/BigDecimal;", "Ljava/util/UUID;", "getAchRelationshipId", "()Ljava/util/UUID;", "Ljava/lang/String;", "getDepositScheduleId", "()Ljava/lang/String;", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.ach.ui.automaticdeposit.FrequencySelectionArgs$Edit */
    public static final class Edit extends DepositScheduleFlowArgs2 {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Edit> CREATOR = new Creator();
        private final UUID achRelationshipId;
        private final BigDecimal amount;
        private final String depositScheduleId;
        private final ApiDepositSchedule.Frequency frequency;
        private final LocalDate startDate;

        /* compiled from: DepositScheduleFlowArgs.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.transfers.ach.ui.automaticdeposit.FrequencySelectionArgs$Edit$Creator */
        public static final class Creator implements Parcelable.Creator<Edit> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Edit createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Edit(ApiDepositSchedule.Frequency.valueOf(parcel.readString()), (LocalDate) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (UUID) parcel.readSerializable(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Edit[] newArray(int i) {
                return new Edit[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.frequency.name());
            dest.writeSerializable(this.startDate);
            dest.writeSerializable(this.amount);
            dest.writeSerializable(this.achRelationshipId);
            dest.writeString(this.depositScheduleId);
        }

        @Override // com.robinhood.android.transfers.ach.p265ui.automaticdeposit.DepositScheduleFlowArgs2
        public ApiDepositSchedule.Frequency getFrequency() {
            return this.frequency;
        }

        @Override // com.robinhood.android.transfers.ach.p265ui.automaticdeposit.DepositScheduleFlowArgs2
        public LocalDate getStartDate() {
            return this.startDate;
        }

        public final BigDecimal getAmount() {
            return this.amount;
        }

        public final UUID getAchRelationshipId() {
            return this.achRelationshipId;
        }

        public final String getDepositScheduleId() {
            return this.depositScheduleId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Edit(ApiDepositSchedule.Frequency frequency, LocalDate startDate, BigDecimal amount, UUID achRelationshipId, String depositScheduleId) {
            super(frequency, startDate, null);
            Intrinsics.checkNotNullParameter(frequency, "frequency");
            Intrinsics.checkNotNullParameter(startDate, "startDate");
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(achRelationshipId, "achRelationshipId");
            Intrinsics.checkNotNullParameter(depositScheduleId, "depositScheduleId");
            this.frequency = frequency;
            this.startDate = startDate;
            this.amount = amount;
            this.achRelationshipId = achRelationshipId;
            this.depositScheduleId = depositScheduleId;
        }
    }
}
