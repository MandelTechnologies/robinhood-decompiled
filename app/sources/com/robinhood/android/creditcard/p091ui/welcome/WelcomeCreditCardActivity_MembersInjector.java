package com.robinhood.android.creditcard.p091ui.welcome;

import com.robinhood.android.common.p088ui.BaseActivity_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseActivitySingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.store.creditcard.prefs.CreditCardWaitlistReferralCodePref;
import com.robinhood.prefs.StringPreference;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WelcomeCreditCardActivity_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/welcome/WelcomeCreditCardActivity_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/creditcard/ui/welcome/WelcomeCreditCardActivity;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseActivitySingletons;", "creditCardWaitlistReferralCode", "Lcom/robinhood/prefs/StringPreference;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class WelcomeCreditCardActivity_MembersInjector implements MembersInjector<WelcomeCreditCardActivity> {
    private final Provider<StringPreference> creditCardWaitlistReferralCode;
    private final Provider<BaseActivitySingletons> singletons;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<WelcomeCreditCardActivity> create(Provider<BaseActivitySingletons> provider, Provider<StringPreference> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    @CreditCardWaitlistReferralCodePref
    public static final void injectCreditCardWaitlistReferralCode(WelcomeCreditCardActivity welcomeCreditCardActivity, StringPreference stringPreference) {
        INSTANCE.injectCreditCardWaitlistReferralCode(welcomeCreditCardActivity, stringPreference);
    }

    public WelcomeCreditCardActivity_MembersInjector(Provider<BaseActivitySingletons> singletons, Provider<StringPreference> creditCardWaitlistReferralCode) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(creditCardWaitlistReferralCode, "creditCardWaitlistReferralCode");
        this.singletons = singletons;
        this.creditCardWaitlistReferralCode = creditCardWaitlistReferralCode;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(WelcomeCreditCardActivity instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseActivity_MembersInjector.Companion companion = BaseActivity_MembersInjector.INSTANCE;
        BaseActivitySingletons baseActivitySingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseActivitySingletons, "get(...)");
        companion.injectSingletons(instance, baseActivitySingletons);
        Companion companion2 = INSTANCE;
        StringPreference stringPreference = this.creditCardWaitlistReferralCode.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference, "get(...)");
        companion2.injectCreditCardWaitlistReferralCode(instance, stringPreference);
    }

    /* compiled from: WelcomeCreditCardActivity_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bH\u0007J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/welcome/WelcomeCreditCardActivity_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/creditcard/ui/welcome/WelcomeCreditCardActivity;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseActivitySingletons;", "creditCardWaitlistReferralCode", "Lcom/robinhood/prefs/StringPreference;", "injectCreditCardWaitlistReferralCode", "", "instance", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<WelcomeCreditCardActivity> create(Provider<BaseActivitySingletons> singletons, Provider<StringPreference> creditCardWaitlistReferralCode) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(creditCardWaitlistReferralCode, "creditCardWaitlistReferralCode");
            return new WelcomeCreditCardActivity_MembersInjector(singletons, creditCardWaitlistReferralCode);
        }

        @JvmStatic
        @CreditCardWaitlistReferralCodePref
        public final void injectCreditCardWaitlistReferralCode(WelcomeCreditCardActivity instance, StringPreference creditCardWaitlistReferralCode) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(creditCardWaitlistReferralCode, "creditCardWaitlistReferralCode");
            instance.setCreditCardWaitlistReferralCode(creditCardWaitlistReferralCode);
        }
    }
}
