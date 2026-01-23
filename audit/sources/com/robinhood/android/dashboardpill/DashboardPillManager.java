package com.robinhood.android.dashboardpill;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.dashboardpill.DashboardPillData3;
import com.robinhood.android.microgramsdui.MicrogramManager;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.DialogFragmentKey;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.navigation.keys.NavigationKey;
import com.robinhood.shared.common.microgramdeeplinklaunch.RealMicrogramDeeplinkService;
import com.robinhood.shared.common.microgramuilaunch.RealMicrogramUiLaunchService2;
import com.robinhood.utils.coroutines.scope.RootCoroutineScope;
import com.robinhood.utils.moshi.LazyMoshi;
import dashboard_pill.p444v1.AppStateChangedRequestDto;
import dashboard_pill.p444v1.ClearNotificationDotRequestDto;
import dashboard_pill.p444v1.DashboardPillService;
import dashboard_pill.p444v1.SetVisibleLocationRequestDto;
import kotlin.Metadata;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;
import messaging.proto.badge.p484v1.GetBadgeDataRequestDto;
import messaging.proto.badge.p484v1.GetBadgeDataResponseDto;
import microgram.android.RemoteMicrogramApplication;
import microgram.android.inject.MicrogramComponent;
import timber.log.Timber;

/* compiled from: DashboardPillManager.kt */
@Metadata(m3635d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u0000 12\u00020\u0001:\u00011B5\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000bH\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u001e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!J\u0018\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0002J\u0016\u0010'\u001a\u00020\u00172\u0006\u0010#\u001a\u00020$2\u0006\u0010(\u001a\u00020\u000bJ \u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010*0\u001c2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!J\u0010\u0010+\u001a\u00020\u00172\u0006\u0010,\u001a\u00020-H\u0002J\u000e\u0010.\u001a\u00020\u00172\u0006\u0010/\u001a\u00020!J\u0010\u00100\u001a\u00020\u00172\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00062"}, m3636d2 = {"Lcom/robinhood/android/dashboardpill/DashboardPillManager;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "microgramManager", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "context", "Landroid/content/Context;", "microgramCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "(Lcom/robinhood/android/microgramsdui/MicrogramManager;Lcom/robinhood/utils/moshi/LazyMoshi;Lcom/robinhood/android/navigation/Navigator;Landroid/content/Context;Lkotlinx/coroutines/CoroutineScope;)V", "navigationKeyFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/robinhood/android/navigation/keys/NavigationKey;", "microgramComponent", "Lmicrogram/android/inject/MicrogramComponent;", "lifecycleScope", "clientService", "Ldashboard_pill/v1/DashboardPillService;", "onStart", "", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onStop", "streamPillData", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/android/dashboardpill/DashboardPillState;", "location", "Lcom/robinhood/android/dashboardpill/DashboardPillLocation;", "accountNumber", "", "showDialog", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "navigationKey", "Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "launchNavigationKeyWhenReceived", "coroutineScope", "streamPillDataOrNull", "Lcom/robinhood/android/dashboardpill/DashboardPillData;", "appStateChanged", "isInForeground", "", "onNotificationDotCleared", "pillIdentifier", "setVisibleLocation", "Companion", "lib-dashboard-pill_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class DashboardPillManager implements DefaultLifecycleObserver {
    public static final String DIALOG_TAG = "dashboard_pill_dialog";
    private final Context context;
    private final CoroutineScope microgramCoroutineScope;
    private final MicrogramManager microgramManager;
    private final LazyMoshi moshi;
    private final StateFlow2<NavigationKey> navigationKeyFlow;
    private final Navigator navigator;
    public static final int $stable = 8;

    public DashboardPillManager(MicrogramManager microgramManager, LazyMoshi moshi, Navigator navigator, Context context, @RootCoroutineScope CoroutineScope microgramCoroutineScope) {
        Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(microgramCoroutineScope, "microgramCoroutineScope");
        this.microgramManager = microgramManager;
        this.moshi = moshi;
        this.navigator = navigator;
        this.context = context;
        this.microgramCoroutineScope = microgramCoroutineScope;
        this.navigationKeyFlow = StateFlow4.MutableStateFlow(null);
        ProcessLifecycleOwner.INSTANCE.get().getLifecycle().addObserver(this);
    }

    private final MicrogramComponent microgramComponent(CoroutineScope lifecycleScope) {
        return RealMicrogramUiLaunchService2.getComponentWithUiLaunch(this.microgramManager, new RemoteMicrogramApplication("app-dashboard-pill", null, 2, null), lifecycleScope, this.moshi, MapsKt.mapOf(RealMicrogramDeeplinkService.INSTANCE.getExtension(this.context, this.navigator)), new Function1() { // from class: com.robinhood.android.dashboardpill.DashboardPillManager$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DashboardPillManager.microgramComponent$lambda$0((FragmentKey) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.dashboardpill.DashboardPillManager$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DashboardPillManager.microgramComponent$lambda$2(this.f$0, (DialogFragmentKey) obj);
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
    public static final Unit microgramComponent$lambda$2(DashboardPillManager dashboardPillManager, DialogFragmentKey dialogKey) {
        Intrinsics.checkNotNullParameter(dialogKey, "dialogKey");
        Timber.INSTANCE.mo3350d("launchDialog: " + dialogKey, new Object[0]);
        StateFlow2<NavigationKey> stateFlow2 = dashboardPillManager.navigationKeyFlow;
        while (!stateFlow2.compareAndSet(stateFlow2.getValue(), dialogKey)) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DashboardPillService clientService() {
        return (DashboardPillService) microgramComponent(this.microgramCoroutineScope).getServiceLocator().getClient(DashboardPillService.class);
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

    public final Flow<DashboardPillData3> streamPillData(DashboardPillData2 location, String accountNumber) {
        Intrinsics.checkNotNullParameter(location, "location");
        final Flow<GetBadgeDataResponseDto> flowGetBadgeData = clientService().GetBadgeData(new GetBadgeDataRequestDto(location.toString(), accountNumber));
        return new Flow<DashboardPillData3>() { // from class: com.robinhood.android.dashboardpill.DashboardPillManager$streamPillData$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.dashboardpill.DashboardPillManager$streamPillData$$inlined$map$1$2 */
            public static final class C138132<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.dashboardpill.DashboardPillManager$streamPillData$$inlined$map$1$2", m3645f = "DashboardPillManager.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.dashboardpill.DashboardPillManager$streamPillData$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C138132.this.emit(null, this);
                    }
                }

                public C138132(FlowCollector flowCollector) {
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
                        DashboardPillData3 dashboardPillState = ToDashboardPillState.toDashboardPillState(((GetBadgeDataResponseDto) obj).getBadge_data());
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(dashboardPillState, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super DashboardPillData3> flowCollector, Continuation continuation) {
                Object objCollect = flowGetBadgeData.collect(new C138132(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
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

    /* compiled from: DashboardPillManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.dashboardpill.DashboardPillManager$launchNavigationKeyWhenReceived$1", m3645f = "DashboardPillManager.kt", m3646l = {EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.dashboardpill.DashboardPillManager$launchNavigationKeyWhenReceived$1 */
    static final class C138161 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ FragmentManager $fragmentManager;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C138161(FragmentManager fragmentManager, Continuation<? super C138161> continuation) {
            super(2, continuation);
            this.$fragmentManager = fragmentManager;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DashboardPillManager.this.new C138161(this.$fragmentManager, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C138161) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(DashboardPillManager.this.navigationKeyFlow);
                final DashboardPillManager dashboardPillManager = DashboardPillManager.this;
                final FragmentManager fragmentManager = this.$fragmentManager;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.dashboardpill.DashboardPillManager.launchNavigationKeyWhenReceived.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((NavigationKey) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(NavigationKey navigationKey, Continuation<? super Unit> continuation) {
                        if (navigationKey instanceof DialogFragmentKey) {
                            dashboardPillManager.showDialog(fragmentManager, (DialogFragmentKey) navigationKey);
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
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C138161(fragmentManager, null), 3, null);
    }

    public final Flow<DashboardPillData> streamPillDataOrNull(DashboardPillData2 location, String accountNumber) {
        Intrinsics.checkNotNullParameter(location, "location");
        final Flow<DashboardPillData3> flowStreamPillData = streamPillData(location, accountNumber);
        return new Flow<DashboardPillData>() { // from class: com.robinhood.android.dashboardpill.DashboardPillManager$streamPillDataOrNull$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super DashboardPillData> flowCollector, Continuation continuation) {
                Object objCollect = flowStreamPillData.collect(new C138142(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.dashboardpill.DashboardPillManager$streamPillDataOrNull$$inlined$map$1$2 */
            public static final class C138142<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.dashboardpill.DashboardPillManager$streamPillDataOrNull$$inlined$map$1$2", m3645f = "DashboardPillManager.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.dashboardpill.DashboardPillManager$streamPillDataOrNull$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C138142.this.emit(null, this);
                    }
                }

                public C138142(FlowCollector flowCollector) {
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
                        DashboardPillData3 dashboardPillData3 = (DashboardPillData3) obj;
                        DashboardPillData3.Visible visible = dashboardPillData3 instanceof DashboardPillData3.Visible ? (DashboardPillData3.Visible) dashboardPillData3 : null;
                        DashboardPillData data = visible != null ? visible.getData() : null;
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(data, anonymousClass1) == coroutine_suspended) {
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
        };
    }

    /* compiled from: DashboardPillManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.dashboardpill.DashboardPillManager$appStateChanged$1", m3645f = "DashboardPillManager.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.dashboardpill.DashboardPillManager$appStateChanged$1 */
    static final class C138151 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $isInForeground;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C138151(boolean z, Continuation<? super C138151> continuation) {
            super(2, continuation);
            this.$isInForeground = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DashboardPillManager.this.new C138151(this.$isInForeground, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C138151) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                DashboardPillService dashboardPillServiceClientService = DashboardPillManager.this.clientService();
                AppStateChangedRequestDto appStateChangedRequestDto = new AppStateChangedRequestDto(this.$isInForeground);
                this.label = 1;
                if (dashboardPillServiceClientService.AppStateChanged(appStateChangedRequestDto, this) == coroutine_suspended) {
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

    private final void appStateChanged(boolean isInForeground) {
        BuildersKt__Builders_commonKt.launch$default(this.microgramCoroutineScope, null, null, new C138151(isInForeground, null), 3, null);
    }

    /* compiled from: DashboardPillManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.dashboardpill.DashboardPillManager$onNotificationDotCleared$1", m3645f = "DashboardPillManager.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.dashboardpill.DashboardPillManager$onNotificationDotCleared$1 */
    static final class C138171 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $pillIdentifier;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C138171(String str, Continuation<? super C138171> continuation) {
            super(2, continuation);
            this.$pillIdentifier = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DashboardPillManager.this.new C138171(this.$pillIdentifier, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C138171) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                DashboardPillService dashboardPillServiceClientService = DashboardPillManager.this.clientService();
                ClearNotificationDotRequestDto clearNotificationDotRequestDto = new ClearNotificationDotRequestDto(this.$pillIdentifier);
                this.label = 1;
                if (dashboardPillServiceClientService.ClearNotificationDot(clearNotificationDotRequestDto, this) == coroutine_suspended) {
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

    public final void onNotificationDotCleared(String pillIdentifier) {
        Intrinsics.checkNotNullParameter(pillIdentifier, "pillIdentifier");
        BuildersKt__Builders_commonKt.launch$default(this.microgramCoroutineScope, null, null, new C138171(pillIdentifier, null), 3, null);
    }

    /* compiled from: DashboardPillManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.dashboardpill.DashboardPillManager$setVisibleLocation$1", m3645f = "DashboardPillManager.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.dashboardpill.DashboardPillManager$setVisibleLocation$1 */
    static final class C138181 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ DashboardPillData2 $location;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C138181(DashboardPillData2 dashboardPillData2, Continuation<? super C138181> continuation) {
            super(2, continuation);
            this.$location = dashboardPillData2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DashboardPillManager.this.new C138181(this.$location, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C138181) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                DashboardPillService dashboardPillServiceClientService = DashboardPillManager.this.clientService();
                DashboardPillData2 dashboardPillData2 = this.$location;
                SetVisibleLocationRequestDto setVisibleLocationRequestDto = new SetVisibleLocationRequestDto(dashboardPillData2 != null ? dashboardPillData2.toString() : null);
                this.label = 1;
                if (dashboardPillServiceClientService.SetVisibleLocation(setVisibleLocationRequestDto, this) == coroutine_suspended) {
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

    public final void setVisibleLocation(DashboardPillData2 location) {
        BuildersKt__Builders_commonKt.launch$default(this.microgramCoroutineScope, null, null, new C138181(location, null), 3, null);
    }
}
