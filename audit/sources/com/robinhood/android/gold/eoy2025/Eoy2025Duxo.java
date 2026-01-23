package com.robinhood.android.gold.eoy2025;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.engagement.eoygiveaway.EoyGiveawayInteractionHandler;
import com.robinhood.android.engagement.eoygiveaway.EoyGiveawayJavascriptBridge;
import com.robinhood.android.engagement.eoygiveaway.EoyGiveawayManager;
import com.robinhood.android.gold.contracts.Eoy2025IntentKey;
import com.robinhood.android.gold.eoy2025.Eoy2025Event;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import dispatch.core.Launch;
import eoy_giveaway.p456v1.EndOfYearGiveawayService;
import eoy_giveaway.p456v1.GetProgramViewModelRequestDto;
import eoy_giveaway.p456v1.GetProgramViewModelResponseDto;
import eoy_giveaway.p456v1.HandleCanvasMessageRequestDto;
import eoy_giveaway.p456v1.ShowHolidayHubViewRequestDto;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import timber.log.Timber;

/* compiled from: Eoy2025Duxo.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 ,2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0001,B)\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020 H\u0016J\u0006\u0010\"\u001a\u00020 J\u0010\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020\u0019H\u0016J\u0010\u0010%\u001a\u00020 2\u0006\u0010&\u001a\u00020\u0019H\u0016J\u001e\u0010'\u001a\u00020 2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00190)2\u0006\u0010*\u001a\u00020+H\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006-"}, m3636d2 = {"Lcom/robinhood/android/gold/eoy2025/Eoy2025Duxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/gold/eoy2025/Eoy2025ViewState;", "Lcom/robinhood/android/gold/eoy2025/Eoy2025Event;", "Lcom/robinhood/android/udf/HasSavedState;", "Lcom/robinhood/android/engagement/eoygiveaway/EoyGiveawayInteractionHandler;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "eoyGiveawayManager", "Lcom/robinhood/android/engagement/eoygiveaway/EoyGiveawayManager;", "javascriptBridge", "Lcom/robinhood/android/engagement/eoygiveaway/EoyGiveawayJavascriptBridge;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/android/engagement/eoygiveaway/EoyGiveawayManager;Lcom/robinhood/android/engagement/eoygiveaway/EoyGiveawayJavascriptBridge;Landroidx/lifecycle/SavedStateHandle;)V", "getEoyGiveawayManager", "()Lcom/robinhood/android/engagement/eoygiveaway/EoyGiveawayManager;", "getJavascriptBridge", "()Lcom/robinhood/android/engagement/eoygiveaway/EoyGiveawayJavascriptBridge;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "clientService", "Leoy_giveaway/v1/EndOfYearGiveawayService;", "value", "", "currentViewId", "getCurrentViewId", "()Ljava/lang/String;", "setCurrentViewId", "(Ljava/lang/String;)V", "onCreate", "", "onDestroy", "showHolidayHubView", "invokeJavascript", "script", "dismissProgramView", "viewId", "showSystemShareScreen", "contents", "", "includeCanvasImage", "", "Companion", "feature-eoy-2025_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class Eoy2025Duxo extends BaseDuxo5<Eoy2025ViewState, Eoy2025Event> implements HasSavedState, EoyGiveawayInteractionHandler {
    private final EndOfYearGiveawayService clientService;
    private String currentViewId;
    private final EoyGiveawayManager eoyGiveawayManager;
    private final EoyGiveawayJavascriptBridge javascriptBridge;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public final EoyGiveawayManager getEoyGiveawayManager() {
        return this.eoyGiveawayManager;
    }

    public final EoyGiveawayJavascriptBridge getJavascriptBridge() {
        return this.javascriptBridge;
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Eoy2025Duxo(DuxoBundle duxoBundle, EoyGiveawayManager eoyGiveawayManager, EoyGiveawayJavascriptBridge javascriptBridge, SavedStateHandle savedStateHandle) {
        super(new Eoy2025ViewState(null, false, false, null, null, false, 63, null), duxoBundle);
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(eoyGiveawayManager, "eoyGiveawayManager");
        Intrinsics.checkNotNullParameter(javascriptBridge, "javascriptBridge");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.eoyGiveawayManager = eoyGiveawayManager;
        this.javascriptBridge = javascriptBridge;
        this.savedStateHandle = savedStateHandle;
        this.clientService = eoyGiveawayManager.clientService();
    }

    public final String getCurrentViewId() {
        return this.currentViewId;
    }

    public final void setCurrentViewId(String str) {
        this.currentViewId = str;
        Timber.INSTANCE.mo3350d("Setting current view ID to: " + str, new Object[0]);
        this.javascriptBridge.setViewId(str);
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        this.eoyGiveawayManager.updateClientInteractionHandler(this.currentViewId, this);
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C177571(null));
    }

    /* compiled from: Eoy2025Duxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.gold.eoy2025.Eoy2025Duxo$onCreate$1", m3645f = "Eoy2025Duxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.gold.eoy2025.Eoy2025Duxo$onCreate$1 */
    static final class C177571 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C177571(Continuation<? super C177571> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C177571 c177571 = Eoy2025Duxo.this.new C177571(continuation);
            c177571.L$0 = obj;
            return c177571;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C177571) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: Eoy2025Duxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.gold.eoy2025.Eoy2025Duxo$onCreate$1$1", m3645f = "Eoy2025Duxo.kt", m3646l = {50}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.gold.eoy2025.Eoy2025Duxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ Eoy2025Duxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(Eoy2025Duxo eoy2025Duxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = eoy2025Duxo;
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
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<HandleCanvasMessageRequestDto> flowMessageFlow = this.this$0.getJavascriptBridge().messageFlow();
                    final Eoy2025Duxo eoy2025Duxo = this.this$0;
                    FlowCollector<? super HandleCanvasMessageRequestDto> flowCollector = new FlowCollector() { // from class: com.robinhood.android.gold.eoy2025.Eoy2025Duxo.onCreate.1.1.1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit((HandleCanvasMessageRequestDto) obj2, (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(HandleCanvasMessageRequestDto handleCanvasMessageRequestDto, Continuation<? super Unit> continuation) {
                            Object objHandleCanvasMessage = eoy2025Duxo.clientService.HandleCanvasMessage(handleCanvasMessageRequestDto, continuation);
                            return objHandleCanvasMessage == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objHandleCanvasMessage : Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (flowMessageFlow.collect(flowCollector, this) == coroutine_suspended) {
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

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            Launch.launchDefault$default(coroutineScope, null, null, new AnonymousClass1(Eoy2025Duxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(Eoy2025Duxo.this, null), 3, null);
            return Unit.INSTANCE;
        }

        /* compiled from: Eoy2025Duxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.gold.eoy2025.Eoy2025Duxo$onCreate$1$2", m3645f = "Eoy2025Duxo.kt", m3646l = {61}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.gold.eoy2025.Eoy2025Duxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ Eoy2025Duxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(Eoy2025Duxo eoy2025Duxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = eoy2025Duxo;
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
                    EndOfYearGiveawayService endOfYearGiveawayService = this.this$0.clientService;
                    Companion companion = Eoy2025Duxo.INSTANCE;
                    Flow<GetProgramViewModelResponseDto> flowGetProgramViewModel = endOfYearGiveawayService.GetProgramViewModel(new GetProgramViewModelRequestDto(((Eoy2025IntentKey) companion.getArgs((HasSavedState) this.this$0)).getBox(), ((Eoy2025IntentKey) companion.getArgs((HasSavedState) this.this$0)).getSource()));
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowGetProgramViewModel, anonymousClass1, this) == coroutine_suspended) {
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

            /* compiled from: Eoy2025Duxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Leoy_giveaway/v1/GetProgramViewModelResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.gold.eoy2025.Eoy2025Duxo$onCreate$1$2$1", m3645f = "Eoy2025Duxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.gold.eoy2025.Eoy2025Duxo$onCreate$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<GetProgramViewModelResponseDto, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ Eoy2025Duxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(Eoy2025Duxo eoy2025Duxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = eoy2025Duxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(GetProgramViewModelResponseDto getProgramViewModelResponseDto, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(getProgramViewModelResponseDto, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: Eoy2025Duxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/gold/eoy2025/Eoy2025ViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.gold.eoy2025.Eoy2025Duxo$onCreate$1$2$1$1", m3645f = "Eoy2025Duxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.gold.eoy2025.Eoy2025Duxo$onCreate$1$2$1$1, reason: invalid class name and collision with other inner class name */
                static final class C501691 extends ContinuationImpl7 implements Function2<Eoy2025ViewState, Continuation<? super Eoy2025ViewState>, Object> {
                    final /* synthetic */ GetProgramViewModelResponseDto $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C501691(GetProgramViewModelResponseDto getProgramViewModelResponseDto, Continuation<? super C501691> continuation) {
                        super(2, continuation);
                        this.$it = getProgramViewModelResponseDto;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C501691 c501691 = new C501691(this.$it, continuation);
                        c501691.L$0 = obj;
                        return c501691;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Eoy2025ViewState eoy2025ViewState, Continuation<? super Eoy2025ViewState> continuation) {
                        return ((C501691) create(eoy2025ViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return ((Eoy2025ViewState) this.L$0).copy(this.$it.getCanvas_url(), false, this.$it.getShow_overlay(), this.$it.getClose_button_location(), this.$it.getCalendar_button_location(), this.$it.getShow_pending_gift_indicator());
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C501691((GetProgramViewModelResponseDto) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onDestroy() {
        super.onDestroy();
        if (Intrinsics.areEqual(this.eoyGiveawayManager.getCurrentViewId(), this.currentViewId)) {
            Timber.INSTANCE.mo3350d("Removing client interaction handler", new Object[0]);
            this.eoyGiveawayManager.updateClientInteractionHandler(null, null);
        } else {
            Timber.INSTANCE.mo3350d("Skipping removal of client interaction handler", new Object[0]);
        }
    }

    /* compiled from: Eoy2025Duxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.gold.eoy2025.Eoy2025Duxo$showHolidayHubView$1", m3645f = "Eoy2025Duxo.kt", m3646l = {89}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.gold.eoy2025.Eoy2025Duxo$showHolidayHubView$1 */
    static final class C177581 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C177581(Continuation<? super C177581> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return Eoy2025Duxo.this.new C177581(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C177581) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                EndOfYearGiveawayService endOfYearGiveawayService = Eoy2025Duxo.this.clientService;
                ShowHolidayHubViewRequestDto showHolidayHubViewRequestDto = new ShowHolidayHubViewRequestDto();
                this.label = 1;
                if (endOfYearGiveawayService.ShowHolidayHubView(showHolidayHubViewRequestDto, this) == coroutine_suspended) {
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

    public final void showHolidayHubView() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C177581(null), 3, null);
    }

    /* compiled from: Eoy2025Duxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/gold/eoy2025/Eoy2025Duxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/gold/eoy2025/Eoy2025Duxo;", "Lcom/robinhood/android/gold/contracts/Eoy2025IntentKey;", "<init>", "()V", "feature-eoy-2025_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<Eoy2025Duxo, Eoy2025IntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public Eoy2025IntentKey getArgs(SavedStateHandle savedStateHandle) {
            return (Eoy2025IntentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public Eoy2025IntentKey getArgs(Eoy2025Duxo eoy2025Duxo) {
            return (Eoy2025IntentKey) DuxoCompanion.DefaultImpls.getArgs(this, eoy2025Duxo);
        }
    }

    @Override // com.robinhood.android.engagement.eoygiveaway.EoyGiveawayInteractionHandler
    public void invokeJavascript(String script) {
        Intrinsics.checkNotNullParameter(script, "script");
        Timber.INSTANCE.mo3350d("invokeJavascript: " + script, new Object[0]);
        submit(new Eoy2025Event.InvokeJavaScript(script));
    }

    @Override // com.robinhood.android.engagement.eoygiveaway.EoyGiveawayInteractionHandler
    public void dismissProgramView(String viewId) {
        Intrinsics.checkNotNullParameter(viewId, "viewId");
        Timber.INSTANCE.mo3350d("dismissProgramView: " + viewId, new Object[0]);
        submit(Eoy2025Event.DismissView.INSTANCE);
    }

    @Override // com.robinhood.android.engagement.eoygiveaway.EoyGiveawayInteractionHandler
    public void showSystemShareScreen(List<String> contents, boolean includeCanvasImage) {
        Intrinsics.checkNotNullParameter(contents, "contents");
        Timber.INSTANCE.mo3350d("showSystemShareScreen: contents=" + contents + ", includeCanvasImage=" + includeCanvasImage, new Object[0]);
        submit(new Eoy2025Event.ShowSystemShareScreen(contents, includeCanvasImage));
    }
}
