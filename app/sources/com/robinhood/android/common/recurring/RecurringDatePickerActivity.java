package com.robinhood.android.common.recurring;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.utils.datetime.Instants;
import com.robinhood.utils.datetime.LocalDates4;
import com.robinhood.utils.datetime.ZoneIds;
import com.robinhood.utils.extensions.Activity;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.DayOfWeek;
import p479j$.time.Instant;
import p479j$.time.LocalDate;
import p479j$.time.LocalDateTime;
import p479j$.time.ZoneOffset;
import p479j$.time.ZonedDateTime;

/* compiled from: RecurringDatePickerActivity.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0002\u0017\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000b\u0010\u0003R\u001b\u0010\u0011\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0014\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/RecurringDatePickerActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "<init>", "()V", "", "launchDatePicker", "onDialogFinished", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onPause", "j$/time/LocalDate", "initialSelectedDate$delegate", "Lkotlin/Lazy;", "getInitialSelectedDate", "()Lj$/time/LocalDate;", "initialSelectedDate", "", "isCrypto$delegate", "isCrypto", "()Z", "Companion", "DatePickerValidator", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class RecurringDatePickerActivity extends BaseActivity {
    public static final String ARG_IS_CRYPTO = "isCrypto";
    public static final String ARG_SELECTED_DATE = "selectedDate";
    private static final long MAXIMUM_YEARS_IN_FUTURE = 2;

    /* renamed from: initialSelectedDate$delegate, reason: from kotlin metadata */
    private final Lazy initialSelectedDate;

    /* renamed from: isCrypto$delegate, reason: from kotlin metadata */
    private final Lazy isCrypto;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public RecurringDatePickerActivity() {
        super(C11048R.layout.transparent_activity_fragment_container);
        this.initialSelectedDate = Activity.intentExtra(this, ARG_SELECTED_DATE);
        this.isCrypto = Activity.intentExtra(this, "isCrypto");
    }

    /* compiled from: RecurringDatePickerActivity.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\"\u0010\u0016\u001a\n \u0015*\u0004\u0018\u00010\u00140\u00148\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/RecurringDatePickerActivity$DatePickerValidator;", "Lcom/google/android/material/datepicker/CalendarConstraints$DateValidator;", "", "isCrypto", "<init>", "(Z)V", "", InquiryField.DateField.TYPE, "isValid", "(J)Z", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Z", "j$/time/LocalDateTime", "kotlin.jvm.PlatformType", "recurringCutoff", "Lj$/time/LocalDateTime;", "getRecurringCutoff$annotations", "()V", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class DatePickerValidator implements CalendarConstraints.DateValidator {
        public static final int $stable = 8;
        public static final Parcelable.Creator<DatePickerValidator> CREATOR = new Creator();
        private final boolean isCrypto;
        private final LocalDateTime recurringCutoff = LocalDate.now().atStartOfDay(ZoneIds.INSTANCE.getNEW_YORK()).plusHours(12).mo3461d();

        /* compiled from: RecurringDatePickerActivity.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<DatePickerValidator> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DatePickerValidator createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DatePickerValidator(parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DatePickerValidator[] newArray(int i) {
                return new DatePickerValidator[i];
            }
        }

        /* compiled from: RecurringDatePickerActivity.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[DayOfWeek.values().length];
                try {
                    iArr[DayOfWeek.SATURDAY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[DayOfWeek.SUNDAY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private static /* synthetic */ void getRecurringCutoff$annotations() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.isCrypto ? 1 : 0);
        }

        public DatePickerValidator(boolean z) {
            this.isCrypto = z;
        }

        @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
        public boolean isValid(long date) {
            Instant instantOfEpochMilli = Instant.ofEpochMilli(date);
            ZoneIds zoneIds = ZoneIds.INSTANCE;
            LocalDateTime localDateTimeOfInstant = LocalDateTime.ofInstant(instantOfEpochMilli, zoneIds.getUTC());
            ZonedDateTime zonedDateTimeAtStartOfDay = LocalDate.now().atStartOfDay(ZoneOffset.UTC);
            if (!LocalDateTime.now(zoneIds.getNEW_YORK()).isBefore(this.recurringCutoff)) {
                zonedDateTimeAtStartOfDay = zonedDateTimeAtStartOfDay.plusDays(1L);
            }
            Intrinsics.checkNotNull(zonedDateTimeAtStartOfDay);
            long epochSecond = zonedDateTimeAtStartOfDay.toEpochSecond() * 1000;
            LocalDate localDatePlusYears = LocalDate.now().plusYears(2L);
            Intrinsics.checkNotNullExpressionValue(localDatePlusYears, "plusYears(...)");
            boolean z = epochSecond <= date && date < LocalDates4.toEpochMillis$default(localDatePlusYears, null, 1, null);
            DayOfWeek dayOfWeek = localDateTimeOfInstant.getDayOfWeek();
            int i = dayOfWeek == null ? -1 : WhenMappings.$EnumSwitchMapping$0[dayOfWeek.ordinal()];
            return z && (!(i == 1 || i == 2) || this.isCrypto);
        }
    }

    private final LocalDate getInitialSelectedDate() {
        return (LocalDate) this.initialSelectedDate.getValue();
    }

    private final boolean isCrypto() {
        return ((Boolean) this.isCrypto.getValue()).booleanValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setResult(0);
        launchDatePicker();
    }

    @Override // com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        onDialogFinished();
    }

    private final void launchDatePicker() {
        final MaterialDatePicker<Long> materialDatePickerBuild;
        LocalDate localDateNow = LocalDate.now();
        LocalDate localDatePlusYears = LocalDate.now().plusYears(2L);
        LocalDate initialSelectedDate = getInitialSelectedDate();
        Intrinsics.checkNotNull(localDateNow);
        LocalDate localDate = LocalDates4.toEpochMillis$default(localDateNow, null, 1, null) > LocalDates4.toEpochMillis$default(initialSelectedDate, null, 1, null) ? localDateNow : initialSelectedDate;
        Intrinsics.checkNotNull(localDate);
        long epochMillis$default = LocalDates4.toEpochMillis$default(localDate, null, 1, null);
        CalendarConstraints.Builder start = new CalendarConstraints.Builder().setStart(LocalDates4.toEpochMillis$default(localDateNow, null, 1, null));
        Intrinsics.checkNotNull(localDatePlusYears);
        CalendarConstraints calendarConstraintsBuild = start.setEnd(LocalDates4.toEpochMillis$default(localDatePlusYears, null, 1, null)).setOpenAt(epochMillis$default).setValidator(new DatePickerValidator(isCrypto())).build();
        Intrinsics.checkNotNullExpressionValue(calendarConstraintsBuild, "build(...)");
        if (isCrypto()) {
            materialDatePickerBuild = MaterialDatePicker.Builder.datePicker().setCalendarConstraints(calendarConstraintsBuild).setSelection(Long.valueOf(LocalDates4.toEpochMillis$default(initialSelectedDate, null, 1, null))).setTheme(C13997R.style.ThemeOverlay_Robinhood_DesignSystem_DatePicker_Monochrome).build();
        } else {
            materialDatePickerBuild = MaterialDatePicker.Builder.datePicker().setCalendarConstraints(calendarConstraintsBuild).setSelection(Long.valueOf(LocalDates4.toEpochMillis$default(initialSelectedDate, null, 1, null))).build();
        }
        materialDatePickerBuild.addOnPositiveButtonClickListener(new MaterialPickerOnPositiveButtonClickListener() { // from class: com.robinhood.android.common.recurring.RecurringDatePickerActivity$launchDatePicker$1$1
            @Override // com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener
            public final void onPositiveButtonClick(Long l) {
                Intrinsics.checkNotNull(l);
                Instant instantOfEpochMilli = Instant.ofEpochMilli(l.longValue());
                Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli, "ofEpochMilli(...)");
                ZoneOffset UTC = ZoneOffset.UTC;
                Intrinsics.checkNotNullExpressionValue(UTC, "UTC");
                this.this$0.setResult(-1, new Intent().putExtra(RecurringDatePickerActivity.ARG_SELECTED_DATE, Instants.toLocalDate(instantOfEpochMilli, UTC)));
                this.this$0.onDialogFinished();
            }
        });
        materialDatePickerBuild.addOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.robinhood.android.common.recurring.RecurringDatePickerActivity$launchDatePicker$1$2
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                materialDatePickerBuild.dismiss();
                this.onDialogFinished();
            }
        });
        materialDatePickerBuild.addOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.robinhood.android.common.recurring.RecurringDatePickerActivity$launchDatePicker$1$3
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.this$0.onDialogFinished();
            }
        });
        materialDatePickerBuild.show(getSupportFragmentManager(), materialDatePickerBuild.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onDialogFinished() {
        finish();
        overridePendingTransition(0, 0);
    }

    /* compiled from: RecurringDatePickerActivity.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/RecurringDatePickerActivity$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "j$/time/LocalDate", RecurringDatePickerActivity.ARG_SELECTED_DATE, "", "isCrypto", "Landroid/content/Intent;", "getIntent", "(Landroid/content/Context;Lj$/time/LocalDate;Z)Landroid/content/Intent;", "", "ARG_SELECTED_DATE", "Ljava/lang/String;", "ARG_IS_CRYPTO", "", "MAXIMUM_YEARS_IN_FUTURE", "J", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Intent getIntent(Context context, LocalDate selectedDate, boolean isCrypto) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(selectedDate, "selectedDate");
            Intent intent = new Intent(context, (Class<?>) RecurringDatePickerActivity.class);
            intent.putExtra(RecurringDatePickerActivity.ARG_SELECTED_DATE, selectedDate);
            intent.putExtra("isCrypto", isCrypto);
            return intent;
        }
    }
}
