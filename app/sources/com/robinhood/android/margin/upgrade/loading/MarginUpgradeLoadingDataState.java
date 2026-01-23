package com.robinhood.android.margin.upgrade.loading;

import com.robinhood.android.common.margin.p083ui.MarginSpendingProduct;
import com.robinhood.android.lib.margin.api.ApiMarginEligibility;
import com.robinhood.android.lib.margin.api.ApiMarginInvestingInfo;
import com.robinhood.android.lib.margin.api.ApiMarginOnboardingSplash;
import com.robinhood.android.lib.margin.api.MarginInterestRateChoice;
import com.robinhood.android.lib.margin.p167db.models.MarginSettings;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.subscription.p352db.MarginSubscription;
import com.robinhood.referral.SingularAttributionManager;
import com.robinhood.shared.discovery.sdui.SduiFeatureDiscovery3;
import com.robinhood.staticcontent.model.OtherMarkdown;
import com.robinhood.staticcontent.model.productmarketing.ProductMarketingContent;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MarginUpgradeLoadingState.kt */
@Metadata(m3635d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b?\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Bý\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b&\u0010'J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010L\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u0010\u0010V\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0002\u0010?J\u0010\u0010W\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0002\u0010?J\u0010\u0010X\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0002\u0010BJ\u0010\u0010Y\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0002\u0010BJ\u000b\u0010Z\u001a\u0004\u0018\u00010!HÆ\u0003J\u0010\u0010[\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0002\u0010?J\u000b\u0010\\\u001a\u0004\u0018\u00010$HÆ\u0003J\u0010\u0010]\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0002\u0010?J\u0084\u0002\u0010^\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u001bHÆ\u0001¢\u0006\u0002\u0010_J\u0013\u0010`\u001a\u00020\u001b2\b\u0010a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010b\u001a\u00020\u001eHÖ\u0001J\t\u0010c\u001a\u00020dHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b6\u00105R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0015\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\n\n\u0002\u0010@\u001a\u0004\b\u001a\u0010?R\u0015\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\n\n\u0002\u0010@\u001a\u0004\b\u001c\u0010?R\u0015\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\n\n\u0002\u0010C\u001a\u0004\bA\u0010BR\u0015\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\n\n\u0002\u0010C\u001a\u0004\bD\u0010BR\u0013\u0010 \u001a\u0004\u0018\u00010!¢\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u0015\u0010\"\u001a\u0004\u0018\u00010\u001b¢\u0006\n\n\u0002\u0010@\u001a\u0004\b\"\u0010?R\u0013\u0010#\u001a\u0004\u0018\u00010$¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0015\u0010%\u001a\u0004\u0018\u00010\u001b¢\u0006\n\n\u0002\u0010@\u001a\u0004\bI\u0010?¨\u0006e"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/loading/MarginUpgradeLoadingDataState;", "", "splash", "Lcom/robinhood/android/lib/margin/api/ApiMarginOnboardingSplash;", "account", "Lcom/robinhood/models/db/Account;", InquiryField.ChoicesField.TYPE, "", "Lcom/robinhood/android/lib/margin/api/MarginInterestRateChoice;", SduiFeatureDiscovery3.INFO_TAG, "Lcom/robinhood/android/lib/margin/api/ApiMarginInvestingInfo;", "subscription", "Lcom/robinhood/models/subscription/db/MarginSubscription;", SingularAttributionManager.PRODUCT_PARAM_KEY, "Lcom/robinhood/android/common/margin/ui/MarginSpendingProduct;", "gainsContent", "Lcom/robinhood/staticcontent/model/OtherMarkdown;", "lossesContent", "valueProps", "Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketingContent;", "settings", "Lcom/robinhood/android/lib/margin/db/models/MarginSettings;", "reason", "Lcom/robinhood/android/lib/margin/api/ApiMarginEligibility$ApiMarginUpgradeBlocked;", "throwable", "", "isGoldFeatureSupportedInRegion", "", "isSlipFeatureSupportedInRegion", "marginDisclosureUrlRes", "", "marginReviewHelperRes", "locality", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "isEligible", "apiMarginEligibility", "Lcom/robinhood/android/lib/margin/api/ApiMarginEligibility;", "willBeRestricted", "<init>", "(Lcom/robinhood/android/lib/margin/api/ApiMarginOnboardingSplash;Lcom/robinhood/models/db/Account;Ljava/util/List;Lcom/robinhood/android/lib/margin/api/ApiMarginInvestingInfo;Lcom/robinhood/models/subscription/db/MarginSubscription;Lcom/robinhood/android/common/margin/ui/MarginSpendingProduct;Lcom/robinhood/staticcontent/model/OtherMarkdown;Lcom/robinhood/staticcontent/model/OtherMarkdown;Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketingContent;Lcom/robinhood/android/lib/margin/db/models/MarginSettings;Lcom/robinhood/android/lib/margin/api/ApiMarginEligibility$ApiMarginUpgradeBlocked;Ljava/lang/Throwable;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/robinhood/iso/countrycode/CountryCode$Supported;Ljava/lang/Boolean;Lcom/robinhood/android/lib/margin/api/ApiMarginEligibility;Ljava/lang/Boolean;)V", "getSplash", "()Lcom/robinhood/android/lib/margin/api/ApiMarginOnboardingSplash;", "getAccount", "()Lcom/robinhood/models/db/Account;", "getChoices", "()Ljava/util/List;", "getInfo", "()Lcom/robinhood/android/lib/margin/api/ApiMarginInvestingInfo;", "getSubscription", "()Lcom/robinhood/models/subscription/db/MarginSubscription;", "getProduct", "()Lcom/robinhood/android/common/margin/ui/MarginSpendingProduct;", "getGainsContent", "()Lcom/robinhood/staticcontent/model/OtherMarkdown;", "getLossesContent", "getValueProps", "()Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketingContent;", "getSettings", "()Lcom/robinhood/android/lib/margin/db/models/MarginSettings;", "getReason", "()Lcom/robinhood/android/lib/margin/api/ApiMarginEligibility$ApiMarginUpgradeBlocked;", "getThrowable", "()Ljava/lang/Throwable;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMarginDisclosureUrlRes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMarginReviewHelperRes", "getLocality", "()Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "getApiMarginEligibility", "()Lcom/robinhood/android/lib/margin/api/ApiMarginEligibility;", "getWillBeRestricted", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "copy", "(Lcom/robinhood/android/lib/margin/api/ApiMarginOnboardingSplash;Lcom/robinhood/models/db/Account;Ljava/util/List;Lcom/robinhood/android/lib/margin/api/ApiMarginInvestingInfo;Lcom/robinhood/models/subscription/db/MarginSubscription;Lcom/robinhood/android/common/margin/ui/MarginSpendingProduct;Lcom/robinhood/staticcontent/model/OtherMarkdown;Lcom/robinhood/staticcontent/model/OtherMarkdown;Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketingContent;Lcom/robinhood/android/lib/margin/db/models/MarginSettings;Lcom/robinhood/android/lib/margin/api/ApiMarginEligibility$ApiMarginUpgradeBlocked;Ljava/lang/Throwable;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/robinhood/iso/countrycode/CountryCode$Supported;Ljava/lang/Boolean;Lcom/robinhood/android/lib/margin/api/ApiMarginEligibility;Ljava/lang/Boolean;)Lcom/robinhood/android/margin/upgrade/loading/MarginUpgradeLoadingDataState;", "equals", "other", "hashCode", "toString", "", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class MarginUpgradeLoadingDataState {
    public static final int $stable = 8;
    private final Account account;
    private final ApiMarginEligibility apiMarginEligibility;
    private final List<MarginInterestRateChoice> choices;
    private final OtherMarkdown gainsContent;
    private final ApiMarginInvestingInfo info;
    private final Boolean isEligible;
    private final Boolean isGoldFeatureSupportedInRegion;
    private final Boolean isSlipFeatureSupportedInRegion;
    private final CountryCode.Supported locality;
    private final OtherMarkdown lossesContent;
    private final Integer marginDisclosureUrlRes;
    private final Integer marginReviewHelperRes;
    private final MarginSpendingProduct product;
    private final ApiMarginEligibility.ApiMarginUpgradeBlocked reason;
    private final MarginSettings settings;
    private final ApiMarginOnboardingSplash splash;
    private final MarginSubscription subscription;
    private final Throwable throwable;
    private final ProductMarketingContent valueProps;
    private final Boolean willBeRestricted;

    public MarginUpgradeLoadingDataState() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048575, null);
    }

    public static /* synthetic */ MarginUpgradeLoadingDataState copy$default(MarginUpgradeLoadingDataState marginUpgradeLoadingDataState, ApiMarginOnboardingSplash apiMarginOnboardingSplash, Account account, List list, ApiMarginInvestingInfo apiMarginInvestingInfo, MarginSubscription marginSubscription, MarginSpendingProduct marginSpendingProduct, OtherMarkdown otherMarkdown, OtherMarkdown otherMarkdown2, ProductMarketingContent productMarketingContent, MarginSettings marginSettings, ApiMarginEligibility.ApiMarginUpgradeBlocked apiMarginUpgradeBlocked, Throwable th, Boolean bool, Boolean bool2, Integer num, Integer num2, CountryCode.Supported supported, Boolean bool3, ApiMarginEligibility apiMarginEligibility, Boolean bool4, int i, Object obj) {
        Boolean bool5;
        ApiMarginEligibility apiMarginEligibility2;
        ApiMarginOnboardingSplash apiMarginOnboardingSplash2 = (i & 1) != 0 ? marginUpgradeLoadingDataState.splash : apiMarginOnboardingSplash;
        Account account2 = (i & 2) != 0 ? marginUpgradeLoadingDataState.account : account;
        List list2 = (i & 4) != 0 ? marginUpgradeLoadingDataState.choices : list;
        ApiMarginInvestingInfo apiMarginInvestingInfo2 = (i & 8) != 0 ? marginUpgradeLoadingDataState.info : apiMarginInvestingInfo;
        MarginSubscription marginSubscription2 = (i & 16) != 0 ? marginUpgradeLoadingDataState.subscription : marginSubscription;
        MarginSpendingProduct marginSpendingProduct2 = (i & 32) != 0 ? marginUpgradeLoadingDataState.product : marginSpendingProduct;
        OtherMarkdown otherMarkdown3 = (i & 64) != 0 ? marginUpgradeLoadingDataState.gainsContent : otherMarkdown;
        OtherMarkdown otherMarkdown4 = (i & 128) != 0 ? marginUpgradeLoadingDataState.lossesContent : otherMarkdown2;
        ProductMarketingContent productMarketingContent2 = (i & 256) != 0 ? marginUpgradeLoadingDataState.valueProps : productMarketingContent;
        MarginSettings marginSettings2 = (i & 512) != 0 ? marginUpgradeLoadingDataState.settings : marginSettings;
        ApiMarginEligibility.ApiMarginUpgradeBlocked apiMarginUpgradeBlocked2 = (i & 1024) != 0 ? marginUpgradeLoadingDataState.reason : apiMarginUpgradeBlocked;
        Throwable th2 = (i & 2048) != 0 ? marginUpgradeLoadingDataState.throwable : th;
        Boolean bool6 = (i & 4096) != 0 ? marginUpgradeLoadingDataState.isGoldFeatureSupportedInRegion : bool;
        Boolean bool7 = (i & 8192) != 0 ? marginUpgradeLoadingDataState.isSlipFeatureSupportedInRegion : bool2;
        ApiMarginOnboardingSplash apiMarginOnboardingSplash3 = apiMarginOnboardingSplash2;
        Integer num3 = (i & 16384) != 0 ? marginUpgradeLoadingDataState.marginDisclosureUrlRes : num;
        Integer num4 = (i & 32768) != 0 ? marginUpgradeLoadingDataState.marginReviewHelperRes : num2;
        CountryCode.Supported supported2 = (i & 65536) != 0 ? marginUpgradeLoadingDataState.locality : supported;
        Boolean bool8 = (i & 131072) != 0 ? marginUpgradeLoadingDataState.isEligible : bool3;
        ApiMarginEligibility apiMarginEligibility3 = (i & 262144) != 0 ? marginUpgradeLoadingDataState.apiMarginEligibility : apiMarginEligibility;
        if ((i & 524288) != 0) {
            apiMarginEligibility2 = apiMarginEligibility3;
            bool5 = marginUpgradeLoadingDataState.willBeRestricted;
        } else {
            bool5 = bool4;
            apiMarginEligibility2 = apiMarginEligibility3;
        }
        return marginUpgradeLoadingDataState.copy(apiMarginOnboardingSplash3, account2, list2, apiMarginInvestingInfo2, marginSubscription2, marginSpendingProduct2, otherMarkdown3, otherMarkdown4, productMarketingContent2, marginSettings2, apiMarginUpgradeBlocked2, th2, bool6, bool7, num3, num4, supported2, bool8, apiMarginEligibility2, bool5);
    }

    /* renamed from: component1, reason: from getter */
    public final ApiMarginOnboardingSplash getSplash() {
        return this.splash;
    }

    /* renamed from: component10, reason: from getter */
    public final MarginSettings getSettings() {
        return this.settings;
    }

    /* renamed from: component11, reason: from getter */
    public final ApiMarginEligibility.ApiMarginUpgradeBlocked getReason() {
        return this.reason;
    }

    /* renamed from: component12, reason: from getter */
    public final Throwable getThrowable() {
        return this.throwable;
    }

    /* renamed from: component13, reason: from getter */
    public final Boolean getIsGoldFeatureSupportedInRegion() {
        return this.isGoldFeatureSupportedInRegion;
    }

    /* renamed from: component14, reason: from getter */
    public final Boolean getIsSlipFeatureSupportedInRegion() {
        return this.isSlipFeatureSupportedInRegion;
    }

    /* renamed from: component15, reason: from getter */
    public final Integer getMarginDisclosureUrlRes() {
        return this.marginDisclosureUrlRes;
    }

    /* renamed from: component16, reason: from getter */
    public final Integer getMarginReviewHelperRes() {
        return this.marginReviewHelperRes;
    }

    /* renamed from: component17, reason: from getter */
    public final CountryCode.Supported getLocality() {
        return this.locality;
    }

    /* renamed from: component18, reason: from getter */
    public final Boolean getIsEligible() {
        return this.isEligible;
    }

    /* renamed from: component19, reason: from getter */
    public final ApiMarginEligibility getApiMarginEligibility() {
        return this.apiMarginEligibility;
    }

    /* renamed from: component2, reason: from getter */
    public final Account getAccount() {
        return this.account;
    }

    /* renamed from: component20, reason: from getter */
    public final Boolean getWillBeRestricted() {
        return this.willBeRestricted;
    }

    public final List<MarginInterestRateChoice> component3() {
        return this.choices;
    }

    /* renamed from: component4, reason: from getter */
    public final ApiMarginInvestingInfo getInfo() {
        return this.info;
    }

    /* renamed from: component5, reason: from getter */
    public final MarginSubscription getSubscription() {
        return this.subscription;
    }

    /* renamed from: component6, reason: from getter */
    public final MarginSpendingProduct getProduct() {
        return this.product;
    }

    /* renamed from: component7, reason: from getter */
    public final OtherMarkdown getGainsContent() {
        return this.gainsContent;
    }

    /* renamed from: component8, reason: from getter */
    public final OtherMarkdown getLossesContent() {
        return this.lossesContent;
    }

    /* renamed from: component9, reason: from getter */
    public final ProductMarketingContent getValueProps() {
        return this.valueProps;
    }

    public final MarginUpgradeLoadingDataState copy(ApiMarginOnboardingSplash splash, Account account, List<MarginInterestRateChoice> choices, ApiMarginInvestingInfo info, MarginSubscription subscription, MarginSpendingProduct product, OtherMarkdown gainsContent, OtherMarkdown lossesContent, ProductMarketingContent valueProps, MarginSettings settings, ApiMarginEligibility.ApiMarginUpgradeBlocked reason, Throwable throwable, Boolean isGoldFeatureSupportedInRegion, Boolean isSlipFeatureSupportedInRegion, Integer marginDisclosureUrlRes, Integer marginReviewHelperRes, CountryCode.Supported locality, Boolean isEligible, ApiMarginEligibility apiMarginEligibility, Boolean willBeRestricted) {
        return new MarginUpgradeLoadingDataState(splash, account, choices, info, subscription, product, gainsContent, lossesContent, valueProps, settings, reason, throwable, isGoldFeatureSupportedInRegion, isSlipFeatureSupportedInRegion, marginDisclosureUrlRes, marginReviewHelperRes, locality, isEligible, apiMarginEligibility, willBeRestricted);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarginUpgradeLoadingDataState)) {
            return false;
        }
        MarginUpgradeLoadingDataState marginUpgradeLoadingDataState = (MarginUpgradeLoadingDataState) other;
        return Intrinsics.areEqual(this.splash, marginUpgradeLoadingDataState.splash) && Intrinsics.areEqual(this.account, marginUpgradeLoadingDataState.account) && Intrinsics.areEqual(this.choices, marginUpgradeLoadingDataState.choices) && Intrinsics.areEqual(this.info, marginUpgradeLoadingDataState.info) && Intrinsics.areEqual(this.subscription, marginUpgradeLoadingDataState.subscription) && this.product == marginUpgradeLoadingDataState.product && Intrinsics.areEqual(this.gainsContent, marginUpgradeLoadingDataState.gainsContent) && Intrinsics.areEqual(this.lossesContent, marginUpgradeLoadingDataState.lossesContent) && Intrinsics.areEqual(this.valueProps, marginUpgradeLoadingDataState.valueProps) && Intrinsics.areEqual(this.settings, marginUpgradeLoadingDataState.settings) && Intrinsics.areEqual(this.reason, marginUpgradeLoadingDataState.reason) && Intrinsics.areEqual(this.throwable, marginUpgradeLoadingDataState.throwable) && Intrinsics.areEqual(this.isGoldFeatureSupportedInRegion, marginUpgradeLoadingDataState.isGoldFeatureSupportedInRegion) && Intrinsics.areEqual(this.isSlipFeatureSupportedInRegion, marginUpgradeLoadingDataState.isSlipFeatureSupportedInRegion) && Intrinsics.areEqual(this.marginDisclosureUrlRes, marginUpgradeLoadingDataState.marginDisclosureUrlRes) && Intrinsics.areEqual(this.marginReviewHelperRes, marginUpgradeLoadingDataState.marginReviewHelperRes) && Intrinsics.areEqual(this.locality, marginUpgradeLoadingDataState.locality) && Intrinsics.areEqual(this.isEligible, marginUpgradeLoadingDataState.isEligible) && Intrinsics.areEqual(this.apiMarginEligibility, marginUpgradeLoadingDataState.apiMarginEligibility) && Intrinsics.areEqual(this.willBeRestricted, marginUpgradeLoadingDataState.willBeRestricted);
    }

    public int hashCode() {
        ApiMarginOnboardingSplash apiMarginOnboardingSplash = this.splash;
        int iHashCode = (apiMarginOnboardingSplash == null ? 0 : apiMarginOnboardingSplash.hashCode()) * 31;
        Account account = this.account;
        int iHashCode2 = (iHashCode + (account == null ? 0 : account.hashCode())) * 31;
        List<MarginInterestRateChoice> list = this.choices;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        ApiMarginInvestingInfo apiMarginInvestingInfo = this.info;
        int iHashCode4 = (iHashCode3 + (apiMarginInvestingInfo == null ? 0 : apiMarginInvestingInfo.hashCode())) * 31;
        MarginSubscription marginSubscription = this.subscription;
        int iHashCode5 = (iHashCode4 + (marginSubscription == null ? 0 : marginSubscription.hashCode())) * 31;
        MarginSpendingProduct marginSpendingProduct = this.product;
        int iHashCode6 = (iHashCode5 + (marginSpendingProduct == null ? 0 : marginSpendingProduct.hashCode())) * 31;
        OtherMarkdown otherMarkdown = this.gainsContent;
        int iHashCode7 = (iHashCode6 + (otherMarkdown == null ? 0 : otherMarkdown.hashCode())) * 31;
        OtherMarkdown otherMarkdown2 = this.lossesContent;
        int iHashCode8 = (iHashCode7 + (otherMarkdown2 == null ? 0 : otherMarkdown2.hashCode())) * 31;
        ProductMarketingContent productMarketingContent = this.valueProps;
        int iHashCode9 = (iHashCode8 + (productMarketingContent == null ? 0 : productMarketingContent.hashCode())) * 31;
        MarginSettings marginSettings = this.settings;
        int iHashCode10 = (iHashCode9 + (marginSettings == null ? 0 : marginSettings.hashCode())) * 31;
        ApiMarginEligibility.ApiMarginUpgradeBlocked apiMarginUpgradeBlocked = this.reason;
        int iHashCode11 = (iHashCode10 + (apiMarginUpgradeBlocked == null ? 0 : apiMarginUpgradeBlocked.hashCode())) * 31;
        Throwable th = this.throwable;
        int iHashCode12 = (iHashCode11 + (th == null ? 0 : th.hashCode())) * 31;
        Boolean bool = this.isGoldFeatureSupportedInRegion;
        int iHashCode13 = (iHashCode12 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isSlipFeatureSupportedInRegion;
        int iHashCode14 = (iHashCode13 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.marginDisclosureUrlRes;
        int iHashCode15 = (iHashCode14 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.marginReviewHelperRes;
        int iHashCode16 = (iHashCode15 + (num2 == null ? 0 : num2.hashCode())) * 31;
        CountryCode.Supported supported = this.locality;
        int iHashCode17 = (iHashCode16 + (supported == null ? 0 : supported.hashCode())) * 31;
        Boolean bool3 = this.isEligible;
        int iHashCode18 = (iHashCode17 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        ApiMarginEligibility apiMarginEligibility = this.apiMarginEligibility;
        int iHashCode19 = (iHashCode18 + (apiMarginEligibility == null ? 0 : apiMarginEligibility.hashCode())) * 31;
        Boolean bool4 = this.willBeRestricted;
        return iHashCode19 + (bool4 != null ? bool4.hashCode() : 0);
    }

    public String toString() {
        return "MarginUpgradeLoadingDataState(splash=" + this.splash + ", account=" + this.account + ", choices=" + this.choices + ", info=" + this.info + ", subscription=" + this.subscription + ", product=" + this.product + ", gainsContent=" + this.gainsContent + ", lossesContent=" + this.lossesContent + ", valueProps=" + this.valueProps + ", settings=" + this.settings + ", reason=" + this.reason + ", throwable=" + this.throwable + ", isGoldFeatureSupportedInRegion=" + this.isGoldFeatureSupportedInRegion + ", isSlipFeatureSupportedInRegion=" + this.isSlipFeatureSupportedInRegion + ", marginDisclosureUrlRes=" + this.marginDisclosureUrlRes + ", marginReviewHelperRes=" + this.marginReviewHelperRes + ", locality=" + this.locality + ", isEligible=" + this.isEligible + ", apiMarginEligibility=" + this.apiMarginEligibility + ", willBeRestricted=" + this.willBeRestricted + ")";
    }

    public MarginUpgradeLoadingDataState(ApiMarginOnboardingSplash apiMarginOnboardingSplash, Account account, List<MarginInterestRateChoice> list, ApiMarginInvestingInfo apiMarginInvestingInfo, MarginSubscription marginSubscription, MarginSpendingProduct marginSpendingProduct, OtherMarkdown otherMarkdown, OtherMarkdown otherMarkdown2, ProductMarketingContent productMarketingContent, MarginSettings marginSettings, ApiMarginEligibility.ApiMarginUpgradeBlocked apiMarginUpgradeBlocked, Throwable th, Boolean bool, Boolean bool2, Integer num, Integer num2, CountryCode.Supported supported, Boolean bool3, ApiMarginEligibility apiMarginEligibility, Boolean bool4) {
        this.splash = apiMarginOnboardingSplash;
        this.account = account;
        this.choices = list;
        this.info = apiMarginInvestingInfo;
        this.subscription = marginSubscription;
        this.product = marginSpendingProduct;
        this.gainsContent = otherMarkdown;
        this.lossesContent = otherMarkdown2;
        this.valueProps = productMarketingContent;
        this.settings = marginSettings;
        this.reason = apiMarginUpgradeBlocked;
        this.throwable = th;
        this.isGoldFeatureSupportedInRegion = bool;
        this.isSlipFeatureSupportedInRegion = bool2;
        this.marginDisclosureUrlRes = num;
        this.marginReviewHelperRes = num2;
        this.locality = supported;
        this.isEligible = bool3;
        this.apiMarginEligibility = apiMarginEligibility;
        this.willBeRestricted = bool4;
    }

    public /* synthetic */ MarginUpgradeLoadingDataState(ApiMarginOnboardingSplash apiMarginOnboardingSplash, Account account, List list, ApiMarginInvestingInfo apiMarginInvestingInfo, MarginSubscription marginSubscription, MarginSpendingProduct marginSpendingProduct, OtherMarkdown otherMarkdown, OtherMarkdown otherMarkdown2, ProductMarketingContent productMarketingContent, MarginSettings marginSettings, ApiMarginEligibility.ApiMarginUpgradeBlocked apiMarginUpgradeBlocked, Throwable th, Boolean bool, Boolean bool2, Integer num, Integer num2, CountryCode.Supported supported, Boolean bool3, ApiMarginEligibility apiMarginEligibility, Boolean bool4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : apiMarginOnboardingSplash, (i & 2) != 0 ? null : account, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : apiMarginInvestingInfo, (i & 16) != 0 ? null : marginSubscription, (i & 32) != 0 ? null : marginSpendingProduct, (i & 64) != 0 ? null : otherMarkdown, (i & 128) != 0 ? null : otherMarkdown2, (i & 256) != 0 ? null : productMarketingContent, (i & 512) != 0 ? null : marginSettings, (i & 1024) != 0 ? null : apiMarginUpgradeBlocked, (i & 2048) != 0 ? null : th, (i & 4096) != 0 ? null : bool, (i & 8192) != 0 ? null : bool2, (i & 16384) != 0 ? null : num, (i & 32768) != 0 ? null : num2, (i & 65536) != 0 ? null : supported, (i & 131072) != 0 ? null : bool3, (i & 262144) != 0 ? null : apiMarginEligibility, (i & 524288) != 0 ? null : bool4);
    }

    public final ApiMarginOnboardingSplash getSplash() {
        return this.splash;
    }

    public final Account getAccount() {
        return this.account;
    }

    public final List<MarginInterestRateChoice> getChoices() {
        return this.choices;
    }

    public final ApiMarginInvestingInfo getInfo() {
        return this.info;
    }

    public final MarginSubscription getSubscription() {
        return this.subscription;
    }

    public final MarginSpendingProduct getProduct() {
        return this.product;
    }

    public final OtherMarkdown getGainsContent() {
        return this.gainsContent;
    }

    public final OtherMarkdown getLossesContent() {
        return this.lossesContent;
    }

    public final ProductMarketingContent getValueProps() {
        return this.valueProps;
    }

    public final MarginSettings getSettings() {
        return this.settings;
    }

    public final ApiMarginEligibility.ApiMarginUpgradeBlocked getReason() {
        return this.reason;
    }

    public final Throwable getThrowable() {
        return this.throwable;
    }

    public final Boolean isGoldFeatureSupportedInRegion() {
        return this.isGoldFeatureSupportedInRegion;
    }

    public final Boolean isSlipFeatureSupportedInRegion() {
        return this.isSlipFeatureSupportedInRegion;
    }

    public final Integer getMarginDisclosureUrlRes() {
        return this.marginDisclosureUrlRes;
    }

    public final Integer getMarginReviewHelperRes() {
        return this.marginReviewHelperRes;
    }

    public final CountryCode.Supported getLocality() {
        return this.locality;
    }

    public final Boolean isEligible() {
        return this.isEligible;
    }

    public final ApiMarginEligibility getApiMarginEligibility() {
        return this.apiMarginEligibility;
    }

    public final Boolean getWillBeRestricted() {
        return this.willBeRestricted;
    }
}
