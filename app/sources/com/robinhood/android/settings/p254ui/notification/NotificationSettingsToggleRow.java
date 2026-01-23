package com.robinhood.android.settings.p254ui.notification;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.robinhood.android.common.p088ui.BindViewDelegate2;
import com.robinhood.android.designsystem.selectioncontrol.RdsToggleView;
import com.robinhood.android.settings.C28315R;
import com.robinhood.models.api.ApiNotificationSettingsToggleSettingsItem;
import com.robinhood.shared.settings.contracts.NotificationSettings4FragmentKey4;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.Inflater;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: NotificationSettingsToggleRow.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00172\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0017B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0003H\u0016J\u001c\u0010\u0013\u001a\u00020\u00112\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0015R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/notification/NotificationSettingsToggleRow;", "Landroid/widget/LinearLayout;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/shared/settings/contracts/ViewType$Toggle;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "toggleView", "Lcom/robinhood/android/designsystem/selectioncontrol/RdsToggleView;", "getToggleView", "()Lcom/robinhood/android/designsystem/selectioncontrol/RdsToggleView;", "toggleView$delegate", "Lkotlin/properties/ReadOnlyProperty;", "bind", "", "state", "onCheckedChanged", "listener", "Lkotlin/Function1;", "", "Companion", "feature-settings_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class NotificationSettingsToggleRow extends LinearLayout implements Bindable<NotificationSettings4FragmentKey4.Toggle> {

    /* renamed from: toggleView$delegate, reason: from kotlin metadata */
    private final Interfaces2 toggleView;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(NotificationSettingsToggleRow.class, "toggleView", "getToggleView()Lcom/robinhood/android/designsystem/selectioncontrol/RdsToggleView;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: NotificationSettingsToggleRow.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiNotificationSettingsToggleSettingsItem.Status.values().length];
            try {
                iArr[ApiNotificationSettingsToggleSettingsItem.Status.f5427ON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiNotificationSettingsToggleSettingsItem.Status.OFF.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiNotificationSettingsToggleSettingsItem.Status.REQUIRED_ON.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationSettingsToggleRow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewGroups.inflate(this, C28315R.layout.merge_notification_settings_toggle_row, true);
        this.toggleView = BindViewDelegate2.bindView$default(this, C28315R.id.toggle_view, null, 2, null);
    }

    private final RdsToggleView getToggleView() {
        return (RdsToggleView) this.toggleView.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(NotificationSettings4FragmentKey4.Toggle state) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(state, "state");
        getToggleView().setPrimaryText(state.getTitle());
        getToggleView().setSecondaryText(state.getDescription());
        int i = WhenMappings.$EnumSwitchMapping$0[state.getStatus().ordinal()];
        if (i == 1) {
            getToggleView().setCheckedProgrammatically(true);
            getToggleView().setLocked(false);
            getToggleView().setEnabled(true);
        } else if (i == 2) {
            getToggleView().setCheckedProgrammatically(false);
            getToggleView().setLocked(false);
            getToggleView().setEnabled(true);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            getToggleView().setCheckedProgrammatically(true);
            getToggleView().setLocked(true);
            getToggleView().setEnabled(false);
        }
    }

    public final void onCheckedChanged(Function1<? super Boolean, Unit> listener) {
        getToggleView().onCheckedChanged(listener);
    }

    /* compiled from: NotificationSettingsToggleRow.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/notification/NotificationSettingsToggleRow$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/settings/ui/notification/NotificationSettingsToggleRow;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-settings_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<NotificationSettingsToggleRow> {
        private final /* synthetic */ Inflater<NotificationSettingsToggleRow> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public NotificationSettingsToggleRow inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (NotificationSettingsToggleRow) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C28315R.layout.include_notification_settings_toggle_row);
        }
    }
}
