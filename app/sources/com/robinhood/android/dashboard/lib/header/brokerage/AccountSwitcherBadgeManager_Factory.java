package com.robinhood.android.dashboard.lib.header.brokerage;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.prefs.StringToBooleanMapPreference;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountSwitcherBadgeManager_Factory.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/dashboard/lib/header/brokerage/AccountSwitcherBadgeManager_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/dashboard/lib/header/brokerage/AccountSwitcherBadgeManager;", "accountSwitcherBadgeInteractionMap", "Ljavax/inject/Provider;", "Lcom/robinhood/prefs/StringToBooleanMapPreference;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "lib-account-home_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class AccountSwitcherBadgeManager_Factory implements Factory<AccountSwitcherBadgeManager> {
    private final Provider<StringToBooleanMapPreference> accountSwitcherBadgeInteractionMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final AccountSwitcherBadgeManager_Factory create(Provider<StringToBooleanMapPreference> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final AccountSwitcherBadgeManager newInstance(StringToBooleanMapPreference stringToBooleanMapPreference) {
        return INSTANCE.newInstance(stringToBooleanMapPreference);
    }

    public AccountSwitcherBadgeManager_Factory(Provider<StringToBooleanMapPreference> accountSwitcherBadgeInteractionMap) {
        Intrinsics.checkNotNullParameter(accountSwitcherBadgeInteractionMap, "accountSwitcherBadgeInteractionMap");
        this.accountSwitcherBadgeInteractionMap = accountSwitcherBadgeInteractionMap;
    }

    @Override // javax.inject.Provider
    public AccountSwitcherBadgeManager get() {
        Companion companion = INSTANCE;
        StringToBooleanMapPreference stringToBooleanMapPreference = this.accountSwitcherBadgeInteractionMap.get();
        Intrinsics.checkNotNullExpressionValue(stringToBooleanMapPreference, "get(...)");
        return companion.newInstance(stringToBooleanMapPreference);
    }

    /* compiled from: AccountSwitcherBadgeManager_Factory.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\bH\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/dashboard/lib/header/brokerage/AccountSwitcherBadgeManager_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/dashboard/lib/header/brokerage/AccountSwitcherBadgeManager_Factory;", "accountSwitcherBadgeInteractionMap", "Ljavax/inject/Provider;", "Lcom/robinhood/prefs/StringToBooleanMapPreference;", "newInstance", "Lcom/robinhood/android/dashboard/lib/header/brokerage/AccountSwitcherBadgeManager;", "lib-account-home_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AccountSwitcherBadgeManager_Factory create(Provider<StringToBooleanMapPreference> accountSwitcherBadgeInteractionMap) {
            Intrinsics.checkNotNullParameter(accountSwitcherBadgeInteractionMap, "accountSwitcherBadgeInteractionMap");
            return new AccountSwitcherBadgeManager_Factory(accountSwitcherBadgeInteractionMap);
        }

        @JvmStatic
        public final AccountSwitcherBadgeManager newInstance(StringToBooleanMapPreference accountSwitcherBadgeInteractionMap) {
            Intrinsics.checkNotNullParameter(accountSwitcherBadgeInteractionMap, "accountSwitcherBadgeInteractionMap");
            return new AccountSwitcherBadgeManager(accountSwitcherBadgeInteractionMap);
        }
    }
}
