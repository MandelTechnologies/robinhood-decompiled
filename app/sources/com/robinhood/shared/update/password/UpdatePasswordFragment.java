package com.robinhood.shared.update.password;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.lib.stepupverification.SuvLauncher;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.update.password.UpdatePasswordDuxo8;
import com.robinhood.shared.update.password.UpdatePasswordFragment;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCompanion;
import com.robinhood.utils.resource.StringResource;
import java.util.NoSuchElementException;
import java.util.UUID;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: UpdatePasswordFragment.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0007\u0018\u0000 &2\u00020\u00012\u00020\u0002:\u0002%&B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\r\u0010\u001f\u001a\u00020\u0015H\u0017¢\u0006\u0002\u0010 J\u0018\u0010!\u001a\u00020\u00152\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#H\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR \u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006'²\u0006\n\u0010(\u001a\u00020)X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/shared/update/password/UpdatePasswordFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "callbacks", "Lcom/robinhood/shared/update/password/UpdatePasswordFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/shared/update/password/UpdatePasswordFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/shared/update/password/UpdatePasswordDuxo;", "getDuxo", "()Lcom/robinhood/shared/update/password/UpdatePasswordDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "launchSuv", "Lkotlin/Function2;", "Ljava/util/UUID;", "", "", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "processEvent", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/shared/update/password/UpdatePasswordEvent;", "Callbacks", "Companion", "feature-update-password_externalDebug", "viewState", "Lcom/robinhood/shared/update/password/UpdatePasswordViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class UpdatePasswordFragment extends GenericComposeFragment implements AutoLoggableFragment {
    private final Screen eventScreen;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(UpdatePasswordFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/shared/update/password/UpdatePasswordFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.shared.update.password.UpdatePasswordFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof UpdatePasswordFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, UpdatePasswordDuxo.class);
    private final Function2<UUID, Boolean, Unit> launchSuv = SuvLauncher.registerSuvLauncher$default(this, new Function0() { // from class: com.robinhood.shared.update.password.UpdatePasswordFragment$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.f$0.getNavigator();
        }
    }, new Function0() { // from class: com.robinhood.shared.update.password.UpdatePasswordFragment$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return UpdatePasswordFragment.launchSuv$lambda$1(this.f$0);
        }
    }, (Function0) null, 4, (Object) null);

    /* compiled from: UpdatePasswordFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/shared/update/password/UpdatePasswordFragment$Callbacks;", "", "onUpdatePasswordSuccess", "", "onForgotPassword", "feature-update-password_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onForgotPassword();

        void onUpdatePasswordSuccess();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$3(UpdatePasswordFragment updatePasswordFragment, int i, Composer composer, int i2) {
        updatePasswordFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
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
    public com.robinhood.rosetta.eventlogging.Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    public UpdatePasswordFragment() {
        Screen.Name name = Screen.Name.PASSWORD_UPDATE;
        this.eventScreen = new Screen(name, null, null, null, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UpdatePasswordDuxo getDuxo() {
        return (UpdatePasswordDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processEvent(final Event<UpdatePasswordDuxo8> event) {
        EventConsumer<UpdatePasswordDuxo8> eventConsumerInvoke;
        if (event == null || !(event.getData() instanceof UpdatePasswordDuxo8) || (eventConsumerInvoke = event.getGetEventConsumer().invoke()) == null) {
            return;
        }
        eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.shared.update.password.UpdatePasswordFragment$processEvent$$inlined$consumeIfType$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
                m26405invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m26405invoke(Object it) throws Throwable {
                Intrinsics.checkNotNullParameter(it, "it");
                UpdatePasswordDuxo8 updatePasswordDuxo8 = (UpdatePasswordDuxo8) event.getData();
                if (updatePasswordDuxo8 instanceof UpdatePasswordDuxo8.Error) {
                    ActivityErrorHandler.Companion companion = ActivityErrorHandler.INSTANCE;
                    FragmentActivity fragmentActivityRequireActivity = this.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                    ActivityErrorHandler.Companion.handle$default(companion, fragmentActivityRequireActivity, ((UpdatePasswordDuxo8.Error) updatePasswordDuxo8).getThrowable(), true, false, 0, Integer.valueOf(C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Monochrome), 24, null);
                    return;
                }
                if (Intrinsics.areEqual(updatePasswordDuxo8, UpdatePasswordDuxo8.UpdatePasswordSuccess.INSTANCE)) {
                    this.getCallbacks().onUpdatePasswordSuccess();
                    return;
                }
                if (updatePasswordDuxo8 instanceof UpdatePasswordDuxo8.VerificationWorkflow) {
                    UpdatePasswordDuxo8.VerificationWorkflow verificationWorkflow = (UpdatePasswordDuxo8.VerificationWorkflow) updatePasswordDuxo8;
                    this.launchSuv.invoke(verificationWorkflow.getWorkflowId(), Boolean.valueOf(verificationWorkflow.isMigrated()));
                } else {
                    if (Intrinsics.areEqual(updatePasswordDuxo8, UpdatePasswordDuxo8.UpdatePassword.INSTANCE)) {
                        this.getDuxo().updatePassword();
                        return;
                    }
                    throw new NoWhenBranchMatchedException();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launchSuv$lambda$1(UpdatePasswordFragment updatePasswordFragment) {
        updatePasswordFragment.getDuxo().updatePassword();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return this.eventScreen;
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C412211(null), 1, null);
    }

    /* compiled from: UpdatePasswordFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.update.password.UpdatePasswordFragment$onViewCreated$1", m3645f = "UpdatePasswordFragment.kt", m3646l = {45}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.update.password.UpdatePasswordFragment$onViewCreated$1 */
    static final class C412211 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C412211(Continuation<? super C412211> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return UpdatePasswordFragment.this.new C412211(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C412211) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: UpdatePasswordFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.shared.update.password.UpdatePasswordFragment$onViewCreated$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ UpdatePasswordFragment $tmp0;

            AnonymousClass1(UpdatePasswordFragment updatePasswordFragment) {
                this.$tmp0 = updatePasswordFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, UpdatePasswordFragment.class, "processEvent", "processEvent(Lcom/robinhood/android/udf/event/Event;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(Event<UpdatePasswordDuxo8> event, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$processEvent = C412211.invokeSuspend$processEvent(this.$tmp0, event, continuation);
                return objInvokeSuspend$processEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$processEvent : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((Event<UpdatePasswordDuxo8>) obj, (Continuation<? super Unit>) continuation);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(UpdatePasswordFragment.this.getDuxo().getEventFlow());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(UpdatePasswordFragment.this);
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
        public static final /* synthetic */ Object invokeSuspend$processEvent(UpdatePasswordFragment updatePasswordFragment, Event event, Continuation continuation) {
            updatePasswordFragment.processEvent(event);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(816763555);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(816763555, i2, -1, "com.robinhood.shared.update.password.UpdatePasswordFragment.ComposeContent (UpdatePasswordFragment.kt:49)");
            }
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-297623826, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.update.password.UpdatePasswordFragment.ComposeContent.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) throws Resources.NotFoundException {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
                /* JADX WARN: Removed duplicated region for block: B:23:0x006d  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void invoke(Composer composer2, int i3) throws Resources.NotFoundException {
                    String string2;
                    String string3;
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-297623826, i3, -1, "com.robinhood.shared.update.password.UpdatePasswordFragment.ComposeContent.<anonymous> (UpdatePasswordFragment.kt:53)");
                    }
                    boolean zIsLoading = UpdatePasswordFragment.ComposeContent$lambda$2(snapshotState4CollectAsStateWithLifecycle).isLoading();
                    StringResource currentPasswordError = UpdatePasswordFragment.ComposeContent$lambda$2(snapshotState4CollectAsStateWithLifecycle).getCurrentPasswordError();
                    String string4 = null;
                    if (currentPasswordError != null) {
                        Resources resources = UpdatePasswordFragment.this.getResources();
                        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                        CharSequence text = currentPasswordError.getText(resources);
                        string2 = text != null ? text.toString() : null;
                    }
                    StringResource newPasswordError = UpdatePasswordFragment.ComposeContent$lambda$2(snapshotState4CollectAsStateWithLifecycle).getNewPasswordError();
                    if (newPasswordError != null) {
                        Resources resources2 = UpdatePasswordFragment.this.getResources();
                        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
                        CharSequence text2 = newPasswordError.getText(resources2);
                        string3 = text2 != null ? text2.toString() : null;
                    }
                    StringResource confirmNewPasswordError = UpdatePasswordFragment.ComposeContent$lambda$2(snapshotState4CollectAsStateWithLifecycle).getConfirmNewPasswordError();
                    if (confirmNewPasswordError != null) {
                        Resources resources3 = UpdatePasswordFragment.this.getResources();
                        Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
                        CharSequence text3 = confirmNewPasswordError.getText(resources3);
                        if (text3 != null) {
                            string4 = text3.toString();
                        }
                    }
                    Callbacks callbacks = UpdatePasswordFragment.this.getCallbacks();
                    composer2.startReplaceGroup(5004770);
                    boolean zChangedInstance = composer2.changedInstance(callbacks);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new UpdatePasswordFragment2(callbacks);
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    composer2.endReplaceGroup();
                    Function0 function0 = (Function0) ((KFunction) objRememberedValue);
                    UpdatePasswordDuxo duxo = UpdatePasswordFragment.this.getDuxo();
                    composer2.startReplaceGroup(5004770);
                    boolean zChangedInstance2 = composer2.changedInstance(duxo);
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new UpdatePasswordFragment3(duxo);
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceGroup();
                    UpdatePasswordComposable2.UpdatePasswordComposable(zIsLoading, string2, string3, string4, function0, (Function3) ((KFunction) objRememberedValue2), composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.update.password.UpdatePasswordFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UpdatePasswordFragment.ComposeContent$lambda$3(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UpdatePasswordViewState ComposeContent$lambda$2(SnapshotState4<UpdatePasswordViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* compiled from: UpdatePasswordFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/shared/update/password/UpdatePasswordFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithoutArgsCompanion;", "Lcom/robinhood/shared/update/password/UpdatePasswordFragment;", "<init>", "()V", "feature-update-password_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithoutArgsCompanion<UpdatePasswordFragment> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public /* bridge */ /* synthetic */ Parcelable getArgs(Fragment fragment) {
            return (Parcelable) getArgs((UpdatePasswordFragment) fragment);
        }

        public Void getArgs(UpdatePasswordFragment updatePasswordFragment) {
            return FragmentWithoutArgsCompanion.DefaultImpls.getArgs(this, updatePasswordFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCreator
        public UpdatePasswordFragment newInstance() {
            return (UpdatePasswordFragment) FragmentWithoutArgsCompanion.DefaultImpls.newInstance(this);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCreator
        public UpdatePasswordFragment newInstance(Void r1) {
            return (UpdatePasswordFragment) FragmentWithoutArgsCompanion.DefaultImpls.newInstance(this, r1);
        }
    }
}
