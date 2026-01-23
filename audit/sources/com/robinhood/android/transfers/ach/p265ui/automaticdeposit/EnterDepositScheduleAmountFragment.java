package com.robinhood.android.transfers.ach.p265ui.automaticdeposit;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.view.RhEditText;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.transfers.ach.C30082R;
import com.robinhood.android.transfers.ach.p265ui.BaseCreateAchTransferFragment;
import com.robinhood.android.transfers.ach.p265ui.automaticdeposit.DepositScheduleFlowArgs2;
import com.robinhood.android.transfers.ach.p265ui.automaticdeposit.DepositScheduleFlowArgs3;
import com.robinhood.android.transfers.ach.p265ui.automaticdeposit.EnterDepositScheduleAmountFragment;
import com.robinhood.android.transfers.contracts.transfercontext.TransferContext;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.ApiDepositSchedule;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.Metadata;
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
import kotlin.text.StringsKt;
import p479j$.time.LocalDate;

/* compiled from: EnterDepositScheduleAmountFragment.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 &2\u00020\u0001:\u0003$%&B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0017H\u0016J\u0010\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\"H\u0014J\u0010\u0010#\u001a\u00020\u00172\u0006\u0010!\u001a\u00020\"H\u0014R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/EnterDepositScheduleAmountFragment;", "Lcom/robinhood/android/transfers/ach/ui/BaseCreateAchTransferFragment;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/EnterDepositScheduleAmountFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/EnterDepositScheduleAmountFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/EnterDepositScheduleAmountDuxo;", "getDuxo", "()Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/EnterDepositScheduleAmountDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "achRelationship", "Lcom/robinhood/models/db/AchRelationship;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "refreshUi", "state", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/EnterDepositScheduleAmountViewState;", "displayTransferExceedsBalanceDialog", "amount", "Ljava/math/BigDecimal;", "onReview", "Callbacks", "Args", "Companion", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class EnterDepositScheduleAmountFragment extends BaseCreateAchTransferFragment {
    private AchRelationship achRelationship;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.transfers.ach.ui.automaticdeposit.EnterDepositScheduleAmountFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof EnterDepositScheduleAmountFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = OldDuxos.oldDuxo(this, EnterDepositScheduleAmountDuxo.class);
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(EnterDepositScheduleAmountFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/EnterDepositScheduleAmountFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: EnterDepositScheduleAmountFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/EnterDepositScheduleAmountFragment$Callbacks;", "", "editDepositSchedule", "", "args", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/FrequencySelectionArgs;", "onShowReviewScreen", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/ReviewScreenArgs;", "onShowCreateAchRelationship", "editAchRelationship", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void editAchRelationship();

        void editDepositSchedule(DepositScheduleFlowArgs2 args);

        void onShowCreateAchRelationship();

        void onShowReviewScreen(DepositScheduleFlowArgs3 args);
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final EnterDepositScheduleAmountDuxo getDuxo() {
        return (EnterDepositScheduleAmountDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return new Screen(null, null, getScreenName(), null, 11, null);
    }

    @Override // com.robinhood.android.transfers.ach.p265ui.BaseCreateAchTransferFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        RdsButton changeAchBtn = getBinding().changeAchBtn;
        Intrinsics.checkNotNullExpressionValue(changeAchBtn, "changeAchBtn");
        OnClickListeners.onClick(changeAchBtn, new C301521(getCallbacks()));
        getBinding().changeAchBtn.setVisibility(0);
        getBinding().accountInfo.setVisibility(0);
        LinearLayout suggestedAmountsView = getBinding().suggestedAmountsView;
        Intrinsics.checkNotNullExpressionValue(suggestedAmountsView, "suggestedAmountsView");
        suggestedAmountsView.setVisibility(getTransferContext().showSuggestedAmounts() ? 0 : 8);
        LinearLayout suggestedAmountsViewV2 = getBinding().suggestedAmountsViewV2;
        Intrinsics.checkNotNullExpressionValue(suggestedAmountsViewV2, "suggestedAmountsViewV2");
        suggestedAmountsViewV2.setVisibility(8);
        RdsButton submitBtn = getBinding().submitBtn;
        Intrinsics.checkNotNullExpressionValue(submitBtn, "submitBtn");
        submitBtn.setVisibility(0);
        getBinding().amountEdt.setHint(getString(C11048R.string.ach_transfer_amount_hint));
        RhEditText amountEdt = getBinding().amountEdt;
        Intrinsics.checkNotNullExpressionValue(amountEdt, "amountEdt");
        amountEdt.addTextChangedListener(new TextWatcher() { // from class: com.robinhood.android.transfers.ach.ui.automaticdeposit.EnterDepositScheduleAmountFragment$onViewCreated$$inlined$doAfterTextChanged$1
            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence text, int start, int before, int count) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) {
                if (s == null || StringsKt.isBlank(s)) {
                    this.this$0.getBinding().amountEdt.setHint(this.this$0.getString(C11048R.string.ach_transfer_amount_hint));
                    return;
                }
                String str = Formats.getCurrencyFormat().format(new BigDecimal(s.toString()));
                this.this$0.getBinding().amountEdt.announceForAccessibility(str);
                this.this$0.getBinding().amountEdt.setHint(str);
            }
        });
    }

    /* compiled from: EnterDepositScheduleAmountFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.ach.ui.automaticdeposit.EnterDepositScheduleAmountFragment$onViewCreated$1 */
    /* synthetic */ class C301521 extends FunctionReferenceImpl implements Function0<Unit> {
        C301521(Object obj) {
            super(0, obj, Callbacks.class, "editAchRelationship", "editAchRelationship()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((Callbacks) this.receiver).editAchRelationship();
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C301511(this));
    }

    /* compiled from: EnterDepositScheduleAmountFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.ach.ui.automaticdeposit.EnterDepositScheduleAmountFragment$onStart$1 */
    /* synthetic */ class C301511 extends FunctionReferenceImpl implements Function1<EnterDepositScheduleAmountViewState, Unit> {
        C301511(Object obj) {
            super(1, obj, EnterDepositScheduleAmountFragment.class, "refreshUi", "refreshUi(Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/EnterDepositScheduleAmountViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(EnterDepositScheduleAmountViewState enterDepositScheduleAmountViewState) throws Resources.NotFoundException {
            invoke2(enterDepositScheduleAmountViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(EnterDepositScheduleAmountViewState p0) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((EnterDepositScheduleAmountFragment) this.receiver).refreshUi(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshUi(final EnterDepositScheduleAmountViewState state) throws Resources.NotFoundException {
        this.achRelationship = state.getAchRelationship();
        if (state.getShowDepositFrequencyButton()) {
            getBinding().setAutomaticDepositBtn.setVisibility(0);
            LinearLayout setAutomaticDepositBtn = getBinding().setAutomaticDepositBtn;
            Intrinsics.checkNotNullExpressionValue(setAutomaticDepositBtn, "setAutomaticDepositBtn");
            OnClickListeners.onClick(setAutomaticDepositBtn, new Function0() { // from class: com.robinhood.android.transfers.ach.ui.automaticdeposit.EnterDepositScheduleAmountFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EnterDepositScheduleAmountFragment.refreshUi$lambda$1(state, this);
                }
            });
        }
        StringResource depositScheduleDescriptionTextValue = state.getDepositScheduleDescriptionTextValue();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        getBinding().setAutomaticDepositTxt.setText(depositScheduleDescriptionTextValue.getText(resources));
        Resources resources2 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        String achRelationshipDisplayText = state.getAchRelationshipDisplayText(resources2);
        if (achRelationshipDisplayText != null) {
            getBinding().accountNameTxt.setText(achRelationshipDisplayText);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshUi$lambda$1(EnterDepositScheduleAmountViewState enterDepositScheduleAmountViewState, EnterDepositScheduleAmountFragment enterDepositScheduleAmountFragment) {
        if (!enterDepositScheduleAmountViewState.isDepositFrequencyButtonClickable()) {
            return Unit.INSTANCE;
        }
        enterDepositScheduleAmountFragment.getAnalytics().logUserAction(AnalyticsStrings.USER_ACTION_EDIT_FREQUENCY_IN_SCHEDULED_TRANSFERS);
        enterDepositScheduleAmountFragment.getCallbacks().editDepositSchedule(new DepositScheduleFlowArgs2.Create(((Args) INSTANCE.getArgs((Fragment) enterDepositScheduleAmountFragment)).getEnterAmountArgs().getFrequency()));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.transfers.ach.p265ui.BaseCreateAchTransferFragment
    protected void displayTransferExceedsBalanceDialog(BigDecimal amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        RhDialogFragment.Builder negativeButton = companion.create(fragmentActivityRequireActivity).setId(C30082R.id.dialog_id_ach_transfer_potentially_exceeds_balance).setMessage(C30082R.string.ach_transfer_error_potentially_exceeds_available, Formats.getCurrencyFormat().format(amount)).setPositiveButton(C11048R.string.general_label_ok, new Object[0]).setNegativeButton(C11048R.string.general_label_cancel, new Object[0]);
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        RhDialogFragment.Builder.show$default(negativeButton, parentFragmentManager, "deposit-exceeds-warning", false, 4, null);
    }

    @Override // com.robinhood.android.transfers.ach.p265ui.BaseCreateAchTransferFragment
    protected void onReview(BigDecimal amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        if (this.achRelationship != null) {
            AnalyticsLogger.DefaultImpls.logUserAction$default(getAnalytics(), AnalyticsStrings.USER_ACTION_REVIEW_IN_SCHEDULED_TRANSFERS, null, null, "amount: " + amount.toPlainString(), 6, null);
            Callbacks callbacks = getCallbacks();
            Companion companion = INSTANCE;
            ApiDepositSchedule.Frequency frequency = ((Args) companion.getArgs((Fragment) this)).getEnterAmountArgs().getFrequency();
            LocalDate startDate = ((Args) companion.getArgs((Fragment) this)).getEnterAmountArgs().getStartDate();
            AchRelationship achRelationship = this.achRelationship;
            Intrinsics.checkNotNull(achRelationship);
            callbacks.onShowReviewScreen(new DepositScheduleFlowArgs3.Create(frequency, startDate, amount, achRelationship.getId()));
            return;
        }
        getCallbacks().onShowCreateAchRelationship();
    }

    /* compiled from: EnterDepositScheduleAmountFragment.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/EnterDepositScheduleAmountFragment$Args;", "Landroid/os/Parcelable;", "transferContext", "Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext;", "enterAmountArgs", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/EnterAmountArgs;", "<init>", "(Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext;Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/EnterAmountArgs;)V", "getTransferContext", "()Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext;", "getEnterAmountArgs", "()Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/EnterAmountArgs;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final DepositScheduleFlowArgs enterAmountArgs;
        private final TransferContext transferContext;

        /* compiled from: EnterDepositScheduleAmountFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((TransferContext) parcel.readParcelable(Args.class.getClassLoader()), DepositScheduleFlowArgs.CREATOR.createFromParcel(parcel));
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
            this.enterAmountArgs.writeToParcel(dest, flags);
        }

        public Args(TransferContext transferContext, DepositScheduleFlowArgs enterAmountArgs) {
            Intrinsics.checkNotNullParameter(transferContext, "transferContext");
            Intrinsics.checkNotNullParameter(enterAmountArgs, "enterAmountArgs");
            this.transferContext = transferContext;
            this.enterAmountArgs = enterAmountArgs;
        }

        public final TransferContext getTransferContext() {
            return this.transferContext;
        }

        public final DepositScheduleFlowArgs getEnterAmountArgs() {
            return this.enterAmountArgs;
        }
    }

    /* compiled from: EnterDepositScheduleAmountFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0003H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/EnterDepositScheduleAmountFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/EnterDepositScheduleAmountFragment;", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/EnterDepositScheduleAmountFragment$Args;", "<init>", "()V", "newInstance", "args", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<EnterDepositScheduleAmountFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(EnterDepositScheduleAmountFragment enterDepositScheduleAmountFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, enterDepositScheduleAmountFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(EnterDepositScheduleAmountFragment enterDepositScheduleAmountFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, enterDepositScheduleAmountFragment, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public EnterDepositScheduleAmountFragment newInstance(Args args) {
            Intrinsics.checkNotNullParameter(args, "args");
            EnterDepositScheduleAmountFragment enterDepositScheduleAmountFragment = (EnterDepositScheduleAmountFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
            enterDepositScheduleAmountFragment.requireArguments().putParcelable("extraTransferContext", args.getTransferContext());
            return enterDepositScheduleAmountFragment;
        }
    }
}
