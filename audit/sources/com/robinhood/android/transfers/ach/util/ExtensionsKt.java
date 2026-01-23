package com.robinhood.android.transfers.ach.util;

import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.transfers.ach.p265ui.BaseCreateAchTransferActivity;
import com.robinhood.rosetta.eventlogging.TransferContext;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Extensions.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0002\u001a\u0010\u0010\u0006\u001a\u00060\u0007j\u0002`\b*\u00020\u0002H\u0000¨\u0006\t"}, m3636d2 = {"generateRefId", "Ljava/util/UUID;", "Lcom/robinhood/android/common/ui/BaseFragment;", "transferData", "Lcom/robinhood/android/transfers/ach/util/TransferData;", "getSessionId", "getEntryPointForLogging", "Lcom/robinhood/rosetta/eventlogging/TransferContext$EntryPoint;", "Lcom/robinhood/android/transfers/contracts/transfercontext/TransferEntryPoint;", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class ExtensionsKt {
    public static final UUID generateRefId(BaseFragment baseFragment, TransferData transferData) {
        Intrinsics.checkNotNullParameter(baseFragment, "<this>");
        Intrinsics.checkNotNullParameter(transferData, "transferData");
        BaseActivity baseActivityRequireBaseActivity = baseFragment.requireBaseActivity();
        Intrinsics.checkNotNull(baseActivityRequireBaseActivity, "null cannot be cast to non-null type com.robinhood.android.transfers.ach.ui.BaseCreateAchTransferActivity");
        BaseCreateAchTransferActivity baseCreateAchTransferActivity = (BaseCreateAchTransferActivity) baseActivityRequireBaseActivity;
        UUID uuidRandomUUID = baseCreateAchTransferActivity.getTransferDataToRefId().get(transferData);
        if (uuidRandomUUID == null) {
            uuidRandomUUID = UUID.randomUUID();
            baseCreateAchTransferActivity.getTransferDataToRefId().put(transferData, uuidRandomUUID);
        }
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "with(...)");
        return uuidRandomUUID;
    }

    public static final UUID getSessionId(BaseFragment baseFragment) {
        Intrinsics.checkNotNullParameter(baseFragment, "<this>");
        FragmentActivity fragmentActivityRequireActivity = baseFragment.requireActivity();
        Intrinsics.checkNotNull(fragmentActivityRequireActivity, "null cannot be cast to non-null type com.robinhood.android.transfers.ach.ui.BaseCreateAchTransferActivity");
        return ((BaseCreateAchTransferActivity) fragmentActivityRequireActivity).getSessionId$feature_legacy_ach_transfers_externalDebug();
    }

    public static final TransferContext.EntryPoint getEntryPointForLogging(BaseFragment baseFragment) {
        Intrinsics.checkNotNullParameter(baseFragment, "<this>");
        FragmentActivity fragmentActivityRequireActivity = baseFragment.requireActivity();
        Intrinsics.checkNotNull(fragmentActivityRequireActivity, "null cannot be cast to non-null type com.robinhood.android.transfers.ach.ui.BaseCreateAchTransferActivity");
        return ((BaseCreateAchTransferActivity) fragmentActivityRequireActivity).getTransferContext().getEntryPoint();
    }
}
