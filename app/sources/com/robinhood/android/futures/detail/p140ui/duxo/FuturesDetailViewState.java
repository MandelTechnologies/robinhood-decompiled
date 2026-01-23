package com.robinhood.android.futures.detail.p140ui.duxo;

import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.history.p082ui.lazyList.HistoryPreviewListParams;
import com.robinhood.android.futures.detail.C17042R;
import com.robinhood.android.futures.detail.p140ui.chart.FuturesDetailChartDuxo4;
import com.robinhood.android.futures.detail.p140ui.duxo.FtuxProgressState;
import com.robinhood.android.futures.detail.p140ui.duxo.FuturesDetailViewState2;
import com.robinhood.android.lib.utils.BigDecimals2;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.models.futures.api.arsenal.FuturesContractTradability;
import com.robinhood.android.models.futures.api.arsenal.FuturesProductDelivery;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesContract;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesMarginRequirement;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesProduct;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesTradingHours;
import com.robinhood.android.sdui.chartgroup.SduiChartZoomTransformer;
import com.robinhood.models.util.Money;
import com.robinhood.referral.SingularAttributionManager;
import com.robinhood.shared.history.contracts.account.AccountsHistoryContract;
import com.robinhood.utils.datetime.Instants;
import com.robinhood.utils.datetime.format.LocalDateFormatter;
import com.robinhood.utils.datetime.format.LocalTimeFormatter;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Iterator;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import p479j$.time.LocalDate;

