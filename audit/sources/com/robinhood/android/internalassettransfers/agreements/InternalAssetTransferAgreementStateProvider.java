package com.robinhood.android.internalassettransfers.agreements;

import com.robinhood.android.agreements.models.UiAgreementWithContent;
import com.robinhood.android.internalassettransfers.agreements.InternalAssetTransferAgreementDataState;
import com.robinhood.android.internalassettransfers.agreements.InternalAssetTransferAgreementViewState;
import com.robinhood.android.udf.StateProvider;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InternalAssetTransferAgreementStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/agreements/InternalAssetTransferAgreementStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/internalassettransfers/agreements/InternalAssetTransferAgreementDataState;", "Lcom/robinhood/android/internalassettransfers/agreements/InternalAssetTransferAgreementViewState;", "<init>", "()V", "reduce", "dataState", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class InternalAssetTransferAgreementStateProvider implements StateProvider<InternalAssetTransferAgreementDataState, InternalAssetTransferAgreementViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public InternalAssetTransferAgreementViewState reduce(InternalAssetTransferAgreementDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        InternalAssetTransferAgreementDataState.LcenState fetchAgreement = dataState.getFetchAgreement();
        if (fetchAgreement instanceof InternalAssetTransferAgreementDataState.LcenState.None) {
            return InternalAssetTransferAgreementViewState.Loading.INSTANCE;
        }
        if (fetchAgreement instanceof InternalAssetTransferAgreementDataState.LcenState.Loading) {
            return InternalAssetTransferAgreementViewState.Loading.INSTANCE;
        }
        if (fetchAgreement instanceof InternalAssetTransferAgreementDataState.LcenState.Error) {
            return new InternalAssetTransferAgreementViewState.Failure(((InternalAssetTransferAgreementDataState.LcenState.Error) dataState.getFetchAgreement()).getThrowable());
        }
        if (!(fetchAgreement instanceof InternalAssetTransferAgreementDataState.LcenState.Content)) {
            throw new NoWhenBranchMatchedException();
        }
        UiAgreementWithContent agreement = ((InternalAssetTransferAgreementDataState.LcenState.Content) dataState.getFetchAgreement()).getAgreement();
        InternalAssetTransferAgreementDataState.LcenState signAgreement = dataState.getSignAgreement();
        if (Intrinsics.areEqual(signAgreement, InternalAssetTransferAgreementDataState.LcenState.None.INSTANCE)) {
            return new InternalAssetTransferAgreementViewState.Success(agreement, false);
        }
        if (Intrinsics.areEqual(signAgreement, InternalAssetTransferAgreementDataState.LcenState.Loading.INSTANCE)) {
            return new InternalAssetTransferAgreementViewState.Success(agreement, true);
        }
        if (signAgreement instanceof InternalAssetTransferAgreementDataState.LcenState.Error) {
            return new InternalAssetTransferAgreementViewState.Failure(((InternalAssetTransferAgreementDataState.LcenState.Error) dataState.getSignAgreement()).getThrowable());
        }
        if (!(signAgreement instanceof InternalAssetTransferAgreementDataState.LcenState.Content)) {
            throw new NoWhenBranchMatchedException();
        }
        return new InternalAssetTransferAgreementViewState.Success(agreement, false);
    }
}
