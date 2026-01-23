package com.robinhood.android.optionsexercise;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.common.util.extensions.Breadcrumbs2;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.breadcrumbs.SupportBreadcrumb;
import com.robinhood.android.lib.breadcrumbs.SupportBreadcrumbTracker2;
import com.robinhood.android.lib.breadcrumbs.SupportBreadcrumbType;
import com.robinhood.android.lib.trade.BaseOrderConfirmationFragment;
import com.robinhood.android.lib.trade.BaseOrderParentFragment;
import com.robinhood.android.navigation.C22231R;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.fragment.ReplaceFragmentBuilder;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.optionsexercise.OptionExerciseConfirmationFragment;
import com.robinhood.android.optionsexercise.OptionExerciseFragment;
import com.robinhood.android.optionsexercise.OptionExerciseParentDuxo;
import com.robinhood.android.optionsexercise.OptionExerciseSplashFragment;
import com.robinhood.android.optionsexercise.assignment.EarlyAssignmentActionFragment;
import com.robinhood.android.optionsexercise.assignment.EarlyAssignmentComparisonFragment;
import com.robinhood.android.optionsexercise.assignment.EarlyAssignmentOptionPickerFragment;
import com.robinhood.android.optionsexercise.assignment.EarlyAssignmentSplashFragment;
import com.robinhood.android.optionsexercise.education.OptionExerciseEducationContext;
import com.robinhood.android.optionsexercise.education.OptionExercisePsaFragment;
import com.robinhood.android.optionsexercise.education.OptionExerciseReasonFragment;
import com.robinhood.android.optionsexercise.education.OptionExerciseWarningFragment;
import com.robinhood.android.optionsexercise.error.OptionExerciseCorpActionFragment;
import com.robinhood.android.optionsexercise.error.OptionExerciseMarketDataErrorFragment;
import com.robinhood.android.optionsexercise.pref.NeverShowEarlyAssignmentSplashPref;
import com.robinhood.android.optionsexercise.pref.NeverShowOptionExerciseSplashPref;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.trading.contracts.EquityOrderActivityIntentKey;
import com.robinhood.android.trading.contracts.EquityOrderFlowSource;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.ApiOptionExerciseRequest;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.OptionContractType;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import com.robinhood.shared.i18n.car.CarSuitabilityType;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.util.Set;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;

