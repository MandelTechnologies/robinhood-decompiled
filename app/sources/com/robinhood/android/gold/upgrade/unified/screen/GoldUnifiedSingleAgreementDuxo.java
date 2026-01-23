package com.robinhood.android.gold.upgrade.unified.screen;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.gold.upgrade.unified.GoldUnifiedBaseDuxo;
import com.robinhood.android.gold.upgrade.unified.SingleAgreementDest;
import com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedSingleAgreementViewState;
import com.robinhood.android.microgramsdui.MicrogramManager;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.compose.duxo.DuxoComposableCompanion;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.logging.EventMetadata;
import com.robinhood.utils.logging.SentryTeam;
import gold_flow.proto.p466v1.Cta;
import gold_flow.proto.p466v1.StreamSingleAgreementContentRequest;
import gold_flow.proto.p466v1.StreamSingleAgreementContentRequestDto;
import gold_flow.proto.p466v1.StreamSingleAgreementContentResponse;
import gold_flow.proto.p466v1.StreamSingleAgreementContentResponseDto;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: GoldUnifiedSingleAgreementDuxo.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0012B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0006\u0010\u0010\u001a\u00020\u000fJ\u0006\u0010\u0011\u001a\u00020\u000fR\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/unified/screen/GoldUnifiedSingleAgreementDuxo;", "Lcom/robinhood/android/gold/upgrade/unified/GoldUnifiedBaseDuxo;", "Lcom/robinhood/android/gold/upgrade/unified/screen/GoldUnifiedSingleAgreementViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "microgramManager", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/android/microgramsdui/MicrogramManager;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "onReviewed", "onAccepted", "Companion", "feature-gold-upgrade_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class GoldUnifiedSingleAgreementDuxo extends GoldUnifiedBaseDuxo<GoldUnifiedSingleAgreementViewState> implements HasSavedState {
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoldUnifiedSingleAgreementDuxo(DuxoBundle duxoBundle, MicrogramManager microgramManager, SavedStateHandle savedStateHandle) {
        super(microgramManager, duxoBundle, GoldUnifiedSingleAgreementViewState.Loading.INSTANCE);
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: GoldUnifiedSingleAgreementDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedSingleAgreementDuxo$onCreate$1", m3645f = "GoldUnifiedSingleAgreementDuxo.kt", m3646l = {52}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedSingleAgreementDuxo$onCreate$1 */
    static final class C182521 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C182521(Continuation<? super C182521> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GoldUnifiedSingleAgreementDuxo.this.new C182521(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C182521) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final Flow<StreamSingleAgreementContentResponseDto> flowStreamSingleAgreementContent = GoldUnifiedSingleAgreementDuxo.this.getGoldFlowService().StreamSingleAgreementContent(StreamSingleAgreementContentRequestDto.INSTANCE.fromProto(new StreamSingleAgreementContentRequest(((SingleAgreementDest.Args) GoldUnifiedSingleAgreementDuxo.INSTANCE.getArgs((HasSavedState) GoldUnifiedSingleAgreementDuxo.this)).getRequestId(), null, 2, 0 == true ? 1 : 0)));
                final GoldUnifiedSingleAgreementDuxo goldUnifiedSingleAgreementDuxo = GoldUnifiedSingleAgreementDuxo.this;
                final Flow<StreamSingleAgreementContentResponseDto> flow = new Flow<StreamSingleAgreementContentResponseDto>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedSingleAgreementDuxo$onCreate$1$invokeSuspend$$inlined$filter$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedSingleAgreementDuxo$onCreate$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;
                        final /* synthetic */ GoldUnifiedSingleAgreementDuxo this$0;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedSingleAgreementDuxo$onCreate$1$invokeSuspend$$inlined$filter$1$2", m3645f = "GoldUnifiedSingleAgreementDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedSingleAgreementDuxo$onCreate$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
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

                        public AnonymousClass2(FlowCollector flowCollector, GoldUnifiedSingleAgreementDuxo goldUnifiedSingleAgreementDuxo) {
                            this.$this_unsafeFlow = flowCollector;
                            this.this$0 = goldUnifiedSingleAgreementDuxo;
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
                                if (Intrinsics.areEqual(((StreamSingleAgreementContentResponseDto) obj).getRequest_id(), ((SingleAgreementDest.Args) GoldUnifiedSingleAgreementDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getRequestId())) {
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
                    public Object collect(FlowCollector<? super StreamSingleAgreementContentResponseDto> flowCollector, Continuation continuation) {
                        Object objCollect = flowStreamSingleAgreementContent.collect(new AnonymousClass2(flowCollector, goldUnifiedSingleAgreementDuxo), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
                Flow flowM28818catch = FlowKt.m28818catch(new Flow<StreamSingleAgreementContentResponse>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedSingleAgreementDuxo$onCreate$1$invokeSuspend$$inlined$map$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedSingleAgreementDuxo$onCreate$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedSingleAgreementDuxo$onCreate$1$invokeSuspend$$inlined$map$1$2", m3645f = "GoldUnifiedSingleAgreementDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedSingleAgreementDuxo$onCreate$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                StreamSingleAgreementContentResponse proto = ((StreamSingleAgreementContentResponseDto) obj).toProto();
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(proto, anonymousClass1) == coroutine_suspended) {
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

                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super StreamSingleAgreementContentResponse> flowCollector, Continuation continuation) {
                        Object objCollect = flow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                }, new AnonymousClass3(GoldUnifiedSingleAgreementDuxo.this, null));
                final GoldUnifiedSingleAgreementDuxo goldUnifiedSingleAgreementDuxo2 = GoldUnifiedSingleAgreementDuxo.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedSingleAgreementDuxo.onCreate.1.4
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((StreamSingleAgreementContentResponse) obj2, (Continuation<? super Unit>) continuation);
                    }

                    /* compiled from: GoldUnifiedSingleAgreementDuxo.kt */
                    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/gold/upgrade/unified/screen/GoldUnifiedSingleAgreementViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedSingleAgreementDuxo$onCreate$1$4$1", m3645f = "GoldUnifiedSingleAgreementDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                    /* renamed from: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedSingleAgreementDuxo$onCreate$1$4$1, reason: invalid class name */
                    static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<GoldUnifiedSingleAgreementViewState, Continuation<? super GoldUnifiedSingleAgreementViewState>, Object> {
                        final /* synthetic */ StreamSingleAgreementContentResponse $content;
                        private /* synthetic */ Object L$0;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass1(StreamSingleAgreementContentResponse streamSingleAgreementContentResponse, Continuation<? super AnonymousClass1> continuation) {
                            super(2, continuation);
                            this.$content = streamSingleAgreementContentResponse;
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$content, continuation);
                            anonymousClass1.L$0 = obj;
                            return anonymousClass1;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(GoldUnifiedSingleAgreementViewState goldUnifiedSingleAgreementViewState, Continuation<? super GoldUnifiedSingleAgreementViewState> continuation) {
                            return ((AnonymousClass1) create(goldUnifiedSingleAgreementViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            if (this.label != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            GoldUnifiedSingleAgreementViewState goldUnifiedSingleAgreementViewState = (GoldUnifiedSingleAgreementViewState) this.L$0;
                            if (goldUnifiedSingleAgreementViewState instanceof GoldUnifiedSingleAgreementViewState.Error) {
                                return goldUnifiedSingleAgreementViewState;
                            }
                            if (goldUnifiedSingleAgreementViewState instanceof GoldUnifiedSingleAgreementViewState.Loaded) {
                                return GoldUnifiedSingleAgreementViewState.Loaded.copy$default((GoldUnifiedSingleAgreementViewState.Loaded) goldUnifiedSingleAgreementViewState, this.$content, null, 2, null);
                            }
                            if (!Intrinsics.areEqual(goldUnifiedSingleAgreementViewState, GoldUnifiedSingleAgreementViewState.Loading.INSTANCE)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return new GoldUnifiedSingleAgreementViewState.Loaded(this.$content, GoldUnifiedSingleAgreementViewState2.UNREVIEWED);
                        }
                    }

                    public final Object emit(StreamSingleAgreementContentResponse streamSingleAgreementContentResponse, Continuation<? super Unit> continuation) {
                        if (streamSingleAgreementContentResponse.getAgreement() != null) {
                            goldUnifiedSingleAgreementDuxo2.applyMutation(new AnonymousClass1(streamSingleAgreementContentResponse, null));
                        } else {
                            goldUnifiedSingleAgreementDuxo2.applyMutation(new AnonymousClass2(null));
                        }
                        return Unit.INSTANCE;
                    }

                    /* compiled from: GoldUnifiedSingleAgreementDuxo.kt */
                    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/gold/upgrade/unified/screen/GoldUnifiedSingleAgreementViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedSingleAgreementDuxo$onCreate$1$4$2", m3645f = "GoldUnifiedSingleAgreementDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                    /* renamed from: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedSingleAgreementDuxo$onCreate$1$4$2, reason: invalid class name */
                    static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<GoldUnifiedSingleAgreementViewState, Continuation<? super GoldUnifiedSingleAgreementViewState>, Object> {
                        int label;

                        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                            super(2, continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new AnonymousClass2(continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(GoldUnifiedSingleAgreementViewState goldUnifiedSingleAgreementViewState, Continuation<? super GoldUnifiedSingleAgreementViewState> continuation) {
                            return ((AnonymousClass2) create(goldUnifiedSingleAgreementViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            if (this.label != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return new GoldUnifiedSingleAgreementViewState.Error(new Exception("Agreement is null"));
                        }
                    }
                };
                this.label = 1;
                if (flowM28818catch.collect(flowCollector, this) == coroutine_suspended) {
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

        /* compiled from: GoldUnifiedSingleAgreementDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lgold_flow/proto/v1/StreamSingleAgreementContentResponse;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedSingleAgreementDuxo$onCreate$1$3", m3645f = "GoldUnifiedSingleAgreementDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedSingleAgreementDuxo$onCreate$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function3<FlowCollector<? super StreamSingleAgreementContentResponse>, Throwable, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ GoldUnifiedSingleAgreementDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(GoldUnifiedSingleAgreementDuxo goldUnifiedSingleAgreementDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(3, continuation);
                this.this$0 = goldUnifiedSingleAgreementDuxo;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(FlowCollector<? super StreamSingleAgreementContentResponse> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                anonymousClass3.L$0 = th;
                return anonymousClass3.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Throwable th = (Throwable) this.L$0;
                CrashReporter.INSTANCE.reportNonFatal(th, false, new EventMetadata(SentryTeam.GOLD, null, null, 6, null));
                this.this$0.applyMutation(new AnonymousClass1(th, null));
                return Unit.INSTANCE;
            }

            /* compiled from: GoldUnifiedSingleAgreementDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/gold/upgrade/unified/screen/GoldUnifiedSingleAgreementViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedSingleAgreementDuxo$onCreate$1$3$1", m3645f = "GoldUnifiedSingleAgreementDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedSingleAgreementDuxo$onCreate$1$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<GoldUnifiedSingleAgreementViewState, Continuation<? super GoldUnifiedSingleAgreementViewState>, Object> {
                final /* synthetic */ Throwable $it;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(Throwable th, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$it = th;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.$it, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(GoldUnifiedSingleAgreementViewState goldUnifiedSingleAgreementViewState, Continuation<? super GoldUnifiedSingleAgreementViewState> continuation) {
                    return ((AnonymousClass1) create(goldUnifiedSingleAgreementViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return new GoldUnifiedSingleAgreementViewState.Error(this.$it);
                }
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C182521(null));
    }

    public final void onReviewed() {
        withDataState(new Function1() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedSingleAgreementDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GoldUnifiedSingleAgreementDuxo.onReviewed$lambda$0(this.f$0, (GoldUnifiedSingleAgreementViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onReviewed$lambda$0(GoldUnifiedSingleAgreementDuxo goldUnifiedSingleAgreementDuxo, GoldUnifiedSingleAgreementViewState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state instanceof GoldUnifiedSingleAgreementViewState.Loaded) {
            goldUnifiedSingleAgreementDuxo.applyMutation(new GoldUnifiedSingleAgreementDuxo3(state, null));
        }
        return Unit.INSTANCE;
    }

    public final void onAccepted() {
        withDataState(new Function1() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedSingleAgreementDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GoldUnifiedSingleAgreementDuxo.onAccepted$lambda$1(this.f$0, (GoldUnifiedSingleAgreementViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAccepted$lambda$1(GoldUnifiedSingleAgreementDuxo goldUnifiedSingleAgreementDuxo, GoldUnifiedSingleAgreementViewState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state instanceof GoldUnifiedSingleAgreementViewState.Loaded) {
            goldUnifiedSingleAgreementDuxo.applyMutation(new GoldUnifiedSingleAgreementDuxo2(state, null));
            Cta cta = ((GoldUnifiedSingleAgreementViewState.Loaded) state).getContent().getCta();
            goldUnifiedSingleAgreementDuxo.sendAction(cta != null ? cta.getAction() : null);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: GoldUnifiedSingleAgreementDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/unified/screen/GoldUnifiedSingleAgreementDuxo$Companion;", "Lcom/robinhood/compose/duxo/DuxoComposableCompanion;", "Lcom/robinhood/android/gold/upgrade/unified/screen/GoldUnifiedSingleAgreementDuxo;", "Lcom/robinhood/android/gold/upgrade/unified/SingleAgreementDest$Args;", "<init>", "()V", "feature-gold-upgrade_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoComposableCompanion<GoldUnifiedSingleAgreementDuxo, SingleAgreementDest.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.compose.duxo.DuxoComposableCompanion
        public SingleAgreementDest.Args getArgs(SavedStateHandle savedStateHandle) {
            return (SingleAgreementDest.Args) DuxoComposableCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.compose.duxo.DuxoComposableCompanion
        public SingleAgreementDest.Args getArgs(GoldUnifiedSingleAgreementDuxo goldUnifiedSingleAgreementDuxo) {
            return (SingleAgreementDest.Args) DuxoComposableCompanion.DefaultImpls.getArgs(this, goldUnifiedSingleAgreementDuxo);
        }
    }
}
