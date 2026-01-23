package com.robinhood.android.common.recurring.assetSelection;

import com.robinhood.android.udf.StateProvider;
import com.robinhood.librobinhood.data.store.SweepsStatus;
import com.robinhood.models.util.Money;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecurringAssetCategorySelectionStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/assetSelection/RecurringAssetCategorySelectionStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/common/recurring/assetSelection/RecurringAssetCategorySelectionDataState;", "Lcom/robinhood/android/common/recurring/assetSelection/RecurringAssetCategorySelectionViewState;", "<init>", "()V", "reduce", "dataState", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class RecurringAssetCategorySelectionStateProvider implements StateProvider<RecurringAssetCategorySelectionDataState, RecurringAssetCategorySelectionViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public RecurringAssetCategorySelectionViewState reduce(RecurringAssetCategorySelectionDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        SweepsStatus sweepsStatus = dataState.getSweepsStatus();
        boolean hasGoldSubscription = dataState.getHasGoldSubscription();
        BigDecimal retirementMatchRate = dataState.getRetirementMatchRate();
        Money retirementRemainingToLimit = dataState.getRetirementRemainingToLimit();
        boolean hasRothIraAccount = dataState.getHasRothIraAccount();
        boolean hasTraditionalIraAccount = dataState.getHasTraditionalIraAccount();
        String brokerageAccountNumber = dataState.getBrokerageAccountNumber();
        String rothIraAccountNumber = dataState.getRothIraAccountNumber();
        String traditionalIraAccountNumber = dataState.getTraditionalIraAccountNumber();
        return new RecurringAssetCategorySelectionViewState(sweepsStatus, hasGoldSubscription, retirementMatchRate, retirementRemainingToLimit, hasRothIraAccount, hasTraditionalIraAccount, dataState.getBrokerageCashOptionEnabled(), dataState.getRetirementCashOptionEnabled(), dataState.getInvestmentOptionEnabled(), brokerageAccountNumber, rothIraAccountNumber, traditionalIraAccountNumber);
    }
}
