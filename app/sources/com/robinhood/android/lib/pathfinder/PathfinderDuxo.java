package com.robinhood.android.lib.pathfinder;

import android.net.Uri;
import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.lib.pathfinder.InternalPathfinderEvent;
import com.robinhood.android.lib.pathfinder.PathfinderDataState;
import com.robinhood.android.lib.pathfinder.PathfinderDuxo;
import com.robinhood.android.lib.pathfinder.PathfinderEvent;
import com.robinhood.android.lib.pathfinder.PathfinderWebViewState;
import com.robinhood.android.lib.pathfinder.extensions.UserViewStates;
import com.robinhood.android.lib.pathfinder.views.PathfinderWebViewEvent;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.PathfinderStore;
import com.robinhood.models.p355ui.PathfinderStateError;
import com.robinhood.models.p355ui.pathfinder.UserViewState;
import com.robinhood.models.p355ui.pathfinder.UserViewToast;
import com.robinhood.models.p355ui.pathfinder.extension.UserViewStates3;
import com.robinhood.models.p355ui.pathfinder.extension.UserViewStates4;
import com.robinhood.prefs.Installation;
import com.robinhood.shared.support.contracts.PathfinderFragmentKey;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.coroutine.Flows3;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.logging.CrashReporter;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: PathfinderDuxo.kt */
@Metadata(m3635d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 J2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0002IJB9\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u001e\u001a\u00020\u001f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0000¢\u0006\u0002\b J\b\u0010!\u001a\u00020\u001fH\u0016J\b\u0010\"\u001a\u00020\u001fH\u0016J\b\u0010#\u001a\u00020\u001fH\u0016J\u000e\u0010$\u001a\u00020\u001fH\u0086@¢\u0006\u0002\u0010%J\u0017\u0010&\u001a\u00020'2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)¢\u0006\u0002\u0010*J\u000e\u0010+\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020-J\u001e\u0010.\u001a\u00020\u001f2\u0006\u0010/\u001a\u0002002\u000e\b\u0002\u0010(\u001a\b\u0012\u0004\u0012\u00020)01J\u001e\u00102\u001a\u00020\u001f2\u0006\u00103\u001a\u0002042\u0006\u0010(\u001a\u00020)H\u0086@¢\u0006\u0002\u00105J\u0010\u00106\u001a\u00020\u001f2\u0006\u00107\u001a\u000208H\u0002J\u0006\u00109\u001a\u00020\u001fJ\u0014\u0010:\u001a\u00020\u001f2\n\u0010;\u001a\u0006\u0012\u0002\b\u00030<H\u0002J\u0010\u0010=\u001a\u00020\u001f2\u0006\u0010>\u001a\u00020?H\u0002J\u0010\u0010@\u001a\u00020\u001f2\u0006\u00107\u001a\u00020AH\u0002J\u0006\u0010B\u001a\u00020\u001fJ\u0016\u0010C\u001a\b\u0012\u0004\u0012\u00020\u001f0D2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0016\u0010E\u001a\b\u0012\u0004\u0012\u00020F0D2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J$\u0010G\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010)\u0012\u0004\u0012\u00020)0H0D2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006K"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/PathfinderDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/lib/pathfinder/PathfinderDataState;", "Lcom/robinhood/android/lib/pathfinder/PathfinderViewState;", "Lcom/robinhood/android/lib/pathfinder/InternalPathfinderEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "pathfinderStore", "Lcom/robinhood/librobinhood/data/store/PathfinderStore;", "pathfinderStateRegistry", "Lcom/robinhood/android/lib/pathfinder/PathfinderStateRegistry;", "installation", "Lcom/robinhood/prefs/Installation;", "pathfinderStateProvider", "Lcom/robinhood/android/lib/pathfinder/PathfinderStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/PathfinderStore;Lcom/robinhood/android/lib/pathfinder/PathfinderStateRegistry;Lcom/robinhood/prefs/Installation;Lcom/robinhood/android/lib/pathfinder/PathfinderStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "pathfinderRelay", "Lcom/robinhood/android/lib/pathfinder/PathfinderRelay;", "inquiryId", "Ljava/util/UUID;", "getInquiryId", "()Ljava/util/UUID;", "navigationBackwardEnabled", "Ljava/util/concurrent/atomic/AtomicBoolean;", "setPathfinderRelay", "", "setPathfinderRelay$lib_pathfinder_externalDebug", "onCreate", "onStart", "onStop", "initialRefresh", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshInquiry", "Lkotlinx/coroutines/Job;", "latestPageSequence", "", "(Ljava/lang/Integer;)Lkotlinx/coroutines/Job;", "handleWebViewState", "state", "Lcom/robinhood/android/lib/pathfinder/PathfinderWebViewState;", "handleWebViewEvent", "event", "Lcom/robinhood/android/lib/pathfinder/views/PathfinderWebViewEvent;", "Lcom/robinhood/utils/Optional;", "handleUserWebInput", "jsonString", "", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleErrorInput", "error", "Lcom/robinhood/models/ui/PathfinderStateError;", "dismissFlow", "handlePageUserViewState", "page", "Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;", "handleNonPageViewStates", "userViewState", "Lcom/robinhood/models/ui/pathfinder/UserViewState;", "onUnrecoverableError", "", "navigateBackward", "streamDismissFlowEvent", "Lkotlinx/coroutines/flow/Flow;", "streamBackwardReadiness", "", "streamStackSizeChanges", "Lkotlin/Pair;", "SaveKey", "Companion", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class PathfinderDuxo extends BaseDuxo3<PathfinderDataState, PathfinderViewState, InternalPathfinderEvent> implements HasSavedState {
    private final Installation installation;
    private final AtomicBoolean navigationBackwardEnabled;
    private PathfinderRelay pathfinderRelay;
    private final PathfinderStateRegistry pathfinderStateRegistry;
    private final PathfinderStore pathfinderStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: PathfinderDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.lib.pathfinder.PathfinderDuxo", m3645f = "PathfinderDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_SEARCH_WITH_BORDER_VALUE}, m3647m = "handleUserWebInput")
    /* renamed from: com.robinhood.android.lib.pathfinder.PathfinderDuxo$handleUserWebInput$1 */
    static final class C203431 extends ContinuationImpl {
        int I$0;
        int label;
        /* synthetic */ Object result;

        C203431(Continuation<? super C203431> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PathfinderDuxo.this.handleUserWebInput(null, 0, this);
        }
    }

    /* compiled from: PathfinderDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.lib.pathfinder.PathfinderDuxo", m3645f = "PathfinderDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE}, m3647m = "initialRefresh")
    /* renamed from: com.robinhood.android.lib.pathfinder.PathfinderDuxo$initialRefresh$1 */
    static final class C203461 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C203461(Continuation<? super C203461> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PathfinderDuxo.this.initialRefresh(this);
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PathfinderDuxo(PathfinderStore pathfinderStore, PathfinderStateRegistry pathfinderStateRegistry, Installation installation, PathfinderStateProvider pathfinderStateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new PathfinderDataState(((PathfinderFragmentKey) INSTANCE.getArgs(savedStateHandle)).getInquiryId(), PathfinderDataState.InquiryState.Idle.INSTANCE, PathfinderWebViewState.Uninitialized.INSTANCE, null), pathfinderStateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(pathfinderStore, "pathfinderStore");
        Intrinsics.checkNotNullParameter(pathfinderStateRegistry, "pathfinderStateRegistry");
        Intrinsics.checkNotNullParameter(installation, "installation");
        Intrinsics.checkNotNullParameter(pathfinderStateProvider, "pathfinderStateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.pathfinderStore = pathfinderStore;
        this.pathfinderStateRegistry = pathfinderStateRegistry;
        this.installation = installation;
        this.savedStateHandle = savedStateHandle;
        this.navigationBackwardEnabled = new AtomicBoolean(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UUID getInquiryId() {
        return ((PathfinderFragmentKey) INSTANCE.getArgs((HasSavedState) this)).getInquiryId();
    }

    public final void setPathfinderRelay$lib_pathfinder_externalDebug(PathfinderRelay pathfinderRelay) {
        this.pathfinderRelay = pathfinderRelay;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C203471(null));
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C203482(null), 3, null);
    }

    /* compiled from: PathfinderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.lib.pathfinder.PathfinderDuxo$onCreate$1", m3645f = "PathfinderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.lib.pathfinder.PathfinderDuxo$onCreate$1 */
    static final class C203471 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C203471(Continuation<? super C203471> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C203471 c203471 = PathfinderDuxo.this.new C203471(continuation);
            c203471.L$0 = obj;
            return c203471;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C203471) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: PathfinderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.lib.pathfinder.PathfinderDuxo$onCreate$1$1", m3645f = "PathfinderDuxo.kt", m3646l = {91}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.lib.pathfinder.PathfinderDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ PathfinderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(PathfinderDuxo pathfinderDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = pathfinderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        Flow<UserViewState.Page<?>> flowStreamPageUserViewState = this.this$0.pathfinderStore.streamPageUserViewState(this.this$0.getInquiryId());
                        final PathfinderDuxo pathfinderDuxo = this.this$0;
                        Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(flowStreamPageUserViewState, new Function2() { // from class: com.robinhood.android.lib.pathfinder.PathfinderDuxo$onCreate$1$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                return Boolean.valueOf(PathfinderDuxo.C203471.AnonymousClass1.invokeSuspend$lambda$0(pathfinderDuxo, (UserViewState.Page) obj2, (UserViewState.Page) obj3));
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
                } catch (Throwable th) {
                    this.this$0.onUnrecoverableError(th);
                }
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final boolean invokeSuspend$lambda$0(PathfinderDuxo pathfinderDuxo, UserViewState.Page page, UserViewState.Page page2) {
                return UserViewStates.isTheSameAs(page, pathfinderDuxo.getInquiryId(), pathfinderDuxo.pathfinderStateRegistry, page2);
            }

            /* compiled from: PathfinderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003H\n"}, m3636d2 = {"<anonymous>", "", "page", "Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.lib.pathfinder.PathfinderDuxo$onCreate$1$1$2", m3645f = "PathfinderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.lib.pathfinder.PathfinderDuxo$onCreate$1$1$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<UserViewState.Page<?>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ PathfinderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(PathfinderDuxo pathfinderDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = pathfinderDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(UserViewState.Page<?> page, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(page, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.handlePageUserViewState((UserViewState.Page) this.L$0);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(PathfinderDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(PathfinderDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(PathfinderDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass4(PathfinderDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass5(PathfinderDuxo.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: PathfinderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.lib.pathfinder.PathfinderDuxo$onCreate$1$2", m3645f = "PathfinderDuxo.kt", m3646l = {102}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.lib.pathfinder.PathfinderDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ PathfinderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(PathfinderDuxo pathfinderDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = pathfinderDuxo;
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
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        Flow<UserViewState> flowStreamNonPageUserViewState = this.this$0.pathfinderStore.streamNonPageUserViewState(this.this$0.getInquiryId());
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                        this.label = 1;
                        if (FlowKt.collectLatest(flowStreamNonPageUserViewState, anonymousClass1, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                } catch (Throwable th) {
                    this.this$0.onUnrecoverableError(th);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: PathfinderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "nonPage", "Lcom/robinhood/models/ui/pathfinder/UserViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.lib.pathfinder.PathfinderDuxo$onCreate$1$2$1", m3645f = "PathfinderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.lib.pathfinder.PathfinderDuxo$onCreate$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<UserViewState, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ PathfinderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(PathfinderDuxo pathfinderDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = pathfinderDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(UserViewState userViewState, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(userViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.handleNonPageViewStates((UserViewState) this.L$0);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: PathfinderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.lib.pathfinder.PathfinderDuxo$onCreate$1$3", m3645f = "PathfinderDuxo.kt", m3646l = {112}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.lib.pathfinder.PathfinderDuxo$onCreate$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ PathfinderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(PathfinderDuxo pathfinderDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = pathfinderDuxo;
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
                    PathfinderDuxo pathfinderDuxo = this.this$0;
                    Flow flowStreamDismissFlowEvent = pathfinderDuxo.streamDismissFlowEvent(pathfinderDuxo.getInquiryId());
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowStreamDismissFlowEvent, anonymousClass1, this) == coroutine_suspended) {
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

            /* compiled from: PathfinderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "", "it"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.lib.pathfinder.PathfinderDuxo$onCreate$1$3$1", m3645f = "PathfinderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.lib.pathfinder.PathfinderDuxo$onCreate$1$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Unit, Continuation<? super Unit>, Object> {
                int label;
                final /* synthetic */ PathfinderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(PathfinderDuxo pathfinderDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = pathfinderDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.this$0, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.this$0.dismissFlow();
                    return Unit.INSTANCE;
                }
            }
        }

        /* compiled from: PathfinderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.lib.pathfinder.PathfinderDuxo$onCreate$1$4", m3645f = "PathfinderDuxo.kt", m3646l = {119}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.lib.pathfinder.PathfinderDuxo$onCreate$1$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ PathfinderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(PathfinderDuxo pathfinderDuxo, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = pathfinderDuxo;
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
                    PathfinderDuxo pathfinderDuxo = this.this$0;
                    Flow flowStreamBackwardReadiness = pathfinderDuxo.streamBackwardReadiness(pathfinderDuxo.getInquiryId());
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowStreamBackwardReadiness, anonymousClass1, this) == coroutine_suspended) {
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

            /* compiled from: PathfinderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "enabled", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.lib.pathfinder.PathfinderDuxo$onCreate$1$4$1", m3645f = "PathfinderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.lib.pathfinder.PathfinderDuxo$onCreate$1$4$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ PathfinderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(PathfinderDuxo pathfinderDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = pathfinderDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                    return invoke(bool.booleanValue(), continuation);
                }

                public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        boolean z = this.Z$0;
                        PathfinderRelay pathfinderRelay = this.this$0.pathfinderRelay;
                        if (pathfinderRelay != null) {
                            pathfinderRelay.emitEvent$lib_pathfinder_externalDebug(new PathfinderEvent.BackNavChangeEvent(z));
                        }
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: PathfinderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.lib.pathfinder.PathfinderDuxo$onCreate$1$5", m3645f = "PathfinderDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.lib.pathfinder.PathfinderDuxo$onCreate$1$5, reason: invalid class name */
        static final class AnonymousClass5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ PathfinderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(PathfinderDuxo pathfinderDuxo, Continuation<? super AnonymousClass5> continuation) {
                super(2, continuation);
                this.this$0 = pathfinderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass5(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<Throwable> flowStreamError = this.this$0.pathfinderStore.streamError();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowStreamError, anonymousClass1, this) == coroutine_suspended) {
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

            /* compiled from: PathfinderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.lib.pathfinder.PathfinderDuxo$onCreate$1$5$1", m3645f = "PathfinderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.lib.pathfinder.PathfinderDuxo$onCreate$1$5$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Throwable, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ PathfinderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(PathfinderDuxo pathfinderDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = pathfinderDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Throwable th, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(th, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) throws Throwable {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.onUnrecoverableError((Throwable) this.L$0);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    /* compiled from: PathfinderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.lib.pathfinder.PathfinderDuxo$onCreate$2", m3645f = "PathfinderDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.lib.pathfinder.PathfinderDuxo$onCreate$2 */
    static final class C203482 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C203482(Continuation<? super C203482> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PathfinderDuxo.this.new C203482(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C203482) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Boolean bool = (Boolean) PathfinderDuxo.this.getSavedStateHandle().get("INITIALIZED");
                if (!(bool != null ? bool.booleanValue() : false)) {
                    PathfinderDuxo pathfinderDuxo = PathfinderDuxo.this;
                    this.label = 1;
                    if (pathfinderDuxo.initialRefresh(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            PathfinderDuxo.this.getSavedStateHandle().set("INITIALIZED", boxing.boxBoolean(true));
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        AtomicBoolean atomicBoolean = this.navigationBackwardEnabled;
        Boolean bool = (Boolean) getSavedStateHandle().get("SAVE_BACK_NAV_ENABLED");
        atomicBoolean.set(bool != null ? bool.booleanValue() : true);
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStop() {
        super.onStop();
        getSavedStateHandle().set("SAVE_BACK_NAV_ENABLED", Boolean.valueOf(this.navigationBackwardEnabled.get()));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object initialRefresh(Continuation<? super Unit> continuation) {
        C203461 c203461;
        if (continuation instanceof C203461) {
            c203461 = (C203461) continuation;
            int i = c203461.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c203461.label = i - Integer.MIN_VALUE;
            } else {
                c203461 = new C203461(continuation);
            }
        }
        Object topPageUserViewState = c203461.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c203461.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(topPageUserViewState);
            PathfinderStore pathfinderStore = this.pathfinderStore;
            UUID inquiryId = getInquiryId();
            c203461.label = 1;
            topPageUserViewState = pathfinderStore.getTopPageUserViewState(inquiryId, c203461);
            if (topPageUserViewState == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(topPageUserViewState);
        }
        UserViewState.Page page = (UserViewState.Page) topPageUserViewState;
        if (page == null || UserViewStates4.getRefreshBehavior((UserViewState) page) != UserViewStates3.NONE) {
            refreshInquiry(page != null ? boxing.boxInt(page.getSequence()) : null);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Job refreshInquiry$default(PathfinderDuxo pathfinderDuxo, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        return pathfinderDuxo.refreshInquiry(num);
    }

    /* compiled from: PathfinderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.lib.pathfinder.PathfinderDuxo$refreshInquiry$1", m3645f = "PathfinderDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.lib.pathfinder.PathfinderDuxo$refreshInquiry$1 */
    static final class C203501 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Integer $latestPageSequence;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C203501(Integer num, Continuation<? super C203501> continuation) {
            super(2, continuation);
            this.$latestPageSequence = num;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PathfinderDuxo.this.new C203501(this.$latestPageSequence, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C203501) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    PathfinderDuxo.this.applyMutation(new AnonymousClass1(null));
                    PathfinderStore pathfinderStore = PathfinderDuxo.this.pathfinderStore;
                    UUID inquiryId = PathfinderDuxo.this.getInquiryId();
                    Integer num = this.$latestPageSequence;
                    this.label = 1;
                    if (pathfinderStore.refresh(inquiryId, num, true, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                PathfinderDuxo.this.applyMutation(new AnonymousClass2(null));
            } catch (Throwable th) {
                PathfinderDuxo.this.onUnrecoverableError(th);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: PathfinderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/lib/pathfinder/PathfinderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.lib.pathfinder.PathfinderDuxo$refreshInquiry$1$1", m3645f = "PathfinderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.lib.pathfinder.PathfinderDuxo$refreshInquiry$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<PathfinderDataState, Continuation<? super PathfinderDataState>, Object> {
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
            public final Object invoke(PathfinderDataState pathfinderDataState, Continuation<? super PathfinderDataState> continuation) {
                return ((AnonymousClass1) create(pathfinderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return PathfinderDataState.copy$default((PathfinderDataState) this.L$0, null, PathfinderDataState.InquiryState.Updating.INSTANCE, null, null, 13, null);
            }
        }

        /* compiled from: PathfinderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/lib/pathfinder/PathfinderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.lib.pathfinder.PathfinderDuxo$refreshInquiry$1$2", m3645f = "PathfinderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.lib.pathfinder.PathfinderDuxo$refreshInquiry$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<PathfinderDataState, Continuation<? super PathfinderDataState>, Object> {
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
            public final Object invoke(PathfinderDataState pathfinderDataState, Continuation<? super PathfinderDataState> continuation) {
                return ((AnonymousClass2) create(pathfinderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return PathfinderDataState.copy$default((PathfinderDataState) this.L$0, null, PathfinderDataState.InquiryState.Idle.INSTANCE, null, null, 13, null);
            }
        }
    }

    public final Job refreshInquiry(Integer latestPageSequence) {
        return BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C203501(latestPageSequence, null), 3, null);
    }

    /* compiled from: PathfinderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/lib/pathfinder/PathfinderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.lib.pathfinder.PathfinderDuxo$handleWebViewState$1", m3645f = "PathfinderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.lib.pathfinder.PathfinderDuxo$handleWebViewState$1 */
    static final class C203451 extends ContinuationImpl7 implements Function2<PathfinderDataState, Continuation<? super PathfinderDataState>, Object> {
        final /* synthetic */ PathfinderWebViewState $state;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C203451(PathfinderWebViewState pathfinderWebViewState, Continuation<? super C203451> continuation) {
            super(2, continuation);
            this.$state = pathfinderWebViewState;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C203451 c203451 = new C203451(this.$state, continuation);
            c203451.L$0 = obj;
            return c203451;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PathfinderDataState pathfinderDataState, Continuation<? super PathfinderDataState> continuation) {
            return ((C203451) create(pathfinderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return PathfinderDataState.copy$default((PathfinderDataState) this.L$0, null, null, this.$state, null, 11, null);
        }
    }

    public final void handleWebViewState(PathfinderWebViewState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        applyMutation(new C203451(state, null));
        if ((state instanceof PathfinderWebViewState.Initializing) || (state instanceof PathfinderWebViewState.Loaded) || (state instanceof PathfinderWebViewState.Timeout) || (state instanceof PathfinderWebViewState.Uninitialized)) {
            return;
        }
        if (!(state instanceof PathfinderWebViewState.Error)) {
            throw new NoWhenBranchMatchedException();
        }
        submit(InternalPathfinderEvent.StopLoading.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void handleWebViewEvent$default(PathfinderDuxo pathfinderDuxo, PathfinderWebViewEvent pathfinderWebViewEvent, Optional optional, int i, Object obj) throws Throwable {
        if ((i & 2) != 0) {
            optional = Optional2.INSTANCE;
        }
        pathfinderDuxo.handleWebViewEvent(pathfinderWebViewEvent, optional);
    }

    public final void handleWebViewEvent(PathfinderWebViewEvent event, Optional<Integer> latestPageSequence) throws Throwable {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(latestPageSequence, "latestPageSequence");
        if (event instanceof PathfinderWebViewEvent.DismissEvent) {
            PathfinderRelay pathfinderRelay = this.pathfinderRelay;
            if (pathfinderRelay != null) {
                pathfinderRelay.emitEvent$lib_pathfinder_externalDebug(PathfinderEvent.DismissEvent.INSTANCE);
                return;
            }
            return;
        }
        if (event instanceof PathfinderWebViewEvent.DisableBackNavigation) {
            PathfinderRelay pathfinderRelay2 = this.pathfinderRelay;
            if (pathfinderRelay2 != null) {
                pathfinderRelay2.emitEvent$lib_pathfinder_externalDebug(PathfinderEvent.DisableBackNavigationEvent.INSTANCE);
            }
            this.navigationBackwardEnabled.set(false);
            return;
        }
        if (event instanceof PathfinderWebViewEvent.DoneClickEvent) {
            PathfinderRelay pathfinderRelay3 = this.pathfinderRelay;
            if (pathfinderRelay3 != null) {
                pathfinderRelay3.emitEvent$lib_pathfinder_externalDebug(PathfinderEvent.DismissEvent.INSTANCE);
                return;
            }
            return;
        }
        if (event instanceof PathfinderWebViewEvent.LinkEvent.ExternalUrlEvent) {
            submit(new InternalPathfinderEvent.ExternalUrlEvent(((PathfinderWebViewEvent.LinkEvent.ExternalUrlEvent) event).getUrl()));
            return;
        }
        if (event instanceof PathfinderWebViewEvent.LinkEvent.UriDeepLinkEvent) {
            submit(new InternalPathfinderEvent.UriDeepLinkEvent(((PathfinderWebViewEvent.LinkEvent.UriDeepLinkEvent) event).getUri()));
            return;
        }
        if (event instanceof PathfinderWebViewEvent.MailToEvent) {
            submit(new InternalPathfinderEvent.MailTo(((PathfinderWebViewEvent.MailToEvent) event).getUri()));
            return;
        }
        if (event instanceof PathfinderWebViewEvent.NativePathfinderWebViewEvent.SendUserInput) {
            Integer orNull = latestPageSequence.getOrNull();
            if (orNull != null) {
                BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C203441(event, orNull, null), 3, null);
                return;
            } else {
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalArgumentException("No latest Page sequence is found!"), false, null, 6, null);
                return;
            }
        }
        if (event instanceof PathfinderWebViewEvent.NativePathfinderWebViewEvent.GoBack) {
            navigateBackward();
            return;
        }
        if (event instanceof PathfinderWebViewEvent.NativePathfinderWebViewEvent.UserInputError) {
            PathfinderWebViewEvent.NativePathfinderWebViewEvent.UserInputError userInputError = (PathfinderWebViewEvent.NativePathfinderWebViewEvent.UserInputError) event;
            if (userInputError.getError() != null) {
                handleErrorInput(userInputError.getError());
                return;
            } else {
                onUnrecoverableError(new NullPointerException("Failed to deserialize web error"));
                return;
            }
        }
        if (event instanceof PathfinderWebViewEvent.ShowFileChooserEvent) {
            PathfinderWebViewEvent.ShowFileChooserEvent showFileChooserEvent = (PathfinderWebViewEvent.ShowFileChooserEvent) event;
            submit(new InternalPathfinderEvent.ShowFileChooserEvent(showFileChooserEvent.getFilePathCallback(), showFileChooserEvent.getFileChooserParams()));
        }
    }

    /* compiled from: PathfinderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.lib.pathfinder.PathfinderDuxo$handleWebViewEvent$1", m3645f = "PathfinderDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.lib.pathfinder.PathfinderDuxo$handleWebViewEvent$1 */
    static final class C203441 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ PathfinderWebViewEvent $event;
        final /* synthetic */ Integer $sequence;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C203441(PathfinderWebViewEvent pathfinderWebViewEvent, Integer num, Continuation<? super C203441> continuation) {
            super(2, continuation);
            this.$event = pathfinderWebViewEvent;
            this.$sequence = num;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PathfinderDuxo.this.new C203441(this.$event, this.$sequence, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C203441) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PathfinderDuxo pathfinderDuxo = PathfinderDuxo.this;
                String userInput = ((PathfinderWebViewEvent.NativePathfinderWebViewEvent.SendUserInput) this.$event).getUserInput();
                int iIntValue = this.$sequence.intValue();
                this.label = 1;
                if (pathfinderDuxo.handleUserWebInput(userInput, iIntValue, this) == coroutine_suspended) {
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
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleUserWebInput(String str, int i, Continuation<? super Unit> continuation) {
        C203431 c203431;
        int i2;
        if (continuation instanceof C203431) {
            c203431 = (C203431) continuation;
            int i3 = c203431.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c203431.label = i3 - Integer.MIN_VALUE;
            } else {
                c203431 = new C203431(continuation);
            }
        }
        C203431 c2034312 = c203431;
        Object objHandleUserWebInput$default = c2034312.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = c2034312.label;
        if (i4 == 0) {
            ResultKt.throwOnFailure(objHandleUserWebInput$default);
            PathfinderStore pathfinderStore = this.pathfinderStore;
            UUID inquiryId = getInquiryId();
            c2034312.I$0 = i;
            c2034312.label = 1;
            objHandleUserWebInput$default = PathfinderStore.handleUserWebInput$default(pathfinderStore, inquiryId, i, str, null, c2034312, 8, null);
            if (objHandleUserWebInput$default == coroutine_suspended) {
                return coroutine_suspended;
            }
            i2 = i;
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i2 = c2034312.I$0;
            ResultKt.throwOnFailure(objHandleUserWebInput$default);
        }
        if (((UserViewState) objHandleUserWebInput$default) == null) {
            handleErrorInput(new PathfinderStateError(i2, this.installation.mo2745id()));
        }
        return Unit.INSTANCE;
    }

    /* compiled from: PathfinderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.lib.pathfinder.PathfinderDuxo$handleErrorInput$1", m3645f = "PathfinderDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.lib.pathfinder.PathfinderDuxo$handleErrorInput$1 */
    static final class C203411 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ PathfinderStateError $error;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C203411(PathfinderStateError pathfinderStateError, Continuation<? super C203411> continuation) {
            super(2, continuation);
            this.$error = pathfinderStateError;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PathfinderDuxo.this.new C203411(this.$error, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C203411) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PathfinderStore pathfinderStore = PathfinderDuxo.this.pathfinderStore;
                UUID inquiryId = PathfinderDuxo.this.getInquiryId();
                PathfinderStateError pathfinderStateError = this.$error;
                this.label = 1;
                if (PathfinderStore.handleErrorInput$default(pathfinderStore, inquiryId, pathfinderStateError, (Function1) null, this, 4, (Object) null) == coroutine_suspended) {
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
    }

    private final void handleErrorInput(PathfinderStateError error) {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C203411(error, null), 3, null);
    }

    public final void dismissFlow() {
        this.pathfinderStore.clearInquiry(getInquiryId());
        submit(InternalPathfinderEvent.ClosePathfinder.INSTANCE);
        applyMutation(new C203401(null));
    }

    /* compiled from: PathfinderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/lib/pathfinder/PathfinderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.lib.pathfinder.PathfinderDuxo$dismissFlow$1", m3645f = "PathfinderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.lib.pathfinder.PathfinderDuxo$dismissFlow$1 */
    static final class C203401 extends ContinuationImpl7 implements Function2<PathfinderDataState, Continuation<? super PathfinderDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C203401(Continuation<? super C203401> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C203401 c203401 = new C203401(continuation);
            c203401.L$0 = obj;
            return c203401;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PathfinderDataState pathfinderDataState, Continuation<? super PathfinderDataState> continuation) {
            return ((C203401) create(pathfinderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return PathfinderDataState.copy$default((PathfinderDataState) this.L$0, null, PathfinderDataState.InquiryState.Idle.INSTANCE, null, null, 5, null);
        }
    }

    /* compiled from: PathfinderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/lib/pathfinder/PathfinderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.lib.pathfinder.PathfinderDuxo$handlePageUserViewState$1", m3645f = "PathfinderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.lib.pathfinder.PathfinderDuxo$handlePageUserViewState$1 */
    static final class C203421 extends ContinuationImpl7 implements Function2<PathfinderDataState, Continuation<? super PathfinderDataState>, Object> {
        final /* synthetic */ UserViewState.Page<?> $page;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C203421(UserViewState.Page<?> page, Continuation<? super C203421> continuation) {
            super(2, continuation);
            this.$page = page;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C203421 c203421 = PathfinderDuxo.this.new C203421(this.$page, continuation);
            c203421.L$0 = obj;
            return c203421;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PathfinderDataState pathfinderDataState, Continuation<? super PathfinderDataState> continuation) {
            return ((C203421) create(pathfinderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                PathfinderDataState pathfinderDataState = (PathfinderDataState) this.L$0;
                PathfinderDuxo.this.navigationBackwardEnabled.set(true);
                return PathfinderDataState.copy$default(pathfinderDataState, null, null, null, this.$page, 7, null);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handlePageUserViewState(UserViewState.Page<?> page) {
        applyMutation(new C203421(page, null));
        UserViewToast toast = page.getToast();
        if (toast != null) {
            submit(new InternalPathfinderEvent.UserViewStateShowToast(toast));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleNonPageViewStates(UserViewState userViewState) {
        if (userViewState instanceof UserViewState.AppLink) {
            UserViewState.AppLink appLink = (UserViewState.AppLink) userViewState;
            Uri uri = Uri.parse(appLink.getTypeContext().getAppLink());
            Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
            submit(new InternalPathfinderEvent.ExitAppLinkEvent(uri, appLink.getTypeContext().getShouldManuallyDismiss()));
        } else if (userViewState instanceof UserViewState.Inquiry) {
            submit(new InternalPathfinderEvent.NewInquiry(((UserViewState.Inquiry) userViewState).getTypeContext().getInquiryId()));
        } else if (userViewState instanceof UserViewState.Result) {
            submit(new InternalPathfinderEvent.UserViewStateResult(((UserViewState.Result) userViewState).getTypeContext()));
        } else if (userViewState instanceof UserViewState.Unknown) {
            handleErrorInput(new PathfinderStateError(((UserViewState.Unknown) userViewState).getSequence(), this.installation.mo2745id()));
        } else {
            if (!(userViewState instanceof UserViewState.Page)) {
                throw new NoWhenBranchMatchedException();
            }
            throw new IllegalArgumentException("Hey developer, this is only for non-page state!");
        }
        UserViewToast toast = userViewState.getToast();
        if (toast != null) {
            submit(new InternalPathfinderEvent.UserViewStateShowToast(toast));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onUnrecoverableError(Throwable error) throws Throwable {
        Throwable th;
        if (error instanceof CancellationException) {
            throw error;
        }
        if (Throwables.isNetworkRelated(error)) {
            th = error;
        } else {
            th = error;
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 4, null);
        }
        applyMutation(new C203491(th, null));
    }

    /* compiled from: PathfinderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/lib/pathfinder/PathfinderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.lib.pathfinder.PathfinderDuxo$onUnrecoverableError$1", m3645f = "PathfinderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.lib.pathfinder.PathfinderDuxo$onUnrecoverableError$1 */
    static final class C203491 extends ContinuationImpl7 implements Function2<PathfinderDataState, Continuation<? super PathfinderDataState>, Object> {
        final /* synthetic */ Throwable $error;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C203491(Throwable th, Continuation<? super C203491> continuation) {
            super(2, continuation);
            this.$error = th;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C203491 c203491 = new C203491(this.$error, continuation);
            c203491.L$0 = obj;
            return c203491;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PathfinderDataState pathfinderDataState, Continuation<? super PathfinderDataState> continuation) {
            return ((C203491) create(pathfinderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return PathfinderDataState.copy$default((PathfinderDataState) this.L$0, null, new PathfinderDataState.InquiryState.Error(this.$error), null, null, 13, null);
        }
    }

    public final void navigateBackward() {
        if (this.navigationBackwardEnabled.get()) {
            this.pathfinderStore.popState(getInquiryId());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<Unit> streamDismissFlowEvent(UUID inquiryId) {
        final Flow<Tuples2<Integer, Integer>> flowStreamStackSizeChanges = streamStackSizeChanges(inquiryId);
        final Flow<Tuples2<? extends Integer, ? extends Integer>> flow = new Flow<Tuples2<? extends Integer, ? extends Integer>>() { // from class: com.robinhood.android.lib.pathfinder.PathfinderDuxo$streamDismissFlowEvent$$inlined$filter$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Tuples2<? extends Integer, ? extends Integer>> flowCollector, Continuation continuation) {
                Object objCollect = flowStreamStackSizeChanges.collect(new C203382(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.lib.pathfinder.PathfinderDuxo$streamDismissFlowEvent$$inlined$filter$1$2 */
            public static final class C203382<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.lib.pathfinder.PathfinderDuxo$streamDismissFlowEvent$$inlined$filter$1$2", m3645f = "PathfinderDuxo.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.lib.pathfinder.PathfinderDuxo$streamDismissFlowEvent$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C203382.this.emit(null, this);
                    }
                }

                public C203382(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        Tuples2 tuples2 = (Tuples2) obj;
                        Integer num = (Integer) tuples2.component1();
                        int iIntValue = ((Number) tuples2.component2()).intValue();
                        if (num != null) {
                            boolean z = num.intValue() == 0;
                            boolean z2 = iIntValue == 0;
                            if (!z && z2) {
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }
        };
        return new Flow<Unit>() { // from class: com.robinhood.android.lib.pathfinder.PathfinderDuxo$streamDismissFlowEvent$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Unit> flowCollector, Continuation continuation) {
                Object objCollect = flow.collect(new C203392(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.lib.pathfinder.PathfinderDuxo$streamDismissFlowEvent$$inlined$map$1$2 */
            public static final class C203392<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.lib.pathfinder.PathfinderDuxo$streamDismissFlowEvent$$inlined$map$1$2", m3645f = "PathfinderDuxo.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.lib.pathfinder.PathfinderDuxo$streamDismissFlowEvent$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C203392.this.emit(null, this);
                    }
                }

                public C203392(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        Unit unit = Unit.INSTANCE;
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(unit, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<Boolean> streamBackwardReadiness(UUID inquiryId) {
        final Flow<Integer> flowStreamBackwardStackSize = this.pathfinderStore.streamBackwardStackSize(inquiryId);
        return new Flow<Boolean>() { // from class: com.robinhood.android.lib.pathfinder.PathfinderDuxo$streamBackwardReadiness$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                Object objCollect = flowStreamBackwardStackSize.collect(new C203372(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.lib.pathfinder.PathfinderDuxo$streamBackwardReadiness$$inlined$map$1$2 */
            public static final class C203372<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.lib.pathfinder.PathfinderDuxo$streamBackwardReadiness$$inlined$map$1$2", m3645f = "PathfinderDuxo.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.lib.pathfinder.PathfinderDuxo$streamBackwardReadiness$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C203372.this.emit(null, this);
                    }
                }

                public C203372(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        Boolean boolBoxBoolean = boxing.boxBoolean(((Number) obj).intValue() > 1);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(boolBoxBoolean, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }
        };
    }

    private final Flow<Tuples2<Integer, Integer>> streamStackSizeChanges(UUID inquiryId) {
        return Flows3.withPrevious(this.pathfinderStore.streamBackwardStackSize(inquiryId));
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PathfinderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/PathfinderDuxo$SaveKey;", "", "<init>", "(Ljava/lang/String;I)V", "INITIALIZED", "SAVE_BACK_NAV_ENABLED", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class SaveKey {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ SaveKey[] $VALUES;
        public static final SaveKey INITIALIZED = new SaveKey("INITIALIZED", 0);
        public static final SaveKey SAVE_BACK_NAV_ENABLED = new SaveKey("SAVE_BACK_NAV_ENABLED", 1);

        private static final /* synthetic */ SaveKey[] $values() {
            return new SaveKey[]{INITIALIZED, SAVE_BACK_NAV_ENABLED};
        }

        public static EnumEntries<SaveKey> getEntries() {
            return $ENTRIES;
        }

        private SaveKey(String str, int i) {
        }

        static {
            SaveKey[] saveKeyArr$values = $values();
            $VALUES = saveKeyArr$values;
            $ENTRIES = EnumEntries2.enumEntries(saveKeyArr$values);
        }

        public static SaveKey valueOf(String str) {
            return (SaveKey) Enum.valueOf(SaveKey.class, str);
        }

        public static SaveKey[] values() {
            return (SaveKey[]) $VALUES.clone();
        }
    }

    /* compiled from: PathfinderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/PathfinderDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/lib/pathfinder/PathfinderDuxo;", "Lcom/robinhood/shared/support/contracts/PathfinderFragmentKey;", "<init>", "()V", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<PathfinderDuxo, PathfinderFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public PathfinderFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (PathfinderFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public PathfinderFragmentKey getArgs(PathfinderDuxo pathfinderDuxo) {
            return (PathfinderFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, pathfinderDuxo);
        }
    }
}
