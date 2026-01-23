package com.robinhood.android.acatsin;

import com.robinhood.android.acatsin.partials.UiAcatsAsset;
import com.robinhood.android.acatsin.util.names.NamesOnAccount;
import com.robinhood.models.acats.p299db.bonfire.AccountContentItem;
import com.robinhood.models.acats.p299db.bonfire.AvailableAccount;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.bonfire.ApiAcatsAccountContentsResponse;
import com.robinhood.models.api.bonfire.ApiAcatsBonusPromoInfo;
import com.robinhood.models.api.bonfire.ApiBrokerage;
import com.robinhood.utils.Either;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsInViewState.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 P2\u00020\u0001:\u0001PBß\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0010\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001e\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0005¢\u0006\u0004\b \u0010!J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0005HÂ\u0003J\t\u0010;\u001a\u00020\u0005HÆ\u0003J\u0017\u0010<\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bHÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0003J\u000f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00130\u0010HÆ\u0003J\u000f\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010D\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0010HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\t\u0010F\u001a\u00020\u0005HÂ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\t\u0010H\u001a\u00020\u001eHÆ\u0003J\t\u0010I\u001a\u00020\u0005HÆ\u0003Jç\u0001\u0010J\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00102\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00102\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00102\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00052\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u0005HÆ\u0001J\u0013\u0010K\u001a\u00020\u00052\b\u0010L\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010M\u001a\u00020NHÖ\u0001J\t\u0010O\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010#R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0010¢\u0006\b\n\u0000\u001a\u0004\b/\u0010.R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010¢\u0006\b\n\u0000\u001a\u0004\b0\u0010.R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010#R\u0019\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b2\u0010.R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u000e\u0010\u001a\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0011\u0010\u001d\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0011\u0010\u001f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010%¨\u0006Q"}, m3636d2 = {"Lcom/robinhood/android/acatsin/AcatsInViewState;", "", "source", "", "skipIntro", "", "introShown", "brokerageOrDtcNumber", "Lcom/robinhood/utils/Either;", "Lcom/robinhood/models/api/bonfire/ApiBrokerage;", "rhsAccount", "Lcom/robinhood/models/acats/db/bonfire/AvailableAccount;", "contraAccountNumber", "accountNames", "Lcom/robinhood/android/acatsin/util/names/NamesOnAccount;", "accountContents", "", "Lcom/robinhood/models/acats/db/bonfire/AccountContentItem;", "supportedContentTypes", "Lcom/robinhood/models/api/bonfire/ApiAcatsAccountContentsResponse$SupportedContentType;", "unsupportedContentTypes", "buildPartialBannerContentfulId", "assets", "Lcom/robinhood/android/acatsin/partials/UiAcatsAsset;", "submittedAcatsTransferId", "Ljava/util/UUID;", "isMarginInvestingEnabled", "acatsBonusPromoInfo", "Lcom/robinhood/models/api/bonfire/ApiAcatsBonusPromoInfo;", "selectedAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "isInJointAccountMarginExperiment", "<init>", "(Ljava/lang/String;ZZLcom/robinhood/utils/Either;Lcom/robinhood/models/acats/db/bonfire/AvailableAccount;Ljava/lang/String;Lcom/robinhood/android/acatsin/util/names/NamesOnAccount;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/UUID;ZLcom/robinhood/models/api/bonfire/ApiAcatsBonusPromoInfo;Lcom/robinhood/models/api/BrokerageAccountType;Z)V", "getSource", "()Ljava/lang/String;", "getIntroShown", "()Z", "getBrokerageOrDtcNumber", "()Lcom/robinhood/utils/Either;", "getRhsAccount", "()Lcom/robinhood/models/acats/db/bonfire/AvailableAccount;", "getContraAccountNumber", "getAccountNames", "()Lcom/robinhood/android/acatsin/util/names/NamesOnAccount;", "getAccountContents", "()Ljava/util/List;", "getSupportedContentTypes", "getUnsupportedContentTypes", "getBuildPartialBannerContentfulId", "getAssets", "getSubmittedAcatsTransferId", "()Ljava/util/UUID;", "getAcatsBonusPromoInfo", "()Lcom/robinhood/models/api/bonfire/ApiAcatsBonusPromoInfo;", "getSelectedAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class AcatsInViewState {
    private final ApiAcatsBonusPromoInfo acatsBonusPromoInfo;
    private final List<AccountContentItem> accountContents;
    private final NamesOnAccount accountNames;
    private final List<UiAcatsAsset> assets;
    private final Either<ApiBrokerage, String> brokerageOrDtcNumber;
    private final String buildPartialBannerContentfulId;
    private final String contraAccountNumber;
    private final boolean introShown;
    private final boolean isInJointAccountMarginExperiment;
    private final boolean isMarginInvestingEnabled;
    private final AvailableAccount rhsAccount;
    private final BrokerageAccountType selectedAccountType;
    private final boolean skipIntro;
    private final String source;
    private final UUID submittedAcatsTransferId;
    private final List<ApiAcatsAccountContentsResponse.SupportedContentType> supportedContentTypes;
    private final List<String> unsupportedContentTypes;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final List<ApiAcatsAccountContentsResponse.SupportedContentType> legacySupportedContentTypes = CollectionsKt.listOf((Object[]) new ApiAcatsAccountContentsResponse.SupportedContentType[]{ApiAcatsAccountContentsResponse.SupportedContentType.CASH, ApiAcatsAccountContentsResponse.SupportedContentType.MARGIN, ApiAcatsAccountContentsResponse.SupportedContentType.STOCKS_ETFS, ApiAcatsAccountContentsResponse.SupportedContentType.OPTIONS});

    /* renamed from: component14, reason: from getter */
    private final boolean getIsMarginInvestingEnabled() {
        return this.isMarginInvestingEnabled;
    }

    /* renamed from: component2, reason: from getter */
    private final boolean getSkipIntro() {
        return this.skipIntro;
    }

    public static /* synthetic */ AcatsInViewState copy$default(AcatsInViewState acatsInViewState, String str, boolean z, boolean z2, Either either, AvailableAccount availableAccount, String str2, NamesOnAccount namesOnAccount, List list, List list2, List list3, String str3, List list4, UUID uuid, boolean z3, ApiAcatsBonusPromoInfo apiAcatsBonusPromoInfo, BrokerageAccountType brokerageAccountType, boolean z4, int i, Object obj) {
        boolean z5;
        BrokerageAccountType brokerageAccountType2;
        String str4;
        AcatsInViewState acatsInViewState2;
        ApiAcatsBonusPromoInfo apiAcatsBonusPromoInfo2;
        boolean z6;
        boolean z7;
        Either either2;
        AvailableAccount availableAccount2;
        String str5;
        NamesOnAccount namesOnAccount2;
        List list5;
        List list6;
        List list7;
        String str6;
        List list8;
        UUID uuid2;
        boolean z8;
        String str7 = (i & 1) != 0 ? acatsInViewState.source : str;
        boolean z9 = (i & 2) != 0 ? acatsInViewState.skipIntro : z;
        boolean z10 = (i & 4) != 0 ? acatsInViewState.introShown : z2;
        Either either3 = (i & 8) != 0 ? acatsInViewState.brokerageOrDtcNumber : either;
        AvailableAccount availableAccount3 = (i & 16) != 0 ? acatsInViewState.rhsAccount : availableAccount;
        String str8 = (i & 32) != 0 ? acatsInViewState.contraAccountNumber : str2;
        NamesOnAccount namesOnAccount3 = (i & 64) != 0 ? acatsInViewState.accountNames : namesOnAccount;
        List list9 = (i & 128) != 0 ? acatsInViewState.accountContents : list;
        List list10 = (i & 256) != 0 ? acatsInViewState.supportedContentTypes : list2;
        List list11 = (i & 512) != 0 ? acatsInViewState.unsupportedContentTypes : list3;
        String str9 = (i & 1024) != 0 ? acatsInViewState.buildPartialBannerContentfulId : str3;
        List list12 = (i & 2048) != 0 ? acatsInViewState.assets : list4;
        UUID uuid3 = (i & 4096) != 0 ? acatsInViewState.submittedAcatsTransferId : uuid;
        boolean z11 = (i & 8192) != 0 ? acatsInViewState.isMarginInvestingEnabled : z3;
        String str10 = str7;
        ApiAcatsBonusPromoInfo apiAcatsBonusPromoInfo3 = (i & 16384) != 0 ? acatsInViewState.acatsBonusPromoInfo : apiAcatsBonusPromoInfo;
        BrokerageAccountType brokerageAccountType3 = (i & 32768) != 0 ? acatsInViewState.selectedAccountType : brokerageAccountType;
        if ((i & 65536) != 0) {
            brokerageAccountType2 = brokerageAccountType3;
            z5 = acatsInViewState.isInJointAccountMarginExperiment;
            apiAcatsBonusPromoInfo2 = apiAcatsBonusPromoInfo3;
            z6 = z9;
            z7 = z10;
            either2 = either3;
            availableAccount2 = availableAccount3;
            str5 = str8;
            namesOnAccount2 = namesOnAccount3;
            list5 = list9;
            list6 = list10;
            list7 = list11;
            str6 = str9;
            list8 = list12;
            uuid2 = uuid3;
            z8 = z11;
            str4 = str10;
            acatsInViewState2 = acatsInViewState;
        } else {
            z5 = z4;
            brokerageAccountType2 = brokerageAccountType3;
            str4 = str10;
            acatsInViewState2 = acatsInViewState;
            apiAcatsBonusPromoInfo2 = apiAcatsBonusPromoInfo3;
            z6 = z9;
            z7 = z10;
            either2 = either3;
            availableAccount2 = availableAccount3;
            str5 = str8;
            namesOnAccount2 = namesOnAccount3;
            list5 = list9;
            list6 = list10;
            list7 = list11;
            str6 = str9;
            list8 = list12;
            uuid2 = uuid3;
            z8 = z11;
        }
        return acatsInViewState2.copy(str4, z6, z7, either2, availableAccount2, str5, namesOnAccount2, list5, list6, list7, str6, list8, uuid2, z8, apiAcatsBonusPromoInfo2, brokerageAccountType2, z5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    public final List<String> component10() {
        return this.unsupportedContentTypes;
    }

    /* renamed from: component11, reason: from getter */
    public final String getBuildPartialBannerContentfulId() {
        return this.buildPartialBannerContentfulId;
    }

    public final List<UiAcatsAsset> component12() {
        return this.assets;
    }

    /* renamed from: component13, reason: from getter */
    public final UUID getSubmittedAcatsTransferId() {
        return this.submittedAcatsTransferId;
    }

    /* renamed from: component15, reason: from getter */
    public final ApiAcatsBonusPromoInfo getAcatsBonusPromoInfo() {
        return this.acatsBonusPromoInfo;
    }

    /* renamed from: component16, reason: from getter */
    public final BrokerageAccountType getSelectedAccountType() {
        return this.selectedAccountType;
    }

    /* renamed from: component17, reason: from getter */
    public final boolean getIsInJointAccountMarginExperiment() {
        return this.isInJointAccountMarginExperiment;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIntroShown() {
        return this.introShown;
    }

    public final Either<ApiBrokerage, String> component4() {
        return this.brokerageOrDtcNumber;
    }

    /* renamed from: component5, reason: from getter */
    public final AvailableAccount getRhsAccount() {
        return this.rhsAccount;
    }

    /* renamed from: component6, reason: from getter */
    public final String getContraAccountNumber() {
        return this.contraAccountNumber;
    }

    /* renamed from: component7, reason: from getter */
    public final NamesOnAccount getAccountNames() {
        return this.accountNames;
    }

    public final List<AccountContentItem> component8() {
        return this.accountContents;
    }

    public final List<ApiAcatsAccountContentsResponse.SupportedContentType> component9() {
        return this.supportedContentTypes;
    }

    public final AcatsInViewState copy(String source, boolean skipIntro, boolean introShown, Either<ApiBrokerage, String> brokerageOrDtcNumber, AvailableAccount rhsAccount, String contraAccountNumber, NamesOnAccount accountNames, List<AccountContentItem> accountContents, List<? extends ApiAcatsAccountContentsResponse.SupportedContentType> supportedContentTypes, List<String> unsupportedContentTypes, String buildPartialBannerContentfulId, List<? extends UiAcatsAsset> assets, UUID submittedAcatsTransferId, boolean isMarginInvestingEnabled, ApiAcatsBonusPromoInfo acatsBonusPromoInfo, BrokerageAccountType selectedAccountType, boolean isInJointAccountMarginExperiment) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(accountContents, "accountContents");
        Intrinsics.checkNotNullParameter(supportedContentTypes, "supportedContentTypes");
        Intrinsics.checkNotNullParameter(unsupportedContentTypes, "unsupportedContentTypes");
        Intrinsics.checkNotNullParameter(selectedAccountType, "selectedAccountType");
        return new AcatsInViewState(source, skipIntro, introShown, brokerageOrDtcNumber, rhsAccount, contraAccountNumber, accountNames, accountContents, supportedContentTypes, unsupportedContentTypes, buildPartialBannerContentfulId, assets, submittedAcatsTransferId, isMarginInvestingEnabled, acatsBonusPromoInfo, selectedAccountType, isInJointAccountMarginExperiment);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AcatsInViewState)) {
            return false;
        }
        AcatsInViewState acatsInViewState = (AcatsInViewState) other;
        return Intrinsics.areEqual(this.source, acatsInViewState.source) && this.skipIntro == acatsInViewState.skipIntro && this.introShown == acatsInViewState.introShown && Intrinsics.areEqual(this.brokerageOrDtcNumber, acatsInViewState.brokerageOrDtcNumber) && Intrinsics.areEqual(this.rhsAccount, acatsInViewState.rhsAccount) && Intrinsics.areEqual(this.contraAccountNumber, acatsInViewState.contraAccountNumber) && Intrinsics.areEqual(this.accountNames, acatsInViewState.accountNames) && Intrinsics.areEqual(this.accountContents, acatsInViewState.accountContents) && Intrinsics.areEqual(this.supportedContentTypes, acatsInViewState.supportedContentTypes) && Intrinsics.areEqual(this.unsupportedContentTypes, acatsInViewState.unsupportedContentTypes) && Intrinsics.areEqual(this.buildPartialBannerContentfulId, acatsInViewState.buildPartialBannerContentfulId) && Intrinsics.areEqual(this.assets, acatsInViewState.assets) && Intrinsics.areEqual(this.submittedAcatsTransferId, acatsInViewState.submittedAcatsTransferId) && this.isMarginInvestingEnabled == acatsInViewState.isMarginInvestingEnabled && Intrinsics.areEqual(this.acatsBonusPromoInfo, acatsInViewState.acatsBonusPromoInfo) && this.selectedAccountType == acatsInViewState.selectedAccountType && this.isInJointAccountMarginExperiment == acatsInViewState.isInJointAccountMarginExperiment;
    }

    public int hashCode() {
        int iHashCode = ((((this.source.hashCode() * 31) + Boolean.hashCode(this.skipIntro)) * 31) + Boolean.hashCode(this.introShown)) * 31;
        Either<ApiBrokerage, String> either = this.brokerageOrDtcNumber;
        int iHashCode2 = (iHashCode + (either == null ? 0 : either.hashCode())) * 31;
        AvailableAccount availableAccount = this.rhsAccount;
        int iHashCode3 = (iHashCode2 + (availableAccount == null ? 0 : availableAccount.hashCode())) * 31;
        String str = this.contraAccountNumber;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        NamesOnAccount namesOnAccount = this.accountNames;
        int iHashCode5 = (((((((iHashCode4 + (namesOnAccount == null ? 0 : namesOnAccount.hashCode())) * 31) + this.accountContents.hashCode()) * 31) + this.supportedContentTypes.hashCode()) * 31) + this.unsupportedContentTypes.hashCode()) * 31;
        String str2 = this.buildPartialBannerContentfulId;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<UiAcatsAsset> list = this.assets;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        UUID uuid = this.submittedAcatsTransferId;
        int iHashCode8 = (((iHashCode7 + (uuid == null ? 0 : uuid.hashCode())) * 31) + Boolean.hashCode(this.isMarginInvestingEnabled)) * 31;
        ApiAcatsBonusPromoInfo apiAcatsBonusPromoInfo = this.acatsBonusPromoInfo;
        return ((((iHashCode8 + (apiAcatsBonusPromoInfo != null ? apiAcatsBonusPromoInfo.hashCode() : 0)) * 31) + this.selectedAccountType.hashCode()) * 31) + Boolean.hashCode(this.isInJointAccountMarginExperiment);
    }

    public String toString() {
        return "AcatsInViewState(source=" + this.source + ", skipIntro=" + this.skipIntro + ", introShown=" + this.introShown + ", brokerageOrDtcNumber=" + this.brokerageOrDtcNumber + ", rhsAccount=" + this.rhsAccount + ", contraAccountNumber=" + this.contraAccountNumber + ", accountNames=" + this.accountNames + ", accountContents=" + this.accountContents + ", supportedContentTypes=" + this.supportedContentTypes + ", unsupportedContentTypes=" + this.unsupportedContentTypes + ", buildPartialBannerContentfulId=" + this.buildPartialBannerContentfulId + ", assets=" + this.assets + ", submittedAcatsTransferId=" + this.submittedAcatsTransferId + ", isMarginInvestingEnabled=" + this.isMarginInvestingEnabled + ", acatsBonusPromoInfo=" + this.acatsBonusPromoInfo + ", selectedAccountType=" + this.selectedAccountType + ", isInJointAccountMarginExperiment=" + this.isInJointAccountMarginExperiment + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AcatsInViewState(String source, boolean z, boolean z2, Either<ApiBrokerage, String> either, AvailableAccount availableAccount, String str, NamesOnAccount namesOnAccount, List<AccountContentItem> accountContents, List<? extends ApiAcatsAccountContentsResponse.SupportedContentType> supportedContentTypes, List<String> unsupportedContentTypes, String str2, List<? extends UiAcatsAsset> list, UUID uuid, boolean z3, ApiAcatsBonusPromoInfo apiAcatsBonusPromoInfo, BrokerageAccountType selectedAccountType, boolean z4) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(accountContents, "accountContents");
        Intrinsics.checkNotNullParameter(supportedContentTypes, "supportedContentTypes");
        Intrinsics.checkNotNullParameter(unsupportedContentTypes, "unsupportedContentTypes");
        Intrinsics.checkNotNullParameter(selectedAccountType, "selectedAccountType");
        this.source = source;
        this.skipIntro = z;
        this.introShown = z2;
        this.brokerageOrDtcNumber = either;
        this.rhsAccount = availableAccount;
        this.contraAccountNumber = str;
        this.accountNames = namesOnAccount;
        this.accountContents = accountContents;
        this.supportedContentTypes = supportedContentTypes;
        this.unsupportedContentTypes = unsupportedContentTypes;
        this.buildPartialBannerContentfulId = str2;
        this.assets = list;
        this.submittedAcatsTransferId = uuid;
        this.isMarginInvestingEnabled = z3;
        this.acatsBonusPromoInfo = apiAcatsBonusPromoInfo;
        this.selectedAccountType = selectedAccountType;
        this.isInJointAccountMarginExperiment = z4;
    }

    public final String getSource() {
        return this.source;
    }

    public final boolean getIntroShown() {
        return this.introShown;
    }

    public final Either<ApiBrokerage, String> getBrokerageOrDtcNumber() {
        return this.brokerageOrDtcNumber;
    }

    public final AvailableAccount getRhsAccount() {
        return this.rhsAccount;
    }

    public final String getContraAccountNumber() {
        return this.contraAccountNumber;
    }

    public final NamesOnAccount getAccountNames() {
        return this.accountNames;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ AcatsInViewState(java.lang.String r22, boolean r23, boolean r24, com.robinhood.utils.Either r25, com.robinhood.models.acats.p299db.bonfire.AvailableAccount r26, java.lang.String r27, com.robinhood.android.acatsin.util.names.NamesOnAccount r28, java.util.List r29, java.util.List r30, java.util.List r31, java.lang.String r32, java.util.List r33, java.util.UUID r34, boolean r35, com.robinhood.models.api.bonfire.ApiAcatsBonusPromoInfo r36, com.robinhood.models.api.BrokerageAccountType r37, boolean r38, int r39, kotlin.jvm.internal.DefaultConstructorMarker r40) {
        /*
            r21 = this;
            r0 = r39
            r1 = r0 & 8
            r2 = 0
            if (r1 == 0) goto L9
            r7 = r2
            goto Lb
        L9:
            r7 = r25
        Lb:
            r1 = r0 & 16
            if (r1 == 0) goto L11
            r8 = r2
            goto L13
        L11:
            r8 = r26
        L13:
            r1 = r0 & 32
            if (r1 == 0) goto L19
            r9 = r2
            goto L1b
        L19:
            r9 = r27
        L1b:
            r1 = r0 & 64
            if (r1 == 0) goto L21
            r10 = r2
            goto L23
        L21:
            r10 = r28
        L23:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L2d
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
            r11 = r1
            goto L2f
        L2d:
            r11 = r29
        L2f:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L37
            java.util.List<com.robinhood.models.api.bonfire.ApiAcatsAccountContentsResponse$SupportedContentType> r1 = com.robinhood.android.acatsin.AcatsInViewState.legacySupportedContentTypes
            r12 = r1
            goto L39
        L37:
            r12 = r30
        L39:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L43
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
            r13 = r1
            goto L45
        L43:
            r13 = r31
        L45:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L4b
            r14 = r2
            goto L4d
        L4b:
            r14 = r32
        L4d:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L53
            r15 = r2
            goto L55
        L53:
            r15 = r33
        L55:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L5c
            r16 = r2
            goto L5e
        L5c:
            r16 = r34
        L5e:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            r3 = 0
            if (r1 == 0) goto L66
            r17 = r3
            goto L68
        L66:
            r17 = r35
        L68:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L6f
            r18 = r2
            goto L71
        L6f:
            r18 = r36
        L71:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L7c
            com.robinhood.models.api.BrokerageAccountType r1 = com.robinhood.models.api.BrokerageAccountType.UNKNOWN
            r19 = r1
            goto L7e
        L7c:
            r19 = r37
        L7e:
            r1 = 65536(0x10000, float:9.18355E-41)
            r0 = r0 & r1
            if (r0 == 0) goto L8e
            r20 = r3
            r4 = r22
            r5 = r23
            r6 = r24
            r3 = r21
            goto L98
        L8e:
            r20 = r38
            r3 = r21
            r4 = r22
            r5 = r23
            r6 = r24
        L98:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.acatsin.AcatsInViewState.<init>(java.lang.String, boolean, boolean, com.robinhood.utils.Either, com.robinhood.models.acats.db.bonfire.AvailableAccount, java.lang.String, com.robinhood.android.acatsin.util.names.NamesOnAccount, java.util.List, java.util.List, java.util.List, java.lang.String, java.util.List, java.util.UUID, boolean, com.robinhood.models.api.bonfire.ApiAcatsBonusPromoInfo, com.robinhood.models.api.BrokerageAccountType, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final List<AccountContentItem> getAccountContents() {
        return this.accountContents;
    }

    public final List<ApiAcatsAccountContentsResponse.SupportedContentType> getSupportedContentTypes() {
        return this.supportedContentTypes;
    }

    public final List<String> getUnsupportedContentTypes() {
        return this.unsupportedContentTypes;
    }

    public final String getBuildPartialBannerContentfulId() {
        return this.buildPartialBannerContentfulId;
    }

    public final List<UiAcatsAsset> getAssets() {
        return this.assets;
    }

    public final UUID getSubmittedAcatsTransferId() {
        return this.submittedAcatsTransferId;
    }

    public final ApiAcatsBonusPromoInfo getAcatsBonusPromoInfo() {
        return this.acatsBonusPromoInfo;
    }

    public final BrokerageAccountType getSelectedAccountType() {
        return this.selectedAccountType;
    }

    public final boolean isInJointAccountMarginExperiment() {
        return this.isInJointAccountMarginExperiment;
    }

    /* compiled from: AcatsInViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/acatsin/AcatsInViewState$Companion;", "", "<init>", "()V", "legacySupportedContentTypes", "", "Lcom/robinhood/models/api/bonfire/ApiAcatsAccountContentsResponse$SupportedContentType;", "getLegacySupportedContentTypes", "()Ljava/util/List;", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<ApiAcatsAccountContentsResponse.SupportedContentType> getLegacySupportedContentTypes() {
            return AcatsInViewState.legacySupportedContentTypes;
        }
    }
}
