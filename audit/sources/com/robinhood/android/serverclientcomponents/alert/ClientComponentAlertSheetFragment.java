package com.robinhood.android.serverclientcomponents.alert;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.Fragment;
import androidx.view.result.ActivityResultCaller;
import com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.gold.contracts.GoldDowngradeIntentKey;
import com.robinhood.android.navigation.DialogFragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyDialogFragmentKey;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.serverclientcomponents.C28308R;
import com.robinhood.android.serverclientcomponents.actionbutton.ClientComponentButtonView;
import com.robinhood.android.serverclientcomponents.alert.ClientComponentAlertView;
import com.robinhood.android.serverclientcomponents.databinding.FragmentClientComponentAlertSheetBinding;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.models.serverdriven.p347db.ServerDrivenButton;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: ClientComponentAlertSheetFragment.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 '2\u00020\u00012\u00020\u0002:\u0002&'B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J&\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u001a\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J\"\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020\f2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/serverclientcomponents/alert/ClientComponentAlertSheetFragment;", "Lcom/robinhood/android/common/ui/BaseBottomSheetDialogFragment;", "Lcom/robinhood/android/serverclientcomponents/alert/ClientComponentAlertView$Callbacks;", "<init>", "()V", "binding", "Lcom/robinhood/android/serverclientcomponents/databinding/FragmentClientComponentAlertSheetBinding;", "getBinding", "()Lcom/robinhood/android/serverclientcomponents/databinding/FragmentClientComponentAlertSheetBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "dialogId", "", "getDialogId", "()I", "onAttach", "", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "onActionClicked", "", "button", "Lcom/robinhood/models/serverdriven/db/ServerDrivenButton;", "onActivityResult", "requestCode", "resultCode", WebsocketGatewayConstants.DATA_KEY, "Landroid/content/Intent;", "Callbacks", "Companion", "lib-server-client-components_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class ClientComponentAlertSheetFragment extends BaseBottomSheetDialogFragment implements ClientComponentAlertView.Callbacks {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(ClientComponentAlertSheetFragment.class, "binding", "getBinding()Lcom/robinhood/android/serverclientcomponents/databinding/FragmentClientComponentAlertSheetBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int REQUEST_GOLD_DOWNGRADE = 1;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding = ViewBinding5.viewBinding(this, ClientComponentAlertSheetFragment2.INSTANCE);

    /* compiled from: ClientComponentAlertSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m3636d2 = {"Lcom/robinhood/android/serverclientcomponents/alert/ClientComponentAlertSheetFragment$Callbacks;", "Lcom/robinhood/android/serverclientcomponents/actionbutton/ClientComponentButtonView$Callbacks;", "lib-server-client-components_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks extends ClientComponentButtonView.Callbacks {
    }

    private final FragmentClientComponentAlertSheetBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentClientComponentAlertSheetBinding) value;
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment
    public int getDialogId() {
        return ((LegacyDialogFragmentKey.ClientComponentAlertSheet) INSTANCE.getArgs((Fragment) this)).getDialogId();
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, com.robinhood.hammer.android.fragment.HammerDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        if (((LegacyDialogFragmentKey.ClientComponentAlertSheet) INSTANCE.getArgs((Fragment) this)).getUseDesignSystemOverlay()) {
            ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
            putDesignSystemOverlay(scarletContextWrapper);
            ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(scarletContextWrapper), AchromaticOverlay.INSTANCE, null, 2, null);
            setScarletContextWrapper(scarletContextWrapper);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(C28308R.layout.fragment_client_component_alert_sheet, container, false);
    }

    @Override // com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ClientComponentAlertView clientComponentAlertView = getBinding().alertView;
        Companion companion = INSTANCE;
        clientComponentAlertView.setForCrypto(((LegacyDialogFragmentKey.ClientComponentAlertSheet) companion.getArgs((Fragment) this)).getForCrypto());
        getBinding().alertView.bind(((LegacyDialogFragmentKey.ClientComponentAlertSheet) companion.getArgs((Fragment) this)).getAlert(), this);
    }

    @Override // com.robinhood.android.serverclientcomponents.actionbutton.ClientComponentButtonView.Callbacks
    public boolean onActionClicked(ServerDrivenButton button) {
        Intrinsics.checkNotNullParameter(button, "button");
        GenericAction typedAction = button.getTypedAction();
        if (typedAction instanceof GenericAction.DismissAction) {
            dismiss();
            return true;
        }
        if (typedAction instanceof GenericAction.DeeplinkAction) {
            Navigator navigator = getNavigator();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, ((GenericAction.DeeplinkAction) typedAction).getUri(), null, null, false, null, 60, null);
            dismiss();
            return true;
        }
        boolean zOnActionClicked = false;
        if (typedAction instanceof GenericAction.GoldDowngradeAction) {
            Navigator.DefaultImpls.startActivityForResult$default(getNavigator(), (Fragment) this, (IntentKey) new GoldDowngradeIntentKey(false, 1, null), 1, (PerformanceMetricEventData.Source) null, false, (Function1) null, (NavigationType) null, 120, (Object) null);
            return true;
        }
        if (typedAction instanceof GenericAction.DisableMarginWithdrawalAction) {
            Navigator navigator2 = getNavigator();
            Context contextRequireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
            Navigator.DefaultImpls.startActivity$default(navigator2, contextRequireContext2, new LegacyIntentKey.MarginWithdrawal.DisableMarginWithdrawal(((GenericAction.DisableMarginWithdrawalAction) typedAction).getAccountNumber()), null, false, null, null, 60, null);
            dismiss();
            return true;
        }
        ActivityResultCaller parentFragment = getParentFragment();
        KeyEventDispatcher.Component activity = getActivity();
        if (parentFragment instanceof Callbacks) {
            zOnActionClicked = ((ClientComponentButtonView.Callbacks) parentFragment).onActionClicked(button);
        } else if (activity instanceof Callbacks) {
            zOnActionClicked = ((ClientComponentButtonView.Callbacks) activity).onActionClicked(button);
        }
        if (typedAction instanceof GenericAction.InfoAlertAction) {
            dismiss();
        }
        return zOnActionClicked;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 1) {
            dismiss();
            if (resultCode == -1) {
                requireActivity().onBackPressed();
                return;
            }
            return;
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    /* compiled from: ClientComponentAlertSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/serverclientcomponents/alert/ClientComponentAlertSheetFragment$Companion;", "Lcom/robinhood/android/navigation/DialogFragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/serverclientcomponents/alert/ClientComponentAlertSheetFragment;", "Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey$ClientComponentAlertSheet;", "<init>", "()V", "REQUEST_GOLD_DOWNGRADE", "", "lib-server-client-components_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DialogFragmentResolverWithArgsCompanion<ClientComponentAlertSheetFragment, LegacyDialogFragmentKey.ClientComponentAlertSheet> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.DialogFragmentResolverWithArgsCompanion, com.robinhood.android.navigation.DialogFragmentResolver
        public ClientComponentAlertSheetFragment createDialogFragment(LegacyDialogFragmentKey.ClientComponentAlertSheet clientComponentAlertSheet) {
            return (ClientComponentAlertSheetFragment) DialogFragmentResolverWithArgsCompanion.DefaultImpls.createDialogFragment(this, clientComponentAlertSheet);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LegacyDialogFragmentKey.ClientComponentAlertSheet getArgs(ClientComponentAlertSheetFragment clientComponentAlertSheetFragment) {
            return (LegacyDialogFragmentKey.ClientComponentAlertSheet) DialogFragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, clientComponentAlertSheetFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public ClientComponentAlertSheetFragment newInstance(LegacyDialogFragmentKey.ClientComponentAlertSheet clientComponentAlertSheet) {
            return (ClientComponentAlertSheetFragment) DialogFragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, clientComponentAlertSheet);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(ClientComponentAlertSheetFragment clientComponentAlertSheetFragment, LegacyDialogFragmentKey.ClientComponentAlertSheet clientComponentAlertSheet) {
            DialogFragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, clientComponentAlertSheetFragment, clientComponentAlertSheet);
        }
    }
}
