package com.robinhood.android.acatsin.partials;

import com.robinhood.android.acats.p057ui.C7686R;
import com.robinhood.android.acatsin.partials.UiAcatsAsset;
import com.robinhood.android.acatsin.partials.adapter.BuildPartialItem;
import com.robinhood.android.acatsin.util.Eithers;
import com.robinhood.models.api.bonfire.ApiAcatsAccountContentsResponse;
import com.robinhood.models.api.bonfire.ApiAcatsTransfer;
import com.robinhood.models.api.bonfire.ApiBrokerage;
import com.robinhood.models.p320db.Account;
import com.robinhood.utils.Either;
import com.robinhood.utils.resource.StringResource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: AcatsInBuildPartialViewState.kt */
@Metadata(m3635d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u009b\u0001\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e\u0012\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00120\u000e\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010B\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÂ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0005HÂ\u0003J\u000f\u0010D\u001a\b\u0012\u0004\u0012\u00020\t0\bHÂ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0005HÂ\u0003J\u0010\u0010F\u001a\u0004\u0018\u00010\fHÀ\u0003¢\u0006\u0002\bGJ\u001a\u0010H\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eHÀ\u0003¢\u0006\u0002\bIJ\u001a\u0010J\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00120\u000eHÀ\u0003¢\u0006\u0002\bKJ\u0010\u0010L\u001a\u0004\u0018\u00010\u0014HÀ\u0003¢\u0006\u0002\bMJ\u000b\u0010N\u001a\u0004\u0018\u00010\u0016HÂ\u0003J\t\u0010O\u001a\u00020\u0018HÆ\u0003J£\u0001\u0010P\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00120\u000e2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0018HÆ\u0001J\u0013\u0010Q\u001a\u00020\u00182\b\u0010R\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010S\u001a\u00020THÖ\u0001J\t\u0010U\u001a\u00020\u0005HÖ\u0001R\u001c\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00120\u000eX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020&0%8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010(R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020&0%8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010(R\u0014\u0010-\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010#R\u0014\u0010.\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010#R\u0014\u0010/\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u0010#R\u0014\u00100\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u0010#R\u0011\u00101\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b2\u0010#R\u0011\u00103\u001a\u0002048F¢\u0006\u0006\u001a\u0004\b5\u00106R\u0017\u00107\u001a\b\u0012\u0004\u0012\u0002080%¢\u0006\b\n\u0000\u001a\u0004\b9\u0010(R\u0017\u0010:\u001a\b\u0012\u0004\u0012\u00020&0%8F¢\u0006\u0006\u001a\u0004\b;\u0010(R\u0011\u0010<\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b=\u0010#R\u0011\u0010>\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b>\u0010#R\u0011\u0010?\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b@\u0010A¨\u0006V"}, m3636d2 = {"Lcom/robinhood/android/acatsin/partials/AcatsInBuildPartialViewState;", "", "brokerageOrDtcNumber", "Lcom/robinhood/utils/Either;", "Lcom/robinhood/models/api/bonfire/ApiBrokerage;", "", "rhsAccountTitle", "supportedContentTypes", "", "Lcom/robinhood/models/api/bonfire/ApiAcatsAccountContentsResponse$SupportedContentType;", "bannerContentfulTemplate", "cashAsset", "Lcom/robinhood/android/acatsin/partials/UiAcatsAsset$CashAsset;", "equityAssets", "", "Ljava/util/UUID;", "Lcom/robinhood/android/acatsin/partials/UiAcatsAsset$EquityAsset;", "optionAssets", "Lcom/robinhood/android/acatsin/partials/UiAcatsAsset$OptionAsset;", "assetFilterType", "Lcom/robinhood/models/api/bonfire/ApiAcatsTransfer$Asset$AssetType;", "account", "Lcom/robinhood/models/db/Account;", "accountHasAccessToOptions", "", "<init>", "(Lcom/robinhood/utils/Either;Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Lcom/robinhood/android/acatsin/partials/UiAcatsAsset$CashAsset;Ljava/util/Map;Ljava/util/Map;Lcom/robinhood/models/api/bonfire/ApiAcatsTransfer$Asset$AssetType;Lcom/robinhood/models/db/Account;Z)V", "getCashAsset$lib_acats_ui_externalDebug", "()Lcom/robinhood/android/acatsin/partials/UiAcatsAsset$CashAsset;", "getEquityAssets$lib_acats_ui_externalDebug", "()Ljava/util/Map;", "getOptionAssets$lib_acats_ui_externalDebug", "getAssetFilterType$lib_acats_ui_externalDebug", "()Lcom/robinhood/models/api/bonfire/ApiAcatsTransfer$Asset$AssetType;", "getAccountHasAccessToOptions", "()Z", "cashDisplayItems", "", "Lcom/robinhood/android/acatsin/partials/adapter/BuildPartialItem;", "getCashDisplayItems", "()Ljava/util/List;", "equityDisplayItems", "getEquityDisplayItems", "optionDisplayItems", "getOptionDisplayItems", "isMarginSupported", "isOptionsSupported", "isEquitySupported", "isCashSupported", "shouldDisplayOptionsChip", "getShouldDisplayOptionsChip", "cashChipStringResource", "Lcom/robinhood/utils/resource/StringResource;", "getCashChipStringResource", "()Lcom/robinhood/utils/resource/StringResource;", "assets", "Lcom/robinhood/android/acatsin/partials/UiAcatsAsset;", "getAssets", "displayList", "getDisplayList", "canContinue", "getCanContinue", "isBannerReady", "bannerMarkdown", "getBannerMarkdown", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component5$lib_acats_ui_externalDebug", "component6", "component6$lib_acats_ui_externalDebug", "component7", "component7$lib_acats_ui_externalDebug", "component8", "component8$lib_acats_ui_externalDebug", "component9", "component10", "copy", "equals", "other", "hashCode", "", "toString", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final /* data */ class AcatsInBuildPartialViewState {
    public static final int $stable = 8;
    private final Account account;
    private final boolean accountHasAccessToOptions;
    private final ApiAcatsTransfer.Asset.AssetType assetFilterType;
    private final List<UiAcatsAsset> assets;
    private final String bannerContentfulTemplate;
    private final Either<ApiBrokerage, String> brokerageOrDtcNumber;
    private final boolean canContinue;
    private final UiAcatsAsset.CashAsset cashAsset;
    private final Map<UUID, UiAcatsAsset.EquityAsset> equityAssets;
    private final boolean isBannerReady;
    private final Map<UUID, UiAcatsAsset.OptionAsset> optionAssets;
    private final String rhsAccountTitle;
    private final Set<ApiAcatsAccountContentsResponse.SupportedContentType> supportedContentTypes;

    /* compiled from: AcatsInBuildPartialViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiAcatsTransfer.Asset.AssetType.values().length];
            try {
                iArr[ApiAcatsTransfer.Asset.AssetType.CASH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiAcatsTransfer.Asset.AssetType.EQUITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiAcatsTransfer.Asset.AssetType.OPTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final Either<ApiBrokerage, String> component1() {
        return this.brokerageOrDtcNumber;
    }

    /* renamed from: component2, reason: from getter */
    private final String getRhsAccountTitle() {
        return this.rhsAccountTitle;
    }

    private final Set<ApiAcatsAccountContentsResponse.SupportedContentType> component3() {
        return this.supportedContentTypes;
    }

    /* renamed from: component4, reason: from getter */
    private final String getBannerContentfulTemplate() {
        return this.bannerContentfulTemplate;
    }

    /* renamed from: component9, reason: from getter */
    private final Account getAccount() {
        return this.account;
    }

    public static /* synthetic */ AcatsInBuildPartialViewState copy$default(AcatsInBuildPartialViewState acatsInBuildPartialViewState, Either either, String str, Set set, String str2, UiAcatsAsset.CashAsset cashAsset, Map map, Map map2, ApiAcatsTransfer.Asset.AssetType assetType, Account account, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            either = acatsInBuildPartialViewState.brokerageOrDtcNumber;
        }
        if ((i & 2) != 0) {
            str = acatsInBuildPartialViewState.rhsAccountTitle;
        }
        if ((i & 4) != 0) {
            set = acatsInBuildPartialViewState.supportedContentTypes;
        }
        if ((i & 8) != 0) {
            str2 = acatsInBuildPartialViewState.bannerContentfulTemplate;
        }
        if ((i & 16) != 0) {
            cashAsset = acatsInBuildPartialViewState.cashAsset;
        }
        if ((i & 32) != 0) {
            map = acatsInBuildPartialViewState.equityAssets;
        }
        if ((i & 64) != 0) {
            map2 = acatsInBuildPartialViewState.optionAssets;
        }
        if ((i & 128) != 0) {
            assetType = acatsInBuildPartialViewState.assetFilterType;
        }
        if ((i & 256) != 0) {
            account = acatsInBuildPartialViewState.account;
        }
        if ((i & 512) != 0) {
            z = acatsInBuildPartialViewState.accountHasAccessToOptions;
        }
        Account account2 = account;
        boolean z2 = z;
        Map map3 = map2;
        ApiAcatsTransfer.Asset.AssetType assetType2 = assetType;
        UiAcatsAsset.CashAsset cashAsset2 = cashAsset;
        Map map4 = map;
        return acatsInBuildPartialViewState.copy(either, str, set, str2, cashAsset2, map4, map3, assetType2, account2, z2);
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getAccountHasAccessToOptions() {
        return this.accountHasAccessToOptions;
    }

    /* renamed from: component5$lib_acats_ui_externalDebug, reason: from getter */
    public final UiAcatsAsset.CashAsset getCashAsset() {
        return this.cashAsset;
    }

    public final Map<UUID, UiAcatsAsset.EquityAsset> component6$lib_acats_ui_externalDebug() {
        return this.equityAssets;
    }

    public final Map<UUID, UiAcatsAsset.OptionAsset> component7$lib_acats_ui_externalDebug() {
        return this.optionAssets;
    }

    /* renamed from: component8$lib_acats_ui_externalDebug, reason: from getter */
    public final ApiAcatsTransfer.Asset.AssetType getAssetFilterType() {
        return this.assetFilterType;
    }

    public final AcatsInBuildPartialViewState copy(Either<ApiBrokerage, String> brokerageOrDtcNumber, String rhsAccountTitle, Set<? extends ApiAcatsAccountContentsResponse.SupportedContentType> supportedContentTypes, String bannerContentfulTemplate, UiAcatsAsset.CashAsset cashAsset, Map<UUID, UiAcatsAsset.EquityAsset> equityAssets, Map<UUID, UiAcatsAsset.OptionAsset> optionAssets, ApiAcatsTransfer.Asset.AssetType assetFilterType, Account account, boolean accountHasAccessToOptions) {
        Intrinsics.checkNotNullParameter(supportedContentTypes, "supportedContentTypes");
        Intrinsics.checkNotNullParameter(equityAssets, "equityAssets");
        Intrinsics.checkNotNullParameter(optionAssets, "optionAssets");
        return new AcatsInBuildPartialViewState(brokerageOrDtcNumber, rhsAccountTitle, supportedContentTypes, bannerContentfulTemplate, cashAsset, equityAssets, optionAssets, assetFilterType, account, accountHasAccessToOptions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AcatsInBuildPartialViewState)) {
            return false;
        }
        AcatsInBuildPartialViewState acatsInBuildPartialViewState = (AcatsInBuildPartialViewState) other;
        return Intrinsics.areEqual(this.brokerageOrDtcNumber, acatsInBuildPartialViewState.brokerageOrDtcNumber) && Intrinsics.areEqual(this.rhsAccountTitle, acatsInBuildPartialViewState.rhsAccountTitle) && Intrinsics.areEqual(this.supportedContentTypes, acatsInBuildPartialViewState.supportedContentTypes) && Intrinsics.areEqual(this.bannerContentfulTemplate, acatsInBuildPartialViewState.bannerContentfulTemplate) && Intrinsics.areEqual(this.cashAsset, acatsInBuildPartialViewState.cashAsset) && Intrinsics.areEqual(this.equityAssets, acatsInBuildPartialViewState.equityAssets) && Intrinsics.areEqual(this.optionAssets, acatsInBuildPartialViewState.optionAssets) && this.assetFilterType == acatsInBuildPartialViewState.assetFilterType && Intrinsics.areEqual(this.account, acatsInBuildPartialViewState.account) && this.accountHasAccessToOptions == acatsInBuildPartialViewState.accountHasAccessToOptions;
    }

    public int hashCode() {
        Either<ApiBrokerage, String> either = this.brokerageOrDtcNumber;
        int iHashCode = (either == null ? 0 : either.hashCode()) * 31;
        String str = this.rhsAccountTitle;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.supportedContentTypes.hashCode()) * 31;
        String str2 = this.bannerContentfulTemplate;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        UiAcatsAsset.CashAsset cashAsset = this.cashAsset;
        int iHashCode4 = (((((iHashCode3 + (cashAsset == null ? 0 : cashAsset.hashCode())) * 31) + this.equityAssets.hashCode()) * 31) + this.optionAssets.hashCode()) * 31;
        ApiAcatsTransfer.Asset.AssetType assetType = this.assetFilterType;
        int iHashCode5 = (iHashCode4 + (assetType == null ? 0 : assetType.hashCode())) * 31;
        Account account = this.account;
        return ((iHashCode5 + (account != null ? account.hashCode() : 0)) * 31) + Boolean.hashCode(this.accountHasAccessToOptions);
    }

    public String toString() {
        return "AcatsInBuildPartialViewState(brokerageOrDtcNumber=" + this.brokerageOrDtcNumber + ", rhsAccountTitle=" + this.rhsAccountTitle + ", supportedContentTypes=" + this.supportedContentTypes + ", bannerContentfulTemplate=" + this.bannerContentfulTemplate + ", cashAsset=" + this.cashAsset + ", equityAssets=" + this.equityAssets + ", optionAssets=" + this.optionAssets + ", assetFilterType=" + this.assetFilterType + ", account=" + this.account + ", accountHasAccessToOptions=" + this.accountHasAccessToOptions + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AcatsInBuildPartialViewState(Either<ApiBrokerage, String> either, String str, Set<? extends ApiAcatsAccountContentsResponse.SupportedContentType> supportedContentTypes, String str2, UiAcatsAsset.CashAsset cashAsset, Map<UUID, UiAcatsAsset.EquityAsset> equityAssets, Map<UUID, UiAcatsAsset.OptionAsset> optionAssets, ApiAcatsTransfer.Asset.AssetType assetType, Account account, boolean z) {
        Intrinsics.checkNotNullParameter(supportedContentTypes, "supportedContentTypes");
        Intrinsics.checkNotNullParameter(equityAssets, "equityAssets");
        Intrinsics.checkNotNullParameter(optionAssets, "optionAssets");
        this.brokerageOrDtcNumber = either;
        this.rhsAccountTitle = str;
        this.supportedContentTypes = supportedContentTypes;
        this.bannerContentfulTemplate = str2;
        this.cashAsset = cashAsset;
        this.equityAssets = equityAssets;
        this.optionAssets = optionAssets;
        this.assetFilterType = assetType;
        this.account = account;
        this.accountHasAccessToOptions = z;
        this.assets = CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) CollectionsKt.listOfNotNull(cashAsset), (Iterable) equityAssets.values()), (Iterable) optionAssets.values());
        this.canContinue = !r4.isEmpty();
        this.isBannerReady = (str2 == null || either == null || str == null) ? false : true;
    }

    public final UiAcatsAsset.CashAsset getCashAsset$lib_acats_ui_externalDebug() {
        return this.cashAsset;
    }

    public /* synthetic */ AcatsInBuildPartialViewState(Either either, String str, Set set, String str2, UiAcatsAsset.CashAsset cashAsset, Map map, Map map2, ApiAcatsTransfer.Asset.AssetType assetType, Account account, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(either, str, set, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : cashAsset, (i & 32) != 0 ? MapsKt.emptyMap() : map, (i & 64) != 0 ? MapsKt.emptyMap() : map2, (i & 128) != 0 ? null : assetType, (i & 256) != 0 ? null : account, (i & 512) != 0 ? false : z);
    }

    public final Map<UUID, UiAcatsAsset.EquityAsset> getEquityAssets$lib_acats_ui_externalDebug() {
        return this.equityAssets;
    }

    public final Map<UUID, UiAcatsAsset.OptionAsset> getOptionAssets$lib_acats_ui_externalDebug() {
        return this.optionAssets;
    }

    public final ApiAcatsTransfer.Asset.AssetType getAssetFilterType$lib_acats_ui_externalDebug() {
        return this.assetFilterType;
    }

    public final boolean getAccountHasAccessToOptions() {
        return this.accountHasAccessToOptions;
    }

    private final List<BuildPartialItem> getCashDisplayItems() {
        int i;
        BuildPartialItem asset;
        if (!isCashSupported()) {
            return CollectionsKt.emptyList();
        }
        if (isMarginSupported()) {
            i = C7686R.string.acats_in_build_partial_cash_and_margin_header;
        } else {
            i = C7686R.string.acats_in_build_partial_cash_asset_title;
        }
        BuildPartialItem.Header header = new BuildPartialItem.Header(i);
        if (this.cashAsset == null) {
            asset = new BuildPartialItem.AddAsset(C7686R.string.acats_in_build_partial_cash_add, ApiAcatsTransfer.Asset.AssetType.CASH, isMarginSupported());
        } else {
            asset = new BuildPartialItem.Asset(this.cashAsset);
        }
        return CollectionsKt.listOf((Object[]) new BuildPartialItem[]{header, asset});
    }

    private final List<BuildPartialItem> getEquityDisplayItems() {
        if (!isEquitySupported()) {
            return CollectionsKt.emptyList();
        }
        List listListOf = CollectionsKt.listOf((Object[]) new BuildPartialItem[]{new BuildPartialItem.Header(C7686R.string.acats_in_build_partial_equity_header), new BuildPartialItem.AddAsset(C7686R.string.acats_in_build_partial_equity_add, ApiAcatsTransfer.Asset.AssetType.EQUITY, false, 4, null)});
        Collection<UiAcatsAsset.EquityAsset> collectionValues = this.equityAssets.values();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collectionValues, 10));
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            arrayList.add(new BuildPartialItem.Asset((UiAcatsAsset.EquityAsset) it.next()));
        }
        return CollectionsKt.plus((Collection) listListOf, (Iterable) arrayList);
    }

    private final List<BuildPartialItem> getOptionDisplayItems() {
        if (!isOptionsSupported()) {
            return CollectionsKt.emptyList();
        }
        List listListOf = CollectionsKt.listOf((Object[]) new BuildPartialItem[]{new BuildPartialItem.Header(C7686R.string.acats_in_build_partial_options_header), new BuildPartialItem.AddAsset(C7686R.string.acats_in_build_partial_options_add, ApiAcatsTransfer.Asset.AssetType.OPTION, false, 4, null)});
        Collection<UiAcatsAsset.OptionAsset> collectionValues = this.optionAssets.values();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collectionValues, 10));
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            arrayList.add(new BuildPartialItem.Asset((UiAcatsAsset.OptionAsset) it.next()));
        }
        return CollectionsKt.plus((Collection) listListOf, (Iterable) arrayList);
    }

    private final boolean isMarginSupported() {
        return this.supportedContentTypes.contains(ApiAcatsAccountContentsResponse.SupportedContentType.MARGIN);
    }

    private final boolean isOptionsSupported() {
        return this.supportedContentTypes.contains(ApiAcatsAccountContentsResponse.SupportedContentType.OPTIONS);
    }

    private final boolean isEquitySupported() {
        return this.supportedContentTypes.contains(ApiAcatsAccountContentsResponse.SupportedContentType.STOCKS_ETFS);
    }

    private final boolean isCashSupported() {
        return this.supportedContentTypes.contains(ApiAcatsAccountContentsResponse.SupportedContentType.CASH);
    }

    public final boolean getShouldDisplayOptionsChip() {
        return isOptionsSupported();
    }

    public final StringResource getCashChipStringResource() {
        int i;
        StringResource.Companion companion = StringResource.INSTANCE;
        if (isMarginSupported()) {
            i = C7686R.string.acats_in_build_partial_cash_and_margin_chip;
        } else {
            i = C7686R.string.acats_in_build_partial_cash_only_chip;
        }
        return companion.invoke(i, new Object[0]);
    }

    public final List<UiAcatsAsset> getAssets() {
        return this.assets;
    }

    public final List<BuildPartialItem> getDisplayList() {
        ApiAcatsTransfer.Asset.AssetType assetType = this.assetFilterType;
        int i = assetType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[assetType.ordinal()];
        if (i == 1) {
            return getCashDisplayItems();
        }
        if (i == 2) {
            return getEquityDisplayItems();
        }
        if (i == 3) {
            return getOptionDisplayItems();
        }
        return CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) getCashDisplayItems(), (Iterable) getEquityDisplayItems()), (Iterable) getOptionDisplayItems());
    }

    public final boolean getCanContinue() {
        return this.canContinue;
    }

    /* renamed from: isBannerReady, reason: from getter */
    public final boolean getIsBannerReady() {
        return this.isBannerReady;
    }

    public final String getBannerMarkdown() {
        String str = this.bannerContentfulTemplate;
        if (str == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Either<ApiBrokerage, String> either = this.brokerageOrDtcNumber;
        if (either == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if (this.rhsAccountTitle == null) {
            throw new IllegalStateException("Required value was null.");
        }
        return StringsKt.replace$default(StringsKt.replace$default(str, "{broker_name}", Eithers.getName(either), false, 4, (Object) null), "{selected_account_type}", this.rhsAccountTitle, false, 4, (Object) null);
    }
}
