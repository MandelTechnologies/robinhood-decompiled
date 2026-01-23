package com.robinhood.android.lists.p173ui.ipo;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.util.extensions.Snackbars;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.snackbar.RdsSnackbar;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.lists.C20839R;
import com.robinhood.android.lists.databinding.FragmentIpoNotificationBottomSheetBinding;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.NotificationSettingStore;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.annotation.HasSeenIpoNotificationBottomSheet;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.utils.extensions.CompletablesAndroid;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: IpoNotificationSettingBottomSheet.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u001a\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u0012\u0010\u001f\u001a\u00020\u00172\b\b\u0001\u0010 \u001a\u00020!H\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/ipo/IpoNotificationSettingBottomSheet;", "Lcom/robinhood/android/common/ui/BaseBottomSheetDialogFragment;", "<init>", "()V", "notificationSettingsStore", "Lcom/robinhood/librobinhood/data/store/NotificationSettingStore;", "getNotificationSettingsStore", "()Lcom/robinhood/librobinhood/data/store/NotificationSettingStore;", "setNotificationSettingsStore", "(Lcom/robinhood/librobinhood/data/store/NotificationSettingStore;)V", "hasSeenIpoNotificationBottomSheetPref", "Lcom/robinhood/prefs/BooleanPreference;", "getHasSeenIpoNotificationBottomSheetPref", "()Lcom/robinhood/prefs/BooleanPreference;", "setHasSeenIpoNotificationBottomSheetPref", "(Lcom/robinhood/prefs/BooleanPreference;)V", "binding", "Lcom/robinhood/android/lists/databinding/FragmentIpoNotificationBottomSheetBinding;", "getBinding", "()Lcom/robinhood/android/lists/databinding/FragmentIpoNotificationBottomSheetBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "showSnackbar", "message", "", "Companion", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class IpoNotificationSettingBottomSheet extends BaseBottomSheetDialogFragment {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    @HasSeenIpoNotificationBottomSheet
    public BooleanPreference hasSeenIpoNotificationBottomSheetPref;
    public NotificationSettingStore notificationSettingsStore;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(IpoNotificationSettingBottomSheet.class, "binding", "getBinding()Lcom/robinhood/android/lists/databinding/FragmentIpoNotificationBottomSheetBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public IpoNotificationSettingBottomSheet() {
        super(C20839R.layout.fragment_ipo_notification_bottom_sheet);
        this.binding = ViewBinding5.viewBinding(this, IpoNotificationSettingBottomSheet2.INSTANCE);
    }

    public final NotificationSettingStore getNotificationSettingsStore() {
        NotificationSettingStore notificationSettingStore = this.notificationSettingsStore;
        if (notificationSettingStore != null) {
            return notificationSettingStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("notificationSettingsStore");
        return null;
    }

    public final void setNotificationSettingsStore(NotificationSettingStore notificationSettingStore) {
        Intrinsics.checkNotNullParameter(notificationSettingStore, "<set-?>");
        this.notificationSettingsStore = notificationSettingStore;
    }

    public final BooleanPreference getHasSeenIpoNotificationBottomSheetPref() {
        BooleanPreference booleanPreference = this.hasSeenIpoNotificationBottomSheetPref;
        if (booleanPreference != null) {
            return booleanPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("hasSeenIpoNotificationBottomSheetPref");
        return null;
    }

    public final void setHasSeenIpoNotificationBottomSheetPref(BooleanPreference booleanPreference) {
        Intrinsics.checkNotNullParameter(booleanPreference, "<set-?>");
        this.hasSeenIpoNotificationBottomSheetPref = booleanPreference;
    }

    private final FragmentIpoNotificationBottomSheetBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentIpoNotificationBottomSheetBinding) value;
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, com.robinhood.hammer.android.fragment.HammerDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getHasSeenIpoNotificationBottomSheetPref().set(true);
        RdsButton yesBtn = getBinding().yesBtn;
        Intrinsics.checkNotNullExpressionValue(yesBtn, "yesBtn");
        OnClickListeners.onClick(yesBtn, new Function0() { // from class: com.robinhood.android.lists.ui.ipo.IpoNotificationSettingBottomSheet$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IpoNotificationSettingBottomSheet.onViewCreated$lambda$3(this.f$0);
            }
        });
        RdsButton noBtn = getBinding().noBtn;
        Intrinsics.checkNotNullExpressionValue(noBtn, "noBtn");
        OnClickListeners.onClick(noBtn, new Function0() { // from class: com.robinhood.android.lists.ui.ipo.IpoNotificationSettingBottomSheet$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IpoNotificationSettingBottomSheet.onViewCreated$lambda$4(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3(final IpoNotificationSettingBottomSheet ipoNotificationSettingBottomSheet) {
        ipoNotificationSettingBottomSheet.getBinding().yesBtn.setLoading(true);
        LifecycleHost.DefaultImpls.bind$default(ipoNotificationSettingBottomSheet, CompletablesAndroid.observeOnMainThread(ipoNotificationSettingBottomSheet.getNotificationSettingsStore().toggleOnIposListNotifications()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.lists.ui.ipo.IpoNotificationSettingBottomSheet$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IpoNotificationSettingBottomSheet.onViewCreated$lambda$3$lambda$1(this.f$0);
            }
        }, new Function1() { // from class: com.robinhood.android.lists.ui.ipo.IpoNotificationSettingBottomSheet$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IpoNotificationSettingBottomSheet.onViewCreated$lambda$3$lambda$2(this.f$0, (Throwable) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3$lambda$1(IpoNotificationSettingBottomSheet ipoNotificationSettingBottomSheet) {
        ipoNotificationSettingBottomSheet.getBinding().yesBtn.setLoading(false);
        ipoNotificationSettingBottomSheet.showSnackbar(C20839R.string.ipo_access_notification_update_success);
        ipoNotificationSettingBottomSheet.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3$lambda$2(IpoNotificationSettingBottomSheet ipoNotificationSettingBottomSheet, Throwable t) throws Throwable {
        Intrinsics.checkNotNullParameter(t, "t");
        ipoNotificationSettingBottomSheet.getBinding().yesBtn.setLoading(false);
        if (Throwables.isNetworkRelated(t)) {
            ipoNotificationSettingBottomSheet.showSnackbar(C11048R.string.general_error_no_connection);
            ipoNotificationSettingBottomSheet.dismiss();
            return Unit.INSTANCE;
        }
        throw t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$4(IpoNotificationSettingBottomSheet ipoNotificationSettingBottomSheet) {
        ipoNotificationSettingBottomSheet.dismiss();
        return Unit.INSTANCE;
    }

    private final void showSnackbar(int message) {
        RdsSnackbar.Companion companion = RdsSnackbar.INSTANCE;
        Snackbars snackbars = Snackbars.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        RdsSnackbar rdsSnackbarMake = companion.make(snackbars.findRoot(fragmentActivityRequireActivity), message, 0);
        rdsSnackbarMake.setLeadingIcon(C20690R.drawable.ic_rds_checkmark_12dp);
        rdsSnackbarMake.show();
    }

    /* compiled from: IpoNotificationSettingBottomSheet.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/ipo/IpoNotificationSettingBottomSheet$Companion;", "", "<init>", "()V", "newInstance", "Lcom/robinhood/android/lists/ui/ipo/IpoNotificationSettingBottomSheet;", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final IpoNotificationSettingBottomSheet newInstance() {
            return new IpoNotificationSettingBottomSheet();
        }
    }
}
