package com.robinhood.android.crypto.p094ui.detail.cards;

import com.robinhood.android.crypto.C12757R;
import com.robinhood.android.crypto.p094ui.detail.cards.CryptoDetailCard;
import com.robinhood.android.crypto.p094ui.detail.cards.CryptoDetailCardDataState2;
import com.robinhood.android.newsfeed.models.breakingnews.p199db.BreakingNews;
import com.robinhood.librobinhood.data.store.CardsToInvalidate;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.p320db.herocard.IacHeroCard;
import com.robinhood.shared.models.api.bonfire.education.ApiEducationEarnability;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoDetailCardDataState.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001fJ\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005HÆ\u0003J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005HÆ\u0003J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u000eHÆ\u0003Jg\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00052\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00052\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010'\u001a\u00020\u000e2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020,HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0018R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006-"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/cards/CryptoDetailCardDataState;", "", "currencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "breakingNewsState", "Lcom/robinhood/android/crypto/ui/detail/cards/CardState;", "Lcom/robinhood/android/newsfeed/models/breakingnews/db/BreakingNews;", "iacHeroState", "Lcom/robinhood/models/db/herocard/IacHeroCard;", "advancedAlertState", "", "learnAndEarnState", "Lcom/robinhood/shared/models/api/bonfire/education/ApiEducationEarnability;", "isDismissed", "", "<init>", "(Lcom/robinhood/models/crypto/ui/UiCurrencyPair;Lcom/robinhood/android/crypto/ui/detail/cards/CardState;Lcom/robinhood/android/crypto/ui/detail/cards/CardState;Lcom/robinhood/android/crypto/ui/detail/cards/CardState;Lcom/robinhood/android/crypto/ui/detail/cards/CardState;Z)V", "getCurrencyPair", "()Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "getBreakingNewsState", "()Lcom/robinhood/android/crypto/ui/detail/cards/CardState;", "getIacHeroState", "getAdvancedAlertState", "getLearnAndEarnState", "()Z", "card", "Lcom/robinhood/android/crypto/ui/detail/cards/CryptoDetailCard;", "getCard", "()Lcom/robinhood/android/crypto/ui/detail/cards/CryptoDetailCard;", "invalidateIacHeroCard", "cardsToInvalidate", "Lcom/robinhood/librobinhood/data/store/CardsToInvalidate;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CryptoDetailCardDataState {
    public static final int $stable = 8;
    private final CryptoDetailCardDataState2<Unit> advancedAlertState;
    private final CryptoDetailCardDataState2<BreakingNews> breakingNewsState;
    private final UiCurrencyPair currencyPair;
    private final CryptoDetailCardDataState2<IacHeroCard> iacHeroState;
    private final boolean isDismissed;
    private final CryptoDetailCardDataState2<ApiEducationEarnability> learnAndEarnState;

    public CryptoDetailCardDataState() {
        this(null, null, null, null, null, false, 63, null);
    }

    public static /* synthetic */ CryptoDetailCardDataState copy$default(CryptoDetailCardDataState cryptoDetailCardDataState, UiCurrencyPair uiCurrencyPair, CryptoDetailCardDataState2 cryptoDetailCardDataState2, CryptoDetailCardDataState2 cryptoDetailCardDataState22, CryptoDetailCardDataState2 cryptoDetailCardDataState23, CryptoDetailCardDataState2 cryptoDetailCardDataState24, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            uiCurrencyPair = cryptoDetailCardDataState.currencyPair;
        }
        if ((i & 2) != 0) {
            cryptoDetailCardDataState2 = cryptoDetailCardDataState.breakingNewsState;
        }
        if ((i & 4) != 0) {
            cryptoDetailCardDataState22 = cryptoDetailCardDataState.iacHeroState;
        }
        if ((i & 8) != 0) {
            cryptoDetailCardDataState23 = cryptoDetailCardDataState.advancedAlertState;
        }
        if ((i & 16) != 0) {
            cryptoDetailCardDataState24 = cryptoDetailCardDataState.learnAndEarnState;
        }
        if ((i & 32) != 0) {
            z = cryptoDetailCardDataState.isDismissed;
        }
        CryptoDetailCardDataState2 cryptoDetailCardDataState25 = cryptoDetailCardDataState24;
        boolean z2 = z;
        return cryptoDetailCardDataState.copy(uiCurrencyPair, cryptoDetailCardDataState2, cryptoDetailCardDataState22, cryptoDetailCardDataState23, cryptoDetailCardDataState25, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final UiCurrencyPair getCurrencyPair() {
        return this.currencyPair;
    }

    public final CryptoDetailCardDataState2<BreakingNews> component2() {
        return this.breakingNewsState;
    }

    public final CryptoDetailCardDataState2<IacHeroCard> component3() {
        return this.iacHeroState;
    }

    public final CryptoDetailCardDataState2<Unit> component4() {
        return this.advancedAlertState;
    }

    public final CryptoDetailCardDataState2<ApiEducationEarnability> component5() {
        return this.learnAndEarnState;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsDismissed() {
        return this.isDismissed;
    }

    public final CryptoDetailCardDataState copy(UiCurrencyPair currencyPair, CryptoDetailCardDataState2<BreakingNews> breakingNewsState, CryptoDetailCardDataState2<IacHeroCard> iacHeroState, CryptoDetailCardDataState2<Unit> advancedAlertState, CryptoDetailCardDataState2<ApiEducationEarnability> learnAndEarnState, boolean isDismissed) {
        return new CryptoDetailCardDataState(currencyPair, breakingNewsState, iacHeroState, advancedAlertState, learnAndEarnState, isDismissed);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoDetailCardDataState)) {
            return false;
        }
        CryptoDetailCardDataState cryptoDetailCardDataState = (CryptoDetailCardDataState) other;
        return Intrinsics.areEqual(this.currencyPair, cryptoDetailCardDataState.currencyPair) && Intrinsics.areEqual(this.breakingNewsState, cryptoDetailCardDataState.breakingNewsState) && Intrinsics.areEqual(this.iacHeroState, cryptoDetailCardDataState.iacHeroState) && Intrinsics.areEqual(this.advancedAlertState, cryptoDetailCardDataState.advancedAlertState) && Intrinsics.areEqual(this.learnAndEarnState, cryptoDetailCardDataState.learnAndEarnState) && this.isDismissed == cryptoDetailCardDataState.isDismissed;
    }

    public int hashCode() {
        UiCurrencyPair uiCurrencyPair = this.currencyPair;
        int iHashCode = (uiCurrencyPair == null ? 0 : uiCurrencyPair.hashCode()) * 31;
        CryptoDetailCardDataState2<BreakingNews> cryptoDetailCardDataState2 = this.breakingNewsState;
        int iHashCode2 = (iHashCode + (cryptoDetailCardDataState2 == null ? 0 : cryptoDetailCardDataState2.hashCode())) * 31;
        CryptoDetailCardDataState2<IacHeroCard> cryptoDetailCardDataState22 = this.iacHeroState;
        int iHashCode3 = (iHashCode2 + (cryptoDetailCardDataState22 == null ? 0 : cryptoDetailCardDataState22.hashCode())) * 31;
        CryptoDetailCardDataState2<Unit> cryptoDetailCardDataState23 = this.advancedAlertState;
        int iHashCode4 = (iHashCode3 + (cryptoDetailCardDataState23 == null ? 0 : cryptoDetailCardDataState23.hashCode())) * 31;
        CryptoDetailCardDataState2<ApiEducationEarnability> cryptoDetailCardDataState24 = this.learnAndEarnState;
        return ((iHashCode4 + (cryptoDetailCardDataState24 != null ? cryptoDetailCardDataState24.hashCode() : 0)) * 31) + Boolean.hashCode(this.isDismissed);
    }

    public String toString() {
        return "CryptoDetailCardDataState(currencyPair=" + this.currencyPair + ", breakingNewsState=" + this.breakingNewsState + ", iacHeroState=" + this.iacHeroState + ", advancedAlertState=" + this.advancedAlertState + ", learnAndEarnState=" + this.learnAndEarnState + ", isDismissed=" + this.isDismissed + ")";
    }

    public CryptoDetailCardDataState(UiCurrencyPair uiCurrencyPair, CryptoDetailCardDataState2<BreakingNews> cryptoDetailCardDataState2, CryptoDetailCardDataState2<IacHeroCard> cryptoDetailCardDataState22, CryptoDetailCardDataState2<Unit> cryptoDetailCardDataState23, CryptoDetailCardDataState2<ApiEducationEarnability> cryptoDetailCardDataState24, boolean z) {
        this.currencyPair = uiCurrencyPair;
        this.breakingNewsState = cryptoDetailCardDataState2;
        this.iacHeroState = cryptoDetailCardDataState22;
        this.advancedAlertState = cryptoDetailCardDataState23;
        this.learnAndEarnState = cryptoDetailCardDataState24;
        this.isDismissed = z;
    }

    public /* synthetic */ CryptoDetailCardDataState(UiCurrencyPair uiCurrencyPair, CryptoDetailCardDataState2 cryptoDetailCardDataState2, CryptoDetailCardDataState2 cryptoDetailCardDataState22, CryptoDetailCardDataState2 cryptoDetailCardDataState23, CryptoDetailCardDataState2 cryptoDetailCardDataState24, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uiCurrencyPair, (i & 2) != 0 ? null : cryptoDetailCardDataState2, (i & 4) != 0 ? null : cryptoDetailCardDataState22, (i & 8) != 0 ? null : cryptoDetailCardDataState23, (i & 16) != 0 ? null : cryptoDetailCardDataState24, (i & 32) != 0 ? false : z);
    }

    public final UiCurrencyPair getCurrencyPair() {
        return this.currencyPair;
    }

    public final CryptoDetailCardDataState2<BreakingNews> getBreakingNewsState() {
        return this.breakingNewsState;
    }

    public final CryptoDetailCardDataState2<IacHeroCard> getIacHeroState() {
        return this.iacHeroState;
    }

    public final CryptoDetailCardDataState2<Unit> getAdvancedAlertState() {
        return this.advancedAlertState;
    }

    public final CryptoDetailCardDataState2<ApiEducationEarnability> getLearnAndEarnState() {
        return this.learnAndEarnState;
    }

    public final boolean isDismissed() {
        return this.isDismissed;
    }

    public final CryptoDetailCard getCard() {
        Integer numValueOf = null;
        if (this.currencyPair == null || this.isDismissed) {
            return null;
        }
        CryptoDetailCardDataState2<BreakingNews> cryptoDetailCardDataState2 = this.breakingNewsState;
        if (cryptoDetailCardDataState2 instanceof CryptoDetailCardDataState2.Loaded) {
            return new CryptoDetailCard.BreakingNews((BreakingNews) ((CryptoDetailCardDataState2.Loaded) this.breakingNewsState).getCard());
        }
        if (cryptoDetailCardDataState2 == null) {
            return null;
        }
        CryptoDetailCardDataState2<IacHeroCard> cryptoDetailCardDataState22 = this.iacHeroState;
        if (cryptoDetailCardDataState22 instanceof CryptoDetailCardDataState2.Loaded) {
            return new CryptoDetailCard.IacHero(this.currencyPair.getId(), (IacHeroCard) ((CryptoDetailCardDataState2.Loaded) this.iacHeroState).getCard());
        }
        if (cryptoDetailCardDataState22 == null) {
            return null;
        }
        CryptoDetailCardDataState2<ApiEducationEarnability> cryptoDetailCardDataState23 = this.learnAndEarnState;
        if (cryptoDetailCardDataState23 instanceof CryptoDetailCardDataState2.Loaded) {
            String banner_text = ((ApiEducationEarnability) ((CryptoDetailCardDataState2.Loaded) this.learnAndEarnState).getCard()).getBanner_text();
            String lesson_id = ((ApiEducationEarnability) ((CryptoDetailCardDataState2.Loaded) this.learnAndEarnState).getCard()).getLesson_id();
            String upperCase = ((ApiEducationEarnability) ((CryptoDetailCardDataState2.Loaded) this.learnAndEarnState).getCard()).getCurrency_code().toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            if (Intrinsics.areEqual(upperCase, "AVAX")) {
                numValueOf = Integer.valueOf(C12757R.drawable.learn_and_earn_avax);
            } else if (Intrinsics.areEqual(upperCase, "USDC")) {
                numValueOf = Integer.valueOf(C12757R.drawable.learn_and_earn_usdc);
            }
            return new CryptoDetailCard.LearnAndEarn(banner_text, lesson_id, numValueOf);
        }
        if (cryptoDetailCardDataState23 != null && (this.advancedAlertState instanceof CryptoDetailCardDataState2.Loaded)) {
            return new CryptoDetailCard.AdvancedAlert(this.currencyPair);
        }
        return null;
    }

    public final CryptoDetailCardDataState invalidateIacHeroCard(CardsToInvalidate cardsToInvalidate) {
        IacHeroCard iacHeroCard;
        Intrinsics.checkNotNullParameter(cardsToInvalidate, "cardsToInvalidate");
        CryptoDetailCardDataState2<IacHeroCard> cryptoDetailCardDataState2 = this.iacHeroState;
        String cardIdentifier = null;
        CryptoDetailCardDataState2.Loaded loaded = cryptoDetailCardDataState2 instanceof CryptoDetailCardDataState2.Loaded ? (CryptoDetailCardDataState2.Loaded) cryptoDetailCardDataState2 : null;
        if (loaded != null && (iacHeroCard = (IacHeroCard) loaded.getCard()) != null) {
            cardIdentifier = iacHeroCard.getCardIdentifier();
        }
        return CollectionsKt.contains(cardsToInvalidate.getCardIdentifiers(), cardIdentifier) ? copy$default(this, null, null, null, null, null, false, 59, null) : this;
    }
}
