package com.robinhood.microgram.sdui;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.microgramsdui.MicrogramManager2;
import com.robinhood.android.microgramsdui.Toast2;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.shared.serverui.utils.UiObject;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.component.BentoToast2;
import com.robinhood.microgram.sdui.MicrogramAlertDialogFragment;
import com.robinhood.microgram.sdui.MicrogramRouterDuxo2;
import com.robinhood.microgram.sdui.MicrogramScreenFragment;
import com.robinhood.shared.common.contracts.MicrogramRouterFragmentKey2;
import com.robinhood.shared.common.contracts.MicrogramRouterFragmentKey3;
import com.robinhood.utils.extensions.ContextsUiExtensions;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import kotlin.ExceptionsH;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import microgram.p507ui.p508v1.InitialScreenDataDto;
import microgram.p507ui.p508v1.NavigationTypeDto;
import microgram.p507ui.p508v1.ToastDto;

/* compiled from: MicrogramRouterFragment.kt */
@Metadata(m3635d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 52\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u000245B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0012\u0010\u001b\u001a\u00020\u00182\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u001a\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020 2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u0010\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020#H\u0002J\b\u0010(\u001a\u00020\u0018H\u0002J \u0010)\u001a\u00020\u00182\u0016\u0010*\u001a\u0012\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-0+j\u0002`.H\u0002J\b\u0010/\u001a\u00020\u0018H\u0016J\b\u00100\u001a\u00020\u0018H\u0016J\u0010\u00101\u001a\u00020\u00182\u0006\u00102\u001a\u000203H\u0016R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010$\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u00066"}, m3636d2 = {"Lcom/robinhood/microgram/sdui/MicrogramRouterFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/microgram/sdui/MicrogramScreenFragment$Callbacks;", "Lcom/robinhood/microgram/sdui/MicrogramRouterFragmentCallbacks;", "Lcom/robinhood/microgram/sdui/MicrogramAlertDialogFragment$Callbacks;", "Lcom/robinhood/android/common/ui/RhDialogFragment$OnDismissListener;", "<init>", "()V", "duxo", "Lcom/robinhood/microgram/sdui/MicrogramRouterDuxo;", "getDuxo", "()Lcom/robinhood/microgram/sdui/MicrogramRouterDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "callbacks", "getCallbacks", "()Lcom/robinhood/microgram/sdui/MicrogramRouterFragmentCallbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "routerIdentifier", "", "getRouterIdentifier", "()Ljava/lang/String;", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "handleEvent", "event", "Lcom/robinhood/microgram/sdui/RouterEvent;", "instance", "Lcom/robinhood/android/microgramsdui/MicrogramInstance;", "getInstance", "()Lcom/robinhood/android/microgramsdui/MicrogramInstance;", "dismissAll", "makeToast", "toast", "Lcom/robinhood/android/shared/serverui/utils/UiObject;", "Lcom/robinhood/microgram/sdui/ToastData;", "Lmicrogram/ui/v1/ToastDto;", "Lcom/robinhood/microgram/sdui/AnyToast;", "dismissChild", "dismissEntireMicrogramFlow", "handleAlertAction", "action", "Lcom/robinhood/microgram/sdui/MicrogramAction;", "Args", "Companion", "feature-microgram-sdui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class MicrogramRouterFragment extends BaseFragment implements MicrogramScreenFragment.Callbacks, MicrogramRouterFragment2, MicrogramAlertDialogFragment.Callbacks, RhDialogFragment.OnDismissListener {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(MicrogramRouterFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/microgram/sdui/MicrogramRouterFragmentCallbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public MicrogramRouterFragment() {
        super(C11048R.layout.parent_fragment_container);
        this.duxo = DuxosKt.duxo(this, MicrogramRouterDuxo.class);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(MicrogramRouterFragment2.class), new Function1<Fragment, Object>() { // from class: com.robinhood.microgram.sdui.MicrogramRouterFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MicrogramRouterDuxo getDuxo() {
        return (MicrogramRouterDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MicrogramRouterFragment2 getCallbacks() {
        return (MicrogramRouterFragment2) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final String getRouterIdentifier() {
        return InitialScreenData2.getRouterIdentifier(((Args) INSTANCE.getArgs((Fragment) this)).getInitialScreenData());
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        requireBaseActivity().hideToolbar();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Companion companion = INSTANCE;
        UiObject<InitialScreenData, InitialScreenDataDto> initialScreenData = ((Args) companion.getArgs((Fragment) this)).getInitialScreenData();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C350111(initialScreenData, null), 3, null);
        if (savedInstanceState == null) {
            setFragment(C11048R.id.fragment_container, MicrogramScreenFragment.INSTANCE.newInstance((Parcelable) new MicrogramScreenFragment.Args(InitialScreenData2.getScreenIdentifier(initialScreenData), InitialScreenData2.getEncodedInitialContent(initialScreenData), InitialScreenData2.getScreenType(initialScreenData), InitialScreenData2.getTheme(initialScreenData), ((Args) companion.getArgs((Fragment) this)).getLoadingContent(), ((Args) companion.getArgs((Fragment) this)).getNavButtonType())));
        }
    }

    /* compiled from: MicrogramRouterFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.microgram.sdui.MicrogramRouterFragment$onCreate$1", m3645f = "MicrogramRouterFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.microgram.sdui.MicrogramRouterFragment$onCreate$1 */
    static final class C350111 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UiObject<InitialScreenData, InitialScreenDataDto> $initialScreenData;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C350111(UiObject<InitialScreenData, InitialScreenDataDto> uiObject, Continuation<? super C350111> continuation) {
            super(2, continuation);
            this.$initialScreenData = uiObject;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MicrogramRouterFragment.this.new C350111(this.$initialScreenData, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C350111) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                MicrogramRouterFragment.this.getDuxo().initRouter(this.$initialScreenData, MicrogramRouterFragment.this.getCallbacks().getInstance());
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C350121(null), 1, null);
    }

    /* compiled from: MicrogramRouterFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.microgram.sdui.MicrogramRouterFragment$onViewCreated$1", m3645f = "MicrogramRouterFragment.kt", m3646l = {74}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.microgram.sdui.MicrogramRouterFragment$onViewCreated$1 */
    static final class C350121 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C350121(Continuation<? super C350121> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MicrogramRouterFragment.this.new C350121(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C350121) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Event<MicrogramRouterDuxo2>> eventFlow = MicrogramRouterFragment.this.getDuxo().getEventFlow();
                final MicrogramRouterFragment microgramRouterFragment = MicrogramRouterFragment.this;
                FlowCollector<? super Event<MicrogramRouterDuxo2>> flowCollector = new FlowCollector() { // from class: com.robinhood.microgram.sdui.MicrogramRouterFragment.onViewCreated.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Event<MicrogramRouterDuxo2>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(final Event<MicrogramRouterDuxo2> event, Continuation<? super Unit> continuation) {
                        EventConsumer<MicrogramRouterDuxo2> eventConsumerInvoke;
                        if (event != null) {
                            final MicrogramRouterFragment microgramRouterFragment2 = microgramRouterFragment;
                            if ((event.getData() instanceof MicrogramRouterDuxo2) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                                eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.microgram.sdui.MicrogramRouterFragment$onViewCreated$1$1$emit$$inlined$consumeIfType$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                        m22945invoke(obj2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m22945invoke(Object it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        microgramRouterFragment2.handleEvent((MicrogramRouterDuxo2) event.getData());
                                    }
                                });
                            }
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (eventFlow.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new ExceptionsH();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEvent(MicrogramRouterDuxo2 event) {
        if (Intrinsics.areEqual(event, MicrogramRouterDuxo2.DismissAll.INSTANCE)) {
            dismissAll();
            return;
        }
        if (Intrinsics.areEqual(event, MicrogramRouterDuxo2.DismissBottomSheet.INSTANCE)) {
            MicrogramBottomSheetFragment microgramBottomSheetFragment = (MicrogramBottomSheetFragment) getChildFragmentManager().findFragmentByTag("microgram-bottom-sheet");
            if (microgramBottomSheetFragment != null) {
                microgramBottomSheetFragment.dismiss();
                return;
            }
            return;
        }
        if (Intrinsics.areEqual(event, MicrogramRouterDuxo2.DismissScreen.INSTANCE)) {
            if (getChildFragmentManager().getBackStackEntryCount() > 0) {
                getChildFragmentManager().popBackStack();
                return;
            } else {
                dismissAll();
                return;
            }
        }
        if (event instanceof MicrogramRouterDuxo2.PresentAlert) {
            MicrogramAlertDialogFragment microgramAlertDialogFragment = (MicrogramAlertDialogFragment) MicrogramAlertDialogFragment.INSTANCE.newInstance((Parcelable) new MicrogramAlertDialogFragment.Args(((MicrogramRouterDuxo2.PresentAlert) event).getAlertContent()));
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            microgramAlertDialogFragment.show(childFragmentManager, "microgram-alert");
            return;
        }
        if (event instanceof MicrogramRouterDuxo2.PresentBottomSheet) {
            MicrogramBottomSheetFragment microgramBottomSheetFragment2 = (MicrogramBottomSheetFragment) MicrogramBottomSheetFragment.INSTANCE.newInstance((Parcelable) new IdentifierArgs(((MicrogramRouterDuxo2.PresentBottomSheet) event).getIdentifier()));
            FragmentManager childFragmentManager2 = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "getChildFragmentManager(...)");
            microgramBottomSheetFragment2.show(childFragmentManager2, "microgram-bottom-sheet");
            return;
        }
        if (event instanceof MicrogramRouterDuxo2.ShowRouter) {
            Companion companion = INSTANCE;
            replaceFragment(companion.newInstance((Parcelable) new Args(((MicrogramRouterDuxo2.ShowRouter) event).getInitialScreenData(), ((Args) companion.getArgs((Fragment) this)).getLoadingContent(), ((Args) companion.getArgs((Fragment) this)).getNavButtonType())));
            return;
        }
        if (event instanceof MicrogramRouterDuxo2.PushScreen) {
            MicrogramScreenFragment.Companion companion2 = MicrogramScreenFragment.INSTANCE;
            MicrogramRouterDuxo2.PushScreen pushScreen = (MicrogramRouterDuxo2.PushScreen) event;
            String identifier = pushScreen.getIdentifier();
            String encodedInitialContent = pushScreen.getEncodedInitialContent();
            RouterMessage5 screenType = pushScreen.getScreenType();
            StandardScreen5 theme = pushScreen.getTheme();
            Companion companion3 = INSTANCE;
            replaceFragment(companion2.newInstance((Parcelable) new MicrogramScreenFragment.Args(identifier, encodedInitialContent, screenType, theme, ((Args) companion3.getArgs((Fragment) this)).getLoadingContent(), ((Args) companion3.getArgs((Fragment) this)).getNavButtonType())));
            return;
        }
        if (event instanceof MicrogramRouterDuxo2.OpenDeeplink) {
            BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C350101(event, null), 3, null);
            return;
        }
        if (event instanceof MicrogramRouterDuxo2.PresentSystemDefaultShareLink) {
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            ContextsUiExtensions.openShareIntent(contextRequireContext, ((MicrogramRouterDuxo2.PresentSystemDefaultShareLink) event).getLink());
        } else {
            if (!(event instanceof MicrogramRouterDuxo2.PresentToast)) {
                throw new NoWhenBranchMatchedException();
            }
            makeToast(((MicrogramRouterDuxo2.PresentToast) event).getToast());
        }
    }

    /* compiled from: MicrogramRouterFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.microgram.sdui.MicrogramRouterFragment$handleEvent$1", m3645f = "MicrogramRouterFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_LOGS_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.microgram.sdui.MicrogramRouterFragment$handleEvent$1 */
    static final class C350101 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ MicrogramRouterDuxo2 $event;
        int label;

        /* compiled from: MicrogramRouterFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.microgram.sdui.MicrogramRouterFragment$handleEvent$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            static {
                int[] iArr = new int[NavigationTypeDto.values().length];
                try {
                    iArr[NavigationTypeDto.NAVIGATION_TYPE_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[NavigationTypeDto.NAVIGATION_TYPE_PUSH.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[NavigationTypeDto.NAVIGATION_TYPE_PRESENT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[RouterMessage3.values().length];
                try {
                    iArr2[RouterMessage3.PUSH.ordinal()] = 1;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr2[RouterMessage3.PRESENT.ordinal()] = 2;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$1 = iArr2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C350101(MicrogramRouterDuxo2 microgramRouterDuxo2, Continuation<? super C350101> continuation) {
            super(2, continuation);
            this.$event = microgramRouterDuxo2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MicrogramRouterFragment.this.new C350101(this.$event, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C350101) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            com.robinhood.android.navigation.NavigationType navigationType;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Navigator navigator = MicrogramRouterFragment.this.getNavigator();
                Context contextRequireContext = MicrogramRouterFragment.this.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                Uri url = ((MicrogramRouterDuxo2.OpenDeeplink) this.$event).getUrl();
                UiObject<RouterMessage3, NavigationTypeDto> navigationType2 = ((MicrogramRouterDuxo2.OpenDeeplink) this.$event).getNavigationType();
                if (navigationType2 instanceof UiObject.Idl) {
                    int i2 = WhenMappings.$EnumSwitchMapping$0[((NavigationTypeDto) ((UiObject.Idl) navigationType2).getValue()).ordinal()];
                    if (i2 == 1) {
                        navigationType = null;
                    } else if (i2 == 2) {
                        navigationType = com.robinhood.android.navigation.NavigationType.PUSH;
                    } else {
                        if (i2 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        navigationType = com.robinhood.android.navigation.NavigationType.PRESENT;
                    }
                } else {
                    if (!(navigationType2 instanceof UiObject.Legacy)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i3 = WhenMappings.$EnumSwitchMapping$1[((RouterMessage3) ((UiObject.Legacy) navigationType2).getValue()).ordinal()];
                    if (i3 == 1) {
                        navigationType = com.robinhood.android.navigation.NavigationType.PUSH;
                    } else {
                        if (i3 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        navigationType = com.robinhood.android.navigation.NavigationType.PRESENT;
                    }
                }
                com.robinhood.android.navigation.NavigationType navigationType3 = navigationType;
                this.label = 1;
                if (Navigator.DefaultImpls.handleDeepLinkDirect$default(navigator, contextRequireContext, url, false, false, navigationType3, this, 8, null) == coroutine_suspended) {
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

    @Override // com.robinhood.microgram.sdui.MicrogramAppUtils
    public MicrogramManager2 getInstance() {
        return getCallbacks().getInstance();
    }

    private final void dismissAll() {
        getCallbacks().dismissChild();
    }

    private final void makeToast(UiObject<ToastData, ToastDto> toast) {
        Toast2.showToast(BentoToast2.INSTANCE.getBentoToastHost(this), toast, new Function2() { // from class: com.robinhood.microgram.sdui.MicrogramRouterFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MicrogramRouterFragment.makeToast$lambda$0(this.f$0, (String) obj, (MicrogramAction) obj2);
            }
        }, new Function1() { // from class: com.robinhood.microgram.sdui.MicrogramRouterFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MicrogramRouterFragment.makeToast$lambda$1(this.f$0, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit makeToast$lambda$0(MicrogramRouterFragment microgramRouterFragment, String toastId, MicrogramAction action) {
        Intrinsics.checkNotNullParameter(toastId, "toastId");
        Intrinsics.checkNotNullParameter(action, "action");
        microgramRouterFragment.getDuxo().onToastAction(microgramRouterFragment.getRouterIdentifier(), toastId, action);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit makeToast$lambda$1(MicrogramRouterFragment microgramRouterFragment, String toastId) {
        Intrinsics.checkNotNullParameter(toastId, "toastId");
        microgramRouterFragment.getDuxo().onToastDismissed(microgramRouterFragment.getRouterIdentifier(), toastId);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.microgram.sdui.ChildFragmentCallbacks
    public void dismissChild() {
        if (getChildFragmentManager().getBackStackEntryCount() > 0) {
            getChildFragmentManager().popBackStack();
        } else {
            getCallbacks().dismissChild();
        }
    }

    @Override // com.robinhood.microgram.sdui.ChildFragmentCallbacks
    public void dismissEntireMicrogramFlow() {
        getCallbacks().dismissEntireMicrogramFlow();
    }

    @Override // com.robinhood.microgram.sdui.MicrogramAlertDialogFragment.Callbacks
    public void handleAlertAction(MicrogramAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        getDuxo().onAlertAction(getRouterIdentifier(), action);
    }

    /* compiled from: MicrogramRouterFragment.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J\t\u0010\u0015\u001a\u00020\nHÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0006\u0010\u0017\u001a\u00020\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0018HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0018R!\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006%"}, m3636d2 = {"Lcom/robinhood/microgram/sdui/MicrogramRouterFragment$Args;", "Landroid/os/Parcelable;", "initialScreenData", "Lcom/robinhood/android/shared/serverui/utils/UiObject;", "Lcom/robinhood/microgram/sdui/InitialScreenData;", "Lmicrogram/ui/v1/InitialScreenDataDto;", "Lcom/robinhood/microgram/sdui/AnyInitialScreenData;", "loadingContent", "Lcom/robinhood/shared/common/contracts/LoadingContent;", "navButtonType", "Lcom/robinhood/shared/common/contracts/LoadingNavButtonType;", "<init>", "(Lcom/robinhood/android/shared/serverui/utils/UiObject;Lcom/robinhood/shared/common/contracts/LoadingContent;Lcom/robinhood/shared/common/contracts/LoadingNavButtonType;)V", "getInitialScreenData", "()Lcom/robinhood/android/shared/serverui/utils/UiObject;", "getLoadingContent", "()Lcom/robinhood/shared/common/contracts/LoadingContent;", "getNavButtonType", "()Lcom/robinhood/shared/common/contracts/LoadingNavButtonType;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-microgram-sdui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final UiObject<InitialScreenData, InitialScreenDataDto> initialScreenData;
        private final MicrogramRouterFragmentKey2 loadingContent;
        private final MicrogramRouterFragmentKey3 navButtonType;

        /* compiled from: MicrogramRouterFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((UiObject) parcel.readParcelable(Args.class.getClassLoader()), MicrogramRouterFragmentKey2.valueOf(parcel.readString()), MicrogramRouterFragmentKey3.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Args copy$default(Args args, UiObject uiObject, MicrogramRouterFragmentKey2 microgramRouterFragmentKey2, MicrogramRouterFragmentKey3 microgramRouterFragmentKey3, int i, Object obj) {
            if ((i & 1) != 0) {
                uiObject = args.initialScreenData;
            }
            if ((i & 2) != 0) {
                microgramRouterFragmentKey2 = args.loadingContent;
            }
            if ((i & 4) != 0) {
                microgramRouterFragmentKey3 = args.navButtonType;
            }
            return args.copy(uiObject, microgramRouterFragmentKey2, microgramRouterFragmentKey3);
        }

        public final UiObject<InitialScreenData, InitialScreenDataDto> component1() {
            return this.initialScreenData;
        }

        /* renamed from: component2, reason: from getter */
        public final MicrogramRouterFragmentKey2 getLoadingContent() {
            return this.loadingContent;
        }

        /* renamed from: component3, reason: from getter */
        public final MicrogramRouterFragmentKey3 getNavButtonType() {
            return this.navButtonType;
        }

        public final Args copy(UiObject<InitialScreenData, InitialScreenDataDto> initialScreenData, MicrogramRouterFragmentKey2 loadingContent, MicrogramRouterFragmentKey3 navButtonType) {
            Intrinsics.checkNotNullParameter(initialScreenData, "initialScreenData");
            Intrinsics.checkNotNullParameter(loadingContent, "loadingContent");
            Intrinsics.checkNotNullParameter(navButtonType, "navButtonType");
            return new Args(initialScreenData, loadingContent, navButtonType);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return Intrinsics.areEqual(this.initialScreenData, args.initialScreenData) && this.loadingContent == args.loadingContent && this.navButtonType == args.navButtonType;
        }

        public int hashCode() {
            return (((this.initialScreenData.hashCode() * 31) + this.loadingContent.hashCode()) * 31) + this.navButtonType.hashCode();
        }

        public String toString() {
            return "Args(initialScreenData=" + this.initialScreenData + ", loadingContent=" + this.loadingContent + ", navButtonType=" + this.navButtonType + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.initialScreenData, flags);
            dest.writeString(this.loadingContent.name());
            dest.writeString(this.navButtonType.name());
        }

        public Args(UiObject<InitialScreenData, InitialScreenDataDto> initialScreenData, MicrogramRouterFragmentKey2 loadingContent, MicrogramRouterFragmentKey3 navButtonType) {
            Intrinsics.checkNotNullParameter(initialScreenData, "initialScreenData");
            Intrinsics.checkNotNullParameter(loadingContent, "loadingContent");
            Intrinsics.checkNotNullParameter(navButtonType, "navButtonType");
            this.initialScreenData = initialScreenData;
            this.loadingContent = loadingContent;
            this.navButtonType = navButtonType;
        }

        public final UiObject<InitialScreenData, InitialScreenDataDto> getInitialScreenData() {
            return this.initialScreenData;
        }

        public final MicrogramRouterFragmentKey2 getLoadingContent() {
            return this.loadingContent;
        }

        public /* synthetic */ Args(UiObject uiObject, MicrogramRouterFragmentKey2 microgramRouterFragmentKey2, MicrogramRouterFragmentKey3 microgramRouterFragmentKey3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(uiObject, microgramRouterFragmentKey2, (i & 4) != 0 ? MicrogramRouterFragmentKey3.BACK : microgramRouterFragmentKey3);
        }

        public final MicrogramRouterFragmentKey3 getNavButtonType() {
            return this.navButtonType;
        }
    }

    /* compiled from: MicrogramRouterFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/microgram/sdui/MicrogramRouterFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/microgram/sdui/MicrogramRouterFragment;", "Lcom/robinhood/microgram/sdui/MicrogramRouterFragment$Args;", "<init>", "()V", "feature-microgram-sdui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<MicrogramRouterFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(MicrogramRouterFragment microgramRouterFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, microgramRouterFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public MicrogramRouterFragment newInstance(Args args) {
            return (MicrogramRouterFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(MicrogramRouterFragment microgramRouterFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, microgramRouterFragment, args);
        }
    }
}
