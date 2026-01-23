package com.robinhood.android.settings.p254ui.notification;

import android.content.res.Resources;
import com.robinhood.android.settings.C28315R;
import com.robinhood.models.api.ApiNotificationSettings;
import com.robinhood.models.api.ApiNotificationSettingsSection;
import com.robinhood.shared.settings.contracts.NotificationSettings4FragmentKey3;
import com.robinhood.shared.settings.contracts.NotificationSettings4FragmentKey4;
import com.robinhood.udf.UiEvent;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NotificationSettings4ViewState.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001!B9\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÂ\u0003J\t\u0010\u0018\u001a\u00020\nHÂ\u0003J=\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/settings/ui/notification/NotificationSettings4ViewState;", "", "notificationSettings", "Lcom/robinhood/models/api/ApiNotificationSettings;", "notificationSettingsError", "Lcom/robinhood/udf/UiEvent;", "", "subPageReferenceArg", "Lcom/robinhood/shared/settings/contracts/SubPageReference;", "resources", "Landroid/content/res/Resources;", "<init>", "(Lcom/robinhood/models/api/ApiNotificationSettings;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/shared/settings/contracts/SubPageReference;Landroid/content/res/Resources;)V", "getNotificationSettings", "()Lcom/robinhood/models/api/ApiNotificationSettings;", "getNotificationSettingsError", "()Lcom/robinhood/udf/UiEvent;", "pageContent", "Lcom/robinhood/android/settings/ui/notification/NotificationSettings4ViewState$PageContent;", "getPageContent", "()Lcom/robinhood/android/settings/ui/notification/NotificationSettings4ViewState$PageContent;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "PageContent", "feature-settings_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class NotificationSettings4ViewState {
    public static final int $stable = 8;
    private final ApiNotificationSettings notificationSettings;
    private final UiEvent<Throwable> notificationSettingsError;
    private final Resources resources;
    private final NotificationSettings4FragmentKey3 subPageReferenceArg;

    /* renamed from: component3, reason: from getter */
    private final NotificationSettings4FragmentKey3 getSubPageReferenceArg() {
        return this.subPageReferenceArg;
    }

    /* renamed from: component4, reason: from getter */
    private final Resources getResources() {
        return this.resources;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NotificationSettings4ViewState copy$default(NotificationSettings4ViewState notificationSettings4ViewState, ApiNotificationSettings apiNotificationSettings, UiEvent uiEvent, NotificationSettings4FragmentKey3 notificationSettings4FragmentKey3, Resources resources, int i, Object obj) {
        if ((i & 1) != 0) {
            apiNotificationSettings = notificationSettings4ViewState.notificationSettings;
        }
        if ((i & 2) != 0) {
            uiEvent = notificationSettings4ViewState.notificationSettingsError;
        }
        if ((i & 4) != 0) {
            notificationSettings4FragmentKey3 = notificationSettings4ViewState.subPageReferenceArg;
        }
        if ((i & 8) != 0) {
            resources = notificationSettings4ViewState.resources;
        }
        return notificationSettings4ViewState.copy(apiNotificationSettings, uiEvent, notificationSettings4FragmentKey3, resources);
    }

    /* renamed from: component1, reason: from getter */
    public final ApiNotificationSettings getNotificationSettings() {
        return this.notificationSettings;
    }

    public final UiEvent<Throwable> component2() {
        return this.notificationSettingsError;
    }

    public final NotificationSettings4ViewState copy(ApiNotificationSettings notificationSettings, UiEvent<Throwable> notificationSettingsError, NotificationSettings4FragmentKey3 subPageReferenceArg, Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        return new NotificationSettings4ViewState(notificationSettings, notificationSettingsError, subPageReferenceArg, resources);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationSettings4ViewState)) {
            return false;
        }
        NotificationSettings4ViewState notificationSettings4ViewState = (NotificationSettings4ViewState) other;
        return Intrinsics.areEqual(this.notificationSettings, notificationSettings4ViewState.notificationSettings) && Intrinsics.areEqual(this.notificationSettingsError, notificationSettings4ViewState.notificationSettingsError) && Intrinsics.areEqual(this.subPageReferenceArg, notificationSettings4ViewState.subPageReferenceArg) && Intrinsics.areEqual(this.resources, notificationSettings4ViewState.resources);
    }

    public int hashCode() {
        ApiNotificationSettings apiNotificationSettings = this.notificationSettings;
        int iHashCode = (apiNotificationSettings == null ? 0 : apiNotificationSettings.hashCode()) * 31;
        UiEvent<Throwable> uiEvent = this.notificationSettingsError;
        int iHashCode2 = (iHashCode + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        NotificationSettings4FragmentKey3 notificationSettings4FragmentKey3 = this.subPageReferenceArg;
        return ((iHashCode2 + (notificationSettings4FragmentKey3 != null ? notificationSettings4FragmentKey3.hashCode() : 0)) * 31) + this.resources.hashCode();
    }

    public String toString() {
        return "NotificationSettings4ViewState(notificationSettings=" + this.notificationSettings + ", notificationSettingsError=" + this.notificationSettingsError + ", subPageReferenceArg=" + this.subPageReferenceArg + ", resources=" + this.resources + ")";
    }

    public NotificationSettings4ViewState(ApiNotificationSettings apiNotificationSettings, UiEvent<Throwable> uiEvent, NotificationSettings4FragmentKey3 notificationSettings4FragmentKey3, Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.notificationSettings = apiNotificationSettings;
        this.notificationSettingsError = uiEvent;
        this.subPageReferenceArg = notificationSettings4FragmentKey3;
        this.resources = resources;
    }

    public /* synthetic */ NotificationSettings4ViewState(ApiNotificationSettings apiNotificationSettings, UiEvent uiEvent, NotificationSettings4FragmentKey3 notificationSettings4FragmentKey3, Resources resources, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : apiNotificationSettings, (i & 2) != 0 ? null : uiEvent, (i & 4) != 0 ? null : notificationSettings4FragmentKey3, resources);
    }

    public final ApiNotificationSettings getNotificationSettings() {
        return this.notificationSettings;
    }

    public final UiEvent<Throwable> getNotificationSettingsError() {
        return this.notificationSettingsError;
    }

    public final PageContent getPageContent() throws Resources.NotFoundException {
        List<NotificationSettings4FragmentKey4> views;
        String display_title;
        List<NotificationSettings4FragmentKey4> listEmptyList = CollectionsKt.emptyList();
        NotificationSettings4FragmentKey3 notificationSettings4FragmentKey3 = this.subPageReferenceArg;
        NotificationSettings4FragmentKey3.FromViews fromViews = notificationSettings4FragmentKey3 instanceof NotificationSettings4FragmentKey3.FromViews ? (NotificationSettings4FragmentKey3.FromViews) notificationSettings4FragmentKey3 : null;
        if (fromViews != null) {
            display_title = fromViews.getTitle();
            views = fromViews.getViews();
        } else if ((notificationSettings4FragmentKey3 != null ? notificationSettings4FragmentKey3.getId() : null) == null) {
            display_title = this.resources.getString(C28315R.string.setting_notifications_tab_title);
            Intrinsics.checkNotNullExpressionValue(display_title, "getString(...)");
            views = TopLevelViewTypes.topLevelViewTypes(this.resources);
        } else {
            ApiNotificationSettings apiNotificationSettings = this.notificationSettings;
            if (apiNotificationSettings != null) {
                display_title = apiNotificationSettings.getDisplay_title();
                if (display_title == null) {
                    display_title = "";
                }
                ArrayList arrayList = new ArrayList();
                for (ApiNotificationSettingsSection apiNotificationSettingsSection : this.notificationSettings.getSections()) {
                    ApiNotificationSettingsSections.toViewType(apiNotificationSettingsSection, this.notificationSettings.getId(), apiNotificationSettingsSection.getId(), null, false, arrayList);
                }
                views = arrayList;
            } else {
                views = listEmptyList;
                display_title = "";
            }
        }
        return new PageContent(display_title, views);
    }

    /* compiled from: NotificationSettings4ViewState.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/notification/NotificationSettings4ViewState$PageContent;", "", "toolbarTitle", "", "viewTypes", "", "Lcom/robinhood/shared/settings/contracts/ViewType;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getToolbarTitle", "()Ljava/lang/String;", "getViewTypes", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-settings_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PageContent {
        public static final int $stable = 8;
        private final String toolbarTitle;
        private final List<NotificationSettings4FragmentKey4> viewTypes;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PageContent copy$default(PageContent pageContent, String str, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = pageContent.toolbarTitle;
            }
            if ((i & 2) != 0) {
                list = pageContent.viewTypes;
            }
            return pageContent.copy(str, list);
        }

        /* renamed from: component1, reason: from getter */
        public final String getToolbarTitle() {
            return this.toolbarTitle;
        }

        public final List<NotificationSettings4FragmentKey4> component2() {
            return this.viewTypes;
        }

        public final PageContent copy(String toolbarTitle, List<? extends NotificationSettings4FragmentKey4> viewTypes) {
            Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
            Intrinsics.checkNotNullParameter(viewTypes, "viewTypes");
            return new PageContent(toolbarTitle, viewTypes);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PageContent)) {
                return false;
            }
            PageContent pageContent = (PageContent) other;
            return Intrinsics.areEqual(this.toolbarTitle, pageContent.toolbarTitle) && Intrinsics.areEqual(this.viewTypes, pageContent.viewTypes);
        }

        public int hashCode() {
            return (this.toolbarTitle.hashCode() * 31) + this.viewTypes.hashCode();
        }

        public String toString() {
            return "PageContent(toolbarTitle=" + this.toolbarTitle + ", viewTypes=" + this.viewTypes + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public PageContent(String toolbarTitle, List<? extends NotificationSettings4FragmentKey4> viewTypes) {
            Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
            Intrinsics.checkNotNullParameter(viewTypes, "viewTypes");
            this.toolbarTitle = toolbarTitle;
            this.viewTypes = viewTypes;
        }

        public final String getToolbarTitle() {
            return this.toolbarTitle;
        }

        public final List<NotificationSettings4FragmentKey4> getViewTypes() {
            return this.viewTypes;
        }
    }
}
