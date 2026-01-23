package com.robinhood.microgram.sdui;

import android.net.Uri;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.microgramsdui.Lifecycle5;
import com.robinhood.android.microgramsdui.MicrogramManager2;
import com.robinhood.android.microgramsdui.control.UiController;
import com.robinhood.android.shared.serverui.utils.UiObject;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.microgram.sdui.MicrogramRouterDuxo2;
import com.robinhood.microgram.sdui.RouterMessage;
import kotlin.ExceptionsH;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferred3;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import microgram.p507ui.p508v1.InitialScreenDataDto;
import microgram.p507ui.p508v1.RouterOutboundDto;
import microgram.p507ui.p508v1.ToastDto;
import rh_server_driven_ui.p531v1.AlertDto;

/* compiled from: MicrogramRouterDuxo.kt */
@Metadata(m3635d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0011\u001a\u00020\u0012H\u0082@¢\u0006\u0002\u0010\u0013J6\u0010\u0014\u001a\u00020\u00022'\u0010\u0015\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0016¢\u0006\u0002\b\u0019H\u0002¢\u0006\u0002\u0010\u001aJ\b\u0010\u001b\u001a\u00020\u0002H\u0017J&\u0010\u001c\u001a\u00020\u00022\u0016\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 0\u001ej\u0002`!2\u0006\u0010\"\u001a\u00020\nJ \u0010#\u001a\u00020\u00022\u0016\u0010$\u001a\u0012\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0\u001ej\u0002`'H\u0002J\u0010\u0010#\u001a\u00020\u00022\u0006\u0010(\u001a\u00020%H\u0002J\u0010\u0010#\u001a\u00020\u00022\u0006\u0010$\u001a\u00020&H\u0002J\u0016\u0010)\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\f2\u0006\u0010+\u001a\u00020,J\u001e\u0010-\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\f2\u0006\u0010.\u001a\u00020\f2\u0006\u0010+\u001a\u00020,J\u0016\u0010/\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\f2\u0006\u0010.\u001a\u00020\fR\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00060"}, m3636d2 = {"Lcom/robinhood/microgram/sdui/MicrogramRouterDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "", "Lcom/robinhood/microgram/sdui/RouterEvent;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/udf/DuxoBundle;)V", "instanceDeferred", "Lkotlinx/coroutines/CompletableDeferred;", "Lcom/robinhood/android/microgramsdui/MicrogramInstance;", "identifier", "", "screenType", "Lcom/robinhood/microgram/sdui/ScreenType;", "theme", "Lcom/robinhood/microgram/sdui/Theme;", "uiController", "Lcom/robinhood/android/microgramsdui/control/UiController;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendMessage", "block", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;)V", "onCleared", "initRouter", "initialScreenData", "Lcom/robinhood/android/shared/serverui/utils/UiObject;", "Lcom/robinhood/microgram/sdui/InitialScreenData;", "Lmicrogram/ui/v1/InitialScreenDataDto;", "Lcom/robinhood/microgram/sdui/AnyInitialScreenData;", "instance", "emitEvent", "state", "Lcom/robinhood/microgram/sdui/RouterMessage;", "Lmicrogram/ui/v1/RouterOutboundDto;", "Lcom/robinhood/microgram/sdui/AnyRouterMessage;", "event", "onAlertAction", "routerIdentifier", "action", "Lcom/robinhood/microgram/sdui/MicrogramAction;", "onToastAction", "toastId", "onToastDismissed", "feature-microgram-sdui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class MicrogramRouterDuxo extends BaseDuxo5<Unit, MicrogramRouterDuxo2> {
    public static final int $stable = 8;
    private String identifier;
    private final CompletableDeferred<MicrogramManager2> instanceDeferred;
    private RouterMessage5 screenType;
    private StandardScreen5 theme;

    /* compiled from: MicrogramRouterDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.microgram.sdui.MicrogramRouterDuxo", m3645f = "MicrogramRouterDuxo.kt", m3646l = {37, 37}, m3647m = "uiController")
    /* renamed from: com.robinhood.microgram.sdui.MicrogramRouterDuxo$uiController$1 */
    static final class C350071 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C350071(Continuation<? super C350071> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MicrogramRouterDuxo.this.uiController(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MicrogramRouterDuxo(DuxoBundle duxoBundle) {
        super(Unit.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.instanceDeferred = CompletableDeferred3.CompletableDeferred$default(null, 1, null);
        this.theme = StandardScreen5.DEFAULT;
        getLifecycleScope().repeatOnLifecycle(LifecycleState.CREATED, new C350011(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object uiController(Continuation<? super UiController> continuation) {
        C350071 c350071;
        UiController.Companion companion;
        if (continuation instanceof C350071) {
            c350071 = (C350071) continuation;
            int i = c350071.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c350071.label = i - Integer.MIN_VALUE;
            } else {
                c350071 = new C350071(continuation);
            }
        }
        Object objAwait = c350071.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c350071.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objAwait);
            companion = UiController.INSTANCE;
            CompletableDeferred<MicrogramManager2> completableDeferred = this.instanceDeferred;
            c350071.L$0 = companion;
            c350071.label = 1;
            objAwait = completableDeferred.await(c350071);
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
        companion = (UiController.Companion) c350071.L$0;
        ResultKt.throwOnFailure(objAwait);
        c350071.L$0 = null;
        c350071.label = 2;
        Object objUiController = companion.uiController((MicrogramManager2) objAwait, c350071);
        return objUiController == coroutine_suspended ? coroutine_suspended : objUiController;
    }

    /* compiled from: MicrogramRouterDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.microgram.sdui.MicrogramRouterDuxo$1", m3645f = "MicrogramRouterDuxo.kt", m3646l = {41, 44}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.microgram.sdui.MicrogramRouterDuxo$1 */
    static final class C350011 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C350011(Continuation<? super C350011> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MicrogramRouterDuxo.this.new C350011(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C350011) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                MicrogramRouterDuxo microgramRouterDuxo = MicrogramRouterDuxo.this;
                this.label = 1;
                obj = microgramRouterDuxo.uiController(this);
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
            String str = MicrogramRouterDuxo.this.identifier;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("identifier");
                str = null;
            }
            SharedFlow<UiObject<RouterMessage, RouterOutboundDto>> events = uiController.routerView(str).getEvents();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(MicrogramRouterDuxo.this);
            this.label = 2;
        }

        /* compiled from: MicrogramRouterDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.microgram.sdui.MicrogramRouterDuxo$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ MicrogramRouterDuxo $tmp0;

            AnonymousClass1(MicrogramRouterDuxo microgramRouterDuxo) {
                this.$tmp0 = microgramRouterDuxo;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, MicrogramRouterDuxo.class, "emitEvent", "emitEvent(Lcom/robinhood/android/shared/serverui/utils/UiObject;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(UiObject<? extends RouterMessage, RouterOutboundDto> uiObject, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$emitEvent = C350011.invokeSuspend$emitEvent(this.$tmp0, uiObject, continuation);
                return objInvokeSuspend$emitEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$emitEvent : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((UiObject<? extends RouterMessage, RouterOutboundDto>) obj, (Continuation<? super Unit>) continuation);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$emitEvent(MicrogramRouterDuxo microgramRouterDuxo, UiObject uiObject, Continuation continuation) {
            microgramRouterDuxo.emitEvent((UiObject<? extends RouterMessage, RouterOutboundDto>) uiObject);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: MicrogramRouterDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.microgram.sdui.MicrogramRouterDuxo$sendMessage$1", m3645f = "MicrogramRouterDuxo.kt", m3646l = {50, 50}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.microgram.sdui.MicrogramRouterDuxo$sendMessage$1 */
    static final class C350061 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<UiController, Continuation<? super Unit>, Object> $block;
        Object L$0;
        int label;
        final /* synthetic */ MicrogramRouterDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C350061(Function2<? super UiController, ? super Continuation<? super Unit>, ? extends Object> function2, MicrogramRouterDuxo microgramRouterDuxo, Continuation<? super C350061> continuation) {
            super(2, continuation);
            this.$block = function2;
            this.this$0 = microgramRouterDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C350061(this.$block, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C350061) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                MicrogramRouterDuxo microgramRouterDuxo = this.this$0;
                this.L$0 = function2;
                this.label = 1;
                obj = microgramRouterDuxo.uiController(this);
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
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C350061(block, this, null), 3, null);
    }

    /* compiled from: MicrogramRouterDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "instance", "Lcom/robinhood/android/microgramsdui/MicrogramInstance;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.microgram.sdui.MicrogramRouterDuxo$onCleared$1", m3645f = "MicrogramRouterDuxo.kt", m3646l = {57, 57}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.microgram.sdui.MicrogramRouterDuxo$onCleared$1 */
    static final class C350031 extends ContinuationImpl7 implements Function2<MicrogramManager2, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C350031(Continuation<? super C350031> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C350031 c350031 = MicrogramRouterDuxo.this.new C350031(continuation);
            c350031.L$0 = obj;
            return c350031;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MicrogramManager2 microgramManager2, Continuation<? super Unit> continuation) {
            return ((C350031) create(microgramManager2, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
        
            if (r5.notifyRouterTornDown(r1, r4) == r0) goto L18;
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
                MicrogramManager2 microgramManager2 = (MicrogramManager2) this.L$0;
                UiController.Companion companion = UiController.INSTANCE;
                this.label = 1;
                obj = companion.uiController(microgramManager2, this);
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
            ResultKt.throwOnFailure(obj);
            UiController uiController = (UiController) obj;
            String str = MicrogramRouterDuxo.this.identifier;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("identifier");
                str = null;
            }
            this.label = 2;
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, androidx.lifecycle.ViewModel
    public void onCleared() {
        Lifecycle5.performCleanupAsync(this.instanceDeferred, new C350031(null));
        super.onCleared();
    }

    public final void initRouter(UiObject<InitialScreenData, InitialScreenDataDto> initialScreenData, MicrogramManager2 instance) {
        Intrinsics.checkNotNullParameter(initialScreenData, "initialScreenData");
        Intrinsics.checkNotNullParameter(instance, "instance");
        this.identifier = InitialScreenData2.getRouterIdentifier(initialScreenData);
        this.screenType = InitialScreenData2.getScreenType(initialScreenData);
        this.theme = InitialScreenData2.getTheme(initialScreenData);
        this.instanceDeferred.complete(instance);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void emitEvent(UiObject<? extends RouterMessage, RouterOutboundDto> state) {
        if (state instanceof UiObject.Legacy) {
            emitEvent((RouterMessage) ((UiObject.Legacy) state).getValue());
        } else {
            if (!(state instanceof UiObject.Idl)) {
                throw new NoWhenBranchMatchedException();
            }
            emitEvent((RouterOutboundDto) ((UiObject.Idl) state).getValue());
        }
    }

    private final void emitEvent(RouterMessage event) {
        if (event instanceof RouterMessage.DismissAll) {
            submit(MicrogramRouterDuxo2.DismissAll.INSTANCE);
            return;
        }
        if (event instanceof RouterMessage.DismissBottomSheet) {
            submit(MicrogramRouterDuxo2.DismissBottomSheet.INSTANCE);
            return;
        }
        if (event instanceof RouterMessage.DismissScreen) {
            submit(MicrogramRouterDuxo2.DismissScreen.INSTANCE);
            return;
        }
        if (event instanceof RouterMessage.PresentAlert) {
            submit(new MicrogramRouterDuxo2.PresentAlert(new UiObject.Legacy(((RouterMessage.PresentAlert) event).getAlertContent())));
            return;
        }
        if (event instanceof RouterMessage.PresentBottomSheet) {
            submit(new MicrogramRouterDuxo2.PresentBottomSheet(((RouterMessage.PresentBottomSheet) event).getIdentifier()));
            return;
        }
        if (event instanceof RouterMessage.PushScreen) {
            RouterMessage.PushScreen pushScreen = (RouterMessage.PushScreen) event;
            submit(new MicrogramRouterDuxo2.PushScreen(pushScreen.getIdentifier(), pushScreen.getEncodedInitialContent(), pushScreen.getScreenType(), this.theme));
            return;
        }
        if (event instanceof RouterMessage.ShowRouter) {
            submit(new MicrogramRouterDuxo2.ShowRouter(new UiObject.Legacy(((RouterMessage.ShowRouter) event).getData())));
            return;
        }
        if (event instanceof RouterMessage.OpenDeeplink) {
            RouterMessage.OpenDeeplink openDeeplink = (RouterMessage.OpenDeeplink) event;
            submit(new MicrogramRouterDuxo2.OpenDeeplink(openDeeplink.getLink(), new UiObject.Legacy(openDeeplink.getNavigationType())));
        } else if (event instanceof RouterMessage.PresentSystemDefaultShareLink) {
            submit(new MicrogramRouterDuxo2.PresentSystemDefaultShareLink(((RouterMessage.PresentSystemDefaultShareLink) event).getLink()));
        } else if (event instanceof RouterMessage.PresentSystemDefaultShareContents) {
            submit(new MicrogramRouterDuxo2.PresentSystemDefaultShareLink(CollectionsKt.joinToString$default(((RouterMessage.PresentSystemDefaultShareContents) event).getContents(), PlaceholderUtils.XXShortPlaceholderText, null, null, 0, null, null, 62, null)));
        } else {
            if (!(event instanceof RouterMessage.PresentToast)) {
                throw new NoWhenBranchMatchedException();
            }
            submit(new MicrogramRouterDuxo2.PresentToast(new UiObject.Legacy(((RouterMessage.PresentToast) event).getToastData())));
        }
    }

    private final void emitEvent(RouterOutboundDto state) {
        RouterOutboundDto.ConcreteDto concrete = state.getConcrete();
        if (concrete instanceof RouterOutboundDto.ConcreteDto.DismissAll) {
            submit(MicrogramRouterDuxo2.DismissAll.INSTANCE);
            return;
        }
        if (concrete instanceof RouterOutboundDto.ConcreteDto.DismissScreen) {
            submit(MicrogramRouterDuxo2.DismissScreen.INSTANCE);
            return;
        }
        if (concrete instanceof RouterOutboundDto.ConcreteDto.PresentAlert) {
            AlertDto alert = ((RouterOutboundDto.ConcreteDto.PresentAlert) concrete).getValue().getAlert();
            if (alert == null) {
                alert = AlertDto.INSTANCE.getZeroValue();
            }
            submit(new MicrogramRouterDuxo2.PresentAlert(new UiObject.Idl(alert)));
            return;
        }
        if (concrete instanceof RouterOutboundDto.ConcreteDto.PresentBottomSheet) {
            submit(new MicrogramRouterDuxo2.PresentBottomSheet(((RouterOutboundDto.ConcreteDto.PresentBottomSheet) concrete).getValue().getIdentifier()));
            return;
        }
        if (concrete instanceof RouterOutboundDto.ConcreteDto.PushScreen) {
            RouterOutboundDto.ConcreteDto.PushScreen pushScreen = (RouterOutboundDto.ConcreteDto.PushScreen) concrete;
            submit(new MicrogramRouterDuxo2.PushScreen(pushScreen.getValue().getIdentifier(), pushScreen.getValue().getEncoded_initial_content(), RouterMessage4.getLegacyScreenType(pushScreen.getValue()), this.theme));
            return;
        }
        if (concrete instanceof RouterOutboundDto.ConcreteDto.ShowRouter) {
            InitialScreenDataDto data = ((RouterOutboundDto.ConcreteDto.ShowRouter) concrete).getValue().getData();
            if (data == null) {
                data = InitialScreenDataDto.INSTANCE.getZeroValue();
            }
            submit(new MicrogramRouterDuxo2.ShowRouter(new UiObject.Idl(data)));
            return;
        }
        if (concrete instanceof RouterOutboundDto.ConcreteDto.OpenDeeplink) {
            RouterOutboundDto.ConcreteDto.OpenDeeplink openDeeplink = (RouterOutboundDto.ConcreteDto.OpenDeeplink) concrete;
            submit(new MicrogramRouterDuxo2.OpenDeeplink(Uri.parse(openDeeplink.getValue().getLink()), new UiObject.Idl(openDeeplink.getValue().getNavigation_type())));
            return;
        }
        if (concrete instanceof RouterOutboundDto.ConcreteDto.PresentSystemDefaultShareLink) {
            submit(new MicrogramRouterDuxo2.PresentSystemDefaultShareLink(((RouterOutboundDto.ConcreteDto.PresentSystemDefaultShareLink) concrete).getValue().getLink()));
            return;
        }
        if (concrete instanceof RouterOutboundDto.ConcreteDto.PresentSystemDefaultShareContents) {
            submit(new MicrogramRouterDuxo2.PresentSystemDefaultShareLink(CollectionsKt.joinToString$default(((RouterOutboundDto.ConcreteDto.PresentSystemDefaultShareContents) concrete).getValue().getContents(), PlaceholderUtils.XXShortPlaceholderText, null, null, 0, null, null, 62, null)));
            return;
        }
        if (!(concrete instanceof RouterOutboundDto.ConcreteDto.PresentToast)) {
            if (concrete != null) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            ToastDto toast = ((RouterOutboundDto.ConcreteDto.PresentToast) concrete).getValue().getToast();
            if (toast == null) {
                toast = ToastDto.INSTANCE.getZeroValue();
            }
            submit(new MicrogramRouterDuxo2.PresentToast(new UiObject.Idl(toast)));
        }
    }

    /* compiled from: MicrogramRouterDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lcom/robinhood/android/microgramsdui/control/UiController;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.microgram.sdui.MicrogramRouterDuxo$onAlertAction$1", m3645f = "MicrogramRouterDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_FALLBACK_INSTITUTION_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.microgram.sdui.MicrogramRouterDuxo$onAlertAction$1 */
    static final class C350021 extends ContinuationImpl7 implements Function2<UiController, Continuation<? super Unit>, Object> {
        final /* synthetic */ MicrogramAction $action;
        final /* synthetic */ String $routerIdentifier;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C350021(String str, MicrogramAction microgramAction, Continuation<? super C350021> continuation) {
            super(2, continuation);
            this.$routerIdentifier = str;
            this.$action = microgramAction;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C350021 c350021 = new C350021(this.$routerIdentifier, this.$action, continuation);
            c350021.L$0 = obj;
            return c350021;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(UiController uiController, Continuation<? super Unit> continuation) {
            return ((C350021) create(uiController, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                UiController uiController = (UiController) this.L$0;
                String str = this.$routerIdentifier;
                String identifier = this.$action.getIdentifier();
                this.label = 1;
                if (uiController.notifyRouterAlertActionTriggered(str, identifier, this) == coroutine_suspended) {
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

    public final void onAlertAction(String routerIdentifier, MicrogramAction action) {
        Intrinsics.checkNotNullParameter(routerIdentifier, "routerIdentifier");
        Intrinsics.checkNotNullParameter(action, "action");
        sendMessage(new C350021(routerIdentifier, action, null));
    }

    /* compiled from: MicrogramRouterDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lcom/robinhood/android/microgramsdui/control/UiController;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.microgram.sdui.MicrogramRouterDuxo$onToastAction$1", m3645f = "MicrogramRouterDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_ETH_WITH_PLAID_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.microgram.sdui.MicrogramRouterDuxo$onToastAction$1 */
    static final class C350041 extends ContinuationImpl7 implements Function2<UiController, Continuation<? super Unit>, Object> {
        final /* synthetic */ MicrogramAction $action;
        final /* synthetic */ String $routerIdentifier;
        final /* synthetic */ String $toastId;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C350041(String str, String str2, MicrogramAction microgramAction, Continuation<? super C350041> continuation) {
            super(2, continuation);
            this.$routerIdentifier = str;
            this.$toastId = str2;
            this.$action = microgramAction;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C350041 c350041 = new C350041(this.$routerIdentifier, this.$toastId, this.$action, continuation);
            c350041.L$0 = obj;
            return c350041;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(UiController uiController, Continuation<? super Unit> continuation) {
            return ((C350041) create(uiController, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                UiController uiController = (UiController) this.L$0;
                String str = this.$routerIdentifier;
                String str2 = this.$toastId;
                String identifier = this.$action.getIdentifier();
                this.label = 1;
                if (uiController.notifyRouterToastActionTriggered(str, str2, identifier, this) == coroutine_suspended) {
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

    public final void onToastAction(String routerIdentifier, String toastId, MicrogramAction action) {
        Intrinsics.checkNotNullParameter(routerIdentifier, "routerIdentifier");
        Intrinsics.checkNotNullParameter(toastId, "toastId");
        Intrinsics.checkNotNullParameter(action, "action");
        sendMessage(new C350041(routerIdentifier, toastId, action, null));
    }

    /* compiled from: MicrogramRouterDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lcom/robinhood/android/microgramsdui/control/UiController;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.microgram.sdui.MicrogramRouterDuxo$onToastDismissed$1", m3645f = "MicrogramRouterDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.microgram.sdui.MicrogramRouterDuxo$onToastDismissed$1 */
    static final class C350051 extends ContinuationImpl7 implements Function2<UiController, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $routerIdentifier;
        final /* synthetic */ String $toastId;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C350051(String str, String str2, Continuation<? super C350051> continuation) {
            super(2, continuation);
            this.$routerIdentifier = str;
            this.$toastId = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C350051 c350051 = new C350051(this.$routerIdentifier, this.$toastId, continuation);
            c350051.L$0 = obj;
            return c350051;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(UiController uiController, Continuation<? super Unit> continuation) {
            return ((C350051) create(uiController, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                UiController uiController = (UiController) this.L$0;
                String str = this.$routerIdentifier;
                String str2 = this.$toastId;
                this.label = 1;
                if (uiController.notifyRouterToastDismissed(str, str2, this) == coroutine_suspended) {
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

    public final void onToastDismissed(String routerIdentifier, String toastId) {
        Intrinsics.checkNotNullParameter(routerIdentifier, "routerIdentifier");
        Intrinsics.checkNotNullParameter(toastId, "toastId");
        sendMessage(new C350051(routerIdentifier, toastId, null));
    }
}
