package com.robinhood.equities.history;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwner2;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.account.strings.AccountDisplayNames;
import com.robinhood.android.account.strings.DisplayName;
import com.robinhood.android.autoeventlogging.AutoLoggingConfig;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BindViewDelegate2;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.util.HtmlCompat;
import com.robinhood.android.common.util.UiCallbacks;
import com.robinhood.android.common.util.extensions.Views;
import com.robinhood.android.common.util.p090rx.ContextErrorHandler;
import com.robinhood.android.designsystem.banner.RdsInfoBannerView;
import com.robinhood.android.designsystem.button.RdsButtonBarView;
import com.robinhood.android.designsystem.row.RdsDataRowView;
import com.robinhood.android.designsystem.snackbar.RdsSnackbar;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.equity.ExperimentsKt;
import com.robinhood.android.history.p153ui.MerchantRewardDetailComposable;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.markethours.data.store.MarketHoursStore;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.portfolio.pnl.ProfitAndLossDetailStore;
import com.robinhood.android.portfolio.pnl.p214db.ProfitAndLossTradeItem;
import com.robinhood.android.portfolio.pnl.p214db.ProfitAndLossTradeItem2;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.regiongate.SubzeroRegionGate;
import com.robinhood.android.trading.contracts.EquitiesSubzeroCancelNew;
import com.robinhood.android.trading.contracts.EquityOrderActivityIntentKey;
import com.robinhood.android.trading.contracts.EquityOrderFlowSource;
import com.robinhood.common.strings.OrderTimeInForces;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.ViewDisposerKt;
import com.robinhood.disposer.ViewScopedCompletable;
import com.robinhood.equities.history.extensions.PaymentTransfers4;
import com.robinhood.equities.history.extensions.UiInvestmentScheduleEvents;
import com.robinhood.librobinhood.data.store.DirectIpoShownOrderNotAllocatedStore;
import com.robinhood.librobinhood.data.store.DocumentStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.OrderStore;
import com.robinhood.librobinhood.data.store.PositionStore;
import com.robinhood.models.api.ApiOrder;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.EquityOrderState;
import com.robinhood.models.api.IacDismissMethod;
import com.robinhood.models.api.OrderTrailPriceSource;
import com.robinhood.models.api.PlacedAgent;
import com.robinhood.models.api.bonfire.TaxWithholdingCategory;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.Document;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.IacInfoBanner;
import com.robinhood.models.p320db.IacInfoBannerLocation;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.MarketHours;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.OrderMarketHours;
import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.models.p320db.OrderTrailingPeg;
import com.robinhood.models.p320db.OrderTrigger;
import com.robinhood.models.p320db.OrderType;
import com.robinhood.models.p320db.SalesTax;
import com.robinhood.models.p320db.bonfire.PaymentTransfer;
import com.robinhood.models.p320db.bonfire.WithholdingAmount;
import com.robinhood.models.p320db.bonfire.WithholdingAmount2;
import com.robinhood.models.p355ui.UiOrder;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.models.util.Money;
import com.robinhood.p370rx.delay.MinTimeInFlightTransformer;
import com.robinhood.recurring.models.p366ui.UiInvestmentScheduleEvent;
import com.robinhood.rosetta.converters.orders.Orders2;
import com.robinhood.rosetta.converters.platform.Booleans2;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.EquityOrderContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.data.store.iac.IacInfoBannerStore;
import com.robinhood.shared.documents.contracts.DocumentDownloadKey;
import com.robinhood.shared.documents.contracts.DocumentDownloadLaunchMode;
import com.robinhood.shared.equities.store.subzero.EquitySsrStore;
import com.robinhood.shared.equities.subzero.ApiEquitySsrData;
import com.robinhood.shared.history.equities.EquityHistoryLogger;
import com.robinhood.shared.history.order.Orders3;
import com.robinhood.shared.iac.extensions.IacInfoBanners;
import com.robinhood.shared.iac.infobanner.InfoBannerCallbacks;
import com.robinhood.store.base.BackupWithholdingStore;
import com.robinhood.store.base.InvestmentScheduleEventStore;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.datetime.ZoneIds;
import com.robinhood.utils.datetime.format.InstantFormatter;
import com.robinhood.utils.datetime.format.LocalDateFormatter;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.resource.StringResource;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.SingleSource;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.subjects.BehaviorSubject;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p479j$.time.Clock;
import p479j$.time.Instant;
import p479j$.time.LocalDate;
import wormhole.service.p554v1.AssetClassDto;
import wormhole.service.p554v1.GetRealizedGainLossItemResponseDto;
import wormhole.service.p554v1.RealizedGainLossItemDto;

