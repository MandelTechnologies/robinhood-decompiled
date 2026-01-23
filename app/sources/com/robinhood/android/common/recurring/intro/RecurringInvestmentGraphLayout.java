package com.robinhood.android.common.recurring.intro;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.recurring.C11595R;
import com.robinhood.android.common.recurring.databinding.MergeRecurringInvestmentGraphLayoutBinding;
import com.robinhood.android.common.recurring.utils.RecurringInvestmentCalculator;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.recurring.models.api.ApiInvestmentSchedule;
import com.robinhood.utils.extensions.Ints2;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: RecurringInvestmentGraphLayout.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\u001a\u001a\u00020\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001dJ\b\u0010\u001e\u001a\u00020\u001bH\u0002J\b\u0010\u001f\u001a\u00020\u001bH\u0002J\b\u0010 \u001a\u00020\u001bH\u0002J\b\u0010!\u001a\u00020\u001bH\u0002R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR$\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u0014@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/intro/RecurringInvestmentGraphLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/robinhood/android/common/recurring/databinding/MergeRecurringInvestmentGraphLayoutBinding;", "getBinding", "()Lcom/robinhood/android/common/recurring/databinding/MergeRecurringInvestmentGraphLayoutBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "value", "", "isCrypto", "()Z", "setCrypto", "(Z)V", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "frequency", "getFrequency", "()Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "setFrequency", "(Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;)V", "setFrequencyButtonOnClick", "", "block", "Lkotlin/Function0;", "setupSeekBar", "setupColumnLabels", "setupColumnHeights", "updateRecurringInvestment", "Companion", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class RecurringInvestmentGraphLayout extends ConstraintLayout {
    private static final float COLUMN_HEIGHT_RATIO_ONE_MONTH = 0.03f;
    private static final float COLUMN_HEIGHT_RATIO_ONE_YEAR = 0.12f;
    private static final float COLUMN_HEIGHT_RATIO_TEN_YEARS = 0.5f;
    private static final float COLUMN_HEIGHT_RATIO_TWENTY_YEARS = 1.0f;
    private static final int MONTHS_ONE = 1;
    private static final int MONTHS_ONE_YEAR = 12;
    private static final int MONTHS_TEN_YEARS = 120;
    private static final int MONTHS_TWENTY_YEARS = 240;
    private static final int SLIDER_PROGRESS_DEFAULT = 5;
    private static final int SLIDER_PROGRESS_INCREMENT = 5;
    private static final int SLIDER_PROGRESS_MAX = 100;
    private static final int SLIDER_PROGRESS_MIN = 1;
    private static final int YEARS_ONE = 1;
    private static final int YEARS_TEN = 10;
    private static final int YEARS_TWENTY = 20;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private ApiInvestmentSchedule.Frequency frequency;
    private boolean isCrypto;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RecurringInvestmentGraphLayout.class, "binding", "getBinding()Lcom/robinhood/android/common/recurring/databinding/MergeRecurringInvestmentGraphLayoutBinding;", 0))};
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecurringInvestmentGraphLayout(Context context, AttributeSet attrs) throws Resources.NotFoundException {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.binding = ViewBinding5.viewBinding(this, RecurringInvestmentGraphLayout2.INSTANCE);
        this.frequency = ApiInvestmentSchedule.Frequency.DAILY;
        ViewGroups.inflate(this, C11595R.layout.merge_recurring_investment_graph_layout, true);
        setupSeekBar();
        setupColumnLabels();
        setupColumnHeights();
        updateRecurringInvestment();
        RhTextView rhTextView = getBinding().frequencyButton;
        ApiInvestmentSchedule.Frequency frequency = this.frequency;
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        rhTextView.setText(InvestmentFrequenciesUtils.toInvestmentDropdownText(frequency, resources));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MergeRecurringInvestmentGraphLayoutBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeRecurringInvestmentGraphLayoutBinding) value;
    }

    /* renamed from: isCrypto, reason: from getter */
    public final boolean getIsCrypto() {
        return this.isCrypto;
    }

    public final void setCrypto(boolean z) {
        this.isCrypto = z;
        updateRecurringInvestment();
    }

    public final ApiInvestmentSchedule.Frequency getFrequency() {
        return this.frequency;
    }

    public final void setFrequency(ApiInvestmentSchedule.Frequency value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.frequency = value;
        RhTextView rhTextView = getBinding().frequencyButton;
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        rhTextView.setText(InvestmentFrequenciesUtils.toInvestmentDropdownText(value, resources));
        updateRecurringInvestment();
    }

    public final void setFrequencyButtonOnClick(Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        RhTextView frequencyButton = getBinding().frequencyButton;
        Intrinsics.checkNotNullExpressionValue(frequencyButton, "frequencyButton");
        OnClickListeners.onClick(frequencyButton, block);
        RhTextView amountText = getBinding().amountText;
        Intrinsics.checkNotNullExpressionValue(amountText, "amountText");
        OnClickListeners.onClick(amountText, block);
    }

    private final void setupSeekBar() {
        final AppCompatSeekBar appCompatSeekBar = getBinding().seekBar;
        appCompatSeekBar.setMax(100);
        appCompatSeekBar.setProgress(5);
        getBinding().amountText.setText(Formats.getWholeNumberAmountFormat().format(5));
        appCompatSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.robinhood.android.common.recurring.intro.RecurringInvestmentGraphLayout$setupSeekBar$1$1
            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(SeekBar seekBar) {
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if (fromUser) {
                    int iRoundToClosestIncrement = Ints2.roundToClosestIncrement(progress, 5, 1);
                    appCompatSeekBar.setProgress(iRoundToClosestIncrement);
                    this.getBinding().amountText.setText(Formats.getWholeNumberAmountFormat().format(Integer.valueOf(iRoundToClosestIncrement)));
                    this.updateRecurringInvestment();
                }
            }
        });
    }

    private final void setupColumnLabels() throws Resources.NotFoundException {
        Resources resources = getContext().getResources();
        MergeRecurringInvestmentGraphLayoutBinding binding = getBinding();
        RecurringInvestmentGraphColumnView recurringInvestmentGraphColumnView = binding.columnOneMonth;
        String quantityString = resources.getQuantityString(C11595R.plurals.recurring_investment_graph_column_label_month, 1, 1);
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        recurringInvestmentGraphColumnView.setColumnLabel(quantityString);
        RecurringInvestmentGraphColumnView recurringInvestmentGraphColumnView2 = binding.columnOneYear;
        String quantityString2 = resources.getQuantityString(C11595R.plurals.recurring_investment_graph_column_label_year, 1, 1);
        Intrinsics.checkNotNullExpressionValue(quantityString2, "getQuantityString(...)");
        recurringInvestmentGraphColumnView2.setColumnLabel(quantityString2);
        RecurringInvestmentGraphColumnView recurringInvestmentGraphColumnView3 = binding.columnTenYears;
        String quantityString3 = resources.getQuantityString(C11595R.plurals.recurring_investment_graph_column_label_year, 10, 10);
        Intrinsics.checkNotNullExpressionValue(quantityString3, "getQuantityString(...)");
        recurringInvestmentGraphColumnView3.setColumnLabel(quantityString3);
        RecurringInvestmentGraphColumnView recurringInvestmentGraphColumnView4 = binding.columnTwentyYears;
        String quantityString4 = resources.getQuantityString(C11595R.plurals.recurring_investment_graph_column_label_year, 20, 20);
        Intrinsics.checkNotNullExpressionValue(quantityString4, "getQuantityString(...)");
        recurringInvestmentGraphColumnView4.setColumnLabel(quantityString4);
    }

    private final void setupColumnHeights() {
        MergeRecurringInvestmentGraphLayoutBinding binding = getBinding();
        binding.columnOneMonth.setColumnBarHeightRatio(COLUMN_HEIGHT_RATIO_ONE_MONTH);
        binding.columnOneYear.setColumnBarHeightRatio(0.12f);
        binding.columnTenYears.setColumnBarHeightRatio(0.5f);
        binding.columnTwentyYears.setColumnBarHeightRatio(1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateRecurringInvestment() {
        int progress = getBinding().seekBar.getProgress();
        MergeRecurringInvestmentGraphLayoutBinding binding = getBinding();
        RecurringInvestmentGraphColumnView recurringInvestmentGraphColumnView = binding.columnOneMonth;
        RecurringInvestmentCalculator recurringInvestmentCalculator = RecurringInvestmentCalculator.INSTANCE;
        recurringInvestmentGraphColumnView.setInvestedAmount(recurringInvestmentCalculator.computeTotalInvested(progress, 1, this.frequency, this.isCrypto));
        binding.columnOneYear.setInvestedAmount(recurringInvestmentCalculator.computeTotalInvested(progress, 12, this.frequency, this.isCrypto));
        binding.columnTenYears.setInvestedAmount(recurringInvestmentCalculator.computeTotalInvested(progress, 120, this.frequency, this.isCrypto));
        binding.columnTwentyYears.setInvestedAmount(recurringInvestmentCalculator.computeTotalInvested(progress, 240, this.frequency, this.isCrypto));
    }
}
