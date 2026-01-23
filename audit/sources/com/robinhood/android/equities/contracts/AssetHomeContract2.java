package com.robinhood.android.equities.contracts;

import com.robinhood.android.equities.contracts.AssetHomeContract;
import com.robinhood.android.models.portfolio.api.AssetType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: AssetHomeContract.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"apiType", "Lcom/robinhood/android/models/portfolio/api/AssetType;", "Lcom/robinhood/android/equities/contracts/AssetHomeContract$AssetType;", "getApiType", "(Lcom/robinhood/android/equities/contracts/AssetHomeContract$AssetType;)Lcom/robinhood/android/models/portfolio/api/AssetType;", "contracts_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equities.contracts.AssetHomeContractKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class AssetHomeContract2 {

    /* compiled from: AssetHomeContract.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.equities.contracts.AssetHomeContractKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AssetHomeContract.AssetType.values().length];
            try {
                iArr[AssetHomeContract.AssetType.EQUITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AssetHomeContract.AssetType.OPTIONS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AssetHomeContract.AssetType.FUTURES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AssetType getApiType(AssetHomeContract.AssetType assetType) {
        int i = WhenMappings.$EnumSwitchMapping$0[assetType.ordinal()];
        if (i == 1) {
            return AssetType.EQUITY;
        }
        if (i == 2) {
            return AssetType.OPTIONS;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return AssetType.FUTURES;
    }
}