/* compiled from: FuturesDetailViewState.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b.\b\u0087\b\u0018\u00002\u00020\u0001:\tghijklmnoB©\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\n\u0012\u0006\u0010\u0013\u001a\u00020\n\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\f\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u001d\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010T\u001a\u00020\nHÆ\u0003J\u0011\u0010U\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003J\t\u0010V\u001a\u00020\u000fHÆ\u0003J\t\u0010W\u001a\u00020\u000fHÆ\u0003J\t\u0010X\u001a\u00020\u000fHÆ\u0003J\t\u0010Y\u001a\u00020\nHÆ\u0003J\t\u0010Z\u001a\u00020\nHÆ\u0003J\t\u0010[\u001a\u00020\u0015HÆ\u0003J\u000f\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00170\fHÆ\u0003J\t\u0010]\u001a\u00020\u0019HÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u001bHÆ\u0003J\u0010\u0010_\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u00109J\t\u0010`\u001a\u00020\u001eHÆ\u0003JÒ\u0001\u0010a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\n2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\f2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u001d\u001a\u00020\u001eHÆ\u0001¢\u0006\u0002\u0010bJ\u0013\u0010c\u001a\u00020\u000f2\b\u0010d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010e\u001a\u00020BHÖ\u0001J\t\u0010f\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\"R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\u0010\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b.\u0010-R\u0011\u0010\u0011\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010-R\u0011\u0010\u0012\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b/\u0010)R\u0011\u0010\u0013\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b0\u0010)R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\f¢\u0006\b\n\u0000\u001a\u0004\b3\u0010+R\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0015\u0010\u001c\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010:\u001a\u0004\b8\u00109R\u0011\u0010\u001d\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0011\u0010=\u001a\u00020>8F¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0011\u0010A\u001a\u00020B8F¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0011\u0010E\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\bE\u0010-R\u0011\u0010F\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\bF\u0010-R\u0011\u0010G\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\bG\u0010-R\u0011\u0010H\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\bI\u0010-R\u0011\u0010J\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\bK\u0010-R\u0011\u0010L\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\bM\u0010-R\u0011\u0010N\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\bN\u0010-R\u0011\u0010O\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\bO\u0010-¨\u0006p"}, m3636d2 = {"Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState;", "", "selectedContractId", "Ljava/util/UUID;", "selectedContract", "Lcom/robinhood/android/models/futures/arsenal/db/FuturesContract;", "rhsAccountNumber", "", "futuresAccountId", "contractSelectorText", "Lcom/robinhood/utils/resource/StringResource;", "relatedContracts", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState$RelatedContract;", "contractSelectorOpen", "", "showSeparateContractAndProductItemsInContractSelector", "isViewingProductOnly", "productName", "productSymbol", "topBarData", "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState$TopBarData;", "items", "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewData;", "tradeBarData", "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState$TradeBarData;", "ftuxProgressState", "Lcom/robinhood/android/futures/detail/ui/duxo/FtuxProgressState;", "userIsMiB", "loggingData", "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState$LoggingData;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/android/models/futures/arsenal/db/FuturesContract;Ljava/lang/String;Ljava/util/UUID;Lcom/robinhood/utils/resource/StringResource;Lkotlinx/collections/immutable/ImmutableList;ZZZLcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState$TopBarData;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState$TradeBarData;Lcom/robinhood/android/futures/detail/ui/duxo/FtuxProgressState;Ljava/lang/Boolean;Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState$LoggingData;)V", "getSelectedContractId", "()Ljava/util/UUID;", "getSelectedContract", "()Lcom/robinhood/android/models/futures/arsenal/db/FuturesContract;", "getRhsAccountNumber", "()Ljava/lang/String;", "getFuturesAccountId", "getContractSelectorText", "()Lcom/robinhood/utils/resource/StringResource;", "getRelatedContracts", "()Lkotlinx/collections/immutable/ImmutableList;", "getContractSelectorOpen", "()Z", "getShowSeparateContractAndProductItemsInContractSelector", "getProductName", "getProductSymbol", "getTopBarData", "()Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState$TopBarData;", "getItems", "getTradeBarData", "()Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState$TradeBarData;", "getFtuxProgressState", "()Lcom/robinhood/android/futures/detail/ui/duxo/FtuxProgressState;", "getUserIsMiB", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLoggingData", "()Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState$LoggingData;", "chartViewMode", "Lcom/robinhood/android/futures/detail/ui/chart/ChartViewMode;", "getChartViewMode", "()Lcom/robinhood/android/futures/detail/ui/chart/ChartViewMode;", "contractSpecIndex", "", "getContractSpecIndex", "()I", "isFtuxInProgress", "isFtuxChartEducationInProgress", "isFtuxContractSpecsEducationInProgress", "showScrimOnChart", "getShowScrimOnChart", "showScrimOnContractSpec", "getShowScrimOnContractSpec", "showScrimOnLeverage", "getShowScrimOnLeverage", "isTradeBarVisible", "isTradeBarInteractive", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "copy", "(Ljava/util/UUID;Lcom/robinhood/android/models/futures/arsenal/db/FuturesContract;Ljava/lang/String;Ljava/util/UUID;Lcom/robinhood/utils/resource/StringResource;Lkotlinx/collections/immutable/ImmutableList;ZZZLcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState$TopBarData;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState$TradeBarData;Lcom/robinhood/android/futures/detail/ui/duxo/FtuxProgressState;Ljava/lang/Boolean;Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState$LoggingData;)Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState;", "equals", "other", "hashCode", "toString", "TopBarData", "RelatedContract", "PositionData", "ContractSpecsData", "HistorySectionData", "AboutData", "StatsData", "TradeBarData", "LoggingData", "feature-futures-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final /* data */ class FuturesDetailViewState {
    public static final int $stable = 8;
    private final boolean contractSelectorOpen;
    private final StringResource contractSelectorText;
    private final FtuxProgressState ftuxProgressState;
    private final UUID futuresAccountId;
    private final boolean isViewingProductOnly;
    private final ImmutableList<FuturesDetailViewState2> items;
    private final LoggingData loggingData;
    private final StringResource productName;
    private final StringResource productSymbol;
    private final ImmutableList<RelatedContract> relatedContracts;
    private final String rhsAccountNumber;
    private final FuturesContract selectedContract;
    private final UUID selectedContractId;
    private final boolean showSeparateContractAndProductItemsInContractSelector;
    private final TopBarData topBarData;
    private final TradeBarData tradeBarData;
    private final Boolean userIsMiB;

    public static /* synthetic */ FuturesDetailViewState copy$default(FuturesDetailViewState futuresDetailViewState, UUID uuid, FuturesContract futuresContract, String str, UUID uuid2, StringResource stringResource, ImmutableList immutableList, boolean z, boolean z2, boolean z3, StringResource stringResource2, StringResource stringResource3, TopBarData topBarData, ImmutableList immutableList2, TradeBarData tradeBarData, FtuxProgressState ftuxProgressState, Boolean bool, LoggingData loggingData, int i, Object obj) {
        LoggingData loggingData2;
        Boolean bool2;
        UUID uuid3;
        FuturesDetailViewState futuresDetailViewState2;
        FtuxProgressState ftuxProgressState2;
        FuturesContract futuresContract2;
        String str2;
        UUID uuid4;
        StringResource stringResource4;
        ImmutableList immutableList3;
        boolean z4;
        boolean z5;
        boolean z6;
        StringResource stringResource5;
        StringResource stringResource6;
        TopBarData topBarData2;
        ImmutableList immutableList4;
        TradeBarData tradeBarData2;
        UUID uuid5 = (i & 1) != 0 ? futuresDetailViewState.selectedContractId : uuid;
        FuturesContract futuresContract3 = (i & 2) != 0 ? futuresDetailViewState.selectedContract : futuresContract;
        String str3 = (i & 4) != 0 ? futuresDetailViewState.rhsAccountNumber : str;
        UUID uuid6 = (i & 8) != 0 ? futuresDetailViewState.futuresAccountId : uuid2;
        StringResource stringResource7 = (i & 16) != 0 ? futuresDetailViewState.contractSelectorText : stringResource;
        ImmutableList immutableList5 = (i & 32) != 0 ? futuresDetailViewState.relatedContracts : immutableList;
        boolean z7 = (i & 64) != 0 ? futuresDetailViewState.contractSelectorOpen : z;
        boolean z8 = (i & 128) != 0 ? futuresDetailViewState.showSeparateContractAndProductItemsInContractSelector : z2;
        boolean z9 = (i & 256) != 0 ? futuresDetailViewState.isViewingProductOnly : z3;
        StringResource stringResource8 = (i & 512) != 0 ? futuresDetailViewState.productName : stringResource2;
        StringResource stringResource9 = (i & 1024) != 0 ? futuresDetailViewState.productSymbol : stringResource3;
        TopBarData topBarData3 = (i & 2048) != 0 ? futuresDetailViewState.topBarData : topBarData;
        ImmutableList immutableList6 = (i & 4096) != 0 ? futuresDetailViewState.items : immutableList2;
        TradeBarData tradeBarData3 = (i & 8192) != 0 ? futuresDetailViewState.tradeBarData : tradeBarData;
        UUID uuid7 = uuid5;
        FtuxProgressState ftuxProgressState3 = (i & 16384) != 0 ? futuresDetailViewState.ftuxProgressState : ftuxProgressState;
        Boolean bool3 = (i & 32768) != 0 ? futuresDetailViewState.userIsMiB : bool;
        if ((i & 65536) != 0) {
            bool2 = bool3;
            loggingData2 = futuresDetailViewState.loggingData;
            ftuxProgressState2 = ftuxProgressState3;
            futuresContract2 = futuresContract3;
            str2 = str3;
            uuid4 = uuid6;
            stringResource4 = stringResource7;
            immutableList3 = immutableList5;
            z4 = z7;
            z5 = z8;
            z6 = z9;
            stringResource5 = stringResource8;
            stringResource6 = stringResource9;
            topBarData2 = topBarData3;
            immutableList4 = immutableList6;
            tradeBarData2 = tradeBarData3;
            uuid3 = uuid7;
            futuresDetailViewState2 = futuresDetailViewState;
        } else {
            loggingData2 = loggingData;
            bool2 = bool3;
            uuid3 = uuid7;
            futuresDetailViewState2 = futuresDetailViewState;
            ftuxProgressState2 = ftuxProgressState3;
            futuresContract2 = futuresContract3;
            str2 = str3;
            uuid4 = uuid6;
            stringResource4 = stringResource7;
            immutableList3 = immutableList5;
            z4 = z7;
            z5 = z8;
            z6 = z9;
            stringResource5 = stringResource8;
            stringResource6 = stringResource9;
            topBarData2 = topBarData3;
            immutableList4 = immutableList6;
            tradeBarData2 = tradeBarData3;
        }
        return futuresDetailViewState2.copy(uuid3, futuresContract2, str2, uuid4, stringResource4, immutableList3, z4, z5, z6, stringResource5, stringResource6, topBarData2, immutableList4, tradeBarData2, ftuxProgressState2, bool2, loggingData2);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getSelectedContractId() {
        return this.selectedContractId;
    }

    /* renamed from: component10, reason: from getter */
    public final StringResource getProductName() {
        return this.productName;
    }

    /* renamed from: component11, reason: from getter */
    public final StringResource getProductSymbol() {
        return this.productSymbol;
    }

    /* renamed from: component12, reason: from getter */
    public final TopBarData getTopBarData() {
        return this.topBarData;
    }

    public final ImmutableList<FuturesDetailViewState2> component13() {
        return this.items;
    }

    /* renamed from: component14, reason: from getter */
    public final TradeBarData getTradeBarData() {
        return this.tradeBarData;
    }

    /* renamed from: component15, reason: from getter */
    public final FtuxProgressState getFtuxProgressState() {
        return this.ftuxProgressState;
    }

    /* renamed from: component16, reason: from getter */
    public final Boolean getUserIsMiB() {
        return this.userIsMiB;
    }

    /* renamed from: component17, reason: from getter */
    public final LoggingData getLoggingData() {
        return this.loggingData;
    }

    /* renamed from: component2, reason: from getter */
    public final FuturesContract getSelectedContract() {
        return this.selectedContract;
    }

    /* renamed from: component3, reason: from getter */
    public final String getRhsAccountNumber() {
        return this.rhsAccountNumber;
    }

    /* renamed from: component4, reason: from getter */
    public final UUID getFuturesAccountId() {
        return this.futuresAccountId;
    }

    /* renamed from: component5, reason: from getter */
    public final StringResource getContractSelectorText() {
        return this.contractSelectorText;
    }

    public final ImmutableList<RelatedContract> component6() {
        return this.relatedContracts;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getContractSelectorOpen() {
        return this.contractSelectorOpen;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getShowSeparateContractAndProductItemsInContractSelector() {
        return this.showSeparateContractAndProductItemsInContractSelector;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsViewingProductOnly() {
        return this.isViewingProductOnly;
    }

    public final FuturesDetailViewState copy(UUID selectedContractId, FuturesContract selectedContract, String rhsAccountNumber, UUID futuresAccountId, StringResource contractSelectorText, ImmutableList<RelatedContract> relatedContracts, boolean contractSelectorOpen, boolean showSeparateContractAndProductItemsInContractSelector, boolean isViewingProductOnly, StringResource productName, StringResource productSymbol, TopBarData topBarData, ImmutableList<? extends FuturesDetailViewState2> items, TradeBarData tradeBarData, FtuxProgressState ftuxProgressState, Boolean userIsMiB, LoggingData loggingData) {
        Intrinsics.checkNotNullParameter(contractSelectorText, "contractSelectorText");
        Intrinsics.checkNotNullParameter(productName, "productName");
        Intrinsics.checkNotNullParameter(productSymbol, "productSymbol");
        Intrinsics.checkNotNullParameter(topBarData, "topBarData");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(tradeBarData, "tradeBarData");
        Intrinsics.checkNotNullParameter(loggingData, "loggingData");
        return new FuturesDetailViewState(selectedContractId, selectedContract, rhsAccountNumber, futuresAccountId, contractSelectorText, relatedContracts, contractSelectorOpen, showSeparateContractAndProductItemsInContractSelector, isViewingProductOnly, productName, productSymbol, topBarData, items, tradeBarData, ftuxProgressState, userIsMiB, loggingData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FuturesDetailViewState)) {
            return false;
        }
        FuturesDetailViewState futuresDetailViewState = (FuturesDetailViewState) other;
        return Intrinsics.areEqual(this.selectedContractId, futuresDetailViewState.selectedContractId) && Intrinsics.areEqual(this.selectedContract, futuresDetailViewState.selectedContract) && Intrinsics.areEqual(this.rhsAccountNumber, futuresDetailViewState.rhsAccountNumber) && Intrinsics.areEqual(this.futuresAccountId, futuresDetailViewState.futuresAccountId) && Intrinsics.areEqual(this.contractSelectorText, futuresDetailViewState.contractSelectorText) && Intrinsics.areEqual(this.relatedContracts, futuresDetailViewState.relatedContracts) && this.contractSelectorOpen == futuresDetailViewState.contractSelectorOpen && this.showSeparateContractAndProductItemsInContractSelector == futuresDetailViewState.showSeparateContractAndProductItemsInContractSelector && this.isViewingProductOnly == futuresDetailViewState.isViewingProductOnly && Intrinsics.areEqual(this.productName, futuresDetailViewState.productName) && Intrinsics.areEqual(this.productSymbol, futuresDetailViewState.productSymbol) && Intrinsics.areEqual(this.topBarData, futuresDetailViewState.topBarData) && Intrinsics.areEqual(this.items, futuresDetailViewState.items) && Intrinsics.areEqual(this.tradeBarData, futuresDetailViewState.tradeBarData) && Intrinsics.areEqual(this.ftuxProgressState, futuresDetailViewState.ftuxProgressState) && Intrinsics.areEqual(this.userIsMiB, futuresDetailViewState.userIsMiB) && Intrinsics.areEqual(this.loggingData, futuresDetailViewState.loggingData);
    }

    public int hashCode() {
        UUID uuid = this.selectedContractId;
        int iHashCode = (uuid == null ? 0 : uuid.hashCode()) * 31;
        FuturesContract futuresContract = this.selectedContract;
        int iHashCode2 = (iHashCode + (futuresContract == null ? 0 : futuresContract.hashCode())) * 31;
        String str = this.rhsAccountNumber;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        UUID uuid2 = this.futuresAccountId;
        int iHashCode4 = (((iHashCode3 + (uuid2 == null ? 0 : uuid2.hashCode())) * 31) + this.contractSelectorText.hashCode()) * 31;
        ImmutableList<RelatedContract> immutableList = this.relatedContracts;
        int iHashCode5 = (((((((((((((((((iHashCode4 + (immutableList == null ? 0 : immutableList.hashCode())) * 31) + Boolean.hashCode(this.contractSelectorOpen)) * 31) + Boolean.hashCode(this.showSeparateContractAndProductItemsInContractSelector)) * 31) + Boolean.hashCode(this.isViewingProductOnly)) * 31) + this.productName.hashCode()) * 31) + this.productSymbol.hashCode()) * 31) + this.topBarData.hashCode()) * 31) + this.items.hashCode()) * 31) + this.tradeBarData.hashCode()) * 31;
        FtuxProgressState ftuxProgressState = this.ftuxProgressState;
        int iHashCode6 = (iHashCode5 + (ftuxProgressState == null ? 0 : ftuxProgressState.hashCode())) * 31;
        Boolean bool = this.userIsMiB;
        return ((iHashCode6 + (bool != null ? bool.hashCode() : 0)) * 31) + this.loggingData.hashCode();
    }

    public String toString() {
        return "FuturesDetailViewState(selectedContractId=" + this.selectedContractId + ", selectedContract=" + this.selectedContract + ", rhsAccountNumber=" + this.rhsAccountNumber + ", futuresAccountId=" + this.futuresAccountId + ", contractSelectorText=" + this.contractSelectorText + ", relatedContracts=" + this.relatedContracts + ", contractSelectorOpen=" + this.contractSelectorOpen + ", showSeparateContractAndProductItemsInContractSelector=" + this.showSeparateContractAndProductItemsInContractSelector + ", isViewingProductOnly=" + this.isViewingProductOnly + ", productName=" + this.productName + ", productSymbol=" + this.productSymbol + ", topBarData=" + this.topBarData + ", items=" + this.items + ", tradeBarData=" + this.tradeBarData + ", ftuxProgressState=" + this.ftuxProgressState + ", userIsMiB=" + this.userIsMiB + ", loggingData=" + this.loggingData + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FuturesDetailViewState(UUID uuid, FuturesContract futuresContract, String str, UUID uuid2, StringResource contractSelectorText, ImmutableList<RelatedContract> immutableList, boolean z, boolean z2, boolean z3, StringResource productName, StringResource productSymbol, TopBarData topBarData, ImmutableList<? extends FuturesDetailViewState2> items, TradeBarData tradeBarData, FtuxProgressState ftuxProgressState, Boolean bool, LoggingData loggingData) {
        Intrinsics.checkNotNullParameter(contractSelectorText, "contractSelectorText");
        Intrinsics.checkNotNullParameter(productName, "productName");
        Intrinsics.checkNotNullParameter(productSymbol, "productSymbol");
        Intrinsics.checkNotNullParameter(topBarData, "topBarData");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(tradeBarData, "tradeBarData");
        Intrinsics.checkNotNullParameter(loggingData, "loggingData");
        this.selectedContractId = uuid;
        this.selectedContract = futuresContract;
        this.rhsAccountNumber = str;
        this.futuresAccountId = uuid2;
        this.contractSelectorText = contractSelectorText;
        this.relatedContracts = immutableList;
        this.contractSelectorOpen = z;
        this.showSeparateContractAndProductItemsInContractSelector = z2;
        this.isViewingProductOnly = z3;
        this.productName = productName;
        this.productSymbol = productSymbol;
        this.topBarData = topBarData;
        this.items = items;
        this.tradeBarData = tradeBarData;
        this.ftuxProgressState = ftuxProgressState;
        this.userIsMiB = bool;
        this.loggingData = loggingData;
    }

    public final UUID getSelectedContractId() {
        return this.selectedContractId;
    }

    public final FuturesContract getSelectedContract() {
        return this.selectedContract;
    }

    public final String getRhsAccountNumber() {
        return this.rhsAccountNumber;
    }

    public final UUID getFuturesAccountId() {
        return this.futuresAccountId;
    }

    public final StringResource getContractSelectorText() {
        return this.contractSelectorText;
    }

    public final ImmutableList<RelatedContract> getRelatedContracts() {
        return this.relatedContracts;
    }

    public final boolean getContractSelectorOpen() {
        return this.contractSelectorOpen;
    }

    public final boolean getShowSeparateContractAndProductItemsInContractSelector() {
        return this.showSeparateContractAndProductItemsInContractSelector;
    }

    public final boolean isViewingProductOnly() {
        return this.isViewingProductOnly;
    }

    public final StringResource getProductName() {
        return this.productName;
    }

    public final StringResource getProductSymbol() {
        return this.productSymbol;
    }

    public final TopBarData getTopBarData() {
        return this.topBarData;
    }

    public final ImmutableList<FuturesDetailViewState2> getItems() {
        return this.items;
    }

    public final TradeBarData getTradeBarData() {
        return this.tradeBarData;
    }

    public final FtuxProgressState getFtuxProgressState() {
        return this.ftuxProgressState;
    }

    public final Boolean getUserIsMiB() {
        return this.userIsMiB;
    }

    public final LoggingData getLoggingData() {
        return this.loggingData;
    }

    public final FuturesDetailChartDuxo4 getChartViewMode() {
        if (this.showSeparateContractAndProductItemsInContractSelector) {
            if (this.isViewingProductOnly) {
                return FuturesDetailChartDuxo4.PRODUCT_ONLY;
            }
            return FuturesDetailChartDuxo4.CONTRACT_ONLY;
        }
        return FuturesDetailChartDuxo4.LEGACY;
    }

    public final int getContractSpecIndex() {
        Iterator<FuturesDetailViewState2> it = this.items.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next() instanceof FuturesDetailViewState2.ContractSpec) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* compiled from: FuturesDetailViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState$TopBarData;", "", "<init>", "()V", "FtuxTopBarData", "RegularTopBarData", "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState$TopBarData$FtuxTopBarData;", "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState$TopBarData$RegularTopBarData;", "feature-futures-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class TopBarData {
        public static final int $stable = 0;

        public /* synthetic */ TopBarData(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: FuturesDetailViewState.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState$TopBarData$FtuxTopBarData;", "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState$TopBarData;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-futures-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class FtuxTopBarData extends TopBarData {
            public static final int $stable = 0;
            public static final FtuxTopBarData INSTANCE = new FtuxTopBarData();

            public boolean equals(Object other) {
                return this == other || (other instanceof FtuxTopBarData);
            }

            public int hashCode() {
                return -1556323533;
            }

            public String toString() {
                return "FtuxTopBarData";
            }

            private FtuxTopBarData() {
                super(null);
            }
        }

        private TopBarData() {
        }

        /* compiled from: FuturesDetailViewState.kt */
        @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\nHÆ\u0003J?\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState$TopBarData$RegularTopBarData;", "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState$TopBarData;", "title", "Lcom/robinhood/utils/resource/StringResource;", "subtitle", "contractToAddToLists", "Lcom/robinhood/android/models/futures/arsenal/db/FuturesContract;", "isContractInUserLists", "", "selectedContractId", "Ljava/util/UUID;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/android/models/futures/arsenal/db/FuturesContract;ZLjava/util/UUID;)V", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getSubtitle", "getContractToAddToLists", "()Lcom/robinhood/android/models/futures/arsenal/db/FuturesContract;", "()Z", "getSelectedContractId", "()Ljava/util/UUID;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-futures-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class RegularTopBarData extends TopBarData {
            public static final int $stable = 8;
            private final FuturesContract contractToAddToLists;
            private final boolean isContractInUserLists;
            private final UUID selectedContractId;
            private final StringResource subtitle;
            private final StringResource title;

            public static /* synthetic */ RegularTopBarData copy$default(RegularTopBarData regularTopBarData, StringResource stringResource, StringResource stringResource2, FuturesContract futuresContract, boolean z, UUID uuid, int i, Object obj) {
                if ((i & 1) != 0) {
                    stringResource = regularTopBarData.title;
                }
                if ((i & 2) != 0) {
                    stringResource2 = regularTopBarData.subtitle;
                }
                if ((i & 4) != 0) {
                    futuresContract = regularTopBarData.contractToAddToLists;
                }
                if ((i & 8) != 0) {
                    z = regularTopBarData.isContractInUserLists;
                }
                if ((i & 16) != 0) {
                    uuid = regularTopBarData.selectedContractId;
                }
                UUID uuid2 = uuid;
                FuturesContract futuresContract2 = futuresContract;
                return regularTopBarData.copy(stringResource, stringResource2, futuresContract2, z, uuid2);
            }

            /* renamed from: component1, reason: from getter */
            public final StringResource getTitle() {
                return this.title;
            }

            /* renamed from: component2, reason: from getter */
            public final StringResource getSubtitle() {
                return this.subtitle;
            }

            /* renamed from: component3, reason: from getter */
            public final FuturesContract getContractToAddToLists() {
                return this.contractToAddToLists;
            }

            /* renamed from: component4, reason: from getter */
            public final boolean getIsContractInUserLists() {
                return this.isContractInUserLists;
            }

            /* renamed from: component5, reason: from getter */
            public final UUID getSelectedContractId() {
                return this.selectedContractId;
            }

            public final RegularTopBarData copy(StringResource title, StringResource subtitle, FuturesContract contractToAddToLists, boolean isContractInUserLists, UUID selectedContractId) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                return new RegularTopBarData(title, subtitle, contractToAddToLists, isContractInUserLists, selectedContractId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof RegularTopBarData)) {
                    return false;
                }
                RegularTopBarData regularTopBarData = (RegularTopBarData) other;
                return Intrinsics.areEqual(this.title, regularTopBarData.title) && Intrinsics.areEqual(this.subtitle, regularTopBarData.subtitle) && Intrinsics.areEqual(this.contractToAddToLists, regularTopBarData.contractToAddToLists) && this.isContractInUserLists == regularTopBarData.isContractInUserLists && Intrinsics.areEqual(this.selectedContractId, regularTopBarData.selectedContractId);
            }

            public int hashCode() {
                int iHashCode = ((this.title.hashCode() * 31) + this.subtitle.hashCode()) * 31;
                FuturesContract futuresContract = this.contractToAddToLists;
                int iHashCode2 = (((iHashCode + (futuresContract == null ? 0 : futuresContract.hashCode())) * 31) + Boolean.hashCode(this.isContractInUserLists)) * 31;
                UUID uuid = this.selectedContractId;
                return iHashCode2 + (uuid != null ? uuid.hashCode() : 0);
            }

            public String toString() {
                return "RegularTopBarData(title=" + this.title + ", subtitle=" + this.subtitle + ", contractToAddToLists=" + this.contractToAddToLists + ", isContractInUserLists=" + this.isContractInUserLists + ", selectedContractId=" + this.selectedContractId + ")";
            }

            public final StringResource getTitle() {
                return this.title;
            }

            public final StringResource getSubtitle() {
                return this.subtitle;
            }

            public final FuturesContract getContractToAddToLists() {
                return this.contractToAddToLists;
            }

            public final boolean isContractInUserLists() {
                return this.isContractInUserLists;
            }

            public final UUID getSelectedContractId() {
                return this.selectedContractId;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RegularTopBarData(StringResource title, StringResource subtitle, FuturesContract futuresContract, boolean z, UUID uuid) {
                super(null);
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                this.title = title;
                this.subtitle = subtitle;
                this.contractToAddToLists = futuresContract;
                this.isContractInUserLists = z;
                this.selectedContractId = uuid;
            }
        }
    }

    /* compiled from: FuturesDetailViewState.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0011R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0011¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState$RelatedContract;", "", "id", "Ljava/util/UUID;", "expiration", "", "symbol", "isSelected", "", "isActiveContractForProduct", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;ZZ)V", "getId", "()Ljava/util/UUID;", "getExpiration", "()Ljava/lang/String;", "getSymbol", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "feature-futures-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class RelatedContract {
        public static final int $stable = 8;
        private final String expiration;
        private final UUID id;
        private final boolean isActiveContractForProduct;
        private final boolean isSelected;
        private final String symbol;

        public static /* synthetic */ RelatedContract copy$default(RelatedContract relatedContract, UUID uuid, String str, String str2, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = relatedContract.id;
            }
            if ((i & 2) != 0) {
                str = relatedContract.expiration;
            }
            if ((i & 4) != 0) {
                str2 = relatedContract.symbol;
            }
            if ((i & 8) != 0) {
                z = relatedContract.isSelected;
            }
            if ((i & 16) != 0) {
                z2 = relatedContract.isActiveContractForProduct;
            }
            boolean z3 = z2;
            String str3 = str2;
            return relatedContract.copy(uuid, str, str3, z, z3);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getExpiration() {
            return this.expiration;
        }

        /* renamed from: component3, reason: from getter */
        public final String getSymbol() {
            return this.symbol;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsActiveContractForProduct() {
            return this.isActiveContractForProduct;
        }

        public final RelatedContract copy(UUID id, String expiration, String symbol, boolean isSelected, boolean isActiveContractForProduct) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(expiration, "expiration");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            return new RelatedContract(id, expiration, symbol, isSelected, isActiveContractForProduct);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RelatedContract)) {
                return false;
            }
            RelatedContract relatedContract = (RelatedContract) other;
            return Intrinsics.areEqual(this.id, relatedContract.id) && Intrinsics.areEqual(this.expiration, relatedContract.expiration) && Intrinsics.areEqual(this.symbol, relatedContract.symbol) && this.isSelected == relatedContract.isSelected && this.isActiveContractForProduct == relatedContract.isActiveContractForProduct;
        }

        public int hashCode() {
            return (((((((this.id.hashCode() * 31) + this.expiration.hashCode()) * 31) + this.symbol.hashCode()) * 31) + Boolean.hashCode(this.isSelected)) * 31) + Boolean.hashCode(this.isActiveContractForProduct);
        }

        public String toString() {
            return "RelatedContract(id=" + this.id + ", expiration=" + this.expiration + ", symbol=" + this.symbol + ", isSelected=" + this.isSelected + ", isActiveContractForProduct=" + this.isActiveContractForProduct + ")";
        }

        public RelatedContract(UUID id, String expiration, String symbol, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(expiration, "expiration");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            this.id = id;
            this.expiration = expiration;
            this.symbol = symbol;
            this.isSelected = z;
            this.isActiveContractForProduct = z2;
        }

        public final UUID getId() {
            return this.id;
        }

        public final String getExpiration() {
            return this.expiration;
        }

        public final String getSymbol() {
            return this.symbol;
        }

        public final boolean isSelected() {
            return this.isSelected;
        }

        public final boolean isActiveContractForProduct() {
            return this.isActiveContractForProduct;
        }
    }

    /* compiled from: FuturesDetailViewState.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001fB1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003J=\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState$PositionData;", "", "position", "Lcom/robinhood/utils/resource/StringResource;", "pendingOrders", "openPnl", "dayPnl", "flattenButtonData", "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState$PositionData$FlattenButtonData;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState$PositionData$FlattenButtonData;)V", "getPosition", "()Lcom/robinhood/utils/resource/StringResource;", "getPendingOrders", "getOpenPnl", "getDayPnl", "getFlattenButtonData", "()Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState$PositionData$FlattenButtonData;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "FlattenButtonData", "feature-futures-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PositionData {
        public static final int $stable = StringResource.$stable;
        private final StringResource dayPnl;
        private final FlattenButtonData flattenButtonData;
        private final StringResource openPnl;
        private final StringResource pendingOrders;
        private final StringResource position;

        public static /* synthetic */ PositionData copy$default(PositionData positionData, StringResource stringResource, StringResource stringResource2, StringResource stringResource3, StringResource stringResource4, FlattenButtonData flattenButtonData, int i, Object obj) {
            if ((i & 1) != 0) {
                stringResource = positionData.position;
            }
            if ((i & 2) != 0) {
                stringResource2 = positionData.pendingOrders;
            }
            if ((i & 4) != 0) {
                stringResource3 = positionData.openPnl;
            }
            if ((i & 8) != 0) {
                stringResource4 = positionData.dayPnl;
            }
            if ((i & 16) != 0) {
                flattenButtonData = positionData.flattenButtonData;
            }
            FlattenButtonData flattenButtonData2 = flattenButtonData;
            StringResource stringResource5 = stringResource3;
            return positionData.copy(stringResource, stringResource2, stringResource5, stringResource4, flattenButtonData2);
        }

        /* renamed from: component1, reason: from getter */
        public final StringResource getPosition() {
            return this.position;
        }

        /* renamed from: component2, reason: from getter */
        public final StringResource getPendingOrders() {
            return this.pendingOrders;
        }

        /* renamed from: component3, reason: from getter */
        public final StringResource getOpenPnl() {
            return this.openPnl;
        }

        /* renamed from: component4, reason: from getter */
        public final StringResource getDayPnl() {
            return this.dayPnl;
        }

        /* renamed from: component5, reason: from getter */
        public final FlattenButtonData getFlattenButtonData() {
            return this.flattenButtonData;
        }

        public final PositionData copy(StringResource position, StringResource pendingOrders, StringResource openPnl, StringResource dayPnl, FlattenButtonData flattenButtonData) {
            Intrinsics.checkNotNullParameter(position, "position");
            Intrinsics.checkNotNullParameter(pendingOrders, "pendingOrders");
            Intrinsics.checkNotNullParameter(openPnl, "openPnl");
            Intrinsics.checkNotNullParameter(dayPnl, "dayPnl");
            return new PositionData(position, pendingOrders, openPnl, dayPnl, flattenButtonData);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PositionData)) {
                return false;
            }
            PositionData positionData = (PositionData) other;
            return Intrinsics.areEqual(this.position, positionData.position) && Intrinsics.areEqual(this.pendingOrders, positionData.pendingOrders) && Intrinsics.areEqual(this.openPnl, positionData.openPnl) && Intrinsics.areEqual(this.dayPnl, positionData.dayPnl) && Intrinsics.areEqual(this.flattenButtonData, positionData.flattenButtonData);
        }

        public int hashCode() {
            int iHashCode = ((((((this.position.hashCode() * 31) + this.pendingOrders.hashCode()) * 31) + this.openPnl.hashCode()) * 31) + this.dayPnl.hashCode()) * 31;
            FlattenButtonData flattenButtonData = this.flattenButtonData;
            return iHashCode + (flattenButtonData == null ? 0 : flattenButtonData.hashCode());
        }

        public String toString() {
            return "PositionData(position=" + this.position + ", pendingOrders=" + this.pendingOrders + ", openPnl=" + this.openPnl + ", dayPnl=" + this.dayPnl + ", flattenButtonData=" + this.flattenButtonData + ")";
        }

        public PositionData(StringResource position, StringResource pendingOrders, StringResource openPnl, StringResource dayPnl, FlattenButtonData flattenButtonData) {
            Intrinsics.checkNotNullParameter(position, "position");
            Intrinsics.checkNotNullParameter(pendingOrders, "pendingOrders");
            Intrinsics.checkNotNullParameter(openPnl, "openPnl");
            Intrinsics.checkNotNullParameter(dayPnl, "dayPnl");
            this.position = position;
            this.pendingOrders = pendingOrders;
            this.openPnl = openPnl;
            this.dayPnl = dayPnl;
            this.flattenButtonData = flattenButtonData;
        }

        public final StringResource getPosition() {
            return this.position;
        }

        public final StringResource getPendingOrders() {
            return this.pendingOrders;
        }

        public final StringResource getOpenPnl() {
            return this.openPnl;
        }

        public final StringResource getDayPnl() {
            return this.dayPnl;
        }

        public final FlattenButtonData getFlattenButtonData() {
            return this.flattenButtonData;
        }

        /* compiled from: FuturesDetailViewState.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState$PositionData$FlattenButtonData;", "", "isFlattenInProgress", "", "isEnabled", "<init>", "(ZZ)V", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-futures-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class FlattenButtonData {
            public static final int $stable = 0;
            private final boolean isEnabled;
            private final boolean isFlattenInProgress;

            public static /* synthetic */ FlattenButtonData copy$default(FlattenButtonData flattenButtonData, boolean z, boolean z2, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = flattenButtonData.isFlattenInProgress;
                }
                if ((i & 2) != 0) {
                    z2 = flattenButtonData.isEnabled;
                }
                return flattenButtonData.copy(z, z2);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getIsFlattenInProgress() {
                return this.isFlattenInProgress;
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getIsEnabled() {
                return this.isEnabled;
            }

            public final FlattenButtonData copy(boolean isFlattenInProgress, boolean isEnabled) {
                return new FlattenButtonData(isFlattenInProgress, isEnabled);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof FlattenButtonData)) {
                    return false;
                }
                FlattenButtonData flattenButtonData = (FlattenButtonData) other;
                return this.isFlattenInProgress == flattenButtonData.isFlattenInProgress && this.isEnabled == flattenButtonData.isEnabled;
            }

            public int hashCode() {
                return (Boolean.hashCode(this.isFlattenInProgress) * 31) + Boolean.hashCode(this.isEnabled);
            }

            public String toString() {
                return "FlattenButtonData(isFlattenInProgress=" + this.isFlattenInProgress + ", isEnabled=" + this.isEnabled + ")";
            }

            public FlattenButtonData(boolean z, boolean z2) {
                this.isFlattenInProgress = z;
                this.isEnabled = z2;
            }

            public final boolean isFlattenInProgress() {
                return this.isFlattenInProgress;
            }

            public final boolean isEnabled() {
                return this.isEnabled;
            }
        }
    }

    /* compiled from: FuturesDetailViewState.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÂ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0007HÂ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\tHÂ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u000bHÂ\u0003J\t\u0010)\u001a\u00020\rHÆ\u0003JO\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020/HÖ\u0001J\t\u00100\u001a\u000201HÖ\u0001R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\u0016\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\u0018\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0011R\u0011\u0010\u001a\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0011R\u0011\u0010\u001c\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0011R\u0011\u0010\u001e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0011R\u0011\u0010 \u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b!\u0010\u0011R\u0011\u0010\"\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b#\u0010\u0011¨\u00062"}, m3636d2 = {"Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState$ContractSpecsData;", "", "contract", "Lcom/robinhood/android/models/futures/arsenal/db/FuturesContract;", SingularAttributionManager.PRODUCT_PARAM_KEY, "Lcom/robinhood/android/models/futures/arsenal/db/FuturesProduct;", "nextOpenTradingSession", "Lcom/robinhood/android/models/futures/arsenal/db/FuturesTradingHours$Session;", "previousClosePrice", "Ljava/math/BigDecimal;", "marginRequirement", "Lcom/robinhood/android/models/futures/arsenal/db/FuturesMarginRequirement;", "marginRequired", "Lcom/robinhood/utils/resource/StringResource;", "<init>", "(Lcom/robinhood/android/models/futures/arsenal/db/FuturesContract;Lcom/robinhood/android/models/futures/arsenal/db/FuturesProduct;Lcom/robinhood/android/models/futures/arsenal/db/FuturesTradingHours$Session;Ljava/math/BigDecimal;Lcom/robinhood/android/models/futures/arsenal/db/FuturesMarginRequirement;Lcom/robinhood/utils/resource/StringResource;)V", "getMarginRequired", "()Lcom/robinhood/utils/resource/StringResource;", "delivery", "getDelivery", "deliveryDefinition", "getDeliveryDefinition", "hours", "getHours", "hoursDefinition", "getHoursDefinition", "lastTradeDate", "getLastTradeDate", "multiplier", "getMultiplier", "tickSize", "getTickSize", "tickValue", "getTickValue", "leverage", "getLeverage", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-futures-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final /* data */ class ContractSpecsData {
        public static final int $stable = 8;
        private final FuturesContract contract;
        private final StringResource marginRequired;
        private final FuturesMarginRequirement marginRequirement;
        private final FuturesTradingHours.Session nextOpenTradingSession;
        private final BigDecimal previousClosePrice;
        private final FuturesProduct product;

        /* compiled from: FuturesDetailViewState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[FuturesProductDelivery.values().length];
                try {
                    iArr[FuturesProductDelivery.PHYSICAL.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[FuturesProductDelivery.CASH.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[FuturesProductDelivery.NON_DELIVERABLE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[FuturesProductDelivery.UNKNOWN.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* renamed from: component1, reason: from getter */
        private final FuturesContract getContract() {
            return this.contract;
        }

        /* renamed from: component2, reason: from getter */
        private final FuturesProduct getProduct() {
            return this.product;
        }

        /* renamed from: component3, reason: from getter */
        private final FuturesTradingHours.Session getNextOpenTradingSession() {
            return this.nextOpenTradingSession;
        }

        /* renamed from: component4, reason: from getter */
        private final BigDecimal getPreviousClosePrice() {
            return this.previousClosePrice;
        }

        /* renamed from: component5, reason: from getter */
        private final FuturesMarginRequirement getMarginRequirement() {
            return this.marginRequirement;
        }

        public static /* synthetic */ ContractSpecsData copy$default(ContractSpecsData contractSpecsData, FuturesContract futuresContract, FuturesProduct futuresProduct, FuturesTradingHours.Session session, BigDecimal bigDecimal, FuturesMarginRequirement futuresMarginRequirement, StringResource stringResource, int i, Object obj) {
            if ((i & 1) != 0) {
                futuresContract = contractSpecsData.contract;
            }
            if ((i & 2) != 0) {
                futuresProduct = contractSpecsData.product;
            }
            if ((i & 4) != 0) {
                session = contractSpecsData.nextOpenTradingSession;
            }
            if ((i & 8) != 0) {
                bigDecimal = contractSpecsData.previousClosePrice;
            }
            if ((i & 16) != 0) {
                futuresMarginRequirement = contractSpecsData.marginRequirement;
            }
            if ((i & 32) != 0) {
                stringResource = contractSpecsData.marginRequired;
            }
            FuturesMarginRequirement futuresMarginRequirement2 = futuresMarginRequirement;
            StringResource stringResource2 = stringResource;
            return contractSpecsData.copy(futuresContract, futuresProduct, session, bigDecimal, futuresMarginRequirement2, stringResource2);
        }

        /* renamed from: component6, reason: from getter */
        public final StringResource getMarginRequired() {
            return this.marginRequired;
        }

        public final ContractSpecsData copy(FuturesContract contract, FuturesProduct product, FuturesTradingHours.Session nextOpenTradingSession, BigDecimal previousClosePrice, FuturesMarginRequirement marginRequirement, StringResource marginRequired) {
            Intrinsics.checkNotNullParameter(marginRequired, "marginRequired");
            return new ContractSpecsData(contract, product, nextOpenTradingSession, previousClosePrice, marginRequirement, marginRequired);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ContractSpecsData)) {
                return false;
            }
            ContractSpecsData contractSpecsData = (ContractSpecsData) other;
            return Intrinsics.areEqual(this.contract, contractSpecsData.contract) && Intrinsics.areEqual(this.product, contractSpecsData.product) && Intrinsics.areEqual(this.nextOpenTradingSession, contractSpecsData.nextOpenTradingSession) && Intrinsics.areEqual(this.previousClosePrice, contractSpecsData.previousClosePrice) && Intrinsics.areEqual(this.marginRequirement, contractSpecsData.marginRequirement) && Intrinsics.areEqual(this.marginRequired, contractSpecsData.marginRequired);
        }

        public int hashCode() {
            FuturesContract futuresContract = this.contract;
            int iHashCode = (futuresContract == null ? 0 : futuresContract.hashCode()) * 31;
            FuturesProduct futuresProduct = this.product;
            int iHashCode2 = (iHashCode + (futuresProduct == null ? 0 : futuresProduct.hashCode())) * 31;
            FuturesTradingHours.Session session = this.nextOpenTradingSession;
            int iHashCode3 = (iHashCode2 + (session == null ? 0 : session.hashCode())) * 31;
            BigDecimal bigDecimal = this.previousClosePrice;
            int iHashCode4 = (iHashCode3 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
            FuturesMarginRequirement futuresMarginRequirement = this.marginRequirement;
            return ((iHashCode4 + (futuresMarginRequirement != null ? futuresMarginRequirement.hashCode() : 0)) * 31) + this.marginRequired.hashCode();
        }

        public String toString() {
            return "ContractSpecsData(contract=" + this.contract + ", product=" + this.product + ", nextOpenTradingSession=" + this.nextOpenTradingSession + ", previousClosePrice=" + this.previousClosePrice + ", marginRequirement=" + this.marginRequirement + ", marginRequired=" + this.marginRequired + ")";
        }

        public ContractSpecsData(FuturesContract futuresContract, FuturesProduct futuresProduct, FuturesTradingHours.Session session, BigDecimal bigDecimal, FuturesMarginRequirement futuresMarginRequirement, StringResource marginRequired) {
            Intrinsics.checkNotNullParameter(marginRequired, "marginRequired");
            this.contract = futuresContract;
            this.product = futuresProduct;
            this.nextOpenTradingSession = session;
            this.previousClosePrice = bigDecimal;
            this.marginRequirement = futuresMarginRequirement;
            this.marginRequired = marginRequired;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ ContractSpecsData(FuturesContract futuresContract, FuturesProduct futuresProduct, FuturesTradingHours.Session session, BigDecimal bigDecimal, FuturesMarginRequirement futuresMarginRequirement, StringResource stringResource, int i, DefaultConstructorMarker defaultConstructorMarker) {
            StringResource stringResource2;
            FuturesMarginRequirement futuresMarginRequirement2;
            futuresContract = (i & 1) != 0 ? null : futuresContract;
            futuresProduct = (i & 2) != 0 ? null : futuresProduct;
            session = (i & 4) != 0 ? null : session;
            bigDecimal = (i & 8) != 0 ? null : bigDecimal;
            if ((i & 16) != 0) {
                stringResource2 = stringResource;
                futuresMarginRequirement2 = null;
            } else {
                stringResource2 = stringResource;
                futuresMarginRequirement2 = futuresMarginRequirement;
            }
            this(futuresContract, futuresProduct, session, bigDecimal, futuresMarginRequirement2, stringResource2);
        }

        public final StringResource getMarginRequired() {
            return this.marginRequired;
        }

        public final StringResource getDelivery() {
            FuturesProduct futuresProduct = this.product;
            FuturesProductDelivery delivery = futuresProduct != null ? futuresProduct.getDelivery() : null;
            int i = delivery == null ? -1 : WhenMappings.$EnumSwitchMapping$0[delivery.ordinal()];
            if (i == -1) {
                return StringResource.INSTANCE.invoke(C11048R.string.general_label_n_a_short, new Object[0]);
            }
            if (i == 1) {
                return StringResource.INSTANCE.invoke(C17042R.string.futures_detail_contract_specs_delivery_physical, new Object[0]);
            }
            if (i == 2) {
                return StringResource.INSTANCE.invoke(C17042R.string.futures_detail_contract_specs_delivery_cash, new Object[0]);
            }
            if (i == 3) {
                return StringResource.INSTANCE.invoke(C17042R.string.futures_detail_contract_specs_delivery_non_deliverable, new Object[0]);
            }
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            return StringResource.INSTANCE.invoke(C17042R.string.futures_detail_contract_specs_delivery_undefined, new Object[0]);
        }

        public final StringResource getDeliveryDefinition() {
            FuturesProduct futuresProduct = this.product;
            FuturesProductDelivery delivery = futuresProduct != null ? futuresProduct.getDelivery() : null;
            int i = delivery == null ? -1 : WhenMappings.$EnumSwitchMapping$0[delivery.ordinal()];
            if (i == -1) {
                return StringResource.INSTANCE.invoke(C11048R.string.general_label_n_a_short, new Object[0]);
            }
            if (i == 1) {
                return StringResource.INSTANCE.invoke(C17042R.string.futures_detail_contract_specs_delivery_physical_definition, new Object[0]);
            }
            if (i == 2) {
                return StringResource.INSTANCE.invoke(C17042R.string.futures_detail_contract_specs_delivery_cash_definition, new Object[0]);
            }
            if (i == 3) {
                return StringResource.INSTANCE.invoke(C11048R.string.general_label_n_a_short, new Object[0]);
            }
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            return StringResource.INSTANCE.invoke(C11048R.string.general_label_n_a_short, new Object[0]);
        }

        public final StringResource getHours() {
            FuturesTradingHours.Session session = this.nextOpenTradingSession;
            if (session == null) {
                return StringResource.INSTANCE.invoke(C11048R.string.general_label_n_a_short, new Object[0]);
            }
            StringResource.Companion companion = StringResource.INSTANCE;
            int i = C17042R.string.futures_detail_contract_specs_hours_format;
            LocalTimeFormatter localTimeFormatter = LocalTimeFormatter.SHORT_OPTIONAL_MINUTE;
            return companion.invoke(i, localTimeFormatter.format(Instants.toLocalTime$default(session.getStartTime(), null, 1, null)), localTimeFormatter.format(Instants.toLocalTime$default(this.nextOpenTradingSession.getEndTime(), null, 1, null)));
        }

        public final StringResource getHoursDefinition() {
            FuturesProduct futuresProduct = this.product;
            String tradingHoursInfoMarkdown = futuresProduct != null ? futuresProduct.getTradingHoursInfoMarkdown() : null;
            if (tradingHoursInfoMarkdown == null) {
                return StringResource.INSTANCE.invoke(C11048R.string.general_label_n_a_short, new Object[0]);
            }
            return StringResource.INSTANCE.invoke(tradingHoursInfoMarkdown);
        }

        public final StringResource getLastTradeDate() {
            LocalDate customerLastCloseDate;
            String str;
            StringResource stringResourceInvoke;
            FuturesContract futuresContract = this.contract;
            return (futuresContract == null || (customerLastCloseDate = futuresContract.getCustomerLastCloseDate()) == null || (str = LocalDateFormatter.MEDIUM.format((LocalDateFormatter) customerLastCloseDate)) == null || (stringResourceInvoke = StringResource.INSTANCE.invoke(str)) == null) ? StringResource.INSTANCE.invoke(C11048R.string.general_label_n_a_short, new Object[0]) : stringResourceInvoke;
        }

        public final StringResource getMultiplier() {
            BigDecimal multiplier;
            StringResource stringResourceInvoke;
            FuturesContract futuresContract = this.contract;
            return (futuresContract == null || (multiplier = futuresContract.getMultiplier()) == null || (stringResourceInvoke = StringResource.INSTANCE.invoke(BigDecimals2.formatCurrencyWithOptionalDecimal$default(multiplier, null, 1, null))) == null) ? StringResource.INSTANCE.invoke(C11048R.string.general_label_n_a_short, new Object[0]) : stringResourceInvoke;
        }

        public final StringResource getTickSize() {
            BigDecimal priceIncrements;
            String plainString;
            StringResource stringResourceInvoke;
            FuturesProduct futuresProduct = this.product;
            return (futuresProduct == null || (priceIncrements = futuresProduct.getPriceIncrements()) == null || (plainString = priceIncrements.toPlainString()) == null || (stringResourceInvoke = StringResource.INSTANCE.invoke(plainString)) == null) ? StringResource.INSTANCE.invoke(C11048R.string.general_label_n_a_short, new Object[0]) : stringResourceInvoke;
        }

        public final StringResource getTickValue() {
            FuturesProduct futuresProduct = this.product;
            if (futuresProduct == null || this.contract == null) {
                return StringResource.INSTANCE.invoke(C11048R.string.general_label_n_a_short, new Object[0]);
            }
            BigDecimal bigDecimalMultiply = futuresProduct.getPriceIncrements().multiply(this.contract.getMultiplier());
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
            return StringResource.INSTANCE.invoke(BigDecimals2.formatCurrencyWithOptionalDecimal$default(bigDecimalMultiply, null, 1, null));
        }

        public final StringResource getLeverage() {
            FuturesContract futuresContract;
            if (this.marginRequirement == null || this.previousClosePrice == null || (futuresContract = this.contract) == null) {
                return StringResource.INSTANCE.invoke(C11048R.string.general_label_n_a_short, new Object[0]);
            }
            return StringResource.INSTANCE.invoke(C17042R.string.futures_detail_contract_specs_leverage_value, NumberFormat.getNumberInstance().format(BigDecimals7.safeDivide(BigDecimals7.safeMultiply(futuresContract.getMultiplier(), this.previousClosePrice), this.marginRequirement.getMarginRequirement(), 2, RoundingMode.HALF_UP)));
        }
    }

    /* compiled from: FuturesDetailViewState.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState$HistorySectionData;", "", "listParams", "Lcom/robinhood/android/common/history/ui/lazyList/HistoryPreviewListParams;", "footerKey", "Lcom/robinhood/shared/history/contracts/account/AccountsHistoryContract$Key;", "<init>", "(Lcom/robinhood/android/common/history/ui/lazyList/HistoryPreviewListParams;Lcom/robinhood/shared/history/contracts/account/AccountsHistoryContract$Key;)V", "getListParams", "()Lcom/robinhood/android/common/history/ui/lazyList/HistoryPreviewListParams;", "getFooterKey", "()Lcom/robinhood/shared/history/contracts/account/AccountsHistoryContract$Key;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-futures-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class HistorySectionData {
        public static final int $stable = 8;
        private final AccountsHistoryContract.Key footerKey;
        private final HistoryPreviewListParams listParams;

        public static /* synthetic */ HistorySectionData copy$default(HistorySectionData historySectionData, HistoryPreviewListParams historyPreviewListParams, AccountsHistoryContract.Key key, int i, Object obj) {
            if ((i & 1) != 0) {
                historyPreviewListParams = historySectionData.listParams;
            }
            if ((i & 2) != 0) {
                key = historySectionData.footerKey;
            }
            return historySectionData.copy(historyPreviewListParams, key);
        }

        /* renamed from: component1, reason: from getter */
        public final HistoryPreviewListParams getListParams() {
            return this.listParams;
        }

        /* renamed from: component2, reason: from getter */
        public final AccountsHistoryContract.Key getFooterKey() {
            return this.footerKey;
        }

        public final HistorySectionData copy(HistoryPreviewListParams listParams, AccountsHistoryContract.Key footerKey) {
            Intrinsics.checkNotNullParameter(listParams, "listParams");
            Intrinsics.checkNotNullParameter(footerKey, "footerKey");
            return new HistorySectionData(listParams, footerKey);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HistorySectionData)) {
                return false;
            }
            HistorySectionData historySectionData = (HistorySectionData) other;
            return Intrinsics.areEqual(this.listParams, historySectionData.listParams) && Intrinsics.areEqual(this.footerKey, historySectionData.footerKey);
        }

        public int hashCode() {
            return (this.listParams.hashCode() * 31) + this.footerKey.hashCode();
        }

        public String toString() {
            return "HistorySectionData(listParams=" + this.listParams + ", footerKey=" + this.footerKey + ")";
        }

        public HistorySectionData(HistoryPreviewListParams listParams, AccountsHistoryContract.Key footerKey) {
            Intrinsics.checkNotNullParameter(listParams, "listParams");
            Intrinsics.checkNotNullParameter(footerKey, "footerKey");
            this.listParams = listParams;
            this.footerKey = footerKey;
        }

        public final HistoryPreviewListParams getListParams() {
            return this.listParams;
        }

        public final AccountsHistoryContract.Key getFooterKey() {
            return this.footerKey;
        }
    }

    /* compiled from: FuturesDetailViewState.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState$AboutData;", "", "title", "Lcom/robinhood/utils/resource/StringResource;", "description", "", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Ljava/lang/String;)V", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getDescription", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-futures-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class AboutData {
        public static final int $stable = StringResource.$stable;
        private final String description;
        private final StringResource title;

        public static /* synthetic */ AboutData copy$default(AboutData aboutData, StringResource stringResource, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                stringResource = aboutData.title;
            }
            if ((i & 2) != 0) {
                str = aboutData.description;
            }
            return aboutData.copy(stringResource, str);
        }

        /* renamed from: component1, reason: from getter */
        public final StringResource getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        public final AboutData copy(StringResource title, String description) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            return new AboutData(title, description);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AboutData)) {
                return false;
            }
            AboutData aboutData = (AboutData) other;
            return Intrinsics.areEqual(this.title, aboutData.title) && Intrinsics.areEqual(this.description, aboutData.description);
        }

        public int hashCode() {
            return (this.title.hashCode() * 31) + this.description.hashCode();
        }

        public String toString() {
            return "AboutData(title=" + this.title + ", description=" + this.description + ")";
        }

        public AboutData(StringResource title, String description) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            this.title = title;
            this.description = description;
        }

        public final StringResource getTitle() {
            return this.title;
        }

        public final String getDescription() {
            return this.description;
        }
    }

    /* compiled from: FuturesDetailViewState.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\fHÆ\u0003J\t\u0010%\u001a\u00020\fHÆ\u0003Jm\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020-HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001a¨\u0006."}, m3636d2 = {"Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState$StatsData;", "", "bid", "Lcom/robinhood/utils/resource/StringResource;", "ask", "bidSize", "askSize", "high", "low", SduiChartZoomTransformer.VOLUME_IDENTIFIER, "prevSettlement", "bidBarFraction", "", "askBarFraction", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;FF)V", "getBid", "()Lcom/robinhood/utils/resource/StringResource;", "getAsk", "getBidSize", "getAskSize", "getHigh", "getLow", "getVolume", "getPrevSettlement", "getBidBarFraction", "()F", "getAskBarFraction", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-futures-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class StatsData {
        public static final int $stable = StringResource.$stable;
        private final StringResource ask;
        private final float askBarFraction;
        private final StringResource askSize;
        private final StringResource bid;
        private final float bidBarFraction;
        private final StringResource bidSize;
        private final StringResource high;
        private final StringResource low;
        private final StringResource prevSettlement;
        private final StringResource volume;

        public static /* synthetic */ StatsData copy$default(StatsData statsData, StringResource stringResource, StringResource stringResource2, StringResource stringResource3, StringResource stringResource4, StringResource stringResource5, StringResource stringResource6, StringResource stringResource7, StringResource stringResource8, float f, float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                stringResource = statsData.bid;
            }
            if ((i & 2) != 0) {
                stringResource2 = statsData.ask;
            }
            if ((i & 4) != 0) {
                stringResource3 = statsData.bidSize;
            }
            if ((i & 8) != 0) {
                stringResource4 = statsData.askSize;
            }
            if ((i & 16) != 0) {
                stringResource5 = statsData.high;
            }
            if ((i & 32) != 0) {
                stringResource6 = statsData.low;
            }
            if ((i & 64) != 0) {
                stringResource7 = statsData.volume;
            }
            if ((i & 128) != 0) {
                stringResource8 = statsData.prevSettlement;
            }
            if ((i & 256) != 0) {
                f = statsData.bidBarFraction;
            }
            if ((i & 512) != 0) {
                f2 = statsData.askBarFraction;
            }
            float f3 = f;
            float f4 = f2;
            StringResource stringResource9 = stringResource7;
            StringResource stringResource10 = stringResource8;
            StringResource stringResource11 = stringResource5;
            StringResource stringResource12 = stringResource6;
            return statsData.copy(stringResource, stringResource2, stringResource3, stringResource4, stringResource11, stringResource12, stringResource9, stringResource10, f3, f4);
        }

        /* renamed from: component1, reason: from getter */
        public final StringResource getBid() {
            return this.bid;
        }

        /* renamed from: component10, reason: from getter */
        public final float getAskBarFraction() {
            return this.askBarFraction;
        }

        /* renamed from: component2, reason: from getter */
        public final StringResource getAsk() {
            return this.ask;
        }

        /* renamed from: component3, reason: from getter */
        public final StringResource getBidSize() {
            return this.bidSize;
        }

        /* renamed from: component4, reason: from getter */
        public final StringResource getAskSize() {
            return this.askSize;
        }

        /* renamed from: component5, reason: from getter */
        public final StringResource getHigh() {
            return this.high;
        }

        /* renamed from: component6, reason: from getter */
        public final StringResource getLow() {
            return this.low;
        }

        /* renamed from: component7, reason: from getter */
        public final StringResource getVolume() {
            return this.volume;
        }

        /* renamed from: component8, reason: from getter */
        public final StringResource getPrevSettlement() {
            return this.prevSettlement;
        }

        /* renamed from: component9, reason: from getter */
        public final float getBidBarFraction() {
            return this.bidBarFraction;
        }

        public final StatsData copy(StringResource bid, StringResource ask, StringResource bidSize, StringResource askSize, StringResource high, StringResource low, StringResource volume, StringResource prevSettlement, float bidBarFraction, float askBarFraction) {
            Intrinsics.checkNotNullParameter(bid, "bid");
            Intrinsics.checkNotNullParameter(ask, "ask");
            Intrinsics.checkNotNullParameter(bidSize, "bidSize");
            Intrinsics.checkNotNullParameter(askSize, "askSize");
            Intrinsics.checkNotNullParameter(high, "high");
            Intrinsics.checkNotNullParameter(low, "low");
            Intrinsics.checkNotNullParameter(volume, "volume");
            Intrinsics.checkNotNullParameter(prevSettlement, "prevSettlement");
            return new StatsData(bid, ask, bidSize, askSize, high, low, volume, prevSettlement, bidBarFraction, askBarFraction);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StatsData)) {
                return false;
            }
            StatsData statsData = (StatsData) other;
            return Intrinsics.areEqual(this.bid, statsData.bid) && Intrinsics.areEqual(this.ask, statsData.ask) && Intrinsics.areEqual(this.bidSize, statsData.bidSize) && Intrinsics.areEqual(this.askSize, statsData.askSize) && Intrinsics.areEqual(this.high, statsData.high) && Intrinsics.areEqual(this.low, statsData.low) && Intrinsics.areEqual(this.volume, statsData.volume) && Intrinsics.areEqual(this.prevSettlement, statsData.prevSettlement) && Float.compare(this.bidBarFraction, statsData.bidBarFraction) == 0 && Float.compare(this.askBarFraction, statsData.askBarFraction) == 0;
        }

        public int hashCode() {
            return (((((((((((((((((this.bid.hashCode() * 31) + this.ask.hashCode()) * 31) + this.bidSize.hashCode()) * 31) + this.askSize.hashCode()) * 31) + this.high.hashCode()) * 31) + this.low.hashCode()) * 31) + this.volume.hashCode()) * 31) + this.prevSettlement.hashCode()) * 31) + Float.hashCode(this.bidBarFraction)) * 31) + Float.hashCode(this.askBarFraction);
        }

        public String toString() {
            return "StatsData(bid=" + this.bid + ", ask=" + this.ask + ", bidSize=" + this.bidSize + ", askSize=" + this.askSize + ", high=" + this.high + ", low=" + this.low + ", volume=" + this.volume + ", prevSettlement=" + this.prevSettlement + ", bidBarFraction=" + this.bidBarFraction + ", askBarFraction=" + this.askBarFraction + ")";
        }

        public StatsData(StringResource bid, StringResource ask, StringResource bidSize, StringResource askSize, StringResource high, StringResource low, StringResource volume, StringResource prevSettlement, float f, float f2) {
            Intrinsics.checkNotNullParameter(bid, "bid");
            Intrinsics.checkNotNullParameter(ask, "ask");
            Intrinsics.checkNotNullParameter(bidSize, "bidSize");
            Intrinsics.checkNotNullParameter(askSize, "askSize");
            Intrinsics.checkNotNullParameter(high, "high");
            Intrinsics.checkNotNullParameter(low, "low");
            Intrinsics.checkNotNullParameter(volume, "volume");
            Intrinsics.checkNotNullParameter(prevSettlement, "prevSettlement");
            this.bid = bid;
            this.ask = ask;
            this.bidSize = bidSize;
            this.askSize = askSize;
            this.high = high;
            this.low = low;
            this.volume = volume;
            this.prevSettlement = prevSettlement;
            this.bidBarFraction = f;
            this.askBarFraction = f2;
        }

        public final StringResource getBid() {
            return this.bid;
        }

        public final StringResource getAsk() {
            return this.ask;
        }

        public final StringResource getBidSize() {
            return this.bidSize;
        }

        public final StringResource getAskSize() {
            return this.askSize;
        }

        public final StringResource getHigh() {
            return this.high;
        }

        public final StringResource getLow() {
            return this.low;
        }

        public final StringResource getVolume() {
            return this.volume;
        }

        public final StringResource getPrevSettlement() {
            return this.prevSettlement;
        }

        public final float getBidBarFraction() {
            return this.bidBarFraction;
        }

        public final float getAskBarFraction() {
            return this.askBarFraction;
        }
    }

    /* compiled from: FuturesDetailViewState.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001(BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003JQ\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\"\u001a\u00020\u00032\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u000f¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState$TradeBarData;", "", "takeUserToOnboardingFlow", "", "buyButtonEnabled", "sellButtonEnabled", "ladderButtonEnabled", "tradeBarOverviewContent", "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState$TradeBarData$TradeBarOverviewContent;", "showLadderButtonTooltip", "tradability", "Lcom/robinhood/android/models/futures/api/arsenal/FuturesContractTradability;", "<init>", "(ZZZZLcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState$TradeBarData$TradeBarOverviewContent;ZLcom/robinhood/android/models/futures/api/arsenal/FuturesContractTradability;)V", "getTakeUserToOnboardingFlow", "()Z", "getBuyButtonEnabled", "getSellButtonEnabled", "getLadderButtonEnabled", "getTradeBarOverviewContent", "()Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState$TradeBarData$TradeBarOverviewContent;", "getShowLadderButtonTooltip", "getTradability", "()Lcom/robinhood/android/models/futures/api/arsenal/FuturesContractTradability;", "tradeButtonEnabled", "getTradeButtonEnabled", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "", "TradeBarOverviewContent", "feature-futures-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class TradeBarData {
        public static final int $stable = 8;
        private final boolean buyButtonEnabled;
        private final boolean ladderButtonEnabled;
        private final boolean sellButtonEnabled;
        private final boolean showLadderButtonTooltip;
        private final boolean takeUserToOnboardingFlow;
        private final FuturesContractTradability tradability;
        private final TradeBarOverviewContent tradeBarOverviewContent;

        public static /* synthetic */ TradeBarData copy$default(TradeBarData tradeBarData, boolean z, boolean z2, boolean z3, boolean z4, TradeBarOverviewContent tradeBarOverviewContent, boolean z5, FuturesContractTradability futuresContractTradability, int i, Object obj) {
            if ((i & 1) != 0) {
                z = tradeBarData.takeUserToOnboardingFlow;
            }
            if ((i & 2) != 0) {
                z2 = tradeBarData.buyButtonEnabled;
            }
            if ((i & 4) != 0) {
                z3 = tradeBarData.sellButtonEnabled;
            }
            if ((i & 8) != 0) {
                z4 = tradeBarData.ladderButtonEnabled;
            }
            if ((i & 16) != 0) {
                tradeBarOverviewContent = tradeBarData.tradeBarOverviewContent;
            }
            if ((i & 32) != 0) {
                z5 = tradeBarData.showLadderButtonTooltip;
            }
            if ((i & 64) != 0) {
                futuresContractTradability = tradeBarData.tradability;
            }
            boolean z6 = z5;
            FuturesContractTradability futuresContractTradability2 = futuresContractTradability;
            TradeBarOverviewContent tradeBarOverviewContent2 = tradeBarOverviewContent;
            boolean z7 = z3;
            return tradeBarData.copy(z, z2, z7, z4, tradeBarOverviewContent2, z6, futuresContractTradability2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getTakeUserToOnboardingFlow() {
            return this.takeUserToOnboardingFlow;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getBuyButtonEnabled() {
            return this.buyButtonEnabled;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getSellButtonEnabled() {
            return this.sellButtonEnabled;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getLadderButtonEnabled() {
            return this.ladderButtonEnabled;
        }

        /* renamed from: component5, reason: from getter */
        public final TradeBarOverviewContent getTradeBarOverviewContent() {
            return this.tradeBarOverviewContent;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getShowLadderButtonTooltip() {
            return this.showLadderButtonTooltip;
        }

        /* renamed from: component7, reason: from getter */
        public final FuturesContractTradability getTradability() {
            return this.tradability;
        }

        public final TradeBarData copy(boolean takeUserToOnboardingFlow, boolean buyButtonEnabled, boolean sellButtonEnabled, boolean ladderButtonEnabled, TradeBarOverviewContent tradeBarOverviewContent, boolean showLadderButtonTooltip, FuturesContractTradability tradability) {
            Intrinsics.checkNotNullParameter(tradeBarOverviewContent, "tradeBarOverviewContent");
            return new TradeBarData(takeUserToOnboardingFlow, buyButtonEnabled, sellButtonEnabled, ladderButtonEnabled, tradeBarOverviewContent, showLadderButtonTooltip, tradability);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TradeBarData)) {
                return false;
            }
            TradeBarData tradeBarData = (TradeBarData) other;
            return this.takeUserToOnboardingFlow == tradeBarData.takeUserToOnboardingFlow && this.buyButtonEnabled == tradeBarData.buyButtonEnabled && this.sellButtonEnabled == tradeBarData.sellButtonEnabled && this.ladderButtonEnabled == tradeBarData.ladderButtonEnabled && Intrinsics.areEqual(this.tradeBarOverviewContent, tradeBarData.tradeBarOverviewContent) && this.showLadderButtonTooltip == tradeBarData.showLadderButtonTooltip && this.tradability == tradeBarData.tradability;
        }

        public int hashCode() {
            int iHashCode = ((((((((((Boolean.hashCode(this.takeUserToOnboardingFlow) * 31) + Boolean.hashCode(this.buyButtonEnabled)) * 31) + Boolean.hashCode(this.sellButtonEnabled)) * 31) + Boolean.hashCode(this.ladderButtonEnabled)) * 31) + this.tradeBarOverviewContent.hashCode()) * 31) + Boolean.hashCode(this.showLadderButtonTooltip)) * 31;
            FuturesContractTradability futuresContractTradability = this.tradability;
            return iHashCode + (futuresContractTradability == null ? 0 : futuresContractTradability.hashCode());
        }

        public String toString() {
            return "TradeBarData(takeUserToOnboardingFlow=" + this.takeUserToOnboardingFlow + ", buyButtonEnabled=" + this.buyButtonEnabled + ", sellButtonEnabled=" + this.sellButtonEnabled + ", ladderButtonEnabled=" + this.ladderButtonEnabled + ", tradeBarOverviewContent=" + this.tradeBarOverviewContent + ", showLadderButtonTooltip=" + this.showLadderButtonTooltip + ", tradability=" + this.tradability + ")";
        }

        public TradeBarData(boolean z, boolean z2, boolean z3, boolean z4, TradeBarOverviewContent tradeBarOverviewContent, boolean z5, FuturesContractTradability futuresContractTradability) {
            Intrinsics.checkNotNullParameter(tradeBarOverviewContent, "tradeBarOverviewContent");
            this.takeUserToOnboardingFlow = z;
            this.buyButtonEnabled = z2;
            this.sellButtonEnabled = z3;
            this.ladderButtonEnabled = z4;
            this.tradeBarOverviewContent = tradeBarOverviewContent;
            this.showLadderButtonTooltip = z5;
            this.tradability = futuresContractTradability;
        }

        public final boolean getTakeUserToOnboardingFlow() {
            return this.takeUserToOnboardingFlow;
        }

        public final boolean getBuyButtonEnabled() {
            return this.buyButtonEnabled;
        }

        public final boolean getSellButtonEnabled() {
            return this.sellButtonEnabled;
        }

        public final boolean getLadderButtonEnabled() {
            return this.ladderButtonEnabled;
        }

        public final TradeBarOverviewContent getTradeBarOverviewContent() {
            return this.tradeBarOverviewContent;
        }

        public final boolean getShowLadderButtonTooltip() {
            return this.showLadderButtonTooltip;
        }

        public final FuturesContractTradability getTradability() {
            return this.tradability;
        }

        /* compiled from: FuturesDetailViewState.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState$TradeBarData$TradeBarOverviewContent;", "", "MarginRequired", "RhsAccountLabel", "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState$TradeBarData$TradeBarOverviewContent$MarginRequired;", "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState$TradeBarData$TradeBarOverviewContent$RhsAccountLabel;", "feature-futures-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public interface TradeBarOverviewContent {

            /* compiled from: FuturesDetailViewState.kt */
            @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState$TradeBarData$TradeBarOverviewContent$MarginRequired;", "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState$TradeBarData$TradeBarOverviewContent;", "text", "Lcom/robinhood/utils/resource/StringResource;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;)V", "getText", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-futures-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final /* data */ class MarginRequired implements TradeBarOverviewContent {
                public static final int $stable = StringResource.$stable;
                private final StringResource text;

                public static /* synthetic */ MarginRequired copy$default(MarginRequired marginRequired, StringResource stringResource, int i, Object obj) {
                    if ((i & 1) != 0) {
                        stringResource = marginRequired.text;
                    }
                    return marginRequired.copy(stringResource);
                }

                /* renamed from: component1, reason: from getter */
                public final StringResource getText() {
                    return this.text;
                }

                public final MarginRequired copy(StringResource text) {
                    Intrinsics.checkNotNullParameter(text, "text");
                    return new MarginRequired(text);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof MarginRequired) && Intrinsics.areEqual(this.text, ((MarginRequired) other).text);
                }

                public int hashCode() {
                    return this.text.hashCode();
                }

                public String toString() {
                    return "MarginRequired(text=" + this.text + ")";
                }

                public MarginRequired(StringResource text) {
                    Intrinsics.checkNotNullParameter(text, "text");
                    this.text = text;
                }

                public final StringResource getText() {
                    return this.text;
                }
            }

            /* compiled from: FuturesDetailViewState.kt */
            @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState$TradeBarData$TradeBarOverviewContent$RhsAccountLabel;", "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState$TradeBarData$TradeBarOverviewContent;", "accountNickName", "Lcom/robinhood/utils/resource/StringResource;", "iconAsset", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;)V", "getAccountNickName", "()Lcom/robinhood/utils/resource/StringResource;", "getIconAsset", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-futures-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final /* data */ class RhsAccountLabel implements TradeBarOverviewContent {
                public static final int $stable = StringResource.$stable;
                private final StringResource accountNickName;
                private final ServerToBentoAssetMapper2 iconAsset;

                public static /* synthetic */ RhsAccountLabel copy$default(RhsAccountLabel rhsAccountLabel, StringResource stringResource, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        stringResource = rhsAccountLabel.accountNickName;
                    }
                    if ((i & 2) != 0) {
                        serverToBentoAssetMapper2 = rhsAccountLabel.iconAsset;
                    }
                    return rhsAccountLabel.copy(stringResource, serverToBentoAssetMapper2);
                }

                /* renamed from: component1, reason: from getter */
                public final StringResource getAccountNickName() {
                    return this.accountNickName;
                }

                /* renamed from: component2, reason: from getter */
                public final ServerToBentoAssetMapper2 getIconAsset() {
                    return this.iconAsset;
                }

                public final RhsAccountLabel copy(StringResource accountNickName, ServerToBentoAssetMapper2 iconAsset) {
                    Intrinsics.checkNotNullParameter(accountNickName, "accountNickName");
                    Intrinsics.checkNotNullParameter(iconAsset, "iconAsset");
                    return new RhsAccountLabel(accountNickName, iconAsset);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof RhsAccountLabel)) {
                        return false;
                    }
                    RhsAccountLabel rhsAccountLabel = (RhsAccountLabel) other;
                    return Intrinsics.areEqual(this.accountNickName, rhsAccountLabel.accountNickName) && this.iconAsset == rhsAccountLabel.iconAsset;
                }

                public int hashCode() {
                    return (this.accountNickName.hashCode() * 31) + this.iconAsset.hashCode();
                }

                public String toString() {
                    return "RhsAccountLabel(accountNickName=" + this.accountNickName + ", iconAsset=" + this.iconAsset + ")";
                }

                public RhsAccountLabel(StringResource accountNickName, ServerToBentoAssetMapper2 iconAsset) {
                    Intrinsics.checkNotNullParameter(accountNickName, "accountNickName");
                    Intrinsics.checkNotNullParameter(iconAsset, "iconAsset");
                    this.accountNickName = accountNickName;
                    this.iconAsset = iconAsset;
                }

                public final StringResource getAccountNickName() {
                    return this.accountNickName;
                }

                public final ServerToBentoAssetMapper2 getIconAsset() {
                    return this.iconAsset;
                }
            }
        }

        public final boolean getTradeButtonEnabled() {
            return this.ladderButtonEnabled || this.buyButtonEnabled || this.sellButtonEnabled;
        }
    }

    /* compiled from: FuturesDetailViewState.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\nHÆ\u0003JA\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState$LoggingData;", "", "numPosition", "", "numPendingOrders", "marginRequirement", "Lcom/robinhood/models/util/Money;", "selectedContractId", "Ljava/util/UUID;", "selectedContractTradability", "Lcom/robinhood/android/models/futures/api/arsenal/FuturesContractTradability;", "<init>", "(IILcom/robinhood/models/util/Money;Ljava/util/UUID;Lcom/robinhood/android/models/futures/api/arsenal/FuturesContractTradability;)V", "getNumPosition", "()I", "getNumPendingOrders", "getMarginRequirement", "()Lcom/robinhood/models/util/Money;", "getSelectedContractId", "()Ljava/util/UUID;", "getSelectedContractTradability", "()Lcom/robinhood/android/models/futures/api/arsenal/FuturesContractTradability;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "feature-futures-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class LoggingData {
        public static final int $stable = 8;
        private final Money marginRequirement;
        private final int numPendingOrders;
        private final int numPosition;
        private final UUID selectedContractId;
        private final FuturesContractTradability selectedContractTradability;

        public static /* synthetic */ LoggingData copy$default(LoggingData loggingData, int i, int i2, Money money, UUID uuid, FuturesContractTradability futuresContractTradability, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = loggingData.numPosition;
            }
            if ((i3 & 2) != 0) {
                i2 = loggingData.numPendingOrders;
            }
            if ((i3 & 4) != 0) {
                money = loggingData.marginRequirement;
            }
            if ((i3 & 8) != 0) {
                uuid = loggingData.selectedContractId;
            }
            if ((i3 & 16) != 0) {
                futuresContractTradability = loggingData.selectedContractTradability;
            }
            FuturesContractTradability futuresContractTradability2 = futuresContractTradability;
            Money money2 = money;
            return loggingData.copy(i, i2, money2, uuid, futuresContractTradability2);
        }

        /* renamed from: component1, reason: from getter */
        public final int getNumPosition() {
            return this.numPosition;
        }

        /* renamed from: component2, reason: from getter */
        public final int getNumPendingOrders() {
            return this.numPendingOrders;
        }

        /* renamed from: component3, reason: from getter */
        public final Money getMarginRequirement() {
            return this.marginRequirement;
        }

        /* renamed from: component4, reason: from getter */
        public final UUID getSelectedContractId() {
            return this.selectedContractId;
        }

        /* renamed from: component5, reason: from getter */
        public final FuturesContractTradability getSelectedContractTradability() {
            return this.selectedContractTradability;
        }

        public final LoggingData copy(int numPosition, int numPendingOrders, Money marginRequirement, UUID selectedContractId, FuturesContractTradability selectedContractTradability) {
            return new LoggingData(numPosition, numPendingOrders, marginRequirement, selectedContractId, selectedContractTradability);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LoggingData)) {
                return false;
            }
            LoggingData loggingData = (LoggingData) other;
            return this.numPosition == loggingData.numPosition && this.numPendingOrders == loggingData.numPendingOrders && Intrinsics.areEqual(this.marginRequirement, loggingData.marginRequirement) && Intrinsics.areEqual(this.selectedContractId, loggingData.selectedContractId) && this.selectedContractTradability == loggingData.selectedContractTradability;
        }

        public int hashCode() {
            int iHashCode = ((Integer.hashCode(this.numPosition) * 31) + Integer.hashCode(this.numPendingOrders)) * 31;
            Money money = this.marginRequirement;
            int iHashCode2 = (iHashCode + (money == null ? 0 : money.hashCode())) * 31;
            UUID uuid = this.selectedContractId;
            int iHashCode3 = (iHashCode2 + (uuid == null ? 0 : uuid.hashCode())) * 31;
            FuturesContractTradability futuresContractTradability = this.selectedContractTradability;
            return iHashCode3 + (futuresContractTradability != null ? futuresContractTradability.hashCode() : 0);
        }

        public String toString() {
            return "LoggingData(numPosition=" + this.numPosition + ", numPendingOrders=" + this.numPendingOrders + ", marginRequirement=" + this.marginRequirement + ", selectedContractId=" + this.selectedContractId + ", selectedContractTradability=" + this.selectedContractTradability + ")";
        }

        public LoggingData(int i, int i2, Money money, UUID uuid, FuturesContractTradability futuresContractTradability) {
            this.numPosition = i;
            this.numPendingOrders = i2;
            this.marginRequirement = money;
            this.selectedContractId = uuid;
            this.selectedContractTradability = futuresContractTradability;
        }

        public final int getNumPosition() {
            return this.numPosition;
        }

        public final int getNumPendingOrders() {
            return this.numPendingOrders;
        }

        public final Money getMarginRequirement() {
            return this.marginRequirement;
        }

        public final UUID getSelectedContractId() {
            return this.selectedContractId;
        }

        public final FuturesContractTradability getSelectedContractTradability() {
            return this.selectedContractTradability;
        }
    }

    public final boolean isFtuxInProgress() {
        return FtuxProgressState2.isInProgress(this.ftuxProgressState);
    }

    public final boolean isFtuxChartEducationInProgress() {
        FtuxProgressState.ScrimData scrimData;
        FtuxProgressState ftuxProgressState = this.ftuxProgressState;
        return (ftuxProgressState == null || (scrimData = ftuxProgressState.getScrimData()) == null || !scrimData.getShowChart()) ? false : true;
    }

    public final boolean isFtuxContractSpecsEducationInProgress() {
        FtuxProgressState.ScrimData scrimData;
        FtuxProgressState.ScrimData.ContractSpecScrim contractSpecScrim;
        FtuxProgressState ftuxProgressState = this.ftuxProgressState;
        return (ftuxProgressState == null || (scrimData = ftuxProgressState.getScrimData()) == null || (contractSpecScrim = scrimData.getContractSpecScrim()) == null || !contractSpecScrim.getShowContractSpecs()) ? false : true;
    }

    public final boolean getShowScrimOnChart() {
        return isFtuxInProgress() && !isFtuxChartEducationInProgress();
    }

    public final boolean getShowScrimOnContractSpec() {
        return isFtuxInProgress() && !isFtuxContractSpecsEducationInProgress();
    }

    public final boolean getShowScrimOnLeverage() {
        FtuxProgressState ftuxProgressState;
        FtuxProgressState.ScrimData scrimData;
        FtuxProgressState.ScrimData.ContractSpecScrim contractSpecScrim;
        return (!isFtuxInProgress() || (ftuxProgressState = this.ftuxProgressState) == null || (scrimData = ftuxProgressState.getScrimData()) == null || (contractSpecScrim = scrimData.getContractSpecScrim()) == null || !contractSpecScrim.getScrimLeverage()) ? false : true;
    }

    public final boolean isTradeBarVisible() {
        FtuxProgressState ftuxProgressState;
        FtuxProgressState.ScrimData scrimData;
        return (isFtuxInProgress() && ((ftuxProgressState = this.ftuxProgressState) == null || (scrimData = ftuxProgressState.getScrimData()) == null || !scrimData.getShowTradeBar())) ? false : true;
    }

    public final boolean isTradeBarInteractive() {
        return !isFtuxInProgress();
    }
}
