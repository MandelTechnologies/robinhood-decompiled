package com.robinhood.android.creditcard.p091ui.creditapplication.terms;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.store.creditcard.CreditCardStore;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.prefs.StringPreference;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;

/* compiled from: TermsDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0004\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/terms/TermsDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/creditcard/ui/creditapplication/terms/TermsDuxo;", "creditCardStore", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/store/creditcard/CreditCardStore;", "identityId", "Lcom/robinhood/prefs/StringPreference;", "creditApplicationId", "defaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class TermsDuxo_Factory implements Factory<TermsDuxo> {
    private final Provider<StringPreference> creditApplicationId;
    private final Provider<CreditCardStore> creditCardStore;
    private final Provider<CoroutineDispatcher> defaultDispatcher;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<StringPreference> identityId;
    private final Provider<SavedStateHandle> savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final TermsDuxo_Factory create(Provider<CreditCardStore> provider, Provider<StringPreference> provider2, Provider<StringPreference> provider3, Provider<CoroutineDispatcher> provider4, Provider<DuxoBundle> provider5, Provider<SavedStateHandle> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final TermsDuxo newInstance(CreditCardStore creditCardStore, StringPreference stringPreference, StringPreference stringPreference2, CoroutineDispatcher coroutineDispatcher, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(creditCardStore, stringPreference, stringPreference2, coroutineDispatcher, duxoBundle, savedStateHandle);
    }

    public TermsDuxo_Factory(Provider<CreditCardStore> creditCardStore, Provider<StringPreference> identityId, Provider<StringPreference> creditApplicationId, Provider<CoroutineDispatcher> defaultDispatcher, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
        Intrinsics.checkNotNullParameter(creditCardStore, "creditCardStore");
        Intrinsics.checkNotNullParameter(identityId, "identityId");
        Intrinsics.checkNotNullParameter(creditApplicationId, "creditApplicationId");
        Intrinsics.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.creditCardStore = creditCardStore;
        this.identityId = identityId;
        this.creditApplicationId = creditApplicationId;
        this.defaultDispatcher = defaultDispatcher;
        this.duxoBundle = duxoBundle;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // javax.inject.Provider
    public TermsDuxo get() {
        Companion companion = INSTANCE;
        CreditCardStore creditCardStore = this.creditCardStore.get();
        Intrinsics.checkNotNullExpressionValue(creditCardStore, "get(...)");
        StringPreference stringPreference = this.identityId.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference, "get(...)");
        StringPreference stringPreference2 = this.creditApplicationId.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference2, "get(...)");
        CoroutineDispatcher coroutineDispatcher = this.defaultDispatcher.get();
        Intrinsics.checkNotNullExpressionValue(coroutineDispatcher, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        return companion.newInstance(creditCardStore, stringPreference, stringPreference2, coroutineDispatcher, duxoBundle, savedStateHandle);
    }

    /* compiled from: TermsDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\\\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0007H\u0007J8\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/terms/TermsDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/creditcard/ui/creditapplication/terms/TermsDuxo_Factory;", "creditCardStore", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/store/creditcard/CreditCardStore;", "identityId", "Lcom/robinhood/prefs/StringPreference;", "creditApplicationId", "defaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "newInstance", "Lcom/robinhood/android/creditcard/ui/creditapplication/terms/TermsDuxo;", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final TermsDuxo_Factory create(Provider<CreditCardStore> creditCardStore, Provider<StringPreference> identityId, Provider<StringPreference> creditApplicationId, Provider<CoroutineDispatcher> defaultDispatcher, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
            Intrinsics.checkNotNullParameter(creditCardStore, "creditCardStore");
            Intrinsics.checkNotNullParameter(identityId, "identityId");
            Intrinsics.checkNotNullParameter(creditApplicationId, "creditApplicationId");
            Intrinsics.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new TermsDuxo_Factory(creditCardStore, identityId, creditApplicationId, defaultDispatcher, duxoBundle, savedStateHandle);
        }

        @JvmStatic
        public final TermsDuxo newInstance(CreditCardStore creditCardStore, StringPreference identityId, StringPreference creditApplicationId, CoroutineDispatcher defaultDispatcher, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(creditCardStore, "creditCardStore");
            Intrinsics.checkNotNullParameter(identityId, "identityId");
            Intrinsics.checkNotNullParameter(creditApplicationId, "creditApplicationId");
            Intrinsics.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new TermsDuxo(creditCardStore, identityId, creditApplicationId, defaultDispatcher, duxoBundle, savedStateHandle);
        }
    }
}
