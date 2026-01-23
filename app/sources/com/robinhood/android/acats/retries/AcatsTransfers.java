package com.robinhood.android.acats.retries;

import com.robinhood.android.acats.retries.AcatsRetriesRowState;
import com.robinhood.models.acats.p299db.bonfire.AcatsTransfer;
import com.robinhood.models.api.bonfire.ApiAcatsTransfer;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsTransfers.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u001aF\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u001a\f\u0010\n\u001a\u00020\u000b*\u0004\u0018\u00010\u0002¨\u0006\f"}, m3636d2 = {"getInteractionState", "Lcom/robinhood/android/acats/retries/AcatsRetriesRowState$RowInteractionState;", "Lcom/robinhood/models/acats/db/bonfire/AcatsTransfer;", "userInput", "", "optionalSteps", "", "Lcom/robinhood/models/api/bonfire/ApiAcatsTransfer$AcatRetryStep;", "errorSteps", "verifySteps", "showAssetsRow", "", "feature-acats-retries_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.acats.retries.AcatsTransfersKt, reason: use source file name */
/* loaded from: classes24.dex */
public final class AcatsTransfers {
    public static /* synthetic */ AcatsRetriesRowState.RowInteractionState getInteractionState$default(AcatsTransfer acatsTransfer, Object obj, List list, List list2, List list3, int i, Object obj2) {
        if ((i & 2) != 0) {
            list = CollectionsKt.emptyList();
        }
        if ((i & 4) != 0) {
            list2 = CollectionsKt.emptyList();
        }
        if ((i & 8) != 0) {
            list3 = CollectionsKt.emptyList();
        }
        return getInteractionState(acatsTransfer, obj, list, list2, list3);
    }

    public static final AcatsRetriesRowState.RowInteractionState getInteractionState(AcatsTransfer acatsTransfer, Object obj, List<? extends ApiAcatsTransfer.AcatRetryStep> optionalSteps, List<? extends ApiAcatsTransfer.AcatRetryStep> errorSteps, List<? extends ApiAcatsTransfer.AcatRetryStep> verifySteps) {
        List<ApiAcatsTransfer.AcatRetryStep> retrySteps;
        Set set;
        Intrinsics.checkNotNullParameter(optionalSteps, "optionalSteps");
        Intrinsics.checkNotNullParameter(errorSteps, "errorSteps");
        Intrinsics.checkNotNullParameter(verifySteps, "verifySteps");
        if (acatsTransfer == null || (retrySteps = acatsTransfer.getRetrySteps()) == null || (set = CollectionsKt.toSet(retrySteps)) == null) {
            return AcatsRetriesRowState.RowInteractionState.NONE;
        }
        if (obj != null) {
            return AcatsRetriesRowState.RowInteractionState.OPTIONAL;
        }
        Set set2 = set;
        if (!CollectionsKt.intersect(verifySteps, set2).isEmpty()) {
            return AcatsRetriesRowState.RowInteractionState.VERIFY;
        }
        if (!CollectionsKt.intersect(errorSteps, set2).isEmpty()) {
            return AcatsRetriesRowState.RowInteractionState.ERROR;
        }
        if (!CollectionsKt.intersect(optionalSteps, set2).isEmpty()) {
            return AcatsRetriesRowState.RowInteractionState.OPTIONAL;
        }
        return AcatsRetriesRowState.RowInteractionState.NONE;
    }

    public static final boolean showAssetsRow(AcatsTransfer acatsTransfer) {
        List<ApiAcatsTransfer.AcatRetryStep> retrySteps;
        if (acatsTransfer == null || (retrySteps = acatsTransfer.getRetrySteps()) == null || !retrySteps.contains(ApiAcatsTransfer.AcatRetryStep.ASSETS)) {
            if ((acatsTransfer != null ? acatsTransfer.getTransferType() : null) != ApiAcatsTransfer.TransferType.PARTIAL) {
                return false;
            }
        }
        return true;
    }
}
