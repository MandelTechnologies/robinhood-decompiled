package com.robinhood.android.creditcard.p091ui.waitlist;

import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.gold.subscription.store.GoldSubscriptionStore;
import com.robinhood.android.lib.store.creditcard.CreditCardStore;
import com.robinhood.android.lib.store.creditcard.CreditCardWaitlistStore;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.StringPreference;
import com.robinhood.shared.store.user.UserStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;

/* compiled from: CreditCardWaitlistFragmentDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB¡\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0004\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u001b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/waitlist/CreditCardWaitlistFragmentDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/creditcard/ui/waitlist/CreditCardWaitlistFragmentDuxo;", "creditCardStore", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/store/creditcard/CreditCardStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "goldSubscriptionStore", "Lcom/robinhood/android/gold/subscription/store/GoldSubscriptionStore;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "waitlistStore", "Lcom/robinhood/android/lib/store/creditcard/CreditCardWaitlistStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "creditCardWaitlistAutoJoin", "Lcom/robinhood/prefs/BooleanPreference;", "creditCardApplicationReferralCode", "Lcom/robinhood/prefs/StringPreference;", "creditCardEntryPointSourcePref", "defaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class CreditCardWaitlistFragmentDuxo_Factory implements Factory<CreditCardWaitlistFragmentDuxo> {
    private final Provider<StringPreference> creditCardApplicationReferralCode;
    private final Provider<StringPreference> creditCardEntryPointSourcePref;
    private final Provider<CreditCardStore> creditCardStore;
    private final Provider<BooleanPreference> creditCardWaitlistAutoJoin;
    private final Provider<CoroutineDispatcher> defaultDispatcher;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<EventLogger> eventLogger;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<GoldSubscriptionStore> goldSubscriptionStore;
    private final Provider<UserStore> userStore;
    private final Provider<CreditCardWaitlistStore> waitlistStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final CreditCardWaitlistFragmentDuxo_Factory create(Provider<CreditCardStore> provider, Provider<ExperimentsStore> provider2, Provider<GoldSubscriptionStore> provider3, Provider<UserStore> provider4, Provider<CreditCardWaitlistStore> provider5, Provider<EventLogger> provider6, Provider<BooleanPreference> provider7, Provider<StringPreference> provider8, Provider<StringPreference> provider9, Provider<CoroutineDispatcher> provider10, Provider<DuxoBundle> provider11) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11);
    }

    @JvmStatic
    public static final CreditCardWaitlistFragmentDuxo newInstance(CreditCardStore creditCardStore, ExperimentsStore experimentsStore, GoldSubscriptionStore goldSubscriptionStore, UserStore userStore, CreditCardWaitlistStore creditCardWaitlistStore, EventLogger eventLogger, BooleanPreference booleanPreference, StringPreference stringPreference, StringPreference stringPreference2, CoroutineDispatcher coroutineDispatcher, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(creditCardStore, experimentsStore, goldSubscriptionStore, userStore, creditCardWaitlistStore, eventLogger, booleanPreference, stringPreference, stringPreference2, coroutineDispatcher, duxoBundle);
    }

    public CreditCardWaitlistFragmentDuxo_Factory(Provider<CreditCardStore> creditCardStore, Provider<ExperimentsStore> experimentsStore, Provider<GoldSubscriptionStore> goldSubscriptionStore, Provider<UserStore> userStore, Provider<CreditCardWaitlistStore> waitlistStore, Provider<EventLogger> eventLogger, Provider<BooleanPreference> creditCardWaitlistAutoJoin, Provider<StringPreference> creditCardApplicationReferralCode, Provider<StringPreference> creditCardEntryPointSourcePref, Provider<CoroutineDispatcher> defaultDispatcher, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(creditCardStore, "creditCardStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(goldSubscriptionStore, "goldSubscriptionStore");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(waitlistStore, "waitlistStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(creditCardWaitlistAutoJoin, "creditCardWaitlistAutoJoin");
        Intrinsics.checkNotNullParameter(creditCardApplicationReferralCode, "creditCardApplicationReferralCode");
        Intrinsics.checkNotNullParameter(creditCardEntryPointSourcePref, "creditCardEntryPointSourcePref");
        Intrinsics.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.creditCardStore = creditCardStore;
        this.experimentsStore = experimentsStore;
        this.goldSubscriptionStore = goldSubscriptionStore;
        this.userStore = userStore;
        this.waitlistStore = waitlistStore;
        this.eventLogger = eventLogger;
        this.creditCardWaitlistAutoJoin = creditCardWaitlistAutoJoin;
        this.creditCardApplicationReferralCode = creditCardApplicationReferralCode;
        this.creditCardEntryPointSourcePref = creditCardEntryPointSourcePref;
        this.defaultDispatcher = defaultDispatcher;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public CreditCardWaitlistFragmentDuxo get() {
        Companion companion = INSTANCE;
        CreditCardStore creditCardStore = this.creditCardStore.get();
        Intrinsics.checkNotNullExpressionValue(creditCardStore, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        GoldSubscriptionStore goldSubscriptionStore = this.goldSubscriptionStore.get();
        Intrinsics.checkNotNullExpressionValue(goldSubscriptionStore, "get(...)");
        UserStore userStore = this.userStore.get();
        Intrinsics.checkNotNullExpressionValue(userStore, "get(...)");
        CreditCardWaitlistStore creditCardWaitlistStore = this.waitlistStore.get();
        Intrinsics.checkNotNullExpressionValue(creditCardWaitlistStore, "get(...)");
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        BooleanPreference booleanPreference = this.creditCardWaitlistAutoJoin.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        StringPreference stringPreference = this.creditCardApplicationReferralCode.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference, "get(...)");
        StringPreference stringPreference2 = this.creditCardEntryPointSourcePref.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference2, "get(...)");
        CoroutineDispatcher coroutineDispatcher = this.defaultDispatcher.get();
        Intrinsics.checkNotNullExpressionValue(coroutineDispatcher, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(creditCardStore, experimentsStore, goldSubscriptionStore, userStore, creditCardWaitlistStore, eventLogger, booleanPreference, stringPreference, stringPreference2, coroutineDispatcher, duxoBundle);
    }

    /* compiled from: CreditCardWaitlistFragmentDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J¢\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00072\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0007H\u0007J`\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0007¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/waitlist/CreditCardWaitlistFragmentDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/creditcard/ui/waitlist/CreditCardWaitlistFragmentDuxo_Factory;", "creditCardStore", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/store/creditcard/CreditCardStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "goldSubscriptionStore", "Lcom/robinhood/android/gold/subscription/store/GoldSubscriptionStore;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "waitlistStore", "Lcom/robinhood/android/lib/store/creditcard/CreditCardWaitlistStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "creditCardWaitlistAutoJoin", "Lcom/robinhood/prefs/BooleanPreference;", "creditCardApplicationReferralCode", "Lcom/robinhood/prefs/StringPreference;", "creditCardEntryPointSourcePref", "defaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/creditcard/ui/waitlist/CreditCardWaitlistFragmentDuxo;", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CreditCardWaitlistFragmentDuxo_Factory create(Provider<CreditCardStore> creditCardStore, Provider<ExperimentsStore> experimentsStore, Provider<GoldSubscriptionStore> goldSubscriptionStore, Provider<UserStore> userStore, Provider<CreditCardWaitlistStore> waitlistStore, Provider<EventLogger> eventLogger, Provider<BooleanPreference> creditCardWaitlistAutoJoin, Provider<StringPreference> creditCardApplicationReferralCode, Provider<StringPreference> creditCardEntryPointSourcePref, Provider<CoroutineDispatcher> defaultDispatcher, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(creditCardStore, "creditCardStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(goldSubscriptionStore, "goldSubscriptionStore");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(waitlistStore, "waitlistStore");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(creditCardWaitlistAutoJoin, "creditCardWaitlistAutoJoin");
            Intrinsics.checkNotNullParameter(creditCardApplicationReferralCode, "creditCardApplicationReferralCode");
            Intrinsics.checkNotNullParameter(creditCardEntryPointSourcePref, "creditCardEntryPointSourcePref");
            Intrinsics.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new CreditCardWaitlistFragmentDuxo_Factory(creditCardStore, experimentsStore, goldSubscriptionStore, userStore, waitlistStore, eventLogger, creditCardWaitlistAutoJoin, creditCardApplicationReferralCode, creditCardEntryPointSourcePref, defaultDispatcher, duxoBundle);
        }

        @JvmStatic
        public final CreditCardWaitlistFragmentDuxo newInstance(CreditCardStore creditCardStore, ExperimentsStore experimentsStore, GoldSubscriptionStore goldSubscriptionStore, UserStore userStore, CreditCardWaitlistStore waitlistStore, EventLogger eventLogger, BooleanPreference creditCardWaitlistAutoJoin, StringPreference creditCardApplicationReferralCode, StringPreference creditCardEntryPointSourcePref, CoroutineDispatcher defaultDispatcher, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(creditCardStore, "creditCardStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(goldSubscriptionStore, "goldSubscriptionStore");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(waitlistStore, "waitlistStore");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(creditCardWaitlistAutoJoin, "creditCardWaitlistAutoJoin");
            Intrinsics.checkNotNullParameter(creditCardApplicationReferralCode, "creditCardApplicationReferralCode");
            Intrinsics.checkNotNullParameter(creditCardEntryPointSourcePref, "creditCardEntryPointSourcePref");
            Intrinsics.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new CreditCardWaitlistFragmentDuxo(creditCardStore, experimentsStore, goldSubscriptionStore, userStore, waitlistStore, eventLogger, creditCardWaitlistAutoJoin, creditCardApplicationReferralCode, creditCardEntryPointSourcePref, defaultDispatcher, duxoBundle);
        }
    }
}
