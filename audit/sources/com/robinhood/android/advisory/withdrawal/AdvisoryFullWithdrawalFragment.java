package com.robinhood.android.advisory.withdrawal;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.android.advisory.contracts.AdvisoryFullWithdrawalKey;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.lib.stepupverification.SuvLauncher;
import com.robinhood.android.lib.transfers.CreateTransferCallbacks;
import com.robinhood.android.lib.transfers.CreateTransferResult;
import com.robinhood.android.lib.transfers.TransferFragmentExtensions;
import com.robinhood.android.lib.transfers.robinhood3ds.ThreeDSHostCallbacks;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.udf.event.Event;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import java.util.NoSuchElementException;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
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
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AdvisoryFullWithdrawalFragment.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0007\u0018\u0000 .2\u00020\u00012\u00020\u0002:\u0001.B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010 \u001a\u00020\u001fH\u0017¢\u0006\u0002\u0010!J\u001a\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\b\u0010'\u001a\u00020\u001fH\u0016J\b\u0010(\u001a\u00020\u001fH\u0016J\b\u0010)\u001a\u00020\u001fH\u0016J\b\u0010*\u001a\u00020\u001fH\u0016J\u0010\u0010+\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020-H\u0002R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R \u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001f0\u001dX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006/²\u0006\n\u00100\u001a\u000201X\u008a\u0084\u0002²\u0006\u0012\u0010,\u001a\n\u0012\u0004\u0012\u00020-\u0018\u000102X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/advisory/withdrawal/AdvisoryFullWithdrawalFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/advisory/withdrawal/AdvisoryFullWithdrawalScreenCallbacks;", "<init>", "()V", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "toolbarVisible", "getToolbarVisible", "callbacks", "Lcom/robinhood/android/lib/transfers/CreateTransferCallbacks;", "getCallbacks", "()Lcom/robinhood/android/lib/transfers/CreateTransferCallbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "threeDSCallbacks", "Lcom/robinhood/android/lib/transfers/robinhood3ds/ThreeDSHostCallbacks;", "getThreeDSCallbacks", "()Lcom/robinhood/android/lib/transfers/robinhood3ds/ThreeDSHostCallbacks;", "threeDSCallbacks$delegate", "duxo", "Lcom/robinhood/android/advisory/withdrawal/AdvisoryFullWithdrawalDuxo;", "getDuxo", "()Lcom/robinhood/android/advisory/withdrawal/AdvisoryFullWithdrawalDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "launchSuv", "Lkotlin/Function2;", "Ljava/util/UUID;", "", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onBackClicked", "onRetryClicked", "onCancelClicked", "onWithdrawAndCloseAccountClicked", "handleEvent", "event", "Lcom/robinhood/android/lib/transfers/CreateTransferResult$Required;", "Companion", "feature-advisory-full-withdrawal_externalDebug", "viewState", "Lcom/robinhood/android/advisory/withdrawal/AdvisoryFullWithdrawalViewState;", "Lcom/robinhood/android/udf/event/Event;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class AdvisoryFullWithdrawalFragment extends GenericComposeFragment implements AdvisoryFullWithdrawalScreenCallbacks {
    public static final int $stable = 0;
    private final boolean toolbarVisible;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AdvisoryFullWithdrawalFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/lib/transfers/CreateTransferCallbacks;", 0)), Reflection.property1(new PropertyReference1Impl(AdvisoryFullWithdrawalFragment.class, "threeDSCallbacks", "getThreeDSCallbacks()Lcom/robinhood/android/lib/transfers/robinhood3ds/ThreeDSHostCallbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean useDesignSystemToolbar = true;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(CreateTransferCallbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.advisory.withdrawal.AdvisoryFullWithdrawalFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof CreateTransferCallbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* renamed from: threeDSCallbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 threeDSCallbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(ThreeDSHostCallbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.advisory.withdrawal.AdvisoryFullWithdrawalFragment$special$$inlined$hostActivityCallbacks$2
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof ThreeDSHostCallbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, AdvisoryFullWithdrawalDuxo.class);
    private final Function2<UUID, Boolean, Unit> launchSuv = SuvLauncher.registerSuvLauncher$default(this, new Function0() { // from class: com.robinhood.android.advisory.withdrawal.AdvisoryFullWithdrawalFragment$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.f$0.getNavigator();
        }
    }, new Function0() { // from class: com.robinhood.android.advisory.withdrawal.AdvisoryFullWithdrawalFragment$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AdvisoryFullWithdrawalFragment.launchSuv$lambda$1(this.f$0);
        }
    }, (Function0) null, 4, (Object) null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$5(AdvisoryFullWithdrawalFragment advisoryFullWithdrawalFragment, int i, Composer composer, int i2) {
        advisoryFullWithdrawalFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    private final CreateTransferCallbacks getCallbacks() {
        return (CreateTransferCallbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final ThreeDSHostCallbacks getThreeDSCallbacks() {
        return (ThreeDSHostCallbacks) this.threeDSCallbacks.getValue(this, $$delegatedProperties[1]);
    }

    private final AdvisoryFullWithdrawalDuxo getDuxo() {
        return (AdvisoryFullWithdrawalDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launchSuv$lambda$1(AdvisoryFullWithdrawalFragment advisoryFullWithdrawalFragment) {
        AdvisoryFullWithdrawalDuxo.withdrawAndCloseAccount$default(advisoryFullWithdrawalFragment.getDuxo(), false, 1, null);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1242076267);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1242076267, i2, -1, "com.robinhood.android.advisory.withdrawal.AdvisoryFullWithdrawalFragment.ComposeContent (AdvisoryFullWithdrawalFragment.kt:36)");
            }
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            AdvisoryFullWithdrawalScreenKt.AdvisoryFullWithdrawalScreen(ComposeContent$lambda$2(snapshotState4CollectAsStateWithLifecycle), this, null, composerStartRestartGroup, (i2 << 3) & 112, 4);
            composerStartRestartGroup = composerStartRestartGroup;
            Event<CreateTransferResult.Required> eventComposeContent$lambda$3 = ComposeContent$lambda$3(snapshotState4CollectAsStateWithLifecycle2);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChanged = ((i2 & 14) == 4) | composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle2);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new AdvisoryFullWithdrawalFragment2(this, snapshotState4CollectAsStateWithLifecycle2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(eventComposeContent$lambda$3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.withdrawal.AdvisoryFullWithdrawalFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AdvisoryFullWithdrawalFragment.ComposeContent$lambda$5(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        UiEvent<Unit> threeDSCancelationEvent = getThreeDSCallbacks().getThreeDSCancelationEvent();
        if (threeDSCancelationEvent != null) {
            threeDSCancelationEvent.consumeWith(new Function1() { // from class: com.robinhood.android.advisory.withdrawal.AdvisoryFullWithdrawalFragment$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AdvisoryFullWithdrawalFragment.onViewCreated$lambda$6(this.f$0, (Unit) obj);
                }
            });
        }
        UiEvent<Unit> threeDSCompletionEvent = getThreeDSCallbacks().getThreeDSCompletionEvent();
        if (threeDSCompletionEvent != null) {
            threeDSCompletionEvent.consumeWith(new Function1() { // from class: com.robinhood.android.advisory.withdrawal.AdvisoryFullWithdrawalFragment$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AdvisoryFullWithdrawalFragment.onViewCreated$lambda$7(this.f$0, (Unit) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$6(AdvisoryFullWithdrawalFragment advisoryFullWithdrawalFragment, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        advisoryFullWithdrawalFragment.getDuxo().invalidateCurrentTransfer();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$7(AdvisoryFullWithdrawalFragment advisoryFullWithdrawalFragment, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "<unused var>");
        advisoryFullWithdrawalFragment.getDuxo().withdrawAndCloseAccount(true);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.advisory.withdrawal.AdvisoryFullWithdrawalScreenCallbacks
    public void onBackClicked() {
        requireBaseActivity().onBackPressed();
    }

    @Override // com.robinhood.android.advisory.withdrawal.AdvisoryFullWithdrawalScreenCallbacks
    public void onRetryClicked() {
        getDuxo().retry();
    }

    @Override // com.robinhood.android.advisory.withdrawal.AdvisoryFullWithdrawalScreenCallbacks
    public void onCancelClicked() {
        requireBaseActivity().onBackPressed();
    }

    @Override // com.robinhood.android.advisory.withdrawal.AdvisoryFullWithdrawalScreenCallbacks
    public void onWithdrawAndCloseAccountClicked() {
        AdvisoryFullWithdrawalDuxo.withdrawAndCloseAccount$default(getDuxo(), false, 1, null);
    }

    private static final AdvisoryFullWithdrawalViewState ComposeContent$lambda$2(SnapshotState4<? extends AdvisoryFullWithdrawalViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Event<CreateTransferResult.Required> ComposeContent$lambda$3(SnapshotState4<Event<CreateTransferResult.Required>> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEvent(CreateTransferResult.Required event) throws Throwable {
        if (event instanceof CreateTransferResult.Failure.Generic) {
            TransferFragmentExtensions.handleCreateTransferError(this, ((CreateTransferResult.Failure.Generic) event).getException());
            return;
        }
        if (event instanceof CreateTransferResult.Success) {
            getCallbacks().onTransferSuccess(((CreateTransferResult.Success) event).getPostTransferFlow());
            return;
        }
        if (event instanceof CreateTransferResult.Failure.ThreeDs) {
            getThreeDSCallbacks().onThreeDSRequested(((CreateTransferResult.Failure.ThreeDs) event).getRedirectUrl());
        } else {
            if (!(event instanceof CreateTransferResult.Failure.VerificationRequired)) {
                throw new NoWhenBranchMatchedException();
            }
            CreateTransferResult.Failure.VerificationRequired verificationRequired = (CreateTransferResult.Failure.VerificationRequired) event;
            this.launchSuv.invoke(verificationRequired.getWorkflowId(), Boolean.valueOf(verificationRequired.isMigrated()));
        }
    }

    /* compiled from: AdvisoryFullWithdrawalFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/advisory/withdrawal/AdvisoryFullWithdrawalFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/advisory/withdrawal/AdvisoryFullWithdrawalFragment;", "Lcom/robinhood/android/advisory/contracts/AdvisoryFullWithdrawalKey;", "<init>", "()V", "feature-advisory-full-withdrawal_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<AdvisoryFullWithdrawalFragment, AdvisoryFullWithdrawalKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(AdvisoryFullWithdrawalKey advisoryFullWithdrawalKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, advisoryFullWithdrawalKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public AdvisoryFullWithdrawalKey getArgs(AdvisoryFullWithdrawalFragment advisoryFullWithdrawalFragment) {
            return (AdvisoryFullWithdrawalKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, advisoryFullWithdrawalFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public AdvisoryFullWithdrawalFragment newInstance(AdvisoryFullWithdrawalKey advisoryFullWithdrawalKey) {
            return (AdvisoryFullWithdrawalFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, advisoryFullWithdrawalKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(AdvisoryFullWithdrawalFragment advisoryFullWithdrawalFragment, AdvisoryFullWithdrawalKey advisoryFullWithdrawalKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, advisoryFullWithdrawalFragment, advisoryFullWithdrawalKey);
        }
    }
}
