package com.robinhood.android.creditcard.p091ui.creditapplication.solidGoldDelay;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.store.creditcard.CreditCardStore;
import com.robinhood.android.udf.DuxoBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;

/* compiled from: SolidGoldDelayDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/solidGoldDelay/SolidGoldDelayDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/creditcard/ui/creditapplication/solidGoldDelay/SolidGoldDelayDuxo;", "creditCardStore", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/store/creditcard/CreditCardStore;", "defaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class SolidGoldDelayDuxo_Factory implements Factory<SolidGoldDelayDuxo> {
    private final Provider<CreditCardStore> creditCardStore;
    private final Provider<CoroutineDispatcher> defaultDispatcher;
    private final Provider<DuxoBundle> duxoBundle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final SolidGoldDelayDuxo_Factory create(Provider<CreditCardStore> provider, Provider<CoroutineDispatcher> provider2, Provider<DuxoBundle> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final SolidGoldDelayDuxo newInstance(CreditCardStore creditCardStore, CoroutineDispatcher coroutineDispatcher, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(creditCardStore, coroutineDispatcher, duxoBundle);
    }

    public SolidGoldDelayDuxo_Factory(Provider<CreditCardStore> creditCardStore, Provider<CoroutineDispatcher> defaultDispatcher, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(creditCardStore, "creditCardStore");
        Intrinsics.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.creditCardStore = creditCardStore;
        this.defaultDispatcher = defaultDispatcher;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public SolidGoldDelayDuxo get() {
        Companion companion = INSTANCE;
        CreditCardStore creditCardStore = this.creditCardStore.get();
        Intrinsics.checkNotNullExpressionValue(creditCardStore, "get(...)");
        CoroutineDispatcher coroutineDispatcher = this.defaultDispatcher.get();
        Intrinsics.checkNotNullExpressionValue(coroutineDispatcher, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(creditCardStore, coroutineDispatcher, duxoBundle);
    }

    /* compiled from: SolidGoldDelayDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u0007J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/solidGoldDelay/SolidGoldDelayDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/creditcard/ui/creditapplication/solidGoldDelay/SolidGoldDelayDuxo_Factory;", "creditCardStore", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/store/creditcard/CreditCardStore;", "defaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/creditcard/ui/creditapplication/solidGoldDelay/SolidGoldDelayDuxo;", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final SolidGoldDelayDuxo_Factory create(Provider<CreditCardStore> creditCardStore, Provider<CoroutineDispatcher> defaultDispatcher, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(creditCardStore, "creditCardStore");
            Intrinsics.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new SolidGoldDelayDuxo_Factory(creditCardStore, defaultDispatcher, duxoBundle);
        }

        @JvmStatic
        public final SolidGoldDelayDuxo newInstance(CreditCardStore creditCardStore, CoroutineDispatcher defaultDispatcher, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(creditCardStore, "creditCardStore");
            Intrinsics.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new SolidGoldDelayDuxo(creditCardStore, defaultDispatcher, duxoBundle);
        }
    }
}
