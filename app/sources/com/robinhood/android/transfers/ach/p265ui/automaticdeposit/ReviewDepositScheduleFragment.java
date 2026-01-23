package com.robinhood.android.transfers.ach.p265ui.automaticdeposit;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.common.util.p090rx.ActivityNoSnackbarErrorHandler;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.transfers.ach.C30082R;
import com.robinhood.android.transfers.ach.databinding.FragmentDepositScheduleReviewBinding;
import com.robinhood.android.transfers.ach.p265ui.automaticdeposit.ReviewDepositScheduleFragment;
import com.robinhood.android.transfers.ach.p265ui.automaticdeposit.ReviewDepositScheduleViewState;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.resource.StringResource;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
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

/* compiled from: ReviewDepositScheduleFragment.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0007\u0018\u0000 /2\u00020\u0001:\u0003-./B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010!\u001a\u00020\u001cH\u0016J\u000e\u0010\"\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020$J\u0010\u0010%\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020&H\u0002J\b\u0010'\u001a\u00020\u001cH\u0002J\u0010\u0010(\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020)H\u0002J\u0010\u0010*\u001a\u00020\u001c2\u0006\u0010+\u001a\u00020,H\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018¨\u00060"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/ReviewDepositScheduleFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "callbacks", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/ReviewDepositScheduleFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/ReviewDepositScheduleFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "binding", "Lcom/robinhood/android/transfers/ach/databinding/FragmentDepositScheduleReviewBinding;", "getBinding", "()Lcom/robinhood/android/transfers/ach/databinding/FragmentDepositScheduleReviewBinding;", "binding$delegate", "duxo", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/ReviewDepositScheduleDuxo;", "getDuxo", "()Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/ReviewDepositScheduleDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "bindState", "state", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/ReviewDepositScheduleViewState;", "bindUi", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/ReviewDepositScheduleViewState$Loaded;", "onSubmitClicked", "onSubmitted", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/ReviewDepositScheduleViewState$Submitted;", "onError", "error", "", "Callbacks", "Args", "Companion", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class ReviewDepositScheduleFragment extends BaseFragment {
    public AnalyticsLogger analytics;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(ReviewDepositScheduleFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/ReviewDepositScheduleFragment$Callbacks;", 0)), Reflection.property1(new PropertyReference1Impl(ReviewDepositScheduleFragment.class, "binding", "getBinding()Lcom/robinhood/android/transfers/ach/databinding/FragmentDepositScheduleReviewBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: ReviewDepositScheduleFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/ReviewDepositScheduleFragment$Callbacks;", "", "onDepositScheduleSubmitted", "", "args", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/TimelineScreenArgs;", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onDepositScheduleSubmitted(DepositScheduleFlowArgs4 args);
    }

    public ReviewDepositScheduleFragment() {
        super(C30082R.layout.fragment_deposit_schedule_review);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.transfers.ach.ui.automaticdeposit.ReviewDepositScheduleFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof ReviewDepositScheduleFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        this.binding = ViewBinding5.viewBinding(this, ReviewDepositScheduleFragment2.INSTANCE);
        this.duxo = OldDuxos.oldDuxo(this, ReviewDepositScheduleDuxo.class);
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

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final FragmentDepositScheduleReviewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[1]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentDepositScheduleReviewBinding) value;
    }

    private final ReviewDepositScheduleDuxo getDuxo() {
        return (ReviewDepositScheduleDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        RdsButton depositScheduleSubmitBtn = getBinding().depositScheduleSubmitBtn;
        Intrinsics.checkNotNullExpressionValue(depositScheduleSubmitBtn, "depositScheduleSubmitBtn");
        OnClickListeners.onClick(depositScheduleSubmitBtn, new Function0() { // from class: com.robinhood.android.transfers.ach.ui.automaticdeposit.ReviewDepositScheduleFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ReviewDepositScheduleFragment.onViewCreated$lambda$1$lambda$0(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1$lambda$0(ReviewDepositScheduleFragment reviewDepositScheduleFragment) {
        reviewDepositScheduleFragment.onSubmitClicked();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Observable<ReviewDepositScheduleViewState> observableDoFinally = getDuxo().getStates().doOnSubscribe(new Consumer() { // from class: com.robinhood.android.transfers.ach.ui.automaticdeposit.ReviewDepositScheduleFragment.onResume.1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Disposable disposable) {
                IdlingResourceCounters2.setBusy(IdlingResourceType.DEPOSIT_SCHEDULES_LOADED, true);
            }
        }).doFinally(new Action() { // from class: com.robinhood.android.transfers.ach.ui.automaticdeposit.ReviewDepositScheduleFragment.onResume.2
            @Override // io.reactivex.functions.Action
            public final void run() {
                IdlingResourceCounters2.setBusy(IdlingResourceType.DEPOSIT_SCHEDULES_LOADED, false);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableDoFinally, "doFinally(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDoFinally), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C301593(this));
    }

    /* compiled from: ReviewDepositScheduleFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.ach.ui.automaticdeposit.ReviewDepositScheduleFragment$onResume$3 */
    /* synthetic */ class C301593 extends FunctionReferenceImpl implements Function1<ReviewDepositScheduleViewState, Unit> {
        C301593(Object obj) {
            super(1, obj, ReviewDepositScheduleFragment.class, "bindState", "bindState(Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/ReviewDepositScheduleViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ReviewDepositScheduleViewState reviewDepositScheduleViewState) {
            invoke2(reviewDepositScheduleViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(ReviewDepositScheduleViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((ReviewDepositScheduleFragment) this.receiver).bindState(p0);
        }
    }

    public final void bindState(ReviewDepositScheduleViewState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state instanceof ReviewDepositScheduleViewState.Loaded) {
            bindUi((ReviewDepositScheduleViewState.Loaded) state);
        } else if (state instanceof ReviewDepositScheduleViewState.Submitting) {
            getBinding().loadingView.show();
        } else {
            if (!(state instanceof ReviewDepositScheduleViewState.Submitted)) {
                throw new NoWhenBranchMatchedException();
            }
            onSubmitted((ReviewDepositScheduleViewState.Submitted) state);
        }
    }

    private final void bindUi(ReviewDepositScheduleViewState.Loaded state) {
        FragmentDepositScheduleReviewBinding binding = getBinding();
        RhTextView rhTextView = binding.depositScheduleReviewTitle;
        StringResource screenTitleTextValue = state.getScreenTitleTextValue();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        rhTextView.setText(screenTitleTextValue.getText(resources));
        RhTextView rhTextView2 = binding.depositScheduleDisclaimer;
        Resources resources2 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        rhTextView2.setText(state.getDisclaimerTextValue(resources2));
        binding.depositScheduleAmount.setMetadataPrimaryText(state.getAmountTextValue());
        RdsRowView rdsRowView = binding.depositScheduleFrequency;
        StringResource frequencyTextValue = state.getFrequencyTextValue();
        Resources resources3 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
        rdsRowView.setMetadataPrimaryText(frequencyTextValue.getText(resources3));
        binding.depositScheduleNextDeposit.setMetadataPrimaryText(state.getNextDepositPrimaryTextValue());
        binding.depositScheduleNextDeposit.setMetadataSecondaryText(state.getNextDepositSecondaryTextValue());
        binding.depositScheduleBank.setMetadataPrimaryText(state.getBankPrimaryTextValue());
        RdsRowView rdsRowView2 = binding.depositScheduleBank;
        Resources resources4 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources4, "getResources(...)");
        rdsRowView2.setMetadataSecondaryText(state.getBankSecondaryTextValue(resources4));
        getAnalytics().logUserAction(AnalyticsStrings.USER_ACTION_REVIEW_DEPOSIT_SCHEDULE_SCREEN_VIEW);
        IdlingResourceCounters2.setBusy(IdlingResourceType.DEPOSIT_SCHEDULES_LOADED, false);
    }

    private final void onSubmitClicked() {
        AnalyticsLogger.DefaultImpls.logUserAction$default(getAnalytics(), AnalyticsStrings.USER_ACTION_SUBMIT_SCHEDULED_TRANSFER, "completed", null, ((Args) INSTANCE.getArgs((Fragment) this)).getReviewScreenArgs().getAmount().toString(), 4, null);
        getDuxo().submit();
    }

    private final void onSubmitted(ReviewDepositScheduleViewState.Submitted state) {
        String str;
        Result<DepositScheduleFlowArgs4> resultConsume = state.getSubmitEvent().consume();
        if (resultConsume != null) {
            Object value = resultConsume.getValue();
            if (Result.m28556isSuccessimpl(value)) {
                DepositScheduleFlowArgs4 depositScheduleFlowArgs4 = (DepositScheduleFlowArgs4) value;
                AnalyticsLogger analytics = getAnalytics();
                if (((Args) INSTANCE.getArgs((Fragment) this)).getReviewScreenArgs().getFrequency().getIsRecurring()) {
                    str = AnalyticsStrings.USER_ACTION_DEPOSIT_SCHEDULE;
                } else {
                    str = AnalyticsStrings.USER_ACTION_DEPOSIT;
                }
                analytics.logUserAction(str);
                getCallbacks().onDepositScheduleSubmitted(depositScheduleFlowArgs4);
            }
            Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(value);
            if (thM28553exceptionOrNullimpl != null) {
                onError(thM28553exceptionOrNullimpl);
            }
            Result.m28549boximpl(value);
        }
    }

    private final void onError(Throwable error) {
        AnalyticsLogger.DefaultImpls.logError$default(getAnalytics(), AnalyticsStrings.ERROR_DEPOSIT_SCHEDULE, null, 2, null);
        setTransitionReason("error");
        if (getBinding().loadingView.getVisibility() == 0) {
            getBinding().loadingView.hide();
        }
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        AbsErrorHandler.handleError$default(new ActivityNoSnackbarErrorHandler(fragmentActivityRequireActivity), error, false, 2, null);
        getChildFragmentManager().popBackStack();
    }

    /* compiled from: ReviewDepositScheduleFragment.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/ReviewDepositScheduleFragment$Args;", "Landroid/os/Parcelable;", "reviewScreenArgs", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/ReviewScreenArgs;", "<init>", "(Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/ReviewScreenArgs;)V", "getReviewScreenArgs", "()Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/ReviewScreenArgs;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final DepositScheduleFlowArgs3 reviewScreenArgs;

        /* compiled from: ReviewDepositScheduleFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((DepositScheduleFlowArgs3) parcel.readParcelable(Args.class.getClassLoader()));
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
            dest.writeParcelable(this.reviewScreenArgs, flags);
        }

        public Args(DepositScheduleFlowArgs3 reviewScreenArgs) {
            Intrinsics.checkNotNullParameter(reviewScreenArgs, "reviewScreenArgs");
            this.reviewScreenArgs = reviewScreenArgs;
        }

        public final DepositScheduleFlowArgs3 getReviewScreenArgs() {
            return this.reviewScreenArgs;
        }
    }

    /* compiled from: ReviewDepositScheduleFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/ReviewDepositScheduleFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/ReviewDepositScheduleFragment;", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/ReviewDepositScheduleFragment$Args;", "<init>", "()V", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<ReviewDepositScheduleFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(ReviewDepositScheduleFragment reviewDepositScheduleFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, reviewDepositScheduleFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public ReviewDepositScheduleFragment newInstance(Args args) {
            return (ReviewDepositScheduleFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(ReviewDepositScheduleFragment reviewDepositScheduleFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, reviewDepositScheduleFragment, args);
        }
    }
}
