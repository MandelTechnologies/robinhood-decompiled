package com.robinhood.android.libdesignsystem.serverui.experimental.compose.screener;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.serverdriven.experimental.api.Direction;
import com.robinhood.models.serverdriven.experimental.api.PriceChangeDefaultValue;
import com.robinhood.models.serverdriven.experimental.api.TableDailyPriceChangeItem;
import com.robinhood.models.serverdriven.experimental.api.TableMonthlyPriceChangeItem;
import com.robinhood.models.serverdriven.experimental.api.TableSharePriceItem;
import com.robinhood.models.serverdriven.experimental.api.TableThreeMonthPriceChangeItem;
import com.robinhood.models.serverdriven.experimental.api.TableWeeklyPriceChangeItem;
import com.robinhood.models.serverdriven.experimental.api.TableYearlyPriceChangeItem;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.util.Money;
import java.math.BigDecimal;
import java.math.MathContext;
import java.text.NumberFormat;
import java.text.ParseException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SduiPollableScreenerItemsViewModel.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010$\u001a\u00020%2\f\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005H\u0002J\u0014\u0010&\u001a\u0004\u0018\u00010\u00132\b\u0010'\u001a\u0004\u0018\u00010(H\u0002J\u0010\u0010)\u001a\u00020%2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\"\u0010*\u001a\u0004\u0018\u00010\u001d2\f\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00052\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0002J#\u0010+\u001a\u0004\u0018\u00010\u001d2\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010,\u001a\u0004\u0018\u00010-H\u0002¢\u0006\u0002\u0010.J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u00100\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005HÆ\u0003J\t\u00101\u001a\u00020\u0007HÆ\u0003J/\u00102\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u00103\u001a\u00020\u00172\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u000206HÖ\u0001J\t\u00107\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007@BX\u0086.¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\"\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0010\u001a\u0004\u0018\u00010\u0013@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u0017@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u0017@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R&\u0010\u001c\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u00068"}, m3636d2 = {"Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/screener/SduiPollableViewState;", "", "quote", "Lcom/robinhood/models/db/Quote;", "component", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "defaultColumnValue", "", "<init>", "(Lcom/robinhood/models/db/Quote;Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;Ljava/lang/String;)V", "getQuote", "()Lcom/robinhood/models/db/Quote;", "getComponent", "()Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "getDefaultColumnValue", "()Ljava/lang/String;", "value", "priceText", "getPriceText", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "icon", "getIcon", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "", "isPositiveDelta", "()Z", "hasLoaded", "getHasLoaded", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "Ljava/math/BigDecimal;", "getPrice$annotations", "()V", "getPrice", "()Ljava/math/BigDecimal;", "setPrice", "(Ljava/math/BigDecimal;)V", "setValuesFromComponent", "", "getIconFromDirection", "direction", "Lcom/robinhood/models/serverdriven/experimental/api/Direction;", "setValuesFromQuote", "getComponentDelta", "getBaselineDelta", "componentBaseline", "", "(Lcom/robinhood/models/db/Quote;Ljava/lang/Float;)Ljava/math/BigDecimal;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "lib-sdui_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class SduiPollableViewState {
    public static final int $stable = 8;
    private final UIComponent<?> component;
    private final String defaultColumnValue;
    private boolean hasLoaded;
    private ServerToBentoAssetMapper2 icon;
    private boolean isPositiveDelta;
    private BigDecimal price;
    private String priceText;
    private final Quote quote;

    /* compiled from: SduiPollableScreenerItemsViewModel.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Direction.values().length];
            try {
                iArr[Direction.f5855UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Direction.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SduiPollableViewState() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SduiPollableViewState copy$default(SduiPollableViewState sduiPollableViewState, Quote quote, UIComponent uIComponent, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            quote = sduiPollableViewState.quote;
        }
        if ((i & 2) != 0) {
            uIComponent = sduiPollableViewState.component;
        }
        if ((i & 4) != 0) {
            str = sduiPollableViewState.defaultColumnValue;
        }
        return sduiPollableViewState.copy(quote, uIComponent, str);
    }

    public static /* synthetic */ void getPrice$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final Quote getQuote() {
        return this.quote;
    }

    public final UIComponent<?> component2() {
        return this.component;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDefaultColumnValue() {
        return this.defaultColumnValue;
    }

    public final SduiPollableViewState copy(Quote quote, UIComponent<?> component, String defaultColumnValue) {
        Intrinsics.checkNotNullParameter(defaultColumnValue, "defaultColumnValue");
        return new SduiPollableViewState(quote, component, defaultColumnValue);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiPollableViewState)) {
            return false;
        }
        SduiPollableViewState sduiPollableViewState = (SduiPollableViewState) other;
        return Intrinsics.areEqual(this.quote, sduiPollableViewState.quote) && Intrinsics.areEqual(this.component, sduiPollableViewState.component) && Intrinsics.areEqual(this.defaultColumnValue, sduiPollableViewState.defaultColumnValue);
    }

    public int hashCode() {
        Quote quote = this.quote;
        int iHashCode = (quote == null ? 0 : quote.hashCode()) * 31;
        UIComponent<?> uIComponent = this.component;
        return ((iHashCode + (uIComponent != null ? uIComponent.hashCode() : 0)) * 31) + this.defaultColumnValue.hashCode();
    }

    public String toString() {
        return "SduiPollableViewState(quote=" + this.quote + ", component=" + this.component + ", defaultColumnValue=" + this.defaultColumnValue + ")";
    }

    public SduiPollableViewState(Quote quote, UIComponent<?> uIComponent, String defaultColumnValue) {
        Intrinsics.checkNotNullParameter(defaultColumnValue, "defaultColumnValue");
        this.quote = quote;
        this.component = uIComponent;
        this.defaultColumnValue = defaultColumnValue;
        this.isPositiveDelta = true;
        if (quote != null) {
            setValuesFromQuote(quote);
        } else {
            setValuesFromComponent(uIComponent);
        }
    }

    public final Quote getQuote() {
        return this.quote;
    }

    public final UIComponent<?> getComponent() {
        return this.component;
    }

    public /* synthetic */ SduiPollableViewState(Quote quote, UIComponent uIComponent, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : quote, (i & 2) != 0 ? null : uIComponent, (i & 4) != 0 ? "" : str);
    }

    public final String getDefaultColumnValue() {
        return this.defaultColumnValue;
    }

    public final String getPriceText() {
        String str = this.priceText;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("priceText");
        return null;
    }

    public final ServerToBentoAssetMapper2 getIcon() {
        return this.icon;
    }

    /* renamed from: isPositiveDelta, reason: from getter */
    public final boolean getIsPositiveDelta() {
        return this.isPositiveDelta;
    }

    public final boolean getHasLoaded() {
        return this.hasLoaded;
    }

    public final BigDecimal getPrice() {
        return this.price;
    }

    public final void setPrice(BigDecimal bigDecimal) {
        this.price = bigDecimal;
    }

    private final void setValuesFromComponent(UIComponent<?> component) {
        String value = null;
        if (component instanceof TableSharePriceItem) {
            String default_value = ((TableSharePriceItem) component).getDefault_value();
            if (default_value != null) {
                try {
                    value = Formats.getAmountFormat().formatNullable(NumberFormat.getCurrencyInstance().parse(default_value), this.defaultColumnValue);
                } catch (ParseException unused) {
                }
            }
        } else if (component instanceof TableDailyPriceChangeItem) {
            TableDailyPriceChangeItem tableDailyPriceChangeItem = (TableDailyPriceChangeItem) component;
            PriceChangeDefaultValue default_value2 = tableDailyPriceChangeItem.getDefault_value();
            this.icon = getIconFromDirection(default_value2 != null ? default_value2.getDirection() : null);
            PriceChangeDefaultValue default_value3 = tableDailyPriceChangeItem.getDefault_value();
            if (default_value3 != null) {
                value = default_value3.getValue();
            }
        } else if (component instanceof TableWeeklyPriceChangeItem) {
            TableWeeklyPriceChangeItem tableWeeklyPriceChangeItem = (TableWeeklyPriceChangeItem) component;
            PriceChangeDefaultValue default_value4 = tableWeeklyPriceChangeItem.getDefault_value();
            this.icon = getIconFromDirection(default_value4 != null ? default_value4.getDirection() : null);
            PriceChangeDefaultValue default_value5 = tableWeeklyPriceChangeItem.getDefault_value();
            if (default_value5 != null) {
                value = default_value5.getValue();
            }
        } else if (component instanceof TableMonthlyPriceChangeItem) {
            TableMonthlyPriceChangeItem tableMonthlyPriceChangeItem = (TableMonthlyPriceChangeItem) component;
            PriceChangeDefaultValue default_value6 = tableMonthlyPriceChangeItem.getDefault_value();
            this.icon = getIconFromDirection(default_value6 != null ? default_value6.getDirection() : null);
            PriceChangeDefaultValue default_value7 = tableMonthlyPriceChangeItem.getDefault_value();
            if (default_value7 != null) {
                value = default_value7.getValue();
            }
        } else if (component instanceof TableThreeMonthPriceChangeItem) {
            TableThreeMonthPriceChangeItem tableThreeMonthPriceChangeItem = (TableThreeMonthPriceChangeItem) component;
            PriceChangeDefaultValue default_value8 = tableThreeMonthPriceChangeItem.getDefault_value();
            this.icon = getIconFromDirection(default_value8 != null ? default_value8.getDirection() : null);
            PriceChangeDefaultValue default_value9 = tableThreeMonthPriceChangeItem.getDefault_value();
            if (default_value9 != null) {
                value = default_value9.getValue();
            }
        } else if (component instanceof TableYearlyPriceChangeItem) {
            TableYearlyPriceChangeItem tableYearlyPriceChangeItem = (TableYearlyPriceChangeItem) component;
            PriceChangeDefaultValue default_value10 = tableYearlyPriceChangeItem.getDefault_value();
            this.icon = getIconFromDirection(default_value10 != null ? default_value10.getDirection() : null);
            PriceChangeDefaultValue default_value11 = tableYearlyPriceChangeItem.getDefault_value();
            if (default_value11 != null) {
                value = default_value11.getValue();
            }
        } else {
            value = this.defaultColumnValue;
        }
        this.hasLoaded = value != null;
        if (value == null) {
            value = this.defaultColumnValue;
        }
        this.priceText = value;
    }

    private final ServerToBentoAssetMapper2 getIconFromDirection(Direction direction) {
        int i = direction == null ? -1 : WhenMappings.$EnumSwitchMapping$0[direction.ordinal()];
        if (i == 1) {
            return ServerToBentoAssetMapper2.STOCK_UP_16;
        }
        if (i != 2) {
            return null;
        }
        return ServerToBentoAssetMapper2.STOCK_DOWN_16;
    }

    private final void setValuesFromQuote(Quote quote) {
        BigDecimal componentDelta = getComponentDelta(this.component, quote);
        boolean z = componentDelta == null || componentDelta.compareTo(BigDecimal.ZERO) >= 0;
        this.isPositiveDelta = z;
        UIComponent<?> uIComponent = this.component;
        ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = null;
        if (uIComponent instanceof TableSharePriceItem) {
            this.icon = null;
            this.price = quote.getLastTradePrice().getDecimalValue();
            this.priceText = Formats.getAmountFormat().format(quote.getLastTradePrice().getDecimalValue());
        } else if ((uIComponent instanceof TableDailyPriceChangeItem) || (uIComponent instanceof TableWeeklyPriceChangeItem) || (uIComponent instanceof TableMonthlyPriceChangeItem) || (uIComponent instanceof TableThreeMonthPriceChangeItem) || (uIComponent instanceof TableYearlyPriceChangeItem)) {
            if (componentDelta != null) {
                if (z) {
                    serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.STOCK_UP_16;
                } else {
                    serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.STOCK_DOWN_16;
                }
            }
            this.icon = serverToBentoAssetMapper2;
            this.price = componentDelta;
            this.priceText = SduiPollableScreenerItemsViewModel3.getPercentChangeFormatter().formatNullable(componentDelta, this.defaultColumnValue);
        } else {
            this.icon = null;
            this.price = null;
            this.priceText = this.defaultColumnValue;
        }
        this.hasLoaded = true;
    }

    private final BigDecimal getComponentDelta(UIComponent<?> component, Quote quote) {
        BigDecimal todaysPercentChange;
        if ((component instanceof TableSharePriceItem) || (component instanceof TableDailyPriceChangeItem)) {
            return (quote == null || (todaysPercentChange = quote.getTodaysPercentChange()) == null) ? BigDecimal.ZERO : todaysPercentChange;
        }
        if (component instanceof TableWeeklyPriceChangeItem) {
            return getBaselineDelta(quote, ((TableWeeklyPriceChangeItem) component).getPrice_baseline());
        }
        if (component instanceof TableMonthlyPriceChangeItem) {
            return getBaselineDelta(quote, ((TableMonthlyPriceChangeItem) component).getPrice_baseline());
        }
        if (component instanceof TableThreeMonthPriceChangeItem) {
            return getBaselineDelta(quote, ((TableThreeMonthPriceChangeItem) component).getPrice_baseline());
        }
        if (component instanceof TableYearlyPriceChangeItem) {
            return getBaselineDelta(quote, ((TableYearlyPriceChangeItem) component).getPrice_baseline());
        }
        return null;
    }

    private final BigDecimal getBaselineDelta(Quote quote, Float componentBaseline) {
        Money lastTradePrice;
        BigDecimal decimalValue;
        if (quote != null && (lastTradePrice = quote.getLastTradePrice()) != null && (decimalValue = lastTradePrice.getDecimalValue()) != null && componentBaseline != null) {
            BigDecimal bigDecimal = new BigDecimal(String.valueOf(componentBaseline.floatValue()));
            try {
                BigDecimal bigDecimalSubtract = decimalValue.subtract(bigDecimal);
                Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
                return bigDecimalSubtract.divide(bigDecimal, new MathContext(2));
            } catch (ArithmeticException unused) {
            }
        }
        return null;
    }
}
