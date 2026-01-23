package com.robinhood.android.shareholderexperience.questionlist;

import android.app.Dialog;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.p088ui.BaseDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.button.RdsIconButton;
import com.robinhood.android.shareholderexperience.C28477R;
import com.robinhood.android.shareholderexperience.databinding.FragmentQuestionModalDialogBinding;
import com.robinhood.android.shareholderexperience.databinding.QuestionContentViewBinding;
import com.robinhood.shareholderx.models.p401db.QaEventMetadata;
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

/* compiled from: QuestionModalDialogFragment.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0002\u0017\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/questionlist/QuestionModalDialogFragment;", "Lcom/robinhood/android/common/ui/BaseDialogFragment;", "<init>", "()V", "binding", "Lcom/robinhood/android/shareholderexperience/databinding/FragmentQuestionModalDialogBinding;", "getBinding", "()Lcom/robinhood/android/shareholderexperience/databinding/FragmentQuestionModalDialogBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/shareholderexperience/questionlist/QuestionActionCallbacks;", "getCallbacks", "()Lcom/robinhood/android/shareholderexperience/questionlist/QuestionActionCallbacks;", "callbacks$delegate", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onCreateDialog", "Landroid/app/Dialog;", "Args", "Companion", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class QuestionModalDialogFragment extends BaseDialogFragment {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(QuestionModalDialogFragment.class, "binding", "getBinding()Lcom/robinhood/android/shareholderexperience/databinding/FragmentQuestionModalDialogBinding;", 0)), Reflection.property1(new PropertyReference1Impl(QuestionModalDialogFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/shareholderexperience/questionlist/QuestionActionCallbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public QuestionModalDialogFragment() {
        super(C28477R.layout.fragment_question_modal_dialog);
        this.binding = ViewBinding5.viewBinding(this, QuestionModalDialogFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(QuestionActionCallbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.shareholderexperience.questionlist.QuestionModalDialogFragment$special$$inlined$targetFragmentCallbacks$1
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

    private final FragmentQuestionModalDialogBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentQuestionModalDialogBinding) value;
    }

    private final QuestionActionCallbacks getCallbacks() {
        return (QuestionActionCallbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        QuestionContentViewBinding questionModalContent = getBinding().questionModalContent;
        Intrinsics.checkNotNullExpressionValue(questionModalContent, "questionModalContent");
        Companion companion = INSTANCE;
        QuestionContentExtensions.bind(questionModalContent, ((Args) companion.getArgs((Fragment) this)).getQuestion(), new C285231(getCallbacks()));
        RdsIconButton questionShareButton = getBinding().questionModalContent.questionShareButton;
        Intrinsics.checkNotNullExpressionValue(questionShareButton, "questionShareButton");
        questionShareButton.setVisibility(8);
        RdsButton questionModalShareButton = getBinding().questionModalShareButton;
        Intrinsics.checkNotNullExpressionValue(questionModalShareButton, "questionModalShareButton");
        questionModalShareButton.setVisibility(((Args) companion.getArgs((Fragment) this)).getQuestion().getShareCopy() != null ? 0 : 8);
        RdsButton questionModalDeleteButton = getBinding().questionModalDeleteButton;
        Intrinsics.checkNotNullExpressionValue(questionModalDeleteButton, "questionModalDeleteButton");
        questionModalDeleteButton.setVisibility(((Args) companion.getArgs((Fragment) this)).getQuestion().getCanDelete() ? 0 : 8);
        getBinding().questionModalCloseButton.setText(getResources().getString(C28477R.string.question_modal_dismiss, ((Args) companion.getArgs((Fragment) this)).getEventMetadata().getHeader().getSymbol()));
        RdsButton questionModalCloseButton = getBinding().questionModalCloseButton;
        Intrinsics.checkNotNullExpressionValue(questionModalCloseButton, "questionModalCloseButton");
        OnClickListeners.onClick(questionModalCloseButton, new C285242(this));
        RdsButton questionModalShareButton2 = getBinding().questionModalShareButton;
        Intrinsics.checkNotNullExpressionValue(questionModalShareButton2, "questionModalShareButton");
        OnClickListeners.onClick(questionModalShareButton2, new Function0() { // from class: com.robinhood.android.shareholderexperience.questionlist.QuestionModalDialogFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return QuestionModalDialogFragment.onViewCreated$lambda$0(this.f$0);
            }
        });
        RdsButton questionModalDeleteButton2 = getBinding().questionModalDeleteButton;
        Intrinsics.checkNotNullExpressionValue(questionModalDeleteButton2, "questionModalDeleteButton");
        OnClickListeners.onClick(questionModalDeleteButton2, new Function0() { // from class: com.robinhood.android.shareholderexperience.questionlist.QuestionModalDialogFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return QuestionModalDialogFragment.onViewCreated$lambda$1(this.f$0);
            }
        });
    }

    /* compiled from: QuestionModalDialogFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.shareholderexperience.questionlist.QuestionModalDialogFragment$onViewCreated$1 */
    /* synthetic */ class C285231 extends FunctionReferenceImpl implements Function1<ShareholderQuestion, Unit> {
        C285231(Object obj) {
            super(1, obj, QuestionActionCallbacks.class, "onVoteClicked", "onVoteClicked(Lcom/robinhood/shareholderx/models/db/ShareholderQuestion;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ShareholderQuestion shareholderQuestion) {
            invoke2(shareholderQuestion);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(ShareholderQuestion p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((QuestionActionCallbacks) this.receiver).onVoteClicked(p0);
        }
    }

    /* compiled from: QuestionModalDialogFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.shareholderexperience.questionlist.QuestionModalDialogFragment$onViewCreated$2 */
    /* synthetic */ class C285242 extends FunctionReferenceImpl implements Function0<Unit> {
        C285242(Object obj) {
            super(0, obj, QuestionModalDialogFragment.class, "dismiss", "dismiss()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((QuestionModalDialogFragment) this.receiver).dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(QuestionModalDialogFragment questionModalDialogFragment) {
        questionModalDialogFragment.getCallbacks().onShareClicked(((Args) INSTANCE.getArgs((Fragment) questionModalDialogFragment)).getQuestion());
        questionModalDialogFragment.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(QuestionModalDialogFragment questionModalDialogFragment) {
        questionModalDialogFragment.getCallbacks().onDeleteClicked(((Args) INSTANCE.getArgs((Fragment) questionModalDialogFragment)).getQuestion());
        questionModalDialogFragment.dismiss();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(savedInstanceState);
        dialogOnCreateDialog.setCanceledOnTouchOutside(false);
        Window window = dialogOnCreateDialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        return dialogOnCreateDialog;
    }

    /* compiled from: QuestionModalDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/questionlist/QuestionModalDialogFragment$Args;", "Landroid/os/Parcelable;", "question", "Lcom/robinhood/shareholderx/models/db/ShareholderQuestion;", "eventMetadata", "Lcom/robinhood/shareholderx/models/db/QaEventMetadata;", "<init>", "(Lcom/robinhood/shareholderx/models/db/ShareholderQuestion;Lcom/robinhood/shareholderx/models/db/QaEventMetadata;)V", "getQuestion", "()Lcom/robinhood/shareholderx/models/db/ShareholderQuestion;", "getEventMetadata", "()Lcom/robinhood/shareholderx/models/db/QaEventMetadata;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final QaEventMetadata eventMetadata;
        private final ShareholderQuestion question;

        /* compiled from: QuestionModalDialogFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((ShareholderQuestion) parcel.readParcelable(Args.class.getClassLoader()), (QaEventMetadata) parcel.readParcelable(Args.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, ShareholderQuestion shareholderQuestion, QaEventMetadata qaEventMetadata, int i, Object obj) {
            if ((i & 1) != 0) {
                shareholderQuestion = args.question;
            }
            if ((i & 2) != 0) {
                qaEventMetadata = args.eventMetadata;
            }
            return args.copy(shareholderQuestion, qaEventMetadata);
        }

        /* renamed from: component1, reason: from getter */
        public final ShareholderQuestion getQuestion() {
            return this.question;
        }

        /* renamed from: component2, reason: from getter */
        public final QaEventMetadata getEventMetadata() {
            return this.eventMetadata;
        }

        public final Args copy(ShareholderQuestion question, QaEventMetadata eventMetadata) {
            Intrinsics.checkNotNullParameter(question, "question");
            Intrinsics.checkNotNullParameter(eventMetadata, "eventMetadata");
            return new Args(question, eventMetadata);
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
            return Intrinsics.areEqual(this.question, args.question) && Intrinsics.areEqual(this.eventMetadata, args.eventMetadata);
        }

        public int hashCode() {
            return (this.question.hashCode() * 31) + this.eventMetadata.hashCode();
        }

        public String toString() {
            return "Args(question=" + this.question + ", eventMetadata=" + this.eventMetadata + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.question, flags);
            dest.writeParcelable(this.eventMetadata, flags);
        }

        public Args(ShareholderQuestion question, QaEventMetadata eventMetadata) {
            Intrinsics.checkNotNullParameter(question, "question");
            Intrinsics.checkNotNullParameter(eventMetadata, "eventMetadata");
            this.question = question;
            this.eventMetadata = eventMetadata;
        }

        public final ShareholderQuestion getQuestion() {
            return this.question;
        }

        public final QaEventMetadata getEventMetadata() {
            return this.eventMetadata;
        }
    }

    /* compiled from: QuestionModalDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/questionlist/QuestionModalDialogFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsAndCallbacksCompanion;", "Lcom/robinhood/android/shareholderexperience/questionlist/QuestionModalDialogFragment;", "Lcom/robinhood/android/shareholderexperience/questionlist/QuestionModalDialogFragment$Args;", "Lcom/robinhood/android/shareholderexperience/questionlist/QuestionActionCallbacks;", "<init>", "()V", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsAndCallbacksCompanion<QuestionModalDialogFragment, Args, QuestionActionCallbacks> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(QuestionModalDialogFragment questionModalDialogFragment) {
            return (Args) FragmentWithArgsAndCallbacksCompanion.DefaultImpls.getArgs(this, questionModalDialogFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsAndCallbacksCompanion
        public /* bridge */ /* synthetic */ DialogFragment newInstance(Parcelable parcelable, Fragment fragment, int i) {
            return newInstance((Args) parcelable, (Args) fragment, i);
        }

        public <C extends Fragment & QuestionActionCallbacks> QuestionModalDialogFragment newInstance(Args args, C c, int i) {
            return (QuestionModalDialogFragment) FragmentWithArgsAndCallbacksCompanion.DefaultImpls.newInstance(this, args, c, i);
        }
    }
}
