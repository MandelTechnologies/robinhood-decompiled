package com.robinhood.android.equitydetail.p123ui.etp;

import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.android.equitydetail.p123ui.etp.EtpCompositionItemHolder;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.models.api.bonfire.etp.BroadCategoryGroup;
import com.robinhood.models.p320db.EtpDetails;
import com.robinhood.models.p320db.bonfire.etp.EtpHolding;
import com.robinhood.models.p320db.bonfire.etp.EtpSector;
import com.robinhood.shared.crypto.contracts.CryptoDetailSource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.i18n.ErrorBundle;
import p479j$.time.LocalDate;

/* compiled from: EtpCompositionViewState.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u0007\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u0006*\b\u0012\u0004\u0012\u00020\u00140\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00140\u0006*\b\u0012\u0004\u0012\u00020\u00140\u0006H\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ\u001f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\u0006*\b\u0012\u0004\u0012\u00020\t0\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u001aJ\u0015\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010!\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\t¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0016\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0016\u0010,\u001a\b\u0012\u0004\u0012\u00020\t0\u0006HÆ\u0003¢\u0006\u0004\b,\u0010+J\u0012\u0010-\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b/\u0010.J\u0010\u00100\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b4\u00105J\u0012\u00106\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b8\u00105J\u0092\u0001\u00109\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u0012HÆ\u0001¢\u0006\u0004\b9\u0010:J\u0010\u0010;\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b;\u0010)J\u0010\u0010=\u001a\u00020<HÖ\u0001¢\u0006\u0004\b=\u0010>J\u001a\u0010@\u001a\u00020\u00122\b\u0010?\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b@\u0010AR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010B\u001a\u0004\bC\u0010'R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010D\u001a\u0004\bE\u0010)R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010F\u001a\u0004\bG\u0010+R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010F\u001a\u0004\bH\u0010+R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010I\u001a\u0004\bJ\u0010.R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010I\u001a\u0004\bK\u0010.R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010L\u001a\u0004\bM\u00101R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010N\u001a\u0004\bO\u00103R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010P\u001a\u0004\bQ\u00105R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010R\u001a\u0004\bS\u00107R\u0017\u0010\u0016\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0016\u0010P\u001a\u0004\bT\u00105R\u0014\u0010X\u001a\u00020U8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bV\u0010WR\u001a\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u00140\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bY\u0010+R\u0017\u0010\\\u001a\b\u0012\u0004\u0012\u00020\t0\u00068F¢\u0006\u0006\u001a\u0004\b[\u0010+R\u0011\u0010^\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b]\u00105R\u0011\u0010`\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b_\u00105R\u0013\u0010b\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\ba\u0010.R\u0011\u0010d\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\bc\u00105R\u0011\u0010f\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\be\u0010)R\u0011\u0010h\u001a\u00020<8G¢\u0006\u0006\u001a\u0004\bg\u0010>R\u0011\u0010j\u001a\u00020<8G¢\u0006\u0006\u001a\u0004\bi\u0010>R\u0011\u0010n\u001a\u00020k8F¢\u0006\u0006\u001a\u0004\bl\u0010mR\u0017\u0010p\u001a\b\u0012\u0004\u0012\u00020\u00140\u00068F¢\u0006\u0006\u001a\u0004\bo\u0010+R\u0011\u0010r\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\bq\u00105¨\u0006s"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/etp/EtpCompositionViewState;", "", "Ljava/util/UUID;", "instrumentId", "", "symbol", "", "Lcom/robinhood/models/db/bonfire/etp/EtpHolding;", CryptoDetailSource.HOLDINGS, "Lcom/robinhood/models/db/bonfire/etp/EtpSector;", "sectors", "j$/time/LocalDate", "holdingsPortfolioDate", "sectorsPortfolioDate", "Lcom/robinhood/models/api/bonfire/etp/BroadCategoryGroup;", "broadCategoryGroup", "Lcom/robinhood/android/equitydetail/ui/etp/EtpCompositionDataType;", "dataType", "", "listExpanded", "Lcom/robinhood/android/equitydetail/ui/etp/EtpCompositionItemHolder;", "activeItem", "showHoldingsDrawable", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lj$/time/LocalDate;Lj$/time/LocalDate;Lcom/robinhood/models/api/bonfire/etp/BroadCategoryGroup;Lcom/robinhood/android/equitydetail/ui/etp/EtpCompositionDataType;ZLcom/robinhood/android/equitydetail/ui/etp/EtpCompositionItemHolder;Z)V", "toggleInactiveItems", "(Ljava/util/List;)Ljava/util/List;", "adjustedForDisplayType", "addUnclassified", "Lcom/robinhood/models/db/EtpDetails;", ErrorBundle.DETAIL_ENTRY, "copyUsing", "(Lcom/robinhood/models/db/EtpDetails;)Lcom/robinhood/android/equitydetail/ui/etp/EtpCompositionViewState;", "hasSameData", "(Lcom/robinhood/models/db/EtpDetails;)Z", "sector", "activate", "(Lcom/robinhood/models/db/bonfire/etp/EtpSector;)Lcom/robinhood/android/equitydetail/ui/etp/EtpCompositionViewState;", "component1", "()Ljava/util/UUID;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/util/List;", "component4", "component5", "()Lj$/time/LocalDate;", "component6", "component7", "()Lcom/robinhood/models/api/bonfire/etp/BroadCategoryGroup;", "component8", "()Lcom/robinhood/android/equitydetail/ui/etp/EtpCompositionDataType;", "component9", "()Z", "component10", "()Lcom/robinhood/android/equitydetail/ui/etp/EtpCompositionItemHolder;", "component11", "copy", "(Ljava/util/UUID;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lj$/time/LocalDate;Lj$/time/LocalDate;Lcom/robinhood/models/api/bonfire/etp/BroadCategoryGroup;Lcom/robinhood/android/equitydetail/ui/etp/EtpCompositionDataType;ZLcom/robinhood/android/equitydetail/ui/etp/EtpCompositionItemHolder;Z)Lcom/robinhood/android/equitydetail/ui/etp/EtpCompositionViewState;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/UUID;", "getInstrumentId", "Ljava/lang/String;", "getSymbol", "Ljava/util/List;", "getHoldings", "getSectors", "Lj$/time/LocalDate;", "getHoldingsPortfolioDate", "getSectorsPortfolioDate", "Lcom/robinhood/models/api/bonfire/etp/BroadCategoryGroup;", "getBroadCategoryGroup", "Lcom/robinhood/android/equitydetail/ui/etp/EtpCompositionDataType;", "getDataType", "Z", "getListExpanded", "Lcom/robinhood/android/equitydetail/ui/etp/EtpCompositionItemHolder;", "getActiveItem", "getShowHoldingsDrawable", "", "getTotalHoldingsWeight", "()F", "totalHoldingsWeight", "getInternalItems", "internalItems", "getSectorsWithUncategorized", "sectorsWithUncategorized", "getShowBlocksDrawable", "showBlocksDrawable", "getShowCompositionRadioGroup", "showCompositionRadioGroup", "getPortfolioDate", "portfolioDate", "getShowTotalWeight", "showTotalWeight", "getTotalHoldingsWeightString", "totalHoldingsWeightString", "getTopHoldingsTextRes", "topHoldingsTextRes", "getTotalAssetsDescriptionRes", "totalAssetsDescriptionRes", "Lcom/robinhood/android/equitydetail/ui/etp/EtpCompositionDisplayType;", "getDisplayType", "()Lcom/robinhood/android/equitydetail/ui/etp/EtpCompositionDisplayType;", "displayType", "getExposedItems", "exposedItems", "getShowExpandButton", "showExpandButton", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final /* data */ class EtpCompositionViewState {
    public static final int $stable = 8;
    private final EtpCompositionItemHolder activeItem;
    private final BroadCategoryGroup broadCategoryGroup;
    private final EtpCompositionViewState2 dataType;
    private final List<EtpHolding> holdings;
    private final LocalDate holdingsPortfolioDate;
    private final UUID instrumentId;
    private final boolean listExpanded;
    private final List<EtpSector> sectors;
    private final LocalDate sectorsPortfolioDate;
    private final boolean showHoldingsDrawable;
    private final String symbol;

    /* compiled from: EtpCompositionViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[EtpCompositionViewState2.values().length];
            try {
                iArr[EtpCompositionViewState2.HOLDINGS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EtpCompositionViewState2.SECTORS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[EtpCompositionViewState3.values().length];
            try {
                iArr2[EtpCompositionViewState3.GRID.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[EtpCompositionViewState3.FLAT_LIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public EtpCompositionViewState() {
        this(null, null, null, null, null, null, null, null, false, null, false, 2047, null);
    }

    public static /* synthetic */ EtpCompositionViewState copy$default(EtpCompositionViewState etpCompositionViewState, UUID uuid, String str, List list, List list2, LocalDate localDate, LocalDate localDate2, BroadCategoryGroup broadCategoryGroup, EtpCompositionViewState2 etpCompositionViewState2, boolean z, EtpCompositionItemHolder etpCompositionItemHolder, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = etpCompositionViewState.instrumentId;
        }
        if ((i & 2) != 0) {
            str = etpCompositionViewState.symbol;
        }
        if ((i & 4) != 0) {
            list = etpCompositionViewState.holdings;
        }
        if ((i & 8) != 0) {
            list2 = etpCompositionViewState.sectors;
        }
        if ((i & 16) != 0) {
            localDate = etpCompositionViewState.holdingsPortfolioDate;
        }
        if ((i & 32) != 0) {
            localDate2 = etpCompositionViewState.sectorsPortfolioDate;
        }
        if ((i & 64) != 0) {
            broadCategoryGroup = etpCompositionViewState.broadCategoryGroup;
        }
        if ((i & 128) != 0) {
            etpCompositionViewState2 = etpCompositionViewState.dataType;
        }
        if ((i & 256) != 0) {
            z = etpCompositionViewState.listExpanded;
        }
        if ((i & 512) != 0) {
            etpCompositionItemHolder = etpCompositionViewState.activeItem;
        }
        if ((i & 1024) != 0) {
            z2 = etpCompositionViewState.showHoldingsDrawable;
        }
        EtpCompositionItemHolder etpCompositionItemHolder2 = etpCompositionItemHolder;
        boolean z3 = z2;
        EtpCompositionViewState2 etpCompositionViewState22 = etpCompositionViewState2;
        boolean z4 = z;
        LocalDate localDate3 = localDate2;
        BroadCategoryGroup broadCategoryGroup2 = broadCategoryGroup;
        LocalDate localDate4 = localDate;
        List list3 = list;
        return etpCompositionViewState.copy(uuid, str, list3, list2, localDate4, localDate3, broadCategoryGroup2, etpCompositionViewState22, z4, etpCompositionItemHolder2, z3);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getInstrumentId() {
        return this.instrumentId;
    }

    /* renamed from: component10, reason: from getter */
    public final EtpCompositionItemHolder getActiveItem() {
        return this.activeItem;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getShowHoldingsDrawable() {
        return this.showHoldingsDrawable;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    public final List<EtpHolding> component3() {
        return this.holdings;
    }

    public final List<EtpSector> component4() {
        return this.sectors;
    }

    /* renamed from: component5, reason: from getter */
    public final LocalDate getHoldingsPortfolioDate() {
        return this.holdingsPortfolioDate;
    }

    /* renamed from: component6, reason: from getter */
    public final LocalDate getSectorsPortfolioDate() {
        return this.sectorsPortfolioDate;
    }

    /* renamed from: component7, reason: from getter */
    public final BroadCategoryGroup getBroadCategoryGroup() {
        return this.broadCategoryGroup;
    }

    /* renamed from: component8, reason: from getter */
    public final EtpCompositionViewState2 getDataType() {
        return this.dataType;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getListExpanded() {
        return this.listExpanded;
    }

    public final EtpCompositionViewState copy(UUID instrumentId, String symbol, List<EtpHolding> holdings, List<EtpSector> sectors, LocalDate holdingsPortfolioDate, LocalDate sectorsPortfolioDate, BroadCategoryGroup broadCategoryGroup, EtpCompositionViewState2 dataType, boolean listExpanded, EtpCompositionItemHolder activeItem, boolean showHoldingsDrawable) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(holdings, "holdings");
        Intrinsics.checkNotNullParameter(sectors, "sectors");
        Intrinsics.checkNotNullParameter(broadCategoryGroup, "broadCategoryGroup");
        Intrinsics.checkNotNullParameter(dataType, "dataType");
        return new EtpCompositionViewState(instrumentId, symbol, holdings, sectors, holdingsPortfolioDate, sectorsPortfolioDate, broadCategoryGroup, dataType, listExpanded, activeItem, showHoldingsDrawable);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EtpCompositionViewState)) {
            return false;
        }
        EtpCompositionViewState etpCompositionViewState = (EtpCompositionViewState) other;
        return Intrinsics.areEqual(this.instrumentId, etpCompositionViewState.instrumentId) && Intrinsics.areEqual(this.symbol, etpCompositionViewState.symbol) && Intrinsics.areEqual(this.holdings, etpCompositionViewState.holdings) && Intrinsics.areEqual(this.sectors, etpCompositionViewState.sectors) && Intrinsics.areEqual(this.holdingsPortfolioDate, etpCompositionViewState.holdingsPortfolioDate) && Intrinsics.areEqual(this.sectorsPortfolioDate, etpCompositionViewState.sectorsPortfolioDate) && this.broadCategoryGroup == etpCompositionViewState.broadCategoryGroup && this.dataType == etpCompositionViewState.dataType && this.listExpanded == etpCompositionViewState.listExpanded && Intrinsics.areEqual(this.activeItem, etpCompositionViewState.activeItem) && this.showHoldingsDrawable == etpCompositionViewState.showHoldingsDrawable;
    }

    public int hashCode() {
        UUID uuid = this.instrumentId;
        int iHashCode = (((((((uuid == null ? 0 : uuid.hashCode()) * 31) + this.symbol.hashCode()) * 31) + this.holdings.hashCode()) * 31) + this.sectors.hashCode()) * 31;
        LocalDate localDate = this.holdingsPortfolioDate;
        int iHashCode2 = (iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31;
        LocalDate localDate2 = this.sectorsPortfolioDate;
        int iHashCode3 = (((((((iHashCode2 + (localDate2 == null ? 0 : localDate2.hashCode())) * 31) + this.broadCategoryGroup.hashCode()) * 31) + this.dataType.hashCode()) * 31) + Boolean.hashCode(this.listExpanded)) * 31;
        EtpCompositionItemHolder etpCompositionItemHolder = this.activeItem;
        return ((iHashCode3 + (etpCompositionItemHolder != null ? etpCompositionItemHolder.hashCode() : 0)) * 31) + Boolean.hashCode(this.showHoldingsDrawable);
    }

    public String toString() {
        return "EtpCompositionViewState(instrumentId=" + this.instrumentId + ", symbol=" + this.symbol + ", holdings=" + this.holdings + ", sectors=" + this.sectors + ", holdingsPortfolioDate=" + this.holdingsPortfolioDate + ", sectorsPortfolioDate=" + this.sectorsPortfolioDate + ", broadCategoryGroup=" + this.broadCategoryGroup + ", dataType=" + this.dataType + ", listExpanded=" + this.listExpanded + ", activeItem=" + this.activeItem + ", showHoldingsDrawable=" + this.showHoldingsDrawable + ")";
    }

    public EtpCompositionViewState(UUID uuid, String symbol, List<EtpHolding> holdings, List<EtpSector> sectors, LocalDate localDate, LocalDate localDate2, BroadCategoryGroup broadCategoryGroup, EtpCompositionViewState2 dataType, boolean z, EtpCompositionItemHolder etpCompositionItemHolder, boolean z2) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(holdings, "holdings");
        Intrinsics.checkNotNullParameter(sectors, "sectors");
        Intrinsics.checkNotNullParameter(broadCategoryGroup, "broadCategoryGroup");
        Intrinsics.checkNotNullParameter(dataType, "dataType");
        this.instrumentId = uuid;
        this.symbol = symbol;
        this.holdings = holdings;
        this.sectors = sectors;
        this.holdingsPortfolioDate = localDate;
        this.sectorsPortfolioDate = localDate2;
        this.broadCategoryGroup = broadCategoryGroup;
        this.dataType = dataType;
        this.listExpanded = z;
        this.activeItem = etpCompositionItemHolder;
        this.showHoldingsDrawable = z2;
    }

    public final UUID getInstrumentId() {
        return this.instrumentId;
    }

    public /* synthetic */ EtpCompositionViewState(UUID uuid, String str, List list, List list2, LocalDate localDate, LocalDate localDate2, BroadCategoryGroup broadCategoryGroup, EtpCompositionViewState2 etpCompositionViewState2, boolean z, EtpCompositionItemHolder etpCompositionItemHolder, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uuid, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? CollectionsKt.emptyList() : list2, (i & 16) != 0 ? null : localDate, (i & 32) != 0 ? null : localDate2, (i & 64) != 0 ? BroadCategoryGroup.UNKNOWN : broadCategoryGroup, (i & 128) != 0 ? EtpCompositionViewState2.SECTORS : etpCompositionViewState2, (i & 256) != 0 ? false : z, (i & 512) != 0 ? null : etpCompositionItemHolder, (i & 1024) != 0 ? true : z2);
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final List<EtpHolding> getHoldings() {
        return this.holdings;
    }

    public final List<EtpSector> getSectors() {
        return this.sectors;
    }

    public final LocalDate getHoldingsPortfolioDate() {
        return this.holdingsPortfolioDate;
    }

    public final LocalDate getSectorsPortfolioDate() {
        return this.sectorsPortfolioDate;
    }

    public final BroadCategoryGroup getBroadCategoryGroup() {
        return this.broadCategoryGroup;
    }

    public final EtpCompositionViewState2 getDataType() {
        return this.dataType;
    }

    public final boolean getListExpanded() {
        return this.listExpanded;
    }

    public final EtpCompositionItemHolder getActiveItem() {
        return this.activeItem;
    }

    public final boolean getShowHoldingsDrawable() {
        return this.showHoldingsDrawable;
    }

    public final List<EtpSector> getSectorsWithUncategorized() {
        List<EtpHolding> list = this.holdings;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual(((EtpHolding) it.next()).getSector(), EtpSector.UNCATEGORIZED)) {
                    return addUnclassified(this.sectors);
                }
            }
        }
        return this.sectors;
    }

    public final boolean getShowBlocksDrawable() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.dataType.ordinal()];
        if (i == 1) {
            return this.showHoldingsDrawable;
        }
        if (i == 2) {
            return !this.sectors.isEmpty();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean getShowCompositionRadioGroup() {
        return (this.sectors.isEmpty() || this.holdings.isEmpty()) ? false : true;
    }

    public final LocalDate getPortfolioDate() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.dataType.ordinal()];
        if (i == 1) {
            return this.holdingsPortfolioDate;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return this.sectorsPortfolioDate;
    }

    private final float getTotalHoldingsWeight() {
        List<EtpHolding> list = this.holdings;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf(((EtpHolding) it.next()).getWeight()));
        }
        return CollectionsKt.sumOfFloat(arrayList);
    }

    public final boolean getShowTotalWeight() {
        return this.dataType == EtpCompositionViewState2.HOLDINGS && this.symbol.length() > 0 && getTotalHoldingsWeight() != 0.0f && this.holdings.size() > 1;
    }

    public final String getTotalHoldingsWeightString() {
        NumberFormatter leadingZeroesHundredthPercentFormat;
        if (getTotalHoldingsWeight() == 100.0f) {
            leadingZeroesHundredthPercentFormat = Formats.getWholeNumberWithPercentageSuffixFormat();
        } else {
            leadingZeroesHundredthPercentFormat = Formats.getLeadingZeroesHundredthPercentFormat();
        }
        return leadingZeroesHundredthPercentFormat.format(Float.valueOf(getTotalHoldingsWeight()));
    }

    public final int getTopHoldingsTextRes() {
        if (this.holdings.size() == 10) {
            return C15314R.string.etp_composition_top_ten_holdings;
        }
        return C15314R.string.etp_composition_top_holdings;
    }

    public final int getTotalAssetsDescriptionRes() {
        return !this.sectors.isEmpty() ? C15314R.string.etp_composition_total_assets_text : this.holdings.size() == 10 ? C15314R.string.etp_composition_no_sector_top_ten_assets_text : C15314R.string.etp_composition_no_sector_assets_text;
    }

    public final EtpCompositionViewState3 getDisplayType() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.dataType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (this.sectors.size() == 1) {
                return EtpCompositionViewState3.FLAT_LIST;
            }
            return EtpCompositionViewState3.GRID;
        }
        if (this.holdings.size() == 1) {
            return EtpCompositionViewState3.FLAT_LIST;
        }
        if (this.sectors.isEmpty() || !this.showHoldingsDrawable) {
            return EtpCompositionViewState3.FLAT_LIST;
        }
        return this.broadCategoryGroup == BroadCategoryGroup.EQUITY ? EtpCompositionViewState3.GRID : EtpCompositionViewState3.FLAT_LIST;
    }

    private final List<EtpCompositionItemHolder> getInternalItems() {
        ArrayList arrayList;
        int i = WhenMappings.$EnumSwitchMapping$0[this.dataType.ordinal()];
        if (i == 1) {
            List<EtpHolding> list = this.holdings;
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new EtpCompositionItemHolder.Holding(EtpCompositionItemHolder2.toUiModel((EtpHolding) it.next()), false, this.showHoldingsDrawable, false, 10, null));
            }
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            List<EtpSector> list2 = this.sectors;
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList.add(new EtpCompositionItemHolder.Sector((EtpSector) it2.next(), false, 2, null));
            }
        }
        return toggleInactiveItems(arrayList);
    }

    public final List<EtpCompositionItemHolder> getExposedItems() {
        return adjustedForDisplayType(getInternalItems());
    }

    public final boolean getShowExpandButton() {
        return getDisplayType() == EtpCompositionViewState3.FLAT_LIST && getInternalItems().size() > 3;
    }

    public final EtpCompositionViewState copyUsing(EtpDetails details) {
        Intrinsics.checkNotNullParameter(details, "details");
        return copy$default(this, details.getInstrumentId(), details.getSymbol(), details.getHoldings(), details.getSectors(), details.getHoldingsPortfolioDate(), details.getSectorsPortfolioDate(), details.getBroadCategoryGroup(), EtpCompositionViewState4.getInitialDataType(details), false, null, details.getShowHoldingsVisualization(), 512, null);
    }

    public final boolean hasSameData(EtpDetails details) {
        Intrinsics.checkNotNullParameter(details, "details");
        return Intrinsics.areEqual(this.instrumentId, details.getInstrumentId()) && Intrinsics.areEqual(this.symbol, details.getSymbol()) && Intrinsics.areEqual(this.holdings, details.getHoldings()) && Intrinsics.areEqual(this.sectors, details.getSectors()) && Intrinsics.areEqual(this.holdingsPortfolioDate, details.getHoldingsPortfolioDate()) && Intrinsics.areEqual(this.sectorsPortfolioDate, details.getSectorsPortfolioDate()) && this.broadCategoryGroup == details.getBroadCategoryGroup();
    }

    public final EtpCompositionViewState activate(EtpSector sector) {
        Intrinsics.checkNotNullParameter(sector, "sector");
        return copy$default(this, null, null, null, null, null, null, null, null, false, new EtpCompositionItemHolder.Sector(sector, false, 2, null), false, 1535, null);
    }

    private final List<EtpCompositionItemHolder> toggleInactiveItems(List<? extends EtpCompositionItemHolder> list) {
        List<? extends EtpCompositionItemHolder> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (EtpCompositionItemHolder etpCompositionItemHolderInactiveCopy : list2) {
            if (etpCompositionItemHolderInactiveCopy instanceof EtpCompositionItemHolder.Sector) {
                EtpCompositionItemHolder etpCompositionItemHolder = this.activeItem;
                if (etpCompositionItemHolder != null && !(etpCompositionItemHolder instanceof EtpCompositionItemHolder.Holding)) {
                    if (!(etpCompositionItemHolder instanceof EtpCompositionItemHolder.Sector)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (!Intrinsics.areEqual(((EtpCompositionItemHolder.Sector) etpCompositionItemHolderInactiveCopy).getSector(), ((EtpCompositionItemHolder.Sector) this.activeItem).getSector())) {
                        etpCompositionItemHolderInactiveCopy = etpCompositionItemHolderInactiveCopy.inactiveCopy();
                    }
                }
            } else {
                if (!(etpCompositionItemHolderInactiveCopy instanceof EtpCompositionItemHolder.Holding)) {
                    throw new NoWhenBranchMatchedException();
                }
                EtpCompositionItemHolder etpCompositionItemHolder2 = this.activeItem;
                if (etpCompositionItemHolder2 == null) {
                    continue;
                } else if (etpCompositionItemHolder2 instanceof EtpCompositionItemHolder.Holding) {
                    if (!Intrinsics.areEqual(((EtpCompositionItemHolder.Holding) etpCompositionItemHolderInactiveCopy).getHolding(), ((EtpCompositionItemHolder.Holding) this.activeItem).getHolding())) {
                        etpCompositionItemHolderInactiveCopy = etpCompositionItemHolderInactiveCopy.inactiveCopy();
                    }
                } else {
                    if (!(etpCompositionItemHolder2 instanceof EtpCompositionItemHolder.Sector)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (!Intrinsics.areEqual(((EtpCompositionItemHolder.Holding) etpCompositionItemHolderInactiveCopy).getHolding().getSector(), ((EtpCompositionItemHolder.Sector) this.activeItem).getSector().getName())) {
                        etpCompositionItemHolderInactiveCopy = etpCompositionItemHolderInactiveCopy.inactiveCopy();
                    }
                }
            }
            arrayList.add(etpCompositionItemHolderInactiveCopy);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List<EtpCompositionItemHolder> adjustedForDisplayType(List<? extends EtpCompositionItemHolder> list) {
        int i = WhenMappings.$EnumSwitchMapping$1[getDisplayType().ordinal()];
        if (i == 1) {
            return list;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        List listTake = this.listExpanded ? list : CollectionsKt.take(list, 3);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listTake, 10));
        int i2 = 0;
        for (Object obj : listTake) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            arrayList.add(((EtpCompositionItemHolder) obj).bottomDividerCopy(i2 != list.size() - 1));
            i2 = i3;
        }
        return arrayList;
    }

    private final List<EtpSector> addUnclassified(List<EtpSector> list) {
        List<EtpSector> list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual(((EtpSector) it.next()).getName(), EtpSector.UNCATEGORIZED)) {
                    return list;
                }
            }
        }
        return CollectionsKt.plus((Collection) list, (Iterable) CollectionsKt.listOf(EtpCompositionViewState4.unclassifiedSector));
    }
}
