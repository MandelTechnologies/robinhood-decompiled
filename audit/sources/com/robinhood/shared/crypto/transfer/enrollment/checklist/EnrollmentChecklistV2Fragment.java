package com.robinhood.shared.crypto.transfer.enrollment.checklist;

import android.net.Uri;
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
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.lib.stepupverification.SuvLauncher;
import com.robinhood.android.regiongate.CryptoRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.crypto.transfer.enrollment.checklist.EnrollmentChecklistV2Event;
import com.robinhood.shared.crypto.transfer.enrollment.checklist.EnrollmentChecklistV2Fragment;
import com.robinhood.shared.crypto.transfer.enrollment.navigation.EnrollmentEvent;
import com.robinhood.shared.crypto.transfer.enrollment.navigation.EnrollmentEventReceiver;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCompanion;
import java.util.Set;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
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
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: EnrollmentChecklistV2Fragment.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\b\u0007\u0018\u0000 (2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001(B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\r\u0010 \u001a\u00020\u001aH\u0017¢\u0006\u0002\u0010!J\t\u0010\"\u001a\u00020\u0019H\u0096\u0001R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R \u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$X\u0096\u0005¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006)²\u0006\n\u0010*\u001a\u00020+X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/enrollment/checklist/EnrollmentChecklistV2Fragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "eventReceiver", "Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentEventReceiver;", "getEventReceiver", "()Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentEventReceiver;", "eventReceiver$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/shared/crypto/transfer/enrollment/checklist/EnrollmentChecklistV2Duxo;", "getDuxo", "()Lcom/robinhood/shared/crypto/transfer/enrollment/checklist/EnrollmentChecklistV2Duxo;", "duxo$delegate", "Lkotlin/Lazy;", "launchSuv", "Lkotlin/Function2;", "Ljava/util/UUID;", "", "", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-crypto-transfer_externalDebug", "viewState", "Lcom/robinhood/shared/crypto/transfer/enrollment/checklist/EnrollmentChecklistV2ViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class EnrollmentChecklistV2Fragment extends GenericComposeFragment implements AutoLoggableFragment, RegionGated {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(EnrollmentChecklistV2Fragment.class, "eventReceiver", "getEventReceiver()Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentEventReceiver;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(CryptoRegionGate.INSTANCE);

    /* renamed from: eventReceiver$delegate, reason: from kotlin metadata */
    private final Interfaces2 eventReceiver = new CallbacksProperty(Reflection.getOrCreateKotlinClass(EnrollmentEventReceiver.class), new Function1<Fragment, Object>() { // from class: com.robinhood.shared.crypto.transfer.enrollment.checklist.EnrollmentChecklistV2Fragment$special$$inlined$parentFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment;
        }
    });

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, EnrollmentChecklistV2Duxo.class);
    private final Function2<UUID, Boolean, Unit> launchSuv = SuvLauncher.registerSuvLauncher$default(this, new Function0() { // from class: com.robinhood.shared.crypto.transfer.enrollment.checklist.EnrollmentChecklistV2Fragment$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.f$0.getNavigator();
        }
    }, new Function0() { // from class: com.robinhood.shared.crypto.transfer.enrollment.checklist.EnrollmentChecklistV2Fragment$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Unit.INSTANCE;
        }
    }, (Function0) null, 4, (Object) null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$3(EnrollmentChecklistV2Fragment enrollmentChecklistV2Fragment, int i, Composer composer, int i2) {
        enrollmentChecklistV2Fragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
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

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return new Screen(Screen.Name.CRYPTO_TRANSFER_ENROLLMENT_STEPS, null, null, null, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EnrollmentEventReceiver getEventReceiver() {
        return (EnrollmentEventReceiver) this.eventReceiver.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EnrollmentChecklistV2Duxo getDuxo() {
        return (EnrollmentChecklistV2Duxo) this.duxo.getValue();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C379621(null), 1, null);
    }

    /* compiled from: EnrollmentChecklistV2Fragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.enrollment.checklist.EnrollmentChecklistV2Fragment$onViewCreated$1", m3645f = "EnrollmentChecklistV2Fragment.kt", m3646l = {48}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.crypto.transfer.enrollment.checklist.EnrollmentChecklistV2Fragment$onViewCreated$1 */
    static final class C379621 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C379621(Continuation<? super C379621> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EnrollmentChecklistV2Fragment.this.new C379621(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C379621) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(EnrollmentChecklistV2Fragment.this.getDuxo().getEventFlow());
                final EnrollmentChecklistV2Fragment enrollmentChecklistV2Fragment = EnrollmentChecklistV2Fragment.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.shared.crypto.transfer.enrollment.checklist.EnrollmentChecklistV2Fragment.onViewCreated.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Event<EnrollmentChecklistV2Event>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(final Event<EnrollmentChecklistV2Event> event, Continuation<? super Unit> continuation) {
                        EventConsumer<EnrollmentChecklistV2Event> eventConsumerInvoke;
                        final EnrollmentChecklistV2Fragment enrollmentChecklistV2Fragment2 = enrollmentChecklistV2Fragment;
                        if ((event.getData() instanceof EnrollmentChecklistV2Event.Navigate) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.shared.crypto.transfer.enrollment.checklist.EnrollmentChecklistV2Fragment$onViewCreated$1$1$emit$$inlined$consumeIfType$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    m25001invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m25001invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    enrollmentChecklistV2Fragment2.getEventReceiver().onEvent(new EnrollmentEvent.CheckForCompletion(((EnrollmentChecklistV2Event.Navigate) event.getData()).getEnrollmentState()));
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

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1314484315);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1314484315, i2, -1, "com.robinhood.shared.crypto.transfer.enrollment.checklist.EnrollmentChecklistV2Fragment.ComposeContent (EnrollmentChecklistV2Fragment.kt:56)");
            }
            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, getEventScreen(), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(97784474, true, new C379611(FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7), this), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.enrollment.checklist.EnrollmentChecklistV2Fragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EnrollmentChecklistV2Fragment.ComposeContent$lambda$3(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: EnrollmentChecklistV2Fragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.crypto.transfer.enrollment.checklist.EnrollmentChecklistV2Fragment$ComposeContent$1 */
    static final class C379611 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState4<EnrollmentChecklistV2ViewState> $viewState$delegate;
        final /* synthetic */ EnrollmentChecklistV2Fragment this$0;

        C379611(SnapshotState4<EnrollmentChecklistV2ViewState> snapshotState4, EnrollmentChecklistV2Fragment enrollmentChecklistV2Fragment) {
            this.$viewState$delegate = snapshotState4;
            this.this$0 = enrollmentChecklistV2Fragment;
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
                ComposerKt.traceEventStart(97784474, i, -1, "com.robinhood.shared.crypto.transfer.enrollment.checklist.EnrollmentChecklistV2Fragment.ComposeContent.<anonymous> (EnrollmentChecklistV2Fragment.kt:63)");
            }
            EnrollmentChecklistV2ViewState enrollmentChecklistV2ViewStateComposeContent$lambda$2 = EnrollmentChecklistV2Fragment.ComposeContent$lambda$2(this.$viewState$delegate);
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = composer.changed(this.$viewState$delegate) | composer.changedInstance(this.this$0);
            final SnapshotState4<EnrollmentChecklistV2ViewState> snapshotState4 = this.$viewState$delegate;
            final EnrollmentChecklistV2Fragment enrollmentChecklistV2Fragment = this.this$0;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.transfer.enrollment.checklist.EnrollmentChecklistV2Fragment$ComposeContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return EnrollmentChecklistV2Fragment.C379611.invoke$lambda$3$lambda$2(snapshotState4, enrollmentChecklistV2Fragment);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(this.this$0);
            final EnrollmentChecklistV2Fragment enrollmentChecklistV2Fragment2 = this.this$0;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.enrollment.checklist.EnrollmentChecklistV2Fragment$ComposeContent$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return EnrollmentChecklistV2Fragment.C379611.invoke$lambda$5$lambda$4(enrollmentChecklistV2Fragment2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            EnrollmentChecklistComposable.EnrollmentChecklistComposable(enrollmentChecklistV2ViewStateComposeContent$lambda$2, function0, (Function0) objRememberedValue2, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(SnapshotState4 snapshotState4, EnrollmentChecklistV2Fragment enrollmentChecklistV2Fragment) {
            UUID kycSuvWorkflowId = EnrollmentChecklistV2Fragment.ComposeContent$lambda$2(snapshotState4).getKycSuvWorkflowId();
            if (kycSuvWorkflowId != null) {
                enrollmentChecklistV2Fragment.launchSuv.invoke(kycSuvWorkflowId, Boolean.valueOf(EnrollmentChecklistV2Fragment.ComposeContent$lambda$2(snapshotState4).getKycSuvIsMigrated()));
            } else {
                Uri kycDeeplink = EnrollmentChecklistV2Fragment.ComposeContent$lambda$2(snapshotState4).getKycDeeplink();
                if (kycDeeplink != null) {
                    enrollmentChecklistV2Fragment.getEventReceiver().onEvent(new EnrollmentEvent.Checklist.DocumentRequest(kycDeeplink));
                }
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$4(EnrollmentChecklistV2Fragment enrollmentChecklistV2Fragment) {
            enrollmentChecklistV2Fragment.getEventReceiver().onEvent(EnrollmentEvent.Checklist.TwoFactorAuthSetup.INSTANCE);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: EnrollmentChecklistV2Fragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/enrollment/checklist/EnrollmentChecklistV2Fragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithoutArgsCompanion;", "Lcom/robinhood/shared/crypto/transfer/enrollment/checklist/EnrollmentChecklistV2Fragment;", "<init>", "()V", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithoutArgsCompanion<EnrollmentChecklistV2Fragment> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public /* bridge */ /* synthetic */ Parcelable getArgs(Fragment fragment) {
            return (Parcelable) getArgs((EnrollmentChecklistV2Fragment) fragment);
        }

        public Void getArgs(EnrollmentChecklistV2Fragment enrollmentChecklistV2Fragment) {
            return FragmentWithoutArgsCompanion.DefaultImpls.getArgs(this, enrollmentChecklistV2Fragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCreator
        public EnrollmentChecklistV2Fragment newInstance() {
            return (EnrollmentChecklistV2Fragment) FragmentWithoutArgsCompanion.DefaultImpls.newInstance(this);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCreator
        public EnrollmentChecklistV2Fragment newInstance(Void r1) {
            return (EnrollmentChecklistV2Fragment) FragmentWithoutArgsCompanion.DefaultImpls.newInstance(this, r1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EnrollmentChecklistV2ViewState ComposeContent$lambda$2(SnapshotState4<EnrollmentChecklistV2ViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
