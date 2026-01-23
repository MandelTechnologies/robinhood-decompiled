package com.robinhood.android.recommendations.p224ui.confirmation;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.common.p088ui.BaseDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.row.RdsDataRowView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.recommendations.C25978R;
import com.robinhood.android.recommendations.databinding.FragmentRecommendationsQuestionnaireConfirmationBinding;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.recommendations.models.p363ui.UiRecommendationsRiskProfile;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import java.util.UUID;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: RecommendationsQuestionnaireConfirmationFragment.kt */
@Metadata(m3635d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 62\u00020\u00012\u00020\u0002:\u0003456B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\b\u0010,\u001a\u00020-H\u0016J\u001a\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u0002002\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\u0010\u00101\u001a\u00020-2\u0006\u00102\u001a\u000203H\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\u00020\u001bX\u0094D¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001bX\u0094D¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0014\u0010 \u001a\u00020!X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020%X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u00067"}, m3636d2 = {"Lcom/robinhood/android/recommendations/ui/confirmation/RecommendationsQuestionnaireConfirmationFragment;", "Lcom/robinhood/android/common/ui/BaseDialogFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "binding", "Lcom/robinhood/android/recommendations/databinding/FragmentRecommendationsQuestionnaireConfirmationBinding;", "getBinding", "()Lcom/robinhood/android/recommendations/databinding/FragmentRecommendationsQuestionnaireConfirmationBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/recommendations/ui/confirmation/RecommendationsQuestionnaireConfirmationFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/recommendations/ui/confirmation/RecommendationsQuestionnaireConfirmationFragment$Callbacks;", "callbacks$delegate", "duxo", "Lcom/robinhood/android/recommendations/ui/confirmation/RecommendationsQuestionnaireConfirmationDuxo;", "getDuxo", "()Lcom/robinhood/android/recommendations/ui/confirmation/RecommendationsQuestionnaireConfirmationDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "adapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/designsystem/row/RdsDataRowView;", "Lcom/robinhood/recommendations/models/ui/UiRecommendationsRiskProfile$QuestionAnswerSummary;", "dialogWidth", "", "getDialogWidth", "()I", "dialogHeight", "getDialogHeight", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "excludeFromAutoScreenDisappearEventLogging", "", "getExcludeFromAutoScreenDisappearEventLogging", "()Z", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "", "onViewCreated", "view", "Landroid/view/View;", "setViewState", "viewState", "Lcom/robinhood/android/recommendations/ui/confirmation/RecommendationsQuestionnaireConfirmationViewState;", "Callbacks", "Args", "Companion", "feature-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class RecommendationsQuestionnaireConfirmationFragment extends BaseDialogFragment implements AutoLoggableFragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RecommendationsQuestionnaireConfirmationFragment.class, "binding", "getBinding()Lcom/robinhood/android/recommendations/databinding/FragmentRecommendationsQuestionnaireConfirmationBinding;", 0)), Reflection.property1(new PropertyReference1Impl(RecommendationsQuestionnaireConfirmationFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/recommendations/ui/confirmation/RecommendationsQuestionnaireConfirmationFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final GenericListAdapter<RdsDataRowView, UiRecommendationsRiskProfile.QuestionAnswerSummary> adapter;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    private final int dialogHeight;
    private final int dialogWidth;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private final Screen eventScreen;
    private final boolean excludeFromAutoScreenDisappearEventLogging;

    /* compiled from: RecommendationsQuestionnaireConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0003H&¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/recommendations/ui/confirmation/RecommendationsQuestionnaireConfirmationFragment$Callbacks;", "", "onAnswersConfirmed", "", "submissionId", "Ljava/util/UUID;", "riskProfile", "Lcom/robinhood/recommendations/models/ui/UiRecommendationsRiskProfile;", "onAnswersNotConfirmed", "feature-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onAnswersConfirmed(UUID submissionId, UiRecommendationsRiskProfile riskProfile);

        void onAnswersNotConfirmed();
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenAppearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenAppearEventLogging(this);
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

    public RecommendationsQuestionnaireConfirmationFragment() {
        super(C25978R.layout.fragment_recommendations_questionnaire_confirmation);
        this.binding = ViewBinding5.viewBinding(this, RecommendationsQuestionnaireConfirmationFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.recommendations.ui.confirmation.RecommendationsQuestionnaireConfirmationFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
        this.duxo = OldDuxos.oldDuxo(this, RecommendationsQuestionnaireConfirmationDuxo.class);
        this.adapter = GenericListAdapter.INSTANCE.m2987of(RdsDataRowView.INSTANCE, DiffCallbacks.Equality.INSTANCE, new Function2() { // from class: com.robinhood.android.recommendations.ui.confirmation.RecommendationsQuestionnaireConfirmationFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return RecommendationsQuestionnaireConfirmationFragment.adapter$lambda$0((RdsDataRowView) obj, (UiRecommendationsRiskProfile.QuestionAnswerSummary) obj2);
            }
        });
        this.dialogWidth = -1;
        this.dialogHeight = -1;
        this.eventScreen = new Screen(Screen.Name.RECS_CONFIRM_QUESTIONNAIRE, null, null, null, 14, null);
        this.excludeFromAutoScreenDisappearEventLogging = true;
    }

    private final FragmentRecommendationsQuestionnaireConfirmationBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentRecommendationsQuestionnaireConfirmationBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    private final RecommendationsQuestionnaireConfirmationDuxo getDuxo() {
        return (RecommendationsQuestionnaireConfirmationDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit adapter$lambda$0(RdsDataRowView of, UiRecommendationsRiskProfile.QuestionAnswerSummary answer) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(answer, "answer");
        of.setLabelText(answer.getQuestion());
        of.setValueText(answer.getAnswer());
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment
    protected int getDialogWidth() {
        return this.dialogWidth;
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment
    protected int getDialogHeight() {
        return this.dialogHeight;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return this.eventScreen;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenDisappearEventLogging() {
        return this.excludeFromAutoScreenDisappearEventLogging;
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog dialog = new Dialog(requireContext(), getThemeResId()) { // from class: com.robinhood.android.recommendations.ui.confirmation.RecommendationsQuestionnaireConfirmationFragment.onCreateDialog.1
            @Override // android.app.Dialog
            @Deprecated
            public void onBackPressed() {
                RecommendationsQuestionnaireConfirmationFragment.this.getCallbacks().onAnswersNotConfirmed();
            }
        };
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        return dialog;
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C261101(this));
    }

    /* compiled from: RecommendationsQuestionnaireConfirmationFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.recommendations.ui.confirmation.RecommendationsQuestionnaireConfirmationFragment$onResume$1 */
    /* synthetic */ class C261101 extends FunctionReferenceImpl implements Function1<RecommendationsQuestionnaireConfirmationViewState, Unit> {
        C261101(Object obj) {
            super(1, obj, RecommendationsQuestionnaireConfirmationFragment.class, "setViewState", "setViewState(Lcom/robinhood/android/recommendations/ui/confirmation/RecommendationsQuestionnaireConfirmationViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RecommendationsQuestionnaireConfirmationViewState recommendationsQuestionnaireConfirmationViewState) throws Throwable {
            invoke2(recommendationsQuestionnaireConfirmationViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(RecommendationsQuestionnaireConfirmationViewState p0) throws Throwable {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((RecommendationsQuestionnaireConfirmationFragment) this.receiver).setViewState(p0);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        FragmentRecommendationsQuestionnaireConfirmationBinding binding = getBinding();
        RhTextView rhTextView = binding.title;
        Companion companion = INSTANCE;
        UiRecommendationsRiskProfile.ConfirmationPage confirmationPage = ((Args) companion.getArgs((Fragment) this)).getRiskProfile().getConfirmationPage();
        rhTextView.setText(confirmationPage != null ? confirmationPage.getTitle() : null);
        RhTextView rhTextView2 = binding.subtitle;
        UiRecommendationsRiskProfile.ConfirmationPage confirmationPage2 = ((Args) companion.getArgs((Fragment) this)).getRiskProfile().getConfirmationPage();
        rhTextView2.setText(confirmationPage2 != null ? confirmationPage2.getSubtitle() : null);
        RecyclerView list = binding.list;
        Intrinsics.checkNotNullExpressionValue(list, "list");
        bindAdapter(list, this.adapter);
        RdsButton confirmBtn = binding.confirmBtn;
        Intrinsics.checkNotNullExpressionValue(confirmBtn, "confirmBtn");
        ViewsKt.eventData$default(confirmBtn, false, new Function0() { // from class: com.robinhood.android.recommendations.ui.confirmation.RecommendationsQuestionnaireConfirmationFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RecommendationsQuestionnaireConfirmationFragment.onViewCreated$lambda$3$lambda$2();
            }
        }, 1, null);
        RdsButton rdsButton = binding.confirmBtn;
        UiRecommendationsRiskProfile.ConfirmationPage confirmationPage3 = ((Args) companion.getArgs((Fragment) this)).getRiskProfile().getConfirmationPage();
        rdsButton.setText(confirmationPage3 != null ? confirmationPage3.getContinueButtonTitle() : null);
        RdsButton confirmBtn2 = binding.confirmBtn;
        Intrinsics.checkNotNullExpressionValue(confirmBtn2, "confirmBtn");
        OnClickListeners.onClick(confirmBtn2, new RecommendationsQuestionnaireConfirmationFragment3(getDuxo()));
        RdsButton rdsButton2 = binding.backBtn;
        UiRecommendationsRiskProfile.ConfirmationPage confirmationPage4 = ((Args) companion.getArgs((Fragment) this)).getRiskProfile().getConfirmationPage();
        rdsButton2.setText(confirmationPage4 != null ? confirmationPage4.getDismissButtonTitle() : null);
        RdsButton backBtn = binding.backBtn;
        Intrinsics.checkNotNullExpressionValue(backBtn, "backBtn");
        OnClickListeners.onClick(backBtn, new RecommendationsQuestionnaireConfirmationFragment4(getCallbacks()));
        ImageView navCloseBtn = binding.navCloseBtn;
        Intrinsics.checkNotNullExpressionValue(navCloseBtn, "navCloseBtn");
        OnClickListeners.onClick(navCloseBtn, new RecommendationsQuestionnaireConfirmationFragment5(getCallbacks()));
        GenericListAdapter<RdsDataRowView, UiRecommendationsRiskProfile.QuestionAnswerSummary> genericListAdapter = this.adapter;
        UiRecommendationsRiskProfile.ConfirmationPage confirmationPage5 = ((Args) companion.getArgs((Fragment) this)).getRiskProfile().getConfirmationPage();
        genericListAdapter.submitList(confirmationPage5 != null ? confirmationPage5.getEntryRows() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor onViewCreated$lambda$3$lambda$2() {
        return new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.CONTINUE, null, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 43, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setViewState(RecommendationsQuestionnaireConfirmationViewState viewState) throws Throwable {
        Throwable thConsume;
        getBinding().confirmBtn.setLoading(viewState.isLoading());
        UiEvent<Throwable> errorEvent = viewState.getErrorEvent();
        if (errorEvent != null && (thConsume = errorEvent.consume()) != null) {
            ActivityErrorHandler.Companion companion = ActivityErrorHandler.INSTANCE;
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            ActivityErrorHandler.Companion.handle$default(companion, fragmentActivityRequireActivity, thConsume, true, false, 0, null, 56, null);
        }
        if (viewState.getHasConfirmed()) {
            Callbacks callbacks = getCallbacks();
            Companion companion2 = INSTANCE;
            callbacks.onAnswersConfirmed(((Args) companion2.getArgs((Fragment) this)).getSubmissionId(), ((Args) companion2.getArgs((Fragment) this)).getRiskProfile());
        }
    }

    /* compiled from: RecommendationsQuestionnaireConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/recommendations/ui/confirmation/RecommendationsQuestionnaireConfirmationFragment$Args;", "Landroid/os/Parcelable;", "riskProfile", "Lcom/robinhood/recommendations/models/ui/UiRecommendationsRiskProfile;", "submissionId", "Ljava/util/UUID;", "<init>", "(Lcom/robinhood/recommendations/models/ui/UiRecommendationsRiskProfile;Ljava/util/UUID;)V", "getRiskProfile", "()Lcom/robinhood/recommendations/models/ui/UiRecommendationsRiskProfile;", "getSubmissionId", "()Ljava/util/UUID;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final UiRecommendationsRiskProfile riskProfile;
        private final UUID submissionId;

        /* compiled from: RecommendationsQuestionnaireConfirmationFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((UiRecommendationsRiskProfile) parcel.readParcelable(Args.class.getClassLoader()), (UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, UiRecommendationsRiskProfile uiRecommendationsRiskProfile, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uiRecommendationsRiskProfile = args.riskProfile;
            }
            if ((i & 2) != 0) {
                uuid = args.submissionId;
            }
            return args.copy(uiRecommendationsRiskProfile, uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UiRecommendationsRiskProfile getRiskProfile() {
            return this.riskProfile;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getSubmissionId() {
            return this.submissionId;
        }

        public final Args copy(UiRecommendationsRiskProfile riskProfile, UUID submissionId) {
            Intrinsics.checkNotNullParameter(riskProfile, "riskProfile");
            Intrinsics.checkNotNullParameter(submissionId, "submissionId");
            return new Args(riskProfile, submissionId);
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
            return Intrinsics.areEqual(this.riskProfile, args.riskProfile) && Intrinsics.areEqual(this.submissionId, args.submissionId);
        }

        public int hashCode() {
            return (this.riskProfile.hashCode() * 31) + this.submissionId.hashCode();
        }

        public String toString() {
            return "Args(riskProfile=" + this.riskProfile + ", submissionId=" + this.submissionId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.riskProfile, flags);
            dest.writeSerializable(this.submissionId);
        }

        public Args(UiRecommendationsRiskProfile riskProfile, UUID submissionId) {
            Intrinsics.checkNotNullParameter(riskProfile, "riskProfile");
            Intrinsics.checkNotNullParameter(submissionId, "submissionId");
            this.riskProfile = riskProfile;
            this.submissionId = submissionId;
        }

        public final UiRecommendationsRiskProfile getRiskProfile() {
            return this.riskProfile;
        }

        public final UUID getSubmissionId() {
            return this.submissionId;
        }
    }

    /* compiled from: RecommendationsQuestionnaireConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/recommendations/ui/confirmation/RecommendationsQuestionnaireConfirmationFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/recommendations/ui/confirmation/RecommendationsQuestionnaireConfirmationFragment;", "Lcom/robinhood/android/recommendations/ui/confirmation/RecommendationsQuestionnaireConfirmationFragment$Args;", "<init>", "()V", "feature-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<RecommendationsQuestionnaireConfirmationFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(RecommendationsQuestionnaireConfirmationFragment recommendationsQuestionnaireConfirmationFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, recommendationsQuestionnaireConfirmationFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public RecommendationsQuestionnaireConfirmationFragment newInstance(Args args) {
            return (RecommendationsQuestionnaireConfirmationFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(RecommendationsQuestionnaireConfirmationFragment recommendationsQuestionnaireConfirmationFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, recommendationsQuestionnaireConfirmationFragment, args);
        }
    }
}
