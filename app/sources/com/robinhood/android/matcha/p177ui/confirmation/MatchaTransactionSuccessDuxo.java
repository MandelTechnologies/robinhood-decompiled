package com.robinhood.android.matcha.p177ui.confirmation;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.matcha.p177ui.confirmation.ConfirmationType;
import com.robinhood.android.matcha.p177ui.confirmation.MatchaTransactionSuccessEvent;
import com.robinhood.android.matcha.p177ui.confirmation.MatchaTransactionSuccessFragment;
import com.robinhood.android.models.matcha.api.MatchaAdditionalPagesResponse;
import com.robinhood.android.models.matcha.api.MatchaTransactionType;
import com.robinhood.android.store.matcha.MatchaAdditionalPagesStore;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.utils.extensions.Throwables;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
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

/* compiled from: MatchaTransactionSuccessDuxo.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001a2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001\u001aB)\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0006\u0010\u0014\u001a\u00020\u0013J\u0018\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/confirmation/MatchaTransactionSuccessDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/matcha/ui/confirmation/MatchaTransactionSuccessDataState;", "Lcom/robinhood/android/matcha/ui/confirmation/MatchaTransactionSuccessViewState;", "Lcom/robinhood/android/matcha/ui/confirmation/MatchaTransactionSuccessEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "matchaAdditionalPagesStore", "Lcom/robinhood/android/store/matcha/MatchaAdditionalPagesStore;", "stateProvider", "Lcom/robinhood/android/matcha/ui/confirmation/MatchaTransactionSuccessStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/store/matcha/MatchaAdditionalPagesStore;Lcom/robinhood/android/matcha/ui/confirmation/MatchaTransactionSuccessStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "finish", "loadAdditionalPages", "transactionType", "Lcom/robinhood/android/models/matcha/api/MatchaTransactionType;", "transactionId", "Ljava/util/UUID;", "Companion", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class MatchaTransactionSuccessDuxo extends BaseDuxo3<MatchaTransactionSuccessDataState, MatchaTransactionSuccessViewState, MatchaTransactionSuccessEvent> implements HasSavedState {
    private final MatchaAdditionalPagesStore matchaAdditionalPagesStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MatchaTransactionSuccessDuxo(MatchaAdditionalPagesStore matchaAdditionalPagesStore, MatchaTransactionSuccessStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new MatchaTransactionSuccessDataState(null, 1, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(matchaAdditionalPagesStore, "matchaAdditionalPagesStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.matchaAdditionalPagesStore = matchaAdditionalPagesStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        ConfirmationType type2 = ((MatchaTransactionSuccessFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getType();
        if ((type2 instanceof ConfirmationType.PaymentClaimed) || (type2 instanceof ConfirmationType.PaymentComplete) || (type2 instanceof ConfirmationType.PaymentPending) || (type2 instanceof ConfirmationType.PaymentProcessing) || (type2 instanceof ConfirmationType.MultiuserPayment)) {
            loadAdditionalPages(MatchaTransactionType.MATCHA_TRANSFER, type2.getTransactionId());
        } else {
            if (!(type2 instanceof ConfirmationType.RequestSent) && !(type2 instanceof ConfirmationType.MultiuserRequest)) {
                throw new NoWhenBranchMatchedException();
            }
            loadAdditionalPages(MatchaTransactionType.MATCHA_REQUEST, type2.getTransactionId());
        }
    }

    public final void finish() {
        submit(new MatchaTransactionSuccessEvent.Exit(getStateFlow().getValue().getPostSuccessKey()));
    }

    /* compiled from: MatchaTransactionSuccessDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.confirmation.MatchaTransactionSuccessDuxo$loadAdditionalPages$1", m3645f = "MatchaTransactionSuccessDuxo.kt", m3646l = {55}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.matcha.ui.confirmation.MatchaTransactionSuccessDuxo$loadAdditionalPages$1 */
    static final class C213071 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $transactionId;
        final /* synthetic */ MatchaTransactionType $transactionType;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C213071(MatchaTransactionType matchaTransactionType, UUID uuid, Continuation<? super C213071> continuation) {
            super(2, continuation);
            this.$transactionType = matchaTransactionType;
            this.$transactionId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MatchaTransactionSuccessDuxo.this.new C213071(this.$transactionType, this.$transactionId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C213071) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    MatchaAdditionalPagesStore matchaAdditionalPagesStore = MatchaTransactionSuccessDuxo.this.matchaAdditionalPagesStore;
                    MatchaTransactionType matchaTransactionType = this.$transactionType;
                    String string2 = this.$transactionId.toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                    this.label = 1;
                    obj = matchaAdditionalPagesStore.getAdditionalPages(matchaTransactionType, string2, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                MatchaTransactionSuccessDuxo.this.applyMutation(new AnonymousClass1((MatchaAdditionalPagesResponse) obj, null));
            } catch (Throwable th) {
                if (Throwables.isNetworkRelated(th)) {
                    MatchaTransactionSuccessDuxo.this.applyMutation(new AnonymousClass2(th, null));
                } else {
                    throw th;
                }
            }
            return Unit.INSTANCE;
        }

        /* compiled from: MatchaTransactionSuccessDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/matcha/ui/confirmation/MatchaTransactionSuccessDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.confirmation.MatchaTransactionSuccessDuxo$loadAdditionalPages$1$1", m3645f = "MatchaTransactionSuccessDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.matcha.ui.confirmation.MatchaTransactionSuccessDuxo$loadAdditionalPages$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<MatchaTransactionSuccessDataState, Continuation<? super MatchaTransactionSuccessDataState>, Object> {
            final /* synthetic */ MatchaAdditionalPagesResponse $pages;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(MatchaAdditionalPagesResponse matchaAdditionalPagesResponse, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$pages = matchaAdditionalPagesResponse;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$pages, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(MatchaTransactionSuccessDataState matchaTransactionSuccessDataState, Continuation<? super MatchaTransactionSuccessDataState> continuation) {
                return ((AnonymousClass1) create(matchaTransactionSuccessDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                MatchaTransactionSuccessDataState matchaTransactionSuccessDataState = (MatchaTransactionSuccessDataState) this.L$0;
                Result.Companion companion = Result.INSTANCE;
                return matchaTransactionSuccessDataState.copy(Result.m28549boximpl(Result.m28550constructorimpl(this.$pages)));
            }
        }

        /* compiled from: MatchaTransactionSuccessDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/matcha/ui/confirmation/MatchaTransactionSuccessDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.confirmation.MatchaTransactionSuccessDuxo$loadAdditionalPages$1$2", m3645f = "MatchaTransactionSuccessDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.matcha.ui.confirmation.MatchaTransactionSuccessDuxo$loadAdditionalPages$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<MatchaTransactionSuccessDataState, Continuation<? super MatchaTransactionSuccessDataState>, Object> {

            /* renamed from: $t */
            final /* synthetic */ Throwable f4547$t;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(Throwable th, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.f4547$t = th;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f4547$t, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(MatchaTransactionSuccessDataState matchaTransactionSuccessDataState, Continuation<? super MatchaTransactionSuccessDataState> continuation) {
                return ((AnonymousClass2) create(matchaTransactionSuccessDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                MatchaTransactionSuccessDataState matchaTransactionSuccessDataState = (MatchaTransactionSuccessDataState) this.L$0;
                Result.Companion companion = Result.INSTANCE;
                return matchaTransactionSuccessDataState.copy(Result.m28549boximpl(Result.m28550constructorimpl(ResultKt.createFailure(this.f4547$t))));
            }
        }
    }

    private final void loadAdditionalPages(MatchaTransactionType transactionType, UUID transactionId) {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C213071(transactionType, transactionId, null), 3, null);
    }

    /* compiled from: MatchaTransactionSuccessDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/confirmation/MatchaTransactionSuccessDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/matcha/ui/confirmation/MatchaTransactionSuccessDuxo;", "Lcom/robinhood/android/matcha/ui/confirmation/MatchaTransactionSuccessFragment$Args;", "<init>", "()V", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<MatchaTransactionSuccessDuxo, MatchaTransactionSuccessFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public MatchaTransactionSuccessFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (MatchaTransactionSuccessFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public MatchaTransactionSuccessFragment.Args getArgs(MatchaTransactionSuccessDuxo matchaTransactionSuccessDuxo) {
            return (MatchaTransactionSuccessFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, matchaTransactionSuccessDuxo);
        }
    }
}
