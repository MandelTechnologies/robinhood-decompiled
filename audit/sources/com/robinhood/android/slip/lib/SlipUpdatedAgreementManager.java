package com.robinhood.android.slip.lib;

import com.robinhood.android.slip.lib.prefs.LastTimePromptedToUpdateSlipAgreement;
import com.robinhood.android.slip.lib.prefs.SlipAgreementPromptPeriod;
import com.robinhood.librobinhood.data.store.bonfire.slip.SlipUpdatedAgreementsStore;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p355ui.UiUpdatedAgreementsResponse;
import com.robinhood.prefs.LongPreference;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.datetime.Durations;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;
import p479j$.time.Duration;

/* compiled from: SlipUpdatedAgreementManager.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B-\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0018¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/slip/lib/SlipUpdatedAgreementManager;", "", "Lcom/robinhood/librobinhood/data/store/bonfire/slip/SlipUpdatedAgreementsStore;", "slipUpdatedAgreementsStore", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/prefs/LongPreference;", "lastTimePromptedToUpdateSlipAgreement", "slipAgreementPromptPeriod", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/slip/SlipUpdatedAgreementsStore;Lj$/time/Clock;Lcom/robinhood/prefs/LongPreference;Lcom/robinhood/prefs/LongPreference;)V", "", "hasPromptPeriodPassed", "()Z", "", "onAgreementSeen", "()V", "Lio/reactivex/Single;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/ui/UiUpdatedAgreementsResponse;", "getAgreementsToSign", "()Lio/reactivex/Single;", "Lcom/robinhood/librobinhood/data/store/bonfire/slip/SlipUpdatedAgreementsStore;", "Lj$/time/Clock;", "Lcom/robinhood/prefs/LongPreference;", "Companion", "feature-lib-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class SlipUpdatedAgreementManager {
    private final Clock clock;
    private final LongPreference lastTimePromptedToUpdateSlipAgreement;
    private final LongPreference slipAgreementPromptPeriod;
    private final SlipUpdatedAgreementsStore slipUpdatedAgreementsStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final long DEFAULT_PROMPT_PERIOD = Durations.ONE_WEEK.toMillis();

    public SlipUpdatedAgreementManager(SlipUpdatedAgreementsStore slipUpdatedAgreementsStore, Clock clock, @LastTimePromptedToUpdateSlipAgreement LongPreference lastTimePromptedToUpdateSlipAgreement, @SlipAgreementPromptPeriod LongPreference slipAgreementPromptPeriod) {
        Intrinsics.checkNotNullParameter(slipUpdatedAgreementsStore, "slipUpdatedAgreementsStore");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(lastTimePromptedToUpdateSlipAgreement, "lastTimePromptedToUpdateSlipAgreement");
        Intrinsics.checkNotNullParameter(slipAgreementPromptPeriod, "slipAgreementPromptPeriod");
        this.slipUpdatedAgreementsStore = slipUpdatedAgreementsStore;
        this.clock = clock;
        this.lastTimePromptedToUpdateSlipAgreement = lastTimePromptedToUpdateSlipAgreement;
        this.slipAgreementPromptPeriod = slipAgreementPromptPeriod;
    }

    public final void onAgreementSeen() {
        this.lastTimePromptedToUpdateSlipAgreement.set(this.clock.millis());
    }

    public final Single<Optional<UiUpdatedAgreementsResponse>> getAgreementsToSign() {
        Single<Optional<UiUpdatedAgreementsResponse>> singleDoOnSuccess = Observable.just(Boolean.valueOf(hasPromptPeriodPassed())).flatMapSingle(new Function() { // from class: com.robinhood.android.slip.lib.SlipUpdatedAgreementManager.getAgreementsToSign.1
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends Optional<UiUpdatedAgreementsResponse>> apply(Boolean promptPeriodHasPassed) {
                Intrinsics.checkNotNullParameter(promptPeriodHasPassed, "promptPeriodHasPassed");
                if (promptPeriodHasPassed.booleanValue()) {
                    return SlipUpdatedAgreementManager.this.slipUpdatedAgreementsStore.forceFetchUpdatedAgreementsIfNotCached();
                }
                Single singleJust = Single.just(Optional2.INSTANCE);
                Intrinsics.checkNotNull(singleJust);
                return singleJust;
            }
        }).first(Optional2.INSTANCE).doOnSuccess(new Consumer() { // from class: com.robinhood.android.slip.lib.SlipUpdatedAgreementManager.getAgreementsToSign.2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Optional<UiUpdatedAgreementsResponse> optional) {
                UiUpdatedAgreementsResponse uiUpdatedAgreementsResponseComponent1 = optional.component1();
                if (uiUpdatedAgreementsResponseComponent1 != null) {
                    if (uiUpdatedAgreementsResponseComponent1.getUpdatedAgreements().isEmpty()) {
                        SlipUpdatedAgreementManager.this.lastTimePromptedToUpdateSlipAgreement.set(SlipUpdatedAgreementManager.this.clock.millis());
                    }
                    SlipUpdatedAgreementManager.this.slipAgreementPromptPeriod.set(uiUpdatedAgreementsResponseComponent1.getRefreshPeriodMs());
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleDoOnSuccess, "doOnSuccess(...)");
        return singleDoOnSuccess;
    }

    private final boolean hasPromptPeriodPassed() {
        Long orNull = this.lastTimePromptedToUpdateSlipAgreement.getOrNull();
        if (orNull == null) {
            return true;
        }
        long jLongValue = orNull.longValue();
        Long orNull2 = this.slipAgreementPromptPeriod.getOrNull();
        return Duration.ofMillis(this.clock.millis() - jLongValue).compareTo(Duration.ofMillis(orNull2 != null ? orNull2.longValue() : DEFAULT_PROMPT_PERIOD)) > 0;
    }

    /* compiled from: SlipUpdatedAgreementManager.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/slip/lib/SlipUpdatedAgreementManager$Companion;", "", "<init>", "()V", "DEFAULT_PROMPT_PERIOD", "", "getDEFAULT_PROMPT_PERIOD", "()J", "feature-lib-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final long getDEFAULT_PROMPT_PERIOD() {
            return SlipUpdatedAgreementManager.DEFAULT_PROMPT_PERIOD;
        }
    }
}
