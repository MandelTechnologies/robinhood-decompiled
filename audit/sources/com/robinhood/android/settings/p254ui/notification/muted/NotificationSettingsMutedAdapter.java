package com.robinhood.android.settings.p254ui.notification.muted;

import android.view.KeyEvent;
import android.view.ViewGroup;
import androidx.recyclerview.widget.ListAdapter;
import com.robinhood.models.api.ApiNotificationThreadSettingsItem;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericViewHolder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NotificationSettingsMutedAdapter.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u001e\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0015\u001a\u00020\u0011H\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/notification/muted/NotificationSettingsMutedAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/robinhood/models/api/ApiNotificationThreadSettingsItem;", "Lcom/robinhood/utils/ui/view/recyclerview/GenericViewHolder;", "Lcom/robinhood/android/settings/ui/notification/muted/NotificationSettingsMutedRow;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/settings/ui/notification/muted/NotificationSettingsMutedAdapter$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/settings/ui/notification/muted/NotificationSettingsMutedAdapter$Callbacks;", "setCallbacks", "(Lcom/robinhood/android/settings/ui/notification/muted/NotificationSettingsMutedAdapter$Callbacks;)V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "", "holder", "position", "Callbacks", "feature-settings_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class NotificationSettingsMutedAdapter extends ListAdapter<ApiNotificationThreadSettingsItem, GenericViewHolder<? extends NotificationSettingsMutedRow>> {
    public static final int $stable = 8;
    private Callbacks callbacks;

    /* compiled from: NotificationSettingsMutedAdapter.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/notification/muted/NotificationSettingsMutedAdapter$Callbacks;", "", "onThreadSettingsItemClicked", "", "threadSettingsItem", "Lcom/robinhood/models/api/ApiNotificationThreadSettingsItem;", "feature-settings_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onThreadSettingsItemClicked(ApiNotificationThreadSettingsItem threadSettingsItem);
    }

    public NotificationSettingsMutedAdapter() {
        super(DiffCallbacks.INSTANCE.byEquality(new Function1() { // from class: com.robinhood.android.settings.ui.notification.muted.NotificationSettingsMutedAdapter$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ((ApiNotificationThreadSettingsItem) obj).getId();
            }
        }));
    }

    public final Callbacks getCallbacks() {
        return this.callbacks;
    }

    public final void setCallbacks(Callbacks callbacks) {
        this.callbacks = callbacks;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public GenericViewHolder<NotificationSettingsMutedRow> onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new GenericViewHolder<>(NotificationSettingsMutedRow.INSTANCE.inflate(parent));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(GenericViewHolder<NotificationSettingsMutedRow> holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final ApiNotificationThreadSettingsItem item = getItem(position);
        KeyEvent.Callback view = holder.getView();
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.robinhood.utils.ui.view.Bindable<com.robinhood.models.api.ApiNotificationThreadSettingsItem>");
        Intrinsics.checkNotNull(item);
        ((Bindable) view).bind(item);
        OnClickListeners.onClick(holder.getView(), new Function0() { // from class: com.robinhood.android.settings.ui.notification.muted.NotificationSettingsMutedAdapter$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NotificationSettingsMutedAdapter.onBindViewHolder$lambda$1(this.f$0, item);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$1(NotificationSettingsMutedAdapter notificationSettingsMutedAdapter, ApiNotificationThreadSettingsItem apiNotificationThreadSettingsItem) {
        Callbacks callbacks = notificationSettingsMutedAdapter.callbacks;
        if (callbacks != null) {
            Intrinsics.checkNotNull(apiNotificationThreadSettingsItem);
            callbacks.onThreadSettingsItemClicked(apiNotificationThreadSettingsItem);
        }
        return Unit.INSTANCE;
    }
}
