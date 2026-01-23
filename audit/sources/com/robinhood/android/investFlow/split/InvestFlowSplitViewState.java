package com.robinhood.android.investFlow.split;

import com.robinhood.android.investFlow.C19349R;
import com.robinhood.android.investFlow.InvestFlowConstants;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.models.portfolio.PositionsSortPreference;
import com.robinhood.android.models.portfolio.api.PositionsSortDirection;
import com.robinhood.android.models.portfolio.api.PositionsSortType;
import com.robinhood.android.recurring.contracts.investflow.InvestFlowFrequency;
import com.robinhood.investflow.models.api.ApiAssetAllocation;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.phoenix.UnifiedAccountV2;
import com.robinhood.models.util.Money;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.ResourceTypes;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InvestFlowSplitViewState.kt */
@Metadata(m3635d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001:\u0006\u0084\u0001\u0085\u0001\u0086\u0001Bí\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0018\u00010\t\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\t\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\t\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\t\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014\u0012\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\n\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\t\u0012\u0014\b\u0002\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00030\u0014\u0012\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u0014\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\u001f\u0010 J\b\u0010B\u001a\u00020\u0016H\u0002J\u0012\u0010e\u001a\u0004\u0018\u00010\u00182\u0006\u0010f\u001a\u00020\u0015H\u0002J\u0010\u0010g\u001a\u0004\u0018\u00010\u001a2\u0006\u0010f\u001a\u00020\u0015J\u0010\u0010h\u001a\u0004\u0018\u00010\u001a2\u0006\u0010f\u001a\u00020\u0015J\u000b\u0010q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010r\u001a\u00020\u0005HÂ\u0003J\t\u0010s\u001a\u00020\u0007HÆ\u0003J\u0017\u0010t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0018\u00010\tHÆ\u0003J\u0011\u0010u\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\tHÆ\u0003J\u0011\u0010v\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\tHÆ\u0003J\u0011\u0010w\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\tHÆ\u0003J\u000b\u0010x\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u0015\u0010y\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014HÆ\u0003J\u000f\u0010z\u001a\b\u0012\u0004\u0012\u00020\u00180\nHÆ\u0003J\u0011\u0010{\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\tHÆ\u0003J\u0015\u0010|\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00030\u0014HÂ\u0003J\u0015\u0010}\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u0014HÂ\u0003J\u000b\u0010~\u001a\u0004\u0018\u00010\u001eHÂ\u0003Jó\u0001\u0010\u007f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0018\u00010\t2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\t2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\t2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00142\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\n2\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\t2\u0014\b\u0002\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00030\u00142\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u00142\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÆ\u0001J\u0015\u0010\u0080\u0001\u001a\u00020\u00072\t\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010\u0082\u0001\u001a\u00020bHÖ\u0001J\n\u0010\u0083\u0001\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010#R\u001f\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0019\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b'\u0010%R\u0019\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b(\u0010%R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u001d\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\n¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0019\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b/\u0010%R\u001a\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00030\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00030\u0014¢\u0006\b\n\u0000\u001a\u0004\b1\u0010,R\u0011\u00102\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b3\u0010#R\u0017\u00104\u001a\b\u0012\u0004\u0012\u0002050\n8F¢\u0006\u0006\u001a\u0004\b6\u0010.R\u0013\u00107\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\b8\u00109R\u0016\u0010:\u001a\u0004\u0018\u00010\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b;\u0010\"R\u0011\u0010<\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b=\u0010#R\u0011\u0010>\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b?\u00109R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00160\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bA\u0010.R\u0014\u0010C\u001a\u00020D8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0011\u0010G\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\bH\u00109R\u0011\u0010I\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bJ\u0010#R\u0011\u0010K\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\bL\u00109R\u0011\u0010M\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\bN\u00109R\u0011\u0010O\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bP\u0010#R\u0011\u0010Q\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\bR\u00109R\u0011\u0010S\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\bT\u00109R\u0011\u0010U\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bV\u0010#R\u0014\u0010W\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bX\u0010#R\u0014\u0010Y\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010#R\u0016\u0010[\u001a\u0004\u0018\u00010\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010\"R\u0013\u0010]\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\b^\u00109R\u0013\u0010_\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\b`\u00109R\u0011\u0010a\u001a\u00020b8F¢\u0006\u0006\u001a\u0004\bc\u0010dR\u0011\u0010i\u001a\u00020j8F¢\u0006\u0006\u001a\u0004\bk\u0010lR\u0011\u0010m\u001a\u00020n8F¢\u0006\u0006\u001a\u0004\bo\u0010p¨\u0006\u0087\u0001"}, m3636d2 = {"Lcom/robinhood/android/investFlow/split/InvestFlowSplitViewState;", "", "totalAmount", "Lcom/robinhood/models/util/Money;", "selectedFrequency", "Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowFrequency;", "isCrypto", "", "confirmUiEvent", "Lcom/robinhood/udf/UiEvent;", "", "Lcom/robinhood/investflow/models/api/ApiAssetAllocation;", "alertUiEvent", "Lcom/robinhood/android/investFlow/split/InvestFlowSplitViewState$PriceAlertType;", "resetUiEvent", "", "requestInputFocusEvent", "sortPreference", "Lcom/robinhood/android/models/portfolio/PositionsSortPreference;", "sortInfoMap", "", "Ljava/util/UUID;", "", "instrumentList", "Lcom/robinhood/models/db/Instrument;", "bottomSheetUiEvent", "Lcom/robinhood/utils/resource/StringResource;", "defaultAssetAllocations", "customAssetAllocations", "unifiedAccount", "Lcom/robinhood/models/db/phoenix/UnifiedAccountV2;", "<init>", "(Lcom/robinhood/models/util/Money;Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowFrequency;ZLcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/android/models/portfolio/PositionsSortPreference;Ljava/util/Map;Ljava/util/List;Lcom/robinhood/udf/UiEvent;Ljava/util/Map;Ljava/util/Map;Lcom/robinhood/models/db/phoenix/UnifiedAccountV2;)V", "getTotalAmount", "()Lcom/robinhood/models/util/Money;", "()Z", "getConfirmUiEvent", "()Lcom/robinhood/udf/UiEvent;", "getAlertUiEvent", "getResetUiEvent", "getRequestInputFocusEvent", "getSortPreference", "()Lcom/robinhood/android/models/portfolio/PositionsSortPreference;", "getSortInfoMap", "()Ljava/util/Map;", "getInstrumentList", "()Ljava/util/List;", "getBottomSheetUiEvent", "assetAllocations", "getAssetAllocations", "readyToContinue", "getReadyToContinue", "defaultAssetRows", "Lcom/robinhood/android/investFlow/split/InvestFlowSplitViewState$Row;", "getDefaultAssetRows", "amountViewText", "getAmountViewText", "()Lcom/robinhood/utils/resource/StringResource;", "userAllocationSum", "getUserAllocationSum", "showMinAlert", "getShowMinAlert", "minAlertTitle", "getMinAlertTitle", "assetNamesBelowMinimum", "getAssetNamesBelowMinimum", "assetNamesBelowMinimumString", "maxOrderAmount", "Ljava/math/BigDecimal;", "getMaxOrderAmount", "()Ljava/math/BigDecimal;", "minAlertMessage", "getMinAlertMessage", "showMaxAlert", "getShowMaxAlert", "maxAlertTitle", "getMaxAlertTitle", "maxAlertMsg", "getMaxAlertMsg", "showNotEnoughBuyingPowerAlert", "getShowNotEnoughBuyingPowerAlert", "notEnoughBuyingPowerAlertTitle", "getNotEnoughBuyingPowerAlertTitle", "notEnoughBuyingPowerAlertMsg", "getNotEnoughBuyingPowerAlertMsg", "showBottomSheet", "getShowBottomSheet", "amountGreater", "getAmountGreater", "amountLower", "getAmountLower", "allocationDifference", "getAllocationDifference", "bannerText", "getBannerText", "buyingPowerText", "getBuyingPowerText", "numSelectedInstruments", "", "getNumSelectedInstruments", "()I", "getInstrumentByAssetId", "assetId", "getUntradableDialogTitle", "getUntradableDialogMessage", "sortActionConfig", "Lcom/robinhood/android/investFlow/split/InvestFlowSplitViewState$SortActionConfig;", "getSortActionConfig", "()Lcom/robinhood/android/investFlow/split/InvestFlowSplitViewState$SortActionConfig;", "screen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "equals", "other", "hashCode", "toString", "Row", "PriceAlertType", "SortActionConfig", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final /* data */ class InvestFlowSplitViewState {
    public static final int $stable = 8;
    private final UiEvent<PriceAlertType> alertUiEvent;
    private final Map<Instrument, Money> assetAllocations;
    private final UiEvent<StringResource> bottomSheetUiEvent;
    private final UiEvent<List<ApiAssetAllocation>> confirmUiEvent;
    private final Map<UUID, Money> customAssetAllocations;
    private final Map<Instrument, Money> defaultAssetAllocations;
    private final List<Instrument> instrumentList;
    private final boolean isCrypto;
    private final boolean readyToContinue;
    private final UiEvent<Unit> requestInputFocusEvent;
    private final UiEvent<Unit> resetUiEvent;
    private final InvestFlowFrequency selectedFrequency;
    private final Map<UUID, String> sortInfoMap;
    private final PositionsSortPreference sortPreference;
    private final Money totalAmount;
    private final UnifiedAccountV2 unifiedAccount;

    /* compiled from: InvestFlowSplitViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PositionsSortDirection.values().length];
            try {
                iArr[PositionsSortDirection.ASC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PositionsSortDirection.DSC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final Map<Instrument, Money> component12() {
        return this.defaultAssetAllocations;
    }

    private final Map<UUID, Money> component13() {
        return this.customAssetAllocations;
    }

    /* renamed from: component14, reason: from getter */
    private final UnifiedAccountV2 getUnifiedAccount() {
        return this.unifiedAccount;
    }

    /* renamed from: component2, reason: from getter */
    private final InvestFlowFrequency getSelectedFrequency() {
        return this.selectedFrequency;
    }

    /* renamed from: component1, reason: from getter */
    public final Money getTotalAmount() {
        return this.totalAmount;
    }

    public final List<Instrument> component10() {
        return this.instrumentList;
    }

    public final UiEvent<StringResource> component11() {
        return this.bottomSheetUiEvent;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsCrypto() {
        return this.isCrypto;
    }

    public final UiEvent<List<ApiAssetAllocation>> component4() {
        return this.confirmUiEvent;
    }

    public final UiEvent<PriceAlertType> component5() {
        return this.alertUiEvent;
    }

    public final UiEvent<Unit> component6() {
        return this.resetUiEvent;
    }

    public final UiEvent<Unit> component7() {
        return this.requestInputFocusEvent;
    }

    /* renamed from: component8, reason: from getter */
    public final PositionsSortPreference getSortPreference() {
        return this.sortPreference;
    }

    public final Map<UUID, String> component9() {
        return this.sortInfoMap;
    }

    public final InvestFlowSplitViewState copy(Money totalAmount, InvestFlowFrequency selectedFrequency, boolean isCrypto, UiEvent<List<ApiAssetAllocation>> confirmUiEvent, UiEvent<PriceAlertType> alertUiEvent, UiEvent<Unit> resetUiEvent, UiEvent<Unit> requestInputFocusEvent, PositionsSortPreference sortPreference, Map<UUID, String> sortInfoMap, List<Instrument> instrumentList, UiEvent<StringResource> bottomSheetUiEvent, Map<Instrument, Money> defaultAssetAllocations, Map<UUID, Money> customAssetAllocations, UnifiedAccountV2 unifiedAccount) {
        Intrinsics.checkNotNullParameter(selectedFrequency, "selectedFrequency");
        Intrinsics.checkNotNullParameter(sortInfoMap, "sortInfoMap");
        Intrinsics.checkNotNullParameter(instrumentList, "instrumentList");
        Intrinsics.checkNotNullParameter(defaultAssetAllocations, "defaultAssetAllocations");
        Intrinsics.checkNotNullParameter(customAssetAllocations, "customAssetAllocations");
        return new InvestFlowSplitViewState(totalAmount, selectedFrequency, isCrypto, confirmUiEvent, alertUiEvent, resetUiEvent, requestInputFocusEvent, sortPreference, sortInfoMap, instrumentList, bottomSheetUiEvent, defaultAssetAllocations, customAssetAllocations, unifiedAccount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InvestFlowSplitViewState)) {
            return false;
        }
        InvestFlowSplitViewState investFlowSplitViewState = (InvestFlowSplitViewState) other;
        return Intrinsics.areEqual(this.totalAmount, investFlowSplitViewState.totalAmount) && Intrinsics.areEqual(this.selectedFrequency, investFlowSplitViewState.selectedFrequency) && this.isCrypto == investFlowSplitViewState.isCrypto && Intrinsics.areEqual(this.confirmUiEvent, investFlowSplitViewState.confirmUiEvent) && Intrinsics.areEqual(this.alertUiEvent, investFlowSplitViewState.alertUiEvent) && Intrinsics.areEqual(this.resetUiEvent, investFlowSplitViewState.resetUiEvent) && Intrinsics.areEqual(this.requestInputFocusEvent, investFlowSplitViewState.requestInputFocusEvent) && Intrinsics.areEqual(this.sortPreference, investFlowSplitViewState.sortPreference) && Intrinsics.areEqual(this.sortInfoMap, investFlowSplitViewState.sortInfoMap) && Intrinsics.areEqual(this.instrumentList, investFlowSplitViewState.instrumentList) && Intrinsics.areEqual(this.bottomSheetUiEvent, investFlowSplitViewState.bottomSheetUiEvent) && Intrinsics.areEqual(this.defaultAssetAllocations, investFlowSplitViewState.defaultAssetAllocations) && Intrinsics.areEqual(this.customAssetAllocations, investFlowSplitViewState.customAssetAllocations) && Intrinsics.areEqual(this.unifiedAccount, investFlowSplitViewState.unifiedAccount);
    }

    public int hashCode() {
        Money money = this.totalAmount;
        int iHashCode = (((((money == null ? 0 : money.hashCode()) * 31) + this.selectedFrequency.hashCode()) * 31) + Boolean.hashCode(this.isCrypto)) * 31;
        UiEvent<List<ApiAssetAllocation>> uiEvent = this.confirmUiEvent;
        int iHashCode2 = (iHashCode + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        UiEvent<PriceAlertType> uiEvent2 = this.alertUiEvent;
        int iHashCode3 = (iHashCode2 + (uiEvent2 == null ? 0 : uiEvent2.hashCode())) * 31;
        UiEvent<Unit> uiEvent3 = this.resetUiEvent;
        int iHashCode4 = (iHashCode3 + (uiEvent3 == null ? 0 : uiEvent3.hashCode())) * 31;
        UiEvent<Unit> uiEvent4 = this.requestInputFocusEvent;
        int iHashCode5 = (iHashCode4 + (uiEvent4 == null ? 0 : uiEvent4.hashCode())) * 31;
        PositionsSortPreference positionsSortPreference = this.sortPreference;
        int iHashCode6 = (((((iHashCode5 + (positionsSortPreference == null ? 0 : positionsSortPreference.hashCode())) * 31) + this.sortInfoMap.hashCode()) * 31) + this.instrumentList.hashCode()) * 31;
        UiEvent<StringResource> uiEvent5 = this.bottomSheetUiEvent;
        int iHashCode7 = (((((iHashCode6 + (uiEvent5 == null ? 0 : uiEvent5.hashCode())) * 31) + this.defaultAssetAllocations.hashCode()) * 31) + this.customAssetAllocations.hashCode()) * 31;
        UnifiedAccountV2 unifiedAccountV2 = this.unifiedAccount;
        return iHashCode7 + (unifiedAccountV2 != null ? unifiedAccountV2.hashCode() : 0);
    }

    public String toString() {
        return "InvestFlowSplitViewState(totalAmount=" + this.totalAmount + ", selectedFrequency=" + this.selectedFrequency + ", isCrypto=" + this.isCrypto + ", confirmUiEvent=" + this.confirmUiEvent + ", alertUiEvent=" + this.alertUiEvent + ", resetUiEvent=" + this.resetUiEvent + ", requestInputFocusEvent=" + this.requestInputFocusEvent + ", sortPreference=" + this.sortPreference + ", sortInfoMap=" + this.sortInfoMap + ", instrumentList=" + this.instrumentList + ", bottomSheetUiEvent=" + this.bottomSheetUiEvent + ", defaultAssetAllocations=" + this.defaultAssetAllocations + ", customAssetAllocations=" + this.customAssetAllocations + ", unifiedAccount=" + this.unifiedAccount + ")";
    }

    public InvestFlowSplitViewState(Money money, InvestFlowFrequency selectedFrequency, boolean z, UiEvent<List<ApiAssetAllocation>> uiEvent, UiEvent<PriceAlertType> uiEvent2, UiEvent<Unit> uiEvent3, UiEvent<Unit> uiEvent4, PositionsSortPreference positionsSortPreference, Map<UUID, String> sortInfoMap, List<Instrument> instrumentList, UiEvent<StringResource> uiEvent5, Map<Instrument, Money> defaultAssetAllocations, Map<UUID, Money> customAssetAllocations, UnifiedAccountV2 unifiedAccountV2) {
        boolean z2;
        Intrinsics.checkNotNullParameter(selectedFrequency, "selectedFrequency");
        Intrinsics.checkNotNullParameter(sortInfoMap, "sortInfoMap");
        Intrinsics.checkNotNullParameter(instrumentList, "instrumentList");
        Intrinsics.checkNotNullParameter(defaultAssetAllocations, "defaultAssetAllocations");
        Intrinsics.checkNotNullParameter(customAssetAllocations, "customAssetAllocations");
        this.totalAmount = money;
        this.selectedFrequency = selectedFrequency;
        this.isCrypto = z;
        this.confirmUiEvent = uiEvent;
        this.alertUiEvent = uiEvent2;
        this.resetUiEvent = uiEvent3;
        this.requestInputFocusEvent = uiEvent4;
        this.sortPreference = positionsSortPreference;
        this.sortInfoMap = sortInfoMap;
        this.instrumentList = instrumentList;
        this.bottomSheetUiEvent = uiEvent5;
        this.defaultAssetAllocations = defaultAssetAllocations;
        this.customAssetAllocations = customAssetAllocations;
        this.unifiedAccount = unifiedAccountV2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<Instrument, Money> entry : defaultAssetAllocations.entrySet()) {
            Instrument key = entry.getKey();
            if (!entry.getValue().isZero() || this.customAssetAllocations.containsKey(key.getId())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.mapCapacity(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key2 = entry2.getKey();
            Instrument instrument = (Instrument) entry2.getKey();
            Money money2 = (Money) entry2.getValue();
            Money money3 = this.customAssetAllocations.get(instrument.getId());
            if (money3 != null) {
                money2 = money3;
            }
            linkedHashMap2.put(key2, money2);
        }
        this.assetAllocations = linkedHashMap2;
        Collection collectionValues = linkedHashMap2.values();
        if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
            z2 = true;
        } else {
            Iterator it = collectionValues.iterator();
            while (it.hasNext()) {
                if (!((Money) it.next()).isZero()) {
                    z2 = false;
                    break;
                }
            }
            z2 = true;
        }
        this.readyToContinue = !z2;
    }

    public final Money getTotalAmount() {
        return this.totalAmount;
    }

    public final boolean isCrypto() {
        return this.isCrypto;
    }

    public final UiEvent<List<ApiAssetAllocation>> getConfirmUiEvent() {
        return this.confirmUiEvent;
    }

    public final UiEvent<PriceAlertType> getAlertUiEvent() {
        return this.alertUiEvent;
    }

    public final UiEvent<Unit> getResetUiEvent() {
        return this.resetUiEvent;
    }

    public final UiEvent<Unit> getRequestInputFocusEvent() {
        return this.requestInputFocusEvent;
    }

    public final PositionsSortPreference getSortPreference() {
        return this.sortPreference;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ InvestFlowSplitViewState(com.robinhood.models.util.Money r18, com.robinhood.android.recurring.contracts.investflow.InvestFlowFrequency r19, boolean r20, com.robinhood.udf.UiEvent r21, com.robinhood.udf.UiEvent r22, com.robinhood.udf.UiEvent r23, com.robinhood.udf.UiEvent r24, com.robinhood.android.models.portfolio.PositionsSortPreference r25, java.util.Map r26, java.util.List r27, com.robinhood.udf.UiEvent r28, java.util.Map r29, java.util.Map r30, com.robinhood.models.p320db.phoenix.UnifiedAccountV2 r31, int r32, kotlin.jvm.internal.DefaultConstructorMarker r33) {
        /*
            r17 = this;
            r0 = r32
            r1 = r0 & 4
            if (r1 == 0) goto L9
            r1 = 0
            r5 = r1
            goto Lb
        L9:
            r5 = r20
        Lb:
            r1 = r0 & 8
            r2 = 0
            if (r1 == 0) goto L12
            r6 = r2
            goto L14
        L12:
            r6 = r21
        L14:
            r1 = r0 & 16
            if (r1 == 0) goto L1a
            r7 = r2
            goto L1c
        L1a:
            r7 = r22
        L1c:
            r1 = r0 & 32
            if (r1 == 0) goto L22
            r8 = r2
            goto L24
        L22:
            r8 = r23
        L24:
            r1 = r0 & 64
            if (r1 == 0) goto L2a
            r9 = r2
            goto L2c
        L2a:
            r9 = r24
        L2c:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L32
            r10 = r2
            goto L34
        L32:
            r10 = r25
        L34:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L3e
            java.util.Map r1 = kotlin.collections.MapsKt.emptyMap()
            r11 = r1
            goto L40
        L3e:
            r11 = r26
        L40:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L4a
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
            r12 = r1
            goto L4c
        L4a:
            r12 = r27
        L4c:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L52
            r13 = r2
            goto L54
        L52:
            r13 = r28
        L54:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L5e
            java.util.Map r1 = kotlin.collections.MapsKt.emptyMap()
            r14 = r1
            goto L60
        L5e:
            r14 = r29
        L60:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L6a
            java.util.Map r1 = kotlin.collections.MapsKt.emptyMap()
            r15 = r1
            goto L6c
        L6a:
            r15 = r30
        L6c:
            r0 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L79
            r16 = r2
            r3 = r18
            r4 = r19
            r2 = r17
            goto L81
        L79:
            r16 = r31
            r2 = r17
            r3 = r18
            r4 = r19
        L81:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.investFlow.split.InvestFlowSplitViewState.<init>(com.robinhood.models.util.Money, com.robinhood.android.recurring.contracts.investflow.InvestFlowFrequency, boolean, com.robinhood.udf.UiEvent, com.robinhood.udf.UiEvent, com.robinhood.udf.UiEvent, com.robinhood.udf.UiEvent, com.robinhood.android.models.portfolio.PositionsSortPreference, java.util.Map, java.util.List, com.robinhood.udf.UiEvent, java.util.Map, java.util.Map, com.robinhood.models.db.phoenix.UnifiedAccountV2, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final Map<UUID, String> getSortInfoMap() {
        return this.sortInfoMap;
    }

    public final List<Instrument> getInstrumentList() {
        return this.instrumentList;
    }

    public final UiEvent<StringResource> getBottomSheetUiEvent() {
        return this.bottomSheetUiEvent;
    }

    public final Map<Instrument, Money> getAssetAllocations() {
        return this.assetAllocations;
    }

    public final boolean getReadyToContinue() {
        return this.readyToContinue;
    }

    public final List<Row> getDefaultAssetRows() {
        List<Instrument> list = this.instrumentList;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Instrument instrument = (Instrument) obj;
            Money money = this.defaultAssetAllocations.get(instrument);
            UUID id = instrument.getId();
            String symbol = instrument.getSymbol();
            String str = this.sortInfoMap.get(instrument.getId());
            boolean canBuyFractional = instrument.getCanBuyFractional();
            UiEvent uiEvent = null;
            if (i == 0) {
                UiEvent<Unit> uiEvent2 = this.requestInputFocusEvent;
                if ((uiEvent2 != null ? uiEvent2.consume() : null) != null) {
                    uiEvent = new UiEvent(Unit.INSTANCE);
                }
            }
            arrayList.add(new Row(id, money, symbol, canBuyFractional, str, uiEvent));
            i = i2;
        }
        return arrayList;
    }

    public final StringResource getAmountViewText() {
        Money money = this.totalAmount;
        if (money != null) {
            return StringResource.INSTANCE.invoke(C19349R.string.invest_flow_split_title_text, Money.format$default(money, null, false, null, false, 0, null, false, null, false, false, 1023, null));
        }
        return null;
    }

    private final Money getUserAllocationSum() {
        Money money;
        Iterator it = MapsKt.toList(this.assetAllocations).iterator();
        if (it.hasNext()) {
            Money moneyPlus = (Money) ((Tuples2) it.next()).component2();
            while (it.hasNext()) {
                moneyPlus = moneyPlus.plus((Money) ((Tuples2) it.next()).component2());
            }
            money = moneyPlus;
        } else {
            money = null;
        }
        return money == null ? this.totalAmount : money;
    }

    public final boolean getShowMinAlert() {
        return !getAssetNamesBelowMinimum().isEmpty();
    }

    public final StringResource getMinAlertTitle() {
        return StringResource.INSTANCE.invoke(C19349R.string.invest_flow_split_min_alert_title, new Object[0]);
    }

    private final List<String> getAssetNamesBelowMinimum() {
        Map<Instrument, Money> map = this.assetAllocations;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<Instrument, Money> entry : map.entrySet()) {
            if (entry.getValue().getDecimalValue().compareTo(BigDecimal.ONE) < 0) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(((Instrument) ((Map.Entry) it.next()).getKey()).getDisplayName());
        }
        return arrayList;
    }

    private final String assetNamesBelowMinimumString() {
        String str;
        List<String> assetNamesBelowMinimum = getAssetNamesBelowMinimum();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(assetNamesBelowMinimum, 10));
        String str2 = "";
        int i = 0;
        for (Object obj : assetNamesBelowMinimum) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            String str3 = ((Object) str2) + ((String) obj);
            if (i == getAssetNamesBelowMinimum().size() - 2) {
                str = " and ";
            } else if (i == getAssetNamesBelowMinimum().size() - 1) {
                str = ".";
            } else {
                str = ", ";
            }
            str2 = ((Object) str3) + str;
            arrayList.add(Unit.INSTANCE);
            i = i2;
        }
        return str2;
    }

    private final BigDecimal getMaxOrderAmount() {
        InvestFlowFrequency investFlowFrequency = this.selectedFrequency;
        if (investFlowFrequency instanceof InvestFlowFrequency.Once) {
            return new BigDecimal(InvestFlowConstants.MAX_ONE_TIME_AMOUNT);
        }
        if (investFlowFrequency instanceof InvestFlowFrequency.Recurring) {
            return new BigDecimal(10000);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final StringResource getMinAlertMessage() {
        return StringResource.INSTANCE.invoke(C19349R.string.invest_flow_split_min_alert_message, assetNamesBelowMinimumString());
    }

    public final boolean getShowMaxAlert() {
        InvestFlowFrequency investFlowFrequency = this.selectedFrequency;
        if (investFlowFrequency instanceof InvestFlowFrequency.Once) {
            List list = MapsKt.toList(this.assetAllocations);
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((Money) ((Tuples2) it.next()).component2()).getDecimalValue().compareTo(new BigDecimal(InvestFlowConstants.MAX_ONE_TIME_AMOUNT)) > 0) {
                    return true;
                }
            }
            return false;
        }
        if (!(investFlowFrequency instanceof InvestFlowFrequency.Recurring)) {
            throw new NoWhenBranchMatchedException();
        }
        Money userAllocationSum = getUserAllocationSum();
        return userAllocationSum != null && userAllocationSum.getDecimalValue().compareTo(new BigDecimal(10000)) > 0;
    }

    public final StringResource getMaxAlertTitle() {
        return StringResource.INSTANCE.invoke(C19349R.string.invest_flow_split_max_alert_title, new Object[0]);
    }

    public final StringResource getMaxAlertMsg() {
        return StringResource.INSTANCE.invoke(C19349R.string.invest_flow_split_max_alert_message, Formats.getWholeNumberAmountFormat().format(getMaxOrderAmount()));
    }

    public final boolean getShowNotEnoughBuyingPowerAlert() {
        Money userAllocationSum = getUserAllocationSum();
        UnifiedAccountV2 unifiedAccountV2 = this.unifiedAccount;
        Money accountBuyingPower = unifiedAccountV2 != null ? unifiedAccountV2.getAccountBuyingPower() : null;
        return (userAllocationSum == null || accountBuyingPower == null || userAllocationSum.getDecimalValue().compareTo(accountBuyingPower.getDecimalValue()) <= 0) ? false : true;
    }

    public final StringResource getNotEnoughBuyingPowerAlertTitle() {
        return StringResource.INSTANCE.invoke(C19349R.string.invest_flow_split_not_enough_buying_power_title, new Object[0]);
    }

    public final StringResource getNotEnoughBuyingPowerAlertMsg() {
        return StringResource.INSTANCE.invoke(C19349R.string.invest_flow_split_not_enough_buying_power_message, new Object[0]);
    }

    public final boolean getShowBottomSheet() {
        return getAmountGreater() || getAmountLower();
    }

    private final boolean getAmountGreater() {
        Money userAllocationSum = getUserAllocationSum();
        Money money = this.totalAmount;
        return (money == null || userAllocationSum == null || userAllocationSum.compareTo(money) <= 0) ? false : true;
    }

    private final boolean getAmountLower() {
        Money userAllocationSum = getUserAllocationSum();
        Money money = this.totalAmount;
        return (money == null || userAllocationSum == null || userAllocationSum.compareTo(money) >= 0) ? false : true;
    }

    private final Money getAllocationDifference() {
        Money userAllocationSum = getUserAllocationSum();
        Money money = this.totalAmount;
        if (money == null || userAllocationSum == null) {
            return null;
        }
        return userAllocationSum.minus(money).abs();
    }

    public final StringResource getBannerText() {
        Money allocationDifference = getAllocationDifference();
        if (this.totalAmount == null || allocationDifference == null) {
            return null;
        }
        if (getAmountLower()) {
            return StringResource.INSTANCE.invoke(C19349R.string.invest_flow_split_bottom_sheet_lower, Money.format$default(allocationDifference, null, false, null, false, 0, null, false, null, false, false, 1023, null), Money.format$default(this.totalAmount, null, false, null, false, 0, null, false, null, false, false, 1023, null));
        }
        return StringResource.INSTANCE.invoke(C19349R.string.invest_flow_split_bottom_sheet_higher, Money.format$default(allocationDifference, null, false, null, false, 0, null, false, null, false, false, 1023, null), Money.format$default(this.totalAmount, null, false, null, false, 0, null, false, null, false, false, 1023, null));
    }

    public final StringResource getBuyingPowerText() {
        UnifiedAccountV2 unifiedAccountV2 = this.unifiedAccount;
        if (unifiedAccountV2 != null) {
            return StringResource.INSTANCE.invoke(C19349R.string.invest_flow_split_buying_power_label, Money.format$default(unifiedAccountV2.getAccountBuyingPower(), null, false, null, false, 0, null, false, null, false, false, 1023, null));
        }
        return null;
    }

    public final int getNumSelectedInstruments() {
        return this.assetAllocations.size();
    }

    private final Instrument getInstrumentByAssetId(UUID assetId) {
        Object next;
        Iterator<T> it = this.instrumentList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((Instrument) next).getId(), assetId)) {
                break;
            }
        }
        return (Instrument) next;
    }

    public final StringResource getUntradableDialogTitle(UUID assetId) {
        Intrinsics.checkNotNullParameter(assetId, "assetId");
        Instrument instrumentByAssetId = getInstrumentByAssetId(assetId);
        if (instrumentByAssetId == null) {
            return null;
        }
        if (!instrumentByAssetId.getAllowsBuyToOpen()) {
            return StringResource.INSTANCE.invoke(C19349R.string.invest_flow_split_untradable_title, instrumentByAssetId.getSymbol());
        }
        if (instrumentByAssetId.getCanBuyFractional()) {
            return null;
        }
        return StringResource.INSTANCE.invoke(C19349R.string.invest_flow_split_fractional_untradable_title, instrumentByAssetId.getSymbol());
    }

    public final StringResource getUntradableDialogMessage(UUID assetId) {
        Intrinsics.checkNotNullParameter(assetId, "assetId");
        Instrument instrumentByAssetId = getInstrumentByAssetId(assetId);
        if (instrumentByAssetId == null) {
            return null;
        }
        if (!instrumentByAssetId.getAllowsBuyToOpen()) {
            return StringResource.INSTANCE.invoke(C19349R.string.invest_flow_split_untradable_message, instrumentByAssetId.getSymbol());
        }
        if (instrumentByAssetId.getCanBuyFractional()) {
            return null;
        }
        return StringResource.INSTANCE.invoke(C19349R.string.invest_flow_split_fractional_untradable_message, instrumentByAssetId.getSymbol());
    }

    public final SortActionConfig getSortActionConfig() {
        int i;
        StringResource stringResourceInvoke;
        PositionsSortPreference positionsSortPreference = this.sortPreference;
        if (positionsSortPreference != null) {
            i = C20690R.attr.colorPositive;
        } else {
            i = C20690R.attr.colorForeground1;
        }
        String sortQuery = positionsSortPreference != null ? positionsSortPreference.getSortQuery() : null;
        if (Intrinsics.areEqual(sortQuery, PositionsSortType.YOUR_EQUITY.getServerValue())) {
            int i2 = WhenMappings.$EnumSwitchMapping$0[this.sortPreference.getSortDirection().ordinal()];
            if (i2 == 1) {
                stringResourceInvoke = StringResource.INSTANCE.invoke(C19349R.string.menu_sort_equity_asc, new Object[0]);
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                stringResourceInvoke = StringResource.INSTANCE.invoke(C19349R.string.menu_sort_equity_dsc, new Object[0]);
            }
        } else if (Intrinsics.areEqual(sortQuery, PositionsSortType.LAST_PRICE.getServerValue())) {
            int i3 = WhenMappings.$EnumSwitchMapping$0[this.sortPreference.getSortDirection().ordinal()];
            if (i3 == 1) {
                stringResourceInvoke = StringResource.INSTANCE.invoke(C19349R.string.menu_sort_price_asc, new Object[0]);
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                stringResourceInvoke = StringResource.INSTANCE.invoke(C19349R.string.menu_sort_price_dsc, new Object[0]);
            }
        } else if (Intrinsics.areEqual(sortQuery, PositionsSortType.SYMBOL.getServerValue())) {
            int i4 = WhenMappings.$EnumSwitchMapping$0[this.sortPreference.getSortDirection().ordinal()];
            if (i4 == 1) {
                stringResourceInvoke = StringResource.INSTANCE.invoke(C19349R.string.menu_sort_symbol_asc, new Object[0]);
            } else {
                if (i4 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                stringResourceInvoke = StringResource.INSTANCE.invoke(C19349R.string.menu_sort_symbol_dsc, new Object[0]);
            }
        } else {
            stringResourceInvoke = StringResource.INSTANCE.invoke(C19349R.string.menu_sort, new Object[0]);
        }
        return new SortActionConfig(i, stringResourceInvoke);
    }

    public final Screen getScreen() {
        String str;
        Screen.Name name = Screen.Name.INVEST_FLOW_BUDGET_ALLOCATION;
        if (this.isCrypto) {
            str = InvestFlowConstants.Logging.CRYPTOS;
        } else {
            str = InvestFlowConstants.Logging.STOCKS_AND_ETFS;
        }
        return new Screen(name, str, null, null, 12, null);
    }

    /* compiled from: InvestFlowSplitViewState.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\tHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003JQ\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001J\u0013\u0010&\u001a\u00020\t2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/investFlow/split/InvestFlowSplitViewState$Row;", "", "assetId", "Ljava/util/UUID;", "hint", "Lcom/robinhood/models/util/Money;", "ticker", "", "tradable", "", "sortInfo", "requestFocusEvent", "Lcom/robinhood/udf/UiEvent;", "", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/util/Money;Ljava/lang/String;ZLjava/lang/String;Lcom/robinhood/udf/UiEvent;)V", "getAssetId", "()Ljava/util/UUID;", "getHint", "()Lcom/robinhood/models/util/Money;", "getTicker", "()Ljava/lang/String;", "getTradable", "()Z", "getSortInfo", "getRequestFocusEvent", "()Lcom/robinhood/udf/UiEvent;", "primaryText", "Lcom/robinhood/utils/resource/StringResource;", "getPrimaryText", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Row {
        public static final int $stable = 8;
        private final UUID assetId;
        private final Money hint;
        private final UiEvent<Unit> requestFocusEvent;
        private final String sortInfo;
        private final String ticker;
        private final boolean tradable;

        public static /* synthetic */ Row copy$default(Row row, UUID uuid, Money money, String str, boolean z, String str2, UiEvent uiEvent, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = row.assetId;
            }
            if ((i & 2) != 0) {
                money = row.hint;
            }
            if ((i & 4) != 0) {
                str = row.ticker;
            }
            if ((i & 8) != 0) {
                z = row.tradable;
            }
            if ((i & 16) != 0) {
                str2 = row.sortInfo;
            }
            if ((i & 32) != 0) {
                uiEvent = row.requestFocusEvent;
            }
            String str3 = str2;
            UiEvent uiEvent2 = uiEvent;
            return row.copy(uuid, money, str, z, str3, uiEvent2);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getAssetId() {
            return this.assetId;
        }

        /* renamed from: component2, reason: from getter */
        public final Money getHint() {
            return this.hint;
        }

        /* renamed from: component3, reason: from getter */
        public final String getTicker() {
            return this.ticker;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getTradable() {
            return this.tradable;
        }

        /* renamed from: component5, reason: from getter */
        public final String getSortInfo() {
            return this.sortInfo;
        }

        public final UiEvent<Unit> component6() {
            return this.requestFocusEvent;
        }

        public final Row copy(UUID assetId, Money hint, String ticker, boolean tradable, String sortInfo, UiEvent<Unit> requestFocusEvent) {
            Intrinsics.checkNotNullParameter(assetId, "assetId");
            Intrinsics.checkNotNullParameter(ticker, "ticker");
            return new Row(assetId, hint, ticker, tradable, sortInfo, requestFocusEvent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Row)) {
                return false;
            }
            Row row = (Row) other;
            return Intrinsics.areEqual(this.assetId, row.assetId) && Intrinsics.areEqual(this.hint, row.hint) && Intrinsics.areEqual(this.ticker, row.ticker) && this.tradable == row.tradable && Intrinsics.areEqual(this.sortInfo, row.sortInfo) && Intrinsics.areEqual(this.requestFocusEvent, row.requestFocusEvent);
        }

        public int hashCode() {
            int iHashCode = this.assetId.hashCode() * 31;
            Money money = this.hint;
            int iHashCode2 = (((((iHashCode + (money == null ? 0 : money.hashCode())) * 31) + this.ticker.hashCode()) * 31) + Boolean.hashCode(this.tradable)) * 31;
            String str = this.sortInfo;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            UiEvent<Unit> uiEvent = this.requestFocusEvent;
            return iHashCode3 + (uiEvent != null ? uiEvent.hashCode() : 0);
        }

        public String toString() {
            return "Row(assetId=" + this.assetId + ", hint=" + this.hint + ", ticker=" + this.ticker + ", tradable=" + this.tradable + ", sortInfo=" + this.sortInfo + ", requestFocusEvent=" + this.requestFocusEvent + ")";
        }

        public Row(UUID assetId, Money money, String ticker, boolean z, String str, UiEvent<Unit> uiEvent) {
            Intrinsics.checkNotNullParameter(assetId, "assetId");
            Intrinsics.checkNotNullParameter(ticker, "ticker");
            this.assetId = assetId;
            this.hint = money;
            this.ticker = ticker;
            this.tradable = z;
            this.sortInfo = str;
            this.requestFocusEvent = uiEvent;
        }

        public final UUID getAssetId() {
            return this.assetId;
        }

        public final Money getHint() {
            return this.hint;
        }

        public final String getTicker() {
            return this.ticker;
        }

        public final boolean getTradable() {
            return this.tradable;
        }

        public final String getSortInfo() {
            return this.sortInfo;
        }

        public final UiEvent<Unit> getRequestFocusEvent() {
            return this.requestFocusEvent;
        }

        public final StringResource getPrimaryText() {
            return StringResource.INSTANCE.invoke(this.ticker);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: InvestFlowSplitViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/investFlow/split/InvestFlowSplitViewState$PriceAlertType;", "", "<init>", "(Ljava/lang/String;I)V", "MIN", "MAX", "BUYING_POWER", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class PriceAlertType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ PriceAlertType[] $VALUES;
        public static final PriceAlertType MIN = new PriceAlertType("MIN", 0);
        public static final PriceAlertType MAX = new PriceAlertType("MAX", 1);
        public static final PriceAlertType BUYING_POWER = new PriceAlertType("BUYING_POWER", 2);

        private static final /* synthetic */ PriceAlertType[] $values() {
            return new PriceAlertType[]{MIN, MAX, BUYING_POWER};
        }

        public static EnumEntries<PriceAlertType> getEntries() {
            return $ENTRIES;
        }

        private PriceAlertType(String str, int i) {
        }

        static {
            PriceAlertType[] priceAlertTypeArr$values = $values();
            $VALUES = priceAlertTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(priceAlertTypeArr$values);
        }

        public static PriceAlertType valueOf(String str) {
            return (PriceAlertType) Enum.valueOf(PriceAlertType.class, str);
        }

        public static PriceAlertType[] values() {
            return (PriceAlertType[]) $VALUES.clone();
        }
    }

    /* compiled from: InvestFlowSplitViewState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/investFlow/split/InvestFlowSplitViewState$SortActionConfig;", "", ResourceTypes.COLOR, "", "title", "Lcom/robinhood/utils/resource/StringResource;", "<init>", "(ILcom/robinhood/utils/resource/StringResource;)V", "getColor", "()I", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SortActionConfig {
        public static final int $stable = StringResource.$stable;
        private final int color;
        private final StringResource title;

        public static /* synthetic */ SortActionConfig copy$default(SortActionConfig sortActionConfig, int i, StringResource stringResource, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = sortActionConfig.color;
            }
            if ((i2 & 2) != 0) {
                stringResource = sortActionConfig.title;
            }
            return sortActionConfig.copy(i, stringResource);
        }

        /* renamed from: component1, reason: from getter */
        public final int getColor() {
            return this.color;
        }

        /* renamed from: component2, reason: from getter */
        public final StringResource getTitle() {
            return this.title;
        }

        public final SortActionConfig copy(int color, StringResource title) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new SortActionConfig(color, title);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SortActionConfig)) {
                return false;
            }
            SortActionConfig sortActionConfig = (SortActionConfig) other;
            return this.color == sortActionConfig.color && Intrinsics.areEqual(this.title, sortActionConfig.title);
        }

        public int hashCode() {
            return (Integer.hashCode(this.color) * 31) + this.title.hashCode();
        }

        public String toString() {
            return "SortActionConfig(color=" + this.color + ", title=" + this.title + ")";
        }

        public SortActionConfig(int i, StringResource title) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.color = i;
            this.title = title;
        }

        public final int getColor() {
            return this.color;
        }

        public final StringResource getTitle() {
            return this.title;
        }
    }
}
