package com.robinhood.android.rhymigration.p245ui.openaccount;

import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.CmSunsetExperiment;
import com.robinhood.librobinhood.CmSunsetExperiment2;
import com.robinhood.librobinhood.CmSunsetExperiment3;
import com.robinhood.librobinhood.CmSunsetExperiment4;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.RhyApplicationStore;
import com.robinhood.models.api.bonfire.ApiRhyApplicationStatus;
import com.robinhood.utils.extensions.ObservablesKt;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.Observables;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;
import p479j$.time.Duration;

/* compiled from: RhyOpenAccountDuxo.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0006\u0010\u0014\u001a\u00020\u0013R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/openaccount/RhyOpenAccountDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/rhymigration/ui/openaccount/RhyOpenAccountViewState;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "rhyApplicationStore", "Lcom/robinhood/librobinhood/data/store/RhyApplicationStore;", "<init>", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/librobinhood/data/store/RhyApplicationStore;)V", "<set-?>", "", "pollingTimeoutSeconds", "getPollingTimeoutSeconds", "()J", "setPollingTimeoutSeconds", "(J)V", "pollingTimeoutSeconds$delegate", "Lkotlin/properties/ReadWriteProperty;", "onStart", "", "setSuccessTransitionAnimationCompleted", "Companion", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class RhyOpenAccountDuxo extends OldBaseDuxo<RhyOpenAccountViewState> {
    private static final long RHY_POLLING_DURATION_SECONDS = 1;
    private final ExperimentsStore experimentsStore;

    /* renamed from: pollingTimeoutSeconds$delegate, reason: from kotlin metadata */
    private final Interfaces3 pollingTimeoutSeconds;
    private final RhyApplicationStore rhyApplicationStore;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(RhyOpenAccountDuxo.class, "pollingTimeoutSeconds", "getPollingTimeoutSeconds()J", 0))};
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RhyOpenAccountDuxo(ExperimentsStore experimentsStore, RhyApplicationStore rhyApplicationStore) {
        super(new RhyOpenAccountViewState(null, false, false, false, 15, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(rhyApplicationStore, "rhyApplicationStore");
        this.experimentsStore = experimentsStore;
        this.rhyApplicationStore = rhyApplicationStore;
        this.pollingTimeoutSeconds = Delegates.INSTANCE.notNull();
    }

    public final long getPollingTimeoutSeconds() {
        return ((Number) this.pollingTimeoutSeconds.getValue(this, $$delegatedProperties[0])).longValue();
    }

    public final void setPollingTimeoutSeconds(long j) {
        this.pollingTimeoutSeconds.setValue(this, $$delegatedProperties[0], Long.valueOf(j));
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, Observables.INSTANCE.combineLatest(ExperimentsProvider.DefaultImpls.streamVariant$default(this.experimentsStore, CmSunsetExperiment.INSTANCE, CmSunsetExperiment2.CONTROL, false, 4, null), ExperimentsProvider.DefaultImpls.streamVariant$default(this.experimentsStore, CmSunsetExperiment3.INSTANCE, CmSunsetExperiment4.CONTROL, false, 4, null)), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.rhymigration.ui.openaccount.RhyOpenAccountDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOpenAccountDuxo.onStart$lambda$1(this.f$0, (Tuples2) obj);
            }
        });
        Observable observableRefCount = getStates().map(new Function() { // from class: com.robinhood.android.rhymigration.ui.openaccount.RhyOpenAccountDuxo$onStart$shouldPollApplicationStatusObservable$1
            @Override // io.reactivex.functions.Function
            public final Boolean apply(RhyOpenAccountViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.getShouldPollApplicationStatus());
            }
        }).distinctUntilChanged().replay(1).refCount();
        Intrinsics.checkNotNullExpressionValue(observableRefCount, "refCount(...)");
        RhyApplicationStore rhyApplicationStore = this.rhyApplicationStore;
        Duration durationOfSeconds = Duration.ofSeconds(1L);
        Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "ofSeconds(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesKt.connectWhen$default(rhyApplicationStore.pollApplicationStatusUntilFinalObservable(durationOfSeconds), observableRefCount, null, 2, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.rhymigration.ui.openaccount.RhyOpenAccountDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOpenAccountDuxo.onStart$lambda$3(this.f$0, (ApiRhyApplicationStatus) obj);
            }
        });
        Observable<Long> observableTimer = Observable.timer(getPollingTimeoutSeconds(), TimeUnit.SECONDS);
        Intrinsics.checkNotNullExpressionValue(observableTimer, "timer(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesKt.connectWhen$default(observableTimer, observableRefCount, null, 2, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.rhymigration.ui.openaccount.RhyOpenAccountDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOpenAccountDuxo.onStart$lambda$5(this.f$0, (Long) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(RhyOpenAccountDuxo rhyOpenAccountDuxo, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        final CmSunsetExperiment2 cmSunsetExperiment2 = (CmSunsetExperiment2) tuples2.component1();
        final CmSunsetExperiment4 cmSunsetExperiment4 = (CmSunsetExperiment4) tuples2.component2();
        rhyOpenAccountDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.rhymigration.ui.openaccount.RhyOpenAccountDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOpenAccountDuxo.onStart$lambda$1$lambda$0(cmSunsetExperiment2, cmSunsetExperiment4, (RhyOpenAccountViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyOpenAccountViewState onStart$lambda$1$lambda$0(CmSunsetExperiment2 cmSunsetExperiment2, CmSunsetExperiment4 cmSunsetExperiment4, RhyOpenAccountViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RhyOpenAccountViewState.copy$default(applyMutation, null, false, false, cmSunsetExperiment2.isCohortOneOrLater() && cmSunsetExperiment4.isMember(), 7, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$3(RhyOpenAccountDuxo rhyOpenAccountDuxo, final ApiRhyApplicationStatus status) {
        Intrinsics.checkNotNullParameter(status, "status");
        rhyOpenAccountDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.rhymigration.ui.openaccount.RhyOpenAccountDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOpenAccountDuxo.onStart$lambda$3$lambda$2(status, (RhyOpenAccountViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyOpenAccountViewState onStart$lambda$3$lambda$2(ApiRhyApplicationStatus apiRhyApplicationStatus, RhyOpenAccountViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RhyOpenAccountViewState.copy$default(applyMutation, apiRhyApplicationStatus, false, false, false, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$5(RhyOpenAccountDuxo rhyOpenAccountDuxo, Long l) {
        rhyOpenAccountDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.rhymigration.ui.openaccount.RhyOpenAccountDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOpenAccountDuxo.onStart$lambda$5$lambda$4((RhyOpenAccountViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyOpenAccountViewState onStart$lambda$5$lambda$4(RhyOpenAccountViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RhyOpenAccountViewState.copy$default(applyMutation, null, true, false, false, 13, null);
    }

    public final void setSuccessTransitionAnimationCompleted() {
        applyMutation(new Function1() { // from class: com.robinhood.android.rhymigration.ui.openaccount.RhyOpenAccountDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOpenAccountDuxo.setSuccessTransitionAnimationCompleted$lambda$6((RhyOpenAccountViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyOpenAccountViewState setSuccessTransitionAnimationCompleted$lambda$6(RhyOpenAccountViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RhyOpenAccountViewState.copy$default(applyMutation, null, false, true, false, 11, null);
    }
}
