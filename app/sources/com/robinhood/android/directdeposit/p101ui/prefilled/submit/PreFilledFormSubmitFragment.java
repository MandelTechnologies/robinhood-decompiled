package com.robinhood.android.directdeposit.p101ui.prefilled.submit;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.p090rx.ErrorHandlers;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.directdeposit.C14044R;
import com.robinhood.android.directdeposit.p101ui.accountinfo.AccountInfoViewState2;
import com.robinhood.android.directdeposit.p101ui.accountinfo.DirectDepositAccountInfoView;
import com.robinhood.android.directdeposit.p101ui.prefilled.partial.EditDepositAmountActivity;
import com.robinhood.android.directdeposit.p101ui.prefilled.partial.ExtensionsKt;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.signature.SignatureView;
import com.robinhood.compose.bento.component.BentoCurrencyPicker;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.AccountRoutingDetailsStore;
import com.robinhood.models.p355ui.DirectDepositAmount;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.Transitions2;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.resource.StringResource;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: PreFilledFormSubmitFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000 Q2\u00020\u00012\u00020\u0002:\u0003OPQB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020C2\b\u0010D\u001a\u0004\u0018\u00010EH\u0016J\b\u0010F\u001a\u00020AH\u0016J\u0010\u0010G\u001a\u00020A2\u0006\u0010H\u001a\u00020?H\u0016J\u0010\u0010I\u001a\u00020A2\u0006\u0010J\u001a\u00020KH\u0016J\u0010\u0010L\u001a\u00020A2\u0006\u0010M\u001a\u00020NH\u0002R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0010\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0010\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010!\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u0010\u001a\u0004\b\"\u0010\u001fR\u001b\u0010$\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u0010\u001a\u0004\b&\u0010'R\u001b\u0010)\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\u0010\u001a\u0004\b*\u0010'R\u001b\u0010,\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010\u0010\u001a\u0004\b.\u0010/R\u001b\u00101\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010\u0010\u001a\u0004\b2\u0010\u001aR\u001b\u00104\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u0010\u0010\u001a\u0004\b6\u00107R\u001b\u00109\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u0010\u0010\u001a\u0004\b;\u0010<R\u0010\u0010>\u001a\u0004\u0018\u00010?X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006R"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/prefilled/submit/PreFilledFormSubmitFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/directdeposit/ui/prefilled/partial/EditDepositAmountActivity$OnEditListener;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "callbacks", "Lcom/robinhood/android/directdeposit/ui/prefilled/submit/PreFilledFormSubmitFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/directdeposit/ui/prefilled/submit/PreFilledFormSubmitFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/directdeposit/ui/prefilled/submit/PreFilledFormSubmitDuxo;", "getDuxo", "()Lcom/robinhood/android/directdeposit/ui/prefilled/submit/PreFilledFormSubmitDuxo;", "duxo$delegate", "Lkotlin/Lazy;", BentoCurrencyPicker.ROOT_TEST_TAG, "Landroid/view/ViewGroup;", "getRoot", "()Landroid/view/ViewGroup;", "root$delegate", "titleTxt", "Landroid/widget/TextView;", "getTitleTxt", "()Landroid/widget/TextView;", "titleTxt$delegate", "summaryTxt", "getSummaryTxt", "summaryTxt$delegate", "submitBtn", "Landroid/widget/Button;", "getSubmitBtn", "()Landroid/widget/Button;", "submitBtn$delegate", "editAmountBtn", "getEditAmountBtn", "editAmountBtn$delegate", "loadingView", "Lcom/robinhood/android/common/ui/ShimmerLoadingView;", "getLoadingView", "()Lcom/robinhood/android/common/ui/ShimmerLoadingView;", "loadingView$delegate", "submitLayout", "getSubmitLayout", "submitLayout$delegate", "accountInfoView", "Lcom/robinhood/android/directdeposit/ui/accountinfo/DirectDepositAccountInfoView;", "getAccountInfoView", "()Lcom/robinhood/android/directdeposit/ui/accountinfo/DirectDepositAccountInfoView;", "accountInfoView$delegate", "accountInfoBankInfoDisclosureView", "Lcom/robinhood/android/designsystem/text/RhTextView;", "getAccountInfoBankInfoDisclosureView", "()Lcom/robinhood/android/designsystem/text/RhTextView;", "accountInfoBankInfoDisclosureView$delegate", "editedDepositAmount", "Lcom/robinhood/models/ui/DirectDepositAmount;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onDepositAmountEdited", "amount", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "toggleLoadingView", "isLoading", "", "Callbacks", "Args", "Companion", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes27.dex */
public final class PreFilledFormSubmitFragment extends BaseFragment implements EditDepositAmountActivity.OnEditListener {

