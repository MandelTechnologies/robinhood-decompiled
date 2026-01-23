package com.robinhood.android.acatsin.availabledestinations;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.acatsin.availabledestinations.AcatsDestination;
import com.robinhood.android.acatsin.availabledestinations.AcatsInAvailableDestinationsContract;
import com.robinhood.android.acatsin.availabledestinations.AcatsInAvailableDestinationsFragment;
import com.robinhood.android.acatsin.availabledestinations.AcatsInAvailableDestinationsViewState;
import com.robinhood.android.acatsin.p058ui.AcatsFlowStepFragment2;
import com.robinhood.android.acatsin.util.AcatsFlowStep;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.ActionHandlingFragment2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlertKt;
import com.robinhood.android.models.retirement.api.onboarding.RetirementOnboardingIntro;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract3;
import com.robinhood.android.retirement.contracts.RetirementIntentKeys7;
import com.robinhood.android.retirement.contracts.RetirementSignUp;
import com.robinhood.compose.app.ErrorScreenComposable;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.models.acats.p299db.bonfire.AvailableAccount;
import com.robinhood.models.serverdriven.experimental.api.AlertAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertMobilePresentationStyle;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import io.noties.markwon.Markwon;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;

/* compiled from: AcatsInAvailableDestinationsFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\b\u0007\u0018\u0000 D2\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001DB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:H\u0016J\r\u0010;\u001a\u000208H\u0017¢\u0006\u0002\u0010<J\b\u0010=\u001a\u00020>H\u0016J\u0010\u0010?\u001a\u00020>2\u0006\u0010@\u001a\u00020\u0004H\u0016J\b\u0010A\u001a\u00020>H\u0002J\u0016\u0010B\u001a\u00020>2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00040CH\u0002R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR;\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR/\u0010#\u001a\u0004\u0018\u00010\"2\b\u0010\r\u001a\u0004\u0018\u00010\"8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R(\u0010*\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020- .*\n\u0012\u0004\u0012\u00020-\u0018\u00010,0,0+X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010/\u001a\u0002008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0014\u00103\u001a\u0002048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00106¨\u0006E²\u0006\n\u0010F\u001a\u00020GX\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/acatsin/availabledestinations/AcatsInAvailableDestinationsFragment;", "Lcom/robinhood/android/acatsin/ui/BaseAcatsFlowStepComposeFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "<init>", "()V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "<set-?>", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "genericAlertContent", "getGenericAlertContent", "()Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "setGenericAlertContent", "(Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;)V", "genericAlertContent$delegate", "Landroidx/compose/runtime/MutableState;", "duxo", "Lcom/robinhood/android/acatsin/availabledestinations/AcatsInAvailableDestinationsDuxo;", "getDuxo", "()Lcom/robinhood/android/acatsin/availabledestinations/AcatsInAvailableDestinationsDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/android/acatsin/availabledestinations/AcatsInAvailableDestinationsContract$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/acatsin/availabledestinations/AcatsInAvailableDestinationsContract$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "", "pendingQueryValue", "getPendingQueryValue", "()Ljava/lang/String;", "setPendingQueryValue", "(Ljava/lang/String;)V", "pendingQueryValue$delegate", "Lkotlin/properties/ReadWriteProperty;", "retirementSignUpLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/robinhood/android/navigation/contracts/NavigationActivityResultContract$NavigationParams;", "Lcom/robinhood/android/retirement/contracts/RetirementSignUp;", "kotlin.jvm.PlatformType", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "screenEventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "getScreenEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onBackPressed", "", "handle", "action", "dismissAlert", "handleAlert", "Lcom/robinhood/models/serverdriven/experimental/api/AlertAction;", "Companion", "lib-acats-ui_externalDebug", "viewState", "Lcom/robinhood/android/acatsin/availabledestinations/AcatsInAvailableDestinationsViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AcatsInAvailableDestinationsFragment extends AcatsFlowStepFragment2 implements AutoLoggableFragment, SduiActionHandler<GenericAction> {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;

    /* renamed from: genericAlertContent$delegate, reason: from kotlin metadata */
    private final SnapshotState genericAlertContent;
    public Markwon markwon;

    /* renamed from: pendingQueryValue$delegate, reason: from kotlin metadata */
    private final Interfaces3 pendingQueryValue;
    private final ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<RetirementSignUp>> retirementSignUpLauncher;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AcatsInAvailableDestinationsFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/acatsin/availabledestinations/AcatsInAvailableDestinationsContract$Callbacks;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(AcatsInAvailableDestinationsFragment.class, "pendingQueryValue", "getPendingQueryValue()Ljava/lang/String;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: AcatsInAvailableDestinationsFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GenericAlertMobilePresentationStyle.values().length];
            try {
                iArr[GenericAlertMobilePresentationStyle.MODAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GenericAlertMobilePresentationStyle.BOTTOM_SHEET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$6(AcatsInAvailableDestinationsFragment acatsInAvailableDestinationsFragment, int i, Composer composer, int i2) {
        acatsInAvailableDestinationsFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    public AcatsInAvailableDestinationsFragment() {
        super(null, AcatsFlowStep.AVAILABLE_DESTINATIONS, 1, null);
        this.genericAlertContent = SnapshotState3.mutableStateOf$default(null, null, 2, null);
        this.duxo = DuxosKt.duxo(this, AcatsInAvailableDestinationsDuxo.class);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(AcatsInAvailableDestinationsContract.Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.acatsin.availabledestinations.AcatsInAvailableDestinationsFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof AcatsInAvailableDestinationsContract.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        this.pendingQueryValue = BindSavedState2.savedString(this).provideDelegate(this, $$delegatedProperties[1]);
        ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<RetirementSignUp>> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new RetirementIntentKeys7(new Function0() { // from class: com.robinhood.android.acatsin.availabledestinations.AcatsInAvailableDestinationsFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.getNavigator();
            }
        }), new ActivityResultCallback() { // from class: com.robinhood.android.acatsin.availabledestinations.AcatsInAvailableDestinationsFragment$retirementSignUpLauncher$2
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(RetirementIntentKeys7.Result result) {
                if (result instanceof RetirementIntentKeys7.Result.Success) {
                    AcatsInAvailableDestinationsContract.Callbacks callbacks = this.this$0.getCallbacks();
                    RetirementIntentKeys7.Result.Success success = (RetirementIntentKeys7.Result.Success) result;
                    String accountNumber = success.getAccountNumber();
                    String accountNumber2 = success.getAccountNumber();
                    String pendingQueryValue = this.this$0.getPendingQueryValue();
                    if (pendingQueryValue == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    callbacks.onRhsAccountSelected(new AvailableAccount(accountNumber, accountNumber2, "", "", pendingQueryValue, success.getBrokerageAccountType(), CollectionsKt.emptyList()));
                    return;
                }
                if (!(result instanceof RetirementIntentKeys7.Result.Canceled) && result != null) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.retirementSignUpLauncher = activityResultLauncherRegisterForActivityResult;
    }

    /* compiled from: AcatsInAvailableDestinationsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/acatsin/availabledestinations/AcatsInAvailableDestinationsFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/acatsin/availabledestinations/AcatsInAvailableDestinationsFragment;", "Lcom/robinhood/android/acatsin/availabledestinations/AcatsInAvailableDestinationsContract$Key;", "<init>", "()V", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<AcatsInAvailableDestinationsFragment, AcatsInAvailableDestinationsContract.Key> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(AcatsInAvailableDestinationsContract.Key key) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, key);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public AcatsInAvailableDestinationsContract.Key getArgs(AcatsInAvailableDestinationsFragment acatsInAvailableDestinationsFragment) {
            return (AcatsInAvailableDestinationsContract.Key) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, acatsInAvailableDestinationsFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public AcatsInAvailableDestinationsFragment newInstance(AcatsInAvailableDestinationsContract.Key key) {
            return (AcatsInAvailableDestinationsFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, key);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(AcatsInAvailableDestinationsFragment acatsInAvailableDestinationsFragment, AcatsInAvailableDestinationsContract.Key key) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, acatsInAvailableDestinationsFragment, key);
        }
    }

    public final Markwon getMarkwon() {
        Markwon markwon = this.markwon;
        if (markwon != null) {
            return markwon;
        }
        Intrinsics.throwUninitializedPropertyAccessException("markwon");
        return null;
    }

    public final void setMarkwon(Markwon markwon) {
        Intrinsics.checkNotNullParameter(markwon, "<set-?>");
        this.markwon = markwon;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final GenericAlertContent<GenericAction> getGenericAlertContent() {
        return (GenericAlertContent) this.genericAlertContent.getValue();
    }

    public final void setGenericAlertContent(GenericAlertContent<? extends GenericAction> genericAlertContent) {
        this.genericAlertContent.setValue(genericAlertContent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AcatsInAvailableDestinationsDuxo getDuxo() {
        return (AcatsInAvailableDestinationsDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AcatsInAvailableDestinationsContract.Callbacks getCallbacks() {
        return (AcatsInAvailableDestinationsContract.Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getPendingQueryValue() {
        return (String) this.pendingQueryValue.getValue(this, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setPendingQueryValue(String str) {
        this.pendingQueryValue.setValue(this, $$delegatedProperties[1], str);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return new Screen(Screen.Name.ACATS_IN_ACCOUNT_SELECTION, ((AcatsInAvailableDestinationsContract.Key) INSTANCE.getArgs((Fragment) this)).getScreenContext().getSource(), null, null, 12, null);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public com.robinhood.rosetta.eventlogging.Context getScreenEventContext() {
        return ((AcatsInAvailableDestinationsContract.Key) INSTANCE.getArgs((Fragment) this)).getScreenContext().toEventContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AcatsInAvailableDestinationsViewState ComposeContent$lambda$1(SnapshotState4<? extends AcatsInAvailableDestinationsViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    @Override // com.robinhood.android.acatsin.p058ui.AcatsFlowStepFragment2, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        if (((AcatsInAvailableDestinationsContract.Key) INSTANCE.getArgs((Fragment) this)).isAcatsRetry()) {
            return;
        }
        super.configureToolbar(toolbar);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1784280278);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1784280278, i2, -1, "com.robinhood.android.acatsin.availabledestinations.AcatsInAvailableDestinationsFragment.ComposeContent (AcatsInAvailableDestinationsFragment.kt:91)");
            }
            SduiActionHandler3.ProvideActionHandler(this, ComposableLambda3.rememberComposableLambda(1580379285, true, new C78081(FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7)), composerStartRestartGroup, 54), composerStartRestartGroup, (i2 & 14) | 48);
            GenericAlertContent<GenericAction> genericAlertContent = getGenericAlertContent();
            if (genericAlertContent != null) {
                SduiAlert sduiAlert = SduiAlert.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new AcatsInAvailableDestinationsFragment4(this);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                AcatsInAvailableDestinationsFragment6 acatsInAvailableDestinationsFragment6 = new AcatsInAvailableDestinationsFragment6((Function1) ((KFunction) objRememberedValue));
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(this);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.acatsin.availabledestinations.AcatsInAvailableDestinationsFragment$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AcatsInAvailableDestinationsFragment.ComposeContent$lambda$5$lambda$4$lambda$3(this.f$0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                sduiAlert.Dialog(genericAlertContent, acatsInAvailableDestinationsFragment6, null, (Function0) objRememberedValue2, composerStartRestartGroup, SduiAlert.$stable << 12, 4);
                composerStartRestartGroup = composerStartRestartGroup;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.acatsin.availabledestinations.AcatsInAvailableDestinationsFragment$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AcatsInAvailableDestinationsFragment.ComposeContent$lambda$6(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: AcatsInAvailableDestinationsFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.acatsin.availabledestinations.AcatsInAvailableDestinationsFragment$ComposeContent$1 */
    static final class C78081 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState4<AcatsInAvailableDestinationsViewState> $viewState$delegate;

        /* JADX WARN: Multi-variable type inference failed */
        C78081(SnapshotState4<? extends AcatsInAvailableDestinationsViewState> snapshotState4) {
            this.$viewState$delegate = snapshotState4;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1580379285, i, -1, "com.robinhood.android.acatsin.availabledestinations.AcatsInAvailableDestinationsFragment.ComposeContent.<anonymous> (AcatsInAvailableDestinationsFragment.kt:95)");
            }
            AcatsInAvailableDestinationsViewState acatsInAvailableDestinationsViewStateComposeContent$lambda$1 = AcatsInAvailableDestinationsFragment.ComposeContent$lambda$1(this.$viewState$delegate);
            if (acatsInAvailableDestinationsViewStateComposeContent$lambda$1 instanceof AcatsInAvailableDestinationsViewState.Loading) {
                composer.startReplaceGroup(-352116891);
                LoadingScreenComposablesKt.GenericLoadingScreenComposable(null, false, composer, 0, 3);
                composer.endReplaceGroup();
            } else if (acatsInAvailableDestinationsViewStateComposeContent$lambda$1 instanceof AcatsInAvailableDestinationsViewState.Error) {
                composer.startReplaceGroup(-351977298);
                Object duxo = AcatsInAvailableDestinationsFragment.this.getDuxo();
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance = composer.changedInstance(duxo);
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new AcatsInAvailableDestinationsFragment2(duxo);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                ErrorScreenComposable.ErrorScreenComposable(null, (Function0) ((KFunction) objRememberedValue), 0, null, null, null, null, false, composer, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE);
                composer.endReplaceGroup();
            } else {
                if (!(acatsInAvailableDestinationsViewStateComposeContent$lambda$1 instanceof AcatsInAvailableDestinationsViewState.Ready)) {
                    composer.startReplaceGroup(-1673927258);
                    composer.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composer.startReplaceGroup(-351763088);
                AcatsInAvailableDestinationsViewState acatsInAvailableDestinationsViewStateComposeContent$lambda$12 = AcatsInAvailableDestinationsFragment.ComposeContent$lambda$1(this.$viewState$delegate);
                Intrinsics.checkNotNull(acatsInAvailableDestinationsViewStateComposeContent$lambda$12, "null cannot be cast to non-null type com.robinhood.android.acatsin.availabledestinations.AcatsInAvailableDestinationsViewState.Ready");
                final AcatsInAvailableDestinationsViewState.Ready ready = (AcatsInAvailableDestinationsViewState.Ready) acatsInAvailableDestinationsViewStateComposeContent$lambda$12;
                Object duxo2 = AcatsInAvailableDestinationsFragment.this.getDuxo();
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance2 = composer.changedInstance(duxo2);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new AcatsInAvailableDestinationsFragment3(duxo2);
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                Function1 function1 = (Function1) ((KFunction) objRememberedValue2);
                composer.startReplaceGroup(-1633490746);
                boolean zChangedInstance3 = composer.changedInstance(ready) | composer.changedInstance(AcatsInAvailableDestinationsFragment.this);
                final AcatsInAvailableDestinationsFragment acatsInAvailableDestinationsFragment = AcatsInAvailableDestinationsFragment.this;
                Object objRememberedValue3 = composer.rememberedValue();
                if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.acatsin.availabledestinations.AcatsInAvailableDestinationsFragment$ComposeContent$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AcatsInAvailableDestinationsFragment.C78081.invoke$lambda$3$lambda$2(ready, acatsInAvailableDestinationsFragment);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue3);
                }
                composer.endReplaceGroup();
                AcatsInAvailableDestinationsComposable.AvailableDestinationsReadyScreen(ready, function1, (Function0) objRememberedValue3, composer, 0);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(AcatsInAvailableDestinationsViewState.Ready ready, AcatsInAvailableDestinationsFragment acatsInAvailableDestinationsFragment) {
            AcatsDestination selectedDestination = ready.getSelectedDestination();
            if (selectedDestination instanceof AcatsDestination.ExistingAccount) {
                acatsInAvailableDestinationsFragment.getCallbacks().onRhsAccountSelected(((AcatsDestination.ExistingAccount) ready.getSelectedDestination()).getAvailableAccount());
            } else if (selectedDestination instanceof AcatsDestination.SignUpAccount) {
                acatsInAvailableDestinationsFragment.setPendingQueryValue(((AcatsDestination.SignUpAccount) ready.getSelectedDestination()).getQueryValue());
                NavigationActivityResultContract3.launch$default(acatsInAvailableDestinationsFragment.retirementSignUpLauncher, new RetirementSignUp(new RetirementOnboardingIntro.AccountDescription(((AcatsDestination.SignUpAccount) ready.getSelectedDestination()).getAccountType()), "acats-account-selection", true, "acats_account_selection", false, null, null, 112, null), null, false, 6, null);
            } else if (selectedDestination instanceof AcatsDestination.Deeplink) {
                acatsInAvailableDestinationsFragment.getCallbacks().onDeeplinkSelected(((AcatsDestination.Deeplink) ready.getSelectedDestination()).getDeeplink());
            } else if (selectedDestination != null) {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$5$lambda$4$lambda$3(AcatsInAvailableDestinationsFragment acatsInAvailableDestinationsFragment) {
        acatsInAvailableDestinationsFragment.setGenericAlertContent(null);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        Companion companion = INSTANCE;
        if (!((AcatsInAvailableDestinationsContract.Key) companion.getArgs((Fragment) this)).getScreenContext().getIntroShown() && !((AcatsInAvailableDestinationsContract.Key) companion.getArgs((Fragment) this)).isAcatsRetry()) {
            requireBaseActivity().finish();
            return true;
        }
        return super.onBackPressed();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
    /* renamed from: handle, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean mo15941handle(GenericAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof GenericAction.Deeplink) {
            return ActionHandlingFragment2.handleDeeplink$default(this, ((GenericAction.Deeplink) action).getValue2(), null, 2, null);
        }
        if (action instanceof GenericAction.Dismiss) {
            return dismissAlert();
        }
        if (action instanceof GenericAction.InfoAlert) {
            return handleAlert(((GenericAction.InfoAlert) action).getValue2());
        }
        throw new NoWhenBranchMatchedException();
    }

    private final boolean dismissAlert() {
        setGenericAlertContent(null);
        return true;
    }

    private final boolean handleAlert(AlertAction<? extends GenericAction> action) {
        int i = WhenMappings.$EnumSwitchMapping$0[action.getMobile_presentation_style().ordinal()];
        if (i == 1) {
            setGenericAlertContent(action.getAlert());
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            SduiAlertKt.presentSduiAlertSheet(this, getMarkwon(), action.getAlert(), this, (1016 & 8) != 0 ? 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x002c: INVOKE 
                  (r16v0 'this' com.robinhood.android.acatsin.availabledestinations.AcatsInAvailableDestinationsFragment A[IMMUTABLE_TYPE, THIS])
                  (wrap:io.noties.markwon.Markwon:0x0012: INVOKE 
                  (r16v0 'this' com.robinhood.android.acatsin.availabledestinations.AcatsInAvailableDestinationsFragment A[IMMUTABLE_TYPE, THIS])
                 VIRTUAL call: com.robinhood.android.acatsin.availabledestinations.AcatsInAvailableDestinationsFragment.getMarkwon():io.noties.markwon.Markwon A[MD:():io.noties.markwon.Markwon (m), WRAPPED] (LINE:176))
                  (wrap:com.robinhood.models.serverdriven.experimental.api.GenericAlertContent<ActionT extends android.os.Parcelable>:0x0016: INVOKE 
                  (r17v0 'action' com.robinhood.models.serverdriven.experimental.api.AlertAction<? extends com.robinhood.models.serverdriven.experimental.api.GenericAction>)
                 VIRTUAL call: com.robinhood.models.serverdriven.experimental.api.AlertAction.getAlert():com.robinhood.models.serverdriven.experimental.api.GenericAlertContent A[MD:():com.robinhood.models.serverdriven.experimental.api.GenericAlertContent<ActionT extends android.os.Parcelable> (m), WRAPPED] (LINE:177))
                  (r16v0 'this' com.robinhood.android.acatsin.availabledestinations.AcatsInAvailableDestinationsFragment A[IMMUTABLE_TYPE, THIS])
                  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0002: ARITH (1016 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x000b: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:520) call: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlertKt$$ExternalSyntheticLambda0.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function1))
                  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x000f: ARITH (1016 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0018: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:521) call: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlertKt$$ExternalSyntheticLambda1.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function1))
                  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x001c: ARITH (1016 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0025: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:522) call: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlertKt$$ExternalSyntheticLambda2.<init>():void type: CONSTRUCTOR) : (wrap:kotlin.jvm.functions.Function0:0x001c: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:175) call: com.robinhood.android.acatsin.availabledestinations.AcatsInAvailableDestinationsFragment$$ExternalSyntheticLambda1.<init>():void type: CONSTRUCTOR))
                  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0029: ARITH (1016 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : false)
                  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0032: ARITH (1016 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : true)
                  (wrap:boolean:?: TERNARY null = ((wrap:int:0x003a: ARITH (1016 int) & (256 int) A[WRAPPED]) != (0 int)) ? true : true)
                  (wrap:com.robinhood.android.common.ui.RhButtonType:?: TERNARY null = ((wrap:int:0x0043: ARITH (1016 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null com.robinhood.android.common.ui.RhButtonType) : (null com.robinhood.android.common.ui.RhButtonType))
                 STATIC call: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlertKt.presentSduiAlertSheet(com.robinhood.android.common.ui.RhBottomSheetDialogFragmentHost, io.noties.markwon.Markwon, com.robinhood.models.serverdriven.experimental.api.GenericAlertContent, com.robinhood.android.libdesignsystem.serverui.experimental.compose.ActionHandler, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, boolean, boolean, boolean, com.robinhood.android.common.ui.RhButtonType):void A[MD:<ActionT extends android.os.Parcelable>:(com.robinhood.android.common.ui.RhBottomSheetDialogFragmentHost, io.noties.markwon.Markwon, com.robinhood.models.serverdriven.experimental.api.GenericAlertContent<? extends ActionT extends android.os.Parcelable>, com.robinhood.android.libdesignsystem.serverui.experimental.compose.ActionHandler<? super ActionT extends android.os.Parcelable>, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, boolean, boolean, boolean, com.robinhood.android.common.ui.RhButtonType):void (m)] (LINE:516) in method: com.robinhood.android.acatsin.availabledestinations.AcatsInAvailableDestinationsFragment.handleAlert(com.robinhood.models.serverdriven.experimental.api.AlertAction<? extends com.robinhood.models.serverdriven.experimental.api.GenericAction>):boolean, file: classes24.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlertKt$$ExternalSyntheticLambda0, state: NOT_LOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                	at jadx.core.codegen.InsnGen.makeTernary(InsnGen.java:1187)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:536)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                	... 25 more
                */
            /*
                this = this;
                com.robinhood.models.serverdriven.experimental.api.GenericAlertMobilePresentationStyle r0 = r17.getMobile_presentation_style()
                int[] r1 = com.robinhood.android.acatsin.availabledestinations.AcatsInAvailableDestinationsFragment.WhenMappings.$EnumSwitchMapping$0
                int r0 = r0.ordinal()
                r0 = r1[r0]
                r1 = 1
                if (r0 == r1) goto L36
                r2 = 2
                if (r0 != r2) goto L30
                io.noties.markwon.Markwon r4 = r16.getMarkwon()
                com.robinhood.models.serverdriven.experimental.api.GenericAlertContent r5 = r17.getAlert()
                com.robinhood.android.acatsin.availabledestinations.AcatsInAvailableDestinationsFragment$$ExternalSyntheticLambda1 r9 = new com.robinhood.android.acatsin.availabledestinations.AcatsInAvailableDestinationsFragment$$ExternalSyntheticLambda1
                r9.<init>()
                r14 = 536(0x218, float:7.51E-43)
                r15 = 0
                r7 = 0
                r8 = 0
                r10 = 0
                r11 = 1
                r12 = 1
                r13 = 0
                r6 = r16
                r3 = r16
                com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlertKt.presentSduiAlertSheet$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
                goto L3f
            L30:
                kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
                r0.<init>()
                throw r0
            L36:
                com.robinhood.models.serverdriven.experimental.api.GenericAlertContent r0 = r17.getAlert()
                r3 = r16
                r3.setGenericAlertContent(r0)
            L3f:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.acatsin.availabledestinations.AcatsInAvailableDestinationsFragment.handleAlert(com.robinhood.models.serverdriven.experimental.api.AlertAction):boolean");
        }
    }
