package com.robinhood.android.transfers.ach.p265ui;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.jakewharton.rxbinding3.widget.RxTextView;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.AutoLoggingConfig;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.banking.util.AchTransferStringHelper;
import com.robinhood.android.common.p088ui.BaseRhBottomSheetDialogHostFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhEditText;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.util.CurrencyTextWatcher;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.snackbar.RdsSnackbar;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.optionschain.OptionChainListView9;
import com.robinhood.android.transfers.ach.C30082R;
import com.robinhood.android.transfers.ach.databinding.FragmentCreateAchTransferBinding;
import com.robinhood.android.transfers.contracts.transfercontext.CreateIavAccountData;
import com.robinhood.android.transfers.contracts.transfercontext.TransferContext;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.models.p320db.TransferDirection;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.transfers.models.p406db.AchTransfer;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import io.reactivex.Single;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlin.reflect.KProperty3;

/* compiled from: BaseCreateAchTransferFragment.kt */
@Metadata(m3635d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b'\u0018\u0000 G2\u00020\u00012\u00020\u0002:\u0001GB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u000101H\u0016J\u001c\u00102\u001a\u00020-*\u00020/2\u0006\u00103\u001a\u00020&2\u0006\u00104\u001a\u00020&H\u0002J\u0010\u00105\u001a\u00020-2\u0006\u00106\u001a\u000207H\u0016J\b\u0010<\u001a\u00020-H\u0002J\u0010\u0010=\u001a\u00020-2\u0006\u0010>\u001a\u00020$H\u0003J\u0010\u0010?\u001a\u00020-2\u0006\u00103\u001a\u00020@H$J\u0010\u0010A\u001a\u00020-2\u0006\u00103\u001a\u00020@H$J\u0010\u0010B\u001a\u00020-2\u0006\u00103\u001a\u00020&H\u0015J\u001a\u0010C\u001a\u00020$2\u0006\u0010D\u001a\u00020&2\b\u0010E\u001a\u0004\u0018\u000101H\u0016J\u001a\u0010F\u001a\u00020$2\u0006\u0010D\u001a\u00020&2\b\u0010E\u001a\u0004\u0018\u000101H\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0017\u001a\u00020\u00188DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001d\u001a\u00020\u001e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R\u000e\u0010#\u001a\u00020$X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020&X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020&X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010)\u001a\u00020&8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0014\u00108\u001a\u0002098VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;¨\u0006H"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/BaseCreateAchTransferFragment;", "Lcom/robinhood/android/common/ui/BaseRhBottomSheetDialogHostFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "getExperimentsStore", "()Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "setExperimentsStore", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;)V", "binding", "Lcom/robinhood/android/transfers/ach/databinding/FragmentCreateAchTransferBinding;", "getBinding", "()Lcom/robinhood/android/transfers/ach/databinding/FragmentCreateAchTransferBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "transferContext", "Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext;", "getTransferContext", "()Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext;", "transferContext$delegate", "Lkotlin/Lazy;", "isAchTransferDailyLimitExperiment", "", "amountOne", "", "amountTwo", "amountThree", "maxTransferSize", "getMaxTransferSize", "()I", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "initializeSuggestPill", "amount", "buttonPosition", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "screenDescription", "", "getScreenDescription", "()Ljava/lang/String;", "updateRecommendedAmount", "reviewAmount", "bypassIavBalanceCheck", "displayTransferExceedsBalanceDialog", "Ljava/math/BigDecimal;", "onReview", "setAmount", "onPositiveButtonClicked", "id", "passthroughArgs", "onNegativeButtonClicked", "Companion", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public abstract class BaseCreateAchTransferFragment extends BaseRhBottomSheetDialogHostFragment implements AutoLoggableFragment {
    public static final String EXTRA_TRANSFER_CONTEXT = "extraTransferContext";
    private int amountOne;
    private int amountThree;
    private int amountTwo;
    public AnalyticsLogger analytics;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    public EventLogger eventLogger;
    public ExperimentsStore experimentsStore;
    private boolean isAchTransferDailyLimitExperiment;

    /* renamed from: transferContext$delegate, reason: from kotlin metadata */
    private final Lazy transferContext;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(BaseCreateAchTransferFragment.class, "binding", "getBinding()Lcom/robinhood/android/transfers/ach/databinding/FragmentCreateAchTransferBinding;", 0))};
    public static final int $stable = 8;

    protected abstract void displayTransferExceedsBalanceDialog(BigDecimal amount);

    protected abstract void onReview(BigDecimal amount);

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
    public Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    public BaseCreateAchTransferFragment() {
        super(C30082R.layout.fragment_create_ach_transfer);
        this.binding = ViewBinding5.viewBinding(this, BaseCreateAchTransferFragment2.INSTANCE);
        this.transferContext = Fragments2.argument(this, "extraTransferContext");
        this.amountOne = 1000;
        this.amountTwo = 2500;
        this.amountThree = OptionChainListView9.SELLOUT_SNACKBAR_DISPLAY_DURATION_MS;
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

    public final ExperimentsStore getExperimentsStore() {
        ExperimentsStore experimentsStore = this.experimentsStore;
        if (experimentsStore != null) {
            return experimentsStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("experimentsStore");
        return null;
    }

    public final void setExperimentsStore(ExperimentsStore experimentsStore) {
        Intrinsics.checkNotNullParameter(experimentsStore, "<set-?>");
        this.experimentsStore = experimentsStore;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final FragmentCreateAchTransferBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentCreateAchTransferBinding) value;
    }

    public final TransferContext getTransferContext() {
        return (TransferContext) this.transferContext.getValue();
    }

    protected final int getMaxTransferSize() {
        return this.isAchTransferDailyLimitExperiment ? AchTransfer.LARGER_MAX_DEPOSIT_LIMIT : AchTransfer.MAX_DEPOSIT_LIMIT;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Single singleFirst = ExperimentsProvider.DefaultImpls.streamState$default(getExperimentsStore(), new Experiment[]{Experiment.ACH_TRANSFER_DAILY_LIMIT.INSTANCE}, false, null, 6, null).first(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(singleFirst, "first(...)");
        LifecycleHost.DefaultImpls.bind$default(this, singleFirst, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C300841(new MutablePropertyReference0Impl(this) { // from class: com.robinhood.android.transfers.ach.ui.BaseCreateAchTransferFragment.onViewCreated.2
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty6
            public Object get() {
                return Boolean.valueOf(((BaseCreateAchTransferFragment) this.receiver).isAchTransferDailyLimitExperiment);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty3
            public void set(Object obj) {
                ((BaseCreateAchTransferFragment) this.receiver).isAchTransferDailyLimitExperiment = ((Boolean) obj).booleanValue();
            }
        }));
        RdsButton submitBtn = getBinding().submitBtn;
        Intrinsics.checkNotNullExpressionValue(submitBtn, "submitBtn");
        OnClickListeners.onClick(submitBtn, new Function0() { // from class: com.robinhood.android.transfers.ach.ui.BaseCreateAchTransferFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseCreateAchTransferFragment.onViewCreated$lambda$0(this.f$0);
            }
        });
        updateRecommendedAmount();
        RdsButton amountOneBtn = getBinding().amountOneBtn;
        Intrinsics.checkNotNullExpressionValue(amountOneBtn, "amountOneBtn");
        initializeSuggestPill(amountOneBtn, this.amountOne, 0);
        RdsButton amountTwoBtn = getBinding().amountTwoBtn;
        Intrinsics.checkNotNullExpressionValue(amountTwoBtn, "amountTwoBtn");
        initializeSuggestPill(amountTwoBtn, this.amountTwo, 1);
        RdsButton amountThreeBtn = getBinding().amountThreeBtn;
        Intrinsics.checkNotNullExpressionValue(amountThreeBtn, "amountThreeBtn");
        initializeSuggestPill(amountThreeBtn, this.amountThree, 2);
        RdsButton amountOneBtnV2 = getBinding().amountOneBtnV2;
        Intrinsics.checkNotNullExpressionValue(amountOneBtnV2, "amountOneBtnV2");
        initializeSuggestPill(amountOneBtnV2, this.amountOne, 0);
        RdsButton amountTwoBtnV2 = getBinding().amountTwoBtnV2;
        Intrinsics.checkNotNullExpressionValue(amountTwoBtnV2, "amountTwoBtnV2");
        initializeSuggestPill(amountTwoBtnV2, this.amountTwo, 1);
        RdsButton amountThreeBtnV2 = getBinding().amountThreeBtnV2;
        Intrinsics.checkNotNullExpressionValue(amountThreeBtnV2, "amountThreeBtnV2");
        initializeSuggestPill(amountThreeBtnV2, this.amountThree, 2);
        LifecycleHost.DefaultImpls.bind$default(this, getBinding().numpad.getKeyEvents(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C300864(getBinding().amountEdt));
        getBinding().amountEdt.addTextChangedListener(new CurrencyTextWatcher(null, 1, null));
        RhEditText amountEdt = getBinding().amountEdt;
        Intrinsics.checkNotNullExpressionValue(amountEdt, "amountEdt");
        LifecycleHost.DefaultImpls.bind$default(this, RxTextView.textChanges(amountEdt), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.ach.ui.BaseCreateAchTransferFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseCreateAchTransferFragment.onViewCreated$lambda$1(this.f$0, (CharSequence) obj);
            }
        });
        BigDecimal recommendedAmount = getTransferContext().getRecommendedAmount();
        if (recommendedAmount != null) {
            getBinding().amountEdt.setText(recommendedAmount.toPlainString());
            RhEditText rhEditText = getBinding().amountEdt;
            Editable text = getBinding().amountEdt.getText();
            rhEditText.setSelection(text != null ? text.length() : 0);
        }
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        String disclaimerText = AchTransferStringHelper.getDisclaimerText(resources, getTransferContext());
        if (disclaimerText != null) {
            getBinding().recommendedAmountDisclaimerTxt.setText(disclaimerText);
            RhTextView recommendedAmountDisclaimerTxt = getBinding().recommendedAmountDisclaimerTxt;
            Intrinsics.checkNotNullExpressionValue(recommendedAmountDisclaimerTxt, "recommendedAmountDisclaimerTxt");
            recommendedAmountDisclaimerTxt.setVisibility(0);
        }
    }

    /* compiled from: BaseCreateAchTransferFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.ach.ui.BaseCreateAchTransferFragment$onViewCreated$1 */
    /* synthetic */ class C300841 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
        C300841(Object obj) {
            super(1, obj, KProperty3.class, "set", "set(Ljava/lang/Object;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            ((KProperty3) this.receiver).set(Boolean.valueOf(z));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(BaseCreateAchTransferFragment baseCreateAchTransferFragment) {
        baseCreateAchTransferFragment.reviewAmount(false);
        return Unit.INSTANCE;
    }

    /* compiled from: BaseCreateAchTransferFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.ach.ui.BaseCreateAchTransferFragment$onViewCreated$4 */
    /* synthetic */ class C300864 extends AdaptedFunctionReference implements Function1<KeyEvent, Unit> {
        C300864(Object obj) {
            super(1, obj, RhEditText.class, "dispatchKeyEvent", "dispatchKeyEvent(Landroid/view/KeyEvent;)Z", 8);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(KeyEvent keyEvent) {
            invoke2(keyEvent);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(KeyEvent keyEvent) {
            ((RhEditText) this.receiver).dispatchKeyEvent(keyEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(BaseCreateAchTransferFragment baseCreateAchTransferFragment, CharSequence it) {
        Intrinsics.checkNotNullParameter(it, "it");
        baseCreateAchTransferFragment.getBinding().submitBtn.setEnabled(it.length() > 0);
        return Unit.INSTANCE;
    }

    private final void initializeSuggestPill(View view, final int i, final int i2) {
        OnClickListeners.onClick(view, new Function0() { // from class: com.robinhood.android.transfers.ach.ui.BaseCreateAchTransferFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseCreateAchTransferFragment.initializeSuggestPill$lambda$4(this.f$0, i);
            }
        });
        ViewsKt.setLoggingConfig(view, new AutoLoggingConfig(false, false, 2, null));
        ViewsKt.eventData$default(view, false, new Function0() { // from class: com.robinhood.android.transfers.ach.ui.BaseCreateAchTransferFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseCreateAchTransferFragment.initializeSuggestPill$lambda$5(i, i2, this);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initializeSuggestPill$lambda$4(BaseCreateAchTransferFragment baseCreateAchTransferFragment, int i) {
        baseCreateAchTransferFragment.setAmount(i);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor initializeSuggestPill$lambda$5(int i, int i2, BaseCreateAchTransferFragment baseCreateAchTransferFragment) {
        return new UserInteractionEventDescriptor("suggest_pill_" + i, baseCreateAchTransferFragment.getEventScreen(), null, new Context(i2, 0, 0, String.valueOf(i), null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -10, -1, -1, -1, -1, -1, 16383, null), new Component(Component.ComponentType.BUTTON, "suggest_pill", null, 4, null), null, 36, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        if ((getTransferContext() instanceof TransferContext.QueuedDeposit) || (getTransferContext() instanceof TransferContext.RecurringDepositFromOnboarding)) {
            return;
        }
        toolbar.setTitle(getString(C30082R.string.ach_transfer_title));
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    /* renamed from: getScreenDescription */
    public String getProfileId() {
        return getTransferContext().toString();
    }

    private final void updateRecommendedAmount() {
        if (getTransferContext().getAccountData() != null) {
            CreateIavAccountData accountData = getTransferContext().getAccountData();
            Intrinsics.checkNotNull(accountData);
            BigDecimal balanceBestGuess = accountData.getAccount().getBalanceBestGuess();
            SuggestedAmount suggestedAmount = SuggestedAmount.REGULAR;
            if (BigDecimals7.isPositive(balanceBestGuess)) {
                if (BigDecimals7.lte(balanceBestGuess, new BigDecimal(100))) {
                    this.amountOne = suggestedAmount.getUpTo100().getLowAmount();
                    this.amountTwo = suggestedAmount.getUpTo100().getMediumAmount();
                    this.amountThree = suggestedAmount.getUpTo100().getHighAmount();
                } else if (BigDecimals7.lte(balanceBestGuess, new BigDecimal(200))) {
                    this.amountOne = suggestedAmount.getUpTo200().getLowAmount();
                    this.amountTwo = suggestedAmount.getUpTo200().getMediumAmount();
                    this.amountThree = suggestedAmount.getUpTo200().getHighAmount();
                } else if (BigDecimals7.lte(balanceBestGuess, new BigDecimal(500))) {
                    this.amountOne = suggestedAmount.getUpTo500().getLowAmount();
                    this.amountTwo = suggestedAmount.getUpTo500().getMediumAmount();
                    this.amountThree = suggestedAmount.getUpTo500().getHighAmount();
                } else {
                    Intrinsics.checkNotNull(balanceBestGuess);
                    float fFloatValue = balanceBestGuess.floatValue();
                    this.amountOne = Math.min(((int) Math.floor((fFloatValue / 10.0f) / 50.0d)) * 50, 100);
                    this.amountTwo = Math.min(((int) Math.floor((fFloatValue / 5.0f) / 50.0d)) * 50, 500);
                    this.amountThree = Math.min(((int) Math.floor((fFloatValue / 2.0f) / 100.0d)) * 100, OptionChainListView9.SELLOUT_SNACKBAR_DISPLAY_DURATION_MS);
                }
            }
        }
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(Locale.US);
        currencyInstance.setMaximumFractionDigits(0);
        getBinding().amountOneBtn.setText(currencyInstance.format(this.amountOne));
        getBinding().amountTwoBtn.setText(currencyInstance.format(this.amountTwo));
        getBinding().amountThreeBtn.setText(currencyInstance.format(this.amountThree));
        getBinding().amountOneBtnV2.setText(currencyInstance.format(this.amountOne));
        getBinding().amountTwoBtnV2.setText(currencyInstance.format(this.amountTwo));
        getBinding().amountThreeBtnV2.setText(currencyInstance.format(this.amountThree));
    }

    @SuppressLint({"WrongConstant"})
    private final void reviewAmount(boolean bypassIavBalanceCheck) {
        BigDecimal bigDecimal;
        try {
            bigDecimal = new BigDecimal(String.valueOf(getBinding().amountEdt.getText()));
        } catch (NumberFormatException unused) {
            bigDecimal = null;
        }
        if (bigDecimal != null && BigDecimals7.isPositive(bigDecimal)) {
            if (getTransferContext().getDirection() != TransferDirection.WITHDRAW) {
                if (bigDecimal.compareTo(new BigDecimal(getMaxTransferSize())) > 0) {
                    String str = Formats.getCurrencyFormat().format(Integer.valueOf(getMaxTransferSize()));
                    RdsSnackbar.Companion companion = RdsSnackbar.INSTANCE;
                    CoordinatorLayout snackbarShim = getBinding().snackbarShim;
                    Intrinsics.checkNotNullExpressionValue(snackbarShim, "snackbarShim");
                    String string2 = getString(C30082R.string.ach_transfer_error_exceeds_max_deposit, str);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    companion.make(snackbarShim, string2, 0).show();
                    return;
                }
                if (!bypassIavBalanceCheck && getTransferContext().getAccountData() != null) {
                    CreateIavAccountData accountData = getTransferContext().getAccountData();
                    Intrinsics.checkNotNull(accountData);
                    BigDecimal balanceBestGuess = accountData.getAccount().getBalanceBestGuess();
                    if (BigDecimals7.isPositive(balanceBestGuess) && bigDecimal.compareTo(balanceBestGuess) > 0) {
                        displayTransferExceedsBalanceDialog(bigDecimal);
                        return;
                    }
                }
            }
            onReview(bigDecimal);
            return;
        }
        RdsSnackbar.Companion companion2 = RdsSnackbar.INSTANCE;
        CoordinatorLayout snackbarShim2 = getBinding().snackbarShim;
        Intrinsics.checkNotNullExpressionValue(snackbarShim2, "snackbarShim");
        companion2.make(snackbarShim2, C30082R.string.ach_transfer_error_invalid_amount, -1).show();
    }

    protected void setAmount(int amount) {
        String strValueOf = String.valueOf(amount);
        getBinding().amountEdt.setText(strValueOf);
        getBinding().amountEdt.setSelection(strValueOf.length());
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C30082R.id.dialog_id_ach_transfer_potentially_exceeds_balance) {
            reviewAmount(true);
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onNegativeButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C30082R.id.dialog_id_ach_transfer_potentially_exceeds_balance) {
            return true;
        }
        return super.onNegativeButtonClicked(id, passthroughArgs);
    }
}
