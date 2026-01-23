package com.robinhood.android.rhyrewards.p246ui;

import com.robinhood.android.rhyrewards.C27650R;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.mcduckling.MerchantOfferV2;
import com.robinhood.models.rhy.referral.api.RhyReferralVariant;
import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;
import p479j$.time.Instant;

/* compiled from: CashCardOffer.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0018\u0019J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u0082\u0001\u0002\u001a\u001b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/rhyrewards/ui/CashCardOffer;", "", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/utils/resource/StringResource;", "expiration", "(Lj$/time/Clock;)Lcom/robinhood/utils/resource/StringResource;", "Ljava/util/UUID;", "getId", "()Ljava/util/UUID;", "id", "", "getShouldTakeFullWidth", "()Z", "shouldTakeFullWidth", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "title", "getLogoUrl", "logoUrl", "", "getLogoResource", "()Ljava/lang/Integer;", "logoResource", "RhyReferral", "Merchant", "Lcom/robinhood/android/rhyrewards/ui/CashCardOffer$Merchant;", "Lcom/robinhood/android/rhyrewards/ui/CashCardOffer$RhyReferral;", "feature-lib-rhy-rewards_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public interface CashCardOffer {
    StringResource expiration(Clock clock);

    UUID getId();

    Integer getLogoResource();

    StringResource getLogoUrl();

    boolean getShouldTakeFullWidth();

    StringResource getTitle();

    /* compiled from: CashCardOffer.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001a\u0010\u001d\u001a\u00020\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\u00178\u0016X\u0096D¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010%\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010)\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010(R\u001a\u0010+\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010/\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b/\u0010&\u001a\u0004\b0\u0010(¨\u00061"}, m3636d2 = {"Lcom/robinhood/android/rhyrewards/ui/CashCardOffer$RhyReferral;", "Lcom/robinhood/android/rhyrewards/ui/CashCardOffer;", "Lcom/robinhood/models/rhy/referral/api/RhyReferralVariant;", "variant", "<init>", "(Lcom/robinhood/models/rhy/referral/api/RhyReferralVariant;)V", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/utils/resource/StringResource;", "expiration", "(Lj$/time/Clock;)Lcom/robinhood/utils/resource/StringResource;", "component1", "()Lcom/robinhood/models/rhy/referral/api/RhyReferralVariant;", "copy", "(Lcom/robinhood/models/rhy/referral/api/RhyReferralVariant;)Lcom/robinhood/android/rhyrewards/ui/CashCardOffer$RhyReferral;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/models/rhy/referral/api/RhyReferralVariant;", "getVariant", "Ljava/util/UUID;", "id", "Ljava/util/UUID;", "getId", "()Ljava/util/UUID;", "shouldTakeFullWidth", "Z", "getShouldTakeFullWidth", "()Z", "title", "Lcom/robinhood/utils/resource/StringResource;", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "logoUrl", "getLogoUrl", "logoResource", "I", "getLogoResource", "()Ljava/lang/Integer;", "header", "getHeader", "feature-lib-rhy-rewards_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class RhyReferral implements CashCardOffer {
        public static final int $stable = 8;
        private final StringResource header;
        private final UUID id;
        private final int logoResource;
        private final StringResource logoUrl;
        private final boolean shouldTakeFullWidth;
        private final StringResource title;
        private final RhyReferralVariant variant;

        /* compiled from: CashCardOffer.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[RhyReferralVariant.values().length];
                try {
                    iArr[RhyReferralVariant.UNKNOWN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[RhyReferralVariant.FIVE_DOLLARS_BACK.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[RhyReferralVariant.TEN_DOLLARS_BACK.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[RhyReferralVariant.TWENTY_FIVE_PERCENT_BACK.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public static /* synthetic */ RhyReferral copy$default(RhyReferral rhyReferral, RhyReferralVariant rhyReferralVariant, int i, Object obj) {
            if ((i & 1) != 0) {
                rhyReferralVariant = rhyReferral.variant;
            }
            return rhyReferral.copy(rhyReferralVariant);
        }

        /* renamed from: component1, reason: from getter */
        public final RhyReferralVariant getVariant() {
            return this.variant;
        }

        public final RhyReferral copy(RhyReferralVariant variant) {
            Intrinsics.checkNotNullParameter(variant, "variant");
            return new RhyReferral(variant);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RhyReferral) && this.variant == ((RhyReferral) other).variant;
        }

        @Override // com.robinhood.android.rhyrewards.p246ui.CashCardOffer
        public StringResource expiration(Clock clock) {
            Intrinsics.checkNotNullParameter(clock, "clock");
            return null;
        }

        public int hashCode() {
            return this.variant.hashCode();
        }

        public String toString() {
            return "RhyReferral(variant=" + this.variant + ")";
        }

        public RhyReferral(RhyReferralVariant variant) {
            StringResource stringResourceInvoke;
            Intrinsics.checkNotNullParameter(variant, "variant");
            this.variant = variant;
            UUID uuidFromString = UUID.fromString("00000000-0000-0000-0000-00000000000");
            Intrinsics.checkNotNullExpressionValue(uuidFromString, "fromString(...)");
            this.id = uuidFromString;
            int i = WhenMappings.$EnumSwitchMapping$0[variant.ordinal()];
            if (i == 1) {
                stringResourceInvoke = null;
            } else if (i == 2) {
                stringResourceInvoke = StringResource.INSTANCE.invoke(C27650R.string.rhy_referral_card_offer_five_dollars_back, new Object[0]);
            } else if (i == 3) {
                stringResourceInvoke = StringResource.INSTANCE.invoke(C27650R.string.rhy_referral_card_offer_ten_dollars_back, new Object[0]);
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                stringResourceInvoke = StringResource.INSTANCE.invoke(C27650R.string.rhy_referral_card_offer_twenty_five_percent_back, new Object[0]);
            }
            this.title = stringResourceInvoke;
            this.logoResource = C27650R.drawable.rhy_referral_offer_logo;
            this.header = StringResource.INSTANCE.invoke(C27650R.string.rhy_referral_offer_title, new Object[0]);
        }

        public final RhyReferralVariant getVariant() {
            return this.variant;
        }

        @Override // com.robinhood.android.rhyrewards.p246ui.CashCardOffer
        public UUID getId() {
            return this.id;
        }

        @Override // com.robinhood.android.rhyrewards.p246ui.CashCardOffer
        public boolean getShouldTakeFullWidth() {
            return this.shouldTakeFullWidth;
        }

        @Override // com.robinhood.android.rhyrewards.p246ui.CashCardOffer
        public StringResource getTitle() {
            return this.title;
        }

        @Override // com.robinhood.android.rhyrewards.p246ui.CashCardOffer
        public StringResource getLogoUrl() {
            return this.logoUrl;
        }

        @Override // com.robinhood.android.rhyrewards.p246ui.CashCardOffer
        public Integer getLogoResource() {
            return Integer.valueOf(this.logoResource);
        }

        public final StringResource getHeader() {
            return this.header;
        }
    }

    /* compiled from: CashCardOffer.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001a\u0010\u001d\u001a\u00020\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010)\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010(R\u001c\u0010+\u001a\u0004\u0018\u00010\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u0006/"}, m3636d2 = {"Lcom/robinhood/android/rhyrewards/ui/CashCardOffer$Merchant;", "Lcom/robinhood/android/rhyrewards/ui/CashCardOffer;", "Lcom/robinhood/models/db/mcduckling/MerchantOfferV2;", "offer", "<init>", "(Lcom/robinhood/models/db/mcduckling/MerchantOfferV2;)V", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/utils/resource/StringResource;", "expiration", "(Lj$/time/Clock;)Lcom/robinhood/utils/resource/StringResource;", "component1", "()Lcom/robinhood/models/db/mcduckling/MerchantOfferV2;", "copy", "(Lcom/robinhood/models/db/mcduckling/MerchantOfferV2;)Lcom/robinhood/android/rhyrewards/ui/CashCardOffer$Merchant;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/models/db/mcduckling/MerchantOfferV2;", "getOffer", "Ljava/util/UUID;", "id", "Ljava/util/UUID;", "getId", "()Ljava/util/UUID;", "shouldTakeFullWidth", "Z", "getShouldTakeFullWidth", "()Z", "title", "Lcom/robinhood/utils/resource/StringResource;", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "logoUrl", "getLogoUrl", "logoResource", "Ljava/lang/Integer;", "getLogoResource", "()Ljava/lang/Integer;", "feature-lib-rhy-rewards_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Merchant implements CashCardOffer {
        public static final int $stable = 8;
        private final UUID id;
        private final Integer logoResource;
        private final StringResource logoUrl;
        private final MerchantOfferV2 offer;
        private final boolean shouldTakeFullWidth;
        private final StringResource title;

        public static /* synthetic */ Merchant copy$default(Merchant merchant, MerchantOfferV2 merchantOfferV2, int i, Object obj) {
            if ((i & 1) != 0) {
                merchantOfferV2 = merchant.offer;
            }
            return merchant.copy(merchantOfferV2);
        }

        /* renamed from: component1, reason: from getter */
        public final MerchantOfferV2 getOffer() {
            return this.offer;
        }

        public final Merchant copy(MerchantOfferV2 offer) {
            Intrinsics.checkNotNullParameter(offer, "offer");
            return new Merchant(offer);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Merchant) && Intrinsics.areEqual(this.offer, ((Merchant) other).offer);
        }

        public int hashCode() {
            return this.offer.hashCode();
        }

        public String toString() {
            return "Merchant(offer=" + this.offer + ")";
        }

        public Merchant(MerchantOfferV2 offer) {
            Intrinsics.checkNotNullParameter(offer, "offer");
            this.offer = offer;
            this.id = offer.getId();
            this.shouldTakeFullWidth = offer.getShouldTakeFullWidth();
            StringResource.Companion companion = StringResource.INSTANCE;
            this.title = companion.invoke(offer.getTitle());
            this.logoUrl = companion.invoke(offer.getMerchantLogo());
        }

        public final MerchantOfferV2 getOffer() {
            return this.offer;
        }

        @Override // com.robinhood.android.rhyrewards.p246ui.CashCardOffer
        public UUID getId() {
            return this.id;
        }

        @Override // com.robinhood.android.rhyrewards.p246ui.CashCardOffer
        public boolean getShouldTakeFullWidth() {
            return this.shouldTakeFullWidth;
        }

        @Override // com.robinhood.android.rhyrewards.p246ui.CashCardOffer
        public StringResource getTitle() {
            return this.title;
        }

        @Override // com.robinhood.android.rhyrewards.p246ui.CashCardOffer
        public StringResource getLogoUrl() {
            return this.logoUrl;
        }

        @Override // com.robinhood.android.rhyrewards.p246ui.CashCardOffer
        public Integer getLogoResource() {
            return this.logoResource;
        }

        @Override // com.robinhood.android.rhyrewards.p246ui.CashCardOffer
        public StringResource expiration(Clock clock) {
            Intrinsics.checkNotNullParameter(clock, "clock");
            Instant expireAt = this.offer.getExpireAt();
            if (expireAt == null) {
                return null;
            }
            Tuples2<Integer, Long> timeToExpiration = CashCardOffer2.getTimeToExpiration(clock, expireAt);
            return StringResource.INSTANCE.invoke(timeToExpiration.getFirst().intValue(), timeToExpiration.getSecond());
        }
    }
}
