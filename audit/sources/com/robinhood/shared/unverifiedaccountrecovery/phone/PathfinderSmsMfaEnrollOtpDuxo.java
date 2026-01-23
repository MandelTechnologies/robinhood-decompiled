package com.robinhood.shared.unverifiedaccountrecovery.phone;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.PathfinderStore;
import com.robinhood.models.api.pathfinder.UserViewInput;
import com.robinhood.models.api.pathfinder.input.FlowState;
import com.robinhood.models.p355ui.pathfinder.UserViewState;
import com.robinhood.models.p355ui.pathfinder.contexts.UserViewStatePageContext;
import com.robinhood.shared.unverifiedaccountrecovery.phone.PathfinderSmsMfaEnrollOtpDuxo;
import com.robinhood.shared.unverifiedaccountrecovery.phone.PathfinderSmsMfaEnrollOtpViewState;
import com.robinhood.utils.extensions.Throwables;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
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

/* compiled from: PathfinderSmsMfaEnrollOtpDuxo.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0011B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\f\u001a\u00020\rH\u0016J\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/unverifiedaccountrecovery/phone/PathfinderSmsMfaEnrollOtpDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/shared/unverifiedaccountrecovery/phone/PathfinderSmsMfaEnrollOtpViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "pathfinderStore", "Lcom/robinhood/librobinhood/data/store/PathfinderStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/PathfinderStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "sendInput", "flowState", "Lcom/robinhood/models/api/pathfinder/input/FlowState;", "Companion", "feature-unverified-account-recovery_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class PathfinderSmsMfaEnrollOtpDuxo extends OldBaseDuxo<PathfinderSmsMfaEnrollOtpViewState> implements HasSavedState {
    private final PathfinderStore pathfinderStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PathfinderSmsMfaEnrollOtpDuxo(PathfinderStore pathfinderStore, SavedStateHandle savedStateHandle) {
        super(new PathfinderSmsMfaEnrollOtpViewState(((UserViewStatePageContext.SmsMfaEnrollOtp) ((LegacyFragmentKey.PathfinderSmsMfaEnrollOtp) INSTANCE.getArgs(savedStateHandle)).getUserViewState().getTypeContext()).getContext(), null, 2, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(pathfinderStore, "pathfinderStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.pathfinderStore = pathfinderStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C411911(null));
    }

    /* compiled from: PathfinderSmsMfaEnrollOtpDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.unverifiedaccountrecovery.phone.PathfinderSmsMfaEnrollOtpDuxo$onCreate$1", m3645f = "PathfinderSmsMfaEnrollOtpDuxo.kt", m3646l = {37}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.unverifiedaccountrecovery.phone.PathfinderSmsMfaEnrollOtpDuxo$onCreate$1 */
    static final class C411911 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C411911(Continuation<? super C411911> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PathfinderSmsMfaEnrollOtpDuxo.this.new C411911(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C411911) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final Flow<UserViewState.Page<?>> flowStreamPageUserViewState = PathfinderSmsMfaEnrollOtpDuxo.this.pathfinderStore.streamPageUserViewState(((LegacyFragmentKey.PathfinderSmsMfaEnrollOtp) PathfinderSmsMfaEnrollOtpDuxo.INSTANCE.getArgs((HasSavedState) PathfinderSmsMfaEnrollOtpDuxo.this)).getInquiryId());
                final Flow<Object> flow = new Flow<Object>() { // from class: com.robinhood.shared.unverifiedaccountrecovery.phone.PathfinderSmsMfaEnrollOtpDuxo$onCreate$1$invokeSuspend$$inlined$streamTypedPageUserViewState$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.unverifiedaccountrecovery.phone.PathfinderSmsMfaEnrollOtpDuxo$onCreate$1$invokeSuspend$$inlined$streamTypedPageUserViewState$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.shared.unverifiedaccountrecovery.phone.PathfinderSmsMfaEnrollOtpDuxo$onCreate$1$invokeSuspend$$inlined$streamTypedPageUserViewState$1$2", m3645f = "PathfinderSmsMfaEnrollOtpDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.shared.unverifiedaccountrecovery.phone.PathfinderSmsMfaEnrollOtpDuxo$onCreate$1$invokeSuspend$$inlined$streamTypedPageUserViewState$1$2$1, reason: invalid class name */
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
                final PathfinderSmsMfaEnrollOtpDuxo pathfinderSmsMfaEnrollOtpDuxo = PathfinderSmsMfaEnrollOtpDuxo.this;
                Flow<UserViewState.Page<UserViewStatePageContext.SmsMfaEnrollOtp>> flow2 = new Flow<UserViewState.Page<UserViewStatePageContext.SmsMfaEnrollOtp>>() { // from class: com.robinhood.shared.unverifiedaccountrecovery.phone.PathfinderSmsMfaEnrollOtpDuxo$onCreate$1$invokeSuspend$$inlined$filter$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.unverifiedaccountrecovery.phone.PathfinderSmsMfaEnrollOtpDuxo$onCreate$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;
                        final /* synthetic */ PathfinderSmsMfaEnrollOtpDuxo this$0;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.shared.unverifiedaccountrecovery.phone.PathfinderSmsMfaEnrollOtpDuxo$onCreate$1$invokeSuspend$$inlined$filter$1$2", m3645f = "PathfinderSmsMfaEnrollOtpDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.shared.unverifiedaccountrecovery.phone.PathfinderSmsMfaEnrollOtpDuxo$onCreate$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
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

                        public AnonymousClass2(FlowCollector flowCollector, PathfinderSmsMfaEnrollOtpDuxo pathfinderSmsMfaEnrollOtpDuxo) {
                            this.$this_unsafeFlow = flowCollector;
                            this.this$0 = pathfinderSmsMfaEnrollOtpDuxo;
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
                                if (((UserViewState.Page) obj).getSequence() == ((LegacyFragmentKey.PathfinderSmsMfaEnrollOtp) PathfinderSmsMfaEnrollOtpDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getUserViewState().getSequence()) {
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
                    public Object collect(FlowCollector<? super UserViewState.Page<UserViewStatePageContext.SmsMfaEnrollOtp>> flowCollector, Continuation continuation) {
                        Object objCollect = flow.collect(new AnonymousClass2(flowCollector, pathfinderSmsMfaEnrollOtpDuxo), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(PathfinderSmsMfaEnrollOtpDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flow2, anonymousClass2, this) == coroutine_suspended) {
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

        /* compiled from: PathfinderSmsMfaEnrollOtpDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "page", "Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;", "Lcom/robinhood/models/ui/pathfinder/contexts/UserViewStatePageContext$SmsMfaEnrollOtp;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.unverifiedaccountrecovery.phone.PathfinderSmsMfaEnrollOtpDuxo$onCreate$1$2", m3645f = "PathfinderSmsMfaEnrollOtpDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.unverifiedaccountrecovery.phone.PathfinderSmsMfaEnrollOtpDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<UserViewState.Page<UserViewStatePageContext.SmsMfaEnrollOtp>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ PathfinderSmsMfaEnrollOtpDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(PathfinderSmsMfaEnrollOtpDuxo pathfinderSmsMfaEnrollOtpDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = pathfinderSmsMfaEnrollOtpDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(UserViewState.Page<UserViewStatePageContext.SmsMfaEnrollOtp> page, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(page, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                final UserViewState.Page page = (UserViewState.Page) this.L$0;
                this.this$0.applyMutation(new Function1() { // from class: com.robinhood.shared.unverifiedaccountrecovery.phone.PathfinderSmsMfaEnrollOtpDuxo$onCreate$1$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return PathfinderSmsMfaEnrollOtpDuxo.C411911.AnonymousClass2.invokeSuspend$lambda$0(page, (PathfinderSmsMfaEnrollOtpViewState) obj2);
                    }
                });
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final PathfinderSmsMfaEnrollOtpViewState invokeSuspend$lambda$0(UserViewState.Page page, PathfinderSmsMfaEnrollOtpViewState pathfinderSmsMfaEnrollOtpViewState) {
                return PathfinderSmsMfaEnrollOtpViewState.copy$default(pathfinderSmsMfaEnrollOtpViewState, ((UserViewStatePageContext.SmsMfaEnrollOtp) page.getTypeContext()).getContext(), null, 2, null);
            }
        }
    }

    /* compiled from: PathfinderSmsMfaEnrollOtpDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.unverifiedaccountrecovery.phone.PathfinderSmsMfaEnrollOtpDuxo$sendInput$1", m3645f = "PathfinderSmsMfaEnrollOtpDuxo.kt", m3646l = {47}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.unverifiedaccountrecovery.phone.PathfinderSmsMfaEnrollOtpDuxo$sendInput$1 */
    static final class C411921 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ FlowState $flowState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C411921(FlowState flowState, Continuation<? super C411921> continuation) {
            super(2, continuation);
            this.$flowState = flowState;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PathfinderSmsMfaEnrollOtpDuxo.this.new C411921(this.$flowState, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C411921) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            C411921 c411921;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PathfinderSmsMfaEnrollOtpDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.shared.unverifiedaccountrecovery.phone.PathfinderSmsMfaEnrollOtpDuxo$sendInput$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return PathfinderSmsMfaEnrollOtpDuxo.C411921.invokeSuspend$lambda$0((PathfinderSmsMfaEnrollOtpViewState) obj2);
                    }
                });
                PathfinderStore pathfinderStore = PathfinderSmsMfaEnrollOtpDuxo.this.pathfinderStore;
                Companion companion = PathfinderSmsMfaEnrollOtpDuxo.INSTANCE;
                UUID inquiryId = ((LegacyFragmentKey.PathfinderSmsMfaEnrollOtp) companion.getArgs((HasSavedState) PathfinderSmsMfaEnrollOtpDuxo.this)).getInquiryId();
                int sequence = ((LegacyFragmentKey.PathfinderSmsMfaEnrollOtp) companion.getArgs((HasSavedState) PathfinderSmsMfaEnrollOtpDuxo.this)).getUserViewState().getSequence();
                UserViewInput.SmsMfaEnrollOtp smsMfaEnrollOtp = new UserViewInput.SmsMfaEnrollOtp(this.$flowState);
                final PathfinderSmsMfaEnrollOtpDuxo pathfinderSmsMfaEnrollOtpDuxo = PathfinderSmsMfaEnrollOtpDuxo.this;
                final FlowState flowState = this.$flowState;
                Function1<? super Throwable, Boolean> function1 = new Function1() { // from class: com.robinhood.shared.unverifiedaccountrecovery.phone.PathfinderSmsMfaEnrollOtpDuxo$sendInput$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return Boolean.valueOf(PathfinderSmsMfaEnrollOtpDuxo.C411921.invokeSuspend$lambda$3(pathfinderSmsMfaEnrollOtpDuxo, flowState, (Throwable) obj2));
                    }
                };
                this.label = 1;
                c411921 = this;
                obj = pathfinderStore.handleUserInput(inquiryId, sequence, smsMfaEnrollOtp, function1, c411921);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                c411921 = this;
            }
            if (((UserViewState) obj) != null) {
                PathfinderSmsMfaEnrollOtpDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.shared.unverifiedaccountrecovery.phone.PathfinderSmsMfaEnrollOtpDuxo$sendInput$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return PathfinderSmsMfaEnrollOtpDuxo.C411921.invokeSuspend$lambda$4((PathfinderSmsMfaEnrollOtpViewState) obj2);
                    }
                });
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final PathfinderSmsMfaEnrollOtpViewState invokeSuspend$lambda$0(PathfinderSmsMfaEnrollOtpViewState pathfinderSmsMfaEnrollOtpViewState) {
            return PathfinderSmsMfaEnrollOtpViewState.copy$default(pathfinderSmsMfaEnrollOtpViewState, null, PathfinderSmsMfaEnrollOtpViewState.InputState.Sending.INSTANCE, 1, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invokeSuspend$lambda$3(PathfinderSmsMfaEnrollOtpDuxo pathfinderSmsMfaEnrollOtpDuxo, final FlowState flowState, Throwable th) {
            boolean zIsNetworkRelated = Throwables.isNetworkRelated(th);
            if (zIsNetworkRelated) {
                pathfinderSmsMfaEnrollOtpDuxo.applyMutation(new Function1() { // from class: com.robinhood.shared.unverifiedaccountrecovery.phone.PathfinderSmsMfaEnrollOtpDuxo$sendInput$1$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PathfinderSmsMfaEnrollOtpDuxo.C411921.invokeSuspend$lambda$3$lambda$2$lambda$1(flowState, (PathfinderSmsMfaEnrollOtpViewState) obj);
                    }
                });
            }
            return zIsNetworkRelated;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final PathfinderSmsMfaEnrollOtpViewState invokeSuspend$lambda$3$lambda$2$lambda$1(FlowState flowState, PathfinderSmsMfaEnrollOtpViewState pathfinderSmsMfaEnrollOtpViewState) {
            return PathfinderSmsMfaEnrollOtpViewState.copy$default(pathfinderSmsMfaEnrollOtpViewState, null, new PathfinderSmsMfaEnrollOtpViewState.InputState.SendFailed(flowState), 1, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final PathfinderSmsMfaEnrollOtpViewState invokeSuspend$lambda$4(PathfinderSmsMfaEnrollOtpViewState pathfinderSmsMfaEnrollOtpViewState) {
            return PathfinderSmsMfaEnrollOtpViewState.copy$default(pathfinderSmsMfaEnrollOtpViewState, null, PathfinderSmsMfaEnrollOtpViewState.InputState.SendSucceeded.INSTANCE, 1, null);
        }
    }

    public final void sendInput(FlowState flowState) {
        Intrinsics.checkNotNullParameter(flowState, "flowState");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C411921(flowState, null), 3, null);
    }

    /* compiled from: PathfinderSmsMfaEnrollOtpDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/unverifiedaccountrecovery/phone/PathfinderSmsMfaEnrollOtpDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/shared/unverifiedaccountrecovery/phone/PathfinderSmsMfaEnrollOtpDuxo;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$PathfinderSmsMfaEnrollOtp;", "<init>", "()V", "feature-unverified-account-recovery_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<PathfinderSmsMfaEnrollOtpDuxo, LegacyFragmentKey.PathfinderSmsMfaEnrollOtp> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyFragmentKey.PathfinderSmsMfaEnrollOtp getArgs(SavedStateHandle savedStateHandle) {
            return (LegacyFragmentKey.PathfinderSmsMfaEnrollOtp) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyFragmentKey.PathfinderSmsMfaEnrollOtp getArgs(PathfinderSmsMfaEnrollOtpDuxo pathfinderSmsMfaEnrollOtpDuxo) {
            return (LegacyFragmentKey.PathfinderSmsMfaEnrollOtp) DuxoCompanion.DefaultImpls.getArgs(this, pathfinderSmsMfaEnrollOtpDuxo);
        }
    }
}
