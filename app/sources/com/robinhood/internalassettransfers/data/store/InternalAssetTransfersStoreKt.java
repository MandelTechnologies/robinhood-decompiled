package com.robinhood.internalassettransfers.data.store;

import com.robinhood.android.models.internalassettransfers.p193db.AssetTransferDetailsStatus;
import com.robinhood.android.models.internalassettransfers.p193db.AssetTransferRecord;
import com.robinhood.android.models.internalassettransfers.p193db.EligibleAsset;
import com.robinhood.android.models.internalassettransfers.p193db.EligibleAssets;
import com.robinhood.models.internalassettransfer.p328db.bonfire.DbAssetTransferRecord;
import com.robinhood.models.internalassettransfer.p328db.bonfire.DbEligibleAsset;
import com.robinhood.models.internalassettransfer.p328db.bonfire.DbEligibleAssets;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InternalAssetTransfersStore.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0000\u001a\u00020\u0003*\u00020\u0004\u001a\n\u0010\u0000\u001a\u00020\u0005*\u00020\u0006¨\u0006\u0007"}, m3636d2 = {"toDbModel", "Lcom/robinhood/models/internalassettransfer/db/bonfire/DbAssetTransferRecord;", "Lcom/robinhood/android/models/internalassettransfers/db/AssetTransferRecord;", "Lcom/robinhood/models/internalassettransfer/db/bonfire/DbEligibleAssets;", "Lcom/robinhood/android/models/internalassettransfers/db/EligibleAssets;", "Lcom/robinhood/models/internalassettransfer/db/bonfire/DbEligibleAsset;", "Lcom/robinhood/android/models/internalassettransfers/db/EligibleAsset;", "lib-store-internal-asset-transfers_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes15.dex */
public final class InternalAssetTransfersStoreKt {
    public static final DbAssetTransferRecord toDbModel(AssetTransferRecord assetTransferRecord) {
        HistoryEvent.State state;
        Intrinsics.checkNotNullParameter(assetTransferRecord, "<this>");
        AssetTransferDetailsStatus state2 = assetTransferRecord.getState();
        if (Intrinsics.areEqual(state2, AssetTransferDetailsStatus.Completed.INSTANCE) || Intrinsics.areEqual(state2, AssetTransferDetailsStatus.Failed.INSTANCE)) {
            state = HistoryEvent.State.SETTLED;
        } else {
            if (!Intrinsics.areEqual(state2, AssetTransferDetailsStatus.Pending.INSTANCE) && !Intrinsics.areEqual(state2, AssetTransferDetailsStatus.Undefined.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            state = HistoryEvent.State.PENDING;
        }
        HistoryEvent.State state3 = state;
        UUID uuidFromString = UUID.fromString(assetTransferRecord.getId());
        Intrinsics.checkNotNullExpressionValue(uuidFromString, "fromString(...)");
        return new DbAssetTransferRecord(uuidFromString, assetTransferRecord.getSourceRhfAccountNumber(), assetTransferRecord.getSinkRhfAccountNumber(), state3, assetTransferRecord.getCreated(), toDbModel(assetTransferRecord.getEligibleAssets()));
    }

    public static final DbEligibleAssets toDbModel(EligibleAssets eligibleAssets) {
        Intrinsics.checkNotNullParameter(eligibleAssets, "<this>");
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
        double dDoubleValue = eligibleAssets.getAvailableCash().doubleValue();
        double dDoubleValue2 = eligibleAssets.getUnavailableCash().doubleValue();
        List<EligibleAsset> equityPositions = eligibleAssets.getEquityPositions();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(equityPositions, 10));
        Iterator<T> it = equityPositions.iterator();
        while (it.hasNext()) {
            arrayList.add(toDbModel((EligibleAsset) it.next()));
        }
        return new DbEligibleAssets(uuidRandomUUID, dDoubleValue, dDoubleValue2, arrayList);
    }

    public static final DbEligibleAsset toDbModel(EligibleAsset eligibleAsset) {
        Intrinsics.checkNotNullParameter(eligibleAsset, "<this>");
        String string2 = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return new DbEligibleAsset(string2, eligibleAsset.getInstrumentId(), eligibleAsset.getDisplayName(), eligibleAsset.getSymbol(), eligibleAsset.getAvailableShares(), eligibleAsset.getUnavailableShares());
    }
}
