package com.robinhood.android.widget.p277ui;

import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Icon;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.contracts.CuratedListKey;
import com.robinhood.android.common.p088ui.daynight.NightModeManager;
import com.robinhood.android.common.p088ui.daynight.NightModeManager2;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.colorscheme.ColorSchemeManager;
import com.robinhood.android.futures.analytics.FuturesAnalyticsStrings;
import com.robinhood.android.futures.contracts.FuturesDetailFragmentKey;
import com.robinhood.android.home.contracts.WatchListIntentKey;
import com.robinhood.android.home.contracts.WatchListIntentKey2;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.models.futures.marketdata.p191db.FuturesClosePrices;
import com.robinhood.android.models.futures.marketdata.p191db.FuturesQuote;
import com.robinhood.android.models.futures.p189db.UiFuturesPosition;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.app.keys.data.InstrumentDetailSource;
import com.robinhood.android.options.contracts.OptionsDetailPageFragmentKey;
import com.robinhood.android.options.contracts.OptionsDetailPageLaunchMode;
import com.robinhood.android.options.optionsstring.common.OptionExtensions2;
import com.robinhood.android.regiongate.CryptoRegionGate;
import com.robinhood.android.regiongate.FuturesTradingRegionGate;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.widget.C31480R;
import com.robinhood.android.widget.p277ui.WatchlistViewsFactory;
import com.robinhood.android.widget.util.PortfolioWidgetInfo;
import com.robinhood.android.widget.util.PortfolioWidgetInfoPref;
import com.robinhood.hammer.android.application.ApplicationComponentManagerHolder;
import com.robinhood.librobinhood.data.store.AggregateOptionPositionStore;
import com.robinhood.librobinhood.data.store.AggregateOptionQuoteStore;
import com.robinhood.librobinhood.data.store.AggregateOptionStrategyQuoteStore;
import com.robinhood.librobinhood.data.store.CryptoHistoricalStore;
import com.robinhood.librobinhood.data.store.CryptoHoldingStore;
import com.robinhood.librobinhood.data.store.CryptoQuoteStore;
import com.robinhood.librobinhood.data.store.CurrencyPairStore;
import com.robinhood.librobinhood.data.store.InstrumentPositionStore;
import com.robinhood.librobinhood.data.store.OptionStrategyInfoStore;
import com.robinhood.librobinhood.data.store.QuoteStore;
import com.robinhood.models.Decimals3;
import com.robinhood.models.api.CuratedListObjectType;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.models.crypto.p314db.CryptoQuote;
import com.robinhood.models.crypto.p314db.Currency;
import com.robinhood.models.crypto.p315ui.UiCryptoHistorical;
import com.robinhood.models.crypto.p315ui.UiCryptoHolding;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.p320db.AggregateOptionPositionQuote;
import com.robinhood.models.p320db.AggregateOptionQuote;
import com.robinhood.models.p320db.AggregateOptionStrategyQuote;
import com.robinhood.models.p320db.CuratedList;
import com.robinhood.models.p320db.CuratedListItem;
import com.robinhood.models.p320db.CuratedListItems;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.p355ui.GraphSelection;
import com.robinhood.models.p355ui.InstrumentPosition;
import com.robinhood.models.p355ui.UiAggregateOptionPosition;
import com.robinhood.models.p355ui.UiAggregateOptionPositionSimple;
import com.robinhood.models.p355ui.UiOptionStrategyInfo;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.crypto.contracts.CryptoDetailSource;
import com.robinhood.shared.crypto.contracts.detail.CryptoDetailFragmentKey;
import com.robinhood.shared.formats.crypto.CurrencyDefinitions;
import com.robinhood.shared.store.lists.store.CuratedListItemsStore;
import com.robinhood.shared.store.lists.store.CuratedListStore;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.store.futures.FuturesPositionStore;
import com.robinhood.store.futures.marketdata.FuturesMarketDataStore;
import com.robinhood.store.futures.marketdata.FuturesQuoteStore;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.android.C41827R;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.money.Currencies;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: WatchlistViewsFactory.kt */
@Metadata(m3635d1 = {"\u0000\u0084\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0010ç\u0001è\u0001é\u0001ê\u0001ë\u0001ì\u0001í\u0001î\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\n\u0010\u009d\u0001\u001a\u00030\u009e\u0001H\u0016J\n\u0010\u009f\u0001\u001a\u00030\u009e\u0001H\u0016J\n\u0010 \u0001\u001a\u00030\u009e\u0001H\u0016J\t\u0010¡\u0001\u001a\u00020\u0005H\u0016J\u0015\u0010¢\u0001\u001a\u0005\u0018\u00010£\u00012\u0007\u0010¤\u0001\u001a\u00020\u0005H\u0016J\u0011\u0010¥\u0001\u001a\u00030\u009e\u0001H\u0082@¢\u0006\u0003\u0010¦\u0001J\u0011\u0010§\u0001\u001a\u00030¨\u0001H\u0082@¢\u0006\u0003\u0010¦\u0001J\u001b\u0010©\u0001\u001a\u00030ª\u00012\b\u0010«\u0001\u001a\u00030¨\u0001H\u0082@¢\u0006\u0003\u0010¬\u0001J\u001d\u0010\u00ad\u0001\u001a\u0005\u0018\u00010®\u00012\b\u0010«\u0001\u001a\u00030¨\u0001H\u0082@¢\u0006\u0003\u0010¬\u0001J\u001d\u0010¯\u0001\u001a\u0005\u0018\u00010°\u00012\b\u0010«\u0001\u001a\u00030¨\u0001H\u0082@¢\u0006\u0003\u0010¬\u0001J\u001b\u0010±\u0001\u001a\u00030²\u00012\b\u0010«\u0001\u001a\u00030¨\u0001H\u0082@¢\u0006\u0003\u0010¬\u0001J\u001c\u0010³\u0001\u001a\t\u0012\u0005\u0012\u00030´\u00010\t2\n\u0010µ\u0001\u001a\u0005\u0018\u00010®\u0001H\u0002J\u0017\u0010¶\u0001\u001a\t\u0012\u0005\u0012\u00030´\u00010\tH\u0082@¢\u0006\u0003\u0010¦\u0001J\u0017\u0010·\u0001\u001a\t\u0012\u0005\u0012\u00030´\u00010\tH\u0082@¢\u0006\u0003\u0010¦\u0001JG\u0010¸\u0001\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\u0010«\u0001\u001a\u00030¨\u00012\b\u0010¹\u0001\u001a\u00030ª\u00012\n\u0010µ\u0001\u001a\u0005\u0018\u00010®\u00012\n\u0010º\u0001\u001a\u0005\u0018\u00010°\u00012\n\u0010»\u0001\u001a\u0005\u0018\u00010²\u0001H\u0002JN\u0010¼\u0001\u001a\t\u0012\u0005\u0012\u00030´\u00010\t2\u000e\u0010½\u0001\u001a\t\u0012\u0005\u0012\u00030¾\u00010\t2\b\u0010¹\u0001\u001a\u00030ª\u00012\n\u0010µ\u0001\u001a\u0005\u0018\u00010®\u00012\n\u0010º\u0001\u001a\u0005\u0018\u00010°\u00012\n\u0010»\u0001\u001a\u0005\u0018\u00010²\u0001H\u0002J\u001f\u0010Ä\u0001\u001a\u00030À\u0001*\u00030¾\u00012\u000e\u0010Å\u0001\u001a\t\u0012\u0005\u0012\u00030Æ\u00010\tH\u0002J\u0014\u0010Ç\u0001\u001a\u00030£\u00012\b\u0010È\u0001\u001a\u00030É\u0001H\u0002J\n\u0010Ê\u0001\u001a\u00030£\u0001H\u0002J\u0014\u0010Ë\u0001\u001a\u00030£\u00012\b\u0010È\u0001\u001a\u00030´\u0001H\u0002J\f\u0010Ì\u0001\u001a\u0005\u0018\u00010£\u0001H\u0016J\t\u0010Í\u0001\u001a\u00020\u0005H\u0016J\u0013\u0010Î\u0001\u001a\u00030Ï\u00012\u0007\u0010¤\u0001\u001a\u00020\u0005H\u0016J\n\u0010Ð\u0001\u001a\u00030\u0096\u0001H\u0016J\u001e\u0010Ñ\u0001\u001a\u00030´\u00012\b\u0010Ò\u0001\u001a\u00030Ó\u00012\b\u0010¹\u0001\u001a\u00030ª\u0001H\u0002JT\u0010Ô\u0001\u001a\u00030´\u00012\b\u0010Õ\u0001\u001a\u00030Ö\u00012\n\u0010×\u0001\u001a\u0005\u0018\u00010Ø\u00012\u000e\u0010Ù\u0001\u001a\t\u0012\u0005\u0012\u00030Æ\u00010\t2\u0016\u0010Ú\u0001\u001a\u0011\u0012\u0005\u0012\u00030Æ\u0001\u0012\u0005\u0012\u00030Ü\u00010Û\u00012\n\u0010Ý\u0001\u001a\u0005\u0018\u00010Þ\u0001H\u0002J,\u0010ß\u0001\u001a\u00030´\u00012\b\u0010¤\u0001\u001a\u00030à\u00012\u0016\u0010Ú\u0001\u001a\u0011\u0012\u0005\u0012\u00030Æ\u0001\u0012\u0005\u0012\u00030á\u00010Û\u0001H\u0002JF\u0010â\u0001\u001a\u00030´\u00012\b\u0010¤\u0001\u001a\u00030ã\u00012\u0016\u0010Ú\u0001\u001a\u0011\u0012\u0005\u0012\u00030Æ\u0001\u0012\u0005\u0012\u00030ä\u00010Û\u00012\u0018\u0010å\u0001\u001a\u0013\u0012\u0005\u0012\u00030Æ\u0001\u0012\u0007\u0012\u0005\u0018\u00010æ\u00010Û\u0001H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0019\u001a\u00020\u001a8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010\u001f\u001a\u00020 8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001e\u0010%\u001a\u00020&8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001e\u0010+\u001a\u00020,8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001e\u00101\u001a\u0002028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001e\u00107\u001a\u0002088\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001e\u0010=\u001a\u00020>8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u001e\u0010C\u001a\u00020D8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u001e\u0010I\u001a\u00020J8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u001e\u0010O\u001a\u00020P8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u001e\u0010U\u001a\u00020V8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u001e\u0010[\u001a\u00020\\8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\u001e\u0010a\u001a\u00020b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\u001e\u0010g\u001a\u00020h8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\u001e\u0010m\u001a\u00020n8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR\u001e\u0010s\u001a\u00020t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR\u001e\u0010y\u001a\u00020z8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R#\u0010\u007f\u001a\u00030\u0080\u00018\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0000\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R$\u0010\u0085\u0001\u001a\u00030\u0086\u00018\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0000\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001\"\u0006\b\u0089\u0001\u0010\u008a\u0001R$\u0010\u008b\u0001\u001a\u00030\u008c\u00018\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0000\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001\"\u0006\b\u008f\u0001\u0010\u0090\u0001R\u000f\u0010\u0091\u0001\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000f\u0010\u0092\u0001\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000f\u0010\u0093\u0001\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000f\u0010\u0094\u0001\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0095\u0001\u001a\u00030\u0096\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0095\u0001\u0010\u0097\u0001R\u0017\u0010\u0098\u0001\u001a\u00020\u00058BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001R\u0017\u0010\u009b\u0001\u001a\u00020\u00058BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u009c\u0001\u0010\u009a\u0001R\u001d\u0010¿\u0001\u001a\u00030À\u0001*\u00030Á\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bÂ\u0001\u0010Ã\u0001¨\u0006ï\u0001"}, m3636d2 = {"Lcom/robinhood/android/widget/ui/WatchlistViewsFactory;", "Landroid/widget/RemoteViewsService$RemoteViewsFactory;", "context", "Landroid/content/Context;", "appWidgetId", "", "<init>", "(Landroid/content/Context;I)V", "viewModels", "", "Lcom/robinhood/android/widget/ui/WatchlistViewsFactory$ViewModel;", "widgetInfo", "Lcom/robinhood/android/widget/util/PortfolioWidgetInfo;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "getRegionGateProvider", "()Lcom/robinhood/android/regiongate/RegionGateProvider;", "setRegionGateProvider", "(Lcom/robinhood/android/regiongate/RegionGateProvider;)V", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "getAccountProvider", "()Lcom/robinhood/android/lib/account/AccountProvider;", "setAccountProvider", "(Lcom/robinhood/android/lib/account/AccountProvider;)V", "instrumentPositionStore", "Lcom/robinhood/librobinhood/data/store/InstrumentPositionStore;", "getInstrumentPositionStore", "()Lcom/robinhood/librobinhood/data/store/InstrumentPositionStore;", "setInstrumentPositionStore", "(Lcom/robinhood/librobinhood/data/store/InstrumentPositionStore;)V", "quoteStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "getQuoteStore", "()Lcom/robinhood/librobinhood/data/store/QuoteStore;", "setQuoteStore", "(Lcom/robinhood/librobinhood/data/store/QuoteStore;)V", "cryptoHoldingStore", "Lcom/robinhood/librobinhood/data/store/CryptoHoldingStore;", "getCryptoHoldingStore", "()Lcom/robinhood/librobinhood/data/store/CryptoHoldingStore;", "setCryptoHoldingStore", "(Lcom/robinhood/librobinhood/data/store/CryptoHoldingStore;)V", "cryptoHistoricalStore", "Lcom/robinhood/librobinhood/data/store/CryptoHistoricalStore;", "getCryptoHistoricalStore", "()Lcom/robinhood/librobinhood/data/store/CryptoHistoricalStore;", "setCryptoHistoricalStore", "(Lcom/robinhood/librobinhood/data/store/CryptoHistoricalStore;)V", "currencyPairStore", "Lcom/robinhood/librobinhood/data/store/CurrencyPairStore;", "getCurrencyPairStore", "()Lcom/robinhood/librobinhood/data/store/CurrencyPairStore;", "setCurrencyPairStore", "(Lcom/robinhood/librobinhood/data/store/CurrencyPairStore;)V", "cryptoQuoteStore", "Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore;", "getCryptoQuoteStore", "()Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore;", "setCryptoQuoteStore", "(Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore;)V", "aggregateOptionPositionStore", "Lcom/robinhood/librobinhood/data/store/AggregateOptionPositionStore;", "getAggregateOptionPositionStore", "()Lcom/robinhood/librobinhood/data/store/AggregateOptionPositionStore;", "setAggregateOptionPositionStore", "(Lcom/robinhood/librobinhood/data/store/AggregateOptionPositionStore;)V", "aggregateOptionQuoteStore", "Lcom/robinhood/librobinhood/data/store/AggregateOptionQuoteStore;", "getAggregateOptionQuoteStore", "()Lcom/robinhood/librobinhood/data/store/AggregateOptionQuoteStore;", "setAggregateOptionQuoteStore", "(Lcom/robinhood/librobinhood/data/store/AggregateOptionQuoteStore;)V", "aggregateOptionStrategyQuoteStore", "Lcom/robinhood/librobinhood/data/store/AggregateOptionStrategyQuoteStore;", "getAggregateOptionStrategyQuoteStore", "()Lcom/robinhood/librobinhood/data/store/AggregateOptionStrategyQuoteStore;", "setAggregateOptionStrategyQuoteStore", "(Lcom/robinhood/librobinhood/data/store/AggregateOptionStrategyQuoteStore;)V", "curatedListStore", "Lcom/robinhood/shared/store/lists/store/CuratedListStore;", "getCuratedListStore", "()Lcom/robinhood/shared/store/lists/store/CuratedListStore;", "setCuratedListStore", "(Lcom/robinhood/shared/store/lists/store/CuratedListStore;)V", "curatedListItemsStore", "Lcom/robinhood/shared/store/lists/store/CuratedListItemsStore;", "getCuratedListItemsStore", "()Lcom/robinhood/shared/store/lists/store/CuratedListItemsStore;", "setCuratedListItemsStore", "(Lcom/robinhood/shared/store/lists/store/CuratedListItemsStore;)V", "futuresPositionStore", "Lcom/robinhood/store/futures/FuturesPositionStore;", "getFuturesPositionStore", "()Lcom/robinhood/store/futures/FuturesPositionStore;", "setFuturesPositionStore", "(Lcom/robinhood/store/futures/FuturesPositionStore;)V", "futuresQuoteStore", "Lcom/robinhood/store/futures/marketdata/FuturesQuoteStore;", "getFuturesQuoteStore", "()Lcom/robinhood/store/futures/marketdata/FuturesQuoteStore;", "setFuturesQuoteStore", "(Lcom/robinhood/store/futures/marketdata/FuturesQuoteStore;)V", "futuresMarketDataStore", "Lcom/robinhood/store/futures/marketdata/FuturesMarketDataStore;", "getFuturesMarketDataStore", "()Lcom/robinhood/store/futures/marketdata/FuturesMarketDataStore;", "setFuturesMarketDataStore", "(Lcom/robinhood/store/futures/marketdata/FuturesMarketDataStore;)V", "optionStrategyInfoStore", "Lcom/robinhood/librobinhood/data/store/OptionStrategyInfoStore;", "getOptionStrategyInfoStore", "()Lcom/robinhood/librobinhood/data/store/OptionStrategyInfoStore;", "setOptionStrategyInfoStore", "(Lcom/robinhood/librobinhood/data/store/OptionStrategyInfoStore;)V", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "getUserStore", "()Lcom/robinhood/shared/store/user/UserStore;", "setUserStore", "(Lcom/robinhood/shared/store/user/UserStore;)V", "nightModeManager", "Lcom/robinhood/android/common/ui/daynight/NightModeManager;", "getNightModeManager", "()Lcom/robinhood/android/common/ui/daynight/NightModeManager;", "setNightModeManager", "(Lcom/robinhood/android/common/ui/daynight/NightModeManager;)V", "widgetPref", "Lcom/robinhood/android/widget/util/PortfolioWidgetInfoPref;", "getWidgetPref", "()Lcom/robinhood/android/widget/util/PortfolioWidgetInfoPref;", "setWidgetPref", "(Lcom/robinhood/android/widget/util/PortfolioWidgetInfoPref;)V", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "getNavigator", "()Lcom/robinhood/android/navigation/Navigator;", "setNavigator", "(Lcom/robinhood/android/navigation/Navigator;)V", "colorSchemeManager", "Lcom/robinhood/android/designsystem/colorscheme/ColorSchemeManager;", "getColorSchemeManager", "()Lcom/robinhood/android/designsystem/colorscheme/ColorSchemeManager;", "setColorSchemeManager", "(Lcom/robinhood/android/designsystem/colorscheme/ColorSchemeManager;)V", "dayTextColorPrimary", "dayTextColorSecondary", "nightTextColorPrimary", "nightTextColorSecondary", "isDay", "", "()Z", "textColorPrimary", "getTextColorPrimary", "()I", "textColorSecondary", "getTextColorSecondary", "onCreate", "", "onDestroy", "onDataSetChanged", "getCount", "getViewAt", "Landroid/widget/RemoteViews;", "position", "updateRemoteViews", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCuratedListData", "Lcom/robinhood/android/widget/ui/WatchlistViewsFactory$CuratedListData;", "getEquityData", "Lcom/robinhood/android/widget/ui/WatchlistViewsFactory$EquityData;", "curatedListData", "(Lcom/robinhood/android/widget/ui/WatchlistViewsFactory$CuratedListData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCryptoData", "Lcom/robinhood/android/widget/ui/WatchlistViewsFactory$CryptoData;", "getOptionWatchlistData", "Lcom/robinhood/android/widget/ui/WatchlistViewsFactory$OptionWatchlistData;", "getFuturesWatchlistData", "Lcom/robinhood/android/widget/ui/WatchlistViewsFactory$FuturesWatchlistData;", "createViewModelsForCrypto", "Lcom/robinhood/android/widget/ui/WatchlistViewsFactory$ViewModel$ItemViewModel;", "cryptoData", "createViewModelsForOptions", "createViewModelsForFutures", "createViewModelsForCuratedLists", "equityData", "optionWatchlistData", "futuresWatchlistData", "createViewModelsForCuratedListItems", "listItems", "Lcom/robinhood/models/db/CuratedListItem;", "intent", "Landroid/content/Intent;", "Lcom/robinhood/models/db/CuratedList;", "getIntent", "(Lcom/robinhood/models/db/CuratedList;)Landroid/content/Intent;", "createIntent", "ids", "Ljava/util/UUID;", "createHeaderRemoteViews", "viewModel", "Lcom/robinhood/android/widget/ui/WatchlistViewsFactory$ViewModel$HeaderViewModel;", "createHoldingsDividerRemoteViews", "createRemoteViews", "getLoadingView", "getViewTypeCount", "getItemId", "", "hasStableIds", "fromInstrumentPosition", "instrumentPosition", "Lcom/robinhood/models/ui/InstrumentPosition;", "fromCryptoHolding", "cryptoHolding", "Lcom/robinhood/models/crypto/ui/UiCryptoHolding;", "historical", "Lcom/robinhood/models/crypto/ui/UiCryptoHistorical;", "currencyPairIds", "quoteMap", "", "Lcom/robinhood/models/crypto/db/CryptoQuote;", "quoteCurrencyForPrice", "Lcom/robinhood/models/crypto/db/Currency;", "fromOptionPosition", "Lcom/robinhood/models/ui/UiAggregateOptionPositionSimple;", "Lcom/robinhood/models/db/AggregateOptionQuote;", "fromFuturesPosition", "Lcom/robinhood/android/models/futures/db/UiFuturesPosition;", "Lcom/robinhood/android/models/futures/marketdata/db/FuturesQuote;", "closesMap", "Lcom/robinhood/android/models/futures/marketdata/db/FuturesClosePrices;", "WatchlistViewsFactoryEntryPoint", "ViewModel", "EquityData", "CryptoData", "OptionWatchlistData", "FuturesWatchlistData", "CuratedListData", "CuratedListItemValuesHelper", "feature-widget_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class WatchlistViewsFactory implements RemoteViewsService.RemoteViewsFactory {
    public AccountProvider accountProvider;
    public AggregateOptionPositionStore aggregateOptionPositionStore;
    public AggregateOptionQuoteStore aggregateOptionQuoteStore;
    public AggregateOptionStrategyQuoteStore aggregateOptionStrategyQuoteStore;
    private final int appWidgetId;
    public ColorSchemeManager colorSchemeManager;
    private final Context context;
    public CryptoHistoricalStore cryptoHistoricalStore;
    public CryptoHoldingStore cryptoHoldingStore;
    public CryptoQuoteStore cryptoQuoteStore;
    public CuratedListItemsStore curatedListItemsStore;
    public CuratedListStore curatedListStore;
    public CurrencyPairStore currencyPairStore;
    private final int dayTextColorPrimary;
    private final int dayTextColorSecondary;
    public FuturesMarketDataStore futuresMarketDataStore;
    public FuturesPositionStore futuresPositionStore;
    public FuturesQuoteStore futuresQuoteStore;
    public InstrumentPositionStore instrumentPositionStore;
    public Navigator navigator;
    public NightModeManager nightModeManager;
    private final int nightTextColorPrimary;
    private final int nightTextColorSecondary;
    public OptionStrategyInfoStore optionStrategyInfoStore;
    public QuoteStore quoteStore;
    public RegionGateProvider regionGateProvider;
    public UserStore userStore;
    private List<? extends ViewModel> viewModels;
    private PortfolioWidgetInfo widgetInfo;
    public PortfolioWidgetInfoPref widgetPref;

    /* compiled from: WatchlistViewsFactory.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/widget/ui/WatchlistViewsFactory$WatchlistViewsFactoryEntryPoint;", "", "inject", "", "obj", "Lcom/robinhood/android/widget/ui/WatchlistViewsFactory;", "feature-widget_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes20.dex */
    public interface WatchlistViewsFactoryEntryPoint {
        void inject(WatchlistViewsFactory obj);
    }

    /* compiled from: WatchlistViewsFactory.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[NightModeManager2.values().length];
            try {
                iArr[NightModeManager2.DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NightModeManager2.NIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PortfolioWidgetInfo.DisplayedSecurity.values().length];
            try {
                iArr2[PortfolioWidgetInfo.DisplayedSecurity.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[PortfolioWidgetInfo.DisplayedSecurity.POSITIONS.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[CuratedListObjectType.values().length];
            try {
                iArr3[CuratedListObjectType.CURRENCY_PAIR.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[CuratedListObjectType.INSTRUMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[CuratedListObjectType.OPTION_STRATEGY.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[CuratedListObjectType.FUTURES_CONTRACT.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[CuratedListObjectType.CRYPTO_TOKENIZED_STOCKS.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[CuratedListObjectType.PERPETUALS_CONTRACT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[CuratedListObjectType.INDEX.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[CuratedListObjectType.UNKNOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[PortfolioWidgetInfo.ViewOption.values().length];
            try {
                iArr4[PortfolioWidgetInfo.ViewOption.QUOTE.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr4[PortfolioWidgetInfo.ViewOption.EQUITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[PortfolioWidgetInfo.ViewOption.CHANGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    /* compiled from: WatchlistViewsFactory.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.widget.ui.WatchlistViewsFactory", m3645f = "WatchlistViewsFactory.kt", m3646l = {451, 454, 460, 461}, m3647m = "createViewModelsForFutures")
    /* renamed from: com.robinhood.android.widget.ui.WatchlistViewsFactory$createViewModelsForFutures$1 */
    static final class C314871 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C314871(Continuation<? super C314871> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WatchlistViewsFactory.this.createViewModelsForFutures(this);
        }
    }

    /* compiled from: WatchlistViewsFactory.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.widget.ui.WatchlistViewsFactory", m3645f = "WatchlistViewsFactory.kt", m3646l = {429, 1024, 443}, m3647m = "createViewModelsForOptions")
    /* renamed from: com.robinhood.android.widget.ui.WatchlistViewsFactory$createViewModelsForOptions$1 */
    static final class C314881 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C314881(Continuation<? super C314881> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WatchlistViewsFactory.this.createViewModelsForOptions(this);
        }
    }

    /* compiled from: WatchlistViewsFactory.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.widget.ui.WatchlistViewsFactory", m3645f = "WatchlistViewsFactory.kt", m3646l = {316, 1024, 1029, 1034, 1040}, m3647m = "getCryptoData")
    /* renamed from: com.robinhood.android.widget.ui.WatchlistViewsFactory$getCryptoData$1 */
    static final class C314891 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        /* synthetic */ Object result;

        C314891(Continuation<? super C314891> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WatchlistViewsFactory.this.getCryptoData(null, this);
        }
    }

    /* compiled from: WatchlistViewsFactory.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.widget.ui.WatchlistViewsFactory", m3645f = "WatchlistViewsFactory.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SUCCESS_BRUSHSTROKE_VALUE, 1028}, m3647m = "getCuratedListData")
    /* renamed from: com.robinhood.android.widget.ui.WatchlistViewsFactory$getCuratedListData$1 */
    static final class C314901 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        C314901(Continuation<? super C314901> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WatchlistViewsFactory.this.getCuratedListData(this);
        }
    }

    /* compiled from: WatchlistViewsFactory.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.widget.ui.WatchlistViewsFactory", m3645f = "WatchlistViewsFactory.kt", m3646l = {1024, 1029}, m3647m = "getEquityData")
    /* renamed from: com.robinhood.android.widget.ui.WatchlistViewsFactory$getEquityData$1 */
    static final class C314921 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C314921(Continuation<? super C314921> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WatchlistViewsFactory.this.getEquityData(null, this);
        }
    }

    /* compiled from: WatchlistViewsFactory.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.widget.ui.WatchlistViewsFactory", m3645f = "WatchlistViewsFactory.kt", m3646l = {383, 395}, m3647m = "getFuturesWatchlistData")
    /* renamed from: com.robinhood.android.widget.ui.WatchlistViewsFactory$getFuturesWatchlistData$1 */
    static final class C314931 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C314931(Continuation<? super C314931> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WatchlistViewsFactory.this.getFuturesWatchlistData(null, this);
        }
    }

    /* compiled from: WatchlistViewsFactory.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.widget.ui.WatchlistViewsFactory", m3645f = "WatchlistViewsFactory.kt", m3646l = {359, 1040, 375}, m3647m = "getOptionWatchlistData")
    /* renamed from: com.robinhood.android.widget.ui.WatchlistViewsFactory$getOptionWatchlistData$1 */
    static final class C314941 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C314941(Continuation<? super C314941> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WatchlistViewsFactory.this.getOptionWatchlistData(null, this);
        }
    }

    /* compiled from: WatchlistViewsFactory.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.widget.ui.WatchlistViewsFactory", m3645f = "WatchlistViewsFactory.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_ARROW_RIGHT_DOWN_VALUE, EnumC7081g.SDK_ASSET_ICON_CANCEL_VALUE, 201, EnumC7081g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S2_VALUE, EnumC7081g.SDK_ASSET_ICON_CLIPBOARD_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_02_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE}, m3647m = "updateRemoteViews")
    /* renamed from: com.robinhood.android.widget.ui.WatchlistViewsFactory$updateRemoteViews$1 */
    static final class C314961 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        int label;
        /* synthetic */ Object result;

        C314961(Continuation<? super C314961> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WatchlistViewsFactory.this.updateRemoteViews(this);
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public long getItemId(int position) {
        return position;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public RemoteViews getLoadingView() {
        return null;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public int getViewTypeCount() {
        return 4;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public void onCreate() {
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public void onDestroy() {
    }

    public WatchlistViewsFactory(Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.appWidgetId = i;
        this.viewModels = CollectionsKt.emptyList();
        this.dayTextColorPrimary = context.getColor(C20690R.color.mobius_text_color_primary_day);
        this.dayTextColorSecondary = context.getColor(C20690R.color.mobius_text_color_secondary_day);
        this.nightTextColorPrimary = context.getColor(C20690R.color.mobius_text_color_primary_night);
        this.nightTextColorSecondary = context.getColor(C20690R.color.mobius_text_color_secondary_night);
    }

    public final RegionGateProvider getRegionGateProvider() {
        RegionGateProvider regionGateProvider = this.regionGateProvider;
        if (regionGateProvider != null) {
            return regionGateProvider;
        }
        Intrinsics.throwUninitializedPropertyAccessException("regionGateProvider");
        return null;
    }

    public final void setRegionGateProvider(RegionGateProvider regionGateProvider) {
        Intrinsics.checkNotNullParameter(regionGateProvider, "<set-?>");
        this.regionGateProvider = regionGateProvider;
    }

    public final AccountProvider getAccountProvider() {
        AccountProvider accountProvider = this.accountProvider;
        if (accountProvider != null) {
            return accountProvider;
        }
        Intrinsics.throwUninitializedPropertyAccessException("accountProvider");
        return null;
    }

    public final void setAccountProvider(AccountProvider accountProvider) {
        Intrinsics.checkNotNullParameter(accountProvider, "<set-?>");
        this.accountProvider = accountProvider;
    }

    public final InstrumentPositionStore getInstrumentPositionStore() {
        InstrumentPositionStore instrumentPositionStore = this.instrumentPositionStore;
        if (instrumentPositionStore != null) {
            return instrumentPositionStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("instrumentPositionStore");
        return null;
    }

    public final void setInstrumentPositionStore(InstrumentPositionStore instrumentPositionStore) {
        Intrinsics.checkNotNullParameter(instrumentPositionStore, "<set-?>");
        this.instrumentPositionStore = instrumentPositionStore;
    }

    public final QuoteStore getQuoteStore() {
        QuoteStore quoteStore = this.quoteStore;
        if (quoteStore != null) {
            return quoteStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("quoteStore");
        return null;
    }

    public final void setQuoteStore(QuoteStore quoteStore) {
        Intrinsics.checkNotNullParameter(quoteStore, "<set-?>");
        this.quoteStore = quoteStore;
    }

    public final CryptoHoldingStore getCryptoHoldingStore() {
        CryptoHoldingStore cryptoHoldingStore = this.cryptoHoldingStore;
        if (cryptoHoldingStore != null) {
            return cryptoHoldingStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("cryptoHoldingStore");
        return null;
    }

    public final void setCryptoHoldingStore(CryptoHoldingStore cryptoHoldingStore) {
        Intrinsics.checkNotNullParameter(cryptoHoldingStore, "<set-?>");
        this.cryptoHoldingStore = cryptoHoldingStore;
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

    public final AggregateOptionPositionStore getAggregateOptionPositionStore() {
        AggregateOptionPositionStore aggregateOptionPositionStore = this.aggregateOptionPositionStore;
        if (aggregateOptionPositionStore != null) {
            return aggregateOptionPositionStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aggregateOptionPositionStore");
        return null;
    }

    public final void setAggregateOptionPositionStore(AggregateOptionPositionStore aggregateOptionPositionStore) {
        Intrinsics.checkNotNullParameter(aggregateOptionPositionStore, "<set-?>");
        this.aggregateOptionPositionStore = aggregateOptionPositionStore;
    }

    public final AggregateOptionQuoteStore getAggregateOptionQuoteStore() {
        AggregateOptionQuoteStore aggregateOptionQuoteStore = this.aggregateOptionQuoteStore;
        if (aggregateOptionQuoteStore != null) {
            return aggregateOptionQuoteStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aggregateOptionQuoteStore");
        return null;
    }

    public final void setAggregateOptionQuoteStore(AggregateOptionQuoteStore aggregateOptionQuoteStore) {
        Intrinsics.checkNotNullParameter(aggregateOptionQuoteStore, "<set-?>");
        this.aggregateOptionQuoteStore = aggregateOptionQuoteStore;
    }

    public final AggregateOptionStrategyQuoteStore getAggregateOptionStrategyQuoteStore() {
        AggregateOptionStrategyQuoteStore aggregateOptionStrategyQuoteStore = this.aggregateOptionStrategyQuoteStore;
        if (aggregateOptionStrategyQuoteStore != null) {
            return aggregateOptionStrategyQuoteStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aggregateOptionStrategyQuoteStore");
        return null;
    }

    public final void setAggregateOptionStrategyQuoteStore(AggregateOptionStrategyQuoteStore aggregateOptionStrategyQuoteStore) {
        Intrinsics.checkNotNullParameter(aggregateOptionStrategyQuoteStore, "<set-?>");
        this.aggregateOptionStrategyQuoteStore = aggregateOptionStrategyQuoteStore;
    }

    public final CuratedListStore getCuratedListStore() {
        CuratedListStore curatedListStore = this.curatedListStore;
        if (curatedListStore != null) {
            return curatedListStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("curatedListStore");
        return null;
    }

    public final void setCuratedListStore(CuratedListStore curatedListStore) {
        Intrinsics.checkNotNullParameter(curatedListStore, "<set-?>");
        this.curatedListStore = curatedListStore;
    }

    public final CuratedListItemsStore getCuratedListItemsStore() {
        CuratedListItemsStore curatedListItemsStore = this.curatedListItemsStore;
        if (curatedListItemsStore != null) {
            return curatedListItemsStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("curatedListItemsStore");
        return null;
    }

    public final void setCuratedListItemsStore(CuratedListItemsStore curatedListItemsStore) {
        Intrinsics.checkNotNullParameter(curatedListItemsStore, "<set-?>");
        this.curatedListItemsStore = curatedListItemsStore;
    }

    public final FuturesPositionStore getFuturesPositionStore() {
        FuturesPositionStore futuresPositionStore = this.futuresPositionStore;
        if (futuresPositionStore != null) {
            return futuresPositionStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("futuresPositionStore");
        return null;
    }

    public final void setFuturesPositionStore(FuturesPositionStore futuresPositionStore) {
        Intrinsics.checkNotNullParameter(futuresPositionStore, "<set-?>");
        this.futuresPositionStore = futuresPositionStore;
    }

    public final FuturesQuoteStore getFuturesQuoteStore() {
        FuturesQuoteStore futuresQuoteStore = this.futuresQuoteStore;
        if (futuresQuoteStore != null) {
            return futuresQuoteStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("futuresQuoteStore");
        return null;
    }

    public final void setFuturesQuoteStore(FuturesQuoteStore futuresQuoteStore) {
        Intrinsics.checkNotNullParameter(futuresQuoteStore, "<set-?>");
        this.futuresQuoteStore = futuresQuoteStore;
    }

    public final FuturesMarketDataStore getFuturesMarketDataStore() {
        FuturesMarketDataStore futuresMarketDataStore = this.futuresMarketDataStore;
        if (futuresMarketDataStore != null) {
            return futuresMarketDataStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("futuresMarketDataStore");
        return null;
    }

    public final void setFuturesMarketDataStore(FuturesMarketDataStore futuresMarketDataStore) {
        Intrinsics.checkNotNullParameter(futuresMarketDataStore, "<set-?>");
        this.futuresMarketDataStore = futuresMarketDataStore;
    }

    public final OptionStrategyInfoStore getOptionStrategyInfoStore() {
        OptionStrategyInfoStore optionStrategyInfoStore = this.optionStrategyInfoStore;
        if (optionStrategyInfoStore != null) {
            return optionStrategyInfoStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("optionStrategyInfoStore");
        return null;
    }

    public final void setOptionStrategyInfoStore(OptionStrategyInfoStore optionStrategyInfoStore) {
        Intrinsics.checkNotNullParameter(optionStrategyInfoStore, "<set-?>");
        this.optionStrategyInfoStore = optionStrategyInfoStore;
    }

    public final UserStore getUserStore() {
        UserStore userStore = this.userStore;
        if (userStore != null) {
            return userStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userStore");
        return null;
    }

    public final void setUserStore(UserStore userStore) {
        Intrinsics.checkNotNullParameter(userStore, "<set-?>");
        this.userStore = userStore;
    }

    public final NightModeManager getNightModeManager() {
        NightModeManager nightModeManager = this.nightModeManager;
        if (nightModeManager != null) {
            return nightModeManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("nightModeManager");
        return null;
    }

    public final void setNightModeManager(NightModeManager nightModeManager) {
        Intrinsics.checkNotNullParameter(nightModeManager, "<set-?>");
        this.nightModeManager = nightModeManager;
    }

    public final PortfolioWidgetInfoPref getWidgetPref() {
        PortfolioWidgetInfoPref portfolioWidgetInfoPref = this.widgetPref;
        if (portfolioWidgetInfoPref != null) {
            return portfolioWidgetInfoPref;
        }
        Intrinsics.throwUninitializedPropertyAccessException("widgetPref");
        return null;
    }

    public final void setWidgetPref(PortfolioWidgetInfoPref portfolioWidgetInfoPref) {
        Intrinsics.checkNotNullParameter(portfolioWidgetInfoPref, "<set-?>");
        this.widgetPref = portfolioWidgetInfoPref;
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

    public final ColorSchemeManager getColorSchemeManager() {
        ColorSchemeManager colorSchemeManager = this.colorSchemeManager;
        if (colorSchemeManager != null) {
            return colorSchemeManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("colorSchemeManager");
        return null;
    }

    public final void setColorSchemeManager(ColorSchemeManager colorSchemeManager) {
        Intrinsics.checkNotNullParameter(colorSchemeManager, "<set-?>");
        this.colorSchemeManager = colorSchemeManager;
    }

    private final boolean isDay() {
        int i = WhenMappings.$EnumSwitchMapping$0[getNightModeManager().getDayNightMode().ordinal()];
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final int getTextColorPrimary() {
        return isDay() ? this.dayTextColorPrimary : this.nightTextColorPrimary;
    }

    private final int getTextColorSecondary() {
        return isDay() ? this.dayTextColorSecondary : this.nightTextColorSecondary;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public void onDataSetChanged() {
        ComponentCallbacks2 componentCallbacks2;
        Context context = this.context;
        if (context instanceof Application) {
            componentCallbacks2 = (Application) context;
        } else {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
            componentCallbacks2 = (Application) applicationContext;
        }
        ((WatchlistViewsFactoryEntryPoint) ((ApplicationComponentManagerHolder) componentCallbacks2).getComponentManager().get()).inject(this);
        if (((Optional) ObservablesKt.toOptionals(getUserStore().getUser()).blockingFirst(Optional2.INSTANCE)) == null) {
            return;
        }
        CrashReporter.INSTANCE.log("Loaded user");
        try {
            BuildersKt__BuildersKt.runBlocking$default(null, new C314951(null), 1, null);
        } catch (Exception e) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, e, false, null, 6, null);
        }
    }

    /* compiled from: WatchlistViewsFactory.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.widget.ui.WatchlistViewsFactory$onDataSetChanged$1", m3645f = "WatchlistViewsFactory.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.widget.ui.WatchlistViewsFactory$onDataSetChanged$1 */
    static final class C314951 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C314951(Continuation<? super C314951> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WatchlistViewsFactory.this.new C314951(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C314951) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                WatchlistViewsFactory watchlistViewsFactory = WatchlistViewsFactory.this;
                this.label = 1;
                if (watchlistViewsFactory.updateRemoteViews(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public int getCount() {
        return this.viewModels.size();
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public RemoteViews getViewAt(int position) {
        ViewModel viewModel = (ViewModel) CollectionsKt.getOrNull(this.viewModels, position);
        if (viewModel == null) {
            return null;
        }
        if (viewModel instanceof ViewModel.HeaderViewModel) {
            return createHeaderRemoteViews((ViewModel.HeaderViewModel) viewModel);
        }
        if (viewModel instanceof ViewModel.ItemViewModel) {
            return createRemoteViews((ViewModel.ItemViewModel) viewModel);
        }
        if (Intrinsics.areEqual(viewModel, ViewModel.HoldingsDividerViewModel.INSTANCE)) {
            return createHoldingsDividerRemoteViews();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0121 A[PHI: r1 r4 r7
      0x0121: PHI (r1v9 java.lang.Object) = (r1v8 java.lang.Object), (r1v1 java.lang.Object) binds: [B:24:0x011d, B:17:0x00d2] A[DONT_GENERATE, DONT_INLINE]
      0x0121: PHI (r4v8 com.robinhood.android.widget.ui.WatchlistViewsFactory$CuratedListData) = 
      (r4v5 com.robinhood.android.widget.ui.WatchlistViewsFactory$CuratedListData)
      (r4v10 com.robinhood.android.widget.ui.WatchlistViewsFactory$CuratedListData)
     binds: [B:24:0x011d, B:17:0x00d2] A[DONT_GENERATE, DONT_INLINE]
      0x0121: PHI (r7v3 com.robinhood.android.widget.util.PortfolioWidgetInfo) = 
      (r7v1 com.robinhood.android.widget.util.PortfolioWidgetInfo)
      (r7v6 com.robinhood.android.widget.util.PortfolioWidgetInfo)
     binds: [B:24:0x011d, B:17:0x00d2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x015c A[PHI: r1 r4 r7 r8 r9
      0x015c: PHI (r1v16 java.lang.Object) = (r1v15 java.lang.Object), (r1v1 java.lang.Object) binds: [B:31:0x0158, B:15:0x00a9] A[DONT_GENERATE, DONT_INLINE]
      0x015c: PHI (r4v15 com.robinhood.android.widget.ui.WatchlistViewsFactory$CryptoData) = 
      (r4v12 com.robinhood.android.widget.ui.WatchlistViewsFactory$CryptoData)
      (r4v17 com.robinhood.android.widget.ui.WatchlistViewsFactory$CryptoData)
     binds: [B:31:0x0158, B:15:0x00a9] A[DONT_GENERATE, DONT_INLINE]
      0x015c: PHI (r7v11 com.robinhood.android.widget.ui.WatchlistViewsFactory$EquityData) = 
      (r7v7 com.robinhood.android.widget.ui.WatchlistViewsFactory$EquityData)
      (r7v13 com.robinhood.android.widget.ui.WatchlistViewsFactory$EquityData)
     binds: [B:31:0x0158, B:15:0x00a9] A[DONT_GENERATE, DONT_INLINE]
      0x015c: PHI (r8v9 com.robinhood.android.widget.ui.WatchlistViewsFactory$CuratedListData) = 
      (r8v5 com.robinhood.android.widget.ui.WatchlistViewsFactory$CuratedListData)
      (r8v11 com.robinhood.android.widget.ui.WatchlistViewsFactory$CuratedListData)
     binds: [B:31:0x0158, B:15:0x00a9] A[DONT_GENERATE, DONT_INLINE]
      0x015c: PHI (r9v4 com.robinhood.android.widget.util.PortfolioWidgetInfo) = 
      (r9v2 com.robinhood.android.widget.util.PortfolioWidgetInfo)
      (r9v6 com.robinhood.android.widget.util.PortfolioWidgetInfo)
     binds: [B:31:0x0158, B:15:0x00a9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object updateRemoteViews(Continuation<? super Unit> continuation) {
        C314961 c314961;
        PortfolioWidgetInfo portfolioWidgetInfo;
        CuratedListData curatedListData;
        Object cryptoData;
        PortfolioWidgetInfo portfolioWidgetInfo2;
        EquityData equityData;
        CuratedListData curatedListData2;
        CryptoData cryptoData2;
        Object futuresWatchlistData;
        OptionWatchlistData optionWatchlistData;
        CryptoData cryptoData3;
        EquityData equityData2;
        CuratedListData curatedListData3;
        PortfolioWidgetInfo portfolioWidgetInfo3;
        FuturesWatchlistData futuresWatchlistData2;
        List<? extends ViewModel> arrayList;
        Intent intentCreateIntent$default;
        PortfolioWidgetInfo.DisplayedSecurity displayedCrypto;
        PortfolioWidgetInfo.DisplayedSecurity displayedSecurity;
        Object obj;
        WatchlistViewsFactory watchlistViewsFactory;
        Intent intent;
        List<? extends ViewModel> list;
        WatchlistViewsFactory watchlistViewsFactory2;
        List<? extends ViewModel> list2;
        FuturesWatchlistData futuresWatchlistData3;
        OptionWatchlistData optionWatchlistData2;
        CryptoData cryptoData4;
        EquityData equityData3;
        CuratedListData curatedListData4;
        Object obj2;
        WatchlistViewsFactory watchlistViewsFactory3;
        WatchlistViewsFactory watchlistViewsFactory4;
        PortfolioWidgetInfo portfolioWidgetInfo4;
        List list3;
        WatchlistViewsFactory watchlistViewsFactory5;
        List<? extends ViewModel> list4;
        List list5;
        WatchlistViewsFactory watchlistViewsFactory6 = this;
        if (continuation instanceof C314961) {
            c314961 = (C314961) continuation;
            int i = c314961.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c314961.label = i - Integer.MIN_VALUE;
            } else {
                c314961 = watchlistViewsFactory6.new C314961(continuation);
            }
        }
        Object equityData4 = c314961.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (c314961.label) {
            case 0:
                ResultKt.throwOnFailure(equityData4);
                PortfolioWidgetInfo portfolioWidgetInfo5 = watchlistViewsFactory6.getWidgetPref().get(watchlistViewsFactory6.appWidgetId);
                watchlistViewsFactory6.widgetInfo = portfolioWidgetInfo5;
                Intrinsics.checkNotNull(portfolioWidgetInfo5);
                c314961.L$0 = portfolioWidgetInfo5;
                c314961.label = 1;
                Object curatedListData5 = watchlistViewsFactory6.getCuratedListData(c314961);
                if (curatedListData5 != coroutine_suspended) {
                    portfolioWidgetInfo = portfolioWidgetInfo5;
                    equityData4 = curatedListData5;
                    curatedListData = (CuratedListData) equityData4;
                    CrashReporter.INSTANCE.log("Loaded curated list data");
                    c314961.L$0 = portfolioWidgetInfo;
                    c314961.L$1 = curatedListData;
                    c314961.label = 2;
                    equityData4 = watchlistViewsFactory6.getEquityData(curatedListData, c314961);
                    if (equityData4 != coroutine_suspended) {
                        EquityData equityData5 = (EquityData) equityData4;
                        CrashReporter.INSTANCE.log("Loaded equity data");
                        c314961.L$0 = portfolioWidgetInfo;
                        c314961.L$1 = curatedListData;
                        c314961.L$2 = equityData5;
                        c314961.label = 3;
                        cryptoData = watchlistViewsFactory6.getCryptoData(curatedListData, c314961);
                        if (cryptoData != coroutine_suspended) {
                            portfolioWidgetInfo2 = portfolioWidgetInfo;
                            equityData = equityData5;
                            equityData4 = cryptoData;
                            curatedListData2 = curatedListData;
                            cryptoData2 = (CryptoData) equityData4;
                            CrashReporter.INSTANCE.log("Loaded crypto data");
                            c314961.L$0 = portfolioWidgetInfo2;
                            c314961.L$1 = curatedListData2;
                            c314961.L$2 = equityData;
                            c314961.L$3 = cryptoData2;
                            c314961.label = 4;
                            equityData4 = watchlistViewsFactory6.getOptionWatchlistData(curatedListData2, c314961);
                            if (equityData4 != coroutine_suspended) {
                                OptionWatchlistData optionWatchlistData3 = (OptionWatchlistData) equityData4;
                                CrashReporter.INSTANCE.log("Loaded option watchlist data");
                                c314961.L$0 = portfolioWidgetInfo2;
                                c314961.L$1 = curatedListData2;
                                c314961.L$2 = equityData;
                                c314961.L$3 = cryptoData2;
                                c314961.L$4 = optionWatchlistData3;
                                c314961.label = 5;
                                futuresWatchlistData = watchlistViewsFactory6.getFuturesWatchlistData(curatedListData2, c314961);
                                if (futuresWatchlistData != coroutine_suspended) {
                                    optionWatchlistData = optionWatchlistData3;
                                    cryptoData3 = cryptoData2;
                                    equityData2 = equityData;
                                    curatedListData3 = curatedListData2;
                                    portfolioWidgetInfo3 = portfolioWidgetInfo2;
                                    equityData4 = futuresWatchlistData;
                                    futuresWatchlistData2 = (FuturesWatchlistData) equityData4;
                                    CrashReporter.INSTANCE.log("Loaded futures watchlist data");
                                    arrayList = new ArrayList<>();
                                    intentCreateIntent$default = Navigator.DefaultImpls.createIntent$default(watchlistViewsFactory6.getNavigator(), watchlistViewsFactory6.context, new WatchListIntentKey(WatchListIntentKey2.WATCHLIST), null, false, 12, null);
                                    displayedCrypto = portfolioWidgetInfo3.getDisplayedCrypto();
                                    displayedSecurity = PortfolioWidgetInfo.DisplayedSecurity.NONE;
                                    if (displayedCrypto == displayedSecurity) {
                                        List<ViewModel.ItemViewModel> listCreateViewModelsForCrypto = watchlistViewsFactory6.createViewModelsForCrypto(cryptoData3);
                                        if (listCreateViewModelsForCrypto.isEmpty()) {
                                            obj = coroutine_suspended;
                                        } else {
                                            obj = coroutine_suspended;
                                            String string2 = watchlistViewsFactory6.context.getString(C31480R.string.gated_crypto_widget_header_cryptocurrencies);
                                            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                                            arrayList.add(new ViewModel.HeaderViewModel(string2, false, intentCreateIntent$default));
                                            arrayList.addAll(listCreateViewModelsForCrypto);
                                        }
                                        if (portfolioWidgetInfo3.getDisplayedOption() != displayedSecurity) {
                                            c314961.L$0 = portfolioWidgetInfo3;
                                            c314961.L$1 = curatedListData3;
                                            c314961.L$2 = equityData2;
                                            c314961.L$3 = cryptoData3;
                                            c314961.L$4 = optionWatchlistData;
                                            c314961.L$5 = futuresWatchlistData2;
                                            c314961.L$6 = arrayList;
                                            c314961.L$7 = arrayList;
                                            c314961.L$8 = intentCreateIntent$default;
                                            c314961.L$9 = watchlistViewsFactory6;
                                            c314961.label = 6;
                                            equityData4 = watchlistViewsFactory6.createViewModelsForOptions(c314961);
                                            coroutine_suspended = obj;
                                            if (equityData4 != coroutine_suspended) {
                                                watchlistViewsFactory2 = watchlistViewsFactory6;
                                                list2 = arrayList;
                                                list3 = (List) equityData4;
                                                if (list3.isEmpty()) {
                                                    watchlistViewsFactory5 = watchlistViewsFactory2;
                                                    list4 = list2;
                                                    String string3 = watchlistViewsFactory6.context.getString(C31480R.string.gated_options_widget_header_options);
                                                    Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                                                    arrayList.add(new ViewModel.HeaderViewModel(string3, false, intentCreateIntent$default));
                                                    arrayList.addAll(list3);
                                                } else {
                                                    watchlistViewsFactory5 = watchlistViewsFactory2;
                                                    list4 = list2;
                                                }
                                                intent = intentCreateIntent$default;
                                                list = arrayList;
                                                watchlistViewsFactory = watchlistViewsFactory5;
                                                arrayList = list4;
                                                futuresWatchlistData3 = futuresWatchlistData2;
                                                optionWatchlistData2 = optionWatchlistData;
                                                cryptoData4 = cryptoData3;
                                                equityData3 = equityData2;
                                                curatedListData4 = curatedListData3;
                                                if (portfolioWidgetInfo3.getDisplayedEquity() != PortfolioWidgetInfo.DisplayedSecurity.NONE) {
                                                    List<InstrumentPosition> instrumentPositions = equityData3.getInstrumentPositions();
                                                    obj2 = coroutine_suspended;
                                                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(instrumentPositions, 10));
                                                    Iterator<T> it = instrumentPositions.iterator();
                                                    while (it.hasNext()) {
                                                        arrayList2.add(watchlistViewsFactory6.fromInstrumentPosition((InstrumentPosition) it.next(), equityData3));
                                                    }
                                                    if (!arrayList2.isEmpty()) {
                                                        String string4 = watchlistViewsFactory6.context.getString(C31480R.string.widget_header_stocks);
                                                        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                                                        list.add(new ViewModel.HeaderViewModel(string4, false, intent));
                                                        list.addAll(arrayList2);
                                                    }
                                                } else {
                                                    obj2 = coroutine_suspended;
                                                }
                                                if (portfolioWidgetInfo3.getDisplayedFutures() != PortfolioWidgetInfo.DisplayedSecurity.NONE) {
                                                    c314961.L$0 = portfolioWidgetInfo3;
                                                    c314961.L$1 = curatedListData4;
                                                    c314961.L$2 = equityData3;
                                                    c314961.L$3 = cryptoData4;
                                                    c314961.L$4 = optionWatchlistData2;
                                                    c314961.L$5 = futuresWatchlistData3;
                                                    c314961.L$6 = arrayList;
                                                    c314961.L$7 = list;
                                                    c314961.L$8 = intent;
                                                    c314961.L$9 = watchlistViewsFactory;
                                                    c314961.label = 7;
                                                    watchlistViewsFactory6 = this;
                                                    Object objCreateViewModelsForFutures = watchlistViewsFactory6.createViewModelsForFutures(c314961);
                                                    coroutine_suspended = obj2;
                                                    if (objCreateViewModelsForFutures != coroutine_suspended) {
                                                        watchlistViewsFactory4 = watchlistViewsFactory;
                                                        equityData4 = objCreateViewModelsForFutures;
                                                        portfolioWidgetInfo4 = portfolioWidgetInfo3;
                                                        list5 = (List) equityData4;
                                                        if (!list5.isEmpty()) {
                                                            String string5 = watchlistViewsFactory6.context.getString(C31480R.string.widget_header_futures);
                                                            Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                                                            list.add(new ViewModel.HeaderViewModel(string5, false, intent));
                                                            list.addAll(list5);
                                                        }
                                                        portfolioWidgetInfo3 = portfolioWidgetInfo4;
                                                        watchlistViewsFactory3 = watchlistViewsFactory4;
                                                    }
                                                } else {
                                                    watchlistViewsFactory6 = this;
                                                    watchlistViewsFactory3 = watchlistViewsFactory;
                                                }
                                            }
                                        } else {
                                            coroutine_suspended = obj;
                                            watchlistViewsFactory = watchlistViewsFactory6;
                                            intent = intentCreateIntent$default;
                                            list = arrayList;
                                            futuresWatchlistData3 = futuresWatchlistData2;
                                            optionWatchlistData2 = optionWatchlistData;
                                            cryptoData4 = cryptoData3;
                                            equityData3 = equityData2;
                                            curatedListData4 = curatedListData3;
                                            if (portfolioWidgetInfo3.getDisplayedEquity() != PortfolioWidgetInfo.DisplayedSecurity.NONE) {
                                            }
                                            if (portfolioWidgetInfo3.getDisplayedFutures() != PortfolioWidgetInfo.DisplayedSecurity.NONE) {
                                            }
                                        }
                                    }
                                    FuturesWatchlistData futuresWatchlistData4 = futuresWatchlistData3;
                                    OptionWatchlistData optionWatchlistData4 = optionWatchlistData2;
                                    CryptoData cryptoData5 = cryptoData4;
                                    EquityData equityData6 = equityData3;
                                    CuratedListData curatedListData6 = curatedListData4;
                                    if (portfolioWidgetInfo3.getShowCuratedLists()) {
                                        List<ViewModel> listCreateViewModelsForCuratedLists = watchlistViewsFactory6.createViewModelsForCuratedLists(curatedListData6, equityData6, cryptoData5, optionWatchlistData4, futuresWatchlistData4);
                                        if (!list.isEmpty() && !listCreateViewModelsForCuratedLists.isEmpty()) {
                                            list.add(ViewModel.HoldingsDividerViewModel.INSTANCE);
                                        }
                                        list.addAll(listCreateViewModelsForCuratedLists);
                                    }
                                    watchlistViewsFactory3.viewModels = arrayList;
                                    return Unit.INSTANCE;
                                }
                            }
                        }
                    }
                }
                return coroutine_suspended;
            case 1:
                PortfolioWidgetInfo portfolioWidgetInfo6 = (PortfolioWidgetInfo) c314961.L$0;
                ResultKt.throwOnFailure(equityData4);
                portfolioWidgetInfo = portfolioWidgetInfo6;
                curatedListData = (CuratedListData) equityData4;
                CrashReporter.INSTANCE.log("Loaded curated list data");
                c314961.L$0 = portfolioWidgetInfo;
                c314961.L$1 = curatedListData;
                c314961.label = 2;
                equityData4 = watchlistViewsFactory6.getEquityData(curatedListData, c314961);
                if (equityData4 != coroutine_suspended) {
                }
                return coroutine_suspended;
            case 2:
                curatedListData = (CuratedListData) c314961.L$1;
                portfolioWidgetInfo = (PortfolioWidgetInfo) c314961.L$0;
                ResultKt.throwOnFailure(equityData4);
                EquityData equityData52 = (EquityData) equityData4;
                CrashReporter.INSTANCE.log("Loaded equity data");
                c314961.L$0 = portfolioWidgetInfo;
                c314961.L$1 = curatedListData;
                c314961.L$2 = equityData52;
                c314961.label = 3;
                cryptoData = watchlistViewsFactory6.getCryptoData(curatedListData, c314961);
                if (cryptoData != coroutine_suspended) {
                }
                return coroutine_suspended;
            case 3:
                EquityData equityData7 = (EquityData) c314961.L$2;
                CuratedListData curatedListData7 = (CuratedListData) c314961.L$1;
                PortfolioWidgetInfo portfolioWidgetInfo7 = (PortfolioWidgetInfo) c314961.L$0;
                ResultKt.throwOnFailure(equityData4);
                portfolioWidgetInfo2 = portfolioWidgetInfo7;
                curatedListData2 = curatedListData7;
                equityData = equityData7;
                cryptoData2 = (CryptoData) equityData4;
                CrashReporter.INSTANCE.log("Loaded crypto data");
                c314961.L$0 = portfolioWidgetInfo2;
                c314961.L$1 = curatedListData2;
                c314961.L$2 = equityData;
                c314961.L$3 = cryptoData2;
                c314961.label = 4;
                equityData4 = watchlistViewsFactory6.getOptionWatchlistData(curatedListData2, c314961);
                if (equityData4 != coroutine_suspended) {
                }
                return coroutine_suspended;
            case 4:
                cryptoData2 = (CryptoData) c314961.L$3;
                equityData = (EquityData) c314961.L$2;
                curatedListData2 = (CuratedListData) c314961.L$1;
                portfolioWidgetInfo2 = (PortfolioWidgetInfo) c314961.L$0;
                ResultKt.throwOnFailure(equityData4);
                OptionWatchlistData optionWatchlistData32 = (OptionWatchlistData) equityData4;
                CrashReporter.INSTANCE.log("Loaded option watchlist data");
                c314961.L$0 = portfolioWidgetInfo2;
                c314961.L$1 = curatedListData2;
                c314961.L$2 = equityData;
                c314961.L$3 = cryptoData2;
                c314961.L$4 = optionWatchlistData32;
                c314961.label = 5;
                futuresWatchlistData = watchlistViewsFactory6.getFuturesWatchlistData(curatedListData2, c314961);
                if (futuresWatchlistData != coroutine_suspended) {
                }
                return coroutine_suspended;
            case 5:
                OptionWatchlistData optionWatchlistData5 = (OptionWatchlistData) c314961.L$4;
                CryptoData cryptoData6 = (CryptoData) c314961.L$3;
                EquityData equityData8 = (EquityData) c314961.L$2;
                CuratedListData curatedListData8 = (CuratedListData) c314961.L$1;
                PortfolioWidgetInfo portfolioWidgetInfo8 = (PortfolioWidgetInfo) c314961.L$0;
                ResultKt.throwOnFailure(equityData4);
                optionWatchlistData = optionWatchlistData5;
                cryptoData3 = cryptoData6;
                equityData2 = equityData8;
                curatedListData3 = curatedListData8;
                portfolioWidgetInfo3 = portfolioWidgetInfo8;
                futuresWatchlistData2 = (FuturesWatchlistData) equityData4;
                CrashReporter.INSTANCE.log("Loaded futures watchlist data");
                arrayList = new ArrayList<>();
                intentCreateIntent$default = Navigator.DefaultImpls.createIntent$default(watchlistViewsFactory6.getNavigator(), watchlistViewsFactory6.context, new WatchListIntentKey(WatchListIntentKey2.WATCHLIST), null, false, 12, null);
                displayedCrypto = portfolioWidgetInfo3.getDisplayedCrypto();
                displayedSecurity = PortfolioWidgetInfo.DisplayedSecurity.NONE;
                if (displayedCrypto == displayedSecurity) {
                }
                FuturesWatchlistData futuresWatchlistData42 = futuresWatchlistData3;
                OptionWatchlistData optionWatchlistData42 = optionWatchlistData2;
                CryptoData cryptoData52 = cryptoData4;
                EquityData equityData62 = equityData3;
                CuratedListData curatedListData62 = curatedListData4;
                if (portfolioWidgetInfo3.getShowCuratedLists()) {
                }
                watchlistViewsFactory3.viewModels = arrayList;
                return Unit.INSTANCE;
            case 6:
                watchlistViewsFactory2 = (WatchlistViewsFactory) c314961.L$9;
                intentCreateIntent$default = (Intent) c314961.L$8;
                arrayList = (List) c314961.L$7;
                list2 = (List) c314961.L$6;
                futuresWatchlistData2 = (FuturesWatchlistData) c314961.L$5;
                optionWatchlistData = (OptionWatchlistData) c314961.L$4;
                cryptoData3 = (CryptoData) c314961.L$3;
                equityData2 = (EquityData) c314961.L$2;
                curatedListData3 = (CuratedListData) c314961.L$1;
                portfolioWidgetInfo3 = (PortfolioWidgetInfo) c314961.L$0;
                ResultKt.throwOnFailure(equityData4);
                list3 = (List) equityData4;
                if (list3.isEmpty()) {
                }
                intent = intentCreateIntent$default;
                list = arrayList;
                watchlistViewsFactory = watchlistViewsFactory5;
                arrayList = list4;
                futuresWatchlistData3 = futuresWatchlistData2;
                optionWatchlistData2 = optionWatchlistData;
                cryptoData4 = cryptoData3;
                equityData3 = equityData2;
                curatedListData4 = curatedListData3;
                if (portfolioWidgetInfo3.getDisplayedEquity() != PortfolioWidgetInfo.DisplayedSecurity.NONE) {
                }
                if (portfolioWidgetInfo3.getDisplayedFutures() != PortfolioWidgetInfo.DisplayedSecurity.NONE) {
                }
                break;
            case 7:
                watchlistViewsFactory4 = (WatchlistViewsFactory) c314961.L$9;
                intent = (Intent) c314961.L$8;
                list = (List) c314961.L$7;
                arrayList = (List) c314961.L$6;
                futuresWatchlistData3 = (FuturesWatchlistData) c314961.L$5;
                optionWatchlistData2 = (OptionWatchlistData) c314961.L$4;
                cryptoData4 = (CryptoData) c314961.L$3;
                equityData3 = (EquityData) c314961.L$2;
                curatedListData4 = (CuratedListData) c314961.L$1;
                portfolioWidgetInfo4 = (PortfolioWidgetInfo) c314961.L$0;
                ResultKt.throwOnFailure(equityData4);
                list5 = (List) equityData4;
                if (!list5.isEmpty()) {
                }
                portfolioWidgetInfo3 = portfolioWidgetInfo4;
                watchlistViewsFactory3 = watchlistViewsFactory4;
                FuturesWatchlistData futuresWatchlistData422 = futuresWatchlistData3;
                OptionWatchlistData optionWatchlistData422 = optionWatchlistData2;
                CryptoData cryptoData522 = cryptoData4;
                EquityData equityData622 = equityData3;
                CuratedListData curatedListData622 = curatedListData4;
                if (portfolioWidgetInfo3.getShowCuratedLists()) {
                }
                watchlistViewsFactory3.viewModels = arrayList;
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0077, code lost:
    
        if (r9 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00d8 -> B:33:0x00d9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getCuratedListData(Continuation<? super CuratedListData> continuation) {
        C314901 c314901;
        List list;
        Map linkedHashMap;
        Iterator it;
        if (continuation instanceof C314901) {
            c314901 = (C314901) continuation;
            int i = c314901.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c314901.label = i - Integer.MIN_VALUE;
            } else {
                c314901 = new C314901(continuation);
            }
        }
        Object objFirstOrNull = c314901.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c314901.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFirstOrNull);
            PortfolioWidgetInfo portfolioWidgetInfo = this.widgetInfo;
            Intrinsics.checkNotNull(portfolioWidgetInfo);
            if (!portfolioWidgetInfo.getShowCuratedLists()) {
                return new CuratedListData(CollectionsKt.emptyList(), MapsKt.emptyMap());
            }
            Flow<List<CuratedList>> flowStreamFollowedCuratedListsInOrder = getCuratedListStore().streamFollowedCuratedListsInOrder();
            c314901.label = 1;
            objFirstOrNull = FlowKt.firstOrNull(flowStreamFollowedCuratedListsInOrder, c314901);
        } else if (i2 == 1) {
            ResultKt.throwOnFailure(objFirstOrNull);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            CuratedList curatedList = (CuratedList) c314901.L$4;
            linkedHashMap = (Map) c314901.L$3;
            it = (Iterator) c314901.L$2;
            Map map = (Map) c314901.L$1;
            list = (List) c314901.L$0;
            ResultKt.throwOnFailure(objFirstOrNull);
            Tuples2 tuples2M3642to = Tuples4.m3642to(curatedList.getId(), (List) objFirstOrNull);
            linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
            linkedHashMap = map;
            if (it.hasNext()) {
                curatedList = (CuratedList) it.next();
                ObservableSource map2 = getCuratedListItemsStore().streamCuratedListItemsOptional(curatedList.getId()).map(new Function() { // from class: com.robinhood.android.widget.ui.WatchlistViewsFactory$getCuratedListData$curatedListItemsMap$1$curatedListItems$1
                    @Override // io.reactivex.functions.Function
                    public final List<CuratedListItem> apply(Optional<CuratedListItems> optional) {
                        List<CuratedListItem> listItems;
                        Intrinsics.checkNotNullParameter(optional, "<destruct>");
                        CuratedListItems curatedListItemsComponent1 = optional.component1();
                        return (curatedListItemsComponent1 == null || (listItems = curatedListItemsComponent1.getListItems()) == null) ? CollectionsKt.emptyList() : listItems;
                    }
                });
                Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
                c314901.L$0 = list;
                c314901.L$1 = linkedHashMap;
                c314901.L$2 = it;
                c314901.L$3 = linkedHashMap;
                c314901.L$4 = curatedList;
                c314901.label = 2;
                objFirstOrNull = RxAwait3.awaitFirst(map2, c314901);
                if (objFirstOrNull != coroutine_suspended) {
                    map = linkedHashMap;
                    Tuples2 tuples2M3642to2 = Tuples4.m3642to(curatedList.getId(), (List) objFirstOrNull);
                    linkedHashMap.put(tuples2M3642to2.getFirst(), tuples2M3642to2.getSecond());
                    linkedHashMap = map;
                    if (it.hasNext()) {
                        return new CuratedListData(list, linkedHashMap);
                    }
                }
                return coroutine_suspended;
            }
        }
        List listEmptyList = (List) objFirstOrNull;
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        List list2 = listEmptyList;
        list = listEmptyList;
        linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list2, 10)), 16));
        it = list2.iterator();
        if (it.hasNext()) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getEquityData(CuratedListData curatedListData, Continuation<? super EquityData> continuation) {
        C314921 c314921;
        Observable<List<InstrumentPosition>> observableJust;
        List listEmptyList;
        List list;
        Map mapEmptyMap;
        Map mapEmptyMap2;
        if (continuation instanceof C314921) {
            c314921 = (C314921) continuation;
            int i = c314921.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c314921.label = i - Integer.MIN_VALUE;
            } else {
                c314921 = new C314921(continuation);
            }
        }
        Object objAwaitFirstOrNull = c314921.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c314921.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objAwaitFirstOrNull);
            PortfolioWidgetInfo portfolioWidgetInfo = this.widgetInfo;
            Intrinsics.checkNotNull(portfolioWidgetInfo);
            int i3 = WhenMappings.$EnumSwitchMapping$1[portfolioWidgetInfo.getDisplayedEquity().ordinal()];
            if (i3 == 1) {
                observableJust = Observable.just(CollectionsKt.emptyList());
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                getInstrumentPositionStore().refreshIndividualAccountHoldingInstrumentPositions(false);
                observableJust = getInstrumentPositionStore().getIndividualAccountHoldingInstrumentPositions().take(1L);
            }
            Intrinsics.checkNotNull(observableJust);
            c314921.L$0 = curatedListData;
            c314921.label = 1;
            objAwaitFirstOrNull = RxAwait3.awaitFirstOrNull(observableJust, c314921);
            if (objAwaitFirstOrNull != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) c314921.L$0;
            ResultKt.throwOnFailure(objAwaitFirstOrNull);
            mapEmptyMap2 = (Map) objAwaitFirstOrNull;
            if (mapEmptyMap2 == null) {
                mapEmptyMap2 = MapsKt.emptyMap();
            }
            Map map = mapEmptyMap2;
            listEmptyList = list;
            mapEmptyMap = map;
            return new EquityData(listEmptyList, mapEmptyMap);
        }
        curatedListData = (CuratedListData) c314921.L$0;
        ResultKt.throwOnFailure(objAwaitFirstOrNull);
        listEmptyList = (List) objAwaitFirstOrNull;
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        List list2 = listEmptyList;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((InstrumentPosition) it.next()).getInstrument().getId());
        }
        List listDistinct = CollectionsKt.distinct(CollectionsKt.plus((Collection) arrayList, (Iterable) curatedListData.getCuratedListItemIds(CuratedListObjectType.INSTRUMENT)));
        if (listDistinct.isEmpty()) {
            mapEmptyMap = MapsKt.emptyMap();
            return new EquityData(listEmptyList, mapEmptyMap);
        }
        getQuoteStore().getGetQuotes().refreshAllPages(listDistinct, true);
        ObservableSource map2 = getQuoteStore().getStreamAllQuotes().asObservable(listDistinct).take(1L).map(new Function() { // from class: com.robinhood.android.widget.ui.WatchlistViewsFactory$getEquityData$instrumentQuoteMap$1
            @Override // io.reactivex.functions.Function
            public final Map<UUID, Quote> apply(List<Quote> quotes) {
                Intrinsics.checkNotNullParameter(quotes, "quotes");
                List<Quote> list3 = quotes;
                LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list3, 10)), 16));
                for (T t : list3) {
                    linkedHashMap.put(((Quote) t).getInstrumentId(), t);
                }
                return linkedHashMap;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        c314921.L$0 = listEmptyList;
        c314921.label = 2;
        Object objAwaitFirstOrNull2 = RxAwait3.awaitFirstOrNull(map2, c314921);
        if (objAwaitFirstOrNull2 != coroutine_suspended) {
            List list3 = listEmptyList;
            objAwaitFirstOrNull = objAwaitFirstOrNull2;
            list = list3;
            mapEmptyMap2 = (Map) objAwaitFirstOrNull;
            if (mapEmptyMap2 == null) {
            }
            Map map3 = mapEmptyMap2;
            listEmptyList = list;
            mapEmptyMap = map3;
            return new EquityData(listEmptyList, mapEmptyMap);
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x015e, code lost:
    
        if (r0 != r1) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x011b A[LOOP:0: B:38:0x0115->B:40:0x011b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x01c9 -> B:54:0x01cd). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x023f -> B:62:0x0244). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getCryptoData(CuratedListData curatedListData, Continuation<? super CryptoData> continuation) {
        C314891 c314891;
        WatchlistViewsFactory watchlistViewsFactory;
        int i;
        CuratedListData curatedListData2;
        int i2;
        Object regionGateState$default;
        CuratedListData curatedListData3;
        List listEmptyList;
        List list;
        Iterator it;
        List<UUID> listDistinct;
        Iterator it2;
        Map map;
        List list2;
        Map map2;
        List<UUID> list3;
        Iterator it3;
        Map map3;
        List list4;
        Map map4;
        Map map5;
        if (continuation instanceof C314891) {
            c314891 = (C314891) continuation;
            int i3 = c314891.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c314891.label = i3 - Integer.MIN_VALUE;
                watchlistViewsFactory = this;
            } else {
                watchlistViewsFactory = this;
                c314891 = watchlistViewsFactory.new C314891(continuation);
            }
        }
        C314891 c3148912 = c314891;
        Object objAwaitFirstOrNull = c3148912.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = c3148912.label;
        if (i4 == 0) {
            ResultKt.throwOnFailure(objAwaitFirstOrNull);
            RegionGateProvider regionGateProvider = watchlistViewsFactory.getRegionGateProvider();
            i = 2;
            CryptoRegionGate cryptoRegionGate = CryptoRegionGate.INSTANCE;
            curatedListData2 = curatedListData;
            c3148912.L$0 = curatedListData2;
            c3148912.label = 1;
            i2 = 10;
            regionGateState$default = RegionGateProvider.DefaultImpls.getRegionGateState$default(regionGateProvider, cryptoRegionGate, false, c3148912, 2, null);
            if (regionGateState$default != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i4 == 1) {
            CuratedListData curatedListData4 = (CuratedListData) c3148912.L$0;
            ResultKt.throwOnFailure(objAwaitFirstOrNull);
            curatedListData2 = curatedListData4;
            i2 = 10;
            regionGateState$default = objAwaitFirstOrNull;
            i = 2;
        } else if (i4 == 2) {
            curatedListData3 = (CuratedListData) c3148912.L$0;
            ResultKt.throwOnFailure(objAwaitFirstOrNull);
            i2 = 10;
            listEmptyList = (List) objAwaitFirstOrNull;
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            list = listEmptyList;
            List list5 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list5, i2));
            it = list5.iterator();
            while (it.hasNext()) {
                arrayList.add(((UiCryptoHolding) it.next()).getCurrencyPairId());
            }
            listDistinct = CollectionsKt.distinct(CollectionsKt.plus((Collection) arrayList, (Iterable) curatedListData3.getCuratedListItemIds(CuratedListObjectType.CURRENCY_PAIR)));
            ObservableSource map6 = watchlistViewsFactory.getCryptoQuoteStore().getStreamCryptoQuotes().asObservable(listDistinct).take(1L).map(new Function() { // from class: com.robinhood.android.widget.ui.WatchlistViewsFactory$getCryptoData$cryptoQuoteMap$1
                @Override // io.reactivex.functions.Function
                public final Map<UUID, CryptoQuote> apply(List<CryptoQuote> quotes) {
                    Intrinsics.checkNotNullParameter(quotes, "quotes");
                    List<CryptoQuote> list6 = quotes;
                    LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list6, 10)), 16));
                    for (T t : list6) {
                        linkedHashMap.put(((CryptoQuote) t).getId(), t);
                    }
                    return linkedHashMap;
                }
            });
            Intrinsics.checkNotNullExpressionValue(map6, "map(...)");
            c3148912.L$0 = list;
            c3148912.L$1 = listDistinct;
            c3148912.label = 3;
            objAwaitFirstOrNull = RxAwait3.awaitFirstOrNull(map6, c3148912);
        } else if (i4 == 3) {
            listDistinct = (List) c3148912.L$1;
            list = (List) c3148912.L$0;
            ResultKt.throwOnFailure(objAwaitFirstOrNull);
            i2 = 10;
            Map mapEmptyMap = (Map) objAwaitFirstOrNull;
            if (mapEmptyMap == null) {
                mapEmptyMap = MapsKt.emptyMap();
            }
            List<UUID> list6 = listDistinct;
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list6, i2)), 16));
            it2 = list6.iterator();
            map = mapEmptyMap;
            list2 = list;
            map2 = linkedHashMap;
            list3 = listDistinct;
            if (it2.hasNext()) {
            }
        } else if (i4 == 4) {
            Object next = c3148912.L$6;
            map2 = (Map) c3148912.L$5;
            Iterator it4 = (Iterator) c3148912.L$4;
            LinkedHashMap linkedHashMap2 = (LinkedHashMap) c3148912.L$3;
            map = (Map) c3148912.L$2;
            List<UUID> list7 = (List) c3148912.L$1;
            list2 = (List) c3148912.L$0;
            ResultKt.throwOnFailure(objAwaitFirstOrNull);
            List<UUID> list8 = list7;
            C314891 c3148913 = c3148912;
            Iterator it5 = it4;
            Map map7 = linkedHashMap2;
            map2.put(next, (UiCryptoHistorical) objAwaitFirstOrNull);
            map2 = map7;
            it2 = it5;
            c3148912 = c3148913;
            list3 = list8;
            if (it2.hasNext()) {
                next = it2.next();
                UUID uuid = (UUID) next;
                CryptoHistoricalStore cryptoHistoricalStore = watchlistViewsFactory.getCryptoHistoricalStore();
                GraphSelection graphSelection = GraphSelection.TWENTY_FOUR_HOURS;
                cryptoHistoricalStore.refresh(false, uuid, graphSelection);
                Observable<UiCryptoHistorical> observableTake = watchlistViewsFactory.getCryptoHistoricalStore().streamCryptoHistorical(uuid, graphSelection).take(1L);
                Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
                c3148912.L$0 = list2;
                c3148912.L$1 = list3;
                c3148912.L$2 = map;
                c3148912.L$3 = map2;
                c3148912.L$4 = it2;
                c3148912.L$5 = map2;
                c3148912.L$6 = next;
                c3148912.label = 4;
                objAwaitFirstOrNull = RxAwait3.awaitFirstOrNull(observableTake, c3148912);
                if (objAwaitFirstOrNull != coroutine_suspended) {
                    list8 = list3;
                    c3148913 = c3148912;
                    it5 = it2;
                    map7 = map2;
                    map2.put(next, (UiCryptoHistorical) objAwaitFirstOrNull);
                    map2 = map7;
                    it2 = it5;
                    c3148912 = c3148913;
                    list3 = list8;
                    if (it2.hasNext()) {
                        List<UUID> list9 = list3;
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list9, 10)), 16));
                        it3 = list9.iterator();
                        map3 = map2;
                        list4 = list2;
                        map4 = map;
                        map5 = linkedHashMap3;
                        if (it3.hasNext()) {
                        }
                    }
                }
                return coroutine_suspended;
            }
        } else {
            if (i4 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object next2 = c3148912.L$6;
            map5 = (Map) c3148912.L$5;
            Iterator it6 = (Iterator) c3148912.L$4;
            LinkedHashMap linkedHashMap4 = (LinkedHashMap) c3148912.L$3;
            Map map8 = (Map) c3148912.L$2;
            Map map9 = (Map) c3148912.L$1;
            list4 = (List) c3148912.L$0;
            ResultKt.throwOnFailure(objAwaitFirstOrNull);
            Iterator it7 = it6;
            Map map10 = linkedHashMap4;
            Map map11 = map9;
            Map map12 = map8;
            C314891 c3148914 = c3148912;
            map5.put(next2, (Currency) objAwaitFirstOrNull);
            map5 = map10;
            it3 = it7;
            c3148912 = c3148914;
            map3 = map12;
            map4 = map11;
            if (it3.hasNext()) {
                next2 = it3.next();
                UUID uuid2 = (UUID) next2;
                watchlistViewsFactory.getCurrencyPairStore().refresh(false, uuid2);
                ObservableSource map13 = watchlistViewsFactory.getCurrencyPairStore().streamCurrencyPair(uuid2).take(1L).map(new Function() { // from class: com.robinhood.android.widget.ui.WatchlistViewsFactory$getCryptoData$quoteCurrencyForPriceMap$1$1
                    @Override // io.reactivex.functions.Function
                    public final Currency apply(UiCurrencyPair it8) {
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return it8.getQuoteCurrencyForPriceInput();
                    }
                });
                Intrinsics.checkNotNullExpressionValue(map13, "map(...)");
                c3148912.L$0 = list4;
                c3148912.L$1 = map4;
                c3148912.L$2 = map3;
                c3148912.L$3 = map5;
                c3148912.L$4 = it3;
                c3148912.L$5 = map5;
                c3148912.L$6 = next2;
                c3148912.label = 5;
                objAwaitFirstOrNull = RxAwait3.awaitFirstOrNull(map13, c3148912);
                if (objAwaitFirstOrNull != coroutine_suspended) {
                    map11 = map4;
                    map12 = map3;
                    c3148914 = c3148912;
                    it7 = it3;
                    map10 = map5;
                    map5.put(next2, (Currency) objAwaitFirstOrNull);
                    map5 = map10;
                    it3 = it7;
                    c3148912 = c3148914;
                    map3 = map12;
                    map4 = map11;
                    if (it3.hasNext()) {
                        return new CryptoData(list4, map4, map3, map5);
                    }
                }
                return coroutine_suspended;
            }
        }
        if (!((Boolean) regionGateState$default).booleanValue()) {
            return null;
        }
        Observable<List<UiCryptoHolding>> observableTake2 = watchlistViewsFactory.getCryptoHoldingStore().streamCryptoHoldings().take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake2, "take(...)");
        c3148912.L$0 = curatedListData2;
        c3148912.label = i;
        objAwaitFirstOrNull = RxAwait3.awaitFirstOrNull(observableTake2, c3148912);
        if (objAwaitFirstOrNull != coroutine_suspended) {
            curatedListData3 = curatedListData2;
            listEmptyList = (List) objAwaitFirstOrNull;
            if (listEmptyList == null) {
            }
            list = listEmptyList;
            List list52 = list;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list52, i2));
            it = list52.iterator();
            while (it.hasNext()) {
            }
            listDistinct = CollectionsKt.distinct(CollectionsKt.plus((Collection) arrayList2, (Iterable) curatedListData3.getCuratedListItemIds(CuratedListObjectType.CURRENCY_PAIR)));
            ObservableSource map62 = watchlistViewsFactory.getCryptoQuoteStore().getStreamCryptoQuotes().asObservable(listDistinct).take(1L).map(new Function() { // from class: com.robinhood.android.widget.ui.WatchlistViewsFactory$getCryptoData$cryptoQuoteMap$1
                @Override // io.reactivex.functions.Function
                public final Map<UUID, CryptoQuote> apply(List<CryptoQuote> quotes) {
                    Intrinsics.checkNotNullParameter(quotes, "quotes");
                    List<CryptoQuote> list62 = quotes;
                    LinkedHashMap linkedHashMap5 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list62, 10)), 16));
                    for (T t : list62) {
                        linkedHashMap5.put(((CryptoQuote) t).getId(), t);
                    }
                    return linkedHashMap5;
                }
            });
            Intrinsics.checkNotNullExpressionValue(map62, "map(...)");
            c3148912.L$0 = list;
            c3148912.L$1 = listDistinct;
            c3148912.label = 3;
            objAwaitFirstOrNull = RxAwait3.awaitFirstOrNull(map62, c3148912);
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x011e, code lost:
    
        if (r14 != r0) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f9 A[LOOP:1: B:44:0x00f3->B:46:0x00f9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getOptionWatchlistData(CuratedListData curatedListData, Continuation<? super OptionWatchlistData> continuation) {
        C314941 c314941;
        List<String> arrayList;
        List listEmptyList;
        Iterator it;
        if (continuation instanceof C314941) {
            c314941 = (C314941) continuation;
            int i = c314941.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c314941.label = i - Integer.MIN_VALUE;
            } else {
                c314941 = new C314941(continuation);
            }
        }
        C314941 c3149412 = c314941;
        Object regionGateState$default = c3149412.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3149412.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(regionGateState$default);
            RegionGateProvider regionGateProvider = getRegionGateProvider();
            OptionsRegionGate optionsRegionGate = OptionsRegionGate.INSTANCE;
            c3149412.L$0 = curatedListData;
            c3149412.label = 1;
            regionGateState$default = RegionGateProvider.DefaultImpls.getRegionGateState$default(regionGateProvider, optionsRegionGate, false, c3149412, 2, null);
            if (regionGateState$default != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 == 1) {
            curatedListData = (CuratedListData) c3149412.L$0;
            ResultKt.throwOnFailure(regionGateState$default);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(regionGateState$default);
                List listEmptyList2 = (List) regionGateState$default;
                if (listEmptyList2 == null) {
                    listEmptyList2 = CollectionsKt.emptyList();
                }
                List list = listEmptyList2;
                LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
                for (Object obj : list) {
                    linkedHashMap.put(((AggregateOptionStrategyQuote) obj).getStrategyCode(), obj);
                }
                return new OptionWatchlistData(linkedHashMap);
            }
            arrayList = (List) c3149412.L$0;
            ResultKt.throwOnFailure(regionGateState$default);
            listEmptyList = (List) regionGateState$default;
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            List list2 = listEmptyList;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            it = list2.iterator();
            while (it.hasNext()) {
                arrayList2.add(((UiOptionStrategyInfo) it.next()).getOptionStrategyInfo());
            }
            AggregateOptionStrategyQuoteStore.refreshQuotes$default(getAggregateOptionStrategyQuoteStore(), arrayList2, false, 2, null);
            Flow<List<AggregateOptionStrategyQuote>> flowStreamQuotes = getAggregateOptionStrategyQuoteStore().streamQuotes(arrayList);
            c3149412.L$0 = null;
            c3149412.label = 3;
            regionGateState$default = FlowKt.firstOrNull(flowStreamQuotes, c3149412);
        }
        if (!((Boolean) regionGateState$default).booleanValue()) {
            return null;
        }
        List listFlatten = CollectionsKt.flatten(curatedListData.getCuratedListItemsMap().values());
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listFlatten) {
            if (((CuratedListItem) obj2).getObjectType() == CuratedListObjectType.OPTION_STRATEGY) {
                arrayList3.add(obj2);
            }
        }
        arrayList = new ArrayList<>();
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            String strategyCode = ((CuratedListItem) it2.next()).getStrategyCode();
            if (strategyCode != null) {
                arrayList.add(strategyCode);
            }
        }
        OptionStrategyInfoStore.refresh$default(getOptionStrategyInfoStore(), arrayList, false, 2, null);
        Observable<List<UiOptionStrategyInfo>> observableStreamUiStrategyInfo = getOptionStrategyInfoStore().streamUiStrategyInfo(arrayList);
        c3149412.L$0 = arrayList;
        c3149412.label = 2;
        regionGateState$default = RxAwait3.awaitFirstOrNull(observableStreamUiStrategyInfo, c3149412);
        if (regionGateState$default != coroutine_suspended) {
            listEmptyList = (List) regionGateState$default;
            if (listEmptyList == null) {
            }
            List list22 = listEmptyList;
            ArrayList arrayList22 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list22, 10));
            it = list22.iterator();
            while (it.hasNext()) {
            }
            AggregateOptionStrategyQuoteStore.refreshQuotes$default(getAggregateOptionStrategyQuoteStore(), arrayList22, false, 2, null);
            Flow<List<AggregateOptionStrategyQuote>> flowStreamQuotes2 = getAggregateOptionStrategyQuoteStore().streamQuotes(arrayList);
            c3149412.L$0 = null;
            c3149412.label = 3;
            regionGateState$default = FlowKt.firstOrNull(flowStreamQuotes2, c3149412);
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getFuturesWatchlistData(CuratedListData curatedListData, Continuation<? super FuturesWatchlistData> continuation) {
        C314931 c314931;
        Map map;
        Map mapEmptyMap;
        if (continuation instanceof C314931) {
            c314931 = (C314931) continuation;
            int i = c314931.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c314931.label = i - Integer.MIN_VALUE;
            } else {
                c314931 = new C314931(continuation);
            }
        }
        Object objFirst = c314931.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c314931.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFirst);
            Flow<List<UiFuturesPosition>> flowStreamAllPositions = getFuturesPositionStore().streamAllPositions();
            c314931.L$0 = curatedListData;
            c314931.label = 1;
            objFirst = FlowKt.first(flowStreamAllPositions, c314931);
            if (objFirst != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            map = (Map) c314931.L$0;
            ResultKt.throwOnFailure(objFirst);
            mapEmptyMap = (Map) objFirst;
            if (mapEmptyMap == null) {
                mapEmptyMap = MapsKt.emptyMap();
            }
            return new FuturesWatchlistData(mapEmptyMap, map);
        }
        curatedListData = (CuratedListData) c314931.L$0;
        ResultKt.throwOnFailure(objFirst);
        Iterable iterable = (Iterable) objFirst;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(iterable, 10)), 16));
        for (Object obj : iterable) {
            linkedHashMap.put(((UiFuturesPosition) obj).getContractId(), obj);
        }
        if (linkedHashMap.isEmpty()) {
            return new FuturesWatchlistData(MapsKt.emptyMap(), MapsKt.emptyMap());
        }
        List listFlatten = CollectionsKt.flatten(curatedListData.getCuratedListItemsMap().values());
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : listFlatten) {
            if (((CuratedListItem) obj2).getObjectType() == CuratedListObjectType.FUTURES_CONTRACT) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((CuratedListItem) it.next()).getId());
        }
        Flow quotes$default = FuturesQuoteStore.getQuotes$default(getFuturesQuoteStore(), arrayList2, null, 2, null);
        c314931.L$0 = linkedHashMap;
        c314931.label = 2;
        objFirst = FlowKt.firstOrNull(quotes$default, c314931);
        if (objFirst != coroutine_suspended) {
            map = linkedHashMap;
            mapEmptyMap = (Map) objFirst;
            if (mapEmptyMap == null) {
            }
            return new FuturesWatchlistData(mapEmptyMap, map);
        }
        return coroutine_suspended;
    }

    private final List<ViewModel.ItemViewModel> createViewModelsForCrypto(CryptoData cryptoData) {
        if (cryptoData == null) {
            return CollectionsKt.emptyList();
        }
        PortfolioWidgetInfo portfolioWidgetInfo = this.widgetInfo;
        Intrinsics.checkNotNull(portfolioWidgetInfo);
        PortfolioWidgetInfo.DisplayedSecurity displayedCrypto = portfolioWidgetInfo.getDisplayedCrypto();
        List<UiCryptoHolding> holdings = cryptoData.getHoldings();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(holdings, 10));
        Iterator<T> it = holdings.iterator();
        while (it.hasNext()) {
            arrayList.add(((UiCryptoHolding) it.next()).getCurrencyPairId());
        }
        ArrayList arrayList2 = new ArrayList();
        if (displayedCrypto == PortfolioWidgetInfo.DisplayedSecurity.POSITIONS) {
            for (UiCryptoHolding uiCryptoHolding : cryptoData.getHoldings()) {
                arrayList2.add(fromCryptoHolding(uiCryptoHolding, cryptoData.getHistoricalMap().get(uiCryptoHolding.getCurrencyPairId()), arrayList, cryptoData.getQuoteMap(), cryptoData.getQuoteCurrencyForPriceMap().get(uiCryptoHolding.getCurrencyPairId())));
            }
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d4 A[LOOP:0: B:40:0x00ce->B:42:0x00d4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createViewModelsForOptions(Continuation<? super List<ViewModel.ItemViewModel>> continuation) {
        C314881 c314881;
        List<? extends UiAggregateOptionPosition> listEmptyList;
        Object objFirstOrNull;
        List<? extends UiAggregateOptionPosition> list;
        Map<UUID, ? extends AggregateOptionQuote> mapEmptyMap;
        Iterator<T> it;
        if (continuation instanceof C314881) {
            c314881 = (C314881) continuation;
            int i = c314881.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c314881.label = i - Integer.MIN_VALUE;
            } else {
                c314881 = new C314881(continuation);
            }
        }
        C314881 c3148812 = c314881;
        Object regionGateState$default = c3148812.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3148812.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(regionGateState$default);
            RegionGateProvider regionGateProvider = getRegionGateProvider();
            OptionsRegionGate optionsRegionGate = OptionsRegionGate.INSTANCE;
            c3148812.label = 1;
            regionGateState$default = RegionGateProvider.DefaultImpls.getRegionGateState$default(regionGateProvider, optionsRegionGate, false, c3148812, 2, null);
            if (regionGateState$default != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) c3148812.L$0;
                ResultKt.throwOnFailure(regionGateState$default);
                mapEmptyMap = (Map) regionGateState$default;
                if (mapEmptyMap == null) {
                    mapEmptyMap = MapsKt.emptyMap();
                }
                List<? extends UiAggregateOptionPosition> list2 = list;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(fromOptionPosition((UiAggregateOptionPositionSimple) it.next(), mapEmptyMap));
                }
                return arrayList;
            }
            ResultKt.throwOnFailure(regionGateState$default);
            listEmptyList = (List) regionGateState$default;
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            AggregateOptionQuoteStore.refreshQuotes$default(getAggregateOptionQuoteStore(), listEmptyList, false, 2, null);
            Flow<Map<UUID, AggregateOptionPositionQuote>> flowStreamMap = getAggregateOptionQuoteStore().streamMap(listEmptyList);
            c3148812.L$0 = listEmptyList;
            c3148812.label = 3;
            objFirstOrNull = FlowKt.firstOrNull(flowStreamMap, c3148812);
            if (objFirstOrNull != coroutine_suspended) {
                list = listEmptyList;
                regionGateState$default = objFirstOrNull;
                mapEmptyMap = (Map) regionGateState$default;
                if (mapEmptyMap == null) {
                }
                List<? extends UiAggregateOptionPosition> list22 = list;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list22, 10));
                it = list22.iterator();
                while (it.hasNext()) {
                }
                return arrayList2;
            }
            return coroutine_suspended;
        }
        ResultKt.throwOnFailure(regionGateState$default);
        if (!((Boolean) regionGateState$default).booleanValue()) {
            return CollectionsKt.emptyList();
        }
        AggregateOptionPositionStore.refreshWithAllAccounts$default(getAggregateOptionPositionStore(), false, null, 2, null);
        ObservableSource observableSourceSwitchMap = getAccountProvider().streamIndividualAccountNumber().switchMap(new Function() { // from class: com.robinhood.android.widget.ui.WatchlistViewsFactory$createViewModelsForOptions$positions$1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends List<UiAggregateOptionPositionSimple>> apply(String accountNumber) {
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                return AggregateOptionPositionStore.streamUiAggregateOptionPositionsSimple$default(this.this$0.getAggregateOptionPositionStore(), accountNumber, null, 2, null);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSourceSwitchMap, "switchMap(...)");
        c3148812.label = 2;
        regionGateState$default = RxAwait3.awaitFirstOrNull(observableSourceSwitchMap, c3148812);
        if (regionGateState$default != coroutine_suspended) {
            listEmptyList = (List) regionGateState$default;
            if (listEmptyList == null) {
            }
            AggregateOptionQuoteStore.refreshQuotes$default(getAggregateOptionQuoteStore(), listEmptyList, false, 2, null);
            Flow<Map<UUID, AggregateOptionPositionQuote>> flowStreamMap2 = getAggregateOptionQuoteStore().streamMap(listEmptyList);
            c3148812.L$0 = listEmptyList;
            c3148812.label = 3;
            objFirstOrNull = FlowKt.firstOrNull(flowStreamMap2, c3148812);
            if (objFirstOrNull != coroutine_suspended) {
            }
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x016f A[LOOP:2: B:66:0x0169->B:68:0x016f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createViewModelsForFutures(Continuation<? super List<ViewModel.ItemViewModel>> continuation) {
        C314871 c314871;
        List list;
        List<UUID> listDistinct;
        List list2;
        Map<UUID, FuturesQuote> mapEmptyMap;
        Object objFirstOrNull;
        Map<UUID, FuturesQuote> map;
        Iterator it;
        FuturesClosePrices futuresClosePrices;
        Object next;
        if (continuation instanceof C314871) {
            c314871 = (C314871) continuation;
            int i = c314871.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c314871.label = i - Integer.MIN_VALUE;
            } else {
                c314871 = new C314871(continuation);
            }
        }
        C314871 c3148712 = c314871;
        Object regionGateState$default = c3148712.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3148712.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(regionGateState$default);
            RegionGateProvider regionGateProvider = getRegionGateProvider();
            FuturesTradingRegionGate futuresTradingRegionGate = FuturesTradingRegionGate.INSTANCE;
            c3148712.label = 1;
            regionGateState$default = RegionGateProvider.DefaultImpls.getRegionGateState$default(regionGateProvider, futuresTradingRegionGate, false, c3148712, 2, null);
            if (regionGateState$default != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ResultKt.throwOnFailure(regionGateState$default);
                list = (List) regionGateState$default;
                if (!list.isEmpty()) {
                    return CollectionsKt.emptyList();
                }
                List list3 = list;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((UiFuturesPosition) it2.next()).getContractId());
                }
                listDistinct = CollectionsKt.distinct(arrayList);
                Flow quotes$default = FuturesQuoteStore.getQuotes$default(getFuturesQuoteStore(), listDistinct, null, 2, null);
                c3148712.L$0 = list;
                c3148712.L$1 = listDistinct;
                c3148712.label = 3;
                Object objFirstOrNull2 = FlowKt.firstOrNull(quotes$default, c3148712);
                if (objFirstOrNull2 != coroutine_suspended) {
                    list2 = list;
                    regionGateState$default = objFirstOrNull2;
                    mapEmptyMap = (Map) regionGateState$default;
                    if (mapEmptyMap == null) {
                    }
                    Flow<List<FuturesClosePrices>> multipleClosePrices = getFuturesMarketDataStore().getMultipleClosePrices(listDistinct);
                    c3148712.L$0 = list2;
                    c3148712.L$1 = listDistinct;
                    c3148712.L$2 = mapEmptyMap;
                    c3148712.label = 4;
                    objFirstOrNull = FlowKt.firstOrNull(multipleClosePrices, c3148712);
                    if (objFirstOrNull != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }
            if (i2 == 3) {
                listDistinct = (List) c3148712.L$1;
                list2 = (List) c3148712.L$0;
                ResultKt.throwOnFailure(regionGateState$default);
                mapEmptyMap = (Map) regionGateState$default;
                if (mapEmptyMap == null) {
                    mapEmptyMap = MapsKt.emptyMap();
                }
                Flow<List<FuturesClosePrices>> multipleClosePrices2 = getFuturesMarketDataStore().getMultipleClosePrices(listDistinct);
                c3148712.L$0 = list2;
                c3148712.L$1 = listDistinct;
                c3148712.L$2 = mapEmptyMap;
                c3148712.label = 4;
                objFirstOrNull = FlowKt.firstOrNull(multipleClosePrices2, c3148712);
                if (objFirstOrNull != coroutine_suspended) {
                    map = mapEmptyMap;
                    regionGateState$default = objFirstOrNull;
                    List list4 = (List) regionGateState$default;
                    List<UUID> list5 = listDistinct;
                    LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list5, 10)), 16));
                    while (r1.hasNext()) {
                    }
                    List list6 = list2;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list6, 10));
                    it = list6.iterator();
                    while (it.hasNext()) {
                    }
                    return arrayList2;
                }
                return coroutine_suspended;
            }
            if (i2 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            map = (Map) c3148712.L$2;
            listDistinct = (List) c3148712.L$1;
            list2 = (List) c3148712.L$0;
            ResultKt.throwOnFailure(regionGateState$default);
            List list42 = (List) regionGateState$default;
            List<UUID> list52 = listDistinct;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list52, 10)), 16));
            for (Object obj : list52) {
                UUID uuid = (UUID) obj;
                if (list42 != null) {
                    Iterator it3 = list42.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it3.next();
                        if (Intrinsics.areEqual(((FuturesClosePrices) next).getContractId(), uuid)) {
                            break;
                        }
                    }
                    futuresClosePrices = (FuturesClosePrices) next;
                } else {
                    futuresClosePrices = null;
                }
                linkedHashMap2.put(obj, futuresClosePrices);
            }
            List list62 = list2;
            ArrayList arrayList22 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list62, 10));
            it = list62.iterator();
            while (it.hasNext()) {
                arrayList22.add(fromFuturesPosition((UiFuturesPosition) it.next(), map, linkedHashMap2));
            }
            return arrayList22;
        }
        ResultKt.throwOnFailure(regionGateState$default);
        if (!((Boolean) regionGateState$default).booleanValue()) {
            return CollectionsKt.emptyList();
        }
        Flow<List<UiFuturesPosition>> flowStreamAllPositions = getFuturesPositionStore().streamAllPositions();
        c3148712.label = 2;
        regionGateState$default = FlowKt.first(flowStreamAllPositions, c3148712);
        if (regionGateState$default != coroutine_suspended) {
            list = (List) regionGateState$default;
            if (!list.isEmpty()) {
            }
        }
        return coroutine_suspended;
    }

    private final List<ViewModel> createViewModelsForCuratedLists(CuratedListData curatedListData, EquityData equityData, CryptoData cryptoData, OptionWatchlistData optionWatchlistData, FuturesWatchlistData futuresWatchlistData) {
        EquityData equityData2;
        CryptoData cryptoData2;
        OptionWatchlistData optionWatchlistData2;
        FuturesWatchlistData futuresWatchlistData2;
        List<ViewModel.ItemViewModel> listCreateViewModelsForCuratedListItems;
        List<CuratedList> curatedLists = curatedListData.getCuratedLists();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(curatedLists, 10));
        for (CuratedList curatedList : curatedLists) {
            if (curatedList.isRobinhoodList()) {
                listCreateViewModelsForCuratedListItems = CollectionsKt.emptyList();
                equityData2 = equityData;
                cryptoData2 = cryptoData;
                optionWatchlistData2 = optionWatchlistData;
                futuresWatchlistData2 = futuresWatchlistData;
            } else {
                equityData2 = equityData;
                cryptoData2 = cryptoData;
                optionWatchlistData2 = optionWatchlistData;
                futuresWatchlistData2 = futuresWatchlistData;
                listCreateViewModelsForCuratedListItems = createViewModelsForCuratedListItems((List) MapsKt.getValue(curatedListData.getCuratedListItemsMap(), curatedList.getId()), equityData2, cryptoData2, optionWatchlistData2, futuresWatchlistData2);
            }
            arrayList.add(CollectionsKt.plus((Collection) CollectionsKt.listOf(new ViewModel.HeaderViewModel(curatedList.getDisplayName(), listCreateViewModelsForCuratedListItems.isEmpty(), getIntent(curatedList))), (Iterable) listCreateViewModelsForCuratedListItems));
            equityData = equityData2;
            cryptoData = cryptoData2;
            optionWatchlistData = optionWatchlistData2;
            futuresWatchlistData = futuresWatchlistData2;
        }
        return CollectionsKt.flatten(arrayList);
    }

    private final List<ViewModel.ItemViewModel> createViewModelsForCuratedListItems(List<CuratedListItem> listItems, EquityData equityData, CryptoData cryptoData, OptionWatchlistData optionWatchlistData, FuturesWatchlistData futuresWatchlistData) {
        CuratedListItemValuesHelper curatedListItemValuesHelper = new CuratedListItemValuesHelper(listItems, equityData, cryptoData, optionWatchlistData, futuresWatchlistData);
        ArrayList<CuratedListItem> arrayList = new ArrayList();
        for (Object obj : listItems) {
            if (((CuratedListItem) obj).getObjectType() != CuratedListObjectType.INDEX) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (CuratedListItem curatedListItem : arrayList) {
            Money lastTradePrice = curatedListItemValuesHelper.getLastTradePrice(curatedListItem);
            Money previousClosePrice = curatedListItemValuesHelper.getPreviousClosePrice(curatedListItem);
            BigDecimal equityValue = curatedListItemValuesHelper.getEquityValue(curatedListItem);
            List<UUID> itemIds = curatedListItemValuesHelper.getItemIds(curatedListItem);
            NumberFormatter formatter = curatedListItemValuesHelper.getFormatter(curatedListItem);
            String displaySymbol = curatedListItem.getDisplaySymbol();
            BigDecimal bigDecimalCompat = null;
            BigDecimal bigDecimalCompat2 = lastTradePrice != null ? Money3.getBigDecimalCompat(lastTradePrice) : null;
            if (previousClosePrice != null) {
                bigDecimalCompat = Money3.getBigDecimalCompat(previousClosePrice);
            }
            arrayList2.add(new ViewModel.ItemViewModel(displaySymbol, bigDecimalCompat2, bigDecimalCompat, equityValue, createIntent(curatedListItem, itemIds), formatter));
        }
        return arrayList2;
    }

    private final Intent getIntent(CuratedList curatedList) {
        return Navigator.DefaultImpls.createIntentForFragment$default(getNavigator(), this.context, CuratedListKey.Companion.create$default(CuratedListKey.INSTANCE, curatedList.getId(), curatedList.getOwnerType(), null, 4, null), false, false, false, null, false, false, false, false, false, null, false, 8188, null);
    }

    private final Intent createIntent(CuratedListItem curatedListItem, List<UUID> list) {
        switch (WhenMappings.$EnumSwitchMapping$2[curatedListItem.getObjectType().ordinal()]) {
            case 1:
                return Navigator.DefaultImpls.createIntentForFragment$default(getNavigator(), this.context, new CryptoDetailFragmentKey(curatedListItem.getId(), list, false, null, null, null, 60, null), false, false, false, null, false, false, false, false, false, null, false, 8188, null);
            case 2:
                return Navigator.DefaultImpls.createIntentForFragment$default(getNavigator(), this.context, new LegacyFragmentKey.EquityInstrumentDetail(curatedListItem.getId(), list, null, InstrumentDetailSource.HOME_TAB_LIST, false, 20, null), false, false, false, null, false, false, false, false, false, null, false, 8188, null);
            case 3:
                Navigator navigator = getNavigator();
                Context context = this.context;
                String strategyCode = curatedListItem.getStrategyCode();
                Intrinsics.checkNotNull(strategyCode);
                String strategyCode2 = curatedListItem.getStrategyCode();
                Intrinsics.checkNotNull(strategyCode2);
                return Navigator.DefaultImpls.createIntentForFragment$default(navigator, context, new OptionsDetailPageFragmentKey(new OptionsDetailPageLaunchMode.StrategyCode(strategyCode, false, CollectionsKt.listOf(strategyCode2), null, null, 26, null)), false, false, false, null, false, false, false, false, false, null, false, 8188, null);
            case 4:
                return Navigator.DefaultImpls.createIntentForFragment$default(getNavigator(), this.context, new FuturesDetailFragmentKey.ByContractId(curatedListItem.getId(), new Screen(Screen.Name.NAME_UNSPECIFIED, null, null, null, 14, null), FuturesAnalyticsStrings.ENTRY_POINT_FUTURES_CURATED_LIST_WIDGET), false, false, false, null, false, false, false, false, false, null, false, 8188, null);
            case 5:
            case 6:
            case 7:
            case 8:
                Preconditions.INSTANCE.failUnexpectedItemKotlin(curatedListItem);
                throw new ExceptionsH();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final RemoteViews createHeaderRemoteViews(ViewModel.HeaderViewModel viewModel) {
        RemoteViews remoteViews = new RemoteViews(this.context.getPackageName(), C31480R.layout.widget_header_row);
        int textColorPrimary = getTextColorPrimary();
        remoteViews.setTextViewText(C31480R.id.widget_header_txt, viewModel.getText());
        remoteViews.setTextColor(C31480R.id.widget_header_txt, textColorPrimary);
        if (viewModel.getShowCaret()) {
            Icon iconCreateWithResource = Icon.createWithResource(this.context, C20690R.drawable.ic_rds_caret_right_16dp);
            iconCreateWithResource.setTint(textColorPrimary);
            Intrinsics.checkNotNullExpressionValue(iconCreateWithResource, "apply(...)");
            remoteViews.setImageViewIcon(C31480R.id.widget_header_caret_img, iconCreateWithResource);
            remoteViews.setViewVisibility(C31480R.id.widget_header_caret_img, 0);
        } else {
            remoteViews.setViewVisibility(C31480R.id.widget_header_caret_img, 8);
        }
        Intent intent = new Intent();
        WatchlistViewsActivity.INSTANCE.bindStartIntent(intent, viewModel.getClickIntent());
        remoteViews.setOnClickFillInIntent(C31480R.id.widget_header_row, intent);
        return remoteViews;
    }

    private final RemoteViews createHoldingsDividerRemoteViews() {
        return new RemoteViews(this.context.getPackageName(), C31480R.layout.widget_holdings_divider_row);
    }

    private final RemoteViews createRemoteViews(ViewModel.ItemViewModel viewModel) throws Resources.NotFoundException {
        int i;
        int textColorSecondary;
        SpannableString spannableString;
        int i2;
        PortfolioWidgetInfo portfolioWidgetInfo = this.widgetInfo;
        Intrinsics.checkNotNull(portfolioWidgetInfo);
        PortfolioWidgetInfo.ViewOption viewOption = portfolioWidgetInfo.getViewOption();
        boolean z = viewOption != PortfolioWidgetInfo.ViewOption.CHANGE && viewModel.getHasPrice() && portfolioWidgetInfo.getWidthCellsEstimation() > 2;
        String packageName = this.context.getPackageName();
        if (z) {
            i = C31480R.layout.widget_watchlist_row_with_delta;
        } else {
            i = C31480R.layout.widget_watchlist_row;
        }
        RemoteViews remoteViews = new RemoteViews(packageName, i);
        remoteViews.setTextViewText(C31480R.id.widget_symbol_txt, viewModel.getSymbol());
        remoteViews.setTextColor(C31480R.id.widget_symbol_txt, getTextColorPrimary());
        if (viewModel.getHasPrice()) {
            BigDecimal lastTradePrice = viewModel.getLastTradePrice();
            Intrinsics.checkNotNull(lastTradePrice);
            BigDecimal previousClose = viewModel.getPreviousClose();
            Intrinsics.checkNotNull(previousClose);
            BigDecimal equity = viewModel.getEquity();
            Intrinsics.checkNotNull(equity);
            boolean z2 = lastTradePrice.compareTo(viewModel.getPreviousClose()) >= 0;
            ColorSchemeManager colorSchemeManager = getColorSchemeManager();
            if (z2) {
                if (isDay()) {
                    i2 = C13997R.attr.colorSchemePositiveDefaultDay;
                } else {
                    i2 = C13997R.attr.colorSchemePositiveDefaultNight;
                }
            } else if (isDay()) {
                i2 = C13997R.attr.colorSchemeNegativeDefaultDay;
            } else {
                i2 = C13997R.attr.colorSchemeNegativeDefaultNight;
            }
            textColorSecondary = colorSchemeManager.getColor(i2);
            NumberFormatter priceFormatter = viewModel.getPriceFormatter();
            if (priceFormatter == null) {
                priceFormatter = Formats.getPriceFormat();
            }
            int i3 = WhenMappings.$EnumSwitchMapping$3[viewOption.ordinal()];
            if (i3 == 1) {
                spannableString = new SpannableString(priceFormatter.format(lastTradePrice));
            } else if (i3 == 2) {
                spannableString = new SpannableString(priceFormatter.format(equity));
            } else {
                if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                BigDecimal bigDecimalSubtract = lastTradePrice.subtract(previousClose);
                Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
                spannableString = new SpannableString(Formats.getPercentDeltaFormat().format(BigDecimals7.safeDivide(bigDecimalSubtract, previousClose)));
            }
        } else {
            textColorSecondary = getTextColorSecondary();
            spannableString = new SpannableString(this.context.getResources().getString(C41827R.string.general_label_n_a));
        }
        if (z) {
            spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
            BigDecimal lastTradePrice2 = viewModel.getLastTradePrice();
            Intrinsics.checkNotNull(lastTradePrice2);
            BigDecimal previousClose2 = viewModel.getPreviousClose();
            Intrinsics.checkNotNull(previousClose2);
            BigDecimal bigDecimalSubtract2 = lastTradePrice2.subtract(previousClose2);
            Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract2, "subtract(...)");
            remoteViews.setTextViewText(C31480R.id.widget_secondary_txt, Formats.getPercentDeltaFormat().format(BigDecimals7.safeDivide(bigDecimalSubtract2, viewModel.getPreviousClose())));
            remoteViews.setTextColor(C31480R.id.widget_secondary_txt, textColorSecondary);
        }
        remoteViews.setTextViewText(C31480R.id.widget_quote_txt, spannableString);
        remoteViews.setTextColor(C31480R.id.widget_quote_txt, textColorSecondary);
        Intent intent = new Intent();
        WatchlistViewsActivity.INSTANCE.bindStartIntent(intent, viewModel.getClickIntent());
        remoteViews.setOnClickFillInIntent(C31480R.id.widget_row, intent);
        return remoteViews;
    }

    /* compiled from: WatchlistViewsFactory.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/widget/ui/WatchlistViewsFactory$ViewModel;", "", "<init>", "()V", "HeaderViewModel", "ItemViewModel", "HoldingsDividerViewModel", "Lcom/robinhood/android/widget/ui/WatchlistViewsFactory$ViewModel$HeaderViewModel;", "Lcom/robinhood/android/widget/ui/WatchlistViewsFactory$ViewModel$HoldingsDividerViewModel;", "Lcom/robinhood/android/widget/ui/WatchlistViewsFactory$ViewModel$ItemViewModel;", "feature-widget_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class ViewModel {
        public /* synthetic */ ViewModel(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ViewModel() {
        }

        /* compiled from: WatchlistViewsFactory.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/widget/ui/WatchlistViewsFactory$ViewModel$HeaderViewModel;", "Lcom/robinhood/android/widget/ui/WatchlistViewsFactory$ViewModel;", "text", "", "showCaret", "", "clickIntent", "Landroid/content/Intent;", "<init>", "(Ljava/lang/String;ZLandroid/content/Intent;)V", "getText", "()Ljava/lang/String;", "getShowCaret", "()Z", "getClickIntent", "()Landroid/content/Intent;", "feature-widget_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class HeaderViewModel extends ViewModel {
            private final Intent clickIntent;
            private final boolean showCaret;
            private final String text;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public HeaderViewModel(String text, boolean z, Intent clickIntent) {
                super(null);
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(clickIntent, "clickIntent");
                this.text = text;
                this.showCaret = z;
                this.clickIntent = clickIntent;
            }

            public final Intent getClickIntent() {
                return this.clickIntent;
            }

            public final boolean getShowCaret() {
                return this.showCaret;
            }

            public final String getText() {
                return this.text;
            }
        }

        /* compiled from: WatchlistViewsFactory.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/widget/ui/WatchlistViewsFactory$ViewModel$ItemViewModel;", "Lcom/robinhood/android/widget/ui/WatchlistViewsFactory$ViewModel;", "symbol", "", "lastTradePrice", "Ljava/math/BigDecimal;", "previousClose", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_EQUITY, "clickIntent", "Landroid/content/Intent;", "priceFormatter", "Lcom/robinhood/android/lib/formats/NumberFormatter;", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Landroid/content/Intent;Lcom/robinhood/android/lib/formats/NumberFormatter;)V", "getSymbol", "()Ljava/lang/String;", "getLastTradePrice", "()Ljava/math/BigDecimal;", "getPreviousClose", "getEquity", "getClickIntent", "()Landroid/content/Intent;", "getPriceFormatter", "()Lcom/robinhood/android/lib/formats/NumberFormatter;", "hasPrice", "", "getHasPrice", "()Z", "feature-widget_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class ItemViewModel extends ViewModel {
            private final Intent clickIntent;
            private final BigDecimal equity;
            private final boolean hasPrice;
            private final BigDecimal lastTradePrice;
            private final BigDecimal previousClose;
            private final NumberFormatter priceFormatter;
            private final String symbol;

            public /* synthetic */ ItemViewModel(String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, Intent intent, NumberFormatter numberFormatter, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, bigDecimal, bigDecimal2, bigDecimal3, intent, (i & 32) != 0 ? null : numberFormatter);
            }

            public final String getSymbol() {
                return this.symbol;
            }

            public final BigDecimal getLastTradePrice() {
                return this.lastTradePrice;
            }

            public final BigDecimal getPreviousClose() {
                return this.previousClose;
            }

            public final BigDecimal getEquity() {
                return this.equity;
            }

            public final Intent getClickIntent() {
                return this.clickIntent;
            }

            public final NumberFormatter getPriceFormatter() {
                return this.priceFormatter;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ItemViewModel(String symbol, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, Intent clickIntent, NumberFormatter numberFormatter) {
                super(null);
                Intrinsics.checkNotNullParameter(symbol, "symbol");
                Intrinsics.checkNotNullParameter(clickIntent, "clickIntent");
                this.symbol = symbol;
                this.lastTradePrice = bigDecimal;
                this.previousClose = bigDecimal2;
                this.equity = bigDecimal3;
                this.clickIntent = clickIntent;
                this.priceFormatter = numberFormatter;
                this.hasPrice = (bigDecimal == null || bigDecimal2 == null) ? false : true;
            }

            public final boolean getHasPrice() {
                return this.hasPrice;
            }
        }

        /* compiled from: WatchlistViewsFactory.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/widget/ui/WatchlistViewsFactory$ViewModel$HoldingsDividerViewModel;", "Lcom/robinhood/android/widget/ui/WatchlistViewsFactory$ViewModel;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-widget_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class HoldingsDividerViewModel extends ViewModel {
            public static final HoldingsDividerViewModel INSTANCE = new HoldingsDividerViewModel();

            public boolean equals(Object other) {
                return this == other || (other instanceof HoldingsDividerViewModel);
            }

            public int hashCode() {
                return -1879855698;
            }

            public String toString() {
                return "HoldingsDividerViewModel";
            }

            private HoldingsDividerViewModel() {
                super(null);
            }
        }
    }

    private final ViewModel.ItemViewModel fromInstrumentPosition(InstrumentPosition instrumentPosition, EquityData equityData) {
        Money adjustedPreviousClose;
        Money lastTradePrice;
        Instrument instrument = instrumentPosition.getInstrument();
        BigDecimal positionDisplayQuantity = instrumentPosition.getPositionDisplayQuantity();
        Quote quote = equityData.getQuoteMap().get(instrument.getId());
        List<InstrumentPosition> instrumentPositions = equityData.getInstrumentPositions();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(instrumentPositions, 10));
        Iterator<T> it = instrumentPositions.iterator();
        while (it.hasNext()) {
            arrayList.add(((InstrumentPosition) it.next()).getInstrument());
        }
        Navigator navigator = getNavigator();
        Context context = this.context;
        UUID id = instrument.getId();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((Instrument) it2.next()).getId());
        }
        Intent intentCreateIntentForFragment$default = Navigator.DefaultImpls.createIntentForFragment$default(navigator, context, new LegacyFragmentKey.EquityInstrumentDetail(id, arrayList2, null, InstrumentDetailSource.HOME_TAB_POSITIONS, false, 20, null), false, false, false, null, false, false, false, false, false, null, false, 8188, null);
        String symbol = instrument.getSymbol();
        BigDecimal bigDecimalMultiply = null;
        BigDecimal bigDecimalCompat = (quote == null || (lastTradePrice = quote.getLastTradePrice()) == null) ? null : Money3.getBigDecimalCompat(lastTradePrice);
        BigDecimal bigDecimalCompat2 = (quote == null || (adjustedPreviousClose = quote.getAdjustedPreviousClose()) == null) ? null : Money3.getBigDecimalCompat(adjustedPreviousClose);
        if (quote != null) {
            bigDecimalMultiply = Money3.getBigDecimalCompat(quote.getLastTradePrice()).multiply(positionDisplayQuantity);
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        }
        return new ViewModel.ItemViewModel(symbol, bigDecimalCompat, bigDecimalCompat2, bigDecimalMultiply, intentCreateIntentForFragment$default, null, 32, null);
    }

    private final ViewModel.ItemViewModel fromCryptoHolding(UiCryptoHolding cryptoHolding, UiCryptoHistorical historical, List<UUID> currencyPairIds, Map<UUID, CryptoQuote> quoteMap, Currency quoteCurrencyForPrice) {
        NumberFormatter fallbackCryptoPriceFormat;
        Money previousClose;
        Money markPrice;
        UUID currencyPairId = cryptoHolding.getCurrencyPairId();
        CryptoQuote cryptoQuote = quoteMap.get(currencyPairId);
        Intent intentCreateIntentForFragment$default = Navigator.DefaultImpls.createIntentForFragment$default(getNavigator(), this.context, new CryptoDetailFragmentKey(currencyPairId, currencyPairIds, false, null, null, null, 60, null), false, false, false, null, false, false, false, false, false, null, false, 8188, null);
        if (quoteCurrencyForPrice == null || (fallbackCryptoPriceFormat = CurrencyDefinitions.getCryptoFiatPriceFormatter(quoteCurrencyForPrice)) == null) {
            fallbackCryptoPriceFormat = Formats.getFallbackCryptoPriceFormat();
        }
        NumberFormatter numberFormatter = fallbackCryptoPriceFormat;
        String code = cryptoHolding.getCurrency().getCode();
        BigDecimal bigDecimalMultiply = null;
        BigDecimal bigDecimalCompat = (cryptoQuote == null || (markPrice = cryptoQuote.getMarkPrice()) == null) ? null : Money3.getBigDecimalCompat(markPrice);
        BigDecimal bigDecimalCompat2 = (historical == null || (previousClose = historical.getPreviousClose()) == null) ? null : Money3.getBigDecimalCompat(previousClose);
        if (cryptoQuote != null) {
            bigDecimalMultiply = cryptoHolding.getQuantity().multiply(Money3.getBigDecimalCompat(cryptoQuote.getMarkPrice()));
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        }
        return new ViewModel.ItemViewModel(code, bigDecimalCompat, bigDecimalCompat2, bigDecimalMultiply, intentCreateIntentForFragment$default, numberFormatter);
    }

    private final ViewModel.ItemViewModel fromOptionPosition(UiAggregateOptionPositionSimple position, Map<UUID, ? extends AggregateOptionQuote> quoteMap) {
        Decimals3 previousClosePrice;
        Decimals3 adjustedMarkPrice;
        AggregateOptionQuote aggregateOptionQuote = quoteMap.get(position.getAggregateOptionPosition().getId());
        Resources resources = this.context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        return new ViewModel.ItemViewModel(OptionExtensions2.getStrategyTitle$default(position, resources, false, OptionChain.UnderlyingType.EQUITY, 2, null).toString(), (aggregateOptionQuote == null || (adjustedMarkPrice = aggregateOptionQuote.getAdjustedMarkPrice()) == null) ? null : adjustedMarkPrice.getUnsignedValue(), (aggregateOptionQuote == null || (previousClosePrice = aggregateOptionQuote.getPreviousClosePrice()) == null) ? null : previousClosePrice.getUnsignedValue(), aggregateOptionQuote != null ? position.getEquity(aggregateOptionQuote) : null, Navigator.DefaultImpls.createIntentForFragment$default(getNavigator(), this.context, new OptionsDetailPageFragmentKey(new OptionsDetailPageLaunchMode.AggregatePositionId(position.getAggregateOptionPosition().getId(), null, position.getAggregateOptionPosition().getAccountNumber(), null, 10, null)), false, false, false, null, false, false, false, false, false, null, false, 8188, null), null, 32, null);
    }

    private final ViewModel.ItemViewModel fromFuturesPosition(UiFuturesPosition position, Map<UUID, FuturesQuote> quoteMap, Map<UUID, FuturesClosePrices> closesMap) {
        String symbol;
        BigDecimal lastTradePrice;
        FuturesQuote futuresQuote = quoteMap.get(position.getContractId());
        FuturesClosePrices futuresClosePrices = closesMap.get(position.getContractId());
        Intent intentCreateIntentForFragment$default = Navigator.DefaultImpls.createIntentForFragment$default(getNavigator(), this.context, new FuturesDetailFragmentKey.ByContractId(position.getContractId(), new Screen(Screen.Name.NAME_UNSPECIFIED, null, null, null, 14, null), FuturesAnalyticsStrings.ENTRY_POINT_FUTURES_POSITIONS_WIDGET), false, false, false, null, false, false, false, false, false, null, false, 8188, null);
        if (futuresQuote == null || (symbol = futuresQuote.getSymbol()) == null) {
            symbol = "";
        }
        String str = symbol;
        BigDecimal bigDecimalMultiply = null;
        BigDecimal lastTradePrice2 = futuresQuote != null ? futuresQuote.getLastTradePrice() : null;
        BigDecimal previousClosePrice = futuresClosePrices != null ? futuresClosePrices.getPreviousClosePrice() : null;
        if (futuresQuote != null && (lastTradePrice = futuresQuote.getLastTradePrice()) != null) {
            bigDecimalMultiply = position.getQuantity().multiply(lastTradePrice);
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        }
        return new ViewModel.ItemViewModel(str, lastTradePrice2, previousClosePrice, bigDecimalMultiply, intentCreateIntentForFragment$default, null, 32, null);
    }

    /* compiled from: WatchlistViewsFactory.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/widget/ui/WatchlistViewsFactory$EquityData;", "", "instrumentPositions", "", "Lcom/robinhood/models/ui/InstrumentPosition;", "quoteMap", "", "Ljava/util/UUID;", "Lcom/robinhood/models/db/Quote;", "<init>", "(Ljava/util/List;Ljava/util/Map;)V", "getInstrumentPositions", "()Ljava/util/List;", "getQuoteMap", "()Ljava/util/Map;", "feature-widget_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class EquityData {
        private final List<InstrumentPosition> instrumentPositions;
        private final Map<UUID, Quote> quoteMap;

        public EquityData(List<InstrumentPosition> instrumentPositions, Map<UUID, Quote> quoteMap) {
            Intrinsics.checkNotNullParameter(instrumentPositions, "instrumentPositions");
            Intrinsics.checkNotNullParameter(quoteMap, "quoteMap");
            this.instrumentPositions = instrumentPositions;
            this.quoteMap = quoteMap;
        }

        public final List<InstrumentPosition> getInstrumentPositions() {
            return this.instrumentPositions;
        }

        public final Map<UUID, Quote> getQuoteMap() {
            return this.quoteMap;
        }
    }

    /* compiled from: WatchlistViewsFactory.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001BU\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0006\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0006¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/widget/ui/WatchlistViewsFactory$CryptoData;", "", CryptoDetailSource.HOLDINGS, "", "Lcom/robinhood/models/crypto/ui/UiCryptoHolding;", "quoteMap", "", "Ljava/util/UUID;", "Lcom/robinhood/models/crypto/db/CryptoQuote;", "historicalMap", "Lcom/robinhood/models/crypto/ui/UiCryptoHistorical;", "quoteCurrencyForPriceMap", "Lcom/robinhood/models/crypto/db/Currency;", "<init>", "(Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", "getHoldings", "()Ljava/util/List;", "getQuoteMap", "()Ljava/util/Map;", "getHistoricalMap", "getQuoteCurrencyForPriceMap", "feature-widget_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class CryptoData {
        private final Map<UUID, UiCryptoHistorical> historicalMap;
        private final List<UiCryptoHolding> holdings;
        private final Map<UUID, Currency> quoteCurrencyForPriceMap;
        private final Map<UUID, CryptoQuote> quoteMap;

        public CryptoData(List<UiCryptoHolding> holdings, Map<UUID, CryptoQuote> quoteMap, Map<UUID, UiCryptoHistorical> historicalMap, Map<UUID, Currency> quoteCurrencyForPriceMap) {
            Intrinsics.checkNotNullParameter(holdings, "holdings");
            Intrinsics.checkNotNullParameter(quoteMap, "quoteMap");
            Intrinsics.checkNotNullParameter(historicalMap, "historicalMap");
            Intrinsics.checkNotNullParameter(quoteCurrencyForPriceMap, "quoteCurrencyForPriceMap");
            this.holdings = holdings;
            this.quoteMap = quoteMap;
            this.historicalMap = historicalMap;
            this.quoteCurrencyForPriceMap = quoteCurrencyForPriceMap;
        }

        public final List<UiCryptoHolding> getHoldings() {
            return this.holdings;
        }

        public final Map<UUID, CryptoQuote> getQuoteMap() {
            return this.quoteMap;
        }

        public final Map<UUID, UiCryptoHistorical> getHistoricalMap() {
            return this.historicalMap;
        }

        public final Map<UUID, Currency> getQuoteCurrencyForPriceMap() {
            return this.quoteCurrencyForPriceMap;
        }
    }

    /* compiled from: WatchlistViewsFactory.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/widget/ui/WatchlistViewsFactory$OptionWatchlistData;", "", "strategyToQuoteMap", "", "", "Lcom/robinhood/models/db/AggregateOptionQuote;", "<init>", "(Ljava/util/Map;)V", "getStrategyToQuoteMap", "()Ljava/util/Map;", "feature-widget_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class OptionWatchlistData {
        private final Map<String, AggregateOptionQuote> strategyToQuoteMap;

        /* JADX WARN: Multi-variable type inference failed */
        public OptionWatchlistData(Map<String, ? extends AggregateOptionQuote> strategyToQuoteMap) {
            Intrinsics.checkNotNullParameter(strategyToQuoteMap, "strategyToQuoteMap");
            this.strategyToQuoteMap = strategyToQuoteMap;
        }

        public final Map<String, AggregateOptionQuote> getStrategyToQuoteMap() {
            return this.strategyToQuoteMap;
        }
    }

    /* compiled from: WatchlistViewsFactory.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B/\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0003¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/widget/ui/WatchlistViewsFactory$FuturesWatchlistData;", "", "contractIdsToQuoteMap", "", "Ljava/util/UUID;", "Lcom/robinhood/android/models/futures/marketdata/db/FuturesQuote;", "futuresPositions", "Lcom/robinhood/android/models/futures/db/UiFuturesPosition;", "<init>", "(Ljava/util/Map;Ljava/util/Map;)V", "getContractIdsToQuoteMap", "()Ljava/util/Map;", "getFuturesPositions", "feature-widget_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class FuturesWatchlistData {
        private final Map<UUID, FuturesQuote> contractIdsToQuoteMap;
        private final Map<UUID, UiFuturesPosition> futuresPositions;

        public FuturesWatchlistData(Map<UUID, FuturesQuote> contractIdsToQuoteMap, Map<UUID, UiFuturesPosition> futuresPositions) {
            Intrinsics.checkNotNullParameter(contractIdsToQuoteMap, "contractIdsToQuoteMap");
            Intrinsics.checkNotNullParameter(futuresPositions, "futuresPositions");
            this.contractIdsToQuoteMap = contractIdsToQuoteMap;
            this.futuresPositions = futuresPositions;
        }

        public final Map<UUID, FuturesQuote> getContractIdsToQuoteMap() {
            return this.contractIdsToQuoteMap;
        }

        public final Map<UUID, UiFuturesPosition> getFuturesPositions() {
            return this.futuresPositions;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: WatchlistViewsFactory.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B/\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00030\u0006¢\u0006\u0004\b\t\u0010\nJ\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\u0006\u0010\u0010\u001a\u00020\u0011R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR#\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/widget/ui/WatchlistViewsFactory$CuratedListData;", "", "curatedLists", "", "Lcom/robinhood/models/db/CuratedList;", "curatedListItemsMap", "", "Ljava/util/UUID;", "Lcom/robinhood/models/db/CuratedListItem;", "<init>", "(Ljava/util/List;Ljava/util/Map;)V", "getCuratedLists", "()Ljava/util/List;", "getCuratedListItemsMap", "()Ljava/util/Map;", "getCuratedListItemIds", "objectType", "Lcom/robinhood/models/api/CuratedListObjectType;", "feature-widget_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final class CuratedListData {
        private final Map<UUID, List<CuratedListItem>> curatedListItemsMap;
        private final List<CuratedList> curatedLists;

        /* JADX WARN: Multi-variable type inference failed */
        public CuratedListData(List<CuratedList> curatedLists, Map<UUID, ? extends List<CuratedListItem>> curatedListItemsMap) {
            Intrinsics.checkNotNullParameter(curatedLists, "curatedLists");
            Intrinsics.checkNotNullParameter(curatedListItemsMap, "curatedListItemsMap");
            this.curatedLists = curatedLists;
            this.curatedListItemsMap = curatedListItemsMap;
        }

        public final List<CuratedList> getCuratedLists() {
            return this.curatedLists;
        }

        public final Map<UUID, List<CuratedListItem>> getCuratedListItemsMap() {
            return this.curatedListItemsMap;
        }

        public final List<UUID> getCuratedListItemIds(final CuratedListObjectType objectType) {
            Intrinsics.checkNotNullParameter(objectType, "objectType");
            return SequencesKt.toList(SequencesKt.map(SequencesKt.filter(CollectionsKt.asSequence(CollectionsKt.flatten(this.curatedListItemsMap.values())), new Function1() { // from class: com.robinhood.android.widget.ui.WatchlistViewsFactory$CuratedListData$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(WatchlistViewsFactory.CuratedListData.getCuratedListItemIds$lambda$0(objectType, (CuratedListItem) obj));
                }
            }), new PropertyReference1Impl() { // from class: com.robinhood.android.widget.ui.WatchlistViewsFactory$CuratedListData$getCuratedListItemIds$2
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
                public Object get(Object obj) {
                    return ((CuratedListItem) obj).getId();
                }
            }));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean getCuratedListItemIds$lambda$0(CuratedListObjectType curatedListObjectType, CuratedListItem it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getObjectType() == curatedListObjectType;
        }
    }

    /* compiled from: WatchlistViewsFactory.kt */
    @Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B;\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020\u0004J\u0010\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010 \u001a\u00020\u0004J\u0010\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010 \u001a\u00020\u0004J\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00100\u00032\u0006\u0010 \u001a\u00020\u0004J\u000e\u0010%\u001a\u00020&2\u0006\u0010 \u001a\u00020\u0004R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u001a\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u001b0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001aX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/widget/ui/WatchlistViewsFactory$CuratedListItemValuesHelper;", "", "listItems", "", "Lcom/robinhood/models/db/CuratedListItem;", "equityData", "Lcom/robinhood/android/widget/ui/WatchlistViewsFactory$EquityData;", "cryptoData", "Lcom/robinhood/android/widget/ui/WatchlistViewsFactory$CryptoData;", "optionWatchlistData", "Lcom/robinhood/android/widget/ui/WatchlistViewsFactory$OptionWatchlistData;", "futuresWatchlistData", "Lcom/robinhood/android/widget/ui/WatchlistViewsFactory$FuturesWatchlistData;", "<init>", "(Ljava/util/List;Lcom/robinhood/android/widget/ui/WatchlistViewsFactory$EquityData;Lcom/robinhood/android/widget/ui/WatchlistViewsFactory$CryptoData;Lcom/robinhood/android/widget/ui/WatchlistViewsFactory$OptionWatchlistData;Lcom/robinhood/android/widget/ui/WatchlistViewsFactory$FuturesWatchlistData;)V", "instrumentIds", "Ljava/util/UUID;", "getInstrumentIds", "()Ljava/util/List;", "currencyPairIds", "getCurrencyPairIds", "optionIds", "getOptionIds", "futuresIds", "getFuturesIds", "instrumentPositionMap", "", "Lcom/robinhood/models/ui/InstrumentPosition;", "cryptoHoldingsMap", "Lcom/robinhood/models/crypto/ui/UiCryptoHolding;", "getEquityValue", "Ljava/math/BigDecimal;", "listItem", "getPreviousClosePrice", "Lcom/robinhood/models/util/Money;", "getLastTradePrice", "getItemIds", "getFormatter", "Lcom/robinhood/android/lib/formats/NumberFormatter;", "feature-widget_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    private static final class CuratedListItemValuesHelper {
        private final CryptoData cryptoData;
        private final Map<UUID, UiCryptoHolding> cryptoHoldingsMap;
        private final List<UUID> currencyPairIds;
        private final EquityData equityData;
        private final List<UUID> futuresIds;
        private final FuturesWatchlistData futuresWatchlistData;
        private final List<UUID> instrumentIds;
        private final Map<UUID, InstrumentPosition> instrumentPositionMap;
        private final List<UUID> optionIds;
        private final OptionWatchlistData optionWatchlistData;

        /* compiled from: WatchlistViewsFactory.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[CuratedListObjectType.values().length];
                try {
                    iArr[CuratedListObjectType.INSTRUMENT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CuratedListObjectType.CURRENCY_PAIR.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[CuratedListObjectType.OPTION_STRATEGY.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[CuratedListObjectType.FUTURES_CONTRACT.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[CuratedListObjectType.CRYPTO_TOKENIZED_STOCKS.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[CuratedListObjectType.PERPETUALS_CONTRACT.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[CuratedListObjectType.INDEX.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[CuratedListObjectType.UNKNOWN.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public CuratedListItemValuesHelper(List<CuratedListItem> listItems, EquityData equityData, CryptoData cryptoData, OptionWatchlistData optionWatchlistData, FuturesWatchlistData futuresWatchlistData) {
            LinkedHashMap linkedHashMap;
            List<UiCryptoHolding> holdings;
            Intrinsics.checkNotNullParameter(listItems, "listItems");
            Intrinsics.checkNotNullParameter(equityData, "equityData");
            this.equityData = equityData;
            this.cryptoData = cryptoData;
            this.optionWatchlistData = optionWatchlistData;
            this.futuresWatchlistData = futuresWatchlistData;
            List<CuratedListItem> list = listItems;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((CuratedListItem) obj).getObjectType() == CuratedListObjectType.INSTRUMENT) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((CuratedListItem) it.next()).getId());
            }
            this.instrumentIds = arrayList2;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list) {
                if (((CuratedListItem) obj2).getObjectType() == CuratedListObjectType.CURRENCY_PAIR) {
                    arrayList3.add(obj2);
                }
            }
            ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList4.add(((CuratedListItem) it2.next()).getId());
            }
            this.currencyPairIds = arrayList4;
            ArrayList arrayList5 = new ArrayList();
            for (Object obj3 : list) {
                if (((CuratedListItem) obj3).getObjectType() == CuratedListObjectType.OPTION_STRATEGY) {
                    arrayList5.add(obj3);
                }
            }
            ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList5, 10));
            Iterator it3 = arrayList5.iterator();
            while (it3.hasNext()) {
                arrayList6.add(((CuratedListItem) it3.next()).getId());
            }
            this.optionIds = arrayList6;
            ArrayList arrayList7 = new ArrayList();
            for (Object obj4 : list) {
                if (((CuratedListItem) obj4).getObjectType() == CuratedListObjectType.FUTURES_CONTRACT) {
                    arrayList7.add(obj4);
                }
            }
            ArrayList arrayList8 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList7, 10));
            Iterator it4 = arrayList7.iterator();
            while (it4.hasNext()) {
                arrayList8.add(((CuratedListItem) it4.next()).getId());
            }
            this.futuresIds = arrayList8;
            List<InstrumentPosition> instrumentPositions = this.equityData.getInstrumentPositions();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(instrumentPositions, 10)), 16));
            for (Object obj5 : instrumentPositions) {
                linkedHashMap2.put(((InstrumentPosition) obj5).getInstrument().getId(), obj5);
            }
            this.instrumentPositionMap = linkedHashMap2;
            CryptoData cryptoData2 = this.cryptoData;
            if (cryptoData2 == null || (holdings = cryptoData2.getHoldings()) == null) {
                linkedHashMap = null;
            } else {
                List<UiCryptoHolding> list2 = holdings;
                linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list2, 10)), 16));
                for (Object obj6 : list2) {
                    linkedHashMap.put(((UiCryptoHolding) obj6).getCurrencyPairId(), obj6);
                }
            }
            this.cryptoHoldingsMap = linkedHashMap;
        }

        public final List<UUID> getInstrumentIds() {
            return this.instrumentIds;
        }

        public final List<UUID> getCurrencyPairIds() {
            return this.currencyPairIds;
        }

        public final List<UUID> getOptionIds() {
            return this.optionIds;
        }

        public final List<UUID> getFuturesIds() {
            return this.futuresIds;
        }

        public final BigDecimal getEquityValue(CuratedListItem listItem) {
            BigDecimal positionDisplayQuantity;
            BigDecimal quantity;
            Map<UUID, CryptoQuote> quoteMap;
            CryptoQuote cryptoQuote;
            Map<String, AggregateOptionQuote> strategyToQuoteMap;
            AggregateOptionQuote aggregateOptionQuote;
            Decimals3 adjustedMarkPrice;
            Map<UUID, FuturesQuote> contractIdsToQuoteMap;
            FuturesQuote futuresQuote;
            Map<UUID, UiFuturesPosition> futuresPositions;
            Intrinsics.checkNotNullParameter(listItem, "listItem");
            BigDecimal bigDecimalMultiply = null;
            switch (WhenMappings.$EnumSwitchMapping$0[listItem.getObjectType().ordinal()]) {
                case 1:
                    InstrumentPosition instrumentPosition = this.instrumentPositionMap.get(listItem.getId());
                    if (instrumentPosition == null || (positionDisplayQuantity = instrumentPosition.getPositionDisplayQuantity()) == null) {
                        positionDisplayQuantity = BigDecimal.ZERO;
                    }
                    Quote quote = this.equityData.getQuoteMap().get(listItem.getId());
                    if (quote != null) {
                        BigDecimal bigDecimalCompat = Money3.getBigDecimalCompat(quote.getLastTradePrice());
                        Intrinsics.checkNotNull(positionDisplayQuantity);
                        bigDecimalMultiply = bigDecimalCompat.multiply(positionDisplayQuantity);
                        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
                        break;
                    }
                    break;
                case 2:
                    Map<UUID, UiCryptoHolding> map = this.cryptoHoldingsMap;
                    UiCryptoHolding uiCryptoHolding = map != null ? map.get(listItem.getId()) : null;
                    if (uiCryptoHolding == null || (quantity = uiCryptoHolding.getQuantity()) == null) {
                        quantity = BigDecimal.ZERO;
                    }
                    CryptoData cryptoData = this.cryptoData;
                    if (cryptoData != null && (quoteMap = cryptoData.getQuoteMap()) != null && (cryptoQuote = quoteMap.get(listItem.getId())) != null) {
                        BigDecimal bigDecimalCompat2 = Money3.getBigDecimalCompat(cryptoQuote.getMarkPrice());
                        Intrinsics.checkNotNull(quantity);
                        bigDecimalMultiply = bigDecimalCompat2.multiply(quantity);
                        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
                        break;
                    }
                    break;
                case 3:
                    OptionWatchlistData optionWatchlistData = this.optionWatchlistData;
                    if (optionWatchlistData != null && (strategyToQuoteMap = optionWatchlistData.getStrategyToQuoteMap()) != null && (aggregateOptionQuote = strategyToQuoteMap.get(listItem.getStrategyCode())) != null && (adjustedMarkPrice = aggregateOptionQuote.getAdjustedMarkPrice()) != null) {
                        bigDecimalMultiply = adjustedMarkPrice.getUnsignedValue();
                        break;
                    }
                    break;
                case 4:
                    FuturesWatchlistData futuresWatchlistData = this.futuresWatchlistData;
                    UiFuturesPosition uiFuturesPosition = (futuresWatchlistData == null || (futuresPositions = futuresWatchlistData.getFuturesPositions()) == null) ? null : futuresPositions.get(listItem.getId());
                    FuturesWatchlistData futuresWatchlistData2 = this.futuresWatchlistData;
                    BigDecimal lastTradePrice = (futuresWatchlistData2 == null || (contractIdsToQuoteMap = futuresWatchlistData2.getContractIdsToQuoteMap()) == null || (futuresQuote = contractIdsToQuoteMap.get(listItem.getId())) == null) ? null : futuresQuote.getLastTradePrice();
                    if (uiFuturesPosition != null && lastTradePrice != null) {
                        bigDecimalMultiply = lastTradePrice.multiply(uiFuturesPosition.getQuantity());
                        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
                        break;
                    }
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                    Preconditions.INSTANCE.failUnexpectedItemKotlin(listItem);
                    throw new ExceptionsH();
                default:
                    throw new NoWhenBranchMatchedException();
            }
            return bigDecimalMultiply == null ? BigDecimal.ZERO : bigDecimalMultiply;
        }

        public final Money getPreviousClosePrice(CuratedListItem listItem) {
            Map<UUID, UiCryptoHistorical> historicalMap;
            UiCryptoHistorical uiCryptoHistorical;
            Map<String, AggregateOptionQuote> strategyToQuoteMap;
            AggregateOptionQuote aggregateOptionQuote;
            Decimals3 previousClosePrice;
            BigDecimal unsignedValue;
            Map<UUID, FuturesQuote> contractIdsToQuoteMap;
            FuturesQuote futuresQuote;
            BigDecimal lastTradePrice;
            Intrinsics.checkNotNullParameter(listItem, "listItem");
            switch (WhenMappings.$EnumSwitchMapping$0[listItem.getObjectType().ordinal()]) {
                case 1:
                    Quote quote = this.equityData.getQuoteMap().get(listItem.getId());
                    if (quote != null) {
                        return quote.getAdjustedPreviousClose();
                    }
                    return null;
                case 2:
                    CryptoData cryptoData = this.cryptoData;
                    if (cryptoData == null || (historicalMap = cryptoData.getHistoricalMap()) == null || (uiCryptoHistorical = historicalMap.get(listItem.getId())) == null) {
                        return null;
                    }
                    return uiCryptoHistorical.getPreviousClose();
                case 3:
                    OptionWatchlistData optionWatchlistData = this.optionWatchlistData;
                    if (optionWatchlistData == null || (strategyToQuoteMap = optionWatchlistData.getStrategyToQuoteMap()) == null || (aggregateOptionQuote = strategyToQuoteMap.get(listItem.getStrategyCode())) == null || (previousClosePrice = aggregateOptionQuote.getPreviousClosePrice()) == null || (unsignedValue = previousClosePrice.getUnsignedValue()) == null) {
                        return null;
                    }
                    return Money3.toMoney(unsignedValue, Currencies.USD);
                case 4:
                    FuturesWatchlistData futuresWatchlistData = this.futuresWatchlistData;
                    if (futuresWatchlistData == null || (contractIdsToQuoteMap = futuresWatchlistData.getContractIdsToQuoteMap()) == null || (futuresQuote = contractIdsToQuoteMap.get(listItem.getId())) == null || (lastTradePrice = futuresQuote.getLastTradePrice()) == null) {
                        return null;
                    }
                    return Money3.toMoney(lastTradePrice, Currencies.USD);
                case 5:
                case 6:
                case 7:
                case 8:
                    Preconditions.INSTANCE.failUnexpectedItemKotlin(listItem);
                    throw new ExceptionsH();
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }

        public final Money getLastTradePrice(CuratedListItem listItem) {
            Map<UUID, CryptoQuote> quoteMap;
            CryptoQuote cryptoQuote;
            Map<String, AggregateOptionQuote> strategyToQuoteMap;
            AggregateOptionQuote aggregateOptionQuote;
            Decimals3 adjustedMarkPrice;
            BigDecimal unsignedValue;
            Map<UUID, FuturesQuote> contractIdsToQuoteMap;
            FuturesQuote futuresQuote;
            BigDecimal lastTradePrice;
            Intrinsics.checkNotNullParameter(listItem, "listItem");
            switch (WhenMappings.$EnumSwitchMapping$0[listItem.getObjectType().ordinal()]) {
                case 1:
                    Quote quote = this.equityData.getQuoteMap().get(listItem.getId());
                    if (quote != null) {
                        return quote.getLastTradePrice();
                    }
                    return null;
                case 2:
                    CryptoData cryptoData = this.cryptoData;
                    if (cryptoData == null || (quoteMap = cryptoData.getQuoteMap()) == null || (cryptoQuote = quoteMap.get(listItem.getId())) == null) {
                        return null;
                    }
                    return cryptoQuote.getMarkPrice();
                case 3:
                    OptionWatchlistData optionWatchlistData = this.optionWatchlistData;
                    if (optionWatchlistData == null || (strategyToQuoteMap = optionWatchlistData.getStrategyToQuoteMap()) == null || (aggregateOptionQuote = strategyToQuoteMap.get(listItem.getStrategyCode())) == null || (adjustedMarkPrice = aggregateOptionQuote.getAdjustedMarkPrice()) == null || (unsignedValue = adjustedMarkPrice.getUnsignedValue()) == null) {
                        return null;
                    }
                    return Money3.toMoney(unsignedValue, Currencies.USD);
                case 4:
                    FuturesWatchlistData futuresWatchlistData = this.futuresWatchlistData;
                    if (futuresWatchlistData == null || (contractIdsToQuoteMap = futuresWatchlistData.getContractIdsToQuoteMap()) == null || (futuresQuote = contractIdsToQuoteMap.get(listItem.getId())) == null || (lastTradePrice = futuresQuote.getLastTradePrice()) == null) {
                        return null;
                    }
                    return Money3.toMoney(lastTradePrice, Currencies.USD);
                case 5:
                case 6:
                case 7:
                case 8:
                    Preconditions.INSTANCE.failUnexpectedItemKotlin(listItem);
                    throw new ExceptionsH();
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }

        public final List<UUID> getItemIds(CuratedListItem listItem) {
            Intrinsics.checkNotNullParameter(listItem, "listItem");
            switch (WhenMappings.$EnumSwitchMapping$0[listItem.getObjectType().ordinal()]) {
                case 1:
                    return this.instrumentIds;
                case 2:
                    return this.currencyPairIds;
                case 3:
                    return this.optionIds;
                case 4:
                    return this.futuresIds;
                case 5:
                case 6:
                case 7:
                case 8:
                    Preconditions.INSTANCE.failUnexpectedItemKotlin(listItem);
                    throw new ExceptionsH();
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }

        public final NumberFormatter getFormatter(CuratedListItem listItem) {
            Map<UUID, Currency> quoteCurrencyForPriceMap;
            Currency currency;
            NumberFormatter cryptoFiatPriceFormatter;
            Intrinsics.checkNotNullParameter(listItem, "listItem");
            if (listItem.getObjectType() == CuratedListObjectType.CURRENCY_PAIR) {
                CryptoData cryptoData = this.cryptoData;
                return (cryptoData == null || (quoteCurrencyForPriceMap = cryptoData.getQuoteCurrencyForPriceMap()) == null || (currency = quoteCurrencyForPriceMap.get(listItem.getId())) == null || (cryptoFiatPriceFormatter = CurrencyDefinitions.getCryptoFiatPriceFormatter(currency)) == null) ? Formats.getFallbackCryptoPriceFormat() : cryptoFiatPriceFormatter;
            }
            return Formats.getPriceFormat();
        }
    }
}
