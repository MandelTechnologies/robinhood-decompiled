package com.robinhood.android.engagement.eoygiveaway;

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
import eoy_giveaway.p456v1.EndOfYearGiveawayClientService;
import eoy_giveaway.p456v1.EndOfYearGiveawayService;
import eoy_giveaway.p456v1.UpdateAppStateRequestDto;
import eoy_giveaway.p456v1.UpdateProgramViewVisibilityRequestDto;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;
import kotlinx.coroutines.rx2.RxAwait3;
import microgram.android.RemoteMicrogramApplication;
import microgram.android.inject.MicrogramComponent;
import microgram.android.service.ManagedServiceExtension2;
import timber.log.Timber;

/* compiled from: EoyGiveawayManager.kt */
@Metadata(m3635d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 22\u00020\u0001:\u00012B=\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\tH\u0002J\u0006\u0010\u001d\u001a\u00020\u001eJ\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\tJ\u001a\u0010$\u001a\u00020 2\b\u0010%\u001a\u0004\u0018\u00010\u00112\b\u0010&\u001a\u0004\u0018\u00010'J\u0016\u0010(\u001a\u00020 2\u0006\u0010%\u001a\u00020\u00112\u0006\u0010)\u001a\u00020*J\u0010\u0010+\u001a\u00020 2\u0006\u0010,\u001a\u00020-H\u0016J\u0010\u0010.\u001a\u00020 2\u0006\u0010,\u001a\u00020-H\u0016J\u0018\u0010/\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u00100\u001a\u000201H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0018X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00063"}, m3636d2 = {"Lcom/robinhood/android/engagement/eoygiveaway/EoyGiveawayManager;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "microgramManager", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "context", "Landroid/content/Context;", "microgramCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "<init>", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/android/microgramsdui/MicrogramManager;Landroid/content/Context;Lkotlinx/coroutines/CoroutineScope;Lcom/robinhood/android/navigation/Navigator;Lcom/robinhood/utils/moshi/LazyMoshi;)V", "value", "", "currentViewId", "getCurrentViewId", "()Ljava/lang/String;", "eoyGiveawayService", "Lcom/robinhood/android/engagement/eoygiveaway/RealEoyGiveawayService;", "navigationKeyFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/robinhood/android/navigation/keys/NavigationKey;", "microgramComponent", "Lmicrogram/android/inject/MicrogramComponent;", "lifecycleScope", "clientService", "Leoy_giveaway/v1/EndOfYearGiveawayService;", "launchNavigationKeyWhenReceived", "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "coroutineScope", "updateClientInteractionHandler", "viewId", "handler", "Lcom/robinhood/android/engagement/eoygiveaway/EoyGiveawayInteractionHandler;", "updateProgramVisibility", "visible", "", "onStart", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onStop", "showDialog", "navigationKey", "Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "Companion", "lib-eoy-giveaway_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class EoyGiveawayManager implements DefaultLifecycleObserver {
    public static final String DIALOG_TAG = "eoygiveaway_dialog";
    private final Context context;
    private String currentViewId;
    private final RealEoyGiveawayService eoyGiveawayService;
    private final ExperimentsStore experimentsStore;
    private final CoroutineScope microgramCoroutineScope;
    private final MicrogramManager microgramManager;
    private final LazyMoshi moshi;
    private final StateFlow2<NavigationKey> navigationKeyFlow;
    private final Navigator navigator;
    public static final int $stable = 8;

    public EoyGiveawayManager(ExperimentsStore experimentsStore, MicrogramManager microgramManager, Context context, @RootCoroutineScope CoroutineScope microgramCoroutineScope, Navigator navigator, LazyMoshi moshi) {
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(microgramCoroutineScope, "microgramCoroutineScope");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.experimentsStore = experimentsStore;
        this.microgramManager = microgramManager;
        this.context = context;
        this.microgramCoroutineScope = microgramCoroutineScope;
        this.navigator = navigator;
        this.moshi = moshi;
        this.eoyGiveawayService = new RealEoyGiveawayService();
        this.navigationKeyFlow = StateFlow4.MutableStateFlow(null);
        ProcessLifecycleOwner.INSTANCE.get().getLifecycle().addObserver(this);
    }

    public final String getCurrentViewId() {
        return this.currentViewId;
    }

    private final MicrogramComponent microgramComponent(CoroutineScope lifecycleScope) {
        return RealMicrogramUiLaunchService2.getComponentWithUiLaunch(this.microgramManager, new RemoteMicrogramApplication("app-eoy-2025", null, 2, null), lifecycleScope, this.moshi, MapsKt.mapOf(ManagedServiceExtension2.providedBy(Reflection.getOrCreateKotlinClass(EndOfYearGiveawayClientService.class), this.eoyGiveawayService), RealMicrogramDeeplinkService.INSTANCE.getExtension(this.context, this.navigator)), new Function1() { // from class: com.robinhood.android.engagement.eoygiveaway.EoyGiveawayManager$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EoyGiveawayManager.microgramComponent$lambda$0((FragmentKey) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.engagement.eoygiveaway.EoyGiveawayManager$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EoyGiveawayManager.microgramComponent$lambda$2(this.f$0, (DialogFragmentKey) obj);
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
    public static final Unit microgramComponent$lambda$2(EoyGiveawayManager eoyGiveawayManager, DialogFragmentKey dialogKey) {
        Intrinsics.checkNotNullParameter(dialogKey, "dialogKey");
        Timber.INSTANCE.mo3350d("launchDialog: " + dialogKey, new Object[0]);
        StateFlow2<NavigationKey> stateFlow2 = eoyGiveawayManager.navigationKeyFlow;
        while (!stateFlow2.compareAndSet(stateFlow2.getValue(), dialogKey)) {
        }
        return Unit.INSTANCE;
    }

    public final EndOfYearGiveawayService clientService() {
        return (EndOfYearGiveawayService) microgramComponent(this.microgramCoroutineScope).getServiceLocator().getClient(EndOfYearGiveawayService.class);
    }

    public final void launchNavigationKeyWhenReceived(FragmentManager fragmentManager, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Timber.INSTANCE.mo3350d("launchNavigationKeyWhenReceived", new Object[0]);
        FlowKt.launchIn(FlowKt.mapLatest(ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.experimentsStore, new Experiment[]{EoyGiveawayExperiment.INSTANCE}, false, null, 6, null), new C145281(fragmentManager, null)), coroutineScope);
    }

    /* compiled from: EoyGiveawayManager.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "inExperiment", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.engagement.eoygiveaway.EoyGiveawayManager$launchNavigationKeyWhenReceived$1", m3645f = "EoyGiveawayManager.kt", m3646l = {104}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.engagement.eoygiveaway.EoyGiveawayManager$launchNavigationKeyWhenReceived$1 */
    static final class C145281 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
        final /* synthetic */ FragmentManager $fragmentManager;
        /* synthetic */ boolean Z$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C145281(FragmentManager fragmentManager, Continuation<? super C145281> continuation) {
            super(2, continuation);
            this.$fragmentManager = fragmentManager;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C145281 c145281 = EoyGiveawayManager.this.new C145281(this.$fragmentManager, continuation);
            c145281.Z$0 = ((Boolean) obj).booleanValue();
            return c145281;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
            return ((C145281) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.Z$0) {
                    EoyGiveawayManager.this.clientService();
                    Flow flowFilterNotNull = FlowKt.filterNotNull(EoyGiveawayManager.this.navigationKeyFlow);
                    final EoyGiveawayManager eoyGiveawayManager = EoyGiveawayManager.this;
                    final FragmentManager fragmentManager = this.$fragmentManager;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.engagement.eoygiveaway.EoyGiveawayManager.launchNavigationKeyWhenReceived.1.1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit((NavigationKey) obj2, (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(NavigationKey navigationKey, Continuation<? super Unit> continuation) {
                            if (navigationKey instanceof DialogFragmentKey) {
                                eoyGiveawayManager.showDialog(fragmentManager, (DialogFragmentKey) navigationKey);
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

    public final void updateClientInteractionHandler(String viewId, EoyGiveawayInteractionHandler handler) {
        this.currentViewId = viewId;
        this.eoyGiveawayService.updateClientInteractionHandler(handler);
    }

    /* compiled from: EoyGiveawayManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.engagement.eoygiveaway.EoyGiveawayManager$updateProgramVisibility$1", m3645f = "EoyGiveawayManager.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.engagement.eoygiveaway.EoyGiveawayManager$updateProgramVisibility$1 */
    static final class C145311 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $viewId;
        final /* synthetic */ boolean $visible;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C145311(String str, boolean z, Continuation<? super C145311> continuation) {
            super(2, continuation);
            this.$viewId = str;
            this.$visible = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EoyGiveawayManager.this.new C145311(this.$viewId, this.$visible, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C145311) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                EndOfYearGiveawayService endOfYearGiveawayServiceClientService = EoyGiveawayManager.this.clientService();
                UpdateProgramViewVisibilityRequestDto updateProgramViewVisibilityRequestDto = new UpdateProgramViewVisibilityRequestDto(this.$viewId, this.$visible);
                this.label = 1;
                if (endOfYearGiveawayServiceClientService.UpdateProgramViewVisibility(updateProgramViewVisibilityRequestDto, this) == coroutine_suspended) {
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

    public final void updateProgramVisibility(String viewId, boolean visible) {
        Intrinsics.checkNotNullParameter(viewId, "viewId");
        Launch.launchDefault$default(this.microgramCoroutineScope, null, null, new C145311(viewId, visible, null), 3, null);
    }

    /* compiled from: EoyGiveawayManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.engagement.eoygiveaway.EoyGiveawayManager$onStart$1", m3645f = "EoyGiveawayManager.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_ARROW_UP_VALUE, 147}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.engagement.eoygiveaway.EoyGiveawayManager$onStart$1 */
    static final class C145291 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C145291(Continuation<? super C145291> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EoyGiveawayManager.this.new C145291(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C145291) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
        
            if (r12.UpdateAppState(r1, r11) == r0) goto L19;
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
                Observable observableStreamState$default = ExperimentsProvider.DefaultImpls.streamState$default(EoyGiveawayManager.this.experimentsStore, new Experiment[]{EoyGiveawayExperiment.INSTANCE}, false, null, 6, null);
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
                EndOfYearGiveawayService endOfYearGiveawayServiceClientService = EoyGiveawayManager.this.clientService();
                UpdateAppStateRequestDto updateAppStateRequestDto = new UpdateAppStateRequestDto(true);
                this.label = 2;
            }
            return Unit.INSTANCE;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Launch.launchDefault$default(this.microgramCoroutineScope, null, null, new C145291(null), 3, null);
    }

    /* compiled from: EoyGiveawayManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.engagement.eoygiveaway.EoyGiveawayManager$onStop$1", m3645f = "EoyGiveawayManager.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_ARROW_UP_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.engagement.eoygiveaway.EoyGiveawayManager$onStop$1 */
    static final class C145301 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C145301(Continuation<? super C145301> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EoyGiveawayManager.this.new C145301(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C145301) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
        
            if (r12.UpdateAppState(r1, r11) == r0) goto L20;
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
                Observable observableStreamState$default = ExperimentsProvider.DefaultImpls.streamState$default(EoyGiveawayManager.this.experimentsStore, new Experiment[]{EoyGiveawayExperiment.INSTANCE}, false, null, 6, null);
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
                EndOfYearGiveawayService endOfYearGiveawayServiceClientService = EoyGiveawayManager.this.clientService();
                UpdateAppStateRequestDto updateAppStateRequestDto = new UpdateAppStateRequestDto(false);
                this.label = 2;
            }
            return Unit.INSTANCE;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Launch.launchDefault$default(this.microgramCoroutineScope, null, null, new C145301(null), 3, null);
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
}
