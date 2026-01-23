package com.robinhood.android.common.views.crypto;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.TextView;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.android.common.instrumentrow.C11218R;
import com.robinhood.android.common.util.SecurityViewMode;
import com.robinhood.android.common.util.extensions.Contexts7;
import com.robinhood.android.common.views.BaseInstrumentRowView;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.designsystem.style.DirectionOverlay;
import com.robinhood.android.designsystem.style.ThemeAttributes;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.graph.spark.GraphData;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.markethours.util.TraderMarketHoursManager;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.disposer.ViewDisposerKt;
import com.robinhood.disposer.ViewScopedObservable;
import com.robinhood.librobinhood.data.store.CryptoHistoricalStore;
import com.robinhood.librobinhood.data.store.CryptoQuoteStore;
import com.robinhood.librobinhood.data.store.CurrencyPairStore;
import com.robinhood.models.crypto.p314db.CryptoOrder;
import com.robinhood.models.crypto.p314db.CryptoQuote;
import com.robinhood.models.crypto.p314db.Currency;
import com.robinhood.models.crypto.p315ui.UiCryptoHistorical;
import com.robinhood.models.crypto.p315ui.UiCryptoHolding;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.p320db.MarketHours;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p355ui.GraphSelection;
import com.robinhood.models.p355ui.Historical;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.ScarletOverlay;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import com.robinhood.shared.formats.crypto.CurrencyDefinitions;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.android.C41827R;
import com.robinhood.utils.extensions.ContextsUiExtensions;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.Observables;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;

