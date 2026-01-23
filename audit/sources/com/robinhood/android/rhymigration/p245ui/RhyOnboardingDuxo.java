package com.robinhood.android.rhymigration.p245ui;

import androidx.lifecycle.SavedStateHandle;
import com.google.android.gms.tapandpay.issuer.PushTokenizeRequest;
import com.robinhood.android.common.mcduckling.util.RhySuvManger;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.udf.DuxoCompanion2;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.CmSunsetExperiment;
import com.robinhood.librobinhood.CmSunsetExperiment2;
import com.robinhood.librobinhood.CmSunsetExperiment3;
import com.robinhood.librobinhood.CmSunsetExperiment4;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.MinervaAccountStore;
import com.robinhood.librobinhood.data.store.bonfire.DirectDepositRelationshipStore;
import com.robinhood.librobinhood.data.store.phoenix.UnifiedAccountStore;
import com.robinhood.librobinhood.data.store.rhy.RhyAccountLoggingStore;
import com.robinhood.librobinhood.store.PaymentCardStore;
import com.robinhood.models.api.minerva.VerificationRequiredException;
import com.robinhood.models.entity.RhEntity;
import com.robinhood.models.p320db.mcduckling.PaymentCard;
import com.robinhood.models.p320db.phoenix.UnifiedAccountV2;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.Throwables;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.rxkotlin.Observables;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.OffsetDateTime;
import p479j$.time.format.DateTimeFormatter;

