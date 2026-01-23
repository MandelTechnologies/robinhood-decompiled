package com.robinhood.android.equities.orderactions;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.models.portfolio.api.PositionInstrumentType;
import com.robinhood.android.models.portfolio.api.PositionsLocation;
import com.robinhood.android.trading.contracts.EquityPendingOrderActionKey;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion2;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.librobinhood.data.store.OrderStore;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionsV2Store;
import com.robinhood.models.p320db.Order;
import com.robinhood.utils.Optional;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.logging.EventMetadata;
import com.robinhood.utils.logging.SentryTeam;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.Duration3;
import kotlin.time.DurationUnitJvm;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Timeout4;
import kotlinx.coroutines.Timeout6;

/* compiled from: EquityPendingOrderActionDuxo.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u001aB1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u000e\u0010\u0017\u001a\u00020\u0016H\u0082@¢\u0006\u0002\u0010\u0018J\u000e\u0010\u0019\u001a\u00020\u0016H\u0082@¢\u0006\u0002\u0010\u0018R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/equities/orderactions/EquityPendingOrderActionDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/equities/orderactions/EquityPendingOrderActionDataState;", "Lcom/robinhood/android/equities/orderactions/EquityPendingOrderActionViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "orderStore", "Lcom/robinhood/librobinhood/data/store/OrderStore;", "positionsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PositionsV2Store;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "stateProvider", "Lcom/robinhood/android/equities/orderactions/EquityPendingOrderActionStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/OrderStore;Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PositionsV2Store;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/equities/orderactions/EquityPendingOrderActionStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "args", "Lcom/robinhood/android/trading/contracts/EquityPendingOrderActionKey;", "onCreate", "", "replaceOrder", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelOrder", "Companion", "feature-equity-order-actions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class EquityPendingOrderActionDuxo extends BaseDuxo<EquityPendingOrderActionDataState, EquityPendingOrderActionViewState> implements HasSavedState {
    private static final long TIMEOUT;
    private final EquityPendingOrderActionKey args;
    private final OrderStore orderStore;
    private final PositionsV2Store positionsStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: EquityPendingOrderActionDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equities.orderactions.EquityPendingOrderActionDuxo", m3645f = "EquityPendingOrderActionDuxo.kt", m3646l = {86, 92}, m3647m = "cancelOrder")
    /* renamed from: com.robinhood.android.equities.orderactions.EquityPendingOrderActionDuxo$cancelOrder$1 */
    static final class C147351 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C147351(Continuation<? super C147351> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EquityPendingOrderActionDuxo.this.cancelOrder(this);
        }
    }

    /* compiled from: EquityPendingOrderActionDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equities.orderactions.EquityPendingOrderActionDuxo", m3645f = "EquityPendingOrderActionDuxo.kt", m3646l = {57}, m3647m = "replaceOrder")
    /* renamed from: com.robinhood.android.equities.orderactions.EquityPendingOrderActionDuxo$replaceOrder$1 */
    static final class C147381 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C147381(Continuation<? super C147381> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EquityPendingOrderActionDuxo.this.replaceOrder(this);
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EquityPendingOrderActionDuxo(OrderStore orderStore, PositionsV2Store positionsStore, SavedStateHandle savedStateHandle, EquityPendingOrderActionStateProvider stateProvider, DuxoBundle duxoBundle) {
        super(new EquityPendingOrderActionDataState(false, null, null, 7, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(orderStore, "orderStore");
        Intrinsics.checkNotNullParameter(positionsStore, "positionsStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.orderStore = orderStore;
        this.positionsStore = positionsStore;
        this.savedStateHandle = savedStateHandle;
        this.args = (EquityPendingOrderActionKey) INSTANCE.getExtras(getSavedStateHandle());
    }

    /* compiled from: EquityPendingOrderActionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0010\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/equities/orderactions/EquityPendingOrderActionDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoActivityCompanion;", "Lcom/robinhood/android/equities/orderactions/EquityPendingOrderActionDuxo;", "Lcom/robinhood/android/trading/contracts/EquityPendingOrderActionKey;", "<init>", "()V", "TIMEOUT", "Lkotlin/time/Duration;", "J", "feature-equity-order-actions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion2<EquityPendingOrderActionDuxo, EquityPendingOrderActionKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion2
        public EquityPendingOrderActionKey getExtras(SavedStateHandle savedStateHandle) {
            return (EquityPendingOrderActionKey) DuxoCompanion2.DefaultImpls.getExtras(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion2
        public EquityPendingOrderActionKey getExtras(EquityPendingOrderActionDuxo equityPendingOrderActionDuxo) {
            return (EquityPendingOrderActionKey) DuxoCompanion2.DefaultImpls.getExtras(this, equityPendingOrderActionDuxo);
        }
    }

    static {
        Duration.Companion companion = Duration.INSTANCE;
        TIMEOUT = Duration3.toDuration(5, DurationUnitJvm.SECONDS);
    }

    /* compiled from: EquityPendingOrderActionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equities.orderactions.EquityPendingOrderActionDuxo$onCreate$1", m3645f = "EquityPendingOrderActionDuxo.kt", m3646l = {49, 50}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equities.orderactions.EquityPendingOrderActionDuxo$onCreate$1 */
    static final class C147371 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* compiled from: EquityPendingOrderActionDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.equities.orderactions.EquityPendingOrderActionDuxo$onCreate$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EquityPendingOrderActionKey.Action.values().length];
                try {
                    iArr[EquityPendingOrderActionKey.Action.CANCEL.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EquityPendingOrderActionKey.Action.REPLACE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        C147371(Continuation<? super C147371> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityPendingOrderActionDuxo.this.new C147371(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C147371) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
        
            if (r5.replaceOrder(r4) == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
        
            if (r5.cancelOrder(r4) == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
        
            return r0;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                int i2 = WhenMappings.$EnumSwitchMapping$0[EquityPendingOrderActionDuxo.this.args.getAction().ordinal()];
                if (i2 == 1) {
                    EquityPendingOrderActionDuxo equityPendingOrderActionDuxo = EquityPendingOrderActionDuxo.this;
                    this.label = 1;
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    EquityPendingOrderActionDuxo equityPendingOrderActionDuxo2 = EquityPendingOrderActionDuxo.this;
                    this.label = 2;
                }
            } else {
                if (i != 1 && i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C147371(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object replaceOrder(Continuation<? super Unit> continuation) {
        C147381 c147381;
        Object objM28550constructorimpl;
        if (continuation instanceof C147381) {
            c147381 = (C147381) continuation;
            int i = c147381.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c147381.label = i - Integer.MIN_VALUE;
            } else {
                c147381 = new C147381(continuation);
            }
        }
        Object objM28789withTimeoutKLykuaI = c147381.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c147381.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objM28789withTimeoutKLykuaI);
                Result.Companion companion = Result.INSTANCE;
                long j = TIMEOUT;
                EquityPendingOrderActionDuxo6 equityPendingOrderActionDuxo6 = new EquityPendingOrderActionDuxo6(this, null);
                c147381.label = 1;
                objM28789withTimeoutKLykuaI = Timeout6.m28789withTimeoutKLykuaI(j, equityPendingOrderActionDuxo6, c147381);
                if (objM28789withTimeoutKLykuaI == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM28789withTimeoutKLykuaI);
            }
            objM28550constructorimpl = Result.m28550constructorimpl((Order) objM28789withTimeoutKLykuaI);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
        if (thM28553exceptionOrNullimpl == null) {
            applyMutation(new EquityPendingOrderActionDuxo7((Order) objM28550constructorimpl, null));
        } else {
            if (!(thM28553exceptionOrNullimpl instanceof Timeout4)) {
                CrashReporter.INSTANCE.reportNonFatal(thM28553exceptionOrNullimpl, false, new EventMetadata(SentryTeam.EQUITIES, null, null, 6, null));
            }
            applyMutation(new EquityPendingOrderActionDuxo8(null));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007d, code lost:
    
        if (r0.refreshPositions(r2, r4, r6, r13) == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object cancelOrder(Continuation<? super Unit> continuation) {
        C147351 c147351;
        Object objM28550constructorimpl;
        if (continuation instanceof C147351) {
            c147351 = (C147351) continuation;
            int i = c147351.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c147351.label = i - Integer.MIN_VALUE;
            } else {
                c147351 = new C147351(continuation);
            }
        }
        C147351 c1473512 = c147351;
        Object objM28789withTimeoutKLykuaI = c1473512.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c1473512.label;
        try {
        } catch (Throwable th) {
            Result.Companion companion = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        if (i2 == 0) {
            ResultKt.throwOnFailure(objM28789withTimeoutKLykuaI);
            Result.Companion companion2 = Result.INSTANCE;
            long j = TIMEOUT;
            EquityPendingOrderActionDuxo2 equityPendingOrderActionDuxo2 = new EquityPendingOrderActionDuxo2(this, null);
            c1473512.label = 1;
            objM28789withTimeoutKLykuaI = Timeout6.m28789withTimeoutKLykuaI(j, equityPendingOrderActionDuxo2, c1473512);
            if (objM28789withTimeoutKLykuaI == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM28789withTimeoutKLykuaI);
                applyMutation(new EquityPendingOrderActionDuxo3(null));
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(objM28789withTimeoutKLykuaI);
        }
        objM28550constructorimpl = Result.m28550constructorimpl((Optional) objM28789withTimeoutKLykuaI);
        Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
        if (thM28553exceptionOrNullimpl == null) {
            PositionsV2Store positionsV2Store = this.positionsStore;
            String rhsAccountNumber = this.args.getRhsAccountNumber();
            PositionInstrumentType positionInstrumentType = PositionInstrumentType.EQUITY_PENDING;
            PositionsLocation positionsLocation = PositionsLocation.ASSET_HOME;
            c1473512.label = 2;
        } else {
            if (thM28553exceptionOrNullimpl instanceof Timeout4) {
                applyMutation(new EquityPendingOrderActionDuxo4(null));
            } else {
                CrashReporter.INSTANCE.reportNonFatal(thM28553exceptionOrNullimpl, false, new EventMetadata(SentryTeam.EQUITIES, null, null, 6, null));
                applyMutation(new EquityPendingOrderActionDuxo5(null));
            }
            return Unit.INSTANCE;
        }
    }
}
