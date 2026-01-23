package com.robinhood.android.investFlow.search;

import com.robinhood.investflow.models.api.sdui.ApiInvestFlowComponentType;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.Footer;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: DiscoverySection.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0014\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0005¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\nHÆ\u0003J\u0017\u0010\u001a\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0005HÆ\u0003J]\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001f\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/investFlow/search/DiscoverySection;", "", "listId", "Ljava/util/UUID;", "header", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "assetIds", "componentType", "Lcom/robinhood/investflow/models/api/sdui/ApiInvestFlowComponentType;", Footer.f10637type, "<init>", "(Ljava/util/UUID;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/investflow/models/api/sdui/ApiInvestFlowComponentType;Lkotlinx/collections/immutable/ImmutableList;)V", "getListId", "()Ljava/util/UUID;", "getHeader", "()Lkotlinx/collections/immutable/ImmutableList;", "getAssetIds", "getComponentType", "()Lcom/robinhood/investflow/models/api/sdui/ApiInvestFlowComponentType;", "getFooter", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class DiscoverySection {
    public static final int $stable = 8;
    private final ImmutableList<UUID> assetIds;
    private final ApiInvestFlowComponentType componentType;
    private final ImmutableList<UIComponent<GenericAction>> footer;
    private final ImmutableList<UIComponent<GenericAction>> header;
    private final UUID listId;

    public static /* synthetic */ DiscoverySection copy$default(DiscoverySection discoverySection, UUID uuid, ImmutableList immutableList, ImmutableList immutableList2, ApiInvestFlowComponentType apiInvestFlowComponentType, ImmutableList immutableList3, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = discoverySection.listId;
        }
        if ((i & 2) != 0) {
            immutableList = discoverySection.header;
        }
        if ((i & 4) != 0) {
            immutableList2 = discoverySection.assetIds;
        }
        if ((i & 8) != 0) {
            apiInvestFlowComponentType = discoverySection.componentType;
        }
        if ((i & 16) != 0) {
            immutableList3 = discoverySection.footer;
        }
        ImmutableList immutableList4 = immutableList3;
        ImmutableList immutableList5 = immutableList2;
        return discoverySection.copy(uuid, immutableList, immutableList5, apiInvestFlowComponentType, immutableList4);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getListId() {
        return this.listId;
    }

    public final ImmutableList<UIComponent<GenericAction>> component2() {
        return this.header;
    }

    public final ImmutableList<UUID> component3() {
        return this.assetIds;
    }

    /* renamed from: component4, reason: from getter */
    public final ApiInvestFlowComponentType getComponentType() {
        return this.componentType;
    }

    public final ImmutableList<UIComponent<GenericAction>> component5() {
        return this.footer;
    }

    public final DiscoverySection copy(UUID listId, ImmutableList<? extends UIComponent<? extends GenericAction>> header, ImmutableList<UUID> assetIds, ApiInvestFlowComponentType componentType, ImmutableList<? extends UIComponent<? extends GenericAction>> footer) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(assetIds, "assetIds");
        Intrinsics.checkNotNullParameter(componentType, "componentType");
        return new DiscoverySection(listId, header, assetIds, componentType, footer);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DiscoverySection)) {
            return false;
        }
        DiscoverySection discoverySection = (DiscoverySection) other;
        return Intrinsics.areEqual(this.listId, discoverySection.listId) && Intrinsics.areEqual(this.header, discoverySection.header) && Intrinsics.areEqual(this.assetIds, discoverySection.assetIds) && this.componentType == discoverySection.componentType && Intrinsics.areEqual(this.footer, discoverySection.footer);
    }

    public int hashCode() {
        UUID uuid = this.listId;
        int iHashCode = (((((((uuid == null ? 0 : uuid.hashCode()) * 31) + this.header.hashCode()) * 31) + this.assetIds.hashCode()) * 31) + this.componentType.hashCode()) * 31;
        ImmutableList<UIComponent<GenericAction>> immutableList = this.footer;
        return iHashCode + (immutableList != null ? immutableList.hashCode() : 0);
    }

    public String toString() {
        return "DiscoverySection(listId=" + this.listId + ", header=" + this.header + ", assetIds=" + this.assetIds + ", componentType=" + this.componentType + ", footer=" + this.footer + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DiscoverySection(UUID uuid, ImmutableList<? extends UIComponent<? extends GenericAction>> header, ImmutableList<UUID> assetIds, ApiInvestFlowComponentType componentType, ImmutableList<? extends UIComponent<? extends GenericAction>> immutableList) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(assetIds, "assetIds");
        Intrinsics.checkNotNullParameter(componentType, "componentType");
        this.listId = uuid;
        this.header = header;
        this.assetIds = assetIds;
        this.componentType = componentType;
        this.footer = immutableList;
    }

    public final UUID getListId() {
        return this.listId;
    }

    public final ImmutableList<UIComponent<GenericAction>> getHeader() {
        return this.header;
    }

    public final ImmutableList<UUID> getAssetIds() {
        return this.assetIds;
    }

    public final ApiInvestFlowComponentType getComponentType() {
        return this.componentType;
    }

    public final ImmutableList<UIComponent<GenericAction>> getFooter() {
        return this.footer;
    }
}
