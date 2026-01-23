package com.robinhood.android.advanced.alert.alerthubsettings;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsEvent;
import com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsFragment;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.CurrencyPairStore;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.alert.AlertHubSettingsStore;
import com.robinhood.models.advanced.alert.p302db.AlertHubSettings;
import com.robinhood.models.advanced.alert.p302db.AlertHubSettings2;
import com.robinhood.models.advanced.alert.p302db.AlertHubSettingsItem;
import com.robinhood.models.p320db.Instrument;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AlertHubSettingsDuxo.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 !2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001!B9\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016J\u0016\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020 R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/advanced/alert/alerthubsettings/AlertHubSettingsDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/advanced/alert/alerthubsettings/AlertHubSettingsDataState;", "Lcom/robinhood/android/advanced/alert/alerthubsettings/AlertHubSettingsViewState;", "Lcom/robinhood/android/advanced/alert/alerthubsettings/AlertHubSettingsEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "alertHubSettingsStore", "Lcom/robinhood/librobinhood/data/store/alert/AlertHubSettingsStore;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "currencyPairStore", "Lcom/robinhood/librobinhood/data/store/CurrencyPairStore;", "stateProvider", "Lcom/robinhood/android/advanced/alert/alerthubsettings/AlertHubSettingsStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/alert/AlertHubSettingsStore;Lcom/robinhood/librobinhood/data/store/InstrumentStore;Lcom/robinhood/librobinhood/data/store/CurrencyPairStore;Lcom/robinhood/android/advanced/alert/alerthubsettings/AlertHubSettingsStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "onResume", "removeItem", "id", "Ljava/util/UUID;", "entityType", "Lcom/robinhood/models/advanced/alert/db/AlertHubSettingsEntityType;", "updateAreNotificationsEnabled", "areNotificationsEnabled", "", "Companion", "feature-lib-advanced-alert_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AlertHubSettingsDuxo extends BaseDuxo3<AlertHubSettingsDataState, AlertHubSettingsViewState, AlertHubSettingsEvent> implements HasSavedState {
    private final AlertHubSettingsStore alertHubSettingsStore;
    private final CurrencyPairStore currencyPairStore;
    private final InstrumentStore instrumentStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: AlertHubSettingsDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AlertHubSettings2.values().length];
            try {
                iArr[AlertHubSettings2.STOCK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AlertHubSettings2.CRYPTO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlertHubSettingsDuxo(AlertHubSettingsStore alertHubSettingsStore, InstrumentStore instrumentStore, CurrencyPairStore currencyPairStore, AlertHubSettingsStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new AlertHubSettingsDataState(null, null, null, null, false, 31, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(alertHubSettingsStore, "alertHubSettingsStore");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.alertHubSettingsStore = alertHubSettingsStore;
        this.instrumentStore = instrumentStore;
        this.currencyPairStore = currencyPairStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, this.alertHubSettingsStore.fetchAlertHubSettings(((AlertHubSettingsFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getEntityType()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        }, new Function1() { // from class: com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AlertHubSettingsDuxo.onStart$lambda$1(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(AlertHubSettingsDuxo alertHubSettingsDuxo, Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        alertHubSettingsDuxo.submit(new AlertHubSettingsEvent.FetchResponseError(throwable));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onResume() {
        super.onResume();
        LifecycleHost.DefaultImpls.bind$default(this, this.alertHubSettingsStore.streamAlertHubSettings(((AlertHubSettingsFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getEntityType()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AlertHubSettingsDuxo.onResume$lambda$5(this.f$0, (AlertHubSettings) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$5(final AlertHubSettingsDuxo alertHubSettingsDuxo, AlertHubSettings alertHubSettings) {
        Intrinsics.checkNotNullParameter(alertHubSettings, "alertHubSettings");
        alertHubSettingsDuxo.applyMutation(new AlertHubSettingsDuxo2(alertHubSettings, null));
        List<AlertHubSettingsItem> alertSettings = alertHubSettings.getAlertSettings();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(alertSettings, 10));
        Iterator<T> it = alertSettings.iterator();
        while (it.hasNext()) {
            arrayList.add(((AlertHubSettingsItem) it.next()).getEntityId());
        }
        int i = WhenMappings.$EnumSwitchMapping$0[alertHubSettings.getEntityType().ordinal()];
        if (i == 1) {
            alertHubSettingsDuxo.instrumentStore.pingInstruments(arrayList);
            Observable<List<Instrument>> observableTake = alertHubSettingsDuxo.instrumentStore.getInstruments(arrayList).take(1L);
            Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
            LifecycleHost.DefaultImpls.bind$default(alertHubSettingsDuxo, observableTake, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsDuxo$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AlertHubSettingsDuxo.onResume$lambda$5$lambda$3(this.f$0, (List) obj);
                }
            });
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            alertHubSettingsDuxo.currencyPairStore.refreshAll(false);
            Observable observableTake2 = CurrencyPairStore.streamCurrencyPairs$default(alertHubSettingsDuxo.currencyPairStore, arrayList, false, 2, null).take(1L);
            Intrinsics.checkNotNullExpressionValue(observableTake2, "take(...)");
            LifecycleHost.DefaultImpls.bind$default(alertHubSettingsDuxo, observableTake2, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsDuxo$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AlertHubSettingsDuxo.onResume$lambda$5$lambda$4(this.f$0, (List) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$5$lambda$3(AlertHubSettingsDuxo alertHubSettingsDuxo, List list) {
        alertHubSettingsDuxo.applyMutation(new AlertHubSettingsDuxo3(list, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$5$lambda$4(AlertHubSettingsDuxo alertHubSettingsDuxo, List list) {
        alertHubSettingsDuxo.applyMutation(new AlertHubSettingsDuxo4(list, null));
        return Unit.INSTANCE;
    }

    /* compiled from: AlertHubSettingsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advanced/alert/alerthubsettings/AlertHubSettingsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsDuxo$removeItem$1", m3645f = "AlertHubSettingsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsDuxo$removeItem$1 */
    static final class C84421 extends ContinuationImpl7 implements Function2<AlertHubSettingsDataState, Continuation<? super AlertHubSettingsDataState>, Object> {
        final /* synthetic */ UUID $id;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C84421(UUID uuid, Continuation<? super C84421> continuation) {
            super(2, continuation);
            this.$id = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C84421 c84421 = new C84421(this.$id, continuation);
            c84421.L$0 = obj;
            return c84421;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AlertHubSettingsDataState alertHubSettingsDataState, Continuation<? super AlertHubSettingsDataState> continuation) {
            return ((C84421) create(alertHubSettingsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AlertHubSettingsDataState alertHubSettingsDataState = (AlertHubSettingsDataState) this.L$0;
            return AlertHubSettingsDataState.copy$default(alertHubSettingsDataState, null, null, null, SetsKt.plus(alertHubSettingsDataState.getItemsToBeRemoved(), this.$id), false, 23, null);
        }
    }

    public final void removeItem(final UUID id, AlertHubSettings2 entityType) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(entityType, "entityType");
        applyMutation(new C84421(id, null));
        LifecycleHost.DefaultImpls.bind$default(this, this.alertHubSettingsStore.deleteAlertHubSettingsItem(id, entityType), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AlertHubSettingsDuxo.removeItem$lambda$6(this.f$0, id);
            }
        }, new Function1() { // from class: com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AlertHubSettingsDuxo.removeItem$lambda$7(this.f$0, id, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit removeItem$lambda$6(AlertHubSettingsDuxo alertHubSettingsDuxo, UUID uuid) {
        alertHubSettingsDuxo.applyMutation(new AlertHubSettingsDuxo5(uuid, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit removeItem$lambda$7(AlertHubSettingsDuxo alertHubSettingsDuxo, UUID uuid, Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        alertHubSettingsDuxo.applyMutation(new AlertHubSettingsDuxo6(uuid, null));
        alertHubSettingsDuxo.submit(new AlertHubSettingsEvent.RemoveFromListError(throwable));
        return Unit.INSTANCE;
    }

    /* compiled from: AlertHubSettingsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advanced/alert/alerthubsettings/AlertHubSettingsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsDuxo$updateAreNotificationsEnabled$1", m3645f = "AlertHubSettingsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsDuxo$updateAreNotificationsEnabled$1 */
    static final class C84431 extends ContinuationImpl7 implements Function2<AlertHubSettingsDataState, Continuation<? super AlertHubSettingsDataState>, Object> {
        final /* synthetic */ boolean $areNotificationsEnabled;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C84431(boolean z, Continuation<? super C84431> continuation) {
            super(2, continuation);
            this.$areNotificationsEnabled = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C84431 c84431 = new C84431(this.$areNotificationsEnabled, continuation);
            c84431.L$0 = obj;
            return c84431;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AlertHubSettingsDataState alertHubSettingsDataState, Continuation<? super AlertHubSettingsDataState> continuation) {
            return ((C84431) create(alertHubSettingsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AlertHubSettingsDataState.copy$default((AlertHubSettingsDataState) this.L$0, null, null, null, null, this.$areNotificationsEnabled, 15, null);
        }
    }

    public final void updateAreNotificationsEnabled(boolean areNotificationsEnabled) {
        applyMutation(new C84431(areNotificationsEnabled, null));
    }

    /* compiled from: AlertHubSettingsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/advanced/alert/alerthubsettings/AlertHubSettingsDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/advanced/alert/alerthubsettings/AlertHubSettingsDuxo;", "Lcom/robinhood/android/advanced/alert/alerthubsettings/AlertHubSettingsFragment$Args;", "<init>", "()V", "feature-lib-advanced-alert_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<AlertHubSettingsDuxo, AlertHubSettingsFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AlertHubSettingsFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (AlertHubSettingsFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AlertHubSettingsFragment.Args getArgs(AlertHubSettingsDuxo alertHubSettingsDuxo) {
            return (AlertHubSettingsFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, alertHubSettingsDuxo);
        }
    }
}
