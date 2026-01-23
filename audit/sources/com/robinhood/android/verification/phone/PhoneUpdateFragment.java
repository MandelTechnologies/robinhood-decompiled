package com.robinhood.android.verification.phone;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.jakewharton.rxbinding3.widget.RxTextView;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.InternationalInfo;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.designsystem.textinput.RdsFormattedEditText;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.verification.C31368R;
import com.robinhood.android.verification.databinding.FragmentPhoneUpdateBinding;
import com.robinhood.android.verification.phone.PhoneUpdateEvent;
import com.robinhood.android.verification.phone.PhoneUpdateFragment;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.common.contracts.SelectCountryCodeFragmentKey;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: PhoneUpdateFragment.kt */
@Metadata(m3635d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000 =2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002<=B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\b\u0010-\u001a\u00020(H\u0016J\u0010\u0010.\u001a\u00020(2\u0006\u0010/\u001a\u000200H\u0016J\u0010\u00101\u001a\u00020(2\u0006\u0010/\u001a\u000200H\u0002J\u0010\u00102\u001a\u00020(2\u0006\u00103\u001a\u000204H\u0002J\u0016\u00105\u001a\u00020(2\f\u00106\u001a\b\u0012\u0004\u0012\u00020807H\u0002J\u0010\u00109\u001a\u00020(2\u0006\u0010:\u001a\u00020;H\u0002R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001e\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b \u0010!R\u0014\u0010#\u001a\u00020$X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&¨\u0006>"}, m3636d2 = {"Lcom/robinhood/android/verification/phone/PhoneUpdateFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/shared/common/contracts/SelectCountryCodeFragmentKey$Callbacks;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "appType", "Lcom/robinhood/shared/app/type/AppType;", "getAppType", "()Lcom/robinhood/shared/app/type/AppType;", "setAppType", "(Lcom/robinhood/shared/app/type/AppType;)V", "duxo", "Lcom/robinhood/android/verification/phone/PhoneUpdateDuxo;", "getDuxo", "()Lcom/robinhood/android/verification/phone/PhoneUpdateDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/verification/databinding/FragmentPhoneUpdateBinding;", "getBinding", "()Lcom/robinhood/android/verification/databinding/FragmentPhoneUpdateBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/verification/phone/PhoneUpdateFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/verification/phone/PhoneUpdateFragment$Callbacks;", "callbacks$delegate", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onCountryCodeSelected", "countryCode", "Lcom/robinhood/iso/countrycode/CountryCode;", "setCountryCode", "bind", "state", "Lcom/robinhood/android/verification/phone/PhoneUpdateViewState;", "handleEvent", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/verification/phone/PhoneUpdateEvent;", "onLoading", "isLoading", "", "Callbacks", "Companion", "feature-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class PhoneUpdateFragment extends BaseFragment implements SelectCountryCodeFragmentKey.Callbacks, AutoLoggableFragment {
    private static final String SELECT_COUNTRY_CODE_BOTTOM_SHEET_TAG = "selectCountryCodeBottomSheetTag";
    public AppType appType;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public EventLogger eventLogger;
    private final Screen eventScreen;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(PhoneUpdateFragment.class, "binding", "getBinding()Lcom/robinhood/android/verification/databinding/FragmentPhoneUpdateBinding;", 0)), Reflection.property1(new PropertyReference1Impl(PhoneUpdateFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/verification/phone/PhoneUpdateFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: PhoneUpdateFragment.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/verification/phone/PhoneUpdateFragment$Callbacks;", "", "onSuvRequired", "", "phoneNumber", "", "workflowId", "Ljava/util/UUID;", "isMigrated", "", "onPhoneNumberUpdateCompleted", "feature-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onPhoneNumberUpdateCompleted(String phoneNumber);

        void onSuvRequired(String phoneNumber, UUID workflowId, boolean isMigrated);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenAppearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenAppearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenDisappearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenDisappearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenSourceEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenSourceEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Component getScreenEventComponent() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventComponent(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    public PhoneUpdateFragment() {
        super(C31368R.layout.fragment_phone_update);
        this.duxo = DuxosKt.duxo(this, PhoneUpdateDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, PhoneUpdateFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.verification.phone.PhoneUpdateFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (android.content.Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof PhoneUpdateFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        this.eventScreen = new Screen(Screen.Name.PHONE_UPDATE, null, null, null, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEvent(final Event<PhoneUpdateEvent> event) {
        EventConsumer<PhoneUpdateEvent> eventConsumerInvoke;
        if (!(event.getData() instanceof PhoneUpdateEvent) || (eventConsumerInvoke = event.getGetEventConsumer().invoke()) == null) {
            return;
        }
        eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.verification.phone.PhoneUpdateFragment$handleEvent$$inlined$consumeIfType$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
                m20056invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m20056invoke(Object it) throws Throwable {
                Intrinsics.checkNotNullParameter(it, "it");
                PhoneUpdateEvent phoneUpdateEvent = (PhoneUpdateEvent) event.getData();
                if (phoneUpdateEvent instanceof PhoneUpdateEvent.Error) {
                    ActivityErrorHandler.Companion companion = ActivityErrorHandler.INSTANCE;
                    FragmentActivity fragmentActivityRequireActivity = this.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                    ActivityErrorHandler.Companion.handle$default(companion, fragmentActivityRequireActivity, ((PhoneUpdateEvent.Error) phoneUpdateEvent).getThrowable(), true, false, 0, null, 56, null);
                    return;
                }
                if (phoneUpdateEvent instanceof PhoneUpdateEvent.InitialLocality) {
                    this.setCountryCode(((PhoneUpdateEvent.InitialLocality) phoneUpdateEvent).getCountryCode());
                    return;
                }
                if (phoneUpdateEvent instanceof PhoneUpdateEvent.StartSuv) {
                    PhoneUpdateEvent.StartSuv startSuv = (PhoneUpdateEvent.StartSuv) phoneUpdateEvent;
                    this.getCallbacks().onSuvRequired(startSuv.getPhoneNumber(), startSuv.getWorkflowId(), startSuv.isMigrated());
                } else {
                    if (phoneUpdateEvent instanceof PhoneUpdateEvent.Success) {
                        this.getCallbacks().onPhoneNumberUpdateCompleted(((PhoneUpdateEvent.Success) phoneUpdateEvent).getPhoneNumber());
                        return;
                    }
                    throw new NoWhenBranchMatchedException();
                }
            }
        });
    }

    public final EventLogger getEventLogger() {
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            return eventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void setEventLogger(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "<set-?>");
        this.eventLogger = eventLogger;
    }

    public final AppType getAppType() {
        AppType appType = this.appType;
        if (appType != null) {
            return appType;
        }
        Intrinsics.throwUninitializedPropertyAccessException("appType");
        return null;
    }

    public final void setAppType(AppType appType) {
        Intrinsics.checkNotNullParameter(appType, "<set-?>");
        this.appType = appType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PhoneUpdateDuxo getDuxo() {
        return (PhoneUpdateDuxo) this.duxo.getValue();
    }

    private final FragmentPhoneUpdateBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentPhoneUpdateBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return this.eventScreen;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        BaseFragment.collectDuxoState$default(this, null, new C314391(null), 1, null);
        RdsTextButton phoneUpdateChangeCountryCodeBtn = getBinding().phoneUpdateChangeCountryCodeBtn;
        Intrinsics.checkNotNullExpressionValue(phoneUpdateChangeCountryCodeBtn, "phoneUpdateChangeCountryCodeBtn");
        OnClickListeners.onClick(phoneUpdateChangeCountryCodeBtn, new Function0() { // from class: com.robinhood.android.verification.phone.PhoneUpdateFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PhoneUpdateFragment.onViewCreated$lambda$1(this.f$0);
            }
        });
        getBinding().numpad.useDefaultKeyHandler();
    }

    /* compiled from: PhoneUpdateFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.verification.phone.PhoneUpdateFragment$onViewCreated$1", m3645f = "PhoneUpdateFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.verification.phone.PhoneUpdateFragment$onViewCreated$1 */
    static final class C314391 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C314391(Continuation<? super C314391> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C314391 c314391 = PhoneUpdateFragment.this.new C314391(continuation);
            c314391.L$0 = obj;
            return c314391;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C314391) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: PhoneUpdateFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.verification.phone.PhoneUpdateFragment$onViewCreated$1$1", m3645f = "PhoneUpdateFragment.kt", m3646l = {60}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.verification.phone.PhoneUpdateFragment$onViewCreated$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ PhoneUpdateFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(PhoneUpdateFragment phoneUpdateFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = phoneUpdateFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: PhoneUpdateFragment.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.verification.phone.PhoneUpdateFragment$onViewCreated$1$1$1, reason: invalid class name and collision with other inner class name */
            /* synthetic */ class C506451 extends AdaptedFunctionReference implements Function2<PhoneUpdateViewState, Continuation<? super Unit>, Object>, ContinuationImpl6 {
                C506451(Object obj) {
                    super(2, obj, PhoneUpdateFragment.class, "bind", "bind(Lcom/robinhood/android/verification/phone/PhoneUpdateViewState;)V", 4);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(PhoneUpdateViewState phoneUpdateViewState, Continuation<? super Unit> continuation) {
                    return AnonymousClass1.invokeSuspend$bind((PhoneUpdateFragment) this.receiver, phoneUpdateViewState, continuation);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow<PhoneUpdateViewState> stateFlow = this.this$0.getDuxo().getStateFlow();
                    C506451 c506451 = new C506451(this.this$0);
                    this.label = 1;
                    if (FlowKt.collectLatest(stateFlow, c506451, this) == coroutine_suspended) {
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

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ Object invokeSuspend$bind(PhoneUpdateFragment phoneUpdateFragment, PhoneUpdateViewState phoneUpdateViewState, Continuation continuation) {
                phoneUpdateFragment.bind(phoneUpdateViewState);
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(PhoneUpdateFragment.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(PhoneUpdateFragment.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: PhoneUpdateFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.verification.phone.PhoneUpdateFragment$onViewCreated$1$2", m3645f = "PhoneUpdateFragment.kt", m3646l = {63}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.verification.phone.PhoneUpdateFragment$onViewCreated$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ PhoneUpdateFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(PhoneUpdateFragment phoneUpdateFragment, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = phoneUpdateFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: PhoneUpdateFragment.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.verification.phone.PhoneUpdateFragment$onViewCreated$1$2$1, reason: invalid class name */
            /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
                final /* synthetic */ PhoneUpdateFragment $tmp0;

                AnonymousClass1(PhoneUpdateFragment phoneUpdateFragment) {
                    this.$tmp0 = phoneUpdateFragment;
                }

                public final boolean equals(Object obj) {
                    if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                        return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                    }
                    return false;
                }

                @Override // kotlin.jvm.internal.FunctionAdapter
                public final Function<?> getFunctionDelegate() {
                    return new AdaptedFunctionReference(2, this.$tmp0, PhoneUpdateFragment.class, "handleEvent", "handleEvent(Lcom/robinhood/android/udf/event/Event;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }

                public final Object emit(Event<PhoneUpdateEvent> event, Continuation<? super Unit> continuation) {
                    Object objInvokeSuspend$handleEvent = AnonymousClass2.invokeSuspend$handleEvent(this.$tmp0, event, continuation);
                    return objInvokeSuspend$handleEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$handleEvent : Unit.INSTANCE;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                    return emit((Event<PhoneUpdateEvent>) obj, (Continuation<? super Unit>) continuation);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowFilterNotNull = FlowKt.filterNotNull(this.this$0.getDuxo().getEventFlow());
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0);
                    this.label = 1;
                    if (flowFilterNotNull.collect(anonymousClass1, this) == coroutine_suspended) {
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

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ Object invokeSuspend$handleEvent(PhoneUpdateFragment phoneUpdateFragment, Event event, Continuation continuation) {
                phoneUpdateFragment.handleEvent(event);
                return Unit.INSTANCE;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(PhoneUpdateFragment phoneUpdateFragment) {
        Navigator navigator = phoneUpdateFragment.getNavigator();
        List<InternationalInfo> sortedInternationalInfos = InternationalInfo.INSTANCE.getSortedInternationalInfos();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(sortedInternationalInfos, 10));
        Iterator<T> it = sortedInternationalInfos.iterator();
        while (it.hasNext()) {
            arrayList.add(((InternationalInfo) it.next()).getCountryCode());
        }
        Navigator.DefaultImpls.createDialogFragment$default(navigator, new SelectCountryCodeFragmentKey(arrayList, phoneUpdateFragment.getAppType() == AppType.RHC), null, 2, null).show(phoneUpdateFragment.getChildFragmentManager(), SELECT_COUNTRY_CODE_BOTTOM_SHEET_TAG);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        RdsFormattedEditText updatePhoneInput = getBinding().updatePhoneInput;
        Intrinsics.checkNotNullExpressionValue(updatePhoneInput, "updatePhoneInput");
        LifecycleHost.DefaultImpls.bind$default(this, RxTextView.textChanges(updatePhoneInput), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.verification.phone.PhoneUpdateFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PhoneUpdateFragment.onStart$lambda$2(this.f$0, (CharSequence) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$2(PhoneUpdateFragment phoneUpdateFragment, CharSequence it) {
        Intrinsics.checkNotNullParameter(it, "it");
        phoneUpdateFragment.getDuxo().setPhoneNumberTypedText(phoneUpdateFragment.getBinding().updatePhoneInput.getTypedText());
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.shared.common.contracts.SelectCountryCodeFragmentKey.Callbacks
    public void onCountryCodeSelected(CountryCode countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        setCountryCode(countryCode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCountryCode(CountryCode countryCode) {
        InternationalInfo internationalInfoFromCountryCode$default = InternationalInfo.Companion.fromCountryCode$default(InternationalInfo.INSTANCE, null, countryCode, 1, null);
        getBinding().updatePhoneInput.setTemplate(internationalInfoFromCountryCode$default.getCountryCodePhoneNumberTemplate(), internationalInfoFromCountryCode$default.getCountryCodePhoneNumberHint());
        getDuxo().setInternationalInfo(internationalInfoFromCountryCode$default);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(final PhoneUpdateViewState state) {
        onLoading(state.isLoading());
        getBinding().numpad.setButtonEnabled(state.isValidPhoneNumber());
        getBinding().numpad.setOnButtonClick(new Function0() { // from class: com.robinhood.android.verification.phone.PhoneUpdateFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PhoneUpdateFragment.bind$lambda$3(this.f$0, state);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$3(PhoneUpdateFragment phoneUpdateFragment, PhoneUpdateViewState phoneUpdateViewState) {
        phoneUpdateFragment.getDuxo().startSuv(phoneUpdateViewState.getTrimmedPhoneNumber());
        return Unit.INSTANCE;
    }

    private final void onLoading(boolean isLoading) {
        requireToolbar().setLoadingViewVisible(isLoading);
        getBinding().updatePhoneInput.setEnabled(!isLoading);
        getBinding().numpad.setButtonLoading(isLoading);
    }

    /* compiled from: PhoneUpdateFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/verification/phone/PhoneUpdateFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithoutArgsCompanion;", "Lcom/robinhood/android/verification/phone/PhoneUpdateFragment;", "<init>", "()V", "SELECT_COUNTRY_CODE_BOTTOM_SHEET_TAG", "", "feature-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithoutArgsCompanion<PhoneUpdateFragment> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public /* bridge */ /* synthetic */ Parcelable getArgs(Fragment fragment) {
            return (Parcelable) getArgs((PhoneUpdateFragment) fragment);
        }

        public Void getArgs(PhoneUpdateFragment phoneUpdateFragment) {
            return FragmentWithoutArgsCompanion.DefaultImpls.getArgs(this, phoneUpdateFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCreator
        public PhoneUpdateFragment newInstance() {
            return (PhoneUpdateFragment) FragmentWithoutArgsCompanion.DefaultImpls.newInstance(this);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCreator
        public PhoneUpdateFragment newInstance(Void r1) {
            return (PhoneUpdateFragment) FragmentWithoutArgsCompanion.DefaultImpls.newInstance(this, r1);
        }
    }
}
