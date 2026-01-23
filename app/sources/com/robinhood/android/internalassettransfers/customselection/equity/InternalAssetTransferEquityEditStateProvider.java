package com.robinhood.android.internalassettransfers.customselection.equity;

import com.robinhood.android.internalassettransfers.C18977R;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InternalAssetTransferEquityEditStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/customselection/equity/InternalAssetTransferEquityEditStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/internalassettransfers/customselection/equity/InternalAssetTransferEquityEditDataState;", "Lcom/robinhood/android/internalassettransfers/customselection/equity/InternalAssetTransferEquityEditViewState;", "<init>", "()V", "reduce", "dataState", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class InternalAssetTransferEquityEditStateProvider implements StateProvider<InternalAssetTransferEquityEditDataState, InternalAssetTransferEquityEditViewState> {
    public static final int $stable = 0;

    /* compiled from: InternalAssetTransferEquityEditStateProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ShareSelection2.values().length];
            try {
                iArr[ShareSelection2.ALL_SHARES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ShareSelection2.SPECIFIC_AMOUNT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v5 */
    @Override // com.robinhood.android.udf.StateProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InternalAssetTransferEquityEditViewState reduce(InternalAssetTransferEquityEditDataState dataState) {
        int i;
        boolean z;
        InputErrorMessage inputErrorMessage;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        ShareSelection2 selectionType = dataState.getSelectionType();
        boolean z2 = false;
        boolean z3 = dataState.getSelectionType() == ShareSelection2.SPECIFIC_AMOUNT;
        int i2 = WhenMappings.$EnumSwitchMapping$0[dataState.getSelectionType().ordinal()];
        if (i2 == 1) {
            i = 0;
            z2 = true;
            z = true;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (dataState.getShareInputAsBigDecimal() == null || Intrinsics.areEqual(dataState.getShareInputAsBigDecimal(), BigDecimal.ZERO) || dataState.getShareInputMoreThanAvailable() || dataState.getShareInputFractionalWhenNotAllowed()) {
                i = 0;
                z = true;
            }
        }
        boolean zIsUserCurrentlyEditing = dataState.isUserCurrentlyEditing();
        boolean z4 = z;
        String shareInput = dataState.getShareInput();
        if (dataState.getShareInputFractionalWhenNotAllowed()) {
            inputErrorMessage = new InputErrorMessage(StringResource.INSTANCE.invoke(C18977R.string.f4217x28569cb, new Object[i]), i);
        } else {
            inputErrorMessage = dataState.getShareInputMoreThanAvailable() ? new InputErrorMessage(StringResource.INSTANCE.invoke(C18977R.string.internal_asset_transfer_custom_selection_too_many_shares, new Object[i]), z4) : null;
        }
        return new InternalAssetTransferEquityEditViewState(selectionType, z3, z2, zIsUserCurrentlyEditing, shareInput, inputErrorMessage);
    }
}
