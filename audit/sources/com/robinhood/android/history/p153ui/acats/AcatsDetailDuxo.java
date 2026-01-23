package com.robinhood.android.history.p153ui.acats;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.history.p153ui.acats.AcatsDetailEvent;
import com.robinhood.android.history.p153ui.acats.AcatsDetailFragment;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.bonfire.AcatsTransferStore;
import com.robinhood.models.acats.p299db.bonfire.AcatsDetailPageResponse;
import com.robinhood.models.acats.p299db.bonfire.AcatsTransfer;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AcatsDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000  2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001 B1\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0012\u0010\u0016\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002J\u0010\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0006\u0010\u001f\u001a\u00020\u0015R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/history/ui/acats/AcatsDetailDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/history/ui/acats/AcatsDetailDataState;", "Lcom/robinhood/android/history/ui/acats/AcatsDetailViewState;", "Lcom/robinhood/android/history/ui/acats/AcatsDetailEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "acatsTransferStore", "Lcom/robinhood/librobinhood/data/store/bonfire/AcatsTransferStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "stateProvider", "Lcom/robinhood/android/history/ui/acats/AcatsDetailStateProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/AcatsTransferStore;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/android/history/ui/acats/AcatsDetailStateProvider;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "loadAcatsOut", "rhsAccountNumber", "", "loadAcatsIn", "acatsTransferId", "Ljava/util/UUID;", "logAppear", "transfer", "Lcom/robinhood/models/acats/db/bonfire/AcatsTransfer;", "logCtaTap", "Companion", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class AcatsDetailDuxo extends BaseDuxo3<AcatsDetailDataState, AcatsDetailViewState, AcatsDetailEvent> implements HasSavedState {
    private final AcatsTransferStore acatsTransferStore;
    private final EventLogger eventLogger;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AcatsDetailDuxo(AcatsTransferStore acatsTransferStore, EventLogger eventLogger, AcatsDetailStateProvider stateProvider, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        super(new AcatsDetailDataState(null, null, 3, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(acatsTransferStore, "acatsTransferStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.acatsTransferStore = acatsTransferStore;
        this.eventLogger = eventLogger;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        AcatsDetailFragment.Args args = (AcatsDetailFragment.Args) INSTANCE.getArgs((HasSavedState) this);
        if (args instanceof AcatsDetailFragment.Args.AcatsIn) {
            loadAcatsIn(((AcatsDetailFragment.Args.AcatsIn) args).getAcatInTransferId());
        } else {
            if (!(args instanceof AcatsDetailFragment.Args.AcatsOut)) {
                throw new NoWhenBranchMatchedException();
            }
            loadAcatsOut(((AcatsDetailFragment.Args.AcatsOut) args).getRhsAccountNumber());
        }
    }

    private final void loadAcatsOut(String rhsAccountNumber) {
        LifecycleHost.DefaultImpls.bind$default(this, this.acatsTransferStore.fetchAcatOutDetailPage(rhsAccountNumber), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.history.ui.acats.AcatsDetailDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AcatsDetailDuxo.loadAcatsOut$lambda$0(this.f$0, (AcatsDetailPageResponse) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadAcatsOut$lambda$0(AcatsDetailDuxo acatsDetailDuxo, AcatsDetailPageResponse acatsDetailPageResponse) {
        acatsDetailDuxo.applyMutation(new AcatsDetailDuxo4(acatsDetailPageResponse, null));
        return Unit.INSTANCE;
    }

    /* compiled from: AcatsDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/acats/db/bonfire/AcatsTransfer;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.history.ui.acats.AcatsDetailDuxo$loadAcatsIn$1", m3645f = "AcatsDetailDuxo.kt", m3646l = {54}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.history.ui.acats.AcatsDetailDuxo$loadAcatsIn$1 */
    static final class C184221 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super AcatsTransfer>, Object> {
        final /* synthetic */ UUID $acatsTransferId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C184221(UUID uuid, Continuation<? super C184221> continuation) {
            super(2, continuation);
            this.$acatsTransferId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AcatsDetailDuxo.this.new C184221(this.$acatsTransferId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super AcatsTransfer> continuation) {
            return ((C184221) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            AcatsTransferStore acatsTransferStore = AcatsDetailDuxo.this.acatsTransferStore;
            UUID uuid = this.$acatsTransferId;
            this.label = 1;
            Object acatTransfer = acatsTransferStore.getAcatTransfer(uuid, this);
            return acatTransfer == coroutine_suspended ? coroutine_suspended : acatTransfer;
        }
    }

    private final void loadAcatsIn(UUID acatsTransferId) {
        LifecycleHost.DefaultImpls.bind$default(this, RxFactory.DefaultImpls.rxSingle$default(this, null, new C184221(acatsTransferId, null), 1, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.history.ui.acats.AcatsDetailDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AcatsDetailDuxo.loadAcatsIn$lambda$1(this.f$0, (AcatsTransfer) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.history.ui.acats.AcatsDetailDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AcatsDetailDuxo.loadAcatsIn$lambda$2(this.f$0, (Throwable) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.acatsTransferStore.fetchAcatDetailPage(acatsTransferId), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.history.ui.acats.AcatsDetailDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AcatsDetailDuxo.loadAcatsIn$lambda$3(this.f$0, (AcatsDetailPageResponse) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadAcatsIn$lambda$1(AcatsDetailDuxo acatsDetailDuxo, AcatsTransfer acatsTransfer) {
        Intrinsics.checkNotNullParameter(acatsTransfer, "acatsTransfer");
        acatsDetailDuxo.applyMutation(new AcatsDetailDuxo2(acatsTransfer, null));
        acatsDetailDuxo.logAppear(acatsTransfer);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadAcatsIn$lambda$2(AcatsDetailDuxo acatsDetailDuxo, Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        acatsDetailDuxo.submit(new AcatsDetailEvent.AcatsTransferLoadFailed(error));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadAcatsIn$lambda$3(AcatsDetailDuxo acatsDetailDuxo, AcatsDetailPageResponse acatsDetailPageResponse) {
        acatsDetailDuxo.applyMutation(new AcatsDetailDuxo3(acatsDetailPageResponse, null));
        return Unit.INSTANCE;
    }

    private final void logAppear(AcatsTransfer transfer) {
        EventLogger.DefaultImpls.logAppear$default(this.eventLogger, null, new Screen(Screen.Name.ACAT_HISTORY_DETAIL, null, null, null, 14, null), null, null, AcatsDetailDuxo5.toLoggingContext(transfer), 13, null);
    }

    public final void logCtaTap() {
        EventLogger.DefaultImpls.logTap$default(this.eventLogger, UserInteractionEventData.Action.PRIMARY_CTA, new Screen(Screen.Name.ACAT_HISTORY_DETAIL, null, null, null, 14, null), null, null, AcatsDetailDuxo5.toLoggingContext(getStateFlow().getValue().getAcatsTransfer()), false, 44, null);
    }

    /* compiled from: AcatsDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/history/ui/acats/AcatsDetailDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/history/ui/acats/AcatsDetailDuxo;", "Lcom/robinhood/android/history/ui/acats/AcatsDetailFragment$Args;", "<init>", "()V", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<AcatsDetailDuxo, AcatsDetailFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AcatsDetailFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (AcatsDetailFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AcatsDetailFragment.Args getArgs(AcatsDetailDuxo acatsDetailDuxo) {
            return (AcatsDetailFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, acatsDetailDuxo);
        }
    }
}
