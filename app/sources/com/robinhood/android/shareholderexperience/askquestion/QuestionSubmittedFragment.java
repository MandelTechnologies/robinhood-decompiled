package com.robinhood.android.shareholderexperience.askquestion;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.shareholderexperience.C28477R;
import com.robinhood.android.shareholderexperience.UtilKt;
import com.robinhood.android.shareholderexperience.databinding.FragmentQuestionSubmittedBinding;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: QuestionSubmittedFragment.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/askquestion/QuestionSubmittedFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "binding", "Lcom/robinhood/android/shareholderexperience/databinding/FragmentQuestionSubmittedBinding;", "getBinding", "()Lcom/robinhood/android/shareholderexperience/databinding/FragmentQuestionSubmittedBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class QuestionSubmittedFragment extends BaseFragment {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(QuestionSubmittedFragment.class, "binding", "getBinding()Lcom/robinhood/android/shareholderexperience/databinding/FragmentQuestionSubmittedBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public QuestionSubmittedFragment() {
        super(C28477R.layout.fragment_question_submitted);
        this.binding = ViewBinding5.viewBinding(this, QuestionSubmittedFragment2.INSTANCE);
    }

    private final FragmentQuestionSubmittedBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentQuestionSubmittedBinding) value;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        FragmentQuestionSubmittedBinding binding = getBinding();
        RdsButton questionSubmitDoneButton = binding.questionSubmitDoneButton;
        Intrinsics.checkNotNullExpressionValue(questionSubmitDoneButton, "questionSubmitDoneButton");
        OnClickListeners.onClick(questionSubmitDoneButton, new Function0() { // from class: com.robinhood.android.shareholderexperience.askquestion.QuestionSubmittedFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return QuestionSubmittedFragment.onViewCreated$lambda$3$lambda$0(this.f$0);
            }
        });
        RdsButton questionSubmitShareButton = binding.questionSubmitShareButton;
        Intrinsics.checkNotNullExpressionValue(questionSubmitShareButton, "questionSubmitShareButton");
        questionSubmitShareButton.setVisibility(((LegacyFragmentKey.ShareholderQuestionSubmitted) INSTANCE.getArgs((Fragment) this)).getShareCopy() != null ? 0 : 8);
        RdsButton questionSubmitShareButton2 = binding.questionSubmitShareButton;
        Intrinsics.checkNotNullExpressionValue(questionSubmitShareButton2, "questionSubmitShareButton");
        OnClickListeners.onClick(questionSubmitShareButton2, new Function0() { // from class: com.robinhood.android.shareholderexperience.askquestion.QuestionSubmittedFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return QuestionSubmittedFragment.onViewCreated$lambda$3$lambda$2(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3$lambda$0(QuestionSubmittedFragment questionSubmittedFragment) {
        questionSubmittedFragment.requireBaseActivity().finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3$lambda$2(QuestionSubmittedFragment questionSubmittedFragment) {
        String shareCopy = ((LegacyFragmentKey.ShareholderQuestionSubmitted) INSTANCE.getArgs((Fragment) questionSubmittedFragment)).getShareCopy();
        if (shareCopy != null) {
            UtilKt.share(questionSubmittedFragment, shareCopy);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: QuestionSubmittedFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/askquestion/QuestionSubmittedFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/shareholderexperience/askquestion/QuestionSubmittedFragment;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$ShareholderQuestionSubmitted;", "<init>", "()V", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<QuestionSubmittedFragment, LegacyFragmentKey.ShareholderQuestionSubmitted> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LegacyFragmentKey.ShareholderQuestionSubmitted shareholderQuestionSubmitted) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, shareholderQuestionSubmitted);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LegacyFragmentKey.ShareholderQuestionSubmitted getArgs(QuestionSubmittedFragment questionSubmittedFragment) {
            return (LegacyFragmentKey.ShareholderQuestionSubmitted) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, questionSubmittedFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public QuestionSubmittedFragment newInstance(LegacyFragmentKey.ShareholderQuestionSubmitted shareholderQuestionSubmitted) {
            return (QuestionSubmittedFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, shareholderQuestionSubmitted);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(QuestionSubmittedFragment questionSubmittedFragment, LegacyFragmentKey.ShareholderQuestionSubmitted shareholderQuestionSubmitted) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, questionSubmittedFragment, shareholderQuestionSubmitted);
        }
    }
}
