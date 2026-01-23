package com.robinhood.android.creditcard.p091ui.creditapplication;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.store.creditcard.CreditCardStore;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.prefs.StringPreference;
import com.robinhood.shared.store.user.UserStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;

/* compiled from: CreditApplicationDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015Bw\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0004\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/CreditApplicationDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/creditcard/ui/creditapplication/CreditApplicationDuxo;", "userStore", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/store/user/UserStore;", "creditCardStore", "Lcom/robinhood/android/lib/store/creditcard/CreditCardStore;", "experimentStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "identityId", "Lcom/robinhood/prefs/StringPreference;", "creditApplicationId", "defaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "creditCardEntryPointSourcePref", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class CreditApplicationDuxo_Factory implements Factory<CreditApplicationDuxo> {
    private final Provider<StringPreference> creditApplicationId;
    private final Provider<StringPreference> creditCardEntryPointSourcePref;
    private final Provider<CreditCardStore> creditCardStore;
    private final Provider<CoroutineDispatcher> defaultDispatcher;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<ExperimentsStore> experimentStore;
    private final Provider<StringPreference> identityId;
    private final Provider<UserStore> userStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final CreditApplicationDuxo_Factory create(Provider<UserStore> provider, Provider<CreditCardStore> provider2, Provider<ExperimentsStore> provider3, Provider<DuxoBundle> provider4, Provider<StringPreference> provider5, Provider<StringPreference> provider6, Provider<CoroutineDispatcher> provider7, Provider<StringPreference> provider8) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    @JvmStatic
    public static final CreditApplicationDuxo newInstance(UserStore userStore, CreditCardStore creditCardStore, ExperimentsStore experimentsStore, DuxoBundle duxoBundle, StringPreference stringPreference, StringPreference stringPreference2, CoroutineDispatcher coroutineDispatcher, StringPreference stringPreference3) {
        return INSTANCE.newInstance(userStore, creditCardStore, experimentsStore, duxoBundle, stringPreference, stringPreference2, coroutineDispatcher, stringPreference3);
    }

    public CreditApplicationDuxo_Factory(Provider<UserStore> userStore, Provider<CreditCardStore> creditCardStore, Provider<ExperimentsStore> experimentStore, Provider<DuxoBundle> duxoBundle, Provider<StringPreference> identityId, Provider<StringPreference> creditApplicationId, Provider<CoroutineDispatcher> defaultDispatcher, Provider<StringPreference> creditCardEntryPointSourcePref) {
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(creditCardStore, "creditCardStore");
        Intrinsics.checkNotNullParameter(experimentStore, "experimentStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(identityId, "identityId");
        Intrinsics.checkNotNullParameter(creditApplicationId, "creditApplicationId");
        Intrinsics.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
        Intrinsics.checkNotNullParameter(creditCardEntryPointSourcePref, "creditCardEntryPointSourcePref");
        this.userStore = userStore;
        this.creditCardStore = creditCardStore;
        this.experimentStore = experimentStore;
        this.duxoBundle = duxoBundle;
        this.identityId = identityId;
        this.creditApplicationId = creditApplicationId;
        this.defaultDispatcher = defaultDispatcher;
        this.creditCardEntryPointSourcePref = creditCardEntryPointSourcePref;
    }

    @Override // javax.inject.Provider
    public CreditApplicationDuxo get() {
        Companion companion = INSTANCE;
        UserStore userStore = this.userStore.get();
        Intrinsics.checkNotNullExpressionValue(userStore, "get(...)");
        CreditCardStore creditCardStore = this.creditCardStore.get();
        Intrinsics.checkNotNullExpressionValue(creditCardStore, "get(...)");
        ExperimentsStore experimentsStore = this.experimentStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        StringPreference stringPreference = this.identityId.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference, "get(...)");
        StringPreference stringPreference2 = this.creditApplicationId.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference2, "get(...)");
        CoroutineDispatcher coroutineDispatcher = this.defaultDispatcher.get();
        Intrinsics.checkNotNullExpressionValue(coroutineDispatcher, "get(...)");
        StringPreference stringPreference3 = this.creditCardEntryPointSourcePref.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference3, "get(...)");
        return companion.newInstance(userStore, creditCardStore, experimentsStore, duxoBundle, stringPreference, stringPreference2, coroutineDispatcher, stringPreference3);
    }

    /* compiled from: CreditApplicationDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jx\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00072\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007H\u0007JH\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0010H\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/CreditApplicationDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/creditcard/ui/creditapplication/CreditApplicationDuxo_Factory;", "userStore", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/store/user/UserStore;", "creditCardStore", "Lcom/robinhood/android/lib/store/creditcard/CreditCardStore;", "experimentStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "identityId", "Lcom/robinhood/prefs/StringPreference;", "creditApplicationId", "defaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "creditCardEntryPointSourcePref", "newInstance", "Lcom/robinhood/android/creditcard/ui/creditapplication/CreditApplicationDuxo;", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CreditApplicationDuxo_Factory create(Provider<UserStore> userStore, Provider<CreditCardStore> creditCardStore, Provider<ExperimentsStore> experimentStore, Provider<DuxoBundle> duxoBundle, Provider<StringPreference> identityId, Provider<StringPreference> creditApplicationId, Provider<CoroutineDispatcher> defaultDispatcher, Provider<StringPreference> creditCardEntryPointSourcePref) {
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(creditCardStore, "creditCardStore");
            Intrinsics.checkNotNullParameter(experimentStore, "experimentStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(identityId, "identityId");
            Intrinsics.checkNotNullParameter(creditApplicationId, "creditApplicationId");
            Intrinsics.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
            Intrinsics.checkNotNullParameter(creditCardEntryPointSourcePref, "creditCardEntryPointSourcePref");
            return new CreditApplicationDuxo_Factory(userStore, creditCardStore, experimentStore, duxoBundle, identityId, creditApplicationId, defaultDispatcher, creditCardEntryPointSourcePref);
        }

        @JvmStatic
        public final CreditApplicationDuxo newInstance(UserStore userStore, CreditCardStore creditCardStore, ExperimentsStore experimentStore, DuxoBundle duxoBundle, StringPreference identityId, StringPreference creditApplicationId, CoroutineDispatcher defaultDispatcher, StringPreference creditCardEntryPointSourcePref) {
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(creditCardStore, "creditCardStore");
            Intrinsics.checkNotNullParameter(experimentStore, "experimentStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(identityId, "identityId");
            Intrinsics.checkNotNullParameter(creditApplicationId, "creditApplicationId");
            Intrinsics.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
            Intrinsics.checkNotNullParameter(creditCardEntryPointSourcePref, "creditCardEntryPointSourcePref");
            return new CreditApplicationDuxo(userStore, creditCardStore, experimentStore, duxoBundle, identityId, creditApplicationId, defaultDispatcher, creditCardEntryPointSourcePref);
        }
    }
}
