package com.robinhood.android.transfers.internaltransfer;

import com.robinhood.android.transfers.contracts.UkTransfer;
import com.robinhood.android.transfers.internaltransfer.InternalTransferAccountSelectionEvent;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.librobinhood.data.store.bonfire.TransferAccountStore;
import com.robinhood.models.api.bonfire.transfer.TransferDirectionV2;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import com.robinhood.shared.store.user.UserStore;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: InternalTransferAccountSelectionDuxo.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/transfers/internaltransfer/InternalTransferAccountSelectionDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/transfers/internaltransfer/InternalTransferAccountSelectionDataState;", "Lcom/robinhood/android/transfers/internaltransfer/InternalTransferAccountSelectionViewState;", "Lcom/robinhood/android/transfers/internaltransfer/InternalTransferAccountSelectionEvent;", "transferAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/transfers/internaltransfer/InternalTransferAccountSelectionStateProvider;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;Lcom/robinhood/shared/store/user/UserStore;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/android/transfers/internaltransfer/InternalTransferAccountSelectionStateProvider;)V", "onStart", "", "onSourceAccountSelected", "accountId", "", "feature-transfer-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class InternalTransferAccountSelectionDuxo extends BaseDuxo3<InternalTransferAccountSelectionDataState, InternalTransferAccountSelectionViewState, InternalTransferAccountSelectionEvent> {
    public static final int $stable = 8;
    private final TransferAccountStore transferAccountStore;
    private final UserStore userStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InternalTransferAccountSelectionDuxo(TransferAccountStore transferAccountStore, UserStore userStore, DuxoBundle duxoBundle, InternalTransferAccountSelectionStateProvider stateProvider) {
        super(new InternalTransferAccountSelectionDataState(null, 1, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(transferAccountStore, "transferAccountStore");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        this.transferAccountStore = transferAccountStore;
        this.userStore = userStore;
    }

    /* compiled from: InternalTransferAccountSelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.internaltransfer.InternalTransferAccountSelectionDuxo$onStart$1", m3645f = "InternalTransferAccountSelectionDuxo.kt", m3646l = {38}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.internaltransfer.InternalTransferAccountSelectionDuxo$onStart$1 */
    static final class C303061 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C303061(Continuation<? super C303061> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InternalTransferAccountSelectionDuxo.this.new C303061(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C303061) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                TransferAccountStore.refresh$default(InternalTransferAccountSelectionDuxo.this.transferAccountStore, false, 1, null);
                Flow<List<TransferAccount>> flowStreamFlow = InternalTransferAccountSelectionDuxo.this.transferAccountStore.streamFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(InternalTransferAccountSelectionDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamFlow, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: InternalTransferAccountSelectionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "", "Lcom/robinhood/models/db/bonfire/TransferAccount;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.transfers.internaltransfer.InternalTransferAccountSelectionDuxo$onStart$1$1", m3645f = "InternalTransferAccountSelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.transfers.internaltransfer.InternalTransferAccountSelectionDuxo$onStart$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<List<? extends TransferAccount>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ InternalTransferAccountSelectionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(InternalTransferAccountSelectionDuxo internalTransferAccountSelectionDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = internalTransferAccountSelectionDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(List<? extends TransferAccount> list, Continuation<? super Unit> continuation) {
                return invoke2((List<TransferAccount>) list, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(List<TransferAccount> list, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: InternalTransferAccountSelectionDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/internaltransfer/InternalTransferAccountSelectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.transfers.internaltransfer.InternalTransferAccountSelectionDuxo$onStart$1$1$1", m3645f = "InternalTransferAccountSelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.transfers.internaltransfer.InternalTransferAccountSelectionDuxo$onStart$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C506021 extends ContinuationImpl7 implements Function2<InternalTransferAccountSelectionDataState, Continuation<? super InternalTransferAccountSelectionDataState>, Object> {
                final /* synthetic */ List<TransferAccount> $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C506021(List<TransferAccount> list, Continuation<? super C506021> continuation) {
                    super(2, continuation);
                    this.$it = list;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C506021 c506021 = new C506021(this.$it, continuation);
                    c506021.L$0 = obj;
                    return c506021;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InternalTransferAccountSelectionDataState internalTransferAccountSelectionDataState, Continuation<? super InternalTransferAccountSelectionDataState> continuation) {
                    return ((C506021) create(internalTransferAccountSelectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return ((InternalTransferAccountSelectionDataState) this.L$0).copy(this.$it);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C506021((List) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C303061(null));
    }

    /* compiled from: InternalTransferAccountSelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.internaltransfer.InternalTransferAccountSelectionDuxo$onSourceAccountSelected$1", m3645f = "InternalTransferAccountSelectionDuxo.kt", m3646l = {66}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.transfers.internaltransfer.InternalTransferAccountSelectionDuxo$onSourceAccountSelected$1 */
    static final class C303041 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $accountId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C303041(String str, Continuation<? super C303041> continuation) {
            super(2, continuation);
            this.$accountId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InternalTransferAccountSelectionDuxo.this.new C303041(this.$accountId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C303041) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ObservableSource map = InternalTransferAccountSelectionDuxo.this.userStore.getUser().map(new Function() { // from class: com.robinhood.android.transfers.internaltransfer.InternalTransferAccountSelectionDuxo$onSourceAccountSelected$1$userLocality$1
                    @Override // io.reactivex.functions.Function
                    public final CountryCode.Supported apply(User it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return it.getOrigin().getLocality();
                    }
                });
                Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                this.label = 1;
                obj = RxAwait3.awaitFirstOrNull(map, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (((CountryCode.Supported) obj) instanceof CountryCode.Supported.UnitedKingdom) {
                InternalTransferAccountSelectionDuxo.this.submit(new InternalTransferAccountSelectionEvent.LaunchActivity(new UkTransfer(TransferDirectionV2.INTER_ENTITY, null, this.$accountId, null, MAXTransferContext.EntryPoint.TRANSFER_HUB, 10, null)));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("Unexpected locality");
        }
    }

    public final void onSourceAccountSelected(String accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C303041(accountId, null), 3, null);
    }
}
