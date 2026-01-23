package com.robinhood.android.eventcontracts.hub.p134v2.home;

import com.robinhood.rosetta.eventlogging.EventContractHubCardContext;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HubDefaultCategoryContentViewState.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0012\u0010\r\u001a\u00020\u000eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/hub/v2/home/HubCardComponent;", "Lcom/robinhood/android/eventcontracts/hub/v2/home/HubLayoutComponent;", "Lcom/robinhood/android/eventcontracts/hub/v2/home/HubSectionGroup;", "eventId", "Ljava/util/UUID;", "sectionIdentifier", "", "<init>", "(Ljava/util/UUID;Ljava/lang/String;)V", "getSectionIdentifier", "()Ljava/lang/String;", "identifier", "getIdentifier", "hubCardContext", "Lcom/robinhood/rosetta/eventlogging/EventContractHubCardContext;", "getHubCardContext", "()Lcom/robinhood/rosetta/eventlogging/EventContractHubCardContext;", "feature-hub-v2_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.eventcontracts.hub.v2.home.HubCardComponent, reason: use source file name */
/* loaded from: classes3.dex */
public abstract class HubDefaultCategoryContentViewState2 implements HubDefaultCategoryContentViewState3, HubDefaultCategoryContentViewState4 {
    public static final int $stable = 0;
    private final String identifier;
    private final String sectionIdentifier;

    public abstract EventContractHubCardContext getHubCardContext();

    public HubDefaultCategoryContentViewState2(UUID eventId, String sectionIdentifier) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(sectionIdentifier, "sectionIdentifier");
        this.sectionIdentifier = sectionIdentifier;
        this.identifier = "card-" + eventId;
    }

    public String getSectionIdentifier() {
        return this.sectionIdentifier;
    }

    @Override // com.robinhood.android.eventcontracts.hub.p134v2.home.HubDefaultCategoryContentViewState3
    public String getIdentifier() {
        return this.identifier;
    }
}
