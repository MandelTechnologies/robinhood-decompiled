package com.robinhood.android.transfers.recurring.p270ui.experiment.extracash.accountselection;

import androidx.lifecycle.SavedStateHandle;
import bff_money_movement.service.p019v1.BffMoneyMovementService;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.AchRelationshipStore;
import com.robinhood.librobinhood.data.store.AutomaticDepositStore;
import com.robinhood.librobinhood.data.store.bonfire.TransferAccountStore;
import com.robinhood.models.card.p311db.Card;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: RecurringDepositExtraCashAccountSelectionDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019Bw\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0018R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0018R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0018R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0018¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/transfers/recurring/ui/experiment/extracash/accountselection/RecurringDepositExtraCashAccountSelectionDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/transfers/recurring/ui/experiment/extracash/accountselection/RecurringDepositExtraCashAccountSelectionDuxo;", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;", "achRelationshipStore", "Lcom/robinhood/librobinhood/data/store/AutomaticDepositStore;", "automaticDepositStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;", "transferAccountStore", "Lbff_money_movement/service/v1/BffMoneyMovementService;", "bffMoneyMovementService", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Lcom/robinhood/android/transfers/recurring/ui/experiment/extracash/accountselection/RecurringDepositExtraCashAccountSelectionStateProvider;", "stateProvider", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "()Lcom/robinhood/android/transfers/recurring/ui/experiment/extracash/accountselection/RecurringDepositExtraCashAccountSelectionDuxo;", "Ljavax/inject/Provider;", "Companion", "feature-recurring-deposits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class RecurringDepositExtraCashAccountSelectionDuxo_Factory implements Factory<RecurringDepositExtraCashAccountSelectionDuxo> {
    private final Provider<AchRelationshipStore> achRelationshipStore;
    private final Provider<AutomaticDepositStore> automaticDepositStore;
    private final Provider<BffMoneyMovementService> bffMoneyMovementService;
    private final Provider<Clock> clock;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<RecurringDepositExtraCashAccountSelectionStateProvider> stateProvider;
    private final Provider<TransferAccountStore> transferAccountStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final RecurringDepositExtraCashAccountSelectionDuxo_Factory create(Provider<AchRelationshipStore> provider, Provider<AutomaticDepositStore> provider2, Provider<TransferAccountStore> provider3, Provider<BffMoneyMovementService> provider4, Provider<SavedStateHandle> provider5, Provider<Clock> provider6, Provider<DuxoBundle> provider7, Provider<RecurringDepositExtraCashAccountSelectionStateProvider> provider8) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    @JvmStatic
    public static final RecurringDepositExtraCashAccountSelectionDuxo newInstance(AchRelationshipStore achRelationshipStore, AutomaticDepositStore automaticDepositStore, TransferAccountStore transferAccountStore, BffMoneyMovementService bffMoneyMovementService, SavedStateHandle savedStateHandle, Clock clock, DuxoBundle duxoBundle, RecurringDepositExtraCashAccountSelectionStateProvider recurringDepositExtraCashAccountSelectionStateProvider) {
        return INSTANCE.newInstance(achRelationshipStore, automaticDepositStore, transferAccountStore, bffMoneyMovementService, savedStateHandle, clock, duxoBundle, recurringDepositExtraCashAccountSelectionStateProvider);
    }

    public RecurringDepositExtraCashAccountSelectionDuxo_Factory(Provider<AchRelationshipStore> achRelationshipStore, Provider<AutomaticDepositStore> automaticDepositStore, Provider<TransferAccountStore> transferAccountStore, Provider<BffMoneyMovementService> bffMoneyMovementService, Provider<SavedStateHandle> savedStateHandle, Provider<Clock> clock, Provider<DuxoBundle> duxoBundle, Provider<RecurringDepositExtraCashAccountSelectionStateProvider> stateProvider) {
        Intrinsics.checkNotNullParameter(achRelationshipStore, "achRelationshipStore");
        Intrinsics.checkNotNullParameter(automaticDepositStore, "automaticDepositStore");
        Intrinsics.checkNotNullParameter(transferAccountStore, "transferAccountStore");
        Intrinsics.checkNotNullParameter(bffMoneyMovementService, "bffMoneyMovementService");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        this.achRelationshipStore = achRelationshipStore;
        this.automaticDepositStore = automaticDepositStore;
        this.transferAccountStore = transferAccountStore;
        this.bffMoneyMovementService = bffMoneyMovementService;
        this.savedStateHandle = savedStateHandle;
        this.clock = clock;
        this.duxoBundle = duxoBundle;
        this.stateProvider = stateProvider;
    }

    @Override // javax.inject.Provider
    public RecurringDepositExtraCashAccountSelectionDuxo get() {
        Companion companion = INSTANCE;
        AchRelationshipStore achRelationshipStore = this.achRelationshipStore.get();
        Intrinsics.checkNotNullExpressionValue(achRelationshipStore, "get(...)");
        AutomaticDepositStore automaticDepositStore = this.automaticDepositStore.get();
        Intrinsics.checkNotNullExpressionValue(automaticDepositStore, "get(...)");
        TransferAccountStore transferAccountStore = this.transferAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(transferAccountStore, "get(...)");
        BffMoneyMovementService bffMoneyMovementService = this.bffMoneyMovementService.get();
        Intrinsics.checkNotNullExpressionValue(bffMoneyMovementService, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        RecurringDepositExtraCashAccountSelectionStateProvider recurringDepositExtraCashAccountSelectionStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(recurringDepositExtraCashAccountSelectionStateProvider, "get(...)");
        return companion.newInstance(achRelationshipStore, automaticDepositStore, transferAccountStore, bffMoneyMovementService, savedStateHandle, clock, duxoBundle, recurringDepositExtraCashAccountSelectionStateProvider);
    }

    /* compiled from: RecurringDepositExtraCashAccountSelectionDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u007f\u0010\u0016\u001a\u00020\u00152\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004H\u0007¢\u0006\u0004\b\u0016\u0010\u0017JO\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/transfers/recurring/ui/experiment/extracash/accountselection/RecurringDepositExtraCashAccountSelectionDuxo_Factory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;", "achRelationshipStore", "Lcom/robinhood/librobinhood/data/store/AutomaticDepositStore;", "automaticDepositStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;", "transferAccountStore", "Lbff_money_movement/service/v1/BffMoneyMovementService;", "bffMoneyMovementService", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Lcom/robinhood/android/transfers/recurring/ui/experiment/extracash/accountselection/RecurringDepositExtraCashAccountSelectionStateProvider;", "stateProvider", "Lcom/robinhood/android/transfers/recurring/ui/experiment/extracash/accountselection/RecurringDepositExtraCashAccountSelectionDuxo_Factory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/robinhood/android/transfers/recurring/ui/experiment/extracash/accountselection/RecurringDepositExtraCashAccountSelectionDuxo_Factory;", "Lcom/robinhood/android/transfers/recurring/ui/experiment/extracash/accountselection/RecurringDepositExtraCashAccountSelectionDuxo;", "newInstance", "(Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;Lcom/robinhood/librobinhood/data/store/AutomaticDepositStore;Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;Lbff_money_movement/service/v1/BffMoneyMovementService;Landroidx/lifecycle/SavedStateHandle;Lj$/time/Clock;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/android/transfers/recurring/ui/experiment/extracash/accountselection/RecurringDepositExtraCashAccountSelectionStateProvider;)Lcom/robinhood/android/transfers/recurring/ui/experiment/extracash/accountselection/RecurringDepositExtraCashAccountSelectionDuxo;", "feature-recurring-deposits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RecurringDepositExtraCashAccountSelectionDuxo_Factory create(Provider<AchRelationshipStore> achRelationshipStore, Provider<AutomaticDepositStore> automaticDepositStore, Provider<TransferAccountStore> transferAccountStore, Provider<BffMoneyMovementService> bffMoneyMovementService, Provider<SavedStateHandle> savedStateHandle, Provider<Clock> clock, Provider<DuxoBundle> duxoBundle, Provider<RecurringDepositExtraCashAccountSelectionStateProvider> stateProvider) {
            Intrinsics.checkNotNullParameter(achRelationshipStore, "achRelationshipStore");
            Intrinsics.checkNotNullParameter(automaticDepositStore, "automaticDepositStore");
            Intrinsics.checkNotNullParameter(transferAccountStore, "transferAccountStore");
            Intrinsics.checkNotNullParameter(bffMoneyMovementService, "bffMoneyMovementService");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            return new RecurringDepositExtraCashAccountSelectionDuxo_Factory(achRelationshipStore, automaticDepositStore, transferAccountStore, bffMoneyMovementService, savedStateHandle, clock, duxoBundle, stateProvider);
        }

        @JvmStatic
        public final RecurringDepositExtraCashAccountSelectionDuxo newInstance(AchRelationshipStore achRelationshipStore, AutomaticDepositStore automaticDepositStore, TransferAccountStore transferAccountStore, BffMoneyMovementService bffMoneyMovementService, SavedStateHandle savedStateHandle, Clock clock, DuxoBundle duxoBundle, RecurringDepositExtraCashAccountSelectionStateProvider stateProvider) {
            Intrinsics.checkNotNullParameter(achRelationshipStore, "achRelationshipStore");
            Intrinsics.checkNotNullParameter(automaticDepositStore, "automaticDepositStore");
            Intrinsics.checkNotNullParameter(transferAccountStore, "transferAccountStore");
            Intrinsics.checkNotNullParameter(bffMoneyMovementService, "bffMoneyMovementService");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            return new RecurringDepositExtraCashAccountSelectionDuxo(achRelationshipStore, automaticDepositStore, transferAccountStore, bffMoneyMovementService, savedStateHandle, clock, duxoBundle, stateProvider);
        }
    }
}
