package com.robinhood.android.transfers.ach.p265ui;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.view.RhEditText;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.gold.contracts.GoldFeature;
import com.robinhood.android.gold.contracts.GoldUpgradeIntentKey;
import com.robinhood.android.home.contracts.WatchListIntentKey;
import com.robinhood.android.home.contracts.WatchListIntentKey2;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.maxonboarding.FromOnboardingCallbacks;
import com.robinhood.android.maxonboarding.OnboardingProgress;
import com.robinhood.android.maxonboarding.ToolbarExt2;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.transfers.ach.C30082R;
import com.robinhood.android.transfers.ach.p265ui.CreateAchTransferFragment;
import com.robinhood.android.transfers.ach.p265ui.CreateAchTransferViewState2;
import com.robinhood.android.transfers.ach.util.LogOnReview;
import com.robinhood.android.transfers.contracts.transfercontext.TransferContext;
import com.robinhood.android.transfers.lib.C30383R;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.ApiAutomaticDeposit;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.models.p320db.TransferDirection;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.math.BigDecimal;
import java.util.NoSuchElementException;
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
import kotlin.text.StringsKt;

/* compiled from: CreateAchTransferFragment.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u0000 42\u00020\u0001:\u0003234B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u001a\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010!\u001a\u00020\u0019H\u0016J\u0010\u0010\"\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$H\u0002J\u0010\u0010%\u001a\u00020\u00192\u0006\u0010&\u001a\u00020\u0005H\u0014J\u0010\u0010'\u001a\u00020\u00192\u0006\u0010&\u001a\u00020\u0005H\u0014J\u0010\u0010(\u001a\u00020\u00192\u0006\u0010)\u001a\u00020*H\u0002J\b\u0010+\u001a\u00020\u0019H\u0002J\u001a\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010 H\u0016J\u001a\u00101\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010 H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015¨\u00065"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/CreateAchTransferFragment;", "Lcom/robinhood/android/transfers/ach/ui/BaseCreateAchTransferFragment;", "<init>", "()V", "userInputtedAmount", "Ljava/math/BigDecimal;", "achRelationship", "Lcom/robinhood/models/db/AchRelationship;", "callbacks", "Lcom/robinhood/android/transfers/ach/ui/CreateAchTransferFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/transfers/ach/ui/CreateAchTransferFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "duxo", "Lcom/robinhood/android/transfers/ach/ui/CreateAchTransferDuxo;", "getDuxo", "()Lcom/robinhood/android/transfers/ach/ui/CreateAchTransferDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "refreshUi", "state", "Lcom/robinhood/android/transfers/ach/ui/CreateAchTransferViewState;", "displayTransferExceedsBalanceDialog", "amount", "onReview", "handleValidationResult", "result", "Lcom/robinhood/android/transfers/ach/ui/ValidationResult;", "showWithdrawLearnMore", "onPositiveButtonClicked", "", "id", "", "passthroughArgs", "onNegativeButtonClicked", "Callbacks", "Args", "Companion", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class CreateAchTransferFragment extends BaseCreateAchTransferFragment {
    private AchRelationship achRelationship;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.transfers.ach.ui.CreateAchTransferFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof CreateAchTransferFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = OldDuxos.oldDuxo(this, CreateAchTransferDuxo.class);
    private BigDecimal userInputtedAmount;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(CreateAchTransferFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/transfers/ach/ui/CreateAchTransferFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: CreateAchTransferFragment.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J$\u0010\u0007\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u0005H&J\u0012\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH&¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/CreateAchTransferFragment$Callbacks;", "Lcom/robinhood/android/maxonboarding/FromOnboardingCallbacks;", "editDepositFrequency", "", "currentFrequency", "Lcom/robinhood/models/api/ApiAutomaticDeposit$Frequency;", "editAchRelationship", "reviewAchTransfer", "achRhId", "Ljava/util/UUID;", "amount", "Ljava/math/BigDecimal;", "frequency", "onWithdrawableCashLearnMoreClicked", "achRelationship", "Lcom/robinhood/models/db/AchRelationship;", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks extends FromOnboardingCallbacks {
        void editAchRelationship();

        void editDepositFrequency(ApiAutomaticDeposit.Frequency currentFrequency);

        void onWithdrawableCashLearnMoreClicked(AchRelationship achRelationship);

        void reviewAchTransfer(UUID achRhId, BigDecimal amount, ApiAutomaticDeposit.Frequency frequency);
    }

    /* compiled from: CreateAchTransferFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TransferDirection.values().length];
            try {
                iArr[TransferDirection.DEPOSIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransferDirection.WITHDRAW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return new Screen(null, null, getScreenName(), null, 11, null);
    }

    private final CreateAchTransferDuxo getDuxo() {
        return (CreateAchTransferDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.transfers.ach.p265ui.BaseCreateAchTransferFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        ToolbarExt2.configureMaxFragment(toolbar, OnboardingProgress.RECURRING_AUTOMATIC_DEPOSIT_ENTER_AMOUNT, null, getCallbacks().isFromRhfOnboarding());
    }

    @Override // com.robinhood.android.transfers.ach.p265ui.BaseCreateAchTransferFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        RdsButton changeAchBtn = getBinding().changeAchBtn;
        Intrinsics.checkNotNullExpressionValue(changeAchBtn, "changeAchBtn");
        OnClickListeners.onClick(changeAchBtn, new C300941(getCallbacks()));
        getBinding().changeAchBtnRevamp.setOnClickListener(new View.OnClickListener() { // from class: com.robinhood.android.transfers.ach.ui.CreateAchTransferFragment.onViewCreated.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CreateAchTransferFragment.this.getCallbacks().editAchRelationship();
            }
        });
        ImageView questionImg = getBinding().questionImg;
        Intrinsics.checkNotNullExpressionValue(questionImg, "questionImg");
        OnClickListeners.onClick(questionImg, new C300963(this));
        getBinding().accountInfo.setVisibility(0);
        LinearLayout suggestedAmountsViewV2 = getBinding().suggestedAmountsViewV2;
        Intrinsics.checkNotNullExpressionValue(suggestedAmountsViewV2, "suggestedAmountsViewV2");
        suggestedAmountsViewV2.setVisibility(8);
        RdsButton submitBtn = getBinding().submitBtn;
        Intrinsics.checkNotNullExpressionValue(submitBtn, "submitBtn");
        submitBtn.setVisibility(0);
        getBinding().amountEdt.setHint(getString(C11048R.string.ach_transfer_amount_hint));
        RhEditText amountEdt = getBinding().amountEdt;
        Intrinsics.checkNotNullExpressionValue(amountEdt, "amountEdt");
        amountEdt.addTextChangedListener(new TextWatcher() { // from class: com.robinhood.android.transfers.ach.ui.CreateAchTransferFragment$onViewCreated$$inlined$doAfterTextChanged$1
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

    /* compiled from: CreateAchTransferFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.ach.ui.CreateAchTransferFragment$onViewCreated$1 */
    /* synthetic */ class C300941 extends FunctionReferenceImpl implements Function0<Unit> {
        C300941(Object obj) {
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

    /* compiled from: CreateAchTransferFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.ach.ui.CreateAchTransferFragment$onViewCreated$3 */
    /* synthetic */ class C300963 extends FunctionReferenceImpl implements Function0<Unit> {
        C300963(Object obj) {
            super(0, obj, CreateAchTransferFragment.class, "showWithdrawLearnMore", "showWithdrawLearnMore()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((CreateAchTransferFragment) this.receiver).showWithdrawLearnMore();
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C300931(this));
    }

    /* compiled from: CreateAchTransferFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.ach.ui.CreateAchTransferFragment$onStart$1 */
    /* synthetic */ class C300931 extends FunctionReferenceImpl implements Function1<CreateAchTransferViewState, Unit> {
        C300931(Object obj) {
            super(1, obj, CreateAchTransferFragment.class, "refreshUi", "refreshUi(Lcom/robinhood/android/transfers/ach/ui/CreateAchTransferViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CreateAchTransferViewState createAchTransferViewState) {
            invoke2(createAchTransferViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CreateAchTransferViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((CreateAchTransferFragment) this.receiver).refreshUi(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshUi(final CreateAchTransferViewState state) {
        CreateAchTransferViewState2 createAchTransferViewState2Consume;
        this.achRelationship = state.getAchRelationship();
        if ((getTransferContext() instanceof TransferContext.RecurringDepositFromOnboarding) && state.getShouldCleanupOnboardingRecurringContent()) {
            RhToolbar rhToolbar = getRhToolbar();
            if (rhToolbar != null) {
                RecurringDepositToolBarExtension.setRecurringDepositToolBar(rhToolbar);
            }
            getBinding().titleText.setText(getString(C30082R.string.ach_recurring_deposit_screen_title));
            ImageView imageView = getBinding().setAutomaticDepositImg;
            Intrinsics.checkNotNull(imageView);
            Drawable drawable = ViewsKt.getDrawable(imageView, C20690R.drawable.ic_rds_repeat_16dp);
            drawable.setTint(ContextCompat.getColor(imageView.getContext(), C11048R.color.text_color_secondary));
            imageView.setImageDrawable(drawable);
            RhTextView setAutomaticDepositTxt = getBinding().setAutomaticDepositTxt;
            Intrinsics.checkNotNullExpressionValue(setAutomaticDepositTxt, "setAutomaticDepositTxt");
            ScarletManager2.overrideAttribute(setAutomaticDepositTxt, R.attr.textColor, new ThemedResourceReference(ResourceType.COLOR.INSTANCE, C20690R.attr.colorForeground2));
            getBinding().suggestedAmountsView.setVisibility(8);
            getBinding().changeAchBtn.setVisibility(8);
            getBinding().changeAchBtnRevamp.setVisibility(0);
            getBinding().submitBtn.setText(getString(C11048R.string.general_action_review));
        } else {
            getBinding().changeAchBtn.setVisibility(0);
            RhToolbar rhToolbar2 = getRhToolbar();
            if (rhToolbar2 != null) {
                rhToolbar2.setTitle(getString(C30082R.string.ach_transfer_title));
            }
            LinearLayout suggestedAmountsView = getBinding().suggestedAmountsView;
            Intrinsics.checkNotNullExpressionValue(suggestedAmountsView, "suggestedAmountsView");
            suggestedAmountsView.setVisibility(getTransferContext().showSuggestedAmounts() ? 0 : 8);
        }
        if (state.getShowDepositFrequencyButton()) {
            getBinding().setAutomaticDepositBtn.setVisibility(0);
            LinearLayout setAutomaticDepositBtn = getBinding().setAutomaticDepositBtn;
            Intrinsics.checkNotNullExpressionValue(setAutomaticDepositBtn, "setAutomaticDepositBtn");
            OnClickListeners.onClick(setAutomaticDepositBtn, new Function0() { // from class: com.robinhood.android.transfers.ach.ui.CreateAchTransferFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CreateAchTransferFragment.refreshUi$lambda$3(state, this);
                }
            });
        }
        ImageView questionImg = getBinding().questionImg;
        Intrinsics.checkNotNullExpressionValue(questionImg, "questionImg");
        questionImg.setVisibility(getTransferContext().shouldShowWithdrawalLearnMoreButton() ? 0 : 8);
        RhTextView currentBalanceTxt = getBinding().currentBalanceTxt;
        Intrinsics.checkNotNullExpressionValue(currentBalanceTxt, "currentBalanceTxt");
        currentBalanceTxt.setVisibility(state.getIsCurrentBalanceTextVisible() ? 0 : 8);
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        getBinding().setAutomaticDepositTxt.setText(state.getAutomaticDepositText(resources));
        Resources resources2 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        String currentBalanceText = state.getCurrentBalanceText(resources2);
        if (currentBalanceText != null) {
            getBinding().currentBalanceTxt.setText(currentBalanceText);
        }
        Resources resources3 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
        String achRelationshipDisplayText = state.getAchRelationshipDisplayText(resources3);
        if (achRelationshipDisplayText != null) {
            getBinding().accountNameTxt.setText(achRelationshipDisplayText);
        }
        UiEvent<CreateAchTransferViewState2> validationResultEvent = state.getValidationResultEvent();
        if (validationResultEvent == null || (createAchTransferViewState2Consume = validationResultEvent.consume()) == null) {
            return;
        }
        handleValidationResult(createAchTransferViewState2Consume);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshUi$lambda$3(CreateAchTransferViewState createAchTransferViewState, CreateAchTransferFragment createAchTransferFragment) {
        if (!createAchTransferViewState.isDepositFrequencyButtonClickable()) {
            return Unit.INSTANCE;
        }
        createAchTransferFragment.getAnalytics().logUserAction(AnalyticsStrings.USER_ACTION_EDIT_FREQUENCY_IN_TRANSFER);
        createAchTransferFragment.getCallbacks().editDepositFrequency(((Args) INSTANCE.getArgs((Fragment) createAchTransferFragment)).getDepositFrequency());
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
        this.userInputtedAmount = amount;
        int i = WhenMappings.$EnumSwitchMapping$0[getTransferContext().getDirection().ordinal()];
        if (i == 1) {
            getDuxo().validateDeposit(amount);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            getDuxo().validateWithdrawal(amount, getMaxTransferSize());
        }
        AchRelationship achRelationship = this.achRelationship;
        LogOnReview.logOnReview(this, amount, achRelationship != null ? achRelationship.getId() : null);
        AnalyticsLogger analytics = getAnalytics();
        TransferDirection direction = getTransferContext().getDirection();
        AnalyticsLogger.DefaultImpls.logUserAction$default(analytics, AnalyticsStrings.USER_ACTION_REVIEW_ACH_TRANSFER, null, direction + ((direction == TransferDirection.DEPOSIT && ((Args) INSTANCE.getArgs((Fragment) this)).getDepositFrequency().getIsRecurring()) ? " (Recurring)" : ""), "amount: " + amount.toPlainString(), 2, null);
    }

    private final void handleValidationResult(CreateAchTransferViewState2 result) {
        if (result instanceof CreateAchTransferViewState2.Valid) {
            Callbacks callbacks = getCallbacks();
            AchRelationship achRelationship = this.achRelationship;
            callbacks.reviewAchTransfer(achRelationship != null ? achRelationship.getId() : null, ((CreateAchTransferViewState2.Valid) result).getAmount(), ((Args) INSTANCE.getArgs((Fragment) this)).getDepositFrequency());
            return;
        }
        if (!(result instanceof CreateAchTransferViewState2.Invalid)) {
            throw new NoWhenBranchMatchedException();
        }
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        CreateAchTransferViewState2.Invalid invalid = (CreateAchTransferViewState2.Invalid) result;
        RhDialogFragment.Builder title = companion.create(contextRequireContext).setId(invalid.getDialogId()).setTitle(invalid.getTitle(), new Object[0]);
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        RhDialogFragment.Builder message = title.setMessage(invalid.getMessage(resources));
        Resources resources2 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        RhDialogFragment.Builder positiveButton = message.setPositiveButton(invalid.getPositiveButton(resources2));
        Resources resources3 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
        RhDialogFragment.Builder negativeButton = positiveButton.setNegativeButton(invalid.getNegativeButton(resources3));
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        RhDialogFragment.Builder.show$default(negativeButton, parentFragmentManager, invalid.getFragmentTag(), false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showWithdrawLearnMore() {
        getCallbacks().onWithdrawableCashLearnMoreClicked(this.achRelationship);
    }

    @Override // com.robinhood.android.transfers.ach.p265ui.BaseCreateAchTransferFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C30383R.id.dialog_id_ach_transfer_market_volatility) {
            Callbacks callbacks = getCallbacks();
            AchRelationship achRelationship = this.achRelationship;
            Intrinsics.checkNotNull(achRelationship);
            UUID id2 = achRelationship.getId();
            BigDecimal bigDecimal = this.userInputtedAmount;
            if (bigDecimal == null) {
                Intrinsics.throwUninitializedPropertyAccessException("userInputtedAmount");
                bigDecimal = null;
            }
            callbacks.reviewAchTransfer(id2, bigDecimal, ((Args) INSTANCE.getArgs((Fragment) this)).getDepositFrequency());
            return true;
        }
        if (id == C30082R.id.dialog_id_ach_transfer_limit || id == C30082R.id.dialog_id_ach_transfer_pending_orders || id == C30082R.id.dialog_id_ach_transfer_gold_tier || id == C30082R.id.dialog_id_ach_transfer_pending_orders_and_gold_tier || id == C30082R.id.dialog_id_ach_transfer_generic_withdrawal || id == C30383R.id.dialog_id_ach_transfer_margin_upgrade_min_amount) {
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.android.transfers.ach.p265ui.BaseCreateAchTransferFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onNegativeButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C30383R.id.dialog_id_ach_transfer_market_volatility) {
            return true;
        }
        if (id == C30082R.id.dialog_id_ach_transfer_pending_orders) {
            Navigator navigator = getNavigator();
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            Navigator.DefaultImpls.startActivity$default(navigator, fragmentActivityRequireActivity, new WatchListIntentKey(WatchListIntentKey2.ORDERS), null, false, null, null, 60, null);
            return true;
        }
        if (id == C30082R.id.dialog_id_ach_transfer_gold_tier) {
            Navigator navigator2 = getNavigator();
            FragmentActivity fragmentActivityRequireActivity2 = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "requireActivity(...)");
            Navigator.DefaultImpls.startActivity$default(navigator2, fragmentActivityRequireActivity2, new GoldUpgradeIntentKey("create_ach_transfer", GoldFeature.INSTANT, null, null, null, false, 60, null), null, false, null, null, 60, null);
            return true;
        }
        if (id == C30082R.id.dialog_id_ach_transfer_pending_orders_and_gold_tier || id == C30082R.id.dialog_id_ach_transfer_generic_withdrawal) {
            showWithdrawLearnMore();
            return true;
        }
        return super.onNegativeButtonClicked(id, passthroughArgs);
    }

    /* compiled from: CreateAchTransferFragment.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/CreateAchTransferFragment$Args;", "Landroid/os/Parcelable;", "transferContext", "Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext;", "depositFrequency", "Lcom/robinhood/models/api/ApiAutomaticDeposit$Frequency;", "<init>", "(Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext;Lcom/robinhood/models/api/ApiAutomaticDeposit$Frequency;)V", "getTransferContext", "()Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext;", "getDepositFrequency", "()Lcom/robinhood/models/api/ApiAutomaticDeposit$Frequency;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final ApiAutomaticDeposit.Frequency depositFrequency;
        private final TransferContext transferContext;

        /* compiled from: CreateAchTransferFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((TransferContext) parcel.readParcelable(Args.class.getClassLoader()), ApiAutomaticDeposit.Frequency.valueOf(parcel.readString()));
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
            dest.writeString(this.depositFrequency.name());
        }

        public Args(TransferContext transferContext, ApiAutomaticDeposit.Frequency depositFrequency) {
            Intrinsics.checkNotNullParameter(transferContext, "transferContext");
            Intrinsics.checkNotNullParameter(depositFrequency, "depositFrequency");
            this.transferContext = transferContext;
            this.depositFrequency = depositFrequency;
        }

        public final TransferContext getTransferContext() {
            return this.transferContext;
        }

        public final ApiAutomaticDeposit.Frequency getDepositFrequency() {
            return this.depositFrequency;
        }
    }

    /* compiled from: CreateAchTransferFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0003H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/CreateAchTransferFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/transfers/ach/ui/CreateAchTransferFragment;", "Lcom/robinhood/android/transfers/ach/ui/CreateAchTransferFragment$Args;", "<init>", "()V", "newInstance", "args", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<CreateAchTransferFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(CreateAchTransferFragment createAchTransferFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, createAchTransferFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(CreateAchTransferFragment createAchTransferFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, createAchTransferFragment, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public CreateAchTransferFragment newInstance(Args args) {
            Intrinsics.checkNotNullParameter(args, "args");
            CreateAchTransferFragment createAchTransferFragment = (CreateAchTransferFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
            createAchTransferFragment.requireArguments().putParcelable("extraTransferContext", args.getTransferContext());
            return createAchTransferFragment;
        }
    }
}
