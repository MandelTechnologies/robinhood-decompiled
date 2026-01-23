package com.robinhood.android.optionschain;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import com.robinhood.android.account.strings.AccountDisplayNames;
import com.robinhood.android.account.strings.DisplayName;
import com.robinhood.android.common.options.OptionChainColors;
import com.robinhood.android.common.options.OptionDefaultPricingState;
import com.robinhood.android.common.options.upsell.fridaytrading.OptionDiscoverZeroDteSnackbarState;
import com.robinhood.android.common.util.TransitionReason;
import com.robinhood.android.common.util.extensions.OptionExtensions;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.indexes.models.p159db.IndexCloseValue;
import com.robinhood.android.indexes.models.p159db.IndexValue;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.optionchain.C22987R;
import com.robinhood.android.optionchain.chainsettings.OptionChainCustomizationErrorEvent;
import com.robinhood.android.optionchain.tooltips.IndexOptionsTooltip;
import com.robinhood.android.optionchain.tooltips.SwitchFocusedToSbsTooltip;
import com.robinhood.android.options.contracts.OptionChainLaunchMode;
import com.robinhood.android.options.contracts.OptionChainSettingsFragmentKey;
import com.robinhood.android.options.contracts.OptionOrderIntentKey;
import com.robinhood.android.options.optionsstring.datetime.DateStrings2;
import com.robinhood.android.options.tradability.expiration.OptionChainExpirationDateState;
import com.robinhood.android.options.tradability.expiration.OptionChainExpirationDateState2;
import com.robinhood.android.optionschain.OptionChainListViewState;
import com.robinhood.android.optionschain.OptionChainViewState;
import com.robinhood.android.optionschain.OptionStrategyBuilderView;
import com.robinhood.android.optionschain.rolling.OptionChainRollingHeaderView;
import com.robinhood.android.optionschain.strategybuilder.OptionStrategyBuilderAdapter2;
import com.robinhood.android.optionschain.view.OptionChainTooltipBanner3;
import com.robinhood.common.strings.UiOptionOrders3;
import com.robinhood.librobinhood.data.store.OptionChainLandingPageUnderlyingState;
import com.robinhood.librobinhood.data.store.OptionChainPageState;
import com.robinhood.models.Decimals4;
import com.robinhood.models.api.OptionStrategyType;
import com.robinhood.models.api.strategybuilder.StrategyBuilderSentiment;
import com.robinhood.models.api.strategybuilder.StrategyBuilderStrategyCardState;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p320db.OptionChainSelectedMetrics;
import com.robinhood.models.p320db.OptionContractType;
import com.robinhood.models.p320db.OptionCurrentOrNextMarketDates;
import com.robinhood.models.p320db.OptionInstrument;
import com.robinhood.models.p320db.OptionInstrumentQuote;
import com.robinhood.models.p320db.OptionMarketHoursParam2;
import com.robinhood.models.p320db.OptionOrderFilter;
import com.robinhood.models.p320db.OptionSettings;
import com.robinhood.models.p320db.OptionStrategyBuilder;
import com.robinhood.models.p320db.OptionTooltip;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.p355ui.IacAlertSheet;
import com.robinhood.models.p355ui.OptionChainBundle;
import com.robinhood.models.p355ui.OptionChainDisplayMode;
import com.robinhood.models.p355ui.OptionChainSettingsPnlChartType;
import com.robinhood.models.p355ui.OptionConfigurationBundle;
import com.robinhood.models.p355ui.OptionLegBundle;
import com.robinhood.models.p355ui.OptionOrderBundle;
import com.robinhood.models.p355ui.UiOptionChain;
import com.robinhood.models.p355ui.UiOptionChains;
import com.robinhood.models.p355ui.UiOptionStrategyLegDisplay;
import com.robinhood.scarlet.ScarletOverlay;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.datetime.Instants;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks3;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import p479j$.time.Clock;
import p479j$.time.Instant;
import p479j$.time.LocalDate;
import p479j$.time.temporal.ChronoUnit;
import rosetta.option.OptionOrderFormSource;

