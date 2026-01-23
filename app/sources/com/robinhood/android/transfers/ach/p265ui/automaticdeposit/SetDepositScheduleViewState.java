package com.robinhood.android.transfers.ach.p265ui.automaticdeposit;

import com.robinhood.android.banking.util.AchTransferStringHelper;
import com.robinhood.android.transfers.ach.C30082R;
import com.robinhood.android.transfers.ach.p265ui.automaticdeposit.DepositScheduleFlowArgs2;
import com.robinhood.android.transfers.lib.C30383R;
import com.robinhood.models.api.ApiDepositSchedule;
import com.robinhood.utils.datetime.format.LocalDateFormatter;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.LocalDate;

/* compiled from: SetDepositScheduleViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\t\n\u000b\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/SetDepositScheduleViewState;", "", "<init>", "()V", "WarningDialog", "ShowEnterAmountScreen", "ShowReviewScreen", "Loaded", "Row", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/SetDepositScheduleViewState$Loaded;", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/SetDepositScheduleViewState$ShowEnterAmountScreen;", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/SetDepositScheduleViewState$ShowReviewScreen;", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/SetDepositScheduleViewState$WarningDialog;", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public abstract class SetDepositScheduleViewState {
    public static final int $stable = 0;

    public /* synthetic */ SetDepositScheduleViewState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: SetDepositScheduleViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/SetDepositScheduleViewState$WarningDialog;", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/SetDepositScheduleViewState;", "<init>", "()V", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class WarningDialog extends SetDepositScheduleViewState {
        public static final int $stable = 0;
        public static final WarningDialog INSTANCE = new WarningDialog();

        private WarningDialog() {
            super(null);
        }
    }

    private SetDepositScheduleViewState() {
    }

    /* compiled from: SetDepositScheduleViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/SetDepositScheduleViewState$ShowEnterAmountScreen;", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/SetDepositScheduleViewState;", "enterAmountArgs", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/EnterAmountArgs;", "<init>", "(Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/EnterAmountArgs;)V", "getEnterAmountArgs", "()Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/EnterAmountArgs;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowEnterAmountScreen extends SetDepositScheduleViewState {
        public static final int $stable = 8;
        private final DepositScheduleFlowArgs enterAmountArgs;

        public static /* synthetic */ ShowEnterAmountScreen copy$default(ShowEnterAmountScreen showEnterAmountScreen, DepositScheduleFlowArgs depositScheduleFlowArgs, int i, Object obj) {
            if ((i & 1) != 0) {
                depositScheduleFlowArgs = showEnterAmountScreen.enterAmountArgs;
            }
            return showEnterAmountScreen.copy(depositScheduleFlowArgs);
        }

        /* renamed from: component1, reason: from getter */
        public final DepositScheduleFlowArgs getEnterAmountArgs() {
            return this.enterAmountArgs;
        }

        public final ShowEnterAmountScreen copy(DepositScheduleFlowArgs enterAmountArgs) {
            Intrinsics.checkNotNullParameter(enterAmountArgs, "enterAmountArgs");
            return new ShowEnterAmountScreen(enterAmountArgs);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowEnterAmountScreen) && Intrinsics.areEqual(this.enterAmountArgs, ((ShowEnterAmountScreen) other).enterAmountArgs);
        }

        public int hashCode() {
            return this.enterAmountArgs.hashCode();
        }

        public String toString() {
            return "ShowEnterAmountScreen(enterAmountArgs=" + this.enterAmountArgs + ")";
        }

        public final DepositScheduleFlowArgs getEnterAmountArgs() {
            return this.enterAmountArgs;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowEnterAmountScreen(DepositScheduleFlowArgs enterAmountArgs) {
            super(null);
            Intrinsics.checkNotNullParameter(enterAmountArgs, "enterAmountArgs");
            this.enterAmountArgs = enterAmountArgs;
        }
    }

    /* compiled from: SetDepositScheduleViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/SetDepositScheduleViewState$ShowReviewScreen;", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/SetDepositScheduleViewState;", "reviewScreenArgs", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/ReviewScreenArgs;", "<init>", "(Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/ReviewScreenArgs;)V", "getReviewScreenArgs", "()Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/ReviewScreenArgs;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowReviewScreen extends SetDepositScheduleViewState {
        public static final int $stable = 8;
        private final DepositScheduleFlowArgs3 reviewScreenArgs;

        public static /* synthetic */ ShowReviewScreen copy$default(ShowReviewScreen showReviewScreen, DepositScheduleFlowArgs3 depositScheduleFlowArgs3, int i, Object obj) {
            if ((i & 1) != 0) {
                depositScheduleFlowArgs3 = showReviewScreen.reviewScreenArgs;
            }
            return showReviewScreen.copy(depositScheduleFlowArgs3);
        }

        /* renamed from: component1, reason: from getter */
        public final DepositScheduleFlowArgs3 getReviewScreenArgs() {
            return this.reviewScreenArgs;
        }

        public final ShowReviewScreen copy(DepositScheduleFlowArgs3 reviewScreenArgs) {
            Intrinsics.checkNotNullParameter(reviewScreenArgs, "reviewScreenArgs");
            return new ShowReviewScreen(reviewScreenArgs);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowReviewScreen) && Intrinsics.areEqual(this.reviewScreenArgs, ((ShowReviewScreen) other).reviewScreenArgs);
        }

        public int hashCode() {
            return this.reviewScreenArgs.hashCode();
        }

        public String toString() {
            return "ShowReviewScreen(reviewScreenArgs=" + this.reviewScreenArgs + ")";
        }

        public final DepositScheduleFlowArgs3 getReviewScreenArgs() {
            return this.reviewScreenArgs;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowReviewScreen(DepositScheduleFlowArgs3 reviewScreenArgs) {
            super(null);
            Intrinsics.checkNotNullParameter(reviewScreenArgs, "reviewScreenArgs");
            this.reviewScreenArgs = reviewScreenArgs;
        }
    }

    /* compiled from: SetDepositScheduleViewState.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J0\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010\u0013R\u0017\u0010'\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b'\u0010)R\u0017\u0010*\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b*\u0010(\u001a\u0004\b*\u0010)R\u0017\u0010+\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010/\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b/\u0010,\u001a\u0004\b0\u0010.R\u0017\u00101\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u0010\u0018R\u0013\u00107\u001a\u0004\u0018\u0001048F¢\u0006\u0006\u001a\u0004\b5\u00106¨\u00068"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/SetDepositScheduleViewState$Loaded;", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/SetDepositScheduleViewState;", "Lcom/robinhood/models/api/ApiDepositSchedule$Frequency;", "selectedFrequency", "j$/time/LocalDate", "depositScheduleStartDate", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/FrequencySelectionArgs;", "frequencySelectionArgs", "<init>", "(Lcom/robinhood/models/api/ApiDepositSchedule$Frequency;Lj$/time/LocalDate;Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/FrequencySelectionArgs;)V", "frequency", "Lcom/robinhood/utils/resource/StringResource;", "getDepositScheduleDescription", "(Lcom/robinhood/models/api/ApiDepositSchedule$Frequency;)Lcom/robinhood/utils/resource/StringResource;", "component1", "()Lcom/robinhood/models/api/ApiDepositSchedule$Frequency;", "component2", "()Lj$/time/LocalDate;", "component3", "()Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/FrequencySelectionArgs;", "copy", "(Lcom/robinhood/models/api/ApiDepositSchedule$Frequency;Lj$/time/LocalDate;Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/FrequencySelectionArgs;)Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/SetDepositScheduleViewState$Loaded;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/models/api/ApiDepositSchedule$Frequency;", "getSelectedFrequency", "Lj$/time/LocalDate;", "getDepositScheduleStartDate", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/FrequencySelectionArgs;", "getFrequencySelectionArgs", "isInEditMode", "Z", "()Z", "isContinueButtonEnabled", "screenTitleTextValue", "Lcom/robinhood/utils/resource/StringResource;", "getScreenTitleTextValue", "()Lcom/robinhood/utils/resource/StringResource;", "depositScheduleDateLabelTextValue", "getDepositScheduleDateLabelTextValue", "depositScheduleStartDateTextValue", "Ljava/lang/String;", "getDepositScheduleStartDateTextValue", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/SetDepositScheduleViewState$Row;", "getSelectedFrequencyRow", "()Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/SetDepositScheduleViewState$Row;", "selectedFrequencyRow", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final /* data */ class Loaded extends SetDepositScheduleViewState {
        public static final int $stable = 8;
        private final StringResource depositScheduleDateLabelTextValue;
        private final LocalDate depositScheduleStartDate;
        private final String depositScheduleStartDateTextValue;
        private final DepositScheduleFlowArgs2 frequencySelectionArgs;
        private final boolean isContinueButtonEnabled;
        private final boolean isInEditMode;
        private final StringResource screenTitleTextValue;
        private final ApiDepositSchedule.Frequency selectedFrequency;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, ApiDepositSchedule.Frequency frequency, LocalDate localDate, DepositScheduleFlowArgs2 depositScheduleFlowArgs2, int i, Object obj) {
            if ((i & 1) != 0) {
                frequency = loaded.selectedFrequency;
            }
            if ((i & 2) != 0) {
                localDate = loaded.depositScheduleStartDate;
            }
            if ((i & 4) != 0) {
                depositScheduleFlowArgs2 = loaded.frequencySelectionArgs;
            }
            return loaded.copy(frequency, localDate, depositScheduleFlowArgs2);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiDepositSchedule.Frequency getSelectedFrequency() {
            return this.selectedFrequency;
        }

        /* renamed from: component2, reason: from getter */
        public final LocalDate getDepositScheduleStartDate() {
            return this.depositScheduleStartDate;
        }

        /* renamed from: component3, reason: from getter */
        public final DepositScheduleFlowArgs2 getFrequencySelectionArgs() {
            return this.frequencySelectionArgs;
        }

        public final Loaded copy(ApiDepositSchedule.Frequency selectedFrequency, LocalDate depositScheduleStartDate, DepositScheduleFlowArgs2 frequencySelectionArgs) {
            Intrinsics.checkNotNullParameter(depositScheduleStartDate, "depositScheduleStartDate");
            Intrinsics.checkNotNullParameter(frequencySelectionArgs, "frequencySelectionArgs");
            return new Loaded(selectedFrequency, depositScheduleStartDate, frequencySelectionArgs);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return this.selectedFrequency == loaded.selectedFrequency && Intrinsics.areEqual(this.depositScheduleStartDate, loaded.depositScheduleStartDate) && Intrinsics.areEqual(this.frequencySelectionArgs, loaded.frequencySelectionArgs);
        }

        public int hashCode() {
            ApiDepositSchedule.Frequency frequency = this.selectedFrequency;
            return ((((frequency == null ? 0 : frequency.hashCode()) * 31) + this.depositScheduleStartDate.hashCode()) * 31) + this.frequencySelectionArgs.hashCode();
        }

        public String toString() {
            return "Loaded(selectedFrequency=" + this.selectedFrequency + ", depositScheduleStartDate=" + this.depositScheduleStartDate + ", frequencySelectionArgs=" + this.frequencySelectionArgs + ")";
        }

        public /* synthetic */ Loaded(ApiDepositSchedule.Frequency frequency, LocalDate localDate, DepositScheduleFlowArgs2 depositScheduleFlowArgs2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : frequency, localDate, depositScheduleFlowArgs2);
        }

        public final ApiDepositSchedule.Frequency getSelectedFrequency() {
            return this.selectedFrequency;
        }

        public final LocalDate getDepositScheduleStartDate() {
            return this.depositScheduleStartDate;
        }

        public final DepositScheduleFlowArgs2 getFrequencySelectionArgs() {
            return this.frequencySelectionArgs;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loaded(ApiDepositSchedule.Frequency frequency, LocalDate depositScheduleStartDate, DepositScheduleFlowArgs2 frequencySelectionArgs) {
            int i;
            StringResource stringResourceInvoke;
            super(null);
            Intrinsics.checkNotNullParameter(depositScheduleStartDate, "depositScheduleStartDate");
            Intrinsics.checkNotNullParameter(frequencySelectionArgs, "frequencySelectionArgs");
            this.selectedFrequency = frequency;
            this.depositScheduleStartDate = depositScheduleStartDate;
            this.frequencySelectionArgs = frequencySelectionArgs;
            boolean z = frequencySelectionArgs instanceof DepositScheduleFlowArgs2.Edit;
            this.isInEditMode = z;
            this.isContinueButtonEnabled = frequency != null;
            StringResource.Companion companion = StringResource.INSTANCE;
            if (z) {
                i = C30082R.string.deposit_schedule_edit_title;
            } else {
                i = C30082R.string.set_deposit_schedule_title;
            }
            this.screenTitleTextValue = companion.invoke(i, new Object[0]);
            if (z) {
                stringResourceInvoke = companion.invoke(C30082R.string.set_deposit_schedule_next_deposit_label, new Object[0]);
            } else {
                stringResourceInvoke = companion.invoke(C30082R.string.deposit_schedules_start_label, new Object[0]);
            }
            this.depositScheduleDateLabelTextValue = stringResourceInvoke;
            this.depositScheduleStartDateTextValue = LocalDateFormatter.SHORT_WEEKDAY_WITH_YEAR.format((LocalDateFormatter) depositScheduleStartDate);
        }

        /* renamed from: isInEditMode, reason: from getter */
        public final boolean getIsInEditMode() {
            return this.isInEditMode;
        }

        /* renamed from: isContinueButtonEnabled, reason: from getter */
        public final boolean getIsContinueButtonEnabled() {
            return this.isContinueButtonEnabled;
        }

        public final Row getSelectedFrequencyRow() {
            ApiDepositSchedule.Frequency frequency = this.selectedFrequency;
            if (frequency != null) {
                return Row.valueOf(frequency.name());
            }
            return null;
        }

        public final StringResource getScreenTitleTextValue() {
            return this.screenTitleTextValue;
        }

        public final StringResource getDepositScheduleDateLabelTextValue() {
            return this.depositScheduleDateLabelTextValue;
        }

        public final String getDepositScheduleStartDateTextValue() {
            return this.depositScheduleStartDateTextValue;
        }

        public final StringResource getDepositScheduleDescription(ApiDepositSchedule.Frequency frequency) {
            Intrinsics.checkNotNullParameter(frequency, "frequency");
            return AchTransferStringHelper.INSTANCE.getDepositScheduleDescription(frequency, this.depositScheduleStartDate);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SetDepositScheduleViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001b\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/SetDepositScheduleViewState$Row;", "", "frequency", "Lcom/robinhood/models/api/ApiDepositSchedule$Frequency;", "title", "", "<init>", "(Ljava/lang/String;ILcom/robinhood/models/api/ApiDepositSchedule$Frequency;I)V", "getFrequency", "()Lcom/robinhood/models/api/ApiDepositSchedule$Frequency;", "getTitle", "()I", "DAILY", "WEEKLY", "BIWEEKLY", "BIMONTHLY", "MONTHLY", "QUARTERLY", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Row {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Row[] $VALUES;
        private final ApiDepositSchedule.Frequency frequency;
        private final int title;
        public static final Row DAILY = new Row("DAILY", 0, ApiDepositSchedule.Frequency.DAILY, C30383R.string.deposit_schedule_frequency_daily);
        public static final Row WEEKLY = new Row("WEEKLY", 1, ApiDepositSchedule.Frequency.WEEKLY, C30383R.string.deposit_schedule_frequency_weekly);
        public static final Row BIWEEKLY = new Row("BIWEEKLY", 2, ApiDepositSchedule.Frequency.BIWEEKLY, C30383R.string.deposit_schedule_frequency_biweekly);
        public static final Row BIMONTHLY = new Row("BIMONTHLY", 3, ApiDepositSchedule.Frequency.BIMONTHLY, C30383R.string.deposit_schedule_frequency_two_months);
        public static final Row MONTHLY = new Row("MONTHLY", 4, ApiDepositSchedule.Frequency.MONTHLY, C30383R.string.deposit_schedule_frequency_monthly);
        public static final Row QUARTERLY = new Row("QUARTERLY", 5, ApiDepositSchedule.Frequency.QUARTERLY, C30383R.string.deposit_schedule_frequency_quarterly);

        private static final /* synthetic */ Row[] $values() {
            return new Row[]{DAILY, WEEKLY, BIWEEKLY, BIMONTHLY, MONTHLY, QUARTERLY};
        }

        public static EnumEntries<Row> getEntries() {
            return $ENTRIES;
        }

        private Row(String str, int i, ApiDepositSchedule.Frequency frequency, int i2) {
            this.frequency = frequency;
            this.title = i2;
        }

        public final ApiDepositSchedule.Frequency getFrequency() {
            return this.frequency;
        }

        public final int getTitle() {
            return this.title;
        }

        static {
            Row[] rowArr$values = $values();
            $VALUES = rowArr$values;
            $ENTRIES = EnumEntries2.enumEntries(rowArr$values);
        }

        public static Row valueOf(String str) {
            return (Row) Enum.valueOf(Row.class, str);
        }

        public static Row[] values() {
            return (Row[]) $VALUES.clone();
        }
    }
}
