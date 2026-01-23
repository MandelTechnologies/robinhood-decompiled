package com.robinhood.librobinhood.data.store;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.android.optionsexperiment.Experiments;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.prefs.HasShownSideBySideChainSpreadTooltipPref;
import com.robinhood.librobinhood.data.prefs.HasShownSwitchBackToClassicChainTooltipPref;
import com.robinhood.librobinhood.data.prefs.OptionChainDisplayModePref;
import com.robinhood.librobinhood.data.prefs.OptionChainSbsNuxRevampSettingsShownPref;
import com.robinhood.librobinhood.data.prefs.OptionChainSettingsSbsBidAskPriceLabelShownPref;
import com.robinhood.librobinhood.data.prefs.OptionChainSettingsShownPref;
import com.robinhood.librobinhood.data.prefs.OptionSbsEduFooterDismissedPref;
import com.robinhood.librobinhood.data.prefs.OptionSbsLottieNuxAnimation;
import com.robinhood.librobinhood.data.prefs.OptionSideBySideChainBottomSheetShownPref;
import com.robinhood.librobinhood.data.prefs.OptionSideBySideChainShownPref;
import com.robinhood.librobinhood.data.store.OptionSideBySideChainTableRowData;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.dao.OptionChainSettingsTableMetricsDao;
import com.robinhood.models.p320db.OptionChain4;
import com.robinhood.models.p320db.OptionChainSettingsTableMetric;
import com.robinhood.models.p320db.OptionChainSettingsTableMetricsUpdate;
import com.robinhood.models.p320db.OptionContractType;
import com.robinhood.models.p320db.OptionInstrument;
import com.robinhood.models.p320db.OptionSideBySideChainMetric;
import com.robinhood.models.p355ui.OptionChainDisplayMode;
import com.robinhood.models.p355ui.UiOptionStrategyLegDisplay;
import com.robinhood.models.p355ui.UnderlyingQuote;
import com.robinhood.p370rx.ObservablesKt;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.StringPreference;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.Optional;
import io.reactivex.Observable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;
import options_product.service.ChainCustomization;
import options_product.service.SbsChainCustomizationResponseDto;
import p479j$.time.Clock;
import p479j$.time.Instant;

