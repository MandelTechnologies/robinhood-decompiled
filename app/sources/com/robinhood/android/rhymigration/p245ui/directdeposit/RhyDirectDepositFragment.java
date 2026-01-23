package com.robinhood.android.rhymigration.p245ui.directdeposit;

import android.content.ClipData;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.p011ui.hapticfeedback.HapticFeedback;
import androidx.compose.p011ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.rxjava2.RxJava2Adapter;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.extensions.BaseFragments2;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.rhymigration.C27577R;
import com.robinhood.android.rhymigration.p245ui.PageDataCallbacks;
import com.robinhood.android.rhymigration.p245ui.RhyOnboardingLoggingUtils;
import com.robinhood.android.rhymigration.p245ui.directdeposit.RhyDirectDepositFragment;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.librobinhood.data.prefs.HasClickedDirectDepositNuxPref;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.rosetta.eventlogging.AgreementContext;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.android.C41827R;
import com.robinhood.utils.extensions.ContextSystemServices;
import com.robinhood.utils.extensions.ContextsUiExtensions;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
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
import kotlin.text.StringsKt;

/* compiled from: RhyDirectDepositFragment.kt */
@Metadata(m3635d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\b\u0007\u0018\u0000 ;2\u00020\u00012\u00020\u00022\u00020\u0003:\u00039:;B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u0010\u0010&\u001a\u00020!2\u0006\u0010'\u001a\u00020(H\u0016J\b\u0010)\u001a\u00020!H\u0016J\b\u0010*\u001a\u00020\u001dH\u0016J\r\u0010+\u001a\u00020!H\u0017¢\u0006\u0002\u0010,J \u0010-\u001a\u00020!2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u000202H\u0002J\t\u00103\u001a\u00020\u001dH\u0096\u0001R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u0019X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0018\u00104\u001a\b\u0012\u0004\u0012\u00020605X\u0096\u0005¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006<²\u0006\n\u0010=\u001a\u00020>X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/directdeposit/RhyDirectDepositFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/rhymigration/ui/directdeposit/RhyDirectDepositFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/rhymigration/ui/directdeposit/RhyDirectDepositFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/rhymigration/ui/directdeposit/RhyDirectDepositDuxo;", "getDuxo", "()Lcom/robinhood/android/rhymigration/ui/directdeposit/RhyDirectDepositDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "clickedDirectDepositNuxPref", "Lcom/robinhood/prefs/BooleanPreference;", "getClickedDirectDepositNuxPref", "()Lcom/robinhood/prefs/BooleanPreference;", "setClickedDirectDepositNuxPref", "(Lcom/robinhood/prefs/BooleanPreference;)V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onAttach", "context", "Landroid/content/Context;", "onStart", "onBackPressed", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "copyAcctDataToClipboard", "text", "", "clipboardLabel", "haptic", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Args", "Companion", "feature-rhy-migration_externalDebug", "state", "Lcom/robinhood/android/rhymigration/ui/directdeposit/RhyDirectDepositViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class RhyDirectDepositFragment extends GenericComposeFragment implements RegionGated, AutoLoggableFragment {

    @HasClickedDirectDepositNuxPref
    public BooleanPreference clickedDirectDepositNuxPref;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RhyDirectDepositFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/rhymigration/ui/directdeposit/RhyDirectDepositFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.rhymigration.ui.directdeposit.RhyDirectDepositFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof RhyDirectDepositFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = OldDuxos.oldDuxo(this, RhyDirectDepositDuxo.class);
    private final Screen eventScreen = new Screen(Screen.Name.RHY_MIGRATION_DD_SETUP, null, null, null, 14, null);

    /* compiled from: RhyDirectDepositFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/directdeposit/RhyDirectDepositFragment$Callbacks;", "Lcom/robinhood/android/rhymigration/ui/PageDataCallbacks;", "onDirectDepositContinueClicked", "", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks extends PageDataCallbacks {
        void onDirectDepositContinueClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$5(RhyDirectDepositFragment rhyDirectDepositFragment, int i, Composer composer, int i2) {
        rhyDirectDepositFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return true;
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

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RhyDirectDepositDuxo getDuxo() {
        return (RhyDirectDepositDuxo) this.duxo.getValue();
    }

    public final BooleanPreference getClickedDirectDepositNuxPref() {
        BooleanPreference booleanPreference = this.clickedDirectDepositNuxPref;
        if (booleanPreference != null) {
            return booleanPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("clickedDirectDepositNuxPref");
        return null;
    }

    public final void setClickedDirectDepositNuxPref(BooleanPreference booleanPreference) {
        Intrinsics.checkNotNullParameter(booleanPreference, "<set-?>");
        this.clickedDirectDepositNuxPref = booleanPreference;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return this.eventScreen;
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragments2.setContentBelowToolbar(this, view);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.rhymigration.ui.directdeposit.RhyDirectDepositFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyDirectDepositFragment.onStart$lambda$2(this.f$0, (RhyDirectDepositViewState) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.rhymigration.ui.directdeposit.RhyDirectDepositFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyDirectDepositFragment.onStart$lambda$3(this.f$0, (Throwable) obj);
            }
        }, null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$2(final RhyDirectDepositFragment rhyDirectDepositFragment, final RhyDirectDepositViewState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        UiEvent<Boolean> emailDetailsClicked = state.getEmailDetailsClicked();
        if (emailDetailsClicked != null) {
            emailDetailsClicked.consumeWith(new Function1() { // from class: com.robinhood.android.rhymigration.ui.directdeposit.RhyDirectDepositFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RhyDirectDepositFragment.onStart$lambda$2$lambda$1(this.f$0, state, ((Boolean) obj).booleanValue());
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyDirectDepositViewState ComposeContent$lambda$4(SnapshotState4<RhyDirectDepositViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$2$lambda$1(RhyDirectDepositFragment rhyDirectDepositFragment, RhyDirectDepositViewState rhyDirectDepositViewState, boolean z) {
        if (z) {
            FragmentActivity fragmentActivityRequireActivity = rhyDirectDepositFragment.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            String string2 = rhyDirectDepositFragment.getString(C27577R.string.rhy_dd_email_sent, rhyDirectDepositViewState.getEmail());
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            ContextsUiExtensions.showShortToast(fragmentActivityRequireActivity, string2);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$3(RhyDirectDepositFragment rhyDirectDepositFragment, Throwable error) throws Throwable {
        Intrinsics.checkNotNullParameter(error, "error");
        rhyDirectDepositFragment.getActivityErrorHandler().accept(error);
        CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, error, false, null, 6, null);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        if (Intrinsics.areEqual(((Args) INSTANCE.getArgs((Fragment) this)).getFromMigrationFlow(), Boolean.TRUE)) {
            requireActivity().finish();
        }
        return super.onBackPressed();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(763763053);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(763763053, i2, -1, "com.robinhood.android.rhymigration.ui.directdeposit.RhyDirectDepositFragment.ComposeContent (RhyDirectDepositFragment.kt:103)");
            }
            final SnapshotState4 snapshotState4SubscribeAsState = RxJava2Adapter.subscribeAsState(getDuxo().getStates(), new RhyDirectDepositViewState(null, null, null, null, 15, null), composerStartRestartGroup, 0);
            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, getEventScreen(), null, RhyOnboardingLoggingUtils.getEventContext$default(this, (AgreementContext) null, (String) null, 3, (Object) null), null, null, 53, null), ComposableLambda3.rememberComposableLambda(1085941346, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.rhymigration.ui.directdeposit.RhyDirectDepositFragment.ComposeContent.1

                /* compiled from: RhyDirectDepositFragment.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.rhymigration.ui.directdeposit.RhyDirectDepositFragment$ComposeContent$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ SnapshotState4<RhyDirectDepositViewState> $state$delegate;
                    final /* synthetic */ RhyDirectDepositFragment this$0;

                    AnonymousClass1(RhyDirectDepositFragment rhyDirectDepositFragment, SnapshotState4<RhyDirectDepositViewState> snapshotState4) {
                        this.this$0 = rhyDirectDepositFragment;
                        this.$state$delegate = snapshotState4;
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
                            ComposerKt.traceEventStart(1574581229, i, -1, "com.robinhood.android.rhymigration.ui.directdeposit.RhyDirectDepositFragment.ComposeContent.<anonymous>.<anonymous> (RhyDirectDepositFragment.kt:112)");
                        }
                        String routingNumber = RhyDirectDepositFragment.ComposeContent$lambda$4(this.$state$delegate).getRoutingNumber();
                        String accountNumber = RhyDirectDepositFragment.ComposeContent$lambda$4(this.$state$delegate).getAccountNumber();
                        Companion companion = RhyDirectDepositFragment.INSTANCE;
                        Boolean hasExistingDd = ((Args) companion.getArgs((Fragment) this.this$0)).getHasExistingDd();
                        Boolean fromMigrationFlow = ((Args) companion.getArgs((Fragment) this.this$0)).getFromMigrationFlow();
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance = composer.changedInstance(this.this$0);
                        final RhyDirectDepositFragment rhyDirectDepositFragment = this.this$0;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function3() { // from class: com.robinhood.android.rhymigration.ui.directdeposit.RhyDirectDepositFragment$ComposeContent$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    return RhyDirectDepositFragment.C276141.AnonymousClass1.invoke$lambda$1$lambda$0(rhyDirectDepositFragment, (String) obj, (String) obj2, (HapticFeedback) obj3);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        Function3 function3 = (Function3) objRememberedValue;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance2 = composer.changedInstance(this.this$0);
                        final RhyDirectDepositFragment rhyDirectDepositFragment2 = this.this$0;
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.rhymigration.ui.directdeposit.RhyDirectDepositFragment$ComposeContent$1$1$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return RhyDirectDepositFragment.C276141.AnonymousClass1.invoke$lambda$3$lambda$2(rhyDirectDepositFragment2);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        Function0 function0 = (Function0) objRememberedValue2;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance3 = composer.changedInstance(this.this$0);
                        final RhyDirectDepositFragment rhyDirectDepositFragment3 = this.this$0;
                        Object objRememberedValue3 = composer.rememberedValue();
                        if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new Function0() { // from class: com.robinhood.android.rhymigration.ui.directdeposit.RhyDirectDepositFragment$ComposeContent$1$1$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return RhyDirectDepositFragment.C276141.AnonymousClass1.invoke$lambda$5$lambda$4(rhyDirectDepositFragment3);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue3);
                        }
                        composer.endReplaceGroup();
                        RhyDirectDepositComposable.CmSunsetFundingComposable(routingNumber, accountNumber, hasExistingDd, fromMigrationFlow, function3, function0, (Function0) objRememberedValue3, composer, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(RhyDirectDepositFragment rhyDirectDepositFragment, String text, String label, HapticFeedback haptic) throws Resources.NotFoundException {
                        Intrinsics.checkNotNullParameter(text, "text");
                        Intrinsics.checkNotNullParameter(label, "label");
                        Intrinsics.checkNotNullParameter(haptic, "haptic");
                        rhyDirectDepositFragment.copyAcctDataToClipboard(text, label, haptic);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$3$lambda$2(RhyDirectDepositFragment rhyDirectDepositFragment) {
                        rhyDirectDepositFragment.getClickedDirectDepositNuxPref().set(true);
                        rhyDirectDepositFragment.getDuxo().requestRoutingInfoEmail();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$5$lambda$4(RhyDirectDepositFragment rhyDirectDepositFragment) {
                        if (Intrinsics.areEqual(((Args) RhyDirectDepositFragment.INSTANCE.getArgs((Fragment) rhyDirectDepositFragment)).getFromMigrationFlow(), Boolean.TRUE)) {
                            rhyDirectDepositFragment.getCallbacks().onDirectDepositContinueClicked();
                        } else {
                            rhyDirectDepositFragment.getParentFragmentManager().popBackStackImmediate();
                        }
                        return Unit.INSTANCE;
                    }
                }

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
                        ComposerKt.traceEventStart(1085941346, i3, -1, "com.robinhood.android.rhymigration.ui.directdeposit.RhyDirectDepositFragment.ComposeContent.<anonymous> (RhyDirectDepositFragment.kt:111)");
                    }
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1574581229, true, new AnonymousClass1(RhyDirectDepositFragment.this, snapshotState4SubscribeAsState), composer2, 54), composer2, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rhymigration.ui.directdeposit.RhyDirectDepositFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RhyDirectDepositFragment.ComposeContent$lambda$5(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copyAcctDataToClipboard(String text, String clipboardLabel, HapticFeedback haptic) throws Resources.NotFoundException {
        getClickedDirectDepositNuxPref().set(true);
        if (StringsKt.isBlank(text)) {
            return;
        }
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        ContextSystemServices.getClipboardManager(contextRequireContext).setPrimaryClip(ClipData.newPlainText(clipboardLabel, text));
        ContextsUiExtensions.showShortToast(contextRequireContext, C41827R.string.general_copied_to_clipboard);
        haptic.mo7039performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m7046getLongPress5zf0vsI());
    }

    /* compiled from: RhyDirectDepositFragment.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ&\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000eJ\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/directdeposit/RhyDirectDepositFragment$Args;", "Landroid/os/Parcelable;", "hasExistingDd", "", "fromMigrationFlow", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getHasExistingDd", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getFromMigrationFlow", "component1", "component2", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/robinhood/android/rhymigration/ui/directdeposit/RhyDirectDepositFragment$Args;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final Boolean fromMigrationFlow;
        private final Boolean hasExistingDd;

        /* compiled from: RhyDirectDepositFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                Boolean boolValueOf2 = null;
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() != 0) {
                    boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Args(boolValueOf, boolValueOf2);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Args() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Args copy$default(Args args, Boolean bool, Boolean bool2, int i, Object obj) {
            if ((i & 1) != 0) {
                bool = args.hasExistingDd;
            }
            if ((i & 2) != 0) {
                bool2 = args.fromMigrationFlow;
            }
            return args.copy(bool, bool2);
        }

        /* renamed from: component1, reason: from getter */
        public final Boolean getHasExistingDd() {
            return this.hasExistingDd;
        }

        /* renamed from: component2, reason: from getter */
        public final Boolean getFromMigrationFlow() {
            return this.fromMigrationFlow;
        }

        public final Args copy(Boolean hasExistingDd, Boolean fromMigrationFlow) {
            return new Args(hasExistingDd, fromMigrationFlow);
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
            return Intrinsics.areEqual(this.hasExistingDd, args.hasExistingDd) && Intrinsics.areEqual(this.fromMigrationFlow, args.fromMigrationFlow);
        }

        public int hashCode() {
            Boolean bool = this.hasExistingDd;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Boolean bool2 = this.fromMigrationFlow;
            return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
        }

        public String toString() {
            return "Args(hasExistingDd=" + this.hasExistingDd + ", fromMigrationFlow=" + this.fromMigrationFlow + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Boolean bool = this.hasExistingDd;
            if (bool == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(bool.booleanValue() ? 1 : 0);
            }
            Boolean bool2 = this.fromMigrationFlow;
            if (bool2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(bool2.booleanValue() ? 1 : 0);
            }
        }

        public Args(Boolean bool, Boolean bool2) {
            this.hasExistingDd = bool;
            this.fromMigrationFlow = bool2;
        }

        public /* synthetic */ Args(Boolean bool, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? Boolean.FALSE : bool, (i & 2) != 0 ? Boolean.TRUE : bool2);
        }

        public final Boolean getHasExistingDd() {
            return this.hasExistingDd;
        }

        public final Boolean getFromMigrationFlow() {
            return this.fromMigrationFlow;
        }
    }

    /* compiled from: RhyDirectDepositFragment.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/directdeposit/RhyDirectDepositFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolver;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$RhyDirectDepositInfo;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/rhymigration/ui/directdeposit/RhyDirectDepositFragment;", "Lcom/robinhood/android/rhymigration/ui/directdeposit/RhyDirectDepositFragment$Args;", "<init>", "()V", "createFragment", "Landroidx/fragment/app/Fragment;", "key", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolver<LegacyFragmentKey.RhyDirectDepositInfo>, FragmentWithArgsCompanion<RhyDirectDepositFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(RhyDirectDepositFragment rhyDirectDepositFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, rhyDirectDepositFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public RhyDirectDepositFragment newInstance(Args args) {
            return (RhyDirectDepositFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(RhyDirectDepositFragment rhyDirectDepositFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, rhyDirectDepositFragment, args);
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LegacyFragmentKey.RhyDirectDepositInfo key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return RhyDirectDepositFragment.INSTANCE.newInstance((Parcelable) new Args(Boolean.valueOf(key.getHasDdRelationship()), Boolean.valueOf(key.getFromMigrationFlow())));
        }
    }
}
