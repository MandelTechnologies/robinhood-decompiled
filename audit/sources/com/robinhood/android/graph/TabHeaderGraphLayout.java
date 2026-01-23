package com.robinhood.android.graph;

import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BindViewDelegate2;
import com.robinhood.android.common.view.CandlestickDetailView;
import com.robinhood.android.designsystem.style.DirectionOverlay;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.designsystem.viewstubholder.ViewStubHolder;
import com.robinhood.android.graph.spark.GraphData;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.markethours.util.TraderMarketHoursManager;
import com.robinhood.compose.bento.component.BentoCurrencyPicker;
import com.robinhood.hammer.android.application.ApplicationComponentManagerHolder;
import com.robinhood.librobinhood.data.store.prefs.ShowCandlestickChartPref;
import com.robinhood.models.p355ui.DataPoint;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.annotation.UserPrefs;
import com.robinhood.prefs.dagger.SharedPreferencesModule;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.math.BigDecimals7;
import java.math.BigDecimal;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: TabHeaderGraphLayout.kt */
@Metadata(m3635d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001:\u0001[B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J6\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020G2\b\u0010H\u001a\u0004\u0018\u00010I2\b\u0010J\u001a\u0004\u0018\u00010K2\u0006\u0010L\u001a\u00020M2\b\u0010N\u001a\u0004\u0018\u00010MH\u0014J!\u0010O\u001a\u00020E2\b\u0010P\u001a\u0004\u0018\u00010Q2\b\u0010R\u001a\u0004\u0018\u00010SH\u0016¢\u0006\u0002\u0010TJ\u0010\u0010U\u001a\u00020E2\u0006\u0010V\u001a\u00020SH\u0014J\u0010\u0010W\u001a\u00020E2\u0006\u0010X\u001a\u00020SH\u0004J\u0010\u0010Y\u001a\u00020Z2\u0006\u0010R\u001a\u00020SH\u0007R\u0014\u0010\b\u001a\u00020\tX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\rX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u001e\u0010\u0012\u001a\u00020\u00138\u0016@\u0016X\u0097.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u00020\u00198\u0016@\u0016X\u0097.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\u001e\u001a\u00020\u001f8\u0016@\u0016X\u0097.¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001e\u0010$\u001a\u00020%8\u0016@\u0016X\u0097.¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001e\u0010*\u001a\u00020+8\u0016@\u0016X\u0097.¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001b\u00100\u001a\u0002018DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b2\u00103R\u001d\u00106\u001a\u0004\u0018\u0001078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b:\u00105\u001a\u0004\b8\u00109R\u001d\u0010;\u001a\u0004\u0018\u0001078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b=\u00105\u001a\u0004\b<\u00109R\u001b\u0010>\u001a\u00020?8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\b@\u0010A¨\u0006\\"}, m3636d2 = {"Lcom/robinhood/android/graph/TabHeaderGraphLayout;", "Lcom/robinhood/android/graph/GraphLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "loggingEventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getLoggingEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "priceDeltaFormat", "Lcom/robinhood/android/lib/formats/NumberFormatter;", "getPriceDeltaFormat", "()Lcom/robinhood/android/lib/formats/NumberFormatter;", "percentDeltaFormat", "getPercentDeltaFormat", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "marketHoursManager", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "getMarketHoursManager", "()Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "setMarketHoursManager", "(Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;)V", SharedPreferencesModule.USER_PREFS_NAME, "Landroid/content/SharedPreferences;", "getUserPrefs", "()Landroid/content/SharedPreferences;", "setUserPrefs", "(Landroid/content/SharedPreferences;)V", "showCandlestickChartPref", "Lcom/robinhood/prefs/BooleanPreference;", "getShowCandlestickChartPref", "()Lcom/robinhood/prefs/BooleanPreference;", "setShowCandlestickChartPref", "(Lcom/robinhood/prefs/BooleanPreference;)V", BentoCurrencyPicker.ROOT_TEST_TAG, "Landroidx/constraintlayout/widget/ConstraintLayout;", "getRoot", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "root$delegate", "Lkotlin/properties/ReadOnlyProperty;", "directionIcon", "Landroid/widget/ImageView;", "getDirectionIcon", "()Landroid/widget/ImageView;", "directionIcon$delegate", "afterHoursDirectionIcon", "getAfterHoursDirectionIcon", "afterHoursDirectionIcon$delegate", "cachedConstraintSet", "Landroidx/constraintlayout/widget/ConstraintSet;", "getCachedConstraintSet", "()Landroidx/constraintlayout/widget/ConstraintSet;", "cachedConstraintSet$delegate", "Lkotlin/Lazy;", "setDeltaInfoText", "", "viewModel", "Lcom/robinhood/android/graph/GraphLayoutViewModel;", "graphData", "Lcom/robinhood/android/graph/spark/GraphData;", "selectedDataPoint", "Lcom/robinhood/models/ui/DataPoint;", "deltaValue", "Ljava/math/BigDecimal;", "deltaPercent", "setAfterHoursText", "text", "", "isUp", "", "(Ljava/lang/CharSequence;Ljava/lang/Boolean;)V", "onCandlestickScrubStateChanged", "scrubbing", "setContainerConstraints", "expanded", "getStockDirectionIcon", "", "TabHeaderGraphLayoutEntryPoint", "lib-graph_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public class TabHeaderGraphLayout extends GraphLayout {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(TabHeaderGraphLayout.class, BentoCurrencyPicker.ROOT_TEST_TAG, "getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;", 0)), Reflection.property1(new PropertyReference1Impl(TabHeaderGraphLayout.class, "directionIcon", "getDirectionIcon()Landroid/widget/ImageView;", 0)), Reflection.property1(new PropertyReference1Impl(TabHeaderGraphLayout.class, "afterHoursDirectionIcon", "getAfterHoursDirectionIcon()Landroid/widget/ImageView;", 0))};
    public static final int $stable = 8;

    /* renamed from: afterHoursDirectionIcon$delegate, reason: from kotlin metadata */
    private final Interfaces2 afterHoursDirectionIcon;
    public AnalyticsLogger analytics;

    /* renamed from: cachedConstraintSet$delegate, reason: from kotlin metadata */
    private final Lazy cachedConstraintSet;

    /* renamed from: directionIcon$delegate, reason: from kotlin metadata */
    private final Interfaces2 directionIcon;
    public EventLogger eventLogger;
    private final Screen loggingEventScreen;
    public TraderMarketHoursManager marketHoursManager;
    private final NumberFormatter percentDeltaFormat;
    private final NumberFormatter priceDeltaFormat;

    /* renamed from: root$delegate, reason: from kotlin metadata */
    private final Interfaces2 root;

    @ShowCandlestickChartPref
    public BooleanPreference showCandlestickChartPref;

    @UserPrefs
    public SharedPreferences userPrefs;

    /* compiled from: TabHeaderGraphLayout.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/graph/TabHeaderGraphLayout$TabHeaderGraphLayoutEntryPoint;", "", "inject", "", "obj", "Lcom/robinhood/android/graph/TabHeaderGraphLayout;", "lib-graph_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes17.dex */
    public interface TabHeaderGraphLayoutEntryPoint {
        void inject(TabHeaderGraphLayout obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabHeaderGraphLayout(Context context, AttributeSet attributeSet) {
        ComponentCallbacks2 componentCallbacks2;
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.loggingEventScreen = new Screen(null, null, null, null, 15, null);
        this.priceDeltaFormat = Formats.getNoSignPriceFormat();
        this.percentDeltaFormat = Formats.getNoSignPercentFormat();
        this.root = BindViewDelegate2.bindView$default(this, androidx.appcompat.R$id.content, null, 2, null);
        this.directionIcon = BindViewDelegate2.bindView$default(this, C11048R.id.graph_header_direction_icon, null, 2, null);
        this.afterHoursDirectionIcon = BindViewDelegate2.bindView$default(this, C11048R.id.graph_header_afterhours_direction_icon, null, 2, null);
        this.cachedConstraintSet = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.graph.TabHeaderGraphLayout$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TabHeaderGraphLayout.cachedConstraintSet_delegate$lambda$1(this.f$0);
            }
        });
        if (context instanceof Application) {
            componentCallbacks2 = (Application) context;
        } else {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
            componentCallbacks2 = (Application) applicationContext;
        }
        ((TabHeaderGraphLayoutEntryPoint) ((ApplicationComponentManagerHolder) componentCallbacks2).getComponentManager().get()).inject(this);
    }

    @Override // com.robinhood.android.graph.GraphLayout
    protected Screen getLoggingEventScreen() {
        return this.loggingEventScreen;
    }

    @Override // com.robinhood.android.graph.GraphLayout
    protected NumberFormatter getPriceDeltaFormat() {
        return this.priceDeltaFormat;
    }

    @Override // com.robinhood.android.graph.GraphLayout
    protected NumberFormatter getPercentDeltaFormat() {
        return this.percentDeltaFormat;
    }

    @Override // com.robinhood.android.graph.GraphLayout
    public AnalyticsLogger getAnalytics() {
        AnalyticsLogger analyticsLogger = this.analytics;
        if (analyticsLogger != null) {
            return analyticsLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
        return null;
    }

    @Override // com.robinhood.android.graph.GraphLayout
    public void setAnalytics(AnalyticsLogger analyticsLogger) {
        Intrinsics.checkNotNullParameter(analyticsLogger, "<set-?>");
        this.analytics = analyticsLogger;
    }

    @Override // com.robinhood.android.graph.GraphLayout
    public EventLogger getEventLogger() {
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            return eventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    @Override // com.robinhood.android.graph.GraphLayout
    public void setEventLogger(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "<set-?>");
        this.eventLogger = eventLogger;
    }

    @Override // com.robinhood.android.graph.GraphLayout
    public TraderMarketHoursManager getMarketHoursManager() {
        TraderMarketHoursManager traderMarketHoursManager = this.marketHoursManager;
        if (traderMarketHoursManager != null) {
            return traderMarketHoursManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("marketHoursManager");
        return null;
    }

    @Override // com.robinhood.android.graph.GraphLayout
    public void setMarketHoursManager(TraderMarketHoursManager traderMarketHoursManager) {
        Intrinsics.checkNotNullParameter(traderMarketHoursManager, "<set-?>");
        this.marketHoursManager = traderMarketHoursManager;
    }

    @Override // com.robinhood.android.graph.GraphLayout
    public SharedPreferences getUserPrefs() {
        SharedPreferences sharedPreferences = this.userPrefs;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        Intrinsics.throwUninitializedPropertyAccessException(SharedPreferencesModule.USER_PREFS_NAME);
        return null;
    }

    @Override // com.robinhood.android.graph.GraphLayout
    public void setUserPrefs(SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "<set-?>");
        this.userPrefs = sharedPreferences;
    }

    @Override // com.robinhood.android.graph.GraphLayout
    public BooleanPreference getShowCandlestickChartPref() {
        BooleanPreference booleanPreference = this.showCandlestickChartPref;
        if (booleanPreference != null) {
            return booleanPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("showCandlestickChartPref");
        return null;
    }

    @Override // com.robinhood.android.graph.GraphLayout
    public void setShowCandlestickChartPref(BooleanPreference booleanPreference) {
        Intrinsics.checkNotNullParameter(booleanPreference, "<set-?>");
        this.showCandlestickChartPref = booleanPreference;
    }

    protected final ConstraintLayout getRoot() {
        return (ConstraintLayout) this.root.getValue(this, $$delegatedProperties[0]);
    }

    public final ImageView getDirectionIcon() {
        return (ImageView) this.directionIcon.getValue(this, $$delegatedProperties[1]);
    }

    public final ImageView getAfterHoursDirectionIcon() {
        return (ImageView) this.afterHoursDirectionIcon.getValue(this, $$delegatedProperties[2]);
    }

    private final ConstraintSet getCachedConstraintSet() {
        return (ConstraintSet) this.cachedConstraintSet.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConstraintSet cachedConstraintSet_delegate$lambda$1(TabHeaderGraphLayout tabHeaderGraphLayout) {
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(tabHeaderGraphLayout.getRoot());
        return constraintSet;
    }

    @Override // com.robinhood.android.graph.GraphLayout
    protected void setDeltaInfoText(GraphLayoutViewModel viewModel, GraphData graphData, DataPoint selectedDataPoint, BigDecimal deltaValue, BigDecimal deltaPercent) {
        ScarletManager scarletManager;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(deltaValue, "deltaValue");
        super.setDeltaInfoText(viewModel, graphData, selectedDataPoint, deltaValue, deltaPercent);
        boolean zIsNegative = BigDecimals7.isNegative(deltaValue);
        boolean z = !zIsNegative;
        ImageView directionIcon = getDirectionIcon();
        if (directionIcon != null) {
            directionIcon.setImageResource(getStockDirectionIcon(z));
        }
        ImageView directionIcon2 = getDirectionIcon();
        if (directionIcon2 != null) {
            directionIcon2.setContentDescription(ViewsKt.getString(this, !zIsNegative ? C11048R.string.general_label_delta_up : C11048R.string.general_label_delta_down));
        }
        ImageView directionIcon3 = getDirectionIcon();
        if (directionIcon3 == null || (scarletManager = ScarletManager2.getScarletManager(directionIcon3)) == null) {
            return;
        }
        ScarletManager.putOverlay$default(scarletManager, !zIsNegative ? DirectionOverlay.POSITIVE : DirectionOverlay.NEGATIVE, null, 2, null);
    }

    @Override // com.robinhood.android.graph.GraphLayout
    public void setAfterHoursText(CharSequence text, Boolean isUp) {
        ImageView afterHoursDirectionIcon;
        ScarletManager scarletManager;
        super.setAfterHoursText(text, isUp);
        if (isUp != null) {
            ImageView afterHoursDirectionIcon2 = getAfterHoursDirectionIcon();
            if (afterHoursDirectionIcon2 != null) {
                afterHoursDirectionIcon2.setImageResource(getStockDirectionIcon(isUp.booleanValue()));
            }
            ImageView afterHoursDirectionIcon3 = getAfterHoursDirectionIcon();
            if (afterHoursDirectionIcon3 != null) {
                afterHoursDirectionIcon3.setContentDescription(ViewsKt.getString(this, isUp.booleanValue() ? C11048R.string.general_label_delta_up : C11048R.string.general_label_delta_down));
            }
        }
        ImageView afterHoursDirectionIcon4 = getAfterHoursDirectionIcon();
        if (afterHoursDirectionIcon4 != null) {
            afterHoursDirectionIcon4.setVisibility(isUp != null ? 0 : 8);
        }
        if (isUp == null || (afterHoursDirectionIcon = getAfterHoursDirectionIcon()) == null || (scarletManager = ScarletManager2.getScarletManager(afterHoursDirectionIcon)) == null) {
            return;
        }
        ScarletManager.putOverlay$default(scarletManager, isUp.booleanValue() ? DirectionOverlay.POSITIVE : DirectionOverlay.NEGATIVE, null, 2, null);
    }

    @Override // com.robinhood.android.graph.GraphLayout
    protected void onCandlestickScrubStateChanged(boolean scrubbing) {
        RhTextView candlestickScrubbedTxt = getCandlestickScrubbedTxt();
        Intrinsics.checkNotNull(candlestickScrubbedTxt);
        candlestickScrubbedTxt.setVisibility(scrubbing ? 0 : 8);
        ViewStubHolder<CandlestickDetailView> candlestickDetailViewStubHolder = getCandlestickDetailViewStubHolder();
        Intrinsics.checkNotNull(candlestickDetailViewStubHolder);
        candlestickDetailViewStubHolder.setVisible(scrubbing);
        setContainerConstraints(scrubbing);
    }

    protected final void setContainerConstraints(boolean expanded) {
        getCachedConstraintSet().connect(C11048R.id.graph_layout_container, 3, C11048R.id.graph_header_content, expanded ? 3 : 4);
        getCachedConstraintSet().applyTo(getRoot());
    }

    public final int getStockDirectionIcon(boolean isUp) {
        return isUp ? C20690R.drawable.ic_rds_stock_up_16dp : C20690R.drawable.ic_rds_stock_down_16dp;
    }
}
