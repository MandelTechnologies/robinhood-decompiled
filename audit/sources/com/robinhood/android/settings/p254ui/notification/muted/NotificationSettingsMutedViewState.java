package com.robinhood.android.settings.p254ui.notification.muted;

import android.content.res.Resources;
import com.robinhood.android.settings.C28315R;
import com.robinhood.models.api.ApiNotificationThreadSettingsItem;
import com.robinhood.udf.UiEvent;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: NotificationSettingsMutedViewState.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002J\t\u0010#\u001a\u00020\u0003HÂ\u0003J\t\u0010$\u001a\u00020\u0005HÂ\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÂ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0011\u0010'\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003JK\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001J\u0013\u0010)\u001a\u00020\u00052\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\nHÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0011\u0010\u001c\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0011\u0010\u001e\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0011R\u0011\u0010 \u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0011¨\u0006."}, m3636d2 = {"Lcom/robinhood/android/settings/ui/notification/muted/NotificationSettingsMutedViewState;", "", "resources", "Landroid/content/res/Resources;", "isSet", "", "threadSettingsItems", "", "Lcom/robinhood/models/api/ApiNotificationThreadSettingsItem;", "filter", "", "threadSettingsError", "Lcom/robinhood/udf/UiEvent;", "", "<init>", "(Landroid/content/res/Resources;ZLjava/util/List;Ljava/lang/String;Lcom/robinhood/udf/UiEvent;)V", "getFilter", "()Ljava/lang/String;", "getThreadSettingsError", "()Lcom/robinhood/udf/UiEvent;", "filteredThreadSettingsItem", "getFilteredThreadSettingsItem", "()Ljava/util/List;", "showSearchIcon", "getShowSearchIcon", "()Z", "showEmptyState", "getShowEmptyState", "showListView", "getShowListView", "emptyStateTitleText", "getEmptyStateTitleText", "emptyStateDescriptionText", "getEmptyStateDescriptionText", "filterSettings", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "feature-settings_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final /* data */ class NotificationSettingsMutedViewState {
    public static final int $stable = 8;
    private final String emptyStateDescriptionText;
    private final String emptyStateTitleText;
    private final String filter;
    private final List<ApiNotificationThreadSettingsItem> filteredThreadSettingsItem;
    private final boolean isSet;
    private final Resources resources;
    private final boolean showEmptyState;
    private final boolean showListView;
    private final boolean showSearchIcon;
    private final UiEvent<Throwable> threadSettingsError;
    private final List<ApiNotificationThreadSettingsItem> threadSettingsItems;

    /* renamed from: component1, reason: from getter */
    private final Resources getResources() {
        return this.resources;
    }

    /* renamed from: component2, reason: from getter */
    private final boolean getIsSet() {
        return this.isSet;
    }

    private final List<ApiNotificationThreadSettingsItem> component3() {
        return this.threadSettingsItems;
    }

    public static /* synthetic */ NotificationSettingsMutedViewState copy$default(NotificationSettingsMutedViewState notificationSettingsMutedViewState, Resources resources, boolean z, List list, String str, UiEvent uiEvent, int i, Object obj) {
        if ((i & 1) != 0) {
            resources = notificationSettingsMutedViewState.resources;
        }
        if ((i & 2) != 0) {
            z = notificationSettingsMutedViewState.isSet;
        }
        if ((i & 4) != 0) {
            list = notificationSettingsMutedViewState.threadSettingsItems;
        }
        if ((i & 8) != 0) {
            str = notificationSettingsMutedViewState.filter;
        }
        if ((i & 16) != 0) {
            uiEvent = notificationSettingsMutedViewState.threadSettingsError;
        }
        UiEvent uiEvent2 = uiEvent;
        List list2 = list;
        return notificationSettingsMutedViewState.copy(resources, z, list2, str, uiEvent2);
    }

    /* renamed from: component4, reason: from getter */
    public final String getFilter() {
        return this.filter;
    }

    public final UiEvent<Throwable> component5() {
        return this.threadSettingsError;
    }

    public final NotificationSettingsMutedViewState copy(Resources resources, boolean isSet, List<ApiNotificationThreadSettingsItem> threadSettingsItems, String filter, UiEvent<Throwable> threadSettingsError) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(threadSettingsItems, "threadSettingsItems");
        return new NotificationSettingsMutedViewState(resources, isSet, threadSettingsItems, filter, threadSettingsError);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationSettingsMutedViewState)) {
            return false;
        }
        NotificationSettingsMutedViewState notificationSettingsMutedViewState = (NotificationSettingsMutedViewState) other;
        return Intrinsics.areEqual(this.resources, notificationSettingsMutedViewState.resources) && this.isSet == notificationSettingsMutedViewState.isSet && Intrinsics.areEqual(this.threadSettingsItems, notificationSettingsMutedViewState.threadSettingsItems) && Intrinsics.areEqual(this.filter, notificationSettingsMutedViewState.filter) && Intrinsics.areEqual(this.threadSettingsError, notificationSettingsMutedViewState.threadSettingsError);
    }

    public int hashCode() {
        int iHashCode = ((((this.resources.hashCode() * 31) + Boolean.hashCode(this.isSet)) * 31) + this.threadSettingsItems.hashCode()) * 31;
        String str = this.filter;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        UiEvent<Throwable> uiEvent = this.threadSettingsError;
        return iHashCode2 + (uiEvent != null ? uiEvent.hashCode() : 0);
    }

    public String toString() {
        return "NotificationSettingsMutedViewState(resources=" + this.resources + ", isSet=" + this.isSet + ", threadSettingsItems=" + this.threadSettingsItems + ", filter=" + this.filter + ", threadSettingsError=" + this.threadSettingsError + ")";
    }

    public NotificationSettingsMutedViewState(Resources resources, boolean z, List<ApiNotificationThreadSettingsItem> threadSettingsItems, String str, UiEvent<Throwable> uiEvent) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(threadSettingsItems, "threadSettingsItems");
        this.resources = resources;
        this.isSet = z;
        this.threadSettingsItems = threadSettingsItems;
        this.filter = str;
        this.threadSettingsError = uiEvent;
        if (z) {
            if (threadSettingsItems.isEmpty()) {
                this.filteredThreadSettingsItem = CollectionsKt.emptyList();
                this.showSearchIcon = false;
                this.showEmptyState = true;
                this.showListView = false;
                String string2 = resources.getString(C28315R.string.setting_notifications_muted_empty_state_title);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                this.emptyStateTitleText = string2;
                String string3 = resources.getString(C28315R.string.setting_notifications_muted_empty_state_description);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                this.emptyStateDescriptionText = string3;
                return;
            }
            List<ApiNotificationThreadSettingsItem> listFilterSettings = filterSettings();
            this.filteredThreadSettingsItem = listFilterSettings;
            this.showSearchIcon = true;
            boolean zIsEmpty = listFilterSettings.isEmpty();
            this.showEmptyState = zIsEmpty;
            this.showListView = !listFilterSettings.isEmpty();
            if (zIsEmpty) {
                int i = C28315R.string.setting_notifications_muted_no_search_results_title;
                Intrinsics.checkNotNull(str);
                String string4 = resources.getString(i, str);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                this.emptyStateTitleText = string4;
                String string5 = resources.getString(C28315R.string.setting_notifications_muted_no_search_results_description);
                Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                this.emptyStateDescriptionText = string5;
                return;
            }
            this.emptyStateTitleText = "";
            this.emptyStateDescriptionText = "";
            return;
        }
        this.showSearchIcon = false;
        this.showEmptyState = false;
        this.showListView = false;
        this.filteredThreadSettingsItem = CollectionsKt.emptyList();
        this.emptyStateTitleText = "";
        this.emptyStateDescriptionText = "";
    }

    public /* synthetic */ NotificationSettingsMutedViewState(Resources resources, boolean z, List list, String str, UiEvent uiEvent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(resources, (i & 2) != 0 ? false : z, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : uiEvent);
    }

    public final String getFilter() {
        return this.filter;
    }

    public final UiEvent<Throwable> getThreadSettingsError() {
        return this.threadSettingsError;
    }

    public final List<ApiNotificationThreadSettingsItem> getFilteredThreadSettingsItem() {
        return this.filteredThreadSettingsItem;
    }

    public final boolean getShowSearchIcon() {
        return this.showSearchIcon;
    }

    public final boolean getShowEmptyState() {
        return this.showEmptyState;
    }

    public final boolean getShowListView() {
        return this.showListView;
    }

    public final String getEmptyStateTitleText() {
        return this.emptyStateTitleText;
    }

    public final String getEmptyStateDescriptionText() {
        return this.emptyStateDescriptionText;
    }

    private final List<ApiNotificationThreadSettingsItem> filterSettings() {
        if (this.filter == null) {
            return this.threadSettingsItems;
        }
        List<ApiNotificationThreadSettingsItem> list = this.threadSettingsItems;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (StringsKt.contains((CharSequence) ((ApiNotificationThreadSettingsItem) obj).getMenu_display_title(), (CharSequence) this.filter, true)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
