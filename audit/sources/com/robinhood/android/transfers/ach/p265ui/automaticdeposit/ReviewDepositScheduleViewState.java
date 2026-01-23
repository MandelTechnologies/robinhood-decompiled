package com.robinhood.android.transfers.ach.p265ui.automaticdeposit;

import android.content.res.Resources;
import com.robinhood.android.ach.format.BankAccountTypes;
import com.robinhood.android.banking.lib.C9631R;
import com.robinhood.android.banking.util.AchTransferStringHelper;
import com.robinhood.android.transfers.ach.C30082R;
import com.robinhood.android.transfers.ach.p265ui.automaticdeposit.DepositScheduleFlowArgs3;
import com.robinhood.android.transfers.lib.C30383R;
import com.robinhood.models.api.ApiAchRelationship;
import com.robinhood.models.api.ApiDepositSchedule;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.datetime.format.LocalDateFormatter;
import com.robinhood.utils.money.Currencies;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.LocalDate;

/* compiled from: ReviewDepositScheduleViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/ReviewDepositScheduleViewState;", "", "<init>", "()V", "Loaded", "Submitting", "Submitted", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/ReviewDepositScheduleViewState$Loaded;", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/ReviewDepositScheduleViewState$Submitted;", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/ReviewDepositScheduleViewState$Submitting;", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public abstract class ReviewDepositScheduleViewState {
    public static final int $stable = 0;

    public /* synthetic */ ReviewDepositScheduleViewState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: ReviewDepositScheduleViewState.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJD\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b0\u0010\u001aR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b2\u0010\u001cR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00103\u001a\u0004\b4\u0010\u001eR\u0017\u00105\u001a\u00020(8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b5\u00107R\u0017\u00108\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010\"R\u0017\u0010;\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b;\u00109\u001a\u0004\b<\u0010\"R\u0017\u0010=\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b=\u00109\u001a\u0004\b>\u0010\"R\u0017\u0010@\u001a\u00020?8\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0017\u0010D\u001a\u00020?8\u0006¢\u0006\f\n\u0004\bD\u0010A\u001a\u0004\bE\u0010CR\u0013\u0010G\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\bF\u0010\"¨\u0006H"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/ReviewDepositScheduleViewState$Loaded;", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/ReviewDepositScheduleViewState;", "Ljava/math/BigDecimal;", "amount", "Lcom/robinhood/models/api/ApiDepositSchedule$Frequency;", "frequency", "j$/time/LocalDate", "startDate", "Lcom/robinhood/models/db/AchRelationship;", "achRelationship", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/ReviewScreenArgs;", "reviewScreenArgs", "<init>", "(Ljava/math/BigDecimal;Lcom/robinhood/models/api/ApiDepositSchedule$Frequency;Lj$/time/LocalDate;Lcom/robinhood/models/db/AchRelationship;Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/ReviewScreenArgs;)V", "Landroid/content/res/Resources;", "resources", "", "getBankSecondaryTextValue", "(Landroid/content/res/Resources;)Ljava/lang/String;", "res", "getDisclaimerTextValue", "component1", "()Ljava/math/BigDecimal;", "component2", "()Lcom/robinhood/models/api/ApiDepositSchedule$Frequency;", "component3", "()Lj$/time/LocalDate;", "component4", "()Lcom/robinhood/models/db/AchRelationship;", "component5", "()Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/ReviewScreenArgs;", "copy", "(Ljava/math/BigDecimal;Lcom/robinhood/models/api/ApiDepositSchedule$Frequency;Lj$/time/LocalDate;Lcom/robinhood/models/db/AchRelationship;Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/ReviewScreenArgs;)Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/ReviewDepositScheduleViewState$Loaded;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/math/BigDecimal;", "getAmount", "Lcom/robinhood/models/api/ApiDepositSchedule$Frequency;", "getFrequency", "Lj$/time/LocalDate;", "getStartDate", "Lcom/robinhood/models/db/AchRelationship;", "getAchRelationship", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/ReviewScreenArgs;", "getReviewScreenArgs", "isInEditMode", "Z", "()Z", "nextDepositSecondaryTextValue", "Ljava/lang/String;", "getNextDepositSecondaryTextValue", "nextDepositPrimaryTextValue", "getNextDepositPrimaryTextValue", "amountTextValue", "getAmountTextValue", "Lcom/robinhood/utils/resource/StringResource;", "screenTitleTextValue", "Lcom/robinhood/utils/resource/StringResource;", "getScreenTitleTextValue", "()Lcom/robinhood/utils/resource/StringResource;", "frequencyTextValue", "getFrequencyTextValue", "getBankPrimaryTextValue", "bankPrimaryTextValue", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final /* data */ class Loaded extends ReviewDepositScheduleViewState {
        public static final int $stable = 8;
        private final AchRelationship achRelationship;
        private final BigDecimal amount;
        private final String amountTextValue;
        private final ApiDepositSchedule.Frequency frequency;
        private final StringResource frequencyTextValue;
        private final boolean isInEditMode;
        private final String nextDepositPrimaryTextValue;
        private final String nextDepositSecondaryTextValue;
        private final DepositScheduleFlowArgs3 reviewScreenArgs;
        private final StringResource screenTitleTextValue;
        private final LocalDate startDate;

        /* compiled from: ReviewDepositScheduleViewState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ApiDepositSchedule.Frequency.values().length];
                try {
                    iArr[ApiDepositSchedule.Frequency.DAILY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ApiDepositSchedule.Frequency.WEEKLY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ApiDepositSchedule.Frequency.BIWEEKLY.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ApiDepositSchedule.Frequency.BIMONTHLY.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[ApiDepositSchedule.Frequency.MONTHLY.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[ApiDepositSchedule.Frequency.QUARTERLY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public static /* synthetic */ Loaded copy$default(Loaded loaded, BigDecimal bigDecimal, ApiDepositSchedule.Frequency frequency, LocalDate localDate, AchRelationship achRelationship, DepositScheduleFlowArgs3 depositScheduleFlowArgs3, int i, Object obj) {
            if ((i & 1) != 0) {
                bigDecimal = loaded.amount;
            }
            if ((i & 2) != 0) {
                frequency = loaded.frequency;
            }
            if ((i & 4) != 0) {
                localDate = loaded.startDate;
            }
            if ((i & 8) != 0) {
                achRelationship = loaded.achRelationship;
            }
            if ((i & 16) != 0) {
                depositScheduleFlowArgs3 = loaded.reviewScreenArgs;
            }
            DepositScheduleFlowArgs3 depositScheduleFlowArgs32 = depositScheduleFlowArgs3;
            LocalDate localDate2 = localDate;
            return loaded.copy(bigDecimal, frequency, localDate2, achRelationship, depositScheduleFlowArgs32);
        }

        /* renamed from: component1, reason: from getter */
        public final BigDecimal getAmount() {
            return this.amount;
        }

        /* renamed from: component2, reason: from getter */
        public final ApiDepositSchedule.Frequency getFrequency() {
            return this.frequency;
        }

        /* renamed from: component3, reason: from getter */
        public final LocalDate getStartDate() {
            return this.startDate;
        }

        /* renamed from: component4, reason: from getter */
        public final AchRelationship getAchRelationship() {
            return this.achRelationship;
        }

        /* renamed from: component5, reason: from getter */
        public final DepositScheduleFlowArgs3 getReviewScreenArgs() {
            return this.reviewScreenArgs;
        }

        public final Loaded copy(BigDecimal amount, ApiDepositSchedule.Frequency frequency, LocalDate startDate, AchRelationship achRelationship, DepositScheduleFlowArgs3 reviewScreenArgs) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(frequency, "frequency");
            Intrinsics.checkNotNullParameter(startDate, "startDate");
            Intrinsics.checkNotNullParameter(reviewScreenArgs, "reviewScreenArgs");
            return new Loaded(amount, frequency, startDate, achRelationship, reviewScreenArgs);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.amount, loaded.amount) && this.frequency == loaded.frequency && Intrinsics.areEqual(this.startDate, loaded.startDate) && Intrinsics.areEqual(this.achRelationship, loaded.achRelationship) && Intrinsics.areEqual(this.reviewScreenArgs, loaded.reviewScreenArgs);
        }

        public int hashCode() {
            int iHashCode = ((((this.amount.hashCode() * 31) + this.frequency.hashCode()) * 31) + this.startDate.hashCode()) * 31;
            AchRelationship achRelationship = this.achRelationship;
            return ((iHashCode + (achRelationship == null ? 0 : achRelationship.hashCode())) * 31) + this.reviewScreenArgs.hashCode();
        }

        public String toString() {
            return "Loaded(amount=" + this.amount + ", frequency=" + this.frequency + ", startDate=" + this.startDate + ", achRelationship=" + this.achRelationship + ", reviewScreenArgs=" + this.reviewScreenArgs + ")";
        }

        public /* synthetic */ Loaded(BigDecimal bigDecimal, ApiDepositSchedule.Frequency frequency, LocalDate localDate, AchRelationship achRelationship, DepositScheduleFlowArgs3 depositScheduleFlowArgs3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(bigDecimal, frequency, localDate, (i & 8) != 0 ? null : achRelationship, depositScheduleFlowArgs3);
        }

        public final BigDecimal getAmount() {
            return this.amount;
        }

        public final ApiDepositSchedule.Frequency getFrequency() {
            return this.frequency;
        }

        public final LocalDate getStartDate() {
            return this.startDate;
        }

        public final AchRelationship getAchRelationship() {
            return this.achRelationship;
        }

        public final DepositScheduleFlowArgs3 getReviewScreenArgs() {
            return this.reviewScreenArgs;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loaded(BigDecimal amount, ApiDepositSchedule.Frequency frequency, LocalDate startDate, AchRelationship achRelationship, DepositScheduleFlowArgs3 reviewScreenArgs) {
            int i;
            StringResource stringResourceInvoke;
            super(null);
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(frequency, "frequency");
            Intrinsics.checkNotNullParameter(startDate, "startDate");
            Intrinsics.checkNotNullParameter(reviewScreenArgs, "reviewScreenArgs");
            this.amount = amount;
            this.frequency = frequency;
            this.startDate = startDate;
            this.achRelationship = achRelationship;
            this.reviewScreenArgs = reviewScreenArgs;
            boolean z = reviewScreenArgs instanceof DepositScheduleFlowArgs3.Edit;
            this.isInEditMode = z;
            this.nextDepositSecondaryTextValue = LocalDateFormatter.WEEKDAY_ONLY.format((LocalDateFormatter) startDate);
            this.nextDepositPrimaryTextValue = LocalDateFormatter.LONG.format((LocalDateFormatter) startDate);
            this.amountTextValue = Money.format$default(Money3.toMoney(amount, Currencies.USD), null, false, null, false, 0, null, false, null, false, false, 1023, null);
            StringResource.Companion companion = StringResource.INSTANCE;
            if (z) {
                i = C30082R.string.deposit_schedule_edit_title;
            } else {
                i = C9631R.string.ach_transfer_review_deposit_header;
            }
            this.screenTitleTextValue = companion.invoke(i, new Object[0]);
            switch (WhenMappings.$EnumSwitchMapping$0[frequency.ordinal()]) {
                case 1:
                    stringResourceInvoke = companion.invoke(C30383R.string.deposit_schedule_frequency_daily, new Object[0]);
                    break;
                case 2:
                    stringResourceInvoke = companion.invoke(C30383R.string.deposit_schedule_frequency_weekly, new Object[0]);
                    break;
                case 3:
                    stringResourceInvoke = companion.invoke(C30383R.string.deposit_schedule_frequency_biweekly, new Object[0]);
                    break;
                case 4:
                    stringResourceInvoke = companion.invoke(C30383R.string.deposit_schedule_frequency_two_months, new Object[0]);
                    break;
                case 5:
                    stringResourceInvoke = companion.invoke(C30383R.string.deposit_schedule_frequency_monthly, new Object[0]);
                    break;
                case 6:
                    stringResourceInvoke = companion.invoke(C30383R.string.deposit_schedule_frequency_quarterly, new Object[0]);
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            this.frequencyTextValue = stringResourceInvoke;
        }

        /* renamed from: isInEditMode, reason: from getter */
        public final boolean getIsInEditMode() {
            return this.isInEditMode;
        }

        public final String getNextDepositSecondaryTextValue() {
            return this.nextDepositSecondaryTextValue;
        }

        public final String getNextDepositPrimaryTextValue() {
            return this.nextDepositPrimaryTextValue;
        }

        public final String getAmountTextValue() {
            return this.amountTextValue;
        }

        public final String getBankPrimaryTextValue() {
            AchRelationship achRelationship = this.achRelationship;
            if (achRelationship != null) {
                return achRelationship.getBankAccountNickname();
            }
            return null;
        }

        public final String getBankSecondaryTextValue(Resources resources) {
            ApiAchRelationship.BankAccountType bankAccountType;
            Intrinsics.checkNotNullParameter(resources, "resources");
            AchRelationship achRelationship = this.achRelationship;
            if (achRelationship == null || (bankAccountType = achRelationship.getBankAccountType()) == null) {
                return null;
            }
            return BankAccountTypes.getTypeAndLastFourDisplayString(bankAccountType, resources, this.achRelationship.getBankAccountNumber());
        }

        public final StringResource getScreenTitleTextValue() {
            return this.screenTitleTextValue;
        }

        public final StringResource getFrequencyTextValue() {
            return this.frequencyTextValue;
        }

        public final String getDisclaimerTextValue(Resources res) {
            Intrinsics.checkNotNullParameter(res, "res");
            return AchTransferStringHelper.getReviewDepositSummary$default(res, new BigDecimal(1000), this.frequency.getIsRecurring(), AchTransferStringHelper.INSTANCE.getDepositScheduleLongDescription(this.frequency, this.startDate).getText(res).toString(), this.amount, false, 32, null);
        }
    }

    private ReviewDepositScheduleViewState() {
    }

    /* compiled from: ReviewDepositScheduleViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/ReviewDepositScheduleViewState$Submitting;", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/ReviewDepositScheduleViewState;", "<init>", "()V", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Submitting extends ReviewDepositScheduleViewState {
        public static final int $stable = 0;
        public static final Submitting INSTANCE = new Submitting();

        private Submitting() {
            super(null);
        }
    }

    /* compiled from: ReviewDepositScheduleViewState.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/ReviewDepositScheduleViewState$Submitted;", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/ReviewDepositScheduleViewState;", "submitEvent", "Lcom/robinhood/udf/UiEvent;", "Lkotlin/Result;", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/TimelineScreenArgs;", "<init>", "(Lcom/robinhood/udf/UiEvent;)V", "getSubmitEvent", "()Lcom/robinhood/udf/UiEvent;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Submitted extends ReviewDepositScheduleViewState {
        public static final int $stable = 8;
        private final UiEvent<Result<DepositScheduleFlowArgs4>> submitEvent;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Submitted copy$default(Submitted submitted, UiEvent uiEvent, int i, Object obj) {
            if ((i & 1) != 0) {
                uiEvent = submitted.submitEvent;
            }
            return submitted.copy(uiEvent);
        }

        public final UiEvent<Result<DepositScheduleFlowArgs4>> component1() {
            return this.submitEvent;
        }

        public final Submitted copy(UiEvent<Result<DepositScheduleFlowArgs4>> submitEvent) {
            Intrinsics.checkNotNullParameter(submitEvent, "submitEvent");
            return new Submitted(submitEvent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Submitted) && Intrinsics.areEqual(this.submitEvent, ((Submitted) other).submitEvent);
        }

        public int hashCode() {
            return this.submitEvent.hashCode();
        }

        public String toString() {
            return "Submitted(submitEvent=" + this.submitEvent + ")";
        }

        public final UiEvent<Result<DepositScheduleFlowArgs4>> getSubmitEvent() {
            return this.submitEvent;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Submitted(UiEvent<Result<DepositScheduleFlowArgs4>> submitEvent) {
            super(null);
            Intrinsics.checkNotNullParameter(submitEvent, "submitEvent");
            this.submitEvent = submitEvent;
        }
    }
}
