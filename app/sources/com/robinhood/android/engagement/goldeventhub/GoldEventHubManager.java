package com.robinhood.android.engagement.goldeventhub;

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
import eoy_giveaway.p456v1.UpdateAppStateRequestDto;
import eoy_giveaway.p456v1.UpdateProgramViewVisibilityRequestDto;
import gold_event_hub.p465v1.GoldEventHubService;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;
import kotlinx.coroutines.rx2.RxAwait3;
import microgram.android.RemoteMicrogramApplication;
import microgram.android.inject.MicrogramComponent;
import timber.log.Timber;

/* compiled from: GoldEventHubManager.kt */
@Metadata(m3635d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 )2\u00020\u0001:\u0001)B=\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0007H\u0002J\u0006\u0010\u0018\u001a\u00020\u0019J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0007J\u0018\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020!H\u0002J\u000e\u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020$J\u0010\u0010%\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020'H\u0016J\u0010\u0010(\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020'H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/engagement/goldeventhub/GoldEventHubManager;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "microgramManager", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "context", "Landroid/content/Context;", "microgramCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "<init>", "(Lcom/robinhood/android/microgramsdui/MicrogramManager;Landroid/content/Context;Lkotlinx/coroutines/CoroutineScope;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/android/navigation/Navigator;Lcom/robinhood/utils/moshi/LazyMoshi;)V", "navigationKeyFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/robinhood/android/navigation/keys/NavigationKey;", "experimentRef", "Lcom/robinhood/android/engagement/goldeventhub/GoldHoodMonth2025Experiment;", "microgramComponent", "Lmicrogram/android/inject/MicrogramComponent;", "lifecycleScope", "goldEventHubService", "Lgold_event_hub/v1/GoldEventHubService;", "launchNavigationKeyWhenReceived", "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "coroutineScope", "showDialog", "navigationKey", "Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "notifyScreenStateChanged", "isVisible", "", "onStart", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onStop", "Companion", "lib-gold-event-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class GoldEventHubManager implements DefaultLifecycleObserver {
    public static final String APP_NAME = "app-gold-event-hub";
    public static final String DIALOG_TAG = "gold_hub_event_dialog";
    private final Context context;
    private final GoldHoodMonth2025Experiment experimentRef;
    private final ExperimentsStore experimentsStore;
    private final CoroutineScope microgramCoroutineScope;
    private final MicrogramManager microgramManager;
    private final LazyMoshi moshi;
    private final StateFlow2<NavigationKey> navigationKeyFlow;
    private final Navigator navigator;

    public GoldEventHubManager(MicrogramManager microgramManager, Context context, @RootCoroutineScope CoroutineScope microgramCoroutineScope, ExperimentsStore experimentsStore, Navigator navigator, LazyMoshi moshi) {
        Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(microgramCoroutineScope, "microgramCoroutineScope");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.microgramManager = microgramManager;
        this.context = context;
        this.microgramCoroutineScope = microgramCoroutineScope;
        this.experimentsStore = experimentsStore;
        this.navigator = navigator;
        this.moshi = moshi;
        this.navigationKeyFlow = StateFlow4.MutableStateFlow(null);
        this.experimentRef = GoldHoodMonth2025Experiment.INSTANCE;
        ProcessLifecycleOwner.INSTANCE.get().getLifecycle().addObserver(this);
    }

    private final MicrogramComponent microgramComponent(CoroutineScope lifecycleScope) {
        return RealMicrogramUiLaunchService2.getComponentWithUiLaunch(this.microgramManager, new RemoteMicrogramApplication(APP_NAME, null, 2, null), lifecycleScope, this.moshi, MapsKt.mapOf(RealMicrogramDeeplinkService.INSTANCE.getExtension(this.context, this.navigator)), new Function1() { // from class: com.robinhood.android.engagement.goldeventhub.GoldEventHubManager$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GoldEventHubManager.microgramComponent$lambda$0((FragmentKey) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.engagement.goldeventhub.GoldEventHubManager$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GoldEventHubManager.microgramComponent$lambda$2(this.f$0, (DialogFragmentKey) obj);
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
    public static final Unit microgramComponent$lambda$2(GoldEventHubManager goldEventHubManager, DialogFragmentKey dialogKey) {
        Intrinsics.checkNotNullParameter(dialogKey, "dialogKey");
        Timber.INSTANCE.mo3350d("launchDialog: " + dialogKey, new Object[0]);
        StateFlow2<NavigationKey> stateFlow2 = goldEventHubManager.navigationKeyFlow;
        while (!stateFlow2.compareAndSet(stateFlow2.getValue(), dialogKey)) {
        }
        return Unit.INSTANCE;
    }

    public final GoldEventHubService goldEventHubService() {
        return (GoldEventHubService) microgramComponent(this.microgramCoroutineScope).getServiceLocator().getClient(GoldEventHubService.class);
    }

    /* compiled from: GoldEventHubManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.engagement.goldeventhub.GoldEventHubManager$launchNavigationKeyWhenReceived$1", m3645f = "GoldEventHubManager.kt", m3646l = {93}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.engagement.goldeventhub.GoldEventHubManager$launchNavigationKeyWhenReceived$1 */
    static final class C145771 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ FragmentManager $fragmentManager;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C145771(FragmentManager fragmentManager, Continuation<? super C145771> continuation) {
            super(2, continuation);
            this.$fragmentManager = fragmentManager;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GoldEventHubManager.this.new C145771(this.$fragmentManager, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C145771) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                GoldEventHubManager.this.goldEventHubService();
                Flow flowFilterNotNull = FlowKt.filterNotNull(GoldEventHubManager.this.navigationKeyFlow);
                final GoldEventHubManager goldEventHubManager = GoldEventHubManager.this;
                final FragmentManager fragmentManager = this.$fragmentManager;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.engagement.goldeventhub.GoldEventHubManager.launchNavigationKeyWhenReceived.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((NavigationKey) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(NavigationKey navigationKey, Continuation<? super Unit> continuation) {
                        if (navigationKey instanceof DialogFragmentKey) {
                            goldEventHubManager.showDialog(fragmentManager, (DialogFragmentKey) navigationKey);
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
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final void launchNavigationKeyWhenReceived(FragmentManager fragmentManager, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Timber.INSTANCE.mo3350d("launchNavigationKeyWhenReceived", new Object[0]);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C145771(fragmentManager, null), 3, null);
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

    /* compiled from: GoldEventHubManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.engagement.goldeventhub.GoldEventHubManager$notifyScreenStateChanged$1", m3645f = "GoldEventHubManager.kt", m3646l = {188, EnumC7081g.SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.engagement.goldeventhub.GoldEventHubManager$notifyScreenStateChanged$1 */
    static final class C145781 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $isVisible;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C145781(boolean z, Continuation<? super C145781> continuation) {
            super(2, continuation);
            this.$isVisible = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GoldEventHubManager.this.new C145781(this.$isVisible, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C145781) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
        
            if (r12.UpdateProgramViewVisibility(r1, r11) == r0) goto L19;
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
                Observable observableStreamState$default = ExperimentsProvider.DefaultImpls.streamState$default(GoldEventHubManager.this.experimentsStore, new Experiment[]{GoldEventHubManager.this.experimentRef}, false, null, 6, null);
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
                GoldEventHubService goldEventHubService = GoldEventHubManager.this.goldEventHubService();
                UpdateProgramViewVisibilityRequestDto updateProgramViewVisibilityRequestDto = new UpdateProgramViewVisibilityRequestDto(null, this.$isVisible, 1, null);
                this.label = 2;
            }
            return Unit.INSTANCE;
        }
    }

    public final void notifyScreenStateChanged(boolean isVisible) {
        Timber.INSTANCE.mo3350d("notifyScreenStateChanged: isVisible=" + isVisible, new Object[0]);
        BuildersKt__Builders_commonKt.launch$default(this.microgramCoroutineScope, null, null, new C145781(isVisible, null), 3, null);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Timber.INSTANCE.mo3350d("onStart", new Object[0]);
        Launch.launchDefault$default(this.microgramCoroutineScope, null, null, new C145791(null), 3, null);
    }

    /* compiled from: GoldEventHubManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.engagement.goldeventhub.GoldEventHubManager$onStart$1", m3645f = "GoldEventHubManager.kt", m3646l = {188, 156}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.engagement.goldeventhub.GoldEventHubManager$onStart$1 */
    static final class C145791 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C145791(Continuation<? super C145791> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GoldEventHubManager.this.new C145791(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C145791) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x005e, code lost:
        
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
                Observable observableStreamState$default = ExperimentsProvider.DefaultImpls.streamState$default(GoldEventHubManager.this.experimentsStore, new Experiment[]{GoldEventHubManager.this.experimentRef}, false, null, 6, null);
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
                GoldEventHubService goldEventHubService = GoldEventHubManager.this.goldEventHubService();
                UpdateAppStateRequestDto updateAppStateRequestDto = new UpdateAppStateRequestDto(true);
                this.label = 2;
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: GoldEventHubManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.engagement.goldeventhub.GoldEventHubManager$onStop$1", m3645f = "GoldEventHubManager.kt", m3646l = {188, EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.engagement.goldeventhub.GoldEventHubManager$onStop$1 */
    static final class C145801 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C145801(Continuation<? super C145801> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GoldEventHubManager.this.new C145801(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C145801) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0060, code lost:
        
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
                Observable observableStreamState$default = ExperimentsProvider.DefaultImpls.streamState$default(GoldEventHubManager.this.experimentsStore, new Experiment[]{GoldEventHubManager.this.experimentRef}, false, null, 6, null);
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
                GoldEventHubService goldEventHubService = GoldEventHubManager.this.goldEventHubService();
                UpdateAppStateRequestDto updateAppStateRequestDto = new UpdateAppStateRequestDto(false);
                this.label = 2;
            }
            return Unit.INSTANCE;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Timber.INSTANCE.mo3350d("onStop", new Object[0]);
        Launch.launchDefault$default(this.microgramCoroutineScope, null, null, new C145801(null), 3, null);
    }
}
