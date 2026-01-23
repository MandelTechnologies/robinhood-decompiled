package com.robinhood.android.eventcontracts.hub.p134v2.root.navbar;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.eventcontracts.hub.p134v2.root.navbar.HubNavBarViewState;
import com.robinhood.android.models.event.p186db.predictionmarkets.EcHubNavNode;
import com.robinhood.android.models.event.p186db.predictionmarkets.EcHubNavNode4;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.utils.extensions.Uuids;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: HubNavBarStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0002¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/hub/v2/root/navbar/HubNavBarStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/eventcontracts/hub/v2/root/navbar/HubNavBarDataState;", "Lcom/robinhood/android/eventcontracts/hub/v2/root/navbar/HubNavBarViewState;", "<init>", "()V", "reduce", "dataState", "defaultLoadingState", "feature-hub-v2_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class HubNavBarStateProvider implements StateProvider<HubNavBarDataState, HubNavBarViewState> {
    public static final int $stable = 0;
    public static final HubNavBarStateProvider INSTANCE = new HubNavBarStateProvider();

    private HubNavBarStateProvider() {
    }

    @Override // com.robinhood.android.udf.StateProvider
    public HubNavBarViewState reduce(HubNavBarDataState dataState) {
        EcHubNavNode ecHubNavNode;
        Object next;
        ImmutableList3 persistentList;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (dataState.getPartialTree() == null) {
            return defaultLoadingState(dataState);
        }
        EcHubNavNode entryNode = dataState.getEntryNode();
        if (entryNode == null) {
            return defaultLoadingState(dataState);
        }
        List<EcHubNavNode> children = dataState.getPartialTree().getChildren();
        UUID presentLayoutNodeId = dataState.getPresentLayoutNodeId();
        if (presentLayoutNodeId == null) {
            return defaultLoadingState(dataState);
        }
        if (Intrinsics.areEqual(entryNode.getId(), presentLayoutNodeId)) {
            ecHubNavNode = entryNode;
        } else {
            List<EcHubNavNode> children2 = dataState.getPartialTree().getChildren();
            if (children2 != null) {
                Iterator<T> it = children2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (Intrinsics.areEqual(((EcHubNavNode) next).getId(), presentLayoutNodeId)) {
                        break;
                    }
                }
                ecHubNavNode = (EcHubNavNode) next;
            } else {
                ecHubNavNode = null;
            }
        }
        boolean z = entryNode.getSubCategorySelectionMode() == EcHubNavNode4.PUSH && entryNode.getDefaultChildNodeId() != null && Intrinsics.areEqual(presentLayoutNodeId, entryNode.getDefaultChildNodeId());
        UUID presentLayoutNodeId2 = dataState.getPresentLayoutNodeId();
        String strSafeToString = presentLayoutNodeId2 != null ? Uuids.safeToString(presentLayoutNodeId2) : null;
        if (strSafeToString == null) {
            strSafeToString = "";
        }
        String str = strSafeToString;
        String individualAccountNumber = dataState.getIndividualAccountNumber();
        String displayHeaderText = entryNode.getDisplayHeaderText();
        if (children != null) {
            List<EcHubNavNode> list = children;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (EcHubNavNode ecHubNavNode2 : list) {
                arrayList.add(new HubNavBarViewState.DisplayChildCategory(ecHubNavNode2, Intrinsics.areEqual(ecHubNavNode2.getId(), presentLayoutNodeId), Intrinsics.areEqual(ecHubNavNode2.getId(), presentLayoutNodeId) && z));
            }
            persistentList = extensions2.toPersistentList(arrayList);
        } else {
            persistentList = null;
        }
        return new HubNavBarViewState(str, individualAccountNumber, displayHeaderText, persistentList, ecHubNavNode != null ? new HubNavBarViewState.LayoutContent(ecHubNavNode) : null, entryNode.getImageStyle(), dataState.isInPredictionMarketTestingExperiment());
    }

    private final HubNavBarViewState defaultLoadingState(HubNavBarDataState dataState) {
        UUID presentLayoutNodeId = dataState.getPresentLayoutNodeId();
        String strSafeToString = presentLayoutNodeId != null ? Uuids.safeToString(presentLayoutNodeId) : null;
        if (strSafeToString == null) {
            strSafeToString = "";
        }
        return new HubNavBarViewState(strSafeToString, dataState.getIndividualAccountNumber(), null, null, null, null, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
    }
}
