package com.robinhood.android.common.mcduckling.p084ui;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.mcduckling.C11257R;
import com.robinhood.android.common.mcduckling.p084ui.detail.card.SecondaryAuthenticationFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: CardLockDialogFragment.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000  2\u00020\u00012\u00020\u00022\u00020\u0003:\u0003\u001e\u001f B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0012\u001a\u00020\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u0013H\u0014J\u0010\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\t\u0010\u0018\u001a\u00020\u0007H\u0096\u0001R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/common/mcduckling/ui/CardLockDialogFragment;", "Lcom/robinhood/android/common/ui/RhDialogFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/common/mcduckling/ui/detail/card/SecondaryAuthenticationFragment$Callbacks;", "<init>", "()V", "lockFlag", "", "getLockFlag", "()Z", "lockFlag$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/android/common/mcduckling/ui/CardLockDialogFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/common/mcduckling/ui/CardLockDialogFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "onNegativeButtonClick", "", "onPositiveButtonClick", "onSecondaryAuthenticationSuccess", "requestCode", "", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Builder", "Companion", "feature-lib-mcduckling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class CardLockDialogFragment extends RhDialogFragment implements RegionGated, SecondaryAuthenticationFragment.Callbacks {
    private static final String ARG_LOCK = "lockDialog";
    private static final int REQUEST_SECONDARY_AUTH_LOCK = 0;
    private static final int REQUEST_SECONDARY_AUTH_UNLOCK = 1;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(CardLockDialogFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/common/mcduckling/ui/CardLockDialogFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);

    /* renamed from: lockFlag$delegate, reason: from kotlin metadata */
    private final Lazy lockFlag = Fragments2.argument(this, ARG_LOCK);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.common.mcduckling.ui.CardLockDialogFragment$special$$inlined$targetFragmentCallbacks$1
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

    /* compiled from: CardLockDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/common/mcduckling/ui/CardLockDialogFragment$Callbacks;", "", "onUnlockConfirmed", "", "onLockConfirmed", "feature-lib-mcduckling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onLockConfirmed();

        void onUnlockConfirmed();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    private final boolean getLockFlag() {
        return ((Boolean) this.lockFlag.getValue()).booleanValue();
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    /* compiled from: CardLockDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/common/mcduckling/ui/CardLockDialogFragment$Builder;", "Lcom/robinhood/android/common/ui/RhDialogFragment$Builder;", "targetedFragment", "Landroidx/fragment/app/Fragment;", "lock", "", "<init>", "(Landroidx/fragment/app/Fragment;Z)V", "getLock", "()Z", "createDialogFragment", "Lcom/robinhood/android/common/mcduckling/ui/CardLockDialogFragment;", "feature-lib-mcduckling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class Builder extends RhDialogFragment.Builder {
        private final boolean lock;
        private final Fragment targetedFragment;

        public final boolean getLock() {
            return this.lock;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Builder(Fragment targetedFragment, boolean z) {
            Intrinsics.checkNotNullParameter(targetedFragment, "targetedFragment");
            Context contextRequireContext = targetedFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            super(contextRequireContext);
            this.targetedFragment = targetedFragment;
            this.lock = z;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.robinhood.android.common.ui.RhDialogFragment.Builder
        public CardLockDialogFragment createDialogFragment() {
            CardLockDialogFragment cardLockDialogFragment = new CardLockDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putBoolean(CardLockDialogFragment.ARG_LOCK, this.lock);
            cardLockDialogFragment.setArguments(bundle);
            cardLockDialogFragment.setTargetFragment(this.targetedFragment, 0);
            return cardLockDialogFragment;
        }
    }

    @Override // com.robinhood.android.common.p088ui.RhDialogFragment
    protected void onNegativeButtonClick() {
        dismiss();
    }

    @Override // com.robinhood.android.common.p088ui.RhDialogFragment
    protected void onPositiveButtonClick() {
        if (getLockFlag()) {
            SecondaryAuthenticationFragment.Companion companion = SecondaryAuthenticationFragment.INSTANCE;
            String string2 = getString(C11257R.string.card_action_lock_card_informational_dialog_title);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            SecondaryAuthenticationFragment secondaryAuthenticationFragmentNewInstance = companion.newInstance(this, string2, 0);
            FragmentManager parentFragmentManager = getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
            secondaryAuthenticationFragmentNewInstance.show(parentFragmentManager, "lockCardAuthenticationDialog");
            return;
        }
        SecondaryAuthenticationFragment.Companion companion2 = SecondaryAuthenticationFragment.INSTANCE;
        String string3 = getString(C11257R.string.card_action_unlock_card_informational_dialog_title);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        SecondaryAuthenticationFragment secondaryAuthenticationFragmentNewInstance2 = companion2.newInstance(this, string3, 1);
        FragmentManager parentFragmentManager2 = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager2, "getParentFragmentManager(...)");
        secondaryAuthenticationFragmentNewInstance2.show(parentFragmentManager2, "unlockCardAuthenticationDialog");
    }

    @Override // com.robinhood.android.common.mcduckling.ui.detail.card.SecondaryAuthenticationFragment.Callbacks
    public void onSecondaryAuthenticationSuccess(int requestCode) {
        dismiss();
        if (requestCode == 0) {
            getCallbacks().onLockConfirmed();
        } else {
            if (requestCode != 1) {
                return;
            }
            getCallbacks().onUnlockConfirmed();
        }
    }

    /* compiled from: CardLockDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\n\"\f\b\u0000\u0010\u000b*\u00020\f*\u00020\r2\u0006\u0010\u000e\u001a\u0002H\u000b¢\u0006\u0002\u0010\u000fJ!\u0010\u0010\u001a\u00020\n\"\f\b\u0000\u0010\u000b*\u00020\f*\u00020\r2\u0006\u0010\u000e\u001a\u0002H\u000b¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/common/mcduckling/ui/CardLockDialogFragment$Companion;", "", "<init>", "()V", "REQUEST_SECONDARY_AUTH_LOCK", "", "REQUEST_SECONDARY_AUTH_UNLOCK", "ARG_LOCK", "", "showLockConfirmation", "", "C", "Landroidx/fragment/app/Fragment;", "Lcom/robinhood/android/common/mcduckling/ui/CardLockDialogFragment$Callbacks;", "fragmentCallback", "(Landroidx/fragment/app/Fragment;)V", "showUnlockConfirmation", "feature-lib-mcduckling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final <C extends Fragment & Callbacks> void showLockConfirmation(C fragmentCallback) {
            Intrinsics.checkNotNullParameter(fragmentCallback, "fragmentCallback");
            RhDialogFragment.Builder negativeButton = new Builder(fragmentCallback, true).setUseDesignSystemOverlay(true).setId(C11257R.id.dialog_id_card_action_lock_card).setTitle(C11257R.string.card_action_lock_card_informational_dialog_title, new Object[0]).setMessage(C11257R.string.card_action_lock_card_informational_dialog_message, new Object[0]).setPositiveButton(C11257R.string.card_action_lock_card_informational_dialog_action_lock, new Object[0]).setNegativeButton(C11048R.string.general_label_dismiss, new Object[0]);
            FragmentManager parentFragmentManager = fragmentCallback.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
            RhDialogFragment.Builder.show$default(negativeButton, parentFragmentManager, "lockCardInformationalDialog", false, 4, null);
        }

        public final <C extends Fragment & Callbacks> void showUnlockConfirmation(C fragmentCallback) {
            Intrinsics.checkNotNullParameter(fragmentCallback, "fragmentCallback");
            RhDialogFragment.Builder negativeButton = new Builder(fragmentCallback, false).setUseDesignSystemOverlay(true).setId(C11257R.id.dialog_id_card_action_unlock_card).setTitle(C11257R.string.card_action_unlock_card_informational_dialog_title, new Object[0]).setMessage(C11257R.string.card_action_unlock_card_informational_dialog_message, new Object[0]).setPositiveButton(C11257R.string.card_action_unlock_card_informational_dialog_action_unlock, new Object[0]).setNegativeButton(C11048R.string.general_label_dismiss, new Object[0]);
            FragmentManager parentFragmentManager = fragmentCallback.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
            RhDialogFragment.Builder.show$default(negativeButton, parentFragmentManager, "unlockCardInformationalDialog", false, 4, null);
        }
    }
}
