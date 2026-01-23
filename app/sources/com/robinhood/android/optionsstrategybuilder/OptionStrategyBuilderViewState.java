package com.robinhood.android.optionsstrategybuilder;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.options.OptionDefaultPricingState;
import com.robinhood.android.common.options.extensions.Events2;
import com.robinhood.android.common.util.TransitionReason;
import com.robinhood.android.indexes.models.p159db.IndexValue;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.optionchain.C22987R;
import com.robinhood.android.optionchain.chainsettings.OptionChainCustomizationErrorEvent;
import com.robinhood.android.optionchain.extensions.UnderlyingQuoteModelUtil;
import com.robinhood.android.optionchain.tooltips.IndexOptionsTooltip;
import com.robinhood.android.options.aggregatequotes.ClientAggregateOptionStrategyQuote;
import com.robinhood.android.options.aggregatequotes.OptionQuoteAggregator;
import com.robinhood.android.options.contracts.OptionChainCustomizationLaunchMode;
import com.robinhood.android.options.contracts.OptionOrderIntentKey;
import com.robinhood.android.options.contracts.OptionStatisticsFragmentKey;
import com.robinhood.android.options.contracts.OptionStatisticsLaunchMode;
import com.robinhood.android.options.optionsstring.datetime.DateStrings2;
import com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderViewState;
import com.robinhood.android.optionsstrategybuilder.StrategyChainListAdapter2;
import com.robinhood.android.optionsstrategybuilder.calculator.FilterChoicesData;
import com.robinhood.android.optionsstrategybuilder.calculator.FilteredStrategiesListData;
import com.robinhood.android.optionsstrategybuilder.extensions.OptionStrategyChainTemplates;
import com.robinhood.android.optionsstrategybuilder.rows.OptionStrategyRowModel;
import com.robinhood.librobinhood.data.store.GetOptionInstrumentsParams;
import com.robinhood.librobinhood.data.store.OptionStrategyBuilderStore;
import com.robinhood.models.api.OptionStrategyType;
import com.robinhood.models.p320db.AggregateOptionPositionLeg;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p320db.OptionChainSelectedMetrics;
import com.robinhood.models.p320db.OptionCurrentOrNextMarketDates;
import com.robinhood.models.p320db.OptionInstrument;
import com.robinhood.models.p320db.OptionInstrumentQuote;
import com.robinhood.models.p320db.OptionSettings;
import com.robinhood.models.p320db.OptionStrategyChainTemplate;
import com.robinhood.models.p320db.OptionTooltip;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.p355ui.IacAlertSheet;
import com.robinhood.models.p355ui.OptionChainBundle;
import com.robinhood.models.p355ui.OptionChainDisplayMode;
import com.robinhood.models.p355ui.OptionConfigurationBundle;
import com.robinhood.models.p355ui.OptionLegBundle;
import com.robinhood.models.p355ui.OptionOrderBundle;
import com.robinhood.models.p355ui.OptionStatisticsTradableState;
import com.robinhood.models.p355ui.OptionUnderlyings;
import com.robinhood.models.p355ui.UiAggregateOptionPosition;
import com.robinhood.models.p355ui.UiOptionChain;
import com.robinhood.models.p355ui.UiOptionChains;
import com.robinhood.models.p355ui.UiOptionPositionCounts;
import com.robinhood.models.p355ui.UnderlyingQuote;
import com.robinhood.rosetta.eventlogging.OptionsContext;
import com.robinhood.shared.models.p387db.bonfire.education.tour.EducationTour;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.datetime.Instants;
import com.robinhood.utils.datetime.LocalDates4;
import com.robinhood.utils.datetime.format.LocalDateFormatter;
import com.robinhood.utils.extensions.Uuids;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.resource.StringResource;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.MapsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import p479j$.time.Instant;
import p479j$.time.LocalDate;
import p479j$.time.temporal.ChronoUnit;
import rosetta.option.OptionOrderFormSource;
import rosetta.option.StrategyName;

