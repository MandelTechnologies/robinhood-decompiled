package com.robinhood.android.acatsin.partials;

import com.robinhood.android.acatsin.partials.UiAcatsAsset;
import com.robinhood.models.api.bonfire.ApiAcatsAccountContentsResponse;
import com.robinhood.models.api.bonfire.ApiAcatsTransfer;
import com.robinhood.models.api.bonfire.ApiBrokerage;
import com.robinhood.models.p320db.Account;
import com.robinhood.utils.Either;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsInBuildPartialDataState.kt */
@Metadata(m3635d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u009b\u0001\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012\u0012\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00160\u0012\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ5\u0010-\u001a\u00020\u00002-\u0010.\u001a)\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u001400¢\u0006\f\b1\u0012\b\b2\u0012\u0004\b\b(3\u0012\u0004\u0012\u0002040/J5\u00105\u001a\u00020\u00002-\u0010.\u001a)\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u001600¢\u0006\f\b1\u0012\b\b2\u0012\u0004\b\b(3\u0012\u0004\u0012\u0002040/J\u0017\u00106\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u00108\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0010\u0010<\u001a\u0004\u0018\u00010\u0010HÀ\u0003¢\u0006\u0002\b=J\u001a\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012HÀ\u0003¢\u0006\u0002\b?J\u001a\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00160\u0012HÀ\u0003¢\u0006\u0002\bAJ\t\u0010B\u001a\u00020\u0018HÆ\u0003J£\u0001\u0010C\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00122\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00160\u00122\b\b\u0002\u0010\u0017\u001a\u00020\u0018HÆ\u0001J\u0013\u0010D\u001a\u00020\u00182\b\u0010E\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010F\u001a\u00020GHÖ\u0001J\t\u0010H\u001a\u00020\u0005HÖ\u0001R\u001f\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00160\u0012X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010)R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,¨\u0006I"}, m3636d2 = {"Lcom/robinhood/android/acatsin/partials/AcatsInBuildPartialDataState;", "", "brokerageOrDtcNumber", "Lcom/robinhood/utils/Either;", "Lcom/robinhood/models/api/bonfire/ApiBrokerage;", "", "rhsAccountTitle", "supportedContentTypes", "", "Lcom/robinhood/models/api/bonfire/ApiAcatsAccountContentsResponse$SupportedContentType;", "bannerContentfulTemplate", "assetFilterType", "Lcom/robinhood/models/api/bonfire/ApiAcatsTransfer$Asset$AssetType;", "account", "Lcom/robinhood/models/db/Account;", "cashAsset", "Lcom/robinhood/android/acatsin/partials/UiAcatsAsset$CashAsset;", "equityAssets", "", "Ljava/util/UUID;", "Lcom/robinhood/android/acatsin/partials/UiAcatsAsset$EquityAsset;", "optionAssets", "Lcom/robinhood/android/acatsin/partials/UiAcatsAsset$OptionAsset;", "accountHasAccessToOptions", "", "<init>", "(Lcom/robinhood/utils/Either;Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Lcom/robinhood/models/api/bonfire/ApiAcatsTransfer$Asset$AssetType;Lcom/robinhood/models/db/Account;Lcom/robinhood/android/acatsin/partials/UiAcatsAsset$CashAsset;Ljava/util/Map;Ljava/util/Map;Z)V", "getBrokerageOrDtcNumber", "()Lcom/robinhood/utils/Either;", "getRhsAccountTitle", "()Ljava/lang/String;", "getSupportedContentTypes", "()Ljava/util/Set;", "getBannerContentfulTemplate", "getAssetFilterType", "()Lcom/robinhood/models/api/bonfire/ApiAcatsTransfer$Asset$AssetType;", "getAccount", "()Lcom/robinhood/models/db/Account;", "getCashAsset$lib_acats_ui_externalDebug", "()Lcom/robinhood/android/acatsin/partials/UiAcatsAsset$CashAsset;", "getEquityAssets$lib_acats_ui_externalDebug", "()Ljava/util/Map;", "getOptionAssets$lib_acats_ui_externalDebug", "getAccountHasAccessToOptions", "()Z", "modifyEquityAssetMap", "func", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "map", "", "modifyOptionAssetMap", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component7$lib_acats_ui_externalDebug", "component8", "component8$lib_acats_ui_externalDebug", "component9", "component9$lib_acats_ui_externalDebug", "component10", "copy", "equals", "other", "hashCode", "", "toString", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class AcatsInBuildPartialDataState {
    public static final int $stable = 8;
    private final Account account;
    private final boolean accountHasAccessToOptions;
    private final ApiAcatsTransfer.Asset.AssetType assetFilterType;
    private final String bannerContentfulTemplate;
    private final Either<ApiBrokerage, String> brokerageOrDtcNumber;
    private final UiAcatsAsset.CashAsset cashAsset;
    private final Map<UUID, UiAcatsAsset.EquityAsset> equityAssets;
    private final Map<UUID, UiAcatsAsset.OptionAsset> optionAssets;
    private final String rhsAccountTitle;
    private final Set<ApiAcatsAccountContentsResponse.SupportedContentType> supportedContentTypes;

    public static /* synthetic */ AcatsInBuildPartialDataState copy$default(AcatsInBuildPartialDataState acatsInBuildPartialDataState, Either either, String str, Set set, String str2, ApiAcatsTransfer.Asset.AssetType assetType, Account account, UiAcatsAsset.CashAsset cashAsset, Map map, Map map2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            either = acatsInBuildPartialDataState.brokerageOrDtcNumber;
        }
        if ((i & 2) != 0) {
            str = acatsInBuildPartialDataState.rhsAccountTitle;
        }
        if ((i & 4) != 0) {
            set = acatsInBuildPartialDataState.supportedContentTypes;
        }
        if ((i & 8) != 0) {
            str2 = acatsInBuildPartialDataState.bannerContentfulTemplate;
        }
        if ((i & 16) != 0) {
            assetType = acatsInBuildPartialDataState.assetFilterType;
        }
        if ((i & 32) != 0) {
            account = acatsInBuildPartialDataState.account;
        }
        if ((i & 64) != 0) {
            cashAsset = acatsInBuildPartialDataState.cashAsset;
        }
        if ((i & 128) != 0) {
            map = acatsInBuildPartialDataState.equityAssets;
        }
        if ((i & 256) != 0) {
            map2 = acatsInBuildPartialDataState.optionAssets;
        }
        if ((i & 512) != 0) {
            z = acatsInBuildPartialDataState.accountHasAccessToOptions;
        }
        Map map3 = map2;
        boolean z2 = z;
        UiAcatsAsset.CashAsset cashAsset2 = cashAsset;
        Map map4 = map;
        ApiAcatsTransfer.Asset.AssetType assetType2 = assetType;
        Account account2 = account;
        return acatsInBuildPartialDataState.copy(either, str, set, str2, assetType2, account2, cashAsset2, map4, map3, z2);
    }

    public final Either<ApiBrokerage, String> component1() {
        return this.brokerageOrDtcNumber;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getAccountHasAccessToOptions() {
        return this.accountHasAccessToOptions;
    }

    /* renamed from: component2, reason: from getter */
    public final String getRhsAccountTitle() {
        return this.rhsAccountTitle;
    }

    public final Set<ApiAcatsAccountContentsResponse.SupportedContentType> component3() {
        return this.supportedContentTypes;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBannerContentfulTemplate() {
        return this.bannerContentfulTemplate;
    }

    /* renamed from: component5, reason: from getter */
    public final ApiAcatsTransfer.Asset.AssetType getAssetFilterType() {
        return this.assetFilterType;
    }

    /* renamed from: component6, reason: from getter */
    public final Account getAccount() {
        return this.account;
    }

    /* renamed from: component7$lib_acats_ui_externalDebug, reason: from getter */
    public final UiAcatsAsset.CashAsset getCashAsset() {
        return this.cashAsset;
    }

    public final Map<UUID, UiAcatsAsset.EquityAsset> component8$lib_acats_ui_externalDebug() {
        return this.equityAssets;
    }

    public final Map<UUID, UiAcatsAsset.OptionAsset> component9$lib_acats_ui_externalDebug() {
        return this.optionAssets;
    }

    public final AcatsInBuildPartialDataState copy(Either<ApiBrokerage, String> brokerageOrDtcNumber, String rhsAccountTitle, Set<? extends ApiAcatsAccountContentsResponse.SupportedContentType> supportedContentTypes, String bannerContentfulTemplate, ApiAcatsTransfer.Asset.AssetType assetFilterType, Account account, UiAcatsAsset.CashAsset cashAsset, Map<UUID, UiAcatsAsset.EquityAsset> equityAssets, Map<UUID, UiAcatsAsset.OptionAsset> optionAssets, boolean accountHasAccessToOptions) {
        Intrinsics.checkNotNullParameter(supportedContentTypes, "supportedContentTypes");
        Intrinsics.checkNotNullParameter(equityAssets, "equityAssets");
        Intrinsics.checkNotNullParameter(optionAssets, "optionAssets");
        return new AcatsInBuildPartialDataState(brokerageOrDtcNumber, rhsAccountTitle, supportedContentTypes, bannerContentfulTemplate, assetFilterType, account, cashAsset, equityAssets, optionAssets, accountHasAccessToOptions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AcatsInBuildPartialDataState)) {
            return false;
        }
        AcatsInBuildPartialDataState acatsInBuildPartialDataState = (AcatsInBuildPartialDataState) other;
        return Intrinsics.areEqual(this.brokerageOrDtcNumber, acatsInBuildPartialDataState.brokerageOrDtcNumber) && Intrinsics.areEqual(this.rhsAccountTitle, acatsInBuildPartialDataState.rhsAccountTitle) && Intrinsics.areEqual(this.supportedContentTypes, acatsInBuildPartialDataState.supportedContentTypes) && Intrinsics.areEqual(this.bannerContentfulTemplate, acatsInBuildPartialDataState.bannerContentfulTemplate) && this.assetFilterType == acatsInBuildPartialDataState.assetFilterType && Intrinsics.areEqual(this.account, acatsInBuildPartialDataState.account) && Intrinsics.areEqual(this.cashAsset, acatsInBuildPartialDataState.cashAsset) && Intrinsics.areEqual(this.equityAssets, acatsInBuildPartialDataState.equityAssets) && Intrinsics.areEqual(this.optionAssets, acatsInBuildPartialDataState.optionAssets) && this.accountHasAccessToOptions == acatsInBuildPartialDataState.accountHasAccessToOptions;
    }

    public int hashCode() {
        Either<ApiBrokerage, String> either = this.brokerageOrDtcNumber;
        int iHashCode = (either == null ? 0 : either.hashCode()) * 31;
        String str = this.rhsAccountTitle;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.supportedContentTypes.hashCode()) * 31;
        String str2 = this.bannerContentfulTemplate;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ApiAcatsTransfer.Asset.AssetType assetType = this.assetFilterType;
        int iHashCode4 = (iHashCode3 + (assetType == null ? 0 : assetType.hashCode())) * 31;
        Account account = this.account;
        int iHashCode5 = (iHashCode4 + (account == null ? 0 : account.hashCode())) * 31;
        UiAcatsAsset.CashAsset cashAsset = this.cashAsset;
        return ((((((iHashCode5 + (cashAsset != null ? cashAsset.hashCode() : 0)) * 31) + this.equityAssets.hashCode()) * 31) + this.optionAssets.hashCode()) * 31) + Boolean.hashCode(this.accountHasAccessToOptions);
    }

    public String toString() {
        return "AcatsInBuildPartialDataState(brokerageOrDtcNumber=" + this.brokerageOrDtcNumber + ", rhsAccountTitle=" + this.rhsAccountTitle + ", supportedContentTypes=" + this.supportedContentTypes + ", bannerContentfulTemplate=" + this.bannerContentfulTemplate + ", assetFilterType=" + this.assetFilterType + ", account=" + this.account + ", cashAsset=" + this.cashAsset + ", equityAssets=" + this.equityAssets + ", optionAssets=" + this.optionAssets + ", accountHasAccessToOptions=" + this.accountHasAccessToOptions + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AcatsInBuildPartialDataState(Either<ApiBrokerage, String> either, String str, Set<? extends ApiAcatsAccountContentsResponse.SupportedContentType> supportedContentTypes, String str2, ApiAcatsTransfer.Asset.AssetType assetType, Account account, UiAcatsAsset.CashAsset cashAsset, Map<UUID, UiAcatsAsset.EquityAsset> equityAssets, Map<UUID, UiAcatsAsset.OptionAsset> optionAssets, boolean z) {
        Intrinsics.checkNotNullParameter(supportedContentTypes, "supportedContentTypes");
        Intrinsics.checkNotNullParameter(equityAssets, "equityAssets");
        Intrinsics.checkNotNullParameter(optionAssets, "optionAssets");
        this.brokerageOrDtcNumber = either;
        this.rhsAccountTitle = str;
        this.supportedContentTypes = supportedContentTypes;
        this.bannerContentfulTemplate = str2;
        this.assetFilterType = assetType;
        this.account = account;
        this.cashAsset = cashAsset;
        this.equityAssets = equityAssets;
        this.optionAssets = optionAssets;
        this.accountHasAccessToOptions = z;
    }

    public final Either<ApiBrokerage, String> getBrokerageOrDtcNumber() {
        return this.brokerageOrDtcNumber;
    }

    public final String getRhsAccountTitle() {
        return this.rhsAccountTitle;
    }

    public final Set<ApiAcatsAccountContentsResponse.SupportedContentType> getSupportedContentTypes() {
        return this.supportedContentTypes;
    }

    public final String getBannerContentfulTemplate() {
        return this.bannerContentfulTemplate;
    }

    public final ApiAcatsTransfer.Asset.AssetType getAssetFilterType() {
        return this.assetFilterType;
    }

    public final Account getAccount() {
        return this.account;
    }

    public final UiAcatsAsset.CashAsset getCashAsset$lib_acats_ui_externalDebug() {
        return this.cashAsset;
    }

    public /* synthetic */ AcatsInBuildPartialDataState(Either either, String str, Set set, String str2, ApiAcatsTransfer.Asset.AssetType assetType, Account account, UiAcatsAsset.CashAsset cashAsset, Map map, Map map2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(either, str, set, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : assetType, (i & 32) != 0 ? null : account, (i & 64) != 0 ? null : cashAsset, (i & 128) != 0 ? MapsKt.emptyMap() : map, (i & 256) != 0 ? MapsKt.emptyMap() : map2, (i & 512) != 0 ? false : z);
    }

    public final Map<UUID, UiAcatsAsset.EquityAsset> getEquityAssets$lib_acats_ui_externalDebug() {
        return this.equityAssets;
    }

    public final Map<UUID, UiAcatsAsset.OptionAsset> getOptionAssets$lib_acats_ui_externalDebug() {
        return this.optionAssets;
    }

    public final boolean getAccountHasAccessToOptions() {
        return this.accountHasAccessToOptions;
    }

    public final AcatsInBuildPartialDataState modifyEquityAssetMap(Function1<? super Map<UUID, UiAcatsAsset.EquityAsset>, Unit> func) {
        Intrinsics.checkNotNullParameter(func, "func");
        Map mutableMap = MapsKt.toMutableMap(this.equityAssets);
        func.invoke(mutableMap);
        return copy$default(this, null, null, null, null, null, null, null, mutableMap, null, false, 895, null);
    }

    public final AcatsInBuildPartialDataState modifyOptionAssetMap(Function1<? super Map<UUID, UiAcatsAsset.OptionAsset>, Unit> func) {
        Intrinsics.checkNotNullParameter(func, "func");
        Map mutableMap = MapsKt.toMutableMap(this.optionAssets);
        func.invoke(mutableMap);
        return copy$default(this, null, null, null, null, null, null, null, null, mutableMap, false, 767, null);
    }
}
