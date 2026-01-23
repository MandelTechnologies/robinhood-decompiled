package com.robinhood.android.history.p153ui;

import com.robinhood.android.history.C18359R;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.models.api.pluto.ApiMerchantReward;
import com.robinhood.models.p320db.MerchantReward;
import com.robinhood.models.p320db.mcduckling.MerchantOfferBanner;
import com.robinhood.models.p320db.mcduckling.MerchantOfferV2;
import com.robinhood.models.util.Money;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: MerchantDetailViewState.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000f\u00104\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÂ\u0003JI\u00105\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0001J\u0013\u00106\u001a\u00020\u00182\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00108\u001a\u00020&HÖ\u0001J\t\u00109\u001a\u00020\u001cHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0019R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u001f\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0013\u0010#\u001a\u0004\u0018\u00010\u001c8F¢\u0006\u0006\u001a\u0004\b$\u0010\u001eR\u0011\u0010%\u001a\u00020&8G¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0011\u0010)\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b*\u0010\u0019R\u0011\u0010+\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b,\u0010\u0019R\u0019\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u0006:"}, m3636d2 = {"Lcom/robinhood/android/history/ui/MerchantDetailViewState;", "", "amountText", "", "merchantReward", "Lcom/robinhood/models/db/MerchantReward;", "merchantOffer", "Lcom/robinhood/models/db/mcduckling/MerchantOfferV2;", MerchantRewardDetailComposable.BANNER_TEST_TAG, "Lcom/robinhood/models/db/mcduckling/MerchantOfferBanner;", "shouldLogAppearEvent", "Lcom/robinhood/udf/UiEvent;", "", "<init>", "(Ljava/lang/CharSequence;Lcom/robinhood/models/db/MerchantReward;Lcom/robinhood/models/db/mcduckling/MerchantOfferV2;Lcom/robinhood/models/db/mcduckling/MerchantOfferBanner;Lcom/robinhood/udf/UiEvent;)V", "getAmountText", "()Ljava/lang/CharSequence;", "getMerchantReward", "()Lcom/robinhood/models/db/MerchantReward;", "getMerchantOffer", "()Lcom/robinhood/models/db/mcduckling/MerchantOfferV2;", "getBanner", "()Lcom/robinhood/models/db/mcduckling/MerchantOfferBanner;", "isPending", "", "()Z", "isComplete", "transactionAmount", "", "getTransactionAmount", "()Ljava/lang/String;", "rewardDetailTitle", "Lcom/robinhood/utils/resource/StringResource;", "getRewardDetailTitle", "()Lcom/robinhood/utils/resource/StringResource;", "rewardDetailSubtitle", "getRewardDetailSubtitle", "rewardDetailStatus", "", "getRewardDetailStatus", "()I", "merchantRewardDetailSubtitleIsVisible", "getMerchantRewardDetailSubtitleIsVisible", "merchantRewardDetailStatusIsVisible", "getMerchantRewardDetailStatusIsVisible", "logAppearEvent", "getLogAppearEvent", "()Lcom/robinhood/udf/UiEvent;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class MerchantDetailViewState {
    public static final int $stable = 8;
    private final CharSequence amountText;
    private final MerchantOfferBanner banner;
    private final MerchantOfferV2 merchantOffer;
    private final MerchantReward merchantReward;
    private final UiEvent<Unit> shouldLogAppearEvent;

    public MerchantDetailViewState() {
        this(null, null, null, null, null, 31, null);
    }

    private final UiEvent<Unit> component5() {
        return this.shouldLogAppearEvent;
    }

    public static /* synthetic */ MerchantDetailViewState copy$default(MerchantDetailViewState merchantDetailViewState, CharSequence charSequence, MerchantReward merchantReward, MerchantOfferV2 merchantOfferV2, MerchantOfferBanner merchantOfferBanner, UiEvent uiEvent, int i, Object obj) {
        if ((i & 1) != 0) {
            charSequence = merchantDetailViewState.amountText;
        }
        if ((i & 2) != 0) {
            merchantReward = merchantDetailViewState.merchantReward;
        }
        if ((i & 4) != 0) {
            merchantOfferV2 = merchantDetailViewState.merchantOffer;
        }
        if ((i & 8) != 0) {
            merchantOfferBanner = merchantDetailViewState.banner;
        }
        if ((i & 16) != 0) {
            uiEvent = merchantDetailViewState.shouldLogAppearEvent;
        }
        UiEvent uiEvent2 = uiEvent;
        MerchantOfferV2 merchantOfferV22 = merchantOfferV2;
        return merchantDetailViewState.copy(charSequence, merchantReward, merchantOfferV22, merchantOfferBanner, uiEvent2);
    }

    /* renamed from: component1, reason: from getter */
    public final CharSequence getAmountText() {
        return this.amountText;
    }

    /* renamed from: component2, reason: from getter */
    public final MerchantReward getMerchantReward() {
        return this.merchantReward;
    }

    /* renamed from: component3, reason: from getter */
    public final MerchantOfferV2 getMerchantOffer() {
        return this.merchantOffer;
    }

    /* renamed from: component4, reason: from getter */
    public final MerchantOfferBanner getBanner() {
        return this.banner;
    }

    public final MerchantDetailViewState copy(CharSequence amountText, MerchantReward merchantReward, MerchantOfferV2 merchantOffer, MerchantOfferBanner banner, UiEvent<Unit> shouldLogAppearEvent) {
        Intrinsics.checkNotNullParameter(shouldLogAppearEvent, "shouldLogAppearEvent");
        return new MerchantDetailViewState(amountText, merchantReward, merchantOffer, banner, shouldLogAppearEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MerchantDetailViewState)) {
            return false;
        }
        MerchantDetailViewState merchantDetailViewState = (MerchantDetailViewState) other;
        return Intrinsics.areEqual(this.amountText, merchantDetailViewState.amountText) && Intrinsics.areEqual(this.merchantReward, merchantDetailViewState.merchantReward) && Intrinsics.areEqual(this.merchantOffer, merchantDetailViewState.merchantOffer) && Intrinsics.areEqual(this.banner, merchantDetailViewState.banner) && Intrinsics.areEqual(this.shouldLogAppearEvent, merchantDetailViewState.shouldLogAppearEvent);
    }

    public int hashCode() {
        CharSequence charSequence = this.amountText;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        MerchantReward merchantReward = this.merchantReward;
        int iHashCode2 = (iHashCode + (merchantReward == null ? 0 : merchantReward.hashCode())) * 31;
        MerchantOfferV2 merchantOfferV2 = this.merchantOffer;
        int iHashCode3 = (iHashCode2 + (merchantOfferV2 == null ? 0 : merchantOfferV2.hashCode())) * 31;
        MerchantOfferBanner merchantOfferBanner = this.banner;
        return ((iHashCode3 + (merchantOfferBanner != null ? merchantOfferBanner.hashCode() : 0)) * 31) + this.shouldLogAppearEvent.hashCode();
    }

    public String toString() {
        CharSequence charSequence = this.amountText;
        return "MerchantDetailViewState(amountText=" + ((Object) charSequence) + ", merchantReward=" + this.merchantReward + ", merchantOffer=" + this.merchantOffer + ", banner=" + this.banner + ", shouldLogAppearEvent=" + this.shouldLogAppearEvent + ")";
    }

    public MerchantDetailViewState(CharSequence charSequence, MerchantReward merchantReward, MerchantOfferV2 merchantOfferV2, MerchantOfferBanner merchantOfferBanner, UiEvent<Unit> shouldLogAppearEvent) {
        Intrinsics.checkNotNullParameter(shouldLogAppearEvent, "shouldLogAppearEvent");
        this.amountText = charSequence;
        this.merchantReward = merchantReward;
        this.merchantOffer = merchantOfferV2;
        this.banner = merchantOfferBanner;
        this.shouldLogAppearEvent = shouldLogAppearEvent;
    }

    public final CharSequence getAmountText() {
        return this.amountText;
    }

    public final MerchantReward getMerchantReward() {
        return this.merchantReward;
    }

    public final MerchantOfferV2 getMerchantOffer() {
        return this.merchantOffer;
    }

    public final MerchantOfferBanner getBanner() {
        return this.banner;
    }

    public /* synthetic */ MerchantDetailViewState(CharSequence charSequence, MerchantReward merchantReward, MerchantOfferV2 merchantOfferV2, MerchantOfferBanner merchantOfferBanner, UiEvent uiEvent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : charSequence, (i & 2) != 0 ? null : merchantReward, (i & 4) != 0 ? null : merchantOfferV2, (i & 8) != 0 ? null : merchantOfferBanner, (i & 16) != 0 ? new UiEvent(Unit.INSTANCE) : uiEvent);
    }

    private final boolean isPending() {
        MerchantReward merchantReward = this.merchantReward;
        return (merchantReward != null ? merchantReward.getState() : null) == ApiMerchantReward.State.PENDING;
    }

    private final boolean isComplete() {
        MerchantReward merchantReward = this.merchantReward;
        return (merchantReward != null ? merchantReward.getState() : null) == ApiMerchantReward.State.COMPLETED;
    }

    public final String getTransactionAmount() {
        Money transactionAmount;
        MerchantReward merchantReward = this.merchantReward;
        if (merchantReward == null || (transactionAmount = merchantReward.getTransactionAmount()) == null) {
            return null;
        }
        return Money.format$default(transactionAmount, null, false, null, false, 0, null, false, null, false, false, 1023, null);
    }

    public final StringResource getRewardDetailTitle() {
        if (isPending() || isComplete()) {
            MerchantReward merchantReward = this.merchantReward;
            Float percentage = merchantReward != null ? merchantReward.getPercentage() : null;
            CharSequence charSequence = this.amountText;
            if ((charSequence == null || StringsKt.isBlank(charSequence)) && percentage != null) {
                return StringResource.INSTANCE.invoke(C18359R.string.merchant_reward_detail_percent_title, Formats.getInterestRateFormatShortWithPercentage().format(percentage));
            }
            if (charSequence != null && !StringsKt.isBlank(charSequence)) {
                return StringResource.INSTANCE.invoke(C18359R.string.merchant_reward_detail_amount_title, charSequence);
            }
            throw new IllegalStateException("Cannot handle merchant reward with null percentage and null amount");
        }
        return StringResource.INSTANCE.invoke(C18359R.string.merchant_reward_detail_unknown_title, new Object[0]);
    }

    public final String getRewardDetailSubtitle() {
        MerchantReward merchantReward;
        if ((isPending() || isComplete()) && (merchantReward = this.merchantReward) != null) {
            return merchantReward.getTitle();
        }
        return null;
    }

    public final int getRewardDetailStatus() {
        if (isPending()) {
            return C18359R.string.merchant_reward_detail_state_pending;
        }
        return C18359R.string.merchant_reward_detail_state_complete;
    }

    public final boolean getMerchantRewardDetailSubtitleIsVisible() {
        return isPending() || isComplete();
    }

    public final boolean getMerchantRewardDetailStatusIsVisible() {
        return isPending() || isComplete();
    }

    public final UiEvent<MerchantOfferV2> getLogAppearEvent() {
        if (this.merchantOffer == null || this.shouldLogAppearEvent.consume() == null) {
            return null;
        }
        return new UiEvent<>(this.merchantOffer);
    }
}
