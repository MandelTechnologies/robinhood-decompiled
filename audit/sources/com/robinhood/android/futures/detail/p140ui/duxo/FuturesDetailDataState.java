package com.robinhood.android.futures.detail.p140ui.duxo;

import com.robinhood.android.account.icons.AccountDisplayIcons;
import com.robinhood.android.account.strings.AccountDisplayNames;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.history.p082ui.lazyList.HistoryPreviewListParams;
import com.robinhood.android.futures.detail.C17042R;
import com.robinhood.android.futures.detail.p140ui.duxo.FtuxProgressState;
import com.robinhood.android.futures.detail.p140ui.duxo.FuturesDetailViewState;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.models.futures.FuturesLadderKillswitchExperiment;
import com.robinhood.android.models.futures.api.arsenal.FuturesContractTradability;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesContract;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesContract3;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesMarginRequirement;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesProduct;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesProduct5;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesTradingHours;
import com.robinhood.android.models.futures.marketdata.p191db.FuturesFundamentals;
import com.robinhood.android.models.futures.marketdata.p191db.FuturesQuote;
import com.robinhood.android.models.futures.p189db.FuturesAccount;
import com.robinhood.android.models.futures.p189db.FuturesCostBasis;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.mcduckling.HistoryStaticFilter;
import com.robinhood.models.util.Money;
import com.robinhood.shared.history.contracts.account.AccountsHistoryAccountTypeFilter;
import com.robinhood.shared.history.contracts.account.AccountsHistoryContract;
import com.robinhood.shared.history.contracts.account.AccountsHistoryTransactionTypeFilter;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.store.futures.FuturesLocaleStore2;
import com.robinhood.store.futures.FuturesOrderStore;
import com.robinhood.store.futures.FuturesPnLHelper;
import com.robinhood.store.futures.mib.MiBFuturesState;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableSet3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: FuturesDetailDataState.kt */
@Metadata(m3635d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u0093\u00012\u00020\u0001:\u0002\u0093\u0001Bÿ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\t\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001e\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0014\u0012\b\b\u0002\u0010 \u001a\u00020\u0014\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"\u0012\b\b\u0002\u0010#\u001a\u00020\u0014\u0012\b\b\u0002\u0010$\u001a\u00020\u0014\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&¢\u0006\u0004\b'\u0010(J\b\u0010f\u001a\u0004\u0018\u00010gJ\u0006\u0010h\u001a\u00020iJ\u0006\u0010j\u001a\u00020kJ\b\u0010l\u001a\u00020\u0014H\u0007J\b\u0010m\u001a\u00020nH\u0002J\u0006\u0010o\u001a\u00020pJ\u0006\u0010q\u001a\u00020rJ\u0010\u0010s\u001a\u00020t2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\b\u0010u\u001a\u0004\u0018\u00010vJ\b\u0010w\u001a\u0004\u0018\u00010vJ\u000b\u0010x\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010y\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010z\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010{\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u000b\u0010|\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010}\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010~\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010\u007f\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\n\u0010\u0080\u0001\u001a\u00020\u0014HÆ\u0003J\u0010\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020\u00030\tHÆ\u0003J\f\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\f\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\f\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u001bHÆ\u0003J\n\u0010\u0085\u0001\u001a\u00020\u0014HÆ\u0003J\n\u0010\u0086\u0001\u001a\u00020\u001eHÆ\u0003J\n\u0010\u0087\u0001\u001a\u00020\u0014HÆ\u0003J\n\u0010\u0088\u0001\u001a\u00020\u0014HÆ\u0003J\f\u0010\u0089\u0001\u001a\u0004\u0018\u00010\"HÆ\u0003J\n\u0010\u008a\u0001\u001a\u00020\u0014HÆ\u0003J\n\u0010\u008b\u0001\u001a\u00020\u0014HÆ\u0003J\f\u0010\u008c\u0001\u001a\u0004\u0018\u00010&HÆ\u0003J\u0082\u0002\u0010\u008d\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u00142\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u00142\b\b\u0002\u0010 \u001a\u00020\u00142\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010#\u001a\u00020\u00142\b\b\u0002\u0010$\u001a\u00020\u00142\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&HÆ\u0001J\u0015\u0010\u008e\u0001\u001a\u00020\u00142\t\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u000b\u0010\u0090\u0001\u001a\u00030\u0091\u0001HÖ\u0001J\n\u0010\u0092\u0001\u001a\u00020JHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\t¢\u0006\b\n\u0000\u001a\u0004\b;\u00100R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0011\u0010\u001c\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\bB\u0010:R\u0011\u0010\u001d\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0011\u0010\u001f\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010:R\u0011\u0010 \u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b \u0010:R\u0013\u0010!\u001a\u0004\u0018\u00010\"¢\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u0011\u0010#\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b#\u0010:R\u0011\u0010$\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b$\u0010:R\u0013\u0010%\u001a\u0004\u0018\u00010&¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0013\u0010I\u001a\u0004\u0018\u00010J¢\u0006\b\n\u0000\u001a\u0004\bK\u0010LR\u0011\u0010M\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\bN\u0010:R\u0010\u0010O\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010P\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010RR\u0011\u0010S\u001a\u00020T8F¢\u0006\u0006\u001a\u0004\bU\u0010VR\u0014\u0010W\u001a\u00020T8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bX\u0010VR\u0019\u0010Y\u001a\n\u0012\u0004\u0012\u00020[\u0018\u00010Z8F¢\u0006\u0006\u001a\u0004\b\\\u0010]R\u0013\u0010^\u001a\u0004\u0018\u00010_8F¢\u0006\u0006\u001a\u0004\b`\u0010aR\u0011\u0010b\u001a\u00020c8F¢\u0006\u0006\u001a\u0004\bd\u0010e¨\u0006\u0094\u0001"}, m3636d2 = {"Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailDataState;", "", "selectedContractId", "Ljava/util/UUID;", "futuresAccount", "Lcom/robinhood/android/models/futures/db/FuturesAccount;", "futuresProduct", "Lcom/robinhood/android/models/futures/arsenal/db/FuturesProduct;", "relatedContracts", "", "Lcom/robinhood/android/models/futures/arsenal/db/FuturesContract;", "ordersOverview", "Lcom/robinhood/store/futures/FuturesOrderStore$GetOrdersOverviewResult;", "quote", "Lcom/robinhood/android/models/futures/marketdata/db/FuturesQuote;", "nextOpenTradingSession", "Lcom/robinhood/android/models/futures/arsenal/db/FuturesTradingHours$Session;", "costBasis", "Lcom/robinhood/android/models/futures/db/FuturesCostBasis;", "contractSelectorOpen", "", "contractIdsInUserLists", "fundamentals", "Lcom/robinhood/android/models/futures/marketdata/db/FuturesFundamentals;", "marginRequirement", "Lcom/robinhood/android/models/futures/arsenal/db/FuturesMarginRequirement;", "ftuxProgressState", "Lcom/robinhood/android/futures/detail/ui/duxo/FtuxProgressState;", "showLadderButtonTooltip", "ladderKillswitchVariant", "Lcom/robinhood/android/models/futures/FuturesLadderKillswitchExperiment$Variant;", "isInTradingSession", "isFlattenCallInProgress", "mibFuturesState", "Lcom/robinhood/store/futures/mib/MiBFuturesState;", "isInFuturesProductVsContractExperiment", "isViewingProductOnly", "locale", "Lcom/robinhood/store/futures/FuturesLocale;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/android/models/futures/db/FuturesAccount;Lcom/robinhood/android/models/futures/arsenal/db/FuturesProduct;Ljava/util/List;Lcom/robinhood/store/futures/FuturesOrderStore$GetOrdersOverviewResult;Lcom/robinhood/android/models/futures/marketdata/db/FuturesQuote;Lcom/robinhood/android/models/futures/arsenal/db/FuturesTradingHours$Session;Lcom/robinhood/android/models/futures/db/FuturesCostBasis;ZLjava/util/List;Lcom/robinhood/android/models/futures/marketdata/db/FuturesFundamentals;Lcom/robinhood/android/models/futures/arsenal/db/FuturesMarginRequirement;Lcom/robinhood/android/futures/detail/ui/duxo/FtuxProgressState;ZLcom/robinhood/android/models/futures/FuturesLadderKillswitchExperiment$Variant;ZZLcom/robinhood/store/futures/mib/MiBFuturesState;ZZLcom/robinhood/store/futures/FuturesLocale;)V", "getSelectedContractId", "()Ljava/util/UUID;", "getFuturesAccount", "()Lcom/robinhood/android/models/futures/db/FuturesAccount;", "getFuturesProduct", "()Lcom/robinhood/android/models/futures/arsenal/db/FuturesProduct;", "getRelatedContracts", "()Ljava/util/List;", "getOrdersOverview", "()Lcom/robinhood/store/futures/FuturesOrderStore$GetOrdersOverviewResult;", "getQuote", "()Lcom/robinhood/android/models/futures/marketdata/db/FuturesQuote;", "getNextOpenTradingSession", "()Lcom/robinhood/android/models/futures/arsenal/db/FuturesTradingHours$Session;", "getCostBasis", "()Lcom/robinhood/android/models/futures/db/FuturesCostBasis;", "getContractSelectorOpen", "()Z", "getContractIdsInUserLists", "getFundamentals", "()Lcom/robinhood/android/models/futures/marketdata/db/FuturesFundamentals;", "getMarginRequirement", "()Lcom/robinhood/android/models/futures/arsenal/db/FuturesMarginRequirement;", "getFtuxProgressState", "()Lcom/robinhood/android/futures/detail/ui/duxo/FtuxProgressState;", "getShowLadderButtonTooltip", "getLadderKillswitchVariant", "()Lcom/robinhood/android/models/futures/FuturesLadderKillswitchExperiment$Variant;", "getMibFuturesState", "()Lcom/robinhood/store/futures/mib/MiBFuturesState;", "getLocale", "()Lcom/robinhood/store/futures/FuturesLocale;", "rhsAccountNumber", "", "getRhsAccountNumber", "()Ljava/lang/String;", "userIsMiB", "getUserIsMiB", "activeFuturesContract", "selectedContract", "getSelectedContract", "()Lcom/robinhood/android/models/futures/arsenal/db/FuturesContract;", "contractSelectorDisplay", "Lcom/robinhood/utils/resource/StringResource;", "getContractSelectorDisplay", "()Lcom/robinhood/utils/resource/StringResource;", "marginRequired", "getMarginRequired", "relatedContractsData", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState$RelatedContract;", "getRelatedContractsData", "()Lkotlinx/collections/immutable/ImmutableList;", "about", "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState$AboutData;", "getAbout", "()Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState$AboutData;", "stats", "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState$StatsData;", "getStats", "()Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState$StatsData;", "getPositionData", "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState$PositionData;", "getContractSpecsData", "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState$ContractSpecsData;", "getTopBarData", "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState$TopBarData;", "isLadderKillswitchOnForUser", "getTradeBarOverviewContent", "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState$TradeBarData$TradeBarOverviewContent;", "getTradeBarData", "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState$TradeBarData;", "getLoggingData", "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState$LoggingData;", "buildHistoryShowMoreFooterKey", "Lcom/robinhood/shared/history/contracts/account/AccountsHistoryContract$Key;", "buildSettledOrderHistorySectionData", "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState$HistorySectionData;", "buildPendingOrderHistorySectionData", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "feature-futures-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final /* data */ class FuturesDetailDataState {
    public static final int MAX_NUM_ROWS_PER_HISTORY_SECTION = 4;
    private static final int NUM_DECIMAL_FOR_AVERAGE_PRICE = 2;
    private final FuturesContract activeFuturesContract;
    private final List<UUID> contractIdsInUserLists;
    private final boolean contractSelectorOpen;
    private final FuturesCostBasis costBasis;
    private final FtuxProgressState ftuxProgressState;
    private final FuturesFundamentals fundamentals;
    private final FuturesAccount futuresAccount;
    private final FuturesProduct futuresProduct;
    private final boolean isFlattenCallInProgress;
    private final boolean isInFuturesProductVsContractExperiment;
    private final boolean isInTradingSession;
    private final boolean isViewingProductOnly;
    private final FuturesLadderKillswitchExperiment.Variant ladderKillswitchVariant;
    private final FuturesLocaleStore2 locale;
    private final FuturesMarginRequirement marginRequirement;
    private final MiBFuturesState mibFuturesState;
    private final FuturesTradingHours.Session nextOpenTradingSession;
    private final FuturesOrderStore.GetOrdersOverviewResult ordersOverview;
    private final FuturesQuote quote;
    private final List<FuturesContract> relatedContracts;
    private final String rhsAccountNumber;
    private final FuturesContract selectedContract;
    private final UUID selectedContractId;
    private final boolean showLadderButtonTooltip;
    private final boolean userIsMiB;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: FuturesDetailDataState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[FuturesLadderKillswitchExperiment.Variant.values().length];
            try {
                iArr[FuturesLadderKillswitchExperiment.Variant.ENABLE_ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FuturesLadderKillswitchExperiment.Variant.DISABLE_ALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FuturesLadderKillswitchExperiment.Variant.DISABLE_NON_RHD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FuturesContractTradability.values().length];
            try {
                iArr2[FuturesContractTradability.TRADABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[FuturesContractTradability.UNTRADABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[FuturesContractTradability.PCO.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public FuturesDetailDataState() {
        this(null, null, null, null, null, null, null, null, false, null, null, null, null, false, null, false, false, null, false, false, null, 2097151, null);
    }

    public static /* synthetic */ FuturesDetailDataState copy$default(FuturesDetailDataState futuresDetailDataState, UUID uuid, FuturesAccount futuresAccount, FuturesProduct futuresProduct, List list, FuturesOrderStore.GetOrdersOverviewResult getOrdersOverviewResult, FuturesQuote futuresQuote, FuturesTradingHours.Session session, FuturesCostBasis futuresCostBasis, boolean z, List list2, FuturesFundamentals futuresFundamentals, FuturesMarginRequirement futuresMarginRequirement, FtuxProgressState ftuxProgressState, boolean z2, FuturesLadderKillswitchExperiment.Variant variant, boolean z3, boolean z4, MiBFuturesState miBFuturesState, boolean z5, boolean z6, FuturesLocaleStore2 futuresLocaleStore2, int i, Object obj) {
        FuturesLocaleStore2 futuresLocaleStore22;
        boolean z7;
        UUID uuid2 = (i & 1) != 0 ? futuresDetailDataState.selectedContractId : uuid;
        FuturesAccount futuresAccount2 = (i & 2) != 0 ? futuresDetailDataState.futuresAccount : futuresAccount;
        FuturesProduct futuresProduct2 = (i & 4) != 0 ? futuresDetailDataState.futuresProduct : futuresProduct;
        List list3 = (i & 8) != 0 ? futuresDetailDataState.relatedContracts : list;
        FuturesOrderStore.GetOrdersOverviewResult getOrdersOverviewResult2 = (i & 16) != 0 ? futuresDetailDataState.ordersOverview : getOrdersOverviewResult;
        FuturesQuote futuresQuote2 = (i & 32) != 0 ? futuresDetailDataState.quote : futuresQuote;
        FuturesTradingHours.Session session2 = (i & 64) != 0 ? futuresDetailDataState.nextOpenTradingSession : session;
        FuturesCostBasis futuresCostBasis2 = (i & 128) != 0 ? futuresDetailDataState.costBasis : futuresCostBasis;
        boolean z8 = (i & 256) != 0 ? futuresDetailDataState.contractSelectorOpen : z;
        List list4 = (i & 512) != 0 ? futuresDetailDataState.contractIdsInUserLists : list2;
        FuturesFundamentals futuresFundamentals2 = (i & 1024) != 0 ? futuresDetailDataState.fundamentals : futuresFundamentals;
        FuturesMarginRequirement futuresMarginRequirement2 = (i & 2048) != 0 ? futuresDetailDataState.marginRequirement : futuresMarginRequirement;
        FtuxProgressState ftuxProgressState2 = (i & 4096) != 0 ? futuresDetailDataState.ftuxProgressState : ftuxProgressState;
        boolean z9 = (i & 8192) != 0 ? futuresDetailDataState.showLadderButtonTooltip : z2;
        UUID uuid3 = uuid2;
        FuturesLadderKillswitchExperiment.Variant variant2 = (i & 16384) != 0 ? futuresDetailDataState.ladderKillswitchVariant : variant;
        boolean z10 = (i & 32768) != 0 ? futuresDetailDataState.isInTradingSession : z3;
        boolean z11 = (i & 65536) != 0 ? futuresDetailDataState.isFlattenCallInProgress : z4;
        MiBFuturesState miBFuturesState2 = (i & 131072) != 0 ? futuresDetailDataState.mibFuturesState : miBFuturesState;
        boolean z12 = (i & 262144) != 0 ? futuresDetailDataState.isInFuturesProductVsContractExperiment : z5;
        boolean z13 = (i & 524288) != 0 ? futuresDetailDataState.isViewingProductOnly : z6;
        if ((i & 1048576) != 0) {
            z7 = z13;
            futuresLocaleStore22 = futuresDetailDataState.locale;
        } else {
            futuresLocaleStore22 = futuresLocaleStore2;
            z7 = z13;
        }
        return futuresDetailDataState.copy(uuid3, futuresAccount2, futuresProduct2, list3, getOrdersOverviewResult2, futuresQuote2, session2, futuresCostBasis2, z8, list4, futuresFundamentals2, futuresMarginRequirement2, ftuxProgressState2, z9, variant2, z10, z11, miBFuturesState2, z12, z7, futuresLocaleStore22);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getSelectedContractId() {
        return this.selectedContractId;
    }

    public final List<UUID> component10() {
        return this.contractIdsInUserLists;
    }

    /* renamed from: component11, reason: from getter */
    public final FuturesFundamentals getFundamentals() {
        return this.fundamentals;
    }

    /* renamed from: component12, reason: from getter */
    public final FuturesMarginRequirement getMarginRequirement() {
        return this.marginRequirement;
    }

    /* renamed from: component13, reason: from getter */
    public final FtuxProgressState getFtuxProgressState() {
        return this.ftuxProgressState;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getShowLadderButtonTooltip() {
        return this.showLadderButtonTooltip;
    }

    /* renamed from: component15, reason: from getter */
    public final FuturesLadderKillswitchExperiment.Variant getLadderKillswitchVariant() {
        return this.ladderKillswitchVariant;
    }

    /* renamed from: component16, reason: from getter */
    public final boolean getIsInTradingSession() {
        return this.isInTradingSession;
    }

    /* renamed from: component17, reason: from getter */
    public final boolean getIsFlattenCallInProgress() {
        return this.isFlattenCallInProgress;
    }

    /* renamed from: component18, reason: from getter */
    public final MiBFuturesState getMibFuturesState() {
        return this.mibFuturesState;
    }

    /* renamed from: component19, reason: from getter */
    public final boolean getIsInFuturesProductVsContractExperiment() {
        return this.isInFuturesProductVsContractExperiment;
    }

    /* renamed from: component2, reason: from getter */
    public final FuturesAccount getFuturesAccount() {
        return this.futuresAccount;
    }

    /* renamed from: component20, reason: from getter */
    public final boolean getIsViewingProductOnly() {
        return this.isViewingProductOnly;
    }

    /* renamed from: component21, reason: from getter */
    public final FuturesLocaleStore2 getLocale() {
        return this.locale;
    }

    /* renamed from: component3, reason: from getter */
    public final FuturesProduct getFuturesProduct() {
        return this.futuresProduct;
    }

    public final List<FuturesContract> component4() {
        return this.relatedContracts;
    }

    /* renamed from: component5, reason: from getter */
    public final FuturesOrderStore.GetOrdersOverviewResult getOrdersOverview() {
        return this.ordersOverview;
    }

    /* renamed from: component6, reason: from getter */
    public final FuturesQuote getQuote() {
        return this.quote;
    }

    /* renamed from: component7, reason: from getter */
    public final FuturesTradingHours.Session getNextOpenTradingSession() {
        return this.nextOpenTradingSession;
    }

    /* renamed from: component8, reason: from getter */
    public final FuturesCostBasis getCostBasis() {
        return this.costBasis;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getContractSelectorOpen() {
        return this.contractSelectorOpen;
    }

    public final FuturesDetailDataState copy(UUID selectedContractId, FuturesAccount futuresAccount, FuturesProduct futuresProduct, List<FuturesContract> relatedContracts, FuturesOrderStore.GetOrdersOverviewResult ordersOverview, FuturesQuote quote, FuturesTradingHours.Session nextOpenTradingSession, FuturesCostBasis costBasis, boolean contractSelectorOpen, List<UUID> contractIdsInUserLists, FuturesFundamentals fundamentals, FuturesMarginRequirement marginRequirement, FtuxProgressState ftuxProgressState, boolean showLadderButtonTooltip, FuturesLadderKillswitchExperiment.Variant ladderKillswitchVariant, boolean isInTradingSession, boolean isFlattenCallInProgress, MiBFuturesState mibFuturesState, boolean isInFuturesProductVsContractExperiment, boolean isViewingProductOnly, FuturesLocaleStore2 locale) {
        Intrinsics.checkNotNullParameter(contractIdsInUserLists, "contractIdsInUserLists");
        Intrinsics.checkNotNullParameter(ladderKillswitchVariant, "ladderKillswitchVariant");
        return new FuturesDetailDataState(selectedContractId, futuresAccount, futuresProduct, relatedContracts, ordersOverview, quote, nextOpenTradingSession, costBasis, contractSelectorOpen, contractIdsInUserLists, fundamentals, marginRequirement, ftuxProgressState, showLadderButtonTooltip, ladderKillswitchVariant, isInTradingSession, isFlattenCallInProgress, mibFuturesState, isInFuturesProductVsContractExperiment, isViewingProductOnly, locale);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FuturesDetailDataState)) {
            return false;
        }
        FuturesDetailDataState futuresDetailDataState = (FuturesDetailDataState) other;
        return Intrinsics.areEqual(this.selectedContractId, futuresDetailDataState.selectedContractId) && Intrinsics.areEqual(this.futuresAccount, futuresDetailDataState.futuresAccount) && Intrinsics.areEqual(this.futuresProduct, futuresDetailDataState.futuresProduct) && Intrinsics.areEqual(this.relatedContracts, futuresDetailDataState.relatedContracts) && Intrinsics.areEqual(this.ordersOverview, futuresDetailDataState.ordersOverview) && Intrinsics.areEqual(this.quote, futuresDetailDataState.quote) && Intrinsics.areEqual(this.nextOpenTradingSession, futuresDetailDataState.nextOpenTradingSession) && Intrinsics.areEqual(this.costBasis, futuresDetailDataState.costBasis) && this.contractSelectorOpen == futuresDetailDataState.contractSelectorOpen && Intrinsics.areEqual(this.contractIdsInUserLists, futuresDetailDataState.contractIdsInUserLists) && Intrinsics.areEqual(this.fundamentals, futuresDetailDataState.fundamentals) && Intrinsics.areEqual(this.marginRequirement, futuresDetailDataState.marginRequirement) && Intrinsics.areEqual(this.ftuxProgressState, futuresDetailDataState.ftuxProgressState) && this.showLadderButtonTooltip == futuresDetailDataState.showLadderButtonTooltip && this.ladderKillswitchVariant == futuresDetailDataState.ladderKillswitchVariant && this.isInTradingSession == futuresDetailDataState.isInTradingSession && this.isFlattenCallInProgress == futuresDetailDataState.isFlattenCallInProgress && Intrinsics.areEqual(this.mibFuturesState, futuresDetailDataState.mibFuturesState) && this.isInFuturesProductVsContractExperiment == futuresDetailDataState.isInFuturesProductVsContractExperiment && this.isViewingProductOnly == futuresDetailDataState.isViewingProductOnly && this.locale == futuresDetailDataState.locale;
    }

    public int hashCode() {
        UUID uuid = this.selectedContractId;
        int iHashCode = (uuid == null ? 0 : uuid.hashCode()) * 31;
        FuturesAccount futuresAccount = this.futuresAccount;
        int iHashCode2 = (iHashCode + (futuresAccount == null ? 0 : futuresAccount.hashCode())) * 31;
        FuturesProduct futuresProduct = this.futuresProduct;
        int iHashCode3 = (iHashCode2 + (futuresProduct == null ? 0 : futuresProduct.hashCode())) * 31;
        List<FuturesContract> list = this.relatedContracts;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        FuturesOrderStore.GetOrdersOverviewResult getOrdersOverviewResult = this.ordersOverview;
        int iHashCode5 = (iHashCode4 + (getOrdersOverviewResult == null ? 0 : getOrdersOverviewResult.hashCode())) * 31;
        FuturesQuote futuresQuote = this.quote;
        int iHashCode6 = (iHashCode5 + (futuresQuote == null ? 0 : futuresQuote.hashCode())) * 31;
        FuturesTradingHours.Session session = this.nextOpenTradingSession;
        int iHashCode7 = (iHashCode6 + (session == null ? 0 : session.hashCode())) * 31;
        FuturesCostBasis futuresCostBasis = this.costBasis;
        int iHashCode8 = (((((iHashCode7 + (futuresCostBasis == null ? 0 : futuresCostBasis.hashCode())) * 31) + Boolean.hashCode(this.contractSelectorOpen)) * 31) + this.contractIdsInUserLists.hashCode()) * 31;
        FuturesFundamentals futuresFundamentals = this.fundamentals;
        int iHashCode9 = (iHashCode8 + (futuresFundamentals == null ? 0 : futuresFundamentals.hashCode())) * 31;
        FuturesMarginRequirement futuresMarginRequirement = this.marginRequirement;
        int iHashCode10 = (iHashCode9 + (futuresMarginRequirement == null ? 0 : futuresMarginRequirement.hashCode())) * 31;
        FtuxProgressState ftuxProgressState = this.ftuxProgressState;
        int iHashCode11 = (((((((((iHashCode10 + (ftuxProgressState == null ? 0 : ftuxProgressState.hashCode())) * 31) + Boolean.hashCode(this.showLadderButtonTooltip)) * 31) + this.ladderKillswitchVariant.hashCode()) * 31) + Boolean.hashCode(this.isInTradingSession)) * 31) + Boolean.hashCode(this.isFlattenCallInProgress)) * 31;
        MiBFuturesState miBFuturesState = this.mibFuturesState;
        int iHashCode12 = (((((iHashCode11 + (miBFuturesState == null ? 0 : miBFuturesState.hashCode())) * 31) + Boolean.hashCode(this.isInFuturesProductVsContractExperiment)) * 31) + Boolean.hashCode(this.isViewingProductOnly)) * 31;
        FuturesLocaleStore2 futuresLocaleStore2 = this.locale;
        return iHashCode12 + (futuresLocaleStore2 != null ? futuresLocaleStore2.hashCode() : 0);
    }

    public String toString() {
        return "FuturesDetailDataState(selectedContractId=" + this.selectedContractId + ", futuresAccount=" + this.futuresAccount + ", futuresProduct=" + this.futuresProduct + ", relatedContracts=" + this.relatedContracts + ", ordersOverview=" + this.ordersOverview + ", quote=" + this.quote + ", nextOpenTradingSession=" + this.nextOpenTradingSession + ", costBasis=" + this.costBasis + ", contractSelectorOpen=" + this.contractSelectorOpen + ", contractIdsInUserLists=" + this.contractIdsInUserLists + ", fundamentals=" + this.fundamentals + ", marginRequirement=" + this.marginRequirement + ", ftuxProgressState=" + this.ftuxProgressState + ", showLadderButtonTooltip=" + this.showLadderButtonTooltip + ", ladderKillswitchVariant=" + this.ladderKillswitchVariant + ", isInTradingSession=" + this.isInTradingSession + ", isFlattenCallInProgress=" + this.isFlattenCallInProgress + ", mibFuturesState=" + this.mibFuturesState + ", isInFuturesProductVsContractExperiment=" + this.isInFuturesProductVsContractExperiment + ", isViewingProductOnly=" + this.isViewingProductOnly + ", locale=" + this.locale + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FuturesDetailDataState(UUID uuid, FuturesAccount futuresAccount, FuturesProduct futuresProduct, List<FuturesContract> list, FuturesOrderStore.GetOrdersOverviewResult getOrdersOverviewResult, FuturesQuote futuresQuote, FuturesTradingHours.Session session, FuturesCostBasis futuresCostBasis, boolean z, List<UUID> contractIdsInUserLists, FuturesFundamentals futuresFundamentals, FuturesMarginRequirement futuresMarginRequirement, FtuxProgressState ftuxProgressState, boolean z2, FuturesLadderKillswitchExperiment.Variant ladderKillswitchVariant, boolean z3, boolean z4, MiBFuturesState miBFuturesState, boolean z5, boolean z6, FuturesLocaleStore2 futuresLocaleStore2) {
        FuturesContract futuresContract;
        UUID activeFuturesContractId;
        Object next;
        Account futuresAllowedRhsAccount;
        Intrinsics.checkNotNullParameter(contractIdsInUserLists, "contractIdsInUserLists");
        Intrinsics.checkNotNullParameter(ladderKillswitchVariant, "ladderKillswitchVariant");
        this.selectedContractId = uuid;
        this.futuresAccount = futuresAccount;
        this.futuresProduct = futuresProduct;
        this.relatedContracts = list;
        this.ordersOverview = getOrdersOverviewResult;
        this.quote = futuresQuote;
        this.nextOpenTradingSession = session;
        this.costBasis = futuresCostBasis;
        this.contractSelectorOpen = z;
        this.contractIdsInUserLists = contractIdsInUserLists;
        this.fundamentals = futuresFundamentals;
        this.marginRequirement = futuresMarginRequirement;
        this.ftuxProgressState = ftuxProgressState;
        this.showLadderButtonTooltip = z2;
        this.ladderKillswitchVariant = ladderKillswitchVariant;
        this.isInTradingSession = z3;
        this.isFlattenCallInProgress = z4;
        this.mibFuturesState = miBFuturesState;
        this.isInFuturesProductVsContractExperiment = z5;
        this.isViewingProductOnly = z6;
        this.locale = futuresLocaleStore2;
        FuturesContract futuresContract2 = null;
        this.rhsAccountNumber = (miBFuturesState == null || (futuresAllowedRhsAccount = miBFuturesState.getFuturesAllowedRhsAccount()) == null) ? null : futuresAllowedRhsAccount.getAccountNumber();
        boolean z7 = false;
        if (miBFuturesState != null && miBFuturesState.isInMiBFuturesExperiment() && miBFuturesState.getHasMultipleRhsAccounts()) {
            z7 = true;
        }
        this.userIsMiB = z7;
        if (futuresProduct == null || (activeFuturesContractId = futuresProduct.getActiveFuturesContractId()) == null || list == null) {
            futuresContract = null;
        } else {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (Intrinsics.areEqual(((FuturesContract) next).getId(), activeFuturesContractId)) {
                        break;
                    }
                }
            }
            futuresContract = (FuturesContract) next;
        }
        this.activeFuturesContract = futuresContract;
        List<FuturesContract> list2 = this.relatedContracts;
        if (list2 != null) {
            Iterator<T> it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                if (Intrinsics.areEqual(((FuturesContract) next2).getId(), this.selectedContractId)) {
                    futuresContract2 = next2;
                    break;
                }
            }
            futuresContract2 = futuresContract2;
        }
        this.selectedContract = futuresContract2;
    }

    public final UUID getSelectedContractId() {
        return this.selectedContractId;
    }

    public final FuturesAccount getFuturesAccount() {
        return this.futuresAccount;
    }

    public final FuturesProduct getFuturesProduct() {
        return this.futuresProduct;
    }

    public final List<FuturesContract> getRelatedContracts() {
        return this.relatedContracts;
    }

    public final FuturesOrderStore.GetOrdersOverviewResult getOrdersOverview() {
        return this.ordersOverview;
    }

    public final FuturesQuote getQuote() {
        return this.quote;
    }

    public final FuturesTradingHours.Session getNextOpenTradingSession() {
        return this.nextOpenTradingSession;
    }

    public final FuturesCostBasis getCostBasis() {
        return this.costBasis;
    }

    public final boolean getContractSelectorOpen() {
        return this.contractSelectorOpen;
    }

    public /* synthetic */ FuturesDetailDataState(UUID uuid, FuturesAccount futuresAccount, FuturesProduct futuresProduct, List list, FuturesOrderStore.GetOrdersOverviewResult getOrdersOverviewResult, FuturesQuote futuresQuote, FuturesTradingHours.Session session, FuturesCostBasis futuresCostBasis, boolean z, List list2, FuturesFundamentals futuresFundamentals, FuturesMarginRequirement futuresMarginRequirement, FtuxProgressState ftuxProgressState, boolean z2, FuturesLadderKillswitchExperiment.Variant variant, boolean z3, boolean z4, MiBFuturesState miBFuturesState, boolean z5, boolean z6, FuturesLocaleStore2 futuresLocaleStore2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uuid, (i & 2) != 0 ? null : futuresAccount, (i & 4) != 0 ? null : futuresProduct, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : getOrdersOverviewResult, (i & 32) != 0 ? null : futuresQuote, (i & 64) != 0 ? null : session, (i & 128) != 0 ? null : futuresCostBasis, (i & 256) != 0 ? false : z, (i & 512) != 0 ? CollectionsKt.emptyList() : list2, (i & 1024) != 0 ? null : futuresFundamentals, (i & 2048) != 0 ? null : futuresMarginRequirement, (i & 4096) != 0 ? null : ftuxProgressState, (i & 8192) != 0 ? false : z2, (i & 16384) != 0 ? FuturesLadderKillswitchExperiment.Variant.ENABLE_ALL : variant, (i & 32768) != 0 ? false : z3, (i & 65536) != 0 ? false : z4, (i & 131072) != 0 ? null : miBFuturesState, (i & 262144) != 0 ? false : z5, (i & 524288) != 0 ? false : z6, (i & 1048576) != 0 ? null : futuresLocaleStore2);
    }

    public final List<UUID> getContractIdsInUserLists() {
        return this.contractIdsInUserLists;
    }

    public final FuturesFundamentals getFundamentals() {
        return this.fundamentals;
    }

    public final FuturesMarginRequirement getMarginRequirement() {
        return this.marginRequirement;
    }

    public final FtuxProgressState getFtuxProgressState() {
        return this.ftuxProgressState;
    }

    public final boolean getShowLadderButtonTooltip() {
        return this.showLadderButtonTooltip;
    }

    public final FuturesLadderKillswitchExperiment.Variant getLadderKillswitchVariant() {
        return this.ladderKillswitchVariant;
    }

    public final boolean isInTradingSession() {
        return this.isInTradingSession;
    }

    public final boolean isFlattenCallInProgress() {
        return this.isFlattenCallInProgress;
    }

    public final MiBFuturesState getMibFuturesState() {
        return this.mibFuturesState;
    }

    public final boolean isInFuturesProductVsContractExperiment() {
        return this.isInFuturesProductVsContractExperiment;
    }

    public final boolean isViewingProductOnly() {
        return this.isViewingProductOnly;
    }

    public final FuturesLocaleStore2 getLocale() {
        return this.locale;
    }

    public final String getRhsAccountNumber() {
        return this.rhsAccountNumber;
    }

    public final boolean getUserIsMiB() {
        return this.userIsMiB;
    }

    public final FuturesContract getSelectedContract() {
        return this.selectedContract;
    }

    public final StringResource getContractSelectorDisplay() {
        FuturesContract futuresContract = this.selectedContract;
        if (futuresContract == null) {
            return StringResource.INSTANCE.invoke(C17042R.string.futures_detail_loading, new Object[0]);
        }
        if (this.isInFuturesProductVsContractExperiment && this.isViewingProductOnly) {
            FuturesProduct futuresProduct = this.futuresProduct;
            if (futuresProduct != null) {
                StringResource.Companion companion = StringResource.INSTANCE;
                int i = C17042R.string.futures_detail_current_contract_display;
                String displaySymbol = futuresProduct.getDisplaySymbol();
                if (displaySymbol == null) {
                    displaySymbol = futuresProduct.getSymbol();
                }
                StringResource stringResourceInvoke = companion.invoke(i, displaySymbol, FuturesContract3.formatExpiration(futuresContract));
                if (stringResourceInvoke != null) {
                    return stringResourceInvoke;
                }
            }
            return StringResource.INSTANCE.invoke(C17042R.string.futures_detail_loading, new Object[0]);
        }
        return StringResource.INSTANCE.invoke(C17042R.string.futures_detail_current_contract_display, futuresContract.getDisplaySymbol(), FuturesContract3.formatExpiration(futuresContract));
    }

    private final StringResource getMarginRequired() {
        FuturesMarginRequirement futuresMarginRequirement = this.marginRequirement;
        if (futuresMarginRequirement != null) {
            return StringResource.INSTANCE.invoke(Money.format$default(futuresMarginRequirement.getMarginRequirementAsMoney(), null, false, null, false, 0, null, false, null, false, false, 1023, null));
        }
        return StringResource.INSTANCE.invoke(C11048R.string.general_label_n_a_short, new Object[0]);
    }

    public final ImmutableList<FuturesDetailViewState.RelatedContract> getRelatedContractsData() {
        List<FuturesContract> list = this.relatedContracts;
        if (list == null) {
            return null;
        }
        List<FuturesContract> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (FuturesContract futuresContract : list2) {
            UUID id = futuresContract.getId();
            String expiration = FuturesContract3.formatExpiration(futuresContract);
            String displaySymbol = futuresContract.getDisplaySymbol();
            boolean zAreEqual = Intrinsics.areEqual(this.selectedContractId, futuresContract.getId());
            UUID id2 = futuresContract.getId();
            FuturesProduct futuresProduct = this.futuresProduct;
            arrayList.add(new FuturesDetailViewState.RelatedContract(id, expiration, displaySymbol, zAreEqual, Intrinsics.areEqual(id2, futuresProduct != null ? futuresProduct.getActiveFuturesContractId() : null)));
        }
        return extensions2.toImmutableList(arrayList);
    }

    public final FuturesDetailViewState.AboutData getAbout() {
        String displayName;
        String longDescription;
        FuturesProduct futuresProduct = this.futuresProduct;
        if (futuresProduct == null || (displayName = futuresProduct.getDisplayName()) == null || (longDescription = this.futuresProduct.getLongDescription()) == null || longDescription.length() == 0) {
            return null;
        }
        return new FuturesDetailViewState.AboutData(StringResource.INSTANCE.invoke(C17042R.string.futures_detail_about_section_header, displayName), longDescription);
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final FuturesDetailViewState.StatsData getStats() {
        StringResource stringResourceInvoke;
        StringResource stringResourceInvoke2;
        BigDecimal previousClosePrice;
        BigDecimal volume;
        BigDecimal low;
        BigDecimal high;
        BigDecimal askPrice;
        BigDecimal bidPrice;
        FuturesQuote futuresQuote = this.quote;
        StringResource stringResourceInvoke3 = null;
        Integer bidSize = futuresQuote != null ? futuresQuote.getBidSize() : null;
        FuturesQuote futuresQuote2 = this.quote;
        Integer askSize = futuresQuote2 != null ? futuresQuote2.getAskSize() : null;
        float fMax = Math.max(bidSize != null ? bidSize.intValue() : 0, askSize != null ? askSize.intValue() : 0);
        FuturesQuote futuresQuote3 = this.quote;
        StringResource stringResourceInvoke4 = (futuresQuote3 == null || (bidPrice = futuresQuote3.getBidPrice()) == null) ? null : StringResource.INSTANCE.invoke(FuturesProduct5.format$default(this.futuresProduct, bidPrice, null, 2, null));
        FuturesQuote futuresQuote4 = this.quote;
        StringResource stringResourceInvoke5 = (futuresQuote4 == null || (askPrice = futuresQuote4.getAskPrice()) == null) ? null : StringResource.INSTANCE.invoke(FuturesProduct5.format$default(this.futuresProduct, askPrice, null, 2, null));
        FuturesFundamentals futuresFundamentals = this.fundamentals;
        StringResource stringResourceInvoke6 = (futuresFundamentals == null || (high = futuresFundamentals.getHigh()) == null) ? null : StringResource.INSTANCE.invoke(FuturesProduct5.format$default(this.futuresProduct, high, null, 2, null));
        FuturesFundamentals futuresFundamentals2 = this.fundamentals;
        StringResource stringResourceInvoke7 = (futuresFundamentals2 == null || (low = futuresFundamentals2.getLow()) == null) ? null : StringResource.INSTANCE.invoke(FuturesProduct5.format$default(this.futuresProduct, low, null, 2, null));
        FuturesFundamentals futuresFundamentals3 = this.fundamentals;
        StringResource stringResourceInvoke8 = (futuresFundamentals3 == null || (volume = futuresFundamentals3.getVolume()) == null) ? null : StringResource.INSTANCE.invoke(Formats.getIntegerFormat().format(volume));
        FuturesFundamentals futuresFundamentals4 = this.fundamentals;
        if (futuresFundamentals4 != null && (previousClosePrice = futuresFundamentals4.getPreviousClosePrice()) != null) {
            stringResourceInvoke3 = StringResource.INSTANCE.invoke(FuturesProduct5.format$default(this.futuresProduct, previousClosePrice, null, 2, null));
        }
        if (stringResourceInvoke4 == null) {
            stringResourceInvoke4 = StringResource.INSTANCE.invoke(C11048R.string.general_label_n_a_short, new Object[0]);
        }
        StringResource stringResource = stringResourceInvoke4;
        if (stringResourceInvoke5 == null) {
            stringResourceInvoke5 = StringResource.INSTANCE.invoke(C11048R.string.general_label_n_a_short, new Object[0]);
        }
        StringResource stringResource2 = stringResourceInvoke5;
        if (bidSize != null) {
            stringResourceInvoke = StringResource.INSTANCE.invoke(C17042R.string.futures_detail_stats_size, Integer.valueOf(bidSize.intValue()));
            if (stringResourceInvoke == null) {
                stringResourceInvoke = StringResource.INSTANCE.invoke(C17042R.string.futures_detail_stats_size_na, new Object[0]);
            }
        }
        StringResource stringResource3 = stringResourceInvoke;
        if (askSize != null) {
            stringResourceInvoke2 = StringResource.INSTANCE.invoke(C17042R.string.futures_detail_stats_size, Integer.valueOf(askSize.intValue()));
            if (stringResourceInvoke2 == null) {
                stringResourceInvoke2 = StringResource.INSTANCE.invoke(C17042R.string.futures_detail_stats_size_na, new Object[0]);
            }
        }
        StringResource stringResource4 = stringResourceInvoke2;
        if (stringResourceInvoke6 == null) {
            stringResourceInvoke6 = StringResource.INSTANCE.invoke(C11048R.string.general_label_n_a_short, new Object[0]);
        }
        StringResource stringResource5 = stringResourceInvoke6;
        if (stringResourceInvoke7 == null) {
            stringResourceInvoke7 = StringResource.INSTANCE.invoke(C11048R.string.general_label_n_a_short, new Object[0]);
        }
        StringResource stringResource6 = stringResourceInvoke7;
        if (stringResourceInvoke8 == null) {
            stringResourceInvoke8 = StringResource.INSTANCE.invoke(C11048R.string.general_label_n_a_short, new Object[0]);
        }
        StringResource stringResource7 = stringResourceInvoke8;
        if (stringResourceInvoke3 == null) {
            stringResourceInvoke3 = StringResource.INSTANCE.invoke(C11048R.string.general_label_n_a_short, new Object[0]);
        }
        return new FuturesDetailViewState.StatsData(stringResource, stringResource2, stringResource3, stringResource4, stringResource5, stringResource6, stringResource7, stringResourceInvoke3, (bidSize != null ? bidSize.intValue() : 0) / fMax, (askSize != null ? askSize.intValue() : 0) / fMax);
    }

    public final FuturesDetailViewState.PositionData getPositionData() {
        StringResource stringResourceInvoke;
        StringResource stringResourceInvoke2;
        StringResource stringResourceInvoke3;
        StringResource stringResourceInvoke4;
        FuturesOrderStore.GetOrdersOverviewResult getOrdersOverviewResult;
        FuturesCostBasis futuresCostBasis = this.costBasis;
        if (futuresCostBasis == null) {
            return null;
        }
        boolean zIsZero = BigDecimals7.isZero(futuresCostBasis.getSignedQuantity());
        if (zIsZero && ((getOrdersOverviewResult = this.ordersOverview) == null || !getOrdersOverviewResult.getUserHasTradedToday())) {
            return null;
        }
        FuturesOrderStore.GetOrdersOverviewResult getOrdersOverviewResult2 = this.ordersOverview;
        Integer numValueOf = getOrdersOverviewResult2 != null ? Integer.valueOf(getOrdersOverviewResult2.getPendingOrderCount()) : null;
        boolean z = numValueOf != null && numValueOf.intValue() == 0;
        if (numValueOf == null) {
            stringResourceInvoke = StringResource.INSTANCE.invoke(C17042R.string.futures_detail_loading, new Object[0]);
        } else {
            stringResourceInvoke = StringResource.INSTANCE.invoke(Formats.getIntegerFormat().format(numValueOf));
        }
        StringResource stringResource = stringResourceInvoke;
        FuturesContract futuresContract = this.selectedContract;
        BigDecimal multiplier = futuresContract != null ? futuresContract.getMultiplier() : null;
        BigDecimal openPnlCostBasis = futuresCostBasis.getOpenPnlCostBasis();
        FuturesQuote futuresQuote = this.quote;
        BigDecimal bigDecimalComputePnl = FuturesPnLHelper.computePnl(multiplier, openPnlCostBasis, futuresQuote != null ? futuresQuote.getLastTradePrice() : null, futuresCostBasis.getSignedQuantity());
        FuturesContract futuresContract2 = this.selectedContract;
        BigDecimal multiplier2 = futuresContract2 != null ? futuresContract2.getMultiplier() : null;
        BigDecimal dayPnlCostBasis = futuresCostBasis.getDayPnlCostBasis();
        FuturesQuote futuresQuote2 = this.quote;
        BigDecimal bigDecimalComputePnl2 = FuturesPnLHelper.computePnl(multiplier2, dayPnlCostBasis, futuresQuote2 != null ? futuresQuote2.getLastTradePrice() : null, futuresCostBasis.getSignedQuantity());
        if (zIsZero) {
            stringResourceInvoke2 = StringResource.INSTANCE.invoke(C17042R.string.futures_detail_positions_empty_label, new Object[0]);
        } else {
            StringResource.Companion companion = StringResource.INSTANCE;
            int i = C17042R.string.futures_detail_positions_quantity_and_price;
            String str = Formats.getIntegerDeltaFormat().format(futuresCostBasis.getSignedQuantity());
            FuturesProduct futuresProduct = this.futuresProduct;
            BigDecimal avgTradePrice = futuresCostBasis.getAvgTradePrice();
            FuturesProduct futuresProduct2 = this.futuresProduct;
            stringResourceInvoke2 = companion.invoke(i, str, FuturesProduct5.format(futuresProduct, avgTradePrice, Integer.valueOf(futuresProduct2 != null ? futuresProduct2.getNumDecimalsForFormat() : 2)));
        }
        StringResource stringResource2 = stringResourceInvoke2;
        if (bigDecimalComputePnl == null || (stringResourceInvoke3 = StringResource.INSTANCE.invoke(Formats.getCurrencyDeltaFormat().format(bigDecimalComputePnl))) == null) {
            stringResourceInvoke3 = StringResource.INSTANCE.invoke(C17042R.string.futures_detail_loading, new Object[0]);
        }
        StringResource stringResource3 = stringResourceInvoke3;
        if (bigDecimalComputePnl2 == null || (stringResourceInvoke4 = StringResource.INSTANCE.invoke(Formats.getCurrencyDeltaFormat().format(bigDecimalComputePnl2))) == null) {
            stringResourceInvoke4 = StringResource.INSTANCE.invoke(C17042R.string.futures_detail_loading, new Object[0]);
        }
        return new FuturesDetailViewState.PositionData(stringResource2, stringResource, stringResource3, stringResourceInvoke4, (zIsZero && z) ? null : new FuturesDetailViewState.PositionData.FlattenButtonData(this.isFlattenCallInProgress, this.isInTradingSession));
    }

    public final FuturesDetailViewState.ContractSpecsData getContractSpecsData() {
        FuturesContract futuresContract = this.selectedContract;
        FuturesProduct futuresProduct = this.futuresProduct;
        FuturesTradingHours.Session session = this.nextOpenTradingSession;
        FuturesFundamentals futuresFundamentals = this.fundamentals;
        return new FuturesDetailViewState.ContractSpecsData(futuresContract, futuresProduct, session, futuresFundamentals != null ? futuresFundamentals.getPreviousClosePrice() : null, this.marginRequirement, getMarginRequired());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final FuturesDetailViewState.TopBarData getTopBarData() {
        boolean z;
        StringResource stringResourceInvoke;
        StringResource stringResourceInvoke2;
        if (!Intrinsics.areEqual(this.ftuxProgressState, FtuxProgressState.FtuxEducationDone.INSTANCE)) {
            return FuturesDetailViewState.TopBarData.FtuxTopBarData.INSTANCE;
        }
        FuturesContract futuresContract = this.selectedContract;
        FuturesContract futuresContract2 = this.activeFuturesContract;
        if (futuresContract != null) {
            z = Intrinsics.areEqual(futuresContract.getId(), futuresContract2 != null ? futuresContract2.getId() : null);
        }
        String displaySymbol = futuresContract != null ? futuresContract.getDisplaySymbol() : null;
        FuturesQuote futuresQuote = this.quote;
        String nullable$default = FuturesProduct5.formatNullable$default(this.futuresProduct, futuresQuote != null ? futuresQuote.getLastTradePrice() : null, null, 2, null);
        if (nullable$default == null || (stringResourceInvoke = StringResource.INSTANCE.invoke(nullable$default)) == null) {
            stringResourceInvoke = StringResource.INSTANCE.invoke(C11048R.string.general_label_n_a_short, new Object[0]);
        }
        StringResource stringResource = stringResourceInvoke;
        if (displaySymbol == null || (stringResourceInvoke2 = StringResource.INSTANCE.invoke(displaySymbol)) == null) {
            stringResourceInvoke2 = StringResource.INSTANCE.invoke(C11048R.string.general_label_n_a_short, new Object[0]);
        }
        StringResource stringResource2 = stringResourceInvoke2;
        FuturesContract futuresContract3 = z ? this.activeFuturesContract : null;
        List<UUID> list = this.contractIdsInUserLists;
        FuturesProduct futuresProduct = this.futuresProduct;
        return new FuturesDetailViewState.TopBarData.RegularTopBarData(stringResource, stringResource2, futuresContract3, CollectionsKt.contains(list, futuresProduct != null ? futuresProduct.getActiveFuturesContractId() : null), this.selectedContractId);
    }

    public final boolean isLadderKillswitchOnForUser() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.ladderKillswitchVariant.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        if (i == 3) {
            return this.futuresAccount == null;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final FuturesDetailViewState.TradeBarData.TradeBarOverviewContent getTradeBarOverviewContent() {
        MiBFuturesState miBFuturesState = this.mibFuturesState;
        Account futuresAllowedRhsAccount = miBFuturesState != null ? miBFuturesState.getFuturesAllowedRhsAccount() : null;
        if (!this.userIsMiB) {
            return new FuturesDetailViewState.TradeBarData.TradeBarOverviewContent.MarginRequired(getMarginRequired());
        }
        if (futuresAllowedRhsAccount == null) {
            throw new IllegalArgumentException("RHS account should not be null when user is MiB");
        }
        return new FuturesDetailViewState.TradeBarData.TradeBarOverviewContent.RhsAccountLabel(AccountDisplayNames.getDisplayName(futuresAllowedRhsAccount).getWithInvesting().getTitle(), AccountDisplayIcons.getDefaultIconAsset(futuresAllowedRhsAccount.getBrokerageAccountType()));
    }

    public final FuturesDetailViewState.TradeBarData getTradeBarData() {
        FuturesContractTradability tradability;
        boolean z;
        BigDecimal signedQuantity;
        BigDecimal signedQuantity2;
        boolean zIsLadderKillswitchOnForUser = isLadderKillswitchOnForUser();
        FuturesAccount futuresAccount = this.futuresAccount;
        if (futuresAccount != null && futuresAccount.getPcoRestricted()) {
            tradability = FuturesContractTradability.PCO;
        } else {
            FuturesContract futuresContract = this.selectedContract;
            tradability = futuresContract != null ? futuresContract.getTradability() : null;
        }
        FuturesContractTradability futuresContractTradability = tradability;
        int i = futuresContractTradability == null ? -1 : WhenMappings.$EnumSwitchMapping$1[futuresContractTradability.ordinal()];
        boolean z2 = false;
        if (i == -1 || i == 1) {
            return new FuturesDetailViewState.TradeBarData(this.futuresAccount == null, true, true, !zIsLadderKillswitchOnForUser, getTradeBarOverviewContent(), this.showLadderButtonTooltip, futuresContractTradability);
        }
        if (i == 2) {
            return new FuturesDetailViewState.TradeBarData(this.futuresAccount == null, false, false, false, getTradeBarOverviewContent(), this.showLadderButtonTooltip, futuresContractTradability);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        FuturesCostBasis futuresCostBasis = this.costBasis;
        boolean z3 = (futuresCostBasis == null || (signedQuantity2 = futuresCostBasis.getSignedQuantity()) == null || BigDecimals7.isNegative(signedQuantity2)) ? false : true;
        boolean z4 = !z3;
        FuturesCostBasis futuresCostBasis2 = this.costBasis;
        boolean z5 = (futuresCostBasis2 == null || (signedQuantity = futuresCostBasis2.getSignedQuantity()) == null || BigDecimals7.isPositive(signedQuantity)) ? false : true;
        boolean z6 = !z5;
        boolean z7 = z5;
        if (this.futuresAccount == null) {
            z = false;
            z2 = true;
        } else {
            z = false;
        }
        return new FuturesDetailViewState.TradeBarData(z2, z4, z6, (zIsLadderKillswitchOnForUser || (z3 && z7)) ? z : true, getTradeBarOverviewContent(), this.showLadderButtonTooltip, futuresContractTradability);
    }

    public final FuturesDetailViewState.LoggingData getLoggingData() {
        Money marginRequirementAsMoney;
        FuturesContractTradability tradability;
        BigDecimal signedQuantity;
        FuturesCostBasis futuresCostBasis = this.costBasis;
        int intRounded = (futuresCostBasis == null || (signedQuantity = futuresCostBasis.getSignedQuantity()) == null) ? 0 : BigDecimals7.toIntRounded(signedQuantity);
        FuturesOrderStore.GetOrdersOverviewResult getOrdersOverviewResult = this.ordersOverview;
        int pendingOrderCount = getOrdersOverviewResult != null ? getOrdersOverviewResult.getPendingOrderCount() : 0;
        FuturesMarginRequirement futuresMarginRequirement = this.marginRequirement;
        if (futuresMarginRequirement != null) {
            marginRequirementAsMoney = futuresMarginRequirement.getMarginRequirementAsMoney();
            tradability = null;
        } else {
            marginRequirementAsMoney = null;
            tradability = null;
        }
        UUID uuid = this.selectedContractId;
        FuturesContract futuresContract = this.selectedContract;
        if (futuresContract != null) {
            tradability = futuresContract.getTradability();
        }
        return new FuturesDetailViewState.LoggingData(intRounded, pendingOrderCount, marginRequirementAsMoney, uuid, tradability);
    }

    private final AccountsHistoryContract.Key buildHistoryShowMoreFooterKey(UUID selectedContractId) {
        return new AccountsHistoryContract.Key(AccountsHistoryAccountTypeFilter.RHS, AccountsHistoryTransactionTypeFilter.FUTURES, new AccountsHistoryContract.InstrumentFilter(selectedContractId, AccountsHistoryContract.InstrumentFilterType.FUTURES), null, true, null, 40, null);
    }

    public final FuturesDetailViewState.HistorySectionData buildSettledOrderHistorySectionData() {
        if (FtuxProgressState2.isInProgress(this.ftuxProgressState) || this.futuresAccount == null || this.selectedContractId == null) {
            return null;
        }
        return new FuturesDetailViewState.HistorySectionData(new HistoryPreviewListParams(new HistoryStaticFilter(new HistoryStaticFilter.InstrumentFilter(this.selectedContractId, HistoryStaticFilter.InstrumentFilterType.FUTURES), null, null, this.futuresAccount.getId(), null, null, null, null, false, extensions2.persistentSetOf(new HistoryStaticFilter.RhsAccountContext(this.futuresAccount.getRhsAccountNumber(), BrokerageAccountType.INDIVIDUAL)), null, 1526, null), HistoryEvent.State.SETTLED, extensions2.persistentSetOf(HistoryTransactionType.FUTURES_ORDER, HistoryTransactionType.FUTURES_EXECUTION), 4, true), buildHistoryShowMoreFooterKey(this.selectedContractId));
    }

    public final FuturesDetailViewState.HistorySectionData buildPendingOrderHistorySectionData() {
        if (FtuxProgressState2.isInProgress(this.ftuxProgressState) || this.futuresAccount == null || this.selectedContractId == null) {
            return null;
        }
        ImmutableSet3 immutableSet3PersistentSetOf = extensions2.persistentSetOf(new HistoryStaticFilter.RhsAccountContext(this.futuresAccount.getRhsAccountNumber(), BrokerageAccountType.INDIVIDUAL));
        return new FuturesDetailViewState.HistorySectionData(new HistoryPreviewListParams(new HistoryStaticFilter(new HistoryStaticFilter.InstrumentFilter(this.selectedContractId, HistoryStaticFilter.InstrumentFilterType.FUTURES), null, null, this.futuresAccount.getId(), null, null, null, null, false, immutableSet3PersistentSetOf, null, 1526, null), HistoryEvent.State.PENDING, extensions2.persistentSetOf(HistoryTransactionType.FUTURES_ORDER), 4, true), buildHistoryShowMoreFooterKey(this.selectedContractId));
    }

    /* compiled from: FuturesDetailDataState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\b*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailDataState$Companion;", "", "<init>", "()V", "NUM_DECIMAL_FOR_AVERAGE_PRICE", "", "MAX_NUM_ROWS_PER_HISTORY_SECTION", "copyForNewContractId", "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailDataState;", "selectedContractId", "Ljava/util/UUID;", "isViewingProductOnly", "", "feature-futures-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final FuturesDetailDataState copyForNewContractId(FuturesDetailDataState futuresDetailDataState, UUID selectedContractId, boolean z) {
            Intrinsics.checkNotNullParameter(futuresDetailDataState, "<this>");
            Intrinsics.checkNotNullParameter(selectedContractId, "selectedContractId");
            return FuturesDetailDataState.copy$default(futuresDetailDataState, selectedContractId, null, null, null, null, null, null, null, false, null, null, null, null, false, null, false, false, null, false, z, null, 1569550, null);
        }
    }
}
