package com.robinhood.android.equity.history.p121ui.adrfee;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel2;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.equity.history.p121ui.adrfee.AdrFeeDetailDuxo;
import com.robinhood.android.equity.history.p121ui.adrfee.AdrFeeDetailEvent;
import com.robinhood.android.equity.history.p121ui.adrfee.AdrFeeDetailFragment;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.contentful.StaticContentStore;
import com.robinhood.contentful.model.EntryResource;
import com.robinhood.contentful.repository.ContentRepository;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.AdrFeeStore;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p355ui.UiAdrFee;
import com.robinhood.staticcontent.model.OtherMarkdown;
import kotlin.Metadata;
import kotlin.Result;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: AdrFeeDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001c2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001\u001cB9\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0006\u0010\u001b\u001a\u00020\u001aR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/equity/history/ui/adrfee/AdrFeeDetailDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/equity/history/ui/adrfee/AdrFeeDetailDataState;", "Lcom/robinhood/android/equity/history/ui/adrfee/AdrFeeDetailViewState;", "Lcom/robinhood/android/equity/history/ui/adrfee/AdrFeeDetailEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "adrFeeStore", "Lcom/robinhood/librobinhood/data/store/AdrFeeStore;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "staticContentStore", "Lcom/robinhood/contentful/StaticContentStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "stateProvider", "Lcom/robinhood/android/equity/history/ui/adrfee/AdrFeeDetailStateProvider;", "<init>", "(Lcom/robinhood/librobinhood/data/store/AdrFeeStore;Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/contentful/StaticContentStore;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/equity/history/ui/adrfee/AdrFeeDetailStateProvider;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "uiAdrFeeFlow", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/robinhood/models/ui/UiAdrFee;", "onCreate", "", "onViewInstrumentButtonClicked", "Companion", "feature-equity-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class AdrFeeDetailDuxo extends BaseDuxo3<AdrFeeDetailDataState, AdrFeeDetailViewState, AdrFeeDetailEvent> implements HasSavedState {
    private final AccountProvider accountProvider;
    private final AdrFeeStore adrFeeStore;
    private final SavedStateHandle savedStateHandle;
    private final StaticContentStore staticContentStore;
    private final StateFlow<UiAdrFee> uiAdrFeeFlow;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdrFeeDetailDuxo(AdrFeeStore adrFeeStore, AccountProvider accountProvider, StaticContentStore staticContentStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle, AdrFeeDetailStateProvider stateProvider) {
        super(new AdrFeeDetailDataState(null, null, null, 7, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(adrFeeStore, "adrFeeStore");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        this.adrFeeStore = adrFeeStore;
        this.accountProvider = accountProvider;
        this.staticContentStore = staticContentStore;
        this.savedStateHandle = savedStateHandle;
        this.uiAdrFeeFlow = FlowKt.stateIn(adrFeeStore.getAdrFee(((AdrFeeDetailFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getAdrFeeId()), ViewModel2.getViewModelScope(this), SharingStarted.INSTANCE.getLazily(), null);
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C151041(null));
    }

    /* compiled from: AdrFeeDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equity.history.ui.adrfee.AdrFeeDetailDuxo$onCreate$1", m3645f = "AdrFeeDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equity.history.ui.adrfee.AdrFeeDetailDuxo$onCreate$1 */
    static final class C151041 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C151041(Continuation<? super C151041> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C151041 c151041 = AdrFeeDetailDuxo.this.new C151041(continuation);
            c151041.L$0 = obj;
            return c151041;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C151041) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: AdrFeeDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equity.history.ui.adrfee.AdrFeeDetailDuxo$onCreate$1$1", m3645f = "AdrFeeDetailDuxo.kt", m3646l = {48}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.equity.history.ui.adrfee.AdrFeeDetailDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ AdrFeeDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(AdrFeeDetailDuxo adrFeeDetailDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = adrFeeDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object objM28550constructorimpl;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        AdrFeeDetailDuxo adrFeeDetailDuxo = this.this$0;
                        Result.Companion companion = Result.INSTANCE;
                        AdrFeeStore adrFeeStore = adrFeeDetailDuxo.adrFeeStore;
                        this.label = 1;
                        if (adrFeeStore.fetch(true, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    objM28550constructorimpl = Result.m28550constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                }
                AdrFeeDetailDuxo adrFeeDetailDuxo2 = this.this$0;
                Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
                if (thM28553exceptionOrNullimpl != null) {
                    adrFeeDetailDuxo2.submit(new AdrFeeDetailEvent.FetchResponseError(thM28553exceptionOrNullimpl));
                }
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(AdrFeeDetailDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(AdrFeeDetailDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(AdrFeeDetailDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass4(AdrFeeDetailDuxo.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: AdrFeeDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equity.history.ui.adrfee.AdrFeeDetailDuxo$onCreate$1$2", m3645f = "AdrFeeDetailDuxo.kt", m3646l = {57}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equity.history.ui.adrfee.AdrFeeDetailDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ AdrFeeDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(AdrFeeDetailDuxo adrFeeDetailDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = adrFeeDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowFilterNotNull = FlowKt.filterNotNull(this.this$0.uiAdrFeeFlow);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowFilterNotNull, anonymousClass1, this) == coroutine_suspended) {
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

            /* compiled from: AdrFeeDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "uiAdrFee", "Lcom/robinhood/models/ui/UiAdrFee;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equity.history.ui.adrfee.AdrFeeDetailDuxo$onCreate$1$2$1", m3645f = "AdrFeeDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equity.history.ui.adrfee.AdrFeeDetailDuxo$onCreate$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<UiAdrFee, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ AdrFeeDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(AdrFeeDetailDuxo adrFeeDetailDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = adrFeeDetailDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(UiAdrFee uiAdrFee, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(uiAdrFee, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: AdrFeeDetailDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equity/history/ui/adrfee/AdrFeeDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equity.history.ui.adrfee.AdrFeeDetailDuxo$onCreate$1$2$1$1", m3645f = "AdrFeeDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.equity.history.ui.adrfee.AdrFeeDetailDuxo$onCreate$1$2$1$1, reason: invalid class name and collision with other inner class name */
                static final class C499251 extends ContinuationImpl7 implements Function2<AdrFeeDetailDataState, Continuation<? super AdrFeeDetailDataState>, Object> {
                    final /* synthetic */ UiAdrFee $uiAdrFee;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C499251(UiAdrFee uiAdrFee, Continuation<? super C499251> continuation) {
                        super(2, continuation);
                        this.$uiAdrFee = uiAdrFee;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C499251 c499251 = new C499251(this.$uiAdrFee, continuation);
                        c499251.L$0 = obj;
                        return c499251;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(AdrFeeDetailDataState adrFeeDetailDataState, Continuation<? super AdrFeeDetailDataState> continuation) {
                        return ((C499251) create(adrFeeDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return AdrFeeDetailDataState.copy$default((AdrFeeDetailDataState) this.L$0, this.$uiAdrFee, null, null, 6, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C499251((UiAdrFee) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: AdrFeeDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equity.history.ui.adrfee.AdrFeeDetailDuxo$onCreate$1$3", m3645f = "AdrFeeDetailDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_HOME_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equity.history.ui.adrfee.AdrFeeDetailDuxo$onCreate$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ AdrFeeDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(AdrFeeDetailDuxo adrFeeDetailDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = adrFeeDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.filterNotNull(this.this$0.uiAdrFeeFlow), new Function2() { // from class: com.robinhood.android.equity.history.ui.adrfee.AdrFeeDetailDuxo$onCreate$1$3$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            return Boolean.valueOf(AdrFeeDetailDuxo.C151041.AnonymousClass3.invokeSuspend$lambda$0((UiAdrFee) obj2, (UiAdrFee) obj3));
                        }
                    });
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass2, this) == coroutine_suspended) {
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

            /* compiled from: AdrFeeDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "uiAdrFee", "Lcom/robinhood/models/ui/UiAdrFee;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equity.history.ui.adrfee.AdrFeeDetailDuxo$onCreate$1$3$2", m3645f = "AdrFeeDetailDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_GUIDE_VALUE}, m3647m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.equity.history.ui.adrfee.AdrFeeDetailDuxo$onCreate$1$3$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<UiAdrFee, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ AdrFeeDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(AdrFeeDetailDuxo adrFeeDetailDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = adrFeeDetailDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(UiAdrFee uiAdrFee, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(uiAdrFee, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.this$0.accountProvider.streamAccount(((UiAdrFee) this.L$0).getAdrFee().getAccountNumber())), Integer.MAX_VALUE, null, 2, null);
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                        this.label = 1;
                        if (FlowKt.collectLatest(flowBuffer$default, anonymousClass1, this) == coroutine_suspended) {
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

                /* compiled from: AdrFeeDetailDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "account", "Lcom/robinhood/models/db/Account;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equity.history.ui.adrfee.AdrFeeDetailDuxo$onCreate$1$3$2$1", m3645f = "AdrFeeDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.equity.history.ui.adrfee.AdrFeeDetailDuxo$onCreate$1$3$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Account, Continuation<? super Unit>, Object> {
                    /* synthetic */ Object L$0;
                    int label;
                    final /* synthetic */ AdrFeeDetailDuxo this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(AdrFeeDetailDuxo adrFeeDetailDuxo, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.this$0 = adrFeeDetailDuxo;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Account account, Continuation<? super Unit> continuation) {
                        return ((AnonymousClass1) create(account, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    /* compiled from: AdrFeeDetailDuxo.kt */
                    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equity/history/ui/adrfee/AdrFeeDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.equity.history.ui.adrfee.AdrFeeDetailDuxo$onCreate$1$3$2$1$1", m3645f = "AdrFeeDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                    /* renamed from: com.robinhood.android.equity.history.ui.adrfee.AdrFeeDetailDuxo$onCreate$1$3$2$1$1, reason: invalid class name and collision with other inner class name */
                    static final class C499261 extends ContinuationImpl7 implements Function2<AdrFeeDetailDataState, Continuation<? super AdrFeeDetailDataState>, Object> {
                        final /* synthetic */ Account $account;
                        private /* synthetic */ Object L$0;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C499261(Account account, Continuation<? super C499261> continuation) {
                            super(2, continuation);
                            this.$account = account;
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            C499261 c499261 = new C499261(this.$account, continuation);
                            c499261.L$0 = obj;
                            return c499261;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(AdrFeeDetailDataState adrFeeDetailDataState, Continuation<? super AdrFeeDetailDataState> continuation) {
                            return ((C499261) create(adrFeeDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            if (this.label != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return AdrFeeDetailDataState.copy$default((AdrFeeDetailDataState) this.L$0, null, this.$account, null, 5, null);
                        }
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label == 0) {
                            ResultKt.throwOnFailure(obj);
                            this.this$0.applyMutation(new C499261((Account) this.L$0, null));
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final boolean invokeSuspend$lambda$0(UiAdrFee uiAdrFee, UiAdrFee uiAdrFee2) {
                return Intrinsics.areEqual(uiAdrFee.getAdrFee().getAccountNumber(), uiAdrFee2.getAdrFee().getAccountNumber());
            }
        }

        /* compiled from: AdrFeeDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equity.history.ui.adrfee.AdrFeeDetailDuxo$onCreate$1$4", m3645f = "AdrFeeDetailDuxo.kt", m3646l = {85}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equity.history.ui.adrfee.AdrFeeDetailDuxo$onCreate$1$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ AdrFeeDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(AdrFeeDetailDuxo adrFeeDetailDuxo, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = adrFeeDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass4(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.filterNotNull(this.this$0.uiAdrFeeFlow), new Function2() { // from class: com.robinhood.android.equity.history.ui.adrfee.AdrFeeDetailDuxo$onCreate$1$4$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            return Boolean.valueOf(AdrFeeDetailDuxo.C151041.AnonymousClass4.invokeSuspend$lambda$0((UiAdrFee) obj2, (UiAdrFee) obj3));
                        }
                    });
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass2, this) == coroutine_suspended) {
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

            /* JADX INFO: Access modifiers changed from: private */
            public static final boolean invokeSuspend$lambda$0(UiAdrFee uiAdrFee, UiAdrFee uiAdrFee2) {
                return Intrinsics.areEqual(uiAdrFee.getAdrFee().getDisclosureContentfulId(), uiAdrFee2.getAdrFee().getDisclosureContentfulId());
            }

            /* compiled from: AdrFeeDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "uiAdrFee", "Lcom/robinhood/models/ui/UiAdrFee;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equity.history.ui.adrfee.AdrFeeDetailDuxo$onCreate$1$4$2", m3645f = "AdrFeeDetailDuxo.kt", m3646l = {88}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equity.history.ui.adrfee.AdrFeeDetailDuxo$onCreate$1$4$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<UiAdrFee, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ AdrFeeDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(AdrFeeDetailDuxo adrFeeDetailDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = adrFeeDetailDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(UiAdrFee uiAdrFee, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(uiAdrFee, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    AdrFeeDetailDuxo adrFeeDetailDuxo;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        String disclosureContentfulId = ((UiAdrFee) this.L$0).getAdrFee().getDisclosureContentfulId();
                        if (disclosureContentfulId != null) {
                            AdrFeeDetailDuxo adrFeeDetailDuxo2 = this.this$0;
                            StaticContentStore staticContentStore = adrFeeDetailDuxo2.staticContentStore;
                            this.L$0 = adrFeeDetailDuxo2;
                            this.label = 1;
                            Object objLoadEntry$default = ContentRepository.DefaultImpls.loadEntry$default(staticContentStore, disclosureContentfulId, null, this, 2, null);
                            if (objLoadEntry$default == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            adrFeeDetailDuxo = adrFeeDetailDuxo2;
                            obj = objLoadEntry$default;
                        }
                        return Unit.INSTANCE;
                    }
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    adrFeeDetailDuxo = (AdrFeeDetailDuxo) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    adrFeeDetailDuxo.applyMutation(new AdrFeeDetailDuxo2(((OtherMarkdown) ((EntryResource) obj).getValue()).getMarkdown2(), null));
                    return Unit.INSTANCE;
                }
            }
        }
    }

    public final void onViewInstrumentButtonClicked() {
        withDataState(new Function1() { // from class: com.robinhood.android.equity.history.ui.adrfee.AdrFeeDetailDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdrFeeDetailDuxo.onViewInstrumentButtonClicked$lambda$0(this.f$0, (AdrFeeDetailDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewInstrumentButtonClicked$lambda$0(AdrFeeDetailDuxo adrFeeDetailDuxo, AdrFeeDetailDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        UiAdrFee uiAdrFee = dataState.getUiAdrFee();
        String instrumentSymbol = uiAdrFee != null ? uiAdrFee.getInstrumentSymbol() : null;
        Account account = dataState.getAccount();
        String accountNumber = account != null ? account.getAccountNumber() : null;
        if (instrumentSymbol != null && accountNumber != null) {
            adrFeeDetailDuxo.submit(new AdrFeeDetailEvent.NavigateToInstrumentDetailFragment(instrumentSymbol, accountNumber));
        }
        return Unit.INSTANCE;
    }

    /* compiled from: AdrFeeDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/equity/history/ui/adrfee/AdrFeeDetailDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/equity/history/ui/adrfee/AdrFeeDetailDuxo;", "Lcom/robinhood/android/equity/history/ui/adrfee/AdrFeeDetailFragment$Args;", "<init>", "()V", "feature-equity-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<AdrFeeDetailDuxo, AdrFeeDetailFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AdrFeeDetailFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (AdrFeeDetailFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AdrFeeDetailFragment.Args getArgs(AdrFeeDetailDuxo adrFeeDetailDuxo) {
            return (AdrFeeDetailFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, adrFeeDetailDuxo);
        }
    }
}
