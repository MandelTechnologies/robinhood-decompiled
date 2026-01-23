package com.robinhood.android.shareholderexperience.questionlist;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.p088ui.BaseDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.shareholderexperience.C28477R;
import com.robinhood.android.shareholderexperience.databinding.FragmentQuestionConfirmDeleteDialogBinding;
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

/* compiled from: QuestionConfirmDeleteDialogFragment.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0002\u0017\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/questionlist/QuestionConfirmDeleteDialogFragment;", "Lcom/robinhood/android/common/ui/BaseDialogFragment;", "<init>", "()V", "binding", "Lcom/robinhood/android/shareholderexperience/databinding/FragmentQuestionConfirmDeleteDialogBinding;", "getBinding", "()Lcom/robinhood/android/shareholderexperience/databinding/FragmentQuestionConfirmDeleteDialogBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/shareholderexperience/questionlist/QuestionConfirmDeleteDialogFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/shareholderexperience/questionlist/QuestionConfirmDeleteDialogFragment$Callbacks;", "callbacks$delegate", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onCreateDialog", "Landroid/app/Dialog;", "Callbacks", "Companion", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class QuestionConfirmDeleteDialogFragment extends BaseDialogFragment {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(QuestionConfirmDeleteDialogFragment.class, "binding", "getBinding()Lcom/robinhood/android/shareholderexperience/databinding/FragmentQuestionConfirmDeleteDialogBinding;", 0)), Reflection.property1(new PropertyReference1Impl(QuestionConfirmDeleteDialogFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/shareholderexperience/questionlist/QuestionConfirmDeleteDialogFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: QuestionConfirmDeleteDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/questionlist/QuestionConfirmDeleteDialogFragment$Callbacks;", "", "onDeleteQuestionConfirmed", "", "question", "Lcom/robinhood/shareholderx/models/db/ShareholderQuestion;", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onDeleteQuestionConfirmed(ShareholderQuestion question);
    }

    public QuestionConfirmDeleteDialogFragment() {
        super(C28477R.layout.fragment_question_confirm_delete_dialog);
        this.binding = ViewBinding5.viewBinding(this, QuestionConfirmDeleteDialogFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.shareholderexperience.questionlist.QuestionConfirmDeleteDialogFragment$special$$inlined$targetFragmentCallbacks$1
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

    private final FragmentQuestionConfirmDeleteDialogBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentQuestionConfirmDeleteDialogBinding) value;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    /* compiled from: QuestionConfirmDeleteDialogFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.shareholderexperience.questionlist.QuestionConfirmDeleteDialogFragment$onViewCreated$1 */
    /* synthetic */ class C285121 extends FunctionReferenceImpl implements Function0<Unit> {
        C285121(Object obj) {
            super(0, obj, QuestionConfirmDeleteDialogFragment.class, "dismiss", "dismiss()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((QuestionConfirmDeleteDialogFragment) this.receiver).dismiss();
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        RdsButton questionCancelDeleteButton = getBinding().questionCancelDeleteButton;
        Intrinsics.checkNotNullExpressionValue(questionCancelDeleteButton, "questionCancelDeleteButton");
        OnClickListeners.onClick(questionCancelDeleteButton, new C285121(this));
        RdsButton questionConfirmDeleteButton = getBinding().questionConfirmDeleteButton;
        Intrinsics.checkNotNullExpressionValue(questionConfirmDeleteButton, "questionConfirmDeleteButton");
        OnClickListeners.onClick(questionConfirmDeleteButton, new Function0() { // from class: com.robinhood.android.shareholderexperience.questionlist.QuestionConfirmDeleteDialogFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return QuestionConfirmDeleteDialogFragment.onViewCreated$lambda$0(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(QuestionConfirmDeleteDialogFragment questionConfirmDeleteDialogFragment) {
        questionConfirmDeleteDialogFragment.dismiss();
        questionConfirmDeleteDialogFragment.getCallbacks().onDeleteQuestionConfirmed((ShareholderQuestion) INSTANCE.getArgs((Fragment) questionConfirmDeleteDialogFragment));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(savedInstanceState);
        Window window = dialogOnCreateDialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        return dialogOnCreateDialog;
    }

    /* compiled from: QuestionConfirmDeleteDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/questionlist/QuestionConfirmDeleteDialogFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsAndCallbacksCompanion;", "Lcom/robinhood/android/shareholderexperience/questionlist/QuestionConfirmDeleteDialogFragment;", "Lcom/robinhood/shareholderx/models/db/ShareholderQuestion;", "Lcom/robinhood/android/shareholderexperience/questionlist/QuestionConfirmDeleteDialogFragment$Callbacks;", "<init>", "()V", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsAndCallbacksCompanion<QuestionConfirmDeleteDialogFragment, ShareholderQuestion, Callbacks> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public ShareholderQuestion getArgs(QuestionConfirmDeleteDialogFragment questionConfirmDeleteDialogFragment) {
            return (ShareholderQuestion) FragmentWithArgsAndCallbacksCompanion.DefaultImpls.getArgs(this, questionConfirmDeleteDialogFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsAndCallbacksCompanion
        public /* bridge */ /* synthetic */ DialogFragment newInstance(Parcelable parcelable, Fragment fragment, int i) {
            return newInstance((ShareholderQuestion) parcelable, (ShareholderQuestion) fragment, i);
        }

        public <C extends Fragment & Callbacks> QuestionConfirmDeleteDialogFragment newInstance(ShareholderQuestion shareholderQuestion, C c, int i) {
            return (QuestionConfirmDeleteDialogFragment) FragmentWithArgsAndCallbacksCompanion.DefaultImpls.newInstance(this, shareholderQuestion, c, i);
        }
    }
}
