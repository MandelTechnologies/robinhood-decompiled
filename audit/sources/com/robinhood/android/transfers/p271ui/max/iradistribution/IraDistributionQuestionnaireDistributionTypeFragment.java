package com.robinhood.android.transfers.p271ui.max.iradistribution;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlingFragment;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.RetirementRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.transfers.C30065R;
import com.robinhood.android.transfers.p271ui.max.iradistribution.IraDistributionQuestionnaireDistributionTypeFragment;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.models.api.bonfire.ApiIraDistributionQuestionnaire;
import com.robinhood.models.api.bonfire.IraDistributionType;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.io.Serializable;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: IraDistributionQuestionnaireDistributionTypeFragment.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 /2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002./B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u001a\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u001cH\u0016J\u001a\u0010\"\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u001cH\u0016J\r\u0010#\u001a\u00020\u0018H\u0017¢\u0006\u0002\u0010$J\u0010\u0010%\u001a\u00020\u00182\u0006\u0010&\u001a\u00020'H\u0016J\t\u0010(\u001a\u00020\u001eH\u0096\u0001R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*X\u0096\u0005¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u00060"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/iradistribution/IraDistributionQuestionnaireDistributionTypeFragment;", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/action/GenericActionHandlingFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/transfers/ui/max/iradistribution/IraDistributionQuestionnaireDistributionTypeCallbacks;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "callbacks", "Lcom/robinhood/android/transfers/ui/max/iradistribution/IraDistributionQuestionnaireDistributionTypeFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/transfers/ui/max/iradistribution/IraDistributionQuestionnaireDistributionTypeFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onPositiveButtonClicked", "", "id", "", "passthroughArgs", "onNegativeButtonClicked", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onDistributionTypeSelected", IraDistributionQuestionnaireDistributionTypeFragment.ARG_DISTRIBUTION_TYPE, "Lcom/robinhood/models/api/bonfire/IraDistributionType;", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Companion", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class IraDistributionQuestionnaireDistributionTypeFragment extends GenericActionHandlingFragment implements RegionGated, IraDistributionQuestionnaireDistributionTypeScreen, AutoLoggableFragment {
    private static final String ARG_DISTRIBUTION_TYPE = "distributionType";
    private static final String ARG_LOGGING_IDENTIFIER = "loggingIdentifier";
    private static final String TAG_QUALIFIED_DISTRIBUTION = "qualified-distribution";
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(RetirementRegionGate.INSTANCE);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.transfers.ui.max.iradistribution.IraDistributionQuestionnaireDistributionTypeFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof IraDistributionQuestionnaireDistributionTypeFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });
    public EventLogger eventLogger;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(IraDistributionQuestionnaireDistributionTypeFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/transfers/ui/max/iradistribution/IraDistributionQuestionnaireDistributionTypeFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: IraDistributionQuestionnaireDistributionTypeFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/iradistribution/IraDistributionQuestionnaireDistributionTypeFragment$Callbacks;", "", "onDistributionTypeSelected", "", IraDistributionQuestionnaireDistributionTypeFragment.ARG_DISTRIBUTION_TYPE, "Lcom/robinhood/models/api/bonfire/IraDistributionType;", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onDistributionTypeSelected(IraDistributionType distributionType);
    }

    /* compiled from: IraDistributionQuestionnaireDistributionTypeFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IraDistributionType.values().length];
            try {
                iArr[IraDistributionType.QUALIFIED_ROTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IraDistributionType.EARLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IraDistributionType.NORMAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IraDistributionType.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(IraDistributionQuestionnaireDistributionTypeFragment iraDistributionQuestionnaireDistributionTypeFragment, int i, Composer composer, int i2) {
        iraDistributionQuestionnaireDistributionTypeFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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
    public com.robinhood.rosetta.eventlogging.Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
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
        return new Screen(Screen.Name.SELECT_IRA_DISTRIBUTION_TYPE, null, null, null, 14, null);
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        if (id != C30065R.id.dialog_id_ira_distribution_qualified_roth) {
            return super.onPositiveButtonClicked(id, passthroughArgs);
        }
        if (passthroughArgs == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        EventLogger eventLogger = getEventLogger();
        Screen eventScreen = getEventScreen();
        UserInteractionEventData.Action action = UserInteractionEventData.Action.CONTINUE;
        Component.ComponentType componentType = Component.ComponentType.ALERT;
        String string2 = passthroughArgs.getString(ARG_LOGGING_IDENTIFIER);
        if (string2 != null) {
            EventLogger.DefaultImpls.logTap$default(eventLogger, action, eventScreen, new Component(componentType, string2, null, 4, null), null, null, false, 56, null);
            Callbacks callbacks = getCallbacks();
            Serializable serializable = passthroughArgs.getSerializable(ARG_DISTRIBUTION_TYPE);
            Intrinsics.checkNotNull(serializable, "null cannot be cast to non-null type com.robinhood.models.api.bonfire.IraDistributionType");
            callbacks.onDistributionTypeSelected((IraDistributionType) serializable);
            return true;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onNegativeButtonClicked(int id, Bundle passthroughArgs) {
        if (id != C30065R.id.dialog_id_ira_distribution_qualified_roth) {
            return super.onNegativeButtonClicked(id, passthroughArgs);
        }
        if (passthroughArgs == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        EventLogger eventLogger = getEventLogger();
        Screen eventScreen = getEventScreen();
        UserInteractionEventData.Action action = UserInteractionEventData.Action.DISMISS;
        Component.ComponentType componentType = Component.ComponentType.ALERT;
        String string2 = passthroughArgs.getString(ARG_LOGGING_IDENTIFIER);
        if (string2 != null) {
            EventLogger.DefaultImpls.logTap$default(eventLogger, action, eventScreen, new Component(componentType, string2, null, 4, null), null, null, false, 56, null);
            return true;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-438822851);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-438822851, i2, -1, "com.robinhood.android.transfers.ui.max.iradistribution.IraDistributionQuestionnaireDistributionTypeFragment.ComposeContent (IraDistributionQuestionnaireDistributionTypeFragment.kt:103)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(2071014728, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.max.iradistribution.IraDistributionQuestionnaireDistributionTypeFragment.ComposeContent.1
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
                        ComposerKt.traceEventStart(2071014728, i3, -1, "com.robinhood.android.transfers.ui.max.iradistribution.IraDistributionQuestionnaireDistributionTypeFragment.ComposeContent.<anonymous> (IraDistributionQuestionnaireDistributionTypeFragment.kt:105)");
                    }
                    long jM21371getBg0d7_KjU = BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21371getBg0d7_KjU();
                    final IraDistributionQuestionnaireDistributionTypeFragment iraDistributionQuestionnaireDistributionTypeFragment = IraDistributionQuestionnaireDistributionTypeFragment.this;
                    ScaffoldKt.m5625Scaffold27mzLpw(null, null, null, null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, jM21371getBg0d7_KjU, 0L, ComposableLambda3.rememberComposableLambda(-459494778, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.max.iradistribution.IraDistributionQuestionnaireDistributionTypeFragment.ComposeContent.1.1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                            invoke(paddingValues, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(final PaddingValues paddingValues, Composer composer3, int i4) {
                            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                            if ((i4 & 6) == 0) {
                                i4 |= composer3.changed(paddingValues) ? 4 : 2;
                            }
                            if ((i4 & 19) == 18 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-459494778, i4, -1, "com.robinhood.android.transfers.ui.max.iradistribution.IraDistributionQuestionnaireDistributionTypeFragment.ComposeContent.<anonymous>.<anonymous> (IraDistributionQuestionnaireDistributionTypeFragment.kt:108)");
                            }
                            UserInteractionEventDescriptor userInteractionEventDescriptor = new UserInteractionEventDescriptor(null, iraDistributionQuestionnaireDistributionTypeFragment.getEventScreen(), null, null, null, null, 61, null);
                            final IraDistributionQuestionnaireDistributionTypeFragment iraDistributionQuestionnaireDistributionTypeFragment2 = iraDistributionQuestionnaireDistributionTypeFragment;
                            AutoLoggingCompositionLocals.EventLoggable(userInteractionEventDescriptor, ComposableLambda3.rememberComposableLambda(716195441, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.max.iradistribution.IraDistributionQuestionnaireDistributionTypeFragment.ComposeContent.1.1.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i5) {
                                    if ((i5 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(716195441, i5, -1, "com.robinhood.android.transfers.ui.max.iradistribution.IraDistributionQuestionnaireDistributionTypeFragment.ComposeContent.<anonymous>.<anonymous>.<anonymous> (IraDistributionQuestionnaireDistributionTypeFragment.kt:111)");
                                    }
                                    IraDistributionQuestionnaireDistributionTypeScreen2.IraDistributionQuestionnaireDistributionTypeScreen(PaddingKt.padding(Modifier.INSTANCE, paddingValues), (ApiIraDistributionQuestionnaire.DistributionTypeViewModel) IraDistributionQuestionnaireDistributionTypeFragment.INSTANCE.getArgs((Fragment) iraDistributionQuestionnaireDistributionTypeFragment2), iraDistributionQuestionnaireDistributionTypeFragment2, composer4, 0, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), composer3, 48);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 0, 12582912, 98303);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.ui.max.iradistribution.IraDistributionQuestionnaireDistributionTypeFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return IraDistributionQuestionnaireDistributionTypeFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.android.transfers.p271ui.max.iradistribution.IraDistributionQuestionnaireDistributionTypeScreen
    public void onDistributionTypeSelected(IraDistributionType distributionType) {
        Intrinsics.checkNotNullParameter(distributionType, "distributionType");
        int i = WhenMappings.$EnumSwitchMapping$0[distributionType.ordinal()];
        if (i != 1) {
            if (i == 2 || i == 3) {
                getCallbacks().onDistributionTypeSelected(distributionType);
                return;
            } else {
                if (i == 4) {
                    throw new IllegalStateException("Unknown distribution types should be filtered out");
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        ApiIraDistributionQuestionnaire.QualifiedDistributionAlert qualified_roth_distribution_alert_view_model = ((ApiIraDistributionQuestionnaire.DistributionTypeViewModel) INSTANCE.getArgs((Fragment) this)).getQualified_roth_distribution_alert_view_model();
        EventLogger.DefaultImpls.logAppear$default(getEventLogger(), null, getEventScreen(), new Component(Component.ComponentType.ALERT, qualified_roth_distribution_alert_view_model.getLogging_identifier(), null, 4, null), null, null, 25, null);
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder negativeButton = new RhDialogFragment.Builder(contextRequireContext).setId(C30065R.id.dialog_id_ira_distribution_qualified_roth).setTitle(qualified_roth_distribution_alert_view_model.getTitle()).setMessage(getMarkwon().toMarkdown(qualified_roth_distribution_alert_view_model.getBody_markdown())).setPositiveButton(qualified_roth_distribution_alert_view_model.getConfirm_button_title()).setNegativeButton(qualified_roth_distribution_alert_view_model.getDismiss_button_title());
        Bundle bundle = new Bundle();
        bundle.putSerializable(ARG_DISTRIBUTION_TYPE, distributionType);
        bundle.putString(ARG_LOGGING_IDENTIFIER, qualified_roth_distribution_alert_view_model.getLogging_identifier());
        RhDialogFragment.Builder passthroughArgs = negativeButton.setPassthroughArgs(bundle);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        RhDialogFragment.Builder.show$default(passthroughArgs, childFragmentManager, TAG_QUALIFIED_DISTRIBUTION, false, 4, null);
    }

    /* compiled from: IraDistributionQuestionnaireDistributionTypeFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/iradistribution/IraDistributionQuestionnaireDistributionTypeFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/transfers/ui/max/iradistribution/IraDistributionQuestionnaireDistributionTypeFragment;", "Lcom/robinhood/models/api/bonfire/ApiIraDistributionQuestionnaire$DistributionTypeViewModel;", "<init>", "()V", "ARG_DISTRIBUTION_TYPE", "", "ARG_LOGGING_IDENTIFIER", "TAG_QUALIFIED_DISTRIBUTION", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<IraDistributionQuestionnaireDistributionTypeFragment, ApiIraDistributionQuestionnaire.DistributionTypeViewModel> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public ApiIraDistributionQuestionnaire.DistributionTypeViewModel getArgs(IraDistributionQuestionnaireDistributionTypeFragment iraDistributionQuestionnaireDistributionTypeFragment) {
            return (ApiIraDistributionQuestionnaire.DistributionTypeViewModel) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, iraDistributionQuestionnaireDistributionTypeFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public IraDistributionQuestionnaireDistributionTypeFragment newInstance(ApiIraDistributionQuestionnaire.DistributionTypeViewModel distributionTypeViewModel) {
            return (IraDistributionQuestionnaireDistributionTypeFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, distributionTypeViewModel);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(IraDistributionQuestionnaireDistributionTypeFragment iraDistributionQuestionnaireDistributionTypeFragment, ApiIraDistributionQuestionnaire.DistributionTypeViewModel distributionTypeViewModel) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, iraDistributionQuestionnaireDistributionTypeFragment, distributionTypeViewModel);
        }
    }
}