    /* renamed from: accountInfoBankInfoDisclosureView$delegate, reason: from kotlin metadata */
    private final Interfaces2 accountInfoBankInfoDisclosureView;

    /* renamed from: accountInfoView$delegate, reason: from kotlin metadata */
    private final Interfaces2 accountInfoView;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;

    /* renamed from: editAmountBtn$delegate, reason: from kotlin metadata */
    private final Interfaces2 editAmountBtn;
    private DirectDepositAmount editedDepositAmount;
    public EventLogger eventLogger;

    /* renamed from: loadingView$delegate, reason: from kotlin metadata */
    private final Interfaces2 loadingView;

    /* renamed from: root$delegate, reason: from kotlin metadata */
    private final Interfaces2 root;

    /* renamed from: submitBtn$delegate, reason: from kotlin metadata */
    private final Interfaces2 submitBtn;

    /* renamed from: submitLayout$delegate, reason: from kotlin metadata */
    private final Interfaces2 submitLayout;

    /* renamed from: summaryTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 summaryTxt;

    /* renamed from: titleTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 titleTxt;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(PreFilledFormSubmitFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/directdeposit/ui/prefilled/submit/PreFilledFormSubmitFragment$Callbacks;", 0)), Reflection.property1(new PropertyReference1Impl(PreFilledFormSubmitFragment.class, BentoCurrencyPicker.ROOT_TEST_TAG, "getRoot()Landroid/view/ViewGroup;", 0)), Reflection.property1(new PropertyReference1Impl(PreFilledFormSubmitFragment.class, "titleTxt", "getTitleTxt()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(PreFilledFormSubmitFragment.class, "summaryTxt", "getSummaryTxt()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(PreFilledFormSubmitFragment.class, "submitBtn", "getSubmitBtn()Landroid/widget/Button;", 0)), Reflection.property1(new PropertyReference1Impl(PreFilledFormSubmitFragment.class, "editAmountBtn", "getEditAmountBtn()Landroid/widget/Button;", 0)), Reflection.property1(new PropertyReference1Impl(PreFilledFormSubmitFragment.class, "loadingView", "getLoadingView()Lcom/robinhood/android/common/ui/ShimmerLoadingView;", 0)), Reflection.property1(new PropertyReference1Impl(PreFilledFormSubmitFragment.class, "submitLayout", "getSubmitLayout()Landroid/view/ViewGroup;", 0)), Reflection.property1(new PropertyReference1Impl(PreFilledFormSubmitFragment.class, "accountInfoView", "getAccountInfoView()Lcom/robinhood/android/directdeposit/ui/accountinfo/DirectDepositAccountInfoView;", 0)), Reflection.property1(new PropertyReference1Impl(PreFilledFormSubmitFragment.class, "accountInfoBankInfoDisclosureView", "getAccountInfoBankInfoDisclosureView()Lcom/robinhood/android/designsystem/text/RhTextView;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: PreFilledFormSubmitFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/prefilled/submit/PreFilledFormSubmitFragment$Callbacks;", "", "onDirectDepositRequestSubmitted", "", "onDepositAmountEditRequested", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onDepositAmountEditRequested();

        void onDirectDepositRequestSubmitted();
    }

    public PreFilledFormSubmitFragment() {
        super(C14044R.layout.fragment_pre_filled_form_submit);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.directdeposit.ui.prefilled.submit.PreFilledFormSubmitFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
        this.duxo = OldDuxos.oldDuxo(this, PreFilledFormSubmitDuxo.class);
        this.root = bindView(C14044R.id.pre_filled_form_submit_root);
        this.titleTxt = bindView(C14044R.id.pre_filled_form_submit_title);
        this.summaryTxt = bindView(C14044R.id.pre_filled_form_submit_summary);
        this.submitBtn = bindView(C14044R.id.pre_filled_form_review_email_action);
        this.editAmountBtn = bindView(C14044R.id.pre_filled_form_review_edit_amount);
        this.loadingView = bindView(C14044R.id.pre_filled_form_loading_view);
        this.submitLayout = bindView(C14044R.id.pre_filled_form_submit_layout);
        this.accountInfoView = bindView(C14044R.id.pre_filled_form_account_info);
        this.accountInfoBankInfoDisclosureView = bindView(C14044R.id.direct_deposit_account_info_bank_info_disclosure);
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

    private final PreFilledFormSubmitDuxo getDuxo() {
        return (PreFilledFormSubmitDuxo) this.duxo.getValue();
    }

    private final ViewGroup getRoot() {
        return (ViewGroup) this.root.getValue(this, $$delegatedProperties[1]);
    }

    private final TextView getTitleTxt() {
        return (TextView) this.titleTxt.getValue(this, $$delegatedProperties[2]);
    }

    private final TextView getSummaryTxt() {
        return (TextView) this.summaryTxt.getValue(this, $$delegatedProperties[3]);
    }

    private final Button getSubmitBtn() {
        return (Button) this.submitBtn.getValue(this, $$delegatedProperties[4]);
    }

    private final Button getEditAmountBtn() {
        return (Button) this.editAmountBtn.getValue(this, $$delegatedProperties[5]);
    }

    private final ShimmerLoadingView getLoadingView() {
        return (ShimmerLoadingView) this.loadingView.getValue(this, $$delegatedProperties[6]);
    }

    private final ViewGroup getSubmitLayout() {
        return (ViewGroup) this.submitLayout.getValue(this, $$delegatedProperties[7]);
    }

    private final DirectDepositAccountInfoView getAccountInfoView() {
        return (DirectDepositAccountInfoView) this.accountInfoView.getValue(this, $$delegatedProperties[8]);
    }

    private final RhTextView getAccountInfoBankInfoDisclosureView() {
        return (RhTextView) this.accountInfoBankInfoDisclosureView.getValue(this, $$delegatedProperties[9]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getTitleTxt().setText(C14044R.string.pre_filled_form_review_form_title);
        getSummaryTxt().setText(C14044R.string.pre_filled_form_review_description);
        getSubmitBtn().setText(C14044R.string.pre_filled_form_email_me);
        ScarletManager2.overrideStyle$default(getSubmitBtn(), new ThemedResourceReference(ResourceType.STYLE.INSTANCE, C20690R.attr.primaryButtonStyle), false, 2, null);
        DirectDepositAccountInfoView accountInfoView = getAccountInfoView();
        Companion companion = INSTANCE;
        accountInfoView.setEmployer(((Args) companion.getArgs((Fragment) this)).getEmployer());
        getAccountInfoView().setSignature(((Args) companion.getArgs((Fragment) this)).getSignature());
        DirectDepositAccountInfoView accountInfoView2 = getAccountInfoView();
        DirectDepositAmount depositAmount = ((Args) companion.getArgs((Fragment) this)).getDepositAmount();
        DirectDepositAmount.Unsupported unsupported = DirectDepositAmount.Unsupported.INSTANCE;
        accountInfoView2.setAmountVisible(!Intrinsics.areEqual(depositAmount, unsupported));
        DirectDepositAccountInfoView accountInfoView3 = getAccountInfoView();
        DirectDepositAmount depositAmount2 = ((Args) companion.getArgs((Fragment) this)).getDepositAmount();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        accountInfoView3.setAmount(ExtensionsKt.getText(depositAmount2, resources));
        if (!Intrinsics.areEqual(((Args) companion.getArgs((Fragment) this)).getDepositAmount(), unsupported)) {
            getEditAmountBtn().setVisibility(0);
            OnClickListeners.onClick(getEditAmountBtn(), new Function0() { // from class: com.robinhood.android.directdeposit.ui.prefilled.submit.PreFilledFormSubmitFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PreFilledFormSubmitFragment.onViewCreated$lambda$0(this.f$0);
                }
            });
        }
        OnClickListeners.onClick(getSubmitBtn(), new Function0() { // from class: com.robinhood.android.directdeposit.ui.prefilled.submit.PreFilledFormSubmitFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PreFilledFormSubmitFragment.onViewCreated$lambda$1(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(PreFilledFormSubmitFragment preFilledFormSubmitFragment) {
        EventLogger.DefaultImpls.logTap$default(preFilledFormSubmitFragment.getEventLogger(), UserInteractionEventData.Action.VIEW_DD_PARTIAL_PAYCHECK, new Screen(Screen.Name.DD_SIGNED_FORM, null, null, null, 14, null), new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, null, false, 56, null);
        preFilledFormSubmitFragment.getCallbacks().onDepositAmountEditRequested();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(PreFilledFormSubmitFragment preFilledFormSubmitFragment) {
        EventLogger.DefaultImpls.logTap$default(preFilledFormSubmitFragment.getEventLogger(), UserInteractionEventData.Action.VIEW_DD_CONGRATULATIONS, new Screen(Screen.Name.DD_SIGNED_FORM, null, null, null, 14, null), new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, null, false, 56, null);
        preFilledFormSubmitFragment.getDuxo().submitForm(preFilledFormSubmitFragment.editedDepositAmount);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        EventLogger.DefaultImpls.logAppear$default(getEventLogger(), null, new Screen(Screen.Name.DD_SIGNED_FORM, null, null, null, 14, null), null, null, null, 29, null);
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.directdeposit.ui.prefilled.submit.PreFilledFormSubmitFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PreFilledFormSubmitFragment.onStart$lambda$2(this.f$0, (PreFilledFormSubmitViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$2(PreFilledFormSubmitFragment preFilledFormSubmitFragment, PreFilledFormSubmitViewState viewState) throws Resources.NotFoundException {
        CharSequence text;
        StringResource directDepositDisclosureText;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        preFilledFormSubmitFragment.getAccountInfoView().setName(viewState.getFullName());
        DirectDepositAccountInfoView accountInfoView = preFilledFormSubmitFragment.getAccountInfoView();
        AccountRoutingDetailsStore.RoutingDetails routingDetails = viewState.getRoutingDetails();
        accountInfoView.setRoutingNumber(routingDetails != null ? routingDetails.getRoutingNumber() : null);
        DirectDepositAccountInfoView accountInfoView2 = preFilledFormSubmitFragment.getAccountInfoView();
        AccountRoutingDetailsStore.RoutingDetails routingDetails2 = viewState.getRoutingDetails();
        accountInfoView2.setAccountNumber(routingDetails2 != null ? routingDetails2.getAccountNumber() : null);
        DirectDepositAccountInfoView accountInfoView3 = preFilledFormSubmitFragment.getAccountInfoView();
        AccountRoutingDetailsStore.RoutingDetails routingDetails3 = viewState.getRoutingDetails();
        accountInfoView3.setBankName(routingDetails3 != null ? routingDetails3.getBankName() : null);
        RhTextView accountInfoBankInfoDisclosureView = preFilledFormSubmitFragment.getAccountInfoBankInfoDisclosureView();
        AccountRoutingDetailsStore.RoutingDetails routingDetails4 = viewState.getRoutingDetails();
        if (routingDetails4 == null || (directDepositDisclosureText = AccountInfoViewState2.getDirectDepositDisclosureText(routingDetails4)) == null) {
            text = null;
        } else {
            Resources resources = preFilledFormSubmitFragment.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            text = directDepositDisclosureText.getText(resources);
        }
        accountInfoBankInfoDisclosureView.setText(text);
        preFilledFormSubmitFragment.toggleLoadingView(viewState.isSubmitLoading());
        UiEvent<Unit> formSubmitted = viewState.getFormSubmitted();
        if ((formSubmitted != null ? formSubmitted.consume() : null) != null) {
            preFilledFormSubmitFragment.getCallbacks().onDirectDepositRequestSubmitted();
        }
        ErrorHandlers.handleErrorEvent(preFilledFormSubmitFragment.getActivityErrorHandler(), viewState.getRoutingDetailsError());
        ErrorHandlers.handleErrorEvent(preFilledFormSubmitFragment.getActivityErrorHandler(), viewState.getFormSubmitError());
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.directdeposit.ui.prefilled.partial.EditDepositAmountActivity.OnEditListener
    public void onDepositAmountEdited(DirectDepositAmount amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.editedDepositAmount = amount;
        DirectDepositAccountInfoView accountInfoView = getAccountInfoView();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        accountInfoView.setAmount(ExtensionsKt.getText(amount, resources));
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setElevation(0.0f);
    }

    private final void toggleLoadingView(boolean isLoading) {
        ViewGroup root = getRoot();
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addListener(new Transition.TransitionListener() { // from class: com.robinhood.android.directdeposit.ui.prefilled.submit.PreFilledFormSubmitFragment$toggleLoadingView$$inlined$beginDelayedTransition$1
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition) {
                IdlingResourceCounters2.increment(IdlingResourceType.DELAYED_TRANSITION);
            }
        });
        transitionSet.addListener(new Transition.TransitionListener() { // from class: com.robinhood.android.directdeposit.ui.prefilled.submit.PreFilledFormSubmitFragment$toggleLoadingView$$inlined$beginDelayedTransition$2
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition) {
                IdlingResourceCounters2.decrement(IdlingResourceType.DELAYED_TRANSITION);
            }
        });
        Transitions2.add(transitionSet, new Fade());
        TransitionManager.beginDelayedTransition(root, transitionSet);
        getLoadingView().setVisibility(isLoading ? 0 : 8);
        getSubmitLayout().setVisibility(isLoading ? 8 : 0);
    }

    /* compiled from: PreFilledFormSubmitFragment.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/prefilled/submit/PreFilledFormSubmitFragment$Args;", "Landroid/os/Parcelable;", EditDepositAmountActivity.EXTRA_DEPOSIT_AMOUNT, "Lcom/robinhood/models/ui/DirectDepositAmount;", "employer", "", "signature", "Lcom/robinhood/android/signature/SignatureView$Signature;", "<init>", "(Lcom/robinhood/models/ui/DirectDepositAmount;Ljava/lang/String;Lcom/robinhood/android/signature/SignatureView$Signature;)V", "getDepositAmount", "()Lcom/robinhood/models/ui/DirectDepositAmount;", "getEmployer", "()Ljava/lang/String;", "getSignature", "()Lcom/robinhood/android/signature/SignatureView$Signature;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final DirectDepositAmount depositAmount;
        private final String employer;
        private final SignatureView.Signature signature;

        /* compiled from: PreFilledFormSubmitFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((DirectDepositAmount) parcel.readParcelable(Args.class.getClassLoader()), parcel.readString(), (SignatureView.Signature) parcel.readParcelable(Args.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, DirectDepositAmount directDepositAmount, String str, SignatureView.Signature signature, int i, Object obj) {
            if ((i & 1) != 0) {
                directDepositAmount = args.depositAmount;
            }
            if ((i & 2) != 0) {
                str = args.employer;
            }
            if ((i & 4) != 0) {
                signature = args.signature;
            }
            return args.copy(directDepositAmount, str, signature);
        }

        /* renamed from: component1, reason: from getter */
        public final DirectDepositAmount getDepositAmount() {
            return this.depositAmount;
        }