/* compiled from: RhyOnboardingDuxo.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001.BI\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001bH\u0002J\u0006\u0010\u001d\u001a\u00020\u001bJ\u0006\u0010\u001e\u001a\u00020\u001bJ\u0006\u0010\u001f\u001a\u00020\u001bJ\u0006\u0010 \u001a\u00020\u001bJ\u0006\u0010!\u001a\u00020\u001bJ\u0006\u0010\"\u001a\u00020\u001bJ\u000e\u0010#\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020%J\u0006\u0010&\u001a\u00020\u001bJ\u0006\u0010'\u001a\u00020\u001bJ\u000e\u0010(\u001a\u00020\u001b2\u0006\u0010)\u001a\u00020*J\u0006\u0010+\u001a\u00020\u001bJ\u0006\u0010,\u001a\u00020\u001bJ\u0006\u0010-\u001a\u00020\u001bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006/"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/RhyOnboardingDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/rhymigration/ui/RhyOnboardingViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "minervaAccountStore", "Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;", "unifiedAccountStore", "Lcom/robinhood/librobinhood/data/store/phoenix/UnifiedAccountStore;", "paymentCardStore", "Lcom/robinhood/librobinhood/store/PaymentCardStore;", "directDepositRelationshipStore", "Lcom/robinhood/librobinhood/data/store/bonfire/DirectDepositRelationshipStore;", "rhyAccountLoggingStore", "Lcom/robinhood/librobinhood/data/store/rhy/RhyAccountLoggingStore;", "rhySuvManger", "Lcom/robinhood/android/common/mcduckling/util/RhySuvManger;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;Lcom/robinhood/librobinhood/data/store/phoenix/UnifiedAccountStore;Lcom/robinhood/librobinhood/store/PaymentCardStore;Lcom/robinhood/librobinhood/data/store/bonfire/DirectDepositRelationshipStore;Lcom/robinhood/librobinhood/data/store/rhy/RhyAccountLoggingStore;Lcom/robinhood/android/common/mcduckling/util/RhySuvManger;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "pushTokenizeDisposable", "Lio/reactivex/disposables/Disposable;", "onCreate", "", "fetchExperiment", "fetchCmSunset", "getPushTokenizeEvent", "reviewChangesContinueClicked", "optOutClicked", "shutdownClicked", "upgradeClicked", "cardSelected", "needsAddress", "", "addressConfirmed", "accountCreationCompleteContinueClicked", "transferAmountClicked", "amount", "Ljava/math/BigDecimal;", "transferSkipClicked", "fundingFinishedContinueClicked", "directDepositContinueClicked", "Companion", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class RhyOnboardingDuxo extends OldBaseDuxo<RhyOnboardingViewState> implements HasSavedState {
    private final DirectDepositRelationshipStore directDepositRelationshipStore;
    private final ExperimentsStore experimentsStore;
    private final MinervaAccountStore minervaAccountStore;
    private final PaymentCardStore paymentCardStore;
    private Disposable pushTokenizeDisposable;
    private final RhyAccountLoggingStore rhyAccountLoggingStore;
    private final RhySuvManger rhySuvManger;
    private final SavedStateHandle savedStateHandle;
    private final UnifiedAccountStore unifiedAccountStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RhyOnboardingDuxo(ExperimentsStore experimentsStore, MinervaAccountStore minervaAccountStore, UnifiedAccountStore unifiedAccountStore, PaymentCardStore paymentCardStore, DirectDepositRelationshipStore directDepositRelationshipStore, RhyAccountLoggingStore rhyAccountLoggingStore, RhySuvManger rhySuvManger, SavedStateHandle savedStateHandle) {
        super(new RhyOnboardingViewState(null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 16777215, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(minervaAccountStore, "minervaAccountStore");
        Intrinsics.checkNotNullParameter(unifiedAccountStore, "unifiedAccountStore");
        Intrinsics.checkNotNullParameter(paymentCardStore, "paymentCardStore");
        Intrinsics.checkNotNullParameter(directDepositRelationshipStore, "directDepositRelationshipStore");
        Intrinsics.checkNotNullParameter(rhyAccountLoggingStore, "rhyAccountLoggingStore");
        Intrinsics.checkNotNullParameter(rhySuvManger, "rhySuvManger");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.experimentsStore = experimentsStore;
        this.minervaAccountStore = minervaAccountStore;
        this.unifiedAccountStore = unifiedAccountStore;
        this.paymentCardStore = paymentCardStore;
        this.directDepositRelationshipStore = directDepositRelationshipStore;
        this.rhyAccountLoggingStore = rhyAccountLoggingStore;
        this.rhySuvManger = rhySuvManger;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        fetchExperiment();
        this.rhyAccountLoggingStore.refresh(true);
        this.unifiedAccountStore.refresh(true);
        Observable<UnifiedAccountV2> observableDistinctUntilChanged = this.unifiedAccountStore.streamIndividualAccount().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.rhymigration.ui.RhyOnboardingDuxo$$ExternalSyntheticLambda30
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOnboardingDuxo.onCreate$lambda$1(this.f$0, (UnifiedAccountV2) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, DirectDepositRelationshipStore.forceFetchHasDirectDepositRelationshipsIfNotCached$default(this.directDepositRelationshipStore, RhEntity.RHS, null, 2, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.rhymigration.ui.RhyOnboardingDuxo$$ExternalSyntheticLambda31
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOnboardingDuxo.onCreate$lambda$3(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(RhyOnboardingDuxo rhyOnboardingDuxo, final UnifiedAccountV2 unifiedAccountV2) {
        rhyOnboardingDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.rhymigration.ui.RhyOnboardingDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOnboardingDuxo.onCreate$lambda$1$lambda$0(unifiedAccountV2, (RhyOnboardingViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyOnboardingViewState onCreate$lambda$1$lambda$0(UnifiedAccountV2 unifiedAccountV2, RhyOnboardingViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RhyOnboardingViewState.copy$default(applyMutation, null, null, null, false, null, null, null, null, null, null, null, null, null, null, unifiedAccountV2, null, null, null, false, null, null, null, null, null, 16760831, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$3(RhyOnboardingDuxo rhyOnboardingDuxo, final boolean z) {
        rhyOnboardingDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.rhymigration.ui.RhyOnboardingDuxo$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOnboardingDuxo.onCreate$lambda$3$lambda$2(z, (RhyOnboardingViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyOnboardingViewState onCreate$lambda$3$lambda$2(boolean z, RhyOnboardingViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RhyOnboardingViewState.copy$default(applyMutation, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, z, null, null, null, null, null, 16515071, null);
    }

    private final void fetchExperiment() {
        if (((LegacyIntentKey.RhyMigrationOnboarding) INSTANCE.getExtras((HasSavedState) this)).getForceUseOrganicMigration()) {
            applyMutation(new Function1() { // from class: com.robinhood.android.rhymigration.ui.RhyOnboardingDuxo$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RhyOnboardingDuxo.fetchExperiment$lambda$4((RhyOnboardingViewState) obj);
                }
            });
        } else {
            LifecycleHost.DefaultImpls.bind$default(this, Observables.INSTANCE.combineLatest(ExperimentsProvider.DefaultImpls.streamVariant$default(this.experimentsStore, CmSunsetExperiment.INSTANCE, CmSunsetExperiment2.CONTROL, false, 4, null), ExperimentsProvider.DefaultImpls.streamVariant$default(this.experimentsStore, CmSunsetExperiment3.INSTANCE, CmSunsetExperiment4.CONTROL, false, 4, null)), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.rhymigration.ui.RhyOnboardingDuxo$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RhyOnboardingDuxo.fetchExperiment$lambda$6(this.f$0, (Tuples2) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyOnboardingViewState fetchExperiment$lambda$4(RhyOnboardingViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RhyOnboardingViewState.copy$default(applyMutation, new UiEvent(CmSunsetExperiment4.CONTROL), null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 16777214, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fetchExperiment$lambda$6(RhyOnboardingDuxo rhyOnboardingDuxo, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        final CmSunsetExperiment2 cmSunsetExperiment2 = (CmSunsetExperiment2) tuples2.component1();
        final CmSunsetExperiment4 cmSunsetExperiment4 = (CmSunsetExperiment4) tuples2.component2();
        rhyOnboardingDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.rhymigration.ui.RhyOnboardingDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOnboardingDuxo.fetchExperiment$lambda$6$lambda$5(cmSunsetExperiment4, cmSunsetExperiment2, (RhyOnboardingViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyOnboardingViewState fetchExperiment$lambda$6$lambda$5(CmSunsetExperiment4 cmSunsetExperiment4, CmSunsetExperiment2 cmSunsetExperiment2, RhyOnboardingViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RhyOnboardingViewState.copy$default(applyMutation, new UiEvent(cmSunsetExperiment4), cmSunsetExperiment4, cmSunsetExperiment2, cmSunsetExperiment2.isCohortOneOrLater() && cmSunsetExperiment4.isMember(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 16777200, null);
    }

    public final void fetchCmSunset() {
        this.minervaAccountStore.refresh(true);
        LifecycleHost.DefaultImpls.bind$default(this, this.minervaAccountStore.getCmSunset(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.rhymigration.ui.RhyOnboardingDuxo$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOnboardingDuxo.fetchCmSunset$lambda$10(this.f$0, (MinervaAccountStore.SunsetDetailsResult) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.rhymigration.ui.RhyOnboardingDuxo$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOnboardingDuxo.fetchCmSunset$lambda$11((Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fetchCmSunset$lambda$10(RhyOnboardingDuxo rhyOnboardingDuxo, final MinervaAccountStore.SunsetDetailsResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof MinervaAccountStore.SunsetDetailsResult.Success) {
            if (((MinervaAccountStore.SunsetDetailsResult.Success) it).getCmSunset().getCm_shutdown_date() != null) {
                rhyOnboardingDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.rhymigration.ui.RhyOnboardingDuxo$$ExternalSyntheticLambda21
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return RhyOnboardingDuxo.fetchCmSunset$lambda$10$lambda$7(it, (RhyOnboardingViewState) obj);
                    }
                });
            } else {
                rhyOnboardingDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.rhymigration.ui.RhyOnboardingDuxo$$ExternalSyntheticLambda22
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return RhyOnboardingDuxo.fetchCmSunset$lambda$10$lambda$8(it, (RhyOnboardingViewState) obj);
                    }
                });
            }
        } else {
            if (!(it instanceof MinervaAccountStore.SunsetDetailsResult.NoAccountFound)) {
                throw new NoWhenBranchMatchedException();
            }
            rhyOnboardingDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.rhymigration.ui.RhyOnboardingDuxo$$ExternalSyntheticLambda23
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RhyOnboardingDuxo.fetchCmSunset$lambda$10$lambda$9((RhyOnboardingViewState) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyOnboardingViewState fetchCmSunset$lambda$10$lambda$7(MinervaAccountStore.SunsetDetailsResult sunsetDetailsResult, RhyOnboardingViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        MinervaAccountStore.SunsetDetailsResult.Success success = (MinervaAccountStore.SunsetDetailsResult.Success) sunsetDetailsResult;
        OffsetDateTime cm_shutdown_date = success.getCmSunset().getCm_shutdown_date();
        return RhyOnboardingViewState.copy$default(applyMutation, null, null, null, false, null, null, null, null, null, null, null, cm_shutdown_date != null ? cm_shutdown_date.format(DateTimeFormatter.ofPattern("MMM dd")) : null, success.getCmSunset().getMigration_block_reason(), null, null, null, null, null, false, null, null, null, null, null, 16771071, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyOnboardingViewState fetchCmSunset$lambda$10$lambda$8(MinervaAccountStore.SunsetDetailsResult sunsetDetailsResult, RhyOnboardingViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RhyOnboardingViewState.copy$default(applyMutation, null, null, null, false, null, null, null, null, null, null, null, "", ((MinervaAccountStore.SunsetDetailsResult.Success) sunsetDetailsResult).getCmSunset().getMigration_block_reason(), null, null, null, null, null, false, null, null, null, null, null, 16771071, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyOnboardingViewState fetchCmSunset$lambda$10$lambda$9(RhyOnboardingViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RhyOnboardingViewState.copy$default(applyMutation, null, null, null, false, null, null, null, null, null, null, null, null, null, new UiEvent(Unit.INSTANCE), null, null, null, null, false, null, null, null, null, null, 16769023, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fetchCmSunset$lambda$11(Throwable t) throws Throwable {
        Intrinsics.checkNotNullParameter(t, "t");
        if (!Throwables.isNetworkRelated(t)) {
            throw t;
        }
        return Unit.INSTANCE;
    }

    public final void getPushTokenizeEvent() {
        Disposable disposable = this.pushTokenizeDisposable;
        if (disposable == null || disposable.getDisposed()) {
            this.pushTokenizeDisposable = LifecycleHost.DefaultImpls.bind$default(this, this.rhySuvManger.getPushTokenizeEvent(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.rhymigration.ui.RhyOnboardingDuxo$$ExternalSyntheticLambda25
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RhyOnboardingDuxo.getPushTokenizeEvent$lambda$13(this.f$0, (PushTokenizeRequest) obj);
                }
            }, new Function1() { // from class: com.robinhood.android.rhymigration.ui.RhyOnboardingDuxo$$ExternalSyntheticLambda26
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RhyOnboardingDuxo.getPushTokenizeEvent$lambda$16(this.f$0, (Throwable) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getPushTokenizeEvent$lambda$13(RhyOnboardingDuxo rhyOnboardingDuxo, final PushTokenizeRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        rhyOnboardingDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.rhymigration.ui.RhyOnboardingDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOnboardingDuxo.getPushTokenizeEvent$lambda$13$lambda$12(request, (RhyOnboardingViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyOnboardingViewState getPushTokenizeEvent$lambda$13$lambda$12(PushTokenizeRequest pushTokenizeRequest, RhyOnboardingViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RhyOnboardingViewState.copy$default(applyMutation, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, new UiEvent(pushTokenizeRequest), null, null, 14680063, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getPushTokenizeEvent$lambda$16(RhyOnboardingDuxo rhyOnboardingDuxo, final Throwable error) throws Throwable {
        Intrinsics.checkNotNullParameter(error, "error");
        if (error instanceof VerificationRequiredException) {
            rhyOnboardingDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.rhymigration.ui.RhyOnboardingDuxo$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RhyOnboardingDuxo.getPushTokenizeEvent$lambda$16$lambda$14(error, (RhyOnboardingViewState) obj);
                }
            });
        } else {
            if (!Throwables.isNetworkRelated(error)) {
                throw error;
            }
            rhyOnboardingDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.rhymigration.ui.RhyOnboardingDuxo$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RhyOnboardingDuxo.getPushTokenizeEvent$lambda$16$lambda$15((RhyOnboardingViewState) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyOnboardingViewState getPushTokenizeEvent$lambda$16$lambda$14(Throwable th, RhyOnboardingViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RhyOnboardingViewState.copy$default(applyMutation, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, new UiEvent(th), null, 12582911, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyOnboardingViewState getPushTokenizeEvent$lambda$16$lambda$15(RhyOnboardingViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RhyOnboardingViewState.copy$default(applyMutation, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, new UiEvent(Unit.INSTANCE), 8388607, null);
    }

    public final void reviewChangesContinueClicked() {
        applyMutation(new Function1() { // from class: com.robinhood.android.rhymigration.ui.RhyOnboardingDuxo$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOnboardingDuxo.reviewChangesContinueClicked$lambda$17((RhyOnboardingViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyOnboardingViewState reviewChangesContinueClicked$lambda$17(RhyOnboardingViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RhyOnboardingViewState.copy$default(applyMutation, null, null, null, false, new UiEvent(Unit.INSTANCE), null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 16777199, null);
    }

    public final void optOutClicked() {
        applyMutation(new Function1() { // from class: com.robinhood.android.rhymigration.ui.RhyOnboardingDuxo$$ExternalSyntheticLambda24
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOnboardingDuxo.optOutClicked$lambda$18((RhyOnboardingViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyOnboardingViewState optOutClicked$lambda$18(RhyOnboardingViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RhyOnboardingViewState.copy$default(applyMutation, null, null, null, false, null, new UiEvent(Unit.INSTANCE), null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 16777183, null);
    }

    public final void shutdownClicked() {
        LifecycleHost.DefaultImpls.bind$default(this, this.minervaAccountStore.cmSunsetOptOut(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.rhymigration.ui.RhyOnboardingDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RhyOnboardingDuxo.shutdownClicked$lambda$20(this.f$0);
            }
        }, new Function1() { // from class: com.robinhood.android.rhymigration.ui.RhyOnboardingDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOnboardingDuxo.shutdownClicked$lambda$22(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit shutdownClicked$lambda$20(RhyOnboardingDuxo rhyOnboardingDuxo) {
        rhyOnboardingDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.rhymigration.ui.RhyOnboardingDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOnboardingDuxo.shutdownClicked$lambda$20$lambda$19((RhyOnboardingViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyOnboardingViewState shutdownClicked$lambda$20$lambda$19(RhyOnboardingViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RhyOnboardingViewState.copy$default(applyMutation, null, null, null, false, null, null, new UiEvent(Boolean.TRUE), null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 16777151, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit shutdownClicked$lambda$22(RhyOnboardingDuxo rhyOnboardingDuxo, Throwable t) throws Throwable {
        Intrinsics.checkNotNullParameter(t, "t");
        if (Throwables.isNetworkRelated(t)) {
            rhyOnboardingDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.rhymigration.ui.RhyOnboardingDuxo$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RhyOnboardingDuxo.shutdownClicked$lambda$22$lambda$21((RhyOnboardingViewState) obj);
                }
            });
            return Unit.INSTANCE;
        }
        throw t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyOnboardingViewState shutdownClicked$lambda$22$lambda$21(RhyOnboardingViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RhyOnboardingViewState.copy$default(applyMutation, null, null, null, false, null, null, new UiEvent(Boolean.FALSE), null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 16777151, null);
    }

    public final void upgradeClicked() {
        applyMutation(new Function1() { // from class: com.robinhood.android.rhymigration.ui.RhyOnboardingDuxo$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOnboardingDuxo.upgradeClicked$lambda$23((RhyOnboardingViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyOnboardingViewState upgradeClicked$lambda$23(RhyOnboardingViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RhyOnboardingViewState.copy$default(applyMutation, null, null, null, false, null, null, null, new UiEvent(Unit.INSTANCE), null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 16777087, null);
    }

    public final void cardSelected(final boolean needsAddress) {
        applyMutation(new Function1() { // from class: com.robinhood.android.rhymigration.ui.RhyOnboardingDuxo$$ExternalSyntheticLambda29
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOnboardingDuxo.cardSelected$lambda$24(needsAddress, (RhyOnboardingViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyOnboardingViewState cardSelected$lambda$24(boolean z, RhyOnboardingViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RhyOnboardingViewState.copy$default(applyMutation, null, null, null, false, null, null, null, null, new UiEvent(Boolean.valueOf(z)), null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 16776959, null);
    }

    public final void addressConfirmed() {
        applyMutation(new Function1() { // from class: com.robinhood.android.rhymigration.ui.RhyOnboardingDuxo$$ExternalSyntheticLambda28
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOnboardingDuxo.addressConfirmed$lambda$25((RhyOnboardingViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyOnboardingViewState addressConfirmed$lambda$25(RhyOnboardingViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RhyOnboardingViewState.copy$default(applyMutation, null, null, null, false, null, null, null, null, null, new UiEvent(Unit.INSTANCE), null, null, null, null, null, null, null, null, false, null, null, null, null, null, 16776703, null);
    }

    public final void accountCreationCompleteContinueClicked() {
        this.minervaAccountStore.refresh(true);
        this.paymentCardStore.refresh(true);
        applyMutation(new Function1() { // from class: com.robinhood.android.rhymigration.ui.RhyOnboardingDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOnboardingDuxo.accountCreationCompleteContinueClicked$lambda$26((RhyOnboardingViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyOnboardingViewState accountCreationCompleteContinueClicked$lambda$26(RhyOnboardingViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RhyOnboardingViewState.copy$default(applyMutation, null, null, null, false, null, null, null, null, null, null, new UiEvent(Unit.INSTANCE), null, null, null, null, null, null, null, false, null, null, null, null, null, 16776191, null);
    }

    public final void transferAmountClicked(final BigDecimal amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        applyMutation(new Function1() { // from class: com.robinhood.android.rhymigration.ui.RhyOnboardingDuxo$$ExternalSyntheticLambda27
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOnboardingDuxo.transferAmountClicked$lambda$27(amount, (RhyOnboardingViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyOnboardingViewState transferAmountClicked$lambda$27(BigDecimal bigDecimal, RhyOnboardingViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RhyOnboardingViewState.copy$default(applyMutation, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, bigDecimal, new UiEvent(Unit.INSTANCE), null, false, null, null, null, null, null, 16678911, null);
    }

    public final void transferSkipClicked() {
        applyMutation(new Function1() { // from class: com.robinhood.android.rhymigration.ui.RhyOnboardingDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOnboardingDuxo.transferSkipClicked$lambda$28((RhyOnboardingViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyOnboardingViewState transferSkipClicked$lambda$28(RhyOnboardingViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RhyOnboardingViewState.copy$default(applyMutation, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, new UiEvent(Unit.INSTANCE), false, null, null, null, null, null, 16646143, null);
    }

    public final void fundingFinishedContinueClicked() {
        applyMutation(new Function1() { // from class: com.robinhood.android.rhymigration.ui.RhyOnboardingDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOnboardingDuxo.fundingFinishedContinueClicked$lambda$29((RhyOnboardingViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyOnboardingViewState fundingFinishedContinueClicked$lambda$29(RhyOnboardingViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RhyOnboardingViewState.copy$default(applyMutation, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, new UiEvent(Unit.INSTANCE), null, null, null, null, 16252927, null);
    }

    public final void directDepositContinueClicked() {
        this.minervaAccountStore.refresh(true);
        this.paymentCardStore.refresh(true);
        Single<PaymentCard> singleFirstOrError = this.paymentCardStore.streamActiveRhyCard().firstOrError();
        Intrinsics.checkNotNullExpressionValue(singleFirstOrError, "firstOrError(...)");
        LifecycleHost.DefaultImpls.bind$default(this, singleFirstOrError, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.rhymigration.ui.RhyOnboardingDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOnboardingDuxo.directDepositContinueClicked$lambda$31(this.f$0, (PaymentCard) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit directDepositContinueClicked$lambda$31(RhyOnboardingDuxo rhyOnboardingDuxo, final PaymentCard paymentCard) {
        rhyOnboardingDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.rhymigration.ui.RhyOnboardingDuxo$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOnboardingDuxo.directDepositContinueClicked$lambda$31$lambda$30(paymentCard, (RhyOnboardingViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyOnboardingViewState directDepositContinueClicked$lambda$31$lambda$30(PaymentCard paymentCard, RhyOnboardingViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RhyOnboardingViewState.copy$default(applyMutation, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, new UiEvent(paymentCard), null, null, null, 15728639, null);
    }

    /* compiled from: RhyOnboardingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/RhyOnboardingDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoActivityCompanion;", "Lcom/robinhood/android/rhymigration/ui/RhyOnboardingDuxo;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$RhyMigrationOnboarding;", "<init>", "()V", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion2<RhyOnboardingDuxo, LegacyIntentKey.RhyMigrationOnboarding> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion2
        public LegacyIntentKey.RhyMigrationOnboarding getExtras(SavedStateHandle savedStateHandle) {
            return (LegacyIntentKey.RhyMigrationOnboarding) DuxoCompanion2.DefaultImpls.getExtras(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion2
        public LegacyIntentKey.RhyMigrationOnboarding getExtras(RhyOnboardingDuxo rhyOnboardingDuxo) {
            return (LegacyIntentKey.RhyMigrationOnboarding) DuxoCompanion2.DefaultImpls.getExtras(this, rhyOnboardingDuxo);
        }
    }
}
