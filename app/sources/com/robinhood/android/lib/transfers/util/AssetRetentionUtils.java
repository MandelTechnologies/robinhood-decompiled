package com.robinhood.android.lib.transfers.util;

import com.robinhood.android.incentives.wonka.WonkaServiceManager;
import com.robinhood.models.api.bonfire.transfer.ApiPreCreateTransferSduiContainer;
import com.robinhood.models.api.bonfire.transfer.AssetRetentionUpsellContent;
import com.robinhood.models.api.bonfire.transfer.PreCreatePopupType;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AssetRetentionUtils.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\b"}, m3636d2 = {"filterAssetRetentionUpsellIfNeeded", "", "Lcom/robinhood/models/api/bonfire/transfer/ApiPreCreateTransferSduiContainer;", "wonkaServiceManager", "Lcom/robinhood/android/incentives/wonka/WonkaServiceManager;", "getAssetRetentionUpsellIfAllowed", "Lcom/robinhood/models/api/bonfire/transfer/AssetRetentionUpsellContent;", "container", "lib-transfers_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.lib.transfers.util.AssetRetentionUtilsKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class AssetRetentionUtils {
    public static final AssetRetentionUpsellContent getAssetRetentionUpsellIfAllowed(ApiPreCreateTransferSduiContainer container, WonkaServiceManager wonkaServiceManager) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(wonkaServiceManager, "wonkaServiceManager");
        AssetRetentionUpsellContent assetRetentionUpsellContent = container.getAssetRetentionUpsellContent();
        if (assetRetentionUpsellContent == null || !wonkaServiceManager.eligibleForAssetRetentionPromotion(assetRetentionUpsellContent.getRetentionPeriodKey(), assetRetentionUpsellContent.getRetentionPeriodSeconds())) {
            return null;
        }
        return assetRetentionUpsellContent;
    }

    public static final Iterable<ApiPreCreateTransferSduiContainer> filterAssetRetentionUpsellIfNeeded(Iterable<ApiPreCreateTransferSduiContainer> iterable, WonkaServiceManager wonkaServiceManager) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(wonkaServiceManager, "wonkaServiceManager");
        ArrayList arrayList = new ArrayList();
        for (ApiPreCreateTransferSduiContainer apiPreCreateTransferSduiContainer : iterable) {
            ApiPreCreateTransferSduiContainer apiPreCreateTransferSduiContainer2 = apiPreCreateTransferSduiContainer;
            if (apiPreCreateTransferSduiContainer2.getType() != PreCreatePopupType.ASSET_RETENTION_UPSELL || getAssetRetentionUpsellIfAllowed(apiPreCreateTransferSduiContainer2, wonkaServiceManager) != null) {
                arrayList.add(apiPreCreateTransferSduiContainer);
            }
        }
        return arrayList;
    }
}