/* compiled from: CryptoRowView.kt */
@Metadata(m3635d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000 ^2\u00020\u0001:\u0002^_B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010Y\u001a\u000201H\u0014J\u001e\u0010Z\u001a\u0002012\u0006\u0010)\u001a\u00020*2\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010'J\u0010\u0010[\u001a\u0002012\u0006\u0010\\\u001a\u00020]H\u0002R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001a\u001a\u00020\u001b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010&\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010'X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010)\u001a\u00020*X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R4\u00102\u001a\n\u0012\u0004\u0012\u000201\u0018\u0001002\u000e\u0010/\u001a\n\u0012\u0004\u0012\u000201\u0018\u000100@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R(\u00108\u001a\u0004\u0018\u0001072\b\u0010/\u001a\u0004\u0018\u0001078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u0014\u0010=\u001a\u0002078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010:R\u001c\u0010?\u001a\u0010\u0012\f\u0012\n B*\u0004\u0018\u00010A0A0@X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010C\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u000207 B*\n\u0012\u0004\u0012\u000207\u0018\u00010D0D0@X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010E\u001a\u00020F8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bG\u0010HR\u001b\u0010K\u001a\u00020F8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bM\u0010J\u001a\u0004\bL\u0010HR\u001b\u0010N\u001a\u00020F8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u0010J\u001a\u0004\bO\u0010HR\u001d\u0010Q\u001a\u0004\u0018\u00010F8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bS\u0010J\u001a\u0004\bR\u0010HR\u001d\u0010T\u001a\u0004\u0018\u00010U8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bX\u0010J\u001a\u0004\bV\u0010W¨\u0006`"}, m3636d2 = {"Lcom/robinhood/android/common/views/crypto/CryptoRowView;", "Lcom/robinhood/android/common/views/BaseInstrumentRowView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "cryptoQuoteStore", "Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore;", "getCryptoQuoteStore", "()Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore;", "setCryptoQuoteStore", "(Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore;)V", "cryptoHistoricalStore", "Lcom/robinhood/librobinhood/data/store/CryptoHistoricalStore;", "getCryptoHistoricalStore", "()Lcom/robinhood/librobinhood/data/store/CryptoHistoricalStore;", "setCryptoHistoricalStore", "(Lcom/robinhood/librobinhood/data/store/CryptoHistoricalStore;)V", "currencyPairStore", "Lcom/robinhood/librobinhood/data/store/CurrencyPairStore;", "getCurrencyPairStore", "()Lcom/robinhood/librobinhood/data/store/CurrencyPairStore;", "setCurrencyPairStore", "(Lcom/robinhood/librobinhood/data/store/CurrencyPairStore;)V", "marketHoursManager", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "getMarketHoursManager", "()Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "setMarketHoursManager", "(Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;)V", "cryptoQuote", "Lcom/robinhood/models/crypto/db/CryptoQuote;", "cryptoHistorical", "Lcom/robinhood/models/crypto/ui/UiCryptoHistorical;", "uiCurrencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "pendingOrders", "", "Lcom/robinhood/models/crypto/db/CryptoOrder;", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/common/views/crypto/CryptoRowView$Data;", "getData", "()Lcom/robinhood/android/common/views/crypto/CryptoRowView$Data;", "setData", "(Lcom/robinhood/android/common/views/crypto/CryptoRowView$Data;)V", "value", "Lkotlin/Function0;", "", "onQuoteClick", "getOnQuoteClick", "()Lkotlin/jvm/functions/Function0;", "setOnQuoteClick", "(Lkotlin/jvm/functions/Function0;)V", "Lcom/robinhood/android/common/util/SecurityViewMode;", "customViewMode", "getCustomViewMode", "()Lcom/robinhood/android/common/util/SecurityViewMode;", "setCustomViewMode", "(Lcom/robinhood/android/common/util/SecurityViewMode;)V", "viewMode", "getViewMode", "currencyPairIdRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Ljava/util/UUID;", "kotlin.jvm.PlatformType", "viewModeRelay", "Lcom/robinhood/utils/Optional;", "pendingBuySellDrawable", "Landroid/graphics/drawable/Drawable;", "getPendingBuySellDrawable", "()Landroid/graphics/drawable/Drawable;", "pendingBuySellDrawable$delegate", "Lkotlin/Lazy;", "pendingBuyDrawable", "getPendingBuyDrawable", "pendingBuyDrawable$delegate", "pendingSellDrawable", "getPendingSellDrawable", "pendingSellDrawable$delegate", "checkmarkDrawable", "getCheckmarkDrawable", "checkmarkDrawable$delegate", "drawableTintColor", "", "getDrawableTintColor", "()Ljava/lang/Integer;", "drawableTintColor$delegate", "onAttachedToWindow", "bind", "refreshUi", "animateQuote", "", "Companion", "Data", "feature-lib-instrument-row_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class CryptoRowView extends Hammer_CryptoRowView {

    /* renamed from: checkmarkDrawable$delegate, reason: from kotlin metadata */
    private final Lazy checkmarkDrawable;
    private UiCryptoHistorical cryptoHistorical;
    public CryptoHistoricalStore cryptoHistoricalStore;
    private CryptoQuote cryptoQuote;
    public CryptoQuoteStore cryptoQuoteStore;
    private final BehaviorRelay<UUID> currencyPairIdRelay;
    public CurrencyPairStore currencyPairStore;
    public Data data;

    /* renamed from: drawableTintColor$delegate, reason: from kotlin metadata */
    private final Lazy drawableTintColor;
    public TraderMarketHoursManager marketHoursManager;
    private Function0<Unit> onQuoteClick;

    /* renamed from: pendingBuyDrawable$delegate, reason: from kotlin metadata */
    private final Lazy pendingBuyDrawable;

    /* renamed from: pendingBuySellDrawable$delegate, reason: from kotlin metadata */
    private final Lazy pendingBuySellDrawable;
    private List<CryptoOrder> pendingOrders;

    /* renamed from: pendingSellDrawable$delegate, reason: from kotlin metadata */
    private final Lazy pendingSellDrawable;
    private UiCurrencyPair uiCurrencyPair;
    private final BehaviorRelay<Optional<SecurityViewMode>> viewModeRelay;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: CryptoRowView.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SecurityViewMode.values().length];
            try {
                iArr[SecurityViewMode.EQUITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoRowView(final Context context, AttributeSet attributeSet) {
        super(context, attributeSet, null);
        Intrinsics.checkNotNullParameter(context, "context");
        BehaviorRelay<UUID> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.currencyPairIdRelay = behaviorRelayCreate;
        BehaviorRelay<Optional<SecurityViewMode>> behaviorRelayCreateDefault = BehaviorRelay.createDefault(Optional2.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreateDefault, "createDefault(...)");
        this.viewModeRelay = behaviorRelayCreateDefault;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.pendingBuySellDrawable = LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.android.common.views.crypto.CryptoRowView$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CryptoRowView.pendingBuySellDrawable_delegate$lambda$0(this.f$0);
            }
        });
        this.pendingBuyDrawable = LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.android.common.views.crypto.CryptoRowView$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CryptoRowView.pendingBuyDrawable_delegate$lambda$1(this.f$0);
            }
        });
        this.pendingSellDrawable = LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.android.common.views.crypto.CryptoRowView$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CryptoRowView.pendingSellDrawable_delegate$lambda$2(this.f$0);
            }
        });
        this.checkmarkDrawable = LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.android.common.views.crypto.CryptoRowView$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CryptoRowView.checkmarkDrawable_delegate$lambda$3(context);
            }
        });
        this.drawableTintColor = LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.android.common.views.crypto.CryptoRowView$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CryptoRowView.drawableTintColor_delegate$lambda$5(context, this);
            }
        });
        BaseInstrumentRowView.setTickerStyle$default(this, BaseInstrumentRowView.TickerStyle.FILLED, false, 2, null);
    }

    public final CryptoQuoteStore getCryptoQuoteStore() {
        CryptoQuoteStore cryptoQuoteStore = this.cryptoQuoteStore;
        if (cryptoQuoteStore != null) {
            return cryptoQuoteStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("cryptoQuoteStore");
        return null;
    }

    public final void setCryptoQuoteStore(CryptoQuoteStore cryptoQuoteStore) {
        Intrinsics.checkNotNullParameter(cryptoQuoteStore, "<set-?>");
        this.cryptoQuoteStore = cryptoQuoteStore;
    }

    public final CryptoHistoricalStore getCryptoHistoricalStore() {
        CryptoHistoricalStore cryptoHistoricalStore = this.cryptoHistoricalStore;
        if (cryptoHistoricalStore != null) {
            return cryptoHistoricalStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("cryptoHistoricalStore");
        return null;
    }

    public final void setCryptoHistoricalStore(CryptoHistoricalStore cryptoHistoricalStore) {
        Intrinsics.checkNotNullParameter(cryptoHistoricalStore, "<set-?>");
        this.cryptoHistoricalStore = cryptoHistoricalStore;
    }

    public final CurrencyPairStore getCurrencyPairStore() {
        CurrencyPairStore currencyPairStore = this.currencyPairStore;
        if (currencyPairStore != null) {
            return currencyPairStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("currencyPairStore");
        return null;
    }

    public final void setCurrencyPairStore(CurrencyPairStore currencyPairStore) {
        Intrinsics.checkNotNullParameter(currencyPairStore, "<set-?>");
        this.currencyPairStore = currencyPairStore;
    }

    public final TraderMarketHoursManager getMarketHoursManager() {
        TraderMarketHoursManager traderMarketHoursManager = this.marketHoursManager;
        if (traderMarketHoursManager != null) {
            return traderMarketHoursManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("marketHoursManager");
        return null;
    }

    public final void setMarketHoursManager(TraderMarketHoursManager traderMarketHoursManager) {
        Intrinsics.checkNotNullParameter(traderMarketHoursManager, "<set-?>");
        this.marketHoursManager = traderMarketHoursManager;
    }

    public final Data getData() {
        Data data = this.data;
        if (data != null) {
            return data;
        }
        Intrinsics.throwUninitializedPropertyAccessException(WebsocketGatewayConstants.DATA_KEY);
        return null;
    }

    public final void setData(Data data) {
        Intrinsics.checkNotNullParameter(data, "<set-?>");
        this.data = data;
    }

    public final Function0<Unit> getOnQuoteClick() {
        return this.onQuoteClick;
    }

    public final void setOnQuoteClick(Function0<Unit> function0) {
        this.onQuoteClick = function0;
        setOnPriceClick(function0);
    }

    public final SecurityViewMode getCustomViewMode() {
        Optional<SecurityViewMode> value = this.viewModeRelay.getValue();
        if (value != null) {
            return value.getOrNull();
        }
        return null;
    }

    public final void setCustomViewMode(SecurityViewMode securityViewMode) {
        this.viewModeRelay.accept(Optional3.asOptional(securityViewMode));
    }

    private final SecurityViewMode getViewMode() {
        SecurityViewMode customViewMode = getCustomViewMode();
        if (customViewMode != null) {
            return customViewMode;
        }
        String str = getViewModePreference().get();
        Intrinsics.checkNotNull(str);
        return SecurityViewMode.valueOf(str);
    }

    private final Drawable getPendingBuySellDrawable() {
        return (Drawable) this.pendingBuySellDrawable.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Drawable pendingBuySellDrawable_delegate$lambda$0(CryptoRowView cryptoRowView) {
        return ViewsKt.getDrawable(cryptoRowView, C11218R.drawable.svg_ic_watchlist_pending_buy_sell);
    }

    private final Drawable getPendingBuyDrawable() {
        return (Drawable) this.pendingBuyDrawable.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Drawable pendingBuyDrawable_delegate$lambda$1(CryptoRowView cryptoRowView) {
        return ViewsKt.getDrawable(cryptoRowView, C11218R.drawable.svg_ic_watchlist_pending_buy);
    }

    private final Drawable getPendingSellDrawable() {
        return (Drawable) this.pendingSellDrawable.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Drawable pendingSellDrawable_delegate$lambda$2(CryptoRowView cryptoRowView) {
        return ViewsKt.getDrawable(cryptoRowView, C11218R.drawable.svg_ic_watchlist_pending_sell);
    }

    private final Drawable getCheckmarkDrawable() {
        return (Drawable) this.checkmarkDrawable.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Drawable checkmarkDrawable_delegate$lambda$3(Context context) {
        return Contexts7.getThemeDrawable(context, C20690R.attr.iconCheckmark12dp);
    }

    private final Integer getDrawableTintColor() {
        return (Integer) this.drawableTintColor.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer drawableTintColor_delegate$lambda$5(Context context, CryptoRowView cryptoRowView) {
        Integer themeAttribute = ContextsUiExtensions.getThemeAttribute(context, R.attr.textColorSecondary);
        if (themeAttribute != null) {
            return Integer.valueOf(ViewsKt.getColor(cryptoRowView, themeAttribute.intValue()));
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ViewDisposerKt.bindTo$default(Contexts7.requireBaseActivityBaseContext(context).getDayNightStyleChanges(), this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.views.crypto.CryptoRowView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoRowView.onAttachedToWindow$lambda$6(this.f$0, (DayNightOverlay) obj);
            }
        });
        Observable observableSwitchMap = Observables.INSTANCE.combineLatest(this.currencyPairIdRelay, this.viewModeRelay).distinctUntilChanged().switchMap(new Function() { // from class: com.robinhood.android.common.views.crypto.CryptoRowView.onAttachedToWindow.2
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends CryptoQuote> apply(Tuples2<UUID, ? extends Optional<? extends SecurityViewMode>> tuples2) {
                Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
                UUID uuidComponent1 = tuples2.component1();
                Query<CryptoQuoteStore.CryptoQuoteArgs, CryptoQuote> streamCryptoQuote = CryptoRowView.this.getCryptoQuoteStore().getStreamCryptoQuote();
                Intrinsics.checkNotNull(uuidComponent1);
                return streamCryptoQuote.asObservable(new CryptoQuoteStore.CryptoQuoteArgs(uuidComponent1, null, null, 6, null));
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        ViewDisposerKt.bindTo$default(ObservablesAndroid.observeOnMainThread(observableSwitchMap), this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.views.crypto.CryptoRowView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoRowView.onAttachedToWindow$lambda$7(this.f$0, (CryptoQuote) obj);
            }
        });
        Observable<R> observableSwitchMap2 = this.currencyPairIdRelay.distinctUntilChanged().switchMap(new Function() { // from class: com.robinhood.android.common.views.crypto.CryptoRowView.onAttachedToWindow.4
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Object> apply(UUID id) {
                Intrinsics.checkNotNullParameter(id, "id");
                return Observable.merge(CryptoRowView.this.getCryptoHistoricalStore().poll(id, GraphSelection.TWENTY_FOUR_HOURS), CryptoRowView.this.getCryptoQuoteStore().getPollCryptoQuote().asObservable(new CryptoQuoteStore.CryptoQuoteArgs(id, null, null, 6, null)));
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap2, "switchMap(...)");
        ViewScopedObservable.subscribe$default(ViewDisposerKt.bindTo(ObservablesAndroid.observeOnMainThread(observableSwitchMap2), this, true), null, null, null, 7, null);
        Observable<R> observableSwitchMap3 = this.currencyPairIdRelay.distinctUntilChanged().switchMap(new Function() { // from class: com.robinhood.android.common.views.crypto.CryptoRowView.onAttachedToWindow.5
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends UiCryptoHistorical> apply(UUID it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return CryptoRowView.this.getCryptoHistoricalStore().streamCryptoHistorical(it, GraphSelection.TWENTY_FOUR_HOURS);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap3, "switchMap(...)");
        ViewDisposerKt.bindTo$default(ObservablesAndroid.observeOnMainThread(observableSwitchMap3), this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.views.crypto.CryptoRowView$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoRowView.onAttachedToWindow$lambda$8(this.f$0, (UiCryptoHistorical) obj);
            }
        });
        Observable<R> observableSwitchMap4 = this.currencyPairIdRelay.distinctUntilChanged().switchMap(new Function() { // from class: com.robinhood.android.common.views.crypto.CryptoRowView.onAttachedToWindow.7
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends UiCurrencyPair> apply(UUID it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return CryptoRowView.this.getCurrencyPairStore().streamCurrencyPair(it);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap4, "switchMap(...)");
        ViewDisposerKt.bindTo$default(ObservablesAndroid.observeOnMainThread(observableSwitchMap4), this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.views.crypto.CryptoRowView$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoRowView.onAttachedToWindow$lambda$9(this.f$0, (UiCurrencyPair) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$6(CryptoRowView cryptoRowView, DayNightOverlay overlay) {
        Intrinsics.checkNotNullParameter(overlay, "overlay");
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(cryptoRowView), overlay, null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$7(CryptoRowView cryptoRowView, CryptoQuote cryptoQuote) {
        cryptoRowView.cryptoQuote = cryptoQuote;
        cryptoRowView.refreshUi(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$8(CryptoRowView cryptoRowView, UiCryptoHistorical uiCryptoHistorical) {
        cryptoRowView.cryptoHistorical = uiCryptoHistorical;
        cryptoRowView.refreshUi(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$9(CryptoRowView cryptoRowView, UiCurrencyPair uiCurrencyPair) {
        cryptoRowView.uiCurrencyPair = uiCurrencyPair;
        cryptoRowView.refreshUi(false);
        return Unit.INSTANCE;
    }

    public final void bind(Data data, List<CryptoOrder> pendingOrders) {
        Intrinsics.checkNotNullParameter(data, "data");
        setData(data);
        this.pendingOrders = pendingOrders;
        this.cryptoQuote = null;
        this.cryptoHistorical = null;
        this.uiCurrencyPair = null;
        refreshUi(false);
        this.currencyPairIdRelay.accept(data.getCurrencyPairId());
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void refreshUi(boolean animateQuote) {
        String str;
        SecurityViewMode.FormatInfo formatInfo;
        Instant receivedAt;
        ThemedResourceReference<Integer> color_primary;
        Currency quoteCurrencyForPriceInput;
        UiCurrencyPair uiCurrencyPair;
        Currency quoteCurrencyForPriceInput2;
        boolean z;
        Iterator<T> it;
        boolean z2;
        Drawable pendingSellDrawable;
        Integer drawableTintColor;
        UiCryptoHolding cryptoHolding = getData().getCryptoHolding();
        BigDecimal quantity = cryptoHolding != null ? cryptoHolding.getQuantity() : null;
        getNameTxt().setText(getInvertNameAndSymbol() ? getData().getDisplayName() : getData().getDisplaySymbol());
        TextViewsKt.clearDrawables(getDetailTxt());
        if (quantity != null && !BigDecimals7.isZero(quantity)) {
            RhTextView detailTxt = getDetailTxt();
            UiCryptoHolding cryptoHolding2 = getData().getCryptoHolding();
            Intrinsics.checkNotNull(cryptoHolding2);
            detailTxt.setText(CurrencyDefinitions.formatCurrency$default(cryptoHolding2.getCurrency(), quantity, false, false, null, 0, null, null, false, false, false, false, 2044, null));
            if (getShowCheckMark()) {
                Integer drawableTintColor2 = getDrawableTintColor();
                if (drawableTintColor2 != null) {
                    int iIntValue = drawableTintColor2.intValue();
                    Drawable checkmarkDrawable = getCheckmarkDrawable();
                    if (checkmarkDrawable != null) {
                        checkmarkDrawable.setTint(iIntValue);
                    }
                }
                TextViewsKt.setDrawables$default((TextView) getDetailTxt(), getCheckmarkDrawable(), (Drawable) null, (Drawable) null, (Drawable) null, true, 14, (Object) null);
            }
        } else {
            getDetailTxt().setText(getInvertNameAndSymbol() ? getData().getDisplaySymbol() : getData().getDisplayName());
        }
        List<CryptoOrder> list = this.pendingOrders;
        if (getShowPendingStatus() && list != null && (!list.isEmpty())) {
            List<CryptoOrder> list2 = list;
            boolean z3 = list2 instanceof Collection;
            if (z3 && list2.isEmpty()) {
                z = false;
                if (z3) {
                    it = list2.iterator();
                    while (it.hasNext()) {
                    }
                    z2 = false;
                    if (z) {
                    }
                }
            } else {
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    if (((CryptoOrder) it2.next()).getSide() == OrderSide.BUY) {
                        z = true;
                        break;
                    }
                }
                z = false;
                if (z3 || !list2.isEmpty()) {
                    it = list2.iterator();
                    while (it.hasNext()) {
                        if (((CryptoOrder) it.next()).getSide() == OrderSide.SELL) {
                            z2 = true;
                            break;
                        }
                    }
                    z2 = false;
                    if (z && z2) {
                        pendingSellDrawable = getPendingBuySellDrawable();
                    } else if (!z) {
                        pendingSellDrawable = getPendingBuyDrawable();
                    } else {
                        pendingSellDrawable = getPendingSellDrawable();
                    }
                    Drawable drawable = pendingSellDrawable;
                    drawableTintColor = getDrawableTintColor();
                    if (drawableTintColor != null) {
                        drawable.setTint(drawableTintColor.intValue());
                    }
                    TextViewsKt.setDrawables$default((TextView) getDetailTxt(), (Drawable) null, (Drawable) null, drawable, (Drawable) null, true, 11, (Object) null);
                } else {
                    z2 = false;
                    if (z) {
                        if (!z) {
                        }
                        Drawable drawable2 = pendingSellDrawable;
                        drawableTintColor = getDrawableTintColor();
                        if (drawableTintColor != null) {
                        }
                        TextViewsKt.setDrawables$default((TextView) getDetailTxt(), (Drawable) null, (Drawable) null, drawable2, (Drawable) null, true, 11, (Object) null);
                    }
                }
            }
        }
        CryptoQuote cryptoQuote = this.cryptoQuote;
        String string2 = getContext().getString(C41827R.string.general_label_n_a);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        if (cryptoQuote != null) {
            if (WhenMappings.$EnumSwitchMapping$0[getViewMode().ordinal()] == 1) {
                UiCurrencyPair uiCurrencyPair2 = this.uiCurrencyPair;
                quoteCurrencyForPriceInput = uiCurrencyPair2 != null ? uiCurrencyPair2.getQuoteCurrency() : null;
                if (quoteCurrencyForPriceInput != null || (fallbackCryptoPriceFormat = CurrencyDefinitions.getCryptoFiatPriceFormatter(quoteCurrencyForPriceInput)) == null) {
                    NumberFormatter fallbackCryptoPriceFormat = Formats.getFallbackCryptoPriceFormat();
                }
                NumberFormatter numberFormatter = fallbackCryptoPriceFormat;
                uiCurrencyPair = this.uiCurrencyPair;
                if (uiCurrencyPair != null || (quoteCurrencyForPriceInput2 = uiCurrencyPair.getQuoteCurrencyForPriceInput()) == null || (fallbackCryptoPriceDeltaFormat = CurrencyDefinitions.getCryptoFiatPriceDeltaFormatter(quoteCurrencyForPriceInput2)) == null) {
                    NumberFormatter fallbackCryptoPriceDeltaFormat = Formats.getFallbackCryptoPriceDeltaFormat();
                }
                formatInfo = getViewMode().getFormatInfoForCrypto(cryptoQuote, this.cryptoHistorical, getData().getCryptoHolding(), numberFormatter, fallbackCryptoPriceDeltaFormat, string2);
                str = string2;
                if (formatInfo == null) {
                }
            } else {
                UiCurrencyPair uiCurrencyPair3 = this.uiCurrencyPair;
                if (uiCurrencyPair3 != null) {
                    quoteCurrencyForPriceInput = uiCurrencyPair3.getQuoteCurrencyForPriceInput();
                }
                if (quoteCurrencyForPriceInput != null) {
                    NumberFormatter fallbackCryptoPriceFormat2 = Formats.getFallbackCryptoPriceFormat();
                    NumberFormatter numberFormatter2 = fallbackCryptoPriceFormat2;
                    uiCurrencyPair = this.uiCurrencyPair;
                    if (uiCurrencyPair != null) {
                        NumberFormatter fallbackCryptoPriceDeltaFormat2 = Formats.getFallbackCryptoPriceDeltaFormat();
                        formatInfo = getViewMode().getFormatInfoForCrypto(cryptoQuote, this.cryptoHistorical, getData().getCryptoHolding(), numberFormatter2, fallbackCryptoPriceDeltaFormat2, string2);
                        str = string2;
                        if (formatInfo == null) {
                        }
                    }
                }
            }
            String strComponent1 = formatInfo.getFormattedDisplayAmount();
            ScarletOverlay scarletOverlayComponent2 = formatInfo.getDirectionOverlay();
            if (cryptoQuote == null) {
                boolean zIsStaleForUi = cryptoQuote.isStaleForUi();
                getGraphView().setStale(zIsStaleForUi);
                setPriceText(strComponent1, animateQuote);
                setPriceStale(zIsStaleForUi);
                if (zIsStaleForUi) {
                    color_primary = ThemeAttributes.INSTANCE.getCOLOR_FOREGROUND_3();
                } else {
                    color_primary = ThemeAttributes.INSTANCE.getCOLOR_PRIMARY();
                }
                ScarletManager2.overrideAttribute(getFilledPriceTxt(), R.attr.backgroundTint, color_primary);
                putPriceOverlay(scarletOverlayComponent2);
            } else {
                setPriceText(null, false);
            }
            UiCryptoHistorical uiCryptoHistorical = this.cryptoHistorical;
            if (!getShowGraphView() && uiCryptoHistorical != null) {
                CryptoQuote cryptoQuote2 = this.cryptoQuote;
                Money markPrice = cryptoQuote2 != null ? cryptoQuote2.getMarkPrice() : null;
                CryptoQuote cryptoQuote3 = this.cryptoQuote;
                if (cryptoQuote3 == null || (receivedAt = cryptoQuote3.getReceivedAt()) == null) {
                    receivedAt = Instant.EPOCH;
                }
                Instant instant = receivedAt;
                Intrinsics.checkNotNull(instant);
                GraphSelection graphSelection = GraphSelection.TWENTY_FOUR_HOURS;
                List dataPointsForDisplay$default = Historical.DefaultImpls.getDataPointsForDisplay$default(uiCryptoHistorical, markPrice, instant, graphSelection, null, null, 24, null);
                GraphData.Companion companion = GraphData.INSTANCE;
                MarketHours currentMarketHours = getMarketHoursManager().getCurrentMarketHours();
                Money previousClose = uiCryptoHistorical.getPreviousClose();
                getGraphView().setData(companion.fromAssetDataPoints(null, currentMarketHours, dataPointsForDisplay$default, previousClose != null ? Money3.getBigDecimalCompat(previousClose) : null, graphSelection, uiCryptoHistorical.getInterval(), uiCryptoHistorical.getCryptoHistorical().isStaleForUi(), (16256 & 128) != 0, (16256 & 256) != 0, (16256 & 512) != 0 ? false : false, (16256 & 1024) != 0 ? null : null, (16256 & 2048) != 0 ? false : false, (16256 & 4096) != 0 ? null : null, (16256 & 8192) != 0 ? false : false));
                ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(getGraphView()), BigDecimals7.isPositive(cryptoQuote != null ? cryptoQuote.getPercentChange() : null) ? DirectionOverlay.POSITIVE : DirectionOverlay.NEGATIVE, null, 2, null);
                return;
            }
            getGraphView().clear();
        }
        str = string2;
        formatInfo = new SecurityViewMode.FormatInfo(str, DirectionOverlay.POSITIVE);
        String strComponent12 = formatInfo.getFormattedDisplayAmount();
        ScarletOverlay scarletOverlayComponent22 = formatInfo.getDirectionOverlay();
        if (cryptoQuote == null) {
        }
        UiCryptoHistorical uiCryptoHistorical2 = this.cryptoHistorical;
        if (!getShowGraphView()) {
        }
        getGraphView().clear();
    }

    /* compiled from: CryptoRowView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/common/views/crypto/CryptoRowView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/common/views/crypto/CryptoRowView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-lib-instrument-row_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<CryptoRowView> {
        private final /* synthetic */ Inflater<CryptoRowView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public CryptoRowView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (CryptoRowView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C11218R.layout.include_row_watchlist_crypto);
        }
    }

    /* compiled from: CryptoRowView.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/common/views/crypto/CryptoRowView$Data;", "", "currencyPairId", "Ljava/util/UUID;", "displayName", "", "displaySymbol", "cryptoHolding", "Lcom/robinhood/models/crypto/ui/UiCryptoHolding;", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/crypto/ui/UiCryptoHolding;)V", "getCurrencyPairId", "()Ljava/util/UUID;", "getDisplayName", "()Ljava/lang/String;", "getDisplaySymbol", "getCryptoHolding", "()Lcom/robinhood/models/crypto/ui/UiCryptoHolding;", "feature-lib-instrument-row_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Data {
        public static final int $stable = 8;
        private final UiCryptoHolding cryptoHolding;
        private final UUID currencyPairId;
        private final String displayName;
        private final String displaySymbol;

        public Data(UUID currencyPairId, String displayName, String displaySymbol, UiCryptoHolding uiCryptoHolding) {
            Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
            Intrinsics.checkNotNullParameter(displayName, "displayName");
            Intrinsics.checkNotNullParameter(displaySymbol, "displaySymbol");
            this.currencyPairId = currencyPairId;
            this.displayName = displayName;
            this.displaySymbol = displaySymbol;
            this.cryptoHolding = uiCryptoHolding;
        }

        public /* synthetic */ Data(UUID uuid, String str, String str2, UiCryptoHolding uiCryptoHolding, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(uuid, str, str2, (i & 8) != 0 ? null : uiCryptoHolding);
        }

        public final UUID getCurrencyPairId() {
            return this.currencyPairId;
        }

        public final String getDisplayName() {
            return this.displayName;
        }

        public final String getDisplaySymbol() {
            return this.displaySymbol;
        }

        public final UiCryptoHolding getCryptoHolding() {
            return this.cryptoHolding;
        }
    }
}