        /* renamed from: component2, reason: from getter */
        public final String getEmployer() {
            return this.employer;
        }

        /* renamed from: component3, reason: from getter */
        public final SignatureView.Signature getSignature() {
            return this.signature;
        }

        public final Args copy(DirectDepositAmount depositAmount, String employer, SignatureView.Signature signature) {
            Intrinsics.checkNotNullParameter(depositAmount, "depositAmount");
            Intrinsics.checkNotNullParameter(employer, "employer");
            Intrinsics.checkNotNullParameter(signature, "signature");
            return new Args(depositAmount, employer, signature);
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
            return Intrinsics.areEqual(this.depositAmount, args.depositAmount) && Intrinsics.areEqual(this.employer, args.employer) && Intrinsics.areEqual(this.signature, args.signature);
        }

        public int hashCode() {
            return (((this.depositAmount.hashCode() * 31) + this.employer.hashCode()) * 31) + this.signature.hashCode();
        }

        public String toString() {
            return "Args(depositAmount=" + this.depositAmount + ", employer=" + this.employer + ", signature=" + this.signature + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.depositAmount, flags);
            dest.writeString(this.employer);
            dest.writeParcelable(this.signature, flags);
        }

        public Args(DirectDepositAmount depositAmount, String employer, SignatureView.Signature signature) {
            Intrinsics.checkNotNullParameter(depositAmount, "depositAmount");
            Intrinsics.checkNotNullParameter(employer, "employer");
            Intrinsics.checkNotNullParameter(signature, "signature");
            this.depositAmount = depositAmount;
            this.employer = employer;
            this.signature = signature;
        }

        public final DirectDepositAmount getDepositAmount() {
            return this.depositAmount;
        }

        public final String getEmployer() {
            return this.employer;
        }

        public final SignatureView.Signature getSignature() {
            return this.signature;
        }
    }

    /* compiled from: PreFilledFormSubmitFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/prefilled/submit/PreFilledFormSubmitFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/directdeposit/ui/prefilled/submit/PreFilledFormSubmitFragment;", "Lcom/robinhood/android/directdeposit/ui/prefilled/submit/PreFilledFormSubmitFragment$Args;", "<init>", "()V", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<PreFilledFormSubmitFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(PreFilledFormSubmitFragment preFilledFormSubmitFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, preFilledFormSubmitFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public PreFilledFormSubmitFragment newInstance(Args args) {
            return (PreFilledFormSubmitFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(PreFilledFormSubmitFragment preFilledFormSubmitFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, preFilledFormSubmitFragment, args);
        }
    }
}
