package com.robinhood.android.microgramsdui;

import com.robinhood.android.microgramsdui.MicrogramBottomSheetDuxo2;
import com.robinhood.android.microgramsdui.MicrogramBottomSheetDuxo3;
import com.robinhood.android.microgramsdui.control.UiController;
import com.robinhood.android.shared.serverui.utils.UiObject;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.microgram.sdui.BottomSheetMessage;
import com.robinhood.microgram.sdui.MicrogramAction;
import com.robinhood.utils.coroutines.scope.RootCoroutineScope;
import kotlin.ExceptionsH;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferred3;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import microgram.p507ui.p508v1.BottomSheetContentDto;
import microgram.p507ui.p508v1.BottomSheetOutboundMessageDto;

/* compiled from: MicrogramBottomSheetDuxo.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u000f\u001a\u00020\u0010H\u0082@¢\u0006\u0002\u0010\u0011J6\u0010\u0012\u001a\u00020\u00132'\u0010\u0014\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0015¢\u0006\u0002\b\u0018H\u0002¢\u0006\u0002\u0010\u0019J6\u0010\u001a\u001a\u00020\u00132'\u0010\u0014\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0015¢\u0006\u0002\b\u0018H\u0002¢\u0006\u0002\u0010\u0019J\b\u0010\u001b\u001a\u00020\u0013H\u0016J \u0010\u001c\u001a\u00020\u00132\u0016\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 0\u001ej\u0002`!H\u0002J\u0010\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001fH\u0002J\u0010\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020 H\u0002J\b\u0010\"\u001a\u00020\u0013H\u0016J\b\u0010#\u001a\u00020\u0013H\u0016J\b\u0010$\u001a\u00020\u0013H\u0016J\u0016\u0010%\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\fJ\u000e\u0010'\u001a\u00020\u00132\u0006\u0010(\u001a\u00020)R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/microgramsdui/MicrogramBottomSheetDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/microgramsdui/BottomSheetViewState;", "Lcom/robinhood/android/microgramsdui/BottomSheetEvent;", "rootCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lcom/robinhood/android/udf/DuxoBundle;)V", "instanceDeferred", "Lkotlinx/coroutines/CompletableDeferred;", "Lcom/robinhood/android/microgramsdui/MicrogramInstance;", "identifier", "", "uiController", "Lcom/robinhood/android/microgramsdui/control/UiController;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendMessage", "", "block", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;)V", "sendMessageInRootScope", "onCreate", "handleEvent", "event", "Lcom/robinhood/android/shared/serverui/utils/UiObject;", "Lcom/robinhood/microgram/sdui/BottomSheetMessage;", "Lmicrogram/ui/v1/BottomSheetOutboundMessageDto;", "Lcom/robinhood/microgram/sdui/AnyBottomSheetMessage;", "onResume", "onPause", "onDestroy", "initScreen", "instance", "action", "microgramAction", "Lcom/robinhood/microgram/sdui/MicrogramAction;", "lib-microgram-sdui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class MicrogramBottomSheetDuxo extends BaseDuxo5<MicrogramBottomSheetDuxo3, MicrogramBottomSheetDuxo2> {
    public static final int $stable = 8;
    private String identifier;
    private final CompletableDeferred<MicrogramManager2> instanceDeferred;
    private final CoroutineScope rootCoroutineScope;

    /* compiled from: MicrogramBottomSheetDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.microgramsdui.MicrogramBottomSheetDuxo", m3645f = "MicrogramBottomSheetDuxo.kt", m3646l = {34, 34}, m3647m = "uiController")
    /* renamed from: com.robinhood.android.microgramsdui.MicrogramBottomSheetDuxo$uiController$1 */
    static final class C218661 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C218661(Continuation<? super C218661> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MicrogramBottomSheetDuxo.this.uiController(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MicrogramBottomSheetDuxo(@RootCoroutineScope CoroutineScope rootCoroutineScope, DuxoBundle duxoBundle) {
        super(MicrogramBottomSheetDuxo3.Loading.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(rootCoroutineScope, "rootCoroutineScope");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.rootCoroutineScope = rootCoroutineScope;
        this.instanceDeferred = CompletableDeferred3.CompletableDeferred$default(null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object uiController(Continuation<? super UiController> continuation) {
        C218661 c218661;
        UiController.Companion companion;
        if (continuation instanceof C218661) {
            c218661 = (C218661) continuation;
            int i = c218661.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c218661.label = i - Integer.MIN_VALUE;
            } else {
                c218661 = new C218661(continuation);
            }
        }
        Object objAwait = c218661.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c218661.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objAwait);
            companion = UiController.INSTANCE;
            CompletableDeferred<MicrogramManager2> completableDeferred = this.instanceDeferred;
            c218661.L$0 = companion;
            c218661.label = 1;
            objAwait = completableDeferred.await(c218661);
            if (objAwait != coroutine_suspended) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objAwait);
            return objAwait;
        }
        companion = (UiController.Companion) c218661.L$0;
        ResultKt.throwOnFailure(objAwait);
        c218661.L$0 = null;
        c218661.label = 2;
        Object objUiController = companion.uiController((MicrogramManager2) objAwait, c218661);
        return objUiController == coroutine_suspended ? coroutine_suspended : objUiController;
    }

    /* compiled from: MicrogramBottomSheetDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.microgramsdui.MicrogramBottomSheetDuxo$sendMessage$1", m3645f = "MicrogramBottomSheetDuxo.kt", m3646l = {38, 38}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.microgramsdui.MicrogramBottomSheetDuxo$sendMessage$1 */
    static final class C218641 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<UiController, Continuation<? super Unit>, Object> $block;
        Object L$0;
        int label;
        final /* synthetic */ MicrogramBottomSheetDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C218641(Function2<? super UiController, ? super Continuation<? super Unit>, ? extends Object> function2, MicrogramBottomSheetDuxo microgramBottomSheetDuxo, Continuation<? super C218641> continuation) {
            super(2, continuation);
            this.$block = function2;
            this.this$0 = microgramBottomSheetDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C218641(this.$block, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C218641) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
        
            if (r1.invoke(r5, r4) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Function2 function2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                function2 = this.$block;
                MicrogramBottomSheetDuxo microgramBottomSheetDuxo = this.this$0;
                this.L$0 = function2;
                this.label = 1;
                obj = microgramBottomSheetDuxo.uiController(this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            function2 = (Function2) this.L$0;
            ResultKt.throwOnFailure(obj);
            this.L$0 = null;
            this.label = 2;
        }
    }

    private final void sendMessage(Function2<? super UiController, ? super Continuation<? super Unit>, ? extends Object> block) {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C218641(block, this, null), 3, null);
    }

    /* compiled from: MicrogramBottomSheetDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.microgramsdui.MicrogramBottomSheetDuxo$sendMessageInRootScope$1", m3645f = "MicrogramBottomSheetDuxo.kt", m3646l = {50, 50}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.microgramsdui.MicrogramBottomSheetDuxo$sendMessageInRootScope$1 */
    static final class C218651 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<UiController, Continuation<? super Unit>, Object> $block;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ MicrogramBottomSheetDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C218651(Function2<? super UiController, ? super Continuation<? super Unit>, ? extends Object> function2, MicrogramBottomSheetDuxo microgramBottomSheetDuxo, Continuation<? super C218651> continuation) {
            super(2, continuation);
            this.$block = function2;
            this.this$0 = microgramBottomSheetDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C218651 c218651 = new C218651(this.$block, this.this$0, continuation);
            c218651.L$0 = obj;
            return c218651;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C218651) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
        
            if (r1.invoke(r6, r5) == r0) goto L21;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Function2 function2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
            } catch (Throwable th) {
                Result.Companion companion = Result.INSTANCE;
                Result.m28550constructorimpl(ResultKt.createFailure(th));
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                function2 = this.$block;
                MicrogramBottomSheetDuxo microgramBottomSheetDuxo = this.this$0;
                Result.Companion companion2 = Result.INSTANCE;
                this.L$0 = function2;
                this.label = 1;
                obj = microgramBottomSheetDuxo.uiController(this);
                if (obj == coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Result.m28550constructorimpl(Unit.INSTANCE);
                return Unit.INSTANCE;
            }
            function2 = (Function2) this.L$0;
            ResultKt.throwOnFailure(obj);
            this.L$0 = null;
            this.label = 2;
        }
    }

    private final void sendMessageInRootScope(Function2<? super UiController, ? super Continuation<? super Unit>, ? extends Object> block) {
        BuildersKt__Builders_commonKt.launch$default(this.rootCoroutineScope, null, null, new C218651(block, this, null), 3, null);
    }

    /* compiled from: MicrogramBottomSheetDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.microgramsdui.MicrogramBottomSheetDuxo$onCreate$1", m3645f = "MicrogramBottomSheetDuxo.kt", m3646l = {58, 58}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.microgramsdui.MicrogramBottomSheetDuxo$onCreate$1 */
    static final class C218591 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C218591(Continuation<? super C218591> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MicrogramBottomSheetDuxo.this.new C218591(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C218591) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: MicrogramBottomSheetDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.microgramsdui.MicrogramBottomSheetDuxo$onCreate$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ MicrogramBottomSheetDuxo $tmp0;

            AnonymousClass1(MicrogramBottomSheetDuxo microgramBottomSheetDuxo) {
                this.$tmp0 = microgramBottomSheetDuxo;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, MicrogramBottomSheetDuxo.class, "handleEvent", "handleEvent(Lcom/robinhood/android/shared/serverui/utils/UiObject;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(UiObject<? extends BottomSheetMessage, BottomSheetOutboundMessageDto> uiObject, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$handleEvent = C218591.invokeSuspend$handleEvent(this.$tmp0, uiObject, continuation);
                return objInvokeSuspend$handleEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$handleEvent : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((UiObject<? extends BottomSheetMessage, BottomSheetOutboundMessageDto>) obj, (Continuation<? super Unit>) continuation);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
        
            if (r5.collect(r3, r4) == r0) goto L18;
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
                MicrogramBottomSheetDuxo microgramBottomSheetDuxo = MicrogramBottomSheetDuxo.this;
                this.label = 1;
                obj = microgramBottomSheetDuxo.uiController(this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                throw new ExceptionsH();
            }
            ResultKt.throwOnFailure(obj);
            UiController uiController = (UiController) obj;
            String str = MicrogramBottomSheetDuxo.this.identifier;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("identifier");
                str = null;
            }
            SharedFlow<UiObject<BottomSheetMessage, BottomSheetOutboundMessageDto>> events = uiController.bottomSheetView(str).getEvents();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(MicrogramBottomSheetDuxo.this);
            this.label = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$handleEvent(MicrogramBottomSheetDuxo microgramBottomSheetDuxo, UiObject uiObject, Continuation continuation) {
            microgramBottomSheetDuxo.handleEvent((UiObject<? extends BottomSheetMessage, BottomSheetOutboundMessageDto>) uiObject);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.CREATED, new C218591(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEvent(UiObject<? extends BottomSheetMessage, BottomSheetOutboundMessageDto> event) {
        if (event instanceof UiObject.Legacy) {
            handleEvent((BottomSheetMessage) ((UiObject.Legacy) event).getValue());
        } else {
            if (!(event instanceof UiObject.Idl)) {
                throw new NoWhenBranchMatchedException();
            }
            handleEvent((BottomSheetOutboundMessageDto) ((UiObject.Idl) event).getValue());
        }
    }

    /* compiled from: MicrogramBottomSheetDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/microgramsdui/BottomSheetViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.microgramsdui.MicrogramBottomSheetDuxo$handleEvent$1", m3645f = "MicrogramBottomSheetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.microgramsdui.MicrogramBottomSheetDuxo$handleEvent$1 */
    static final class C218571 extends ContinuationImpl7 implements Function2<MicrogramBottomSheetDuxo3, Continuation<? super MicrogramBottomSheetDuxo3>, Object> {
        final /* synthetic */ BottomSheetMessage $event;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C218571(BottomSheetMessage bottomSheetMessage, Continuation<? super C218571> continuation) {
            super(2, continuation);
            this.$event = bottomSheetMessage;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C218571(this.$event, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MicrogramBottomSheetDuxo3 microgramBottomSheetDuxo3, Continuation<? super MicrogramBottomSheetDuxo3> continuation) {
            return ((C218571) create(microgramBottomSheetDuxo3, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return new MicrogramBottomSheetDuxo3.Success(new UiObject.Legacy(((BottomSheetMessage.Update) this.$event).getContent()));
        }
    }

    private final void handleEvent(BottomSheetMessage event) {
        if (event instanceof BottomSheetMessage.Dismiss) {
            submit(MicrogramBottomSheetDuxo2.Dismiss.INSTANCE);
        } else {
            if (!(event instanceof BottomSheetMessage.Update)) {
                throw new NoWhenBranchMatchedException();
            }
            applyMutation(new C218571(event, null));
        }
    }

    private final void handleEvent(BottomSheetOutboundMessageDto event) {
        BottomSheetOutboundMessageDto.ConcreteDto concrete = event.getConcrete();
        if (concrete instanceof BottomSheetOutboundMessageDto.ConcreteDto.Dismiss) {
            submit(MicrogramBottomSheetDuxo2.Dismiss.INSTANCE);
        } else if (concrete instanceof BottomSheetOutboundMessageDto.ConcreteDto.Update) {
            applyMutation(new C218582(concrete, null));
        }
    }

    /* compiled from: MicrogramBottomSheetDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/microgramsdui/BottomSheetViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.microgramsdui.MicrogramBottomSheetDuxo$handleEvent$2", m3645f = "MicrogramBottomSheetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.microgramsdui.MicrogramBottomSheetDuxo$handleEvent$2 */
    static final class C218582 extends ContinuationImpl7 implements Function2<MicrogramBottomSheetDuxo3, Continuation<? super MicrogramBottomSheetDuxo3>, Object> {
        final /* synthetic */ BottomSheetOutboundMessageDto.ConcreteDto $concrete;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C218582(BottomSheetOutboundMessageDto.ConcreteDto concreteDto, Continuation<? super C218582> continuation) {
            super(2, continuation);
            this.$concrete = concreteDto;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C218582(this.$concrete, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MicrogramBottomSheetDuxo3 microgramBottomSheetDuxo3, Continuation<? super MicrogramBottomSheetDuxo3> continuation) {
            return ((C218582) create(microgramBottomSheetDuxo3, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            BottomSheetContentDto content = ((BottomSheetOutboundMessageDto.ConcreteDto.Update) this.$concrete).getValue().getContent();
            if (content == null) {
                content = BottomSheetContentDto.INSTANCE.getZeroValue();
            }
            return new MicrogramBottomSheetDuxo3.Success(new UiObject.Idl(content));
        }
    }

    /* compiled from: MicrogramBottomSheetDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lcom/robinhood/android/microgramsdui/control/UiController;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.microgramsdui.MicrogramBottomSheetDuxo$onResume$1", m3645f = "MicrogramBottomSheetDuxo.kt", m3646l = {85}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.microgramsdui.MicrogramBottomSheetDuxo$onResume$1 */
    static final class C218631 extends ContinuationImpl7 implements Function2<UiController, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C218631(Continuation<? super C218631> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C218631 c218631 = MicrogramBottomSheetDuxo.this.new C218631(continuation);
            c218631.L$0 = obj;
            return c218631;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(UiController uiController, Continuation<? super Unit> continuation) {
            return ((C218631) create(uiController, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                UiController uiController = (UiController) this.L$0;
                String str = MicrogramBottomSheetDuxo.this.identifier;
                if (str == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("identifier");
                    str = null;
                }
                this.label = 1;
                if (uiController.notifyScreenAppeared(str, this) == coroutine_suspended) {
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

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onResume() {
        super.onResume();
        sendMessage(new C218631(null));
    }

    /* compiled from: MicrogramBottomSheetDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lcom/robinhood/android/microgramsdui/control/UiController;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.microgramsdui.MicrogramBottomSheetDuxo$onPause$1", m3645f = "MicrogramBottomSheetDuxo.kt", m3646l = {90}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.microgramsdui.MicrogramBottomSheetDuxo$onPause$1 */
    static final class C218611 extends ContinuationImpl7 implements Function2<UiController, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C218611(Continuation<? super C218611> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C218611 c218611 = MicrogramBottomSheetDuxo.this.new C218611(continuation);
            c218611.L$0 = obj;
            return c218611;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(UiController uiController, Continuation<? super Unit> continuation) {
            return ((C218611) create(uiController, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                UiController uiController = (UiController) this.L$0;
                String str = MicrogramBottomSheetDuxo.this.identifier;
                if (str == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("identifier");
                    str = null;
                }
                this.label = 1;
                if (uiController.notifyScreenDisappeared(str, this) == coroutine_suspended) {
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

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onPause() {
        super.onPause();
        sendMessage(new C218611(null));
        sendMessageInRootScope(new C218622(null));
    }

    /* compiled from: MicrogramBottomSheetDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lcom/robinhood/android/microgramsdui/control/UiController;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.microgramsdui.MicrogramBottomSheetDuxo$onPause$2", m3645f = "MicrogramBottomSheetDuxo.kt", m3646l = {91}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.microgramsdui.MicrogramBottomSheetDuxo$onPause$2 */
    static final class C218622 extends ContinuationImpl7 implements Function2<UiController, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C218622(Continuation<? super C218622> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C218622 c218622 = MicrogramBottomSheetDuxo.this.new C218622(continuation);
            c218622.L$0 = obj;
            return c218622;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(UiController uiController, Continuation<? super Unit> continuation) {
            return ((C218622) create(uiController, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                UiController uiController = (UiController) this.L$0;
                String str = MicrogramBottomSheetDuxo.this.identifier;
                if (str == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("identifier");
                    str = null;
                }
                this.label = 1;
                if (uiController.notifyScreenDisappeared(str, this) == coroutine_suspended) {
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

    /* compiled from: MicrogramBottomSheetDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lcom/robinhood/android/microgramsdui/control/UiController;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.microgramsdui.MicrogramBottomSheetDuxo$onDestroy$1", m3645f = "MicrogramBottomSheetDuxo.kt", m3646l = {95}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.microgramsdui.MicrogramBottomSheetDuxo$onDestroy$1 */
    static final class C218601 extends ContinuationImpl7 implements Function2<UiController, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C218601(Continuation<? super C218601> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C218601 c218601 = MicrogramBottomSheetDuxo.this.new C218601(continuation);
            c218601.L$0 = obj;
            return c218601;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(UiController uiController, Continuation<? super Unit> continuation) {
            return ((C218601) create(uiController, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                UiController uiController = (UiController) this.L$0;
                String str = MicrogramBottomSheetDuxo.this.identifier;
                if (str == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("identifier");
                    str = null;
                }
                this.label = 1;
                if (uiController.notifyScreenTornDown(str, this) == coroutine_suspended) {
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

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onDestroy() {
        sendMessage(new C218601(null));
        super.onDestroy();
    }

    public final void initScreen(String identifier, MicrogramManager2 instance) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(instance, "instance");
        this.identifier = identifier;
        this.instanceDeferred.complete(instance);
    }

    /* compiled from: MicrogramBottomSheetDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lcom/robinhood/android/microgramsdui/control/UiController;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.microgramsdui.MicrogramBottomSheetDuxo$action$1", m3645f = "MicrogramBottomSheetDuxo.kt", m3646l = {105}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.microgramsdui.MicrogramBottomSheetDuxo$action$1 */
    static final class C218561 extends ContinuationImpl7 implements Function2<UiController, Continuation<? super Unit>, Object> {
        final /* synthetic */ MicrogramAction $microgramAction;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C218561(MicrogramAction microgramAction, Continuation<? super C218561> continuation) {
            super(2, continuation);
            this.$microgramAction = microgramAction;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C218561 c218561 = MicrogramBottomSheetDuxo.this.new C218561(this.$microgramAction, continuation);
            c218561.L$0 = obj;
            return c218561;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(UiController uiController, Continuation<? super Unit> continuation) {
            return ((C218561) create(uiController, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                UiController uiController = (UiController) this.L$0;
                String str = MicrogramBottomSheetDuxo.this.identifier;
                if (str == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("identifier");
                    str = null;
                }
                String identifier = this.$microgramAction.getIdentifier();
                this.label = 1;
                if (uiController.notifyScreenActionTriggered(str, identifier, this) == coroutine_suspended) {
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

    public final void action(MicrogramAction microgramAction) {
        Intrinsics.checkNotNullParameter(microgramAction, "microgramAction");
        sendMessage(new C218561(microgramAction, null));
    }
}
