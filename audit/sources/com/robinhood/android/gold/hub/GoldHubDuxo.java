package com.robinhood.android.gold.hub;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.engagement.goldeventhub.GoldEventHubManager;
import com.robinhood.android.engagement.goldeventhub.GoldHoodMonth2025Experiment;
import com.robinhood.android.gold.contracts.GoldHubFragmentKey;
import com.robinhood.android.gold.hub.GoldHubViewState;
import com.robinhood.android.gold.hub.data.pref.GoldHubCardCooldownCountPref;
import com.robinhood.android.gold.hub.data.pref.GoldHubCardsShownCountPref;
import com.robinhood.android.gold.hub.experiments.GoldDowngradeEnhancementsExperiment;
import com.robinhood.android.gold.lib.hub.api.ApiGoldHub;
import com.robinhood.android.gold.lib.hub.api.ApiGoldHubCard;
import com.robinhood.android.gold.lib.hub.api.ApiGoldHubCardSection;
import com.robinhood.android.gold.lib.hub.store.GoldHubStore;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.prefs.IntPreference;
import com.robinhood.prefs.StringToLongMapPreference;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import io.reactivex.rxkotlin.Observables;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoldHubDuxo.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001&BE\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u001fH\u0016J\b\u0010!\u001a\u00020\u001fH\u0016J\u0014\u0010\"\u001a\u0004\u0018\u00010\u001d2\b\u0010#\u001a\u0004\u0018\u00010$H\u0002J\u0006\u0010%\u001a\u00020\u001fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/gold/hub/GoldHubDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/gold/hub/GoldHubViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "goldHubStore", "Lcom/robinhood/android/gold/lib/hub/store/GoldHubStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "cardCooldownCountPref", "Lcom/robinhood/prefs/IntPreference;", "cardsShownCountPref", "Lcom/robinhood/prefs/StringToLongMapPreference;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "goldEventHubManager", "Lcom/robinhood/android/engagement/goldeventhub/GoldEventHubManager;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/gold/lib/hub/store/GoldHubStore;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/prefs/IntPreference;Lcom/robinhood/prefs/StringToLongMapPreference;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/android/engagement/goldeventhub/GoldEventHubManager;Landroidx/lifecycle/SavedStateHandle;)V", "getCardCooldownCountPref", "()Lcom/robinhood/prefs/IntPreference;", "getCardsShownCountPref", "()Lcom/robinhood/prefs/StringToLongMapPreference;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "lastGoldHub", "Lcom/robinhood/android/gold/lib/hub/api/ApiGoldHub;", "cardToShow", "Lcom/robinhood/android/gold/lib/hub/api/ApiGoldHubCard;", "onCreate", "", "onStart", "onStop", "getCardToShow", "cardSection", "Lcom/robinhood/android/gold/lib/hub/api/ApiGoldHubCardSection;", "logDowngradeEnhancementsExperiments", "Companion", "feature-gold-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class GoldHubDuxo extends BaseDuxo4<GoldHubViewState> implements HasSavedState {
    private final IntPreference cardCooldownCountPref;
    private ApiGoldHubCard cardToShow;
    private final StringToLongMapPreference cardsShownCountPref;
    private final ExperimentsStore experimentsStore;
    private final GoldEventHubManager goldEventHubManager;
    private final GoldHubStore goldHubStore;
    private ApiGoldHub lastGoldHub;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public final IntPreference getCardCooldownCountPref() {
        return this.cardCooldownCountPref;
    }

    public final StringToLongMapPreference getCardsShownCountPref() {
        return this.cardsShownCountPref;
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoldHubDuxo(GoldHubStore goldHubStore, DuxoBundle duxoBundle, @GoldHubCardCooldownCountPref IntPreference cardCooldownCountPref, @GoldHubCardsShownCountPref StringToLongMapPreference cardsShownCountPref, ExperimentsStore experimentsStore, GoldEventHubManager goldEventHubManager, SavedStateHandle savedStateHandle) {
        super(GoldHubViewState.Loading.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(goldHubStore, "goldHubStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(cardCooldownCountPref, "cardCooldownCountPref");
        Intrinsics.checkNotNullParameter(cardsShownCountPref, "cardsShownCountPref");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(goldEventHubManager, "goldEventHubManager");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.goldHubStore = goldHubStore;
        this.cardCooldownCountPref = cardCooldownCountPref;
        this.cardsShownCountPref = cardsShownCountPref;
        this.experimentsStore = experimentsStore;
        this.goldEventHubManager = goldEventHubManager;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        this.lastGoldHub = null;
        this.cardToShow = null;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        IdlingResourceCounters2.setBusy(IdlingResourceType.GOLD_HUB_LOADING, true);
        super.onStart();
        this.goldEventHubManager.notifyScreenStateChanged(true);
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, Observables.INSTANCE.combineLatest(this.goldHubStore.streamGoldHub(), ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{GoldHoodMonth2025Experiment.INSTANCE}, false, null, 6, null)), (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.gold.hub.GoldHubDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GoldHubDuxo.onStart$lambda$1(this.f$0, (Tuples2) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.gold.hub.GoldHubDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GoldHubDuxo.onStart$lambda$2(this.f$0, (Throwable) obj);
            }
        }, null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(GoldHubDuxo goldHubDuxo, Tuples2 tuples2) {
        ApiGoldHubCardSection cardSection;
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        ApiGoldHub apiGoldHub = (ApiGoldHub) tuples2.component1();
        boolean zBooleanValue = ((Boolean) tuples2.component2()).booleanValue();
        IdlingResourceCounters2.setBusy(IdlingResourceType.GOLD_HUB_LOADING, false);
        if (goldHubDuxo.lastGoldHub == null) {
            goldHubDuxo.cardToShow = goldHubDuxo.getCardToShow(apiGoldHub.getCardSection());
        } else if (goldHubDuxo.cardToShow != null && (cardSection = apiGoldHub.getCardSection()) != null && !CollectionsKt.contains(cardSection.getCards(), goldHubDuxo.cardToShow)) {
            goldHubDuxo.cardToShow = null;
        }
        goldHubDuxo.lastGoldHub = apiGoldHub;
        goldHubDuxo.applyMutation(new GoldHubDuxo2(apiGoldHub, goldHubDuxo, zBooleanValue, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$2(GoldHubDuxo goldHubDuxo, Throwable t) {
        Intrinsics.checkNotNullParameter(t, "t");
        IdlingResourceCounters2.setBusy(IdlingResourceType.GOLD_HUB_LOADING, false);
        goldHubDuxo.applyMutation(new GoldHubDuxo3(t, null));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStop() {
        super.onStop();
        this.goldEventHubManager.notifyScreenStateChanged(false);
    }

    private final ApiGoldHubCard getCardToShow(ApiGoldHubCardSection cardSection) {
        if (cardSection == null) {
            return null;
        }
        int i = this.cardCooldownCountPref.get();
        if (i > 0) {
            this.cardCooldownCountPref.set(i - 1);
            return null;
        }
        Map<String, Long> mutableMap = MapsKt.toMutableMap(this.cardsShownCountPref.getValues());
        for (ApiGoldHubCard apiGoldHubCard : cardSection.getCards()) {
            long jLongValue = mutableMap.getOrDefault(apiGoldHubCard.getId(), 0L).longValue();
            if (jLongValue < cardSection.getMaxImpressions()) {
                long j = jLongValue + 1;
                mutableMap.put(apiGoldHubCard.getId(), Long.valueOf(j));
                this.cardsShownCountPref.setValues(mutableMap);
                if (((int) j) == cardSection.getMaxImpressions()) {
                    this.cardCooldownCountPref.set(cardSection.getCooldown());
                }
                return apiGoldHubCard;
            }
        }
        return null;
    }

    public final void logDowngradeEnhancementsExperiments() {
        ExperimentsProvider.DefaultImpls.streamVariant$default(this.experimentsStore, GoldDowngradeEnhancementsExperiment.INSTANCE, GoldDowngradeEnhancementsExperiment.Variant.CONTROL, false, 4, null).subscribe();
    }

    /* compiled from: GoldHubDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/gold/hub/GoldHubDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/gold/hub/GoldHubDuxo;", "Lcom/robinhood/android/gold/contracts/GoldHubFragmentKey;", "<init>", "()V", "feature-gold-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<GoldHubDuxo, GoldHubFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public GoldHubFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (GoldHubFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public GoldHubFragmentKey getArgs(GoldHubDuxo goldHubDuxo) {
            return (GoldHubFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, goldHubDuxo);
        }
    }
}
