package com.robinhood.android.cash.cushion.dialog;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.cash.cushion.C9970R;
import com.robinhood.android.cash.cushion.databinding.CashCushionSettingDialogBinding;
import com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.librobinhood.data.store.rhy.RhyAccountLoggingStore;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.RHYContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
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

/* compiled from: CashCushionSettingDialogFragment.kt */
@Metadata(m3635d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 =2\u00020\u00012\u00020\u0002:\u0003;<=B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0016J\b\u0010-\u001a\u00020*H\u0016J\b\u0010.\u001a\u00020*H\u0016J\u001a\u0010/\u001a\u00020*2\u0006\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u000103H\u0016J\t\u00104\u001a\u000205H\u0096\u0001R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u001f\u0010 \u001a\u00060!j\u0002`\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b#\u0010$R\u000e\u0010'\u001a\u00020(X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u00106\u001a\b\u0012\u0004\u0012\u00020807X\u0096\u0005¢\u0006\u0006\u001a\u0004\b9\u0010:¨\u0006>"}, m3636d2 = {"Lcom/robinhood/android/cash/cushion/dialog/CashCushionSettingDialogFragment;", "Lcom/robinhood/android/common/ui/BaseBottomSheetDialogFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "rhyAccountLoggingStore", "Lcom/robinhood/librobinhood/data/store/rhy/RhyAccountLoggingStore;", "getRhyAccountLoggingStore", "()Lcom/robinhood/librobinhood/data/store/rhy/RhyAccountLoggingStore;", "setRhyAccountLoggingStore", "(Lcom/robinhood/librobinhood/data/store/rhy/RhyAccountLoggingStore;)V", "binding", "Lcom/robinhood/android/cash/cushion/databinding/CashCushionSettingDialogBinding;", "getBinding", "()Lcom/robinhood/android/cash/cushion/databinding/CashCushionSettingDialogBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/cash/cushion/dialog/CashCushionSettingDialogFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/cash/cushion/dialog/CashCushionSettingDialogFragment$Callbacks;", "callbacks$delegate", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "eventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "getEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "eventContext$delegate", "Lkotlin/Lazy;", "eventComponent", "Lcom/robinhood/rosetta/eventlogging/Component;", "onAttach", "", "context", "Landroid/content/Context;", "onStart", "onStop", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Args", "Companion", "feature-lib-cash-cushion_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class CashCushionSettingDialogFragment extends BaseBottomSheetDialogFragment implements RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    private final Component eventComponent;

    /* renamed from: eventContext$delegate, reason: from kotlin metadata */
    private final Lazy eventContext;
    public EventLogger eventLogger;
    public RhyAccountLoggingStore rhyAccountLoggingStore;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(CashCushionSettingDialogFragment.class, "binding", "getBinding()Lcom/robinhood/android/cash/cushion/databinding/CashCushionSettingDialogBinding;", 0)), Reflection.property1(new PropertyReference1Impl(CashCushionSettingDialogFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/cash/cushion/dialog/CashCushionSettingDialogFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: CashCushionSettingDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/cash/cushion/dialog/CashCushionSettingDialogFragment$Callbacks;", "", "onSetCashCushionStatus", "", "enable", "", "feature-lib-cash-cushion_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onSetCashCushionStatus(boolean enable);
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public CashCushionSettingDialogFragment() {
        super(C9970R.layout.cash_cushion_setting_dialog);
        this.$$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);
        this.binding = ViewBinding5.viewBinding(this, CashCushionSettingDialogFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.cash.cushion.dialog.CashCushionSettingDialogFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
        this.eventContext = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.cash.cushion.dialog.CashCushionSettingDialogFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CashCushionSettingDialogFragment.eventContext_delegate$lambda$0(this.f$0);
            }
        });
        this.eventComponent = new Component(Component.ComponentType.BOTTOM_SHEET, null, null, 6, null);
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

    public final RhyAccountLoggingStore getRhyAccountLoggingStore() {
        RhyAccountLoggingStore rhyAccountLoggingStore = this.rhyAccountLoggingStore;
        if (rhyAccountLoggingStore != null) {
            return rhyAccountLoggingStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rhyAccountLoggingStore");
        return null;
    }

    public final void setRhyAccountLoggingStore(RhyAccountLoggingStore rhyAccountLoggingStore) {
        Intrinsics.checkNotNullParameter(rhyAccountLoggingStore, "<set-?>");
        this.rhyAccountLoggingStore = rhyAccountLoggingStore;
    }

    private final CashCushionSettingDialogBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (CashCushionSettingDialogBinding) value;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    private final Screen getEventScreen() {
        return ((Args) INSTANCE.getArgs((Fragment) this)).getScreen();
    }

    private final Context getEventContext() {
        return (Context) this.eventContext.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Context eventContext_delegate$lambda$0(CashCushionSettingDialogFragment cashCushionSettingDialogFragment) {
        return new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new RHYContext(RHYContext.ProductArea.CASH_ACCOUNTS, "backup_coverage", ((Args) INSTANCE.getArgs((Fragment) cashCushionSettingDialogFragment)).getEntryPoint(), cashCushionSettingDialogFragment.getRhyAccountLoggingStore().getRhyAccountType(), null, null, 48, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -2049, -1, -1, -1, 16383, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, com.robinhood.hammer.android.fragment.HammerDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        getRhyAccountLoggingStore().refresh(true);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(scarletContextWrapper), AchromaticOverlay.INSTANCE, null, 2, null);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        EventLogger.DefaultImpls.logAppear$default(getEventLogger(), null, getEventScreen(), this.eventComponent, null, getEventContext(), 9, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        EventLogger.DefaultImpls.logDisappear$default(getEventLogger(), null, getEventScreen(), this.eventComponent, null, getEventContext(), 9, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        int i;
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        RhTextView rhTextView = getBinding().titleTxt;
        Companion companion = INSTANCE;
        if (((Args) companion.getArgs((Fragment) this)).getCashCushionSetting()) {
            i = C9970R.string.cash_cushion_setting_disable_dialog_title;
        } else {
            i = C9970R.string.cash_cushion_setting_enable_dialog_title;
        }
        rhTextView.setText(getString(i));
        RhTextView rhTextView2 = getBinding().messageTxt;
        if (((Args) companion.getArgs((Fragment) this)).getCashCushionSetting()) {
            i2 = C9970R.string.cash_cushion_setting_disable_dialog_message;
        } else {
            i2 = C9970R.string.cash_cushion_setting_enable_dialog_message;
        }
        rhTextView2.setText(getString(i2));
        RdsButton rdsButton = getBinding().primaryBtn;
        if (((Args) companion.getArgs((Fragment) this)).getCashCushionSetting()) {
            i3 = C9970R.string.cash_cushion_setting_disable_dialog_primary_cta;
        } else {
            i3 = C9970R.string.cash_cushion_setting_enable_dialog_primary_cta;
        }
        rdsButton.setText(getString(i3));
        RdsButton primaryBtn = getBinding().primaryBtn;
        Intrinsics.checkNotNullExpressionValue(primaryBtn, "primaryBtn");
        OnClickListeners.onClick(primaryBtn, new Function0() { // from class: com.robinhood.android.cash.cushion.dialog.CashCushionSettingDialogFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CashCushionSettingDialogFragment.onViewCreated$lambda$2(this.f$0);
            }
        });
        RdsButton cancelBtn = getBinding().cancelBtn;
        Intrinsics.checkNotNullExpressionValue(cancelBtn, "cancelBtn");
        OnClickListeners.onClick(cancelBtn, new Function0() { // from class: com.robinhood.android.cash.cushion.dialog.CashCushionSettingDialogFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CashCushionSettingDialogFragment.onViewCreated$lambda$3(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2(CashCushionSettingDialogFragment cashCushionSettingDialogFragment) {
        EventLogger.DefaultImpls.logTap$default(cashCushionSettingDialogFragment.getEventLogger(), UserInteractionEventData.Action.APPROVE, cashCushionSettingDialogFragment.getEventScreen(), cashCushionSettingDialogFragment.eventComponent, null, cashCushionSettingDialogFragment.getEventContext(), false, 40, null);
        cashCushionSettingDialogFragment.getCallbacks().onSetCashCushionStatus(!((Args) INSTANCE.getArgs((Fragment) cashCushionSettingDialogFragment)).getCashCushionSetting());
        cashCushionSettingDialogFragment.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3(CashCushionSettingDialogFragment cashCushionSettingDialogFragment) {
        EventLogger.DefaultImpls.logTap$default(cashCushionSettingDialogFragment.getEventLogger(), UserInteractionEventData.Action.CANCEL, cashCushionSettingDialogFragment.getEventScreen(), cashCushionSettingDialogFragment.eventComponent, null, cashCushionSettingDialogFragment.getEventContext(), false, 40, null);
        cashCushionSettingDialogFragment.dismiss();
        return Unit.INSTANCE;
    }

    /* compiled from: CashCushionSettingDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/cash/cushion/dialog/CashCushionSettingDialogFragment$Args;", "Landroid/os/Parcelable;", "cashCushionSetting", "", "entryPoint", "", "screen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "<init>", "(ZLjava/lang/String;Lcom/robinhood/rosetta/eventlogging/Screen;)V", "getCashCushionSetting", "()Z", "getEntryPoint", "()Ljava/lang/String;", "getScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-cash-cushion_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final boolean cashCushionSetting;
        private final String entryPoint;
        private final Screen screen;

        /* compiled from: CashCushionSettingDialogFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readInt() != 0, parcel.readString(), (Screen) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, boolean z, String str, Screen screen, int i, Object obj) {
            if ((i & 1) != 0) {
                z = args.cashCushionSetting;
            }
            if ((i & 2) != 0) {
                str = args.entryPoint;
            }
            if ((i & 4) != 0) {
                screen = args.screen;
            }
            return args.copy(z, str, screen);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getCashCushionSetting() {
            return this.cashCushionSetting;
        }

        /* renamed from: component2, reason: from getter */
        public final String getEntryPoint() {
            return this.entryPoint;
        }

        /* renamed from: component3, reason: from getter */
        public final Screen getScreen() {
            return this.screen;
        }

        public final Args copy(boolean cashCushionSetting, String entryPoint, Screen screen) {
            Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
            Intrinsics.checkNotNullParameter(screen, "screen");
            return new Args(cashCushionSetting, entryPoint, screen);
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
            return this.cashCushionSetting == args.cashCushionSetting && Intrinsics.areEqual(this.entryPoint, args.entryPoint) && Intrinsics.areEqual(this.screen, args.screen);
        }

        public int hashCode() {
            return (((Boolean.hashCode(this.cashCushionSetting) * 31) + this.entryPoint.hashCode()) * 31) + this.screen.hashCode();
        }

        public String toString() {
            return "Args(cashCushionSetting=" + this.cashCushionSetting + ", entryPoint=" + this.entryPoint + ", screen=" + this.screen + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.cashCushionSetting ? 1 : 0);
            dest.writeString(this.entryPoint);
            dest.writeSerializable(this.screen);
        }

        public Args(boolean z, String entryPoint, Screen screen) {
            Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
            Intrinsics.checkNotNullParameter(screen, "screen");
            this.cashCushionSetting = z;
            this.entryPoint = entryPoint;
            this.screen = screen;
        }

        public final boolean getCashCushionSetting() {
            return this.cashCushionSetting;
        }

        public final String getEntryPoint() {
            return this.entryPoint;
        }

        public final Screen getScreen() {
            return this.screen;
        }
    }

    /* compiled from: CashCushionSettingDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/cash/cushion/dialog/CashCushionSettingDialogFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/cash/cushion/dialog/CashCushionSettingDialogFragment;", "Lcom/robinhood/android/cash/cushion/dialog/CashCushionSettingDialogFragment$Args;", "<init>", "()V", "feature-lib-cash-cushion_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<CashCushionSettingDialogFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(CashCushionSettingDialogFragment cashCushionSettingDialogFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, cashCushionSettingDialogFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public CashCushionSettingDialogFragment newInstance(Args args) {
            return (CashCushionSettingDialogFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(CashCushionSettingDialogFragment cashCushionSettingDialogFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, cashCushionSettingDialogFragment, args);
        }
    }
}
