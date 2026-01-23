package com.robinhood.android.settings.p254ui.notification;

import com.robinhood.shared.settings.contracts.NotificationSettings4FragmentKey4;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: NotificationSettings4ComposeViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/notification/NotificationSettings4ComposeViewState;", "", "<init>", "()V", "toolbarTitle", "Lcom/robinhood/utils/resource/StringResource;", "getToolbarTitle", "()Lcom/robinhood/utils/resource/StringResource;", "Loading", "Loaded", "Lcom/robinhood/android/settings/ui/notification/NotificationSettings4ComposeViewState$Loaded;", "Lcom/robinhood/android/settings/ui/notification/NotificationSettings4ComposeViewState$Loading;", "feature-settings_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public abstract class NotificationSettings4ComposeViewState {
    public static final int $stable = 0;

    public /* synthetic */ NotificationSettings4ComposeViewState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract StringResource getToolbarTitle();

    private NotificationSettings4ComposeViewState() {
    }

    /* compiled from: NotificationSettings4ComposeViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/notification/NotificationSettings4ComposeViewState$Loading;", "Lcom/robinhood/android/settings/ui/notification/NotificationSettings4ComposeViewState;", "toolbarTitle", "Lcom/robinhood/utils/resource/StringResource;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;)V", "getToolbarTitle", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-settings_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading extends NotificationSettings4ComposeViewState {
        public static final int $stable = StringResource.$stable;
        private final StringResource toolbarTitle;

        public static /* synthetic */ Loading copy$default(Loading loading, StringResource stringResource, int i, Object obj) {
            if ((i & 1) != 0) {
                stringResource = loading.toolbarTitle;
            }
            return loading.copy(stringResource);
        }

        /* renamed from: component1, reason: from getter */
        public final StringResource getToolbarTitle() {
            return this.toolbarTitle;
        }

        public final Loading copy(StringResource toolbarTitle) {
            Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
            return new Loading(toolbarTitle);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loading) && Intrinsics.areEqual(this.toolbarTitle, ((Loading) other).toolbarTitle);
        }

        public int hashCode() {
            return this.toolbarTitle.hashCode();
        }

        public String toString() {
            return "Loading(toolbarTitle=" + this.toolbarTitle + ")";
        }

        @Override // com.robinhood.android.settings.p254ui.notification.NotificationSettings4ComposeViewState
        public StringResource getToolbarTitle() {
            return this.toolbarTitle;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loading(StringResource toolbarTitle) {
            super(null);
            Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
            this.toolbarTitle = toolbarTitle;
        }
    }

    /* compiled from: NotificationSettings4ComposeViewState.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/notification/NotificationSettings4ComposeViewState$Loaded;", "Lcom/robinhood/android/settings/ui/notification/NotificationSettings4ComposeViewState;", "toolbarTitle", "Lcom/robinhood/utils/resource/StringResource;", "viewTypes", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/settings/contracts/ViewType;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lkotlinx/collections/immutable/ImmutableList;)V", "getToolbarTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getViewTypes", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-settings_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded extends NotificationSettings4ComposeViewState {
        public static final int $stable = 8;
        private final StringResource toolbarTitle;
        private final ImmutableList<NotificationSettings4FragmentKey4> viewTypes;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Loaded copy$default(Loaded loaded, StringResource stringResource, ImmutableList immutableList, int i, Object obj) {
            if ((i & 1) != 0) {
                stringResource = loaded.toolbarTitle;
            }
            if ((i & 2) != 0) {
                immutableList = loaded.viewTypes;
            }
            return loaded.copy(stringResource, immutableList);
        }

        /* renamed from: component1, reason: from getter */
        public final StringResource getToolbarTitle() {
            return this.toolbarTitle;
        }

        public final ImmutableList<NotificationSettings4FragmentKey4> component2() {
            return this.viewTypes;
        }

        public final Loaded copy(StringResource toolbarTitle, ImmutableList<? extends NotificationSettings4FragmentKey4> viewTypes) {
            Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
            Intrinsics.checkNotNullParameter(viewTypes, "viewTypes");
            return new Loaded(toolbarTitle, viewTypes);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.toolbarTitle, loaded.toolbarTitle) && Intrinsics.areEqual(this.viewTypes, loaded.viewTypes);
        }

        public int hashCode() {
            return (this.toolbarTitle.hashCode() * 31) + this.viewTypes.hashCode();
        }

        public String toString() {
            return "Loaded(toolbarTitle=" + this.toolbarTitle + ", viewTypes=" + this.viewTypes + ")";
        }

        @Override // com.robinhood.android.settings.p254ui.notification.NotificationSettings4ComposeViewState
        public StringResource getToolbarTitle() {
            return this.toolbarTitle;
        }

        public final ImmutableList<NotificationSettings4FragmentKey4> getViewTypes() {
            return this.viewTypes;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Loaded(StringResource toolbarTitle, ImmutableList<? extends NotificationSettings4FragmentKey4> viewTypes) {
            super(null);
            Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
            Intrinsics.checkNotNullParameter(viewTypes, "viewTypes");
            this.toolbarTitle = toolbarTitle;
            this.viewTypes = viewTypes;
        }
    }
}
