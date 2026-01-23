package com.robinhood.android.lib.livetrivia;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.microgramsdui.MicrogramManager;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.DialogFragmentKey;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.navigation.keys.NavigationKey;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.shared.common.microgramdeeplinklaunch.RealMicrogramDeeplinkService;
import com.robinhood.shared.common.microgramuilaunch.RealMicrogramUiLaunchService2;
import com.robinhood.utils.coroutines.scope.RootCoroutineScope;
import com.robinhood.utils.moshi.LazyMoshi;
import dispatch.core.Launch;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;
import kotlinx.coroutines.rx2.RxAwait3;
import messaging.proto.badge.p484v1.GetBadgeDataRequestDto;
import messaging.proto.badge.p484v1.GetBadgeDataResponseDto;
import microgram.android.RemoteMicrogramApplication;
import microgram.android.inject.MicrogramComponent;
import microgram.android.service.ManagedServiceExtension2;
import timber.log.Timber;
import trivia.p550v1.AppStateChangedRequestDto;
import trivia.p550v1.GoldTriviaClientService;
import trivia.p550v1.GoldTriviaService;
import trivia.p550v1.ScreenStateChangedRequestDto;
import trivia.p550v1.VideoBufferingBeganRequestDto;
import trivia.p550v1.VideoBufferingEndedRequestDto;
import trivia.p550v1.VideoBufferingEndedResponseDto;

