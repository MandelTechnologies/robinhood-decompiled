package com.robinhood.android.assethomes;

import com.robinhood.android.assethomes.AssetHomeStateProvider2;
import com.robinhood.android.educationtour.EducationTourElementIds;
import com.robinhood.android.models.portfolio.AssetHomeState;
import com.robinhood.android.models.portfolio.PositionsV2;
import com.robinhood.android.models.portfolio.api.AssetType;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.api.BrokerageAccountType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: AssetHomeStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/assethomes/AssetHomeStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/assethomes/AssetHomeDataState;", "Lcom/robinhood/android/assethomes/AssetHomeViewState;", "<init>", "()V", "reduce", "dataState", "feature-asset-homes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class AssetHomeStateProvider implements StateProvider<AssetHomeDataState, AssetHomeViewState> {
    public static final int $stable = 0;

    /* compiled from: AssetHomeStateProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AssetType.values().length];
            try {
                iArr[AssetType.EQUITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AssetType.OPTIONS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AssetType.FUTURES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.udf.StateProvider
    public AssetHomeViewState reduce(AssetHomeDataState dataState) {
        Integer numValueOf;
        AssetHomeState assetHomeState;
        String str;
        AssetHomeStateProvider2 assetHomeStateProvider2;
        ImmutableList<PositionsV2.PositionListItemV2> positions;
        AssetHomeStateProvider2 assetHomeIndividualBottomBar;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        AssetType assetType = dataState.getAssetType();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i = iArr[assetType.ordinal()];
        String str2 = null;
        if (i == 1) {
            numValueOf = Integer.valueOf(C9612R.string.equities_empty_cta_label);
        } else {
            numValueOf = i != 2 ? null : Integer.valueOf(C9612R.string.options_empty_cta_label);
        }
        AssetHomeState assetHomeState2 = dataState.getAssetHomeState();
        if (assetHomeState2 == null) {
            String accountNumber = dataState.getAccountNumber();
            assetHomeState = accountNumber != null ? new AssetHomeState(accountNumber, dataState.getAssetType(), CollectionsKt.emptyList()) : null;
        } else {
            assetHomeState = assetHomeState2;
        }
        BrokerageAccountType brokerageAccountType = dataState.getBrokerageAccountType();
        int i2 = iArr[dataState.getAssetType().ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException("Futures not supported");
            }
            if (dataState.isUk()) {
                str = AssetHomeStateProvider4.UK_OPTIONS_DISCLOSURE_ID;
            } else {
                str = AssetHomeStateProvider4.OPTIONS_DISCLOSURE_ID;
            }
        } else if (dataState.isUk()) {
            str = AssetHomeStateProvider4.UK_EQUITIES_DISCLOSURE_ID;
        } else {
            str = AssetHomeStateProvider4.EQUITIES_DISCLOSURE_ID;
        }
        String str3 = str;
        if (dataState.getPositions() == null || !dataState.getPositions().isEmpty()) {
            assetHomeStateProvider2 = null;
        } else {
            if (dataState.getRetirementUninvestedViewModel() != null) {
                assetHomeIndividualBottomBar = new AssetHomeStateProvider2.AssetHomeRetirementBottomBar(numValueOf, dataState.getAssetType(), dataState.getRetirementUninvestedViewModel());
            } else {
                String accountNumber2 = dataState.getAccountNumber();
                assetHomeIndividualBottomBar = accountNumber2 != null ? new AssetHomeStateProvider2.AssetHomeIndividualBottomBar(numValueOf, dataState.getAssetType(), accountNumber2) : null;
            }
            assetHomeStateProvider2 = assetHomeIndividualBottomBar;
        }
        if (dataState.getAssetType() == AssetType.EQUITY && (positions = dataState.getPositions()) != null && !positions.isEmpty()) {
            str2 = EducationTourElementIds.ASSET_HOME_INVEST_CTA;
        }
        return new AssetHomeViewState(assetHomeState, str3, brokerageAccountType, assetHomeStateProvider2, str2, dataState.getPnlShowNewTag(), dataState.getPnlUpdatesEnabled(), dataState.getShowSearchIcon(), dataState.getShowOptionLevel3EntryPoint(), dataState.getShowInfoIconInHeader());
    }
}
