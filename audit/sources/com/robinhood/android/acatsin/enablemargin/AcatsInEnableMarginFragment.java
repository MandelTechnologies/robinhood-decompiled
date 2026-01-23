package com.robinhood.android.acatsin.enablemargin;

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
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import com.robinhood.android.acatsin.enablemargin.AcatsInEnableMarginContract;
import com.robinhood.android.acatsin.enablemargin.AcatsInEnableMarginViewState;
import com.robinhood.android.acatsin.p058ui.AcatsFlowStepFragment2;
import com.robinhood.android.acatsin.util.AcatsFlowStep;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.margin.contracts.EnableMarginInvestingKey;
import com.robinhood.android.margin.contracts.EnableMarginInvestingKey2;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.app.contracts.MarginUpgradeContract;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract3;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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

/* compiled from: AcatsInEnableMarginFragment.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0007\u0018\u0000 #2\u00020\u00012\u00020\u0002:\u0001#B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010 \u001a\u00020!H\u0017¢\u0006\u0002\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010\u001b\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u001e \u001f*\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d0\u001d0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$²\u0006\n\u0010%\u001a\u00020&X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/acatsin/enablemargin/AcatsInEnableMarginFragment;", "Lcom/robinhood/android/acatsin/ui/BaseAcatsFlowStepComposeFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "screenEventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "getScreenEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "callbacks", "Lcom/robinhood/android/acatsin/enablemargin/AcatsInEnableMarginContract$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/acatsin/enablemargin/AcatsInEnableMarginContract$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/acatsin/enablemargin/AcatsInEnableMarginDuxo;", "getDuxo", "()Lcom/robinhood/android/acatsin/enablemargin/AcatsInEnableMarginDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "isLaunched", "", "enableMarginLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/robinhood/android/navigation/contracts/NavigationActivityResultContract$NavigationParams;", "Lcom/robinhood/android/margin/contracts/EnableMarginInvestingKey;", "kotlin.jvm.PlatformType", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "Companion", "feature-acats-in_externalDebug", "viewState", "Lcom/robinhood/android/acatsin/enablemargin/AcatsInEnableMarginViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AcatsInEnableMarginFragment extends AcatsFlowStepFragment2 implements AutoLoggableFragment {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private final ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<EnableMarginInvestingKey>> enableMarginLauncher;
    private boolean isLaunched;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AcatsInEnableMarginFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/acatsin/enablemargin/AcatsInEnableMarginContract$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$6(AcatsInEnableMarginFragment acatsInEnableMarginFragment, int i, Composer composer, int i2) {
        acatsInEnableMarginFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    public AcatsInEnableMarginFragment() {
        super(null, AcatsFlowStep.ENABLE_MARGIN, 1, null);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(AcatsInEnableMarginContract.Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.acatsin.enablemargin.AcatsInEnableMarginFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof AcatsInEnableMarginContract.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        this.duxo = DuxosKt.duxo(this, AcatsInEnableMarginDuxo.class);
        ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<EnableMarginInvestingKey>> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new MarginUpgradeContract(new Function0() { // from class: com.robinhood.android.acatsin.enablemargin.AcatsInEnableMarginFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.getNavigator();
            }
        }), new ActivityResultCallback() { // from class: com.robinhood.android.acatsin.enablemargin.AcatsInEnableMarginFragment$enableMarginLauncher$2
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(MarginUpgradeContract.Result result) {
                if (Intrinsics.areEqual(result, MarginUpgradeContract.Result.Complete.INSTANCE)) {
                    if (this.this$0.isLaunched) {
                        this.this$0.getCallbacks().onMarginEnableResult(true);
                    }
                } else if (!(result instanceof MarginUpgradeContract.Result.Canceled)) {
                    if (result != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (((MarginUpgradeContract.Result.Canceled) result).isDeclined()) {
                    this.this$0.getCallbacks().onMarginEnableResult(false);
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.enableMarginLauncher = activityResultLauncherRegisterForActivityResult;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return new Screen(Screen.Name.ACATS_IN_MARGIN_ENABLEMENT, null, null, null, 14, null);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public com.robinhood.rosetta.eventlogging.Context getScreenEventContext() {
        return ((AcatsInEnableMarginContract.Key) INSTANCE.getArgs((Fragment) this)).getScreenContext().toEventContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AcatsInEnableMarginContract.Callbacks getCallbacks() {
        return (AcatsInEnableMarginContract.Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final AcatsInEnableMarginDuxo getDuxo() {
        return (AcatsInEnableMarginDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1183616837);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1183616837, i2, -1, "com.robinhood.android.acatsin.enablemargin.AcatsInEnableMarginFragment.ComposeContent (AcatsInEnableMarginFragment.kt:68)");
            }
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            AcatsInEnableMarginViewState acatsInEnableMarginViewStateComposeContent$lambda$1 = ComposeContent$lambda$1(snapshotState4CollectAsStateWithLifecycle);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this) | composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.acatsin.enablemargin.AcatsInEnableMarginFragment$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AcatsInEnableMarginFragment.ComposeContent$lambda$3$lambda$2(this.f$0, snapshotState4CollectAsStateWithLifecycle);
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
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.acatsin.enablemargin.AcatsInEnableMarginFragment$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AcatsInEnableMarginFragment.ComposeContent$lambda$5$lambda$4(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            AcatsInEnableMarginComposable.AcatsInEnableMarginComposable(acatsInEnableMarginViewStateComposeContent$lambda$1, function0, (Function0) objRememberedValue2, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.acatsin.enablemargin.AcatsInEnableMarginFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AcatsInEnableMarginFragment.ComposeContent$lambda$6(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$3$lambda$2(AcatsInEnableMarginFragment acatsInEnableMarginFragment, SnapshotState4 snapshotState4) {
        acatsInEnableMarginFragment.isLaunched = true;
        ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<EnableMarginInvestingKey>> activityResultLauncher = acatsInEnableMarginFragment.enableMarginLauncher;
        String accountNumber = ((AcatsInEnableMarginContract.Key) INSTANCE.getArgs((Fragment) acatsInEnableMarginFragment)).getAccountNumber();
        EnableMarginInvestingKey2.AcatsIn acatsIn = EnableMarginInvestingKey2.AcatsIn.INSTANCE;
        AcatsInEnableMarginViewState acatsInEnableMarginViewStateComposeContent$lambda$1 = ComposeContent$lambda$1(snapshotState4);
        AcatsInEnableMarginViewState.Loaded loaded = acatsInEnableMarginViewStateComposeContent$lambda$1 instanceof AcatsInEnableMarginViewState.Loaded ? (AcatsInEnableMarginViewState.Loaded) acatsInEnableMarginViewStateComposeContent$lambda$1 : null;
        NavigationActivityResultContract3.launch$default(activityResultLauncher, new EnableMarginInvestingKey(accountNumber, "ACATS_IN", acatsIn, false, loaded != null ? loaded.getInHoodMonth2025Promo() : false), null, false, 6, null);
        return Unit.INSTANCE;
    }

    private static final AcatsInEnableMarginViewState ComposeContent$lambda$1(SnapshotState4<? extends AcatsInEnableMarginViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$5$lambda$4(AcatsInEnableMarginFragment acatsInEnableMarginFragment) {
        acatsInEnableMarginFragment.getCallbacks().onMarginEnableResult(false);
        return Unit.INSTANCE;
    }

    /* compiled from: AcatsInEnableMarginFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/acatsin/enablemargin/AcatsInEnableMarginFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/acatsin/enablemargin/AcatsInEnableMarginFragment;", "Lcom/robinhood/android/acatsin/enablemargin/AcatsInEnableMarginContract$Key;", "<init>", "()V", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<AcatsInEnableMarginFragment, AcatsInEnableMarginContract.Key> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(AcatsInEnableMarginContract.Key key) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, key);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public AcatsInEnableMarginContract.Key getArgs(AcatsInEnableMarginFragment acatsInEnableMarginFragment) {
            return (AcatsInEnableMarginContract.Key) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, acatsInEnableMarginFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public AcatsInEnableMarginFragment newInstance(AcatsInEnableMarginContract.Key key) {
            return (AcatsInEnableMarginFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, key);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(AcatsInEnableMarginFragment acatsInEnableMarginFragment, AcatsInEnableMarginContract.Key key) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, acatsInEnableMarginFragment, key);
        }
    }
}
