package com.robinhood.android.gold.hub;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.engagement.goldeventhub.GoldEventHubManager;
import com.robinhood.android.gold.lib.hub.store.GoldHubStore;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.prefs.IntPreference;
import com.robinhood.prefs.StringToLongMapPreference;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoldHubDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015Bi\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/gold/hub/GoldHubDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/gold/hub/GoldHubDuxo;", "goldHubStore", "Ljavax/inject/Provider;", "Lcom/robinhood/android/gold/lib/hub/store/GoldHubStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "cardCooldownCountPref", "Lcom/robinhood/prefs/IntPreference;", "cardsShownCountPref", "Lcom/robinhood/prefs/StringToLongMapPreference;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "goldEventHubManager", "Lcom/robinhood/android/engagement/goldeventhub/GoldEventHubManager;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-gold-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class GoldHubDuxo_Factory implements Factory<GoldHubDuxo> {
    private final Provider<IntPreference> cardCooldownCountPref;
    private final Provider<StringToLongMapPreference> cardsShownCountPref;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<GoldEventHubManager> goldEventHubManager;
    private final Provider<GoldHubStore> goldHubStore;
    private final Provider<SavedStateHandle> savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final GoldHubDuxo_Factory create(Provider<GoldHubStore> provider, Provider<DuxoBundle> provider2, Provider<IntPreference> provider3, Provider<StringToLongMapPreference> provider4, Provider<ExperimentsStore> provider5, Provider<GoldEventHubManager> provider6, Provider<SavedStateHandle> provider7) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    @JvmStatic
    public static final GoldHubDuxo newInstance(GoldHubStore goldHubStore, DuxoBundle duxoBundle, IntPreference intPreference, StringToLongMapPreference stringToLongMapPreference, ExperimentsStore experimentsStore, GoldEventHubManager goldEventHubManager, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(goldHubStore, duxoBundle, intPreference, stringToLongMapPreference, experimentsStore, goldEventHubManager, savedStateHandle);
    }

    public GoldHubDuxo_Factory(Provider<GoldHubStore> goldHubStore, Provider<DuxoBundle> duxoBundle, Provider<IntPreference> cardCooldownCountPref, Provider<StringToLongMapPreference> cardsShownCountPref, Provider<ExperimentsStore> experimentsStore, Provider<GoldEventHubManager> goldEventHubManager, Provider<SavedStateHandle> savedStateHandle) {
        Intrinsics.checkNotNullParameter(goldHubStore, "goldHubStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(cardCooldownCountPref, "cardCooldownCountPref");
        Intrinsics.checkNotNullParameter(cardsShownCountPref, "cardsShownCountPref");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(goldEventHubManager, "goldEventHubManager");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.goldHubStore = goldHubStore;
        this.duxoBundle = duxoBundle;
        this.cardCooldownCountPref = cardCooldownCountPref;
        this.cardsShownCountPref = cardsShownCountPref;
        this.experimentsStore = experimentsStore;
        this.goldEventHubManager = goldEventHubManager;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // javax.inject.Provider
    public GoldHubDuxo get() {
        Companion companion = INSTANCE;
        GoldHubStore goldHubStore = this.goldHubStore.get();
        Intrinsics.checkNotNullExpressionValue(goldHubStore, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        IntPreference intPreference = this.cardCooldownCountPref.get();
        Intrinsics.checkNotNullExpressionValue(intPreference, "get(...)");
        StringToLongMapPreference stringToLongMapPreference = this.cardsShownCountPref.get();
        Intrinsics.checkNotNullExpressionValue(stringToLongMapPreference, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        GoldEventHubManager goldEventHubManager = this.goldEventHubManager.get();
        Intrinsics.checkNotNullExpressionValue(goldEventHubManager, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        return companion.newInstance(goldHubStore, duxoBundle, intPreference, stringToLongMapPreference, experimentsStore, goldEventHubManager, savedStateHandle);
    }

    /* compiled from: GoldHubDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jj\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0007H\u0007J@\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/gold/hub/GoldHubDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/gold/hub/GoldHubDuxo_Factory;", "goldHubStore", "Ljavax/inject/Provider;", "Lcom/robinhood/android/gold/lib/hub/store/GoldHubStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "cardCooldownCountPref", "Lcom/robinhood/prefs/IntPreference;", "cardsShownCountPref", "Lcom/robinhood/prefs/StringToLongMapPreference;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "goldEventHubManager", "Lcom/robinhood/android/engagement/goldeventhub/GoldEventHubManager;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "newInstance", "Lcom/robinhood/android/gold/hub/GoldHubDuxo;", "feature-gold-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final GoldHubDuxo_Factory create(Provider<GoldHubStore> goldHubStore, Provider<DuxoBundle> duxoBundle, Provider<IntPreference> cardCooldownCountPref, Provider<StringToLongMapPreference> cardsShownCountPref, Provider<ExperimentsStore> experimentsStore, Provider<GoldEventHubManager> goldEventHubManager, Provider<SavedStateHandle> savedStateHandle) {
            Intrinsics.checkNotNullParameter(goldHubStore, "goldHubStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(cardCooldownCountPref, "cardCooldownCountPref");
            Intrinsics.checkNotNullParameter(cardsShownCountPref, "cardsShownCountPref");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(goldEventHubManager, "goldEventHubManager");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new GoldHubDuxo_Factory(goldHubStore, duxoBundle, cardCooldownCountPref, cardsShownCountPref, experimentsStore, goldEventHubManager, savedStateHandle);
        }

        @JvmStatic
        public final GoldHubDuxo newInstance(GoldHubStore goldHubStore, DuxoBundle duxoBundle, IntPreference cardCooldownCountPref, StringToLongMapPreference cardsShownCountPref, ExperimentsStore experimentsStore, GoldEventHubManager goldEventHubManager, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(goldHubStore, "goldHubStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(cardCooldownCountPref, "cardCooldownCountPref");
            Intrinsics.checkNotNullParameter(cardsShownCountPref, "cardsShownCountPref");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(goldEventHubManager, "goldEventHubManager");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new GoldHubDuxo(goldHubStore, duxoBundle, cardCooldownCountPref, cardsShownCountPref, experimentsStore, goldEventHubManager, savedStateHandle);
        }
    }
}
