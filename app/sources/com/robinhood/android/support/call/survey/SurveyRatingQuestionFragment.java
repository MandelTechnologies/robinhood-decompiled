package com.robinhood.android.support.call.survey;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.extensions.RichTexts;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.support.call.survey.SurveyRatingQuestionViewState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.p355ui.pathfinder.contexts.SurveyRatingQuestionContext;
import com.robinhood.models.serverdriven.p347db.RichText;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.support.C39996R;
import com.robinhood.shared.support.databinding.FragmentSurveyRatingQuestionBinding;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import com.robinhood.utils.p409ui.view.recyclerview.PaddingItemDecoration;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: SurveyRatingQuestionFragment.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000  2\u00020\u0001:\u0002\u001f B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0019H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u00020\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/support/call/survey/SurveyRatingQuestionFragment;", "Lcom/robinhood/android/support/call/survey/BaseSurveyFragment;", "<init>", "()V", "binding", "Lcom/robinhood/shared/support/databinding/FragmentSurveyRatingQuestionBinding;", "getBinding", "()Lcom/robinhood/shared/support/databinding/FragmentSurveyRatingQuestionBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/support/call/survey/SurveyRatingQuestionDuxo;", "getDuxo", "()Lcom/robinhood/android/support/call/survey/SurveyRatingQuestionDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "adapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/support/call/survey/SurveyRatingChipView;", "Lcom/robinhood/android/support/call/survey/SurveyRatingQuestionViewState$RatingEntry;", "eventScreenName", "Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "getEventScreenName", "()Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "ItemDecoration", "Companion", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class SurveyRatingQuestionFragment extends BaseSurveyFragment {
    private final GenericListAdapter<SurveyRatingChipView, SurveyRatingQuestionViewState.RatingEntry> adapter;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private final Screen.Name eventScreenName;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(SurveyRatingQuestionFragment.class, "binding", "getBinding()Lcom/robinhood/shared/support/databinding/FragmentSurveyRatingQuestionBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public SurveyRatingQuestionFragment() {
        super(C39996R.layout.fragment_survey_rating_question);
        this.binding = ViewBinding5.viewBinding(this, SurveyRatingQuestionFragment2.INSTANCE);
        this.duxo = OldDuxos.oldDuxo(this, SurveyRatingQuestionDuxo.class);
        this.adapter = GenericListAdapter.INSTANCE.m2987of(SurveyRatingChipView.INSTANCE, DiffCallbacks.INSTANCE.byEquality(new Function1() { // from class: com.robinhood.android.support.call.survey.SurveyRatingQuestionFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SurveyRatingQuestionFragment.adapter$lambda$0((SurveyRatingQuestionViewState.RatingEntry) obj);
            }
        }), new Function2() { // from class: com.robinhood.android.support.call.survey.SurveyRatingQuestionFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return SurveyRatingQuestionFragment.adapter$lambda$2(this.f$0, (SurveyRatingChipView) obj, (SurveyRatingQuestionViewState.RatingEntry) obj2);
            }
        });
        this.eventScreenName = Screen.Name.CX_SURVEY_RATING_QUESTION;
    }

    private final FragmentSurveyRatingQuestionBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentSurveyRatingQuestionBinding) value;
    }

    private final SurveyRatingQuestionDuxo getDuxo() {
        return (SurveyRatingQuestionDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object adapter$lambda$0(SurveyRatingQuestionViewState.RatingEntry byEquality) {
        Intrinsics.checkNotNullParameter(byEquality, "$this$byEquality");
        return byEquality.getData().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit adapter$lambda$2(final SurveyRatingQuestionFragment surveyRatingQuestionFragment, SurveyRatingChipView of, final SurveyRatingQuestionViewState.RatingEntry item) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(item, "item");
        of.bind(item);
        OnClickListeners.onClick(of, new Function0() { // from class: com.robinhood.android.support.call.survey.SurveyRatingQuestionFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SurveyRatingQuestionFragment.adapter$lambda$2$lambda$1(this.f$0, item);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit adapter$lambda$2$lambda$1(SurveyRatingQuestionFragment surveyRatingQuestionFragment, SurveyRatingQuestionViewState.RatingEntry ratingEntry) {
        surveyRatingQuestionFragment.getDuxo().selectRating(ratingEntry.getData());
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.support.call.survey.BaseSurveyFragment
    public Screen.Name getEventScreenName() {
        return this.eventScreenName;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        RecyclerView recyclerView = getBinding().surveyRatingRecyclerView;
        recyclerView.setItemAnimator(null);
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        recyclerView.addItemDecoration(new ItemDecoration(context, ((GridLayoutManager) layoutManager).getSpanCount()));
        Intrinsics.checkNotNull(recyclerView);
        bindAdapter(recyclerView, this.adapter);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.support.call.survey.SurveyRatingQuestionFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SurveyRatingQuestionFragment.onStart$lambda$4(this.f$0, (SurveyRatingQuestionViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$4(SurveyRatingQuestionFragment surveyRatingQuestionFragment, SurveyRatingQuestionViewState state) throws Throwable {
        Throwable thConsume;
        Intrinsics.checkNotNullParameter(state, "state");
        SurveyRatingQuestionContext content = state.getContent();
        if (content == null) {
            return Unit.INSTANCE;
        }
        surveyRatingQuestionFragment.getBinding().surveyRatingProgressBar.setProgress(content.getProgressPercentage());
        surveyRatingQuestionFragment.getBinding().surveyRatingPog.setPictogram(ContextCompat.getDrawable(surveyRatingQuestionFragment.requireContext(), content.getPictogram().getResourceId()));
        RhTextView rhTextView = surveyRatingQuestionFragment.getBinding().surveyRatingTitleTxt;
        RichText title = content.getTitle();
        Context contextRequireContext = surveyRatingQuestionFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        rhTextView.setText(RichTexts.toSpannableString$default(title, contextRequireContext, null, false, null, 14, null));
        GenericListAdapter<SurveyRatingChipView, SurveyRatingQuestionViewState.RatingEntry> genericListAdapter = surveyRatingQuestionFragment.adapter;
        List<SurveyRatingQuestionViewState.RatingEntry> ratingEntries = state.getRatingEntries();
        Intrinsics.checkNotNull(ratingEntries);
        genericListAdapter.submitList(ratingEntries);
        surveyRatingQuestionFragment.getBinding().surveyRatingLowDescriptionTxt.setText(content.getLowDescription());
        surveyRatingQuestionFragment.getBinding().surveyRatingHighDescriptionTxt.setText(content.getHighDescription());
        surveyRatingQuestionFragment.setQuestionId(content.getQuestionId());
        UiEvent<Throwable> errorEvent = state.getErrorEvent();
        if (errorEvent != null && (thConsume = errorEvent.consume()) != null) {
            surveyRatingQuestionFragment.handleError(thConsume);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: SurveyRatingQuestionFragment.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\t\u001a\u00020\u00052\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000b2\u0006\u0010\f\u001a\u00020\u0005H\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/support/call/survey/SurveyRatingQuestionFragment$ItemDecoration;", "Lcom/robinhood/utils/ui/view/recyclerview/PaddingItemDecoration;", "context", "Landroid/content/Context;", "spanCount", "", "<init>", "(Landroid/content/Context;I)V", "verticalSpacing", "getTopPadding", "adapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "position", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ItemDecoration extends PaddingItemDecoration {
        public static final int $stable = PaddingItemDecoration.$stable;
        private final int spanCount;
        private final int verticalSpacing;

        public ItemDecoration(Context context, int i) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.spanCount = i;
            this.verticalSpacing = context.getResources().getDimensionPixelSize(C13997R.dimen.rds_spacing_default);
        }

        @Override // com.robinhood.utils.p409ui.view.recyclerview.PaddingItemDecoration
        protected int getTopPadding(RecyclerView.Adapter<?> adapter, int position) {
            Intrinsics.checkNotNullParameter(adapter, "adapter");
            if (position < this.spanCount) {
                return 0;
            }
            return this.verticalSpacing;
        }
    }

    /* compiled from: SurveyRatingQuestionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/support/call/survey/SurveyRatingQuestionFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/support/call/survey/SurveyRatingQuestionFragment;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$SurveyRatingQuestion;", "<init>", "()V", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<SurveyRatingQuestionFragment, LegacyFragmentKey.SurveyRatingQuestion> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LegacyFragmentKey.SurveyRatingQuestion surveyRatingQuestion) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, surveyRatingQuestion);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LegacyFragmentKey.SurveyRatingQuestion getArgs(SurveyRatingQuestionFragment surveyRatingQuestionFragment) {
            return (LegacyFragmentKey.SurveyRatingQuestion) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, surveyRatingQuestionFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public SurveyRatingQuestionFragment newInstance(LegacyFragmentKey.SurveyRatingQuestion surveyRatingQuestion) {
            return (SurveyRatingQuestionFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, surveyRatingQuestion);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(SurveyRatingQuestionFragment surveyRatingQuestionFragment, LegacyFragmentKey.SurveyRatingQuestion surveyRatingQuestion) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, surveyRatingQuestionFragment, surveyRatingQuestion);
        }
    }
}
