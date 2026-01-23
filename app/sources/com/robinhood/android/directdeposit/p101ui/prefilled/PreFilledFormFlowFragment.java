package com.robinhood.android.directdeposit.p101ui.prefilled;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.view.result.ActivityResultCaller;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.directdeposit.DirectDepositSource;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.util.extensions.Snackbars;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.snackbar.RdsSnackbar;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.directdeposit.C14044R;
import com.robinhood.android.directdeposit.p101ui.prefilled.PreFilledFormFlowFragment;
import com.robinhood.android.directdeposit.p101ui.prefilled.PreFilledFormIntroFragment;
import com.robinhood.android.directdeposit.p101ui.prefilled.PreFilledFormReviewFragment;
import com.robinhood.android.directdeposit.p101ui.prefilled.PreFilledFormSignatureFragment;
import com.robinhood.android.directdeposit.p101ui.prefilled.confirmation.PreFilledFormConfirmationFragment;
import com.robinhood.android.directdeposit.p101ui.prefilled.employer.PreFilledFormConfirmEmployerFragment;
import com.robinhood.android.directdeposit.p101ui.prefilled.employer.PreFilledFormEmployerFragment;
import com.robinhood.android.directdeposit.p101ui.prefilled.partial.EditDepositAmountActivity;
import com.robinhood.android.directdeposit.p101ui.prefilled.partial.PreFilledFormAmountTypeFragment;
import com.robinhood.android.directdeposit.p101ui.prefilled.partial.input.InputType;
import com.robinhood.android.directdeposit.p101ui.prefilled.partial.input.PreFilledFormAmountInputFragment;
import com.robinhood.android.directdeposit.p101ui.prefilled.submit.PreFilledFormSubmitFragment;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.signature.SignatureView;
import com.robinhood.android.transfers.contracts.DirectDepositShimKey;
import com.robinhood.models.p355ui.DirectDepositAmount;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.userleap.survey.Survey;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces;
import kotlin.properties.Interfaces2;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;

