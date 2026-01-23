package com.robinhood.android.margin.p174ui.limit;

import com.robinhood.android.lib.margin.api.ApiMarginInvestingInfo;
import com.robinhood.android.lib.margin.p167db.models.MarginSettings;
import com.robinhood.android.tickerinputview.TickerInputView;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.crypto.p314db.UnifiedBalances;
import com.robinhood.models.p320db.phoenix.UnifiedAccountV2;
import com.robinhood.models.p325fx.api.ApiFxQuote;
import com.robinhood.models.subscription.p352db.MarginSubscription;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MarginLimitDataState.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b6\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0019\u0010\u001aJ\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010B\u001a\u00020\rHÆ\u0003J\t\u0010C\u001a\u00020\u000fHÆ\u0003J\t\u0010D\u001a\u00020\u0011HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\t\u0010F\u001a\u00020\u0015HÆ\u0003J\t\u0010G\u001a\u00020\u0017HÆ\u0003J\u0010\u0010H\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u00101J\u0094\u0001\u0010I\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0015HÆ\u0001¢\u0006\u0002\u0010JJ\u0013\u0010K\u001a\u00020\u00152\b\u0010L\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010M\u001a\u00020NHÖ\u0001J\t\u0010O\u001a\u00020\u000fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0015¢\u0006\n\n\u0002\u00102\u001a\u0004\b\u0018\u00101R\u0011\u00103\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b4\u0010.R\u0011\u00105\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b6\u0010.R\u0011\u00107\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b8\u0010.R\u0013\u00109\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b:\u0010*R\u0011\u0010;\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b<\u0010$¨\u0006P"}, m3636d2 = {"Lcom/robinhood/android/margin/ui/limit/MarginLimitDataState;", "", "unifiedAccount", "Lcom/robinhood/models/db/phoenix/UnifiedAccountV2;", "unifiedBalances", "Lcom/robinhood/models/crypto/db/UnifiedBalances;", "subscription", "Lcom/robinhood/models/subscription/db/MarginSubscription;", "marginSettings", "Lcom/robinhood/android/lib/margin/db/models/MarginSettings;", "newMarginLimit", "Lcom/robinhood/models/util/Money;", "marginInvestingInfo", "Lcom/robinhood/android/lib/margin/api/ApiMarginInvestingInfo;", "inputChars", "", "userInputAmount", "Ljava/math/BigDecimal;", "fxQuote", "Lcom/robinhood/models/fx/api/ApiFxQuote;", "animateInput", "", "userLocale", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "isInMcwCurrencySwitcherRegionGate", "<init>", "(Lcom/robinhood/models/db/phoenix/UnifiedAccountV2;Lcom/robinhood/models/crypto/db/UnifiedBalances;Lcom/robinhood/models/subscription/db/MarginSubscription;Lcom/robinhood/android/lib/margin/db/models/MarginSettings;Lcom/robinhood/models/util/Money;Lcom/robinhood/android/lib/margin/api/ApiMarginInvestingInfo;Ljava/lang/String;Ljava/math/BigDecimal;Lcom/robinhood/models/fx/api/ApiFxQuote;ZLcom/robinhood/iso/countrycode/CountryCode$Supported;Ljava/lang/Boolean;)V", "getUnifiedAccount", "()Lcom/robinhood/models/db/phoenix/UnifiedAccountV2;", "getUnifiedBalances", "()Lcom/robinhood/models/crypto/db/UnifiedBalances;", "getSubscription", "()Lcom/robinhood/models/subscription/db/MarginSubscription;", "getMarginSettings", "()Lcom/robinhood/android/lib/margin/db/models/MarginSettings;", "getNewMarginLimit", "()Lcom/robinhood/models/util/Money;", "getMarginInvestingInfo", "()Lcom/robinhood/android/lib/margin/api/ApiMarginInvestingInfo;", "getInputChars", "()Ljava/lang/String;", "getUserInputAmount", "()Ljava/math/BigDecimal;", "getFxQuote", "()Lcom/robinhood/models/fx/api/ApiFxQuote;", "getAnimateInput", "()Z", "getUserLocale", "()Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "showFxBlueberry", "getShowFxBlueberry", "hasUserSetMarginLimit", "getHasUserSetMarginLimit", "hasNegativeBuyingPower", "getHasNegativeBuyingPower", "prefillMarginLimit", "getPrefillMarginLimit", "availableMarginLimit", "getAvailableMarginLimit", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Lcom/robinhood/models/db/phoenix/UnifiedAccountV2;Lcom/robinhood/models/crypto/db/UnifiedBalances;Lcom/robinhood/models/subscription/db/MarginSubscription;Lcom/robinhood/android/lib/margin/db/models/MarginSettings;Lcom/robinhood/models/util/Money;Lcom/robinhood/android/lib/margin/api/ApiMarginInvestingInfo;Ljava/lang/String;Ljava/math/BigDecimal;Lcom/robinhood/models/fx/api/ApiFxQuote;ZLcom/robinhood/iso/countrycode/CountryCode$Supported;Ljava/lang/Boolean;)Lcom/robinhood/android/margin/ui/limit/MarginLimitDataState;", "equals", "other", "hashCode", "", "toString", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class MarginLimitDataState {
    public static final int $stable = 8;
    private final boolean animateInput;
    private final ApiFxQuote fxQuote;
    private final boolean hasNegativeBuyingPower;
    private final boolean hasUserSetMarginLimit;
    private final String inputChars;
    private final Boolean isInMcwCurrencySwitcherRegionGate;
    private final ApiMarginInvestingInfo marginInvestingInfo;
    private final MarginSettings marginSettings;
    private final Money newMarginLimit;
    private final MarginSubscription subscription;
    private final UnifiedAccountV2 unifiedAccount;
    private final UnifiedBalances unifiedBalances;
    private final BigDecimal userInputAmount;
    private final CountryCode.Supported userLocale;

    public static /* synthetic */ MarginLimitDataState copy$default(MarginLimitDataState marginLimitDataState, UnifiedAccountV2 unifiedAccountV2, UnifiedBalances unifiedBalances, MarginSubscription marginSubscription, MarginSettings marginSettings, Money money, ApiMarginInvestingInfo apiMarginInvestingInfo, String str, BigDecimal bigDecimal, ApiFxQuote apiFxQuote, boolean z, CountryCode.Supported supported, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            unifiedAccountV2 = marginLimitDataState.unifiedAccount;
        }
        if ((i & 2) != 0) {
            unifiedBalances = marginLimitDataState.unifiedBalances;
        }
        if ((i & 4) != 0) {
            marginSubscription = marginLimitDataState.subscription;
        }
        if ((i & 8) != 0) {
            marginSettings = marginLimitDataState.marginSettings;
        }
        if ((i & 16) != 0) {
            money = marginLimitDataState.newMarginLimit;
        }
        if ((i & 32) != 0) {
            apiMarginInvestingInfo = marginLimitDataState.marginInvestingInfo;
        }
        if ((i & 64) != 0) {
            str = marginLimitDataState.inputChars;
        }
        if ((i & 128) != 0) {
            bigDecimal = marginLimitDataState.userInputAmount;
        }
        if ((i & 256) != 0) {
            apiFxQuote = marginLimitDataState.fxQuote;
        }
        if ((i & 512) != 0) {
            z = marginLimitDataState.animateInput;
        }
        if ((i & 1024) != 0) {
            supported = marginLimitDataState.userLocale;
        }
        if ((i & 2048) != 0) {
            bool = marginLimitDataState.isInMcwCurrencySwitcherRegionGate;
        }
        CountryCode.Supported supported2 = supported;
        Boolean bool2 = bool;
        ApiFxQuote apiFxQuote2 = apiFxQuote;
        boolean z2 = z;
        String str2 = str;
        BigDecimal bigDecimal2 = bigDecimal;
        Money money2 = money;
        ApiMarginInvestingInfo apiMarginInvestingInfo2 = apiMarginInvestingInfo;
        return marginLimitDataState.copy(unifiedAccountV2, unifiedBalances, marginSubscription, marginSettings, money2, apiMarginInvestingInfo2, str2, bigDecimal2, apiFxQuote2, z2, supported2, bool2);
    }

    /* renamed from: component1, reason: from getter */
    public final UnifiedAccountV2 getUnifiedAccount() {
        return this.unifiedAccount;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getAnimateInput() {
        return this.animateInput;
    }

    /* renamed from: component11, reason: from getter */
    public final CountryCode.Supported getUserLocale() {
        return this.userLocale;
    }

    /* renamed from: component12, reason: from getter */
    public final Boolean getIsInMcwCurrencySwitcherRegionGate() {
        return this.isInMcwCurrencySwitcherRegionGate;
    }

    /* renamed from: component2, reason: from getter */
    public final UnifiedBalances getUnifiedBalances() {
        return this.unifiedBalances;
    }

    /* renamed from: component3, reason: from getter */
    public final MarginSubscription getSubscription() {
        return this.subscription;
    }

    /* renamed from: component4, reason: from getter */
    public final MarginSettings getMarginSettings() {
        return this.marginSettings;
    }

    /* renamed from: component5, reason: from getter */
    public final Money getNewMarginLimit() {
        return this.newMarginLimit;
    }

    /* renamed from: component6, reason: from getter */
    public final ApiMarginInvestingInfo getMarginInvestingInfo() {
        return this.marginInvestingInfo;
    }

    /* renamed from: component7, reason: from getter */
    public final String getInputChars() {
        return this.inputChars;
    }

    /* renamed from: component8, reason: from getter */
    public final BigDecimal getUserInputAmount() {
        return this.userInputAmount;
    }

    /* renamed from: component9, reason: from getter */
    public final ApiFxQuote getFxQuote() {
        return this.fxQuote;
    }

    public final MarginLimitDataState copy(UnifiedAccountV2 unifiedAccount, UnifiedBalances unifiedBalances, MarginSubscription subscription, MarginSettings marginSettings, Money newMarginLimit, ApiMarginInvestingInfo marginInvestingInfo, String inputChars, BigDecimal userInputAmount, ApiFxQuote fxQuote, boolean animateInput, CountryCode.Supported userLocale, Boolean isInMcwCurrencySwitcherRegionGate) {
        Intrinsics.checkNotNullParameter(marginInvestingInfo, "marginInvestingInfo");
        Intrinsics.checkNotNullParameter(inputChars, "inputChars");
        Intrinsics.checkNotNullParameter(userInputAmount, "userInputAmount");
        Intrinsics.checkNotNullParameter(userLocale, "userLocale");
        return new MarginLimitDataState(unifiedAccount, unifiedBalances, subscription, marginSettings, newMarginLimit, marginInvestingInfo, inputChars, userInputAmount, fxQuote, animateInput, userLocale, isInMcwCurrencySwitcherRegionGate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarginLimitDataState)) {
            return false;
        }
        MarginLimitDataState marginLimitDataState = (MarginLimitDataState) other;
        return Intrinsics.areEqual(this.unifiedAccount, marginLimitDataState.unifiedAccount) && Intrinsics.areEqual(this.unifiedBalances, marginLimitDataState.unifiedBalances) && Intrinsics.areEqual(this.subscription, marginLimitDataState.subscription) && Intrinsics.areEqual(this.marginSettings, marginLimitDataState.marginSettings) && Intrinsics.areEqual(this.newMarginLimit, marginLimitDataState.newMarginLimit) && Intrinsics.areEqual(this.marginInvestingInfo, marginLimitDataState.marginInvestingInfo) && Intrinsics.areEqual(this.inputChars, marginLimitDataState.inputChars) && Intrinsics.areEqual(this.userInputAmount, marginLimitDataState.userInputAmount) && Intrinsics.areEqual(this.fxQuote, marginLimitDataState.fxQuote) && this.animateInput == marginLimitDataState.animateInput && Intrinsics.areEqual(this.userLocale, marginLimitDataState.userLocale) && Intrinsics.areEqual(this.isInMcwCurrencySwitcherRegionGate, marginLimitDataState.isInMcwCurrencySwitcherRegionGate);
    }

    public int hashCode() {
        UnifiedAccountV2 unifiedAccountV2 = this.unifiedAccount;
        int iHashCode = (unifiedAccountV2 == null ? 0 : unifiedAccountV2.hashCode()) * 31;
        UnifiedBalances unifiedBalances = this.unifiedBalances;
        int iHashCode2 = (iHashCode + (unifiedBalances == null ? 0 : unifiedBalances.hashCode())) * 31;
        MarginSubscription marginSubscription = this.subscription;
        int iHashCode3 = (iHashCode2 + (marginSubscription == null ? 0 : marginSubscription.hashCode())) * 31;
        MarginSettings marginSettings = this.marginSettings;
        int iHashCode4 = (iHashCode3 + (marginSettings == null ? 0 : marginSettings.hashCode())) * 31;
        Money money = this.newMarginLimit;
        int iHashCode5 = (((((((iHashCode4 + (money == null ? 0 : money.hashCode())) * 31) + this.marginInvestingInfo.hashCode()) * 31) + this.inputChars.hashCode()) * 31) + this.userInputAmount.hashCode()) * 31;
        ApiFxQuote apiFxQuote = this.fxQuote;
        int iHashCode6 = (((((iHashCode5 + (apiFxQuote == null ? 0 : apiFxQuote.hashCode())) * 31) + Boolean.hashCode(this.animateInput)) * 31) + this.userLocale.hashCode()) * 31;
        Boolean bool = this.isInMcwCurrencySwitcherRegionGate;
        return iHashCode6 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "MarginLimitDataState(unifiedAccount=" + this.unifiedAccount + ", unifiedBalances=" + this.unifiedBalances + ", subscription=" + this.subscription + ", marginSettings=" + this.marginSettings + ", newMarginLimit=" + this.newMarginLimit + ", marginInvestingInfo=" + this.marginInvestingInfo + ", inputChars=" + this.inputChars + ", userInputAmount=" + this.userInputAmount + ", fxQuote=" + this.fxQuote + ", animateInput=" + this.animateInput + ", userLocale=" + this.userLocale + ", isInMcwCurrencySwitcherRegionGate=" + this.isInMcwCurrencySwitcherRegionGate + ")";
    }

    public MarginLimitDataState(UnifiedAccountV2 unifiedAccountV2, UnifiedBalances unifiedBalances, MarginSubscription marginSubscription, MarginSettings marginSettings, Money money, ApiMarginInvestingInfo marginInvestingInfo, String inputChars, BigDecimal userInputAmount, ApiFxQuote apiFxQuote, boolean z, CountryCode.Supported userLocale, Boolean bool) {
        Money accountBuyingPower;
        Intrinsics.checkNotNullParameter(marginInvestingInfo, "marginInvestingInfo");
        Intrinsics.checkNotNullParameter(inputChars, "inputChars");
        Intrinsics.checkNotNullParameter(userInputAmount, "userInputAmount");
        Intrinsics.checkNotNullParameter(userLocale, "userLocale");
        this.unifiedAccount = unifiedAccountV2;
        this.unifiedBalances = unifiedBalances;
        this.subscription = marginSubscription;
        this.marginSettings = marginSettings;
        this.newMarginLimit = money;
        this.marginInvestingInfo = marginInvestingInfo;
        this.inputChars = inputChars;
        this.userInputAmount = userInputAmount;
        this.fxQuote = apiFxQuote;
        this.animateInput = z;
        this.userLocale = userLocale;
        this.isInMcwCurrencySwitcherRegionGate = bool;
        this.hasUserSetMarginLimit = Money3.isPositive(marginSettings != null ? marginSettings.getUserSetMarginInvestingLimit() : null);
        this.hasNegativeBuyingPower = (unifiedAccountV2 == null || (accountBuyingPower = unifiedAccountV2.getAccountBuyingPower()) == null) ? false : accountBuyingPower.isNegative();
    }

    public final UnifiedAccountV2 getUnifiedAccount() {
        return this.unifiedAccount;
    }

    public final UnifiedBalances getUnifiedBalances() {
        return this.unifiedBalances;
    }

    public final MarginSubscription getSubscription() {
        return this.subscription;
    }

    public final MarginSettings getMarginSettings() {
        return this.marginSettings;
    }

    public final Money getNewMarginLimit() {
        return this.newMarginLimit;
    }

    public final ApiMarginInvestingInfo getMarginInvestingInfo() {
        return this.marginInvestingInfo;
    }

    public /* synthetic */ MarginLimitDataState(UnifiedAccountV2 unifiedAccountV2, UnifiedBalances unifiedBalances, MarginSubscription marginSubscription, MarginSettings marginSettings, Money money, ApiMarginInvestingInfo apiMarginInvestingInfo, String str, BigDecimal bigDecimal, ApiFxQuote apiFxQuote, boolean z, CountryCode.Supported supported, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : unifiedAccountV2, (i & 2) != 0 ? null : unifiedBalances, (i & 4) != 0 ? null : marginSubscription, (i & 8) != 0 ? null : marginSettings, (i & 16) != 0 ? null : money, apiMarginInvestingInfo, (i & 64) != 0 ? new String(new char[]{TickerInputView.CURRENCY_SYMBOL, '0'}) : str, (i & 128) != 0 ? BigDecimal.ZERO : bigDecimal, (i & 256) != 0 ? null : apiFxQuote, (i & 512) != 0 ? false : z, supported, (i & 2048) != 0 ? null : bool);
    }

    public final String getInputChars() {
        return this.inputChars;
    }

    public final BigDecimal getUserInputAmount() {
        return this.userInputAmount;
    }

    public final ApiFxQuote getFxQuote() {
        return this.fxQuote;
    }

    public final boolean getAnimateInput() {
        return this.animateInput;
    }

    public final CountryCode.Supported getUserLocale() {
        return this.userLocale;
    }

    public final Boolean isInMcwCurrencySwitcherRegionGate() {
        return this.isInMcwCurrencySwitcherRegionGate;
    }

    public final boolean getShowFxBlueberry() {
        return Intrinsics.areEqual(this.isInMcwCurrencySwitcherRegionGate, Boolean.FALSE) && Intrinsics.areEqual(this.userLocale, CountryCode.Supported.UnitedKingdom.INSTANCE);
    }

    public final boolean getHasUserSetMarginLimit() {
        return this.hasUserSetMarginLimit;
    }

    public final boolean getHasNegativeBuyingPower() {
        return this.hasNegativeBuyingPower;
    }

    public final BigDecimal getPrefillMarginLimit() {
        Money userSetMarginInvestingLimit;
        MarginSettings marginSettings = this.marginSettings;
        if (marginSettings == null || (userSetMarginInvestingLimit = marginSettings.getUserSetMarginInvestingLimit()) == null) {
            return null;
        }
        return userSetMarginInvestingLimit.getDecimalValue();
    }

    public final Money getAvailableMarginLimit() {
        return this.marginInvestingInfo.getMarginAvailable();
    }
}
