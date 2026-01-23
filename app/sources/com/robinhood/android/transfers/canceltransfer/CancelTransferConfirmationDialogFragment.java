package com.robinhood.android.transfers.canceltransfer;

import android.app.Dialog;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.fragment.app.Fragment;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.p088ui.BaseDialogFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.app.GenericComposeDialogFragment;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.DialogFragmentWithArgsCompanion;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: CancelTransferConfirmationDialogFragment.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 ,2\u00020\u0001:\u0003*+,B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u001a\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\r\u0010(\u001a\u00020%H\u0017¢\u0006\u0002\u0010)R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0015\u001a\u0004\b\u001d\u0010\u001e¨\u0006-"}, m3636d2 = {"Lcom/robinhood/android/transfers/canceltransfer/CancelTransferConfirmationDialogFragment;", "Lcom/robinhood/compose/app/GenericComposeDialogFragment;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "callbacks", "Lcom/robinhood/android/transfers/canceltransfer/CancelTransferConfirmationDialogFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/transfers/canceltransfer/CancelTransferConfirmationDialogFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/transfers/canceltransfer/CancelTransferConfirmationDuxo;", "getDuxo", "()Lcom/robinhood/android/transfers/canceltransfer/CancelTransferConfirmationDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "eventScreen$delegate", "component", "Lcom/robinhood/rosetta/eventlogging/Component;", "getComponent", "()Lcom/robinhood/rosetta/eventlogging/Component;", "component$delegate", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "Landroid/view/View;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "Callbacks", "Args", "Companion", "feature-transfer-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class CancelTransferConfirmationDialogFragment extends GenericComposeDialogFragment {
    public EventLogger eventLogger;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(CancelTransferConfirmationDialogFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/transfers/canceltransfer/CancelTransferConfirmationDialogFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.transfers.canceltransfer.CancelTransferConfirmationDialogFragment$special$$inlined$parentFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment;
        }
    });

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, CancelTransferConfirmationDuxo.class);

    /* renamed from: eventScreen$delegate, reason: from kotlin metadata */
    private final Lazy eventScreen = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.transfers.canceltransfer.CancelTransferConfirmationDialogFragment$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CancelTransferConfirmationDialogFragment.eventScreen_delegate$lambda$0();
        }
    });

    /* renamed from: component$delegate, reason: from kotlin metadata */
    private final Lazy component = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.transfers.canceltransfer.CancelTransferConfirmationDialogFragment$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CancelTransferConfirmationDialogFragment.component_delegate$lambda$1();
        }
    });

    /* compiled from: CancelTransferConfirmationDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/transfers/canceltransfer/CancelTransferConfirmationDialogFragment$Callbacks;", "", "onCancelSuccess", "", "onCancelFailure", "t", "", "feature-transfer-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onCancelFailure(Throwable t);

        void onCancelSuccess();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$5(CancelTransferConfirmationDialogFragment cancelTransferConfirmationDialogFragment, int i, Composer composer, int i2) {
        cancelTransferConfirmationDialogFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
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

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CancelTransferConfirmationDuxo getDuxo() {
        return (CancelTransferConfirmationDuxo) this.duxo.getValue();
    }

    private final Screen getEventScreen() {
        return (Screen) this.eventScreen.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Screen eventScreen_delegate$lambda$0() {
        return new Screen(Screen.Name.TRANSFERS, null, null, null, 14, null);
    }

    private final Component getComponent() {
        return (Component) this.component.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Component component_delegate$lambda$1() {
        return new Component(Component.ComponentType.ALERT, "CANCEL_TRANSFER", null, 4, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(savedInstanceState);
        dialogOnCreateDialog.setCanceledOnTouchOutside(false);
        return dialogOnCreateDialog;
    }

    @Override // com.robinhood.compose.app.GenericComposeDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        EventLogger.DefaultImpls.logAppear$default(getEventLogger(), null, getEventScreen(), getComponent(), null, null, 25, null);
        BaseDialogFragment.collectDuxoState$default(this, null, new C302001(null), 1, null);
    }

    /* compiled from: CancelTransferConfirmationDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.canceltransfer.CancelTransferConfirmationDialogFragment$onViewCreated$1", m3645f = "CancelTransferConfirmationDialogFragment.kt", m3646l = {73}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.canceltransfer.CancelTransferConfirmationDialogFragment$onViewCreated$1 */
    static final class C302001 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C302001(Continuation<? super C302001> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CancelTransferConfirmationDialogFragment.this.new C302001(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C302001) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(CancelTransferConfirmationDialogFragment.this.getDuxo().getEventFlow());
                final CancelTransferConfirmationDialogFragment cancelTransferConfirmationDialogFragment = CancelTransferConfirmationDialogFragment.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.transfers.canceltransfer.CancelTransferConfirmationDialogFragment.onViewCreated.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Event<Result<Unit>>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(final Event<Result<Unit>> event, Continuation<? super Unit> continuation) {
                        EventConsumer<Result<Unit>> eventConsumerInvoke;
                        final CancelTransferConfirmationDialogFragment cancelTransferConfirmationDialogFragment2 = cancelTransferConfirmationDialogFragment;
                        if ((event.getData() instanceof Result) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.transfers.canceltransfer.CancelTransferConfirmationDialogFragment$onViewCreated$1$1$emit$$inlined$consumeIfType$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    m19602invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m19602invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    Object value = ((Result) event.getData()).getValue();
                                    Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(value);
                                    if (thM28553exceptionOrNullimpl == null) {
                                        cancelTransferConfirmationDialogFragment2.dismiss();
                                        cancelTransferConfirmationDialogFragment2.getCallbacks().onCancelSuccess();
                                    } else {
                                        cancelTransferConfirmationDialogFragment2.dismiss();
                                        cancelTransferConfirmationDialogFragment2.getCallbacks().onCancelFailure(thM28553exceptionOrNullimpl);
                                    }
                                }
                            });
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

    @Override // com.robinhood.compose.app.GenericComposeDialogFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1347728464);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1347728464, i2, -1, "com.robinhood.android.transfers.canceltransfer.CancelTransferConfirmationDialogFragment.ComposeContent (CancelTransferConfirmationDialogFragment.kt:90)");
            }
            EventLogger eventLogger = getEventLogger();
            Component component = getComponent();
            Screen eventScreen = getEventScreen();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.transfers.canceltransfer.CancelTransferConfirmationDialogFragment$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CancelTransferConfirmationDialogFragment.ComposeContent$lambda$4$lambda$3(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            CancelTransferConfirmationDialogComposable.CancelTransferConfirmationDialogComposable(eventLogger, component, eventScreen, (Function0) objRememberedValue, PaddingKt.m5145paddingqDBjuR0(Background3.m4872backgroundbw27NRU$default(companion, bentoTheme.getColors(composerStartRestartGroup, i3).m21372getBg20d7_KjU(), null, 2, null), bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i3).m21593getSmallD9Ej5fM()), null, composerStartRestartGroup, 0, 32);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.canceltransfer.CancelTransferConfirmationDialogFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CancelTransferConfirmationDialogFragment.ComposeContent$lambda$5(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$4$lambda$3(CancelTransferConfirmationDialogFragment cancelTransferConfirmationDialogFragment) {
        cancelTransferConfirmationDialogFragment.dismiss();
        return Unit.INSTANCE;
    }

    /* compiled from: CancelTransferConfirmationDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/transfers/canceltransfer/CancelTransferConfirmationDialogFragment$Args;", "Landroid/os/Parcelable;", "transferHistoryEvent", "Lcom/robinhood/shared/models/history/shared/HistoryEvent;", "<init>", "(Lcom/robinhood/shared/models/history/shared/HistoryEvent;)V", "getTransferHistoryEvent", "()Lcom/robinhood/shared/models/history/shared/HistoryEvent;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-transfer-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final HistoryEvent transferHistoryEvent;

        /* compiled from: CancelTransferConfirmationDialogFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((HistoryEvent) parcel.readParcelable(Args.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, HistoryEvent historyEvent, int i, Object obj) {
            if ((i & 1) != 0) {
                historyEvent = args.transferHistoryEvent;
            }
            return args.copy(historyEvent);
        }

        /* renamed from: component1, reason: from getter */
        public final HistoryEvent getTransferHistoryEvent() {
            return this.transferHistoryEvent;
        }

        public final Args copy(HistoryEvent transferHistoryEvent) {
            Intrinsics.checkNotNullParameter(transferHistoryEvent, "transferHistoryEvent");
            return new Args(transferHistoryEvent);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Args) && Intrinsics.areEqual(this.transferHistoryEvent, ((Args) other).transferHistoryEvent);
        }

        public int hashCode() {
            return this.transferHistoryEvent.hashCode();
        }

        public String toString() {
            return "Args(transferHistoryEvent=" + this.transferHistoryEvent + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.transferHistoryEvent, flags);
        }

        public Args(HistoryEvent transferHistoryEvent) {
            Intrinsics.checkNotNullParameter(transferHistoryEvent, "transferHistoryEvent");
            this.transferHistoryEvent = transferHistoryEvent;
        }

        public final HistoryEvent getTransferHistoryEvent() {
            return this.transferHistoryEvent;
        }
    }

    /* compiled from: CancelTransferConfirmationDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/canceltransfer/CancelTransferConfirmationDialogFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/DialogFragmentWithArgsCompanion;", "Lcom/robinhood/android/transfers/canceltransfer/CancelTransferConfirmationDialogFragment;", "Lcom/robinhood/android/transfers/canceltransfer/CancelTransferConfirmationDialogFragment$Args;", "<init>", "()V", "feature-transfer-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DialogFragmentWithArgsCompanion<CancelTransferConfirmationDialogFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(CancelTransferConfirmationDialogFragment cancelTransferConfirmationDialogFragment) {
            return (Args) DialogFragmentWithArgsCompanion.DefaultImpls.getArgs(this, cancelTransferConfirmationDialogFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.DialogFragmentWithArgsCompanion
        public CancelTransferConfirmationDialogFragment newInstance(Args args, int i) {
            return (CancelTransferConfirmationDialogFragment) DialogFragmentWithArgsCompanion.DefaultImpls.newInstance(this, args, i);
        }
    }
}
