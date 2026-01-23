package com.robinhood.android.cash.rewards.p074ui.notification;

import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import com.robinhood.android.cash.rewards.p074ui.onboarding.content.RewardsOnboardingContent;
import com.robinhood.models.api.pluto.RoundupInvestmentType;
import com.robinhood.models.util.Money;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: RewardsNotificationFirstTransactionViewState.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0001+BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u001e\u001a\u00020\u0003HÂ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÂ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0006HÂ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\bHÂ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\bHÂ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u000bHÂ\u0003JM\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\bHÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0010R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0010R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0014R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/cash/rewards/ui/notification/RewardsNotificationFirstTransactionViewState;", "", "rhsContent", "Lcom/robinhood/android/cash/rewards/ui/onboarding/content/RewardsOnboardingContent;", "rhcContent", "transactionAmount", "Lcom/robinhood/models/util/Money;", "merchantName", "", "assetSymbol", "investmentType", "Lcom/robinhood/models/api/pluto/RoundupInvestmentType;", "<init>", "(Lcom/robinhood/android/cash/rewards/ui/onboarding/content/RewardsOnboardingContent;Lcom/robinhood/android/cash/rewards/ui/onboarding/content/RewardsOnboardingContent;Lcom/robinhood/models/util/Money;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/api/pluto/RoundupInvestmentType;)V", "title", "getTitle", "()Ljava/lang/String;", "description", "", "getDescription", "()Ljava/lang/CharSequence;", "disclosureButton", "getDisclosureButton", "disclosureTitle", "getDisclosureTitle", "disclosureMessage", "getDisclosureMessage", "content", "getContent", "()Lcom/robinhood/android/cash/rewards/ui/onboarding/content/RewardsOnboardingContent;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "feature-cash-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final /* data */ class RewardsNotificationFirstTransactionViewState {
    private static final String CONTENT_AMOUNT_PLACE_HOLDER = "{{ .AMOUNT }}";
    private static final String CONTENT_MERCHANT_PLACE_HOLDER = "{{ .MERCHANT }}";
    private static final String CONTENT_SYMBOL_PLACE_HOLDER = "{{ .SYMBOL }}";
    private final String assetSymbol;
    private final RoundupInvestmentType investmentType;
    private final String merchantName;
    private final RewardsOnboardingContent rhcContent;
    private final RewardsOnboardingContent rhsContent;
    private final Money transactionAmount;
    public static final int $stable = 8;

    /* compiled from: RewardsNotificationFirstTransactionViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RoundupInvestmentType.values().length];
            try {
                iArr[RoundupInvestmentType.STOCK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RoundupInvestmentType.CRYPTO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: component1, reason: from getter */
    private final RewardsOnboardingContent getRhsContent() {
        return this.rhsContent;
    }

    /* renamed from: component2, reason: from getter */
    private final RewardsOnboardingContent getRhcContent() {
        return this.rhcContent;
    }

    /* renamed from: component3, reason: from getter */
    private final Money getTransactionAmount() {
        return this.transactionAmount;
    }

    /* renamed from: component4, reason: from getter */
    private final String getMerchantName() {
        return this.merchantName;
    }

    /* renamed from: component5, reason: from getter */
    private final String getAssetSymbol() {
        return this.assetSymbol;
    }

    /* renamed from: component6, reason: from getter */
    private final RoundupInvestmentType getInvestmentType() {
        return this.investmentType;
    }

    public static /* synthetic */ RewardsNotificationFirstTransactionViewState copy$default(RewardsNotificationFirstTransactionViewState rewardsNotificationFirstTransactionViewState, RewardsOnboardingContent rewardsOnboardingContent, RewardsOnboardingContent rewardsOnboardingContent2, Money money, String str, String str2, RoundupInvestmentType roundupInvestmentType, int i, Object obj) {
        if ((i & 1) != 0) {
            rewardsOnboardingContent = rewardsNotificationFirstTransactionViewState.rhsContent;
        }
        if ((i & 2) != 0) {
            rewardsOnboardingContent2 = rewardsNotificationFirstTransactionViewState.rhcContent;
        }
        if ((i & 4) != 0) {
            money = rewardsNotificationFirstTransactionViewState.transactionAmount;
        }
        if ((i & 8) != 0) {
            str = rewardsNotificationFirstTransactionViewState.merchantName;
        }
        if ((i & 16) != 0) {
            str2 = rewardsNotificationFirstTransactionViewState.assetSymbol;
        }
        if ((i & 32) != 0) {
            roundupInvestmentType = rewardsNotificationFirstTransactionViewState.investmentType;
        }
        String str3 = str2;
        RoundupInvestmentType roundupInvestmentType2 = roundupInvestmentType;
        return rewardsNotificationFirstTransactionViewState.copy(rewardsOnboardingContent, rewardsOnboardingContent2, money, str, str3, roundupInvestmentType2);
    }

    public final RewardsNotificationFirstTransactionViewState copy(RewardsOnboardingContent rhsContent, RewardsOnboardingContent rhcContent, Money transactionAmount, String merchantName, String assetSymbol, RoundupInvestmentType investmentType) {
        Intrinsics.checkNotNullParameter(rhsContent, "rhsContent");
        Intrinsics.checkNotNullParameter(rhcContent, "rhcContent");
        return new RewardsNotificationFirstTransactionViewState(rhsContent, rhcContent, transactionAmount, merchantName, assetSymbol, investmentType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RewardsNotificationFirstTransactionViewState)) {
            return false;
        }
        RewardsNotificationFirstTransactionViewState rewardsNotificationFirstTransactionViewState = (RewardsNotificationFirstTransactionViewState) other;
        return Intrinsics.areEqual(this.rhsContent, rewardsNotificationFirstTransactionViewState.rhsContent) && Intrinsics.areEqual(this.rhcContent, rewardsNotificationFirstTransactionViewState.rhcContent) && Intrinsics.areEqual(this.transactionAmount, rewardsNotificationFirstTransactionViewState.transactionAmount) && Intrinsics.areEqual(this.merchantName, rewardsNotificationFirstTransactionViewState.merchantName) && Intrinsics.areEqual(this.assetSymbol, rewardsNotificationFirstTransactionViewState.assetSymbol) && this.investmentType == rewardsNotificationFirstTransactionViewState.investmentType;
    }

    public int hashCode() {
        int iHashCode = ((this.rhsContent.hashCode() * 31) + this.rhcContent.hashCode()) * 31;
        Money money = this.transactionAmount;
        int iHashCode2 = (iHashCode + (money == null ? 0 : money.hashCode())) * 31;
        String str = this.merchantName;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.assetSymbol;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        RoundupInvestmentType roundupInvestmentType = this.investmentType;
        return iHashCode4 + (roundupInvestmentType != null ? roundupInvestmentType.hashCode() : 0);
    }

    public String toString() {
        return "RewardsNotificationFirstTransactionViewState(rhsContent=" + this.rhsContent + ", rhcContent=" + this.rhcContent + ", transactionAmount=" + this.transactionAmount + ", merchantName=" + this.merchantName + ", assetSymbol=" + this.assetSymbol + ", investmentType=" + this.investmentType + ")";
    }

    public RewardsNotificationFirstTransactionViewState(RewardsOnboardingContent rhsContent, RewardsOnboardingContent rhcContent, Money money, String str, String str2, RoundupInvestmentType roundupInvestmentType) {
        Intrinsics.checkNotNullParameter(rhsContent, "rhsContent");
        Intrinsics.checkNotNullParameter(rhcContent, "rhcContent");
        this.rhsContent = rhsContent;
        this.rhcContent = rhcContent;
        this.transactionAmount = money;
        this.merchantName = str;
        this.assetSymbol = str2;
        this.investmentType = roundupInvestmentType;
    }

    public /* synthetic */ RewardsNotificationFirstTransactionViewState(RewardsOnboardingContent rewardsOnboardingContent, RewardsOnboardingContent rewardsOnboardingContent2, Money money, String str, String str2, RoundupInvestmentType roundupInvestmentType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(rewardsOnboardingContent, rewardsOnboardingContent2, (i & 4) != 0 ? null : money, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : roundupInvestmentType);
    }

    public final String getTitle() {
        RewardsOnboardingContent content = getContent();
        if (content != null) {
            return content.getTitle();
        }
        return null;
    }

    public final CharSequence getDescription() {
        Money money = this.transactionAmount;
        if ((money != null ? Money.format$default(money, null, false, null, false, 0, null, false, null, false, false, 1023, null) : null) == null || this.assetSymbol == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        RewardsOnboardingContent content = getContent();
        spannableStringBuilder.append(content != null ? content.getContent() : null);
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) spannableStringBuilder, CONTENT_AMOUNT_PLACE_HOLDER, 0, false, 6, (Object) null);
        spannableStringBuilder.replace(iIndexOf$default, iIndexOf$default + 13, (CharSequence) Money.format$default(this.transactionAmount, null, false, null, false, 0, null, false, null, false, false, 1023, null));
        int iIndexOf$default2 = StringsKt.indexOf$default((CharSequence) spannableStringBuilder, CONTENT_MERCHANT_PLACE_HOLDER, 0, false, 6, (Object) null);
        spannableStringBuilder.replace(iIndexOf$default2, iIndexOf$default2 + 15, (CharSequence) this.merchantName);
        int iIndexOf$default3 = StringsKt.indexOf$default((CharSequence) spannableStringBuilder, CONTENT_SYMBOL_PLACE_HOLDER, 0, false, 6, (Object) null);
        spannableStringBuilder.replace(iIndexOf$default3, iIndexOf$default3 + 13, (CharSequence) this.assetSymbol);
        return new SpannedString(spannableStringBuilder);
    }

    public final String getDisclosureButton() {
        RewardsOnboardingContent.Disclosure disclosure;
        RewardsOnboardingContent content = getContent();
        if (content == null || (disclosure = content.getDisclosure()) == null) {
            return null;
        }
        return disclosure.getButtonText();
    }

    public final String getDisclosureTitle() {
        RewardsOnboardingContent.Disclosure disclosure;
        RewardsOnboardingContent content = getContent();
        if (content == null || (disclosure = content.getDisclosure()) == null) {
            return null;
        }
        return disclosure.getTitle();
    }

    public final CharSequence getDisclosureMessage() {
        RewardsOnboardingContent.Disclosure disclosure;
        RewardsOnboardingContent content = getContent();
        if (content == null || (disclosure = content.getDisclosure()) == null) {
            return null;
        }
        return disclosure.getContent();
    }

    private final RewardsOnboardingContent getContent() {
        RoundupInvestmentType roundupInvestmentType = this.investmentType;
        int i = roundupInvestmentType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[roundupInvestmentType.ordinal()];
        if (i == 1) {
            return this.rhsContent;
        }
        if (i != 2) {
            return null;
        }
        return this.rhcContent;
    }
}
