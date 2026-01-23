package com.robinhood.android.settings.p254ui.notification;

import android.content.res.Resources;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.settings.C28315R;
import com.robinhood.models.api.ApiNotificationSettings;
import com.robinhood.models.api.ApiNotificationSettingsSection;
import com.robinhood.shared.settings.contracts.NotificationSettings4FragmentKey3;
import com.robinhood.shared.settings.contracts.NotificationSettings4FragmentKey4;
import com.robinhood.utils.resource.StringResource;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: NotificationSettings4ComposeDataState.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0001!B/\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J1\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/settings/ui/notification/NotificationSettings4ComposeDataState;", "", "notificationSettings", "Lcom/robinhood/models/api/ApiNotificationSettings;", "subPageReferenceArg", "Lcom/robinhood/shared/settings/contracts/SubPageReference;", "viewTypes", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/settings/contracts/ViewType;", "<init>", "(Lcom/robinhood/models/api/ApiNotificationSettings;Lcom/robinhood/shared/settings/contracts/SubPageReference;Lkotlinx/collections/immutable/ImmutableList;)V", "getNotificationSettings", "()Lcom/robinhood/models/api/ApiNotificationSettings;", "getSubPageReferenceArg", "()Lcom/robinhood/shared/settings/contracts/SubPageReference;", "getViewTypes", "()Lkotlinx/collections/immutable/ImmutableList;", "toolbarTitle", "Lcom/robinhood/utils/resource/StringResource;", "getToolbarTitle", "()Lcom/robinhood/utils/resource/StringResource;", "mutateWithNotificationSettings", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "feature-settings_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class NotificationSettings4ComposeDataState {
    private final ApiNotificationSettings notificationSettings;
    private final NotificationSettings4FragmentKey3 subPageReferenceArg;
    private final ImmutableList<NotificationSettings4FragmentKey4> viewTypes;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public NotificationSettings4ComposeDataState() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NotificationSettings4ComposeDataState copy$default(NotificationSettings4ComposeDataState notificationSettings4ComposeDataState, ApiNotificationSettings apiNotificationSettings, NotificationSettings4FragmentKey3 notificationSettings4FragmentKey3, ImmutableList immutableList, int i, Object obj) {
        if ((i & 1) != 0) {
            apiNotificationSettings = notificationSettings4ComposeDataState.notificationSettings;
        }
        if ((i & 2) != 0) {
            notificationSettings4FragmentKey3 = notificationSettings4ComposeDataState.subPageReferenceArg;
        }
        if ((i & 4) != 0) {
            immutableList = notificationSettings4ComposeDataState.viewTypes;
        }
        return notificationSettings4ComposeDataState.copy(apiNotificationSettings, notificationSettings4FragmentKey3, immutableList);
    }

    /* renamed from: component1, reason: from getter */
    public final ApiNotificationSettings getNotificationSettings() {
        return this.notificationSettings;
    }

    /* renamed from: component2, reason: from getter */
    public final NotificationSettings4FragmentKey3 getSubPageReferenceArg() {
        return this.subPageReferenceArg;
    }

    public final ImmutableList<NotificationSettings4FragmentKey4> component3() {
        return this.viewTypes;
    }

    public final NotificationSettings4ComposeDataState copy(ApiNotificationSettings notificationSettings, NotificationSettings4FragmentKey3 subPageReferenceArg, ImmutableList<? extends NotificationSettings4FragmentKey4> viewTypes) {
        Intrinsics.checkNotNullParameter(viewTypes, "viewTypes");
        return new NotificationSettings4ComposeDataState(notificationSettings, subPageReferenceArg, viewTypes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationSettings4ComposeDataState)) {
            return false;
        }
        NotificationSettings4ComposeDataState notificationSettings4ComposeDataState = (NotificationSettings4ComposeDataState) other;
        return Intrinsics.areEqual(this.notificationSettings, notificationSettings4ComposeDataState.notificationSettings) && Intrinsics.areEqual(this.subPageReferenceArg, notificationSettings4ComposeDataState.subPageReferenceArg) && Intrinsics.areEqual(this.viewTypes, notificationSettings4ComposeDataState.viewTypes);
    }

    public int hashCode() {
        ApiNotificationSettings apiNotificationSettings = this.notificationSettings;
        int iHashCode = (apiNotificationSettings == null ? 0 : apiNotificationSettings.hashCode()) * 31;
        NotificationSettings4FragmentKey3 notificationSettings4FragmentKey3 = this.subPageReferenceArg;
        return ((iHashCode + (notificationSettings4FragmentKey3 != null ? notificationSettings4FragmentKey3.hashCode() : 0)) * 31) + this.viewTypes.hashCode();
    }

    public String toString() {
        return "NotificationSettings4ComposeDataState(notificationSettings=" + this.notificationSettings + ", subPageReferenceArg=" + this.subPageReferenceArg + ", viewTypes=" + this.viewTypes + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NotificationSettings4ComposeDataState(ApiNotificationSettings apiNotificationSettings, NotificationSettings4FragmentKey3 notificationSettings4FragmentKey3, ImmutableList<? extends NotificationSettings4FragmentKey4> viewTypes) {
        Intrinsics.checkNotNullParameter(viewTypes, "viewTypes");
        this.notificationSettings = apiNotificationSettings;
        this.subPageReferenceArg = notificationSettings4FragmentKey3;
        this.viewTypes = viewTypes;
    }

    public final ApiNotificationSettings getNotificationSettings() {
        return this.notificationSettings;
    }

    public final NotificationSettings4FragmentKey3 getSubPageReferenceArg() {
        return this.subPageReferenceArg;
    }

    public /* synthetic */ NotificationSettings4ComposeDataState(ApiNotificationSettings apiNotificationSettings, NotificationSettings4FragmentKey3 notificationSettings4FragmentKey3, ImmutableList immutableList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : apiNotificationSettings, (i & 2) != 0 ? null : notificationSettings4FragmentKey3, (i & 4) != 0 ? extensions2.persistentListOf() : immutableList);
    }

    public final ImmutableList<NotificationSettings4FragmentKey4> getViewTypes() {
        return this.viewTypes;
    }

    public final StringResource getToolbarTitle() {
        String display_title;
        NotificationSettings4FragmentKey3 notificationSettings4FragmentKey3 = this.subPageReferenceArg;
        if (notificationSettings4FragmentKey3 instanceof NotificationSettings4FragmentKey3.FromViews) {
            return StringResource.INSTANCE.invoke(((NotificationSettings4FragmentKey3.FromViews) notificationSettings4FragmentKey3).getTitle());
        }
        if (!(notificationSettings4FragmentKey3 instanceof NotificationSettings4FragmentKey3.FromId)) {
            if (notificationSettings4FragmentKey3 != null) {
                throw new NoWhenBranchMatchedException();
            }
            return StringResource.INSTANCE.invoke(C28315R.string.setting_notifications_tab_title, new Object[0]);
        }
        StringResource.Companion companion = StringResource.INSTANCE;
        ApiNotificationSettings apiNotificationSettings = this.notificationSettings;
        if (apiNotificationSettings == null || (display_title = apiNotificationSettings.getDisplay_title()) == null) {
            display_title = "";
        }
        return companion.invoke(display_title);
    }

    public final NotificationSettings4ComposeDataState mutateWithNotificationSettings(ApiNotificationSettings notificationSettings) {
        Intrinsics.checkNotNullParameter(notificationSettings, "notificationSettings");
        ArrayList arrayList = new ArrayList();
        for (ApiNotificationSettingsSection apiNotificationSettingsSection : notificationSettings.getSections()) {
            ApiNotificationSettingsSections.toViewType(apiNotificationSettingsSection, notificationSettings.getId(), apiNotificationSettingsSection.getId(), null, this.subPageReferenceArg instanceof NotificationSettings4FragmentKey3.FromViews, arrayList);
        }
        return copy$default(this, notificationSettings, null, extensions2.toImmutableList(arrayList), 2, null);
    }

    /* compiled from: NotificationSettings4ComposeDataState.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/notification/NotificationSettings4ComposeDataState$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_DEFAULT, "Lcom/robinhood/android/settings/ui/notification/NotificationSettings4ComposeDataState;", "subPageReferenceArg", "Lcom/robinhood/shared/settings/contracts/SubPageReference;", "resources", "Landroid/content/res/Resources;", "feature-settings_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* renamed from: default, reason: not valid java name */
        public final NotificationSettings4ComposeDataState m18862default(NotificationSettings4FragmentKey3 subPageReferenceArg, Resources resources) {
            Intrinsics.checkNotNullParameter(resources, "resources");
            if (subPageReferenceArg instanceof NotificationSettings4FragmentKey3.FromViews) {
                return new NotificationSettings4ComposeDataState(null, subPageReferenceArg, extensions2.toImmutableList(((NotificationSettings4FragmentKey3.FromViews) subPageReferenceArg).getViews()), 1, null);
            }
            if (subPageReferenceArg instanceof NotificationSettings4FragmentKey3.FromId) {
                return new NotificationSettings4ComposeDataState(null, subPageReferenceArg, null, 5, null);
            }
            if (subPageReferenceArg != null) {
                throw new NoWhenBranchMatchedException();
            }
            return new NotificationSettings4ComposeDataState(null, null, extensions2.toImmutableList(TopLevelViewTypes.topLevelViewTypes(resources)), 3, null);
        }
    }
}
