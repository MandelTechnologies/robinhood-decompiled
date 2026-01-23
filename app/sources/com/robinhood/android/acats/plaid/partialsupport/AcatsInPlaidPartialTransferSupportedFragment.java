package com.robinhood.android.acats.plaid.partialsupport;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.acats.plaid.partialsupport.AcatsInPlaidPartialTransferSupportedContract;
import com.robinhood.android.acatsin.p058ui.AcatsFlowStepFragment2;
import com.robinhood.android.acatsin.util.AcatsFlowStep;
import com.robinhood.android.acatsin.util.Eithers;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
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

/* compiled from: AcatsInPlaidPartialTransferSupportedFragment.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0007\u0018\u0000 #2\u00020\u00012\u00020\u0002:\u0001#B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010 \u001a\u00020!H\u0017¢\u0006\u0002\u0010\"R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u000f\u001a\u00060\u0010j\u0002`\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001d¨\u0006$²\u0006\n\u0010%\u001a\u00020&X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/acats/plaid/partialsupport/AcatsInPlaidPartialTransferSupportedFragment;", "Lcom/robinhood/android/acatsin/ui/BaseAcatsFlowStepComposeFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "screenEventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "getScreenEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "callbacks", "Lcom/robinhood/android/acats/plaid/partialsupport/AcatsInPlaidPartialTransferSupportedContract$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/acats/plaid/partialsupport/AcatsInPlaidPartialTransferSupportedContract$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/acats/plaid/partialsupport/AcatsInPlaidPartialTransferSupportedDuxo;", "getDuxo", "()Lcom/robinhood/android/acats/plaid/partialsupport/AcatsInPlaidPartialTransferSupportedDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "Companion", "lib-acats-plaid_externalDebug", "state", "Lcom/robinhood/android/acats/plaid/partialsupport/AcatsPlaidPartialTransferSupportedViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AcatsInPlaidPartialTransferSupportedFragment extends AcatsFlowStepFragment2 implements AutoLoggableFragment {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public EventLogger eventLogger;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AcatsInPlaidPartialTransferSupportedFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/acats/plaid/partialsupport/AcatsInPlaidPartialTransferSupportedContract$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$5(AcatsInPlaidPartialTransferSupportedFragment acatsInPlaidPartialTransferSupportedFragment, int i, Composer composer, int i2) {
        acatsInPlaidPartialTransferSupportedFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    public AcatsInPlaidPartialTransferSupportedFragment() {
        super(null, AcatsFlowStep.PLAID_PARTIAL_TRANSFER_SUPPORTED, 1, null);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(AcatsInPlaidPartialTransferSupportedContract.Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.acats.plaid.partialsupport.AcatsInPlaidPartialTransferSupportedFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof AcatsInPlaidPartialTransferSupportedContract.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        this.duxo = DuxosKt.duxo(this, AcatsInPlaidPartialTransferSupportedDuxo.class);
    }

    /* compiled from: AcatsInPlaidPartialTransferSupportedFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/acats/plaid/partialsupport/AcatsInPlaidPartialTransferSupportedFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/acats/plaid/partialsupport/AcatsInPlaidPartialTransferSupportedFragment;", "Lcom/robinhood/android/acats/plaid/partialsupport/AcatsInPlaidPartialTransferSupportedContract$Key;", "<init>", "()V", "lib-acats-plaid_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<AcatsInPlaidPartialTransferSupportedFragment, AcatsInPlaidPartialTransferSupportedContract.Key> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(AcatsInPlaidPartialTransferSupportedContract.Key key) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, key);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public AcatsInPlaidPartialTransferSupportedContract.Key getArgs(AcatsInPlaidPartialTransferSupportedFragment acatsInPlaidPartialTransferSupportedFragment) {
            return (AcatsInPlaidPartialTransferSupportedContract.Key) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, acatsInPlaidPartialTransferSupportedFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public AcatsInPlaidPartialTransferSupportedFragment newInstance(AcatsInPlaidPartialTransferSupportedContract.Key key) {
            return (AcatsInPlaidPartialTransferSupportedFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, key);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(AcatsInPlaidPartialTransferSupportedFragment acatsInPlaidPartialTransferSupportedFragment, AcatsInPlaidPartialTransferSupportedContract.Key key) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, acatsInPlaidPartialTransferSupportedFragment, key);
        }
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

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        Screen.Name name = Screen.Name.ACATS_IN_PARTIAL_TRANSFER_ELIGIBLE;
        Companion companion = INSTANCE;
        return new Screen(name, ((AcatsInPlaidPartialTransferSupportedContract.Key) companion.getArgs((Fragment) this)).getScreenContext().getSource(), Eithers.getLoggingIdentifier(((AcatsInPlaidPartialTransferSupportedContract.Key) companion.getArgs((Fragment) this)).getBrokerageOrDtcNumber()), null, 8, null);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public com.robinhood.rosetta.eventlogging.Context getScreenEventContext() {
        return ((AcatsInPlaidPartialTransferSupportedContract.Key) INSTANCE.getArgs((Fragment) this)).getScreenContext().toEventContext();
    }

    private final AcatsInPlaidPartialTransferSupportedContract.Callbacks getCallbacks() {
        return (AcatsInPlaidPartialTransferSupportedContract.Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final AcatsInPlaidPartialTransferSupportedDuxo getDuxo() {
        return (AcatsInPlaidPartialTransferSupportedDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-922588049);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-922588049, i2, -1, "com.robinhood.android.acats.plaid.partialsupport.AcatsInPlaidPartialTransferSupportedFragment.ComposeContent (AcatsInPlaidPartialTransferSupportedFragment.kt:50)");
            }
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            String brokerageName = ((AcatsInPlaidPartialTransferSupportedContract.Key) INSTANCE.getArgs((Fragment) this)).getBrokerageName();
            int count = ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle).getCount();
            boolean hasShortEquityPositions = ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle).getHasShortEquityPositions();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.acats.plaid.partialsupport.AcatsInPlaidPartialTransferSupportedFragment$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AcatsInPlaidPartialTransferSupportedFragment.ComposeContent$lambda$2$lambda$1(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.acats.plaid.partialsupport.AcatsInPlaidPartialTransferSupportedFragment$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AcatsInPlaidPartialTransferSupportedFragment.ComposeContent$lambda$4$lambda$3(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            AcatsInPlaidPartialTransferSupportedComposable.AcatsInPlaidPartialTransferSupportedComposable(brokerageName, count, function0, hasShortEquityPositions, (Function0) objRememberedValue2, composerStartRestartGroup, 0, 0);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.acats.plaid.partialsupport.AcatsInPlaidPartialTransferSupportedFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AcatsInPlaidPartialTransferSupportedFragment.ComposeContent$lambda$5(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$2$lambda$1(AcatsInPlaidPartialTransferSupportedFragment acatsInPlaidPartialTransferSupportedFragment) {
        EventLogger.DefaultImpls.logTap$default(acatsInPlaidPartialTransferSupportedFragment.getEventLogger(), null, acatsInPlaidPartialTransferSupportedFragment.getEventScreen(), new Component(Component.ComponentType.BUTTON, "continue", null, 4, null), null, acatsInPlaidPartialTransferSupportedFragment.getScreenEventContext(), false, 41, null);
        acatsInPlaidPartialTransferSupportedFragment.getCallbacks().onPlaidPartialTransferSelected();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$4$lambda$3(AcatsInPlaidPartialTransferSupportedFragment acatsInPlaidPartialTransferSupportedFragment) {
        acatsInPlaidPartialTransferSupportedFragment.getCallbacks().onShowBorrowingFeeDetails();
        return Unit.INSTANCE;
    }

    private static final AcatsPlaidPartialTransferSupportedViewState ComposeContent$lambda$0(SnapshotState4<AcatsPlaidPartialTransferSupportedViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
