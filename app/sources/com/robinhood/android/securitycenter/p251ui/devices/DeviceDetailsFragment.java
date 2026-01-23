package com.robinhood.android.securitycenter.p251ui.devices;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.securitycenter.C28186R;
import com.robinhood.android.securitycenter.databinding.FragmentDeviceDetailsBinding;
import com.robinhood.android.securitycenter.p251ui.devices.DeviceSettingsDialogFragment;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.shared.crypto.contracts.CryptoAuthorizeWalletFragmentKey;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.Lazy;
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

/* compiled from: DeviceDetailsFragment.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 .2\u00020\u0001:\u0002-.B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0017H\u0016J\u001a\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u001a\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\"H\u0016J\u0010\u0010(\u001a\u00020\u00172\u0006\u0010%\u001a\u00020&H\u0016J\b\u0010)\u001a\u00020\u0017H\u0002J\u0010\u0010*\u001a\u00020\u00172\u0006\u0010+\u001a\u00020,H\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013¨\u0006/"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/devices/DeviceDetailsFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "duxo", "Lcom/robinhood/android/securitycenter/ui/devices/DeviceDetailsDuxo;", "getDuxo", "()Lcom/robinhood/android/securitycenter/ui/devices/DeviceDetailsDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/securitycenter/databinding/FragmentDeviceDetailsBinding;", "getBinding", "()Lcom/robinhood/android/securitycenter/databinding/FragmentDeviceDetailsBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onAttach", "context", "Landroid/content/Context;", "onStart", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onPositiveButtonClicked", "", "id", "", "passthroughArgs", "onDialogDismissed", "showDeviceRemovalPrompt", "bind", "state", "Lcom/robinhood/android/securitycenter/ui/devices/DeviceDetailsViewState;", "Args", "Companion", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class DeviceDetailsFragment extends BaseFragment {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public EventLogger eventLogger;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(DeviceDetailsFragment.class, "binding", "getBinding()Lcom/robinhood/android/securitycenter/databinding/FragmentDeviceDetailsBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public DeviceDetailsFragment() {
        super(C28186R.layout.fragment_device_details);
        this.duxo = OldDuxos.oldDuxo(this, DeviceDetailsDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, DeviceDetailsFragment2.INSTANCE);
    }

    public final EventLogger getEventLogger() {
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            return eventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void setEventLogger(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "<set-?>");
        this.eventLogger = eventLogger;
    }

    private final DeviceDetailsDuxo getDuxo() {
        return (DeviceDetailsDuxo) this.duxo.getValue();
    }

    private final FragmentDeviceDetailsBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentDeviceDetailsBinding) value;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setElevation(0.0f);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C282401(this));
    }

    /* compiled from: DeviceDetailsFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.securitycenter.ui.devices.DeviceDetailsFragment$onStart$1 */
    /* synthetic */ class C282401 extends FunctionReferenceImpl implements Function1<DeviceDetailsViewState, Unit> {
        C282401(Object obj) {
            super(1, obj, DeviceDetailsFragment.class, "bind", "bind(Lcom/robinhood/android/securitycenter/ui/devices/DeviceDetailsViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DeviceDetailsViewState deviceDetailsViewState) throws Resources.NotFoundException {
            invoke2(deviceDetailsViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DeviceDetailsViewState p0) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((DeviceDetailsFragment) this.receiver).bind(p0);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        RdsButton deviceDetailsRemoveDeviceCta = getBinding().deviceDetailsRemoveDeviceCta;
        Intrinsics.checkNotNullExpressionValue(deviceDetailsRemoveDeviceCta, "deviceDetailsRemoveDeviceCta");
        OnClickListeners.onClick(deviceDetailsRemoveDeviceCta, new Function0() { // from class: com.robinhood.android.securitycenter.ui.devices.DeviceDetailsFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DeviceDetailsFragment.onViewCreated$lambda$1(this.f$0);
            }
        });
        getBinding().deviceDetailsRemoveDeviceCta.setEnabled(((Args) INSTANCE.getArgs((Fragment) this)).isRemoveDevicesEnabled());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(DeviceDetailsFragment deviceDetailsFragment) {
        EventLogger.DefaultImpls.logTap$default(deviceDetailsFragment.getEventLogger(), UserInteractionEventData.Action.REMOVE_DEVICE, new Screen(Screen.Name.TRUSTED_DEVICES, null, null, null, 14, null), null, null, null, false, 60, null);
        deviceDetailsFragment.showDeviceRemovalPrompt();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C28186R.id.dialog_id_device_details_device_removal_prompt) {
            getDuxo().removeDevice();
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        if (id == C28186R.id.dialog_id_device_details_device_removal_confirmation) {
            if (getParentFragmentManager().isStateSaved()) {
                return;
            }
            getParentFragmentManager().popBackStackImmediate();
            return;
        }
        super.onDialogDismissed(id);
    }

    private final void showDeviceRemovalPrompt() {
        DeviceSettingsDialogFragment.Companion companion = DeviceSettingsDialogFragment.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder negativeButton = DeviceSettingsDialogFragment.Companion.create$default(companion, contextRequireContext, null, 2, null).setId(C28186R.id.dialog_id_device_details_device_removal_prompt).setTitle(C28186R.string.device_details_device_removal_prompt_title, new Object[0]).setMessage(C28186R.string.device_details_device_removal_prompt_message, new Object[0]).setPositiveButton(C28186R.string.device_details_device_removal_prompt_cta, new Object[0]).setNegativeButton(C11048R.string.general_label_cancel, new Object[0]);
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        RhDialogFragment.Builder.show$default(negativeButton, parentFragmentManager, "deviceRemovalPromptDialog", false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(DeviceDetailsViewState state) throws Resources.NotFoundException {
        CharSequence text;
        CharSequence text2;
        Throwable thConsume;
        getBinding().deviceDetailsRemoveDeviceCta.setLoading(state.getShowLoadingView());
        Integer pogRes = state.getPogRes();
        if (pogRes != null) {
            getBinding().deviceDetailsPogView.setPictogram(AppCompatResources.getDrawable(requireContext(), pogRes.intValue()));
        }
        getBinding().deviceDetailsTitle.setText(state.getTitleText());
        RdsRowView rdsRowView = getBinding().deviceDetailsLastSeenRow;
        StringResource timestampRes = state.getTimestampRes();
        if (timestampRes != null) {
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            text = timestampRes.getText(resources);
        } else {
            text = null;
        }
        rdsRowView.setMetadataPrimaryText(text);
        getBinding().deviceDetailsLocationRow.setMetadataPrimaryText(state.getLocationText());
        RdsRowView rdsRowView2 = getBinding().deviceDetailsDeviceTypeRow;
        StringResource deviceTypeRes = state.getDeviceTypeRes();
        if (deviceTypeRes != null) {
            Resources resources2 = getResources();
            Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
            text2 = deviceTypeRes.getText(resources2);
        } else {
            text2 = null;
        }
        rdsRowView2.setMetadataPrimaryText(text2);
        UiEvent<Unit> deviceRemovalSuccess = state.getDeviceRemovalSuccess();
        if ((deviceRemovalSuccess != null ? deviceRemovalSuccess.consume() : null) != null) {
            DeviceSettingsDialogFragment.Companion companion = DeviceSettingsDialogFragment.INSTANCE;
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            RhDialogFragment.Builder positiveButton = companion.create(contextRequireContext, DeviceSettingsScarletOverlays.INSTANCE).setId(C28186R.id.dialog_id_device_details_device_removal_confirmation).setTitle(C28186R.string.device_details_device_removal_confirmation_title, new Object[0]).setMessage(C28186R.string.device_details_device_removal_confirmation_message, new Object[0]).setPositiveButton(C11048R.string.general_label_ok, new Object[0]);
            FragmentManager supportFragmentManager = requireActivity().getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            RhDialogFragment.Builder.show$default(positiveButton, supportFragmentManager, "deviceRemovalConfirmationDialog", false, 4, null);
        }
        UiEvent<Throwable> deviceRemovalFailure = state.getDeviceRemovalFailure();
        if (deviceRemovalFailure == null || (thConsume = deviceRemovalFailure.consume()) == null) {
            return;
        }
        AbsErrorHandler.handleError$default(getActivityErrorHandler(), thConsume, false, 2, null);
    }

    /* compiled from: DeviceDetailsFragment.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/devices/DeviceDetailsFragment$Args;", "Landroid/os/Parcelable;", CryptoAuthorizeWalletFragmentKey.QUERY_PARAM_DEVICE_ID, "Ljava/util/UUID;", "isRemoveDevicesEnabled", "", "<init>", "(Ljava/util/UUID;Z)V", "getDeviceId", "()Ljava/util/UUID;", "()Z", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final UUID deviceId;
        private final boolean isRemoveDevicesEnabled;

        /* compiled from: DeviceDetailsFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((UUID) parcel.readSerializable(), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, UUID uuid, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = args.deviceId;
            }
            if ((i & 2) != 0) {
                z = args.isRemoveDevicesEnabled;
            }
            return args.copy(uuid, z);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getDeviceId() {
            return this.deviceId;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsRemoveDevicesEnabled() {
            return this.isRemoveDevicesEnabled;
        }

        public final Args copy(UUID deviceId, boolean isRemoveDevicesEnabled) {
            Intrinsics.checkNotNullParameter(deviceId, "deviceId");
            return new Args(deviceId, isRemoveDevicesEnabled);
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
            return Intrinsics.areEqual(this.deviceId, args.deviceId) && this.isRemoveDevicesEnabled == args.isRemoveDevicesEnabled;
        }

        public int hashCode() {
            return (this.deviceId.hashCode() * 31) + Boolean.hashCode(this.isRemoveDevicesEnabled);
        }

        public String toString() {
            return "Args(deviceId=" + this.deviceId + ", isRemoveDevicesEnabled=" + this.isRemoveDevicesEnabled + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.deviceId);
            dest.writeInt(this.isRemoveDevicesEnabled ? 1 : 0);
        }

        public Args(UUID deviceId, boolean z) {
            Intrinsics.checkNotNullParameter(deviceId, "deviceId");
            this.deviceId = deviceId;
            this.isRemoveDevicesEnabled = z;
        }

        public final UUID getDeviceId() {
            return this.deviceId;
        }

        public final boolean isRemoveDevicesEnabled() {
            return this.isRemoveDevicesEnabled;
        }
    }

    /* compiled from: DeviceDetailsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/devices/DeviceDetailsFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/securitycenter/ui/devices/DeviceDetailsFragment;", "Lcom/robinhood/android/securitycenter/ui/devices/DeviceDetailsFragment$Args;", "<init>", "()V", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<DeviceDetailsFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(DeviceDetailsFragment deviceDetailsFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, deviceDetailsFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public DeviceDetailsFragment newInstance(Args args) {
            return (DeviceDetailsFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(DeviceDetailsFragment deviceDetailsFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, deviceDetailsFragment, args);
        }
    }
}
