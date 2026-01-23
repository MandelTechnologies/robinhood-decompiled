package com.robinhood.android.crypto.p094ui.detail.cards;

import com.robinhood.android.equitydetail.p123ui.InstrumentDetailDuxo;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.p320db.herocard.IacHeroCard;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoDetailCard.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0004\f\r\u000e\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/cards/CryptoDetailCard;", "", "<init>", "()V", "id", "", "getId", "()Ljava/lang/String;", "BreakingNews", "IacHero", "LearnAndEarn", "AdvancedAlert", "Lcom/robinhood/android/crypto/ui/detail/cards/CryptoDetailCard$AdvancedAlert;", "Lcom/robinhood/android/crypto/ui/detail/cards/CryptoDetailCard$BreakingNews;", "Lcom/robinhood/android/crypto/ui/detail/cards/CryptoDetailCard$IacHero;", "Lcom/robinhood/android/crypto/ui/detail/cards/CryptoDetailCard$LearnAndEarn;", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public abstract class CryptoDetailCard {
    public static final int $stable = 0;

    public /* synthetic */ CryptoDetailCard(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String getId();

    private CryptoDetailCard() {
    }

    /* compiled from: CryptoDetailCard.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/cards/CryptoDetailCard$BreakingNews;", "Lcom/robinhood/android/crypto/ui/detail/cards/CryptoDetailCard;", "breakingNews", "Lcom/robinhood/android/newsfeed/models/breakingnews/db/BreakingNews;", "<init>", "(Lcom/robinhood/android/newsfeed/models/breakingnews/db/BreakingNews;)V", "getBreakingNews", "()Lcom/robinhood/android/newsfeed/models/breakingnews/db/BreakingNews;", "id", "", "getId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class BreakingNews extends CryptoDetailCard {
        public static final int $stable = 8;
        private final com.robinhood.android.newsfeed.models.breakingnews.p199db.BreakingNews breakingNews;

        public static /* synthetic */ BreakingNews copy$default(BreakingNews breakingNews, com.robinhood.android.newsfeed.models.breakingnews.p199db.BreakingNews breakingNews2, int i, Object obj) {
            if ((i & 1) != 0) {
                breakingNews2 = breakingNews.breakingNews;
            }
            return breakingNews.copy(breakingNews2);
        }

        /* renamed from: component1, reason: from getter */
        public final com.robinhood.android.newsfeed.models.breakingnews.p199db.BreakingNews getBreakingNews() {
            return this.breakingNews;
        }

        public final BreakingNews copy(com.robinhood.android.newsfeed.models.breakingnews.p199db.BreakingNews breakingNews) {
            Intrinsics.checkNotNullParameter(breakingNews, "breakingNews");
            return new BreakingNews(breakingNews);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof BreakingNews) && Intrinsics.areEqual(this.breakingNews, ((BreakingNews) other).breakingNews);
        }

        public int hashCode() {
            return this.breakingNews.hashCode();
        }

        public String toString() {
            return "BreakingNews(breakingNews=" + this.breakingNews + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BreakingNews(com.robinhood.android.newsfeed.models.breakingnews.p199db.BreakingNews breakingNews) {
            super(null);
            Intrinsics.checkNotNullParameter(breakingNews, "breakingNews");
            this.breakingNews = breakingNews;
        }

        public final com.robinhood.android.newsfeed.models.breakingnews.p199db.BreakingNews getBreakingNews() {
            return this.breakingNews;
        }

        @Override // com.robinhood.android.crypto.p094ui.detail.cards.CryptoDetailCard
        public String getId() {
            return "BreakingNews";
        }
    }

    /* compiled from: CryptoDetailCard.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/cards/CryptoDetailCard$IacHero;", "Lcom/robinhood/android/crypto/ui/detail/cards/CryptoDetailCard;", "currencyPairId", "Ljava/util/UUID;", InstrumentDetailDuxo.KEY_IAC_HERO_CARD, "Lcom/robinhood/models/db/herocard/IacHeroCard;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/db/herocard/IacHeroCard;)V", "getCurrencyPairId", "()Ljava/util/UUID;", "getIacHeroCard", "()Lcom/robinhood/models/db/herocard/IacHeroCard;", "id", "", "getId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class IacHero extends CryptoDetailCard {
        public static final int $stable = 8;
        private final UUID currencyPairId;
        private final IacHeroCard iacHeroCard;

        public static /* synthetic */ IacHero copy$default(IacHero iacHero, UUID uuid, IacHeroCard iacHeroCard, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = iacHero.currencyPairId;
            }
            if ((i & 2) != 0) {
                iacHeroCard = iacHero.iacHeroCard;
            }
            return iacHero.copy(uuid, iacHeroCard);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getCurrencyPairId() {
            return this.currencyPairId;
        }

        /* renamed from: component2, reason: from getter */
        public final IacHeroCard getIacHeroCard() {
            return this.iacHeroCard;
        }

        public final IacHero copy(UUID currencyPairId, IacHeroCard iacHeroCard) {
            Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
            Intrinsics.checkNotNullParameter(iacHeroCard, "iacHeroCard");
            return new IacHero(currencyPairId, iacHeroCard);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IacHero)) {
                return false;
            }
            IacHero iacHero = (IacHero) other;
            return Intrinsics.areEqual(this.currencyPairId, iacHero.currencyPairId) && Intrinsics.areEqual(this.iacHeroCard, iacHero.iacHeroCard);
        }

        public int hashCode() {
            return (this.currencyPairId.hashCode() * 31) + this.iacHeroCard.hashCode();
        }

        public String toString() {
            return "IacHero(currencyPairId=" + this.currencyPairId + ", iacHeroCard=" + this.iacHeroCard + ")";
        }

        public final UUID getCurrencyPairId() {
            return this.currencyPairId;
        }

        public final IacHeroCard getIacHeroCard() {
            return this.iacHeroCard;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IacHero(UUID currencyPairId, IacHeroCard iacHeroCard) {
            super(null);
            Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
            Intrinsics.checkNotNullParameter(iacHeroCard, "iacHeroCard");
            this.currencyPairId = currencyPairId;
            this.iacHeroCard = iacHeroCard;
        }

        @Override // com.robinhood.android.crypto.p094ui.detail.cards.CryptoDetailCard
        public String getId() {
            String cardIdentifier = this.iacHeroCard.getCardIdentifier();
            return cardIdentifier == null ? "IacHero" : cardIdentifier;
        }
    }

    /* compiled from: CryptoDetailCard.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ.\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\n¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/cards/CryptoDetailCard$LearnAndEarn;", "Lcom/robinhood/android/crypto/ui/detail/cards/CryptoDetailCard;", "bannerText", "", "lessonId", "imageResource", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getBannerText", "()Ljava/lang/String;", "getLessonId", "getImageResource", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "id", "getId", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/robinhood/android/crypto/ui/detail/cards/CryptoDetailCard$LearnAndEarn;", "equals", "", "other", "", "hashCode", "toString", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class LearnAndEarn extends CryptoDetailCard {
        public static final int $stable = 0;
        private final String bannerText;
        private final Integer imageResource;
        private final String lessonId;

        public static /* synthetic */ LearnAndEarn copy$default(LearnAndEarn learnAndEarn, String str, String str2, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                str = learnAndEarn.bannerText;
            }
            if ((i & 2) != 0) {
                str2 = learnAndEarn.lessonId;
            }
            if ((i & 4) != 0) {
                num = learnAndEarn.imageResource;
            }
            return learnAndEarn.copy(str, str2, num);
        }

        /* renamed from: component1, reason: from getter */
        public final String getBannerText() {
            return this.bannerText;
        }

        /* renamed from: component2, reason: from getter */
        public final String getLessonId() {
            return this.lessonId;
        }

        /* renamed from: component3, reason: from getter */
        public final Integer getImageResource() {
            return this.imageResource;
        }

        public final LearnAndEarn copy(String bannerText, String lessonId, Integer imageResource) {
            Intrinsics.checkNotNullParameter(bannerText, "bannerText");
            Intrinsics.checkNotNullParameter(lessonId, "lessonId");
            return new LearnAndEarn(bannerText, lessonId, imageResource);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LearnAndEarn)) {
                return false;
            }
            LearnAndEarn learnAndEarn = (LearnAndEarn) other;
            return Intrinsics.areEqual(this.bannerText, learnAndEarn.bannerText) && Intrinsics.areEqual(this.lessonId, learnAndEarn.lessonId) && Intrinsics.areEqual(this.imageResource, learnAndEarn.imageResource);
        }

        public int hashCode() {
            int iHashCode = ((this.bannerText.hashCode() * 31) + this.lessonId.hashCode()) * 31;
            Integer num = this.imageResource;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        public String toString() {
            return "LearnAndEarn(bannerText=" + this.bannerText + ", lessonId=" + this.lessonId + ", imageResource=" + this.imageResource + ")";
        }

        public final String getBannerText() {
            return this.bannerText;
        }

        public final String getLessonId() {
            return this.lessonId;
        }

        public final Integer getImageResource() {
            return this.imageResource;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LearnAndEarn(String bannerText, String lessonId, Integer num) {
            super(null);
            Intrinsics.checkNotNullParameter(bannerText, "bannerText");
            Intrinsics.checkNotNullParameter(lessonId, "lessonId");
            this.bannerText = bannerText;
            this.lessonId = lessonId;
            this.imageResource = num;
        }

        @Override // com.robinhood.android.crypto.p094ui.detail.cards.CryptoDetailCard
        public String getId() {
            return "LearnAndEarn";
        }
    }

    /* compiled from: CryptoDetailCard.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/cards/CryptoDetailCard$AdvancedAlert;", "Lcom/robinhood/android/crypto/ui/detail/cards/CryptoDetailCard;", "currencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "<init>", "(Lcom/robinhood/models/crypto/ui/UiCurrencyPair;)V", "getCurrencyPair", "()Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "id", "", "getId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class AdvancedAlert extends CryptoDetailCard {
        public static final int $stable = 8;
        private final UiCurrencyPair currencyPair;

        public static /* synthetic */ AdvancedAlert copy$default(AdvancedAlert advancedAlert, UiCurrencyPair uiCurrencyPair, int i, Object obj) {
            if ((i & 1) != 0) {
                uiCurrencyPair = advancedAlert.currencyPair;
            }
            return advancedAlert.copy(uiCurrencyPair);
        }

        /* renamed from: component1, reason: from getter */
        public final UiCurrencyPair getCurrencyPair() {
            return this.currencyPair;
        }

        public final AdvancedAlert copy(UiCurrencyPair currencyPair) {
            Intrinsics.checkNotNullParameter(currencyPair, "currencyPair");
            return new AdvancedAlert(currencyPair);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AdvancedAlert) && Intrinsics.areEqual(this.currencyPair, ((AdvancedAlert) other).currencyPair);
        }

        public int hashCode() {
            return this.currencyPair.hashCode();
        }

        public String toString() {
            return "AdvancedAlert(currencyPair=" + this.currencyPair + ")";
        }

        public final UiCurrencyPair getCurrencyPair() {
            return this.currencyPair;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AdvancedAlert(UiCurrencyPair currencyPair) {
            super(null);
            Intrinsics.checkNotNullParameter(currencyPair, "currencyPair");
            this.currencyPair = currencyPair;
        }

        @Override // com.robinhood.android.crypto.p094ui.detail.cards.CryptoDetailCard
        public String getId() {
            return "AdvancedAlert";
        }
    }
}