/* compiled from: OptionChainViewState.kt */
@Metadata(m3635d1 = {"\u0000Ã\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0003\bÀ\u0001\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001:\u000eÍ\u0003Î\u0003Ï\u0003Ð\u0003Ñ\u0003Ò\u0003Ó\u0003Bµ\u0006\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\b\u0002\u0010 \u001a\u00020\u0017\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\"\u001a\u00020\u0017\u0012\u0006\u0010$\u001a\u00020#\u0012\b\b\u0002\u0010%\u001a\u00020\u0017\u0012\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u0011\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*\u0012\b\b\u0002\u0010-\u001a\u00020,\u0012\u0010\b\u0002\u0010/\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010\u0014\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u000100\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u000102\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u000104\u0012\u0016\b\u0002\u00108\u001a\u0010\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\u0017\u0018\u000106\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u000109\u0012\u0016\b\u0002\u0010<\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020;0\u0011\u0018\u00010\u0014\u0012\u0010\b\u0002\u0010=\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0014\u0012\u001c\b\u0002\u0010@\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020\u00060>\u0018\u00010\u0014\u0012\u0010\b\u0002\u0010B\u001a\n\u0012\u0004\u0012\u00020A\u0018\u00010\u0014\u0012\n\b\u0002\u0010D\u001a\u0004\u0018\u00010C\u0012\b\b\u0002\u0010F\u001a\u00020E\u0012\n\b\u0002\u0010H\u001a\u0004\u0018\u00010G\u0012\n\b\u0002\u0010J\u001a\u0004\u0018\u00010I\u0012\n\b\u0002\u0010L\u001a\u0004\u0018\u00010K\u0012\u0010\b\u0002\u0010N\u001a\n\u0012\u0004\u0012\u00020M\u0018\u00010\u0014\u0012\n\b\u0002\u0010P\u001a\u0004\u0018\u00010O\u0012\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010O\u0012\n\b\u0002\u0010S\u001a\u0004\u0018\u00010R\u0012\u0010\b\u0002\u0010U\u001a\n\u0012\u0004\u0012\u00020T\u0018\u00010\u0014\u0012\b\b\u0002\u0010V\u001a\u00020\u0017\u0012\u0010\b\u0002\u0010W\u001a\n\u0012\u0004\u0012\u000207\u0018\u00010\u0014\u0012\b\b\u0002\u0010Y\u001a\u00020X\u0012\b\b\u0002\u0010Z\u001a\u00020\u0017\u0012\b\b\u0002\u0010[\u001a\u00020\u0017\u0012\b\b\u0002\u0010\\\u001a\u00020\u0017\u0012\b\b\u0002\u0010]\u001a\u00020\u0017\u0012\b\b\u0002\u0010^\u001a\u00020\u0017\u0012\b\b\u0002\u0010_\u001a\u00020\u0017\u0012\u0010\b\u0002\u0010`\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0014\u0012\u0010\b\u0002\u0010b\u001a\n\u0012\u0004\u0012\u00020a\u0018\u00010\u0014\u0012\b\b\u0002\u0010c\u001a\u00020\u0017\u0012\b\b\u0002\u0010d\u001a\u00020\u0017\u0012\b\b\u0002\u0010e\u001a\u00020\u0017\u0012\b\b\u0002\u0010f\u001a\u00020\u0017\u0012\b\b\u0002\u0010g\u001a\u00020\u0006\u0012\b\b\u0002\u0010h\u001a\u00020\u0017\u0012\b\b\u0002\u0010i\u001a\u00020\u0017¢\u0006\u0004\bj\u0010kJ\u0017\u0010n\u001a\u00020\u00172\u0006\u0010m\u001a\u00020lH\u0002¢\u0006\u0004\bn\u0010oJ\u0019\u0010r\u001a\u0004\u0018\u00010q2\u0006\u0010p\u001a\u00020\u0012H\u0002¢\u0006\u0004\br\u0010sJ\u0012\u0010t\u001a\u0004\u0018\u00010(HÂ\u0003¢\u0006\u0004\bt\u0010uJ\u0017\u0010w\u001a\u0004\u0018\u00010v2\u0006\u0010m\u001a\u00020l¢\u0006\u0004\bw\u0010xJ\u0015\u0010y\u001a\u00020\u00172\u0006\u0010m\u001a\u00020l¢\u0006\u0004\by\u0010oJ\u0019\u0010|\u001a\u0004\u0018\u00010\u00172\u0006\u0010m\u001a\u00020lH\u0001¢\u0006\u0004\bz\u0010{J\u001a\u0010\u007f\u001a\u0004\u0018\u0001072\u0006\u0010~\u001a\u00020}H\u0007¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\u001d\u0010\u0082\u0001\u001a\u0004\u0018\u0001072\u0007\u0010\u0081\u0001\u001a\u00020}H\u0007¢\u0006\u0006\b\u0082\u0001\u0010\u0080\u0001J!\u0010\u0084\u0001\u001a\u00030\u0083\u00012\u0006\u0010~\u001a\u00020}2\u0006\u0010m\u001a\u00020l¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J#\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u0088\u00012\u000e\u0010\u0087\u0001\u001a\t\u0012\u0005\u0012\u00030\u0086\u00010\u0011¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J\u0015\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J\u0015\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J\u0015\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J\u0015\u0010\u0091\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J\u0015\u0010\u0093\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J\u0015\u0010\u0095\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J\u0015\u0010\u0097\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0006\b\u0097\u0001\u0010\u0096\u0001J\u0015\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J\u0019\u0010\u009a\u0001\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011HÆ\u0003¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J\u001b\u0010\u009c\u0001\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014HÆ\u0003¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001J\u0013\u0010\u009e\u0001\u001a\u00020\u0017HÆ\u0003¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J\u0013\u0010 \u0001\u001a\u00020\u0017HÆ\u0003¢\u0006\u0006\b \u0001\u0010\u009f\u0001J\u0013\u0010¡\u0001\u001a\u00020\u0017HÆ\u0003¢\u0006\u0006\b¡\u0001\u0010\u009f\u0001J\u0013\u0010¢\u0001\u001a\u00020\u0017HÆ\u0003¢\u0006\u0006\b¢\u0001\u0010\u009f\u0001J\u0013\u0010£\u0001\u001a\u00020\u0017HÆ\u0003¢\u0006\u0006\b£\u0001\u0010\u009f\u0001J\u0013\u0010¤\u0001\u001a\u00020\u0017HÆ\u0003¢\u0006\u0006\b¤\u0001\u0010\u009f\u0001J\u0015\u0010¥\u0001\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0006\b¥\u0001\u0010¦\u0001J\u0013\u0010§\u0001\u001a\u00020\u0017HÆ\u0003¢\u0006\u0006\b§\u0001\u0010\u009f\u0001J\u0015\u0010¨\u0001\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0006\b¨\u0001\u0010©\u0001J\u0013\u0010ª\u0001\u001a\u00020\u0017HÆ\u0003¢\u0006\u0006\bª\u0001\u0010\u009f\u0001J\u0013\u0010«\u0001\u001a\u00020#HÆ\u0003¢\u0006\u0006\b«\u0001\u0010¬\u0001J\u0013\u0010\u00ad\u0001\u001a\u00020\u0017HÆ\u0003¢\u0006\u0006\b\u00ad\u0001\u0010\u009f\u0001J\u0019\u0010®\u0001\u001a\b\u0012\u0004\u0012\u00020&0\u0011HÆ\u0003¢\u0006\u0006\b®\u0001\u0010\u009b\u0001J\u0015\u0010¯\u0001\u001a\u0004\u0018\u00010*HÆ\u0003¢\u0006\u0006\b¯\u0001\u0010°\u0001J\u0013\u0010±\u0001\u001a\u00020,HÆ\u0003¢\u0006\u0006\b±\u0001\u0010²\u0001J\u001b\u0010³\u0001\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010\u0014HÆ\u0003¢\u0006\u0006\b³\u0001\u0010\u009d\u0001J\u0015\u0010´\u0001\u001a\u0004\u0018\u000100HÆ\u0003¢\u0006\u0006\b´\u0001\u0010µ\u0001J\u0015\u0010¶\u0001\u001a\u0004\u0018\u000102HÆ\u0003¢\u0006\u0006\b¶\u0001\u0010·\u0001J\u0015\u0010¸\u0001\u001a\u0004\u0018\u000104HÆ\u0003¢\u0006\u0006\b¸\u0001\u0010¹\u0001J!\u0010º\u0001\u001a\u0010\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\u0017\u0018\u000106HÆ\u0003¢\u0006\u0006\bº\u0001\u0010»\u0001J\u0015\u0010¼\u0001\u001a\u0004\u0018\u000109HÆ\u0003¢\u0006\u0006\b¼\u0001\u0010½\u0001J!\u0010¾\u0001\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020;0\u0011\u0018\u00010\u0014HÆ\u0003¢\u0006\u0006\b¾\u0001\u0010\u009d\u0001J\u001b\u0010¿\u0001\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0014HÆ\u0003¢\u0006\u0006\b¿\u0001\u0010\u009d\u0001J'\u0010À\u0001\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020\u00060>\u0018\u00010\u0014HÆ\u0003¢\u0006\u0006\bÀ\u0001\u0010\u009d\u0001J\u001b\u0010Á\u0001\u001a\n\u0012\u0004\u0012\u00020A\u0018\u00010\u0014HÆ\u0003¢\u0006\u0006\bÁ\u0001\u0010\u009d\u0001J\u0015\u0010Â\u0001\u001a\u0004\u0018\u00010CHÆ\u0003¢\u0006\u0006\bÂ\u0001\u0010Ã\u0001J\u0013\u0010Ä\u0001\u001a\u00020EHÆ\u0003¢\u0006\u0006\bÄ\u0001\u0010Å\u0001J\u0015\u0010Æ\u0001\u001a\u0004\u0018\u00010GHÆ\u0003¢\u0006\u0006\bÆ\u0001\u0010Ç\u0001J\u0015\u0010È\u0001\u001a\u0004\u0018\u00010IHÆ\u0003¢\u0006\u0006\bÈ\u0001\u0010É\u0001J\u0015\u0010Ê\u0001\u001a\u0004\u0018\u00010KHÆ\u0003¢\u0006\u0006\bÊ\u0001\u0010Ë\u0001J\u001b\u0010Ì\u0001\u001a\n\u0012\u0004\u0012\u00020M\u0018\u00010\u0014HÆ\u0003¢\u0006\u0006\bÌ\u0001\u0010\u009d\u0001J\u0015\u0010Í\u0001\u001a\u0004\u0018\u00010OHÆ\u0003¢\u0006\u0006\bÍ\u0001\u0010Î\u0001J\u0015\u0010Ï\u0001\u001a\u0004\u0018\u00010OHÆ\u0003¢\u0006\u0006\bÏ\u0001\u0010Î\u0001J\u0015\u0010Ð\u0001\u001a\u0004\u0018\u00010RHÆ\u0003¢\u0006\u0006\bÐ\u0001\u0010Ñ\u0001J\u001b\u0010Ò\u0001\u001a\n\u0012\u0004\u0012\u00020T\u0018\u00010\u0014HÆ\u0003¢\u0006\u0006\bÒ\u0001\u0010\u009d\u0001J\u0013\u0010Ó\u0001\u001a\u00020\u0017HÆ\u0003¢\u0006\u0006\bÓ\u0001\u0010\u009f\u0001J\u001b\u0010Ô\u0001\u001a\n\u0012\u0004\u0012\u000207\u0018\u00010\u0014HÆ\u0003¢\u0006\u0006\bÔ\u0001\u0010\u009d\u0001J\u0013\u0010Õ\u0001\u001a\u00020XHÆ\u0003¢\u0006\u0006\bÕ\u0001\u0010Ö\u0001J\u0013\u0010×\u0001\u001a\u00020\u0017HÆ\u0003¢\u0006\u0006\b×\u0001\u0010\u009f\u0001J\u0013\u0010Ø\u0001\u001a\u00020\u0017HÆ\u0003¢\u0006\u0006\bØ\u0001\u0010\u009f\u0001J\u0013\u0010Ù\u0001\u001a\u00020\u0017HÆ\u0003¢\u0006\u0006\bÙ\u0001\u0010\u009f\u0001J\u0013\u0010Ú\u0001\u001a\u00020\u0017HÆ\u0003¢\u0006\u0006\bÚ\u0001\u0010\u009f\u0001J\u0013\u0010Û\u0001\u001a\u00020\u0017HÆ\u0003¢\u0006\u0006\bÛ\u0001\u0010\u009f\u0001J\u0013\u0010Ü\u0001\u001a\u00020\u0017HÆ\u0003¢\u0006\u0006\bÜ\u0001\u0010\u009f\u0001J\u001b\u0010Ý\u0001\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0014HÆ\u0003¢\u0006\u0006\bÝ\u0001\u0010\u009d\u0001J\u001b\u0010Þ\u0001\u001a\n\u0012\u0004\u0012\u00020a\u0018\u00010\u0014HÆ\u0003¢\u0006\u0006\bÞ\u0001\u0010\u009d\u0001J\u0013\u0010ß\u0001\u001a\u00020\u0017HÆ\u0003¢\u0006\u0006\bß\u0001\u0010\u009f\u0001J\u0013\u0010à\u0001\u001a\u00020\u0017HÆ\u0003¢\u0006\u0006\bà\u0001\u0010\u009f\u0001J\u0013\u0010á\u0001\u001a\u00020\u0017HÆ\u0003¢\u0006\u0006\bá\u0001\u0010\u009f\u0001J\u0013\u0010â\u0001\u001a\u00020\u0017HÆ\u0003¢\u0006\u0006\bâ\u0001\u0010\u009f\u0001J\u0013\u0010ã\u0001\u001a\u00020\u0006HÆ\u0003¢\u0006\u0006\bã\u0001\u0010ä\u0001J\u0013\u0010å\u0001\u001a\u00020\u0017HÆ\u0003¢\u0006\u0006\bå\u0001\u0010\u009f\u0001J\u0013\u0010æ\u0001\u001a\u00020\u0017HÆ\u0003¢\u0006\u0006\bæ\u0001\u0010\u009f\u0001JÅ\u0006\u0010ç\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00172\b\b\u0002\u0010\u001b\u001a\u00020\u00172\b\b\u0002\u0010\u001c\u001a\u00020\u00172\b\b\u0002\u0010\u001d\u001a\u00020\u00172\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010 \u001a\u00020\u00172\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\"\u001a\u00020\u00172\b\b\u0002\u0010$\u001a\u00020#2\b\b\u0002\u0010%\u001a\u00020\u00172\u000e\b\u0002\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u00112\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*2\b\b\u0002\u0010-\u001a\u00020,2\u0010\b\u0002\u0010/\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010\u00142\n\b\u0002\u00101\u001a\u0004\u0018\u0001002\n\b\u0002\u00103\u001a\u0004\u0018\u0001022\n\b\u0002\u00105\u001a\u0004\u0018\u0001042\u0016\b\u0002\u00108\u001a\u0010\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\u0017\u0018\u0001062\n\b\u0002\u0010:\u001a\u0004\u0018\u0001092\u0016\b\u0002\u0010<\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020;0\u0011\u0018\u00010\u00142\u0010\b\u0002\u0010=\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00142\u001c\b\u0002\u0010@\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020\u00060>\u0018\u00010\u00142\u0010\b\u0002\u0010B\u001a\n\u0012\u0004\u0012\u00020A\u0018\u00010\u00142\n\b\u0002\u0010D\u001a\u0004\u0018\u00010C2\b\b\u0002\u0010F\u001a\u00020E2\n\b\u0002\u0010H\u001a\u0004\u0018\u00010G2\n\b\u0002\u0010J\u001a\u0004\u0018\u00010I2\n\b\u0002\u0010L\u001a\u0004\u0018\u00010K2\u0010\b\u0002\u0010N\u001a\n\u0012\u0004\u0012\u00020M\u0018\u00010\u00142\n\b\u0002\u0010P\u001a\u0004\u0018\u00010O2\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010O2\n\b\u0002\u0010S\u001a\u0004\u0018\u00010R2\u0010\b\u0002\u0010U\u001a\n\u0012\u0004\u0012\u00020T\u0018\u00010\u00142\b\b\u0002\u0010V\u001a\u00020\u00172\u0010\b\u0002\u0010W\u001a\n\u0012\u0004\u0012\u000207\u0018\u00010\u00142\b\b\u0002\u0010Y\u001a\u00020X2\b\b\u0002\u0010Z\u001a\u00020\u00172\b\b\u0002\u0010[\u001a\u00020\u00172\b\b\u0002\u0010\\\u001a\u00020\u00172\b\b\u0002\u0010]\u001a\u00020\u00172\b\b\u0002\u0010^\u001a\u00020\u00172\b\b\u0002\u0010_\u001a\u00020\u00172\u0010\b\u0002\u0010`\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00142\u0010\b\u0002\u0010b\u001a\n\u0012\u0004\u0012\u00020a\u0018\u00010\u00142\b\b\u0002\u0010c\u001a\u00020\u00172\b\b\u0002\u0010d\u001a\u00020\u00172\b\b\u0002\u0010e\u001a\u00020\u00172\b\b\u0002\u0010f\u001a\u00020\u00172\b\b\u0002\u0010g\u001a\u00020\u00062\b\b\u0002\u0010h\u001a\u00020\u00172\b\b\u0002\u0010i\u001a\u00020\u0017HÆ\u0001¢\u0006\u0006\bç\u0001\u0010è\u0001J\u0013\u0010é\u0001\u001a\u000207HÖ\u0001¢\u0006\u0006\bé\u0001\u0010ê\u0001J\u0013\u0010ë\u0001\u001a\u00020\u0006HÖ\u0001¢\u0006\u0006\bë\u0001\u0010ä\u0001J\u001e\u0010í\u0001\u001a\u00020\u00172\t\u0010ì\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0006\bí\u0001\u0010î\u0001R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\b\u0003\u0010ï\u0001\u001a\u0006\bð\u0001\u0010\u008c\u0001R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\u000f\n\u0005\b\u0005\u0010ñ\u0001\u001a\u0006\bò\u0001\u0010\u008e\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\u000f\n\u0005\b\u0007\u0010ó\u0001\u001a\u0006\bô\u0001\u0010\u0090\u0001R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\u000f\n\u0005\b\t\u0010õ\u0001\u001a\u0006\bö\u0001\u0010\u0092\u0001R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\u000f\n\u0005\b\u000b\u0010÷\u0001\u001a\u0006\bø\u0001\u0010\u0094\u0001R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\u000f\n\u0005\b\r\u0010ù\u0001\u001a\u0006\bú\u0001\u0010\u0096\u0001R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\u000f\n\u0005\b\u000e\u0010ù\u0001\u001a\u0006\bû\u0001\u0010\u0096\u0001R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\u000f\n\u0005\b\u0010\u0010ü\u0001\u001a\u0006\bý\u0001\u0010\u0099\u0001R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\u000f\n\u0005\b\u0013\u0010þ\u0001\u001a\u0006\bÿ\u0001\u0010\u009b\u0001R\"\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00148\u0006¢\u0006\u000f\n\u0005\b\u0016\u0010\u0080\u0002\u001a\u0006\b\u0081\u0002\u0010\u009d\u0001R\u001a\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\u000f\n\u0005\b\u0018\u0010\u0082\u0002\u001a\u0006\b\u0083\u0002\u0010\u009f\u0001R\u001a\u0010\u0019\u001a\u00020\u00178\u0006¢\u0006\u000f\n\u0005\b\u0019\u0010\u0082\u0002\u001a\u0006\b\u0084\u0002\u0010\u009f\u0001R\u001a\u0010\u001a\u001a\u00020\u00178\u0006¢\u0006\u000f\n\u0005\b\u001a\u0010\u0082\u0002\u001a\u0006\b\u0085\u0002\u0010\u009f\u0001R\u001a\u0010\u001b\u001a\u00020\u00178\u0006¢\u0006\u000f\n\u0005\b\u001b\u0010\u0082\u0002\u001a\u0006\b\u0086\u0002\u0010\u009f\u0001R\u001a\u0010\u001c\u001a\u00020\u00178\u0006¢\u0006\u000f\n\u0005\b\u001c\u0010\u0082\u0002\u001a\u0006\b\u0087\u0002\u0010\u009f\u0001R\u001a\u0010\u001d\u001a\u00020\u00178\u0006¢\u0006\u000f\n\u0005\b\u001d\u0010\u0082\u0002\u001a\u0006\b\u0088\u0002\u0010\u009f\u0001R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\u000f\n\u0005\b\u001f\u0010\u0089\u0002\u001a\u0006\b\u008a\u0002\u0010¦\u0001R\u001a\u0010 \u001a\u00020\u00178\u0006¢\u0006\u000f\n\u0005\b \u0010\u0082\u0002\u001a\u0006\b\u008b\u0002\u0010\u009f\u0001R\u001b\u0010!\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\u000e\n\u0005\b!\u0010\u008c\u0002\u001a\u0005\b!\u0010©\u0001R\u0019\u0010\"\u001a\u00020\u00178\u0006¢\u0006\u000e\n\u0005\b\"\u0010\u0082\u0002\u001a\u0005\b\"\u0010\u009f\u0001R\u001a\u0010$\u001a\u00020#8\u0006¢\u0006\u000f\n\u0005\b$\u0010\u008d\u0002\u001a\u0006\b\u008e\u0002\u0010¬\u0001R\u001a\u0010%\u001a\u00020\u00178\u0006¢\u0006\u000f\n\u0005\b%\u0010\u0082\u0002\u001a\u0006\b\u008f\u0002\u0010\u009f\u0001R \u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u00118\u0006¢\u0006\u000f\n\u0005\b'\u0010þ\u0001\u001a\u0006\b\u0090\u0002\u0010\u009b\u0001R\u0017\u0010)\u001a\u0004\u0018\u00010(8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b)\u0010\u0091\u0002R\u001c\u0010+\u001a\u0004\u0018\u00010*8\u0006¢\u0006\u000f\n\u0005\b+\u0010\u0092\u0002\u001a\u0006\b\u0093\u0002\u0010°\u0001R\u001a\u0010-\u001a\u00020,8\u0006¢\u0006\u000f\n\u0005\b-\u0010\u0094\u0002\u001a\u0006\b\u0095\u0002\u0010²\u0001R\"\u0010/\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010\u00148\u0006¢\u0006\u000f\n\u0005\b/\u0010\u0080\u0002\u001a\u0006\b\u0096\u0002\u0010\u009d\u0001R\u001c\u00101\u001a\u0004\u0018\u0001008\u0006¢\u0006\u000f\n\u0005\b1\u0010\u0097\u0002\u001a\u0006\b\u0098\u0002\u0010µ\u0001R\u001c\u00103\u001a\u0004\u0018\u0001028\u0006¢\u0006\u000f\n\u0005\b3\u0010\u0099\u0002\u001a\u0006\b\u009a\u0002\u0010·\u0001R\u001c\u00105\u001a\u0004\u0018\u0001048\u0006¢\u0006\u000f\n\u0005\b5\u0010\u009b\u0002\u001a\u0006\b\u009c\u0002\u0010¹\u0001R(\u00108\u001a\u0010\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\u0017\u0018\u0001068\u0006¢\u0006\u000f\n\u0005\b8\u0010\u009d\u0002\u001a\u0006\b\u009e\u0002\u0010»\u0001R\u001c\u0010:\u001a\u0004\u0018\u0001098\u0006¢\u0006\u000f\n\u0005\b:\u0010\u009f\u0002\u001a\u0006\b \u0002\u0010½\u0001R(\u0010<\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020;0\u0011\u0018\u00010\u00148\u0006¢\u0006\u000f\n\u0005\b<\u0010\u0080\u0002\u001a\u0006\b¡\u0002\u0010\u009d\u0001R\"\u0010=\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00148\u0006¢\u0006\u000f\n\u0005\b=\u0010\u0080\u0002\u001a\u0006\b¢\u0002\u0010\u009d\u0001R.\u0010@\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020\u00060>\u0018\u00010\u00148\u0006¢\u0006\u000f\n\u0005\b@\u0010\u0080\u0002\u001a\u0006\b£\u0002\u0010\u009d\u0001R\"\u0010B\u001a\n\u0012\u0004\u0012\u00020A\u0018\u00010\u00148\u0006¢\u0006\u000f\n\u0005\bB\u0010\u0080\u0002\u001a\u0006\b¤\u0002\u0010\u009d\u0001R\u001c\u0010D\u001a\u0004\u0018\u00010C8\u0006¢\u0006\u000f\n\u0005\bD\u0010¥\u0002\u001a\u0006\b¦\u0002\u0010Ã\u0001R\u001a\u0010F\u001a\u00020E8\u0006¢\u0006\u000f\n\u0005\bF\u0010§\u0002\u001a\u0006\b¨\u0002\u0010Å\u0001R\u001c\u0010H\u001a\u0004\u0018\u00010G8\u0006¢\u0006\u000f\n\u0005\bH\u0010©\u0002\u001a\u0006\bª\u0002\u0010Ç\u0001R\u001c\u0010J\u001a\u0004\u0018\u00010I8\u0006¢\u0006\u000f\n\u0005\bJ\u0010«\u0002\u001a\u0006\b¬\u0002\u0010É\u0001R\u001c\u0010L\u001a\u0004\u0018\u00010K8\u0006¢\u0006\u000f\n\u0005\bL\u0010\u00ad\u0002\u001a\u0006\b®\u0002\u0010Ë\u0001R\"\u0010N\u001a\n\u0012\u0004\u0012\u00020M\u0018\u00010\u00148\u0006¢\u0006\u000f\n\u0005\bN\u0010\u0080\u0002\u001a\u0006\b¯\u0002\u0010\u009d\u0001R\u001c\u0010P\u001a\u0004\u0018\u00010O8\u0006¢\u0006\u000f\n\u0005\bP\u0010°\u0002\u001a\u0006\b±\u0002\u0010Î\u0001R\u001c\u0010Q\u001a\u0004\u0018\u00010O8\u0006¢\u0006\u000f\n\u0005\bQ\u0010°\u0002\u001a\u0006\b²\u0002\u0010Î\u0001R\u001c\u0010S\u001a\u0004\u0018\u00010R8\u0006¢\u0006\u000f\n\u0005\bS\u0010³\u0002\u001a\u0006\b´\u0002\u0010Ñ\u0001R\"\u0010U\u001a\n\u0012\u0004\u0012\u00020T\u0018\u00010\u00148\u0006¢\u0006\u000f\n\u0005\bU\u0010\u0080\u0002\u001a\u0006\bµ\u0002\u0010\u009d\u0001R\u001a\u0010V\u001a\u00020\u00178\u0006¢\u0006\u000f\n\u0005\bV\u0010\u0082\u0002\u001a\u0006\b¶\u0002\u0010\u009f\u0001R\"\u0010W\u001a\n\u0012\u0004\u0012\u000207\u0018\u00010\u00148\u0006¢\u0006\u000f\n\u0005\bW\u0010\u0080\u0002\u001a\u0006\b·\u0002\u0010\u009d\u0001R\u001a\u0010Y\u001a\u00020X8\u0006¢\u0006\u000f\n\u0005\bY\u0010¸\u0002\u001a\u0006\b¹\u0002\u0010Ö\u0001R\u0019\u0010Z\u001a\u00020\u00178\u0006¢\u0006\u000e\n\u0005\bZ\u0010\u0082\u0002\u001a\u0005\bZ\u0010\u009f\u0001R\u001a\u0010[\u001a\u00020\u00178\u0006¢\u0006\u000f\n\u0005\b[\u0010\u0082\u0002\u001a\u0006\bº\u0002\u0010\u009f\u0001R\u001a\u0010\\\u001a\u00020\u00178\u0006¢\u0006\u000f\n\u0005\b\\\u0010\u0082\u0002\u001a\u0006\b»\u0002\u0010\u009f\u0001R\u001a\u0010]\u001a\u00020\u00178\u0006¢\u0006\u000f\n\u0005\b]\u0010\u0082\u0002\u001a\u0006\b¼\u0002\u0010\u009f\u0001R\u001a\u0010^\u001a\u00020\u00178\u0006¢\u0006\u000f\n\u0005\b^\u0010\u0082\u0002\u001a\u0006\b½\u0002\u0010\u009f\u0001R\u001a\u0010_\u001a\u00020\u00178\u0006¢\u0006\u000f\n\u0005\b_\u0010\u0082\u0002\u001a\u0006\b¾\u0002\u0010\u009f\u0001R\"\u0010`\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00148\u0006¢\u0006\u000f\n\u0005\b`\u0010\u0080\u0002\u001a\u0006\b¿\u0002\u0010\u009d\u0001R\"\u0010b\u001a\n\u0012\u0004\u0012\u00020a\u0018\u00010\u00148\u0006¢\u0006\u000f\n\u0005\bb\u0010\u0080\u0002\u001a\u0006\bÀ\u0002\u0010\u009d\u0001R\u001a\u0010c\u001a\u00020\u00178\u0006¢\u0006\u000f\n\u0005\bc\u0010\u0082\u0002\u001a\u0006\bÁ\u0002\u0010\u009f\u0001R\u0019\u0010d\u001a\u00020\u00178\u0006¢\u0006\u000e\n\u0005\bd\u0010\u0082\u0002\u001a\u0005\bd\u0010\u009f\u0001R\u001a\u0010e\u001a\u00020\u00178\u0006¢\u0006\u000f\n\u0005\be\u0010\u0082\u0002\u001a\u0006\bÂ\u0002\u0010\u009f\u0001R\u001a\u0010f\u001a\u00020\u00178\u0006¢\u0006\u000f\n\u0005\bf\u0010\u0082\u0002\u001a\u0006\bÃ\u0002\u0010\u009f\u0001R\u001a\u0010g\u001a\u00020\u00068\u0006¢\u0006\u000f\n\u0005\bg\u0010Ä\u0002\u001a\u0006\bÅ\u0002\u0010ä\u0001R\u0019\u0010h\u001a\u00020\u00178\u0006¢\u0006\u000e\n\u0005\bh\u0010\u0082\u0002\u001a\u0005\bh\u0010\u009f\u0001R\u0019\u0010i\u001a\u00020\u00178\u0006¢\u0006\u000e\n\u0005\bi\u0010\u0082\u0002\u001a\u0005\bi\u0010\u009f\u0001R\u001c\u0010Æ\u0002\u001a\u0002078\u0006¢\u0006\u0010\n\u0006\bÆ\u0002\u0010Ç\u0002\u001a\u0006\bÈ\u0002\u0010ê\u0001R\u001f\u0010Ê\u0002\u001a\u0005\u0018\u00010É\u00028\u0006¢\u0006\u0010\n\u0006\bÊ\u0002\u0010Ë\u0002\u001a\u0006\bÌ\u0002\u0010Í\u0002R\u001c\u0010Î\u0002\u001a\u00020\u00178\u0006¢\u0006\u0010\n\u0006\bÎ\u0002\u0010\u0082\u0002\u001a\u0006\bÏ\u0002\u0010\u009f\u0001R\u001c\u0010Ð\u0002\u001a\u00020\u00178\u0006¢\u0006\u0010\n\u0006\bÐ\u0002\u0010\u0082\u0002\u001a\u0006\bÐ\u0002\u0010\u009f\u0001R\u001c\u0010Ñ\u0002\u001a\u00020\u00178\u0006¢\u0006\u0010\n\u0006\bÑ\u0002\u0010\u0082\u0002\u001a\u0006\bÒ\u0002\u0010\u009f\u0001R\u001c\u0010Ó\u0002\u001a\u00020\u00178\u0006¢\u0006\u0010\n\u0006\bÓ\u0002\u0010\u0082\u0002\u001a\u0006\bÔ\u0002\u0010\u009f\u0001R\u001c\u0010Õ\u0002\u001a\u00020\u00178\u0006¢\u0006\u0010\n\u0006\bÕ\u0002\u0010\u0082\u0002\u001a\u0006\bÖ\u0002\u0010\u009f\u0001R\u001c\u0010×\u0002\u001a\u00020\u00178\u0006¢\u0006\u0010\n\u0006\b×\u0002\u0010\u0082\u0002\u001a\u0006\bØ\u0002\u0010\u009f\u0001R\u001d\u0010Ú\u0002\u001a\u00030Ù\u00028\u0006¢\u0006\u0010\n\u0006\bÚ\u0002\u0010Û\u0002\u001a\u0006\bÜ\u0002\u0010Ý\u0002R\u001d\u0010ß\u0002\u001a\u00030Þ\u00028\u0006¢\u0006\u0010\n\u0006\bß\u0002\u0010à\u0002\u001a\u0006\bá\u0002\u0010â\u0002R\u001d\u0010ä\u0002\u001a\u00030ã\u00028\u0006¢\u0006\u0010\n\u0006\bä\u0002\u0010å\u0002\u001a\u0006\bæ\u0002\u0010ç\u0002R\u001c\u0010è\u0002\u001a\u00020\u00178\u0006¢\u0006\u0010\n\u0006\bè\u0002\u0010\u0082\u0002\u001a\u0006\bé\u0002\u0010\u009f\u0001R\u001c\u0010ê\u0002\u001a\u00020\u00178\u0006¢\u0006\u0010\n\u0006\bê\u0002\u0010\u0082\u0002\u001a\u0006\bë\u0002\u0010\u009f\u0001R\u001c\u0010ì\u0002\u001a\u00020\u00178\u0006¢\u0006\u0010\n\u0006\bì\u0002\u0010\u0082\u0002\u001a\u0006\bí\u0002\u0010\u009f\u0001R\u001f\u0010ï\u0002\u001a\u0005\u0018\u00010î\u00028\u0006¢\u0006\u0010\n\u0006\bï\u0002\u0010ð\u0002\u001a\u0006\bñ\u0002\u0010ò\u0002R\u001c\u0010ó\u0002\u001a\u0002078\u0006¢\u0006\u0010\n\u0006\bó\u0002\u0010Ç\u0002\u001a\u0006\bô\u0002\u0010ê\u0001R\u001f\u0010ö\u0002\u001a\u0005\u0018\u00010õ\u00028\u0006¢\u0006\u0010\n\u0006\bö\u0002\u0010÷\u0002\u001a\u0006\bø\u0002\u0010ù\u0002R\u001f\u0010û\u0002\u001a\u0005\u0018\u00010ú\u00028\u0006¢\u0006\u0010\n\u0006\bû\u0002\u0010ü\u0002\u001a\u0006\bý\u0002\u0010þ\u0002R\u001e\u0010ÿ\u0002\u001a\u0004\u0018\u00010M8\u0006¢\u0006\u0010\n\u0006\bÿ\u0002\u0010\u0080\u0003\u001a\u0006\b\u0081\u0003\u0010\u0082\u0003R\u001f\u0010\u0084\u0003\u001a\u0005\u0018\u00010\u0083\u00038\u0006¢\u0006\u0010\n\u0006\b\u0084\u0003\u0010\u0085\u0003\u001a\u0006\b\u0086\u0003\u0010\u0087\u0003R\u001c\u0010\u0088\u0003\u001a\u00020\u00178\u0006¢\u0006\u0010\n\u0006\b\u0088\u0003\u0010\u0082\u0002\u001a\u0006\b\u0089\u0003\u0010\u009f\u0001R&\u0010\u008c\u0003\u001a\f\u0012\u0005\u0012\u00030\u008b\u0003\u0018\u00010\u008a\u00038\u0006¢\u0006\u0010\n\u0006\b\u008c\u0003\u0010\u008d\u0003\u001a\u0006\b\u008e\u0003\u0010\u008f\u0003R\u001f\u0010\u0091\u0003\u001a\u0005\u0018\u00010\u0090\u00038\u0006¢\u0006\u0010\n\u0006\b\u0091\u0003\u0010\u0092\u0003\u001a\u0006\b\u0093\u0003\u0010\u0094\u0003R\u0017\u0010\u0095\u0003\u001a\u00020\u00178BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0095\u0003\u0010\u009f\u0001R&\u0010\u0099\u0003\u001a\t\u0012\u0004\u0012\u00020\u00120\u008a\u00038@X\u0081\u0004¢\u0006\u0010\u0012\u0006\b\u0097\u0003\u0010\u0098\u0003\u001a\u0006\b\u0096\u0003\u0010\u008f\u0003R\u001f\u0010\u009c\u0003\u001a\n\u0012\u0005\u0012\u00030\u009a\u00030\u008a\u00038BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u009b\u0003\u0010\u008f\u0003R\"\u0010¡\u0003\u001a\u0005\u0018\u00010\u009d\u00038@X\u0081\u0004¢\u0006\u0010\u0012\u0006\b \u0003\u0010\u0098\u0003\u001a\u0006\b\u009e\u0003\u0010\u009f\u0003R!\u0010¤\u0003\u001a\u0004\u0018\u00010\u00178@X\u0081\u0004¢\u0006\u0010\u0012\u0006\b£\u0003\u0010\u0098\u0003\u001a\u0006\b¢\u0003\u0010©\u0001R\u001f\u0010§\u0003\u001a\u00020\u00178@X\u0081\u0004¢\u0006\u0010\u0012\u0006\b¦\u0003\u0010\u0098\u0003\u001a\u0006\b¥\u0003\u0010\u009f\u0001R\u0017\u0010©\u0003\u001a\u00020\u00178BX\u0082\u0004¢\u0006\b\u001a\u0006\b¨\u0003\u0010\u009f\u0001R\u0014\u0010«\u0003\u001a\u00020\u00178F¢\u0006\b\u001a\u0006\bª\u0003\u0010\u009f\u0001R\u001c\u0010®\u0003\u001a\n\u0012\u0005\u0012\u00030¬\u00030\u008a\u00038F¢\u0006\b\u001a\u0006\b\u00ad\u0003\u0010\u008f\u0003R\u0015\u0010²\u0003\u001a\u00030¯\u00038F¢\u0006\b\u001a\u0006\b°\u0003\u0010±\u0003R\u0015\u0010¶\u0003\u001a\u00030³\u00038F¢\u0006\b\u001a\u0006\b´\u0003\u0010µ\u0003R\u0016\u0010¹\u0003\u001a\u0004\u0018\u00010&8F¢\u0006\b\u001a\u0006\b·\u0003\u0010¸\u0003R\u0016\u0010¼\u0003\u001a\u0004\u0018\u00010\u00128F¢\u0006\b\u001a\u0006\bº\u0003\u0010»\u0003R\u0016\u0010¾\u0003\u001a\u0004\u0018\u00010*8F¢\u0006\b\u001a\u0006\b½\u0003\u0010°\u0001R\u0017\u0010À\u0003\u001a\u0005\u0018\u00010\u009d\u00038F¢\u0006\b\u001a\u0006\b¿\u0003\u0010\u009f\u0003R\u0017\u0010Ä\u0003\u001a\u0005\u0018\u00010Á\u00038F¢\u0006\b\u001a\u0006\bÂ\u0003\u0010Ã\u0003R\u0017\u0010È\u0003\u001a\u0005\u0018\u00010Å\u00038F¢\u0006\b\u001a\u0006\bÆ\u0003\u0010Ç\u0003R\u0017\u0010Ì\u0003\u001a\u0005\u0018\u00010É\u00038F¢\u0006\b\u001a\u0006\bÊ\u0003\u0010Ë\u0003¨\u0006Ô\u0003"}, m3636d2 = {"Lcom/robinhood/android/optionschain/OptionChainViewState;", "", "Lcom/robinhood/models/db/Account;", "account", "Lcom/robinhood/android/optionschain/OptionChainViewState$ChainScrollTarget;", "chainScrollTarget", "", "currentPage", "Lcom/robinhood/models/db/OptionCurrentOrNextMarketDates;", "currentOrNextMarketDates", "j$/time/Instant", "currentSelloutTime", "Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;", "defaultPricingSettingOverride", "defaultPricingSettingServerValue", "Lcom/robinhood/models/db/Instrument;", "equityInstrument", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/options/tradability/expiration/OptionChainExpirationDateState;", "existingPositionExpirationDateStates", "Lcom/robinhood/udf/UiEvent;", "", "fridayTradingErrorEvent", "", "hasMultipleAccounts", "hasSeenSbsChain", "hasSeenSbsChainBottomSheet", "hasSeenTopTooltipBannerInThisSession", "hasSeenChainSettings", "hasSeenSbsNuxRevampChainSettings", "Lcom/robinhood/models/ui/IacAlertSheet;", "iacAlertSheet", "inSideBySideNuxRevampExperiment", "isDay", "isOnboardingSearchSelectorVisible", "Lcom/robinhood/android/options/contracts/OptionChainLaunchMode;", "launchMode", "nuxSearchDismissed", "Lcom/robinhood/models/ui/UiOptionChain;", "uiOptionChains", "Lcom/robinhood/models/db/OptionInstrumentQuote;", "optionInstrumentToRollQuote", "Lcom/robinhood/models/db/OptionOrderFilter;", "optionOrderFilter", "Lcom/robinhood/android/optionschain/OptionChainConfiguration;", "optionChainConfiguration", "Lcom/robinhood/models/db/OptionInstrument;", "rollingExpirationDateEvent", "Lcom/robinhood/models/db/OptionContractType;", "selectedContractType", "Lcom/robinhood/models/db/OrderSide;", "selectedOrderSide", "Lcom/robinhood/models/db/OptionStrategyBuilder;", "optionStrategyBuilder", "", "", "optionStrategyBuilderNuxStates", "Lcom/robinhood/models/ui/OptionChainSettingsPnlChartType;", "optionChainSettingsPnlChartType", "Lcom/robinhood/models/ui/UiOptionStrategyLegDisplay;", "targetExpirationPageFromTargetLegsEvent", "targetExpirationPageFromSbsChainEvent", "Lkotlin/Pair;", "Ljava/math/BigDecimal;", "targetStrikePriceEvent", "Lcom/robinhood/android/optionschain/OptionChainListViewState$ScrollTarget;", "scrollTargetEvent", "Lcom/robinhood/models/api/strategybuilder/StrategyBuilderSentiment;", "selectedSentiment", "Lcom/robinhood/models/db/OptionSettings$TradingOnExpirationState;", "tradeOnExpirationState", "Lcom/robinhood/models/db/Quote;", "underlyingQuote", "Lcom/robinhood/android/indexes/models/db/IndexValue;", "underlyingIndexValue", "Lcom/robinhood/android/indexes/models/db/IndexCloseValue;", "underlyingIndexCloseValue", "Lcom/robinhood/android/optionschain/OptionChainViewState$UpsellHook;", "upsellHookEvent", "Lcom/robinhood/models/db/OptionChainSelectedMetrics;", "buySelectedMetrics", "sellSelectedMetrics", "Lcom/robinhood/models/db/OptionTooltip;", "tooltip", "Lcom/robinhood/android/optionchain/chainsettings/OptionChainCustomizationErrorEvent;", "chainCustomizationErrorEvent", "shouldShowDiscoverZeroDteBottomSheetInCurrentSession", "showDiscoverZeroDteSnackbarEvent", "Lcom/robinhood/android/common/options/upsell/fridaytrading/OptionDiscoverZeroDteSnackbarState;", "discoverZeroDteSnackbarState", "isEtfSupported", "shouldShowMultipleUnderlyingsTooltip", "shouldShowSettleOnOpenTooltip", "shouldShowSwitchFocusedToSbsTooltipPref", "simulatedReturnChartShown", "simulatedReturnSwitchChartTooltipShown", "defaultToNearestExpirationDateEvent", "", "dismissSelloutSnackbarEvent", "selloutSnackbarDismissedOrElapsed", "isSelloutSnackbarDismissalExperimentEnabled", "inSelloutImprovementExperiment", "inSnackbarDismissalFollowUpExperiment", "settingGreenDotRemainingBlinks", "isIndexOptionsExtendedHoursEnabled", "isMemberPdtRevampV1", "<init>", "(Lcom/robinhood/models/db/Account;Lcom/robinhood/android/optionschain/OptionChainViewState$ChainScrollTarget;Ljava/lang/Integer;Lcom/robinhood/models/db/OptionCurrentOrNextMarketDates;Lj$/time/Instant;Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;Lcom/robinhood/models/db/Instrument;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/udf/UiEvent;ZZZZZZLcom/robinhood/models/ui/IacAlertSheet;ZLjava/lang/Boolean;ZLcom/robinhood/android/options/contracts/OptionChainLaunchMode;ZLkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/models/db/OptionInstrumentQuote;Lcom/robinhood/models/db/OptionOrderFilter;Lcom/robinhood/android/optionschain/OptionChainConfiguration;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/models/db/OptionContractType;Lcom/robinhood/models/db/OrderSide;Lcom/robinhood/models/db/OptionStrategyBuilder;Ljava/util/Map;Lcom/robinhood/models/ui/OptionChainSettingsPnlChartType;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/models/api/strategybuilder/StrategyBuilderSentiment;Lcom/robinhood/models/db/OptionSettings$TradingOnExpirationState;Lcom/robinhood/models/db/Quote;Lcom/robinhood/android/indexes/models/db/IndexValue;Lcom/robinhood/android/indexes/models/db/IndexCloseValue;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/models/db/OptionChainSelectedMetrics;Lcom/robinhood/models/db/OptionChainSelectedMetrics;Lcom/robinhood/models/db/OptionTooltip;Lcom/robinhood/udf/UiEvent;ZLcom/robinhood/udf/UiEvent;Lcom/robinhood/android/common/options/upsell/fridaytrading/OptionDiscoverZeroDteSnackbarState;ZZZZZZLcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;ZZZZIZZ)V", "j$/time/Clock", Card.Icon.CLOCK, "isOnTodayTab", "(Lj$/time/Clock;)Z", "expirationDateState", "Lcom/robinhood/models/ui/OptionConfigurationBundle;", "getOptionConfigurationBundleByExpirationDateState", "(Lcom/robinhood/android/options/tradability/expiration/OptionChainExpirationDateState;)Lcom/robinhood/models/ui/OptionConfigurationBundle;", "component24", "()Lcom/robinhood/models/db/OptionInstrumentQuote;", "Lcom/robinhood/android/optionschain/view/OptionChainTooltipBannerType;", "getTopTooltipBannerType", "(Lj$/time/Clock;)Lcom/robinhood/android/optionschain/view/OptionChainTooltipBannerType;", "shouldDismissSelloutSnackbar", "isCurrentPageDisabled$feature_options_chain_externalDebug", "(Lj$/time/Clock;)Ljava/lang/Boolean;", "isCurrentPageDisabled", "Landroid/content/res/Resources;", "resources", "getTitle", "(Landroid/content/res/Resources;)Ljava/lang/String;", "res", "getSubtitle", "Lcom/robinhood/android/optionschain/OptionChainToolbarState;", "getToolbarState", "(Landroid/content/res/Resources;Lj$/time/Clock;)Lcom/robinhood/android/optionschain/OptionChainToolbarState;", "Lcom/robinhood/models/ui/OptionLegBundle;", "legs", "Lcom/robinhood/android/options/contracts/OptionOrderIntentKey$FromOptionOrderBundle;", "getOptionOrderIntentKey", "(Lkotlinx/collections/immutable/ImmutableList;)Lcom/robinhood/android/options/contracts/OptionOrderIntentKey$FromOptionOrderBundle;", "component1", "()Lcom/robinhood/models/db/Account;", "component2", "()Lcom/robinhood/android/optionschain/OptionChainViewState$ChainScrollTarget;", "component3", "()Ljava/lang/Integer;", "component4", "()Lcom/robinhood/models/db/OptionCurrentOrNextMarketDates;", "component5", "()Lj$/time/Instant;", "component6", "()Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;", "component7", "component8", "()Lcom/robinhood/models/db/Instrument;", "component9", "()Lkotlinx/collections/immutable/ImmutableList;", "component10", "()Lcom/robinhood/udf/UiEvent;", "component11", "()Z", "component12", "component13", "component14", "component15", "component16", "component17", "()Lcom/robinhood/models/ui/IacAlertSheet;", "component18", "component19", "()Ljava/lang/Boolean;", "component20", "component21", "()Lcom/robinhood/android/options/contracts/OptionChainLaunchMode;", "component22", "component23", "component25", "()Lcom/robinhood/models/db/OptionOrderFilter;", "component26", "()Lcom/robinhood/android/optionschain/OptionChainConfiguration;", "component27", "component28", "()Lcom/robinhood/models/db/OptionContractType;", "component29", "()Lcom/robinhood/models/db/OrderSide;", "component30", "()Lcom/robinhood/models/db/OptionStrategyBuilder;", "component31", "()Ljava/util/Map;", "component32", "()Lcom/robinhood/models/ui/OptionChainSettingsPnlChartType;", "component33", "component34", "component35", "component36", "component37", "()Lcom/robinhood/models/api/strategybuilder/StrategyBuilderSentiment;", "component38", "()Lcom/robinhood/models/db/OptionSettings$TradingOnExpirationState;", "component39", "()Lcom/robinhood/models/db/Quote;", "component40", "()Lcom/robinhood/android/indexes/models/db/IndexValue;", "component41", "()Lcom/robinhood/android/indexes/models/db/IndexCloseValue;", "component42", "component43", "()Lcom/robinhood/models/db/OptionChainSelectedMetrics;", "component44", "component45", "()Lcom/robinhood/models/db/OptionTooltip;", "component46", "component47", "component48", "component49", "()Lcom/robinhood/android/common/options/upsell/fridaytrading/OptionDiscoverZeroDteSnackbarState;", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "component57", "component58", "component59", "component60", "component61", "component62", "()I", "component63", "component64", "copy", "(Lcom/robinhood/models/db/Account;Lcom/robinhood/android/optionschain/OptionChainViewState$ChainScrollTarget;Ljava/lang/Integer;Lcom/robinhood/models/db/OptionCurrentOrNextMarketDates;Lj$/time/Instant;Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;Lcom/robinhood/models/db/Instrument;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/udf/UiEvent;ZZZZZZLcom/robinhood/models/ui/IacAlertSheet;ZLjava/lang/Boolean;ZLcom/robinhood/android/options/contracts/OptionChainLaunchMode;ZLkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/models/db/OptionInstrumentQuote;Lcom/robinhood/models/db/OptionOrderFilter;Lcom/robinhood/android/optionschain/OptionChainConfiguration;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/models/db/OptionContractType;Lcom/robinhood/models/db/OrderSide;Lcom/robinhood/models/db/OptionStrategyBuilder;Ljava/util/Map;Lcom/robinhood/models/ui/OptionChainSettingsPnlChartType;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/models/api/strategybuilder/StrategyBuilderSentiment;Lcom/robinhood/models/db/OptionSettings$TradingOnExpirationState;Lcom/robinhood/models/db/Quote;Lcom/robinhood/android/indexes/models/db/IndexValue;Lcom/robinhood/android/indexes/models/db/IndexCloseValue;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/models/db/OptionChainSelectedMetrics;Lcom/robinhood/models/db/OptionChainSelectedMetrics;Lcom/robinhood/models/db/OptionTooltip;Lcom/robinhood/udf/UiEvent;ZLcom/robinhood/udf/UiEvent;Lcom/robinhood/android/common/options/upsell/fridaytrading/OptionDiscoverZeroDteSnackbarState;ZZZZZZLcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;ZZZZIZZ)Lcom/robinhood/android/optionschain/OptionChainViewState;", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/models/db/Account;", "getAccount", "Lcom/robinhood/android/optionschain/OptionChainViewState$ChainScrollTarget;", "getChainScrollTarget", "Ljava/lang/Integer;", "getCurrentPage", "Lcom/robinhood/models/db/OptionCurrentOrNextMarketDates;", "getCurrentOrNextMarketDates", "Lj$/time/Instant;", "getCurrentSelloutTime", "Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;", "getDefaultPricingSettingOverride", "getDefaultPricingSettingServerValue", "Lcom/robinhood/models/db/Instrument;", "getEquityInstrument", "Lkotlinx/collections/immutable/ImmutableList;", "getExistingPositionExpirationDateStates", "Lcom/robinhood/udf/UiEvent;", "getFridayTradingErrorEvent", "Z", "getHasMultipleAccounts", "getHasSeenSbsChain", "getHasSeenSbsChainBottomSheet", "getHasSeenTopTooltipBannerInThisSession", "getHasSeenChainSettings", "getHasSeenSbsNuxRevampChainSettings", "Lcom/robinhood/models/ui/IacAlertSheet;", "getIacAlertSheet", "getInSideBySideNuxRevampExperiment", "Ljava/lang/Boolean;", "Lcom/robinhood/android/options/contracts/OptionChainLaunchMode;", "getLaunchMode", "getNuxSearchDismissed", "getUiOptionChains", "Lcom/robinhood/models/db/OptionInstrumentQuote;", "Lcom/robinhood/models/db/OptionOrderFilter;", "getOptionOrderFilter", "Lcom/robinhood/android/optionschain/OptionChainConfiguration;", "getOptionChainConfiguration", "getRollingExpirationDateEvent", "Lcom/robinhood/models/db/OptionContractType;", "getSelectedContractType", "Lcom/robinhood/models/db/OrderSide;", "getSelectedOrderSide", "Lcom/robinhood/models/db/OptionStrategyBuilder;", "getOptionStrategyBuilder", "Ljava/util/Map;", "getOptionStrategyBuilderNuxStates", "Lcom/robinhood/models/ui/OptionChainSettingsPnlChartType;", "getOptionChainSettingsPnlChartType", "getTargetExpirationPageFromTargetLegsEvent", "getTargetExpirationPageFromSbsChainEvent", "getTargetStrikePriceEvent", "getScrollTargetEvent", "Lcom/robinhood/models/api/strategybuilder/StrategyBuilderSentiment;", "getSelectedSentiment", "Lcom/robinhood/models/db/OptionSettings$TradingOnExpirationState;", "getTradeOnExpirationState", "Lcom/robinhood/models/db/Quote;", "getUnderlyingQuote", "Lcom/robinhood/android/indexes/models/db/IndexValue;", "getUnderlyingIndexValue", "Lcom/robinhood/android/indexes/models/db/IndexCloseValue;", "getUnderlyingIndexCloseValue", "getUpsellHookEvent", "Lcom/robinhood/models/db/OptionChainSelectedMetrics;", "getBuySelectedMetrics", "getSellSelectedMetrics", "Lcom/robinhood/models/db/OptionTooltip;", "getTooltip", "getChainCustomizationErrorEvent", "getShouldShowDiscoverZeroDteBottomSheetInCurrentSession", "getShowDiscoverZeroDteSnackbarEvent", "Lcom/robinhood/android/common/options/upsell/fridaytrading/OptionDiscoverZeroDteSnackbarState;", "getDiscoverZeroDteSnackbarState", "getShouldShowMultipleUnderlyingsTooltip", "getShouldShowSettleOnOpenTooltip", "getShouldShowSwitchFocusedToSbsTooltipPref", "getSimulatedReturnChartShown", "getSimulatedReturnSwitchChartTooltipShown", "getDefaultToNearestExpirationDateEvent", "getDismissSelloutSnackbarEvent", "getSelloutSnackbarDismissedOrElapsed", "getInSelloutImprovementExperiment", "getInSnackbarDismissalFollowUpExperiment", "I", "getSettingGreenDotRemainingBlinks", "optionChainSymbolForLogging", "Ljava/lang/String;", "getOptionChainSymbolForLogging", "Ljava/util/UUID;", "optionChainIdForLogging", "Ljava/util/UUID;", "getOptionChainIdForLogging", "()Ljava/util/UUID;", "showBuilder", "getShowBuilder", "isOnBuilderPage", "showOptionChainCustomizationGtmIacAlertSheet", "getShowOptionChainCustomizationGtmIacAlertSheet", "showNormalIacAlertSheet", "getShowNormalIacAlertSheet", "shouldShowChainSettings", "getShouldShowChainSettings", "multilegAvailable", "getMultilegAvailable", "Lcom/robinhood/android/optionschain/OptionChainViewState$MultilegSelectionState;", "multilegSelectionState", "Lcom/robinhood/android/optionschain/OptionChainViewState$MultilegSelectionState;", "getMultilegSelectionState", "()Lcom/robinhood/android/optionschain/OptionChainViewState$MultilegSelectionState;", "Lcom/robinhood/android/common/options/OptionDefaultPricingState;", "defaultPricingState", "Lcom/robinhood/android/common/options/OptionDefaultPricingState;", "getDefaultPricingState", "()Lcom/robinhood/android/common/options/OptionDefaultPricingState;", "Lcom/robinhood/android/optionschain/OptionChainSettingsIcon;", "chainSettingsIcon", "Lcom/robinhood/android/optionschain/OptionChainSettingsIcon;", "getChainSettingsIcon", "()Lcom/robinhood/android/optionschain/OptionChainSettingsIcon;", "shouldShowSimulatedReturnSwitchChartTooltip", "getShouldShowSimulatedReturnSwitchChartTooltip", "shouldEmitChainCustomizationEvent", "getShouldEmitChainCustomizationEvent", "shouldShowShoppingCart", "getShouldShowShoppingCart", "Lcom/robinhood/scarlet/ScarletOverlay;", "scarletOverlay", "Lcom/robinhood/scarlet/ScarletOverlay;", "getScarletOverlay", "()Lcom/robinhood/scarlet/ScarletOverlay;", "optionOrderFilterKey", "getOptionOrderFilterKey", "Lcom/robinhood/android/optionchain/tooltips/IndexOptionsTooltip;", "indexOptionsTooltip", "Lcom/robinhood/android/optionchain/tooltips/IndexOptionsTooltip;", "getIndexOptionsTooltip", "()Lcom/robinhood/android/optionchain/tooltips/IndexOptionsTooltip;", "Lcom/robinhood/android/optionchain/tooltips/SwitchFocusedToSbsTooltip;", "showSwitchFocusedToSbsTooltip", "Lcom/robinhood/android/optionchain/tooltips/SwitchFocusedToSbsTooltip;", "getShowSwitchFocusedToSbsTooltip", "()Lcom/robinhood/android/optionchain/tooltips/SwitchFocusedToSbsTooltip;", "upsellType", "Lcom/robinhood/android/optionschain/OptionChainViewState$UpsellHook;", "getUpsellType", "()Lcom/robinhood/android/optionschain/OptionChainViewState$UpsellHook;", "Lcom/robinhood/android/optionschain/rolling/OptionChainRollingHeaderView$RollingHeaderData;", "rollingHeaderData", "Lcom/robinhood/android/optionschain/rolling/OptionChainRollingHeaderView$RollingHeaderData;", "getRollingHeaderData", "()Lcom/robinhood/android/optionschain/rolling/OptionChainRollingHeaderView$RollingHeaderData;", "shouldShowRollingHeaderView", "getShouldShowRollingHeaderView", "", "Lcom/robinhood/android/optionschain/strategybuilder/BuilderData;", "optionStrategyBuilderData", "Ljava/util/List;", "getOptionStrategyBuilderData", "()Ljava/util/List;", "Lcom/robinhood/android/optionschain/OptionStrategyBuilderView$AdditionalCardData;", "additionalCardData", "Lcom/robinhood/android/optionschain/OptionStrategyBuilderView$AdditionalCardData;", "getAdditionalCardData", "()Lcom/robinhood/android/optionschain/OptionStrategyBuilderView$AdditionalCardData;", "isMultipleChain", "getAdjustedExpirationDateStates$feature_options_chain_externalDebug", "getAdjustedExpirationDateStates$feature_options_chain_externalDebug$annotations", "()V", "adjustedExpirationDateStates", "Lcom/robinhood/librobinhood/data/store/OptionChainPageState;", "getOptionChainLandingTabDataStates", "optionChainLandingTabDataStates", "j$/time/LocalDate", "getCurrentOrNextMarketDateForSelectedExpDate$feature_options_chain_externalDebug", "()Lj$/time/LocalDate;", "getCurrentOrNextMarketDateForSelectedExpDate$feature_options_chain_externalDebug$annotations", "currentOrNextMarketDateForSelectedExpDate", "getDiscoverZeroDteSelloutTimeCheck$feature_options_chain_externalDebug", "getDiscoverZeroDteSelloutTimeCheck$feature_options_chain_externalDebug$annotations", "discoverZeroDteSelloutTimeCheck", "isOnCurrentOrNextMarketDayExpirationPage$feature_options_chain_externalDebug", "isOnCurrentOrNextMarketDayExpirationPage$feature_options_chain_externalDebug$annotations", "isOnCurrentOrNextMarketDayExpirationPage", "getShouldBlinkNuxDotOnSettingsIcon", "shouldBlinkNuxDotOnSettingsIcon", "getShouldIgnoreDefaultPricing", "shouldIgnoreDefaultPricing", "Lcom/robinhood/android/optionschain/OptionChainViewState$OptionChainPage;", "getOptionChainPages", "optionChainPages", "Lcom/robinhood/librobinhood/data/store/OptionChainLandingPageUnderlyingState;", "getOptionChainLandingPageUnderlyingState", "()Lcom/robinhood/librobinhood/data/store/OptionChainLandingPageUnderlyingState;", "optionChainLandingPageUnderlyingState", "Lcom/robinhood/android/optionschain/OptionChainPagesWithScrollEvents;", "getOptionChainPagesWithScrollEvents", "()Lcom/robinhood/android/optionschain/OptionChainPagesWithScrollEvents;", "optionChainPagesWithScrollEvents", "getSelectedUiOptionChain", "()Lcom/robinhood/models/ui/UiOptionChain;", "selectedUiOptionChain", "getSelectedOptionChainExpirationDateState", "()Lcom/robinhood/android/options/tradability/expiration/OptionChainExpirationDateState;", "selectedOptionChainExpirationDateState", "getSelectedOptionOrderFilter", "selectedOptionOrderFilter", "getCurrentExpirationDate", "currentExpirationDate", "Lcom/robinhood/android/optionschain/OptionChainViewState$CurrentSelloutTimeQueryParams;", "getCurrentSelloutTimeQueryParams", "()Lcom/robinhood/android/optionschain/OptionChainViewState$CurrentSelloutTimeQueryParams;", "currentSelloutTimeQueryParams", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "getOptionChainSettingsFragmentKey", "()Lcom/robinhood/android/navigation/keys/FragmentKey;", "optionChainSettingsFragmentKey", "Lcom/robinhood/android/optionschain/OptionChainViewState$ShoppingCartConfigData;", "getShoppingCartConfigData", "()Lcom/robinhood/android/optionschain/OptionChainViewState$ShoppingCartConfigData;", "shoppingCartConfigData", "CurrentSelloutTimeQueryParams", "ExtendedOptionStrategyBuilderData", "ShoppingCartConfigData", "OptionChainPage", "ChainScrollTarget", "MultilegSelectionState", "UpsellHook", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final /* data */ class OptionChainViewState {
    public static final int $stable = 8;
    private final Account account;
    private final OptionStrategyBuilderView.AdditionalCardData additionalCardData;
    private final OptionChainSelectedMetrics buySelectedMetrics;
    private final UiEvent<OptionChainCustomizationErrorEvent> chainCustomizationErrorEvent;
    private final ChainScrollTarget chainScrollTarget;
    private final OptionChainViewState3 chainSettingsIcon;
    private final OptionCurrentOrNextMarketDates currentOrNextMarketDates;
    private final Integer currentPage;
    private final Instant currentSelloutTime;
    private final OptionSettings.DefaultPricingSetting defaultPricingSettingOverride;
    private final OptionSettings.DefaultPricingSetting defaultPricingSettingServerValue;
    private final OptionDefaultPricingState defaultPricingState;
    private final UiEvent<Integer> defaultToNearestExpirationDateEvent;
    private final OptionDiscoverZeroDteSnackbarState discoverZeroDteSnackbarState;
    private final UiEvent<Unit> dismissSelloutSnackbarEvent;
    private final Instrument equityInstrument;
    private final ImmutableList<OptionChainExpirationDateState> existingPositionExpirationDateStates;
    private final UiEvent<Throwable> fridayTradingErrorEvent;
    private final boolean hasMultipleAccounts;
    private final boolean hasSeenChainSettings;
    private final boolean hasSeenSbsChain;
    private final boolean hasSeenSbsChainBottomSheet;
    private final boolean hasSeenSbsNuxRevampChainSettings;
    private final boolean hasSeenTopTooltipBannerInThisSession;
    private final IacAlertSheet iacAlertSheet;
    private final boolean inSelloutImprovementExperiment;
    private final boolean inSideBySideNuxRevampExperiment;
    private final boolean inSnackbarDismissalFollowUpExperiment;
    private final IndexOptionsTooltip indexOptionsTooltip;
    private final Boolean isDay;
    private final boolean isEtfSupported;
    private final boolean isIndexOptionsExtendedHoursEnabled;
    private final boolean isMemberPdtRevampV1;
    private final boolean isOnBuilderPage;
    private final boolean isOnboardingSearchSelectorVisible;
    private final boolean isSelloutSnackbarDismissalExperimentEnabled;
    private final OptionChainLaunchMode launchMode;
    private final boolean multilegAvailable;
    private final MultilegSelectionState multilegSelectionState;
    private final boolean nuxSearchDismissed;
    private final OptionChainConfiguration optionChainConfiguration;
    private final UUID optionChainIdForLogging;
    private final OptionChainSettingsPnlChartType optionChainSettingsPnlChartType;
    private final String optionChainSymbolForLogging;
    private final OptionInstrumentQuote optionInstrumentToRollQuote;
    private final OptionOrderFilter optionOrderFilter;
    private final String optionOrderFilterKey;
    private final OptionStrategyBuilder optionStrategyBuilder;
    private final List<OptionStrategyBuilderAdapter2> optionStrategyBuilderData;
    private final Map<String, Boolean> optionStrategyBuilderNuxStates;
    private final UiEvent<OptionInstrument> rollingExpirationDateEvent;
    private final OptionChainRollingHeaderView.RollingHeaderData rollingHeaderData;
    private final ScarletOverlay scarletOverlay;
    private final UiEvent<OptionChainListViewState.ScrollTarget> scrollTargetEvent;
    private final OptionContractType selectedContractType;
    private final OrderSide selectedOrderSide;
    private final StrategyBuilderSentiment selectedSentiment;
    private final OptionChainSelectedMetrics sellSelectedMetrics;
    private final boolean selloutSnackbarDismissedOrElapsed;
    private final int settingGreenDotRemainingBlinks;
    private final boolean shouldEmitChainCustomizationEvent;
    private final boolean shouldShowChainSettings;
    private final boolean shouldShowDiscoverZeroDteBottomSheetInCurrentSession;
    private final boolean shouldShowMultipleUnderlyingsTooltip;
    private final boolean shouldShowRollingHeaderView;
    private final boolean shouldShowSettleOnOpenTooltip;
    private final boolean shouldShowShoppingCart;
    private final boolean shouldShowSimulatedReturnSwitchChartTooltip;
    private final boolean shouldShowSwitchFocusedToSbsTooltipPref;
    private final boolean showBuilder;
    private final UiEvent<String> showDiscoverZeroDteSnackbarEvent;
    private final boolean showNormalIacAlertSheet;
    private final boolean showOptionChainCustomizationGtmIacAlertSheet;
    private final SwitchFocusedToSbsTooltip showSwitchFocusedToSbsTooltip;
    private final boolean simulatedReturnChartShown;
    private final boolean simulatedReturnSwitchChartTooltipShown;
    private final UiEvent<OptionChainExpirationDateState> targetExpirationPageFromSbsChainEvent;
    private final UiEvent<ImmutableList<UiOptionStrategyLegDisplay>> targetExpirationPageFromTargetLegsEvent;
    private final UiEvent<Tuples2<BigDecimal, Integer>> targetStrikePriceEvent;
    private final OptionTooltip tooltip;
    private final OptionSettings.TradingOnExpirationState tradeOnExpirationState;
    private final ImmutableList<UiOptionChain> uiOptionChains;
    private final IndexCloseValue underlyingIndexCloseValue;
    private final IndexValue underlyingIndexValue;
    private final Quote underlyingQuote;
    private final UiEvent<UpsellHook> upsellHookEvent;
    private final UpsellHook upsellType;

    /* compiled from: OptionChainViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OptionChain.UnderlyingType.values().length];
            try {
                iArr[OptionChain.UnderlyingType.INDEX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionChain.UnderlyingType.EQUITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: component24, reason: from getter */
    private final OptionInstrumentQuote getOptionInstrumentToRollQuote() {
        return this.optionInstrumentToRollQuote;
    }

    /* renamed from: getAdjustedExpirationDateStates$feature_options_chain_externalDebug$annotations */
    public static /* synthetic */ void m2301xdfc1489f() {
    }

    /* renamed from: getCurrentOrNextMarketDateForSelectedExpDate$feature_options_chain_externalDebug$annotations */
    public static /* synthetic */ void m2302x6ad8266() {
    }

    /* renamed from: getDiscoverZeroDteSelloutTimeCheck$feature_options_chain_externalDebug$annotations */
    public static /* synthetic */ void m2303x943c57e9() {
    }

    /* renamed from: isOnCurrentOrNextMarketDayExpirationPage$feature_options_chain_externalDebug$annotations */
    public static /* synthetic */ void m2304x6b92c3f4() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence optionChainSymbolForLogging$lambda$1(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it;
    }

    /* renamed from: component1, reason: from getter */
    public final Account getAccount() {
        return this.account;
    }

    public final UiEvent<Throwable> component10() {
        return this.fridayTradingErrorEvent;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getHasMultipleAccounts() {
        return this.hasMultipleAccounts;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getHasSeenSbsChain() {
        return this.hasSeenSbsChain;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getHasSeenSbsChainBottomSheet() {
        return this.hasSeenSbsChainBottomSheet;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getHasSeenTopTooltipBannerInThisSession() {
        return this.hasSeenTopTooltipBannerInThisSession;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getHasSeenChainSettings() {
        return this.hasSeenChainSettings;
    }

    /* renamed from: component16, reason: from getter */
    public final boolean getHasSeenSbsNuxRevampChainSettings() {
        return this.hasSeenSbsNuxRevampChainSettings;
    }

    /* renamed from: component17, reason: from getter */
    public final IacAlertSheet getIacAlertSheet() {
        return this.iacAlertSheet;
    }

    /* renamed from: component18, reason: from getter */
    public final boolean getInSideBySideNuxRevampExperiment() {
        return this.inSideBySideNuxRevampExperiment;
    }

    /* renamed from: component19, reason: from getter */
    public final Boolean getIsDay() {
        return this.isDay;
    }

    /* renamed from: component2, reason: from getter */
    public final ChainScrollTarget getChainScrollTarget() {
        return this.chainScrollTarget;
    }

    /* renamed from: component20, reason: from getter */
    public final boolean getIsOnboardingSearchSelectorVisible() {
        return this.isOnboardingSearchSelectorVisible;
    }

    /* renamed from: component21, reason: from getter */
    public final OptionChainLaunchMode getLaunchMode() {
        return this.launchMode;
    }

    /* renamed from: component22, reason: from getter */
    public final boolean getNuxSearchDismissed() {
        return this.nuxSearchDismissed;
    }

    public final ImmutableList<UiOptionChain> component23() {
        return this.uiOptionChains;
    }

    /* renamed from: component25, reason: from getter */
    public final OptionOrderFilter getOptionOrderFilter() {
        return this.optionOrderFilter;
    }

    /* renamed from: component26, reason: from getter */
    public final OptionChainConfiguration getOptionChainConfiguration() {
        return this.optionChainConfiguration;
    }

    public final UiEvent<OptionInstrument> component27() {
        return this.rollingExpirationDateEvent;
    }

    /* renamed from: component28, reason: from getter */
    public final OptionContractType getSelectedContractType() {
        return this.selectedContractType;
    }

    /* renamed from: component29, reason: from getter */
    public final OrderSide getSelectedOrderSide() {
        return this.selectedOrderSide;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getCurrentPage() {
        return this.currentPage;
    }

    /* renamed from: component30, reason: from getter */
    public final OptionStrategyBuilder getOptionStrategyBuilder() {
        return this.optionStrategyBuilder;
    }

    public final Map<String, Boolean> component31() {
        return this.optionStrategyBuilderNuxStates;
    }

    /* renamed from: component32, reason: from getter */
    public final OptionChainSettingsPnlChartType getOptionChainSettingsPnlChartType() {
        return this.optionChainSettingsPnlChartType;
    }

    public final UiEvent<ImmutableList<UiOptionStrategyLegDisplay>> component33() {
        return this.targetExpirationPageFromTargetLegsEvent;
    }

    public final UiEvent<OptionChainExpirationDateState> component34() {
        return this.targetExpirationPageFromSbsChainEvent;
    }

    public final UiEvent<Tuples2<BigDecimal, Integer>> component35() {
        return this.targetStrikePriceEvent;
    }

    public final UiEvent<OptionChainListViewState.ScrollTarget> component36() {
        return this.scrollTargetEvent;
    }

    /* renamed from: component37, reason: from getter */
    public final StrategyBuilderSentiment getSelectedSentiment() {
        return this.selectedSentiment;
    }

    /* renamed from: component38, reason: from getter */
    public final OptionSettings.TradingOnExpirationState getTradeOnExpirationState() {
        return this.tradeOnExpirationState;
    }

    /* renamed from: component39, reason: from getter */
    public final Quote getUnderlyingQuote() {
        return this.underlyingQuote;
    }

    /* renamed from: component4, reason: from getter */
    public final OptionCurrentOrNextMarketDates getCurrentOrNextMarketDates() {
        return this.currentOrNextMarketDates;
    }

    /* renamed from: component40, reason: from getter */
    public final IndexValue getUnderlyingIndexValue() {
        return this.underlyingIndexValue;
    }

    /* renamed from: component41, reason: from getter */
    public final IndexCloseValue getUnderlyingIndexCloseValue() {
        return this.underlyingIndexCloseValue;
    }

    public final UiEvent<UpsellHook> component42() {
        return this.upsellHookEvent;
    }

    /* renamed from: component43, reason: from getter */
    public final OptionChainSelectedMetrics getBuySelectedMetrics() {
        return this.buySelectedMetrics;
    }

    /* renamed from: component44, reason: from getter */
    public final OptionChainSelectedMetrics getSellSelectedMetrics() {
        return this.sellSelectedMetrics;
    }

    /* renamed from: component45, reason: from getter */
    public final OptionTooltip getTooltip() {
        return this.tooltip;
    }

    public final UiEvent<OptionChainCustomizationErrorEvent> component46() {
        return this.chainCustomizationErrorEvent;
    }

    /* renamed from: component47, reason: from getter */
    public final boolean getShouldShowDiscoverZeroDteBottomSheetInCurrentSession() {
        return this.shouldShowDiscoverZeroDteBottomSheetInCurrentSession;
    }

    public final UiEvent<String> component48() {
        return this.showDiscoverZeroDteSnackbarEvent;
    }

    /* renamed from: component49, reason: from getter */
    public final OptionDiscoverZeroDteSnackbarState getDiscoverZeroDteSnackbarState() {
        return this.discoverZeroDteSnackbarState;
    }

    /* renamed from: component5, reason: from getter */
    public final Instant getCurrentSelloutTime() {
        return this.currentSelloutTime;
    }

    /* renamed from: component50, reason: from getter */
    public final boolean getIsEtfSupported() {
        return this.isEtfSupported;
    }

    /* renamed from: component51, reason: from getter */
    public final boolean getShouldShowMultipleUnderlyingsTooltip() {
        return this.shouldShowMultipleUnderlyingsTooltip;
    }

    /* renamed from: component52, reason: from getter */
    public final boolean getShouldShowSettleOnOpenTooltip() {
        return this.shouldShowSettleOnOpenTooltip;
    }

    /* renamed from: component53, reason: from getter */
    public final boolean getShouldShowSwitchFocusedToSbsTooltipPref() {
        return this.shouldShowSwitchFocusedToSbsTooltipPref;
    }

    /* renamed from: component54, reason: from getter */
    public final boolean getSimulatedReturnChartShown() {
        return this.simulatedReturnChartShown;
    }

    /* renamed from: component55, reason: from getter */
    public final boolean getSimulatedReturnSwitchChartTooltipShown() {
        return this.simulatedReturnSwitchChartTooltipShown;
    }

    public final UiEvent<Integer> component56() {
        return this.defaultToNearestExpirationDateEvent;
    }

    public final UiEvent<Unit> component57() {
        return this.dismissSelloutSnackbarEvent;
    }

    /* renamed from: component58, reason: from getter */
    public final boolean getSelloutSnackbarDismissedOrElapsed() {
        return this.selloutSnackbarDismissedOrElapsed;
    }

    /* renamed from: component59, reason: from getter */
    public final boolean getIsSelloutSnackbarDismissalExperimentEnabled() {
        return this.isSelloutSnackbarDismissalExperimentEnabled;
    }

    /* renamed from: component6, reason: from getter */
    public final OptionSettings.DefaultPricingSetting getDefaultPricingSettingOverride() {
        return this.defaultPricingSettingOverride;
    }

    /* renamed from: component60, reason: from getter */
    public final boolean getInSelloutImprovementExperiment() {
        return this.inSelloutImprovementExperiment;
    }

    /* renamed from: component61, reason: from getter */
    public final boolean getInSnackbarDismissalFollowUpExperiment() {
        return this.inSnackbarDismissalFollowUpExperiment;
    }

    /* renamed from: component62, reason: from getter */
    public final int getSettingGreenDotRemainingBlinks() {
        return this.settingGreenDotRemainingBlinks;
    }

    /* renamed from: component63, reason: from getter */
    public final boolean getIsIndexOptionsExtendedHoursEnabled() {
        return this.isIndexOptionsExtendedHoursEnabled;
    }

    /* renamed from: component64, reason: from getter */
    public final boolean getIsMemberPdtRevampV1() {
        return this.isMemberPdtRevampV1;
    }

    /* renamed from: component7, reason: from getter */
    public final OptionSettings.DefaultPricingSetting getDefaultPricingSettingServerValue() {
        return this.defaultPricingSettingServerValue;
    }

    /* renamed from: component8, reason: from getter */
    public final Instrument getEquityInstrument() {
        return this.equityInstrument;
    }

    public final ImmutableList<OptionChainExpirationDateState> component9() {
        return this.existingPositionExpirationDateStates;
    }

    public final OptionChainViewState copy(Account account, ChainScrollTarget chainScrollTarget, Integer currentPage, OptionCurrentOrNextMarketDates currentOrNextMarketDates, Instant currentSelloutTime, OptionSettings.DefaultPricingSetting defaultPricingSettingOverride, OptionSettings.DefaultPricingSetting defaultPricingSettingServerValue, Instrument equityInstrument, ImmutableList<OptionChainExpirationDateState> existingPositionExpirationDateStates, UiEvent<Throwable> fridayTradingErrorEvent, boolean hasMultipleAccounts, boolean hasSeenSbsChain, boolean hasSeenSbsChainBottomSheet, boolean hasSeenTopTooltipBannerInThisSession, boolean hasSeenChainSettings, boolean hasSeenSbsNuxRevampChainSettings, IacAlertSheet iacAlertSheet, boolean inSideBySideNuxRevampExperiment, Boolean isDay, boolean isOnboardingSearchSelectorVisible, OptionChainLaunchMode launchMode, boolean nuxSearchDismissed, ImmutableList<UiOptionChain> uiOptionChains, OptionInstrumentQuote optionInstrumentToRollQuote, OptionOrderFilter optionOrderFilter, OptionChainConfiguration optionChainConfiguration, UiEvent<OptionInstrument> rollingExpirationDateEvent, OptionContractType selectedContractType, OrderSide selectedOrderSide, OptionStrategyBuilder optionStrategyBuilder, Map<String, Boolean> optionStrategyBuilderNuxStates, OptionChainSettingsPnlChartType optionChainSettingsPnlChartType, UiEvent<ImmutableList<UiOptionStrategyLegDisplay>> targetExpirationPageFromTargetLegsEvent, UiEvent<OptionChainExpirationDateState> targetExpirationPageFromSbsChainEvent, UiEvent<Tuples2<BigDecimal, Integer>> targetStrikePriceEvent, UiEvent<OptionChainListViewState.ScrollTarget> scrollTargetEvent, StrategyBuilderSentiment selectedSentiment, OptionSettings.TradingOnExpirationState tradeOnExpirationState, Quote underlyingQuote, IndexValue underlyingIndexValue, IndexCloseValue underlyingIndexCloseValue, UiEvent<UpsellHook> upsellHookEvent, OptionChainSelectedMetrics buySelectedMetrics, OptionChainSelectedMetrics sellSelectedMetrics, OptionTooltip tooltip, UiEvent<OptionChainCustomizationErrorEvent> chainCustomizationErrorEvent, boolean shouldShowDiscoverZeroDteBottomSheetInCurrentSession, UiEvent<String> showDiscoverZeroDteSnackbarEvent, OptionDiscoverZeroDteSnackbarState discoverZeroDteSnackbarState, boolean isEtfSupported, boolean shouldShowMultipleUnderlyingsTooltip, boolean shouldShowSettleOnOpenTooltip, boolean shouldShowSwitchFocusedToSbsTooltipPref, boolean simulatedReturnChartShown, boolean simulatedReturnSwitchChartTooltipShown, UiEvent<Integer> defaultToNearestExpirationDateEvent, UiEvent<Unit> dismissSelloutSnackbarEvent, boolean selloutSnackbarDismissedOrElapsed, boolean isSelloutSnackbarDismissalExperimentEnabled, boolean inSelloutImprovementExperiment, boolean inSnackbarDismissalFollowUpExperiment, int settingGreenDotRemainingBlinks, boolean isIndexOptionsExtendedHoursEnabled, boolean isMemberPdtRevampV1) {
        Intrinsics.checkNotNullParameter(existingPositionExpirationDateStates, "existingPositionExpirationDateStates");
        Intrinsics.checkNotNullParameter(launchMode, "launchMode");
        Intrinsics.checkNotNullParameter(uiOptionChains, "uiOptionChains");
        Intrinsics.checkNotNullParameter(optionChainConfiguration, "optionChainConfiguration");
        Intrinsics.checkNotNullParameter(tradeOnExpirationState, "tradeOnExpirationState");
        Intrinsics.checkNotNullParameter(discoverZeroDteSnackbarState, "discoverZeroDteSnackbarState");
        return new OptionChainViewState(account, chainScrollTarget, currentPage, currentOrNextMarketDates, currentSelloutTime, defaultPricingSettingOverride, defaultPricingSettingServerValue, equityInstrument, existingPositionExpirationDateStates, fridayTradingErrorEvent, hasMultipleAccounts, hasSeenSbsChain, hasSeenSbsChainBottomSheet, hasSeenTopTooltipBannerInThisSession, hasSeenChainSettings, hasSeenSbsNuxRevampChainSettings, iacAlertSheet, inSideBySideNuxRevampExperiment, isDay, isOnboardingSearchSelectorVisible, launchMode, nuxSearchDismissed, uiOptionChains, optionInstrumentToRollQuote, optionOrderFilter, optionChainConfiguration, rollingExpirationDateEvent, selectedContractType, selectedOrderSide, optionStrategyBuilder, optionStrategyBuilderNuxStates, optionChainSettingsPnlChartType, targetExpirationPageFromTargetLegsEvent, targetExpirationPageFromSbsChainEvent, targetStrikePriceEvent, scrollTargetEvent, selectedSentiment, tradeOnExpirationState, underlyingQuote, underlyingIndexValue, underlyingIndexCloseValue, upsellHookEvent, buySelectedMetrics, sellSelectedMetrics, tooltip, chainCustomizationErrorEvent, shouldShowDiscoverZeroDteBottomSheetInCurrentSession, showDiscoverZeroDteSnackbarEvent, discoverZeroDteSnackbarState, isEtfSupported, shouldShowMultipleUnderlyingsTooltip, shouldShowSettleOnOpenTooltip, shouldShowSwitchFocusedToSbsTooltipPref, simulatedReturnChartShown, simulatedReturnSwitchChartTooltipShown, defaultToNearestExpirationDateEvent, dismissSelloutSnackbarEvent, selloutSnackbarDismissedOrElapsed, isSelloutSnackbarDismissalExperimentEnabled, inSelloutImprovementExperiment, inSnackbarDismissalFollowUpExperiment, settingGreenDotRemainingBlinks, isIndexOptionsExtendedHoursEnabled, isMemberPdtRevampV1);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionChainViewState)) {
            return false;
        }
        OptionChainViewState optionChainViewState = (OptionChainViewState) other;
        return Intrinsics.areEqual(this.account, optionChainViewState.account) && Intrinsics.areEqual(this.chainScrollTarget, optionChainViewState.chainScrollTarget) && Intrinsics.areEqual(this.currentPage, optionChainViewState.currentPage) && Intrinsics.areEqual(this.currentOrNextMarketDates, optionChainViewState.currentOrNextMarketDates) && Intrinsics.areEqual(this.currentSelloutTime, optionChainViewState.currentSelloutTime) && this.defaultPricingSettingOverride == optionChainViewState.defaultPricingSettingOverride && this.defaultPricingSettingServerValue == optionChainViewState.defaultPricingSettingServerValue && Intrinsics.areEqual(this.equityInstrument, optionChainViewState.equityInstrument) && Intrinsics.areEqual(this.existingPositionExpirationDateStates, optionChainViewState.existingPositionExpirationDateStates) && Intrinsics.areEqual(this.fridayTradingErrorEvent, optionChainViewState.fridayTradingErrorEvent) && this.hasMultipleAccounts == optionChainViewState.hasMultipleAccounts && this.hasSeenSbsChain == optionChainViewState.hasSeenSbsChain && this.hasSeenSbsChainBottomSheet == optionChainViewState.hasSeenSbsChainBottomSheet && this.hasSeenTopTooltipBannerInThisSession == optionChainViewState.hasSeenTopTooltipBannerInThisSession && this.hasSeenChainSettings == optionChainViewState.hasSeenChainSettings && this.hasSeenSbsNuxRevampChainSettings == optionChainViewState.hasSeenSbsNuxRevampChainSettings && Intrinsics.areEqual(this.iacAlertSheet, optionChainViewState.iacAlertSheet) && this.inSideBySideNuxRevampExperiment == optionChainViewState.inSideBySideNuxRevampExperiment && Intrinsics.areEqual(this.isDay, optionChainViewState.isDay) && this.isOnboardingSearchSelectorVisible == optionChainViewState.isOnboardingSearchSelectorVisible && Intrinsics.areEqual(this.launchMode, optionChainViewState.launchMode) && this.nuxSearchDismissed == optionChainViewState.nuxSearchDismissed && Intrinsics.areEqual(this.uiOptionChains, optionChainViewState.uiOptionChains) && Intrinsics.areEqual(this.optionInstrumentToRollQuote, optionChainViewState.optionInstrumentToRollQuote) && Intrinsics.areEqual(this.optionOrderFilter, optionChainViewState.optionOrderFilter) && Intrinsics.areEqual(this.optionChainConfiguration, optionChainViewState.optionChainConfiguration) && Intrinsics.areEqual(this.rollingExpirationDateEvent, optionChainViewState.rollingExpirationDateEvent) && this.selectedContractType == optionChainViewState.selectedContractType && this.selectedOrderSide == optionChainViewState.selectedOrderSide && Intrinsics.areEqual(this.optionStrategyBuilder, optionChainViewState.optionStrategyBuilder) && Intrinsics.areEqual(this.optionStrategyBuilderNuxStates, optionChainViewState.optionStrategyBuilderNuxStates) && this.optionChainSettingsPnlChartType == optionChainViewState.optionChainSettingsPnlChartType && Intrinsics.areEqual(this.targetExpirationPageFromTargetLegsEvent, optionChainViewState.targetExpirationPageFromTargetLegsEvent) && Intrinsics.areEqual(this.targetExpirationPageFromSbsChainEvent, optionChainViewState.targetExpirationPageFromSbsChainEvent) && Intrinsics.areEqual(this.targetStrikePriceEvent, optionChainViewState.targetStrikePriceEvent) && Intrinsics.areEqual(this.scrollTargetEvent, optionChainViewState.scrollTargetEvent) && this.selectedSentiment == optionChainViewState.selectedSentiment && this.tradeOnExpirationState == optionChainViewState.tradeOnExpirationState && Intrinsics.areEqual(this.underlyingQuote, optionChainViewState.underlyingQuote) && Intrinsics.areEqual(this.underlyingIndexValue, optionChainViewState.underlyingIndexValue) && Intrinsics.areEqual(this.underlyingIndexCloseValue, optionChainViewState.underlyingIndexCloseValue) && Intrinsics.areEqual(this.upsellHookEvent, optionChainViewState.upsellHookEvent) && Intrinsics.areEqual(this.buySelectedMetrics, optionChainViewState.buySelectedMetrics) && Intrinsics.areEqual(this.sellSelectedMetrics, optionChainViewState.sellSelectedMetrics) && Intrinsics.areEqual(this.tooltip, optionChainViewState.tooltip) && Intrinsics.areEqual(this.chainCustomizationErrorEvent, optionChainViewState.chainCustomizationErrorEvent) && this.shouldShowDiscoverZeroDteBottomSheetInCurrentSession == optionChainViewState.shouldShowDiscoverZeroDteBottomSheetInCurrentSession && Intrinsics.areEqual(this.showDiscoverZeroDteSnackbarEvent, optionChainViewState.showDiscoverZeroDteSnackbarEvent) && this.discoverZeroDteSnackbarState == optionChainViewState.discoverZeroDteSnackbarState && this.isEtfSupported == optionChainViewState.isEtfSupported && this.shouldShowMultipleUnderlyingsTooltip == optionChainViewState.shouldShowMultipleUnderlyingsTooltip && this.shouldShowSettleOnOpenTooltip == optionChainViewState.shouldShowSettleOnOpenTooltip && this.shouldShowSwitchFocusedToSbsTooltipPref == optionChainViewState.shouldShowSwitchFocusedToSbsTooltipPref && this.simulatedReturnChartShown == optionChainViewState.simulatedReturnChartShown && this.simulatedReturnSwitchChartTooltipShown == optionChainViewState.simulatedReturnSwitchChartTooltipShown && Intrinsics.areEqual(this.defaultToNearestExpirationDateEvent, optionChainViewState.defaultToNearestExpirationDateEvent) && Intrinsics.areEqual(this.dismissSelloutSnackbarEvent, optionChainViewState.dismissSelloutSnackbarEvent) && this.selloutSnackbarDismissedOrElapsed == optionChainViewState.selloutSnackbarDismissedOrElapsed && this.isSelloutSnackbarDismissalExperimentEnabled == optionChainViewState.isSelloutSnackbarDismissalExperimentEnabled && this.inSelloutImprovementExperiment == optionChainViewState.inSelloutImprovementExperiment && this.inSnackbarDismissalFollowUpExperiment == optionChainViewState.inSnackbarDismissalFollowUpExperiment && this.settingGreenDotRemainingBlinks == optionChainViewState.settingGreenDotRemainingBlinks && this.isIndexOptionsExtendedHoursEnabled == optionChainViewState.isIndexOptionsExtendedHoursEnabled && this.isMemberPdtRevampV1 == optionChainViewState.isMemberPdtRevampV1;
    }

    public int hashCode() {
        Account account = this.account;
        int iHashCode = (account == null ? 0 : account.hashCode()) * 31;
        ChainScrollTarget chainScrollTarget = this.chainScrollTarget;
        int iHashCode2 = (iHashCode + (chainScrollTarget == null ? 0 : chainScrollTarget.hashCode())) * 31;
        Integer num = this.currentPage;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        OptionCurrentOrNextMarketDates optionCurrentOrNextMarketDates = this.currentOrNextMarketDates;
        int iHashCode4 = (iHashCode3 + (optionCurrentOrNextMarketDates == null ? 0 : optionCurrentOrNextMarketDates.hashCode())) * 31;
        Instant instant = this.currentSelloutTime;
        int iHashCode5 = (iHashCode4 + (instant == null ? 0 : instant.hashCode())) * 31;
        OptionSettings.DefaultPricingSetting defaultPricingSetting = this.defaultPricingSettingOverride;
        int iHashCode6 = (iHashCode5 + (defaultPricingSetting == null ? 0 : defaultPricingSetting.hashCode())) * 31;
        OptionSettings.DefaultPricingSetting defaultPricingSetting2 = this.defaultPricingSettingServerValue;
        int iHashCode7 = (iHashCode6 + (defaultPricingSetting2 == null ? 0 : defaultPricingSetting2.hashCode())) * 31;
        Instrument instrument = this.equityInstrument;
        int iHashCode8 = (((iHashCode7 + (instrument == null ? 0 : instrument.hashCode())) * 31) + this.existingPositionExpirationDateStates.hashCode()) * 31;
        UiEvent<Throwable> uiEvent = this.fridayTradingErrorEvent;
        int iHashCode9 = (((((((((((((iHashCode8 + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31) + Boolean.hashCode(this.hasMultipleAccounts)) * 31) + Boolean.hashCode(this.hasSeenSbsChain)) * 31) + Boolean.hashCode(this.hasSeenSbsChainBottomSheet)) * 31) + Boolean.hashCode(this.hasSeenTopTooltipBannerInThisSession)) * 31) + Boolean.hashCode(this.hasSeenChainSettings)) * 31) + Boolean.hashCode(this.hasSeenSbsNuxRevampChainSettings)) * 31;
        IacAlertSheet iacAlertSheet = this.iacAlertSheet;
        int iHashCode10 = (((iHashCode9 + (iacAlertSheet == null ? 0 : iacAlertSheet.hashCode())) * 31) + Boolean.hashCode(this.inSideBySideNuxRevampExperiment)) * 31;
        Boolean bool = this.isDay;
        int iHashCode11 = (((((((((iHashCode10 + (bool == null ? 0 : bool.hashCode())) * 31) + Boolean.hashCode(this.isOnboardingSearchSelectorVisible)) * 31) + this.launchMode.hashCode()) * 31) + Boolean.hashCode(this.nuxSearchDismissed)) * 31) + this.uiOptionChains.hashCode()) * 31;
        OptionInstrumentQuote optionInstrumentQuote = this.optionInstrumentToRollQuote;
        int iHashCode12 = (iHashCode11 + (optionInstrumentQuote == null ? 0 : optionInstrumentQuote.hashCode())) * 31;
        OptionOrderFilter optionOrderFilter = this.optionOrderFilter;
        int iHashCode13 = (((iHashCode12 + (optionOrderFilter == null ? 0 : optionOrderFilter.hashCode())) * 31) + this.optionChainConfiguration.hashCode()) * 31;
        UiEvent<OptionInstrument> uiEvent2 = this.rollingExpirationDateEvent;
        int iHashCode14 = (iHashCode13 + (uiEvent2 == null ? 0 : uiEvent2.hashCode())) * 31;
        OptionContractType optionContractType = this.selectedContractType;
        int iHashCode15 = (iHashCode14 + (optionContractType == null ? 0 : optionContractType.hashCode())) * 31;
        OrderSide orderSide = this.selectedOrderSide;
        int iHashCode16 = (iHashCode15 + (orderSide == null ? 0 : orderSide.hashCode())) * 31;
        OptionStrategyBuilder optionStrategyBuilder = this.optionStrategyBuilder;
        int iHashCode17 = (iHashCode16 + (optionStrategyBuilder == null ? 0 : optionStrategyBuilder.hashCode())) * 31;
        Map<String, Boolean> map = this.optionStrategyBuilderNuxStates;
        int iHashCode18 = (iHashCode17 + (map == null ? 0 : map.hashCode())) * 31;
        OptionChainSettingsPnlChartType optionChainSettingsPnlChartType = this.optionChainSettingsPnlChartType;
        int iHashCode19 = (iHashCode18 + (optionChainSettingsPnlChartType == null ? 0 : optionChainSettingsPnlChartType.hashCode())) * 31;
        UiEvent<ImmutableList<UiOptionStrategyLegDisplay>> uiEvent3 = this.targetExpirationPageFromTargetLegsEvent;
        int iHashCode20 = (iHashCode19 + (uiEvent3 == null ? 0 : uiEvent3.hashCode())) * 31;
        UiEvent<OptionChainExpirationDateState> uiEvent4 = this.targetExpirationPageFromSbsChainEvent;
        int iHashCode21 = (iHashCode20 + (uiEvent4 == null ? 0 : uiEvent4.hashCode())) * 31;
        UiEvent<Tuples2<BigDecimal, Integer>> uiEvent5 = this.targetStrikePriceEvent;
        int iHashCode22 = (iHashCode21 + (uiEvent5 == null ? 0 : uiEvent5.hashCode())) * 31;
        UiEvent<OptionChainListViewState.ScrollTarget> uiEvent6 = this.scrollTargetEvent;
        int iHashCode23 = (iHashCode22 + (uiEvent6 == null ? 0 : uiEvent6.hashCode())) * 31;
        StrategyBuilderSentiment strategyBuilderSentiment = this.selectedSentiment;
        int iHashCode24 = (((iHashCode23 + (strategyBuilderSentiment == null ? 0 : strategyBuilderSentiment.hashCode())) * 31) + this.tradeOnExpirationState.hashCode()) * 31;
        Quote quote = this.underlyingQuote;
        int iHashCode25 = (iHashCode24 + (quote == null ? 0 : quote.hashCode())) * 31;
        IndexValue indexValue = this.underlyingIndexValue;
        int iHashCode26 = (iHashCode25 + (indexValue == null ? 0 : indexValue.hashCode())) * 31;
        IndexCloseValue indexCloseValue = this.underlyingIndexCloseValue;
        int iHashCode27 = (iHashCode26 + (indexCloseValue == null ? 0 : indexCloseValue.hashCode())) * 31;
        UiEvent<UpsellHook> uiEvent7 = this.upsellHookEvent;
        int iHashCode28 = (iHashCode27 + (uiEvent7 == null ? 0 : uiEvent7.hashCode())) * 31;
        OptionChainSelectedMetrics optionChainSelectedMetrics = this.buySelectedMetrics;
        int iHashCode29 = (iHashCode28 + (optionChainSelectedMetrics == null ? 0 : optionChainSelectedMetrics.hashCode())) * 31;
        OptionChainSelectedMetrics optionChainSelectedMetrics2 = this.sellSelectedMetrics;
        int iHashCode30 = (iHashCode29 + (optionChainSelectedMetrics2 == null ? 0 : optionChainSelectedMetrics2.hashCode())) * 31;
        OptionTooltip optionTooltip = this.tooltip;
        int iHashCode31 = (iHashCode30 + (optionTooltip == null ? 0 : optionTooltip.hashCode())) * 31;
        UiEvent<OptionChainCustomizationErrorEvent> uiEvent8 = this.chainCustomizationErrorEvent;
        int iHashCode32 = (((iHashCode31 + (uiEvent8 == null ? 0 : uiEvent8.hashCode())) * 31) + Boolean.hashCode(this.shouldShowDiscoverZeroDteBottomSheetInCurrentSession)) * 31;
        UiEvent<String> uiEvent9 = this.showDiscoverZeroDteSnackbarEvent;
        int iHashCode33 = (((((((((((((((iHashCode32 + (uiEvent9 == null ? 0 : uiEvent9.hashCode())) * 31) + this.discoverZeroDteSnackbarState.hashCode()) * 31) + Boolean.hashCode(this.isEtfSupported)) * 31) + Boolean.hashCode(this.shouldShowMultipleUnderlyingsTooltip)) * 31) + Boolean.hashCode(this.shouldShowSettleOnOpenTooltip)) * 31) + Boolean.hashCode(this.shouldShowSwitchFocusedToSbsTooltipPref)) * 31) + Boolean.hashCode(this.simulatedReturnChartShown)) * 31) + Boolean.hashCode(this.simulatedReturnSwitchChartTooltipShown)) * 31;
        UiEvent<Integer> uiEvent10 = this.defaultToNearestExpirationDateEvent;
        int iHashCode34 = (iHashCode33 + (uiEvent10 == null ? 0 : uiEvent10.hashCode())) * 31;
        UiEvent<Unit> uiEvent11 = this.dismissSelloutSnackbarEvent;
        return ((((((((((((((iHashCode34 + (uiEvent11 != null ? uiEvent11.hashCode() : 0)) * 31) + Boolean.hashCode(this.selloutSnackbarDismissedOrElapsed)) * 31) + Boolean.hashCode(this.isSelloutSnackbarDismissalExperimentEnabled)) * 31) + Boolean.hashCode(this.inSelloutImprovementExperiment)) * 31) + Boolean.hashCode(this.inSnackbarDismissalFollowUpExperiment)) * 31) + Integer.hashCode(this.settingGreenDotRemainingBlinks)) * 31) + Boolean.hashCode(this.isIndexOptionsExtendedHoursEnabled)) * 31) + Boolean.hashCode(this.isMemberPdtRevampV1);
    }

    public String toString() {
        return "OptionChainViewState(account=" + this.account + ", chainScrollTarget=" + this.chainScrollTarget + ", currentPage=" + this.currentPage + ", currentOrNextMarketDates=" + this.currentOrNextMarketDates + ", currentSelloutTime=" + this.currentSelloutTime + ", defaultPricingSettingOverride=" + this.defaultPricingSettingOverride + ", defaultPricingSettingServerValue=" + this.defaultPricingSettingServerValue + ", equityInstrument=" + this.equityInstrument + ", existingPositionExpirationDateStates=" + this.existingPositionExpirationDateStates + ", fridayTradingErrorEvent=" + this.fridayTradingErrorEvent + ", hasMultipleAccounts=" + this.hasMultipleAccounts + ", hasSeenSbsChain=" + this.hasSeenSbsChain + ", hasSeenSbsChainBottomSheet=" + this.hasSeenSbsChainBottomSheet + ", hasSeenTopTooltipBannerInThisSession=" + this.hasSeenTopTooltipBannerInThisSession + ", hasSeenChainSettings=" + this.hasSeenChainSettings + ", hasSeenSbsNuxRevampChainSettings=" + this.hasSeenSbsNuxRevampChainSettings + ", iacAlertSheet=" + this.iacAlertSheet + ", inSideBySideNuxRevampExperiment=" + this.inSideBySideNuxRevampExperiment + ", isDay=" + this.isDay + ", isOnboardingSearchSelectorVisible=" + this.isOnboardingSearchSelectorVisible + ", launchMode=" + this.launchMode + ", nuxSearchDismissed=" + this.nuxSearchDismissed + ", uiOptionChains=" + this.uiOptionChains + ", optionInstrumentToRollQuote=" + this.optionInstrumentToRollQuote + ", optionOrderFilter=" + this.optionOrderFilter + ", optionChainConfiguration=" + this.optionChainConfiguration + ", rollingExpirationDateEvent=" + this.rollingExpirationDateEvent + ", selectedContractType=" + this.selectedContractType + ", selectedOrderSide=" + this.selectedOrderSide + ", optionStrategyBuilder=" + this.optionStrategyBuilder + ", optionStrategyBuilderNuxStates=" + this.optionStrategyBuilderNuxStates + ", optionChainSettingsPnlChartType=" + this.optionChainSettingsPnlChartType + ", targetExpirationPageFromTargetLegsEvent=" + this.targetExpirationPageFromTargetLegsEvent + ", targetExpirationPageFromSbsChainEvent=" + this.targetExpirationPageFromSbsChainEvent + ", targetStrikePriceEvent=" + this.targetStrikePriceEvent + ", scrollTargetEvent=" + this.scrollTargetEvent + ", selectedSentiment=" + this.selectedSentiment + ", tradeOnExpirationState=" + this.tradeOnExpirationState + ", underlyingQuote=" + this.underlyingQuote + ", underlyingIndexValue=" + this.underlyingIndexValue + ", underlyingIndexCloseValue=" + this.underlyingIndexCloseValue + ", upsellHookEvent=" + this.upsellHookEvent + ", buySelectedMetrics=" + this.buySelectedMetrics + ", sellSelectedMetrics=" + this.sellSelectedMetrics + ", tooltip=" + this.tooltip + ", chainCustomizationErrorEvent=" + this.chainCustomizationErrorEvent + ", shouldShowDiscoverZeroDteBottomSheetInCurrentSession=" + this.shouldShowDiscoverZeroDteBottomSheetInCurrentSession + ", showDiscoverZeroDteSnackbarEvent=" + this.showDiscoverZeroDteSnackbarEvent + ", discoverZeroDteSnackbarState=" + this.discoverZeroDteSnackbarState + ", isEtfSupported=" + this.isEtfSupported + ", shouldShowMultipleUnderlyingsTooltip=" + this.shouldShowMultipleUnderlyingsTooltip + ", shouldShowSettleOnOpenTooltip=" + this.shouldShowSettleOnOpenTooltip + ", shouldShowSwitchFocusedToSbsTooltipPref=" + this.shouldShowSwitchFocusedToSbsTooltipPref + ", simulatedReturnChartShown=" + this.simulatedReturnChartShown + ", simulatedReturnSwitchChartTooltipShown=" + this.simulatedReturnSwitchChartTooltipShown + ", defaultToNearestExpirationDateEvent=" + this.defaultToNearestExpirationDateEvent + ", dismissSelloutSnackbarEvent=" + this.dismissSelloutSnackbarEvent + ", selloutSnackbarDismissedOrElapsed=" + this.selloutSnackbarDismissedOrElapsed + ", isSelloutSnackbarDismissalExperimentEnabled=" + this.isSelloutSnackbarDismissalExperimentEnabled + ", inSelloutImprovementExperiment=" + this.inSelloutImprovementExperiment + ", inSnackbarDismissalFollowUpExperiment=" + this.inSnackbarDismissalFollowUpExperiment + ", settingGreenDotRemainingBlinks=" + this.settingGreenDotRemainingBlinks + ", isIndexOptionsExtendedHoursEnabled=" + this.isIndexOptionsExtendedHoursEnabled + ", isMemberPdtRevampV1=" + this.isMemberPdtRevampV1 + ")";
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public OptionChainViewState(Account account, ChainScrollTarget chainScrollTarget, Integer num, OptionCurrentOrNextMarketDates optionCurrentOrNextMarketDates, Instant instant, OptionSettings.DefaultPricingSetting defaultPricingSetting, OptionSettings.DefaultPricingSetting defaultPricingSetting2, Instrument instrument, ImmutableList<OptionChainExpirationDateState> existingPositionExpirationDateStates, UiEvent<Throwable> uiEvent, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, IacAlertSheet iacAlertSheet, boolean z7, Boolean bool, boolean z8, OptionChainLaunchMode launchMode, boolean z9, ImmutableList<UiOptionChain> uiOptionChains, OptionInstrumentQuote optionInstrumentQuote, OptionOrderFilter optionOrderFilter, OptionChainConfiguration optionChainConfiguration, UiEvent<OptionInstrument> uiEvent2, OptionContractType optionContractType, OrderSide orderSide, OptionStrategyBuilder optionStrategyBuilder, Map<String, Boolean> map, OptionChainSettingsPnlChartType optionChainSettingsPnlChartType, UiEvent<ImmutableList<UiOptionStrategyLegDisplay>> uiEvent3, UiEvent<OptionChainExpirationDateState> uiEvent4, UiEvent<Tuples2<BigDecimal, Integer>> uiEvent5, UiEvent<OptionChainListViewState.ScrollTarget> uiEvent6, StrategyBuilderSentiment strategyBuilderSentiment, OptionSettings.TradingOnExpirationState tradeOnExpirationState, Quote quote, IndexValue indexValue, IndexCloseValue indexCloseValue, UiEvent<UpsellHook> uiEvent7, OptionChainSelectedMetrics optionChainSelectedMetrics, OptionChainSelectedMetrics optionChainSelectedMetrics2, OptionTooltip optionTooltip, UiEvent<OptionChainCustomizationErrorEvent> uiEvent8, boolean z10, UiEvent<String> uiEvent9, OptionDiscoverZeroDteSnackbarState discoverZeroDteSnackbarState, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, UiEvent<Integer> uiEvent10, UiEvent<Unit> uiEvent11, boolean z17, boolean z18, boolean z19, boolean z20, int i, boolean z21, boolean z22) {
        UiOptionChain next;
        boolean z23;
        ScarletOverlay directionOverlay;
        BigDecimal todaysPercentChange;
        IndexOptionsTooltip settleOnOpenTooltip;
        UiOptionChain selectedUiOptionChain;
        OptionChain optionChain;
        UpsellHook alertSheet;
        UiOptionChain selectedUiOptionChain2;
        OptionChain optionChain2;
        OptionChainRollingHeaderView.RollingHeaderData rollingHeaderData;
        List<OptionStrategyBuilderAdapter2> list;
        Decimals4 adjustedMarkPrice;
        Integer num2;
        OptionChain optionChain3;
        Intrinsics.checkNotNullParameter(existingPositionExpirationDateStates, "existingPositionExpirationDateStates");
        Intrinsics.checkNotNullParameter(launchMode, "launchMode");
        Intrinsics.checkNotNullParameter(uiOptionChains, "uiOptionChains");
        Intrinsics.checkNotNullParameter(optionChainConfiguration, "optionChainConfiguration");
        Intrinsics.checkNotNullParameter(tradeOnExpirationState, "tradeOnExpirationState");
        Intrinsics.checkNotNullParameter(discoverZeroDteSnackbarState, "discoverZeroDteSnackbarState");
        this.account = account;
        this.chainScrollTarget = chainScrollTarget;
        this.currentPage = num;
        this.currentOrNextMarketDates = optionCurrentOrNextMarketDates;
        this.currentSelloutTime = instant;
        this.defaultPricingSettingOverride = defaultPricingSetting;
        this.defaultPricingSettingServerValue = defaultPricingSetting2;
        this.equityInstrument = instrument;
        this.existingPositionExpirationDateStates = existingPositionExpirationDateStates;
        this.fridayTradingErrorEvent = uiEvent;
        this.hasMultipleAccounts = z;
        this.hasSeenSbsChain = z2;
        this.hasSeenSbsChainBottomSheet = z3;
        this.hasSeenTopTooltipBannerInThisSession = z4;
        this.hasSeenChainSettings = z5;
        this.hasSeenSbsNuxRevampChainSettings = z6;
        this.iacAlertSheet = iacAlertSheet;
        this.inSideBySideNuxRevampExperiment = z7;
        this.isDay = bool;
        this.isOnboardingSearchSelectorVisible = z8;
        this.launchMode = launchMode;
        this.nuxSearchDismissed = z9;
        this.uiOptionChains = uiOptionChains;
        this.optionInstrumentToRollQuote = optionInstrumentQuote;
        this.optionOrderFilter = optionOrderFilter;
        this.optionChainConfiguration = optionChainConfiguration;
        this.rollingExpirationDateEvent = uiEvent2;
        this.selectedContractType = optionContractType;
        this.selectedOrderSide = orderSide;
        this.optionStrategyBuilder = optionStrategyBuilder;
        this.optionStrategyBuilderNuxStates = map;
        this.optionChainSettingsPnlChartType = optionChainSettingsPnlChartType;
        this.targetExpirationPageFromTargetLegsEvent = uiEvent3;
        this.targetExpirationPageFromSbsChainEvent = uiEvent4;
        this.targetStrikePriceEvent = uiEvent5;
        this.scrollTargetEvent = uiEvent6;
        this.selectedSentiment = strategyBuilderSentiment;
        this.tradeOnExpirationState = tradeOnExpirationState;
        this.underlyingQuote = quote;
        this.underlyingIndexValue = indexValue;
        this.underlyingIndexCloseValue = indexCloseValue;
        this.upsellHookEvent = uiEvent7;
        this.buySelectedMetrics = optionChainSelectedMetrics;
        this.sellSelectedMetrics = optionChainSelectedMetrics2;
        this.tooltip = optionTooltip;
        this.chainCustomizationErrorEvent = uiEvent8;
        this.shouldShowDiscoverZeroDteBottomSheetInCurrentSession = z10;
        this.showDiscoverZeroDteSnackbarEvent = uiEvent9;
        this.discoverZeroDteSnackbarState = discoverZeroDteSnackbarState;
        this.isEtfSupported = z11;
        this.shouldShowMultipleUnderlyingsTooltip = z12;
        this.shouldShowSettleOnOpenTooltip = z13;
        this.shouldShowSwitchFocusedToSbsTooltipPref = z14;
        this.simulatedReturnChartShown = z15;
        this.simulatedReturnSwitchChartTooltipShown = z16;
        this.defaultToNearestExpirationDateEvent = uiEvent10;
        this.dismissSelloutSnackbarEvent = uiEvent11;
        this.selloutSnackbarDismissedOrElapsed = z17;
        this.isSelloutSnackbarDismissalExperimentEnabled = z18;
        this.inSelloutImprovementExperiment = z19;
        this.inSnackbarDismissalFollowUpExperiment = z20;
        this.settingGreenDotRemainingBlinks = i;
        this.isIndexOptionsExtendedHoursEnabled = z21;
        this.isMemberPdtRevampV1 = z22;
        ImmutableList<UiOptionChain> immutableList = this.uiOptionChains;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(immutableList, 10));
        Iterator<UiOptionChain> it = immutableList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getOptionChain().getSymbol());
        }
        this.optionChainSymbolForLogging = CollectionsKt.joinToString$default(CollectionsKt.sorted(arrayList), "/", null, null, 0, null, new Function1() { // from class: com.robinhood.android.optionschain.OptionChainViewState$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainViewState.optionChainSymbolForLogging$lambda$1((String) obj);
            }
        }, 30, null);
        Iterator<UiOptionChain> it2 = this.uiOptionChains.iterator();
        if (it2.hasNext()) {
            next = it2.next();
            if (it2.hasNext()) {
                String symbol = next.getOptionChain().getSymbol();
                do {
                    UiOptionChain next2 = it2.next();
                    String symbol2 = next2.getOptionChain().getSymbol();
                    if (symbol.compareTo(symbol2) > 0) {
                        next = next2;
                        symbol = symbol2;
                    }
                } while (it2.hasNext());
            }
        } else {
            next = null;
        }
        UiOptionChain uiOptionChain = next;
        this.optionChainIdForLogging = (uiOptionChain == null || (optionChain3 = uiOptionChain.getOptionChain()) == null) ? null : optionChain3.getId();
        boolean zHasFeature = this.launchMode.hasFeature(OptionChainLaunchMode.Feature.BUILDER_TAB);
        this.showBuilder = zHasFeature;
        boolean z24 = zHasFeature && (((num2 = this.currentPage) != null && num2.intValue() == 0) || this.currentPage == null);
        this.isOnBuilderPage = z24;
        OptionChainLaunchMode optionChainLaunchMode = this.launchMode;
        this.showOptionChainCustomizationGtmIacAlertSheet = optionChainLaunchMode instanceof OptionChainLaunchMode.ChainCustomizationGtm;
        this.showNormalIacAlertSheet = optionChainLaunchMode instanceof OptionChainLaunchMode.Normal;
        this.shouldShowChainSettings = !z24 && optionChainLaunchMode.hasFeature(OptionChainLaunchMode.Feature.CHAIN_SETTINGS);
        Account account2 = this.account;
        this.multilegAvailable = account2 != null && account2.getHasAccessToMultileg() && this.launchMode.hasFeature(OptionChainLaunchMode.Feature.MULTILEG);
        MultilegSelectionState multilegSelectionState = (z24 || this.optionChainConfiguration.getSelectedLegs().isEmpty()) ? MultilegSelectionState.MULTILEG_DISABLE : MultilegSelectionState.MULTILEG_CLEAR;
        this.multilegSelectionState = multilegSelectionState;
        OptionDefaultPricingState optionDefaultPricingStateFrom = OptionDefaultPricingState.INSTANCE.from(this.defaultPricingSettingServerValue, this.defaultPricingSettingOverride, getShouldIgnoreDefaultPricing());
        this.defaultPricingState = optionDefaultPricingStateFrom;
        this.chainSettingsIcon = (optionDefaultPricingStateFrom == OptionDefaultPricingState.NOT_AVAILABLE || z24) ? OptionChainViewState3.NONE : OptionChainViewState3.GEAR;
        this.shouldShowSimulatedReturnSwitchChartTooltip = this.simulatedReturnChartShown && !z24 && !this.simulatedReturnSwitchChartTooltipShown && this.optionChainSettingsPnlChartType == OptionChainSettingsPnlChartType.BY_PRICE;
        this.shouldEmitChainCustomizationEvent = !z24;
        this.shouldShowShoppingCart = (z24 || this.optionChainConfiguration.getSelectedLegs().isEmpty()) ? false : true;
        if (this.launchMode.getFeatureSet().contains(OptionChainLaunchMode.Feature.ACHROMATIC)) {
            directionOverlay = AchromaticOverlay.INSTANCE;
        } else {
            int i2 = WhenMappings.$EnumSwitchMapping$0[((UiOptionChain) CollectionsKt.first((List) this.uiOptionChains)).getUnderlyingType().ordinal()];
            if (i2 == 1) {
                IndexValue indexValue2 = this.underlyingIndexValue;
                if (indexValue2 == null || this.underlyingIndexCloseValue == null || indexValue2.getValue().compareTo(this.underlyingIndexCloseValue.getCloseValue()) >= 0) {
                }
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                Quote quote2 = this.underlyingQuote;
                z23 = quote2 == null || (todaysPercentChange = quote2.getTodaysPercentChange()) == null || !BigDecimals7.isNegative(todaysPercentChange);
            }
            OptionOrderFilter optionOrderFilter2 = this.optionOrderFilter;
            directionOverlay = optionOrderFilter2 == null ? null : OptionChainColors.INSTANCE.getDirectionOverlay(z23, optionOrderFilter2.getContractType() == OptionContractType.CALL);
        }
        this.scarletOverlay = directionOverlay;
        OptionOrderFilter.Companion companion = OptionOrderFilter.INSTANCE;
        ImmutableList<UiOptionChain> immutableList2 = this.uiOptionChains;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(immutableList2, 10));
        Iterator<UiOptionChain> it3 = immutableList2.iterator();
        while (it3.hasNext()) {
            arrayList2.add(it3.next().getOptionChain().getId());
        }
        this.optionOrderFilterKey = companion.getOptionOrderFilterKey(arrayList2);
        if (this.isOnBuilderPage && this.shouldShowMultipleUnderlyingsTooltip && isMultipleChain()) {
            StringResource.Companion companion2 = StringResource.INSTANCE;
            settleOnOpenTooltip = new IndexOptionsTooltip.MultipleUnderlyingsTooltip(0.15f, companion2.invoke(C22987R.string.option_chain_index_underlyings_tooltip_text, new Object[0]), companion2.invoke(C22987R.string.option_chain_index_options_tooltip_link_text, new Object[0]), companion2.invoke(C22987R.string.option_chain_index_options_tooltip_link, new Object[0]));
        } else if (this.isOnBuilderPage || !this.shouldShowSettleOnOpenTooltip || (selectedUiOptionChain = getSelectedUiOptionChain()) == null || (optionChain = selectedUiOptionChain.getOptionChain()) == null || !optionChain.getSettleOnOpen()) {
            settleOnOpenTooltip = null;
        } else {
            String to24HourTime$default = DateStrings2.formatTo24HourTime$default(9, 30, null, 4, null);
            StringResource.Companion companion3 = StringResource.INSTANCE;
            settleOnOpenTooltip = new IndexOptionsTooltip.SettleOnOpenTooltip(0.5f, companion3.invoke(C22987R.string.option_chain_index_options_settle_on_open_tooltip_text, to24HourTime$default), companion3.invoke(C22987R.string.option_chain_index_options_tooltip_link_text, new Object[0]), companion3.invoke(C22987R.string.option_chain_index_options_tooltip_link, new Object[0]));
        }
        this.indexOptionsTooltip = settleOnOpenTooltip;
        this.showSwitchFocusedToSbsTooltip = (this.inSideBySideNuxRevampExperiment && this.shouldShowSwitchFocusedToSbsTooltipPref && !this.isOnBuilderPage && (this.launchMode instanceof OptionChainLaunchMode.Normal)) ? new SwitchFocusedToSbsTooltip(0.95f, StringResource.INSTANCE.invoke(C22987R.string.option_chain_switch_focused_to_sbs_tooltip, new Object[0])) : null;
        if (this.launchMode.hasFeature(OptionChainLaunchMode.Feature.BOTTOM_SHEET_UPSELLS)) {
            if (this.launchMode.hasFeature(OptionChainLaunchMode.Feature.FORCE_WATCHLIST_BOTTOM_SHEET)) {
                alertSheet = UpsellHook.DoubleTapToWatch.INSTANCE;
            } else {
                OptionChainLaunchMode optionChainLaunchMode2 = this.launchMode;
                OptionChainLaunchMode.Feature feature = OptionChainLaunchMode.Feature.FORCE_IAC_ALERT_SHEET;
                if (optionChainLaunchMode2.hasFeature(feature) && this.iacAlertSheet != null) {
                    alertSheet = new UpsellHook.AlertSheet(this.iacAlertSheet);
                } else if ((!this.launchMode.hasFeature(feature) || this.iacAlertSheet != null) && this.account != null) {
                    alertSheet = (this.hasSeenSbsChain || this.hasSeenSbsChainBottomSheet) ? (!this.shouldShowDiscoverZeroDteBottomSheetInCurrentSession || this.tradeOnExpirationState.isEnabled() || (selectedUiOptionChain2 = getSelectedUiOptionChain()) == null || (optionChain2 = selectedUiOptionChain2.getOptionChain()) == null || optionChain2.getSettleOnOpen() || !m2308x4cc29574() || !Intrinsics.areEqual(m2307x85dab0e9(), Boolean.TRUE)) ? this.iacAlertSheet != null ? new UpsellHook.AlertSheet(this.iacAlertSheet) : null : new UpsellHook.DiscoverZeroDte(UiOptionChains.getUnderlyingType(this.uiOptionChains)) : new UpsellHook.SideBySideChain(this.account.getOptionLevel(), UiOptionChains.getOptionChainIdsForLogging(this.uiOptionChains));
                }
            }
        }
        this.upsellType = alertSheet;
        if (this.launchMode instanceof OptionChainLaunchMode.RollingContractSelector) {
            OptionChainLaunchMode.RollingContractSelector rollingContractSelector = (OptionChainLaunchMode.RollingContractSelector) this.launchMode;
            OptionInstrumentQuote optionInstrumentQuote2 = this.optionInstrumentToRollQuote;
            rollingHeaderData = new OptionChainRollingHeaderView.RollingHeaderData(rollingContractSelector, (optionInstrumentQuote2 == null || (adjustedMarkPrice = optionInstrumentQuote2.getAdjustedMarkPrice()) == null) ? null : adjustedMarkPrice.getUnsignedValue());
        } else {
            rollingHeaderData = null;
        }
        this.rollingHeaderData = rollingHeaderData;
        this.shouldShowRollingHeaderView = rollingHeaderData != null && this.launchMode.hasFeature(OptionChainLaunchMode.Feature.ROLLING_HEADER_VIEW);
        if (this.account == null || this.optionStrategyBuilder == null || this.optionStrategyBuilderNuxStates == null || this.isDay == null) {
            list = null;
        } else {
            List listMutableListOf = CollectionsKt.mutableListOf(new OptionStrategyBuilderAdapter2.HeaderData(UiOptionChains.getOptionChainIdsForLogging(this.uiOptionChains), this.equityInstrument, this.optionStrategyBuilder.getSentimentFilters(), this.selectedSentiment, this.uiOptionChains));
            for (OptionStrategyBuilder.StrategySection strategySection : this.optionStrategyBuilder.getStrategySections()) {
                LinkedList linkedList = new LinkedList();
                List<OptionStrategyBuilder.StrategySection.StrategyCard> strategyCards = strategySection.getStrategyCards();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : strategyCards) {
                    OptionStrategyBuilder.StrategySection.StrategyCard strategyCard = (OptionStrategyBuilder.StrategySection.StrategyCard) obj;
                    if (this.selectedSentiment == null || strategyCard.getSentiment() == this.selectedSentiment) {
                        arrayList3.add(obj);
                    }
                }
                Iterator it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    linkedList.add(new OptionStrategyBuilderAdapter2.StrategyCardData(this.account, (OptionStrategyBuilder.StrategySection.StrategyCard) it4.next(), this.isDay.booleanValue(), this.uiOptionChains));
                }
                if (!linkedList.isEmpty()) {
                    linkedList.addFirst(new OptionStrategyBuilderAdapter2.SubtitleData(strategySection.getSubtitle()));
                    linkedList.addFirst(new OptionStrategyBuilderAdapter2.TitleData(strategySection.getTitle(), strategySection.getState() == StrategyBuilderStrategyCardState.COMING_SOON));
                    listMutableListOf.addAll(linkedList);
                }
            }
            list = CollectionsKt.toList(listMutableListOf);
        }
        this.optionStrategyBuilderData = list;
        this.additionalCardData = this.account != null ? new OptionStrategyBuilderView.AdditionalCardData(UiOptionChains.getOptionChainIdsForLogging(this.uiOptionChains), this.account.getOptionLevel(), this.optionStrategyBuilderNuxStates) : null;
    }

    public final Account getAccount() {
        return this.account;
    }

    public final ChainScrollTarget getChainScrollTarget() {
        return this.chainScrollTarget;
    }

    public final Integer getCurrentPage() {
        return this.currentPage;
    }

    public final OptionCurrentOrNextMarketDates getCurrentOrNextMarketDates() {
        return this.currentOrNextMarketDates;
    }

    public final Instant getCurrentSelloutTime() {
        return this.currentSelloutTime;
    }

    public final OptionSettings.DefaultPricingSetting getDefaultPricingSettingOverride() {
        return this.defaultPricingSettingOverride;
    }

    public final OptionSettings.DefaultPricingSetting getDefaultPricingSettingServerValue() {
        return this.defaultPricingSettingServerValue;
    }

    public final Instrument getEquityInstrument() {
        return this.equityInstrument;
    }

    public /* synthetic */ OptionChainViewState(Account account, ChainScrollTarget chainScrollTarget, Integer num, OptionCurrentOrNextMarketDates optionCurrentOrNextMarketDates, Instant instant, OptionSettings.DefaultPricingSetting defaultPricingSetting, OptionSettings.DefaultPricingSetting defaultPricingSetting2, Instrument instrument, ImmutableList immutableList, UiEvent uiEvent, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, IacAlertSheet iacAlertSheet, boolean z7, Boolean bool, boolean z8, OptionChainLaunchMode optionChainLaunchMode, boolean z9, ImmutableList immutableList2, OptionInstrumentQuote optionInstrumentQuote, OptionOrderFilter optionOrderFilter, OptionChainConfiguration optionChainConfiguration, UiEvent uiEvent2, OptionContractType optionContractType, OrderSide orderSide, OptionStrategyBuilder optionStrategyBuilder, Map map, OptionChainSettingsPnlChartType optionChainSettingsPnlChartType, UiEvent uiEvent3, UiEvent uiEvent4, UiEvent uiEvent5, UiEvent uiEvent6, StrategyBuilderSentiment strategyBuilderSentiment, OptionSettings.TradingOnExpirationState tradingOnExpirationState, Quote quote, IndexValue indexValue, IndexCloseValue indexCloseValue, UiEvent uiEvent7, OptionChainSelectedMetrics optionChainSelectedMetrics, OptionChainSelectedMetrics optionChainSelectedMetrics2, OptionTooltip optionTooltip, UiEvent uiEvent8, boolean z10, UiEvent uiEvent9, OptionDiscoverZeroDteSnackbarState optionDiscoverZeroDteSnackbarState, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, UiEvent uiEvent10, UiEvent uiEvent11, boolean z17, boolean z18, boolean z19, boolean z20, int i, boolean z21, boolean z22, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : account, (i2 & 2) != 0 ? null : chainScrollTarget, (i2 & 4) != 0 ? null : num, (i2 & 8) != 0 ? null : optionCurrentOrNextMarketDates, (i2 & 16) != 0 ? null : instant, (i2 & 32) != 0 ? null : defaultPricingSetting, (i2 & 64) != 0 ? null : defaultPricingSetting2, (i2 & 128) != 0 ? null : instrument, (i2 & 256) != 0 ? extensions2.persistentListOf() : immutableList, (i2 & 512) != 0 ? null : uiEvent, (i2 & 1024) != 0 ? false : z, (i2 & 2048) != 0 ? true : z2, (i2 & 4096) != 0 ? true : z3, (i2 & 8192) != 0 ? false : z4, (i2 & 16384) != 0 ? true : z5, (i2 & 32768) != 0 ? true : z6, (i2 & 65536) != 0 ? null : iacAlertSheet, (i2 & 131072) != 0 ? false : z7, (i2 & 262144) != 0 ? null : bool, (i2 & 524288) != 0 ? false : z8, optionChainLaunchMode, (i2 & 2097152) != 0 ? false : z9, immutableList2, (i2 & 8388608) != 0 ? null : optionInstrumentQuote, (i2 & 16777216) != 0 ? null : optionOrderFilter, (i2 & 33554432) != 0 ? new OptionChainConfiguration(null, 1, null) : optionChainConfiguration, (i2 & 67108864) != 0 ? null : uiEvent2, (i2 & 134217728) != 0 ? null : optionContractType, (i2 & 268435456) != 0 ? null : orderSide, (i2 & 536870912) != 0 ? null : optionStrategyBuilder, (i2 & 1073741824) != 0 ? null : map, (i2 & Integer.MIN_VALUE) != 0 ? null : optionChainSettingsPnlChartType, (i3 & 1) != 0 ? null : uiEvent3, (i3 & 2) != 0 ? null : uiEvent4, (i3 & 4) != 0 ? null : uiEvent5, (i3 & 8) != 0 ? null : uiEvent6, (i3 & 16) != 0 ? null : strategyBuilderSentiment, (i3 & 32) != 0 ? OptionSettings.TradingOnExpirationState.INELIGIBLE : tradingOnExpirationState, (i3 & 64) != 0 ? null : quote, (i3 & 128) != 0 ? null : indexValue, (i3 & 256) != 0 ? null : indexCloseValue, (i3 & 512) != 0 ? null : uiEvent7, (i3 & 1024) != 0 ? null : optionChainSelectedMetrics, (i3 & 2048) != 0 ? null : optionChainSelectedMetrics2, (i3 & 4096) != 0 ? null : optionTooltip, (i3 & 8192) != 0 ? null : uiEvent8, (i3 & 16384) != 0 ? true : z10, (i3 & 32768) != 0 ? null : uiEvent9, (i3 & 65536) != 0 ? OptionDiscoverZeroDteSnackbarState.DISMISSED : optionDiscoverZeroDteSnackbarState, (i3 & 131072) != 0 ? false : z11, (i3 & 262144) != 0 ? false : z12, (i3 & 524288) != 0 ? false : z13, (1048576 & i3) != 0 ? false : z14, (2097152 & i3) != 0 ? false : z15, (4194304 & i3) != 0 ? true : z16, (8388608 & i3) != 0 ? null : uiEvent10, (16777216 & i3) != 0 ? null : uiEvent11, (33554432 & i3) != 0 ? false : z17, (67108864 & i3) != 0 ? false : z18, (134217728 & i3) != 0 ? false : z19, (268435456 & i3) != 0 ? false : z20, (536870912 & i3) != 0 ? 20 : i, (1073741824 & i3) != 0 ? false : z21, (i3 & Integer.MIN_VALUE) != 0 ? false : z22);
    }

    public final ImmutableList<OptionChainExpirationDateState> getExistingPositionExpirationDateStates() {
        return this.existingPositionExpirationDateStates;
    }

    public final UiEvent<Throwable> getFridayTradingErrorEvent() {
        return this.fridayTradingErrorEvent;
    }

    public final boolean getHasMultipleAccounts() {
        return this.hasMultipleAccounts;
    }

    public final boolean getHasSeenSbsChain() {
        return this.hasSeenSbsChain;
    }

    public final boolean getHasSeenSbsChainBottomSheet() {
        return this.hasSeenSbsChainBottomSheet;
    }

    public final boolean getHasSeenTopTooltipBannerInThisSession() {
        return this.hasSeenTopTooltipBannerInThisSession;
    }

    public final boolean getHasSeenChainSettings() {
        return this.hasSeenChainSettings;
    }

    public final boolean getHasSeenSbsNuxRevampChainSettings() {
        return this.hasSeenSbsNuxRevampChainSettings;
    }

    public final IacAlertSheet getIacAlertSheet() {
        return this.iacAlertSheet;
    }

    public final boolean getInSideBySideNuxRevampExperiment() {
        return this.inSideBySideNuxRevampExperiment;
    }

    public final Boolean isDay() {
        return this.isDay;
    }

    public final boolean isOnboardingSearchSelectorVisible() {
        return this.isOnboardingSearchSelectorVisible;
    }

    public final OptionChainLaunchMode getLaunchMode() {
        return this.launchMode;
    }

    public final boolean getNuxSearchDismissed() {
        return this.nuxSearchDismissed;
    }

    public final ImmutableList<UiOptionChain> getUiOptionChains() {
        return this.uiOptionChains;
    }

    public final OptionOrderFilter getOptionOrderFilter() {
        return this.optionOrderFilter;
    }

    public final OptionChainConfiguration getOptionChainConfiguration() {
        return this.optionChainConfiguration;
    }

    public final UiEvent<OptionInstrument> getRollingExpirationDateEvent() {
        return this.rollingExpirationDateEvent;
    }

    public final OptionContractType getSelectedContractType() {
        return this.selectedContractType;
    }

    public final OrderSide getSelectedOrderSide() {
        return this.selectedOrderSide;
    }

    public final OptionStrategyBuilder getOptionStrategyBuilder() {
        return this.optionStrategyBuilder;
    }

    public final Map<String, Boolean> getOptionStrategyBuilderNuxStates() {
        return this.optionStrategyBuilderNuxStates;
    }

    public final OptionChainSettingsPnlChartType getOptionChainSettingsPnlChartType() {
        return this.optionChainSettingsPnlChartType;
    }

    public final UiEvent<ImmutableList<UiOptionStrategyLegDisplay>> getTargetExpirationPageFromTargetLegsEvent() {
        return this.targetExpirationPageFromTargetLegsEvent;
    }

    public final UiEvent<OptionChainExpirationDateState> getTargetExpirationPageFromSbsChainEvent() {
        return this.targetExpirationPageFromSbsChainEvent;
    }

    public final UiEvent<Tuples2<BigDecimal, Integer>> getTargetStrikePriceEvent() {
        return this.targetStrikePriceEvent;
    }

    public final UiEvent<OptionChainListViewState.ScrollTarget> getScrollTargetEvent() {
        return this.scrollTargetEvent;
    }

    public final StrategyBuilderSentiment getSelectedSentiment() {
        return this.selectedSentiment;
    }

    public final OptionSettings.TradingOnExpirationState getTradeOnExpirationState() {
        return this.tradeOnExpirationState;
    }

    public final Quote getUnderlyingQuote() {
        return this.underlyingQuote;
    }

    public final IndexValue getUnderlyingIndexValue() {
        return this.underlyingIndexValue;
    }

    public final IndexCloseValue getUnderlyingIndexCloseValue() {
        return this.underlyingIndexCloseValue;
    }

    public final UiEvent<UpsellHook> getUpsellHookEvent() {
        return this.upsellHookEvent;
    }

    public final OptionChainSelectedMetrics getBuySelectedMetrics() {
        return this.buySelectedMetrics;
    }

    public final OptionChainSelectedMetrics getSellSelectedMetrics() {
        return this.sellSelectedMetrics;
    }

    public final OptionTooltip getTooltip() {
        return this.tooltip;
    }

    public final UiEvent<OptionChainCustomizationErrorEvent> getChainCustomizationErrorEvent() {
        return this.chainCustomizationErrorEvent;
    }

    public final boolean getShouldShowDiscoverZeroDteBottomSheetInCurrentSession() {
        return this.shouldShowDiscoverZeroDteBottomSheetInCurrentSession;
    }

    public final UiEvent<String> getShowDiscoverZeroDteSnackbarEvent() {
        return this.showDiscoverZeroDteSnackbarEvent;
    }

    public final OptionDiscoverZeroDteSnackbarState getDiscoverZeroDteSnackbarState() {
        return this.discoverZeroDteSnackbarState;
    }

    public final boolean isEtfSupported() {
        return this.isEtfSupported;
    }

    public final boolean getShouldShowMultipleUnderlyingsTooltip() {
        return this.shouldShowMultipleUnderlyingsTooltip;
    }

    public final boolean getShouldShowSettleOnOpenTooltip() {
        return this.shouldShowSettleOnOpenTooltip;
    }

    public final boolean getShouldShowSwitchFocusedToSbsTooltipPref() {
        return this.shouldShowSwitchFocusedToSbsTooltipPref;
    }

    public final boolean getSimulatedReturnChartShown() {
        return this.simulatedReturnChartShown;
    }

    public final boolean getSimulatedReturnSwitchChartTooltipShown() {
        return this.simulatedReturnSwitchChartTooltipShown;
    }

    public final UiEvent<Integer> getDefaultToNearestExpirationDateEvent() {
        return this.defaultToNearestExpirationDateEvent;
    }

    public final UiEvent<Unit> getDismissSelloutSnackbarEvent() {
        return this.dismissSelloutSnackbarEvent;
    }

    public final boolean getSelloutSnackbarDismissedOrElapsed() {
        return this.selloutSnackbarDismissedOrElapsed;
    }

    public final boolean isSelloutSnackbarDismissalExperimentEnabled() {
        return this.isSelloutSnackbarDismissalExperimentEnabled;
    }

    public final boolean getInSelloutImprovementExperiment() {
        return this.inSelloutImprovementExperiment;
    }

    public final boolean getInSnackbarDismissalFollowUpExperiment() {
        return this.inSnackbarDismissalFollowUpExperiment;
    }

    public final int getSettingGreenDotRemainingBlinks() {
        return this.settingGreenDotRemainingBlinks;
    }

    public final boolean isIndexOptionsExtendedHoursEnabled() {
        return this.isIndexOptionsExtendedHoursEnabled;
    }

    public final boolean isMemberPdtRevampV1() {
        return this.isMemberPdtRevampV1;
    }

    private final boolean isMultipleChain() {
        return this.uiOptionChains.size() > 1;
    }

    public final String getOptionChainSymbolForLogging() {
        return this.optionChainSymbolForLogging;
    }

    public final UUID getOptionChainIdForLogging() {
        return this.optionChainIdForLogging;
    }

    public final boolean getShowBuilder() {
        return this.showBuilder;
    }

    public final boolean getShouldIgnoreDefaultPricing() {
        return !this.launchMode.hasFeature(OptionChainLaunchMode.Feature.USE_DEFAULT_PRICING_SETTING);
    }

    /* renamed from: isOnBuilderPage, reason: from getter */
    public final boolean getIsOnBuilderPage() {
        return this.isOnBuilderPage;
    }

    public final boolean getShowOptionChainCustomizationGtmIacAlertSheet() {
        return this.showOptionChainCustomizationGtmIacAlertSheet;
    }

    public final boolean getShowNormalIacAlertSheet() {
        return this.showNormalIacAlertSheet;
    }

    public final boolean getShouldShowChainSettings() {
        return this.shouldShowChainSettings;
    }

    public final boolean getMultilegAvailable() {
        return this.multilegAvailable;
    }

    public final MultilegSelectionState getMultilegSelectionState() {
        return this.multilegSelectionState;
    }

    public final OptionDefaultPricingState getDefaultPricingState() {
        return this.defaultPricingState;
    }

    public final OptionChainViewState3 getChainSettingsIcon() {
        return this.chainSettingsIcon;
    }

    public final OptionChainTooltipBanner3 getTopTooltipBannerType(Clock clock) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        if (this.isOnBuilderPage || this.hasSeenTopTooltipBannerInThisSession || !Intrinsics.areEqual(isCurrentPageDisabled$feature_options_chain_externalDebug(clock), Boolean.FALSE) || !this.launchMode.hasFeature(OptionChainLaunchMode.Feature.SIMULATED_RETURN_PRE_TRADE_DEEPLINK)) {
            return null;
        }
        if (!this.launchMode.hasFeature(OptionChainLaunchMode.Feature.ONBOARDING_SEARCH_POPUP) || this.nuxSearchDismissed) {
            return this.multilegAvailable ? OptionChainTooltipBanner3.SELECT_TO_SIMULATE : OptionChainTooltipBanner3.TAP_TO_SIMULATE;
        }
        return null;
    }

    public final boolean shouldDismissSelloutSnackbar(Clock clock) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        return this.isSelloutSnackbarDismissalExperimentEnabled && isOnTodayTab(clock);
    }

    public final boolean getShouldShowSimulatedReturnSwitchChartTooltip() {
        return this.shouldShowSimulatedReturnSwitchChartTooltip;
    }

    public final boolean getShouldEmitChainCustomizationEvent() {
        return this.shouldEmitChainCustomizationEvent;
    }

    public final boolean getShouldShowShoppingCart() {
        return this.shouldShowShoppingCart;
    }

    public final ScarletOverlay getScarletOverlay() {
        return this.scarletOverlay;
    }

    /* renamed from: getAdjustedExpirationDateStates$feature_options_chain_externalDebug */
    public final List<OptionChainExpirationDateState> m2305xa66a829f() {
        List<OptionChainExpirationDateState> sortedExpirationDateStates = OptionChainExpirationDateState2.getSortedExpirationDateStates(this.uiOptionChains);
        OptionCurrentOrNextMarketDates optionCurrentOrNextMarketDates = this.currentOrNextMarketDates;
        if (optionCurrentOrNextMarketDates != null && !(this.launchMode instanceof OptionChainLaunchMode.Normal)) {
            sortedExpirationDateStates = OptionChainExpirationDateState2.adjust(sortedExpirationDateStates, this.tradeOnExpirationState, optionCurrentOrNextMarketDates);
        }
        return CollectionsKt.toList(CollectionsKt.toSortedSet(CollectionsKt.plus((Collection) sortedExpirationDateStates, (Iterable) this.existingPositionExpirationDateStates)));
    }

    public final List<OptionChainPage> getOptionChainPages() {
        OptionInstrument optionInstrumentToRoll;
        ArrayList arrayList = new ArrayList();
        Account account = this.account;
        if (account == null) {
            return arrayList;
        }
        if (this.showBuilder) {
            arrayList.add(OptionChainPage.BuilderPage.INSTANCE);
        }
        for (OptionChainExpirationDateState optionChainExpirationDateState : m2305xa66a829f()) {
            OptionConfigurationBundle optionConfigurationBundleByExpirationDateState = getOptionConfigurationBundleByExpirationDateState(optionChainExpirationDateState);
            if (optionConfigurationBundleByExpirationDateState != null) {
                ChainScrollTarget chainScrollTarget = this.chainScrollTarget;
                UUID id = null;
                UiEvent<OptionChainListViewState.ScrollTarget> uiEvent = Intrinsics.areEqual(chainScrollTarget != null ? chainScrollTarget.getExpirationDate() : null, optionChainExpirationDateState.getExpirationDate()) ? this.scrollTargetEvent : null;
                int size = arrayList.size();
                Integer num = this.currentPage;
                boolean z = num != null && size == num.intValue();
                Set<OptionChainLaunchMode.Feature> featureSet = this.launchMode.getFeatureSet();
                boolean z2 = this.multilegAvailable;
                OptionSettings.DefaultPricingSetting overallDefaultPricingType = this.defaultPricingState.getOverallDefaultPricingType();
                OptionChainConfiguration optionChainConfiguration = this.optionChainConfiguration;
                OptionChainLaunchMode optionChainLaunchMode = this.launchMode;
                OptionChainLaunchMode.RollingContractSelector rollingContractSelector = optionChainLaunchMode instanceof OptionChainLaunchMode.RollingContractSelector ? (OptionChainLaunchMode.RollingContractSelector) optionChainLaunchMode : null;
                if (rollingContractSelector != null && (optionInstrumentToRoll = rollingContractSelector.getOptionInstrumentToRoll()) != null) {
                    id = optionInstrumentToRoll.getId();
                }
                arrayList.add(new OptionChainPage.OptionExpirationDatePage(account, z, overallDefaultPricingType, featureSet, z2, optionChainConfiguration, optionConfigurationBundleByExpirationDateState, id, uiEvent, this.upsellHookEvent, this.discoverZeroDteSnackbarState, this.dismissSelloutSnackbarEvent, this.selloutSnackbarDismissedOrElapsed, this.isSelloutSnackbarDismissalExperimentEnabled, this.inSelloutImprovementExperiment, this.inSnackbarDismissalFollowUpExperiment));
            }
        }
        return CollectionsKt.toList(arrayList);
    }

    public final OptionChainLandingPageUnderlyingState getOptionChainLandingPageUnderlyingState() {
        return new OptionChainLandingPageUnderlyingState(this.currentOrNextMarketDates, getOptionChainLandingTabDataStates(), this.tradeOnExpirationState.isEnabled(), this.isIndexOptionsExtendedHoursEnabled);
    }

    private final List<OptionChainPageState> getOptionChainLandingTabDataStates() {
        OptionChainPageState optionChainPageState;
        List<OptionChainPage> optionChainPages = getOptionChainPages();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(optionChainPages, 10));
        int i = 0;
        for (Object obj : optionChainPages) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            OptionChainPage optionChainPage = (OptionChainPage) obj;
            if (optionChainPage instanceof OptionChainPage.OptionExpirationDatePage) {
                OptionChainPage.OptionExpirationDatePage optionExpirationDatePage = (OptionChainPage.OptionExpirationDatePage) optionChainPage;
                optionChainPageState = new OptionChainPageState(optionExpirationDatePage.getOptionConfigurationBundle().getOptionChainBundle().getUiOptionChain(), optionExpirationDatePage.getOptionConfigurationBundle().getExpirationDate(), i);
            } else {
                optionChainPageState = null;
            }
            arrayList.add(optionChainPageState);
            i = i2;
        }
        return CollectionsKt.filterNotNull(arrayList);
    }

    public final OptionChainPagesWithScrollEvents getOptionChainPagesWithScrollEvents() {
        UiEvent<Integer> uiEvent;
        UiEvent<Tuples2<BigDecimal, Integer>> uiEvent2;
        List<OptionChainPage> optionChainPages = getOptionChainPages();
        UiEvent<ImmutableList<UiOptionStrategyLegDisplay>> uiEvent3 = this.targetExpirationPageFromTargetLegsEvent;
        UiEvent<OptionChainExpirationDateState> uiEvent4 = this.targetExpirationPageFromSbsChainEvent;
        UiEvent<Tuples2<BigDecimal, Integer>> uiEvent5 = null;
        UiEvent<ImmutableList<UiOptionStrategyLegDisplay>> uiEvent6 = uiEvent4 == null ? uiEvent3 : null;
        UiEvent<Tuples2<BigDecimal, Integer>> uiEvent7 = this.targetStrikePriceEvent;
        if (uiEvent4 == null) {
            uiEvent = null;
            uiEvent5 = uiEvent7;
            uiEvent2 = uiEvent5;
        } else {
            uiEvent = null;
            uiEvent2 = uiEvent7;
        }
        UiEvent<OptionInstrument> uiEvent8 = this.rollingExpirationDateEvent;
        UiEvent<Integer> uiEvent9 = this.defaultToNearestExpirationDateEvent;
        if (uiEvent4 == null && uiEvent3 == null && uiEvent2 == null) {
            uiEvent = uiEvent9;
        }
        return new OptionChainPagesWithScrollEvents(optionChainPages, uiEvent6, uiEvent4, uiEvent5, uiEvent8, uiEvent);
    }

    public final UiOptionChain getSelectedUiOptionChain() {
        Integer num = this.currentPage;
        if (num != null) {
            OptionChainPage optionChainPage = (OptionChainPage) CollectionsKt.getOrNull(getOptionChainPages(), num.intValue());
            if (optionChainPage != null && (optionChainPage instanceof OptionChainPage.OptionExpirationDatePage)) {
                return ((OptionChainPage.OptionExpirationDatePage) optionChainPage).getOptionConfigurationBundle().getOptionChainBundle().getUiOptionChain();
            }
        }
        return null;
    }

    public final OptionChainExpirationDateState getSelectedOptionChainExpirationDateState() {
        Integer num = this.currentPage;
        if (num != null) {
            Object orNull = CollectionsKt.getOrNull(getOptionChainPages(), num.intValue());
            OptionChainPage.OptionExpirationDatePage optionExpirationDatePage = orNull instanceof OptionChainPage.OptionExpirationDatePage ? (OptionChainPage.OptionExpirationDatePage) orNull : null;
            if (optionExpirationDatePage != null) {
                return new OptionChainExpirationDateState(optionExpirationDatePage.getOptionConfigurationBundle().getExpirationDate(), optionExpirationDatePage.getOptionConfigurationBundle().getOptionChainBundle().getUiOptionChain());
            }
        }
        return null;
    }

    public final String getOptionOrderFilterKey() {
        return this.optionOrderFilterKey;
    }

    public final OptionOrderFilter getSelectedOptionOrderFilter() {
        OrderSide orderSide;
        OptionContractType optionContractType = this.selectedContractType;
        if (optionContractType == null || (orderSide = this.selectedOrderSide) == null) {
            return null;
        }
        return new OptionOrderFilter(this.optionOrderFilterKey, optionContractType, orderSide);
    }

    public final LocalDate getCurrentExpirationDate() {
        OptionChainPage optionChainPage;
        if (this.currentPage == null || (optionChainPage = (OptionChainPage) CollectionsKt.getOrNull(getOptionChainPages(), this.currentPage.intValue())) == null || !(optionChainPage instanceof OptionChainPage.OptionExpirationDatePage)) {
            return null;
        }
        return ((OptionChainPage.OptionExpirationDatePage) optionChainPage).getOptionConfigurationBundle().getExpirationDate();
    }

    public final CurrentSelloutTimeQueryParams getCurrentSelloutTimeQueryParams() {
        OptionChain optionChain;
        OptionOrderFilter selectedOptionOrderFilter;
        LocalDate currentExpirationDate;
        UiOptionChain selectedUiOptionChain = getSelectedUiOptionChain();
        if (selectedUiOptionChain == null || (optionChain = selectedUiOptionChain.getOptionChain()) == null || (selectedOptionOrderFilter = getSelectedOptionOrderFilter()) == null || (currentExpirationDate = getCurrentExpirationDate()) == null) {
            return null;
        }
        return new CurrentSelloutTimeQueryParams(optionChain.getId(), selectedOptionOrderFilter.getContractType(), currentExpirationDate);
    }

    /* compiled from: OptionChainViewState.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u000f¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/optionschain/OptionChainViewState$CurrentSelloutTimeQueryParams;", "", "Ljava/util/UUID;", "optionChainId", "Lcom/robinhood/models/db/OptionContractType;", "contractType", "j$/time/LocalDate", "expirationDate", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/db/OptionContractType;Lj$/time/LocalDate;)V", "component1", "()Ljava/util/UUID;", "component2", "()Lcom/robinhood/models/db/OptionContractType;", "component3", "()Lj$/time/LocalDate;", "copy", "(Ljava/util/UUID;Lcom/robinhood/models/db/OptionContractType;Lj$/time/LocalDate;)Lcom/robinhood/android/optionschain/OptionChainViewState$CurrentSelloutTimeQueryParams;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/UUID;", "getOptionChainId", "Lcom/robinhood/models/db/OptionContractType;", "getContractType", "Lj$/time/LocalDate;", "getExpirationDate", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class CurrentSelloutTimeQueryParams {
        public static final int $stable = 8;
        private final OptionContractType contractType;
        private final LocalDate expirationDate;
        private final UUID optionChainId;

        public static /* synthetic */ CurrentSelloutTimeQueryParams copy$default(CurrentSelloutTimeQueryParams currentSelloutTimeQueryParams, UUID uuid, OptionContractType optionContractType, LocalDate localDate, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = currentSelloutTimeQueryParams.optionChainId;
            }
            if ((i & 2) != 0) {
                optionContractType = currentSelloutTimeQueryParams.contractType;
            }
            if ((i & 4) != 0) {
                localDate = currentSelloutTimeQueryParams.expirationDate;
            }
            return currentSelloutTimeQueryParams.copy(uuid, optionContractType, localDate);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getOptionChainId() {
            return this.optionChainId;
        }

        /* renamed from: component2, reason: from getter */
        public final OptionContractType getContractType() {
            return this.contractType;
        }

        /* renamed from: component3, reason: from getter */
        public final LocalDate getExpirationDate() {
            return this.expirationDate;
        }

        public final CurrentSelloutTimeQueryParams copy(UUID optionChainId, OptionContractType contractType, LocalDate expirationDate) {
            Intrinsics.checkNotNullParameter(optionChainId, "optionChainId");
            Intrinsics.checkNotNullParameter(contractType, "contractType");
            Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
            return new CurrentSelloutTimeQueryParams(optionChainId, contractType, expirationDate);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CurrentSelloutTimeQueryParams)) {
                return false;
            }
            CurrentSelloutTimeQueryParams currentSelloutTimeQueryParams = (CurrentSelloutTimeQueryParams) other;
            return Intrinsics.areEqual(this.optionChainId, currentSelloutTimeQueryParams.optionChainId) && this.contractType == currentSelloutTimeQueryParams.contractType && Intrinsics.areEqual(this.expirationDate, currentSelloutTimeQueryParams.expirationDate);
        }

        public int hashCode() {
            return (((this.optionChainId.hashCode() * 31) + this.contractType.hashCode()) * 31) + this.expirationDate.hashCode();
        }

        public String toString() {
            return "CurrentSelloutTimeQueryParams(optionChainId=" + this.optionChainId + ", contractType=" + this.contractType + ", expirationDate=" + this.expirationDate + ")";
        }

        public CurrentSelloutTimeQueryParams(UUID optionChainId, OptionContractType contractType, LocalDate expirationDate) {
            Intrinsics.checkNotNullParameter(optionChainId, "optionChainId");
            Intrinsics.checkNotNullParameter(contractType, "contractType");
            Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
            this.optionChainId = optionChainId;
            this.contractType = contractType;
            this.expirationDate = expirationDate;
        }

        public final UUID getOptionChainId() {
            return this.optionChainId;
        }

        public final OptionContractType getContractType() {
            return this.contractType;
        }

        public final LocalDate getExpirationDate() {
            return this.expirationDate;
        }
    }

    /* renamed from: getCurrentOrNextMarketDateForSelectedExpDate$feature_options_chain_externalDebug */
    public final LocalDate m2306x2ac1eee6() {
        UiOptionChain selectedUiOptionChain;
        LocalDate currentExpirationDate;
        OptionCurrentOrNextMarketDates optionCurrentOrNextMarketDates = this.currentOrNextMarketDates;
        if (optionCurrentOrNextMarketDates == null || (selectedUiOptionChain = getSelectedUiOptionChain()) == null || (currentExpirationDate = getCurrentExpirationDate()) == null) {
            return null;
        }
        return optionCurrentOrNextMarketDates.getDate(OptionMarketHoursParam2.getOptionMarketHoursParam$default(selectedUiOptionChain, currentExpirationDate, null, 4, null));
    }

    /* renamed from: getDiscoverZeroDteSelloutTimeCheck$feature_options_chain_externalDebug */
    public final Boolean m2307x85dab0e9() {
        LocalDate localDateM2306x2ac1eee6 = m2306x2ac1eee6();
        Instant instant = this.currentSelloutTime;
        if (instant == null || localDateM2306x2ac1eee6 == null) {
            return null;
        }
        return Boolean.valueOf(Instants.toLocalDate$default(instant, null, 1, null).until(localDateM2306x2ac1eee6, ChronoUnit.DAYS) == 0 && Instant.now().compareTo(this.currentSelloutTime) < 0);
    }

    /* renamed from: isOnCurrentOrNextMarketDayExpirationPage$feature_options_chain_externalDebug */
    public final boolean m2308x4cc29574() {
        Integer num;
        OptionConfigurationBundle optionConfigurationBundle;
        LocalDate localDateM2306x2ac1eee6 = m2306x2ac1eee6();
        if (this.currentPage != null && localDateM2306x2ac1eee6 != null) {
            Iterator<OptionChainPage> it = getOptionChainPages().iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                OptionChainPage next = it.next();
                LocalDate expirationDate = null;
                OptionChainPage.OptionExpirationDatePage optionExpirationDatePage = next instanceof OptionChainPage.OptionExpirationDatePage ? (OptionChainPage.OptionExpirationDatePage) next : null;
                if (optionExpirationDatePage != null && (optionConfigurationBundle = optionExpirationDatePage.getOptionConfigurationBundle()) != null) {
                    expirationDate = optionConfigurationBundle.getExpirationDate();
                }
                if (Intrinsics.areEqual(expirationDate, localDateM2306x2ac1eee6)) {
                    break;
                }
                i++;
            }
            if (i >= 0 && (num = this.currentPage) != null && num.intValue() == i) {
                return true;
            }
        }
        return false;
    }

    public final IndexOptionsTooltip getIndexOptionsTooltip() {
        return this.indexOptionsTooltip;
    }

    public final SwitchFocusedToSbsTooltip getShowSwitchFocusedToSbsTooltip() {
        return this.showSwitchFocusedToSbsTooltip;
    }

    public final UpsellHook getUpsellType() {
        return this.upsellType;
    }

    public final OptionChainRollingHeaderView.RollingHeaderData getRollingHeaderData() {
        return this.rollingHeaderData;
    }

    public final boolean getShouldShowRollingHeaderView() {
        return this.shouldShowRollingHeaderView;
    }

    public final List<OptionStrategyBuilderAdapter2> getOptionStrategyBuilderData() {
        return this.optionStrategyBuilderData;
    }

    public final FragmentKey getOptionChainSettingsFragmentKey() {
        if (this.account == null || this.defaultPricingState == OptionDefaultPricingState.NOT_AVAILABLE) {
            return null;
        }
        return new OptionChainSettingsFragmentKey(this.account.getAccountNumber(), false, null, !this.shouldShowSwitchFocusedToSbsTooltipPref && getShouldBlinkNuxDotOnSettingsIcon(), this.launchMode, 6, null);
    }

    /* compiled from: OptionChainViewState.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/optionschain/OptionChainViewState$ExtendedOptionStrategyBuilderData;", "", "additionalCardData", "Lcom/robinhood/android/optionschain/OptionStrategyBuilderView$AdditionalCardData;", "optionStrategyBuilderData", "", "Lcom/robinhood/android/optionschain/strategybuilder/BuilderData;", "<init>", "(Lcom/robinhood/android/optionschain/OptionStrategyBuilderView$AdditionalCardData;Ljava/util/List;)V", "getAdditionalCardData", "()Lcom/robinhood/android/optionschain/OptionStrategyBuilderView$AdditionalCardData;", "getOptionStrategyBuilderData", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ExtendedOptionStrategyBuilderData {
        public static final int $stable = 8;
        private final OptionStrategyBuilderView.AdditionalCardData additionalCardData;
        private final List<OptionStrategyBuilderAdapter2> optionStrategyBuilderData;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ExtendedOptionStrategyBuilderData copy$default(ExtendedOptionStrategyBuilderData extendedOptionStrategyBuilderData, OptionStrategyBuilderView.AdditionalCardData additionalCardData, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                additionalCardData = extendedOptionStrategyBuilderData.additionalCardData;
            }
            if ((i & 2) != 0) {
                list = extendedOptionStrategyBuilderData.optionStrategyBuilderData;
            }
            return extendedOptionStrategyBuilderData.copy(additionalCardData, list);
        }

        /* renamed from: component1, reason: from getter */
        public final OptionStrategyBuilderView.AdditionalCardData getAdditionalCardData() {
            return this.additionalCardData;
        }

        public final List<OptionStrategyBuilderAdapter2> component2() {
            return this.optionStrategyBuilderData;
        }

        public final ExtendedOptionStrategyBuilderData copy(OptionStrategyBuilderView.AdditionalCardData additionalCardData, List<? extends OptionStrategyBuilderAdapter2> optionStrategyBuilderData) {
            Intrinsics.checkNotNullParameter(additionalCardData, "additionalCardData");
            Intrinsics.checkNotNullParameter(optionStrategyBuilderData, "optionStrategyBuilderData");
            return new ExtendedOptionStrategyBuilderData(additionalCardData, optionStrategyBuilderData);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ExtendedOptionStrategyBuilderData)) {
                return false;
            }
            ExtendedOptionStrategyBuilderData extendedOptionStrategyBuilderData = (ExtendedOptionStrategyBuilderData) other;
            return Intrinsics.areEqual(this.additionalCardData, extendedOptionStrategyBuilderData.additionalCardData) && Intrinsics.areEqual(this.optionStrategyBuilderData, extendedOptionStrategyBuilderData.optionStrategyBuilderData);
        }

        public int hashCode() {
            return (this.additionalCardData.hashCode() * 31) + this.optionStrategyBuilderData.hashCode();
        }

        public String toString() {
            return "ExtendedOptionStrategyBuilderData(additionalCardData=" + this.additionalCardData + ", optionStrategyBuilderData=" + this.optionStrategyBuilderData + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ExtendedOptionStrategyBuilderData(OptionStrategyBuilderView.AdditionalCardData additionalCardData, List<? extends OptionStrategyBuilderAdapter2> optionStrategyBuilderData) {
            Intrinsics.checkNotNullParameter(additionalCardData, "additionalCardData");
            Intrinsics.checkNotNullParameter(optionStrategyBuilderData, "optionStrategyBuilderData");
            this.additionalCardData = additionalCardData;
            this.optionStrategyBuilderData = optionStrategyBuilderData;
        }

        public final OptionStrategyBuilderView.AdditionalCardData getAdditionalCardData() {
            return this.additionalCardData;
        }

        public final List<OptionStrategyBuilderAdapter2> getOptionStrategyBuilderData() {
            return this.optionStrategyBuilderData;
        }
    }

    public final OptionStrategyBuilderView.AdditionalCardData getAdditionalCardData() {
        return this.additionalCardData;
    }

    private final boolean isOnTodayTab(Clock clock) {
        LocalDate currentExpirationDate = getCurrentExpirationDate();
        if (currentExpirationDate != null) {
            LocalDate localDateNow = LocalDate.now(clock);
            Intrinsics.checkNotNullExpressionValue(localDateNow, "now(...)");
            if (currentExpirationDate.until(localDateNow, ChronoUnit.DAYS) == 0) {
                return true;
            }
        }
        return false;
    }

    public final Boolean isCurrentPageDisabled$feature_options_chain_externalDebug(Clock clock) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        Integer num = this.currentPage;
        OptionLegBundle optionLegBundle = null;
        OptionChainPage optionChainPage = num != null ? (OptionChainPage) CollectionsKt.getOrNull(getOptionChainPages(), num.intValue()) : null;
        OptionChainPage.OptionExpirationDatePage optionExpirationDatePage = optionChainPage instanceof OptionChainPage.OptionExpirationDatePage ? (OptionChainPage.OptionExpirationDatePage) optionChainPage : null;
        if (optionExpirationDatePage == null) {
            return null;
        }
        UiOptionChain uiOptionChain = optionExpirationDatePage.getOptionConfigurationBundle().getOptionChainBundle().getUiOptionChain();
        Instant instant = this.currentSelloutTime;
        if (instant == null) {
            return null;
        }
        ImmutableList<OptionLegBundle> selectedLegs = this.optionChainConfiguration.getSelectedLegs();
        if (Instant.now(clock).compareTo(instant) <= 0) {
            Iterator<OptionLegBundle> it = selectedLegs.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                OptionLegBundle next = it.next();
                if (!Intrinsics.areEqual(next.getOptionConfigurationBundle().getOptionChainBundle().getOptionChainId(), uiOptionChain.getOptionChain().getId())) {
                    optionLegBundle = next;
                    break;
                }
            }
            if (optionLegBundle != null) {
                return Boolean.TRUE;
            }
            return Boolean.valueOf(m2308x4cc29574() && !this.tradeOnExpirationState.isEnabled());
        }
        return Boolean.TRUE;
    }

    public final String getTitle(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        String optionChainSymbolsDisplay = UiOptionChains.getOptionChainSymbolsDisplay(this.uiOptionChains);
        if (this.isOnBuilderPage) {
            return resources.getString(C24135R.string.option_builder_toolbar_title, optionChainSymbolsDisplay);
        }
        if (this.optionOrderFilter == null) {
            return null;
        }
        OptionChainLaunchMode optionChainLaunchMode = this.launchMode;
        if ((optionChainLaunchMode instanceof OptionChainLaunchMode.Normal) || Intrinsics.areEqual(optionChainLaunchMode, OptionChainLaunchMode.WatchlistSearch.INSTANCE) || Intrinsics.areEqual(optionChainLaunchMode, OptionChainLaunchMode.WatchlistOnboarding.INSTANCE) || Intrinsics.areEqual(optionChainLaunchMode, OptionChainLaunchMode.ChainCustomizationGtm.INSTANCE) || Intrinsics.areEqual(optionChainLaunchMode, OptionChainLaunchMode.SideBySideChainOnboardingFirstStep.INSTANCE) || Intrinsics.areEqual(optionChainLaunchMode, OptionChainLaunchMode.SideBySideChainOnboardingSecondStep.INSTANCE) || Intrinsics.areEqual(optionChainLaunchMode, OptionChainLaunchMode.SimulatedReturnPreTradeOnboardingFirstStep.INSTANCE) || Intrinsics.areEqual(optionChainLaunchMode, OptionChainLaunchMode.SimulatedReturnPreTradeOnboardingSecondStep.INSTANCE)) {
            return resources.getString(C24135R.string.option_order_select_contract_title, UiOptionOrders3.getSideString(resources, this.optionOrderFilter.getSide()), optionChainSymbolsDisplay, OptionExtensions.getContractTypeString$default(resources, this.optionOrderFilter.getContractType(), 0, 4, null));
        }
        if (!(optionChainLaunchMode instanceof OptionChainLaunchMode.RollingContractSelector)) {
            throw new NoWhenBranchMatchedException();
        }
        return resources.getString(C24135R.string.option_contract_selector_roll_title, optionChainSymbolsDisplay, OptionExtensions.getName(OptionStrategyType.INSTANCE.from(((OptionChainLaunchMode.RollingContractSelector) this.launchMode).getPositionType(), this.optionOrderFilter.getContractType()), resources, 1));
    }

    public final String getSubtitle(Resources res) {
        Account account;
        DisplayName displayName;
        DisplayName.Variants withAccount;
        StringResource title;
        CharSequence text;
        DisplayName displayName2;
        DisplayName.Variants withAccount2;
        StringResource title2;
        CharSequence text2;
        Intrinsics.checkNotNullParameter(res, "res");
        boolean z = this.hasMultipleAccounts;
        if (z && this.isOnBuilderPage) {
            Account account2 = this.account;
            if (account2 == null || (displayName2 = AccountDisplayNames.getDisplayName(account2)) == null || (withAccount2 = displayName2.getWithAccount()) == null || (title2 = withAccount2.getTitle()) == null || (text2 = title2.getText(res)) == null) {
                return null;
            }
            return text2.toString();
        }
        if (!z || (account = this.account) == null || (displayName = AccountDisplayNames.getDisplayName(account)) == null || (withAccount = displayName.getWithAccount()) == null || (title = withAccount.getTitle()) == null || (text = title.getText(res)) == null) {
            return null;
        }
        return text.toString();
    }

    private final boolean getShouldBlinkNuxDotOnSettingsIcon() {
        return !this.isOnboardingSearchSelectorVisible && !this.hasSeenSbsNuxRevampChainSettings && this.inSideBySideNuxRevampExperiment && (this.launchMode instanceof OptionChainLaunchMode.Normal);
    }

    public final OptionChainToolbarState getToolbarState(Resources resources, Clock clock) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(clock, "clock");
        if (this.isOnboardingSearchSelectorVisible) {
            return new OptionChainToolbarState(null, null, false, new OptionChainToolbarMenuState(false, OptionChainViewState3.NONE, false, getShouldBlinkNuxDotOnSettingsIcon()));
        }
        return new OptionChainToolbarState(getTitle(resources), getSubtitle(resources), shouldDismissSelloutSnackbar(clock), new OptionChainToolbarMenuState(this.multilegSelectionState == MultilegSelectionState.MULTILEG_CLEAR, this.chainSettingsIcon, !this.hasSeenChainSettings, getShouldBlinkNuxDotOnSettingsIcon()));
    }

    private final OptionConfigurationBundle getOptionConfigurationBundleByExpirationDateState(OptionChainExpirationDateState expirationDateState) {
        OptionOrderFilter optionOrderFilter = this.optionOrderFilter;
        if (optionOrderFilter == null) {
            return null;
        }
        Instrument instrument = this.equityInstrument;
        return new OptionConfigurationBundle(new OptionChainBundle(instrument != null ? instrument.getId() : null, expirationDateState.getUiOptionChain().getOptionChain().getId(), expirationDateState.getUiOptionChain()), expirationDateState.getExpirationDate(), optionOrderFilter.getContractType(), optionOrderFilter.getSide());
    }

    public final OptionOrderIntentKey.FromOptionOrderBundle getOptionOrderIntentKey(ImmutableList<OptionLegBundle> legs) {
        String accountNumber;
        Intrinsics.checkNotNullParameter(legs, "legs");
        if (legs.isEmpty()) {
            return null;
        }
        OptionOrderBundle optionOrderBundle = new OptionOrderBundle(legs, null, 2, null);
        OptionOrderFormSource optionOrderFormSource = OptionOrderFormSource.OPTION_CHAIN;
        OptionSettings.DefaultPricingSetting defaultPricingSettingForOptionOrder = this.defaultPricingState.getDefaultPricingSettingForOptionOrder();
        boolean z = !this.launchMode.getFeatureSet().contains(OptionChainLaunchMode.Feature.USE_DEFAULT_PRICING_SETTING);
        Account account = this.account;
        if (account == null || (accountNumber = account.getAccountNumber()) == null) {
            return null;
        }
        return new OptionOrderIntentKey.FromOptionOrderBundle(defaultPricingSettingForOptionOrder, accountNumber, optionOrderBundle, null, null, null, null, false, false, z, OptionChainDisplayMode.DEFAULT, optionOrderFormSource, null, TransitionReason.OPTION_TRADE_CHAIN, 4600, null);
    }

    public final ShoppingCartConfigData getShoppingCartConfigData() {
        String accountNumber;
        Account account = this.account;
        if (account == null || (accountNumber = account.getAccountNumber()) == null) {
            return null;
        }
        return new ShoppingCartConfigData(accountNumber, getOptionOrderIntentKey(this.optionChainConfiguration.getSelectedLegs()), this.shouldShowShoppingCart);
    }

    /* compiled from: OptionChainViewState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/optionschain/OptionChainViewState$ShoppingCartConfigData;", "", "accountNumber", "", "optionOrderIntentKey", "Lcom/robinhood/android/options/contracts/OptionOrderIntentKey$FromOptionOrderBundle;", "shouldShowShoppingCart", "", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/options/contracts/OptionOrderIntentKey$FromOptionOrderBundle;Z)V", "getAccountNumber", "()Ljava/lang/String;", "getOptionOrderIntentKey", "()Lcom/robinhood/android/options/contracts/OptionOrderIntentKey$FromOptionOrderBundle;", "getShouldShowShoppingCart", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShoppingCartConfigData {
        public static final int $stable = 8;
        private final String accountNumber;
        private final OptionOrderIntentKey.FromOptionOrderBundle optionOrderIntentKey;
        private final boolean shouldShowShoppingCart;

        public static /* synthetic */ ShoppingCartConfigData copy$default(ShoppingCartConfigData shoppingCartConfigData, String str, OptionOrderIntentKey.FromOptionOrderBundle fromOptionOrderBundle, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = shoppingCartConfigData.accountNumber;
            }
            if ((i & 2) != 0) {
                fromOptionOrderBundle = shoppingCartConfigData.optionOrderIntentKey;
            }
            if ((i & 4) != 0) {
                z = shoppingCartConfigData.shouldShowShoppingCart;
            }
            return shoppingCartConfigData.copy(str, fromOptionOrderBundle, z);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final OptionOrderIntentKey.FromOptionOrderBundle getOptionOrderIntentKey() {
            return this.optionOrderIntentKey;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getShouldShowShoppingCart() {
            return this.shouldShowShoppingCart;
        }

        public final ShoppingCartConfigData copy(String accountNumber, OptionOrderIntentKey.FromOptionOrderBundle optionOrderIntentKey, boolean shouldShowShoppingCart) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            return new ShoppingCartConfigData(accountNumber, optionOrderIntentKey, shouldShowShoppingCart);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShoppingCartConfigData)) {
                return false;
            }
            ShoppingCartConfigData shoppingCartConfigData = (ShoppingCartConfigData) other;
            return Intrinsics.areEqual(this.accountNumber, shoppingCartConfigData.accountNumber) && Intrinsics.areEqual(this.optionOrderIntentKey, shoppingCartConfigData.optionOrderIntentKey) && this.shouldShowShoppingCart == shoppingCartConfigData.shouldShowShoppingCart;
        }

        public int hashCode() {
            int iHashCode = this.accountNumber.hashCode() * 31;
            OptionOrderIntentKey.FromOptionOrderBundle fromOptionOrderBundle = this.optionOrderIntentKey;
            return ((iHashCode + (fromOptionOrderBundle == null ? 0 : fromOptionOrderBundle.hashCode())) * 31) + Boolean.hashCode(this.shouldShowShoppingCart);
        }

        public String toString() {
            return "ShoppingCartConfigData(accountNumber=" + this.accountNumber + ", optionOrderIntentKey=" + this.optionOrderIntentKey + ", shouldShowShoppingCart=" + this.shouldShowShoppingCart + ")";
        }

        public ShoppingCartConfigData(String accountNumber, OptionOrderIntentKey.FromOptionOrderBundle fromOptionOrderBundle, boolean z) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            this.accountNumber = accountNumber;
            this.optionOrderIntentKey = fromOptionOrderBundle;
            this.shouldShowShoppingCart = z;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final OptionOrderIntentKey.FromOptionOrderBundle getOptionOrderIntentKey() {
            return this.optionOrderIntentKey;
        }

        public final boolean getShouldShowShoppingCart() {
            return this.shouldShowShoppingCart;
        }
    }

    /* compiled from: OptionChainViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u000e2\u00020\u0001:\u0003\f\r\u000eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&R\u0016\u0010\b\u001a\u0004\u0018\u00010\t8gX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0002\u000f\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/optionschain/OptionChainViewState$OptionChainPage;", "", "<init>", "()V", "getTabTitle", "", "resources", "Landroid/content/res/Resources;", "leadingTabIconImageRes", "", "getLeadingTabIconImageRes", "()Ljava/lang/Integer;", "BuilderPage", "OptionExpirationDatePage", "Companion", "Lcom/robinhood/android/optionschain/OptionChainViewState$OptionChainPage$BuilderPage;", "Lcom/robinhood/android/optionschain/OptionChainViewState$OptionChainPage$OptionExpirationDatePage;", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class OptionChainPage {
        public static final int $stable = 0;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final DiffCallbacks3<OptionChainPage> diffCallback = new DiffCallbacks3<OptionChainPage>() { // from class: com.robinhood.android.optionschain.OptionChainViewState$OptionChainPage$Companion$diffCallback$1
            @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
            public boolean areItemsTheSame(OptionChainViewState.OptionChainPage oldItem, OptionChainViewState.OptionChainPage newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                if (oldItem instanceof OptionChainViewState.OptionChainPage.BuilderPage) {
                    return newItem instanceof OptionChainViewState.OptionChainPage.BuilderPage;
                }
                if (oldItem instanceof OptionChainViewState.OptionChainPage.OptionExpirationDatePage) {
                    return (newItem instanceof OptionChainViewState.OptionChainPage.OptionExpirationDatePage) && Intrinsics.areEqual(((OptionChainViewState.OptionChainPage.OptionExpirationDatePage) oldItem).getOptionConfigurationBundle().getExpirationDate(), ((OptionChainViewState.OptionChainPage.OptionExpirationDatePage) newItem).getOptionConfigurationBundle().getExpirationDate());
                }
                throw new NoWhenBranchMatchedException();
            }

            @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
            @SuppressLint({"DiffUtilEquals"})
            public boolean areContentsTheSame(OptionChainViewState.OptionChainPage oldItem, OptionChainViewState.OptionChainPage newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.areEqual(oldItem, newItem);
            }
        };

        public /* synthetic */ OptionChainPage(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract Integer getLeadingTabIconImageRes();

        public abstract String getTabTitle(Resources resources);

        private OptionChainPage() {
        }

        /* compiled from: OptionChainViewState.kt */
        @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/optionschain/OptionChainViewState$OptionChainPage$BuilderPage;", "Lcom/robinhood/android/optionschain/OptionChainViewState$OptionChainPage;", "<init>", "()V", "getTabTitle", "", "resources", "Landroid/content/res/Resources;", "leadingTabIconImageRes", "", "getLeadingTabIconImageRes", "()Ljava/lang/Integer;", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class BuilderPage extends OptionChainPage {
            public static final int $stable = 0;
            public static final BuilderPage INSTANCE = new BuilderPage();
            private static final int leadingTabIconImageRes = C24135R.drawable.option_strategy_builder_tab_icon;

            private BuilderPage() {
                super(null);
            }

            @Override // com.robinhood.android.optionschain.OptionChainViewState.OptionChainPage
            public String getTabTitle(Resources resources) throws Resources.NotFoundException {
                Intrinsics.checkNotNullParameter(resources, "resources");
                String string2 = resources.getString(C24135R.string.option_builder_title);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return string2;
            }

            @Override // com.robinhood.android.optionschain.OptionChainViewState.OptionChainPage
            public Integer getLeadingTabIconImageRes() {
                return Integer.valueOf(leadingTabIconImageRes);
            }
        }

        /* compiled from: OptionChainViewState.kt */
        @Metadata(m3635d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B©\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0013\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0013\u0012\u0006\u0010\u001b\u001a\u00020\u0005\u0012\u0006\u0010\u001c\u001a\u00020\u0005\u0012\u0006\u0010\u001d\u001a\u00020\u0005\u0012\u0006\u0010\u001e\u001a\u00020\u0005¢\u0006\u0004\b\u001f\u0010 J\u0010\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;H\u0016J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\u0005HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000f\u0010D\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\t\u0010E\u001a\u00020\u0005HÆ\u0003J\t\u0010F\u001a\u00020\rHÆ\u0003J\t\u0010G\u001a\u00020\u000fHÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u0011\u0010I\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013HÆ\u0003J\u0011\u0010J\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0013HÆ\u0003J\t\u0010K\u001a\u00020\u0018HÆ\u0003J\u0011\u0010L\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0013HÆ\u0003J\t\u0010M\u001a\u00020\u0005HÆ\u0003J\t\u0010N\u001a\u00020\u0005HÆ\u0003J\t\u0010O\u001a\u00020\u0005HÆ\u0003J\t\u0010P\u001a\u00020\u0005HÆ\u0003JË\u0001\u0010Q\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00132\b\b\u0002\u0010\u001b\u001a\u00020\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u00052\b\b\u0002\u0010\u001d\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\u0005HÆ\u0001J\u0013\u0010R\u001a\u00020\u00052\b\u0010S\u001a\u0004\u0018\u00010THÖ\u0003J\t\u0010U\u001a\u00020=HÖ\u0001J\t\u0010V\u001a\u000209HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010#R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010#R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0019\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0019\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b1\u00100R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0019\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b4\u00100R\u0011\u0010\u001b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b5\u0010#R\u0011\u0010\u001c\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010#R\u0011\u0010\u001d\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b6\u0010#R\u0011\u0010\u001e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b7\u0010#R\u0018\u0010<\u001a\u0004\u0018\u00010=X\u0096\u0004¢\u0006\n\n\u0002\u0010@\u001a\u0004\b>\u0010?¨\u0006W"}, m3636d2 = {"Lcom/robinhood/android/optionschain/OptionChainViewState$OptionChainPage$OptionExpirationDatePage;", "Lcom/robinhood/android/optionschain/OptionChainViewState$OptionChainPage;", "account", "Lcom/robinhood/models/db/Account;", "isCurrentPage", "", "defaultPricingType", "Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;", "featureSet", "", "Lcom/robinhood/android/options/contracts/OptionChainLaunchMode$Feature;", "multilegAvailable", "optionChainConfiguration", "Lcom/robinhood/android/optionschain/OptionChainConfiguration;", "optionConfigurationBundle", "Lcom/robinhood/models/ui/OptionConfigurationBundle;", "optionInstrumentToRollId", "Ljava/util/UUID;", "scrollTargetEvent", "Lcom/robinhood/udf/UiEvent;", "Lcom/robinhood/android/optionschain/OptionChainListViewState$ScrollTarget;", "upsellHookEvent", "Lcom/robinhood/android/optionschain/OptionChainViewState$UpsellHook;", "discoverZeroDteSnackbarState", "Lcom/robinhood/android/common/options/upsell/fridaytrading/OptionDiscoverZeroDteSnackbarState;", "dismissSelloutSnackbarEvent", "", "selloutSnackbarDismissedOrElapsed", "isSelloutSnackbarDismissalExperimentEnabled", "inSelloutImprovementExperiment", "inSnackbarDismissalFollowUpExperiment", "<init>", "(Lcom/robinhood/models/db/Account;ZLcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;Ljava/util/Set;ZLcom/robinhood/android/optionschain/OptionChainConfiguration;Lcom/robinhood/models/ui/OptionConfigurationBundle;Ljava/util/UUID;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/android/common/options/upsell/fridaytrading/OptionDiscoverZeroDteSnackbarState;Lcom/robinhood/udf/UiEvent;ZZZZ)V", "getAccount", "()Lcom/robinhood/models/db/Account;", "()Z", "getDefaultPricingType", "()Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;", "getFeatureSet", "()Ljava/util/Set;", "getMultilegAvailable", "getOptionChainConfiguration", "()Lcom/robinhood/android/optionschain/OptionChainConfiguration;", "getOptionConfigurationBundle", "()Lcom/robinhood/models/ui/OptionConfigurationBundle;", "getOptionInstrumentToRollId", "()Ljava/util/UUID;", "getScrollTargetEvent", "()Lcom/robinhood/udf/UiEvent;", "getUpsellHookEvent", "getDiscoverZeroDteSnackbarState", "()Lcom/robinhood/android/common/options/upsell/fridaytrading/OptionDiscoverZeroDteSnackbarState;", "getDismissSelloutSnackbarEvent", "getSelloutSnackbarDismissedOrElapsed", "getInSelloutImprovementExperiment", "getInSnackbarDismissalFollowUpExperiment", "getTabTitle", "", "resources", "Landroid/content/res/Resources;", "leadingTabIconImageRes", "", "getLeadingTabIconImageRes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "equals", "other", "", "hashCode", "toString", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class OptionExpirationDatePage extends OptionChainPage {
            public static final int $stable = 8;
            private final Account account;
            private final OptionSettings.DefaultPricingSetting defaultPricingType;
            private final OptionDiscoverZeroDteSnackbarState discoverZeroDteSnackbarState;
            private final UiEvent<Unit> dismissSelloutSnackbarEvent;
            private final Set<OptionChainLaunchMode.Feature> featureSet;
            private final boolean inSelloutImprovementExperiment;
            private final boolean inSnackbarDismissalFollowUpExperiment;
            private final boolean isCurrentPage;
            private final boolean isSelloutSnackbarDismissalExperimentEnabled;
            private final Integer leadingTabIconImageRes;
            private final boolean multilegAvailable;
            private final OptionChainConfiguration optionChainConfiguration;
            private final OptionConfigurationBundle optionConfigurationBundle;
            private final UUID optionInstrumentToRollId;
            private final UiEvent<OptionChainListViewState.ScrollTarget> scrollTargetEvent;
            private final boolean selloutSnackbarDismissedOrElapsed;
            private final UiEvent<UpsellHook> upsellHookEvent;

            /* renamed from: component1, reason: from getter */
            public final Account getAccount() {
                return this.account;
            }

            public final UiEvent<UpsellHook> component10() {
                return this.upsellHookEvent;
            }

            /* renamed from: component11, reason: from getter */
            public final OptionDiscoverZeroDteSnackbarState getDiscoverZeroDteSnackbarState() {
                return this.discoverZeroDteSnackbarState;
            }

            public final UiEvent<Unit> component12() {
                return this.dismissSelloutSnackbarEvent;
            }

            /* renamed from: component13, reason: from getter */
            public final boolean getSelloutSnackbarDismissedOrElapsed() {
                return this.selloutSnackbarDismissedOrElapsed;
            }

            /* renamed from: component14, reason: from getter */
            public final boolean getIsSelloutSnackbarDismissalExperimentEnabled() {
                return this.isSelloutSnackbarDismissalExperimentEnabled;
            }

            /* renamed from: component15, reason: from getter */
            public final boolean getInSelloutImprovementExperiment() {
                return this.inSelloutImprovementExperiment;
            }

            /* renamed from: component16, reason: from getter */
            public final boolean getInSnackbarDismissalFollowUpExperiment() {
                return this.inSnackbarDismissalFollowUpExperiment;
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getIsCurrentPage() {
                return this.isCurrentPage;
            }

            /* renamed from: component3, reason: from getter */
            public final OptionSettings.DefaultPricingSetting getDefaultPricingType() {
                return this.defaultPricingType;
            }

            public final Set<OptionChainLaunchMode.Feature> component4() {
                return this.featureSet;
            }

            /* renamed from: component5, reason: from getter */
            public final boolean getMultilegAvailable() {
                return this.multilegAvailable;
            }

            /* renamed from: component6, reason: from getter */
            public final OptionChainConfiguration getOptionChainConfiguration() {
                return this.optionChainConfiguration;
            }

            /* renamed from: component7, reason: from getter */
            public final OptionConfigurationBundle getOptionConfigurationBundle() {
                return this.optionConfigurationBundle;
            }

            /* renamed from: component8, reason: from getter */
            public final UUID getOptionInstrumentToRollId() {
                return this.optionInstrumentToRollId;
            }

            public final UiEvent<OptionChainListViewState.ScrollTarget> component9() {
                return this.scrollTargetEvent;
            }

            public final OptionExpirationDatePage copy(Account account, boolean isCurrentPage, OptionSettings.DefaultPricingSetting defaultPricingType, Set<? extends OptionChainLaunchMode.Feature> featureSet, boolean multilegAvailable, OptionChainConfiguration optionChainConfiguration, OptionConfigurationBundle optionConfigurationBundle, UUID optionInstrumentToRollId, UiEvent<OptionChainListViewState.ScrollTarget> scrollTargetEvent, UiEvent<UpsellHook> upsellHookEvent, OptionDiscoverZeroDteSnackbarState discoverZeroDteSnackbarState, UiEvent<Unit> dismissSelloutSnackbarEvent, boolean selloutSnackbarDismissedOrElapsed, boolean isSelloutSnackbarDismissalExperimentEnabled, boolean inSelloutImprovementExperiment, boolean inSnackbarDismissalFollowUpExperiment) {
                Intrinsics.checkNotNullParameter(account, "account");
                Intrinsics.checkNotNullParameter(featureSet, "featureSet");
                Intrinsics.checkNotNullParameter(optionChainConfiguration, "optionChainConfiguration");
                Intrinsics.checkNotNullParameter(optionConfigurationBundle, "optionConfigurationBundle");
                Intrinsics.checkNotNullParameter(discoverZeroDteSnackbarState, "discoverZeroDteSnackbarState");
                return new OptionExpirationDatePage(account, isCurrentPage, defaultPricingType, featureSet, multilegAvailable, optionChainConfiguration, optionConfigurationBundle, optionInstrumentToRollId, scrollTargetEvent, upsellHookEvent, discoverZeroDteSnackbarState, dismissSelloutSnackbarEvent, selloutSnackbarDismissedOrElapsed, isSelloutSnackbarDismissalExperimentEnabled, inSelloutImprovementExperiment, inSnackbarDismissalFollowUpExperiment);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof OptionExpirationDatePage)) {
                    return false;
                }
                OptionExpirationDatePage optionExpirationDatePage = (OptionExpirationDatePage) other;
                return Intrinsics.areEqual(this.account, optionExpirationDatePage.account) && this.isCurrentPage == optionExpirationDatePage.isCurrentPage && this.defaultPricingType == optionExpirationDatePage.defaultPricingType && Intrinsics.areEqual(this.featureSet, optionExpirationDatePage.featureSet) && this.multilegAvailable == optionExpirationDatePage.multilegAvailable && Intrinsics.areEqual(this.optionChainConfiguration, optionExpirationDatePage.optionChainConfiguration) && Intrinsics.areEqual(this.optionConfigurationBundle, optionExpirationDatePage.optionConfigurationBundle) && Intrinsics.areEqual(this.optionInstrumentToRollId, optionExpirationDatePage.optionInstrumentToRollId) && Intrinsics.areEqual(this.scrollTargetEvent, optionExpirationDatePage.scrollTargetEvent) && Intrinsics.areEqual(this.upsellHookEvent, optionExpirationDatePage.upsellHookEvent) && this.discoverZeroDteSnackbarState == optionExpirationDatePage.discoverZeroDteSnackbarState && Intrinsics.areEqual(this.dismissSelloutSnackbarEvent, optionExpirationDatePage.dismissSelloutSnackbarEvent) && this.selloutSnackbarDismissedOrElapsed == optionExpirationDatePage.selloutSnackbarDismissedOrElapsed && this.isSelloutSnackbarDismissalExperimentEnabled == optionExpirationDatePage.isSelloutSnackbarDismissalExperimentEnabled && this.inSelloutImprovementExperiment == optionExpirationDatePage.inSelloutImprovementExperiment && this.inSnackbarDismissalFollowUpExperiment == optionExpirationDatePage.inSnackbarDismissalFollowUpExperiment;
            }

            public int hashCode() {
                int iHashCode = ((this.account.hashCode() * 31) + Boolean.hashCode(this.isCurrentPage)) * 31;
                OptionSettings.DefaultPricingSetting defaultPricingSetting = this.defaultPricingType;
                int iHashCode2 = (((((((((iHashCode + (defaultPricingSetting == null ? 0 : defaultPricingSetting.hashCode())) * 31) + this.featureSet.hashCode()) * 31) + Boolean.hashCode(this.multilegAvailable)) * 31) + this.optionChainConfiguration.hashCode()) * 31) + this.optionConfigurationBundle.hashCode()) * 31;
                UUID uuid = this.optionInstrumentToRollId;
                int iHashCode3 = (iHashCode2 + (uuid == null ? 0 : uuid.hashCode())) * 31;
                UiEvent<OptionChainListViewState.ScrollTarget> uiEvent = this.scrollTargetEvent;
                int iHashCode4 = (iHashCode3 + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
                UiEvent<UpsellHook> uiEvent2 = this.upsellHookEvent;
                int iHashCode5 = (((iHashCode4 + (uiEvent2 == null ? 0 : uiEvent2.hashCode())) * 31) + this.discoverZeroDteSnackbarState.hashCode()) * 31;
                UiEvent<Unit> uiEvent3 = this.dismissSelloutSnackbarEvent;
                return ((((((((iHashCode5 + (uiEvent3 != null ? uiEvent3.hashCode() : 0)) * 31) + Boolean.hashCode(this.selloutSnackbarDismissedOrElapsed)) * 31) + Boolean.hashCode(this.isSelloutSnackbarDismissalExperimentEnabled)) * 31) + Boolean.hashCode(this.inSelloutImprovementExperiment)) * 31) + Boolean.hashCode(this.inSnackbarDismissalFollowUpExperiment);
            }

            public String toString() {
                return "OptionExpirationDatePage(account=" + this.account + ", isCurrentPage=" + this.isCurrentPage + ", defaultPricingType=" + this.defaultPricingType + ", featureSet=" + this.featureSet + ", multilegAvailable=" + this.multilegAvailable + ", optionChainConfiguration=" + this.optionChainConfiguration + ", optionConfigurationBundle=" + this.optionConfigurationBundle + ", optionInstrumentToRollId=" + this.optionInstrumentToRollId + ", scrollTargetEvent=" + this.scrollTargetEvent + ", upsellHookEvent=" + this.upsellHookEvent + ", discoverZeroDteSnackbarState=" + this.discoverZeroDteSnackbarState + ", dismissSelloutSnackbarEvent=" + this.dismissSelloutSnackbarEvent + ", selloutSnackbarDismissedOrElapsed=" + this.selloutSnackbarDismissedOrElapsed + ", isSelloutSnackbarDismissalExperimentEnabled=" + this.isSelloutSnackbarDismissalExperimentEnabled + ", inSelloutImprovementExperiment=" + this.inSelloutImprovementExperiment + ", inSnackbarDismissalFollowUpExperiment=" + this.inSnackbarDismissalFollowUpExperiment + ")";
            }

            public final Account getAccount() {
                return this.account;
            }

            public final boolean isCurrentPage() {
                return this.isCurrentPage;
            }

            public final OptionSettings.DefaultPricingSetting getDefaultPricingType() {
                return this.defaultPricingType;
            }

            public final Set<OptionChainLaunchMode.Feature> getFeatureSet() {
                return this.featureSet;
            }

            public final boolean getMultilegAvailable() {
                return this.multilegAvailable;
            }

            public final OptionChainConfiguration getOptionChainConfiguration() {
                return this.optionChainConfiguration;
            }

            public final OptionConfigurationBundle getOptionConfigurationBundle() {
                return this.optionConfigurationBundle;
            }

            public final UUID getOptionInstrumentToRollId() {
                return this.optionInstrumentToRollId;
            }

            public final UiEvent<OptionChainListViewState.ScrollTarget> getScrollTargetEvent() {
                return this.scrollTargetEvent;
            }

            public final UiEvent<UpsellHook> getUpsellHookEvent() {
                return this.upsellHookEvent;
            }

            public final OptionDiscoverZeroDteSnackbarState getDiscoverZeroDteSnackbarState() {
                return this.discoverZeroDteSnackbarState;
            }

            public final UiEvent<Unit> getDismissSelloutSnackbarEvent() {
                return this.dismissSelloutSnackbarEvent;
            }

            public final boolean getSelloutSnackbarDismissedOrElapsed() {
                return this.selloutSnackbarDismissedOrElapsed;
            }

            public final boolean isSelloutSnackbarDismissalExperimentEnabled() {
                return this.isSelloutSnackbarDismissalExperimentEnabled;
            }

            public final boolean getInSelloutImprovementExperiment() {
                return this.inSelloutImprovementExperiment;
            }

            public final boolean getInSnackbarDismissalFollowUpExperiment() {
                return this.inSnackbarDismissalFollowUpExperiment;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public OptionExpirationDatePage(Account account, boolean z, OptionSettings.DefaultPricingSetting defaultPricingSetting, Set<? extends OptionChainLaunchMode.Feature> featureSet, boolean z2, OptionChainConfiguration optionChainConfiguration, OptionConfigurationBundle optionConfigurationBundle, UUID uuid, UiEvent<OptionChainListViewState.ScrollTarget> uiEvent, UiEvent<UpsellHook> uiEvent2, OptionDiscoverZeroDteSnackbarState discoverZeroDteSnackbarState, UiEvent<Unit> uiEvent3, boolean z3, boolean z4, boolean z5, boolean z6) {
                super(null);
                Intrinsics.checkNotNullParameter(account, "account");
                Intrinsics.checkNotNullParameter(featureSet, "featureSet");
                Intrinsics.checkNotNullParameter(optionChainConfiguration, "optionChainConfiguration");
                Intrinsics.checkNotNullParameter(optionConfigurationBundle, "optionConfigurationBundle");
                Intrinsics.checkNotNullParameter(discoverZeroDteSnackbarState, "discoverZeroDteSnackbarState");
                this.account = account;
                this.isCurrentPage = z;
                this.defaultPricingType = defaultPricingSetting;
                this.featureSet = featureSet;
                this.multilegAvailable = z2;
                this.optionChainConfiguration = optionChainConfiguration;
                this.optionConfigurationBundle = optionConfigurationBundle;
                this.optionInstrumentToRollId = uuid;
                this.scrollTargetEvent = uiEvent;
                this.upsellHookEvent = uiEvent2;
                this.discoverZeroDteSnackbarState = discoverZeroDteSnackbarState;
                this.dismissSelloutSnackbarEvent = uiEvent3;
                this.selloutSnackbarDismissedOrElapsed = z3;
                this.isSelloutSnackbarDismissalExperimentEnabled = z4;
                this.inSelloutImprovementExperiment = z5;
                this.inSnackbarDismissalFollowUpExperiment = z6;
            }

            @Override // com.robinhood.android.optionschain.OptionChainViewState.OptionChainPage
            public String getTabTitle(Resources resources) {
                Intrinsics.checkNotNullParameter(resources, "resources");
                return DateStrings2.getExpirationStringMedium(resources, this.optionConfigurationBundle.getExpirationDate(), this.optionConfigurationBundle.getOptionChainBundle().getUiOptionChain().getOptionChain().getSettleOnOpen());
            }

            @Override // com.robinhood.android.optionschain.OptionChainViewState.OptionChainPage
            public Integer getLeadingTabIconImageRes() {
                return this.leadingTabIconImageRes;
            }
        }

        /* compiled from: OptionChainViewState.kt */
        @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/optionschain/OptionChainViewState$OptionChainPage$Companion;", "", "<init>", "()V", "diffCallback", "Lcom/robinhood/utils/ui/view/recyclerview/ItemCallbackAdapter;", "Lcom/robinhood/android/optionschain/OptionChainViewState$OptionChainPage;", "getDiffCallback", "()Lcom/robinhood/utils/ui/view/recyclerview/ItemCallbackAdapter;", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final DiffCallbacks3<OptionChainPage> getDiffCallback() {
                return OptionChainPage.diffCallback;
            }
        }
    }

    /* compiled from: OptionChainViewState.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/optionschain/OptionChainViewState$ChainScrollTarget;", "", "j$/time/LocalDate", "expirationDate", "Lcom/robinhood/android/optionschain/OptionChainListViewState$ScrollTarget;", "scrollTarget", "<init>", "(Lj$/time/LocalDate;Lcom/robinhood/android/optionschain/OptionChainListViewState$ScrollTarget;)V", "component1", "()Lj$/time/LocalDate;", "component2", "()Lcom/robinhood/android/optionschain/OptionChainListViewState$ScrollTarget;", "copy", "(Lj$/time/LocalDate;Lcom/robinhood/android/optionschain/OptionChainListViewState$ScrollTarget;)Lcom/robinhood/android/optionschain/OptionChainViewState$ChainScrollTarget;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lj$/time/LocalDate;", "getExpirationDate", "Lcom/robinhood/android/optionschain/OptionChainListViewState$ScrollTarget;", "getScrollTarget", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ChainScrollTarget {
        public static final int $stable = 8;
        private final LocalDate expirationDate;
        private final OptionChainListViewState.ScrollTarget scrollTarget;

        public static /* synthetic */ ChainScrollTarget copy$default(ChainScrollTarget chainScrollTarget, LocalDate localDate, OptionChainListViewState.ScrollTarget scrollTarget, int i, Object obj) {
            if ((i & 1) != 0) {
                localDate = chainScrollTarget.expirationDate;
            }
            if ((i & 2) != 0) {
                scrollTarget = chainScrollTarget.scrollTarget;
            }
            return chainScrollTarget.copy(localDate, scrollTarget);
        }

        /* renamed from: component1, reason: from getter */
        public final LocalDate getExpirationDate() {
            return this.expirationDate;
        }

        /* renamed from: component2, reason: from getter */
        public final OptionChainListViewState.ScrollTarget getScrollTarget() {
            return this.scrollTarget;
        }

        public final ChainScrollTarget copy(LocalDate expirationDate, OptionChainListViewState.ScrollTarget scrollTarget) {
            Intrinsics.checkNotNullParameter(scrollTarget, "scrollTarget");
            return new ChainScrollTarget(expirationDate, scrollTarget);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ChainScrollTarget)) {
                return false;
            }
            ChainScrollTarget chainScrollTarget = (ChainScrollTarget) other;
            return Intrinsics.areEqual(this.expirationDate, chainScrollTarget.expirationDate) && Intrinsics.areEqual(this.scrollTarget, chainScrollTarget.scrollTarget);
        }

        public int hashCode() {
            LocalDate localDate = this.expirationDate;
            return ((localDate == null ? 0 : localDate.hashCode()) * 31) + this.scrollTarget.hashCode();
        }

        public String toString() {
            return "ChainScrollTarget(expirationDate=" + this.expirationDate + ", scrollTarget=" + this.scrollTarget + ")";
        }

        public ChainScrollTarget(LocalDate localDate, OptionChainListViewState.ScrollTarget scrollTarget) {
            Intrinsics.checkNotNullParameter(scrollTarget, "scrollTarget");
            this.expirationDate = localDate;
            this.scrollTarget = scrollTarget;
        }

        public final LocalDate getExpirationDate() {
            return this.expirationDate;
        }

        public final OptionChainListViewState.ScrollTarget getScrollTarget() {
            return this.scrollTarget;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OptionChainViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/optionschain/OptionChainViewState$MultilegSelectionState;", "", "<init>", "(Ljava/lang/String;I)V", "MULTILEG_DISABLE", "MULTILEG_CLEAR", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultilegSelectionState {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ MultilegSelectionState[] $VALUES;
        public static final MultilegSelectionState MULTILEG_DISABLE = new MultilegSelectionState("MULTILEG_DISABLE", 0);
        public static final MultilegSelectionState MULTILEG_CLEAR = new MultilegSelectionState("MULTILEG_CLEAR", 1);

        private static final /* synthetic */ MultilegSelectionState[] $values() {
            return new MultilegSelectionState[]{MULTILEG_DISABLE, MULTILEG_CLEAR};
        }

        public static EnumEntries<MultilegSelectionState> getEntries() {
            return $ENTRIES;
        }

        private MultilegSelectionState(String str, int i) {
        }

        static {
            MultilegSelectionState[] multilegSelectionStateArr$values = $values();
            $VALUES = multilegSelectionStateArr$values;
            $ENTRIES = EnumEntries2.enumEntries(multilegSelectionStateArr$values);
        }

        public static MultilegSelectionState valueOf(String str) {
            return (MultilegSelectionState) Enum.valueOf(MultilegSelectionState.class, str);
        }

        public static MultilegSelectionState[] values() {
            return (MultilegSelectionState[]) $VALUES.clone();
        }
    }

    /* compiled from: OptionChainViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/optionschain/OptionChainViewState$UpsellHook;", "", "<init>", "()V", "SideBySideChain", "DoubleTapToWatch", "AlertSheet", "DiscoverZeroDte", "Lcom/robinhood/android/optionschain/OptionChainViewState$UpsellHook$AlertSheet;", "Lcom/robinhood/android/optionschain/OptionChainViewState$UpsellHook$DiscoverZeroDte;", "Lcom/robinhood/android/optionschain/OptionChainViewState$UpsellHook$DoubleTapToWatch;", "Lcom/robinhood/android/optionschain/OptionChainViewState$UpsellHook$SideBySideChain;", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class UpsellHook {
        public static final int $stable = 0;

        public /* synthetic */ UpsellHook(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private UpsellHook() {
        }

        /* compiled from: OptionChainViewState.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/optionschain/OptionChainViewState$UpsellHook$SideBySideChain;", "Lcom/robinhood/android/optionschain/OptionChainViewState$UpsellHook;", "optionLevel", "", "chainIdsForLogging", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getOptionLevel", "()Ljava/lang/String;", "getChainIdsForLogging", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class SideBySideChain extends UpsellHook {
            public static final int $stable = 0;
            private final String chainIdsForLogging;
            private final String optionLevel;

            public static /* synthetic */ SideBySideChain copy$default(SideBySideChain sideBySideChain, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = sideBySideChain.optionLevel;
                }
                if ((i & 2) != 0) {
                    str2 = sideBySideChain.chainIdsForLogging;
                }
                return sideBySideChain.copy(str, str2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getOptionLevel() {
                return this.optionLevel;
            }

            /* renamed from: component2, reason: from getter */
            public final String getChainIdsForLogging() {
                return this.chainIdsForLogging;
            }

            public final SideBySideChain copy(String optionLevel, String chainIdsForLogging) {
                Intrinsics.checkNotNullParameter(chainIdsForLogging, "chainIdsForLogging");
                return new SideBySideChain(optionLevel, chainIdsForLogging);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SideBySideChain)) {
                    return false;
                }
                SideBySideChain sideBySideChain = (SideBySideChain) other;
                return Intrinsics.areEqual(this.optionLevel, sideBySideChain.optionLevel) && Intrinsics.areEqual(this.chainIdsForLogging, sideBySideChain.chainIdsForLogging);
            }

            public int hashCode() {
                String str = this.optionLevel;
                return ((str == null ? 0 : str.hashCode()) * 31) + this.chainIdsForLogging.hashCode();
            }

            public String toString() {
                return "SideBySideChain(optionLevel=" + this.optionLevel + ", chainIdsForLogging=" + this.chainIdsForLogging + ")";
            }

            public final String getOptionLevel() {
                return this.optionLevel;
            }

            public final String getChainIdsForLogging() {
                return this.chainIdsForLogging;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SideBySideChain(String str, String chainIdsForLogging) {
                super(null);
                Intrinsics.checkNotNullParameter(chainIdsForLogging, "chainIdsForLogging");
                this.optionLevel = str;
                this.chainIdsForLogging = chainIdsForLogging;
            }
        }

        /* compiled from: OptionChainViewState.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/optionschain/OptionChainViewState$UpsellHook$DoubleTapToWatch;", "Lcom/robinhood/android/optionschain/OptionChainViewState$UpsellHook;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class DoubleTapToWatch extends UpsellHook {
            public static final int $stable = 0;
            public static final DoubleTapToWatch INSTANCE = new DoubleTapToWatch();

            public boolean equals(Object other) {
                return this == other || (other instanceof DoubleTapToWatch);
            }

            public int hashCode() {
                return -1261061719;
            }

            public String toString() {
                return "DoubleTapToWatch";
            }

            private DoubleTapToWatch() {
                super(null);
            }
        }

        /* compiled from: OptionChainViewState.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/optionschain/OptionChainViewState$UpsellHook$AlertSheet;", "Lcom/robinhood/android/optionschain/OptionChainViewState$UpsellHook;", "content", "Lcom/robinhood/models/ui/IacAlertSheet;", "<init>", "(Lcom/robinhood/models/ui/IacAlertSheet;)V", "getContent", "()Lcom/robinhood/models/ui/IacAlertSheet;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class AlertSheet extends UpsellHook {
            public static final int $stable = 8;
            private final IacAlertSheet content;

            public static /* synthetic */ AlertSheet copy$default(AlertSheet alertSheet, IacAlertSheet iacAlertSheet, int i, Object obj) {
                if ((i & 1) != 0) {
                    iacAlertSheet = alertSheet.content;
                }
                return alertSheet.copy(iacAlertSheet);
            }

            /* renamed from: component1, reason: from getter */
            public final IacAlertSheet getContent() {
                return this.content;
            }

            public final AlertSheet copy(IacAlertSheet content) {
                Intrinsics.checkNotNullParameter(content, "content");
                return new AlertSheet(content);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof AlertSheet) && Intrinsics.areEqual(this.content, ((AlertSheet) other).content);
            }

            public int hashCode() {
                return this.content.hashCode();
            }

            public String toString() {
                return "AlertSheet(content=" + this.content + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AlertSheet(IacAlertSheet content) {
                super(null);
                Intrinsics.checkNotNullParameter(content, "content");
                this.content = content;
            }

            public final IacAlertSheet getContent() {
                return this.content;
            }
        }

        /* compiled from: OptionChainViewState.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/optionschain/OptionChainViewState$UpsellHook$DiscoverZeroDte;", "Lcom/robinhood/android/optionschain/OptionChainViewState$UpsellHook;", "underlyingType", "Lcom/robinhood/models/db/OptionChain$UnderlyingType;", "<init>", "(Lcom/robinhood/models/db/OptionChain$UnderlyingType;)V", "getUnderlyingType", "()Lcom/robinhood/models/db/OptionChain$UnderlyingType;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class DiscoverZeroDte extends UpsellHook {
            public static final int $stable = 0;
            private final OptionChain.UnderlyingType underlyingType;

            public static /* synthetic */ DiscoverZeroDte copy$default(DiscoverZeroDte discoverZeroDte, OptionChain.UnderlyingType underlyingType, int i, Object obj) {
                if ((i & 1) != 0) {
                    underlyingType = discoverZeroDte.underlyingType;
                }
                return discoverZeroDte.copy(underlyingType);
            }

            /* renamed from: component1, reason: from getter */
            public final OptionChain.UnderlyingType getUnderlyingType() {
                return this.underlyingType;
            }

            public final DiscoverZeroDte copy(OptionChain.UnderlyingType underlyingType) {
                Intrinsics.checkNotNullParameter(underlyingType, "underlyingType");
                return new DiscoverZeroDte(underlyingType);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof DiscoverZeroDte) && this.underlyingType == ((DiscoverZeroDte) other).underlyingType;
            }

            public int hashCode() {
                return this.underlyingType.hashCode();
            }

            public String toString() {
                return "DiscoverZeroDte(underlyingType=" + this.underlyingType + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DiscoverZeroDte(OptionChain.UnderlyingType underlyingType) {
                super(null);
                Intrinsics.checkNotNullParameter(underlyingType, "underlyingType");
                this.underlyingType = underlyingType;
            }

            public final OptionChain.UnderlyingType getUnderlyingType() {
                return this.underlyingType;
            }
        }
    }
}
