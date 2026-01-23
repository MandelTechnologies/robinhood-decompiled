package com.robinhood.android.challenge.verification;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.challenge.C10497R;
import com.robinhood.android.challenge.databinding.FragmentUpdateMfaMethodBinding;
import com.robinhood.android.challenge.verification.UpdateMfaMethodFragment;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: UpdateMfaMethodFragment.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001a\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0013\u001a\u00020\u0010H\u0016J\u001a\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u0010X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/challenge/verification/UpdateMfaMethodFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "binding", "Lcom/robinhood/android/challenge/databinding/FragmentUpdateMfaMethodBinding;", "getBinding", "()Lcom/robinhood/android/challenge/databinding/FragmentUpdateMfaMethodBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/challenge/verification/UpdateMfaMethodFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/challenge/verification/UpdateMfaMethodFragment$Callbacks;", "callbacks$delegate", "toolbarVisible", "", "getToolbarVisible", "()Z", "onBackPressed", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "Callbacks", "Companion", "feature-challenge_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class UpdateMfaMethodFragment extends BaseFragment {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    private final boolean toolbarVisible;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(UpdateMfaMethodFragment.class, "binding", "getBinding()Lcom/robinhood/android/challenge/databinding/FragmentUpdateMfaMethodBinding;", 0)), Reflection.property1(new PropertyReference1Impl(UpdateMfaMethodFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/challenge/verification/UpdateMfaMethodFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: UpdateMfaMethodFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/challenge/verification/UpdateMfaMethodFragment$Callbacks;", "", "onSelectVerifySms", "", "onSelectVerifyAuthApp", "feature-challenge_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onSelectVerifyAuthApp();

        void onSelectVerifySms();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        return true;
    }

    public UpdateMfaMethodFragment() {
        super(C10497R.layout.fragment_update_mfa_method);
        this.binding = ViewBinding5.viewBinding(this, UpdateMfaMethodFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.challenge.verification.UpdateMfaMethodFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof UpdateMfaMethodFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
    }

    private final FragmentUpdateMfaMethodBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentUpdateMfaMethodBinding) value;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        RdsRowView updateMfaAuthenticatorAppRow = getBinding().updateMfaAuthenticatorAppRow;
        Intrinsics.checkNotNullExpressionValue(updateMfaAuthenticatorAppRow, "updateMfaAuthenticatorAppRow");
        OnClickListeners.onClick(updateMfaAuthenticatorAppRow, new Function0() { // from class: com.robinhood.android.challenge.verification.UpdateMfaMethodFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UpdateMfaMethodFragment.onViewCreated$lambda$0(this.f$0);
            }
        });
        RdsRowView updateMfaTextMessageRow = getBinding().updateMfaTextMessageRow;
        Intrinsics.checkNotNullExpressionValue(updateMfaTextMessageRow, "updateMfaTextMessageRow");
        OnClickListeners.onClick(updateMfaTextMessageRow, new Function0() { // from class: com.robinhood.android.challenge.verification.UpdateMfaMethodFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UpdateMfaMethodFragment.onViewCreated$lambda$1(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(UpdateMfaMethodFragment updateMfaMethodFragment) {
        updateMfaMethodFragment.getCallbacks().onSelectVerifyAuthApp();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(UpdateMfaMethodFragment updateMfaMethodFragment) {
        updateMfaMethodFragment.getCallbacks().onSelectVerifySms();
        return Unit.INSTANCE;
    }

    /* compiled from: UpdateMfaMethodFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/challenge/verification/UpdateMfaMethodFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/robinhood/android/challenge/verification/UpdateMfaMethodFragment;", "feature-challenge_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final UpdateMfaMethodFragment newInstance() {
            return new UpdateMfaMethodFragment();
        }
    }
}
