package com.robinhood.android.pathfinder.corepages.supportlanding;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingDuxo;
import com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingEvent;
import com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingViewState;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.librobinhood.data.store.PathfinderInquirySessionStore;
import com.robinhood.librobinhood.data.store.PathfinderInquirySessionStore2;
import com.robinhood.librobinhood.data.store.PathfinderStore;
import com.robinhood.librobinhood.data.store.SupportLandingStore;
import com.robinhood.models.api.pathfinder.UserViewInput;
import com.robinhood.models.p355ui.pathfinder.contexts.SupportLandingAccountTab;
import com.robinhood.models.p355ui.pathfinder.contexts.SupportLandingContext;
import com.robinhood.models.p355ui.pathfinder.contexts.UserViewStatePageContext;
import com.robinhood.shared.support.contracts.pathfinder.SupportLandingFragmentKey;
import com.robinhood.utils.extensions.Throwables;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
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

/* compiled from: SupportLandingDuxo.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u0000 -2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001-B9\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u001a\u001a\u00020\u001bH\u0016J)\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020!0 H\u0000¢\u0006\u0002\b\"J\u0015\u0010#\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001eH\u0000¢\u0006\u0002\b$J\u001d\u0010%\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\u001eH\u0000¢\u0006\u0002\b'J\u000e\u0010(\u001a\u00020\u001b2\u0006\u0010)\u001a\u00020\u001eJ\"\u0010*\u001a\u00020\u001b2\u0006\u0010)\u001a\u00020\u001e2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020,0 R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006."}, m3636d2 = {"Lcom/robinhood/android/pathfinder/corepages/supportlanding/SupportLandingDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/pathfinder/corepages/supportlanding/SupportLandingDataState;", "Lcom/robinhood/android/pathfinder/corepages/supportlanding/SupportLandingViewState;", "Lcom/robinhood/android/pathfinder/corepages/supportlanding/SupportLandingEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "supportLandingStore", "Lcom/robinhood/librobinhood/data/store/SupportLandingStore;", "pathfinderStore", "Lcom/robinhood/librobinhood/data/store/PathfinderStore;", "pathfinderInquirySessionStore", "Lcom/robinhood/librobinhood/data/store/PathfinderInquirySessionStore;", "stateProvider", "Lcom/robinhood/android/pathfinder/corepages/supportlanding/SupportLandingStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/SupportLandingStore;Lcom/robinhood/librobinhood/data/store/PathfinderStore;Lcom/robinhood/librobinhood/data/store/PathfinderInquirySessionStore;Lcom/robinhood/android/pathfinder/corepages/supportlanding/SupportLandingStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "userViewContext", "Lcom/robinhood/models/ui/pathfinder/contexts/SupportLandingContext;", "getUserViewContext", "()Lcom/robinhood/models/ui/pathfinder/contexts/SupportLandingContext;", "onCreate", "", "setTabSelected", "accountType", "", "accountTypeToTabStatus", "", "Lcom/robinhood/android/pathfinder/corepages/supportlanding/SupportLandingViewState$TabContentStatus;", "setTabSelected$feature_pathfinder_core_pages_externalDebug", "fetchAccounts", "fetchAccounts$feature_pathfinder_core_pages_externalDebug", "onSubAccountSelected", "subAccountNumber", "onSubAccountSelected$feature_pathfinder_core_pages_externalDebug", "sendInput", "value", "submitFormInput", "formData", "", "Companion", "feature-pathfinder-core-pages_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class SupportLandingDuxo extends BaseDuxo3<SupportLandingDataState, SupportLandingViewState, SupportLandingEvent> implements HasSavedState {
    private final PathfinderInquirySessionStore pathfinderInquirySessionStore;
    private final PathfinderStore pathfinderStore;
    private final SavedStateHandle savedStateHandle;
    private final SupportLandingStore supportLandingStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportLandingDuxo(SupportLandingStore supportLandingStore, PathfinderStore pathfinderStore, PathfinderInquirySessionStore pathfinderInquirySessionStore, SupportLandingStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new SupportLandingDataState(((UserViewStatePageContext.SupportLanding) ((SupportLandingFragmentKey) INSTANCE.getArgs(savedStateHandle)).getUserViewState().getTypeContext()).getContext(), null, null, null, false, 30, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(supportLandingStore, "supportLandingStore");
        Intrinsics.checkNotNullParameter(pathfinderStore, "pathfinderStore");
        Intrinsics.checkNotNullParameter(pathfinderInquirySessionStore, "pathfinderInquirySessionStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.supportLandingStore = supportLandingStore;
        this.pathfinderStore = pathfinderStore;
        this.pathfinderInquirySessionStore = pathfinderInquirySessionStore;
        this.savedStateHandle = savedStateHandle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SupportLandingContext getUserViewContext() {
        return ((UserViewStatePageContext.SupportLanding) ((SupportLandingFragmentKey) INSTANCE.getArgs((HasSavedState) this)).getUserViewState().getTypeContext()).getContext();
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        String startTab = PathfinderInquirySessionStore2.getSelectedAccountType(this.pathfinderInquirySessionStore, ((SupportLandingFragmentKey) INSTANCE.getArgs((HasSavedState) this)).getInquiryId()).get();
        if (startTab == null && (startTab = getUserViewContext().getStartTab()) == null) {
            SupportLandingAccountTab supportLandingAccountTab = (SupportLandingAccountTab) CollectionsKt.firstOrNull((List) getUserViewContext().getTabs());
            startTab = supportLandingAccountTab != null ? supportLandingAccountTab.getAccountType() : null;
            if (startTab == null) {
                startTab = "";
            }
        }
        applyMutation(new C253871(startTab, null));
        setTabSelected$feature_pathfinder_core_pages_externalDebug(startTab, MapsKt.emptyMap());
    }

    /* compiled from: SupportLandingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/pathfinder/corepages/supportlanding/SupportLandingDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingDuxo$onCreate$1", m3645f = "SupportLandingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingDuxo$onCreate$1 */
    static final class C253871 extends ContinuationImpl7 implements Function2<SupportLandingDataState, Continuation<? super SupportLandingDataState>, Object> {
        final /* synthetic */ String $initialSelectedAccountType;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C253871(String str, Continuation<? super C253871> continuation) {
            super(2, continuation);
            this.$initialSelectedAccountType = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C253871 c253871 = SupportLandingDuxo.this.new C253871(this.$initialSelectedAccountType, continuation);
            c253871.L$0 = obj;
            return c253871;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SupportLandingDataState supportLandingDataState, Continuation<? super SupportLandingDataState> continuation) {
            return ((C253871) create(supportLandingDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return SupportLandingDataState.copy$default((SupportLandingDataState) this.L$0, SupportLandingDuxo.this.getUserViewContext(), this.$initialSelectedAccountType, null, null, false, 28, null);
        }
    }

    public final void setTabSelected$feature_pathfinder_core_pages_externalDebug(String accountType, Map<String, ? extends SupportLandingViewState.TabContentStatus> accountTypeToTabStatus) {
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(accountTypeToTabStatus, "accountTypeToTabStatus");
        PathfinderInquirySessionStore2.getSelectedAccountType(this.pathfinderInquirySessionStore, ((SupportLandingFragmentKey) INSTANCE.getArgs((HasSavedState) this)).getInquiryId()).set(accountType);
        applyMutation(new SupportLandingDuxo5(accountType, null));
        SupportLandingViewState.TabContentStatus tabContentStatus = accountTypeToTabStatus.get(accountType);
        if (tabContentStatus == null || Intrinsics.areEqual(tabContentStatus, SupportLandingViewState.TabContentStatus.Loading.INSTANCE)) {
            fetchAccounts$feature_pathfinder_core_pages_externalDebug(accountType);
        }
    }

    public final void fetchAccounts$feature_pathfinder_core_pages_externalDebug(String accountType) {
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        applyMutation(new SupportLandingDuxo2(accountType, null));
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new SupportLandingDuxo3(this, accountType, null), 3, null);
    }

    public final void onSubAccountSelected$feature_pathfinder_core_pages_externalDebug(String accountType, String subAccountNumber) {
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(subAccountNumber, "subAccountNumber");
        applyMutation(new SupportLandingDuxo4(accountType, subAccountNumber, null));
    }

    /* compiled from: SupportLandingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingDuxo$sendInput$1", m3645f = "SupportLandingDuxo.kt", m3646l = {131}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingDuxo$sendInput$1 */
    static final class C253881 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $value;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C253881(String str, Continuation<? super C253881> continuation) {
            super(2, continuation);
            this.$value = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SupportLandingDuxo.this.new C253881(this.$value, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C253881) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: SupportLandingDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/pathfinder/corepages/supportlanding/SupportLandingDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingDuxo$sendInput$1$1", m3645f = "SupportLandingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingDuxo$sendInput$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<SupportLandingDataState, Continuation<? super SupportLandingDataState>, Object> {
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
            public final Object invoke(SupportLandingDataState supportLandingDataState, Continuation<? super SupportLandingDataState> continuation) {
                return ((AnonymousClass1) create(supportLandingDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return SupportLandingDataState.copy$default((SupportLandingDataState) this.L$0, null, null, null, null, true, 15, null);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            C253881 c253881;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SupportLandingDuxo.this.applyMutation(new AnonymousClass1(null));
                PathfinderStore pathfinderStore = SupportLandingDuxo.this.pathfinderStore;
                Companion companion = SupportLandingDuxo.INSTANCE;
                UUID inquiryId = ((SupportLandingFragmentKey) companion.getArgs((HasSavedState) SupportLandingDuxo.this)).getInquiryId();
                int sequence = ((SupportLandingFragmentKey) companion.getArgs((HasSavedState) SupportLandingDuxo.this)).getUserViewState().getSequence();
                UserViewInput.Sdui sdui = new UserViewInput.Sdui(this.$value);
                final SupportLandingDuxo supportLandingDuxo = SupportLandingDuxo.this;
                Function1<? super Throwable, Boolean> function1 = new Function1() { // from class: com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingDuxo$sendInput$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return Boolean.valueOf(SupportLandingDuxo.C253881.invokeSuspend$lambda$1(supportLandingDuxo, (Throwable) obj2));
                    }
                };
                this.label = 1;
                c253881 = this;
                if (pathfinderStore.handleUserInput(inquiryId, sequence, sdui, function1, c253881) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                c253881 = this;
            }
            SupportLandingDuxo.this.applyMutation(new AnonymousClass3(null));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invokeSuspend$lambda$1(SupportLandingDuxo supportLandingDuxo, Throwable th) {
            boolean zIsNetworkRelated = Throwables.isNetworkRelated(th);
            if (zIsNetworkRelated) {
                supportLandingDuxo.submit(SupportLandingEvent.SendInputError.INSTANCE);
            }
            return zIsNetworkRelated;
        }

        /* compiled from: SupportLandingDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/pathfinder/corepages/supportlanding/SupportLandingDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingDuxo$sendInput$1$3", m3645f = "SupportLandingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingDuxo$sendInput$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<SupportLandingDataState, Continuation<? super SupportLandingDataState>, Object> {
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
            public final Object invoke(SupportLandingDataState supportLandingDataState, Continuation<? super SupportLandingDataState> continuation) {
                return ((AnonymousClass3) create(supportLandingDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return SupportLandingDataState.copy$default((SupportLandingDataState) this.L$0, null, null, null, null, false, 15, null);
            }
        }
    }

    public final void sendInput(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C253881(value, null), 3, null);
    }

    /* compiled from: SupportLandingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingDuxo$submitFormInput$1", m3645f = "SupportLandingDuxo.kt", m3646l = {151}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingDuxo$submitFormInput$1 */
    static final class C253891 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Map<String, Object> $formData;
        final /* synthetic */ String $value;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C253891(String str, Map<String, ? extends Object> map, Continuation<? super C253891> continuation) {
            super(2, continuation);
            this.$value = str;
            this.$formData = map;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SupportLandingDuxo.this.new C253891(this.$value, this.$formData, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C253891) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: SupportLandingDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/pathfinder/corepages/supportlanding/SupportLandingDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingDuxo$submitFormInput$1$1", m3645f = "SupportLandingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingDuxo$submitFormInput$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<SupportLandingDataState, Continuation<? super SupportLandingDataState>, Object> {
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
            public final Object invoke(SupportLandingDataState supportLandingDataState, Continuation<? super SupportLandingDataState> continuation) {
                return ((AnonymousClass1) create(supportLandingDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return SupportLandingDataState.copy$default((SupportLandingDataState) this.L$0, null, null, null, null, true, 15, null);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            C253891 c253891;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SupportLandingDuxo.this.applyMutation(new AnonymousClass1(null));
                PathfinderStore pathfinderStore = SupportLandingDuxo.this.pathfinderStore;
                Companion companion = SupportLandingDuxo.INSTANCE;
                UUID inquiryId = ((SupportLandingFragmentKey) companion.getArgs((HasSavedState) SupportLandingDuxo.this)).getInquiryId();
                int sequence = ((SupportLandingFragmentKey) companion.getArgs((HasSavedState) SupportLandingDuxo.this)).getUserViewState().getSequence();
                UserViewInput.SduiSubmitForm sduiSubmitForm = new UserViewInput.SduiSubmitForm(this.$value, this.$formData);
                final SupportLandingDuxo supportLandingDuxo = SupportLandingDuxo.this;
                Function1<? super Throwable, Boolean> function1 = new Function1() { // from class: com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingDuxo$submitFormInput$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return Boolean.valueOf(SupportLandingDuxo.C253891.invokeSuspend$lambda$1(supportLandingDuxo, (Throwable) obj2));
                    }
                };
                this.label = 1;
                c253891 = this;
                if (pathfinderStore.handleUserInput(inquiryId, sequence, sduiSubmitForm, function1, c253891) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                c253891 = this;
            }
            SupportLandingDuxo.this.applyMutation(new AnonymousClass3(null));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invokeSuspend$lambda$1(SupportLandingDuxo supportLandingDuxo, Throwable th) {
            boolean zIsNetworkRelated = Throwables.isNetworkRelated(th);
            if (zIsNetworkRelated) {
                supportLandingDuxo.submit(SupportLandingEvent.SendInputError.INSTANCE);
            }
            return zIsNetworkRelated;
        }

        /* compiled from: SupportLandingDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/pathfinder/corepages/supportlanding/SupportLandingDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingDuxo$submitFormInput$1$3", m3645f = "SupportLandingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingDuxo$submitFormInput$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<SupportLandingDataState, Continuation<? super SupportLandingDataState>, Object> {
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
            public final Object invoke(SupportLandingDataState supportLandingDataState, Continuation<? super SupportLandingDataState> continuation) {
                return ((AnonymousClass3) create(supportLandingDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return SupportLandingDataState.copy$default((SupportLandingDataState) this.L$0, null, null, null, null, false, 15, null);
            }
        }
    }

    public final void submitFormInput(String value, Map<String, ? extends Object> formData) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(formData, "formData");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C253891(value, formData, null), 3, null);
    }

    /* compiled from: SupportLandingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/pathfinder/corepages/supportlanding/SupportLandingDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/pathfinder/corepages/supportlanding/SupportLandingDuxo;", "Lcom/robinhood/shared/support/contracts/pathfinder/SupportLandingFragmentKey;", "<init>", "()V", "feature-pathfinder-core-pages_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<SupportLandingDuxo, SupportLandingFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public SupportLandingFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (SupportLandingFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public SupportLandingFragmentKey getArgs(SupportLandingDuxo supportLandingDuxo) {
            return (SupportLandingFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, supportLandingDuxo);
        }
    }
}
