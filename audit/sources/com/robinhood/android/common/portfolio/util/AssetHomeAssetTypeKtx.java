package com.robinhood.android.common.portfolio.util;

import com.robinhood.android.equities.contracts.AssetHomeContract;
import com.robinhood.models.serverdriven.experimental.api.AssetHomeAssetType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AssetHomeAssetTypeKtx.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"toAssetHomeContractAssetType", "Lcom/robinhood/android/equities/contracts/AssetHomeContract$AssetType;", "Lcom/robinhood/models/serverdriven/experimental/api/AssetHomeAssetType;", "feature-lib-portfolio_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.portfolio.util.AssetHomeAssetTypeKtxKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class AssetHomeAssetTypeKtx {

    /* compiled from: AssetHomeAssetTypeKtx.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.portfolio.util.AssetHomeAssetTypeKtxKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AssetHomeAssetType.values().length];
            try {
                iArr[AssetHomeAssetType.EQUITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AssetHomeAssetType.OPTIONS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AssetHomeAssetType.FUTURES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AssetHomeAssetType.PREDICTION_MARKETS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AssetHomeAssetType.CRYPTO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AssetHomeAssetType.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final AssetHomeContract.AssetType toAssetHomeContractAssetType(AssetHomeAssetType assetHomeAssetType) {
        Intrinsics.checkNotNullParameter(assetHomeAssetType, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[assetHomeAssetType.ordinal()]) {
            case 1:
                return AssetHomeContract.AssetType.EQUITY;
            case 2:
                return AssetHomeContract.AssetType.OPTIONS;
            case 3:
                throw new IllegalStateException("Futures should not be passed to this function");
            case 4:
                throw new IllegalStateException("Prediction markets should not be passed to this function");
            case 5:
            case 6:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
