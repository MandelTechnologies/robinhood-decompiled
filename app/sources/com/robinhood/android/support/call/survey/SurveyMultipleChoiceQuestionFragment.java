package com.robinhood.android.support.call.survey;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewGroup2;
import androidx.fragment.app.Fragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.extensions.RichTexts;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.chip.RdsChip;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.p355ui.pathfinder.contexts.SurveyMultipleChoiceQuestionContext;
import com.robinhood.models.serverdriven.p347db.RichText;
import com.robinhood.rosetta.converters.platform.Booleans2;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.InAppSurvey;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.support.C39996R;
import com.robinhood.shared.support.databinding.FragmentSurveyMultipleChoiceQuestionBinding;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* compiled from: SurveyMultipleChoiceQuestionFragment.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 %2\u00020\u0001:\u0002$%B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0015H\u0016J\u001a\u0010\u001b\u001a\u00020\u0015*\u00020\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0002J\u0018\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u001fH\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/support/call/survey/SurveyMultipleChoiceQuestionFragment;", "Lcom/robinhood/android/support/call/survey/BaseSurveyFragment;", "<init>", "()V", "binding", "Lcom/robinhood/shared/support/databinding/FragmentSurveyMultipleChoiceQuestionBinding;", "getBinding", "()Lcom/robinhood/shared/support/databinding/FragmentSurveyMultipleChoiceQuestionBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/support/call/survey/SurveyMultipleChoiceQuestionDuxo;", "getDuxo", "()Lcom/robinhood/android/support/call/survey/SurveyMultipleChoiceQuestionDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "eventScreenName", "Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "getEventScreenName", "()Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "bindChoices", "Landroidx/constraintlayout/helper/widget/Flow;", WebsocketGatewayConstants.DATA_KEY, "", "Lcom/robinhood/android/support/call/survey/ChoiceEntry;", "bindChip", "Lcom/robinhood/android/designsystem/chip/RdsChip;", "chip", "choice", "Chip", "Companion", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class SurveyMultipleChoiceQuestionFragment extends BaseSurveyFragment {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private final Screen.Name eventScreenName;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(SurveyMultipleChoiceQuestionFragment.class, "binding", "getBinding()Lcom/robinhood/shared/support/databinding/FragmentSurveyMultipleChoiceQuestionBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public SurveyMultipleChoiceQuestionFragment() {
        super(C39996R.layout.fragment_survey_multiple_choice_question);
        this.binding = ViewBinding5.viewBinding(this, SurveyMultipleChoiceQuestionFragment2.INSTANCE);
        this.duxo = OldDuxos.oldDuxo(this, SurveyMultipleChoiceQuestionDuxo.class);
        this.eventScreenName = Screen.Name.CX_SURVEY_MULTIPLE_CHOICE_QUESTION;
    }

    private final FragmentSurveyMultipleChoiceQuestionBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentSurveyMultipleChoiceQuestionBinding) value;
    }

    private final SurveyMultipleChoiceQuestionDuxo getDuxo() {
        return (SurveyMultipleChoiceQuestionDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.support.call.survey.BaseSurveyFragment
    public Screen.Name getEventScreenName() {
        return this.eventScreenName;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        RdsButton surveyMultiChoiceContinueBtn = getBinding().surveyMultiChoiceContinueBtn;
        Intrinsics.checkNotNullExpressionValue(surveyMultiChoiceContinueBtn, "surveyMultiChoiceContinueBtn");
        OnClickListeners.onClick(surveyMultiChoiceContinueBtn, new Function0() { // from class: com.robinhood.android.support.call.survey.SurveyMultipleChoiceQuestionFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SurveyMultipleChoiceQuestionFragment.onViewCreated$lambda$0(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(SurveyMultipleChoiceQuestionFragment surveyMultipleChoiceQuestionFragment) {
        surveyMultipleChoiceQuestionFragment.getDuxo().submitChoices(surveyMultipleChoiceQuestionFragment.getDuxo().getStatesFlow().getValue().getSelectedChoiceIds());
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.support.call.survey.SurveyMultipleChoiceQuestionFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SurveyMultipleChoiceQuestionFragment.onStart$lambda$1(this.f$0, (SurveyMultipleChoiceQuestionViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(SurveyMultipleChoiceQuestionFragment surveyMultipleChoiceQuestionFragment, SurveyMultipleChoiceQuestionViewState state) throws Throwable {
        Throwable thConsume;
        Intrinsics.checkNotNullParameter(state, "state");
        SurveyMultipleChoiceQuestionContext content = state.getContent();
        if (content == null) {
            return Unit.INSTANCE;
        }
        surveyMultipleChoiceQuestionFragment.getBinding().surveyMultiChoiceProgressBar.setProgress(content.getProgressPercentage());
        surveyMultipleChoiceQuestionFragment.getBinding().surveyMultiChoicePog.setPictogram(ContextCompat.getDrawable(surveyMultipleChoiceQuestionFragment.requireContext(), content.getPictogram().getResourceId()));
        RhTextView rhTextView = surveyMultipleChoiceQuestionFragment.getBinding().surveyMultiChoiceTitleTxt;
        RichText title = content.getTitle();
        Context contextRequireContext = surveyMultipleChoiceQuestionFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        rhTextView.setText(RichTexts.toSpannableString$default(title, contextRequireContext, null, false, null, 14, null));
        RhTextView rhTextView2 = surveyMultipleChoiceQuestionFragment.getBinding().surveyMultiChoiceSubtitleTxt;
        RichText subtitle = content.getSubtitle();
        Context contextRequireContext2 = surveyMultipleChoiceQuestionFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
        rhTextView2.setText(RichTexts.toSpannableString$default(subtitle, contextRequireContext2, null, false, null, 14, null));
        Flow surveyMultiChoiceFlow = surveyMultipleChoiceQuestionFragment.getBinding().surveyMultiChoiceFlow;
        Intrinsics.checkNotNullExpressionValue(surveyMultiChoiceFlow, "surveyMultiChoiceFlow");
        surveyMultipleChoiceQuestionFragment.bindChoices(surveyMultiChoiceFlow, state.getChoices());
        surveyMultipleChoiceQuestionFragment.getBinding().surveyMultiChoiceContinueBtn.setText(content.getConfirmButtonTitle());
        surveyMultipleChoiceQuestionFragment.getBinding().surveyMultiChoiceContinueBtn.setLoading(state.isLoading());
        surveyMultipleChoiceQuestionFragment.setQuestionId(content.getQuestionId());
        UiEvent<Throwable> errorEvent = state.getErrorEvent();
        if (errorEvent != null && (thConsume = errorEvent.consume()) != null) {
            surveyMultipleChoiceQuestionFragment.handleError(thConsume);
        }
        return Unit.INSTANCE;
    }

    private final void bindChoices(Flow flow, List<ChoiceEntry> list) {
        ConstraintLayout root = getBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        Sequence sequenceFilter = SequencesKt.filter(ViewGroup2.getChildren(root), new Function1<Object, Boolean>() { // from class: com.robinhood.android.support.call.survey.SurveyMultipleChoiceQuestionFragment$bindChoices$$inlined$filterIsInstance$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof RdsChip);
            }
        });
        Intrinsics.checkNotNull(sequenceFilter, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
        List mutableList = SequencesKt.toMutableList(sequenceFilter);
        int size = list.size() - mutableList.size();
        int i = 0;
        if (size > 0) {
            for (int i2 = 0; i2 < size; i2++) {
                Chip chip = Chip.INSTANCE;
                ConstraintLayout root2 = getBinding().getRoot();
                Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
                RdsChip rdsChipInflate = chip.inflate((ViewGroup) root2);
                rdsChipInflate.setId(View.generateViewId());
                getBinding().getRoot().addView(rdsChipInflate);
                flow.addView(rdsChipInflate);
                mutableList.add(rdsChipInflate);
            }
        } else if (size < 0) {
            for (RdsChip rdsChip : CollectionsKt.takeLast(mutableList, -size)) {
                getBinding().getRoot().removeView(rdsChip);
                flow.removeView(rdsChip);
                mutableList.remove(rdsChip);
            }
        }
        for (Object obj : list) {
            int i3 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            bindChip((RdsChip) mutableList.get(i), (ChoiceEntry) obj);
            i = i3;
        }
    }

    private final RdsChip bindChip(final RdsChip chip, final ChoiceEntry choice) {
        chip.setText(choice.getData().getText());
        chip.setSelected(choice.isSelected());
        ViewsKt.eventData$default(chip, false, new Function0() { // from class: com.robinhood.android.support.call.survey.SurveyMultipleChoiceQuestionFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SurveyMultipleChoiceQuestionFragment.bindChip$lambda$8$lambda$6(this.f$0, choice, chip);
            }
        }, 1, null);
        OnClickListeners.onClick(chip, new Function0() { // from class: com.robinhood.android.support.call.survey.SurveyMultipleChoiceQuestionFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SurveyMultipleChoiceQuestionFragment.bindChip$lambda$8$lambda$7(this.f$0, choice, chip);
            }
        });
        return chip;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor bindChip$lambda$8$lambda$6(SurveyMultipleChoiceQuestionFragment surveyMultipleChoiceQuestionFragment, ChoiceEntry choiceEntry, RdsChip rdsChip) {
        Screen screen = new Screen(surveyMultipleChoiceQuestionFragment.getEventScreenName(), null, null, null, 14, null);
        Component component = new Component(Component.ComponentType.CHIP, null, null, 6, null);
        String string2 = surveyMultipleChoiceQuestionFragment.getCallbacks().getInquiryId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return new UserInteractionEventDescriptor(null, screen, null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, new InAppSurvey(string2, surveyMultipleChoiceQuestionFragment.getQuestionId(), choiceEntry.getData().getId(), Booleans2.toProtobuf(Boolean.valueOf(rdsChip.isSelected())), null, null, null, 112, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -524289, -1, -1, -1, -1, -1, 16383, null), component, null, 37, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindChip$lambda$8$lambda$7(SurveyMultipleChoiceQuestionFragment surveyMultipleChoiceQuestionFragment, ChoiceEntry choiceEntry, RdsChip rdsChip) {
        surveyMultipleChoiceQuestionFragment.getDuxo().updateSelection(choiceEntry.getData().getId(), !rdsChip.isSelected());
        return Unit.INSTANCE;
    }

    /* compiled from: SurveyMultipleChoiceQuestionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/support/call/survey/SurveyMultipleChoiceQuestionFragment$Chip;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/designsystem/chip/RdsChip;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Chip implements Inflater<RdsChip> {
        private final /* synthetic */ Inflater<RdsChip> $$delegate_0 = Inflater.INSTANCE.include(C39996R.layout.include_survey_multiple_choice_chip);
        public static final Chip INSTANCE = new Chip();
        public static final int $stable = 8;

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public RdsChip inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (RdsChip) this.$$delegate_0.inflate(parent);
        }

        private Chip() {
        }
    }

    /* compiled from: SurveyMultipleChoiceQuestionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/support/call/survey/SurveyMultipleChoiceQuestionFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/support/call/survey/SurveyMultipleChoiceQuestionFragment;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$SurveyMultipleChoiceQuestion;", "<init>", "()V", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<SurveyMultipleChoiceQuestionFragment, LegacyFragmentKey.SurveyMultipleChoiceQuestion> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LegacyFragmentKey.SurveyMultipleChoiceQuestion surveyMultipleChoiceQuestion) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, surveyMultipleChoiceQuestion);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LegacyFragmentKey.SurveyMultipleChoiceQuestion getArgs(SurveyMultipleChoiceQuestionFragment surveyMultipleChoiceQuestionFragment) {
            return (LegacyFragmentKey.SurveyMultipleChoiceQuestion) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, surveyMultipleChoiceQuestionFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public SurveyMultipleChoiceQuestionFragment newInstance(LegacyFragmentKey.SurveyMultipleChoiceQuestion surveyMultipleChoiceQuestion) {
            return (SurveyMultipleChoiceQuestionFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, surveyMultipleChoiceQuestion);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(SurveyMultipleChoiceQuestionFragment surveyMultipleChoiceQuestionFragment, LegacyFragmentKey.SurveyMultipleChoiceQuestion surveyMultipleChoiceQuestion) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, surveyMultipleChoiceQuestionFragment, surveyMultipleChoiceQuestion);
        }
    }
}
