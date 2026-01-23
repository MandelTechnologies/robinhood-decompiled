package com.robinhood.android.optionsstrategybuilder.rows;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.view.AnimatedRhTextView;
import com.robinhood.android.designsystem.style.DirectionOverlay;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.educationtour.EducationTourElementIds;
import com.robinhood.android.educationtour.extensions.ViewsKt;
import com.robinhood.android.optionchain.BaseOptionRowView;
import com.robinhood.android.optionchain.C22987R;
import com.robinhood.android.optionchain.chainsettings.OptionChainFallbackMetrics;
import com.robinhood.android.optionchain.chainsettings.OptionChainMetricValueConverter;
import com.robinhood.android.optionsstrategybuilder.C24876R;
import com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderViewState;
import com.robinhood.android.optionsstrategybuilder.databinding.IncludeStrategyContractRowBinding;
import com.robinhood.android.util.style.ThemeAttributes;
import com.robinhood.models.p320db.OptionChainAvailableMetrics;
import com.robinhood.models.p320db.OptionQuote;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import com.robinhood.utils.Either;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: OptionStrategyRowView.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 )2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002()B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0003H\u0016J\f\u0010 \u001a\u00020\u001e*\u00020\u0003H\u0002J\u0014\u0010!\u001a\u00020\"*\u00020\u00032\u0006\u0010#\u001a\u00020$H\u0002J\u0018\u0010%\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u0002H\u0016J\u0010\u0010'\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0003H\u0016R\u001e\u0010\n\u001a\u00020\u000b8\u0016@\u0016X\u0097.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00178V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/optionsstrategybuilder/rows/OptionStrategyRowView;", "Lcom/robinhood/android/optionchain/BaseOptionRowView;", "Lcom/robinhood/android/optionsstrategybuilder/rows/OptionStrategyRowView$Callbacks;", "Lcom/robinhood/android/optionsstrategybuilder/rows/OptionStrategyRowModel;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "binding", "Lcom/robinhood/android/optionsstrategybuilder/databinding/IncludeStrategyContractRowBinding;", "getBinding", "()Lcom/robinhood/android/optionsstrategybuilder/databinding/IncludeStrategyContractRowBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "value", "", "bottomDividerVisible", "getBottomDividerVisible", "()Z", "setBottomDividerVisible", "(Z)V", "bindToViews", "", "model", "bindCustomizedMetrics", "getStrategyBuilderMetricValue", "", "metric", "Lcom/robinhood/models/db/OptionChainAvailableMetrics$Metric;", "setOnClickListeners", "callbacks", "setViewColorAttributes", "Callbacks", "Companion", "feature-options-strategy-builder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionStrategyRowView extends BaseOptionRowView<Callbacks, OptionStrategyRowModel> {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    public EventLogger eventLogger;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(OptionStrategyRowView.class, "binding", "getBinding()Lcom/robinhood/android/optionsstrategybuilder/databinding/IncludeStrategyContractRowBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: OptionStrategyRowView.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/optionsstrategybuilder/rows/OptionStrategyRowView$Callbacks;", "Lcom/robinhood/android/optionchain/BaseOptionRowView$Callbacks;", "Lcom/robinhood/android/optionsstrategybuilder/rows/OptionStrategyRowModel;", "onPriceClicked", "", "strategy", "Lcom/robinhood/android/optionsstrategybuilder/OptionStrategyBuilderViewState$Strategy;", "feature-options-strategy-builder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks extends BaseOptionRowView.Callbacks<OptionStrategyRowModel> {
        void onPriceClicked(OptionStrategyBuilderViewState.Strategy strategy);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionStrategyRowView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.binding = ViewBinding5.viewBinding(this, OptionStrategyRowView2.INSTANCE);
    }

    @Override // com.robinhood.android.optionchain.BaseOptionRowView
    public EventLogger getEventLogger() {
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            return eventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    @Override // com.robinhood.android.optionchain.BaseOptionRowView
    public void setEventLogger(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "<set-?>");
        this.eventLogger = eventLogger;
    }

    private final IncludeStrategyContractRowBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (IncludeStrategyContractRowBinding) value;
    }

    @Override // com.robinhood.android.optionchain.BaseOptionRowView
    public boolean getBottomDividerVisible() {
        View optionContractBottomDivider = getBinding().optionContractBottomDivider;
        Intrinsics.checkNotNullExpressionValue(optionContractBottomDivider, "optionContractBottomDivider");
        return optionContractBottomDivider.getVisibility() == 0;
    }

    @Override // com.robinhood.android.optionchain.BaseOptionRowView
    public void setBottomDividerVisible(boolean z) {
        View optionContractBottomDivider = getBinding().optionContractBottomDivider;
        Intrinsics.checkNotNullExpressionValue(optionContractBottomDivider, "optionContractBottomDivider");
        optionContractBottomDivider.setVisibility(z ? 0 : 8);
    }

    @Override // com.robinhood.android.optionchain.BaseOptionRowView
    public void bindToViews(OptionStrategyRowModel model) {
        BigDecimal todaysPercentChange;
        Intrinsics.checkNotNullParameter(model, "model");
        setLastBoundIdentifier(model.getIdentifier());
        getBinding().optionContractStrikePriceTxt.setText(model.getStrikePriceString());
        RhTextView optionContractStrikePriceTxt = getBinding().optionContractStrikePriceTxt;
        Intrinsics.checkNotNullExpressionValue(optionContractStrikePriceTxt, "optionContractStrikePriceTxt");
        ViewsKt.setEducationTourId(optionContractStrikePriceTxt, EducationTourElementIds.STRATEGY_STRIKE);
        RhTextView optionStrategyPositionIndicator = getBinding().optionStrategyPositionIndicator;
        Intrinsics.checkNotNullExpressionValue(optionStrategyPositionIndicator, "optionStrategyPositionIndicator");
        TextViewsKt.setVisibilityText(optionStrategyPositionIndicator, model.getPositionQuantityString());
        String contractPriceDisplayString = model.getContractPriceDisplayString();
        if (contractPriceDisplayString == null) {
            contractPriceDisplayString = "    -    ";
        }
        CharSequence text = getBinding().optionContractPriceDeltaTxt.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        text.length();
        getBinding().optionContractPriceTxt.setVisibilityText(contractPriceDisplayString, false);
        Boolean boolIsStale = model.isStale();
        if (boolIsStale != null) {
            getBinding().optionContractPriceTxt.setStale(boolIsStale.booleanValue());
        }
        RhTextView rhTextView = getBinding().optionContractPriceDeltaTxt;
        String contractPriceDeltaPercentageString = model.getContractPriceDeltaPercentageString();
        rhTextView.setText(contractPriceDeltaPercentageString != null ? com.robinhood.utils.extensions.ViewsKt.getString(this, C22987R.string.option_order_contract_quote_delta_txt, contractPriceDeltaPercentageString) : null);
        Boolean boolIsStale2 = model.isStale();
        if (boolIsStale2 != null) {
            getBinding().optionContractPriceDeltaTxt.setStale(boolIsStale2.booleanValue());
        }
        bindCustomizedMetrics(model);
        OptionQuote optionQuote = model.getOptionQuote();
        DirectionOverlay directionOverlay = (optionQuote == null || (todaysPercentChange = optionQuote.getTodaysPercentChange()) == null || !BigDecimals7.isNegative(todaysPercentChange)) ? model.getOptionQuote() != null ? DirectionOverlay.POSITIVE : null : DirectionOverlay.NEGATIVE;
        if (directionOverlay != null) {
            ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(this), directionOverlay, null, 2, null);
        }
        getBinding().optionContractPriceTxt.setSelected(model.getContractSelected());
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        CharSequence errorMessageTxt = model.getErrorMessageTxt(resources);
        RhTextView optionContractMessageTxt = getBinding().optionContractMessageTxt;
        Intrinsics.checkNotNullExpressionValue(optionContractMessageTxt, "optionContractMessageTxt");
        TextViewsKt.setVisibilityText(optionContractMessageTxt, errorMessageTxt);
        RhTextView dataRowViewTitle1 = getBinding().dataRowViewTitle1;
        Intrinsics.checkNotNullExpressionValue(dataRowViewTitle1, "dataRowViewTitle1");
        dataRowViewTitle1.setVisibility(errorMessageTxt != null ? 4 : 0);
        RhTextView dataRowViewValue1 = getBinding().dataRowViewValue1;
        Intrinsics.checkNotNullExpressionValue(dataRowViewValue1, "dataRowViewValue1");
        dataRowViewValue1.setVisibility(errorMessageTxt != null ? 4 : 0);
        RhTextView dataRowViewTitle2 = getBinding().dataRowViewTitle2;
        Intrinsics.checkNotNullExpressionValue(dataRowViewTitle2, "dataRowViewTitle2");
        dataRowViewTitle2.setVisibility(errorMessageTxt != null ? 4 : 0);
        RhTextView dataRowViewValue2 = getBinding().dataRowViewValue2;
        Intrinsics.checkNotNullExpressionValue(dataRowViewValue2, "dataRowViewValue2");
        dataRowViewValue2.setVisibility(errorMessageTxt != null ? 4 : 0);
    }

    private final void bindCustomizedMetrics(OptionStrategyRowModel optionStrategyRowModel) {
        OptionChainAvailableMetrics.Metric selectedMetricOne;
        OptionChainAvailableMetrics.Metric selectedMetricTwo;
        if (optionStrategyRowModel.getStrategyType() == null) {
            Tuples2<String, String> dataRowDisplay1 = optionStrategyRowModel.getDataRowDisplay1();
            if (dataRowDisplay1 != null) {
                String strComponent1 = dataRowDisplay1.component1();
                String strComponent2 = dataRowDisplay1.component2();
                getBinding().dataRowViewTitle1.setText(strComponent1);
                getBinding().dataRowViewValue1.setText(strComponent2);
            }
            Tuples2<String, String> dataRowDisplay2 = optionStrategyRowModel.getDataRowDisplay2();
            if (dataRowDisplay2 != null) {
                String strComponent12 = dataRowDisplay2.component1();
                String strComponent22 = dataRowDisplay2.component2();
                getBinding().dataRowViewTitle2.setText(strComponent12);
                getBinding().dataRowViewValue2.setText(strComponent22);
                return;
            }
            return;
        }
        if (optionStrategyRowModel.getSelectedMetrics() == null) {
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            Tuples2<OptionChainAvailableMetrics.Metric, OptionChainAvailableMetrics.Metric> fallbackSelectedMetric = OptionChainFallbackMetrics.getFallbackSelectedMetric(resources, new Either.Right(optionStrategyRowModel.getStrategyType()));
            selectedMetricOne = fallbackSelectedMetric.getFirst();
            selectedMetricTwo = fallbackSelectedMetric.getSecond();
        } else {
            selectedMetricOne = optionStrategyRowModel.getSelectedMetrics().getSelectedMetricOne();
            selectedMetricTwo = optionStrategyRowModel.getSelectedMetrics().getSelectedMetricTwo();
        }
        getBinding().dataRowViewTitle1.setText(selectedMetricOne.getMetricChainLabel());
        getBinding().dataRowViewValue1.setText(getStrategyBuilderMetricValue(optionStrategyRowModel, selectedMetricOne));
        getBinding().dataRowViewTitle2.setText(selectedMetricTwo.getMetricChainLabel());
        getBinding().dataRowViewValue2.setText(getStrategyBuilderMetricValue(optionStrategyRowModel, selectedMetricTwo));
    }

    private final String getStrategyBuilderMetricValue(OptionStrategyRowModel optionStrategyRowModel, OptionChainAvailableMetrics.Metric metric) {
        String strategyBuilderMetricValue;
        return (metric.getMetricEnabled() && metric.isSupported() && (strategyBuilderMetricValue = OptionChainMetricValueConverter.getStrategyBuilderMetricValue(metric.getMetricType(), optionStrategyRowModel.getClientAggregateOptionStrategyQuote(), optionStrategyRowModel.getUnderlyingQuote())) != null) ? strategyBuilderMetricValue : com.robinhood.utils.extensions.ViewsKt.getString(this, C11048R.string.general_label_n_a_short);
    }

    @Override // com.robinhood.android.optionchain.BaseOptionRowView
    public void setOnClickListeners(final OptionStrategyRowModel model, final Callbacks callbacks) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        if (model.getIsDisabled()) {
            getBinding().optionContractPriceTxt.setOnClickListener(null);
        } else {
            AnimatedRhTextView optionContractPriceTxt = getBinding().optionContractPriceTxt;
            Intrinsics.checkNotNullExpressionValue(optionContractPriceTxt, "optionContractPriceTxt");
            OnClickListeners.onClick(optionContractPriceTxt, new Function0() { // from class: com.robinhood.android.optionsstrategybuilder.rows.OptionStrategyRowView$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OptionStrategyRowView.setOnClickListeners$lambda$6(callbacks, model);
                }
            });
        }
        OnClickListeners.onClick(this, new Function0() { // from class: com.robinhood.android.optionsstrategybuilder.rows.OptionStrategyRowView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionStrategyRowView.setOnClickListeners$lambda$7(callbacks, model);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setOnClickListeners$lambda$6(Callbacks callbacks, OptionStrategyRowModel optionStrategyRowModel) {
        callbacks.onPriceClicked(optionStrategyRowModel.getStrategy());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setOnClickListeners$lambda$7(Callbacks callbacks, OptionStrategyRowModel optionStrategyRowModel) {
        callbacks.onLaunchStatisticsDetail(optionStrategyRowModel);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.optionchain.BaseOptionRowView
    public void setViewColorAttributes(OptionStrategyRowModel model) {
        ResourceReferences4 disabled_text_color_reference;
        Intrinsics.checkNotNullParameter(model, "model");
        ThemedResourceReference<ColorStateList> disabled_text_color_reference2 = model.getIsDisabled() ? BaseOptionRowView.getDISABLED_TEXT_COLOR_REFERENCE() : ThemeAttributes.INSTANCE.getTEXT_COLOR_PRIMARY();
        RhTextView optionContractStrikePriceTxt = getBinding().optionContractStrikePriceTxt;
        Intrinsics.checkNotNullExpressionValue(optionContractStrikePriceTxt, "optionContractStrikePriceTxt");
        ScarletManager2.overrideAttribute(optionContractStrikePriceTxt, R.attr.textColor, disabled_text_color_reference2);
        ResourceReferences4 disabled_text_color_reference3 = model.getIsDisabled() ? BaseOptionRowView.getDISABLED_TEXT_COLOR_REFERENCE() : ThemeAttributes.INSTANCE.getCOLOR_PRIMARY();
        AnimatedRhTextView optionContractPriceTxt = getBinding().optionContractPriceTxt;
        Intrinsics.checkNotNullExpressionValue(optionContractPriceTxt, "optionContractPriceTxt");
        ScarletManager2.overrideAttribute(optionContractPriceTxt, R.attr.backgroundTint, disabled_text_color_reference3);
        RhTextView optionContractPriceDeltaTxt = getBinding().optionContractPriceDeltaTxt;
        Intrinsics.checkNotNullExpressionValue(optionContractPriceDeltaTxt, "optionContractPriceDeltaTxt");
        ScarletManager2.overrideAttribute(optionContractPriceDeltaTxt, R.attr.textColor, disabled_text_color_reference3);
        AnimatedRhTextView optionContractPriceTxt2 = getBinding().optionContractPriceTxt;
        Intrinsics.checkNotNullExpressionValue(optionContractPriceTxt2, "optionContractPriceTxt");
        if (model.getContractSelected()) {
            disabled_text_color_reference = BaseOptionRowView.getSELECTED_TEXT_COLOR_REFERENCE();
        } else {
            disabled_text_color_reference = model.getIsDisabled() ? BaseOptionRowView.getDISABLED_TEXT_COLOR_REFERENCE() : ThemeAttributes.INSTANCE.getCOLOR_PRIMARY();
        }
        ScarletManager2.overrideAttribute(optionContractPriceTxt2, R.attr.textColor, disabled_text_color_reference);
    }

    /* compiled from: OptionStrategyRowView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/optionsstrategybuilder/rows/OptionStrategyRowView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/optionsstrategybuilder/rows/OptionStrategyRowView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-options-strategy-builder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<OptionStrategyRowView> {
        private final /* synthetic */ Inflater<OptionStrategyRowView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public OptionStrategyRowView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (OptionStrategyRowView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C24876R.layout.include_strategy_contract_row);
        }
    }
}
