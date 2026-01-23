package com.robinhood.android.transfers.ach.p265ui.automaticdeposit;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.recurring.RecurringDatePickerActivity;
import com.robinhood.android.common.util.extensions.Views;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.transfers.ach.C30082R;
import com.robinhood.android.transfers.ach.databinding.MergeDateSelectionViewLegacyBinding;
import com.robinhood.android.transfers.ach.p265ui.automaticdeposit.DateSelectionView;
import com.robinhood.utils.datetime.Instants;
import com.robinhood.utils.datetime.LocalDates4;
import com.robinhood.utils.datetime.format.LocalDateFormatter;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import p479j$.time.Instant;
import p479j$.time.LocalDate;
import p479j$.time.ZoneOffset;
import p479j$.time.ZonedDateTime;

/* compiled from: DateSelectionView.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 !2\u00020\u0001:\u0003\"#!B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R$\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/DateSelectionView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/google/android/material/datepicker/CalendarConstraints;", "createCalendarConstraints", "()Lcom/google/android/material/datepicker/CalendarConstraints;", "j$/time/LocalDate", InquiryField.DateField.TYPE, "", "setDateSelection", "(Lj$/time/LocalDate;)V", "showDatePicker", "()V", "Lcom/robinhood/android/transfers/ach/databinding/MergeDateSelectionViewLegacyBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getBinding", "()Lcom/robinhood/android/transfers/ach/databinding/MergeDateSelectionViewLegacyBinding;", "binding", RecurringDatePickerActivity.ARG_SELECTED_DATE, "Lj$/time/LocalDate;", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/DateSelectionView$Callback;", "dateSelectedCallback", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/DateSelectionView$Callback;", "getDateSelectedCallback", "()Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/DateSelectionView$Callback;", "setDateSelectedCallback", "(Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/DateSelectionView$Callback;)V", "Companion", "Callback", "DateValidator", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class DateSelectionView extends FrameLayout {
    private static final String DATE_PICKER_TAG = "dateSelectionViewPicker";
    private static final long MAXIMUM_YEARS_IN_FUTURE = 2;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private Callback dateSelectedCallback;
    private LocalDate selectedDate;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(DateSelectionView.class, "binding", "getBinding()Lcom/robinhood/android/transfers/ach/databinding/MergeDateSelectionViewLegacyBinding;", 0))};
    public static final int $stable = 8;

    /* compiled from: DateSelectionView.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/DateSelectionView$Callback;", "", "j$/time/LocalDate", InquiryField.DateField.TYPE, "", "onDateSelected", "(Lj$/time/LocalDate;)V", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callback {
        void onDateSelected(LocalDate date);
    }

    public /* synthetic */ DateSelectionView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateSelectionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.binding = ViewBinding5.viewBinding(this, DateSelectionView5.INSTANCE);
        ViewGroups.inflate(this, C30082R.layout.merge_date_selection_view_legacy, true);
        OnClickListeners.onClick(this, new C301471(this));
    }

    private final MergeDateSelectionViewLegacyBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeDateSelectionViewLegacyBinding) value;
    }

    public final Callback getDateSelectedCallback() {
        return this.dateSelectedCallback;
    }

    public final void setDateSelectedCallback(Callback callback) {
        this.dateSelectedCallback = callback;
    }

    /* compiled from: DateSelectionView.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.ach.ui.automaticdeposit.DateSelectionView$1 */
    /* synthetic */ class C301471 extends FunctionReferenceImpl implements Function0<Unit> {
        C301471(Object obj) {
            super(0, obj, DateSelectionView.class, "showDatePicker", "showDatePicker()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((DateSelectionView) this.receiver).showDatePicker();
        }
    }

    public final void setDateSelection(LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        this.selectedDate = date;
        getBinding().dateSelectionTextView.setText(LocalDateFormatter.SHORT_WEEKDAY_WITH_YEAR.format((LocalDateFormatter) date));
    }

    public final void showDatePicker() {
        LocalDate localDate = this.selectedDate;
        Long lValueOf = localDate != null ? Long.valueOf(LocalDates4.toEpochMillis$default(localDate, null, 1, null)) : null;
        MaterialDatePicker.Builder<Long> calendarConstraints = MaterialDatePicker.Builder.datePicker().setCalendarConstraints(createCalendarConstraints());
        if (lValueOf != null) {
            calendarConstraints.setSelection(Long.valueOf(lValueOf.longValue()));
        }
        calendarConstraints.setTheme(C13997R.style.ThemeOverlay_Robinhood_DesignSystem_DatePicker);
        MaterialDatePicker<Long> materialDatePickerBuild = calendarConstraints.build();
        materialDatePickerBuild.addOnPositiveButtonClickListener(new MaterialPickerOnPositiveButtonClickListener() { // from class: com.robinhood.android.transfers.ach.ui.automaticdeposit.DateSelectionView$showDatePicker$2$1
            @Override // com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener
            public final void onPositiveButtonClick(Long l) {
                Intrinsics.checkNotNull(l);
                Instant instantOfEpochMilli = Instant.ofEpochMilli(l.longValue());
                Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli, "ofEpochMilli(...)");
                ZoneOffset UTC = ZoneOffset.UTC;
                Intrinsics.checkNotNullExpressionValue(UTC, "UTC");
                LocalDate localDate2 = Instants.toLocalDate(instantOfEpochMilli, UTC);
                DateSelectionView.Callback dateSelectedCallback = this.this$0.getDateSelectedCallback();
                if (dateSelectedCallback != null) {
                    dateSelectedCallback.onDateSelected(localDate2);
                }
            }
        });
        materialDatePickerBuild.show(Views.baseActivity(this).getSupportFragmentManager(), DATE_PICKER_TAG);
    }

    private final CalendarConstraints createCalendarConstraints() {
        LocalDate localDateNow = LocalDate.now();
        LocalDate localDatePlusYears = LocalDate.now().plusYears(2L);
        DateValidator dateValidator = new DateValidator();
        CalendarConstraints.Builder builder = new CalendarConstraints.Builder();
        Intrinsics.checkNotNull(localDateNow);
        CalendarConstraints.Builder start = builder.setStart(LocalDates4.toEpochMillis$default(localDateNow, null, 1, null));
        Intrinsics.checkNotNull(localDatePlusYears);
        CalendarConstraints calendarConstraintsBuild = start.setEnd(LocalDates4.toEpochMillis$default(localDatePlusYears, null, 1, null)).setValidator(dateValidator).build();
        Intrinsics.checkNotNullExpressionValue(calendarConstraintsBuild, "build(...)");
        return calendarConstraintsBuild;
    }

    /* compiled from: DateSelectionView.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\t¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/DateSelectionView$DateValidator;", "Lcom/google/android/material/datepicker/CalendarConstraints$DateValidator;", "<init>", "()V", "isValid", "", InquiryField.DateField.TYPE, "", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    private static final class DateValidator implements CalendarConstraints.DateValidator {
        public static final Parcelable.Creator<DateValidator> CREATOR = new Creator();

        /* compiled from: DateSelectionView.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<DateValidator> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DateValidator createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return new DateValidator();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DateValidator[] newArray(int i) {
                return new DateValidator[i];
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

        @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
        public boolean isValid(long date) {
            ZonedDateTime zonedDateTimeAtStartOfDay = LocalDate.now().atStartOfDay(ZoneOffset.UTC);
            ZonedDateTime zonedDateTimePlusYears = zonedDateTimeAtStartOfDay.plusYears(2L);
            Intrinsics.checkNotNullExpressionValue(zonedDateTimePlusYears, "plusYears(...)");
            long j = 1000;
            long epochSecond = zonedDateTimePlusYears.toEpochSecond() * j;
            Intrinsics.checkNotNull(zonedDateTimeAtStartOfDay);
            return zonedDateTimeAtStartOfDay.toEpochSecond() * j <= date && date < epochSecond;
        }
    }
}
