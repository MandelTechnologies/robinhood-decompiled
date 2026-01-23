package com.robinhood.android.support.call.survey;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.util.extensions.RichTexts;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.models.api.pathfinder.contexts.CtaActionType;
import com.robinhood.models.p355ui.pathfinder.contexts.SurveyCompleteContext;
import com.robinhood.models.p355ui.pathfinder.contexts.UserViewStatePageContext;
import com.robinhood.models.serverdriven.p347db.RichText;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.support.C39996R;
import com.robinhood.shared.support.databinding.FragmentSurveyCompleteBinding;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: SurveyCompleteFragment.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/support/call/survey/SurveyCompleteFragment;", "Lcom/robinhood/android/support/call/survey/BaseSurveyFragment;", "<init>", "()V", "binding", "Lcom/robinhood/shared/support/databinding/FragmentSurveyCompleteBinding;", "getBinding", "()Lcom/robinhood/shared/support/databinding/FragmentSurveyCompleteBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "eventScreenName", "Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "getEventScreenName", "()Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class SurveyCompleteFragment extends BaseSurveyFragment {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private final Screen.Name eventScreenName;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(SurveyCompleteFragment.class, "binding", "getBinding()Lcom/robinhood/shared/support/databinding/FragmentSurveyCompleteBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public SurveyCompleteFragment() {
        super(C39996R.layout.fragment_survey_complete);
        this.binding = ViewBinding5.viewBinding(this, SurveyCompleteFragment2.INSTANCE);
        this.eventScreenName = Screen.Name.CX_SURVEY_COMPLETE_PAGE;
    }

    private final FragmentSurveyCompleteBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentSurveyCompleteBinding) value;
    }

    @Override // com.robinhood.android.support.call.survey.BaseSurveyFragment
    public Screen.Name getEventScreenName() {
        return this.eventScreenName;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        final SurveyCompleteContext context = ((UserViewStatePageContext.SurveyComplete) ((LegacyFragmentKey.SurveyComplete) INSTANCE.getArgs((Fragment) this)).getUserViewState().getTypeContext()).getContext();
        getBinding().surveyCompletePog.setPictogram(ContextCompat.getDrawable(requireContext(), context.getPictogram().getResourceId()));
        String text = context.getTitle().getText();
        RichText subtitle = context.getSubtitle();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        getBinding().surveyCompleteTitleTxt.setText(text + PlaceholderUtils.XXShortPlaceholderText + ((Object) RichTexts.toSpannableString$default(subtitle, contextRequireContext, null, false, null, 14, null)));
        getBinding().surveyCompleteBtn.setText(context.getCta().getText());
        RdsButton surveyCompleteBtn = getBinding().surveyCompleteBtn;
        Intrinsics.checkNotNullExpressionValue(surveyCompleteBtn, "surveyCompleteBtn");
        OnClickListeners.onClick(surveyCompleteBtn, new Function0() { // from class: com.robinhood.android.support.call.survey.SurveyCompleteFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SurveyCompleteFragment.onViewCreated$lambda$0(context, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(SurveyCompleteContext surveyCompleteContext, SurveyCompleteFragment surveyCompleteFragment) {
        if (surveyCompleteContext.getCta().getAction().getType() == CtaActionType.END_INQUIRY) {
            surveyCompleteFragment.logDismissEvent(true);
            surveyCompleteFragment.getCallbacks().dismissFlow();
        }
        return Unit.INSTANCE;
    }

    /* compiled from: SurveyCompleteFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/support/call/survey/SurveyCompleteFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/support/call/survey/SurveyCompleteFragment;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$SurveyComplete;", "<init>", "()V", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<SurveyCompleteFragment, LegacyFragmentKey.SurveyComplete> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LegacyFragmentKey.SurveyComplete surveyComplete) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, surveyComplete);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LegacyFragmentKey.SurveyComplete getArgs(SurveyCompleteFragment surveyCompleteFragment) {
            return (LegacyFragmentKey.SurveyComplete) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, surveyCompleteFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public SurveyCompleteFragment newInstance(LegacyFragmentKey.SurveyComplete surveyComplete) {
            return (SurveyCompleteFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, surveyComplete);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(SurveyCompleteFragment surveyCompleteFragment, LegacyFragmentKey.SurveyComplete surveyComplete) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, surveyCompleteFragment, surveyComplete);
        }
    }
}
