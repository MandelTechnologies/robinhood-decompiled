package com.robinhood.android.shareholderexperience.questionlist;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.shareholderexperience.C28477R;
import com.robinhood.android.shareholderexperience.databinding.FragmentQuestionMultiActionBottomSheetBinding;
import com.robinhood.shareholderx.models.p401db.ShareholderQuestion;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsAndCallbacksCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.Metadata;
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

/* compiled from: QuestionMultiActionBottomSheetFragment.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\r¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/questionlist/QuestionMultiActionBottomSheetFragment;", "Lcom/robinhood/android/common/ui/BaseBottomSheetDialogFragment;", "<init>", "()V", "binding", "Lcom/robinhood/android/shareholderexperience/databinding/FragmentQuestionMultiActionBottomSheetBinding;", "getBinding", "()Lcom/robinhood/android/shareholderexperience/databinding/FragmentQuestionMultiActionBottomSheetBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/shareholderexperience/questionlist/QuestionActionCallbacks;", "getCallbacks", "()Lcom/robinhood/android/shareholderexperience/questionlist/QuestionActionCallbacks;", "callbacks$delegate", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class QuestionMultiActionBottomSheetFragment extends BaseBottomSheetDialogFragment {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(QuestionMultiActionBottomSheetFragment.class, "binding", "getBinding()Lcom/robinhood/android/shareholderexperience/databinding/FragmentQuestionMultiActionBottomSheetBinding;", 0)), Reflection.property1(new PropertyReference1Impl(QuestionMultiActionBottomSheetFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/shareholderexperience/questionlist/QuestionActionCallbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public QuestionMultiActionBottomSheetFragment() {
        super(C28477R.layout.fragment_question_multi_action_bottom_sheet);
        this.binding = ViewBinding5.viewBinding(this, QuestionMultiActionBottomSheetFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(QuestionActionCallbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.shareholderexperience.questionlist.QuestionMultiActionBottomSheetFragment$special$$inlined$targetFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment targetFragment = CallbacksProperty.getTargetFragment();
                if (targetFragment != null) {
                    return targetFragment;
                }
                throw new IllegalStateException("Required value was null.");
            }
        });
    }

    private final FragmentQuestionMultiActionBottomSheetBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentQuestionMultiActionBottomSheetBinding) value;
    }

    private final QuestionActionCallbacks getCallbacks() {
        return (QuestionActionCallbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    /* compiled from: QuestionMultiActionBottomSheetFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.shareholderexperience.questionlist.QuestionMultiActionBottomSheetFragment$onViewCreated$1 */
    /* synthetic */ class C285261 extends FunctionReferenceImpl implements Function0<Unit> {
        C285261(Object obj) {
            super(0, obj, QuestionMultiActionBottomSheetFragment.class, "dismiss", "dismiss()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((QuestionMultiActionBottomSheetFragment) this.receiver).dismiss();
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        RdsButton questionMultiActionDoneButton = getBinding().questionMultiActionDoneButton;
        Intrinsics.checkNotNullExpressionValue(questionMultiActionDoneButton, "questionMultiActionDoneButton");
        OnClickListeners.onClick(questionMultiActionDoneButton, new C285261(this));
        RdsRowView questionMultiActionDeleteRow = getBinding().questionMultiActionDeleteRow;
        Intrinsics.checkNotNullExpressionValue(questionMultiActionDeleteRow, "questionMultiActionDeleteRow");
        OnClickListeners.onClick(questionMultiActionDeleteRow, new Function0() { // from class: com.robinhood.android.shareholderexperience.questionlist.QuestionMultiActionBottomSheetFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return QuestionMultiActionBottomSheetFragment.onViewCreated$lambda$0(this.f$0);
            }
        });
        RdsRowView questionMultiActionShareRow = getBinding().questionMultiActionShareRow;
        Intrinsics.checkNotNullExpressionValue(questionMultiActionShareRow, "questionMultiActionShareRow");
        OnClickListeners.onClick(questionMultiActionShareRow, new Function0() { // from class: com.robinhood.android.shareholderexperience.questionlist.QuestionMultiActionBottomSheetFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return QuestionMultiActionBottomSheetFragment.onViewCreated$lambda$1(this.f$0);
            }
        });
        RdsRowView questionMultiActionShareRow2 = getBinding().questionMultiActionShareRow;
        Intrinsics.checkNotNullExpressionValue(questionMultiActionShareRow2, "questionMultiActionShareRow");
        questionMultiActionShareRow2.setVisibility(((ShareholderQuestion) INSTANCE.getArgs((Fragment) this)).getShareCopy() != null ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(QuestionMultiActionBottomSheetFragment questionMultiActionBottomSheetFragment) {
        questionMultiActionBottomSheetFragment.getCallbacks().onDeleteClicked((ShareholderQuestion) INSTANCE.getArgs((Fragment) questionMultiActionBottomSheetFragment));
        questionMultiActionBottomSheetFragment.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(QuestionMultiActionBottomSheetFragment questionMultiActionBottomSheetFragment) {
        questionMultiActionBottomSheetFragment.getCallbacks().onShareClicked((ShareholderQuestion) INSTANCE.getArgs((Fragment) questionMultiActionBottomSheetFragment));
        questionMultiActionBottomSheetFragment.dismiss();
        return Unit.INSTANCE;
    }

    /* compiled from: QuestionMultiActionBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/questionlist/QuestionMultiActionBottomSheetFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsAndCallbacksCompanion;", "Lcom/robinhood/android/shareholderexperience/questionlist/QuestionMultiActionBottomSheetFragment;", "Lcom/robinhood/shareholderx/models/db/ShareholderQuestion;", "Lcom/robinhood/android/shareholderexperience/questionlist/QuestionActionCallbacks;", "<init>", "()V", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsAndCallbacksCompanion<QuestionMultiActionBottomSheetFragment, ShareholderQuestion, QuestionActionCallbacks> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public ShareholderQuestion getArgs(QuestionMultiActionBottomSheetFragment questionMultiActionBottomSheetFragment) {
            return (ShareholderQuestion) FragmentWithArgsAndCallbacksCompanion.DefaultImpls.getArgs(this, questionMultiActionBottomSheetFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsAndCallbacksCompanion
        public /* bridge */ /* synthetic */ DialogFragment newInstance(Parcelable parcelable, Fragment fragment, int i) {
            return newInstance((ShareholderQuestion) parcelable, (ShareholderQuestion) fragment, i);
        }

        public <C extends Fragment & QuestionActionCallbacks> QuestionMultiActionBottomSheetFragment newInstance(ShareholderQuestion shareholderQuestion, C c, int i) {
            return (QuestionMultiActionBottomSheetFragment) FragmentWithArgsAndCallbacksCompanion.DefaultImpls.newInstance(this, shareholderQuestion, c, i);
        }
    }
}
