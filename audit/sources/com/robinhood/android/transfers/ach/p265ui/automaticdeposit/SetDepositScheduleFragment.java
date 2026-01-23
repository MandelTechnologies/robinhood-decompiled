package com.robinhood.android.transfers.ach.p265ui.automaticdeposit;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.transfers.ach.C30082R;
import com.robinhood.android.transfers.ach.databinding.FragmentSetDepositScheduleBinding;
import com.robinhood.android.transfers.ach.p265ui.automaticdeposit.DateSelectionView;
import com.robinhood.android.transfers.ach.p265ui.automaticdeposit.SetDepositScheduleFragment;
import com.robinhood.android.transfers.ach.p265ui.automaticdeposit.SetDepositScheduleViewState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.ApiDepositSchedule;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import com.robinhood.utils.datetime.format.LocalDateFormatter;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.resource.StringResource;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.util.NoSuchElementException;
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
import p479j$.time.LocalDate;

/* compiled from: SetDepositScheduleFragment.kt */
@Metadata(m3635d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 @2\u00020\u00012\u00020\u00022\u00020\u0003:\u0003AB@B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\u0005J!\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0019\u0010\u0005J!\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010 \u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b \u0010\u001fJ\u0017\u0010#\u001a\u00020\b2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$R\"\u0010&\u001a\u00020%8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001b\u00101\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001b\u00107\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001b\u0010<\u001a\u0002088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010.\u001a\u0004\b:\u0010;R\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?¨\u0006C"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/SetDepositScheduleFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/DateSelectionView$Callback;", "Lcom/robinhood/android/common/ui/RhDialogFragment$OnClickListener;", "<init>", "()V", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/SetDepositScheduleViewState;", "state", "", "bindState", "(Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/SetDepositScheduleViewState;)V", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/SetDepositScheduleViewState$Loaded;", "bindUi", "(Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/SetDepositScheduleViewState$Loaded;)V", "Lcom/robinhood/models/api/ApiDepositSchedule$Frequency;", "frequency", "onRowClicked", "(Lcom/robinhood/models/api/ApiDepositSchedule$Frequency;)V", "showEndOfMonthWarningDialog", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "", "id", "passthroughArgs", "", "onNegativeButtonClicked", "(ILandroid/os/Bundle;)Z", "onPositiveButtonClicked", "j$/time/LocalDate", InquiryField.DateField.TYPE, "onDateSelected", "(Lj$/time/LocalDate;)V", "Lcom/robinhood/analytics/AnalyticsLogger;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "Lcom/robinhood/android/transfers/ach/databinding/FragmentSetDepositScheduleBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getBinding", "()Lcom/robinhood/android/transfers/ach/databinding/FragmentSetDepositScheduleBinding;", "binding", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/SetDepositScheduleDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "getDuxo", "()Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/SetDepositScheduleDuxo;", "duxo", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/SetDepositScheduleFragment$Callback;", "callback$delegate", "getCallback", "()Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/SetDepositScheduleFragment$Callback;", "callback", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/DepositScheduleFrequencyAdapter;", "adapter", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/DepositScheduleFrequencyAdapter;", "Companion", "Callback", "Args", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class SetDepositScheduleFragment extends BaseFragment implements DateSelectionView.Callback, RhDialogFragment.OnClickListener {
    private static final String END_OF_MONTH_DIALOG = "set-deposit-schedule-end-of-month-dialog";
    private final DepositScheduleFrequencyAdapter adapter;
    public AnalyticsLogger analytics;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callback$delegate, reason: from kotlin metadata */
    private final Interfaces2 callback;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(SetDepositScheduleFragment.class, "binding", "getBinding()Lcom/robinhood/android/transfers/ach/databinding/FragmentSetDepositScheduleBinding;", 0)), Reflection.property1(new PropertyReference1Impl(SetDepositScheduleFragment.class, "callback", "getCallback()Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/SetDepositScheduleFragment$Callback;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: SetDepositScheduleFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0007H&¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/SetDepositScheduleFragment$Callback;", "", "onShowEnterAmount", "", "args", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/EnterAmountArgs;", "onShowReviewScreen", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/ReviewScreenArgs;", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callback {
        void onShowEnterAmount(DepositScheduleFlowArgs args);

        void onShowReviewScreen(DepositScheduleFlowArgs3 args);
    }

    public SetDepositScheduleFragment() {
        super(C30082R.layout.fragment_set_deposit_schedule);
        this.binding = ViewBinding5.viewBinding(this, SetDepositScheduleFragment3.INSTANCE);
        this.duxo = OldDuxos.oldDuxo(this, SetDepositScheduleDuxo.class);
        this.callback = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callback.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.transfers.ach.ui.automaticdeposit.SetDepositScheduleFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof SetDepositScheduleFragment.Callback) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        this.adapter = new DepositScheduleFrequencyAdapter(new SetDepositScheduleFragment2(this));
    }

    public final AnalyticsLogger getAnalytics() {
        AnalyticsLogger analyticsLogger = this.analytics;
        if (analyticsLogger != null) {
            return analyticsLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
        return null;
    }

    public final void setAnalytics(AnalyticsLogger analyticsLogger) {
        Intrinsics.checkNotNullParameter(analyticsLogger, "<set-?>");
        this.analytics = analyticsLogger;
    }

    private final FragmentSetDepositScheduleBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentSetDepositScheduleBinding) value;
    }

    private final SetDepositScheduleDuxo getDuxo() {
        return (SetDepositScheduleDuxo) this.duxo.getValue();
    }

    private final Callback getCallback() {
        return (Callback) this.callback.getValue(this, $$delegatedProperties[1]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        FragmentSetDepositScheduleBinding binding = getBinding();
        binding.depositScheduleRecyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        binding.depositScheduleRecyclerView.setAdapter(this.adapter);
        binding.depositScheduleSelectionDatePicker.setDateSelectedCallback(this);
        RdsButton scheduleAutomaticDepositBtn = binding.scheduleAutomaticDepositBtn;
        Intrinsics.checkNotNullExpressionValue(scheduleAutomaticDepositBtn, "scheduleAutomaticDepositBtn");
        OnClickListeners.onClick(scheduleAutomaticDepositBtn, new Function0() { // from class: com.robinhood.android.transfers.ach.ui.automaticdeposit.SetDepositScheduleFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SetDepositScheduleFragment.onViewCreated$lambda$1$lambda$0(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1$lambda$0(SetDepositScheduleFragment setDepositScheduleFragment) {
        setDepositScheduleFragment.getDuxo().onSubmitClicked();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Observable<SetDepositScheduleViewState> observableDoFinally = getDuxo().getStates().doOnSubscribe(new Consumer() { // from class: com.robinhood.android.transfers.ach.ui.automaticdeposit.SetDepositScheduleFragment.onResume.1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Disposable disposable) {
                IdlingResourceCounters2.setBusy(IdlingResourceType.DEPOSIT_SCHEDULES_LOADED, true);
            }
        }).doFinally(new Action() { // from class: com.robinhood.android.transfers.ach.ui.automaticdeposit.SetDepositScheduleFragment.onResume.2
            @Override // io.reactivex.functions.Action
            public final void run() {
                IdlingResourceCounters2.setBusy(IdlingResourceType.DEPOSIT_SCHEDULES_LOADED, false);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableDoFinally, "doFinally(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDoFinally), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C301703(this));
    }

    /* compiled from: SetDepositScheduleFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.ach.ui.automaticdeposit.SetDepositScheduleFragment$onResume$3 */
    /* synthetic */ class C301703 extends FunctionReferenceImpl implements Function1<SetDepositScheduleViewState, Unit> {
        C301703(Object obj) {
            super(1, obj, SetDepositScheduleFragment.class, "bindState", "bindState(Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/SetDepositScheduleViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SetDepositScheduleViewState setDepositScheduleViewState) {
            invoke2(setDepositScheduleViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(SetDepositScheduleViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((SetDepositScheduleFragment) this.receiver).bindState(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindState(SetDepositScheduleViewState state) {
        if (state instanceof SetDepositScheduleViewState.Loaded) {
            bindUi((SetDepositScheduleViewState.Loaded) state);
            return;
        }
        if (state instanceof SetDepositScheduleViewState.WarningDialog) {
            showEndOfMonthWarningDialog();
        } else if (state instanceof SetDepositScheduleViewState.ShowEnterAmountScreen) {
            getCallback().onShowEnterAmount(((SetDepositScheduleViewState.ShowEnterAmountScreen) state).getEnterAmountArgs());
        } else {
            if (!(state instanceof SetDepositScheduleViewState.ShowReviewScreen)) {
                throw new NoWhenBranchMatchedException();
            }
            getCallback().onShowReviewScreen(((SetDepositScheduleViewState.ShowReviewScreen) state).getReviewScreenArgs());
        }
    }

    private final void bindUi(SetDepositScheduleViewState.Loaded state) {
        FragmentSetDepositScheduleBinding binding = getBinding();
        binding.scheduleAutomaticDepositBtn.setEnabled(state.getIsContinueButtonEnabled());
        binding.depositScheduleSelectionDatePicker.setDateSelection(state.getDepositScheduleStartDate());
        RhTextView rhTextView = binding.setDepositScheduleTitle;
        StringResource screenTitleTextValue = state.getScreenTitleTextValue();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        rhTextView.setText(screenTitleTextValue.getText(resources));
        RhTextView rhTextView2 = binding.depositScheduleDateLabel;
        StringResource depositScheduleDateLabelTextValue = state.getDepositScheduleDateLabelTextValue();
        Resources resources2 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        rhTextView2.setText(depositScheduleDateLabelTextValue.getText(resources2));
        this.adapter.setState(state);
        IdlingResourceCounters2.setBusy(IdlingResourceType.DEPOSIT_SCHEDULES_LOADED, false);
        getAnalytics().logUserAction(AnalyticsStrings.USER_ACTION_SET_DEPOSIT_SCHEDULE_SCREEN_VIEW);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onRowClicked(ApiDepositSchedule.Frequency frequency) {
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(getAnalytics(), AnalyticsStrings.BUTTON_GROUP_TITLE_DEPOSIT_SCHEDULE_FREQUENCY_SELECTED, "", frequency.toString(), null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, null);
        getDuxo().setSelectedFrequency(frequency);
    }

    private final void showEndOfMonthWarningDialog() {
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder useDesignSystemOverlay = companion.create(contextRequireContext).setId(C30082R.id.dialog_id_deposit_schedule_end_of_month_warning).setTitle(C30082R.string.deposit_schedule_end_of_month_warning_dialog_title, new Object[0]).setMessage(C30082R.string.deposit_schedule_end_of_month_warning_dialog_message, new Object[0]).setPositiveButton(C11048R.string.general_label_continue, new Object[0]).setNegativeButton(C30082R.string.deposit_schedule_end_of_month_warning_dialog_edit_label, new Object[0]).setUseDesignSystemOverlay(true);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        RhDialogFragment.Builder.show$default(useDesignSystemOverlay, childFragmentManager, END_OF_MONTH_DIALOG, false, 4, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onNegativeButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C30082R.id.dialog_id_deposit_schedule_end_of_month_warning) {
            AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(getAnalytics(), AnalyticsStrings.BUTTON_GROUP_TITLE_DEPOSIT_SCHEDULE_FREQUENCY_SELECTION, AnalyticsStrings.BUTTON_DEPOSIT_SCHEDULE_FREQUENCY_SELECTION_WARNING_DIALOG_EDIT, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
            getBinding().depositScheduleSelectionDatePicker.showDatePicker();
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C30082R.id.dialog_id_deposit_schedule_end_of_month_warning) {
            AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(getAnalytics(), AnalyticsStrings.BUTTON_GROUP_TITLE_DEPOSIT_SCHEDULE_FREQUENCY_SELECTION, AnalyticsStrings.BUTTON_DEPOSIT_SCHEDULE_FREQUENCY_SELECTION_WARNING_DIALOG_CONTINUE, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
            getDuxo().onDialogContinueClicked();
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.android.transfers.ach.ui.automaticdeposit.DateSelectionView.Callback
    public void onDateSelected(LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(getAnalytics(), AnalyticsStrings.BUTTON_GROUP_TITLE_DEPOSIT_SCHEDULE_FREQUENCY_SELECTION, "", LocalDateFormatter.SHORT_WEEKDAY_WITH_YEAR.format((LocalDateFormatter) date), null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, null);
        getDuxo().setSelectedStartDate(date);
    }

    /* compiled from: SetDepositScheduleFragment.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/SetDepositScheduleFragment$Args;", "Landroid/os/Parcelable;", "frequencySelectionArgs", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/FrequencySelectionArgs;", "<init>", "(Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/FrequencySelectionArgs;)V", "getFrequencySelectionArgs", "()Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/FrequencySelectionArgs;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final DepositScheduleFlowArgs2 frequencySelectionArgs;

        /* compiled from: SetDepositScheduleFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((DepositScheduleFlowArgs2) parcel.readParcelable(Args.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.frequencySelectionArgs, flags);
        }

        public Args(DepositScheduleFlowArgs2 frequencySelectionArgs) {
            Intrinsics.checkNotNullParameter(frequencySelectionArgs, "frequencySelectionArgs");
            this.frequencySelectionArgs = frequencySelectionArgs;
        }

        public final DepositScheduleFlowArgs2 getFrequencySelectionArgs() {
            return this.frequencySelectionArgs;
        }
    }

    /* compiled from: SetDepositScheduleFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/SetDepositScheduleFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/SetDepositScheduleFragment;", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/SetDepositScheduleFragment$Args;", "<init>", "()V", "END_OF_MONTH_DIALOG", "", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<SetDepositScheduleFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(SetDepositScheduleFragment setDepositScheduleFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, setDepositScheduleFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public SetDepositScheduleFragment newInstance(Args args) {
            return (SetDepositScheduleFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(SetDepositScheduleFragment setDepositScheduleFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, setDepositScheduleFragment, args);
        }
    }
}
