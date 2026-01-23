package com.robinhood.android.eventcontracts.hub.p134v2.home;

import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: HubDefaultCategoryContentViewState.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0013\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J'\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0004HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\f¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/hub/v2/home/SeeMoreCtaComponentViewState;", "Lcom/robinhood/android/eventcontracts/hub/v2/home/HubLayoutComponent;", "Lcom/robinhood/android/eventcontracts/hub/v2/home/HubSectionGroup;", "sectionIdentifier", "", AnnotatedPrivateKey.LABEL, "Lcom/robinhood/utils/resource/StringResource;", "nextNodeId", "Ljava/util/UUID;", "<init>", "(Ljava/lang/String;Lcom/robinhood/utils/resource/StringResource;Ljava/util/UUID;)V", "getSectionIdentifier", "()Ljava/lang/String;", "getLabel", "()Lcom/robinhood/utils/resource/StringResource;", "getNextNodeId", "()Ljava/util/UUID;", "identifier", "getIdentifier", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-hub-v2_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SeeMoreCtaComponentViewState implements HubDefaultCategoryContentViewState3, HubDefaultCategoryContentViewState4 {
    public static final int $stable = 8;
    private final StringResource label;
    private final UUID nextNodeId;
    private final String sectionIdentifier;

    public static /* synthetic */ SeeMoreCtaComponentViewState copy$default(SeeMoreCtaComponentViewState seeMoreCtaComponentViewState, String str, StringResource stringResource, UUID uuid, int i, Object obj) {
        if ((i & 1) != 0) {
            str = seeMoreCtaComponentViewState.sectionIdentifier;
        }
        if ((i & 2) != 0) {
            stringResource = seeMoreCtaComponentViewState.label;
        }
        if ((i & 4) != 0) {
            uuid = seeMoreCtaComponentViewState.nextNodeId;
        }
        return seeMoreCtaComponentViewState.copy(str, stringResource, uuid);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSectionIdentifier() {
        return this.sectionIdentifier;
    }

    /* renamed from: component2, reason: from getter */
    public final StringResource getLabel() {
        return this.label;
    }

    /* renamed from: component3, reason: from getter */
    public final UUID getNextNodeId() {
        return this.nextNodeId;
    }

    public final SeeMoreCtaComponentViewState copy(String sectionIdentifier, StringResource label, UUID nextNodeId) {
        Intrinsics.checkNotNullParameter(sectionIdentifier, "sectionIdentifier");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(nextNodeId, "nextNodeId");
        return new SeeMoreCtaComponentViewState(sectionIdentifier, label, nextNodeId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SeeMoreCtaComponentViewState)) {
            return false;
        }
        SeeMoreCtaComponentViewState seeMoreCtaComponentViewState = (SeeMoreCtaComponentViewState) other;
        return Intrinsics.areEqual(this.sectionIdentifier, seeMoreCtaComponentViewState.sectionIdentifier) && Intrinsics.areEqual(this.label, seeMoreCtaComponentViewState.label) && Intrinsics.areEqual(this.nextNodeId, seeMoreCtaComponentViewState.nextNodeId);
    }

    public int hashCode() {
        return (((this.sectionIdentifier.hashCode() * 31) + this.label.hashCode()) * 31) + this.nextNodeId.hashCode();
    }

    public String toString() {
        return "SeeMoreCtaComponentViewState(sectionIdentifier=" + this.sectionIdentifier + ", label=" + this.label + ", nextNodeId=" + this.nextNodeId + ")";
    }

    public SeeMoreCtaComponentViewState(String sectionIdentifier, StringResource label, UUID nextNodeId) {
        Intrinsics.checkNotNullParameter(sectionIdentifier, "sectionIdentifier");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(nextNodeId, "nextNodeId");
        this.sectionIdentifier = sectionIdentifier;
        this.label = label;
        this.nextNodeId = nextNodeId;
    }

    @Override // com.robinhood.android.eventcontracts.hub.p134v2.home.HubDefaultCategoryContentViewState4
    public String getSectionIdentifier() {
        return this.sectionIdentifier;
    }

    public final StringResource getLabel() {
        return this.label;
    }

    public final UUID getNextNodeId() {
        return this.nextNodeId;
    }

    @Override // com.robinhood.android.eventcontracts.hub.p134v2.home.HubDefaultCategoryContentViewState3
    public String getIdentifier() {
        return "see-more-cta-" + this.nextNodeId;
    }
}
