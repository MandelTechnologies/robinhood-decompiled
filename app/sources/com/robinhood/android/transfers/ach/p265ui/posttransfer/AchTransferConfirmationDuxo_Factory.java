package com.robinhood.android.transfers.ach.p265ui.posttransfer;

import android.content.Context;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.microgramsdui.MicrogramManager;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.AccountStore;
import com.robinhood.librobinhood.data.store.AchRelationshipStore;
import com.robinhood.librobinhood.data.store.BalancesStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.UserApplicationStore;
import com.robinhood.utils.moshi.LazyMoshi;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AchTransferConfirmationDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB¡\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u001c\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/posttransfer/AchTransferConfirmationDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/transfers/ach/ui/posttransfer/AchTransferConfirmationDuxo;", "applicationStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/UserApplicationStore;", "achRelationshipStore", "Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;", "balancesStore", "Lcom/robinhood/librobinhood/data/store/BalancesStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "accountStore", "Lcom/robinhood/librobinhood/data/store/AccountStore;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "context", "Landroid/content/Context;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "microgramManager", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class AchTransferConfirmationDuxo_Factory implements Factory<AchTransferConfirmationDuxo> {
    private final Provider<AccountStore> accountStore;
    private final Provider<AchRelationshipStore> achRelationshipStore;
    private final Provider<UserApplicationStore> applicationStore;
    private final Provider<BalancesStore> balancesStore;
    private final Provider<Context> context;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<MicrogramManager> microgramManager;
    private final Provider<LazyMoshi> moshi;
    private final Provider<Navigator> navigator;
    private final Provider<SavedStateHandle> savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final AchTransferConfirmationDuxo_Factory create(Provider<UserApplicationStore> provider, Provider<AchRelationshipStore> provider2, Provider<BalancesStore> provider3, Provider<ExperimentsStore> provider4, Provider<AccountStore> provider5, Provider<LazyMoshi> provider6, Provider<DuxoBundle> provider7, Provider<Context> provider8, Provider<Navigator> provider9, Provider<MicrogramManager> provider10, Provider<SavedStateHandle> provider11) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11);
    }

    @JvmStatic
    public static final AchTransferConfirmationDuxo newInstance(UserApplicationStore userApplicationStore, AchRelationshipStore achRelationshipStore, BalancesStore balancesStore, ExperimentsStore experimentsStore, AccountStore accountStore, LazyMoshi lazyMoshi, DuxoBundle duxoBundle, Context context, Navigator navigator, MicrogramManager microgramManager, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(userApplicationStore, achRelationshipStore, balancesStore, experimentsStore, accountStore, lazyMoshi, duxoBundle, context, navigator, microgramManager, savedStateHandle);
    }

    public AchTransferConfirmationDuxo_Factory(Provider<UserApplicationStore> applicationStore, Provider<AchRelationshipStore> achRelationshipStore, Provider<BalancesStore> balancesStore, Provider<ExperimentsStore> experimentsStore, Provider<AccountStore> accountStore, Provider<LazyMoshi> moshi, Provider<DuxoBundle> duxoBundle, Provider<Context> context, Provider<Navigator> navigator, Provider<MicrogramManager> microgramManager, Provider<SavedStateHandle> savedStateHandle) {
        Intrinsics.checkNotNullParameter(applicationStore, "applicationStore");
        Intrinsics.checkNotNullParameter(achRelationshipStore, "achRelationshipStore");
        Intrinsics.checkNotNullParameter(balancesStore, "balancesStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(accountStore, "accountStore");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.applicationStore = applicationStore;
        this.achRelationshipStore = achRelationshipStore;
        this.balancesStore = balancesStore;
        this.experimentsStore = experimentsStore;
        this.accountStore = accountStore;
        this.moshi = moshi;
        this.duxoBundle = duxoBundle;
        this.context = context;
        this.navigator = navigator;
        this.microgramManager = microgramManager;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // javax.inject.Provider
    public AchTransferConfirmationDuxo get() {
        Companion companion = INSTANCE;
        UserApplicationStore userApplicationStore = this.applicationStore.get();
        Intrinsics.checkNotNullExpressionValue(userApplicationStore, "get(...)");
        AchRelationshipStore achRelationshipStore = this.achRelationshipStore.get();
        Intrinsics.checkNotNullExpressionValue(achRelationshipStore, "get(...)");
        BalancesStore balancesStore = this.balancesStore.get();
        Intrinsics.checkNotNullExpressionValue(balancesStore, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        AccountStore accountStore = this.accountStore.get();
        Intrinsics.checkNotNullExpressionValue(accountStore, "get(...)");
        LazyMoshi lazyMoshi = this.moshi.get();
        Intrinsics.checkNotNullExpressionValue(lazyMoshi, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        Context context = this.context.get();
        Intrinsics.checkNotNullExpressionValue(context, "get(...)");
        Navigator navigator = this.navigator.get();
        Intrinsics.checkNotNullExpressionValue(navigator, "get(...)");
        MicrogramManager microgramManager = this.microgramManager.get();
        Intrinsics.checkNotNullExpressionValue(microgramManager, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        return companion.newInstance(userApplicationStore, achRelationshipStore, balancesStore, experimentsStore, accountStore, lazyMoshi, duxoBundle, context, navigator, microgramManager, savedStateHandle);
    }

    /* compiled from: AchTransferConfirmationDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J¢\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0007H\u0007J`\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0007¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/posttransfer/AchTransferConfirmationDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/transfers/ach/ui/posttransfer/AchTransferConfirmationDuxo_Factory;", "applicationStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/UserApplicationStore;", "achRelationshipStore", "Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;", "balancesStore", "Lcom/robinhood/librobinhood/data/store/BalancesStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "accountStore", "Lcom/robinhood/librobinhood/data/store/AccountStore;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "context", "Landroid/content/Context;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "microgramManager", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "newInstance", "Lcom/robinhood/android/transfers/ach/ui/posttransfer/AchTransferConfirmationDuxo;", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AchTransferConfirmationDuxo_Factory create(Provider<UserApplicationStore> applicationStore, Provider<AchRelationshipStore> achRelationshipStore, Provider<BalancesStore> balancesStore, Provider<ExperimentsStore> experimentsStore, Provider<AccountStore> accountStore, Provider<LazyMoshi> moshi, Provider<DuxoBundle> duxoBundle, Provider<Context> context, Provider<Navigator> navigator, Provider<MicrogramManager> microgramManager, Provider<SavedStateHandle> savedStateHandle) {
            Intrinsics.checkNotNullParameter(applicationStore, "applicationStore");
            Intrinsics.checkNotNullParameter(achRelationshipStore, "achRelationshipStore");
            Intrinsics.checkNotNullParameter(balancesStore, "balancesStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(accountStore, "accountStore");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new AchTransferConfirmationDuxo_Factory(applicationStore, achRelationshipStore, balancesStore, experimentsStore, accountStore, moshi, duxoBundle, context, navigator, microgramManager, savedStateHandle);
        }

        @JvmStatic
        public final AchTransferConfirmationDuxo newInstance(UserApplicationStore applicationStore, AchRelationshipStore achRelationshipStore, BalancesStore balancesStore, ExperimentsStore experimentsStore, AccountStore accountStore, LazyMoshi moshi, DuxoBundle duxoBundle, Context context, Navigator navigator, MicrogramManager microgramManager, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(applicationStore, "applicationStore");
            Intrinsics.checkNotNullParameter(achRelationshipStore, "achRelationshipStore");
            Intrinsics.checkNotNullParameter(balancesStore, "balancesStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(accountStore, "accountStore");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new AchTransferConfirmationDuxo(applicationStore, achRelationshipStore, balancesStore, experimentsStore, accountStore, moshi, duxoBundle, context, navigator, microgramManager, savedStateHandle);
        }
    }
}
