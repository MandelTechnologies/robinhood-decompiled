package com.robinhood.android.search.newsfeed.marketupdates;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.view.AnimatedRhTextView;
import com.robinhood.android.designsystem.style.DirectionOverlay;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.search.C27909R;
import com.robinhood.android.search.databinding.MergeMarketIndicatorItemViewBinding;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.ticker.TickerUtils;
import com.robinhood.ticker.TickerView;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.color.ThemeColors;
import com.robinhood.utils.p409ui.view.Inflater;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;

/* compiled from: MarketIndicatorItemView.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u001a\u0010\u0012\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0014\u0010\u0017\u001a\u00020\u0016*\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/search/newsfeed/marketupdates/MarketIndicatorItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/robinhood/android/search/databinding/MergeMarketIndicatorItemViewBinding;", "getBinding", "()Lcom/robinhood/android/search/databinding/MergeMarketIndicatorItemViewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "bind", "", "indicator", "Lcom/robinhood/android/search/newsfeed/marketupdates/MarketIndicatorItemData;", "bindPercentChangeArrow", "percentChange", "Ljava/math/BigDecimal;", "isStale", "", "shouldAnimate", "Lcom/robinhood/ticker/TickerView;", "updatedText", "", "Companion", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class MarketIndicatorItemView extends ConstraintLayout {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(MarketIndicatorItemView.class, "binding", "getBinding()Lcom/robinhood/android/search/databinding/MergeMarketIndicatorItemViewBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ MarketIndicatorItemView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketIndicatorItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewGroups.inflate(this, C27909R.layout.merge_market_indicator_item_view, true);
        this.binding = ViewBinding5.viewBinding(this, MarketIndicatorItemView2.INSTANCE);
    }

    private final MergeMarketIndicatorItemViewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeMarketIndicatorItemViewBinding) value;
    }

    public final void bind(MarketIndicatorItemData indicator) throws Resources.NotFoundException {
        String percentChange;
        Intrinsics.checkNotNullParameter(indicator, "indicator");
        getBinding().indicatorLabel.setText(indicator.getLabel());
        TickerView tickerView = getBinding().indicatorValue;
        tickerView.setCharacterLists(TickerUtils.provideNumberList());
        String value = indicator.getValue();
        Intrinsics.checkNotNull(tickerView);
        tickerView.setText(value, shouldAnimate(tickerView, indicator.getValue()));
        BigDecimal bigDecimalOrNull = StringsKt.toBigDecimalOrNull(indicator.getPercentChange());
        AnimatedRhTextView animatedRhTextView = getBinding().percentChangeValue;
        animatedRhTextView.setStale(indicator.isStale());
        if (bigDecimalOrNull != null && !indicator.isStale()) {
            DirectionOverlay directionOverlayFromSignOf = DirectionOverlay.INSTANCE.fromSignOf(bigDecimalOrNull);
            Intrinsics.checkNotNull(animatedRhTextView);
            ScarletManager2.getScarletManager(animatedRhTextView).putOverlay(directionOverlayFromSignOf, Boolean.FALSE);
        } else {
            Intrinsics.checkNotNull(animatedRhTextView);
            ScarletManager2.getScarletManager(animatedRhTextView).removeOverlay(DirectionOverlay.POSITIVE.getPriority(), Boolean.FALSE);
        }
        if (bigDecimalOrNull != null) {
            percentChange = ViewsKt.getString(animatedRhTextView, C27909R.string.market_indicator_percent_change, indicator.getPercentChange());
        } else {
            percentChange = indicator.getPercentChange();
        }
        String strReplaceFirst$default = percentChange;
        if (!Intrinsics.areEqual(strReplaceFirst$default, "-")) {
            strReplaceFirst$default = StringsKt.replaceFirst$default(strReplaceFirst$default, "-", "", false, 4, null);
        }
        animatedRhTextView.setText(strReplaceFirst$default, shouldAnimate(animatedRhTextView, strReplaceFirst$default));
        bindPercentChangeArrow(bigDecimalOrNull, indicator.isStale());
    }

    private final void bindPercentChangeArrow(BigDecimal percentChange, boolean isStale) throws Resources.NotFoundException {
        ImageView imageView = getBinding().percentChangeArrowUp;
        Intrinsics.checkNotNull(imageView);
        imageView.setVisibility(percentChange != null && percentChange.compareTo(BigDecimal.ZERO) >= 0 ? 0 : 8);
        int i = isStale ? C20690R.attr.colorForeground2 : C20690R.attr.colorPositive;
        Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int themeColor = ThemeColors.getThemeColor(context, i);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(themeColor, mode));
        ImageView imageView2 = getBinding().percentChangeArrowDown;
        Intrinsics.checkNotNull(imageView2);
        imageView2.setVisibility(percentChange != null && percentChange.compareTo(BigDecimal.ZERO) < 0 ? 0 : 8);
        int i2 = isStale ? C20690R.attr.colorForeground2 : C20690R.attr.colorNegative;
        Context context2 = imageView2.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        imageView2.setColorFilter(new PorterDuffColorFilter(ThemeColors.getThemeColor(context2, i2), mode));
    }

    private final boolean shouldAnimate(TickerView tickerView, String str) {
        return !(Intrinsics.areEqual(tickerView.getText(), "-") && !Intrinsics.areEqual(str, "-"));
    }

    /* compiled from: MarketIndicatorItemView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/search/newsfeed/marketupdates/MarketIndicatorItemView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/search/newsfeed/marketupdates/MarketIndicatorItemView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<MarketIndicatorItemView> {
        private final /* synthetic */ Inflater<MarketIndicatorItemView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public MarketIndicatorItemView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (MarketIndicatorItemView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C27909R.layout.include_market_indicator_item_view);
        }
    }
}
