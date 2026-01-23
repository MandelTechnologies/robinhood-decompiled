package com.robinhood.android.equitydetail.p123ui;

import androidx.fragment.app.Fragment;
import com.robinhood.android.charts.BentoExtensions;
import com.robinhood.android.common.p088ui.CuratedListChipItem;
import com.robinhood.android.designsystem.style.DirectionOverlay;
import com.robinhood.android.educationtour.EducationTourEntryPointData;
import com.robinhood.android.educationtour.EducationTourScreenNames;
import com.robinhood.android.equities.companyfinancials.CompanyFinancialsSectionViewState;
import com.robinhood.android.equities.shortinterest.ShortInterestSectionViewState;
import com.robinhood.android.equitydetail.p123ui.EarningsViewData;
import com.robinhood.android.margin.experiments.MarginRatioIndicator;
import com.robinhood.android.newsfeed.extensions.NewsFeedElements;
import com.robinhood.android.newsfeed.model.Content;
import com.robinhood.android.trading.contracts.EquitiesSubzeroSiChart;
import com.robinhood.android.tradingtrends.p264ui.chartSection.TradingTrendsChartSectionState3;
import com.robinhood.directipo.models.p292db.IpoQuote;
import com.robinhood.directipo.models.p292db.StockDetailIpoResultsSection;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.librobinhood.data.store.bonfire.instrument.InstrumentChartSpansStore4;
import com.robinhood.models.api.bonfire.ApiStockDetail;
import com.robinhood.models.crypto.p314db.UnifiedBalances;
import com.robinhood.models.newsfeed.p334db.dao.NewsFeedElement;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.AggregateOptionQuote;
import com.robinhood.models.p320db.AnalystOverview;
import com.robinhood.models.p320db.EtpDetails;
import com.robinhood.models.p320db.IacInfoBanner;
import com.robinhood.models.p320db.IacInfoBannerLocation;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.Instrument4;
import com.robinhood.models.p320db.MarginRequirements;
import com.robinhood.models.p320db.OptionChainCollateral;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.Position;
import com.robinhood.models.p320db.Position5;
import com.robinhood.models.p320db.bonfire.StockDetailHeader;
import com.robinhood.models.p320db.bonfire.StockDetailMilestonesSection;
import com.robinhood.models.p320db.bonfire.StockDetailS1Section;
import com.robinhood.models.p320db.bonfire.instrument.SduiInstrumentChart;
import com.robinhood.models.p320db.herocard.IacHeroCard;
import com.robinhood.models.p320db.phoenix.UnifiedAccountV2;
import com.robinhood.models.p355ui.UiAggregateOptionPosition;
import com.robinhood.models.p355ui.UiOptionEvent;
import com.robinhood.models.p355ui.bonfire.UiStockDetail;
import com.robinhood.models.serverdriven.experimental.api.Chart;
import com.robinhood.models.serverdriven.experimental.api.CursorData;
import com.robinhood.models.serverdriven.experimental.api.Direction;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import com.robinhood.models.serverdriven.experimental.api.DisplayText;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.p347db.TimelineRow;
import com.robinhood.models.subscription.p352db.MarginSubscription;
import com.robinhood.recurring.models.p365db.InvestmentSchedule;
import com.robinhood.shared.equities.models.instrumentdetails.p380db.Fundamental;
import com.robinhood.shared.equities.models.instrumentdetails.p380db.InstrumentRatings;
import com.robinhood.shared.equities.models.instrumentdetails.p381ui.UiEarnings;
import com.robinhood.shared.iac.extensions.IacInfoBanners;
import com.robinhood.shared.models.api.bonfire.education.tour.EducationTourEntryPoint;
import com.robinhood.shared.models.p387db.bonfire.education.tour.EducationTour;
import com.robinhood.shareholderx.models.p401db.ShareholderEntryPointResponse;
import com.robinhood.shareholderx.models.p401db.ShareholderEventsSection;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.logging.EventMetadata;
import com.robinhood.utils.logging.SentryTeam;
import com.robinhood.utils.math.BigDecimals7;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import okhttp3.HttpUrl;

