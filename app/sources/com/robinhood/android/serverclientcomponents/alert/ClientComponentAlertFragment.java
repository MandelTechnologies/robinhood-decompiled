package com.robinhood.android.serverclientcomponents.alert;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.Fragment;
import androidx.view.result.ActivityResultCaller;
import com.robinhood.android.common.p088ui.BaseDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.navigation.DialogFragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyDialogFragmentKey;
import com.robinhood.android.serverclientcomponents.C28308R;
import com.robinhood.android.serverclientcomponents.actionbutton.ClientComponentButtonView;
import com.robinhood.android.serverclientcomponents.alert.ClientComponentAlertView;
import com.robinhood.android.serverclientcomponents.databinding.FragmentClientComponentAlertBinding;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.models.serverdriven.p347db.ServerDrivenButton;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: ClientComponentAlertFragment.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 &2\u00020\u00012\u00020\u0002:\u0002%&B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u001a\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0010\u0010\"\u001a\u00020\u00162\u0006\u0010#\u001a\u00020$H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00168TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/serverclientcomponents/alert/ClientComponentAlertFragment;", "Lcom/robinhood/android/common/ui/BaseDialogFragment;", "Lcom/robinhood/android/serverclientcomponents/alert/ClientComponentAlertView$Callbacks;", "<init>", "()V", "binding", "Lcom/robinhood/android/serverclientcomponents/databinding/FragmentClientComponentAlertBinding;", "getBinding", "()Lcom/robinhood/android/serverclientcomponents/databinding/FragmentClientComponentAlertBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "getNavigator", "()Lcom/robinhood/android/navigation/Navigator;", "setNavigator", "(Lcom/robinhood/android/navigation/Navigator;)V", "dialogId", "", "getDialogId", "()I", "useParentFragmentScarletContextWrapper", "", "getUseParentFragmentScarletContextWrapper", "()Z", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onActionClicked", "button", "Lcom/robinhood/models/serverdriven/db/ServerDrivenButton;", "Callbacks", "Companion", "lib-server-client-components_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class ClientComponentAlertFragment extends BaseDialogFragment implements ClientComponentAlertView.Callbacks {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(ClientComponentAlertFragment.class, "binding", "getBinding()Lcom/robinhood/android/serverclientcomponents/databinding/FragmentClientComponentAlertBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    public Navigator navigator;

    /* compiled from: ClientComponentAlertFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m3636d2 = {"Lcom/robinhood/android/serverclientcomponents/alert/ClientComponentAlertFragment$Callbacks;", "Lcom/robinhood/android/serverclientcomponents/actionbutton/ClientComponentButtonView$Callbacks;", "lib-server-client-components_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks extends ClientComponentButtonView.Callbacks {
    }

    public ClientComponentAlertFragment() {
        super(C28308R.layout.fragment_client_component_alert);
        this.binding = ViewBinding5.viewBinding(this, ClientComponentAlertFragment2.INSTANCE);
    }

    private final FragmentClientComponentAlertBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentClientComponentAlertBinding) value;
    }

    public final Navigator getNavigator() {
        Navigator navigator = this.navigator;
        if (navigator != null) {
            return navigator;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
    }

    public final void setNavigator(Navigator navigator) {
        Intrinsics.checkNotNullParameter(navigator, "<set-?>");
        this.navigator = navigator;
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment
    public int getDialogId() {
        return ((LegacyDialogFragmentKey.ClientComponentAlert) INSTANCE.getArgs((Fragment) this)).getDialogId();
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment
    protected boolean getUseParentFragmentScarletContextWrapper() {
        return ((LegacyDialogFragmentKey.ClientComponentAlert) INSTANCE.getArgs((Fragment) this)).getUseParentFragmentScarletContextWrapper();
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, com.robinhood.hammer.android.fragment.HammerDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        if (((LegacyDialogFragmentKey.ClientComponentAlert) INSTANCE.getArgs((Fragment) this)).getUseDesignSystemOverlay()) {
            ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
            putDesignSystemOverlay(scarletContextWrapper);
            ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(scarletContextWrapper), AchromaticOverlay.INSTANCE, null, 2, null);
            setScarletContextWrapper(scarletContextWrapper);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getBinding().alertView.bind(((LegacyDialogFragmentKey.ClientComponentAlert) INSTANCE.getArgs((Fragment) this)).getAlert(), this);
    }

    @Override // com.robinhood.android.serverclientcomponents.actionbutton.ClientComponentButtonView.Callbacks
    public boolean onActionClicked(ServerDrivenButton button) {
        Intrinsics.checkNotNullParameter(button, "button");
        if (button instanceof ServerDrivenButton.LegacyButton) {
            dismiss();
        } else {
            if (!(button instanceof ServerDrivenButton.Button)) {
                throw new NoWhenBranchMatchedException();
            }
            if (((ServerDrivenButton.Button) button).getTypedAction() instanceof GenericAction.DismissAction) {
                dismiss();
            }
        }
        ActivityResultCaller parentFragment = getParentFragment();
        if (parentFragment instanceof Callbacks) {
            return ((ClientComponentButtonView.Callbacks) parentFragment).onActionClicked(button);
        }
        KeyEventDispatcher.Component activity = getActivity();
        if (activity instanceof Callbacks) {
            return ((ClientComponentButtonView.Callbacks) activity).onActionClicked(button);
        }
        return false;
    }

    /* compiled from: ClientComponentAlertFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/serverclientcomponents/alert/ClientComponentAlertFragment$Companion;", "Lcom/robinhood/android/navigation/DialogFragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/serverclientcomponents/alert/ClientComponentAlertFragment;", "Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey$ClientComponentAlert;", "<init>", "()V", "lib-server-client-components_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DialogFragmentResolverWithArgsCompanion<ClientComponentAlertFragment, LegacyDialogFragmentKey.ClientComponentAlert> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.DialogFragmentResolverWithArgsCompanion, com.robinhood.android.navigation.DialogFragmentResolver
        public ClientComponentAlertFragment createDialogFragment(LegacyDialogFragmentKey.ClientComponentAlert clientComponentAlert) {
            return (ClientComponentAlertFragment) DialogFragmentResolverWithArgsCompanion.DefaultImpls.createDialogFragment(this, clientComponentAlert);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LegacyDialogFragmentKey.ClientComponentAlert getArgs(ClientComponentAlertFragment clientComponentAlertFragment) {
            return (LegacyDialogFragmentKey.ClientComponentAlert) DialogFragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, clientComponentAlertFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public ClientComponentAlertFragment newInstance(LegacyDialogFragmentKey.ClientComponentAlert clientComponentAlert) {
            return (ClientComponentAlertFragment) DialogFragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, clientComponentAlert);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(ClientComponentAlertFragment clientComponentAlertFragment, LegacyDialogFragmentKey.ClientComponentAlert clientComponentAlert) {
            DialogFragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, clientComponentAlertFragment, clientComponentAlert);
        }
    }
}