/* compiled from: OptionExerciseParentFragment.kt */
@Metadata(m3635d1 = {"\u0000ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u0096\u00012\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\f:\u0004\u0095\u0001\u0096\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010`\u001a\u00020a2\u0006\u0010b\u001a\u00020c2\b\u0010d\u001a\u0004\u0018\u00010eH\u0016J\b\u0010f\u001a\u00020aH\u0016J\"\u0010g\u001a\u00020a2\u0006\u0010h\u001a\u00020,2\u0006\u0010i\u001a\u00020,2\b\u0010j\u001a\u0004\u0018\u00010kH\u0016J\u0010\u0010l\u001a\u00020a2\u0006\u0010m\u001a\u00020/H\u0016J\u0010\u0010n\u001a\u00020a2\u0006\u0010o\u001a\u00020pH\u0016J\b\u0010q\u001a\u00020aH\u0016J\u0012\u0010r\u001a\u00020a2\b\u0010O\u001a\u0004\u0018\u00010NH\u0016J\u0010\u0010s\u001a\u00020a2\u0006\u0010m\u001a\u00020/H\u0016J\u0010\u0010t\u001a\u00020a2\u0006\u0010G\u001a\u00020FH\u0016J\b\u0010u\u001a\u00020aH\u0016J\u0010\u0010v\u001a\u00020a2\u0006\u0010w\u001a\u00020xH\u0016J\u0010\u0010y\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030zH\u0016J\b\u0010{\u001a\u00020aH\u0016J\b\u0010|\u001a\u00020aH\u0002J\b\u0010}\u001a\u00020aH\u0002J\b\u0010~\u001a\u00020aH\u0002J\b\u0010\u007f\u001a\u00020aH\u0002J\t\u0010\u0080\u0001\u001a\u00020aH\u0002J%\u0010\u0081\u0001\u001a\u00020a2\u001a\u0010\u0082\u0001\u001a\u0015\u0012\u0004\u0012\u00020N\u0012\u0004\u0012\u00020a0\u0083\u0001¢\u0006\u0003\b\u0084\u0001H\u0002J%\u0010\u0085\u0001\u001a\u00020a2\u001a\u0010\u0082\u0001\u001a\u0015\u0012\u0004\u0012\u00020U\u0012\u0004\u0012\u00020a0\u0083\u0001¢\u0006\u0003\b\u0084\u0001H\u0002J\"\u0010\u0086\u0001\u001a\u00020a2\u0007\u0010\u0087\u0001\u001a\u00020,2\u000e\u0010\u0088\u0001\u001a\t\u0012\u0004\u0012\u00020a0\u0089\u0001H\u0002J\u0013\u0010\u008a\u0001\u001a\u00020a2\b\u0010\u008b\u0001\u001a\u00030\u008c\u0001H\u0002J\u0013\u0010\u008d\u0001\u001a\u00020a2\b\u0010\u008b\u0001\u001a\u00030\u008c\u0001H\u0002J\t\u0010\u008e\u0001\u001a\u00020/H\u0016J\n\u0010\u008f\u0001\u001a\u00020/H\u0096\u0001R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0015\u001a\u00020\u00028\u0016@\u0016X\u0097.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001a\u001a\u00020\u001b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010 \u001a\u00020!8\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b\"\u0010\u000e\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010'\u001a\u00020!8\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b(\u0010\u000e\u001a\u0004\b)\u0010$\"\u0004\b*\u0010&R\u0016\u0010+\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0083\u000e¢\u0006\u0004\n\u0002\u0010-R\u0014\u0010.\u001a\u00020/8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0016\u00102\u001a\u0004\u0018\u00010,8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u001a\u00105\u001a\b\u0012\u0004\u0012\u000207068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0016\u0010:\u001a\u0004\u0018\u00010;X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0014\u0010>\u001a\u000207X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0014\u0010A\u001a\u00020BX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR/\u0010G\u001a\u0004\u0018\u00010F2\b\u0010E\u001a\u0004\u0018\u00010F8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR/\u0010O\u001a\u0004\u0018\u00010N2\b\u0010E\u001a\u0004\u0018\u00010N8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bT\u0010M\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR/\u0010V\u001a\u0004\u0018\u00010U2\b\u0010E\u001a\u0004\u0018\u00010U8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b[\u0010M\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u0014\u0010\\\u001a\u00020]8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b^\u0010_R\u001d\u0010\u0090\u0001\u001a\n\u0012\u0005\u0012\u00030\u0092\u00010\u0091\u0001X\u0096\u0005¢\u0006\b\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001¨\u0006\u0097\u0001"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/OptionExerciseParentFragment;", "Lcom/robinhood/android/lib/trade/BaseOrderParentFragment;", "Lcom/robinhood/android/optionsexercise/OptionExerciseManager;", "Lcom/robinhood/android/common/ui/BaseFragment$ChildFragmentAnimationOverrider;", "Lcom/robinhood/android/optionsexercise/OptionExerciseSplashFragment$Callbacks;", "Lcom/robinhood/android/optionsexercise/assignment/EarlyAssignmentSplashFragment$Callbacks;", "Lcom/robinhood/android/optionsexercise/assignment/EarlyAssignmentActionFragment$Callbacks;", "Lcom/robinhood/android/optionsexercise/assignment/EarlyAssignmentOptionPickerFragment$Callbacks;", "Lcom/robinhood/android/optionsexercise/education/OptionExerciseReasonFragment$Callbacks;", "Lcom/robinhood/android/optionsexercise/education/OptionExercisePsaFragment$Callbacks;", "Lcom/robinhood/android/optionsexercise/education/OptionExerciseWarningFragment$Callbacks;", "Lcom/robinhood/android/lib/breadcrumbs/AutomaticBreadcrumbProvider;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "duxo", "Lcom/robinhood/android/optionsexercise/OptionExerciseParentDuxo;", "getDuxo", "()Lcom/robinhood/android/optionsexercise/OptionExerciseParentDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "orderManager", "getOrderManager", "()Lcom/robinhood/android/optionsexercise/OptionExerciseManager;", "setOrderManager", "(Lcom/robinhood/android/optionsexercise/OptionExerciseManager;)V", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "getAccountProvider", "()Lcom/robinhood/android/lib/account/AccountProvider;", "setAccountProvider", "(Lcom/robinhood/android/lib/account/AccountProvider;)V", "neverShowAssignmentSplashPref", "Lcom/robinhood/prefs/BooleanPreference;", "getNeverShowAssignmentSplashPref$annotations", "getNeverShowAssignmentSplashPref", "()Lcom/robinhood/prefs/BooleanPreference;", "setNeverShowAssignmentSplashPref", "(Lcom/robinhood/prefs/BooleanPreference;)V", "neverShowExerciseSplashPref", "getNeverShowExerciseSplashPref$annotations", "getNeverShowExerciseSplashPref", "setNeverShowExerciseSplashPref", "childNextAnim", "", "Ljava/lang/Integer;", "shouldOverrideChildFragmentAnimation", "", "getShouldOverrideChildFragmentAnimation", "()Z", "forcedChildAnimationResId", "getForcedChildAnimationResId", "()Ljava/lang/Integer;", "accountNumberObs", "Lio/reactivex/Observable;", "", "getAccountNumberObs", "()Lio/reactivex/Observable;", "side", "Lcom/robinhood/models/db/OrderSide;", "getSide", "()Lcom/robinhood/models/db/OrderSide;", "analyticsErrorString", "getAnalyticsErrorString", "()Ljava/lang/String;", "carSuitabilityType", "Lcom/robinhood/shared/i18n/car/CarSuitabilityType$Option;", "getCarSuitabilityType", "()Lcom/robinhood/shared/i18n/car/CarSuitabilityType$Option;", "<set-?>", "Lcom/robinhood/models/api/ApiOptionExerciseRequest$Reason;", "reason", "getReason", "()Lcom/robinhood/models/api/ApiOptionExerciseRequest$Reason;", "setReason", "(Lcom/robinhood/models/api/ApiOptionExerciseRequest$Reason;)V", "reason$delegate", "Lkotlin/properties/ReadWriteProperty;", "Lcom/robinhood/android/optionsexercise/education/OptionExerciseEducationContext;", "educationContext", "getEducationContext", "()Lcom/robinhood/android/optionsexercise/education/OptionExerciseEducationContext;", "setEducationContext", "(Lcom/robinhood/android/optionsexercise/education/OptionExerciseEducationContext;)V", "educationContext$delegate", "Lcom/robinhood/android/optionsexercise/OptionInstrumentContext;", "initialOptionInstrumentContext", "getInitialOptionInstrumentContext", "()Lcom/robinhood/android/optionsexercise/OptionInstrumentContext;", "setInitialOptionInstrumentContext", "(Lcom/robinhood/android/optionsexercise/OptionInstrumentContext;)V", "initialOptionInstrumentContext$delegate", "breadcrumb", "Lcom/robinhood/android/lib/breadcrumbs/SupportBreadcrumb;", "getBreadcrumb", "()Lcom/robinhood/android/lib/breadcrumbs/SupportBreadcrumb;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onActivityResult", "requestCode", "resultCode", WebsocketGatewayConstants.DATA_KEY, "Landroid/content/Intent;", "onContinueAssignmentSplash", "neverShowAgain", "onContinueAction", "action", "Lcom/robinhood/android/optionsexercise/assignment/EarlyAssignmentActionFragment$Action;", "onClickSeeComparison", "onContinueOptionToBeExercisedPicker", "onContinueExerciseSplash", "onContinueReason", "onContinuePsa", "onContinueWarning", "from", "Lcom/robinhood/android/optionsexercise/education/OptionExerciseWarningFragment$Mode;", "createOrderConfirmationFragment", "Lcom/robinhood/android/lib/trade/BaseOrderConfirmationFragment;", "onSubmissionFailure", "startCorpActionFragment", "startMarketDataErrorFragment", "startEarlyAssignmentFlow", "startOptionExerciseFlow", "startWarningFlow", "withEducationContext", "function", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "withInitialOptionInstrumentContext", "withCustomAnimationForChild", "nextAnim", "synchronousAnimation", "Lkotlin/Function0;", "replaceFragmentNoAnimation", "fragment", "Landroidx/fragment/app/Fragment;", "replaceFragmentAndClearBackstack", "onBackPressed", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Args", "Companion", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionExerciseParentFragment extends BaseOrderParentFragment<OptionExerciseManager> implements BaseFragment.ChildFragmentAnimationOverrider, OptionExerciseSplashFragment.Callbacks, EarlyAssignmentSplashFragment.Callbacks, EarlyAssignmentActionFragment.Callbacks, EarlyAssignmentOptionPickerFragment.Callbacks, OptionExerciseReasonFragment.Callbacks, OptionExercisePsaFragment.Callbacks, OptionExerciseWarningFragment.Callbacks, SupportBreadcrumbTracker2, RegionGated {
    private static final int REQUEST_CODE_EQUITY_ORDER = 61;
    public AccountProvider accountProvider;
    private Integer childNextAnim;

    /* renamed from: educationContext$delegate, reason: from kotlin metadata */
    private final Interfaces3 educationContext;

    /* renamed from: initialOptionInstrumentContext$delegate, reason: from kotlin metadata */
    private final Interfaces3 initialOptionInstrumentContext;
    public BooleanPreference neverShowAssignmentSplashPref;
    public BooleanPreference neverShowExerciseSplashPref;
    public OptionExerciseManager orderManager;

    /* renamed from: reason$delegate, reason: from kotlin metadata */
    private final Interfaces3 reason;
    private final OrderSide side;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(OptionExerciseParentFragment.class, "reason", "getReason()Lcom/robinhood/models/api/ApiOptionExerciseRequest$Reason;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(OptionExerciseParentFragment.class, "educationContext", "getEducationContext()Lcom/robinhood/android/optionsexercise/education/OptionExerciseEducationContext;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(OptionExerciseParentFragment.class, "initialOptionInstrumentContext", "getInitialOptionInstrumentContext()Lcom/robinhood/android/optionsexercise/OptionInstrumentContext;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(OptionsRegionGate.INSTANCE);

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = OldDuxos.oldDuxo(this, OptionExerciseParentDuxo.class);
    private final String analyticsErrorString = AnalyticsStrings.ERROR_OPTION_EXERCISE;
    private final CarSuitabilityType.Option carSuitabilityType = CarSuitabilityType.Option.INSTANCE;

    /* compiled from: OptionExerciseParentFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[OptionExerciseParentDuxo.ErrorState.values().length];
            try {
                iArr[OptionExerciseParentDuxo.ErrorState.CORP_ACTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionExerciseParentDuxo.ErrorState.MARKETDATA_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[EarlyAssignmentActionFragment.Action.values().length];
            try {
                iArr2[EarlyAssignmentActionFragment.Action.EXERCISE_CONTRACTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[EarlyAssignmentActionFragment.Action.BUY_UNDERLYING.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EarlyAssignmentActionFragment.Action.SELL_UNDERLYING.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[OptionContractType.values().length];
            try {
                iArr3[OptionContractType.CALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[OptionContractType.PUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[OptionExerciseEducationContext.OtmWarningType.values().length];
            try {
                iArr4[OptionExerciseEducationContext.OtmWarningType.OTM.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr4[OptionExerciseEducationContext.OtmWarningType.ALMOST_OTM.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr4[OptionExerciseEducationContext.OtmWarningType.NOT_OTM.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    @NeverShowEarlyAssignmentSplashPref
    public static /* synthetic */ void getNeverShowAssignmentSplashPref$annotations() {
    }

    @NeverShowOptionExerciseSplashPref
    public static /* synthetic */ void getNeverShowExerciseSplashPref$annotations() {
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public OptionExerciseParentFragment() {
        Interfaces interfacesSavedSerializable = BindSavedState2.savedSerializable(this);
        KProperty<?>[] kPropertyArr = $$delegatedProperties;
        this.reason = (Interfaces3) interfacesSavedSerializable.provideDelegate(this, kPropertyArr[0]);
        this.educationContext = (Interfaces3) BindSavedState2.savedParcelable(this).provideDelegate(this, kPropertyArr[1]);
        this.initialOptionInstrumentContext = (Interfaces3) BindSavedState2.savedParcelable(this).provideDelegate(this, kPropertyArr[2]);
    }

    private final OptionExerciseParentDuxo getDuxo() {
        return (OptionExerciseParentDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderParentFragment
    public OptionExerciseManager getOrderManager() {
        OptionExerciseManager optionExerciseManager = this.orderManager;
        if (optionExerciseManager != null) {
            return optionExerciseManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("orderManager");
        return null;
    }

    public void setOrderManager(OptionExerciseManager optionExerciseManager) {
        Intrinsics.checkNotNullParameter(optionExerciseManager, "<set-?>");
        this.orderManager = optionExerciseManager;
    }

    public final AccountProvider getAccountProvider() {
        AccountProvider accountProvider = this.accountProvider;
        if (accountProvider != null) {
            return accountProvider;
        }
        Intrinsics.throwUninitializedPropertyAccessException("accountProvider");
        return null;
    }

    public final void setAccountProvider(AccountProvider accountProvider) {
        Intrinsics.checkNotNullParameter(accountProvider, "<set-?>");
        this.accountProvider = accountProvider;
    }

    public final BooleanPreference getNeverShowAssignmentSplashPref() {
        BooleanPreference booleanPreference = this.neverShowAssignmentSplashPref;
        if (booleanPreference != null) {
            return booleanPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("neverShowAssignmentSplashPref");
        return null;
    }

    public final void setNeverShowAssignmentSplashPref(BooleanPreference booleanPreference) {
        Intrinsics.checkNotNullParameter(booleanPreference, "<set-?>");
        this.neverShowAssignmentSplashPref = booleanPreference;
    }

    public final BooleanPreference getNeverShowExerciseSplashPref() {
        BooleanPreference booleanPreference = this.neverShowExerciseSplashPref;
        if (booleanPreference != null) {
            return booleanPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("neverShowExerciseSplashPref");
        return null;
    }

    public final void setNeverShowExerciseSplashPref(BooleanPreference booleanPreference) {
        Intrinsics.checkNotNullParameter(booleanPreference, "<set-?>");
        this.neverShowExerciseSplashPref = booleanPreference;
    }

    @Override // com.robinhood.android.common.ui.BaseFragment.ChildFragmentAnimationOverrider
    public boolean getShouldOverrideChildFragmentAnimation() {
        return this.childNextAnim != null;
    }

    @Override // com.robinhood.android.common.ui.BaseFragment.ChildFragmentAnimationOverrider
    public Integer getForcedChildAnimationResId() {
        return this.childNextAnim;
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderParentFragment
    public Observable<String> getAccountNumberObs() {
        Observable<String> observableJust;
        String accountNumber = ((Args) INSTANCE.getArgs((Fragment) this)).getAccountNumber();
        return (accountNumber == null || (observableJust = Observable.just(accountNumber)) == null) ? getAccountProvider().streamIndividualAccountNumber() : observableJust;
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderParentFragment
    public OrderSide getSide() {
        return this.side;
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderParentFragment
    public String getAnalyticsErrorString() {
        return this.analyticsErrorString;
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderParentFragment
    public CarSuitabilityType.Option getCarSuitabilityType() {
        return this.carSuitabilityType;
    }

    private final ApiOptionExerciseRequest.Reason getReason() {
        return (ApiOptionExerciseRequest.Reason) this.reason.getValue(this, $$delegatedProperties[0]);
    }

    private final void setReason(ApiOptionExerciseRequest.Reason reason) {
        this.reason.setValue(this, $$delegatedProperties[0], reason);
    }

    private final OptionExerciseEducationContext getEducationContext() {
        return (OptionExerciseEducationContext) this.educationContext.getValue(this, $$delegatedProperties[1]);
    }

    private final void setEducationContext(OptionExerciseEducationContext optionExerciseEducationContext) {
        this.educationContext.setValue(this, $$delegatedProperties[1], optionExerciseEducationContext);
    }

    private final OptionInstrumentContext getInitialOptionInstrumentContext() {
        return (OptionInstrumentContext) this.initialOptionInstrumentContext.getValue(this, $$delegatedProperties[2]);
    }

    private final void setInitialOptionInstrumentContext(OptionInstrumentContext optionInstrumentContext) {
        this.initialOptionInstrumentContext.setValue(this, $$delegatedProperties[2], optionInstrumentContext);
    }

    @Override // com.robinhood.android.lib.breadcrumbs.SupportBreadcrumbTracker2
    public SupportBreadcrumb getBreadcrumb() {
        return Breadcrumbs2.createBreadcrumb$default(this, SupportBreadcrumbType.INVESTING_ACTION_EXERCISE, null, 2, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, final Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Observable<OptionExerciseParentDuxo.OptionExerciseParentViewState> observableTake = getDuxo().getStates().filter(new Predicate() { // from class: com.robinhood.android.optionsexercise.OptionExerciseParentFragment.onViewCreated.1
            @Override // io.reactivex.functions.Predicate
            public final boolean test(OptionExerciseParentDuxo.OptionExerciseParentViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getIsReady();
            }
        }).take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableTake), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionsexercise.OptionExerciseParentFragment$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionExerciseParentFragment.onViewCreated$lambda$1(this.f$0, savedInstanceState, (OptionExerciseParentDuxo.OptionExerciseParentViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(OptionExerciseParentFragment optionExerciseParentFragment, Bundle bundle, OptionExerciseParentDuxo.OptionExerciseParentViewState optionExerciseParentViewState) {
        optionExerciseParentFragment.setInitialOptionInstrumentContext(optionExerciseParentViewState.getInitialOptionInstrumentContext());
        OptionExerciseParentDuxo.ErrorState errorState = optionExerciseParentViewState.getErrorState();
        int i = errorState == null ? -1 : WhenMappings.$EnumSwitchMapping$0[errorState.ordinal()];
        if (i == 1) {
            optionExerciseParentFragment.startCorpActionFragment();
        } else if (i == 2) {
            optionExerciseParentFragment.startMarketDataErrorFragment();
        } else if (bundle == null) {
            if (((Args) INSTANCE.getArgs((Fragment) optionExerciseParentFragment)).getFromEarlyAssignment()) {
                optionExerciseParentFragment.startEarlyAssignmentFlow();
            } else {
                optionExerciseParentFragment.startOptionExerciseFlow();
            }
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderParentFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Observable<R> map = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.optionsexercise.OptionExerciseParentFragment.onResume.1
            @Override // io.reactivex.functions.Function
            public final Optional<OptionExerciseEducationContext> apply(OptionExerciseParentDuxo.OptionExerciseParentViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(it.getEducationContext());
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(map), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionsexercise.OptionExerciseParentFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionExerciseParentFragment.onResume$lambda$2(this.f$0, (Optional) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$2(OptionExerciseParentFragment optionExerciseParentFragment, Optional optional) {
        optionExerciseParentFragment.setEducationContext((OptionExerciseEducationContext) optional.component1());
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderParentFragment, androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 61 && resultCode == -1) {
            requireActivity().finish();
        }
    }

    @Override // com.robinhood.android.optionsexercise.assignment.EarlyAssignmentSplashFragment.Callbacks
    public void onContinueAssignmentSplash(boolean neverShowAgain) {
        if (neverShowAgain) {
            getNeverShowAssignmentSplashPref().set(true);
        }
        withInitialOptionInstrumentContext(new Function1() { // from class: com.robinhood.android.optionsexercise.OptionExerciseParentFragment$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionExerciseParentFragment.onContinueAssignmentSplash$lambda$3(this.f$0, (OptionInstrumentContext) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onContinueAssignmentSplash$lambda$3(OptionExerciseParentFragment optionExerciseParentFragment, OptionInstrumentContext withInitialOptionInstrumentContext) {
        Intrinsics.checkNotNullParameter(withInitialOptionInstrumentContext, "$this$withInitialOptionInstrumentContext");
        optionExerciseParentFragment.replaceFragmentAndClearBackstack(EarlyAssignmentActionFragment.INSTANCE.newInstance(withInitialOptionInstrumentContext.getOptionInstrument().getContractType(), optionExerciseParentFragment.getDuxo().getStatesFlow().getValue().isUk()));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.optionsexercise.assignment.EarlyAssignmentActionFragment.Callbacks
    public void onContinueAction(final EarlyAssignmentActionFragment.Action action) {
        Intrinsics.checkNotNullParameter(action, "action");
        withInitialOptionInstrumentContext(new Function1() { // from class: com.robinhood.android.optionsexercise.OptionExerciseParentFragment$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionExerciseParentFragment.onContinueAction$lambda$4(action, this, (OptionInstrumentContext) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onContinueAction$lambda$4(EarlyAssignmentActionFragment.Action action, OptionExerciseParentFragment optionExerciseParentFragment, OptionInstrumentContext withInitialOptionInstrumentContext) {
        Intrinsics.checkNotNullParameter(withInitialOptionInstrumentContext, "$this$withInitialOptionInstrumentContext");
        int i = WhenMappings.$EnumSwitchMapping$1[action.ordinal()];
        if (i == 1) {
            optionExerciseParentFragment.replaceFragment(EarlyAssignmentOptionPickerFragment.INSTANCE.newInstance((Parcelable) new EarlyAssignmentOptionPickerFragment.Args(((Args) INSTANCE.getArgs((Fragment) optionExerciseParentFragment)).getAccountNumber(), withInitialOptionInstrumentContext)));
        } else if (i == 2) {
            Navigator.DefaultImpls.startActivityForResult$default(optionExerciseParentFragment.getNavigator(), (Fragment) optionExerciseParentFragment, (IntentKey) new EquityOrderActivityIntentKey.WithId(withInitialOptionInstrumentContext.getUnderlyingEquityId(), EquityOrderSide.BUY, EquityOrderFlowSource.OPTION_EXERCISE, null, null, null, null, false, false, 504, null), 61, (PerformanceMetricEventData.Source) null, false, (Function1) null, (NavigationType) null, 120, (Object) null);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            Navigator.DefaultImpls.startActivityForResult$default(optionExerciseParentFragment.getNavigator(), (Fragment) optionExerciseParentFragment, (IntentKey) new EquityOrderActivityIntentKey.WithId(withInitialOptionInstrumentContext.getUnderlyingEquityId(), EquityOrderSide.SELL, EquityOrderFlowSource.OPTION_EXERCISE, null, null, null, null, false, false, 504, null), 61, (PerformanceMetricEventData.Source) null, false, (Function1) null, (NavigationType) null, 120, (Object) null);
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.optionsexercise.assignment.EarlyAssignmentActionFragment.Callbacks
    public void onClickSeeComparison() {
        withInitialOptionInstrumentContext(new Function1() { // from class: com.robinhood.android.optionsexercise.OptionExerciseParentFragment$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionExerciseParentFragment.onClickSeeComparison$lambda$5(this.f$0, (OptionInstrumentContext) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onClickSeeComparison$lambda$5(OptionExerciseParentFragment optionExerciseParentFragment, OptionInstrumentContext withInitialOptionInstrumentContext) {
        OrderSide orderSide;
        Intrinsics.checkNotNullParameter(withInitialOptionInstrumentContext, "$this$withInitialOptionInstrumentContext");
        EarlyAssignmentComparisonFragment.Companion companion = EarlyAssignmentComparisonFragment.INSTANCE;
        int i = WhenMappings.$EnumSwitchMapping$2[withInitialOptionInstrumentContext.getOptionInstrument().getContractType().ordinal()];
        if (i == 1) {
            orderSide = OrderSide.BUY;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            orderSide = OrderSide.SELL;
        }
        optionExerciseParentFragment.replaceFragment(companion.newInstance(orderSide, optionExerciseParentFragment.getDuxo().getStatesFlow().getValue().isUk()));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.optionsexercise.assignment.EarlyAssignmentOptionPickerFragment.Callbacks
    public void onContinueOptionToBeExercisedPicker(OptionExerciseEducationContext educationContext) {
        setEducationContext(educationContext);
        withEducationContext(new Function1() { // from class: com.robinhood.android.optionsexercise.OptionExerciseParentFragment$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionExerciseParentFragment.onContinueOptionToBeExercisedPicker$lambda$6(this.f$0, (OptionExerciseEducationContext) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onContinueOptionToBeExercisedPicker$lambda$6(OptionExerciseParentFragment optionExerciseParentFragment, OptionExerciseEducationContext withEducationContext) {
        Intrinsics.checkNotNullParameter(withEducationContext, "$this$withEducationContext");
        optionExerciseParentFragment.getDuxo().setOptionToBeExercised(new OptionInstrumentContext(withEducationContext.getOptionInstrument(), withEducationContext.getEquityQuote().getInstrumentId(), withEducationContext.getLateCloseState()));
        optionExerciseParentFragment.startWarningFlow();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.optionsexercise.OptionExerciseSplashFragment.Callbacks
    public void onContinueExerciseSplash(boolean neverShowAgain) {
        if (neverShowAgain) {
            getNeverShowExerciseSplashPref().set(true);
        }
        withInitialOptionInstrumentContext(new Function1() { // from class: com.robinhood.android.optionsexercise.OptionExerciseParentFragment$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionExerciseParentFragment.onContinueExerciseSplash$lambda$7(this.f$0, (OptionInstrumentContext) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onContinueExerciseSplash$lambda$7(OptionExerciseParentFragment optionExerciseParentFragment, OptionInstrumentContext withInitialOptionInstrumentContext) {
        Intrinsics.checkNotNullParameter(withInitialOptionInstrumentContext, "$this$withInitialOptionInstrumentContext");
        optionExerciseParentFragment.replaceFragment(OptionExerciseReasonFragment.INSTANCE.newInstance(withInitialOptionInstrumentContext.getOptionInstrument(), optionExerciseParentFragment.getDuxo().getStatesFlow().getValue().isInEtfRegionGate()));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.optionsexercise.education.OptionExerciseReasonFragment.Callbacks
    public void onContinueReason(ApiOptionExerciseRequest.Reason reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        setReason(reason);
        withInitialOptionInstrumentContext(new Function1() { // from class: com.robinhood.android.optionsexercise.OptionExerciseParentFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionExerciseParentFragment.onContinueReason$lambda$8(this.f$0, (OptionInstrumentContext) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onContinueReason$lambda$8(OptionExerciseParentFragment optionExerciseParentFragment, OptionInstrumentContext withInitialOptionInstrumentContext) {
        Intrinsics.checkNotNullParameter(withInitialOptionInstrumentContext, "$this$withInitialOptionInstrumentContext");
        optionExerciseParentFragment.replaceFragment(OptionExercisePsaFragment.INSTANCE.newInstance((Parcelable) new OptionExercisePsaFragment.Args(withInitialOptionInstrumentContext.getOptionInstrument().getContractType(), withInitialOptionInstrumentContext.getLateCloseState())));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.optionsexercise.education.OptionExercisePsaFragment.Callbacks
    public void onContinuePsa() {
        startWarningFlow();
    }

    @Override // com.robinhood.android.optionsexercise.education.OptionExerciseWarningFragment.Callbacks
    public void onContinueWarning(final OptionExerciseWarningFragment.Mode from) {
        Intrinsics.checkNotNullParameter(from, "from");
        withEducationContext(new Function1() { // from class: com.robinhood.android.optionsexercise.OptionExerciseParentFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionExerciseParentFragment.onContinueWarning$lambda$9(from, this, (OptionExerciseEducationContext) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onContinueWarning$lambda$9(OptionExerciseWarningFragment.Mode mode, OptionExerciseParentFragment optionExerciseParentFragment, OptionExerciseEducationContext withEducationContext) {
        OptionExerciseWarningFragment.Mode mode2;
        Intrinsics.checkNotNullParameter(withEducationContext, "$this$withEducationContext");
        if (withEducationContext.getShowHighPremiumWarning() && mode != (mode2 = OptionExerciseWarningFragment.Mode.HIGH_PREMIUM)) {
            optionExerciseParentFragment.replaceFragment(OptionExerciseWarningFragment.INSTANCE.newInstance(withEducationContext, mode2));
        } else {
            Companion companion = INSTANCE;
            if (((Args) companion.getArgs((Fragment) optionExerciseParentFragment)).getFromEarlyAssignment()) {
                OptionExerciseFragment.Companion companion2 = OptionExerciseFragment.INSTANCE;
                String accountNumber = ((Args) companion.getArgs((Fragment) optionExerciseParentFragment)).getAccountNumber();
                UUID id = withEducationContext.getOptionInstrument().getId();
                ApiOptionExerciseRequest.Reason reason = optionExerciseParentFragment.getReason();
                Intrinsics.checkNotNull(reason);
                optionExerciseParentFragment.replaceFragment(companion2.newInstance((Parcelable) new OptionExerciseFragment.Args(accountNumber, id, reason)));
            } else {
                OptionExerciseFragment.Companion companion3 = OptionExerciseFragment.INSTANCE;
                String accountNumber2 = ((Args) companion.getArgs((Fragment) optionExerciseParentFragment)).getAccountNumber();
                UUID id2 = withEducationContext.getOptionInstrument().getId();
                ApiOptionExerciseRequest.Reason reason2 = optionExerciseParentFragment.getReason();
                Intrinsics.checkNotNull(reason2);
                optionExerciseParentFragment.replaceFragmentAndClearBackstack(companion3.newInstance((Parcelable) new OptionExerciseFragment.Args(accountNumber2, id2, reason2)));
            }
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderParentFragment
    public BaseOrderConfirmationFragment<?, ?> createOrderConfirmationFragment() {
        return (BaseOrderConfirmationFragment) OptionExerciseConfirmationFragment.INSTANCE.newInstance((Parcelable) new OptionExerciseConfirmationFragment.Args(((Args) INSTANCE.getArgs((Fragment) this)).getAccountNumber()));
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderParentFragment
    public void onSubmissionFailure() {
        getChildFragmentManager().popBackStack();
    }

    private final void startCorpActionFragment() {
        replaceFragmentAndClearBackstack(OptionExerciseCorpActionFragment.INSTANCE.newInstance());
    }

    private final void startMarketDataErrorFragment() {
        replaceFragmentAndClearBackstack(OptionExerciseMarketDataErrorFragment.INSTANCE.newInstance(getDuxo().getStatesFlow().getValue().isUk()));
    }

    private final void startEarlyAssignmentFlow() {
        withInitialOptionInstrumentContext(new Function1() { // from class: com.robinhood.android.optionsexercise.OptionExerciseParentFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionExerciseParentFragment.startEarlyAssignmentFlow$lambda$10(this.f$0, (OptionInstrumentContext) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startEarlyAssignmentFlow$lambda$10(OptionExerciseParentFragment optionExerciseParentFragment, OptionInstrumentContext withInitialOptionInstrumentContext) {
        Fragment fragmentNewInstance;
        Intrinsics.checkNotNullParameter(withInitialOptionInstrumentContext, "$this$withInitialOptionInstrumentContext");
        optionExerciseParentFragment.setReason(ApiOptionExerciseRequest.Reason.EARLY_ASSIGNMENT);
        if (!optionExerciseParentFragment.getNeverShowAssignmentSplashPref().get()) {
            fragmentNewInstance = EarlyAssignmentSplashFragment.INSTANCE.newInstance();
        } else {
            fragmentNewInstance = EarlyAssignmentActionFragment.INSTANCE.newInstance(withInitialOptionInstrumentContext.getOptionInstrument().getContractType(), optionExerciseParentFragment.getDuxo().getStatesFlow().getValue().isUk());
        }
        optionExerciseParentFragment.replaceFragmentNoAnimation(fragmentNewInstance);
        return Unit.INSTANCE;
    }

    private final void startOptionExerciseFlow() {
        withInitialOptionInstrumentContext(new Function1() { // from class: com.robinhood.android.optionsexercise.OptionExerciseParentFragment$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionExerciseParentFragment.startOptionExerciseFlow$lambda$11(this.f$0, (OptionInstrumentContext) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startOptionExerciseFlow$lambda$11(OptionExerciseParentFragment optionExerciseParentFragment, OptionInstrumentContext withInitialOptionInstrumentContext) {
        Fragment fragmentNewInstance;
        Intrinsics.checkNotNullParameter(withInitialOptionInstrumentContext, "$this$withInitialOptionInstrumentContext");
        if (!optionExerciseParentFragment.getNeverShowExerciseSplashPref().get()) {
            fragmentNewInstance = OptionExerciseSplashFragment.INSTANCE.newInstance(withInitialOptionInstrumentContext.getOptionInstrument().getContractType(), optionExerciseParentFragment.getDuxo().getStatesFlow().getValue().isInEtfRegionGate());
        } else {
            fragmentNewInstance = OptionExerciseReasonFragment.INSTANCE.newInstance(withInitialOptionInstrumentContext.getOptionInstrument(), optionExerciseParentFragment.getDuxo().getStatesFlow().getValue().isInEtfRegionGate());
        }
        optionExerciseParentFragment.replaceFragmentNoAnimation(fragmentNewInstance);
        return Unit.INSTANCE;
    }

    private final void startWarningFlow() {
        withEducationContext(new Function1() { // from class: com.robinhood.android.optionsexercise.OptionExerciseParentFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionExerciseParentFragment.startWarningFlow$lambda$12(this.f$0, (OptionExerciseEducationContext) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startWarningFlow$lambda$12(OptionExerciseParentFragment optionExerciseParentFragment, OptionExerciseEducationContext withEducationContext) {
        Intrinsics.checkNotNullParameter(withEducationContext, "$this$withEducationContext");
        int i = WhenMappings.$EnumSwitchMapping$3[withEducationContext.getShowOtmWarning().ordinal()];
        if (i == 1 || i == 2) {
            optionExerciseParentFragment.replaceFragment(OptionExerciseWarningFragment.INSTANCE.newInstance(withEducationContext, OptionExerciseWarningFragment.Mode.OTM));
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            optionExerciseParentFragment.onContinueWarning(OptionExerciseWarningFragment.Mode.OTM);
        }
        return Unit.INSTANCE;
    }

    private final void withEducationContext(Function1<? super OptionExerciseEducationContext, Unit> function) {
        OptionExerciseEducationContext educationContext = getEducationContext();
        if (educationContext != null) {
            function.invoke(educationContext);
        } else {
            startMarketDataErrorFragment();
        }
    }

    private final void withInitialOptionInstrumentContext(Function1<? super OptionInstrumentContext, Unit> function) {
        OptionInstrumentContext initialOptionInstrumentContext = getInitialOptionInstrumentContext();
        if (initialOptionInstrumentContext != null) {
            function.invoke(initialOptionInstrumentContext);
        } else {
            startMarketDataErrorFragment();
        }
    }

    private final void withCustomAnimationForChild(int nextAnim, Function0<Unit> synchronousAnimation) {
        this.childNextAnim = Integer.valueOf(nextAnim);
        synchronousAnimation.invoke();
        this.childNextAnim = null;
    }

    private final void replaceFragmentNoAnimation(Fragment fragment) {
        new ReplaceFragmentBuilder(fragment).setUseDefaultAnimation(false).buildAndExecute(this);
    }

    private final void replaceFragmentAndClearBackstack(Fragment fragment) {
        withCustomAnimationForChild(C22231R.anim.frag_exit_left, new Function0() { // from class: com.robinhood.android.optionsexercise.OptionExerciseParentFragment$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionExerciseParentFragment.replaceFragmentAndClearBackstack$lambda$13(this.f$0);
            }
        });
        replaceFragment(fragment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit replaceFragmentAndClearBackstack$lambda$13(OptionExerciseParentFragment optionExerciseParentFragment) {
        optionExerciseParentFragment.getChildFragmentManager().popBackStackImmediate((String) null, 1);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        if (getChildFragmentManager().getBackStackEntryCount() <= 1) {
            requireActivity().finish();
            return true;
        }
        return super.onBackPressed();
    }

    /* compiled from: OptionExerciseParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0015R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/OptionExerciseParentFragment$Args;", "Landroid/os/Parcelable;", "accountNumber", "", "initialOptionInstrumentId", "Ljava/util/UUID;", "fromEarlyAssignment", "", "<init>", "(Ljava/lang/String;Ljava/util/UUID;Z)V", "getAccountNumber", "()Ljava/lang/String;", "getInitialOptionInstrumentId", "()Ljava/util/UUID;", "getFromEarlyAssignment", "()Z", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String accountNumber;
        private final boolean fromEarlyAssignment;
        private final UUID initialOptionInstrumentId;

        /* compiled from: OptionExerciseParentFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readString(), (UUID) parcel.readSerializable(), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, String str, UUID uuid, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.accountNumber;
            }
            if ((i & 2) != 0) {
                uuid = args.initialOptionInstrumentId;
            }
            if ((i & 4) != 0) {
                z = args.fromEarlyAssignment;
            }
            return args.copy(str, uuid, z);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getInitialOptionInstrumentId() {
            return this.initialOptionInstrumentId;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getFromEarlyAssignment() {
            return this.fromEarlyAssignment;
        }

        public final Args copy(String accountNumber, UUID initialOptionInstrumentId, boolean fromEarlyAssignment) {
            Intrinsics.checkNotNullParameter(initialOptionInstrumentId, "initialOptionInstrumentId");
            return new Args(accountNumber, initialOptionInstrumentId, fromEarlyAssignment);
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
            return Intrinsics.areEqual(this.accountNumber, args.accountNumber) && Intrinsics.areEqual(this.initialOptionInstrumentId, args.initialOptionInstrumentId) && this.fromEarlyAssignment == args.fromEarlyAssignment;
        }

        public int hashCode() {
            String str = this.accountNumber;
            return ((((str == null ? 0 : str.hashCode()) * 31) + this.initialOptionInstrumentId.hashCode()) * 31) + Boolean.hashCode(this.fromEarlyAssignment);
        }

        public String toString() {
            return "Args(accountNumber=" + this.accountNumber + ", initialOptionInstrumentId=" + this.initialOptionInstrumentId + ", fromEarlyAssignment=" + this.fromEarlyAssignment + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.accountNumber);
            dest.writeSerializable(this.initialOptionInstrumentId);
            dest.writeInt(this.fromEarlyAssignment ? 1 : 0);
        }

        public Args(String str, UUID initialOptionInstrumentId, boolean z) {
            Intrinsics.checkNotNullParameter(initialOptionInstrumentId, "initialOptionInstrumentId");
            this.accountNumber = str;
            this.initialOptionInstrumentId = initialOptionInstrumentId;
            this.fromEarlyAssignment = z;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final UUID getInitialOptionInstrumentId() {
            return this.initialOptionInstrumentId;
        }

        public final boolean getFromEarlyAssignment() {
            return this.fromEarlyAssignment;
        }
    }

    /* compiled from: OptionExerciseParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/OptionExerciseParentFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/optionsexercise/OptionExerciseParentFragment;", "Lcom/robinhood/android/optionsexercise/OptionExerciseParentFragment$Args;", "<init>", "()V", "REQUEST_CODE_EQUITY_ORDER", "", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<OptionExerciseParentFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(OptionExerciseParentFragment optionExerciseParentFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, optionExerciseParentFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public OptionExerciseParentFragment newInstance(Args args) {
            return (OptionExerciseParentFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(OptionExerciseParentFragment optionExerciseParentFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, optionExerciseParentFragment, args);
        }
    }
}