/* compiled from: OptionStrategyBuilderViewState.kt */
@Metadata(m3635d1 = {"\u0000\u008e\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b2\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b&\b\u0087\b\u0018\u00002\u00020\u0001:\nÀ\u0001Á\u0001Â\u0001Ã\u0001Ä\u0001BÇ\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u0013\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\u0014\b\u0002\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020 0\u0013\u0012\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"\u0012\u000e\b\u0002\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010+\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010/\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u000101\u0012\u0010\b\u0002\u00102\u001a\n\u0012\u0004\u0012\u000204\u0018\u000103\u0012\b\b\u0002\u00105\u001a\u00020\u0007¢\u0006\u0004\b6\u00107J\u0011\u0010\u0080\u0001\u001a\u00020\u00032\b\u0010\u0081\u0001\u001a\u00030\u0082\u0001J\u0012\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u00152\u0007\u0010\u0099\u0001\u001a\u00020\u0014J\n\u0010¢\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010£\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\n\u0010¤\u0001\u001a\u00020\u0007HÆ\u0003J\u0010\u0010¥\u0001\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\n\u0010¦\u0001\u001a\u00020\fHÆ\u0003J\n\u0010§\u0001\u001a\u00020\u000eHÆ\u0003J\n\u0010¨\u0001\u001a\u00020\u0010HÆ\u0003J\n\u0010©\u0001\u001a\u00020\u0003HÆ\u0003J\u0016\u0010ª\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013HÆ\u0003J\f\u0010«\u0001\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\f\u0010¬\u0001\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u0016\u0010\u00ad\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u0013HÆ\u0003J\f\u0010®\u0001\u001a\u0004\u0018\u00010\u001eHÆ\u0003J\u0016\u0010¯\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020 0\u0013HÆ\u0003J\u0010\u0010°\u0001\u001a\b\u0012\u0004\u0012\u00020#0\"HÆ\u0003J\u0010\u0010±\u0001\u001a\b\u0012\u0004\u0012\u00020#0\"HÆ\u0003J\f\u0010²\u0001\u001a\u0004\u0018\u00010&HÆ\u0003J\f\u0010³\u0001\u001a\u0004\u0018\u00010&HÆ\u0003J\f\u0010´\u0001\u001a\u0004\u0018\u00010)HÆ\u0003J\f\u0010µ\u0001\u001a\u0004\u0018\u00010+HÆ\u0003J\f\u0010¶\u0001\u001a\u0004\u0018\u00010-HÆ\u0003J\f\u0010·\u0001\u001a\u0004\u0018\u00010/HÆ\u0003J\f\u0010¸\u0001\u001a\u0004\u0018\u000101HÆ\u0003J\u0012\u0010¹\u0001\u001a\n\u0012\u0004\u0012\u000204\u0018\u000103HÆ\u0003J\n\u0010º\u0001\u001a\u00020\u0007HÆ\u0003JØ\u0002\u0010»\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00032\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u00132\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0014\b\u0002\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020 0\u00132\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"2\u000e\b\u0002\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010/2\n\b\u0002\u00100\u001a\u0004\u0018\u0001012\u0010\b\u0002\u00102\u001a\n\u0012\u0004\u0012\u000204\u0018\u0001032\b\b\u0002\u00105\u001a\u00020\u0007HÆ\u0001J\u0015\u0010¼\u0001\u001a\u00020\u00072\t\u0010½\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010¾\u0001\u001a\u00020xHÖ\u0001J\n\u0010¿\u0001\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bF\u00109R\u001d\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\bI\u0010JR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\bK\u0010LR\u001d\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u0013¢\u0006\b\n\u0000\u001a\u0004\bM\u0010HR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\b\n\u0000\u001a\u0004\bN\u0010OR\u001d\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020 0\u0013¢\u0006\b\n\u0000\u001a\u0004\bP\u0010HR\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010RR\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"¢\u0006\b\n\u0000\u001a\u0004\bS\u0010RR\u0013\u0010%\u001a\u0004\u0018\u00010&¢\u0006\b\n\u0000\u001a\u0004\bT\u0010UR\u0013\u0010'\u001a\u0004\u0018\u00010&¢\u0006\b\n\u0000\u001a\u0004\bV\u0010UR\u0013\u0010(\u001a\u0004\u0018\u00010)¢\u0006\b\n\u0000\u001a\u0004\bW\u0010XR\u0013\u0010*\u001a\u0004\u0018\u00010+¢\u0006\b\n\u0000\u001a\u0004\bY\u0010ZR\u0013\u0010,\u001a\u0004\u0018\u00010-¢\u0006\b\n\u0000\u001a\u0004\b[\u0010\\R\u0013\u0010.\u001a\u0004\u0018\u00010/¢\u0006\b\n\u0000\u001a\u0004\b]\u0010^R\u0013\u00100\u001a\u0004\u0018\u000101¢\u0006\b\n\u0000\u001a\u0004\b_\u0010`R\u0019\u00102\u001a\n\u0012\u0004\u0012\u000204\u0018\u000103¢\u0006\b\n\u0000\u001a\u0004\ba\u0010bR\u0011\u00105\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bc\u0010=R\u0011\u0010d\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\be\u00109R\u0011\u0010f\u001a\u00020g¢\u0006\b\n\u0000\u001a\u0004\bh\u0010iR\u0011\u0010j\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bk\u00109R\u0011\u0010l\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bm\u00109R\u0011\u0010n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bn\u0010=R\u0011\u0010o\u001a\u00020p¢\u0006\b\n\u0000\u001a\u0004\bq\u0010rR\u0013\u0010s\u001a\u0004\u0018\u00010t¢\u0006\b\n\u0000\u001a\u0004\bu\u0010vR\u0012\u0010w\u001a\u0004\u0018\u00010xX\u0082\u0004¢\u0006\u0004\n\u0002\u0010yR\u0014\u0010z\u001a\b\u0012\u0004\u0012\u00020{0\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010|\u001a\u00020}¢\u0006\b\n\u0000\u001a\u0004\b~\u0010\u007fR\u0016\u0010\u0083\u0001\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0000\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0017\u0010\u0086\u0001\u001a\u0005\u0018\u00010\u0087\u0001¢\u0006\n\n\u0000\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0017\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u008b\u0001¢\u0006\n\n\u0000\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0017\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u008b\u0001¢\u0006\n\n\u0000\u001a\u0006\b\u008f\u0001\u0010\u008d\u0001R\u0017\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u0091\u00018F¢\u0006\b\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0017\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0095\u0001¢\u0006\n\n\u0000\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001R\u001e\u0010\u009a\u0001\u001a\u0005\u0018\u00010\u009b\u0001*\u00020\u00148BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001R\u001f\u0010\u009e\u0001\u001a\u0005\u0018\u00010\u008b\u0001*\u00030\u009f\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b \u0001\u0010¡\u0001¨\u0006Å\u0001"}, m3636d2 = {"Lcom/robinhood/android/optionsstrategybuilder/OptionStrategyBuilderViewState;", "", "accountNumber", "", "iacAlertSheet", "Lcom/robinhood/models/ui/IacAlertSheet;", "inSideBySideChainNuxRevampExperiment", "", "uiOptionChains", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/ui/UiOptionChain;", "template", "Lcom/robinhood/models/db/OptionStrategyChainTemplate;", "filteredStrategiesListData", "Lcom/robinhood/android/optionsstrategybuilder/calculator/FilteredStrategiesListData;", "filterChoicesData", "Lcom/robinhood/android/optionsstrategybuilder/calculator/FilterChoicesData;", "strategyId", "overrideChoices", "", "Lcom/robinhood/models/db/OptionStrategyChainTemplate$FilterType;", "Lcom/robinhood/android/optionsstrategybuilder/OptionStrategyBuilderViewState$PreviousValue;", "equityQuote", "Lcom/robinhood/models/db/Quote;", "indexValue", "Lcom/robinhood/android/indexes/models/db/IndexValue;", "optionQuotes", "Ljava/util/UUID;", "Lcom/robinhood/models/db/OptionInstrumentQuote;", "educationTour", "Lcom/robinhood/shared/models/db/bonfire/education/tour/EducationTour;", "optionPositionCounts", "Lcom/robinhood/models/ui/UiOptionPositionCounts;", "matchingAggregateOptionPositions", "", "Lcom/robinhood/models/ui/UiAggregateOptionPosition;", "oppositeAggregateOptionPositions", "defaultPricingSettingOverride", "Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;", "defaultPricingSettingServerValue", "tradeOnExpirationSettings", "Lcom/robinhood/models/db/OptionSettings$TradingOnExpirationState;", "currentOrNextMarketDates", "Lcom/robinhood/models/db/OptionCurrentOrNextMarketDates;", "savedScrollTarget", "Lcom/robinhood/android/optionsstrategybuilder/OptionStrategyBuilderViewState$SavedScrollTarget;", "tooltip", "Lcom/robinhood/models/db/OptionTooltip;", "selectedMetrics", "Lcom/robinhood/models/db/OptionChainSelectedMetrics;", "chainCustomizationErrorEvent", "Lcom/robinhood/udf/UiEvent;", "Lcom/robinhood/android/optionchain/chainsettings/OptionChainCustomizationErrorEvent;", "shouldShowSettleOnOpenTooltip", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/ui/IacAlertSheet;ZLkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/models/db/OptionStrategyChainTemplate;Lcom/robinhood/android/optionsstrategybuilder/calculator/FilteredStrategiesListData;Lcom/robinhood/android/optionsstrategybuilder/calculator/FilterChoicesData;Ljava/lang/String;Ljava/util/Map;Lcom/robinhood/models/db/Quote;Lcom/robinhood/android/indexes/models/db/IndexValue;Ljava/util/Map;Lcom/robinhood/shared/models/db/bonfire/education/tour/EducationTour;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;Lcom/robinhood/models/db/OptionSettings$TradingOnExpirationState;Lcom/robinhood/models/db/OptionCurrentOrNextMarketDates;Lcom/robinhood/android/optionsstrategybuilder/OptionStrategyBuilderViewState$SavedScrollTarget;Lcom/robinhood/models/db/OptionTooltip;Lcom/robinhood/models/db/OptionChainSelectedMetrics;Lcom/robinhood/udf/UiEvent;Z)V", "getAccountNumber", "()Ljava/lang/String;", "getIacAlertSheet", "()Lcom/robinhood/models/ui/IacAlertSheet;", "getInSideBySideChainNuxRevampExperiment", "()Z", "getUiOptionChains", "()Lkotlinx/collections/immutable/ImmutableList;", "getTemplate", "()Lcom/robinhood/models/db/OptionStrategyChainTemplate;", "getFilteredStrategiesListData", "()Lcom/robinhood/android/optionsstrategybuilder/calculator/FilteredStrategiesListData;", "getFilterChoicesData", "()Lcom/robinhood/android/optionsstrategybuilder/calculator/FilterChoicesData;", "getStrategyId", "getOverrideChoices", "()Ljava/util/Map;", "getEquityQuote", "()Lcom/robinhood/models/db/Quote;", "getIndexValue", "()Lcom/robinhood/android/indexes/models/db/IndexValue;", "getOptionQuotes", "getEducationTour", "()Lcom/robinhood/shared/models/db/bonfire/education/tour/EducationTour;", "getOptionPositionCounts", "getMatchingAggregateOptionPositions", "()Ljava/util/List;", "getOppositeAggregateOptionPositions", "getDefaultPricingSettingOverride", "()Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;", "getDefaultPricingSettingServerValue", "getTradeOnExpirationSettings", "()Lcom/robinhood/models/db/OptionSettings$TradingOnExpirationState;", "getCurrentOrNextMarketDates", "()Lcom/robinhood/models/db/OptionCurrentOrNextMarketDates;", "getSavedScrollTarget", "()Lcom/robinhood/android/optionsstrategybuilder/OptionStrategyBuilderViewState$SavedScrollTarget;", "getTooltip", "()Lcom/robinhood/models/db/OptionTooltip;", "getSelectedMetrics", "()Lcom/robinhood/models/db/OptionChainSelectedMetrics;", "getChainCustomizationErrorEvent", "()Lcom/robinhood/udf/UiEvent;", "getShouldShowSettleOnOpenTooltip", "optionChainIdsForLogging", "getOptionChainIdsForLogging", "firstOptionChainForPerformanceLogging", "Lcom/robinhood/models/db/OptionChain;", "getFirstOptionChainForPerformanceLogging", "()Lcom/robinhood/models/db/OptionChain;", "toolbarTitle", "getToolbarTitle", "toolbarSubtitle", "getToolbarSubtitle", "isExpiringToday", "defaultPricingState", "Lcom/robinhood/android/common/options/OptionDefaultPricingState;", "getDefaultPricingState", "()Lcom/robinhood/android/common/options/OptionDefaultPricingState;", "underlyingQuote", "Lcom/robinhood/models/ui/UnderlyingQuote;", "getUnderlyingQuote", "()Lcom/robinhood/models/ui/UnderlyingQuote;", "quotePosition", "", "Ljava/lang/Integer;", "rows", "Lcom/robinhood/android/optionsstrategybuilder/StrategyChain;", "strategyChainAdapterState", "Lcom/robinhood/android/optionsstrategybuilder/OptionStrategyBuilderViewState$StrategyChainAdapterState;", "getStrategyChainAdapterState", "()Lcom/robinhood/android/optionsstrategybuilder/OptionStrategyBuilderViewState$StrategyChainAdapterState;", "getUnderlyingQuoteIndicatorText", "resources", "Landroid/content/res/Resources;", "selectedUiOptionChain", "getSelectedUiOptionChain", "()Lcom/robinhood/models/ui/UiOptionChain;", "optionInstrumentsQueryParams", "Lcom/robinhood/librobinhood/data/store/GetOptionInstrumentsParams;", "getOptionInstrumentsQueryParams", "()Lcom/robinhood/librobinhood/data/store/GetOptionInstrumentsParams;", "firstLegStreamingArgs", "Lcom/robinhood/librobinhood/data/store/OptionStrategyBuilderStore$LegStreamingArgs;", "getFirstLegStreamingArgs", "()Lcom/robinhood/librobinhood/data/store/OptionStrategyBuilderStore$LegStreamingArgs;", "secondLegStreamingArgs", "getSecondLegStreamingArgs", "chainCustomizationFragmentKey", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "getChainCustomizationFragmentKey", "()Lcom/robinhood/android/navigation/keys/FragmentKey;", "indexOptionsTooltip", "Lcom/robinhood/android/optionchain/tooltips/IndexOptionsTooltip$SettleOnOpenTooltip;", "getIndexOptionsTooltip", "()Lcom/robinhood/android/optionchain/tooltips/IndexOptionsTooltip$SettleOnOpenTooltip;", "getOverrideValue", "filterType", "currentChoice", "Lcom/robinhood/android/optionsstrategybuilder/OptionStrategyBuilderViewState$Choice;", "getCurrentChoice", "(Lcom/robinhood/models/db/OptionStrategyChainTemplate$FilterType;)Lcom/robinhood/android/optionsstrategybuilder/OptionStrategyBuilderViewState$Choice;", "asLegArgs", "Lcom/robinhood/models/db/OptionStrategyChainTemplate$OptionLegTemplate;", "getAsLegArgs", "(Lcom/robinhood/models/db/OptionStrategyChainTemplate$OptionLegTemplate;)Lcom/robinhood/librobinhood/data/store/OptionStrategyBuilderStore$LegStreamingArgs;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "copy", "equals", "other", "hashCode", "toString", "StrategyChainAdapterState", "PreviousValue", "Choice", "SavedScrollTarget", "Strategy", "feature-options-strategy-builder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final /* data */ class OptionStrategyBuilderViewState {
    public static final int $stable = 8;
    private final String accountNumber;
    private final UiEvent<OptionChainCustomizationErrorEvent> chainCustomizationErrorEvent;
    private final OptionCurrentOrNextMarketDates currentOrNextMarketDates;
    private final OptionSettings.DefaultPricingSetting defaultPricingSettingOverride;
    private final OptionSettings.DefaultPricingSetting defaultPricingSettingServerValue;
    private final OptionDefaultPricingState defaultPricingState;
    private final EducationTour educationTour;
    private final Quote equityQuote;
    private final FilterChoicesData filterChoicesData;
    private final FilteredStrategiesListData filteredStrategiesListData;
    private final OptionStrategyBuilderStore.LegStreamingArgs firstLegStreamingArgs;
    private final OptionChain firstOptionChainForPerformanceLogging;
    private final IacAlertSheet iacAlertSheet;
    private final boolean inSideBySideChainNuxRevampExperiment;
    private final IndexOptionsTooltip.SettleOnOpenTooltip indexOptionsTooltip;
    private final IndexValue indexValue;
    private final boolean isExpiringToday;
    private final List<UiAggregateOptionPosition> matchingAggregateOptionPositions;
    private final List<UiAggregateOptionPosition> oppositeAggregateOptionPositions;
    private final String optionChainIdsForLogging;
    private final GetOptionInstrumentsParams optionInstrumentsQueryParams;
    private final Map<UUID, UiOptionPositionCounts> optionPositionCounts;
    private final Map<UUID, OptionInstrumentQuote> optionQuotes;
    private final Map<OptionStrategyChainTemplate.FilterType, PreviousValue> overrideChoices;
    private final Integer quotePosition;
    private final List<StrategyChainListAdapter2> rows;
    private final SavedScrollTarget savedScrollTarget;
    private final OptionStrategyBuilderStore.LegStreamingArgs secondLegStreamingArgs;
    private final OptionChainSelectedMetrics selectedMetrics;
    private final UiOptionChain selectedUiOptionChain;
    private final boolean shouldShowSettleOnOpenTooltip;
    private final StrategyChainAdapterState strategyChainAdapterState;
    private final String strategyId;
    private final OptionStrategyChainTemplate template;
    private final String toolbarSubtitle;
    private final String toolbarTitle;
    private final OptionTooltip tooltip;
    private final OptionSettings.TradingOnExpirationState tradeOnExpirationSettings;
    private final ImmutableList<UiOptionChain> uiOptionChains;
    private final UnderlyingQuote underlyingQuote;

    /* compiled from: OptionStrategyBuilderViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OptionStrategyChainTemplate.SortOrder.values().length];
            try {
                iArr[OptionStrategyChainTemplate.SortOrder.ASCENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionStrategyChainTemplate.SortOrder.DESCENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ OptionStrategyBuilderViewState copy$default(OptionStrategyBuilderViewState optionStrategyBuilderViewState, String str, IacAlertSheet iacAlertSheet, boolean z, ImmutableList immutableList, OptionStrategyChainTemplate optionStrategyChainTemplate, FilteredStrategiesListData filteredStrategiesListData, FilterChoicesData filterChoicesData, String str2, Map map, Quote quote, IndexValue indexValue, Map map2, EducationTour educationTour, Map map3, List list, List list2, OptionSettings.DefaultPricingSetting defaultPricingSetting, OptionSettings.DefaultPricingSetting defaultPricingSetting2, OptionSettings.TradingOnExpirationState tradingOnExpirationState, OptionCurrentOrNextMarketDates optionCurrentOrNextMarketDates, SavedScrollTarget savedScrollTarget, OptionTooltip optionTooltip, OptionChainSelectedMetrics optionChainSelectedMetrics, UiEvent uiEvent, boolean z2, int i, Object obj) {
        boolean z3;
        UiEvent uiEvent2;
        String str3 = (i & 1) != 0 ? optionStrategyBuilderViewState.accountNumber : str;
        IacAlertSheet iacAlertSheet2 = (i & 2) != 0 ? optionStrategyBuilderViewState.iacAlertSheet : iacAlertSheet;
        boolean z4 = (i & 4) != 0 ? optionStrategyBuilderViewState.inSideBySideChainNuxRevampExperiment : z;
        ImmutableList immutableList2 = (i & 8) != 0 ? optionStrategyBuilderViewState.uiOptionChains : immutableList;
        OptionStrategyChainTemplate optionStrategyChainTemplate2 = (i & 16) != 0 ? optionStrategyBuilderViewState.template : optionStrategyChainTemplate;
        FilteredStrategiesListData filteredStrategiesListData2 = (i & 32) != 0 ? optionStrategyBuilderViewState.filteredStrategiesListData : filteredStrategiesListData;
        FilterChoicesData filterChoicesData2 = (i & 64) != 0 ? optionStrategyBuilderViewState.filterChoicesData : filterChoicesData;
        String str4 = (i & 128) != 0 ? optionStrategyBuilderViewState.strategyId : str2;
        Map map4 = (i & 256) != 0 ? optionStrategyBuilderViewState.overrideChoices : map;
        Quote quote2 = (i & 512) != 0 ? optionStrategyBuilderViewState.equityQuote : quote;
        IndexValue indexValue2 = (i & 1024) != 0 ? optionStrategyBuilderViewState.indexValue : indexValue;
        Map map5 = (i & 2048) != 0 ? optionStrategyBuilderViewState.optionQuotes : map2;
        EducationTour educationTour2 = (i & 4096) != 0 ? optionStrategyBuilderViewState.educationTour : educationTour;
        Map map6 = (i & 8192) != 0 ? optionStrategyBuilderViewState.optionPositionCounts : map3;
        String str5 = str3;
        List list3 = (i & 16384) != 0 ? optionStrategyBuilderViewState.matchingAggregateOptionPositions : list;
        List list4 = (i & 32768) != 0 ? optionStrategyBuilderViewState.oppositeAggregateOptionPositions : list2;
        OptionSettings.DefaultPricingSetting defaultPricingSetting3 = (i & 65536) != 0 ? optionStrategyBuilderViewState.defaultPricingSettingOverride : defaultPricingSetting;
        OptionSettings.DefaultPricingSetting defaultPricingSetting4 = (i & 131072) != 0 ? optionStrategyBuilderViewState.defaultPricingSettingServerValue : defaultPricingSetting2;
        OptionSettings.TradingOnExpirationState tradingOnExpirationState2 = (i & 262144) != 0 ? optionStrategyBuilderViewState.tradeOnExpirationSettings : tradingOnExpirationState;
        OptionCurrentOrNextMarketDates optionCurrentOrNextMarketDates2 = (i & 524288) != 0 ? optionStrategyBuilderViewState.currentOrNextMarketDates : optionCurrentOrNextMarketDates;
        SavedScrollTarget savedScrollTarget2 = (i & 1048576) != 0 ? optionStrategyBuilderViewState.savedScrollTarget : savedScrollTarget;
        OptionTooltip optionTooltip2 = (i & 2097152) != 0 ? optionStrategyBuilderViewState.tooltip : optionTooltip;
        OptionChainSelectedMetrics optionChainSelectedMetrics2 = (i & 4194304) != 0 ? optionStrategyBuilderViewState.selectedMetrics : optionChainSelectedMetrics;
        UiEvent uiEvent3 = (i & 8388608) != 0 ? optionStrategyBuilderViewState.chainCustomizationErrorEvent : uiEvent;
        if ((i & 16777216) != 0) {
            uiEvent2 = uiEvent3;
            z3 = optionStrategyBuilderViewState.shouldShowSettleOnOpenTooltip;
        } else {
            z3 = z2;
            uiEvent2 = uiEvent3;
        }
        return optionStrategyBuilderViewState.copy(str5, iacAlertSheet2, z4, immutableList2, optionStrategyChainTemplate2, filteredStrategiesListData2, filterChoicesData2, str4, map4, quote2, indexValue2, map5, educationTour2, map6, list3, list4, defaultPricingSetting3, defaultPricingSetting4, tradingOnExpirationState2, optionCurrentOrNextMarketDates2, savedScrollTarget2, optionTooltip2, optionChainSelectedMetrics2, uiEvent2, z3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component10, reason: from getter */
    public final Quote getEquityQuote() {
        return this.equityQuote;
    }

    /* renamed from: component11, reason: from getter */
    public final IndexValue getIndexValue() {
        return this.indexValue;
    }

    public final Map<UUID, OptionInstrumentQuote> component12() {
        return this.optionQuotes;
    }

    /* renamed from: component13, reason: from getter */
    public final EducationTour getEducationTour() {
        return this.educationTour;
    }

    public final Map<UUID, UiOptionPositionCounts> component14() {
        return this.optionPositionCounts;
    }

    public final List<UiAggregateOptionPosition> component15() {
        return this.matchingAggregateOptionPositions;
    }

    public final List<UiAggregateOptionPosition> component16() {
        return this.oppositeAggregateOptionPositions;
    }

    /* renamed from: component17, reason: from getter */
    public final OptionSettings.DefaultPricingSetting getDefaultPricingSettingOverride() {
        return this.defaultPricingSettingOverride;
    }

    /* renamed from: component18, reason: from getter */
    public final OptionSettings.DefaultPricingSetting getDefaultPricingSettingServerValue() {
        return this.defaultPricingSettingServerValue;
    }

    /* renamed from: component19, reason: from getter */
    public final OptionSettings.TradingOnExpirationState getTradeOnExpirationSettings() {
        return this.tradeOnExpirationSettings;
    }

    /* renamed from: component2, reason: from getter */
    public final IacAlertSheet getIacAlertSheet() {
        return this.iacAlertSheet;
    }

    /* renamed from: component20, reason: from getter */
    public final OptionCurrentOrNextMarketDates getCurrentOrNextMarketDates() {
        return this.currentOrNextMarketDates;
    }

    /* renamed from: component21, reason: from getter */
    public final SavedScrollTarget getSavedScrollTarget() {
        return this.savedScrollTarget;
    }

    /* renamed from: component22, reason: from getter */
    public final OptionTooltip getTooltip() {
        return this.tooltip;
    }

    /* renamed from: component23, reason: from getter */
    public final OptionChainSelectedMetrics getSelectedMetrics() {
        return this.selectedMetrics;
    }

    public final UiEvent<OptionChainCustomizationErrorEvent> component24() {
        return this.chainCustomizationErrorEvent;
    }

    /* renamed from: component25, reason: from getter */
    public final boolean getShouldShowSettleOnOpenTooltip() {
        return this.shouldShowSettleOnOpenTooltip;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getInSideBySideChainNuxRevampExperiment() {
        return this.inSideBySideChainNuxRevampExperiment;
    }

    public final ImmutableList<UiOptionChain> component4() {
        return this.uiOptionChains;
    }

    /* renamed from: component5, reason: from getter */
    public final OptionStrategyChainTemplate getTemplate() {
        return this.template;
    }

    /* renamed from: component6, reason: from getter */
    public final FilteredStrategiesListData getFilteredStrategiesListData() {
        return this.filteredStrategiesListData;
    }

    /* renamed from: component7, reason: from getter */
    public final FilterChoicesData getFilterChoicesData() {
        return this.filterChoicesData;
    }

    /* renamed from: component8, reason: from getter */
    public final String getStrategyId() {
        return this.strategyId;
    }

    public final Map<OptionStrategyChainTemplate.FilterType, PreviousValue> component9() {
        return this.overrideChoices;
    }

    public final OptionStrategyBuilderViewState copy(String accountNumber, IacAlertSheet iacAlertSheet, boolean inSideBySideChainNuxRevampExperiment, ImmutableList<UiOptionChain> uiOptionChains, OptionStrategyChainTemplate template, FilteredStrategiesListData filteredStrategiesListData, FilterChoicesData filterChoicesData, String strategyId, Map<OptionStrategyChainTemplate.FilterType, PreviousValue> overrideChoices, Quote equityQuote, IndexValue indexValue, Map<UUID, OptionInstrumentQuote> optionQuotes, EducationTour educationTour, Map<UUID, UiOptionPositionCounts> optionPositionCounts, List<? extends UiAggregateOptionPosition> matchingAggregateOptionPositions, List<? extends UiAggregateOptionPosition> oppositeAggregateOptionPositions, OptionSettings.DefaultPricingSetting defaultPricingSettingOverride, OptionSettings.DefaultPricingSetting defaultPricingSettingServerValue, OptionSettings.TradingOnExpirationState tradeOnExpirationSettings, OptionCurrentOrNextMarketDates currentOrNextMarketDates, SavedScrollTarget savedScrollTarget, OptionTooltip tooltip, OptionChainSelectedMetrics selectedMetrics, UiEvent<OptionChainCustomizationErrorEvent> chainCustomizationErrorEvent, boolean shouldShowSettleOnOpenTooltip) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(uiOptionChains, "uiOptionChains");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(filteredStrategiesListData, "filteredStrategiesListData");
        Intrinsics.checkNotNullParameter(filterChoicesData, "filterChoicesData");
        Intrinsics.checkNotNullParameter(strategyId, "strategyId");
        Intrinsics.checkNotNullParameter(overrideChoices, "overrideChoices");
        Intrinsics.checkNotNullParameter(optionQuotes, "optionQuotes");
        Intrinsics.checkNotNullParameter(optionPositionCounts, "optionPositionCounts");
        Intrinsics.checkNotNullParameter(matchingAggregateOptionPositions, "matchingAggregateOptionPositions");
        Intrinsics.checkNotNullParameter(oppositeAggregateOptionPositions, "oppositeAggregateOptionPositions");
        return new OptionStrategyBuilderViewState(accountNumber, iacAlertSheet, inSideBySideChainNuxRevampExperiment, uiOptionChains, template, filteredStrategiesListData, filterChoicesData, strategyId, overrideChoices, equityQuote, indexValue, optionQuotes, educationTour, optionPositionCounts, matchingAggregateOptionPositions, oppositeAggregateOptionPositions, defaultPricingSettingOverride, defaultPricingSettingServerValue, tradeOnExpirationSettings, currentOrNextMarketDates, savedScrollTarget, tooltip, selectedMetrics, chainCustomizationErrorEvent, shouldShowSettleOnOpenTooltip);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionStrategyBuilderViewState)) {
            return false;
        }
        OptionStrategyBuilderViewState optionStrategyBuilderViewState = (OptionStrategyBuilderViewState) other;
        return Intrinsics.areEqual(this.accountNumber, optionStrategyBuilderViewState.accountNumber) && Intrinsics.areEqual(this.iacAlertSheet, optionStrategyBuilderViewState.iacAlertSheet) && this.inSideBySideChainNuxRevampExperiment == optionStrategyBuilderViewState.inSideBySideChainNuxRevampExperiment && Intrinsics.areEqual(this.uiOptionChains, optionStrategyBuilderViewState.uiOptionChains) && Intrinsics.areEqual(this.template, optionStrategyBuilderViewState.template) && Intrinsics.areEqual(this.filteredStrategiesListData, optionStrategyBuilderViewState.filteredStrategiesListData) && Intrinsics.areEqual(this.filterChoicesData, optionStrategyBuilderViewState.filterChoicesData) && Intrinsics.areEqual(this.strategyId, optionStrategyBuilderViewState.strategyId) && Intrinsics.areEqual(this.overrideChoices, optionStrategyBuilderViewState.overrideChoices) && Intrinsics.areEqual(this.equityQuote, optionStrategyBuilderViewState.equityQuote) && Intrinsics.areEqual(this.indexValue, optionStrategyBuilderViewState.indexValue) && Intrinsics.areEqual(this.optionQuotes, optionStrategyBuilderViewState.optionQuotes) && Intrinsics.areEqual(this.educationTour, optionStrategyBuilderViewState.educationTour) && Intrinsics.areEqual(this.optionPositionCounts, optionStrategyBuilderViewState.optionPositionCounts) && Intrinsics.areEqual(this.matchingAggregateOptionPositions, optionStrategyBuilderViewState.matchingAggregateOptionPositions) && Intrinsics.areEqual(this.oppositeAggregateOptionPositions, optionStrategyBuilderViewState.oppositeAggregateOptionPositions) && this.defaultPricingSettingOverride == optionStrategyBuilderViewState.defaultPricingSettingOverride && this.defaultPricingSettingServerValue == optionStrategyBuilderViewState.defaultPricingSettingServerValue && this.tradeOnExpirationSettings == optionStrategyBuilderViewState.tradeOnExpirationSettings && Intrinsics.areEqual(this.currentOrNextMarketDates, optionStrategyBuilderViewState.currentOrNextMarketDates) && Intrinsics.areEqual(this.savedScrollTarget, optionStrategyBuilderViewState.savedScrollTarget) && Intrinsics.areEqual(this.tooltip, optionStrategyBuilderViewState.tooltip) && Intrinsics.areEqual(this.selectedMetrics, optionStrategyBuilderViewState.selectedMetrics) && Intrinsics.areEqual(this.chainCustomizationErrorEvent, optionStrategyBuilderViewState.chainCustomizationErrorEvent) && this.shouldShowSettleOnOpenTooltip == optionStrategyBuilderViewState.shouldShowSettleOnOpenTooltip;
    }

    public int hashCode() {
        int iHashCode = this.accountNumber.hashCode() * 31;
        IacAlertSheet iacAlertSheet = this.iacAlertSheet;
        int iHashCode2 = (((((((((((((((iHashCode + (iacAlertSheet == null ? 0 : iacAlertSheet.hashCode())) * 31) + Boolean.hashCode(this.inSideBySideChainNuxRevampExperiment)) * 31) + this.uiOptionChains.hashCode()) * 31) + this.template.hashCode()) * 31) + this.filteredStrategiesListData.hashCode()) * 31) + this.filterChoicesData.hashCode()) * 31) + this.strategyId.hashCode()) * 31) + this.overrideChoices.hashCode()) * 31;
        Quote quote = this.equityQuote;
        int iHashCode3 = (iHashCode2 + (quote == null ? 0 : quote.hashCode())) * 31;
        IndexValue indexValue = this.indexValue;
        int iHashCode4 = (((iHashCode3 + (indexValue == null ? 0 : indexValue.hashCode())) * 31) + this.optionQuotes.hashCode()) * 31;
        EducationTour educationTour = this.educationTour;
        int iHashCode5 = (((((((iHashCode4 + (educationTour == null ? 0 : educationTour.hashCode())) * 31) + this.optionPositionCounts.hashCode()) * 31) + this.matchingAggregateOptionPositions.hashCode()) * 31) + this.oppositeAggregateOptionPositions.hashCode()) * 31;
        OptionSettings.DefaultPricingSetting defaultPricingSetting = this.defaultPricingSettingOverride;
        int iHashCode6 = (iHashCode5 + (defaultPricingSetting == null ? 0 : defaultPricingSetting.hashCode())) * 31;
        OptionSettings.DefaultPricingSetting defaultPricingSetting2 = this.defaultPricingSettingServerValue;
        int iHashCode7 = (iHashCode6 + (defaultPricingSetting2 == null ? 0 : defaultPricingSetting2.hashCode())) * 31;
        OptionSettings.TradingOnExpirationState tradingOnExpirationState = this.tradeOnExpirationSettings;
        int iHashCode8 = (iHashCode7 + (tradingOnExpirationState == null ? 0 : tradingOnExpirationState.hashCode())) * 31;
        OptionCurrentOrNextMarketDates optionCurrentOrNextMarketDates = this.currentOrNextMarketDates;
        int iHashCode9 = (iHashCode8 + (optionCurrentOrNextMarketDates == null ? 0 : optionCurrentOrNextMarketDates.hashCode())) * 31;
        SavedScrollTarget savedScrollTarget = this.savedScrollTarget;
        int iHashCode10 = (iHashCode9 + (savedScrollTarget == null ? 0 : savedScrollTarget.hashCode())) * 31;
        OptionTooltip optionTooltip = this.tooltip;
        int iHashCode11 = (iHashCode10 + (optionTooltip == null ? 0 : optionTooltip.hashCode())) * 31;
        OptionChainSelectedMetrics optionChainSelectedMetrics = this.selectedMetrics;
        int iHashCode12 = (iHashCode11 + (optionChainSelectedMetrics == null ? 0 : optionChainSelectedMetrics.hashCode())) * 31;
        UiEvent<OptionChainCustomizationErrorEvent> uiEvent = this.chainCustomizationErrorEvent;
        return ((iHashCode12 + (uiEvent != null ? uiEvent.hashCode() : 0)) * 31) + Boolean.hashCode(this.shouldShowSettleOnOpenTooltip);
    }

    public String toString() {
        return "OptionStrategyBuilderViewState(accountNumber=" + this.accountNumber + ", iacAlertSheet=" + this.iacAlertSheet + ", inSideBySideChainNuxRevampExperiment=" + this.inSideBySideChainNuxRevampExperiment + ", uiOptionChains=" + this.uiOptionChains + ", template=" + this.template + ", filteredStrategiesListData=" + this.filteredStrategiesListData + ", filterChoicesData=" + this.filterChoicesData + ", strategyId=" + this.strategyId + ", overrideChoices=" + this.overrideChoices + ", equityQuote=" + this.equityQuote + ", indexValue=" + this.indexValue + ", optionQuotes=" + this.optionQuotes + ", educationTour=" + this.educationTour + ", optionPositionCounts=" + this.optionPositionCounts + ", matchingAggregateOptionPositions=" + this.matchingAggregateOptionPositions + ", oppositeAggregateOptionPositions=" + this.oppositeAggregateOptionPositions + ", defaultPricingSettingOverride=" + this.defaultPricingSettingOverride + ", defaultPricingSettingServerValue=" + this.defaultPricingSettingServerValue + ", tradeOnExpirationSettings=" + this.tradeOnExpirationSettings + ", currentOrNextMarketDates=" + this.currentOrNextMarketDates + ", savedScrollTarget=" + this.savedScrollTarget + ", tooltip=" + this.tooltip + ", selectedMetrics=" + this.selectedMetrics + ", chainCustomizationErrorEvent=" + this.chainCustomizationErrorEvent + ", shouldShowSettleOnOpenTooltip=" + this.shouldShowSettleOnOpenTooltip + ")";
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x02a9, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00e3  */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [com.robinhood.android.options.aggregatequotes.ClientAggregateOptionStrategyQuote] */
    /* JADX WARN: Type inference failed for: r32v0, types: [java.lang.Object, java.util.List<? extends com.robinhood.models.ui.UiAggregateOptionPosition>, java.util.List<com.robinhood.models.ui.UiAggregateOptionPosition>] */
    /* JADX WARN: Type inference failed for: r33v0, types: [java.lang.Object, java.util.List<? extends com.robinhood.models.ui.UiAggregateOptionPosition>, java.util.List<com.robinhood.models.ui.UiAggregateOptionPosition>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public OptionStrategyBuilderViewState(String accountNumber, IacAlertSheet iacAlertSheet, boolean z, ImmutableList<UiOptionChain> uiOptionChains, OptionStrategyChainTemplate template, FilteredStrategiesListData filteredStrategiesListData, FilterChoicesData filterChoicesData, String strategyId, Map<OptionStrategyChainTemplate.FilterType, PreviousValue> overrideChoices, Quote quote, IndexValue indexValue, Map<UUID, OptionInstrumentQuote> optionQuotes, EducationTour educationTour, Map<UUID, UiOptionPositionCounts> optionPositionCounts, List<? extends UiAggregateOptionPosition> matchingAggregateOptionPositions, List<? extends UiAggregateOptionPosition> oppositeAggregateOptionPositions, OptionSettings.DefaultPricingSetting defaultPricingSetting, OptionSettings.DefaultPricingSetting defaultPricingSetting2, OptionSettings.TradingOnExpirationState tradingOnExpirationState, OptionCurrentOrNextMarketDates optionCurrentOrNextMarketDates, SavedScrollTarget savedScrollTarget, OptionTooltip optionTooltip, OptionChainSelectedMetrics optionChainSelectedMetrics, UiEvent<OptionChainCustomizationErrorEvent> uiEvent, boolean z2) {
        boolean z3;
        OptionChain optionChain;
        UUID id;
        GetOptionInstrumentsParams getOptionInstrumentsParams;
        IndexOptionsTooltip.SettleOnOpenTooltip settleOnOpenTooltip;
        boolean z4;
        OptionChain optionChain2;
        String serverValue;
        LocalDate localDate$default;
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(uiOptionChains, "uiOptionChains");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(filteredStrategiesListData, "filteredStrategiesListData");
        Intrinsics.checkNotNullParameter(filterChoicesData, "filterChoicesData");
        Intrinsics.checkNotNullParameter(strategyId, "strategyId");
        Intrinsics.checkNotNullParameter(overrideChoices, "overrideChoices");
        Intrinsics.checkNotNullParameter(optionQuotes, "optionQuotes");
        Intrinsics.checkNotNullParameter(optionPositionCounts, "optionPositionCounts");
        Intrinsics.checkNotNullParameter(matchingAggregateOptionPositions, "matchingAggregateOptionPositions");
        Intrinsics.checkNotNullParameter(oppositeAggregateOptionPositions, "oppositeAggregateOptionPositions");
        this.accountNumber = accountNumber;
        this.iacAlertSheet = iacAlertSheet;
        this.inSideBySideChainNuxRevampExperiment = z;
        this.uiOptionChains = uiOptionChains;
        this.template = template;
        this.filteredStrategiesListData = filteredStrategiesListData;
        this.filterChoicesData = filterChoicesData;
        this.strategyId = strategyId;
        this.overrideChoices = overrideChoices;
        this.equityQuote = quote;
        this.indexValue = indexValue;
        this.optionQuotes = optionQuotes;
        this.educationTour = educationTour;
        this.optionPositionCounts = optionPositionCounts;
        this.matchingAggregateOptionPositions = matchingAggregateOptionPositions;
        this.oppositeAggregateOptionPositions = oppositeAggregateOptionPositions;
        this.defaultPricingSettingOverride = defaultPricingSetting;
        this.defaultPricingSettingServerValue = defaultPricingSetting2;
        this.tradeOnExpirationSettings = tradingOnExpirationState;
        this.currentOrNextMarketDates = optionCurrentOrNextMarketDates;
        this.savedScrollTarget = savedScrollTarget;
        this.tooltip = optionTooltip;
        this.selectedMetrics = optionChainSelectedMetrics;
        this.chainCustomizationErrorEvent = uiEvent;
        this.shouldShowSettleOnOpenTooltip = z2;
        this.optionChainIdsForLogging = UiOptionChains.getOptionChainIdsForLogging(uiOptionChains);
        this.firstOptionChainForPerformanceLogging = ((UiOptionChain) CollectionsKt.first((List) uiOptionChains)).getOptionChain();
        this.toolbarTitle = UiOptionChains.getOptionChainSymbolsDisplay(uiOptionChains);
        this.toolbarSubtitle = template.getSubtitle();
        Instant selloutTime = filterChoicesData.getSelloutTime();
        int i = 1;
        Strategy.Leg leg = null;
        if (selloutTime == null || (localDate$default = Instants.toLocalDate$default(selloutTime, null, 1, null)) == null) {
            z3 = false;
        } else {
            LocalDate localDateNow = LocalDate.now();
            Intrinsics.checkNotNullExpressionValue(localDateNow, "now(...)");
            if (localDate$default.until(localDateNow, ChronoUnit.DAYS) == 0) {
                z3 = true;
            }
        }
        this.isExpiringToday = z3;
        this.defaultPricingState = OptionDefaultPricingState.INSTANCE.from(defaultPricingSetting2, defaultPricingSetting, OptionStrategyChainTemplates.isMultiLeg(template));
        this.underlyingQuote = UnderlyingQuote.INSTANCE.getUnderlyingQuote(quote, indexValue);
        ArrayList arrayList = new ArrayList();
        Iterator it = filteredStrategiesListData.getFilteredStrategies().iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            Object next = it.next();
            int i4 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Strategy strategy = (Strategy) next;
            OptionStrategyChainTemplate.ValidConfiguration configuration = this.filteredStrategiesListData.getConfiguration();
            Strategy.Leg leg2 = configuration != null ? (Strategy.Leg) CollectionsKt.getOrNull(strategy.getLegs(), configuration.getLegIndexForEquityRow()) : leg;
            if (this.underlyingQuote != null && leg2 != null && i3 < 0) {
                BigDecimal strikePrice = leg2.getOptionInstrument().getStrikePrice();
                BigDecimal currentValue = this.underlyingQuote.getCurrentValue();
                int i5 = WhenMappings.$EnumSwitchMapping$0[leg2.getOptionLegTemplate().getStrikeSortOrder().ordinal()];
                if (i5 != i ? i5 != 2 ? false : BigDecimals7.lte(strikePrice, currentValue) : BigDecimals7.gte(strikePrice, currentValue)) {
                    arrayList.add(new StrategyChainListAdapter2.UnderlyingQuoteData(this.underlyingQuote));
                    i3 = i2;
                }
            }
            String displayName = strategy.getDisplayName();
            OptionSettings.DefaultPricingSetting overallDefaultPricingType = this.defaultPricingState.getOverallDefaultPricingType();
            List<OptionQuoteAggregator.LegContext> legContexts = strategy.getLegContexts(this.optionQuotes);
            arrayList.add(new StrategyChainListAdapter2.StrategyData(new OptionStrategyRowModel(overallDefaultPricingType, this.tradeOnExpirationSettings, this.currentOrNextMarketDates, displayName, strategy, legContexts != null ? new ClientAggregateOptionStrategyQuote(legContexts, this.template.getIntendedDirection()) : leg, this.optionPositionCounts, this.matchingAggregateOptionPositions, this.oppositeAggregateOptionPositions, this.template.getDataRowContent(), this.selectedMetrics, OptionStrategyType.INSTANCE.fromServerValue(this.strategyId), this.underlyingQuote)));
            it = it;
            i2 = i4;
            i = 1;
            leg = null;
        }
        if (!arrayList.isEmpty()) {
            if (!this.filteredStrategiesListData.getFilteredStrategies().isEmpty() && this.underlyingQuote != null && i3 < 0) {
                arrayList.add(new StrategyChainListAdapter2.UnderlyingQuoteData(this.underlyingQuote));
            }
            arrayList.add(StrategyChainListAdapter2.Disclosure.INSTANCE);
        }
        Integer numValueOf = Integer.valueOf(i3);
        numValueOf = numValueOf.intValue() == -1 ? null : numValueOf;
        this.quotePosition = numValueOf;
        this.rows = arrayList;
        this.strategyChainAdapterState = new StrategyChainAdapterState(arrayList, numValueOf, numValueOf, this.selectedMetrics);
        Choice choice = this.filteredStrategiesListData.getSelectedChoices().get(OptionStrategyChainTemplate.FilterType.NEAR_DATE);
        Choice.DateChoice dateChoice = choice instanceof Choice.DateChoice ? (Choice.DateChoice) choice : null;
        this.selectedUiOptionChain = dateChoice != null ? dateChoice.getUiOptionChain() : null;
        List<OptionStrategyChainTemplate.OptionInstrumentQueryParams.DynamicParam> dynamicParams = this.template.getOptionInstrumentQuery().getDynamicParams();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(dynamicParams, 10));
        Iterator it2 = dynamicParams.iterator();
        loop1: while (true) {
            if (it2.hasNext()) {
                OptionStrategyChainTemplate.OptionInstrumentQueryParams.DynamicParam dynamicParam = (OptionStrategyChainTemplate.OptionInstrumentQueryParams.DynamicParam) it2.next();
                String strComponent1 = dynamicParam.getQueryParam();
                List<OptionStrategyChainTemplate.FilterType> listComponent2 = dynamicParam.component2();
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listComponent2, 10));
                Iterator it3 = listComponent2.iterator();
                while (it3.hasNext()) {
                    Choice currentChoice = getCurrentChoice((OptionStrategyChainTemplate.FilterType) it3.next());
                    if (currentChoice == null || (serverValue = currentChoice.getServerValue()) == null) {
                        break loop1;
                    } else {
                        arrayList3.add(serverValue);
                    }
                }
                arrayList2.add(Tuples4.m3642to(strComponent1, CollectionsKt.joinToString$default(arrayList3, ",", null, null, 0, null, null, 62, null)));
            } else {
                List<OptionStrategyChainTemplate.OptionInstrumentQueryParams.StaticParam> staticParams = this.template.getOptionInstrumentQuery().getStaticParams();
                ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(staticParams, 10));
                for (OptionStrategyChainTemplate.OptionInstrumentQueryParams.StaticParam staticParam : staticParams) {
                    arrayList4.add(Tuples4.m3642to(staticParam.getQueryParam(), staticParam.getValue()));
                }
                UiOptionChain uiOptionChain = this.selectedUiOptionChain;
                if (uiOptionChain == null || (optionChain = uiOptionChain.getOptionChain()) == null || (id = optionChain.getId()) == null) {
                    break loop1;
                } else {
                    getOptionInstrumentsParams = new GetOptionInstrumentsParams(id, MapsKt.toMap(CollectionsKt.plus((Collection) arrayList4, (Iterable) arrayList2)));
                }
            }
        }
        this.optionInstrumentsQueryParams = getOptionInstrumentsParams;
        OptionStrategyChainTemplate.OptionLegTemplate firstLegTemplate = OptionStrategyChainTemplates.getFirstLegTemplate(this.template);
        this.firstLegStreamingArgs = firstLegTemplate != null ? getAsLegArgs(firstLegTemplate) : null;
        OptionStrategyChainTemplate.OptionLegTemplate secondLegTemplate = OptionStrategyChainTemplates.getSecondLegTemplate(this.template);
        this.secondLegStreamingArgs = secondLegTemplate != null ? getAsLegArgs(secondLegTemplate) : null;
        if (this.shouldShowSettleOnOpenTooltip) {
            UiOptionChain uiOptionChain2 = this.selectedUiOptionChain;
            if (uiOptionChain2 == null || (optionChain2 = uiOptionChain2.getOptionChain()) == null) {
                z4 = false;
                if (!z4) {
                    String to24HourTime$default = DateStrings2.formatTo24HourTime$default(9, 30, null, 4, null);
                    StringResource.Companion companion = StringResource.INSTANCE;
                    settleOnOpenTooltip = new IndexOptionsTooltip.SettleOnOpenTooltip(0.5f, companion.invoke(C22987R.string.option_chain_index_options_settle_on_open_tooltip_text, to24HourTime$default), companion.invoke(C22987R.string.option_chain_index_options_tooltip_link_text, new Object[0]), companion.invoke(C22987R.string.option_chain_index_options_tooltip_link, new Object[0]));
                }
            } else {
                z4 = true;
                if (!optionChain2.getSettleOnOpen()) {
                }
                if (!z4) {
                }
            }
        } else {
            settleOnOpenTooltip = null;
        }
        this.indexOptionsTooltip = settleOnOpenTooltip;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final IacAlertSheet getIacAlertSheet() {
        return this.iacAlertSheet;
    }

    public final boolean getInSideBySideChainNuxRevampExperiment() {
        return this.inSideBySideChainNuxRevampExperiment;
    }

    public final ImmutableList<UiOptionChain> getUiOptionChains() {
        return this.uiOptionChains;
    }

    public final OptionStrategyChainTemplate getTemplate() {
        return this.template;
    }

    public final FilteredStrategiesListData getFilteredStrategiesListData() {
        return this.filteredStrategiesListData;
    }

    public final FilterChoicesData getFilterChoicesData() {
        return this.filterChoicesData;
    }

    public final String getStrategyId() {
        return this.strategyId;
    }

    public /* synthetic */ OptionStrategyBuilderViewState(String str, IacAlertSheet iacAlertSheet, boolean z, ImmutableList immutableList, OptionStrategyChainTemplate optionStrategyChainTemplate, FilteredStrategiesListData filteredStrategiesListData, FilterChoicesData filterChoicesData, String str2, Map map, Quote quote, IndexValue indexValue, Map map2, EducationTour educationTour, Map map3, List list, List list2, OptionSettings.DefaultPricingSetting defaultPricingSetting, OptionSettings.DefaultPricingSetting defaultPricingSetting2, OptionSettings.TradingOnExpirationState tradingOnExpirationState, OptionCurrentOrNextMarketDates optionCurrentOrNextMarketDates, SavedScrollTarget savedScrollTarget, OptionTooltip optionTooltip, OptionChainSelectedMetrics optionChainSelectedMetrics, UiEvent uiEvent, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : iacAlertSheet, z, immutableList, optionStrategyChainTemplate, filteredStrategiesListData, filterChoicesData, str2, (i & 256) != 0 ? MapsKt.emptyMap() : map, (i & 512) != 0 ? null : quote, (i & 1024) != 0 ? null : indexValue, (i & 2048) != 0 ? MapsKt.emptyMap() : map2, (i & 4096) != 0 ? null : educationTour, (i & 8192) != 0 ? MapsKt.emptyMap() : map3, (i & 16384) != 0 ? CollectionsKt.emptyList() : list, (32768 & i) != 0 ? CollectionsKt.emptyList() : list2, (65536 & i) != 0 ? null : defaultPricingSetting, (131072 & i) != 0 ? null : defaultPricingSetting2, (262144 & i) != 0 ? null : tradingOnExpirationState, (524288 & i) != 0 ? null : optionCurrentOrNextMarketDates, (1048576 & i) != 0 ? null : savedScrollTarget, (2097152 & i) != 0 ? null : optionTooltip, (4194304 & i) != 0 ? null : optionChainSelectedMetrics, (8388608 & i) != 0 ? null : uiEvent, (i & 16777216) != 0 ? false : z2);
    }

    public final Map<OptionStrategyChainTemplate.FilterType, PreviousValue> getOverrideChoices() {
        return this.overrideChoices;
    }

    public final Quote getEquityQuote() {
        return this.equityQuote;
    }

    public final IndexValue getIndexValue() {
        return this.indexValue;
    }

    public final Map<UUID, OptionInstrumentQuote> getOptionQuotes() {
        return this.optionQuotes;
    }

    public final EducationTour getEducationTour() {
        return this.educationTour;
    }

    public final Map<UUID, UiOptionPositionCounts> getOptionPositionCounts() {
        return this.optionPositionCounts;
    }

    public final List<UiAggregateOptionPosition> getMatchingAggregateOptionPositions() {
        return this.matchingAggregateOptionPositions;
    }

    public final List<UiAggregateOptionPosition> getOppositeAggregateOptionPositions() {
        return this.oppositeAggregateOptionPositions;
    }

    public final OptionSettings.DefaultPricingSetting getDefaultPricingSettingOverride() {
        return this.defaultPricingSettingOverride;
    }

    public final OptionSettings.DefaultPricingSetting getDefaultPricingSettingServerValue() {
        return this.defaultPricingSettingServerValue;
    }

    public final OptionSettings.TradingOnExpirationState getTradeOnExpirationSettings() {
        return this.tradeOnExpirationSettings;
    }

    public final OptionCurrentOrNextMarketDates getCurrentOrNextMarketDates() {
        return this.currentOrNextMarketDates;
    }

    public final SavedScrollTarget getSavedScrollTarget() {
        return this.savedScrollTarget;
    }

    public final OptionTooltip getTooltip() {
        return this.tooltip;
    }

    public final OptionChainSelectedMetrics getSelectedMetrics() {
        return this.selectedMetrics;
    }

    public final UiEvent<OptionChainCustomizationErrorEvent> getChainCustomizationErrorEvent() {
        return this.chainCustomizationErrorEvent;
    }

    public final boolean getShouldShowSettleOnOpenTooltip() {
        return this.shouldShowSettleOnOpenTooltip;
    }

    public final String getOptionChainIdsForLogging() {
        return this.optionChainIdsForLogging;
    }

    public final OptionChain getFirstOptionChainForPerformanceLogging() {
        return this.firstOptionChainForPerformanceLogging;
    }

    public final String getToolbarTitle() {
        return this.toolbarTitle;
    }

    public final String getToolbarSubtitle() {
        return this.toolbarSubtitle;
    }

    /* renamed from: isExpiringToday, reason: from getter */
    public final boolean getIsExpiringToday() {
        return this.isExpiringToday;
    }

    public final OptionDefaultPricingState getDefaultPricingState() {
        return this.defaultPricingState;
    }

    public final UnderlyingQuote getUnderlyingQuote() {
        return this.underlyingQuote;
    }

    /* compiled from: OptionStrategyBuilderViewState.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003JB\u0010\u0018\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/optionsstrategybuilder/OptionStrategyBuilderViewState$StrategyChainAdapterState;", "", "rows", "", "Lcom/robinhood/android/optionsstrategybuilder/StrategyChain;", "quotePosition", "", "scrollPosition", "selectedMetrics", "Lcom/robinhood/models/db/OptionChainSelectedMetrics;", "<init>", "(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/robinhood/models/db/OptionChainSelectedMetrics;)V", "getRows", "()Ljava/util/List;", "getQuotePosition", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getScrollPosition", "getSelectedMetrics", "()Lcom/robinhood/models/db/OptionChainSelectedMetrics;", "component1", "component2", "component3", "component4", "copy", "(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/robinhood/models/db/OptionChainSelectedMetrics;)Lcom/robinhood/android/optionsstrategybuilder/OptionStrategyBuilderViewState$StrategyChainAdapterState;", "equals", "", "other", "hashCode", "toString", "", "feature-options-strategy-builder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class StrategyChainAdapterState {
        public static final int $stable = 8;
        private final Integer quotePosition;
        private final List<StrategyChainListAdapter2> rows;
        private final Integer scrollPosition;
        private final OptionChainSelectedMetrics selectedMetrics;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StrategyChainAdapterState copy$default(StrategyChainAdapterState strategyChainAdapterState, List list, Integer num, Integer num2, OptionChainSelectedMetrics optionChainSelectedMetrics, int i, Object obj) {
            if ((i & 1) != 0) {
                list = strategyChainAdapterState.rows;
            }
            if ((i & 2) != 0) {
                num = strategyChainAdapterState.quotePosition;
            }
            if ((i & 4) != 0) {
                num2 = strategyChainAdapterState.scrollPosition;
            }
            if ((i & 8) != 0) {
                optionChainSelectedMetrics = strategyChainAdapterState.selectedMetrics;
            }
            return strategyChainAdapterState.copy(list, num, num2, optionChainSelectedMetrics);
        }

        public final List<StrategyChainListAdapter2> component1() {
            return this.rows;
        }

        /* renamed from: component2, reason: from getter */
        public final Integer getQuotePosition() {
            return this.quotePosition;
        }

        /* renamed from: component3, reason: from getter */
        public final Integer getScrollPosition() {
            return this.scrollPosition;
        }

        /* renamed from: component4, reason: from getter */
        public final OptionChainSelectedMetrics getSelectedMetrics() {
            return this.selectedMetrics;
        }

        public final StrategyChainAdapterState copy(List<? extends StrategyChainListAdapter2> rows, Integer quotePosition, Integer scrollPosition, OptionChainSelectedMetrics selectedMetrics) {
            Intrinsics.checkNotNullParameter(rows, "rows");
            return new StrategyChainAdapterState(rows, quotePosition, scrollPosition, selectedMetrics);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StrategyChainAdapterState)) {
                return false;
            }
            StrategyChainAdapterState strategyChainAdapterState = (StrategyChainAdapterState) other;
            return Intrinsics.areEqual(this.rows, strategyChainAdapterState.rows) && Intrinsics.areEqual(this.quotePosition, strategyChainAdapterState.quotePosition) && Intrinsics.areEqual(this.scrollPosition, strategyChainAdapterState.scrollPosition) && Intrinsics.areEqual(this.selectedMetrics, strategyChainAdapterState.selectedMetrics);
        }

        public int hashCode() {
            int iHashCode = this.rows.hashCode() * 31;
            Integer num = this.quotePosition;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.scrollPosition;
            int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
            OptionChainSelectedMetrics optionChainSelectedMetrics = this.selectedMetrics;
            return iHashCode3 + (optionChainSelectedMetrics != null ? optionChainSelectedMetrics.hashCode() : 0);
        }

        public String toString() {
            return "StrategyChainAdapterState(rows=" + this.rows + ", quotePosition=" + this.quotePosition + ", scrollPosition=" + this.scrollPosition + ", selectedMetrics=" + this.selectedMetrics + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public StrategyChainAdapterState(List<? extends StrategyChainListAdapter2> rows, Integer num, Integer num2, OptionChainSelectedMetrics optionChainSelectedMetrics) {
            Intrinsics.checkNotNullParameter(rows, "rows");
            this.rows = rows;
            this.quotePosition = num;
            this.scrollPosition = num2;
            this.selectedMetrics = optionChainSelectedMetrics;
        }

        public /* synthetic */ StrategyChainAdapterState(List list, Integer num, Integer num2, OptionChainSelectedMetrics optionChainSelectedMetrics, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, num, num2, (i & 8) != 0 ? null : optionChainSelectedMetrics);
        }

        public final List<StrategyChainListAdapter2> getRows() {
            return this.rows;
        }

        public final Integer getQuotePosition() {
            return this.quotePosition;
        }

        public final Integer getScrollPosition() {
            return this.scrollPosition;
        }

        public final OptionChainSelectedMetrics getSelectedMetrics() {
            return this.selectedMetrics;
        }
    }

    public final StrategyChainAdapterState getStrategyChainAdapterState() {
        return this.strategyChainAdapterState;
    }

    public final String getUnderlyingQuoteIndicatorText(Resources resources) throws Resources.NotFoundException {
        String underlyingQuoteIndicatorText;
        Intrinsics.checkNotNullParameter(resources, "resources");
        UnderlyingQuote underlyingQuote = this.underlyingQuote;
        if (underlyingQuote != null && (underlyingQuoteIndicatorText = UnderlyingQuoteModelUtil.getUnderlyingQuoteIndicatorText(underlyingQuote, resources)) != null) {
            return underlyingQuoteIndicatorText;
        }
        String string2 = resources.getString(C11048R.string.general_label_n_a_short);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    public final UiOptionChain getSelectedUiOptionChain() {
        return this.selectedUiOptionChain;
    }

    public final GetOptionInstrumentsParams getOptionInstrumentsQueryParams() {
        return this.optionInstrumentsQueryParams;
    }

    public final OptionStrategyBuilderStore.LegStreamingArgs getFirstLegStreamingArgs() {
        return this.firstLegStreamingArgs;
    }

    public final OptionStrategyBuilderStore.LegStreamingArgs getSecondLegStreamingArgs() {
        return this.secondLegStreamingArgs;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final FragmentKey getChainCustomizationFragmentKey() {
        OptionStrategyType optionStrategyTypeFromServerValue = OptionStrategyType.INSTANCE.fromServerValue(this.strategyId);
        String str = null;
        Object[] objArr = 0;
        if (optionStrategyTypeFromServerValue != null) {
            return new OptionChainCustomizationLaunchMode.StrategyBuilder(optionStrategyTypeFromServerValue, str, 2, objArr == true ? 1 : 0);
        }
        return null;
    }

    public final IndexOptionsTooltip.SettleOnOpenTooltip getIndexOptionsTooltip() {
        return this.indexOptionsTooltip;
    }

    public final PreviousValue getOverrideValue(OptionStrategyChainTemplate.FilterType filterType) {
        Intrinsics.checkNotNullParameter(filterType, "filterType");
        Choice currentChoice = getCurrentChoice(filterType);
        if (currentChoice == null) {
            return null;
        }
        return new PreviousValue(currentChoice, this.filteredStrategiesListData.getUserEditedFilters().contains(filterType));
    }

    private final Choice getCurrentChoice(OptionStrategyChainTemplate.FilterType filterType) {
        return this.filteredStrategiesListData.getSelectedChoices().get(filterType);
    }

    private final OptionStrategyBuilderStore.LegStreamingArgs getAsLegArgs(OptionStrategyChainTemplate.OptionLegTemplate optionLegTemplate) {
        Choice currentChoice = getCurrentChoice(optionLegTemplate.getExpDateFilter());
        Choice.DateChoice dateChoice = currentChoice instanceof Choice.DateChoice ? (Choice.DateChoice) currentChoice : null;
        if (dateChoice == null) {
            return null;
        }
        return new OptionStrategyBuilderStore.LegStreamingArgs(dateChoice.getUiOptionChain().getOptionChain().getId(), optionLegTemplate.getOptionType(), dateChoice.getDate(), optionLegTemplate.getStrikeSortOrder());
    }

    /* compiled from: OptionStrategyBuilderViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/optionsstrategybuilder/OptionStrategyBuilderViewState$PreviousValue;", "", "choice", "Lcom/robinhood/android/optionsstrategybuilder/OptionStrategyBuilderViewState$Choice;", "isUserEdited", "", "<init>", "(Lcom/robinhood/android/optionsstrategybuilder/OptionStrategyBuilderViewState$Choice;Z)V", "getChoice", "()Lcom/robinhood/android/optionsstrategybuilder/OptionStrategyBuilderViewState$Choice;", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-options-strategy-builder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PreviousValue {
        public static final int $stable = 0;
        private final Choice choice;
        private final boolean isUserEdited;

        public static /* synthetic */ PreviousValue copy$default(PreviousValue previousValue, Choice choice, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                choice = previousValue.choice;
            }
            if ((i & 2) != 0) {
                z = previousValue.isUserEdited;
            }
            return previousValue.copy(choice, z);
        }

        /* renamed from: component1, reason: from getter */
        public final Choice getChoice() {
            return this.choice;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsUserEdited() {
            return this.isUserEdited;
        }

        public final PreviousValue copy(Choice choice, boolean isUserEdited) {
            Intrinsics.checkNotNullParameter(choice, "choice");
            return new PreviousValue(choice, isUserEdited);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PreviousValue)) {
                return false;
            }
            PreviousValue previousValue = (PreviousValue) other;
            return Intrinsics.areEqual(this.choice, previousValue.choice) && this.isUserEdited == previousValue.isUserEdited;
        }

        public int hashCode() {
            return (this.choice.hashCode() * 31) + Boolean.hashCode(this.isUserEdited);
        }

        public String toString() {
            return "PreviousValue(choice=" + this.choice + ", isUserEdited=" + this.isUserEdited + ")";
        }

        public PreviousValue(Choice choice, boolean z) {
            Intrinsics.checkNotNullParameter(choice, "choice");
            this.choice = choice;
            this.isUserEdited = z;
        }

        public final Choice getChoice() {
            return this.choice;
        }

        public final boolean isUserEdited() {
            return this.isUserEdited;
        }
    }

    /* compiled from: OptionStrategyBuilderViewState.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0012\u0013\u0014B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH&J\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016R\u0012\u0010\r\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f\u0082\u0001\u0003\u0015\u0016\u0017¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/optionsstrategybuilder/OptionStrategyBuilderViewState$Choice;", "Landroid/os/Parcelable;", "<init>", "()V", "toString", "", "resources", "Landroid/content/res/Resources;", "includeTimeToExp", "", "distanceFromUnderlyingQuote", "Ljava/math/BigDecimal;", "underlyingValue", "loggingValue", "getLoggingValue", "()Ljava/lang/String;", "serverValue", "getServerValue", "DateChoice", "StrikeChoice", "SpreadWidthChoice", "Lcom/robinhood/android/optionsstrategybuilder/OptionStrategyBuilderViewState$Choice$DateChoice;", "Lcom/robinhood/android/optionsstrategybuilder/OptionStrategyBuilderViewState$Choice$SpreadWidthChoice;", "Lcom/robinhood/android/optionsstrategybuilder/OptionStrategyBuilderViewState$Choice$StrikeChoice;", "feature-options-strategy-builder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class Choice implements Parcelable {
        public static final int $stable = 0;
        private final String serverValue;

        public /* synthetic */ Choice(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public BigDecimal distanceFromUnderlyingQuote(BigDecimal underlyingValue) {
            Intrinsics.checkNotNullParameter(underlyingValue, "underlyingValue");
            return null;
        }

        public abstract String getLoggingValue();

        public abstract String toString(Resources resources, boolean includeTimeToExp);

        private Choice() {
        }

        public static /* synthetic */ String toString$default(Choice choice, Resources resources, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toString");
            }
            if ((i & 2) != 0) {
                z = false;
            }
            return choice.toString(resources, z);
        }

        public String getServerValue() {
            return this.serverValue;
        }

        /* compiled from: OptionStrategyBuilderViewState.kt */
        @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ$\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0017J\u001a\u0010\"\u001a\u00020\n2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u001bR\u0014\u0010)\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u001eR\u0014\u0010+\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u001e¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/optionsstrategybuilder/OptionStrategyBuilderViewState$Choice$DateChoice;", "Lcom/robinhood/android/optionsstrategybuilder/OptionStrategyBuilderViewState$Choice;", "j$/time/LocalDate", InquiryField.DateField.TYPE, "Lcom/robinhood/models/ui/UiOptionChain;", "uiOptionChain", "<init>", "(Lj$/time/LocalDate;Lcom/robinhood/models/ui/UiOptionChain;)V", "Landroid/content/res/Resources;", "resources", "", "includeTimeToExp", "", "toString", "(Landroid/content/res/Resources;Z)Ljava/lang/String;", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lj$/time/LocalDate;", "component2", "()Lcom/robinhood/models/ui/UiOptionChain;", "copy", "(Lj$/time/LocalDate;Lcom/robinhood/models/ui/UiOptionChain;)Lcom/robinhood/android/optionsstrategybuilder/OptionStrategyBuilderViewState$Choice$DateChoice;", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lj$/time/LocalDate;", "getDate", "Lcom/robinhood/models/ui/UiOptionChain;", "getUiOptionChain", "getLoggingValue", "loggingValue", "getServerValue", "serverValue", "feature-options-strategy-builder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final /* data */ class DateChoice extends Choice {
            public static final int $stable = 8;
            public static final Parcelable.Creator<DateChoice> CREATOR = new Creator();
            private final LocalDate date;
            private final UiOptionChain uiOptionChain;

            /* compiled from: OptionStrategyBuilderViewState.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<DateChoice> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final DateChoice createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new DateChoice((LocalDate) parcel.readSerializable(), (UiOptionChain) parcel.readParcelable(DateChoice.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final DateChoice[] newArray(int i) {
                    return new DateChoice[i];
                }
            }

            public static /* synthetic */ DateChoice copy$default(DateChoice dateChoice, LocalDate localDate, UiOptionChain uiOptionChain, int i, Object obj) {
                if ((i & 1) != 0) {
                    localDate = dateChoice.date;
                }
                if ((i & 2) != 0) {
                    uiOptionChain = dateChoice.uiOptionChain;
                }
                return dateChoice.copy(localDate, uiOptionChain);
            }

            /* renamed from: component1, reason: from getter */
            public final LocalDate getDate() {
                return this.date;
            }

            /* renamed from: component2, reason: from getter */
            public final UiOptionChain getUiOptionChain() {
                return this.uiOptionChain;
            }

            public final DateChoice copy(LocalDate date, UiOptionChain uiOptionChain) {
                Intrinsics.checkNotNullParameter(date, "date");
                Intrinsics.checkNotNullParameter(uiOptionChain, "uiOptionChain");
                return new DateChoice(date, uiOptionChain);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DateChoice)) {
                    return false;
                }
                DateChoice dateChoice = (DateChoice) other;
                return Intrinsics.areEqual(this.date, dateChoice.date) && Intrinsics.areEqual(this.uiOptionChain, dateChoice.uiOptionChain);
            }

            public int hashCode() {
                return (this.date.hashCode() * 31) + this.uiOptionChain.hashCode();
            }

            public String toString() {
                return "DateChoice(date=" + this.date + ", uiOptionChain=" + this.uiOptionChain + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.date);
                dest.writeParcelable(this.uiOptionChain, flags);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DateChoice(LocalDate date, UiOptionChain uiOptionChain) {
                super(null);
                Intrinsics.checkNotNullParameter(date, "date");
                Intrinsics.checkNotNullParameter(uiOptionChain, "uiOptionChain");
                this.date = date;
                this.uiOptionChain = uiOptionChain;
            }

            public final LocalDate getDate() {
                return this.date;
            }

            public final UiOptionChain getUiOptionChain() {
                return this.uiOptionChain;
            }

            @Override // com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderViewState.Choice
            public String getLoggingValue() {
                String string2 = this.date.toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                return string2;
            }

            @Override // com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderViewState.Choice
            public String getServerValue() {
                String string2 = this.date.toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                return string2;
            }

            @Override // com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderViewState.Choice
            public String toString(Resources resources, boolean includeTimeToExp) throws Resources.NotFoundException {
                Intrinsics.checkNotNullParameter(resources, "resources");
                String recent = LocalDates4.formatRecent(this.date, resources, (EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE & 2) != 0 ? LocalDateFormatter.MEDIUM : LocalDateFormatter.MEDIUM_WITH_OPTIONAL_YEAR, (EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE & 4) != 0 ? null : null, (EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE & 8) != 0 ? true : true, (EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE & 16) != 0, (EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE & 32) != 0, (EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE & 64) == 0 ? false : true, (EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE & 128) != 0 ? false : false);
                if (!includeTimeToExp) {
                    if (!this.uiOptionChain.getOptionChain().getSettleOnOpen()) {
                        return recent;
                    }
                    String string2 = resources.getString(C24876R.string.date_settle_on_open, recent);
                    Intrinsics.checkNotNull(string2);
                    return string2;
                }
                if (this.uiOptionChain.getOptionChain().getSettleOnOpen()) {
                    int i = C24876R.string.date_settle_on_open_with_time_to_exp;
                    LocalDate localDateNow = LocalDate.now();
                    Intrinsics.checkNotNullExpressionValue(localDateNow, "now(...)");
                    String string3 = resources.getString(i, recent, String.valueOf(localDateNow.until(this.date, ChronoUnit.DAYS)));
                    Intrinsics.checkNotNull(string3);
                    return string3;
                }
                int i2 = C24876R.string.date_with_time_to_exp;
                LocalDate localDateNow2 = LocalDate.now();
                Intrinsics.checkNotNullExpressionValue(localDateNow2, "now(...)");
                String string4 = resources.getString(i2, recent, String.valueOf(localDateNow2.until(this.date, ChronoUnit.DAYS)));
                Intrinsics.checkNotNull(string4);
                return string4;
            }
        }

        /* compiled from: OptionStrategyBuilderViewState.kt */
        @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0003H\u0016J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J'\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u001f\u001a\u00020\u0005J\u0013\u0010 \u001a\u00020\u00182\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0011HÖ\u0001J\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/optionsstrategybuilder/OptionStrategyBuilderViewState$Choice$StrikeChoice;", "Lcom/robinhood/android/optionsstrategybuilder/OptionStrategyBuilderViewState$Choice;", "moneyValue", "Ljava/math/BigDecimal;", "strikeIndex", "", "underlyingType", "Lcom/robinhood/models/db/OptionChain$UnderlyingType;", "<init>", "(Ljava/math/BigDecimal;ILcom/robinhood/models/db/OptionChain$UnderlyingType;)V", "getMoneyValue", "()Ljava/math/BigDecimal;", "getStrikeIndex", "()I", "getUnderlyingType", "()Lcom/robinhood/models/db/OptionChain$UnderlyingType;", "loggingValue", "", "getLoggingValue", "()Ljava/lang/String;", "toString", "resources", "Landroid/content/res/Resources;", "includeTimeToExp", "", "distanceFromUnderlyingQuote", "underlyingValue", "component1", "component2", "component3", "copy", "describeContents", "equals", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-strategy-builder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class StrikeChoice extends Choice {
            public static final int $stable = 8;
            public static final Parcelable.Creator<StrikeChoice> CREATOR = new Creator();
            private final BigDecimal moneyValue;
            private final int strikeIndex;
            private final OptionChain.UnderlyingType underlyingType;

            /* compiled from: OptionStrategyBuilderViewState.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<StrikeChoice> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final StrikeChoice createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new StrikeChoice((BigDecimal) parcel.readSerializable(), parcel.readInt(), OptionChain.UnderlyingType.valueOf(parcel.readString()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final StrikeChoice[] newArray(int i) {
                    return new StrikeChoice[i];
                }
            }

            public static /* synthetic */ StrikeChoice copy$default(StrikeChoice strikeChoice, BigDecimal bigDecimal, int i, OptionChain.UnderlyingType underlyingType, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    bigDecimal = strikeChoice.moneyValue;
                }
                if ((i2 & 2) != 0) {
                    i = strikeChoice.strikeIndex;
                }
                if ((i2 & 4) != 0) {
                    underlyingType = strikeChoice.underlyingType;
                }
                return strikeChoice.copy(bigDecimal, i, underlyingType);
            }

            /* renamed from: component1, reason: from getter */
            public final BigDecimal getMoneyValue() {
                return this.moneyValue;
            }

            /* renamed from: component2, reason: from getter */
            public final int getStrikeIndex() {
                return this.strikeIndex;
            }

            /* renamed from: component3, reason: from getter */
            public final OptionChain.UnderlyingType getUnderlyingType() {
                return this.underlyingType;
            }

            public final StrikeChoice copy(BigDecimal moneyValue, int strikeIndex, OptionChain.UnderlyingType underlyingType) {
                Intrinsics.checkNotNullParameter(moneyValue, "moneyValue");
                Intrinsics.checkNotNullParameter(underlyingType, "underlyingType");
                return new StrikeChoice(moneyValue, strikeIndex, underlyingType);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof StrikeChoice)) {
                    return false;
                }
                StrikeChoice strikeChoice = (StrikeChoice) other;
                return Intrinsics.areEqual(this.moneyValue, strikeChoice.moneyValue) && this.strikeIndex == strikeChoice.strikeIndex && this.underlyingType == strikeChoice.underlyingType;
            }

            public int hashCode() {
                return (((this.moneyValue.hashCode() * 31) + Integer.hashCode(this.strikeIndex)) * 31) + this.underlyingType.hashCode();
            }

            public String toString() {
                return "StrikeChoice(moneyValue=" + this.moneyValue + ", strikeIndex=" + this.strikeIndex + ", underlyingType=" + this.underlyingType + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.moneyValue);
                dest.writeInt(this.strikeIndex);
                dest.writeString(this.underlyingType.name());
            }

            public final BigDecimal getMoneyValue() {
                return this.moneyValue;
            }

            public final int getStrikeIndex() {
                return this.strikeIndex;
            }

            public final OptionChain.UnderlyingType getUnderlyingType() {
                return this.underlyingType;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StrikeChoice(BigDecimal moneyValue, int i, OptionChain.UnderlyingType underlyingType) {
                super(null);
                Intrinsics.checkNotNullParameter(moneyValue, "moneyValue");
                Intrinsics.checkNotNullParameter(underlyingType, "underlyingType");
                this.moneyValue = moneyValue;
                this.strikeIndex = i;
                this.underlyingType = underlyingType;
            }

            @Override // com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderViewState.Choice
            public String getLoggingValue() {
                return Formats.getStrikePriceFormat().format(this.moneyValue);
            }

            @Override // com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderViewState.Choice
            public String toString(Resources resources, boolean includeTimeToExp) {
                Intrinsics.checkNotNullParameter(resources, "resources");
                return OptionUnderlyings.getStrikeFormatter(this.underlyingType).format(this.moneyValue);
            }

            @Override // com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderViewState.Choice
            public BigDecimal distanceFromUnderlyingQuote(BigDecimal underlyingValue) {
                Intrinsics.checkNotNullParameter(underlyingValue, "underlyingValue");
                BigDecimal bigDecimalSubtract = underlyingValue.subtract(this.moneyValue);
                Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
                BigDecimal bigDecimalAbs = bigDecimalSubtract.abs();
                Intrinsics.checkNotNullExpressionValue(bigDecimalAbs, "abs(...)");
                return bigDecimalAbs;
            }
        }

        /* compiled from: OptionStrategyBuilderViewState.kt */
        @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u0018\u001a\u00020\u0019J\u0013\u0010\u001a\u001a\u00020\u00142\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0019HÖ\u0001J\t\u0010\u0010\u001a\u00020\rHÖ\u0001J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/optionsstrategybuilder/OptionStrategyBuilderViewState$Choice$SpreadWidthChoice;", "Lcom/robinhood/android/optionsstrategybuilder/OptionStrategyBuilderViewState$Choice;", "moneyValue", "Ljava/math/BigDecimal;", "underlyingType", "Lcom/robinhood/models/db/OptionChain$UnderlyingType;", "<init>", "(Ljava/math/BigDecimal;Lcom/robinhood/models/db/OptionChain$UnderlyingType;)V", "getMoneyValue", "()Ljava/math/BigDecimal;", "getUnderlyingType", "()Lcom/robinhood/models/db/OptionChain$UnderlyingType;", "loggingValue", "", "getLoggingValue", "()Ljava/lang/String;", "toString", "resources", "Landroid/content/res/Resources;", "includeTimeToExp", "", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-strategy-builder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class SpreadWidthChoice extends Choice {
            public static final int $stable = 8;
            public static final Parcelable.Creator<SpreadWidthChoice> CREATOR = new Creator();
            private final BigDecimal moneyValue;
            private final OptionChain.UnderlyingType underlyingType;

            /* compiled from: OptionStrategyBuilderViewState.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<SpreadWidthChoice> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SpreadWidthChoice createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new SpreadWidthChoice((BigDecimal) parcel.readSerializable(), OptionChain.UnderlyingType.valueOf(parcel.readString()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SpreadWidthChoice[] newArray(int i) {
                    return new SpreadWidthChoice[i];
                }
            }

            public static /* synthetic */ SpreadWidthChoice copy$default(SpreadWidthChoice spreadWidthChoice, BigDecimal bigDecimal, OptionChain.UnderlyingType underlyingType, int i, Object obj) {
                if ((i & 1) != 0) {
                    bigDecimal = spreadWidthChoice.moneyValue;
                }
                if ((i & 2) != 0) {
                    underlyingType = spreadWidthChoice.underlyingType;
                }
                return spreadWidthChoice.copy(bigDecimal, underlyingType);
            }

            /* renamed from: component1, reason: from getter */
            public final BigDecimal getMoneyValue() {
                return this.moneyValue;
            }

            /* renamed from: component2, reason: from getter */
            public final OptionChain.UnderlyingType getUnderlyingType() {
                return this.underlyingType;
            }

            public final SpreadWidthChoice copy(BigDecimal moneyValue, OptionChain.UnderlyingType underlyingType) {
                Intrinsics.checkNotNullParameter(moneyValue, "moneyValue");
                Intrinsics.checkNotNullParameter(underlyingType, "underlyingType");
                return new SpreadWidthChoice(moneyValue, underlyingType);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SpreadWidthChoice)) {
                    return false;
                }
                SpreadWidthChoice spreadWidthChoice = (SpreadWidthChoice) other;
                return Intrinsics.areEqual(this.moneyValue, spreadWidthChoice.moneyValue) && this.underlyingType == spreadWidthChoice.underlyingType;
            }

            public int hashCode() {
                return (this.moneyValue.hashCode() * 31) + this.underlyingType.hashCode();
            }

            public String toString() {
                return "SpreadWidthChoice(moneyValue=" + this.moneyValue + ", underlyingType=" + this.underlyingType + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.moneyValue);
                dest.writeString(this.underlyingType.name());
            }

            public final BigDecimal getMoneyValue() {
                return this.moneyValue;
            }

            public final OptionChain.UnderlyingType getUnderlyingType() {
                return this.underlyingType;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SpreadWidthChoice(BigDecimal moneyValue, OptionChain.UnderlyingType underlyingType) {
                super(null);
                Intrinsics.checkNotNullParameter(moneyValue, "moneyValue");
                Intrinsics.checkNotNullParameter(underlyingType, "underlyingType");
                this.moneyValue = moneyValue;
                this.underlyingType = underlyingType;
            }

            @Override // com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderViewState.Choice
            public String getLoggingValue() {
                return Formats.getStrikePriceFormat().format(this.moneyValue);
            }

            @Override // com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderViewState.Choice
            public String toString(Resources resources, boolean includeTimeToExp) {
                Intrinsics.checkNotNullParameter(resources, "resources");
                return OptionUnderlyings.getStrikeFormatter(this.underlyingType).format(this.moneyValue);
            }
        }
    }

    /* compiled from: OptionStrategyBuilderViewState.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\r\u001a\u0004\u0018\u00010\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00060\u0012¢\u0006\u0002\u0010\u0014J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0013HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/optionsstrategybuilder/OptionStrategyBuilderViewState$SavedScrollTarget;", "", "strategyIdentifier", "", "scrollEvent", "Lcom/robinhood/udf/UiEvent;", "", "<init>", "(Ljava/lang/String;Lcom/robinhood/udf/UiEvent;)V", "getStrategyIdentifier", "()Ljava/lang/String;", "getScrollEvent", "()Lcom/robinhood/udf/UiEvent;", "consumeUiEventIfStrategyInSet", "rows", "", "Lcom/robinhood/android/optionsstrategybuilder/StrategyChain;", "block", "Lkotlin/Function1;", "", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Lkotlin/Unit;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "feature-options-strategy-builder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final /* data */ class SavedScrollTarget {
        public static final int $stable = 8;
        private final UiEvent<Unit> scrollEvent;
        private final String strategyIdentifier;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SavedScrollTarget copy$default(SavedScrollTarget savedScrollTarget, String str, UiEvent uiEvent, int i, Object obj) {
            if ((i & 1) != 0) {
                str = savedScrollTarget.strategyIdentifier;
            }
            if ((i & 2) != 0) {
                uiEvent = savedScrollTarget.scrollEvent;
            }
            return savedScrollTarget.copy(str, uiEvent);
        }

        /* renamed from: component1, reason: from getter */
        public final String getStrategyIdentifier() {
            return this.strategyIdentifier;
        }

        public final UiEvent<Unit> component2() {
            return this.scrollEvent;
        }

        public final SavedScrollTarget copy(String strategyIdentifier, UiEvent<Unit> scrollEvent) {
            Intrinsics.checkNotNullParameter(strategyIdentifier, "strategyIdentifier");
            Intrinsics.checkNotNullParameter(scrollEvent, "scrollEvent");
            return new SavedScrollTarget(strategyIdentifier, scrollEvent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SavedScrollTarget)) {
                return false;
            }
            SavedScrollTarget savedScrollTarget = (SavedScrollTarget) other;
            return Intrinsics.areEqual(this.strategyIdentifier, savedScrollTarget.strategyIdentifier) && Intrinsics.areEqual(this.scrollEvent, savedScrollTarget.scrollEvent);
        }

        public int hashCode() {
            return (this.strategyIdentifier.hashCode() * 31) + this.scrollEvent.hashCode();
        }

        public String toString() {
            return "SavedScrollTarget(strategyIdentifier=" + this.strategyIdentifier + ", scrollEvent=" + this.scrollEvent + ")";
        }

        public final Unit consumeUiEventIfStrategyInSet(List<? extends StrategyChainListAdapter2> rows, Function1<? super Integer, Unit> block) {
            Intrinsics.checkNotNullParameter(rows, "rows");
            Intrinsics.checkNotNullParameter(block, "block");
            Iterator<? extends StrategyChainListAdapter2> it = rows.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                StrategyChainListAdapter2 next = it.next();
                StrategyChainListAdapter2.StrategyData strategyData = next instanceof StrategyChainListAdapter2.StrategyData ? (StrategyChainListAdapter2.StrategyData) next : null;
                if (strategyData == null ? false : Intrinsics.areEqual(strategyData.getOptionStrategyRowModel().getStrategy().getIdentifier(), this.strategyIdentifier)) {
                    break;
                }
                i++;
            }
            if (i == -1 || this.scrollEvent.consume() == null) {
                return null;
            }
            block.invoke(Integer.valueOf(i));
            return Unit.INSTANCE;
        }

        public SavedScrollTarget(String strategyIdentifier, UiEvent<Unit> scrollEvent) {
            Intrinsics.checkNotNullParameter(strategyIdentifier, "strategyIdentifier");
            Intrinsics.checkNotNullParameter(scrollEvent, "scrollEvent");
            this.strategyIdentifier = strategyIdentifier;
            this.scrollEvent = scrollEvent;
        }

        public final String getStrategyIdentifier() {
            return this.strategyIdentifier;
        }

        public final UiEvent<Unit> getScrollEvent() {
            return this.scrollEvent;
        }
    }

    /* compiled from: OptionStrategyBuilderViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 =2\u00020\u0001:\u0002<=B%\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nB'\b\u0016\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\rJ\"\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00032\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001cJ\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\bJ\u001e\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\bJ\u0018\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0015H\u0002J\u000e\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020&J\u000e\u0010(\u001a\u00020\u00152\u0006\u0010%\u001a\u00020&J\u000e\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u0006J\u000f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0006HÆ\u0003J\t\u0010.\u001a\u00020\bHÆ\u0003J-\u0010/\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0006\u00100\u001a\u000201J\u0013\u00102\u001a\u00020\u00152\b\u00103\u001a\u0004\u0018\u000104HÖ\u0003J\t\u00105\u001a\u000201HÖ\u0001J\t\u00106\u001a\u00020\u0006HÖ\u0001J\u0016\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u000201R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0011¨\u0006>"}, m3636d2 = {"Lcom/robinhood/android/optionsstrategybuilder/OptionStrategyBuilderViewState$Strategy;", "Landroid/os/Parcelable;", "legs", "", "Lcom/robinhood/android/optionsstrategybuilder/OptionStrategyBuilderViewState$Strategy$Leg;", "displayName", "", "uiOptionChain", "Lcom/robinhood/models/ui/UiOptionChain;", "<init>", "(Ljava/util/List;Ljava/lang/String;Lcom/robinhood/models/ui/UiOptionChain;)V", "template", "Lcom/robinhood/models/db/OptionStrategyChainTemplate;", "(Ljava/util/List;Lcom/robinhood/models/db/OptionStrategyChainTemplate;Lcom/robinhood/models/ui/UiOptionChain;)V", "getLegs", "()Ljava/util/List;", "getDisplayName", "()Ljava/lang/String;", "getUiOptionChain", "()Lcom/robinhood/models/ui/UiOptionChain;", "isSingleLeg", "", "()Z", "identifier", "getIdentifier", "getLegContexts", "Lcom/robinhood/android/options/aggregatequotes/OptionQuoteAggregator$LegContext;", "optionQuotes", "", "Ljava/util/UUID;", "Lcom/robinhood/models/db/OptionInstrumentQuote;", "getOptionOrderBundle", "Lcom/robinhood/models/ui/OptionOrderBundle;", "getOptionOrderIntentKey", "Lcom/robinhood/android/options/contracts/OptionOrderIntentKey;", "accountNumber", "matchesPosition", "position", "Lcom/robinhood/models/ui/UiAggregateOptionPosition;", "matchesOpposite", "matchesOppositePosition", "toOptionsContextLog", "Lcom/robinhood/rosetta/eventlogging/OptionsContext;", "strategy", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Leg", "Companion", "feature-options-strategy-builder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final /* data */ class Strategy implements Parcelable {
        private final String displayName;
        private final List<Leg> legs;
        private final UiOptionChain uiOptionChain;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;
        public static final Parcelable.Creator<Strategy> CREATOR = new Creator();

        /* compiled from: OptionStrategyBuilderViewState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Strategy> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Strategy createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(Leg.CREATOR.createFromParcel(parcel));
                }
                return new Strategy(arrayList, parcel.readString(), (UiOptionChain) parcel.readParcelable(Strategy.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Strategy[] newArray(int i) {
                return new Strategy[i];
            }
        }

        /* compiled from: OptionStrategyBuilderViewState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[OrderSide.values().length];
                try {
                    iArr[OrderSide.BUY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[OrderSide.SELL.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Strategy copy$default(Strategy strategy, List list, String str, UiOptionChain uiOptionChain, int i, Object obj) {
            if ((i & 1) != 0) {
                list = strategy.legs;
            }
            if ((i & 2) != 0) {
                str = strategy.displayName;
            }
            if ((i & 4) != 0) {
                uiOptionChain = strategy.uiOptionChain;
            }
            return strategy.copy(list, str, uiOptionChain);
        }

        public final List<Leg> component1() {
            return this.legs;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDisplayName() {
            return this.displayName;
        }

        /* renamed from: component3, reason: from getter */
        public final UiOptionChain getUiOptionChain() {
            return this.uiOptionChain;
        }

        public final Strategy copy(List<Leg> legs, String displayName, UiOptionChain uiOptionChain) {
            Intrinsics.checkNotNullParameter(legs, "legs");
            Intrinsics.checkNotNullParameter(displayName, "displayName");
            Intrinsics.checkNotNullParameter(uiOptionChain, "uiOptionChain");
            return new Strategy(legs, displayName, uiOptionChain);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Strategy)) {
                return false;
            }
            Strategy strategy = (Strategy) other;
            return Intrinsics.areEqual(this.legs, strategy.legs) && Intrinsics.areEqual(this.displayName, strategy.displayName) && Intrinsics.areEqual(this.uiOptionChain, strategy.uiOptionChain);
        }

        public int hashCode() {
            return (((this.legs.hashCode() * 31) + this.displayName.hashCode()) * 31) + this.uiOptionChain.hashCode();
        }

        public String toString() {
            return "Strategy(legs=" + this.legs + ", displayName=" + this.displayName + ", uiOptionChain=" + this.uiOptionChain + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            List<Leg> list = this.legs;
            dest.writeInt(list.size());
            Iterator<Leg> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
            dest.writeString(this.displayName);
            dest.writeParcelable(this.uiOptionChain, flags);
        }

        public Strategy(List<Leg> legs, String displayName, UiOptionChain uiOptionChain) {
            Intrinsics.checkNotNullParameter(legs, "legs");
            Intrinsics.checkNotNullParameter(displayName, "displayName");
            Intrinsics.checkNotNullParameter(uiOptionChain, "uiOptionChain");
            this.legs = legs;
            this.displayName = displayName;
            this.uiOptionChain = uiOptionChain;
        }

        public final List<Leg> getLegs() {
            return this.legs;
        }

        public final String getDisplayName() {
            return this.displayName;
        }

        public final UiOptionChain getUiOptionChain() {
            return this.uiOptionChain;
        }

        public final boolean isSingleLeg() {
            return CollectionsKt.singleOrNull((List) this.legs) != null;
        }

        public final String getIdentifier() {
            return CollectionsKt.joinToString$default(this.legs, null, null, null, 0, null, new Function1() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderViewState$Strategy$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OptionStrategyBuilderViewState.Strategy._get_identifier_$lambda$0((OptionStrategyBuilderViewState.Strategy.Leg) obj);
                }
            }, 31, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence _get_identifier_$lambda$0(Leg leg) {
            Intrinsics.checkNotNullParameter(leg, "leg");
            int i = WhenMappings.$EnumSwitchMapping$0[leg.getOptionLegTemplate().getSide().ordinal()];
            if (i == 1) {
                return leg.getOptionInstrument().getId() + "_L" + leg.getOptionLegTemplate().getRatioQuantity();
            }
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return leg.getOptionInstrument().getId() + "_S" + leg.getOptionLegTemplate().getRatioQuantity();
        }

        public final List<OptionQuoteAggregator.LegContext> getLegContexts(Map<UUID, OptionInstrumentQuote> optionQuotes) {
            Intrinsics.checkNotNullParameter(optionQuotes, "optionQuotes");
            List<Leg> list = this.legs;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (Leg leg : list) {
                OptionInstrumentQuote optionInstrumentQuote = optionQuotes.get(leg.getOptionInstrument().getId());
                if (optionInstrumentQuote == null) {
                    return null;
                }
                OrderSide side = leg.getOptionLegTemplate().getSide();
                BigDecimal bigDecimalValueOf = BigDecimal.valueOf(leg.getOptionLegTemplate().getRatioQuantity());
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
                arrayList.add(new OptionQuoteAggregator.LegContext(optionInstrumentQuote, side, bigDecimalValueOf));
            }
            return arrayList;
        }

        public final OptionOrderBundle getOptionOrderBundle(OptionStrategyChainTemplate template, UiOptionChain uiOptionChain) {
            Intrinsics.checkNotNullParameter(template, "template");
            Intrinsics.checkNotNullParameter(uiOptionChain, "uiOptionChain");
            OptionChainBundle optionBundles2 = new OptionChainBundle(uiOptionChain.getFirstEquityUnderlyingId(), uiOptionChain.getOptionChain().getId(), uiOptionChain);
            List<Leg> list = this.legs;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(INSTANCE.toLegBundle((Leg) it.next(), uiOptionChain));
            }
            return new OptionOrderBundle(optionBundles2, extensions2.toPersistentList(arrayList), null, null, null, template.getIntendedDirection(), 28, null);
        }

        public final OptionOrderIntentKey getOptionOrderIntentKey(String accountNumber, OptionStrategyChainTemplate template, UiOptionChain uiOptionChain) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(template, "template");
            Intrinsics.checkNotNullParameter(uiOptionChain, "uiOptionChain");
            return new OptionOrderIntentKey.FromOptionOrderBundle(null, accountNumber, getOptionOrderBundle(template, uiOptionChain), null, null, null, null, false, false, false, OptionChainDisplayMode.DEFAULT, OptionOrderFormSource.STRATEGY_CHAIN, null, TransitionReason.OPTION_TRADE_CHAIN, 4601, null);
        }

        private final boolean matchesPosition(UiAggregateOptionPosition position, boolean matchesOpposite) {
            List listSortedWith = CollectionsKt.sortedWith(this.legs, new Comparator() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderViewState$Strategy$matchesPosition$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(((OptionStrategyBuilderViewState.Strategy.Leg) t).getOptionInstrument().getId(), ((OptionStrategyBuilderViewState.Strategy.Leg) t2).getOptionInstrument().getId());
                }
            });
            List listSortedWith2 = CollectionsKt.sortedWith(position.getLegs(), new Comparator() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderViewState$Strategy$matchesPosition$$inlined$sortedBy$2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(((AggregateOptionPositionLeg) t).getOptionInstrumentId(), ((AggregateOptionPositionLeg) t2).getOptionInstrumentId());
                }
            });
            if (listSortedWith.size() != listSortedWith2.size()) {
                return false;
            }
            Iterable<IndexedValue> iterableWithIndex = CollectionsKt.withIndex(listSortedWith);
            if ((iterableWithIndex instanceof Collection) && ((Collection) iterableWithIndex).isEmpty()) {
                return true;
            }
            for (IndexedValue indexedValue : iterableWithIndex) {
                if (!((Leg) indexedValue.component2()).matchesPositionLeg((AggregateOptionPositionLeg) CollectionsKt.getOrNull(listSortedWith2, indexedValue.getIndex()), matchesOpposite)) {
                    return false;
                }
            }
            return true;
        }

        public final boolean matchesPosition(UiAggregateOptionPosition position) {
            Intrinsics.checkNotNullParameter(position, "position");
            return matchesPosition(position, false);
        }

        public final boolean matchesOppositePosition(UiAggregateOptionPosition position) {
            Intrinsics.checkNotNullParameter(position, "position");
            return matchesPosition(position, true);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final OptionsContext toOptionsContextLog(String strategy) {
            OptionInstrument optionInstrument;
            OptionInstrument optionInstrument2;
            Intrinsics.checkNotNullParameter(strategy, "strategy");
            String string2 = this.uiOptionChain.getOptionChain().getId().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            StrategyName strategyName = Events2.getStrategyName(strategy);
            Leg leg = (Leg) CollectionsKt.firstOrNull((List) this.legs);
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            int i = 2;
            OptionsContext.OptionLeg optionLeg = new OptionsContext.OptionLeg(Uuids.toStringOrEmpty((leg == null || (optionInstrument2 = leg.getOptionInstrument()) == null) ? null : optionInstrument2.getId()), null, i, 0 == true ? 1 : 0);
            Leg leg2 = (Leg) CollectionsKt.getOrNull(this.legs, 1);
            return new OptionsContext(string2, null, null, null, strategyName, optionLeg, new OptionsContext.OptionLeg(Uuids.toStringOrEmpty((leg2 == null || (optionInstrument = leg2.getOptionInstrument()) == null) ? null : optionInstrument.getId()), objArr2 == true ? 1 : 0, i, objArr == true ? 1 : 0), null, null, null, null, null, null, null, 16270, null);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Strategy(List<Leg> legs, OptionStrategyChainTemplate template, UiOptionChain uiOptionChain) {
            this(legs, OptionStrategyChainTemplates.getRowTitle(template, legs), uiOptionChain);
            Intrinsics.checkNotNullParameter(legs, "legs");
            Intrinsics.checkNotNullParameter(template, "template");
            Intrinsics.checkNotNullParameter(uiOptionChain, "uiOptionChain");
        }

        /* compiled from: OptionStrategyBuilderViewState.kt */
        @Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015J\u001a\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u0017J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J'\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u001f\u001a\u00020 J\u0013\u0010!\u001a\u00020\u00172\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020 HÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001J\u0016\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020 R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/optionsstrategybuilder/OptionStrategyBuilderViewState$Strategy$Leg;", "Landroid/os/Parcelable;", "uiOptionChain", "Lcom/robinhood/models/ui/UiOptionChain;", "optionInstrument", "Lcom/robinhood/models/db/OptionInstrument;", "optionLegTemplate", "Lcom/robinhood/models/db/OptionStrategyChainTemplate$OptionLegTemplate;", "<init>", "(Lcom/robinhood/models/ui/UiOptionChain;Lcom/robinhood/models/db/OptionInstrument;Lcom/robinhood/models/db/OptionStrategyChainTemplate$OptionLegTemplate;)V", "getUiOptionChain", "()Lcom/robinhood/models/ui/UiOptionChain;", "getOptionInstrument", "()Lcom/robinhood/models/db/OptionInstrument;", "getOptionLegTemplate", "()Lcom/robinhood/models/db/OptionStrategyChainTemplate$OptionLegTemplate;", "getOptionStatisticsFragmentKey", "Lcom/robinhood/android/options/contracts/OptionStatisticsFragmentKey;", "optionOrderIntentKey", "Lcom/robinhood/android/options/contracts/OptionOrderIntentKey;", "tradableState", "Lcom/robinhood/models/ui/OptionStatisticsTradableState;", "matchesPositionLeg", "", "positionLeg", "Lcom/robinhood/models/db/AggregateOptionPositionLeg;", "matchesOpposite", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-strategy-builder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Leg implements Parcelable {
            public static final int $stable = 8;
            public static final Parcelable.Creator<Leg> CREATOR = new Creator();
            private final OptionInstrument optionInstrument;
            private final OptionStrategyChainTemplate.OptionLegTemplate optionLegTemplate;
            private final UiOptionChain uiOptionChain;

            /* compiled from: OptionStrategyBuilderViewState.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<Leg> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Leg createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Leg((UiOptionChain) parcel.readParcelable(Leg.class.getClassLoader()), (OptionInstrument) parcel.readParcelable(Leg.class.getClassLoader()), (OptionStrategyChainTemplate.OptionLegTemplate) parcel.readParcelable(Leg.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Leg[] newArray(int i) {
                    return new Leg[i];
                }
            }

            public static /* synthetic */ Leg copy$default(Leg leg, UiOptionChain uiOptionChain, OptionInstrument optionInstrument, OptionStrategyChainTemplate.OptionLegTemplate optionLegTemplate, int i, Object obj) {
                if ((i & 1) != 0) {
                    uiOptionChain = leg.uiOptionChain;
                }
                if ((i & 2) != 0) {
                    optionInstrument = leg.optionInstrument;
                }
                if ((i & 4) != 0) {
                    optionLegTemplate = leg.optionLegTemplate;
                }
                return leg.copy(uiOptionChain, optionInstrument, optionLegTemplate);
            }

            /* renamed from: component1, reason: from getter */
            public final UiOptionChain getUiOptionChain() {
                return this.uiOptionChain;
            }

            /* renamed from: component2, reason: from getter */
            public final OptionInstrument getOptionInstrument() {
                return this.optionInstrument;
            }

            /* renamed from: component3, reason: from getter */
            public final OptionStrategyChainTemplate.OptionLegTemplate getOptionLegTemplate() {
                return this.optionLegTemplate;
            }

            public final Leg copy(UiOptionChain uiOptionChain, OptionInstrument optionInstrument, OptionStrategyChainTemplate.OptionLegTemplate optionLegTemplate) {
                Intrinsics.checkNotNullParameter(uiOptionChain, "uiOptionChain");
                Intrinsics.checkNotNullParameter(optionInstrument, "optionInstrument");
                Intrinsics.checkNotNullParameter(optionLegTemplate, "optionLegTemplate");
                return new Leg(uiOptionChain, optionInstrument, optionLegTemplate);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Leg)) {
                    return false;
                }
                Leg leg = (Leg) other;
                return Intrinsics.areEqual(this.uiOptionChain, leg.uiOptionChain) && Intrinsics.areEqual(this.optionInstrument, leg.optionInstrument) && Intrinsics.areEqual(this.optionLegTemplate, leg.optionLegTemplate);
            }

            public int hashCode() {
                return (((this.uiOptionChain.hashCode() * 31) + this.optionInstrument.hashCode()) * 31) + this.optionLegTemplate.hashCode();
            }

            public String toString() {
                return "Leg(uiOptionChain=" + this.uiOptionChain + ", optionInstrument=" + this.optionInstrument + ", optionLegTemplate=" + this.optionLegTemplate + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.uiOptionChain, flags);
                dest.writeParcelable(this.optionInstrument, flags);
                dest.writeParcelable(this.optionLegTemplate, flags);
            }

            public Leg(UiOptionChain uiOptionChain, OptionInstrument optionInstrument, OptionStrategyChainTemplate.OptionLegTemplate optionLegTemplate) {
                Intrinsics.checkNotNullParameter(uiOptionChain, "uiOptionChain");
                Intrinsics.checkNotNullParameter(optionInstrument, "optionInstrument");
                Intrinsics.checkNotNullParameter(optionLegTemplate, "optionLegTemplate");
                this.uiOptionChain = uiOptionChain;
                this.optionInstrument = optionInstrument;
                this.optionLegTemplate = optionLegTemplate;
            }

            public final UiOptionChain getUiOptionChain() {
                return this.uiOptionChain;
            }

            public final OptionInstrument getOptionInstrument() {
                return this.optionInstrument;
            }

            public final OptionStrategyChainTemplate.OptionLegTemplate getOptionLegTemplate() {
                return this.optionLegTemplate;
            }

            public static /* synthetic */ OptionStatisticsFragmentKey getOptionStatisticsFragmentKey$default(Leg leg, OptionOrderIntentKey optionOrderIntentKey, OptionStatisticsTradableState optionStatisticsTradableState, int i, Object obj) {
                if ((i & 1) != 0) {
                    optionOrderIntentKey = null;
                }
                if ((i & 2) != 0) {
                    optionStatisticsTradableState = OptionStatisticsTradableState.NotAvailable.INSTANCE;
                }
                return leg.getOptionStatisticsFragmentKey(optionOrderIntentKey, optionStatisticsTradableState);
            }

            public final OptionStatisticsFragmentKey getOptionStatisticsFragmentKey(OptionOrderIntentKey optionOrderIntentKey, OptionStatisticsTradableState tradableState) {
                Intrinsics.checkNotNullParameter(tradableState, "tradableState");
                return new OptionStatisticsFragmentKey(Strategy.INSTANCE.toLegBundle(this, this.uiOptionChain), optionOrderIntentKey, tradableState, OptionStatisticsLaunchMode.STRATEGY_BUILDER, false, 16, null);
            }

            public static /* synthetic */ boolean matchesPositionLeg$default(Leg leg, AggregateOptionPositionLeg aggregateOptionPosition2, boolean z, int i, Object obj) {
                if ((i & 2) != 0) {
                    z = false;
                }
                return leg.matchesPositionLeg(aggregateOptionPosition2, z);
            }

            public final boolean matchesPositionLeg(AggregateOptionPositionLeg positionLeg, boolean matchesOpposite) {
                return positionLeg != null && OptionStrategyChainTemplates.validateLeg(this.optionLegTemplate, positionLeg, matchesOpposite) && Intrinsics.areEqual(this.optionInstrument.getId(), positionLeg.getOptionInstrumentId());
            }
        }

        /* compiled from: OptionStrategyBuilderViewState.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/optionsstrategybuilder/OptionStrategyBuilderViewState$Strategy$Companion;", "", "<init>", "()V", "toLegBundle", "Lcom/robinhood/models/ui/OptionLegBundle;", "Lcom/robinhood/android/optionsstrategybuilder/OptionStrategyBuilderViewState$Strategy$Leg;", "uiOptionChain", "Lcom/robinhood/models/ui/UiOptionChain;", "feature-options-strategy-builder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final OptionLegBundle toLegBundle(Leg leg, UiOptionChain uiOptionChain) {
                return new OptionLegBundle(new OptionConfigurationBundle(new OptionChainBundle(uiOptionChain.getFirstEquityUnderlyingId(), uiOptionChain.getOptionChain().getId(), uiOptionChain), leg.getOptionInstrument().getExpirationDate(), leg.getOptionInstrument().getContractType(), leg.getOptionLegTemplate().getSide()), leg.getOptionInstrument(), leg.getOptionLegTemplate().getRatioQuantity());
            }
        }
    }
}
