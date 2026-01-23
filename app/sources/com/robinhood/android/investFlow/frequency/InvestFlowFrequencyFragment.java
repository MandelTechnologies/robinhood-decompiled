package com.robinhood.android.investFlow.frequency;

import android.content.Context;
import android.os.Bundle;
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
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.recurring.date.RecurringDatePickerArgs;
import com.robinhood.android.common.recurring.date.RecurringDatePickerResultContract;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.investFlow.C19349R;
import com.robinhood.android.investFlow.core.InvestFlowCoreData;
import com.robinhood.android.investFlow.core.InvestFlowCoreDataProvider;
import com.robinhood.android.investFlow.frequency.InvestFlowFrequencyFragment;
import com.robinhood.android.recurring.contracts.investflow.InvestFlowFrequency;
import com.robinhood.android.regiongate.InvestFlowRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import p479j$.time.LocalDate;

/* compiled from: InvestFlowFrequencyFragment.kt */
@Metadata(m3635d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 72\u00020\u00012\u00020\u00022\u00020\u0003:\u000287B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0019\u0010\u0005J\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001d\u0010\u0005J\u0010\u0010\u001f\u001a\u00020\u001eH\u0096\u0001¢\u0006\u0004\b\u001f\u0010 R\u001b\u0010&\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001b\u0010,\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\"\u00100\u001a\u0010\u0012\f\u0012\n /*\u0004\u0018\u00010.0.0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001a\u00106\u001a\b\u0012\u0004\u0012\u000203028\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b4\u00105¨\u0006;²\u0006\f\u0010:\u001a\u0002098\nX\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/investFlow/frequency/InvestFlowFrequencyFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/investFlow/frequency/InvestFlowFrequencyCallbacks;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "toolbar", "configureToolbar", "(Lcom/robinhood/android/common/ui/view/RhToolbar;)V", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "Lcom/robinhood/android/investFlow/frequency/Frequency;", "frequency", "onFrequencyClicked", "(Lcom/robinhood/android/investFlow/frequency/Frequency;)V", "j$/time/LocalDate", InquiryField.DateField.TYPE, "onDateClicked", "(Lj$/time/LocalDate;)V", "onDisclaimerClicked", "Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowFrequency;", "onContinueClicked", "(Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowFrequency;)V", "onBackClicked", "", "onDismissUnsupportedFeatureDialog", "()Z", "Lcom/robinhood/android/investFlow/frequency/InvestFlowFrequencyFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getCallbacks", "()Lcom/robinhood/android/investFlow/frequency/InvestFlowFrequencyFragment$Callbacks;", "callbacks", "Lcom/robinhood/android/investFlow/frequency/InvestFlowFrequencyDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "getDuxo", "()Lcom/robinhood/android/investFlow/frequency/InvestFlowFrequencyDuxo;", "duxo", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/robinhood/android/common/recurring/date/RecurringDatePickerArgs;", "kotlin.jvm.PlatformType", "datePickerLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "requiresRegionGates", "Companion", "Callbacks", "Lcom/robinhood/android/investFlow/frequency/FrequencyViewState;", "viewState", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class InvestFlowFrequencyFragment extends GenericComposeFragment implements RegionGated, InvestFlowFrequencyComposable3 {
    private final ActivityResultLauncher<RecurringDatePickerArgs> datePickerLauncher;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(InvestFlowFrequencyFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/investFlow/frequency/InvestFlowFrequencyFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(InvestFlowRegionGate.INSTANCE);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.investFlow.frequency.InvestFlowFrequencyFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof InvestFlowFrequencyFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, InvestFlowFrequencyDuxo.class);

    /* compiled from: InvestFlowFrequencyFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/investFlow/frequency/InvestFlowFrequencyFragment$Callbacks;", "Lcom/robinhood/android/investFlow/core/InvestFlowCoreDataProvider;", "onFrequencySelected", "", "frequency", "Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowFrequency;", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks extends InvestFlowCoreDataProvider {
        void onFrequencySelected(InvestFlowFrequency frequency);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$2(InvestFlowFrequencyFragment investFlowFrequencyFragment, int i, Composer composer, int i2) {
        investFlowFrequencyFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    public InvestFlowFrequencyFragment() {
        ActivityResultLauncher<RecurringDatePickerArgs> activityResultLauncherRegisterForActivityResult = registerForActivityResult(RecurringDatePickerResultContract.INSTANCE, new ActivityResultCallback() { // from class: com.robinhood.android.investFlow.frequency.InvestFlowFrequencyFragment$datePickerLauncher$1
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(LocalDate localDate) {
                if (localDate != null) {
                    this.this$0.getDuxo().onStartDateSelected(localDate);
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.datePickerLauncher = activityResultLauncherRegisterForActivityResult;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InvestFlowFrequencyDuxo getDuxo() {
        return (InvestFlowFrequencyDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LifecycleHost.DefaultImpls.bind$default(this, getCallbacks().getCoreDataObservable(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.investFlow.frequency.InvestFlowFrequencyFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowFrequencyFragment.onCreate$lambda$0(this.f$0, (InvestFlowCoreData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(InvestFlowFrequencyFragment investFlowFrequencyFragment, InvestFlowCoreData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        investFlowFrequencyFragment.getDuxo().onFrequencyUpdated(it.getSelectedFrequency());
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        requireBaseActivity().hideToolbar();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1120687494);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1120687494, i2, -1, "com.robinhood.android.investFlow.frequency.InvestFlowFrequencyFragment.ComposeContent (InvestFlowFrequencyFragment.kt:59)");
            }
            InvestFlowFrequencyComposable4.InvestFlowFrequencyScreen(ComposeContent$lambda$1(FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7)), this, null, composerStartRestartGroup, (i2 << 3) & 112, 4);
            composer2 = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.investFlow.frequency.InvestFlowFrequencyFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InvestFlowFrequencyFragment.ComposeContent$lambda$2(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.android.investFlow.frequency.InvestFlowFrequencyComposable3
    public void onFrequencyClicked(Frequency frequency) {
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        getDuxo().onFrequencyClicked(frequency);
    }

    @Override // com.robinhood.android.investFlow.frequency.InvestFlowFrequencyComposable3
    public void onDateClicked(LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        this.datePickerLauncher.launch(new RecurringDatePickerArgs(date, get_isCrypto()));
    }

    @Override // com.robinhood.android.investFlow.frequency.InvestFlowFrequencyComposable3
    public void onDisclaimerClicked() {
        WebUtils.viewUrl$default(requireContext(), getResources().getString(C19349R.string.invest_flow_recurring_submit_disclaimer_learn_more_url), 0, 4, (Object) null);
    }

    private static final FrequencyViewState ComposeContent$lambda$1(SnapshotState4<FrequencyViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    @Override // com.robinhood.android.investFlow.frequency.InvestFlowFrequencyComposable3
    public void onContinueClicked(InvestFlowFrequency frequency) {
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        getCallbacks().onFrequencySelected(frequency);
    }

    @Override // com.robinhood.android.investFlow.frequency.InvestFlowFrequencyComposable3
    public void onBackClicked() {
        requireBaseActivity().getOnBackPressedDispatcher().onBackPressed();
    }

    /* compiled from: InvestFlowFrequencyFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/investFlow/frequency/InvestFlowFrequencyFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/investFlow/frequency/InvestFlowFrequencyFragment;", "Lcom/robinhood/android/investFlow/frequency/InvestFlowFrequencyArgs;", "<init>", "()V", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<InvestFlowFrequencyFragment, InvestFlowFrequencyArgs> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public InvestFlowFrequencyArgs getArgs(InvestFlowFrequencyFragment investFlowFrequencyFragment) {
            return (InvestFlowFrequencyArgs) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, investFlowFrequencyFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public InvestFlowFrequencyFragment newInstance(InvestFlowFrequencyArgs investFlowFrequencyArgs) {
            return (InvestFlowFrequencyFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, investFlowFrequencyArgs);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(InvestFlowFrequencyFragment investFlowFrequencyFragment, InvestFlowFrequencyArgs investFlowFrequencyArgs) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, investFlowFrequencyFragment, investFlowFrequencyArgs);
        }
    }
}
