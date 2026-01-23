package com.robinhood.android.rhymigration.p245ui.openaccount;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.airbnb.lottie.LottieAnimationView;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.common.mcduckling.prefs.ShouldResetCashTabPref;
import com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.navigation.app.keys.LegacyDialogFragmentKey;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.rhymigration.C27577R;
import com.robinhood.android.rhymigration.databinding.FragmentRhyOpenAccountBinding;
import com.robinhood.android.rhymigration.model.Bound;
import com.robinhood.android.rhymigration.model.UiRhyMigrationLoadingAnimation;
import com.robinhood.android.rhymigration.p245ui.PageDataCallbacks;
import com.robinhood.android.rhymigration.p245ui.RhyOnboardingLoggingUtils;
import com.robinhood.android.rhymigration.p245ui.openaccount.RhyOpenAccountFragment;
import com.robinhood.android.rhymigration.p245ui.openaccount.RhyOpenAccountViewState2;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.iac.alertsheet.p295ui.IacAlertSheetFragment;
import com.robinhood.librobinhood.data.store.bonfire.RhyAccountStore;
import com.robinhood.librobinhood.logging.RhyGlobalLoggingContext;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.annotation.ShowRhyFundingBottomSheetPref;
import com.robinhood.rosetta.eventlogging.AgreementContext;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlin.time.Duration;
import kotlin.time.Duration3;
import kotlin.time.DurationUnitJvm;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: RhyOpenAccountFragment.kt */
@Metadata(m3635d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 m2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002lmB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020N2\b\u0010O\u001a\u0004\u0018\u00010PH\u0016J\b\u0010Q\u001a\u00020LH\u0016J\b\u0010R\u001a\u00020LH\u0016J\b\u0010S\u001a\u00020#H\u0016J\u0010\u0010T\u001a\u00020L2\u0006\u0010U\u001a\u000208H\u0016J\u0010\u0010V\u001a\u00020L2\u0006\u0010W\u001a\u00020XH\u0002J\b\u0010Y\u001a\u00020LH\u0002J\b\u0010Z\u001a\u00020LH\u0002J\b\u0010[\u001a\u00020LH\u0002J\u0010\u0010\\\u001a\u00020L2\u0006\u0010]\u001a\u00020^H\u0002J\u0018\u0010_\u001a\u00020L2\u0006\u0010`\u001a\u00020?2\u0006\u0010a\u001a\u000208H\u0002J\u0010\u0010b\u001a\u00020L2\u0006\u0010c\u001a\u00020dH\u0002J\b\u0010e\u001a\u00020LH\u0002J\t\u0010f\u001a\u00020#H\u0096\u0001R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0019\u001a\u00020\u001a8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010\u001f\u001a\u00020\u001a8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR\u0014\u0010\"\u001a\u00020#X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u001b\u0010&\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b(\u0010)R\u001b\u0010,\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b.\u0010/R\u001b\u00102\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u00101\u001a\u0004\b4\u00105R\u000e\u00107\u001a\u000208X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020#X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010:\u001a\u00020;8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0014\u0010>\u001a\u00020?8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0014\u0010B\u001a\u00020C8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u001b\u0010F\u001a\u00020G8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010+\u001a\u0004\bH\u0010IR\u0018\u0010g\u001a\b\u0012\u0004\u0012\u00020i0hX\u0096\u0005¢\u0006\u0006\u001a\u0004\bj\u0010k¨\u0006n"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/openaccount/RhyOpenAccountFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "Lcom/robinhood/android/common/ui/BaseBottomSheetDialogFragment$OnDismissListener;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "rhyAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "getRhyAccountStore", "()Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "setRhyAccountStore", "(Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;)V", "rhyGlobalLoggingContext", "Lcom/robinhood/librobinhood/logging/RhyGlobalLoggingContext;", "getRhyGlobalLoggingContext", "()Lcom/robinhood/librobinhood/logging/RhyGlobalLoggingContext;", "setRhyGlobalLoggingContext", "(Lcom/robinhood/librobinhood/logging/RhyGlobalLoggingContext;)V", "shouldResetCashTabPref", "Lcom/robinhood/prefs/BooleanPreference;", "getShouldResetCashTabPref", "()Lcom/robinhood/prefs/BooleanPreference;", "setShouldResetCashTabPref", "(Lcom/robinhood/prefs/BooleanPreference;)V", "showRhyFundingBottomSheetPref", "getShowRhyFundingBottomSheetPref", "setShowRhyFundingBottomSheetPref", "toolbarVisible", "", "getToolbarVisible", "()Z", "duxo", "Lcom/robinhood/android/rhymigration/ui/openaccount/RhyOpenAccountDuxo;", "getDuxo", "()Lcom/robinhood/android/rhymigration/ui/openaccount/RhyOpenAccountDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/rhymigration/databinding/FragmentRhyOpenAccountBinding;", "getBinding", "()Lcom/robinhood/android/rhymigration/databinding/FragmentRhyOpenAccountBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/rhymigration/ui/openaccount/RhyOpenAccountFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/rhymigration/ui/openaccount/RhyOpenAccountFragment$Callbacks;", "callbacks$delegate", "textState", "", "hasUserBeenApproved", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "screenName", "", "getScreenName", "()Ljava/lang/String;", "screenEventData", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;", "getScreenEventData", "()Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;", "loadingAnimation", "Lcom/robinhood/android/rhymigration/model/UiRhyMigrationLoadingAnimation;", "getLoadingAnimation", "()Lcom/robinhood/android/rhymigration/model/UiRhyMigrationLoadingAnimation;", "loadingAnimation$delegate", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onStop", "onBackPressed", "onBottomSheetDismissed", "id", "bind", "state", "Lcom/robinhood/android/rhymigration/ui/openaccount/RhyOpenAccountViewState;", "showApprovedButtons", "showCmSunsetButtons", "showTimeoutBottomSheet", "showIacAlertSheet", "action", "Lcom/robinhood/android/rhymigration/ui/openaccount/CurrentStateAction$ShowIacAlertSheet;", "setText", "text", "transitionState", "setLoopingAnimation", "bound", "Lcom/robinhood/android/rhymigration/model/Bound;", "playSuccessPhraseTransition", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Companion", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class RhyOpenAccountFragment extends BaseFragment implements RegionGated, AutoLoggableFragment, BaseBottomSheetDialogFragment.OnDismissListener {
    private static final long BUTTON_DELAY_SECONDS = 1;
    private static final String TIMEOUT_BOTTOM_SHEET_TAG = "rhy-timeout-bottom-sheet";
    private static final String iacBottomSheetTag = "rhy-open-account-loading-iac-bottom-sheet";
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public EventLogger eventLogger;
    private boolean hasUserBeenApproved;

    /* renamed from: loadingAnimation$delegate, reason: from kotlin metadata */
    private final Lazy loadingAnimation;
    public RhyAccountStore rhyAccountStore;
    public RhyGlobalLoggingContext rhyGlobalLoggingContext;

    @ShouldResetCashTabPref
    public BooleanPreference shouldResetCashTabPref;

    @ShowRhyFundingBottomSheetPref
    public BooleanPreference showRhyFundingBottomSheetPref;
    private int textState;
    private final boolean toolbarVisible;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RhyOpenAccountFragment.class, "binding", "getBinding()Lcom/robinhood/android/rhymigration/databinding/FragmentRhyOpenAccountBinding;", 0)), Reflection.property1(new PropertyReference1Impl(RhyOpenAccountFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/rhymigration/ui/openaccount/RhyOpenAccountFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: RhyOpenAccountFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/openaccount/RhyOpenAccountFragment$Callbacks;", "Lcom/robinhood/android/rhymigration/ui/PageDataCallbacks;", "onOpenAccountSetupRewardsClicked", "", "onOpenAccountSkipRewardsClicked", "onOpenAccountCanceled", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks extends PageDataCallbacks {
        void onOpenAccountCanceled();

        void onOpenAccountSetupRewardsClicked();

        void onOpenAccountSkipRewardsClicked();
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

    public RhyOpenAccountFragment() {
        super(C27577R.layout.fragment_rhy_open_account);
        this.$$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);
        this.duxo = OldDuxos.oldDuxo(this, RhyOpenAccountDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, RhyOpenAccountFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.rhymigration.ui.openaccount.RhyOpenAccountFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (android.content.Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof RhyOpenAccountFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        this.loadingAnimation = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.rhymigration.ui.openaccount.RhyOpenAccountFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RhyOpenAccountFragment.loadingAnimation_delegate$lambda$0(this.f$0);
            }
        });
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

    public final RhyAccountStore getRhyAccountStore() {
        RhyAccountStore rhyAccountStore = this.rhyAccountStore;
        if (rhyAccountStore != null) {
            return rhyAccountStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rhyAccountStore");
        return null;
    }

    public final void setRhyAccountStore(RhyAccountStore rhyAccountStore) {
        Intrinsics.checkNotNullParameter(rhyAccountStore, "<set-?>");
        this.rhyAccountStore = rhyAccountStore;
    }

    public final RhyGlobalLoggingContext getRhyGlobalLoggingContext() {
        RhyGlobalLoggingContext rhyGlobalLoggingContext = this.rhyGlobalLoggingContext;
        if (rhyGlobalLoggingContext != null) {
            return rhyGlobalLoggingContext;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rhyGlobalLoggingContext");
        return null;
    }

    public final void setRhyGlobalLoggingContext(RhyGlobalLoggingContext rhyGlobalLoggingContext) {
        Intrinsics.checkNotNullParameter(rhyGlobalLoggingContext, "<set-?>");
        this.rhyGlobalLoggingContext = rhyGlobalLoggingContext;
    }

    public final BooleanPreference getShouldResetCashTabPref() {
        BooleanPreference booleanPreference = this.shouldResetCashTabPref;
        if (booleanPreference != null) {
            return booleanPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("shouldResetCashTabPref");
        return null;
    }

    public final void setShouldResetCashTabPref(BooleanPreference booleanPreference) {
        Intrinsics.checkNotNullParameter(booleanPreference, "<set-?>");
        this.shouldResetCashTabPref = booleanPreference;
    }

    public final BooleanPreference getShowRhyFundingBottomSheetPref() {
        BooleanPreference booleanPreference = this.showRhyFundingBottomSheetPref;
        if (booleanPreference != null) {
            return booleanPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("showRhyFundingBottomSheetPref");
        return null;
    }

    public final void setShowRhyFundingBottomSheetPref(BooleanPreference booleanPreference) {
        Intrinsics.checkNotNullParameter(booleanPreference, "<set-?>");
        this.showRhyFundingBottomSheetPref = booleanPreference;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RhyOpenAccountDuxo getDuxo() {
        return (RhyOpenAccountDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentRhyOpenAccountBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentRhyOpenAccountBinding) value;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        Screen.Name name;
        if (this.hasUserBeenApproved) {
            name = Screen.Name.RHY_MIGRATION_CONFIRMATION;
        } else {
            name = Screen.Name.RHY_MIGRATION_OPEN_SPENDING_ACCOUNT;
        }
        return new Screen(name, null, null, null, 14, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenName() {
        return getEventScreen().getName().name();
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return new UserInteractionEventData(null, getEventScreen(), null, null, RhyOnboardingLoggingUtils.getEventContext$default(this, (AgreementContext) null, (String) null, 3, (Object) null), null, null, 109, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UiRhyMigrationLoadingAnimation getLoadingAnimation() {
        return (UiRhyMigrationLoadingAnimation) this.loadingAnimation.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UiRhyMigrationLoadingAnimation loadingAnimation_delegate$lambda$0(RhyOpenAccountFragment rhyOpenAccountFragment) {
        return rhyOpenAccountFragment.getCallbacks().getAnimation();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getDuxo().setPollingTimeoutSeconds(getLoadingAnimation().getPollingTimeoutSeconds());
        FragmentRhyOpenAccountBinding binding = getBinding();
        binding.rhyOpenAccountStatusText.setText(getLoadingAnimation().getPhraseOneText());
        RdsButton rdsButton = binding.rhyOpenAccountSetupRewardsBtn;
        Intrinsics.checkNotNull(rdsButton);
        ViewsKt.eventData$default(rdsButton, false, new Function0() { // from class: com.robinhood.android.rhymigration.ui.openaccount.RhyOpenAccountFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RhyOpenAccountFragment.onViewCreated$lambda$7$lambda$3$lambda$1(this.f$0);
            }
        }, 1, null);
        OnClickListeners.onClick(rdsButton, new Function0() { // from class: com.robinhood.android.rhymigration.ui.openaccount.RhyOpenAccountFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RhyOpenAccountFragment.onViewCreated$lambda$7$lambda$3$lambda$2(this.f$0);
            }
        });
        RdsButton rdsButton2 = binding.rhyOpenAccountRewardsLaterBtn;
        Intrinsics.checkNotNull(rdsButton2);
        ViewsKt.eventData$default(rdsButton2, false, new Function0() { // from class: com.robinhood.android.rhymigration.ui.openaccount.RhyOpenAccountFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RhyOpenAccountFragment.onViewCreated$lambda$7$lambda$6$lambda$4(this.f$0);
            }
        }, 1, null);
        OnClickListeners.onClick(rdsButton2, new Function0() { // from class: com.robinhood.android.rhymigration.ui.openaccount.RhyOpenAccountFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RhyOpenAccountFragment.onViewCreated$lambda$7$lambda$6$lambda$5(this.f$0);
            }
        });
        getBinding().rhyOpenAccountAnimation.setAnimationFromUrl(getLoadingAnimation().getAnimationAsset());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor onViewCreated$lambda$7$lambda$3$lambda$1(RhyOpenAccountFragment rhyOpenAccountFragment) {
        return new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.RHY_MIGRATION_OPEN_ACCOUNT_CONTINUE, RhyOnboardingLoggingUtils.getEventContext$default(rhyOpenAccountFragment, (AgreementContext) null, (String) null, 3, (Object) null), new Component(null, "roundups", null, 5, null), null, 35, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$7$lambda$3$lambda$2(RhyOpenAccountFragment rhyOpenAccountFragment) {
        rhyOpenAccountFragment.getCallbacks().onOpenAccountSetupRewardsClicked();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor onViewCreated$lambda$7$lambda$6$lambda$4(RhyOpenAccountFragment rhyOpenAccountFragment) {
        return new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.RHY_MIGRATION_OPEN_ACCOUNT_CONTINUE, RhyOnboardingLoggingUtils.getEventContext$default(rhyOpenAccountFragment, (AgreementContext) null, (String) null, 3, (Object) null), new Component(null, "no_roundups", null, 5, null), null, 35, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$7$lambda$6$lambda$5(RhyOpenAccountFragment rhyOpenAccountFragment) {
        rhyOpenAccountFragment.getCallbacks().onOpenAccountSkipRewardsClicked();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        EventLogger.DefaultImpls.logAppear$default(getEventLogger(), null, getEventScreen(), null, null, RhyOnboardingLoggingUtils.getEventContext$default(this, (AgreementContext) null, (String) null, 3, (Object) null), 13, null);
        Observable<RhyOpenAccountViewState> observableDistinctUntilChanged = getDuxo().getStates().distinctUntilChanged((Function<? super RhyOpenAccountViewState, K>) new Function() { // from class: com.robinhood.android.rhymigration.ui.openaccount.RhyOpenAccountFragment.onStart.1
            @Override // io.reactivex.functions.Function
            public final RhyOpenAccountViewState2 apply(RhyOpenAccountViewState state) {
                Intrinsics.checkNotNullParameter(state, "state");
                return state.getCurrentStateAction();
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C276282(this));
        final LottieAnimationView lottieAnimationView = getBinding().rhyOpenAccountAnimation;
        lottieAnimationView.addAnimatorUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.robinhood.android.rhymigration.ui.openaccount.RhyOpenAccountFragment$onStart$3$1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator it) {
                Intrinsics.checkNotNullParameter(it, "it");
                int frame = lottieAnimationView.getFrame() - 1;
                int start = this.getLoadingAnimation().getPhraseOneLoop().getStart();
                if (frame > this.getLoadingAnimation().getPhraseOneLoop().getEnd() || start > frame) {
                    int start2 = this.getLoadingAnimation().getPhraseTwoTransition().getStart();
                    if (frame > this.getLoadingAnimation().getPhraseTwoTransition().getEnd() || start2 > frame) {
                        int start3 = this.getLoadingAnimation().getPhraseThreeLoop().getStart();
                        if (frame > this.getLoadingAnimation().getPhraseThreeLoop().getEnd() || start3 > frame) {
                            return;
                        }
                        RhyOpenAccountFragment rhyOpenAccountFragment = this;
                        rhyOpenAccountFragment.setText(rhyOpenAccountFragment.getLoadingAnimation().getPhraseThreeText(), 3);
                        return;
                    }
                    RhyOpenAccountFragment rhyOpenAccountFragment2 = this;
                    rhyOpenAccountFragment2.setText(rhyOpenAccountFragment2.getLoadingAnimation().getPhraseTwoText(), 2);
                    return;
                }
                RhyOpenAccountFragment rhyOpenAccountFragment3 = this;
                rhyOpenAccountFragment3.setText(rhyOpenAccountFragment3.getLoadingAnimation().getPhraseOneText(), 1);
            }
        });
    }

    /* compiled from: RhyOpenAccountFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.rhymigration.ui.openaccount.RhyOpenAccountFragment$onStart$2 */
    /* synthetic */ class C276282 extends FunctionReferenceImpl implements Function1<RhyOpenAccountViewState, Unit> {
        C276282(Object obj) {
            super(1, obj, RhyOpenAccountFragment.class, "bind", "bind(Lcom/robinhood/android/rhymigration/ui/openaccount/RhyOpenAccountViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RhyOpenAccountViewState rhyOpenAccountViewState) {
            invoke2(rhyOpenAccountViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(RhyOpenAccountViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((RhyOpenAccountFragment) this.receiver).bind(p0);
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        LottieAnimationView lottieAnimationView = getBinding().rhyOpenAccountAnimation;
        lottieAnimationView.removeAllUpdateListeners();
        lottieAnimationView.pauseAnimation();
        EventLogger.DefaultImpls.logDisappear$default(getEventLogger(), null, getEventScreen(), null, null, RhyOnboardingLoggingUtils.getEventContext$default(this, (AgreementContext) null, (String) null, 3, (Object) null), 13, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        getCallbacks().onOpenAccountCanceled();
        return true;
    }

    @Override // com.robinhood.android.common.ui.BaseBottomSheetDialogFragment.OnDismissListener
    public void onBottomSheetDismissed(int id) {
        getCallbacks().onOpenAccountCanceled();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(RhyOpenAccountViewState state) {
        RhyOpenAccountViewState2 currentStateAction = state.getCurrentStateAction();
        if (Intrinsics.areEqual(currentStateAction, RhyOpenAccountViewState2.Waiting.INSTANCE)) {
            setLoopingAnimation(getLoadingAnimation().getPhraseOneLoop());
            return;
        }
        if (Intrinsics.areEqual(currentStateAction, RhyOpenAccountViewState2.TransitToApproved.INSTANCE)) {
            getRhyAccountStore().refresh(true);
            getShouldResetCashTabPref().set(true);
            getShowRhyFundingBottomSheetPref().set(true);
            getRhyGlobalLoggingContext().refresh();
            playSuccessPhraseTransition();
            return;
        }
        if (Intrinsics.areEqual(currentStateAction, RhyOpenAccountViewState2.LoopAtApproved.INSTANCE)) {
            this.hasUserBeenApproved = true;
            EventLogger.DefaultImpls.logAppear$default(getEventLogger(), null, getEventScreen(), null, null, RhyOnboardingLoggingUtils.getEventContext$default(this, (AgreementContext) null, (String) null, 3, (Object) null), 13, null);
            setLoopingAnimation(getLoadingAnimation().getPhraseThreeLoop());
            if (state.isInCmSunset()) {
                showCmSunsetButtons();
                return;
            } else {
                showApprovedButtons();
                return;
            }
        }
        if (currentStateAction instanceof RhyOpenAccountViewState2.ShowIacAlertSheet) {
            showIacAlertSheet((RhyOpenAccountViewState2.ShowIacAlertSheet) currentStateAction);
        } else {
            if (!Intrinsics.areEqual(currentStateAction, RhyOpenAccountViewState2.ShowTimeoutBottomSheet.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            showTimeoutBottomSheet();
        }
    }

    /* compiled from: RhyOpenAccountFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.rhymigration.ui.openaccount.RhyOpenAccountFragment$showApprovedButtons$1", m3645f = "RhyOpenAccountFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.rhymigration.ui.openaccount.RhyOpenAccountFragment$showApprovedButtons$1 */
    static final class C276291 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C276291(Continuation<? super C276291> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RhyOpenAccountFragment.this.new C276291(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C276291) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Duration.Companion companion = Duration.INSTANCE;
                long duration = Duration3.toDuration(1L, DurationUnitJvm.SECONDS);
                this.label = 1;
                if (DelayKt.m28786delayVtjQ1oo(duration, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (RhyOpenAccountFragment.this.getView() != null) {
                RhyOpenAccountFragment.this.getBinding().getRoot().transitionToState(C27577R.id.rhy_show_continue_btn_state);
                RdsButton rhyOpenAccountSetupRewardsBtn = RhyOpenAccountFragment.this.getBinding().rhyOpenAccountSetupRewardsBtn;
                Intrinsics.checkNotNullExpressionValue(rhyOpenAccountSetupRewardsBtn, "rhyOpenAccountSetupRewardsBtn");
                rhyOpenAccountSetupRewardsBtn.setVisibility(0);
                RdsButton rhyOpenAccountRewardsLaterBtn = RhyOpenAccountFragment.this.getBinding().rhyOpenAccountRewardsLaterBtn;
                Intrinsics.checkNotNullExpressionValue(rhyOpenAccountRewardsLaterBtn, "rhyOpenAccountRewardsLaterBtn");
                rhyOpenAccountRewardsLaterBtn.setVisibility(0);
            }
            return Unit.INSTANCE;
        }
    }

    private final void showApprovedButtons() {
        getLifecycleScope().launchWhenStarted(new C276291(null));
    }

    /* compiled from: RhyOpenAccountFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.rhymigration.ui.openaccount.RhyOpenAccountFragment$showCmSunsetButtons$1", m3645f = "RhyOpenAccountFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.rhymigration.ui.openaccount.RhyOpenAccountFragment$showCmSunsetButtons$1 */
    static final class C276301 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C276301(Continuation<? super C276301> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RhyOpenAccountFragment.this.new C276301(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C276301) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Duration.Companion companion = Duration.INSTANCE;
                long duration = Duration3.toDuration(1L, DurationUnitJvm.SECONDS);
                this.label = 1;
                if (DelayKt.m28786delayVtjQ1oo(duration, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (RhyOpenAccountFragment.this.getView() != null) {
                RhyOpenAccountFragment.this.getBinding().getRoot().transitionToState(C27577R.id.rhy_show_continue_btn_sunset_state);
                RdsButton rhyOpenAccountSetupRewardsBtn = RhyOpenAccountFragment.this.getBinding().rhyOpenAccountSetupRewardsBtn;
                Intrinsics.checkNotNullExpressionValue(rhyOpenAccountSetupRewardsBtn, "rhyOpenAccountSetupRewardsBtn");
                rhyOpenAccountSetupRewardsBtn.setVisibility(0);
                RhyOpenAccountFragment.this.getBinding().rhyOpenAccountSetupRewardsBtn.setText(RhyOpenAccountFragment.this.getString(C27577R.string.rhy_account_opened_cm_sunset));
                RdsButton rhyOpenAccountRewardsLaterBtn = RhyOpenAccountFragment.this.getBinding().rhyOpenAccountRewardsLaterBtn;
                Intrinsics.checkNotNullExpressionValue(rhyOpenAccountRewardsLaterBtn, "rhyOpenAccountRewardsLaterBtn");
                rhyOpenAccountRewardsLaterBtn.setVisibility(8);
            }
            return Unit.INSTANCE;
        }
    }

    private final void showCmSunsetButtons() {
        getLifecycleScope().launchWhenStarted(new C276301(null));
    }

    private final void showTimeoutBottomSheet() {
        RhyOpenAccountTimeoutBottomSheet rhyOpenAccountTimeoutBottomSheet = new RhyOpenAccountTimeoutBottomSheet();
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        rhyOpenAccountTimeoutBottomSheet.show(childFragmentManager, TIMEOUT_BOTTOM_SHEET_TAG);
    }

    private final void showIacAlertSheet(RhyOpenAccountViewState2.ShowIacAlertSheet action) {
        if (getChildFragmentManager().findFragmentByTag(iacBottomSheetTag) != null) {
            return;
        }
        IacAlertSheetFragment.INSTANCE.createDialogFragment(new LegacyDialogFragmentKey.IacAlertSheet(action.getSheet(), Screen.Name.RHY_MIGRATION_OPEN_SPENDING_ACCOUNT.getValue(), null, action.getSheet().getLoggingIdentifier(), Context.ProductTag.RHY_MIGRATION, 4, null)).show(getChildFragmentManager(), iacBottomSheetTag);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setText(String text, int transitionState) {
        if (this.textState < transitionState) {
            getBinding().rhyOpenAccountStatusText.setText(text);
            this.textState = transitionState;
            getBinding().getRoot().setTransition(C27577R.id.rhy_hide_text_state, C27577R.id.rhy_show_text_state);
            getBinding().getRoot().transitionToEnd();
        }
    }

    private final void setLoopingAnimation(Bound bound) {
        LottieAnimationView lottieAnimationView = getBinding().rhyOpenAccountAnimation;
        lottieAnimationView.setMinAndMaxFrame(bound.getStart(), bound.getEnd());
        lottieAnimationView.setRepeatMode(1);
        lottieAnimationView.setRepeatCount(-1);
        lottieAnimationView.resumeAnimation();
    }

    private final void playSuccessPhraseTransition() {
        final LottieAnimationView lottieAnimationView = getBinding().rhyOpenAccountAnimation;
        lottieAnimationView.setMinAndMaxFrame(getLoadingAnimation().getPhraseOneLoop().getStart(), getLoadingAnimation().getPhraseTwoTransition().getEnd());
        lottieAnimationView.setRepeatCount(0);
        lottieAnimationView.resumeAnimation();
        lottieAnimationView.addAnimatorListener(new AnimatorListenerAdapter() { // from class: com.robinhood.android.rhymigration.ui.openaccount.RhyOpenAccountFragment$playSuccessPhraseTransition$1$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                this.this$0.getDuxo().setSuccessTransitionAnimationCompleted();
                lottieAnimationView.removeAnimatorListener(this);
            }
        });
    }

    /* compiled from: RhyOpenAccountFragment.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/openaccount/RhyOpenAccountFragment$Companion;", "", "<init>", "()V", "iacBottomSheetTag", "", "TIMEOUT_BOTTOM_SHEET_TAG", "BUTTON_DELAY_SECONDS", "", "newInstance", "Lcom/robinhood/android/rhymigration/ui/openaccount/RhyOpenAccountFragment;", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final RhyOpenAccountFragment newInstance() {
            return new RhyOpenAccountFragment();
        }
    }
}
