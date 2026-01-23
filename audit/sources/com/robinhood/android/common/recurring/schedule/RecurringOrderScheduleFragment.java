package com.robinhood.android.common.recurring.schedule;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.recurring.C11595R;
import com.robinhood.android.common.recurring.RecurringDatePickerActivity;
import com.robinhood.android.common.recurring.databinding.FragmentRecurringScheduleBinding;
import com.robinhood.android.common.recurring.dialog.RecurringOrderDialogFragment;
import com.robinhood.android.common.recurring.schedule.RecurringOrderScheduleViewState;
import com.robinhood.android.common.recurring.trade.confirmation.RecurringOrderConfirmationFragment;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.extensions.Contexts7;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.selectioncontrol.LegacyRdsRadioButton;
import com.robinhood.android.designsystem.selectioncontrol.LegacyRdsRadioGroup;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.recurring.models.api.ApiAssetType;
import com.robinhood.recurring.models.api.ApiInvestmentSchedule;
import com.robinhood.recurring.models.p365db.InvestmentSchedule;
import com.robinhood.recurring.models.p365db.InvestmentTarget;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.RecurringContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.userleap.SurveyManager3;
import com.robinhood.userleap.survey.Survey;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.HttpUrl2;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.io.Serializable;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
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
import okhttp3.HttpUrl;
import p479j$.time.LocalDate;

