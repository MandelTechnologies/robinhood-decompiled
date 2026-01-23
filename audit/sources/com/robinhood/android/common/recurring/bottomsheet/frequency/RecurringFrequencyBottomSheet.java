package com.robinhood.android.common.recurring.bottomsheet.frequency;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.recurring.C11595R;
import com.robinhood.android.common.recurring.databinding.FragmentRecurringFrequencyBottomSheetBinding;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.NumberUtils;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.recurring.models.api.ApiInvestmentSchedule;
import com.robinhood.rosetta.eventlogging.RecurringContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.datetime.format.LocalDateFormatter;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import p479j$.time.LocalDate;

/* compiled from: RecurringFrequencyBottomSheet.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 *2\u00020\u0001:\u0003()*B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u001a\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020!2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u0010\u0010\"\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020$H\u0002J\u0010\u0010%\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020'H\u0002R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/bottomsheet/frequency/RecurringFrequencyBottomSheet;", "Lcom/robinhood/android/common/ui/BaseBottomSheetDialogFragment;", "<init>", "()V", "screenName", "", "getScreenName", "()Ljava/lang/String;", "callbacks", "Lcom/robinhood/android/common/recurring/bottomsheet/frequency/RecurringFrequencyBottomSheet$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/common/recurring/bottomsheet/frequency/RecurringFrequencyBottomSheet$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "binding", "Lcom/robinhood/android/common/recurring/databinding/FragmentRecurringFrequencyBottomSheetBinding;", "getBinding", "()Lcom/robinhood/android/common/recurring/databinding/FragmentRecurringFrequencyBottomSheetBinding;", "binding$delegate", "duxo", "Lcom/robinhood/android/common/recurring/bottomsheet/frequency/RecurringFrequencyDuxo;", "getDuxo", "()Lcom/robinhood/android/common/recurring/bottomsheet/frequency/RecurringFrequencyDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "adapter", "Lcom/robinhood/android/common/recurring/bottomsheet/frequency/RecurringFrequencyAdapter;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "onRowClicked", "row", "Lcom/robinhood/android/common/recurring/bottomsheet/frequency/RecurringFrequencyBottomSheet$Row;", "setViewState", "state", "Lcom/robinhood/android/common/recurring/bottomsheet/frequency/RecurringFrequencyViewState;", "Callbacks", "Row", "Companion", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class RecurringFrequencyBottomSheet extends BaseBottomSheetDialogFragment {
    public static final String ARG_FREQUENCY = "frequency";
    public static final String ARG_INSTRUMENT_ID = "instrumentId";
    public static final String ARG_IS_CRYPTO = "isCrypto";
    public static final String ARG_LOGGING_CONTEXT = "loggingContext";
    public static final String ARG_USER_SELECTED_NEXT_DATE = "nextDate";
    private final RecurringFrequencyAdapter adapter;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RecurringFrequencyBottomSheet.class, "callbacks", "getCallbacks()Lcom/robinhood/android/common/recurring/bottomsheet/frequency/RecurringFrequencyBottomSheet$Callbacks;", 0)), Reflection.property1(new PropertyReference1Impl(RecurringFrequencyBottomSheet.class, "binding", "getBinding()Lcom/robinhood/android/common/recurring/databinding/FragmentRecurringFrequencyBottomSheetBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: RecurringFrequencyBottomSheet.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/bottomsheet/frequency/RecurringFrequencyBottomSheet$Callbacks;", "", "onFrequencySelected", "", "frequency", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onFrequencySelected(ApiInvestmentSchedule.Frequency frequency);
    }

    public RecurringFrequencyBottomSheet() {
        super(C11595R.layout.fragment_recurring_frequency_bottom_sheet);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
        this.binding = ViewBinding5.viewBinding(this, RecurringFrequencyBottomSheet3.INSTANCE);
        this.duxo = OldDuxos.oldDuxo(this, RecurringFrequencyDuxo.class);
        this.adapter = new RecurringFrequencyAdapter(new RecurringFrequencyBottomSheet2(this));
    }

    @Override // com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenName() {
        return Screen.Name.RECURRING_FREQUENCY.toString();
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final FragmentRecurringFrequencyBottomSheetBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[1]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentRecurringFrequencyBottomSheetBinding) value;
    }

    private final RecurringFrequencyDuxo getDuxo() {
        return (RecurringFrequencyDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C116841(this));
    }

    /* compiled from: RecurringFrequencyBottomSheet.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet$onCreate$1 */
    /* synthetic */ class C116841 extends FunctionReferenceImpl implements Function1<RecurringFrequencyViewState, Unit> {
        C116841(Object obj) {
            super(1, obj, RecurringFrequencyBottomSheet.class, "setViewState", "setViewState(Lcom/robinhood/android/common/recurring/bottomsheet/frequency/RecurringFrequencyViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RecurringFrequencyViewState recurringFrequencyViewState) {
            invoke2(recurringFrequencyViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(RecurringFrequencyViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((RecurringFrequencyBottomSheet) this.receiver).setViewState(p0);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) throws Resources.NotFoundException {
        String string2;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        FragmentRecurringFrequencyBottomSheetBinding binding = getBinding();
        RhTextView frequencyBottomSheetDisclaimer = binding.frequencyBottomSheetDisclaimer;
        Intrinsics.checkNotNullExpressionValue(frequencyBottomSheetDisclaimer, "frequencyBottomSheetDisclaimer");
        Bundle arguments = getArguments();
        if (arguments != null && arguments.getBoolean("isCrypto")) {
            string2 = getResources().getString(C11595R.string.recurring_unified_creation_flow_frequency_disclaimer_crypto);
        } else {
            string2 = getResources().getString(C11595R.string.recurring_unified_creation_flow_frequency_disclaimer);
        }
        TextViewsKt.setVisibilityText(frequencyBottomSheetDisclaimer, string2);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        binding.recyclerView.setAdapter(this.adapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onRowClicked(Row row) {
        getDuxo().onRowClicked(row);
        getCallbacks().onFrequencySelected(row.getFrequency());
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setViewState(RecurringFrequencyViewState state) {
        this.adapter.setState(state);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RecurringFrequencyBottomSheet.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0014\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001BC\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\u001f\u0010\u001ej\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/bottomsheet/frequency/RecurringFrequencyBottomSheet$Row;", "", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "frequency", "", "title", "titleLowercase", "description", "", "showForCrypto", "showForEquity", "<init>", "(Ljava/lang/String;ILcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;IIIZZ)V", "Landroid/content/res/Resources;", "resources", "j$/time/LocalDate", "nextInvestmentDate", "", "getFormattedDescription", "(Landroid/content/res/Resources;Lj$/time/LocalDate;)Ljava/lang/CharSequence;", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "getFrequency", "()Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "I", "getTitle", "()I", "getTitleLowercase", "getDescription", "Z", "getShowForCrypto", "()Z", "getShowForEquity", "EVERY_MARKET_DAY", "DAILY", "WEEKLY", "BIWEEKLY", "MONTHLY", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Row {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Row[] $VALUES;
        public static final Row BIWEEKLY;
        public static final Row DAILY;
        public static final Row EVERY_MARKET_DAY;
        public static final Row MONTHLY;
        public static final Row WEEKLY;
        private final int description;
        private final ApiInvestmentSchedule.Frequency frequency;
        private final boolean showForCrypto;
        private final boolean showForEquity;
        private final int title;
        private final int titleLowercase;

        /* compiled from: RecurringFrequencyBottomSheet.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Row.values().length];
                try {
                    iArr[Row.EVERY_MARKET_DAY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Row.DAILY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Row.WEEKLY.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Row.BIWEEKLY.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[Row.MONTHLY.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private static final /* synthetic */ Row[] $values() {
            return new Row[]{EVERY_MARKET_DAY, DAILY, WEEKLY, BIWEEKLY, MONTHLY};
        }

        public static EnumEntries<Row> getEntries() {
            return $ENTRIES;
        }

        private Row(String str, int i, ApiInvestmentSchedule.Frequency frequency, int i2, int i3, int i4, boolean z, boolean z2) {
            this.frequency = frequency;
            this.title = i2;
            this.titleLowercase = i3;
            this.description = i4;
            this.showForCrypto = z;
            this.showForEquity = z2;
        }

        /* synthetic */ Row(String str, int i, ApiInvestmentSchedule.Frequency frequency, int i2, int i3, int i4, boolean z, boolean z2, int i5, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, frequency, i2, i3, i4, (i5 & 16) != 0 ? false : z, (i5 & 32) != 0 ? false : z2);
        }

        public final ApiInvestmentSchedule.Frequency getFrequency() {
            return this.frequency;
        }

        public final int getTitle() {
            return this.title;
        }

        public final int getTitleLowercase() {
            return this.titleLowercase;
        }

        public final int getDescription() {
            return this.description;
        }

        public final boolean getShowForCrypto() {
            return this.showForCrypto;
        }

        public final boolean getShowForEquity() {
            return this.showForEquity;
        }

        static {
            ApiInvestmentSchedule.Frequency frequency = ApiInvestmentSchedule.Frequency.DAILY;
            EVERY_MARKET_DAY = new Row("EVERY_MARKET_DAY", 0, frequency, C11595R.string.investment_schedule_frequency_daily, C11595R.string.investment_schedule_frequency_every_market_day_lowercase, C11595R.string.equity_recurring_schedule_daily_subtitle, false, true);
            DAILY = new Row("DAILY", 1, frequency, C11595R.string.investment_schedule_frequency_daily_crypto, C11595R.string.investment_schedule_frequency_daily_lowercase, C11595R.string.equity_recurring_schedule_daily_crypto_subtitle, true, false);
            WEEKLY = new Row("WEEKLY", 2, ApiInvestmentSchedule.Frequency.WEEKLY, C11595R.string.investment_schedule_frequency_weekly, C11595R.string.investment_schedule_frequency_weekly_lowercase, C11595R.string.equity_recurring_schedule_weekly_subtitle, true, true);
            BIWEEKLY = new Row("BIWEEKLY", 3, ApiInvestmentSchedule.Frequency.BIWEEKLY, C11595R.string.investment_schedule_frequency_biweekly, C11595R.string.investment_schedule_frequency_biweekly_lowercase, C11595R.string.equity_recurring_schedule_biweekly_subtitle, true, true);
            MONTHLY = new Row("MONTHLY", 4, ApiInvestmentSchedule.Frequency.MONTHLY, C11595R.string.investment_schedule_frequency_monthly, C11595R.string.investment_schedule_frequency_monthly_lowercase, C11595R.string.equity_recurring_schedule_monthly_subtitle, true, true);
            Row[] rowArr$values = $values();
            $VALUES = rowArr$values;
            $ENTRIES = EnumEntries2.enumEntries(rowArr$values);
        }

        public final CharSequence getFormattedDescription(Resources resources, LocalDate nextInvestmentDate) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(resources, "resources");
            Intrinsics.checkNotNullParameter(nextInvestmentDate, "nextInvestmentDate");
            int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
            if (i == 1 || i == 2) {
                String string2 = resources.getString(this.description);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return string2;
            }
            if (i == 3 || i == 4) {
                String string3 = resources.getString(this.description, LocalDateFormatter.WEEKDAY_ONLY.format(nextInvestmentDate));
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                return string3;
            }
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            String string4 = resources.getString(this.description, NumberUtils.getDayOfMonthOrdinalString(nextInvestmentDate));
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            return string4;
        }

        public static Row valueOf(String str) {
            return (Row) Enum.valueOf(Row.class, str);
        }

        public static Row[] values() {
            return (Row[]) $VALUES.clone();
        }
    }

    /* compiled from: RecurringFrequencyBottomSheet.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/bottomsheet/frequency/RecurringFrequencyBottomSheet$Companion;", "", "<init>", "()V", "Ljava/util/UUID;", "instrumentId", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "frequency", "", "isCrypto", "j$/time/LocalDate", RecurringFrequencyBottomSheet.ARG_USER_SELECTED_NEXT_DATE, "Lcom/robinhood/rosetta/eventlogging/RecurringContext;", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/android/common/recurring/bottomsheet/frequency/RecurringFrequencyBottomSheet;", "newInstance", "(Ljava/util/UUID;Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;ZLj$/time/LocalDate;Lcom/robinhood/rosetta/eventlogging/RecurringContext;)Lcom/robinhood/android/common/recurring/bottomsheet/frequency/RecurringFrequencyBottomSheet;", "", "ARG_INSTRUMENT_ID", "Ljava/lang/String;", "ARG_FREQUENCY", "ARG_IS_CRYPTO", "ARG_USER_SELECTED_NEXT_DATE", "ARG_LOGGING_CONTEXT", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final RecurringFrequencyBottomSheet newInstance(UUID instrumentId, ApiInvestmentSchedule.Frequency frequency, boolean isCrypto, LocalDate nextDate, RecurringContext loggingContext) {
            RecurringFrequencyBottomSheet recurringFrequencyBottomSheet = new RecurringFrequencyBottomSheet();
            Bundle bundle = new Bundle();
            bundle.putSerializable("instrumentId", instrumentId);
            bundle.putSerializable("frequency", frequency);
            bundle.putSerializable(RecurringFrequencyBottomSheet.ARG_USER_SELECTED_NEXT_DATE, nextDate);
            bundle.putBoolean("isCrypto", isCrypto);
            bundle.putSerializable(RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, loggingContext);
            recurringFrequencyBottomSheet.setArguments(bundle);
            return recurringFrequencyBottomSheet;
        }
    }
}
