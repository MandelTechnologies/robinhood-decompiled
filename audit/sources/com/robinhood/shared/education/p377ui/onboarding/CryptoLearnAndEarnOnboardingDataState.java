package com.robinhood.shared.education.p377ui.onboarding;

import com.plaid.internal.EnumC7081g;
import com.robinhood.g11n.CurrencyFormatterLocale;
import com.robinhood.g11n.Locales2;
import com.robinhood.models.crypto.p314db.Currency;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.education.C38790R;
import com.robinhood.shared.education.p377ui.onboarding.CryptoLearnAndEarnOnboardingViewState;
import com.robinhood.shared.formats.crypto.CurrencyDefinitions;
import com.robinhood.utils.resource.StringResource;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: CryptoLearnAndEarnOnboardingDuxo.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\f\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 02\u00020\u0001:\u00010B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010#\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b$J\u0010\u0010%\u001a\u0004\u0018\u00010\u0005HÀ\u0003¢\u0006\u0002\b&J\u000e\u0010'\u001a\u00020\u0007HÀ\u0003¢\u0006\u0002\b(J)\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010*\u001a\u00020\u00072\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020/HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038AX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058AX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078AX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u001f\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b \u0010\u0019R\u0011\u0010!\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\"\u0010\u0019¨\u00061"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/onboarding/CryptoLearnAndEarnOnboardingDataState;", "", "appType", "Lcom/robinhood/shared/app/type/AppType;", "eurCurrency", "Lcom/robinhood/models/crypto/db/Currency;", "isDepositRequirementExperimentEnabled", "", "<init>", "(Lcom/robinhood/shared/app/type/AppType;Lcom/robinhood/models/crypto/db/Currency;Z)V", "getAppType$feature_education_externalDebug", "()Lcom/robinhood/shared/app/type/AppType;", "getEurCurrency$feature_education_externalDebug", "()Lcom/robinhood/models/crypto/db/Currency;", "isDepositRequirementExperimentEnabled$feature_education_externalDebug", "()Z", "decimalSeparator", "", "getDecimalSeparator", "()C", "decimalSeparator$delegate", "Lkotlin/Lazy;", "subtitle", "Lcom/robinhood/utils/resource/StringResource;", "getSubtitle", "()Lcom/robinhood/utils/resource/StringResource;", "contentRows", "", "Lcom/robinhood/shared/education/ui/onboarding/CryptoLearnAndEarnOnboardingViewState$BentoValuePropRowContent;", "getContentRows", "()Ljava/util/List;", "footerMessage", "getFooterMessage", "footerLinkText", "getFooterLinkText", "component1", "component1$feature_education_externalDebug", "component2", "component2$feature_education_externalDebug", "component3", "component3$feature_education_externalDebug", "copy", "equals", "other", "hashCode", "", "toString", "", "Companion", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final /* data */ class CryptoLearnAndEarnOnboardingDataState {
    private final AppType appType;

    /* renamed from: decimalSeparator$delegate, reason: from kotlin metadata */
    private final Lazy decimalSeparator;
    private final Currency eurCurrency;
    private final boolean isDepositRequirementExperimentEnabled;
    public static final int $stable = 8;
    private static final BigDecimal ELIGIBILITY_TRADING_AMOUNT = new BigDecimal("20");
    private static final BigDecimal ELIGIBILITY_DEPOSIT_AMOUNT = new BigDecimal("20");

    /* compiled from: CryptoLearnAndEarnOnboardingDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AppType.values().length];
            try {
                iArr[AppType.RHC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ CryptoLearnAndEarnOnboardingDataState copy$default(CryptoLearnAndEarnOnboardingDataState cryptoLearnAndEarnOnboardingDataState, AppType appType, Currency currency, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            appType = cryptoLearnAndEarnOnboardingDataState.appType;
        }
        if ((i & 2) != 0) {
            currency = cryptoLearnAndEarnOnboardingDataState.eurCurrency;
        }
        if ((i & 4) != 0) {
            z = cryptoLearnAndEarnOnboardingDataState.isDepositRequirementExperimentEnabled;
        }
        return cryptoLearnAndEarnOnboardingDataState.copy(appType, currency, z);
    }

    /* renamed from: component1$feature_education_externalDebug, reason: from getter */
    public final AppType getAppType() {
        return this.appType;
    }

    /* renamed from: component2$feature_education_externalDebug, reason: from getter */
    public final Currency getEurCurrency() {
        return this.eurCurrency;
    }

    /* renamed from: component3$feature_education_externalDebug, reason: from getter */
    public final boolean getIsDepositRequirementExperimentEnabled() {
        return this.isDepositRequirementExperimentEnabled;
    }

    public final CryptoLearnAndEarnOnboardingDataState copy(AppType appType, Currency eurCurrency, boolean isDepositRequirementExperimentEnabled) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        return new CryptoLearnAndEarnOnboardingDataState(appType, eurCurrency, isDepositRequirementExperimentEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoLearnAndEarnOnboardingDataState)) {
            return false;
        }
        CryptoLearnAndEarnOnboardingDataState cryptoLearnAndEarnOnboardingDataState = (CryptoLearnAndEarnOnboardingDataState) other;
        return this.appType == cryptoLearnAndEarnOnboardingDataState.appType && Intrinsics.areEqual(this.eurCurrency, cryptoLearnAndEarnOnboardingDataState.eurCurrency) && this.isDepositRequirementExperimentEnabled == cryptoLearnAndEarnOnboardingDataState.isDepositRequirementExperimentEnabled;
    }

    public int hashCode() {
        int iHashCode = this.appType.hashCode() * 31;
        Currency currency = this.eurCurrency;
        return ((iHashCode + (currency == null ? 0 : currency.hashCode())) * 31) + Boolean.hashCode(this.isDepositRequirementExperimentEnabled);
    }

    public String toString() {
        return "CryptoLearnAndEarnOnboardingDataState(appType=" + this.appType + ", eurCurrency=" + this.eurCurrency + ", isDepositRequirementExperimentEnabled=" + this.isDepositRequirementExperimentEnabled + ")";
    }

    public CryptoLearnAndEarnOnboardingDataState(AppType appType, Currency currency, boolean z) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        this.appType = appType;
        this.eurCurrency = currency;
        this.isDepositRequirementExperimentEnabled = z;
        this.decimalSeparator = LazyKt.lazy(new Function0() { // from class: com.robinhood.shared.education.ui.onboarding.CryptoLearnAndEarnOnboardingDataState$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Character.valueOf(CryptoLearnAndEarnOnboardingDataState.decimalSeparator_delegate$lambda$0());
            }
        });
    }

    public /* synthetic */ CryptoLearnAndEarnOnboardingDataState(AppType appType, Currency currency, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(appType, (i & 2) != 0 ? null : currency, (i & 4) != 0 ? false : z);
    }

    public final AppType getAppType$feature_education_externalDebug() {
        return this.appType;
    }

    public final Currency getEurCurrency$feature_education_externalDebug() {
        return this.eurCurrency;
    }

    /* renamed from: isDepositRequirementExperimentEnabled$feature_education_externalDebug */
    public final boolean m2808xee48a0b9() {
        return this.isDepositRequirementExperimentEnabled;
    }

    private final char getDecimalSeparator() {
        return ((Character) this.decimalSeparator.getValue()).charValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final char decimalSeparator_delegate$lambda$0() {
        return Locales2.getMonetaryDecimalSeparator(CurrencyFormatterLocale.INSTANCE.getInstance().getCryptoLocale());
    }

    public final StringResource getSubtitle() {
        if (WhenMappings.$EnumSwitchMapping$0[this.appType.ordinal()] == 1) {
            return StringResource.INSTANCE.invoke(C38790R.string.gated_crypto_rhc_crypto_learn_and_earn_onboarding_subtitle, new Object[0]);
        }
        return StringResource.INSTANCE.invoke(C38790R.string.crypto_learn_and_earn_onboarding_subtitle, new Object[0]);
    }

    public final List<CryptoLearnAndEarnOnboardingViewState.BentoValuePropRowContent> getContentRows() throws IOException {
        CryptoLearnAndEarnOnboardingViewState.BentoValuePropRowContent bentoValuePropRowContent;
        int i;
        BigDecimal bigDecimal;
        if (WhenMappings.$EnumSwitchMapping$0[this.appType.ordinal()] == 1) {
            Currency currency = this.eurCurrency;
            if (currency != null) {
                StringResource.Companion companion = StringResource.INSTANCE;
                StringResource stringResourceInvoke = companion.invoke(C38790R.string.rhc_crypto_learn_and_earn_onboarding_eligibility_title, new Object[0]);
                if (this.isDepositRequirementExperimentEnabled) {
                    i = C38790R.string.rhc_crypto_learn_and_earn_onboarding_eligibility_body_v2;
                } else {
                    i = C38790R.string.rhc_crypto_learn_and_earn_onboarding_eligibility_body;
                }
                int i2 = i;
                BigDecimal ONE = BigDecimal.ONE;
                Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
                Currency currencyCopy$default = Currency.copy$default(currency, null, null, null, ONE, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE, null);
                if (this.isDepositRequirementExperimentEnabled) {
                    bigDecimal = ELIGIBILITY_DEPOSIT_AMOUNT;
                } else {
                    bigDecimal = ELIGIBILITY_TRADING_AMOUNT;
                }
                String currency$default = CurrencyDefinitions.formatCurrency$default(currencyCopy$default, bigDecimal, false, false, null, 0, null, null, false, false, false, false, 2030, null);
                StringBuilder sb = new StringBuilder();
                int length = currency$default.length();
                for (int i3 = 0; i3 < length; i3++) {
                    char cCharAt = currency$default.charAt(i3);
                    if (cCharAt != getDecimalSeparator()) {
                        sb.append(cCharAt);
                    }
                }
                bentoValuePropRowContent = new CryptoLearnAndEarnOnboardingViewState.BentoValuePropRowContent(stringResourceInvoke, companion.invoke(i2, StringsKt.removeSuffix(sb.toString(), ".")));
            } else {
                bentoValuePropRowContent = null;
            }
            StringResource.Companion companion2 = StringResource.INSTANCE;
            return CollectionsKt.listOfNotNull((Object[]) new CryptoLearnAndEarnOnboardingViewState.BentoValuePropRowContent[]{bentoValuePropRowContent, new CryptoLearnAndEarnOnboardingViewState.BentoValuePropRowContent(companion2.invoke(C38790R.string.rhc_crypto_learn_and_earn_onboarding_learn_title, new Object[0]), companion2.invoke(C38790R.string.gated_crypto_rhc_crypto_learn_and_earn_onboarding_learn_body, new Object[0])), new CryptoLearnAndEarnOnboardingViewState.BentoValuePropRowContent(companion2.invoke(C38790R.string.rhc_crypto_learn_and_earn_onboarding_earn_title, new Object[0]), companion2.invoke(C38790R.string.gated_crypto_rhc_crypto_learn_and_earn_onboarding_earn_body, new Object[0]))});
        }
        StringResource.Companion companion3 = StringResource.INSTANCE;
        return CollectionsKt.listOf((Object[]) new CryptoLearnAndEarnOnboardingViewState.BentoValuePropRowContent[]{new CryptoLearnAndEarnOnboardingViewState.BentoValuePropRowContent(companion3.invoke(C38790R.string.crypto_learn_and_earn_onboarding_learn_title, new Object[0]), companion3.invoke(C38790R.string.crypto_learn_and_earn_onboarding_learn_body, new Object[0])), new CryptoLearnAndEarnOnboardingViewState.BentoValuePropRowContent(companion3.invoke(C38790R.string.crypto_learn_and_earn_onboarding_pass_title, new Object[0]), companion3.invoke(C38790R.string.crypto_learn_and_earn_onboarding_pass_body, new Object[0])), new CryptoLearnAndEarnOnboardingViewState.BentoValuePropRowContent(companion3.invoke(C38790R.string.crypto_learn_and_earn_onboarding_earn_title, new Object[0]), companion3.invoke(C38790R.string.crypto_learn_and_earn_onboarding_earn_body, new Object[0]))});
    }

    public final StringResource getFooterMessage() {
        if (WhenMappings.$EnumSwitchMapping$0[this.appType.ordinal()] == 1) {
            return StringResource.INSTANCE.invoke(C38790R.string.gated_crypto_rhc_crypto_learn_and_earn_onboarding_footer, new Object[0]);
        }
        return StringResource.INSTANCE.invoke(C38790R.string.crypto_learn_and_earn_onboarding_footer, new Object[0]);
    }

    public final StringResource getFooterLinkText() {
        if (WhenMappings.$EnumSwitchMapping$0[this.appType.ordinal()] == 1) {
            return StringResource.INSTANCE.invoke(C38790R.string.rhc_crypto_learn_and_earn_onboarding_footer_terms, new Object[0]);
        }
        return StringResource.INSTANCE.invoke(C38790R.string.crypto_learn_and_earn_onboarding_footer_terms, new Object[0]);
    }
}