/* compiled from: PreFilledFormFlowFragment.kt */
@Metadata(m3635d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \\2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n:\u0004YZ[\\B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u00102\u001a\u0002032\u0006\u00104\u001a\u000205H\u0016J\u0010\u00106\u001a\u0002032\u0006\u00107\u001a\u000208H\u0016J\u0012\u00109\u001a\u0002032\b\u0010:\u001a\u0004\u0018\u00010;H\u0016J\u0010\u0010<\u001a\u0002032\u0006\u0010=\u001a\u00020\u001bH\u0016J\b\u0010>\u001a\u000203H\u0016J\u0018\u0010?\u001a\u0002032\u0006\u0010@\u001a\u00020\u001b2\u0006\u0010A\u001a\u00020\u0017H\u0016J\b\u0010B\u001a\u000203H\u0016J\b\u0010C\u001a\u000203H\u0016J\b\u0010D\u001a\u000203H\u0016J\u0010\u0010E\u001a\u0002032\u0006\u0010F\u001a\u00020GH\u0016J\b\u0010H\u001a\u000203H\u0016J\u0010\u0010I\u001a\u0002032\u0006\u0010J\u001a\u00020KH\u0016J\b\u0010L\u001a\u000203H\u0016J\b\u0010M\u001a\u000203H\u0016J\u0010\u0010N\u001a\u0002032\u0006\u0010O\u001a\u00020\u0017H\u0002J\"\u0010P\u001a\u0002032\u0006\u0010Q\u001a\u00020R2\u0006\u0010S\u001a\u00020R2\b\u0010T\u001a\u0004\u0018\u00010UH\u0016J\u0010\u0010V\u001a\u0002032\u0006\u0010W\u001a\u00020%H\u0016J\b\u0010X\u001a\u00020\u0017H\u0016R+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u0017X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR/\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010\r\u001a\u0004\u0018\u00010\u001e8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b$\u0010\u0015\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R/\u0010&\u001a\u0004\u0018\u00010%2\b\u0010\r\u001a\u0004\u0018\u00010%8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b+\u0010\u0015\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001b\u0010,\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b.\u0010/¨\u0006]"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/prefilled/PreFilledFormFlowFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/directdeposit/ui/prefilled/PreFilledFormIntroFragment$Callbacks;", "Lcom/robinhood/android/directdeposit/ui/prefilled/employer/PreFilledFormConfirmEmployerFragment$Callbacks;", "Lcom/robinhood/android/directdeposit/ui/prefilled/employer/PreFilledFormEmployerFragment$Callbacks;", "Lcom/robinhood/android/directdeposit/ui/prefilled/partial/PreFilledFormAmountTypeFragment$Callbacks;", "Lcom/robinhood/android/directdeposit/ui/prefilled/partial/input/PreFilledFormAmountInputFragment$Callbacks;", "Lcom/robinhood/android/directdeposit/ui/prefilled/PreFilledFormReviewFragment$Callbacks;", "Lcom/robinhood/android/directdeposit/ui/prefilled/PreFilledFormSignatureFragment$Callbacks;", "Lcom/robinhood/android/directdeposit/ui/prefilled/submit/PreFilledFormSubmitFragment$Callbacks;", "Lcom/robinhood/android/directdeposit/ui/prefilled/confirmation/PreFilledFormConfirmationFragment$Callbacks;", "<init>", "()V", "<set-?>", "Lcom/robinhood/android/directdeposit/ui/prefilled/PreFilledFormFlowFragment$State;", "state", "getState", "()Lcom/robinhood/android/directdeposit/ui/prefilled/PreFilledFormFlowFragment$State;", "setState", "(Lcom/robinhood/android/directdeposit/ui/prefilled/PreFilledFormFlowFragment$State;)V", "state$delegate", "Lkotlin/properties/ReadWriteProperty;", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "updatedEmployer", "", "getUpdatedEmployer", "()Ljava/lang/String;", "Lcom/robinhood/userleap/survey/Survey;", DirectDepositShimKey.EXTRA_DROP_OFF_SURVEY, "getDropOffSurvey", "()Lcom/robinhood/userleap/survey/Survey;", "setDropOffSurvey", "(Lcom/robinhood/userleap/survey/Survey;)V", "dropOffSurvey$delegate", "Lcom/robinhood/android/common/directdeposit/DirectDepositSource;", "completedDirectDepositSource", "getCompletedDirectDepositSource", "()Lcom/robinhood/android/common/directdeposit/DirectDepositSource;", "setCompletedDirectDepositSource", "(Lcom/robinhood/android/common/directdeposit/DirectDepositSource;)V", "completedDirectDepositSource$delegate", "callbacks", "Lcom/robinhood/android/directdeposit/ui/prefilled/PreFilledFormFlowFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/directdeposit/ui/prefilled/PreFilledFormFlowFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onConfirmEmployer", "employerName", "onUpdateEmployer", "onEmployerConfirmed", "employer", "updatedEmploymentInfo", "onEntirePaycheckSelected", "onPaycheckPercentSelected", "onPaycheckDollarAmountSelected", "onPartialAmountConfirmed", "amount", "Lcom/robinhood/models/ui/DirectDepositAmount$PartialPaycheck;", "onSignForm", "onConfirmSignature", "signature", "Lcom/robinhood/android/signature/SignatureView$Signature;", "onDepositAmountEditRequested", "onDirectDepositRequestSubmitted", "toggleOrientation", "isShowingSignature", "onActivityResult", "requestCode", "", "resultCode", WebsocketGatewayConstants.DATA_KEY, "Landroid/content/Intent;", "onDirectDepositCompleted", "source", "onBackPressed", "Callbacks", "State", "Args", "Companion", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes27.dex */
public final class PreFilledFormFlowFragment extends BaseFragment implements PreFilledFormIntroFragment.Callbacks, PreFilledFormConfirmEmployerFragment.Callbacks, PreFilledFormEmployerFragment.Callbacks, PreFilledFormAmountTypeFragment.Callbacks, PreFilledFormAmountInputFragment.Callbacks, PreFilledFormReviewFragment.Callbacks, PreFilledFormSignatureFragment.Callbacks, PreFilledFormSubmitFragment.Callbacks, PreFilledFormConfirmationFragment.Callbacks {
    private static final int REQUEST_CODE_EDIT_AMOUNT = 39;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: completedDirectDepositSource$delegate, reason: from kotlin metadata */
    private final Interfaces3 completedDirectDepositSource;

    /* renamed from: dropOffSurvey$delegate, reason: from kotlin metadata */
    private final Interfaces3 dropOffSurvey;

    /* renamed from: state$delegate, reason: from kotlin metadata */
    private final Interfaces3 state;
    private final boolean useDesignSystemToolbar;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(PreFilledFormFlowFragment.class, "state", "getState()Lcom/robinhood/android/directdeposit/ui/prefilled/PreFilledFormFlowFragment$State;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(PreFilledFormFlowFragment.class, DirectDepositShimKey.EXTRA_DROP_OFF_SURVEY, "getDropOffSurvey()Lcom/robinhood/userleap/survey/Survey;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(PreFilledFormFlowFragment.class, "completedDirectDepositSource", "getCompletedDirectDepositSource()Lcom/robinhood/android/common/directdeposit/DirectDepositSource;", 0)), Reflection.property1(new PropertyReference1Impl(PreFilledFormFlowFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/directdeposit/ui/prefilled/PreFilledFormFlowFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: PreFilledFormFlowFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0012\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/prefilled/PreFilledFormFlowFragment$Callbacks;", "", "onPrefilledFormFlowCompleted", "", "onPrefilledFormFlowCancelled", DirectDepositShimKey.EXTRA_DROP_OFF_SURVEY, "Lcom/robinhood/userleap/survey/Survey;", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {

        /* compiled from: PreFilledFormFlowFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class DefaultImpls {
            public static void onPrefilledFormFlowCancelled(Callbacks callbacks, Survey survey) {
            }
        }

        void onPrefilledFormFlowCancelled(Survey dropOffSurvey);

        void onPrefilledFormFlowCompleted();
    }

    public PreFilledFormFlowFragment() {
        super(C11048R.layout.parent_fragment_container);
        Interfaces interfacesSavedParcelable = BindSavedState2.savedParcelable(this, new State(null, null, null, 7, null));
        KProperty<?>[] kPropertyArr = $$delegatedProperties;
        this.state = (Interfaces3) interfacesSavedParcelable.provideDelegate(this, kPropertyArr[0]);
        this.useDesignSystemToolbar = true;
        this.dropOffSurvey = (Interfaces3) BindSavedState2.savedSerializable(this).provideDelegate(this, kPropertyArr[1]);
        this.completedDirectDepositSource = (Interfaces3) BindSavedState2.savedSerializable(this).provideDelegate(this, kPropertyArr[2]);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.directdeposit.ui.prefilled.PreFilledFormFlowFragment$special$$inlined$parentFragmentThenActivityHostCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                ActivityResultCaller parentFragment = CallbacksProperty.getParentFragment();
                if (!(parentFragment instanceof PreFilledFormFlowFragment.Callbacks)) {
                    parentFragment = null;
                }
                PreFilledFormFlowFragment.Callbacks callbacks = (PreFilledFormFlowFragment.Callbacks) parentFragment;
                if (callbacks != null) {
                    return callbacks;
                }
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof PreFilledFormFlowFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
    }

    private final State getState() {
        return (State) this.state.getValue(this, $$delegatedProperties[0]);
    }

    private final void setState(State state) {
        this.state.setValue(this, $$delegatedProperties[0], state);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.directdeposit.ui.prefilled.employer.PreFilledFormConfirmEmployerFragment.Callbacks
    public String getUpdatedEmployer() {
        return getState().getEmployer();
    }

    private final Survey getDropOffSurvey() {
        return (Survey) this.dropOffSurvey.getValue(this, $$delegatedProperties[1]);
    }

    private final void setDropOffSurvey(Survey survey) {
        this.dropOffSurvey.setValue(this, $$delegatedProperties[1], survey);
    }

    private final DirectDepositSource getCompletedDirectDepositSource() {
        return (DirectDepositSource) this.completedDirectDepositSource.getValue(this, $$delegatedProperties[2]);
    }

    private final void setCompletedDirectDepositSource(DirectDepositSource directDepositSource) {
        this.completedDirectDepositSource.setValue(this, $$delegatedProperties[2], directDepositSource);
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[3]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setElevation(0.0f);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(scarletContextWrapper), AchromaticOverlay.INSTANCE, null, 2, null);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            setFragment(C14044R.id.fragment_container, PreFilledFormIntroFragment.INSTANCE.newInstance());
        }
    }

    @Override // com.robinhood.android.directdeposit.ui.prefilled.PreFilledFormIntroFragment.Callbacks
    public void onConfirmEmployer(String employerName) {
        Intrinsics.checkNotNullParameter(employerName, "employerName");
        setDropOffSurvey(null);
        PreFilledFormConfirmEmployerFragment.Companion companion = PreFilledFormConfirmEmployerFragment.INSTANCE;
        String updatedEmployer = getUpdatedEmployer();
        if (updatedEmployer != null) {
            employerName = updatedEmployer;
        }
        replaceFragment(companion.newInstance((Parcelable) new PreFilledFormConfirmEmployerFragment.Args(employerName)));
    }

    @Override // com.robinhood.android.directdeposit.ui.prefilled.PreFilledFormIntroFragment.Callbacks, com.robinhood.android.directdeposit.ui.prefilled.employer.PreFilledFormConfirmEmployerFragment.Callbacks
    public void onUpdateEmployer() {
        setDropOffSurvey(null);
        replaceFragment(PreFilledFormEmployerFragment.INSTANCE.newInstance());
    }

    @Override // com.robinhood.android.directdeposit.ui.prefilled.employer.PreFilledFormConfirmEmployerFragment.Callbacks, com.robinhood.android.directdeposit.ui.prefilled.employer.PreFilledFormEmployerFragment.Callbacks
    public void onEmployerConfirmed(String employer, boolean updatedEmploymentInfo) {
        Intrinsics.checkNotNullParameter(employer, "employer");
        setState(State.copy$default(getState(), employer, null, null, 6, null));
        if (updatedEmploymentInfo) {
            RdsSnackbar.Companion companion = RdsSnackbar.INSTANCE;
            Snackbars snackbars = Snackbars.INSTANCE;
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            companion.make(snackbars.findRoot(fragmentActivityRequireActivity), C14044R.string.pre_filled_form_account_updated, -1).setLeadingIcon(C13997R.drawable.svg_ic_checkmark_24dp).show();
        }
        setDropOffSurvey(Survey.DIRECT_DEPOSIT_PARTIAL_PAYCHECK_DROP_OFF);
        replaceFragment(PreFilledFormAmountTypeFragment.INSTANCE.newInstance((Parcelable) new PreFilledFormAmountTypeFragment.Args(null)));
    }

    @Override // com.robinhood.android.directdeposit.ui.prefilled.partial.PreFilledFormAmountTypeFragment.Callbacks
    public void onEntirePaycheckSelected() {
        setState(State.copy$default(getState(), null, DirectDepositAmount.EntirePaycheck.INSTANCE, null, 5, null));
        PreFilledFormReviewFragment.Companion companion = PreFilledFormReviewFragment.INSTANCE;
        String employer = getState().getEmployer();
        Intrinsics.checkNotNull(employer);
        replaceFragment(companion.newInstance(employer, getState().getDepositAmount()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.android.directdeposit.ui.prefilled.partial.PreFilledFormAmountTypeFragment.Callbacks
    public void onPaycheckPercentSelected() {
        replaceFragment(PreFilledFormAmountInputFragment.INSTANCE.newInstance((Parcelable) new PreFilledFormAmountInputFragment.Args(InputType.PERCENT, null, 2, 0 == true ? 1 : 0)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.android.directdeposit.ui.prefilled.partial.PreFilledFormAmountTypeFragment.Callbacks
    public void onPaycheckDollarAmountSelected() {
        replaceFragment(PreFilledFormAmountInputFragment.INSTANCE.newInstance((Parcelable) new PreFilledFormAmountInputFragment.Args(InputType.DOLLARS, null, 2, 0 == true ? 1 : 0)));
    }

    @Override // com.robinhood.android.directdeposit.ui.prefilled.partial.input.PreFilledFormAmountInputFragment.Callbacks
    public void onPartialAmountConfirmed(DirectDepositAmount.PartialPaycheck amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        setState(State.copy$default(getState(), null, amount, null, 5, null));
        PreFilledFormReviewFragment.Companion companion = PreFilledFormReviewFragment.INSTANCE;
        String employer = getState().getEmployer();
        Intrinsics.checkNotNull(employer);
        replaceFragment(companion.newInstance(employer, amount));
    }

    @Override // com.robinhood.android.directdeposit.ui.prefilled.PreFilledFormReviewFragment.Callbacks
    public void onSignForm() {
        toggleOrientation(true);
        replaceFragment(PreFilledFormSignatureFragment.INSTANCE.newInstance());
    }

    @Override // com.robinhood.android.directdeposit.ui.prefilled.PreFilledFormSignatureFragment.Callbacks
    public void onConfirmSignature(SignatureView.Signature signature) {
        Intrinsics.checkNotNullParameter(signature, "signature");
        setState(State.copy$default(getState(), null, null, signature, 3, null));
        toggleOrientation(false);
        PreFilledFormSubmitFragment.Companion companion = PreFilledFormSubmitFragment.INSTANCE;
        String employer = getState().getEmployer();
        Intrinsics.checkNotNull(employer);
        SignatureView.Signature signature2 = getState().getSignature();
        Intrinsics.checkNotNull(signature2);
        replaceFragment(companion.newInstance((Parcelable) new PreFilledFormSubmitFragment.Args(getState().getDepositAmount(), employer, signature2)));
    }

    @Override // com.robinhood.android.directdeposit.ui.prefilled.PreFilledFormReviewFragment.Callbacks, com.robinhood.android.directdeposit.ui.prefilled.submit.PreFilledFormSubmitFragment.Callbacks
    public void onDepositAmountEditRequested() {
        Navigator.DefaultImpls.startActivityForResult$default(getNavigator(), (Fragment) this, (IntentKey) new LegacyIntentKey.DirectDepositEditAmount(getState().getDepositAmount()), 39, (PerformanceMetricEventData.Source) null, false, (Function1) null, (NavigationType) null, 120, (Object) null);
    }

    @Override // com.robinhood.android.directdeposit.ui.prefilled.submit.PreFilledFormSubmitFragment.Callbacks
    public void onDirectDepositRequestSubmitted() {
        setCompletedDirectDepositSource(DirectDepositSource.MANUAL_FORM_HR);
        replaceFragment(PreFilledFormConfirmationFragment.INSTANCE.newInstance((Parcelable) new PreFilledFormConfirmationFragment.Args(((Args) INSTANCE.getArgs((Fragment) this)).getFromDDOnboardingFlow())));
    }

    private final void toggleOrientation(boolean isShowingSignature) {
        requireActivity().setRequestedOrientation(!isShowingSignature ? 1 : 0);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 39 && resultCode == -1) {
            Intrinsics.checkNotNull(data);
            Parcelable parcelableExtra = data.getParcelableExtra(EditDepositAmountActivity.EXTRA_DEPOSIT_AMOUNT);
            Intrinsics.checkNotNull(parcelableExtra);
            DirectDepositAmount directDepositAmount = (DirectDepositAmount) parcelableExtra;
            ActivityResultCaller currentFragment = getCurrentFragment();
            Intrinsics.checkNotNull(currentFragment, "null cannot be cast to non-null type com.robinhood.android.directdeposit.ui.prefilled.partial.EditDepositAmountActivity.OnEditListener");
            setState(State.copy$default(getState(), null, directDepositAmount, null, 5, null));
            ((EditDepositAmountActivity.OnEditListener) currentFragment).onDepositAmountEdited(directDepositAmount);
        }
    }

    @Override // com.robinhood.android.directdeposit.ui.prefilled.confirmation.PreFilledFormConfirmationFragment.Callbacks
    public void onDirectDepositCompleted(DirectDepositSource source) {
        Intrinsics.checkNotNullParameter(source, "source");
        setCompletedDirectDepositSource(source);
        getCallbacks().onPrefilledFormFlowCompleted();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        Fragment currentFragment = getCurrentFragment();
        if (currentFragment instanceof PreFilledFormIntroFragment) {
            getCallbacks().onPrefilledFormFlowCancelled(getDropOffSurvey());
        } else if (currentFragment instanceof PreFilledFormSignatureFragment) {
            toggleOrientation(false);
        } else if (currentFragment instanceof PreFilledFormSubmitFragment) {
            toggleOrientation(true);
        }
        return super.onBackPressed();
    }

    /* compiled from: PreFilledFormFlowFragment.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0083\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/prefilled/PreFilledFormFlowFragment$State;", "Landroid/os/Parcelable;", "employer", "", EditDepositAmountActivity.EXTRA_DEPOSIT_AMOUNT, "Lcom/robinhood/models/ui/DirectDepositAmount;", "signature", "Lcom/robinhood/android/signature/SignatureView$Signature;", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/ui/DirectDepositAmount;Lcom/robinhood/android/signature/SignatureView$Signature;)V", "getEmployer", "()Ljava/lang/String;", "getDepositAmount", "()Lcom/robinhood/models/ui/DirectDepositAmount;", "getSignature", "()Lcom/robinhood/android/signature/SignatureView$Signature;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final /* data */ class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new Creator();
        private final DirectDepositAmount depositAmount;
        private final String employer;
        private final SignatureView.Signature signature;

        /* compiled from: PreFilledFormFlowFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<State> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final State createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new State(parcel.readString(), (DirectDepositAmount) parcel.readParcelable(State.class.getClassLoader()), (SignatureView.Signature) parcel.readParcelable(State.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final State[] newArray(int i) {
                return new State[i];
            }
        }

        public State() {
            this(null, null, null, 7, null);
        }

        public static /* synthetic */ State copy$default(State state, String str, DirectDepositAmount directDepositAmount, SignatureView.Signature signature, int i, Object obj) {
            if ((i & 1) != 0) {
                str = state.employer;
            }
            if ((i & 2) != 0) {
                directDepositAmount = state.depositAmount;
            }
            if ((i & 4) != 0) {
                signature = state.signature;
            }
            return state.copy(str, directDepositAmount, signature);
        }

        /* renamed from: component1, reason: from getter */
        public final String getEmployer() {
            return this.employer;
        }

        /* renamed from: component2, reason: from getter */
        public final DirectDepositAmount getDepositAmount() {
            return this.depositAmount;
        }

        /* renamed from: component3, reason: from getter */
        public final SignatureView.Signature getSignature() {
            return this.signature;
        }

        public final State copy(String employer, DirectDepositAmount depositAmount, SignatureView.Signature signature) {
            Intrinsics.checkNotNullParameter(depositAmount, "depositAmount");
            return new State(employer, depositAmount, signature);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof State)) {
                return false;
            }
            State state = (State) other;
            return Intrinsics.areEqual(this.employer, state.employer) && Intrinsics.areEqual(this.depositAmount, state.depositAmount) && Intrinsics.areEqual(this.signature, state.signature);
        }

        public int hashCode() {
            String str = this.employer;
            int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.depositAmount.hashCode()) * 31;
            SignatureView.Signature signature = this.signature;
            return iHashCode + (signature != null ? signature.hashCode() : 0);
        }

        public String toString() {
            return "State(employer=" + this.employer + ", depositAmount=" + this.depositAmount + ", signature=" + this.signature + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.employer);
            dest.writeParcelable(this.depositAmount, flags);
            dest.writeParcelable(this.signature, flags);
        }

        public State(String str, DirectDepositAmount depositAmount, SignatureView.Signature signature) {
            Intrinsics.checkNotNullParameter(depositAmount, "depositAmount");
            this.employer = str;
            this.depositAmount = depositAmount;
            this.signature = signature;
        }

        public final String getEmployer() {
            return this.employer;
        }

        public /* synthetic */ State(String str, DirectDepositAmount directDepositAmount, SignatureView.Signature signature, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? DirectDepositAmount.Unsupported.INSTANCE : directDepositAmount, (i & 4) != 0 ? null : signature);
        }

        public final DirectDepositAmount getDepositAmount() {
            return this.depositAmount;
        }

        public final SignatureView.Signature getSignature() {
            return this.signature;
        }
    }

    /* compiled from: PreFilledFormFlowFragment.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/prefilled/PreFilledFormFlowFragment$Args;", "Landroid/os/Parcelable;", "fromDDOnboardingFlow", "", "<init>", "(Z)V", "getFromDDOnboardingFlow", "()Z", "component1", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final boolean fromDDOnboardingFlow;

        /* compiled from: PreFilledFormFlowFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public Args() {
            this(false, 1, null);
        }

        public static /* synthetic */ Args copy$default(Args args, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = args.fromDDOnboardingFlow;
            }
            return args.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getFromDDOnboardingFlow() {
            return this.fromDDOnboardingFlow;
        }

        public final Args copy(boolean fromDDOnboardingFlow) {
            return new Args(fromDDOnboardingFlow);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Args) && this.fromDDOnboardingFlow == ((Args) other).fromDDOnboardingFlow;
        }

        public int hashCode() {
            return Boolean.hashCode(this.fromDDOnboardingFlow);
        }

        public String toString() {
            return "Args(fromDDOnboardingFlow=" + this.fromDDOnboardingFlow + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.fromDDOnboardingFlow ? 1 : 0);
        }

        public Args(boolean z) {
            this.fromDDOnboardingFlow = z;
        }

        public /* synthetic */ Args(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }

        public final boolean getFromDDOnboardingFlow() {
            return this.fromDDOnboardingFlow;
        }
    }

    /* compiled from: PreFilledFormFlowFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/prefilled/PreFilledFormFlowFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/directdeposit/ui/prefilled/PreFilledFormFlowFragment;", "Lcom/robinhood/android/directdeposit/ui/prefilled/PreFilledFormFlowFragment$Args;", "<init>", "()V", "REQUEST_CODE_EDIT_AMOUNT", "", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<PreFilledFormFlowFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(PreFilledFormFlowFragment preFilledFormFlowFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, preFilledFormFlowFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public PreFilledFormFlowFragment newInstance(Args args) {
            return (PreFilledFormFlowFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(PreFilledFormFlowFragment preFilledFormFlowFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, preFilledFormFlowFragment, args);
        }
    }
}
