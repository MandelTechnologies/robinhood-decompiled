package com.robinhood.android.eventcontracts.hub.p134v2.home;

import com.robinhood.android.models.event.p186db.ceres.UiEventContractPosition;
import com.robinhood.android.models.event.p186db.predictionmarkets.PredictionMarketEventState3;
import com.robinhood.rosetta.eventlogging.EventContractHubCardContext;
import com.robinhood.utils.extensions.Uuids;
import com.robinhood.utils.math.BigDecimals7;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: HubDefaultCategoryContentStateProvider.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a$\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007H\u0002¨\u0006\n"}, m3636d2 = {"toProtoLoggingModel", "Lcom/robinhood/rosetta/eventlogging/EventContractHubCardContext$LiveEventStatus;", "Lcom/robinhood/android/models/event/db/predictionmarkets/EventStatus;", "generatePositionContext", "", "Lcom/robinhood/rosetta/eventlogging/EventContractHubCardContext$PositionContext;", "contractIdsToPositions", "", "Ljava/util/UUID;", "Lcom/robinhood/android/models/event/db/ceres/UiEventContractPosition;", "feature-hub-v2_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.eventcontracts.hub.v2.home.HubDefaultCategoryContentStateProviderKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class HubDefaultCategoryContentStateProvider2 {

    /* compiled from: HubDefaultCategoryContentStateProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.eventcontracts.hub.v2.home.HubDefaultCategoryContentStateProviderKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PredictionMarketEventState3.values().length];
            try {
                iArr[PredictionMarketEventState3.EVENT_STATUS_UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PredictionMarketEventState3.EVENT_STATUS_UPCOMING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PredictionMarketEventState3.EVENT_STATUS_IN_PROGRESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PredictionMarketEventState3.EVENT_STATUS_PAUSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PredictionMarketEventState3.EVENT_STATUS_FINAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PredictionMarketEventState3.EVENT_STATUS_CANCELED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EventContractHubCardContext.LiveEventStatus toProtoLoggingModel(PredictionMarketEventState3 predictionMarketEventState3) {
        switch (WhenMappings.$EnumSwitchMapping$0[predictionMarketEventState3.ordinal()]) {
            case 1:
                return EventContractHubCardContext.LiveEventStatus.EVENT_STATUS_UNSPECIFIED;
            case 2:
                return EventContractHubCardContext.LiveEventStatus.EVENT_STATUS_UPCOMING;
            case 3:
                return EventContractHubCardContext.LiveEventStatus.EVENT_STATUS_IN_PROGRESS;
            case 4:
                return EventContractHubCardContext.LiveEventStatus.EVENT_STATUS_IN_PROGRESS;
            case 5:
                return EventContractHubCardContext.LiveEventStatus.EVENT_STATUS_FINAL;
            case 6:
                return EventContractHubCardContext.LiveEventStatus.EVENT_STATUS_CANCELED;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<EventContractHubCardContext.PositionContext> generatePositionContext(Map<UUID, UiEventContractPosition> map) {
        if (map == null) {
            return CollectionsKt.emptyList();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<UUID, UiEventContractPosition> entry : map.entrySet()) {
            if (!BigDecimals7.isZero(entry.getValue().getQuantity())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            arrayList.add(new EventContractHubCardContext.PositionContext(Uuids.safeToString((UUID) entry2.getKey()), ((UiEventContractPosition) entry2.getValue()).getQuantity().intValue(), null, 4, null));
        }
        return arrayList;
    }
}