/* compiled from: OptionSideBySideChainStore.kt */
@Metadata(m3635d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u009d\u0001\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u000e\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001c¢\u0006\u0004\b!\u0010\u001fJ\r\u0010\"\u001a\u00020\u001d¢\u0006\u0004\b\"\u0010#J\r\u0010%\u001a\u00020$¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\u001d¢\u0006\u0004\b'\u0010#J\r\u0010(\u001a\u00020$¢\u0006\u0004\b(\u0010&J\r\u0010)\u001a\u00020\u001d¢\u0006\u0004\b)\u0010#J\r\u0010*\u001a\u00020$¢\u0006\u0004\b*\u0010&J\r\u0010+\u001a\u00020\u001d¢\u0006\u0004\b+\u0010#J\r\u0010,\u001a\u00020$¢\u0006\u0004\b,\u0010&J\r\u0010-\u001a\u00020$¢\u0006\u0004\b-\u0010&J\r\u0010.\u001a\u00020$¢\u0006\u0004\b.\u0010&J\r\u0010/\u001a\u00020 ¢\u0006\u0004\b/\u00100J\u0015\u00102\u001a\u00020$2\u0006\u00101\u001a\u00020 ¢\u0006\u0004\b2\u00103J\u0015\u00105\u001a\u00020$2\u0006\u00104\u001a\u00020\u001d¢\u0006\u0004\b5\u00106J\r\u00107\u001a\u00020\u001d¢\u0006\u0004\b7\u0010#J\r\u00108\u001a\u00020$¢\u0006\u0004\b8\u0010&J\r\u00109\u001a\u00020\u001d¢\u0006\u0004\b9\u0010#J\r\u0010:\u001a\u00020$¢\u0006\u0004\b:\u0010&JQ\u0010G\u001a\b\u0012\u0004\u0012\u00020F0\u001c2\u0012\u0010=\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020<0;0\u001c2\b\u0010?\u001a\u0004\u0018\u00010>2\f\u0010B\u001a\b\u0012\u0004\u0012\u00020A0@2\b\u0010D\u001a\u0004\u0018\u00010C2\u0006\u0010E\u001a\u00020\u001d¢\u0006\u0004\bG\u0010HJ\u0013\u0010J\u001a\b\u0012\u0004\u0012\u00020I0\u001c¢\u0006\u0004\bJ\u0010\u001fJ\u0019\u0010L\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020K0;0\u001c¢\u0006\u0004\bL\u0010\u001fJ\u0015\u0010N\u001a\u00020$2\u0006\u0010M\u001a\u00020I¢\u0006\u0004\bN\u0010OJ\u0013\u0010P\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c¢\u0006\u0004\bP\u0010\u001fJ\r\u0010Q\u001a\u00020$¢\u0006\u0004\bQ\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010RR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010SR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010TR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010UR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010VR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010WR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010XR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010XR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010XR\u0014\u0010\u0012\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010XR\u0014\u0010\u0013\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010XR\u0014\u0010\u0014\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010XR\u0014\u0010\u0015\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010XR\u0014\u0010\u0016\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010XR\u0014\u0010\u0017\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010XR \u0010\\\u001a\u000e\u0012\u0004\u0012\u00020Z\u0012\u0004\u0012\u00020[0Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R \u0010_\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020I0^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R \u0010b\u001a\u000e\u0012\u0004\u0012\u00020I\u0012\u0004\u0012\u00020[0a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010c¨\u0006d"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionSideBySideChainStore;", "Lcom/robinhood/store/Store;", "Loptions_product/service/ChainCustomization;", "chainCustomizationService", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStore", "Lcom/robinhood/models/dao/OptionChainSettingsTableMetricsDao;", "optionChainSettingsTableMetricsDao", "Lcom/robinhood/librobinhood/data/store/OptionUnderlyingQuoteStore;", "optionUnderlyingQuoteStore", "Lcom/robinhood/prefs/StringPreference;", "optionChainDisplayModePref", "Lcom/robinhood/prefs/BooleanPreference;", "hasShownSideBySideChainSpreadTooltipPref", "hasShownSwitchBackToClassicChainTooltipPref", "optionSideBySideChainShownPref", "optionSideBySideChainBottomSheetShownPref", "optionChainSettingsShownPref", "optionSbsEduFooterDismissedPref", "optionSbsLottieNuxAnimationSeenPref", "optionChainSbsNuxRevampSettingsShownPref", "optionSbsBidAskPriceLabelShownPref", "Lcom/robinhood/store/StoreBundle;", "storeBundle", "<init>", "(Loptions_product/service/ChainCustomization;Lj$/time/Clock;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/models/dao/OptionChainSettingsTableMetricsDao;Lcom/robinhood/librobinhood/data/store/OptionUnderlyingQuoteStore;Lcom/robinhood/prefs/StringPreference;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/store/StoreBundle;)V", "Lkotlinx/coroutines/flow/Flow;", "", "streamIsInSideBySideChainNuxRevampExperiment", "()Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/models/ui/OptionChainDisplayMode;", "streamOptionChainDisplayMode", "getSideBySideChainShown", "()Z", "", "recordSideBySideChainShown", "()V", "getSideBySideChainBottomSheetShown", "recordSideBySideChainBottomSheetShown", "getSbsNuxRevampSettingsShown", "recordSbsNuxRevampSettingsShown", "getChainSettingsShown", "recordChainSettingsShown", "recordSbsEduFooterDismissed", "recordOptionSbsLottieNuxAnimationSeen", "getSharedPrefOptionChainDisplayMode", "()Lcom/robinhood/models/ui/OptionChainDisplayMode;", "mode", "setSharedPrefOptionChainDisplayMode", "(Lcom/robinhood/models/ui/OptionChainDisplayMode;)V", "enabled", "toggleSideBySideChain", "(Z)V", "hasShownSideBySideChainSpreadTooltip", "setShownSideBySideChainSpreadTooltip", "hasShownSwitchBackToClassicChainTooltip", "setShownSwitchBackToClassicChainTooltip", "", "Lcom/robinhood/models/db/OptionInstrument;", "optionInstrumentFlow", "Lcom/robinhood/models/db/Underlying;", "underlying", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/ui/UiOptionStrategyLegDisplay;", "targetLegs", "Ljava/math/BigDecimal;", "targetStrikePrice", "inSbsChainPerfExperiment", "Lcom/robinhood/librobinhood/data/store/OptionSideBySideChainTableData;", "streamTableData", "(Lkotlinx/coroutines/flow/Flow;Lcom/robinhood/models/db/Underlying;Lkotlinx/collections/immutable/ImmutableList;Ljava/math/BigDecimal;Z)Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/models/db/OptionChainSettingsTableMetricsUpdate;", "streamOptionSettingsTableMetrics", "Lcom/robinhood/models/db/OptionSideBySideChainMetric;", "streamOptionSideBySideTableMetrics", "update", "updateTableMetrics", "(Lcom/robinhood/models/db/OptionChainSettingsTableMetricsUpdate;)V", "streamBidAskPriceLabelSettingsShown", "setBidAskPriceLabelSettingsShown", "Loptions_product/service/ChainCustomization;", "Lj$/time/Clock;", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "Lcom/robinhood/models/dao/OptionChainSettingsTableMetricsDao;", "Lcom/robinhood/librobinhood/data/store/OptionUnderlyingQuoteStore;", "Lcom/robinhood/prefs/StringPreference;", "Lcom/robinhood/prefs/BooleanPreference;", "Lcom/robinhood/android/moria/network/Endpoint;", "", "Loptions_product/service/SbsChainCustomizationResponseDto;", "getSbsChainCustomizationEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/android/moria/db/Query;", "getSbsChainCustomizationQuery", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/android/moria/network/PostEndpoint;", "updateSbsChainCustomizationEndpoint", "Lcom/robinhood/android/moria/network/PostEndpoint;", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class OptionSideBySideChainStore extends Store {
    private final ChainCustomization chainCustomizationService;
    private final Clock clock;
    private final ExperimentsStore experimentsStore;
    private final Endpoint<Long, SbsChainCustomizationResponseDto> getSbsChainCustomizationEndpoint;
    private final Query<Unit, OptionChainSettingsTableMetricsUpdate> getSbsChainCustomizationQuery;
    private final BooleanPreference hasShownSideBySideChainSpreadTooltipPref;
    private final BooleanPreference hasShownSwitchBackToClassicChainTooltipPref;
    private final StringPreference optionChainDisplayModePref;
    private final BooleanPreference optionChainSbsNuxRevampSettingsShownPref;
    private final BooleanPreference optionChainSettingsShownPref;
    private final OptionChainSettingsTableMetricsDao optionChainSettingsTableMetricsDao;
    private final BooleanPreference optionSbsBidAskPriceLabelShownPref;
    private final BooleanPreference optionSbsEduFooterDismissedPref;
    private final BooleanPreference optionSbsLottieNuxAnimationSeenPref;
    private final BooleanPreference optionSideBySideChainBottomSheetShownPref;
    private final BooleanPreference optionSideBySideChainShownPref;
    private final OptionUnderlyingQuoteStore optionUnderlyingQuoteStore;
    private final PostEndpoint<OptionChainSettingsTableMetricsUpdate, SbsChainCustomizationResponseDto> updateSbsChainCustomizationEndpoint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionSideBySideChainStore(ChainCustomization chainCustomizationService, Clock clock, ExperimentsStore experimentsStore, OptionChainSettingsTableMetricsDao optionChainSettingsTableMetricsDao, OptionUnderlyingQuoteStore optionUnderlyingQuoteStore, @OptionChainDisplayModePref StringPreference optionChainDisplayModePref, @HasShownSideBySideChainSpreadTooltipPref BooleanPreference hasShownSideBySideChainSpreadTooltipPref, @HasShownSwitchBackToClassicChainTooltipPref BooleanPreference hasShownSwitchBackToClassicChainTooltipPref, @OptionSideBySideChainShownPref BooleanPreference optionSideBySideChainShownPref, @OptionSideBySideChainBottomSheetShownPref BooleanPreference optionSideBySideChainBottomSheetShownPref, @OptionChainSettingsShownPref BooleanPreference optionChainSettingsShownPref, @OptionSbsEduFooterDismissedPref BooleanPreference optionSbsEduFooterDismissedPref, @OptionSbsLottieNuxAnimation BooleanPreference optionSbsLottieNuxAnimationSeenPref, @OptionChainSbsNuxRevampSettingsShownPref BooleanPreference optionChainSbsNuxRevampSettingsShownPref, @OptionChainSettingsSbsBidAskPriceLabelShownPref BooleanPreference optionSbsBidAskPriceLabelShownPref, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(chainCustomizationService, "chainCustomizationService");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(optionChainSettingsTableMetricsDao, "optionChainSettingsTableMetricsDao");
        Intrinsics.checkNotNullParameter(optionUnderlyingQuoteStore, "optionUnderlyingQuoteStore");
        Intrinsics.checkNotNullParameter(optionChainDisplayModePref, "optionChainDisplayModePref");
        Intrinsics.checkNotNullParameter(hasShownSideBySideChainSpreadTooltipPref, "hasShownSideBySideChainSpreadTooltipPref");
        Intrinsics.checkNotNullParameter(hasShownSwitchBackToClassicChainTooltipPref, "hasShownSwitchBackToClassicChainTooltipPref");
        Intrinsics.checkNotNullParameter(optionSideBySideChainShownPref, "optionSideBySideChainShownPref");
        Intrinsics.checkNotNullParameter(optionSideBySideChainBottomSheetShownPref, "optionSideBySideChainBottomSheetShownPref");
        Intrinsics.checkNotNullParameter(optionChainSettingsShownPref, "optionChainSettingsShownPref");
        Intrinsics.checkNotNullParameter(optionSbsEduFooterDismissedPref, "optionSbsEduFooterDismissedPref");
        Intrinsics.checkNotNullParameter(optionSbsLottieNuxAnimationSeenPref, "optionSbsLottieNuxAnimationSeenPref");
        Intrinsics.checkNotNullParameter(optionChainSbsNuxRevampSettingsShownPref, "optionChainSbsNuxRevampSettingsShownPref");
        Intrinsics.checkNotNullParameter(optionSbsBidAskPriceLabelShownPref, "optionSbsBidAskPriceLabelShownPref");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.chainCustomizationService = chainCustomizationService;
        this.clock = clock;
        this.experimentsStore = experimentsStore;
        this.optionChainSettingsTableMetricsDao = optionChainSettingsTableMetricsDao;
        this.optionUnderlyingQuoteStore = optionUnderlyingQuoteStore;
        this.optionChainDisplayModePref = optionChainDisplayModePref;
        this.hasShownSideBySideChainSpreadTooltipPref = hasShownSideBySideChainSpreadTooltipPref;
        this.hasShownSwitchBackToClassicChainTooltipPref = hasShownSwitchBackToClassicChainTooltipPref;
        this.optionSideBySideChainShownPref = optionSideBySideChainShownPref;
        this.optionSideBySideChainBottomSheetShownPref = optionSideBySideChainBottomSheetShownPref;
        this.optionChainSettingsShownPref = optionChainSettingsShownPref;
        this.optionSbsEduFooterDismissedPref = optionSbsEduFooterDismissedPref;
        this.optionSbsLottieNuxAnimationSeenPref = optionSbsLottieNuxAnimationSeenPref;
        this.optionChainSbsNuxRevampSettingsShownPref = optionChainSbsNuxRevampSettingsShownPref;
        this.optionSbsBidAskPriceLabelShownPref = optionSbsBidAskPriceLabelShownPref;
        this.getSbsChainCustomizationEndpoint = Endpoint.Companion.createWithParams$default(Endpoint.INSTANCE, new OptionSideBySideChainStore$getSbsChainCustomizationEndpoint$1(this, null), getLogoutKillswitch(), new OptionSideBySideChainStore$getSbsChainCustomizationEndpoint$2(this, null), storeBundle.getClock(), null, 16, null);
        this.getSbsChainCustomizationQuery = Store.create$default(this, Query.INSTANCE, "getSbsChainCustomizationQuery", CollectionsKt.listOf(new RefreshEach(new Function1() { // from class: com.robinhood.librobinhood.data.store.OptionSideBySideChainStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionSideBySideChainStore.getSbsChainCustomizationQuery$lambda$0(this.f$0, (Unit) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.OptionSideBySideChainStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionSideBySideChainStore.getSbsChainCustomizationQuery$lambda$1(this.f$0, (Unit) obj);
            }
        }, false, 8, null);
        this.updateSbsChainCustomizationEndpoint = PostEndpoint.INSTANCE.createWithParams(new OptionSideBySideChainStore$updateSbsChainCustomizationEndpoint$1(this, null), new OptionSideBySideChainStore$updateSbsChainCustomizationEndpoint$2(this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job getSbsChainCustomizationQuery$lambda$0(OptionSideBySideChainStore optionSideBySideChainStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Endpoint.DefaultImpls.refresh$default(optionSideBySideChainStore.getSbsChainCustomizationEndpoint, Long.valueOf(Instant.now(optionSideBySideChainStore.clock).toEpochMilli()), false, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow getSbsChainCustomizationQuery$lambda$1(OptionSideBySideChainStore optionSideBySideChainStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return optionSideBySideChainStore.optionChainSettingsTableMetricsDao.getLatestOptionChainSettingsTableMetrics();
    }

    public final Flow<Boolean> streamIsInSideBySideChainNuxRevampExperiment() {
        return FlowKt.distinctUntilChanged(Context7.buffer$default(RxConvert.asFlow(ObservablesKt.onTimeoutEmit(ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{Experiments.OptionsSideBySideChainNuxRevampExperiment.INSTANCE}, false, null, 6, null), 5L, TimeUnit.SECONDS, Boolean.FALSE)), Integer.MAX_VALUE, null, 2, null));
    }

    public final Flow<OptionChainDisplayMode> streamOptionChainDisplayMode() {
        final Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.optionChainDisplayModePref.changes()), Integer.MAX_VALUE, null, 2, null);
        return new Flow<OptionChainDisplayMode>() { // from class: com.robinhood.librobinhood.data.store.OptionSideBySideChainStore$streamOptionChainDisplayMode$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super OptionChainDisplayMode> flowCollector, Continuation continuation) {
                Object objCollect = flowBuffer$default.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.OptionSideBySideChainStore$streamOptionChainDisplayMode$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionSideBySideChainStore$streamOptionChainDisplayMode$$inlined$map$1$2", m3645f = "OptionSideBySideChainStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.OptionSideBySideChainStore$streamOptionChainDisplayMode$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        OptionChainDisplayMode optionChainDisplayModeFrom = OptionChainDisplayMode.INSTANCE.from((String) ((Optional) obj).getOrNull());
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(optionChainDisplayModeFrom, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }
        };
    }

    public final boolean getSideBySideChainShown() {
        return this.optionSideBySideChainShownPref.get();
    }

    public final void recordSideBySideChainShown() {
        this.optionSideBySideChainShownPref.set(true);
    }

    public final boolean getSideBySideChainBottomSheetShown() {
        return this.optionSideBySideChainBottomSheetShownPref.get();
    }

    public final void recordSideBySideChainBottomSheetShown() {
        this.optionSideBySideChainBottomSheetShownPref.set(true);
    }

    public final boolean getSbsNuxRevampSettingsShown() {
        return this.optionChainSbsNuxRevampSettingsShownPref.get();
    }

    public final void recordSbsNuxRevampSettingsShown() {
        this.optionChainSbsNuxRevampSettingsShownPref.set(true);
    }

    public final boolean getChainSettingsShown() {
        return this.optionChainSettingsShownPref.get();
    }

    public final void recordChainSettingsShown() {
        this.optionChainSettingsShownPref.set(true);
    }

    public final void recordSbsEduFooterDismissed() {
        this.optionSbsEduFooterDismissedPref.set(true);
    }

    public final void recordOptionSbsLottieNuxAnimationSeen() {
        this.optionSbsLottieNuxAnimationSeenPref.set(true);
    }

    public final OptionChainDisplayMode getSharedPrefOptionChainDisplayMode() {
        return OptionChainDisplayMode.INSTANCE.from(this.optionChainDisplayModePref.get());
    }

    public final void setSharedPrefOptionChainDisplayMode(OptionChainDisplayMode mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.optionChainDisplayModePref.set(mode.getMode());
    }

    public final void toggleSideBySideChain(boolean enabled) {
        if (enabled) {
            this.optionChainDisplayModePref.set(OptionChainDisplayMode.SIDE_BY_SIDE.getMode());
        } else {
            this.optionChainDisplayModePref.set(OptionChainDisplayMode.DEFAULT.getMode());
        }
    }

    public final boolean hasShownSideBySideChainSpreadTooltip() {
        return this.hasShownSideBySideChainSpreadTooltipPref.get();
    }

    public final void setShownSideBySideChainSpreadTooltip() {
        this.hasShownSideBySideChainSpreadTooltipPref.set(true);
    }

    public final boolean hasShownSwitchBackToClassicChainTooltip() {
        return this.hasShownSwitchBackToClassicChainTooltipPref.get();
    }

    public final void setShownSwitchBackToClassicChainTooltip() {
        this.hasShownSwitchBackToClassicChainTooltipPref.set(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Flow<OptionSideBySideChainTableData> streamTableData(Flow<? extends List<OptionInstrument>> optionInstrumentFlow, OptionChain4 underlying, ImmutableList<? extends UiOptionStrategyLegDisplay> targetLegs, BigDecimal targetStrikePrice, boolean inSbsChainPerfExperiment) {
        Flow flowFlowOf;
        Intrinsics.checkNotNullParameter(optionInstrumentFlow, "optionInstrumentFlow");
        Intrinsics.checkNotNullParameter(targetLegs, "targetLegs");
        if (!targetLegs.isEmpty() && targetStrikePrice != null) {
            throw new IllegalArgumentException("Cannot specify both targetLegs and targetStrikePrice");
        }
        if (underlying == null) {
            flowFlowOf = FlowKt.flowOf((Object) null);
        } else {
            if (inSbsChainPerfExperiment) {
                flowFlowOf = FlowKt.onStart(this.optionUnderlyingQuoteStore.streamUnderlyingQuoteWithCache(underlying), new C34107x67a0aa91(null));
            } else {
                flowFlowOf = FlowKt.onStart(this.optionUnderlyingQuoteStore.streamUnderlyingQuote(underlying), new C34108x67a0aa92(null));
            }
            if (flowFlowOf == null) {
            }
        }
        return FlowKt.combine(optionInstrumentFlow, flowFlowOf, new C341062(targetLegs, targetStrikePrice, null));
    }

    /* compiled from: OptionSideBySideChainStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/librobinhood/data/store/OptionSideBySideChainTableData;", "optionInstruments", "", "Lcom/robinhood/models/db/OptionInstrument;", "underlyingQuote", "Lcom/robinhood/models/ui/UnderlyingQuote;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionSideBySideChainStore$streamTableData$2", m3645f = "OptionSideBySideChainStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.librobinhood.data.store.OptionSideBySideChainStore$streamTableData$2 */
    static final class C341062 extends ContinuationImpl7 implements Function3<List<? extends OptionInstrument>, UnderlyingQuote, Continuation<? super OptionSideBySideChainTableData>, Object> {
        final /* synthetic */ ImmutableList<UiOptionStrategyLegDisplay> $targetLegs;
        final /* synthetic */ BigDecimal $targetStrikePrice;
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C341062(ImmutableList<? extends UiOptionStrategyLegDisplay> immutableList, BigDecimal bigDecimal, Continuation<? super C341062> continuation) {
            super(3, continuation);
            this.$targetLegs = immutableList;
            this.$targetStrikePrice = bigDecimal;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(List<? extends OptionInstrument> list, UnderlyingQuote underlyingQuote, Continuation<? super OptionSideBySideChainTableData> continuation) {
            return invoke2((List<OptionInstrument>) list, underlyingQuote, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<OptionInstrument> list, UnderlyingQuote underlyingQuote, Continuation<? super OptionSideBySideChainTableData> continuation) {
            C341062 c341062 = new C341062(this.$targetLegs, this.$targetStrikePrice, continuation);
            c341062.L$0 = list;
            c341062.L$1 = underlyingQuote;
            return c341062.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:101:0x01ee  */
        /* JADX WARN: Removed duplicated region for block: B:6:0x001d  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x01ab  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x01be  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x01ca  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            OptionInstrument optionInstrument;
            BigDecimal strikePrice;
            OptionInstrument optionInstrument2;
            BigDecimal bigDecimal;
            BigDecimal strikePrice2;
            BigDecimal strikePrice3;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List list = (List) this.L$0;
            UnderlyingQuote underlyingQuote = (UnderlyingQuote) this.L$1;
            if (!this.$targetLegs.isEmpty()) {
                if (underlyingQuote != null) {
                    Iterator<UiOptionStrategyLegDisplay> it = this.$targetLegs.iterator();
                    if (!it.hasNext()) {
                        throw new NoSuchElementException();
                    }
                    UiOptionStrategyLegDisplay next = it.next();
                    if (it.hasNext()) {
                        BigDecimal bigDecimalSubtract = next.getOptionInstrument().getStrikePrice().subtract(underlyingQuote.getCurrentValue());
                        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
                        BigDecimal bigDecimalAbs = bigDecimalSubtract.abs();
                        do {
                            UiOptionStrategyLegDisplay next2 = it.next();
                            BigDecimal bigDecimalSubtract2 = next2.getOptionInstrument().getStrikePrice().subtract(underlyingQuote.getCurrentValue());
                            Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract2, "subtract(...)");
                            BigDecimal bigDecimalAbs2 = bigDecimalSubtract2.abs();
                            if (bigDecimalAbs.compareTo(bigDecimalAbs2) > 0) {
                                next = next2;
                                bigDecimalAbs = bigDecimalAbs2;
                            }
                        } while (it.hasNext());
                    }
                    optionInstrument = next.getOptionInstrument();
                } else {
                    UiOptionStrategyLegDisplay uiOptionStrategyLegDisplay = (UiOptionStrategyLegDisplay) CollectionsKt.firstOrNull((List) this.$targetLegs);
                    optionInstrument = uiOptionStrategyLegDisplay != null ? uiOptionStrategyLegDisplay.getOptionInstrument() : null;
                }
            }
            List list2 = list;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list2) {
                if (((OptionInstrument) obj2).getContractType() == OptionContractType.CALL) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : list2) {
                if (((OptionInstrument) obj3).getContractType() == OptionContractType.PUT) {
                    arrayList2.add(obj3);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            int i = 0;
            int i2 = 0;
            Integer numBoxInt = null;
            Integer numBoxInt2 = null;
            Integer numBoxInt3 = null;
            while (true) {
                if (i >= arrayList.size() && i2 >= arrayList2.size()) {
                    if (underlyingQuote != null && numBoxInt == null) {
                        arrayList3.add(new OptionSideBySideChainTableRowData.UnderlyingQuoteRow(underlyingQuote));
                        numBoxInt = boxing.boxInt(CollectionsKt.getLastIndex(arrayList3));
                    }
                    Integer num = numBoxInt;
                    if (this.$targetStrikePrice != null && numBoxInt2 == null) {
                        numBoxInt2 = boxing.boxInt(CollectionsKt.getLastIndex(arrayList3));
                    }
                    return new OptionSideBySideChainTableData(extensions2.toPersistentList(arrayList3), num, numBoxInt3, numBoxInt2, underlyingQuote);
                }
                OptionInstrument optionInstrument3 = (OptionInstrument) CollectionsKt.getOrNull(arrayList, i);
                OptionInstrument optionInstrument4 = (OptionInstrument) CollectionsKt.getOrNull(arrayList2, i2);
                if (optionInstrument3 != null) {
                    if (optionInstrument4 == null) {
                        strikePrice = optionInstrument3.getStrikePrice();
                    } else if (optionInstrument3.getStrikePrice().compareTo(optionInstrument4.getStrikePrice()) < 0) {
                        strikePrice = optionInstrument4.getStrikePrice();
                    } else if (optionInstrument3.getStrikePrice().compareTo(optionInstrument4.getStrikePrice()) > 0) {
                        strikePrice = optionInstrument3.getStrikePrice();
                    } else {
                        strikePrice = optionInstrument3.getStrikePrice();
                        i++;
                    }
                    i++;
                    if (underlyingQuote != null && numBoxInt == null && strikePrice.compareTo(underlyingQuote.getCurrentValue()) <= 0) {
                        arrayList3.add(new OptionSideBySideChainTableRowData.UnderlyingQuoteRow(underlyingQuote));
                        numBoxInt = boxing.boxInt(CollectionsKt.getLastIndex(arrayList3));
                    }
                    optionInstrument2 = optionInstrument;
                    arrayList3.add(new OptionSideBySideChainTableRowData.InstrumentRow((optionInstrument3 == null && (strikePrice3 = optionInstrument3.getStrikePrice()) != null && strikePrice3.compareTo(strikePrice) == 0) ? optionInstrument3 : null, (optionInstrument4 == null && (strikePrice2 = optionInstrument4.getStrikePrice()) != null && strikePrice2.compareTo(strikePrice) == 0) ? optionInstrument4 : null, strikePrice));
                    if (optionInstrument2 != null) {
                        if (Intrinsics.areEqual(optionInstrument4 != null ? optionInstrument4.getId() : null, optionInstrument2.getId())) {
                            numBoxInt3 = boxing.boxInt(CollectionsKt.getLastIndex(arrayList3));
                        } else if (Intrinsics.areEqual(optionInstrument3 != null ? optionInstrument3.getId() : null, optionInstrument2.getId())) {
                        }
                    }
                    bigDecimal = this.$targetStrikePrice;
                    if (bigDecimal == null && numBoxInt2 == null && strikePrice.compareTo(bigDecimal) <= 0) {
                        numBoxInt2 = boxing.boxInt(CollectionsKt.getLastIndex(arrayList3));
                    }
                    optionInstrument = optionInstrument2;
                } else {
                    if (optionInstrument4 == null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    strikePrice = optionInstrument4.getStrikePrice();
                }
                i2++;
                if (underlyingQuote != null) {
                    arrayList3.add(new OptionSideBySideChainTableRowData.UnderlyingQuoteRow(underlyingQuote));
                    numBoxInt = boxing.boxInt(CollectionsKt.getLastIndex(arrayList3));
                }
                optionInstrument2 = optionInstrument;
                arrayList3.add(new OptionSideBySideChainTableRowData.InstrumentRow((optionInstrument3 == null && (strikePrice3 = optionInstrument3.getStrikePrice()) != null && strikePrice3.compareTo(strikePrice) == 0) ? optionInstrument3 : null, (optionInstrument4 == null && (strikePrice2 = optionInstrument4.getStrikePrice()) != null && strikePrice2.compareTo(strikePrice) == 0) ? optionInstrument4 : null, strikePrice));
                if (optionInstrument2 != null) {
                }
                bigDecimal = this.$targetStrikePrice;
                if (bigDecimal == null) {
                }
                optionInstrument = optionInstrument2;
            }
        }
    }

    public final Flow<OptionChainSettingsTableMetricsUpdate> streamOptionSettingsTableMetrics() {
        BuildersKt__Builders_commonKt.launch$default(getStoreScope(), null, null, new C341051(new OptionChainSettingsTableMetricsUpdate(OptionSideBySideChainStoreKt.fallbackDefaultTableMetrics, 1L), null), 3, null);
        return this.getSbsChainCustomizationQuery.asFlow(Unit.INSTANCE);
    }

    /* compiled from: OptionSideBySideChainStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionSideBySideChainStore$streamOptionSettingsTableMetrics$1", m3645f = "OptionSideBySideChainStore.kt", m3646l = {344}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.OptionSideBySideChainStore$streamOptionSettingsTableMetrics$1 */
    static final class C341051 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ OptionChainSettingsTableMetricsUpdate $defaultValue;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C341051(OptionChainSettingsTableMetricsUpdate optionChainSettingsTableMetricsUpdate, Continuation<? super C341051> continuation) {
            super(2, continuation);
            this.$defaultValue = optionChainSettingsTableMetricsUpdate;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionSideBySideChainStore.this.new C341051(this.$defaultValue, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C341051) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: OptionSideBySideChainStore.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionSideBySideChainStore$streamOptionSettingsTableMetrics$1$1", m3645f = "OptionSideBySideChainStore.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.librobinhood.data.store.OptionSideBySideChainStore$streamOptionSettingsTableMetrics$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ OptionChainSettingsTableMetricsUpdate $defaultValue;
            int label;
            final /* synthetic */ OptionSideBySideChainStore this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OptionSideBySideChainStore optionSideBySideChainStore, OptionChainSettingsTableMetricsUpdate optionChainSettingsTableMetricsUpdate, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = optionSideBySideChainStore;
                this.$defaultValue = optionChainSettingsTableMetricsUpdate;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$defaultValue, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.optionChainSettingsTableMetricsDao.deleteStaleAndInsert(this.$defaultValue);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(OptionSideBySideChainStore.this, this.$defaultValue, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, anonymousClass1, this) == coroutine_suspended) {
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

    public final Flow<List<OptionSideBySideChainMetric>> streamOptionSideBySideTableMetrics() {
        final Flow<OptionChainSettingsTableMetricsUpdate> flowStreamOptionSettingsTableMetrics = streamOptionSettingsTableMetrics();
        return new Flow<List<? extends OptionSideBySideChainMetric>>() { // from class: com.robinhood.librobinhood.data.store.OptionSideBySideChainStore$streamOptionSideBySideTableMetrics$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super List<? extends OptionSideBySideChainMetric>> flowCollector, Continuation continuation) {
                Object objCollect = flowStreamOptionSettingsTableMetrics.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.OptionSideBySideChainStore$streamOptionSideBySideTableMetrics$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionSideBySideChainStore$streamOptionSideBySideTableMetrics$$inlined$map$1$2", m3645f = "OptionSideBySideChainStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.OptionSideBySideChainStore$streamOptionSideBySideTableMetrics$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        List listListOf = CollectionsKt.listOf((Object[]) new OptionSideBySideChainMetric[]{OptionSideBySideChainMetric.BID, OptionSideBySideChainMetric.ASK});
                        List<OptionChainSettingsTableMetric> tableMetrics = ((OptionChainSettingsTableMetricsUpdate) obj).getTableMetrics();
                        ArrayList arrayList = new ArrayList();
                        for (T t : tableMetrics) {
                            OptionChainSettingsTableMetric optionChainSettingsTableMetric = (OptionChainSettingsTableMetric) t;
                            if (optionChainSettingsTableMetric.getEnabled() && optionChainSettingsTableMetric.getMetric() != OptionSideBySideChainMetric.BID && optionChainSettingsTableMetric.getMetric() != OptionSideBySideChainMetric.ASK) {
                                arrayList.add(t);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                        Iterator<T> it = arrayList.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(((OptionChainSettingsTableMetric) it.next()).getMetric());
                        }
                        List listPlus = CollectionsKt.plus((Collection) listListOf, (Iterable) arrayList2);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(listPlus, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }
        };
    }

    /* compiled from: OptionSideBySideChainStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionSideBySideChainStore$updateTableMetrics$1", m3645f = "OptionSideBySideChainStore.kt", m3646l = {373, 376}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.OptionSideBySideChainStore$updateTableMetrics$1 */
    static final class C341091 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ OptionChainSettingsTableMetricsUpdate $update;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C341091(OptionChainSettingsTableMetricsUpdate optionChainSettingsTableMetricsUpdate, Continuation<? super C341091> continuation) {
            super(2, continuation);
            this.$update = optionChainSettingsTableMetricsUpdate;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionSideBySideChainStore.this.new C341091(this.$update, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C341091) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
        
            if (com.robinhood.android.moria.network.PostEndpoint.DefaultImpls.post$default(r3, r4, null, r9, 2, null) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(OptionSideBySideChainStore.this, this.$update, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, anonymousClass1, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            PostEndpoint postEndpoint = OptionSideBySideChainStore.this.updateSbsChainCustomizationEndpoint;
            OptionChainSettingsTableMetricsUpdate optionChainSettingsTableMetricsUpdate = this.$update;
            this.label = 2;
        }

        /* compiled from: OptionSideBySideChainStore.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionSideBySideChainStore$updateTableMetrics$1$1", m3645f = "OptionSideBySideChainStore.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.librobinhood.data.store.OptionSideBySideChainStore$updateTableMetrics$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ OptionChainSettingsTableMetricsUpdate $update;
            int label;
            final /* synthetic */ OptionSideBySideChainStore this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OptionSideBySideChainStore optionSideBySideChainStore, OptionChainSettingsTableMetricsUpdate optionChainSettingsTableMetricsUpdate, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = optionSideBySideChainStore;
                this.$update = optionChainSettingsTableMetricsUpdate;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$update, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.optionChainSettingsTableMetricsDao.deleteStaleAndInsert(this.$update);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final void updateTableMetrics(OptionChainSettingsTableMetricsUpdate update) {
        Intrinsics.checkNotNullParameter(update, "update");
        BuildersKt__Builders_commonKt.launch$default(getStoreScope(), null, null, new C341091(update, null), 3, null);
    }

    public final Flow<Boolean> streamBidAskPriceLabelSettingsShown() {
        Observable<Boolean> observableDistinctUntilChanged = this.optionSbsBidAskPriceLabelShownPref.getChanges().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        return Context7.buffer$default(RxConvert.asFlow(observableDistinctUntilChanged), Integer.MAX_VALUE, null, 2, null);
    }

    public final void setBidAskPriceLabelSettingsShown() {
        this.optionSbsBidAskPriceLabelShownPref.set(true);
    }
}
