package com.robinhood.microgram.sdui;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.microgramsdui.Lifecycle5;
import com.robinhood.android.microgramsdui.MicrogramManager2;
import com.robinhood.android.microgramsdui.control.UiController;
import com.robinhood.android.shared.serverui.utils.UiObject;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.microgram.sdui.MicrogramScreenDuxo2;
import com.robinhood.microgram.sdui.MicrogramScreenDuxo3;
import com.robinhood.models.serverdriven.experimental.api.ComponentState;
import dispatch.core.Launch;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KType;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferred3;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import microgram.p507ui.p508v1.screen_events.HtmlCanvasAvailableAreaMessageDto;
import microgram.p507ui.p508v1.screen_events.InvokeJavascriptRequestDto;
import microgram.p507ui.p508v1.screen_events.ScrollRequestDto;
import microgram.p507ui.p508v1.screen_events.ScrollToBottomRequestDto;
import microgram.p507ui.p508v1.screen_events.ShareScreenshotRequestDto;

/* compiled from: MicrogramScreenDuxo.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u000f\u001a\u00020\u0010H\u0082@¢\u0006\u0002\u0010\u0011J6\u0010\u0012\u001a\u00020\u00132'\u0010\u0014\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0015¢\u0006\u0002\b\u0018H\u0002¢\u0006\u0002\u0010\u0019J&\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\nJ\b\u0010\u001d\u001a\u00020\u0013H\u0016J\b\u0010\u001e\u001a\u00020\u0013H\u0016J\b\u0010\u001f\u001a\u00020\u0013H\u0017J\u000e\u0010 \u001a\u00020\u00132\u0006\u0010!\u001a\u00020\"J\u001a\u0010#\u001a\u00020\u00132\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020&0%J\u0006\u0010'\u001a\u00020\u0013J\u000e\u0010(\u001a\u00020\u00132\u0006\u0010)\u001a\u00020\fJ\u000e\u0010*\u001a\u00020\u00132\u0006\u0010)\u001a\u00020+R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000¨\u0006,"}, m3636d2 = {"Lcom/robinhood/microgram/sdui/MicrogramScreenDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/microgram/sdui/ScreenViewState;", "Lcom/robinhood/microgram/sdui/ScreenEvent;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/udf/DuxoBundle;)V", "instanceDeferred", "Lkotlinx/coroutines/CompletableDeferred;", "Lcom/robinhood/android/microgramsdui/MicrogramInstance;", "identifier", "", "screenType", "Lcom/robinhood/microgram/sdui/ScreenType;", "uiController", "Lcom/robinhood/android/microgramsdui/control/UiController;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendMessage", "", "block", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;)V", "initScreen", "encodedInitialContent", "instance", "onResume", "onPause", "onCleared", "action", "microgramAction", "Lcom/robinhood/microgram/sdui/MicrogramAction;", "updateStates", "states", "", "Lcom/robinhood/models/serverdriven/experimental/api/ComponentState;", "onScrollReachedEnd", "onHtmlCanvasCustomMessage", "message", "onHtmlCanvasAvailableAreaMessage", "Lmicrogram/ui/v1/screen_events/HtmlCanvasAvailableAreaMessageDto;", "feature-microgram-sdui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class MicrogramScreenDuxo extends BaseDuxo5<MicrogramScreenDuxo3, MicrogramScreenDuxo2> {
    public static final int $stable = 8;
    private String identifier;
    private final CompletableDeferred<MicrogramManager2> instanceDeferred;
    private RouterMessage5 screenType;

    /* compiled from: MicrogramScreenDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.microgram.sdui.MicrogramScreenDuxo", m3645f = "MicrogramScreenDuxo.kt", m3646l = {69, 69}, m3647m = "uiController")
    /* renamed from: com.robinhood.microgram.sdui.MicrogramScreenDuxo$uiController$1 */
    static final class C350271 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C350271(Continuation<? super C350271> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MicrogramScreenDuxo.this.uiController(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MicrogramScreenDuxo(DuxoBundle duxoBundle) {
        super(MicrogramScreenDuxo3.Loading.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.instanceDeferred = CompletableDeferred3.CompletableDeferred$default(null, 1, null);
        getLifecycleScope().repeatOnLifecycle(LifecycleState.CREATED, new C350171(null));
    }

    /* compiled from: MicrogramScreenDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.microgram.sdui.MicrogramScreenDuxo$1", m3645f = "MicrogramScreenDuxo.kt", m3646l = {39}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.microgram.sdui.MicrogramScreenDuxo$1 */
    static final class C350171 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C350171(Continuation<? super C350171> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C350171 c350171 = MicrogramScreenDuxo.this.new C350171(continuation);
            c350171.L$0 = obj;
            return c350171;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C350171) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                MicrogramScreenDuxo microgramScreenDuxo = MicrogramScreenDuxo.this;
                this.L$0 = coroutineScope2;
                this.label = 1;
                Object objUiController = microgramScreenDuxo.uiController(this);
                if (objUiController == coroutine_suspended) {
                    return coroutine_suspended;
                }
                coroutineScope = coroutineScope2;
                obj = objUiController;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                coroutineScope = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            UiController uiController = (UiController) obj;
            String str = MicrogramScreenDuxo.this.identifier;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("identifier");
                str = null;
            }
            RouterMessage5 routerMessage5 = MicrogramScreenDuxo.this.screenType;
            if (routerMessage5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("screenType");
                routerMessage5 = null;
            }
            UiController.ScreenView screenView = uiController.screenView(str, routerMessage5);
            Launch.launchDefault$default(coroutineScope, null, null, new AnonymousClass1(screenView, MicrogramScreenDuxo.this, null), 3, null);
            Launch.launchDefault$default(coroutineScope, null, null, new AnonymousClass2(screenView, MicrogramScreenDuxo.this, null), 3, null);
            return Unit.INSTANCE;
        }

        /* compiled from: MicrogramScreenDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.microgram.sdui.MicrogramScreenDuxo$1$1", m3645f = "MicrogramScreenDuxo.kt", m3646l = {41}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.microgram.sdui.MicrogramScreenDuxo$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ UiController.ScreenView $screenView;
            int label;
            final /* synthetic */ MicrogramScreenDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(UiController.ScreenView screenView, MicrogramScreenDuxo microgramScreenDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$screenView = screenView;
                this.this$0 = microgramScreenDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$screenView, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: MicrogramScreenDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003H\n"}, m3636d2 = {"<anonymous>", "", "state", "Lcom/robinhood/android/shared/serverui/utils/UiObject;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.microgram.sdui.MicrogramScreenDuxo$1$1$1", m3645f = "MicrogramScreenDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.microgram.sdui.MicrogramScreenDuxo$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C506591 extends ContinuationImpl7 implements Function2<UiObject<?, ?>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ MicrogramScreenDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C506591(MicrogramScreenDuxo microgramScreenDuxo, Continuation<? super C506591> continuation) {
                    super(2, continuation);
                    this.this$0 = microgramScreenDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C506591 c506591 = new C506591(this.this$0, continuation);
                    c506591.L$0 = obj;
                    return c506591;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(UiObject<?, ?> uiObject, Continuation<? super Unit> continuation) {
                    return ((C506591) create(uiObject, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: MicrogramScreenDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/microgram/sdui/ScreenViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.microgram.sdui.MicrogramScreenDuxo$1$1$1$1", m3645f = "MicrogramScreenDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.microgram.sdui.MicrogramScreenDuxo$1$1$1$1, reason: invalid class name and collision with other inner class name */
                static final class C506601 extends ContinuationImpl7 implements Function2<MicrogramScreenDuxo3, Continuation<? super MicrogramScreenDuxo3>, Object> {
                    final /* synthetic */ UiObject<?, ?> $state;
                    int label;
                    final /* synthetic */ MicrogramScreenDuxo this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C506601(UiObject<?, ?> uiObject, MicrogramScreenDuxo microgramScreenDuxo, Continuation<? super C506601> continuation) {
                        super(2, continuation);
                        this.$state = uiObject;
                        this.this$0 = microgramScreenDuxo;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C506601(this.$state, this.this$0, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(MicrogramScreenDuxo3 microgramScreenDuxo3, Continuation<? super MicrogramScreenDuxo3> continuation) {
                        return ((C506601) create(microgramScreenDuxo3, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label == 0) {
                            ResultKt.throwOnFailure(obj);
                            UiObject<?, ?> uiObject = this.$state;
                            RouterMessage5 routerMessage5 = this.this$0.screenType;
                            if (routerMessage5 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("screenType");
                                routerMessage5 = null;
                            }
                            return new MicrogramScreenDuxo3.Success(uiObject, routerMessage5);
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    UiObject uiObject = (UiObject) this.L$0;
                    MicrogramScreenDuxo microgramScreenDuxo = this.this$0;
                    microgramScreenDuxo.applyMutation(new C506601(uiObject, microgramScreenDuxo, null));
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    SharedFlow<UiObject<?, ?>> state = this.$screenView.getState();
                    C506591 c506591 = new C506591(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(state, c506591, this) == coroutine_suspended) {
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

        /* compiled from: MicrogramScreenDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.microgram.sdui.MicrogramScreenDuxo$1$2", m3645f = "MicrogramScreenDuxo.kt", m3646l = {62}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.microgram.sdui.MicrogramScreenDuxo$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ UiController.ScreenView $screenView;
            int label;
            final /* synthetic */ MicrogramScreenDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(UiController.ScreenView screenView, MicrogramScreenDuxo microgramScreenDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$screenView = screenView;
                this.this$0 = microgramScreenDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.$screenView, this.this$0, continuation);
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
                    final SharedFlow<UiObject<ScreenScrollRequest, ScrollRequestDto>> scrollRequestEvents = this.$screenView.getScrollRequestEvents();
                    Flow<MicrogramScreenDuxo2.ScrollRequest.ToItem> flow = new Flow<MicrogramScreenDuxo2.ScrollRequest.ToItem>() { // from class: com.robinhood.microgram.sdui.MicrogramScreenDuxo$1$2$invokeSuspend$$inlined$map$1

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.microgram.sdui.MicrogramScreenDuxo$1$2$invokeSuspend$$inlined$map$1$2 */
                        public static final class C350132<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.microgram.sdui.MicrogramScreenDuxo$1$2$invokeSuspend$$inlined$map$1$2", m3645f = "MicrogramScreenDuxo.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.microgram.sdui.MicrogramScreenDuxo$1$2$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                    return C350132.this.emit(null, this);
                                }
                            }

                            public C350132(FlowCollector flowCollector) {
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
                                    MicrogramScreenDuxo2.ScrollRequest.ToItem toItem = new MicrogramScreenDuxo2.ScrollRequest.ToItem((UiObject) obj);
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(toItem, anonymousClass1) == coroutine_suspended) {
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
                        public Object collect(FlowCollector<? super MicrogramScreenDuxo2.ScrollRequest.ToItem> flowCollector, Continuation continuation) {
                            Object objCollect = scrollRequestEvents.collect(new C350132(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }
                    };
                    final SharedFlow<UiObject<ScreenScrollToBottomRequest, ScrollToBottomRequestDto>> scrollToBottomRequestEvents = this.$screenView.getScrollToBottomRequestEvents();
                    Flow<MicrogramScreenDuxo2.ScrollRequest.ToBottom> flow2 = new Flow<MicrogramScreenDuxo2.ScrollRequest.ToBottom>() { // from class: com.robinhood.microgram.sdui.MicrogramScreenDuxo$1$2$invokeSuspend$$inlined$map$2

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.microgram.sdui.MicrogramScreenDuxo$1$2$invokeSuspend$$inlined$map$2$2 */
                        public static final class C350142<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.microgram.sdui.MicrogramScreenDuxo$1$2$invokeSuspend$$inlined$map$2$2", m3645f = "MicrogramScreenDuxo.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.microgram.sdui.MicrogramScreenDuxo$1$2$invokeSuspend$$inlined$map$2$2$1, reason: invalid class name */
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
                                    return C350142.this.emit(null, this);
                                }
                            }

                            public C350142(FlowCollector flowCollector) {
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
                                    MicrogramScreenDuxo2.ScrollRequest.ToBottom toBottom = new MicrogramScreenDuxo2.ScrollRequest.ToBottom((UiObject) obj);
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(toBottom, anonymousClass1) == coroutine_suspended) {
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
                        public Object collect(FlowCollector<? super MicrogramScreenDuxo2.ScrollRequest.ToBottom> flowCollector, Continuation continuation) {
                            Object objCollect = scrollToBottomRequestEvents.collect(new C350142(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }
                    };
                    final SharedFlow<ShareScreenshotRequestDto> shareScreenshotRequestEvents = this.$screenView.getShareScreenshotRequestEvents();
                    Flow<MicrogramScreenDuxo2.ShareScreenshotRequest> flow3 = new Flow<MicrogramScreenDuxo2.ShareScreenshotRequest>() { // from class: com.robinhood.microgram.sdui.MicrogramScreenDuxo$1$2$invokeSuspend$$inlined$map$3

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.microgram.sdui.MicrogramScreenDuxo$1$2$invokeSuspend$$inlined$map$3$2 */
                        public static final class C350152<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.microgram.sdui.MicrogramScreenDuxo$1$2$invokeSuspend$$inlined$map$3$2", m3645f = "MicrogramScreenDuxo.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.microgram.sdui.MicrogramScreenDuxo$1$2$invokeSuspend$$inlined$map$3$2$1, reason: invalid class name */
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
                                    return C350152.this.emit(null, this);
                                }
                            }

                            public C350152(FlowCollector flowCollector) {
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
                                    UUID uuidRandomUUID = UUID.randomUUID();
                                    Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
                                    MicrogramScreenDuxo2.ShareScreenshotRequest shareScreenshotRequest = new MicrogramScreenDuxo2.ShareScreenshotRequest((ShareScreenshotRequestDto) obj, uuidRandomUUID);
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(shareScreenshotRequest, anonymousClass1) == coroutine_suspended) {
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
                        public Object collect(FlowCollector<? super MicrogramScreenDuxo2.ShareScreenshotRequest> flowCollector, Continuation continuation) {
                            Object objCollect = shareScreenshotRequestEvents.collect(new C350152(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }
                    };
                    final SharedFlow<UiObject<InvokeJavascriptRequest, InvokeJavascriptRequestDto>> invokeJavascriptRequestEvents = this.$screenView.getInvokeJavascriptRequestEvents();
                    Flow flowMerge = FlowKt.merge(flow, flow2, flow3, new Flow<MicrogramScreenDuxo2.InvokeJavascript>() { // from class: com.robinhood.microgram.sdui.MicrogramScreenDuxo$1$2$invokeSuspend$$inlined$map$4

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.microgram.sdui.MicrogramScreenDuxo$1$2$invokeSuspend$$inlined$map$4$2 */
                        public static final class C350162<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.microgram.sdui.MicrogramScreenDuxo$1$2$invokeSuspend$$inlined$map$4$2", m3645f = "MicrogramScreenDuxo.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.microgram.sdui.MicrogramScreenDuxo$1$2$invokeSuspend$$inlined$map$4$2$1, reason: invalid class name */
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
                                    return C350162.this.emit(null, this);
                                }
                            }

                            public C350162(FlowCollector flowCollector) {
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
                                    UUID uuidRandomUUID = UUID.randomUUID();
                                    Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
                                    MicrogramScreenDuxo2.InvokeJavascript invokeJavascript = new MicrogramScreenDuxo2.InvokeJavascript((UiObject) obj, uuidRandomUUID);
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(invokeJavascript, anonymousClass1) == coroutine_suspended) {
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
                        public Object collect(FlowCollector<? super MicrogramScreenDuxo2.InvokeJavascript> flowCollector, Continuation continuation) {
                            Object objCollect = invokeJavascriptRequestEvents.collect(new C350162(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }
                    });
                    AnonymousClass9 anonymousClass9 = new AnonymousClass9(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowMerge, anonymousClass9, this) == coroutine_suspended) {
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

            /* compiled from: MicrogramScreenDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "event", "Lcom/robinhood/microgram/sdui/ScreenEvent;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.microgram.sdui.MicrogramScreenDuxo$1$2$9", m3645f = "MicrogramScreenDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.microgram.sdui.MicrogramScreenDuxo$1$2$9, reason: invalid class name */
            static final class AnonymousClass9 extends ContinuationImpl7 implements Function2<MicrogramScreenDuxo2, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ MicrogramScreenDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass9(MicrogramScreenDuxo microgramScreenDuxo, Continuation<? super AnonymousClass9> continuation) {
                    super(2, continuation);
                    this.this$0 = microgramScreenDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass9 anonymousClass9 = new AnonymousClass9(this.this$0, continuation);
                    anonymousClass9.L$0 = obj;
                    return anonymousClass9;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(MicrogramScreenDuxo2 microgramScreenDuxo2, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass9) create(microgramScreenDuxo2, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.this$0.submit((MicrogramScreenDuxo2) this.L$0);
                    return Unit.INSTANCE;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object uiController(Continuation<? super UiController> continuation) {
        C350271 c350271;
        UiController.Companion companion;
        if (continuation instanceof C350271) {
            c350271 = (C350271) continuation;
            int i = c350271.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c350271.label = i - Integer.MIN_VALUE;
            } else {
                c350271 = new C350271(continuation);
            }
        }
        Object objAwait = c350271.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c350271.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objAwait);
            companion = UiController.INSTANCE;
            CompletableDeferred<MicrogramManager2> completableDeferred = this.instanceDeferred;
            c350271.L$0 = companion;
            c350271.label = 1;
            objAwait = completableDeferred.await(c350271);
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
        companion = (UiController.Companion) c350271.L$0;
        ResultKt.throwOnFailure(objAwait);
        c350271.L$0 = null;
        c350271.label = 2;
        Object objUiController = companion.uiController((MicrogramManager2) objAwait, c350271);
        return objUiController == coroutine_suspended ? coroutine_suspended : objUiController;
    }

    /* compiled from: MicrogramScreenDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.microgram.sdui.MicrogramScreenDuxo$sendMessage$1", m3645f = "MicrogramScreenDuxo.kt", m3646l = {73, 73}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.microgram.sdui.MicrogramScreenDuxo$sendMessage$1 */
    static final class C350261 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<UiController, Continuation<? super Unit>, Object> $block;
        Object L$0;
        int label;
        final /* synthetic */ MicrogramScreenDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C350261(Function2<? super UiController, ? super Continuation<? super Unit>, ? extends Object> function2, MicrogramScreenDuxo microgramScreenDuxo, Continuation<? super C350261> continuation) {
            super(2, continuation);
            this.$block = function2;
            this.this$0 = microgramScreenDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C350261(this.$block, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C350261) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                MicrogramScreenDuxo microgramScreenDuxo = this.this$0;
                this.L$0 = function2;
                this.label = 1;
                obj = microgramScreenDuxo.uiController(this);
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
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C350261(block, this, null), 3, null);
    }

    public final void initScreen(String identifier, String encodedInitialContent, RouterMessage5 screenType, MicrogramManager2 instance) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(encodedInitialContent, "encodedInitialContent");
        Intrinsics.checkNotNullParameter(screenType, "screenType");
        Intrinsics.checkNotNullParameter(instance, "instance");
        this.identifier = identifier;
        this.screenType = screenType;
        this.instanceDeferred.complete(instance);
        applyMutation(new C350191(screenType, this, encodedInitialContent, null));
    }

    /* compiled from: MicrogramScreenDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/microgram/sdui/ScreenViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.microgram.sdui.MicrogramScreenDuxo$initScreen$1", m3645f = "MicrogramScreenDuxo.kt", m3646l = {90, 93}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.microgram.sdui.MicrogramScreenDuxo$initScreen$1 */
    static final class C350191 extends ContinuationImpl7 implements Function2<MicrogramScreenDuxo3, Continuation<? super MicrogramScreenDuxo3>, Object> {
        final /* synthetic */ String $encodedInitialContent;
        final /* synthetic */ RouterMessage5 $screenType;
        int label;
        final /* synthetic */ MicrogramScreenDuxo this$0;

        /* compiled from: MicrogramScreenDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.microgram.sdui.MicrogramScreenDuxo$initScreen$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[RouterMessage5.values().length];
                try {
                    iArr[RouterMessage5.CENTERED_CONTENT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[RouterMessage5.LIST.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[RouterMessage5.HTML_CANVAS_CONTENT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C350191(RouterMessage5 routerMessage5, MicrogramScreenDuxo microgramScreenDuxo, String str, Continuation<? super C350191> continuation) {
            super(2, continuation);
            this.$screenType = routerMessage5;
            this.this$0 = microgramScreenDuxo;
            this.$encodedInitialContent = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C350191(this.$screenType, this.this$0, this.$encodedInitialContent, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MicrogramScreenDuxo3 microgramScreenDuxo3, Continuation<? super MicrogramScreenDuxo3> continuation) {
            return ((C350191) create(microgramScreenDuxo3, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
        
            if (r6 == r0) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
        
            if (r6 == r0) goto L27;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            UiObject uiObjectDecodeStandardScreenContent;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                int i2 = WhenMappings.$EnumSwitchMapping$0[this.$screenType.ordinal()];
                if (i2 == 1 || i2 == 2) {
                    MicrogramScreenDuxo microgramScreenDuxo = this.this$0;
                    this.label = 1;
                    obj = microgramScreenDuxo.uiController(this);
                } else {
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    MicrogramScreenDuxo microgramScreenDuxo2 = this.this$0;
                    this.label = 2;
                    obj = microgramScreenDuxo2.uiController(this);
                }
                return coroutine_suspended;
            }
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
                uiObjectDecodeStandardScreenContent = ((UiController) obj).decodeStandardScreenContent(this.$encodedInitialContent);
                if (uiObjectDecodeStandardScreenContent == null) {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                uiObjectDecodeStandardScreenContent = ((UiController) obj).decodeHtmlCanvasScreenContent(this.$encodedInitialContent);
                if (uiObjectDecodeStandardScreenContent == null) {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            return new MicrogramScreenDuxo3.Success(uiObjectDecodeStandardScreenContent, this.$screenType);
        }
    }

    /* compiled from: MicrogramScreenDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lcom/robinhood/android/microgramsdui/control/UiController;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.microgram.sdui.MicrogramScreenDuxo$onResume$1", m3645f = "MicrogramScreenDuxo.kt", m3646l = {104}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.microgram.sdui.MicrogramScreenDuxo$onResume$1 */
    static final class C350241 extends ContinuationImpl7 implements Function2<UiController, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C350241(Continuation<? super C350241> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C350241 c350241 = MicrogramScreenDuxo.this.new C350241(continuation);
            c350241.L$0 = obj;
            return c350241;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(UiController uiController, Continuation<? super Unit> continuation) {
            return ((C350241) create(uiController, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                UiController uiController = (UiController) this.L$0;
                String str = MicrogramScreenDuxo.this.identifier;
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
        sendMessage(new C350241(null));
    }

    /* compiled from: MicrogramScreenDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lcom/robinhood/android/microgramsdui/control/UiController;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.microgram.sdui.MicrogramScreenDuxo$onPause$1", m3645f = "MicrogramScreenDuxo.kt", m3646l = {109}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.microgram.sdui.MicrogramScreenDuxo$onPause$1 */
    static final class C350231 extends ContinuationImpl7 implements Function2<UiController, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C350231(Continuation<? super C350231> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C350231 c350231 = MicrogramScreenDuxo.this.new C350231(continuation);
            c350231.L$0 = obj;
            return c350231;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(UiController uiController, Continuation<? super Unit> continuation) {
            return ((C350231) create(uiController, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                UiController uiController = (UiController) this.L$0;
                String str = MicrogramScreenDuxo.this.identifier;
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
        sendMessage(new C350231(null));
    }

    /* compiled from: MicrogramScreenDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "instance", "Lcom/robinhood/android/microgramsdui/MicrogramInstance;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.microgram.sdui.MicrogramScreenDuxo$onCleared$1", m3645f = "MicrogramScreenDuxo.kt", m3646l = {115, 115}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.microgram.sdui.MicrogramScreenDuxo$onCleared$1 */
    static final class C350201 extends ContinuationImpl7 implements Function2<MicrogramManager2, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C350201(Continuation<? super C350201> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C350201 c350201 = MicrogramScreenDuxo.this.new C350201(continuation);
            c350201.L$0 = obj;
            return c350201;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MicrogramManager2 microgramManager2, Continuation<? super Unit> continuation) {
            return ((C350201) create(microgramManager2, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
        
            if (r5.notifyScreenTornDown(r1, r4) == r0) goto L18;
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
            String str = MicrogramScreenDuxo.this.identifier;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("identifier");
                str = null;
            }
            this.label = 2;
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, androidx.lifecycle.ViewModel
    public void onCleared() {
        Lifecycle5.performCleanupAsync(this.instanceDeferred, new C350201(null));
        super.onCleared();
    }

    /* compiled from: MicrogramScreenDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lcom/robinhood/android/microgramsdui/control/UiController;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.microgram.sdui.MicrogramScreenDuxo$action$1", m3645f = "MicrogramScreenDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.microgram.sdui.MicrogramScreenDuxo$action$1 */
    static final class C350181 extends ContinuationImpl7 implements Function2<UiController, Continuation<? super Unit>, Object> {
        final /* synthetic */ MicrogramAction $microgramAction;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C350181(MicrogramAction microgramAction, Continuation<? super C350181> continuation) {
            super(2, continuation);
            this.$microgramAction = microgramAction;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C350181 c350181 = MicrogramScreenDuxo.this.new C350181(this.$microgramAction, continuation);
            c350181.L$0 = obj;
            return c350181;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(UiController uiController, Continuation<? super Unit> continuation) {
            return ((C350181) create(uiController, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                UiController uiController = (UiController) this.L$0;
                String str = MicrogramScreenDuxo.this.identifier;
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
        sendMessage(new C350181(microgramAction, null));
    }

    /* compiled from: MicrogramScreenDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lcom/robinhood/android/microgramsdui/control/UiController;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.microgram.sdui.MicrogramScreenDuxo$updateStates$1", m3645f = "MicrogramScreenDuxo.kt", m3646l = {125}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.microgram.sdui.MicrogramScreenDuxo$updateStates$1 */
    static final class C350281 extends ContinuationImpl7 implements Function2<UiController, Continuation<? super Unit>, Object> {
        final /* synthetic */ Map<String, ComponentState> $states;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C350281(Map<String, ? extends ComponentState> map, Continuation<? super C350281> continuation) {
            super(2, continuation);
            this.$states = map;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C350281 c350281 = MicrogramScreenDuxo.this.new C350281(this.$states, continuation);
            c350281.L$0 = obj;
            return c350281;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(UiController uiController, Continuation<? super Unit> continuation) {
            return ((C350281) create(uiController, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                UiController uiController = (UiController) this.L$0;
                String str = MicrogramScreenDuxo.this.identifier;
                if (str == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("identifier");
                    str = null;
                }
                Map<String, ComponentState> map = this.$states;
                this.label = 1;
                if (uiController.notifyScreenStatesUpdated(str, map, this) == coroutine_suspended) {
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

    public final void updateStates(Map<String, ? extends ComponentState> states) {
        Intrinsics.checkNotNullParameter(states, "states");
        sendMessage(new C350281(states, null));
    }

    /* compiled from: MicrogramScreenDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lcom/robinhood/android/microgramsdui/control/UiController;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.microgram.sdui.MicrogramScreenDuxo$onScrollReachedEnd$1", m3645f = "MicrogramScreenDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.microgram.sdui.MicrogramScreenDuxo$onScrollReachedEnd$1 */
    static final class C350251 extends ContinuationImpl7 implements Function2<UiController, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C350251(Continuation<? super C350251> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C350251 c350251 = MicrogramScreenDuxo.this.new C350251(continuation);
            c350251.L$0 = obj;
            return c350251;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(UiController uiController, Continuation<? super Unit> continuation) {
            return ((C350251) create(uiController, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                UiController uiController = (UiController) this.L$0;
                String str = MicrogramScreenDuxo.this.identifier;
                if (str == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("identifier");
                    str = null;
                }
                MicrogramScreenEventMessages5 microgramScreenEventMessages5 = MicrogramScreenEventMessages5.INSTANCE;
                KType kTypeTypeOf = Reflection.typeOf(MicrogramScreenEventMessages5.class);
                this.label = 1;
                if (uiController.notifyCustomScreenEvent(kTypeTypeOf, str, microgramScreenEventMessages5, this) == coroutine_suspended) {
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

    public final void onScrollReachedEnd() {
        sendMessage(new C350251(null));
    }

    /* compiled from: MicrogramScreenDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lcom/robinhood/android/microgramsdui/control/UiController;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.microgram.sdui.MicrogramScreenDuxo$onHtmlCanvasCustomMessage$1", m3645f = "MicrogramScreenDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.microgram.sdui.MicrogramScreenDuxo$onHtmlCanvasCustomMessage$1 */
    static final class C350221 extends ContinuationImpl7 implements Function2<UiController, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $message;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C350221(String str, Continuation<? super C350221> continuation) {
            super(2, continuation);
            this.$message = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C350221 c350221 = MicrogramScreenDuxo.this.new C350221(this.$message, continuation);
            c350221.L$0 = obj;
            return c350221;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(UiController uiController, Continuation<? super Unit> continuation) {
            return ((C350221) create(uiController, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                UiController uiController = (UiController) this.L$0;
                String str = MicrogramScreenDuxo.this.identifier;
                if (str == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("identifier");
                    str = null;
                }
                HtmlCanvasCustomMessage htmlCanvasCustomMessage = new HtmlCanvasCustomMessage(this.$message);
                KType kTypeTypeOf = Reflection.typeOf(HtmlCanvasCustomMessage.class);
                this.label = 1;
                if (uiController.notifyCustomScreenEvent(kTypeTypeOf, str, htmlCanvasCustomMessage, this) == coroutine_suspended) {
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

    public final void onHtmlCanvasCustomMessage(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        sendMessage(new C350221(message, null));
    }

    /* compiled from: MicrogramScreenDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lcom/robinhood/android/microgramsdui/control/UiController;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.microgram.sdui.MicrogramScreenDuxo$onHtmlCanvasAvailableAreaMessage$1", m3645f = "MicrogramScreenDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.microgram.sdui.MicrogramScreenDuxo$onHtmlCanvasAvailableAreaMessage$1 */
    static final class C350211 extends ContinuationImpl7 implements Function2<UiController, Continuation<? super Unit>, Object> {
        final /* synthetic */ HtmlCanvasAvailableAreaMessageDto $message;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C350211(HtmlCanvasAvailableAreaMessageDto htmlCanvasAvailableAreaMessageDto, Continuation<? super C350211> continuation) {
            super(2, continuation);
            this.$message = htmlCanvasAvailableAreaMessageDto;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C350211 c350211 = MicrogramScreenDuxo.this.new C350211(this.$message, continuation);
            c350211.L$0 = obj;
            return c350211;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(UiController uiController, Continuation<? super Unit> continuation) {
            return ((C350211) create(uiController, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                UiController uiController = (UiController) this.L$0;
                String str = MicrogramScreenDuxo.this.identifier;
                if (str == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("identifier");
                    str = null;
                }
                HtmlCanvasAvailableAreaMessageDto htmlCanvasAvailableAreaMessageDto = this.$message;
                this.label = 1;
                if (uiController.notifyHtmlCanvasAvailableArea(str, htmlCanvasAvailableAreaMessageDto, this) == coroutine_suspended) {
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

    public final void onHtmlCanvasAvailableAreaMessage(HtmlCanvasAvailableAreaMessageDto message) {
        Intrinsics.checkNotNullParameter(message, "message");
        sendMessage(new C350211(message, null));
    }
}
