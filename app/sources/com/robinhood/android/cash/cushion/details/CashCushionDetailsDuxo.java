package com.robinhood.android.cash.cushion.details;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.cash.cushion.details.CashCushionDetailsDuxo;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.bonfire.CashCushionDetailsStore;
import com.robinhood.librobinhood.data.store.bonfire.CashCushionStatusStore;
import com.robinhood.librobinhood.data.store.rhy.RhyAccountLoggingStore;
import com.robinhood.models.p320db.bonfire.CashCushionDetails;
import com.robinhood.models.p320db.bonfire.CashCushionStatus;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.Throwables;
import io.reactivex.Single;
import io.reactivex.rxkotlin.Singles;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
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

/* compiled from: CashCushionDetailsDuxo.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0017B)\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u000e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0002J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/cash/cushion/details/CashCushionDetailsDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/cash/cushion/details/CashCushionDetailsViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "cashCushionDetailsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/CashCushionDetailsStore;", "cashCushionStatusStore", "Lcom/robinhood/librobinhood/data/store/bonfire/CashCushionStatusStore;", "rhyAccountLoggingStore", "Lcom/robinhood/librobinhood/data/store/rhy/RhyAccountLoggingStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/CashCushionDetailsStore;Lcom/robinhood/librobinhood/data/store/bonfire/CashCushionStatusStore;Lcom/robinhood/librobinhood/data/store/rhy/RhyAccountLoggingStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "primaryCtaClick", "state", "setCtasToLoading", "loading", "", "Companion", "feature-lib-cash-cushion_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class CashCushionDetailsDuxo extends OldBaseDuxo<CashCushionDetailsViewState> implements HasSavedState {
    private final CashCushionDetailsStore cashCushionDetailsStore;
    private final CashCushionStatusStore cashCushionStatusStore;
    private final RhyAccountLoggingStore rhyAccountLoggingStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CashCushionDetailsDuxo(CashCushionDetailsStore cashCushionDetailsStore, CashCushionStatusStore cashCushionStatusStore, RhyAccountLoggingStore rhyAccountLoggingStore, SavedStateHandle savedStateHandle) {
        super(new CashCushionDetailsViewState(null, null, false, false, null, null, ((LegacyIntentKey.CashCushionDetails) INSTANCE.getArgs(savedStateHandle)).getShowManageSettingButtonWhenEnabled(), 63, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(cashCushionDetailsStore, "cashCushionDetailsStore");
        Intrinsics.checkNotNullParameter(cashCushionStatusStore, "cashCushionStatusStore");
        Intrinsics.checkNotNullParameter(rhyAccountLoggingStore, "rhyAccountLoggingStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.cashCushionDetailsStore = cashCushionDetailsStore;
        this.cashCushionStatusStore = cashCushionStatusStore;
        this.rhyAccountLoggingStore = rhyAccountLoggingStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        this.rhyAccountLoggingStore.refresh(true);
        this.cashCushionDetailsStore.refresh(true);
        this.cashCushionStatusStore.refresh(true);
        Singles singles = Singles.INSTANCE;
        Single singleSingleOrError = asObservable(this.cashCushionDetailsStore.stream()).take(1L).singleOrError();
        Intrinsics.checkNotNullExpressionValue(singleSingleOrError, "singleOrError(...)");
        Single singleSingleOrError2 = asObservable(this.cashCushionStatusStore.stream()).take(1L).singleOrError();
        Intrinsics.checkNotNullExpressionValue(singleSingleOrError2, "singleOrError(...)");
        LifecycleHost.DefaultImpls.bind$default(this, singles.zip(singleSingleOrError, singleSingleOrError2), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.cushion.details.CashCushionDetailsDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CashCushionDetailsDuxo.onStart$lambda$1(this.f$0, (Tuples2) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(CashCushionDetailsDuxo cashCushionDetailsDuxo, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        final CashCushionDetails cashCushionDetails = (CashCushionDetails) tuples2.component1();
        final CashCushionStatus cashCushionStatus = (CashCushionStatus) tuples2.component2();
        cashCushionDetailsDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.cushion.details.CashCushionDetailsDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CashCushionDetailsDuxo.onStart$lambda$1$lambda$0(cashCushionDetails, cashCushionStatus, (CashCushionDetailsViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CashCushionDetailsViewState onStart$lambda$1$lambda$0(CashCushionDetails cashCushionDetails, CashCushionStatus cashCushionStatus, CashCushionDetailsViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CashCushionDetailsViewState.copy$default(applyMutation, cashCushionDetails, cashCushionStatus, false, false, null, null, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
    }

    public final void primaryCtaClick(CashCushionDetailsViewState state) {
        CashCushionStatus status;
        Intrinsics.checkNotNullParameter(state, "state");
        if (state.getLoadingDetails() || state.getPrimaryCtaLoading() || (status = state.getStatus()) == null) {
            return;
        }
        getLifecycleScope().launchWhenStarted(new C99731(status, null));
    }

    /* compiled from: CashCushionDetailsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.cash.cushion.details.CashCushionDetailsDuxo$primaryCtaClick$1", m3645f = "CashCushionDetailsDuxo.kt", m3646l = {65, 66}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.cash.cushion.details.CashCushionDetailsDuxo$primaryCtaClick$1 */
    static final class C99731 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ CashCushionStatus $cashCushionStatus;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C99731(CashCushionStatus cashCushionStatus, Continuation<? super C99731> continuation) {
            super(2, continuation);
            this.$cashCushionStatus = cashCushionStatus;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CashCushionDetailsDuxo.this.new C99731(this.$cashCushionStatus, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C99731) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
        
            if (r6 == r0) goto L20;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
            } finally {
                try {
                    return Unit.INSTANCE;
                } finally {
                }
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CashCushionDetailsDuxo.this.setCtasToLoading(true);
                CashCushionStatusStore cashCushionStatusStore = CashCushionDetailsDuxo.this.cashCushionStatusStore;
                boolean z = !this.$cashCushionStatus.getEnabled();
                this.label = 1;
                if (cashCushionStatusStore.update(z, this) == coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                final CashCushionStatus cashCushionStatus = (CashCushionStatus) obj;
                CashCushionDetailsDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.cash.cushion.details.CashCushionDetailsDuxo$primaryCtaClick$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return CashCushionDetailsDuxo.C99731.invokeSuspend$lambda$0(cashCushionStatus, (CashCushionDetailsViewState) obj2);
                    }
                });
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            CashCushionStatusStore cashCushionStatusStore2 = CashCushionDetailsDuxo.this.cashCushionStatusStore;
            this.label = 2;
            obj = cashCushionStatusStore2.forceFetch(this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CashCushionDetailsViewState invokeSuspend$lambda$0(CashCushionStatus cashCushionStatus, CashCushionDetailsViewState cashCushionDetailsViewState) {
            return CashCushionDetailsViewState.copy$default(cashCushionDetailsViewState, null, null, false, false, null, new UiEvent(cashCushionStatus), false, 95, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CashCushionDetailsViewState invokeSuspend$lambda$1(Throwable th, CashCushionDetailsViewState cashCushionDetailsViewState) throws Throwable {
            if (!Throwables.isNetworkRelated(th)) {
                throw th;
            }
            return CashCushionDetailsViewState.copy$default(cashCushionDetailsViewState, null, null, false, false, new UiEvent(th), null, false, 111, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCtasToLoading(final boolean loading) {
        applyMutation(new Function1() { // from class: com.robinhood.android.cash.cushion.details.CashCushionDetailsDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CashCushionDetailsDuxo.setCtasToLoading$lambda$2(loading, (CashCushionDetailsViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CashCushionDetailsViewState setCtasToLoading$lambda$2(boolean z, CashCushionDetailsViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CashCushionDetailsViewState.copy$default(applyMutation, null, null, z, !z, null, null, false, 115, null);
    }

    /* compiled from: CashCushionDetailsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/cash/cushion/details/CashCushionDetailsDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/cash/cushion/details/CashCushionDetailsDuxo;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$CashCushionDetails;", "<init>", "()V", "feature-lib-cash-cushion_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<CashCushionDetailsDuxo, LegacyIntentKey.CashCushionDetails> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyIntentKey.CashCushionDetails getArgs(SavedStateHandle savedStateHandle) {
            return (LegacyIntentKey.CashCushionDetails) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyIntentKey.CashCushionDetails getArgs(CashCushionDetailsDuxo cashCushionDetailsDuxo) {
            return (LegacyIntentKey.CashCushionDetails) DuxoCompanion.DefaultImpls.getArgs(this, cashCushionDetailsDuxo);
        }
    }
}
