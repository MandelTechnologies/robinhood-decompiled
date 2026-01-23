package com.robinhood.shared.onboarding.lib.menuofoption;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.models.api.identi.sortinghat.SortingHatTypes2;
import com.robinhood.models.p320db.identi.sortinghat.MenuOfOptionsItem;
import com.robinhood.models.p320db.identi.sortinghat.TextOverrides;
import com.robinhood.utils.extensions.ResourceTypes;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: UiMenuOfOptionsItem.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u001e\u001fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\u0082\u0001\u0002 !¨\u0006\""}, m3636d2 = {"Lcom/robinhood/shared/onboarding/lib/menuofoption/UiMenuOfOptionsItem;", "", "<init>", "()V", "loggingName", "", "getLoggingName", "()Ljava/lang/String;", ResourceTypes.STYLE, "Lcom/robinhood/models/api/identi/sortinghat/MenuOfOptionsItemStyle;", "getStyle", "()Lcom/robinhood/models/api/identi/sortinghat/MenuOfOptionsItemStyle;", "startIcon", "", "getStartIcon", "()I", "showDivider", "", "getShowDivider", "()Z", "primaryText", "Lcom/robinhood/utils/resource/StringResource;", "getPrimaryText", "()Lcom/robinhood/utils/resource/StringResource;", "secondaryText", "getSecondaryText", "secondaryTextStyleOverrides", "Lcom/robinhood/models/db/identi/sortinghat/TextOverrides;", "getSecondaryTextStyleOverrides", "()Lcom/robinhood/models/db/identi/sortinghat/TextOverrides;", "Standard", "Support", "Lcom/robinhood/shared/onboarding/lib/menuofoption/UiMenuOfOptionsItem$Standard;", "Lcom/robinhood/shared/onboarding/lib/menuofoption/UiMenuOfOptionsItem$Support;", "lib-menu-of-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public abstract class UiMenuOfOptionsItem {
    public static final int $stable = 0;

    public /* synthetic */ UiMenuOfOptionsItem(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String getLoggingName();

    public abstract SortingHatTypes2 getStyle();

    private UiMenuOfOptionsItem() {
    }

    /* compiled from: UiMenuOfOptionsItem.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u000f¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/shared/onboarding/lib/menuofoption/UiMenuOfOptionsItem$Standard;", "Lcom/robinhood/shared/onboarding/lib/menuofoption/UiMenuOfOptionsItem;", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Lcom/robinhood/models/db/identi/sortinghat/MenuOfOptionsItem;", "showBottomDivider", "", "<init>", "(Lcom/robinhood/models/db/identi/sortinghat/MenuOfOptionsItem;Z)V", "getItem", "()Lcom/robinhood/models/db/identi/sortinghat/MenuOfOptionsItem;", "getShowBottomDivider", "()Z", "loggingName", "", "getLoggingName", "()Ljava/lang/String;", ResourceTypes.STYLE, "Lcom/robinhood/models/api/identi/sortinghat/MenuOfOptionsItemStyle;", "getStyle", "()Lcom/robinhood/models/api/identi/sortinghat/MenuOfOptionsItemStyle;", "link", "getLink", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "lib-menu-of-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Standard extends UiMenuOfOptionsItem {
        public static final int $stable = 8;
        private final MenuOfOptionsItem item;
        private final boolean showBottomDivider;

        public static /* synthetic */ Standard copy$default(Standard standard, MenuOfOptionsItem menuOfOptionsItem, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                menuOfOptionsItem = standard.item;
            }
            if ((i & 2) != 0) {
                z = standard.showBottomDivider;
            }
            return standard.copy(menuOfOptionsItem, z);
        }

        /* renamed from: component1, reason: from getter */
        public final MenuOfOptionsItem getItem() {
            return this.item;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getShowBottomDivider() {
            return this.showBottomDivider;
        }

        public final Standard copy(MenuOfOptionsItem item, boolean showBottomDivider) {
            Intrinsics.checkNotNullParameter(item, "item");
            return new Standard(item, showBottomDivider);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Standard)) {
                return false;
            }
            Standard standard = (Standard) other;
            return Intrinsics.areEqual(this.item, standard.item) && this.showBottomDivider == standard.showBottomDivider;
        }

        public int hashCode() {
            return (this.item.hashCode() * 31) + Boolean.hashCode(this.showBottomDivider);
        }

        public String toString() {
            return "Standard(item=" + this.item + ", showBottomDivider=" + this.showBottomDivider + ")";
        }

        public final MenuOfOptionsItem getItem() {
            return this.item;
        }

        public final boolean getShowBottomDivider() {
            return this.showBottomDivider;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Standard(MenuOfOptionsItem item, boolean z) {
            super(null);
            Intrinsics.checkNotNullParameter(item, "item");
            this.item = item;
            this.showBottomDivider = z;
        }

        @Override // com.robinhood.shared.onboarding.lib.menuofoption.UiMenuOfOptionsItem
        public String getLoggingName() {
            return this.item.getLoggingName();
        }

        @Override // com.robinhood.shared.onboarding.lib.menuofoption.UiMenuOfOptionsItem
        public SortingHatTypes2 getStyle() {
            return this.item.getStyle();
        }

        public final String getLink() {
            return this.item.getLink();
        }
    }

    /* compiled from: UiMenuOfOptionsItem.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058gX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007\u0082\u0001\u0002\u000e\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/shared/onboarding/lib/menuofoption/UiMenuOfOptionsItem$Support;", "Lcom/robinhood/shared/onboarding/lib/menuofoption/UiMenuOfOptionsItem;", "<init>", "()V", "iconRes", "", "getIconRes", "()I", "primaryTextRes", "getPrimaryTextRes", "secondaryTextRes", "getSecondaryTextRes", "Retry", "HelpCenter", "Lcom/robinhood/shared/onboarding/lib/menuofoption/UiMenuOfOptionsItem$Support$HelpCenter;", "Lcom/robinhood/shared/onboarding/lib/menuofoption/UiMenuOfOptionsItem$Support$Retry;", "lib-menu-of-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class Support extends UiMenuOfOptionsItem {
        public static final int $stable = 0;

        public /* synthetic */ Support(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract int getIconRes();

        public abstract int getPrimaryTextRes();

        public abstract int getSecondaryTextRes();

        private Support() {
            super(null);
        }

        /* compiled from: UiMenuOfOptionsItem.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000f¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/shared/onboarding/lib/menuofoption/UiMenuOfOptionsItem$Support$Retry;", "Lcom/robinhood/shared/onboarding/lib/menuofoption/UiMenuOfOptionsItem$Support;", "<init>", "()V", "loggingName", "", "getLoggingName", "()Ljava/lang/String;", ResourceTypes.STYLE, "Lcom/robinhood/models/api/identi/sortinghat/MenuOfOptionsItemStyle;", "getStyle", "()Lcom/robinhood/models/api/identi/sortinghat/MenuOfOptionsItemStyle;", "iconRes", "", "getIconRes", "()I", "primaryTextRes", "getPrimaryTextRes", "secondaryTextRes", "getSecondaryTextRes", "lib-menu-of-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Retry extends Support {
            public static final int $stable = 0;
            public static final Retry INSTANCE = new Retry();

            private Retry() {
                super(null);
            }

            @Override // com.robinhood.shared.onboarding.lib.menuofoption.UiMenuOfOptionsItem
            public String getLoggingName() {
                return AnalyticsStrings.BUTTON_MENU_OF_OPTIONS_RETRY;
            }

            @Override // com.robinhood.shared.onboarding.lib.menuofoption.UiMenuOfOptionsItem
            public SortingHatTypes2 getStyle() {
                return SortingHatTypes2.FEATURED;
            }

            @Override // com.robinhood.shared.onboarding.lib.menuofoption.UiMenuOfOptionsItem.Support
            public int getIconRes() {
                return C20690R.drawable.ic_rds_recurring_24dp;
            }

            @Override // com.robinhood.shared.onboarding.lib.menuofoption.UiMenuOfOptionsItem.Support
            public int getPrimaryTextRes() {
                return C39252R.string.menu_of_options_retry_title;
            }

            @Override // com.robinhood.shared.onboarding.lib.menuofoption.UiMenuOfOptionsItem.Support
            public int getSecondaryTextRes() {
                return C39252R.string.menu_of_options_retry_description;
            }
        }

        /* compiled from: UiMenuOfOptionsItem.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000f¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/shared/onboarding/lib/menuofoption/UiMenuOfOptionsItem$Support$HelpCenter;", "Lcom/robinhood/shared/onboarding/lib/menuofoption/UiMenuOfOptionsItem$Support;", "<init>", "()V", "loggingName", "", "getLoggingName", "()Ljava/lang/String;", ResourceTypes.STYLE, "Lcom/robinhood/models/api/identi/sortinghat/MenuOfOptionsItemStyle;", "getStyle", "()Lcom/robinhood/models/api/identi/sortinghat/MenuOfOptionsItemStyle;", "iconRes", "", "getIconRes", "()I", "primaryTextRes", "getPrimaryTextRes", "secondaryTextRes", "getSecondaryTextRes", "lib-menu-of-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class HelpCenter extends Support {
            public static final int $stable = 0;
            public static final HelpCenter INSTANCE = new HelpCenter();

            private HelpCenter() {
                super(null);
            }

            @Override // com.robinhood.shared.onboarding.lib.menuofoption.UiMenuOfOptionsItem
            public String getLoggingName() {
                return AnalyticsStrings.BUTTON_MENU_OF_OPTIONS_HELP_CENTER;
            }

            @Override // com.robinhood.shared.onboarding.lib.menuofoption.UiMenuOfOptionsItem
            public SortingHatTypes2 getStyle() {
                return SortingHatTypes2.STANDARD;
            }

            @Override // com.robinhood.shared.onboarding.lib.menuofoption.UiMenuOfOptionsItem.Support
            public int getIconRes() {
                return C20690R.drawable.ic_rds_search_24dp;
            }

            @Override // com.robinhood.shared.onboarding.lib.menuofoption.UiMenuOfOptionsItem.Support
            public int getPrimaryTextRes() {
                return C39252R.string.menu_of_options_help_center_title;
            }

            @Override // com.robinhood.shared.onboarding.lib.menuofoption.UiMenuOfOptionsItem.Support
            public int getSecondaryTextRes() {
                return C39252R.string.menu_of_options_help_center_description;
            }
        }
    }

    public final int getStartIcon() {
        if (this instanceof Standard) {
            return ((Standard) this).getItem().getIcon().getResourceId();
        }
        if (this instanceof Support) {
            return ((Support) this).getIconRes();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean getShowDivider() {
        if (this instanceof Standard) {
            return ((Standard) this).getShowBottomDivider();
        }
        if (this instanceof Support) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final StringResource getPrimaryText() {
        if (this instanceof Standard) {
            return StringResource.INSTANCE.invoke(((Standard) this).getItem().getPrimaryText());
        }
        if (this instanceof Support) {
            return StringResource.INSTANCE.invoke(((Support) this).getPrimaryTextRes(), new Object[0]);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final StringResource getSecondaryText() {
        if (!(this instanceof Standard)) {
            if (this instanceof Support) {
                return StringResource.INSTANCE.invoke(((Support) this).getSecondaryTextRes(), new Object[0]);
            }
            throw new NoWhenBranchMatchedException();
        }
        String secondaryText = ((Standard) this).getItem().getSecondaryText();
        if (secondaryText != null) {
            return StringResource.INSTANCE.invoke(secondaryText);
        }
        return null;
    }

    public final TextOverrides getSecondaryTextStyleOverrides() {
        if (this instanceof Standard) {
            return ((Standard) this).getItem().getSecondaryTextStyleOverrides();
        }
        if (this instanceof Support) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
