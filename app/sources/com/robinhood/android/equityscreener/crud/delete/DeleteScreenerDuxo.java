package com.robinhood.android.equityscreener.crud.delete;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.equities.contracts.screeners.DeleteScreenerContract;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.equityscreener.models.LocalScreenerMetadata;
import com.robinhood.equityscreener.models.ScreenerLoggingKeys;
import com.robinhood.librobinhood.data.store.bonfire.screener.store.ScreenersStore;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: DeleteScreenerDuxo.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0017B1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0006\u0010\u0015\u001a\u00020\u0014J\u0006\u0010\u0016\u001a\u00020\u0014R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/equityscreener/crud/delete/DeleteScreenerDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/equityscreener/crud/delete/DeleteScreenerDataState;", "Lcom/robinhood/android/equityscreener/crud/delete/DeleteScreenerViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "screenersStore", "Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/ScreenersStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "stateProvider", "Lcom/robinhood/android/equityscreener/crud/delete/DeleteScreenerStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/ScreenersStore;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/android/equityscreener/crud/delete/DeleteScreenerStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "onDelete", "logOnDismiss", "Companion", "feature-equity-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class DeleteScreenerDuxo extends BaseDuxo<DeleteScreenerDataState, DeleteScreenerViewState> implements HasSavedState {
    private final EventLogger eventLogger;
    private final SavedStateHandle savedStateHandle;
    private final ScreenersStore screenersStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeleteScreenerDuxo(SavedStateHandle savedStateHandle, ScreenersStore screenersStore, EventLogger eventLogger, DeleteScreenerViewState2 stateProvider, DuxoBundle duxoBundle) {
        super(new DeleteScreenerDataState(null, false, false, 7, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(screenersStore, "screenersStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.savedStateHandle = savedStateHandle;
        this.screenersStore = screenersStore;
        this.eventLogger = eventLogger;
    }

    /* compiled from: DeleteScreenerDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/equityscreener/crud/delete/DeleteScreenerDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/equityscreener/crud/delete/DeleteScreenerDuxo;", "Lcom/robinhood/android/equities/contracts/screeners/DeleteScreenerContract$Key;", "<init>", "()V", "feature-equity-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<DeleteScreenerDuxo, DeleteScreenerContract.Key> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public DeleteScreenerContract.Key getArgs(SavedStateHandle savedStateHandle) {
            return (DeleteScreenerContract.Key) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public DeleteScreenerContract.Key getArgs(DeleteScreenerDuxo deleteScreenerDuxo) {
            return (DeleteScreenerContract.Key) DuxoCompanion.DefaultImpls.getArgs(this, deleteScreenerDuxo);
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        LifecycleHost.DefaultImpls.bind$default(this, this.screenersStore.getLocalScreener(((DeleteScreenerContract.Key) INSTANCE.getArgs((HasSavedState) this)).getScreenerId()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.equityscreener.crud.delete.DeleteScreenerDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DeleteScreenerDuxo.onStart$lambda$0(this.f$0, (LocalScreenerMetadata) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$0(DeleteScreenerDuxo deleteScreenerDuxo, LocalScreenerMetadata localScreenerData) {
        Intrinsics.checkNotNullParameter(localScreenerData, "localScreenerData");
        deleteScreenerDuxo.applyMutation(new DeleteScreenerDuxo2(localScreenerData, null));
        return Unit.INSTANCE;
    }

    /* compiled from: DeleteScreenerDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equityscreener/crud/delete/DeleteScreenerDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equityscreener.crud.delete.DeleteScreenerDuxo$onDelete$1", m3645f = "DeleteScreenerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equityscreener.crud.delete.DeleteScreenerDuxo$onDelete$1 */
    static final class C156621 extends ContinuationImpl7 implements Function2<DeleteScreenerDataState, Continuation<? super DeleteScreenerDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C156621(Continuation<? super C156621> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C156621 c156621 = new C156621(continuation);
            c156621.L$0 = obj;
            return c156621;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(DeleteScreenerDataState deleteScreenerDataState, Continuation<? super DeleteScreenerDataState> continuation) {
            return ((C156621) create(deleteScreenerDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return DeleteScreenerDataState.copy$default((DeleteScreenerDataState) this.L$0, null, true, false, 5, null);
        }
    }

    public final void onDelete() {
        applyMutation(new C156621(null));
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C156632(null), 3, null);
        EventLogger.DefaultImpls.logTap$default(this.eventLogger, UserInteractionEventData.Action.CONTINUE, null, new Component(Component.ComponentType.BUTTON, ScreenerLoggingKeys.DELETE_SCREENER_CONTINUE, null, 4, null), null, null, false, 58, null);
    }

    /* compiled from: DeleteScreenerDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equityscreener.crud.delete.DeleteScreenerDuxo$onDelete$2", m3645f = "DeleteScreenerDuxo.kt", m3646l = {52, 52}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equityscreener.crud.delete.DeleteScreenerDuxo$onDelete$2 */
    static final class C156632 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C156632(Continuation<? super C156632> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DeleteScreenerDuxo.this.new C156632(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C156632) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
        
            if (((kotlinx.coroutines.Job) r7).join(r6) == r0) goto L18;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
            } catch (Exception unused) {
                DeleteScreenerDuxo.this.applyMutation(new AnonymousClass2(null));
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ScreenersStore screenersStore = DeleteScreenerDuxo.this.screenersStore;
                String screenerId = ((DeleteScreenerContract.Key) DeleteScreenerDuxo.INSTANCE.getArgs((HasSavedState) DeleteScreenerDuxo.this)).getScreenerId();
                this.label = 1;
                obj = screenersStore.deleteScreener(screenerId, this);
                if (obj == coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                DeleteScreenerDuxo.this.applyMutation(new AnonymousClass1(null));
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            this.label = 2;
        }

        /* compiled from: DeleteScreenerDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equityscreener/crud/delete/DeleteScreenerDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equityscreener.crud.delete.DeleteScreenerDuxo$onDelete$2$1", m3645f = "DeleteScreenerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equityscreener.crud.delete.DeleteScreenerDuxo$onDelete$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<DeleteScreenerDataState, Continuation<? super DeleteScreenerDataState>, Object> {
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
            public final Object invoke(DeleteScreenerDataState deleteScreenerDataState, Continuation<? super DeleteScreenerDataState> continuation) {
                return ((AnonymousClass1) create(deleteScreenerDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return DeleteScreenerDataState.copy$default((DeleteScreenerDataState) this.L$0, null, false, true, 1, null);
            }
        }

        /* compiled from: DeleteScreenerDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equityscreener/crud/delete/DeleteScreenerDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equityscreener.crud.delete.DeleteScreenerDuxo$onDelete$2$2", m3645f = "DeleteScreenerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equityscreener.crud.delete.DeleteScreenerDuxo$onDelete$2$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<DeleteScreenerDataState, Continuation<? super DeleteScreenerDataState>, Object> {
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
            public final Object invoke(DeleteScreenerDataState deleteScreenerDataState, Continuation<? super DeleteScreenerDataState> continuation) {
                return ((AnonymousClass2) create(deleteScreenerDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return DeleteScreenerDataState.copy$default((DeleteScreenerDataState) this.L$0, null, false, false, 5, null);
            }
        }
    }

    public final void logOnDismiss() {
        EventLogger.DefaultImpls.logTap$default(this.eventLogger, UserInteractionEventData.Action.BACK, null, new Component(Component.ComponentType.BUTTON, ScreenerLoggingKeys.DELETE_SCREENER_CANCEL, null, 4, null), null, null, false, 58, null);
    }
}
