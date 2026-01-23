package com.robinhood.android.slip.lib;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.librobinhood.data.store.bonfire.slip.SlipUpdatedAgreementsStore;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.prefs.LongPreference;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: SlipUpdatedAgreementManager_Factory.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B?\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000fR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000fR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000fR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000f¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/slip/lib/SlipUpdatedAgreementManager_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/slip/lib/SlipUpdatedAgreementManager;", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/bonfire/slip/SlipUpdatedAgreementsStore;", "slipUpdatedAgreementsStore", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/prefs/LongPreference;", "lastTimePromptedToUpdateSlipAgreement", "slipAgreementPromptPeriod", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "()Lcom/robinhood/android/slip/lib/SlipUpdatedAgreementManager;", "Ljavax/inject/Provider;", "Companion", "feature-lib-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class SlipUpdatedAgreementManager_Factory implements Factory<SlipUpdatedAgreementManager> {
    private final Provider<Clock> clock;
    private final Provider<LongPreference> lastTimePromptedToUpdateSlipAgreement;
    private final Provider<LongPreference> slipAgreementPromptPeriod;
    private final Provider<SlipUpdatedAgreementsStore> slipUpdatedAgreementsStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final SlipUpdatedAgreementManager_Factory create(Provider<SlipUpdatedAgreementsStore> provider, Provider<Clock> provider2, Provider<LongPreference> provider3, Provider<LongPreference> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final SlipUpdatedAgreementManager newInstance(SlipUpdatedAgreementsStore slipUpdatedAgreementsStore, Clock clock, LongPreference longPreference, LongPreference longPreference2) {
        return INSTANCE.newInstance(slipUpdatedAgreementsStore, clock, longPreference, longPreference2);
    }

    public SlipUpdatedAgreementManager_Factory(Provider<SlipUpdatedAgreementsStore> slipUpdatedAgreementsStore, Provider<Clock> clock, Provider<LongPreference> lastTimePromptedToUpdateSlipAgreement, Provider<LongPreference> slipAgreementPromptPeriod) {
        Intrinsics.checkNotNullParameter(slipUpdatedAgreementsStore, "slipUpdatedAgreementsStore");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(lastTimePromptedToUpdateSlipAgreement, "lastTimePromptedToUpdateSlipAgreement");
        Intrinsics.checkNotNullParameter(slipAgreementPromptPeriod, "slipAgreementPromptPeriod");
        this.slipUpdatedAgreementsStore = slipUpdatedAgreementsStore;
        this.clock = clock;
        this.lastTimePromptedToUpdateSlipAgreement = lastTimePromptedToUpdateSlipAgreement;
        this.slipAgreementPromptPeriod = slipAgreementPromptPeriod;
    }

    @Override // javax.inject.Provider
    public SlipUpdatedAgreementManager get() {
        Companion companion = INSTANCE;
        SlipUpdatedAgreementsStore slipUpdatedAgreementsStore = this.slipUpdatedAgreementsStore.get();
        Intrinsics.checkNotNullExpressionValue(slipUpdatedAgreementsStore, "get(...)");
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        LongPreference longPreference = this.lastTimePromptedToUpdateSlipAgreement.get();
        Intrinsics.checkNotNullExpressionValue(longPreference, "get(...)");
        LongPreference longPreference2 = this.slipAgreementPromptPeriod.get();
        Intrinsics.checkNotNullExpressionValue(longPreference2, "get(...)");
        return companion.newInstance(slipUpdatedAgreementsStore, clock, longPreference, longPreference2);
    }

    /* compiled from: SlipUpdatedAgreementManager_Factory.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\r\u001a\u00020\f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/slip/lib/SlipUpdatedAgreementManager_Factory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/bonfire/slip/SlipUpdatedAgreementsStore;", "slipUpdatedAgreementsStore", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/prefs/LongPreference;", "lastTimePromptedToUpdateSlipAgreement", "slipAgreementPromptPeriod", "Lcom/robinhood/android/slip/lib/SlipUpdatedAgreementManager_Factory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/robinhood/android/slip/lib/SlipUpdatedAgreementManager_Factory;", "Lcom/robinhood/android/slip/lib/SlipUpdatedAgreementManager;", "newInstance", "(Lcom/robinhood/librobinhood/data/store/bonfire/slip/SlipUpdatedAgreementsStore;Lj$/time/Clock;Lcom/robinhood/prefs/LongPreference;Lcom/robinhood/prefs/LongPreference;)Lcom/robinhood/android/slip/lib/SlipUpdatedAgreementManager;", "feature-lib-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final SlipUpdatedAgreementManager_Factory create(Provider<SlipUpdatedAgreementsStore> slipUpdatedAgreementsStore, Provider<Clock> clock, Provider<LongPreference> lastTimePromptedToUpdateSlipAgreement, Provider<LongPreference> slipAgreementPromptPeriod) {
            Intrinsics.checkNotNullParameter(slipUpdatedAgreementsStore, "slipUpdatedAgreementsStore");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(lastTimePromptedToUpdateSlipAgreement, "lastTimePromptedToUpdateSlipAgreement");
            Intrinsics.checkNotNullParameter(slipAgreementPromptPeriod, "slipAgreementPromptPeriod");
            return new SlipUpdatedAgreementManager_Factory(slipUpdatedAgreementsStore, clock, lastTimePromptedToUpdateSlipAgreement, slipAgreementPromptPeriod);
        }

        @JvmStatic
        public final SlipUpdatedAgreementManager newInstance(SlipUpdatedAgreementsStore slipUpdatedAgreementsStore, Clock clock, LongPreference lastTimePromptedToUpdateSlipAgreement, LongPreference slipAgreementPromptPeriod) {
            Intrinsics.checkNotNullParameter(slipUpdatedAgreementsStore, "slipUpdatedAgreementsStore");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(lastTimePromptedToUpdateSlipAgreement, "lastTimePromptedToUpdateSlipAgreement");
            Intrinsics.checkNotNullParameter(slipAgreementPromptPeriod, "slipAgreementPromptPeriod");
            return new SlipUpdatedAgreementManager(slipUpdatedAgreementsStore, clock, lastTimePromptedToUpdateSlipAgreement, slipAgreementPromptPeriod);
        }
    }
}
