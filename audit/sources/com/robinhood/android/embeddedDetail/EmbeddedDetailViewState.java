package com.robinhood.android.embeddedDetail;

import com.robinhood.investflow.models.api.sdui.ApiInvestFlowEmbeddedDetailPageResponse;
import com.robinhood.models.p320db.EtpDetails;
import com.robinhood.models.p320db.EtpDocuments;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.recurring.models.api.ApiAssetType;
import com.robinhood.utils.resource.StringResource;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* compiled from: EmbeddedDetailViewState.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u00109\u001a\u00020\u000bHÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010;\u001a\u00020\u000bHÂ\u0003Je\u0010<\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000bHÆ\u0001J\u0013\u0010=\u001a\u00020\u000b2\b\u0010>\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010?\u001a\u00020@HÖ\u0001J\t\u0010A\u001a\u00020BHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u000e\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u001d\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0019\u0010!\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"8F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0019\u0010&\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"8F¢\u0006\u0006\u001a\u0004\b'\u0010%R\u0019\u0010(\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"8F¢\u0006\u0006\u001a\u0004\b)\u0010%R\u001d\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"0+8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0011\u0010.\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b/\u0010\u001aR\u0013\u00100\u001a\u0004\u0018\u0001018F¢\u0006\u0006\u001a\u0004\b2\u00103¨\u0006C"}, m3636d2 = {"Lcom/robinhood/android/embeddedDetail/EmbeddedDetailViewState;", "", "assetType", "Lcom/robinhood/recurring/models/api/ApiAssetType;", "assetId", "Ljava/util/UUID;", "embeddedDetailPageResponse", "Lcom/robinhood/investflow/models/api/sdui/ApiInvestFlowEmbeddedDetailPageResponse;", "embeddedDetailPageHeaderResponse", "embeddedDetailPageFundamentalResponse", "basketFull", "", "etpDetails", "Lcom/robinhood/models/db/EtpDetails;", "inBasket", "<init>", "(Lcom/robinhood/recurring/models/api/ApiAssetType;Ljava/util/UUID;Lcom/robinhood/investflow/models/api/sdui/ApiInvestFlowEmbeddedDetailPageResponse;Lcom/robinhood/investflow/models/api/sdui/ApiInvestFlowEmbeddedDetailPageResponse;Lcom/robinhood/investflow/models/api/sdui/ApiInvestFlowEmbeddedDetailPageResponse;ZLcom/robinhood/models/db/EtpDetails;Z)V", "getAssetType", "()Lcom/robinhood/recurring/models/api/ApiAssetType;", "getAssetId", "()Ljava/util/UUID;", "getEmbeddedDetailPageResponse", "()Lcom/robinhood/investflow/models/api/sdui/ApiInvestFlowEmbeddedDetailPageResponse;", "getEmbeddedDetailPageHeaderResponse", "getEmbeddedDetailPageFundamentalResponse", "getBasketFull", "()Z", "getEtpDetails", "()Lcom/robinhood/models/db/EtpDetails;", "basketButtonText", "Lcom/robinhood/utils/resource/StringResource;", "getBasketButtonText", "()Lcom/robinhood/utils/resource/StringResource;", "headerComponent", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "getHeaderComponent", "()Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "expandableMarkdownComponent", "getExpandableMarkdownComponent", "fundamentalComponent", "getFundamentalComponent", "components", "", "getComponents", "()Ljava/util/List;", "contentLoaded", "getContentLoaded", "prospectusUrl", "Lokhttp3/HttpUrl;", "getProspectusUrl", "()Lokhttp3/HttpUrl;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-embedded-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class EmbeddedDetailViewState {
    public static final int $stable = 8;
    private final UUID assetId;
    private final ApiAssetType assetType;
    private final boolean basketFull;
    private final ApiInvestFlowEmbeddedDetailPageResponse embeddedDetailPageFundamentalResponse;
    private final ApiInvestFlowEmbeddedDetailPageResponse embeddedDetailPageHeaderResponse;
    private final ApiInvestFlowEmbeddedDetailPageResponse embeddedDetailPageResponse;
    private final EtpDetails etpDetails;
    private final boolean inBasket;

    public EmbeddedDetailViewState() {
        this(null, null, null, null, null, false, null, false, 255, null);
    }

    /* renamed from: component8, reason: from getter */
    private final boolean getInBasket() {
        return this.inBasket;
    }

    public static /* synthetic */ EmbeddedDetailViewState copy$default(EmbeddedDetailViewState embeddedDetailViewState, ApiAssetType apiAssetType, UUID uuid, ApiInvestFlowEmbeddedDetailPageResponse apiInvestFlowEmbeddedDetailPageResponse, ApiInvestFlowEmbeddedDetailPageResponse apiInvestFlowEmbeddedDetailPageResponse2, ApiInvestFlowEmbeddedDetailPageResponse apiInvestFlowEmbeddedDetailPageResponse3, boolean z, EtpDetails etpDetails, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            apiAssetType = embeddedDetailViewState.assetType;
        }
        if ((i & 2) != 0) {
            uuid = embeddedDetailViewState.assetId;
        }
        if ((i & 4) != 0) {
            apiInvestFlowEmbeddedDetailPageResponse = embeddedDetailViewState.embeddedDetailPageResponse;
        }
        if ((i & 8) != 0) {
            apiInvestFlowEmbeddedDetailPageResponse2 = embeddedDetailViewState.embeddedDetailPageHeaderResponse;
        }
        if ((i & 16) != 0) {
            apiInvestFlowEmbeddedDetailPageResponse3 = embeddedDetailViewState.embeddedDetailPageFundamentalResponse;
        }
        if ((i & 32) != 0) {
            z = embeddedDetailViewState.basketFull;
        }
        if ((i & 64) != 0) {
            etpDetails = embeddedDetailViewState.etpDetails;
        }
        if ((i & 128) != 0) {
            z2 = embeddedDetailViewState.inBasket;
        }
        EtpDetails etpDetails2 = etpDetails;
        boolean z3 = z2;
        ApiInvestFlowEmbeddedDetailPageResponse apiInvestFlowEmbeddedDetailPageResponse4 = apiInvestFlowEmbeddedDetailPageResponse3;
        boolean z4 = z;
        return embeddedDetailViewState.copy(apiAssetType, uuid, apiInvestFlowEmbeddedDetailPageResponse, apiInvestFlowEmbeddedDetailPageResponse2, apiInvestFlowEmbeddedDetailPageResponse4, z4, etpDetails2, z3);
    }

    /* renamed from: component1, reason: from getter */
    public final ApiAssetType getAssetType() {
        return this.assetType;
    }

    /* renamed from: component2, reason: from getter */
    public final UUID getAssetId() {
        return this.assetId;
    }

    /* renamed from: component3, reason: from getter */
    public final ApiInvestFlowEmbeddedDetailPageResponse getEmbeddedDetailPageResponse() {
        return this.embeddedDetailPageResponse;
    }

    /* renamed from: component4, reason: from getter */
    public final ApiInvestFlowEmbeddedDetailPageResponse getEmbeddedDetailPageHeaderResponse() {
        return this.embeddedDetailPageHeaderResponse;
    }

    /* renamed from: component5, reason: from getter */
    public final ApiInvestFlowEmbeddedDetailPageResponse getEmbeddedDetailPageFundamentalResponse() {
        return this.embeddedDetailPageFundamentalResponse;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getBasketFull() {
        return this.basketFull;
    }

    /* renamed from: component7, reason: from getter */
    public final EtpDetails getEtpDetails() {
        return this.etpDetails;
    }

    public final EmbeddedDetailViewState copy(ApiAssetType assetType, UUID assetId, ApiInvestFlowEmbeddedDetailPageResponse embeddedDetailPageResponse, ApiInvestFlowEmbeddedDetailPageResponse embeddedDetailPageHeaderResponse, ApiInvestFlowEmbeddedDetailPageResponse embeddedDetailPageFundamentalResponse, boolean basketFull, EtpDetails etpDetails, boolean inBasket) {
        return new EmbeddedDetailViewState(assetType, assetId, embeddedDetailPageResponse, embeddedDetailPageHeaderResponse, embeddedDetailPageFundamentalResponse, basketFull, etpDetails, inBasket);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmbeddedDetailViewState)) {
            return false;
        }
        EmbeddedDetailViewState embeddedDetailViewState = (EmbeddedDetailViewState) other;
        return this.assetType == embeddedDetailViewState.assetType && Intrinsics.areEqual(this.assetId, embeddedDetailViewState.assetId) && Intrinsics.areEqual(this.embeddedDetailPageResponse, embeddedDetailViewState.embeddedDetailPageResponse) && Intrinsics.areEqual(this.embeddedDetailPageHeaderResponse, embeddedDetailViewState.embeddedDetailPageHeaderResponse) && Intrinsics.areEqual(this.embeddedDetailPageFundamentalResponse, embeddedDetailViewState.embeddedDetailPageFundamentalResponse) && this.basketFull == embeddedDetailViewState.basketFull && Intrinsics.areEqual(this.etpDetails, embeddedDetailViewState.etpDetails) && this.inBasket == embeddedDetailViewState.inBasket;
    }

    public int hashCode() {
        ApiAssetType apiAssetType = this.assetType;
        int iHashCode = (apiAssetType == null ? 0 : apiAssetType.hashCode()) * 31;
        UUID uuid = this.assetId;
        int iHashCode2 = (iHashCode + (uuid == null ? 0 : uuid.hashCode())) * 31;
        ApiInvestFlowEmbeddedDetailPageResponse apiInvestFlowEmbeddedDetailPageResponse = this.embeddedDetailPageResponse;
        int iHashCode3 = (iHashCode2 + (apiInvestFlowEmbeddedDetailPageResponse == null ? 0 : apiInvestFlowEmbeddedDetailPageResponse.hashCode())) * 31;
        ApiInvestFlowEmbeddedDetailPageResponse apiInvestFlowEmbeddedDetailPageResponse2 = this.embeddedDetailPageHeaderResponse;
        int iHashCode4 = (iHashCode3 + (apiInvestFlowEmbeddedDetailPageResponse2 == null ? 0 : apiInvestFlowEmbeddedDetailPageResponse2.hashCode())) * 31;
        ApiInvestFlowEmbeddedDetailPageResponse apiInvestFlowEmbeddedDetailPageResponse3 = this.embeddedDetailPageFundamentalResponse;
        int iHashCode5 = (((iHashCode4 + (apiInvestFlowEmbeddedDetailPageResponse3 == null ? 0 : apiInvestFlowEmbeddedDetailPageResponse3.hashCode())) * 31) + Boolean.hashCode(this.basketFull)) * 31;
        EtpDetails etpDetails = this.etpDetails;
        return ((iHashCode5 + (etpDetails != null ? etpDetails.hashCode() : 0)) * 31) + Boolean.hashCode(this.inBasket);
    }

    public String toString() {
        return "EmbeddedDetailViewState(assetType=" + this.assetType + ", assetId=" + this.assetId + ", embeddedDetailPageResponse=" + this.embeddedDetailPageResponse + ", embeddedDetailPageHeaderResponse=" + this.embeddedDetailPageHeaderResponse + ", embeddedDetailPageFundamentalResponse=" + this.embeddedDetailPageFundamentalResponse + ", basketFull=" + this.basketFull + ", etpDetails=" + this.etpDetails + ", inBasket=" + this.inBasket + ")";
    }

    public EmbeddedDetailViewState(ApiAssetType apiAssetType, UUID uuid, ApiInvestFlowEmbeddedDetailPageResponse apiInvestFlowEmbeddedDetailPageResponse, ApiInvestFlowEmbeddedDetailPageResponse apiInvestFlowEmbeddedDetailPageResponse2, ApiInvestFlowEmbeddedDetailPageResponse apiInvestFlowEmbeddedDetailPageResponse3, boolean z, EtpDetails etpDetails, boolean z2) {
        this.assetType = apiAssetType;
        this.assetId = uuid;
        this.embeddedDetailPageResponse = apiInvestFlowEmbeddedDetailPageResponse;
        this.embeddedDetailPageHeaderResponse = apiInvestFlowEmbeddedDetailPageResponse2;
        this.embeddedDetailPageFundamentalResponse = apiInvestFlowEmbeddedDetailPageResponse3;
        this.basketFull = z;
        this.etpDetails = etpDetails;
        this.inBasket = z2;
    }

    public /* synthetic */ EmbeddedDetailViewState(ApiAssetType apiAssetType, UUID uuid, ApiInvestFlowEmbeddedDetailPageResponse apiInvestFlowEmbeddedDetailPageResponse, ApiInvestFlowEmbeddedDetailPageResponse apiInvestFlowEmbeddedDetailPageResponse2, ApiInvestFlowEmbeddedDetailPageResponse apiInvestFlowEmbeddedDetailPageResponse3, boolean z, EtpDetails etpDetails, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : apiAssetType, (i & 2) != 0 ? null : uuid, (i & 4) != 0 ? null : apiInvestFlowEmbeddedDetailPageResponse, (i & 8) != 0 ? null : apiInvestFlowEmbeddedDetailPageResponse2, (i & 16) != 0 ? null : apiInvestFlowEmbeddedDetailPageResponse3, (i & 32) != 0 ? false : z, (i & 64) != 0 ? null : etpDetails, (i & 128) != 0 ? false : z2);
    }

    public final ApiAssetType getAssetType() {
        return this.assetType;
    }

    public final UUID getAssetId() {
        return this.assetId;
    }

    public final ApiInvestFlowEmbeddedDetailPageResponse getEmbeddedDetailPageResponse() {
        return this.embeddedDetailPageResponse;
    }

    public final ApiInvestFlowEmbeddedDetailPageResponse getEmbeddedDetailPageHeaderResponse() {
        return this.embeddedDetailPageHeaderResponse;
    }

    public final ApiInvestFlowEmbeddedDetailPageResponse getEmbeddedDetailPageFundamentalResponse() {
        return this.embeddedDetailPageFundamentalResponse;
    }

    public final boolean getBasketFull() {
        return this.basketFull;
    }

    public final EtpDetails getEtpDetails() {
        return this.etpDetails;
    }

    public final StringResource getBasketButtonText() {
        return StringResource.INSTANCE.invoke(this.inBasket ? C14480R.string.remove_from_basket : C14480R.string.add_to_basket, new Object[0]);
    }

    public final UIComponent<GenericAction> getHeaderComponent() {
        List<UIComponent<GenericAction>> components;
        List<UIComponent<GenericAction>> components2;
        UIComponent<GenericAction> uIComponent;
        ApiInvestFlowEmbeddedDetailPageResponse apiInvestFlowEmbeddedDetailPageResponse = this.embeddedDetailPageHeaderResponse;
        if (apiInvestFlowEmbeddedDetailPageResponse != null && (components2 = apiInvestFlowEmbeddedDetailPageResponse.getComponents()) != null && (uIComponent = (UIComponent) CollectionsKt.firstOrNull((List) components2)) != null) {
            return uIComponent;
        }
        ApiInvestFlowEmbeddedDetailPageResponse apiInvestFlowEmbeddedDetailPageResponse2 = this.embeddedDetailPageResponse;
        if (apiInvestFlowEmbeddedDetailPageResponse2 == null || (components = apiInvestFlowEmbeddedDetailPageResponse2.getComponents()) == null) {
            return null;
        }
        return (UIComponent) CollectionsKt.firstOrNull((List) components);
    }

    public final UIComponent<GenericAction> getExpandableMarkdownComponent() {
        List<UIComponent<GenericAction>> components;
        ApiInvestFlowEmbeddedDetailPageResponse apiInvestFlowEmbeddedDetailPageResponse = this.embeddedDetailPageResponse;
        if (apiInvestFlowEmbeddedDetailPageResponse == null || (components = apiInvestFlowEmbeddedDetailPageResponse.getComponents()) == null) {
            return null;
        }
        return (UIComponent) CollectionsKt.getOrNull(components, 1);
    }

    public final UIComponent<GenericAction> getFundamentalComponent() {
        List<UIComponent<GenericAction>> components;
        List<UIComponent<GenericAction>> components2;
        UIComponent<GenericAction> uIComponent;
        ApiInvestFlowEmbeddedDetailPageResponse apiInvestFlowEmbeddedDetailPageResponse = this.embeddedDetailPageFundamentalResponse;
        if (apiInvestFlowEmbeddedDetailPageResponse != null && (components2 = apiInvestFlowEmbeddedDetailPageResponse.getComponents()) != null && (uIComponent = (UIComponent) CollectionsKt.firstOrNull((List) components2)) != null) {
            return uIComponent;
        }
        ApiInvestFlowEmbeddedDetailPageResponse apiInvestFlowEmbeddedDetailPageResponse2 = this.embeddedDetailPageResponse;
        if (apiInvestFlowEmbeddedDetailPageResponse2 == null || (components = apiInvestFlowEmbeddedDetailPageResponse2.getComponents()) == null) {
            return null;
        }
        return (UIComponent) CollectionsKt.getOrNull(components, 2);
    }

    public final List<UIComponent<GenericAction>> getComponents() {
        List<UIComponent<GenericAction>> components;
        List<UIComponent<GenericAction>> listDrop;
        ApiInvestFlowEmbeddedDetailPageResponse apiInvestFlowEmbeddedDetailPageResponse = this.embeddedDetailPageResponse;
        return (apiInvestFlowEmbeddedDetailPageResponse == null || (components = apiInvestFlowEmbeddedDetailPageResponse.getComponents()) == null || (listDrop = CollectionsKt.drop(components, 3)) == null) ? CollectionsKt.emptyList() : listDrop;
    }

    public final boolean getContentLoaded() {
        return (getHeaderComponent() == null || getExpandableMarkdownComponent() == null || getFundamentalComponent() == null || getComponents().isEmpty()) ? false : true;
    }

    public final HttpUrl getProspectusUrl() {
        EtpDocuments documents;
        EtpDetails etpDetails = this.etpDetails;
        if (etpDetails == null || (documents = etpDetails.getDocuments()) == null) {
            return null;
        }
        return documents.getProspectus();
    }
}
