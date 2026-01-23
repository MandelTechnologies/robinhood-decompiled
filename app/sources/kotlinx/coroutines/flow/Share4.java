package kotlinx.coroutines.flow;

import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.SharingStarted;

/* compiled from: Share.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", m3645f = "Share.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_NEW_WINDOW_VALUE, EnumC7081g.SDK_ASSET_ICON_PIN_VALUE, EnumC7081g.SDK_ASSET_ICON_PRODUCT_IDV_VALUE, EnumC7081g.SDK_ASSET_ICON_SUBMIT_VALUE}, m3647m = "invokeSuspend")
/* renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1, reason: use source file name */
/* loaded from: classes23.dex */
final class Share4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ T $initialValue;
    final /* synthetic */ SharedFlow2<T> $shared;
    final /* synthetic */ SharingStarted $started;
    final /* synthetic */ Flow<T> $upstream;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    Share4(SharingStarted sharingStarted, Flow<? extends T> flow, SharedFlow2<T> sharedFlow2, T t, Continuation<? super Share4> continuation) {
        super(2, continuation);
        this.$started = sharingStarted;
        this.$upstream = flow;
        this.$shared = sharedFlow2;
        this.$initialValue = t;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new Share4(this.$started, this.$upstream, this.$shared, this.$initialValue, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((Share4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        if (r8.collect(r1, r7) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
    
        if (r8.collect(r1, r7) != r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008a, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.collectLatest(r8, r1, r7) == r0) goto L28;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            SharingStarted sharingStarted = this.$started;
            SharingStarted.Companion companion = SharingStarted.INSTANCE;
            if (sharingStarted == companion.getEagerly()) {
                Flow<T> flow = this.$upstream;
                SharedFlow sharedFlow = this.$shared;
                this.label = 1;
            } else {
                if (this.$started == companion.getLazily()) {
                    StateFlow<Integer> subscriptionCount = this.$shared.getSubscriptionCount();
                    C461101 c461101 = new C461101(null);
                    this.label = 2;
                    if (FlowKt.first(subscriptionCount, c461101, this) != coroutine_suspended) {
                        Flow<T> flow2 = this.$upstream;
                        SharedFlow sharedFlow2 = this.$shared;
                        this.label = 3;
                    }
                } else {
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(this.$started.command(this.$shared.getSubscriptionCount()));
                    C461112 c461112 = new C461112(this.$upstream, this.$shared, this.$initialValue, null);
                    this.label = 4;
                }
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    Flow<T> flow22 = this.$upstream;
                    SharedFlow sharedFlow22 = this.$shared;
                    this.label = 3;
                } else if (i != 3 && i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: Share.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", m3645f = "Share.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1 */
    static final class C461101 extends ContinuationImpl7 implements Function2<Integer, Continuation<? super Boolean>, Object> {
        /* synthetic */ int I$0;
        int label;

        C461101(Continuation<? super C461101> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C461101 c461101 = new C461101(continuation);
            c461101.I$0 = ((Number) obj).intValue();
            return c461101;
        }

        public final Object invoke(int i, Continuation<? super Boolean> continuation) {
            return ((C461101) create(Integer.valueOf(i), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Integer num, Continuation<? super Boolean> continuation) {
            return invoke(num.intValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return boxing.boxBoolean(this.I$0 > 0);
        }
    }

    /* compiled from: Share.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lkotlinx/coroutines/flow/SharingCommand;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", m3645f = "Share.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2 */
    static final class C461112 extends ContinuationImpl7 implements Function2<SharingStarted2, Continuation<? super Unit>, Object> {
        final /* synthetic */ T $initialValue;
        final /* synthetic */ SharedFlow2<T> $shared;
        final /* synthetic */ Flow<T> $upstream;
        /* synthetic */ Object L$0;
        int label;

        /* compiled from: Share.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[SharingStarted2.values().length];
                try {
                    iArr[SharingStarted2.START.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[SharingStarted2.STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[SharingStarted2.STOP_AND_RESET_REPLAY_CACHE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C461112(Flow<? extends T> flow, SharedFlow2<T> sharedFlow2, T t, Continuation<? super C461112> continuation) {
            super(2, continuation);
            this.$upstream = flow;
            this.$shared = sharedFlow2;
            this.$initialValue = t;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C461112 c461112 = new C461112(this.$upstream, this.$shared, this.$initialValue, continuation);
            c461112.L$0 = obj;
            return c461112;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SharingStarted2 sharingStarted2, Continuation<? super Unit> continuation) {
            return ((C461112) create(sharingStarted2, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                int i2 = WhenMappings.$EnumSwitchMapping$0[((SharingStarted2) this.L$0).ordinal()];
                if (i2 == 1) {
                    Flow<T> flow = this.$upstream;
                    SharedFlow sharedFlow = this.$shared;
                    this.label = 1;
                    if (flow.collect(sharedFlow, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i2 != 2) {
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    T t = this.$initialValue;
                    if (t == SharedFlow4.NO_VALUE) {
                        this.$shared.resetReplayCache();
                    } else {
                        boxing.boxBoolean(this.$shared.tryEmit(t));
                    }
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
}
