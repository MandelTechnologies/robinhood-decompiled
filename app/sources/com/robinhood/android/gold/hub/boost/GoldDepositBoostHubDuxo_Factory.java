package com.robinhood.android.gold.hub.boost;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.gold.lib.hub.store.GoldHubStore;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.prefs.StringPreference;
import com.robinhood.shared.store.history.HistoryStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoldDepositBoostHubDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013Bi\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/gold/hub/boost/GoldDepositBoostHubDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/gold/hub/boost/GoldDepositBoostHubDuxo;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "goldHubStore", "Lcom/robinhood/android/gold/lib/hub/store/GoldHubStore;", "historyStore", "Lcom/robinhood/shared/store/history/HistoryStore;", "goldDepositBoostTransferIdPref", "Lcom/robinhood/prefs/StringPreference;", "goldDepositBoostTransferAmountPref", "goldDepositBoostTransferTimestampPref", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-gold-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class GoldDepositBoostHubDuxo_Factory implements Factory<GoldDepositBoostHubDuxo> {
    private final Provider<AccountProvider> accountProvider;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<StringPreference> goldDepositBoostTransferAmountPref;
    private final Provider<StringPreference> goldDepositBoostTransferIdPref;
    private final Provider<StringPreference> goldDepositBoostTransferTimestampPref;
    private final Provider<GoldHubStore> goldHubStore;
    private final Provider<HistoryStore> historyStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final GoldDepositBoostHubDuxo_Factory create(Provider<AccountProvider> provider, Provider<GoldHubStore> provider2, Provider<HistoryStore> provider3, Provider<StringPreference> provider4, Provider<StringPreference> provider5, Provider<StringPreference> provider6, Provider<DuxoBundle> provider7) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    @JvmStatic
    public static final GoldDepositBoostHubDuxo newInstance(AccountProvider accountProvider, GoldHubStore goldHubStore, HistoryStore historyStore, StringPreference stringPreference, StringPreference stringPreference2, StringPreference stringPreference3, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(accountProvider, goldHubStore, historyStore, stringPreference, stringPreference2, stringPreference3, duxoBundle);
    }

    public GoldDepositBoostHubDuxo_Factory(Provider<AccountProvider> accountProvider, Provider<GoldHubStore> goldHubStore, Provider<HistoryStore> historyStore, Provider<StringPreference> goldDepositBoostTransferIdPref, Provider<StringPreference> goldDepositBoostTransferAmountPref, Provider<StringPreference> goldDepositBoostTransferTimestampPref, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(goldHubStore, "goldHubStore");
        Intrinsics.checkNotNullParameter(historyStore, "historyStore");
        Intrinsics.checkNotNullParameter(goldDepositBoostTransferIdPref, "goldDepositBoostTransferIdPref");
        Intrinsics.checkNotNullParameter(goldDepositBoostTransferAmountPref, "goldDepositBoostTransferAmountPref");
        Intrinsics.checkNotNullParameter(goldDepositBoostTransferTimestampPref, "goldDepositBoostTransferTimestampPref");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.accountProvider = accountProvider;
        this.goldHubStore = goldHubStore;
        this.historyStore = historyStore;
        this.goldDepositBoostTransferIdPref = goldDepositBoostTransferIdPref;
        this.goldDepositBoostTransferAmountPref = goldDepositBoostTransferAmountPref;
        this.goldDepositBoostTransferTimestampPref = goldDepositBoostTransferTimestampPref;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public GoldDepositBoostHubDuxo get() {
        Companion companion = INSTANCE;
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        GoldHubStore goldHubStore = this.goldHubStore.get();
        Intrinsics.checkNotNullExpressionValue(goldHubStore, "get(...)");
        HistoryStore historyStore = this.historyStore.get();
        Intrinsics.checkNotNullExpressionValue(historyStore, "get(...)");
        StringPreference stringPreference = this.goldDepositBoostTransferIdPref.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference, "get(...)");
        StringPreference stringPreference2 = this.goldDepositBoostTransferAmountPref.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference2, "get(...)");
        StringPreference stringPreference3 = this.goldDepositBoostTransferTimestampPref.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference3, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(accountProvider, goldHubStore, historyStore, stringPreference, stringPreference2, stringPreference3, duxoBundle);
    }

    /* compiled from: GoldDepositBoostHubDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jj\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007H\u0007J@\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/gold/hub/boost/GoldDepositBoostHubDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/gold/hub/boost/GoldDepositBoostHubDuxo_Factory;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "goldHubStore", "Lcom/robinhood/android/gold/lib/hub/store/GoldHubStore;", "historyStore", "Lcom/robinhood/shared/store/history/HistoryStore;", "goldDepositBoostTransferIdPref", "Lcom/robinhood/prefs/StringPreference;", "goldDepositBoostTransferAmountPref", "goldDepositBoostTransferTimestampPref", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/gold/hub/boost/GoldDepositBoostHubDuxo;", "feature-gold-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final GoldDepositBoostHubDuxo_Factory create(Provider<AccountProvider> accountProvider, Provider<GoldHubStore> goldHubStore, Provider<HistoryStore> historyStore, Provider<StringPreference> goldDepositBoostTransferIdPref, Provider<StringPreference> goldDepositBoostTransferAmountPref, Provider<StringPreference> goldDepositBoostTransferTimestampPref, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(goldHubStore, "goldHubStore");
            Intrinsics.checkNotNullParameter(historyStore, "historyStore");
            Intrinsics.checkNotNullParameter(goldDepositBoostTransferIdPref, "goldDepositBoostTransferIdPref");
            Intrinsics.checkNotNullParameter(goldDepositBoostTransferAmountPref, "goldDepositBoostTransferAmountPref");
            Intrinsics.checkNotNullParameter(goldDepositBoostTransferTimestampPref, "goldDepositBoostTransferTimestampPref");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new GoldDepositBoostHubDuxo_Factory(accountProvider, goldHubStore, historyStore, goldDepositBoostTransferIdPref, goldDepositBoostTransferAmountPref, goldDepositBoostTransferTimestampPref, duxoBundle);
        }

        @JvmStatic
        public final GoldDepositBoostHubDuxo newInstance(AccountProvider accountProvider, GoldHubStore goldHubStore, HistoryStore historyStore, StringPreference goldDepositBoostTransferIdPref, StringPreference goldDepositBoostTransferAmountPref, StringPreference goldDepositBoostTransferTimestampPref, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(goldHubStore, "goldHubStore");
            Intrinsics.checkNotNullParameter(historyStore, "historyStore");
            Intrinsics.checkNotNullParameter(goldDepositBoostTransferIdPref, "goldDepositBoostTransferIdPref");
            Intrinsics.checkNotNullParameter(goldDepositBoostTransferAmountPref, "goldDepositBoostTransferAmountPref");
            Intrinsics.checkNotNullParameter(goldDepositBoostTransferTimestampPref, "goldDepositBoostTransferTimestampPref");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new GoldDepositBoostHubDuxo(accountProvider, goldHubStore, historyStore, goldDepositBoostTransferIdPref, goldDepositBoostTransferAmountPref, goldDepositBoostTransferTimestampPref, duxoBundle);
        }
    }
}
