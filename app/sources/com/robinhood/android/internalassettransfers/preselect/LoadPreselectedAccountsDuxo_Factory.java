package com.robinhood.android.internalassettransfers.preselect;

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

/* compiled from: LoadPreselectedAccountsDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013BM\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0012R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0012¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/preselect/LoadPreselectedAccountsDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/internalassettransfers/preselect/LoadPreselectedAccountsDuxo;", "Ljavax/inject/Provider;", "Lcom/robinhood/internalassettransfers/data/store/InternalAssetTransfersStore;", "internalAssetTransfersStore", "j$/time/Clock", Card.Icon.CLOCK, "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "Lmicrogram/android/inject/MicrogramComponent$Factory;", "microgramComponentFactory", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "()Lcom/robinhood/android/internalassettransfers/preselect/LoadPreselectedAccountsDuxo;", "Ljavax/inject/Provider;", "Companion", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class LoadPreselectedAccountsDuxo_Factory implements Factory<LoadPreselectedAccountsDuxo> {
    private final Provider<Clock> clock;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<InternalAssetTransfersStore> internalAssetTransfersStore;
    private final Provider<MicrogramComponent.Factory> microgramComponentFactory;
    private final Provider<SavedStateHandle> savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final LoadPreselectedAccountsDuxo_Factory create(Provider<InternalAssetTransfersStore> provider, Provider<Clock> provider2, Provider<SavedStateHandle> provider3, Provider<MicrogramComponent.Factory> provider4, Provider<DuxoBundle> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final LoadPreselectedAccountsDuxo newInstance(InternalAssetTransfersStore internalAssetTransfersStore, Clock clock, SavedStateHandle savedStateHandle, MicrogramComponent.Factory factory, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(internalAssetTransfersStore, clock, savedStateHandle, factory, duxoBundle);
    }

    public LoadPreselectedAccountsDuxo_Factory(Provider<InternalAssetTransfersStore> internalAssetTransfersStore, Provider<Clock> clock, Provider<SavedStateHandle> savedStateHandle, Provider<MicrogramComponent.Factory> microgramComponentFactory, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(internalAssetTransfersStore, "internalAssetTransfersStore");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(microgramComponentFactory, "microgramComponentFactory");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.internalAssetTransfersStore = internalAssetTransfersStore;
        this.clock = clock;
        this.savedStateHandle = savedStateHandle;
        this.microgramComponentFactory = microgramComponentFactory;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public LoadPreselectedAccountsDuxo get() {
        Companion companion = INSTANCE;
        InternalAssetTransfersStore internalAssetTransfersStore = this.internalAssetTransfersStore.get();
        Intrinsics.checkNotNullExpressionValue(internalAssetTransfersStore, "get(...)");
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        MicrogramComponent.Factory factory = this.microgramComponentFactory.get();
        Intrinsics.checkNotNullExpressionValue(factory, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(internalAssetTransfersStore, clock, savedStateHandle, factory, duxoBundle);
    }

    /* compiled from: LoadPreselectedAccountsDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JU\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J7\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/preselect/LoadPreselectedAccountsDuxo_Factory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "Lcom/robinhood/internalassettransfers/data/store/InternalAssetTransfersStore;", "internalAssetTransfersStore", "j$/time/Clock", Card.Icon.CLOCK, "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "Lmicrogram/android/inject/MicrogramComponent$Factory;", "microgramComponentFactory", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Lcom/robinhood/android/internalassettransfers/preselect/LoadPreselectedAccountsDuxo_Factory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/robinhood/android/internalassettransfers/preselect/LoadPreselectedAccountsDuxo_Factory;", "Lcom/robinhood/android/internalassettransfers/preselect/LoadPreselectedAccountsDuxo;", "newInstance", "(Lcom/robinhood/internalassettransfers/data/store/InternalAssetTransfersStore;Lj$/time/Clock;Landroidx/lifecycle/SavedStateHandle;Lmicrogram/android/inject/MicrogramComponent$Factory;Lcom/robinhood/android/udf/DuxoBundle;)Lcom/robinhood/android/internalassettransfers/preselect/LoadPreselectedAccountsDuxo;", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final LoadPreselectedAccountsDuxo_Factory create(Provider<InternalAssetTransfersStore> internalAssetTransfersStore, Provider<Clock> clock, Provider<SavedStateHandle> savedStateHandle, Provider<MicrogramComponent.Factory> microgramComponentFactory, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(internalAssetTransfersStore, "internalAssetTransfersStore");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(microgramComponentFactory, "microgramComponentFactory");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new LoadPreselectedAccountsDuxo_Factory(internalAssetTransfersStore, clock, savedStateHandle, microgramComponentFactory, duxoBundle);
        }

        @JvmStatic
        public final LoadPreselectedAccountsDuxo newInstance(InternalAssetTransfersStore internalAssetTransfersStore, Clock clock, SavedStateHandle savedStateHandle, MicrogramComponent.Factory microgramComponentFactory, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(internalAssetTransfersStore, "internalAssetTransfersStore");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(microgramComponentFactory, "microgramComponentFactory");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new LoadPreselectedAccountsDuxo(internalAssetTransfersStore, clock, savedStateHandle, microgramComponentFactory, duxoBundle);
        }
    }
}