/* compiled from: RecurringOrderScheduleFragment.kt */
@Metadata(m3635d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 a2\u00020\u0001:\u0003_`aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u000107H\u0016J\u001a\u00108\u001a\u00020&2\u0006\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u000107H\u0016J\u0010\u0010<\u001a\u0002032\u0006\u0010=\u001a\u00020>H\u0016J\b\u0010?\u001a\u000203H\u0016J\u0018\u0010@\u001a\u0002032\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020DH\u0014J\u0010\u0010E\u001a\u00020&2\u0006\u0010F\u001a\u00020\"H\u0016J\u0010\u0010G\u001a\u0002032\u0006\u0010H\u001a\u00020IH\u0016J\"\u0010J\u001a\u0002032\u0006\u0010K\u001a\u00020:2\u0006\u0010L\u001a\u00020:2\b\u0010M\u001a\u0004\u0018\u00010NH\u0016J\u0010\u0010O\u001a\u0002032\u0006\u0010P\u001a\u00020QH\u0002J\u0010\u0010R\u001a\u0002032\u0006\u0010P\u001a\u00020QH\u0002J\u0010\u0010S\u001a\u0002032\u0006\u0010P\u001a\u00020QH\u0002J\u0010\u0010T\u001a\u0002032\u0006\u0010P\u001a\u00020QH\u0002J\u0010\u0010U\u001a\u0002032\u0006\u0010V\u001a\u00020WH\u0002J\b\u0010X\u001a\u00020&H\u0016J\u0010\u0010Y\u001a\u0002032\u0006\u0010=\u001a\u00020ZH\u0002J\u0010\u0010[\u001a\u0002032\u0006\u0010=\u001a\u00020ZH\u0002J\u0010\u0010\\\u001a\u0002032\u0006\u0010=\u001a\u00020ZH\u0002J\u0010\u0010]\u001a\u0002032\u0006\u0010=\u001a\u00020ZH\u0002J\u0010\u0010^\u001a\u0002032\u0006\u0010=\u001a\u00020ZH\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0015\u001a\u0004\b\u001e\u0010\u001fR\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010'\u001a\u0004\u0018\u00010(X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010)\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020&8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010-R\u0014\u0010/\u001a\u00020&8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u0010-R\u0014\u00100\u001a\u00020&X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b1\u0010-¨\u0006b"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/schedule/RecurringOrderScheduleFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "getUserLeapManager", "()Lcom/robinhood/userleap/UserLeapManager;", "setUserLeapManager", "(Lcom/robinhood/userleap/UserLeapManager;)V", "callbacks", "Lcom/robinhood/android/common/recurring/schedule/RecurringOrderScheduleFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/common/recurring/schedule/RecurringOrderScheduleFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/common/recurring/schedule/RecurringOrderScheduleDuxo;", "getDuxo", "()Lcom/robinhood/android/common/recurring/schedule/RecurringOrderScheduleDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/common/recurring/databinding/FragmentRecurringScheduleBinding;", "getBinding", "()Lcom/robinhood/android/common/recurring/databinding/FragmentRecurringScheduleBinding;", "binding$delegate", "prospectusButton", "Landroid/view/MenuItem;", "prospectusUrl", "Lokhttp3/HttpUrl;", "isProspectusButtonVisible", "", "prospectusButtonTitle", "", "screenName", "getScreenName", "()Ljava/lang/String;", "isCrypto", "()Z", "isCryptoOrder", RecurringOrderConfirmationFragment.ARG_IS_BROKERAGE_CASH_TRANSFER, "useDesignSystemToolbar", "getUseDesignSystemToolbar", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onPositiveButtonClicked", "id", "", "passthroughArgs", "onAttach", "context", "Landroid/content/Context;", "onStart", "createOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onOptionsItemSelected", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onActivityResult", "requestCode", "resultCode", WebsocketGatewayConstants.DATA_KEY, "Landroid/content/Intent;", "setViewState", "viewState", "Lcom/robinhood/android/common/recurring/schedule/RecurringOrderScheduleViewState;", "setNextOrderDateVisibilities", "setPaycheckRowState", "setContinueButtonState", "showEditConfirmationDialog", "state", "Lcom/robinhood/android/common/recurring/schedule/RecurringOrderScheduleViewState$ContinueButtonState$ShowEditConfirmationDialog;", "onBackPressed", "logContinueTap", "Lcom/robinhood/rosetta/eventlogging/RecurringContext;", "logBackTap", "logCustomDateSelected", "logFrequencySelected", "logDatePickerTap", "Callbacks", "Args", "Companion", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class RecurringOrderScheduleFragment extends BaseFragment {
    private static final int REQUEST_CODE_DATE_PICKER = 2000;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public EventLogger eventLogger;
    private boolean isProspectusButtonVisible;
    private MenuItem prospectusButton;
    private String prospectusButtonTitle;
    private HttpUrl prospectusUrl;
    private final boolean useDesignSystemToolbar;
    public SurveyManager3 userLeapManager;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RecurringOrderScheduleFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/common/recurring/schedule/RecurringOrderScheduleFragment$Callbacks;", 0)), Reflection.property1(new PropertyReference1Impl(RecurringOrderScheduleFragment.class, "binding", "getBinding()Lcom/robinhood/android/common/recurring/databinding/FragmentRecurringScheduleBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: RecurringOrderScheduleFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/schedule/RecurringOrderScheduleFragment$Callbacks;", "", "j$/time/LocalDate", InquiryField.DateField.TYPE, "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "frequency", "", "onScheduleSelectionComplete", "(Lj$/time/LocalDate;Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;)V", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onScheduleSelectionComplete(LocalDate date, ApiInvestmentSchedule.Frequency frequency);
    }

    /* compiled from: RecurringOrderScheduleFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiInvestmentSchedule.Frequency.values().length];
            try {
                iArr[ApiInvestmentSchedule.Frequency.EVERY_PAYCHECK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiInvestmentSchedule.Frequency.DAILY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiInvestmentSchedule.Frequency.WEEKLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ApiInvestmentSchedule.Frequency.BIWEEKLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ApiInvestmentSchedule.Frequency.MONTHLY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public RecurringOrderScheduleFragment() {
        super(C11595R.layout.fragment_recurring_schedule);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.common.recurring.schedule.RecurringOrderScheduleFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
        this.duxo = OldDuxos.oldDuxo(this, RecurringOrderScheduleDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, RecurringOrderScheduleFragment2.INSTANCE);
        this.useDesignSystemToolbar = true;
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

    public final SurveyManager3 getUserLeapManager() {
        SurveyManager3 surveyManager3 = this.userLeapManager;
        if (surveyManager3 != null) {
            return surveyManager3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userLeapManager");
        return null;
    }

    public final void setUserLeapManager(SurveyManager3 surveyManager3) {
        Intrinsics.checkNotNullParameter(surveyManager3, "<set-?>");
        this.userLeapManager = surveyManager3;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RecurringOrderScheduleDuxo getDuxo() {
        return (RecurringOrderScheduleDuxo) this.duxo.getValue();
    }

    private final FragmentRecurringScheduleBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[1]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentRecurringScheduleBinding) value;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenName() {
        return Screen.Name.RECURRING_FREQUENCY.toString();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    /* renamed from: isCrypto */
    public boolean get_isCrypto() {
        return isCryptoOrder();
    }

    private final boolean isCryptoOrder() {
        return ((Args) INSTANCE.getArgs((Fragment) this)).getIsCrypto();
    }

    private final boolean isBrokerageCashTransfer() {
        return ((Args) INSTANCE.getArgs((Fragment) this)).getIsBrokerageCashTransfer();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        Args args = (Args) INSTANCE.getArgs((Fragment) this);
        getBinding().recurringScheduleSubtitleTxt.setText(args.getDatePrefixResId());
        getBinding().recurringScheduleDoneBtn.setText(args.getDoneButtonResId());
        getBinding().recurringScheduleTitleTxt.setText(args.getTitleStringResId());
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C11595R.id.dialog_id_recurring_schedule_edit) {
            getDuxo().updateInvestmentSchedule();
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        if (((Args) INSTANCE.getArgs((Fragment) this)).getFromInsights()) {
            final ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
            putDesignSystemOverlay(scarletContextWrapper);
            ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(scarletContextWrapper), AchromaticOverlay.INSTANCE, null, 2, null);
            LifecycleHost.DefaultImpls.bind$default(this, Contexts7.requireBaseActivityBaseContext(scarletContextWrapper).getDayNightStyleChanges(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.recurring.schedule.RecurringOrderScheduleFragment$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RecurringOrderScheduleFragment.onAttach$lambda$1$lambda$0(scarletContextWrapper, (DayNightOverlay) obj);
                }
            });
            setScarletContextWrapper(scarletContextWrapper);
        } else {
            ScarletContextWrapper scarletContextWrapper2 = new ScarletContextWrapper(context, null, null, 6, null);
            putDesignSystemOverlay(scarletContextWrapper2);
            putAchromaticOverlay(scarletContextWrapper2);
            setScarletContextWrapper(scarletContextWrapper2);
        }
        setHasOptionsMenu(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttach$lambda$1$lambda$0(ScarletContextWrapper scarletContextWrapper, DayNightOverlay dayNightOverlay) {
        Intrinsics.checkNotNullParameter(dayNightOverlay, "dayNightOverlay");
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(scarletContextWrapper), dayNightOverlay, null, 2, null);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C117111(this));
        Observable<RecurringOrderScheduleViewState> observableDistinctUntilChanged = getDuxo().getStates().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.recurring.schedule.RecurringOrderScheduleFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderScheduleFragment.onStart$lambda$3(this.f$0, (RecurringOrderScheduleViewState) obj);
            }
        });
        Observable observableDistinctUntilChanged2 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.common.recurring.schedule.RecurringOrderScheduleFragment.onStart.3
            @Override // io.reactivex.functions.Function
            public final Optional<ApiInvestmentSchedule.Frequency> apply(RecurringOrderScheduleViewState state) {
                Intrinsics.checkNotNullParameter(state, "state");
                return Optional3.asOptional(state.getFrequency());
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged2), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.recurring.schedule.RecurringOrderScheduleFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderScheduleFragment.onStart$lambda$4(this.f$0, (Optional) obj);
            }
        });
        Observable<RecurringOrderScheduleViewState> observableDistinctUntilChanged3 = getDuxo().getStates().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged3, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged3, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.recurring.schedule.RecurringOrderScheduleFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderScheduleFragment.onStart$lambda$6(this.f$0, (RecurringOrderScheduleViewState) obj);
            }
        });
    }

    /* compiled from: RecurringOrderScheduleFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.recurring.schedule.RecurringOrderScheduleFragment$onStart$1 */
    /* synthetic */ class C117111 extends FunctionReferenceImpl implements Function1<RecurringOrderScheduleViewState, Unit> {
        C117111(Object obj) {
            super(1, obj, RecurringOrderScheduleFragment.class, "setViewState", "setViewState(Lcom/robinhood/android/common/recurring/schedule/RecurringOrderScheduleViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RecurringOrderScheduleViewState recurringOrderScheduleViewState) {
            invoke2(recurringOrderScheduleViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(RecurringOrderScheduleViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((RecurringOrderScheduleFragment) this.receiver).setViewState(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$3(RecurringOrderScheduleFragment recurringOrderScheduleFragment, RecurringOrderScheduleViewState recurringOrderScheduleViewState) {
        Intrinsics.checkNotNull(recurringOrderScheduleViewState);
        recurringOrderScheduleFragment.setNextOrderDateVisibilities(recurringOrderScheduleViewState);
        recurringOrderScheduleFragment.setPaycheckRowState(recurringOrderScheduleViewState);
        recurringOrderScheduleFragment.setContinueButtonState(recurringOrderScheduleViewState);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$4(RecurringOrderScheduleFragment recurringOrderScheduleFragment, Optional optional) {
        LegacyRdsRadioButton legacyRdsRadioButton;
        ApiInvestmentSchedule.Frequency frequency = (ApiInvestmentSchedule.Frequency) optional.component1();
        int i = frequency == null ? -1 : WhenMappings.$EnumSwitchMapping$0[frequency.ordinal()];
        if (i == -1) {
            legacyRdsRadioButton = null;
        } else if (i == 1) {
            legacyRdsRadioButton = recurringOrderScheduleFragment.getBinding().recurringScheduleFrequencyPaycheckBtn;
        } else if (i == 2) {
            legacyRdsRadioButton = recurringOrderScheduleFragment.getBinding().recurringScheduleFrequencyDailyBtn;
        } else if (i == 3) {
            legacyRdsRadioButton = recurringOrderScheduleFragment.getBinding().recurringScheduleFrequencyWeeklyBtn;
        } else if (i == 4) {
            legacyRdsRadioButton = recurringOrderScheduleFragment.getBinding().recurringScheduleFrequencyBiweeklyBtn;
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            legacyRdsRadioButton = recurringOrderScheduleFragment.getBinding().recurringScheduleFrequencyMonthlyBtn;
        }
        if (legacyRdsRadioButton != null) {
            legacyRdsRadioButton.setChecked(true);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$6(final RecurringOrderScheduleFragment recurringOrderScheduleFragment, final RecurringOrderScheduleViewState recurringOrderScheduleViewState) {
        RhTextView recurringScheduleNextOrderDateTxt = recurringOrderScheduleFragment.getBinding().recurringScheduleNextOrderDateTxt;
        Intrinsics.checkNotNullExpressionValue(recurringScheduleNextOrderDateTxt, "recurringScheduleNextOrderDateTxt");
        OnClickListeners.onClick(recurringScheduleNextOrderDateTxt, new Function0() { // from class: com.robinhood.android.common.recurring.schedule.RecurringOrderScheduleFragment$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RecurringOrderScheduleFragment.onStart$lambda$6$lambda$5(this.f$0, recurringOrderScheduleViewState);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$6$lambda$5(RecurringOrderScheduleFragment recurringOrderScheduleFragment, RecurringOrderScheduleViewState recurringOrderScheduleViewState) {
        recurringOrderScheduleFragment.logDatePickerTap(recurringOrderScheduleViewState.getLoggingContext());
        RecurringDatePickerActivity.Companion companion = RecurringDatePickerActivity.INSTANCE;
        Context contextRequireContext = recurringOrderScheduleFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        recurringOrderScheduleFragment.startActivityForResult(companion.getIntent(contextRequireContext, recurringOrderScheduleViewState.getNextInvestmentDate(), recurringOrderScheduleFragment.isCryptoOrder()), 2000);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    protected void createOptionsMenu(Menu menu, MenuInflater inflater) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        super.createOptionsMenu(menu, inflater);
        inflater.inflate(C11595R.menu.menu_prospectus, menu);
        MenuItem menuItemFindItem = menu.findItem(C11595R.id.btn_prospectus);
        this.prospectusButton = menuItemFindItem;
        if (menuItemFindItem != null) {
            menuItemFindItem.setVisible(this.isProspectusButtonVisible);
            menuItemFindItem.setTitle(this.prospectusButtonTitle);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == C11595R.id.btn_prospectus) {
            HttpUrl httpUrl = this.prospectusUrl;
            startActivity(new Intent("android.intent.action.VIEW", httpUrl != null ? HttpUrl2.toAndroidUri(httpUrl) : null));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setElevation(0.0f);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 2000 && resultCode == -1 && data != null) {
            Serializable serializableExtra = data.getSerializableExtra(RecurringDatePickerActivity.ARG_SELECTED_DATE);
            Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type java.time.LocalDate");
            Observable<R> map = getDuxo().getStates().take(1L).map(new Function() { // from class: com.robinhood.android.common.recurring.schedule.RecurringOrderScheduleFragment.onActivityResult.1
                @Override // io.reactivex.functions.Function
                public final RecurringContext apply(RecurringOrderScheduleViewState it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return it.getLoggingContext();
                }
            });
            Intrinsics.checkNotNullExpressionValue(map, "map(...)");
            LifecycleHost.DefaultImpls.bind$default(this, map, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C117082(this));
            getDuxo().setUserSelectedStartDate((LocalDate) serializableExtra);
        }
    }

    /* compiled from: RecurringOrderScheduleFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.recurring.schedule.RecurringOrderScheduleFragment$onActivityResult$2 */
    /* synthetic */ class C117082 extends FunctionReferenceImpl implements Function1<RecurringContext, Unit> {
        C117082(Object obj) {
            super(1, obj, RecurringOrderScheduleFragment.class, "logCustomDateSelected", "logCustomDateSelected(Lcom/robinhood/rosetta/eventlogging/RecurringContext;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RecurringContext recurringContext) {
            invoke2(recurringContext);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(RecurringContext p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((RecurringOrderScheduleFragment) this.receiver).logCustomDateSelected(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setViewState(final RecurringOrderScheduleViewState viewState) {
        RecurringOrderScheduleViewState.UpdateInvestmentScheduleResult result = viewState.getResult();
        if (result != null && !Intrinsics.areEqual(result, RecurringOrderScheduleViewState.UpdateInvestmentScheduleResult.Loading.INSTANCE)) {
            if (result instanceof RecurringOrderScheduleViewState.UpdateInvestmentScheduleResult.Success) {
                RecurringOrderScheduleViewState.InvestmentScheduleUpdate investmentScheduleUpdateConsume = ((RecurringOrderScheduleViewState.UpdateInvestmentScheduleResult.Success) result).getEvent().consume();
                if (investmentScheduleUpdateConsume != null) {
                    getCallbacks().onScheduleSelectionComplete(investmentScheduleUpdateConsume.getDate(), investmentScheduleUpdateConsume.getFrequency());
                }
            } else {
                if (!(result instanceof RecurringOrderScheduleViewState.UpdateInvestmentScheduleResult.Failure)) {
                    throw new NoWhenBranchMatchedException();
                }
                Throwable thConsume = ((RecurringOrderScheduleViewState.UpdateInvestmentScheduleResult.Failure) result).getEvent().consume();
                if (thConsume != null) {
                    AbsErrorHandler.handleError$default(getActivityErrorHandler(), thConsume, false, 2, null);
                }
            }
        }
        LegacyRdsRadioButton legacyRdsRadioButton = getBinding().recurringScheduleFrequencyDailyBtn;
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        legacyRdsRadioButton.setPrimaryText(viewState.getDailyPrimaryText(resources));
        LegacyRdsRadioButton legacyRdsRadioButton2 = getBinding().recurringScheduleFrequencyDailyBtn;
        Resources resources2 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        legacyRdsRadioButton2.setSecondaryText(viewState.getDailySecondaryText(resources2));
        getBinding().recurringScheduleNextOrderDateTxt.setText(viewState.getFormattedNextInvestmentDate());
        RhTextView recurringScheduleDisclaimerTxt = getBinding().recurringScheduleDisclaimerTxt;
        Intrinsics.checkNotNullExpressionValue(recurringScheduleDisclaimerTxt, "recurringScheduleDisclaimerTxt");
        Resources resources3 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
        TextViewsKt.setVisibilityText(recurringScheduleDisclaimerTxt, viewState.getDisclaimerText(resources3));
        LegacyRdsRadioButton legacyRdsRadioButton3 = getBinding().recurringScheduleFrequencyWeeklyBtn;
        Resources resources4 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources4, "getResources(...)");
        legacyRdsRadioButton3.setSecondaryText(viewState.getWeeklySecondaryText(resources4));
        LegacyRdsRadioButton legacyRdsRadioButton4 = getBinding().recurringScheduleFrequencyBiweeklyBtn;
        Resources resources5 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources5, "getResources(...)");
        legacyRdsRadioButton4.setSecondaryText(viewState.getBiweeklySecondaryText(resources5));
        LegacyRdsRadioButton legacyRdsRadioButton5 = getBinding().recurringScheduleFrequencyMonthlyBtn;
        Resources resources6 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources6, "getResources(...)");
        legacyRdsRadioButton5.setSecondaryText(viewState.getMonthlySecondaryText(resources6));
        getBinding().recurringScheduleFrequencyRadioGroup.setOnCheckedChangeListener(new LegacyRdsRadioGroup.OnCheckedChangeListener() { // from class: com.robinhood.android.common.recurring.schedule.RecurringOrderScheduleFragment.setViewState.2
            @Override // com.robinhood.android.designsystem.selectioncontrol.LegacyRdsRadioGroup.OnCheckedChangeListener
            public void onCheckedChanged(LegacyRdsRadioGroup group, int checkedId) {
                ApiInvestmentSchedule.Frequency frequency;
                Intrinsics.checkNotNullParameter(group, "group");
                if (checkedId == C11595R.id.recurring_schedule_frequency_paycheck_btn) {
                    frequency = ApiInvestmentSchedule.Frequency.EVERY_PAYCHECK;
                } else if (checkedId == C11595R.id.recurring_schedule_frequency_daily_btn) {
                    frequency = ApiInvestmentSchedule.Frequency.DAILY;
                } else if (checkedId == C11595R.id.recurring_schedule_frequency_weekly_btn) {
                    frequency = ApiInvestmentSchedule.Frequency.WEEKLY;
                } else if (checkedId == C11595R.id.recurring_schedule_frequency_biweekly_btn) {
                    frequency = ApiInvestmentSchedule.Frequency.BIWEEKLY;
                } else if (checkedId == C11595R.id.recurring_schedule_frequency_monthly_btn) {
                    frequency = ApiInvestmentSchedule.Frequency.MONTHLY;
                } else {
                    if (checkedId != -1) {
                        throw new IllegalStateException("Unrecognized radio option");
                    }
                    frequency = null;
                }
                RecurringOrderScheduleFragment.this.getDuxo().setFrequency(frequency);
                RecurringOrderScheduleFragment.this.logFrequencySelected(viewState.getLoggingContext());
            }
        });
        this.prospectusUrl = viewState.getProspectusUrl();
        this.isProspectusButtonVisible = viewState.isProspectusActionVisible();
        Resources resources7 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources7, "getResources(...)");
        Companion companion = INSTANCE;
        this.prospectusButtonTitle = viewState.getProspectusTitle(resources7, ((Args) companion.getArgs((Fragment) this)).getInstrumentSymbol());
        MenuItem menuItem = this.prospectusButton;
        if (menuItem != null) {
            menuItem.setVisible(viewState.isProspectusActionVisible());
            Resources resources8 = getResources();
            Intrinsics.checkNotNullExpressionValue(resources8, "getResources(...)");
            menuItem.setTitle(viewState.getProspectusTitle(resources8, ((Args) companion.getArgs((Fragment) this)).getInstrumentSymbol()));
        }
    }

    private final void setNextOrderDateVisibilities(RecurringOrderScheduleViewState viewState) {
        FragmentRecurringScheduleBinding binding = getBinding();
        RhTextView recurringPaycheckScheduleNextOrderDateTxt = binding.recurringPaycheckScheduleNextOrderDateTxt;
        Intrinsics.checkNotNullExpressionValue(recurringPaycheckScheduleNextOrderDateTxt, "recurringPaycheckScheduleNextOrderDateTxt");
        recurringPaycheckScheduleNextOrderDateTxt.setVisibility(viewState.isPaycheckNextOrderDateVisible() ? 0 : 8);
        RhTextView recurringScheduleNextOrderDateTxt = binding.recurringScheduleNextOrderDateTxt;
        Intrinsics.checkNotNullExpressionValue(recurringScheduleNextOrderDateTxt, "recurringScheduleNextOrderDateTxt");
        recurringScheduleNextOrderDateTxt.setVisibility(viewState.isNextOrderDateVisible() ? 0 : 8);
    }

    private final void setPaycheckRowState(RecurringOrderScheduleViewState viewState) {
        FragmentRecurringScheduleBinding binding = getBinding();
        LegacyRdsRadioButton recurringScheduleFrequencyPaycheckBtn = binding.recurringScheduleFrequencyPaycheckBtn;
        Intrinsics.checkNotNullExpressionValue(recurringScheduleFrequencyPaycheckBtn, "recurringScheduleFrequencyPaycheckBtn");
        recurringScheduleFrequencyPaycheckBtn.setVisibility(viewState.isPaycheckFrequencyRowVisible() ? 0 : 8);
        View recurringScheduleFrequencyPaycheckDivider = binding.recurringScheduleFrequencyPaycheckDivider;
        Intrinsics.checkNotNullExpressionValue(recurringScheduleFrequencyPaycheckDivider, "recurringScheduleFrequencyPaycheckDivider");
        recurringScheduleFrequencyPaycheckDivider.setVisibility(viewState.isPaycheckFrequencyRowVisible() ? 0 : 8);
    }

    private final void setContinueButtonState(final RecurringOrderScheduleViewState viewState) {
        final RecurringOrderScheduleViewState.ContinueButtonState continueButtonState = viewState.getContinueButtonState();
        RdsButton rdsButton = getBinding().recurringScheduleDoneBtn;
        rdsButton.setEnabled(continueButtonState.isEnabled());
        rdsButton.setLoading(continueButtonState.isLoading());
        if (Intrinsics.areEqual(continueButtonState, RecurringOrderScheduleViewState.ContinueButtonState.Disabled.INSTANCE) || Intrinsics.areEqual(continueButtonState, RecurringOrderScheduleViewState.ContinueButtonState.Loading.INSTANCE)) {
            rdsButton.setOnClickListener(null);
            return;
        }
        if (continueButtonState instanceof RecurringOrderScheduleViewState.ContinueButtonState.Complete) {
            Intrinsics.checkNotNull(rdsButton);
            OnClickListeners.onClick(rdsButton, new Function0() { // from class: com.robinhood.android.common.recurring.schedule.RecurringOrderScheduleFragment$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RecurringOrderScheduleFragment.setContinueButtonState$lambda$17$lambda$15(this.f$0, viewState, continueButtonState);
                }
            });
        } else {
            if (!(continueButtonState instanceof RecurringOrderScheduleViewState.ContinueButtonState.ShowEditConfirmationDialog)) {
                throw new NoWhenBranchMatchedException();
            }
            Intrinsics.checkNotNull(rdsButton);
            OnClickListeners.onClick(rdsButton, new Function0() { // from class: com.robinhood.android.common.recurring.schedule.RecurringOrderScheduleFragment$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RecurringOrderScheduleFragment.setContinueButtonState$lambda$17$lambda$16(this.f$0, viewState, continueButtonState);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setContinueButtonState$lambda$17$lambda$15(RecurringOrderScheduleFragment recurringOrderScheduleFragment, RecurringOrderScheduleViewState recurringOrderScheduleViewState, RecurringOrderScheduleViewState.ContinueButtonState continueButtonState) {
        recurringOrderScheduleFragment.logContinueTap(recurringOrderScheduleViewState.getLoggingContext());
        RecurringOrderScheduleViewState.ContinueButtonState.Complete complete = (RecurringOrderScheduleViewState.ContinueButtonState.Complete) continueButtonState;
        recurringOrderScheduleFragment.getCallbacks().onScheduleSelectionComplete(complete.getDate(), complete.getFrequency());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setContinueButtonState$lambda$17$lambda$16(RecurringOrderScheduleFragment recurringOrderScheduleFragment, RecurringOrderScheduleViewState recurringOrderScheduleViewState, RecurringOrderScheduleViewState.ContinueButtonState continueButtonState) {
        recurringOrderScheduleFragment.logContinueTap(recurringOrderScheduleViewState.getLoggingContext());
        recurringOrderScheduleFragment.showEditConfirmationDialog((RecurringOrderScheduleViewState.ContinueButtonState.ShowEditConfirmationDialog) continueButtonState);
        return Unit.INSTANCE;
    }

    private final void showEditConfirmationDialog(RecurringOrderScheduleViewState.ContinueButtonState.ShowEditConfirmationDialog state) {
        RecurringOrderDialogFragment.Companion companion = RecurringOrderDialogFragment.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder title = companion.create(contextRequireContext, ((Args) INSTANCE.getArgs((Fragment) this)).getFromInsights(), isBrokerageCashTransfer()).setId(C11595R.id.dialog_id_recurring_schedule_edit).setTitle(C11595R.string.recurring_schedule_edit_title, new Object[0]);
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        RhDialogFragment.Builder negativeButton = title.setMessage(state.getMessage(resources)).setPositiveButton(C11048R.string.general_label_confirm, new Object[0]).setNegativeButton(C11048R.string.general_label_cancel, new Object[0]);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        RhDialogFragment.Builder.show$default(negativeButton, childFragmentManager, "alert", false, 4, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        Survey survey;
        Observable<R> map = getDuxo().getStates().take(1L).map(new Function() { // from class: com.robinhood.android.common.recurring.schedule.RecurringOrderScheduleFragment.onBackPressed.1
            @Override // io.reactivex.functions.Function
            public final RecurringContext apply(RecurringOrderScheduleViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getLoggingContext();
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, map, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C117102(this));
        if (isCryptoOrder()) {
            survey = Survey.RECURRING_INVESTMENTS_DROP_FROM_CREATION_CRYPTO;
        } else {
            survey = Survey.RECURRING_INVESTMENTS_DROP_FROM_CREATION_EQUITY;
        }
        getUserLeapManager().setPendingSurvey(survey);
        return super.onBackPressed();
    }

    /* compiled from: RecurringOrderScheduleFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.recurring.schedule.RecurringOrderScheduleFragment$onBackPressed$2 */
    /* synthetic */ class C117102 extends FunctionReferenceImpl implements Function1<RecurringContext, Unit> {
        C117102(Object obj) {
            super(1, obj, RecurringOrderScheduleFragment.class, "logBackTap", "logBackTap(Lcom/robinhood/rosetta/eventlogging/RecurringContext;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RecurringContext recurringContext) {
            invoke2(recurringContext);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(RecurringContext p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((RecurringOrderScheduleFragment) this.receiver).logBackTap(p0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void logContinueTap(RecurringContext context) {
        EventLogger eventLogger = getEventLogger();
        UserInteractionEventData.Action action = UserInteractionEventData.Action.CONTINUE;
        Screen screen = new Screen(Screen.Name.RECURRING_FREQUENCY, null, null, null, 14, null);
        Component.ComponentType componentType = Component.ComponentType.CONTINUE_BUTTON;
        Object[] objArr = 0 == true ? 1 : 0;
        EventLogger.DefaultImpls.logTap$default(eventLogger, action, screen, new Component(componentType, null, null, 6, null), null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, objArr, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, context, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8388609, -1, -1, -1, -1, -1, 16383, null), false, 40, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void logBackTap(RecurringContext context) {
        EventLogger eventLogger = getEventLogger();
        UserInteractionEventData.Action action = UserInteractionEventData.Action.BACK;
        Screen screen = new Screen(Screen.Name.RECURRING_FREQUENCY, null, null, null, 14, null);
        Component.ComponentType componentType = Component.ComponentType.BACK_BUTTON;
        Object[] objArr = 0 == true ? 1 : 0;
        EventLogger.DefaultImpls.logTap$default(eventLogger, action, screen, new Component(componentType, null, null, 6, null), null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, objArr, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, context, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8388609, -1, -1, -1, -1, -1, 16383, null), false, 40, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void logCustomDateSelected(RecurringContext context) {
        EventLogger eventLogger = getEventLogger();
        UserInteractionEventData.Action action = UserInteractionEventData.Action.SET_RECURRING_START_DATE;
        Screen screen = new Screen(Screen.Name.RECURRING_FREQUENCY, null, null, null, 14, null);
        Component.ComponentType componentType = Component.ComponentType.CALENDAR_DATE_PICKER;
        Object[] objArr = 0 == true ? 1 : 0;
        EventLogger.DefaultImpls.logTap$default(eventLogger, action, screen, new Component(componentType, null, null, 6, null), null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, objArr, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, context, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8388609, -1, -1, -1, -1, -1, 16383, null), false, 40, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void logFrequencySelected(RecurringContext context) {
        EventLogger eventLogger = getEventLogger();
        UserInteractionEventData.Action action = UserInteractionEventData.Action.SELECT_RECURRING_FREQUENCY;
        Screen screen = new Screen(Screen.Name.RECURRING_FREQUENCY, null, null, null, 14, null);
        Component.ComponentType componentType = Component.ComponentType.RECURRING_FREQUENCY_ROW;
        Object[] objArr = 0 == true ? 1 : 0;
        EventLogger.DefaultImpls.logTap$default(eventLogger, action, screen, new Component(componentType, null, null, 6, null), null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, objArr, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, context, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8388609, -1, -1, -1, -1, -1, 16383, null), false, 40, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void logDatePickerTap(RecurringContext context) {
        EventLogger eventLogger = getEventLogger();
        UserInteractionEventData.Action action = UserInteractionEventData.Action.EDIT_RECURRING_ORDER_DATE;
        Screen screen = new Screen(Screen.Name.RECURRING_FREQUENCY, null, null, null, 14, null);
        Component.ComponentType componentType = Component.ComponentType.BUTTON;
        Object[] objArr = 0 == true ? 1 : 0;
        EventLogger.DefaultImpls.logTap$default(eventLogger, action, screen, new Component(componentType, null, null, 6, null), null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, objArr, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, context, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8388609, -1, -1, -1, -1, -1, 16383, null), false, 40, null);
    }

    /* compiled from: RecurringOrderScheduleFragment.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\"#Bc\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0001\u0010\u000b\u001a\u00020\f\u0012\b\b\u0001\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\u000e\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0014\u0082\u0001\u0002$%¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/schedule/RecurringOrderScheduleFragment$Args;", "Landroid/os/Parcelable;", "isCrypto", "", RecurringOrderConfirmationFragment.ARG_IS_BROKERAGE_CASH_TRANSFER, "assetType", "Lcom/robinhood/recurring/models/api/ApiAssetType;", "instrumentId", "Ljava/util/UUID;", "instrumentSymbol", "", "titleStringResId", "", "doneButtonResId", "datePrefixResId", "scheduleMode", "Lcom/robinhood/android/common/recurring/schedule/RecurringOrderScheduleMode;", "fromInsights", "<init>", "(ZZLcom/robinhood/recurring/models/api/ApiAssetType;Ljava/util/UUID;Ljava/lang/String;IIILcom/robinhood/android/common/recurring/schedule/RecurringOrderScheduleMode;Z)V", "()Z", "getAssetType", "()Lcom/robinhood/recurring/models/api/ApiAssetType;", "getInstrumentId", "()Ljava/util/UUID;", "getInstrumentSymbol", "()Ljava/lang/String;", "getTitleStringResId", "()I", "getDoneButtonResId", "getDatePrefixResId", "getScheduleMode", "()Lcom/robinhood/android/common/recurring/schedule/RecurringOrderScheduleMode;", "getFromInsights", "Create", "Edit", "Lcom/robinhood/android/common/recurring/schedule/RecurringOrderScheduleFragment$Args$Create;", "Lcom/robinhood/android/common/recurring/schedule/RecurringOrderScheduleFragment$Args$Edit;", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class Args implements Parcelable {
        public static final int $stable = 8;
        private final ApiAssetType assetType;
        private final int datePrefixResId;
        private final int doneButtonResId;
        private final boolean fromInsights;
        private final UUID instrumentId;
        private final String instrumentSymbol;
        private final boolean isBrokerageCashTransfer;
        private final boolean isCrypto;
        private final RecurringOrderScheduleMode scheduleMode;
        private final int titleStringResId;

        public /* synthetic */ Args(boolean z, boolean z2, ApiAssetType apiAssetType, UUID uuid, String str, int i, int i2, int i3, RecurringOrderScheduleMode recurringOrderScheduleMode, boolean z3, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, z2, apiAssetType, uuid, str, i, i2, i3, recurringOrderScheduleMode, z3);
        }

        private Args(boolean z, boolean z2, ApiAssetType apiAssetType, UUID uuid, String str, int i, int i2, int i3, RecurringOrderScheduleMode recurringOrderScheduleMode, boolean z3) {
            this.isCrypto = z;
            this.isBrokerageCashTransfer = z2;
            this.assetType = apiAssetType;
            this.instrumentId = uuid;
            this.instrumentSymbol = str;
            this.titleStringResId = i;
            this.doneButtonResId = i2;
            this.datePrefixResId = i3;
            this.scheduleMode = recurringOrderScheduleMode;
            this.fromInsights = z3;
        }

        /* renamed from: isCrypto, reason: from getter */
        public boolean getIsCrypto() {
            return this.isCrypto;
        }

        /* renamed from: isBrokerageCashTransfer, reason: from getter */
        public final boolean getIsBrokerageCashTransfer() {
            return this.isBrokerageCashTransfer;
        }

        public final ApiAssetType getAssetType() {
            return this.assetType;
        }

        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        public final String getInstrumentSymbol() {
            return this.instrumentSymbol;
        }

        public final int getTitleStringResId() {
            return this.titleStringResId;
        }

        public final int getDoneButtonResId() {
            return this.doneButtonResId;
        }

        public final int getDatePrefixResId() {
            return this.datePrefixResId;
        }

        public final RecurringOrderScheduleMode getScheduleMode() {
            return this.scheduleMode;
        }

        public final boolean getFromInsights() {
            return this.fromInsights;
        }

        /* compiled from: RecurringOrderScheduleFragment.kt */
        @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0013\u001a\u00020\u0014J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/schedule/RecurringOrderScheduleFragment$Args$Create;", "Lcom/robinhood/android/common/recurring/schedule/RecurringOrderScheduleFragment$Args;", "isFromHook", "", "loggingReferrer", "", "loggingEntryPoint", "Lcom/robinhood/rosetta/eventlogging/RecurringContext$EntryPoint;", "investmentTarget", "Lcom/robinhood/recurring/models/db/InvestmentTarget;", "<init>", "(ZLjava/lang/String;Lcom/robinhood/rosetta/eventlogging/RecurringContext$EntryPoint;Lcom/robinhood/recurring/models/db/InvestmentTarget;)V", "()Z", "getLoggingReferrer", "()Ljava/lang/String;", "getLoggingEntryPoint", "()Lcom/robinhood/rosetta/eventlogging/RecurringContext$EntryPoint;", "getInvestmentTarget", "()Lcom/robinhood/recurring/models/db/InvestmentTarget;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Create extends Args {
            public static final int $stable = 8;
            public static final Parcelable.Creator<Create> CREATOR = new Creator();
            private final InvestmentTarget investmentTarget;
            private final boolean isFromHook;
            private final RecurringContext.EntryPoint loggingEntryPoint;
            private final String loggingReferrer;

            /* compiled from: RecurringOrderScheduleFragment.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<Create> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Create createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Create(parcel.readInt() != 0, parcel.readString(), RecurringContext.EntryPoint.valueOf(parcel.readString()), (InvestmentTarget) parcel.readParcelable(Create.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Create[] newArray(int i) {
                    return new Create[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.isFromHook ? 1 : 0);
                dest.writeString(this.loggingReferrer);
                dest.writeString(this.loggingEntryPoint.name());
                dest.writeParcelable(this.investmentTarget, flags);
            }

            /* renamed from: isFromHook, reason: from getter */
            public final boolean getIsFromHook() {
                return this.isFromHook;
            }

            public /* synthetic */ Create(boolean z, String str, RecurringContext.EntryPoint entryPoint, InvestmentTarget investmentTarget, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? RecurringContext.EntryPoint.ENTRY_POINT_UNSPECIFIED : entryPoint, investmentTarget);
            }

            public final String getLoggingReferrer() {
                return this.loggingReferrer;
            }

            public final RecurringContext.EntryPoint getLoggingEntryPoint() {
                return this.loggingEntryPoint;
            }

            public final InvestmentTarget getInvestmentTarget() {
                return this.investmentTarget;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Create(boolean z, String loggingReferrer, RecurringContext.EntryPoint loggingEntryPoint, InvestmentTarget investmentTarget) {
                super(investmentTarget.isCrypto(), investmentTarget.isBrokerageCashTransfer(), investmentTarget.getTargetType(), investmentTarget.getInstrumentId(), investmentTarget.getInstrumentSymbol(), C11595R.string.equity_recurring_schedule_create_title, C11048R.string.general_label_continue, C11595R.string.equity_recurring_schedule_create_subtitle, RecurringOrderScheduleMode.CREATE, false, null);
                Intrinsics.checkNotNullParameter(loggingReferrer, "loggingReferrer");
                Intrinsics.checkNotNullParameter(loggingEntryPoint, "loggingEntryPoint");
                Intrinsics.checkNotNullParameter(investmentTarget, "investmentTarget");
                this.isFromHook = z;
                this.loggingReferrer = loggingReferrer;
                this.loggingEntryPoint = loggingEntryPoint;
                this.investmentTarget = investmentTarget;
            }
        }

        /* compiled from: RecurringOrderScheduleFragment.kt */
        @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\t\u0010\u001dR\u0011\u0010!\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0011\u0010%\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0013\u0010)\u001a\u0004\u0018\u00010&8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u001d¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/schedule/RecurringOrderScheduleFragment$Args$Edit;", "Lcom/robinhood/android/common/recurring/schedule/RecurringOrderScheduleFragment$Args;", "Lcom/robinhood/recurring/models/db/InvestmentSchedule;", "investmentSchedule", "", "loggingReferrer", "Lcom/robinhood/rosetta/eventlogging/RecurringContext$EntryPoint;", "loggingEntryPoint", "", "isFromInsights", "<init>", "(Lcom/robinhood/recurring/models/db/InvestmentSchedule;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/RecurringContext$EntryPoint;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lcom/robinhood/recurring/models/db/InvestmentSchedule;", "Ljava/lang/String;", "getLoggingReferrer", "()Ljava/lang/String;", "Lcom/robinhood/rosetta/eventlogging/RecurringContext$EntryPoint;", "getLoggingEntryPoint", "()Lcom/robinhood/rosetta/eventlogging/RecurringContext$EntryPoint;", "Z", "()Z", "Ljava/util/UUID;", "getInvestmentScheduleId", "()Ljava/util/UUID;", "investmentScheduleId", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "getFrequency", "()Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "frequency", "j$/time/LocalDate", "getNextInvestmentDate", "()Lj$/time/LocalDate;", "nextInvestmentDate", "isCrypto", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Edit extends Args {
            public static final int $stable = 8;
            public static final Parcelable.Creator<Edit> CREATOR = new Creator();
            private final InvestmentSchedule investmentSchedule;
            private final boolean isFromInsights;
            private final RecurringContext.EntryPoint loggingEntryPoint;
            private final String loggingReferrer;

            /* compiled from: RecurringOrderScheduleFragment.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<Edit> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Edit createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Edit((InvestmentSchedule) parcel.readParcelable(Edit.class.getClassLoader()), parcel.readString(), RecurringContext.EntryPoint.valueOf(parcel.readString()), parcel.readInt() != 0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Edit[] newArray(int i) {
                    return new Edit[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.investmentSchedule, flags);
                dest.writeString(this.loggingReferrer);
                dest.writeString(this.loggingEntryPoint.name());
                dest.writeInt(this.isFromInsights ? 1 : 0);
            }

            public /* synthetic */ Edit(InvestmentSchedule investmentSchedule, String str, RecurringContext.EntryPoint entryPoint, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(investmentSchedule, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? RecurringContext.EntryPoint.ENTRY_POINT_UNSPECIFIED : entryPoint, (i & 8) != 0 ? false : z);
            }

            public final String getLoggingReferrer() {
                return this.loggingReferrer;
            }

            public final RecurringContext.EntryPoint getLoggingEntryPoint() {
                return this.loggingEntryPoint;
            }

            /* renamed from: isFromInsights, reason: from getter */
            public final boolean getIsFromInsights() {
                return this.isFromInsights;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Edit(InvestmentSchedule investmentSchedule, String loggingReferrer, RecurringContext.EntryPoint loggingEntryPoint, boolean z) {
                super(investmentSchedule.isCrypto(), investmentSchedule.isBrokerageCashTransfer(), investmentSchedule.getInvestmentTarget().getTargetType(), investmentSchedule.getId(), "", C11595R.string.equity_recurring_schedule_edit_title, C11048R.string.general_label_confirm, C11595R.string.equity_recurring_schedule_edit_subtitle, RecurringOrderScheduleMode.EDIT, z, null);
                Intrinsics.checkNotNullParameter(investmentSchedule, "investmentSchedule");
                Intrinsics.checkNotNullParameter(loggingReferrer, "loggingReferrer");
                Intrinsics.checkNotNullParameter(loggingEntryPoint, "loggingEntryPoint");
                this.investmentSchedule = investmentSchedule;
                this.loggingReferrer = loggingReferrer;
                this.loggingEntryPoint = loggingEntryPoint;
                this.isFromInsights = z;
            }

            public final UUID getInvestmentScheduleId() {
                return this.investmentSchedule.getId();
            }

            public final ApiInvestmentSchedule.Frequency getFrequency() {
                return this.investmentSchedule.getFrequency();
            }

            public final LocalDate getNextInvestmentDate() {
                return this.investmentSchedule.getNextInvestmentDate();
            }

            @Override // com.robinhood.android.common.recurring.schedule.RecurringOrderScheduleFragment.Args
            /* renamed from: isCrypto */
            public boolean getIsCrypto() {
                return this.investmentSchedule.isCrypto();
            }
        }
    }

    /* compiled from: RecurringOrderScheduleFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/schedule/RecurringOrderScheduleFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/common/recurring/schedule/RecurringOrderScheduleFragment;", "Lcom/robinhood/android/common/recurring/schedule/RecurringOrderScheduleFragment$Args;", "<init>", "()V", "REQUEST_CODE_DATE_PICKER", "", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<RecurringOrderScheduleFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(RecurringOrderScheduleFragment recurringOrderScheduleFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, recurringOrderScheduleFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public RecurringOrderScheduleFragment newInstance(Args args) {
            return (RecurringOrderScheduleFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(RecurringOrderScheduleFragment recurringOrderScheduleFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, recurringOrderScheduleFragment, args);
        }
    }
}
