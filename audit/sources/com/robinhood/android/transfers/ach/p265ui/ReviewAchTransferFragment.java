package com.robinhood.android.transfers.ach.p265ui;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.account.strings.C8179R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.TransitionReason;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.maxonboarding.FromOnboardingCallbacks;
import com.robinhood.android.maxonboarding.OnboardingProgress;
import com.robinhood.android.maxonboarding.ToolbarExt2;
import com.robinhood.android.transfers.ach.p265ui.BaseReviewAchTransferFragment;
import com.robinhood.android.transfers.ach.p265ui.ReviewAchTransferFragment;
import com.robinhood.android.transfers.ach.util.ReviewAchTransferLoggingUtils;
import com.robinhood.android.transfers.contracts.transfercontext.TransferContext;
import com.robinhood.android.transfers.lib.C30383R;
import com.robinhood.models.api.ApiAutomaticDeposit;
import com.robinhood.models.p320db.AutomaticDeposit;
import com.robinhood.models.p320db.TransferDirection;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.transfers.models.p406db.AchTransfer;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Either;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.money.Currencies;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.UUID;
import kotlin.ExceptionsH;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import timber.log.Timber;

/* compiled from: ReviewAchTransferFragment.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 32\u00020\u0001:\u0003123B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u001a\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u0010\u0010'\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020)H\u0002J\b\u0010*\u001a\u00020\u001bH\u0014J\u0010\u0010+\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020-H\u0016J\u0010\u0010.\u001a\u00020\u001b2\u0006\u0010/\u001a\u000200H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00178TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010#\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u00064"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/ReviewAchTransferFragment;", "Lcom/robinhood/android/transfers/ach/ui/BaseReviewAchTransferFragment;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "callbacks", "Lcom/robinhood/android/transfers/ach/ui/ReviewAchTransferFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/transfers/ach/ui/ReviewAchTransferFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/transfers/ach/ui/ReviewAchTransferDuxo;", "getDuxo", "()Lcom/robinhood/android/transfers/ach/ui/ReviewAchTransferDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "direction", "Lcom/robinhood/models/db/TransferDirection;", "getDirection", "()Lcom/robinhood/models/db/TransferDirection;", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "screenDescription", "", "getScreenDescription", "()Ljava/lang/String;", "bindViewState", "state", "Lcom/robinhood/android/transfers/ach/ui/ReviewAchTransferViewState;", "onCreateButtonClicked", "onSuccess", "result", "Lcom/robinhood/android/transfers/ach/ui/BaseReviewAchTransferFragment$AchTransferResult;", "onDialogDismissed", "id", "", "Callbacks", "Args", "Companion", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class ReviewAchTransferFragment extends BaseReviewAchTransferFragment {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.transfers.ach.ui.ReviewAchTransferFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof ReviewAchTransferFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, ReviewAchTransferDuxo.class);
    public EventLogger eventLogger;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(ReviewAchTransferFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/transfers/ach/ui/ReviewAchTransferFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: ReviewAchTransferFragment.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0012\u0010\n\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/ReviewAchTransferFragment$Callbacks;", "Lcom/robinhood/android/maxonboarding/FromOnboardingCallbacks;", "onTransferInitiated", "", "achTransfer", "Lcom/robinhood/transfers/models/db/AchTransfer;", TransitionReason.ACH_TRANSFER_AUTOMATIC_DEPOSIT, "Lcom/robinhood/models/db/AutomaticDeposit;", "amountMoney", "Lcom/robinhood/models/util/Money;", "onTransferFailed", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks extends FromOnboardingCallbacks {
        void onTransferFailed(AchTransfer achTransfer);

        void onTransferInitiated(AchTransfer achTransfer, AutomaticDeposit automaticDeposit, Money amountMoney);
    }

    /* compiled from: ReviewAchTransferFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[TransferContext.RobinhoodAccountType.values().length];
            try {
                iArr[TransferContext.RobinhoodAccountType.RHS_ROTH_IRA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransferContext.RobinhoodAccountType.RHS_TRADITIONAL_IRA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TransferContext.RobinhoodAccountType.JOINT_TENANCY_WITH_ROS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[TransferDirection.values().length];
            try {
                iArr2[TransferDirection.DEPOSIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[TransferDirection.WITHDRAW.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
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

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ReviewAchTransferDuxo getDuxo() {
        return (ReviewAchTransferDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.transfers.ach.p265ui.BaseReviewAchTransferFragment
    protected TransferDirection getDirection() {
        return getTransferContext().getDirection();
    }

    @Override // com.robinhood.android.transfers.ach.p265ui.BaseReviewAchTransferFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        ToolbarExt2.configureMaxFragment(toolbar, OnboardingProgress.RECURRING_AUTOMATIC_DEPOSIT_REVIEW_TRANSFER, null, getCallbacks().isFromRhfOnboarding());
    }

    @Override // com.robinhood.android.transfers.ach.p265ui.BaseReviewAchTransferFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        BaseFragment.collectDuxoState$default(this, null, new C301261(null), 1, null);
    }

    /* compiled from: ReviewAchTransferFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ach.ui.ReviewAchTransferFragment$onViewCreated$1", m3645f = "ReviewAchTransferFragment.kt", m3646l = {81}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ach.ui.ReviewAchTransferFragment$onViewCreated$1 */
    static final class C301261 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C301261(Continuation<? super C301261> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ReviewAchTransferFragment.this.new C301261(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C301261) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: ReviewAchTransferFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.transfers.ach.ui.ReviewAchTransferFragment$onViewCreated$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ ReviewAchTransferFragment $tmp0;

            AnonymousClass1(ReviewAchTransferFragment reviewAchTransferFragment) {
                this.$tmp0 = reviewAchTransferFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, ReviewAchTransferFragment.class, "bindViewState", "bindViewState(Lcom/robinhood/android/transfers/ach/ui/ReviewAchTransferViewState;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(ReviewAchTransferViewState reviewAchTransferViewState, Continuation<? super Unit> continuation) throws Resources.NotFoundException {
                Object objInvokeSuspend$bindViewState = C301261.invokeSuspend$bindViewState(this.$tmp0, reviewAchTransferViewState, continuation);
                return objInvokeSuspend$bindViewState == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$bindViewState : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((ReviewAchTransferViewState) obj, (Continuation<? super Unit>) continuation);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<ReviewAchTransferViewState> stateFlow = ReviewAchTransferFragment.this.getDuxo().getStateFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(ReviewAchTransferFragment.this);
                this.label = 1;
                if (stateFlow.collect(anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new ExceptionsH();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$bindViewState(ReviewAchTransferFragment reviewAchTransferFragment, ReviewAchTransferViewState reviewAchTransferViewState, Continuation continuation) throws Resources.NotFoundException {
            reviewAchTransferFragment.bindViewState(reviewAchTransferViewState);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.transfers.ach.p265ui.BaseReviewAchTransferFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenDescription() {
        return super.getScreenDescription() + ", frequency: " + ((Args) INSTANCE.getArgs((Fragment) this)).getFrequency();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindViewState(ReviewAchTransferViewState state) throws Resources.NotFoundException {
        int i;
        Either<Throwable, BaseReviewAchTransferFragment.AchTransferResult> eitherConsume;
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        String bankLabelText = state.getBankLabelText(resources);
        if (bankLabelText != null) {
            getBinding().addWithdrawBankLabelTxt.setText(bankLabelText);
        }
        Resources resources2 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        String disclaimerText = state.getDisclaimerText(resources2);
        if (disclaimerText != null) {
            getBinding().transferDisclaimerTxt.setText(disclaimerText);
        }
        UiEvent<Either<Throwable, BaseReviewAchTransferFragment.AchTransferResult>> createEvent = state.getCreateEvent();
        if (createEvent != null && (eitherConsume = createEvent.consume()) != null) {
            if (eitherConsume instanceof Either.Right) {
                onSuccess((BaseReviewAchTransferFragment.AchTransferResult) ((Either.Right) eitherConsume).getValue());
            } else {
                if (!(eitherConsume instanceof Either.Left)) {
                    throw new NoWhenBranchMatchedException();
                }
                onError((Throwable) ((Either.Left) eitherConsume).getValue());
            }
        }
        if (state.shouldShowPdtWarning()) {
            Resources resources3 = getResources();
            int i2 = WhenMappings.$EnumSwitchMapping$0[state.getTransferContext().getAccountType().ordinal()];
            if (i2 == 1) {
                i = C8179R.string.account_type_ira_roth;
            } else if (i2 == 2) {
                i = C8179R.string.account_type_ira_traditional;
            } else if (i2 == 3) {
                i = C8179R.string.account_type_joint_tenancy_with_ros_short;
            } else {
                i = C8179R.string.account_type_individual;
            }
            String string2 = resources3.getString(i);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            String string3 = getString(C30383R.string.margin_day_trade_pdt_withdrawal_warning, string2);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            RhDialogFragment.Builder message = companion.create(contextRequireContext).setId(C30383R.id.dialog_id_ach_transfer_pdt_warning).setMessage(string3);
            FragmentManager parentFragmentManager = getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
            RhDialogFragment.Builder.show$default(message, parentFragmentManager, "pdtWithdrawalWarning", false, 4, null);
        }
    }

    @Override // com.robinhood.android.transfers.ach.p265ui.BaseReviewAchTransferFragment
    protected void onCreateButtonClicked() {
        String str;
        super.onCreateButtonClicked();
        Timber.INSTANCE.mo3356i("onCreateButtonClicked()", new Object[0]);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String string2 = getTransferContext().getDirection().toString();
        if (getTransferContext().getDirection() == TransferDirection.DEPOSIT && ((Args) INSTANCE.getArgs((Fragment) this)).getFrequency().getIsRecurring()) {
            str = " (Recurring)";
        } else {
            str = "";
        }
        String str2 = String.format("%s%s", Arrays.copyOf(new Object[]{string2, str}, 2));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        ReviewAchTransferLoggingUtils.logOnReview(this, getAmount());
        getAnalytics().logUserAction(AnalyticsStrings.USER_ACTION_SUBMIT_ACH_TRANSFER, "completed", str2, getAmount().toString());
        onSubmitting();
        getDuxo().submitTransfer(this);
    }

    @Override // com.robinhood.android.transfers.ach.p265ui.BaseReviewAchTransferFragment
    public void onSuccess(BaseReviewAchTransferFragment.AchTransferResult result) {
        String str;
        Intrinsics.checkNotNullParameter(result, "result");
        super.onSuccess(result);
        int i = WhenMappings.$EnumSwitchMapping$1[getTransferContext().getDirection().ordinal()];
        if (i == 1) {
            AnalyticsLogger analytics = getAnalytics();
            if (((Args) INSTANCE.getArgs((Fragment) this)).getFrequency().getIsRecurring()) {
                str = AnalyticsStrings.USER_ACTION_AUTOMATIC_DEPOSIT;
            } else {
                str = AnalyticsStrings.USER_ACTION_DEPOSIT;
            }
            analytics.logUserAction(str);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            getAnalytics().logUserAction(AnalyticsStrings.USER_ACTION_WITHDRAW);
        }
        Money money = Money3.toMoney(getAmount(), Currencies.USD);
        if (result.getAchTransfer() != null) {
            if (Intrinsics.areEqual(result.getAchTransfer().getState().getIsSuccessful(), Boolean.FALSE)) {
                getCallbacks().onTransferFailed(result.getAchTransfer());
                return;
            } else {
                getCallbacks().onTransferInitiated(result.getAchTransfer(), result.getAutomaticDeposit(), money);
                return;
            }
        }
        if (result.getAutomaticDeposit() != null) {
            getCallbacks().onTransferInitiated(null, result.getAutomaticDeposit(), money);
        } else {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalStateException("achTransfer and automaticDeposit are both null"), true, null, 4, null);
            getCallbacks().onTransferFailed(null);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        Timber.INSTANCE.mo3356i("onDialogDismissed()", new Object[0]);
        if (id == C30383R.id.dialog_id_ach_transfer_pdt_warning) {
            AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(getAnalytics(), AnalyticsStrings.BUTTON_GROUP_DAY_TRADE_WARNING, AnalyticsStrings.BUTTON_PDT_WITHDRAWAL, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
        } else {
            super.onDialogDismissed(id);
        }
    }

    /* compiled from: ReviewAchTransferFragment.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/ReviewAchTransferFragment$Args;", "Landroid/os/Parcelable;", "transferContext", "Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext;", "amount", "Ljava/math/BigDecimal;", "achRelationshipId", "Ljava/util/UUID;", "frequency", "Lcom/robinhood/models/api/ApiAutomaticDeposit$Frequency;", "<init>", "(Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext;Ljava/math/BigDecimal;Ljava/util/UUID;Lcom/robinhood/models/api/ApiAutomaticDeposit$Frequency;)V", "getTransferContext", "()Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext;", "getAmount", "()Ljava/math/BigDecimal;", "getAchRelationshipId", "()Ljava/util/UUID;", "getFrequency", "()Lcom/robinhood/models/api/ApiAutomaticDeposit$Frequency;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final UUID achRelationshipId;
        private final BigDecimal amount;
        private final ApiAutomaticDeposit.Frequency frequency;
        private final TransferContext transferContext;

        /* compiled from: ReviewAchTransferFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((TransferContext) parcel.readParcelable(Args.class.getClassLoader()), (BigDecimal) parcel.readSerializable(), (UUID) parcel.readSerializable(), ApiAutomaticDeposit.Frequency.valueOf(parcel.readString()));
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
            dest.writeParcelable(this.transferContext, flags);
            dest.writeSerializable(this.amount);
            dest.writeSerializable(this.achRelationshipId);
            dest.writeString(this.frequency.name());
        }

        public Args(TransferContext transferContext, BigDecimal amount, UUID achRelationshipId, ApiAutomaticDeposit.Frequency frequency) {
            Intrinsics.checkNotNullParameter(transferContext, "transferContext");
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(achRelationshipId, "achRelationshipId");
            Intrinsics.checkNotNullParameter(frequency, "frequency");
            this.transferContext = transferContext;
            this.amount = amount;
            this.achRelationshipId = achRelationshipId;
            this.frequency = frequency;
        }

        public final TransferContext getTransferContext() {
            return this.transferContext;
        }

        public final BigDecimal getAmount() {
            return this.amount;
        }

        public final UUID getAchRelationshipId() {
            return this.achRelationshipId;
        }

        public final ApiAutomaticDeposit.Frequency getFrequency() {
            return this.frequency;
        }
    }

    /* compiled from: ReviewAchTransferFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0003H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/ReviewAchTransferFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/transfers/ach/ui/ReviewAchTransferFragment;", "Lcom/robinhood/android/transfers/ach/ui/ReviewAchTransferFragment$Args;", "<init>", "()V", "newInstance", "args", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<ReviewAchTransferFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(ReviewAchTransferFragment reviewAchTransferFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, reviewAchTransferFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(ReviewAchTransferFragment reviewAchTransferFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, reviewAchTransferFragment, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public ReviewAchTransferFragment newInstance(Args args) {
            Intrinsics.checkNotNullParameter(args, "args");
            ReviewAchTransferFragment reviewAchTransferFragment = (ReviewAchTransferFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
            Bundle bundleRequireArguments = reviewAchTransferFragment.requireArguments();
            bundleRequireArguments.putParcelable("extraTransferContext", args.getTransferContext());
            bundleRequireArguments.putSerializable(BaseReviewAchTransferFragment.EXTRA_AMOUNT, args.getAmount());
            return reviewAchTransferFragment;
        }
    }
}
