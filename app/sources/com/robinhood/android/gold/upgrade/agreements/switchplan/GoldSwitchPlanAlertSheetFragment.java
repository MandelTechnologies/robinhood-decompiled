package com.robinhood.android.gold.upgrade.agreements.switchplan;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.p088ui.BaseDialogFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.gold.upgrade.agreements.switchplan.GoldSwitchPlanAlertSheetEvent;
import com.robinhood.android.gold.upgrade.agreements.switchplan.GoldSwitchPlanAlertSheetFragment;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlerts2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.models.serverdriven.experimental.api.Button;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import com.robinhood.models.serverdriven.experimental.api.GoldSwitchPlanUpsellAction;
import com.robinhood.models.serverdriven.experimental.api.Pictogram;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.extensions.StringsKt;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
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
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: GoldSwitchPlanAlertSheetFragment.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\b\u0007\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0003)*+B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0014J\u001a\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0016\u0010 \u001a\u00020\u00182\f\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0002J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0002H\u0016J\r\u0010'\u001a\u00020\u0018H\u0017¢\u0006\u0002\u0010(R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014¨\u0006,²\u0006\n\u0010-\u001a\u00020.X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/agreements/switchplan/GoldSwitchPlanAlertSheetFragment;", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "Lcom/robinhood/models/serverdriven/experimental/api/GoldSwitchPlanUpsellAction;", "Lcom/robinhood/compose/app/GenericComposeBottomSheetDialogFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "callbacks", "Lcom/robinhood/android/gold/upgrade/agreements/switchplan/GoldSwitchPlanAlertSheetFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/gold/upgrade/agreements/switchplan/GoldSwitchPlanAlertSheetFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/gold/upgrade/agreements/switchplan/GoldSwitchPlanAlertSheetDuxo;", "getDuxo", "()Lcom/robinhood/android/gold/upgrade/agreements/switchplan/GoldSwitchPlanAlertSheetDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "onDismiss", "", "activity", "Landroid/app/Activity;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "handleEvent", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/gold/upgrade/agreements/switchplan/GoldSwitchPlanAlertSheetEvent;", "handle", "", "action", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "Callbacks", "Args", "Companion", "feature-gold-upgrade-agreements_externalDebug", "viewState", "Lcom/robinhood/android/gold/upgrade/agreements/switchplan/GoldSwitchPlanAlertSheetViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class GoldSwitchPlanAlertSheetFragment extends GenericComposeBottomSheetDialogFragment implements SduiActionHandler<GoldSwitchPlanUpsellAction>, AutoLoggableFragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(GoldSwitchPlanAlertSheetFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/gold/upgrade/agreements/switchplan/GoldSwitchPlanAlertSheetFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final Screen eventScreen = new Screen(null, null, getScreenName(), null, 11, null);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.gold.upgrade.agreements.switchplan.GoldSwitchPlanAlertSheetFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof GoldSwitchPlanAlertSheetFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, GoldSwitchPlanAlertSheetDuxo.class);

    /* compiled from: GoldSwitchPlanAlertSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001a\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/agreements/switchplan/GoldSwitchPlanAlertSheetFragment$Callbacks;", "", "onGoldSwitchPlanUpsellDismissed", "", "newToSweep", "", "onGoldSwitchPlanUpsellFailed", "displayStatusMessage", "", "feature-gold-upgrade-agreements_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onGoldSwitchPlanUpsellDismissed(boolean newToSweep);

        void onGoldSwitchPlanUpsellFailed(boolean newToSweep, String displayStatusMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$3(GoldSwitchPlanAlertSheetFragment goldSwitchPlanAlertSheetFragment, int i, Composer composer, int i2) {
        goldSwitchPlanAlertSheetFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return this.eventScreen;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEvent(final Event<GoldSwitchPlanAlertSheetEvent> event) {
        EventConsumer<GoldSwitchPlanAlertSheetEvent> eventConsumerInvoke;
        EventConsumer<GoldSwitchPlanAlertSheetEvent> eventConsumerInvoke2;
        if ((event.getData() instanceof GoldSwitchPlanAlertSheetEvent.Failed) && (eventConsumerInvoke2 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke2.consume(event, new Function1() { // from class: com.robinhood.android.gold.upgrade.agreements.switchplan.GoldSwitchPlanAlertSheetFragment$handleEvent$$inlined$consumeIfType$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m15110invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m15110invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    this.getCallbacks().onGoldSwitchPlanUpsellFailed(((GoldSwitchPlanAlertSheetFragment.Args) GoldSwitchPlanAlertSheetFragment.INSTANCE.getArgs((Fragment) this)).getNewToSweep(), null);
                }
            });
        }
        if (!(event.getData() instanceof GoldSwitchPlanAlertSheetEvent.SwitchComplete) || (eventConsumerInvoke = event.getGetEventConsumer().invoke()) == null) {
            return;
        }
        eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.gold.upgrade.agreements.switchplan.GoldSwitchPlanAlertSheetFragment$handleEvent$$inlined$consumeIfType$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m15111invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m15111invoke(Object it) {
                Intrinsics.checkNotNullParameter(it, "it");
                GoldSwitchPlanAlertSheetEvent.SwitchComplete switchComplete = (GoldSwitchPlanAlertSheetEvent.SwitchComplete) event.getData();
                if (!switchComplete.getResult().getSuccess()) {
                    this.getCallbacks().onGoldSwitchPlanUpsellFailed(((GoldSwitchPlanAlertSheetFragment.Args) GoldSwitchPlanAlertSheetFragment.INSTANCE.getArgs((Fragment) this)).getNewToSweep(), switchComplete.getResult().getDisplayStatusMessage());
                } else {
                    this.getCallbacks().onGoldSwitchPlanUpsellDismissed(((GoldSwitchPlanAlertSheetFragment.Args) GoldSwitchPlanAlertSheetFragment.INSTANCE.getArgs((Fragment) this)).getNewToSweep());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GoldSwitchPlanAlertSheetDuxo getDuxo() {
        return (GoldSwitchPlanAlertSheetDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment
    protected void onDismiss(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        getCallbacks().onGoldSwitchPlanUpsellDismissed(((Args) INSTANCE.getArgs((Fragment) this)).getNewToSweep());
    }

    @Override // com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseDialogFragment.collectDuxoState$default(this, null, new C180251(null), 1, null);
    }

    /* compiled from: GoldSwitchPlanAlertSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.gold.upgrade.agreements.switchplan.GoldSwitchPlanAlertSheetFragment$onViewCreated$1", m3645f = "GoldSwitchPlanAlertSheetFragment.kt", m3646l = {57}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.gold.upgrade.agreements.switchplan.GoldSwitchPlanAlertSheetFragment$onViewCreated$1 */
    static final class C180251 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C180251(Continuation<? super C180251> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GoldSwitchPlanAlertSheetFragment.this.new C180251(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C180251) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(GoldSwitchPlanAlertSheetFragment.this.getDuxo().getEventFlow());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(GoldSwitchPlanAlertSheetFragment.this);
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

        /* compiled from: GoldSwitchPlanAlertSheetFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.gold.upgrade.agreements.switchplan.GoldSwitchPlanAlertSheetFragment$onViewCreated$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ GoldSwitchPlanAlertSheetFragment $tmp0;

            AnonymousClass1(GoldSwitchPlanAlertSheetFragment goldSwitchPlanAlertSheetFragment) {
                this.$tmp0 = goldSwitchPlanAlertSheetFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, GoldSwitchPlanAlertSheetFragment.class, "handleEvent", "handleEvent(Lcom/robinhood/android/udf/event/Event;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(Event<GoldSwitchPlanAlertSheetEvent> event, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$handleEvent = C180251.invokeSuspend$handleEvent(this.$tmp0, event, continuation);
                return objInvokeSuspend$handleEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$handleEvent : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((Event<GoldSwitchPlanAlertSheetEvent>) obj, (Continuation<? super Unit>) continuation);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$handleEvent(GoldSwitchPlanAlertSheetFragment goldSwitchPlanAlertSheetFragment, Event event, Continuation continuation) {
            goldSwitchPlanAlertSheetFragment.handleEvent(event);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GoldSwitchPlanAlertSheetViewState ComposeContent$lambda$2(SnapshotState4<GoldSwitchPlanAlertSheetViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
    /* renamed from: handle, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean mo15941handle(GoldSwitchPlanUpsellAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof GoldSwitchPlanUpsellAction.GoldSwitchPlanAction) {
            getDuxo().switchSubscriptionPlan(((Args) INSTANCE.getArgs((Fragment) this)).getFromPlanId(), StringsKt.toUuid(((GoldSwitchPlanUpsellAction.GoldSwitchPlanAction) action).getValue2().getTo_plan_id()));
            return true;
        }
        dismiss();
        return true;
    }

    @Override // com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(323432121);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(323432121, i2, -1, "com.robinhood.android.gold.upgrade.agreements.switchplan.GoldSwitchPlanAlertSheetFragment.ComposeContent (GoldSwitchPlanAlertSheetFragment.kt:97)");
            }
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1460376580, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.agreements.switchplan.GoldSwitchPlanAlertSheetFragment.ComposeContent.1
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
                        ComposerKt.traceEventStart(1460376580, i3, -1, "com.robinhood.android.gold.upgrade.agreements.switchplan.GoldSwitchPlanAlertSheetFragment.ComposeContent.<anonymous> (GoldSwitchPlanAlertSheetFragment.kt:100)");
                    }
                    boolean loading = GoldSwitchPlanAlertSheetFragment.ComposeContent$lambda$2(snapshotState4CollectAsStateWithLifecycle).getLoading();
                    final GoldSwitchPlanAlertSheetFragment goldSwitchPlanAlertSheetFragment = this;
                    LocalShowPlaceholder.Loadable(loading, null, null, ComposableLambda3.rememberComposableLambda(648980884, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.agreements.switchplan.GoldSwitchPlanAlertSheetFragment.ComposeContent.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i4) {
                            if ((i4 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(648980884, i4, -1, "com.robinhood.android.gold.upgrade.agreements.switchplan.GoldSwitchPlanAlertSheetFragment.ComposeContent.<anonymous>.<anonymous> (GoldSwitchPlanAlertSheetFragment.kt:101)");
                            }
                            SduiAlert sduiAlert = SduiAlert.INSTANCE;
                            final GenericAlertContent<GoldSwitchPlanUpsellAction> alert = ((Args) GoldSwitchPlanAlertSheetFragment.INSTANCE.getArgs((Fragment) goldSwitchPlanAlertSheetFragment)).getAlert();
                            composer3.startReplaceGroup(5004770);
                            boolean zChangedInstance = composer3.changedInstance(goldSwitchPlanAlertSheetFragment);
                            final GoldSwitchPlanAlertSheetFragment goldSwitchPlanAlertSheetFragment2 = goldSwitchPlanAlertSheetFragment;
                            Object objRememberedValue = composer3.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new SduiActionHandler() { // from class: com.robinhood.android.gold.upgrade.agreements.switchplan.GoldSwitchPlanAlertSheetFragment$ComposeContent$1$1$1$1
                                    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
                                    /* renamed from: handle, reason: merged with bridge method [inline-methods] */
                                    public final boolean mo15941handle(GoldSwitchPlanUpsellAction it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        return goldSwitchPlanAlertSheetFragment2.mo15941handle(it);
                                    }
                                };
                                composer3.updateRememberedValue(objRememberedValue);
                            }
                            composer3.endReplaceGroup();
                            int i5 = SduiAlert.$stable << 6;
                            composer3.startReplaceGroup(1847729312);
                            final Button button = (Button) alert.getAction_buttons().get(0);
                            final Button button2 = (Button) CollectionsKt.getOrNull(alert.getAction_buttons(), 1);
                            SduiActionHandler3.ProvideActionHandler((SduiActionHandler) objRememberedValue, ComposableLambda3.rememberComposableLambda(925557249, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.agreements.switchplan.GoldSwitchPlanAlertSheetFragment$ComposeContent$1$1$invoke$$inlined$AlertSheet$1
                                public final void invoke(Composer composer4, int i6) {
                                    long jM21372getBg20d7_KjU;
                                    String serverValue;
                                    if ((i6 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(925557249, i6, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert.AlertSheet.<anonymous> (SduiAlert.kt:186)");
                                    }
                                    Pictogram pog = alert.getPog();
                                    ServerToBentoAssetMapper3 serverToBentoAssetMapper3FromServerValue = (pog == null || (serverValue = pog.getServerValue()) == null) ? null : ServerToBentoAssetMapper3.INSTANCE.fromServerValue(serverValue);
                                    String title = alert.getTitle();
                                    final String body_markdown = alert.getBody_markdown();
                                    final List body_components = alert.getBody_components();
                                    SduiAlert sduiAlert2 = SduiAlert.INSTANCE;
                                    BentoAlertButton alertButton = sduiAlert2.toAlertButton(button, null, composer4, 0, 1);
                                    Button button3 = button2;
                                    composer4.startReplaceGroup(402298512);
                                    BentoAlertButton alertButton2 = button3 == null ? null : sduiAlert2.toAlertButton(button3, null, composer4, 0, 1);
                                    composer4.endReplaceGroup();
                                    int i7 = BentoAlertButton.$stable;
                                    int i8 = (i7 << 9) | (i7 << 12);
                                    composer4.startReplaceGroup(221388998);
                                    final int iM7919getCentere0LSkKk = TextAlign.INSTANCE.m7919getCentere0LSkKk();
                                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-1694075195, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.agreements.switchplan.GoldSwitchPlanAlertSheetFragment$ComposeContent$1$1$invoke$$inlined$AlertSheet$1.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                            invoke(composer5, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer5, int i9) {
                                            if ((i9 & 3) == 2 && composer5.getSkipping()) {
                                                composer5.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1694075195, i9, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.alerts.BentoSduiAlertSheet.<anonymous> (BentoSduiAlertSheet.kt:38)");
                                            }
                                            Alignment.Companion companion = Alignment.INSTANCE;
                                            Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
                                            String str = body_markdown;
                                            int i10 = iM7919getCentere0LSkKk;
                                            List list = body_components;
                                            Modifier.Companion companion2 = Modifier.INSTANCE;
                                            Arrangement arrangement = Arrangement.INSTANCE;
                                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer5, 48);
                                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer5, 0);
                                            CompositionLocalMap currentCompositionLocalMap = composer5.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer5, companion2);
                                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                            if (composer5.getApplier() == null) {
                                                Composables.invalidApplier();
                                            }
                                            composer5.startReusableNode();
                                            if (composer5.getInserting()) {
                                                composer5.createNode(constructor);
                                            } else {
                                                composer5.useNode();
                                            }
                                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer5);
                                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                            }
                                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                            Column6 column6 = Column6.INSTANCE;
                                            composer5.startReplaceGroup(1390346787);
                                            if (str.length() > 0) {
                                                BentoAlerts2.m20854AlertBodyText5stqomU(str, i10, composer5, 0, 0);
                                            }
                                            composer5.endReplaceGroup();
                                            composer5.startReplaceGroup(1390351170);
                                            if (list != null) {
                                                ImmutableList3 persistentList = extensions2.toPersistentList(list);
                                                HorizontalPadding horizontalPadding = HorizontalPadding.None;
                                                composer5.startReplaceGroup(-1772220517);
                                                SduiColumns.SduiColumn(persistentList, GoldSwitchPlanUpsellAction.class, companion2, null, null, horizontalPadding, arrangement.getTop(), companion.getStart(), true, composer5, 100859904, 0);
                                                composer5.endReplaceGroup();
                                            }
                                            composer5.endReplaceGroup();
                                            composer5.endNode();
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer4, 54);
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                    int i9 = BentoTheme.$stable;
                                    Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(companion, bentoTheme.getColors(composer4, i9).m21371getBg0d7_KjU(), null, 2, null);
                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifierM4872backgroundbw27NRU$default);
                                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                    if (composer4.getApplier() == null) {
                                        Composables.invalidApplier();
                                    }
                                    composer4.startReusableNode();
                                    if (composer4.getInserting()) {
                                        composer4.createNode(constructor);
                                    } else {
                                        composer4.useNode();
                                    }
                                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m5156height3ABfNKs(companion, C2002Dp.m7995constructorimpl(1)), 0.0f, 1, null);
                                    if (bentoTheme.getColors(composer4, i9).getIsDay()) {
                                        composer4.startReplaceGroup(-2071673393);
                                        jM21372getBg20d7_KjU = bentoTheme.getColors(composer4, i9).getJet();
                                    } else {
                                        composer4.startReplaceGroup(-2071672529);
                                        jM21372getBg20d7_KjU = bentoTheme.getColors(composer4, i9).m21372getBg20d7_KjU();
                                    }
                                    composer4.endReplaceGroup();
                                    BoxKt.Box(Background3.m4872backgroundbw27NRU$default(modifierFillMaxWidth$default, jM21372getBg20d7_KjU, null, 2, null), composer4, 0);
                                    BentoAlerts2.AlertContent(null, serverToBentoAssetMapper3FromServerValue, title, null, CollectionsKt.listOfNotNull((Object[]) new BentoAlertButton[]{alertButton, alertButton2}), false, composableLambdaRememberComposableLambda, composer4, ((i8 >> 12) & 112) | 1572864 | ((i8 << 6) & 896) | (i7 << 12), 41);
                                    composer4.endNode();
                                    composer4.endReplaceGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }
                            }, composer3, 54), composer3, ((i5 >> 3) & 14) | 48);
                            composer3.endReplaceGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 3072, 6);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.upgrade.agreements.switchplan.GoldSwitchPlanAlertSheetFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GoldSwitchPlanAlertSheetFragment.ComposeContent$lambda$3(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: GoldSwitchPlanAlertSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/agreements/switchplan/GoldSwitchPlanAlertSheetFragment$Args;", "Landroid/os/Parcelable;", "alert", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "Lcom/robinhood/models/serverdriven/experimental/api/GoldSwitchPlanUpsellAction;", "fromPlanId", "Ljava/util/UUID;", "newToSweep", "", "<init>", "(Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;Ljava/util/UUID;Z)V", "getAlert", "()Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "getFromPlanId", "()Ljava/util/UUID;", "getNewToSweep", "()Z", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-gold-upgrade-agreements_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final GenericAlertContent<GoldSwitchPlanUpsellAction> alert;
        private final UUID fromPlanId;
        private final boolean newToSweep;

        /* compiled from: GoldSwitchPlanAlertSheetFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((GenericAlertContent) parcel.readParcelable(Args.class.getClassLoader()), (UUID) parcel.readSerializable(), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Args copy$default(Args args, GenericAlertContent genericAlertContent, UUID uuid, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                genericAlertContent = args.alert;
            }
            if ((i & 2) != 0) {
                uuid = args.fromPlanId;
            }
            if ((i & 4) != 0) {
                z = args.newToSweep;
            }
            return args.copy(genericAlertContent, uuid, z);
        }

        public final GenericAlertContent<GoldSwitchPlanUpsellAction> component1() {
            return this.alert;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getFromPlanId() {
            return this.fromPlanId;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getNewToSweep() {
            return this.newToSweep;
        }

        public final Args copy(GenericAlertContent<? extends GoldSwitchPlanUpsellAction> alert, UUID fromPlanId, boolean newToSweep) {
            Intrinsics.checkNotNullParameter(alert, "alert");
            Intrinsics.checkNotNullParameter(fromPlanId, "fromPlanId");
            return new Args(alert, fromPlanId, newToSweep);
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
            return Intrinsics.areEqual(this.alert, args.alert) && Intrinsics.areEqual(this.fromPlanId, args.fromPlanId) && this.newToSweep == args.newToSweep;
        }

        public int hashCode() {
            return (((this.alert.hashCode() * 31) + this.fromPlanId.hashCode()) * 31) + Boolean.hashCode(this.newToSweep);
        }

        public String toString() {
            return "Args(alert=" + this.alert + ", fromPlanId=" + this.fromPlanId + ", newToSweep=" + this.newToSweep + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.alert, flags);
            dest.writeSerializable(this.fromPlanId);
            dest.writeInt(this.newToSweep ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Args(GenericAlertContent<? extends GoldSwitchPlanUpsellAction> alert, UUID fromPlanId, boolean z) {
            Intrinsics.checkNotNullParameter(alert, "alert");
            Intrinsics.checkNotNullParameter(fromPlanId, "fromPlanId");
            this.alert = alert;
            this.fromPlanId = fromPlanId;
            this.newToSweep = z;
        }

        public final GenericAlertContent<GoldSwitchPlanUpsellAction> getAlert() {
            return this.alert;
        }

        public final UUID getFromPlanId() {
            return this.fromPlanId;
        }

        public final boolean getNewToSweep() {
            return this.newToSweep;
        }
    }

    /* compiled from: GoldSwitchPlanAlertSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/agreements/switchplan/GoldSwitchPlanAlertSheetFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/gold/upgrade/agreements/switchplan/GoldSwitchPlanAlertSheetFragment;", "Lcom/robinhood/android/gold/upgrade/agreements/switchplan/GoldSwitchPlanAlertSheetFragment$Args;", "<init>", "()V", "feature-gold-upgrade-agreements_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<GoldSwitchPlanAlertSheetFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(GoldSwitchPlanAlertSheetFragment goldSwitchPlanAlertSheetFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, goldSwitchPlanAlertSheetFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public GoldSwitchPlanAlertSheetFragment newInstance(Args args) {
            return (GoldSwitchPlanAlertSheetFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(GoldSwitchPlanAlertSheetFragment goldSwitchPlanAlertSheetFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, goldSwitchPlanAlertSheetFragment, args);
        }
    }
}