/* compiled from: LiveTriviaManager.kt */
@Metadata(m3635d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000 72\u00020\u0001:\u00017B=\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\tH\u0002J\u0006\u0010\u0018\u001a\u00020\u0019J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0016\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\tJ\f\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$J\u0018\u0010&\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020!2\u0006\u0010'\u001a\u00020(H\u0002J\u0010\u0010)\u001a\u00020\u001b2\b\u0010*\u001a\u0004\u0018\u00010+J\u0016\u0010,\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020.H\u0086@¢\u0006\u0002\u0010/J\u0010\u00100\u001a\u0004\u0018\u00010.H\u0086@¢\u0006\u0002\u00101J\u000e\u00102\u001a\u00020\u001b2\u0006\u00103\u001a\u000204J\u000e\u00105\u001a\u00020\u001b2\u0006\u00106\u001a\u000204R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00068"}, m3636d2 = {"Lcom/robinhood/android/lib/livetrivia/LiveTriviaManager;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "microgramManager", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "context", "Landroid/content/Context;", "microgramCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "<init>", "(Lcom/robinhood/android/microgramsdui/MicrogramManager;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Landroid/content/Context;Lkotlinx/coroutines/CoroutineScope;Lcom/robinhood/android/navigation/Navigator;Lcom/robinhood/utils/moshi/LazyMoshi;)V", "triviaClientService", "Lcom/robinhood/android/lib/livetrivia/LiveTriviaClientService;", "navigationKeyFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/robinhood/android/navigation/keys/NavigationKey;", "microgramComponent", "Lmicrogram/android/inject/MicrogramComponent;", "lifecycleScope", "clientService", "Ltrivia/v1/GoldTriviaService;", "onStart", "", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onStop", "launchNavigationKeyWhenReceived", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "coroutineScope", "getBadgeData", "Lkotlinx/coroutines/flow/Flow;", "Lmessaging/proto/badge/v1/GetBadgeDataResponseDto;", "showDialog", "navigationKey", "Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "updateClientInteractionHandler", "handler", "Lcom/robinhood/android/lib/livetrivia/LiveTriviaInteractionHandler;", "onBufferingStarted", "startTime", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onBufferingFinished", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "screenStateChanged", "isVisible", "", "appStateChanged", "isInForeground", "Companion", "lib-live-trivia_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class LiveTriviaManager implements DefaultLifecycleObserver {
    public static final String DIALOG_TAG = "trivia_dialog";
    private final Context context;
    private final ExperimentsStore experimentsStore;
    private final CoroutineScope microgramCoroutineScope;
    private final MicrogramManager microgramManager;
    private final LazyMoshi moshi;
    private final StateFlow2<NavigationKey> navigationKeyFlow;
    private final Navigator navigator;
    private final LiveTriviaClientService triviaClientService;
    public static final int $stable = 8;

    /* compiled from: LiveTriviaManager.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.lib.livetrivia.LiveTriviaManager", m3645f = "LiveTriviaManager.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE}, m3647m = "onBufferingFinished")
    /* renamed from: com.robinhood.android.lib.livetrivia.LiveTriviaManager$onBufferingFinished$1 */
    static final class C203061 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C203061(Continuation<? super C203061> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LiveTriviaManager.this.onBufferingFinished(this);
        }
    }

    public LiveTriviaManager(MicrogramManager microgramManager, ExperimentsStore experimentsStore, Context context, @RootCoroutineScope CoroutineScope microgramCoroutineScope, Navigator navigator, LazyMoshi moshi) {
        Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(microgramCoroutineScope, "microgramCoroutineScope");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.microgramManager = microgramManager;
        this.experimentsStore = experimentsStore;
        this.context = context;
        this.microgramCoroutineScope = microgramCoroutineScope;
        this.navigator = navigator;
        this.moshi = moshi;
        this.triviaClientService = new LiveTriviaClientService();
        this.navigationKeyFlow = StateFlow4.MutableStateFlow(null);
        ProcessLifecycleOwner.INSTANCE.get().getLifecycle().addObserver(this);
    }

    private final MicrogramComponent microgramComponent(CoroutineScope lifecycleScope) {
        return RealMicrogramUiLaunchService2.getComponentWithUiLaunch(this.microgramManager, new RemoteMicrogramApplication("app-live-trivia", null, 2, null), lifecycleScope, this.moshi, MapsKt.mapOf(ManagedServiceExtension2.providedBy(Reflection.getOrCreateKotlinClass(GoldTriviaClientService.class), this.triviaClientService), RealMicrogramDeeplinkService.INSTANCE.getExtension(this.context, this.navigator)), new Function1() { // from class: com.robinhood.android.lib.livetrivia.LiveTriviaManager$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LiveTriviaManager.microgramComponent$lambda$0((FragmentKey) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.lib.livetrivia.LiveTriviaManager$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LiveTriviaManager.microgramComponent$lambda$2(this.f$0, (DialogFragmentKey) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit microgramComponent$lambda$0(FragmentKey fragmentKey) {
        Intrinsics.checkNotNullParameter(fragmentKey, "fragmentKey");
        Timber.INSTANCE.mo3350d("launchUI: " + fragmentKey, new Object[0]);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit microgramComponent$lambda$2(LiveTriviaManager liveTriviaManager, DialogFragmentKey dialogKey) {
        Intrinsics.checkNotNullParameter(dialogKey, "dialogKey");
        Timber.INSTANCE.mo3350d("launchDialog: " + dialogKey, new Object[0]);
        StateFlow2<NavigationKey> stateFlow2 = liveTriviaManager.navigationKeyFlow;
        while (!stateFlow2.compareAndSet(stateFlow2.getValue(), dialogKey)) {
        }
        return Unit.INSTANCE;
    }

    public final GoldTriviaService clientService() {
        return (GoldTriviaService) microgramComponent(this.microgramCoroutineScope).getServiceLocator().getClient(GoldTriviaService.class);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        appStateChanged(true);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        appStateChanged(false);
    }

    /* compiled from: LiveTriviaManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.lib.livetrivia.LiveTriviaManager$launchNavigationKeyWhenReceived$1", m3645f = "LiveTriviaManager.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.lib.livetrivia.LiveTriviaManager$launchNavigationKeyWhenReceived$1 */
    static final class C203051 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ CoroutineScope $coroutineScope;
        final /* synthetic */ FragmentManager $fragmentManager;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C203051(CoroutineScope coroutineScope, FragmentManager fragmentManager, Continuation<? super C203051> continuation) {
            super(2, continuation);
            this.$coroutineScope = coroutineScope;
            this.$fragmentManager = fragmentManager;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LiveTriviaManager.this.new C203051(this.$coroutineScope, this.$fragmentManager, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C203051) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            FlowKt.launchIn(FlowKt.mapLatest(ExperimentsProvider.DefaultImpls.streamStateFlow$default(LiveTriviaManager.this.experimentsStore, new Experiment[]{LiveTriviaExperiment.INSTANCE}, false, null, 6, null), new AnonymousClass1(LiveTriviaManager.this, this.$fragmentManager, null)), this.$coroutineScope);
            return Unit.INSTANCE;
        }

        /* compiled from: LiveTriviaManager.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "inExperiment", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.lib.livetrivia.LiveTriviaManager$launchNavigationKeyWhenReceived$1$1", m3645f = "LiveTriviaManager.kt", m3646l = {116}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.lib.livetrivia.LiveTriviaManager$launchNavigationKeyWhenReceived$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            final /* synthetic */ FragmentManager $fragmentManager;
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ LiveTriviaManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(LiveTriviaManager liveTriviaManager, FragmentManager fragmentManager, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = liveTriviaManager;
                this.$fragmentManager = fragmentManager;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$fragmentManager, continuation);
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
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.Z$0) {
                        this.this$0.clientService();
                        Flow flowFilterNotNull = FlowKt.filterNotNull(this.this$0.navigationKeyFlow);
                        final LiveTriviaManager liveTriviaManager = this.this$0;
                        final FragmentManager fragmentManager = this.$fragmentManager;
                        FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.lib.livetrivia.LiveTriviaManager.launchNavigationKeyWhenReceived.1.1.1
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                                return emit((NavigationKey) obj2, (Continuation<? super Unit>) continuation);
                            }

                            public final Object emit(NavigationKey navigationKey, Continuation<? super Unit> continuation) {
                                if (navigationKey instanceof DialogFragmentKey) {
                                    liveTriviaManager.showDialog(fragmentManager, (DialogFragmentKey) navigationKey);
                                } else if (!(navigationKey instanceof FragmentKey) && !(navigationKey instanceof IntentKey)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        this.label = 1;
                        if (flowFilterNotNull.collect(flowCollector, this) == coroutine_suspended) {
                            return coroutine_suspended;
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

    public final void launchNavigationKeyWhenReceived(FragmentManager fragmentManager, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Timber.INSTANCE.mo3350d("launchNavigationKeyWhenReceived", new Object[0]);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C203051(coroutineScope, fragmentManager, null), 3, null);
    }

    public final Flow<GetBadgeDataResponseDto> getBadgeData() {
        return clientService().GetBadgeData(new GetBadgeDataRequestDto(null, null, 3, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showDialog(FragmentManager fragmentManager, DialogFragmentKey navigationKey) {
        if (fragmentManager.findFragmentByTag(DIALOG_TAG) == null) {
            Timber.INSTANCE.mo3350d("showDialog -> key=" + navigationKey, new Object[0]);
            StateFlow2<NavigationKey> stateFlow2 = this.navigationKeyFlow;
            while (!stateFlow2.compareAndSet(stateFlow2.getValue(), null)) {
            }
            Navigator.DefaultImpls.createDialogFragment$default(this.navigator, navigationKey, null, 2, null).show(fragmentManager, DIALOG_TAG);
            return;
        }
        Timber.INSTANCE.mo3362w("showDialog dropped dialog, because one is already showing -> key=" + navigationKey, new Object[0]);
    }

    public final void updateClientInteractionHandler(LiveTriviaInteractionHandler handler) {
        this.triviaClientService.updateClientInteractionHandler(handler);
    }

    public final Object onBufferingStarted(long j, Continuation<? super Unit> continuation) {
        Object objVideoBufferingBegan = clientService().VideoBufferingBegan(new VideoBufferingBeganRequestDto(j), continuation);
        return objVideoBufferingBegan == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objVideoBufferingBegan : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onBufferingFinished(Continuation<? super Long> continuation) {
        C203061 c203061;
        if (continuation instanceof C203061) {
            c203061 = (C203061) continuation;
            int i = c203061.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c203061.label = i - Integer.MIN_VALUE;
            } else {
                c203061 = new C203061(continuation);
            }
        }
        Object objVideoBufferingEnded = c203061.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c203061.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objVideoBufferingEnded);
            GoldTriviaService goldTriviaServiceClientService = clientService();
            VideoBufferingEndedRequestDto videoBufferingEndedRequestDto = new VideoBufferingEndedRequestDto();
            c203061.label = 1;
            objVideoBufferingEnded = goldTriviaServiceClientService.VideoBufferingEnded(videoBufferingEndedRequestDto, c203061);
            if (objVideoBufferingEnded == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objVideoBufferingEnded);
        }
        return ((VideoBufferingEndedResponseDto) objVideoBufferingEnded).getSeek_to_ms();
    }

    /* compiled from: LiveTriviaManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.lib.livetrivia.LiveTriviaManager$screenStateChanged$1", m3645f = "LiveTriviaManager.kt", m3646l = {EnumC7081g.f2780x600b66fe}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.lib.livetrivia.LiveTriviaManager$screenStateChanged$1 */
    static final class C203071 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $isVisible;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C203071(boolean z, Continuation<? super C203071> continuation) {
            super(2, continuation);
            this.$isVisible = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LiveTriviaManager.this.new C203071(this.$isVisible, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C203071) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                GoldTriviaService goldTriviaServiceClientService = LiveTriviaManager.this.clientService();
                ScreenStateChangedRequestDto screenStateChangedRequestDto = new ScreenStateChangedRequestDto(this.$isVisible);
                this.label = 1;
                if (goldTriviaServiceClientService.ScreenStateChanged(screenStateChangedRequestDto, this) == coroutine_suspended) {
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

    public final void screenStateChanged(boolean isVisible) {
        BuildersKt__Builders_commonKt.launch$default(this.microgramCoroutineScope, null, null, new C203071(isVisible, null), 3, null);
    }

    /* compiled from: LiveTriviaManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.lib.livetrivia.LiveTriviaManager$appStateChanged$1", m3645f = "LiveTriviaManager.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CLOCK_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.lib.livetrivia.LiveTriviaManager$appStateChanged$1 */
    static final class C203041 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $isInForeground;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C203041(boolean z, Continuation<? super C203041> continuation) {
            super(2, continuation);
            this.$isInForeground = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LiveTriviaManager.this.new C203041(this.$isInForeground, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C203041) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
        
            if (r12.AppStateChanged(r1, r11) == r0) goto L19;
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
                Observable observableStreamState$default = ExperimentsProvider.DefaultImpls.streamState$default(LiveTriviaManager.this.experimentsStore, new Experiment[]{LiveTriviaExperiment.INSTANCE}, false, null, 6, null);
                this.label = 1;
                obj = RxAwait3.awaitFirstOrNull(observableStreamState$default, this);
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
            Boolean bool = (Boolean) obj;
            if (bool != null ? bool.booleanValue() : false) {
                GoldTriviaService goldTriviaServiceClientService = LiveTriviaManager.this.clientService();
                AppStateChangedRequestDto appStateChangedRequestDto = new AppStateChangedRequestDto(this.$isInForeground);
                this.label = 2;
            }
            return Unit.INSTANCE;
        }
    }

    public final void appStateChanged(boolean isInForeground) {
        Launch.launchDefault$default(this.microgramCoroutineScope, null, null, new C203041(isInForeground, null), 3, null);
    }
}
