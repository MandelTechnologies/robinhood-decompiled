package com.robinhood.android.slip.onboarding.checklist;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SlipRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.slip.C28532R;
import com.robinhood.android.slip.onboarding.checklist.SlipOnboardingChecklistEvent;
import com.robinhood.android.slip.onboarding.checklist.SlipOnboardingChecklistFragment;
import com.robinhood.android.slip.onboarding.utils.SLIPContextUtils;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.common.checklist.ChecklistButton;
import com.robinhood.compose.common.checklist.ChecklistItem;
import com.robinhood.compose.common.checklist.ChecklistUtils;
import com.robinhood.models.api.ApiSlipOnboardingEligibility2;
import com.robinhood.models.p355ui.UiSlipOnboardingEligibility;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
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
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: SlipOnboardingChecklistFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\b\u0007\u0018\u0000 S2\u00020\u00012\u00020\u00022\u00020\u0003:\u0003QRSB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u0016\u0010&\u001a\u00020!2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(H\u0002J\b\u0010*\u001a\u00020+H\u0016J\u0010\u0010,\u001a\u00020!2\u0006\u0010-\u001a\u00020.H\u0016J\u0012\u0010H\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\r\u0010I\u001a\u00020!H\u0017¢\u0006\u0002\u0010JJ\t\u0010K\u001a\u00020+H\u0096\u0001R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001a\u001a\u00020\u001b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR7\u00102\u001a\b\u0012\u0004\u0012\u000201002\f\u0010/\u001a\b\u0012\u0004\u0012\u000201008B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b3\u00104\"\u0004\b5\u00106R+\u0010:\u001a\u0002092\u0006\u0010/\u001a\u0002098B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R/\u0010B\u001a\u0004\u0018\u00010A2\b\u0010/\u001a\u0004\u0018\u00010A8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bG\u00108\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u0018\u0010L\u001a\b\u0012\u0004\u0012\u00020N0MX\u0096\u0005¢\u0006\u0006\u001a\u0004\bO\u0010P¨\u0006T²\u0006\u0010\u0010U\u001a\b\u0012\u0004\u0012\u00020V00X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/checklist/SlipOnboardingChecklistFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "screenEventData", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;", "getScreenEventData", "()Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;", "callbacks", "Lcom/robinhood/android/slip/onboarding/checklist/SlipOnboardingChecklistFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/slip/onboarding/checklist/SlipOnboardingChecklistFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/slip/onboarding/checklist/SlipOnboardingChecklistDuxo;", "getDuxo", "()Lcom/robinhood/android/slip/onboarding/checklist/SlipOnboardingChecklistDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "handleEvent", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/slip/onboarding/checklist/SlipOnboardingChecklistEvent;", "onBackPressed", "", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "<set-?>", "", "", "checklistTitles", "getChecklistTitles", "()Ljava/util/List;", "setChecklistTitles", "(Ljava/util/List;)V", "checklistTitles$delegate", "Landroidx/compose/runtime/MutableState;", "", "currentCheckIndex", "getCurrentCheckIndex", "()I", "setCurrentCheckIndex", "(I)V", "currentCheckIndex$delegate", "Landroidx/compose/runtime/MutableIntState;", "Lcom/robinhood/compose/common/checklist/ChecklistItem$Error;", "currentCheckError", "getCurrentCheckError", "()Lcom/robinhood/compose/common/checklist/ChecklistItem$Error;", "setCurrentCheckError", "(Lcom/robinhood/compose/common/checklist/ChecklistItem$Error;)V", "currentCheckError$delegate", "onCreate", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Args", "Companion", "feature-slip_externalDebug", "items", "Lcom/robinhood/compose/common/checklist/ChecklistItem;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class SlipOnboardingChecklistFragment extends GenericComposeFragment implements RegionGated, AutoLoggableFragment {
    public EventLogger eventLogger;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(SlipOnboardingChecklistFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/slip/onboarding/checklist/SlipOnboardingChecklistFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(SlipRegionGate.INSTANCE);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.slip.onboarding.checklist.SlipOnboardingChecklistFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof SlipOnboardingChecklistFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, SlipOnboardingChecklistDuxo.class);

    /* renamed from: checklistTitles$delegate, reason: from kotlin metadata */
    private final SnapshotState checklistTitles = SnapshotState3.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);

    /* renamed from: currentCheckIndex$delegate, reason: from kotlin metadata */
    private final SnapshotIntState2 currentCheckIndex = SnapshotIntState3.mutableIntStateOf(0);

    /* renamed from: currentCheckError$delegate, reason: from kotlin metadata */
    private final SnapshotState currentCheckError = SnapshotState3.mutableStateOf$default(null, null, 2, null);

    /* compiled from: SlipOnboardingChecklistFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/checklist/SlipOnboardingChecklistFragment$Callbacks;", "", "onAllChecksPassed", "", "isRecommended", "", "onChecklistError", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onAllChecksPassed(boolean isRecommended);

        void onChecklistError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$5(SlipOnboardingChecklistFragment slipOnboardingChecklistFragment, int i, Composer composer, int i2) {
        slipOnboardingChecklistFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        return true;
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEvent(final Event<SlipOnboardingChecklistEvent> event) {
        EventConsumer<SlipOnboardingChecklistEvent> eventConsumerInvoke;
        EventConsumer<SlipOnboardingChecklistEvent> eventConsumerInvoke2;
        EventConsumer<SlipOnboardingChecklistEvent> eventConsumerInvoke3;
        EventConsumer<SlipOnboardingChecklistEvent> eventConsumerInvoke4;
        EventConsumer<SlipOnboardingChecklistEvent> eventConsumerInvoke5;
        if ((event.getData() instanceof SlipOnboardingChecklistEvent.ProfileCheckPassed) && (eventConsumerInvoke5 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke5.consume(event, new Function1() { // from class: com.robinhood.android.slip.onboarding.checklist.SlipOnboardingChecklistFragment$handleEvent$$inlined$consumeIfType$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m18970invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m18970invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    this.setCurrentCheckIndex(this.getCurrentCheckIndex() + 1);
                }
            });
        }
        if ((event.getData() instanceof SlipOnboardingChecklistEvent.PortfolioCheckPassed) && (eventConsumerInvoke4 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke4.consume(event, new Function1() { // from class: com.robinhood.android.slip.onboarding.checklist.SlipOnboardingChecklistFragment$handleEvent$$inlined$consumeIfType$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m18971invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m18971invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    SlipOnboardingChecklistEvent.PortfolioCheckPassed portfolioCheckPassed = (SlipOnboardingChecklistEvent.PortfolioCheckPassed) event.getData();
                    this.setCurrentCheckIndex(this.getCurrentCheckIndex() + 1);
                    this.getCallbacks().onAllChecksPassed(portfolioCheckPassed.isRecommended());
                }
            });
        }
        if ((event.getData() instanceof SlipOnboardingChecklistEvent.CheckFailed) && (eventConsumerInvoke3 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke3.consume(event, new Function1() { // from class: com.robinhood.android.slip.onboarding.checklist.SlipOnboardingChecklistFragment$handleEvent$$inlined$consumeIfType$3
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m18972invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m18972invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    SlipOnboardingChecklistFragment slipOnboardingChecklistFragment = this;
                    String string2 = this.getString(C28532R.string.portfolio_eligibility_check_error);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    String string3 = this.getString(C11048R.string.general_label_got_it);
                    Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                    final SlipOnboardingChecklistFragment slipOnboardingChecklistFragment2 = this;
                    slipOnboardingChecklistFragment.setCurrentCheckError(new ChecklistItem.Error(string2, null, new ChecklistButton(string3, new Function0<Unit>() { // from class: com.robinhood.android.slip.onboarding.checklist.SlipOnboardingChecklistFragment$handleEvent$3$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            slipOnboardingChecklistFragment2.requireActivity().finish();
                        }
                    }), null));
                }
            });
        }
        if ((event.getData() instanceof SlipOnboardingChecklistEvent.Error) && (eventConsumerInvoke2 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke2.consume(event, new Function1() { // from class: com.robinhood.android.slip.onboarding.checklist.SlipOnboardingChecklistFragment$handleEvent$$inlined$consumeIfType$4
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m18973invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m18973invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    this.getCallbacks().onChecklistError();
                }
            });
        }
        if (!(event.getData() instanceof SlipOnboardingChecklistEvent.EligibilityLoaded) || (eventConsumerInvoke = event.getGetEventConsumer().invoke()) == null) {
            return;
        }
        eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.slip.onboarding.checklist.SlipOnboardingChecklistFragment$handleEvent$$inlined$consumeIfType$5
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m18974invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m18974invoke(Object it) {
                ApiSlipOnboardingEligibility2 eligibilityStatus;
                Intrinsics.checkNotNullParameter(it, "it");
                SlipOnboardingChecklistEvent.EligibilityLoaded eligibilityLoaded = (SlipOnboardingChecklistEvent.EligibilityLoaded) event.getData();
                EventLogger eventLogger = this.getEventLogger();
                Screen eventScreen = this.getEventScreen();
                String source = ((SlipOnboardingChecklistFragment.Args) SlipOnboardingChecklistFragment.INSTANCE.getArgs((Fragment) this)).getSource();
                UiSlipOnboardingEligibility eligibility = eligibilityLoaded.getEligibility();
                EventLogger.DefaultImpls.logScreenAppear$default(eventLogger, null, eventScreen, null, null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, SLIPContextUtils.createSlipContext$default(source, null, (eligibility == null || (eligibilityStatus = eligibility.getEligibilityStatus()) == null) ? null : SLIPContextUtils.toProtobuf(eligibilityStatus), null, null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -8193, -1, -1, -1, 16383, null), 13, null);
            }
        });
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
        return new Screen(Screen.Name.SLIP_ONBOARDING_ELIGIBILITY_CHECKLIST, null, null, null, 14, null);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return new UserInteractionEventData(null, getEventScreen(), null, null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, SLIPContextUtils.createSlipContext$default(((Args) INSTANCE.getArgs((Fragment) this)).getSource(), null, null, null, null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -8193, -1, -1, -1, 16383, null), null, null, 109, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    public final SlipOnboardingChecklistDuxo getDuxo() {
        return (SlipOnboardingChecklistDuxo) this.duxo.getValue();
    }

    /* compiled from: SlipOnboardingChecklistFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.slip.onboarding.checklist.SlipOnboardingChecklistFragment$onViewCreated$1", m3645f = "SlipOnboardingChecklistFragment.kt", m3646l = {73}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.slip.onboarding.checklist.SlipOnboardingChecklistFragment$onViewCreated$1 */
    static final class C286391 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C286391(Continuation<? super C286391> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SlipOnboardingChecklistFragment.this.new C286391(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C286391) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: SlipOnboardingChecklistFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.slip.onboarding.checklist.SlipOnboardingChecklistFragment$onViewCreated$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ SlipOnboardingChecklistFragment $tmp0;

            AnonymousClass1(SlipOnboardingChecklistFragment slipOnboardingChecklistFragment) {
                this.$tmp0 = slipOnboardingChecklistFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, SlipOnboardingChecklistFragment.class, "handleEvent", "handleEvent(Lcom/robinhood/android/udf/event/Event;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(Event<SlipOnboardingChecklistEvent> event, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$handleEvent = C286391.invokeSuspend$handleEvent(this.$tmp0, event, continuation);
                return objInvokeSuspend$handleEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$handleEvent : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((Event<SlipOnboardingChecklistEvent>) obj, (Continuation<? super Unit>) continuation);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$handleEvent(SlipOnboardingChecklistFragment slipOnboardingChecklistFragment, Event event, Continuation continuation) {
            slipOnboardingChecklistFragment.handleEvent(event);
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(SlipOnboardingChecklistFragment.this.getDuxo().getEventFlow());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(SlipOnboardingChecklistFragment.this);
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
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C286391(null), 1, null);
    }

    /* compiled from: SlipOnboardingChecklistFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.slip.onboarding.checklist.SlipOnboardingChecklistFragment$ComposeContent$1 */
    static final class C286381 implements Function2<Composer, Integer, Unit> {
        C286381() {
        }

        private static final List<ChecklistItem> invoke$lambda$2(SnapshotState4<? extends List<? extends ChecklistItem>> snapshotState4) {
            return (List) snapshotState4.getValue();
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List invoke$lambda$1$lambda$0(SlipOnboardingChecklistFragment slipOnboardingChecklistFragment) {
            return ChecklistUtils.createChecklistItems(slipOnboardingChecklistFragment.getChecklistTitles(), slipOnboardingChecklistFragment.getCurrentCheckIndex(), slipOnboardingChecklistFragment.getCurrentCheckError());
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-410436671, i, -1, "com.robinhood.android.slip.onboarding.checklist.SlipOnboardingChecklistFragment.ComposeContent.<anonymous> (SlipOnboardingChecklistFragment.kt:132)");
            }
            int currentCheckIndex = SlipOnboardingChecklistFragment.this.getCurrentCheckIndex();
            ChecklistItem.Error currentCheckError = SlipOnboardingChecklistFragment.this.getCurrentCheckError();
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = composer.changed(currentCheckIndex) | composer.changed(currentCheckError);
            final SlipOnboardingChecklistFragment slipOnboardingChecklistFragment = SlipOnboardingChecklistFragment.this;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.slip.onboarding.checklist.SlipOnboardingChecklistFragment$ComposeContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SlipOnboardingChecklistFragment.C286381.invoke$lambda$1$lambda$0(slipOnboardingChecklistFragment);
                    }
                });
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            String string2 = SlipOnboardingChecklistFragment.this.getString(C28532R.string.checklist_title);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            String string3 = SlipOnboardingChecklistFragment.this.getString(C28532R.string.checklist_subtitle);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            ChecklistComposable.SlipOnboardingChecklistComposable(string2, string3, extensions2.toImmutableList(invoke$lambda$2((SnapshotState4) objRememberedValue)), null, composer, ChecklistItem.$stable << 6, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        requireBaseActivity().hideToolbar();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<String> getChecklistTitles() {
        return (List) this.checklistTitles.getValue();
    }

    private final void setChecklistTitles(List<String> list) {
        this.checklistTitles.setValue(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getCurrentCheckIndex() {
        return this.currentCheckIndex.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCurrentCheckIndex(int i) {
        this.currentCheckIndex.setIntValue(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final ChecklistItem.Error getCurrentCheckError() {
        return (ChecklistItem.Error) this.currentCheckError.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCurrentCheckError(ChecklistItem.Error error) {
        this.currentCheckError.setValue(error);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setChecklistTitles(CollectionsKt.listOf((Object[]) new String[]{requireActivity().getString(C28532R.string.investor_profile_eligibility_check_title), requireActivity().getString(C28532R.string.portfolio_eligibility_check_title)}));
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(753090604);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(753090604, i2, -1, "com.robinhood.android.slip.onboarding.checklist.SlipOnboardingChecklistFragment.ComposeContent (SlipOnboardingChecklistFragment.kt:131)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-410436671, true, new C286381(), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.slip.onboarding.checklist.SlipOnboardingChecklistFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SlipOnboardingChecklistFragment.ComposeContent$lambda$5(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: SlipOnboardingChecklistFragment.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/checklist/SlipOnboardingChecklistFragment$Args;", "Landroid/os/Parcelable;", "source", "", "accountNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getSource", "()Ljava/lang/String;", "getAccountNumber", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String accountNumber;
        private final String source;

        /* compiled from: SlipOnboardingChecklistFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.source;
            }
            if ((i & 2) != 0) {
                str2 = args.accountNumber;
            }
            return args.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final Args copy(String source, String accountNumber) {
            return new Args(source, accountNumber);
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
            return Intrinsics.areEqual(this.source, args.source) && Intrinsics.areEqual(this.accountNumber, args.accountNumber);
        }

        public int hashCode() {
            String str = this.source;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.accountNumber;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Args(source=" + this.source + ", accountNumber=" + this.accountNumber + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.source);
            dest.writeString(this.accountNumber);
        }

        public Args(String str, String str2) {
            this.source = str;
            this.accountNumber = str2;
        }

        public final String getSource() {
            return this.source;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }
    }

    /* compiled from: SlipOnboardingChecklistFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/checklist/SlipOnboardingChecklistFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/slip/onboarding/checklist/SlipOnboardingChecklistFragment;", "Lcom/robinhood/android/slip/onboarding/checklist/SlipOnboardingChecklistFragment$Args;", "<init>", "()V", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<SlipOnboardingChecklistFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(SlipOnboardingChecklistFragment slipOnboardingChecklistFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, slipOnboardingChecklistFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public SlipOnboardingChecklistFragment newInstance(Args args) {
            return (SlipOnboardingChecklistFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(SlipOnboardingChecklistFragment slipOnboardingChecklistFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, slipOnboardingChecklistFragment, args);
        }
    }
}
