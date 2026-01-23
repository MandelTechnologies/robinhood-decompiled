package com.robinhood.android.acats.retries.activity;

import com.robinhood.android.acats.retries.AcatsRetriesRowState;
import com.robinhood.android.acats.retries.activity.AcatsRetriesViewState;
import com.robinhood.android.acatsin.util.AcatsInScreenContext;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.acats.p299db.bonfire.AcatsTransfer;
import com.robinhood.models.api.bonfire.ApiBrokerage;
import com.robinhood.utils.resource.StringResource;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsRetriesStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/acats/retries/activity/AcatsRetriesStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/acats/retries/activity/AcatsRetriesDataState;", "Lcom/robinhood/android/acats/retries/activity/AcatsRetriesViewState;", "<init>", "()V", "reduce", "dataState", "feature-acats-retries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class AcatsRetriesStateProvider implements StateProvider<AcatsRetriesDataState, AcatsRetriesViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public AcatsRetriesViewState reduce(AcatsRetriesDataState dataState) {
        String dtcc_number;
        String rhsAccountNumber;
        AcatsRetriesViewState.SubmissionState submissionState;
        List<AcatsTransfer.Asset> assets;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        StringResource headerTitle = dataState.getHeaderTitle();
        StringResource headerInfoBanner = dataState.getHeaderInfoBanner();
        List<AcatsRetriesRowState> rowStates = dataState.getRowStates();
        AcatsTransfer retryAcatsTransfer = dataState.getRetryAcatsTransfer();
        if (retryAcatsTransfer == null || (dtcc_number = retryAcatsTransfer.getContraDtccNumber()) == null) {
            ApiBrokerage retryContraBrokerage = dataState.getRetryContraBrokerage();
            dtcc_number = retryContraBrokerage != null ? retryContraBrokerage.getDtcc_number() : "";
        }
        AcatsTransfer retryAcatsTransfer2 = dataState.getRetryAcatsTransfer();
        if (retryAcatsTransfer2 == null || (rhsAccountNumber = retryAcatsTransfer2.getRhsAccountNumber()) == null) {
            rhsAccountNumber = "";
        }
        if (dataState.getSubmissionLoading()) {
            submissionState = AcatsRetriesViewState.SubmissionState.LOADING;
        } else {
            submissionState = dataState.getSubmissionEnabled() ? AcatsRetriesViewState.SubmissionState.READY : AcatsRetriesViewState.SubmissionState.DISABLED;
        }
        AcatsRetriesViewState.SubmissionState submissionState2 = submissionState;
        boolean zIsReady = dataState.isReady();
        AcatsInScreenContext screenContext = dataState.getScreenContext();
        AcatsTransfer retryAcatsTransfer3 = dataState.getRetryAcatsTransfer();
        return new AcatsRetriesViewState(headerTitle, headerInfoBanner, rowStates, dtcc_number, rhsAccountNumber, submissionState2, zIsReady, screenContext, (retryAcatsTransfer3 == null || (assets = retryAcatsTransfer3.getAssets()) == null) ? false : !assets.isEmpty());
    }
}
