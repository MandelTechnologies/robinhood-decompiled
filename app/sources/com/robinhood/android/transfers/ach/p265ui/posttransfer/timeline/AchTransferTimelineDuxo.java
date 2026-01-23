package com.robinhood.android.transfers.ach.p265ui.posttransfer.timeline;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.margin.LeveredMarginSettingsStore;
import com.robinhood.android.lib.margin.p167db.models.MarginSettings;
import com.robinhood.android.transfers.ach.p265ui.posttransfer.timeline.AchTransferTimelineFragment;
import com.robinhood.android.transfers.ach.p265ui.posttransfer.timeline.AchTransferTimelineState;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.AchRelationshipStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.phoenix.UnifiedAccountStore;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.models.p320db.phoenix.UnifiedAccountV2;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.logging.TimberLogger;
import io.reactivex.Observable;
import io.reactivex.functions.Function5;
import io.reactivex.rxkotlin.Observables;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import retrofit2.HttpException;

/* compiled from: AchTransferTimelineDuxo.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0018BA\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0016\u001a\u00020\u0017H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/AchTransferTimelineDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/AchTransferTimelineState;", "Lcom/robinhood/android/udf/HasSavedState;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "achRelationshipStore", "Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "marginSettingsStore", "Lcom/robinhood/android/lib/margin/LeveredMarginSettingsStore;", "unifiedAccountStore", "Lcom/robinhood/librobinhood/data/store/phoenix/UnifiedAccountStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/android/lib/margin/LeveredMarginSettingsStore;Lcom/robinhood/librobinhood/data/store/phoenix/UnifiedAccountStore;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "Companion", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class AchTransferTimelineDuxo extends BaseDuxo4<AchTransferTimelineState> implements HasSavedState {
    private final AccountProvider accountProvider;
    private final AchRelationshipStore achRelationshipStore;
    private final ExperimentsStore experimentsStore;
    private final LeveredMarginSettingsStore marginSettingsStore;
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
    public AchTransferTimelineDuxo(AccountProvider accountProvider, AchRelationshipStore achRelationshipStore, ExperimentsStore experimentsStore, LeveredMarginSettingsStore marginSettingsStore, UnifiedAccountStore unifiedAccountStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(AchTransferTimelineState.Loading.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(achRelationshipStore, "achRelationshipStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(marginSettingsStore, "marginSettingsStore");
        Intrinsics.checkNotNullParameter(unifiedAccountStore, "unifiedAccountStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.accountProvider = accountProvider;
        this.achRelationshipStore = achRelationshipStore;
        this.experimentsStore = experimentsStore;
        this.marginSettingsStore = marginSettingsStore;
        this.unifiedAccountStore = unifiedAccountStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        this.achRelationshipStore.refresh(false);
        Observable observableTake = ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{Experiment.CASH_LIMITED_INTEREST.INSTANCE}, false, null, 6, null).take(1L);
        Observables observables = Observables.INSTANCE;
        Observable<AchRelationship> achRelationship = this.achRelationshipStore.getAchRelationship(((AchTransferTimelineFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getAchTransfer().getAchRelationshipId());
        Observable<Account> individualAccountForced = this.accountProvider.getIndividualAccountForced();
        Observable<UnifiedAccountV2> observable = this.unifiedAccountStore.getIndividualAccountForced().toObservable();
        Intrinsics.checkNotNullExpressionValue(observable, "toObservable(...)");
        Observable<MarginSettings> observableStreamMarginSettingsIndividual = this.marginSettingsStore.streamMarginSettingsIndividual();
        Intrinsics.checkNotNull(observableTake);
        Observable observableCombineLatest = Observable.combineLatest(achRelationship, individualAccountForced, observable, observableStreamMarginSettingsIndividual, observableTake, new Function5<T1, T2, T3, T4, T5, R>() { // from class: com.robinhood.android.transfers.ach.ui.posttransfer.timeline.AchTransferTimelineDuxo$onCreate$$inlined$combineLatest$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function5
            public final R apply(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
                Intrinsics.checkParameterIsNotNull(t1, "t1");
                Intrinsics.checkParameterIsNotNull(t2, "t2");
                Intrinsics.checkParameterIsNotNull(t3, "t3");
                Intrinsics.checkParameterIsNotNull(t4, "t4");
                Intrinsics.checkParameterIsNotNull(t5, "t5");
                UnifiedAccountV2 unifiedAccountV2 = (UnifiedAccountV2) t3;
                Account account = (Account) t2;
                return (R) new AchTransferTimelineState.Loaded((AchRelationship) t1, ((AchTransferTimelineFragment.Args) AchTransferTimelineDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getAchTransfer(), account, unifiedAccountV2, (MarginSettings) t4, ((Boolean) t5).booleanValue());
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observableCombineLatest, "Observable.combineLatest…on(t1, t2, t3, t4, t5) })");
        Observable observableDistinctUntilChanged = observableCombineLatest.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.transfers.ach.ui.posttransfer.timeline.AchTransferTimelineDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AchTransferTimelineDuxo.onCreate$lambda$1(this.f$0, (AchTransferTimelineState.Loaded) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.transfers.ach.ui.posttransfer.timeline.AchTransferTimelineDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AchTransferTimelineDuxo.onCreate$lambda$2(this.f$0, (Throwable) obj);
            }
        }, null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(AchTransferTimelineDuxo achTransferTimelineDuxo, AchTransferTimelineState.Loaded loaded) {
        achTransferTimelineDuxo.applyMutation(new AchTransferTimelineDuxo2(loaded, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$2(AchTransferTimelineDuxo achTransferTimelineDuxo, Throwable throwable) throws Throwable {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (Throwables.isNetworkRelated(throwable)) {
            if (throwable instanceof HttpException) {
                TimberLogger.INSTANCE.mo1679d("Request failed in timeline duxo. Response %s", String.valueOf(((HttpException) throwable).response()));
            }
            achTransferTimelineDuxo.applyMutation(new AchTransferTimelineDuxo3(null));
            return Unit.INSTANCE;
        }
        throw throwable;
    }

    /* compiled from: AchTransferTimelineDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/AchTransferTimelineDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/AchTransferTimelineDuxo;", "Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/AchTransferTimelineFragment$Args;", "<init>", "()V", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<AchTransferTimelineDuxo, AchTransferTimelineFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AchTransferTimelineFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (AchTransferTimelineFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AchTransferTimelineFragment.Args getArgs(AchTransferTimelineDuxo achTransferTimelineDuxo) {
            return (AchTransferTimelineFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, achTransferTimelineDuxo);
        }
    }
}
