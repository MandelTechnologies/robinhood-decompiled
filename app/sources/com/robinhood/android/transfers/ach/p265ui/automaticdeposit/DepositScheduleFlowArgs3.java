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
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0018\u0019B)\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\u0082\u0001\u0002\u001a\u001b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/ReviewScreenArgs;", "Landroid/os/Parcelable;", "Lcom/robinhood/models/api/ApiDepositSchedule$Frequency;", "frequency", "j$/time/LocalDate", "startDate", "Ljava/math/BigDecimal;", "amount", "Ljava/util/UUID;", "achRelationshipId", "<init>", "(Lcom/robinhood/models/api/ApiDepositSchedule$Frequency;Lj$/time/LocalDate;Ljava/math/BigDecimal;Ljava/util/UUID;)V", "Lcom/robinhood/models/api/ApiDepositSchedule$Frequency;", "getFrequency", "()Lcom/robinhood/models/api/ApiDepositSchedule$Frequency;", "Lj$/time/LocalDate;", "getStartDate", "()Lj$/time/LocalDate;", "Ljava/math/BigDecimal;", "getAmount", "()Ljava/math/BigDecimal;", "Ljava/util/UUID;", "getAchRelationshipId", "()Ljava/util/UUID;", "Create", "Edit", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/ReviewScreenArgs$Create;", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/ReviewScreenArgs$Edit;", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.ach.ui.automaticdeposit.ReviewScreenArgs, reason: use source file name */
/* loaded from: classes9.dex */
public abstract class DepositScheduleFlowArgs3 implements Parcelable {
    public static final int $stable = 8;
    private final UUID achRelationshipId;
    private final BigDecimal amount;
    private final ApiDepositSchedule.Frequency frequency;
    private final LocalDate startDate;

    public /* synthetic */ DepositScheduleFlowArgs3(ApiDepositSchedule.Frequency frequency, LocalDate localDate, BigDecimal bigDecimal, UUID uuid, DefaultConstructorMarker defaultConstructorMarker) {
        this(frequency, localDate, bigDecimal, uuid);
    }

    private DepositScheduleFlowArgs3(ApiDepositSchedule.Frequency frequency, LocalDate localDate, BigDecimal bigDecimal, UUID uuid) {
        this.frequency = frequency;
        this.startDate = localDate;
        this.amount = bigDecimal;
        this.achRelationshipId = uuid;
    }

    public ApiDepositSchedule.Frequency getFrequency() {
        return this.frequency;
    }

    public LocalDate getStartDate() {
        return this.startDate;
    }

    public BigDecimal getAmount() {
        return this.amount;
    }

    public UUID getAchRelationshipId() {
        return this.achRelationshipId;
    }

    /* compiled from: DepositScheduleFlowArgs.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/ReviewScreenArgs$Create;", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/ReviewScreenArgs;", "Lcom/robinhood/models/api/ApiDepositSchedule$Frequency;", "frequency", "j$/time/LocalDate", "startDate", "Ljava/math/BigDecimal;", "amount", "Ljava/util/UUID;", "achRelationshipId", "<init>", "(Lcom/robinhood/models/api/ApiDepositSchedule$Frequency;Lj$/time/LocalDate;Ljava/math/BigDecimal;Ljava/util/UUID;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lcom/robinhood/models/api/ApiDepositSchedule$Frequency;", "getFrequency", "()Lcom/robinhood/models/api/ApiDepositSchedule$Frequency;", "Lj$/time/LocalDate;", "getStartDate", "()Lj$/time/LocalDate;", "Ljava/math/BigDecimal;", "getAmount", "()Ljava/math/BigDecimal;", "Ljava/util/UUID;", "getAchRelationshipId", "()Ljava/util/UUID;", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.ach.ui.automaticdeposit.ReviewScreenArgs$Create */
    public static final class Create extends DepositScheduleFlowArgs3 {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Create> CREATOR = new Creator();
        private final UUID achRelationshipId;
        private final BigDecimal amount;
        private final ApiDepositSchedule.Frequency frequency;
        private final LocalDate startDate;

        /* compiled from: DepositScheduleFlowArgs.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.transfers.ach.ui.automaticdeposit.ReviewScreenArgs$Create$Creator */
        public static final class Creator implements Parcelable.Creator<Create> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Create createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Create(ApiDepositSchedule.Frequency.valueOf(parcel.readString()), (LocalDate) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (UUID) parcel.readSerializable());
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
            dest.writeString(this.frequency.name());
            dest.writeSerializable(this.startDate);
            dest.writeSerializable(this.amount);
            dest.writeSerializable(this.achRelationshipId);
        }

