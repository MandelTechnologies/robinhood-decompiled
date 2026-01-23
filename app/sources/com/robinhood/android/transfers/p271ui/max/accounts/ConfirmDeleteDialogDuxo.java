package com.robinhood.android.transfers.p271ui.max.accounts;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.transfers.p271ui.max.accounts.ConfirmDeleteDialogEvent;
import com.robinhood.android.transfers.p271ui.max.accounts.ConfirmDeleteDialogFragment;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasArgs;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.librobinhood.data.store.bonfire.TransferWireAccountStore;
import com.robinhood.models.api.bonfire.wires.RecipientType;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ConfirmDeleteDialogDuxo.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00132\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\b\u0012\u0004\u0012\u00020\u00060\u0005:\u0001\u0013B!\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/accounts/ConfirmDeleteDialogDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/transfers/ui/max/accounts/ConfirmDeleteDialogDataState;", "Lcom/robinhood/android/transfers/ui/max/accounts/ConfirmDeleteDialogViewState;", "Lcom/robinhood/android/transfers/ui/max/accounts/ConfirmDeleteDialogEvent;", "Lcom/robinhood/android/udf/HasArgs;", "Lcom/robinhood/android/transfers/ui/max/accounts/ConfirmDeleteDialogFragment$Args;", "transferWireAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferWireAccountStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/TransferWireAccountStore;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "deleteAccount", "", "Companion", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class ConfirmDeleteDialogDuxo extends BaseDuxo3<ConfirmDeleteDialogDataState, ConfirmDeleteDialogViewState, ConfirmDeleteDialogEvent> implements HasArgs<ConfirmDeleteDialogFragment.Args> {
    private final SavedStateHandle savedStateHandle;
    private final TransferWireAccountStore transferWireAccountStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasArgs
    public ConfirmDeleteDialogFragment.Args getArgs(SavedStateHandle savedStateHandle) {
        return (ConfirmDeleteDialogFragment.Args) HasArgs.DefaultImpls.getArgs(this, savedStateHandle);
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmDeleteDialogDuxo(TransferWireAccountStore transferWireAccountStore, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        super(new ConfirmDeleteDialogDataState(false, 1, null), new ConfirmDeleteDialogStateProvider(), duxoBundle);
        Intrinsics.checkNotNullParameter(transferWireAccountStore, "transferWireAccountStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.transferWireAccountStore = transferWireAccountStore;
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: ConfirmDeleteDialogDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.accounts.ConfirmDeleteDialogDuxo$deleteAccount$1", m3645f = "ConfirmDeleteDialogDuxo.kt", m3646l = {40}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.max.accounts.ConfirmDeleteDialogDuxo$deleteAccount$1 */
    static final class C307051 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        C307051(Continuation<? super C307051> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ConfirmDeleteDialogDuxo.this.new C307051(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C307051) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            String str;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    ConfirmDeleteDialogDuxo.this.applyMutation(new AnonymousClass1(null));
                    Companion companion = ConfirmDeleteDialogDuxo.INSTANCE;
                    String id = ((ConfirmDeleteDialogFragment.Args) companion.getArgs((HasSavedState) ConfirmDeleteDialogDuxo.this)).getId();
                    TransferWireAccountStore transferWireAccountStore = ConfirmDeleteDialogDuxo.this.transferWireAccountStore;
                    RecipientType recipientType = ((ConfirmDeleteDialogFragment.Args) companion.getArgs((HasSavedState) ConfirmDeleteDialogDuxo.this)).getRecipientType();
                    String id2 = ((ConfirmDeleteDialogFragment.Args) companion.getArgs((HasSavedState) ConfirmDeleteDialogDuxo.this)).getId();
                    this.L$0 = id;
                    this.label = 1;
                    if (transferWireAccountStore.deleteOutgoingWireAccount(recipientType, id2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str = id;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) this.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                ConfirmDeleteDialogDuxo.this.applyMutation(new AnonymousClass2(null));
                ConfirmDeleteDialogDuxo.this.submit(new ConfirmDeleteDialogEvent.Success(str));
            } catch (Throwable th) {
                ConfirmDeleteDialogDuxo.this.applyMutation(new AnonymousClass3(null));
                ConfirmDeleteDialogDuxo.this.submit(new ConfirmDeleteDialogEvent.Error(th));
            }
            return Unit.INSTANCE;
        }

        /* compiled from: ConfirmDeleteDialogDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/max/accounts/ConfirmDeleteDialogDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.accounts.ConfirmDeleteDialogDuxo$deleteAccount$1$1", m3645f = "ConfirmDeleteDialogDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.transfers.ui.max.accounts.ConfirmDeleteDialogDuxo$deleteAccount$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<ConfirmDeleteDialogDataState, Continuation<? super ConfirmDeleteDialogDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ConfirmDeleteDialogDataState confirmDeleteDialogDataState, Continuation<? super ConfirmDeleteDialogDataState> continuation) {
                return ((AnonymousClass1) create(confirmDeleteDialogDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return ((ConfirmDeleteDialogDataState) this.L$0).copy(true);
            }
        }

        /* compiled from: ConfirmDeleteDialogDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/max/accounts/ConfirmDeleteDialogDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.accounts.ConfirmDeleteDialogDuxo$deleteAccount$1$2", m3645f = "ConfirmDeleteDialogDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.transfers.ui.max.accounts.ConfirmDeleteDialogDuxo$deleteAccount$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<ConfirmDeleteDialogDataState, Continuation<? super ConfirmDeleteDialogDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ConfirmDeleteDialogDataState confirmDeleteDialogDataState, Continuation<? super ConfirmDeleteDialogDataState> continuation) {
                return ((AnonymousClass2) create(confirmDeleteDialogDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return ((ConfirmDeleteDialogDataState) this.L$0).copy(false);
            }
        }

        /* compiled from: ConfirmDeleteDialogDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/max/accounts/ConfirmDeleteDialogDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.accounts.ConfirmDeleteDialogDuxo$deleteAccount$1$3", m3645f = "ConfirmDeleteDialogDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.transfers.ui.max.accounts.ConfirmDeleteDialogDuxo$deleteAccount$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<ConfirmDeleteDialogDataState, Continuation<? super ConfirmDeleteDialogDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ConfirmDeleteDialogDataState confirmDeleteDialogDataState, Continuation<? super ConfirmDeleteDialogDataState> continuation) {
                return ((AnonymousClass3) create(confirmDeleteDialogDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return ((ConfirmDeleteDialogDataState) this.L$0).copy(false);
            }
        }
    }

    public final void deleteAccount() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C307051(null), 3, null);
    }

    /* compiled from: ConfirmDeleteDialogDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/accounts/ConfirmDeleteDialogDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/transfers/ui/max/accounts/ConfirmDeleteDialogDuxo;", "Lcom/robinhood/android/transfers/ui/max/accounts/ConfirmDeleteDialogFragment$Args;", "<init>", "()V", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<ConfirmDeleteDialogDuxo, ConfirmDeleteDialogFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public ConfirmDeleteDialogFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (ConfirmDeleteDialogFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public ConfirmDeleteDialogFragment.Args getArgs(ConfirmDeleteDialogDuxo confirmDeleteDialogDuxo) {
            return (ConfirmDeleteDialogFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, confirmDeleteDialogDuxo);
        }
    }
}
