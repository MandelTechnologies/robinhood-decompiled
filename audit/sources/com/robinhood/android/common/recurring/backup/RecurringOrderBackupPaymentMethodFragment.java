package com.robinhood.android.common.recurring.backup;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.recurring.C11595R;
import com.robinhood.android.common.recurring.databinding.FragmentRecurringOrderBackupPaymentMethodBinding;
import com.robinhood.android.common.recurring.extension.AchRelationships2;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.extensions.Contexts7;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.designsystem.selectioncontrol.LegacyRdsRadioButton;
import com.robinhood.android.designsystem.selectioncontrol.LegacyRdsRadioGroup;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.linking.MobileLinkingDeeplinkConstants;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.transfers.contracts.CreateIavRelationshipIntentKey;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.annotation.ShowDropFromRecurringCreationSurvey;
import com.robinhood.recurring.models.p365db.InvestmentSchedule;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import com.robinhood.rosetta.eventlogging.RecurringContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.shared.transfers.contracts.context.IavSource;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlin.sequences.SequencesKt;

/* compiled from: RecurringOrderBackupPaymentMethodFragment.kt */
@Metadata(m3635d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 Z2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002YZB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u00101\u001a\u000202H\u0016J\u0010\u00103\u001a\u0002022\u0006\u00104\u001a\u000205H\u0016J\u001a\u00106\u001a\u0002022\u0006\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010:H\u0016J\b\u0010;\u001a\u000202H\u0016J\u0010\u0010<\u001a\u0002022\u0006\u0010=\u001a\u00020>H\u0002J \u0010?\u001a\u0002022\f\u0010@\u001a\b\u0012\u0004\u0012\u00020B0A2\b\u0010C\u001a\u0004\u0018\u00010BH\u0002J\u0018\u0010D\u001a\u0002022\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020HH\u0016J\u001a\u0010I\u001a\u00020$2\u0006\u0010J\u001a\u00020H2\b\u0010K\u001a\u0004\u0018\u00010:H\u0016J\u001a\u0010L\u001a\u00020$2\u0006\u0010J\u001a\u00020H2\b\u0010K\u001a\u0004\u0018\u00010:H\u0016J\b\u0010M\u001a\u00020$H\u0016J\"\u0010N\u001a\u0002022\u0006\u0010O\u001a\u00020H2\u0006\u0010P\u001a\u00020H2\b\u0010Q\u001a\u0004\u0018\u00010RH\u0016J\b\u0010S\u001a\u000202H\u0002J\u0010\u0010T\u001a\u0002022\u0006\u0010=\u001a\u00020>H\u0002J\u0010\u0010U\u001a\u0002022\u0006\u00104\u001a\u00020VH\u0002J\u0010\u0010W\u001a\u0002022\u0006\u00104\u001a\u00020VH\u0002J\u0010\u0010X\u001a\u0002022\u0006\u00104\u001a\u00020VH\u0002R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001e\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0017\u001a\u0004\b \u0010!R\u001b\u0010#\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u001d\u001a\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010&R\u001b\u0010-\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\u001d\u001a\u0004\b-\u0010&R\u0014\u0010/\u001a\u00020$X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b0\u0010&¨\u0006["}, m3636d2 = {"Lcom/robinhood/android/common/recurring/backup/RecurringOrderBackupPaymentMethodFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/common/ui/RhDialogFragment$OnClickListener;", "Lcom/robinhood/android/designsystem/selectioncontrol/LegacyRdsRadioGroup$OnCheckedChangeListener;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "showDropFromRecurringCreationSurvey", "Lcom/robinhood/prefs/BooleanPreference;", "getShowDropFromRecurringCreationSurvey", "()Lcom/robinhood/prefs/BooleanPreference;", "setShowDropFromRecurringCreationSurvey", "(Lcom/robinhood/prefs/BooleanPreference;)V", "binding", "Lcom/robinhood/android/common/recurring/databinding/FragmentRecurringOrderBackupPaymentMethodBinding;", "getBinding", "()Lcom/robinhood/android/common/recurring/databinding/FragmentRecurringOrderBackupPaymentMethodBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/common/recurring/backup/RecurringOrderBackupPaymentMethodDuxo;", "getDuxo", "()Lcom/robinhood/android/common/recurring/backup/RecurringOrderBackupPaymentMethodDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/android/common/recurring/backup/RecurringOrderBackupPaymentMethodFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/common/recurring/backup/RecurringOrderBackupPaymentMethodFragment$Callbacks;", "callbacks$delegate", RecurringOrderBackupPaymentMethodFragment.ARG_FROM_INSIGHTS, "", "getFromInsights", "()Z", "fromInsights$delegate", "screenName", "", "getScreenName", "()Ljava/lang/String;", "isCrypto", "isCryptoOrder", "isCryptoOrder$delegate", "useDesignSystemToolbar", "getUseDesignSystemToolbar", "onStart", "", "onAttach", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "setViewState", "state", "Lcom/robinhood/android/common/recurring/backup/RecurringOrderBackupPaymentMethodViewState;", "bindRadioGroup", "relationships", "", "Lcom/robinhood/models/db/AchRelationship;", "selectedRelationship", "onCheckedChanged", MobileLinkingDeeplinkConstants.group_id_param, "Lcom/robinhood/android/designsystem/selectioncontrol/LegacyRdsRadioGroup;", "checkedId", "", "onPositiveButtonClicked", "id", "passthroughArgs", "onNegativeButtonClicked", "onBackPressed", "onActivityResult", "requestCode", "resultCode", WebsocketGatewayConstants.DATA_KEY, "Landroid/content/Intent;", "showErrorDialog", "showBackupPrompt", "logSkipTap", "Lcom/robinhood/rosetta/eventlogging/RecurringContext;", "logBackTap", "logContinueTap", "Callbacks", "Companion", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class RecurringOrderBackupPaymentMethodFragment extends BaseFragment implements RhDialogFragment.OnClickListener, LegacyRdsRadioGroup.OnCheckedChangeListener {
    private static final String ARG_FROM_INSIGHTS = "fromInsights";
    private static final String ARG_IS_CRYPTO = "isCrypto";
    public static final String ARG_LOGGING_SOURCE = "loggingSource";
    public static final String ARG_SCHEDULE = "schedule";
    private static final String ARG_SHOW_SKIP_BUTTON = "showSkipButton";
    private static final int REQUEST_CODE_IAV_FLOW = 2002;
    private static final String RESULT_EXTRA_ACH_RELATIONSHIP = "achRelationship";

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public EventLogger eventLogger;

    /* renamed from: fromInsights$delegate, reason: from kotlin metadata */
    private final Lazy fromInsights;

    /* renamed from: isCryptoOrder$delegate, reason: from kotlin metadata */
    private final Lazy isCryptoOrder;

    @ShowDropFromRecurringCreationSurvey
    public BooleanPreference showDropFromRecurringCreationSurvey;
    private final boolean useDesignSystemToolbar;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RecurringOrderBackupPaymentMethodFragment.class, "binding", "getBinding()Lcom/robinhood/android/common/recurring/databinding/FragmentRecurringOrderBackupPaymentMethodBinding;", 0)), Reflection.property1(new PropertyReference1Impl(RecurringOrderBackupPaymentMethodFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/common/recurring/backup/RecurringOrderBackupPaymentMethodFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public RecurringOrderBackupPaymentMethodFragment() {
        super(C11595R.layout.fragment_recurring_order_backup_payment_method);
        this.binding = ViewBinding5.viewBinding(this, RecurringOrderBackupPaymentMethodFragment2.INSTANCE);
        this.duxo = OldDuxos.oldDuxo(this, RecurringOrderBackupPaymentMethodDuxo.class);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.common.recurring.backup.RecurringOrderBackupPaymentMethodFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
        this.fromInsights = Fragments2.argument(this, ARG_FROM_INSIGHTS);
        this.isCryptoOrder = Fragments2.argument(this, "isCrypto");
        this.useDesignSystemToolbar = true;
    }

    /* compiled from: RecurringOrderBackupPaymentMethodFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/backup/RecurringOrderBackupPaymentMethodFragment$Callbacks;", "", "onBackupPaymentMethodSelectionComplete", "", "backupAchRelationshipId", "Ljava/util/UUID;", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onBackupPaymentMethodSelectionComplete(UUID backupAchRelationshipId);

        /* compiled from: RecurringOrderBackupPaymentMethodFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class DefaultImpls {
            public static /* synthetic */ void onBackupPaymentMethodSelectionComplete$default(Callbacks callbacks, UUID uuid, int i, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onBackupPaymentMethodSelectionComplete");
                }
                if ((i & 1) != 0) {
                    uuid = null;
                }
                callbacks.onBackupPaymentMethodSelectionComplete(uuid);
            }
        }
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

    public final BooleanPreference getShowDropFromRecurringCreationSurvey() {
        BooleanPreference booleanPreference = this.showDropFromRecurringCreationSurvey;
        if (booleanPreference != null) {
            return booleanPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("showDropFromRecurringCreationSurvey");
        return null;
    }

    public final void setShowDropFromRecurringCreationSurvey(BooleanPreference booleanPreference) {
        Intrinsics.checkNotNullParameter(booleanPreference, "<set-?>");
        this.showDropFromRecurringCreationSurvey = booleanPreference;
    }

    private final FragmentRecurringOrderBackupPaymentMethodBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentRecurringOrderBackupPaymentMethodBinding) value;
    }

    private final RecurringOrderBackupPaymentMethodDuxo getDuxo() {
        return (RecurringOrderBackupPaymentMethodDuxo) this.duxo.getValue();
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    private final boolean getFromInsights() {
        return ((Boolean) this.fromInsights.getValue()).booleanValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenName() {
        return Screen.Name.RECURRING_BACKUP_PAYMENT_METHOD.toString();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    /* renamed from: isCrypto */
    public boolean get_isCrypto() {
        return isCryptoOrder();
    }

    private final boolean isCryptoOrder() {
        return ((Boolean) this.isCryptoOrder.getValue()).booleanValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Observable<RecurringOrderBackupPaymentMethodViewState> observableDistinctUntilChanged = getDuxo().getStates().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C116711(this));
    }

    /* compiled from: RecurringOrderBackupPaymentMethodFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.recurring.backup.RecurringOrderBackupPaymentMethodFragment$onStart$1 */
    /* synthetic */ class C116711 extends FunctionReferenceImpl implements Function1<RecurringOrderBackupPaymentMethodViewState, Unit> {
        C116711(Object obj) {
            super(1, obj, RecurringOrderBackupPaymentMethodFragment.class, "setViewState", "setViewState(Lcom/robinhood/android/common/recurring/backup/RecurringOrderBackupPaymentMethodViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RecurringOrderBackupPaymentMethodViewState recurringOrderBackupPaymentMethodViewState) {
            invoke2(recurringOrderBackupPaymentMethodViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(RecurringOrderBackupPaymentMethodViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((RecurringOrderBackupPaymentMethodFragment) this.receiver).setViewState(p0);
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        if (getFromInsights()) {
            final ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
            ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(scarletContextWrapper), AchromaticOverlay.INSTANCE, null, 2, null);
            putDesignSystemOverlay(scarletContextWrapper);
            LifecycleHost.DefaultImpls.bind$default(this, Contexts7.requireBaseActivityBaseContext(scarletContextWrapper).getDayNightStyleChanges(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.recurring.backup.RecurringOrderBackupPaymentMethodFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RecurringOrderBackupPaymentMethodFragment.onAttach$lambda$1$lambda$0(scarletContextWrapper, (DayNightOverlay) obj);
                }
            });
            setScarletContextWrapper(scarletContextWrapper);
            return;
        }
        ScarletContextWrapper scarletContextWrapper2 = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper2);
        putAchromaticOverlay(scarletContextWrapper2);
        setScarletContextWrapper(scarletContextWrapper2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttach$lambda$1$lambda$0(ScarletContextWrapper scarletContextWrapper, DayNightOverlay dayNightOverlay) {
        Intrinsics.checkNotNullParameter(dayNightOverlay, "dayNightOverlay");
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(scarletContextWrapper), dayNightOverlay, null, 2, null);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        RdsRowView backupPaymentMethodAddAccount = getBinding().backupPaymentMethodAddAccount;
        Intrinsics.checkNotNullExpressionValue(backupPaymentMethodAddAccount, "backupPaymentMethodAddAccount");
        OnClickListeners.onClick(backupPaymentMethodAddAccount, new Function0() { // from class: com.robinhood.android.common.recurring.backup.RecurringOrderBackupPaymentMethodFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RecurringOrderBackupPaymentMethodFragment.onViewCreated$lambda$3(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3(RecurringOrderBackupPaymentMethodFragment recurringOrderBackupPaymentMethodFragment) {
        Navigator.DefaultImpls.startActivityForResult$default(recurringOrderBackupPaymentMethodFragment.getNavigator(), (Fragment) recurringOrderBackupPaymentMethodFragment, (IntentKey) new CreateIavRelationshipIntentKey(IavSource.RECURRING, null, null, null, false, false, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null), REQUEST_CODE_IAV_FLOW, (PerformanceMetricEventData.Source) null, false, (Function1) null, (NavigationType) null, 120, (Object) null);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (getShowDropFromRecurringCreationSurvey().get()) {
            getShowDropFromRecurringCreationSurvey().set(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setViewState(final RecurringOrderBackupPaymentMethodViewState state) {
        RhTextView rhTextView = getBinding().backupPaymentMethodTitleText;
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        rhTextView.setText(state.titleText(resources));
        getBinding().sourceOfFundsSelectedBtn.setEnabled(state.getSourceOfFundsSelectedBtnEnabled());
        RhTextView sourceOfFundsDisclaimerTxt = getBinding().sourceOfFundsDisclaimerTxt;
        Intrinsics.checkNotNullExpressionValue(sourceOfFundsDisclaimerTxt, "sourceOfFundsDisclaimerTxt");
        Resources resources2 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        TextViewsKt.setVisibilityText(sourceOfFundsDisclaimerTxt, state.getSourceOfFundsDisclaimerVisibilityText(resources2, isCryptoOrder()));
        bindRadioGroup(state.getAchRelationships(), state.getSelectedRelationship());
        UiEvent<Unit> scheduleUpdatedEvent = state.getScheduleUpdatedEvent();
        if (scheduleUpdatedEvent != null && scheduleUpdatedEvent.consume() != null) {
            Callbacks callbacks = getCallbacks();
            AchRelationship selectedRelationship = state.getSelectedRelationship();
            callbacks.onBackupPaymentMethodSelectionComplete(selectedRelationship != null ? selectedRelationship.getId() : null);
        }
        UiEvent<Unit> applyBackupPromptEvent = state.getApplyBackupPromptEvent();
        if (applyBackupPromptEvent != null && applyBackupPromptEvent.consume() != null) {
            showBackupPrompt(state);
        }
        UiEvent<Throwable> scheduleUpdatedErrorEvent = state.getScheduleUpdatedErrorEvent();
        if (scheduleUpdatedErrorEvent != null && scheduleUpdatedErrorEvent.consume() != null) {
            showErrorDialog();
        }
        RdsButton sourceOfFundsSelectedBtn = getBinding().sourceOfFundsSelectedBtn;
        Intrinsics.checkNotNullExpressionValue(sourceOfFundsSelectedBtn, "sourceOfFundsSelectedBtn");
        OnClickListeners.onClick(sourceOfFundsSelectedBtn, new Function0() { // from class: com.robinhood.android.common.recurring.backup.RecurringOrderBackupPaymentMethodFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RecurringOrderBackupPaymentMethodFragment.setViewState$lambda$7(this.f$0, state);
            }
        });
        RdsButton rdsButton = getBinding().sourceOfFundsSkipBtn;
        Intrinsics.checkNotNull(rdsButton);
        Resources resources3 = rdsButton.getResources();
        Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
        TextViewsKt.setVisibilityText(rdsButton, state.secondaryCtaText(resources3));
        OnClickListeners.onClick(rdsButton, new Function0() { // from class: com.robinhood.android.common.recurring.backup.RecurringOrderBackupPaymentMethodFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RecurringOrderBackupPaymentMethodFragment.setViewState$lambda$9$lambda$8(this.f$0, state);
            }
        });
        UiEvent<Unit> backupPaymentRemovedEvent = state.getBackupPaymentRemovedEvent();
        if (backupPaymentRemovedEvent == null || backupPaymentRemovedEvent.consume() == null) {
            return;
        }
        getCallbacks().onBackupPaymentMethodSelectionComplete(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setViewState$lambda$7(RecurringOrderBackupPaymentMethodFragment recurringOrderBackupPaymentMethodFragment, RecurringOrderBackupPaymentMethodViewState recurringOrderBackupPaymentMethodViewState) {
        recurringOrderBackupPaymentMethodFragment.logContinueTap(recurringOrderBackupPaymentMethodViewState.getLoggingContext());
        recurringOrderBackupPaymentMethodFragment.getDuxo().updateInvestmentSchedule();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setViewState$lambda$9$lambda$8(RecurringOrderBackupPaymentMethodFragment recurringOrderBackupPaymentMethodFragment, RecurringOrderBackupPaymentMethodViewState recurringOrderBackupPaymentMethodViewState) {
        recurringOrderBackupPaymentMethodFragment.logSkipTap(recurringOrderBackupPaymentMethodViewState.getLoggingContext());
        if (recurringOrderBackupPaymentMethodViewState.getIsEditing()) {
            recurringOrderBackupPaymentMethodFragment.getDuxo().removeBackupRelationship();
        } else {
            recurringOrderBackupPaymentMethodFragment.getCallbacks().onBackupPaymentMethodSelectionComplete(null);
        }
        return Unit.INSTANCE;
    }

    private final void bindRadioGroup(List<AchRelationship> relationships, AchRelationship selectedRelationship) {
        getBinding().backupPaymentMethodRadioGroup.removeAllViews();
        getBinding().backupPaymentMethodRadioGroup.setOnCheckedChangeListener(null);
        final UUID id = selectedRelationship != null ? selectedRelationship.getId() : null;
        Iterator itIterator2 = SequencesKt.map(CollectionsKt.asSequence(relationships), new Function1() { // from class: com.robinhood.android.common.recurring.backup.RecurringOrderBackupPaymentMethodFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderBackupPaymentMethodFragment.bindRadioGroup$lambda$12(this.f$0, id, (AchRelationship) obj);
            }
        }).iterator2();
        while (itIterator2.hasNext()) {
            getBinding().backupPaymentMethodRadioGroup.addView((LegacyRdsRadioButton) itIterator2.next());
        }
        getBinding().backupPaymentMethodRadioGroup.setOnCheckedChangeListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LegacyRdsRadioButton bindRadioGroup$lambda$12(RecurringOrderBackupPaymentMethodFragment recurringOrderBackupPaymentMethodFragment, UUID uuid, AchRelationship achRelationship) {
        Intrinsics.checkNotNullParameter(achRelationship, "achRelationship");
        LegacyRdsRadioButton.Companion companion = LegacyRdsRadioButton.INSTANCE;
        LegacyRdsRadioGroup backupPaymentMethodRadioGroup = recurringOrderBackupPaymentMethodFragment.getBinding().backupPaymentMethodRadioGroup;
        Intrinsics.checkNotNullExpressionValue(backupPaymentMethodRadioGroup, "backupPaymentMethodRadioGroup");
        LegacyRdsRadioButton legacyRdsRadioButtonInflate = companion.inflate((ViewGroup) backupPaymentMethodRadioGroup);
        legacyRdsRadioButtonInflate.setId(View.generateViewId());
        legacyRdsRadioButtonInflate.setPrimaryText(achRelationship.getBankAccountNickname());
        Resources resources = legacyRdsRadioButtonInflate.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        legacyRdsRadioButtonInflate.setSecondaryText(AchRelationships2.getAccountString(achRelationship, resources));
        legacyRdsRadioButtonInflate.setTag(C11595R.id.tag_ach_relationship_id, achRelationship);
        legacyRdsRadioButtonInflate.setChecked(Intrinsics.areEqual(uuid, achRelationship.getId()));
        return legacyRdsRadioButtonInflate;
    }

    @Override // com.robinhood.android.designsystem.selectioncontrol.LegacyRdsRadioGroup.OnCheckedChangeListener
    public void onCheckedChanged(LegacyRdsRadioGroup group, int checkedId) {
        Intrinsics.checkNotNullParameter(group, "group");
        Object tag = ((LegacyRdsRadioButton) group.findViewById(checkedId)).getTag(C11595R.id.tag_ach_relationship_id);
        getDuxo().setSelectedRelationship(tag instanceof AchRelationship ? (AchRelationship) tag : null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C11595R.id.dialog_id_backup_payment_apply_to_all_alert) {
            getDuxo().applyBackupToOtherSchedules();
            return true;
        }
        if (id == C11595R.id.dialog_id_backup_payment_apply_to_all_error_alert) {
            Callbacks.DefaultImpls.onBackupPaymentMethodSelectionComplete$default(getCallbacks(), null, 1, null);
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onNegativeButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C11595R.id.dialog_id_backup_payment_apply_to_all_alert) {
            Callbacks.DefaultImpls.onBackupPaymentMethodSelectionComplete$default(getCallbacks(), null, 1, null);
            return true;
        }
        return super.onNegativeButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        Observable<R> map = getDuxo().getStates().take(1L).map(new Function() { // from class: com.robinhood.android.common.recurring.backup.RecurringOrderBackupPaymentMethodFragment.onBackPressed.1
            @Override // io.reactivex.functions.Function
            public final RecurringContext apply(RecurringOrderBackupPaymentMethodViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getLoggingContext();
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, map, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C116702(this));
        return super.onBackPressed();
    }

    /* compiled from: RecurringOrderBackupPaymentMethodFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.recurring.backup.RecurringOrderBackupPaymentMethodFragment$onBackPressed$2 */
    /* synthetic */ class C116702 extends FunctionReferenceImpl implements Function1<RecurringContext, Unit> {
        C116702(Object obj) {
            super(1, obj, RecurringOrderBackupPaymentMethodFragment.class, "logBackTap", "logBackTap(Lcom/robinhood/rosetta/eventlogging/RecurringContext;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RecurringContext recurringContext) {
            invoke2(recurringContext);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(RecurringContext p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((RecurringOrderBackupPaymentMethodFragment) this.receiver).logBackTap(p0);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE_IAV_FLOW && resultCode == -1) {
            AchRelationship achRelationship = data != null ? (AchRelationship) data.getParcelableExtra(RESULT_EXTRA_ACH_RELATIONSHIP) : null;
            if (achRelationship != null) {
                getDuxo().setSelectedRelationship(achRelationship);
            }
        }
    }

    private final void showErrorDialog() {
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        RhDialogFragment.Builder positiveButton = companion.create(fragmentActivityRequireActivity).setId(C11595R.id.dialog_id_backup_payment_apply_to_all_error_alert).setTheme(C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Negative).setImage(C11048R.drawable.svg_error_triangle).setImageTintThemeAttribute(C20690R.attr.colorNegative).setTitle(C11595R.string.recurring_backup_payment_apply_to_all_error_title, new Object[0]).setMessage(C11595R.string.recurring_backup_payment_apply_to_all_error_message, new Object[0]).setPositiveButton(C11048R.string.general_label_dismiss, new Object[0]);
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        RhDialogFragment.Builder.show$default(positiveButton, parentFragmentManager, "apply_backup_error_dialog", false, 4, null);
    }

    private final void showBackupPrompt(RecurringOrderBackupPaymentMethodViewState state) {
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        RhDialogFragment.Builder id = companion.create(fragmentActivityRequireActivity).setUseDesignSystemOverlay(true).setId(C11595R.id.dialog_id_backup_payment_apply_to_all_alert);
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        RhDialogFragment.Builder title = id.setTitle(state.promptTitle(resources));
        Resources resources2 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        RhDialogFragment.Builder negativeButton = title.setMessage(state.promptText(resources2)).setPositiveButton(C11595R.string.recurring_backup_payment_apply_to_all_prompt_positive, new Object[0]).setNegativeButton(C11048R.string.general_label_no_thanks, new Object[0]);
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        RhDialogFragment.Builder.show$default(negativeButton, parentFragmentManager, "apply_backup_prompt", false, 4, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void logSkipTap(RecurringContext context) {
        EventLogger eventLogger = getEventLogger();
        UserInteractionEventData.Action action = UserInteractionEventData.Action.SKIP;
        Screen screen = new Screen(Screen.Name.RECURRING_BACKUP_PAYMENT_METHOD, null, null, null, 14, null);
        Component.ComponentType componentType = Component.ComponentType.SKIP_BUTTON;
        Object[] objArr = 0 == true ? 1 : 0;
        EventLogger.DefaultImpls.logTap$default(eventLogger, action, screen, new Component(componentType, null, null, 6, null), null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, objArr, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, context, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8388609, -1, -1, -1, -1, -1, 16383, null), false, 40, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void logBackTap(RecurringContext context) {
        EventLogger eventLogger = getEventLogger();
        UserInteractionEventData.Action action = UserInteractionEventData.Action.BACK;
        Screen screen = new Screen(Screen.Name.RECURRING_BACKUP_PAYMENT_METHOD, null, null, null, 14, null);
        Component.ComponentType componentType = Component.ComponentType.BACK_BUTTON;
        Object[] objArr = 0 == true ? 1 : 0;
        EventLogger.DefaultImpls.logTap$default(eventLogger, action, screen, new Component(componentType, null, null, 6, null), null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, objArr, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, context, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8388609, -1, -1, -1, -1, -1, 16383, null), false, 40, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void logContinueTap(RecurringContext context) {
        EventLogger eventLogger = getEventLogger();
        UserInteractionEventData.Action action = UserInteractionEventData.Action.CONTINUE;
        Screen screen = new Screen(Screen.Name.RECURRING_BACKUP_PAYMENT_METHOD, null, null, null, 14, null);
        Component.ComponentType componentType = Component.ComponentType.CONTINUE_BUTTON;
        Object[] objArr = 0 == true ? 1 : 0;
        EventLogger.DefaultImpls.logTap$default(eventLogger, action, screen, new Component(componentType, null, null, 6, null), null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, objArr, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, context, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8388609, -1, -1, -1, -1, -1, 16383, null), false, 40, null);
    }

    /* compiled from: RecurringOrderBackupPaymentMethodFragment.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/backup/RecurringOrderBackupPaymentMethodFragment$Companion;", "", "<init>", "()V", "ARG_IS_CRYPTO", "", "ARG_SHOW_SKIP_BUTTON", "ARG_SCHEDULE", "ARG_LOGGING_SOURCE", "ARG_FROM_INSIGHTS", "REQUEST_CODE_IAV_FLOW", "", "RESULT_EXTRA_ACH_RELATIONSHIP", "newInstance", "Lcom/robinhood/android/common/recurring/backup/RecurringOrderBackupPaymentMethodFragment;", "isCrypto", "", RecurringOrderBackupPaymentMethodFragment.ARG_SHOW_SKIP_BUTTON, "schedule", "Lcom/robinhood/recurring/models/db/InvestmentSchedule;", "source", RecurringOrderBackupPaymentMethodFragment.ARG_FROM_INSIGHTS, "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ RecurringOrderBackupPaymentMethodFragment newInstance$default(Companion companion, boolean z, boolean z2, InvestmentSchedule investmentSchedule, String str, boolean z3, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            if ((i & 2) != 0) {
                z2 = true;
            }
            if ((i & 4) != 0) {
                investmentSchedule = null;
            }
            if ((i & 8) != 0) {
                str = "";
            }
            if ((i & 16) != 0) {
                z3 = false;
            }
            return companion.newInstance(z, z2, investmentSchedule, str, z3);
        }

        public final RecurringOrderBackupPaymentMethodFragment newInstance(boolean isCrypto, boolean showSkipButton, InvestmentSchedule schedule, String source, boolean fromInsights) {
            Intrinsics.checkNotNullParameter(source, "source");
            RecurringOrderBackupPaymentMethodFragment recurringOrderBackupPaymentMethodFragment = new RecurringOrderBackupPaymentMethodFragment();
            Bundle bundle = new Bundle();
            bundle.putBoolean("isCrypto", isCrypto);
            bundle.putBoolean(RecurringOrderBackupPaymentMethodFragment.ARG_SHOW_SKIP_BUTTON, showSkipButton);
            bundle.putParcelable("schedule", schedule);
            bundle.putString(RecurringOrderBackupPaymentMethodFragment.ARG_LOGGING_SOURCE, source);
            bundle.putBoolean(RecurringOrderBackupPaymentMethodFragment.ARG_FROM_INSIGHTS, fromInsights);
            recurringOrderBackupPaymentMethodFragment.setArguments(bundle);
            return recurringOrderBackupPaymentMethodFragment;
        }
    }
}
