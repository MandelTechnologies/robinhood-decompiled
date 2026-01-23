package com.robinhood.android.advisory.withdrawal;

import advisory.proto.p008v1.AdvisoryService;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.transfers.TransferFactoryForV2;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.bonfire.TransferAccountStore;
import com.robinhood.models.card.p311db.Card;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;
import yoda.service.Yoda;

/* compiled from: AdvisoryFullWithdrawalDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017Bi\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0016R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0016¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/advisory/withdrawal/AdvisoryFullWithdrawalDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/advisory/withdrawal/AdvisoryFullWithdrawalDuxo;", "Ljavax/inject/Provider;", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "j$/time/Clock", Card.Icon.CLOCK, "Ladvisory/proto/v1/AdvisoryService;", "advisoryService", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;", "transferAccountStore", "Lcom/robinhood/android/lib/transfers/TransferFactoryForV2;", "transferFactory", "Lyoda/service/Yoda;", "yodaService", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "()Lcom/robinhood/android/advisory/withdrawal/AdvisoryFullWithdrawalDuxo;", "Ljavax/inject/Provider;", "Companion", "feature-advisory-full-withdrawal_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class AdvisoryFullWithdrawalDuxo_Factory implements Factory<AdvisoryFullWithdrawalDuxo> {
    private final Provider<AdvisoryService> advisoryService;
    private final Provider<Clock> clock;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<TransferAccountStore> transferAccountStore;
    private final Provider<TransferFactoryForV2> transferFactory;
    private final Provider<Yoda> yodaService;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final AdvisoryFullWithdrawalDuxo_Factory create(Provider<SavedStateHandle> provider, Provider<Clock> provider2, Provider<AdvisoryService> provider3, Provider<TransferAccountStore> provider4, Provider<TransferFactoryForV2> provider5, Provider<Yoda> provider6, Provider<DuxoBundle> provider7) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    @JvmStatic
    public static final AdvisoryFullWithdrawalDuxo newInstance(SavedStateHandle savedStateHandle, Clock clock, AdvisoryService advisoryService, TransferAccountStore transferAccountStore, TransferFactoryForV2 transferFactoryForV2, Yoda yoda2, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(savedStateHandle, clock, advisoryService, transferAccountStore, transferFactoryForV2, yoda2, duxoBundle);
    }

    public AdvisoryFullWithdrawalDuxo_Factory(Provider<SavedStateHandle> savedStateHandle, Provider<Clock> clock, Provider<AdvisoryService> advisoryService, Provider<TransferAccountStore> transferAccountStore, Provider<TransferFactoryForV2> transferFactory, Provider<Yoda> yodaService, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(advisoryService, "advisoryService");
        Intrinsics.checkNotNullParameter(transferAccountStore, "transferAccountStore");
        Intrinsics.checkNotNullParameter(transferFactory, "transferFactory");
        Intrinsics.checkNotNullParameter(yodaService, "yodaService");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.savedStateHandle = savedStateHandle;
        this.clock = clock;
        this.advisoryService = advisoryService;
        this.transferAccountStore = transferAccountStore;
        this.transferFactory = transferFactory;
        this.yodaService = yodaService;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public AdvisoryFullWithdrawalDuxo get() {
        Companion companion = INSTANCE;
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        AdvisoryService advisoryService = this.advisoryService.get();
        Intrinsics.checkNotNullExpressionValue(advisoryService, "get(...)");
        TransferAccountStore transferAccountStore = this.transferAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(transferAccountStore, "get(...)");
        TransferFactoryForV2 transferFactoryForV2 = this.transferFactory.get();
        Intrinsics.checkNotNullExpressionValue(transferFactoryForV2, "get(...)");
        Yoda yoda2 = this.yodaService.get();
        Intrinsics.checkNotNullExpressionValue(yoda2, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(savedStateHandle, clock, advisoryService, transferAccountStore, transferFactoryForV2, yoda2, duxoBundle);
    }

    /* compiled from: AdvisoryFullWithdrawalDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jq\u0010\u0014\u001a\u00020\u00132\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004H\u0007¢\u0006\u0004\b\u0014\u0010\u0015JG\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/advisory/withdrawal/AdvisoryFullWithdrawalDuxo_Factory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "j$/time/Clock", Card.Icon.CLOCK, "Ladvisory/proto/v1/AdvisoryService;", "advisoryService", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;", "transferAccountStore", "Lcom/robinhood/android/lib/transfers/TransferFactoryForV2;", "transferFactory", "Lyoda/service/Yoda;", "yodaService", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Lcom/robinhood/android/advisory/withdrawal/AdvisoryFullWithdrawalDuxo_Factory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/robinhood/android/advisory/withdrawal/AdvisoryFullWithdrawalDuxo_Factory;", "Lcom/robinhood/android/advisory/withdrawal/AdvisoryFullWithdrawalDuxo;", "newInstance", "(Landroidx/lifecycle/SavedStateHandle;Lj$/time/Clock;Ladvisory/proto/v1/AdvisoryService;Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;Lcom/robinhood/android/lib/transfers/TransferFactoryForV2;Lyoda/service/Yoda;Lcom/robinhood/android/udf/DuxoBundle;)Lcom/robinhood/android/advisory/withdrawal/AdvisoryFullWithdrawalDuxo;", "feature-advisory-full-withdrawal_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AdvisoryFullWithdrawalDuxo_Factory create(Provider<SavedStateHandle> savedStateHandle, Provider<Clock> clock, Provider<AdvisoryService> advisoryService, Provider<TransferAccountStore> transferAccountStore, Provider<TransferFactoryForV2> transferFactory, Provider<Yoda> yodaService, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(advisoryService, "advisoryService");
            Intrinsics.checkNotNullParameter(transferAccountStore, "transferAccountStore");
            Intrinsics.checkNotNullParameter(transferFactory, "transferFactory");
            Intrinsics.checkNotNullParameter(yodaService, "yodaService");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new AdvisoryFullWithdrawalDuxo_Factory(savedStateHandle, clock, advisoryService, transferAccountStore, transferFactory, yodaService, duxoBundle);
        }

        @JvmStatic
        public final AdvisoryFullWithdrawalDuxo newInstance(SavedStateHandle savedStateHandle, Clock clock, AdvisoryService advisoryService, TransferAccountStore transferAccountStore, TransferFactoryForV2 transferFactory, Yoda yodaService, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(advisoryService, "advisoryService");
            Intrinsics.checkNotNullParameter(transferAccountStore, "transferAccountStore");
            Intrinsics.checkNotNullParameter(transferFactory, "transferFactory");
            Intrinsics.checkNotNullParameter(yodaService, "yodaService");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new AdvisoryFullWithdrawalDuxo(savedStateHandle, clock, advisoryService, transferAccountStore, transferFactory, yodaService, duxoBundle);
        }
    }
}
