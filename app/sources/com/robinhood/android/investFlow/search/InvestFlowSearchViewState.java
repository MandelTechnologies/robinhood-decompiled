package com.robinhood.android.investFlow.search;

import android.content.res.Resources;
import com.robinhood.android.common.search.SearchItem;
import com.robinhood.android.investFlow.C19349R;
import com.robinhood.android.investFlow.core.InvestFlowBasketItem;
import com.robinhood.android.investFlow.search.DiscoveryViewState;
import com.robinhood.investflow.models.api.sdui.ApiInvestFlowComponentType;
import com.robinhood.investflow.models.api.sdui.ApiInvestFlowDiscoveryPageResponse;
import com.robinhood.investflow.models.api.sdui.ApiInvestFlowDiscoveryPageSection;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.EtpDetails;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.Position;
import com.robinhood.models.p320db.bonfire.InstrumentRecurringTradability;
import com.robinhood.models.p355ui.InstrumentPosition;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.store.search.SearchStore3;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.resource.StringResource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: InvestFlowSearchViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÓ\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n\u0012\u001c\b\u0002\u0010\u000b\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f\u0018\u00010\n\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0007\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\n\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\n\u0012\u001c\b\u0002\u0010\u001a\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\f\u0018\u00010\n¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u00108\u001a\b\u0012\u0004\u0012\u00020\r0\u00072\u0006\u00109\u001a\u00020:H\u0002J$\u0010;\u001a\b\u0012\u0004\u0012\u00020\r0\u00072\u0006\u00109\u001a\u00020:2\u000e\u0010<\u001a\n\u0012\u0004\u0012\u000205\u0018\u00010\u0007J\u0010\u0010=\u001a\u00020\r2\u0006\u00109\u001a\u00020:H\u0002J\u0010\u0010>\u001a\u00020\r2\u0006\u00109\u001a\u00020:H\u0002J2\u0010?\u001a\b\u0012\u0004\u0012\u00020\r0\u00072\f\u0010@\u001a\b\u0012\u0004\u0012\u00020A0\u00072\u000e\u0010<\u001a\n\u0012\u0004\u0012\u000205\u0018\u00010\u00072\u0006\u0010B\u001a\u00020\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010I\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u0011\u0010J\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nHÆ\u0003J\u001d\u0010K\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f\u0018\u00010\nHÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000f\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00160\u0007HÂ\u0003J\u0011\u0010P\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\nHÆ\u0003J\u0011\u0010Q\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\nHÆ\u0003J\u001d\u0010R\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\f\u0018\u00010\nHÆ\u0003JÕ\u0001\u0010S\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n2\u001c\b\u0002\u0010\u000b\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f\u0018\u00010\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\n2\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\n2\u001c\b\u0002\u0010\u001a\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\f\u0018\u00010\nHÆ\u0001J\u0013\u0010T\u001a\u00020\u00032\b\u0010U\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010V\u001a\u00020WHÖ\u0001J\t\u0010X\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R%\u0010\u000b\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b.\u0010&R\u0019\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b/\u0010&R%\u0010\u001a\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\f\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b0\u0010&R\u0011\u00101\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0017\u00104\u001a\b\u0012\u0004\u0012\u0002050\u00078F¢\u0006\u0006\u001a\u0004\b6\u0010$R\u0014\u00107\u001a\b\u0012\u0004\u0012\u00020\r0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010C\u001a\u00020D8F¢\u0006\u0006\u001a\u0004\bE\u0010F¨\u0006Y"}, m3636d2 = {"Lcom/robinhood/android/investFlow/search/InvestFlowSearchViewState;", "", "searchFocused", "", "searchResult", "Lcom/robinhood/store/search/SearchResult;", "selectedItems", "", "Lcom/robinhood/android/investFlow/core/InvestFlowBasketItem;", "enableSearchItemsEvent", "Lcom/robinhood/udf/UiEvent;", "searchItemTapEvent", "Lkotlin/Pair;", "Lcom/robinhood/android/common/search/SearchItem;", "Lcom/robinhood/models/db/bonfire/InstrumentRecurringTradability;", "error", "", "discoveryResponse", "Lcom/robinhood/investflow/models/api/sdui/ApiInvestFlowDiscoveryPageResponse;", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "instrumentPositions", "Lcom/robinhood/models/ui/InstrumentPosition;", "errorToastEvent", "Lcom/robinhood/utils/resource/StringResource;", "addedToastEvent", "viewProspectusEvent", "", "Lcom/robinhood/models/db/EtpDetails;", "<init>", "(ZLcom/robinhood/store/search/SearchResult;Ljava/util/List;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Ljava/lang/Throwable;Lcom/robinhood/investflow/models/api/sdui/ApiInvestFlowDiscoveryPageResponse;Lcom/robinhood/models/api/BrokerageAccountType;Ljava/util/List;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;)V", "getSearchFocused", "()Z", "getSearchResult", "()Lcom/robinhood/store/search/SearchResult;", "getSelectedItems", "()Ljava/util/List;", "getEnableSearchItemsEvent", "()Lcom/robinhood/udf/UiEvent;", "getSearchItemTapEvent", "getError", "()Ljava/lang/Throwable;", "getDiscoveryResponse", "()Lcom/robinhood/investflow/models/api/sdui/ApiInvestFlowDiscoveryPageResponse;", "getBrokerageAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "getErrorToastEvent", "getAddedToastEvent", "getViewProspectusEvent", "searchInputEditHint", "getSearchInputEditHint", "()Lcom/robinhood/utils/resource/StringResource;", "selectedIds", "Ljava/util/UUID;", "getSelectedIds", "userInstrumentPositionsItems", "instrumentPositionsItems", "res", "Landroid/content/res/Resources;", "instrumentPositionsItemsWithCheck", "selectedIdList", "getStockHeader", "getEtfHeader", "instrumentSearchItemsWithCheck", "instruments", "Lcom/robinhood/models/db/Instrument;", "isEnabled", "discoveryState", "Lcom/robinhood/android/investFlow/search/DiscoveryViewState;", "getDiscoveryState", "()Lcom/robinhood/android/investFlow/search/DiscoveryViewState;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "other", "hashCode", "", "toString", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final /* data */ class InvestFlowSearchViewState {
    public static final int $stable = 8;
    private final UiEvent<InvestFlowBasketItem> addedToastEvent;
    private final BrokerageAccountType brokerageAccountType;
    private final ApiInvestFlowDiscoveryPageResponse discoveryResponse;
    private final UiEvent<Boolean> enableSearchItemsEvent;
    private final Throwable error;
    private final UiEvent<StringResource> errorToastEvent;
    private final List<InstrumentPosition> instrumentPositions;
    private final boolean searchFocused;
    private final StringResource searchInputEditHint;
    private final UiEvent<Tuples2<SearchItem, InstrumentRecurringTradability>> searchItemTapEvent;
    private final SearchStore3 searchResult;
    private final List<InvestFlowBasketItem> selectedItems;
    private final List<SearchItem> userInstrumentPositionsItems;
    private final UiEvent<Tuples2<String, EtpDetails>> viewProspectusEvent;

    public InvestFlowSearchViewState() {
        this(false, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    private final List<InstrumentPosition> component9() {
        return this.instrumentPositions;
    }

    public static /* synthetic */ InvestFlowSearchViewState copy$default(InvestFlowSearchViewState investFlowSearchViewState, boolean z, SearchStore3 searchStore3, List list, UiEvent uiEvent, UiEvent uiEvent2, Throwable th, ApiInvestFlowDiscoveryPageResponse apiInvestFlowDiscoveryPageResponse, BrokerageAccountType brokerageAccountType, List list2, UiEvent uiEvent3, UiEvent uiEvent4, UiEvent uiEvent5, int i, Object obj) {
        if ((i & 1) != 0) {
            z = investFlowSearchViewState.searchFocused;
        }
        if ((i & 2) != 0) {
            searchStore3 = investFlowSearchViewState.searchResult;
        }
        if ((i & 4) != 0) {
            list = investFlowSearchViewState.selectedItems;
        }
        if ((i & 8) != 0) {
            uiEvent = investFlowSearchViewState.enableSearchItemsEvent;
        }
        if ((i & 16) != 0) {
            uiEvent2 = investFlowSearchViewState.searchItemTapEvent;
        }
        if ((i & 32) != 0) {
            th = investFlowSearchViewState.error;
        }
        if ((i & 64) != 0) {
            apiInvestFlowDiscoveryPageResponse = investFlowSearchViewState.discoveryResponse;
        }
        if ((i & 128) != 0) {
            brokerageAccountType = investFlowSearchViewState.brokerageAccountType;
        }
        if ((i & 256) != 0) {
            list2 = investFlowSearchViewState.instrumentPositions;
        }
        if ((i & 512) != 0) {
            uiEvent3 = investFlowSearchViewState.errorToastEvent;
        }
        if ((i & 1024) != 0) {
            uiEvent4 = investFlowSearchViewState.addedToastEvent;
        }
        if ((i & 2048) != 0) {
            uiEvent5 = investFlowSearchViewState.viewProspectusEvent;
        }
        UiEvent uiEvent6 = uiEvent4;
        UiEvent uiEvent7 = uiEvent5;
        List list3 = list2;
        UiEvent uiEvent8 = uiEvent3;
        ApiInvestFlowDiscoveryPageResponse apiInvestFlowDiscoveryPageResponse2 = apiInvestFlowDiscoveryPageResponse;
        BrokerageAccountType brokerageAccountType2 = brokerageAccountType;
        UiEvent uiEvent9 = uiEvent2;
        Throwable th2 = th;
        return investFlowSearchViewState.copy(z, searchStore3, list, uiEvent, uiEvent9, th2, apiInvestFlowDiscoveryPageResponse2, brokerageAccountType2, list3, uiEvent8, uiEvent6, uiEvent7);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getSearchFocused() {
        return this.searchFocused;
    }

    public final UiEvent<StringResource> component10() {
        return this.errorToastEvent;
    }

    public final UiEvent<InvestFlowBasketItem> component11() {
        return this.addedToastEvent;
    }

    public final UiEvent<Tuples2<String, EtpDetails>> component12() {
        return this.viewProspectusEvent;
    }

    /* renamed from: component2, reason: from getter */
    public final SearchStore3 getSearchResult() {
        return this.searchResult;
    }

    public final List<InvestFlowBasketItem> component3() {
        return this.selectedItems;
    }

    public final UiEvent<Boolean> component4() {
        return this.enableSearchItemsEvent;
    }

    public final UiEvent<Tuples2<SearchItem, InstrumentRecurringTradability>> component5() {
        return this.searchItemTapEvent;
    }

    /* renamed from: component6, reason: from getter */
    public final Throwable getError() {
        return this.error;
    }

    /* renamed from: component7, reason: from getter */
    public final ApiInvestFlowDiscoveryPageResponse getDiscoveryResponse() {
        return this.discoveryResponse;
    }

    /* renamed from: component8, reason: from getter */
    public final BrokerageAccountType getBrokerageAccountType() {
        return this.brokerageAccountType;
    }

    public final InvestFlowSearchViewState copy(boolean searchFocused, SearchStore3 searchResult, List<? extends InvestFlowBasketItem> selectedItems, UiEvent<Boolean> enableSearchItemsEvent, UiEvent<Tuples2<SearchItem, InstrumentRecurringTradability>> searchItemTapEvent, Throwable error, ApiInvestFlowDiscoveryPageResponse discoveryResponse, BrokerageAccountType brokerageAccountType, List<InstrumentPosition> instrumentPositions, UiEvent<StringResource> errorToastEvent, UiEvent<InvestFlowBasketItem> addedToastEvent, UiEvent<Tuples2<String, EtpDetails>> viewProspectusEvent) {
        Intrinsics.checkNotNullParameter(selectedItems, "selectedItems");
        Intrinsics.checkNotNullParameter(instrumentPositions, "instrumentPositions");
        return new InvestFlowSearchViewState(searchFocused, searchResult, selectedItems, enableSearchItemsEvent, searchItemTapEvent, error, discoveryResponse, brokerageAccountType, instrumentPositions, errorToastEvent, addedToastEvent, viewProspectusEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InvestFlowSearchViewState)) {
            return false;
        }
        InvestFlowSearchViewState investFlowSearchViewState = (InvestFlowSearchViewState) other;
        return this.searchFocused == investFlowSearchViewState.searchFocused && Intrinsics.areEqual(this.searchResult, investFlowSearchViewState.searchResult) && Intrinsics.areEqual(this.selectedItems, investFlowSearchViewState.selectedItems) && Intrinsics.areEqual(this.enableSearchItemsEvent, investFlowSearchViewState.enableSearchItemsEvent) && Intrinsics.areEqual(this.searchItemTapEvent, investFlowSearchViewState.searchItemTapEvent) && Intrinsics.areEqual(this.error, investFlowSearchViewState.error) && Intrinsics.areEqual(this.discoveryResponse, investFlowSearchViewState.discoveryResponse) && this.brokerageAccountType == investFlowSearchViewState.brokerageAccountType && Intrinsics.areEqual(this.instrumentPositions, investFlowSearchViewState.instrumentPositions) && Intrinsics.areEqual(this.errorToastEvent, investFlowSearchViewState.errorToastEvent) && Intrinsics.areEqual(this.addedToastEvent, investFlowSearchViewState.addedToastEvent) && Intrinsics.areEqual(this.viewProspectusEvent, investFlowSearchViewState.viewProspectusEvent);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.searchFocused) * 31;
        SearchStore3 searchStore3 = this.searchResult;
        int iHashCode2 = (((iHashCode + (searchStore3 == null ? 0 : searchStore3.hashCode())) * 31) + this.selectedItems.hashCode()) * 31;
        UiEvent<Boolean> uiEvent = this.enableSearchItemsEvent;
        int iHashCode3 = (iHashCode2 + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        UiEvent<Tuples2<SearchItem, InstrumentRecurringTradability>> uiEvent2 = this.searchItemTapEvent;
        int iHashCode4 = (iHashCode3 + (uiEvent2 == null ? 0 : uiEvent2.hashCode())) * 31;
        Throwable th = this.error;
        int iHashCode5 = (iHashCode4 + (th == null ? 0 : th.hashCode())) * 31;
        ApiInvestFlowDiscoveryPageResponse apiInvestFlowDiscoveryPageResponse = this.discoveryResponse;
        int iHashCode6 = (iHashCode5 + (apiInvestFlowDiscoveryPageResponse == null ? 0 : apiInvestFlowDiscoveryPageResponse.hashCode())) * 31;
        BrokerageAccountType brokerageAccountType = this.brokerageAccountType;
        int iHashCode7 = (((iHashCode6 + (brokerageAccountType == null ? 0 : brokerageAccountType.hashCode())) * 31) + this.instrumentPositions.hashCode()) * 31;
        UiEvent<StringResource> uiEvent3 = this.errorToastEvent;
        int iHashCode8 = (iHashCode7 + (uiEvent3 == null ? 0 : uiEvent3.hashCode())) * 31;
        UiEvent<InvestFlowBasketItem> uiEvent4 = this.addedToastEvent;
        int iHashCode9 = (iHashCode8 + (uiEvent4 == null ? 0 : uiEvent4.hashCode())) * 31;
        UiEvent<Tuples2<String, EtpDetails>> uiEvent5 = this.viewProspectusEvent;
        return iHashCode9 + (uiEvent5 != null ? uiEvent5.hashCode() : 0);
    }

    public String toString() {
        return "InvestFlowSearchViewState(searchFocused=" + this.searchFocused + ", searchResult=" + this.searchResult + ", selectedItems=" + this.selectedItems + ", enableSearchItemsEvent=" + this.enableSearchItemsEvent + ", searchItemTapEvent=" + this.searchItemTapEvent + ", error=" + this.error + ", discoveryResponse=" + this.discoveryResponse + ", brokerageAccountType=" + this.brokerageAccountType + ", instrumentPositions=" + this.instrumentPositions + ", errorToastEvent=" + this.errorToastEvent + ", addedToastEvent=" + this.addedToastEvent + ", viewProspectusEvent=" + this.viewProspectusEvent + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InvestFlowSearchViewState(boolean z, SearchStore3 searchStore3, List<? extends InvestFlowBasketItem> selectedItems, UiEvent<Boolean> uiEvent, UiEvent<Tuples2<SearchItem, InstrumentRecurringTradability>> uiEvent2, Throwable th, ApiInvestFlowDiscoveryPageResponse apiInvestFlowDiscoveryPageResponse, BrokerageAccountType brokerageAccountType, List<InstrumentPosition> instrumentPositions, UiEvent<StringResource> uiEvent3, UiEvent<InvestFlowBasketItem> uiEvent4, UiEvent<Tuples2<String, EtpDetails>> uiEvent5) {
        Object instrumentPositionResult;
        Intrinsics.checkNotNullParameter(selectedItems, "selectedItems");
        Intrinsics.checkNotNullParameter(instrumentPositions, "instrumentPositions");
        this.searchFocused = z;
        this.searchResult = searchStore3;
        this.selectedItems = selectedItems;
        this.enableSearchItemsEvent = uiEvent;
        this.searchItemTapEvent = uiEvent2;
        this.error = th;
        this.discoveryResponse = apiInvestFlowDiscoveryPageResponse;
        this.brokerageAccountType = brokerageAccountType;
        this.instrumentPositions = instrumentPositions;
        this.errorToastEvent = uiEvent3;
        this.addedToastEvent = uiEvent4;
        this.viewProspectusEvent = uiEvent5;
        this.searchInputEditHint = StringResource.INSTANCE.invoke(C19349R.string.gated_etf_search_hint, new Object[0]);
        List<InstrumentPosition> list = instrumentPositions;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (InstrumentPosition instrumentPosition : list) {
            Position position = instrumentPosition.getPosition();
            if (position == null) {
                instrumentPositionResult = new SearchItem.InstrumentResult(instrumentPosition.getInstrument(), instrumentPosition.getInstrument().getCanBuyFractional(), false, 4, null);
            } else {
                instrumentPositionResult = new SearchItem.InstrumentPositionResult(instrumentPosition.getInstrument(), position, instrumentPosition.getInstrument().getCanBuyFractional(), false, 8, null);
            }
            arrayList.add(instrumentPositionResult);
        }
        this.userInstrumentPositionsItems = arrayList;
    }

    public final boolean getSearchFocused() {
        return this.searchFocused;
    }

    public final SearchStore3 getSearchResult() {
        return this.searchResult;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ InvestFlowSearchViewState(boolean r2, com.robinhood.store.search.SearchStore3 r3, java.util.List r4, com.robinhood.udf.UiEvent r5, com.robinhood.udf.UiEvent r6, java.lang.Throwable r7, com.robinhood.investflow.models.api.sdui.ApiInvestFlowDiscoveryPageResponse r8, com.robinhood.models.api.BrokerageAccountType r9, java.util.List r10, com.robinhood.udf.UiEvent r11, com.robinhood.udf.UiEvent r12, com.robinhood.udf.UiEvent r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
        /*
            r1 = this;
            r15 = r14 & 1
            if (r15 == 0) goto L5
            r2 = 0
        L5:
            r15 = r14 & 2
            r0 = 0
            if (r15 == 0) goto Lb
            r3 = r0
        Lb:
            r15 = r14 & 4
            if (r15 == 0) goto L13
            java.util.List r4 = kotlin.collections.CollectionsKt.emptyList()
        L13:
            r15 = r14 & 8
            if (r15 == 0) goto L18
            r5 = r0
        L18:
            r15 = r14 & 16
            if (r15 == 0) goto L1d
            r6 = r0
        L1d:
            r15 = r14 & 32
            if (r15 == 0) goto L22
            r7 = r0
        L22:
            r15 = r14 & 64
            if (r15 == 0) goto L27
            r8 = r0
        L27:
            r15 = r14 & 128(0x80, float:1.794E-43)
            if (r15 == 0) goto L2c
            r9 = r0
        L2c:
            r15 = r14 & 256(0x100, float:3.59E-43)
            if (r15 == 0) goto L34
            java.util.List r10 = kotlin.collections.CollectionsKt.emptyList()
        L34:
            r15 = r14 & 512(0x200, float:7.175E-43)
            if (r15 == 0) goto L39
            r11 = r0
        L39:
            r15 = r14 & 1024(0x400, float:1.435E-42)
            if (r15 == 0) goto L3e
            r12 = r0
        L3e:
            r14 = r14 & 2048(0x800, float:2.87E-42)
            if (r14 == 0) goto L50
            r15 = r0
            r13 = r11
            r14 = r12
            r11 = r9
            r12 = r10
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L5d
        L50:
            r15 = r13
            r14 = r12
            r12 = r10
            r13 = r11
            r10 = r8
            r11 = r9
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L5d:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.investFlow.search.InvestFlowSearchViewState.<init>(boolean, com.robinhood.store.search.SearchResult, java.util.List, com.robinhood.udf.UiEvent, com.robinhood.udf.UiEvent, java.lang.Throwable, com.robinhood.investflow.models.api.sdui.ApiInvestFlowDiscoveryPageResponse, com.robinhood.models.api.BrokerageAccountType, java.util.List, com.robinhood.udf.UiEvent, com.robinhood.udf.UiEvent, com.robinhood.udf.UiEvent, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final List<InvestFlowBasketItem> getSelectedItems() {
        return this.selectedItems;
    }

    public final UiEvent<Boolean> getEnableSearchItemsEvent() {
        return this.enableSearchItemsEvent;
    }

    public final UiEvent<Tuples2<SearchItem, InstrumentRecurringTradability>> getSearchItemTapEvent() {
        return this.searchItemTapEvent;
    }

    public final Throwable getError() {
        return this.error;
    }

    public final ApiInvestFlowDiscoveryPageResponse getDiscoveryResponse() {
        return this.discoveryResponse;
    }

    public final BrokerageAccountType getBrokerageAccountType() {
        return this.brokerageAccountType;
    }

    public final UiEvent<StringResource> getErrorToastEvent() {
        return this.errorToastEvent;
    }

    public final UiEvent<InvestFlowBasketItem> getAddedToastEvent() {
        return this.addedToastEvent;
    }

    public final UiEvent<Tuples2<String, EtpDetails>> getViewProspectusEvent() {
        return this.viewProspectusEvent;
    }

    public final StringResource getSearchInputEditHint() {
        return this.searchInputEditHint;
    }

    public final List<UUID> getSelectedIds() {
        List<InvestFlowBasketItem> list = this.selectedItems;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((InvestFlowBasketItem) it.next()).getId());
        }
        return arrayList;
    }

    private final List<SearchItem> instrumentPositionsItems(Resources res) {
        List listEmptyList;
        List listEmptyList2;
        List<SearchItem> list = this.userInstrumentPositionsItems;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof SearchItem.InstrumentPositionResult) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((SearchItem.InstrumentPositionResult) obj2).getInstrument().isEtpOrCef()) {
                arrayList2.add(obj2);
            } else {
                arrayList3.add(obj2);
            }
        }
        Tuples2 tuples2 = new Tuples2(arrayList2, arrayList3);
        List list2 = (List) tuples2.component1();
        List list3 = (List) tuples2.component2();
        if (!list3.isEmpty()) {
            listEmptyList = CollectionsKt.plus((Collection) CollectionsKt.listOf(getStockHeader(res)), (Iterable) list3);
        } else {
            listEmptyList = CollectionsKt.emptyList();
        }
        if (!list2.isEmpty()) {
            listEmptyList2 = CollectionsKt.plus((Collection) CollectionsKt.listOf(getEtfHeader(res)), (Iterable) list2);
        } else {
            listEmptyList2 = CollectionsKt.emptyList();
        }
        return CollectionsKt.plus((Collection) listEmptyList, (Iterable) listEmptyList2);
    }

    public final List<SearchItem> instrumentPositionsItemsWithCheck(Resources res, List<UUID> selectedIdList) {
        Instrument instrument;
        Intrinsics.checkNotNullParameter(res, "res");
        List<SearchItem> listInstrumentPositionsItems = instrumentPositionsItems(res);
        if (selectedIdList == null) {
            return listInstrumentPositionsItems;
        }
        for (SearchItem searchItem : listInstrumentPositionsItems) {
            UUID id = null;
            SearchItem.InstrumentPositionResult instrumentPositionResult = searchItem instanceof SearchItem.InstrumentPositionResult ? (SearchItem.InstrumentPositionResult) searchItem : null;
            if (instrumentPositionResult != null && (instrument = instrumentPositionResult.getInstrument()) != null) {
                id = instrument.getId();
            }
            if (id != null && selectedIdList.contains(id)) {
                ((SearchItem.InstrumentPositionResult) searchItem).setChecked(true);
            }
        }
        return listInstrumentPositionsItems;
    }

    private final SearchItem getStockHeader(Resources res) throws Resources.NotFoundException {
        String string2 = res.getString(C19349R.string.search_holding_stock_header);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return new SearchItem.SearchHeader(string2);
    }

    private final SearchItem getEtfHeader(Resources res) throws Resources.NotFoundException {
        String string2 = res.getString(C19349R.string.gated_etf_search_holding_etf_header);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return new SearchItem.SearchHeader(string2);
    }

    public final List<SearchItem> instrumentSearchItemsWithCheck(List<Instrument> instruments, List<UUID> selectedIdList, boolean isEnabled) {
        Intrinsics.checkNotNullParameter(instruments, "instruments");
        List<Instrument> list = instruments;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (Instrument instrument : list) {
            arrayList.add(new SearchItem.InstrumentResult(instrument, isEnabled, selectedIdList != null && selectedIdList.contains(instrument.getId())));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final DiscoveryViewState getDiscoveryState() {
        ImmutableList3 immutableList3PersistentListOf;
        if (this.discoveryResponse == null) {
            return this.error != null ? DiscoveryViewState.Error.INSTANCE : DiscoveryViewState.Loading.INSTANCE;
        }
        ImmutableList3 persistentList = extensions2.toPersistentList(getSelectedIds());
        List<UIComponent<GenericAction>> info_top = this.discoveryResponse.getInfo_top();
        ImmutableList3 persistentList2 = info_top != null ? extensions2.toPersistentList(info_top) : null;
        List<UIComponent<GenericAction>> info_bottom = this.discoveryResponse.getInfo_bottom();
        ImmutableList3 persistentList3 = info_bottom != null ? extensions2.toPersistentList(info_bottom) : null;
        List<ApiInvestFlowDiscoveryPageSection> components = this.discoveryResponse.getComponents();
        if (components != null) {
            List<ApiInvestFlowDiscoveryPageSection> list = components;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (ApiInvestFlowDiscoveryPageSection apiInvestFlowDiscoveryPageSection : list) {
                UUID list_uuid = apiInvestFlowDiscoveryPageSection.getList_uuid();
                ImmutableList3 persistentList4 = extensions2.toPersistentList(apiInvestFlowDiscoveryPageSection.getHeader());
                ImmutableList3 persistentList5 = extensions2.toPersistentList(apiInvestFlowDiscoveryPageSection.getData_list());
                ApiInvestFlowComponentType component_type = apiInvestFlowDiscoveryPageSection.getComponent_type();
                List<UIComponent<GenericAction>> footer = apiInvestFlowDiscoveryPageSection.getFooter();
                arrayList.add(new DiscoverySection(list_uuid, persistentList4, persistentList5, component_type, footer != null ? extensions2.toPersistentList(footer) : null));
            }
            immutableList3PersistentListOf = extensions2.toPersistentList(arrayList);
            if (immutableList3PersistentListOf == null) {
                immutableList3PersistentListOf = extensions2.persistentListOf();
            }
        }
        return new DiscoveryViewState.Loaded(persistentList, persistentList2, persistentList3, immutableList3PersistentListOf);
    }
}
