package com.robinhood.librobinhood.data.store;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.prefs.BooleanPreference;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionRemoveReplaceOrderConfirmationStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionRemoveReplaceOrderConfirmationStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/OptionRemoveReplaceOrderConfirmationStore;", "hasShownReplaceConfirmationDialogPref", "Ljavax/inject/Provider;", "Lcom/robinhood/prefs/BooleanPreference;", "optionChainStore", "Lcom/robinhood/librobinhood/data/store/OptionChainStore;", "optionOrderStore", "Lcom/robinhood/librobinhood/data/store/OptionOrderStore;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class OptionRemoveReplaceOrderConfirmationStore_Factory implements Factory<OptionRemoveReplaceOrderConfirmationStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<BooleanPreference> hasShownReplaceConfirmationDialogPref;
    private final Provider<OptionChainStore> optionChainStore;
    private final Provider<OptionOrderStore> optionOrderStore;

    @JvmStatic
    public static final OptionRemoveReplaceOrderConfirmationStore_Factory create(Provider<BooleanPreference> provider, Provider<OptionChainStore> provider2, Provider<OptionOrderStore> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final OptionRemoveReplaceOrderConfirmationStore newInstance(BooleanPreference booleanPreference, OptionChainStore optionChainStore, OptionOrderStore optionOrderStore) {
        return INSTANCE.newInstance(booleanPreference, optionChainStore, optionOrderStore);
    }

    public OptionRemoveReplaceOrderConfirmationStore_Factory(Provider<BooleanPreference> hasShownReplaceConfirmationDialogPref, Provider<OptionChainStore> optionChainStore, Provider<OptionOrderStore> optionOrderStore) {
        Intrinsics.checkNotNullParameter(hasShownReplaceConfirmationDialogPref, "hasShownReplaceConfirmationDialogPref");
        Intrinsics.checkNotNullParameter(optionChainStore, "optionChainStore");
        Intrinsics.checkNotNullParameter(optionOrderStore, "optionOrderStore");
        this.hasShownReplaceConfirmationDialogPref = hasShownReplaceConfirmationDialogPref;
        this.optionChainStore = optionChainStore;
        this.optionOrderStore = optionOrderStore;
    }

    @Override // javax.inject.Provider
    public OptionRemoveReplaceOrderConfirmationStore get() {
        Companion companion = INSTANCE;
        BooleanPreference booleanPreference = this.hasShownReplaceConfirmationDialogPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        OptionChainStore optionChainStore = this.optionChainStore.get();
        Intrinsics.checkNotNullExpressionValue(optionChainStore, "get(...)");
        OptionOrderStore optionOrderStore = this.optionOrderStore.get();
        Intrinsics.checkNotNullExpressionValue(optionOrderStore, "get(...)");
        return companion.newInstance(booleanPreference, optionChainStore, optionOrderStore);
    }

    /* compiled from: OptionRemoveReplaceOrderConfirmationStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u0007J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionRemoveReplaceOrderConfirmationStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/OptionRemoveReplaceOrderConfirmationStore_Factory;", "hasShownReplaceConfirmationDialogPref", "Ljavax/inject/Provider;", "Lcom/robinhood/prefs/BooleanPreference;", "optionChainStore", "Lcom/robinhood/librobinhood/data/store/OptionChainStore;", "optionOrderStore", "Lcom/robinhood/librobinhood/data/store/OptionOrderStore;", "newInstance", "Lcom/robinhood/librobinhood/data/store/OptionRemoveReplaceOrderConfirmationStore;", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final OptionRemoveReplaceOrderConfirmationStore_Factory create(Provider<BooleanPreference> hasShownReplaceConfirmationDialogPref, Provider<OptionChainStore> optionChainStore, Provider<OptionOrderStore> optionOrderStore) {
            Intrinsics.checkNotNullParameter(hasShownReplaceConfirmationDialogPref, "hasShownReplaceConfirmationDialogPref");
            Intrinsics.checkNotNullParameter(optionChainStore, "optionChainStore");
            Intrinsics.checkNotNullParameter(optionOrderStore, "optionOrderStore");
            return new OptionRemoveReplaceOrderConfirmationStore_Factory(hasShownReplaceConfirmationDialogPref, optionChainStore, optionOrderStore);
        }

        @JvmStatic
        public final OptionRemoveReplaceOrderConfirmationStore newInstance(BooleanPreference hasShownReplaceConfirmationDialogPref, OptionChainStore optionChainStore, OptionOrderStore optionOrderStore) {
            Intrinsics.checkNotNullParameter(hasShownReplaceConfirmationDialogPref, "hasShownReplaceConfirmationDialogPref");
            Intrinsics.checkNotNullParameter(optionChainStore, "optionChainStore");
            Intrinsics.checkNotNullParameter(optionOrderStore, "optionOrderStore");
            return new OptionRemoveReplaceOrderConfirmationStore(hasShownReplaceConfirmationDialogPref, optionChainStore, optionOrderStore);
        }
    }
}
