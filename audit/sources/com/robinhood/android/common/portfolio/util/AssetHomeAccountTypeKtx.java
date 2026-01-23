package com.robinhood.android.common.portfolio.util;

import com.robinhood.models.serverdriven.experimental.api.AssetHomeAccountType;
import com.robinhood.rosetta.eventlogging.PortfolioAccountType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AssetHomeAccountTypeKtx.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"toPortfolioAccountType", "Lcom/robinhood/rosetta/eventlogging/PortfolioAccountType;", "Lcom/robinhood/models/serverdriven/experimental/api/AssetHomeAccountType;", "feature-lib-portfolio_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.portfolio.util.AssetHomeAccountTypeKtxKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class AssetHomeAccountTypeKtx {

    /* compiled from: AssetHomeAccountTypeKtx.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.portfolio.util.AssetHomeAccountTypeKtxKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AssetHomeAccountType.values().length];
            try {
                iArr[AssetHomeAccountType.INDIVIDUAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AssetHomeAccountType.RETIREMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AssetHomeAccountType.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final PortfolioAccountType toPortfolioAccountType(AssetHomeAccountType assetHomeAccountType) {
        Intrinsics.checkNotNullParameter(assetHomeAccountType, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[assetHomeAccountType.ordinal()];
        if (i == 1) {
            return PortfolioAccountType.INDIVIDUAL;
        }
        if (i == 2) {
            return PortfolioAccountType.RETIREMENT;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return PortfolioAccountType.INDIVIDUAL;
    }
}
