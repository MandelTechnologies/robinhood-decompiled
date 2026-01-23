package com.robinhood.android.pathfinder.sdui.p212ui;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.pathfinder.sdui.p212ui.PathfinderSduiDuxo;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.librobinhood.data.store.PathfinderStore;
import com.robinhood.models.api.pathfinder.UserViewInput;
import com.robinhood.models.p355ui.pathfinder.UserViewState;
import com.robinhood.models.p355ui.pathfinder.contexts.UserViewStatePageContext;
import com.robinhood.models.serverdriven.experimental.api.PageTemplate;
import com.robinhood.models.serverdriven.experimental.api.PathfinderAction;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.buildconfig.BuildFlavors;
import com.robinhood.utils.extensions.Throwables;
import java.util.Map;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: PathfinderSduiDuxo.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001%B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u000e\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001bJ\"\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001b2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001f0\u001eJ\u0014\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130!H\u0002J\u0014\u0010\"\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#*\u00020\u0014H\u0002R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/pathfinder/sdui/ui/PathfinderSduiDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/pathfinder/sdui/ui/PathfinderSduiViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "pathfinderStore", "Lcom/robinhood/librobinhood/data/store/PathfinderStore;", "<init>", "(Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/librobinhood/data/store/PathfinderStore;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "useMockUserViewState", "", "getUseMockUserViewState", "()Z", "useMockUserViewState$delegate", "Lkotlin/Lazy;", PathfinderSduiFragment.ARGS_MOCK_USER_VIEW_STATE, "Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;", "Lcom/robinhood/models/ui/pathfinder/contexts/UserViewStatePageContext;", "getMockUserViewState", "()Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;", "onStart", "", "sendInput", "value", "", "submitFormInput", "formData", "", "", "streamUserViewState", "Lkotlinx/coroutines/flow/Flow;", "getSduiPageContext", "Lcom/robinhood/models/serverdriven/experimental/api/PageTemplate;", "Lcom/robinhood/models/serverdriven/experimental/api/PathfinderAction;", "Companion", "feature-pathfinder-sdui_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class PathfinderSduiDuxo extends OldBaseDuxo<PathfinderSduiViewState> implements HasSavedState {
    private final PathfinderStore pathfinderStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: useMockUserViewState$delegate, reason: from kotlin metadata */
    private final Lazy useMockUserViewState;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PathfinderSduiDuxo(SavedStateHandle savedStateHandle, PathfinderStore pathfinderStore) {
        super(new PathfinderSduiViewState(null, false, null, 7, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(pathfinderStore, "pathfinderStore");
        this.savedStateHandle = savedStateHandle;
        this.pathfinderStore = pathfinderStore;
        this.useMockUserViewState = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.pathfinder.sdui.ui.PathfinderSduiDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(PathfinderSduiDuxo.useMockUserViewState_delegate$lambda$0(this.f$0));
            }
        });
    }

    private final boolean getUseMockUserViewState() {
        return ((Boolean) this.useMockUserViewState.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean useMockUserViewState_delegate$lambda$0(PathfinderSduiDuxo pathfinderSduiDuxo) {
        return BuildFlavors.INSTANCE.isDebugOrInternal() && pathfinderSduiDuxo.getMockUserViewState() != null;
    }

    private final UserViewState.Page<UserViewStatePageContext> getMockUserViewState() {
        return (UserViewState.Page) getSavedStateHandle().get(PathfinderSduiFragment.ARGS_MOCK_USER_VIEW_STATE);
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        getLifecycleScope().launchWhenStarted(new C254231(null));
    }

    /* compiled from: PathfinderSduiDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.pathfinder.sdui.ui.PathfinderSduiDuxo$onStart$1", m3645f = "PathfinderSduiDuxo.kt", m3646l = {51}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.pathfinder.sdui.ui.PathfinderSduiDuxo$onStart$1 */
    static final class C254231 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C254231(Continuation<? super C254231> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PathfinderSduiDuxo.this.new C254231(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C254231) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final Flow flowStreamUserViewState = PathfinderSduiDuxo.this.streamUserViewState();
                final PathfinderSduiDuxo pathfinderSduiDuxo = PathfinderSduiDuxo.this;
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<PageTemplate<? extends PathfinderAction>>() { // from class: com.robinhood.android.pathfinder.sdui.ui.PathfinderSduiDuxo$onStart$1$invokeSuspend$$inlined$mapNotNull$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.pathfinder.sdui.ui.PathfinderSduiDuxo$onStart$1$invokeSuspend$$inlined$mapNotNull$1$2 */
                    public static final class C254212<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;
                        final /* synthetic */ PathfinderSduiDuxo this$0;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.pathfinder.sdui.ui.PathfinderSduiDuxo$onStart$1$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "PathfinderSduiDuxo.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.pathfinder.sdui.ui.PathfinderSduiDuxo$onStart$1$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                return C254212.this.emit(null, this);
                            }
                        }

                        public C254212(FlowCollector flowCollector, PathfinderSduiDuxo pathfinderSduiDuxo) {
                            this.$this_unsafeFlow = flowCollector;
                            this.this$0 = pathfinderSduiDuxo;
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
                                PageTemplate sduiPageContext = this.this$0.getSduiPageContext(((UserViewState.Page) obj).getTypeContext());
                                if (sduiPageContext != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(sduiPageContext, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
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

                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super PageTemplate<? extends PathfinderAction>> flowCollector, Continuation continuation) {
                        Object objCollect = flowStreamUserViewState.collect(new C254212(flowCollector, pathfinderSduiDuxo), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                });
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(PathfinderSduiDuxo.this, null);
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

        /* compiled from: PathfinderSduiDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "pageContext", "Lcom/robinhood/models/serverdriven/experimental/api/PageTemplate;", "Lcom/robinhood/models/serverdriven/experimental/api/PathfinderAction;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.pathfinder.sdui.ui.PathfinderSduiDuxo$onStart$1$2", m3645f = "PathfinderSduiDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.pathfinder.sdui.ui.PathfinderSduiDuxo$onStart$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<PageTemplate<? extends PathfinderAction>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ PathfinderSduiDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(PathfinderSduiDuxo pathfinderSduiDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = pathfinderSduiDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(PageTemplate<? extends PathfinderAction> pageTemplate, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(pageTemplate, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                final PageTemplate pageTemplate = (PageTemplate) this.L$0;
                this.this$0.applyMutation(new Function1() { // from class: com.robinhood.android.pathfinder.sdui.ui.PathfinderSduiDuxo$onStart$1$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return PathfinderSduiDuxo.C254231.AnonymousClass2.invokeSuspend$lambda$0(pageTemplate, (PathfinderSduiViewState) obj2);
                    }
                });
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final PathfinderSduiViewState invokeSuspend$lambda$0(PageTemplate pageTemplate, PathfinderSduiViewState pathfinderSduiViewState) {
                return PathfinderSduiViewState.copy$default(pathfinderSduiViewState, pageTemplate, false, null, 6, null);
            }
        }
    }

    /* compiled from: PathfinderSduiDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.pathfinder.sdui.ui.PathfinderSduiDuxo$sendInput$1", m3645f = "PathfinderSduiDuxo.kt", m3646l = {61}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.pathfinder.sdui.ui.PathfinderSduiDuxo$sendInput$1 */
    static final class C254241 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $value;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C254241(String str, Continuation<? super C254241> continuation) {
            super(2, continuation);
            this.$value = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PathfinderSduiDuxo.this.new C254241(this.$value, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C254241) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            C254241 c254241;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PathfinderSduiDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.pathfinder.sdui.ui.PathfinderSduiDuxo$sendInput$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return PathfinderSduiDuxo.C254241.invokeSuspend$lambda$0((PathfinderSduiViewState) obj2);
                    }
                });
                PathfinderStore pathfinderStore = PathfinderSduiDuxo.this.pathfinderStore;
                Companion companion = PathfinderSduiDuxo.INSTANCE;
                UUID inquiryId = ((LegacyFragmentKey.PathfinderSdui) companion.getArgs((HasSavedState) PathfinderSduiDuxo.this)).getInquiryId();
                int sequence = ((LegacyFragmentKey.PathfinderSdui) companion.getArgs((HasSavedState) PathfinderSduiDuxo.this)).getSequence();
                UserViewInput.Sdui sdui = new UserViewInput.Sdui(this.$value);
                final PathfinderSduiDuxo pathfinderSduiDuxo = PathfinderSduiDuxo.this;
                Function1<? super Throwable, Boolean> function1 = new Function1() { // from class: com.robinhood.android.pathfinder.sdui.ui.PathfinderSduiDuxo$sendInput$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return Boolean.valueOf(PathfinderSduiDuxo.C254241.invokeSuspend$lambda$3(pathfinderSduiDuxo, (Throwable) obj2));
                    }
                };
                this.label = 1;
                c254241 = this;
                if (pathfinderStore.handleUserInput(inquiryId, sequence, sdui, function1, c254241) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                c254241 = this;
            }
            PathfinderSduiDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.pathfinder.sdui.ui.PathfinderSduiDuxo$sendInput$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return PathfinderSduiDuxo.C254241.invokeSuspend$lambda$4((PathfinderSduiViewState) obj2);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final PathfinderSduiViewState invokeSuspend$lambda$0(PathfinderSduiViewState pathfinderSduiViewState) {
            return PathfinderSduiViewState.copy$default(pathfinderSduiViewState, null, true, null, 5, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invokeSuspend$lambda$3(PathfinderSduiDuxo pathfinderSduiDuxo, final Throwable th) {
            boolean zIsNetworkRelated = Throwables.isNetworkRelated(th);
            if (zIsNetworkRelated) {
                pathfinderSduiDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.pathfinder.sdui.ui.PathfinderSduiDuxo$sendInput$1$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PathfinderSduiDuxo.C254241.invokeSuspend$lambda$3$lambda$2$lambda$1(th, (PathfinderSduiViewState) obj);
                    }
                });
            }
            return zIsNetworkRelated;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final PathfinderSduiViewState invokeSuspend$lambda$3$lambda$2$lambda$1(Throwable th, PathfinderSduiViewState pathfinderSduiViewState) {
            return PathfinderSduiViewState.copy$default(pathfinderSduiViewState, null, false, new UiEvent(th), 3, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final PathfinderSduiViewState invokeSuspend$lambda$4(PathfinderSduiViewState pathfinderSduiViewState) {
            return PathfinderSduiViewState.copy$default(pathfinderSduiViewState, null, false, null, 5, null);
        }
    }

    public final void sendInput(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C254241(value, null), 3, null);
    }

    /* compiled from: PathfinderSduiDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.pathfinder.sdui.ui.PathfinderSduiDuxo$submitFormInput$1", m3645f = "PathfinderSduiDuxo.kt", m3646l = {81}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.pathfinder.sdui.ui.PathfinderSduiDuxo$submitFormInput$1 */
    static final class C254251 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Map<String, Object> $formData;
        final /* synthetic */ String $value;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C254251(String str, Map<String, ? extends Object> map, Continuation<? super C254251> continuation) {
            super(2, continuation);
            this.$value = str;
            this.$formData = map;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PathfinderSduiDuxo.this.new C254251(this.$value, this.$formData, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C254251) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            C254251 c254251;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PathfinderSduiDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.pathfinder.sdui.ui.PathfinderSduiDuxo$submitFormInput$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return PathfinderSduiDuxo.C254251.invokeSuspend$lambda$0((PathfinderSduiViewState) obj2);
                    }
                });
                PathfinderStore pathfinderStore = PathfinderSduiDuxo.this.pathfinderStore;
                Companion companion = PathfinderSduiDuxo.INSTANCE;
                UUID inquiryId = ((LegacyFragmentKey.PathfinderSdui) companion.getArgs((HasSavedState) PathfinderSduiDuxo.this)).getInquiryId();
                int sequence = ((LegacyFragmentKey.PathfinderSdui) companion.getArgs((HasSavedState) PathfinderSduiDuxo.this)).getSequence();
                UserViewInput.SduiSubmitForm sduiSubmitForm = new UserViewInput.SduiSubmitForm(this.$value, this.$formData);
                final PathfinderSduiDuxo pathfinderSduiDuxo = PathfinderSduiDuxo.this;
                Function1<? super Throwable, Boolean> function1 = new Function1() { // from class: com.robinhood.android.pathfinder.sdui.ui.PathfinderSduiDuxo$submitFormInput$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return Boolean.valueOf(PathfinderSduiDuxo.C254251.invokeSuspend$lambda$3(pathfinderSduiDuxo, (Throwable) obj2));
                    }
                };
                this.label = 1;
                c254251 = this;
                if (pathfinderStore.handleUserInput(inquiryId, sequence, sduiSubmitForm, function1, c254251) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                c254251 = this;
            }
            PathfinderSduiDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.pathfinder.sdui.ui.PathfinderSduiDuxo$submitFormInput$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return PathfinderSduiDuxo.C254251.invokeSuspend$lambda$4((PathfinderSduiViewState) obj2);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final PathfinderSduiViewState invokeSuspend$lambda$0(PathfinderSduiViewState pathfinderSduiViewState) {
            return PathfinderSduiViewState.copy$default(pathfinderSduiViewState, null, true, null, 5, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invokeSuspend$lambda$3(PathfinderSduiDuxo pathfinderSduiDuxo, final Throwable th) {
            boolean zIsNetworkRelated = Throwables.isNetworkRelated(th);
            if (zIsNetworkRelated) {
                pathfinderSduiDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.pathfinder.sdui.ui.PathfinderSduiDuxo$submitFormInput$1$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PathfinderSduiDuxo.C254251.invokeSuspend$lambda$3$lambda$2$lambda$1(th, (PathfinderSduiViewState) obj);
                    }
                });
            }
            return zIsNetworkRelated;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final PathfinderSduiViewState invokeSuspend$lambda$3$lambda$2$lambda$1(Throwable th, PathfinderSduiViewState pathfinderSduiViewState) {
            return PathfinderSduiViewState.copy$default(pathfinderSduiViewState, null, false, new UiEvent(th), 3, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final PathfinderSduiViewState invokeSuspend$lambda$4(PathfinderSduiViewState pathfinderSduiViewState) {
            return PathfinderSduiViewState.copy$default(pathfinderSduiViewState, null, false, null, 5, null);
        }
    }

    public final void submitFormInput(String value, Map<String, ? extends Object> formData) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(formData, "formData");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C254251(value, formData, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<UserViewState.Page<UserViewStatePageContext>> streamUserViewState() {
        if (getUseMockUserViewState()) {
            UserViewState.Page<UserViewStatePageContext> mockUserViewState = getMockUserViewState();
            Intrinsics.checkNotNull(mockUserViewState);
            return FlowKt.flowOf(mockUserViewState);
        }
        PathfinderStore pathfinderStore = this.pathfinderStore;
        Companion companion = INSTANCE;
        final Flow<UserViewState> flowStreamPageUserViewState = pathfinderStore.streamPageUserViewState(((LegacyFragmentKey.PathfinderSdui) companion.getArgs((HasSavedState) this)).getInquiryId(), ((LegacyFragmentKey.PathfinderSdui) companion.getArgs((HasSavedState) this)).getSequence());
        return new Flow<Object>() { // from class: com.robinhood.android.pathfinder.sdui.ui.PathfinderSduiDuxo$streamUserViewState$$inlined$streamTypedPageUserViewState$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.pathfinder.sdui.ui.PathfinderSduiDuxo$streamUserViewState$$inlined$streamTypedPageUserViewState$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.pathfinder.sdui.ui.PathfinderSduiDuxo$streamUserViewState$$inlined$streamTypedPageUserViewState$1$2", m3645f = "PathfinderSduiDuxo.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.pathfinder.sdui.ui.PathfinderSduiDuxo$streamUserViewState$$inlined$streamTypedPageUserViewState$1$2$1, reason: invalid class name */
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
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
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
                        if (obj instanceof UserViewState.Page) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
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

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Object> flowCollector, Continuation continuation) {
                Object objCollect = flowStreamPageUserViewState.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PageTemplate<PathfinderAction> getSduiPageContext(UserViewStatePageContext userViewStatePageContext) {
        if (userViewStatePageContext instanceof UserViewStatePageContext.SduiPage) {
            return ((UserViewStatePageContext.SduiPage) userViewStatePageContext).getContext();
        }
        if (userViewStatePageContext instanceof UserViewStatePageContext.PaginatedListSduiPage) {
            return ((UserViewStatePageContext.PaginatedListSduiPage) userViewStatePageContext).getContext();
        }
        if (userViewStatePageContext instanceof UserViewStatePageContext.PaginatedListWithTabsSduiPage) {
            return ((UserViewStatePageContext.PaginatedListWithTabsSduiPage) userViewStatePageContext).getContext();
        }
        return null;
    }

    /* compiled from: PathfinderSduiDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/pathfinder/sdui/ui/PathfinderSduiDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/pathfinder/sdui/ui/PathfinderSduiDuxo;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$PathfinderSdui;", "<init>", "()V", "feature-pathfinder-sdui_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<PathfinderSduiDuxo, LegacyFragmentKey.PathfinderSdui> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyFragmentKey.PathfinderSdui getArgs(SavedStateHandle savedStateHandle) {
            return (LegacyFragmentKey.PathfinderSdui) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyFragmentKey.PathfinderSdui getArgs(PathfinderSduiDuxo pathfinderSduiDuxo) {
            return (LegacyFragmentKey.PathfinderSdui) DuxoCompanion.DefaultImpls.getArgs(this, pathfinderSduiDuxo);
        }
    }
}
