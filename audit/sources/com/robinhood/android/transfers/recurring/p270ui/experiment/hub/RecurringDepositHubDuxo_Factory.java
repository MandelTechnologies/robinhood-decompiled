package com.robinhood.android.transfers.recurring.p270ui.experiment.hub;

import android.content.Context;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.gold.subscription.store.GoldSubscriptionStore;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.AutomaticDepositStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecurringDepositHubDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/transfers/recurring/ui/experiment/hub/RecurringDepositHubDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/transfers/recurring/ui/experiment/hub/RecurringDepositHubDuxo;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "automaticDepositStore", "Lcom/robinhood/librobinhood/data/store/AutomaticDepositStore;", "goldSubscriptionStore", "Lcom/robinhood/android/gold/subscription/store/GoldSubscriptionStore;", "context", "Landroid/content/Context;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/transfers/recurring/ui/experiment/hub/RecurringDepositHubStateProvider;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-recurring-deposits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class RecurringDepositHubDuxo_Factory implements Factory<RecurringDepositHubDuxo> {
    private final Provider<AccountProvider> accountProvider;
    private final Provider<AutomaticDepositStore> automaticDepositStore;
    private final Provider<Context> context;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<GoldSubscriptionStore> goldSubscriptionStore;
    private final Provider<RecurringDepositHubStateProvider> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final RecurringDepositHubDuxo_Factory create(Provider<AccountProvider> provider, Provider<AutomaticDepositStore> provider2, Provider<GoldSubscriptionStore> provider3, Provider<Context> provider4, Provider<DuxoBundle> provider5, Provider<RecurringDepositHubStateProvider> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final RecurringDepositHubDuxo newInstance(AccountProvider accountProvider, AutomaticDepositStore automaticDepositStore, GoldSubscriptionStore goldSubscriptionStore, Context context, DuxoBundle duxoBundle, RecurringDepositHubStateProvider recurringDepositHubStateProvider) {
        return INSTANCE.newInstance(accountProvider, automaticDepositStore, goldSubscriptionStore, context, duxoBundle, recurringDepositHubStateProvider);
    }

    public RecurringDepositHubDuxo_Factory(Provider<AccountProvider> accountProvider, Provider<AutomaticDepositStore> automaticDepositStore, Provider<GoldSubscriptionStore> goldSubscriptionStore, Provider<Context> context, Provider<DuxoBundle> duxoBundle, Provider<RecurringDepositHubStateProvider> stateProvider) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(automaticDepositStore, "automaticDepositStore");
        Intrinsics.checkNotNullParameter(goldSubscriptionStore, "goldSubscriptionStore");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        this.accountProvider = accountProvider;
        this.automaticDepositStore = automaticDepositStore;
        this.goldSubscriptionStore = goldSubscriptionStore;
        this.context = context;
        this.duxoBundle = duxoBundle;
        this.stateProvider = stateProvider;
    }

    @Override // javax.inject.Provider
    public RecurringDepositHubDuxo get() {
        Companion companion = INSTANCE;
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        AutomaticDepositStore automaticDepositStore = this.automaticDepositStore.get();
        Intrinsics.checkNotNullExpressionValue(automaticDepositStore, "get(...)");
        GoldSubscriptionStore goldSubscriptionStore = this.goldSubscriptionStore.get();
        Intrinsics.checkNotNullExpressionValue(goldSubscriptionStore, "get(...)");
        Context context = this.context.get();
        Intrinsics.checkNotNullExpressionValue(context, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        RecurringDepositHubStateProvider recurringDepositHubStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(recurringDepositHubStateProvider, "get(...)");
        return companion.newInstance(accountProvider, automaticDepositStore, goldSubscriptionStore, context, duxoBundle, recurringDepositHubStateProvider);
    }

    /* compiled from: RecurringDepositHubDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\\\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007H\u0007J8\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/transfers/recurring/ui/experiment/hub/RecurringDepositHubDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/transfers/recurring/ui/experiment/hub/RecurringDepositHubDuxo_Factory;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "automaticDepositStore", "Lcom/robinhood/librobinhood/data/store/AutomaticDepositStore;", "goldSubscriptionStore", "Lcom/robinhood/android/gold/subscription/store/GoldSubscriptionStore;", "context", "Landroid/content/Context;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/transfers/recurring/ui/experiment/hub/RecurringDepositHubStateProvider;", "newInstance", "Lcom/robinhood/android/transfers/recurring/ui/experiment/hub/RecurringDepositHubDuxo;", "feature-recurring-deposits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RecurringDepositHubDuxo_Factory create(Provider<AccountProvider> accountProvider, Provider<AutomaticDepositStore> automaticDepositStore, Provider<GoldSubscriptionStore> goldSubscriptionStore, Provider<Context> context, Provider<DuxoBundle> duxoBundle, Provider<RecurringDepositHubStateProvider> stateProvider) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(automaticDepositStore, "automaticDepositStore");
            Intrinsics.checkNotNullParameter(goldSubscriptionStore, "goldSubscriptionStore");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            return new RecurringDepositHubDuxo_Factory(accountProvider, automaticDepositStore, goldSubscriptionStore, context, duxoBundle, stateProvider);
        }

        @JvmStatic
        public final RecurringDepositHubDuxo newInstance(AccountProvider accountProvider, AutomaticDepositStore automaticDepositStore, GoldSubscriptionStore goldSubscriptionStore, Context context, DuxoBundle duxoBundle, RecurringDepositHubStateProvider stateProvider) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(automaticDepositStore, "automaticDepositStore");
            Intrinsics.checkNotNullParameter(goldSubscriptionStore, "goldSubscriptionStore");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            return new RecurringDepositHubDuxo(accountProvider, automaticDepositStore, goldSubscriptionStore, context, duxoBundle, stateProvider);
        }
    }
}
