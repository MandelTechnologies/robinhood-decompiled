package com.robinhood.android.common.views.futures;

import android.content.Context;
import android.os.Parcelable;
import com.robinhood.android.common.util.SecurityViewMode;
import com.robinhood.android.designsystem.style.ThemeAttributes;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesMarginRequirement;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesProduct;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesProduct5;
import com.robinhood.android.models.futures.arsenal.p188db.UiFuturesContract;
import com.robinhood.android.models.futures.marketdata.p191db.FuturesClosePrices;
import com.robinhood.android.models.futures.marketdata.p191db.FuturesQuote;
import com.robinhood.android.models.futures.p189db.UiFuturesPosition;
import com.robinhood.models.serverdriven.experimental.api.Chart;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import com.robinhood.utils.android.C41827R;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesRowViewDuxo.kt */
@Metadata(m3635d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B\u0095\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010?\u001a\u0004\u0018\u00010@2\u0006\u0010A\u001a\u00020BJ\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010F\u001a\u00020\bHÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u0011\u0010L\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014HÆ\u0003J\t\u0010M\u001a\u00020\u0017HÆ\u0003J\t\u0010N\u001a\u00020\bHÆ\u0003J\u0099\u0001\u0010O\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\bHÆ\u0001J\u0013\u0010P\u001a\u00020\b2\b\u0010Q\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010R\u001a\u00020<HÖ\u0001J\t\u0010S\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0019\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u0010\u0018\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b0\u0010!R\u0010\u00101\u001a\u0004\u0018\u000102X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u00103\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b4\u0010\u001eR\u0013\u00105\u001a\u0004\u0018\u0001068F¢\u0006\u0006\u001a\u0004\b7\u00108R\u0011\u00109\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b9\u0010!R\u0017\u0010:\u001a\b\u0012\u0004\u0012\u00020<0;8F¢\u0006\u0006\u001a\u0004\b=\u0010>¨\u0006T"}, m3636d2 = {"Lcom/robinhood/android/common/views/futures/FuturesRowViewState;", "", "contractId", "Ljava/util/UUID;", "name", "", "symbol", "invertNameAndSymbol", "", "futuresContract", "Lcom/robinhood/android/models/futures/arsenal/db/UiFuturesContract;", "futuresPosition", "Lcom/robinhood/android/models/futures/db/UiFuturesPosition;", "futuresQuote", "Lcom/robinhood/android/models/futures/marketdata/db/FuturesQuote;", "futuresClosePrices", "Lcom/robinhood/android/models/futures/marketdata/db/FuturesClosePrices;", "marginRequirement", "Lcom/robinhood/android/models/futures/arsenal/db/FuturesMarginRequirement;", "chart", "Lcom/robinhood/models/serverdriven/experimental/api/Chart;", "Landroid/os/Parcelable;", "viewMode", "Lcom/robinhood/android/common/util/SecurityViewMode;", "showSymbolInPositionInfo", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;ZLcom/robinhood/android/models/futures/arsenal/db/UiFuturesContract;Lcom/robinhood/android/models/futures/db/UiFuturesPosition;Lcom/robinhood/android/models/futures/marketdata/db/FuturesQuote;Lcom/robinhood/android/models/futures/marketdata/db/FuturesClosePrices;Lcom/robinhood/android/models/futures/arsenal/db/FuturesMarginRequirement;Lcom/robinhood/models/serverdriven/experimental/api/Chart;Lcom/robinhood/android/common/util/SecurityViewMode;Z)V", "getContractId", "()Ljava/util/UUID;", "getName", "()Ljava/lang/String;", "getSymbol", "getInvertNameAndSymbol", "()Z", "getFuturesContract", "()Lcom/robinhood/android/models/futures/arsenal/db/UiFuturesContract;", "getFuturesPosition", "()Lcom/robinhood/android/models/futures/db/UiFuturesPosition;", "getFuturesQuote", "()Lcom/robinhood/android/models/futures/marketdata/db/FuturesQuote;", "getFuturesClosePrices", "()Lcom/robinhood/android/models/futures/marketdata/db/FuturesClosePrices;", "getMarginRequirement", "()Lcom/robinhood/android/models/futures/arsenal/db/FuturesMarginRequirement;", "getChart", "()Lcom/robinhood/models/serverdriven/experimental/api/Chart;", "getViewMode", "()Lcom/robinhood/android/common/util/SecurityViewMode;", "getShowSymbolInPositionInfo", "futuresProduct", "Lcom/robinhood/android/models/futures/arsenal/db/FuturesProduct;", "nameText", "getNameText", "detailText", "Lcom/robinhood/utils/resource/StringResource;", "getDetailText", "()Lcom/robinhood/utils/resource/StringResource;", "isStale", "priceBackgroundTint", "Lcom/robinhood/scarlet/util/resource/ThemedResourceReference;", "", "getPriceBackgroundTint", "()Lcom/robinhood/scarlet/util/resource/ThemedResourceReference;", "getPriceInfo", "Lcom/robinhood/android/common/util/SecurityViewMode$FormatInfo;", "context", "Landroid/content/Context;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "other", "hashCode", "toString", "feature-lib-instrument-row_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class FuturesRowViewState {
    public static final int $stable = 8;
    private final Chart<Parcelable> chart;
    private final UUID contractId;
    private final FuturesClosePrices futuresClosePrices;
    private final UiFuturesContract futuresContract;
    private final UiFuturesPosition futuresPosition;
    private final FuturesProduct futuresProduct;
    private final FuturesQuote futuresQuote;
    private final boolean invertNameAndSymbol;
    private final FuturesMarginRequirement marginRequirement;
    private final String name;
    private final boolean showSymbolInPositionInfo;
    private final String symbol;
    private final SecurityViewMode viewMode;

    public static /* synthetic */ FuturesRowViewState copy$default(FuturesRowViewState futuresRowViewState, UUID uuid, String str, String str2, boolean z, UiFuturesContract uiFuturesContract, UiFuturesPosition uiFuturesPosition, FuturesQuote futuresQuote, FuturesClosePrices futuresClosePrices, FuturesMarginRequirement futuresMarginRequirement, Chart chart, SecurityViewMode securityViewMode, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = futuresRowViewState.contractId;
        }
        if ((i & 2) != 0) {
            str = futuresRowViewState.name;
        }
        if ((i & 4) != 0) {
            str2 = futuresRowViewState.symbol;
        }
        if ((i & 8) != 0) {
            z = futuresRowViewState.invertNameAndSymbol;
        }
        if ((i & 16) != 0) {
            uiFuturesContract = futuresRowViewState.futuresContract;
        }
        if ((i & 32) != 0) {
            uiFuturesPosition = futuresRowViewState.futuresPosition;
        }
        if ((i & 64) != 0) {
            futuresQuote = futuresRowViewState.futuresQuote;
        }
        if ((i & 128) != 0) {
            futuresClosePrices = futuresRowViewState.futuresClosePrices;
        }
        if ((i & 256) != 0) {
            futuresMarginRequirement = futuresRowViewState.marginRequirement;
        }
        if ((i & 512) != 0) {
            chart = futuresRowViewState.chart;
        }
        if ((i & 1024) != 0) {
            securityViewMode = futuresRowViewState.viewMode;
        }
        if ((i & 2048) != 0) {
            z2 = futuresRowViewState.showSymbolInPositionInfo;
        }
        SecurityViewMode securityViewMode2 = securityViewMode;
        boolean z3 = z2;
        FuturesMarginRequirement futuresMarginRequirement2 = futuresMarginRequirement;
        Chart chart2 = chart;
        FuturesQuote futuresQuote2 = futuresQuote;
        FuturesClosePrices futuresClosePrices2 = futuresClosePrices;
        UiFuturesContract uiFuturesContract2 = uiFuturesContract;
        UiFuturesPosition uiFuturesPosition2 = uiFuturesPosition;
        return futuresRowViewState.copy(uuid, str, str2, z, uiFuturesContract2, uiFuturesPosition2, futuresQuote2, futuresClosePrices2, futuresMarginRequirement2, chart2, securityViewMode2, z3);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getContractId() {
        return this.contractId;
    }

    public final Chart<Parcelable> component10() {
        return this.chart;
    }

    /* renamed from: component11, reason: from getter */
    public final SecurityViewMode getViewMode() {
        return this.viewMode;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getShowSymbolInPositionInfo() {
        return this.showSymbolInPositionInfo;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getInvertNameAndSymbol() {
        return this.invertNameAndSymbol;
    }

    /* renamed from: component5, reason: from getter */
    public final UiFuturesContract getFuturesContract() {
        return this.futuresContract;
    }

    /* renamed from: component6, reason: from getter */
    public final UiFuturesPosition getFuturesPosition() {
        return this.futuresPosition;
    }

    /* renamed from: component7, reason: from getter */
    public final FuturesQuote getFuturesQuote() {
        return this.futuresQuote;
    }

    /* renamed from: component8, reason: from getter */
    public final FuturesClosePrices getFuturesClosePrices() {
        return this.futuresClosePrices;
    }

    /* renamed from: component9, reason: from getter */
    public final FuturesMarginRequirement getMarginRequirement() {
        return this.marginRequirement;
    }

    public final FuturesRowViewState copy(UUID contractId, String name, String symbol, boolean invertNameAndSymbol, UiFuturesContract futuresContract, UiFuturesPosition futuresPosition, FuturesQuote futuresQuote, FuturesClosePrices futuresClosePrices, FuturesMarginRequirement marginRequirement, Chart<? extends Parcelable> chart, SecurityViewMode viewMode, boolean showSymbolInPositionInfo) {
        Intrinsics.checkNotNullParameter(viewMode, "viewMode");
        return new FuturesRowViewState(contractId, name, symbol, invertNameAndSymbol, futuresContract, futuresPosition, futuresQuote, futuresClosePrices, marginRequirement, chart, viewMode, showSymbolInPositionInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FuturesRowViewState)) {
            return false;
        }
        FuturesRowViewState futuresRowViewState = (FuturesRowViewState) other;
        return Intrinsics.areEqual(this.contractId, futuresRowViewState.contractId) && Intrinsics.areEqual(this.name, futuresRowViewState.name) && Intrinsics.areEqual(this.symbol, futuresRowViewState.symbol) && this.invertNameAndSymbol == futuresRowViewState.invertNameAndSymbol && Intrinsics.areEqual(this.futuresContract, futuresRowViewState.futuresContract) && Intrinsics.areEqual(this.futuresPosition, futuresRowViewState.futuresPosition) && Intrinsics.areEqual(this.futuresQuote, futuresRowViewState.futuresQuote) && Intrinsics.areEqual(this.futuresClosePrices, futuresRowViewState.futuresClosePrices) && Intrinsics.areEqual(this.marginRequirement, futuresRowViewState.marginRequirement) && Intrinsics.areEqual(this.chart, futuresRowViewState.chart) && this.viewMode == futuresRowViewState.viewMode && this.showSymbolInPositionInfo == futuresRowViewState.showSymbolInPositionInfo;
    }

    public int hashCode() {
        UUID uuid = this.contractId;
        int iHashCode = (uuid == null ? 0 : uuid.hashCode()) * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.symbol;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.invertNameAndSymbol)) * 31;
        UiFuturesContract uiFuturesContract = this.futuresContract;
        int iHashCode4 = (iHashCode3 + (uiFuturesContract == null ? 0 : uiFuturesContract.hashCode())) * 31;
        UiFuturesPosition uiFuturesPosition = this.futuresPosition;
        int iHashCode5 = (iHashCode4 + (uiFuturesPosition == null ? 0 : uiFuturesPosition.hashCode())) * 31;
        FuturesQuote futuresQuote = this.futuresQuote;
        int iHashCode6 = (iHashCode5 + (futuresQuote == null ? 0 : futuresQuote.hashCode())) * 31;
        FuturesClosePrices futuresClosePrices = this.futuresClosePrices;
        int iHashCode7 = (iHashCode6 + (futuresClosePrices == null ? 0 : futuresClosePrices.hashCode())) * 31;
        FuturesMarginRequirement futuresMarginRequirement = this.marginRequirement;
        int iHashCode8 = (iHashCode7 + (futuresMarginRequirement == null ? 0 : futuresMarginRequirement.hashCode())) * 31;
        Chart<Parcelable> chart = this.chart;
        return ((((iHashCode8 + (chart != null ? chart.hashCode() : 0)) * 31) + this.viewMode.hashCode()) * 31) + Boolean.hashCode(this.showSymbolInPositionInfo);
    }

    public String toString() {
        return "FuturesRowViewState(contractId=" + this.contractId + ", name=" + this.name + ", symbol=" + this.symbol + ", invertNameAndSymbol=" + this.invertNameAndSymbol + ", futuresContract=" + this.futuresContract + ", futuresPosition=" + this.futuresPosition + ", futuresQuote=" + this.futuresQuote + ", futuresClosePrices=" + this.futuresClosePrices + ", marginRequirement=" + this.marginRequirement + ", chart=" + this.chart + ", viewMode=" + this.viewMode + ", showSymbolInPositionInfo=" + this.showSymbolInPositionInfo + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FuturesRowViewState(UUID uuid, String str, String str2, boolean z, UiFuturesContract uiFuturesContract, UiFuturesPosition uiFuturesPosition, FuturesQuote futuresQuote, FuturesClosePrices futuresClosePrices, FuturesMarginRequirement futuresMarginRequirement, Chart<? extends Parcelable> chart, SecurityViewMode viewMode, boolean z2) {
        Intrinsics.checkNotNullParameter(viewMode, "viewMode");
        this.contractId = uuid;
        this.name = str;
        this.symbol = str2;
        this.invertNameAndSymbol = z;
        this.futuresContract = uiFuturesContract;
        this.futuresPosition = uiFuturesPosition;
        this.futuresQuote = futuresQuote;
        this.futuresClosePrices = futuresClosePrices;
        this.marginRequirement = futuresMarginRequirement;
        this.chart = chart;
        this.viewMode = viewMode;
        this.showSymbolInPositionInfo = z2;
        this.futuresProduct = uiFuturesContract != null ? uiFuturesContract.getProduct() : null;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ FuturesRowViewState(java.util.UUID r17, java.lang.String r18, java.lang.String r19, boolean r20, com.robinhood.android.models.futures.arsenal.p188db.UiFuturesContract r21, com.robinhood.android.models.futures.p189db.UiFuturesPosition r22, com.robinhood.android.models.futures.marketdata.p191db.FuturesQuote r23, com.robinhood.android.models.futures.marketdata.p191db.FuturesClosePrices r24, com.robinhood.android.models.futures.arsenal.p188db.FuturesMarginRequirement r25, com.robinhood.models.serverdriven.experimental.api.Chart r26, com.robinhood.android.common.util.SecurityViewMode r27, boolean r28, int r29, kotlin.jvm.internal.DefaultConstructorMarker r30) {
        /*
            r16 = this;
            r0 = r29
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L9
            r4 = r2
            goto Lb
        L9:
            r4 = r17
        Lb:
            r1 = r0 & 2
            if (r1 == 0) goto L11
            r5 = r2
            goto L13
        L11:
            r5 = r18
        L13:
            r1 = r0 & 4
            if (r1 == 0) goto L19
            r6 = r2
            goto L1b
        L19:
            r6 = r19
        L1b:
            r1 = r0 & 8
            r3 = 0
            if (r1 == 0) goto L22
            r7 = r3
            goto L24
        L22:
            r7 = r20
        L24:
            r1 = r0 & 16
            if (r1 == 0) goto L2a
            r8 = r2
            goto L2c
        L2a:
            r8 = r21
        L2c:
            r1 = r0 & 32
            if (r1 == 0) goto L32
            r9 = r2
            goto L34
        L32:
            r9 = r22
        L34:
            r1 = r0 & 64
            if (r1 == 0) goto L3a
            r10 = r2
            goto L3c
        L3a:
            r10 = r23
        L3c:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L42
            r11 = r2
            goto L44
        L42:
            r11 = r24
        L44:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L4a
            r12 = r2
            goto L4c
        L4a:
            r12 = r25
        L4c:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L52
            r13 = r2
            goto L54
        L52:
            r13 = r26
        L54:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L5e
            r15 = r3
            r14 = r27
            r3 = r16
            goto L64
        L5e:
            r15 = r28
            r3 = r16
            r14 = r27
        L64:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.common.views.futures.FuturesRowViewState.<init>(java.util.UUID, java.lang.String, java.lang.String, boolean, com.robinhood.android.models.futures.arsenal.db.UiFuturesContract, com.robinhood.android.models.futures.db.UiFuturesPosition, com.robinhood.android.models.futures.marketdata.db.FuturesQuote, com.robinhood.android.models.futures.marketdata.db.FuturesClosePrices, com.robinhood.android.models.futures.arsenal.db.FuturesMarginRequirement, com.robinhood.models.serverdriven.experimental.api.Chart, com.robinhood.android.common.util.SecurityViewMode, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final UUID getContractId() {
        return this.contractId;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final boolean getInvertNameAndSymbol() {
        return this.invertNameAndSymbol;
    }

    public final UiFuturesContract getFuturesContract() {
        return this.futuresContract;
    }

    public final UiFuturesPosition getFuturesPosition() {
        return this.futuresPosition;
    }

    public final FuturesQuote getFuturesQuote() {
        return this.futuresQuote;
    }

    public final FuturesClosePrices getFuturesClosePrices() {
        return this.futuresClosePrices;
    }

    public final FuturesMarginRequirement getMarginRequirement() {
        return this.marginRequirement;
    }

    public final Chart<Parcelable> getChart() {
        return this.chart;
    }

    public final SecurityViewMode getViewMode() {
        return this.viewMode;
    }

    public final boolean getShowSymbolInPositionInfo() {
        return this.showSymbolInPositionInfo;
    }

    public final String getNameText() {
        return this.invertNameAndSymbol ? this.name : this.symbol;
    }

    public final StringResource getDetailText() {
        UiFuturesContract uiFuturesContract = this.futuresContract;
        if (uiFuturesContract != null) {
            return uiFuturesContract.getHistoryDetailString(this.symbol, this.name, this.futuresPosition, this.invertNameAndSymbol, this.showSymbolInPositionInfo);
        }
        return null;
    }

    public final boolean isStale() {
        FuturesQuote futuresQuote = this.futuresQuote;
        return futuresQuote != null && futuresQuote.isStaleForUi();
    }

    public final ThemedResourceReference<Integer> getPriceBackgroundTint() {
        if (isStale()) {
            return ThemeAttributes.INSTANCE.getCOLOR_FOREGROUND_3();
        }
        return ThemeAttributes.INSTANCE.getCOLOR_PRIMARY();
    }

    public final SecurityViewMode.FormatInfo getPriceInfo(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        FuturesQuote futuresQuote = this.futuresQuote;
        BigDecimal lastTradePrice = futuresQuote != null ? futuresQuote.getLastTradePrice() : null;
        if (lastTradePrice == null || this.futuresProduct == null) {
            return null;
        }
        String string2 = context.getString(C41827R.string.general_label_n_a);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return this.viewMode.getFormatInfoForFutures(lastTradePrice, this.futuresClosePrices, this.marginRequirement, FuturesProduct5.priceFormatter(this.futuresProduct), FuturesProduct5.deltaPriceFormatter(this.futuresProduct), string2);
    }
}
