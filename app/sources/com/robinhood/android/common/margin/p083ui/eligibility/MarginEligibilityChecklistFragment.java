package com.robinhood.android.common.margin.p083ui.eligibility;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.viewinterop.AndroidView_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.margin.C11223R;
import com.robinhood.android.common.margin.p083ui.BaseMarginUpgradeStepComposeFragment;
import com.robinhood.android.common.margin.p083ui.MarginUpgradeEventLogger;
import com.robinhood.android.common.margin.p083ui.MarginUpgradeStep;
import com.robinhood.android.common.margin.p083ui.eligibility.MarginEligibilityChecklistFragment;
import com.robinhood.android.common.margin.p083ui.eligibility.MarginEligibilityChecklistViewState;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.view.ProgressChecklistView;
import com.robinhood.android.lib.margin.api.ApiMarginEligibility2;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.transfers.contracts.TransferFundsDeepLink;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest2;
import com.robinhood.models.util.Money;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.support.contracts.ContactSupportFragmentKey;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import com.robinhood.utils.extensions.Themes4;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.ExceptionsH;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces;
import kotlin.properties.Interfaces2;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: MarginEligibilityChecklistFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 K2\u00020\u00012\u00020\u0002:\u0003IJKB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u000105H\u0016J\r\u00106\u001a\u000201H\u0017¢\u0006\u0002\u00107J\b\u00108\u001a\u00020\u000eH\u0016J\b\u00109\u001a\u000201H\u0016J\u0010\u0010:\u001a\u0002012\u0006\u0010;\u001a\u00020<H\u0002J\u0010\u0010=\u001a\u0002012\u0006\u0010;\u001a\u00020>H\u0002J\u000e\u0010?\u001a\u0004\u0018\u00010@*\u00020AH\u0002J\u000e\u0010B\u001a\u0004\u0018\u00010@*\u00020AH\u0002J\f\u0010C\u001a\u00020D*\u00020AH\u0002J\u0010\u0010E\u001a\u0002012\u0006\u0010F\u001a\u00020'H\u0016J\u0010\u0010G\u001a\u0002012\u0006\u0010F\u001a\u00020'H\u0016J\b\u0010H\u001a\u000201H\u0002R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\r\u001a\u00020\u000e8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\r\u0010\u000fR\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR/\u0010 \u001a\u0004\u0018\u00010\u000e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u000e8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R+\u0010(\u001a\u00020'2\u0006\u0010\u001f\u001a\u00020'8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b-\u0010&\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0010\u0010.\u001a\u0004\u0018\u00010/X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006L"}, m3636d2 = {"Lcom/robinhood/android/common/margin/ui/eligibility/MarginEligibilityChecklistFragment;", "Lcom/robinhood/android/common/margin/ui/BaseMarginUpgradeStepComposeFragment;", "Lcom/robinhood/android/common/view/ProgressChecklistView$ClickListener;", "<init>", "()V", "navigationIcon", "Lcom/robinhood/android/common/margin/ui/BaseMarginUpgradeStepComposeFragment$NavigationIcon;", "getNavigationIcon", "()Lcom/robinhood/android/common/margin/ui/BaseMarginUpgradeStepComposeFragment$NavigationIcon;", "step", "Lcom/robinhood/android/common/margin/ui/MarginUpgradeStep;", "getStep", "()Lcom/robinhood/android/common/margin/ui/MarginUpgradeStep;", "isUk", "", "()Z", "isUk$delegate", "Lkotlin/Lazy;", "duxo", "Lcom/robinhood/android/common/margin/ui/eligibility/MarginEligibilityChecklistDuxo;", "getDuxo", "()Lcom/robinhood/android/common/margin/ui/eligibility/MarginEligibilityChecklistDuxo;", "duxo$delegate", "checklist", "Lcom/robinhood/android/common/view/ProgressChecklistView;", "callbacks", "Lcom/robinhood/android/common/margin/ui/eligibility/MarginEligibilityChecklistFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/common/margin/ui/eligibility/MarginEligibilityChecklistFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "<set-?>", "allChecksPassed", "getAllChecksPassed", "()Ljava/lang/Boolean;", "setAllChecksPassed", "(Ljava/lang/Boolean;)V", "allChecksPassed$delegate", "Lkotlin/properties/ReadWriteProperty;", "", "currentCheckIndex", "getCurrentCheckIndex", "()I", "setCurrentCheckIndex", "(I)V", "currentCheckIndex$delegate", "executeChecksJob", "Lkotlinx/coroutines/Job;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "MarginUpgradeStepComposable", "(Landroidx/compose/runtime/Composer;I)V", "onBackPressed", "onPause", "handleState", "state", "Lcom/robinhood/android/common/margin/ui/eligibility/MarginEligibilityChecklistViewState;", "executeChecks", "Lcom/robinhood/android/common/margin/ui/eligibility/MarginEligibilityChecklistViewState$Loaded;", "getPositiveButtonLabel", "", "Lcom/robinhood/android/lib/margin/api/ApiMarginEligibilityCheck;", "getNegativeButtonLabel", "getPositiveButtonLoggingAction", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "onPositiveButtonClicked", "promptId", "onNegativeButtonClicked", "resetChecklist", "Callbacks", "Args", "Companion", "feature-lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class MarginEligibilityChecklistFragment extends BaseMarginUpgradeStepComposeFragment implements ProgressChecklistView.ClickListener {

    /* renamed from: allChecksPassed$delegate, reason: from kotlin metadata */
    private final Interfaces3 allChecksPassed;
    private ProgressChecklistView checklist;

    /* renamed from: currentCheckIndex$delegate, reason: from kotlin metadata */
    private final Interfaces3 currentCheckIndex;
    private Job executeChecksJob;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(MarginEligibilityChecklistFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/common/margin/ui/eligibility/MarginEligibilityChecklistFragment$Callbacks;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(MarginEligibilityChecklistFragment.class, "allChecksPassed", "getAllChecksPassed()Ljava/lang/Boolean;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(MarginEligibilityChecklistFragment.class, "currentCheckIndex", "getCurrentCheckIndex()I", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final BaseMarginUpgradeStepComposeFragment.NavigationIcon navigationIcon = BaseMarginUpgradeStepComposeFragment.NavigationIcon.CLOSE;
    private final MarginUpgradeStep step = MarginUpgradeStep.ELIGIBILITY;

    /* renamed from: isUk$delegate, reason: from kotlin metadata */
    private final Lazy isUk = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.common.margin.ui.eligibility.MarginEligibilityChecklistFragment$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(MarginEligibilityChecklistFragment.isUk_delegate$lambda$0(this.f$0));
        }
    });

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, MarginEligibilityChecklistDuxo.class);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.common.margin.ui.eligibility.MarginEligibilityChecklistFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof MarginEligibilityChecklistFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* compiled from: MarginEligibilityChecklistFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/common/margin/ui/eligibility/MarginEligibilityChecklistFragment$Callbacks;", "", "onMarginEligibilityPassed", "", "onMarginEligibilityCanceled", "onRetryMarginKnowledgeTest", "feature-lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onMarginEligibilityCanceled();

        void onMarginEligibilityPassed();

        void onRetryMarginKnowledgeTest();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarginUpgradeStepComposable$lambda$6(MarginEligibilityChecklistFragment marginEligibilityChecklistFragment, int i, Composer composer, int i2) {
        marginEligibilityChecklistFragment.MarginUpgradeStepComposable(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public MarginEligibilityChecklistFragment() {
        Interfaces<Object, Interfaces3<Object, Boolean>> interfacesSavedBoolean = BindSavedState2.savedBoolean(this);
        KProperty<?>[] kPropertyArr = $$delegatedProperties;
        this.allChecksPassed = interfacesSavedBoolean.provideDelegate(this, kPropertyArr[1]);
        this.currentCheckIndex = BindSavedState2.savedInt(this, 0).provideDelegate(this, kPropertyArr[2]);
    }

    @Override // com.robinhood.android.common.margin.p083ui.BaseMarginUpgradeStepComposeFragment
    public BaseMarginUpgradeStepComposeFragment.NavigationIcon getNavigationIcon() {
        return this.navigationIcon;
    }

    @Override // com.robinhood.android.common.margin.p083ui.BaseMarginUpgradeStepComposeFragment
    public MarginUpgradeStep getStep() {
        return this.step;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isUk_delegate$lambda$0(MarginEligibilityChecklistFragment marginEligibilityChecklistFragment) {
        return ((Args) INSTANCE.getArgs((Fragment) marginEligibilityChecklistFragment)).isUk();
    }

    @Override // com.robinhood.android.common.margin.p083ui.BaseMarginUpgradeStepComposeFragment
    /* renamed from: isUk */
    public boolean getIsUk() {
        return ((Boolean) this.isUk.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MarginEligibilityChecklistDuxo getDuxo() {
        return (MarginEligibilityChecklistDuxo) this.duxo.getValue();
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final Boolean getAllChecksPassed() {
        return (Boolean) this.allChecksPassed.getValue(this, $$delegatedProperties[1]);
    }

    private final void setAllChecksPassed(Boolean bool) {
        this.allChecksPassed.setValue(this, $$delegatedProperties[1], bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getCurrentCheckIndex() {
        return ((Number) this.currentCheckIndex.getValue(this, $$delegatedProperties[2])).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCurrentCheckIndex(int i) {
        this.currentCheckIndex.setValue(this, $$delegatedProperties[2], Integer.valueOf(i));
    }

    /* compiled from: MarginEligibilityChecklistFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.margin.ui.eligibility.MarginEligibilityChecklistFragment$onViewCreated$1", m3645f = "MarginEligibilityChecklistFragment.kt", m3646l = {67}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.common.margin.ui.eligibility.MarginEligibilityChecklistFragment$onViewCreated$1 */
    static final class C112431 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C112431(Continuation<? super C112431> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MarginEligibilityChecklistFragment.this.new C112431(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C112431) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: MarginEligibilityChecklistFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.common.margin.ui.eligibility.MarginEligibilityChecklistFragment$onViewCreated$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ MarginEligibilityChecklistFragment $tmp0;

            AnonymousClass1(MarginEligibilityChecklistFragment marginEligibilityChecklistFragment) {
                this.$tmp0 = marginEligibilityChecklistFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, MarginEligibilityChecklistFragment.class, "handleState", "handleState(Lcom/robinhood/android/common/margin/ui/eligibility/MarginEligibilityChecklistViewState;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(MarginEligibilityChecklistViewState marginEligibilityChecklistViewState, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$handleState = C112431.invokeSuspend$handleState(this.$tmp0, marginEligibilityChecklistViewState, continuation);
                return objInvokeSuspend$handleState == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$handleState : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((MarginEligibilityChecklistViewState) obj, (Continuation<? super Unit>) continuation);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<MarginEligibilityChecklistViewState> stateFlow = MarginEligibilityChecklistFragment.this.getDuxo().getStateFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(MarginEligibilityChecklistFragment.this);
                this.label = 1;
                if (stateFlow.collect(anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new ExceptionsH();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$handleState(MarginEligibilityChecklistFragment marginEligibilityChecklistFragment, MarginEligibilityChecklistViewState marginEligibilityChecklistViewState, Continuation continuation) {
            marginEligibilityChecklistFragment.handleState(marginEligibilityChecklistViewState);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C112431(null), 1, null);
    }

    @Override // com.robinhood.android.common.margin.p083ui.BaseMarginUpgradeStepComposeFragment
    public void MarginUpgradeStepComposable(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(783759495);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(783759495, i2, -1, "com.robinhood.android.common.margin.ui.eligibility.MarginEligibilityChecklistFragment.MarginUpgradeStepComposable (MarginEligibilityChecklistFragment.kt:71)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.common.margin.ui.eligibility.MarginEligibilityChecklistFragment$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MarginEligibilityChecklistFragment.MarginUpgradeStepComposable$lambda$3$lambda$2(this.f$0, (Context) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function1 function1 = (Function1) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.common.margin.ui.eligibility.MarginEligibilityChecklistFragment$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MarginEligibilityChecklistFragment.MarginUpgradeStepComposable$lambda$5$lambda$4((View) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            AndroidView_androidKt.AndroidView(function1, modifierFillMaxWidth$default, (Function1) objRememberedValue2, composerStartRestartGroup, 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.common.margin.ui.eligibility.MarginEligibilityChecklistFragment$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MarginEligibilityChecklistFragment.MarginUpgradeStepComposable$lambda$6(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View MarginUpgradeStepComposable$lambda$3$lambda$2(MarginEligibilityChecklistFragment marginEligibilityChecklistFragment, Context context) {
        int i;
        Intrinsics.checkNotNullParameter(context, "context");
        Resources.Theme theme = marginEligibilityChecklistFragment.requireContext().getTheme();
        Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
        if (Themes4.resolveAttribute$default(theme, C20690R.attr.isGold, false, 2, null).data != 0) {
            i = C11223R.layout.fragment_margin_eligibility_checklist_gold;
        } else {
            i = C11223R.layout.fragment_margin_eligibility_checklist_default;
        }
        View viewInflate = LayoutInflater.from(context).inflate(i, (ViewGroup) null, false);
        ProgressChecklistView progressChecklistView = (ProgressChecklistView) viewInflate.findViewById(C11223R.id.checklist);
        marginEligibilityChecklistFragment.checklist = progressChecklistView;
        if (progressChecklistView != null) {
            progressChecklistView.setClickListener(marginEligibilityChecklistFragment);
        }
        return viewInflate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarginUpgradeStepComposable$lambda$5$lambda$4(View view) {
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.margin.p083ui.BaseMarginUpgradeStepComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        if (!Intrinsics.areEqual(getAllChecksPassed(), Boolean.FALSE)) {
            return super.onBackPressed();
        }
        getCallbacks().onMarginEligibilityCanceled();
        return true;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        Job job = this.executeChecksJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
        this.executeChecksJob = null;
        resetChecklist();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleState(MarginEligibilityChecklistViewState state) {
        boolean z = true;
        if (state instanceof MarginEligibilityChecklistViewState.Loaded) {
            MarginEligibilityChecklistViewState.Loaded loaded = (MarginEligibilityChecklistViewState.Loaded) state;
            List<ApiMarginEligibility2> items = loaded.getEligibilityCheckResults().getItems();
            ArrayList<ApiMarginEligibility2> arrayList = new ArrayList();
            int i = 0;
            for (Object obj : items) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                if (i < getCurrentCheckIndex()) {
                    arrayList.add(obj);
                }
                i = i2;
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            for (ApiMarginEligibility2 apiMarginEligibility2 : arrayList) {
                Resources resources = getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                arrayList2.add(loaded.getChecklistTitle(resources, MarginEligibilityCheck.INSTANCE.toMarginEligibilityCheck(apiMarginEligibility2)));
            }
            List<ApiMarginEligibility2> items2 = loaded.getEligibilityCheckResults().getItems();
            if (!(items2 instanceof Collection) || !items2.isEmpty()) {
                Iterator<T> it = items2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!((ApiMarginEligibility2) it.next()).getPassed()) {
                            z = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            setAllChecksPassed(Boolean.valueOf(z));
            ProgressChecklistView progressChecklistView = this.checklist;
            if (progressChecklistView != null) {
                progressChecklistView.reset(arrayList2);
            }
            executeChecks(loaded);
            return;
        }
        if (state instanceof MarginEligibilityChecklistViewState.Error) {
            IdlingResourceCounters2.setBusy(IdlingResourceType.MARGIN_CHECKLIST, false);
            AbsErrorHandler.handleError$default(getActivityErrorHandler(), ((MarginEligibilityChecklistViewState.Error) state).getException(), false, 2, null);
            requireActivity().onBackPressed();
        } else {
            if (!(state instanceof MarginEligibilityChecklistViewState.Loading)) {
                throw new NoWhenBranchMatchedException();
            }
            resetChecklist();
            IdlingResourceCounters2.setBusy(IdlingResourceType.MARGIN_CHECKLIST, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void executeChecks(MarginEligibilityChecklistViewState.Loaded state) {
        IdlingResourceType idlingResourceType = IdlingResourceType.MARGIN_CHECKLIST;
        IdlingResourceCounters2.setBusy(idlingResourceType, true);
        int currentCheckIndex = getCurrentCheckIndex();
        if (currentCheckIndex >= state.getEligibilityCheckResults().getItems().size()) {
            IdlingResourceCounters2.setBusy(idlingResourceType, false);
            getCallbacks().onMarginEligibilityPassed();
            resetChecklist();
        } else {
            ApiMarginEligibility2 apiMarginEligibility2 = state.getEligibilityCheckResults().getItems().get(currentCheckIndex);
            Job job = this.executeChecksJob;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, null, 1, null);
            }
            this.executeChecksJob = BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C112421(state, apiMarginEligibility2, currentCheckIndex, null), 3, null);
        }
    }

    /* compiled from: MarginEligibilityChecklistFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.margin.ui.eligibility.MarginEligibilityChecklistFragment$executeChecks$1", m3645f = "MarginEligibilityChecklistFragment.kt", m3646l = {165}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.common.margin.ui.eligibility.MarginEligibilityChecklistFragment$executeChecks$1 */
    static final class C112421 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ApiMarginEligibility2 $currentCheck;
        final /* synthetic */ int $currentCheckIdx;
        final /* synthetic */ MarginEligibilityChecklistViewState.Loaded $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C112421(MarginEligibilityChecklistViewState.Loaded loaded, ApiMarginEligibility2 apiMarginEligibility2, int i, Continuation<? super C112421> continuation) {
            super(2, continuation);
            this.$state = loaded;
            this.$currentCheck = apiMarginEligibility2;
            this.$currentCheckIdx = i;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MarginEligibilityChecklistFragment.this.new C112421(this.$state, this.$currentCheck, this.$currentCheckIdx, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C112421) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ProgressChecklistView progressChecklistView = MarginEligibilityChecklistFragment.this.checklist;
                if (progressChecklistView != null) {
                    MarginEligibilityChecklistViewState.Loaded loaded = this.$state;
                    Resources resources = MarginEligibilityChecklistFragment.this.getResources();
                    Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                    progressChecklistView.push(loaded.getChecklistTitle(resources, MarginEligibilityCheck.INSTANCE.toMarginEligibilityCheck(this.$currentCheck)));
                }
                this.label = 1;
                if (DelayKt.delay(1000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (this.$currentCheck.getPassed()) {
                MarginEligibilityChecklistFragment.this.setCurrentCheckIndex(MarginEligibilityChecklistFragment.this.getCurrentCheckIndex() + 1);
                MarginEligibilityChecklistFragment.this.executeChecks(this.$state);
            } else {
                IdlingResourceCounters2.setBusy(IdlingResourceType.MARGIN_CHECKLIST, false);
                String positiveButtonLabel = MarginEligibilityChecklistFragment.this.getPositiveButtonLabel(this.$currentCheck);
                String negativeButtonLabel = MarginEligibilityChecklistFragment.this.getNegativeButtonLabel(this.$currentCheck);
                ProgressChecklistView progressChecklistView2 = MarginEligibilityChecklistFragment.this.checklist;
                if (progressChecklistView2 != null) {
                    int i2 = this.$currentCheckIdx;
                    String errorMessage = this.$currentCheck.getErrorMessage();
                    progressChecklistView2.displayPrompt(false, i2, errorMessage != null ? MarginEligibilityChecklistFragment.this.getMarkwon().toMarkdown(errorMessage) : null, positiveButtonLabel, negativeButtonLabel);
                }
                MarginUpgradeEventLogger marginUpgradeEventLogger = MarginEligibilityChecklistFragment.this.getMarginUpgradeEventLogger();
                UserInteractionEventData.Action positiveButtonLoggingAction = MarginEligibilityChecklistFragment.this.getPositiveButtonLoggingAction(this.$currentCheck);
                Screen.Name name = Screen.Name.MARGIN_UPGRADE_ELIGIBILITY;
                Screen screen = new Screen(name, null, null, null, 14, null);
                Component.ComponentType componentType = Component.ComponentType.BUTTON;
                String simpleName = this.$currentCheck.getClass().getSimpleName();
                Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
                marginUpgradeEventLogger.logComponentAppear(screen, componentType, simpleName, positiveButtonLoggingAction);
                MarginUpgradeEventLogger marginUpgradeEventLogger2 = MarginEligibilityChecklistFragment.this.getMarginUpgradeEventLogger();
                UserInteractionEventData.Action action = UserInteractionEventData.Action.CANCEL;
                Screen screen2 = new Screen(name, null, null, null, 14, null);
                String simpleName2 = this.$currentCheck.getClass().getSimpleName();
                Intrinsics.checkNotNullExpressionValue(simpleName2, "getSimpleName(...)");
                marginUpgradeEventLogger2.logComponentAppear(screen2, componentType, simpleName2, action);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getPositiveButtonLabel(ApiMarginEligibility2 apiMarginEligibility2) {
        int i;
        Integer numValueOf;
        if (apiMarginEligibility2 instanceof ApiMarginEligibility2.Identity) {
            numValueOf = null;
        } else if (apiMarginEligibility2 instanceof ApiMarginEligibility2.Suitability) {
            numValueOf = Integer.valueOf(C11048R.string.general_label_contact_support);
        } else if (apiMarginEligibility2 instanceof ApiMarginEligibility2.AccountBalance) {
            numValueOf = Integer.valueOf(C11048R.string.general_action_deposit_funds);
        } else if (apiMarginEligibility2 instanceof ApiMarginEligibility2.TradeHistory) {
            numValueOf = Integer.valueOf(C11223R.string.margin_eligibility_trade_failed_continue);
        } else {
            if (!(apiMarginEligibility2 instanceof ApiMarginEligibility2.KnowledgeExperienceGb)) {
                throw new NoWhenBranchMatchedException();
            }
            if (Intrinsics.areEqual(((ApiMarginEligibility2.KnowledgeExperienceGb) apiMarginEligibility2).getRetryAvailable(), Boolean.TRUE)) {
                i = C11048R.string.error_try_again;
            } else {
                i = C11048R.string.general_label_okay;
            }
            numValueOf = Integer.valueOf(i);
        }
        if (numValueOf != null) {
            return getString(numValueOf.intValue());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getNegativeButtonLabel(ApiMarginEligibility2 apiMarginEligibility2) {
        int i;
        Integer numValueOf;
        int i2;
        if (apiMarginEligibility2 instanceof ApiMarginEligibility2.Identity) {
            numValueOf = null;
        } else if (apiMarginEligibility2 instanceof ApiMarginEligibility2.Suitability) {
            if (getIsUk()) {
                i2 = C11048R.string.general_label_okay;
            } else {
                i2 = C11048R.string.general_label_got_it;
            }
            numValueOf = Integer.valueOf(i2);
        } else if ((apiMarginEligibility2 instanceof ApiMarginEligibility2.AccountBalance) || (apiMarginEligibility2 instanceof ApiMarginEligibility2.TradeHistory)) {
            numValueOf = Integer.valueOf(C11223R.string.margin_eligibility_enable_margin_later);
        } else {
            if (!(apiMarginEligibility2 instanceof ApiMarginEligibility2.KnowledgeExperienceGb)) {
                throw new NoWhenBranchMatchedException();
            }
            if (Intrinsics.areEqual(((ApiMarginEligibility2.KnowledgeExperienceGb) apiMarginEligibility2).getRetryAvailable(), Boolean.TRUE)) {
                i = C11223R.string.take_this_test_later;
            } else {
                i = C11048R.string.general_label_contact_support;
            }
            numValueOf = Integer.valueOf(i);
        }
        if (numValueOf != null) {
            return getString(numValueOf.intValue());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UserInteractionEventData.Action getPositiveButtonLoggingAction(ApiMarginEligibility2 apiMarginEligibility2) {
        UserInteractionEventData.Action action;
        if (apiMarginEligibility2 instanceof ApiMarginEligibility2.Identity) {
            action = null;
        } else if (apiMarginEligibility2 instanceof ApiMarginEligibility2.Suitability) {
            action = UserInteractionEventData.Action.DONE;
        } else if (apiMarginEligibility2 instanceof ApiMarginEligibility2.AccountBalance) {
            action = UserInteractionEventData.Action.DEPOSIT_MONEY;
        } else if (apiMarginEligibility2 instanceof ApiMarginEligibility2.TradeHistory) {
            action = UserInteractionEventData.Action.CONTINUE;
        } else {
            if (!(apiMarginEligibility2 instanceof ApiMarginEligibility2.KnowledgeExperienceGb)) {
                throw new NoWhenBranchMatchedException();
            }
            action = UserInteractionEventData.Action.DONE;
        }
        return action == null ? UserInteractionEventData.Action.ACTION_UNSPECIFIED : action;
    }

    @Override // com.robinhood.android.common.view.ProgressChecklistView.ClickListener
    public void onPositiveButtonClicked(int promptId) {
        MarginEligibilityChecklistViewState value = getDuxo().getStateFlow().getValue();
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type com.robinhood.android.common.margin.ui.eligibility.MarginEligibilityChecklistViewState.Loaded");
        MarginEligibilityChecklistViewState.Loaded loaded = (MarginEligibilityChecklistViewState.Loaded) value;
        ApiMarginEligibility2 apiMarginEligibility2 = loaded.getEligibilityCheckResults().getItems().get(getCurrentCheckIndex());
        if (apiMarginEligibility2 instanceof ApiMarginEligibility2.Suitability) {
            getCallbacks().onMarginEligibilityCanceled();
            Navigator navigator = getNavigator();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new ContactSupportFragmentKey.TriageFlow(null, null, null, null, null, 31, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
        } else if (apiMarginEligibility2 instanceof ApiMarginEligibility2.AccountBalance) {
            ApiMarginEligibility2.AccountBalance accountBalance = (ApiMarginEligibility2.AccountBalance) apiMarginEligibility2;
            Money recommendedDeposit = accountBalance.getRecommendedDeposit();
            Intrinsics.checkNotNull(recommendedDeposit);
            BigDecimal decimalValue = recommendedDeposit.getDecimalValue();
            Money minimumDeposit = accountBalance.getMinimumDeposit();
            Intrinsics.checkNotNull(minimumDeposit);
            BigDecimal decimalValue2 = Intrinsics.areEqual(loaded.getCountryCode(), CountryCode.Supported.UnitedStates.INSTANCE) ? decimalValue : minimumDeposit.getDecimalValue();
            Navigator navigator2 = getNavigator();
            Context contextRequireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
            Navigator.DefaultImpls.startActivity$default(navigator2, contextRequireContext2, new TransferFundsDeepLink(decimalValue2, ApiCreateTransferRequest2.ONCE, null, null, null, loaded.getToAccountTypeForTransfer(), null, null, null, null, null, null, null, null, null, 16332, null), null, false, null, null, 60, null);
        } else if (apiMarginEligibility2 instanceof ApiMarginEligibility2.KnowledgeExperienceGb) {
            if (Intrinsics.areEqual(((ApiMarginEligibility2.KnowledgeExperienceGb) apiMarginEligibility2).getRetryAvailable(), Boolean.TRUE)) {
                getCallbacks().onRetryMarginKnowledgeTest();
            } else {
                getCallbacks().onMarginEligibilityCanceled();
            }
        } else if (apiMarginEligibility2 instanceof ApiMarginEligibility2.TradeHistory) {
            setCurrentCheckIndex(getCurrentCheckIndex() + 1);
            executeChecks(loaded);
        } else if (!(apiMarginEligibility2 instanceof ApiMarginEligibility2.Identity)) {
            throw new NoWhenBranchMatchedException();
        }
        MarginUpgradeEventLogger marginUpgradeEventLogger = getMarginUpgradeEventLogger();
        UserInteractionEventData.Action positiveButtonLoggingAction = getPositiveButtonLoggingAction(apiMarginEligibility2);
        Screen screen = new Screen(Screen.Name.MARGIN_UPGRADE_ELIGIBILITY, null, null, null, 14, null);
        Component.ComponentType componentType = Component.ComponentType.BUTTON;
        String simpleName = apiMarginEligibility2.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        marginUpgradeEventLogger.logTap(screen, componentType, simpleName, positiveButtonLoggingAction);
    }

    @Override // com.robinhood.android.common.view.ProgressChecklistView.ClickListener
    public void onNegativeButtonClicked(int promptId) {
        MarginEligibilityChecklistViewState value = getDuxo().getStateFlow().getValue();
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type com.robinhood.android.common.margin.ui.eligibility.MarginEligibilityChecklistViewState.Loaded");
        ApiMarginEligibility2 apiMarginEligibility2 = ((MarginEligibilityChecklistViewState.Loaded) value).getEligibilityCheckResults().getItems().get(getCurrentCheckIndex());
        MarginUpgradeEventLogger marginUpgradeEventLogger = getMarginUpgradeEventLogger();
        UserInteractionEventData.Action action = UserInteractionEventData.Action.CANCEL;
        Screen screen = new Screen(Screen.Name.MARGIN_UPGRADE_ELIGIBILITY, null, null, null, 14, null);
        Component.ComponentType componentType = Component.ComponentType.BUTTON;
        String simpleName = apiMarginEligibility2.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        marginUpgradeEventLogger.logTap(screen, componentType, simpleName, action);
        if (apiMarginEligibility2 instanceof ApiMarginEligibility2.KnowledgeExperienceGb) {
            if (Intrinsics.areEqual(((ApiMarginEligibility2.KnowledgeExperienceGb) apiMarginEligibility2).getRetryAvailable(), Boolean.TRUE)) {
                getCallbacks().onMarginEligibilityCanceled();
                return;
            }
            getCallbacks().onMarginEligibilityCanceled();
            Navigator navigator = getNavigator();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new ContactSupportFragmentKey.TriageFlow(null, null, null, null, null, 31, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
            return;
        }
        getCallbacks().onMarginEligibilityCanceled();
    }

    private final void resetChecklist() {
        setAllChecksPassed(null);
        ProgressChecklistView progressChecklistView = this.checklist;
        if (progressChecklistView != null) {
            ProgressChecklistView.reset$default(progressChecklistView, null, 1, null);
        }
        setCurrentCheckIndex(0);
    }

    /* compiled from: MarginEligibilityChecklistFragment.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/common/margin/ui/eligibility/MarginEligibilityChecklistFragment$Args;", "Landroid/os/Parcelable;", "accountNumber", "", "isUk", "", "<init>", "(Ljava/lang/String;Z)V", "getAccountNumber", "()Ljava/lang/String;", "()Z", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String accountNumber;
        private final boolean isUk;

        /* compiled from: MarginEligibilityChecklistFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readString(), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.accountNumber;
            }
            if ((i & 2) != 0) {
                z = args.isUk;
            }
            return args.copy(str, z);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsUk() {
            return this.isUk;
        }

        public final Args copy(String accountNumber, boolean isUk) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            return new Args(accountNumber, isUk);
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
            return Intrinsics.areEqual(this.accountNumber, args.accountNumber) && this.isUk == args.isUk;
        }

        public int hashCode() {
            return (this.accountNumber.hashCode() * 31) + Boolean.hashCode(this.isUk);
        }

        public String toString() {
            return "Args(accountNumber=" + this.accountNumber + ", isUk=" + this.isUk + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.accountNumber);
            dest.writeInt(this.isUk ? 1 : 0);
        }

        public Args(String accountNumber, boolean z) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            this.accountNumber = accountNumber;
            this.isUk = z;
        }

        public /* synthetic */ Args(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? false : z);
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final boolean isUk() {
            return this.isUk;
        }
    }

    /* compiled from: MarginEligibilityChecklistFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/common/margin/ui/eligibility/MarginEligibilityChecklistFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/common/margin/ui/eligibility/MarginEligibilityChecklistFragment;", "Lcom/robinhood/android/common/margin/ui/eligibility/MarginEligibilityChecklistFragment$Args;", "<init>", "()V", "feature-lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<MarginEligibilityChecklistFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(MarginEligibilityChecklistFragment marginEligibilityChecklistFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, marginEligibilityChecklistFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public MarginEligibilityChecklistFragment newInstance(Args args) {
            return (MarginEligibilityChecklistFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(MarginEligibilityChecklistFragment marginEligibilityChecklistFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, marginEligibilityChecklistFragment, args);
        }
    }
}
