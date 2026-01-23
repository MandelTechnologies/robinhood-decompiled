package com.robinhood.android.settings.p254ui.notification.thread;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.UiCallbacks;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.android.common.util.p090rx.ErrorHandlers;
import com.robinhood.android.designsystem.selectioncontrol.RdsToggleView;
import com.robinhood.android.navigation.DialogFragmentResolver;
import com.robinhood.android.navigation.app.keys.LegacyDialogFragmentKey;
import com.robinhood.android.navigation.app.keys.data.ThreadNotificationSettingsSource;
import com.robinhood.android.settings.C28315R;
import com.robinhood.android.settings.util.extensions.Statuses;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.ApiNotificationSettingsToggleSettingsItem;
import com.robinhood.models.api.ApiNotificationThreadSettingsItem;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.utils.extensions.ObservablesAndroid;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: ThreadNotificationSettings4BottomSheet.kt */
@Metadata(m3635d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 >2\u00020\u00012\u00020\u0002:\u0001>B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0016J\u0012\u0010*\u001a\u00020'2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J$\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u0001022\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u001a\u00103\u001a\u00020'2\u0006\u00104\u001a\u00020.2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u0010\u0010;\u001a\u00020'2\u0006\u0010<\u001a\u00020=H\u0002R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0010\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010!\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u0010\u001a\u0004\b#\u0010$R\u0014\u00105\u001a\u000206X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0014\u00109\u001a\u0002068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u00108¨\u0006?"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/notification/thread/ThreadNotificationSettings4BottomSheet;", "Lcom/robinhood/android/common/ui/BaseBottomSheetDialogFragment;", "Lcom/robinhood/android/common/util/UiCallbacks$ScreenViewAnalyticable;", "<init>", "()V", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "duxo", "Lcom/robinhood/android/settings/ui/notification/thread/ThreadNotificationSettings4Duxo;", "getDuxo", "()Lcom/robinhood/android/settings/ui/notification/thread/ThreadNotificationSettings4Duxo;", "duxo$delegate", "Lkotlin/Lazy;", "muteNotificationsTitle", "Landroid/widget/TextView;", "getMuteNotificationsTitle", "()Landroid/widget/TextView;", "muteNotificationsTitle$delegate", "Lkotlin/properties/ReadOnlyProperty;", "muteNotificationsRdsToggleView", "Lcom/robinhood/android/designsystem/selectioncontrol/RdsToggleView;", "getMuteNotificationsRdsToggleView", "()Lcom/robinhood/android/designsystem/selectioncontrol/RdsToggleView;", "muteNotificationsRdsToggleView$delegate", "source", "Lcom/robinhood/android/navigation/app/keys/data/ThreadNotificationSettingsSource;", "getSource", "()Lcom/robinhood/android/navigation/app/keys/data/ThreadNotificationSettingsSource;", "source$delegate", ThreadNotificationSettings4BottomSheet.ARG_THREAD_SETTING_ITEM, "Lcom/robinhood/models/api/ApiNotificationThreadSettingsItem;", "getThreadSettingsItem", "()Lcom/robinhood/models/api/ApiNotificationThreadSettingsItem;", "threadSettingsItem$delegate", "onAttach", "", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "screenName", "", "getScreenName", "()Ljava/lang/String;", "screenSource", "getScreenSource", "updateViewState", "viewState", "Lcom/robinhood/android/settings/ui/notification/thread/ThreadNotificationSettings4ViewState;", "Companion", "feature-settings_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class ThreadNotificationSettings4BottomSheet extends BaseBottomSheetDialogFragment implements UiCallbacks.ScreenViewAnalyticable {
    private static final String ARG_SOURCE = "source";
    private static final String ARG_THREAD_SETTING_ITEM = "threadSettingsItem";
    public AnalyticsLogger analytics;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(ThreadNotificationSettings4BottomSheet.class, "muteNotificationsTitle", "getMuteNotificationsTitle()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(ThreadNotificationSettings4BottomSheet.class, "muteNotificationsRdsToggleView", "getMuteNotificationsRdsToggleView()Lcom/robinhood/android/designsystem/selectioncontrol/RdsToggleView;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = OldDuxos.oldDuxo(this, ThreadNotificationSettings4Duxo.class);

    /* renamed from: muteNotificationsTitle$delegate, reason: from kotlin metadata */
    private final Interfaces2 muteNotificationsTitle = bindView(C28315R.id.mute_notifications_title_text);

    /* renamed from: muteNotificationsRdsToggleView$delegate, reason: from kotlin metadata */
    private final Interfaces2 muteNotificationsRdsToggleView = bindView(C28315R.id.mute_notifications_toggle_view);

    /* renamed from: source$delegate, reason: from kotlin metadata */
    private final Lazy source = Fragments2.argument(this, "source");

    /* renamed from: threadSettingsItem$delegate, reason: from kotlin metadata */
    private final Lazy threadSettingsItem = Fragments2.argument(this, ARG_THREAD_SETTING_ITEM);
    private final String screenName = AnalyticsStrings.MUTED_SETTINGS_DETAIL_SCREEN_NAME;

    public final AnalyticsLogger getAnalytics() {
        AnalyticsLogger analyticsLogger = this.analytics;
        if (analyticsLogger != null) {
            return analyticsLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
        return null;
    }

    public final void setAnalytics(AnalyticsLogger analyticsLogger) {
        Intrinsics.checkNotNullParameter(analyticsLogger, "<set-?>");
        this.analytics = analyticsLogger;
    }

    private final ThreadNotificationSettings4Duxo getDuxo() {
        return (ThreadNotificationSettings4Duxo) this.duxo.getValue();
    }

    private final TextView getMuteNotificationsTitle() {
        return (TextView) this.muteNotificationsTitle.getValue(this, $$delegatedProperties[0]);
    }

    private final RdsToggleView getMuteNotificationsRdsToggleView() {
        return (RdsToggleView) this.muteNotificationsRdsToggleView.getValue(this, $$delegatedProperties[1]);
    }

    private final ThreadNotificationSettingsSource getSource() {
        return (ThreadNotificationSettingsSource) this.source.getValue();
    }

    private final ApiNotificationThreadSettingsItem getThreadSettingsItem() {
        return (ApiNotificationThreadSettingsItem) this.threadSettingsItem.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, com.robinhood.hammer.android.fragment.HammerDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getDuxo().setThreadSettingId(getThreadSettingsItem().getId());
    }

    @Override // com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(C28315R.layout.dialog_thread_mute_notifications_bottom_sheet, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getMuteNotificationsTitle().setText(getThreadSettingsItem().getMenu_display_title());
        ApiNotificationSettingsToggleSettingsItem toggle_item = getThreadSettingsItem().getToggle_item();
        getMuteNotificationsRdsToggleView().setPrimaryText(toggle_item.getDisplay_title());
        getMuteNotificationsRdsToggleView().setSecondaryText(toggle_item.getDisplay_subtitle());
        getMuteNotificationsRdsToggleView().setChecked(getThreadSettingsItem().isThreadMuted());
        AnalyticsLogger.DefaultImpls.logButtonGroupAppear$default(getAnalytics(), AnalyticsStrings.BUTTON_GROUP_TOGGLE_SETTING, getThreadSettingsItem().getId(), null, null, null, null, Statuses.asAnalyticsTag(getThreadSettingsItem().getToggle_item().getStatus()), null, 188, null);
        getMuteNotificationsRdsToggleView().onCheckedChanged(new Function1() { // from class: com.robinhood.android.settings.ui.notification.thread.ThreadNotificationSettings4BottomSheet$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ThreadNotificationSettings4BottomSheet.onViewCreated$lambda$1(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C284232(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(ThreadNotificationSettings4BottomSheet threadNotificationSettings4BottomSheet, boolean z) {
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(threadNotificationSettings4BottomSheet.getAnalytics(), AnalyticsStrings.BUTTON_GROUP_TOGGLE_SETTING, threadNotificationSettings4BottomSheet.getThreadSettingsItem().getId(), null, null, null, null, Statuses.asAnalyticsTag(threadNotificationSettings4BottomSheet.getThreadSettingsItem().getToggle_item().getStatus()), null, 188, null);
        threadNotificationSettings4BottomSheet.getDuxo().updateNotificationSetting(z);
        return Unit.INSTANCE;
    }

    /* compiled from: ThreadNotificationSettings4BottomSheet.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.settings.ui.notification.thread.ThreadNotificationSettings4BottomSheet$onViewCreated$2 */
    /* synthetic */ class C284232 extends FunctionReferenceImpl implements Function1<ThreadNotificationSettings4ViewState, Unit> {
        C284232(Object obj) {
            super(1, obj, ThreadNotificationSettings4BottomSheet.class, "updateViewState", "updateViewState(Lcom/robinhood/android/settings/ui/notification/thread/ThreadNotificationSettings4ViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ThreadNotificationSettings4ViewState threadNotificationSettings4ViewState) {
            invoke2(threadNotificationSettings4ViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(ThreadNotificationSettings4ViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((ThreadNotificationSettings4BottomSheet) this.receiver).updateViewState(p0);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenName() {
        return this.screenName;
    }

    @Override // com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenSource() {
        return getSource().getAnalyticsSource();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateViewState(ThreadNotificationSettings4ViewState viewState) {
        ErrorHandlers.handleErrorEvent(Fragments2.getActivityErrorHandler(this), viewState.getError());
    }

    /* compiled from: ThreadNotificationSettings4BottomSheet.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/notification/thread/ThreadNotificationSettings4BottomSheet$Companion;", "Lcom/robinhood/android/navigation/DialogFragmentResolver;", "Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey$ThreadNotificationSettings;", "<init>", "()V", "ARG_SOURCE", "", "ARG_THREAD_SETTING_ITEM", "createDialogFragment", "Landroidx/fragment/app/DialogFragment;", "key", "feature-settings_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements DialogFragmentResolver<LegacyDialogFragmentKey.ThreadNotificationSettings> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.DialogFragmentResolver
        public DialogFragment createDialogFragment(LegacyDialogFragmentKey.ThreadNotificationSettings key) {
            Intrinsics.checkNotNullParameter(key, "key");
            ThreadNotificationSettings4BottomSheet threadNotificationSettings4BottomSheet = new ThreadNotificationSettings4BottomSheet();
            Bundle bundle = new Bundle();
            bundle.putSerializable("source", key.getSource());
            bundle.putParcelable(ThreadNotificationSettings4BottomSheet.ARG_THREAD_SETTING_ITEM, key.getThreadSettingsItem());
            threadNotificationSettings4BottomSheet.setArguments(bundle);
            return threadNotificationSettings4BottomSheet;
        }
    }
}
