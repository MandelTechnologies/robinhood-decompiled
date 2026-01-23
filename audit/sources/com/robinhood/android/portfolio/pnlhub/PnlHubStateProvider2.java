package com.robinhood.android.portfolio.pnlhub;

import com.robinhood.android.models.portfolio.api.AssetClass;
import com.robinhood.android.portfolio.pnl.PnlHubAssetClass;
import com.robinhood.android.portfolio.pnl.p214db.SupportedAssetClass;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PnlHubStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¨\u0006\u0007"}, m3636d2 = {"determineIfSelectedAssetClassHasData", "", "supportedAssetTypes", "", "Lcom/robinhood/android/portfolio/pnl/db/SupportedAssetClass;", "selectedAsset", "Lcom/robinhood/android/portfolio/pnl/PnlHubAssetClass;", "feature-profit-and-loss-hub_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.portfolio.pnlhub.PnlHubStateProviderKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class PnlHubStateProvider2 {

    /* compiled from: PnlHubStateProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.portfolio.pnlhub.PnlHubStateProviderKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PnlHubAssetClass.values().length];
            try {
                iArr[PnlHubAssetClass.EQUITY_ETF.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PnlHubAssetClass.EQUITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PnlHubAssetClass.OPTIONS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PnlHubAssetClass.CRYPTO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PnlHubAssetClass.ALL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final boolean determineIfSelectedAssetClassHasData(List<SupportedAssetClass> supportedAssetTypes, PnlHubAssetClass selectedAsset) {
        Intrinsics.checkNotNullParameter(supportedAssetTypes, "supportedAssetTypes");
        Intrinsics.checkNotNullParameter(selectedAsset, "selectedAsset");
        int i = WhenMappings.$EnumSwitchMapping$0[selectedAsset.ordinal()];
        if (i == 1 || i == 2) {
            List<SupportedAssetClass> list = supportedAssetTypes;
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            for (SupportedAssetClass supportedAssetClass : list) {
                if (supportedAssetClass.getAssetClass() == AssetClass.EQUITY && supportedAssetClass.getHasData()) {
                    return true;
                }
            }
            return false;
        }
        if (i == 3) {
            List<SupportedAssetClass> list2 = supportedAssetTypes;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                return false;
            }
            for (SupportedAssetClass supportedAssetClass2 : list2) {
                if (supportedAssetClass2.getAssetClass() == AssetClass.OPTION && supportedAssetClass2.getHasData()) {
                    return true;
                }
            }
            return false;
        }
        if (i == 4) {
            List<SupportedAssetClass> list3 = supportedAssetTypes;
            if ((list3 instanceof Collection) && list3.isEmpty()) {
                return false;
            }
            for (SupportedAssetClass supportedAssetClass3 : list3) {
                if (supportedAssetClass3.getAssetClass() == AssetClass.FOREX && supportedAssetClass3.getHasData()) {
                    return true;
                }
            }
            return false;
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        List<SupportedAssetClass> list4 = supportedAssetTypes;
        if ((list4 instanceof Collection) && list4.isEmpty()) {
            return false;
        }
        for (SupportedAssetClass supportedAssetClass4 : list4) {
            if (supportedAssetClass4.getAssetClass() == AssetClass.OPTION || supportedAssetClass4.getAssetClass() == AssetClass.EQUITY || supportedAssetClass4.getAssetClass() == AssetClass.FOREX) {
                if (supportedAssetClass4.getHasData()) {
                    return true;
                }
            }
        }
        return false;
    }
}
