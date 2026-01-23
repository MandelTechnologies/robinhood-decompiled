package com.robinhood.android.wires.p278ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.transfers.contracts.Wires;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.wires.p278ui.WiresLoadingEvent;
import com.robinhood.android.wires.p278ui.WiresLoadingFragment;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.models.api.bonfire.transfer.wires.ApiWireDetailsContent;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.Metadata;
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
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: WiresLoadingFragment.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001d\u001eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\r\u0010\u0016\u001a\u00020\u0011H\u0017¢\u0006\u0002\u0010\u0017J\u001a\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0015H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/wires/ui/WiresLoadingFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "duxo", "Lcom/robinhood/android/wires/ui/WiresLoadingDuxo;", "getDuxo", "()Lcom/robinhood/android/wires/ui/WiresLoadingDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/android/wires/ui/WiresLoadingFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/wires/ui/WiresLoadingFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onPositiveButtonClicked", "", "id", "", "passthroughArgs", "Callbacks", "Companion", "feature-wires_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes16.dex */
public final class WiresLoadingFragment extends GenericComposeFragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(WiresLoadingFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/wires/ui/WiresLoadingFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, WiresLoadingDuxo.class);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.wires.ui.WiresLoadingFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof WiresLoadingFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* compiled from: WiresLoadingFragment.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\nH&¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/wires/ui/WiresLoadingFragment$Callbacks;", "", "onLoadInvalidAccountContent", "", "screenIdentifier", "", "invalidAccountContent", "Lcom/robinhood/models/api/bonfire/transfer/wires/ApiWireDetailsContent$InvalidAccountContent;", "onLoadPreselectedContent", "wireDetailsContent", "Lcom/robinhood/models/api/bonfire/transfer/wires/ApiWireDetailsContent$WireDetailsContent;", "onLoadWireTypeSelection", "incomingContent", "feature-wires_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onLoadInvalidAccountContent(String screenIdentifier, ApiWireDetailsContent.InvalidAccountContent invalidAccountContent);

        void onLoadPreselectedContent(ApiWireDetailsContent.WireDetailsContent wireDetailsContent);

        void onLoadWireTypeSelection(ApiWireDetailsContent.WireDetailsContent incomingContent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(WiresLoadingFragment wiresLoadingFragment, int i, Composer composer, int i2) {
        wiresLoadingFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WiresLoadingDuxo getDuxo() {
        return (WiresLoadingDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C315251(null), 1, null);
    }

    /* compiled from: WiresLoadingFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.wires.ui.WiresLoadingFragment$onViewCreated$1", m3645f = "WiresLoadingFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.wires.ui.WiresLoadingFragment$onViewCreated$1 */
    static final class C315251 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C315251(Continuation<? super C315251> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C315251 c315251 = WiresLoadingFragment.this.new C315251(continuation);
            c315251.L$0 = obj;
            return c315251;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C315251) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: WiresLoadingFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.wires.ui.WiresLoadingFragment$onViewCreated$1$1", m3645f = "WiresLoadingFragment.kt", m3646l = {46}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.wires.ui.WiresLoadingFragment$onViewCreated$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ WiresLoadingFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(WiresLoadingFragment wiresLoadingFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = wiresLoadingFragment;
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
                    Flow flowFilterNotNull = FlowKt.filterNotNull(this.this$0.getDuxo().getEventFlow());
                    final WiresLoadingFragment wiresLoadingFragment = this.this$0;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.wires.ui.WiresLoadingFragment.onViewCreated.1.1.1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit((Event<WiresLoadingEvent>) obj2, (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(final Event<WiresLoadingEvent> event, Continuation<? super Unit> continuation) {
                            EventConsumer<WiresLoadingEvent> eventConsumerInvoke;
                            EventConsumer<WiresLoadingEvent> eventConsumerInvoke2;
                            EventConsumer<WiresLoadingEvent> eventConsumerInvoke3;
                            EventConsumer<WiresLoadingEvent> eventConsumerInvoke4;
                            final WiresLoadingFragment wiresLoadingFragment2 = wiresLoadingFragment;
                            if ((event.getData() instanceof WiresLoadingEvent.Error) && (eventConsumerInvoke4 = event.getGetEventConsumer().invoke()) != null) {
                                eventConsumerInvoke4.consume(event, new Function1() { // from class: com.robinhood.android.wires.ui.WiresLoadingFragment$onViewCreated$1$1$1$emit$$inlined$consumeIfType$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) throws Throwable {
                                        m20078invoke(obj2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m20078invoke(Object it) throws Throwable {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        WiresLoadingEvent.Error error = (WiresLoadingEvent.Error) event.getData();
                                        ActivityErrorHandler.Companion companion = ActivityErrorHandler.INSTANCE;
                                        FragmentActivity fragmentActivityRequireActivity = wiresLoadingFragment2.requireActivity();
                                        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                                        ActivityErrorHandler.Companion.handle$default(companion, fragmentActivityRequireActivity, error.getThrowable(), true, false, 0, null, 56, null);
                                    }
                                });
                            }
                            final WiresLoadingFragment wiresLoadingFragment3 = wiresLoadingFragment;
                            if ((event.getData() instanceof WiresLoadingEvent.NoBrokerageAccount) && (eventConsumerInvoke3 = event.getGetEventConsumer().invoke()) != null) {
                                eventConsumerInvoke3.consume(event, new Function1() { // from class: com.robinhood.android.wires.ui.WiresLoadingFragment$onViewCreated$1$1$1$emit$$inlined$consumeIfType$2
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                        m20079invoke(obj2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m20079invoke(Object it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        WiresLoadingEvent.NoBrokerageAccount noBrokerageAccount = (WiresLoadingEvent.NoBrokerageAccount) event.getData();
                                        wiresLoadingFragment3.getCallbacks().onLoadInvalidAccountContent(noBrokerageAccount.getScreenIdentifier(), noBrokerageAccount.getContent());
                                    }
                                });
                            }
                            final WiresLoadingFragment wiresLoadingFragment4 = wiresLoadingFragment;
                            if ((event.getData() instanceof WiresLoadingEvent.PreselectionSpecified) && (eventConsumerInvoke2 = event.getGetEventConsumer().invoke()) != null) {
                                eventConsumerInvoke2.consume(event, new Function1() { // from class: com.robinhood.android.wires.ui.WiresLoadingFragment$onViewCreated$1$1$1$emit$$inlined$consumeIfType$3
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                        m20080invoke(obj2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m20080invoke(Object it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        wiresLoadingFragment4.getCallbacks().onLoadPreselectedContent(((WiresLoadingEvent.PreselectionSpecified) event.getData()).getContent());
                                    }
                                });
                            }
                            final WiresLoadingFragment wiresLoadingFragment5 = wiresLoadingFragment;
                            if ((event.getData() instanceof WiresLoadingEvent.Selection) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                                eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.wires.ui.WiresLoadingFragment$onViewCreated$1$1$1$emit$$inlined$consumeIfType$4
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                        m20081invoke(obj2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m20081invoke(Object it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        wiresLoadingFragment5.getCallbacks().onLoadWireTypeSelection(((WiresLoadingEvent.Selection) event.getData()).getContent());
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

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.L$0, null, null, new AnonymousClass1(WiresLoadingFragment.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1468313817);
        if ((i & 1) != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1468313817, i, -1, "com.robinhood.android.wires.ui.WiresLoadingFragment.ComposeContent (WiresLoadingFragment.kt:74)");
            }
            LoadingScreenComposablesKt.ListLoadingScreenComposable(null, true, false, 2, composerStartRestartGroup, 3120, 5);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.wires.ui.WiresLoadingFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return WiresLoadingFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C11048R.id.dialog_id_generic_error) {
            requireActivity().finish();
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    /* compiled from: WiresLoadingFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/wires/ui/WiresLoadingFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/wires/ui/WiresLoadingFragment;", "Lcom/robinhood/android/transfers/contracts/Wires;", "<init>", "()V", "feature-wires_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<WiresLoadingFragment, Wires> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Wires getArgs(WiresLoadingFragment wiresLoadingFragment) {
            return (Wires) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, wiresLoadingFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public WiresLoadingFragment newInstance(Wires wires) {
            return (WiresLoadingFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, wires);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(WiresLoadingFragment wiresLoadingFragment, Wires wires) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, wiresLoadingFragment, wires);
        }
    }
}
