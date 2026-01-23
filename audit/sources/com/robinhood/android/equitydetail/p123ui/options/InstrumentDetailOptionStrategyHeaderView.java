package com.robinhood.android.equitydetail.p123ui.options;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.TextView;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.util.UiCallbacks;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.android.equitydetail.databinding.MergeInstrumentStrategiesViewBinding;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.options.optionsstring.common.UiOptionEvents;
import com.robinhood.android.portfolio.pnl.UnrealizedProfitAndLoss;
import com.robinhood.android.portfolio.pnl.UnrealizedProfitAndLoss2;
import com.robinhood.common.strings.OptionChainCollaterals;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.AggregateOptionQuote;
import com.robinhood.models.p320db.OptionChainCollateral;
import com.robinhood.models.p320db.OptionCollateral;
import com.robinhood.models.p320db.OptionCollateralCash;
import com.robinhood.models.p355ui.UiAggregateOptionPosition;
import com.robinhood.models.p355ui.UiOptionEvent;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.p409ui.view.Inflater;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;

/* compiled from: InstrumentDetailOptionStrategyHeaderView.kt */
@Metadata(m3635d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 22\u00020\u00012\u00020\u0002:\u00012B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ`\u0010'\u001a\u00020(2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00152\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00122\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020 J\b\u0010)\u001a\u00020(H\u0016J\b\u0010*\u001a\u00020(H\u0002J*\u0010+\u001a\u00020(2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020-2\b\u0010/\u001a\u0004\u0018\u0001002\u0006\u00101\u001a\u00020 H\u0002R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u001a\u001a\n \u001c*\u0004\u0018\u00010\u001b0\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010!\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b#\u0010$¨\u00063"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/options/InstrumentDetailOptionStrategyHeaderView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/robinhood/android/common/util/UiCallbacks$Clearable;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "getNavigator", "()Lcom/robinhood/android/navigation/Navigator;", "setNavigator", "(Lcom/robinhood/android/navigation/Navigator;)V", "optionChainCollateral", "Lcom/robinhood/models/db/OptionChainCollateral;", "aggregateOptionPositions", "", "Lcom/robinhood/models/ui/UiAggregateOptionPosition;", "aggregateOptionQuotes", "", "Ljava/util/UUID;", "Lcom/robinhood/models/db/AggregateOptionQuote;", "optionEventsHeldForExercise", "Lcom/robinhood/models/ui/UiOptionEvent;", "totalContracts", "Ljava/math/BigDecimal;", "kotlin.jvm.PlatformType", "accountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "inProfitAndLossAverageCostRetirement", "", "binding", "Lcom/robinhood/android/equitydetail/databinding/MergeInstrumentStrategiesViewBinding;", "getBinding", "()Lcom/robinhood/android/equitydetail/databinding/MergeInstrumentStrategiesViewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "bind", "", "clear", "refreshUi", "setVisibilityText", "labelTextView", "Landroid/widget/TextView;", "mainTextView", "text", "", "shouldShow", "Companion", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class InstrumentDetailOptionStrategyHeaderView extends Hammer_InstrumentDetailOptionStrategyHeaderView implements UiCallbacks.Clearable {
    private BrokerageAccountType accountType;
    private List<? extends UiAggregateOptionPosition> aggregateOptionPositions;
    private Map<UUID, ? extends AggregateOptionQuote> aggregateOptionQuotes;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private boolean inProfitAndLossAverageCostRetirement;
    public Navigator navigator;
    private OptionChainCollateral optionChainCollateral;
    private List<UiOptionEvent> optionEventsHeldForExercise;
    private BigDecimal totalContracts;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(InstrumentDetailOptionStrategyHeaderView.class, "binding", "getBinding()Lcom/robinhood/android/equitydetail/databinding/MergeInstrumentStrategiesViewBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstrumentDetailOptionStrategyHeaderView(Context context, AttributeSet attrs) {
        super(context, attrs, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.aggregateOptionPositions = CollectionsKt.emptyList();
        this.aggregateOptionQuotes = MapsKt.emptyMap();
        this.optionEventsHeldForExercise = CollectionsKt.emptyList();
        this.totalContracts = BigDecimal.ZERO;
        ViewGroups.inflate(this, C15314R.layout.merge_instrument_strategies_view, true);
        this.binding = ViewBinding5.viewBinding(this, InstrumentDetailOptionStrategyHeaderView2.INSTANCE);
    }

    public final Navigator getNavigator() {
        Navigator navigator = this.navigator;
        if (navigator != null) {
            return navigator;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
    }

    public final void setNavigator(Navigator navigator) {
        Intrinsics.checkNotNullParameter(navigator, "<set-?>");
        this.navigator = navigator;
    }

    private final MergeInstrumentStrategiesViewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeInstrumentStrategiesViewBinding) value;
    }

    public final void bind(OptionChainCollateral optionChainCollateral, List<? extends UiAggregateOptionPosition> aggregateOptionPositions, Map<UUID, ? extends AggregateOptionQuote> aggregateOptionQuotes, List<UiOptionEvent> optionEventsHeldForExercise, BigDecimal totalContracts, BrokerageAccountType accountType, boolean inProfitAndLossAverageCostRetirement) {
        Intrinsics.checkNotNullParameter(totalContracts, "totalContracts");
        this.optionChainCollateral = optionChainCollateral;
        if (aggregateOptionPositions == null) {
            aggregateOptionPositions = CollectionsKt.emptyList();
        }
        this.aggregateOptionPositions = aggregateOptionPositions;
        if (aggregateOptionQuotes == null) {
            aggregateOptionQuotes = MapsKt.emptyMap();
        }
        this.aggregateOptionQuotes = aggregateOptionQuotes;
        if (optionEventsHeldForExercise == null) {
            optionEventsHeldForExercise = CollectionsKt.emptyList();
        }
        this.optionEventsHeldForExercise = optionEventsHeldForExercise;
        this.totalContracts = totalContracts;
        this.accountType = accountType;
        this.inProfitAndLossAverageCostRetirement = inProfitAndLossAverageCostRetirement;
        refreshUi();
    }

    @Override // com.robinhood.android.common.util.UiCallbacks.Clearable
    public void clear() {
        this.aggregateOptionPositions = CollectionsKt.emptyList();
        refreshUi();
    }

    private final void refreshUi() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        OptionCollateral collateral;
        OptionCollateralCash cash;
        MergeInstrumentStrategiesViewBinding binding = getBinding();
        UnrealizedProfitAndLoss optionsUnrealizedProfitAndLoss = UnrealizedProfitAndLoss2.getOptionsUnrealizedProfitAndLoss(this.aggregateOptionPositions, this.aggregateOptionQuotes, this.accountType, this.inProfitAndLossAverageCostRetirement);
        binding.optionsTotalContractsLabel.setText(getResources().getString(C15314R.string.option_position_total_strategies_label));
        RhTextView rhTextView = binding.optionsTotalContractsTxt;
        NumberFormatter integerFormat = Formats.getIntegerFormat();
        BigDecimal totalContracts = this.totalContracts;
        Intrinsics.checkNotNullExpressionValue(totalContracts, "totalContracts");
        rhTextView.setText(integerFormat.format(totalContracts));
        RhTextView rhTextView2 = binding.optionsEquityValueTxt;
        String str6 = "-";
        if (optionsUnrealizedProfitAndLoss == null || (str = Formats.getCurrencyFormat().format(optionsUnrealizedProfitAndLoss.getMarketValue())) == null) {
            str = "-";
        }
        rhTextView2.setText(str);
        OptionChainCollateral optionChainCollateral = this.optionChainCollateral;
        String equityDisplayString = null;
        boolean zIsPositive = BigDecimals7.isPositive((optionChainCollateral == null || (collateral = optionChainCollateral.getCollateral()) == null || (cash = collateral.getCash()) == null) ? null : cash.getAmount());
        OptionChainCollateral optionChainCollateral2 = this.optionChainCollateral;
        String cashDisplayString = optionChainCollateral2 != null ? OptionChainCollaterals.getCashDisplayString(optionChainCollateral2) : null;
        RhTextView optionsCashCollateralLabel = binding.optionsCashCollateralLabel;
        Intrinsics.checkNotNullExpressionValue(optionsCashCollateralLabel, "optionsCashCollateralLabel");
        RhTextView optionsCashCollateralTxt = binding.optionsCashCollateralTxt;
        Intrinsics.checkNotNullExpressionValue(optionsCashCollateralTxt, "optionsCashCollateralTxt");
        setVisibilityText(optionsCashCollateralLabel, optionsCashCollateralTxt, cashDisplayString, zIsPositive && cashDisplayString != null);
        OptionChainCollateral optionChainCollateral3 = this.optionChainCollateral;
        if (optionChainCollateral3 != null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            equityDisplayString = OptionChainCollaterals.getEquityDisplayString(optionChainCollateral3, context);
        }
        RhTextView optionsStockCollateralLabel = binding.optionsStockCollateralLabel;
        Intrinsics.checkNotNullExpressionValue(optionsStockCollateralLabel, "optionsStockCollateralLabel");
        RhTextView optionsStockCollateralTxt = binding.optionsStockCollateralTxt;
        Intrinsics.checkNotNullExpressionValue(optionsStockCollateralTxt, "optionsStockCollateralTxt");
        setVisibilityText(optionsStockCollateralLabel, optionsStockCollateralTxt, equityDisplayString, !(equityDisplayString == null || StringsKt.isBlank(equityDisplayString)));
        BigDecimal bigDecimalComputeCashHeldForExercises = UiOptionEvent.INSTANCE.computeCashHeldForExercises(this.optionEventsHeldForExercise);
        RhTextView optionsCashHeldForExercisesLabel = binding.optionsCashHeldForExercisesLabel;
        Intrinsics.checkNotNullExpressionValue(optionsCashHeldForExercisesLabel, "optionsCashHeldForExercisesLabel");
        RhTextView optionsCashHeldForExercisesTxt = binding.optionsCashHeldForExercisesTxt;
        Intrinsics.checkNotNullExpressionValue(optionsCashHeldForExercisesTxt, "optionsCashHeldForExercisesTxt");
        setVisibilityText(optionsCashHeldForExercisesLabel, optionsCashHeldForExercisesTxt, Formats.getPriceFormat().format(bigDecimalComputeCashHeldForExercises), BigDecimals7.isPositive(bigDecimalComputeCashHeldForExercises));
        List<UiOptionEvent> list = this.optionEventsHeldForExercise;
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        String strComputeSharesHeldForExercisesString = UiOptionEvents.computeSharesHeldForExercisesString(list, resources);
        RhTextView optionsSharesHeldForExercisesLabel = binding.optionsSharesHeldForExercisesLabel;
        Intrinsics.checkNotNullExpressionValue(optionsSharesHeldForExercisesLabel, "optionsSharesHeldForExercisesLabel");
        RhTextView optionsSharesHeldForExercisesTxt = binding.optionsSharesHeldForExercisesTxt;
        Intrinsics.checkNotNullExpressionValue(optionsSharesHeldForExercisesTxt, "optionsSharesHeldForExercisesTxt");
        setVisibilityText(optionsSharesHeldForExercisesLabel, optionsSharesHeldForExercisesTxt, strComputeSharesHeldForExercisesString, strComputeSharesHeldForExercisesString.length() > 0);
        RhTextView rhTextView3 = binding.optionsTodaysReturnTxt;
        Context context2 = getContext();
        int i = C11048R.string.general_number_and_percent_change_format;
        if (optionsUnrealizedProfitAndLoss == null || (str2 = Formats.getCurrencyDeltaFormat().format(optionsUnrealizedProfitAndLoss.getTodaysReturn())) == null) {
            str2 = "-";
        }
        if (optionsUnrealizedProfitAndLoss == null || (str3 = Formats.getPercentDeltaFormat().format(BigDecimals7.safeDivide(optionsUnrealizedProfitAndLoss.getTodaysReturn(), optionsUnrealizedProfitAndLoss.getCostForTodaysReturn().abs()))) == null) {
            str3 = "-";
        }
        rhTextView3.setText(context2.getString(i, str2, str3));
        RhTextView rhTextView4 = binding.optionsTotalReturnTxt;
        Context context3 = getContext();
        int i2 = C11048R.string.general_number_and_percent_change_format;
        if (optionsUnrealizedProfitAndLoss == null || (str4 = Formats.getCurrencyDeltaFormat().format(optionsUnrealizedProfitAndLoss.getTotalReturn())) == null) {
            str4 = "-";
        }
        if (optionsUnrealizedProfitAndLoss != null && (str5 = Formats.getPercentDeltaFormat().format(BigDecimals7.safeDivide(optionsUnrealizedProfitAndLoss.getTotalReturn(), optionsUnrealizedProfitAndLoss.getCostForTotalReturn().abs()))) != null) {
            str6 = str5;
        }
        rhTextView4.setText(context3.getString(i2, str4, str6));
    }

    /* compiled from: InstrumentDetailOptionStrategyHeaderView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/options/InstrumentDetailOptionStrategyHeaderView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/equitydetail/ui/options/InstrumentDetailOptionStrategyHeaderView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<InstrumentDetailOptionStrategyHeaderView> {
        private final /* synthetic */ Inflater<InstrumentDetailOptionStrategyHeaderView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public InstrumentDetailOptionStrategyHeaderView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (InstrumentDetailOptionStrategyHeaderView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C15314R.layout.include_instrument_option_strategies_view);
        }
    }

    private final void setVisibilityText(TextView labelTextView, TextView mainTextView, String text, boolean shouldShow) {
        labelTextView.setVisibility(shouldShow ? 0 : 8);
        mainTextView.setVisibility(shouldShow ? 0 : 8);
        if (shouldShow) {
            mainTextView.setText(text);
        }
    }
}
