package com.robinhood.android.settings.p254ui.notification.muted;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.robinhood.android.common.p088ui.AvatarView;
import com.robinhood.android.common.p088ui.BindViewDelegate2;
import com.robinhood.android.designsystem.container.RdsRippleContainerView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.settings.C28315R;
import com.robinhood.models.api.ApiNotificationThreadSettingsItem;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: NotificationSettingsMutedRow.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00182\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0018B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0003H\u0016R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/notification/muted/NotificationSettingsMutedRow;", "Lcom/robinhood/android/designsystem/container/RdsRippleContainerView;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/models/api/ApiNotificationThreadSettingsItem;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "avatarView", "Lcom/robinhood/android/common/ui/AvatarView;", "getAvatarView", "()Lcom/robinhood/android/common/ui/AvatarView;", "avatarView$delegate", "Lkotlin/properties/ReadOnlyProperty;", "titleText", "Lcom/robinhood/android/designsystem/text/RhTextView;", "getTitleText", "()Lcom/robinhood/android/designsystem/text/RhTextView;", "titleText$delegate", "bind", "", "state", "Companion", "feature-settings_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class NotificationSettingsMutedRow extends RdsRippleContainerView implements Bindable<ApiNotificationThreadSettingsItem> {

    /* renamed from: avatarView$delegate, reason: from kotlin metadata */
    private final Interfaces2 avatarView;

    /* renamed from: titleText$delegate, reason: from kotlin metadata */
    private final Interfaces2 titleText;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(NotificationSettingsMutedRow.class, "avatarView", "getAvatarView()Lcom/robinhood/android/common/ui/AvatarView;", 0)), Reflection.property1(new PropertyReference1Impl(NotificationSettingsMutedRow.class, "titleText", "getTitleText()Lcom/robinhood/android/designsystem/text/RhTextView;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationSettingsMutedRow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewGroups.inflate(this, C28315R.layout.merge_notification_settings_muted_row, true);
        this.avatarView = BindViewDelegate2.bindView$default(this, C28315R.id.avatar_view, null, 2, null);
        this.titleText = BindViewDelegate2.bindView$default(this, C28315R.id.row_title, null, 2, null);
    }

    private final AvatarView getAvatarView() {
        return (AvatarView) this.avatarView.getValue(this, $$delegatedProperties[0]);
    }

    private final RhTextView getTitleText() {
        return (RhTextView) this.titleText.getValue(this, $$delegatedProperties[1]);
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(ApiNotificationThreadSettingsItem state) {
        Intrinsics.checkNotNullParameter(state, "state");
        getTitleText().setText(state.getMenu_display_title());
        getAvatarView().bind(state.getShort_display_name(), state.getAvatar_url());
    }

    /* compiled from: NotificationSettingsMutedRow.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/notification/muted/NotificationSettingsMutedRow$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/settings/ui/notification/muted/NotificationSettingsMutedRow;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-settings_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<NotificationSettingsMutedRow> {
        private final /* synthetic */ Inflater<NotificationSettingsMutedRow> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public NotificationSettingsMutedRow inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (NotificationSettingsMutedRow) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C28315R.layout.include_notification_settings_muted_row);
        }
    }
}
