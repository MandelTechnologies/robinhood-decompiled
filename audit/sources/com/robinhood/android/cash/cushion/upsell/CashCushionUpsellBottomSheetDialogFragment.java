package com.robinhood.android.cash.cushion.upsell;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.rxjava2.RxJava2Adapter;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggingConfig;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.cash.cushion.C9970R;
import com.robinhood.android.cash.cushion.annotation.HasVisitedCashCushionUpsellPref;
import com.robinhood.android.cash.cushion.details.CashCushionDetailsContract;
import com.robinhood.android.cash.cushion.error.CashCushionUpdateErrorHandler;
import com.robinhood.android.cash.cushion.upsell.CashCushionUpsellBottomSheetDialogFragment;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.android.common.util.extensions.Snackbars;
import com.robinhood.android.designsystem.snackbar.RdsSnackbar;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.navigation.DialogFragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyDialogFragmentKey;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract3;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.rhy.RhyAccountLoggingStore;
import com.robinhood.models.p320db.bonfire.CashCushionStatus;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.RHYContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.ObservablesAndroid;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CashCushionUpsellBottomSheetDialogFragment.kt */
@Metadata(m3635d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 @2\u00020\u00012\u00020\u0002:\u0001@B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0016J\b\u00101\u001a\u00020.H\u0016J\b\u00102\u001a\u00020.H\u0016J\r\u00103\u001a\u00020.H\u0017¢\u0006\u0002\u00104J\u0010\u00105\u001a\u00020.2\u0006\u00106\u001a\u000207H\u0002J\b\u00108\u001a\u00020.H\u0002J\t\u00109\u001a\u00020:H\u0096\u0001R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\u001f\u0010 R\u001f\u0010\"\u001a\u00060#j\u0002`$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u001c\u001a\u0004\b%\u0010&R(\u0010(\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020+ ,*\n\u0012\u0004\u0012\u00020+\u0018\u00010*0*0)X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010;\u001a\b\u0012\u0004\u0012\u00020=0<X\u0096\u0005¢\u0006\u0006\u001a\u0004\b>\u0010?¨\u0006A²\u0006\n\u00106\u001a\u000207X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/cash/cushion/upsell/CashCushionUpsellBottomSheetDialogFragment;", "Lcom/robinhood/compose/app/GenericComposeBottomSheetDialogFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "hasVisitedCashCushionUpsellPref", "Lcom/robinhood/prefs/BooleanPreference;", "getHasVisitedCashCushionUpsellPref", "()Lcom/robinhood/prefs/BooleanPreference;", "setHasVisitedCashCushionUpsellPref", "(Lcom/robinhood/prefs/BooleanPreference;)V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "rhyAccountLoggingStore", "Lcom/robinhood/librobinhood/data/store/rhy/RhyAccountLoggingStore;", "getRhyAccountLoggingStore", "()Lcom/robinhood/librobinhood/data/store/rhy/RhyAccountLoggingStore;", "setRhyAccountLoggingStore", "(Lcom/robinhood/librobinhood/data/store/rhy/RhyAccountLoggingStore;)V", "duxo", "Lcom/robinhood/android/cash/cushion/upsell/CashCushionUpsellBottomSheetDuxo;", "getDuxo", "()Lcom/robinhood/android/cash/cushion/upsell/CashCushionUpsellBottomSheetDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "eventScreen$delegate", "eventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "getEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "eventContext$delegate", "cashCushionDetailsLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/robinhood/android/navigation/contracts/NavigationActivityResultContract$NavigationParams;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$CashCushionDetails;", "kotlin.jvm.PlatformType", "onAttach", "", "context", "Landroid/content/Context;", "onStart", "onStop", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "bindViewState", "viewState", "Lcom/robinhood/android/cash/cushion/upsell/CashCushionUpsellBottomSheetViewState;", "showEnabledSnackbar", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-lib-cash-cushion_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class CashCushionUpsellBottomSheetDialogFragment extends GenericComposeBottomSheetDialogFragment implements RegionGated {
    private final ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<LegacyIntentKey.CashCushionDetails>> cashCushionDetailsLauncher;
    public EventLogger eventLogger;

    @HasVisitedCashCushionUpsellPref
    public BooleanPreference hasVisitedCashCushionUpsellPref;
    public RhyAccountLoggingStore rhyAccountLoggingStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = OldDuxos.oldDuxo(this, CashCushionUpsellBottomSheetDuxo.class);

    /* renamed from: eventScreen$delegate, reason: from kotlin metadata */
    private final Lazy eventScreen = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.cash.cushion.upsell.CashCushionUpsellBottomSheetDialogFragment$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CashCushionUpsellBottomSheetDialogFragment.eventScreen_delegate$lambda$0();
        }
    });

    /* renamed from: eventContext$delegate, reason: from kotlin metadata */
    private final Lazy eventContext = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.cash.cushion.upsell.CashCushionUpsellBottomSheetDialogFragment$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CashCushionUpsellBottomSheetDialogFragment.eventContext_delegate$lambda$1(this.f$0);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$5(CashCushionUpsellBottomSheetDialogFragment cashCushionUpsellBottomSheetDialogFragment, int i, Composer composer, int i2) {
        cashCushionUpsellBottomSheetDialogFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    public CashCushionUpsellBottomSheetDialogFragment() {
        ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<LegacyIntentKey.CashCushionDetails>> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new CashCushionDetailsContract(new Function0() { // from class: com.robinhood.android.cash.cushion.upsell.CashCushionUpsellBottomSheetDialogFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.getNavigator();
            }
        }), new ActivityResultCallback() { // from class: com.robinhood.android.cash.cushion.upsell.CashCushionUpsellBottomSheetDialogFragment$cashCushionDetailsLauncher$2
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(CashCushionDetailsContract.Result result) {
                if (result instanceof CashCushionDetailsContract.Result.Enabled) {
                    this.this$0.showEnabledSnackbar();
                    this.this$0.dismiss();
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.cashCushionDetailsLauncher = activityResultLauncherRegisterForActivityResult;
    }

    public final BooleanPreference getHasVisitedCashCushionUpsellPref() {
        BooleanPreference booleanPreference = this.hasVisitedCashCushionUpsellPref;
        if (booleanPreference != null) {
            return booleanPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("hasVisitedCashCushionUpsellPref");
        return null;
    }

    public final void setHasVisitedCashCushionUpsellPref(BooleanPreference booleanPreference) {
        Intrinsics.checkNotNullParameter(booleanPreference, "<set-?>");
        this.hasVisitedCashCushionUpsellPref = booleanPreference;
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

    public final RhyAccountLoggingStore getRhyAccountLoggingStore() {
        RhyAccountLoggingStore rhyAccountLoggingStore = this.rhyAccountLoggingStore;
        if (rhyAccountLoggingStore != null) {
            return rhyAccountLoggingStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rhyAccountLoggingStore");
        return null;
    }

    public final void setRhyAccountLoggingStore(RhyAccountLoggingStore rhyAccountLoggingStore) {
        Intrinsics.checkNotNullParameter(rhyAccountLoggingStore, "<set-?>");
        this.rhyAccountLoggingStore = rhyAccountLoggingStore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CashCushionUpsellBottomSheetDuxo getDuxo() {
        return (CashCushionUpsellBottomSheetDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Screen getEventScreen() {
        return (Screen) this.eventScreen.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Screen eventScreen_delegate$lambda$0() {
        return new Screen(Screen.Name.RHY_BACKUP_COVERAGE_BOTTOM_SHEET, null, null, null, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Context getEventContext() {
        return (Context) this.eventContext.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Context eventContext_delegate$lambda$1(CashCushionUpsellBottomSheetDialogFragment cashCushionUpsellBottomSheetDialogFragment) {
        return new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new RHYContext(RHYContext.ProductArea.CASH_ACCOUNTS, "backup_coverage", ((LegacyDialogFragmentKey.CashCushionUpsell) INSTANCE.getArgs((Fragment) cashCushionUpsellBottomSheetDialogFragment)).getEntryPoint(), cashCushionUpsellBottomSheetDialogFragment.getRhyAccountLoggingStore().getRhyAccountType(), null, null, 48, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -2049, -1, -1, -1, 16383, null);
    }

    @Override // com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, com.robinhood.hammer.android.fragment.HammerDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        getHasVisitedCashCushionUpsellPref().set(true);
        EventLogger.DefaultImpls.logAppear$default(getEventLogger(), null, getEventScreen(), null, null, getEventContext(), 13, null);
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C99991(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CashCushionUpsellBottomSheetViewState ComposeContent$lambda$4(SnapshotState4<CashCushionUpsellBottomSheetViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* compiled from: CashCushionUpsellBottomSheetDialogFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cash.cushion.upsell.CashCushionUpsellBottomSheetDialogFragment$onStart$1 */
    /* synthetic */ class C99991 extends FunctionReferenceImpl implements Function1<CashCushionUpsellBottomSheetViewState, Unit> {
        C99991(Object obj) {
            super(1, obj, CashCushionUpsellBottomSheetDialogFragment.class, "bindViewState", "bindViewState(Lcom/robinhood/android/cash/cushion/upsell/CashCushionUpsellBottomSheetViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CashCushionUpsellBottomSheetViewState cashCushionUpsellBottomSheetViewState) {
            invoke2(cashCushionUpsellBottomSheetViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CashCushionUpsellBottomSheetViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((CashCushionUpsellBottomSheetDialogFragment) this.receiver).bindViewState(p0);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        EventLogger.DefaultImpls.logDisappear$default(getEventLogger(), null, getEventScreen(), null, null, getEventContext(), 13, null);
    }

    @Override // com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(680998936);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(680998936, i2, -1, "com.robinhood.android.cash.cushion.upsell.CashCushionUpsellBottomSheetDialogFragment.ComposeContent (CashCushionUpsellBottomSheetDialogFragment.kt:105)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(2026203565, true, new C99971(RxJava2Adapter.subscribeAsState(getDuxo().getStates(), new CashCushionUpsellBottomSheetViewState(false, null, null, null, 15, null), composerStartRestartGroup, 0)), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cash.cushion.upsell.CashCushionUpsellBottomSheetDialogFragment$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CashCushionUpsellBottomSheetDialogFragment.ComposeContent$lambda$5(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: CashCushionUpsellBottomSheetDialogFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.cash.cushion.upsell.CashCushionUpsellBottomSheetDialogFragment$ComposeContent$1 */
    static final class C99971 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState4<CashCushionUpsellBottomSheetViewState> $viewState$delegate;

        C99971(SnapshotState4<CashCushionUpsellBottomSheetViewState> snapshotState4) {
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
                ComposerKt.traceEventStart(2026203565, i, -1, "com.robinhood.android.cash.cushion.upsell.CashCushionUpsellBottomSheetDialogFragment.ComposeContent.<anonymous> (CashCushionUpsellBottomSheetDialogFragment.kt:108)");
            }
            boolean loading = CashCushionUpsellBottomSheetDialogFragment.ComposeContent$lambda$4(this.$viewState$delegate).getLoading();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(CashCushionUpsellBottomSheetDialogFragment.this);
            final CashCushionUpsellBottomSheetDialogFragment cashCushionUpsellBottomSheetDialogFragment = CashCushionUpsellBottomSheetDialogFragment.this;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.cash.cushion.upsell.CashCushionUpsellBottomSheetDialogFragment$ComposeContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CashCushionUpsellBottomSheetDialogFragment.C99971.invoke$lambda$1$lambda$0(cashCushionUpsellBottomSheetDialogFragment);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(CashCushionUpsellBottomSheetDialogFragment.this);
            final CashCushionUpsellBottomSheetDialogFragment cashCushionUpsellBottomSheetDialogFragment2 = CashCushionUpsellBottomSheetDialogFragment.this;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.cash.cushion.upsell.CashCushionUpsellBottomSheetDialogFragment$ComposeContent$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CashCushionUpsellBottomSheetDialogFragment.C99971.invoke$lambda$3$lambda$2(cashCushionUpsellBottomSheetDialogFragment2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            CashCushionUpsellBottomSheetComposable.CashCushionUpsellBottomSheetComposable(null, loading, function0, (Function0) objRememberedValue2, composer, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(CashCushionUpsellBottomSheetDialogFragment cashCushionUpsellBottomSheetDialogFragment) {
            EventLogger.DefaultImpls.logTap$default(cashCushionUpsellBottomSheetDialogFragment.getEventLogger(), UserInteractionEventData.Action.PRIMARY_CTA, cashCushionUpsellBottomSheetDialogFragment.getEventScreen(), new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, cashCushionUpsellBottomSheetDialogFragment.getEventContext(), false, 40, null);
            cashCushionUpsellBottomSheetDialogFragment.getDuxo().onContinue();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(CashCushionUpsellBottomSheetDialogFragment cashCushionUpsellBottomSheetDialogFragment) {
            EventLogger.DefaultImpls.logTap$default(cashCushionUpsellBottomSheetDialogFragment.getEventLogger(), UserInteractionEventData.Action.DISMISS, cashCushionUpsellBottomSheetDialogFragment.getEventScreen(), new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, cashCushionUpsellBottomSheetDialogFragment.getEventContext(), false, 40, null);
            cashCushionUpsellBottomSheetDialogFragment.dismiss();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindViewState(CashCushionUpsellBottomSheetViewState viewState) {
        UiEvent<CashCushionStatus> dismissEvent = viewState.getDismissEvent();
        if (dismissEvent != null) {
            dismissEvent.consumeWith(new Function1() { // from class: com.robinhood.android.cash.cushion.upsell.CashCushionUpsellBottomSheetDialogFragment$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CashCushionUpsellBottomSheetDialogFragment.bindViewState$lambda$6(this.f$0, (CashCushionStatus) obj);
                }
            });
        }
        UiEvent<LegacyIntentKey.CashCushionDetails> launchCashCushionDetailsEvent = viewState.getLaunchCashCushionDetailsEvent();
        if (launchCashCushionDetailsEvent != null) {
            launchCashCushionDetailsEvent.consumeWith(new Function1() { // from class: com.robinhood.android.cash.cushion.upsell.CashCushionUpsellBottomSheetDialogFragment$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CashCushionUpsellBottomSheetDialogFragment.bindViewState$lambda$7(this.f$0, (LegacyIntentKey.CashCushionDetails) obj);
                }
            });
        }
        UiEvent<Throwable> error = viewState.getError();
        if (error != null) {
            error.consumeWith(new Function1() { // from class: com.robinhood.android.cash.cushion.upsell.CashCushionUpsellBottomSheetDialogFragment$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CashCushionUpsellBottomSheetDialogFragment.bindViewState$lambda$8(this.f$0, (Throwable) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindViewState$lambda$6(CashCushionUpsellBottomSheetDialogFragment cashCushionUpsellBottomSheetDialogFragment, CashCushionStatus it) {
        Intrinsics.checkNotNullParameter(it, "it");
        cashCushionUpsellBottomSheetDialogFragment.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindViewState$lambda$7(CashCushionUpsellBottomSheetDialogFragment cashCushionUpsellBottomSheetDialogFragment, LegacyIntentKey.CashCushionDetails it) {
        Intrinsics.checkNotNullParameter(it, "it");
        NavigationActivityResultContract3.launch$default(cashCushionUpsellBottomSheetDialogFragment.cashCushionDetailsLauncher, it, null, false, 6, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindViewState$lambda$8(CashCushionUpsellBottomSheetDialogFragment cashCushionUpsellBottomSheetDialogFragment, Throwable error) throws Throwable {
        Intrinsics.checkNotNullParameter(error, "error");
        CashCushionUpdateErrorHandler.Companion companion = CashCushionUpdateErrorHandler.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity = cashCushionUpsellBottomSheetDialogFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        if (!companion.handle(fragmentActivityRequireActivity, error) && !AbsErrorHandler.handleError$default(Fragments2.getActivityErrorHandler(cashCushionUpsellBottomSheetDialogFragment), error, false, 2, null)) {
            throw error;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showEnabledSnackbar() {
        FragmentActivity activity;
        if (!isAdded() || (activity = getActivity()) == null || activity.isFinishing()) {
            return;
        }
        RdsSnackbar.Companion companion = RdsSnackbar.INSTANCE;
        Snackbars snackbars = Snackbars.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        RdsSnackbar.setAction$default(companion.make(snackbars.findRoot(fragmentActivityRequireActivity), C9970R.string.cash_cushion_enabled_snackbar_message, 0).setLeadingIcon(C20690R.drawable.ic_rds_checkmark_24dp), C9970R.string.cash_cushion_enabled_snackbar_action, false, (UserInteractionEventDescriptor) null, (AutoLoggingConfig) null, new Function0() { // from class: com.robinhood.android.cash.cushion.upsell.CashCushionUpsellBottomSheetDialogFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CashCushionUpsellBottomSheetDialogFragment.showEnabledSnackbar$lambda$9(this.f$0);
            }
        }, 14, (Object) null).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showEnabledSnackbar$lambda$9(CashCushionUpsellBottomSheetDialogFragment cashCushionUpsellBottomSheetDialogFragment) {
        Navigator navigator = cashCushionUpsellBottomSheetDialogFragment.getNavigator();
        FragmentActivity fragmentActivityRequireActivity = cashCushionUpsellBottomSheetDialogFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, fragmentActivityRequireActivity, LegacyFragmentKey.RhyAccountSettings.INSTANCE, false, false, false, false, null, false, null, null, 1020, null);
        return Unit.INSTANCE;
    }

    /* compiled from: CashCushionUpsellBottomSheetDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/cash/cushion/upsell/CashCushionUpsellBottomSheetDialogFragment$Companion;", "Lcom/robinhood/android/navigation/DialogFragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/cash/cushion/upsell/CashCushionUpsellBottomSheetDialogFragment;", "Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey$CashCushionUpsell;", "<init>", "()V", "feature-lib-cash-cushion_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DialogFragmentResolverWithArgsCompanion<CashCushionUpsellBottomSheetDialogFragment, LegacyDialogFragmentKey.CashCushionUpsell> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.DialogFragmentResolverWithArgsCompanion, com.robinhood.android.navigation.DialogFragmentResolver
        public CashCushionUpsellBottomSheetDialogFragment createDialogFragment(LegacyDialogFragmentKey.CashCushionUpsell cashCushionUpsell) {
            return (CashCushionUpsellBottomSheetDialogFragment) DialogFragmentResolverWithArgsCompanion.DefaultImpls.createDialogFragment(this, cashCushionUpsell);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LegacyDialogFragmentKey.CashCushionUpsell getArgs(CashCushionUpsellBottomSheetDialogFragment cashCushionUpsellBottomSheetDialogFragment) {
            return (LegacyDialogFragmentKey.CashCushionUpsell) DialogFragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, cashCushionUpsellBottomSheetDialogFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public CashCushionUpsellBottomSheetDialogFragment newInstance(LegacyDialogFragmentKey.CashCushionUpsell cashCushionUpsell) {
            return (CashCushionUpsellBottomSheetDialogFragment) DialogFragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, cashCushionUpsell);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(CashCushionUpsellBottomSheetDialogFragment cashCushionUpsellBottomSheetDialogFragment, LegacyDialogFragmentKey.CashCushionUpsell cashCushionUpsell) {
            DialogFragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, cashCushionUpsellBottomSheetDialogFragment, cashCushionUpsell);
        }
    }
}
