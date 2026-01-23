package com.robinhood.android.verification.email;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.verification.C31368R;
import com.robinhood.android.verification.databinding.FragmentEmailExceededNumberOfAttemptsBinding;
import com.robinhood.android.verification.email.EmailExceededNumberOfAttemptsFragment;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.util.NoSuchElementException;
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

/* compiled from: EmailExceededNumberOfAttemptsFragment.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0003\u001b\u001c\u001dB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/verification/email/EmailExceededNumberOfAttemptsFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "binding", "Lcom/robinhood/android/verification/databinding/FragmentEmailExceededNumberOfAttemptsBinding;", "getBinding", "()Lcom/robinhood/android/verification/databinding/FragmentEmailExceededNumberOfAttemptsBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/verification/email/EmailExceededNumberOfAttemptsFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/verification/email/EmailExceededNumberOfAttemptsFragment$Callbacks;", "callbacks$delegate", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onBackPressed", "", "screenDescription", "", "getScreenDescription", "()Ljava/lang/String;", "Callbacks", "Args", "Companion", "feature-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class EmailExceededNumberOfAttemptsFragment extends BaseFragment {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(EmailExceededNumberOfAttemptsFragment.class, "binding", "getBinding()Lcom/robinhood/android/verification/databinding/FragmentEmailExceededNumberOfAttemptsBinding;", 0)), Reflection.property1(new PropertyReference1Impl(EmailExceededNumberOfAttemptsFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/verification/email/EmailExceededNumberOfAttemptsFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: EmailExceededNumberOfAttemptsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/verification/email/EmailExceededNumberOfAttemptsFragment$Callbacks;", "", "onEmailExceededNumberOfAttemptsPrimaryCtaClicked", "", "onEmailExceededNumberOfAttemptsBackPressed", "", "feature-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        boolean onEmailExceededNumberOfAttemptsBackPressed();

        void onEmailExceededNumberOfAttemptsPrimaryCtaClicked();
    }

    public EmailExceededNumberOfAttemptsFragment() {
        super(C31368R.layout.fragment_email_exceeded_number_of_attempts);
        this.binding = ViewBinding5.viewBinding(this, EmailExceededNumberOfAttemptsFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.verification.email.EmailExceededNumberOfAttemptsFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof EmailExceededNumberOfAttemptsFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
    }

    private final FragmentEmailExceededNumberOfAttemptsBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentEmailExceededNumberOfAttemptsBinding) value;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getBinding().emailExceededNumberOfAttemptsPrimaryCta.setText(((Args) INSTANCE.getArgs((Fragment) this)).getPrimaryCtaStringRes());
        RdsButton emailExceededNumberOfAttemptsPrimaryCta = getBinding().emailExceededNumberOfAttemptsPrimaryCta;
        Intrinsics.checkNotNullExpressionValue(emailExceededNumberOfAttemptsPrimaryCta, "emailExceededNumberOfAttemptsPrimaryCta");
        OnClickListeners.onClick(emailExceededNumberOfAttemptsPrimaryCta, new C314021(getCallbacks()));
    }

    /* compiled from: EmailExceededNumberOfAttemptsFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.verification.email.EmailExceededNumberOfAttemptsFragment$onViewCreated$1 */
    /* synthetic */ class C314021 extends FunctionReferenceImpl implements Function0<Unit> {
        C314021(Object obj) {
            super(0, obj, Callbacks.class, "onEmailExceededNumberOfAttemptsPrimaryCtaClicked", "onEmailExceededNumberOfAttemptsPrimaryCtaClicked()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((Callbacks) this.receiver).onEmailExceededNumberOfAttemptsPrimaryCtaClicked();
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        return getCallbacks().onEmailExceededNumberOfAttemptsBackPressed() || super.onBackPressed();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenDescription() {
        return requireBaseActivity().getScreenDescription();
    }

    /* compiled from: EmailExceededNumberOfAttemptsFragment.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\u0003J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/verification/email/EmailExceededNumberOfAttemptsFragment$Args;", "Landroid/os/Parcelable;", "primaryCtaStringRes", "", "<init>", "(I)V", "getPrimaryCtaStringRes", "()I", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final int primaryCtaStringRes;

        /* compiled from: EmailExceededNumberOfAttemptsFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readInt());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.primaryCtaStringRes);
        }

        public Args(int i) {
            this.primaryCtaStringRes = i;
        }

        public final int getPrimaryCtaStringRes() {
            return this.primaryCtaStringRes;
        }
    }

    /* compiled from: EmailExceededNumberOfAttemptsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/verification/email/EmailExceededNumberOfAttemptsFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/verification/email/EmailExceededNumberOfAttemptsFragment;", "Lcom/robinhood/android/verification/email/EmailExceededNumberOfAttemptsFragment$Args;", "<init>", "()V", "feature-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<EmailExceededNumberOfAttemptsFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(EmailExceededNumberOfAttemptsFragment emailExceededNumberOfAttemptsFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, emailExceededNumberOfAttemptsFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public EmailExceededNumberOfAttemptsFragment newInstance(Args args) {
            return (EmailExceededNumberOfAttemptsFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(EmailExceededNumberOfAttemptsFragment emailExceededNumberOfAttemptsFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, emailExceededNumberOfAttemptsFragment, args);
        }
    }
}
