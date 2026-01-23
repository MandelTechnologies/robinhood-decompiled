package com.robinhood.android.internalassettransfers.accountselection;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.internalassettransfers.data.store.InternalAssetTransfersStore;
import com.robinhood.models.card.p311db.Card;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import microgram.android.inject.MicrogramComponent;
import p479j$.time.Clock;

/* compiled from: AccountSelectionDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B[\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0014R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0014R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0014¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionDuxo;", "Ljavax/inject/Provider;", "Lcom/robinhood/internalassettransfers/data/store/InternalAssetTransfersStore;", "internalAssetTransfersStore", "j$/time/Clock", Card.Icon.CLOCK, "Lmicrogram/android/inject/MicrogramComponent$Factory;", "microgramComponentFactory", "Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionStateProvider;", "stateProvider", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "()Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionDuxo;", "Ljavax/inject/Provider;", "Companion", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class AccountSelectionDuxo_Factory implements Factory<AccountSelectionDuxo> {
    private final Provider<Clock> clock;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<InternalAssetTransfersStore> internalAssetTransfersStore;
    private final Provider<MicrogramComponent.Factory> microgramComponentFactory;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<AccountSelectionStateProvider> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final AccountSelectionDuxo_Factory create(Provider<InternalAssetTransfersStore> provider, Provider<Clock> provider2, Provider<MicrogramComponent.Factory> provider3, Provider<AccountSelectionStateProvider> provider4, Provider<DuxoBundle> provider5, Provider<SavedStateHandle> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final AccountSelectionDuxo newInstance(InternalAssetTransfersStore internalAssetTransfersStore, Clock clock, MicrogramComponent.Factory factory, AccountSelectionStateProvider accountSelectionStateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(internalAssetTransfersStore, clock, factory, accountSelectionStateProvider, duxoBundle, savedStateHandle);
    }

    public AccountSelectionDuxo_Factory(Provider<InternalAssetTransfersStore> internalAssetTransfersStore, Provider<Clock> clock, Provider<MicrogramComponent.Factory> microgramComponentFactory, Provider<AccountSelectionStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
        Intrinsics.checkNotNullParameter(internalAssetTransfersStore, "internalAssetTransfersStore");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(microgramComponentFactory, "microgramComponentFactory");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.internalAssetTransfersStore = internalAssetTransfersStore;
        this.clock = clock;
        this.microgramComponentFactory = microgramComponentFactory;
        this.stateProvider = stateProvider;
        this.duxoBundle = duxoBundle;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // javax.inject.Provider
    public AccountSelectionDuxo get() {
        Companion companion = INSTANCE;
        InternalAssetTransfersStore internalAssetTransfersStore = this.internalAssetTransfersStore.get();
        Intrinsics.checkNotNullExpressionValue(internalAssetTransfersStore, "get(...)");
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        MicrogramComponent.Factory factory = this.microgramComponentFactory.get();
        Intrinsics.checkNotNullExpressionValue(factory, "get(...)");
        AccountSelectionStateProvider accountSelectionStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountSelectionStateProvider, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        return companion.newInstance(internalAssetTransfersStore, clock, factory, accountSelectionStateProvider, duxoBundle, savedStateHandle);
    }

    /* compiled from: AccountSelectionDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jc\u0010\u0012\u001a\u00020\u00112\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J?\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionDuxo_Factory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "Lcom/robinhood/internalassettransfers/data/store/InternalAssetTransfersStore;", "internalAssetTransfersStore", "j$/time/Clock", Card.Icon.CLOCK, "Lmicrogram/android/inject/MicrogramComponent$Factory;", "microgramComponentFactory", "Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionStateProvider;", "stateProvider", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionDuxo_Factory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionDuxo_Factory;", "Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionDuxo;", "newInstance", "(Lcom/robinhood/internalassettransfers/data/store/InternalAssetTransfersStore;Lj$/time/Clock;Lmicrogram/android/inject/MicrogramComponent$Factory;Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionDuxo;", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AccountSelectionDuxo_Factory create(Provider<InternalAssetTransfersStore> internalAssetTransfersStore, Provider<Clock> clock, Provider<MicrogramComponent.Factory> microgramComponentFactory, Provider<AccountSelectionStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
            Intrinsics.checkNotNullParameter(internalAssetTransfersStore, "internalAssetTransfersStore");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(microgramComponentFactory, "microgramComponentFactory");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new AccountSelectionDuxo_Factory(internalAssetTransfersStore, clock, microgramComponentFactory, stateProvider, duxoBundle, savedStateHandle);
        }

        @JvmStatic
        public final AccountSelectionDuxo newInstance(InternalAssetTransfersStore internalAssetTransfersStore, Clock clock, MicrogramComponent.Factory microgramComponentFactory, AccountSelectionStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(internalAssetTransfersStore, "internalAssetTransfersStore");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(microgramComponentFactory, "microgramComponentFactory");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new AccountSelectionDuxo(internalAssetTransfersStore, clock, microgramComponentFactory, stateProvider, duxoBundle, savedStateHandle);
        }
    }
}
