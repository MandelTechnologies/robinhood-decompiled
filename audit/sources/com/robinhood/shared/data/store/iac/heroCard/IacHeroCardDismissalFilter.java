package com.robinhood.shared.data.store.iac.heroCard;

import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.herocard.IacHeroCard;
import com.robinhood.prefs.StringToLongMapPreference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;
import p479j$.time.Duration;

/* compiled from: IacHeroCardDismissalFilter.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/shared/data/store/iac/heroCard/IacHeroCardDismissalFilter;", "", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/prefs/StringToLongMapPreference;", "iacHeroCardLastDismissMillisPref", "iacHeroCardDismissCountPref", "<init>", "(Lj$/time/Clock;Lcom/robinhood/prefs/StringToLongMapPreference;Lcom/robinhood/prefs/StringToLongMapPreference;)V", "", "cardIdentifier", "", "filterByCardIdentifier", "(Ljava/lang/String;)Z", "", "recordDismissal", "(Ljava/lang/String;)V", "Lj$/time/Clock;", "Lcom/robinhood/prefs/StringToLongMapPreference;", "lib-store-iac_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class IacHeroCardDismissalFilter {
    private final Clock clock;
    private final StringToLongMapPreference iacHeroCardDismissCountPref;
    private final StringToLongMapPreference iacHeroCardLastDismissMillisPref;

    public IacHeroCardDismissalFilter(Clock clock, @IacHeroCardPrefs2 StringToLongMapPreference iacHeroCardLastDismissMillisPref, @IacHeroCardPrefs StringToLongMapPreference iacHeroCardDismissCountPref) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(iacHeroCardLastDismissMillisPref, "iacHeroCardLastDismissMillisPref");
        Intrinsics.checkNotNullParameter(iacHeroCardDismissCountPref, "iacHeroCardDismissCountPref");
        this.clock = clock;
        this.iacHeroCardLastDismissMillisPref = iacHeroCardLastDismissMillisPref;
        this.iacHeroCardDismissCountPref = iacHeroCardDismissCountPref;
    }

    public final boolean filterByCardIdentifier(String cardIdentifier) {
        if (Intrinsics.areEqual(cardIdentifier, IacHeroCard.CRYPTO_SER_DEPOSIT_INCENTIVE_CARD)) {
            long j = this.iacHeroCardLastDismissMillisPref.get(cardIdentifier, -1L);
            return j == -1 || this.clock.millis() - j >= Duration.ofDays(7L).toMillis();
        }
        if (!Intrinsics.areEqual(cardIdentifier, IacHeroCard.CRYPTO_SER_ENGAGEMENT_CARD)) {
            return true;
        }
        long j2 = this.iacHeroCardLastDismissMillisPref.get(cardIdentifier, -1L);
        if (j2 == -1) {
            return true;
        }
        return ((((this.clock.millis() - j2) > Duration.ofDays(7L).toMillis() ? 1 : ((this.clock.millis() - j2) == Duration.ofDays(7L).toMillis() ? 0 : -1)) < 0) || ((this.iacHeroCardDismissCountPref.get(cardIdentifier, 0L) > 3L ? 1 : (this.iacHeroCardDismissCountPref.get(cardIdentifier, 0L) == 3L ? 0 : -1)) >= 0)) ? false : true;
    }

    public final void recordDismissal(String cardIdentifier) {
        if (cardIdentifier == null || cardIdentifier.length() == 0) {
            return;
        }
        this.iacHeroCardLastDismissMillisPref.set(cardIdentifier, this.clock.millis());
        StringToLongMapPreference stringToLongMapPreference = this.iacHeroCardDismissCountPref;
        stringToLongMapPreference.set(cardIdentifier, stringToLongMapPreference.get(cardIdentifier, 0L) + 1);
    }
}
