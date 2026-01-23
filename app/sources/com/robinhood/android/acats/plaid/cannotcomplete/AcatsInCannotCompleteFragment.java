package com.robinhood.android.acats.plaid.cannotcomplete;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.acats.plaid.cannotcomplete.AcatsInCannotCompleteContract;
import com.robinhood.android.acats.plaid.transfer.unsupported.AcatsInPlaidUnsupportedAssetsContract;
import com.robinhood.android.acatsin.p058ui.AcatsFlowStepFragment2;
import com.robinhood.android.acatsin.util.AcatsFlowStep;
import com.robinhood.android.acatsin.util.Eithers;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
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

/* compiled from: AcatsInCannotCompleteFragment.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001d2\u00020\u00012\u00020\u0002:\u0001\u001dB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u001a\u001a\u00020\u001bH\u0017¢\u0006\u0002\u0010\u001cR\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u000f\u001a\u00060\u0010j\u0002`\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/acats/plaid/cannotcomplete/AcatsInCannotCompleteFragment;", "Lcom/robinhood/android/acatsin/ui/BaseAcatsFlowStepComposeFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "screenEventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "getScreenEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "callbacks", "Lcom/robinhood/android/acats/plaid/cannotcomplete/AcatsInCannotCompleteContract$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/acats/plaid/cannotcomplete/AcatsInCannotCompleteContract$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "Companion", "lib-acats-plaid_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AcatsInCannotCompleteFragment extends AcatsFlowStepFragment2 implements AutoLoggableFragment {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    public EventLogger eventLogger;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AcatsInCannotCompleteFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/acats/plaid/cannotcomplete/AcatsInCannotCompleteContract$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$4(AcatsInCannotCompleteFragment acatsInCannotCompleteFragment, int i, Composer composer, int i2) {
        acatsInCannotCompleteFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    public AcatsInCannotCompleteFragment() {
        super(null, AcatsFlowStep.CANNOT_COMPLETE_CONFIRMATION, 1, null);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(AcatsInCannotCompleteContract.Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.acats.plaid.cannotcomplete.AcatsInCannotCompleteFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof AcatsInCannotCompleteContract.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
    }

    /* compiled from: AcatsInCannotCompleteFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/acats/plaid/cannotcomplete/AcatsInCannotCompleteFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/acats/plaid/cannotcomplete/AcatsInCannotCompleteFragment;", "Lcom/robinhood/android/acats/plaid/cannotcomplete/AcatsInCannotCompleteContract$Key;", "<init>", "()V", "lib-acats-plaid_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<AcatsInCannotCompleteFragment, AcatsInCannotCompleteContract.Key> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(AcatsInCannotCompleteContract.Key key) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, key);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public AcatsInCannotCompleteContract.Key getArgs(AcatsInCannotCompleteFragment acatsInCannotCompleteFragment) {
            return (AcatsInCannotCompleteContract.Key) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, acatsInCannotCompleteFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public AcatsInCannotCompleteFragment newInstance(AcatsInCannotCompleteContract.Key key) {
            return (AcatsInCannotCompleteFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, key);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(AcatsInCannotCompleteFragment acatsInCannotCompleteFragment, AcatsInCannotCompleteContract.Key key) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, acatsInCannotCompleteFragment, key);
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
        Screen.Name name = Screen.Name.ACATS_IN_TRANSFER_UNSUPPORTED;
        Companion companion = INSTANCE;
        return new Screen(name, ((AcatsInCannotCompleteContract.Key) companion.getArgs((Fragment) this)).getScreenContext().getSource(), Eithers.getLoggingIdentifier(((AcatsInCannotCompleteContract.Key) companion.getArgs((Fragment) this)).getBrokerageOrDtcNumber()), null, 8, null);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public com.robinhood.rosetta.eventlogging.Context getScreenEventContext() {
        return ((AcatsInCannotCompleteContract.Key) INSTANCE.getArgs((Fragment) this)).getScreenContext().toEventContext();
    }

    private final AcatsInCannotCompleteContract.Callbacks getCallbacks() {
        return (AcatsInCannotCompleteContract.Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(518777891);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(518777891, i2, -1, "com.robinhood.android.acats.plaid.cannotcomplete.AcatsInCannotCompleteFragment.ComposeContent (AcatsInCannotCompleteFragment.kt:44)");
            }
            String brokerageName = ((AcatsInCannotCompleteContract.Key) INSTANCE.getArgs((Fragment) this)).getBrokerageName();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.acats.plaid.cannotcomplete.AcatsInCannotCompleteFragment$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AcatsInCannotCompleteFragment.ComposeContent$lambda$1$lambda$0(this.f$0);
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
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.acats.plaid.cannotcomplete.AcatsInCannotCompleteFragment$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AcatsInCannotCompleteFragment.ComposeContent$lambda$3$lambda$2(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            AcatsInCannotCompleteComposable.AcatsInCannotCompleteComposable(brokerageName, function0, (Function0) objRememberedValue2, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.acats.plaid.cannotcomplete.AcatsInCannotCompleteFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AcatsInCannotCompleteFragment.ComposeContent$lambda$4(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1$lambda$0(AcatsInCannotCompleteFragment acatsInCannotCompleteFragment) {
        EventLogger.DefaultImpls.logTap$default(acatsInCannotCompleteFragment.getEventLogger(), null, acatsInCannotCompleteFragment.getEventScreen(), new Component(Component.ComponentType.BUTTON, "review_unsupported_assets", null, 4, null), null, acatsInCannotCompleteFragment.getScreenEventContext(), false, 41, null);
        Navigator navigator = acatsInCannotCompleteFragment.getNavigator();
        Context contextRequireContext = acatsInCannotCompleteFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Companion companion = INSTANCE;
        String contraAccountNumber = ((AcatsInCannotCompleteContract.Key) companion.getArgs((Fragment) acatsInCannotCompleteFragment)).getContraAccountNumber();
        Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new AcatsInPlaidUnsupportedAssetsContract.Key(((AcatsInCannotCompleteContract.Key) companion.getArgs((Fragment) acatsInCannotCompleteFragment)).getRhsAccountNumber(), ((AcatsInCannotCompleteContract.Key) companion.getArgs((Fragment) acatsInCannotCompleteFragment)).getBrokerageOrDtcNumber(), contraAccountNumber, ((AcatsInCannotCompleteContract.Key) companion.getArgs((Fragment) acatsInCannotCompleteFragment)).getPlaidAccessTokenId(), false, false, ((AcatsInCannotCompleteContract.Key) companion.getArgs((Fragment) acatsInCannotCompleteFragment)).getScreenContext()), false, false, false, null, false, null, false, false, null, null, 4084, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$3$lambda$2(AcatsInCannotCompleteFragment acatsInCannotCompleteFragment) {
        EventLogger.DefaultImpls.logTap$default(acatsInCannotCompleteFragment.getEventLogger(), null, acatsInCannotCompleteFragment.getEventScreen(), new Component(Component.ComponentType.BUTTON, "done", null, 4, null), null, acatsInCannotCompleteFragment.getScreenEventContext(), false, 41, null);
        acatsInCannotCompleteFragment.getCallbacks().onComplete();
        return Unit.INSTANCE;
    }
}
