package com.robinhood.android.eventcontracts.hub.p134v2.home;

import java.util.UUID;
import kotlin.Metadata;

/* compiled from: HubNavigationCallbacks.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\u0003H&J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/hub/v2/home/HubNavigationCallbacks;", "", "navigateToEventDetail", "", "eventId", "Ljava/util/UUID;", "contractId", "openNewNodeScreen", "nodeId", "entryPointIdentifier", "", "showEventContractDisclosure", "quotePillClicked", "feature-hub-v2_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public interface HubNavigationCallbacks {
    void navigateToEventDetail(UUID eventId, UUID contractId);

    void openNewNodeScreen(UUID nodeId, String entryPointIdentifier);

    void quotePillClicked(UUID eventId, UUID contractId);

    void showEventContractDisclosure();
}
