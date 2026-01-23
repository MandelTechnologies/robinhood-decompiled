package com.robinhood.android.transfers.ach.p265ui;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.goldearningspotential.microgram.GoldEarningsPotentialMicrogramSduiConverters;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import microgram.android.inject.MicrogramComponent;

/* compiled from: CreateQueuedAchDepositDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/CreateQueuedAchDepositDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/transfers/ach/ui/CreateQueuedAchDepositDuxo;", "experimentsStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "sduiConverters", "Lcom/robinhood/android/goldearningspotential/microgram/GoldEarningsPotentialSduiConverters;", "microgramComponentFactory", "Lmicrogram/android/inject/MicrogramComponent$Factory;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class CreateQueuedAchDepositDuxo_Factory implements Factory<CreateQueuedAchDepositDuxo> {
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<MicrogramComponent.Factory> microgramComponentFactory;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<GoldEarningsPotentialMicrogramSduiConverters> sduiConverters;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final CreateQueuedAchDepositDuxo_Factory create(Provider<ExperimentsStore> provider, Provider<GoldEarningsPotentialMicrogramSduiConverters> provider2, Provider<MicrogramComponent.Factory> provider3, Provider<SavedStateHandle> provider4, Provider<DuxoBundle> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final CreateQueuedAchDepositDuxo newInstance(ExperimentsStore experimentsStore, GoldEarningsPotentialMicrogramSduiConverters goldEarningsPotentialMicrogramSduiConverters, MicrogramComponent.Factory factory, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(experimentsStore, goldEarningsPotentialMicrogramSduiConverters, factory, savedStateHandle, duxoBundle);
    }

    public CreateQueuedAchDepositDuxo_Factory(Provider<ExperimentsStore> experimentsStore, Provider<GoldEarningsPotentialMicrogramSduiConverters> sduiConverters, Provider<MicrogramComponent.Factory> microgramComponentFactory, Provider<SavedStateHandle> savedStateHandle, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(sduiConverters, "sduiConverters");
        Intrinsics.checkNotNullParameter(microgramComponentFactory, "microgramComponentFactory");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.experimentsStore = experimentsStore;
        this.sduiConverters = sduiConverters;
        this.microgramComponentFactory = microgramComponentFactory;
        this.savedStateHandle = savedStateHandle;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public CreateQueuedAchDepositDuxo get() {
        Companion companion = INSTANCE;
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        GoldEarningsPotentialMicrogramSduiConverters goldEarningsPotentialMicrogramSduiConverters = this.sduiConverters.get();
        Intrinsics.checkNotNullExpressionValue(goldEarningsPotentialMicrogramSduiConverters, "get(...)");
        MicrogramComponent.Factory factory = this.microgramComponentFactory.get();
        Intrinsics.checkNotNullExpressionValue(factory, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(experimentsStore, goldEarningsPotentialMicrogramSduiConverters, factory, savedStateHandle, duxoBundle);
    }

    /* compiled from: CreateQueuedAchDepositDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JN\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007H\u0007J0\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/CreateQueuedAchDepositDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/transfers/ach/ui/CreateQueuedAchDepositDuxo_Factory;", "experimentsStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "sduiConverters", "Lcom/robinhood/android/goldearningspotential/microgram/GoldEarningsPotentialSduiConverters;", "microgramComponentFactory", "Lmicrogram/android/inject/MicrogramComponent$Factory;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/transfers/ach/ui/CreateQueuedAchDepositDuxo;", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CreateQueuedAchDepositDuxo_Factory create(Provider<ExperimentsStore> experimentsStore, Provider<GoldEarningsPotentialMicrogramSduiConverters> sduiConverters, Provider<MicrogramComponent.Factory> microgramComponentFactory, Provider<SavedStateHandle> savedStateHandle, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(sduiConverters, "sduiConverters");
            Intrinsics.checkNotNullParameter(microgramComponentFactory, "microgramComponentFactory");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new CreateQueuedAchDepositDuxo_Factory(experimentsStore, sduiConverters, microgramComponentFactory, savedStateHandle, duxoBundle);
        }

        @JvmStatic
        public final CreateQueuedAchDepositDuxo newInstance(ExperimentsStore experimentsStore, GoldEarningsPotentialMicrogramSduiConverters sduiConverters, MicrogramComponent.Factory microgramComponentFactory, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(sduiConverters, "sduiConverters");
            Intrinsics.checkNotNullParameter(microgramComponentFactory, "microgramComponentFactory");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new CreateQueuedAchDepositDuxo(experimentsStore, sduiConverters, microgramComponentFactory, savedStateHandle, duxoBundle);
        }
    }
}