/* compiled from: OrderDetailView.kt */
@Metadata(m3635d1 = {"\u0000\u009a\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 Ü\u00022\u00020\u00012\u00020\u0002:\u0004Ý\u0002Ü\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0013\u0010\u000bJ\u000f\u0010\u0014\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0014\u0010\u000bJ\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001b\u0010\u000bJ\u000f\u0010\u001c\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001c\u0010\u000bJ\u0013\u0010\u001f\u001a\u00020\u001e*\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010#\u001a\u00020\t2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0014¢\u0006\u0004\b&\u0010'J\u0019\u0010)\u001a\u00020\t2\b\u0010(\u001a\u0004\u0018\u00010%H\u0014¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\tH\u0014¢\u0006\u0004\b+\u0010\u000bJ\u000f\u0010,\u001a\u00020\tH\u0014¢\u0006\u0004\b,\u0010\u000bJ\u000f\u0010-\u001a\u00020\tH\u0014¢\u0006\u0004\b-\u0010\u000bJ+\u00103\u001a\u00020\t2\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020.2\f\u00102\u001a\b\u0012\u0004\u0012\u00020\t01¢\u0006\u0004\b3\u00104J\u0015\u00107\u001a\u00020\t2\u0006\u00106\u001a\u000205¢\u0006\u0004\b7\u00108J\u0017\u0010;\u001a\u00020\t2\b\u0010:\u001a\u0004\u0018\u000109¢\u0006\u0004\b;\u0010<J\u0017\u0010?\u001a\u00020\t2\u0006\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\b?\u0010@J\u0017\u0010A\u001a\u00020\t2\u0006\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\bA\u0010@R\"\u0010C\u001a\u00020B8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010J\u001a\u00020I8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\"\u0010Q\u001a\u00020P8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\"\u0010X\u001a\u00020W8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\"\u0010_\u001a\u00020^8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\"\u0010f\u001a\u00020e8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\"\u0010m\u001a\u00020l8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bm\u0010n\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR\"\u0010t\u001a\u00020s8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bt\u0010u\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR#\u0010{\u001a\u00020z8\u0006@\u0006X\u0087.¢\u0006\u0013\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R*\u0010\u0082\u0001\u001a\u00030\u0081\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001\"\u0006\b\u0086\u0001\u0010\u0087\u0001R*\u0010\u0089\u0001\u001a\u00030\u0088\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001\"\u0006\b\u008d\u0001\u0010\u008e\u0001R*\u0010\u0090\u0001\u001a\u00030\u008f\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001\"\u0006\b\u0094\u0001\u0010\u0095\u0001R*\u0010\u0097\u0001\u001a\u00030\u0096\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0097\u0001\u0010\u0098\u0001\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001\"\u0006\b\u009b\u0001\u0010\u009c\u0001R*\u0010\u009e\u0001\u001a\u00030\u009d\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u009e\u0001\u0010\u009f\u0001\u001a\u0006\b \u0001\u0010¡\u0001\"\u0006\b¢\u0001\u0010£\u0001R*\u0010¥\u0001\u001a\u00030¤\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b¥\u0001\u0010¦\u0001\u001a\u0006\b§\u0001\u0010¨\u0001\"\u0006\b©\u0001\u0010ª\u0001R*\u0010¬\u0001\u001a\u00030«\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b¬\u0001\u0010\u00ad\u0001\u001a\u0006\b®\u0001\u0010¯\u0001\"\u0006\b°\u0001\u0010±\u0001R*\u0010³\u0001\u001a\u00030²\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b³\u0001\u0010´\u0001\u001a\u0006\bµ\u0001\u0010¶\u0001\"\u0006\b·\u0001\u0010¸\u0001R*\u0010º\u0001\u001a\u00030¹\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bº\u0001\u0010»\u0001\u001a\u0006\b¼\u0001\u0010½\u0001\"\u0006\b¾\u0001\u0010¿\u0001R*\u0010Á\u0001\u001a\u00030À\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÁ\u0001\u0010Â\u0001\u001a\u0006\bÃ\u0001\u0010Ä\u0001\"\u0006\bÅ\u0001\u0010Æ\u0001R\u0019\u00106\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b6\u0010Ç\u0001R!\u0010Í\u0001\u001a\u00030È\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÉ\u0001\u0010Ê\u0001\u001a\u0006\bË\u0001\u0010Ì\u0001R!\u0010Ð\u0001\u001a\u00030È\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÎ\u0001\u0010Ê\u0001\u001a\u0006\bÏ\u0001\u0010Ì\u0001R!\u0010Ó\u0001\u001a\u00030È\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÑ\u0001\u0010Ê\u0001\u001a\u0006\bÒ\u0001\u0010Ì\u0001R!\u0010Ö\u0001\u001a\u00030È\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÔ\u0001\u0010Ê\u0001\u001a\u0006\bÕ\u0001\u0010Ì\u0001R!\u0010Ù\u0001\u001a\u00030È\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b×\u0001\u0010Ê\u0001\u001a\u0006\bØ\u0001\u0010Ì\u0001R!\u0010Þ\u0001\u001a\u00030Ú\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÛ\u0001\u0010Ê\u0001\u001a\u0006\bÜ\u0001\u0010Ý\u0001R!\u0010á\u0001\u001a\u00030È\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bß\u0001\u0010Ê\u0001\u001a\u0006\bà\u0001\u0010Ì\u0001R!\u0010ä\u0001\u001a\u00030È\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bâ\u0001\u0010Ê\u0001\u001a\u0006\bã\u0001\u0010Ì\u0001R!\u0010ç\u0001\u001a\u00030È\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bå\u0001\u0010Ê\u0001\u001a\u0006\bæ\u0001\u0010Ì\u0001R!\u0010ì\u0001\u001a\u00030è\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bé\u0001\u0010Ê\u0001\u001a\u0006\bê\u0001\u0010ë\u0001R!\u0010ï\u0001\u001a\u00030È\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bí\u0001\u0010Ê\u0001\u001a\u0006\bî\u0001\u0010Ì\u0001R!\u0010ò\u0001\u001a\u00030È\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bð\u0001\u0010Ê\u0001\u001a\u0006\bñ\u0001\u0010Ì\u0001R!\u0010õ\u0001\u001a\u00030È\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bó\u0001\u0010Ê\u0001\u001a\u0006\bô\u0001\u0010Ì\u0001R!\u0010ø\u0001\u001a\u00030È\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bö\u0001\u0010Ê\u0001\u001a\u0006\b÷\u0001\u0010Ì\u0001R!\u0010û\u0001\u001a\u00030È\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bù\u0001\u0010Ê\u0001\u001a\u0006\bú\u0001\u0010Ì\u0001R!\u0010þ\u0001\u001a\u00030È\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bü\u0001\u0010Ê\u0001\u001a\u0006\bý\u0001\u0010Ì\u0001R!\u0010\u0081\u0002\u001a\u00030È\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÿ\u0001\u0010Ê\u0001\u001a\u0006\b\u0080\u0002\u0010Ì\u0001R!\u0010\u0084\u0002\u001a\u00030È\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0082\u0002\u0010Ê\u0001\u001a\u0006\b\u0083\u0002\u0010Ì\u0001R!\u0010\u0087\u0002\u001a\u00030È\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0085\u0002\u0010Ê\u0001\u001a\u0006\b\u0086\u0002\u0010Ì\u0001R!\u0010\u008a\u0002\u001a\u00030È\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0088\u0002\u0010Ê\u0001\u001a\u0006\b\u0089\u0002\u0010Ì\u0001R \u0010\u008e\u0002\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u008b\u0002\u0010Ê\u0001\u001a\u0006\b\u008c\u0002\u0010\u008d\u0002R!\u0010\u0091\u0002\u001a\u00030È\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u008f\u0002\u0010Ê\u0001\u001a\u0006\b\u0090\u0002\u0010Ì\u0001R!\u0010\u0094\u0002\u001a\u00030È\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0092\u0002\u0010Ê\u0001\u001a\u0006\b\u0093\u0002\u0010Ì\u0001R!\u0010\u0097\u0002\u001a\u00030È\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0095\u0002\u0010Ê\u0001\u001a\u0006\b\u0096\u0002\u0010Ì\u0001R!\u0010\u009c\u0002\u001a\u00030\u0098\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0099\u0002\u0010Ê\u0001\u001a\u0006\b\u009a\u0002\u0010\u009b\u0002R!\u0010\u009f\u0002\u001a\u00030\u0098\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u009d\u0002\u0010Ê\u0001\u001a\u0006\b\u009e\u0002\u0010\u009b\u0002R!\u0010¢\u0002\u001a\u00030\u0098\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b \u0002\u0010Ê\u0001\u001a\u0006\b¡\u0002\u0010\u009b\u0002R!\u0010¥\u0002\u001a\u00030\u0098\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b£\u0002\u0010Ê\u0001\u001a\u0006\b¤\u0002\u0010\u009b\u0002R!\u0010ª\u0002\u001a\u00030¦\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b§\u0002\u0010Ê\u0001\u001a\u0006\b¨\u0002\u0010©\u0002R!\u0010\u00ad\u0002\u001a\u00030È\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b«\u0002\u0010Ê\u0001\u001a\u0006\b¬\u0002\u0010Ì\u0001R\u0019\u0010:\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b:\u0010®\u0002R\u001a\u0010°\u0002\u001a\u00030¯\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b°\u0002\u0010±\u0002R\u001a\u0010²\u0002\u001a\u00030¯\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b²\u0002\u0010±\u0002R\u001b\u0010³\u0002\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b³\u0002\u0010´\u0002R\u001c\u0010¶\u0002\u001a\u0005\u0018\u00010µ\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¶\u0002\u0010·\u0002R\"\u0010¹\u0002\u001a\u000b\u0012\u0004\u0012\u00020\u0015\u0018\u00010¸\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¹\u0002\u0010º\u0002R\u001c\u0010¼\u0002\u001a\u0005\u0018\u00010»\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¼\u0002\u0010½\u0002R\u001c\u0010¿\u0002\u001a\u0005\u0018\u00010¾\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¿\u0002\u0010À\u0002R\u001c\u0010Â\u0002\u001a\u0005\u0018\u00010Á\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÂ\u0002\u0010Ã\u0002R\u001a\u0010Ä\u0002\u001a\u00030¯\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÄ\u0002\u0010±\u0002R\u001c\u0010Æ\u0002\u001a\u0005\u0018\u00010Å\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÆ\u0002\u0010Ç\u0002R\u001b\u0010È\u0002\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÈ\u0002\u0010É\u0002R\u001a\u0010Ê\u0002\u001a\u00030¯\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÊ\u0002\u0010±\u0002R\u001c\u0010Ì\u0002\u001a\u0005\u0018\u00010Ë\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÌ\u0002\u0010Í\u0002R\u001b\u0010Î\u0002\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÎ\u0002\u0010Ï\u0002R5\u0010Ó\u0002\u001a \u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00020! Ò\u0002*\u000b\u0012\u0004\u0012\u00020!\u0018\u00010Ñ\u00020Ñ\u00020Ð\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÓ\u0002\u0010Ô\u0002R\u0018\u0010Ö\u0002\u001a\u00030Õ\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÖ\u0002\u0010×\u0002R\u0018\u0010Ù\u0002\u001a\u00030Ø\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÙ\u0002\u0010Ú\u0002R\u001a\u0010Û\u0002\u001a\u00030¯\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÛ\u0002\u0010±\u0002¨\u0006Þ\u0002"}, m3636d2 = {"Lcom/robinhood/equities/history/OrderDetailView;", "Lcom/robinhood/shared/iac/infobanner/InfoBannerCallbacks;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "refreshUi", "()V", "Lcom/robinhood/models/db/Order;", Card.Icon.ORDER, "Landroid/content/res/Resources;", "res", "", "trailingPegHelperText", "(Lcom/robinhood/models/db/Order;Landroid/content/res/Resources;)Ljava/lang/CharSequence;", "cancelOrder", "extendOrder", "Lcom/robinhood/models/db/Document;", "document", "viewTradeConfirmation", "(Lcom/robinhood/models/db/Document;)V", "showDirectIpoOrderNotAllocatedScreen", "(Lcom/robinhood/models/db/Order;)V", "logCancelOrderTap", "logReplaceOrderTap", "Lcom/robinhood/models/ui/UiOrder;", "Lcom/robinhood/rosetta/eventlogging/EquityOrderContext;", "toRosetta", "(Lcom/robinhood/models/ui/UiOrder;)Lcom/robinhood/rosetta/eventlogging/EquityOrderContext;", "Ljava/util/UUID;", OrderDetailView.SAVE_ORDER_ID, "bindOrder", "(Ljava/util/UUID;)V", "Landroid/os/Parcelable;", "onSaveInstanceState", "()Landroid/os/Parcelable;", "state", "onRestoreInstanceState", "(Landroid/os/Parcelable;)V", "onFinishInflate", "onAttachedToWindow", "onDetachedFromWindow", "", AnnotatedPrivateKey.LABEL, "valueText", "Lkotlin/Function0;", "onClick", "setTaxLotRowData", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "Lcom/robinhood/equities/history/OrderDetailView$Callbacks;", "callbacks", "setCallbacks", "(Lcom/robinhood/equities/history/OrderDetailView$Callbacks;)V", "Lcom/robinhood/android/common/util/UiCallbacks$ProgressDisplay;", "progressDisplay", "setProgressDisplay", "(Lcom/robinhood/android/common/util/UiCallbacks$ProgressDisplay;)V", "Lcom/robinhood/models/db/IacInfoBanner;", MerchantRewardDetailComposable.BANNER_TEST_TAG, "onClickInfoBanner", "(Lcom/robinhood/models/db/IacInfoBanner;)V", "onDismissInfoBanner", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "getRegionGateProvider", "()Lcom/robinhood/android/regiongate/RegionGateProvider;", "setRegionGateProvider", "(Lcom/robinhood/android/regiongate/RegionGateProvider;)V", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "getExperimentsStore", "()Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "setExperimentsStore", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;)V", "Lcom/robinhood/android/lib/account/AccountProvider;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "getAccountProvider", "()Lcom/robinhood/android/lib/account/AccountProvider;", "setAccountProvider", "(Lcom/robinhood/android/lib/account/AccountProvider;)V", "Lcom/robinhood/store/base/BackupWithholdingStore;", "backupWithholdingStore", "Lcom/robinhood/store/base/BackupWithholdingStore;", "getBackupWithholdingStore", "()Lcom/robinhood/store/base/BackupWithholdingStore;", "setBackupWithholdingStore", "(Lcom/robinhood/store/base/BackupWithholdingStore;)V", "Lcom/robinhood/librobinhood/data/store/DirectIpoShownOrderNotAllocatedStore;", "directIpoShownOrderNotAllocatedStore", "Lcom/robinhood/librobinhood/data/store/DirectIpoShownOrderNotAllocatedStore;", "getDirectIpoShownOrderNotAllocatedStore", "()Lcom/robinhood/librobinhood/data/store/DirectIpoShownOrderNotAllocatedStore;", "setDirectIpoShownOrderNotAllocatedStore", "(Lcom/robinhood/librobinhood/data/store/DirectIpoShownOrderNotAllocatedStore;)V", "Lcom/robinhood/librobinhood/data/store/DocumentStore;", "documentStore", "Lcom/robinhood/librobinhood/data/store/DocumentStore;", "getDocumentStore", "()Lcom/robinhood/librobinhood/data/store/DocumentStore;", "setDocumentStore", "(Lcom/robinhood/librobinhood/data/store/DocumentStore;)V", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "getInstrumentStore", "()Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "setInstrumentStore", "(Lcom/robinhood/librobinhood/data/store/InstrumentStore;)V", "Lcom/robinhood/store/base/InvestmentScheduleEventStore;", "investmentScheduleEventStore", "Lcom/robinhood/store/base/InvestmentScheduleEventStore;", "getInvestmentScheduleEventStore", "()Lcom/robinhood/store/base/InvestmentScheduleEventStore;", "setInvestmentScheduleEventStore", "(Lcom/robinhood/store/base/InvestmentScheduleEventStore;)V", "Lcom/robinhood/librobinhood/data/store/OrderStore;", "orderStore", "Lcom/robinhood/librobinhood/data/store/OrderStore;", "getOrderStore", "()Lcom/robinhood/librobinhood/data/store/OrderStore;", "setOrderStore", "(Lcom/robinhood/librobinhood/data/store/OrderStore;)V", "Lcom/robinhood/librobinhood/data/store/PositionStore;", "positionStore", "Lcom/robinhood/librobinhood/data/store/PositionStore;", "getPositionStore", "()Lcom/robinhood/librobinhood/data/store/PositionStore;", "setPositionStore", "(Lcom/robinhood/librobinhood/data/store/PositionStore;)V", "Lcom/robinhood/android/portfolio/pnl/ProfitAndLossDetailStore;", "profitAndLossDetailStore", "Lcom/robinhood/android/portfolio/pnl/ProfitAndLossDetailStore;", "getProfitAndLossDetailStore", "()Lcom/robinhood/android/portfolio/pnl/ProfitAndLossDetailStore;", "setProfitAndLossDetailStore", "(Lcom/robinhood/android/portfolio/pnl/ProfitAndLossDetailStore;)V", "Lcom/robinhood/android/navigation/Navigator;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "getNavigator", "()Lcom/robinhood/android/navigation/Navigator;", "setNavigator", "(Lcom/robinhood/android/navigation/Navigator;)V", "Lcom/robinhood/android/markethours/data/store/MarketHoursStore;", "marketHoursStore", "Lcom/robinhood/android/markethours/data/store/MarketHoursStore;", "getMarketHoursStore", "()Lcom/robinhood/android/markethours/data/store/MarketHoursStore;", "setMarketHoursStore", "(Lcom/robinhood/android/markethours/data/store/MarketHoursStore;)V", "Lcom/robinhood/analytics/EventLogger;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "Lcom/robinhood/shared/history/equities/EquityHistoryLogger;", "equityHistoryLogger", "Lcom/robinhood/shared/history/equities/EquityHistoryLogger;", "getEquityHistoryLogger", "()Lcom/robinhood/shared/history/equities/EquityHistoryLogger;", "setEquityHistoryLogger", "(Lcom/robinhood/shared/history/equities/EquityHistoryLogger;)V", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "getRxFactory", "()Lcom/robinhood/coroutines/rx/RxFactory;", "setRxFactory", "(Lcom/robinhood/coroutines/rx/RxFactory;)V", "j$/time/Clock", Card.Icon.CLOCK, "Lj$/time/Clock;", "getClock", "()Lj$/time/Clock;", "setClock", "(Lj$/time/Clock;)V", "Lcom/robinhood/shared/data/store/iac/IacInfoBannerStore;", "iacInfoBannerStore", "Lcom/robinhood/shared/data/store/iac/IacInfoBannerStore;", "getIacInfoBannerStore", "()Lcom/robinhood/shared/data/store/iac/IacInfoBannerStore;", "setIacInfoBannerStore", "(Lcom/robinhood/shared/data/store/iac/IacInfoBannerStore;)V", "Lcom/robinhood/shared/equities/store/subzero/EquitySsrStore;", "equitySsrStore", "Lcom/robinhood/shared/equities/store/subzero/EquitySsrStore;", "getEquitySsrStore", "()Lcom/robinhood/shared/equities/store/subzero/EquitySsrStore;", "setEquitySsrStore", "(Lcom/robinhood/shared/equities/store/subzero/EquitySsrStore;)V", "Lcom/robinhood/equities/history/OrderDetailView$Callbacks;", "Lcom/robinhood/android/designsystem/row/RdsDataRowView;", "accountUsedSection$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getAccountUsedSection", "()Lcom/robinhood/android/designsystem/row/RdsDataRowView;", "accountUsedSection", "linkedAppSection$delegate", "getLinkedAppSection", "linkedAppSection", "timeInForceSection$delegate", "getTimeInForceSection", "timeInForceSection", "enteredInSection$delegate", "getEnteredInSection", "enteredInSection", "orderDateSection$delegate", "getOrderDateSection", "orderDateSection", "Lcom/robinhood/android/designsystem/text/RhTextView;", "orderErrorStatusSection$delegate", "getOrderErrorStatusSection", "()Lcom/robinhood/android/designsystem/text/RhTextView;", "orderErrorStatusSection", "orderTrailMarketPrice$delegate", "getOrderTrailMarketPrice", "orderTrailMarketPrice", "orderTrailAmount$delegate", "getOrderTrailAmount", "orderTrailAmount", "orderCurrentTrailPrice$delegate", "getOrderCurrentTrailPrice", "orderCurrentTrailPrice", "Lcom/robinhood/android/designsystem/banner/RdsInfoBannerView;", "infoBannerView$delegate", "getInfoBannerView", "()Lcom/robinhood/android/designsystem/banner/RdsInfoBannerView;", "infoBannerView", "orderStatusSection$delegate", "getOrderStatusSection", "orderStatusSection", "orderStopPriceSection$delegate", "getOrderStopPriceSection", "orderStopPriceSection", "orderLimitPriceSection$delegate", "getOrderLimitPriceSection", "orderLimitPriceSection", "orderQuantitySection$delegate", "getOrderQuantitySection", "orderQuantitySection", "orderAmountSection$delegate", "getOrderAmountSection", "orderAmountSection", "filledDateSection$delegate", "getFilledDateSection", "filledDateSection", "filledQuantitySection$delegate", "getFilledQuantitySection", "filledQuantitySection", "settlementDateSection$delegate", "getSettlementDateSection", "settlementDateSection", "totalNotionalSection$delegate", "getTotalNotionalSection", "totalNotionalSection", "regulatoryFeeSection$delegate", "getRegulatoryFeeSection", "regulatoryFeeSection", "salesTaxContainer$delegate", "getSalesTaxContainer", "()Landroid/widget/LinearLayout;", "salesTaxContainer", "backupWithholdingSection$delegate", "getBackupWithholdingSection", "backupWithholdingSection", "netCreditSection$delegate", "getNetCreditSection", "netCreditSection", "realizedProfitLossSection$delegate", "getRealizedProfitLossSection", "realizedProfitLossSection", "Landroid/widget/TextView;", "extendBtn$delegate", "getExtendBtn", "()Landroid/widget/TextView;", "extendBtn", "helperTxt$delegate", "getHelperTxt", "helperTxt", "viewConfirmationBtn$delegate", "getViewConfirmationBtn", "viewConfirmationBtn", "responseCategoryTxt$delegate", "getResponseCategoryTxt", "responseCategoryTxt", "Lcom/robinhood/android/designsystem/button/RdsButtonBarView;", "ctaButtonBar$delegate", "getCtaButtonBar", "()Lcom/robinhood/android/designsystem/button/RdsButtonBarView;", "ctaButtonBar", "taxLotsSection$delegate", "getTaxLotsSection", "taxLotsSection", "Lcom/robinhood/android/common/util/UiCallbacks$ProgressDisplay;", "", "isPreIpo", "Z", "shouldShowExplanation", "uiOrder", "Lcom/robinhood/models/ui/UiOrder;", "Lcom/robinhood/recurring/models/ui/UiInvestmentScheduleEvent;", "uiInvestmentScheduleEvent", "Lcom/robinhood/recurring/models/ui/UiInvestmentScheduleEvent;", "", "tradeConfirmDocs", "Ljava/util/List;", "Lcom/robinhood/models/db/Account;", "account", "Lcom/robinhood/models/db/Account;", "Lcom/robinhood/models/db/MarketHours;", "nextOpenHours", "Lcom/robinhood/models/db/MarketHours;", "Lcom/robinhood/models/db/bonfire/WithholdingAmount;", "backupWithholdingResponse", "Lcom/robinhood/models/db/bonfire/WithholdingAmount;", "hasTaxLotData", "Lkotlinx/coroutines/Job;", "withholdingJob", "Lkotlinx/coroutines/Job;", "instrumentType", "Ljava/lang/String;", "memberOfEquitiesSubzeroCancelNewExperiment", "Lcom/robinhood/shared/equities/subzero/ApiEquitySsrData;", "equitySsr", "Lcom/robinhood/shared/equities/subzero/ApiEquitySsrData;", "iacInfoBanner", "Lcom/robinhood/models/db/IacInfoBanner;", "Lio/reactivex/subjects/BehaviorSubject;", "Lcom/robinhood/utils/Optional;", "kotlin.jvm.PlatformType", "orderIdSubject", "Lio/reactivex/subjects/BehaviorSubject;", "Lcom/robinhood/rosetta/eventlogging/Screen;", "screen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "Lcom/robinhood/rosetta/eventlogging/Component;", "feeSectionComponent", "Lcom/robinhood/rosetta/eventlogging/Component;", "feesAppearLogged", "Companion", "Callbacks", "lib-equity-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes15.dex */
public final class OrderDetailView extends Hammer_OrderDetailView implements InfoBannerCallbacks {
    public static final int $stable = 0;
    private static final String SAVE_ORDER_ID = "orderId";
    private static final String SAVE_SUPER_STATE = "superState";
    private Account account;
    public AccountProvider accountProvider;

    /* renamed from: accountUsedSection$delegate, reason: from kotlin metadata */
    private final Interfaces2 accountUsedSection;
    private WithholdingAmount backupWithholdingResponse;

    /* renamed from: backupWithholdingSection$delegate, reason: from kotlin metadata */
    private final Interfaces2 backupWithholdingSection;
    public BackupWithholdingStore backupWithholdingStore;
    private Callbacks callbacks;
    public Clock clock;

    /* renamed from: ctaButtonBar$delegate, reason: from kotlin metadata */
    private final Interfaces2 ctaButtonBar;
    public DirectIpoShownOrderNotAllocatedStore directIpoShownOrderNotAllocatedStore;
    public DocumentStore documentStore;

    /* renamed from: enteredInSection$delegate, reason: from kotlin metadata */
    private final Interfaces2 enteredInSection;
    public EquityHistoryLogger equityHistoryLogger;
    private ApiEquitySsrData equitySsr;
    public EquitySsrStore equitySsrStore;
    public EventLogger eventLogger;
    public ExperimentsStore experimentsStore;

    /* renamed from: extendBtn$delegate, reason: from kotlin metadata */
    private final Interfaces2 extendBtn;
    private final Component feeSectionComponent;
    private boolean feesAppearLogged;

    /* renamed from: filledDateSection$delegate, reason: from kotlin metadata */
    private final Interfaces2 filledDateSection;

    /* renamed from: filledQuantitySection$delegate, reason: from kotlin metadata */
    private final Interfaces2 filledQuantitySection;
    private boolean hasTaxLotData;

    /* renamed from: helperTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 helperTxt;
    private IacInfoBanner iacInfoBanner;
    public IacInfoBannerStore iacInfoBannerStore;

    /* renamed from: infoBannerView$delegate, reason: from kotlin metadata */
    private final Interfaces2 infoBannerView;
    public InstrumentStore instrumentStore;
    private String instrumentType;
    public InvestmentScheduleEventStore investmentScheduleEventStore;
    private boolean isPreIpo;

    /* renamed from: linkedAppSection$delegate, reason: from kotlin metadata */
    private final Interfaces2 linkedAppSection;
    public MarketHoursStore marketHoursStore;
    private boolean memberOfEquitiesSubzeroCancelNewExperiment;
    public Navigator navigator;

    /* renamed from: netCreditSection$delegate, reason: from kotlin metadata */
    private final Interfaces2 netCreditSection;
    private MarketHours nextOpenHours;

    /* renamed from: orderAmountSection$delegate, reason: from kotlin metadata */
    private final Interfaces2 orderAmountSection;

    /* renamed from: orderCurrentTrailPrice$delegate, reason: from kotlin metadata */
    private final Interfaces2 orderCurrentTrailPrice;

    /* renamed from: orderDateSection$delegate, reason: from kotlin metadata */
    private final Interfaces2 orderDateSection;

    /* renamed from: orderErrorStatusSection$delegate, reason: from kotlin metadata */
    private final Interfaces2 orderErrorStatusSection;
    private final BehaviorSubject<Optional<UUID>> orderIdSubject;

    /* renamed from: orderLimitPriceSection$delegate, reason: from kotlin metadata */
    private final Interfaces2 orderLimitPriceSection;

    /* renamed from: orderQuantitySection$delegate, reason: from kotlin metadata */
    private final Interfaces2 orderQuantitySection;

    /* renamed from: orderStatusSection$delegate, reason: from kotlin metadata */
    private final Interfaces2 orderStatusSection;

    /* renamed from: orderStopPriceSection$delegate, reason: from kotlin metadata */
    private final Interfaces2 orderStopPriceSection;
    public OrderStore orderStore;

    /* renamed from: orderTrailAmount$delegate, reason: from kotlin metadata */
    private final Interfaces2 orderTrailAmount;

    /* renamed from: orderTrailMarketPrice$delegate, reason: from kotlin metadata */
    private final Interfaces2 orderTrailMarketPrice;
    public PositionStore positionStore;
    public ProfitAndLossDetailStore profitAndLossDetailStore;
    private UiCallbacks.ProgressDisplay progressDisplay;

    /* renamed from: realizedProfitLossSection$delegate, reason: from kotlin metadata */
    private final Interfaces2 realizedProfitLossSection;
    public RegionGateProvider regionGateProvider;

    /* renamed from: regulatoryFeeSection$delegate, reason: from kotlin metadata */
    private final Interfaces2 regulatoryFeeSection;

    /* renamed from: responseCategoryTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 responseCategoryTxt;
    public RxFactory rxFactory;

    /* renamed from: salesTaxContainer$delegate, reason: from kotlin metadata */
    private final Interfaces2 salesTaxContainer;
    private final Screen screen;

    /* renamed from: settlementDateSection$delegate, reason: from kotlin metadata */
    private final Interfaces2 settlementDateSection;
    private boolean shouldShowExplanation;

    /* renamed from: taxLotsSection$delegate, reason: from kotlin metadata */
    private final Interfaces2 taxLotsSection;

    /* renamed from: timeInForceSection$delegate, reason: from kotlin metadata */
    private final Interfaces2 timeInForceSection;

    /* renamed from: totalNotionalSection$delegate, reason: from kotlin metadata */
    private final Interfaces2 totalNotionalSection;
    private List<Document> tradeConfirmDocs;
    private UiInvestmentScheduleEvent uiInvestmentScheduleEvent;
    private UiOrder uiOrder;

    /* renamed from: viewConfirmationBtn$delegate, reason: from kotlin metadata */
    private final Interfaces2 viewConfirmationBtn;
    private Job withholdingJob;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(OrderDetailView.class, "accountUsedSection", "getAccountUsedSection()Lcom/robinhood/android/designsystem/row/RdsDataRowView;", 0)), Reflection.property1(new PropertyReference1Impl(OrderDetailView.class, "linkedAppSection", "getLinkedAppSection()Lcom/robinhood/android/designsystem/row/RdsDataRowView;", 0)), Reflection.property1(new PropertyReference1Impl(OrderDetailView.class, "timeInForceSection", "getTimeInForceSection()Lcom/robinhood/android/designsystem/row/RdsDataRowView;", 0)), Reflection.property1(new PropertyReference1Impl(OrderDetailView.class, "enteredInSection", "getEnteredInSection()Lcom/robinhood/android/designsystem/row/RdsDataRowView;", 0)), Reflection.property1(new PropertyReference1Impl(OrderDetailView.class, "orderDateSection", "getOrderDateSection()Lcom/robinhood/android/designsystem/row/RdsDataRowView;", 0)), Reflection.property1(new PropertyReference1Impl(OrderDetailView.class, "orderErrorStatusSection", "getOrderErrorStatusSection()Lcom/robinhood/android/designsystem/text/RhTextView;", 0)), Reflection.property1(new PropertyReference1Impl(OrderDetailView.class, "orderTrailMarketPrice", "getOrderTrailMarketPrice()Lcom/robinhood/android/designsystem/row/RdsDataRowView;", 0)), Reflection.property1(new PropertyReference1Impl(OrderDetailView.class, "orderTrailAmount", "getOrderTrailAmount()Lcom/robinhood/android/designsystem/row/RdsDataRowView;", 0)), Reflection.property1(new PropertyReference1Impl(OrderDetailView.class, "orderCurrentTrailPrice", "getOrderCurrentTrailPrice()Lcom/robinhood/android/designsystem/row/RdsDataRowView;", 0)), Reflection.property1(new PropertyReference1Impl(OrderDetailView.class, "infoBannerView", "getInfoBannerView()Lcom/robinhood/android/designsystem/banner/RdsInfoBannerView;", 0)), Reflection.property1(new PropertyReference1Impl(OrderDetailView.class, "orderStatusSection", "getOrderStatusSection()Lcom/robinhood/android/designsystem/row/RdsDataRowView;", 0)), Reflection.property1(new PropertyReference1Impl(OrderDetailView.class, "orderStopPriceSection", "getOrderStopPriceSection()Lcom/robinhood/android/designsystem/row/RdsDataRowView;", 0)), Reflection.property1(new PropertyReference1Impl(OrderDetailView.class, "orderLimitPriceSection", "getOrderLimitPriceSection()Lcom/robinhood/android/designsystem/row/RdsDataRowView;", 0)), Reflection.property1(new PropertyReference1Impl(OrderDetailView.class, "orderQuantitySection", "getOrderQuantitySection()Lcom/robinhood/android/designsystem/row/RdsDataRowView;", 0)), Reflection.property1(new PropertyReference1Impl(OrderDetailView.class, "orderAmountSection", "getOrderAmountSection()Lcom/robinhood/android/designsystem/row/RdsDataRowView;", 0)), Reflection.property1(new PropertyReference1Impl(OrderDetailView.class, "filledDateSection", "getFilledDateSection()Lcom/robinhood/android/designsystem/row/RdsDataRowView;", 0)), Reflection.property1(new PropertyReference1Impl(OrderDetailView.class, "filledQuantitySection", "getFilledQuantitySection()Lcom/robinhood/android/designsystem/row/RdsDataRowView;", 0)), Reflection.property1(new PropertyReference1Impl(OrderDetailView.class, "settlementDateSection", "getSettlementDateSection()Lcom/robinhood/android/designsystem/row/RdsDataRowView;", 0)), Reflection.property1(new PropertyReference1Impl(OrderDetailView.class, "totalNotionalSection", "getTotalNotionalSection()Lcom/robinhood/android/designsystem/row/RdsDataRowView;", 0)), Reflection.property1(new PropertyReference1Impl(OrderDetailView.class, "regulatoryFeeSection", "getRegulatoryFeeSection()Lcom/robinhood/android/designsystem/row/RdsDataRowView;", 0)), Reflection.property1(new PropertyReference1Impl(OrderDetailView.class, "salesTaxContainer", "getSalesTaxContainer()Landroid/widget/LinearLayout;", 0)), Reflection.property1(new PropertyReference1Impl(OrderDetailView.class, "backupWithholdingSection", "getBackupWithholdingSection()Lcom/robinhood/android/designsystem/row/RdsDataRowView;", 0)), Reflection.property1(new PropertyReference1Impl(OrderDetailView.class, "netCreditSection", "getNetCreditSection()Lcom/robinhood/android/designsystem/row/RdsDataRowView;", 0)), Reflection.property1(new PropertyReference1Impl(OrderDetailView.class, "realizedProfitLossSection", "getRealizedProfitLossSection()Lcom/robinhood/android/designsystem/row/RdsDataRowView;", 0)), Reflection.property1(new PropertyReference1Impl(OrderDetailView.class, "extendBtn", "getExtendBtn()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(OrderDetailView.class, "helperTxt", "getHelperTxt()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(OrderDetailView.class, "viewConfirmationBtn", "getViewConfirmationBtn()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(OrderDetailView.class, "responseCategoryTxt", "getResponseCategoryTxt()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(OrderDetailView.class, "ctaButtonBar", "getCtaButtonBar()Lcom/robinhood/android/designsystem/button/RdsButtonBarView;", 0)), Reflection.property1(new PropertyReference1Impl(OrderDetailView.class, "taxLotsSection", "getTaxLotsSection()Lcom/robinhood/android/designsystem/row/RdsDataRowView;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: OrderDetailView.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/equities/history/OrderDetailView$Callbacks;", "", "onShowProfitAndLossDetail", "", "accountNumber", "", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossTradeItem;", "lib-equity-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onShowProfitAndLossDetail(String accountNumber, ProfitAndLossTradeItem item);
    }

    /* compiled from: OrderDetailView.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;
        public static final /* synthetic */ int[] $EnumSwitchMapping$5;

        static {
            int[] iArr = new int[OrderTrailingPeg.TrailingPegType.values().length];
            try {
                iArr[OrderTrailingPeg.TrailingPegType.PRICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderTrailingPeg.TrailingPegType.PERCENTAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[EquityOrderSide.values().length];
            try {
                iArr2[EquityOrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[EquityOrderSide.SELL_SHORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EquityOrderSide.SELL.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[ApiOrder.ResponseCategory.values().length];
            try {
                iArr3[ApiOrder.ResponseCategory.END_OF_DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[ApiOrder.ResponseCategory.CORPORATE_ACTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[ApiOrder.ResponseCategory.STALE_GOOD_TILL_CLOSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[TaxWithholdingCategory.values().length];
            try {
                iArr4[TaxWithholdingCategory.TAX_WITHHOLDING_STATUS_UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr4[TaxWithholdingCategory.NRA.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr4[TaxWithholdingCategory.B_NOTICE.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[TaxWithholdingCategory.C_NOTICE.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[TaxWithholdingCategory.UNCERTIFIED.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr4[TaxWithholdingCategory.W8_EXPIRED.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[TaxWithholdingCategory.NONE.ordinal()] = 7;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[Order.Configuration.values().length];
            try {
                iArr5[Order.Configuration.MARKET.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr5[Order.Configuration.SIMPLE_LIMIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr5[Order.Configuration.LIMIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr5[Order.Configuration.STOP_LOSS.ordinal()] = 4;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr5[Order.Configuration.STOP_LIMIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr5[Order.Configuration.TRAILING_STOP.ordinal()] = 6;
            } catch (NoSuchFieldError unused21) {
            }
            $EnumSwitchMapping$4 = iArr5;
            int[] iArr6 = new int[OrderTrailPriceSource.values().length];
            try {
                iArr6[OrderTrailPriceSource.VENUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr6[OrderTrailPriceSource.MARKET_DATA.ordinal()] = 2;
            } catch (NoSuchFieldError unused23) {
            }
            $EnumSwitchMapping$5 = iArr6;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderDetailView(Context context, AttributeSet attrs) {
        super(context, attrs, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.accountUsedSection = BindViewDelegate2.bindView$default(this, C33130R.id.order_detail_account_used, null, 2, null);
        this.linkedAppSection = BindViewDelegate2.bindView$default(this, C33130R.id.order_detail_linked_app, null, 2, null);
        this.timeInForceSection = BindViewDelegate2.bindView$default(this, C33130R.id.order_detail_time_in_force, null, 2, null);
        this.enteredInSection = BindViewDelegate2.bindView$default(this, C33130R.id.order_detail_entered_in, null, 2, null);
        this.orderDateSection = BindViewDelegate2.bindView$default(this, C33130R.id.order_detail_order_date, null, 2, null);
        this.orderErrorStatusSection = BindViewDelegate2.bindView$default(this, C33130R.id.order_detail_order_error_status, null, 2, null);
        this.orderTrailMarketPrice = BindViewDelegate2.bindView$default(this, C33130R.id.order_detail_trail_market_price, null, 2, null);
        this.orderTrailAmount = BindViewDelegate2.bindView$default(this, C33130R.id.order_detail_trail_amount, null, 2, null);
        this.orderCurrentTrailPrice = BindViewDelegate2.bindView$default(this, C33130R.id.order_detail_current_trail_price, null, 2, null);
        this.infoBannerView = BindViewDelegate2.bindView$default(this, C33130R.id.order_detail_info_banner, null, 2, null);
        this.orderStatusSection = BindViewDelegate2.bindView$default(this, C33130R.id.order_detail_order_status, null, 2, null);
        this.orderStopPriceSection = BindViewDelegate2.bindView$default(this, C33130R.id.order_detail_order_stop_price, null, 2, null);
        this.orderLimitPriceSection = BindViewDelegate2.bindView$default(this, C33130R.id.order_detail_order_limit_price, null, 2, null);
        this.orderQuantitySection = BindViewDelegate2.bindView$default(this, C33130R.id.order_detail_order_quantity, null, 2, null);
        this.orderAmountSection = BindViewDelegate2.bindView$default(this, C33130R.id.order_detail_order_amount, null, 2, null);
        this.filledDateSection = BindViewDelegate2.bindView$default(this, C33130R.id.order_detail_filled_date, null, 2, null);
        this.filledQuantitySection = BindViewDelegate2.bindView$default(this, C33130R.id.order_detail_filled_quantity, null, 2, null);
        this.settlementDateSection = BindViewDelegate2.bindView$default(this, C33130R.id.order_detail_settlement_date, null, 2, null);
        this.totalNotionalSection = BindViewDelegate2.bindView$default(this, C33130R.id.order_detail_total_notional, null, 2, null);
        this.regulatoryFeeSection = BindViewDelegate2.bindView$default(this, C33130R.id.order_detail_regulatory_fee, null, 2, null);
        this.salesTaxContainer = BindViewDelegate2.bindView$default(this, C33130R.id.order_detail_sales_tax_container, null, 2, null);
        this.backupWithholdingSection = BindViewDelegate2.bindView$default(this, C33130R.id.order_detail_backup_withholding, null, 2, null);
        this.netCreditSection = BindViewDelegate2.bindView$default(this, C33130R.id.order_detail_net_credit, null, 2, null);
        this.realizedProfitLossSection = BindViewDelegate2.bindView$default(this, C33130R.id.order_detail_realized_profit_loss, null, 2, null);
        this.extendBtn = BindViewDelegate2.bindView$default(this, C33130R.id.order_detail_extend_btn, null, 2, null);
        this.helperTxt = BindViewDelegate2.bindView$default(this, C33130R.id.order_detail_helper_txt, null, 2, null);
        this.viewConfirmationBtn = BindViewDelegate2.bindView$default(this, C33130R.id.order_detail_trade_confirmation_btn, null, 2, null);
        this.responseCategoryTxt = BindViewDelegate2.bindView$default(this, C33130R.id.order_detail_response_category, null, 2, null);
        this.ctaButtonBar = BindViewDelegate2.bindView$default(this, C33130R.id.order_detail_cta_button_bar, null, 2, null);
        this.taxLotsSection = BindViewDelegate2.bindView$default(this, C33130R.id.order_detail_tax_lots, null, 2, null);
        BehaviorSubject<Optional<UUID>> behaviorSubjectCreateDefault = BehaviorSubject.createDefault(Optional2.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(behaviorSubjectCreateDefault, "createDefault(...)");
        this.orderIdSubject = behaviorSubjectCreateDefault;
        this.screen = new Screen(Screen.Name.EQUITY_ORDER_DETAIL, null, null, null, 14, null);
        Component.ComponentType componentType = Component.ComponentType.ROW;
        String str = "order_fees";
        this.feeSectionComponent = new Component(componentType, str, null, 4, null);
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

    public final ExperimentsStore getExperimentsStore() {
        ExperimentsStore experimentsStore = this.experimentsStore;
        if (experimentsStore != null) {
            return experimentsStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("experimentsStore");
        return null;
    }

    public final void setExperimentsStore(ExperimentsStore experimentsStore) {
        Intrinsics.checkNotNullParameter(experimentsStore, "<set-?>");
        this.experimentsStore = experimentsStore;
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

    public final BackupWithholdingStore getBackupWithholdingStore() {
        BackupWithholdingStore backupWithholdingStore = this.backupWithholdingStore;
        if (backupWithholdingStore != null) {
            return backupWithholdingStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("backupWithholdingStore");
        return null;
    }

    public final void setBackupWithholdingStore(BackupWithholdingStore backupWithholdingStore) {
        Intrinsics.checkNotNullParameter(backupWithholdingStore, "<set-?>");
        this.backupWithholdingStore = backupWithholdingStore;
    }

    public final DirectIpoShownOrderNotAllocatedStore getDirectIpoShownOrderNotAllocatedStore() {
        DirectIpoShownOrderNotAllocatedStore directIpoShownOrderNotAllocatedStore = this.directIpoShownOrderNotAllocatedStore;
        if (directIpoShownOrderNotAllocatedStore != null) {
            return directIpoShownOrderNotAllocatedStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("directIpoShownOrderNotAllocatedStore");
        return null;
    }

    public final void setDirectIpoShownOrderNotAllocatedStore(DirectIpoShownOrderNotAllocatedStore directIpoShownOrderNotAllocatedStore) {
        Intrinsics.checkNotNullParameter(directIpoShownOrderNotAllocatedStore, "<set-?>");
        this.directIpoShownOrderNotAllocatedStore = directIpoShownOrderNotAllocatedStore;
    }

    public final DocumentStore getDocumentStore() {
        DocumentStore documentStore = this.documentStore;
        if (documentStore != null) {
            return documentStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("documentStore");
        return null;
    }

    public final void setDocumentStore(DocumentStore documentStore) {
        Intrinsics.checkNotNullParameter(documentStore, "<set-?>");
        this.documentStore = documentStore;
    }

    public final InstrumentStore getInstrumentStore() {
        InstrumentStore instrumentStore = this.instrumentStore;
        if (instrumentStore != null) {
            return instrumentStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("instrumentStore");
        return null;
    }

    public final void setInstrumentStore(InstrumentStore instrumentStore) {
        Intrinsics.checkNotNullParameter(instrumentStore, "<set-?>");
        this.instrumentStore = instrumentStore;
    }

    public final InvestmentScheduleEventStore getInvestmentScheduleEventStore() {
        InvestmentScheduleEventStore investmentScheduleEventStore = this.investmentScheduleEventStore;
        if (investmentScheduleEventStore != null) {
            return investmentScheduleEventStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("investmentScheduleEventStore");
        return null;
    }

    public final void setInvestmentScheduleEventStore(InvestmentScheduleEventStore investmentScheduleEventStore) {
        Intrinsics.checkNotNullParameter(investmentScheduleEventStore, "<set-?>");
        this.investmentScheduleEventStore = investmentScheduleEventStore;
    }

    public final OrderStore getOrderStore() {
        OrderStore orderStore = this.orderStore;
        if (orderStore != null) {
            return orderStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("orderStore");
        return null;
    }

    public final void setOrderStore(OrderStore orderStore) {
        Intrinsics.checkNotNullParameter(orderStore, "<set-?>");
        this.orderStore = orderStore;
    }

    public final PositionStore getPositionStore() {
        PositionStore positionStore = this.positionStore;
        if (positionStore != null) {
            return positionStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("positionStore");
        return null;
    }

    public final void setPositionStore(PositionStore positionStore) {
        Intrinsics.checkNotNullParameter(positionStore, "<set-?>");
        this.positionStore = positionStore;
    }

    public final ProfitAndLossDetailStore getProfitAndLossDetailStore() {
        ProfitAndLossDetailStore profitAndLossDetailStore = this.profitAndLossDetailStore;
        if (profitAndLossDetailStore != null) {
            return profitAndLossDetailStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("profitAndLossDetailStore");
        return null;
    }

    public final void setProfitAndLossDetailStore(ProfitAndLossDetailStore profitAndLossDetailStore) {
        Intrinsics.checkNotNullParameter(profitAndLossDetailStore, "<set-?>");
        this.profitAndLossDetailStore = profitAndLossDetailStore;
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

    public final MarketHoursStore getMarketHoursStore() {
        MarketHoursStore marketHoursStore = this.marketHoursStore;
        if (marketHoursStore != null) {
            return marketHoursStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("marketHoursStore");
        return null;
    }

    public final void setMarketHoursStore(MarketHoursStore marketHoursStore) {
        Intrinsics.checkNotNullParameter(marketHoursStore, "<set-?>");
        this.marketHoursStore = marketHoursStore;
    }

    public final EventLogger getEventLogger() {
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            return eventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void setEventLogger(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "<set-?>");
        this.eventLogger = eventLogger;
    }

    public final EquityHistoryLogger getEquityHistoryLogger() {
        EquityHistoryLogger equityHistoryLogger = this.equityHistoryLogger;
        if (equityHistoryLogger != null) {
            return equityHistoryLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("equityHistoryLogger");
        return null;
    }

    public final void setEquityHistoryLogger(EquityHistoryLogger equityHistoryLogger) {
        Intrinsics.checkNotNullParameter(equityHistoryLogger, "<set-?>");
        this.equityHistoryLogger = equityHistoryLogger;
    }

    public final RxFactory getRxFactory() {
        RxFactory rxFactory = this.rxFactory;
        if (rxFactory != null) {
            return rxFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rxFactory");
        return null;
    }

    public final void setRxFactory(RxFactory rxFactory) {
        Intrinsics.checkNotNullParameter(rxFactory, "<set-?>");
        this.rxFactory = rxFactory;
    }

    public final Clock getClock() {
        Clock clock = this.clock;
        if (clock != null) {
            return clock;
        }
        Intrinsics.throwUninitializedPropertyAccessException(Card.Icon.CLOCK);
        return null;
    }

    public final void setClock(Clock clock) {
        Intrinsics.checkNotNullParameter(clock, "<set-?>");
        this.clock = clock;
    }

    public final IacInfoBannerStore getIacInfoBannerStore() {
        IacInfoBannerStore iacInfoBannerStore = this.iacInfoBannerStore;
        if (iacInfoBannerStore != null) {
            return iacInfoBannerStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("iacInfoBannerStore");
        return null;
    }

    public final void setIacInfoBannerStore(IacInfoBannerStore iacInfoBannerStore) {
        Intrinsics.checkNotNullParameter(iacInfoBannerStore, "<set-?>");
        this.iacInfoBannerStore = iacInfoBannerStore;
    }

    public final EquitySsrStore getEquitySsrStore() {
        EquitySsrStore equitySsrStore = this.equitySsrStore;
        if (equitySsrStore != null) {
            return equitySsrStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("equitySsrStore");
        return null;
    }

    public final void setEquitySsrStore(EquitySsrStore equitySsrStore) {
        Intrinsics.checkNotNullParameter(equitySsrStore, "<set-?>");
        this.equitySsrStore = equitySsrStore;
    }

    private final RdsDataRowView getAccountUsedSection() {
        return (RdsDataRowView) this.accountUsedSection.getValue(this, $$delegatedProperties[0]);
    }

    private final RdsDataRowView getLinkedAppSection() {
        return (RdsDataRowView) this.linkedAppSection.getValue(this, $$delegatedProperties[1]);
    }

    private final RdsDataRowView getTimeInForceSection() {
        return (RdsDataRowView) this.timeInForceSection.getValue(this, $$delegatedProperties[2]);
    }

    private final RdsDataRowView getEnteredInSection() {
        return (RdsDataRowView) this.enteredInSection.getValue(this, $$delegatedProperties[3]);
    }

    private final RdsDataRowView getOrderDateSection() {
        return (RdsDataRowView) this.orderDateSection.getValue(this, $$delegatedProperties[4]);
    }

    private final RhTextView getOrderErrorStatusSection() {
        return (RhTextView) this.orderErrorStatusSection.getValue(this, $$delegatedProperties[5]);
    }

    private final RdsDataRowView getOrderTrailMarketPrice() {
        return (RdsDataRowView) this.orderTrailMarketPrice.getValue(this, $$delegatedProperties[6]);
    }

    private final RdsDataRowView getOrderTrailAmount() {
        return (RdsDataRowView) this.orderTrailAmount.getValue(this, $$delegatedProperties[7]);
    }

    private final RdsDataRowView getOrderCurrentTrailPrice() {
        return (RdsDataRowView) this.orderCurrentTrailPrice.getValue(this, $$delegatedProperties[8]);
    }

    private final RdsInfoBannerView getInfoBannerView() {
        return (RdsInfoBannerView) this.infoBannerView.getValue(this, $$delegatedProperties[9]);
    }

    private final RdsDataRowView getOrderStatusSection() {
        return (RdsDataRowView) this.orderStatusSection.getValue(this, $$delegatedProperties[10]);
    }

    private final RdsDataRowView getOrderStopPriceSection() {
        return (RdsDataRowView) this.orderStopPriceSection.getValue(this, $$delegatedProperties[11]);
    }

    private final RdsDataRowView getOrderLimitPriceSection() {
        return (RdsDataRowView) this.orderLimitPriceSection.getValue(this, $$delegatedProperties[12]);
    }

    private final RdsDataRowView getOrderQuantitySection() {
        return (RdsDataRowView) this.orderQuantitySection.getValue(this, $$delegatedProperties[13]);
    }

    private final RdsDataRowView getOrderAmountSection() {
        return (RdsDataRowView) this.orderAmountSection.getValue(this, $$delegatedProperties[14]);
    }

    private final RdsDataRowView getFilledDateSection() {
        return (RdsDataRowView) this.filledDateSection.getValue(this, $$delegatedProperties[15]);
    }

    private final RdsDataRowView getFilledQuantitySection() {
        return (RdsDataRowView) this.filledQuantitySection.getValue(this, $$delegatedProperties[16]);
    }

    private final RdsDataRowView getSettlementDateSection() {
        return (RdsDataRowView) this.settlementDateSection.getValue(this, $$delegatedProperties[17]);
    }

    private final RdsDataRowView getTotalNotionalSection() {
        return (RdsDataRowView) this.totalNotionalSection.getValue(this, $$delegatedProperties[18]);
    }

    private final RdsDataRowView getRegulatoryFeeSection() {
        return (RdsDataRowView) this.regulatoryFeeSection.getValue(this, $$delegatedProperties[19]);
    }

    private final LinearLayout getSalesTaxContainer() {
        return (LinearLayout) this.salesTaxContainer.getValue(this, $$delegatedProperties[20]);
    }

    private final RdsDataRowView getBackupWithholdingSection() {
        return (RdsDataRowView) this.backupWithholdingSection.getValue(this, $$delegatedProperties[21]);
    }

    private final RdsDataRowView getNetCreditSection() {
        return (RdsDataRowView) this.netCreditSection.getValue(this, $$delegatedProperties[22]);
    }

    private final RdsDataRowView getRealizedProfitLossSection() {
        return (RdsDataRowView) this.realizedProfitLossSection.getValue(this, $$delegatedProperties[23]);
    }

    private final TextView getExtendBtn() {
        return (TextView) this.extendBtn.getValue(this, $$delegatedProperties[24]);
    }

    private final TextView getHelperTxt() {
        return (TextView) this.helperTxt.getValue(this, $$delegatedProperties[25]);
    }

    private final TextView getViewConfirmationBtn() {
        return (TextView) this.viewConfirmationBtn.getValue(this, $$delegatedProperties[26]);
    }

    private final TextView getResponseCategoryTxt() {
        return (TextView) this.responseCategoryTxt.getValue(this, $$delegatedProperties[27]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RdsButtonBarView getCtaButtonBar() {
        return (RdsButtonBarView) this.ctaButtonBar.getValue(this, $$delegatedProperties[28]);
    }

    private final RdsDataRowView getTaxLotsSection() {
        return (RdsDataRowView) this.taxLotsSection.getValue(this, $$delegatedProperties[29]);
    }

    public final void bindOrder(UUID orderId) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        this.orderIdSubject.onNext(Optional.INSTANCE.m2972of(orderId));
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable(SAVE_SUPER_STATE, parcelableOnSaveInstanceState);
        Optional<UUID> value = this.orderIdSubject.getValue();
        bundle.putSerializable(SAVE_ORDER_ID, value != null ? value.getOrNull() : null);
        return bundle;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable state) {
        if (state instanceof Bundle) {
            Bundle bundle = (Bundle) state;
            Serializable serializable = bundle.getSerializable(SAVE_ORDER_ID);
            Intrinsics.checkNotNull(serializable, "null cannot be cast to non-null type java.util.UUID");
            this.orderIdSubject.onNext(Optional.INSTANCE.m2972of((UUID) serializable));
            state = bundle.getParcelable(SAVE_SUPER_STATE);
        }
        super.onRestoreInstanceState(state);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        OnClickListeners.onClick(getExtendBtn(), new Function0() { // from class: com.robinhood.equities.history.OrderDetailView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OrderDetailView.onFinishInflate$lambda$0(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onFinishInflate$lambda$0(OrderDetailView orderDetailView) {
        orderDetailView.extendOrder();
        return Unit.INSTANCE;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        LifecycleCoroutineScope lifecycleScope;
        super.onAttachedToWindow();
        Observable observableRefCount = ObservablesKt.filterIsPresent(this.orderIdSubject).switchMap(new Function() { // from class: com.robinhood.equities.history.OrderDetailView$onAttachedToWindow$uiOrderObs$1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends UiOrder> apply(UUID orderId) {
                Intrinsics.checkNotNullParameter(orderId, "orderId");
                this.this$0.getOrderStore().refresh(true, orderId);
                return this.this$0.getOrderStore().streamUiOrder(orderId);
            }
        }).replay(1).refCount();
        Intrinsics.checkNotNullExpressionValue(observableRefCount, "refCount(...)");
        Observable observableSwitchMap = observableRefCount.map(new Function() { // from class: com.robinhood.equities.history.OrderDetailView.onAttachedToWindow.1
            @Override // io.reactivex.functions.Function
            public final String apply(UiOrder it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getOrder().getAccountNumber();
            }
        }).distinctUntilChanged().switchMap(new Function() { // from class: com.robinhood.equities.history.OrderDetailView.onAttachedToWindow.2
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Account> apply(String accountNumber) {
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                return OrderDetailView.this.getAccountProvider().streamAccount(accountNumber);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        ViewDisposerKt.bindTo$default(ObservablesAndroid.observeOnMainThread(observableSwitchMap), this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.equities.history.OrderDetailView$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderDetailView.onAttachedToWindow$lambda$1(this.f$0, (Account) obj);
            }
        });
        ViewDisposerKt.bindTo$default(ObservablesAndroid.observeOnMainThread(observableRefCount), this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.equities.history.OrderDetailView$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderDetailView.onAttachedToWindow$lambda$2(this.f$0, (UiOrder) obj);
            }
        });
        Observable observableSwitchMap2 = observableRefCount.map(new Function() { // from class: com.robinhood.equities.history.OrderDetailView.onAttachedToWindow.5
            @Override // io.reactivex.functions.Function
            public final UUID apply(UiOrder uiOrder) {
                Intrinsics.checkNotNullParameter(uiOrder, "uiOrder");
                return uiOrder.getOrder().getInstrument();
            }
        }).distinctUntilChanged().switchMap(new Function() { // from class: com.robinhood.equities.history.OrderDetailView.onAttachedToWindow.6
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Boolean> apply(UUID instrumentId) {
                Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
                return OrderDetailView.this.getInstrumentStore().isPreIpo(instrumentId);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap2, "switchMap(...)");
        ViewDisposerKt.bindTo$default(observableSwitchMap2, this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.equities.history.OrderDetailView$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderDetailView.onAttachedToWindow$lambda$3(this.f$0, (Boolean) obj);
            }
        });
        Observable map = observableRefCount.map(new Function() { // from class: com.robinhood.equities.history.OrderDetailView.onAttachedToWindow.8
            @Override // io.reactivex.functions.Function
            public final UUID apply(UiOrder it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getOrder().getInstrument();
            }
        }).distinctUntilChanged().switchMap(new Function() { // from class: com.robinhood.equities.history.OrderDetailView.onAttachedToWindow.9
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Instrument> apply(UUID instrumentId) {
                Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
                return OrderDetailView.this.getInstrumentStore().getInstrument(instrumentId);
            }
        }).map(new Function() { // from class: com.robinhood.equities.history.OrderDetailView.onAttachedToWindow.10
            @Override // io.reactivex.functions.Function
            public final String apply(Instrument it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getType();
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        ViewDisposerKt.bindTo$default(map, this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.equities.history.OrderDetailView$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderDetailView.onAttachedToWindow$lambda$4(this.f$0, (String) obj);
            }
        });
        Observable observableTake = observableRefCount.map(new Function() { // from class: com.robinhood.equities.history.OrderDetailView.onAttachedToWindow.12
            @Override // io.reactivex.functions.Function
            public final Order apply(UiOrder uiOrder) {
                Intrinsics.checkNotNullParameter(uiOrder, "uiOrder");
                return uiOrder.getOrder();
            }
        }).distinctUntilChanged().switchMap(new Function() { // from class: com.robinhood.equities.history.OrderDetailView.onAttachedToWindow.13
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Boolean> apply(Order order) {
                Intrinsics.checkNotNullParameter(order, "order");
                return OrderDetailView.this.getDirectIpoShownOrderNotAllocatedStore().getShouldShowExplanation(order);
            }
        }).filter(new Predicate() { // from class: com.robinhood.equities.history.OrderDetailView.onAttachedToWindow.14
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Boolean it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.booleanValue();
            }
        }).take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        ViewDisposerKt.bindTo$default(ObservablesAndroid.observeOnMainThread(observableTake), this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.equities.history.OrderDetailView$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderDetailView.onAttachedToWindow$lambda$5(this.f$0, (Boolean) obj);
            }
        });
        Observable observableSwitchMap3 = ObservablesKt.filterIsPresent(this.orderIdSubject).switchMap(new Function() { // from class: com.robinhood.equities.history.OrderDetailView.onAttachedToWindow.16
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends UiInvestmentScheduleEvent> apply(UUID orderId) {
                Intrinsics.checkNotNullParameter(orderId, "orderId");
                OrderDetailView.this.getInvestmentScheduleEventStore().refreshByOrder(false, orderId);
                return OrderDetailView.this.getRxFactory().convertToObservable(OrderDetailView.this.getInvestmentScheduleEventStore().streamInvestmentScheduleEventByOrder(orderId));
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap3, "switchMap(...)");
        ViewDisposerKt.bindTo$default(ObservablesAndroid.observeOnMainThread(observableSwitchMap3), this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.equities.history.OrderDetailView$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderDetailView.onAttachedToWindow$lambda$6(this.f$0, (UiInvestmentScheduleEvent) obj);
            }
        });
        Observable observableSwitchMap4 = observableRefCount.map(new Function() { // from class: com.robinhood.equities.history.OrderDetailView.onAttachedToWindow.18
            @Override // io.reactivex.functions.Function
            public final Order apply(UiOrder it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getOrder();
            }
        }).distinctUntilChanged().switchMap(new Function() { // from class: com.robinhood.equities.history.OrderDetailView.onAttachedToWindow.19
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends List<Document>> apply(Order order) {
                Intrinsics.checkNotNullParameter(order, "order");
                LocalDate localDateMo3459a = order.getUpdatedAt().atZone(ZoneIds.INSTANCE.getNEW_YORK()).mo3459a();
                DocumentStore documentStore = OrderDetailView.this.getDocumentStore();
                String accountNumber = order.getAccountNumber();
                Intrinsics.checkNotNull(localDateMo3459a);
                return documentStore.getTradeConfirms(accountNumber, localDateMo3459a);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap4, "switchMap(...)");
        ViewDisposerKt.bindTo$default(ObservablesAndroid.observeOnMainThread(observableSwitchMap4), this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.equities.history.OrderDetailView$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderDetailView.onAttachedToWindow$lambda$7(this.f$0, (List) obj);
            }
        });
        Observable observableSwitchMap5 = observableRefCount.map(new Function() { // from class: com.robinhood.equities.history.OrderDetailView.onAttachedToWindow.21
            @Override // io.reactivex.functions.Function
            public final Tuples2<Boolean, OrderMarketHours> apply(UiOrder uiOrder) {
                Intrinsics.checkNotNullParameter(uiOrder, "uiOrder");
                return new Tuples2<>(Boolean.valueOf(uiOrder.getOrder().getExtendedHours()), uiOrder.getOrder().getMarketHours());
            }
        }).distinctUntilChanged().switchMap(new Function() { // from class: com.robinhood.equities.history.OrderDetailView.onAttachedToWindow.22
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends MarketHours> apply(Tuples2<Boolean, ? extends OrderMarketHours> tuples2) {
                Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
                return OrderDetailView.this.getMarketHoursStore().getAndRefreshCurrentOrNextOpenMarketHoursForEquity(tuples2.component1().booleanValue(), tuples2.component2());
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap5, "switchMap(...)");
        ViewDisposerKt.bindTo$default(ObservablesAndroid.observeOnMainThread(observableSwitchMap5), this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.equities.history.OrderDetailView$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderDetailView.onAttachedToWindow$lambda$8(this.f$0, (MarketHours) obj);
            }
        });
        Job job = this.withholdingJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
        LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(this);
        this.withholdingJob = (lifecycleOwner == null || (lifecycleScope = LifecycleOwner2.getLifecycleScope(lifecycleOwner)) == null) ? null : BuildersKt__Builders_commonKt.launch$default(lifecycleScope, null, null, new C3312024(observableRefCount, null), 3, null);
        Observable observableSwitchMapSingle = observableRefCount.map(new Function() { // from class: com.robinhood.equities.history.OrderDetailView.onAttachedToWindow.25
            @Override // io.reactivex.functions.Function
            public final Order apply(UiOrder it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getOrder();
            }
        }).distinctUntilChanged(new Function() { // from class: com.robinhood.equities.history.OrderDetailView.onAttachedToWindow.26
            @Override // io.reactivex.functions.Function
            public final Tuples2<UUID, String> apply(Order order) {
                Intrinsics.checkNotNullParameter(order, "order");
                return Tuples4.m3642to(order.getId(), order.getAccountNumber());
            }
        }).switchMapSingle(new Function() { // from class: com.robinhood.equities.history.OrderDetailView.onAttachedToWindow.27

            /* compiled from: OrderDetailView.kt */
            @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lkotlin/Pair;", "Lwormhole/service/v1/GetRealizedGainLossItemResponseDto;", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.equities.history.OrderDetailView$onAttachedToWindow$27$1", m3645f = "OrderDetailView.kt", m3646l = {370}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.equities.history.OrderDetailView$onAttachedToWindow$27$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Tuples2<? extends GetRealizedGainLossItemResponseDto, ? extends String>>, Object> {
                final /* synthetic */ Order $order;
                int label;
                final /* synthetic */ OrderDetailView this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(OrderDetailView orderDetailView, Order order, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = orderDetailView;
                    this.$order = order;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.this$0, this.$order, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Tuples2<? extends GetRealizedGainLossItemResponseDto, ? extends String>> continuation) {
                    return invoke2(coroutineScope, (Continuation<? super Tuples2<GetRealizedGainLossItemResponseDto, String>>) continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Tuples2<GetRealizedGainLossItemResponseDto, String>> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        ProfitAndLossDetailStore profitAndLossDetailStore = this.this$0.getProfitAndLossDetailStore();
                        UUID id = this.$order.getId();
                        AssetClassDto assetClassDto = AssetClassDto.ASSET_CLASS_EQUITY;
                        String accountNumber = this.$order.getAccountNumber();
                        this.label = 1;
                        obj = profitAndLossDetailStore.getItem(id, assetClassDto, accountNumber, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Tuples4.m3642to(obj, this.$order.getAccountNumber());
                }
            }

            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends Tuples2<GetRealizedGainLossItemResponseDto, String>> apply(Order order) {
                Intrinsics.checkNotNullParameter(order, "order");
                return RxFactory.DefaultImpls.rxSingle$default(OrderDetailView.this.getRxFactory(), null, new AnonymousClass1(OrderDetailView.this, order, null), 1, null);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMapSingle, "switchMapSingle(...)");
        ViewDisposerKt.bindTo$default(ObservablesAndroid.observeOnMainThread(observableSwitchMapSingle), this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.equities.history.OrderDetailView$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderDetailView.onAttachedToWindow$lambda$10(this.f$0, (Tuples2) obj);
            }
        });
        ViewDisposerKt.bindTo$default(ObservablesAndroid.observeOnMainThread(ExperimentsKt.streamWithExperiment(getRegionGateProvider(), getExperimentsStore(), SubzeroRegionGate.INSTANCE, EquitiesSubzeroCancelNew.INSTANCE, true)), this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.equities.history.OrderDetailView$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderDetailView.onAttachedToWindow$lambda$11(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        Observable observableSwitchMapSingle2 = observableRefCount.switchMapSingle(new Function() { // from class: com.robinhood.equities.history.OrderDetailView.onAttachedToWindow.30
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends List<ApiEquitySsrData>> apply(UiOrder it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return OrderDetailView.this.getRxFactory().convertToObservable(OrderDetailView.this.getEquitySsrStore().streamEquitySsr(CollectionsKt.listOf(it.getOrder().getInstrument().toString()))).first(CollectionsKt.emptyList());
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMapSingle2, "switchMapSingle(...)");
        ViewDisposerKt.bindTo$default(ObservablesAndroid.observeOnMainThread(observableSwitchMapSingle2), this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.equities.history.OrderDetailView$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderDetailView.onAttachedToWindow$lambda$12(this.f$0, (List) obj);
            }
        });
        Observable observableSwitchMap6 = observableRefCount.switchMap(new Function() { // from class: com.robinhood.equities.history.OrderDetailView.onAttachedToWindow.32
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends List<IacInfoBanner>> apply(UiOrder order) {
                Intrinsics.checkNotNullParameter(order, "order");
                return IacInfoBannerStore.streamBatch$default(OrderDetailView.this.getIacInfoBannerStore(), CollectionsKt.listOf(IacInfoBannerLocation.INFO_BANNER_EQUITY_ORDER_DETAIL), null, null, null, null, null, null, null, null, null, order.getOrder().getId(), 1022, null);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap6, "switchMap(...)");
        ViewDisposerKt.bindTo$default(ObservablesAndroid.observeOnMainThread(observableSwitchMap6), this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.equities.history.OrderDetailView$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderDetailView.onAttachedToWindow$lambda$13(this.f$0, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$1(OrderDetailView orderDetailView, Account account) throws Resources.NotFoundException {
        orderDetailView.account = account;
        orderDetailView.refreshUi();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$2(OrderDetailView orderDetailView, UiOrder uiOrder) throws Resources.NotFoundException {
        orderDetailView.uiOrder = uiOrder;
        orderDetailView.refreshUi();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$3(OrderDetailView orderDetailView, Boolean bool) {
        Intrinsics.checkNotNull(bool);
        orderDetailView.isPreIpo = bool.booleanValue();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$4(OrderDetailView orderDetailView, String str) {
        orderDetailView.instrumentType = str;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$5(OrderDetailView orderDetailView, Boolean bool) throws Resources.NotFoundException {
        orderDetailView.shouldShowExplanation = true;
        orderDetailView.refreshUi();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$6(OrderDetailView orderDetailView, UiInvestmentScheduleEvent uiInvestmentScheduleEvent) throws Resources.NotFoundException {
        orderDetailView.uiInvestmentScheduleEvent = uiInvestmentScheduleEvent;
        orderDetailView.refreshUi();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$7(OrderDetailView orderDetailView, List list) throws Resources.NotFoundException {
        orderDetailView.tradeConfirmDocs = list;
        orderDetailView.refreshUi();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$8(OrderDetailView orderDetailView, MarketHours marketHours) throws Resources.NotFoundException {
        orderDetailView.nextOpenHours = marketHours;
        orderDetailView.refreshUi();
        return Unit.INSTANCE;
    }

    /* compiled from: OrderDetailView.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.equities.history.OrderDetailView$onAttachedToWindow$24", m3645f = "OrderDetailView.kt", m3646l = {360}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.equities.history.OrderDetailView$onAttachedToWindow$24 */
    static final class C3312024 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Observable<UiOrder> $uiOrderObs;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3312024(Observable<UiOrder> observable, Continuation<? super C3312024> continuation) {
            super(2, continuation);
            this.$uiOrderObs = observable;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OrderDetailView.this.new C3312024(this.$uiOrderObs, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C3312024) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                BackupWithholdingStore backupWithholdingStore = OrderDetailView.this.getBackupWithholdingStore();
                Observable<UiOrder> observable = this.$uiOrderObs;
                final AnonymousClass1 anonymousClass1 = new PropertyReference1Impl() { // from class: com.robinhood.equities.history.OrderDetailView.onAttachedToWindow.24.1
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
                    public Object get(Object obj2) {
                        return ((UiOrder) obj2).getOrder();
                    }
                };
                Observable<Order> map = observable.map(new Function(anonymousClass1) { // from class: com.robinhood.equities.history.OrderDetailViewKt$sam$io_reactivex_functions_Function$0
                    private final /* synthetic */ Function1 function;

                    {
                        Intrinsics.checkNotNullParameter(anonymousClass1, "function");
                        this.function = anonymousClass1;
                    }

                    @Override // io.reactivex.functions.Function
                    public final /* synthetic */ Object apply(Object obj2) {
                        return this.function.invoke(obj2);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                Flow<WithholdingAmount> flowPollOrderWithholdingAmount = backupWithholdingStore.pollOrderWithholdingAmount(map);
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(OrderDetailView.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowPollOrderWithholdingAmount, anonymousClass2, this) == coroutine_suspended) {
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

        /* compiled from: OrderDetailView.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/db/bonfire/WithholdingAmount;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.equities.history.OrderDetailView$onAttachedToWindow$24$2", m3645f = "OrderDetailView.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.equities.history.OrderDetailView$onAttachedToWindow$24$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<WithholdingAmount, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OrderDetailView this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(OrderDetailView orderDetailView, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = orderDetailView;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(WithholdingAmount withholdingAmount, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(withholdingAmount, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) throws Resources.NotFoundException {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.backupWithholdingResponse = (WithholdingAmount) this.L$0;
                    this.this$0.refreshUi();
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$10(final OrderDetailView orderDetailView, Tuples2 tuples2) {
        String string2;
        GetRealizedGainLossItemResponseDto getRealizedGainLossItemResponseDto = (GetRealizedGainLossItemResponseDto) tuples2.component1();
        final String str = (String) tuples2.component2();
        RealizedGainLossItemDto item = getRealizedGainLossItemResponseDto.getItem();
        final ProfitAndLossTradeItem dbModel = item != null ? ProfitAndLossTradeItem2.toDbModel(item, null, null) : null;
        if (dbModel == null) {
            orderDetailView.getRealizedProfitLossSection().setVisibility(8);
        } else {
            EventLogger.DefaultImpls.logAppear$default(orderDetailView.getEventLogger(), null, orderDetailView.screen, new Component(Component.ComponentType.ROW, "equities_pnl_entry_point", null, 4, null), null, null, 25, null);
            Money realizedReturn = dbModel.getRealizedReturn();
            if (realizedReturn == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            RdsDataRowView realizedProfitLossSection = orderDetailView.getRealizedProfitLossSection();
            if (realizedReturn.isPositive() || realizedReturn.isZero()) {
                string2 = ViewsKt.getString(orderDetailView, C33130R.string.order_detail_realized_profit);
            } else {
                string2 = ViewsKt.getString(orderDetailView, C33130R.string.order_detail_realized_loss);
            }
            realizedProfitLossSection.setLabelText(string2);
            orderDetailView.getRealizedProfitLossSection().setVisibilityValueText(Money.Adjustment.format$default(realizedReturn.toNormalizedAdjustment(), false, null, 3, null));
            OnClickListeners.onClick(orderDetailView.getRealizedProfitLossSection(), new Function0() { // from class: com.robinhood.equities.history.OrderDetailView$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OrderDetailView.onAttachedToWindow$lambda$10$lambda$9(this.f$0, str, dbModel);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$10$lambda$9(OrderDetailView orderDetailView, String str, ProfitAndLossTradeItem profitAndLossTradeItem) {
        Callbacks callbacks = orderDetailView.callbacks;
        if (callbacks != null) {
            callbacks.onShowProfitAndLossDetail(str, profitAndLossTradeItem);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$11(OrderDetailView orderDetailView, boolean z) {
        orderDetailView.memberOfEquitiesSubzeroCancelNewExperiment = z;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$12(OrderDetailView orderDetailView, List list) {
        Intrinsics.checkNotNull(list);
        orderDetailView.equitySsr = (ApiEquitySsrData) CollectionsKt.firstOrNull(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$13(OrderDetailView orderDetailView, List list) {
        Intrinsics.checkNotNull(list);
        orderDetailView.iacInfoBanner = (IacInfoBanner) CollectionsKt.firstOrNull(list);
        return Unit.INSTANCE;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Job job = this.withholdingJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
    }

    public final void setTaxLotRowData(String label, String valueText, Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(valueText, "valueText");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        getTaxLotsSection().setLabelText(label);
        getTaxLotsSection().setVisibilityValueText(valueText);
        OnClickListeners.onClick(getTaxLotsSection(), onClick);
        getTaxLotsSection().setVisibility(0);
        getExtendBtn().setVisibility(8);
        this.hasTaxLotData = true;
    }

    public final void setCallbacks(Callbacks callbacks) {
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        this.callbacks = callbacks;
    }

    public final void setProgressDisplay(UiCallbacks.ProgressDisplay progressDisplay) {
        this.progressDisplay = progressDisplay;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x032f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void refreshUi() throws Resources.NotFoundException {
        CharSequence text;
        DisplayName displayName;
        DisplayName.Variants withAccount;
        StringResource title;
        String timeInForceString;
        ApiEquitySsrData apiEquitySsrData;
        String str;
        String string2;
        String string3;
        Money earlyAccessAmount;
        UiInvestmentScheduleEvent uiInvestmentScheduleEvent;
        PaymentTransfer paymentTransfer;
        int i;
        String str2;
        BigDecimal stopPrice;
        int i2;
        LocalDate lastSettlementDate;
        StringResource stringResourceNicknameDotFormat;
        UiOrder uiOrder = this.uiOrder;
        if (uiOrder == null) {
            return;
        }
        final Order order = uiOrder.getOrder();
        Resources resources = getResources();
        if (this.shouldShowExplanation) {
            this.shouldShowExplanation = false;
            showDirectIpoOrderNotAllocatedScreen(order);
        }
        RdsDataRowView accountUsedSection = getAccountUsedSection();
        Account account = this.account;
        if (account == null || (stringResourceNicknameDotFormat = AccountDisplayNames.nicknameDotFormat(account)) == null) {
            Account account2 = this.account;
            if (account2 == null || (displayName = AccountDisplayNames.getDisplayName(account2)) == null || (withAccount = displayName.getWithAccount()) == null || (title = withAccount.getTitle()) == null) {
                text = null;
            } else {
                Resources resources2 = getResources();
                Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
                text = title.getText(resources2);
            }
        } else {
            Resources resources3 = getResources();
            Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
            text = stringResourceNicknameDotFormat.getText(resources3);
            if (text == null) {
            }
        }
        accountUsedSection.setVisibilityValueText(text);
        RdsDataRowView linkedAppSection = getLinkedAppSection();
        PlacedAgent placedAgent = order.getPlacedAgent();
        linkedAppSection.setVisibilityValueText(placedAgent != null ? placedAgent.getDisplayValue() : null);
        RdsDataRowView timeInForceSection = getTimeInForceSection();
        if (order.isFractionalGfdOrder()) {
            timeInForceString = null;
        } else {
            OrderTimeInForce timeInForce = order.getTimeInForce();
            Intrinsics.checkNotNull(resources);
            timeInForceString = OrderTimeInForces.getTimeInForceString(timeInForce, resources);
        }
        timeInForceSection.setVisibilityValueText(timeInForceString);
        RdsDataRowView enteredInSection = getEnteredInSection();
        StringResource enteredInString = Orders3.getEnteredInString(order);
        Intrinsics.checkNotNull(resources);
        enteredInSection.setVisibilityValueText(enteredInString.getText(resources));
        getOrderDateSection().setVisibilityValueText(InstantFormatter.MEDIUM_DATE_IN_SYSTEM_ZONE.format(order.getCreatedAt()));
        EquityOrderState state = order.getState();
        getOrderStatusSection().setVisibilityValueText(Orders3.getOrderStateString(order, true).getText(resources));
        IdlingResourceCounters2.setBusy(IdlingResourceType.ORDER_DETAIL_STATUS, false);
        MarketHours marketHours = this.nextOpenHours;
        if (this.iacInfoBanner != null) {
            IacInfoBanners.bindIacInfoBanner(getInfoBannerView(), this.iacInfoBanner, this);
        } else if (order.getPlacedAgent() == PlacedAgent.FRACS_LIQUIDATOR) {
            String string4 = ViewsKt.getString(this, C33130R.string.order_detail_fracs_liquidated_message, uiOrder.getSymbol());
            String string5 = ViewsKt.getString(this, C11048R.string.general_action_learn_more);
            getInfoBannerView().setText(HtmlCompat.fromHtml$default(string4 + " <b><a href=\"https://robinhood.com/us/en/support/articles/fractional-shares/\">" + string5 + "</a></b>", 0, 2, null));
            getInfoBannerView().setIcon(getContext().getDrawable(ServerToBentoAssetMapper2.INFO_FILLED_16.getResourceId()));
            getInfoBannerView().setVisibility(0);
        } else if (state == EquityOrderState.QUEUED && marketHours != null) {
            Instant nextOpenHoursInstant = order.getNextOpenHoursInstant(marketHours);
            getInfoBannerView().setText(ViewsKt.getString(this, C33130R.string.order_detail_queued_order_message, InstantFormatter.WEEKDAY_IN_SYSTEM_ZONE.format(nextOpenHoursInstant), InstantFormatter.SHORT_TIME_IN_SYSTEM_ZONE.format(nextOpenHoursInstant)));
            getInfoBannerView().setIcon(null);
            getInfoBannerView().setVisibility(0);
        } else if (state.isFinal() || (apiEquitySsrData = this.equitySsr) == null || !apiEquitySsrData.getSsr_on()) {
            getInfoBannerView().setVisibility(8);
        } else {
            getInfoBannerView().setText(ViewsKt.getString(this, C33130R.string.order_detail_ssr_order_message, uiOrder.getSymbol()));
            getInfoBannerView().setVisibility(0);
        }
        RhTextView orderErrorStatusSection = getOrderErrorStatusSection();
        UiInvestmentScheduleEvent uiInvestmentScheduleEvent2 = this.uiInvestmentScheduleEvent;
        TextViewsKt.setVisibilityText(orderErrorStatusSection, uiInvestmentScheduleEvent2 != null ? UiInvestmentScheduleEvents.getOrderErrorStatusText(uiInvestmentScheduleEvent2, resources) : null);
        getOrderLimitPriceSection().setVisibilityValueText(order.getType() == OrderType.LIMIT ? Orders3.getOrderLimitPrice(order, resources) : null);
        RdsDataRowView orderAmountSection = getOrderAmountSection();
        Money dollarBasedAmount = order.getDollarBasedAmount();
        orderAmountSection.setVisibilityValueText(dollarBasedAmount != null ? Money.format$default(dollarBasedAmount, null, false, null, false, 0, null, false, null, false, false, 1023, null) : null);
        getOrderQuantitySection().setVisibilityValueText(!order.isDollarBased() ? Formats.getShareQuantityFormat().formatNullable(order.getQuantity(), "") : null);
        getFilledDateSection().setVisibilityValueText(Orders3.getFilledDate(order));
        getFilledQuantitySection().setVisibilityValueText(Orders3.getFilledDescription(order, resources));
        getTotalNotionalSection().setVisibilityValueText(Orders3.getTotalNotional(order));
        getRegulatoryFeeSection().setLabelText((order.getState().isFinal() && (lastSettlementDate = order.getLastSettlementDate()) != null && lastSettlementDate.isBefore(LocalDate.now(getClock()))) ? ViewsKt.getString(this, C33130R.string.order_detail_regulatory_fee_header) : ViewsKt.getString(this, C33130R.string.order_detail_est_regulatory_fee_header));
        getRegulatoryFeeSection().setVisibilityValueText(Orders3.getRegulatoryFees(order));
        if (getRegulatoryFeeSection().getVisibility() == 0 && !this.feesAppearLogged) {
            EventLogger.DefaultImpls.logAppear$default(getEventLogger(), null, this.screen, this.feeSectionComponent, null, null, 25, null);
            this.feesAppearLogged = true;
        }
        OnClickListeners.onClick(getRegulatoryFeeSection(), new Function0() { // from class: com.robinhood.equities.history.OrderDetailView$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OrderDetailView.refreshUi$lambda$14(this.f$0);
            }
        });
        getSalesTaxContainer().removeAllViews();
        List<SalesTax> salesTaxes = order.getSalesTaxes();
        List<SalesTax> list = salesTaxes;
        if (list == null || list.isEmpty()) {
            getSalesTaxContainer().setVisibility(8);
        } else {
            for (SalesTax salesTax : salesTaxes) {
                View viewInflate = LayoutInflater.from(getContext()).inflate(C33130R.layout.include_sales_tax_row, (ViewGroup) getSalesTaxContainer(), false);
                Intrinsics.checkNotNull(viewInflate, "null cannot be cast to non-null type com.robinhood.android.designsystem.row.RdsDataRowView");
                RdsDataRowView rdsDataRowView = (RdsDataRowView) viewInflate;
                rdsDataRowView.setLabelText(salesTax.getDisplayName());
                rdsDataRowView.setVisibilityValueText(Formats.getCurrencyFormat().format(salesTax.getFee()));
                getSalesTaxContainer().addView(rdsDataRowView);
            }
            getSalesTaxContainer().setVisibility(0);
        }
        getOrderStopPriceSection().setVisibilityValueText(OrderTrigger.STOP == order.getTrigger() ? Orders3.getStopPrice(order, resources) : null);
        RdsDataRowView settlementDateSection = getSettlementDateSection();
        Account account3 = this.account;
        if (account3 != null) {
            Intrinsics.checkNotNull(account3);
            if (!account3.isMargin()) {
                if (order.getLastSettlementDate() != null) {
                    LocalDateFormatter localDateFormatter = LocalDateFormatter.MEDIUM;
                    LocalDate lastSettlementDate2 = order.getLastSettlementDate();
                    Intrinsics.checkNotNull(lastSettlementDate2);
                    str = localDateFormatter.format(lastSettlementDate2);
                } else {
                    str = null;
                }
            }
        }
        settlementDateSection.setVisibilityValueText(str);
        OrderTrailingPeg trailingPeg = order.getTrailingPeg();
        if (trailingPeg != null) {
            OrderTrailingPeg.TrailingPegType type2 = trailingPeg.getType();
            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
            int i3 = iArr[type2.ordinal()];
            if (i3 == 1) {
                i = C33130R.string.order_detail_trail_amount_header;
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = C33130R.string.order_detail_trail_percentage_header;
            }
            int i4 = iArr[trailingPeg.getType().ordinal()];
            if (i4 == 1) {
                NumberFormatter currencyFormat = Formats.getCurrencyFormat();
                Money price = trailingPeg.getPrice();
                Intrinsics.checkNotNull(price);
                str2 = currencyFormat.format(price.getDecimalValue());
            } else {
                if (i4 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                NumberFormatter percentFormat = Formats.getPercentFormat();
                BigDecimal displayPercentage = trailingPeg.getDisplayPercentage();
                Intrinsics.checkNotNull(displayPercentage);
                str2 = percentFormat.format(displayPercentage);
            }
            getOrderTrailAmount().setLabelText(resources.getString(i));
            getOrderTrailAmount().setVisibilityValueText(str2);
            Money lastTrailPrice = order.getLastTrailPrice();
            getOrderCurrentTrailPrice().setLabelText(order.getStopTriggeredAt() != null ? resources.getString(C33130R.string.order_detail_triggered_stop_price_header) : order.getLastTrailPriceSource() == OrderTrailPriceSource.MARKET_DATA ? resources.getString(C33130R.string.order_detail_est_trailing_price_header) : resources.getString(C33130R.string.order_detail_trailing_price_header));
            if (lastTrailPrice == null || (stopPrice = lastTrailPrice.getDecimalValue()) == null) {
                stopPrice = order.getStopPrice();
                Intrinsics.checkNotNull(stopPrice);
            }
            getOrderCurrentTrailPrice().setVisibilityValueText(Formats.getCurrencyFormat().format(stopPrice));
            int i5 = WhenMappings.$EnumSwitchMapping$1[order.getSide().ordinal()];
            if (i5 == 1) {
                i2 = C33130R.string.order_detail_trail_market_price_buy;
            } else {
                if (i5 != 2 && i5 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = C33130R.string.order_detail_trail_market_price_sell;
            }
            BigDecimal bigDecimalEstimatedExecutionPrice = trailingPeg.estimatedExecutionPrice(order.getSide(), stopPrice);
            getOrderTrailMarketPrice().setLabelText(resources.getString(i2));
            getOrderTrailMarketPrice().setVisibilityValueText(Formats.getCurrencyFormat().format(bigDecimalEstimatedExecutionPrice));
            if (!state.isFinal()) {
                TextViewsKt.setVisibilityText(getHelperTxt(), trailingPegHelperText(order, resources));
            }
            getOrderLimitPriceSection().setVisibility(8);
            getOrderStopPriceSection().setVisibility(8);
        }
        getResponseCategoryTxt().setVisibility(8);
        getExtendBtn().setVisibility(8);
        getCtaButtonBar().setSecondaryButtonText(null);
        getViewConfirmationBtn().setVisibility(8);
        ApiOrder.ResponseCategory responseCategory = order.getResponseCategory();
        if (order.isCancelable()) {
            getCtaButtonBar().setSecondaryButtonText(resources.getString(C33130R.string.order_detail_cancel_action));
        } else if (!order.isExtendable() || this.hasTaxLotData) {
            final Document tradeConfirmation = order.getTradeConfirmation(this.tradeConfirmDocs);
            if (tradeConfirmation != null) {
                OnClickListeners.onClick(getViewConfirmationBtn(), new Function0() { // from class: com.robinhood.equities.history.OrderDetailView$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OrderDetailView.refreshUi$lambda$17$lambda$16(this.f$0, tradeConfirmation);
                    }
                });
                getViewConfirmationBtn().setVisibility(0);
            }
        } else {
            getExtendBtn().setVisibility(0);
            getResponseCategoryTxt().setVisibility(0);
            int i6 = responseCategory == null ? -1 : WhenMappings.$EnumSwitchMapping$2[responseCategory.ordinal()];
            if (i6 != -1) {
                if (i6 == 1) {
                    getResponseCategoryTxt().setText(C33130R.string.order_detail_response_category_end_of_day);
                } else if (i6 == 2) {
                    getResponseCategoryTxt().setText(getContext().getString(C33130R.string.order_detail_response_category_corporate_action, uiOrder.getSymbol(), InstantFormatter.MEDIUM_DATE_IN_SYSTEM_ZONE.format(order.getUpdatedAt())));
                } else {
                    if (i6 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    getResponseCategoryTxt().setText(C33130R.string.order_detail_response_category_stale_gtc);
                }
            }
        }
        PaymentTransfer paymentTransfer2 = uiOrder.getPaymentTransfer();
        if (paymentTransfer2 != null && (earlyAccessAmount = PaymentTransfers4.getEarlyAccessAmount(paymentTransfer2)) != null && earlyAccessAmount.isPositive() && (uiInvestmentScheduleEvent = this.uiInvestmentScheduleEvent) != null && (paymentTransfer = uiInvestmentScheduleEvent.getPaymentTransfer()) != null && paymentTransfer.getIsPending()) {
            TextView responseCategoryTxt = getResponseCategoryTxt();
            int i7 = C33130R.string.order_detail_additional_message_pending_with_instant;
            Money dollarBasedAmount2 = order.getDollarBasedAmount();
            TextViewsKt.setVisibilityText(responseCategoryTxt, resources.getString(i7, dollarBasedAmount2 != null ? Money.format$default(dollarBasedAmount2, null, false, null, false, 0, null, false, null, false, false, 1023, null) : null));
        }
        RdsDataRowView backupWithholdingSection = getBackupWithholdingSection();
        WithholdingAmount withholdingAmount = this.backupWithholdingResponse;
        backupWithholdingSection.setVisibilityValueText(withholdingAmount != null ? WithholdingAmount2.getBackupWithholdingAmountString(withholdingAmount) : null);
        WithholdingAmount withholdingAmount2 = this.backupWithholdingResponse;
        TaxWithholdingCategory withholdingCategory = withholdingAmount2 != null ? withholdingAmount2.getWithholdingCategory() : null;
        switch (withholdingCategory != null ? WhenMappings.$EnumSwitchMapping$3[withholdingCategory.ordinal()] : -1) {
            case -1:
                string2 = resources.getString(C33130R.string.order_detail_withholding_header_fallback);
                break;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                string2 = resources.getString(C33130R.string.order_detail_withholding_header_fallback);
                break;
            case 2:
                string2 = resources.getString(C33130R.string.order_detail_nra_withholding_header);
                break;
            case 3:
            case 4:
            case 5:
            case 6:
                string2 = resources.getString(C33130R.string.order_detail_backup_withholding_header);
                break;
            case 7:
                string2 = null;
                break;
        }
        backupWithholdingSection.setLabelText(string2);
        RdsDataRowView netCreditSection = getNetCreditSection();
        WithholdingAmount withholdingAmount3 = this.backupWithholdingResponse;
        netCreditSection.setVisibilityValueText(withholdingAmount3 != null ? WithholdingAmount2.getNetCreditAmountString(withholdingAmount3, order.getTotalCostOrCredit()) : null);
        final RdsButtonBarView ctaButtonBar = getCtaButtonBar();
        if (((order.getSide() == EquityOrderSide.SELL_SHORT || order.isBuyToClose()) && !this.memberOfEquitiesSubzeroCancelNewExperiment) || !order.isEditable()) {
            ctaButtonBar.setPrimaryButtonText(null);
        } else {
            switch (WhenMappings.$EnumSwitchMapping$4[order.getConfiguration().ordinal()]) {
                case 1:
                case 2:
                case 6:
                    string3 = null;
                    break;
                case 3:
                    string3 = resources.getString(C33130R.string.order_detail_edit_limit_order);
                    break;
                case 4:
                case 5:
                    string3 = resources.getString(C33130R.string.order_detail_edit_stop_order);
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            ctaButtonBar.setPrimaryButtonText(string3);
            ctaButtonBar.setPrimaryButtonIcon(null);
            ctaButtonBar.onPrimaryButtonClick(new Function0() { // from class: com.robinhood.equities.history.OrderDetailView$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OrderDetailView.refreshUi$lambda$21$lambda$19(this.f$0, ctaButtonBar, order);
                }
            });
        }
        ctaButtonBar.setSecondaryButtonText(order.isCancelable() ? resources.getString(C33130R.string.order_detail_cancel_action) : null);
        ctaButtonBar.setSecondaryButtonIcon(null);
        ctaButtonBar.onSecondaryButtonClick(new Function0() { // from class: com.robinhood.equities.history.OrderDetailView$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OrderDetailView.refreshUi$lambda$21$lambda$20(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshUi$lambda$14(OrderDetailView orderDetailView) {
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        Context context = orderDetailView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        RhDialogFragment.Builder negativeButton = companion.create(context).setId(C33130R.id.dialog_id_regulatory_fee).setUseDesignSystemOverlay(true).setTitle(C33130R.string.order_detail_regulatory_fee_disclaimer_title, new Object[0]).setMessage(C33130R.string.order_detail_regulatory_fee_disclaimer_description, new Object[0]).setPositiveButton(C11048R.string.general_action_learn_more, new Object[0]).setNegativeButton(C11048R.string.general_label_dismiss, new Object[0]);
        FragmentManager supportFragmentManager = Views.baseActivity(orderDetailView).getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        RhDialogFragment.Builder.show$default(negativeButton, supportFragmentManager, "regulatoryFee", false, 4, null);
        EventLogger.DefaultImpls.logTap$default(orderDetailView.getEventLogger(), null, orderDetailView.screen, orderDetailView.feeSectionComponent, null, null, false, 57, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshUi$lambda$17$lambda$16(OrderDetailView orderDetailView, Document document) {
        orderDetailView.viewTradeConfirmation(document);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshUi$lambda$21$lambda$19(OrderDetailView orderDetailView, RdsButtonBarView rdsButtonBarView, Order order) {
        orderDetailView.logReplaceOrderTap();
        Navigator navigator = orderDetailView.getNavigator();
        Context context = rdsButtonBarView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, context, new EquityOrderActivityIntentKey.ModifyExisting(order, false, EquityOrderFlowSource.CANCEL_NEW_HISTORY), null, false, null, null, 60, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshUi$lambda$21$lambda$20(OrderDetailView orderDetailView) {
        orderDetailView.logCancelOrderTap();
        orderDetailView.cancelOrder();
        return Unit.INSTANCE;
    }

    private final CharSequence trailingPegHelperText(Order order, Resources res) throws Resources.NotFoundException {
        String string2;
        String string3;
        String string4;
        OrderTrailPriceSource lastTrailPriceSource = order.getLastTrailPriceSource();
        int i = lastTrailPriceSource == null ? -1 : WhenMappings.$EnumSwitchMapping$5[lastTrailPriceSource.ordinal()];
        if (i == 1) {
            if (order.getSide() == EquityOrderSide.BUY) {
                string2 = res.getString(C33130R.string.order_detail_trailing_venue_buy_helper_text);
            } else {
                string2 = res.getString(C33130R.string.order_detail_trailing_venue_sell_helper_text);
            }
            Intrinsics.checkNotNull(string2);
            return string2;
        }
        if (i == 2) {
            if (order.getSide() == EquityOrderSide.BUY) {
                string3 = res.getString(C33130R.string.order_detail_trailing_marketdata_buy_helper_text);
            } else {
                string3 = res.getString(C33130R.string.order_detail_trailing_marketdata_sell_helper_text);
            }
            Intrinsics.checkNotNull(string3);
            return string3;
        }
        if (order.getSide() == EquityOrderSide.BUY) {
            string4 = res.getString(C33130R.string.order_detail_trailing_default_buy_helper_text);
        } else {
            string4 = res.getString(C33130R.string.order_detail_trailing_default_sell_helper_text);
        }
        Intrinsics.checkNotNull(string4);
        return string4;
    }

    private final void cancelOrder() {
        getCtaButtonBar().setSecondaryButtonEnabled(false);
        UiCallbacks.ProgressDisplay progressDisplay = this.progressDisplay;
        if (progressDisplay != null) {
            progressDisplay.showLoading(true);
        }
        OrderStore orderStore = getOrderStore();
        Optional<UUID> value = this.orderIdSubject.getValue();
        UUID orNull = value != null ? value.getOrNull() : null;
        Intrinsics.checkNotNull(orNull);
        Observable<R> map = orderStore.cancelOrderAndPoll(orNull).map(new Function() { // from class: com.robinhood.equities.history.OrderDetailView.cancelOrder.1
            @Override // io.reactivex.functions.Function
            public final Optional<UiOrder> apply(Optional<Order> optional) {
                Intrinsics.checkNotNullParameter(optional, "<destruct>");
                Order orderComponent1 = optional.component1();
                if (orderComponent1 != null) {
                    Optional.Companion companion = Optional.INSTANCE;
                    UiOrder uiOrder = OrderDetailView.this.uiOrder;
                    Intrinsics.checkNotNull(uiOrder);
                    return companion.m2972of(new UiOrder(orderComponent1, uiOrder.getSymbol(), null, null));
                }
                return Optional.INSTANCE.m2972of(null);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableCompose = ObservablesAndroid.observeOnMainThread(map).doOnNext(new Consumer() { // from class: com.robinhood.equities.history.OrderDetailView.cancelOrder.2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Optional<UiOrder> optional) throws Resources.NotFoundException {
                UiOrder uiOrderComponent1 = optional.component1();
                if (uiOrderComponent1 != null) {
                    OrderDetailView.this.uiOrder = uiOrderComponent1;
                    OrderDetailView.this.getPositionStore().refreshIndividualAccount(true);
                    OrderDetailView.this.refreshUi();
                }
            }
        }).compose(new MinTimeInFlightTransformer(1000L));
        Intrinsics.checkNotNullExpressionValue(observableCompose, "compose(...)");
        Observable observableDoOnTerminate = ObservablesAndroid.observeOnMainThread(observableCompose).doOnTerminate(new Action() { // from class: com.robinhood.equities.history.OrderDetailView.cancelOrder.3
            @Override // io.reactivex.functions.Action
            public final void run() {
                OrderDetailView.this.getCtaButtonBar().setSecondaryButtonEnabled(true);
                if (OrderDetailView.this.progressDisplay != null) {
                    UiCallbacks.ProgressDisplay progressDisplay2 = OrderDetailView.this.progressDisplay;
                    Intrinsics.checkNotNull(progressDisplay2);
                    progressDisplay2.showLoading(false);
                }
            }
        });
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Observable observableOnErrorResumeNext = observableDoOnTerminate.onErrorResumeNext(new ContextErrorHandler(context));
        Intrinsics.checkNotNullExpressionValue(observableOnErrorResumeNext, "onErrorResumeNext(...)");
        ViewDisposerKt.bindTo$default(observableOnErrorResumeNext, this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.equities.history.OrderDetailView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderDetailView.cancelOrder$lambda$24(this.f$0, (Optional) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit cancelOrder$lambda$24(OrderDetailView orderDetailView, Optional optional) throws Resources.NotFoundException {
        UiOrder uiOrder = (UiOrder) optional.component1();
        Order order = uiOrder != null ? uiOrder.getOrder() : null;
        if (order != null && order.getState() == EquityOrderState.CANCELED) {
            final RdsSnackbar rdsSnackbarMake = RdsSnackbar.INSTANCE.make(orderDetailView, C33130R.string.order_detail_order_canceled_confirmation_message, 0);
            RdsSnackbar.setAction$default(rdsSnackbarMake, C11048R.string.general_label_dismiss, false, (UserInteractionEventDescriptor) null, (AutoLoggingConfig) null, new Function0() { // from class: com.robinhood.equities.history.OrderDetailView$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OrderDetailView.cancelOrder$lambda$24$lambda$23$lambda$22(rdsSnackbarMake);
                }
            }, 14, (Object) null);
            rdsSnackbarMake.show();
        } else {
            Context context = orderDetailView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            AppCompatActivity appCompatActivityRequireActivityBaseContext = BaseContexts.requireActivityBaseContext(context);
            RhDialogFragment.Builder positiveButton = RhDialogFragment.INSTANCE.create(appCompatActivityRequireActivityBaseContext).setMessage(C11048R.string.order_detail_order_cancel_sent_message, new Object[0]).setPositiveButton(C11048R.string.general_label_ok, new Object[0]);
            FragmentManager supportFragmentManager = appCompatActivityRequireActivityBaseContext.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            RhDialogFragment.Builder.show$default(positiveButton, supportFragmentManager, "cancelSent", false, 4, null);
        }
        orderDetailView.refreshUi();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit cancelOrder$lambda$24$lambda$23$lambda$22(RdsSnackbar rdsSnackbar) {
        rdsSnackbar.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void extendOrder() {
        UiOrder uiOrder = this.uiOrder;
        if (uiOrder == null) {
            return;
        }
        String str = "equity_order_detail_extend_order";
        Object[] objArr = 0 == true ? 1 : 0;
        EventLogger.DefaultImpls.logTap$default(getEventLogger(), null, this.screen, new Component(Component.ComponentType.BUTTON, str, null, 4, null), null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, objArr, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, toRosetta(uiOrder), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -536870913, -1, -1, -1, 16383, null), false, 41, null);
        Navigator navigator = getNavigator();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, context, new EquityOrderActivityIntentKey.ModifyExisting(uiOrder.getOrder(), this.isPreIpo, EquityOrderFlowSource.ORDER_DETAIL_EXTEND), null, false, null, null, 60, null);
    }

    private final void viewTradeConfirmation(Document document) {
        Navigator navigator = getNavigator();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, context, new DocumentDownloadKey(document, DocumentDownloadLaunchMode.OPEN, null, false, 12, null), null, false, null, null, 60, null);
    }

    private final void showDirectIpoOrderNotAllocatedScreen(Order order) {
        getDirectIpoShownOrderNotAllocatedStore().add(order.getId());
        Navigator navigator = getNavigator();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, context, new LegacyIntentKey.DirectIpoAllocation.Instrument(order.getInstrument()), null, false, null, null, 60, null);
    }

    private final void logCancelOrderTap() {
        Order order;
        UUID id;
        BrokerageAccountType brokerageAccountType;
        UiOrder uiOrder = this.uiOrder;
        if (uiOrder == null || (order = uiOrder.getOrder()) == null || (id = order.getId()) == null) {
            return;
        }
        EquityHistoryLogger equityHistoryLogger = getEquityHistoryLogger();
        Account account = this.account;
        if (account == null || (brokerageAccountType = account.getBrokerageAccountType()) == null) {
            brokerageAccountType = BrokerageAccountType.UNKNOWN;
        }
        equityHistoryLogger.logCancelOrderTap(id, brokerageAccountType);
    }

    private final void logReplaceOrderTap() {
        Order order;
        UUID id;
        BrokerageAccountType brokerageAccountType;
        UiOrder uiOrder = this.uiOrder;
        if (uiOrder == null || (order = uiOrder.getOrder()) == null || (id = order.getId()) == null) {
            return;
        }
        EquityHistoryLogger equityHistoryLogger = getEquityHistoryLogger();
        Account account = this.account;
        if (account == null || (brokerageAccountType = account.getBrokerageAccountType()) == null) {
            brokerageAccountType = BrokerageAccountType.UNKNOWN;
        }
        equityHistoryLogger.logReplaceOrderTap(id, brokerageAccountType);
    }

    @Override // com.robinhood.shared.iac.infobanner.InfoBannerCallbacks
    public void onClickInfoBanner(IacInfoBanner banner) {
        Intrinsics.checkNotNullParameter(banner, "banner");
        GenericAction ctaAction = banner.getCtaAction();
        if (ctaAction instanceof GenericAction.DeeplinkAction) {
            Navigator navigator = getNavigator();
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Navigator.DefaultImpls.handleDeepLink$default(navigator, context, ((GenericAction.DeeplinkAction) ctaAction).getUri(), Boolean.FALSE, null, false, null, 56, null);
        }
    }

    @Override // com.robinhood.shared.iac.infobanner.InfoBannerCallbacks
    public void onDismissInfoBanner(IacInfoBanner banner) {
        Intrinsics.checkNotNullParameter(banner, "banner");
        ViewScopedCompletable.subscribe$default(ViewDisposerKt.bindTo(getIacInfoBannerStore().postDismissed(banner.getReceiptUuid(), IacDismissMethod.CTA), this), null, null, 3, null);
        getInfoBannerView().setVisibility(8);
    }

    /* compiled from: OrderDetailView.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0096\u0001R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/equities/history/OrderDetailView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/equities/history/OrderDetailView;", "<init>", "()V", "SAVE_SUPER_STATE", "", "SAVE_ORDER_ID", "inflate", "parent", "Landroid/view/ViewGroup;", "lib-equity-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<OrderDetailView> {
        private final /* synthetic */ Inflater<OrderDetailView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public OrderDetailView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (OrderDetailView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C33130R.layout.include_order_detail_view);
        }
    }

    private final EquityOrderContext toRosetta(UiOrder uiOrder) {
        String string2 = uiOrder.getOrder().getInstrument().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        String symbol = uiOrder.getSymbol();
        if (symbol == null) {
            symbol = "";
        }
        return new EquityOrderContext(string2, symbol, Orders2.toProtobuf(uiOrder.getOrder().getSide()), Orders2.toProtobuf(uiOrder.getOrder().getType()), Orders2.toProtobuf(uiOrder.getOrder().getTrigger()), Booleans2.toProtobuf(Boolean.valueOf(uiOrder.getOrder().isDollarBased())), Booleans2.toProtobuf(Boolean.valueOf(uiOrder.getOrder().getTrailingPeg() != null)), Booleans2.toProtobuf(Boolean.valueOf(uiOrder.getOrder().getPresetPercentLimit() != null)), Orders2.toProtobuf(uiOrder.getOrder().getMarketHours()), null, null, null, null, null, null, null, Orders2.toProtobuf(uiOrder.getOrder().getPositionEffect()), null, null, null, 982528, null);
    }
}
