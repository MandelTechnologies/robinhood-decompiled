package com.robinhood.android.creditcard.p091ui.waitlist;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.store.creditcard.CreditCardWaitlistStore;
import com.robinhood.android.redesign.accounttab.prefs.AccountSelectorHomeManager;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.bonfire.RhyTabStateStore;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.StringPreference;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.shared.store.user.UserStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;

/* compiled from: CreditCardWaitlistActivityDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 BË\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0004\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0004\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u001f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/waitlist/CreditCardWaitlistActivityDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/creditcard/ui/waitlist/CreditCardWaitlistActivityDuxo;", "authManager", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/security/auth/AuthManager;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "rhyTabStateStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyTabStateStore;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "waitlistStore", "Lcom/robinhood/android/lib/store/creditcard/CreditCardWaitlistStore;", "accountSelectorHomeManager", "Lcom/robinhood/android/redesign/accounttab/prefs/AccountSelectorHomeManager;", "creditCardWaitlistAutoJoin", "Lcom/robinhood/prefs/BooleanPreference;", "creditCardWaitlistReferralCode", "Lcom/robinhood/prefs/StringPreference;", "creditCardApplicationReferralCode", "creditCardEntryPointSourcePref", "creditCardApplicationShowPlanSelector", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "defaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class CreditCardWaitlistActivityDuxo_Factory implements Factory<CreditCardWaitlistActivityDuxo> {
    private final Provider<AccountSelectorHomeManager> accountSelectorHomeManager;
    private final Provider<AuthManager> authManager;
    private final Provider<StringPreference> creditCardApplicationReferralCode;
    private final Provider<BooleanPreference> creditCardApplicationShowPlanSelector;
    private final Provider<StringPreference> creditCardEntryPointSourcePref;
    private final Provider<BooleanPreference> creditCardWaitlistAutoJoin;
    private final Provider<StringPreference> creditCardWaitlistReferralCode;
    private final Provider<CoroutineDispatcher> defaultDispatcher;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<RhyTabStateStore> rhyTabStateStore;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<UserStore> userStore;
    private final Provider<CreditCardWaitlistStore> waitlistStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final CreditCardWaitlistActivityDuxo_Factory create(Provider<AuthManager> provider, Provider<ExperimentsStore> provider2, Provider<RhyTabStateStore> provider3, Provider<UserStore> provider4, Provider<CreditCardWaitlistStore> provider5, Provider<AccountSelectorHomeManager> provider6, Provider<BooleanPreference> provider7, Provider<StringPreference> provider8, Provider<StringPreference> provider9, Provider<StringPreference> provider10, Provider<BooleanPreference> provider11, Provider<SavedStateHandle> provider12, Provider<CoroutineDispatcher> provider13, Provider<DuxoBundle> provider14) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14);
    }

    @JvmStatic
    public static final CreditCardWaitlistActivityDuxo newInstance(AuthManager authManager, ExperimentsStore experimentsStore, RhyTabStateStore rhyTabStateStore, UserStore userStore, CreditCardWaitlistStore creditCardWaitlistStore, AccountSelectorHomeManager accountSelectorHomeManager, BooleanPreference booleanPreference, StringPreference stringPreference, StringPreference stringPreference2, StringPreference stringPreference3, BooleanPreference booleanPreference2, SavedStateHandle savedStateHandle, CoroutineDispatcher coroutineDispatcher, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(authManager, experimentsStore, rhyTabStateStore, userStore, creditCardWaitlistStore, accountSelectorHomeManager, booleanPreference, stringPreference, stringPreference2, stringPreference3, booleanPreference2, savedStateHandle, coroutineDispatcher, duxoBundle);
    }

    public CreditCardWaitlistActivityDuxo_Factory(Provider<AuthManager> authManager, Provider<ExperimentsStore> experimentsStore, Provider<RhyTabStateStore> rhyTabStateStore, Provider<UserStore> userStore, Provider<CreditCardWaitlistStore> waitlistStore, Provider<AccountSelectorHomeManager> accountSelectorHomeManager, Provider<BooleanPreference> creditCardWaitlistAutoJoin, Provider<StringPreference> creditCardWaitlistReferralCode, Provider<StringPreference> creditCardApplicationReferralCode, Provider<StringPreference> creditCardEntryPointSourcePref, Provider<BooleanPreference> creditCardApplicationShowPlanSelector, Provider<SavedStateHandle> savedStateHandle, Provider<CoroutineDispatcher> defaultDispatcher, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(rhyTabStateStore, "rhyTabStateStore");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(waitlistStore, "waitlistStore");
        Intrinsics.checkNotNullParameter(accountSelectorHomeManager, "accountSelectorHomeManager");
        Intrinsics.checkNotNullParameter(creditCardWaitlistAutoJoin, "creditCardWaitlistAutoJoin");
        Intrinsics.checkNotNullParameter(creditCardWaitlistReferralCode, "creditCardWaitlistReferralCode");
        Intrinsics.checkNotNullParameter(creditCardApplicationReferralCode, "creditCardApplicationReferralCode");
        Intrinsics.checkNotNullParameter(creditCardEntryPointSourcePref, "creditCardEntryPointSourcePref");
        Intrinsics.checkNotNullParameter(creditCardApplicationShowPlanSelector, "creditCardApplicationShowPlanSelector");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.authManager = authManager;
        this.experimentsStore = experimentsStore;
        this.rhyTabStateStore = rhyTabStateStore;
        this.userStore = userStore;
        this.waitlistStore = waitlistStore;
        this.accountSelectorHomeManager = accountSelectorHomeManager;
        this.creditCardWaitlistAutoJoin = creditCardWaitlistAutoJoin;
        this.creditCardWaitlistReferralCode = creditCardWaitlistReferralCode;
        this.creditCardApplicationReferralCode = creditCardApplicationReferralCode;
        this.creditCardEntryPointSourcePref = creditCardEntryPointSourcePref;
        this.creditCardApplicationShowPlanSelector = creditCardApplicationShowPlanSelector;
        this.savedStateHandle = savedStateHandle;
        this.defaultDispatcher = defaultDispatcher;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public CreditCardWaitlistActivityDuxo get() {
        Companion companion = INSTANCE;
        AuthManager authManager = this.authManager.get();
        Intrinsics.checkNotNullExpressionValue(authManager, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        RhyTabStateStore rhyTabStateStore = this.rhyTabStateStore.get();
        Intrinsics.checkNotNullExpressionValue(rhyTabStateStore, "get(...)");
        UserStore userStore = this.userStore.get();
        Intrinsics.checkNotNullExpressionValue(userStore, "get(...)");
        CreditCardWaitlistStore creditCardWaitlistStore = this.waitlistStore.get();
        Intrinsics.checkNotNullExpressionValue(creditCardWaitlistStore, "get(...)");
        AccountSelectorHomeManager accountSelectorHomeManager = this.accountSelectorHomeManager.get();
        Intrinsics.checkNotNullExpressionValue(accountSelectorHomeManager, "get(...)");
        BooleanPreference booleanPreference = this.creditCardWaitlistAutoJoin.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        StringPreference stringPreference = this.creditCardWaitlistReferralCode.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference, "get(...)");
        StringPreference stringPreference2 = this.creditCardApplicationReferralCode.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference2, "get(...)");
        StringPreference stringPreference3 = this.creditCardEntryPointSourcePref.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference3, "get(...)");
        BooleanPreference booleanPreference2 = this.creditCardApplicationShowPlanSelector.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference2, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        CoroutineDispatcher coroutineDispatcher = this.defaultDispatcher.get();
        Intrinsics.checkNotNullExpressionValue(coroutineDispatcher, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(authManager, experimentsStore, rhyTabStateStore, userStore, creditCardWaitlistStore, accountSelectorHomeManager, booleanPreference, stringPreference, stringPreference2, stringPreference3, booleanPreference2, savedStateHandle, coroutineDispatcher, duxoBundle);
    }

    /* compiled from: CreditCardWaitlistActivityDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JÌ\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00072\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00072\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0007H\u0007Jx\u0010 \u001a\u00020!2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0007¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/waitlist/CreditCardWaitlistActivityDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/creditcard/ui/waitlist/CreditCardWaitlistActivityDuxo_Factory;", "authManager", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/security/auth/AuthManager;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "rhyTabStateStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyTabStateStore;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "waitlistStore", "Lcom/robinhood/android/lib/store/creditcard/CreditCardWaitlistStore;", "accountSelectorHomeManager", "Lcom/robinhood/android/redesign/accounttab/prefs/AccountSelectorHomeManager;", "creditCardWaitlistAutoJoin", "Lcom/robinhood/prefs/BooleanPreference;", "creditCardWaitlistReferralCode", "Lcom/robinhood/prefs/StringPreference;", "creditCardApplicationReferralCode", "creditCardEntryPointSourcePref", "creditCardApplicationShowPlanSelector", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "defaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/creditcard/ui/waitlist/CreditCardWaitlistActivityDuxo;", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CreditCardWaitlistActivityDuxo_Factory create(Provider<AuthManager> authManager, Provider<ExperimentsStore> experimentsStore, Provider<RhyTabStateStore> rhyTabStateStore, Provider<UserStore> userStore, Provider<CreditCardWaitlistStore> waitlistStore, Provider<AccountSelectorHomeManager> accountSelectorHomeManager, Provider<BooleanPreference> creditCardWaitlistAutoJoin, Provider<StringPreference> creditCardWaitlistReferralCode, Provider<StringPreference> creditCardApplicationReferralCode, Provider<StringPreference> creditCardEntryPointSourcePref, Provider<BooleanPreference> creditCardApplicationShowPlanSelector, Provider<SavedStateHandle> savedStateHandle, Provider<CoroutineDispatcher> defaultDispatcher, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(authManager, "authManager");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(rhyTabStateStore, "rhyTabStateStore");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(waitlistStore, "waitlistStore");
            Intrinsics.checkNotNullParameter(accountSelectorHomeManager, "accountSelectorHomeManager");
            Intrinsics.checkNotNullParameter(creditCardWaitlistAutoJoin, "creditCardWaitlistAutoJoin");
            Intrinsics.checkNotNullParameter(creditCardWaitlistReferralCode, "creditCardWaitlistReferralCode");
            Intrinsics.checkNotNullParameter(creditCardApplicationReferralCode, "creditCardApplicationReferralCode");
            Intrinsics.checkNotNullParameter(creditCardEntryPointSourcePref, "creditCardEntryPointSourcePref");
            Intrinsics.checkNotNullParameter(creditCardApplicationShowPlanSelector, "creditCardApplicationShowPlanSelector");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new CreditCardWaitlistActivityDuxo_Factory(authManager, experimentsStore, rhyTabStateStore, userStore, waitlistStore, accountSelectorHomeManager, creditCardWaitlistAutoJoin, creditCardWaitlistReferralCode, creditCardApplicationReferralCode, creditCardEntryPointSourcePref, creditCardApplicationShowPlanSelector, savedStateHandle, defaultDispatcher, duxoBundle);
        }

        @JvmStatic
        public final CreditCardWaitlistActivityDuxo newInstance(AuthManager authManager, ExperimentsStore experimentsStore, RhyTabStateStore rhyTabStateStore, UserStore userStore, CreditCardWaitlistStore waitlistStore, AccountSelectorHomeManager accountSelectorHomeManager, BooleanPreference creditCardWaitlistAutoJoin, StringPreference creditCardWaitlistReferralCode, StringPreference creditCardApplicationReferralCode, StringPreference creditCardEntryPointSourcePref, BooleanPreference creditCardApplicationShowPlanSelector, SavedStateHandle savedStateHandle, CoroutineDispatcher defaultDispatcher, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(authManager, "authManager");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(rhyTabStateStore, "rhyTabStateStore");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(waitlistStore, "waitlistStore");
            Intrinsics.checkNotNullParameter(accountSelectorHomeManager, "accountSelectorHomeManager");
            Intrinsics.checkNotNullParameter(creditCardWaitlistAutoJoin, "creditCardWaitlistAutoJoin");
            Intrinsics.checkNotNullParameter(creditCardWaitlistReferralCode, "creditCardWaitlistReferralCode");
            Intrinsics.checkNotNullParameter(creditCardApplicationReferralCode, "creditCardApplicationReferralCode");
            Intrinsics.checkNotNullParameter(creditCardEntryPointSourcePref, "creditCardEntryPointSourcePref");
            Intrinsics.checkNotNullParameter(creditCardApplicationShowPlanSelector, "creditCardApplicationShowPlanSelector");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new CreditCardWaitlistActivityDuxo(authManager, experimentsStore, rhyTabStateStore, userStore, waitlistStore, accountSelectorHomeManager, creditCardWaitlistAutoJoin, creditCardWaitlistReferralCode, creditCardApplicationReferralCode, creditCardEntryPointSourcePref, creditCardApplicationShowPlanSelector, savedStateHandle, defaultDispatcher, duxoBundle);
        }
    }
}
