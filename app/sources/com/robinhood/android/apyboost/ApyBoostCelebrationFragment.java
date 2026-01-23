package com.robinhood.android.apyboost;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.microgramsdui.MicrogramManager;
import com.robinhood.apy.mindeposit.contracts.ApyMinDepositEducationService;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.lib.sweep.enrollment.SweepEnrollmentStore;
import com.robinhood.librobinhood.data.store.SweepsInterestStore;
import com.robinhood.models.p355ui.bonfire.UiPostTransferPage;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import microgram.android.MicrogramLaunchId;
import microgram.android.RemoteMicrogramApplication;

/* compiled from: ApyBoostCelebrationFragment.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 12\u00020\u00012\u00020\u0002:\u0003/01B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0016J\b\u0010'\u001a\u00020$H\u0016J\u001a\u0010(\u001a\u00020$2\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\r\u0010-\u001a\u00020$H\u0017¢\u0006\u0002\u0010.R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u00020\u001aX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 ¨\u00062"}, m3636d2 = {"Lcom/robinhood/android/apyboost/ApyBoostCelebrationFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "sweepEnrollmentStore", "Lcom/robinhood/lib/sweep/enrollment/SweepEnrollmentStore;", "getSweepEnrollmentStore", "()Lcom/robinhood/lib/sweep/enrollment/SweepEnrollmentStore;", "setSweepEnrollmentStore", "(Lcom/robinhood/lib/sweep/enrollment/SweepEnrollmentStore;)V", "sweepsInterestStore", "Lcom/robinhood/librobinhood/data/store/SweepsInterestStore;", "getSweepsInterestStore", "()Lcom/robinhood/librobinhood/data/store/SweepsInterestStore;", "setSweepsInterestStore", "(Lcom/robinhood/librobinhood/data/store/SweepsInterestStore;)V", "microgramManager", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "getMicrogramManager", "()Lcom/robinhood/android/microgramsdui/MicrogramManager;", "setMicrogramManager", "(Lcom/robinhood/android/microgramsdui/MicrogramManager;)V", "_screenName", "Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "callbacks", "Lcom/robinhood/android/apyboost/ApyBoostCelebrationFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/apyboost/ApyBoostCelebrationFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onStop", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "Callbacks", "Args", "Companion", "feature-lib-apy-boost_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class ApyBoostCelebrationFragment extends GenericComposeFragment implements AutoLoggableFragment {
    private final Screen.Name _screenName;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    private final Screen eventScreen;
    public MicrogramManager microgramManager;
    public SweepEnrollmentStore sweepEnrollmentStore;
    public SweepsInterestStore sweepsInterestStore;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(ApyBoostCelebrationFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/apyboost/ApyBoostCelebrationFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: ApyBoostCelebrationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/apyboost/ApyBoostCelebrationFragment$Callbacks;", "", "onConfirmationClick", "", "action", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "feature-lib-apy-boost_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onConfirmationClick(GenericAction action);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(ApyBoostCelebrationFragment apyBoostCelebrationFragment, int i, Composer composer, int i2) {
        apyBoostCelebrationFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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
    public Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    public ApyBoostCelebrationFragment() {
        Screen.Name name = Screen.Name.APY_BOOST_CELEBRATION;
        this._screenName = name;
        this.eventScreen = new Screen(name, null, null, null, 14, null);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.apyboost.ApyBoostCelebrationFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
    }

    public final SweepEnrollmentStore getSweepEnrollmentStore() {
        SweepEnrollmentStore sweepEnrollmentStore = this.sweepEnrollmentStore;
        if (sweepEnrollmentStore != null) {
            return sweepEnrollmentStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sweepEnrollmentStore");
        return null;
    }

    public final void setSweepEnrollmentStore(SweepEnrollmentStore sweepEnrollmentStore) {
        Intrinsics.checkNotNullParameter(sweepEnrollmentStore, "<set-?>");
        this.sweepEnrollmentStore = sweepEnrollmentStore;
    }

    public final SweepsInterestStore getSweepsInterestStore() {
        SweepsInterestStore sweepsInterestStore = this.sweepsInterestStore;
        if (sweepsInterestStore != null) {
            return sweepsInterestStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sweepsInterestStore");
        return null;
    }

    public final void setSweepsInterestStore(SweepsInterestStore sweepsInterestStore) {
        Intrinsics.checkNotNullParameter(sweepsInterestStore, "<set-?>");
        this.sweepsInterestStore = sweepsInterestStore;
    }

    public final MicrogramManager getMicrogramManager() {
        MicrogramManager microgramManager = this.microgramManager;
        if (microgramManager != null) {
            return microgramManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("microgramManager");
        return null;
    }

    public final void setMicrogramManager(MicrogramManager microgramManager) {
        Intrinsics.checkNotNullParameter(microgramManager, "<set-?>");
        this.microgramManager = microgramManager;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return this.eventScreen;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        requireBaseActivity().hideToolbar();
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        UiPostTransferPage.ApyBoostCelebration apyBoostCelebration = ((Args) INSTANCE.getArgs((Fragment) this)).getApyBoostCelebration();
        if (apyBoostCelebration != null ? Intrinsics.areEqual(apyBoostCelebration.isDarkThemeOverride(), Boolean.TRUE) : false) {
            requireBaseActivity().resetStatusBarStyleOverride();
        }
        super.onStop();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        UiPostTransferPage.ApyBoostCelebration apyBoostCelebration = ((Args) INSTANCE.getArgs((Fragment) this)).getApyBoostCelebration();
        if (apyBoostCelebration != null ? Intrinsics.areEqual(apyBoostCelebration.isDarkThemeOverride(), Boolean.TRUE) : false) {
            requireBaseActivity().overrideStatusBarStyle(false);
        }
        getSweepsInterestStore().refreshNoAccountNumber(true);
        SweepEnrollmentStore.refreshSweepSplash$default(getSweepEnrollmentStore(), null, true, 1, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C95701((ApyMinDepositEducationService) MicrogramManager.DefaultImpls.m16549getInstancemoChb0s$default(getMicrogramManager(), getLifecycleScope(), new MicrogramLaunchId(new RemoteMicrogramApplication("app-apy-min-deposit-education", null, 2, null), null, 2, null), null, 4, null).getComponent().getServiceLocator().getClient(ApyMinDepositEducationService.class), null), 3, null);
    }

    /* compiled from: ApyBoostCelebrationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.apyboost.ApyBoostCelebrationFragment$onViewCreated$1", m3645f = "ApyBoostCelebrationFragment.kt", m3646l = {86}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.apyboost.ApyBoostCelebrationFragment$onViewCreated$1 */
    static final class C95701 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ApyMinDepositEducationService $educationPageService;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C95701(ApyMinDepositEducationService apyMinDepositEducationService, Continuation<? super C95701> continuation) {
            super(2, continuation);
            this.$educationPageService = apyMinDepositEducationService;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C95701(this.$educationPageService, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C95701) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ApyMinDepositEducationService apyMinDepositEducationService = this.$educationPageService;
                this.label = 1;
                if (apyMinDepositEducationService.dismissPage(this) == coroutine_suspended) {
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
        Composer composerStartRestartGroup = composer.startRestartGroup(-1084971170);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1084971170, i2, -1, "com.robinhood.android.apyboost.ApyBoostCelebrationFragment.ComposeContent (ApyBoostCelebrationFragment.kt:90)");
            }
            UiPostTransferPage.ApyBoostCelebration apyBoostCelebration = ((Args) INSTANCE.getArgs((Fragment) this)).getApyBoostCelebration();
            if (apyBoostCelebration != null) {
                Screen.Name name = this._screenName;
                String loggingIdentifier = apyBoostCelebration.getLoggingIdentifier();
                if (loggingIdentifier == null) {
                    loggingIdentifier = "";
                }
                AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(name, null, loggingIdentifier, null, 10, null), null, getScreenEventContext(), null, null, 53, null), ComposableLambda3.rememberComposableLambda(1011028405, true, new ApyBoostCelebrationFragment2(apyBoostCelebration, this), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.apyboost.ApyBoostCelebrationFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ApyBoostCelebrationFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: ApyBoostCelebrationFragment.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/apyboost/ApyBoostCelebrationFragment$Args;", "Landroid/os/Parcelable;", "feature", "", "apyBoostCelebration", "Lcom/robinhood/models/ui/bonfire/UiPostTransferPage$ApyBoostCelebration;", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/ui/bonfire/UiPostTransferPage$ApyBoostCelebration;)V", "getFeature", "()Ljava/lang/String;", "getApyBoostCelebration", "()Lcom/robinhood/models/ui/bonfire/UiPostTransferPage$ApyBoostCelebration;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-apy-boost_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final UiPostTransferPage.ApyBoostCelebration apyBoostCelebration;
        private final String feature;

        /* compiled from: ApyBoostCelebrationFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readString(), (UiPostTransferPage.ApyBoostCelebration) parcel.readParcelable(Args.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, String str, UiPostTransferPage.ApyBoostCelebration apyBoostCelebration, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.feature;
            }
            if ((i & 2) != 0) {
                apyBoostCelebration = args.apyBoostCelebration;
            }
            return args.copy(str, apyBoostCelebration);
        }

        /* renamed from: component1, reason: from getter */
        public final String getFeature() {
            return this.feature;
        }

        /* renamed from: component2, reason: from getter */
        public final UiPostTransferPage.ApyBoostCelebration getApyBoostCelebration() {
            return this.apyBoostCelebration;
        }

        public final Args copy(String feature, UiPostTransferPage.ApyBoostCelebration apyBoostCelebration) {
            Intrinsics.checkNotNullParameter(feature, "feature");
            return new Args(feature, apyBoostCelebration);
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
            return Intrinsics.areEqual(this.feature, args.feature) && Intrinsics.areEqual(this.apyBoostCelebration, args.apyBoostCelebration);
        }

        public int hashCode() {
            int iHashCode = this.feature.hashCode() * 31;
            UiPostTransferPage.ApyBoostCelebration apyBoostCelebration = this.apyBoostCelebration;
            return iHashCode + (apyBoostCelebration == null ? 0 : apyBoostCelebration.hashCode());
        }

        public String toString() {
            return "Args(feature=" + this.feature + ", apyBoostCelebration=" + this.apyBoostCelebration + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.feature);
            dest.writeParcelable(this.apyBoostCelebration, flags);
        }

        public Args(String feature, UiPostTransferPage.ApyBoostCelebration apyBoostCelebration) {
            Intrinsics.checkNotNullParameter(feature, "feature");
            this.feature = feature;
            this.apyBoostCelebration = apyBoostCelebration;
        }

        public /* synthetic */ Args(String str, UiPostTransferPage.ApyBoostCelebration apyBoostCelebration, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, apyBoostCelebration);
        }

        public final String getFeature() {
            return this.feature;
        }

        public final UiPostTransferPage.ApyBoostCelebration getApyBoostCelebration() {
            return this.apyBoostCelebration;
        }
    }

    /* compiled from: ApyBoostCelebrationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/apyboost/ApyBoostCelebrationFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/apyboost/ApyBoostCelebrationFragment;", "Lcom/robinhood/android/apyboost/ApyBoostCelebrationFragment$Args;", "<init>", "()V", "feature-lib-apy-boost_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<ApyBoostCelebrationFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(ApyBoostCelebrationFragment apyBoostCelebrationFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, apyBoostCelebrationFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public ApyBoostCelebrationFragment newInstance(Args args) {
            return (ApyBoostCelebrationFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(ApyBoostCelebrationFragment apyBoostCelebrationFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, apyBoostCelebrationFragment, args);
        }
    }
}