        @Override // com.robinhood.android.transfers.ach.p265ui.automaticdeposit.DepositScheduleFlowArgs3
        public ApiDepositSchedule.Frequency getFrequency() {
            return this.frequency;
        }

        @Override // com.robinhood.android.transfers.ach.p265ui.automaticdeposit.DepositScheduleFlowArgs3
        public LocalDate getStartDate() {
            return this.startDate;
        }

        @Override // com.robinhood.android.transfers.ach.p265ui.automaticdeposit.DepositScheduleFlowArgs3
        public BigDecimal getAmount() {
            return this.amount;
        }

        @Override // com.robinhood.android.transfers.ach.p265ui.automaticdeposit.DepositScheduleFlowArgs3
        public UUID getAchRelationshipId() {
            return this.achRelationshipId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Create(ApiDepositSchedule.Frequency frequency, LocalDate startDate, BigDecimal amount, UUID achRelationshipId) {
            super(frequency, startDate, amount, achRelationshipId, null);
            Intrinsics.checkNotNullParameter(frequency, "frequency");
            Intrinsics.checkNotNullParameter(startDate, "startDate");
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(achRelationshipId, "achRelationshipId");
            this.frequency = frequency;
            this.startDate = startDate;
            this.amount = amount;
            this.achRelationshipId = achRelationshipId;
        }
    }

    /* compiled from: DepositScheduleFlowArgs.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/ReviewScreenArgs$Edit;", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/ReviewScreenArgs;", "Lcom/robinhood/models/api/ApiDepositSchedule$Frequency;", "frequency", "j$/time/LocalDate", "startDate", "Ljava/math/BigDecimal;", "amount", "Ljava/util/UUID;", "achRelationshipId", "", "depositScheduleId", "<init>", "(Lcom/robinhood/models/api/ApiDepositSchedule$Frequency;Lj$/time/LocalDate;Ljava/math/BigDecimal;Ljava/util/UUID;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lcom/robinhood/models/api/ApiDepositSchedule$Frequency;", "getFrequency", "()Lcom/robinhood/models/api/ApiDepositSchedule$Frequency;", "Lj$/time/LocalDate;", "getStartDate", "()Lj$/time/LocalDate;", "Ljava/math/BigDecimal;", "getAmount", "()Ljava/math/BigDecimal;", "Ljava/util/UUID;", "getAchRelationshipId", "()Ljava/util/UUID;", "Ljava/lang/String;", "getDepositScheduleId", "()Ljava/lang/String;", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.ach.ui.automaticdeposit.ReviewScreenArgs$Edit */
    public static final class Edit extends DepositScheduleFlowArgs3 {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Edit> CREATOR = new Creator();
        private final UUID achRelationshipId;
        private final BigDecimal amount;
        private final String depositScheduleId;
        private final ApiDepositSchedule.Frequency frequency;
        private final LocalDate startDate;

        /* compiled from: DepositScheduleFlowArgs.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.transfers.ach.ui.automaticdeposit.ReviewScreenArgs$Edit$Creator */
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

        @Override // com.robinhood.android.transfers.ach.p265ui.automaticdeposit.DepositScheduleFlowArgs3
        public ApiDepositSchedule.Frequency getFrequency() {
            return this.frequency;
        }

        @Override // com.robinhood.android.transfers.ach.p265ui.automaticdeposit.DepositScheduleFlowArgs3
        public LocalDate getStartDate() {
            return this.startDate;
        }

        @Override // com.robinhood.android.transfers.ach.p265ui.automaticdeposit.DepositScheduleFlowArgs3
        public BigDecimal getAmount() {
            return this.amount;
        }

        @Override // com.robinhood.android.transfers.ach.p265ui.automaticdeposit.DepositScheduleFlowArgs3
        public UUID getAchRelationshipId() {
            return this.achRelationshipId;
        }

        public final String getDepositScheduleId() {
            return this.depositScheduleId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Edit(ApiDepositSchedule.Frequency frequency, LocalDate startDate, BigDecimal amount, UUID achRelationshipId, String depositScheduleId) {
            super(frequency, startDate, amount, achRelationshipId, null);
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