/* compiled from: InstrumentDetailViewState.kt */
@Metadata(m3635d1 = {"\u0000Ô\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\bA\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0081\u0002BÁ\u0005\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0016\u0012\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0016\u0012\u0016\b\u0002\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020 \u0018\u00010\u001f\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"\u0012\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u0016\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(\u0012\u000e\b\u0002\u0010)\u001a\b\u0012\u0004\u0012\u00020\t0\u0016\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010+\u0012\u0010\b\u0002\u0010,\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010\u0016\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010/\u0012\u000e\b\u0002\u00100\u001a\b\u0012\u0004\u0012\u0002010\u0016\u0012\b\b\u0002\u00102\u001a\u00020\u0004\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u000104\u0012\u0010\b\u0002\u00105\u001a\n\u0012\u0004\u0012\u000206\u0018\u00010\u0016\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u000108\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010:\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010<\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010>\u0012\b\b\u0002\u0010?\u001a\u00020\u0004\u0012\n\b\u0002\u0010@\u001a\u0004\u0018\u00010A\u0012\b\b\u0002\u0010B\u001a\u00020\u0004\u0012\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010D\u001a\u0004\u0018\u00010E\u0012\u0010\b\u0002\u0010F\u001a\n\u0012\u0004\u0012\u00020G\u0018\u00010\u0003\u0012\n\b\u0002\u0010H\u001a\u0004\u0018\u00010I\u0012\b\b\u0002\u0010J\u001a\u00020K\u0012\b\b\u0002\u0010L\u001a\u00020\u0004\u0012\n\b\u0002\u0010M\u001a\u0004\u0018\u00010N\u0012\n\b\u0002\u0010O\u001a\u0004\u0018\u00010P\u0012\b\b\u0002\u0010Q\u001a\u00020R\u0012\b\b\u0002\u0010S\u001a\u00020T\u0012\b\b\u0002\u0010U\u001a\u00020V\u0012\b\b\u0002\u0010W\u001a\u00020\u0004\u0012\b\b\u0002\u0010X\u001a\u00020\u0004\u0012\b\b\u0002\u0010Y\u001a\u00020\u0004\u0012\b\b\u0002\u0010Z\u001a\u00020\u0004\u0012\b\b\u0002\u0010[\u001a\u00020\u0004\u0012\b\b\u0002\u0010\\\u001a\u00020\u0004\u0012\b\b\u0002\u0010]\u001a\u00020\u0004\u0012\b\b\u0002\u0010^\u001a\u00020\u0004\u0012\b\b\u0002\u0010_\u001a\u00020\u0004\u0012\b\b\u0002\u0010`\u001a\u00020\u0004\u0012\b\b\u0002\u0010a\u001a\u00020b¢\u0006\u0004\bc\u0010dJ\u001f\u0010¤\u0001\u001a\u00020G*\n\u0012\u0005\u0012\u00030¦\u00010¥\u00012\b\u0010§\u0001\u001a\u00030¦\u0001H\u0002J\u001a\u0010¸\u0001\u001a\u00020G2\u000f\u0010¯\u0001\u001a\n\u0012\u0005\u0012\u00030¦\u00010¥\u0001H\u0002J\u001a\u0010¹\u0001\u001a\u00020G2\u000f\u0010¯\u0001\u001a\n\u0012\u0005\u0012\u00030¦\u00010¥\u0001H\u0002J\u001a\u0010º\u0001\u001a\u00020G2\u000f\u0010¯\u0001\u001a\n\u0012\u0005\u0012\u00030¦\u00010¥\u0001H\u0002J\u001a\u0010»\u0001\u001a\u00020G2\u000f\u0010¯\u0001\u001a\n\u0012\u0005\u0012\u00030¦\u00010¥\u0001H\u0002J\f\u0010¼\u0001\u001a\u0005\u0018\u00010½\u0001H\u0002J\u001a\u0010¾\u0001\u001a\u00020G2\u000f\u0010¯\u0001\u001a\n\u0012\u0005\u0012\u00030¦\u00010¥\u0001H\u0007J\u0011\u0010¿\u0001\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0012\u0010À\u0001\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Á\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\n\u0010Â\u0001\u001a\u00020\u0004HÆ\u0003J\u0012\u0010Ã\u0001\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0003HÆ\u0003J\f\u0010Ä\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0010\u0010Å\u0001\u001a\u00020\u0004HÀ\u0003¢\u0006\u0003\bÆ\u0001J\n\u0010Ç\u0001\u001a\u00020\u000eHÂ\u0003J\f\u0010È\u0001\u001a\u0004\u0018\u00010\u0010HÂ\u0003J\f\u0010É\u0001\u001a\u0004\u0018\u00010\u0012HÂ\u0003J\f\u0010Ê\u0001\u001a\u0004\u0018\u00010\u0014HÂ\u0003J\u0012\u0010Ë\u0001\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016HÂ\u0003J\f\u0010Ì\u0001\u001a\u0004\u0018\u00010\u0019HÂ\u0003J\u0012\u0010Í\u0001\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0016HÂ\u0003J\u0012\u0010Î\u0001\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0016HÂ\u0003J\u0018\u0010Ï\u0001\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020 \u0018\u00010\u001fHÂ\u0003J\f\u0010Ð\u0001\u001a\u0004\u0018\u00010\"HÂ\u0003J\u0010\u0010Ñ\u0001\u001a\b\u0012\u0004\u0012\u00020$0\u0016HÂ\u0003J\f\u0010Ò\u0001\u001a\u0004\u0018\u00010&HÂ\u0003J\f\u0010Ó\u0001\u001a\u0004\u0018\u00010(HÂ\u0003J\u0010\u0010Ô\u0001\u001a\b\u0012\u0004\u0012\u00020\t0\u0016HÂ\u0003J\f\u0010Õ\u0001\u001a\u0004\u0018\u00010+HÂ\u0003J\u0012\u0010Ö\u0001\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010\u0016HÂ\u0003J\f\u0010×\u0001\u001a\u0004\u0018\u00010/HÂ\u0003J\u0010\u0010Ø\u0001\u001a\b\u0012\u0004\u0012\u0002010\u0016HÂ\u0003J\n\u0010Ù\u0001\u001a\u00020\u0004HÂ\u0003J\f\u0010Ú\u0001\u001a\u0004\u0018\u000104HÂ\u0003J\u0012\u0010Û\u0001\u001a\n\u0012\u0004\u0012\u000206\u0018\u00010\u0016HÂ\u0003J\f\u0010Ü\u0001\u001a\u0004\u0018\u000108HÂ\u0003J\f\u0010Ý\u0001\u001a\u0004\u0018\u00010:HÂ\u0003J\f\u0010Þ\u0001\u001a\u0004\u0018\u00010<HÂ\u0003J\f\u0010ß\u0001\u001a\u0004\u0018\u00010>HÂ\u0003J\n\u0010à\u0001\u001a\u00020\u0004HÂ\u0003J\f\u0010á\u0001\u001a\u0004\u0018\u00010AHÂ\u0003J\n\u0010â\u0001\u001a\u00020\u0004HÂ\u0003J\u0012\u0010ã\u0001\u001a\u0004\u0018\u00010\u0004HÂ\u0003¢\u0006\u0003\u0010ä\u0001J\f\u0010å\u0001\u001a\u0004\u0018\u00010EHÂ\u0003J\u0012\u0010æ\u0001\u001a\n\u0012\u0004\u0012\u00020G\u0018\u00010\u0003HÆ\u0003J\f\u0010ç\u0001\u001a\u0004\u0018\u00010IHÆ\u0003J\n\u0010è\u0001\u001a\u00020KHÆ\u0003J\n\u0010é\u0001\u001a\u00020\u0004HÆ\u0003J\f\u0010ê\u0001\u001a\u0004\u0018\u00010NHÂ\u0003J\f\u0010ë\u0001\u001a\u0004\u0018\u00010PHÂ\u0003J\n\u0010ì\u0001\u001a\u00020RHÆ\u0003J\n\u0010í\u0001\u001a\u00020THÆ\u0003J\n\u0010î\u0001\u001a\u00020VHÆ\u0003J\n\u0010ï\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010ð\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010ñ\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010ò\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010ó\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010ô\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010õ\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010ö\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010÷\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010ø\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010ù\u0001\u001a\u00020bHÆ\u0003JÌ\u0005\u0010ú\u0001\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00162\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u00162\u0016\b\u0002\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020 \u0018\u00010\u001f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u00162\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(2\u000e\b\u0002\u0010)\u001a\b\u0012\u0004\u0012\u00020\t0\u00162\n\b\u0002\u0010*\u001a\u0004\u0018\u00010+2\u0010\b\u0002\u0010,\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010\u00162\n\b\u0002\u0010.\u001a\u0004\u0018\u00010/2\u000e\b\u0002\u00100\u001a\b\u0012\u0004\u0012\u0002010\u00162\b\b\u0002\u00102\u001a\u00020\u00042\n\b\u0002\u00103\u001a\u0004\u0018\u0001042\u0010\b\u0002\u00105\u001a\n\u0012\u0004\u0012\u000206\u0018\u00010\u00162\n\b\u0002\u00107\u001a\u0004\u0018\u0001082\n\b\u0002\u00109\u001a\u0004\u0018\u00010:2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010<2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010>2\b\b\u0002\u0010?\u001a\u00020\u00042\n\b\u0002\u0010@\u001a\u0004\u0018\u00010A2\b\b\u0002\u0010B\u001a\u00020\u00042\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010D\u001a\u0004\u0018\u00010E2\u0010\b\u0002\u0010F\u001a\n\u0012\u0004\u0012\u00020G\u0018\u00010\u00032\n\b\u0002\u0010H\u001a\u0004\u0018\u00010I2\b\b\u0002\u0010J\u001a\u00020K2\b\b\u0002\u0010L\u001a\u00020\u00042\n\b\u0002\u0010M\u001a\u0004\u0018\u00010N2\n\b\u0002\u0010O\u001a\u0004\u0018\u00010P2\b\b\u0002\u0010Q\u001a\u00020R2\b\b\u0002\u0010S\u001a\u00020T2\b\b\u0002\u0010U\u001a\u00020V2\b\b\u0002\u0010W\u001a\u00020\u00042\b\b\u0002\u0010X\u001a\u00020\u00042\b\b\u0002\u0010Y\u001a\u00020\u00042\b\b\u0002\u0010Z\u001a\u00020\u00042\b\b\u0002\u0010[\u001a\u00020\u00042\b\b\u0002\u0010\\\u001a\u00020\u00042\b\b\u0002\u0010]\u001a\u00020\u00042\b\b\u0002\u0010^\u001a\u00020\u00042\b\b\u0002\u0010_\u001a\u00020\u00042\b\b\u0002\u0010`\u001a\u00020\u00042\b\b\u0002\u0010a\u001a\u00020bHÆ\u0001¢\u0006\u0003\u0010û\u0001J\u0015\u0010ü\u0001\u001a\u00020\u00042\t\u0010ý\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u000b\u0010þ\u0001\u001a\u00030ÿ\u0001HÖ\u0001J\n\u0010\u0080\u0002\u001a\u00020PHÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\be\u0010fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bg\u0010hR\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010iR\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bj\u0010fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bk\u0010lR\u0016\u0010\f\u001a\u00020\u00048AX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bm\u0010iR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020 \u0018\u00010\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010'\u001a\u0004\u0018\u00010(X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010)\u001a\b\u0012\u0004\u0012\u00020\t0\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010*\u001a\u0004\u0018\u00010+X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010,\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010.\u001a\u0004\u0018\u00010/X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00100\u001a\b\u0012\u0004\u0012\u0002010\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u00103\u001a\u0004\u0018\u000104X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u00105\u001a\n\u0012\u0004\u0012\u000206\u0018\u00010\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u00107\u001a\u0004\u0018\u000108X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u00109\u001a\u0004\u0018\u00010:X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010;\u001a\u0004\u0018\u00010<X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010=\u001a\u0004\u0018\u00010>X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010@\u001a\u0004\u0018\u00010AX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010C\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010nR\u0010\u0010D\u001a\u0004\u0018\u00010EX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010F\u001a\n\u0012\u0004\u0012\u00020G\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bo\u0010fR\u0013\u0010H\u001a\u0004\u0018\u00010I¢\u0006\b\n\u0000\u001a\u0004\bp\u0010qR\u0011\u0010J\u001a\u00020K¢\u0006\b\n\u0000\u001a\u0004\br\u0010sR\u0011\u0010L\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bt\u0010iR\u0010\u0010M\u001a\u0004\u0018\u00010NX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010O\u001a\u0004\u0018\u00010PX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010Q\u001a\u00020R¢\u0006\b\n\u0000\u001a\u0004\bu\u0010vR\u0011\u0010S\u001a\u00020T¢\u0006\b\n\u0000\u001a\u0004\bw\u0010xR\u0011\u0010U\u001a\u00020V¢\u0006\b\n\u0000\u001a\u0004\by\u0010zR\u0011\u0010W\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b{\u0010iR\u0011\u0010X\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b|\u0010iR\u0011\u0010Y\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b}\u0010iR\u0011\u0010Z\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b~\u0010iR\u0011\u0010[\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u007f\u0010iR\u0012\u0010\\\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0080\u0001\u0010iR\u0012\u0010]\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0081\u0001\u0010iR\u0012\u0010^\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0082\u0001\u0010iR\u0012\u0010_\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0083\u0001\u0010iR\u0012\u0010`\u001a\u00020\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0084\u0001\u0010iR\u0013\u0010a\u001a\u00020b¢\u0006\n\n\u0000\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0016\u0010\u0087\u0001\u001a\u0004\u0018\u00010P8F¢\u0006\b\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0017\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u008b\u00018F¢\u0006\b\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0017\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u008f\u00018F¢\u0006\b\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0017\u0010\u0092\u0001\u001a\n\u0012\u0005\u0012\u00030\u0094\u00010\u0093\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0095\u0001\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0096\u0001\u0010iR\u0017\u0010\u0097\u0001\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0098\u0001\u001a\t\u0012\u0005\u0012\u00030\u0099\u00010\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u009a\u0001\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u009b\u0001\u001a\u00020\u00048F¢\u0006\u0007\u001a\u0005\b\u009c\u0001\u0010iR\u000f\u0010\u009d\u0001\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u001e\u0010\u009e\u0001\u001a\u00020\u00048@X\u0081\u0004¢\u0006\u000f\u0012\u0006\b\u009f\u0001\u0010 \u0001\u001a\u0005\b¡\u0001\u0010iR\u000f\u0010¢\u0001\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010£\u0001\u001a\u00020\u00048F¢\u0006\u0007\u001a\u0005\b£\u0001\u0010iR\u001b\u0010¨\u0001\u001a\u00020\u0004*\u00020\u00128BX\u0082\u0004¢\u0006\b\u001a\u0006\b©\u0001\u0010ª\u0001R\u0016\u0010«\u0001\u001a\u0004\u0018\u00010P¢\u0006\n\n\u0000\u001a\u0006\b¬\u0001\u0010\u0089\u0001R\u0012\u0010\u00ad\u0001\u001a\u0005\u0018\u00010®\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010¯\u0001\u001a\t\u0012\u0005\u0012\u00030¦\u00010\u0016¢\u0006\n\n\u0000\u001a\u0006\b°\u0001\u0010±\u0001R \u0010²\u0001\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0006\b³\u0001\u0010 \u0001\u001a\u0005\b´\u0001\u0010iR\u001a\u0010µ\u0001\u001a\u0005\u0018\u00010¦\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b¶\u0001\u0010·\u0001¨\u0006\u0082\u0002"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/InstrumentDetailViewState;", "", "showIpoAccessOnboardingEvent", "Lcom/robinhood/udf/UiEvent;", "", "marginSubscription", "Lcom/robinhood/models/subscription/db/MarginSubscription;", "isShowingEducationTour", "adtInfoSheetEvent", "Ljava/util/UUID;", "account", "Lcom/robinhood/models/db/Account;", "showSlipSection", "instrument", "Lcom/robinhood/models/db/Instrument;", "balances", "Lcom/robinhood/models/crypto/db/UnifiedBalances;", "fundamental", "Lcom/robinhood/shared/equities/models/instrumentdetails/db/Fundamental;", "ratings", "Lcom/robinhood/shared/equities/models/instrumentdetails/db/InstrumentRatings;", "orders", "", "Lcom/robinhood/models/db/Order;", "optionChainCollateral", "Lcom/robinhood/models/db/OptionChainCollateral;", "allOptionEvents", "Lcom/robinhood/models/ui/UiOptionEvent;", "aggregateOptionPositions", "Lcom/robinhood/models/ui/UiAggregateOptionPosition;", "aggregateOptionQuotes", "", "Lcom/robinhood/models/db/AggregateOptionQuote;", "position", "Lcom/robinhood/models/db/Position;", "investmentSchedules", "Lcom/robinhood/recurring/models/db/InvestmentSchedule;", "brokebackEarnings", "Lcom/robinhood/shared/equities/models/instrumentdetails/ui/UiEarnings;", "ipoQuote", "Lcom/robinhood/directipo/models/db/IpoQuote;", "similarInstrumentIds", "analystOverview", "Lcom/robinhood/models/db/AnalystOverview;", "relatedIndustryLists", "Lcom/robinhood/android/common/ui/CuratedListChipItem;", "unifiedAccount", "Lcom/robinhood/models/db/phoenix/UnifiedAccountV2;", "iacInfoBanners", "Lcom/robinhood/models/db/IacInfoBanner;", "isInstrumentRecurringTradable", "stockDetail", "Lcom/robinhood/models/ui/bonfire/UiStockDetail;", "newsFeed", "Lcom/robinhood/models/newsfeed/db/dao/NewsFeedElement;", "etpDetails", "Lcom/robinhood/models/db/EtpDetails;", "educationTour", "Lcom/robinhood/shared/models/db/bonfire/education/tour/EducationTour;", "shareholderEntryPointResponse", "Lcom/robinhood/shareholderx/models/db/ShareholderEntryPointResponse;", "shareholderEventsSection", "Lcom/robinhood/shareholderx/models/db/ShareholderEventsSection;", "isMarginInvestingEnabled", "marginRequirements", "Lcom/robinhood/models/db/MarginRequirements;", "isRecurringSupported", "isCopilotSupported", "locality", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "twentyFourHourMarketSurveyEvent", "", InstrumentDetailDuxo.KEY_IAC_HERO_CARD, "Lcom/robinhood/models/db/herocard/IacHeroCard;", "sdpMode", "Lcom/robinhood/android/equitydetail/ui/InstrumentDetailViewState$SdpMode;", "inMarginHubDiscoverabilityExperiment", "instrumentChart", "Lcom/robinhood/models/db/bonfire/instrument/SduiInstrumentChart;", "activeDisplaySpanId", "", "tradingTrendsState", "Lcom/robinhood/android/tradingtrends/ui/chartSection/TradingTrendsChartSectionViewState;", "companyFinancialsState", "Lcom/robinhood/android/equities/companyfinancials/CompanyFinancialsSectionViewState;", "shortInterestState", "Lcom/robinhood/android/equities/shortinterest/ShortInterestSectionViewState;", "inProfitAndLossAverageCostRetirement", "inPnlUpdates", "inSdpV2Experiment", "earningsSduiChartExperiment", "inGoldUngatingL2DataExperiment", "inEquityCefLabelsExperiment", "shouldShowOptionLevel3CardEntryPoint", "shouldShowOptionsPortfolioRiskAnalyzer", "inVenturesRegionGate", "inReorderOptionsSectionOnSdpExperiment", "marginRatioIndicatorVariant", "Lcom/robinhood/android/margin/experiments/MarginRatioIndicator$Variant;", "<init>", "(Lcom/robinhood/udf/UiEvent;Lcom/robinhood/models/subscription/db/MarginSubscription;ZLcom/robinhood/udf/UiEvent;Lcom/robinhood/models/db/Account;ZLcom/robinhood/models/db/Instrument;Lcom/robinhood/models/crypto/db/UnifiedBalances;Lcom/robinhood/shared/equities/models/instrumentdetails/db/Fundamental;Lcom/robinhood/shared/equities/models/instrumentdetails/db/InstrumentRatings;Ljava/util/List;Lcom/robinhood/models/db/OptionChainCollateral;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Lcom/robinhood/models/db/Position;Ljava/util/List;Lcom/robinhood/shared/equities/models/instrumentdetails/ui/UiEarnings;Lcom/robinhood/directipo/models/db/IpoQuote;Ljava/util/List;Lcom/robinhood/models/db/AnalystOverview;Ljava/util/List;Lcom/robinhood/models/db/phoenix/UnifiedAccountV2;Ljava/util/List;ZLcom/robinhood/models/ui/bonfire/UiStockDetail;Ljava/util/List;Lcom/robinhood/models/db/EtpDetails;Lcom/robinhood/shared/models/db/bonfire/education/tour/EducationTour;Lcom/robinhood/shareholderx/models/db/ShareholderEntryPointResponse;Lcom/robinhood/shareholderx/models/db/ShareholderEventsSection;ZLcom/robinhood/models/db/MarginRequirements;ZLjava/lang/Boolean;Lcom/robinhood/iso/countrycode/CountryCode$Supported;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/models/db/herocard/IacHeroCard;Lcom/robinhood/android/equitydetail/ui/InstrumentDetailViewState$SdpMode;ZLcom/robinhood/models/db/bonfire/instrument/SduiInstrumentChart;Ljava/lang/String;Lcom/robinhood/android/tradingtrends/ui/chartSection/TradingTrendsChartSectionViewState;Lcom/robinhood/android/equities/companyfinancials/CompanyFinancialsSectionViewState;Lcom/robinhood/android/equities/shortinterest/ShortInterestSectionViewState;ZZZZZZZZZZLcom/robinhood/android/margin/experiments/MarginRatioIndicator$Variant;)V", "getShowIpoAccessOnboardingEvent", "()Lcom/robinhood/udf/UiEvent;", "getMarginSubscription", "()Lcom/robinhood/models/subscription/db/MarginSubscription;", "()Z", "getAdtInfoSheetEvent", "getAccount", "()Lcom/robinhood/models/db/Account;", "getShowSlipSection$feature_equity_detail_externalDebug", "Ljava/lang/Boolean;", "getTwentyFourHourMarketSurveyEvent", "getIacHeroCard", "()Lcom/robinhood/models/db/herocard/IacHeroCard;", "getSdpMode", "()Lcom/robinhood/android/equitydetail/ui/InstrumentDetailViewState$SdpMode;", "getInMarginHubDiscoverabilityExperiment", "getTradingTrendsState", "()Lcom/robinhood/android/tradingtrends/ui/chartSection/TradingTrendsChartSectionViewState;", "getCompanyFinancialsState", "()Lcom/robinhood/android/equities/companyfinancials/CompanyFinancialsSectionViewState;", "getShortInterestState", "()Lcom/robinhood/android/equities/shortinterest/ShortInterestSectionViewState;", "getInProfitAndLossAverageCostRetirement", "getInPnlUpdates", "getInSdpV2Experiment", "getEarningsSduiChartExperiment", "getInGoldUngatingL2DataExperiment", "getInEquityCefLabelsExperiment", "getShouldShowOptionLevel3CardEntryPoint", "getShouldShowOptionsPortfolioRiskAnalyzer", "getInVenturesRegionGate", "getInReorderOptionsSectionOnSdpExperiment", "getMarginRatioIndicatorVariant", "()Lcom/robinhood/android/margin/experiments/MarginRatioIndicator$Variant;", "instrumentPrice", "getInstrumentPrice", "()Ljava/lang/String;", "chartDirection", "Lcom/robinhood/android/designsystem/style/DirectionOverlay;", "getChartDirection", "()Lcom/robinhood/android/designsystem/style/DirectionOverlay;", "currentDisplaySpan", "Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "getCurrentDisplaySpan", "()Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "hiddenSectionDataTypes", "", "Lcom/robinhood/models/api/bonfire/ApiStockDetail$Section;", "shouldShowEtpComposition", "getShouldShowEtpComposition", "pendingOrders", "newsFeedContent", "Lcom/robinhood/android/newsfeed/model/Content;", "optionEventsHeldForExercise", "shouldShowMarginRequirements", "getShouldShowMarginRequirements", "isEtpCompositionV2Enabled", "serverDrivenChartIsEmpty", "getServerDrivenChartIsEmpty$feature_equity_detail_externalDebug$annotations", "()V", "getServerDrivenChartIsEmpty$feature_equity_detail_externalDebug", "isChartLoaded", "isConsideredLoaded", "addWithHeaderData", "", "Lcom/robinhood/android/equitydetail/ui/DetailData;", "detailData", "hasDescription", "getHasDescription", "(Lcom/robinhood/shared/equities/models/instrumentdetails/db/Fundamental;)Z", "educationTourTrackingId", "getEducationTourTrackingId", "educationTourEntryPoint", "Lcom/robinhood/shared/models/api/bonfire/education/tour/EducationTourEntryPoint;", "detailDataList", "getDetailDataList", "()Ljava/util/List;", "showOvernightVolumeStats", "getShowOvernightVolumeStats$annotations", "getShowOvernightVolumeStats", "recurringData", "getRecurringData", "()Lcom/robinhood/android/equitydetail/ui/DetailData;", "addTradingTrends", "addCompanyFinancials", "addShortInterest", "addOptionsSection", "createEducationTourEntryPointDataIfPossible", "Lcom/robinhood/android/educationtour/EducationTourEntryPointData;", "injectIacHeroSdpCards", "reset", "component1", "component2", "component3", "component4", "component5", "component6", "component6$feature_equity_detail_externalDebug", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "()Ljava/lang/Boolean;", "component36", "component37", "component38", "component39", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "copy", "(Lcom/robinhood/udf/UiEvent;Lcom/robinhood/models/subscription/db/MarginSubscription;ZLcom/robinhood/udf/UiEvent;Lcom/robinhood/models/db/Account;ZLcom/robinhood/models/db/Instrument;Lcom/robinhood/models/crypto/db/UnifiedBalances;Lcom/robinhood/shared/equities/models/instrumentdetails/db/Fundamental;Lcom/robinhood/shared/equities/models/instrumentdetails/db/InstrumentRatings;Ljava/util/List;Lcom/robinhood/models/db/OptionChainCollateral;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Lcom/robinhood/models/db/Position;Ljava/util/List;Lcom/robinhood/shared/equities/models/instrumentdetails/ui/UiEarnings;Lcom/robinhood/directipo/models/db/IpoQuote;Ljava/util/List;Lcom/robinhood/models/db/AnalystOverview;Ljava/util/List;Lcom/robinhood/models/db/phoenix/UnifiedAccountV2;Ljava/util/List;ZLcom/robinhood/models/ui/bonfire/UiStockDetail;Ljava/util/List;Lcom/robinhood/models/db/EtpDetails;Lcom/robinhood/shared/models/db/bonfire/education/tour/EducationTour;Lcom/robinhood/shareholderx/models/db/ShareholderEntryPointResponse;Lcom/robinhood/shareholderx/models/db/ShareholderEventsSection;ZLcom/robinhood/models/db/MarginRequirements;ZLjava/lang/Boolean;Lcom/robinhood/iso/countrycode/CountryCode$Supported;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/models/db/herocard/IacHeroCard;Lcom/robinhood/android/equitydetail/ui/InstrumentDetailViewState$SdpMode;ZLcom/robinhood/models/db/bonfire/instrument/SduiInstrumentChart;Ljava/lang/String;Lcom/robinhood/android/tradingtrends/ui/chartSection/TradingTrendsChartSectionViewState;Lcom/robinhood/android/equities/companyfinancials/CompanyFinancialsSectionViewState;Lcom/robinhood/android/equities/shortinterest/ShortInterestSectionViewState;ZZZZZZZZZZLcom/robinhood/android/margin/experiments/MarginRatioIndicator$Variant;)Lcom/robinhood/android/equitydetail/ui/InstrumentDetailViewState;", "equals", "other", "hashCode", "", "toString", "SdpMode", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final /* data */ class InstrumentDetailViewState {
    public static final int $stable = 8;
    private final Account account;
    private final String activeDisplaySpanId;
    private final UiEvent<UUID> adtInfoSheetEvent;
    private final List<UiAggregateOptionPosition> aggregateOptionPositions;
    private final Map<UUID, AggregateOptionQuote> aggregateOptionQuotes;
    private final List<UiOptionEvent> allOptionEvents;
    private final AnalystOverview analystOverview;
    private final UnifiedBalances balances;
    private final UiEarnings brokebackEarnings;
    private final CompanyFinancialsSectionViewState companyFinancialsState;
    private final List<DetailData> detailDataList;
    private final boolean earningsSduiChartExperiment;
    private final EducationTour educationTour;
    private final EducationTourEntryPoint educationTourEntryPoint;
    private final String educationTourTrackingId;
    private final EtpDetails etpDetails;
    private final Fundamental fundamental;
    private final Set<ApiStockDetail.Section> hiddenSectionDataTypes;
    private final IacHeroCard iacHeroCard;
    private final List<IacInfoBanner> iacInfoBanners;
    private final boolean inEquityCefLabelsExperiment;
    private final boolean inGoldUngatingL2DataExperiment;
    private final boolean inMarginHubDiscoverabilityExperiment;
    private final boolean inPnlUpdates;
    private final boolean inProfitAndLossAverageCostRetirement;
    private final boolean inReorderOptionsSectionOnSdpExperiment;
    private final boolean inSdpV2Experiment;
    private final boolean inVenturesRegionGate;
    private final Instrument instrument;
    private final SduiInstrumentChart instrumentChart;
    private final List<InvestmentSchedule> investmentSchedules;
    private final IpoQuote ipoQuote;
    private final boolean isChartLoaded;
    private final Boolean isCopilotSupported;
    private final boolean isEtpCompositionV2Enabled;
    private final boolean isInstrumentRecurringTradable;
    private final boolean isMarginInvestingEnabled;
    private final boolean isRecurringSupported;
    private final boolean isShowingEducationTour;
    private final CountryCode.Supported locality;
    private final MarginRatioIndicator.Variant marginRatioIndicatorVariant;
    private final MarginRequirements marginRequirements;
    private final MarginSubscription marginSubscription;
    private final List<NewsFeedElement> newsFeed;
    private final List<Content> newsFeedContent;
    private final OptionChainCollateral optionChainCollateral;
    private final List<UiOptionEvent> optionEventsHeldForExercise;
    private final List<Order> orders;
    private final List<Order> pendingOrders;
    private final Position position;
    private final InstrumentRatings ratings;
    private final List<CuratedListChipItem> relatedIndustryLists;
    private final SdpMode sdpMode;
    private final ShareholderEntryPointResponse shareholderEntryPointResponse;
    private final ShareholderEventsSection shareholderEventsSection;
    private final ShortInterestSectionViewState shortInterestState;
    private final boolean shouldShowOptionLevel3CardEntryPoint;
    private final boolean shouldShowOptionsPortfolioRiskAnalyzer;
    private final UiEvent<Boolean> showIpoAccessOnboardingEvent;
    private final boolean showOvernightVolumeStats;
    private final boolean showSlipSection;
    private final List<UUID> similarInstrumentIds;
    private final UiStockDetail stockDetail;
    private final TradingTrendsChartSectionState3 tradingTrendsState;
    private final UiEvent<Unit> twentyFourHourMarketSurveyEvent;
    private final UnifiedAccountV2 unifiedAccount;

    /* renamed from: component10, reason: from getter */
    private final InstrumentRatings getRatings() {
        return this.ratings;
    }

    private final List<Order> component11() {
        return this.orders;
    }

    /* renamed from: component12, reason: from getter */
    private final OptionChainCollateral getOptionChainCollateral() {
        return this.optionChainCollateral;
    }

    private final List<UiOptionEvent> component13() {
        return this.allOptionEvents;
    }

    private final List<UiAggregateOptionPosition> component14() {
        return this.aggregateOptionPositions;
    }

    private final Map<UUID, AggregateOptionQuote> component15() {
        return this.aggregateOptionQuotes;
    }

    /* renamed from: component16, reason: from getter */
    private final Position getPosition() {
        return this.position;
    }

    private final List<InvestmentSchedule> component17() {
        return this.investmentSchedules;
    }

    /* renamed from: component18, reason: from getter */
    private final UiEarnings getBrokebackEarnings() {
        return this.brokebackEarnings;
    }

    /* renamed from: component19, reason: from getter */
    private final IpoQuote getIpoQuote() {
        return this.ipoQuote;
    }

    private final List<UUID> component20() {
        return this.similarInstrumentIds;
    }

    /* renamed from: component21, reason: from getter */
    private final AnalystOverview getAnalystOverview() {
        return this.analystOverview;
    }

    private final List<CuratedListChipItem> component22() {
        return this.relatedIndustryLists;
    }

    /* renamed from: component23, reason: from getter */
    private final UnifiedAccountV2 getUnifiedAccount() {
        return this.unifiedAccount;
    }

    private final List<IacInfoBanner> component24() {
        return this.iacInfoBanners;
    }

    /* renamed from: component25, reason: from getter */
    private final boolean getIsInstrumentRecurringTradable() {
        return this.isInstrumentRecurringTradable;
    }

    /* renamed from: component26, reason: from getter */
    private final UiStockDetail getStockDetail() {
        return this.stockDetail;
    }

    private final List<NewsFeedElement> component27() {
        return this.newsFeed;
    }

    /* renamed from: component28, reason: from getter */
    private final EtpDetails getEtpDetails() {
        return this.etpDetails;
    }

    /* renamed from: component29, reason: from getter */
    private final EducationTour getEducationTour() {
        return this.educationTour;
    }

    /* renamed from: component30, reason: from getter */
    private final ShareholderEntryPointResponse getShareholderEntryPointResponse() {
        return this.shareholderEntryPointResponse;
    }

    /* renamed from: component31, reason: from getter */
    private final ShareholderEventsSection getShareholderEventsSection() {
        return this.shareholderEventsSection;
    }

    /* renamed from: component32, reason: from getter */
    private final boolean getIsMarginInvestingEnabled() {
        return this.isMarginInvestingEnabled;
    }

    /* renamed from: component33, reason: from getter */
    private final MarginRequirements getMarginRequirements() {
        return this.marginRequirements;
    }

    /* renamed from: component34, reason: from getter */
    private final boolean getIsRecurringSupported() {
        return this.isRecurringSupported;
    }

    /* renamed from: component35, reason: from getter */
    private final Boolean getIsCopilotSupported() {
        return this.isCopilotSupported;
    }

    /* renamed from: component36, reason: from getter */
    private final CountryCode.Supported getLocality() {
        return this.locality;
    }

    /* renamed from: component41, reason: from getter */
    private final SduiInstrumentChart getInstrumentChart() {
        return this.instrumentChart;
    }

    /* renamed from: component42, reason: from getter */
    private final String getActiveDisplaySpanId() {
        return this.activeDisplaySpanId;
    }

    /* renamed from: component7, reason: from getter */
    private final Instrument getInstrument() {
        return this.instrument;
    }

    /* renamed from: component8, reason: from getter */
    private final UnifiedBalances getBalances() {
        return this.balances;
    }

    /* renamed from: component9, reason: from getter */
    private final Fundamental getFundamental() {
        return this.fundamental;
    }

    public static /* synthetic */ InstrumentDetailViewState copy$default(InstrumentDetailViewState instrumentDetailViewState, UiEvent uiEvent, MarginSubscription marginSubscription, boolean z, UiEvent uiEvent2, Account account, boolean z2, Instrument instrument, UnifiedBalances unifiedBalances, Fundamental fundamental, InstrumentRatings instrumentRatings, List list, OptionChainCollateral optionChainCollateral, List list2, List list3, Map map, Position position, List list4, UiEarnings uiEarnings, IpoQuote ipoQuote, List list5, AnalystOverview analystOverview, List list6, UnifiedAccountV2 unifiedAccountV2, List list7, boolean z3, UiStockDetail uiStockDetail, List list8, EtpDetails etpDetails, EducationTour educationTour, ShareholderEntryPointResponse shareholderEntryPointResponse, ShareholderEventsSection shareholderEventsSection, boolean z4, MarginRequirements marginRequirements, boolean z5, Boolean bool, CountryCode.Supported supported, UiEvent uiEvent3, IacHeroCard iacHeroCard, SdpMode sdpMode, boolean z6, SduiInstrumentChart sduiInstrumentChart, String str, TradingTrendsChartSectionState3 tradingTrendsChartSectionState3, CompanyFinancialsSectionViewState companyFinancialsSectionViewState, ShortInterestSectionViewState shortInterestSectionViewState, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, MarginRatioIndicator.Variant variant, int i, int i2, Object obj) {
        return instrumentDetailViewState.copy((i & 1) != 0 ? instrumentDetailViewState.showIpoAccessOnboardingEvent : uiEvent, (i & 2) != 0 ? instrumentDetailViewState.marginSubscription : marginSubscription, (i & 4) != 0 ? instrumentDetailViewState.isShowingEducationTour : z, (i & 8) != 0 ? instrumentDetailViewState.adtInfoSheetEvent : uiEvent2, (i & 16) != 0 ? instrumentDetailViewState.account : account, (i & 32) != 0 ? instrumentDetailViewState.showSlipSection : z2, (i & 64) != 0 ? instrumentDetailViewState.instrument : instrument, (i & 128) != 0 ? instrumentDetailViewState.balances : unifiedBalances, (i & 256) != 0 ? instrumentDetailViewState.fundamental : fundamental, (i & 512) != 0 ? instrumentDetailViewState.ratings : instrumentRatings, (i & 1024) != 0 ? instrumentDetailViewState.orders : list, (i & 2048) != 0 ? instrumentDetailViewState.optionChainCollateral : optionChainCollateral, (i & 4096) != 0 ? instrumentDetailViewState.allOptionEvents : list2, (i & 8192) != 0 ? instrumentDetailViewState.aggregateOptionPositions : list3, (i & 16384) != 0 ? instrumentDetailViewState.aggregateOptionQuotes : map, (i & 32768) != 0 ? instrumentDetailViewState.position : position, (i & 65536) != 0 ? instrumentDetailViewState.investmentSchedules : list4, (i & 131072) != 0 ? instrumentDetailViewState.brokebackEarnings : uiEarnings, (i & 262144) != 0 ? instrumentDetailViewState.ipoQuote : ipoQuote, (i & 524288) != 0 ? instrumentDetailViewState.similarInstrumentIds : list5, (i & 1048576) != 0 ? instrumentDetailViewState.analystOverview : analystOverview, (i & 2097152) != 0 ? instrumentDetailViewState.relatedIndustryLists : list6, (i & 4194304) != 0 ? instrumentDetailViewState.unifiedAccount : unifiedAccountV2, (i & 8388608) != 0 ? instrumentDetailViewState.iacInfoBanners : list7, (i & 16777216) != 0 ? instrumentDetailViewState.isInstrumentRecurringTradable : z3, (i & 33554432) != 0 ? instrumentDetailViewState.stockDetail : uiStockDetail, (i & 67108864) != 0 ? instrumentDetailViewState.newsFeed : list8, (i & 134217728) != 0 ? instrumentDetailViewState.etpDetails : etpDetails, (i & 268435456) != 0 ? instrumentDetailViewState.educationTour : educationTour, (i & 536870912) != 0 ? instrumentDetailViewState.shareholderEntryPointResponse : shareholderEntryPointResponse, (i & 1073741824) != 0 ? instrumentDetailViewState.shareholderEventsSection : shareholderEventsSection, (i & Integer.MIN_VALUE) != 0 ? instrumentDetailViewState.isMarginInvestingEnabled : z4, (i2 & 1) != 0 ? instrumentDetailViewState.marginRequirements : marginRequirements, (i2 & 2) != 0 ? instrumentDetailViewState.isRecurringSupported : z5, (i2 & 4) != 0 ? instrumentDetailViewState.isCopilotSupported : bool, (i2 & 8) != 0 ? instrumentDetailViewState.locality : supported, (i2 & 16) != 0 ? instrumentDetailViewState.twentyFourHourMarketSurveyEvent : uiEvent3, (i2 & 32) != 0 ? instrumentDetailViewState.iacHeroCard : iacHeroCard, (i2 & 64) != 0 ? instrumentDetailViewState.sdpMode : sdpMode, (i2 & 128) != 0 ? instrumentDetailViewState.inMarginHubDiscoverabilityExperiment : z6, (i2 & 256) != 0 ? instrumentDetailViewState.instrumentChart : sduiInstrumentChart, (i2 & 512) != 0 ? instrumentDetailViewState.activeDisplaySpanId : str, (i2 & 1024) != 0 ? instrumentDetailViewState.tradingTrendsState : tradingTrendsChartSectionState3, (i2 & 2048) != 0 ? instrumentDetailViewState.companyFinancialsState : companyFinancialsSectionViewState, (i2 & 4096) != 0 ? instrumentDetailViewState.shortInterestState : shortInterestSectionViewState, (i2 & 8192) != 0 ? instrumentDetailViewState.inProfitAndLossAverageCostRetirement : z7, (i2 & 16384) != 0 ? instrumentDetailViewState.inPnlUpdates : z8, (i2 & 32768) != 0 ? instrumentDetailViewState.inSdpV2Experiment : z9, (i2 & 65536) != 0 ? instrumentDetailViewState.earningsSduiChartExperiment : z10, (i2 & 131072) != 0 ? instrumentDetailViewState.inGoldUngatingL2DataExperiment : z11, (i2 & 262144) != 0 ? instrumentDetailViewState.inEquityCefLabelsExperiment : z12, (i2 & 524288) != 0 ? instrumentDetailViewState.shouldShowOptionLevel3CardEntryPoint : z13, (i2 & 1048576) != 0 ? instrumentDetailViewState.shouldShowOptionsPortfolioRiskAnalyzer : z14, (i2 & 2097152) != 0 ? instrumentDetailViewState.inVenturesRegionGate : z15, (i2 & 4194304) != 0 ? instrumentDetailViewState.inReorderOptionsSectionOnSdpExperiment : z16, (i2 & 8388608) != 0 ? instrumentDetailViewState.marginRatioIndicatorVariant : variant);
    }

    /* renamed from: getServerDrivenChartIsEmpty$feature_equity_detail_externalDebug$annotations */
    public static /* synthetic */ void m1968xd6641589() {
    }

    public static /* synthetic */ void getShowOvernightVolumeStats$annotations() {
    }

    public final UiEvent<Boolean> component1() {
        return this.showIpoAccessOnboardingEvent;
    }

    /* renamed from: component2, reason: from getter */
    public final MarginSubscription getMarginSubscription() {
        return this.marginSubscription;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsShowingEducationTour() {
        return this.isShowingEducationTour;
    }

    public final UiEvent<Unit> component37() {
        return this.twentyFourHourMarketSurveyEvent;
    }

    /* renamed from: component38, reason: from getter */
    public final IacHeroCard getIacHeroCard() {
        return this.iacHeroCard;
    }

    /* renamed from: component39, reason: from getter */
    public final SdpMode getSdpMode() {
        return this.sdpMode;
    }

    public final UiEvent<UUID> component4() {
        return this.adtInfoSheetEvent;
    }

    /* renamed from: component40, reason: from getter */
    public final boolean getInMarginHubDiscoverabilityExperiment() {
        return this.inMarginHubDiscoverabilityExperiment;
    }

    /* renamed from: component43, reason: from getter */
    public final TradingTrendsChartSectionState3 getTradingTrendsState() {
        return this.tradingTrendsState;
    }

    /* renamed from: component44, reason: from getter */
    public final CompanyFinancialsSectionViewState getCompanyFinancialsState() {
        return this.companyFinancialsState;
    }

    /* renamed from: component45, reason: from getter */
    public final ShortInterestSectionViewState getShortInterestState() {
        return this.shortInterestState;
    }

    /* renamed from: component46, reason: from getter */
    public final boolean getInProfitAndLossAverageCostRetirement() {
        return this.inProfitAndLossAverageCostRetirement;
    }

    /* renamed from: component47, reason: from getter */
    public final boolean getInPnlUpdates() {
        return this.inPnlUpdates;
    }

    /* renamed from: component48, reason: from getter */
    public final boolean getInSdpV2Experiment() {
        return this.inSdpV2Experiment;
    }

    /* renamed from: component49, reason: from getter */
    public final boolean getEarningsSduiChartExperiment() {
        return this.earningsSduiChartExperiment;
    }

    /* renamed from: component5, reason: from getter */
    public final Account getAccount() {
        return this.account;
    }

    /* renamed from: component50, reason: from getter */
    public final boolean getInGoldUngatingL2DataExperiment() {
        return this.inGoldUngatingL2DataExperiment;
    }

    /* renamed from: component51, reason: from getter */
    public final boolean getInEquityCefLabelsExperiment() {
        return this.inEquityCefLabelsExperiment;
    }

    /* renamed from: component52, reason: from getter */
    public final boolean getShouldShowOptionLevel3CardEntryPoint() {
        return this.shouldShowOptionLevel3CardEntryPoint;
    }

    /* renamed from: component53, reason: from getter */
    public final boolean getShouldShowOptionsPortfolioRiskAnalyzer() {
        return this.shouldShowOptionsPortfolioRiskAnalyzer;
    }

    /* renamed from: component54, reason: from getter */
    public final boolean getInVenturesRegionGate() {
        return this.inVenturesRegionGate;
    }

    /* renamed from: component55, reason: from getter */
    public final boolean getInReorderOptionsSectionOnSdpExperiment() {
        return this.inReorderOptionsSectionOnSdpExperiment;
    }

    /* renamed from: component56, reason: from getter */
    public final MarginRatioIndicator.Variant getMarginRatioIndicatorVariant() {
        return this.marginRatioIndicatorVariant;
    }

    /* renamed from: component6$feature_equity_detail_externalDebug, reason: from getter */
    public final boolean getShowSlipSection() {
        return this.showSlipSection;
    }

    public final InstrumentDetailViewState copy(UiEvent<Boolean> showIpoAccessOnboardingEvent, MarginSubscription marginSubscription, boolean isShowingEducationTour, UiEvent<UUID> adtInfoSheetEvent, Account account, boolean showSlipSection, Instrument instrument, UnifiedBalances balances, Fundamental fundamental, InstrumentRatings ratings, List<Order> orders, OptionChainCollateral optionChainCollateral, List<UiOptionEvent> allOptionEvents, List<? extends UiAggregateOptionPosition> aggregateOptionPositions, Map<UUID, ? extends AggregateOptionQuote> aggregateOptionQuotes, Position position, List<InvestmentSchedule> investmentSchedules, UiEarnings brokebackEarnings, IpoQuote ipoQuote, List<UUID> similarInstrumentIds, AnalystOverview analystOverview, List<CuratedListChipItem> relatedIndustryLists, UnifiedAccountV2 unifiedAccount, List<IacInfoBanner> iacInfoBanners, boolean isInstrumentRecurringTradable, UiStockDetail stockDetail, List<NewsFeedElement> newsFeed, EtpDetails etpDetails, EducationTour educationTour, ShareholderEntryPointResponse shareholderEntryPointResponse, ShareholderEventsSection shareholderEventsSection, boolean isMarginInvestingEnabled, MarginRequirements marginRequirements, boolean isRecurringSupported, Boolean isCopilotSupported, CountryCode.Supported locality, UiEvent<Unit> twentyFourHourMarketSurveyEvent, IacHeroCard iacHeroCard, SdpMode sdpMode, boolean inMarginHubDiscoverabilityExperiment, SduiInstrumentChart instrumentChart, String activeDisplaySpanId, TradingTrendsChartSectionState3 tradingTrendsState, CompanyFinancialsSectionViewState companyFinancialsState, ShortInterestSectionViewState shortInterestState, boolean inProfitAndLossAverageCostRetirement, boolean inPnlUpdates, boolean inSdpV2Experiment, boolean earningsSduiChartExperiment, boolean inGoldUngatingL2DataExperiment, boolean inEquityCefLabelsExperiment, boolean shouldShowOptionLevel3CardEntryPoint, boolean shouldShowOptionsPortfolioRiskAnalyzer, boolean inVenturesRegionGate, boolean inReorderOptionsSectionOnSdpExperiment, MarginRatioIndicator.Variant marginRatioIndicatorVariant) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(investmentSchedules, "investmentSchedules");
        Intrinsics.checkNotNullParameter(similarInstrumentIds, "similarInstrumentIds");
        Intrinsics.checkNotNullParameter(iacInfoBanners, "iacInfoBanners");
        Intrinsics.checkNotNullParameter(sdpMode, "sdpMode");
        Intrinsics.checkNotNullParameter(tradingTrendsState, "tradingTrendsState");
        Intrinsics.checkNotNullParameter(companyFinancialsState, "companyFinancialsState");
        Intrinsics.checkNotNullParameter(shortInterestState, "shortInterestState");
        Intrinsics.checkNotNullParameter(marginRatioIndicatorVariant, "marginRatioIndicatorVariant");
        return new InstrumentDetailViewState(showIpoAccessOnboardingEvent, marginSubscription, isShowingEducationTour, adtInfoSheetEvent, account, showSlipSection, instrument, balances, fundamental, ratings, orders, optionChainCollateral, allOptionEvents, aggregateOptionPositions, aggregateOptionQuotes, position, investmentSchedules, brokebackEarnings, ipoQuote, similarInstrumentIds, analystOverview, relatedIndustryLists, unifiedAccount, iacInfoBanners, isInstrumentRecurringTradable, stockDetail, newsFeed, etpDetails, educationTour, shareholderEntryPointResponse, shareholderEventsSection, isMarginInvestingEnabled, marginRequirements, isRecurringSupported, isCopilotSupported, locality, twentyFourHourMarketSurveyEvent, iacHeroCard, sdpMode, inMarginHubDiscoverabilityExperiment, instrumentChart, activeDisplaySpanId, tradingTrendsState, companyFinancialsState, shortInterestState, inProfitAndLossAverageCostRetirement, inPnlUpdates, inSdpV2Experiment, earningsSduiChartExperiment, inGoldUngatingL2DataExperiment, inEquityCefLabelsExperiment, shouldShowOptionLevel3CardEntryPoint, shouldShowOptionsPortfolioRiskAnalyzer, inVenturesRegionGate, inReorderOptionsSectionOnSdpExperiment, marginRatioIndicatorVariant);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InstrumentDetailViewState)) {
            return false;
        }
        InstrumentDetailViewState instrumentDetailViewState = (InstrumentDetailViewState) other;
        return Intrinsics.areEqual(this.showIpoAccessOnboardingEvent, instrumentDetailViewState.showIpoAccessOnboardingEvent) && Intrinsics.areEqual(this.marginSubscription, instrumentDetailViewState.marginSubscription) && this.isShowingEducationTour == instrumentDetailViewState.isShowingEducationTour && Intrinsics.areEqual(this.adtInfoSheetEvent, instrumentDetailViewState.adtInfoSheetEvent) && Intrinsics.areEqual(this.account, instrumentDetailViewState.account) && this.showSlipSection == instrumentDetailViewState.showSlipSection && Intrinsics.areEqual(this.instrument, instrumentDetailViewState.instrument) && Intrinsics.areEqual(this.balances, instrumentDetailViewState.balances) && Intrinsics.areEqual(this.fundamental, instrumentDetailViewState.fundamental) && Intrinsics.areEqual(this.ratings, instrumentDetailViewState.ratings) && Intrinsics.areEqual(this.orders, instrumentDetailViewState.orders) && Intrinsics.areEqual(this.optionChainCollateral, instrumentDetailViewState.optionChainCollateral) && Intrinsics.areEqual(this.allOptionEvents, instrumentDetailViewState.allOptionEvents) && Intrinsics.areEqual(this.aggregateOptionPositions, instrumentDetailViewState.aggregateOptionPositions) && Intrinsics.areEqual(this.aggregateOptionQuotes, instrumentDetailViewState.aggregateOptionQuotes) && Intrinsics.areEqual(this.position, instrumentDetailViewState.position) && Intrinsics.areEqual(this.investmentSchedules, instrumentDetailViewState.investmentSchedules) && Intrinsics.areEqual(this.brokebackEarnings, instrumentDetailViewState.brokebackEarnings) && Intrinsics.areEqual(this.ipoQuote, instrumentDetailViewState.ipoQuote) && Intrinsics.areEqual(this.similarInstrumentIds, instrumentDetailViewState.similarInstrumentIds) && Intrinsics.areEqual(this.analystOverview, instrumentDetailViewState.analystOverview) && Intrinsics.areEqual(this.relatedIndustryLists, instrumentDetailViewState.relatedIndustryLists) && Intrinsics.areEqual(this.unifiedAccount, instrumentDetailViewState.unifiedAccount) && Intrinsics.areEqual(this.iacInfoBanners, instrumentDetailViewState.iacInfoBanners) && this.isInstrumentRecurringTradable == instrumentDetailViewState.isInstrumentRecurringTradable && Intrinsics.areEqual(this.stockDetail, instrumentDetailViewState.stockDetail) && Intrinsics.areEqual(this.newsFeed, instrumentDetailViewState.newsFeed) && Intrinsics.areEqual(this.etpDetails, instrumentDetailViewState.etpDetails) && Intrinsics.areEqual(this.educationTour, instrumentDetailViewState.educationTour) && Intrinsics.areEqual(this.shareholderEntryPointResponse, instrumentDetailViewState.shareholderEntryPointResponse) && Intrinsics.areEqual(this.shareholderEventsSection, instrumentDetailViewState.shareholderEventsSection) && this.isMarginInvestingEnabled == instrumentDetailViewState.isMarginInvestingEnabled && Intrinsics.areEqual(this.marginRequirements, instrumentDetailViewState.marginRequirements) && this.isRecurringSupported == instrumentDetailViewState.isRecurringSupported && Intrinsics.areEqual(this.isCopilotSupported, instrumentDetailViewState.isCopilotSupported) && Intrinsics.areEqual(this.locality, instrumentDetailViewState.locality) && Intrinsics.areEqual(this.twentyFourHourMarketSurveyEvent, instrumentDetailViewState.twentyFourHourMarketSurveyEvent) && Intrinsics.areEqual(this.iacHeroCard, instrumentDetailViewState.iacHeroCard) && Intrinsics.areEqual(this.sdpMode, instrumentDetailViewState.sdpMode) && this.inMarginHubDiscoverabilityExperiment == instrumentDetailViewState.inMarginHubDiscoverabilityExperiment && Intrinsics.areEqual(this.instrumentChart, instrumentDetailViewState.instrumentChart) && Intrinsics.areEqual(this.activeDisplaySpanId, instrumentDetailViewState.activeDisplaySpanId) && Intrinsics.areEqual(this.tradingTrendsState, instrumentDetailViewState.tradingTrendsState) && Intrinsics.areEqual(this.companyFinancialsState, instrumentDetailViewState.companyFinancialsState) && Intrinsics.areEqual(this.shortInterestState, instrumentDetailViewState.shortInterestState) && this.inProfitAndLossAverageCostRetirement == instrumentDetailViewState.inProfitAndLossAverageCostRetirement && this.inPnlUpdates == instrumentDetailViewState.inPnlUpdates && this.inSdpV2Experiment == instrumentDetailViewState.inSdpV2Experiment && this.earningsSduiChartExperiment == instrumentDetailViewState.earningsSduiChartExperiment && this.inGoldUngatingL2DataExperiment == instrumentDetailViewState.inGoldUngatingL2DataExperiment && this.inEquityCefLabelsExperiment == instrumentDetailViewState.inEquityCefLabelsExperiment && this.shouldShowOptionLevel3CardEntryPoint == instrumentDetailViewState.shouldShowOptionLevel3CardEntryPoint && this.shouldShowOptionsPortfolioRiskAnalyzer == instrumentDetailViewState.shouldShowOptionsPortfolioRiskAnalyzer && this.inVenturesRegionGate == instrumentDetailViewState.inVenturesRegionGate && this.inReorderOptionsSectionOnSdpExperiment == instrumentDetailViewState.inReorderOptionsSectionOnSdpExperiment && this.marginRatioIndicatorVariant == instrumentDetailViewState.marginRatioIndicatorVariant;
    }

    public int hashCode() {
        UiEvent<Boolean> uiEvent = this.showIpoAccessOnboardingEvent;
        int iHashCode = (uiEvent == null ? 0 : uiEvent.hashCode()) * 31;
        MarginSubscription marginSubscription = this.marginSubscription;
        int iHashCode2 = (((iHashCode + (marginSubscription == null ? 0 : marginSubscription.hashCode())) * 31) + Boolean.hashCode(this.isShowingEducationTour)) * 31;
        UiEvent<UUID> uiEvent2 = this.adtInfoSheetEvent;
        int iHashCode3 = (iHashCode2 + (uiEvent2 == null ? 0 : uiEvent2.hashCode())) * 31;
        Account account = this.account;
        int iHashCode4 = (((((iHashCode3 + (account == null ? 0 : account.hashCode())) * 31) + Boolean.hashCode(this.showSlipSection)) * 31) + this.instrument.hashCode()) * 31;
        UnifiedBalances unifiedBalances = this.balances;
        int iHashCode5 = (iHashCode4 + (unifiedBalances == null ? 0 : unifiedBalances.hashCode())) * 31;
        Fundamental fundamental = this.fundamental;
        int iHashCode6 = (iHashCode5 + (fundamental == null ? 0 : fundamental.hashCode())) * 31;
        InstrumentRatings instrumentRatings = this.ratings;
        int iHashCode7 = (iHashCode6 + (instrumentRatings == null ? 0 : instrumentRatings.hashCode())) * 31;
        List<Order> list = this.orders;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        OptionChainCollateral optionChainCollateral = this.optionChainCollateral;
        int iHashCode9 = (iHashCode8 + (optionChainCollateral == null ? 0 : optionChainCollateral.hashCode())) * 31;
        List<UiOptionEvent> list2 = this.allOptionEvents;
        int iHashCode10 = (iHashCode9 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<UiAggregateOptionPosition> list3 = this.aggregateOptionPositions;
        int iHashCode11 = (iHashCode10 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Map<UUID, AggregateOptionQuote> map = this.aggregateOptionQuotes;
        int iHashCode12 = (iHashCode11 + (map == null ? 0 : map.hashCode())) * 31;
        Position position = this.position;
        int iHashCode13 = (((iHashCode12 + (position == null ? 0 : position.hashCode())) * 31) + this.investmentSchedules.hashCode()) * 31;
        UiEarnings uiEarnings = this.brokebackEarnings;
        int iHashCode14 = (iHashCode13 + (uiEarnings == null ? 0 : uiEarnings.hashCode())) * 31;
        IpoQuote ipoQuote = this.ipoQuote;
        int iHashCode15 = (((iHashCode14 + (ipoQuote == null ? 0 : ipoQuote.hashCode())) * 31) + this.similarInstrumentIds.hashCode()) * 31;
        AnalystOverview analystOverview = this.analystOverview;
        int iHashCode16 = (iHashCode15 + (analystOverview == null ? 0 : analystOverview.hashCode())) * 31;
        List<CuratedListChipItem> list4 = this.relatedIndustryLists;
        int iHashCode17 = (iHashCode16 + (list4 == null ? 0 : list4.hashCode())) * 31;
        UnifiedAccountV2 unifiedAccountV2 = this.unifiedAccount;
        int iHashCode18 = (((((iHashCode17 + (unifiedAccountV2 == null ? 0 : unifiedAccountV2.hashCode())) * 31) + this.iacInfoBanners.hashCode()) * 31) + Boolean.hashCode(this.isInstrumentRecurringTradable)) * 31;
        UiStockDetail uiStockDetail = this.stockDetail;
        int iHashCode19 = (iHashCode18 + (uiStockDetail == null ? 0 : uiStockDetail.hashCode())) * 31;
        List<NewsFeedElement> list5 = this.newsFeed;
        int iHashCode20 = (iHashCode19 + (list5 == null ? 0 : list5.hashCode())) * 31;
        EtpDetails etpDetails = this.etpDetails;
        int iHashCode21 = (iHashCode20 + (etpDetails == null ? 0 : etpDetails.hashCode())) * 31;
        EducationTour educationTour = this.educationTour;
        int iHashCode22 = (iHashCode21 + (educationTour == null ? 0 : educationTour.hashCode())) * 31;
        ShareholderEntryPointResponse shareholderEntryPointResponse = this.shareholderEntryPointResponse;
        int iHashCode23 = (iHashCode22 + (shareholderEntryPointResponse == null ? 0 : shareholderEntryPointResponse.hashCode())) * 31;
        ShareholderEventsSection shareholderEventsSection = this.shareholderEventsSection;
        int iHashCode24 = (((iHashCode23 + (shareholderEventsSection == null ? 0 : shareholderEventsSection.hashCode())) * 31) + Boolean.hashCode(this.isMarginInvestingEnabled)) * 31;
        MarginRequirements marginRequirements = this.marginRequirements;
        int iHashCode25 = (((iHashCode24 + (marginRequirements == null ? 0 : marginRequirements.hashCode())) * 31) + Boolean.hashCode(this.isRecurringSupported)) * 31;
        Boolean bool = this.isCopilotSupported;
        int iHashCode26 = (iHashCode25 + (bool == null ? 0 : bool.hashCode())) * 31;
        CountryCode.Supported supported = this.locality;
        int iHashCode27 = (iHashCode26 + (supported == null ? 0 : supported.hashCode())) * 31;
        UiEvent<Unit> uiEvent3 = this.twentyFourHourMarketSurveyEvent;
        int iHashCode28 = (iHashCode27 + (uiEvent3 == null ? 0 : uiEvent3.hashCode())) * 31;
        IacHeroCard iacHeroCard = this.iacHeroCard;
        int iHashCode29 = (((((iHashCode28 + (iacHeroCard == null ? 0 : iacHeroCard.hashCode())) * 31) + this.sdpMode.hashCode()) * 31) + Boolean.hashCode(this.inMarginHubDiscoverabilityExperiment)) * 31;
        SduiInstrumentChart sduiInstrumentChart = this.instrumentChart;
        int iHashCode30 = (iHashCode29 + (sduiInstrumentChart == null ? 0 : sduiInstrumentChart.hashCode())) * 31;
        String str = this.activeDisplaySpanId;
        return ((((((((((((((((((((((((((((iHashCode30 + (str != null ? str.hashCode() : 0)) * 31) + this.tradingTrendsState.hashCode()) * 31) + this.companyFinancialsState.hashCode()) * 31) + this.shortInterestState.hashCode()) * 31) + Boolean.hashCode(this.inProfitAndLossAverageCostRetirement)) * 31) + Boolean.hashCode(this.inPnlUpdates)) * 31) + Boolean.hashCode(this.inSdpV2Experiment)) * 31) + Boolean.hashCode(this.earningsSduiChartExperiment)) * 31) + Boolean.hashCode(this.inGoldUngatingL2DataExperiment)) * 31) + Boolean.hashCode(this.inEquityCefLabelsExperiment)) * 31) + Boolean.hashCode(this.shouldShowOptionLevel3CardEntryPoint)) * 31) + Boolean.hashCode(this.shouldShowOptionsPortfolioRiskAnalyzer)) * 31) + Boolean.hashCode(this.inVenturesRegionGate)) * 31) + Boolean.hashCode(this.inReorderOptionsSectionOnSdpExperiment)) * 31) + this.marginRatioIndicatorVariant.hashCode();
    }

    public String toString() {
        return "InstrumentDetailViewState(showIpoAccessOnboardingEvent=" + this.showIpoAccessOnboardingEvent + ", marginSubscription=" + this.marginSubscription + ", isShowingEducationTour=" + this.isShowingEducationTour + ", adtInfoSheetEvent=" + this.adtInfoSheetEvent + ", account=" + this.account + ", showSlipSection=" + this.showSlipSection + ", instrument=" + this.instrument + ", balances=" + this.balances + ", fundamental=" + this.fundamental + ", ratings=" + this.ratings + ", orders=" + this.orders + ", optionChainCollateral=" + this.optionChainCollateral + ", allOptionEvents=" + this.allOptionEvents + ", aggregateOptionPositions=" + this.aggregateOptionPositions + ", aggregateOptionQuotes=" + this.aggregateOptionQuotes + ", position=" + this.position + ", investmentSchedules=" + this.investmentSchedules + ", brokebackEarnings=" + this.brokebackEarnings + ", ipoQuote=" + this.ipoQuote + ", similarInstrumentIds=" + this.similarInstrumentIds + ", analystOverview=" + this.analystOverview + ", relatedIndustryLists=" + this.relatedIndustryLists + ", unifiedAccount=" + this.unifiedAccount + ", iacInfoBanners=" + this.iacInfoBanners + ", isInstrumentRecurringTradable=" + this.isInstrumentRecurringTradable + ", stockDetail=" + this.stockDetail + ", newsFeed=" + this.newsFeed + ", etpDetails=" + this.etpDetails + ", educationTour=" + this.educationTour + ", shareholderEntryPointResponse=" + this.shareholderEntryPointResponse + ", shareholderEventsSection=" + this.shareholderEventsSection + ", isMarginInvestingEnabled=" + this.isMarginInvestingEnabled + ", marginRequirements=" + this.marginRequirements + ", isRecurringSupported=" + this.isRecurringSupported + ", isCopilotSupported=" + this.isCopilotSupported + ", locality=" + this.locality + ", twentyFourHourMarketSurveyEvent=" + this.twentyFourHourMarketSurveyEvent + ", iacHeroCard=" + this.iacHeroCard + ", sdpMode=" + this.sdpMode + ", inMarginHubDiscoverabilityExperiment=" + this.inMarginHubDiscoverabilityExperiment + ", instrumentChart=" + this.instrumentChart + ", activeDisplaySpanId=" + this.activeDisplaySpanId + ", tradingTrendsState=" + this.tradingTrendsState + ", companyFinancialsState=" + this.companyFinancialsState + ", shortInterestState=" + this.shortInterestState + ", inProfitAndLossAverageCostRetirement=" + this.inProfitAndLossAverageCostRetirement + ", inPnlUpdates=" + this.inPnlUpdates + ", inSdpV2Experiment=" + this.inSdpV2Experiment + ", earningsSduiChartExperiment=" + this.earningsSduiChartExperiment + ", inGoldUngatingL2DataExperiment=" + this.inGoldUngatingL2DataExperiment + ", inEquityCefLabelsExperiment=" + this.inEquityCefLabelsExperiment + ", shouldShowOptionLevel3CardEntryPoint=" + this.shouldShowOptionLevel3CardEntryPoint + ", shouldShowOptionsPortfolioRiskAnalyzer=" + this.shouldShowOptionsPortfolioRiskAnalyzer + ", inVenturesRegionGate=" + this.inVenturesRegionGate + ", inReorderOptionsSectionOnSdpExperiment=" + this.inReorderOptionsSectionOnSdpExperiment + ", marginRatioIndicatorVariant=" + this.marginRatioIndicatorVariant + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InstrumentDetailViewState(UiEvent<Boolean> uiEvent, MarginSubscription marginSubscription, boolean z, UiEvent<UUID> uiEvent2, Account account, boolean z2, Instrument instrument, UnifiedBalances unifiedBalances, Fundamental fundamental, InstrumentRatings instrumentRatings, List<Order> list, OptionChainCollateral optionChainCollateral, List<UiOptionEvent> list2, List<? extends UiAggregateOptionPosition> list3, Map<UUID, ? extends AggregateOptionQuote> map, Position position, List<InvestmentSchedule> investmentSchedules, UiEarnings uiEarnings, IpoQuote ipoQuote, List<UUID> similarInstrumentIds, AnalystOverview analystOverview, List<CuratedListChipItem> list4, UnifiedAccountV2 unifiedAccountV2, List<IacInfoBanner> iacInfoBanners, boolean z3, UiStockDetail uiStockDetail, List<NewsFeedElement> list5, EtpDetails etpDetails, EducationTour educationTour, ShareholderEntryPointResponse shareholderEntryPointResponse, ShareholderEventsSection shareholderEventsSection, boolean z4, MarginRequirements marginRequirements, boolean z5, Boolean bool, CountryCode.Supported supported, UiEvent<Unit> uiEvent3, IacHeroCard iacHeroCard, SdpMode sdpMode, boolean z6, SduiInstrumentChart sduiInstrumentChart, String str, TradingTrendsChartSectionState3 tradingTrendsState, CompanyFinancialsSectionViewState companyFinancialsState, ShortInterestSectionViewState shortInterestState, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, MarginRatioIndicator.Variant marginRatioIndicatorVariant) {
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z17;
        String id;
        DetailData detailData_init_$getControlStockDetailHeader;
        DetailData recurringData;
        Account account2;
        Account account3;
        List<TimelineRow> timeline;
        Position position2;
        Position position3;
        Account account4;
        Position position4;
        Account account5;
        String accountNumber;
        String accountNumber2;
        Position position5;
        String accountNumber3;
        String accountNumber4;
        StockDetailHeader header;
        List<ApiStockDetail.Section> hiddenSections;
        Sequence sequenceAsSequence;
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(investmentSchedules, "investmentSchedules");
        Intrinsics.checkNotNullParameter(similarInstrumentIds, "similarInstrumentIds");
        Intrinsics.checkNotNullParameter(iacInfoBanners, "iacInfoBanners");
        Intrinsics.checkNotNullParameter(sdpMode, "sdpMode");
        Intrinsics.checkNotNullParameter(tradingTrendsState, "tradingTrendsState");
        Intrinsics.checkNotNullParameter(companyFinancialsState, "companyFinancialsState");
        Intrinsics.checkNotNullParameter(shortInterestState, "shortInterestState");
        Intrinsics.checkNotNullParameter(marginRatioIndicatorVariant, "marginRatioIndicatorVariant");
        this.showIpoAccessOnboardingEvent = uiEvent;
        this.marginSubscription = marginSubscription;
        this.isShowingEducationTour = z;
        this.adtInfoSheetEvent = uiEvent2;
        this.account = account;
        this.showSlipSection = z2;
        this.instrument = instrument;
        this.balances = unifiedBalances;
        this.fundamental = fundamental;
        this.ratings = instrumentRatings;
        this.orders = list;
        this.optionChainCollateral = optionChainCollateral;
        this.allOptionEvents = list2;
        this.aggregateOptionPositions = list3;
        this.aggregateOptionQuotes = map;
        this.position = position;
        this.investmentSchedules = investmentSchedules;
        this.brokebackEarnings = uiEarnings;
        this.ipoQuote = ipoQuote;
        this.similarInstrumentIds = similarInstrumentIds;
        this.analystOverview = analystOverview;
        this.relatedIndustryLists = list4;
        this.unifiedAccount = unifiedAccountV2;
        this.iacInfoBanners = iacInfoBanners;
        this.isInstrumentRecurringTradable = z3;
        this.stockDetail = uiStockDetail;
        this.newsFeed = list5;
        this.etpDetails = etpDetails;
        this.educationTour = educationTour;
        this.shareholderEntryPointResponse = shareholderEntryPointResponse;
        this.shareholderEventsSection = shareholderEventsSection;
        this.isMarginInvestingEnabled = z4;
        this.marginRequirements = marginRequirements;
        this.isRecurringSupported = z5;
        this.isCopilotSupported = bool;
        this.locality = supported;
        this.twentyFourHourMarketSurveyEvent = uiEvent3;
        this.iacHeroCard = iacHeroCard;
        this.sdpMode = sdpMode;
        this.inMarginHubDiscoverabilityExperiment = z6;
        this.instrumentChart = sduiInstrumentChart;
        this.activeDisplaySpanId = str;
        this.tradingTrendsState = tradingTrendsState;
        this.companyFinancialsState = companyFinancialsState;
        this.shortInterestState = shortInterestState;
        this.inProfitAndLossAverageCostRetirement = z7;
        this.inPnlUpdates = z8;
        this.inSdpV2Experiment = z9;
        this.earningsSduiChartExperiment = z10;
        this.inGoldUngatingL2DataExperiment = z11;
        this.inEquityCefLabelsExperiment = z12;
        this.shouldShowOptionLevel3CardEntryPoint = z13;
        this.shouldShowOptionsPortfolioRiskAnalyzer = z14;
        this.inVenturesRegionGate = z15;
        this.inReorderOptionsSectionOnSdpExperiment = z16;
        this.marginRatioIndicatorVariant = marginRatioIndicatorVariant;
        UiStockDetail uiStockDetail2 = this.stockDetail;
        UiStockDetail.IpoAccess ipoAccess = uiStockDetail2 instanceof UiStockDetail.IpoAccess ? (UiStockDetail.IpoAccess) uiStockDetail2 : null;
        this.hiddenSectionDataTypes = SequencesKt.toSet((ipoAccess == null || (hiddenSections = ipoAccess.getHiddenSections()) == null || (sequenceAsSequence = CollectionsKt.asSequence(hiddenSections)) == null) ? SequencesKt.emptySequence() : sequenceAsSequence);
        List<Order> list6 = this.orders;
        if (list6 != null) {
            arrayList = new ArrayList();
            for (Object obj : list6) {
                if (((Order) obj).getIsPending()) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        this.pendingOrders = arrayList;
        List<NewsFeedElement> list7 = this.newsFeed;
        List<Content> instrumentNewsContent = list7 != null ? NewsFeedElements.toInstrumentNewsContent(list7) : null;
        this.newsFeedContent = instrumentNewsContent == null ? CollectionsKt.emptyList() : instrumentNewsContent;
        List<UiOptionEvent> list8 = this.allOptionEvents;
        if (list8 != null) {
            arrayList2 = new ArrayList();
            for (Object obj2 : list8) {
                if (((UiOptionEvent) obj2).isHeldForExercise()) {
                    arrayList2.add(obj2);
                }
            }
        } else {
            arrayList2 = null;
        }
        this.optionEventsHeldForExercise = arrayList2;
        SduiInstrumentChart sduiInstrumentChart2 = this.instrumentChart;
        Object[] objArr = {sduiInstrumentChart2, sduiInstrumentChart2 != null ? sduiInstrumentChart2.getDisplaySpan() : null};
        int i = 0;
        while (true) {
            if (i >= 2) {
                z17 = true;
                break;
            } else {
                if (objArr[i] == null) {
                    z17 = false;
                    break;
                }
                i++;
            }
        }
        this.isChartLoaded = z17;
        EducationTour educationTour2 = this.educationTour;
        if (educationTour2 == null || (id = educationTour2.getTrackingId()) == null) {
            EducationTour educationTour3 = this.educationTour;
            id = educationTour3 != null ? educationTour3.getId() : null;
        }
        this.educationTourTrackingId = id;
        EducationTour educationTour4 = this.educationTour;
        this.educationTourEntryPoint = educationTour4 != null ? educationTour4.getEntryPoint() : null;
        this.showOvernightVolumeStats = Instrument4.isAllDayTradable(this.instrument);
        ArrayList arrayList3 = new ArrayList();
        addWithHeaderData(arrayList3, AnchorViewData.INSTANCE);
        IacInfoBanner iacInfoBannerFindByLocation = IacInfoBanners.findByLocation(this.iacInfoBanners, IacInfoBannerLocation.INFO_BANNER_STOCK_DETAIL_PAGE_MOBILE_TOP_LEVEL);
        if (iacInfoBannerFindByLocation != null) {
            addWithHeaderData(arrayList3, new InfoBannerViewData(iacInfoBannerFindByLocation));
        }
        arrayList3.add(new EducationTourTickerSymbolData(this.instrument.getDisplaySymbol(), this.isShowingEducationTour));
        if (this.instrument.isIpoAccess()) {
            UiStockDetail uiStockDetail3 = this.stockDetail;
            detailData_init_$getControlStockDetailHeader = (!(uiStockDetail3 instanceof UiStockDetail.IpoAccess) || (header = ((UiStockDetail.IpoAccess) uiStockDetail3).getHeader()) == null) ? _init_$getControlStockDetailHeader(this) : (this.instrument.isRhvCef() || this.inEquityCefLabelsExperiment) ? new PreIpoHeaderDataV2(header) : new PreIpoHeaderData(header);
        } else {
            detailData_init_$getControlStockDetailHeader = _init_$getControlStockDetailHeader(this);
        }
        addWithHeaderData(arrayList3, detailData_init_$getControlStockDetailHeader);
        Account account6 = this.account;
        if (account6 != null && (accountNumber4 = account6.getAccountNumber()) != null) {
            Boolean bool2 = this.isCopilotSupported;
            if (bool2 != null) {
                arrayList3.add(bool2.booleanValue() ? new AssetDigestPreviewData(accountNumber4, this.instrument.getId()) : new BreakingNewsData(accountNumber4, this.instrument.getId()));
            }
            Unit unit = Unit.INSTANCE;
        }
        Account account7 = this.account;
        if (account7 != null && (accountNumber3 = account7.getAccountNumber()) != null) {
            arrayList3.add(new RecentPriceAlertTriggeredData(accountNumber3, this.instrument));
        }
        IacInfoBanner iacInfoBannerFindByLocation2 = IacInfoBanners.findByLocation(this.iacInfoBanners, IacInfoBannerLocation.INFO_BANNER_STOCK_DETAIL_PAGE_MOBILE_BELOW_CHART);
        if (iacInfoBannerFindByLocation2 != null) {
            addWithHeaderData(arrayList3, new InfoBannerViewData(iacInfoBannerFindByLocation2));
        }
        ShareholderEntryPointResponse shareholderEntryPointResponse2 = this.shareholderEntryPointResponse;
        if ((shareholderEntryPointResponse2 != null ? shareholderEntryPointResponse2.getResult() : null) != null) {
            arrayList3.add(new ShareholderQaEventViewData(this.shareholderEntryPointResponse));
        }
        injectIacHeroSdpCards(arrayList3);
        Account account8 = this.account;
        if ((account8 != null ? account8.getAccountNumber() : null) == null && (position5 = this.position) != null && Position5.getHasPosition(position5)) {
            CrashReporter.INSTANCE.reportNonFatal(new Exception("accountNumber is null but position has a position"), false, new EventMetadata(SentryTeam.EQUITIES, null, MapsKt.mapOf(Tuples4.m3642to("positionQuantity", this.position.getDisplayQuantity()), Tuples4.m3642to("instrumentId", this.instrument.getId()), Tuples4.m3642to("symbol", this.instrument.getSymbol())), 2, null));
        }
        Account account9 = this.account;
        if (account9 != null && (accountNumber2 = account9.getAccountNumber()) != null) {
            addWithHeaderData(arrayList3, new PositionViewData(accountNumber2, this.instrument.getId()));
            Unit unit2 = Unit.INSTANCE;
        }
        if (this.inReorderOptionsSectionOnSdpExperiment) {
            addOptionsSection(arrayList3);
        }
        if (this.inPnlUpdates && (account5 = this.account) != null && (accountNumber = account5.getAccountNumber()) != null) {
            addWithHeaderData(arrayList3, new ClosedPnlViewData(accountNumber, this.instrument));
            Unit unit3 = Unit.INSTANCE;
        }
        if (this.account != null && (position4 = this.position) != null && Position5.getHasPosition(position4) && this.marginRequirements != null && getShouldShowMarginRequirements()) {
            addWithHeaderData(arrayList3, new MarginDefinitionsViewData(this.account.getAccountNumber(), this.instrument.getDisplaySymbol(), this.marginRequirements.getFields(), this.inMarginHubDiscoverabilityExperiment, this.marginRequirements.isHighRisk(), this.marginRatioIndicatorVariant));
        }
        Account account10 = this.account;
        if (account10 != null) {
            arrayList3.add(new UpcomingActivityViewData(this.instrument.getId(), account10));
        }
        if (this.showSlipSection && (position3 = this.position) != null && Position5.getHasPosition(position3) && (account4 = this.account) != null && !account4.isManaged() && this.locality != null) {
            addWithHeaderData(arrayList3, new SlipData(this.account.getAccountNumber(), this.instrument.getDisplaySymbol(), this.locality.getIso3166CountryCode()));
        }
        Account account11 = this.account;
        if ((account11 == null || !account11.isManaged()) && (recurringData = getRecurringData()) != null) {
            addWithHeaderData(arrayList3, recurringData);
            Unit unit4 = Unit.INSTANCE;
        }
        Fundamental fundamental2 = this.fundamental;
        if ((fundamental2 != null && getHasDescription(fundamental2)) || this.instrument.isRhvCef()) {
            addWithHeaderData(arrayList3, new AboutV2ViewData(this.instrument));
        }
        if (this.account != null && (((position2 = this.position) == null || !Position5.getHasPosition(position2)) && this.marginRequirements != null && getShouldShowMarginRequirements())) {
            addWithHeaderData(arrayList3, new MarginDefinitionsViewData(this.account.getAccountNumber(), this.instrument.getDisplaySymbol(), this.marginRequirements.getFields(), this.inMarginHubDiscoverabilityExperiment, this.marginRequirements.isHighRisk(), this.marginRatioIndicatorVariant));
        }
        UiStockDetail uiStockDetail4 = this.stockDetail;
        UiStockDetail.IpoAccess ipoAccess2 = uiStockDetail4 instanceof UiStockDetail.IpoAccess ? (UiStockDetail.IpoAccess) uiStockDetail4 : null;
        StockDetailS1Section s1Section = ipoAccess2 != null ? ipoAccess2.getS1Section() : null;
        if (s1Section != null) {
            addWithHeaderData(arrayList3, new S1SectionViewData(ipoAccess2.getInstrumentId(), s1Section));
        }
        StockDetailMilestonesSection milestonesSection = ipoAccess2 != null ? ipoAccess2.getMilestonesSection() : null;
        if (milestonesSection != null && (timeline = milestonesSection.getTimeline()) != null && (!timeline.isEmpty())) {
            addWithHeaderData(arrayList3, new MilestonesViewData(milestonesSection.getTitle(), milestonesSection.getTimeline()));
        }
        if (this.etpDetails != null && getShouldShowEtpComposition()) {
            if (this.instrument.isRhvCef() || (this.isEtpCompositionV2Enabled && this.inSdpV2Experiment)) {
                arrayList3.add(new EtpCompositionV2Data(this.instrument.getId()));
            } else {
                addWithHeaderData(arrayList3, new EtpCompositionViewData(this.etpDetails));
                Unit unit5 = Unit.INSTANCE;
            }
        }
        if (!this.inReorderOptionsSectionOnSdpExperiment) {
            addOptionsSection(arrayList3);
        }
        addWithHeaderData(arrayList3, new StatsViewData(this.instrument));
        if (this.instrument.isRhvCef() && this.instrument.isIpoAccess()) {
            arrayList3.add(new EquityEventUpdatesViewData(this.instrument.getId()));
        }
        if (!this.newsFeedContent.isEmpty()) {
            addWithHeaderData(arrayList3, new NewsFeedViewData(this.instrument, this.newsFeedContent));
        }
        InstrumentRatings instrumentRatings2 = this.ratings;
        if (instrumentRatings2 != null && (instrumentRatings2.getSummary() != null || !this.ratings.getRatings().isEmpty())) {
            addWithHeaderData(arrayList3, new RatingsV2ViewData(this.ratings));
        }
        ShortInterestSectionViewState shortInterestSectionViewState = this.shortInterestState;
        if ((shortInterestSectionViewState instanceof ShortInterestSectionViewState.Ready) && ((ShortInterestSectionViewState.Ready) shortInterestSectionViewState).getVariant() == EquitiesSubzeroSiChart.Variant.MEMBER) {
            addShortInterest(arrayList3);
        }
        addTradingTrends(arrayList3);
        ShortInterestSectionViewState shortInterestSectionViewState2 = this.shortInterestState;
        if ((shortInterestSectionViewState2 instanceof ShortInterestSectionViewState.Ready) && ((ShortInterestSectionViewState.Ready) shortInterestSectionViewState2).getVariant() == EquitiesSubzeroSiChart.Variant.MEMBER2) {
            addShortInterest(arrayList3);
        }
        AnalystOverview analystOverview2 = this.analystOverview;
        if ((analystOverview2 != null ? analystOverview2.getReportTitle() : null) != null) {
            addWithHeaderData(arrayList3, new AnalystReportViewData(this.instrument, this.analystOverview));
        }
        StockDetailIpoResultsSection ipoResultsSection = ipoAccess2 != null ? ipoAccess2.getIpoResultsSection() : null;
        if (ipoResultsSection != null) {
            addWithHeaderData(arrayList3, new IpoResultsSectionViewData(ipoResultsSection));
        }
        addCompanyFinancials(arrayList3);
        UiEarnings uiEarnings2 = this.brokebackEarnings;
        if (uiEarnings2 != null && uiEarnings2.hasEarningsData()) {
            if (this.earningsSduiChartExperiment) {
                arrayList3.add(new EarningsV2ViewData(this.instrument.getId(), this.brokebackEarnings));
            } else {
                addWithHeaderData(arrayList3, new EarningsViewData.Brokeback(this.brokebackEarnings));
                Unit unit6 = Unit.INSTANCE;
            }
        }
        if (this.shareholderEventsSection != null) {
            arrayList3.add(new ShareholderQaEventsSectionViewData(this.shareholderEventsSection));
        }
        if (this.relatedIndustryLists != null && (!r12.isEmpty()) && ((account3 = this.account) == null || !account3.isManaged())) {
            addWithHeaderData(arrayList3, new RelatedIndustryViewData(this.relatedIndustryLists));
        }
        if (!this.similarInstrumentIds.isEmpty() && ((account2 = this.account) == null || !account2.isManaged())) {
            if (this.inSdpV2Experiment) {
                addWithHeaderData(arrayList3, new SimilarInstrumentsV2Data(this.instrument.getId()));
            } else {
                addWithHeaderData(arrayList3, new SimilarInstrumentsData(this.instrument, this.similarInstrumentIds));
            }
        }
        Account account12 = this.account;
        if (account12 != null) {
            arrayList3.add(new HistoryViewData(this.instrument.getId(), account12));
        }
        if (this.etpDetails != null) {
            addWithHeaderData(arrayList3, new PerformanceViewData(this.etpDetails));
        }
        if (this.inVenturesRegionGate) {
            arrayList3.add(new FaqData(this.instrument.getId()));
        }
        Account account13 = this.account;
        if ((account13 != null ? account13.getAccountNumber() : null) != null) {
            addWithHeaderData(arrayList3, new DisclosureData(this.instrument.getId(), this.account.getAccountNumber()));
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : arrayList3) {
            if (!CollectionsKt.contains(this.hiddenSectionDataTypes, ((DetailData) obj3).getSection())) {
                arrayList4.add(obj3);
            }
        }
        this.detailDataList = arrayList4;
    }

    public final UiEvent<Boolean> getShowIpoAccessOnboardingEvent() {
        return this.showIpoAccessOnboardingEvent;
    }

    public final MarginSubscription getMarginSubscription() {
        return this.marginSubscription;
    }

    public final boolean isShowingEducationTour() {
        return this.isShowingEducationTour;
    }

    public final UiEvent<UUID> getAdtInfoSheetEvent() {
        return this.adtInfoSheetEvent;
    }

    public final Account getAccount() {
        return this.account;
    }

    public final boolean getShowSlipSection$feature_equity_detail_externalDebug() {
        return this.showSlipSection;
    }

    public /* synthetic */ InstrumentDetailViewState(UiEvent uiEvent, MarginSubscription marginSubscription, boolean z, UiEvent uiEvent2, Account account, boolean z2, Instrument instrument, UnifiedBalances unifiedBalances, Fundamental fundamental, InstrumentRatings instrumentRatings, List list, OptionChainCollateral optionChainCollateral, List list2, List list3, Map map, Position position, List list4, UiEarnings uiEarnings, IpoQuote ipoQuote, List list5, AnalystOverview analystOverview, List list6, UnifiedAccountV2 unifiedAccountV2, List list7, boolean z3, UiStockDetail uiStockDetail, List list8, EtpDetails etpDetails, EducationTour educationTour, ShareholderEntryPointResponse shareholderEntryPointResponse, ShareholderEventsSection shareholderEventsSection, boolean z4, MarginRequirements marginRequirements, boolean z5, Boolean bool, CountryCode.Supported supported, UiEvent uiEvent3, IacHeroCard iacHeroCard, SdpMode sdpMode, boolean z6, SduiInstrumentChart sduiInstrumentChart, String str, TradingTrendsChartSectionState3 tradingTrendsChartSectionState3, CompanyFinancialsSectionViewState companyFinancialsSectionViewState, ShortInterestSectionViewState shortInterestSectionViewState, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, MarginRatioIndicator.Variant variant, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z17;
        boolean z18;
        TradingTrendsChartSectionState3 loading;
        UiEvent uiEvent4 = (i & 1) != 0 ? null : uiEvent;
        MarginSubscription marginSubscription2 = (i & 2) != 0 ? null : marginSubscription;
        boolean z19 = (i & 4) != 0 ? false : z;
        UiEvent uiEvent5 = (i & 8) != 0 ? null : uiEvent2;
        Account account2 = (i & 16) != 0 ? null : account;
        boolean z20 = (i & 32) != 0 ? false : z2;
        UnifiedBalances unifiedBalances2 = (i & 128) != 0 ? null : unifiedBalances;
        Fundamental fundamental2 = (i & 256) != 0 ? null : fundamental;
        InstrumentRatings instrumentRatings2 = (i & 512) != 0 ? null : instrumentRatings;
        List list9 = (i & 1024) != 0 ? null : list;
        OptionChainCollateral optionChainCollateral2 = (i & 2048) != 0 ? null : optionChainCollateral;
        List list10 = (i & 4096) != 0 ? null : list2;
        List list11 = (i & 8192) != 0 ? null : list3;
        Map map2 = (i & 16384) != 0 ? null : map;
        Position position2 = (i & 32768) != 0 ? null : position;
        List listEmptyList = (i & 65536) != 0 ? CollectionsKt.emptyList() : list4;
        UiEarnings uiEarnings2 = (i & 131072) != 0 ? null : uiEarnings;
        IpoQuote ipoQuote2 = (i & 262144) != 0 ? null : ipoQuote;
        List listEmptyList2 = (i & 524288) != 0 ? CollectionsKt.emptyList() : list5;
        AnalystOverview analystOverview2 = (i & 1048576) != 0 ? null : analystOverview;
        List list12 = (i & 2097152) != 0 ? null : list6;
        UnifiedAccountV2 unifiedAccountV22 = (i & 4194304) != 0 ? null : unifiedAccountV2;
        List listEmptyList3 = (i & 8388608) != 0 ? CollectionsKt.emptyList() : list7;
        boolean z21 = (i & 16777216) != 0 ? false : z3;
        UiStockDetail uiStockDetail2 = (i & 33554432) != 0 ? null : uiStockDetail;
        List list13 = (i & 67108864) != 0 ? null : list8;
        EtpDetails etpDetails2 = (i & 134217728) != 0 ? null : etpDetails;
        EducationTour educationTour2 = (i & 268435456) != 0 ? null : educationTour;
        ShareholderEntryPointResponse shareholderEntryPointResponse2 = (i & 536870912) != 0 ? null : shareholderEntryPointResponse;
        ShareholderEventsSection shareholderEventsSection2 = (i & 1073741824) != 0 ? null : shareholderEventsSection;
        boolean z22 = (i & Integer.MIN_VALUE) != 0 ? false : z4;
        MarginRequirements marginRequirements2 = (i2 & 1) != 0 ? null : marginRequirements;
        boolean z23 = (i2 & 2) != 0 ? false : z5;
        Boolean bool2 = (i2 & 4) != 0 ? null : bool;
        CountryCode.Supported supported2 = (i2 & 8) != 0 ? null : supported;
        UiEvent uiEvent6 = (i2 & 16) != 0 ? null : uiEvent3;
        IacHeroCard iacHeroCard2 = (i2 & 32) != 0 ? null : iacHeroCard;
        SdpMode sdpMode2 = (i2 & 64) != 0 ? SdpMode.Standard.INSTANCE : sdpMode;
        boolean z24 = (i2 & 128) != 0 ? false : z6;
        SduiInstrumentChart sduiInstrumentChart2 = (i2 & 256) != 0 ? null : sduiInstrumentChart;
        String serverValue = (i2 & 512) != 0 ? InstrumentChartSpansStore4.getDefaultSelectedSpan().getServerValue() : str;
        if ((i2 & 1024) != 0) {
            z17 = z22;
            z18 = false;
            loading = new TradingTrendsChartSectionState3.Loading(false);
        } else {
            z17 = z22;
            z18 = false;
            loading = tradingTrendsChartSectionState3;
        }
        this(uiEvent4, marginSubscription2, z19, uiEvent5, account2, z20, instrument, unifiedBalances2, fundamental2, instrumentRatings2, list9, optionChainCollateral2, list10, list11, map2, position2, listEmptyList, uiEarnings2, ipoQuote2, listEmptyList2, analystOverview2, list12, unifiedAccountV22, listEmptyList3, z21, uiStockDetail2, list13, etpDetails2, educationTour2, shareholderEntryPointResponse2, shareholderEventsSection2, z17, marginRequirements2, z23, bool2, supported2, uiEvent6, iacHeroCard2, sdpMode2, z24, sduiInstrumentChart2, serverValue, loading, (i2 & 2048) != 0 ? CompanyFinancialsSectionViewState.Disabled.INSTANCE : companyFinancialsSectionViewState, (i2 & 4096) != 0 ? ShortInterestSectionViewState.Disabled.INSTANCE : shortInterestSectionViewState, (i2 & 8192) != 0 ? z18 : z7, (i2 & 16384) != 0 ? z18 : z8, (i2 & 32768) != 0 ? z18 : z9, (i2 & 65536) != 0 ? z18 : z10, (i2 & 131072) != 0 ? z18 : z11, (i2 & 262144) != 0 ? z18 : z12, (i2 & 524288) != 0 ? z18 : z13, (i2 & 1048576) != 0 ? z18 : z14, (2097152 & i2) != 0 ? z18 : z15, (4194304 & i2) != 0 ? z18 : z16, (8388608 & i2) != 0 ? (MarginRatioIndicator.Variant) MarginRatioIndicator.Variant.INSTANCE.getDefault() : variant);
    }

    public final UiEvent<Unit> getTwentyFourHourMarketSurveyEvent() {
        return this.twentyFourHourMarketSurveyEvent;
    }

    public final IacHeroCard getIacHeroCard() {
        return this.iacHeroCard;
    }

    public final SdpMode getSdpMode() {
        return this.sdpMode;
    }

    public final boolean getInMarginHubDiscoverabilityExperiment() {
        return this.inMarginHubDiscoverabilityExperiment;
    }

    public final TradingTrendsChartSectionState3 getTradingTrendsState() {
        return this.tradingTrendsState;
    }

    public final CompanyFinancialsSectionViewState getCompanyFinancialsState() {
        return this.companyFinancialsState;
    }

    public final ShortInterestSectionViewState getShortInterestState() {
        return this.shortInterestState;
    }

    public final boolean getInProfitAndLossAverageCostRetirement() {
        return this.inProfitAndLossAverageCostRetirement;
    }

    public final boolean getInPnlUpdates() {
        return this.inPnlUpdates;
    }

    public final boolean getInSdpV2Experiment() {
        return this.inSdpV2Experiment;
    }

    public final boolean getEarningsSduiChartExperiment() {
        return this.earningsSduiChartExperiment;
    }

    public final boolean getInGoldUngatingL2DataExperiment() {
        return this.inGoldUngatingL2DataExperiment;
    }

    public final boolean getInEquityCefLabelsExperiment() {
        return this.inEquityCefLabelsExperiment;
    }

    public final boolean getShouldShowOptionLevel3CardEntryPoint() {
        return this.shouldShowOptionLevel3CardEntryPoint;
    }

    public final boolean getShouldShowOptionsPortfolioRiskAnalyzer() {
        return this.shouldShowOptionsPortfolioRiskAnalyzer;
    }

    public final boolean getInVenturesRegionGate() {
        return this.inVenturesRegionGate;
    }

    public final boolean getInReorderOptionsSectionOnSdpExperiment() {
        return this.inReorderOptionsSectionOnSdpExperiment;
    }

    public final MarginRatioIndicator.Variant getMarginRatioIndicatorVariant() {
        return this.marginRatioIndicatorVariant;
    }

    public final String getInstrumentPrice() {
        CursorData defaultDisplay;
        DisplayText primary_value;
        SduiInstrumentChart sduiInstrumentChart = this.instrumentChart;
        if (sduiInstrumentChart == null || (defaultDisplay = sduiInstrumentChart.getDefaultDisplay()) == null || (primary_value = defaultDisplay.getPrimary_value()) == null) {
            return null;
        }
        return primary_value.getValue();
    }

    public final DirectionOverlay getChartDirection() {
        Direction pageDirection;
        SduiInstrumentChart sduiInstrumentChart = this.instrumentChart;
        if (sduiInstrumentChart == null || (pageDirection = sduiInstrumentChart.getPageDirection()) == null) {
            return null;
        }
        return BentoExtensions.getOverlay(pageDirection);
    }

    /* compiled from: InstrumentDetailViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/InstrumentDetailViewState$SdpMode;", "", "Standard", "TradingTrendsDetails", "Lcom/robinhood/android/equitydetail/ui/InstrumentDetailViewState$SdpMode$Standard;", "Lcom/robinhood/android/equitydetail/ui/InstrumentDetailViewState$SdpMode$TradingTrendsDetails;", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface SdpMode {

        /* compiled from: InstrumentDetailViewState.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/InstrumentDetailViewState$SdpMode$Standard;", "Lcom/robinhood/android/equitydetail/ui/InstrumentDetailViewState$SdpMode;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Standard implements SdpMode {
            public static final int $stable = 0;
            public static final Standard INSTANCE = new Standard();

            public boolean equals(Object other) {
                return this == other || (other instanceof Standard);
            }

            public int hashCode() {
                return 461944153;
            }

            public String toString() {
                return "Standard";
            }

            private Standard() {
            }
        }

        /* compiled from: InstrumentDetailViewState.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/InstrumentDetailViewState$SdpMode$TradingTrendsDetails;", "Lcom/robinhood/android/equitydetail/ui/InstrumentDetailViewState$SdpMode;", "fragment", "Landroidx/fragment/app/Fragment;", "viewPagerInputEnabled", "", "<init>", "(Landroidx/fragment/app/Fragment;Z)V", "getFragment", "()Landroidx/fragment/app/Fragment;", "getViewPagerInputEnabled", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class TradingTrendsDetails implements SdpMode {
            public static final int $stable = 8;
            private final Fragment fragment;
            private final boolean viewPagerInputEnabled;

            public static /* synthetic */ TradingTrendsDetails copy$default(TradingTrendsDetails tradingTrendsDetails, Fragment fragment, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    fragment = tradingTrendsDetails.fragment;
                }
                if ((i & 2) != 0) {
                    z = tradingTrendsDetails.viewPagerInputEnabled;
                }
                return tradingTrendsDetails.copy(fragment, z);
            }

            /* renamed from: component1, reason: from getter */
            public final Fragment getFragment() {
                return this.fragment;
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getViewPagerInputEnabled() {
                return this.viewPagerInputEnabled;
            }

            public final TradingTrendsDetails copy(Fragment fragment, boolean viewPagerInputEnabled) {
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                return new TradingTrendsDetails(fragment, viewPagerInputEnabled);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TradingTrendsDetails)) {
                    return false;
                }
                TradingTrendsDetails tradingTrendsDetails = (TradingTrendsDetails) other;
                return Intrinsics.areEqual(this.fragment, tradingTrendsDetails.fragment) && this.viewPagerInputEnabled == tradingTrendsDetails.viewPagerInputEnabled;
            }

            public int hashCode() {
                return (this.fragment.hashCode() * 31) + Boolean.hashCode(this.viewPagerInputEnabled);
            }

            public String toString() {
                return "TradingTrendsDetails(fragment=" + this.fragment + ", viewPagerInputEnabled=" + this.viewPagerInputEnabled + ")";
            }

            public TradingTrendsDetails(Fragment fragment, boolean z) {
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                this.fragment = fragment;
                this.viewPagerInputEnabled = z;
            }

            public final Fragment getFragment() {
                return this.fragment;
            }

            public final boolean getViewPagerInputEnabled() {
                return this.viewPagerInputEnabled;
            }
        }
    }

    public final DisplaySpan getCurrentDisplaySpan() {
        return DisplaySpan.INSTANCE.fromServerValue(this.activeDisplaySpanId);
    }

    private final boolean getShouldShowEtpComposition() {
        EtpDetails etpDetails = this.etpDetails;
        if (etpDetails != null) {
            return (etpDetails.getHoldings().isEmpty() && this.etpDetails.getSectors().isEmpty()) ? false : true;
        }
        return false;
    }

    public final boolean getShouldShowMarginRequirements() {
        Account account;
        return (!this.isMarginInvestingEnabled || (account = this.account) == null || account.isManaged() || this.instrument.isPreIpo()) ? false : true;
    }

    public final boolean getServerDrivenChartIsEmpty$feature_equity_detail_externalDebug() {
        Chart<GenericAction> chart;
        SduiInstrumentChart sduiInstrumentChart = this.instrumentChart;
        return (sduiInstrumentChart == null || (chart = sduiInstrumentChart.getChart()) == null || ((!Intrinsics.areEqual(this.instrumentChart.getShowCandlesticks(), Boolean.TRUE) || !chart.getFills().isEmpty()) && !chart.getLines().isEmpty()) || !this.instrumentChart.getOverlays().isEmpty()) ? false : true;
    }

    public final boolean isConsideredLoaded() {
        Object[] objArr = {this.instrument, this.balances, this.orders};
        int i = 0;
        while (true) {
            if (i >= 3) {
                if (this.isChartLoaded) {
                    return true;
                }
            } else {
                if (objArr[i] == null) {
                    break;
                }
                i++;
            }
        }
        return false;
    }

    private final void addWithHeaderData(List<DetailData> list, DetailData detailData) {
        DetailData headerData = detailData.getHeaderData();
        if (headerData != null) {
            list.add(headerData);
        }
        list.add(detailData);
    }

    private final boolean getHasDescription(Fundamental fundamental) {
        String description = fundamental.getDescription();
        return description != null && description.length() > 0;
    }

    public final String getEducationTourTrackingId() {
        return this.educationTourTrackingId;
    }

    public final List<DetailData> getDetailDataList() {
        return this.detailDataList;
    }

    public final boolean getShowOvernightVolumeStats() {
        return this.showOvernightVolumeStats;
    }

    private final DetailData getRecurringData() {
        UnifiedAccountV2 unifiedAccountV2 = this.unifiedAccount;
        if (unifiedAccountV2 == null) {
            return null;
        }
        Account account = this.account;
        if ((account != null && account.isManaged()) || !this.isRecurringSupported) {
            return null;
        }
        if (!this.investmentSchedules.isEmpty()) {
            String accountNumber = unifiedAccountV2.getAccountNumber();
            Instrument instrument = this.instrument;
            List<InvestmentSchedule> list = this.investmentSchedules;
            List<Order> listEmptyList = this.pendingOrders;
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            return new RecurringInvestmentViewData(accountNumber, instrument, list, listEmptyList);
        }
        if (!this.isInstrumentRecurringTradable) {
            return null;
        }
        Position position = this.position;
        if (BigDecimals7.isPositive(position != null ? position.getDisplayQuantity() : null)) {
            return new RecurringInvestmentNuxData(this.instrument, unifiedAccountV2.getAccountNumber());
        }
        return null;
    }

    private static final DetailData _init_$getControlStockDetailHeader(InstrumentDetailViewState instrumentDetailViewState) {
        if (instrumentDetailViewState.ipoQuote == null) {
            Account account = instrumentDetailViewState.account;
            return new ServerDrivenChartData(account != null ? account.getAccountNumber() : null, instrumentDetailViewState.instrument);
        }
        return new IpoGraphLayoutData(instrumentDetailViewState.instrument, instrumentDetailViewState.ipoQuote);
    }

    private final void addTradingTrends(List<DetailData> detailDataList) {
        Account account = this.account;
        if ((account == null || !account.isManaged()) && (this.tradingTrendsState instanceof TradingTrendsChartSectionState3.Ready)) {
            detailDataList.add(new TradingTrendsViewData(((TradingTrendsChartSectionState3.Ready) this.tradingTrendsState).getInstrumentId(), this.tradingTrendsState));
        }
    }

    private final void addCompanyFinancials(List<DetailData> detailDataList) {
        if (this.companyFinancialsState instanceof CompanyFinancialsSectionViewState.Ready) {
            addWithHeaderData(detailDataList, new CompanyFinancialsViewData(((CompanyFinancialsSectionViewState.Ready) this.companyFinancialsState).getInstrumentId(), this.companyFinancialsState));
        }
    }

    private final void addShortInterest(List<DetailData> detailDataList) {
        if (this.shortInterestState instanceof ShortInterestSectionViewState.Ready) {
            addWithHeaderData(detailDataList, new ShortInterestViewData(((ShortInterestSectionViewState.Ready) this.shortInterestState).getInstrumentId(), this.shortInterestState));
        }
    }

    private final void addOptionsSection(List<DetailData> detailDataList) {
        Account account;
        String accountNumber;
        if (this.aggregateOptionPositions == null || !(!r0.isEmpty())) {
            return;
        }
        OptionChainCollateral optionChainCollateral = this.optionChainCollateral;
        List<UiAggregateOptionPosition> list = this.aggregateOptionPositions;
        Map<UUID, AggregateOptionQuote> map = this.aggregateOptionQuotes;
        List<UiOptionEvent> list2 = this.optionEventsHeldForExercise;
        BigDecimal bigDecimal = BigDecimal.ZERO;
        BigDecimal bigDecimalAdd = bigDecimal;
        for (Object obj : list) {
            Intrinsics.checkNotNull(bigDecimalAdd);
            bigDecimalAdd = bigDecimalAdd.add(((UiAggregateOptionPosition) obj).getAggregateOptionPosition().getDisplayQuantity());
            Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
        }
        Intrinsics.checkNotNull(bigDecimalAdd);
        Account account2 = this.account;
        addWithHeaderData(detailDataList, new OptionStrategyHeaderData(optionChainCollateral, list, map, list2, bigDecimalAdd, account2 != null ? account2.getBrokerageAccountType() : null, this.inProfitAndLossAverageCostRetirement));
        List<UiAggregateOptionPosition> list3 = this.aggregateOptionPositions;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
        Iterator<T> it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(((UiAggregateOptionPosition) it.next()).getAggregateOptionPosition().getId());
        }
        List<UiAggregateOptionPosition> list4 = this.aggregateOptionPositions;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
        for (UiAggregateOptionPosition uiAggregateOptionPosition : list4) {
            Account account3 = this.account;
            String accountNumber2 = account3 != null ? account3.getAccountNumber() : null;
            Map<UUID, AggregateOptionQuote> map2 = this.aggregateOptionQuotes;
            arrayList2.add(new OptionStrategyViewData(accountNumber2, uiAggregateOptionPosition, arrayList, map2 != null ? map2.get(uiAggregateOptionPosition.getAggregateOptionPosition().getId()) : null));
        }
        detailDataList.addAll(arrayList2);
        if (this.shouldShowOptionsPortfolioRiskAnalyzer && (account = this.account) != null && (accountNumber = account.getAccountNumber()) != null) {
            detailDataList.add(new OptionsPortfolioRiskAnalyzerEntryPointData(accountNumber, this.instrument.getId()));
        }
        if (this.shouldShowOptionLevel3CardEntryPoint) {
            Account account4 = this.account;
            detailDataList.add(new OptionEntryPoint(account4 != null ? account4.getAccountNumber() : null));
        }
    }

    private final EducationTourEntryPointData createEducationTourEntryPointDataIfPossible() {
        if (this.isShowingEducationTour || this.educationTourEntryPoint == null || this.educationTourTrackingId == null) {
            return null;
        }
        String message = this.educationTourEntryPoint.getMessage();
        if (message == null) {
            message = "";
        }
        String ctaText = this.educationTourEntryPoint.getCtaText();
        if (ctaText == null) {
            ctaText = "";
        }
        HttpUrl primaryImageUrl = this.educationTourEntryPoint.getPrimaryImageUrl();
        HttpUrl secondaryImageUrl = this.educationTourEntryPoint.getSecondaryImageUrl();
        String string2 = this.instrument.getId().toString();
        String str = this.educationTourTrackingId;
        EducationTour educationTour = this.educationTour;
        String analyticsId = educationTour != null ? educationTour.getAnalyticsId() : null;
        return new EducationTourEntryPointData(message, ctaText, primaryImageUrl, secondaryImageUrl, EducationTourScreenNames.STOCK_DETAIL_PAGE_SCREEN, string2, str, analyticsId == null ? "" : analyticsId);
    }

    public final void injectIacHeroSdpCards(List<DetailData> detailDataList) {
        EducationTourEntryPointData educationTourEntryPointDataCreateEducationTourEntryPointDataIfPossible;
        Intrinsics.checkNotNullParameter(detailDataList, "detailDataList");
        IacHeroCard iacHeroCard = this.iacHeroCard;
        if (iacHeroCard == null) {
            return;
        }
        Instrument instrument = this.instrument;
        Account account = this.account;
        if (account == null || !account.isManaged()) {
            if (iacHeroCard.isEducationTour()) {
                educationTourEntryPointDataCreateEducationTourEntryPointDataIfPossible = createEducationTourEntryPointDataIfPossible();
                if (educationTourEntryPointDataCreateEducationTourEntryPointDataIfPossible == null) {
                    return;
                }
            } else {
                educationTourEntryPointDataCreateEducationTourEntryPointDataIfPossible = null;
            }
            detailDataList.add(new IacHeroCardData(iacHeroCard, instrument.getId(), educationTourEntryPointDataCreateEducationTourEntryPointDataIfPossible));
        }
    }

    public final InstrumentDetailViewState reset(Account account) {
        return copy$default(this, null, null, false, null, account, false, null, null, null, null, null, null, null, null, null, null, CollectionsKt.emptyList(), null, null, null, null, null, null, CollectionsKt.emptyList(), false, null, null, null, null, null, null, false, null, false, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, null, 2134770511, 16252927, null);
    }
}
