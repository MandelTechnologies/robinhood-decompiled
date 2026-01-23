package com.robinhood.android.referral.fractionalRewards.claimPreview;

import android.content.res.Resources;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.android.referral.C26659R;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.money.Currencies;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FractionalRewardClaimPreviewState.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\f\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\u000eJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÂ\u0003J!\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\tHÖ\u0001R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/referral/fractionalRewards/claimPreview/FractionalRewardClaimPreviewState;", "", "claimInfo", "Lcom/robinhood/android/referral/fractionalRewards/claimPreview/FractionalRewardClaimInfo;", "quote", "Lcom/robinhood/models/db/Quote;", "<init>", "(Lcom/robinhood/android/referral/fractionalRewards/claimPreview/FractionalRewardClaimInfo;Lcom/robinhood/models/db/Quote;)V", "rewardAmountText", "", "getRewardAmountText", "()Ljava/lang/String;", "getSharesAmountText", "resources", "Landroid/content/res/Resources;", "getCompanyNameText", "getSummaryDescriptionText", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FractionalRewardClaimPreviewState {
    public static final int $stable = 8;
    private final FractionalRewardClaimInfo claimInfo;
    private final Quote quote;
    private final String rewardAmountText;

    /* JADX WARN: Multi-variable type inference failed */
    public FractionalRewardClaimPreviewState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* renamed from: component1, reason: from getter */
    private final FractionalRewardClaimInfo getClaimInfo() {
        return this.claimInfo;
    }

    /* renamed from: component2, reason: from getter */
    private final Quote getQuote() {
        return this.quote;
    }

    public static /* synthetic */ FractionalRewardClaimPreviewState copy$default(FractionalRewardClaimPreviewState fractionalRewardClaimPreviewState, FractionalRewardClaimInfo fractionalRewardClaimInfo, Quote quote, int i, Object obj) {
        if ((i & 1) != 0) {
            fractionalRewardClaimInfo = fractionalRewardClaimPreviewState.claimInfo;
        }
        if ((i & 2) != 0) {
            quote = fractionalRewardClaimPreviewState.quote;
        }
        return fractionalRewardClaimPreviewState.copy(fractionalRewardClaimInfo, quote);
    }

    public final FractionalRewardClaimPreviewState copy(FractionalRewardClaimInfo claimInfo, Quote quote) {
        return new FractionalRewardClaimPreviewState(claimInfo, quote);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FractionalRewardClaimPreviewState)) {
            return false;
        }
        FractionalRewardClaimPreviewState fractionalRewardClaimPreviewState = (FractionalRewardClaimPreviewState) other;
        return Intrinsics.areEqual(this.claimInfo, fractionalRewardClaimPreviewState.claimInfo) && Intrinsics.areEqual(this.quote, fractionalRewardClaimPreviewState.quote);
    }

    public int hashCode() {
        FractionalRewardClaimInfo fractionalRewardClaimInfo = this.claimInfo;
        int iHashCode = (fractionalRewardClaimInfo == null ? 0 : fractionalRewardClaimInfo.hashCode()) * 31;
        Quote quote = this.quote;
        return iHashCode + (quote != null ? quote.hashCode() : 0);
    }

    public String toString() {
        return "FractionalRewardClaimPreviewState(claimInfo=" + this.claimInfo + ", quote=" + this.quote + ")";
    }

    public FractionalRewardClaimPreviewState(FractionalRewardClaimInfo fractionalRewardClaimInfo, Quote quote) {
        BigDecimal rewardAmount;
        Money money;
        this.claimInfo = fractionalRewardClaimInfo;
        this.quote = quote;
        this.rewardAmountText = (fractionalRewardClaimInfo == null || (rewardAmount = fractionalRewardClaimInfo.getRewardAmount()) == null || (money = Money3.toMoney(rewardAmount, Currencies.USD)) == null) ? null : Money.format$default(money, null, false, null, false, 0, null, false, null, false, false, 1023, null);
    }

    public /* synthetic */ FractionalRewardClaimPreviewState(FractionalRewardClaimInfo fractionalRewardClaimInfo, Quote quote, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : fractionalRewardClaimInfo, (i & 2) != 0 ? null : quote);
    }

    public final String getRewardAmountText() {
        return this.rewardAmountText;
    }

    public final String getSharesAmountText(Resources resources) {
        BigDecimal marketPrice;
        Money lastTradePrice;
        Intrinsics.checkNotNullParameter(resources, "resources");
        FractionalRewardClaimInfo fractionalRewardClaimInfo = this.claimInfo;
        if (fractionalRewardClaimInfo == null) {
            return null;
        }
        Quote quote = this.quote;
        if (quote == null || (lastTradePrice = quote.getLastTradePrice()) == null || (marketPrice = lastTradePrice.getDecimalValue()) == null) {
            marketPrice = fractionalRewardClaimInfo.getMarketPrice();
        }
        BigDecimal bigDecimal = marketPrice;
        NumberFormatter shareQuantityFormat = Formats.getShareQuantityFormat();
        return resources.getString(C26659R.string.fractional_reward_shares_amount_placeholder, shareQuantityFormat.format(BigDecimals7.safeDivide$default(fractionalRewardClaimInfo.getRewardAmount(), bigDecimal, shareQuantityFormat.getMaximumFractionalDigits(), null, 4, null)));
    }

    public final String getCompanyNameText(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        FractionalRewardClaimInfo fractionalRewardClaimInfo = this.claimInfo;
        if (fractionalRewardClaimInfo != null) {
            return resources.getString(C26659R.string.fractional_reward_instrument_name_placeholder, fractionalRewardClaimInfo.getInstrumentName());
        }
        return null;
    }

    public final String getSummaryDescriptionText(Resources resources) {
        String instrumentName;
        BigDecimal marketPrice;
        Money lastTradePrice;
        Intrinsics.checkNotNullParameter(resources, "resources");
        FractionalRewardClaimInfo fractionalRewardClaimInfo = this.claimInfo;
        if (fractionalRewardClaimInfo == null) {
            return null;
        }
        String formattedRewardAmount = fractionalRewardClaimInfo.getFormattedRewardAmount();
        if (formattedRewardAmount == null) {
            formattedRewardAmount = Money.format$default(Money3.toMoney(fractionalRewardClaimInfo.getRewardAmount(), Currencies.USD), null, false, null, false, 0, null, false, null, false, false, 1023, null);
        }
        Quote quote = this.quote;
        if (quote == null || (instrumentName = quote.getSymbol()) == null) {
            instrumentName = fractionalRewardClaimInfo.getInstrumentName();
        }
        Quote quote2 = this.quote;
        if (quote2 == null || (lastTradePrice = quote2.getLastTradePrice()) == null || (marketPrice = lastTradePrice.getDecimalValue()) == null) {
            marketPrice = fractionalRewardClaimInfo.getMarketPrice();
        }
        BigDecimal bigDecimal = marketPrice;
        NumberFormatter shareQuantityFormat = Formats.getShareQuantityFormat();
        return resources.getString(C26659R.string.fractional_reward_claim_description_placeholder, formattedRewardAmount, instrumentName, bigDecimal, shareQuantityFormat.format(BigDecimals7.safeDivide$default(fractionalRewardClaimInfo.getRewardAmount(), bigDecimal, shareQuantityFormat.getMaximumFractionalDigits(), null, 4, null)));
    }
}
