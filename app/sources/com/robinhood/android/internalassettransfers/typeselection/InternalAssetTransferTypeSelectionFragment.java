package com.robinhood.android.internalassettransfers.typeselection;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.internalassettransfers.accountselection.UiIatAccount;
import com.robinhood.android.internalassettransfers.typeselection.InternalAssetTransferTypeSelectionEvent;
import com.robinhood.android.internalassettransfers.typeselection.InternalAssetTransferTypeSelectionFragment;
import com.robinhood.android.margin.contracts.EnableMarginInvestingKey;
import com.robinhood.android.models.internalassettransfers.p193db.EligibleAssets;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.transfers.p271ui.max.CreateTransferDuxo;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.NoSuchElementException;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: InternalAssetTransferTypeSelectionFragment.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0003 !\"B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\r\u0010\u001a\u001a\u00020\u0015H\u0017¢\u0006\u0002\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u0015H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/typeselection/InternalAssetTransferTypeSelectionFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/internalassettransfers/typeselection/InternalAssetTransferTypeSelectionFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/internalassettransfers/typeselection/InternalAssetTransferTypeSelectionFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/internalassettransfers/typeselection/InternalAssetTransferTypeSelectionDuxo;", "getDuxo", "()Lcom/robinhood/android/internalassettransfers/typeselection/InternalAssetTransferTypeSelectionDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "toolbarVisible", "", "getToolbarVisible", "()Z", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "handleEvent", "event", "Lcom/robinhood/android/internalassettransfers/typeselection/InternalAssetTransferTypeSelectionEvent;", "navigateToMargin", "Callbacks", "Args", "Companion", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class InternalAssetTransferTypeSelectionFragment extends GenericComposeFragment {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.internalassettransfers.typeselection.InternalAssetTransferTypeSelectionFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof InternalAssetTransferTypeSelectionFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, InternalAssetTransferTypeSelectionDuxo.class);
    private final boolean toolbarVisible;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(InternalAssetTransferTypeSelectionFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/internalassettransfers/typeselection/InternalAssetTransferTypeSelectionFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: InternalAssetTransferTypeSelectionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/typeselection/InternalAssetTransferTypeSelectionFragment$Callbacks;", "", "onFullAssetTransfer", "", "onPartialAssetTransfer", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onFullAssetTransfer();

        void onPartialAssetTransfer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(InternalAssetTransferTypeSelectionFragment internalAssetTransferTypeSelectionFragment, int i, Composer composer, int i2) {
        internalAssetTransferTypeSelectionFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InternalAssetTransferTypeSelectionDuxo getDuxo() {
        return (InternalAssetTransferTypeSelectionDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    /* compiled from: InternalAssetTransferTypeSelectionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.typeselection.InternalAssetTransferTypeSelectionFragment$onViewCreated$1", m3645f = "InternalAssetTransferTypeSelectionFragment.kt", m3646l = {37}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.internalassettransfers.typeselection.InternalAssetTransferTypeSelectionFragment$onViewCreated$1 */
    static final class C193301 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C193301(Continuation<? super C193301> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InternalAssetTransferTypeSelectionFragment.this.new C193301(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C193301) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: InternalAssetTransferTypeSelectionFragment.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/internalassettransfers/typeselection/InternalAssetTransferTypeSelectionEvent;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.typeselection.InternalAssetTransferTypeSelectionFragment$onViewCreated$1$1", m3645f = "InternalAssetTransferTypeSelectionFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.internalassettransfers.typeselection.InternalAssetTransferTypeSelectionFragment$onViewCreated$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Event<InternalAssetTransferTypeSelectionEvent>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ InternalAssetTransferTypeSelectionFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(InternalAssetTransferTypeSelectionFragment internalAssetTransferTypeSelectionFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = internalAssetTransferTypeSelectionFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Event<InternalAssetTransferTypeSelectionEvent> event, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(event, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                EventConsumer eventConsumer;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                final Event event = (Event) this.L$0;
                if (event != null) {
                    final InternalAssetTransferTypeSelectionFragment internalAssetTransferTypeSelectionFragment = this.this$0;
                    if ((event.getData() instanceof InternalAssetTransferTypeSelectionEvent) && (eventConsumer = (EventConsumer) event.getGetEventConsumer().invoke()) != null) {
                        eventConsumer.consume(event, new Function1() { // from class: com.robinhood.android.internalassettransfers.typeselection.InternalAssetTransferTypeSelectionFragment$onViewCreated$1$1$invokeSuspend$$inlined$consumeIfType$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                m15459invoke(obj2);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m15459invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                internalAssetTransferTypeSelectionFragment.handleEvent((InternalAssetTransferTypeSelectionEvent) event.getData());
                            }
                        });
                    }
                }
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Event<InternalAssetTransferTypeSelectionEvent>> eventFlow = InternalAssetTransferTypeSelectionFragment.this.getDuxo().getEventFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(InternalAssetTransferTypeSelectionFragment.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(eventFlow, anonymousClass1, this) == coroutine_suspended) {
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

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C193301(null), 1, null);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(675026274);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(675026274, i2, -1, "com.robinhood.android.internalassettransfers.typeselection.InternalAssetTransferTypeSelectionFragment.ComposeContent (InternalAssetTransferTypeSelectionFragment.kt:43)");
            }
            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(Screen.Name.INTERNAL_ASSET_TRANSFER_TRANSFER_TYPE, null, null, null, 14, null), null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, ((Args) INSTANCE.getArgs((Fragment) this)).getSource(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -1, -1, -1, 16383, null), null, null, 53, null), ComposableLambda3.rememberComposableLambda(1035559245, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.typeselection.InternalAssetTransferTypeSelectionFragment.ComposeContent.1

                /* compiled from: InternalAssetTransferTypeSelectionFragment.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.internalassettransfers.typeselection.InternalAssetTransferTypeSelectionFragment$ComposeContent$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ InternalAssetTransferTypeSelectionFragment this$0;

                    AnonymousClass1(InternalAssetTransferTypeSelectionFragment internalAssetTransferTypeSelectionFragment) {
                        this.this$0 = internalAssetTransferTypeSelectionFragment;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer, int i) {
                        if ((i & 3) == 2 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(72379106, i, -1, "com.robinhood.android.internalassettransfers.typeselection.InternalAssetTransferTypeSelectionFragment.ComposeContent.<anonymous>.<anonymous> (InternalAssetTransferTypeSelectionFragment.kt:51)");
                        }
                        InternalAssetTransferTypeSelectionViewState internalAssetTransferTypeSelectionViewState = (InternalAssetTransferTypeSelectionViewState) FlowExtKt.collectAsStateWithLifecycle(this.this$0.getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer, 0, 7).getValue();
                        Modifier modifierLogScreenTransitions$default = ModifiersKt.logScreenTransitions$default(Modifier.INSTANCE, null, 1, null);
                        InternalAssetTransferTypeSelectionDuxo duxo = this.this$0.getDuxo();
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance = composer.changedInstance(duxo);
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new InternalAssetTransferTypeSelectionFragment2(duxo);
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        KFunction kFunction = (KFunction) objRememberedValue;
                        composer.endReplaceGroup();
                        InternalAssetTransferTypeSelectionDuxo duxo2 = this.this$0.getDuxo();
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance2 = composer.changedInstance(duxo2);
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new InternalAssetTransferTypeSelectionFragment3(duxo2);
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        KFunction kFunction2 = (KFunction) objRememberedValue2;
                        composer.endReplaceGroup();
                        InternalAssetTransferTypeSelectionDuxo duxo3 = this.this$0.getDuxo();
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance3 = composer.changedInstance(duxo3);
                        Object objRememberedValue3 = composer.rememberedValue();
                        if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new InternalAssetTransferTypeSelectionFragment4(duxo3);
                            composer.updateRememberedValue(objRememberedValue3);
                        }
                        KFunction kFunction3 = (KFunction) objRememberedValue3;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance4 = composer.changedInstance(this.this$0);
                        final InternalAssetTransferTypeSelectionFragment internalAssetTransferTypeSelectionFragment = this.this$0;
                        Object objRememberedValue4 = composer.rememberedValue();
                        if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new Function0() { // from class: com.robinhood.android.internalassettransfers.typeselection.InternalAssetTransferTypeSelectionFragment$ComposeContent$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return InternalAssetTransferTypeSelectionFragment.C193261.AnonymousClass1.invoke$lambda$4$lambda$3(internalAssetTransferTypeSelectionFragment);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue4);
                        }
                        Function0 function0 = (Function0) objRememberedValue4;
                        composer.endReplaceGroup();
                        Function0 function02 = (Function0) kFunction;
                        Function0 function03 = (Function0) kFunction2;
                        Function0 function04 = (Function0) kFunction3;
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance5 = composer.changedInstance(this.this$0);
                        final InternalAssetTransferTypeSelectionFragment internalAssetTransferTypeSelectionFragment2 = this.this$0;
                        Object objRememberedValue5 = composer.rememberedValue();
                        if (zChangedInstance5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue5 = new Function0() { // from class: com.robinhood.android.internalassettransfers.typeselection.InternalAssetTransferTypeSelectionFragment$ComposeContent$1$1$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return InternalAssetTransferTypeSelectionFragment.C193261.AnonymousClass1.invoke$lambda$6$lambda$5(internalAssetTransferTypeSelectionFragment2);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue5);
                        }
                        composer.endReplaceGroup();
                        InternalAssetTransferTypeSelection4.InternalAssetTransferTypeSelection(internalAssetTransferTypeSelectionViewState, function0, function02, function03, function04, (Function0) objRememberedValue5, modifierLogScreenTransitions$default, composer, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$4$lambda$3(InternalAssetTransferTypeSelectionFragment internalAssetTransferTypeSelectionFragment) {
                        internalAssetTransferTypeSelectionFragment.requireActivity().getOnBackPressedDispatcher().onBackPressed();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$6$lambda$5(InternalAssetTransferTypeSelectionFragment internalAssetTransferTypeSelectionFragment) {
                        internalAssetTransferTypeSelectionFragment.navigateToMargin();
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1035559245, i3, -1, "com.robinhood.android.internalassettransfers.typeselection.InternalAssetTransferTypeSelectionFragment.ComposeContent.<anonymous> (InternalAssetTransferTypeSelectionFragment.kt:50)");
                    }
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(72379106, true, new AnonymousClass1(InternalAssetTransferTypeSelectionFragment.this), composer2, 54), composer2, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.internalassettransfers.typeselection.InternalAssetTransferTypeSelectionFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InternalAssetTransferTypeSelectionFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEvent(InternalAssetTransferTypeSelectionEvent event) {
        if (event instanceof InternalAssetTransferTypeSelectionEvent.TransferAllAssets) {
            getCallbacks().onFullAssetTransfer();
        } else {
            if (!(event instanceof InternalAssetTransferTypeSelectionEvent.TransferPartialAssets)) {
                throw new NoWhenBranchMatchedException();
            }
            getCallbacks().onPartialAssetTransfer();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void navigateToMargin() {
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new EnableMarginInvestingKey(((Args) INSTANCE.getArgs((Fragment) this)).getSinkAccount().getRhsAccountNumber(), null, null, false, false, 30, null), null, false, null, null, 60, null);
    }

    /* compiled from: InternalAssetTransferTypeSelectionFragment.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0006\u0010\u0017\u001a\u00020\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0018HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0018R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/typeselection/InternalAssetTransferTypeSelectionFragment$Args;", "Landroid/os/Parcelable;", "source", "", CreateTransferDuxo.SAVED_STATE_SINK_ACCOUNT, "Lcom/robinhood/android/internalassettransfers/accountselection/UiIatAccount;", CreateTransferDuxo.SAVED_STATE_SOURCE_ACCOUNT, "eligibleAssets", "Lcom/robinhood/android/models/internalassettransfers/db/EligibleAssets;", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/internalassettransfers/accountselection/UiIatAccount;Lcom/robinhood/android/internalassettransfers/accountselection/UiIatAccount;Lcom/robinhood/android/models/internalassettransfers/db/EligibleAssets;)V", "getSource", "()Ljava/lang/String;", "getSinkAccount", "()Lcom/robinhood/android/internalassettransfers/accountselection/UiIatAccount;", "getSourceAccount", "getEligibleAssets", "()Lcom/robinhood/android/models/internalassettransfers/db/EligibleAssets;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final EligibleAssets eligibleAssets;
        private final UiIatAccount sinkAccount;
        private final String source;
        private final UiIatAccount sourceAccount;

        /* compiled from: InternalAssetTransferTypeSelectionFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string2 = parcel.readString();
                Parcelable.Creator<UiIatAccount> creator = UiIatAccount.CREATOR;
                return new Args(string2, creator.createFromParcel(parcel), creator.createFromParcel(parcel), (EligibleAssets) parcel.readParcelable(Args.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, String str, UiIatAccount uiIatAccount, UiIatAccount uiIatAccount2, EligibleAssets eligibleAssets, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.source;
            }
            if ((i & 2) != 0) {
                uiIatAccount = args.sinkAccount;
            }
            if ((i & 4) != 0) {
                uiIatAccount2 = args.sourceAccount;
            }
            if ((i & 8) != 0) {
                eligibleAssets = args.eligibleAssets;
            }
            return args.copy(str, uiIatAccount, uiIatAccount2, eligibleAssets);
        }

        /* renamed from: component1, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        /* renamed from: component2, reason: from getter */
        public final UiIatAccount getSinkAccount() {
            return this.sinkAccount;
        }

        /* renamed from: component3, reason: from getter */
        public final UiIatAccount getSourceAccount() {
            return this.sourceAccount;
        }

        /* renamed from: component4, reason: from getter */
        public final EligibleAssets getEligibleAssets() {
            return this.eligibleAssets;
        }

        public final Args copy(String source, UiIatAccount sinkAccount, UiIatAccount sourceAccount, EligibleAssets eligibleAssets) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(sinkAccount, "sinkAccount");
            Intrinsics.checkNotNullParameter(sourceAccount, "sourceAccount");
            Intrinsics.checkNotNullParameter(eligibleAssets, "eligibleAssets");
            return new Args(source, sinkAccount, sourceAccount, eligibleAssets);
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
            return Intrinsics.areEqual(this.source, args.source) && Intrinsics.areEqual(this.sinkAccount, args.sinkAccount) && Intrinsics.areEqual(this.sourceAccount, args.sourceAccount) && Intrinsics.areEqual(this.eligibleAssets, args.eligibleAssets);
        }

        public int hashCode() {
            return (((((this.source.hashCode() * 31) + this.sinkAccount.hashCode()) * 31) + this.sourceAccount.hashCode()) * 31) + this.eligibleAssets.hashCode();
        }

        public String toString() {
            return "Args(source=" + this.source + ", sinkAccount=" + this.sinkAccount + ", sourceAccount=" + this.sourceAccount + ", eligibleAssets=" + this.eligibleAssets + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.source);
            this.sinkAccount.writeToParcel(dest, flags);
            this.sourceAccount.writeToParcel(dest, flags);
            dest.writeParcelable(this.eligibleAssets, flags);
        }

        public Args(String source, UiIatAccount sinkAccount, UiIatAccount sourceAccount, EligibleAssets eligibleAssets) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(sinkAccount, "sinkAccount");
            Intrinsics.checkNotNullParameter(sourceAccount, "sourceAccount");
            Intrinsics.checkNotNullParameter(eligibleAssets, "eligibleAssets");
            this.source = source;
            this.sinkAccount = sinkAccount;
            this.sourceAccount = sourceAccount;
            this.eligibleAssets = eligibleAssets;
        }

        public final String getSource() {
            return this.source;
        }

        public final UiIatAccount getSinkAccount() {
            return this.sinkAccount;
        }

        public final UiIatAccount getSourceAccount() {
            return this.sourceAccount;
        }

        public final EligibleAssets getEligibleAssets() {
            return this.eligibleAssets;
        }
    }

    /* compiled from: InternalAssetTransferTypeSelectionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/typeselection/InternalAssetTransferTypeSelectionFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/internalassettransfers/typeselection/InternalAssetTransferTypeSelectionFragment;", "Lcom/robinhood/android/internalassettransfers/typeselection/InternalAssetTransferTypeSelectionFragment$Args;", "<init>", "()V", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<InternalAssetTransferTypeSelectionFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(InternalAssetTransferTypeSelectionFragment internalAssetTransferTypeSelectionFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, internalAssetTransferTypeSelectionFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public InternalAssetTransferTypeSelectionFragment newInstance(Args args) {
            return (InternalAssetTransferTypeSelectionFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(InternalAssetTransferTypeSelectionFragment internalAssetTransferTypeSelectionFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, internalAssetTransferTypeSelectionFragment, args);
        }
    }
}
