package com.robinhood.android.common.recurring.sourceoffunds;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.recurring.C11595R;
import com.robinhood.recurring.models.p365db.InvestmentSchedule;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecurringOrderActionType.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\f\rB!\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t\u0082\u0001\u0002\u000e\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderActionType;", "Landroid/os/Parcelable;", "titleTxtResId", "", "amountTypeResId", "doneButtonResId", "<init>", "(III)V", "getTitleTxtResId", "()I", "getAmountTypeResId", "getDoneButtonResId", "Create", "Edit", "Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderActionType$Create;", "Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderActionType$Edit;", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public abstract class RecurringOrderActionType implements Parcelable {
    public static final int $stable = 0;
    private final int amountTypeResId;
    private final int doneButtonResId;
    private final int titleTxtResId;

    public /* synthetic */ RecurringOrderActionType(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3);
    }

    private RecurringOrderActionType(int i, int i2, int i3) {
        this.titleTxtResId = i;
        this.amountTypeResId = i2;
        this.doneButtonResId = i3;
    }

    public final int getTitleTxtResId() {
        return this.titleTxtResId;
    }

    public final int getAmountTypeResId() {
        return this.amountTypeResId;
    }

    public final int getDoneButtonResId() {
        return this.doneButtonResId;
    }

    /* compiled from: RecurringOrderActionType.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderActionType$Create;", "Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderActionType;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Create extends RecurringOrderActionType {
        public static final int $stable = 0;
        public static final Create INSTANCE = new Create();
        public static final Parcelable.Creator<Create> CREATOR = new Creator();

        /* compiled from: RecurringOrderActionType.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Create> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Create createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Create.INSTANCE;
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
            dest.writeInt(1);
        }

        private Create() {
            super(C11595R.string.equity_recurring_source_of_funds_title_create, C11595R.string.recurring_investment_amount_type_create_title, C11048R.string.general_label_continue, null);
        }
    }

    /* compiled from: RecurringOrderActionType.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderActionType$Edit;", "Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderActionType;", "investmentSchedule", "Lcom/robinhood/recurring/models/db/InvestmentSchedule;", "<init>", "(Lcom/robinhood/recurring/models/db/InvestmentSchedule;)V", "getInvestmentSchedule", "()Lcom/robinhood/recurring/models/db/InvestmentSchedule;", "investmentScheduleId", "Ljava/util/UUID;", "getInvestmentScheduleId", "()Ljava/util/UUID;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Edit extends RecurringOrderActionType {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Edit> CREATOR = new Creator();
        private final InvestmentSchedule investmentSchedule;

        /* compiled from: RecurringOrderActionType.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Edit> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Edit createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Edit((InvestmentSchedule) parcel.readParcelable(Edit.class.getClassLoader()));
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
            dest.writeParcelable(this.investmentSchedule, flags);
        }

        public final InvestmentSchedule getInvestmentSchedule() {
            return this.investmentSchedule;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Edit(InvestmentSchedule investmentSchedule) {
            super(C11595R.string.equity_recurring_source_of_funds_title_edit, C11595R.string.recurring_investment_amount_type_edit_title, C11048R.string.general_label_done, null);
            Intrinsics.checkNotNullParameter(investmentSchedule, "investmentSchedule");
            this.investmentSchedule = investmentSchedule;
        }

        public final UUID getInvestmentScheduleId() {
            return this.investmentSchedule.getId();
        }
    }
}
