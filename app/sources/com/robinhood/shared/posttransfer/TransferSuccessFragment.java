package com.robinhood.shared.posttransfer;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.view.result.ActivityResultCaller;
import com.robinhood.android.apyboost.ApyBoostCelebrationFragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.gold.GoldPostUpgradeCelebrationFragment;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.gold.transfers.GoldDepositBoostCelebrationFragment;
import com.robinhood.android.gold.transfers.GoldDepositBoostTimelineFragment;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.transfers.contracts.TransferIraContributionCelebrationKey;
import com.robinhood.android.transfers.contracts.TransferIraRewardConfirmationKey;
import com.robinhood.android.transfers.contracts.TransferSuccessCallbacks;
import com.robinhood.models.p355ui.bonfire.PostTransferFlow;
import com.robinhood.models.p355ui.bonfire.UiPostTransferPage;
import com.robinhood.models.serverdriven.api.ApiGenericAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.shared.posttransfer.DynamicPostTransferTimelineFragment;
import com.robinhood.shared.posttransfer.TransferConfirmationFragment;
import com.robinhood.shared.posttransfer.TransferConfirmationWithDisclaimerFragment;
import com.robinhood.shared.posttransfer.TransferConfirmationWithStepsFragment;
import com.robinhood.shared.posttransfer.TransferDetailConfirmationFragment;
import com.robinhood.shared.posttransfer.TransferInstantAvailabilityFragment;
import com.robinhood.shared.posttransfer.TransferMarginCallCoveredFragment;
import com.robinhood.shared.posttransfer.TransferTimelineFragment;
import com.robinhood.shared.posttransfer.confirmationwithlottie.TransferConfirmationWithLottieFragment;
import com.robinhood.shared.transfers.contracts.TransferSuccessKey;
import com.robinhood.userleap.SurveyManager;
import com.robinhood.userleap.SurveyManager3;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;

