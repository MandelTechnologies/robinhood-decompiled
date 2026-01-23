package com.robinhood.android.cash.disputes.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import androidx.core.util.Pair;
import com.google.android.material.R$attr;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener;
import com.robinhood.android.cash.disputes.C10007R;
import com.robinhood.android.cash.disputes.databinding.MergeDateSelectionViewBinding;
import com.robinhood.android.cash.disputes.extensions.LocalDates2;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.recurring.RecurringDatePickerActivity;
import com.robinhood.android.common.util.extensions.Views;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.utils.datetime.Instants;
import com.robinhood.utils.datetime.format.LocalDateFormatter;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import kotlin.Metadata;
import kotlin.Tuples2;
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

/* compiled from: DateSelectionView.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 ?2\u00020\u0001:\u0004@AB?B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR(\u0010!\u001a\u0004\u0018\u00010\u00132\b\u0010 \u001a\u0004\u0018\u00010\u00138\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b!\u0010\"\"\u0004\b#\u0010$R@\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0013\u0018\u00010%2\u0014\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0013\u0018\u00010%8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0016\u0010*\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010,\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010+R$\u0010.\u001a\u0004\u0018\u00010-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R$\u00105\u001a\u0004\u0018\u0001048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R$\u0010;\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010\"\u001a\u0004\b<\u0010=\"\u0004\b>\u0010$¨\u0006C"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/view/DateSelectionView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "showDatePicker", "()V", "", "previousSelectionMillis", "Lcom/google/android/material/datepicker/CalendarConstraints;", "createCalendarConstraints", "(Ljava/lang/Long;)Lcom/google/android/material/datepicker/CalendarConstraints;", "", "resolveMaterialCalendarTheme", "()Ljava/lang/Integer;", "j$/time/LocalDate", "firstDate", "secondDate", "", "ignoreIfManuallyAdjusted", "setDateSelection", "(Lj$/time/LocalDate;Lj$/time/LocalDate;Z)V", "Lcom/robinhood/android/cash/disputes/databinding/MergeDateSelectionViewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getBinding", "()Lcom/robinhood/android/cash/disputes/databinding/MergeDateSelectionViewBinding;", "binding", "value", RecurringDatePickerActivity.ARG_SELECTED_DATE, "Lj$/time/LocalDate;", "setSelectedDate", "(Lj$/time/LocalDate;)V", "Lkotlin/Pair;", "selectedDateRange", "Lkotlin/Pair;", "setSelectedDateRange", "(Lkotlin/Pair;)V", "isDateRangeSelection", "Z", "hasDateBeenManuallyAdjusted", "Lcom/robinhood/android/cash/disputes/view/DateSelectionView$SingleDateCallbacks;", "singleDateCallbacks", "Lcom/robinhood/android/cash/disputes/view/DateSelectionView$SingleDateCallbacks;", "getSingleDateCallbacks", "()Lcom/robinhood/android/cash/disputes/view/DateSelectionView$SingleDateCallbacks;", "setSingleDateCallbacks", "(Lcom/robinhood/android/cash/disputes/view/DateSelectionView$SingleDateCallbacks;)V", "Lcom/robinhood/android/cash/disputes/view/DateSelectionView$DateRangeCallbacks;", "dateRangeCallbacks", "Lcom/robinhood/android/cash/disputes/view/DateSelectionView$DateRangeCallbacks;", "getDateRangeCallbacks", "()Lcom/robinhood/android/cash/disputes/view/DateSelectionView$DateRangeCallbacks;", "setDateRangeCallbacks", "(Lcom/robinhood/android/cash/disputes/view/DateSelectionView$DateRangeCallbacks;)V", "earliestAvailableDate", "getEarliestAvailableDate", "()Lj$/time/LocalDate;", "setEarliestAvailableDate", "Companion", "SingleDateCallbacks", "DateRangeCallbacks", "BeforeDateValidator", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class DateSelectionView extends FrameLayout {
    private static final String DATE_PICKER_TAG = "dateSelectionViewPicker";

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private DateRangeCallbacks dateRangeCallbacks;
    private LocalDate earliestAvailableDate;
    private boolean hasDateBeenManuallyAdjusted;
    private boolean isDateRangeSelection;
    private LocalDate selectedDate;
    private Tuples2<LocalDate, LocalDate> selectedDateRange;
    private SingleDateCallbacks singleDateCallbacks;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(DateSelectionView.class, "binding", "getBinding()Lcom/robinhood/android/cash/disputes/databinding/MergeDateSelectionViewBinding;", 0))};
    public static final int $stable = 8;

    /* compiled from: DateSelectionView.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J#\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/view/DateSelectionView$DateRangeCallbacks;", "", "Lkotlin/Pair;", "j$/time/LocalDate", "dateRange", "", "onDateRangeSelected", "(Lkotlin/Pair;)V", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface DateRangeCallbacks {
        void onDateRangeSelected(Tuples2<LocalDate, LocalDate> dateRange);
    }

    /* compiled from: DateSelectionView.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/view/DateSelectionView$SingleDateCallbacks;", "", "j$/time/LocalDate", InquiryField.DateField.TYPE, "", "onDateSelected", "(Lj$/time/LocalDate;)V", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface SingleDateCallbacks {
        void onDateSelected(LocalDate date);
    }

    public /* synthetic */ DateSelectionView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateSelectionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.binding = ViewBinding5.viewBinding(this, DateSelectionView2.INSTANCE);
        ViewGroups.inflate(this, C10007R.layout.merge_date_selection_view, true);
        OnClickListeners.onClick(this, new C100651(this));
        int[] DateSelectionView = C10007R.styleable.DateSelectionView;
        Intrinsics.checkNotNullExpressionValue(DateSelectionView, "DateSelectionView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DateSelectionView, 0, 0);
        this.isDateRangeSelection = typedArrayObtainStyledAttributes.getBoolean(C10007R.styleable.DateSelectionView_isDateRangeSelection, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    private final MergeDateSelectionViewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeDateSelectionViewBinding) value;
    }

    private final void setSelectedDate(LocalDate localDate) {
        SingleDateCallbacks singleDateCallbacks;
        this.selectedDate = localDate;
        if (localDate == null || (singleDateCallbacks = this.singleDateCallbacks) == null) {
            return;
        }
        singleDateCallbacks.onDateSelected(localDate);
    }

    private final void setSelectedDateRange(Tuples2<LocalDate, LocalDate> tuples2) {
        DateRangeCallbacks dateRangeCallbacks;
        this.selectedDateRange = tuples2;
        if (tuples2 == null || (dateRangeCallbacks = this.dateRangeCallbacks) == null) {
            return;
        }
        dateRangeCallbacks.onDateRangeSelected(tuples2);
    }

    public final SingleDateCallbacks getSingleDateCallbacks() {
        return this.singleDateCallbacks;
    }

    public final void setSingleDateCallbacks(SingleDateCallbacks singleDateCallbacks) {
        this.singleDateCallbacks = singleDateCallbacks;
    }

    public final DateRangeCallbacks getDateRangeCallbacks() {
        return this.dateRangeCallbacks;
    }

    public final void setDateRangeCallbacks(DateRangeCallbacks dateRangeCallbacks) {
        this.dateRangeCallbacks = dateRangeCallbacks;
    }

    public final LocalDate getEarliestAvailableDate() {
        return this.earliestAvailableDate;
    }

    public final void setEarliestAvailableDate(LocalDate localDate) {
        this.earliestAvailableDate = localDate;
    }

    /* compiled from: DateSelectionView.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cash.disputes.view.DateSelectionView$1 */
    /* synthetic */ class C100651 extends FunctionReferenceImpl implements Function0<Unit> {
        C100651(Object obj) {
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

    public static /* synthetic */ void setDateSelection$default(DateSelectionView dateSelectionView, LocalDate localDate, LocalDate localDate2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            localDate2 = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        dateSelectionView.setDateSelection(localDate, localDate2, z);
    }

    public final void setDateSelection(LocalDate firstDate, LocalDate secondDate, boolean ignoreIfManuallyAdjusted) {
        Intrinsics.checkNotNullParameter(firstDate, "firstDate");
        if (ignoreIfManuallyAdjusted && this.hasDateBeenManuallyAdjusted) {
            return;
        }
        if (secondDate == null) {
            setSelectedDate(firstDate);
            getBinding().dateSelectionTextView.setText(LocalDateFormatter.MEDIUM.format((LocalDateFormatter) firstDate));
            return;
        }
        setSelectedDateRange(new Tuples2<>(firstDate, secondDate));
        RhTextView rhTextView = getBinding().dateSelectionTextView;
        int i = C10007R.string.date_selection_view_range;
        LocalDateFormatter localDateFormatter = LocalDateFormatter.MEDIUM;
        rhTextView.setText(ViewsKt.getString(this, i, localDateFormatter.format((LocalDateFormatter) firstDate), localDateFormatter.format((LocalDateFormatter) secondDate)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showDatePicker() {
        LocalDate first;
        if (this.isDateRangeSelection) {
            Tuples2<LocalDate, LocalDate> tuples2 = this.selectedDateRange;
            if (tuples2 != null && (first = tuples2.getFirst()) != null) {
                lValueOf = Long.valueOf(LocalDates2.toDatePickerFormat(first));
            }
            MaterialDatePicker.Builder<Pair<Long, Long>> calendarConstraints = MaterialDatePicker.Builder.dateRangePicker().setCalendarConstraints(createCalendarConstraints(lValueOf));
            Tuples2<LocalDate, LocalDate> tuples22 = this.selectedDateRange;
            if (tuples22 != null) {
                calendarConstraints.setSelection(new Pair<>(Long.valueOf(LocalDates2.toDatePickerFormat(tuples22.getFirst())), Long.valueOf(LocalDates2.toDatePickerFormat(tuples22.getSecond()))));
            }
            Integer numResolveMaterialCalendarTheme = resolveMaterialCalendarTheme();
            if (numResolveMaterialCalendarTheme != null) {
                calendarConstraints.setTheme(numResolveMaterialCalendarTheme.intValue());
            }
            MaterialDatePicker<Pair<Long, Long>> materialDatePickerBuild = calendarConstraints.build();
            materialDatePickerBuild.addOnPositiveButtonClickListener(new MaterialPickerOnPositiveButtonClickListener() { // from class: com.robinhood.android.cash.disputes.view.DateSelectionView$showDatePicker$2$1
                @Override // com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener
                public final void onPositiveButtonClick(Pair<Long, Long> pair) {
                    Long l = pair.first;
                    Intrinsics.checkNotNull(l);
                    long jLongValue = l.longValue();
                    Long l2 = pair.second;
                    Intrinsics.checkNotNull(l2);
                    long jLongValue2 = l2.longValue();
                    DateSelectionView dateSelectionView = this.this$0;
                    Instant instantOfEpochMilli = Instant.ofEpochMilli(jLongValue);
                    Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli, "ofEpochMilli(...)");
                    ZoneOffset UTC = ZoneOffset.UTC;
                    Intrinsics.checkNotNullExpressionValue(UTC, "UTC");
                    LocalDate localDate = Instants.toLocalDate(instantOfEpochMilli, UTC);
                    Instant instantOfEpochMilli2 = Instant.ofEpochMilli(jLongValue2);
                    Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli2, "ofEpochMilli(...)");
                    Intrinsics.checkNotNullExpressionValue(UTC, "UTC");
                    DateSelectionView.setDateSelection$default(dateSelectionView, localDate, Instants.toLocalDate(instantOfEpochMilli2, UTC), false, 4, null);
                    this.this$0.hasDateBeenManuallyAdjusted = true;
                }
            });
            materialDatePickerBuild.show(Views.baseActivity(this).getSupportFragmentManager(), DATE_PICKER_TAG);
            return;
        }
        LocalDate localDate = this.selectedDate;
        lValueOf = localDate != null ? Long.valueOf(LocalDates2.toDatePickerFormat(localDate)) : null;
        MaterialDatePicker.Builder<Long> calendarConstraints2 = MaterialDatePicker.Builder.datePicker().setCalendarConstraints(createCalendarConstraints(lValueOf));
        if (lValueOf != null) {
            calendarConstraints2.setSelection(Long.valueOf(lValueOf.longValue()));
        }
        Integer numResolveMaterialCalendarTheme2 = resolveMaterialCalendarTheme();
        if (numResolveMaterialCalendarTheme2 != null) {
            calendarConstraints2.setTheme(numResolveMaterialCalendarTheme2.intValue());
        }
        MaterialDatePicker<Long> materialDatePickerBuild2 = calendarConstraints2.build();
        materialDatePickerBuild2.addOnPositiveButtonClickListener(new MaterialPickerOnPositiveButtonClickListener() { // from class: com.robinhood.android.cash.disputes.view.DateSelectionView$showDatePicker$4$1
            @Override // com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener
            public final void onPositiveButtonClick(Long l) {
                Intrinsics.checkNotNull(l);
                Instant instantOfEpochMilli = Instant.ofEpochMilli(l.longValue());
                Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli, "ofEpochMilli(...)");
                ZoneOffset UTC = ZoneOffset.UTC;
                Intrinsics.checkNotNullExpressionValue(UTC, "UTC");
                DateSelectionView.setDateSelection$default(this.this$0, Instants.toLocalDate(instantOfEpochMilli, UTC), null, false, 6, null);
                this.this$0.hasDateBeenManuallyAdjusted = true;
            }
        });
        materialDatePickerBuild2.show(Views.baseActivity(this).getSupportFragmentManager(), DATE_PICKER_TAG);
    }

    private final CalendarConstraints createCalendarConstraints(Long previousSelectionMillis) {
        LocalDate localDateNow = LocalDate.now();
        Intrinsics.checkNotNullExpressionValue(localDateNow, "now(...)");
        long datePickerFormat = LocalDates2.toDatePickerFormat(localDateNow);
        LocalDate localDate = this.earliestAvailableDate;
        Long lValueOf = localDate != null ? Long.valueOf(LocalDates2.toDatePickerFormat(localDate)) : null;
        LocalDate localDateNow2 = LocalDate.now();
        Intrinsics.checkNotNullExpressionValue(localDateNow2, "now(...)");
        CalendarConstraints.Builder validator = new CalendarConstraints.Builder().setOpenAt((previousSelectionMillis != null && (lValueOf == null || lValueOf.longValue() <= previousSelectionMillis.longValue())) ? previousSelectionMillis.longValue() : datePickerFormat).setEnd(datePickerFormat).setValidator(new BeforeDateValidator(localDateNow2));
        if (lValueOf != null) {
            validator.setStart(lValueOf.longValue());
        }
        CalendarConstraints calendarConstraintsBuild = validator.build();
        Intrinsics.checkNotNullExpressionValue(calendarConstraintsBuild, "build(...)");
        return calendarConstraintsBuild;
    }

    private final Integer resolveMaterialCalendarTheme() {
        TypedValue typedValue = new TypedValue();
        if (getContext().getTheme().resolveAttribute(R$attr.materialCalendarTheme, typedValue, true)) {
            return Integer.valueOf(typedValue.data);
        }
        return null;
    }

    /* compiled from: DateSelectionView.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J\u001a\u0010\u001e\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 ¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/view/DateSelectionView$BeforeDateValidator;", "Lcom/google/android/material/datepicker/CalendarConstraints$DateValidator;", "j$/time/LocalDate", "maximum", "<init>", "(Lj$/time/LocalDate;)V", "component1", "()Lj$/time/LocalDate;", "", InquiryField.DateField.TYPE, "", "isValid", "(J)Z", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "copy", "(Lj$/time/LocalDate;)Lcom/robinhood/android/cash/disputes/view/DateSelectionView$BeforeDateValidator;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lj$/time/LocalDate;", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class BeforeDateValidator implements CalendarConstraints.DateValidator {
        public static final int $stable = 8;
        public static final Parcelable.Creator<BeforeDateValidator> CREATOR = new Creator();
        private final LocalDate maximum;

        /* compiled from: DateSelectionView.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<BeforeDateValidator> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BeforeDateValidator createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BeforeDateValidator((LocalDate) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BeforeDateValidator[] newArray(int i) {
                return new BeforeDateValidator[i];
            }
        }

        /* renamed from: component1, reason: from getter */
        private final LocalDate getMaximum() {
            return this.maximum;
        }

        public static /* synthetic */ BeforeDateValidator copy$default(BeforeDateValidator beforeDateValidator, LocalDate localDate, int i, Object obj) {
            if ((i & 1) != 0) {
                localDate = beforeDateValidator.maximum;
            }
            return beforeDateValidator.copy(localDate);
        }

        public final BeforeDateValidator copy(LocalDate maximum) {
            Intrinsics.checkNotNullParameter(maximum, "maximum");
            return new BeforeDateValidator(maximum);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof BeforeDateValidator) && Intrinsics.areEqual(this.maximum, ((BeforeDateValidator) other).maximum);
        }

        public int hashCode() {
            return this.maximum.hashCode();
        }

        public String toString() {
            return "BeforeDateValidator(maximum=" + this.maximum + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.maximum);
        }

        public BeforeDateValidator(LocalDate maximum) {
            Intrinsics.checkNotNullParameter(maximum, "maximum");
            this.maximum = maximum;
        }

        @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
        public boolean isValid(long date) {
            return date < LocalDates2.toDatePickerFormat(this.maximum);
        }
    }
}
