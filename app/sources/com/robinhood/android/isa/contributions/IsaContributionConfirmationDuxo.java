package com.robinhood.android.isa.contributions;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.isa.models.isa.p163db.entity.IsaContributions;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoHasArgsCompanion;
import com.robinhood.android.udf.HasArgs;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.bonfire.PaymentTransferStore;
import com.robinhood.models.p320db.bonfire.PaymentTransfer;
import com.robinhood.store.isa.IsaContributionStore;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;
import windsor.transactions.p552v1.TransactionTypeDto;

/* compiled from: IsaContributionConfirmationDuxo.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00050\u0004:\u0002\u0016\u0017B1\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/isa/contributions/IsaContributionConfirmationDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/isa/contributions/IsaContributionConfirmationDataState;", "Lcom/robinhood/android/isa/contributions/IsaContributionConfirmationViewState;", "Lcom/robinhood/android/udf/HasArgs;", "Lcom/robinhood/android/isa/contributions/IsaContributionConfirmationDuxo$InitArgs;", "paymentTransferStore", "Lcom/robinhood/librobinhood/data/store/bonfire/PaymentTransferStore;", "contributionStore", "Lcom/robinhood/store/isa/IsaContributionStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "stateProvider", "Lcom/robinhood/android/isa/contributions/IsaContributionConfirmationStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/PaymentTransferStore;Lcom/robinhood/store/isa/IsaContributionStore;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/isa/contributions/IsaContributionConfirmationStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "InitArgs", "Companion", "lib-isa-contributions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class IsaContributionConfirmationDuxo extends BaseDuxo<IsaContributionConfirmationDataState, IsaContributionConfirmationViewState> implements HasArgs<InitArgs> {
    private final IsaContributionStore contributionStore;
    private final PaymentTransferStore paymentTransferStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasArgs
    public InitArgs getArgs(SavedStateHandle savedStateHandle) {
        return (InitArgs) HasArgs.DefaultImpls.getArgs(this, savedStateHandle);
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IsaContributionConfirmationDuxo(PaymentTransferStore paymentTransferStore, IsaContributionStore contributionStore, SavedStateHandle savedStateHandle, IsaContributionConfirmationDuxo3 stateProvider, DuxoBundle duxoBundle) {
        super(new IsaContributionConfirmationDataState(null, null, 3, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(paymentTransferStore, "paymentTransferStore");
        Intrinsics.checkNotNullParameter(contributionStore, "contributionStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.paymentTransferStore = paymentTransferStore;
        this.contributionStore = contributionStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.CREATED, new C198821(null));
    }

    /* compiled from: IsaContributionConfirmationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.isa.contributions.IsaContributionConfirmationDuxo$onCreate$1", m3645f = "IsaContributionConfirmationDuxo.kt", m3646l = {52}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.isa.contributions.IsaContributionConfirmationDuxo$onCreate$1 */
    static final class C198821 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C198821(Continuation<? super C198821> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return IsaContributionConfirmationDuxo.this.new C198821(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C198821) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowTake = FlowKt.take(Context7.buffer$default(RxConvert.asFlow(PaymentTransferStore.getPaymentTransfer$default(IsaContributionConfirmationDuxo.this.paymentTransferStore, ((InitArgs) IsaContributionConfirmationDuxo.INSTANCE.getArgs((HasArgs) IsaContributionConfirmationDuxo.this)).getContributionId(), false, 2, null)), Integer.MAX_VALUE, null, 2, null), 1);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(IsaContributionConfirmationDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowTake, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: IsaContributionConfirmationDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "transfer", "Lcom/robinhood/models/db/bonfire/PaymentTransfer;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.isa.contributions.IsaContributionConfirmationDuxo$onCreate$1$1", m3645f = "IsaContributionConfirmationDuxo.kt", m3646l = {66}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.isa.contributions.IsaContributionConfirmationDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<PaymentTransfer, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ IsaContributionConfirmationDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(IsaContributionConfirmationDuxo isaContributionConfirmationDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = isaContributionConfirmationDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(PaymentTransfer paymentTransfer, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(paymentTransfer, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: IsaContributionConfirmationDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/isa/contributions/IsaContributionConfirmationDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.isa.contributions.IsaContributionConfirmationDuxo$onCreate$1$1$1", m3645f = "IsaContributionConfirmationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.isa.contributions.IsaContributionConfirmationDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C502401 extends ContinuationImpl7 implements Function2<IsaContributionConfirmationDataState, Continuation<? super IsaContributionConfirmationDataState>, Object> {
                final /* synthetic */ PaymentTransfer $transfer;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C502401(PaymentTransfer paymentTransfer, Continuation<? super C502401> continuation) {
                    super(2, continuation);
                    this.$transfer = paymentTransfer;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C502401 c502401 = new C502401(this.$transfer, continuation);
                    c502401.L$0 = obj;
                    return c502401;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(IsaContributionConfirmationDataState isaContributionConfirmationDataState, Continuation<? super IsaContributionConfirmationDataState> continuation) {
                    return ((C502401) create(isaContributionConfirmationDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return IsaContributionConfirmationDataState.copy$default((IsaContributionConfirmationDataState) this.L$0, this.$transfer, null, 2, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    PaymentTransfer paymentTransfer = (PaymentTransfer) this.L$0;
                    this.this$0.applyMutation(new C502401(paymentTransfer, null));
                    Flow flowTake = FlowKt.take(this.this$0.contributionStore.streamContributions(paymentTransfer.getOriginatingAccountId(), TransactionTypeDto.CONTRIBUTION_REGULAR), 1);
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowTake, anonymousClass2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: IsaContributionConfirmationDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "contributions", "Lcom/robinhood/android/isa/models/isa/db/entity/IsaContributions;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.isa.contributions.IsaContributionConfirmationDuxo$onCreate$1$1$2", m3645f = "IsaContributionConfirmationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.isa.contributions.IsaContributionConfirmationDuxo$onCreate$1$1$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<IsaContributions, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ IsaContributionConfirmationDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(IsaContributionConfirmationDuxo isaContributionConfirmationDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = isaContributionConfirmationDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(IsaContributions isaContributions, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(isaContributions, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: IsaContributionConfirmationDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/isa/contributions/IsaContributionConfirmationDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.isa.contributions.IsaContributionConfirmationDuxo$onCreate$1$1$2$1", m3645f = "IsaContributionConfirmationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.isa.contributions.IsaContributionConfirmationDuxo$onCreate$1$1$2$1, reason: invalid class name and collision with other inner class name */
                static final class C502411 extends ContinuationImpl7 implements Function2<IsaContributionConfirmationDataState, Continuation<? super IsaContributionConfirmationDataState>, Object> {
                    final /* synthetic */ IsaContributions $contributions;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C502411(IsaContributions isaContributions, Continuation<? super C502411> continuation) {
                        super(2, continuation);
                        this.$contributions = isaContributions;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C502411 c502411 = new C502411(this.$contributions, continuation);
                        c502411.L$0 = obj;
                        return c502411;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(IsaContributionConfirmationDataState isaContributionConfirmationDataState, Continuation<? super IsaContributionConfirmationDataState> continuation) {
                        return ((C502411) create(isaContributionConfirmationDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return IsaContributionConfirmationDataState.copy$default((IsaContributionConfirmationDataState) this.L$0, null, this.$contributions, 1, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C502411((IsaContributions) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    /* compiled from: IsaContributionConfirmationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/isa/contributions/IsaContributionConfirmationDuxo$InitArgs;", "Landroid/os/Parcelable;", "contributionId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getContributionId", "()Ljava/util/UUID;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-isa-contributions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class InitArgs implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<InitArgs> CREATOR = new Creator();
        private final UUID contributionId;

        /* compiled from: IsaContributionConfirmationDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<InitArgs> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InitArgs createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InitArgs((UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InitArgs[] newArray(int i) {
                return new InitArgs[i];
            }
        }

        public static /* synthetic */ InitArgs copy$default(InitArgs initArgs, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = initArgs.contributionId;
            }
            return initArgs.copy(uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getContributionId() {
            return this.contributionId;
        }

        public final InitArgs copy(UUID contributionId) {
            Intrinsics.checkNotNullParameter(contributionId, "contributionId");
            return new InitArgs(contributionId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof InitArgs) && Intrinsics.areEqual(this.contributionId, ((InitArgs) other).contributionId);
        }

        public int hashCode() {
            return this.contributionId.hashCode();
        }

        public String toString() {
            return "InitArgs(contributionId=" + this.contributionId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.contributionId);
        }

        public InitArgs(UUID contributionId) {
            Intrinsics.checkNotNullParameter(contributionId, "contributionId");
            this.contributionId = contributionId;
        }

        public final UUID getContributionId() {
            return this.contributionId;
        }
    }

    /* compiled from: IsaContributionConfirmationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/isa/contributions/IsaContributionConfirmationDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoHasArgsCompanion;", "Lcom/robinhood/android/isa/contributions/IsaContributionConfirmationDuxo;", "Lcom/robinhood/android/isa/contributions/IsaContributionConfirmationDuxo$InitArgs;", "<init>", "()V", "lib-isa-contributions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoHasArgsCompanion<IsaContributionConfirmationDuxo, InitArgs> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoHasArgsCompanion
        public InitArgs getArgs(SavedStateHandle savedStateHandle) {
            return (InitArgs) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoHasArgsCompanion
        public InitArgs getArgs(IsaContributionConfirmationDuxo isaContributionConfirmationDuxo) {
            return (InitArgs) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, isaContributionConfirmationDuxo);
        }
    }
}