/* compiled from: TransferSuccessFragment.kt */
@Metadata(m3635d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 H2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\f2\u00020\r2\u00020\u000e:\u0001HB\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u000101H\u0016J\b\u00102\u001a\u000203H\u0016J\b\u00104\u001a\u00020-H\u0016J\u0012\u00105\u001a\u00020-2\b\u00106\u001a\u0004\u0018\u000107H\u0016J\b\u00108\u001a\u00020-H\u0016J\u0010\u00109\u001a\u00020-2\u0006\u00106\u001a\u00020:H\u0016J\u0010\u0010;\u001a\u00020-2\u0006\u00106\u001a\u00020:H\u0016J\u0010\u0010<\u001a\u00020-2\u0006\u00106\u001a\u00020:H\u0016J\u0010\u0010=\u001a\u00020-2\u0006\u00106\u001a\u00020:H\u0002J\u0010\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020AH\u0002J\u0012\u0010B\u001a\u00020-2\b\u00106\u001a\u0004\u0018\u00010CH\u0016J\b\u0010D\u001a\u00020-H\u0016J\b\u0010E\u001a\u00020-H\u0016J\b\u0010F\u001a\u00020-H\u0016J\b\u0010G\u001a\u00020-H\u0002R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R+\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020$8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006I"}, m3636d2 = {"Lcom/robinhood/shared/posttransfer/TransferSuccessFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/shared/posttransfer/TransferTimelineFragment$Callbacks;", "Lcom/robinhood/shared/posttransfer/TransferConfirmationFragment$Callbacks;", "Lcom/robinhood/shared/posttransfer/TransferConfirmationWithDisclaimerFragment$Callbacks;", "Lcom/robinhood/shared/posttransfer/TransferDetailConfirmationFragment$Callbacks;", "Lcom/robinhood/shared/posttransfer/TransferInstantAvailabilityFragment$Callbacks;", "Lcom/robinhood/android/transfers/contracts/TransferIraContributionCelebrationKey$Callbacks;", "Lcom/robinhood/android/transfers/contracts/TransferIraRewardConfirmationKey$Callbacks;", "Lcom/robinhood/shared/posttransfer/TransferMarginCallCoveredFragment$Callbacks;", "Lcom/robinhood/shared/posttransfer/TransferConfirmationWithStepsFragment$Callbacks;", "Lcom/robinhood/android/apyboost/ApyBoostCelebrationFragment$Callbacks;", "Lcom/robinhood/shared/posttransfer/DynamicPostTransferTimelineFragment$Callbacks;", "Lcom/robinhood/android/gold/transfers/GoldDepositBoostCelebrationFragment$Callbacks;", "Lcom/robinhood/android/gold/transfers/GoldDepositBoostTimelineFragment$Callbacks;", "<init>", "()V", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "getUserLeapManager", "()Lcom/robinhood/userleap/UserLeapManager;", "setUserLeapManager", "(Lcom/robinhood/userleap/UserLeapManager;)V", "postTransferFlow", "Lcom/robinhood/models/ui/bonfire/PostTransferFlow;", "getPostTransferFlow", "()Lcom/robinhood/models/ui/bonfire/PostTransferFlow;", "postTransferFlow$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/android/transfers/contracts/TransferSuccessCallbacks;", "getCallbacks", "()Lcom/robinhood/android/transfers/contracts/TransferSuccessCallbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "<set-?>", "", "currentIndex", "getCurrentIndex", "()I", "setCurrentIndex", "(I)V", "currentIndex$delegate", "Lkotlin/properties/ReadWriteProperty;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onBackPressed", "", "onContinueClick", "handleGenericAction", "action", "Lcom/robinhood/models/serverdriven/db/GenericAction;", "onDoneClick", "onPrimaryButtonClicked", "Lcom/robinhood/models/serverdriven/api/ApiGenericAction;", "onSecondaryButtonClicked", "onButtonClick", "handleButtonAction", "getFragmentForPage", "Landroidx/fragment/app/Fragment;", "page", "Lcom/robinhood/models/ui/bonfire/UiPostTransferPage;", "onConfirmationClick", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "showCloseIcon", "dismiss", "onDismiss", "complete", "Companion", "lib-post-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class TransferSuccessFragment extends BaseFragment implements TransferTimelineFragment.Callbacks, TransferConfirmationFragment.Callbacks, TransferConfirmationWithDisclaimerFragment.Callbacks, TransferDetailConfirmationFragment.Callbacks, TransferInstantAvailabilityFragment.Callbacks, TransferIraContributionCelebrationKey.Callbacks, TransferIraRewardConfirmationKey.Callbacks, TransferMarginCallCoveredFragment.Callbacks, TransferConfirmationWithStepsFragment.Callbacks, ApyBoostCelebrationFragment.Callbacks, DynamicPostTransferTimelineFragment.Callbacks, GoldDepositBoostCelebrationFragment.Callbacks, GoldDepositBoostTimelineFragment.Callbacks {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: currentIndex$delegate, reason: from kotlin metadata */
    private final Interfaces3 currentIndex;

    /* renamed from: postTransferFlow$delegate, reason: from kotlin metadata */
    private final Lazy postTransferFlow;
    public SurveyManager3 userLeapManager;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(TransferSuccessFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/transfers/contracts/TransferSuccessCallbacks;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(TransferSuccessFragment.class, "currentIndex", "getCurrentIndex()I", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: TransferSuccessFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UiPostTransferPage.Timeline.Type.values().length];
            try {
                iArr[UiPostTransferPage.Timeline.Type.GOLD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public TransferSuccessFragment() {
        super(C11048R.layout.parent_fragment_container);
        this.postTransferFlow = LazyKt.lazy(new Function0() { // from class: com.robinhood.shared.posttransfer.TransferSuccessFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransferSuccessFragment.postTransferFlow_delegate$lambda$0(this.f$0);
            }
        });
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(TransferSuccessCallbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.shared.posttransfer.TransferSuccessFragment$special$$inlined$parentFragmentThenActivityHostCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                ActivityResultCaller parentFragment = CallbacksProperty.getParentFragment();
                if (!(parentFragment instanceof TransferSuccessCallbacks)) {
                    parentFragment = null;
                }
                TransferSuccessCallbacks transferSuccessCallbacks = (TransferSuccessCallbacks) parentFragment;
                if (transferSuccessCallbacks != null) {
                    return transferSuccessCallbacks;
                }
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof TransferSuccessCallbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        this.currentIndex = (Interfaces3) BindSavedState2.savedSerializable(this, 0).provideDelegate(this, $$delegatedProperties[1]);
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

    private final PostTransferFlow getPostTransferFlow() {
        return (PostTransferFlow) this.postTransferFlow.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PostTransferFlow postTransferFlow_delegate$lambda$0(TransferSuccessFragment transferSuccessFragment) {
        return ((TransferSuccessKey) INSTANCE.getArgs((Fragment) transferSuccessFragment)).getPostTransferFlow();
    }

    private final TransferSuccessCallbacks getCallbacks() {
        return (TransferSuccessCallbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final int getCurrentIndex() {
        return ((Number) this.currentIndex.getValue(this, $$delegatedProperties[1])).intValue();
    }

    private final void setCurrentIndex(int i) {
        this.currentIndex.setValue(this, $$delegatedProperties[1], Integer.valueOf(i));
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (savedInstanceState == null) {
            if (!getPostTransferFlow().getPostTransferPages().isEmpty()) {
                setFragment(C11048R.id.fragment_container, getFragmentForPage(getPostTransferFlow().getPostTransferPages().get(getCurrentIndex())));
            } else {
                complete();
            }
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        if (getCurrentIndex() == 0) {
            complete();
            return true;
        }
        setCurrentIndex(getCurrentIndex() - 1);
        return super.onBackPressed();
    }

    @Override // com.robinhood.shared.posttransfer.TransferTimelineFragment.Callbacks, com.robinhood.shared.posttransfer.TransferConfirmationFragment.Callbacks, com.robinhood.shared.posttransfer.TransferDetailConfirmationFragment.Callbacks, com.robinhood.shared.posttransfer.TransferInstantAvailabilityFragment.Callbacks, com.robinhood.android.transfers.contracts.TransferIraContributionCelebrationKey.Callbacks
    public void onContinueClick() {
        setCurrentIndex(getCurrentIndex() + 1);
        if (getCurrentIndex() < getPostTransferFlow().getPostTransferPages().size()) {
            replaceFragment(getFragmentForPage(getPostTransferFlow().getPostTransferPages().get(getCurrentIndex())));
        } else {
            complete();
        }
    }

    @Override // com.robinhood.shared.posttransfer.TransferTimelineFragment.Callbacks
    public void handleGenericAction(GenericAction action) {
        if (action instanceof GenericAction.DeeplinkAction) {
            Navigator navigator = getNavigator();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, ((GenericAction.DeeplinkAction) action).getUri(), null, null, false, null, 60, null);
        }
    }

    @Override // com.robinhood.shared.posttransfer.TransferMarginCallCoveredFragment.Callbacks
    public void onDoneClick() {
        requireActivity().finish();
    }

    @Override // com.robinhood.shared.posttransfer.TransferConfirmationWithDisclaimerFragment.Callbacks
    public void onPrimaryButtonClicked(ApiGenericAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        handleButtonAction(action);
    }

    @Override // com.robinhood.shared.posttransfer.TransferConfirmationWithDisclaimerFragment.Callbacks
    public void onSecondaryButtonClicked(ApiGenericAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        handleButtonAction(action);
    }

    @Override // com.robinhood.android.transfers.contracts.TransferIraRewardConfirmationKey.Callbacks
    public void onButtonClick(ApiGenericAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        handleButtonAction(action);
    }

    private final void handleButtonAction(ApiGenericAction action) {
        if (action instanceof ApiGenericAction.ApiDeeplinkAction) {
            Navigator navigator = getNavigator();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, ((ApiGenericAction.ApiDeeplinkAction) action).getAction_data().getUri(), Boolean.FALSE, null, false, null, 56, null);
            requireActivity().finish();
            return;
        }
        if (Intrinsics.areEqual(action, ApiGenericAction.ApiDismissAction.INSTANCE)) {
            onContinueClick();
            return;
        }
        throw new IllegalStateException(("Unsupported button action: " + Reflection.getOrCreateKotlinClass(action.getClass())).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Fragment getFragmentForPage(UiPostTransferPage page) {
        int i = 1;
        if (page instanceof UiPostTransferPage.Timeline) {
            UiPostTransferPage.Timeline.Type type2 = ((UiPostTransferPage.Timeline) page).getType();
            int i2 = type2 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type2.ordinal()];
            if (i2 == -1) {
                return (BaseFragment) TransferTimelineFragment.INSTANCE.newInstance((Parcelable) page);
            }
            if (i2 != 1) {
                throw new NoWhenBranchMatchedException();
            }
            return (BaseFragment) GoldDepositBoostTimelineFragment.INSTANCE.newInstance((Parcelable) page);
        }
        if (page instanceof UiPostTransferPage.Confirmation) {
            return TransferConfirmationFragment.INSTANCE.newInstance((Parcelable) page);
        }
        if (page instanceof UiPostTransferPage.DetailConfirmation) {
            return TransferDetailConfirmationFragment.INSTANCE.newInstance((Parcelable) page);
        }
        if (page instanceof UiPostTransferPage.InstantAvailability) {
            return TransferInstantAvailabilityFragment.INSTANCE.newInstance((Parcelable) page);
        }
        if (page instanceof UiPostTransferPage.ConfirmationWithDisclaimer) {
            return TransferConfirmationWithDisclaimerFragment.INSTANCE.newInstance((Parcelable) page);
        }
        if (page instanceof UiPostTransferPage.ConfirmationWithLottie) {
            return TransferConfirmationWithLottieFragment.INSTANCE.newInstance((Parcelable) page);
        }
        String str = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if (page instanceof UiPostTransferPage.IraContributionCelebration) {
            return Navigator.DefaultImpls.createFragment$default(getNavigator(), new TransferIraContributionCelebrationKey((UiPostTransferPage.IraContributionCelebration) page), null, 2, null);
        }
        if (page instanceof UiPostTransferPage.PostTransferGoldCelebration) {
            return GoldPostUpgradeCelebrationFragment.INSTANCE.newInstance((Parcelable) new GoldPostUpgradeCelebrationFragment.Args(str, (UiPostTransferPage.PostTransferGoldCelebration) page, i, objArr3 == true ? 1 : 0));
        }
        if (page instanceof UiPostTransferPage.MarginCallCovered) {
            return TransferMarginCallCoveredFragment.INSTANCE.newInstance((Parcelable) page);
        }
        if (page instanceof UiPostTransferPage.ConfirmationWithSteps) {
            return TransferConfirmationWithStepsFragment.INSTANCE.newInstance((Parcelable) page);
        }
        if (page instanceof UiPostTransferPage.InitialPostTransferTimeline) {
            return DynamicPostTransferTimelineFragment.INSTANCE.newInstance((Parcelable) new DynamicPostTransferTimelineFragment.Args(getPostTransferFlow().getTransferId(), (UiPostTransferPage.InitialPostTransferTimeline) page, ((TransferSuccessKey) INSTANCE.getArgs((Fragment) this)).getEntryPoint()));
        }
        if (page instanceof UiPostTransferPage.IraRewardConfirmation) {
            return Navigator.DefaultImpls.createFragment$default(getNavigator(), new TransferIraRewardConfirmationKey((UiPostTransferPage.IraRewardConfirmation) page), null, 2, null);
        }
        if (page instanceof UiPostTransferPage.ApyBoostCelebration) {
            return ApyBoostCelebrationFragment.INSTANCE.newInstance((Parcelable) new ApyBoostCelebrationFragment.Args(objArr2 == true ? 1 : 0, (UiPostTransferPage.ApyBoostCelebration) page, i, objArr == true ? 1 : 0));
        }
        if (page instanceof UiPostTransferPage.UkQueuedDeposit) {
            throw new IllegalStateException("UK queued deposits are not supported in this flow");
        }
        if (page instanceof UiPostTransferPage.GoldDepositBoostCelebration) {
            return GoldDepositBoostCelebrationFragment.INSTANCE.newInstance((Parcelable) page);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.robinhood.android.apyboost.ApyBoostCelebrationFragment.Callbacks
    public void onConfirmationClick(com.robinhood.models.serverdriven.experimental.api.GenericAction action) {
        if (action instanceof GenericAction.Deeplink) {
            Navigator navigator = getNavigator();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, Uri.parse(((GenericAction.Deeplink) action).getValue2().getUri()), null, null, false, null, 60, null);
            return;
        }
        if (action instanceof GenericAction.Dismiss) {
            onContinueClick();
            return;
        }
        if ((action instanceof GenericAction.InfoAlert) || action == null) {
            return;
        }
        throw new IllegalStateException(("Unsupported action: " + Reflection.getOrCreateKotlinClass(action.getClass())).toString());
    }

    @Override // com.robinhood.shared.posttransfer.TransferConfirmationWithStepsFragment.Callbacks
    public void showCloseIcon() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNull(fragmentActivityRequireActivity, "null cannot be cast to non-null type com.robinhood.android.common.ui.BaseActivity");
        ((BaseActivity) fragmentActivityRequireActivity).showCloseIcon();
    }

    @Override // com.robinhood.shared.posttransfer.TransferConfirmationWithStepsFragment.Callbacks
    public void dismiss() {
        requireActivity().finish();
    }

    @Override // com.robinhood.shared.posttransfer.DynamicPostTransferTimelineFragment.Callbacks
    public void onDismiss() {
        complete();
    }

    private final void complete() {
        String surveyName = getPostTransferFlow().getSurveyName();
        if (surveyName != null) {
            SurveyManager.DefaultImpls.setPendingSurvey$default(getUserLeapManager(), surveyName, null, 2, null);
        }
        getCallbacks().onTransferConfirmationComplete(getPostTransferFlow());
    }

    /* compiled from: TransferSuccessFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/posttransfer/TransferSuccessFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/shared/posttransfer/TransferSuccessFragment;", "Lcom/robinhood/shared/transfers/contracts/TransferSuccessKey;", "<init>", "()V", "lib-post-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<TransferSuccessFragment, TransferSuccessKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(TransferSuccessKey transferSuccessKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, transferSuccessKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public TransferSuccessKey getArgs(TransferSuccessFragment transferSuccessFragment) {
            return (TransferSuccessKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, transferSuccessFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public TransferSuccessFragment newInstance(TransferSuccessKey transferSuccessKey) {
            return (TransferSuccessFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, transferSuccessKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(TransferSuccessFragment transferSuccessFragment, TransferSuccessKey transferSuccessKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, transferSuccessFragment, transferSuccessKey);
        }
    }
}
