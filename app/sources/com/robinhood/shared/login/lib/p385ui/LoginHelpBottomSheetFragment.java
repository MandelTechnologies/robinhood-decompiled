package com.robinhood.shared.login.lib.p385ui;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.shared.login.lib.C39090R;
import com.robinhood.shared.login.lib.databinding.FragmentLoginHelpBottomSheetBinding;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: LoginHelpBottomSheetFragment.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0002\u0015\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/shared/login/lib/ui/LoginHelpBottomSheetFragment;", "Lcom/robinhood/android/common/ui/BaseBottomSheetDialogFragment;", "<init>", "()V", "callbacks", "Lcom/robinhood/shared/login/lib/ui/LoginHelpBottomSheetFragmentCallbacks;", "getCallbacks", "()Lcom/robinhood/shared/login/lib/ui/LoginHelpBottomSheetFragmentCallbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "binding", "Lcom/robinhood/shared/login/lib/databinding/FragmentLoginHelpBottomSheetBinding;", "getBinding", "()Lcom/robinhood/shared/login/lib/databinding/FragmentLoginHelpBottomSheetBinding;", "binding$delegate", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "Args", "Companion", "feature-lib-login_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class LoginHelpBottomSheetFragment extends BaseBottomSheetDialogFragment {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(LoginHelpBottomSheetFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/shared/login/lib/ui/LoginHelpBottomSheetFragmentCallbacks;", 0)), Reflection.property1(new PropertyReference1Impl(LoginHelpBottomSheetFragment.class, "binding", "getBinding()Lcom/robinhood/shared/login/lib/databinding/FragmentLoginHelpBottomSheetBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public LoginHelpBottomSheetFragment() {
        super(C39090R.layout.fragment_login_help_bottom_sheet);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(LoginHelpBottomSheetFragmentCallbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.shared.login.lib.ui.LoginHelpBottomSheetFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
        this.binding = ViewBinding5.viewBinding(this, LoginHelpBottomSheetFragment2.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LoginHelpBottomSheetFragmentCallbacks getCallbacks() {
        return (LoginHelpBottomSheetFragmentCallbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final FragmentLoginHelpBottomSheetBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[1]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentLoginHelpBottomSheetBinding) value;
    }

    @Override // com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getBinding().cancelBtn.setOnClickListener(new View.OnClickListener() { // from class: com.robinhood.shared.login.lib.ui.LoginHelpBottomSheetFragment.onViewCreated.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LoginHelpBottomSheetFragment.this.dismiss();
            }
        });
        RdsRowView loginHelpBottomSheetForgotEmailButton = getBinding().loginHelpBottomSheetForgotEmailButton;
        Intrinsics.checkNotNullExpressionValue(loginHelpBottomSheetForgotEmailButton, "loginHelpBottomSheetForgotEmailButton");
        Companion companion = INSTANCE;
        loginHelpBottomSheetForgotEmailButton.setVisibility(((Args) companion.getArgs((Fragment) this)).getForgotEmailEnabled() ? 0 : 8);
        if (((Args) companion.getArgs((Fragment) this)).getForgotEmailEnabled()) {
            getBinding().loginHelpBottomSheetForgotEmailButton.setOnClickListener(new View.OnClickListener() { // from class: com.robinhood.shared.login.lib.ui.LoginHelpBottomSheetFragment.onViewCreated.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    LoginHelpBottomSheetFragment.this.getCallbacks().onForgotEmailClicked();
                    LoginHelpBottomSheetFragment.this.dismiss();
                }
            });
        }
        getBinding().loginHelpBottomSheetForgotPasswordButton.setOnClickListener(new View.OnClickListener() { // from class: com.robinhood.shared.login.lib.ui.LoginHelpBottomSheetFragment.onViewCreated.3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LoginHelpBottomSheetFragment.this.getCallbacks().onForgotPasswordClicked();
                LoginHelpBottomSheetFragment.this.dismiss();
            }
        });
        getBinding().loginHelpBottomSheetSomethingElseButton.setOnClickListener(new View.OnClickListener() { // from class: com.robinhood.shared.login.lib.ui.LoginHelpBottomSheetFragment.onViewCreated.4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LoginHelpBottomSheetFragment.this.getCallbacks().onSomethingElseClicked();
                LoginHelpBottomSheetFragment.this.dismiss();
            }
        });
    }

    /* compiled from: LoginHelpBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/shared/login/lib/ui/LoginHelpBottomSheetFragment$Args;", "Landroid/os/Parcelable;", "forgotEmailEnabled", "", "<init>", "(Z)V", "getForgotEmailEnabled", "()Z", "component1", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-login_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final boolean forgotEmailEnabled;

        /* compiled from: LoginHelpBottomSheetFragment.kt */
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

        public static /* synthetic */ Args copy$default(Args args, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = args.forgotEmailEnabled;
            }
            return args.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getForgotEmailEnabled() {
            return this.forgotEmailEnabled;
        }

        public final Args copy(boolean forgotEmailEnabled) {
            return new Args(forgotEmailEnabled);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Args) && this.forgotEmailEnabled == ((Args) other).forgotEmailEnabled;
        }

        public int hashCode() {
            return Boolean.hashCode(this.forgotEmailEnabled);
        }

        public String toString() {
            return "Args(forgotEmailEnabled=" + this.forgotEmailEnabled + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.forgotEmailEnabled ? 1 : 0);
        }

        public Args(boolean z) {
            this.forgotEmailEnabled = z;
        }

        public final boolean getForgotEmailEnabled() {
            return this.forgotEmailEnabled;
        }
    }

    /* compiled from: LoginHelpBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/shared/login/lib/ui/LoginHelpBottomSheetFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/shared/login/lib/ui/LoginHelpBottomSheetFragment;", "Lcom/robinhood/shared/login/lib/ui/LoginHelpBottomSheetFragment$Args;", "<init>", "()V", "newInstance", "forgotEmailEnabled", "", "feature-lib-login_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<LoginHelpBottomSheetFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(LoginHelpBottomSheetFragment loginHelpBottomSheetFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, loginHelpBottomSheetFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public LoginHelpBottomSheetFragment newInstance(Args args) {
            return (LoginHelpBottomSheetFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(LoginHelpBottomSheetFragment loginHelpBottomSheetFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, loginHelpBottomSheetFragment, args);
        }

        public final LoginHelpBottomSheetFragment newInstance(boolean forgotEmailEnabled) {
            return (LoginHelpBottomSheetFragment) newInstance((Parcelable) new Args(forgotEmailEnabled));
        }
    }
}
