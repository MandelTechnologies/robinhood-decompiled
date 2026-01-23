package com.robinhood.android.futures.trade.p147ui.ladder;

import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.android.futures.sharedfuturesui.contextualbar.LadderFtuxProgressState;
import com.robinhood.android.futures.trade.extensions.FutureOrders;
import com.robinhood.android.futures.trade.extensions.FutureOrders2;
import com.robinhood.android.futures.trade.extensions.Moneys;
import com.robinhood.android.futures.trade.p147ui.ladder.FuturesLadderDataState;
import com.robinhood.android.futures.trade.p147ui.ladder.FuturesLadderViewState;
import com.robinhood.android.futures.trade.p147ui.ladder.gestures.LadderCustomGestureDetector;
import com.robinhood.android.models.futures.api.order.FuturesOrderSide;
import com.robinhood.android.models.futures.api.order.FuturesOrderTrigger;
import com.robinhood.android.models.futures.api.order.FuturesOrderType;
import com.robinhood.android.models.futures.api.order.FuturesTimeInForce;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.store.futures.FuturesPnLHelper;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: FuturesLadderViewState.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0006345678BO\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010(\u001a\u00020\u000bHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\t\u0010+\u001a\u00020\u0011HÆ\u0003Ja\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011HÆ\u0001J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u000201HÖ\u0001J\t\u00102\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u00069"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState;", "", "rhsAccountNumber", "", "initialContractId", "Ljava/util/UUID;", "topbar", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$TopBarData;", "ladder", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$LadderData;", "bottomPanel", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$BottomPanelData;", "settingsData", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$SettingsBottomSheetData;", "ftuxProgressState", "Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/LadderFtuxProgressState;", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/rosetta/eventlogging/Context;", "<init>", "(Ljava/lang/String;Ljava/util/UUID;Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$TopBarData;Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$LadderData;Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$BottomPanelData;Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$SettingsBottomSheetData;Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/LadderFtuxProgressState;Lcom/robinhood/rosetta/eventlogging/Context;)V", "getRhsAccountNumber", "()Ljava/lang/String;", "getInitialContractId", "()Ljava/util/UUID;", "getTopbar", "()Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$TopBarData;", "getLadder", "()Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$LadderData;", "getBottomPanel", "()Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$BottomPanelData;", "getSettingsData", "()Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$SettingsBottomSheetData;", "getFtuxProgressState", "()Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/LadderFtuxProgressState;", "getLoggingContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "TopBarData", "LadderData", "QuantityPanelData", "MarketClosedHeaderData", "BottomPanelData", "SettingsBottomSheetData", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class FuturesLadderViewState {
    public static final int $stable = 8;
    private final BottomPanelData bottomPanel;
    private final LadderFtuxProgressState ftuxProgressState;
    private final UUID initialContractId;
    private final LadderData ladder;
    private final Context loggingContext;
    private final String rhsAccountNumber;
    private final SettingsBottomSheetData settingsData;
    private final TopBarData topbar;

    public static /* synthetic */ FuturesLadderViewState copy$default(FuturesLadderViewState futuresLadderViewState, String str, UUID uuid, TopBarData topBarData, LadderData ladderData, BottomPanelData bottomPanelData, SettingsBottomSheetData settingsBottomSheetData, LadderFtuxProgressState ladderFtuxProgressState, Context context, int i, Object obj) {
        if ((i & 1) != 0) {
            str = futuresLadderViewState.rhsAccountNumber;
        }
        if ((i & 2) != 0) {
            uuid = futuresLadderViewState.initialContractId;
        }
        if ((i & 4) != 0) {
            topBarData = futuresLadderViewState.topbar;
        }
        if ((i & 8) != 0) {
            ladderData = futuresLadderViewState.ladder;
        }
        if ((i & 16) != 0) {
            bottomPanelData = futuresLadderViewState.bottomPanel;
        }
        if ((i & 32) != 0) {
            settingsBottomSheetData = futuresLadderViewState.settingsData;
        }
        if ((i & 64) != 0) {
            ladderFtuxProgressState = futuresLadderViewState.ftuxProgressState;
        }
        if ((i & 128) != 0) {
            context = futuresLadderViewState.loggingContext;
        }
        LadderFtuxProgressState ladderFtuxProgressState2 = ladderFtuxProgressState;
        Context context2 = context;
        BottomPanelData bottomPanelData2 = bottomPanelData;
        SettingsBottomSheetData settingsBottomSheetData2 = settingsBottomSheetData;
        return futuresLadderViewState.copy(str, uuid, topBarData, ladderData, bottomPanelData2, settingsBottomSheetData2, ladderFtuxProgressState2, context2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getRhsAccountNumber() {
        return this.rhsAccountNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final UUID getInitialContractId() {
        return this.initialContractId;
    }

    /* renamed from: component3, reason: from getter */
    public final TopBarData getTopbar() {
        return this.topbar;
    }

    /* renamed from: component4, reason: from getter */
    public final LadderData getLadder() {
        return this.ladder;
    }

    /* renamed from: component5, reason: from getter */
    public final BottomPanelData getBottomPanel() {
        return this.bottomPanel;
    }

    /* renamed from: component6, reason: from getter */
    public final SettingsBottomSheetData getSettingsData() {
        return this.settingsData;
    }

    /* renamed from: component7, reason: from getter */
    public final LadderFtuxProgressState getFtuxProgressState() {
        return this.ftuxProgressState;
    }

    /* renamed from: component8, reason: from getter */
    public final Context getLoggingContext() {
        return this.loggingContext;
    }

    public final FuturesLadderViewState copy(String rhsAccountNumber, UUID initialContractId, TopBarData topbar, LadderData ladder, BottomPanelData bottomPanel, SettingsBottomSheetData settingsData, LadderFtuxProgressState ftuxProgressState, Context loggingContext) {
        Intrinsics.checkNotNullParameter(initialContractId, "initialContractId");
        Intrinsics.checkNotNullParameter(topbar, "topbar");
        Intrinsics.checkNotNullParameter(bottomPanel, "bottomPanel");
        Intrinsics.checkNotNullParameter(loggingContext, "loggingContext");
        return new FuturesLadderViewState(rhsAccountNumber, initialContractId, topbar, ladder, bottomPanel, settingsData, ftuxProgressState, loggingContext);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FuturesLadderViewState)) {
            return false;
        }
        FuturesLadderViewState futuresLadderViewState = (FuturesLadderViewState) other;
        return Intrinsics.areEqual(this.rhsAccountNumber, futuresLadderViewState.rhsAccountNumber) && Intrinsics.areEqual(this.initialContractId, futuresLadderViewState.initialContractId) && Intrinsics.areEqual(this.topbar, futuresLadderViewState.topbar) && Intrinsics.areEqual(this.ladder, futuresLadderViewState.ladder) && Intrinsics.areEqual(this.bottomPanel, futuresLadderViewState.bottomPanel) && Intrinsics.areEqual(this.settingsData, futuresLadderViewState.settingsData) && Intrinsics.areEqual(this.ftuxProgressState, futuresLadderViewState.ftuxProgressState) && Intrinsics.areEqual(this.loggingContext, futuresLadderViewState.loggingContext);
    }

    public int hashCode() {
        String str = this.rhsAccountNumber;
        int iHashCode = (((((str == null ? 0 : str.hashCode()) * 31) + this.initialContractId.hashCode()) * 31) + this.topbar.hashCode()) * 31;
        LadderData ladderData = this.ladder;
        int iHashCode2 = (((iHashCode + (ladderData == null ? 0 : ladderData.hashCode())) * 31) + this.bottomPanel.hashCode()) * 31;
        SettingsBottomSheetData settingsBottomSheetData = this.settingsData;
        int iHashCode3 = (iHashCode2 + (settingsBottomSheetData == null ? 0 : settingsBottomSheetData.hashCode())) * 31;
        LadderFtuxProgressState ladderFtuxProgressState = this.ftuxProgressState;
        return ((iHashCode3 + (ladderFtuxProgressState != null ? ladderFtuxProgressState.hashCode() : 0)) * 31) + this.loggingContext.hashCode();
    }

    public String toString() {
        return "FuturesLadderViewState(rhsAccountNumber=" + this.rhsAccountNumber + ", initialContractId=" + this.initialContractId + ", topbar=" + this.topbar + ", ladder=" + this.ladder + ", bottomPanel=" + this.bottomPanel + ", settingsData=" + this.settingsData + ", ftuxProgressState=" + this.ftuxProgressState + ", loggingContext=" + this.loggingContext + ")";
    }

    public FuturesLadderViewState(String str, UUID initialContractId, TopBarData topbar, LadderData ladderData, BottomPanelData bottomPanel, SettingsBottomSheetData settingsBottomSheetData, LadderFtuxProgressState ladderFtuxProgressState, Context loggingContext) {
        Intrinsics.checkNotNullParameter(initialContractId, "initialContractId");
        Intrinsics.checkNotNullParameter(topbar, "topbar");
        Intrinsics.checkNotNullParameter(bottomPanel, "bottomPanel");
        Intrinsics.checkNotNullParameter(loggingContext, "loggingContext");
        this.rhsAccountNumber = str;
        this.initialContractId = initialContractId;
        this.topbar = topbar;
        this.ladder = ladderData;
        this.bottomPanel = bottomPanel;
        this.settingsData = settingsBottomSheetData;
        this.ftuxProgressState = ladderFtuxProgressState;
        this.loggingContext = loggingContext;
    }

    public final String getRhsAccountNumber() {
        return this.rhsAccountNumber;
    }

    public final UUID getInitialContractId() {
        return this.initialContractId;
    }

    public final TopBarData getTopbar() {
        return this.topbar;
    }

    public final LadderData getLadder() {
        return this.ladder;
    }

    public final BottomPanelData getBottomPanel() {
        return this.bottomPanel;
    }

    public final SettingsBottomSheetData getSettingsData() {
        return this.settingsData;
    }

    public final LadderFtuxProgressState getFtuxProgressState() {
        return this.ftuxProgressState;
    }

    public final Context getLoggingContext() {
        return this.loggingContext;
    }

    /* compiled from: FuturesLadderViewState.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001@By\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000b\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u000b¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0006HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u00101\u001a\u00020\u000bHÆ\u0003J\t\u00102\u001a\u00020\u0006HÆ\u0003J\u0010\u00103\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010#J\t\u00104\u001a\u00020\u0010HÆ\u0003J\t\u00105\u001a\u00020\u000bHÆ\u0003J\t\u00106\u001a\u00020\u000bHÆ\u0003J\t\u00107\u001a\u00020\u0006HÆ\u0003J\t\u00108\u001a\u00020\u000bHÆ\u0003J\u0098\u0001\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u000bHÆ\u0001¢\u0006\u0002\u0010:J\u0013\u0010;\u001a\u00020\u000b2\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010=\u001a\u00020\u000eHÖ\u0001J\t\u0010>\u001a\u00020?HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0011\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b'\u0010 R\u0011\u0010\u0012\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b(\u0010 R\u0011\u0010\u0013\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001bR\u0011\u0010\u0014\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010 R\u0011\u0010*\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b+\u0010 ¨\u0006A"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$TopBarData;", "", "contractId", "Ljava/util/UUID;", "futuresAccountId", "title", "Lcom/robinhood/utils/resource/StringResource;", "dayPL", "Ljava/math/BigDecimal;", "openPL", "hasPosition", "", "positionsDisplay", "pendingOrderQuantity", "", "flattenData", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$TopBarData$FlattenButtonData;", "showPnlPriceSwitcherTooltip", "hasOrdersForContract", "dayDeltaDisplay", "isDayDeltaUp", "<init>", "(Ljava/util/UUID;Ljava/util/UUID;Lcom/robinhood/utils/resource/StringResource;Ljava/math/BigDecimal;Ljava/math/BigDecimal;ZLcom/robinhood/utils/resource/StringResource;Ljava/lang/Integer;Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$TopBarData$FlattenButtonData;ZZLcom/robinhood/utils/resource/StringResource;Z)V", "getContractId", "()Ljava/util/UUID;", "getFuturesAccountId", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getDayPL", "()Ljava/math/BigDecimal;", "getOpenPL", "getHasPosition", "()Z", "getPositionsDisplay", "getPendingOrderQuantity", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getFlattenData", "()Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$TopBarData$FlattenButtonData;", "getShowPnlPriceSwitcherTooltip", "getHasOrdersForContract", "getDayDeltaDisplay", "canClickOnPendingOrders", "getCanClickOnPendingOrders", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/util/UUID;Ljava/util/UUID;Lcom/robinhood/utils/resource/StringResource;Ljava/math/BigDecimal;Ljava/math/BigDecimal;ZLcom/robinhood/utils/resource/StringResource;Ljava/lang/Integer;Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$TopBarData$FlattenButtonData;ZZLcom/robinhood/utils/resource/StringResource;Z)Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$TopBarData;", "equals", "other", "hashCode", "toString", "", "FlattenButtonData", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class TopBarData {
        public static final int $stable = 8;
        private final boolean canClickOnPendingOrders;
        private final UUID contractId;
        private final StringResource dayDeltaDisplay;
        private final BigDecimal dayPL;
        private final FlattenButtonData flattenData;
        private final UUID futuresAccountId;
        private final boolean hasOrdersForContract;
        private final boolean hasPosition;
        private final boolean isDayDeltaUp;
        private final BigDecimal openPL;
        private final Integer pendingOrderQuantity;
        private final StringResource positionsDisplay;
        private final boolean showPnlPriceSwitcherTooltip;
        private final StringResource title;

        public static /* synthetic */ TopBarData copy$default(TopBarData topBarData, UUID uuid, UUID uuid2, StringResource stringResource, BigDecimal bigDecimal, BigDecimal bigDecimal2, boolean z, StringResource stringResource2, Integer num, FlattenButtonData flattenButtonData, boolean z2, boolean z3, StringResource stringResource3, boolean z4, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = topBarData.contractId;
            }
            return topBarData.copy(uuid, (i & 2) != 0 ? topBarData.futuresAccountId : uuid2, (i & 4) != 0 ? topBarData.title : stringResource, (i & 8) != 0 ? topBarData.dayPL : bigDecimal, (i & 16) != 0 ? topBarData.openPL : bigDecimal2, (i & 32) != 0 ? topBarData.hasPosition : z, (i & 64) != 0 ? topBarData.positionsDisplay : stringResource2, (i & 128) != 0 ? topBarData.pendingOrderQuantity : num, (i & 256) != 0 ? topBarData.flattenData : flattenButtonData, (i & 512) != 0 ? topBarData.showPnlPriceSwitcherTooltip : z2, (i & 1024) != 0 ? topBarData.hasOrdersForContract : z3, (i & 2048) != 0 ? topBarData.dayDeltaDisplay : stringResource3, (i & 4096) != 0 ? topBarData.isDayDeltaUp : z4);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getContractId() {
            return this.contractId;
        }

        /* renamed from: component10, reason: from getter */
        public final boolean getShowPnlPriceSwitcherTooltip() {
            return this.showPnlPriceSwitcherTooltip;
        }

        /* renamed from: component11, reason: from getter */
        public final boolean getHasOrdersForContract() {
            return this.hasOrdersForContract;
        }

        /* renamed from: component12, reason: from getter */
        public final StringResource getDayDeltaDisplay() {
            return this.dayDeltaDisplay;
        }

        /* renamed from: component13, reason: from getter */
        public final boolean getIsDayDeltaUp() {
            return this.isDayDeltaUp;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getFuturesAccountId() {
            return this.futuresAccountId;
        }

        /* renamed from: component3, reason: from getter */
        public final StringResource getTitle() {
            return this.title;
        }

        /* renamed from: component4, reason: from getter */
        public final BigDecimal getDayPL() {
            return this.dayPL;
        }

        /* renamed from: component5, reason: from getter */
        public final BigDecimal getOpenPL() {
            return this.openPL;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getHasPosition() {
            return this.hasPosition;
        }

        /* renamed from: component7, reason: from getter */
        public final StringResource getPositionsDisplay() {
            return this.positionsDisplay;
        }

        /* renamed from: component8, reason: from getter */
        public final Integer getPendingOrderQuantity() {
            return this.pendingOrderQuantity;
        }

        /* renamed from: component9, reason: from getter */
        public final FlattenButtonData getFlattenData() {
            return this.flattenData;
        }

        public final TopBarData copy(UUID contractId, UUID futuresAccountId, StringResource title, BigDecimal dayPL, BigDecimal openPL, boolean hasPosition, StringResource positionsDisplay, Integer pendingOrderQuantity, FlattenButtonData flattenData, boolean showPnlPriceSwitcherTooltip, boolean hasOrdersForContract, StringResource dayDeltaDisplay, boolean isDayDeltaUp) {
            Intrinsics.checkNotNullParameter(contractId, "contractId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(positionsDisplay, "positionsDisplay");
            Intrinsics.checkNotNullParameter(flattenData, "flattenData");
            Intrinsics.checkNotNullParameter(dayDeltaDisplay, "dayDeltaDisplay");
            return new TopBarData(contractId, futuresAccountId, title, dayPL, openPL, hasPosition, positionsDisplay, pendingOrderQuantity, flattenData, showPnlPriceSwitcherTooltip, hasOrdersForContract, dayDeltaDisplay, isDayDeltaUp);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TopBarData)) {
                return false;
            }
            TopBarData topBarData = (TopBarData) other;
            return Intrinsics.areEqual(this.contractId, topBarData.contractId) && Intrinsics.areEqual(this.futuresAccountId, topBarData.futuresAccountId) && Intrinsics.areEqual(this.title, topBarData.title) && Intrinsics.areEqual(this.dayPL, topBarData.dayPL) && Intrinsics.areEqual(this.openPL, topBarData.openPL) && this.hasPosition == topBarData.hasPosition && Intrinsics.areEqual(this.positionsDisplay, topBarData.positionsDisplay) && Intrinsics.areEqual(this.pendingOrderQuantity, topBarData.pendingOrderQuantity) && Intrinsics.areEqual(this.flattenData, topBarData.flattenData) && this.showPnlPriceSwitcherTooltip == topBarData.showPnlPriceSwitcherTooltip && this.hasOrdersForContract == topBarData.hasOrdersForContract && Intrinsics.areEqual(this.dayDeltaDisplay, topBarData.dayDeltaDisplay) && this.isDayDeltaUp == topBarData.isDayDeltaUp;
        }

        public int hashCode() {
            int iHashCode = this.contractId.hashCode() * 31;
            UUID uuid = this.futuresAccountId;
            int iHashCode2 = (((iHashCode + (uuid == null ? 0 : uuid.hashCode())) * 31) + this.title.hashCode()) * 31;
            BigDecimal bigDecimal = this.dayPL;
            int iHashCode3 = (iHashCode2 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
            BigDecimal bigDecimal2 = this.openPL;
            int iHashCode4 = (((((iHashCode3 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31) + Boolean.hashCode(this.hasPosition)) * 31) + this.positionsDisplay.hashCode()) * 31;
            Integer num = this.pendingOrderQuantity;
            return ((((((((((iHashCode4 + (num != null ? num.hashCode() : 0)) * 31) + this.flattenData.hashCode()) * 31) + Boolean.hashCode(this.showPnlPriceSwitcherTooltip)) * 31) + Boolean.hashCode(this.hasOrdersForContract)) * 31) + this.dayDeltaDisplay.hashCode()) * 31) + Boolean.hashCode(this.isDayDeltaUp);
        }

        public String toString() {
            return "TopBarData(contractId=" + this.contractId + ", futuresAccountId=" + this.futuresAccountId + ", title=" + this.title + ", dayPL=" + this.dayPL + ", openPL=" + this.openPL + ", hasPosition=" + this.hasPosition + ", positionsDisplay=" + this.positionsDisplay + ", pendingOrderQuantity=" + this.pendingOrderQuantity + ", flattenData=" + this.flattenData + ", showPnlPriceSwitcherTooltip=" + this.showPnlPriceSwitcherTooltip + ", hasOrdersForContract=" + this.hasOrdersForContract + ", dayDeltaDisplay=" + this.dayDeltaDisplay + ", isDayDeltaUp=" + this.isDayDeltaUp + ")";
        }

        public TopBarData(UUID contractId, UUID uuid, StringResource title, BigDecimal bigDecimal, BigDecimal bigDecimal2, boolean z, StringResource positionsDisplay, Integer num, FlattenButtonData flattenData, boolean z2, boolean z3, StringResource dayDeltaDisplay, boolean z4) {
            Intrinsics.checkNotNullParameter(contractId, "contractId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(positionsDisplay, "positionsDisplay");
            Intrinsics.checkNotNullParameter(flattenData, "flattenData");
            Intrinsics.checkNotNullParameter(dayDeltaDisplay, "dayDeltaDisplay");
            this.contractId = contractId;
            this.futuresAccountId = uuid;
            this.title = title;
            this.dayPL = bigDecimal;
            this.openPL = bigDecimal2;
            this.hasPosition = z;
            this.positionsDisplay = positionsDisplay;
            this.pendingOrderQuantity = num;
            this.flattenData = flattenData;
            this.showPnlPriceSwitcherTooltip = z2;
            this.hasOrdersForContract = z3;
            this.dayDeltaDisplay = dayDeltaDisplay;
            this.isDayDeltaUp = z4;
            this.canClickOnPendingOrders = z3;
        }

        public /* synthetic */ TopBarData(UUID uuid, UUID uuid2, StringResource stringResource, BigDecimal bigDecimal, BigDecimal bigDecimal2, boolean z, StringResource stringResource2, Integer num, FlattenButtonData flattenButtonData, boolean z2, boolean z3, StringResource stringResource3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(uuid, (i & 2) != 0 ? null : uuid2, stringResource, bigDecimal, bigDecimal2, z, stringResource2, num, flattenButtonData, z2, z3, stringResource3, z4);
        }

        public final UUID getContractId() {
            return this.contractId;
        }

        public final UUID getFuturesAccountId() {
            return this.futuresAccountId;
        }

        public final StringResource getTitle() {
            return this.title;
        }

        public final BigDecimal getDayPL() {
            return this.dayPL;
        }

        public final BigDecimal getOpenPL() {
            return this.openPL;
        }

        public final boolean getHasPosition() {
            return this.hasPosition;
        }

        public final StringResource getPositionsDisplay() {
            return this.positionsDisplay;
        }

        public final Integer getPendingOrderQuantity() {
            return this.pendingOrderQuantity;
        }

        public final FlattenButtonData getFlattenData() {
            return this.flattenData;
        }

        public final boolean getShowPnlPriceSwitcherTooltip() {
            return this.showPnlPriceSwitcherTooltip;
        }

        public final boolean getHasOrdersForContract() {
            return this.hasOrdersForContract;
        }

        public final StringResource getDayDeltaDisplay() {
            return this.dayDeltaDisplay;
        }

        public final boolean isDayDeltaUp() {
            return this.isDayDeltaUp;
        }

        public final boolean getCanClickOnPendingOrders() {
            return this.canClickOnPendingOrders;
        }

        /* compiled from: FuturesLadderViewState.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J'\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$TopBarData$FlattenButtonData;", "", "isFlattenButtonVisible", "", "isFlattenButtonEnabled", "showFlattenOrdersTooltip", "<init>", "(ZZZ)V", "()Z", "getShowFlattenOrdersTooltip", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class FlattenButtonData {
            public static final int $stable = 0;
            private final boolean isFlattenButtonEnabled;
            private final boolean isFlattenButtonVisible;
            private final boolean showFlattenOrdersTooltip;

            public static /* synthetic */ FlattenButtonData copy$default(FlattenButtonData flattenButtonData, boolean z, boolean z2, boolean z3, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = flattenButtonData.isFlattenButtonVisible;
                }
                if ((i & 2) != 0) {
                    z2 = flattenButtonData.isFlattenButtonEnabled;
                }
                if ((i & 4) != 0) {
                    z3 = flattenButtonData.showFlattenOrdersTooltip;
                }
                return flattenButtonData.copy(z, z2, z3);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getIsFlattenButtonVisible() {
                return this.isFlattenButtonVisible;
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getIsFlattenButtonEnabled() {
                return this.isFlattenButtonEnabled;
            }

            /* renamed from: component3, reason: from getter */
            public final boolean getShowFlattenOrdersTooltip() {
                return this.showFlattenOrdersTooltip;
            }

            public final FlattenButtonData copy(boolean isFlattenButtonVisible, boolean isFlattenButtonEnabled, boolean showFlattenOrdersTooltip) {
                return new FlattenButtonData(isFlattenButtonVisible, isFlattenButtonEnabled, showFlattenOrdersTooltip);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof FlattenButtonData)) {
                    return false;
                }
                FlattenButtonData flattenButtonData = (FlattenButtonData) other;
                return this.isFlattenButtonVisible == flattenButtonData.isFlattenButtonVisible && this.isFlattenButtonEnabled == flattenButtonData.isFlattenButtonEnabled && this.showFlattenOrdersTooltip == flattenButtonData.showFlattenOrdersTooltip;
            }

            public int hashCode() {
                return (((Boolean.hashCode(this.isFlattenButtonVisible) * 31) + Boolean.hashCode(this.isFlattenButtonEnabled)) * 31) + Boolean.hashCode(this.showFlattenOrdersTooltip);
            }

            public String toString() {
                return "FlattenButtonData(isFlattenButtonVisible=" + this.isFlattenButtonVisible + ", isFlattenButtonEnabled=" + this.isFlattenButtonEnabled + ", showFlattenOrdersTooltip=" + this.showFlattenOrdersTooltip + ")";
            }

            public FlattenButtonData(boolean z, boolean z2, boolean z3) {
                this.isFlattenButtonVisible = z;
                this.isFlattenButtonEnabled = z2;
                this.showFlattenOrdersTooltip = z3;
            }

            public final boolean isFlattenButtonVisible() {
                return this.isFlattenButtonVisible;
            }

            public final boolean isFlattenButtonEnabled() {
                return this.isFlattenButtonEnabled;
            }

            public final boolean getShowFlattenOrdersTooltip() {
                return this.showFlattenOrdersTooltip;
            }
        }
    }

    /* compiled from: FuturesLadderViewState.kt */
    @Metadata(m3635d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0010\u000e\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001:\u0006opqrstBÝ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00110\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u000f\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001e\u0012\u0006\u0010!\u001a\u00020\"\u0012\u0006\u0010#\u001a\u00020$¢\u0006\u0004\b%\u0010&J\u000e\u0010O\u001a\u00020\u000f2\u0006\u0010P\u001a\u00020\u0007J\u000e\u0010Q\u001a\u00020\u000f2\u0006\u0010P\u001a\u00020\u0007J\u0016\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020\u00032\u0006\u0010P\u001a\u00020\u0007J\t\u0010U\u001a\u00020\u0003HÆ\u0003J\t\u0010V\u001a\u00020\u0005HÆ\u0003J\t\u0010W\u001a\u00020\u0007HÆ\u0003J\t\u0010X\u001a\u00020\tHÆ\u0003J\u0015\u0010Y\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\u0015\u0010Z\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\t\u0010[\u001a\u00020\u000fHÆ\u0003J\u0015\u0010\\\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00110\u000bHÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u0010\u0010_\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u00109J\u000b\u0010`\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\t\u0010b\u001a\u00020\u000fHÆ\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u001eHÆ\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u001eHÆ\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u001eHÆ\u0003J\t\u0010g\u001a\u00020\"HÆ\u0003J\t\u0010h\u001a\u00020$HÆ\u0003J\u008c\u0002\u0010i\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f0\u000b2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00110\u000b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u000f2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$HÆ\u0001¢\u0006\u0002\u0010jJ\u0013\u0010k\u001a\u00020\u000f2\b\u0010l\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010m\u001a\u00020\u0007HÖ\u0001J\t\u0010n\u001a\u00020SHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u001d\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b1\u00100R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u00102R\u001d\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00110\u000b¢\u0006\b\n\u0000\u001a\u0004\b3\u00100R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010:\u001a\u0004\b8\u00109R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0011\u0010\u001b\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b?\u00102R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b@\u0010.R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\b\n\u0000\u001a\u0004\bC\u0010BR\u0013\u0010 \u001a\u0004\u0018\u00010\u001e¢\u0006\b\n\u0000\u001a\u0004\bD\u0010BR\u0011\u0010!\u001a\u00020\"¢\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u0011\u0010#\u001a\u00020$¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0015\u0010I\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010:\u001a\u0004\bJ\u00109R\u001d\u0010K\u001a\u0004\u0018\u00010\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bL\u00109¨\u0006u"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$LadderData;", "", "ladderDisplayMode", "Lcom/robinhood/android/futures/trade/ui/ladder/LadderDisplayMode;", "ladderPriceLevels", "Lcom/robinhood/android/futures/trade/ui/ladder/LadderPriceLevels;", "lastPriceIndex", "", "lastPriceFloatingButtonLabel", "Lcom/robinhood/utils/resource/StringResource;", "visibleBidQuantityBars", "", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$LadderData$QuantityBar;", "visibleAskQuantityBars", "isDxExperiencingDataDegradation", "", "pendingOrders", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$LadderData$PendingOrderRow;", "selectedRow", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$LadderData$SelectedRow;", "selectedPendingOrders", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$LadderData$SelectedPendingOrders;", "orderDraggedOverIndex", "pendingOrderDragDirection", "Lcom/robinhood/android/futures/trade/ui/ladder/gestures/DragDirection;", "avgCostLineData", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$LadderData$AverageCostLineData;", "fadedOut", "zoomDisplay", "openPnlCostBasis", "Ljava/math/BigDecimal;", "positionQuantity", "multiplier", "quantityPanel", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$QuantityPanelData;", "marketClosedHeader", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$MarketClosedHeaderData;", "<init>", "(Lcom/robinhood/android/futures/trade/ui/ladder/LadderDisplayMode;Lcom/robinhood/android/futures/trade/ui/ladder/LadderPriceLevels;ILcom/robinhood/utils/resource/StringResource;Ljava/util/Map;Ljava/util/Map;ZLjava/util/Map;Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$LadderData$SelectedRow;Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$LadderData$SelectedPendingOrders;Ljava/lang/Integer;Lcom/robinhood/android/futures/trade/ui/ladder/gestures/DragDirection;Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$LadderData$AverageCostLineData;ZLcom/robinhood/utils/resource/StringResource;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$QuantityPanelData;Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$MarketClosedHeaderData;)V", "getLadderDisplayMode", "()Lcom/robinhood/android/futures/trade/ui/ladder/LadderDisplayMode;", "getLadderPriceLevels", "()Lcom/robinhood/android/futures/trade/ui/ladder/LadderPriceLevels;", "getLastPriceIndex", "()I", "getLastPriceFloatingButtonLabel", "()Lcom/robinhood/utils/resource/StringResource;", "getVisibleBidQuantityBars", "()Ljava/util/Map;", "getVisibleAskQuantityBars", "()Z", "getPendingOrders", "getSelectedRow", "()Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$LadderData$SelectedRow;", "getSelectedPendingOrders", "()Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$LadderData$SelectedPendingOrders;", "getOrderDraggedOverIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPendingOrderDragDirection", "()Lcom/robinhood/android/futures/trade/ui/ladder/gestures/DragDirection;", "getAvgCostLineData", "()Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$LadderData$AverageCostLineData;", "getFadedOut", "getZoomDisplay", "getOpenPnlCostBasis", "()Ljava/math/BigDecimal;", "getPositionQuantity", "getMultiplier", "getQuantityPanel", "()Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$QuantityPanelData;", "getMarketClosedHeader", "()Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$MarketClosedHeaderData;", "selectedPendingOrdersRowIndex", "getSelectedPendingOrdersRowIndex", "selectedPendingOrdersIndex", "getSelectedPendingOrdersIndex", "selectedPendingOrdersIndex$delegate", "Lkotlin/Lazy;", "isRowSelected", "rowIndex", "isRowFadedOut", "getRowDisplay", "", "displayMode", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "copy", "(Lcom/robinhood/android/futures/trade/ui/ladder/LadderDisplayMode;Lcom/robinhood/android/futures/trade/ui/ladder/LadderPriceLevels;ILcom/robinhood/utils/resource/StringResource;Ljava/util/Map;Ljava/util/Map;ZLjava/util/Map;Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$LadderData$SelectedRow;Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$LadderData$SelectedPendingOrders;Ljava/lang/Integer;Lcom/robinhood/android/futures/trade/ui/ladder/gestures/DragDirection;Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$LadderData$AverageCostLineData;ZLcom/robinhood/utils/resource/StringResource;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$QuantityPanelData;Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$MarketClosedHeaderData;)Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$LadderData;", "equals", "other", "hashCode", "toString", "AverageCostLineData", "QuantityBar", "PendingOrderRow", "UiPendingOrder", "SelectedPendingOrders", "SelectedRow", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final /* data */ class LadderData {
        public static final int $stable = 8;
        private final AverageCostLineData avgCostLineData;
        private final boolean fadedOut;
        private final boolean isDxExperiencingDataDegradation;
        private final FuturesLadderDataState2 ladderDisplayMode;
        private final LadderPriceLevels ladderPriceLevels;
        private final StringResource lastPriceFloatingButtonLabel;
        private final int lastPriceIndex;
        private final MarketClosedHeaderData marketClosedHeader;
        private final BigDecimal multiplier;
        private final BigDecimal openPnlCostBasis;
        private final Integer orderDraggedOverIndex;
        private final LadderCustomGestureDetector pendingOrderDragDirection;
        private final Map<Integer, PendingOrderRow> pendingOrders;
        private final BigDecimal positionQuantity;
        private final QuantityPanelData quantityPanel;
        private final SelectedPendingOrders selectedPendingOrders;

        /* renamed from: selectedPendingOrdersIndex$delegate, reason: from kotlin metadata */
        private final Lazy selectedPendingOrdersIndex;
        private final Integer selectedPendingOrdersRowIndex;
        private final SelectedRow selectedRow;
        private final Map<Integer, QuantityBar> visibleAskQuantityBars;
        private final Map<Integer, QuantityBar> visibleBidQuantityBars;
        private final StringResource zoomDisplay;

        /* compiled from: FuturesLadderViewState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[FuturesLadderDataState2.values().length];
                try {
                    iArr[FuturesLadderDataState2.PRICE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[FuturesLadderDataState2.PNL.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public static /* synthetic */ LadderData copy$default(LadderData ladderData, FuturesLadderDataState2 futuresLadderDataState2, LadderPriceLevels ladderPriceLevels, int i, StringResource stringResource, Map map, Map map2, boolean z, Map map3, SelectedRow selectedRow, SelectedPendingOrders selectedPendingOrders, Integer num, LadderCustomGestureDetector ladderCustomGestureDetector, AverageCostLineData averageCostLineData, boolean z2, StringResource stringResource2, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, QuantityPanelData quantityPanelData, MarketClosedHeaderData marketClosedHeaderData, int i2, Object obj) {
            MarketClosedHeaderData marketClosedHeaderData2;
            QuantityPanelData quantityPanelData2;
            FuturesLadderDataState2 futuresLadderDataState22 = (i2 & 1) != 0 ? ladderData.ladderDisplayMode : futuresLadderDataState2;
            LadderPriceLevels ladderPriceLevels2 = (i2 & 2) != 0 ? ladderData.ladderPriceLevels : ladderPriceLevels;
            int i3 = (i2 & 4) != 0 ? ladderData.lastPriceIndex : i;
            StringResource stringResource3 = (i2 & 8) != 0 ? ladderData.lastPriceFloatingButtonLabel : stringResource;
            Map map4 = (i2 & 16) != 0 ? ladderData.visibleBidQuantityBars : map;
            Map map5 = (i2 & 32) != 0 ? ladderData.visibleAskQuantityBars : map2;
            boolean z3 = (i2 & 64) != 0 ? ladderData.isDxExperiencingDataDegradation : z;
            Map map6 = (i2 & 128) != 0 ? ladderData.pendingOrders : map3;
            SelectedRow selectedRow2 = (i2 & 256) != 0 ? ladderData.selectedRow : selectedRow;
            SelectedPendingOrders selectedPendingOrders2 = (i2 & 512) != 0 ? ladderData.selectedPendingOrders : selectedPendingOrders;
            Integer num2 = (i2 & 1024) != 0 ? ladderData.orderDraggedOverIndex : num;
            LadderCustomGestureDetector ladderCustomGestureDetector2 = (i2 & 2048) != 0 ? ladderData.pendingOrderDragDirection : ladderCustomGestureDetector;
            AverageCostLineData averageCostLineData2 = (i2 & 4096) != 0 ? ladderData.avgCostLineData : averageCostLineData;
            boolean z4 = (i2 & 8192) != 0 ? ladderData.fadedOut : z2;
            FuturesLadderDataState2 futuresLadderDataState23 = futuresLadderDataState22;
            StringResource stringResource4 = (i2 & 16384) != 0 ? ladderData.zoomDisplay : stringResource2;
            BigDecimal bigDecimal4 = (i2 & 32768) != 0 ? ladderData.openPnlCostBasis : bigDecimal;
            BigDecimal bigDecimal5 = (i2 & 65536) != 0 ? ladderData.positionQuantity : bigDecimal2;
            BigDecimal bigDecimal6 = (i2 & 131072) != 0 ? ladderData.multiplier : bigDecimal3;
            QuantityPanelData quantityPanelData3 = (i2 & 262144) != 0 ? ladderData.quantityPanel : quantityPanelData;
            if ((i2 & 524288) != 0) {
                quantityPanelData2 = quantityPanelData3;
                marketClosedHeaderData2 = ladderData.marketClosedHeader;
            } else {
                marketClosedHeaderData2 = marketClosedHeaderData;
                quantityPanelData2 = quantityPanelData3;
            }
            return ladderData.copy(futuresLadderDataState23, ladderPriceLevels2, i3, stringResource3, map4, map5, z3, map6, selectedRow2, selectedPendingOrders2, num2, ladderCustomGestureDetector2, averageCostLineData2, z4, stringResource4, bigDecimal4, bigDecimal5, bigDecimal6, quantityPanelData2, marketClosedHeaderData2);
        }

        /* renamed from: component1, reason: from getter */
        public final FuturesLadderDataState2 getLadderDisplayMode() {
            return this.ladderDisplayMode;
        }

        /* renamed from: component10, reason: from getter */
        public final SelectedPendingOrders getSelectedPendingOrders() {
            return this.selectedPendingOrders;
        }

        /* renamed from: component11, reason: from getter */
        public final Integer getOrderDraggedOverIndex() {
            return this.orderDraggedOverIndex;
        }

        /* renamed from: component12, reason: from getter */
        public final LadderCustomGestureDetector getPendingOrderDragDirection() {
            return this.pendingOrderDragDirection;
        }

        /* renamed from: component13, reason: from getter */
        public final AverageCostLineData getAvgCostLineData() {
            return this.avgCostLineData;
        }

        /* renamed from: component14, reason: from getter */
        public final boolean getFadedOut() {
            return this.fadedOut;
        }

        /* renamed from: component15, reason: from getter */
        public final StringResource getZoomDisplay() {
            return this.zoomDisplay;
        }

        /* renamed from: component16, reason: from getter */
        public final BigDecimal getOpenPnlCostBasis() {
            return this.openPnlCostBasis;
        }

        /* renamed from: component17, reason: from getter */
        public final BigDecimal getPositionQuantity() {
            return this.positionQuantity;
        }

        /* renamed from: component18, reason: from getter */
        public final BigDecimal getMultiplier() {
            return this.multiplier;
        }

        /* renamed from: component19, reason: from getter */
        public final QuantityPanelData getQuantityPanel() {
            return this.quantityPanel;
        }

        /* renamed from: component2, reason: from getter */
        public final LadderPriceLevels getLadderPriceLevels() {
            return this.ladderPriceLevels;
        }

        /* renamed from: component20, reason: from getter */
        public final MarketClosedHeaderData getMarketClosedHeader() {
            return this.marketClosedHeader;
        }

        /* renamed from: component3, reason: from getter */
        public final int getLastPriceIndex() {
            return this.lastPriceIndex;
        }

        /* renamed from: component4, reason: from getter */
        public final StringResource getLastPriceFloatingButtonLabel() {
            return this.lastPriceFloatingButtonLabel;
        }

        public final Map<Integer, QuantityBar> component5() {
            return this.visibleBidQuantityBars;
        }

        public final Map<Integer, QuantityBar> component6() {
            return this.visibleAskQuantityBars;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getIsDxExperiencingDataDegradation() {
            return this.isDxExperiencingDataDegradation;
        }

        public final Map<Integer, PendingOrderRow> component8() {
            return this.pendingOrders;
        }

        /* renamed from: component9, reason: from getter */
        public final SelectedRow getSelectedRow() {
            return this.selectedRow;
        }

        public final LadderData copy(FuturesLadderDataState2 ladderDisplayMode, LadderPriceLevels ladderPriceLevels, int lastPriceIndex, StringResource lastPriceFloatingButtonLabel, Map<Integer, QuantityBar> visibleBidQuantityBars, Map<Integer, QuantityBar> visibleAskQuantityBars, boolean isDxExperiencingDataDegradation, Map<Integer, PendingOrderRow> pendingOrders, SelectedRow selectedRow, SelectedPendingOrders selectedPendingOrders, Integer orderDraggedOverIndex, LadderCustomGestureDetector pendingOrderDragDirection, AverageCostLineData avgCostLineData, boolean fadedOut, StringResource zoomDisplay, BigDecimal openPnlCostBasis, BigDecimal positionQuantity, BigDecimal multiplier, QuantityPanelData quantityPanel, MarketClosedHeaderData marketClosedHeader) {
            Intrinsics.checkNotNullParameter(ladderDisplayMode, "ladderDisplayMode");
            Intrinsics.checkNotNullParameter(ladderPriceLevels, "ladderPriceLevels");
            Intrinsics.checkNotNullParameter(lastPriceFloatingButtonLabel, "lastPriceFloatingButtonLabel");
            Intrinsics.checkNotNullParameter(visibleBidQuantityBars, "visibleBidQuantityBars");
            Intrinsics.checkNotNullParameter(visibleAskQuantityBars, "visibleAskQuantityBars");
            Intrinsics.checkNotNullParameter(pendingOrders, "pendingOrders");
            Intrinsics.checkNotNullParameter(quantityPanel, "quantityPanel");
            Intrinsics.checkNotNullParameter(marketClosedHeader, "marketClosedHeader");
            return new LadderData(ladderDisplayMode, ladderPriceLevels, lastPriceIndex, lastPriceFloatingButtonLabel, visibleBidQuantityBars, visibleAskQuantityBars, isDxExperiencingDataDegradation, pendingOrders, selectedRow, selectedPendingOrders, orderDraggedOverIndex, pendingOrderDragDirection, avgCostLineData, fadedOut, zoomDisplay, openPnlCostBasis, positionQuantity, multiplier, quantityPanel, marketClosedHeader);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LadderData)) {
                return false;
            }
            LadderData ladderData = (LadderData) other;
            return this.ladderDisplayMode == ladderData.ladderDisplayMode && Intrinsics.areEqual(this.ladderPriceLevels, ladderData.ladderPriceLevels) && this.lastPriceIndex == ladderData.lastPriceIndex && Intrinsics.areEqual(this.lastPriceFloatingButtonLabel, ladderData.lastPriceFloatingButtonLabel) && Intrinsics.areEqual(this.visibleBidQuantityBars, ladderData.visibleBidQuantityBars) && Intrinsics.areEqual(this.visibleAskQuantityBars, ladderData.visibleAskQuantityBars) && this.isDxExperiencingDataDegradation == ladderData.isDxExperiencingDataDegradation && Intrinsics.areEqual(this.pendingOrders, ladderData.pendingOrders) && Intrinsics.areEqual(this.selectedRow, ladderData.selectedRow) && Intrinsics.areEqual(this.selectedPendingOrders, ladderData.selectedPendingOrders) && Intrinsics.areEqual(this.orderDraggedOverIndex, ladderData.orderDraggedOverIndex) && this.pendingOrderDragDirection == ladderData.pendingOrderDragDirection && Intrinsics.areEqual(this.avgCostLineData, ladderData.avgCostLineData) && this.fadedOut == ladderData.fadedOut && Intrinsics.areEqual(this.zoomDisplay, ladderData.zoomDisplay) && Intrinsics.areEqual(this.openPnlCostBasis, ladderData.openPnlCostBasis) && Intrinsics.areEqual(this.positionQuantity, ladderData.positionQuantity) && Intrinsics.areEqual(this.multiplier, ladderData.multiplier) && Intrinsics.areEqual(this.quantityPanel, ladderData.quantityPanel) && Intrinsics.areEqual(this.marketClosedHeader, ladderData.marketClosedHeader);
        }

        public int hashCode() {
            int iHashCode = ((((((((((((((this.ladderDisplayMode.hashCode() * 31) + this.ladderPriceLevels.hashCode()) * 31) + Integer.hashCode(this.lastPriceIndex)) * 31) + this.lastPriceFloatingButtonLabel.hashCode()) * 31) + this.visibleBidQuantityBars.hashCode()) * 31) + this.visibleAskQuantityBars.hashCode()) * 31) + Boolean.hashCode(this.isDxExperiencingDataDegradation)) * 31) + this.pendingOrders.hashCode()) * 31;
            SelectedRow selectedRow = this.selectedRow;
            int iHashCode2 = (iHashCode + (selectedRow == null ? 0 : selectedRow.hashCode())) * 31;
            SelectedPendingOrders selectedPendingOrders = this.selectedPendingOrders;
            int iHashCode3 = (iHashCode2 + (selectedPendingOrders == null ? 0 : selectedPendingOrders.hashCode())) * 31;
            Integer num = this.orderDraggedOverIndex;
            int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
            LadderCustomGestureDetector ladderCustomGestureDetector = this.pendingOrderDragDirection;
            int iHashCode5 = (iHashCode4 + (ladderCustomGestureDetector == null ? 0 : ladderCustomGestureDetector.hashCode())) * 31;
            AverageCostLineData averageCostLineData = this.avgCostLineData;
            int iHashCode6 = (((iHashCode5 + (averageCostLineData == null ? 0 : averageCostLineData.hashCode())) * 31) + Boolean.hashCode(this.fadedOut)) * 31;
            StringResource stringResource = this.zoomDisplay;
            int iHashCode7 = (iHashCode6 + (stringResource == null ? 0 : stringResource.hashCode())) * 31;
            BigDecimal bigDecimal = this.openPnlCostBasis;
            int iHashCode8 = (iHashCode7 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
            BigDecimal bigDecimal2 = this.positionQuantity;
            int iHashCode9 = (iHashCode8 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
            BigDecimal bigDecimal3 = this.multiplier;
            return ((((iHashCode9 + (bigDecimal3 != null ? bigDecimal3.hashCode() : 0)) * 31) + this.quantityPanel.hashCode()) * 31) + this.marketClosedHeader.hashCode();
        }

        public String toString() {
            return "LadderData(ladderDisplayMode=" + this.ladderDisplayMode + ", ladderPriceLevels=" + this.ladderPriceLevels + ", lastPriceIndex=" + this.lastPriceIndex + ", lastPriceFloatingButtonLabel=" + this.lastPriceFloatingButtonLabel + ", visibleBidQuantityBars=" + this.visibleBidQuantityBars + ", visibleAskQuantityBars=" + this.visibleAskQuantityBars + ", isDxExperiencingDataDegradation=" + this.isDxExperiencingDataDegradation + ", pendingOrders=" + this.pendingOrders + ", selectedRow=" + this.selectedRow + ", selectedPendingOrders=" + this.selectedPendingOrders + ", orderDraggedOverIndex=" + this.orderDraggedOverIndex + ", pendingOrderDragDirection=" + this.pendingOrderDragDirection + ", avgCostLineData=" + this.avgCostLineData + ", fadedOut=" + this.fadedOut + ", zoomDisplay=" + this.zoomDisplay + ", openPnlCostBasis=" + this.openPnlCostBasis + ", positionQuantity=" + this.positionQuantity + ", multiplier=" + this.multiplier + ", quantityPanel=" + this.quantityPanel + ", marketClosedHeader=" + this.marketClosedHeader + ")";
        }

        public LadderData(FuturesLadderDataState2 ladderDisplayMode, LadderPriceLevels ladderPriceLevels, int i, StringResource lastPriceFloatingButtonLabel, Map<Integer, QuantityBar> visibleBidQuantityBars, Map<Integer, QuantityBar> visibleAskQuantityBars, boolean z, Map<Integer, PendingOrderRow> pendingOrders, SelectedRow selectedRow, SelectedPendingOrders selectedPendingOrders, Integer num, LadderCustomGestureDetector ladderCustomGestureDetector, AverageCostLineData averageCostLineData, boolean z2, StringResource stringResource, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, QuantityPanelData quantityPanel, MarketClosedHeaderData marketClosedHeader) {
            Intrinsics.checkNotNullParameter(ladderDisplayMode, "ladderDisplayMode");
            Intrinsics.checkNotNullParameter(ladderPriceLevels, "ladderPriceLevels");
            Intrinsics.checkNotNullParameter(lastPriceFloatingButtonLabel, "lastPriceFloatingButtonLabel");
            Intrinsics.checkNotNullParameter(visibleBidQuantityBars, "visibleBidQuantityBars");
            Intrinsics.checkNotNullParameter(visibleAskQuantityBars, "visibleAskQuantityBars");
            Intrinsics.checkNotNullParameter(pendingOrders, "pendingOrders");
            Intrinsics.checkNotNullParameter(quantityPanel, "quantityPanel");
            Intrinsics.checkNotNullParameter(marketClosedHeader, "marketClosedHeader");
            this.ladderDisplayMode = ladderDisplayMode;
            this.ladderPriceLevels = ladderPriceLevels;
            this.lastPriceIndex = i;
            this.lastPriceFloatingButtonLabel = lastPriceFloatingButtonLabel;
            this.visibleBidQuantityBars = visibleBidQuantityBars;
            this.visibleAskQuantityBars = visibleAskQuantityBars;
            this.isDxExperiencingDataDegradation = z;
            this.pendingOrders = pendingOrders;
            this.selectedRow = selectedRow;
            this.selectedPendingOrders = selectedPendingOrders;
            this.orderDraggedOverIndex = num;
            this.pendingOrderDragDirection = ladderCustomGestureDetector;
            this.avgCostLineData = averageCostLineData;
            this.fadedOut = z2;
            this.zoomDisplay = stringResource;
            this.openPnlCostBasis = bigDecimal;
            this.positionQuantity = bigDecimal2;
            this.multiplier = bigDecimal3;
            this.quantityPanel = quantityPanel;
            this.marketClosedHeader = marketClosedHeader;
            this.selectedPendingOrdersRowIndex = selectedPendingOrders != null ? Integer.valueOf(selectedPendingOrders.getRowIndex()) : null;
            this.selectedPendingOrdersIndex = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderViewState$LadderData$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FuturesLadderViewState.LadderData.selectedPendingOrdersIndex_delegate$lambda$2(this.f$0);
                }
            });
        }

        public final FuturesLadderDataState2 getLadderDisplayMode() {
            return this.ladderDisplayMode;
        }

        public final LadderPriceLevels getLadderPriceLevels() {
            return this.ladderPriceLevels;
        }

        public final int getLastPriceIndex() {
            return this.lastPriceIndex;
        }

        public final StringResource getLastPriceFloatingButtonLabel() {
            return this.lastPriceFloatingButtonLabel;
        }

        public final Map<Integer, QuantityBar> getVisibleBidQuantityBars() {
            return this.visibleBidQuantityBars;
        }

        public final Map<Integer, QuantityBar> getVisibleAskQuantityBars() {
            return this.visibleAskQuantityBars;
        }

        public final boolean isDxExperiencingDataDegradation() {
            return this.isDxExperiencingDataDegradation;
        }

        public final Map<Integer, PendingOrderRow> getPendingOrders() {
            return this.pendingOrders;
        }

        public final SelectedRow getSelectedRow() {
            return this.selectedRow;
        }

        public final SelectedPendingOrders getSelectedPendingOrders() {
            return this.selectedPendingOrders;
        }

        public final Integer getOrderDraggedOverIndex() {
            return this.orderDraggedOverIndex;
        }

        public final LadderCustomGestureDetector getPendingOrderDragDirection() {
            return this.pendingOrderDragDirection;
        }

        public final AverageCostLineData getAvgCostLineData() {
            return this.avgCostLineData;
        }

        public final boolean getFadedOut() {
            return this.fadedOut;
        }

        public final StringResource getZoomDisplay() {
            return this.zoomDisplay;
        }

        public final BigDecimal getOpenPnlCostBasis() {
            return this.openPnlCostBasis;
        }

        public final BigDecimal getPositionQuantity() {
            return this.positionQuantity;
        }

        public final BigDecimal getMultiplier() {
            return this.multiplier;
        }

        public final QuantityPanelData getQuantityPanel() {
            return this.quantityPanel;
        }

        public final MarketClosedHeaderData getMarketClosedHeader() {
            return this.marketClosedHeader;
        }

        public final Integer getSelectedPendingOrdersRowIndex() {
            return this.selectedPendingOrdersRowIndex;
        }

        public final Integer getSelectedPendingOrdersIndex() {
            return (Integer) this.selectedPendingOrdersIndex.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Integer selectedPendingOrdersIndex_delegate$lambda$2(LadderData ladderData) {
            PendingOrderRow pendingOrderRow;
            PendingOrderRow.Group sells;
            if (ladderData.selectedPendingOrders == null || (pendingOrderRow = ladderData.pendingOrders.get(ladderData.selectedPendingOrdersRowIndex)) == null) {
                return null;
            }
            if (ladderData.selectedPendingOrders.getSide() == FuturesOrderSide.BUY) {
                sells = pendingOrderRow.getBuys();
            } else {
                sells = pendingOrderRow.getSells();
            }
            if (sells == null) {
                return null;
            }
            SelectedPendingOrders selectedPendingOrders = ladderData.selectedPendingOrders;
            if (!(selectedPendingOrders instanceof SelectedPendingOrders.Single)) {
                if (selectedPendingOrders instanceof SelectedPendingOrders.Group) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
            Iterator<UiPendingOrder> it = sells.getOrders().iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (Intrinsics.areEqual(it.next().getId(), ((SelectedPendingOrders.Single) ladderData.selectedPendingOrders).getOrderId())) {
                    break;
                }
                i++;
            }
            Integer numValueOf = Integer.valueOf(i);
            if (numValueOf.intValue() != -1) {
                return numValueOf;
            }
            return null;
        }

        public final boolean isRowSelected(int rowIndex) {
            SelectedRow selectedRow = this.selectedRow;
            return selectedRow != null && selectedRow.getIndex() == rowIndex;
        }

        public final boolean isRowFadedOut(int rowIndex) {
            if (!this.fadedOut) {
                return false;
            }
            Integer num = this.orderDraggedOverIndex;
            return num == null || num.intValue() != rowIndex;
        }

        public final String getRowDisplay(FuturesLadderDataState2 displayMode, int rowIndex) {
            Intrinsics.checkNotNullParameter(displayMode, "displayMode");
            int i = WhenMappings.$EnumSwitchMapping$0[displayMode.ordinal()];
            if (i == 1) {
                return this.ladderPriceLevels.getPriceDisplay(rowIndex);
            }
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            BigDecimal bigDecimalComputePnl = FuturesPnLHelper.computePnl(this.multiplier, this.openPnlCostBasis, this.ladderPriceLevels.getPrice(rowIndex), this.positionQuantity);
            if (bigDecimalComputePnl == null) {
                bigDecimalComputePnl = BigDecimal.ZERO;
            }
            return Moneys.formatDeltaCurrency$default(bigDecimalComputePnl, null, 1, null);
        }

        /* compiled from: FuturesLadderViewState.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$LadderData$AverageCostLineData;", "", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "offsetMultiplier", "", "<init>", "(IF)V", "getIndex", "()I", "getOffsetMultiplier", "()F", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class AverageCostLineData {
            public static final int $stable = 0;
            private final int index;
            private final float offsetMultiplier;

            public static /* synthetic */ AverageCostLineData copy$default(AverageCostLineData averageCostLineData, int i, float f, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = averageCostLineData.index;
                }
                if ((i2 & 2) != 0) {
                    f = averageCostLineData.offsetMultiplier;
                }
                return averageCostLineData.copy(i, f);
            }

            /* renamed from: component1, reason: from getter */
            public final int getIndex() {
                return this.index;
            }

            /* renamed from: component2, reason: from getter */
            public final float getOffsetMultiplier() {
                return this.offsetMultiplier;
            }

            public final AverageCostLineData copy(int index, float offsetMultiplier) {
                return new AverageCostLineData(index, offsetMultiplier);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AverageCostLineData)) {
                    return false;
                }
                AverageCostLineData averageCostLineData = (AverageCostLineData) other;
                return this.index == averageCostLineData.index && Float.compare(this.offsetMultiplier, averageCostLineData.offsetMultiplier) == 0;
            }

            public int hashCode() {
                return (Integer.hashCode(this.index) * 31) + Float.hashCode(this.offsetMultiplier);
            }

            public String toString() {
                return "AverageCostLineData(index=" + this.index + ", offsetMultiplier=" + this.offsetMultiplier + ")";
            }

            public AverageCostLineData(int i, float f) {
                this.index = i;
                this.offsetMultiplier = f;
            }

            public final int getIndex() {
                return this.index;
            }

            public final float getOffsetMultiplier() {
                return this.offsetMultiplier;
            }
        }

        /* compiled from: FuturesLadderViewState.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÂ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$LadderData$QuantityBar;", "", "side", "Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;", "quantity", "", "quantityFraction", "", "alpha", "<init>", "(Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;IFF)V", "getSide", "()Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;", "getQuantity", "()I", "getAlpha", "()F", "uiScaledQuantityFraction", "getUiScaledQuantityFraction", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class QuantityBar {
            public static final int $stable = 0;
            private final float alpha;
            private final int quantity;
            private final float quantityFraction;
            private final FuturesOrderSide side;
            private final float uiScaledQuantityFraction;

            /* renamed from: component3, reason: from getter */
            private final float getQuantityFraction() {
                return this.quantityFraction;
            }

            public static /* synthetic */ QuantityBar copy$default(QuantityBar quantityBar, FuturesOrderSide futuresOrderSide, int i, float f, float f2, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    futuresOrderSide = quantityBar.side;
                }
                if ((i2 & 2) != 0) {
                    i = quantityBar.quantity;
                }
                if ((i2 & 4) != 0) {
                    f = quantityBar.quantityFraction;
                }
                if ((i2 & 8) != 0) {
                    f2 = quantityBar.alpha;
                }
                return quantityBar.copy(futuresOrderSide, i, f, f2);
            }

            /* renamed from: component1, reason: from getter */
            public final FuturesOrderSide getSide() {
                return this.side;
            }

            /* renamed from: component2, reason: from getter */
            public final int getQuantity() {
                return this.quantity;
            }

            /* renamed from: component4, reason: from getter */
            public final float getAlpha() {
                return this.alpha;
            }

            public final QuantityBar copy(FuturesOrderSide side, int quantity, float quantityFraction, float alpha) {
                Intrinsics.checkNotNullParameter(side, "side");
                return new QuantityBar(side, quantity, quantityFraction, alpha);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof QuantityBar)) {
                    return false;
                }
                QuantityBar quantityBar = (QuantityBar) other;
                return this.side == quantityBar.side && this.quantity == quantityBar.quantity && Float.compare(this.quantityFraction, quantityBar.quantityFraction) == 0 && Float.compare(this.alpha, quantityBar.alpha) == 0;
            }

            public int hashCode() {
                return (((((this.side.hashCode() * 31) + Integer.hashCode(this.quantity)) * 31) + Float.hashCode(this.quantityFraction)) * 31) + Float.hashCode(this.alpha);
            }

            public String toString() {
                return "QuantityBar(side=" + this.side + ", quantity=" + this.quantity + ", quantityFraction=" + this.quantityFraction + ", alpha=" + this.alpha + ")";
            }

            public QuantityBar(FuturesOrderSide side, int i, float f, float f2) {
                Intrinsics.checkNotNullParameter(side, "side");
                this.side = side;
                this.quantity = i;
                this.quantityFraction = f;
                this.alpha = f2;
                this.uiScaledQuantityFraction = f * 0.75f;
            }

            public final FuturesOrderSide getSide() {
                return this.side;
            }

            public final int getQuantity() {
                return this.quantity;
            }

            public final float getAlpha() {
                return this.alpha;
            }

            public final float getUiScaledQuantityFraction() {
                return this.uiScaledQuantityFraction;
            }
        }

        /* compiled from: FuturesLadderViewState.kt */
        @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0014B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$LadderData$PendingOrderRow;", "", "buys", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$LadderData$PendingOrderRow$Group;", "sells", "<init>", "(Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$LadderData$PendingOrderRow$Group;Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$LadderData$PendingOrderRow$Group;)V", "getBuys", "()Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$LadderData$PendingOrderRow$Group;", "getSells", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Group", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class PendingOrderRow {
            public static final int $stable = 0;
            private final Group buys;
            private final Group sells;

            public static /* synthetic */ PendingOrderRow copy$default(PendingOrderRow pendingOrderRow, Group group, Group group2, int i, Object obj) {
                if ((i & 1) != 0) {
                    group = pendingOrderRow.buys;
                }
                if ((i & 2) != 0) {
                    group2 = pendingOrderRow.sells;
                }
                return pendingOrderRow.copy(group, group2);
            }

            /* renamed from: component1, reason: from getter */
            public final Group getBuys() {
                return this.buys;
            }

            /* renamed from: component2, reason: from getter */
            public final Group getSells() {
                return this.sells;
            }

            public final PendingOrderRow copy(Group buys, Group sells) {
                return new PendingOrderRow(buys, sells);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PendingOrderRow)) {
                    return false;
                }
                PendingOrderRow pendingOrderRow = (PendingOrderRow) other;
                return Intrinsics.areEqual(this.buys, pendingOrderRow.buys) && Intrinsics.areEqual(this.sells, pendingOrderRow.sells);
            }

            public int hashCode() {
                Group group = this.buys;
                int iHashCode = (group == null ? 0 : group.hashCode()) * 31;
                Group group2 = this.sells;
                return iHashCode + (group2 != null ? group2.hashCode() : 0);
            }

            public String toString() {
                return "PendingOrderRow(buys=" + this.buys + ", sells=" + this.sells + ")";
            }

            public PendingOrderRow(Group group, Group group2) {
                this.buys = group;
                this.sells = group2;
            }

            public final Group getBuys() {
                return this.buys;
            }

            public final Group getSells() {
                return this.sells;
            }

            /* compiled from: FuturesLadderViewState.kt */
            @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB%\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$LadderData$PendingOrderRow$Group;", "", "orders", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$LadderData$UiPendingOrder;", "groupLabel", "Lcom/robinhood/utils/resource/StringResource;", "offscreenLabel", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;)V", "getOrders", "()Lkotlinx/collections/immutable/ImmutableList;", "getGroupLabel", "()Lcom/robinhood/utils/resource/StringResource;", "getOffscreenLabel", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final /* data */ class Group {
                public static final int $stable = 0;

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private final StringResource groupLabel;
                private final StringResource offscreenLabel;
                private final ImmutableList<UiPendingOrder> orders;

                /* JADX WARN: Multi-variable type inference failed */
                public static /* synthetic */ Group copy$default(Group group, ImmutableList immutableList, StringResource stringResource, StringResource stringResource2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        immutableList = group.orders;
                    }
                    if ((i & 2) != 0) {
                        stringResource = group.groupLabel;
                    }
                    if ((i & 4) != 0) {
                        stringResource2 = group.offscreenLabel;
                    }
                    return group.copy(immutableList, stringResource, stringResource2);
                }

                public final ImmutableList<UiPendingOrder> component1() {
                    return this.orders;
                }

                /* renamed from: component2, reason: from getter */
                public final StringResource getGroupLabel() {
                    return this.groupLabel;
                }

                /* renamed from: component3, reason: from getter */
                public final StringResource getOffscreenLabel() {
                    return this.offscreenLabel;
                }

                public final Group copy(ImmutableList<UiPendingOrder> orders, StringResource groupLabel, StringResource offscreenLabel) {
                    Intrinsics.checkNotNullParameter(orders, "orders");
                    Intrinsics.checkNotNullParameter(groupLabel, "groupLabel");
                    Intrinsics.checkNotNullParameter(offscreenLabel, "offscreenLabel");
                    return new Group(orders, groupLabel, offscreenLabel);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Group)) {
                        return false;
                    }
                    Group group = (Group) other;
                    return Intrinsics.areEqual(this.orders, group.orders) && Intrinsics.areEqual(this.groupLabel, group.groupLabel) && Intrinsics.areEqual(this.offscreenLabel, group.offscreenLabel);
                }

                public int hashCode() {
                    return (((this.orders.hashCode() * 31) + this.groupLabel.hashCode()) * 31) + this.offscreenLabel.hashCode();
                }

                public String toString() {
                    return "Group(orders=" + this.orders + ", groupLabel=" + this.groupLabel + ", offscreenLabel=" + this.offscreenLabel + ")";
                }

                public Group(ImmutableList<UiPendingOrder> orders, StringResource groupLabel, StringResource offscreenLabel) {
                    Intrinsics.checkNotNullParameter(orders, "orders");
                    Intrinsics.checkNotNullParameter(groupLabel, "groupLabel");
                    Intrinsics.checkNotNullParameter(offscreenLabel, "offscreenLabel");
                    this.orders = orders;
                    this.groupLabel = groupLabel;
                    this.offscreenLabel = offscreenLabel;
                }

                public final ImmutableList<UiPendingOrder> getOrders() {
                    return this.orders;
                }

                public final StringResource getGroupLabel() {
                    return this.groupLabel;
                }

                public final StringResource getOffscreenLabel() {
                    return this.offscreenLabel;
                }

                /* compiled from: FuturesLadderViewState.kt */
                @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$LadderData$PendingOrderRow$Group$Companion;", "", "<init>", "()V", "from", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$LadderData$PendingOrderRow$Group;", "rowIndex", "", "side", "Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;", "allOrders", "", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderDataState$PendingOrder;", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    private Companion() {
                    }

                    public final Group from(int rowIndex, FuturesOrderSide side, List<? extends FuturesLadderDataState.PendingOrder> allOrders) {
                        Intrinsics.checkNotNullParameter(side, "side");
                        List<? extends FuturesLadderDataState.PendingOrder> list = allOrders;
                        if (list == null || list.isEmpty()) {
                            return null;
                        }
                        FutureOrders2 orderPillGroupLabel = FutureOrders.getOrderPillGroupLabel(side, allOrders);
                        ArrayList arrayList = new ArrayList();
                        Iterator<T> it = allOrders.iterator();
                        while (it.hasNext()) {
                            UiPendingOrder uiPendingOrderFrom = UiPendingOrder.INSTANCE.from(rowIndex, (FuturesLadderDataState.PendingOrder) it.next());
                            if (uiPendingOrderFrom != null) {
                                arrayList.add(uiPendingOrderFrom);
                            }
                        }
                        return new Group(extensions2.toImmutableList(CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderViewState$LadderData$PendingOrderRow$Group$Companion$from$$inlined$sortedBy$1
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // java.util.Comparator
                            public final int compare(T t, T t2) {
                                return ComparisonsKt.compareValues(Boolean.valueOf(!((FuturesLadderViewState.LadderData.UiPendingOrder) t).isPlaceholder()), Boolean.valueOf(!((FuturesLadderViewState.LadderData.UiPendingOrder) t2).isPlaceholder()));
                            }
                        })), orderPillGroupLabel.getOnScreenLabel(), orderPillGroupLabel.getOffscreenLabel());
                    }
                }
            }
        }

        /* compiled from: FuturesLadderViewState.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\u000bHÆ\u0003J;\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u000b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0016¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$LadderData$UiPendingOrder;", "", "id", "Ljava/util/UUID;", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "side", "Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;", AnnotatedPrivateKey.LABEL, "Lcom/robinhood/utils/resource/StringResource;", "isPlaceholder", "", "<init>", "(Ljava/util/UUID;ILcom/robinhood/android/models/futures/api/order/FuturesOrderSide;Lcom/robinhood/utils/resource/StringResource;Z)V", "getId", "()Ljava/util/UUID;", "getIndex", "()I", "getSide", "()Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;", "getLabel", "()Lcom/robinhood/utils/resource/StringResource;", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "", "Companion", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class UiPendingOrder {
            private final UUID id;
            private final int index;
            private final boolean isPlaceholder;
            private final StringResource label;
            private final FuturesOrderSide side;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            public static final int $stable = 8;

            public static /* synthetic */ UiPendingOrder copy$default(UiPendingOrder uiPendingOrder, UUID uuid, int i, FuturesOrderSide futuresOrderSide, StringResource stringResource, boolean z, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    uuid = uiPendingOrder.id;
                }
                if ((i2 & 2) != 0) {
                    i = uiPendingOrder.index;
                }
                if ((i2 & 4) != 0) {
                    futuresOrderSide = uiPendingOrder.side;
                }
                if ((i2 & 8) != 0) {
                    stringResource = uiPendingOrder.label;
                }
                if ((i2 & 16) != 0) {
                    z = uiPendingOrder.isPlaceholder;
                }
                boolean z2 = z;
                FuturesOrderSide futuresOrderSide2 = futuresOrderSide;
                return uiPendingOrder.copy(uuid, i, futuresOrderSide2, stringResource, z2);
            }

            /* renamed from: component1, reason: from getter */
            public final UUID getId() {
                return this.id;
            }

            /* renamed from: component2, reason: from getter */
            public final int getIndex() {
                return this.index;
            }

            /* renamed from: component3, reason: from getter */
            public final FuturesOrderSide getSide() {
                return this.side;
            }

            /* renamed from: component4, reason: from getter */
            public final StringResource getLabel() {
                return this.label;
            }

            /* renamed from: component5, reason: from getter */
            public final boolean getIsPlaceholder() {
                return this.isPlaceholder;
            }

            public final UiPendingOrder copy(UUID id, int index, FuturesOrderSide side, StringResource label, boolean isPlaceholder) {
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(side, "side");
                Intrinsics.checkNotNullParameter(label, "label");
                return new UiPendingOrder(id, index, side, label, isPlaceholder);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof UiPendingOrder)) {
                    return false;
                }
                UiPendingOrder uiPendingOrder = (UiPendingOrder) other;
                return Intrinsics.areEqual(this.id, uiPendingOrder.id) && this.index == uiPendingOrder.index && this.side == uiPendingOrder.side && Intrinsics.areEqual(this.label, uiPendingOrder.label) && this.isPlaceholder == uiPendingOrder.isPlaceholder;
            }

            public int hashCode() {
                return (((((((this.id.hashCode() * 31) + Integer.hashCode(this.index)) * 31) + this.side.hashCode()) * 31) + this.label.hashCode()) * 31) + Boolean.hashCode(this.isPlaceholder);
            }

            public String toString() {
                return "UiPendingOrder(id=" + this.id + ", index=" + this.index + ", side=" + this.side + ", label=" + this.label + ", isPlaceholder=" + this.isPlaceholder + ")";
            }

            public UiPendingOrder(UUID id, int i, FuturesOrderSide side, StringResource label, boolean z) {
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(side, "side");
                Intrinsics.checkNotNullParameter(label, "label");
                this.id = id;
                this.index = i;
                this.side = side;
                this.label = label;
                this.isPlaceholder = z;
            }

            public final UUID getId() {
                return this.id;
            }

            public final int getIndex() {
                return this.index;
            }

            public final FuturesOrderSide getSide() {
                return this.side;
            }

            public final StringResource getLabel() {
                return this.label;
            }

            public final boolean isPlaceholder() {
                return this.isPlaceholder;
            }

            /* compiled from: FuturesLadderViewState.kt */
            @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0004\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\tJ1\u0010\u0004\u001a\u0004\u0018\u00010\u0005*\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00052\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\u0018\u0010\r\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$LadderData$UiPendingOrder$Companion;", "", "<init>", "()V", "nextIndex", "", "", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$LadderData$UiPendingOrder;", "currentIndex", "(Ljava/util/List;Ljava/lang/Integer;)I", "skipIndices", "", "(Ljava/util/List;Ljava/lang/Integer;Ljava/util/Set;)Ljava/lang/Integer;", "from", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "pendingOrder", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderDataState$PendingOrder;", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final int nextIndex(List<UiPendingOrder> list, Integer num) {
                    Intrinsics.checkNotNullParameter(list, "<this>");
                    if (num == null) {
                        return 0;
                    }
                    return (num.intValue() + 1) % list.size();
                }

                public final Integer nextIndex(List<UiPendingOrder> list, Integer num, Set<Integer> set) {
                    Integer num2;
                    Integer next;
                    Intrinsics.checkNotNullParameter(list, "<this>");
                    int iNextIndex = nextIndex(list, num);
                    Set<Integer> set2 = set;
                    if (set2 == null || set2.isEmpty()) {
                        return Integer.valueOf(iNextIndex);
                    }
                    Iterator<Integer> it = RangesKt.until(iNextIndex, list.size()).iterator();
                    while (true) {
                        num2 = null;
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (!set.contains(Integer.valueOf(next.intValue()))) {
                            break;
                        }
                    }
                    Integer num3 = next;
                    if (num3 != null) {
                        return num3;
                    }
                    Iterator<Integer> it2 = RangesKt.until(0, iNextIndex).iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Integer next2 = it2.next();
                        if (!set.contains(Integer.valueOf(next2.intValue()))) {
                            num2 = next2;
                            break;
                        }
                    }
                    return num2;
                }

                public final UiPendingOrder from(int index, FuturesLadderDataState.PendingOrder pendingOrder) {
                    Intrinsics.checkNotNullParameter(pendingOrder, "pendingOrder");
                    StringResource orderPillLabel = FutureOrders.getOrderPillLabel(pendingOrder.getSide(), pendingOrder.getQuantity(), pendingOrder.getOrderType(), pendingOrder.getOrderTrigger());
                    if (orderPillLabel == null) {
                        return null;
                    }
                    return new UiPendingOrder(pendingOrder.getId(), index, pendingOrder.getSide(), orderPillLabel, pendingOrder.getIsPlaceholder());
                }
            }
        }

        /* compiled from: FuturesLadderViewState.kt */
        @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u001a\u001bR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\u0082\u0001\u0002\u001c\u001d¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$LadderData$SelectedPendingOrders;", "", "rowIndex", "", "getRowIndex", "()I", "side", "Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;", "getSide", "()Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;", AnnotatedPrivateKey.LABEL, "Lcom/robinhood/utils/resource/StringResource;", "getLabel", "()Lcom/robinhood/utils/resource/StringResource;", "bottomLabel", "getBottomLabel", "orders", "", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$LadderData$UiPendingOrder;", "getOrders", "()Ljava/util/List;", "orderIds", "", "Ljava/util/UUID;", "getOrderIds", "()Ljava/util/Set;", "Single", "Group", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$LadderData$SelectedPendingOrders$Group;", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$LadderData$SelectedPendingOrders$Single;", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public interface SelectedPendingOrders {
            StringResource getBottomLabel();

            StringResource getLabel();

            Set<UUID> getOrderIds();

            List<UiPendingOrder> getOrders();

            int getRowIndex();

            FuturesOrderSide getSide();

            /* compiled from: FuturesLadderViewState.kt */
            @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\tHÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$LadderData$SelectedPendingOrders$Single;", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$LadderData$SelectedPendingOrders;", "uiPendingOrder", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$LadderData$UiPendingOrder;", "<init>", "(Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$LadderData$UiPendingOrder;)V", "getUiPendingOrder", "()Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$LadderData$UiPendingOrder;", "rowIndex", "", "getRowIndex", "()I", "side", "Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;", "getSide", "()Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;", AnnotatedPrivateKey.LABEL, "Lcom/robinhood/utils/resource/StringResource;", "getLabel", "()Lcom/robinhood/utils/resource/StringResource;", "orderId", "Ljava/util/UUID;", "getOrderId", "()Ljava/util/UUID;", "bottomLabel", "getBottomLabel", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final /* data */ class Single implements SelectedPendingOrders {
                public static final int $stable = 8;
                private final StringResource bottomLabel;
                private final StringResource label;
                private final UUID orderId;
                private final int rowIndex;
                private final FuturesOrderSide side;
                private final UiPendingOrder uiPendingOrder;

                public static /* synthetic */ Single copy$default(Single single, UiPendingOrder uiPendingOrder, int i, Object obj) {
                    if ((i & 1) != 0) {
                        uiPendingOrder = single.uiPendingOrder;
                    }
                    return single.copy(uiPendingOrder);
                }

                /* renamed from: component1, reason: from getter */
                public final UiPendingOrder getUiPendingOrder() {
                    return this.uiPendingOrder;
                }

                public final Single copy(UiPendingOrder uiPendingOrder) {
                    Intrinsics.checkNotNullParameter(uiPendingOrder, "uiPendingOrder");
                    return new Single(uiPendingOrder);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Single) && Intrinsics.areEqual(this.uiPendingOrder, ((Single) other).uiPendingOrder);
                }

                public int hashCode() {
                    return this.uiPendingOrder.hashCode();
                }

                public String toString() {
                    return "Single(uiPendingOrder=" + this.uiPendingOrder + ")";
                }

                public Single(UiPendingOrder uiPendingOrder) {
                    Intrinsics.checkNotNullParameter(uiPendingOrder, "uiPendingOrder");
                    this.uiPendingOrder = uiPendingOrder;
                    this.rowIndex = uiPendingOrder.getIndex();
                    this.side = uiPendingOrder.getSide();
                    this.label = uiPendingOrder.getLabel();
                    this.orderId = uiPendingOrder.getId();
                }

                @Override // com.robinhood.android.futures.trade.ui.ladder.FuturesLadderViewState.LadderData.SelectedPendingOrders
                public Set<UUID> getOrderIds() {
                    return DefaultImpls.getOrderIds(this);
                }

                @Override // com.robinhood.android.futures.trade.ui.ladder.FuturesLadderViewState.LadderData.SelectedPendingOrders
                public List<UiPendingOrder> getOrders() {
                    return DefaultImpls.getOrders(this);
                }

                public final UiPendingOrder getUiPendingOrder() {
                    return this.uiPendingOrder;
                }

                @Override // com.robinhood.android.futures.trade.ui.ladder.FuturesLadderViewState.LadderData.SelectedPendingOrders
                public int getRowIndex() {
                    return this.rowIndex;
                }

                @Override // com.robinhood.android.futures.trade.ui.ladder.FuturesLadderViewState.LadderData.SelectedPendingOrders
                public FuturesOrderSide getSide() {
                    return this.side;
                }

                @Override // com.robinhood.android.futures.trade.ui.ladder.FuturesLadderViewState.LadderData.SelectedPendingOrders
                public StringResource getLabel() {
                    return this.label;
                }

                public final UUID getOrderId() {
                    return this.orderId;
                }

                @Override // com.robinhood.android.futures.trade.ui.ladder.FuturesLadderViewState.LadderData.SelectedPendingOrders
                public StringResource getBottomLabel() {
                    return this.bottomLabel;
                }
            }

            /* compiled from: FuturesLadderViewState.kt */
            @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u000eHÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\nR\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\n¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$LadderData$SelectedPendingOrders$Group;", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$LadderData$SelectedPendingOrders;", "groupLabel", "Lcom/robinhood/utils/resource/StringResource;", "uiPendingOrders", "", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$LadderData$UiPendingOrder;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Ljava/util/List;)V", "getGroupLabel", "()Lcom/robinhood/utils/resource/StringResource;", "getUiPendingOrders", "()Ljava/util/List;", "rowIndex", "", "getRowIndex", "()I", "side", "Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;", "getSide", "()Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;", AnnotatedPrivateKey.LABEL, "getLabel", "bottomLabel", "getBottomLabel", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final /* data */ class Group implements SelectedPendingOrders {
                public static final int $stable = 8;
                private final StringResource bottomLabel;
                private final StringResource groupLabel;
                private final StringResource label;
                private final int rowIndex;
                private final FuturesOrderSide side;
                private final List<UiPendingOrder> uiPendingOrders;

                /* JADX WARN: Multi-variable type inference failed */
                public static /* synthetic */ Group copy$default(Group group, StringResource stringResource, List list, int i, Object obj) {
                    if ((i & 1) != 0) {
                        stringResource = group.groupLabel;
                    }
                    if ((i & 2) != 0) {
                        list = group.uiPendingOrders;
                    }
                    return group.copy(stringResource, list);
                }

                /* renamed from: component1, reason: from getter */
                public final StringResource getGroupLabel() {
                    return this.groupLabel;
                }

                public final List<UiPendingOrder> component2() {
                    return this.uiPendingOrders;
                }

                public final Group copy(StringResource groupLabel, List<UiPendingOrder> uiPendingOrders) {
                    Intrinsics.checkNotNullParameter(groupLabel, "groupLabel");
                    Intrinsics.checkNotNullParameter(uiPendingOrders, "uiPendingOrders");
                    return new Group(groupLabel, uiPendingOrders);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Group)) {
                        return false;
                    }
                    Group group = (Group) other;
                    return Intrinsics.areEqual(this.groupLabel, group.groupLabel) && Intrinsics.areEqual(this.uiPendingOrders, group.uiPendingOrders);
                }

                public int hashCode() {
                    return (this.groupLabel.hashCode() * 31) + this.uiPendingOrders.hashCode();
                }

                public String toString() {
                    return "Group(groupLabel=" + this.groupLabel + ", uiPendingOrders=" + this.uiPendingOrders + ")";
                }

                public Group(StringResource groupLabel, List<UiPendingOrder> uiPendingOrders) {
                    Intrinsics.checkNotNullParameter(groupLabel, "groupLabel");
                    Intrinsics.checkNotNullParameter(uiPendingOrders, "uiPendingOrders");
                    this.groupLabel = groupLabel;
                    this.uiPendingOrders = uiPendingOrders;
                    this.rowIndex = ((UiPendingOrder) CollectionsKt.first((List) uiPendingOrders)).getIndex();
                    this.side = ((UiPendingOrder) CollectionsKt.first((List) uiPendingOrders)).getSide();
                    this.label = groupLabel;
                    UiPendingOrder uiPendingOrder = (UiPendingOrder) CollectionsKt.getOrNull(uiPendingOrders, 1);
                    this.bottomLabel = uiPendingOrder != null ? uiPendingOrder.getLabel() : null;
                }

                @Override // com.robinhood.android.futures.trade.ui.ladder.FuturesLadderViewState.LadderData.SelectedPendingOrders
                public Set<UUID> getOrderIds() {
                    return DefaultImpls.getOrderIds(this);
                }

                @Override // com.robinhood.android.futures.trade.ui.ladder.FuturesLadderViewState.LadderData.SelectedPendingOrders
                public List<UiPendingOrder> getOrders() {
                    return DefaultImpls.getOrders(this);
                }

                public final StringResource getGroupLabel() {
                    return this.groupLabel;
                }

                public final List<UiPendingOrder> getUiPendingOrders() {
                    return this.uiPendingOrders;
                }

                @Override // com.robinhood.android.futures.trade.ui.ladder.FuturesLadderViewState.LadderData.SelectedPendingOrders
                public int getRowIndex() {
                    return this.rowIndex;
                }

                @Override // com.robinhood.android.futures.trade.ui.ladder.FuturesLadderViewState.LadderData.SelectedPendingOrders
                public FuturesOrderSide getSide() {
                    return this.side;
                }

                @Override // com.robinhood.android.futures.trade.ui.ladder.FuturesLadderViewState.LadderData.SelectedPendingOrders
                public StringResource getLabel() {
                    return this.label;
                }

                @Override // com.robinhood.android.futures.trade.ui.ladder.FuturesLadderViewState.LadderData.SelectedPendingOrders
                public StringResource getBottomLabel() {
                    return this.bottomLabel;
                }
            }

            /* compiled from: FuturesLadderViewState.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            public static final class DefaultImpls {
                public static List<UiPendingOrder> getOrders(SelectedPendingOrders selectedPendingOrders) {
                    if (selectedPendingOrders instanceof Single) {
                        return CollectionsKt.listOf(((Single) selectedPendingOrders).getUiPendingOrder());
                    }
                    if (selectedPendingOrders instanceof Group) {
                        return ((Group) selectedPendingOrders).getUiPendingOrders();
                    }
                    throw new NoWhenBranchMatchedException();
                }

                public static Set<UUID> getOrderIds(SelectedPendingOrders selectedPendingOrders) {
                    if (selectedPendingOrders instanceof Single) {
                        return SetsKt.setOf(((Single) selectedPendingOrders).getUiPendingOrder().getId());
                    }
                    if (!(selectedPendingOrders instanceof Group)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    List<UiPendingOrder> uiPendingOrders = ((Group) selectedPendingOrders).getUiPendingOrders();
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(uiPendingOrders, 10));
                    Iterator<T> it = uiPendingOrders.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((UiPendingOrder) it.next()).getId());
                    }
                    return CollectionsKt.toSet(arrayList);
                }
            }
        }

        /* compiled from: FuturesLadderViewState.kt */
        @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0018B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$LadderData$SelectedRow;", "", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "buyConfig", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$LadderData$SelectedRow$OrderConfig;", "sellConfig", "<init>", "(ILcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$LadderData$SelectedRow$OrderConfig;Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$LadderData$SelectedRow$OrderConfig;)V", "getIndex", "()I", "getBuyConfig", "()Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$LadderData$SelectedRow$OrderConfig;", "getSellConfig", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "OrderConfig", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class SelectedRow {
            public static final int $stable = 0;
            private final OrderConfig buyConfig;
            private final int index;
            private final OrderConfig sellConfig;

            public static /* synthetic */ SelectedRow copy$default(SelectedRow selectedRow, int i, OrderConfig orderConfig, OrderConfig orderConfig2, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = selectedRow.index;
                }
                if ((i2 & 2) != 0) {
                    orderConfig = selectedRow.buyConfig;
                }
                if ((i2 & 4) != 0) {
                    orderConfig2 = selectedRow.sellConfig;
                }
                return selectedRow.copy(i, orderConfig, orderConfig2);
            }

            /* renamed from: component1, reason: from getter */
            public final int getIndex() {
                return this.index;
            }

            /* renamed from: component2, reason: from getter */
            public final OrderConfig getBuyConfig() {
                return this.buyConfig;
            }

            /* renamed from: component3, reason: from getter */
            public final OrderConfig getSellConfig() {
                return this.sellConfig;
            }

            public final SelectedRow copy(int index, OrderConfig buyConfig, OrderConfig sellConfig) {
                Intrinsics.checkNotNullParameter(buyConfig, "buyConfig");
                Intrinsics.checkNotNullParameter(sellConfig, "sellConfig");
                return new SelectedRow(index, buyConfig, sellConfig);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SelectedRow)) {
                    return false;
                }
                SelectedRow selectedRow = (SelectedRow) other;
                return this.index == selectedRow.index && Intrinsics.areEqual(this.buyConfig, selectedRow.buyConfig) && Intrinsics.areEqual(this.sellConfig, selectedRow.sellConfig);
            }

            public int hashCode() {
                return (((Integer.hashCode(this.index) * 31) + this.buyConfig.hashCode()) * 31) + this.sellConfig.hashCode();
            }

            public String toString() {
                return "SelectedRow(index=" + this.index + ", buyConfig=" + this.buyConfig + ", sellConfig=" + this.sellConfig + ")";
            }

            public SelectedRow(int i, OrderConfig buyConfig, OrderConfig sellConfig) {
                Intrinsics.checkNotNullParameter(buyConfig, "buyConfig");
                Intrinsics.checkNotNullParameter(sellConfig, "sellConfig");
                this.index = i;
                this.buyConfig = buyConfig;
                this.sellConfig = sellConfig;
            }

            public final int getIndex() {
                return this.index;
            }

            public final OrderConfig getBuyConfig() {
                return this.buyConfig;
            }

            public final OrderConfig getSellConfig() {
                return this.sellConfig;
            }

            /* compiled from: FuturesLadderViewState.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$LadderData$SelectedRow$OrderConfig;", "", AnnotatedPrivateKey.LABEL, "", "type", "Lcom/robinhood/android/models/futures/api/order/FuturesOrderType;", "trigger", "Lcom/robinhood/android/models/futures/api/order/FuturesOrderTrigger;", "<init>", "(ILcom/robinhood/android/models/futures/api/order/FuturesOrderType;Lcom/robinhood/android/models/futures/api/order/FuturesOrderTrigger;)V", "getLabel", "()I", "getType", "()Lcom/robinhood/android/models/futures/api/order/FuturesOrderType;", "getTrigger", "()Lcom/robinhood/android/models/futures/api/order/FuturesOrderTrigger;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final /* data */ class OrderConfig {
                public static final int $stable = 0;
                private final int label;
                private final FuturesOrderTrigger trigger;
                private final FuturesOrderType type;

                public static /* synthetic */ OrderConfig copy$default(OrderConfig orderConfig, int i, FuturesOrderType futuresOrderType, FuturesOrderTrigger futuresOrderTrigger, int i2, Object obj) {
                    if ((i2 & 1) != 0) {
                        i = orderConfig.label;
                    }
                    if ((i2 & 2) != 0) {
                        futuresOrderType = orderConfig.type;
                    }
                    if ((i2 & 4) != 0) {
                        futuresOrderTrigger = orderConfig.trigger;
                    }
                    return orderConfig.copy(i, futuresOrderType, futuresOrderTrigger);
                }

                /* renamed from: component1, reason: from getter */
                public final int getLabel() {
                    return this.label;
                }

                /* renamed from: component2, reason: from getter */
                public final FuturesOrderType getType() {
                    return this.type;
                }

                /* renamed from: component3, reason: from getter */
                public final FuturesOrderTrigger getTrigger() {
                    return this.trigger;
                }

                public final OrderConfig copy(int label, FuturesOrderType type2, FuturesOrderTrigger trigger) {
                    Intrinsics.checkNotNullParameter(type2, "type");
                    Intrinsics.checkNotNullParameter(trigger, "trigger");
                    return new OrderConfig(label, type2, trigger);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof OrderConfig)) {
                        return false;
                    }
                    OrderConfig orderConfig = (OrderConfig) other;
                    return this.label == orderConfig.label && this.type == orderConfig.type && this.trigger == orderConfig.trigger;
                }

                public int hashCode() {
                    return (((Integer.hashCode(this.label) * 31) + this.type.hashCode()) * 31) + this.trigger.hashCode();
                }

                public String toString() {
                    return "OrderConfig(label=" + this.label + ", type=" + this.type + ", trigger=" + this.trigger + ")";
                }

                public OrderConfig(int i, FuturesOrderType type2, FuturesOrderTrigger trigger) {
                    Intrinsics.checkNotNullParameter(type2, "type");
                    Intrinsics.checkNotNullParameter(trigger, "trigger");
                    this.label = i;
                    this.type = type2;
                    this.trigger = trigger;
                }

                public final int getLabel() {
                    return this.label;
                }

                public final FuturesOrderType getType() {
                    return this.type;
                }

                public final FuturesOrderTrigger getTrigger() {
                    return this.trigger;
                }
            }
        }
    }

    /* compiled from: FuturesLadderViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$QuantityPanelData;", "", "buyingPowerDisplayText", "Lcom/robinhood/utils/resource/StringResource;", "quantity", "Ljava/math/BigDecimal;", "quantitySelectorOpen", "", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Ljava/math/BigDecimal;Z)V", "getBuyingPowerDisplayText", "()Lcom/robinhood/utils/resource/StringResource;", "getQuantity", "()Ljava/math/BigDecimal;", "getQuantitySelectorOpen", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class QuantityPanelData {
        public static final int $stable = 8;
        private final StringResource buyingPowerDisplayText;
        private final BigDecimal quantity;
        private final boolean quantitySelectorOpen;

        public static /* synthetic */ QuantityPanelData copy$default(QuantityPanelData quantityPanelData, StringResource stringResource, BigDecimal bigDecimal, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                stringResource = quantityPanelData.buyingPowerDisplayText;
            }
            if ((i & 2) != 0) {
                bigDecimal = quantityPanelData.quantity;
            }
            if ((i & 4) != 0) {
                z = quantityPanelData.quantitySelectorOpen;
            }
            return quantityPanelData.copy(stringResource, bigDecimal, z);
        }

        /* renamed from: component1, reason: from getter */
        public final StringResource getBuyingPowerDisplayText() {
            return this.buyingPowerDisplayText;
        }

        /* renamed from: component2, reason: from getter */
        public final BigDecimal getQuantity() {
            return this.quantity;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getQuantitySelectorOpen() {
            return this.quantitySelectorOpen;
        }

        public final QuantityPanelData copy(StringResource buyingPowerDisplayText, BigDecimal quantity, boolean quantitySelectorOpen) {
            Intrinsics.checkNotNullParameter(quantity, "quantity");
            return new QuantityPanelData(buyingPowerDisplayText, quantity, quantitySelectorOpen);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof QuantityPanelData)) {
                return false;
            }
            QuantityPanelData quantityPanelData = (QuantityPanelData) other;
            return Intrinsics.areEqual(this.buyingPowerDisplayText, quantityPanelData.buyingPowerDisplayText) && Intrinsics.areEqual(this.quantity, quantityPanelData.quantity) && this.quantitySelectorOpen == quantityPanelData.quantitySelectorOpen;
        }

        public int hashCode() {
            StringResource stringResource = this.buyingPowerDisplayText;
            return ((((stringResource == null ? 0 : stringResource.hashCode()) * 31) + this.quantity.hashCode()) * 31) + Boolean.hashCode(this.quantitySelectorOpen);
        }

        public String toString() {
            return "QuantityPanelData(buyingPowerDisplayText=" + this.buyingPowerDisplayText + ", quantity=" + this.quantity + ", quantitySelectorOpen=" + this.quantitySelectorOpen + ")";
        }

        public QuantityPanelData(StringResource stringResource, BigDecimal quantity, boolean z) {
            Intrinsics.checkNotNullParameter(quantity, "quantity");
            this.buyingPowerDisplayText = stringResource;
            this.quantity = quantity;
            this.quantitySelectorOpen = z;
        }

        public final StringResource getBuyingPowerDisplayText() {
            return this.buyingPowerDisplayText;
        }

        public final BigDecimal getQuantity() {
            return this.quantity;
        }

        public final boolean getQuantitySelectorOpen() {
            return this.quantitySelectorOpen;
        }
    }

    /* compiled from: FuturesLadderViewState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$MarketClosedHeaderData;", "", "headerString", "Lcom/robinhood/utils/resource/StringResource;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;)V", "getHeaderString", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class MarketClosedHeaderData {
        public static final int $stable = StringResource.$stable;
        private final StringResource headerString;

        public static /* synthetic */ MarketClosedHeaderData copy$default(MarketClosedHeaderData marketClosedHeaderData, StringResource stringResource, int i, Object obj) {
            if ((i & 1) != 0) {
                stringResource = marketClosedHeaderData.headerString;
            }
            return marketClosedHeaderData.copy(stringResource);
        }

        /* renamed from: component1, reason: from getter */
        public final StringResource getHeaderString() {
            return this.headerString;
        }

        public final MarketClosedHeaderData copy(StringResource headerString) {
            return new MarketClosedHeaderData(headerString);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof MarketClosedHeaderData) && Intrinsics.areEqual(this.headerString, ((MarketClosedHeaderData) other).headerString);
        }

        public int hashCode() {
            StringResource stringResource = this.headerString;
            if (stringResource == null) {
                return 0;
            }
            return stringResource.hashCode();
        }

        public String toString() {
            return "MarketClosedHeaderData(headerString=" + this.headerString + ")";
        }

        public MarketClosedHeaderData(StringResource stringResource) {
            this.headerString = stringResource;
        }

        public final StringResource getHeaderString() {
            return this.headerString;
        }
    }

    /* compiled from: FuturesLadderViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$BottomPanelData;", "", "quantityPanel", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$QuantityPanelData;", "showMarketOrderBtns", "", "areMarketOrderBtnsEnabled", "showLoadingOnMarketBuyButton", "showLoadingOnMarketSellButton", "<init>", "(Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$QuantityPanelData;ZZZZ)V", "getQuantityPanel", "()Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$QuantityPanelData;", "getShowMarketOrderBtns", "()Z", "getAreMarketOrderBtnsEnabled", "getShowLoadingOnMarketBuyButton", "getShowLoadingOnMarketSellButton", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class BottomPanelData {
        public static final int $stable = 8;
        private final boolean areMarketOrderBtnsEnabled;
        private final QuantityPanelData quantityPanel;
        private final boolean showLoadingOnMarketBuyButton;
        private final boolean showLoadingOnMarketSellButton;
        private final boolean showMarketOrderBtns;

        public static /* synthetic */ BottomPanelData copy$default(BottomPanelData bottomPanelData, QuantityPanelData quantityPanelData, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
            if ((i & 1) != 0) {
                quantityPanelData = bottomPanelData.quantityPanel;
            }
            if ((i & 2) != 0) {
                z = bottomPanelData.showMarketOrderBtns;
            }
            if ((i & 4) != 0) {
                z2 = bottomPanelData.areMarketOrderBtnsEnabled;
            }
            if ((i & 8) != 0) {
                z3 = bottomPanelData.showLoadingOnMarketBuyButton;
            }
            if ((i & 16) != 0) {
                z4 = bottomPanelData.showLoadingOnMarketSellButton;
            }
            boolean z5 = z4;
            boolean z6 = z2;
            return bottomPanelData.copy(quantityPanelData, z, z6, z3, z5);
        }

        /* renamed from: component1, reason: from getter */
        public final QuantityPanelData getQuantityPanel() {
            return this.quantityPanel;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getShowMarketOrderBtns() {
            return this.showMarketOrderBtns;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getAreMarketOrderBtnsEnabled() {
            return this.areMarketOrderBtnsEnabled;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getShowLoadingOnMarketBuyButton() {
            return this.showLoadingOnMarketBuyButton;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getShowLoadingOnMarketSellButton() {
            return this.showLoadingOnMarketSellButton;
        }

        public final BottomPanelData copy(QuantityPanelData quantityPanel, boolean showMarketOrderBtns, boolean areMarketOrderBtnsEnabled, boolean showLoadingOnMarketBuyButton, boolean showLoadingOnMarketSellButton) {
            Intrinsics.checkNotNullParameter(quantityPanel, "quantityPanel");
            return new BottomPanelData(quantityPanel, showMarketOrderBtns, areMarketOrderBtnsEnabled, showLoadingOnMarketBuyButton, showLoadingOnMarketSellButton);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BottomPanelData)) {
                return false;
            }
            BottomPanelData bottomPanelData = (BottomPanelData) other;
            return Intrinsics.areEqual(this.quantityPanel, bottomPanelData.quantityPanel) && this.showMarketOrderBtns == bottomPanelData.showMarketOrderBtns && this.areMarketOrderBtnsEnabled == bottomPanelData.areMarketOrderBtnsEnabled && this.showLoadingOnMarketBuyButton == bottomPanelData.showLoadingOnMarketBuyButton && this.showLoadingOnMarketSellButton == bottomPanelData.showLoadingOnMarketSellButton;
        }

        public int hashCode() {
            return (((((((this.quantityPanel.hashCode() * 31) + Boolean.hashCode(this.showMarketOrderBtns)) * 31) + Boolean.hashCode(this.areMarketOrderBtnsEnabled)) * 31) + Boolean.hashCode(this.showLoadingOnMarketBuyButton)) * 31) + Boolean.hashCode(this.showLoadingOnMarketSellButton);
        }

        public String toString() {
            return "BottomPanelData(quantityPanel=" + this.quantityPanel + ", showMarketOrderBtns=" + this.showMarketOrderBtns + ", areMarketOrderBtnsEnabled=" + this.areMarketOrderBtnsEnabled + ", showLoadingOnMarketBuyButton=" + this.showLoadingOnMarketBuyButton + ", showLoadingOnMarketSellButton=" + this.showLoadingOnMarketSellButton + ")";
        }

        public BottomPanelData(QuantityPanelData quantityPanel, boolean z, boolean z2, boolean z3, boolean z4) {
            Intrinsics.checkNotNullParameter(quantityPanel, "quantityPanel");
            this.quantityPanel = quantityPanel;
            this.showMarketOrderBtns = z;
            this.areMarketOrderBtnsEnabled = z2;
            this.showLoadingOnMarketBuyButton = z3;
            this.showLoadingOnMarketSellButton = z4;
        }

        public final QuantityPanelData getQuantityPanel() {
            return this.quantityPanel;
        }

        public final boolean getShowMarketOrderBtns() {
            return this.showMarketOrderBtns;
        }

        public final boolean getAreMarketOrderBtnsEnabled() {
            return this.areMarketOrderBtnsEnabled;
        }

        public final boolean getShowLoadingOnMarketBuyButton() {
            return this.showLoadingOnMarketBuyButton;
        }

        public final boolean getShowLoadingOnMarketSellButton() {
            return this.showLoadingOnMarketSellButton;
        }
    }

    /* compiled from: FuturesLadderViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ0\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$SettingsBottomSheetData;", "", "timeInForce", "Lcom/robinhood/android/models/futures/api/order/FuturesTimeInForce;", "gfdDesc", "Lcom/robinhood/utils/resource/StringResource;", "autoSend", "", "<init>", "(Lcom/robinhood/android/models/futures/api/order/FuturesTimeInForce;Lcom/robinhood/utils/resource/StringResource;Ljava/lang/Boolean;)V", "getTimeInForce", "()Lcom/robinhood/android/models/futures/api/order/FuturesTimeInForce;", "getGfdDesc", "()Lcom/robinhood/utils/resource/StringResource;", "getAutoSend", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "copy", "(Lcom/robinhood/android/models/futures/api/order/FuturesTimeInForce;Lcom/robinhood/utils/resource/StringResource;Ljava/lang/Boolean;)Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$SettingsBottomSheetData;", "equals", "other", "hashCode", "", "toString", "", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SettingsBottomSheetData {
        public static final int $stable = StringResource.$stable;
        private final Boolean autoSend;
        private final StringResource gfdDesc;
        private final FuturesTimeInForce timeInForce;

        public static /* synthetic */ SettingsBottomSheetData copy$default(SettingsBottomSheetData settingsBottomSheetData, FuturesTimeInForce futuresTimeInForce, StringResource stringResource, Boolean bool, int i, Object obj) {
            if ((i & 1) != 0) {
                futuresTimeInForce = settingsBottomSheetData.timeInForce;
            }
            if ((i & 2) != 0) {
                stringResource = settingsBottomSheetData.gfdDesc;
            }
            if ((i & 4) != 0) {
                bool = settingsBottomSheetData.autoSend;
            }
            return settingsBottomSheetData.copy(futuresTimeInForce, stringResource, bool);
        }

        /* renamed from: component1, reason: from getter */
        public final FuturesTimeInForce getTimeInForce() {
            return this.timeInForce;
        }

        /* renamed from: component2, reason: from getter */
        public final StringResource getGfdDesc() {
            return this.gfdDesc;
        }

        /* renamed from: component3, reason: from getter */
        public final Boolean getAutoSend() {
            return this.autoSend;
        }

        public final SettingsBottomSheetData copy(FuturesTimeInForce timeInForce, StringResource gfdDesc, Boolean autoSend) {
            Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
            return new SettingsBottomSheetData(timeInForce, gfdDesc, autoSend);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SettingsBottomSheetData)) {
                return false;
            }
            SettingsBottomSheetData settingsBottomSheetData = (SettingsBottomSheetData) other;
            return this.timeInForce == settingsBottomSheetData.timeInForce && Intrinsics.areEqual(this.gfdDesc, settingsBottomSheetData.gfdDesc) && Intrinsics.areEqual(this.autoSend, settingsBottomSheetData.autoSend);
        }

        public int hashCode() {
            int iHashCode = this.timeInForce.hashCode() * 31;
            StringResource stringResource = this.gfdDesc;
            int iHashCode2 = (iHashCode + (stringResource == null ? 0 : stringResource.hashCode())) * 31;
            Boolean bool = this.autoSend;
            return iHashCode2 + (bool != null ? bool.hashCode() : 0);
        }

        public String toString() {
            return "SettingsBottomSheetData(timeInForce=" + this.timeInForce + ", gfdDesc=" + this.gfdDesc + ", autoSend=" + this.autoSend + ")";
        }

        public SettingsBottomSheetData(FuturesTimeInForce timeInForce, StringResource stringResource, Boolean bool) {
            Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
            this.timeInForce = timeInForce;
            this.gfdDesc = stringResource;
            this.autoSend = bool;
        }

        public final FuturesTimeInForce getTimeInForce() {
            return this.timeInForce;
        }

        public final StringResource getGfdDesc() {
            return this.gfdDesc;
        }

        public final Boolean getAutoSend() {
            return this.autoSend;
        }
    }
}
